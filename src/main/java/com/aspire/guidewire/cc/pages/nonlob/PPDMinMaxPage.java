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

public class PPDMinMaxPage extends LoadableComponent<PPDMinMaxPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_54;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_88;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_71;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_6;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_4;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_8;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_47;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_28;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_40;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_77;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_78;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_75;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_63;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_45;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_80;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_93;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_97;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_29;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_16;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_46;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_49;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_89;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_68;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_38;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_37;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_69;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_84;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_60;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_61;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_91;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_10;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_53;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_58;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_15;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_59;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_20;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_50;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_81;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_96;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_12;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_70;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_62;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_67;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_79;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_41;

	@IFindBy(how = How.CSS, using = "div[id$='Add']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_1;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_11;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_19;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-0-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_87;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_21;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_72;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_92;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_2;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_3;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_99;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-0-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_18;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_76;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_43;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_73;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_35;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_39;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_32;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_33;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_85;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_5;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_30;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_83;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_52;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_82;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_9;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_44;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_23;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_48;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_24;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_94;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_90;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-9-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_74;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_36;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_13;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_98;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_25;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_55;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_14;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_65;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-2-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_17;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-1-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_7;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-6-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_51;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-11-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_95;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_57;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-PD_MaxBenefit']", AI = false)
	private WebElement inpMaxBenefit_27;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_22;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-Max_DisabilityPercent']", AI = false)
	private WebElement inpMaxPPDPercentage_34;

	@IFindBy(how = How.CSS, using = "select[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_64;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-3-PD_MinBenefit']", AI = false)
	private WebElement inpMinBenefit_26;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-10-PD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_86;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-4-PD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_31;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-7-PD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_56;

	@IFindBy(how = How.CSS, using = "input[name='WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-5-Min_DisabilityPercent']", AI = false)
	private WebElement inpMinPPDPercentage_42;

	@IFindBy(how = How.CSS, using = "#WCPDBenefits-ref_WC_PD_BenefitsScreen-WCPDBenefitsLV-8-PD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_66;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//select[contains(name,JurisdictionState)]", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'MaxBenefit')]", AI = false)
	private WebElement inpMaxBenefit;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'MinBenefit')]", AI = false)
	private WebElement inpMinBenefit;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'Min_DisabilityPercent')]", AI = false)
	private WebElement inpMinPPDPercentage;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'Max_DisabilityPercent')]", AI = false)
	private WebElement inpMaxPPDPercentage;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'PD_BenefitEndDate')]", AI = false)
	private WebElement inpEndDate;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'PD_BenefitStartDate')]", AI = false)
	private WebElement inpStartDate;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'Checkbox')]", AI = false)
	private WebElement chkWCBenefitsList;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//div[contains(@id,'JurisdictionState')]", AI = false)
	private WebElement lblJurisdiction;
	
	@IFindBy(how = How.XPATH, using = "(//div[contains(@id,'_Checkbox')])[last()]", AI = false)
	private WebElement chkLastEntry;


	public PPDMinMaxPage(){
	}

	public PPDMinMaxPage(WebDriver driver) throws Exception{
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
	}public PPDMinMaxPage enterMaxBenefit_54(WebDriver driver,String MaxBenefit_54) {
		BrowserActions.type(driver, inpMaxBenefit_54,MaxBenefit_54, "MaxBenefit_54");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_88(WebDriver driver,String MaxPPDPercentage_88) {
		BrowserActions.type(driver, inpMaxPPDPercentage_88,MaxPPDPercentage_88, "MaxPPDPercentage_88");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_71(WebDriver driver,String MinBenefit_71) {
		BrowserActions.type(driver, inpMinBenefit_71,MinBenefit_71, "MinBenefit_71");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_6(WebDriver driver,String MinPPDPercentage_6) {
		BrowserActions.type(driver, inpMinPPDPercentage_6,MinPPDPercentage_6, "MinPPDPercentage_6");
		return this;
	}
	public PPDMinMaxPage enterEndDate_4(WebDriver driver,String EndDate_4) {
		BrowserActions.type(driver, inpEndDate_4,EndDate_4, "EndDate_4");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_8(WebDriver driver,String MinBenefit_8) {
		BrowserActions.type(driver, inpMinBenefit_8,MinBenefit_8, "MinBenefit_8");
		return this;
	}
	public PPDMinMaxPage enterStartDate_47(WebDriver driver,String StartDate_47) {
		BrowserActions.type(driver, inpStartDate_47,StartDate_47, "StartDate_47");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_28(WebDriver driver,String Jurisdiction_28)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_28,Jurisdiction_28,"Jurisdiction_28");
		return this;
	}
	public PPDMinMaxPage enterEndDate_40(WebDriver driver,String EndDate_40) {
		BrowserActions.type(driver, inpEndDate_40,EndDate_40, "EndDate_40");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_77(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_77,"EndDateDateIcon_77");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_78(WebDriver driver,String MinPPDPercentage_78) {
		BrowserActions.type(driver, inpMinPPDPercentage_78,MinPPDPercentage_78, "MinPPDPercentage_78");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_75(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_75,"StartDateDateIcon_75");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,1,"Jurisdiction");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_63(WebDriver driver,String MaxBenefit_63) {
		BrowserActions.type(driver, inpMaxBenefit_63,MaxBenefit_63, "MaxBenefit_63");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_45(WebDriver driver,String MaxBenefit_45) {
		BrowserActions.type(driver, inpMaxBenefit_45,MaxBenefit_45, "MaxBenefit_45");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_80(WebDriver driver,String MinBenefit_80) {
		BrowserActions.type(driver, inpMinBenefit_80,MinBenefit_80, "MinBenefit_80");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_93(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_93,"StartDateDateIcon_93");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_97(WebDriver driver,String MaxPPDPercentage_97) {
		BrowserActions.type(driver, inpMaxPPDPercentage_97,MaxPPDPercentage_97, "MaxPPDPercentage_97");
		return this;
	}
	public PPDMinMaxPage enterStartDate_29(WebDriver driver,String StartDate_29) {
		BrowserActions.type(driver, inpStartDate_29,StartDate_29, "StartDate_29");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_16(WebDriver driver,String MaxPPDPercentage_16) {
		BrowserActions.type(driver, inpMaxPPDPercentage_16,MaxPPDPercentage_16, "MaxPPDPercentage_16");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_46(WebDriver driver,String Jurisdiction_46)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_46,Jurisdiction_46,"Jurisdiction_46");
		return this;
	}
	public PPDMinMaxPage enterEndDate_49(WebDriver driver,String EndDate_49) {
		BrowserActions.type(driver, inpEndDate_49,EndDate_49, "EndDate_49");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_89(WebDriver driver,String MinBenefit_89) {
		BrowserActions.type(driver, inpMinBenefit_89,MinBenefit_89, "MinBenefit_89");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_68(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_68,"EndDateDateIcon_68");
		return this;
	}
	public PPDMinMaxPage enterStartDate_38(WebDriver driver,String StartDate_38) {
		BrowserActions.type(driver, inpStartDate_38,StartDate_38, "StartDate_38");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_37(WebDriver driver,String Jurisdiction_37)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_37,Jurisdiction_37,"Jurisdiction_37");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_69(WebDriver driver,String MinPPDPercentage_69) {
		BrowserActions.type(driver, inpMinPPDPercentage_69,MinPPDPercentage_69, "MinPPDPercentage_69");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_84(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_84,"StartDateDateIcon_84");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_60(WebDriver driver,String MinPPDPercentage_60) {
		BrowserActions.type(driver, inpMinPPDPercentage_60,MinPPDPercentage_60, "MinPPDPercentage_60");
		return this;
	}
	public PPDMinMaxPage enterStartDate(WebDriver driver,String StartDate) {
		BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_61(WebDriver driver,String MaxPPDPercentage_61) {
		BrowserActions.type(driver, inpMaxPPDPercentage_61,MaxPPDPercentage_61, "MaxPPDPercentage_61");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_91(WebDriver driver,String Jurisdiction_91)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_91,Jurisdiction_91,"Jurisdiction_91");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_10(WebDriver driver,String Jurisdiction_10)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_10,Jurisdiction_10,"Jurisdiction_10");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_53(WebDriver driver,String MinBenefit_53) {
		BrowserActions.type(driver, inpMinBenefit_53,MinBenefit_53, "MinBenefit_53");
		return this;
	}
	public PPDMinMaxPage enterEndDate_58(WebDriver driver,String EndDate_58) {
		BrowserActions.type(driver, inpEndDate_58,EndDate_58, "EndDate_58");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_15(WebDriver driver,String MinPPDPercentage_15) {
		BrowserActions.type(driver, inpMinPPDPercentage_15,MinPPDPercentage_15, "MinPPDPercentage_15");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_59(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_59,"EndDateDateIcon_59");
		return this;
	}
	public PPDMinMaxPage enterStartDate_20(WebDriver driver,String StartDate_20) {
		BrowserActions.type(driver, inpStartDate_20,StartDate_20, "StartDate_20");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_50(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_50,"EndDateDateIcon_50");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_81(WebDriver driver,String MaxBenefit_81) {
		BrowserActions.type(driver, inpMaxBenefit_81,MaxBenefit_81, "MaxBenefit_81");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_96(WebDriver driver,String MinPPDPercentage_96) {
		BrowserActions.type(driver, inpMinPPDPercentage_96,MinPPDPercentage_96, "MinPPDPercentage_96");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_12(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_12,"StartDateDateIcon_12");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_70(WebDriver driver,String MaxPPDPercentage_70) {
		BrowserActions.type(driver, inpMaxPPDPercentage_70,MaxPPDPercentage_70, "MaxPPDPercentage_70");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_62(WebDriver driver,String MinBenefit_62) {
		BrowserActions.type(driver, inpMinBenefit_62,MinBenefit_62, "MinBenefit_62");
		return this;
	}
	public PPDMinMaxPage enterEndDate_67(WebDriver driver,String EndDate_67) {
		BrowserActions.type(driver, inpEndDate_67,EndDate_67, "EndDate_67");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_79(WebDriver driver,String MaxPPDPercentage_79) {
		BrowserActions.type(driver, inpMaxPPDPercentage_79,MaxPPDPercentage_79, "MaxPPDPercentage_79");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_41(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_41,"EndDateDateIcon_41");
		return this;
	}
	public PPDMinMaxPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_1(WebDriver driver,String Jurisdiction_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_1,Jurisdiction_1,"Jurisdiction_1");
		return this;
	}
	public PPDMinMaxPage enterStartDate_11(WebDriver driver,String StartDate_11) {
		BrowserActions.type(driver, inpStartDate_11,StartDate_11, "StartDate_11");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_19(WebDriver driver,String Jurisdiction_19)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_19,Jurisdiction_19,"Jurisdiction_19");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_87(WebDriver driver,String MinPPDPercentage_87) {
		BrowserActions.type(driver, inpMinPPDPercentage_87,MinPPDPercentage_87, "MinPPDPercentage_87");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_21(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_21,"StartDateDateIcon_21");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit(WebDriver driver,String MaxBenefit) {
		BrowserActions.type(driver, inpMaxBenefit,MaxBenefit, "MaxBenefit");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_72(WebDriver driver,String MaxBenefit_72) {
		BrowserActions.type(driver, inpMaxBenefit_72,MaxBenefit_72, "MaxBenefit_72");
		return this;
	}
	public PPDMinMaxPage enterStartDate_92(WebDriver driver,String StartDate_92) {
		BrowserActions.type(driver, inpStartDate_92,StartDate_92, "StartDate_92");
		return this;
	}
	public PPDMinMaxPage enterStartDate_2(WebDriver driver,String StartDate_2) {
		BrowserActions.type(driver, inpStartDate_2,StartDate_2, "StartDate_2");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_3(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_3,"StartDateDateIcon_3");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_99(WebDriver driver,String MaxBenefit_99) {
		BrowserActions.type(driver, inpMaxBenefit_99,MaxBenefit_99, "MaxBenefit_99");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_18(WebDriver driver,String MaxBenefit_18) {
		BrowserActions.type(driver, inpMaxBenefit_18,MaxBenefit_18, "MaxBenefit_18");
		return this;
	}
	public PPDMinMaxPage enterEndDate_76(WebDriver driver,String EndDate_76) {
		BrowserActions.type(driver, inpEndDate_76,EndDate_76, "EndDate_76");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_43(WebDriver driver,String MaxPPDPercentage_43) {
		BrowserActions.type(driver, inpMaxPPDPercentage_43,MaxPPDPercentage_43, "MaxPPDPercentage_43");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_73(WebDriver driver,String Jurisdiction_73)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_73,Jurisdiction_73,"Jurisdiction_73");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_35(WebDriver driver,String MinBenefit_35) {
		BrowserActions.type(driver, inpMinBenefit_35,MinBenefit_35, "MinBenefit_35");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_39(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_39,"StartDateDateIcon_39");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_32(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_32,"EndDateDateIcon_32");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_33(WebDriver driver,String MinPPDPercentage_33) {
		BrowserActions.type(driver, inpMinPPDPercentage_33,MinPPDPercentage_33, "MinPPDPercentage_33");
		return this;
	}
	public PPDMinMaxPage enterEndDate_85(WebDriver driver,String EndDate_85) {
		BrowserActions.type(driver, inpEndDate_85,EndDate_85, "EndDate_85");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_5,"EndDateDateIcon_5");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_30(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_30,"StartDateDateIcon_30");
		return this;
	}
	public PPDMinMaxPage enterStartDate_83(WebDriver driver,String StartDate_83) {
		BrowserActions.type(driver, inpStartDate_83,StartDate_83, "StartDate_83");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_52(WebDriver driver,String MaxPPDPercentage_52) {
		BrowserActions.type(driver, inpMaxPPDPercentage_52,MaxPPDPercentage_52, "MaxPPDPercentage_52");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_82(WebDriver driver,String Jurisdiction_82)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_82,Jurisdiction_82,"Jurisdiction_82");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_9(WebDriver driver,String MaxBenefit_9) {
		BrowserActions.type(driver, inpMaxBenefit_9,MaxBenefit_9, "MaxBenefit_9");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_44(WebDriver driver,String MinBenefit_44) {
		BrowserActions.type(driver, inpMinBenefit_44,MinBenefit_44, "MinBenefit_44");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_23(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_23,"EndDateDateIcon_23");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_48(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_48,"StartDateDateIcon_48");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_24(WebDriver driver,String MinPPDPercentage_24) {
		BrowserActions.type(driver, inpMinPPDPercentage_24,MinPPDPercentage_24, "MinPPDPercentage_24");
		return this;
	}
	public PPDMinMaxPage enterEndDate_94(WebDriver driver,String EndDate_94) {
		BrowserActions.type(driver, inpEndDate_94,EndDate_94, "EndDate_94");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_90(WebDriver driver,String MaxBenefit_90) {
		BrowserActions.type(driver, inpMaxBenefit_90,MaxBenefit_90, "MaxBenefit_90");
		return this;
	}
	public PPDMinMaxPage enterStartDate_74(WebDriver driver,String StartDate_74) {
		BrowserActions.type(driver, inpStartDate_74,StartDate_74, "StartDate_74");
		return this;
	}
	public PPDMinMaxPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,true,"Edit");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_36(WebDriver driver,String MaxBenefit_36) {
		BrowserActions.type(driver, inpMaxBenefit_36,MaxBenefit_36, "MaxBenefit_36");
		return this;
	}
	public PPDMinMaxPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,true,"Update");
		return this;
	}
	public PPDMinMaxPage enterEndDate_13(WebDriver driver,String EndDate_13) {
		BrowserActions.type(driver, inpEndDate_13,EndDate_13, "EndDate_13");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit(WebDriver driver,String MinBenefit) {
		BrowserActions.type(driver, inpMinBenefit,MinBenefit, "MinBenefit");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_98(WebDriver driver,String MinBenefit_98) {
		BrowserActions.type(driver, inpMinBenefit_98,MinBenefit_98, "MinBenefit_98");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_25(WebDriver driver,String MaxPPDPercentage_25) {
		BrowserActions.type(driver, inpMaxPPDPercentage_25,MaxPPDPercentage_25, "MaxPPDPercentage_25");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_55(WebDriver driver,String Jurisdiction_55)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_55,Jurisdiction_55,"Jurisdiction_55");
		return this;
	}
	public PPDMinMaxPage enterEndDate(WebDriver driver,String EndDate) {
		BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_14(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_14,"EndDateDateIcon_14");
		return this;
	}
	public PPDMinMaxPage enterStartDate_65(WebDriver driver,String StartDate_65) {
		BrowserActions.type(driver, inpStartDate_65,StartDate_65, "StartDate_65");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage(WebDriver driver,String MinPPDPercentage) {
		BrowserActions.type(driver, inpMinPPDPercentage,MinPPDPercentage, "MinPPDPercentage");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage(WebDriver driver,String MaxPPDPercentage) {
		BrowserActions.type(driver, inpMaxPPDPercentage,MaxPPDPercentage, "MaxPPDPercentage");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_17(WebDriver driver,String MinBenefit_17) {
		BrowserActions.type(driver, inpMinBenefit_17,MinBenefit_17, "MinBenefit_17");
		return this;
	}
	public PPDMinMaxPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_7(WebDriver driver,String MaxPPDPercentage_7) {
		BrowserActions.type(driver, inpMaxPPDPercentage_7,MaxPPDPercentage_7, "MaxPPDPercentage_7");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_51(WebDriver driver,String MinPPDPercentage_51) {
		BrowserActions.type(driver, inpMinPPDPercentage_51,MinPPDPercentage_51, "MinPPDPercentage_51");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_95(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_95,"EndDateDateIcon_95");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_57(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_57,"StartDateDateIcon_57");
		return this;
	}
	public PPDMinMaxPage enterMaxBenefit_27(WebDriver driver,String MaxBenefit_27) {
		BrowserActions.type(driver, inpMaxBenefit_27,MaxBenefit_27, "MaxBenefit_27");
		return this;
	}
	public PPDMinMaxPage enterEndDate_22(WebDriver driver,String EndDate_22) {
		BrowserActions.type(driver, inpEndDate_22,EndDate_22, "EndDate_22");
		return this;
	}
	public PPDMinMaxPage enterMaxPPDPercentage_34(WebDriver driver,String MaxPPDPercentage_34) {
		BrowserActions.type(driver, inpMaxPPDPercentage_34,MaxPPDPercentage_34, "MaxPPDPercentage_34");
		return this;
	}
	public PPDMinMaxPage selectJurisdiction_64(WebDriver driver,String Jurisdiction_64)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_64,Jurisdiction_64,"Jurisdiction_64");
		return this;
	}
	public PPDMinMaxPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,true,"Cancel");
		return this;
	}
	public PPDMinMaxPage enterMinBenefit_26(WebDriver driver,String MinBenefit_26) {
		BrowserActions.type(driver, inpMinBenefit_26,MinBenefit_26, "MinBenefit_26");
		return this;
	}
	public PPDMinMaxPage clickEndDateDateIcon_86(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_86,"EndDateDateIcon_86");
		return this;
	}
	public PPDMinMaxPage enterEndDate_31(WebDriver driver,String EndDate_31) {
		BrowserActions.type(driver, inpEndDate_31,EndDate_31, "EndDate_31");
		return this;
	}
	public PPDMinMaxPage enterStartDate_56(WebDriver driver,String StartDate_56) {
		BrowserActions.type(driver, inpStartDate_56,StartDate_56, "StartDate_56");
		return this;
	}
	public PPDMinMaxPage enterMinPPDPercentage_42(WebDriver driver,String MinPPDPercentage_42) {
		BrowserActions.type(driver, inpMinPPDPercentage_42,MinPPDPercentage_42, "MinPPDPercentage_42");
		return this;
	}
	public PPDMinMaxPage clickStartDateDateIcon_66(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_66,"StartDateDateIcon_66");
		return this;
	}

	public PPDMinMaxPage clickWCPPDCheckBox(WebDriver driver , String state)  {
	    WebElement wCPPDCheckBoxElement = driver.findElement(By.xpath("//div[text()='"+state+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]"));
		BrowserActions.click(driver, wCPPDCheckBoxElement,"Check box");
		return this;
	}
	
	public String getJurisdictionName(WebDriver driver , String jurisdiction)  {
		BrowserActions.waitForElementToDisplay(driver, btnEdit,2);
		WebElement jurisdictionState = driver.findElement(By.xpath("//div[text()='"+jurisdiction+"']"));
		String afterUpdate = BrowserActions.getText(driver, jurisdictionState, "Jurisdiction");
		return afterUpdate;
	}

	public void verifyJurisdiction(WebDriver driver,String beforeUpdate)  {
		String afterUpdate = BrowserActions.getText(driver, lblJurisdiction, "Jurisdiction");
		if(!afterUpdate.equals(beforeUpdate)) {
			Log.message("Jurisdiction is"+beforeUpdate+"Updated as"+afterUpdate);
		}else {
			Log.message("No update in jurisdiction");
		}
	}
	public String verifyJurisdictionIsUpdated(WebDriver driver,String state,String beforeUpdate)  {
		WebElement stateField = driver.findElement(By.xpath("//div[text()='"+state+"']"));
		String afterUpdate = BrowserActions.getText(driver, stateField, "State");
		Log.assertThat(!afterUpdate.equals(beforeUpdate), "Jurisdiction State is "+beforeUpdate+" Updated as "+afterUpdate, "No update in jurisdiction");
		return afterUpdate;
	}
	public void verifyJurisdictionIsNotUpdated(WebDriver driver,String state,String beforeUpdate)  {
		WebElement stateField = driver.findElement(By.xpath("//div[text()='"+state+"']"));
		String afterUpdate = BrowserActions.getText(driver, stateField, "State");
		Log.assertThat(!afterUpdate.equals(beforeUpdate), "Jurisdiction State is not updated", "Jurisdiction State is  updated");
	}
	public PPDMinMaxPage selectJurisdictionState(WebDriver driver, String state , String jurisdications)  {
		WebElement jurisdicationState = driver.findElement(By.xpath("//option[@selected and text()='"+jurisdications+"' ]//parent::select[contains(@name,'JurisdictionState')]"));
		BrowserActions.selectDropDownByVisibleText(driver, jurisdicationState,state,"Jurisdication State is ");
		return this;
	}
	public PPDMinMaxPage clickLastEntry(WebDriver driver, String state , String jurisdications)  {
		BrowserActions.click(driver, chkLastEntry, "Last entry");
		return this;
	}
}
