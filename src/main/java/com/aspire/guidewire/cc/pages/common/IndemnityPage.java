package com.aspire.guidewire.cc.pages.common;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class IndemnityPage extends LoadableComponent<IndemnityPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-AppliesToPPD']", AI = false)
	public WebElement chkPPD;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-FactorComment']", AI = false)
	public WebElement inpComment_34;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-AppliesToPTD']", AI = false)
	public WebElement chkPTD_37;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_ReopenButton>div[role='button']", AI = false)
	public WebElement btnReopenExposure;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-DetailedFactor']", AI = false)
	public WebElement drpDetailedFactor_32;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-StatLine']", AI = false)
	public WebElement drpStatisticalLine;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ReopenedReason']", AI = false)
	public WebElement drpReasonReopened;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-Units']", AI = false)
	public WebElement inpUnits;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TTD-WCBenefitTTDInputSet-TTD_MinStateCompRate']", AI = false)
	public WebElement inpMinStateCompRate;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-DaysInWeek']", AI = false)
	public WebElement drpDaysinWeek;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-FactorCategory']", AI = false)
	public WebElement drpCategory;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ReOpenDate']", AI = false)
	public WebElement inpReopenDate;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-Jurisdiction']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-FactorComment']", AI = false)
	public WebElement inpComment;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_CloseButton>div[role='button']", AI = false)
	public WebElement btnCloseExposure;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-FactorComment']", AI = false)
	public WebElement inpComment_42;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-Exposure_WageStmtRecd']", AI = false)
	public WebElement inpDateWageStatementReceived;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ClosedOutcome']", AI = false)
	public WebElement drpResolution;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ClosedDate_dateIcon", AI = false)
	public WebElement btnCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TPD-WCBenefitTPDInputSet-TPD_MaxStateCompRate']", AI = false)
	public WebElement inpMaxStateCompRate_9;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToWorkDate']", AI = false)
	public WebElement inpReturntoNormalDuty;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ExposureWorkloadInputSet-ClassificationWorkload']", AI = false)
	public WebElement inpClassificationWeight;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-CreateTime_dateIcon", AI = false)
	public WebElement btnCreateDateDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToWorkDate_dateIcon", AI = false)
	public WebElement btnReturntoNormalDutyDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-EditableWorkStatusChangesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_4;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-EditableSettlementsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_48;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-EditableBenefitPeriodsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_6;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-DeductibleInfoInputSet-DeductibleEditReason']", AI = false)
	public WebElement inpEditReason;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-AppliesToTPD']", AI = false)
	public WebElement chkTPD;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-WPInputSet-WaitingPeriodInputSet-TTD_RetroactivePeriod']", AI = false)
	public WebElement inpRetroactivePeriod;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-WPInputSet-WaitingPeriodInputSet-WaitingPeriodDetail-EditableWaitingPeriodsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_15;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TTD-WCBenefitTTDInputSet-TTDRefData']", AI = false)
	public WebElement inpReferenceData;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-PPDCR']", AI = false)
	public WebElement inpWeeklyCompRate_30;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-AppliesToTTD']", AI = false)
	public WebElement chkTTD_43;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-StatLine-StatLine_PickerButton", AI = false)
	public WebElement btnStatLine_PickerButton;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ValidationLevel']", AI = false)
	public WebElement drpValidationLevel;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToModWorkDate_dateIcon", AI = false)
	public WebElement btnReturntoModifiedDutyDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-AppliesToPPD']", AI = false)
	public WebElement chkPPD_38;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToWorkActual']", AI = false)
	public WebElement rdbReturnToWorkActual;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TTD-WCBenefitTTDInputSet-TTDPercentOfWages']", AI = false)
	public WebElement inpOfWages;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-StatLine_Warning']", AI = false)
	public WebElement inpStatLine_Warning;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-WPInputSet-WaitingPeriodInputSet-WCDoesnotApplytoPTD']", AI = false)
	public WebElement chkWCDoesnotApplytoPTD;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_CreateReserveButton>div[role='button']", AI = false)
	public WebElement btnCreateReserve;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PTD-WCBenefitPTDInputSet-PTDCR']", AI = false)
	public WebElement inpWeeklyCompRate_23;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PTD-WCBenefitPTDInputSet-PTDCompRateUnavailable']", AI = false)
	public WebElement inpWeeklyCompRate_22;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-PPDCompRateUnavailable']", AI = false)
	public WebElement inpWeeklyCompRate_29;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-DeductibleInfoInputSet-DeductibleWaived']", AI = false)
	public WebElement rdbWaived;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ExposureWorkloadInputSet-SupplementalWorkloadWeight']", AI = false)
	public WebElement inpSupplementalWeight;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-EditableClaimantDependentsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-Exposure_WageStmtSent_dateIcon", AI = false)
	public WebElement btnDateWageStatementSentDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-AssignedUser_Name']", AI = false)
	public WebElement inpAdjuster;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ExposureWorkloadInputSet-TotalWorkloadWeight']", AI = false)
	public WebElement inpTotalWeight;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TPD-WCBenefitTPDInputSet-TPDPercentOfWages']", AI = false)
	public WebElement inpOfWages_8;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-Strategy']", AI = false)
	public WebElement drpHandlingStrategy;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-AppliesToPTD']", AI = false)
	public WebElement chkPTD;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TPD-WCBenefitTPDInputSet-MinStateCompRateAdj textarea", AI = false)
	public WebElement inpMinimumAdjustment_11;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-FactorCategory']", AI = false)
	public WebElement drpCategory_39;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TPD-WCBenefitTPDInputSet-TPDCR']", AI = false)
	public WebElement inpWeeklyCompRate_14;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-CreatedVia']", AI = false)
	public WebElement drpCreatedVia;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TPD-WCBenefitTPDInputSet-TPDCompRateUnavailable']", AI = false)
	public WebElement inpWeeklyCompRate_13;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PTD-WCBenefitPTDInputSet-PTDPercentOfWages']", AI = false)
	public WebElement inpOfWages_17;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-AppliesToTTD']", AI = false)
	public WebElement chkTTD;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TTD-WCBenefitTTDInputSet-TTDCompRateUnavailable']", AI = false)
	public WebElement inpWeeklyCompRate;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-WPInputSet-WaitingPeriodInputSet-WaitingPeriodDays']", AI = false)
	public WebElement inpWaitingPeriodDays;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-CreateTime']", AI = false)
	public WebElement inpCreateDate;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-PPDRefData']", AI = false)
	public WebElement inpReferenceData_28;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-WPInputSet-WaitingPeriodInputSet-WaitingPeriodApplied']", AI = false)
	public WebElement rdbWaitingPeriodApplied;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PTD-WCBenefitPTDInputSet-PTDRefData']", AI = false)
	public WebElement inpReferenceData_21;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToModWorkDate']", AI = false)
	public WebElement inpReturntoModifiedDuty;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-Units']", AI = false)
	public WebElement inpUnits_41;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ReOpenDate_dateIcon", AI = false)
	public WebElement btnReopenDateDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-EditableSettlementsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_47;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TTD-WCBenefitTTDInputSet-TTD_MaxStateCompRate']", AI = false)
	public WebElement inpMaxStateCompRate;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PTD-WCBenefitPTDInputSet-MinStateCompRateAdj textarea", AI = false)
	public WebElement inpMinimumAdjustment_20;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-MaxTotalPPD']", AI = false)
	public WebElement inpPPDMaximumbenefit;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-AppliesToTTD']", AI = false)
	public WebElement chkTTD_35;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-PPDPercentOfWages']", AI = false)
	public WebElement inpOfWages_24;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-WPInputSet-WaitingPeriodInputSet-WCDoesnotApplytoPPD']", AI = false)
	public WebElement chkWCDoesnotApplytoPPD;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-BenefitsCardTab", AI = false)
	public WebElement btnBenefits;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_RefreshButton>div[role='button']", AI = false)
	public WebElement btnRefreshResponses;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-0-DetailedFactor']", AI = false)
	public WebElement drpDetailedFactor;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-AppliesToPPD']", AI = false)
	public WebElement chkPPD_46;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-PrimaryCoverage']", AI = false)
	public WebElement drpPrimaryCoverage;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-MinStateCompRateAdj textarea", AI = false)
	public WebElement inpMinimumAdjustment_27;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TPD-WCBenefitTPDInputSet-TPDRefData']", AI = false)
	public WebElement inpReferenceData_12;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-Segment']", AI = false)
	public WebElement drpSegment;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-DeductibleInfoInputSet-DeductibleOverridden']", AI = false)
	public WebElement rdbModified;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TTD-WCBenefitTTDInputSet-TTDCR']", AI = false)
	public WebElement inpWeeklyCompRate_7;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-Exposure_WageStmtRecd_dateIcon", AI = false)
	public WebElement btnDateWageStatementReceivedDateIcon;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar'] div[id$='ExposureDetailScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-RTModWReadOnlyMSG']", AI = false)
	public WebElement inpReturntoModifiedDuty_1;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-SummaryCardTab", AI = false)
	public WebElement btnSummary;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-LWImpairment']", AI = false)
	public WebElement inpPPDPercentage;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-AssignedGroup_Name']", AI = false)
	public WebElement inpGroup;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-WPInputSet-WaitingPeriodInputSet-WaitingPeriodDetail-EditableWaitingPeriodsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_16;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-PPD_MaxStateCompRate']", AI = false)
	public WebElement inpMaxStateCompRate_25;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PTD-WCBenefitPTDInputSet-PTD_MinStateCompRate']", AI = false)
	public WebElement inpMinStateCompRate_19;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-EditableClaimantDependentsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ExposureWorkloadInputSet-Classification']", AI = false)
	public WebElement inpClassification;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-State']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TPD-WCBenefitTPDInputSet-TPD_MinStateCompRate']", AI = false)
	public WebElement inpMinStateCompRate_10;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-DetailedFactor']", AI = false)
	public WebElement drpDetailedFactor_40;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-EditableBenefitPeriodsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_5;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-EditableWorkStatusChangesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_3;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-TTD-WCBenefitTTDInputSet-MinStateCompRateAdj textarea", AI = false)
	public WebElement inpMinimumAdjustment;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-AppliesToPTD']", AI = false)
	public WebElement chkPTD_45;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-AppliesToTPD']", AI = false)
	public WebElement chkTPD_36;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-ClosedDate']", AI = false)
	public WebElement inpCloseDate;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-RTWReadOnlyMSG']", AI = false)
	public WebElement inpReturntoNormalDuty_2;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToWorkValid']", AI = false)
	public WebElement rdbRTWApplicable;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PTD-WCBenefitPTDInputSet-PTD_MaxStateCompRate']", AI = false)
	public WebElement inpMaxStateCompRate_18;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-PPD_MinStateCompRate']", AI = false)
	public WebElement inpMinStateCompRate_26;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToModWorkActual']", AI = false)
	public WebElement rdbReturnToModWorkActual;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_AssignButton>div[role='button']", AI = false)
	public WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-Exposure_WageStmtSent']", AI = false)
	public WebElement inpDateWageStatementSent;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesSummaryDV-RTW-ReturnToWorkInputSet-ReturnToModWorkValid']", AI = false)
	public WebElement rdbModifiedDutyApplicable;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-2-AppliesToTPD']", AI = false)
	public WebElement chkTPD_44;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-Units']", AI = false)
	public WebElement inpUnits_33;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_SendToISOButton>div[role='button']", AI = false)
	public WebElement btnSendToISO;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-PPD-WCBenefitPPDInputSet-PPDWeeks']", AI = false)
	public WebElement inpPDNumberofWeeks;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-LostWagesBenefitsDV-OtherJurisdictionalFactors-WCBenefitFactorsLV-1-FactorCategory']", AI = false)
	public WebElement drpCategory_31;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Segment']", AI = false)
	public WebElement lblsegment;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Indemnity']//ancestor::div[contains(@id,'Claim_TopLevelExposureDetail')]", AI = false)
	private WebElement btnIndemnity;

	public IndemnityPage(){
	}

	public IndemnityPage(WebDriver driver){
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
}public IndemnityPage clickPPD(WebDriver driver)  {
					BrowserActions.click(driver, chkPPD,"PPD");
				    return this;
			}
public IndemnityPage enterComment_34(WebDriver driver,String Comment_34) {
		            BrowserActions.type(driver, inpComment_34,Comment_34, "Comment_34");
			        return this;
           }
public IndemnityPage clickPTD_37(WebDriver driver)  {
					BrowserActions.click(driver, chkPTD_37,"PTD_37");
				    return this;
			}
public IndemnityPage clickReopenExposure(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenExposure,"ReopenExposure");
				    return this;
			}
public IndemnityPage selectDetailedFactor_32(WebDriver driver,String DetailedFactor_32)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDetailedFactor_32,DetailedFactor_32,"DetailedFactor_32");
				    return this;
			}
public IndemnityPage selectStatisticalLine(WebDriver driver,String StatisticalLine)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatisticalLine,StatisticalLine,"StatisticalLine");
				    return this;
			}
public IndemnityPage selectReasonReopened(WebDriver driver,String ReasonReopened)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReasonReopened,ReasonReopened,"ReasonReopened");
				    return this;
			}
public IndemnityPage enterUnits(WebDriver driver,String Units) {
		            BrowserActions.type(driver, inpUnits,Units, "Units");
			        return this;
           }
public IndemnityPage enterMinStateCompRate(WebDriver driver,String MinStateCompRate) {
		            BrowserActions.type(driver, inpMinStateCompRate,MinStateCompRate, "MinStateCompRate");
			        return this;
           }
public IndemnityPage selectDaysinWeek(WebDriver driver,String DaysinWeek)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDaysinWeek,DaysinWeek,"DaysinWeek");
				    return this;
			}
public IndemnityPage selectCategory(WebDriver driver,String Category)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
				    return this;
			}
public IndemnityPage enterReopenDate(WebDriver driver,String ReopenDate) {
		            BrowserActions.type(driver, inpReopenDate,ReopenDate, "ReopenDate");
			        return this;
           }
public IndemnityPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public IndemnityPage enterComment(WebDriver driver,String Comment) {
		            BrowserActions.type(driver, inpComment,Comment, "Comment");
			        return this;
           }
public IndemnityPage clickCloseExposure(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseExposure,"CloseExposure");
				    return this;
			}
public IndemnityPage enterComment_42(WebDriver driver,String Comment_42) {
		            BrowserActions.type(driver, inpComment_42,Comment_42, "Comment_42");
			        return this;
           }
public IndemnityPage enterDateWageStatementReceived(WebDriver driver,String DateWageStatementReceived) {
		            BrowserActions.type(driver, inpDateWageStatementReceived,DateWageStatementReceived, "DateWageStatementReceived");
			        return this;
           }
public IndemnityPage selectResolution(WebDriver driver,String Resolution)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpResolution,Resolution,"Resolution");
				    return this;
			}
public IndemnityPage clickCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseDateDateIcon,"CloseDateDateIcon");
				    return this;
			}
public IndemnityPage enterMaxStateCompRate_9(WebDriver driver,String MaxStateCompRate_9) {
		            BrowserActions.type(driver, inpMaxStateCompRate_9,MaxStateCompRate_9, "MaxStateCompRate_9");
			        return this;
           }
public IndemnityPage enterReturntoNormalDuty(WebDriver driver,String ReturntoNormalDuty) {
		            BrowserActions.type(driver, inpReturntoNormalDuty,ReturntoNormalDuty, "ReturntoNormalDuty");
			        return this;
           }
public IndemnityPage enterClassificationWeight(WebDriver driver,String ClassificationWeight) {
		            BrowserActions.type(driver, inpClassificationWeight,ClassificationWeight, "ClassificationWeight");
			        return this;
           }
public IndemnityPage clickCreateDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateDateDateIcon,"CreateDateDateIcon");
				    return this;
			}
public IndemnityPage clickReturntoNormalDutyDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoNormalDutyDateIcon,"ReturntoNormalDutyDateIcon");
				    return this;
			}
public IndemnityPage clickRemove_4(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_4,"Remove_4");
				    return this;
			}
public IndemnityPage clickRemove_48(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_48,"Remove_48");
				    return this;
			}
public IndemnityPage clickRemove_6(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_6,"Remove_6");
				    return this;
			}
public IndemnityPage enterEditReason(WebDriver driver,String EditReason) {
		            BrowserActions.type(driver, inpEditReason,EditReason, "EditReason");
			        return this;
           }
public IndemnityPage clickTPD(WebDriver driver)  {
					BrowserActions.click(driver, chkTPD,"TPD");
				    return this;
			}
public IndemnityPage enterRetroactivePeriod(WebDriver driver,String RetroactivePeriod) {
		            BrowserActions.type(driver, inpRetroactivePeriod,RetroactivePeriod, "RetroactivePeriod");
			        return this;
           }
public IndemnityPage clickAdd_15(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_15,"Add_15");
				    return this;
			}
public IndemnityPage enterReferenceData(WebDriver driver,String ReferenceData) {
		            BrowserActions.type(driver, inpReferenceData,ReferenceData, "ReferenceData");
			        return this;
           }
public IndemnityPage enterWeeklyCompRate_30(WebDriver driver,String WeeklyCompRate_30) {
		            BrowserActions.type(driver, inpWeeklyCompRate_30,WeeklyCompRate_30, "WeeklyCompRate_30");
			        return this;
           }
public IndemnityPage clickTTD_43(WebDriver driver)  {
					BrowserActions.click(driver, chkTTD_43,"TTD_43");
				    return this;
			}
public IndemnityPage clickStatLine_PickerButton(WebDriver driver)  {
					BrowserActions.click(driver, btnStatLine_PickerButton,"StatLine_PickerButton");
				    return this;
			}
public IndemnityPage selectValidationLevel(WebDriver driver,String ValidationLevel)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpValidationLevel,ValidationLevel,"ValidationLevel");
				    return this;
			}
public IndemnityPage clickReturntoModifiedDutyDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoModifiedDutyDateIcon,"ReturntoModifiedDutyDateIcon");
				    return this;
			}
public IndemnityPage clickPPD_38(WebDriver driver)  {
					BrowserActions.click(driver, chkPPD_38,"PPD_38");
				    return this;
			}
public IndemnityPage clickReturnToWorkActual(WebDriver driver)  {
					BrowserActions.click(driver, rdbReturnToWorkActual,"ReturnToWorkActual");
				    return this;
			}
public IndemnityPage enterOfWages(WebDriver driver,String OfWages) {
		            BrowserActions.type(driver, inpOfWages,OfWages, "OfWages");
			        return this;
           }
public IndemnityPage enterStatLine_Warning(WebDriver driver,String StatLine_Warning) {
		            BrowserActions.type(driver, inpStatLine_Warning,StatLine_Warning, "StatLine_Warning");
			        return this;
           }
public IndemnityPage clickWCDoesnotApplytoPTD(WebDriver driver)  {
					BrowserActions.click(driver, chkWCDoesnotApplytoPTD,"WCDoesnotApplytoPTD");
				    return this;
			}
public IndemnityPage clickCreateReserve(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateReserve,"CreateReserve");
				    return this;
			}
public IndemnityPage enterWeeklyCompRate_23(WebDriver driver,String WeeklyCompRate_23) {
		            BrowserActions.type(driver, inpWeeklyCompRate_23,WeeklyCompRate_23, "WeeklyCompRate_23");
			        return this;
           }
public IndemnityPage enterWeeklyCompRate_22(WebDriver driver,String WeeklyCompRate_22) {
		            BrowserActions.type(driver, inpWeeklyCompRate_22,WeeklyCompRate_22, "WeeklyCompRate_22");
			        return this;
           }
public IndemnityPage enterWeeklyCompRate_29(WebDriver driver,String WeeklyCompRate_29) {
		            BrowserActions.type(driver, inpWeeklyCompRate_29,WeeklyCompRate_29, "WeeklyCompRate_29");
			        return this;
           }
public IndemnityPage clickWaived(WebDriver driver)  {
					BrowserActions.click(driver, rdbWaived,"Waived");
				    return this;
			}
public IndemnityPage enterSupplementalWeight(WebDriver driver,String SupplementalWeight) {
		            BrowserActions.type(driver, inpSupplementalWeight,SupplementalWeight, "SupplementalWeight");
			        return this;
           }
public IndemnityPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public IndemnityPage clickDateWageStatementSentDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateWageStatementSentDateIcon,"DateWageStatementSentDateIcon");
				    return this;
			}
public IndemnityPage enterAdjuster(WebDriver driver,String Adjuster) {
		            BrowserActions.type(driver, inpAdjuster,Adjuster, "Adjuster");
			        return this;
           }
public IndemnityPage enterTotalWeight(WebDriver driver,String TotalWeight) {
		            BrowserActions.type(driver, inpTotalWeight,TotalWeight, "TotalWeight");
			        return this;
           }
public IndemnityPage enterOfWages_8(WebDriver driver,String OfWages_8) {
		            BrowserActions.type(driver, inpOfWages_8,OfWages_8, "OfWages_8");
			        return this;
           }
public IndemnityPage selectHandlingStrategy(WebDriver driver,String HandlingStrategy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHandlingStrategy,HandlingStrategy,"HandlingStrategy");
				    return this;
			}
public IndemnityPage clickPTD(WebDriver driver)  {
					BrowserActions.click(driver, chkPTD,"PTD");
				    return this;
			}
public IndemnityPage enterMinimumAdjustment_11(WebDriver driver,String MinimumAdjustment_11) {
		            BrowserActions.type(driver, inpMinimumAdjustment_11,MinimumAdjustment_11, "MinimumAdjustment_11");
			        return this;
           }
public IndemnityPage selectCategory_39(WebDriver driver,String Category_39)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_39,Category_39,"Category_39");
				    return this;
			}
public IndemnityPage enterWeeklyCompRate_14(WebDriver driver,String WeeklyCompRate_14) {
		            BrowserActions.type(driver, inpWeeklyCompRate_14,WeeklyCompRate_14, "WeeklyCompRate_14");
			        return this;
           }
public IndemnityPage selectCreatedVia(WebDriver driver,String CreatedVia)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCreatedVia,CreatedVia,"CreatedVia");
				    return this;
			}
public IndemnityPage enterWeeklyCompRate_13(WebDriver driver,String WeeklyCompRate_13) {
		            BrowserActions.type(driver, inpWeeklyCompRate_13,WeeklyCompRate_13, "WeeklyCompRate_13");
			        return this;
           }
public IndemnityPage enterOfWages_17(WebDriver driver,String OfWages_17) {
		            BrowserActions.type(driver, inpOfWages_17,OfWages_17, "OfWages_17");
			        return this;
           }
public IndemnityPage clickTTD(WebDriver driver)  {
					BrowserActions.click(driver, chkTTD,"TTD");
				    return this;
			}
public IndemnityPage enterWeeklyCompRate(WebDriver driver,String WeeklyCompRate) {
		            BrowserActions.type(driver, inpWeeklyCompRate,WeeklyCompRate, "WeeklyCompRate");
			        return this;
           }
public IndemnityPage enterWaitingPeriodDays(WebDriver driver,String WaitingPeriodDays) {
		            BrowserActions.type(driver, inpWaitingPeriodDays,WaitingPeriodDays, "WaitingPeriodDays");
			        return this;
           }
public IndemnityPage enterCreateDate(WebDriver driver,String CreateDate) {
		            BrowserActions.type(driver, inpCreateDate,CreateDate, "CreateDate");
			        return this;
           }
public IndemnityPage enterReferenceData_28(WebDriver driver,String ReferenceData_28) {
		            BrowserActions.type(driver, inpReferenceData_28,ReferenceData_28, "ReferenceData_28");
			        return this;
           }
public IndemnityPage clickWaitingPeriodApplied(WebDriver driver)  {
					BrowserActions.click(driver, rdbWaitingPeriodApplied,"WaitingPeriodApplied");
				    return this;
			}
public IndemnityPage enterReferenceData_21(WebDriver driver,String ReferenceData_21) {
		            BrowserActions.type(driver, inpReferenceData_21,ReferenceData_21, "ReferenceData_21");
			        return this;
           }
public IndemnityPage enterReturntoModifiedDuty(WebDriver driver,String ReturntoModifiedDuty) {
		            BrowserActions.type(driver, inpReturntoModifiedDuty,ReturntoModifiedDuty, "ReturntoModifiedDuty");
			        return this;
           }
public IndemnityPage enterUnits_41(WebDriver driver,String Units_41) {
		            BrowserActions.type(driver, inpUnits_41,Units_41, "Units_41");
			        return this;
           }
public IndemnityPage clickReopenDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenDateDateIcon,"ReopenDateDateIcon");
				    return this;
			}
public IndemnityPage clickAdd_47(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_47,"Add_47");
				    return this;
			}
public IndemnityPage enterMaxStateCompRate(WebDriver driver,String MaxStateCompRate) {
		            BrowserActions.type(driver, inpMaxStateCompRate,MaxStateCompRate, "MaxStateCompRate");
			        return this;
           }
public IndemnityPage enterMinimumAdjustment_20(WebDriver driver,String MinimumAdjustment_20) {
		            BrowserActions.type(driver, inpMinimumAdjustment_20,MinimumAdjustment_20, "MinimumAdjustment_20");
			        return this;
           }
public IndemnityPage enterPPDMaximumbenefit(WebDriver driver,String PPDMaximumbenefit) {
		            BrowserActions.type(driver, inpPPDMaximumbenefit,PPDMaximumbenefit, "PPDMaximumbenefit");
			        return this;
           }
public IndemnityPage clickTTD_35(WebDriver driver)  {
					BrowserActions.click(driver, chkTTD_35,"TTD_35");
				    return this;
			}
public IndemnityPage enterOfWages_24(WebDriver driver,String OfWages_24) {
		            BrowserActions.type(driver, inpOfWages_24,OfWages_24, "OfWages_24");
			        return this;
           }
public IndemnityPage clickWCDoesnotApplytoPPD(WebDriver driver)  {
					BrowserActions.click(driver, chkWCDoesnotApplytoPPD,"WCDoesnotApplytoPPD");
				    return this;
			}
public IndemnityPage clickBenefits(WebDriver driver)  {
					BrowserActions.click(driver, btnBenefits,"Benefits");
				    return this;
			}
public IndemnityPage clickRefreshResponses(WebDriver driver)  {
					BrowserActions.click(driver, btnRefreshResponses,"RefreshResponses");
				    return this;
			}
public IndemnityPage selectDetailedFactor(WebDriver driver,String DetailedFactor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDetailedFactor,DetailedFactor,"DetailedFactor");
				    return this;
			}
public IndemnityPage clickPPD_46(WebDriver driver)  {
					BrowserActions.click(driver, chkPPD_46,"PPD_46");
				    return this;
			}
public IndemnityPage selectPrimaryCoverage(WebDriver driver,String PrimaryCoverage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryCoverage,PrimaryCoverage,"PrimaryCoverage");
				    return this;
			}
public IndemnityPage enterMinimumAdjustment_27(WebDriver driver,String MinimumAdjustment_27) {
		            BrowserActions.type(driver, inpMinimumAdjustment_27,MinimumAdjustment_27, "MinimumAdjustment_27");
			        return this;
           }
public IndemnityPage enterReferenceData_12(WebDriver driver,String ReferenceData_12) {
		            BrowserActions.type(driver, inpReferenceData_12,ReferenceData_12, "ReferenceData_12");
			        return this;
           }
public IndemnityPage selectSegment(WebDriver driver,String Segment)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSegment,Segment,"Segment");
				    return this;
			}
public IndemnityPage clickModified(WebDriver driver)  {
					BrowserActions.click(driver, rdbModified,"Modified");
				    return this;
			}
public IndemnityPage enterWeeklyCompRate_7(WebDriver driver,String WeeklyCompRate_7) {
		            BrowserActions.type(driver, inpWeeklyCompRate_7,WeeklyCompRate_7, "WeeklyCompRate_7");
			        return this;
           }
public IndemnityPage clickDateWageStatementReceivedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateWageStatementReceivedDateIcon,"DateWageStatementReceivedDateIcon");
				    return this;
			}
public IndemnityPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public IndemnityPage enterReturntoModifiedDuty_1(WebDriver driver,String ReturntoModifiedDuty_1) {
		            BrowserActions.type(driver, inpReturntoModifiedDuty_1,ReturntoModifiedDuty_1, "ReturntoModifiedDuty_1");
			        return this;
           }
public IndemnityPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public IndemnityPage clickSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnSummary,"Summary");
				    return this;
			}
public IndemnityPage enterPPDPercentage(WebDriver driver,String PPDPercentage) {
		            BrowserActions.type(driver, inpPPDPercentage,PPDPercentage, "PPDPercentage");
			        return this;
           }
public IndemnityPage enterGroup(WebDriver driver,String Group) {
		            BrowserActions.type(driver, inpGroup,Group, "Group");
			        return this;
           }
public IndemnityPage clickRemove_16(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_16,"Remove_16");
				    return this;
			}
public IndemnityPage enterMaxStateCompRate_25(WebDriver driver,String MaxStateCompRate_25) {
		            BrowserActions.type(driver, inpMaxStateCompRate_25,MaxStateCompRate_25, "MaxStateCompRate_25");
			        return this;
           }
public IndemnityPage enterMinStateCompRate_19(WebDriver driver,String MinStateCompRate_19) {
		            BrowserActions.type(driver, inpMinStateCompRate_19,MinStateCompRate_19, "MinStateCompRate_19");
			        return this;
           }
public IndemnityPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public IndemnityPage enterClassification(WebDriver driver,String Classification) {
		            BrowserActions.type(driver, inpClassification,Classification, "Classification");
			        return this;
           }
public IndemnityPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public IndemnityPage enterMinStateCompRate_10(WebDriver driver,String MinStateCompRate_10) {
		            BrowserActions.type(driver, inpMinStateCompRate_10,MinStateCompRate_10, "MinStateCompRate_10");
			        return this;
           }
public IndemnityPage selectDetailedFactor_40(WebDriver driver,String DetailedFactor_40)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDetailedFactor_40,DetailedFactor_40,"DetailedFactor_40");
				    return this;
			}
public IndemnityPage clickAdd_5(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_5,"Add_5");
				    return this;
			}
public IndemnityPage clickAdd_3(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_3,"Add_3");
				    return this;
			}
public IndemnityPage enterMinimumAdjustment(WebDriver driver,String MinimumAdjustment) {
		            BrowserActions.type(driver, inpMinimumAdjustment,MinimumAdjustment, "MinimumAdjustment");
			        return this;
           }
public IndemnityPage clickPTD_45(WebDriver driver)  {
					BrowserActions.click(driver, chkPTD_45,"PTD_45");
				    return this;
			}
public IndemnityPage clickTPD_36(WebDriver driver)  {
					BrowserActions.click(driver, chkTPD_36,"TPD_36");
				    return this;
			}
public IndemnityPage enterCloseDate(WebDriver driver,String CloseDate) {
		            BrowserActions.type(driver, inpCloseDate,CloseDate, "CloseDate");
			        return this;
           }
public IndemnityPage enterReturntoNormalDuty_2(WebDriver driver,String ReturntoNormalDuty_2) {
		            BrowserActions.type(driver, inpReturntoNormalDuty_2,ReturntoNormalDuty_2, "ReturntoNormalDuty_2");
			        return this;
           }
public IndemnityPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public IndemnityPage clickRTWApplicable(WebDriver driver)  {
					BrowserActions.click(driver, rdbRTWApplicable,"RTWApplicable");
				    return this;
			}
public IndemnityPage enterMaxStateCompRate_18(WebDriver driver,String MaxStateCompRate_18) {
		            BrowserActions.type(driver, inpMaxStateCompRate_18,MaxStateCompRate_18, "MaxStateCompRate_18");
			        return this;
           }
public IndemnityPage enterMinStateCompRate_26(WebDriver driver,String MinStateCompRate_26) {
		            BrowserActions.type(driver, inpMinStateCompRate_26,MinStateCompRate_26, "MinStateCompRate_26");
			        return this;
           }
public IndemnityPage clickReturnToModWorkActual(WebDriver driver)  {
					BrowserActions.click(driver, rdbReturnToModWorkActual,"ReturnToModWorkActual");
				    return this;
			}
public IndemnityPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public IndemnityPage enterDateWageStatementSent(WebDriver driver,String DateWageStatementSent) {
		            BrowserActions.type(driver, inpDateWageStatementSent,DateWageStatementSent, "DateWageStatementSent");
			        return this;
           }
public IndemnityPage clickModifiedDutyApplicable(WebDriver driver)  {
					BrowserActions.click(driver, rdbModifiedDutyApplicable,"ModifiedDutyApplicable");
				    return this;
			}
public IndemnityPage clickTPD_44(WebDriver driver)  {
					BrowserActions.click(driver, chkTPD_44,"TPD_44");
				    return this;
			}
public IndemnityPage enterUnits_33(WebDriver driver,String Units_33) {
		            BrowserActions.type(driver, inpUnits_33,Units_33, "Units_33");
			        return this;
           }
public IndemnityPage clickSendToISO(WebDriver driver)  {
					BrowserActions.click(driver, btnSendToISO,"SendToISO");
				    return this;
			}
public IndemnityPage enterPDNumberofWeeks(WebDriver driver,String PDNumberofWeeks) {
		            BrowserActions.type(driver, inpPDNumberofWeeks,PDNumberofWeeks, "PDNumberofWeeks");
			        return this;
           }
public IndemnityPage selectCategory_31(WebDriver driver,String Category_31)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_31,Category_31,"Category_31");
				    return this;
			}
public IndemnityPage verifyExposureCreated(WebDriver driver, String name)  {//Workers' Comp - med only
	String exposureName = BrowserActions.getText(driver, lblsegment,"Exposure type");
	Log.assertThat(exposureName.contains(name),"Exposure is created by "+name, name);
	return this;
}
public IndemnityPage clickIndemnity(WebDriver driver)  {
	BrowserActions.click(driver, btnIndemnity,1,"Indemnity");
	return this;
}
}
