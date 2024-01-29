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

public class PPDWeeksPage extends LoadableComponent<PPDWeeksPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-9-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_63;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-12-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_80;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-11-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_76;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-5-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_32;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-0-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-6-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_36;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-6-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_39;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-1-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_4;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-5-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_29;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-11-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_75;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-7-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_44;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-11-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_73;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-11-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_77;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-10-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_69;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-9-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_62;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-14-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_94;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-7-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_43;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-7-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_46;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-10-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_70;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-10-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_68;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-6-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_37;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-8-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_53;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-5-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_30;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-9-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_61;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-13-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_87;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-2-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_13;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-14-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_92;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-14-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_97;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-12-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_84;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-13-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_90;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-9-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_60;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-3-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_17;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-4-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_23;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-8-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_54;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-2-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_10;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-14-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_98;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-2-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_14;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-13-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_91;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-12-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_83;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-10-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_67;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-4-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_22;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-3-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_16;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-7-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_47;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-3-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_15;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-1-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_1;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-11-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_74;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-0-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-2-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_9;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-14-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_93;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-6-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_40;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-2-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_8;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-1-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_2;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-1-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_3;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-4-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_24;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-5-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_34;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-3-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_21;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-0-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-11-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_71;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-12-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_78;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-6-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_38;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-1-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_6;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-12-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_81;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-13-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_86;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-5-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_33;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-1-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_5;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-4-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_28;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-5-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_31;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-5-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_35;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-3-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_20;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-13-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_88;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-13-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_85;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-12-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_79;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-4-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_26;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-14-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_95;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-11-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_72;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-4-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_27;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-7-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_45;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-3-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_18;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-8-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_55;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-6-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_42;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-8-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_50;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-2-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_11;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-9-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_57;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-3-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_19;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-2-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_12;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-9-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_59;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-10-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_65;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-14-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_96;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-8-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_52;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-7-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_49;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-1-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_7;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-6-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_41;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-8-PD_NumWeeks']", AI = false)
	private WebElement inpNumberofWeeks_56;

	@IFindBy(how = How.CSS, using = "select[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-10-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_64;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-4-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_25;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-9-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_58;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-13-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_89;

	@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-12-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_82;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-8-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_51;

	@IFindBy(how = How.CSS, using = "input[name='WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-7-DisabilityPercent']", AI = false)
	private WebElement inpPPDPercentage_48;

	@IFindBy(how = How.CSS, using = "#WCPDWeeksAndLimits-ref_WC_PD_WeeksAndLimitsScreen-WCPDWeeksAndLimitsLV-10-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_66;
	
	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'PD_BenefitEndDate')]", AI = false)
	private WebElement inpEndDate;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'PD_BenefitStartDate')]", AI = false)
	private WebElement inpStartDate;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'Checkbox')]", AI = false)
	private WebElement chkWCBenefitsList;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//select[contains(name,JurisdictionState)]", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'DisabilityPercent')]", AI = false)
	private WebElement inpPPDPercentage;
	
	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'PD_NumWeeks')]", AI = false)
	private WebElement inpPPDNumWeeks;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//div[contains(@id,'JurisdictionState')]", AI = false)
	private WebElement lblJurisdiction;
	
	@IFindBy(how = How.CSS, using = "select[name$='WCPDWeeksAndLimitsLV-0-JurisdictionState']", AI = false)
	private WebElement drpJurisdictionState;

	public PPDWeeksPage(){
	}

	public PPDWeeksPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnStartDateDateIcon_66))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public PPDWeeksPage enterNumberofWeeks_63(WebDriver driver,String NumberofWeeks_63) {
		            BrowserActions.type(driver, inpNumberofWeeks_63,NumberofWeeks_63, "NumberofWeeks_63");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_80(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_80,"StartDateDateIcon_80");
				    return this;
			}
public PPDWeeksPage enterPPDPercentage_76(WebDriver driver,String PPDPercentage_76) {
		            BrowserActions.type(driver, inpPPDPercentage_76,PPDPercentage_76, "PPDPercentage_76");
			        return this;
           }
public PPDWeeksPage enterEndDate_32(WebDriver driver,String EndDate_32) {
		            BrowserActions.type(driver, inpEndDate_32,EndDate_32, "EndDate_32");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks(WebDriver driver,String NumberofWeeks) {
		            BrowserActions.type(driver, inpPPDNumWeeks,NumberofWeeks, "NumberofWeeks");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_36(WebDriver driver,String Jurisdiction_36)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_36,Jurisdiction_36,"Jurisdiction_36");
				    return this;
			}
public PPDWeeksPage enterEndDate_39(WebDriver driver,String EndDate_39) {
		            BrowserActions.type(driver, inpEndDate_39,EndDate_39, "EndDate_39");
			        return this;
           }
public PPDWeeksPage enterEndDate_4(WebDriver driver,String EndDate_4) {
		            BrowserActions.type(driver, inpEndDate_4,EndDate_4, "EndDate_4");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_29(WebDriver driver,String Jurisdiction_29)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_29,Jurisdiction_29,"Jurisdiction_29");
				    return this;
			}
public PPDWeeksPage clickEndDateDateIcon_75(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_75,"EndDateDateIcon_75");
				    return this;
			}
public PPDWeeksPage enterStartDate_44(WebDriver driver,String StartDate_44) {
		            BrowserActions.type(driver, inpStartDate_44,StartDate_44, "StartDate_44");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_73(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_73,"StartDateDateIcon_73");
				    return this;
			}
public PPDWeeksPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,1,"Jurisdiction");
				    return this;
			}
public PPDWeeksPage enterNumberofWeeks_77(WebDriver driver,String NumberofWeeks_77) {
		            BrowserActions.type(driver, inpNumberofWeeks_77,NumberofWeeks_77, "NumberofWeeks_77");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_69(WebDriver driver,String PPDPercentage_69) {
		            BrowserActions.type(driver, inpPPDPercentage_69,PPDPercentage_69, "PPDPercentage_69");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_62(WebDriver driver,String PPDPercentage_62) {
		            BrowserActions.type(driver, inpPPDPercentage_62,PPDPercentage_62, "PPDPercentage_62");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_94(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_94,"StartDateDateIcon_94");
				    return this;
			}
public PPDWeeksPage selectJurisdiction_43(WebDriver driver,String Jurisdiction_43)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_43,Jurisdiction_43,"Jurisdiction_43");
				    return this;
			}
public PPDWeeksPage enterEndDate_46(WebDriver driver,String EndDate_46) {
		            BrowserActions.type(driver, inpEndDate_46,EndDate_46, "EndDate_46");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_70(WebDriver driver,String NumberofWeeks_70) {
		            BrowserActions.type(driver, inpNumberofWeeks_70,NumberofWeeks_70, "NumberofWeeks_70");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_68(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_68,"EndDateDateIcon_68");
				    return this;
			}
public PPDWeeksPage enterStartDate_37(WebDriver driver,String StartDate_37) {
		            BrowserActions.type(driver, inpStartDate_37,StartDate_37, "StartDate_37");
			        return this;
           }
public PPDWeeksPage enterEndDate_53(WebDriver driver,String EndDate_53) {
		            BrowserActions.type(driver, inpEndDate_53,EndDate_53, "EndDate_53");
			        return this;
           }
public PPDWeeksPage enterStartDate_30(WebDriver driver,String StartDate_30) {
		            BrowserActions.type(driver, inpStartDate_30,StartDate_30, "StartDate_30");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_61(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_61,"EndDateDateIcon_61");
				    return this;
			}
public PPDWeeksPage clickStartDateDateIcon_87(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_87,"StartDateDateIcon_87");
				    return this;
			}
public PPDWeeksPage enterPPDPercentage_13(WebDriver driver,String PPDPercentage_13) {
		            BrowserActions.type(driver, inpPPDPercentage_13,PPDPercentage_13, "PPDPercentage_13");
			        return this;
           }
public PPDWeeksPage enterStartDate(WebDriver driver,String StartDate) {
		            BrowserActions.type(driver, inpStartDate,StartDate,1, "StartDate");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_92(WebDriver driver,String Jurisdiction_92)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_92,Jurisdiction_92,"Jurisdiction_92");
				    return this;
			}
public PPDWeeksPage enterPPDPercentage_97(WebDriver driver,String PPDPercentage_97) {
		            BrowserActions.type(driver, inpPPDPercentage_97,PPDPercentage_97, "PPDPercentage_97");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_84(WebDriver driver,String NumberofWeeks_84) {
		            BrowserActions.type(driver, inpNumberofWeeks_84,NumberofWeeks_84, "NumberofWeeks_84");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_90(WebDriver driver,String PPDPercentage_90) {
		            BrowserActions.type(driver, inpPPDPercentage_90,PPDPercentage_90, "PPDPercentage_90");
			        return this;
           }
public PPDWeeksPage enterEndDate_60(WebDriver driver,String EndDate_60) {
		            BrowserActions.type(driver, inpEndDate_60,EndDate_60, "EndDate_60");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_17(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_17,"StartDateDateIcon_17");
				    return this;
			}
public PPDWeeksPage enterStartDate_23(WebDriver driver,String StartDate_23) {
		            BrowserActions.type(driver, inpStartDate_23,StartDate_23, "StartDate_23");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_54(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_54,"EndDateDateIcon_54");
				    return this;
			}
public PPDWeeksPage clickStartDateDateIcon_10(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_10,"StartDateDateIcon_10");
				    return this;
			}
public PPDWeeksPage enterNumberofWeeks_98(WebDriver driver,String NumberofWeeks_98) {
		            BrowserActions.type(driver, inpNumberofWeeks_98,NumberofWeeks_98, "NumberofWeeks_98");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_14(WebDriver driver,String NumberofWeeks_14) {
		            BrowserActions.type(driver, inpNumberofWeeks_14,NumberofWeeks_14, "NumberofWeeks_14");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_91(WebDriver driver,String NumberofWeeks_91) {
		            BrowserActions.type(driver, inpNumberofWeeks_91,NumberofWeeks_91, "NumberofWeeks_91");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_83(WebDriver driver,String PPDPercentage_83) {
		            BrowserActions.type(driver, inpPPDPercentage_83,PPDPercentage_83, "PPDPercentage_83");
			        return this;
           }
public PPDWeeksPage enterEndDate_67(WebDriver driver,String EndDate_67) {
		            BrowserActions.type(driver, inpEndDate_67,EndDate_67, "EndDate_67");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_22(WebDriver driver,String Jurisdiction_22)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_22,Jurisdiction_22,"Jurisdiction_22");
				    return this;
			}
public PPDWeeksPage enterStartDate_16(WebDriver driver,String StartDate_16) {
		            BrowserActions.type(driver, inpStartDate_16,StartDate_16, "StartDate_16");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_47(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_47,"EndDateDateIcon_47");
				    return this;
			}
public PPDWeeksPage selectJurisdiction_15(WebDriver driver,String Jurisdiction_15)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_15,Jurisdiction_15,"Jurisdiction_15");
				    return this;
			}
public PPDWeeksPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,true,"Add");
				    return this;
			}
public PPDWeeksPage selectJurisdiction_1(WebDriver driver,String Jurisdiction_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_1,Jurisdiction_1,"Jurisdiction_1");
				    return this;
			}
public PPDWeeksPage enterEndDate_74(WebDriver driver,String EndDate_74) {
		            BrowserActions.type(driver, inpEndDate_74,EndDate_74, "EndDate_74");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
				    return this;
			}
public PPDWeeksPage enterStartDate_9(WebDriver driver,String StartDate_9) {
		            BrowserActions.type(driver, inpStartDate_9,StartDate_9, "StartDate_9");
			        return this;
           }
public PPDWeeksPage enterStartDate_93(WebDriver driver,String StartDate_93) {
		            BrowserActions.type(driver, inpStartDate_93,StartDate_93, "StartDate_93");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_40(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_40,"EndDateDateIcon_40");
				    return this;
			}
public PPDWeeksPage selectJurisdiction_8(WebDriver driver,String Jurisdiction_8)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_8,Jurisdiction_8,"Jurisdiction_8");
				    return this;
			}
public PPDWeeksPage enterStartDate_2(WebDriver driver,String StartDate_2) {
		            BrowserActions.type(driver, inpStartDate_2,StartDate_2, "StartDate_2");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_3(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_3,"StartDateDateIcon_3");
				    return this;
			}
public PPDWeeksPage clickStartDateDateIcon_24(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_24,"StartDateDateIcon_24");
				    return this;
			}
public PPDWeeksPage enterPPDPercentage_34(WebDriver driver,String PPDPercentage_34) {
		            BrowserActions.type(driver, inpPPDPercentage_34,PPDPercentage_34, "PPDPercentage_34");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_21(WebDriver driver,String NumberofWeeks_21) {
		            BrowserActions.type(driver, inpNumberofWeeks_21,NumberofWeeks_21, "NumberofWeeks_21");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
				    return this;
			}
public PPDWeeksPage selectJurisdiction_71(WebDriver driver,String Jurisdiction_71)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_71,Jurisdiction_71,"Jurisdiction_71");
				    return this;
			}
public PPDWeeksPage selectJurisdiction_78(WebDriver driver,String Jurisdiction_78)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_78,Jurisdiction_78,"Jurisdiction_78");
				    return this;
			}
public PPDWeeksPage clickStartDateDateIcon_38(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_38,"StartDateDateIcon_38");
				    return this;
			}
public PPDWeeksPage enterPPDPercentage_6(WebDriver driver,String PPDPercentage_6) {
		            BrowserActions.type(driver, inpPPDPercentage_6,PPDPercentage_6, "PPDPercentage_6");
			        return this;
           }
public PPDWeeksPage enterEndDate_81(WebDriver driver,String EndDate_81) {
		            BrowserActions.type(driver, inpEndDate_81,EndDate_81, "EndDate_81");
			        return this;
           }
public PPDWeeksPage enterStartDate_86(WebDriver driver,String StartDate_86) {
		            BrowserActions.type(driver, inpStartDate_86,StartDate_86, "StartDate_86");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_33(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_33,"EndDateDateIcon_33");
				    return this;
			}
public PPDWeeksPage clickEndDateDateIcon_5(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_5,"EndDateDateIcon_5");
				    return this;
			}
public PPDWeeksPage enterNumberofWeeks_28(WebDriver driver,String NumberofWeeks_28) {
		            BrowserActions.type(driver, inpNumberofWeeks_28,NumberofWeeks_28, "NumberofWeeks_28");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_31(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_31,"StartDateDateIcon_31");
				    return this;
			}
public PPDWeeksPage enterNumberofWeeks_35(WebDriver driver,String NumberofWeeks_35) {
		            BrowserActions.type(driver, inpNumberofWeeks_35,NumberofWeeks_35, "NumberofWeeks_35");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_20(WebDriver driver,String PPDPercentage_20) {
		            BrowserActions.type(driver, inpPPDPercentage_20,PPDPercentage_20, "PPDPercentage_20");
			        return this;
           }
public PPDWeeksPage enterEndDate_88(WebDriver driver,String EndDate_88) {
		            BrowserActions.type(driver, inpEndDate_88,EndDate_88, "EndDate_88");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_85(WebDriver driver,String Jurisdiction_85)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_85,Jurisdiction_85,"Jurisdiction_85");
				    return this;
			}
public PPDWeeksPage enterStartDate_79(WebDriver driver,String StartDate_79) {
		            BrowserActions.type(driver, inpStartDate_79,StartDate_79, "StartDate_79");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_26(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_26,"EndDateDateIcon_26");
				    return this;
			}
public PPDWeeksPage enterEndDate_95(WebDriver driver,String EndDate_95) {
		            BrowserActions.type(driver, inpEndDate_95,EndDate_95, "EndDate_95");
			        return this;
           }
public PPDWeeksPage enterStartDate_72(WebDriver driver,String StartDate_72) {
		            BrowserActions.type(driver, inpStartDate_72,StartDate_72, "StartDate_72");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_27(WebDriver driver,String PPDPercentage_27) {
		            BrowserActions.type(driver, inpPPDPercentage_27,PPDPercentage_27, "PPDPercentage_27");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_45(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_45,"StartDateDateIcon_45");
				    return this;
			}
public PPDWeeksPage enterEndDate_18(WebDriver driver,String EndDate_18) {
		            BrowserActions.type(driver, inpEndDate_18,EndDate_18, "EndDate_18");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_55(WebDriver driver,String PPDPercentage_55) {
		            BrowserActions.type(driver, inpPPDPercentage_55,PPDPercentage_55, "PPDPercentage_55");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_42(WebDriver driver,String NumberofWeeks_42) {
		            BrowserActions.type(driver, inpNumberofWeeks_42,NumberofWeeks_42, "NumberofWeeks_42");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_50(WebDriver driver,String Jurisdiction_50)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_50,Jurisdiction_50,"Jurisdiction_50");
				    return this;
			}
public PPDWeeksPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,true,"Edit");
				    return this;
			}
public PPDWeeksPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,true,"Update");
				    return this;
			}
public PPDWeeksPage enterEndDate_11(WebDriver driver,String EndDate_11) {
		            BrowserActions.type(driver, inpEndDate_11,EndDate_11, "EndDate_11");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage(WebDriver driver,String PPDPercentage) {
		            BrowserActions.type(driver, inpPPDPercentage,PPDPercentage, "PPDPercentage");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_57(WebDriver driver,String Jurisdiction_57)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_57,Jurisdiction_57,"Jurisdiction_57");
				    return this;
			}
public PPDWeeksPage clickEndDateDateIcon_19(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_19,"EndDateDateIcon_19");
				    return this;
			}
public PPDWeeksPage clickEndDateDateIcon_12(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_12,"EndDateDateIcon_12");
				    return this;
			}
public PPDWeeksPage enterEndDate(WebDriver driver,String EndDate) {
		            BrowserActions.type(driver, inpEndDate,EndDate,1, "EndDate");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_59(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_59,"StartDateDateIcon_59");
				    return this;
			}
public PPDWeeksPage enterStartDate_65(WebDriver driver,String StartDate_65) {
		            BrowserActions.type(driver, inpStartDate_65,StartDate_65, "StartDate_65");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_96(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_96,"EndDateDateIcon_96");
				    return this;
			}
public PPDWeeksPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public PPDWeeksPage clickStartDateDateIcon_52(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_52,"StartDateDateIcon_52");
				    return this;
			}
public PPDWeeksPage enterNumberofWeeks_49(WebDriver driver,String NumberofWeeks_49) {
		            BrowserActions.type(driver, inpNumberofWeeks_49,NumberofWeeks_49, "NumberofWeeks_49");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_7(WebDriver driver,String NumberofWeeks_7) {
		            BrowserActions.type(driver, inpNumberofWeeks_7,NumberofWeeks_7, "NumberofWeeks_7");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_41(WebDriver driver,String PPDPercentage_41) {
		            BrowserActions.type(driver, inpPPDPercentage_41,PPDPercentage_41, "PPDPercentage_41");
			        return this;
           }
public PPDWeeksPage enterNumberofWeeks_56(WebDriver driver,String NumberofWeeks_56) {
		            BrowserActions.type(driver, inpNumberofWeeks_56,NumberofWeeks_56, "NumberofWeeks_56");
			        return this;
           }
public PPDWeeksPage selectJurisdiction_64(WebDriver driver,String Jurisdiction_64)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_64,Jurisdiction_64,"Jurisdiction_64");
				    return this;
			}
public PPDWeeksPage enterEndDate_25(WebDriver driver,String EndDate_25) {
		            BrowserActions.type(driver, inpEndDate_25,EndDate_25, "EndDate_25");
			        return this;
           }
public PPDWeeksPage enterStartDate_58(WebDriver driver,String StartDate_58) {
		            BrowserActions.type(driver, inpStartDate_58,StartDate_58, "StartDate_58");
			        return this;
           }
public PPDWeeksPage clickEndDateDateIcon_89(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_89,"EndDateDateIcon_89");
				    return this;
			}
public PPDWeeksPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,true,"Cancel");
				    return this;
			}
public PPDWeeksPage clickEndDateDateIcon_82(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_82,"EndDateDateIcon_82");
				    return this;
			}
public PPDWeeksPage enterStartDate_51(WebDriver driver,String StartDate_51) {
		            BrowserActions.type(driver, inpStartDate_51,StartDate_51, "StartDate_51");
			        return this;
           }
public PPDWeeksPage enterPPDPercentage_48(WebDriver driver,String PPDPercentage_48) {
		            BrowserActions.type(driver, inpPPDPercentage_48,PPDPercentage_48, "PPDPercentage_48");
			        return this;
           }
public PPDWeeksPage clickStartDateDateIcon_66(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_66,"StartDateDateIcon_66");
				    return this;
			}
public PPDWeeksPage clickWCPPDCheckBox(WebDriver driver , String state)  {
	//BrowserActions.waitForNetworkIdleState(driver, 2);
	By chkBoxBy = By.xpath("//option[text()='"+state+"' and @selected]//ancestor::td[contains(@id,'JurisdictionState_Cell')]//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
	BrowserActions.waitForElementToDisplay(driver, chkBoxBy, "chkBox");
	WebElement chkBox = chkBoxBy.findElement(driver);
	BrowserActions.click(driver, chkBox,"Check box");
	return this;
}
public PPDWeeksPage selectJurisdictionState(WebDriver driver,String Jurisdiction)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpJurisdictionState,Jurisdiction,1,"Jurisdiction");
    return this;
}

public String getJurisdictionName(WebDriver driver, String state)  {
	By lblStateBy =By.xpath("//div[text()='"+state+"']");
	BrowserActions.waitForElementToDisplay(driver, lblStateBy, "State");
	WebElement lblState = lblStateBy.findElement(driver);
	String afterUpdate = BrowserActions.getText(driver, lblState, "State Text");
	return afterUpdate;
}

public void verifyJurisdictionIsUpdated(WebDriver driver,String state,String beforeUpdate)  {
	By stateFieldBy = By.xpath("//div[text()='"+state+"']");
	BrowserActions.waitForElementToDisplay(driver, stateFieldBy, "State field");
	WebElement stateField = stateFieldBy.findElement(driver);
	String afterUpdate = BrowserActions.getText(driver, stateField, "State");
	Log.assertThat(!afterUpdate.equals(beforeUpdate), "Jurisdiction State is "+beforeUpdate+" Updated as "+afterUpdate, "No update in jurisdiction");
}
public void verifyJurisdictionIsNotUpdated(WebDriver driver,String state,String beforeUpdate)  {
	By stateFieldBy = By.xpath("//div[text()='"+state+"']");
	BrowserActions.waitForElementToDisplay(driver, stateFieldBy, "State field");
	WebElement stateField = stateFieldBy.findElement(driver);
	String afterUpdate = BrowserActions.getText(driver, stateField, "State");
	Log.assertThat(!afterUpdate.equals(beforeUpdate), "Jurisdiction State is not updated", "Jurisdiction State is  updated");
}

}
