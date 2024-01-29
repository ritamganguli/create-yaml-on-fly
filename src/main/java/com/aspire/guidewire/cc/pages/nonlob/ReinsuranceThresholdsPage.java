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

public class ReinsuranceThresholdsPage extends LoadableComponent<ReinsuranceThresholdsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-ReportingThreshold']", AI = false)
	public WebElement inpReportingThreshold_44;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-StartDate']", AI = false)
	public WebElement inpStartDate_45;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-ReportingThreshold']", AI = false)
	public WebElement inpReportingThreshold_36;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLossCausesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_50;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-StartDate']", AI = false)
	public WebElement inpStartDate_29;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdCoveragesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_53;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-StartDate']", AI = false)
	public WebElement inpStartDate_37;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-ReportingThreshold']", AI = false)
	public WebElement inpReportingThreshold_28;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-TreatyType']", AI = false)
	public WebElement drpTreatyType_1;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-ReportingThreshold']", AI = false)
	public WebElement inpReportingThreshold_20;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-TreatyType']", AI = false)
	public WebElement drpTreatyType_9;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-StartDate']", AI = false)
	public WebElement inpStartDate_21;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-ReportingThreshold']", AI = false)
	public WebElement inpReportingThreshold_12;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-StartDate']", AI = false)
	public WebElement inpStartDate_13;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-TreatyType']", AI = false)
	public WebElement drpTreatyType;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-EndDate_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_32;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-EndDate_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_24;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-EndDate_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_16;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-PolicyType']", AI = false)
	public WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-EndDate']", AI = false)
	public WebElement inpEndDate_39;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-ReportingThreshold']", AI = false)
	public WebElement inpReportingThreshold_4;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-EndDate']", AI = false)
	public WebElement inpEndDate_47;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-StartDate']", AI = false)
	public WebElement inpStartDate;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-EndDate_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_48;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-EndDate_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_40;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-ThresholdValue']", AI = false)
	public WebElement inpThresholdValue_35;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-EndDate_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_8;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-ThresholdValue']", AI = false)
	public WebElement inpThresholdValue_43;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-ThresholdValue']", AI = false)
	public WebElement inpThresholdValue_19;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-EndDate']", AI = false)
	public WebElement inpEndDate_15;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-EndDate']", AI = false)
	public WebElement inpEndDate;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-ThresholdValue']", AI = false)
	public WebElement inpThresholdValue_11;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-ThresholdValue']", AI = false)
	public WebElement inpThresholdValue_27;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-EndDate']", AI = false)
	public WebElement inpEndDate_23;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLossCausesLV-1-LossCause']", AI = false)
	public WebElement drpLossCause_51;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-EndDate']", AI = false)
	public WebElement inpEndDate_31;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-EndDate']", AI = false)
	public WebElement inpEndDate_7;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-PolicyType']", AI = false)
	public WebElement drpPolicyType_42;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-TreatyType']", AI = false)
	public WebElement drpTreatyType_41;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdCoveragesLV-0-CoverageType']", AI = false)
	public WebElement drpCoverageType;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdCoveragesLV-4-CoverageType']", AI = false)
	public WebElement drpCoverageType_57;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdCoveragesLV-3-CoverageType']", AI = false)
	public WebElement drpCoverageType_56;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdCoveragesLV-2-CoverageType']", AI = false)
	public WebElement drpCoverageType_55;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdCoveragesLV-1-CoverageType']", AI = false)
	public WebElement drpCoverageType_54;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLossCausesLV-0-LossCause']", AI = false)
	public WebElement drpLossCause;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-StartDate_dateIcon", AI = false)
	public WebElement btnStartDateDateIcon_14;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-StartDate_dateIcon", AI = false)
	public WebElement btnStartDateDateIcon_6;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-StartDate']", AI = false)
	public WebElement inpStartDate_5;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-StartDate_dateIcon", AI = false)
	public WebElement btnStartDateDateIcon_22;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-ReportingThreshold']", AI = false)
	public WebElement inpReportingThreshold;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-StartDate_dateIcon", AI = false)
	public WebElement btnStartDateDateIcon_38;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-StartDate_dateIcon", AI = false)
	public WebElement btnStartDateDateIcon_30;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-TreatyType']", AI = false)
	public WebElement drpTreatyType_17;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-2-PolicyType']", AI = false)
	public WebElement drpPolicyType_10;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-3-PolicyType']", AI = false)
	public WebElement drpPolicyType_18;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-6-StartDate_dateIcon", AI = false)
	public WebElement btnStartDateDateIcon_46;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-ThresholdValue']", AI = false)
	public WebElement inpThresholdValue_3;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-PolicyType']", AI = false)
	public WebElement drpPolicyType_26;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-TreatyType']", AI = false)
	public WebElement drpTreatyType_33;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdDetailTab", AI = false)
	public WebElement btnReinsuranceThresholdDetail;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-5-PolicyType']", AI = false)
	public WebElement drpPolicyType_34;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-4-TreatyType']", AI = false)
	public WebElement drpTreatyType_25;

	@IFindBy(how = How.CSS, using = "input[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-ThresholdValue']", AI = false)
	public WebElement inpThresholdValue;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-EndDate_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-0-StartDate_dateIcon", AI = false)
	public WebElement btnStartDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLossCausesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_49;

	@IFindBy(how = How.CSS, using = "select[name='ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdLV-1-PolicyType']", AI = false)
	public WebElement drpPolicyType_2;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ReinsuranceThresholdListDetail-ReinsuranceThresholdCoveragesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_52;

	@IFindBy(how = How.CSS, using = "#ReinsuranceThresholds-ReinsuranceThresholdsScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdLV-0-TreatyType']", AI = false)
	public WebElement lblTreatyType;

	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdLV-0-PolicyType']", AI = false)
	public WebElement lblPolicyType;

	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdLV-0-ThresholdValue']", AI = false)
	public WebElement lblThresholdValue;

	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdLV-0-ReportingThreshold']", AI = false)
	public WebElement lblReportingThreshold;

	@IFindBy(how = How.CSS, using = "div[id$='CoverageTypeHeader']", AI = false)
	public WebElement lblCoverageType;

	@IFindBy(how = How.CSS, using = "div[id$='LossCauseHeader']", AI = false)
	public WebElement lblLossCause;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//select[contains(@name,'TreatyType')]", AI = false)
	public WebElement drpAddTreatyType;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//select[contains(@name,'PolicyType')]", AI = false)
	public WebElement drpAddPolicyType;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'ThresholdValue')]", AI = false)
	public WebElement inpAddThresholdValue;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'ReportingThreshold')]", AI = false)
	public WebElement inpAddReportingThreshold;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'Checkbox')]", AI = false)
	public WebElement chkLastRowOfReinsuranceThresholds;
	
	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdLossCausesLV_tb-Add']", AI = false)
	public WebElement btnLossCauseAdd;

	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdCoveragesLV_tb-Add']", AI = false)
	public WebElement btnCoverageAdd;
	
	@IFindBy(how = How.XPATH, using = "//tr[last()]//select[contains(@name,'LossCause')]", AI = false)
	public WebElement drpAddNewLossCause;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//select[contains(@name,'CoverageType')]", AI = false)
	public WebElement drpAddNewCoverageType;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'ReinsuranceThresholdLossCausesLV')]", AI = false)
	public WebElement chkLastRowOfLossCause;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'ReinsuranceThresholdCoveragesLV')]", AI = false)
	public WebElement chkLastRowOfCoverageType;
	
	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdLossCausesLV_tb-Remove']", AI = false)
	public WebElement btnLossCauseRemove;

	@IFindBy(how = How.CSS, using = "div[id$='ReinsuranceThresholdCoveragesLV_tb-Remove']", AI = false)
	public WebElement btnCoverageRemove;


	public String reinsuranceThresholdListRows =  "tr[id*='ReinsuranceThresholdListDetail-ReinsuranceThresholdLV']";
	public String lossCauseListOfRows =  "tr[id*='LossCausesLV']";
	public String coverageTypeListOfRows =  "tr[id*='CoveragesLV']";
	
	public ReinsuranceThresholdsPage(){
	}

	public ReinsuranceThresholdsPage(WebDriver driver) throws Exception{
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
	}public ReinsuranceThresholdsPage enterReportingThreshold_44(WebDriver driver,String ReportingThreshold_44) {
		BrowserActions.type(driver, inpReportingThreshold_44,ReportingThreshold_44, "ReportingThreshold_44");
		return this;
	}
	public ReinsuranceThresholdsPage enterStartDate_45(WebDriver driver,String StartDate_45) {
		BrowserActions.type(driver, inpStartDate_45,StartDate_45, "StartDate_45");
		return this;
	}
	public ReinsuranceThresholdsPage enterReportingThreshold_36(WebDriver driver,String ReportingThreshold_36) {
		BrowserActions.type(driver, inpReportingThreshold_36,ReportingThreshold_36, "ReportingThreshold_36");
		return this;
	}
	public ReinsuranceThresholdsPage clickRemove_50(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_50,"Remove_50");
		return this;
	}
	public ReinsuranceThresholdsPage enterStartDate_29(WebDriver driver,String StartDate_29) {
		BrowserActions.type(driver, inpStartDate_29,StartDate_29, "StartDate_29");
		return this;
	}
	public ReinsuranceThresholdsPage clickRemove_53(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_53,"Remove_53");
		return this;
	}
	public ReinsuranceThresholdsPage enterStartDate_37(WebDriver driver,String StartDate_37) {
		BrowserActions.type(driver, inpStartDate_37,StartDate_37, "StartDate_37");
		return this;
	}
	public ReinsuranceThresholdsPage enterReportingThreshold_28(WebDriver driver,String ReportingThreshold_28) {
		BrowserActions.type(driver, inpReportingThreshold_28,ReportingThreshold_28, "ReportingThreshold_28");
		return this;
	}
	public ReinsuranceThresholdsPage selectTreatyType_1(WebDriver driver,String TreatyType_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatyType_1,TreatyType_1,"TreatyType_1");
		return this;
	}
	public ReinsuranceThresholdsPage enterReportingThreshold_20(WebDriver driver,String ReportingThreshold_20) {
		BrowserActions.type(driver, inpReportingThreshold_20,ReportingThreshold_20, "ReportingThreshold_20");
		return this;
	}
	public ReinsuranceThresholdsPage selectTreatyType_9(WebDriver driver,String TreatyType_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatyType_9,TreatyType_9,"TreatyType_9");
		return this;
	}
	public ReinsuranceThresholdsPage enterStartDate_21(WebDriver driver,String StartDate_21) {
		BrowserActions.type(driver, inpStartDate_21,StartDate_21, "StartDate_21");
		return this;
	}
	public ReinsuranceThresholdsPage enterReportingThreshold_12(WebDriver driver,String ReportingThreshold_12) {
		BrowserActions.type(driver, inpReportingThreshold_12,ReportingThreshold_12, "ReportingThreshold_12");
		return this;
	}
	public ReinsuranceThresholdsPage enterStartDate_13(WebDriver driver,String StartDate_13) {
		BrowserActions.type(driver, inpStartDate_13,StartDate_13, "StartDate_13");
		return this;
	}
	public ReinsuranceThresholdsPage selectTreatyType(WebDriver driver,String TreatyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatyType,TreatyType,"TreatyType");
		return this;
	}
	public ReinsuranceThresholdsPage clickEndDateDateIcon_32(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_32,"EndDateDateIcon_32");
		return this;
	}
	public ReinsuranceThresholdsPage clickEndDateDateIcon_24(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_24,"EndDateDateIcon_24");
		return this;
	}
	public ReinsuranceThresholdsPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,true,"Update");
		return this;
	}
	public ReinsuranceThresholdsPage clickEndDateDateIcon_16(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_16,"EndDateDateIcon_16");
		return this;
	}
	public ReinsuranceThresholdsPage selectPolicyType(WebDriver driver,String PolicyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,"PolicyType");
		return this;
	}
	public ReinsuranceThresholdsPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public ReinsuranceThresholdsPage enterEndDate_39(WebDriver driver,String EndDate_39) {
		BrowserActions.type(driver, inpEndDate_39,EndDate_39, "EndDate_39");
		return this;
	}
	public ReinsuranceThresholdsPage enterReportingThreshold_4(WebDriver driver,String ReportingThreshold_4) {
		BrowserActions.type(driver, inpReportingThreshold_4,ReportingThreshold_4, "ReportingThreshold_4");
		return this;
	}
	public ReinsuranceThresholdsPage enterEndDate_47(WebDriver driver,String EndDate_47) {
		BrowserActions.type(driver, inpEndDate_47,EndDate_47, "EndDate_47");
		return this;
	}
	public ReinsuranceThresholdsPage enterStartDate(WebDriver driver,String StartDate) {
		BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
		return this;
	}
	public ReinsuranceThresholdsPage clickEndDateDateIcon_48(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_48,"EndDateDateIcon_48");
		return this;
	}
	public ReinsuranceThresholdsPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,1,"Add");
		return this;
	}
	public ReinsuranceThresholdsPage clickEndDateDateIcon_40(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_40,"EndDateDateIcon_40");
		return this;
	}
	public ReinsuranceThresholdsPage enterThresholdValue_35(WebDriver driver,String ThresholdValue_35) {
		BrowserActions.type(driver, inpThresholdValue_35,ThresholdValue_35, "ThresholdValue_35");
		return this;
	}
	public ReinsuranceThresholdsPage clickEndDateDateIcon_8(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_8,"EndDateDateIcon_8");
		return this;
	}
	public ReinsuranceThresholdsPage enterThresholdValue_43(WebDriver driver,String ThresholdValue_43) {
		BrowserActions.type(driver, inpThresholdValue_43,ThresholdValue_43, "ThresholdValue_43");
		return this;
	}
	public ReinsuranceThresholdsPage enterThresholdValue_19(WebDriver driver,String ThresholdValue_19) {
		BrowserActions.type(driver, inpThresholdValue_19,ThresholdValue_19, "ThresholdValue_19");
		return this;
	}
	public ReinsuranceThresholdsPage enterEndDate_15(WebDriver driver,String EndDate_15) {
		BrowserActions.type(driver, inpEndDate_15,EndDate_15, "EndDate_15");
		return this;
	}
	public ReinsuranceThresholdsPage enterEndDate(WebDriver driver,String EndDate) {
		BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
		return this;
	}
	public ReinsuranceThresholdsPage enterThresholdValue_11(WebDriver driver,String ThresholdValue_11) {
		BrowserActions.type(driver, inpThresholdValue_11,ThresholdValue_11, "ThresholdValue_11");
		return this;
	}
	public ReinsuranceThresholdsPage enterThresholdValue_27(WebDriver driver,String ThresholdValue_27) {
		BrowserActions.type(driver, inpThresholdValue_27,ThresholdValue_27, "ThresholdValue_27");
		return this;
	}
	public ReinsuranceThresholdsPage enterEndDate_23(WebDriver driver,String EndDate_23) {
		BrowserActions.type(driver, inpEndDate_23,EndDate_23, "EndDate_23");
		return this;
	}
	public ReinsuranceThresholdsPage selectLossCause_51(WebDriver driver,String LossCause_51)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossCause_51,LossCause_51,"LossCause_51");
		return this;
	}
	public ReinsuranceThresholdsPage enterEndDate_31(WebDriver driver,String EndDate_31) {
		BrowserActions.type(driver, inpEndDate_31,EndDate_31, "EndDate_31");
		return this;
	}
	public ReinsuranceThresholdsPage enterEndDate_7(WebDriver driver,String EndDate_7) {
		BrowserActions.type(driver, inpEndDate_7,EndDate_7, "EndDate_7");
		return this;
	}
	public ReinsuranceThresholdsPage selectPolicyType_42(WebDriver driver,String PolicyType_42)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType_42,PolicyType_42,"PolicyType_42");
		return this;
	}
	public ReinsuranceThresholdsPage selectTreatyType_41(WebDriver driver,String TreatyType_41)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatyType_41,TreatyType_41,"TreatyType_41");
		return this;
	}
	public ReinsuranceThresholdsPage selectCoverageType(WebDriver driver,String CoverageType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageType,CoverageType,"CoverageType");
		return this;
	}
	public ReinsuranceThresholdsPage selectCoverageType_57(WebDriver driver,String CoverageType_57)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageType_57,CoverageType_57,"CoverageType_57");
		return this;
	}
	public ReinsuranceThresholdsPage selectCoverageType_56(WebDriver driver,String CoverageType_56)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageType_56,CoverageType_56,"CoverageType_56");
		return this;
	}
	public ReinsuranceThresholdsPage selectCoverageType_55(WebDriver driver,String CoverageType_55)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageType_55,CoverageType_55,"CoverageType_55");
		return this;
	}
	public ReinsuranceThresholdsPage selectCoverageType_54(WebDriver driver,String CoverageType_54)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageType_54,CoverageType_54,"CoverageType_54");
		return this;
	}
	public ReinsuranceThresholdsPage selectLossCause(WebDriver driver,String LossCause)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossCause,LossCause,"LossCause");
		return this;
	}
	public ReinsuranceThresholdsPage clickStartDateDateIcon_14(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_14,"StartDateDateIcon_14");
		return this;
	}
	public ReinsuranceThresholdsPage clickStartDateDateIcon_6(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_6,"StartDateDateIcon_6");
		return this;
	}
	public ReinsuranceThresholdsPage enterStartDate_5(WebDriver driver,String StartDate_5) {
		BrowserActions.type(driver, inpStartDate_5,StartDate_5, "StartDate_5");
		return this;
	}
	public ReinsuranceThresholdsPage clickStartDateDateIcon_22(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_22,"StartDateDateIcon_22");
		return this;
	}
	public ReinsuranceThresholdsPage enterReportingThreshold(WebDriver driver,String ReportingThreshold) {
		BrowserActions.type(driver, inpReportingThreshold,ReportingThreshold, "ReportingThreshold");
		return this;
	}
	public ReinsuranceThresholdsPage clickStartDateDateIcon_38(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_38,"StartDateDateIcon_38");
		return this;
	}
	public ReinsuranceThresholdsPage clickStartDateDateIcon_30(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_30,"StartDateDateIcon_30");
		return this;
	}
	public ReinsuranceThresholdsPage selectTreatyType_17(WebDriver driver,String TreatyType_17)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatyType_17,TreatyType_17,"TreatyType_17");
		return this;
	}
	public ReinsuranceThresholdsPage selectPolicyType_10(WebDriver driver,String PolicyType_10)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType_10,PolicyType_10,"PolicyType_10");
		return this;
	}
	public ReinsuranceThresholdsPage selectPolicyType_18(WebDriver driver,String PolicyType_18)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType_18,PolicyType_18,"PolicyType_18");
		return this;
	}
	public ReinsuranceThresholdsPage clickStartDateDateIcon_46(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon_46,"StartDateDateIcon_46");
		return this;
	}
	public ReinsuranceThresholdsPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public ReinsuranceThresholdsPage enterThresholdValue_3(WebDriver driver,String ThresholdValue_3) {
		BrowserActions.type(driver, inpThresholdValue_3,ThresholdValue_3, "ThresholdValue_3");
		return this;
	}
	public ReinsuranceThresholdsPage selectPolicyType_26(WebDriver driver,String PolicyType_26)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType_26,PolicyType_26,"PolicyType_26");
		return this;
	}
	public ReinsuranceThresholdsPage selectTreatyType_33(WebDriver driver,String TreatyType_33)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatyType_33,TreatyType_33,"TreatyType_33");
		return this;
	}
	public ReinsuranceThresholdsPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public ReinsuranceThresholdsPage clickReinsuranceThresholdDetail(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsuranceThresholdDetail,"ReinsuranceThresholdDetail");
		return this;
	}
	public ReinsuranceThresholdsPage selectPolicyType_34(WebDriver driver,String PolicyType_34)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType_34,PolicyType_34,"PolicyType_34");
		return this;
	}
	public ReinsuranceThresholdsPage selectTreatyType_25(WebDriver driver,String TreatyType_25)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatyType_25,TreatyType_25,"TreatyType_25");
		return this;
	}
	public ReinsuranceThresholdsPage enterThresholdValue(WebDriver driver,String ThresholdValue) {
		BrowserActions.type(driver, inpThresholdValue,ThresholdValue, "ThresholdValue");
		return this;
	}
	public ReinsuranceThresholdsPage clickEndDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
		return this;
	}
	public ReinsuranceThresholdsPage clickStartDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
		return this;
	}
	public ReinsuranceThresholdsPage clickAdd_49(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_49,"Add_49");
		return this;
	}
	public ReinsuranceThresholdsPage selectPolicyType_2(WebDriver driver,String PolicyType_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType_2,PolicyType_2,"PolicyType_2");
		return this;
	}
	public ReinsuranceThresholdsPage clickAdd_52(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_52,"Add_52");
		return this;
	}

	public void verifyTreatyTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTreatyType,"Treaty type");
	}

	public void verifyPolicyTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblPolicyType,"Policy type");
	}

	public void verifyThresholdValueIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblThresholdValue,"Threshold Value");
	}

	public void verifyLossCauseIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblLossCause,"Loss Cause");
	}

	public void verifyReportingThresholdIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblReportingThreshold,"Reporting Threshold");
	}

	public void verifyCoverageTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblCoverageType,"Coverage Type");
	}

	public ReinsuranceThresholdsPage selectAddNewPolicyType(WebDriver driver,String PolicyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddPolicyType,PolicyType,2,"Add New PolicyType");
		return this;
	}

	public ReinsuranceThresholdsPage selectAddNewTreatyType(WebDriver driver,String treatyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddTreatyType,treatyType,2,"Add New TreatyType");
		return this;
	}

	public ReinsuranceThresholdsPage enterAddNewThresholdValue(WebDriver driver,String value)  {
		BrowserActions.type(driver, inpAddThresholdValue,value,1,"Add New Threshold Value");
		return this;
	}

	public ReinsuranceThresholdsPage enterAddNewReportingThreshold(WebDriver driver,String reportingThreshold)  {
		BrowserActions.type(driver, inpAddReportingThreshold,reportingThreshold,"Add New Reporting Threshold");
		return this;
	}

	public int getNumOfRowsBeforeAdding(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblPolicyType);
		By reinsuranceThresholdList = By.cssSelector(reinsuranceThresholdListRows);
		int size = BrowserActions.getWebElementSize(driver, reinsuranceThresholdList, "reinsurance Threshold List", 0.5);
		return size;
	}
	
	public int getNumOfRowsInLossCauseTableBeforeAdding(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblLossCause);
		By lossCauseList = By.cssSelector(lossCauseListOfRows);
		int size = BrowserActions.getWebElementSize(driver, lossCauseList, "loss cause",0.5);
		return size;
	}

	public int getNumOfRowsInCoverageTypeTableBeforeAdding(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblCoverageType);
		By coverageTypeList = By.cssSelector(coverageTypeListOfRows);
		int size = BrowserActions.getWebElementSize(driver, coverageTypeList, "coverage Type List", 0.5);
		return size;
	}

	public void verifyReinsuranceThresholdListIsUpdatedByRowSize(WebDriver driver,int numRowsBefore)  {
		BrowserActions.waitForElementToDisplay(driver, lblPolicyType);
		By reinsuranceThresholdList = By.cssSelector(reinsuranceThresholdListRows);
		int numRowsAfter = BrowserActions.getWebElementSize(driver, reinsuranceThresholdList, "reinsuranceThresholdList", 0.5);
		Log.softAssertThat(numRowsAfter != numRowsBefore,"Added reinsurance threshold is updated successfully","Added reinsurance threshold is removed successfully");
	}
	
	public void verifyLossCauseListIsUpdatedByRowSize(WebDriver driver,int numRowsBefore)  {
		BrowserActions.waitForElementToDisplay(driver, lblLossCause);
		By lossCauseBy = By.cssSelector(lossCauseListOfRows);
		int numRowsAfter = BrowserActions.getWebElementSize(driver, lossCauseBy, "reinsuranceThresholdList", 0.5);
		Log.softAssertThat(numRowsAfter != numRowsBefore,"Added loss cause is updated successfully","Added loss cause is removed successfully");
	}

	public void verifyCoverageTypeListIsUpdatedByRowSize(WebDriver driver,int numRowsBefore)  {
		BrowserActions.waitForElementToDisplay(driver, lblCoverageType);
		By coverageType = By.cssSelector(coverageTypeListOfRows);
		int numRowsAfter = BrowserActions.getWebElementSize(driver, coverageType, "coverageType", 0.5);
		Log.softAssertThat(numRowsAfter != numRowsBefore,"Added coveragetype is updated successfully","Added coveragetype is removed successfully");
	}


	public ReinsuranceThresholdsPage clickReinsuranceThresholdCheckBox(WebDriver driver)  {
		BrowserActions.click(driver, chkLastRowOfReinsuranceThresholds,"Reinsurance Threshold Recently added CheckBox");
		return this;
	}
	
	public ReinsuranceThresholdsPage clickAddLossCause(WebDriver driver)  {
		BrowserActions.click(driver, btnLossCauseAdd,"Loss cause add button");
		return this;
	}

	public ReinsuranceThresholdsPage clickAddCoverageType(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverageAdd,1,"Coverage Add button");
		return this;
	}

	public ReinsuranceThresholdsPage clickLastAddedCoverageTypeCheckBox(WebDriver driver)  {
		BrowserActions.click(driver, chkLastRowOfCoverageType,"Recently added coverage type check box");
		return this;
	}
	
	public ReinsuranceThresholdsPage clickLastAddedLossCauseCheckBox(WebDriver driver)  {
		BrowserActions.click(driver, chkLastRowOfLossCause,"Recently Added loss cause check box");
		return this;
	}
	
	public ReinsuranceThresholdsPage selectAddNewLossCause(WebDriver driver,String lossCause)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddNewLossCause,lossCause,1,"Add new loss cause");
		return this;
	}

	public ReinsuranceThresholdsPage selectAddNewCoverageType(WebDriver driver,String coverageType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddNewCoverageType,coverageType,2,"Add new coverage type");
		return this;
	}

	public ReinsuranceThresholdsPage clickLossCauseRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnLossCauseRemove,"Loss Cause Remove");
		return this;
	}

	public ReinsuranceThresholdsPage clickCoveragesRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverageRemove,"Coverages Remove");
		return this;
	}

}
