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

public class UnderwritingRulesPage extends LoadableComponent<UnderwritingRulesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-0-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_301;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_351;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_257;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_345;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-3-Status']", AI = false)
	private WebElement inpStatus_43;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_223;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_294;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_105;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_65;

	@IFindBy(how = How.CSS, using = "#UWRules-PCSelectedRulesAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblPCSelectedRulesAlertBar;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_86;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_121;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_361;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_233;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_111;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_182;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_239;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-4-Status']", AI = false)
	private WebElement inpStatus_59;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_241;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-0-CheckingSet']", AI = false)
	private WebElement drpCheckingSet;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_70;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_129;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_19;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_369;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-19-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_308;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_205;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_367;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_81;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_328;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-0-Version']", AI = false)
	private WebElement inpVersion;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_249;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_127;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_198;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_273;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-2-Status']", AI = false)
	private WebElement inpStatus_27;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_200;

	@IFindBy(how = How.CSS, using = "#UWRules-EmptyDV_tb-Filter>div[role='button']", AI = false)
	private WebElement btnFilter;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-12-Version']", AI = false)
	private WebElement inpVersion_188;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_306;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_143;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_317;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_383;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_35;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_54;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_377;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_145;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_255;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_385;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_312;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_137;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_97;

	@IFindBy(how = How.CSS, using = "#UWRules-CreateRuleToolbarButtonSet-Clone>div[role='button']", AI = false)
	private WebElement btnClone;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-6-Status']", AI = false)
	private WebElement inpStatus_91;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_349;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_109;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-18-Status']", AI = false)
	private WebElement inpStatus_283;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_221;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_303;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_104;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_344;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_337;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-12-Name']", AI = false)
	private WebElement inpName_186;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_51;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-10-Status']", AI = false)
	private WebElement inpStatus_155;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_321;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-ValidationStatusToolbarInput']", AI = false)
	private WebElement inpValidationStatusToolbarInput;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_216;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_38;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_313;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_333;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_319;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-SearchCriteriaPanelRef-UWRuleFilterCriteriaDV-Availability']", AI = false)
	private WebElement drpAvailability;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_209;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-5-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_85;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-11-Name']", AI = false)
	private WebElement inpName_170;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_125;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-19-Name']", AI = false)
	private WebElement inpName_298;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_22;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_67;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-12-Status']", AI = false)
	private WebElement inpStatus_187;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_201;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_113;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_248;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_353;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_365;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_329;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_207;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_120;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_360;

	@IFindBy(how = How.CSS, using = "#UWRules-RollingUpgradeAlert-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-18-Name']", AI = false)
	private WebElement inpName_282;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_237;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-19-Status']", AI = false)
	private WebElement inpStatus_299;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-5-Status']", AI = false)
	private WebElement inpStatus_75;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_225;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_14;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_217;

	@IFindBy(how = How.CSS, using = "#UWRules-MoreButton-RuleListMoreButtonMenuItemSet-DisableSelectedRules>div[role='menuitem']", AI = false)
	private WebElement btnDisableSelected;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-11-Status']", AI = false)
	private WebElement inpStatus_171;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_335;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_232;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_64;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_31;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-6-Name']", AI = false)
	private WebElement inpName_90;

	@IFindBy(how = How.CSS, using = "#UWRules-ValidationProgressAlert .gw-AlertBar--label", AI = false)
	private WebElement lblValidationProgressAlert;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-5-Version']", AI = false)
	private WebElement inpVersion_76;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_83;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_191;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_258;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_130;

	@IFindBy(how = How.CSS, using = "#UWRules-PCSelectedRulesAlertBar-CloseBtn", AI = false)
	private WebElement btnClose_4;

	@IFindBy(how = How.CSS, using = "#UWRules-ValidationProcessFailedAlert-CloseBtn", AI = false)
	private WebElement btnClose_3;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-8-Status']", AI = false)
	private WebElement inpStatus_123;

	@IFindBy(how = How.CSS, using = "#UWRules-ValidationProgressAlert-CloseBtn", AI = false)
	private WebElement btnClose_2;

	@IFindBy(how = How.CSS, using = "#UWRules-PendingImportAlert-CloseBtn", AI = false)
	private WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-23-Status']", AI = false)
	private WebElement inpStatus_363;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-23-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_372;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-2-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_37;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-8-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_132;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_264;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-SearchCriteriaPanelRef-UWRuleFilterCriteriaDV-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_214;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_23;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-15-Status']", AI = false)
	private WebElement inpStatus_235;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_242;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_370;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_99;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_136;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-4-Version']", AI = false)
	private WebElement inpVersion_60;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-15-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_244;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_376;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_342;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_102;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_25;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-5-Name']", AI = false)
	private WebElement inpName_74;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_280;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_39;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_199;

	@IFindBy(how = How.CSS, using = "#UWRules-EmptyDV_tb-Clear>div[role='button']", AI = false)
	private WebElement btnClear;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_274;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-17-Status']", AI = false)
	private WebElement inpStatus_267;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_162;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_230;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_168;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-17-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_276;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-3-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_53;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_358;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-1-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_20;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_15;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_118;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-3-Version']", AI = false)
	private WebElement inpVersion_44;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_146;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-9-Status']", AI = false)
	private WebElement inpStatus_139;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-24-Status']", AI = false)
	private WebElement inpStatus_379;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_183;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_307;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_386;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-16-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_260;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-16-Status']", AI = false)
	private WebElement inpStatus_251;

	@IFindBy(how = How.CSS, using = "#UWRules-CreateRuleToolbarButtonSet-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-4-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_69;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_246;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-24-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_388;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_152;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_48;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-9-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_148;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_208;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_338;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_271;

	@IFindBy(how = How.CSS, using = "#UWRules-MoreButton-RuleListMoreButtonMenuItemSet-EnableSelectedRules>div[role='menuitem']", AI = false)
	private WebElement btnEnableSelected;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_320;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-4-Name']", AI = false)
	private WebElement inpName_58;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_55;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-13-Status']", AI = false)
	private WebElement inpStatus_203;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_295;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_153;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_210;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_265;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_177;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_374;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_134;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-13-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_212;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_184;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-3-Name']", AI = false)
	private WebElement inpName_42;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-2-Version']", AI = false)
	private WebElement inpVersion_28;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_161;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_167;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_281;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_322;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-SearchCriteriaPanelRef-UWRuleFilterCriteriaDV-PolicyLine']", AI = false)
	private WebElement drpPolicyLine;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-20-Status']", AI = false)
	private WebElement inpStatus_315;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_71;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_289;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_262;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_159;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_296;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-20-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_324;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_304;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-1-Version']", AI = false)
	private WebElement inpVersion_12;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_354;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_80;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-7-Status']", AI = false)
	private WebElement inpStatus_107;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_114;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_193;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-22-Status']", AI = false)
	private WebElement inpStatus_347;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_297;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_175;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_151;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_169;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_150;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_287;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_279;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-SearchCriteriaPanelRef-UWRuleFilterCriteriaDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-22-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_356;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_278;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-7-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_116;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_96;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_226;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-14-Status']", AI = false)
	private WebElement inpStatus_219;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-2-Name']", AI = false)
	private WebElement inpName_26;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_87;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_263;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_185;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-21-Status']", AI = false)
	private WebElement inpStatus_331;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-21-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_340;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-6-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_100;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_166;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-1-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_21;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-14-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_228;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-20-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_325;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_128;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_82;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_135;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_259;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_375;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-20-Name']", AI = false)
	private WebElement inpName_314;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_368;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-1-Name']", AI = false)
	private WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_190;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_88;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_240;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_387;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-5-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_84;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_112;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_352;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_371;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_131;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_247;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_72;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-13-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_213;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_7;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_95;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-19-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_309;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_231;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_66;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_224;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_163;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_119;

	@IFindBy(how = How.CSS, using = "#UWRules-RollingUpgradeAlert .gw-AlertBar--label", AI = false)
	private WebElement lblRollingUpgradeAlert;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_359;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_9;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_13;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_147;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_343;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_50;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_5;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_336;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_275;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_103;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_89;

	@IFindBy(how = How.CSS, using = "#UWRules-ShowHideFilter>div[role='button']", AI = false)
	private WebElement btnShowFilters;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_73;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_178;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_288;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_339;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_270;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-18-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_292;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_215;

	@IFindBy(how = How.CSS, using = "#UWRules-DeployRulesToolbarButtonSet-DeployButton>div[role='button']", AI = false)
	private WebElement btnDeploy;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_40;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_160;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_79;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-13-Version']", AI = false)
	private WebElement inpVersion_204;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-0-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_16;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-15-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_245;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_32;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_63;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_323;

	@IFindBy(how = How.CSS, using = "#UWRules-DeployRulesToolbarButtonSet-DeployButton-DeployAll>div[role='menuitem']", AI = false)
	private WebElement btnDeployAll;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_327;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_272;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-2-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_36;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_211;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-10-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_164;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_290;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-23-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_373;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-8-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_133;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-20-Version']", AI = false)
	private WebElement inpVersion_316;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_382;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_142;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-14-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_229;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_144;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	private WebElement btnNotExecuting_311;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_355;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_6;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_115;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_384;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-6-Version']", AI = false)
	private WebElement inpVersion_92;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-4-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_68;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-12-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_196;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_243;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_57;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_310;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-21-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_341;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-6-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_101;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-19-Version']", AI = false)
	private WebElement inpVersion_300;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_174;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-7-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_117;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_41;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_158;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_98;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_227;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_256;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-11-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_180;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_194;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_56;

	@IFindBy(how = How.CSS, using = "#UWRules-MoreButton-RuleListMoreButtonMenuItemSet-ExportSelected>div[role='menuitem']", AI = false)
	private WebElement btnExportSelected;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_286;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-3-CheckingSet']", AI = false)
	private WebElement drpCheckingSet_52;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	private WebElement btnUnknown_47;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	private WebElement btnExecuting_326;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-22-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_357;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-16-Version']", AI = false)
	private WebElement inpVersion_252;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-SearchCriteriaPanelRef-UWRuleFilterCriteriaDV-TextFilter']", AI = false)
	private WebElement inpNameDescription;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-10-Name']", AI = false)
	private WebElement inpName_154;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-17-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_269;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-24-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_381;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_141;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_110;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-10-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_165;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-8-Version']", AI = false)
	private WebElement inpVersion_124;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-22-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_350;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-23-Version']", AI = false)
	private WebElement inpVersion_364;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-21-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_334;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-17-Name']", AI = false)
	private WebElement inpName_266;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_77;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_192;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_30;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_253;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-18-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_293;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-14-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_222;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-15-Version']", AI = false)
	private WebElement inpVersion_236;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-9-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_149;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_126;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-16-Name']", AI = false)
	private WebElement inpName_250;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-FilteredInput']", AI = false)
	private WebElement inpFilteredInput;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-24-Name']", AI = false)
	private WebElement inpName_378;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-9-Name']", AI = false)
	private WebElement inpName_138;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_8;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	private WebElement btnPrevExecuting_24;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_93;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_46;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_285;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-0-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-16-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_261;

	@IFindBy(how = How.CSS, using = "#UWRules-DeployRulesToolbarButtonSet-DeployButton-DeploySelected>div[role='menuitem']", AI = false)
	private WebElement btnDeploySelected;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-16-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_254;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-22-Version']", AI = false)
	private WebElement inpVersion_348;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-7-Version']", AI = false)
	private WebElement inpVersion_108;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-24-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_389;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-14-Version']", AI = false)
	private WebElement inpVersion_220;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-15-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_238;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-23-Name']", AI = false)
	private WebElement inpName_362;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-8-Name']", AI = false)
	private WebElement inpName_122;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	private WebElement btnValid_176;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_157;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-23-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_366;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-17-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_277;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_305;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-21-Version']", AI = false)
	private WebElement inpVersion_332;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_17;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-19-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_302;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_29;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-11-Version']", AI = false)
	private WebElement inpVersion_172;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_179;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-15-Name']", AI = false)
	private WebElement inpName_234;

	@IFindBy(how = How.CSS, using = "#UWRules-PendingImportAlert .gw-AlertBar--label", AI = false)
	private WebElement lblPendingImportAlert;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_62;

	@IFindBy(how = How.CSS, using = "#UWRules-MoreButton>div[role='button']", AI = false)
	private WebElement btnMore;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_189;

	@IFindBy(how = How.CSS, using = "#UWRules-MoreButton-RuleListMoreButtonMenuItemSet-ExportAll>div[role='menuitem']", AI = false)
	private WebElement btnExportAll;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-18-Version']", AI = false)
	private WebElement inpVersion_284;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-22-Name']", AI = false)
	private WebElement inpName_346;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-7-Name']", AI = false)
	private WebElement inpName_106;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_34;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_78;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-11-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_173;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-1-Status']", AI = false)
	private WebElement inpStatus_11;

	@IFindBy(how = How.CSS, using = "#UWRules-MoreButton-RuleListMoreButtonMenuItemSet-Import>div[role='menuitem']", AI = false)
	private WebElement btnImportfromFile;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-2-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_33;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-10-Version']", AI = false)
	private WebElement inpVersion_156;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-SearchCriteriaPanelRef-UWRuleFilterCriteriaDV-PolicyTransaction']", AI = false)
	private WebElement drpPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-18-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_291;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-13-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_206;

	@IFindBy(how = How.CSS, using = "#UWRules-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-21-Name']", AI = false)
	private WebElement inpName_330;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_45;

	@IFindBy(how = How.CSS, using = "#UWRules-ValidationProcessFailedAlert .gw-AlertBar--label", AI = false)
	private WebElement lblDependentonRender;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-14-Name']", AI = false)
	private WebElement inpName_218;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-11-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_181;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-17-Version']", AI = false)
	private WebElement inpVersion_268;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-20-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_318;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-24-Version']", AI = false)
	private WebElement inpVersion_380;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-3-PolicyTransactions textarea", AI = false)
	private WebElement inpPolicyTransaction_49;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-9-Version']", AI = false)
	private WebElement inpVersion_140;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-ExternallyManaged", AI = false)
	private WebElement btnExternallyManaged_94;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-13-Name']", AI = false)
	private WebElement inpName_202;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	private WebElement btnInvalid_61;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-12-Jurisdictions textarea", AI = false)
	private WebElement inpJurisdiction_195;

	@IFindBy(how = How.CSS, using = "#UWRules-RulesLV-1-PolicyLine textarea", AI = false)
	private WebElement inpPolicyLine_18;

	@IFindBy(how = How.CSS, using = "select[name='UWRules-RulesLV-12-BlockingPoint']", AI = false)
	private WebElement drpBlockingPoint_197;

	@IFindBy(how = How.CSS, using = "div[id$='next']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	private WebElement lblLastPageNo; 

	public UnderwritingRulesPage(){
	}

	public UnderwritingRulesPage(WebDriver driver){
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
	}public UnderwritingRulesPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_301(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_301,"Invalid_301");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_351(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_351,"Unknown_351");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_257(WebDriver driver,String PolicyTransaction_257) {
		BrowserActions.type(driver, inpPolicyTransaction_257,PolicyTransaction_257, "PolicyTransaction_257");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_345(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_345,"Unknown_345");
		return this;
	}
	public UnderwritingRulesPage enterStatus_43(WebDriver driver,String Status_43) {
		BrowserActions.type(driver, inpStatus_43,Status_43, "Status_43");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_223(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_223,"Unknown_223");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_294(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_294,"Executing_294");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_105(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_105,"Unknown_105");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_65(WebDriver driver,String PolicyTransaction_65) {
		BrowserActions.type(driver, inpPolicyTransaction_65,PolicyTransaction_65, "PolicyTransaction_65");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting,"NotExecuting");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_86(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_86,"Executing_86");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_121(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_121,"Unknown_121");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_361(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_361,"Unknown_361");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_233(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_233,"Unknown_233");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_111(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_111,"Unknown_111");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_182(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_182,"Executing_182");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_239(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_239,"Unknown_239");
		return this;
	}
	public UnderwritingRulesPage enterStatus_59(WebDriver driver,String Status_59) {
		BrowserActions.type(driver, inpStatus_59,Status_59, "Status_59");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_241(WebDriver driver,String PolicyTransaction_241) {
		BrowserActions.type(driver, inpPolicyTransaction_241,PolicyTransaction_241, "PolicyTransaction_241");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet(WebDriver driver,String CheckingSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet,CheckingSet,"CheckingSet");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_70(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_70,"Executing_70");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_129(WebDriver driver,String PolicyTransaction_129) {
		BrowserActions.type(driver, inpPolicyTransaction_129,PolicyTransaction_129, "PolicyTransaction_129");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_19(WebDriver driver,String Jurisdiction_19) {
		BrowserActions.type(driver, inpJurisdiction_19,Jurisdiction_19, "Jurisdiction_19");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_369(WebDriver driver,String PolicyTransaction_369) {
		BrowserActions.type(driver, inpPolicyTransaction_369,PolicyTransaction_369, "PolicyTransaction_369");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_308(WebDriver driver,String CheckingSet_308)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_308,CheckingSet_308,"CheckingSet_308");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_205(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_205,"Invalid_205");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_367(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_367,"Unknown_367");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_81(WebDriver driver,String PolicyTransaction_81) {
		BrowserActions.type(driver, inpPolicyTransaction_81,PolicyTransaction_81, "PolicyTransaction_81");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_328(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_328,"PrevExecuting_328");
		return this;
	}
	public UnderwritingRulesPage enterVersion(WebDriver driver,String Version) {
		BrowserActions.type(driver, inpVersion,Version, "Version");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_249(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_249,"Unknown_249");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_127(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_127,"Unknown_127");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_198(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_198,"Executing_198");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_273(WebDriver driver,String PolicyTransaction_273) {
		BrowserActions.type(driver, inpPolicyTransaction_273,PolicyTransaction_273, "PolicyTransaction_273");
		return this;
	}
	public UnderwritingRulesPage enterStatus_27(WebDriver driver,String Status_27) {
		BrowserActions.type(driver, inpStatus_27,Status_27, "Status_27");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_200(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_200,"PrevExecuting_200");
		return this;
	}
	public UnderwritingRulesPage clickFilter(WebDriver driver)  {
		BrowserActions.click(driver, btnFilter,"Filter");
		return this;
	}
	public UnderwritingRulesPage enterVersion_188(WebDriver driver,String Version_188) {
		BrowserActions.type(driver, inpVersion_188,Version_188, "Version_188");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_306(WebDriver driver,String PolicyLine_306) {
		BrowserActions.type(driver, inpPolicyLine_306,PolicyLine_306, "PolicyLine_306");
		return this;
	}
	public UnderwritingRulesPage clickExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting,"Executing");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_143(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_143,"Unknown_143");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_317(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_317,"Invalid_317");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_383(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_383,"Unknown_383");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_35(WebDriver driver,String Jurisdiction_35) {
		BrowserActions.type(driver, inpJurisdiction_35,Jurisdiction_35, "Jurisdiction_35");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_54(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_54,"Executing_54");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_377(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_377,"Unknown_377");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_145(WebDriver driver,String PolicyTransaction_145) {
		BrowserActions.type(driver, inpPolicyTransaction_145,PolicyTransaction_145, "PolicyTransaction_145");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_255(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_255,"Unknown_255");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_385(WebDriver driver,String PolicyTransaction_385) {
		BrowserActions.type(driver, inpPolicyTransaction_385,PolicyTransaction_385, "PolicyTransaction_385");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_312(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_312,"PrevExecuting_312");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_137(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_137,"Unknown_137");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_97(WebDriver driver,String PolicyTransaction_97) {
		BrowserActions.type(driver, inpPolicyTransaction_97,PolicyTransaction_97, "PolicyTransaction_97");
		return this;
	}
	public UnderwritingRulesPage clickClone(WebDriver driver)  {
		BrowserActions.click(driver, btnClone,"Clone");
		return this;
	}
	public UnderwritingRulesPage enterStatus_91(WebDriver driver,String Status_91) {
		BrowserActions.type(driver, inpStatus_91,Status_91, "Status_91");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_349(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_349,"Invalid_349");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_109(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_109,"Invalid_109");
		return this;
	}
	public UnderwritingRulesPage enterStatus_283(WebDriver driver,String Status_283) {
		BrowserActions.type(driver, inpStatus_283,Status_283, "Status_283");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_221(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_221,"Invalid_221");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_303(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_303,"Unknown_303");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_104(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_104,"PrevExecuting_104");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_344(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_344,"PrevExecuting_344");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_337(WebDriver driver,String PolicyTransaction_337) {
		BrowserActions.type(driver, inpPolicyTransaction_337,PolicyTransaction_337, "PolicyTransaction_337");
		return this;
	}
	public UnderwritingRulesPage enterName_186(WebDriver driver,String Name_186) {
		BrowserActions.type(driver, inpName_186,Name_186, "Name_186");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_51(WebDriver driver,String Jurisdiction_51) {
		BrowserActions.type(driver, inpJurisdiction_51,Jurisdiction_51, "Jurisdiction_51");
		return this;
	}
	public UnderwritingRulesPage enterStatus_155(WebDriver driver,String Status_155) {
		BrowserActions.type(driver, inpStatus_155,Status_155, "Status_155");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_321(WebDriver driver,String PolicyTransaction_321) {
		BrowserActions.type(driver, inpPolicyTransaction_321,PolicyTransaction_321, "PolicyTransaction_321");
		return this;
	}
	public UnderwritingRulesPage enterValidationStatusToolbarInput(WebDriver driver,String ValidationStatusToolbarInput) {
		BrowserActions.type(driver, inpValidationStatusToolbarInput,ValidationStatusToolbarInput, "ValidationStatusToolbarInput");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_216(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_216,"PrevExecuting_216");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_38(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_38,"Executing_38");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_313(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_313,"Unknown_313");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_333(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_333,"Invalid_333");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_319(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_319,"Unknown_319");
		return this;
	}
	public UnderwritingRulesPage selectAvailability(WebDriver driver,String Availability)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAvailability,Availability,"Availability");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_209(WebDriver driver,String PolicyTransaction_209) {
		BrowserActions.type(driver, inpPolicyTransaction_209,PolicyTransaction_209, "PolicyTransaction_209");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_85(WebDriver driver,String BlockingPoint_85)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_85,BlockingPoint_85,"BlockingPoint_85");
		return this;
	}
	public UnderwritingRulesPage enterName_170(WebDriver driver,String Name_170) {
		BrowserActions.type(driver, inpName_170,Name_170, "Name_170");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_125(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_125,"Invalid_125");
		return this;
	}
	public UnderwritingRulesPage enterName_298(WebDriver driver,String Name_298) {
		BrowserActions.type(driver, inpName_298,Name_298, "Name_298");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_22(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_22,"Executing_22");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_67(WebDriver driver,String Jurisdiction_67) {
		BrowserActions.type(driver, inpJurisdiction_67,Jurisdiction_67, "Jurisdiction_67");
		return this;
	}
	public UnderwritingRulesPage enterStatus_187(WebDriver driver,String Status_187) {
		BrowserActions.type(driver, inpStatus_187,Status_187, "Status_187");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_201(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_201,"Unknown_201");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_113(WebDriver driver,String PolicyTransaction_113) {
		BrowserActions.type(driver, inpPolicyTransaction_113,PolicyTransaction_113, "PolicyTransaction_113");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_248(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_248,"PrevExecuting_248");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_353(WebDriver driver,String PolicyTransaction_353) {
		BrowserActions.type(driver, inpPolicyTransaction_353,PolicyTransaction_353, "PolicyTransaction_353");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_365(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_365,"Invalid_365");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_329(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_329,"Unknown_329");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_207(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_207,"Unknown_207");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_120(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_120,"PrevExecuting_120");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_360(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_360,"PrevExecuting_360");
		return this;
	}
	public UnderwritingRulesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public UnderwritingRulesPage enterName_282(WebDriver driver,String Name_282) {
		BrowserActions.type(driver, inpName_282,Name_282, "Name_282");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_237(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_237,"Invalid_237");
		return this;
	}
	public UnderwritingRulesPage enterStatus_299(WebDriver driver,String Status_299) {
		BrowserActions.type(driver, inpStatus_299,Status_299, "Status_299");
		return this;
	}
	public UnderwritingRulesPage enterStatus_75(WebDriver driver,String Status_75) {
		BrowserActions.type(driver, inpStatus_75,Status_75, "Status_75");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_225(WebDriver driver,String PolicyTransaction_225) {
		BrowserActions.type(driver, inpPolicyTransaction_225,PolicyTransaction_225, "PolicyTransaction_225");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_14(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_14,"ExternallyManaged_14");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_217(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_217,"Unknown_217");
		return this;
	}
	public UnderwritingRulesPage clickDisableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDisableSelected,"DisableSelected");
		return this;
	}
	public UnderwritingRulesPage enterStatus_171(WebDriver driver,String Status_171) {
		BrowserActions.type(driver, inpStatus_171,Status_171, "Status_171");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_335(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_335,"Unknown_335");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_232(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_232,"PrevExecuting_232");
		return this;
	}
	public UnderwritingRulesPage clickValid_64(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_64,"Valid_64");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_31(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_31,"Unknown_31");
		return this;
	}
	public UnderwritingRulesPage enterName_90(WebDriver driver,String Name_90) {
		BrowserActions.type(driver, inpName_90,Name_90, "Name_90");
		return this;
	}
	public UnderwritingRulesPage enterVersion_76(WebDriver driver,String Version_76) {
		BrowserActions.type(driver, inpVersion_76,Version_76, "Version_76");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_83(WebDriver driver,String Jurisdiction_83) {
		BrowserActions.type(driver, inpJurisdiction_83,Jurisdiction_83, "Jurisdiction_83");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_191(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_191,"Unknown_191");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_258(WebDriver driver,String PolicyLine_258) {
		BrowserActions.type(driver, inpPolicyLine_258,PolicyLine_258, "PolicyLine_258");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_130(WebDriver driver,String PolicyLine_130) {
		BrowserActions.type(driver, inpPolicyLine_130,PolicyLine_130, "PolicyLine_130");
		return this;
	}
	public UnderwritingRulesPage clickClose_4(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_4,"Close_4");
		return this;
	}
	public UnderwritingRulesPage clickClose_3(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_3,"Close_3");
		return this;
	}
	public UnderwritingRulesPage enterStatus_123(WebDriver driver,String Status_123) {
		BrowserActions.type(driver, inpStatus_123,Status_123, "Status_123");
		return this;
	}
	public UnderwritingRulesPage clickClose_2(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_2,"Close_2");
		return this;
	}
	public UnderwritingRulesPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public UnderwritingRulesPage enterStatus_363(WebDriver driver,String Status_363) {
		BrowserActions.type(driver, inpStatus_363,Status_363, "Status_363");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_372(WebDriver driver,String CheckingSet_372)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_372,CheckingSet_372,"CheckingSet_372");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_37(WebDriver driver,String BlockingPoint_37)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_37,BlockingPoint_37,"BlockingPoint_37");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_132(WebDriver driver,String CheckingSet_132)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_132,CheckingSet_132,"CheckingSet_132");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_264(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_264,"PrevExecuting_264");
		return this;
	}
	public UnderwritingRulesPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_214(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_214,"Executing_214");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_23(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_23,"NotExecuting_23");
		return this;
	}
	public UnderwritingRulesPage enterStatus_235(WebDriver driver,String Status_235) {
		BrowserActions.type(driver, inpStatus_235,Status_235, "Status_235");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_242(WebDriver driver,String PolicyLine_242) {
		BrowserActions.type(driver, inpPolicyLine_242,PolicyLine_242, "PolicyLine_242");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_370(WebDriver driver,String PolicyLine_370) {
		BrowserActions.type(driver, inpPolicyLine_370,PolicyLine_370, "PolicyLine_370");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_99(WebDriver driver,String Jurisdiction_99) {
		BrowserActions.type(driver, inpJurisdiction_99,Jurisdiction_99, "Jurisdiction_99");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_136(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_136,"PrevExecuting_136");
		return this;
	}
	public UnderwritingRulesPage enterVersion_60(WebDriver driver,String Version_60) {
		BrowserActions.type(driver, inpVersion_60,Version_60, "Version_60");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_244(WebDriver driver,String CheckingSet_244)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_244,CheckingSet_244,"CheckingSet_244");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_376(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_376,"PrevExecuting_376");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_342(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_342,"Executing_342");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_102(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_102,"Executing_102");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_25(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_25,"Unknown_25");
		return this;
	}
	public UnderwritingRulesPage enterName_74(WebDriver driver,String Name_74) {
		BrowserActions.type(driver, inpName_74,Name_74, "Name_74");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_280(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_280,"PrevExecuting_280");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_39(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_39,"NotExecuting_39");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_199(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_199,"NotExecuting_199");
		return this;
	}
	public UnderwritingRulesPage clickClear(WebDriver driver)  {
		BrowserActions.click(driver, btnClear,"Clear");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_274(WebDriver driver,String PolicyLine_274) {
		BrowserActions.type(driver, inpPolicyLine_274,PolicyLine_274, "PolicyLine_274");
		return this;
	}
	public UnderwritingRulesPage enterStatus_267(WebDriver driver,String Status_267) {
		BrowserActions.type(driver, inpStatus_267,Status_267, "Status_267");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_162(WebDriver driver,String PolicyLine_162) {
		BrowserActions.type(driver, inpPolicyLine_162,PolicyLine_162, "PolicyLine_162");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_230(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_230,"Executing_230");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_168(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_168,"PrevExecuting_168");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_276(WebDriver driver,String CheckingSet_276)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_276,CheckingSet_276,"CheckingSet_276");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_53(WebDriver driver,String BlockingPoint_53)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_53,BlockingPoint_53,"BlockingPoint_53");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_358(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_358,"Executing_358");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_20(WebDriver driver,String CheckingSet_20)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_20,CheckingSet_20,"CheckingSet_20");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_15(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_15,"Unknown_15");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_118(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_118,"Executing_118");
		return this;
	}
	public UnderwritingRulesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged,"ExternallyManaged");
		return this;
	}
	public UnderwritingRulesPage enterVersion_44(WebDriver driver,String Version_44) {
		BrowserActions.type(driver, inpVersion_44,Version_44, "Version_44");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_146(WebDriver driver,String PolicyLine_146) {
		BrowserActions.type(driver, inpPolicyLine_146,PolicyLine_146, "PolicyLine_146");
		return this;
	}
	public UnderwritingRulesPage enterStatus_139(WebDriver driver,String Status_139) {
		BrowserActions.type(driver, inpStatus_139,Status_139, "Status_139");
		return this;
	}
	public UnderwritingRulesPage enterStatus_379(WebDriver driver,String Status_379) {
		BrowserActions.type(driver, inpStatus_379,Status_379, "Status_379");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_183(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_183,"NotExecuting_183");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_307(WebDriver driver,String Jurisdiction_307) {
		BrowserActions.type(driver, inpJurisdiction_307,Jurisdiction_307, "Jurisdiction_307");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_386(WebDriver driver,String PolicyLine_386) {
		BrowserActions.type(driver, inpPolicyLine_386,PolicyLine_386, "PolicyLine_386");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_260(WebDriver driver,String CheckingSet_260)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_260,CheckingSet_260,"CheckingSet_260");
		return this;
	}
	public UnderwritingRulesPage enterStatus_251(WebDriver driver,String Status_251) {
		BrowserActions.type(driver, inpStatus_251,Status_251, "Status_251");
		return this;
	}
	public CreateNewRulePage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return new CreateNewRulePage(driver).get();
	}
	public UnderwritingRulesPage selectBlockingPoint_69(WebDriver driver,String BlockingPoint_69)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_69,BlockingPoint_69,"BlockingPoint_69");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_246(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_246,"Executing_246");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine(WebDriver driver,String PolicyLine) {
		BrowserActions.type(driver, inpPolicyLine,PolicyLine, "PolicyLine");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_388(WebDriver driver,String CheckingSet_388)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_388,CheckingSet_388,"CheckingSet_388");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_152(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_152,"PrevExecuting_152");
		return this;
	}
	public UnderwritingRulesPage clickValid_48(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_48,"Valid_48");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_148(WebDriver driver,String CheckingSet_148)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_148,CheckingSet_148,"CheckingSet_148");
		return this;
	}
	public UnderwritingRulesPage clickValid_208(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_208,"Valid_208");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_338(WebDriver driver,String PolicyLine_338) {
		BrowserActions.type(driver, inpPolicyLine_338,PolicyLine_338, "PolicyLine_338");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_271(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_271,"Unknown_271");
		return this;
	}
	public UnderwritingRulesPage clickEnableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableSelected,"EnableSelected");
		return this;
	}
	public UnderwritingRulesPage clickValid_320(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_320,"Valid_320");
		return this;
	}
	public UnderwritingRulesPage enterName_58(WebDriver driver,String Name_58) {
		BrowserActions.type(driver, inpName_58,Name_58, "Name_58");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_55(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_55,"NotExecuting_55");
		return this;
	}
	public UnderwritingRulesPage enterStatus_203(WebDriver driver,String Status_203) {
		BrowserActions.type(driver, inpStatus_203,Status_203, "Status_203");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_295(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_295,"NotExecuting_295");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_153(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_153,"Unknown_153");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_210(WebDriver driver,String PolicyLine_210) {
		BrowserActions.type(driver, inpPolicyLine_210,PolicyLine_210, "PolicyLine_210");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_265(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_265,"Unknown_265");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_177(WebDriver driver,String PolicyTransaction_177) {
		BrowserActions.type(driver, inpPolicyTransaction_177,PolicyTransaction_177, "PolicyTransaction_177");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_374(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_374,"Executing_374");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_134(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_134,"Executing_134");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_212(WebDriver driver,String CheckingSet_212)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_212,CheckingSet_212,"CheckingSet_212");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_184(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_184,"PrevExecuting_184");
		return this;
	}
	public UnderwritingRulesPage enterName_42(WebDriver driver,String Name_42) {
		BrowserActions.type(driver, inpName_42,Name_42, "Name_42");
		return this;
	}
	public UnderwritingRulesPage enterVersion_28(WebDriver driver,String Version_28) {
		BrowserActions.type(driver, inpVersion_28,Version_28, "Version_28");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_161(WebDriver driver,String PolicyTransaction_161) {
		BrowserActions.type(driver, inpPolicyTransaction_161,PolicyTransaction_161, "PolicyTransaction_161");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_167(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_167,"NotExecuting_167");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_281(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_281,"Unknown_281");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_322(WebDriver driver,String PolicyLine_322) {
		BrowserActions.type(driver, inpPolicyLine_322,PolicyLine_322, "PolicyLine_322");
		return this;
	}
	public UnderwritingRulesPage selectPolicyLine(WebDriver driver,String PolicyLine)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLine,PolicyLine,"PolicyLine");
		return this;
	}
	public UnderwritingRulesPage enterStatus_315(WebDriver driver,String Status_315) {
		BrowserActions.type(driver, inpStatus_315,Status_315, "Status_315");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_71(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_71,"NotExecuting_71");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_289(WebDriver driver,String PolicyTransaction_289) {
		BrowserActions.type(driver, inpPolicyTransaction_289,PolicyTransaction_289, "PolicyTransaction_289");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_262(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_262,"Executing_262");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_159(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_159,"Unknown_159");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_296(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_296,"PrevExecuting_296");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_324(WebDriver driver,String CheckingSet_324)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_324,CheckingSet_324,"CheckingSet_324");
		return this;
	}
	public UnderwritingRulesPage clickValid_304(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_304,"Valid_304");
		return this;
	}
	public UnderwritingRulesPage enterVersion_12(WebDriver driver,String Version_12) {
		BrowserActions.type(driver, inpVersion_12,Version_12, "Version_12");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_354(WebDriver driver,String PolicyLine_354) {
		BrowserActions.type(driver, inpPolicyLine_354,PolicyLine_354, "PolicyLine_354");
		return this;
	}
	public UnderwritingRulesPage clickValid_80(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_80,"Valid_80");
		return this;
	}
	public UnderwritingRulesPage enterStatus_107(WebDriver driver,String Status_107) {
		BrowserActions.type(driver, inpStatus_107,Status_107, "Status_107");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_114(WebDriver driver,String PolicyLine_114) {
		BrowserActions.type(driver, inpPolicyLine_114,PolicyLine_114, "PolicyLine_114");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_193(WebDriver driver,String PolicyTransaction_193) {
		BrowserActions.type(driver, inpPolicyTransaction_193,PolicyTransaction_193, "PolicyTransaction_193");
		return this;
	}
	public UnderwritingRulesPage enterStatus_347(WebDriver driver,String Status_347) {
		BrowserActions.type(driver, inpStatus_347,Status_347, "Status_347");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_297(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_297,"Unknown_297");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_175(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_175,"Unknown_175");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_151(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_151,"NotExecuting_151");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_169(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_169,"Unknown_169");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_150(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_150,"Executing_150");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_287(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_287,"Unknown_287");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_279(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_279,"NotExecuting_279");
		return this;
	}
	public UnderwritingRulesPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_356(WebDriver driver,String CheckingSet_356)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_356,CheckingSet_356,"CheckingSet_356");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_278(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_278,"Executing_278");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_116(WebDriver driver,String CheckingSet_116)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_116,CheckingSet_116,"CheckingSet_116");
		return this;
	}
	public UnderwritingRulesPage clickValid_96(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_96,"Valid_96");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_226(WebDriver driver,String PolicyLine_226) {
		BrowserActions.type(driver, inpPolicyLine_226,PolicyLine_226, "PolicyLine_226");
		return this;
	}
	public UnderwritingRulesPage enterStatus_219(WebDriver driver,String Status_219) {
		BrowserActions.type(driver, inpStatus_219,Status_219, "Status_219");
		return this;
	}
	public UnderwritingRulesPage enterName_26(WebDriver driver,String Name_26) {
		BrowserActions.type(driver, inpName_26,Name_26, "Name_26");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_87(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_87,"NotExecuting_87");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_263(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_263,"NotExecuting_263");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_185(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_185,"Unknown_185");
		return this;
	}
	public UnderwritingRulesPage enterStatus_331(WebDriver driver,String Status_331) {
		BrowserActions.type(driver, inpStatus_331,Status_331, "Status_331");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_340(WebDriver driver,String CheckingSet_340)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_340,CheckingSet_340,"CheckingSet_340");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_100(WebDriver driver,String CheckingSet_100)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_100,CheckingSet_100,"CheckingSet_100");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_166(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_166,"Executing_166");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_21(WebDriver driver,String BlockingPoint_21)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_21,BlockingPoint_21,"BlockingPoint_21");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_228(WebDriver driver,String CheckingSet_228)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_228,CheckingSet_228,"CheckingSet_228");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_325(WebDriver driver,String BlockingPoint_325)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_325,BlockingPoint_325,"BlockingPoint_325");
		return this;
	}
	public UnderwritingRulesPage clickValid_128(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_128,"Valid_128");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_82(WebDriver driver,String PolicyLine_82) {
		BrowserActions.type(driver, inpPolicyLine_82,PolicyLine_82, "PolicyLine_82");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_135(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_135,"NotExecuting_135");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_259(WebDriver driver,String Jurisdiction_259) {
		BrowserActions.type(driver, inpJurisdiction_259,Jurisdiction_259, "Jurisdiction_259");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_375(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_375,"NotExecuting_375");
		return this;
	}
	public UnderwritingRulesPage enterName_314(WebDriver driver,String Name_314) {
		BrowserActions.type(driver, inpName_314,Name_314, "Name_314");
		return this;
	}
	public UnderwritingRulesPage clickValid_368(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_368,"Valid_368");
		return this;
	}
	public UnderwritingRulesPage enterName_10(WebDriver driver,String Name_10) {
		BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_190(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_190,"ExternallyManaged_190");
		return this;
	}
	public UnderwritingRulesPage clickInvalid(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid,"Invalid");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_88(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_88,"PrevExecuting_88");
		return this;
	}
	public UnderwritingRulesPage clickValid_240(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_240,"Valid_240");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_387(WebDriver driver,String Jurisdiction_387) {
		BrowserActions.type(driver, inpJurisdiction_387,Jurisdiction_387, "Jurisdiction_387");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting,"PrevExecuting");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_84(WebDriver driver,String CheckingSet_84)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_84,CheckingSet_84,"CheckingSet_84");
		return this;
	}
	public UnderwritingRulesPage clickValid(WebDriver driver)  {
		BrowserActions.click(driver, btnValid,"Valid");
		return this;
	}
	public UnderwritingRulesPage clickValid_112(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_112,"Valid_112");
		return this;
	}
	public UnderwritingRulesPage clickValid_352(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_352,"Valid_352");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_371(WebDriver driver,String Jurisdiction_371) {
		BrowserActions.type(driver, inpJurisdiction_371,Jurisdiction_371, "Jurisdiction_371");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_131(WebDriver driver,String Jurisdiction_131) {
		BrowserActions.type(driver, inpJurisdiction_131,Jurisdiction_131, "Jurisdiction_131");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_247(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_247,"NotExecuting_247");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_72(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_72,"PrevExecuting_72");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction(WebDriver driver,String Jurisdiction) {
		BrowserActions.type(driver, inpJurisdiction,Jurisdiction, "Jurisdiction");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_213(WebDriver driver,String BlockingPoint_213)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_213,BlockingPoint_213,"BlockingPoint_213");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_7(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_7,"NotExecuting_7");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_95(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_95,"Unknown_95");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_309(WebDriver driver,String BlockingPoint_309)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_309,BlockingPoint_309,"BlockingPoint_309");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_231(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_231,"NotExecuting_231");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_66(WebDriver driver,String PolicyLine_66) {
		BrowserActions.type(driver, inpPolicyLine_66,PolicyLine_66, "PolicyLine_66");
		return this;
	}
	public UnderwritingRulesPage clickValid_224(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_224,"Valid_224");
		return this;
	}
	public UnderwritingRulesPage clickUnknown(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown,"Unknown");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_163(WebDriver driver,String Jurisdiction_163) {
		BrowserActions.type(driver, inpJurisdiction_163,Jurisdiction_163, "Jurisdiction_163");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_119(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_119,"NotExecuting_119");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_359(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_359,"NotExecuting_359");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_9(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_9,"Unknown_9");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_13(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_13,"Invalid_13");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_147(WebDriver driver,String Jurisdiction_147) {
		BrowserActions.type(driver, inpJurisdiction_147,Jurisdiction_147, "Jurisdiction_147");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_343(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_343,"NotExecuting_343");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_50(WebDriver driver,String PolicyLine_50) {
		BrowserActions.type(driver, inpPolicyLine_50,PolicyLine_50, "PolicyLine_50");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_5(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_5,"Unknown_5");
		return this;
	}
	public UnderwritingRulesPage clickValid_336(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_336,"Valid_336");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_275(WebDriver driver,String Jurisdiction_275) {
		BrowserActions.type(driver, inpJurisdiction_275,Jurisdiction_275, "Jurisdiction_275");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_103(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_103,"NotExecuting_103");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_89(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_89,"Unknown_89");
		return this;
	}
	public UnderwritingRulesPage clickShowFilters(WebDriver driver)  {
		BrowserActions.click(driver, btnShowFilters,"ShowFilters");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_73(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_73,"Unknown_73");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_178(WebDriver driver,String PolicyLine_178) {
		BrowserActions.type(driver, inpPolicyLine_178,PolicyLine_178, "PolicyLine_178");
		return this;
	}
	public UnderwritingRulesPage clickValid_288(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_288,"Valid_288");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_339(WebDriver driver,String Jurisdiction_339) {
		BrowserActions.type(driver, inpJurisdiction_339,Jurisdiction_339, "Jurisdiction_339");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_270(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_270,"ExternallyManaged_270");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_292(WebDriver driver,String CheckingSet_292)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_292,CheckingSet_292,"CheckingSet_292");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_215(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_215,"NotExecuting_215");
		return this;
	}
	public UnderwritingRulesPage clickDeploy(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploy,"Deploy");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_40(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_40,"PrevExecuting_40");
		return this;
	}
	public UnderwritingRulesPage clickValid_160(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_160,"Valid_160");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_79(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_79,"Unknown_79");
		return this;
	}
	public UnderwritingRulesPage enterVersion_204(WebDriver driver,String Version_204) {
		BrowserActions.type(driver, inpVersion_204,Version_204, "Version_204");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint(WebDriver driver,String BlockingPoint)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint,BlockingPoint,"BlockingPoint");
		return this;
	}
	public UnderwritingRulesPage clickValid_16(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_16,"Valid_16");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_245(WebDriver driver,String BlockingPoint_245)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_245,BlockingPoint_245,"BlockingPoint_245");
		return this;
	}
	public UnderwritingRulesPage clickValid_32(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_32,"Valid_32");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_63(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_63,"Unknown_63");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_323(WebDriver driver,String Jurisdiction_323) {
		BrowserActions.type(driver, inpJurisdiction_323,Jurisdiction_323, "Jurisdiction_323");
		return this;
	}
	public UnderwritingRulesPage clickDeployAll(WebDriver driver)  {
		BrowserActions.click(driver, btnDeployAll,"DeployAll");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_327(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_327,"NotExecuting_327");
		return this;
	}
	public UnderwritingRulesPage clickValid_272(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_272,"Valid_272");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_36(WebDriver driver,String CheckingSet_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_36,CheckingSet_36,"CheckingSet_36");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_211(WebDriver driver,String Jurisdiction_211) {
		BrowserActions.type(driver, inpJurisdiction_211,Jurisdiction_211, "Jurisdiction_211");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_164(WebDriver driver,String CheckingSet_164)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_164,CheckingSet_164,"CheckingSet_164");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_290(WebDriver driver,String PolicyLine_290) {
		BrowserActions.type(driver, inpPolicyLine_290,PolicyLine_290, "PolicyLine_290");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_373(WebDriver driver,String BlockingPoint_373)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_373,BlockingPoint_373,"BlockingPoint_373");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_133(WebDriver driver,String BlockingPoint_133)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_133,BlockingPoint_133,"BlockingPoint_133");
		return this;
	}
	public UnderwritingRulesPage enterVersion_316(WebDriver driver,String Version_316) {
		BrowserActions.type(driver, inpVersion_316,Version_316, "Version_316");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_382(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_382,"ExternallyManaged_382");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_142(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_142,"ExternallyManaged_142");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_229(WebDriver driver,String BlockingPoint_229)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_229,BlockingPoint_229,"BlockingPoint_229");
		return this;
	}
	public UnderwritingRulesPage clickValid_144(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_144,"Valid_144");
		return this;
	}
	public UnderwritingRulesPage clickNotExecuting_311(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_311,"NotExecuting_311");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_355(WebDriver driver,String Jurisdiction_355) {
		BrowserActions.type(driver, inpJurisdiction_355,Jurisdiction_355, "Jurisdiction_355");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_6(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_6,"Executing_6");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_115(WebDriver driver,String Jurisdiction_115) {
		BrowserActions.type(driver, inpJurisdiction_115,Jurisdiction_115, "Jurisdiction_115");
		return this;
	}
	public UnderwritingRulesPage clickValid_384(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_384,"Valid_384");
		return this;
	}
	public UnderwritingRulesPage enterVersion_92(WebDriver driver,String Version_92) {
		BrowserActions.type(driver, inpVersion_92,Version_92, "Version_92");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_68(WebDriver driver,String CheckingSet_68)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_68,CheckingSet_68,"CheckingSet_68");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_196(WebDriver driver,String CheckingSet_196)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_196,CheckingSet_196,"CheckingSet_196");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_243(WebDriver driver,String Jurisdiction_243) {
		BrowserActions.type(driver, inpJurisdiction_243,Jurisdiction_243, "Jurisdiction_243");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_57(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_57,"Unknown_57");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_310(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_310,"Executing_310");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_341(WebDriver driver,String BlockingPoint_341)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_341,BlockingPoint_341,"BlockingPoint_341");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_101(WebDriver driver,String BlockingPoint_101)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_101,BlockingPoint_101,"BlockingPoint_101");
		return this;
	}
	public UnderwritingRulesPage enterVersion_300(WebDriver driver,String Version_300) {
		BrowserActions.type(driver, inpVersion_300,Version_300, "Version_300");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_174(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_174,"ExternallyManaged_174");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_117(WebDriver driver,String BlockingPoint_117)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_117,BlockingPoint_117,"BlockingPoint_117");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_41(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_41,"Unknown_41");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_158(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_158,"ExternallyManaged_158");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_98(WebDriver driver,String PolicyLine_98) {
		BrowserActions.type(driver, inpPolicyLine_98,PolicyLine_98, "PolicyLine_98");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_227(WebDriver driver,String Jurisdiction_227) {
		BrowserActions.type(driver, inpJurisdiction_227,Jurisdiction_227, "Jurisdiction_227");
		return this;
	}
	public UnderwritingRulesPage clickValid_256(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_256,"Valid_256");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_180(WebDriver driver,String CheckingSet_180)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_180,CheckingSet_180,"CheckingSet_180");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_194(WebDriver driver,String PolicyLine_194) {
		BrowserActions.type(driver, inpPolicyLine_194,PolicyLine_194, "PolicyLine_194");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_56(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_56,"PrevExecuting_56");
		return this;
	}
	public UnderwritingRulesPage clickExportSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnExportSelected,"ExportSelected");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_286(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_286,"ExternallyManaged_286");
		return this;
	}
	public UnderwritingRulesPage selectCheckingSet_52(WebDriver driver,String CheckingSet_52)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet_52,CheckingSet_52,"CheckingSet_52");
		return this;
	}
	public UnderwritingRulesPage clickUnknown_47(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_47,"Unknown_47");
		return this;
	}
	public UnderwritingRulesPage clickExecuting_326(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_326,"Executing_326");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_357(WebDriver driver,String BlockingPoint_357)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_357,BlockingPoint_357,"BlockingPoint_357");
		return this;
	}
	public UnderwritingRulesPage enterVersion_252(WebDriver driver,String Version_252) {
		BrowserActions.type(driver, inpVersion_252,Version_252, "Version_252");
		return this;
	}
	public UnderwritingRulesPage enterNameDescription(WebDriver driver,String NameDescription) {
		BrowserActions.type(driver, inpNameDescription,NameDescription, "NameDescription");
		return this;
	}
	public UnderwritingRulesPage enterName_154(WebDriver driver,String Name_154) {
		BrowserActions.type(driver, inpName_154,Name_154, "Name_154");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_269(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_269,"Invalid_269");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_381(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_381,"Invalid_381");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_141(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_141,"Invalid_141");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_110(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_110,"ExternallyManaged_110");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_165(WebDriver driver,String BlockingPoint_165)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_165,BlockingPoint_165,"BlockingPoint_165");
		return this;
	}
	public UnderwritingRulesPage enterVersion_124(WebDriver driver,String Version_124) {
		BrowserActions.type(driver, inpVersion_124,Version_124, "Version_124");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_350(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_350,"ExternallyManaged_350");
		return this;
	}
	public UnderwritingRulesPage enterVersion_364(WebDriver driver,String Version_364) {
		BrowserActions.type(driver, inpVersion_364,Version_364, "Version_364");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_334(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_334,"ExternallyManaged_334");
		return this;
	}
	public UnderwritingRulesPage enterName_266(WebDriver driver,String Name_266) {
		BrowserActions.type(driver, inpName_266,Name_266, "Name_266");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_77(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_77,"Invalid_77");
		return this;
	}
	public UnderwritingRulesPage clickValid_192(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_192,"Valid_192");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_30(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_30,"ExternallyManaged_30");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_253(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_253,"Invalid_253");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_293(WebDriver driver,String BlockingPoint_293)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_293,BlockingPoint_293,"BlockingPoint_293");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_222(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_222,"ExternallyManaged_222");
		return this;
	}
	public UnderwritingRulesPage enterVersion_236(WebDriver driver,String Version_236) {
		BrowserActions.type(driver, inpVersion_236,Version_236, "Version_236");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_149(WebDriver driver,String BlockingPoint_149)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_149,BlockingPoint_149,"BlockingPoint_149");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_126(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_126,"ExternallyManaged_126");
		return this;
	}
	public UnderwritingRulesPage enterName_250(WebDriver driver,String Name_250) {
		BrowserActions.type(driver, inpName_250,Name_250, "Name_250");
		return this;
	}
	public UnderwritingRulesPage enterFilteredInput(WebDriver driver,String FilteredInput) {
		BrowserActions.type(driver, inpFilteredInput,FilteredInput, "FilteredInput");
		return this;
	}
	public UnderwritingRulesPage enterName_378(WebDriver driver,String Name_378) {
		BrowserActions.type(driver, inpName_378,Name_378, "Name_378");
		return this;
	}
	public UnderwritingRulesPage enterName_138(WebDriver driver,String Name_138) {
		BrowserActions.type(driver, inpName_138,Name_138, "Name_138");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_8(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_8,"PrevExecuting_8");
		return this;
	}
	public UnderwritingRulesPage clickPrevExecuting_24(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_24,"PrevExecuting_24");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_93(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_93,"Invalid_93");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_46(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_46,"ExternallyManaged_46");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_285(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_285,"Invalid_285");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction(WebDriver driver,String PolicyTransaction) {
		BrowserActions.type(driver, inpPolicyTransaction,PolicyTransaction, "PolicyTransaction");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_261(WebDriver driver,String BlockingPoint_261)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_261,BlockingPoint_261,"BlockingPoint_261");
		return this;
	}
	public UnderwritingRulesPage clickDeploySelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploySelected,"DeploySelected");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_254(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_254,"ExternallyManaged_254");
		return this;
	}
	public UnderwritingRulesPage enterVersion_348(WebDriver driver,String Version_348) {
		BrowserActions.type(driver, inpVersion_348,Version_348, "Version_348");
		return this;
	}
	public UnderwritingRulesPage enterVersion_108(WebDriver driver,String Version_108) {
		BrowserActions.type(driver, inpVersion_108,Version_108, "Version_108");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_389(WebDriver driver,String BlockingPoint_389)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_389,BlockingPoint_389,"BlockingPoint_389");
		return this;
	}
	public UnderwritingRulesPage enterVersion_220(WebDriver driver,String Version_220) {
		BrowserActions.type(driver, inpVersion_220,Version_220, "Version_220");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_238(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_238,"ExternallyManaged_238");
		return this;
	}
	public UnderwritingRulesPage enterName_362(WebDriver driver,String Name_362) {
		BrowserActions.type(driver, inpName_362,Name_362, "Name_362");
		return this;
	}
	public UnderwritingRulesPage enterName_122(WebDriver driver,String Name_122) {
		BrowserActions.type(driver, inpName_122,Name_122, "Name_122");
		return this;
	}
	public UnderwritingRulesPage clickValid_176(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_176,"Valid_176");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_157(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_157,"Invalid_157");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_366(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_366,"ExternallyManaged_366");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_277(WebDriver driver,String BlockingPoint_277)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_277,BlockingPoint_277,"BlockingPoint_277");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_305(WebDriver driver,String PolicyTransaction_305) {
		BrowserActions.type(driver, inpPolicyTransaction_305,PolicyTransaction_305, "PolicyTransaction_305");
		return this;
	}
	public UnderwritingRulesPage enterVersion_332(WebDriver driver,String Version_332) {
		BrowserActions.type(driver, inpVersion_332,Version_332, "Version_332");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_17(WebDriver driver,String PolicyTransaction_17) {
		BrowserActions.type(driver, inpPolicyTransaction_17,PolicyTransaction_17, "PolicyTransaction_17");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_302(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_302,"ExternallyManaged_302");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_29(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_29,"Invalid_29");
		return this;
	}
	public UnderwritingRulesPage enterVersion_172(WebDriver driver,String Version_172) {
		BrowserActions.type(driver, inpVersion_172,Version_172, "Version_172");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_179(WebDriver driver,String Jurisdiction_179) {
		BrowserActions.type(driver, inpJurisdiction_179,Jurisdiction_179, "Jurisdiction_179");
		return this;
	}
	public UnderwritingRulesPage enterName_234(WebDriver driver,String Name_234) {
		BrowserActions.type(driver, inpName_234,Name_234, "Name_234");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_62(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_62,"ExternallyManaged_62");
		return this;
	}
	public UnderwritingRulesPage clickMore(WebDriver driver)  {
		BrowserActions.click(driver, btnMore,"More");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_189(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_189,"Invalid_189");
		return this;
	}
	public UnderwritingRulesPage clickExportAll(WebDriver driver)  {
		BrowserActions.click(driver, btnExportAll,"ExportAll");
		return this;
	}
	public UnderwritingRulesPage enterVersion_284(WebDriver driver,String Version_284) {
		BrowserActions.type(driver, inpVersion_284,Version_284, "Version_284");
		return this;
	}
	public UnderwritingRulesPage enterName_346(WebDriver driver,String Name_346) {
		BrowserActions.type(driver, inpName_346,Name_346, "Name_346");
		return this;
	}
	public UnderwritingRulesPage enterName_106(WebDriver driver,String Name_106) {
		BrowserActions.type(driver, inpName_106,Name_106, "Name_106");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_34(WebDriver driver,String PolicyLine_34) {
		BrowserActions.type(driver, inpPolicyLine_34,PolicyLine_34, "PolicyLine_34");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_78(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_78,"ExternallyManaged_78");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_173(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_173,"Invalid_173");
		return this;
	}
	public UnderwritingRulesPage enterStatus_11(WebDriver driver,String Status_11) {
		BrowserActions.type(driver, inpStatus_11,Status_11, "Status_11");
		return this;
	}
	public UnderwritingRulesPage clickImportfromFile(WebDriver driver)  {
		BrowserActions.click(driver, btnImportfromFile,"ImportfromFile");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_33(WebDriver driver,String PolicyTransaction_33) {
		BrowserActions.type(driver, inpPolicyTransaction_33,PolicyTransaction_33, "PolicyTransaction_33");
		return this;
	}
	public UnderwritingRulesPage enterVersion_156(WebDriver driver,String Version_156) {
		BrowserActions.type(driver, inpVersion_156,Version_156, "Version_156");
		return this;
	}
	public UnderwritingRulesPage selectPolicyTransaction(WebDriver driver,String PolicyTransaction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyTransaction,PolicyTransaction,"PolicyTransaction");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_291(WebDriver driver,String Jurisdiction_291) {
		BrowserActions.type(driver, inpJurisdiction_291,Jurisdiction_291, "Jurisdiction_291");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_206(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_206,"ExternallyManaged_206");
		return this;
	}
	public UnderwritingRulesPage enterName_330(WebDriver driver,String Name_330) {
		BrowserActions.type(driver, inpName_330,Name_330, "Name_330");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_45(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_45,"Invalid_45");
		return this;
	}
	public UnderwritingRulesPage enterName_218(WebDriver driver,String Name_218) {
		BrowserActions.type(driver, inpName_218,Name_218, "Name_218");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_181(WebDriver driver,String BlockingPoint_181)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_181,BlockingPoint_181,"BlockingPoint_181");
		return this;
	}
	public UnderwritingRulesPage enterVersion_268(WebDriver driver,String Version_268) {
		BrowserActions.type(driver, inpVersion_268,Version_268, "Version_268");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_318(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_318,"ExternallyManaged_318");
		return this;
	}
	public UnderwritingRulesPage enterVersion_380(WebDriver driver,String Version_380) {
		BrowserActions.type(driver, inpVersion_380,Version_380, "Version_380");
		return this;
	}
	public UnderwritingRulesPage enterPolicyTransaction_49(WebDriver driver,String PolicyTransaction_49) {
		BrowserActions.type(driver, inpPolicyTransaction_49,PolicyTransaction_49, "PolicyTransaction_49");
		return this;
	}
	public UnderwritingRulesPage enterVersion_140(WebDriver driver,String Version_140) {
		BrowserActions.type(driver, inpVersion_140,Version_140, "Version_140");
		return this;
	}
	public UnderwritingRulesPage clickExternallyManaged_94(WebDriver driver)  {
		BrowserActions.click(driver, btnExternallyManaged_94,"ExternallyManaged_94");
		return this;
	}
	public UnderwritingRulesPage enterName_202(WebDriver driver,String Name_202) {
		BrowserActions.type(driver, inpName_202,Name_202, "Name_202");
		return this;
	}
	public UnderwritingRulesPage clickInvalid_61(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_61,"Invalid_61");
		return this;
	}
	public UnderwritingRulesPage enterJurisdiction_195(WebDriver driver,String Jurisdiction_195) {
		BrowserActions.type(driver, inpJurisdiction_195,Jurisdiction_195, "Jurisdiction_195");
		return this;
	}
	public UnderwritingRulesPage enterPolicyLine_18(WebDriver driver,String PolicyLine_18) {
		BrowserActions.type(driver, inpPolicyLine_18,PolicyLine_18, "PolicyLine_18");
		return this;
	}
	public UnderwritingRulesPage selectBlockingPoint_197(WebDriver driver,String BlockingPoint_197)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint_197,BlockingPoint_197,"BlockingPoint_197");
		return this;
	}
	
	/**
	 * Click Underrating check box
	 * @param driver , rules
	 * @return
	 */
	public UnderwritingRulesPage clickUnderratingCheckBox(WebDriver driver,String rules)  {
		String pageNo=lblLastPageNo.getText();
		String num=pageNo.replaceAll("[^1/4]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			List<WebElement> elements = driver.findElements(By.xpath("//div[text()='"+rules+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]"));
			if (elements.size() > 0) {
				By underratingChkBoxBy = By.xpath("//div[text()='"+rules+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
				BrowserActions.waitForElementToDisplay(driver, underratingChkBoxBy, "underratingChkBox");
				WebElement underratingChkBox = underratingChkBoxBy.findElement(driver);
				BrowserActions.click(driver, underratingChkBox,2,rules + "");
				break;
			}
			else {
				BrowserActions.click(driver, btnNext, true,"Next Button");
			}
		}

		return this;
	}
	
	/**
	 * Click under rating rule
	 * @param driver , rule
	 * @return
	 */
	public ExistingRulesPage clickUnderratingRule(WebDriver driver,String rules)  {
		By underwriterRuleBy = By.xpath("//div[text()='"+rules+"']");
		BrowserActions.waitForElementToDisplay(driver, underwriterRuleBy, "underwriterRule");
		WebElement underwriterRule = underwriterRuleBy.findElement(driver);
		BrowserActions.click(driver, underwriterRule,"Under Writer rule");
		return new ExistingRulesPage(driver).get();
	}
	
	/**
	 * Verify clone button is enabled or not
	 * @param driver , textExpected
	 * @return
	 */

	public UnderwritingRulesPage verifyCloneButtonIsEnabled(WebDriver driver)  {
		BrowserActions.verifyElementIsEnabled(driver, btnClone,"Clone Button");
		return this;
	}
	public class CreateNewRulePage extends LoadableComponent<CreateNewRulePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-TypeId']", AI = false)
		private WebElement inpTypeId;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_26;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_67;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		private WebElement inpOperatorLabel_15;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_80;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_118;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-__crumb__", AI = false)
		private WebElement btnReturntoUnderwritingRules;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		private WebElement inpRightParensLabel_17;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		private WebElement inpAndOrLabel_12;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-Code']", AI = false)
		private WebElement inpCode;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_126;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-PolicyTransactions-ApplicabilityCriteriaInputSet-InputWidget']", AI = false)
		private WebElement drpInputWidget_3;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-Jurisdictions-ApplicabilityCriteriaInputSet-InputWidget']", AI = false)
		private WebElement drpInputWidget_2;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpIssueKeyText;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_94;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-RuleContextDefinitionKey']", AI = false)
		private WebElement drpContext;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-VersionId']", AI = false)
		private WebElement inpGlobalVersionID;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_114;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-TriggeringPointKey']", AI = false)
		private WebElement drpCheckingSet;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_122;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-ConditionValidationToolbarButtonSet-HideValidation>div[role='button']", AI = false)
		private WebElement btnNoValidationErrors_1;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_53;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_129;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandValidationLabel", AI = false)
		private WebElement btnLeftExpression;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_79;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_36;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_125;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_103;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_95;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-ConditionValidationToolbarButtonSet-ShowValidation>div[role='button']", AI = false)
		private WebElement btnNoValidationErrors;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-Comparator']", AI = false)
		private WebElement drpValueComparator;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleManagementAuditLinkInputSet-Link", AI = false)
		private WebElement btnViewHistory;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgePolicyholderEnglishUSText;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_23;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_110;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		private WebElement inpRightParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableNameID']", AI = false)
		private WebElement inpVariableNameID;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-AutoApprovable']", AI = false)
		private WebElement rdbAutoapprovable;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-DefaultValueOffsetAmount']", AI = false)
		private WebElement inpDefaultValueOffsetAmount;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-Jurisdictions-ApplicabilityCriteriaInputSet-AnyOrSelection']", AI = false)
		private WebElement rdbJurisdictions;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_128;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_133;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleInsert>div[role='button']", AI = false)
		private WebElement btnInsert_7;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgeEnglishUSText;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_98;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-DuplicatedNameAlertBar-CloseBtn", AI = false)
		private WebElement btnClose;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleAdd>div[role='button']", AI = false)
		private WebElement btnAdd_6;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_113;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedAdd>div[role='button']", AI = false)
		private WebElement btnAdd_4;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveUp>div[role='button']", AI = false)
		private WebElement btnSimpleMoveUp;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-AndOr']", AI = false)
		private WebElement drpAndOr;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandErrorIcon", AI = false)
		private WebElement btnRightOperandErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_42;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_119;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression']", AI = false)
		private WebElement inpExpression;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_131;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-DuplicatedNameAlertBar .gw-AlertBar--label", AI = false)
		private WebElement lblAnotherrulehasthesamename;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_115;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_100;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedShowPrettyPrint>div[role='button']", AI = false)
		private WebElement btnShowFormattedView;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-OperatorValidationLines']", AI = false)
		private WebElement inpOperatorValidationLines;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveDown>div[role='button']", AI = false)
		private WebElement btnSimpleMoveDown;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_93;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_134;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedContextHelp>div[role='button']", AI = false)
		private WebElement btnContextHelpALTH;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_57;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_99;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_109;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_86;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_137;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-RuleStartDate']", AI = false)
		private WebElement inpStartDate;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_130;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		private WebElement inpLeftOperandLabel;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_27;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_22;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightParensValidationLine2']", AI = false)
		private WebElement inpRightParensValidationLine2;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_29;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_84;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-RuleVariablesPanelSet-NoVariableText']", AI = false)
		private WebElement inpNovariablesdeclared;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_43;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-ValueFormatterType']", AI = false)
		private WebElement drpValueFormatterType;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-Name']", AI = false)
		private WebElement inpName;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleContextHelp>div[role='button']", AI = false)
		private WebElement btnContextHelpALTH_11;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_40;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnExpressionMenuIcon_136;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		private WebElement inpOperatorLabel;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_72;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-DefaultValueOffsetCurrency']", AI = false)
		private WebElement drpDefaultValueOffsetCurrency;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_30;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_70;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_124;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveUp>div[role='button']", AI = false)
		private WebElement btnAdvancedMoveUp;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-PolicyTransactions-ApplicabilityCriteriaInputSet-AnyOrSelection']", AI = false)
		private WebElement rdbPolicyTransactions;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-OperatorValidationLine']", AI = false)
		private WebElement inpOperatorValidationLine;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_87;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-Description textarea", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_127;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_60;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-DefaultDurationType']", AI = false)
		private WebElement drpDefaultDuration;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftParens']", AI = false)
		private WebElement drpLeftParens;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-Operator']", AI = false)
		private WebElement drpOperator;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightParens']", AI = false)
		private WebElement drpRightParens;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_112;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_73;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-AdvancedInfoTab", AI = false)
		private WebElement btnAdvanced;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandErrorIcon", AI = false)
		private WebElement btnLeftOperandErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_58;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-Update>div[role='button']", AI = false)
		private WebElement btnSave;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleManagementAuditLinkInputSet-Summary", AI = false)
		private WebElement btnLastEditedbysuon03302023;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_35;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-PolicyLines-ApplicabilityCriteriaInputSet-InputWidget']", AI = false)
		private WebElement drpInputWidget;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_56;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_41;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		private WebElement inpLeftParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		private WebElement inpRightOperandLabel_16;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedInsert>div[role='button']", AI = false)
		private WebElement btnInsert;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression']", AI = false)
		private WebElement inpEvaluationContextFormula;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-RuleEndDate']", AI = false)
		private WebElement inpEndDate;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ContextDescription']", AI = false)
		private WebElement inpContextDescription;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleShowPrettyPrint>div[role='button']", AI = false)
		private WebElement btnShowFormattedView_9;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_66;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LineValidationLabel", AI = false)
		private WebElement btnOperation;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_88;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_96;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty_39;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_104;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnDate_52;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLookup_74;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_107;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_59;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_81;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnExpressionMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-AvailableToRunInputSet-Note']", AI = false)
		private WebElement inpNote;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		private WebElement inpLeftParensLabel_13;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_28;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_37;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedRemove>div[role='button']", AI = false)
		private WebElement btnRemove_5;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_132;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleRemove>div[role='button']", AI = false)
		private WebElement btnRemove_8;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_20;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-AvailableToRunInputSet-Value']", AI = false)
		private WebElement rdbEnabled;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_102;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_33;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-DefaultApprovalBlockingPoint']", AI = false)
		private WebElement drpDefaultApprovalBlockingPoint;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleVariableTitle", AI = false)
		private WebElement lblRuleVariableTitle;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_24;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum_117;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpValueText;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression']", AI = false)
		private WebElement inpExpression_18;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_77;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_85;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-BlockingPoint']", AI = false)
		private WebElement drpBlockingPoint;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgePolicyholderEnglishUSText_121;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnProperty;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_50;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_63;

		@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-DefaultValueAssignmentType']", AI = false)
		private WebElement drpDefaultValueAssignmentType;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_64;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnLastsavedvalue_71;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		private WebElement inpRightOperandLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgeEnglishUSText_106;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_116;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveDown>div[role='button']", AI = false)
		private WebElement btnAdvancedMoveDown;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_123;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_78;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo_108;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightParensValidationLine']", AI = false)
		private WebElement inpRightParensValidationLine;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_46;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-ExpressionID']", AI = false)
		private WebElement inpExpressionID;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_49;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCount_101;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_120;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_21;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_61;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_62;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_83;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftParensValidationLine2']", AI = false)
		private WebElement inpLeftParensValidationLine2;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-PolicyLines-ApplicabilityCriteriaInputSet-AnyOrSelection']", AI = false)
		private WebElement rdbPolicyLines;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_105;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_32;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_89;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		private WebElement inpAndOrLabel;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_55;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_97;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_92;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEnglishUSText_91;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnYesNo;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_45;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_48;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_75;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleEndDate_dateIcon", AI = false)
		private WebElement btnEndDateDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableDescriptionID']", AI = false)
		private WebElement inpVariableDescriptionID;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_69;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEnglishUSText;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleStartDate_dateIcon", AI = false)
		private WebElement btnStartDateDateIcon;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedHidePrettyPrint>div[role='button']", AI = false)
		private WebElement btnHideFormattedView;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_65;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_38;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftParensValidationLine']", AI = false)
		private WebElement inpLeftParensValidationLine;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-RuleDetailsTab", AI = false)
		private WebElement btnRuleDetails;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		private WebElement inpLeftOperandLabel_14;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnSum;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_51;

		@IFindBy(how = How.CSS, using = "input[name='CreateUWRule-UWRulePanelSet-DefaultEditBeforeBind']", AI = false)
		private WebElement rdbDefaultEditBeforeBind;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LineErrorIcon", AI = false)
		private WebElement btnLineErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleHidePrettyPrint>div[role='button']", AI = false)
		private WebElement btnHideFormattedView_10;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_82;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnExpressionMenuIcon_19;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_44;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_76;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_47;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-LeftOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandValidationLabel", AI = false)
		private WebElement btnRightExpression;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_54;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_135;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_138;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_31;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTypeKey_34;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnTextTemplate_68;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_90;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-CommandParameterMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnCondition_111;

		@IFindBy(how = How.CSS, using = "#CreateUWRule-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-0-RightOperandCell-ExpressionFragCell-Expression-ConditionBuilderExpressionMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		private WebElement btnFormula_25;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRuleDetail_UpLink", AI = false)
		private WebElement btnUptoUnderwritingRules;


		public CreateNewRulePage(){
		}

		public CreateNewRulePage(WebDriver driver){
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
		}public CreateNewRulePage enterTypeId(WebDriver driver,String TypeId) {
			BrowserActions.type(driver, inpTypeId,TypeId, "TypeId");
			return this;
		}
		public CreateNewRulePage clickProperty_26(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_26,"Property_26");
			return this;
		}
		public CreateNewRulePage clickCondition_67(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_67,"Condition_67");
			return this;
		}
		public CreateNewRulePage enterOperatorLabel_15(WebDriver driver,String OperatorLabel_15) {
			BrowserActions.type(driver, inpOperatorLabel_15,OperatorLabel_15, "OperatorLabel_15");
			return this;
		}
		public CreateNewRulePage clickCount(WebDriver driver)  {
			BrowserActions.click(driver, btnCount,"Count");
			return this;
		}
		public CreateNewRulePage clickDate_80(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_80,"Date_80");
			return this;
		}
		public CreateNewRulePage clickLookup_118(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_118,"Lookup_118");
			return this;
		}
		public CreateNewRulePage clickReturntoUnderwritingRules(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoUnderwritingRules,"ReturntoUnderwritingRules");
			return this;
		}
		public CreateNewRulePage enterRightParensLabel_17(WebDriver driver,String RightParensLabel_17) {
			BrowserActions.type(driver, inpRightParensLabel_17,RightParensLabel_17, "RightParensLabel_17");
			return this;
		}
		public CreateNewRulePage enterAndOrLabel_12(WebDriver driver,String AndOrLabel_12) {
			BrowserActions.type(driver, inpAndOrLabel_12,AndOrLabel_12, "AndOrLabel_12");
			return this;
		}
		public CreateNewRulePage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public CreateNewRulePage clickCondition_126(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_126,"Condition_126");
			return this;
		}
		public CreateNewRulePage selectInputWidget_3(WebDriver driver,String InputWidget_3)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_3,InputWidget_3,"InputWidget_3");
			return this;
		}
		public CreateNewRulePage selectInputWidget_2(WebDriver driver,String InputWidget_2)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_2,InputWidget_2,"InputWidget_2");
			return this;
		}
		public CreateNewRulePage enterIssueKeyText(WebDriver driver,String IssueKeyText) {
			BrowserActions.type(driver, inpIssueKeyText,IssueKeyText, "IssueKeyText");
			return this;
		}
		public CreateNewRulePage clickTypeKey_94(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_94,"TypeKey_94");
			return this;
		}
		public CreateNewRulePage selectContext(WebDriver driver,String Context)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpContext,Context,"Context");
			return this;
		}
		public CreateNewRulePage enterGlobalVersionID(WebDriver driver,String GlobalVersionID) {
			BrowserActions.type(driver, inpGlobalVersionID,GlobalVersionID, "GlobalVersionID");
			return this;
		}
		public CreateNewRulePage clickProperty_114(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_114,"Property_114");
			return this;
		}
		public CreateNewRulePage selectCheckingSet(WebDriver driver,String CheckingSet)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet,CheckingSet,"CheckingSet");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon_122(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_122,"TemplateExpressionMenuIcon_122");
			return this;
		}
		public CreateNewRulePage clickNoValidationErrors_1(WebDriver driver)  {
			BrowserActions.click(driver, btnNoValidationErrors_1,"NoValidationErrors_1");
			return this;
		}
		public CreateNewRulePage clickCondition_53(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_53,"Condition_53");
			return this;
		}
		public CreateNewRulePage clickProperty_129(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_129,"Property_129");
			return this;
		}
		public CreateNewRulePage clickLeftExpression(WebDriver driver)  {
			BrowserActions.click(driver, btnLeftExpression,"LeftExpression");
			return this;
		}
		public CreateNewRulePage clickTypeKey_79(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_79,"TypeKey_79");
			return this;
		}
		public CreateNewRulePage clickCondition_36(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_36,"Condition_36");
			return this;
		}
		public CreateNewRulePage clickDate(WebDriver driver)  {
			BrowserActions.click(driver, btnDate,"Date");
			return this;
		}
		public CreateNewRulePage clickDate_125(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_125,"Date_125");
			return this;
		}
		public CreateNewRulePage clickLookup_103(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_103,"Lookup_103");
			return this;
		}
		public CreateNewRulePage clickDate_95(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_95,"Date_95");
			return this;
		}
		public CreateNewRulePage clickNoValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnNoValidationErrors,"NoValidationErrors");
			return this;
		}
		public CreateNewRulePage selectValueComparator(WebDriver driver,String ValueComparator)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpValueComparator,ValueComparator,"ValueComparator");
			return this;
		}
		public CreateNewRulePage clickViewHistory(WebDriver driver)  {
			BrowserActions.click(driver, btnViewHistory,"ViewHistory");
			return this;
		}
		public CreateNewRulePage enterEdgePolicyholderEnglishUSText(WebDriver driver,String EdgePolicyholderEnglishUSText) {
			BrowserActions.type(driver, inpEdgePolicyholderEnglishUSText,EdgePolicyholderEnglishUSText, "EdgePolicyholderEnglishUSText");
			return this;
		}
		public CreateNewRulePage clickCondition_23(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_23,"Condition_23");
			return this;
		}
		public CreateNewRulePage clickTypeKey(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey,"TypeKey");
			return this;
		}
		public CreateNewRulePage clickDate_110(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_110,"Date_110");
			return this;
		}
		public CreateNewRulePage clickTextTemplate(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate,"TextTemplate");
			return this;
		}
		public CreateNewRulePage enterRightParensLabel(WebDriver driver,String RightParensLabel) {
			BrowserActions.type(driver, inpRightParensLabel,RightParensLabel, "RightParensLabel");
			return this;
		}
		public CreateNewRulePage enterVariableNameID(WebDriver driver,String VariableNameID) {
			BrowserActions.type(driver, inpVariableNameID,VariableNameID, "VariableNameID");
			return this;
		}
		public CreateNewRulePage clickAutoapprovable(WebDriver driver)  {
			BrowserActions.click(driver, rdbAutoapprovable,"Autoapprovable");
			return this;
		}
		public CreateNewRulePage enterDefaultValueOffsetAmount(WebDriver driver,String DefaultValueOffsetAmount) {
			BrowserActions.type(driver, inpDefaultValueOffsetAmount,DefaultValueOffsetAmount, "DefaultValueOffsetAmount");
			return this;
		}
		public CreateNewRulePage clickJurisdictions(WebDriver driver)  {
			BrowserActions.click(driver, rdbJurisdictions,"Jurisdictions");
			return this;
		}
		public CreateNewRulePage clickFormula_128(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_128,"Formula_128");
			return this;
		}
		public CreateNewRulePage clickLookup_133(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_133,"Lookup_133");
			return this;
		}
		public CreateNewRulePage clickInsert_7(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert_7,"Insert_7");
			return this;
		}
		public CreateNewRulePage enterEdgeEnglishUSText(WebDriver driver,String EdgeEnglishUSText) {
			BrowserActions.type(driver, inpEdgeEnglishUSText,EdgeEnglishUSText, "EdgeEnglishUSText");
			return this;
		}
		public CreateNewRulePage clickFormula_98(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_98,"Formula_98");
			return this;
		}
		public CreateNewRulePage clickClose(WebDriver driver)  {
			BrowserActions.click(driver, btnClose,"Close");
			return this;
		}
		public CreateNewRulePage clickAdd_6(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_6,"Add_6");
			return this;
		}
		public CreateNewRulePage clickFormula_113(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_113,"Formula_113");
			return this;
		}
		public CreateNewRulePage clickAdd_4(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_4,"Add_4");
			return this;
		}
		public CreateNewRulePage clickSimpleMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveUp,"SimpleMoveUp");
			return this;
		}
		public CreateNewRulePage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public CreateNewRulePage selectAndOr(WebDriver driver,String AndOr)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAndOr,AndOr,"AndOr");
			return this;
		}
		public CreateNewRulePage clickRightOperandErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnRightOperandErrorIcon,"RightOperandErrorIcon");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon,"ValidationErrorIcon");
			return this;
		}
		public CreateNewRulePage clickSum_42(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_42,"Sum_42");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_119(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_119,"ValidationErrorIcon_119");
			return this;
		}
		public CreateNewRulePage enterExpression(WebDriver driver,String Expression) {
			BrowserActions.type(driver, inpExpression,Expression, "Expression");
			return this;
		}
		public CreateNewRulePage clickCount_131(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_131,"Count_131");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_115(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_115,"Lastsavedvalue_115");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_100(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_100,"Lastsavedvalue_100");
			return this;
		}
		public CreateNewRulePage clickShowFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView,"ShowFormattedView");
			return this;
		}
		public CreateNewRulePage enterOperatorValidationLines(WebDriver driver,String OperatorValidationLines) {
			BrowserActions.type(driver, inpOperatorValidationLines,OperatorValidationLines, "OperatorValidationLines");
			return this;
		}
		public CreateNewRulePage clickSimpleMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveDown,"SimpleMoveDown");
			return this;
		}
		public CreateNewRulePage clickYesNo_93(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_93,"YesNo_93");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_134(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_134,"ValidationErrorIcon_134");
			return this;
		}
		public CreateNewRulePage clickContextHelpALTH(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH,"ContextHelpALTH");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_57(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_57,"Lastsavedvalue_57");
			return this;
		}
		public CreateNewRulePage clickProperty_99(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_99,"Property_99");
			return this;
		}
		public CreateNewRulePage clickTypeKey_109(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_109,"TypeKey_109");
			return this;
		}
		public CreateNewRulePage clickCount_86(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_86,"Count_86");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_137(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_137,"ValidationErrorIcon_137");
			return this;
		}
		public CreateNewRulePage enterStartDate(WebDriver driver,String StartDate) {
			BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_130(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_130,"Lastsavedvalue_130");
			return this;
		}
		public CreateNewRulePage enterLeftOperandLabel(WebDriver driver,String LeftOperandLabel) {
			BrowserActions.type(driver, inpLeftOperandLabel,LeftOperandLabel, "LeftOperandLabel");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_27(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_27,"Lastsavedvalue_27");
			return this;
		}
		public CreateNewRulePage clickDate_22(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_22,"Date_22");
			return this;
		}
		public CreateNewRulePage enterRightParensValidationLine2(WebDriver driver,String RightParensValidationLine2) {
			BrowserActions.type(driver, inpRightParensValidationLine2,RightParensValidationLine2, "RightParensValidationLine2");
			return this;
		}
		public CreateNewRulePage clickSum_29(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_29,"Sum_29");
			return this;
		}
		public CreateNewRulePage clickProperty_84(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_84,"Property_84");
			return this;
		}
		public CreateNewRulePage enterNovariablesdeclared(WebDriver driver,String Novariablesdeclared) {
			BrowserActions.type(driver, inpNovariablesdeclared,Novariablesdeclared, "Novariablesdeclared");
			return this;
		}
		public CreateNewRulePage clickLookup_43(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_43,"Lookup_43");
			return this;
		}
		public CreateNewRulePage selectValueFormatterType(WebDriver driver,String ValueFormatterType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpValueFormatterType,ValueFormatterType,"ValueFormatterType");
			return this;
		}
		public CreateNewRulePage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name,"Name");
			return this;
		}
		public CreateNewRulePage clickContextHelpALTH_11(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH_11,"ContextHelpALTH_11");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_40(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_40,"Lastsavedvalue_40");
			return this;
		}
		public CreateNewRulePage clickExpressionMenuIcon_136(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon_136,"ExpressionMenuIcon_136");
			return this;
		}
		public CreateNewRulePage enterOperatorLabel(WebDriver driver,String OperatorLabel) {
			BrowserActions.type(driver, inpOperatorLabel,OperatorLabel, "OperatorLabel");
			return this;
		}
		public CreateNewRulePage clickCount_72(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_72,"Count_72");
			return this;
		}
		public CreateNewRulePage clickLabel(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel,"Label");
			return this;
		}
		public CreateNewRulePage selectDefaultValueOffsetCurrency(WebDriver driver,String DefaultValueOffsetCurrency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultValueOffsetCurrency,DefaultValueOffsetCurrency,"DefaultValueOffsetCurrency");
			return this;
		}
		public CreateNewRulePage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public CreateNewRulePage clickLookup_30(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_30,"Lookup_30");
			return this;
		}
		public CreateNewRulePage clickProperty_70(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_70,"Property_70");
			return this;
		}
		public CreateNewRulePage clickTypeKey_124(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_124,"TypeKey_124");
			return this;
		}
		public CreateNewRulePage clickAdvancedMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveUp,"AdvancedMoveUp");
			return this;
		}
		public CreateNewRulePage clickPolicyTransactions(WebDriver driver)  {
			BrowserActions.click(driver, rdbPolicyTransactions,"PolicyTransactions");
			return this;
		}
		public CreateNewRulePage enterOperatorValidationLine(WebDriver driver,String OperatorValidationLine) {
			BrowserActions.type(driver, inpOperatorValidationLine,OperatorValidationLine, "OperatorValidationLine");
			return this;
		}
		public CreateNewRulePage clickSum_87(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_87,"Sum_87");
			return this;
		}
		public CreateNewRulePage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_127(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_127,"TextTemplate_127");
			return this;
		}
		public CreateNewRulePage clickLookup_60(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_60,"Lookup_60");
			return this;
		}
		public CreateNewRulePage selectDefaultDuration(WebDriver driver,String DefaultDuration)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultDuration,DefaultDuration,"DefaultDuration");
			return this;
		}
		public CreateNewRulePage selectLeftParens(WebDriver driver,String LeftParens)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLeftParens,LeftParens,"LeftParens");
			return this;
		}
		public CreateNewRulePage selectOperator(WebDriver driver,String Operator)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpOperator,Operator,"Operator");
			return this;
		}
		public CreateNewRulePage selectRightParens(WebDriver driver,String RightParens)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpRightParens,RightParens,"RightParens");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_112(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_112,"TextTemplate_112");
			return this;
		}
		public CreateNewRulePage clickSum_73(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_73,"Sum_73");
			return this;
		}
		public CreateNewRulePage clickAdvanced(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvanced,"Advanced");
			return this;
		}
		public CreateNewRulePage clickLeftOperandErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLeftOperandErrorIcon,"LeftOperandErrorIcon");
			return this;
		}
		public CreateNewRulePage clickCount_58(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_58,"Count_58");
			return this;
		}
		public CreateNewRulePage clickSave(WebDriver driver)  {
			BrowserActions.click(driver, btnSave,"Save");
			return this;
		}
		public CreateNewRulePage clickLastEditedbysuon03302023(WebDriver driver)  {
			BrowserActions.click(driver, btnLastEditedbysuon03302023,"LastEditedbysuon03302023");
			return this;
		}
		public CreateNewRulePage clickDate_35(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_35,"Date_35");
			return this;
		}
		public CreateNewRulePage selectInputWidget(WebDriver driver,String InputWidget)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget,InputWidget,"InputWidget");
			return this;
		}
		public CreateNewRulePage clickProperty_56(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_56,"Property_56");
			return this;
		}
		public CreateNewRulePage clickCount_41(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_41,"Count_41");
			return this;
		}
		public CreateNewRulePage enterLeftParensLabel(WebDriver driver,String LeftParensLabel) {
			BrowserActions.type(driver, inpLeftParensLabel,LeftParensLabel, "LeftParensLabel");
			return this;
		}
		public CreateNewRulePage enterRightOperandLabel_16(WebDriver driver,String RightOperandLabel_16) {
			BrowserActions.type(driver, inpRightOperandLabel_16,RightOperandLabel_16, "RightOperandLabel_16");
			return this;
		}
		public CreateNewRulePage clickInsert(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert,"Insert");
			return this;
		}
		public CreateNewRulePage enterEvaluationContextFormula(WebDriver driver,String EvaluationContextFormula) {
			BrowserActions.type(driver, inpEvaluationContextFormula,EvaluationContextFormula, "EvaluationContextFormula");
			return this;
		}
		public CreateNewRulePage enterEndDate(WebDriver driver,String EndDate) {
			BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
			return this;
		}
		public CreateNewRulePage enterContextDescription(WebDriver driver,String ContextDescription) {
			BrowserActions.type(driver, inpContextDescription,ContextDescription, "ContextDescription");
			return this;
		}
		public CreateNewRulePage clickShowFormattedView_9(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView_9,"ShowFormattedView_9");
			return this;
		}
		public CreateNewRulePage clickDate_66(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_66,"Date_66");
			return this;
		}
		public CreateNewRulePage clickOperation(WebDriver driver)  {
			BrowserActions.click(driver, btnOperation,"Operation");
			return this;
		}
		public CreateNewRulePage clickLookup_88(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_88,"Lookup_88");
			return this;
		}
		public CreateNewRulePage clickCondition_96(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_96,"Condition_96");
			return this;
		}
		public CreateNewRulePage clickLookup(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup,"Lookup");
			return this;
		}
		public CreateNewRulePage clickProperty_39(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty_39,"Property_39");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_104(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_104,"ValidationErrorIcon_104");
			return this;
		}
		public CreateNewRulePage clickDate_52(WebDriver driver)  {
			BrowserActions.click(driver, btnDate_52,"Date_52");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue,"Lastsavedvalue");
			return this;
		}
		public CreateNewRulePage clickLookup_74(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup_74,"Lookup_74");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon_107(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_107,"TemplateExpressionMenuIcon_107");
			return this;
		}
		public CreateNewRulePage clickSum_59(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_59,"Sum_59");
			return this;
		}
		public CreateNewRulePage clickCondition_81(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_81,"Condition_81");
			return this;
		}
		public CreateNewRulePage clickExpressionMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon,"ExpressionMenuIcon");
			return this;
		}
		public CreateNewRulePage enterNote(WebDriver driver,String Note) {
			BrowserActions.type(driver, inpNote,Note, "Note");
			return this;
		}
		public CreateNewRulePage enterLeftParensLabel_13(WebDriver driver,String LeftParensLabel_13) {
			BrowserActions.type(driver, inpLeftParensLabel_13,LeftParensLabel_13, "LeftParensLabel_13");
			return this;
		}
		public CreateNewRulePage clickCount_28(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_28,"Count_28");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_37(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_37,"TextTemplate_37");
			return this;
		}
		public CreateNewRulePage clickRemove_5(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_5,"Remove_5");
			return this;
		}
		public CreateNewRulePage clickSum_132(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_132,"Sum_132");
			return this;
		}
		public CreateNewRulePage clickRemove_8(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_8,"Remove_8");
			return this;
		}
		public CreateNewRulePage clickYesNo_20(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_20,"YesNo_20");
			return this;
		}
		public CreateNewRulePage clickEnabled(WebDriver driver)  {
			BrowserActions.click(driver, rdbEnabled,"Enabled");
			return this;
		}
		public CreateNewRulePage clickSum_102(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_102,"Sum_102");
			return this;
		}
		public CreateNewRulePage clickYesNo_33(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_33,"YesNo_33");
			return this;
		}
		public CreateNewRulePage selectDefaultApprovalBlockingPoint(WebDriver driver,String DefaultApprovalBlockingPoint)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultApprovalBlockingPoint,DefaultApprovalBlockingPoint,"DefaultApprovalBlockingPoint");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_24(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_24,"TextTemplate_24");
			return this;
		}
		public CreateNewRulePage clickSum_117(WebDriver driver)  {
			BrowserActions.click(driver, btnSum_117,"Sum_117");
			return this;
		}
		public CreateNewRulePage enterValueText(WebDriver driver,String ValueText) {
			BrowserActions.type(driver, inpValueText,ValueText, "ValueText");
			return this;
		}
		public CreateNewRulePage enterExpression_18(WebDriver driver,String Expression_18) {
			BrowserActions.type(driver, inpExpression_18,Expression_18, "Expression_18");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon_77(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_77,"TemplateExpressionMenuIcon_77");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon,"TemplateExpressionMenuIcon");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_85(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_85,"Lastsavedvalue_85");
			return this;
		}
		public CreateNewRulePage selectBlockingPoint(WebDriver driver,String BlockingPoint)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint,BlockingPoint,"BlockingPoint");
			return this;
		}
		public CreateNewRulePage enterEdgePolicyholderEnglishUSText_121(WebDriver driver,String EdgePolicyholderEnglishUSText_121) {
			BrowserActions.type(driver, inpEdgePolicyholderEnglishUSText_121,EdgePolicyholderEnglishUSText_121, "EdgePolicyholderEnglishUSText_121");
			return this;
		}
		public CreateNewRulePage clickProperty(WebDriver driver)  {
			BrowserActions.click(driver, btnProperty,"Property");
			return this;
		}
		public CreateNewRulePage clickYesNo_50(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_50,"YesNo_50");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon_63(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_63,"TemplateExpressionMenuIcon_63");
			return this;
		}
		public CreateNewRulePage selectDefaultValueAssignmentType(WebDriver driver,String DefaultValueAssignmentType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultValueAssignmentType,DefaultValueAssignmentType,"DefaultValueAssignmentType");
			return this;
		}
		public CreateNewRulePage clickYesNo_64(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_64,"YesNo_64");
			return this;
		}
		public CreateNewRulePage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public CreateNewRulePage clickLastsavedvalue_71(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue_71,"Lastsavedvalue_71");
			return this;
		}
		public CreateNewRulePage enterRightOperandLabel(WebDriver driver,String RightOperandLabel) {
			BrowserActions.type(driver, inpRightOperandLabel,RightOperandLabel, "RightOperandLabel");
			return this;
		}
		public CreateNewRulePage enterEdgeEnglishUSText_106(WebDriver driver,String EdgeEnglishUSText_106) {
			BrowserActions.type(driver, inpEdgeEnglishUSText_106,EdgeEnglishUSText_106, "EdgeEnglishUSText_106");
			return this;
		}
		public CreateNewRulePage clickCount_116(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_116,"Count_116");
			return this;
		}
		public CreateNewRulePage clickAdvancedMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveDown,"AdvancedMoveDown");
			return this;
		}
		public CreateNewRulePage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public CreateNewRulePage clickYesNo_123(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_123,"YesNo_123");
			return this;
		}
		public CreateNewRulePage clickYesNo_78(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_78,"YesNo_78");
			return this;
		}
		public CreateNewRulePage clickYesNo_108(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo_108,"YesNo_108");
			return this;
		}
		public CreateNewRulePage enterRightParensValidationLine(WebDriver driver,String RightParensValidationLine) {
			BrowserActions.type(driver, inpRightParensValidationLine,RightParensValidationLine, "RightParensValidationLine");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon_46(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_46,"TemplateExpressionMenuIcon_46");
			return this;
		}
		public CreateNewRulePage enterExpressionID(WebDriver driver,String ExpressionID) {
			BrowserActions.type(driver, inpExpressionID,ExpressionID, "ExpressionID");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon_49(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_49,"TemplateExpressionMenuIcon_49");
			return this;
		}
		public CreateNewRulePage clickCount_101(WebDriver driver)  {
			BrowserActions.click(driver, btnCount_101,"Count_101");
			return this;
		}
		public CreateNewRulePage clickLabel_120(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_120,"Label_120");
			return this;
		}
		public CreateNewRulePage clickTypeKey_21(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_21,"TypeKey_21");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_61(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_61,"ValidationErrorIcon_61");
			return this;
		}
		public CreateNewRulePage clickLabel_62(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_62,"Label_62");
			return this;
		}
		public CreateNewRulePage clickFormula_83(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_83,"Formula_83");
			return this;
		}
		public CreateNewRulePage enterLeftParensValidationLine2(WebDriver driver,String LeftParensValidationLine2) {
			BrowserActions.type(driver, inpLeftParensValidationLine2,LeftParensValidationLine2, "LeftParensValidationLine2");
			return this;
		}
		public CreateNewRulePage clickPolicyLines(WebDriver driver)  {
			BrowserActions.click(driver, rdbPolicyLines,"PolicyLines");
			return this;
		}
		public CreateNewRulePage clickLabel_105(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_105,"Label_105");
			return this;
		}
		public CreateNewRulePage clickLabel_32(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_32,"Label_32");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_89(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_89,"ValidationErrorIcon_89");
			return this;
		}
		public CreateNewRulePage enterAndOrLabel(WebDriver driver,String AndOrLabel) {
			BrowserActions.type(driver, inpAndOrLabel,AndOrLabel, "AndOrLabel");
			return this;
		}
		public CreateNewRulePage clickCondition(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition,"Condition");
			return this;
		}
		public CreateNewRulePage clickFormula_55(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_55,"Formula_55");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_97(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_97,"TextTemplate_97");
			return this;
		}
		public CreateNewRulePage clickTemplateExpressionMenuIcon_92(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_92,"TemplateExpressionMenuIcon_92");
			return this;
		}
		public CreateNewRulePage enterEnglishUSText_91(WebDriver driver,String EnglishUSText_91) {
			BrowserActions.type(driver, inpEnglishUSText_91,EnglishUSText_91, "EnglishUSText_91");
			return this;
		}
		public CreateNewRulePage clickYesNo(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo,"YesNo");
			return this;
		}
		public CreateNewRulePage clickLabel_45(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_45,"Label_45");
			return this;
		}
		public CreateNewRulePage clickLabel_48(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_48,"Label_48");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_75(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_75,"ValidationErrorIcon_75");
			return this;
		}
		public CreateNewRulePage clickEndDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
			return this;
		}
		public CreateNewRulePage enterVariableDescriptionID(WebDriver driver,String VariableDescriptionID) {
			BrowserActions.type(driver, inpVariableDescriptionID,VariableDescriptionID, "VariableDescriptionID");
			return this;
		}
		public CreateNewRulePage clickFormula_69(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_69,"Formula_69");
			return this;
		}
		public CreateNewRulePage enterEnglishUSText(WebDriver driver,String EnglishUSText) {
			BrowserActions.type(driver, inpEnglishUSText,EnglishUSText, "EnglishUSText");
			return this;
		}
		public CreateNewRulePage clickStartDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
			return this;
		}
		public CreateNewRulePage clickHideFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView,"HideFormattedView");
			return this;
		}
		public CreateNewRulePage clickTypeKey_65(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_65,"TypeKey_65");
			return this;
		}
		public CreateNewRulePage clickFormula_38(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_38,"Formula_38");
			return this;
		}
		public CreateNewRulePage enterLeftParensValidationLine(WebDriver driver,String LeftParensValidationLine) {
			BrowserActions.type(driver, inpLeftParensValidationLine,LeftParensValidationLine, "LeftParensValidationLine");
			return this;
		}
		public CreateNewRulePage clickRuleDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnRuleDetails,"RuleDetails");
			return this;
		}
		public CreateNewRulePage enterLeftOperandLabel_14(WebDriver driver,String LeftOperandLabel_14) {
			BrowserActions.type(driver, inpLeftOperandLabel_14,LeftOperandLabel_14, "LeftOperandLabel_14");
			return this;
		}
		public CreateNewRulePage clickSum(WebDriver driver)  {
			BrowserActions.click(driver, btnSum,"Sum");
			return this;
		}
		public CreateNewRulePage clickTypeKey_51(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_51,"TypeKey_51");
			return this;
		}
		public CreateNewRulePage clickDefaultEditBeforeBind(WebDriver driver)  {
			BrowserActions.click(driver, rdbDefaultEditBeforeBind,"DefaultEditBeforeBind");
			return this;
		}
		public CreateNewRulePage clickLineErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLineErrorIcon,"LineErrorIcon");
			return this;
		}
		public CreateNewRulePage clickHideFormattedView_10(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView_10,"HideFormattedView_10");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_82(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_82,"TextTemplate_82");
			return this;
		}
		public CreateNewRulePage clickExpressionMenuIcon_19(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon_19,"ExpressionMenuIcon_19");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_44(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_44,"ValidationErrorIcon_44");
			return this;
		}
		public CreateNewRulePage clickLabel_76(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_76,"Label_76");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_47(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_47,"ValidationErrorIcon_47");
			return this;
		}
		public CreateNewRulePage clickFormula(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula,"Formula");
			return this;
		}
		public CreateNewRulePage clickRightExpression(WebDriver driver)  {
			BrowserActions.click(driver, btnRightExpression,"RightExpression");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_54(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_54,"TextTemplate_54");
			return this;
		}
		public CreateNewRulePage clickLabel_135(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_135,"Label_135");
			return this;
		}
		public CreateNewRulePage clickLabel_138(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_138,"Label_138");
			return this;
		}
		public CreateNewRulePage clickValidationErrorIcon_31(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_31,"ValidationErrorIcon_31");
			return this;
		}
		public CreateNewRulePage clickTypeKey_34(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey_34,"TypeKey_34");
			return this;
		}
		public CreateNewRulePage clickTextTemplate_68(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate_68,"TextTemplate_68");
			return this;
		}
		public CreateNewRulePage clickLabel_90(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_90,"Label_90");
			return this;
		}
		public CreateNewRulePage clickCondition_111(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition_111,"Condition_111");
			return this;
		}
		public CreateNewRulePage clickFormula_25(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula_25,"Formula_25");
			return this;
		}
		public UnderwritingRulesPage clickUptoUnderWritingRules(WebDriver driver)  {
			BrowserActions.click(driver, btnUptoUnderwritingRules,"UptoUnderwriting Rules Button");
			return new UnderwritingRulesPage(driver).get();
		}
	}
	public class ExistingRulesPage extends LoadableComponent<ExistingRulesPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-TypeId']", AI = false)
		private WebElement inpTypeId;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-ConditionValidationToolbarButtonSet-ShowValidation>div[role='button']", AI = false)
		private WebElement btnShowValidationErrors;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-Version']", AI = false)
		private WebElement drpVersion;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-RuleIsNotManagedByBusinessRulesFrameworkAlert-CloseBtn", AI = false)
		private WebElement btnClose_6;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnExpressionMenuIcon;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-RuleDeletedByAnotherUserAlert-CloseBtn", AI = false)
		private WebElement btnClose_5;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-DuplicatedNameAlertBar-CloseBtn", AI = false)
		private WebElement btnClose_4;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-PendingImportAlert-CloseBtn", AI = false)
		private WebElement btnClose_3;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-AvailableToRunInputSet-Note']", AI = false)
		private WebElement inpNote;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UnavailableToRunAlert-CloseBtn", AI = false)
		private WebElement btnClose_2;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-NotLatestAlert-CloseBtn", AI = false)
		private WebElement btnClose_1;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		private WebElement inpLeftParensLabel_16;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-DeleteDraft>div[role='button']", AI = false)
		private WebElement btnDeleteDraft;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_32;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-Code']", AI = false)
		private WebElement inpCode;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		private WebElement inpAndOrLabel_15;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-DuplicatedNameAlertBar .gw-AlertBar--label", AI = false)
		private WebElement lblAnotherrulehasthesamename;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_30;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedShowPrettyPrint>div[role='button']", AI = false)
		private WebElement btnShowFormattedView;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpIssueKeyText;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-RuleContextDefinitionKey']", AI = false)
		private WebElement drpContext;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression']", AI = false)
		private WebElement inpEnglishUSFormula_35;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-NotLatestAlert .gw-AlertBar--label", AI = false)
		private WebElement lblNotLatestAlert;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-VersionId']", AI = false)
		private WebElement inpGlobalVersionID;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		private WebElement inpOperatorLabel_18;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveDown>div[role='button']", AI = false)
		private WebElement btnSimpleMoveDown;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_25;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-TriggeringPointKey']", AI = false)
		private WebElement drpCheckingSet;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedContextHelp>div[role='button']", AI = false)
		private WebElement btnContextHelpALTH;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-PolicyLines-ApplicabilityCriteriaInputSet-AnyOrSelection']", AI = false)
		private WebElement rdbPolicyLines;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedRemove>div[role='button']", AI = false)
		private WebElement btnRemove_8;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_38;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgePolicyholderEnglishUSText_43;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-RuleStartDate']", AI = false)
		private WebElement inpStartDate;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-RuleIsNotManagedByBusinessRulesFrameworkAlert .gw-AlertBar--label", AI = false)
		private WebElement lblRuleIsNotManagedByBusinessRulesFrameworkAlert;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		private WebElement inpLeftOperandLabel;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		private WebElement inpAndOrLabel;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-PromoteToStaged>div[role='button']", AI = false)
		private WebElement btnPromotetoStage;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-RollingUpgradeAlert .gw-AlertBar--label", AI = false)
		private WebElement lblRollingUpgradeAlert;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-AvailableToRunInputSet-Value']", AI = false)
		private WebElement rdbEnabled;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnThisfieldisrequired_34;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-RuleDeletedByAnotherUserAlert .gw-AlertBar--label", AI = false)
		private WebElement lblRuleDeletedByAnotherUserAlert;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleManagementAuditLinkInputSet-Summary", AI = false)
		private WebElement btnLastEditedbysuon11292022;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-RuleVariablesPanelSet-NoVariableText']", AI = false)
		private WebElement inpNovariablesdeclared;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-ValueFormatterType']", AI = false)
		private WebElement drpValueFormatterType;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_49;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-Name']", AI = false)
		private WebElement inpName;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-PromoteToApproved>div[role='button']", AI = false)
		private WebElement btnPromotetoApproved;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleContextHelp>div[role='button']", AI = false)
		private WebElement btnContextHelpALTH_14;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-DefaultApprovalBlockingPoint']", AI = false)
		private WebElement drpDefaultApprovalBlockingPoint;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		private WebElement inpOperatorLabel;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleVariableTitle", AI = false)
		private WebElement lblRuleVariableTitle;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-DefaultValueOffsetCurrency']", AI = false)
		private WebElement drpDefaultValueOffsetCurrency;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-ConditionValidationToolbarButtonSet-HideValidation>div[role='button']", AI = false)
		private WebElement btnHideValidationErrors;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleEndDate_dateIcon", AI = false)
		private WebElement btnEndDateDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableDescriptionID']", AI = false)
		private WebElement inpVariableDescriptionID;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveUp>div[role='button']", AI = false)
		private WebElement btnAdvancedMoveUp;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-Comparator']", AI = false)
		private WebElement drpValueComparator;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleShowPrettyPrint>div[role='button']", AI = false)
		private WebElement btnShowFormattedView_12;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-PolicyTransactions-ApplicabilityCriteriaInputSet-AnyOrSelection']", AI = false)
		private WebElement rdbPolicyTransactions;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression']", AI = false)
		private WebElement inpEnglishUSFormula;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleManagementAuditLinkInputSet-Link", AI = false)
		private WebElement btnViewHistory;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgePolicyholderEnglishUSText;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpValueText;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleStartDate_dateIcon", AI = false)
		private WebElement btnStartDateDateIcon;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_28;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnExpressionMenuIcon_36;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedHidePrettyPrint>div[role='button']", AI = false)
		private WebElement btnHideFormattedView;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_21;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-Description textarea", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_26;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_23;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-PendingImportAlert .gw-AlertBar--label", AI = false)
		private WebElement lblPendingImportAlert;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-DefaultDurationType']", AI = false)
		private WebElement drpDefaultDuration;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		private WebElement inpLeftOperandLabel_17;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-Deploy>div[role='button']", AI = false)
		private WebElement btnDeploy;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-BlockingPoint']", AI = false)
		private WebElement drpBlockingPoint;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleDetailsTab", AI = false)
		private WebElement btnRuleDetails;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-Value-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_27;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-AdvancedInfoTab", AI = false)
		private WebElement btnAdvanced;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_29;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-IssueKey-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_24;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgeEnglishUSText_39;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnExpressionMenuIcon_47;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		private WebElement inpRightParensLabel;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnLabel_22;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableNameID']", AI = false)
		private WebElement inpVariableNameID;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-AutoApprovable']", AI = false)
		private WebElement rdbAutoapprovable;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleRemove>div[role='button']", AI = false)
		private WebElement btnRemove_11;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-DefaultEditBeforeBind']", AI = false)
		private WebElement rdbDefaultEditBeforeBind;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnThisfieldisrequired_46;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-DefaultValueOffsetAmount']", AI = false)
		private WebElement inpDefaultValueOffsetAmount;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnThisfieldisrequired_42;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-Jurisdictions-ApplicabilityCriteriaInputSet-AnyOrSelection']", AI = false)
		private WebElement rdbJurisdictions;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleHidePrettyPrint>div[role='button']", AI = false)
		private WebElement btnHideFormattedView_13;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-DefaultValueAssignmentType']", AI = false)
		private WebElement drpDefaultValueAssignmentType;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		private WebElement inpRightOperandLabel_19;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		private WebElement inpLeftParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		private WebElement inpRightOperandLabel;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-Update>div[role='button']", AI = false)
		private WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedInsert>div[role='button']", AI = false)
		private WebElement btnInsert;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-PolicyLines-ApplicabilityCriteriaInputSet-InputWidget']", AI = false)
		private WebElement drpPolicyLines;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_41;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_48;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_45;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-EvalContext-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression']", AI = false)
		private WebElement inpEvaluationContextFormula;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-RuleEndDate']", AI = false)
		private WebElement inpEndDate;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleInsert>div[role='button']", AI = false)
		private WebElement btnInsert_10;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ContextDescription']", AI = false)
		private WebElement inpContextDescription;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		private WebElement inpEdgeEnglishUSText;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-DeleteWip>div[role='button']", AI = false)
		private WebElement btnDelete;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveDown>div[role='button']", AI = false)
		private WebElement btnAdvancedMoveDown;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		private WebElement btnThisfieldisrequired;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-EnableDisableToggle>div[role='button']", AI = false)
		private WebElement btnEnable;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleAdd>div[role='button']", AI = false)
		private WebElement btnAdd_9;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-RollingUpgradeAlert-CloseBtn", AI = false)
		private WebElement btnClose;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedAdd>div[role='button']", AI = false)
		private WebElement btnAdd_7;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UnavailableToRunAlert .gw-AlertBar--label", AI = false)
		private WebElement lblRuleisnotenabledEnableit;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveUp>div[role='button']", AI = false)
		private WebElement btnSimpleMoveUp;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_33;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-ShortDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_31;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-0-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon_37;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-2-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_44;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-PolicyTransactions-ApplicabilityCriteriaInputSet-InputWidget']", AI = false)
		private WebElement drpPolicyTransactions;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-RuleVariablesPanelSet-RuleVariableLV-ExpressionID']", AI = false)
		private WebElement inpExpressionID;

		@IFindBy(how = How.CSS, using = "select[name='UWRuleDetail-UWRulePanelSet-Jurisdictions-ApplicabilityCriteriaInputSet-InputWidget']", AI = false)
		private WebElement drpJurisdictions;

		@IFindBy(how = How.CSS, using = "input[name='UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		private WebElement inpRightParensLabel_20;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-StatusTransitionToolbarButtonSet-Revert>div[role='button']", AI = false)
		private WebElement btnReverttothisversion;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		private WebElement btnValidationErrorIcon;

		@IFindBy(how = How.CSS, using = "#UWRuleDetail-UWRulePanelSet-UWIssueCommandDefinitionDV-LongDesc-LocalizedCommandParameterInputSet-1-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		private WebElement btnTemplateExpressionMenuIcon_40;

		@IFindBy(how = How.CSS, using = "div[id$='-Name']", AI = false)
		private WebElement lblName;

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

		@IFindBy(how = How.XPATH, using = "//div[text()='Underwriting Issue Details']", AI = false)
		public WebElement lblRuleUnderwritingIssueDetails ;

		@IFindBy(how = How.XPATH, using = "//div[text()='Condition']", AI = false)
		public WebElement lblRuleCondition;

		@IFindBy(how = How.CSS, using = "div[id*='UWIssueCommandDefinitionDV-ShortDesc']", AI = false)
		public WebElement lblRuleShortDescription;

		@IFindBy(how = How.CSS, using = "div[id*='UWIssueCommandDefinitionDV-LongDesc']", AI = false)
		public WebElement lblRuleLongDescription;



		public ExistingRulesPage(){
		}

		public ExistingRulesPage(WebDriver driver){
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
		}public ExistingRulesPage enterTypeId(WebDriver driver,String TypeId) {
			BrowserActions.type(driver, inpTypeId,TypeId, "TypeId");
			return this;
		}
		public ExistingRulesPage clickShowValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnShowValidationErrors,"ShowValidationErrors");
			return this;
		}
		public ExistingRulesPage selectVersion(WebDriver driver,String Version)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpVersion,Version,"Version");
			return this;
		}
		public ExistingRulesPage clickClose_6(WebDriver driver)  {
			BrowserActions.click(driver, btnClose_6,"Close_6");
			return this;
		}
		public ExistingRulesPage clickExpressionMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon,"ExpressionMenuIcon");
			return this;
		}
		public ExistingRulesPage clickClose_5(WebDriver driver)  {
			BrowserActions.click(driver, btnClose_5,"Close_5");
			return this;
		}
		public ExistingRulesPage clickClose_4(WebDriver driver)  {
			BrowserActions.click(driver, btnClose_4,"Close_4");
			return this;
		}
		public ExistingRulesPage clickClose_3(WebDriver driver)  {
			BrowserActions.click(driver, btnClose_3,"Close_3");
			return this;
		}
		public ExistingRulesPage enterNote(WebDriver driver,String Note) {
			BrowserActions.type(driver, inpNote,Note, "Note");
			return this;
		}
		public ExistingRulesPage clickClose_2(WebDriver driver)  {
			BrowserActions.click(driver, btnClose_2,"Close_2");
			return this;
		}
		public ExistingRulesPage clickClose_1(WebDriver driver)  {
			BrowserActions.click(driver, btnClose_1,"Close_1");
			return this;
		}
		public ExistingRulesPage enterLeftParensLabel_16(WebDriver driver,String LeftParensLabel_16) {
			BrowserActions.type(driver, inpLeftParensLabel_16,LeftParensLabel_16, "LeftParensLabel_16");
			return this;
		}
		public ExistingRulesPage clickDeleteDraft(WebDriver driver)  {
			BrowserActions.click(driver, btnDeleteDraft,"DeleteDraft");
			return this;
		}
		public ExistingRulesPage clickTemplateExpressionMenuIcon_32(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_32,"TemplateExpressionMenuIcon_32");
			return this;
		}
		public ExistingRulesPage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public ExistingRulesPage enterAndOrLabel_15(WebDriver driver,String AndOrLabel_15) {
			BrowserActions.type(driver, inpAndOrLabel_15,AndOrLabel_15, "AndOrLabel_15");
			return this;
		}
		public ExistingRulesPage clickTemplateExpressionMenuIcon_30(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_30,"TemplateExpressionMenuIcon_30");
			return this;
		}
		public ExistingRulesPage clickShowFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView,"ShowFormattedView");
			return this;
		}
		public ExistingRulesPage enterIssueKeyText(WebDriver driver,String IssueKeyText) {
			BrowserActions.type(driver, inpIssueKeyText,IssueKeyText, "IssueKeyText");
			return this;
		}
		public ExistingRulesPage selectContext(WebDriver driver,String Context)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpContext,Context,"Context");
			return this;
		}
		public ExistingRulesPage enterEnglishUSFormula_35(WebDriver driver,String EnglishUSFormula_35) {
			BrowserActions.type(driver, inpEnglishUSFormula_35,EnglishUSFormula_35, "EnglishUSFormula_35");
			return this;
		}
		public ExistingRulesPage enterGlobalVersionID(WebDriver driver,String GlobalVersionID) {
			BrowserActions.type(driver, inpGlobalVersionID,GlobalVersionID, "GlobalVersionID");
			return this;
		}
		public ExistingRulesPage enterOperatorLabel_18(WebDriver driver,String OperatorLabel_18) {
			BrowserActions.type(driver, inpOperatorLabel_18,OperatorLabel_18, "OperatorLabel_18");
			return this;
		}
		public ExistingRulesPage clickSimpleMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveDown,"SimpleMoveDown");
			return this;
		}
		public ExistingRulesPage clickTemplateExpressionMenuIcon_25(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_25,"TemplateExpressionMenuIcon_25");
			return this;
		}
		public ExistingRulesPage selectCheckingSet(WebDriver driver,String CheckingSet)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCheckingSet,CheckingSet,"CheckingSet");
			return this;
		}
		public ExistingRulesPage clickContextHelpALTH(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH,"ContextHelpALTH");
			return this;
		}
		public ExistingRulesPage clickPolicyLines(WebDriver driver)  {
			BrowserActions.click(driver, rdbPolicyLines,"PolicyLines");
			return this;
		}
		public ExistingRulesPage clickRemove_8(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_8,"Remove_8");
			return this;
		}
		public ExistingRulesPage clickLabel_38(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_38,"Label_38");
			return this;
		}
		public ExistingRulesPage enterEdgePolicyholderEnglishUSText_43(WebDriver driver,String EdgePolicyholderEnglishUSText_43) {
			BrowserActions.type(driver, inpEdgePolicyholderEnglishUSText_43,EdgePolicyholderEnglishUSText_43, "EdgePolicyholderEnglishUSText_43");
			return this;
		}
		public ExistingRulesPage enterStartDate(WebDriver driver,String StartDate) {
			BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
			return this;
		}
		public ExistingRulesPage enterLeftOperandLabel(WebDriver driver,String LeftOperandLabel) {
			BrowserActions.type(driver, inpLeftOperandLabel,LeftOperandLabel, "LeftOperandLabel");
			return this;
		}
		public ExistingRulesPage enterAndOrLabel(WebDriver driver,String AndOrLabel) {
			BrowserActions.type(driver, inpAndOrLabel,AndOrLabel, "AndOrLabel");
			return this;
		}
		public ExistingRulesPage clickPromotetoStage(WebDriver driver)  {
			BrowserActions.click(driver, btnPromotetoStage,"PromotetoStage");
			return this;
		}
		public ExistingRulesPage clickEnabled(WebDriver driver)  {
			BrowserActions.click(driver, rdbEnabled,"Enabled");
			return this;
		}
		public ExistingRulesPage clickThisfieldisrequired_34(WebDriver driver)  {
			BrowserActions.click(driver, btnThisfieldisrequired_34,"Thisfieldisrequired_34");
			return this;
		}
		public ExistingRulesPage clickLastEditedbysuon11292022(WebDriver driver)  {
			BrowserActions.click(driver, btnLastEditedbysuon11292022,"LastEditedbysuon11292022");
			return this;
		}
		public ExistingRulesPage enterNovariablesdeclared(WebDriver driver,String Novariablesdeclared) {
			BrowserActions.type(driver, inpNovariablesdeclared,Novariablesdeclared, "Novariablesdeclared");
			return this;
		}
		public ExistingRulesPage selectValueFormatterType(WebDriver driver,String ValueFormatterType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpValueFormatterType,ValueFormatterType,"ValueFormatterType");
			return this;
		}
		public ExistingRulesPage clickLabel_49(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_49,"Label_49");
			return this;
		}
		public ExistingRulesPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public ExistingRulesPage clickPromotetoApproved(WebDriver driver)  {
			BrowserActions.click(driver, btnPromotetoApproved,"PromotetoApproved");
			return this;
		}
		public ExistingRulesPage clickContextHelpALTH_14(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH_14,"ContextHelpALTH_14");
			return this;
		}
		public ExistingRulesPage selectDefaultApprovalBlockingPoint(WebDriver driver,String DefaultApprovalBlockingPoint)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultApprovalBlockingPoint,DefaultApprovalBlockingPoint,"DefaultApprovalBlockingPoint");
			return this;
		}
		public ExistingRulesPage enterOperatorLabel(WebDriver driver,String OperatorLabel) {
			BrowserActions.type(driver, inpOperatorLabel,OperatorLabel, "OperatorLabel");
			return this;
		}
		public ExistingRulesPage clickLabel(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel,"Label");
			return this;
		}
		public ExistingRulesPage selectDefaultValueOffsetCurrency(WebDriver driver,String DefaultValueOffsetCurrency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultValueOffsetCurrency,DefaultValueOffsetCurrency,"DefaultValueOffsetCurrency");
			return this;
		}
		public ExistingRulesPage clickHideValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnHideValidationErrors,"HideValidationErrors");
			return this;
		}
		public ExistingRulesPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public ExistingRulesPage clickEndDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
			return this;
		}
		public ExistingRulesPage enterVariableDescriptionID(WebDriver driver,String VariableDescriptionID) {
			BrowserActions.type(driver, inpVariableDescriptionID,VariableDescriptionID, "VariableDescriptionID");
			return this;
		}
		public ExistingRulesPage clickAdvancedMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveUp,"AdvancedMoveUp");
			return this;
		}
		public ExistingRulesPage selectValueComparator(WebDriver driver,String ValueComparator)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpValueComparator,ValueComparator,"ValueComparator");
			return this;
		}
		public ExistingRulesPage clickShowFormattedView_12(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView_12,"ShowFormattedView_12");
			return this;
		}
		public ExistingRulesPage clickPolicyTransactions(WebDriver driver)  {
			BrowserActions.click(driver, rdbPolicyTransactions,"PolicyTransactions");
			return this;
		}
		public ExistingRulesPage enterEnglishUSFormula(WebDriver driver,String EnglishUSFormula) {
			BrowserActions.type(driver, inpEnglishUSFormula,EnglishUSFormula, "EnglishUSFormula");
			return this;
		}
		public ExistingRulesPage clickViewHistory(WebDriver driver)  {
			BrowserActions.click(driver, btnViewHistory,"ViewHistory");
			return this;
		}
		public ExistingRulesPage enterEdgePolicyholderEnglishUSText(WebDriver driver,String EdgePolicyholderEnglishUSText) {
			BrowserActions.type(driver, inpEdgePolicyholderEnglishUSText,EdgePolicyholderEnglishUSText, "EdgePolicyholderEnglishUSText");
			return this;
		}
		public ExistingRulesPage enterValueText(WebDriver driver,String ValueText) {
			BrowserActions.type(driver, inpValueText,ValueText, "ValueText");
			return this;
		}
		public ExistingRulesPage clickStartDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_28(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_28,"ValidationErrorIcon_28");
			return this;
		}
		public ExistingRulesPage clickExpressionMenuIcon_36(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon_36,"ExpressionMenuIcon_36");
			return this;
		}
		public ExistingRulesPage clickHideFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView,"HideFormattedView");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_21(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_21,"ValidationErrorIcon_21");
			return this;
		}
		public ExistingRulesPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_26(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_26,"ValidationErrorIcon_26");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_23(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_23,"ValidationErrorIcon_23");
			return this;
		}
		public ExistingRulesPage selectDefaultDuration(WebDriver driver,String DefaultDuration)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultDuration,DefaultDuration,"DefaultDuration");
			return this;
		}
		public ExistingRulesPage enterLeftOperandLabel_17(WebDriver driver,String LeftOperandLabel_17) {
			BrowserActions.type(driver, inpLeftOperandLabel_17,LeftOperandLabel_17, "LeftOperandLabel_17");
			return this;
		}
		public ExistingRulesPage clickDeploy(WebDriver driver)  {
			BrowserActions.click(driver, btnDeploy,"Deploy");
			return this;
		}
		public ExistingRulesPage clickTemplateExpressionMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon,"TemplateExpressionMenuIcon");
			return this;
		}
		public ExistingRulesPage selectBlockingPoint(WebDriver driver,String BlockingPoint)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpBlockingPoint,BlockingPoint,"BlockingPoint");
			return this;
		}
		public ExistingRulesPage clickRuleDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnRuleDetails,"RuleDetails");
			return this;
		}
		public ExistingRulesPage clickLabel_27(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_27,"Label_27");
			return this;
		}
		public ExistingRulesPage clickAdvanced(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvanced,"Advanced");
			return this;
		}
		public ExistingRulesPage clickLabel_29(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_29,"Label_29");
			return this;
		}
		public ExistingRulesPage clickLabel_24(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_24,"Label_24");
			return this;
		}
		public ExistingRulesPage enterEdgeEnglishUSText_39(WebDriver driver,String EdgeEnglishUSText_39) {
			BrowserActions.type(driver, inpEdgeEnglishUSText_39,EdgeEnglishUSText_39, "EdgeEnglishUSText_39");
			return this;
		}
		public ExistingRulesPage clickExpressionMenuIcon_47(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon_47,"ExpressionMenuIcon_47");
			return this;
		}
		public ExistingRulesPage enterRightParensLabel(WebDriver driver,String RightParensLabel) {
			BrowserActions.type(driver, inpRightParensLabel,RightParensLabel, "RightParensLabel");
			return this;
		}
		public ExistingRulesPage clickLabel_22(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_22,"Label_22");
			return this;
		}
		public ExistingRulesPage enterVariableNameID(WebDriver driver,String VariableNameID) {
			BrowserActions.type(driver, inpVariableNameID,VariableNameID, "VariableNameID");
			return this;
		}
		public ExistingRulesPage clickAutoapprovable(WebDriver driver)  {
			BrowserActions.click(driver, rdbAutoapprovable,"Autoapprovable");
			return this;
		}
		public ExistingRulesPage clickRemove_11(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_11,"Remove_11");
			return this;
		}
		public ExistingRulesPage clickDefaultEditBeforeBind(WebDriver driver)  {
			BrowserActions.click(driver, rdbDefaultEditBeforeBind,"DefaultEditBeforeBind");
			return this;
		}
		public ExistingRulesPage clickThisfieldisrequired_46(WebDriver driver)  {
			BrowserActions.click(driver, btnThisfieldisrequired_46,"Thisfieldisrequired_46");
			return this;
		}
		public ExistingRulesPage enterDefaultValueOffsetAmount(WebDriver driver,String DefaultValueOffsetAmount) {
			BrowserActions.type(driver, inpDefaultValueOffsetAmount,DefaultValueOffsetAmount, "DefaultValueOffsetAmount");
			return this;
		}
		public ExistingRulesPage clickThisfieldisrequired_42(WebDriver driver)  {
			BrowserActions.click(driver, btnThisfieldisrequired_42,"Thisfieldisrequired_42");
			return this;
		}
		public ExistingRulesPage clickJurisdictions(WebDriver driver)  {
			BrowserActions.click(driver, rdbJurisdictions,"Jurisdictions");
			return this;
		}
		public ExistingRulesPage clickHideFormattedView_13(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView_13,"HideFormattedView_13");
			return this;
		}
		public ExistingRulesPage selectDefaultValueAssignmentType(WebDriver driver,String DefaultValueAssignmentType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDefaultValueAssignmentType,DefaultValueAssignmentType,"DefaultValueAssignmentType");
			return this;
		}
		public ExistingRulesPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public ExistingRulesPage enterRightOperandLabel_19(WebDriver driver,String RightOperandLabel_19) {
			BrowserActions.type(driver, inpRightOperandLabel_19,RightOperandLabel_19, "RightOperandLabel_19");
			return this;
		}
		public ExistingRulesPage enterLeftParensLabel(WebDriver driver,String LeftParensLabel) {
			BrowserActions.type(driver, inpLeftParensLabel,LeftParensLabel, "LeftParensLabel");
			return this;
		}
		public ExistingRulesPage enterRightOperandLabel(WebDriver driver,String RightOperandLabel) {
			BrowserActions.type(driver, inpRightOperandLabel,RightOperandLabel, "RightOperandLabel");
			return this;
		}
		public ExistingRulesPage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return this;
		}
		public ExistingRulesPage clickInsert(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert,"Insert");
			return this;
		}
		public ExistingRulesPage selectPolicyLines(WebDriver driver,String PolicyLines)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLines,PolicyLines,"PolicyLines");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_41(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_41,"ValidationErrorIcon_41");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_48(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_48,"ValidationErrorIcon_48");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_45(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_45,"ValidationErrorIcon_45");
			return this;
		}
		public ExistingRulesPage enterEvaluationContextFormula(WebDriver driver,String EvaluationContextFormula) {
			BrowserActions.type(driver, inpEvaluationContextFormula,EvaluationContextFormula, "EvaluationContextFormula");
			return this;
		}
		public ExistingRulesPage enterEndDate(WebDriver driver,String EndDate) {
			BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
			return this;
		}
		public ExistingRulesPage clickInsert_10(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert_10,"Insert_10");
			return this;
		}
		public ExistingRulesPage enterContextDescription(WebDriver driver,String ContextDescription) {
			BrowserActions.type(driver, inpContextDescription,ContextDescription, "ContextDescription");
			return this;
		}
		public ExistingRulesPage enterEdgeEnglishUSText(WebDriver driver,String EdgeEnglishUSText) {
			BrowserActions.type(driver, inpEdgeEnglishUSText,EdgeEnglishUSText, "EdgeEnglishUSText");
			return this;
		}
		public ExistingRulesPage clickDelete(WebDriver driver)  {
			BrowserActions.click(driver, btnDelete,"Delete");
			return this;
		}
		public ExistingRulesPage clickAdvancedMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveDown,"AdvancedMoveDown");
			return this;
		}
		public ExistingRulesPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public ExistingRulesPage clickThisfieldisrequired(WebDriver driver)  {
			BrowserActions.click(driver, btnThisfieldisrequired,"Thisfieldisrequired");
			return this;
		}
		public ExistingRulesPage clickEnable(WebDriver driver)  {
			BrowserActions.click(driver, btnEnable,"Enable");
			return this;
		}
		public ExistingRulesPage clickAdd_9(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_9,"Add_9");
			return this;
		}
		public ExistingRulesPage clickClose(WebDriver driver)  {
			BrowserActions.click(driver, btnClose,"Close");
			return this;
		}
		public ExistingRulesPage clickAdd_7(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_7,"Add_7");
			return this;
		}
		public ExistingRulesPage clickSimpleMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveUp,"SimpleMoveUp");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_33(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_33,"ValidationErrorIcon_33");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_31(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_31,"ValidationErrorIcon_31");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon_37(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_37,"ValidationErrorIcon_37");
			return this;
		}
		public ExistingRulesPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public ExistingRulesPage clickTemplateExpressionMenuIcon_44(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_44,"TemplateExpressionMenuIcon_44");
			return this;
		}
		public ExistingRulesPage selectPolicyTransactions(WebDriver driver,String PolicyTransactions)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPolicyTransactions,PolicyTransactions,"PolicyTransactions");
			return this;
		}
		public ExistingRulesPage enterExpressionID(WebDriver driver,String ExpressionID) {
			BrowserActions.type(driver, inpExpressionID,ExpressionID, "ExpressionID");
			return this;
		}
		public ExistingRulesPage selectJurisdictions(WebDriver driver,String Jurisdictions)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpJurisdictions,Jurisdictions,"Jurisdictions");
			return this;
		}
		public ExistingRulesPage enterRightParensLabel_20(WebDriver driver,String RightParensLabel_20) {
			BrowserActions.type(driver, inpRightParensLabel_20,RightParensLabel_20, "RightParensLabel_20");
			return this;
		}
		public ExistingRulesPage clickReverttothisversion(WebDriver driver)  {
			BrowserActions.click(driver, btnReverttothisversion,"Reverttothisversion");
			return this;
		}
		public ExistingRulesPage clickValidationErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon,"ValidationErrorIcon");
			return this;
		}
		public ExistingRulesPage clickTemplateExpressionMenuIcon_40(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon_40,"TemplateExpressionMenuIcon_40");
			return this;
		}
		public ExistingRulesPage verifyEditButtonIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnEdit,"Edit Button");
			return this;
		}
		public ExistingRulesPage verifyEnableButtonIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnEnable,"Enable Button");
			return this;
		}
		public ExistingRulesPage verifyDeleteButtonIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnDelete,"Delete Button");
			return this;
		}
		public ExistingRulesPage verifyNameIsDisplayed(WebDriver driver, String ruleName)  {
			String text = BrowserActions.getText(driver, lblName,"Rule name");
			Log.assertThat(text.equals(ruleName), "Correctly view a rule Record", "Not view a record");
			return this;
		}
		public ExistingRulesPage verifyRuleName(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleName, "RuleName");
			return this;
		}
		public ExistingRulesPage verifyRuleCode(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleCode, "RuleCode");
			return this;
		}
		public ExistingRulesPage verifyRuleCheckingSet(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver,lblRuleCheckingSet, "RuleCheckingSet");
			return this;
		}
		public ExistingRulesPage verifyRuleBlockingPoint(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleBlockingPoint, "RuleBlockingPoint");
			return this;
		}
		public ExistingRulesPage verifyRuleDefaultDurationType(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleDefaultDurationType, "RuleDefaultDurationType");
			return this;
		}
		public ExistingRulesPage verifyRuleEnabled(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleEnabled, "RuleEnabled");
			return this;
		}
		public ExistingRulesPage verifyRulePolicyLine(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRulePolicyLine, "RulePolicyLine");
			return this;
		}
		public ExistingRulesPage verifyRuleJurisdictions(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleJurisdictions, "RuleJurisdictions");
			return this;
		}
		public ExistingRulesPage verifyRulePolicyTransactions(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRulePolicyTransactions, "RulePolicyTransactions");
			return this;
		}
		public ExistingRulesPage verifyRuleContextTitle(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleContextTitle, "RuleContextTitle");
			return this;
		}
		public ExistingRulesPage verifyRuleVariableTitle(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleVariableTitle, "RuleVariableTitle");
			return this;
		}
		public ExistingRulesPage verifyRuleUnderwritingIssueDetails(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleUnderwritingIssueDetails, "RuleUnderwritingIssueDetails");
			return this;
		}
		public ExistingRulesPage verifyRuleCondition(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleCondition, "RuleCondition");
			return this;
		}
		public ExistingRulesPage verifyRuleShortDescription(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleShortDescription, "RuleShortDescription");
			return this;
		}
		public ExistingRulesPage verifyRuleLongDescription(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblRuleLongDescription, "RuleLongDescription");
			return this;
		}

	}

}
