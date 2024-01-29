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

public class ExposureRulesPage extends LoadableComponent<ExposureRulesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-9-ActionType']", AI = false)
	public WebElement inpActionType_178;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-0-Status']", AI = false)
	public WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_205;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_100;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-1-Name']", AI = false)
	public WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-3-Status']", AI = false)
	public WebElement inpStatus_51;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_88;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_143;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_204;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_109;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_25;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_40;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_86;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_45;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-1-Context']", AI = false)
	public WebElement drpTriggerEntity_16;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_44;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_161;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-9-Context']", AI = false)
	public WebElement drpTriggerEntity_176;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-0-Trigger']", AI = false)
	public WebElement drpTriggerAction;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_42;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-0-Context']", AI = false)
	public WebElement drpTriggerEntity;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-9-Trigger']", AI = false)
	public WebElement drpTriggerAction_177;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_114;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_122;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_127;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_115;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_186;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-10-Status']", AI = false)
	public WebElement inpStatus_191;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_120;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_105;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-10-Version']", AI = false)
	public WebElement inpVersion_192;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_7;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_95;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-LossTypes textarea", AI = false)
	public WebElement inpLossType_99;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_23;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_66;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_163;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_129;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RollingUpgradeAlert .gw-AlertBar--label", AI = false)
	public WebElement lblRollingUpgradeAlert;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-0-Version']", AI = false)
	public WebElement inpVersion;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_20;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-8-ActionType']", AI = false)
	public WebElement inpActionType_158;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-8-Context']", AI = false)
	public WebElement drpTriggerEntity_156;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_181;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV_tb-Filter>div[role='button']", AI = false)
	public WebElement btnFilter;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_65;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_64;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_9;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_13;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_62;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_5;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-10-Trigger']", AI = false)
	public WebElement drpTriggerAction_197;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-2-Status']", AI = false)
	public WebElement inpStatus_31;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-CCSelectedRulesAlertBar .gw-AlertBar--label", AI = false)
	public WebElement lblCCSelectedRulesAlertBar;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_135;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-5-Trigger']", AI = false)
	public WebElement drpTriggerAction_97;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_107;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_142;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_89;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-ShowHideFilter>div[role='button']", AI = false)
	public WebElement btnShowFilters;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-CreateRuleToolbarButtonSet-Clone>div[role='button']", AI = false)
	public WebElement btnClone;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_75;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-LossTypes textarea", AI = false)
	public WebElement inpLossType_79;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-BulkEdit-ExportToCsv>div[role='menuitem']", AI = false)
	public WebElement btnEditAllinSpreadsheet;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-5-Status']", AI = false)
	public WebElement inpStatus_91;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_125;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-7-Trigger']", AI = false)
	public WebElement drpTriggerAction_137;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_46;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_108;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-LossTypes textarea", AI = false)
	public WebElement inpLossType_199;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton>div[role='button']", AI = false)
	public WebElement btnDeploy;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_43;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_124;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_14;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-7-Context']", AI = false)
	public WebElement drpTriggerEntity_136;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_154;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-5-ActionType']", AI = false)
	public WebElement inpActionType_98;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_203;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_28;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton-DeployAll>div[role='menuitem']", AI = false)
	public WebElement btnDeployAll;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-4-Trigger']", AI = false)
	public WebElement drpTriggerAction_77;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-ExportSelectedToCsv>div[role='button']", AI = false)
	public WebElement btnBulkEditSelected;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-ValidationStatusToolbarInput']", AI = false)
	public WebElement inpValidationStatusToolbarInput;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-8-Status']", AI = false)
	public WebElement inpStatus_151;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_202;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-Availability']", AI = false)
	public WebElement drpAvailability;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-LossTypes textarea", AI = false)
	public WebElement inpLossType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_84;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_69;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-10-Name']", AI = false)
	public WebElement inpName_190;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-9-Name']", AI = false)
	public WebElement inpName_170;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-10-ActionType']", AI = false)
	public WebElement inpActionType_198;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-LossTypes textarea", AI = false)
	public WebElement inpLossType_59;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_145;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_200;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_6;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-4-Status']", AI = false)
	public WebElement inpStatus_71;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_68;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-5-Version']", AI = false)
	public WebElement inpVersion_92;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-IncidentTypeFilter']", AI = false)
	public WebElement drpIncidentType;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-8-Trigger']", AI = false)
	public WebElement drpTriggerAction_157;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-LossTypes textarea", AI = false)
	public WebElement inpLossType_179;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_26;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_63;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_128;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_123;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_104;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_55;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RollingUpgradeAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_103;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_134;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-PolicyTypeFilter']", AI = false)
	public WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_22;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_21;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_48;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-DisableSelectedRules>div[role='menuitem']", AI = false)
	public WebElement btnDisableSelected;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-3-Trigger']", AI = false)
	public WebElement drpTriggerAction_57;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_102;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-9-Status']", AI = false)
	public WebElement inpStatus_171;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_113;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-ExportSelected>div[role='menuitem']", AI = false)
	public WebElement btnExportSelected;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_49;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-6-Context']", AI = false)
	public WebElement drpTriggerEntity_116;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-TextFilter']", AI = false)
	public WebElement inpNameDescription;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_180;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-LossTypes textarea", AI = false)
	public WebElement inpLossType_39;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-7-Version']", AI = false)
	public WebElement inpVersion_132;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-8-Name']", AI = false)
	public WebElement inpName_150;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-5-Name']", AI = false)
	public WebElement inpName_90;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-ValidationProgressAlert .gw-AlertBar--label", AI = false)
	public WebElement lblValidationProgressAlert;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_83;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-CCSelectedRulesAlertBar-CloseBtn", AI = false)
	public WebElement btnClose_4;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-ValidationProcessFailedAlert-CloseBtn", AI = false)
	public WebElement btnClose_3;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_165;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_195;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-ValidationProgressAlert-CloseBtn", AI = false)
	public WebElement btnClose_2;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-PendingImportAlert-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-LossTypes textarea", AI = false)
	public WebElement inpLossType_159;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_189;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-4-Version']", AI = false)
	public WebElement inpVersion_72;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_148;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_35;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-JurisdictionFilter']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_74;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_27;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_164;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_201;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_41;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_73;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-5-Context']", AI = false)
	public WebElement drpTriggerEntity_96;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-3-ActionType']", AI = false)
	public WebElement inpActionType_58;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-6-Status']", AI = false)
	public WebElement inpStatus_111;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_29;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-2-Trigger']", AI = false)
	public WebElement drpTriggerAction_37;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_133;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_194;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-6-Version']", AI = false)
	public WebElement inpVersion_112;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_106;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-LossTypes textarea", AI = false)
	public WebElement inpLossType_19;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-4-Name']", AI = false)
	public WebElement inpName_70;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-7-Name']", AI = false)
	public WebElement inpName_130;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV_tb-Clear>div[role='button']", AI = false)
	public WebElement btnClear;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_185;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_8;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_93;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-3-Version']", AI = false)
	public WebElement inpVersion_52;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-6-Trigger']", AI = false)
	public WebElement drpTriggerAction_117;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton-DeploySelected>div[role='menuitem']", AI = false)
	public WebElement btnDeploySelected;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_168;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_15;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_34;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_54;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-0-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_144;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_47;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-4-Context']", AI = false)
	public WebElement drpTriggerEntity_76;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_101;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-BulkEdit>div[role='button']", AI = false)
	public WebElement btnBulkEdit;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_61;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_187;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-4-ActionType']", AI = false)
	public WebElement inpActionType_78;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-LossTypes textarea", AI = false)
	public WebElement inpLossType_139;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-7-Status']", AI = false)
	public WebElement inpStatus_131;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_153;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_174;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-CreateRuleToolbarButtonSet-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-1-Trigger']", AI = false)
	public WebElement drpTriggerAction_17;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_126;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-3-Name']", AI = false)
	public WebElement inpName_50;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-LossPartyTypeFilter']", AI = false)
	public WebElement drpLossPartyType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_140;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-6-Name']", AI = false)
	public WebElement inpName_110;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-9-Version']", AI = false)
	public WebElement inpVersion_172;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-EnableSelectedRules>div[role='menuitem']", AI = false)
	public WebElement btnEnableSelected;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-2-Version']", AI = false)
	public WebElement inpVersion_32;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-0-ActionType']", AI = false)
	public WebElement inpActionType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_183;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-PendingImportAlert .gw-AlertBar--label", AI = false)
	public WebElement lblPendingImportAlert;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-MoreButton>div[role='button']", AI = false)
	public WebElement btnMore;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_149;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_80;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_188;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-7-ActionType']", AI = false)
	public WebElement inpActionType_138;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-ExportAll>div[role='menuitem']", AI = false)
	public WebElement btnExportAll;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-1-ActionType']", AI = false)
	public WebElement inpActionType_18;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_85;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_82;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_81;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_167;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_33;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-3-Context']", AI = false)
	public WebElement drpTriggerEntity_56;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_67;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_121;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-6-LossTypes textarea", AI = false)
	public WebElement inpLossType_119;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_162;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_173;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-1-Status']", AI = false)
	public WebElement inpStatus_11;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_155;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-Import>div[role='menuitem']", AI = false)
	public WebElement btnImportfromFile;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-0-IncidentType textarea", AI = false)
	public WebElement inpIncidentType;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_146;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-2-Name']", AI = false)
	public WebElement inpName_30;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_160;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-8-Version']", AI = false)
	public WebElement inpVersion_152;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-1-Version']", AI = false)
	public WebElement inpVersion_12;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-ValidationProcessFailedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblDependentonRender;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_175;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_182;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_169;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_60;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-6-ActionType']", AI = false)
	public WebElement inpActionType_118;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_184;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-1-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_24;

	@IFindBy(how = How.CSS, using = "input[name='ExposureRules-CCRulesListScreen-RulesLV-2-ActionType']", AI = false)
	public WebElement inpActionType_38;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-2-Context']", AI = false)
	public WebElement drpTriggerEntity_36;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_94;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-7-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_141;

	@IFindBy(how = How.CSS, using = "select[name='ExposureRules-CCRulesListScreen-RulesLV-10-Context']", AI = false)
	public WebElement drpTriggerEntity_196;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_53;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_87;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_147;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_166;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-BulkEdit-ImportFromCsv>div[role='menuitem']", AI = false)
	public WebElement btnLoadfromSpreadsheet;

	@IFindBy(how = How.CSS, using = "#ExposureRules-CCRulesListScreen-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_193;


	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-1-Status']", AI = false)
	public WebElement lblStatus;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Name_button']", AI = false)
	public WebElement lblName;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Trigger']", AI = false)
	public WebElement lblTriggerAction;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Context']", AI = false)
	public WebElement lblTriggerEntity;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-ActionType']", AI = false)
	public WebElement lblActionType;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-LossPartyType']", AI = false)
	public WebElement lblLossType;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Jurisdictions']", AI = false)
	public WebElement lblJurisdictions;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-IncidentType']", AI = false)
	public WebElement lblIncidentType;
	
	@IFindBy(how = How.CSS, using = "div[id$='ExposureRuleDetail_UpLink']", AI = false)
	public WebElement btnUpToExposureRules;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteWip']", AI = false)
	public WebElement btnDelete;
	
	public String rulesNameList = "div[id$='Name_button']";

	public ExposureRulesPage(){
	}

	public ExposureRulesPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnInvalid_193))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ExposureRulesPage enterActionType_178(WebDriver driver,String ActionType_178) {
		BrowserActions.type(driver, inpActionType_178,ActionType_178, "ActionType_178");
		return this;
	}
	public ExposureRulesPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_205(WebDriver driver,String ExposureSegment_205) {
		BrowserActions.type(driver, inpExposureSegment_205,ExposureSegment_205, "ExposureSegment_205");
		return this;
	}
	public ExposureRulesPage enterPolicyType_100(WebDriver driver,String PolicyType_100) {
		BrowserActions.type(driver, inpPolicyType_100,PolicyType_100, "PolicyType_100");
		return this;
	}
	public ExposureRulesPage enterName_10(WebDriver driver,String Name_10) {
		BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
		return this;
	}
	public ExposureRulesPage enterStatus_51(WebDriver driver,String Status_51) {
		BrowserActions.type(driver, inpStatus_51,Status_51, "Status_51");
		return this;
	}
	public ExposureRulesPage clickInvalid(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid,"Invalid");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_88(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_88,"PrevExecuting_88");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_143(WebDriver driver,String Jurisdiction_143) {
		BrowserActions.type(driver, inpJurisdiction_143,Jurisdiction_143, "Jurisdiction_143");
		return this;
	}
	public ExposureRulesPage enterExposureType_204(WebDriver driver,String ExposureType_204) {
		BrowserActions.type(driver, inpExposureType_204,ExposureType_204, "ExposureType_204");
		return this;
	}
	public ExposureRulesPage clickUnknown_109(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_109,"Unknown_109");
		return this;
	}
	public ExposureRulesPage clickNotExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting,"NotExecuting");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting,"PrevExecuting");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_25(WebDriver driver,String ExposureSegment_25) {
		BrowserActions.type(driver, inpExposureSegment_25,ExposureSegment_25, "ExposureSegment_25");
		return this;
	}
	public ExposureRulesPage enterPolicyType_40(WebDriver driver,String PolicyType_40) {
		BrowserActions.type(driver, inpPolicyType_40,PolicyType_40, "PolicyType_40");
		return this;
	}
	public ExposureRulesPage clickExecuting_86(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_86,"Executing_86");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_45(WebDriver driver,String ExposureSegment_45) {
		BrowserActions.type(driver, inpExposureSegment_45,ExposureSegment_45, "ExposureSegment_45");
		return this;
	}
	public ExposureRulesPage clickValid(WebDriver driver)  {
		BrowserActions.click(driver, btnValid,"Valid");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_16(WebDriver driver,String TriggerEntity_16)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_16,TriggerEntity_16,"TriggerEntity_16");
		return this;
	}
	public ExposureRulesPage enterExposureType_44(WebDriver driver,String ExposureType_44) {
		BrowserActions.type(driver, inpExposureType_44,ExposureType_44, "ExposureType_44");
		return this;
	}
	public ExposureRulesPage enterIncidentType_161(WebDriver driver,String IncidentType_161) {
		BrowserActions.type(driver, inpIncidentType_161,IncidentType_161, "IncidentType_161");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_176(WebDriver driver,String TriggerEntity_176)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_176,TriggerEntity_176,"TriggerEntity_176");
		return this;
	}
	public ExposureRulesPage selectTriggerAction(WebDriver driver,String TriggerAction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction,TriggerAction,"TriggerAction");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_42(WebDriver driver,String LossPartyType_42) {
		BrowserActions.type(driver, inpLossPartyType_42,LossPartyType_42, "LossPartyType_42");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity(WebDriver driver,String TriggerEntity)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity,TriggerEntity,"TriggerEntity");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_177(WebDriver driver,String TriggerAction_177)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_177,TriggerAction_177,"TriggerAction_177");
		return this;
	}
	public ExposureRulesPage clickValid_114(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_114,"Valid_114");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_122(WebDriver driver,String LossPartyType_122) {
		BrowserActions.type(driver, inpLossPartyType_122,LossPartyType_122, "LossPartyType_122");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_127(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_127,"NotExecuting_127");
		return this;
	}
	public ExposureRulesPage clickUnknown_115(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_115,"Unknown_115");
		return this;
	}
	public ExposureRulesPage clickExecuting_186(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_186,"Executing_186");
		return this;
	}
	public ExposureRulesPage enterStatus_191(WebDriver driver,String Status_191) {
		BrowserActions.type(driver, inpStatus_191,Status_191, "Status_191");
		return this;
	}
	public ExposureRulesPage enterPolicyType(WebDriver driver,String PolicyType) {
		BrowserActions.type(driver, inpPolicyType,PolicyType, "PolicyType");
		return this;
	}
	public ExposureRulesPage enterJurisdiction(WebDriver driver,String Jurisdiction) {
		BrowserActions.type(driver, inpJurisdiction,Jurisdiction, "Jurisdiction");
		return this;
	}
	public ExposureRulesPage enterPolicyType_120(WebDriver driver,String PolicyType_120) {
		BrowserActions.type(driver, inpPolicyType_120,PolicyType_120, "PolicyType_120");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_105(WebDriver driver,String ExposureSegment_105) {
		BrowserActions.type(driver, inpExposureSegment_105,ExposureSegment_105, "ExposureSegment_105");
		return this;
	}
	public ExposureRulesPage enterVersion_192(WebDriver driver,String Version_192) {
		BrowserActions.type(driver, inpVersion_192,Version_192, "Version_192");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_7(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_7,"NotExecuting_7");
		return this;
	}
	public ExposureRulesPage clickUnknown_95(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_95,"Unknown_95");
		return this;
	}
	public ExposureRulesPage enterLossType_99(WebDriver driver,String LossType_99) {
		BrowserActions.type(driver, inpLossType_99,LossType_99, "LossType_99");
		return this;
	}
	public ExposureRulesPage clickUnknown(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown,"Unknown");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_23(WebDriver driver,String Jurisdiction_23) {
		BrowserActions.type(driver, inpJurisdiction_23,Jurisdiction_23, "Jurisdiction_23");
		return this;
	}
	public ExposureRulesPage clickExecuting_66(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_66,"Executing_66");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_163(WebDriver driver,String Jurisdiction_163) {
		BrowserActions.type(driver, inpJurisdiction_163,Jurisdiction_163, "Jurisdiction_163");
		return this;
	}
	public ExposureRulesPage clickUnknown_129(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_129,"Unknown_129");
		return this;
	}
	public ExposureRulesPage enterVersion(WebDriver driver,String Version) {
		BrowserActions.type(driver, inpVersion,Version, "Version");
		return this;
	}
	public ExposureRulesPage enterPolicyType_20(WebDriver driver,String PolicyType_20) {
		BrowserActions.type(driver, inpPolicyType_20,PolicyType_20, "PolicyType_20");
		return this;
	}
	public ExposureRulesPage enterActionType_158(WebDriver driver,String ActionType_158) {
		BrowserActions.type(driver, inpActionType_158,ActionType_158, "ActionType_158");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_156(WebDriver driver,String TriggerEntity_156)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_156,TriggerEntity_156,"TriggerEntity_156");
		return this;
	}
	public ExposureRulesPage enterIncidentType_181(WebDriver driver,String IncidentType_181) {
		BrowserActions.type(driver, inpIncidentType_181,IncidentType_181, "IncidentType_181");
		return this;
	}
	public ExposureRulesPage clickFilter(WebDriver driver)  {
		BrowserActions.click(driver, btnFilter,"Filter");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_65(WebDriver driver,String ExposureSegment_65) {
		BrowserActions.type(driver, inpExposureSegment_65,ExposureSegment_65, "ExposureSegment_65");
		return this;
	}
	public ExposureRulesPage enterExposureType_64(WebDriver driver,String ExposureType_64) {
		BrowserActions.type(driver, inpExposureType_64,ExposureType_64, "ExposureType_64");
		return this;
	}
	public ExposureRulesPage clickUnknown_9(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_9,"Unknown_9");
		return this;
	}
	public ExposureRulesPage clickInvalid_13(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_13,"Invalid_13");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_62(WebDriver driver,String LossPartyType_62) {
		BrowserActions.type(driver, inpLossPartyType_62,LossPartyType_62, "LossPartyType_62");
		return this;
	}
	public ExposureRulesPage clickExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting,"Executing");
		return this;
	}
	public ExposureRulesPage clickUnknown_5(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_5,"Unknown_5");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_197(WebDriver driver,String TriggerAction_197)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_197,TriggerAction_197,"TriggerAction_197");
		return this;
	}
	public ExposureRulesPage enterStatus_31(WebDriver driver,String Status_31) {
		BrowserActions.type(driver, inpStatus_31,Status_31, "Status_31");
		return this;
	}
	public ExposureRulesPage clickUnknown_135(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_135,"Unknown_135");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_97(WebDriver driver,String TriggerAction_97)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_97,TriggerAction_97,"TriggerAction_97");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_107(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_107,"NotExecuting_107");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_142(WebDriver driver,String LossPartyType_142) {
		BrowserActions.type(driver, inpLossPartyType_142,LossPartyType_142, "LossPartyType_142");
		return this;
	}
	public ExposureRulesPage clickUnknown_89(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_89,"Unknown_89");
		return this;
	}
	public ExposureRulesPage clickShowFilters(WebDriver driver)  {
		BrowserActions.click(driver, btnShowFilters,"ShowFilters");
		return this;
	}
	public ExposureRulesPage clickClone(WebDriver driver)  {
		BrowserActions.click(driver, btnClone,"Clone");
		return this;
	}
	public ExposureRulesPage clickUnknown_75(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_75,"Unknown_75");
		return this;
	}
	public ExposureRulesPage enterLossType_79(WebDriver driver,String LossType_79) {
		BrowserActions.type(driver, inpLossType_79,LossType_79, "LossType_79");
		return this;
	}
	public ExposureRulesPage clickEditAllinSpreadsheet(WebDriver driver)  {
		BrowserActions.click(driver, btnEditAllinSpreadsheet,"EditAllinSpreadsheet");
		return this;
	}
	public ExposureRulesPage enterStatus_91(WebDriver driver,String Status_91) {
		BrowserActions.type(driver, inpStatus_91,Status_91, "Status_91");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_125(WebDriver driver,String ExposureSegment_125) {
		BrowserActions.type(driver, inpExposureSegment_125,ExposureSegment_125, "ExposureSegment_125");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_137(WebDriver driver,String TriggerAction_137)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_137,TriggerAction_137,"TriggerAction_137");
		return this;
	}
	public ExposureRulesPage clickExecuting_46(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_46,"Executing_46");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_108(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_108,"PrevExecuting_108");
		return this;
	}
	public ExposureRulesPage enterLossType_199(WebDriver driver,String LossType_199) {
		BrowserActions.type(driver, inpLossType_199,LossType_199, "LossType_199");
		return this;
	}
	public ExposureRulesPage clickDeploy(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploy,"Deploy");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_43(WebDriver driver,String Jurisdiction_43) {
		BrowserActions.type(driver, inpJurisdiction_43,Jurisdiction_43, "Jurisdiction_43");
		return this;
	}
	public ExposureRulesPage enterExposureType_124(WebDriver driver,String ExposureType_124) {
		BrowserActions.type(driver, inpExposureType_124,ExposureType_124, "ExposureType_124");
		return this;
	}
	public ExposureRulesPage clickValid_14(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_14,"Valid_14");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_136(WebDriver driver,String TriggerEntity_136)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_136,TriggerEntity_136,"TriggerEntity_136");
		return this;
	}
	public ExposureRulesPage clickValid_154(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_154,"Valid_154");
		return this;
	}
	public ExposureRulesPage enterActionType_98(WebDriver driver,String ActionType_98) {
		BrowserActions.type(driver, inpActionType_98,ActionType_98, "ActionType_98");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_203(WebDriver driver,String Jurisdiction_203) {
		BrowserActions.type(driver, inpJurisdiction_203,Jurisdiction_203, "Jurisdiction_203");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_28(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_28,"PrevExecuting_28");
		return this;
	}
	public ExposureRulesPage clickDeployAll(WebDriver driver)  {
		BrowserActions.click(driver, btnDeployAll,"DeployAll");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_77(WebDriver driver,String TriggerAction_77)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_77,TriggerAction_77,"TriggerAction_77");
		return this;
	}
	public ExposureRulesPage clickBulkEditSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnBulkEditSelected,"BulkEditSelected");
		return this;
	}
	public ExposureRulesPage enterValidationStatusToolbarInput(WebDriver driver,String ValidationStatusToolbarInput) {
		BrowserActions.type(driver, inpValidationStatusToolbarInput,ValidationStatusToolbarInput, "ValidationStatusToolbarInput");
		return this;
	}
	public ExposureRulesPage enterStatus_151(WebDriver driver,String Status_151) {
		BrowserActions.type(driver, inpStatus_151,Status_151, "Status_151");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_202(WebDriver driver,String LossPartyType_202) {
		BrowserActions.type(driver, inpLossPartyType_202,LossPartyType_202, "LossPartyType_202");
		return this;
	}
	public ExposureRulesPage selectAvailability(WebDriver driver,String Availability)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAvailability,Availability,"Availability");
		return this;
	}
	public ExposureRulesPage enterLossType(WebDriver driver,String LossType) {
		BrowserActions.type(driver, inpLossType,LossType, "LossType");
		return this;
	}
	public ExposureRulesPage enterExposureType_84(WebDriver driver,String ExposureType_84) {
		BrowserActions.type(driver, inpExposureType_84,ExposureType_84, "ExposureType_84");
		return this;
	}
	public ExposureRulesPage clickUnknown_69(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_69,"Unknown_69");
		return this;
	}
	public ExposureRulesPage enterName_190(WebDriver driver,String Name_190) {
		BrowserActions.type(driver, inpName_190,Name_190, "Name_190");
		return this;
	}
	public ExposureRulesPage enterName_170(WebDriver driver,String Name_170) {
		BrowserActions.type(driver, inpName_170,Name_170, "Name_170");
		return this;
	}
	public ExposureRulesPage enterActionType_198(WebDriver driver,String ActionType_198) {
		BrowserActions.type(driver, inpActionType_198,ActionType_198, "ActionType_198");
		return this;
	}
	public ExposureRulesPage enterLossType_59(WebDriver driver,String LossType_59) {
		BrowserActions.type(driver, inpLossType_59,LossType_59, "LossType_59");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_145(WebDriver driver,String ExposureSegment_145) {
		BrowserActions.type(driver, inpExposureSegment_145,ExposureSegment_145, "ExposureSegment_145");
		return this;
	}
	public ExposureRulesPage enterPolicyType_200(WebDriver driver,String PolicyType_200) {
		BrowserActions.type(driver, inpPolicyType_200,PolicyType_200, "PolicyType_200");
		return this;
	}
	public ExposureRulesPage clickExecuting_6(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_6,"Executing_6");
		return this;
	}
	public ExposureRulesPage enterStatus_71(WebDriver driver,String Status_71) {
		BrowserActions.type(driver, inpStatus_71,Status_71, "Status_71");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_68(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_68,"PrevExecuting_68");
		return this;
	}
	public ExposureRulesPage enterVersion_92(WebDriver driver,String Version_92) {
		BrowserActions.type(driver, inpVersion_92,Version_92, "Version_92");
		return this;
	}
	public ExposureRulesPage selectIncidentType(WebDriver driver,String IncidentType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncidentType,IncidentType,"IncidentType");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_157(WebDriver driver,String TriggerAction_157)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_157,TriggerAction_157,"TriggerAction_157");
		return this;
	}
	public ExposureRulesPage enterLossType_179(WebDriver driver,String LossType_179) {
		BrowserActions.type(driver, inpLossType_179,LossType_179, "LossType_179");
		return this;
	}
	public ExposureRulesPage clickExecuting_26(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_26,"Executing_26");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_63(WebDriver driver,String Jurisdiction_63) {
		BrowserActions.type(driver, inpJurisdiction_63,Jurisdiction_63, "Jurisdiction_63");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_128(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_128,"PrevExecuting_128");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_123(WebDriver driver,String Jurisdiction_123) {
		BrowserActions.type(driver, inpJurisdiction_123,Jurisdiction_123, "Jurisdiction_123");
		return this;
	}
	public ExposureRulesPage enterExposureType_104(WebDriver driver,String ExposureType_104) {
		BrowserActions.type(driver, inpExposureType_104,ExposureType_104, "ExposureType_104");
		return this;
	}
	public ExposureRulesPage clickUnknown_55(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_55,"Unknown_55");
		return this;
	}
	public ExposureRulesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_103(WebDriver driver,String Jurisdiction_103) {
		BrowserActions.type(driver, inpJurisdiction_103,Jurisdiction_103, "Jurisdiction_103");
		return this;
	}
	public ExposureRulesPage clickValid_134(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_134,"Valid_134");
		return this;
	}
	public ExposureRulesPage selectPolicyType(WebDriver driver,String PolicyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,"PolicyType");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_22(WebDriver driver,String LossPartyType_22) {
		BrowserActions.type(driver, inpLossPartyType_22,LossPartyType_22, "LossPartyType_22");
		return this;
	}
	public ExposureRulesPage enterIncidentType_21(WebDriver driver,String IncidentType_21) {
		BrowserActions.type(driver, inpIncidentType_21,IncidentType_21, "IncidentType_21");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_48(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_48,"PrevExecuting_48");
		return this;
	}
	public ExposureRulesPage clickDisableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDisableSelected,"DisableSelected");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_57(WebDriver driver,String TriggerAction_57)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_57,TriggerAction_57,"TriggerAction_57");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_102(WebDriver driver,String LossPartyType_102) {
		BrowserActions.type(driver, inpLossPartyType_102,LossPartyType_102, "LossPartyType_102");
		return this;
	}
	public ExposureRulesPage enterStatus_171(WebDriver driver,String Status_171) {
		BrowserActions.type(driver, inpStatus_171,Status_171, "Status_171");
		return this;
	}
	public ExposureRulesPage clickInvalid_113(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_113,"Invalid_113");
		return this;
	}
	public ExposureRulesPage clickExportSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnExportSelected,"ExportSelected");
		return this;
	}
	public ExposureRulesPage enterLossPartyType(WebDriver driver,String LossPartyType) {
		BrowserActions.type(driver, inpLossPartyType,LossPartyType, "LossPartyType");
		return this;
	}
	public ExposureRulesPage clickUnknown_49(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_49,"Unknown_49");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_116(WebDriver driver,String TriggerEntity_116)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_116,TriggerEntity_116,"TriggerEntity_116");
		return this;
	}
	public ExposureRulesPage enterNameDescription(WebDriver driver,String NameDescription) {
		BrowserActions.type(driver, inpNameDescription,NameDescription, "NameDescription");
		return this;
	}
	public ExposureRulesPage enterPolicyType_180(WebDriver driver,String PolicyType_180) {
		BrowserActions.type(driver, inpPolicyType_180,PolicyType_180, "PolicyType_180");
		return this;
	}
	public ExposureRulesPage enterLossType_39(WebDriver driver,String LossType_39) {
		BrowserActions.type(driver, inpLossType_39,LossType_39, "LossType_39");
		return this;
	}
	public ExposureRulesPage enterVersion_132(WebDriver driver,String Version_132) {
		BrowserActions.type(driver, inpVersion_132,Version_132, "Version_132");
		return this;
	}
	public ExposureRulesPage enterName_150(WebDriver driver,String Name_150) {
		BrowserActions.type(driver, inpName_150,Name_150, "Name_150");
		return this;
	}
	public ExposureRulesPage enterName_90(WebDriver driver,String Name_90) {
		BrowserActions.type(driver, inpName_90,Name_90, "Name_90");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_83(WebDriver driver,String Jurisdiction_83) {
		BrowserActions.type(driver, inpJurisdiction_83,Jurisdiction_83, "Jurisdiction_83");
		return this;
	}
	public ExposureRulesPage clickClose_4(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_4,"Close_4");
		return this;
	}
	public ExposureRulesPage clickClose_3(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_3,"Close_3");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_165(WebDriver driver,String ExposureSegment_165) {
		BrowserActions.type(driver, inpExposureSegment_165,ExposureSegment_165, "ExposureSegment_165");
		return this;
	}
	public ExposureRulesPage clickUnknown_195(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_195,"Unknown_195");
		return this;
	}
	public ExposureRulesPage clickClose_2(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_2,"Close_2");
		return this;
	}
	public ExposureRulesPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public ExposureRulesPage enterLossType_159(WebDriver driver,String LossType_159) {
		BrowserActions.type(driver, inpLossType_159,LossType_159, "LossType_159");
		return this;
	}
	public ExposureRulesPage clickUnknown_189(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_189,"Unknown_189");
		return this;
	}
	public ExposureRulesPage enterVersion_72(WebDriver driver,String Version_72) {
		BrowserActions.type(driver, inpVersion_72,Version_72, "Version_72");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_148(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_148,"PrevExecuting_148");
		return this;
	}
	public ExposureRulesPage clickUnknown_35(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_35,"Unknown_35");
		return this;
	}
	public ExposureRulesPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public ExposureRulesPage clickValid_74(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_74,"Valid_74");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_27(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_27,"NotExecuting_27");
		return this;
	}
	public ExposureRulesPage enterExposureType_164(WebDriver driver,String ExposureType_164) {
		BrowserActions.type(driver, inpExposureType_164,ExposureType_164, "ExposureType_164");
		return this;
	}
	public ExposureRulesPage enterIncidentType_201(WebDriver driver,String IncidentType_201) {
		BrowserActions.type(driver, inpIncidentType_201,IncidentType_201, "IncidentType_201");
		return this;
	}
	public ExposureRulesPage enterIncidentType_41(WebDriver driver,String IncidentType_41) {
		BrowserActions.type(driver, inpIncidentType_41,IncidentType_41, "IncidentType_41");
		return this;
	}
	public ExposureRulesPage clickInvalid_73(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_73,"Invalid_73");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_96(WebDriver driver,String TriggerEntity_96)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_96,TriggerEntity_96,"TriggerEntity_96");
		return this;
	}
	public ExposureRulesPage enterActionType_58(WebDriver driver,String ActionType_58) {
		BrowserActions.type(driver, inpActionType_58,ActionType_58, "ActionType_58");
		return this;
	}
	public ExposureRulesPage enterStatus_111(WebDriver driver,String Status_111) {
		BrowserActions.type(driver, inpStatus_111,Status_111, "Status_111");
		return this;
	}
	public ExposureRulesPage clickUnknown_29(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_29,"Unknown_29");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_37(WebDriver driver,String TriggerAction_37)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_37,TriggerAction_37,"TriggerAction_37");
		return this;
	}
	public ExposureRulesPage clickInvalid_133(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_133,"Invalid_133");
		return this;
	}
	public ExposureRulesPage clickValid_194(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_194,"Valid_194");
		return this;
	}
	public ExposureRulesPage enterVersion_112(WebDriver driver,String Version_112) {
		BrowserActions.type(driver, inpVersion_112,Version_112, "Version_112");
		return this;
	}
	public ExposureRulesPage clickExecuting_106(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_106,"Executing_106");
		return this;
	}
	public ExposureRulesPage enterLossType_19(WebDriver driver,String LossType_19) {
		BrowserActions.type(driver, inpLossType_19,LossType_19, "LossType_19");
		return this;
	}
	public ExposureRulesPage enterName_70(WebDriver driver,String Name_70) {
		BrowserActions.type(driver, inpName_70,Name_70, "Name_70");
		return this;
	}
	public ExposureRulesPage enterName_130(WebDriver driver,String Name_130) {
		BrowserActions.type(driver, inpName_130,Name_130, "Name_130");
		return this;
	}
	public ExposureRulesPage clickClear(WebDriver driver)  {
		BrowserActions.click(driver, btnClear,"Clear");
		return this;
	}
	public ExposureRulesPage enterExposureType(WebDriver driver,String ExposureType) {
		BrowserActions.type(driver, inpExposureType,ExposureType, "ExposureType");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_185(WebDriver driver,String ExposureSegment_185) {
		BrowserActions.type(driver, inpExposureSegment_185,ExposureSegment_185, "ExposureSegment_185");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_8(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_8,"PrevExecuting_8");
		return this;
	}
	public ExposureRulesPage clickInvalid_93(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_93,"Invalid_93");
		return this;
	}
	public ExposureRulesPage enterExposureSegment(WebDriver driver,String ExposureSegment) {
		BrowserActions.type(driver, inpExposureSegment,ExposureSegment, "ExposureSegment");
		return this;
	}
	public ExposureRulesPage enterVersion_52(WebDriver driver,String Version_52) {
		BrowserActions.type(driver, inpVersion_52,Version_52, "Version_52");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_117(WebDriver driver,String TriggerAction_117)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_117,TriggerAction_117,"TriggerAction_117");
		return this;
	}
	public ExposureRulesPage clickDeploySelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploySelected,"DeploySelected");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_168(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_168,"PrevExecuting_168");
		return this;
	}
	public ExposureRulesPage clickUnknown_15(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_15,"Unknown_15");
		return this;
	}
	public ExposureRulesPage clickValid_34(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_34,"Valid_34");
		return this;
	}
	public ExposureRulesPage clickValid_54(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_54,"Valid_54");
		return this;
	}
	public ExposureRulesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public ExposureRulesPage enterExposureType_144(WebDriver driver,String ExposureType_144) {
		BrowserActions.type(driver, inpExposureType_144,ExposureType_144, "ExposureType_144");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_47(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_47,"NotExecuting_47");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_76(WebDriver driver,String TriggerEntity_76)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_76,TriggerEntity_76,"TriggerEntity_76");
		return this;
	}
	public ExposureRulesPage enterIncidentType_101(WebDriver driver,String IncidentType_101) {
		BrowserActions.type(driver, inpIncidentType_101,IncidentType_101, "IncidentType_101");
		return this;
	}
	public ExposureRulesPage clickBulkEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnBulkEdit,"BulkEdit");
		return this;
	}
	public ExposureRulesPage enterIncidentType_61(WebDriver driver,String IncidentType_61) {
		BrowserActions.type(driver, inpIncidentType_61,IncidentType_61, "IncidentType_61");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_187(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_187,"NotExecuting_187");
		return this;
	}
	public ExposureRulesPage enterActionType_78(WebDriver driver,String ActionType_78) {
		BrowserActions.type(driver, inpActionType_78,ActionType_78, "ActionType_78");
		return this;
	}
	public ExposureRulesPage enterLossType_139(WebDriver driver,String LossType_139) {
		BrowserActions.type(driver, inpLossType_139,LossType_139, "LossType_139");
		return this;
	}
	public ExposureRulesPage enterStatus_131(WebDriver driver,String Status_131) {
		BrowserActions.type(driver, inpStatus_131,Status_131, "Status_131");
		return this;
	}
	public ExposureRulesPage clickInvalid_153(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_153,"Invalid_153");
		return this;
	}
	public ExposureRulesPage clickValid_174(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_174,"Valid_174");
		return this;
	}
	public ExposureRulesPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public ExposureRulesPage selectTriggerAction_17(WebDriver driver,String TriggerAction_17)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_17,TriggerAction_17,"TriggerAction_17");
		return this;
	}
	public ExposureRulesPage clickExecuting_126(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_126,"Executing_126");
		return this;
	}
	public ExposureRulesPage enterName_50(WebDriver driver,String Name_50) {
		BrowserActions.type(driver, inpName_50,Name_50, "Name_50");
		return this;
	}
	public ExposureRulesPage selectLossPartyType(WebDriver driver,String LossPartyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossPartyType,LossPartyType,"LossPartyType");
		return this;
	}
	public ExposureRulesPage enterPolicyType_140(WebDriver driver,String PolicyType_140) {
		BrowserActions.type(driver, inpPolicyType_140,PolicyType_140, "PolicyType_140");
		return this;
	}
	public ExposureRulesPage enterName_110(WebDriver driver,String Name_110) {
		BrowserActions.type(driver, inpName_110,Name_110, "Name_110");
		return this;
	}
	public ExposureRulesPage enterVersion_172(WebDriver driver,String Version_172) {
		BrowserActions.type(driver, inpVersion_172,Version_172, "Version_172");
		return this;
	}
	public ExposureRulesPage clickEnableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableSelected,"EnableSelected");
		return this;
	}
	public ExposureRulesPage enterVersion_32(WebDriver driver,String Version_32) {
		BrowserActions.type(driver, inpVersion_32,Version_32, "Version_32");
		return this;
	}
	public ExposureRulesPage enterActionType(WebDriver driver,String ActionType) {
		BrowserActions.type(driver, inpActionType,ActionType, "ActionType");
		return this;
	}
	public ExposureRulesPage enterJurisdiction_183(WebDriver driver,String Jurisdiction_183) {
		BrowserActions.type(driver, inpJurisdiction_183,Jurisdiction_183, "Jurisdiction_183");
		return this;
	}
	public ExposureRulesPage clickMore(WebDriver driver)  {
		BrowserActions.click(driver, btnMore,"More");
		return this;
	}
	public ExposureRulesPage clickUnknown_149(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_149,"Unknown_149");
		return this;
	}
	public ExposureRulesPage enterPolicyType_80(WebDriver driver,String PolicyType_80) {
		BrowserActions.type(driver, inpPolicyType_80,PolicyType_80, "PolicyType_80");
		return this;
	}
	public ExposureRulesPage clickPrevExecuting_188(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_188,"PrevExecuting_188");
		return this;
	}
	public ExposureRulesPage enterActionType_138(WebDriver driver,String ActionType_138) {
		BrowserActions.type(driver, inpActionType_138,ActionType_138, "ActionType_138");
		return this;
	}
	public ExposureRulesPage clickExportAll(WebDriver driver)  {
		BrowserActions.click(driver, btnExportAll,"ExportAll");
		return this;
	}
	public ExposureRulesPage enterActionType_18(WebDriver driver,String ActionType_18) {
		BrowserActions.type(driver, inpActionType_18,ActionType_18, "ActionType_18");
		return this;
	}
	public ExposureRulesPage enterExposureSegment_85(WebDriver driver,String ExposureSegment_85) {
		BrowserActions.type(driver, inpExposureSegment_85,ExposureSegment_85, "ExposureSegment_85");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_82(WebDriver driver,String LossPartyType_82) {
		BrowserActions.type(driver, inpLossPartyType_82,LossPartyType_82, "LossPartyType_82");
		return this;
	}
	public ExposureRulesPage enterIncidentType_81(WebDriver driver,String IncidentType_81) {
		BrowserActions.type(driver, inpIncidentType_81,IncidentType_81, "IncidentType_81");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_167(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_167,"NotExecuting_167");
		return this;
	}
	public ExposureRulesPage clickInvalid_33(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_33,"Invalid_33");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_56(WebDriver driver,String TriggerEntity_56)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_56,TriggerEntity_56,"TriggerEntity_56");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_67(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_67,"NotExecuting_67");
		return this;
	}
	public ExposureRulesPage enterIncidentType_121(WebDriver driver,String IncidentType_121) {
		BrowserActions.type(driver, inpIncidentType_121,IncidentType_121, "IncidentType_121");
		return this;
	}
	public ExposureRulesPage enterLossType_119(WebDriver driver,String LossType_119) {
		BrowserActions.type(driver, inpLossType_119,LossType_119, "LossType_119");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_162(WebDriver driver,String LossPartyType_162) {
		BrowserActions.type(driver, inpLossPartyType_162,LossPartyType_162, "LossPartyType_162");
		return this;
	}
	public ExposureRulesPage clickInvalid_173(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_173,"Invalid_173");
		return this;
	}
	public ExposureRulesPage enterStatus_11(WebDriver driver,String Status_11) {
		BrowserActions.type(driver, inpStatus_11,Status_11, "Status_11");
		return this;
	}
	public ExposureRulesPage clickUnknown_155(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_155,"Unknown_155");
		return this;
	}
	public ExposureRulesPage clickImportfromFile(WebDriver driver)  {
		BrowserActions.click(driver, btnImportfromFile,"ImportfromFile");
		return this;
	}
	public ExposureRulesPage enterIncidentType(WebDriver driver,String IncidentType) {
		BrowserActions.type(driver, inpIncidentType,IncidentType, "IncidentType");
		return this;
	}
	public ExposureRulesPage clickExecuting_146(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_146,"Executing_146");
		return this;
	}
	public ExposureRulesPage enterName_30(WebDriver driver,String Name_30) {
		BrowserActions.type(driver, inpName_30,Name_30, "Name_30");
		return this;
	}
	public ExposureRulesPage enterPolicyType_160(WebDriver driver,String PolicyType_160) {
		BrowserActions.type(driver, inpPolicyType_160,PolicyType_160, "PolicyType_160");
		return this;
	}
	public ExposureRulesPage enterVersion_152(WebDriver driver,String Version_152) {
		BrowserActions.type(driver, inpVersion_152,Version_152, "Version_152");
		return this;
	}
	public ExposureRulesPage enterVersion_12(WebDriver driver,String Version_12) {
		BrowserActions.type(driver, inpVersion_12,Version_12, "Version_12");
		return this;
	}
	public ExposureRulesPage clickUnknown_175(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_175,"Unknown_175");
		return this;
	}
	public ExposureRulesPage enterLossPartyType_182(WebDriver driver,String LossPartyType_182) {
		BrowserActions.type(driver, inpLossPartyType_182,LossPartyType_182, "LossPartyType_182");
		return this;
	}
	public ExposureRulesPage clickUnknown_169(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_169,"Unknown_169");
		return this;
	}
	public ExposureRulesPage enterPolicyType_60(WebDriver driver,String PolicyType_60) {
		BrowserActions.type(driver, inpPolicyType_60,PolicyType_60, "PolicyType_60");
		return this;
	}
	public ExposureRulesPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public ExposureRulesPage enterActionType_118(WebDriver driver,String ActionType_118) {
		BrowserActions.type(driver, inpActionType_118,ActionType_118, "ActionType_118");
		return this;
	}
	public ExposureRulesPage enterExposureType_184(WebDriver driver,String ExposureType_184) {
		BrowserActions.type(driver, inpExposureType_184,ExposureType_184, "ExposureType_184");
		return this;
	}
	public ExposureRulesPage enterExposureType_24(WebDriver driver,String ExposureType_24) {
		BrowserActions.type(driver, inpExposureType_24,ExposureType_24, "ExposureType_24");
		return this;
	}
	public ExposureRulesPage enterActionType_38(WebDriver driver,String ActionType_38) {
		BrowserActions.type(driver, inpActionType_38,ActionType_38, "ActionType_38");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_36(WebDriver driver,String TriggerEntity_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_36,TriggerEntity_36,"TriggerEntity_36");
		return this;
	}
	public ExposureRulesPage clickValid_94(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_94,"Valid_94");
		return this;
	}
	public ExposureRulesPage enterIncidentType_141(WebDriver driver,String IncidentType_141) {
		BrowserActions.type(driver, inpIncidentType_141,IncidentType_141, "IncidentType_141");
		return this;
	}
	public ExposureRulesPage selectTriggerEntity_196(WebDriver driver,String TriggerEntity_196)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_196,TriggerEntity_196,"TriggerEntity_196");
		return this;
	}
	public ExposureRulesPage clickInvalid_53(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_53,"Invalid_53");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_87(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_87,"NotExecuting_87");
		return this;
	}
	public ExposureRulesPage clickNotExecuting_147(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_147,"NotExecuting_147");
		return this;
	}
	public ExposureRulesPage clickExecuting_166(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_166,"Executing_166");
		return this;
	}
	public ExposureRulesPage clickLoadfromSpreadsheet(WebDriver driver)  {
		BrowserActions.click(driver, btnLoadfromSpreadsheet,"LoadfromSpreadsheet");
		return this;
	}
	public ExposureRulesPage clickInvalid_193(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_193,"Invalid_193");
		return this;
	}
	public ExposureRulesPage verifyStatusLabel(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblStatus,"Status");
		return this;
	}

	public ExposureRulesPage verifyNameLabel(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblName,"Name ");
		return this;
	}

	public ExposureRulesPage verifyTriggerActionIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTriggerAction,"Trigger Action ");
		return this;
	}

	public ExposureRulesPage verifyTriggerEntityIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTriggerEntity,"Trigger Entity");
		return this;
	}

	public ExposureRulesPage verifyActionTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblActionType,"Trigger Action ");
		return this;
	}

	public ExposureRulesPage verifyLossTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblLossType,"Loss Type");
		return this;
	}

	public ExposureRulesPage verifyJurisdictionsIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblJurisdictions,"Jurisdictions");
		return this;
	}

	public ExposureRulesPage verifyIncidentTypesIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblIncidentType,"Incident Type");
		return this;
	}

	public ExposureRulesPage clickNameCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy,"name check box");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,"Name check box");
		return this;
	}
	
	public ExposureRulesPage clickExposureRuleNameLink(WebDriver driver,String name) {
		By activityRuleNameBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, activityRuleNameBy, "activity rule name");
		WebElement activityRuleName = activityRuleNameBy.findElement(driver);
		BrowserActions.click(driver, activityRuleName,"Exposure Rule Name Link");
		return this;
	}

	public ExposureRulesPage clickUpToExposureRules(WebDriver driver)  {
		BrowserActions.click(driver, btnUpToExposureRules,"Up to Exposure rules");
		return this;
	}

	public ExposureRulesPage verifyExposureMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTtlBar,"Main Page Title");
		return this;
	}
	public ExposureRulesPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Rule Delete Button");
		BrowserActions.confirmAlert(driver, "Are you sure you want to delete this rule?");
		return this;
	}

	public void verifyclickAddedUserNameIsNotDisplayed(WebDriver driver,String name)  {
		boolean flag = false;
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		By nameBy = By.xpath("//div[text()='"+name+"']");
		int size = BrowserActions.getWebElementSize(driver, nameBy, "name", 0.5);
		if(size == 0) {
			flag = true;
		}
		Log.softAssertThat(flag, "Exposure Rule("+name+") is deleted", "Exposure Rule("+name+") present in list is not deleted");
	}
	
	public void verifyclickAddedUserNameIsDeleted(WebDriver driver,String name)  {
		BrowserActions.waitForElementToDisplay(driver,lblName);
		By rulenameBy =By.cssSelector(rulesNameList);
		List<WebElement> nameList = BrowserActions.getWebElements(driver, rulenameBy, "name", 0.5);
		  for (WebElement listOfrules : nameList) {
		    if (listOfrules.getText().equals(name)) {
		      Log.fail("Deleted rules still exist");
		    }
		  }
		Log.message("Deleted Exposure rules not exist");
	}


	public class NewExposureRulePage extends LoadableComponent<NewExposureRulePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();


		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-TypeId']", AI = false)
		public WebElement inpTypeId;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-ConditionValidationToolbarButtonSet-ShowValidation>div[role='button']", AI = false)
		public WebElement btnShowValidationErrors;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-CoverageSubtype']", AI = false)
		public WebElement drpCoverageSubtype;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		public WebElement btnExpressionMenuIcon;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnCount;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression']", AI = false)
		public WebElement inpExpression;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		public WebElement inpOperatorLabel_13;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-AvailableToRunInputSet-Note']", AI = false)
		public WebElement inpNote;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		public WebElement inpAndOrLabel_10;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-DisplayRuleCondition']", AI = false)
		public WebElement rdbDisplayRuleConditions;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		public WebElement inpRightParensLabel_15;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleHidePrettyPrint>div[role='button']", AI = false)
		public WebElement btnHideFormattedView_8;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-DuplicatedNameAlertBar .gw-AlertBar--label", AI = false)
		public WebElement lblAnotherrulehasthesamename;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		public WebElement inpLeftParensLabel_11;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-Jurisdictions-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget_1;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedShowPrettyPrint>div[role='button']", AI = false)
		public WebElement btnShowFormattedView;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-MoveUp>div[role='button']", AI = false)
		public WebElement btnMoveUp;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-TriggeringPointKey']", AI = false)
		public WebElement drpTriggerAction;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleContextDefinitionKey']", AI = false)
		public WebElement drpTriggerEntity;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedRemove>div[role='button']", AI = false)
		public WebElement btnRemove_3;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-Add>div[role='button']", AI = false)
		public WebElement btnAddAction;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleRemove>div[role='button']", AI = false)
		public WebElement btnRemove_6;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveDown>div[role='button']", AI = false)
		public WebElement btnSimpleMoveDown;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-PolicyTypes-ApplicabilityCriteriaSingleSelectInputSet-ReadonlyDisplay']", AI = false)
		public WebElement inpPolicyType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedContextHelp>div[role='button']", AI = false)
		public WebElement btnContextHelpALTH;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-cardTab", AI = false)
		public WebElement btnParameters_19;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-NameValidationLabel", AI = false)
		public WebElement btnName;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-Remove>div[role='button']", AI = false)
		public WebElement btnRemoveAction;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-CoverageType']", AI = false)
		public WebElement drpCoverageType;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		public WebElement inpLeftOperandLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		public WebElement inpAndOrLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-variableType']", AI = false)
		public WebElement inpVariableType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnCondition;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-RuleActionKey']", AI = false)
		public WebElement drpActionType;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-AvailableToRunInputSet-Value']", AI = false)
		public WebElement rdbEnabled;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-MoveDown>div[role='button']", AI = false)
		public WebElement btnMoveDown;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-NoVariableText']", AI = false)
		public WebElement inpNovariablesdeclared;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-0-actionSequence']", AI = false)
		public WebElement inpSequence;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnYesNo;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-RuleConditionTitle", AI = false)
		public WebElement lblRuleConditionTitle;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-0-actionDescription']", AI = false)
		public WebElement inpDescription_18;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-Name']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnDate;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		public WebElement inpOperatorLabel;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariableTitle", AI = false)
		public WebElement lblRuleVariableTitle;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-cardTab", AI = false)
		public WebElement btnParameters;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-ConditionValidationToolbarButtonSet-HideValidation>div[role='button']", AI = false)
		public WebElement btnHideValidationErrors;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableDescriptionID']", AI = false)
		public WebElement inpVariableDescriptionID;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveUp>div[role='button']", AI = false)
		public WebElement btnAdvancedMoveUp;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossCauses-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbLossCause;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_17;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleManagementAuditLinkInputSet-Link", AI = false)
		public WebElement btnViewHistory;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossPartyTypes-ApplicabilityCriteriaSingleSelectInputSet-InputWidget']", AI = false)
		public WebElement drpLossPartyType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedHidePrettyPrint>div[role='button']", AI = false)
		public WebElement btnHideFormattedView;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnTypeKey;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionValidationErrors-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_20;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-Description textarea", AI = false)
		public WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-0-actionType']", AI = false)
		public WebElement inpActionType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleManagementAuditLinkInputSet-Summary", AI = false)
		public WebElement btnLastEditedbysuon04262023;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-variableDescription']", AI = false)
		public WebElement inpVariableDescription;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnTextTemplate;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		public WebElement inpLeftOperandLabel_12;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-variableName']", AI = false)
		public WebElement inpVariableName;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnSum;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-Jurisdictions-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbClaimJurisdiction;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_16;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		public WebElement inpRightParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableNameID']", AI = false)
		public WebElement inpVariableNameID;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionValidationErrors-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_21;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionValidationLabel", AI = false)
		public WebElement btnExpression;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-Update>div[role='button']", AI = false)
		public WebElement btnSave;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnField;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-IncidentTypes-ApplicabilityCriteriaSingleSelectInputSet-ReadonlyDisplay']", AI = false)
		public WebElement inpIncidentType;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossTypes-ApplicabilityCriteriaSingleSelectInputSet-ReadonlyDisplay']", AI = false)
		public WebElement inpLossType;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossCauses-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionErrorIcon", AI = false)
		public WebElement btnExpressionErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		public WebElement inpLeftParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		public WebElement inpRightOperandLabel;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedInsert>div[role='button']", AI = false)
		public WebElement btnInsert;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		public WebElement inpRightOperandLabel_14;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleInsert>div[role='button']", AI = false)
		public WebElement btnInsert_5;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ContextDescription']", AI = false)
		public WebElement inpContextDescription;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-IncidentTypes-ApplicabilityCriteriaSingleSelectInputSet-InputWidget']", AI = false)
		public WebElement drpIncidentType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnFormula;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveDown>div[role='button']", AI = false)
		public WebElement btnAdvancedMoveDown;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleShowPrettyPrint>div[role='button']", AI = false)
		public WebElement btnShowFormattedView_7;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossTypes-ApplicabilityCriteriaSingleSelectInputSet-InputWidget']", AI = false)
		public WebElement drpLossType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnLookup;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleContextHelp>div[role='button']", AI = false)
		public WebElement btnContextHelpALTH_9;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-DuplicatedNameAlertBar-CloseBtn", AI = false)
		public WebElement btnClose;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleAdd>div[role='button']", AI = false)
		public WebElement btnAdd_4;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-NameValidationErrorIcon", AI = false)
		public WebElement btnNameValidationErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedAdd>div[role='button']", AI = false)
		public WebElement btnAdd_2;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveUp>div[role='button']", AI = false)
		public WebElement btnSimpleMoveUp;

		@IFindBy(how = How.CSS, using = "select[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-PolicyTypes-ApplicabilityCriteriaSingleSelectInputSet-InputWidget']", AI = false)
		public WebElement drpPolicyType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnLastsavedvalue;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-ExpressionID']", AI = false)
		public WebElement inpExpressionID;

		@IFindBy(how = How.CSS, using = "input[name='CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossPartyTypes-ApplicabilityCriteriaSingleSelectInputSet-ReadonlyDisplay']", AI = false)
		public WebElement inpLossPartyType;

		@IFindBy(how = How.CSS, using = "#CreateExposureRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon;
		
		@IFindBy(how = How.CSS, using = "input[name$='RuleVariableLV-0-variableName']", AI = false)
		public WebElement inpRuleVariableName;

		@IFindBy(how = How.CSS, using = "input[name$='RuleVariableLV-0-variableDescription']", AI = false)
		public WebElement inpRuleVariableDescription;

		@IFindBy(how = How.CSS, using = "input[name$='VariableExpressionFragCell-Expression']", AI = false)
		public WebElement inpRuleVariableExpression;


		public NewExposureRulePage(){
		}

		public NewExposureRulePage(WebDriver driver) {
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnValidationErrorIcon))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public NewExposureRulePage enterTypeId(WebDriver driver,String TypeId) {
			BrowserActions.type(driver, inpTypeId,TypeId, "TypeId");
			return this;
		}
		public NewExposureRulePage clickShowValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnShowValidationErrors,"ShowValidationErrors");
			return this;
		}
		public NewExposureRulePage selectCoverageSubtype(WebDriver driver,String CoverageSubtype)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCoverageSubtype,CoverageSubtype,"CoverageSubtype");
			return this;
		}
		public NewExposureRulePage clickExpressionMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon,"ExpressionMenuIcon");
			return this;
		}
		public NewExposureRulePage clickCount(WebDriver driver)  {
			BrowserActions.click(driver, btnCount,"Count");
			return this;
		}
		public NewExposureRulePage enterExpression(WebDriver driver,String Expression) {
			BrowserActions.type(driver, inpExpression,Expression, "Expression");
			return this;
		}
		public NewExposureRulePage enterOperatorLabel_13(WebDriver driver,String OperatorLabel_13) {
			BrowserActions.type(driver, inpOperatorLabel_13,OperatorLabel_13, "OperatorLabel_13");
			return this;
		}
		public NewExposureRulePage enterNote(WebDriver driver,String Note) {
			BrowserActions.type(driver, inpNote,Note, "Note");
			return this;
		}
		public NewExposureRulePage enterAndOrLabel_10(WebDriver driver,String AndOrLabel_10) {
			BrowserActions.type(driver, inpAndOrLabel_10,AndOrLabel_10, "AndOrLabel_10");
			return this;
		}
		public NewExposureRulePage clickDisplayRuleConditions(WebDriver driver)  {
			BrowserActions.click(driver, rdbDisplayRuleConditions,"DisplayRuleConditions");
			return this;
		}
		public NewExposureRulePage enterRightParensLabel_15(WebDriver driver,String RightParensLabel_15) {
			BrowserActions.type(driver, inpRightParensLabel_15,RightParensLabel_15, "RightParensLabel_15");
			return this;
		}
		public NewExposureRulePage clickHideFormattedView_8(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView_8,"HideFormattedView_8");
			return this;
		}
		public NewExposureRulePage enterLeftParensLabel_11(WebDriver driver,String LeftParensLabel_11) {
			BrowserActions.type(driver, inpLeftParensLabel_11,LeftParensLabel_11, "LeftParensLabel_11");
			return this;
		}
		public NewExposureRulePage selectInputWidget_1(WebDriver driver,String InputWidget_1)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_1,InputWidget_1,"InputWidget_1");
			return this;
		}
		public NewExposureRulePage clickShowFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView,"ShowFormattedView");
			return this;
		}
		public NewExposureRulePage clickMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnMoveUp,"MoveUp");
			return this;
		}
		public NewExposureRulePage selectTriggerAction(WebDriver driver,String TriggerAction)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction,TriggerAction,"TriggerAction");
			return this;
		}
		public NewExposureRulePage selectTriggerEntity(WebDriver driver,String TriggerEntity)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity,TriggerEntity,"TriggerEntity");
			return this;
		}
		public NewExposureRulePage clickRemove_3(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_3,"Remove_3");
			return this;
		}
		public NewExposureRulePage clickAddAction(WebDriver driver)  {
			BrowserActions.click(driver, btnAddAction,"AddAction");
			return this;
		}
		public NewExposureRulePage clickRemove_6(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_6,"Remove_6");
			return this;
		}
		public NewExposureRulePage clickSimpleMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveDown,"SimpleMoveDown");
			return this;
		}
		public NewExposureRulePage enterPolicyType(WebDriver driver,String PolicyType) {
			BrowserActions.type(driver, inpPolicyType,PolicyType, "PolicyType");
			return this;
		}
		public NewExposureRulePage clickContextHelpALTH(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH,"ContextHelpALTH");
			return this;
		}
		public NewExposureRulePage clickParameters_19(WebDriver driver)  {
			BrowserActions.click(driver, btnParameters_19,"Parameters_19");
			return this;
		}
		public NewExposureRulePage clickName(WebDriver driver)  {
			BrowserActions.click(driver, btnName,"Name");
			return this;
		}
		public NewExposureRulePage clickRemoveAction(WebDriver driver)  {
			BrowserActions.click(driver, btnRemoveAction,"RemoveAction");
			return this;
		}
		public NewExposureRulePage selectCoverageType(WebDriver driver,String CoverageType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCoverageType,CoverageType,"CoverageType");
			return this;
		}
		public NewExposureRulePage enterLeftOperandLabel(WebDriver driver,String LeftOperandLabel) {
			BrowserActions.type(driver, inpLeftOperandLabel,LeftOperandLabel, "LeftOperandLabel");
			return this;
		}
		public NewExposureRulePage enterAndOrLabel(WebDriver driver,String AndOrLabel) {
			BrowserActions.type(driver, inpAndOrLabel,AndOrLabel, "AndOrLabel");
			return this;
		}
		public NewExposureRulePage enterVariableType(WebDriver driver,String VariableType) {
			BrowserActions.type(driver, inpVariableType,VariableType, "VariableType");
			return this;
		}
		public NewExposureRulePage clickCondition(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition,"Condition");
			return this;
		}
		public NewExposureRulePage selectActionType(WebDriver driver,String ActionType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpActionType,ActionType,"ActionType");
			return this;
		}
		public NewExposureRulePage clickEnabled(WebDriver driver)  {
			BrowserActions.click(driver, rdbEnabled,"Enabled");
			return this;
		}
		public NewExposureRulePage clickMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnMoveDown,"MoveDown");
			return this;
		}
		public NewExposureRulePage enterNovariablesdeclared(WebDriver driver,String Novariablesdeclared) {
			BrowserActions.type(driver, inpNovariablesdeclared,Novariablesdeclared, "Novariablesdeclared");
			return this;
		}
		public NewExposureRulePage enterSequence(WebDriver driver,String Sequence) {
			BrowserActions.type(driver, inpSequence,Sequence, "Sequence");
			return this;
		}
		public NewExposureRulePage clickYesNo(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo,"YesNo");
			return this;
		}
		public NewExposureRulePage enterDescription_18(WebDriver driver,String Description_18) {
			BrowserActions.type(driver, inpDescription_18,Description_18, "Description_18");
			return this;
		}
		public NewExposureRulePage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewExposureRulePage clickDate(WebDriver driver)  {
			BrowserActions.click(driver, btnDate,"Date");
			return this;
		}
		public NewExposureRulePage enterOperatorLabel(WebDriver driver,String OperatorLabel) {
			BrowserActions.type(driver, inpOperatorLabel,OperatorLabel, "OperatorLabel");
			return this;
		}
		public NewExposureRulePage clickLabel(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel,"Label");
			return this;
		}
		public NewExposureRulePage clickParameters(WebDriver driver)  {
			BrowserActions.click(driver, btnParameters,"Parameters");
			return this;
		}
		public NewExposureRulePage clickHideValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnHideValidationErrors,"HideValidationErrors");
			return this;
		}
		public NewExposureRulePage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public NewExposureRulePage enterVariableDescriptionID(WebDriver driver,String VariableDescriptionID) {
			BrowserActions.type(driver, inpVariableDescriptionID,VariableDescriptionID, "VariableDescriptionID");
			return this;
		}
		public NewExposureRulePage clickAdvancedMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveUp,"AdvancedMoveUp");
			return this;
		}
		public NewExposureRulePage clickLossCause(WebDriver driver)  {
			BrowserActions.click(driver, rdbLossCause,"LossCause");
			return this;
		}
		public NewExposureRulePage clickLabel_17(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_17,"Label_17");
			return this;
		}
		public NewExposureRulePage clickViewHistory(WebDriver driver)  {
			BrowserActions.click(driver, btnViewHistory,"ViewHistory");
			return this;
		}
		public NewExposureRulePage selectLossPartyType(WebDriver driver,String LossPartyType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLossPartyType,LossPartyType,"LossPartyType");
			return this;
		}
		public NewExposureRulePage clickHideFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView,"HideFormattedView");
			return this;
		}
		public NewExposureRulePage clickTypeKey(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey,"TypeKey");
			return this;
		}
		public NewExposureRulePage clickValidationErrorIcon_20(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_20,"ValidationErrorIcon_20");
			return this;
		}
		public NewExposureRulePage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public NewExposureRulePage enterActionType(WebDriver driver,String ActionType) {
			BrowserActions.type(driver, inpActionType,ActionType, "ActionType");
			return this;
		}
		public NewExposureRulePage clickLastEditedbysuon04262023(WebDriver driver)  {
			BrowserActions.click(driver, btnLastEditedbysuon04262023,"LastEditedbysuon04262023");
			return this;
		}
		public NewExposureRulePage enterVariableDescription(WebDriver driver,String VariableDescription) {
			BrowserActions.type(driver, inpVariableDescription,VariableDescription, "VariableDescription");
			return this;
		}
		public NewExposureRulePage clickTextTemplate(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate,"TextTemplate");
			return this;
		}
		public NewExposureRulePage enterLeftOperandLabel_12(WebDriver driver,String LeftOperandLabel_12) {
			BrowserActions.type(driver, inpLeftOperandLabel_12,LeftOperandLabel_12, "LeftOperandLabel_12");
			return this;
		}
		public NewExposureRulePage enterVariableName(WebDriver driver,String VariableName) {
			BrowserActions.type(driver, inpVariableName,VariableName, "VariableName");
			return this;
		}
		public NewExposureRulePage clickSum(WebDriver driver)  {
			BrowserActions.click(driver, btnSum,"Sum");
			return this;
		}
		public NewExposureRulePage clickClaimJurisdiction(WebDriver driver)  {
			BrowserActions.click(driver, rdbClaimJurisdiction,"ClaimJurisdiction");
			return this;
		}
		public NewExposureRulePage clickValidationErrorIcon_16(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_16,"ValidationErrorIcon_16");
			return this;
		}
		public NewExposureRulePage enterRightParensLabel(WebDriver driver,String RightParensLabel) {
			BrowserActions.type(driver, inpRightParensLabel,RightParensLabel, "RightParensLabel");
			return this;
		}
		public NewExposureRulePage enterVariableNameID(WebDriver driver,String VariableNameID) {
			BrowserActions.type(driver, inpVariableNameID,VariableNameID, "VariableNameID");
			return this;
		}
		public NewExposureRulePage clickLabel_21(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_21,"Label_21");
			return this;
		}
		public NewExposureRulePage clickExpression(WebDriver driver)  {
			BrowserActions.click(driver, btnExpression,"Expression");
			return this;
		}
		public NewExposureRulePage clickSave(WebDriver driver)  {
			BrowserActions.click(driver, btnSave,"Save");
			return this;
		}
		public NewExposureRulePage clickField(WebDriver driver)  {
			BrowserActions.click(driver, btnField,"Field");
			return this;
		}
		public NewExposureRulePage enterIncidentType(WebDriver driver,String IncidentType) {
			BrowserActions.type(driver, inpIncidentType,IncidentType, "IncidentType");
			return this;
		}
		public NewExposureRulePage enterLossType(WebDriver driver,String LossType) {
			BrowserActions.type(driver, inpLossType,LossType, "LossType");
			return this;
		}
		public NewExposureRulePage selectInputWidget(WebDriver driver,String InputWidget)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget,InputWidget,"InputWidget");
			return this;
		}
		public NewExposureRulePage clickExpressionErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionErrorIcon,"ExpressionErrorIcon");
			return this;
		}
		public NewExposureRulePage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewExposureRulePage enterLeftParensLabel(WebDriver driver,String LeftParensLabel) {
			BrowserActions.type(driver, inpLeftParensLabel,LeftParensLabel, "LeftParensLabel");
			return this;
		}
		public NewExposureRulePage enterRightOperandLabel(WebDriver driver,String RightOperandLabel) {
			BrowserActions.type(driver, inpRightOperandLabel,RightOperandLabel, "RightOperandLabel");
			return this;
		}
		public NewExposureRulePage clickInsert(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert,"Insert");
			return this;
		}
		public NewExposureRulePage enterRightOperandLabel_14(WebDriver driver,String RightOperandLabel_14) {
			BrowserActions.type(driver, inpRightOperandLabel_14,RightOperandLabel_14, "RightOperandLabel_14");
			return this;
		}
		public NewExposureRulePage clickInsert_5(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert_5,"Insert_5");
			return this;
		}
		public NewExposureRulePage enterContextDescription(WebDriver driver,String ContextDescription) {
			BrowserActions.type(driver, inpContextDescription,ContextDescription, "ContextDescription");
			return this;
		}
		public NewExposureRulePage selectIncidentType(WebDriver driver,String IncidentType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpIncidentType,IncidentType,1,"IncidentType");
			return this;
		}
		public NewExposureRulePage clickFormula(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula,"Formula");
			return this;
		}
		public NewExposureRulePage clickAdvancedMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveDown,"AdvancedMoveDown");
			return this;
		}
		public NewExposureRulePage clickShowFormattedView_7(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView_7,"ShowFormattedView_7");
			return this;
		}
		public NewExposureRulePage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewExposureRulePage selectLossType(WebDriver driver,String LossType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLossType,LossType,"LossType");
			return this;
		}
		public NewExposureRulePage clickLookup(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup,"Lookup");
			return this;
		}
		public NewExposureRulePage clickContextHelpALTH_9(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH_9,"ContextHelpALTH_9");
			return this;
		}
		public NewExposureRulePage clickClose(WebDriver driver)  {
			BrowserActions.click(driver, btnClose,"Close");
			return this;
		}
		public NewExposureRulePage clickAdd_4(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_4,"Add_4");
			return this;
		}
		public NewExposureRulePage clickNameValidationErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnNameValidationErrorIcon,"NameValidationErrorIcon");
			return this;
		}
		public NewExposureRulePage clickAdd_2(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_2,"Add_2");
			return this;
		}
		public NewExposureRulePage clickSimpleMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveUp,"SimpleMoveUp");
			return this;
		}
		public NewExposureRulePage selectPolicyType(WebDriver driver,String PolicyType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,1,"PolicyType");
			return this;
		}
		public NewExposureRulePage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewExposureRulePage clickLastsavedvalue(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue,"Lastsavedvalue");
			return this;
		}
		public NewExposureRulePage enterExpressionID(WebDriver driver,String ExpressionID) {
			BrowserActions.type(driver, inpExpressionID,ExpressionID, "ExpressionID");
			return this;
		}
		public NewExposureRulePage enterLossPartyType(WebDriver driver,String LossPartyType) {
			BrowserActions.type(driver, inpLossPartyType,LossPartyType, "LossPartyType");
			return this;
		}
		public NewExposureRulePage clickValidationErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon,"ValidationErrorIcon");
			return this;
		}
		
		public NewExposureRulePage enterRuleVariableName(WebDriver driver,String ruleName) {
			BrowserActions.type(driver, inpRuleVariableName,ruleName, "Rule Name");
			return this;
		}

		public NewExposureRulePage enterRuleVariableDescription(WebDriver driver,String ruleDescription) {
			BrowserActions.type(driver, inpRuleVariableDescription,ruleDescription, "Rule Description");
			return this;
		}

		public NewExposureRulePage enterRuleVariableExpression(WebDriver driver,String ruleVariableExpression) {
			BrowserActions.type(driver, inpRuleVariableExpression,ruleVariableExpression, "Rule Variable Expression");
			return this;
		}

	}

}
