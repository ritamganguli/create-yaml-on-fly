package com.aspire.guidewire.pc.pages.nonlob;

import java.awt.AWTException;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class ImportExportStatusPage extends LoadableComponent<ImportExportStatusPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	private static final SecureRandom random = new SecureRandom();


	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-Created']", AI = false)
	private WebElement inpStartTime_50;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-RuleType']", AI = false)
	private WebElement drpRuleType_90;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-Cancel", AI = false)
	private WebElement btnCancel_15;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-ImportDetails", AI = false)
	private WebElement btnReview;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-ImportDetails", AI = false)
	private WebElement btnReview_8;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-Cancel", AI = false)
	private WebElement btnCancel_93;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-Created']", AI = false)
	private WebElement inpStartTime_58;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_43;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-ImportDetails", AI = false)
	private WebElement btnReview_64;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-RefreshButton>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-Status']", AI = false)
	private WebElement inpStatus_46;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-SourceName']", AI = false)
	private WebElement inpSourceFile_53;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-Created']", AI = false)
	private WebElement inpStartTime_2;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-StartedBy']", AI = false)
	private WebElement inpStartedBy_17;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-RuleType']", AI = false)
	private WebElement drpRuleType_82;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-Cancel", AI = false)
	private WebElement btnCancel_23;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-ImportDetails", AI = false)
	private WebElement btnReview_72;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-SourceName']", AI = false)
	private WebElement inpSourceFile_37;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-Status']", AI = false)
	private WebElement inpStatus_62;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-SourceName']", AI = false)
	private WebElement inpSourceFile;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_35;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-Created']", AI = false)
	private WebElement inpStartTime_66;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-SourceName']", AI = false)
	private WebElement inpSourceFile_45;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-Status']", AI = false)
	private WebElement inpStatus_54;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-RuleType']", AI = false)
	private WebElement drpRuleType_12;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-StartedBy']", AI = false)
	private WebElement inpStartedBy_25;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-Download", AI = false)
	private WebElement btnDownload;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-Cancel", AI = false)
	private WebElement btnCancel_39;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-SourceName']", AI = false)
	private WebElement inpSourceFile_29;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-Created']", AI = false)
	private WebElement inpStartTime_74;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-Cancel", AI = false)
	private WebElement btnCancel_31;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-RuleType']", AI = false)
	private WebElement drpRuleType;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_67;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-Status']", AI = false)
	private WebElement inpStatus_30;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-Status']", AI = false)
	private WebElement inpStatus_22;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-StartedBy']", AI = false)
	private WebElement inpStartedBy_33;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-RuleType']", AI = false)
	private WebElement drpRuleType_28;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-RuleType']", AI = false)
	private WebElement drpRuleType_20;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_59;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-Cancel", AI = false)
	private WebElement btnCancel_47;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-Created']", AI = false)
	private WebElement inpStartTime_80;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_51;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-StartedBy']", AI = false)
	private WebElement inpStartedBy_9;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-Created']", AI = false)
	private WebElement inpStartTime;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-StartedBy']", AI = false)
	private WebElement inpStartedBy_41;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-Created']", AI = false)
	private WebElement inpStartTime_88;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-RuleType']", AI = false)
	private WebElement drpRuleType_36;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-SourceName']", AI = false)
	private WebElement inpSourceFile_21;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-ImportDetails", AI = false)
	private WebElement btnReview_16;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-StartedBy']", AI = false)
	private WebElement inpStartedBy_49;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-Status']", AI = false)
	private WebElement inpStatus_38;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-SourceName']", AI = false)
	private WebElement inpSourceFile_5;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-Cancel", AI = false)
	private WebElement btnCancel_55;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-ImportDetails", AI = false)
	private WebElement btnReview_24;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-Status']", AI = false)
	private WebElement inpStatus_92;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-Created']", AI = false)
	private WebElement inpStartTime_10;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_89;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-Cancel", AI = false)
	private WebElement btnCancel_7;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-SourceName']", AI = false)
	private WebElement inpSourceFile_13;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-StartedBy']", AI = false)
	private WebElement inpStartedBy_1;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-StartedBy']", AI = false)
	private WebElement inpStartedBy_57;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-RuleType']", AI = false)
	private WebElement drpRuleType_44;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-Created']", AI = false)
	private WebElement inpStartTime_26;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_75;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-ImportDetails", AI = false)
	private WebElement btnReview_32;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-Cancel", AI = false)
	private WebElement btnCancel_63;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-StartedBy']", AI = false)
	private WebElement inpStartedBy_65;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-Status']", AI = false)
	private WebElement inpStatus_14;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-Import>div[role='button']", AI = false)
	private WebElement btnImportfromFile;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-Created']", AI = false)
	private WebElement inpStartTime_18;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_81;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-RuleType']", AI = false)
	private WebElement drpRuleType_52;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-Cancel", AI = false)
	private WebElement btnCancel_78;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-ImportDetails", AI = false)
	private WebElement btnReview_40;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-4-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_27;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-5-Created']", AI = false)
	private WebElement inpStartTime_34;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-ImportDetails", AI = false)
	private WebElement btnReview_48;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-Cancel", AI = false)
	private WebElement btnCancel_71;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-Status']", AI = false)
	private WebElement inpStatus_70;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-Download", AI = false)
	private WebElement btnDownload_86;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-SourceName']", AI = false)
	private WebElement inpSourceFile_69;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-StartedBy']", AI = false)
	private WebElement inpStartedBy_73;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-9-RuleType']", AI = false)
	private WebElement drpRuleType_68;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-StartedBy']", AI = false)
	private WebElement inpStartedBy_79;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-RuleType']", AI = false)
	private WebElement drpRuleType_60;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-Rules']", AI = false)
	private WebElement inpRules_91;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-StartedBy']", AI = false)
	private WebElement inpStartedBy;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-Download", AI = false)
	private WebElement btnDownload_94;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-RuleType']", AI = false)
	private WebElement drpRuleType_4;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-3-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_19;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_3;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-7-ImportDetails", AI = false)
	private WebElement btnReview_56;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-Cancel", AI = false)
	private WebElement btnCancel_85;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-2-Created_dateIcon", AI = false)
	private WebElement btnStartTimeDateIcon_11;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-6-Created']", AI = false)
	private WebElement inpStartTime_42;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-Rules']", AI = false)
	private WebElement inpRules;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-Status']", AI = false)
	private WebElement inpStatus_84;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-2-StartedBy']", AI = false)
	private WebElement inpStartedBy_87;

	@IFindBy(how = How.CSS, using = "#PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-0-Cancel", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-Status']", AI = false)
	private WebElement inpStatus_77;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-1-Status']", AI = false)
	private WebElement inpStatus_6;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ImportsLV-8-SourceName']", AI = false)
	private WebElement inpSourceFile_61;

	@IFindBy(how = How.CSS, using = "input[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-1-Rules']", AI = false)
	private WebElement inpRules_83;

	@IFindBy(how = How.CSS, using = "select[name='PCBizRulesExportImportStatus-RuleExportImportStatusScreen-ExportsLV-0-RuleType']", AI = false)
	private WebElement drpRuleType_76;

	public ImportExportStatusPage(){
	}

	public ImportExportStatusPage(WebDriver driver){
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
	}public ImportExportStatusPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public ImportExportStatusPage enterStartTime_50(WebDriver driver,String StartTime_50) {
		BrowserActions.type(driver, inpStartTime_50,StartTime_50, "StartTime_50");
		return this;
	}
	public ImportExportStatusPage selectRuleType_90(WebDriver driver,String RuleType_90)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_90,RuleType_90,"RuleType_90");
		return this;
	}
	public ImportExportStatusPage clickCancel_15(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_15,"Cancel_15");
		return this;
	}
	public ImportExportStatusPage clickReview(WebDriver driver)  {
		BrowserActions.click(driver, btnReview,"Review");
		return this;
	}
	public ImportExportStatusPage clickReview_8(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_8,"Review_8");
		return this;
	}
	public ImportExportStatusPage clickCancel_93(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_93,"Cancel_93");
		return this;
	}
	public ImportExportStatusPage enterStartTime_58(WebDriver driver,String StartTime_58) {
		BrowserActions.type(driver, inpStartTime_58,StartTime_58, "StartTime_58");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_43(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_43,"StartTimeDateIcon_43");
		return this;
	}
	public ImportExportStatusPage clickReview_64(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_64,"Review_64");
		return this;
	}
	public ImportExportStatusPage clickRefresh(WebDriver driver)  {
		BrowserActions.click(driver, btnRefresh,"Refresh");
		return this;
	}
	public ImportExportStatusPage enterStatus_46(WebDriver driver,String Status_46) {
		BrowserActions.type(driver, inpStatus_46,Status_46, "Status_46");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_53(WebDriver driver,String SourceFile_53) {
		BrowserActions.type(driver, inpSourceFile_53,SourceFile_53, "SourceFile_53");
		return this;
	}
	public ImportExportStatusPage enterStartTime_2(WebDriver driver,String StartTime_2) {
		BrowserActions.type(driver, inpStartTime_2,StartTime_2, "StartTime_2");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_17(WebDriver driver,String StartedBy_17) {
		BrowserActions.type(driver, inpStartedBy_17,StartedBy_17, "StartedBy_17");
		return this;
	}
	public ImportExportStatusPage selectRuleType_82(WebDriver driver,String RuleType_82)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_82,RuleType_82,"RuleType_82");
		return this;
	}
	public ImportExportStatusPage clickCancel_23(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_23,"Cancel_23");
		return this;
	}
	public ImportExportStatusPage clickReview_72(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_72,"Review_72");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_37(WebDriver driver,String SourceFile_37) {
		BrowserActions.type(driver, inpSourceFile_37,SourceFile_37, "SourceFile_37");
		return this;
	}
	public ImportExportStatusPage enterStatus_62(WebDriver driver,String Status_62) {
		BrowserActions.type(driver, inpStatus_62,Status_62, "Status_62");
		return this;
	}
	public ImportExportStatusPage enterSourceFile(WebDriver driver,String SourceFile) {
		BrowserActions.type(driver, inpSourceFile,SourceFile, "SourceFile");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_35(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_35,"StartTimeDateIcon_35");
		return this;
	}
	public ImportExportStatusPage enterStartTime_66(WebDriver driver,String StartTime_66) {
		BrowserActions.type(driver, inpStartTime_66,StartTime_66, "StartTime_66");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_45(WebDriver driver,String SourceFile_45) {
		BrowserActions.type(driver, inpSourceFile_45,SourceFile_45, "SourceFile_45");
		return this;
	}
	public ImportExportStatusPage enterStatus_54(WebDriver driver,String Status_54) {
		BrowserActions.type(driver, inpStatus_54,Status_54, "Status_54");
		return this;
	}
	public ImportExportStatusPage selectRuleType_12(WebDriver driver,String RuleType_12)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_12,RuleType_12,"RuleType_12");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_25(WebDriver driver,String StartedBy_25) {
		BrowserActions.type(driver, inpStartedBy_25,StartedBy_25, "StartedBy_25");
		return this;
	}
	public ImportExportStatusPage clickDownload(WebDriver driver)  {
		BrowserActions.click(driver, btnDownload,"Download");
		return this;
	}
	public ImportExportStatusPage clickCancel_39(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_39,"Cancel_39");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_29(WebDriver driver,String SourceFile_29) {
		BrowserActions.type(driver, inpSourceFile_29,SourceFile_29, "SourceFile_29");
		return this;
	}
	public ImportExportStatusPage enterStartTime_74(WebDriver driver,String StartTime_74) {
		BrowserActions.type(driver, inpStartTime_74,StartTime_74, "StartTime_74");
		return this;
	}
	public ImportExportStatusPage clickCancel_31(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_31,"Cancel_31");
		return this;
	}
	public ImportExportStatusPage selectRuleType(WebDriver driver,String RuleType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType,RuleType,"RuleType");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_67(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_67,"StartTimeDateIcon_67");
		return this;
	}
	public ImportExportStatusPage enterStatus_30(WebDriver driver,String Status_30) {
		BrowserActions.type(driver, inpStatus_30,Status_30, "Status_30");
		return this;
	}
	public ImportExportStatusPage enterStatus_22(WebDriver driver,String Status_22) {
		BrowserActions.type(driver, inpStatus_22,Status_22, "Status_22");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_33(WebDriver driver,String StartedBy_33) {
		BrowserActions.type(driver, inpStartedBy_33,StartedBy_33, "StartedBy_33");
		return this;
	}
	public ImportExportStatusPage selectRuleType_28(WebDriver driver,String RuleType_28)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_28,RuleType_28,"RuleType_28");
		return this;
	}
	public ImportExportStatusPage selectRuleType_20(WebDriver driver,String RuleType_20)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_20,RuleType_20,"RuleType_20");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_59(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_59,"StartTimeDateIcon_59");
		return this;
	}
	public ImportExportStatusPage clickCancel_47(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_47,"Cancel_47");
		return this;
	}
	public ImportExportStatusPage enterStartTime_80(WebDriver driver,String StartTime_80) {
		BrowserActions.type(driver, inpStartTime_80,StartTime_80, "StartTime_80");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_51(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_51,"StartTimeDateIcon_51");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_9(WebDriver driver,String StartedBy_9) {
		BrowserActions.type(driver, inpStartedBy_9,StartedBy_9, "StartedBy_9");
		return this;
	}
	public ImportExportStatusPage enterStartTime(WebDriver driver,String StartTime) {
		BrowserActions.type(driver, inpStartTime,StartTime, "StartTime");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_41(WebDriver driver,String StartedBy_41) {
		BrowserActions.type(driver, inpStartedBy_41,StartedBy_41, "StartedBy_41");
		return this;
	}
	public ImportExportStatusPage enterStartTime_88(WebDriver driver,String StartTime_88) {
		BrowserActions.type(driver, inpStartTime_88,StartTime_88, "StartTime_88");
		return this;
	}
	public ImportExportStatusPage selectRuleType_36(WebDriver driver,String RuleType_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_36,RuleType_36,"RuleType_36");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_21(WebDriver driver,String SourceFile_21) {
		BrowserActions.type(driver, inpSourceFile_21,SourceFile_21, "SourceFile_21");
		return this;
	}
	public ImportExportStatusPage clickReview_16(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_16,"Review_16");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_49(WebDriver driver,String StartedBy_49) {
		BrowserActions.type(driver, inpStartedBy_49,StartedBy_49, "StartedBy_49");
		return this;
	}
	public ImportExportStatusPage enterStatus_38(WebDriver driver,String Status_38) {
		BrowserActions.type(driver, inpStatus_38,Status_38, "Status_38");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_5(WebDriver driver,String SourceFile_5) {
		BrowserActions.type(driver, inpSourceFile_5,SourceFile_5, "SourceFile_5");
		return this;
	}
	public ImportExportStatusPage clickCancel_55(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_55,"Cancel_55");
		return this;
	}
	public ImportExportStatusPage clickReview_24(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_24,"Review_24");
		return this;
	}
	public ImportExportStatusPage enterStatus_92(WebDriver driver,String Status_92) {
		BrowserActions.type(driver, inpStatus_92,Status_92, "Status_92");
		return this;
	}
	public ImportExportStatusPage enterStartTime_10(WebDriver driver,String StartTime_10) {
		BrowserActions.type(driver, inpStartTime_10,StartTime_10, "StartTime_10");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_89(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_89,"StartTimeDateIcon_89");
		return this;
	}
	public ImportExportStatusPage clickCancel_7(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_7,"Cancel_7");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_13(WebDriver driver,String SourceFile_13) {
		BrowserActions.type(driver, inpSourceFile_13,SourceFile_13, "SourceFile_13");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_1(WebDriver driver,String StartedBy_1) {
		BrowserActions.type(driver, inpStartedBy_1,StartedBy_1, "StartedBy_1");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_57(WebDriver driver,String StartedBy_57) {
		BrowserActions.type(driver, inpStartedBy_57,StartedBy_57, "StartedBy_57");
		return this;
	}
	public ImportExportStatusPage selectRuleType_44(WebDriver driver,String RuleType_44)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_44,RuleType_44,"RuleType_44");
		return this;
	}
	public ImportExportStatusPage enterStartTime_26(WebDriver driver,String StartTime_26) {
		BrowserActions.type(driver, inpStartTime_26,StartTime_26, "StartTime_26");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_75(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_75,"StartTimeDateIcon_75");
		return this;
	}
	public ImportExportStatusPage clickReview_32(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_32,"Review_32");
		return this;
	}
	public ImportExportStatusPage clickCancel_63(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_63,"Cancel_63");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_65(WebDriver driver,String StartedBy_65) {
		BrowserActions.type(driver, inpStartedBy_65,StartedBy_65, "StartedBy_65");
		return this;
	}
	public ImportExportStatusPage enterStatus_14(WebDriver driver,String Status_14) {
		BrowserActions.type(driver, inpStatus_14,Status_14, "Status_14");
		return this;
	}
	public ImportPage clickImportfromFile(WebDriver driver)  {
		BrowserActions.click(driver, btnImportfromFile,"ImportfromFile");
		return new ImportPage(driver).get();
	}
	public ImportExportStatusPage enterStartTime_18(WebDriver driver,String StartTime_18) {
		BrowserActions.type(driver, inpStartTime_18,StartTime_18, "StartTime_18");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_81(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_81,"StartTimeDateIcon_81");
		return this;
	}
	public ImportExportStatusPage selectRuleType_52(WebDriver driver,String RuleType_52)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_52,RuleType_52,"RuleType_52");
		return this;
	}
	public ImportExportStatusPage clickCancel_78(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_78,"Cancel_78");
		return this;
	}
	public ImportExportStatusPage clickReview_40(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_40,"Review_40");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_27(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_27,"StartTimeDateIcon_27");
		return this;
	}
	public ImportExportStatusPage enterStartTime_34(WebDriver driver,String StartTime_34) {
		BrowserActions.type(driver, inpStartTime_34,StartTime_34, "StartTime_34");
		return this;
	}
	public ImportExportStatusPage clickReview_48(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_48,"Review_48");
		return this;
	}
	public ImportExportStatusPage clickCancel_71(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_71,"Cancel_71");
		return this;
	}
	public ImportExportStatusPage enterStatus_70(WebDriver driver,String Status_70) {
		BrowserActions.type(driver, inpStatus_70,Status_70, "Status_70");
		return this;
	}
	public ImportExportStatusPage clickDownload_86(WebDriver driver)  {
		BrowserActions.click(driver, btnDownload_86,"Download_86");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_69(WebDriver driver,String SourceFile_69) {
		BrowserActions.type(driver, inpSourceFile_69,SourceFile_69, "SourceFile_69");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_73(WebDriver driver,String StartedBy_73) {
		BrowserActions.type(driver, inpStartedBy_73,StartedBy_73, "StartedBy_73");
		return this;
	}
	public ImportExportStatusPage selectRuleType_68(WebDriver driver,String RuleType_68)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_68,RuleType_68,"RuleType_68");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_79(WebDriver driver,String StartedBy_79) {
		BrowserActions.type(driver, inpStartedBy_79,StartedBy_79, "StartedBy_79");
		return this;
	}
	public ImportExportStatusPage selectRuleType_60(WebDriver driver,String RuleType_60)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_60,RuleType_60,"RuleType_60");
		return this;
	}
	public ImportExportStatusPage enterRules_91(WebDriver driver,String Rules_91) {
		BrowserActions.type(driver, inpRules_91,Rules_91, "Rules_91");
		return this;
	}
	public ImportExportStatusPage enterStartedBy(WebDriver driver,String StartedBy) {
		BrowserActions.type(driver, inpStartedBy,StartedBy, "StartedBy");
		return this;
	}
	public ImportExportStatusPage clickDownload_94(WebDriver driver)  {
		BrowserActions.click(driver, btnDownload_94,"Download_94");
		return this;
	}
	public ImportExportStatusPage selectRuleType_4(WebDriver driver,String RuleType_4)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_4,RuleType_4,"RuleType_4");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_19(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_19,"StartTimeDateIcon_19");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_3(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_3,"StartTimeDateIcon_3");
		return this;
	}
	public ImportExportStatusPage clickReview_56(WebDriver driver)  {
		BrowserActions.click(driver, btnReview_56,"Review_56");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon,"StartTimeDateIcon");
		return this;
	}
	public ImportExportStatusPage clickCancel_85(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_85,"Cancel_85");
		return this;
	}
	public ImportExportStatusPage clickStartTimeDateIcon_11(WebDriver driver)  {
		BrowserActions.click(driver, btnStartTimeDateIcon_11,"StartTimeDateIcon_11");
		return this;
	}
	public ImportExportStatusPage enterStartTime_42(WebDriver driver,String StartTime_42) {
		BrowserActions.type(driver, inpStartTime_42,StartTime_42, "StartTime_42");
		return this;
	}
	public ImportExportStatusPage enterRules(WebDriver driver,String Rules) {
		BrowserActions.type(driver, inpRules,Rules, "Rules");
		return this;
	}
	public ImportExportStatusPage enterStatus_84(WebDriver driver,String Status_84) {
		BrowserActions.type(driver, inpStatus_84,Status_84, "Status_84");
		return this;
	}
	public ImportExportStatusPage enterStartedBy_87(WebDriver driver,String StartedBy_87) {
		BrowserActions.type(driver, inpStartedBy_87,StartedBy_87, "StartedBy_87");
		return this;
	}
	public ImportExportStatusPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public ImportExportStatusPage enterStatus_77(WebDriver driver,String Status_77) {
		BrowserActions.type(driver, inpStatus_77,Status_77, "Status_77");
		return this;
	}
	public ImportExportStatusPage enterStatus_6(WebDriver driver,String Status_6) {
		BrowserActions.type(driver, inpStatus_6,Status_6, "Status_6");
		return this;
	}
	public ImportExportStatusPage enterSourceFile_61(WebDriver driver,String SourceFile_61) {
		BrowserActions.type(driver, inpSourceFile_61,SourceFile_61, "SourceFile_61");
		return this;
	}
	public ImportExportStatusPage enterRules_83(WebDriver driver,String Rules_83) {
		BrowserActions.type(driver, inpRules_83,Rules_83, "Rules_83");
		return this;
	}
	public ImportExportStatusPage selectRuleType_76(WebDriver driver,String RuleType_76)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRuleType_76,RuleType_76,"RuleType_76");
		return this;
	}

	/**
	 * Click Export Download Button
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 */

	public ImportExportStatusPage clickExportDownload(WebDriver driver) throws Exception {
		By downloadBy = By.cssSelector("div[id$='Download']");
		int size = BrowserActions.getWebElementSize(driver, downloadBy, "Download", 0.5);
		int randInt = random.nextInt(size);
		By downloadExportBy = By.xpath("//div[contains(@id,'Download')]");
		List<WebElement> webElements = BrowserActions.getWebElements(driver, downloadExportBy, "element Object", 0.5);
		WebElement element = webElements.get(randInt);
		BrowserActions.click(driver, element, 3,"random download button");
		return this;
	}

	/**
	 * Verify the Download file
	 * @author somasundaram.muthu
	 * @param driver
	 * @return 
	 */

	public ImportExportStatusPage verifyDownloadFileExtension(WebDriver driver, String fileName) {

		EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

		String env = configProperty.getProperty("runDesktop");

		if (env.equals("false")) {

			((JavascriptExecutor) driver).executeScript("lambda-file-exists=" + fileName + "html");
		}

		//For local Download
		else {	
			driver.get("chrome://downloads");
			Log.message("Downloads Page Navigated");
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			String filesName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");
			String extension = "";
			int i = fileName.lastIndexOf('.');
			if (i > 0) {
				extension = filesName.substring(i+1);
			}
			if (extension.equalsIgnoreCase("gwrules")) {
				Log.message("Downloaded file extension is gwrules");
			} else {
				Log.message("Downloaded file extension  is not gwrules ");
			}

		}
		return this;
	}

	public class ImportPage extends LoadableComponent<ImportPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='StartRuleImportPopup-fileLabel']", AI = false)
		private WebElement inpFileLabel;

		@IFindBy(how = How.CSS, using = "input[id$='StartRuleImportPopup-File--file']", AI = false)
		private WebElement inpFile;

		@IFindBy(how = How.CSS, using = "#StartRuleImportPopup-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#StartRuleImportPopup-__crumb__", AI = false)
		private WebElement btnReturntoImportExportStatus;

		@IFindBy(how = How.CSS, using = "#StartRuleImportPopup-ImportButton>div[role='button']", AI = false)
		private WebElement btnImport;

		@IFindBy(how = How.CSS, using = "#StartRuleImportPopup-CancelButton>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "div[id$='browseButton']", AI = false)
		private WebElement btnBrowse;

		@IFindBy(how = How.XPATH, using = "//div[text()='Completed']", AI = false)
		private WebElement lblCompleted;

		@IFindBy(how = How.XPATH, using = "//div[text()='100%']", AI = false)
		private WebElement lbl100Percent;

		@IFindBy(how = How.CSS, using = "div[id$='ImportDetails']", AI = false)
		public WebElement btnReview;

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

		@IFindBy(how = How.CSS, using = "div[id$='Name_Input']", AI = false)
		public WebElement lblRuleName;


		public ImportPage(){
		}

		public ImportPage(WebDriver driver){
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
		}public ImportPage enterFileLabel(WebDriver driver,String FileLabel) {
			BrowserActions.type(driver, inpFileLabel,FileLabel, "FileLabel");
			return this;
		}
		public ImportPage clickReturntoImportExportStatus(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoImportExportStatus,"ReturntoImportExportStatus");
			return this;
		}
		public ImportPage clickImport(WebDriver driver)  {
			BrowserActions.click(driver, btnImport,true,"Import");
			return this;
		}
		public ImportPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}

		public ImportPage clickBrowse(WebDriver driver) {
			BrowserActions.click(driver, btnBrowse,"Browse button");
			return this;
		}

		/**
		 * Upload files from our System 
		 * @author somasundaram.muthu
		 * @param driver
		 * @return 
		 */

		public ImportPage fileUpload (WebDriver driver) throws AWTException, InterruptedException {

			EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

			String env = configProperty.getProperty("runDesktop");

			String path = configProperty.getProperty("LT_RESOURCES_UPLOAD_PATH_GW");

			if (env.equals("false")) 

			{
				WebElement addFile = driver.findElement(By.cssSelector("input[id$='StartRuleImportPopup-File--file']"));
				addFile.sendKeys(path);
			}

			//For local Upload
			else {

				String absolutePath = new File("src/main/resources/assessmentMedia/UWRules.gwrules").getAbsolutePath();
				inpFile.sendKeys(absolutePath);
			}
			return this; 
		}

		/**
		 * Verify Status Is completed
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */
		public ImportPage verifyStatusIsCompleted(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblCompleted, "Status");
			return this;
		}

		/**
		 * Verify Progress Is completed
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */
		public ImportPage verifyProgressIsCompleted(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lbl100Percent, "100 percent");
			return this;
		} 

		/**
		 * Click Review Button
		 * @param driver 
		 * @return
		 */
		public ImportPage clickReviewButton(WebDriver driver) {
			BrowserActions.click(driver, btnReview, 3,"Review Button");
			return this;
		}

		/**
		 * Verify File Name Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */
		public ImportPage verifyFileNameIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblFileName, "File Name");
			return this;
		} 

		/**
		 * Verify New Rule Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyNewRuleIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblNewRule, "New Rule");
			return this;
		} 

		/**
		 * Verify New Version Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */
		public ImportPage verifyNewVersionIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblNewVersion, "New Version");
			return this;
		} 

		/**
		 * Verify Rule Deployment Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */
		public ImportPage verifyRuleDeploymentIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblRuleDeployment, "Rule Deployment");
			return this;
		} 
		/**
		 * Verify Versions Conflict Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyVersionsConflictIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblVersionsConflict, "Versions Conflict");
			return this;
		} 
		/**
		 * Verify Imported  Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyImportedIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblImported, "Imported");
			return this;
		} 
		/**
		 * Verify Discard Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyDiscardIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblDiscard, "Discard");
			return this;
		} 
		/**
		 * Verify Applied Edited Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyAppliedEditedIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblAppliedEdited, "Applied Edited");
			return this;
		} 

		/**
		 * Verify Skipped Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifySkippedIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblSkipped, "Skipped");
			return this;
		} 
		/**
		 * Verify State Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyStateIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblState, "State");
			return this;
		} 
		/**
		 * Verify Rule Name Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyRuleNameIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblRuleName, "Rule Name");
			return this;
		} 

		/**
		 * Verify Existing Version Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */

		public ImportPage verifyExistingVersionIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblExistingVersion, "Existing Version");
			return this;
		} 

		/**
		 * Verify Importingv Version Is Display
		 * @author vignesh.ravi
		 * @param driver 
		 * @return
		 */
		public ImportPage verifyImportingvVersionIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblImportingvVersion, "Importing Version");
			return this;
		} 
	}

}
