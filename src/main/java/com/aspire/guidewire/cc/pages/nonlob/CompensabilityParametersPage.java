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

public class CompensabilityParametersPage extends LoadableComponent<CompensabilityParametersPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_23;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_113;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_108;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_125;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_31;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_65;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_56;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_9;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-EffectiveDate']", AI = false)
	private WebElement inpEffective_112;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-ExpiryDate']", AI = false)
	private WebElement inpExpiry_74;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_88;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_47;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_40;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-ExpiryDate']", AI = false)
	private WebElement inpExpiry_114;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_29;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-EffectiveDate']", AI = false)
	private WebElement inpEffective_92;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_33;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_103;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-ExpiryDate']", AI = false)
	private WebElement inpExpiry_54;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_41;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_130;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_7;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_66;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_99;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-ExpiryDate']", AI = false)
	private WebElement inpExpiry_4;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-EffectiveDate']", AI = false)
	private WebElement inpEffective_122;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-ExpiryDate']", AI = false)
	private WebElement inpExpiry_64;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_57;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_98;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_129;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_19;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-ExpiryDate']", AI = false)
	private WebElement inpExpiry_124;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_75;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-EffectiveDate']", AI = false)
	private WebElement inpEffective_82;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_30;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-EffectiveDate']", AI = false)
	private WebElement inpEffective_22;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_128;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_18;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_43;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_91;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_3;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_120;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_11;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_36;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_49;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-EffectiveDate']", AI = false)
	private WebElement inpEffective_2;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_8;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_60;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-ExpiryDate']", AI = false)
	private WebElement inpExpiry_94;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_27;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_85;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_28;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_118;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_53;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-EffectiveDate']", AI = false)
	private WebElement inpEffective_12;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_21;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-EffectiveDate']", AI = false)
	private WebElement inpEffective_102;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_101;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_110;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_46;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_15;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-CustomAdd>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_1;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_6;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-ExpiryDate']", AI = false)
	private WebElement inpExpiry_84;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-ExpiryDate']", AI = false)
	private WebElement inpExpiry_104;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_37;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_95;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_50;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_39;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_38;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-EffectiveDate']", AI = false)
	private WebElement inpEffective_42;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_100;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_117;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-ExpiryDate']", AI = false)
	private WebElement inpExpiry_24;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_63;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_71;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_87;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_111;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_126;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_69;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_25;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_96;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_80;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_16;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_48;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-EffectiveDate']", AI = false)
	private WebElement inpEffective_32;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-ExpiryDate']", AI = false)
	private WebElement inpExpiry_14;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_127;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_73;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_81;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_97;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_121;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_116;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_5;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-3-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_26;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_59;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_35;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_70;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_17;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_58;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_105;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-ExpiryDate']", AI = false)
	private WebElement inpExpiry_44;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_83;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_106;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_51;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-5-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_45;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_76;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_89;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-EffectiveDate']", AI = false)
	private WebElement inpEffective;

	@IFindBy(how = How.CSS, using = "div[id$='Remove']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_67;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_68;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-EffectiveDate']", AI = false)
	private WebElement inpEffective_72;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_119;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_20;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-2-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_13;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-13-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_123;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-12-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_115;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-EffectiveDate']", AI = false)
	private WebElement inpEffective_52;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-ExpiryDate']", AI = false)
	private WebElement inpExpiry;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_61;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-4-ExpiryDate']", AI = false)
	private WebElement inpExpiry_34;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-10-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon_93;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-0-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_107;

	@IFindBy(how = How.CSS, using = "#DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-6-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpiryDateIcon_55;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-1-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_10;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-11-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_109;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-TargetIncludeDays']", AI = false)
	private WebElement drpIncludeDays_79;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula_86;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-TargetDaysFromLoss']", AI = false)
	private WebElement inpDaysFromLoss_77;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-9-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance_90;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-7-EffectiveDate']", AI = false)
	private WebElement inpEffective_62;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriods-DenialPeriodsScreen-DenialPeriodsLV-8-TargetDaysFromNotice']", AI = false)
	private WebElement inpDaysfromNotice_78;

	@IFindBy(how = How.CSS, using = "td[id$='JurisdictionState_Cell']", AI = false)
	private WebElement lnkJurisdictionState;

	@IFindBy(how = How.ID, using = "DenialPeriodPopup-__crumb__", AI = false)
	private WebElement btnReturnToCompensabilityParameters;

	@IFindBy(how = How.CSS, using = "div[id$='DenialPeriodsScreen-0']", AI = false)
	private WebElement lblCompensabilityParametersTitle;

	public CompensabilityParametersPage(){
	}

	public CompensabilityParametersPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpDaysfromNotice_78))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public CompensabilityParametersPage clickEffectiveDateIcon_23(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_23,"EffectiveDateIcon_23");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_113(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_113,"EffectiveDateIcon_113");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_108(WebDriver driver,String DaysfromNotice_108) {
		BrowserActions.type(driver, inpDaysfromNotice_108,DaysfromNotice_108, "DaysfromNotice_108");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_125(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_125,"ExpiryDateIcon_125");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_31(WebDriver driver,String Jurisdiction_31)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_31,Jurisdiction_31,"Jurisdiction_31");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_65(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_65,"ExpiryDateIcon_65");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_56(WebDriver driver,String DenialPeriodFormula_56)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_56,DenialPeriodFormula_56,"DenialPeriodFormula_56");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_9(WebDriver driver,String IncludeDays_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_9,IncludeDays_9,"IncludeDays_9");
		return this;
	}
	public CompensabilityParametersPage enterEffective_112(WebDriver driver,String Effective_112) {
		BrowserActions.type(driver, inpEffective_112,Effective_112, "Effective_112");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_74(WebDriver driver,String Expiry_74) {
		BrowserActions.type(driver, inpExpiry_74,Expiry_74, "Expiry_74");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_88(WebDriver driver,String DaysfromNotice_88) {
		BrowserActions.type(driver, inpDaysfromNotice_88,DaysfromNotice_88, "DaysfromNotice_88");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_47(WebDriver driver,String DaysFromLoss_47) {
		BrowserActions.type(driver, inpDaysFromLoss_47,DaysFromLoss_47, "DaysFromLoss_47");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_40(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_40,"BenefitPaymentAcceptance_40");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_114(WebDriver driver,String Expiry_114) {
		BrowserActions.type(driver, inpExpiry_114,Expiry_114, "Expiry_114");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_29(WebDriver driver,String IncludeDays_29)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_29,IncludeDays_29,"IncludeDays_29");
		return this;
	}
	public CompensabilityParametersPage enterEffective_92(WebDriver driver,String Effective_92) {
		BrowserActions.type(driver, inpEffective_92,Effective_92, "Effective_92");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance,"BenefitPaymentAcceptance");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_33(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_33,"EffectiveDateIcon_33");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_103(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_103,"EffectiveDateIcon_103");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_54(WebDriver driver,String Expiry_54) {
		BrowserActions.type(driver, inpExpiry_54,Expiry_54, "Expiry_54");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_41(WebDriver driver,String Jurisdiction_41)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_41,Jurisdiction_41,"Jurisdiction_41");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_130(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_130,"BenefitPaymentAcceptance_130");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_7(WebDriver driver,String DaysFromLoss_7) {
		BrowserActions.type(driver, inpDaysFromLoss_7,DaysFromLoss_7, "DaysFromLoss_7");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_66(WebDriver driver,String DenialPeriodFormula_66)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_66,DenialPeriodFormula_66,"DenialPeriodFormula_66");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_99(WebDriver driver,String IncludeDays_99)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_99,IncludeDays_99,"IncludeDays_99");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_4(WebDriver driver,String Expiry_4) {
		BrowserActions.type(driver, inpExpiry_4,Expiry_4, "Expiry_4");
		return this;
	}
	public CompensabilityParametersPage enterEffective_122(WebDriver driver,String Effective_122) {
		BrowserActions.type(driver, inpEffective_122,Effective_122, "Effective_122");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_64(WebDriver driver,String Expiry_64) {
		BrowserActions.type(driver, inpExpiry_64,Expiry_64, "Expiry_64");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_57(WebDriver driver,String DaysFromLoss_57) {
		BrowserActions.type(driver, inpDaysFromLoss_57,DaysFromLoss_57, "DaysFromLoss_57");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_98(WebDriver driver,String DaysfromNotice_98) {
		BrowserActions.type(driver, inpDaysfromNotice_98,DaysfromNotice_98, "DaysfromNotice_98");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_129(WebDriver driver,String IncludeDays_129)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_129,IncludeDays_129,"IncludeDays_129");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_19(WebDriver driver,String IncludeDays_19)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_19,IncludeDays_19,"IncludeDays_19");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_124(WebDriver driver,String Expiry_124) {
		BrowserActions.type(driver, inpExpiry_124,Expiry_124, "Expiry_124");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_75(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_75,"ExpiryDateIcon_75");
		return this;
	}
	public CompensabilityParametersPage enterEffective_82(WebDriver driver,String Effective_82) {
		BrowserActions.type(driver, inpEffective_82,Effective_82, "Effective_82");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon,"EffectiveDateIcon");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_30(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_30,"BenefitPaymentAcceptance_30");
		return this;
	}
	public CompensabilityParametersPage enterEffective_22(WebDriver driver,String Effective_22) {
		BrowserActions.type(driver, inpEffective_22,Effective_22, "Effective_22");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_128(WebDriver driver,String DaysfromNotice_128) {
		BrowserActions.type(driver, inpDaysfromNotice_128,DaysfromNotice_128, "DaysfromNotice_128");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_18(WebDriver driver,String DaysfromNotice_18) {
		BrowserActions.type(driver, inpDaysfromNotice_18,DaysfromNotice_18, "DaysfromNotice_18");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_43(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_43,"EffectiveDateIcon_43");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_91(WebDriver driver,String Jurisdiction_91)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_91,Jurisdiction_91,"Jurisdiction_91");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_3(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_3,"EffectiveDateIcon_3");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_120(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_120,"BenefitPaymentAcceptance_120");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_11(WebDriver driver,String Jurisdiction_11)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_11,Jurisdiction_11,"Jurisdiction_11");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_36(WebDriver driver,String DenialPeriodFormula_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_36,DenialPeriodFormula_36,"DenialPeriodFormula_36");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_49(WebDriver driver,String IncludeDays_49)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_49,IncludeDays_49,"IncludeDays_49");
		return this;
	}
	public CompensabilityParametersPage enterEffective_2(WebDriver driver,String Effective_2) {
		BrowserActions.type(driver, inpEffective_2,Effective_2, "Effective_2");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_8(WebDriver driver,String DaysfromNotice_8) {
		BrowserActions.type(driver, inpDaysfromNotice_8,DaysfromNotice_8, "DaysfromNotice_8");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_60(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_60,"BenefitPaymentAcceptance_60");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_94(WebDriver driver,String Expiry_94) {
		BrowserActions.type(driver, inpExpiry_94,Expiry_94, "Expiry_94");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_27(WebDriver driver,String DaysFromLoss_27) {
		BrowserActions.type(driver, inpDaysFromLoss_27,DaysFromLoss_27, "DaysFromLoss_27");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_85(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_85,"ExpiryDateIcon_85");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_28(WebDriver driver,String DaysfromNotice_28) {
		BrowserActions.type(driver, inpDaysfromNotice_28,DaysfromNotice_28, "DaysfromNotice_28");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_118(WebDriver driver,String DaysfromNotice_118) {
		BrowserActions.type(driver, inpDaysfromNotice_118,DaysfromNotice_118, "DaysfromNotice_118");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays(WebDriver driver,String IncludeDays)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays,IncludeDays,"IncludeDays");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_53(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_53,"EffectiveDateIcon_53");
		return this;
	}
	public CompensabilityParametersPage enterEffective_12(WebDriver driver,String Effective_12) {
		BrowserActions.type(driver, inpEffective_12,Effective_12, "Effective_12");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_21(WebDriver driver,String Jurisdiction_21)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_21,Jurisdiction_21,"Jurisdiction_21");
		return this;
	}
	public CompensabilityParametersPage enterEffective_102(WebDriver driver,String Effective_102) {
		BrowserActions.type(driver, inpEffective_102,Effective_102, "Effective_102");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_101(WebDriver driver,String Jurisdiction_101)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_101,Jurisdiction_101,"Jurisdiction_101");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_110(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_110,"BenefitPaymentAcceptance_110");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_46(WebDriver driver,String DenialPeriodFormula_46)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_46,DenialPeriodFormula_46,"DenialPeriodFormula_46");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_15(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_15,"ExpiryDateIcon_15");
		return this;
	}
	public CompensabilityParametersPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_1(WebDriver driver,String Jurisdiction_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_1,Jurisdiction_1,"Jurisdiction_1");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_6(WebDriver driver,String DenialPeriodFormula_6)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_6,DenialPeriodFormula_6,"DenialPeriodFormula_6");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_84(WebDriver driver,String Expiry_84) {
		BrowserActions.type(driver, inpExpiry_84,Expiry_84, "Expiry_84");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_104(WebDriver driver,String Expiry_104) {
		BrowserActions.type(driver, inpExpiry_104,Expiry_104, "Expiry_104");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_37(WebDriver driver,String DaysFromLoss_37) {
		BrowserActions.type(driver, inpDaysFromLoss_37,DaysFromLoss_37, "DaysFromLoss_37");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_95(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_95,"ExpiryDateIcon_95");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_50(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_50,"BenefitPaymentAcceptance_50");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss(WebDriver driver,String DaysFromLoss) {
		BrowserActions.type(driver, inpDaysFromLoss,DaysFromLoss, "DaysFromLoss");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_39(WebDriver driver,String IncludeDays_39)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_39,IncludeDays_39,"IncludeDays_39");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_38(WebDriver driver,String DaysfromNotice_38) {
		BrowserActions.type(driver, inpDaysfromNotice_38,DaysfromNotice_38, "DaysfromNotice_38");
		return this;
	}
	public CompensabilityParametersPage enterEffective_42(WebDriver driver,String Effective_42) {
		BrowserActions.type(driver, inpEffective_42,Effective_42, "Effective_42");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_100(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_100,"BenefitPaymentAcceptance_100");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_117(WebDriver driver,String DaysFromLoss_117) {
		BrowserActions.type(driver, inpDaysFromLoss_117,DaysFromLoss_117, "DaysFromLoss_117");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_24(WebDriver driver,String Expiry_24) {
		BrowserActions.type(driver, inpExpiry_24,Expiry_24, "Expiry_24");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_63(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_63,"EffectiveDateIcon_63");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_71(WebDriver driver,String Jurisdiction_71)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_71,Jurisdiction_71,"Jurisdiction_71");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_87(WebDriver driver,String DaysFromLoss_87) {
		BrowserActions.type(driver, inpDaysFromLoss_87,DaysFromLoss_87, "DaysFromLoss_87");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_111(WebDriver driver,String Jurisdiction_111)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_111,Jurisdiction_111,"Jurisdiction_111");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula(WebDriver driver,String DenialPeriodFormula)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula,DenialPeriodFormula,"DenialPeriodFormula");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_126(WebDriver driver,String DenialPeriodFormula_126)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_126,DenialPeriodFormula_126,"DenialPeriodFormula_126");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_69(WebDriver driver,String IncludeDays_69)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_69,IncludeDays_69,"IncludeDays_69");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_25(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_25,"ExpiryDateIcon_25");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_96(WebDriver driver,String DenialPeriodFormula_96)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_96,DenialPeriodFormula_96,"DenialPeriodFormula_96");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_80(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_80,"BenefitPaymentAcceptance_80");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_16(WebDriver driver,String DenialPeriodFormula_16)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_16,DenialPeriodFormula_16,"DenialPeriodFormula_16");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_48(WebDriver driver,String DaysfromNotice_48) {
		BrowserActions.type(driver, inpDaysfromNotice_48,DaysfromNotice_48, "DaysfromNotice_48");
		return this;
	}
	public CompensabilityParametersPage enterEffective_32(WebDriver driver,String Effective_32) {
		BrowserActions.type(driver, inpEffective_32,Effective_32, "Effective_32");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_14(WebDriver driver,String Expiry_14) {
		BrowserActions.type(driver, inpExpiry_14,Expiry_14, "Expiry_14");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_127(WebDriver driver,String DaysFromLoss_127) {
		BrowserActions.type(driver, inpDaysFromLoss_127,DaysFromLoss_127, "DaysFromLoss_127");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_73(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_73,"EffectiveDateIcon_73");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_81(WebDriver driver,String Jurisdiction_81)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_81,Jurisdiction_81,"Jurisdiction_81");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_97(WebDriver driver,String DaysFromLoss_97) {
		BrowserActions.type(driver, inpDaysFromLoss_97,DaysFromLoss_97, "DaysFromLoss_97");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_121(WebDriver driver,String Jurisdiction_121)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_121,Jurisdiction_121,"Jurisdiction_121");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_116(WebDriver driver,String DenialPeriodFormula_116)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_116,DenialPeriodFormula_116,"DenialPeriodFormula_116");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_5,"ExpiryDateIcon_5");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_26(WebDriver driver,String DenialPeriodFormula_26)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_26,DenialPeriodFormula_26,"DenialPeriodFormula_26");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_59(WebDriver driver,String IncludeDays_59)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_59,IncludeDays_59,"IncludeDays_59");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_35(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_35,"ExpiryDateIcon_35");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_70(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_70,"BenefitPaymentAcceptance_70");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_17(WebDriver driver,String DaysFromLoss_17) {
		BrowserActions.type(driver, inpDaysFromLoss_17,DaysFromLoss_17, "DaysFromLoss_17");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_58(WebDriver driver,String DaysfromNotice_58) {
		BrowserActions.type(driver, inpDaysfromNotice_58,DaysfromNotice_58, "DaysfromNotice_58");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_105(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_105,"ExpiryDateIcon_105");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_44(WebDriver driver,String Expiry_44) {
		BrowserActions.type(driver, inpExpiry_44,Expiry_44, "Expiry_44");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_83(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_83,"EffectiveDateIcon_83");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon,"ExpiryDateIcon");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_106(WebDriver driver,String DenialPeriodFormula_106)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_106,DenialPeriodFormula_106,"DenialPeriodFormula_106");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_51(WebDriver driver,String Jurisdiction_51)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_51,Jurisdiction_51,"Jurisdiction_51");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_45(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_45,"ExpiryDateIcon_45");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_76(WebDriver driver,String DenialPeriodFormula_76)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_76,DenialPeriodFormula_76,"DenialPeriodFormula_76");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_89(WebDriver driver,String IncludeDays_89)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_89,IncludeDays_89,"IncludeDays_89");
		return this;
	}
	public CompensabilityParametersPage enterEffective(WebDriver driver,String Effective) {
		BrowserActions.type(driver, inpEffective,Effective, "Effective");
		return this;
	}
	public CompensabilityParametersPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_67(WebDriver driver,String DaysFromLoss_67) {
		BrowserActions.type(driver, inpDaysFromLoss_67,DaysFromLoss_67, "DaysFromLoss_67");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_68(WebDriver driver,String DaysfromNotice_68) {
		BrowserActions.type(driver, inpDaysfromNotice_68,DaysfromNotice_68, "DaysfromNotice_68");
		return this;
	}
	public CompensabilityParametersPage enterEffective_72(WebDriver driver,String Effective_72) {
		BrowserActions.type(driver, inpEffective_72,Effective_72, "Effective_72");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_119(WebDriver driver,String IncludeDays_119)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_119,IncludeDays_119,"IncludeDays_119");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_20(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_20,"BenefitPaymentAcceptance_20");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_13(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_13,"EffectiveDateIcon_13");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_123(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_123,"EffectiveDateIcon_123");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_115(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_115,"ExpiryDateIcon_115");
		return this;
	}
	public CompensabilityParametersPage enterEffective_52(WebDriver driver,String Effective_52) {
		BrowserActions.type(driver, inpEffective_52,Effective_52, "Effective_52");
		return this;
	}
	public CompensabilityParametersPage enterExpiry(WebDriver driver,String Expiry) {
		BrowserActions.type(driver, inpExpiry,Expiry, "Expiry");
		return this;
	}
	public CompensabilityParametersPage selectJurisdiction_61(WebDriver driver,String Jurisdiction_61)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_61,Jurisdiction_61,"Jurisdiction_61");
		return this;
	}
	public CompensabilityParametersPage enterExpiry_34(WebDriver driver,String Expiry_34) {
		BrowserActions.type(driver, inpExpiry_34,Expiry_34, "Expiry_34");
		return this;
	}
	public CompensabilityParametersPage clickEffectiveDateIcon_93(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_93,"EffectiveDateIcon_93");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice(WebDriver driver,String DaysfromNotice) {
		BrowserActions.type(driver, inpDaysfromNotice,DaysfromNotice, "DaysfromNotice");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_107(WebDriver driver,String DaysFromLoss_107) {
		BrowserActions.type(driver, inpDaysFromLoss_107,DaysFromLoss_107, "DaysFromLoss_107");
		return this;
	}
	public CompensabilityParametersPage clickExpiryDateIcon_55(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiryDateIcon_55,"ExpiryDateIcon_55");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_10(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_10,"BenefitPaymentAcceptance_10");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_109(WebDriver driver,String IncludeDays_109)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_109,IncludeDays_109,"IncludeDays_109");
		return this;
	}
	public CompensabilityParametersPage selectIncludeDays_79(WebDriver driver,String IncludeDays_79)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIncludeDays_79,IncludeDays_79,"IncludeDays_79");
		return this;
	}
	public CompensabilityParametersPage selectDenialPeriodFormula_86(WebDriver driver,String DenialPeriodFormula_86)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula_86,DenialPeriodFormula_86,"DenialPeriodFormula_86");
		return this;
	}
	public CompensabilityParametersPage enterDaysFromLoss_77(WebDriver driver,String DaysFromLoss_77) {
		BrowserActions.type(driver, inpDaysFromLoss_77,DaysFromLoss_77, "DaysFromLoss_77");
		return this;
	}
	public CompensabilityParametersPage clickBenefitPaymentAcceptance_90(WebDriver driver)  {
		BrowserActions.click(driver, rdbBenefitPaymentAcceptance_90,"BenefitPaymentAcceptance_90");
		return this;
	}
	public CompensabilityParametersPage enterEffective_62(WebDriver driver,String Effective_62) {
		BrowserActions.type(driver, inpEffective_62,Effective_62, "Effective_62");
		return this;
	}
	public CompensabilityParametersPage enterDaysfromNotice_78(WebDriver driver,String DaysfromNotice_78) {
		BrowserActions.type(driver, inpDaysfromNotice_78,DaysfromNotice_78, "DaysfromNotice_78");
		return this;
	}
	public CompensabilityParametersPage clickJurisdictionNameLink(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver, lnkJurisdictionState);
		By jurisdictionlinkBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, jurisdictionlinkBy, "Jusrisdication");
		WebElement jurisdictionlink = jurisdictionlinkBy.findElement(driver);
		BrowserActions.click(driver, jurisdictionlink, "Jurisdiction link");
		return this;
	}

	public CompensabilityParametersPage clickReturnToCompensabilityParameters(WebDriver driver)  {
		BrowserActions.click(driver, btnReturnToCompensabilityParameters,"Return To Compensability Parameters");
		BrowserActions.confirmAlert(driver, " Are you sure you want to go there?");
		return this;
	}

	public void verifyCompensabilityParametersMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblCompensabilityParametersTitle,"Compensability ParametersMain Page Title");
	}

	public void verifyCompensabilityParameterIsUpdated(WebDriver driver,String beforeUpdate)  {
		BrowserActions.waitForElementToDisplay(driver, lnkJurisdictionState);
		By jurisdictionlinkBy = By.xpath("//div[text()='"+beforeUpdate+"']");
		BrowserActions.waitForElementToDisplay(driver, jurisdictionlinkBy,"jurisdiction");
		WebElement jurisdictionlink = jurisdictionlinkBy.findElement(driver);
		if(!jurisdictionlink.getText().equals(beforeUpdate)) {
			Log.message("Jurisdiction is "+beforeUpdate+" Updated as"+jurisdictionlink);
		}else {
			Log.message("No update in jurisdiction");
		}
	}

	public CompensabilityParametersPage clickJurisdictionDataCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,lnkJurisdictionState);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy, "name check box");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,1,"Jurisdiction check box");
		return this;
	}

	public boolean verifyJurisdictionNameIsDisplayed(WebDriver driver,String name)  {
		boolean isJurisdictionFound = false;
		By elementsBy = By.cssSelector("td[id$='JurisdictionState_Cell']");
		List<WebElement> elements = BrowserActions.getWebElements(driver, elementsBy, "name", 0.5);
		for (WebElement element : elements) {
			if (element.getText().equals(name)) {
				isJurisdictionFound = true;
				break;
			}
		}
		Log.message(name +" jurisdiction found");
		return isJurisdictionFound;
	}

	public void verifyJurisdictionNameIsNotDisplayed(WebDriver driver,String name)  {
		boolean isJurisdictionFound = false;
		BrowserActions.waitForElementToDisplay(driver,lnkJurisdictionState);
		By nameBy=By.xpath("//div[text()='"+name+"']");
		int size = BrowserActions.getWebElementSize(driver, nameBy, "name", 0.5);
		if(size == 0) {
			isJurisdictionFound = true;
		}
		Log.softAssertThat(isJurisdictionFound, "Jurisdiction("+name+") is not found", "User("+name+") Jurisdiction present in list");
	}

	

}
