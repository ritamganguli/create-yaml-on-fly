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

public class ActivityRulesPage extends LoadableComponent<ActivityRulesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-0-Status']", AI = false)
	public WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_340;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_460;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_580;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_100;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_220;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-3-Status']", AI = false)
	public WebElement inpStatus_51;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_428;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_308;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_548;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_349;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_469;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_589;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_324;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_204;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_109;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_564;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_229;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_444;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_86;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_281;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-15-Context']", AI = false)
	public WebElement drpTriggerEntity_296;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-1-Context']", AI = false)
	public WebElement drpTriggerEntity_16;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_44;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_161;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-9-Context']", AI = false)
	public WebElement drpTriggerEntity_176;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-0-Trigger']", AI = false)
	public WebElement drpTriggerAction;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_533;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_413;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_42;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_408;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_235;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_355;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_475;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_595;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_115;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_186;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-10-Status']", AI = false)
	public WebElement inpStatus_191;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_120;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-10-Version']", AI = false)
	public WebElement inpVersion_192;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_240;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_360;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_480;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_495;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_208;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_23;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_66;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_448;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_328;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_129;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-0-Version']", AI = false)
	public WebElement inpVersion;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_249;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_568;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_369;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_489;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_544;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_424;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-26-Trigger']", AI = false)
	public WebElement drpTriggerAction_517;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_304;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-8-Context']", AI = false)
	public WebElement drpTriggerEntity_156;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_181;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV_tb-Filter>div[role='button']", AI = false)
	public WebElement btnFilter;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_64;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-14-Context']", AI = false)
	public WebElement drpTriggerEntity_276;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-20-Context']", AI = false)
	public WebElement drpTriggerEntity_396;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_433;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_62;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_313;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-2-Status']", AI = false)
	public WebElement inpStatus_31;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-CCSelectedRulesAlertBar .gw-AlertBar--label", AI = false)
	public WebElement lblCCSelectedRulesAlertBar;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_135;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_255;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_375;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_553;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-CreateRuleToolbarButtonSet-Clone>div[role='button']", AI = false)
	public WebElement btnClone;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_300;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_420;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-5-Status']", AI = false)
	public WebElement inpStatus_91;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_540;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_228;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_46;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_108;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_468;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-LossTypes textarea", AI = false)
	public WebElement inpLossType_199;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_348;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_43;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_588;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_309;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-27-ActionType']", AI = false)
	public WebElement inpActionType_538;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-21-ActionType']", AI = false)
	public WebElement inpActionType_418;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_429;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_124;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_549;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-13-Context']", AI = false)
	public WebElement drpTriggerEntity_256;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-19-Context']", AI = false)
	public WebElement drpTriggerEntity_376;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-7-Context']", AI = false)
	public WebElement drpTriggerEntity_136;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_364;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_244;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-25-Context']", AI = false)
	public WebElement drpTriggerEntity_496;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_484;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_213;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-5-ActionType']", AI = false)
	public WebElement inpActionType_98;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-ValidationStatusToolbarInput']", AI = false)
	public WebElement inpValidationStatusToolbarInput;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-8-Status']", AI = false)
	public WebElement inpStatus_151;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-14-Status']", AI = false)
	public WebElement inpStatus_271;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_315;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_573;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-20-Status']", AI = false)
	public WebElement inpStatus_391;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_435;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_453;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_333;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_555;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-Availability']", AI = false)
	public WebElement drpAvailability;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_84;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-10-Name']", AI = false)
	public WebElement inpName_190;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-15-Name']", AI = false)
	public WebElement inpName_290;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-9-Name']", AI = false)
	public WebElement inpName_170;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_560;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_200;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_320;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_440;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-4-Status']", AI = false)
	public WebElement inpStatus_71;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-LossTypes textarea", AI = false)
	public WebElement inpLossType_179;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_248;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-LossTypes textarea", AI = false)
	public WebElement inpLossType_299;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_569;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_26;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_63;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_128;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_488;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-26-ActionType']", AI = false)
	public WebElement inpActionType_518;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_368;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_104;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_209;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_329;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_344;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_224;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_449;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-24-Context']", AI = false)
	public WebElement drpTriggerEntity_476;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-30-Context']", AI = false)
	public WebElement drpTriggerEntity_596;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RollingUpgradeAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-12-Context']", AI = false)
	public WebElement drpTriggerEntity_236;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-18-Context']", AI = false)
	public WebElement drpTriggerEntity_356;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_584;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_464;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-PolicyTypeFilter']", AI = false)
	public WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_22;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_21;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_455;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_575;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_593;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_473;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-DisableSelectedRules>div[role='menuitem']", AI = false)
	public WebElement btnDisableSelected;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_353;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-9-Status']", AI = false)
	public WebElement inpStatus_171;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_215;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_233;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_113;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-15-Status']", AI = false)
	public WebElement inpStatus_291;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_335;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-6-Context']", AI = false)
	public WebElement drpTriggerEntity_116;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-LossTypes textarea", AI = false)
	public WebElement inpLossType_39;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-5-Name']", AI = false)
	public WebElement inpName_90;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-ValidationProgressAlert .gw-AlertBar--label", AI = false)
	public WebElement lblValidationProgressAlert;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_83;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_285;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-RuleFilterCriteriaRuleActionInputSet-Expression']", AI = false)
	public WebElement inpExpression;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-CCSelectedRulesAlertBar-CloseBtn", AI = false)
	public WebElement btnClose_4;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_500;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-ValidationProcessFailedAlert-CloseBtn", AI = false)
	public WebElement btnClose_3;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_165;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_195;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-ValidationProgressAlert-CloseBtn", AI = false)
	public WebElement btnClose_2;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-PendingImportAlert-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_189;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-4-Version']", AI = false)
	public WebElement inpVersion_72;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_268;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_148;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_35;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_388;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-JurisdictionFilter']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_604;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_74;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_514;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_27;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_201;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_321;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_441;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_523;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_561;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_41;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_403;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-5-Context']", AI = false)
	public WebElement drpTriggerEntity_96;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-3-ActionType']", AI = false)
	public WebElement inpActionType_58;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-6-Status']", AI = false)
	public WebElement inpStatus_111;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-12-Status']", AI = false)
	public WebElement inpStatus_231;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-18-Status']", AI = false)
	public WebElement inpStatus_351;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_29;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-24-Status']", AI = false)
	public WebElement inpStatus_471;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-2-Trigger']", AI = false)
	public WebElement drpTriggerAction_37;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-30-Status']", AI = false)
	public WebElement inpStatus_591;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-RuleFilterCriteriaRuleActionInputSet-HistoryEventType']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_466;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_586;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_226;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_346;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_106;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-LossTypes textarea", AI = false)
	public WebElement inpLossType_19;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-4-Name']", AI = false)
	public WebElement inpName_70;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_520;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV_tb-Clear>div[role='button']", AI = false)
	public WebElement btnClear;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_185;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_400;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-3-Version']", AI = false)
	public WebElement inpVersion_52;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_563;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_288;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_168;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_15;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_34;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_54;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-0-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_461;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_581;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_47;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-4-Context']", AI = false)
	public WebElement drpTriggerEntity_76;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_543;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_101;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-BulkEdit>div[role='button']", AI = false)
	public WebElement btnBulkEdit;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_61;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_187;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_221;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_303;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_341;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_423;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-4-ActionType']", AI = false)
	public WebElement inpActionType_78;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-7-Status']", AI = false)
	public WebElement inpStatus_131;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-13-Status']", AI = false)
	public WebElement inpStatus_251;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-19-Status']", AI = false)
	public WebElement inpStatus_371;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-CreateRuleToolbarButtonSet-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-25-Status']", AI = false)
	public WebElement inpStatus_491;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_486;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-1-Trigger']", AI = false)
	public WebElement drpTriggerAction_17;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_246;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_366;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_126;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-3-Name']", AI = false)
	public WebElement inpName_50;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-EnableSelectedRules>div[role='menuitem']", AI = false)
	public WebElement btnEnableSelected;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-2-Version']", AI = false)
	public WebElement inpVersion_32;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_275;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_395;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_282;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_389;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_149;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_269;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_80;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_188;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_524;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_404;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-1-ActionType']", AI = false)
	public WebElement inpActionType_18;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_241;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_361;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_481;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_82;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_81;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_167;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-3-Context']", AI = false)
	public WebElement drpTriggerEntity_56;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_67;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_121;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_287;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_314;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_434;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-16-Status']", AI = false)
	public WebElement inpStatus_311;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_554;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-22-Status']", AI = false)
	public WebElement inpStatus_431;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_603;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_162;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-28-Status']", AI = false)
	public WebElement inpStatus_551;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_155;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_266;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_386;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-IncidentType textarea", AI = false)
	public WebElement inpIncidentType;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_146;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-2-Name']", AI = false)
	public WebElement inpName_30;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-1-Version']", AI = false)
	public WebElement inpVersion_12;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_175;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_600;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_182;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_295;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_169;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_289;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_60;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_504;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-LossTypeFilter']", AI = false)
	public WebElement drpLossType;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_24;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-2-ActionType']", AI = false)
	public WebElement inpActionType_38;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_414;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-2-Context']", AI = false)
	public WebElement drpTriggerEntity_36;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_94;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_141;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-10-Context']", AI = false)
	public WebElement drpTriggerEntity_196;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_261;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_381;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_387;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_267;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_513;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_87;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_503;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_534;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-11-Status']", AI = false)
	public WebElement inpStatus_211;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-17-Status']", AI = false)
	public WebElement inpStatus_331;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-23-Status']", AI = false)
	public WebElement inpStatus_451;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-29-Status']", AI = false)
	public WebElement inpStatus_571;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_147;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_286;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_166;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-9-ActionType']", AI = false)
	public WebElement inpActionType_178;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-15-ActionType']", AI = false)
	public WebElement inpActionType_298;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_205;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_325;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-28-Name']", AI = false)
	public WebElement inpName_550;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-22-Name']", AI = false)
	public WebElement inpName_430;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-16-Name']", AI = false)
	public WebElement inpName_310;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_445;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_565;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-1-Name']", AI = false)
	public WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_88;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_383;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_143;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_263;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-RuleFilterCriteriaRuleActionInputSet-ActionTypeFilter']", AI = false)
	public WebElement drpRuleAction;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_25;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_40;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_45;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_506;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_354;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_474;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_487;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_594;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-LossTypes textarea", AI = false)
	public WebElement inpLossType_319;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-LossTypes textarea", AI = false)
	public WebElement inpLossType_439;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-26-Status']", AI = false)
	public WebElement inpStatus_511;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_601;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-0-Context']", AI = false)
	public WebElement drpTriggerEntity;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-9-Trigger']", AI = false)
	public WebElement drpTriggerAction_177;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-LossTypes textarea", AI = false)
	public WebElement inpLossType_559;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_114;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-15-Trigger']", AI = false)
	public WebElement drpTriggerAction_297;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_234;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_482;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_242;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_362;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_122;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_127;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_367;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_247;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-26-Version']", AI = false)
	public WebElement inpVersion_512;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-20-ActionType']", AI = false)
	public WebElement inpActionType_398;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-14-ActionType']", AI = false)
	public WebElement inpActionType_278;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_105;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_7;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_95;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_465;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-LossTypes textarea", AI = false)
	public WebElement inpLossType_99;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-27-Name']", AI = false)
	public WebElement inpName_530;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_585;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_225;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-21-Name']", AI = false)
	public WebElement inpName_410;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-RuleFilterCriteriaRuleActionInputSet-ActivityPattern']", AI = false)
	public WebElement drpActivityPattern;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_345;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_163;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_283;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RollingUpgradeAlert .gw-AlertBar--label", AI = false)
	public WebElement lblRollingUpgradeAlert;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_20;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-8-ActionType']", AI = false)
	public WebElement inpActionType_158;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_406;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_526;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_65;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_9;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_13;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_574;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_5;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-LossTypes textarea", AI = false)
	public WebElement inpLossType_419;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-LossTypes textarea", AI = false)
	public WebElement inpLossType_539;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_214;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-21-Status']", AI = false)
	public WebElement inpStatus_411;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_501;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_334;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-27-Status']", AI = false)
	public WebElement inpStatus_531;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-10-Trigger']", AI = false)
	public WebElement drpTriggerAction_197;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_454;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_262;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_382;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-5-Trigger']", AI = false)
	public WebElement drpTriggerAction_97;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_107;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_142;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_347;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_227;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_587;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_467;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_89;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-ShowHideFilter>div[role='button']", AI = false)
	public WebElement btnShowFilters;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-23-Version']", AI = false)
	public WebElement inpVersion_452;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-29-Version']", AI = false)
	public WebElement inpVersion_572;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_75;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-LossTypes textarea", AI = false)
	public WebElement inpLossType_79;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_245;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-BulkEdit-ExportToCsv>div[role='menuitem']", AI = false)
	public WebElement btnEditAllinSpreadsheet;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_365;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_125;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-26-Name']", AI = false)
	public WebElement inpName_510;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_485;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-7-Trigger']", AI = false)
	public WebElement drpTriggerAction_137;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-13-Trigger']", AI = false)
	public WebElement drpTriggerAction_257;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-19-Trigger']", AI = false)
	public WebElement drpTriggerAction_377;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_583;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton>div[role='button']", AI = false)
	public WebElement btnDeploy;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_343;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_463;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_14;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_306;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_323;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_443;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-LossTypes textarea", AI = false)
	public WebElement inpLossType_519;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_154;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_203;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_274;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_28;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-25-Trigger']", AI = false)
	public WebElement drpTriggerAction_497;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_401;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_521;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton-DeployAll>div[role='menuitem']", AI = false)
	public WebElement btnDeployAll;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-4-Trigger']", AI = false)
	public WebElement drpTriggerAction_77;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-ExportSelectedToCsv>div[role='button']", AI = false)
	public WebElement btnBulkEditSelected;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_327;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_207;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_394;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_442;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_567;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_447;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_562;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_202;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_322;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-LossTypes textarea", AI = false)
	public WebElement inpLossType;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-22-Version']", AI = false)
	public WebElement inpVersion_432;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-28-Version']", AI = false)
	public WebElement inpVersion_552;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_426;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_69;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-16-Version']", AI = false)
	public WebElement inpVersion_312;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_546;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-10-ActionType']", AI = false)
	public WebElement inpActionType_198;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-LossTypes textarea", AI = false)
	public WebElement inpLossType_59;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_145;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_6;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_265;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_385;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_68;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-5-Version']", AI = false)
	public WebElement inpVersion_92;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-8-Trigger']", AI = false)
	public WebElement drpTriggerAction_157;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_363;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_483;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_123;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_243;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_55;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_103;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_134;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_421;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_223;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_254;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_541;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_374;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_494;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-14-Trigger']", AI = false)
	public WebElement drpTriggerAction_277;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-20-Trigger']", AI = false)
	public WebElement drpTriggerAction_397;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_48;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_301;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-16-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_307;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_462;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-28-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_547;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-22-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_427;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_582;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_222;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_342;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-3-Trigger']", AI = false)
	public WebElement drpTriggerAction_57;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_102;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-ExportSelected>div[role='menuitem']", AI = false)
	public WebElement btnExportSelected;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_446;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_49;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_566;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_206;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-21-Version']", AI = false)
	public WebElement inpVersion_412;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_326;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-27-Version']", AI = false)
	public WebElement inpVersion_532;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-13-Version']", AI = false)
	public WebElement inpVersion_252;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_605;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-TextFilter']", AI = false)
	public WebElement inpNameDescription;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-19-Version']", AI = false)
	public WebElement inpVersion_372;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-20-Name']", AI = false)
	public WebElement inpName_390;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_180;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-14-Name']", AI = false)
	public WebElement inpName_270;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-7-Version']", AI = false)
	public WebElement inpVersion_132;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-8-Name']", AI = false)
	public WebElement inpName_150;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-25-Version']", AI = false)
	public WebElement inpVersion_492;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-23-Trigger']", AI = false)
	public WebElement drpTriggerAction_457;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-LossTypes textarea", AI = false)
	public WebElement inpLossType_159;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-29-Trigger']", AI = false)
	public WebElement drpTriggerAction_577;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-LossTypes textarea", AI = false)
	public WebElement inpLossType_279;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-LossTypes textarea", AI = false)
	public WebElement inpLossType_399;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-11-Trigger']", AI = false)
	public WebElement drpTriggerAction_217;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-17-Trigger']", AI = false)
	public WebElement drpTriggerAction_337;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-17-ActionType']", AI = false)
	public WebElement inpActionType_338;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-11-ActionType']", AI = false)
	public WebElement inpActionType_218;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-29-ActionType']", AI = false)
	public WebElement inpActionType_578;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-23-ActionType']", AI = false)
	public WebElement inpActionType_458;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_509;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_284;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-23-Context']", AI = false)
	public WebElement drpTriggerEntity_456;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-29-Context']", AI = false)
	public WebElement drpTriggerEntity_576;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_164;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_73;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_527;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_407;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_493;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_373;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_253;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_133;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_194;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_402;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_522;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_515;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-11-Context']", AI = false)
	public WebElement drpTriggerEntity_216;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-6-Version']", AI = false)
	public WebElement inpVersion_112;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-17-Context']", AI = false)
	public WebElement drpTriggerEntity_336;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-24-Version']", AI = false)
	public WebElement inpVersion_472;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_505;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-30-Version']", AI = false)
	public WebElement inpVersion_592;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-12-Version']", AI = false)
	public WebElement inpVersion_232;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-25-Name']", AI = false)
	public WebElement inpName_490;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-18-Version']", AI = false)
	public WebElement inpVersion_352;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-19-Name']", AI = false)
	public WebElement inpName_370;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-13-Name']", AI = false)
	public WebElement inpName_250;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-7-Name']", AI = false)
	public WebElement inpName_130;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_8;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-5-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_93;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-12-Trigger']", AI = false)
	public WebElement drpTriggerAction_237;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-LossTypes textarea", AI = false)
	public WebElement inpLossType_259;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-18-Trigger']", AI = false)
	public WebElement drpTriggerAction_357;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-LossTypes textarea", AI = false)
	public WebElement inpLossType_379;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-24-Trigger']", AI = false)
	public WebElement drpTriggerAction_477;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-LossTypes textarea", AI = false)
	public WebElement inpLossType_499;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-0-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-30-Trigger']", AI = false)
	public WebElement drpTriggerAction_597;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-6-Trigger']", AI = false)
	public WebElement drpTriggerAction_117;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton-DeploySelected>div[role='menuitem']", AI = false)
	public WebElement btnDeploySelected;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-16-ActionType']", AI = false)
	public WebElement inpActionType_318;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_529;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-28-ActionType']", AI = false)
	public WebElement inpActionType_558;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-22-ActionType']", AI = false)
	public WebElement inpActionType_438;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_409;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_144;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_384;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_264;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-LossTypes textarea", AI = false)
	public WebElement inpLossType_139;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_393;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_273;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_153;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_174;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_415;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_294;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_535;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_422;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_542;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_302;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-11-Version']", AI = false)
	public WebElement inpVersion_212;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-22-Context']", AI = false)
	public WebElement drpTriggerEntity_436;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-17-Version']", AI = false)
	public WebElement inpVersion_332;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-28-Context']", AI = false)
	public WebElement drpTriggerEntity_556;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_507;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-16-Context']", AI = false)
	public WebElement drpTriggerEntity_316;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-19-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_380;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-25-ActionType']", AI = false)
	public WebElement inpActionType_498;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-30-Name']", AI = false)
	public WebElement inpName_590;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-15-Version']", AI = false)
	public WebElement inpVersion_292;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-24-Name']", AI = false)
	public WebElement inpName_470;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-18-Name']", AI = false)
	public WebElement inpName_350;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-7-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_140;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-12-Name']", AI = false)
	public WebElement inpName_230;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-20-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_405;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-6-Name']", AI = false)
	public WebElement inpName_110;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-9-Version']", AI = false)
	public WebElement inpVersion_172;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-13-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_260;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_525;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-0-ActionType']", AI = false)
	public WebElement inpActionType;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_183;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-24-LossTypes textarea", AI = false)
	public WebElement inpLossType_479;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-PendingImportAlert .gw-AlertBar--label", AI = false)
	public WebElement lblPendingImportAlert;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-LossTypes textarea", AI = false)
	public WebElement inpLossType_599;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-21-Trigger']", AI = false)
	public WebElement drpTriggerAction_417;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-27-Trigger']", AI = false)
	public WebElement drpTriggerAction_537;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-MoreButton>div[role='button']", AI = false)
	public WebElement btnMore;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-7-ActionType']", AI = false)
	public WebElement inpActionType_138;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-ExportAll>div[role='menuitem']", AI = false)
	public WebElement btnExportAll;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-19-ActionType']", AI = false)
	public WebElement inpActionType_378;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-13-ActionType']", AI = false)
	public WebElement inpActionType_258;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-4-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_85;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_33;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-6-LossTypes textarea", AI = false)
	public WebElement inpLossType_119;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-12-LossTypes textarea", AI = false)
	public WebElement inpLossType_239;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-18-LossTypes textarea", AI = false)
	public WebElement inpLossType_359;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_293;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_173;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-1-Status']", AI = false)
	public WebElement lblStatus;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-Import>div[role='menuitem']", AI = false)
	public WebElement btnImportfromFile;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-30-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_602;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-21-Context']", AI = false)
	public WebElement drpTriggerEntity_416;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-27-Context']", AI = false)
	public WebElement drpTriggerEntity_536;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-8-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_160;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-8-Version']", AI = false)
	public WebElement inpVersion_152;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-14-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_280;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-21-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_425;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_545;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-29-Name']", AI = false)
	public WebElement inpName_570;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-14-Version']", AI = false)
	public WebElement inpVersion_272;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-23-Name']", AI = false)
	public WebElement inpName_450;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-15-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_305;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-17-Name']", AI = false)
	public WebElement inpName_330;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-20-Version']", AI = false)
	public WebElement inpVersion_392;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-11-Name']", AI = false)
	public WebElement inpName_210;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-ValidationProcessFailedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblDependentonRender;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-27-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_528;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-16-Trigger']", AI = false)
	public WebElement drpTriggerAction_317;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-22-Trigger']", AI = false)
	public WebElement drpTriggerAction_437;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-28-Trigger']", AI = false)
	public WebElement drpTriggerAction_557;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-6-ActionType']", AI = false)
	public WebElement inpActionType_118;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-18-ActionType']", AI = false)
	public WebElement inpActionType_358;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-12-ActionType']", AI = false)
	public WebElement inpActionType_238;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-30-ActionType']", AI = false)
	public WebElement inpActionType_598;

	@IFindBy(how = How.CSS, using = "input[name='ActivityRules-CCRulesListScreen-RulesLV-24-ActionType']", AI = false)
	public WebElement inpActionType_478;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-9-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_184;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_53;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-11-LossTypes textarea", AI = false)
	public WebElement inpLossType_219;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-17-LossTypes textarea", AI = false)
	public WebElement inpLossType_339;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-23-LossTypes textarea", AI = false)
	public WebElement inpLossType_459;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-26-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_508;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-29-LossTypes textarea", AI = false)
	public WebElement inpLossType_579;

	@IFindBy(how = How.CSS, using = "select[name='ActivityRules-CCRulesListScreen-RulesLV-26-Context']", AI = false)
	public WebElement drpTriggerEntity_516;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-BulkEdit-ImportFromCsv>div[role='menuitem']", AI = false)
	public WebElement btnLoadfromSpreadsheet;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-25-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_502;

	@IFindBy(how = How.CSS, using = "#ActivityRules-CCRulesListScreen-RulesLV-10-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_193;
	
	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Name_button']", AI = false)
	public WebElement lblName;
	
	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Trigger']", AI = false)
	public WebElement lblTriggerAction;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Context']", AI = false)
	public WebElement lblTriggerEntity;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-ActionType']", AI = false)
	public WebElement lblActionType;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-LossTypes']", AI = false)
	public WebElement lblLossType;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Jurisdictions']", AI = false)
	public WebElement lblJurisdictions;
	
	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-PolicyTypes']", AI = false)
	public WebElement lblPolicyTypes;
	
	@IFindBy(how = How.CSS, using = "div[id$='DeleteWip']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityRuleDetail_UpLink']", AI = false)
	public WebElement btnUpToActivityRules;
	
	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public List<WebElement> lblLastPageNo;
	
	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;
	
	@IFindBy(how = How.CSS, using = "div[id$='LossTypesHeader']", AI = false)
	public WebElement lblLossTypeHeader;

	public ActivityRulesPage(){
	}

	public ActivityRulesPage(WebDriver driver) throws Exception{
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
	}public ActivityRulesPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public ActivityRulesPage enterPolicyType_340(WebDriver driver,String PolicyType_340) {
		BrowserActions.type(driver, inpPolicyType_340,PolicyType_340, "PolicyType_340");
		return this;
	}
	public ActivityRulesPage enterPolicyType_460(WebDriver driver,String PolicyType_460) {
		BrowserActions.type(driver, inpPolicyType_460,PolicyType_460, "PolicyType_460");
		return this;
	}
	public ActivityRulesPage enterPolicyType_580(WebDriver driver,String PolicyType_580) {
		BrowserActions.type(driver, inpPolicyType_580,PolicyType_580, "PolicyType_580");
		return this;
	}
	public ActivityRulesPage enterPolicyType_100(WebDriver driver,String PolicyType_100) {
		BrowserActions.type(driver, inpPolicyType_100,PolicyType_100, "PolicyType_100");
		return this;
	}
	public ActivityRulesPage enterPolicyType_220(WebDriver driver,String PolicyType_220) {
		BrowserActions.type(driver, inpPolicyType_220,PolicyType_220, "PolicyType_220");
		return this;
	}
	public ActivityRulesPage enterStatus_51(WebDriver driver,String Status_51) {
		BrowserActions.type(driver, inpStatus_51,Status_51, "Status_51");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_428(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_428,"PrevExecuting_428");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_308(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_308,"PrevExecuting_308");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_548(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_548,"PrevExecuting_548");
		return this;
	}
	public ActivityRulesPage clickUnknown_349(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_349,"Unknown_349");
		return this;
	}
	public ActivityRulesPage clickUnknown_469(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_469,"Unknown_469");
		return this;
	}
	public ActivityRulesPage clickUnknown_589(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_589,"Unknown_589");
		return this;
	}
	public ActivityRulesPage enterExposureType_324(WebDriver driver,String ExposureType_324) {
		BrowserActions.type(driver, inpExposureType_324,ExposureType_324, "ExposureType_324");
		return this;
	}
	public ActivityRulesPage enterExposureType_204(WebDriver driver,String ExposureType_204) {
		BrowserActions.type(driver, inpExposureType_204,ExposureType_204, "ExposureType_204");
		return this;
	}
	public ActivityRulesPage clickUnknown_109(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_109,"Unknown_109");
		return this;
	}
	public ActivityRulesPage enterExposureType_564(WebDriver driver,String ExposureType_564) {
		BrowserActions.type(driver, inpExposureType_564,ExposureType_564, "ExposureType_564");
		return this;
	}
	public ActivityRulesPage clickUnknown_229(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_229,"Unknown_229");
		return this;
	}
	public ActivityRulesPage enterExposureType_444(WebDriver driver,String ExposureType_444) {
		BrowserActions.type(driver, inpExposureType_444,ExposureType_444, "ExposureType_444");
		return this;
	}
	public ActivityRulesPage clickNotExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting,"NotExecuting");
		return this;
	}
	public ActivityRulesPage clickExecuting_86(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_86,"Executing_86");
		return this;
	}
	public ActivityRulesPage enterIncidentType_281(WebDriver driver,String IncidentType_281) {
		BrowserActions.type(driver, inpIncidentType_281,IncidentType_281, "IncidentType_281");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_296(WebDriver driver,String TriggerEntity_296)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_296,TriggerEntity_296,"TriggerEntity_296");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_16(WebDriver driver,String TriggerEntity_16)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_16,TriggerEntity_16,"TriggerEntity_16");
		return this;
	}
	public ActivityRulesPage enterExposureType_44(WebDriver driver,String ExposureType_44) {
		BrowserActions.type(driver, inpExposureType_44,ExposureType_44, "ExposureType_44");
		return this;
	}
	public ActivityRulesPage enterIncidentType_161(WebDriver driver,String IncidentType_161) {
		BrowserActions.type(driver, inpIncidentType_161,IncidentType_161, "IncidentType_161");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_176(WebDriver driver,String TriggerEntity_176)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_176,TriggerEntity_176,"TriggerEntity_176");
		return this;
	}
	public ActivityRulesPage selectTriggerAction(WebDriver driver,String TriggerAction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction,TriggerAction,"TriggerAction");
		return this;
	}
	public ActivityRulesPage clickInvalid_533(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_533,"Invalid_533");
		return this;
	}
	public ActivityRulesPage clickInvalid_413(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_413,"Invalid_413");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_42(WebDriver driver,String LossPartyType_42) {
		BrowserActions.type(driver, inpLossPartyType_42,LossPartyType_42, "LossPartyType_42");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_408(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_408,"PrevExecuting_408");
		return this;
	}
	public ActivityRulesPage clickUnknown_235(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_235,"Unknown_235");
		return this;
	}
	public ActivityRulesPage clickUnknown_355(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_355,"Unknown_355");
		return this;
	}
	public ActivityRulesPage clickUnknown_475(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_475,"Unknown_475");
		return this;
	}
	public ActivityRulesPage clickUnknown_595(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_595,"Unknown_595");
		return this;
	}
	public ActivityRulesPage clickUnknown_115(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_115,"Unknown_115");
		return this;
	}
	public ActivityRulesPage clickExecuting_186(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_186,"Executing_186");
		return this;
	}
	public ActivityRulesPage enterStatus_191(WebDriver driver,String Status_191) {
		BrowserActions.type(driver, inpStatus_191,Status_191, "Status_191");
		return this;
	}
	public ActivityRulesPage enterPolicyType_120(WebDriver driver,String PolicyType_120) {
		BrowserActions.type(driver, inpPolicyType_120,PolicyType_120, "PolicyType_120");
		return this;
	}
	public ActivityRulesPage enterVersion_192(WebDriver driver,String Version_192) {
		BrowserActions.type(driver, inpVersion_192,Version_192, "Version_192");
		return this;
	}
	public ActivityRulesPage enterPolicyType_240(WebDriver driver,String PolicyType_240) {
		BrowserActions.type(driver, inpPolicyType_240,PolicyType_240, "PolicyType_240");
		return this;
	}
	public ActivityRulesPage enterPolicyType_360(WebDriver driver,String PolicyType_360) {
		BrowserActions.type(driver, inpPolicyType_360,PolicyType_360, "PolicyType_360");
		return this;
	}
	public ActivityRulesPage enterPolicyType_480(WebDriver driver,String PolicyType_480) {
		BrowserActions.type(driver, inpPolicyType_480,PolicyType_480, "PolicyType_480");
		return this;
	}
	public ActivityRulesPage clickUnknown_495(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_495,"Unknown_495");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_208(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_208,"PrevExecuting_208");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_23(WebDriver driver,String Jurisdiction_23) {
		BrowserActions.type(driver, inpJurisdiction_23,Jurisdiction_23, "Jurisdiction_23");
		return this;
	}
	public ActivityRulesPage clickExecuting_66(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_66,"Executing_66");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_448(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_448,"PrevExecuting_448");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_328(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_328,"PrevExecuting_328");
		return this;
	}
	public ActivityRulesPage clickUnknown_129(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_129,"Unknown_129");
		return this;
	}
	public ActivityRulesPage enterVersion(WebDriver driver,String Version) {
		BrowserActions.type(driver, inpVersion,Version, "Version");
		return this;
	}
	public ActivityRulesPage clickUnknown_249(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_249,"Unknown_249");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_568(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_568,"PrevExecuting_568");
		return this;
	}
	public ActivityRulesPage clickUnknown_369(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_369,"Unknown_369");
		return this;
	}
	public ActivityRulesPage clickUnknown_489(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_489,"Unknown_489");
		return this;
	}
	public ActivityRulesPage enterExposureType_544(WebDriver driver,String ExposureType_544) {
		BrowserActions.type(driver, inpExposureType_544,ExposureType_544, "ExposureType_544");
		return this;
	}
	public ActivityRulesPage enterExposureType_424(WebDriver driver,String ExposureType_424) {
		BrowserActions.type(driver, inpExposureType_424,ExposureType_424, "ExposureType_424");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_517(WebDriver driver,String TriggerAction_517)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_517,TriggerAction_517,"TriggerAction_517");
		return this;
	}
	public ActivityRulesPage enterExposureType_304(WebDriver driver,String ExposureType_304) {
		BrowserActions.type(driver, inpExposureType_304,ExposureType_304, "ExposureType_304");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_156(WebDriver driver,String TriggerEntity_156)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_156,TriggerEntity_156,"TriggerEntity_156");
		return this;
	}
	public ActivityRulesPage enterIncidentType_181(WebDriver driver,String IncidentType_181) {
		BrowserActions.type(driver, inpIncidentType_181,IncidentType_181, "IncidentType_181");
		return this;
	}
	public ActivityRulesPage clickFilter(WebDriver driver)  {
		BrowserActions.click(driver, btnFilter,"Filter");
		return this;
	}
	public ActivityRulesPage enterExposureType_64(WebDriver driver,String ExposureType_64) {
		BrowserActions.type(driver, inpExposureType_64,ExposureType_64, "ExposureType_64");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_276(WebDriver driver,String TriggerEntity_276)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_276,TriggerEntity_276,"TriggerEntity_276");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_396(WebDriver driver,String TriggerEntity_396)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_396,TriggerEntity_396,"TriggerEntity_396");
		return this;
	}
	public ActivityRulesPage clickInvalid_433(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_433,"Invalid_433");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_62(WebDriver driver,String LossPartyType_62) {
		BrowserActions.type(driver, inpLossPartyType_62,LossPartyType_62, "LossPartyType_62");
		return this;
	}
	public ActivityRulesPage clickInvalid_313(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_313,"Invalid_313");
		return this;
	}
	public ActivityRulesPage clickExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting,"Executing");
		return this;
	}
	public ActivityRulesPage enterStatus_31(WebDriver driver,String Status_31) {
		BrowserActions.type(driver, inpStatus_31,Status_31, "Status_31");
		return this;
	}
	public ActivityRulesPage clickUnknown_135(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_135,"Unknown_135");
		return this;
	}
	public ActivityRulesPage clickUnknown_255(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_255,"Unknown_255");
		return this;
	}
	public ActivityRulesPage clickUnknown_375(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_375,"Unknown_375");
		return this;
	}
	public ActivityRulesPage clickInvalid_553(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_553,"Invalid_553");
		return this;
	}
	public ActivityRulesPage clickClone(WebDriver driver)  {
		BrowserActions.click(driver, btnClone,"Clone");
		return this;
	}
	public ActivityRulesPage enterPolicyType_300(WebDriver driver,String PolicyType_300) {
		BrowserActions.type(driver, inpPolicyType_300,PolicyType_300, "PolicyType_300");
		return this;
	}
	public ActivityRulesPage enterPolicyType_420(WebDriver driver,String PolicyType_420) {
		BrowserActions.type(driver, inpPolicyType_420,PolicyType_420, "PolicyType_420");
		return this;
	}
	public ActivityRulesPage enterStatus_91(WebDriver driver,String Status_91) {
		BrowserActions.type(driver, inpStatus_91,Status_91, "Status_91");
		return this;
	}
	public ActivityRulesPage enterPolicyType_540(WebDriver driver,String PolicyType_540) {
		BrowserActions.type(driver, inpPolicyType_540,PolicyType_540, "PolicyType_540");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_228(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_228,"PrevExecuting_228");
		return this;
	}
	public ActivityRulesPage clickExecuting_46(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_46,"Executing_46");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_108(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_108,"PrevExecuting_108");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_468(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_468,"PrevExecuting_468");
		return this;
	}
	public ActivityRulesPage enterLossType_199(WebDriver driver,String LossType_199) {
		BrowserActions.type(driver, inpLossType_199,LossType_199, "LossType_199");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_348(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_348,"PrevExecuting_348");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_43(WebDriver driver,String Jurisdiction_43) {
		BrowserActions.type(driver, inpJurisdiction_43,Jurisdiction_43, "Jurisdiction_43");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_588(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_588,"PrevExecuting_588");
		return this;
	}
	public ActivityRulesPage clickUnknown_309(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_309,"Unknown_309");
		return this;
	}
	public ActivityRulesPage enterActionType_538(WebDriver driver,String ActionType_538) {
		BrowserActions.type(driver, inpActionType_538,ActionType_538, "ActionType_538");
		return this;
	}
	public ActivityRulesPage enterActionType_418(WebDriver driver,String ActionType_418) {
		BrowserActions.type(driver, inpActionType_418,ActionType_418, "ActionType_418");
		return this;
	}
	public ActivityRulesPage clickUnknown_429(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_429,"Unknown_429");
		return this;
	}
	public ActivityRulesPage enterExposureType_124(WebDriver driver,String ExposureType_124) {
		BrowserActions.type(driver, inpExposureType_124,ExposureType_124, "ExposureType_124");
		return this;
	}
	public ActivityRulesPage clickUnknown_549(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_549,"Unknown_549");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_256(WebDriver driver,String TriggerEntity_256)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_256,TriggerEntity_256,"TriggerEntity_256");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_376(WebDriver driver,String TriggerEntity_376)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_376,TriggerEntity_376,"TriggerEntity_376");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_136(WebDriver driver,String TriggerEntity_136)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_136,TriggerEntity_136,"TriggerEntity_136");
		return this;
	}
	public ActivityRulesPage enterExposureType_364(WebDriver driver,String ExposureType_364) {
		BrowserActions.type(driver, inpExposureType_364,ExposureType_364, "ExposureType_364");
		return this;
	}
	public ActivityRulesPage enterExposureType_244(WebDriver driver,String ExposureType_244) {
		BrowserActions.type(driver, inpExposureType_244,ExposureType_244, "ExposureType_244");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_496(WebDriver driver,String TriggerEntity_496)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_496,TriggerEntity_496,"TriggerEntity_496");
		return this;
	}
	public ActivityRulesPage enterExposureType_484(WebDriver driver,String ExposureType_484) {
		BrowserActions.type(driver, inpExposureType_484,ExposureType_484, "ExposureType_484");
		return this;
	}
	public ActivityRulesPage clickInvalid_213(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_213,"Invalid_213");
		return this;
	}
	public ActivityRulesPage enterActionType_98(WebDriver driver,String ActionType_98) {
		BrowserActions.type(driver, inpActionType_98,ActionType_98, "ActionType_98");
		return this;
	}
	public ActivityRulesPage enterValidationStatusToolbarInput(WebDriver driver,String ValidationStatusToolbarInput) {
		BrowserActions.type(driver, inpValidationStatusToolbarInput,ValidationStatusToolbarInput, "ValidationStatusToolbarInput");
		return this;
	}
	public ActivityRulesPage enterStatus_151(WebDriver driver,String Status_151) {
		BrowserActions.type(driver, inpStatus_151,Status_151, "Status_151");
		return this;
	}
	public ActivityRulesPage enterStatus_271(WebDriver driver,String Status_271) {
		BrowserActions.type(driver, inpStatus_271,Status_271, "Status_271");
		return this;
	}
	public ActivityRulesPage clickUnknown_315(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_315,"Unknown_315");
		return this;
	}
	public ActivityRulesPage clickInvalid_573(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_573,"Invalid_573");
		return this;
	}
	public ActivityRulesPage enterStatus_391(WebDriver driver,String Status_391) {
		BrowserActions.type(driver, inpStatus_391,Status_391, "Status_391");
		return this;
	}
	public ActivityRulesPage clickUnknown_435(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_435,"Unknown_435");
		return this;
	}
	public ActivityRulesPage clickInvalid_453(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_453,"Invalid_453");
		return this;
	}
	public ActivityRulesPage clickInvalid_333(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_333,"Invalid_333");
		return this;
	}
	public ActivityRulesPage clickUnknown_555(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_555,"Unknown_555");
		return this;
	}
	public ActivityRulesPage selectAvailability(WebDriver driver,String Availability)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAvailability,Availability,"Availability");
		return this;
	}
	public ActivityRulesPage enterExposureType_84(WebDriver driver,String ExposureType_84) {
		BrowserActions.type(driver, inpExposureType_84,ExposureType_84, "ExposureType_84");
		return this;
	}
	public ActivityRulesPage enterName_190(WebDriver driver,String Name_190) {
		BrowserActions.type(driver, inpName_190,Name_190, "Name_190");
		return this;
	}
	public ActivityRulesPage enterName_290(WebDriver driver,String Name_290) {
		BrowserActions.type(driver, inpName_290,Name_290, "Name_290");
		return this;
	}
	public ActivityRulesPage enterName_170(WebDriver driver,String Name_170) {
		BrowserActions.type(driver, inpName_170,Name_170, "Name_170");
		return this;
	}
	public ActivityRulesPage enterPolicyType_560(WebDriver driver,String PolicyType_560) {
		BrowserActions.type(driver, inpPolicyType_560,PolicyType_560, "PolicyType_560");
		return this;
	}
	public ActivityRulesPage enterPolicyType_200(WebDriver driver,String PolicyType_200) {
		BrowserActions.type(driver, inpPolicyType_200,PolicyType_200, "PolicyType_200");
		return this;
	}
	public ActivityRulesPage enterPolicyType_320(WebDriver driver,String PolicyType_320) {
		BrowserActions.type(driver, inpPolicyType_320,PolicyType_320, "PolicyType_320");
		return this;
	}
	public ActivityRulesPage enterPolicyType_440(WebDriver driver,String PolicyType_440) {
		BrowserActions.type(driver, inpPolicyType_440,PolicyType_440, "PolicyType_440");
		return this;
	}
	public ActivityRulesPage enterStatus_71(WebDriver driver,String Status_71) {
		BrowserActions.type(driver, inpStatus_71,Status_71, "Status_71");
		return this;
	}
	public ActivityRulesPage enterLossType_179(WebDriver driver,String LossType_179) {
		BrowserActions.type(driver, inpLossType_179,LossType_179, "LossType_179");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_248(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_248,"PrevExecuting_248");
		return this;
	}
	public ActivityRulesPage enterLossType_299(WebDriver driver,String LossType_299) {
		BrowserActions.type(driver, inpLossType_299,LossType_299, "LossType_299");
		return this;
	}
	public ActivityRulesPage clickUnknown_569(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_569,"Unknown_569");
		return this;
	}
	public ActivityRulesPage clickExecuting_26(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_26,"Executing_26");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_63(WebDriver driver,String Jurisdiction_63) {
		BrowserActions.type(driver, inpJurisdiction_63,Jurisdiction_63, "Jurisdiction_63");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_128(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_128,"PrevExecuting_128");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_488(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_488,"PrevExecuting_488");
		return this;
	}
	public ActivityRulesPage enterActionType_518(WebDriver driver,String ActionType_518) {
		BrowserActions.type(driver, inpActionType_518,ActionType_518, "ActionType_518");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_368(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_368,"PrevExecuting_368");
		return this;
	}
	public ActivityRulesPage enterExposureType_104(WebDriver driver,String ExposureType_104) {
		BrowserActions.type(driver, inpExposureType_104,ExposureType_104, "ExposureType_104");
		return this;
	}
	public ActivityRulesPage clickUnknown_209(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_209,"Unknown_209");
		return this;
	}
	public ActivityRulesPage clickUnknown_329(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_329,"Unknown_329");
		return this;
	}
	public ActivityRulesPage enterExposureType_344(WebDriver driver,String ExposureType_344) {
		BrowserActions.type(driver, inpExposureType_344,ExposureType_344, "ExposureType_344");
		return this;
	}
	public ActivityRulesPage enterExposureType_224(WebDriver driver,String ExposureType_224) {
		BrowserActions.type(driver, inpExposureType_224,ExposureType_224, "ExposureType_224");
		return this;
	}
	public ActivityRulesPage clickUnknown_449(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_449,"Unknown_449");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_476(WebDriver driver,String TriggerEntity_476)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_476,TriggerEntity_476,"TriggerEntity_476");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_596(WebDriver driver,String TriggerEntity_596)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_596,TriggerEntity_596,"TriggerEntity_596");
		return this;
	}
	public ActivityRulesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_236(WebDriver driver,String TriggerEntity_236)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_236,TriggerEntity_236,"TriggerEntity_236");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_356(WebDriver driver,String TriggerEntity_356)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_356,TriggerEntity_356,"TriggerEntity_356");
		return this;
	}
	public ActivityRulesPage enterExposureType_584(WebDriver driver,String ExposureType_584) {
		BrowserActions.type(driver, inpExposureType_584,ExposureType_584, "ExposureType_584");
		return this;
	}
	public ActivityRulesPage enterExposureType_464(WebDriver driver,String ExposureType_464) {
		BrowserActions.type(driver, inpExposureType_464,ExposureType_464, "ExposureType_464");
		return this;
	}
	public ActivityRulesPage selectPolicyType(WebDriver driver,String PolicyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,"PolicyType");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_22(WebDriver driver,String LossPartyType_22) {
		BrowserActions.type(driver, inpLossPartyType_22,LossPartyType_22, "LossPartyType_22");
		return this;
	}
	public ActivityRulesPage enterIncidentType_21(WebDriver driver,String IncidentType_21) {
		BrowserActions.type(driver, inpIncidentType_21,IncidentType_21, "IncidentType_21");
		return this;
	}
	public ActivityRulesPage clickUnknown_455(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_455,"Unknown_455");
		return this;
	}
	public ActivityRulesPage clickUnknown_575(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_575,"Unknown_575");
		return this;
	}
	public ActivityRulesPage clickInvalid_593(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_593,"Invalid_593");
		return this;
	}
	public ActivityRulesPage clickInvalid_473(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_473,"Invalid_473");
		return this;
	}
	public ActivityRulesPage clickDisableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDisableSelected,"DisableSelected");
		return this;
	}
	public ActivityRulesPage clickInvalid_353(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_353,"Invalid_353");
		return this;
	}
	public ActivityRulesPage enterStatus_171(WebDriver driver,String Status_171) {
		BrowserActions.type(driver, inpStatus_171,Status_171, "Status_171");
		return this;
	}
	public ActivityRulesPage clickUnknown_215(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_215,"Unknown_215");
		return this;
	}
	public ActivityRulesPage clickInvalid_233(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_233,"Invalid_233");
		return this;
	}
	public ActivityRulesPage clickInvalid_113(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_113,"Invalid_113");
		return this;
	}
	public ActivityRulesPage enterStatus_291(WebDriver driver,String Status_291) {
		BrowserActions.type(driver, inpStatus_291,Status_291, "Status_291");
		return this;
	}
	public ActivityRulesPage clickUnknown_335(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_335,"Unknown_335");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_116(WebDriver driver,String TriggerEntity_116)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_116,TriggerEntity_116,"TriggerEntity_116");
		return this;
	}
	public ActivityRulesPage enterLossType_39(WebDriver driver,String LossType_39) {
		BrowserActions.type(driver, inpLossType_39,LossType_39, "LossType_39");
		return this;
	}
	public ActivityRulesPage enterName_90(WebDriver driver,String Name_90) {
		BrowserActions.type(driver, inpName_90,Name_90, "Name_90");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_83(WebDriver driver,String Jurisdiction_83) {
		BrowserActions.type(driver, inpJurisdiction_83,Jurisdiction_83, "Jurisdiction_83");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_285(WebDriver driver,String ExposureSegment_285) {
		BrowserActions.type(driver, inpExposureSegment_285,ExposureSegment_285, "ExposureSegment_285");
		return this;
	}
	public ActivityRulesPage enterExpression(WebDriver driver,String Expression) {
		BrowserActions.type(driver, inpExpression,Expression, "Expression");
		return this;
	}
	public ActivityRulesPage clickClose_4(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_4,"Close_4");
		return this;
	}
	public ActivityRulesPage enterPolicyType_500(WebDriver driver,String PolicyType_500) {
		BrowserActions.type(driver, inpPolicyType_500,PolicyType_500, "PolicyType_500");
		return this;
	}
	public ActivityRulesPage clickClose_3(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_3,"Close_3");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_165(WebDriver driver,String ExposureSegment_165) {
		BrowserActions.type(driver, inpExposureSegment_165,ExposureSegment_165, "ExposureSegment_165");
		return this;
	}
	public ActivityRulesPage clickUnknown_195(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_195,"Unknown_195");
		return this;
	}
	public ActivityRulesPage clickClose_2(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_2,"Close_2");
		return this;
	}
	public ActivityRulesPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public ActivityRulesPage clickUnknown_189(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_189,"Unknown_189");
		return this;
	}
	public ActivityRulesPage enterVersion_72(WebDriver driver,String Version_72) {
		BrowserActions.type(driver, inpVersion_72,Version_72, "Version_72");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_268(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_268,"PrevExecuting_268");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_148(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_148,"PrevExecuting_148");
		return this;
	}
	public ActivityRulesPage clickUnknown_35(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_35,"Unknown_35");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_388(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_388,"PrevExecuting_388");
		return this;
	}
	public ActivityRulesPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public ActivityRulesPage enterExposureType_604(WebDriver driver,String ExposureType_604) {
		BrowserActions.type(driver, inpExposureType_604,ExposureType_604, "ExposureType_604");
		return this;
	}
	public ActivityRulesPage clickValid_74(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_74,"Valid_74");
		return this;
	}
	public ActivityRulesPage clickValid_514(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_514,"Valid_514");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_27(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_27,"NotExecuting_27");
		return this;
	}
	public ActivityRulesPage enterIncidentType_201(WebDriver driver,String IncidentType_201) {
		BrowserActions.type(driver, inpIncidentType_201,IncidentType_201, "IncidentType_201");
		return this;
	}
	public ActivityRulesPage enterIncidentType_321(WebDriver driver,String IncidentType_321) {
		BrowserActions.type(driver, inpIncidentType_321,IncidentType_321, "IncidentType_321");
		return this;
	}
	public ActivityRulesPage enterIncidentType_441(WebDriver driver,String IncidentType_441) {
		BrowserActions.type(driver, inpIncidentType_441,IncidentType_441, "IncidentType_441");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_523(WebDriver driver,String Jurisdiction_523) {
		BrowserActions.type(driver, inpJurisdiction_523,Jurisdiction_523, "Jurisdiction_523");
		return this;
	}
	public ActivityRulesPage enterIncidentType_561(WebDriver driver,String IncidentType_561) {
		BrowserActions.type(driver, inpIncidentType_561,IncidentType_561, "IncidentType_561");
		return this;
	}
	public ActivityRulesPage enterIncidentType_41(WebDriver driver,String IncidentType_41) {
		BrowserActions.type(driver, inpIncidentType_41,IncidentType_41, "IncidentType_41");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_403(WebDriver driver,String Jurisdiction_403) {
		BrowserActions.type(driver, inpJurisdiction_403,Jurisdiction_403, "Jurisdiction_403");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_96(WebDriver driver,String TriggerEntity_96)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_96,TriggerEntity_96,"TriggerEntity_96");
		return this;
	}
	public ActivityRulesPage enterActionType_58(WebDriver driver,String ActionType_58) {
		BrowserActions.type(driver, inpActionType_58,ActionType_58, "ActionType_58");
		return this;
	}
	public ActivityRulesPage enterStatus_111(WebDriver driver,String Status_111) {
		BrowserActions.type(driver, inpStatus_111,Status_111, "Status_111");
		return this;
	}
	public ActivityRulesPage enterStatus_231(WebDriver driver,String Status_231) {
		BrowserActions.type(driver, inpStatus_231,Status_231, "Status_231");
		return this;
	}
	public ActivityRulesPage enterStatus_351(WebDriver driver,String Status_351) {
		BrowserActions.type(driver, inpStatus_351,Status_351, "Status_351");
		return this;
	}
	public ActivityRulesPage clickUnknown_29(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_29,"Unknown_29");
		return this;
	}
	public ActivityRulesPage enterStatus_471(WebDriver driver,String Status_471) {
		BrowserActions.type(driver, inpStatus_471,Status_471, "Status_471");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_37(WebDriver driver,String TriggerAction_37)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_37,TriggerAction_37,"TriggerAction_37");
		return this;
	}
	public ActivityRulesPage enterStatus_591(WebDriver driver,String Status_591) {
		BrowserActions.type(driver, inpStatus_591,Status_591, "Status_591");
		return this;
	}
	public ActivityRulesPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public ActivityRulesPage clickExecuting_466(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_466,"Executing_466");
		return this;
	}
	public ActivityRulesPage clickExecuting_586(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_586,"Executing_586");
		return this;
	}
	public ActivityRulesPage clickExecuting_226(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_226,"Executing_226");
		return this;
	}
	public ActivityRulesPage clickExecuting_346(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_346,"Executing_346");
		return this;
	}
	public ActivityRulesPage clickExecuting_106(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_106,"Executing_106");
		return this;
	}
	public ActivityRulesPage enterLossType_19(WebDriver driver,String LossType_19) {
		BrowserActions.type(driver, inpLossType_19,LossType_19, "LossType_19");
		return this;
	}
	public ActivityRulesPage enterName_70(WebDriver driver,String Name_70) {
		BrowserActions.type(driver, inpName_70,Name_70, "Name_70");
		return this;
	}
	public ActivityRulesPage enterPolicyType_520(WebDriver driver,String PolicyType_520) {
		BrowserActions.type(driver, inpPolicyType_520,PolicyType_520, "PolicyType_520");
		return this;
	}
	public ActivityRulesPage clickClear(WebDriver driver)  {
		BrowserActions.click(driver, btnClear,"Clear");
		return this;
	}
	public ActivityRulesPage enterExposureType(WebDriver driver,String ExposureType) {
		BrowserActions.type(driver, inpExposureType,ExposureType, "ExposureType");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_185(WebDriver driver,String ExposureSegment_185) {
		BrowserActions.type(driver, inpExposureSegment_185,ExposureSegment_185, "ExposureSegment_185");
		return this;
	}
	public ActivityRulesPage enterPolicyType_400(WebDriver driver,String PolicyType_400) {
		BrowserActions.type(driver, inpPolicyType_400,PolicyType_400, "PolicyType_400");
		return this;
	}
	public ActivityRulesPage enterVersion_52(WebDriver driver,String Version_52) {
		BrowserActions.type(driver, inpVersion_52,Version_52, "Version_52");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_563(WebDriver driver,String Jurisdiction_563) {
		BrowserActions.type(driver, inpJurisdiction_563,Jurisdiction_563, "Jurisdiction_563");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_288(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_288,"PrevExecuting_288");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_168(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_168,"PrevExecuting_168");
		return this;
	}
	public ActivityRulesPage clickUnknown_15(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_15,"Unknown_15");
		return this;
	}
	public ActivityRulesPage clickValid_34(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_34,"Valid_34");
		return this;
	}
	public ActivityRulesPage clickValid_54(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_54,"Valid_54");
		return this;
	}
	public ActivityRulesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public ActivityRulesPage enterIncidentType_461(WebDriver driver,String IncidentType_461) {
		BrowserActions.type(driver, inpIncidentType_461,IncidentType_461, "IncidentType_461");
		return this;
	}
	public ActivityRulesPage enterIncidentType_581(WebDriver driver,String IncidentType_581) {
		BrowserActions.type(driver, inpIncidentType_581,IncidentType_581, "IncidentType_581");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_47(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_47,"NotExecuting_47");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_76(WebDriver driver,String TriggerEntity_76)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_76,TriggerEntity_76,"TriggerEntity_76");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_543(WebDriver driver,String Jurisdiction_543) {
		BrowserActions.type(driver, inpJurisdiction_543,Jurisdiction_543, "Jurisdiction_543");
		return this;
	}
	public ActivityRulesPage enterIncidentType_101(WebDriver driver,String IncidentType_101) {
		BrowserActions.type(driver, inpIncidentType_101,IncidentType_101, "IncidentType_101");
		return this;
	}
	public ActivityRulesPage clickBulkEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnBulkEdit,"BulkEdit");
		return this;
	}
	public ActivityRulesPage enterIncidentType_61(WebDriver driver,String IncidentType_61) {
		BrowserActions.type(driver, inpIncidentType_61,IncidentType_61, "IncidentType_61");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_187(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_187,"NotExecuting_187");
		return this;
	}
	public ActivityRulesPage enterIncidentType_221(WebDriver driver,String IncidentType_221) {
		BrowserActions.type(driver, inpIncidentType_221,IncidentType_221, "IncidentType_221");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_303(WebDriver driver,String Jurisdiction_303) {
		BrowserActions.type(driver, inpJurisdiction_303,Jurisdiction_303, "Jurisdiction_303");
		return this;
	}
	public ActivityRulesPage enterIncidentType_341(WebDriver driver,String IncidentType_341) {
		BrowserActions.type(driver, inpIncidentType_341,IncidentType_341, "IncidentType_341");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_423(WebDriver driver,String Jurisdiction_423) {
		BrowserActions.type(driver, inpJurisdiction_423,Jurisdiction_423, "Jurisdiction_423");
		return this;
	}
	public ActivityRulesPage enterActionType_78(WebDriver driver,String ActionType_78) {
		BrowserActions.type(driver, inpActionType_78,ActionType_78, "ActionType_78");
		return this;
	}
	public ActivityRulesPage enterStatus_131(WebDriver driver,String Status_131) {
		BrowserActions.type(driver, inpStatus_131,Status_131, "Status_131");
		return this;
	}
	public ActivityRulesPage enterStatus_251(WebDriver driver,String Status_251) {
		BrowserActions.type(driver, inpStatus_251,Status_251, "Status_251");
		return this;
	}
	public ActivityRulesPage enterStatus_371(WebDriver driver,String Status_371) {
		BrowserActions.type(driver, inpStatus_371,Status_371, "Status_371");
		return this;
	}
	public ActivityRulesPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public ActivityRulesPage enterStatus_491(WebDriver driver,String Status_491) {
		BrowserActions.type(driver, inpStatus_491,Status_491, "Status_491");
		return this;
	}
	public ActivityRulesPage clickExecuting_486(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_486,"Executing_486");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_17(WebDriver driver,String TriggerAction_17)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_17,TriggerAction_17,"TriggerAction_17");
		return this;
	}
	public ActivityRulesPage clickExecuting_246(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_246,"Executing_246");
		return this;
	}
	public ActivityRulesPage clickExecuting_366(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_366,"Executing_366");
		return this;
	}
	public ActivityRulesPage clickExecuting_126(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_126,"Executing_126");
		return this;
	}
	public ActivityRulesPage enterName_50(WebDriver driver,String Name_50) {
		BrowserActions.type(driver, inpName_50,Name_50, "Name_50");
		return this;
	}
	public ActivityRulesPage clickEnableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableSelected,"EnableSelected");
		return this;
	}
	public ActivityRulesPage enterVersion_32(WebDriver driver,String Version_32) {
		BrowserActions.type(driver, inpVersion_32,Version_32, "Version_32");
		return this;
	}
	public ActivityRulesPage clickUnknown_275(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_275,"Unknown_275");
		return this;
	}
	public ActivityRulesPage clickUnknown_395(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_395,"Unknown_395");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_282(WebDriver driver,String LossPartyType_282) {
		BrowserActions.type(driver, inpLossPartyType_282,LossPartyType_282, "LossPartyType_282");
		return this;
	}
	public ActivityRulesPage clickUnknown_389(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_389,"Unknown_389");
		return this;
	}
	public ActivityRulesPage clickUnknown_149(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_149,"Unknown_149");
		return this;
	}
	public ActivityRulesPage clickUnknown_269(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_269,"Unknown_269");
		return this;
	}
	public ActivityRulesPage enterPolicyType_80(WebDriver driver,String PolicyType_80) {
		BrowserActions.type(driver, inpPolicyType_80,PolicyType_80, "PolicyType_80");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_188(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_188,"PrevExecuting_188");
		return this;
	}
	public ActivityRulesPage enterExposureType_524(WebDriver driver,String ExposureType_524) {
		BrowserActions.type(driver, inpExposureType_524,ExposureType_524, "ExposureType_524");
		return this;
	}
	public ActivityRulesPage enterExposureType_404(WebDriver driver,String ExposureType_404) {
		BrowserActions.type(driver, inpExposureType_404,ExposureType_404, "ExposureType_404");
		return this;
	}
	public ActivityRulesPage enterActionType_18(WebDriver driver,String ActionType_18) {
		BrowserActions.type(driver, inpActionType_18,ActionType_18, "ActionType_18");
		return this;
	}
	public ActivityRulesPage enterIncidentType_241(WebDriver driver,String IncidentType_241) {
		BrowserActions.type(driver, inpIncidentType_241,IncidentType_241, "IncidentType_241");
		return this;
	}
	public ActivityRulesPage enterIncidentType_361(WebDriver driver,String IncidentType_361) {
		BrowserActions.type(driver, inpIncidentType_361,IncidentType_361, "IncidentType_361");
		return this;
	}
	public ActivityRulesPage enterIncidentType_481(WebDriver driver,String IncidentType_481) {
		BrowserActions.type(driver, inpIncidentType_481,IncidentType_481, "IncidentType_481");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_82(WebDriver driver,String LossPartyType_82) {
		BrowserActions.type(driver, inpLossPartyType_82,LossPartyType_82, "LossPartyType_82");
		return this;
	}
	public ActivityRulesPage enterIncidentType_81(WebDriver driver,String IncidentType_81) {
		BrowserActions.type(driver, inpIncidentType_81,IncidentType_81, "IncidentType_81");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_167(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_167,"NotExecuting_167");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_56(WebDriver driver,String TriggerEntity_56)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_56,TriggerEntity_56,"TriggerEntity_56");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_67(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_67,"NotExecuting_67");
		return this;
	}
	public ActivityRulesPage enterIncidentType_121(WebDriver driver,String IncidentType_121) {
		BrowserActions.type(driver, inpIncidentType_121,IncidentType_121, "IncidentType_121");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_287(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_287,"NotExecuting_287");
		return this;
	}
	public ActivityRulesPage clickValid_314(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_314,"Valid_314");
		return this;
	}
	public ActivityRulesPage clickValid_434(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_434,"Valid_434");
		return this;
	}
	public ActivityRulesPage enterStatus_311(WebDriver driver,String Status_311) {
		BrowserActions.type(driver, inpStatus_311,Status_311, "Status_311");
		return this;
	}
	public ActivityRulesPage clickValid_554(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_554,"Valid_554");
		return this;
	}
	public ActivityRulesPage enterStatus_431(WebDriver driver,String Status_431) {
		BrowserActions.type(driver, inpStatus_431,Status_431, "Status_431");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_603(WebDriver driver,String Jurisdiction_603) {
		BrowserActions.type(driver, inpJurisdiction_603,Jurisdiction_603, "Jurisdiction_603");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_162(WebDriver driver,String LossPartyType_162) {
		BrowserActions.type(driver, inpLossPartyType_162,LossPartyType_162, "LossPartyType_162");
		return this;
	}
	public ActivityRulesPage enterStatus_551(WebDriver driver,String Status_551) {
		BrowserActions.type(driver, inpStatus_551,Status_551, "Status_551");
		return this;
	}
	public ActivityRulesPage clickUnknown_155(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_155,"Unknown_155");
		return this;
	}
	public ActivityRulesPage clickExecuting_266(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_266,"Executing_266");
		return this;
	}
	public ActivityRulesPage clickExecuting_386(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_386,"Executing_386");
		return this;
	}
	public ActivityRulesPage enterIncidentType(WebDriver driver,String IncidentType) {
		BrowserActions.type(driver, inpIncidentType,IncidentType, "IncidentType");
		return this;
	}
	public ActivityRulesPage clickExecuting_146(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_146,"Executing_146");
		return this;
	}
	public ActivityRulesPage enterName_30(WebDriver driver,String Name_30) {
		BrowserActions.type(driver, inpName_30,Name_30, "Name_30");
		return this;
	}
	public ActivityRulesPage enterVersion_12(WebDriver driver,String Version_12) {
		BrowserActions.type(driver, inpVersion_12,Version_12, "Version_12");
		return this;
	}
	public ActivityRulesPage clickUnknown_175(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_175,"Unknown_175");
		return this;
	}
	public ActivityRulesPage enterPolicyType_600(WebDriver driver,String PolicyType_600) {
		BrowserActions.type(driver, inpPolicyType_600,PolicyType_600, "PolicyType_600");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_182(WebDriver driver,String LossPartyType_182) {
		BrowserActions.type(driver, inpLossPartyType_182,LossPartyType_182, "LossPartyType_182");
		return this;
	}
	public ActivityRulesPage clickUnknown_295(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_295,"Unknown_295");
		return this;
	}
	public ActivityRulesPage clickUnknown_169(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_169,"Unknown_169");
		return this;
	}
	public ActivityRulesPage clickUnknown_289(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_289,"Unknown_289");
		return this;
	}
	public ActivityRulesPage enterPolicyType_60(WebDriver driver,String PolicyType_60) {
		BrowserActions.type(driver, inpPolicyType_60,PolicyType_60, "PolicyType_60");
		return this;
	}
	public ActivityRulesPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public ActivityRulesPage enterExposureType_504(WebDriver driver,String ExposureType_504) {
		BrowserActions.type(driver, inpExposureType_504,ExposureType_504, "ExposureType_504");
		return this;
	}
	public ActivityRulesPage selectLossType(WebDriver driver,String LossType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossType,LossType,"LossType");
		return this;
	}
	public ActivityRulesPage enterExposureType_24(WebDriver driver,String ExposureType_24) {
		BrowserActions.type(driver, inpExposureType_24,ExposureType_24, "ExposureType_24");
		return this;
	}
	public ActivityRulesPage enterActionType_38(WebDriver driver,String ActionType_38) {
		BrowserActions.type(driver, inpActionType_38,ActionType_38, "ActionType_38");
		return this;
	}
	public ActivityRulesPage clickValid_414(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_414,"Valid_414");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_36(WebDriver driver,String TriggerEntity_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_36,TriggerEntity_36,"TriggerEntity_36");
		return this;
	}
	public ActivityRulesPage clickValid_94(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_94,"Valid_94");
		return this;
	}
	public ActivityRulesPage enterIncidentType_141(WebDriver driver,String IncidentType_141) {
		BrowserActions.type(driver, inpIncidentType_141,IncidentType_141, "IncidentType_141");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_196(WebDriver driver,String TriggerEntity_196)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_196,TriggerEntity_196,"TriggerEntity_196");
		return this;
	}
	public ActivityRulesPage enterIncidentType_261(WebDriver driver,String IncidentType_261) {
		BrowserActions.type(driver, inpIncidentType_261,IncidentType_261, "IncidentType_261");
		return this;
	}
	public ActivityRulesPage enterIncidentType_381(WebDriver driver,String IncidentType_381) {
		BrowserActions.type(driver, inpIncidentType_381,IncidentType_381, "IncidentType_381");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_387(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_387,"NotExecuting_387");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_267(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_267,"NotExecuting_267");
		return this;
	}
	public ActivityRulesPage clickInvalid_513(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_513,"Invalid_513");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_87(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_87,"NotExecuting_87");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_503(WebDriver driver,String Jurisdiction_503) {
		BrowserActions.type(driver, inpJurisdiction_503,Jurisdiction_503, "Jurisdiction_503");
		return this;
	}
	public ActivityRulesPage clickValid_534(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_534,"Valid_534");
		return this;
	}
	public ActivityRulesPage enterStatus_211(WebDriver driver,String Status_211) {
		BrowserActions.type(driver, inpStatus_211,Status_211, "Status_211");
		return this;
	}
	public ActivityRulesPage enterStatus_331(WebDriver driver,String Status_331) {
		BrowserActions.type(driver, inpStatus_331,Status_331, "Status_331");
		return this;
	}
	public ActivityRulesPage enterStatus_451(WebDriver driver,String Status_451) {
		BrowserActions.type(driver, inpStatus_451,Status_451, "Status_451");
		return this;
	}
	public ActivityRulesPage enterStatus_571(WebDriver driver,String Status_571) {
		BrowserActions.type(driver, inpStatus_571,Status_571, "Status_571");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_147(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_147,"NotExecuting_147");
		return this;
	}
	public ActivityRulesPage clickExecuting_286(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_286,"Executing_286");
		return this;
	}
	public ActivityRulesPage clickExecuting_166(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_166,"Executing_166");
		return this;
	}
	public ActivityRulesPage enterActionType_178(WebDriver driver,String ActionType_178) {
		BrowserActions.type(driver, inpActionType_178,ActionType_178, "ActionType_178");
		return this;
	}
	public ActivityRulesPage enterActionType_298(WebDriver driver,String ActionType_298) {
		BrowserActions.type(driver, inpActionType_298,ActionType_298, "ActionType_298");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_205(WebDriver driver,String ExposureSegment_205) {
		BrowserActions.type(driver, inpExposureSegment_205,ExposureSegment_205, "ExposureSegment_205");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_325(WebDriver driver,String ExposureSegment_325) {
		BrowserActions.type(driver, inpExposureSegment_325,ExposureSegment_325, "ExposureSegment_325");
		return this;
	}
	public ActivityRulesPage enterName_550(WebDriver driver,String Name_550) {
		BrowserActions.type(driver, inpName_550,Name_550, "Name_550");
		return this;
	}
	public ActivityRulesPage enterName_430(WebDriver driver,String Name_430) {
		BrowserActions.type(driver, inpName_430,Name_430, "Name_430");
		return this;
	}
	public ActivityRulesPage enterName_310(WebDriver driver,String Name_310) {
		BrowserActions.type(driver, inpName_310,Name_310, "Name_310");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_445(WebDriver driver,String ExposureSegment_445) {
		BrowserActions.type(driver, inpExposureSegment_445,ExposureSegment_445, "ExposureSegment_445");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_565(WebDriver driver,String ExposureSegment_565) {
		BrowserActions.type(driver, inpExposureSegment_565,ExposureSegment_565, "ExposureSegment_565");
		return this;
	}
	public ActivityRulesPage enterName_10(WebDriver driver,String Name_10) {
		BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
		return this;
	}
	public ActivityRulesPage clickInvalid(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid,"Invalid");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_88(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_88,"PrevExecuting_88");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_383(WebDriver driver,String Jurisdiction_383) {
		BrowserActions.type(driver, inpJurisdiction_383,Jurisdiction_383, "Jurisdiction_383");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_143(WebDriver driver,String Jurisdiction_143) {
		BrowserActions.type(driver, inpJurisdiction_143,Jurisdiction_143, "Jurisdiction_143");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_263(WebDriver driver,String Jurisdiction_263) {
		BrowserActions.type(driver, inpJurisdiction_263,Jurisdiction_263, "Jurisdiction_263");
		return this;
	}
	public ActivityRulesPage selectRuleAction(WebDriver driver,String RuleAction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleAction,RuleAction,"RuleAction");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting,"PrevExecuting");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_25(WebDriver driver,String ExposureSegment_25) {
		BrowserActions.type(driver, inpExposureSegment_25,ExposureSegment_25, "ExposureSegment_25");
		return this;
	}
	public ActivityRulesPage enterPolicyType_40(WebDriver driver,String PolicyType_40) {
		BrowserActions.type(driver, inpPolicyType_40,PolicyType_40, "PolicyType_40");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_45(WebDriver driver,String ExposureSegment_45) {
		BrowserActions.type(driver, inpExposureSegment_45,ExposureSegment_45, "ExposureSegment_45");
		return this;
	}
	public ActivityRulesPage clickExecuting_506(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_506,"Executing_506");
		return this;
	}
	public ActivityRulesPage clickValid(WebDriver driver)  {
		BrowserActions.click(driver, btnValid,"Valid");
		return this;
	}
	public ActivityRulesPage clickValid_354(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_354,"Valid_354");
		return this;
	}
	public ActivityRulesPage clickValid_474(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_474,"Valid_474");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_487(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_487,"NotExecuting_487");
		return this;
	}
	public ActivityRulesPage clickValid_594(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_594,"Valid_594");
		return this;
	}
	public ActivityRulesPage enterLossType_319(WebDriver driver,String LossType_319) {
		BrowserActions.type(driver, inpLossType_319,LossType_319, "LossType_319");
		return this;
	}
	public ActivityRulesPage enterLossType_439(WebDriver driver,String LossType_439) {
		BrowserActions.type(driver, inpLossType_439,LossType_439, "LossType_439");
		return this;
	}
	public ActivityRulesPage enterStatus_511(WebDriver driver,String Status_511) {
		BrowserActions.type(driver, inpStatus_511,Status_511, "Status_511");
		return this;
	}
	public ActivityRulesPage enterIncidentType_601(WebDriver driver,String IncidentType_601) {
		BrowserActions.type(driver, inpIncidentType_601,IncidentType_601, "IncidentType_601");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity(WebDriver driver,String TriggerEntity)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity,TriggerEntity,"TriggerEntity");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_177(WebDriver driver,String TriggerAction_177)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_177,TriggerAction_177,"TriggerAction_177");
		return this;
	}
	public ActivityRulesPage enterLossType_559(WebDriver driver,String LossType_559) {
		BrowserActions.type(driver, inpLossType_559,LossType_559, "LossType_559");
		return this;
	}
	public ActivityRulesPage clickValid_114(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_114,"Valid_114");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_297(WebDriver driver,String TriggerAction_297)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_297,TriggerAction_297,"TriggerAction_297");
		return this;
	}
	public ActivityRulesPage clickValid_234(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_234,"Valid_234");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_482(WebDriver driver,String LossPartyType_482) {
		BrowserActions.type(driver, inpLossPartyType_482,LossPartyType_482, "LossPartyType_482");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_242(WebDriver driver,String LossPartyType_242) {
		BrowserActions.type(driver, inpLossPartyType_242,LossPartyType_242, "LossPartyType_242");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_362(WebDriver driver,String LossPartyType_362) {
		BrowserActions.type(driver, inpLossPartyType_362,LossPartyType_362, "LossPartyType_362");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_122(WebDriver driver,String LossPartyType_122) {
		BrowserActions.type(driver, inpLossPartyType_122,LossPartyType_122, "LossPartyType_122");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_127(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_127,"NotExecuting_127");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_367(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_367,"NotExecuting_367");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_247(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_247,"NotExecuting_247");
		return this;
	}
	public ActivityRulesPage enterPolicyType(WebDriver driver,String PolicyType) {
		BrowserActions.type(driver, inpPolicyType,PolicyType, "PolicyType");
		return this;
	}
	public ActivityRulesPage enterVersion_512(WebDriver driver,String Version_512) {
		BrowserActions.type(driver, inpVersion_512,Version_512, "Version_512");
		return this;
	}
	public ActivityRulesPage enterJurisdiction(WebDriver driver,String Jurisdiction) {
		BrowserActions.type(driver, inpJurisdiction,Jurisdiction, "Jurisdiction");
		return this;
	}
	public ActivityRulesPage enterActionType_398(WebDriver driver,String ActionType_398) {
		BrowserActions.type(driver, inpActionType_398,ActionType_398, "ActionType_398");
		return this;
	}
	public ActivityRulesPage enterActionType_278(WebDriver driver,String ActionType_278) {
		BrowserActions.type(driver, inpActionType_278,ActionType_278, "ActionType_278");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_105(WebDriver driver,String ExposureSegment_105) {
		BrowserActions.type(driver, inpExposureSegment_105,ExposureSegment_105, "ExposureSegment_105");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_7(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_7,"NotExecuting_7");
		return this;
	}
	public ActivityRulesPage clickUnknown_95(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_95,"Unknown_95");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_465(WebDriver driver,String ExposureSegment_465) {
		BrowserActions.type(driver, inpExposureSegment_465,ExposureSegment_465, "ExposureSegment_465");
		return this;
	}
	public ActivityRulesPage enterLossType_99(WebDriver driver,String LossType_99) {
		BrowserActions.type(driver, inpLossType_99,LossType_99, "LossType_99");
		return this;
	}
	public ActivityRulesPage enterName_530(WebDriver driver,String Name_530) {
		BrowserActions.type(driver, inpName_530,Name_530, "Name_530");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_585(WebDriver driver,String ExposureSegment_585) {
		BrowserActions.type(driver, inpExposureSegment_585,ExposureSegment_585, "ExposureSegment_585");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_225(WebDriver driver,String ExposureSegment_225) {
		BrowserActions.type(driver, inpExposureSegment_225,ExposureSegment_225, "ExposureSegment_225");
		return this;
	}
	public ActivityRulesPage enterName_410(WebDriver driver,String Name_410) {
		BrowserActions.type(driver, inpName_410,Name_410, "Name_410");
		return this;
	}
	public ActivityRulesPage selectActivityPattern(WebDriver driver,String ActivityPattern)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityPattern,ActivityPattern,"ActivityPattern");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_345(WebDriver driver,String ExposureSegment_345) {
		BrowserActions.type(driver, inpExposureSegment_345,ExposureSegment_345, "ExposureSegment_345");
		return this;
	}
	public ActivityRulesPage clickUnknown(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown,"Unknown");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_163(WebDriver driver,String Jurisdiction_163) {
		BrowserActions.type(driver, inpJurisdiction_163,Jurisdiction_163, "Jurisdiction_163");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_283(WebDriver driver,String Jurisdiction_283) {
		BrowserActions.type(driver, inpJurisdiction_283,Jurisdiction_283, "Jurisdiction_283");
		return this;
	}
	public ActivityRulesPage enterPolicyType_20(WebDriver driver,String PolicyType_20) {
		BrowserActions.type(driver, inpPolicyType_20,PolicyType_20, "PolicyType_20");
		return this;
	}
	public ActivityRulesPage enterActionType_158(WebDriver driver,String ActionType_158) {
		BrowserActions.type(driver, inpActionType_158,ActionType_158, "ActionType_158");
		return this;
	}
	public ActivityRulesPage clickExecuting_406(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_406,"Executing_406");
		return this;
	}
	public ActivityRulesPage clickExecuting_526(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_526,"Executing_526");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_65(WebDriver driver,String ExposureSegment_65) {
		BrowserActions.type(driver, inpExposureSegment_65,ExposureSegment_65, "ExposureSegment_65");
		return this;
	}
	public ActivityRulesPage clickUnknown_9(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_9,"Unknown_9");
		return this;
	}
	public ActivityRulesPage clickInvalid_13(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_13,"Invalid_13");
		return this;
	}
	public ActivityRulesPage clickValid_574(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_574,"Valid_574");
		return this;
	}
	public ActivityRulesPage clickUnknown_5(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_5,"Unknown_5");
		return this;
	}
	public ActivityRulesPage enterLossType_419(WebDriver driver,String LossType_419) {
		BrowserActions.type(driver, inpLossType_419,LossType_419, "LossType_419");
		return this;
	}
	public ActivityRulesPage enterLossType_539(WebDriver driver,String LossType_539) {
		BrowserActions.type(driver, inpLossType_539,LossType_539, "LossType_539");
		return this;
	}
	public ActivityRulesPage clickValid_214(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_214,"Valid_214");
		return this;
	}
	public ActivityRulesPage enterStatus_411(WebDriver driver,String Status_411) {
		BrowserActions.type(driver, inpStatus_411,Status_411, "Status_411");
		return this;
	}
	public ActivityRulesPage enterIncidentType_501(WebDriver driver,String IncidentType_501) {
		BrowserActions.type(driver, inpIncidentType_501,IncidentType_501, "IncidentType_501");
		return this;
	}
	public ActivityRulesPage clickValid_334(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_334,"Valid_334");
		return this;
	}
	public ActivityRulesPage enterStatus_531(WebDriver driver,String Status_531) {
		BrowserActions.type(driver, inpStatus_531,Status_531, "Status_531");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_197(WebDriver driver,String TriggerAction_197)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_197,TriggerAction_197,"TriggerAction_197");
		return this;
	}
	public ActivityRulesPage clickValid_454(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_454,"Valid_454");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_262(WebDriver driver,String LossPartyType_262) {
		BrowserActions.type(driver, inpLossPartyType_262,LossPartyType_262, "LossPartyType_262");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_382(WebDriver driver,String LossPartyType_382) {
		BrowserActions.type(driver, inpLossPartyType_382,LossPartyType_382, "LossPartyType_382");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_97(WebDriver driver,String TriggerAction_97)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_97,TriggerAction_97,"TriggerAction_97");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_107(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_107,"NotExecuting_107");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_142(WebDriver driver,String LossPartyType_142) {
		BrowserActions.type(driver, inpLossPartyType_142,LossPartyType_142, "LossPartyType_142");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_347(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_347,"NotExecuting_347");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_227(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_227,"NotExecuting_227");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_587(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_587,"NotExecuting_587");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_467(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_467,"NotExecuting_467");
		return this;
	}
	public ActivityRulesPage clickUnknown_89(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_89,"Unknown_89");
		return this;
	}
	public ActivityRulesPage clickShowFilters(WebDriver driver)  {
		BrowserActions.click(driver, btnShowFilters,"ShowFilters");
		return this;
	}
	public ActivityRulesPage enterVersion_452(WebDriver driver,String Version_452) {
		BrowserActions.type(driver, inpVersion_452,Version_452, "Version_452");
		return this;
	}
	public ActivityRulesPage enterVersion_572(WebDriver driver,String Version_572) {
		BrowserActions.type(driver, inpVersion_572,Version_572, "Version_572");
		return this;
	}
	public ActivityRulesPage clickUnknown_75(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_75,"Unknown_75");
		return this;
	}
	public ActivityRulesPage enterLossType_79(WebDriver driver,String LossType_79) {
		BrowserActions.type(driver, inpLossType_79,LossType_79, "LossType_79");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_245(WebDriver driver,String ExposureSegment_245) {
		BrowserActions.type(driver, inpExposureSegment_245,ExposureSegment_245, "ExposureSegment_245");
		return this;
	}
	public ActivityRulesPage clickEditAllinSpreadsheet(WebDriver driver)  {
		BrowserActions.click(driver, btnEditAllinSpreadsheet,"EditAllinSpreadsheet");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_365(WebDriver driver,String ExposureSegment_365) {
		BrowserActions.type(driver, inpExposureSegment_365,ExposureSegment_365, "ExposureSegment_365");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_125(WebDriver driver,String ExposureSegment_125) {
		BrowserActions.type(driver, inpExposureSegment_125,ExposureSegment_125, "ExposureSegment_125");
		return this;
	}
	public ActivityRulesPage enterName_510(WebDriver driver,String Name_510) {
		BrowserActions.type(driver, inpName_510,Name_510, "Name_510");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_485(WebDriver driver,String ExposureSegment_485) {
		BrowserActions.type(driver, inpExposureSegment_485,ExposureSegment_485, "ExposureSegment_485");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_137(WebDriver driver,String TriggerAction_137)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_137,TriggerAction_137,"TriggerAction_137");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_257(WebDriver driver,String TriggerAction_257)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_257,TriggerAction_257,"TriggerAction_257");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_377(WebDriver driver,String TriggerAction_377)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_377,TriggerAction_377,"TriggerAction_377");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_583(WebDriver driver,String Jurisdiction_583) {
		BrowserActions.type(driver, inpJurisdiction_583,Jurisdiction_583, "Jurisdiction_583");
		return this;
	}
	public ActivityRulesPage clickDeploy(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploy,"Deploy");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_343(WebDriver driver,String Jurisdiction_343) {
		BrowserActions.type(driver, inpJurisdiction_343,Jurisdiction_343, "Jurisdiction_343");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_463(WebDriver driver,String Jurisdiction_463) {
		BrowserActions.type(driver, inpJurisdiction_463,Jurisdiction_463, "Jurisdiction_463");
		return this;
	}
	public ActivityRulesPage clickValid_14(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_14,"Valid_14");
		return this;
	}
	public ActivityRulesPage clickExecuting_306(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_306,"Executing_306");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_323(WebDriver driver,String Jurisdiction_323) {
		BrowserActions.type(driver, inpJurisdiction_323,Jurisdiction_323, "Jurisdiction_323");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_443(WebDriver driver,String Jurisdiction_443) {
		BrowserActions.type(driver, inpJurisdiction_443,Jurisdiction_443, "Jurisdiction_443");
		return this;
	}
	public ActivityRulesPage enterLossType_519(WebDriver driver,String LossType_519) {
		BrowserActions.type(driver, inpLossType_519,LossType_519, "LossType_519");
		return this;
	}
	public ActivityRulesPage clickValid_154(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_154,"Valid_154");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_203(WebDriver driver,String Jurisdiction_203) {
		BrowserActions.type(driver, inpJurisdiction_203,Jurisdiction_203, "Jurisdiction_203");
		return this;
	}
	public ActivityRulesPage clickValid_274(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_274,"Valid_274");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_28(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_28,"PrevExecuting_28");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_497(WebDriver driver,String TriggerAction_497)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_497,TriggerAction_497,"TriggerAction_497");
		return this;
	}
	public ActivityRulesPage enterIncidentType_401(WebDriver driver,String IncidentType_401) {
		BrowserActions.type(driver, inpIncidentType_401,IncidentType_401, "IncidentType_401");
		return this;
	}
	public ActivityRulesPage enterIncidentType_521(WebDriver driver,String IncidentType_521) {
		BrowserActions.type(driver, inpIncidentType_521,IncidentType_521, "IncidentType_521");
		return this;
	}
	public ActivityRulesPage clickDeployAll(WebDriver driver)  {
		BrowserActions.click(driver, btnDeployAll,"DeployAll");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_77(WebDriver driver,String TriggerAction_77)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_77,TriggerAction_77,"TriggerAction_77");
		return this;
	}
	public ActivityRulesPage clickBulkEditSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnBulkEditSelected,"BulkEditSelected");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_327(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_327,"NotExecuting_327");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_207(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_207,"NotExecuting_207");
		return this;
	}
	public ActivityRulesPage clickValid_394(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_394,"Valid_394");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_442(WebDriver driver,String LossPartyType_442) {
		BrowserActions.type(driver, inpLossPartyType_442,LossPartyType_442, "LossPartyType_442");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_567(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_567,"NotExecuting_567");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_447(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_447,"NotExecuting_447");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_562(WebDriver driver,String LossPartyType_562) {
		BrowserActions.type(driver, inpLossPartyType_562,LossPartyType_562, "LossPartyType_562");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_202(WebDriver driver,String LossPartyType_202) {
		BrowserActions.type(driver, inpLossPartyType_202,LossPartyType_202, "LossPartyType_202");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_322(WebDriver driver,String LossPartyType_322) {
		BrowserActions.type(driver, inpLossPartyType_322,LossPartyType_322, "LossPartyType_322");
		return this;
	}
	public ActivityRulesPage enterLossType(WebDriver driver,String LossType) {
		BrowserActions.type(driver, inpLossType,LossType, "LossType");
		return this;
	}
	public ActivityRulesPage enterVersion_432(WebDriver driver,String Version_432) {
		BrowserActions.type(driver, inpVersion_432,Version_432, "Version_432");
		return this;
	}
	public ActivityRulesPage enterVersion_552(WebDriver driver,String Version_552) {
		BrowserActions.type(driver, inpVersion_552,Version_552, "Version_552");
		return this;
	}
	public ActivityRulesPage clickExecuting_426(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_426,"Executing_426");
		return this;
	}
	public ActivityRulesPage clickUnknown_69(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_69,"Unknown_69");
		return this;
	}
	public ActivityRulesPage enterVersion_312(WebDriver driver,String Version_312) {
		BrowserActions.type(driver, inpVersion_312,Version_312, "Version_312");
		return this;
	}
	public ActivityRulesPage clickExecuting_546(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_546,"Executing_546");
		return this;
	}
	public ActivityRulesPage enterActionType_198(WebDriver driver,String ActionType_198) {
		BrowserActions.type(driver, inpActionType_198,ActionType_198, "ActionType_198");
		return this;
	}
	public ActivityRulesPage enterLossType_59(WebDriver driver,String LossType_59) {
		BrowserActions.type(driver, inpLossType_59,LossType_59, "LossType_59");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_145(WebDriver driver,String ExposureSegment_145) {
		BrowserActions.type(driver, inpExposureSegment_145,ExposureSegment_145, "ExposureSegment_145");
		return this;
	}
	public ActivityRulesPage clickExecuting_6(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_6,"Executing_6");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_265(WebDriver driver,String ExposureSegment_265) {
		BrowserActions.type(driver, inpExposureSegment_265,ExposureSegment_265, "ExposureSegment_265");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_385(WebDriver driver,String ExposureSegment_385) {
		BrowserActions.type(driver, inpExposureSegment_385,ExposureSegment_385, "ExposureSegment_385");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_68(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_68,"PrevExecuting_68");
		return this;
	}
	public ActivityRulesPage enterVersion_92(WebDriver driver,String Version_92) {
		BrowserActions.type(driver, inpVersion_92,Version_92, "Version_92");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_157(WebDriver driver,String TriggerAction_157)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_157,TriggerAction_157,"TriggerAction_157");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_363(WebDriver driver,String Jurisdiction_363) {
		BrowserActions.type(driver, inpJurisdiction_363,Jurisdiction_363, "Jurisdiction_363");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_483(WebDriver driver,String Jurisdiction_483) {
		BrowserActions.type(driver, inpJurisdiction_483,Jurisdiction_483, "Jurisdiction_483");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_123(WebDriver driver,String Jurisdiction_123) {
		BrowserActions.type(driver, inpJurisdiction_123,Jurisdiction_123, "Jurisdiction_123");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_243(WebDriver driver,String Jurisdiction_243) {
		BrowserActions.type(driver, inpJurisdiction_243,Jurisdiction_243, "Jurisdiction_243");
		return this;
	}
	public ActivityRulesPage clickUnknown_55(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_55,"Unknown_55");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_103(WebDriver driver,String Jurisdiction_103) {
		BrowserActions.type(driver, inpJurisdiction_103,Jurisdiction_103, "Jurisdiction_103");
		return this;
	}
	public ActivityRulesPage clickValid_134(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_134,"Valid_134");
		return this;
	}
	public ActivityRulesPage enterIncidentType_421(WebDriver driver,String IncidentType_421) {
		BrowserActions.type(driver, inpIncidentType_421,IncidentType_421, "IncidentType_421");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_223(WebDriver driver,String Jurisdiction_223) {
		BrowserActions.type(driver, inpJurisdiction_223,Jurisdiction_223, "Jurisdiction_223");
		return this;
	}
	public ActivityRulesPage clickValid_254(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_254,"Valid_254");
		return this;
	}
	public ActivityRulesPage enterIncidentType_541(WebDriver driver,String IncidentType_541) {
		BrowserActions.type(driver, inpIncidentType_541,IncidentType_541, "IncidentType_541");
		return this;
	}
	public ActivityRulesPage clickValid_374(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_374,"Valid_374");
		return this;
	}
	public ActivityRulesPage clickValid_494(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_494,"Valid_494");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_277(WebDriver driver,String TriggerAction_277)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_277,TriggerAction_277,"TriggerAction_277");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_397(WebDriver driver,String TriggerAction_397)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_397,TriggerAction_397,"TriggerAction_397");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_48(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_48,"PrevExecuting_48");
		return this;
	}
	public ActivityRulesPage enterIncidentType_301(WebDriver driver,String IncidentType_301) {
		BrowserActions.type(driver, inpIncidentType_301,IncidentType_301, "IncidentType_301");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_307(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_307,"NotExecuting_307");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_462(WebDriver driver,String LossPartyType_462) {
		BrowserActions.type(driver, inpLossPartyType_462,LossPartyType_462, "LossPartyType_462");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_547(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_547,"NotExecuting_547");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_427(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_427,"NotExecuting_427");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_582(WebDriver driver,String LossPartyType_582) {
		BrowserActions.type(driver, inpLossPartyType_582,LossPartyType_582, "LossPartyType_582");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_222(WebDriver driver,String LossPartyType_222) {
		BrowserActions.type(driver, inpLossPartyType_222,LossPartyType_222, "LossPartyType_222");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_342(WebDriver driver,String LossPartyType_342) {
		BrowserActions.type(driver, inpLossPartyType_342,LossPartyType_342, "LossPartyType_342");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_57(WebDriver driver,String TriggerAction_57)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_57,TriggerAction_57,"TriggerAction_57");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_102(WebDriver driver,String LossPartyType_102) {
		BrowserActions.type(driver, inpLossPartyType_102,LossPartyType_102, "LossPartyType_102");
		return this;
	}
	public ActivityRulesPage clickExportSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnExportSelected,"ExportSelected");
		return this;
	}
	public ActivityRulesPage enterLossPartyType(WebDriver driver,String LossPartyType) {
		BrowserActions.type(driver, inpLossPartyType,LossPartyType, "LossPartyType");
		return this;
	}
	public ActivityRulesPage clickExecuting_446(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_446,"Executing_446");
		return this;
	}
	public ActivityRulesPage clickUnknown_49(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_49,"Unknown_49");
		return this;
	}
	public ActivityRulesPage clickExecuting_566(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_566,"Executing_566");
		return this;
	}
	public ActivityRulesPage clickExecuting_206(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_206,"Executing_206");
		return this;
	}
	public ActivityRulesPage enterVersion_412(WebDriver driver,String Version_412) {
		BrowserActions.type(driver, inpVersion_412,Version_412, "Version_412");
		return this;
	}
	public ActivityRulesPage clickExecuting_326(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_326,"Executing_326");
		return this;
	}
	public ActivityRulesPage enterVersion_532(WebDriver driver,String Version_532) {
		BrowserActions.type(driver, inpVersion_532,Version_532, "Version_532");
		return this;
	}
	public ActivityRulesPage enterVersion_252(WebDriver driver,String Version_252) {
		BrowserActions.type(driver, inpVersion_252,Version_252, "Version_252");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_605(WebDriver driver,String ExposureSegment_605) {
		BrowserActions.type(driver, inpExposureSegment_605,ExposureSegment_605, "ExposureSegment_605");
		return this;
	}
	public ActivityRulesPage enterNameDescription(WebDriver driver,String NameDescription) {
		BrowserActions.type(driver, inpNameDescription,NameDescription, "NameDescription");
		return this;
	}
	public ActivityRulesPage enterVersion_372(WebDriver driver,String Version_372) {
		BrowserActions.type(driver, inpVersion_372,Version_372, "Version_372");
		return this;
	}
	public ActivityRulesPage enterName_390(WebDriver driver,String Name_390) {
		BrowserActions.type(driver, inpName_390,Name_390, "Name_390");
		return this;
	}
	public ActivityRulesPage enterPolicyType_180(WebDriver driver,String PolicyType_180) {
		BrowserActions.type(driver, inpPolicyType_180,PolicyType_180, "PolicyType_180");
		return this;
	}
	public ActivityRulesPage enterName_270(WebDriver driver,String Name_270) {
		BrowserActions.type(driver, inpName_270,Name_270, "Name_270");
		return this;
	}
	public ActivityRulesPage enterVersion_132(WebDriver driver,String Version_132) {
		BrowserActions.type(driver, inpVersion_132,Version_132, "Version_132");
		return this;
	}
	public ActivityRulesPage enterName_150(WebDriver driver,String Name_150) {
		BrowserActions.type(driver, inpName_150,Name_150, "Name_150");
		return this;
	}
	public ActivityRulesPage enterVersion_492(WebDriver driver,String Version_492) {
		BrowserActions.type(driver, inpVersion_492,Version_492, "Version_492");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_457(WebDriver driver,String TriggerAction_457)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_457,TriggerAction_457,"TriggerAction_457");
		return this;
	}
	public ActivityRulesPage enterLossType_159(WebDriver driver,String LossType_159) {
		BrowserActions.type(driver, inpLossType_159,LossType_159, "LossType_159");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_577(WebDriver driver,String TriggerAction_577)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_577,TriggerAction_577,"TriggerAction_577");
		return this;
	}
	public ActivityRulesPage enterLossType_279(WebDriver driver,String LossType_279) {
		BrowserActions.type(driver, inpLossType_279,LossType_279, "LossType_279");
		return this;
	}
	public ActivityRulesPage enterLossType_399(WebDriver driver,String LossType_399) {
		BrowserActions.type(driver, inpLossType_399,LossType_399, "LossType_399");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_217(WebDriver driver,String TriggerAction_217)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_217,TriggerAction_217,"TriggerAction_217");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_337(WebDriver driver,String TriggerAction_337)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_337,TriggerAction_337,"TriggerAction_337");
		return this;
	}
	public ActivityRulesPage enterActionType_338(WebDriver driver,String ActionType_338) {
		BrowserActions.type(driver, inpActionType_338,ActionType_338, "ActionType_338");
		return this;
	}
	public ActivityRulesPage enterActionType_218(WebDriver driver,String ActionType_218) {
		BrowserActions.type(driver, inpActionType_218,ActionType_218, "ActionType_218");
		return this;
	}
	public ActivityRulesPage enterActionType_578(WebDriver driver,String ActionType_578) {
		BrowserActions.type(driver, inpActionType_578,ActionType_578, "ActionType_578");
		return this;
	}
	public ActivityRulesPage enterActionType_458(WebDriver driver,String ActionType_458) {
		BrowserActions.type(driver, inpActionType_458,ActionType_458, "ActionType_458");
		return this;
	}
	public ActivityRulesPage clickUnknown_509(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_509,"Unknown_509");
		return this;
	}
	public ActivityRulesPage enterExposureType_284(WebDriver driver,String ExposureType_284) {
		BrowserActions.type(driver, inpExposureType_284,ExposureType_284, "ExposureType_284");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_456(WebDriver driver,String TriggerEntity_456)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_456,TriggerEntity_456,"TriggerEntity_456");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_576(WebDriver driver,String TriggerEntity_576)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_576,TriggerEntity_576,"TriggerEntity_576");
		return this;
	}
	public ActivityRulesPage enterExposureType_164(WebDriver driver,String ExposureType_164) {
		BrowserActions.type(driver, inpExposureType_164,ExposureType_164, "ExposureType_164");
		return this;
	}
	public ActivityRulesPage clickInvalid_73(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_73,"Invalid_73");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_527(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_527,"NotExecuting_527");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_407(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_407,"NotExecuting_407");
		return this;
	}
	public ActivityRulesPage clickInvalid_493(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_493,"Invalid_493");
		return this;
	}
	public ActivityRulesPage clickInvalid_373(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_373,"Invalid_373");
		return this;
	}
	public ActivityRulesPage clickInvalid_253(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_253,"Invalid_253");
		return this;
	}
	public ActivityRulesPage clickInvalid_133(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_133,"Invalid_133");
		return this;
	}
	public ActivityRulesPage clickValid_194(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_194,"Valid_194");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_402(WebDriver driver,String LossPartyType_402) {
		BrowserActions.type(driver, inpLossPartyType_402,LossPartyType_402, "LossPartyType_402");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_522(WebDriver driver,String LossPartyType_522) {
		BrowserActions.type(driver, inpLossPartyType_522,LossPartyType_522, "LossPartyType_522");
		return this;
	}
	public ActivityRulesPage clickUnknown_515(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_515,"Unknown_515");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_216(WebDriver driver,String TriggerEntity_216)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_216,TriggerEntity_216,"TriggerEntity_216");
		return this;
	}
	public ActivityRulesPage enterVersion_112(WebDriver driver,String Version_112) {
		BrowserActions.type(driver, inpVersion_112,Version_112, "Version_112");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_336(WebDriver driver,String TriggerEntity_336)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_336,TriggerEntity_336,"TriggerEntity_336");
		return this;
	}
	public ActivityRulesPage enterVersion_472(WebDriver driver,String Version_472) {
		BrowserActions.type(driver, inpVersion_472,Version_472, "Version_472");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_505(WebDriver driver,String ExposureSegment_505) {
		BrowserActions.type(driver, inpExposureSegment_505,ExposureSegment_505, "ExposureSegment_505");
		return this;
	}
	public ActivityRulesPage enterVersion_592(WebDriver driver,String Version_592) {
		BrowserActions.type(driver, inpVersion_592,Version_592, "Version_592");
		return this;
	}
	public ActivityRulesPage enterVersion_232(WebDriver driver,String Version_232) {
		BrowserActions.type(driver, inpVersion_232,Version_232, "Version_232");
		return this;
	}
	public ActivityRulesPage enterName_490(WebDriver driver,String Name_490) {
		BrowserActions.type(driver, inpName_490,Name_490, "Name_490");
		return this;
	}
	public ActivityRulesPage enterVersion_352(WebDriver driver,String Version_352) {
		BrowserActions.type(driver, inpVersion_352,Version_352, "Version_352");
		return this;
	}
	public ActivityRulesPage enterName_370(WebDriver driver,String Name_370) {
		BrowserActions.type(driver, inpName_370,Name_370, "Name_370");
		return this;
	}
	public ActivityRulesPage enterName_250(WebDriver driver,String Name_250) {
		BrowserActions.type(driver, inpName_250,Name_250, "Name_250");
		return this;
	}
	public ActivityRulesPage enterName_130(WebDriver driver,String Name_130) {
		BrowserActions.type(driver, inpName_130,Name_130, "Name_130");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_8(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_8,"PrevExecuting_8");
		return this;
	}
	public ActivityRulesPage clickInvalid_93(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_93,"Invalid_93");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_237(WebDriver driver,String TriggerAction_237)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_237,TriggerAction_237,"TriggerAction_237");
		return this;
	}
	public ActivityRulesPage enterLossType_259(WebDriver driver,String LossType_259) {
		BrowserActions.type(driver, inpLossType_259,LossType_259, "LossType_259");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_357(WebDriver driver,String TriggerAction_357)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_357,TriggerAction_357,"TriggerAction_357");
		return this;
	}
	public ActivityRulesPage enterLossType_379(WebDriver driver,String LossType_379) {
		BrowserActions.type(driver, inpLossType_379,LossType_379, "LossType_379");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_477(WebDriver driver,String TriggerAction_477)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_477,TriggerAction_477,"TriggerAction_477");
		return this;
	}
	public ActivityRulesPage enterLossType_499(WebDriver driver,String LossType_499) {
		BrowserActions.type(driver, inpLossType_499,LossType_499, "LossType_499");
		return this;
	}
	public ActivityRulesPage enterExposureSegment(WebDriver driver,String ExposureSegment) {
		BrowserActions.type(driver, inpExposureSegment,ExposureSegment, "ExposureSegment");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_597(WebDriver driver,String TriggerAction_597)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_597,TriggerAction_597,"TriggerAction_597");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_117(WebDriver driver,String TriggerAction_117)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_117,TriggerAction_117,"TriggerAction_117");
		return this;
	}
	public ActivityRulesPage clickDeploySelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploySelected,"DeploySelected");
		return this;
	}
	public ActivityRulesPage enterActionType_318(WebDriver driver,String ActionType_318) {
		BrowserActions.type(driver, inpActionType_318,ActionType_318, "ActionType_318");
		return this;
	}
	public ActivityRulesPage clickUnknown_529(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_529,"Unknown_529");
		return this;
	}
	public ActivityRulesPage enterActionType_558(WebDriver driver,String ActionType_558) {
		BrowserActions.type(driver, inpActionType_558,ActionType_558, "ActionType_558");
		return this;
	}
	public ActivityRulesPage enterActionType_438(WebDriver driver,String ActionType_438) {
		BrowserActions.type(driver, inpActionType_438,ActionType_438, "ActionType_438");
		return this;
	}
	public ActivityRulesPage clickUnknown_409(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_409,"Unknown_409");
		return this;
	}
	public ActivityRulesPage enterExposureType_144(WebDriver driver,String ExposureType_144) {
		BrowserActions.type(driver, inpExposureType_144,ExposureType_144, "ExposureType_144");
		return this;
	}
	public ActivityRulesPage enterExposureType_384(WebDriver driver,String ExposureType_384) {
		BrowserActions.type(driver, inpExposureType_384,ExposureType_384, "ExposureType_384");
		return this;
	}
	public ActivityRulesPage enterExposureType_264(WebDriver driver,String ExposureType_264) {
		BrowserActions.type(driver, inpExposureType_264,ExposureType_264, "ExposureType_264");
		return this;
	}
	public ActivityRulesPage enterLossType_139(WebDriver driver,String LossType_139) {
		BrowserActions.type(driver, inpLossType_139,LossType_139, "LossType_139");
		return this;
	}
	public ActivityRulesPage clickInvalid_393(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_393,"Invalid_393");
		return this;
	}
	public ActivityRulesPage clickInvalid_273(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_273,"Invalid_273");
		return this;
	}
	public ActivityRulesPage clickInvalid_153(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_153,"Invalid_153");
		return this;
	}
	public ActivityRulesPage clickValid_174(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_174,"Valid_174");
		return this;
	}
	public ActivityRulesPage clickUnknown_415(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_415,"Unknown_415");
		return this;
	}
	public ActivityRulesPage clickValid_294(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_294,"Valid_294");
		return this;
	}
	public ActivityRulesPage clickUnknown_535(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_535,"Unknown_535");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_422(WebDriver driver,String LossPartyType_422) {
		BrowserActions.type(driver, inpLossPartyType_422,LossPartyType_422, "LossPartyType_422");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_542(WebDriver driver,String LossPartyType_542) {
		BrowserActions.type(driver, inpLossPartyType_542,LossPartyType_542, "LossPartyType_542");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_302(WebDriver driver,String LossPartyType_302) {
		BrowserActions.type(driver, inpLossPartyType_302,LossPartyType_302, "LossPartyType_302");
		return this;
	}
	public ActivityRulesPage enterVersion_212(WebDriver driver,String Version_212) {
		BrowserActions.type(driver, inpVersion_212,Version_212, "Version_212");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_436(WebDriver driver,String TriggerEntity_436)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_436,TriggerEntity_436,"TriggerEntity_436");
		return this;
	}
	public ActivityRulesPage enterVersion_332(WebDriver driver,String Version_332) {
		BrowserActions.type(driver, inpVersion_332,Version_332, "Version_332");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_556(WebDriver driver,String TriggerEntity_556)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_556,TriggerEntity_556,"TriggerEntity_556");
		return this;
	}
	public ActivityRulesPage clickNotExecuting_507(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_507,"NotExecuting_507");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_316(WebDriver driver,String TriggerEntity_316)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_316,TriggerEntity_316,"TriggerEntity_316");
		return this;
	}
	public ActivityRulesPage enterPolicyType_380(WebDriver driver,String PolicyType_380) {
		BrowserActions.type(driver, inpPolicyType_380,PolicyType_380, "PolicyType_380");
		return this;
	}
	public ActivityRulesPage enterActionType_498(WebDriver driver,String ActionType_498) {
		BrowserActions.type(driver, inpActionType_498,ActionType_498, "ActionType_498");
		return this;
	}
	public ActivityRulesPage enterName_590(WebDriver driver,String Name_590) {
		BrowserActions.type(driver, inpName_590,Name_590, "Name_590");
		return this;
	}
	public ActivityRulesPage enterVersion_292(WebDriver driver,String Version_292) {
		BrowserActions.type(driver, inpVersion_292,Version_292, "Version_292");
		return this;
	}
	public ActivityRulesPage enterName_470(WebDriver driver,String Name_470) {
		BrowserActions.type(driver, inpName_470,Name_470, "Name_470");
		return this;
	}
	public ActivityRulesPage enterName_350(WebDriver driver,String Name_350) {
		BrowserActions.type(driver, inpName_350,Name_350, "Name_350");
		return this;
	}
	public ActivityRulesPage enterPolicyType_140(WebDriver driver,String PolicyType_140) {
		BrowserActions.type(driver, inpPolicyType_140,PolicyType_140, "PolicyType_140");
		return this;
	}
	public ActivityRulesPage enterName_230(WebDriver driver,String Name_230) {
		BrowserActions.type(driver, inpName_230,Name_230, "Name_230");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_405(WebDriver driver,String ExposureSegment_405) {
		BrowserActions.type(driver, inpExposureSegment_405,ExposureSegment_405, "ExposureSegment_405");
		return this;
	}
	public ActivityRulesPage enterName_110(WebDriver driver,String Name_110) {
		BrowserActions.type(driver, inpName_110,Name_110, "Name_110");
		return this;
	}
	public ActivityRulesPage enterVersion_172(WebDriver driver,String Version_172) {
		BrowserActions.type(driver, inpVersion_172,Version_172, "Version_172");
		return this;
	}
	public ActivityRulesPage enterPolicyType_260(WebDriver driver,String PolicyType_260) {
		BrowserActions.type(driver, inpPolicyType_260,PolicyType_260, "PolicyType_260");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_525(WebDriver driver,String ExposureSegment_525) {
		BrowserActions.type(driver, inpExposureSegment_525,ExposureSegment_525, "ExposureSegment_525");
		return this;
	}
	public ActivityRulesPage enterActionType(WebDriver driver,String ActionType) {
		BrowserActions.type(driver, inpActionType,ActionType, "ActionType");
		return this;
	}
	public ActivityRulesPage enterJurisdiction_183(WebDriver driver,String Jurisdiction_183) {
		BrowserActions.type(driver, inpJurisdiction_183,Jurisdiction_183, "Jurisdiction_183");
		return this;
	}
	public ActivityRulesPage enterLossType_479(WebDriver driver,String LossType_479) {
		BrowserActions.type(driver, inpLossType_479,LossType_479, "LossType_479");
		return this;
	}
	public ActivityRulesPage enterLossType_599(WebDriver driver,String LossType_599) {
		BrowserActions.type(driver, inpLossType_599,LossType_599, "LossType_599");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_417(WebDriver driver,String TriggerAction_417)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_417,TriggerAction_417,"TriggerAction_417");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_537(WebDriver driver,String TriggerAction_537)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_537,TriggerAction_537,"TriggerAction_537");
		return this;
	}
	public ActivityRulesPage clickMore(WebDriver driver)  {
		BrowserActions.click(driver, btnMore,"More");
		return this;
	}
	public ActivityRulesPage enterActionType_138(WebDriver driver,String ActionType_138) {
		BrowserActions.type(driver, inpActionType_138,ActionType_138, "ActionType_138");
		return this;
	}
	public ActivityRulesPage clickExportAll(WebDriver driver)  {
		BrowserActions.click(driver, btnExportAll,"ExportAll");
		return this;
	}
	public ActivityRulesPage enterActionType_378(WebDriver driver,String ActionType_378) {
		BrowserActions.type(driver, inpActionType_378,ActionType_378, "ActionType_378");
		return this;
	}
	public ActivityRulesPage enterActionType_258(WebDriver driver,String ActionType_258) {
		BrowserActions.type(driver, inpActionType_258,ActionType_258, "ActionType_258");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_85(WebDriver driver,String ExposureSegment_85) {
		BrowserActions.type(driver, inpExposureSegment_85,ExposureSegment_85, "ExposureSegment_85");
		return this;
	}
	public ActivityRulesPage clickInvalid_33(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_33,"Invalid_33");
		return this;
	}
	public ActivityRulesPage enterLossType_119(WebDriver driver,String LossType_119) {
		BrowserActions.type(driver, inpLossType_119,LossType_119, "LossType_119");
		return this;
	}
	public ActivityRulesPage enterLossType_239(WebDriver driver,String LossType_239) {
		BrowserActions.type(driver, inpLossType_239,LossType_239, "LossType_239");
		return this;
	}
	public ActivityRulesPage enterLossType_359(WebDriver driver,String LossType_359) {
		BrowserActions.type(driver, inpLossType_359,LossType_359, "LossType_359");
		return this;
	}
	public ActivityRulesPage clickInvalid_293(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_293,"Invalid_293");
		return this;
	}
	public ActivityRulesPage clickInvalid_173(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_173,"Invalid_173");
		return this;
	}
	public ActivityRulesPage clickImportfromFile(WebDriver driver)  {
		BrowserActions.click(driver, btnImportfromFile,"ImportfromFile");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_602(WebDriver driver,String LossPartyType_602) {
		BrowserActions.type(driver, inpLossPartyType_602,LossPartyType_602, "LossPartyType_602");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_416(WebDriver driver,String TriggerEntity_416)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_416,TriggerEntity_416,"TriggerEntity_416");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_536(WebDriver driver,String TriggerEntity_536)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_536,TriggerEntity_536,"TriggerEntity_536");
		return this;
	}
	public ActivityRulesPage enterPolicyType_160(WebDriver driver,String PolicyType_160) {
		BrowserActions.type(driver, inpPolicyType_160,PolicyType_160, "PolicyType_160");
		return this;
	}
	public ActivityRulesPage enterVersion_152(WebDriver driver,String Version_152) {
		BrowserActions.type(driver, inpVersion_152,Version_152, "Version_152");
		return this;
	}
	public ActivityRulesPage enterPolicyType_280(WebDriver driver,String PolicyType_280) {
		BrowserActions.type(driver, inpPolicyType_280,PolicyType_280, "PolicyType_280");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_425(WebDriver driver,String ExposureSegment_425) {
		BrowserActions.type(driver, inpExposureSegment_425,ExposureSegment_425, "ExposureSegment_425");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_545(WebDriver driver,String ExposureSegment_545) {
		BrowserActions.type(driver, inpExposureSegment_545,ExposureSegment_545, "ExposureSegment_545");
		return this;
	}
	public ActivityRulesPage enterName_570(WebDriver driver,String Name_570) {
		BrowserActions.type(driver, inpName_570,Name_570, "Name_570");
		return this;
	}
	public ActivityRulesPage enterVersion_272(WebDriver driver,String Version_272) {
		BrowserActions.type(driver, inpVersion_272,Version_272, "Version_272");
		return this;
	}
	public ActivityRulesPage enterName_450(WebDriver driver,String Name_450) {
		BrowserActions.type(driver, inpName_450,Name_450, "Name_450");
		return this;
	}
	public ActivityRulesPage enterExposureSegment_305(WebDriver driver,String ExposureSegment_305) {
		BrowserActions.type(driver, inpExposureSegment_305,ExposureSegment_305, "ExposureSegment_305");
		return this;
	}
	public ActivityRulesPage enterName_330(WebDriver driver,String Name_330) {
		BrowserActions.type(driver, inpName_330,Name_330, "Name_330");
		return this;
	}
	public ActivityRulesPage enterVersion_392(WebDriver driver,String Version_392) {
		BrowserActions.type(driver, inpVersion_392,Version_392, "Version_392");
		return this;
	}
	public ActivityRulesPage enterName_210(WebDriver driver,String Name_210) {
		BrowserActions.type(driver, inpName_210,Name_210, "Name_210");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_528(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_528,"PrevExecuting_528");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_317(WebDriver driver,String TriggerAction_317)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_317,TriggerAction_317,"TriggerAction_317");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_437(WebDriver driver,String TriggerAction_437)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_437,TriggerAction_437,"TriggerAction_437");
		return this;
	}
	public ActivityRulesPage selectTriggerAction_557(WebDriver driver,String TriggerAction_557)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_557,TriggerAction_557,"TriggerAction_557");
		return this;
	}
	public ActivityRulesPage enterActionType_118(WebDriver driver,String ActionType_118) {
		BrowserActions.type(driver, inpActionType_118,ActionType_118, "ActionType_118");
		return this;
	}
	public ActivityRulesPage enterActionType_358(WebDriver driver,String ActionType_358) {
		BrowserActions.type(driver, inpActionType_358,ActionType_358, "ActionType_358");
		return this;
	}
	public ActivityRulesPage enterActionType_238(WebDriver driver,String ActionType_238) {
		BrowserActions.type(driver, inpActionType_238,ActionType_238, "ActionType_238");
		return this;
	}
	public ActivityRulesPage enterActionType_598(WebDriver driver,String ActionType_598) {
		BrowserActions.type(driver, inpActionType_598,ActionType_598, "ActionType_598");
		return this;
	}
	public ActivityRulesPage enterActionType_478(WebDriver driver,String ActionType_478) {
		BrowserActions.type(driver, inpActionType_478,ActionType_478, "ActionType_478");
		return this;
	}
	public ActivityRulesPage enterExposureType_184(WebDriver driver,String ExposureType_184) {
		BrowserActions.type(driver, inpExposureType_184,ExposureType_184, "ExposureType_184");
		return this;
	}
	public ActivityRulesPage clickInvalid_53(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_53,"Invalid_53");
		return this;
	}
	public ActivityRulesPage enterLossType_219(WebDriver driver,String LossType_219) {
		BrowserActions.type(driver, inpLossType_219,LossType_219, "LossType_219");
		return this;
	}
	public ActivityRulesPage enterLossType_339(WebDriver driver,String LossType_339) {
		BrowserActions.type(driver, inpLossType_339,LossType_339, "LossType_339");
		return this;
	}
	public ActivityRulesPage enterLossType_459(WebDriver driver,String LossType_459) {
		BrowserActions.type(driver, inpLossType_459,LossType_459, "LossType_459");
		return this;
	}
	public ActivityRulesPage clickPrevExecuting_508(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_508,"PrevExecuting_508");
		return this;
	}
	public ActivityRulesPage enterLossType_579(WebDriver driver,String LossType_579) {
		BrowserActions.type(driver, inpLossType_579,LossType_579, "LossType_579");
		return this;
	}
	public ActivityRulesPage selectTriggerEntity_516(WebDriver driver,String TriggerEntity_516)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_516,TriggerEntity_516,"TriggerEntity_516");
		return this;
	}
	public ActivityRulesPage clickLoadfromSpreadsheet(WebDriver driver)  {
		BrowserActions.click(driver, btnLoadfromSpreadsheet,"LoadfromSpreadsheet");
		return this;
	}
	public ActivityRulesPage enterLossPartyType_502(WebDriver driver,String LossPartyType_502) {
		BrowserActions.type(driver, inpLossPartyType_502,LossPartyType_502, "LossPartyType_502");
		return this;
	}
	public ActivityRulesPage clickInvalid_193(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_193,"Invalid_193");
		return this;
	}

	public ActivityRulesPage verifyStatusLabel(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblStatus,"Status");
		return this;
	}
	
	public ActivityRulesPage verifyNameLabel(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblName,"Name ");
		return this;
	}

	public ActivityRulesPage verifyTriggerActionIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTriggerAction,"Trigger Action ");
		return this;
	}

	public ActivityRulesPage verifyTriggerEntityIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTriggerEntity,"Trigger Entity");
		return this;
	}

	public ActivityRulesPage verifyActionTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblActionType,"Trigger Action ");
		return this;
	}

	public ActivityRulesPage verifyLossTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblLossType,"Loss Type");
		return this;
	}
	
	public ActivityRulesPage verifyJurisdictionsIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblJurisdictions,"Jurisdictions");
		return this;
	}

	public ActivityRulesPage verifyPolicyTypesIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblPolicyTypes,"Policy Types");
		return this;
	}

	public ActivityRulesPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Rule Delete Button");
		BrowserActions.confirmAlert(driver, "Are you sure you want to delete this rule?");
		return this;
	}

	public void verifyclickAddedUserNameIsNotDisplayed(WebDriver driver,String name)  {
		boolean flag = false;
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		By nameBy = By.xpath("//div[text()='"+name+"']");
		int size = BrowserActions.getWebElementSize(driver,nameBy, "name",0.5);
		if(size == 0) {
			flag = true;
		}
		Log.softAssertThat(flag, "Activity Rule("+name+") is not deleted", "Activity Rule("+name+") present in list is deleted");
	}
	
	public void clickNameCheckBox(WebDriver driver,String name) {
		if(lblLastPageNo.size()>0) {
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		String pageNo=lblLastPageNo.get(0).getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
		By userRoleCheckBox = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		int size = BrowserActions.getWebElementSize(driver, userRoleCheckBox,"user role check box",0.5);
		if (size > 0) {
			By userNameBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
			BrowserActions.waitForElementToDisplay(driver, userNameBy,"userName");
			WebElement userName = userNameBy.findElement(driver);
			BrowserActions.click(driver, userName,"Check box");
			break;
		}
		else {
			BrowserActions.click(driver, btnNextArrow,true,"Next Button");
			BrowserActions.verifyElementDisplayed(driver, lblLossTypeHeader,"Loss Type",1);
		}
		}
		}
		else 
		{
			By userNameBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
			BrowserActions.waitForElementToDisplay(driver, userNameBy,"userName");
			WebElement userName = userNameBy.findElement(driver);
			BrowserActions.click(driver, userName,"Check box");
		}
	}

	public ActivityRulesPage clickUpToActivityRules(WebDriver driver)  {
		BrowserActions.click(driver, btnUpToActivityRules,"Up to Activity rules");
		return this;
	}
	
	public void clickActivityRuleNameLink(WebDriver driver,String name) {
		if(lblLastPageNo.size()>0) {
		BrowserActions.waitForElementToDisplay(driver,lblName);
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		String pageNo=lblLastPageNo.get(0).getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			By activityRuleName = By.xpath("//div[text()='"+name+"']");
			int size = BrowserActions.getWebElementSize(driver, activityRuleName, "activityRuleName",0.5 );
			if (size > 0) {
				By ruleNameBy = By.xpath("//div[text()='"+name+"']");
				BrowserActions.waitForElementToDisplay(driver, ruleNameBy, "rule Name");
				WebElement ruleName = ruleNameBy.findElement(driver);
				BrowserActions.click(driver, ruleName, "Activity Rule Name");
				break;
			}
			else {
				BrowserActions.click(driver, btnNextArrow,2,"Next Button");
				//BrowserActions.waitForElementToDisplay(driver, lblLossTypeHeader);
			}
		}}
		else
		{
			By ruleNameBy = By.xpath("//div[text()='"+name+"']");
			BrowserActions.waitForElementToDisplay(driver, ruleNameBy, "rule Name");
			WebElement ruleName = ruleNameBy.findElement(driver);
			BrowserActions.click(driver, ruleName, "Activity Rule Name");
		}
	}

	public void verifyCloneNameIsDisplayed(WebDriver driver,String name)  {
		By elementsBy = By.xpath("//div[@class='element']");
		List<WebElement> elements = BrowserActions.getWebElements(driver, elementsBy, "elements", 0.5);
		for (WebElement element : elements) {
		    if (element.getText().contains("cloned of"+name)) {
		       Log.message(element.getText()+" Name is Cloned ");
		    }
		}
	}

	public class NewActivityRulePage extends LoadableComponent<NewActivityRulePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-TypeId']", AI = false)
		public WebElement inpTypeId;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		public WebElement inpOperatorLabel_15;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		public WebElement inpRightParensLabel_17;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		public WebElement inpAndOrLabel_12;

		@IFindBy(how = How.CSS, using = "select[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-Jurisdictions-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget_3;

		@IFindBy(how = How.CSS, using = "select[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-PolicyTypes-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget_2;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-cardTab", AI = false)
		public WebElement btnParameters_20;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-ConditionValidationToolbarButtonSet-HideValidation>div[role='button']", AI = false)
		public WebElement btnNoValidationErrors_1;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-ConditionValidationToolbarButtonSet-ShowValidation>div[role='button']", AI = false)
		public WebElement btnNoValidationErrors;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleManagementAuditLinkInputSet-Link", AI = false)
		public WebElement btnViewHistory;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_19;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-Jurisdictions-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbClaimJurisdiction;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		public WebElement inpRightParensLabel;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionValidationErrors-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_22;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableNameID']", AI = false)
		public WebElement inpVariableNameID;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleInsert>div[role='button']", AI = false)
		public WebElement btnInsert_7;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-DuplicatedNameAlertBar-CloseBtn", AI = false)
		public WebElement btnClose;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleAdd>div[role='button']", AI = false)
		public WebElement btnAdd_6;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedAdd>div[role='button']", AI = false)
		public WebElement btnAdd_4;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveUp>div[role='button']", AI = false)
		public WebElement btnSimpleMoveUp;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-PolicyTypes-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbPolicyType;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-DisplayRuleCondition']", AI = false)
		public WebElement rdbDisplayRuleConditions;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-DuplicatedNameAlertBar .gw-AlertBar--label", AI = false)
		public WebElement lblAnotherrulehasthesamename;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedShowPrettyPrint>div[role='button']", AI = false)
		public WebElement btnShowFormattedView;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveDown>div[role='button']", AI = false)
		public WebElement btnSimpleMoveDown;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedContextHelp>div[role='button']", AI = false)
		public WebElement btnContextHelpALTH;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		public WebElement inpLeftOperandLabel;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-MoveDown>div[role='button']", AI = false)
		public WebElement btnMoveDown;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-NoVariableText']", AI = false)
		public WebElement inpNovariablesdeclared;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-Name']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleContextHelp>div[role='button']", AI = false)
		public WebElement btnContextHelpALTH_11;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		public WebElement inpOperatorLabel;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveUp>div[role='button']", AI = false)
		public WebElement btnAdvancedMoveUp;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-Description textarea", AI = false)
		public WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "select[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossTypes-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		public WebElement inpLeftParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		public WebElement inpRightOperandLabel_16;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedInsert>div[role='button']", AI = false)
		public WebElement btnInsert;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ContextDescription']", AI = false)
		public WebElement inpContextDescription;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleShowPrettyPrint>div[role='button']", AI = false)
		public WebElement btnShowFormattedView_9;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-AvailableToRunInputSet-Note']", AI = false)
		public WebElement inpNote;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		public WebElement inpLeftParensLabel_13;

		@IFindBy(how = How.CSS, using = "select[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleContextDefinitionKey']", AI = false)
		public WebElement drpTriggerEntity;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-Add>div[role='button']", AI = false)
		public WebElement btnAddAction;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedRemove>div[role='button']", AI = false)
		public WebElement btnRemove_5;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleRemove>div[role='button']", AI = false)
		public WebElement btnRemove_8;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-Remove>div[role='button']", AI = false)
		public WebElement btnRemoveAction;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-AvailableToRunInputSet-Value']", AI = false)
		public WebElement rdbEnabled;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-RuleConditionTitle", AI = false)
		public WebElement lblRuleConditionTitle;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariableTitle", AI = false)
		public WebElement lblRuleVariableTitle;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-cardTab", AI = false)
		public WebElement btnParameters;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleManagementAuditLinkInputSet-Summary", AI = false)
		public WebElement btnLastEditedbysuon04262023;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		public WebElement inpRightOperandLabel;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveDown>div[role='button']", AI = false)
		public WebElement btnAdvancedMoveDown;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-ExpressionID']", AI = false)
		public WebElement inpExpressionID;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-MoveUp>div[role='button']", AI = false)
		public WebElement btnMoveUp;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		public WebElement inpAndOrLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableDescriptionID']", AI = false)
		public WebElement inpVariableDescriptionID;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedHidePrettyPrint>div[role='button']", AI = false)
		public WebElement btnHideFormattedView;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionValidationErrors-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_21;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		public WebElement inpLeftOperandLabel_14;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_18;

		@IFindBy(how = How.CSS, using = "input[name='CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossTypes-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbLossType;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleHidePrettyPrint>div[role='button']", AI = false)
		public WebElement btnHideFormattedView_10;

		@IFindBy(how = How.CSS, using = "#CreateActivityRulePage-CCRuleCreationScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;
		
		@IFindBy(how = How.CSS, using = "select[name$='TriggeringPointKey']", AI = false)
		public WebElement drpTriggerAction;
		
		@IFindBy(how = How.CSS, using = "input[name$='RuleVariableLV-0-variableName']", AI = false)
		public WebElement inpRuleVariableName;

		@IFindBy(how = How.CSS, using = "input[name$='RuleVariableLV-0-variableDescription']", AI = false)
		public WebElement inpRuleVariableDescription;

		@IFindBy(how = How.CSS, using = "input[name$='VariableExpressionFragCell-Expression']", AI = false)
		public WebElement inpRuleVariableExpression;

		@IFindBy(how = How.CSS, using = "select[name$='RuleActionKey']", AI = false)
		public WebElement drpActionType;

		@IFindBy(how = How.CSS, using = "select[name$='CommandDefinitionDV-activity_pattern']", AI = false)
		public WebElement drpActivityPattern;

		@IFindBy(how = How.CSS, using = "select[name$='CommandDefinitionDV-TypeInput']", AI = false)
		public WebElement drptype;

		@IFindBy(how = How.CSS, using = "input[name$='TemplateExpression']", AI = false)
		public WebElement inpActionDescription;
		
		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnSave;


		public NewActivityRulePage(){
		}

		public NewActivityRulePage(WebDriver driver) throws Exception{
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
		}public NewActivityRulePage enterTypeId(WebDriver driver,String TypeId) {
			BrowserActions.type(driver, inpTypeId,TypeId, "TypeId");
			return this;
		}
		public NewActivityRulePage enterOperatorLabel_15(WebDriver driver,String OperatorLabel_15) {
			BrowserActions.type(driver, inpOperatorLabel_15,OperatorLabel_15, "OperatorLabel_15");
			return this;
		}
		public NewActivityRulePage enterRightParensLabel_17(WebDriver driver,String RightParensLabel_17) {
			BrowserActions.type(driver, inpRightParensLabel_17,RightParensLabel_17, "RightParensLabel_17");
			return this;
		}
		public NewActivityRulePage enterAndOrLabel_12(WebDriver driver,String AndOrLabel_12) {
			BrowserActions.type(driver, inpAndOrLabel_12,AndOrLabel_12, "AndOrLabel_12");
			return this;
		}
		public NewActivityRulePage selectInputWidget_3(WebDriver driver,String InputWidget_3)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_3,InputWidget_3,"InputWidget_3");
			return this;
		}
		public NewActivityRulePage selectInputWidget_2(WebDriver driver,String InputWidget_2)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_2,InputWidget_2,"InputWidget_2");
			return this;
		}
		public NewActivityRulePage clickParameters_20(WebDriver driver)  {
			BrowserActions.click(driver, btnParameters_20,"Parameters_20");
			return this;
		}
		public NewActivityRulePage selectTriggerAction(WebDriver driver,String TriggerAction)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction,TriggerAction,0.5,"TriggerAction");
			return this;
		}
		public NewActivityRulePage clickNoValidationErrors_1(WebDriver driver)  {
			BrowserActions.click(driver, btnNoValidationErrors_1,"NoValidationErrors_1");
			return this;
		}
		public NewActivityRulePage clickNoValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnNoValidationErrors,"NoValidationErrors");
			return this;
		}
		public NewActivityRulePage clickViewHistory(WebDriver driver)  {
			BrowserActions.click(driver, btnViewHistory,"ViewHistory");
			return this;
		}
		public NewActivityRulePage clickLabel_19(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_19,"Label_19");
			return this;
		}
		public NewActivityRulePage clickClaimJurisdiction(WebDriver driver)  {
			BrowserActions.click(driver, rdbClaimJurisdiction,"ClaimJurisdiction");
			return this;
		}
		public NewActivityRulePage enterRightParensLabel(WebDriver driver,String RightParensLabel) {
			BrowserActions.type(driver, inpRightParensLabel,RightParensLabel, "RightParensLabel");
			return this;
		}
		public NewActivityRulePage clickLabel_22(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_22,"Label_22");
			return this;
		}
		public NewActivityRulePage enterVariableNameID(WebDriver driver,String VariableNameID) {
			BrowserActions.type(driver, inpVariableNameID,VariableNameID, "VariableNameID");
			return this;
		}
		public NewActivityRulePage clickInsert_7(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert_7,"Insert_7");
			return this;
		}
		public NewActivityRulePage clickClose(WebDriver driver)  {
			BrowserActions.click(driver, btnClose,"Close");
			return this;
		}
		public NewActivityRulePage clickAdd_6(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_6,"Add_6");
			return this;
		}
		public NewActivityRulePage clickAdd_4(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_4,"Add_4");
			return this;
		}
		public NewActivityRulePage clickSimpleMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveUp,"SimpleMoveUp");
			return this;
		}
		public NewActivityRulePage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewActivityRulePage clickValidationErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon,"ValidationErrorIcon");
			return this;
		}
		public NewActivityRulePage clickPolicyType(WebDriver driver)  {
			BrowserActions.click(driver, rdbPolicyType,"PolicyType");
			return this;
		}
		public NewActivityRulePage clickDisplayRuleConditions(WebDriver driver)  {
			BrowserActions.click(driver, rdbDisplayRuleConditions,"DisplayRuleConditions");
			return this;
		}
		public NewActivityRulePage clickShowFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView,"ShowFormattedView");
			return this;
		}
		public NewActivityRulePage clickSimpleMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveDown,"SimpleMoveDown");
			return this;
		}
		public NewActivityRulePage clickContextHelpALTH(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH,"ContextHelpALTH");
			return this;
		}
		public NewActivityRulePage enterLeftOperandLabel(WebDriver driver,String LeftOperandLabel) {
			BrowserActions.type(driver, inpLeftOperandLabel,LeftOperandLabel, "LeftOperandLabel");
			return this;
		}
		public NewActivityRulePage clickMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnMoveDown,"MoveDown");
			return this;
		}
		public NewActivityRulePage enterNovariablesdeclared(WebDriver driver,String Novariablesdeclared) {
			BrowserActions.type(driver, inpNovariablesdeclared,Novariablesdeclared, "Novariablesdeclared");
			return this;
		}
		public NewActivityRulePage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewActivityRulePage clickContextHelpALTH_11(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH_11,"ContextHelpALTH_11");
			return this;
		}
		public NewActivityRulePage enterOperatorLabel(WebDriver driver,String OperatorLabel) {
			BrowserActions.type(driver, inpOperatorLabel,OperatorLabel, "OperatorLabel");
			return this;
		}
		public NewActivityRulePage clickLabel(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel,"Label");
			return this;
		}
		public NewActivityRulePage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public NewActivityRulePage clickAdvancedMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveUp,"AdvancedMoveUp");
			return this;
		}
		public NewActivityRulePage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description,true, "Description");
			return this;
		}
		public NewActivityRulePage clickSave(WebDriver driver)  {
			BrowserActions.click(driver, btnSave,"Save");
			return this;
		}
		public NewActivityRulePage selectInputWidget(WebDriver driver,String InputWidget)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget,InputWidget,"InputWidget");
			return this;
		}
		public NewActivityRulePage enterLeftParensLabel(WebDriver driver,String LeftParensLabel) {
			BrowserActions.type(driver, inpLeftParensLabel,LeftParensLabel, "LeftParensLabel");
			return this;
		}
		public NewActivityRulePage enterRightOperandLabel_16(WebDriver driver,String RightOperandLabel_16) {
			BrowserActions.type(driver, inpRightOperandLabel_16,RightOperandLabel_16, "RightOperandLabel_16");
			return this;
		}
		public NewActivityRulePage clickInsert(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert,"Insert");
			return this;
		}
		public NewActivityRulePage enterContextDescription(WebDriver driver,String ContextDescription) {
			BrowserActions.type(driver, inpContextDescription,ContextDescription, "ContextDescription");
			return this;
		}
		public NewActivityRulePage clickShowFormattedView_9(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView_9,"ShowFormattedView_9");
			return this;
		}
		public NewActivityRulePage enterNote(WebDriver driver,String Note) {
			BrowserActions.type(driver, inpNote,Note, "Note");
			return this;
		}
		public NewActivityRulePage enterLeftParensLabel_13(WebDriver driver,String LeftParensLabel_13) {
			BrowserActions.type(driver, inpLeftParensLabel_13,LeftParensLabel_13, "LeftParensLabel_13");
			return this;
		}
		public NewActivityRulePage selectTriggerEntity(WebDriver driver,String TriggerEntity)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity,TriggerEntity,true,"TriggerEntity");
			return this;
		}
		public NewActivityRulePage clickAddAction(WebDriver driver)  {
			BrowserActions.click(driver, btnAddAction,"AddAction");
			return this;
		}
		public NewActivityRulePage clickRemove_5(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_5,"Remove_5");
			return this;
		}
		public NewActivityRulePage clickRemove_8(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_8,"Remove_8");
			return this;
		}
		public NewActivityRulePage clickRemoveAction(WebDriver driver)  {
			BrowserActions.click(driver, btnRemoveAction,"RemoveAction");
			return this;
		}
		public NewActivityRulePage clickEnabled(WebDriver driver)  {
			BrowserActions.click(driver, rdbEnabled,"Enabled");
			return this;
		}
		public NewActivityRulePage clickParameters(WebDriver driver)  {
			BrowserActions.click(driver, btnParameters,"Parameters");
			return this;
		}
		public NewActivityRulePage clickLastEditedbysuon04262023(WebDriver driver)  {
			BrowserActions.click(driver, btnLastEditedbysuon04262023,"LastEditedbysuon04262023");
			return this;
		}
		public NewActivityRulePage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewActivityRulePage enterRightOperandLabel(WebDriver driver,String RightOperandLabel) {
			BrowserActions.type(driver, inpRightOperandLabel,RightOperandLabel, "RightOperandLabel");
			return this;
		}
		public NewActivityRulePage clickAdvancedMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveDown,"AdvancedMoveDown");
			return this;
		}
		public NewActivityRulePage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewActivityRulePage enterExpressionID(WebDriver driver,String ExpressionID) {
			BrowserActions.type(driver, inpExpressionID,ExpressionID, "ExpressionID");
			return this;
		}
		public NewActivityRulePage clickMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnMoveUp,"MoveUp");
			return this;
		}
		public NewActivityRulePage enterAndOrLabel(WebDriver driver,String AndOrLabel) {
			BrowserActions.type(driver, inpAndOrLabel,AndOrLabel, "AndOrLabel");
			return this;
		}
		public NewActivityRulePage enterVariableDescriptionID(WebDriver driver,String VariableDescriptionID) {
			BrowserActions.type(driver, inpVariableDescriptionID,VariableDescriptionID, "VariableDescriptionID");
			return this;
		}
		public NewActivityRulePage clickHideFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView,"HideFormattedView");
			return this;
		}
		public NewActivityRulePage clickValidationErrorIcon_21(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_21,"ValidationErrorIcon_21");
			return this;
		}
		public NewActivityRulePage enterLeftOperandLabel_14(WebDriver driver,String LeftOperandLabel_14) {
			BrowserActions.type(driver, inpLeftOperandLabel_14,LeftOperandLabel_14, "LeftOperandLabel_14");
			return this;
		}
		public NewActivityRulePage clickValidationErrorIcon_18(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_18,"ValidationErrorIcon_18");
			return this;
		}
		public NewActivityRulePage clickLossType(WebDriver driver)  {
			BrowserActions.click(driver, rdbLossType,"LossType");
			return this;
		}
		public NewActivityRulePage clickHideFormattedView_10(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView_10,"HideFormattedView_10");
			return this;
		}
		
		public NewActivityRulePage enterRuleVariableName(WebDriver driver,String ruleName) {
			BrowserActions.type(driver, inpRuleVariableName,ruleName, "Rule Name");
			return this;
		}

		public NewActivityRulePage enterRuleVariableDescription(WebDriver driver,String ruleDescription) {
			BrowserActions.type(driver, inpRuleVariableDescription,ruleDescription, "Rule Description");
			return this;
		}

		public NewActivityRulePage enterRuleVariableExpression(WebDriver driver,String ruleVariableExpression) {
			BrowserActions.type(driver, inpRuleVariableExpression,ruleVariableExpression, "Rule Variable Expression");
			return this;
		}

		public NewActivityRulePage selectActionType(WebDriver driver,String actionType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpActionType,actionType,"Action Type");
			return this;
		}
		
		public NewActivityRulePage selectActivityPattern(WebDriver driver,String activityPattern)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpActivityPattern,activityPattern,"Activity Pattern");
			return this;
		}

		public NewActivityRulePage selectType(WebDriver driver,String type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drptype,type,"Action Parameter Type");
			return this;
		}

		public NewActivityRulePage enterActionDescription(WebDriver driver,String description)  {
			BrowserActions.type(driver, inpActionDescription,description,"Action Parameter description");
			return this;
		}

	}
}