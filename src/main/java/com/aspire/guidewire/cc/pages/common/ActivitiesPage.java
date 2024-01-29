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

public class ActivitiesPage extends LoadableComponent<ActivitiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public DesktopActivities desktopactivitiesTable;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Insured']", AI = false)
	private WebElement inpInsured_33;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Subject']", AI = false)
	private WebElement inpSubject_103;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_65;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Escalated']", AI = false)
	private WebElement rdbEscalated_75;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_23;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-CaseID']", AI = false)
	private WebElement inpClaim_104;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-DueDate']", AI = false)
	private WebElement inpDue_28;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-State']", AI = false)
	private WebElement drpState_25;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Priority']", AI = false)
	private WebElement drpPriority_42;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-LOB']", AI = false)
	private WebElement drpLOB_60;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Exposure']", AI = false)
	private WebElement inpExposures_70;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_161;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-State']", AI = false)
	private WebElement drpState_157;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Subject']", AI = false)
	private WebElement inpSubject_55;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-DueDate']", AI = false)
	private WebElement inpDue_4;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-LOB']", AI = false)
	private WebElement drpLOB_48;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Escalated']", AI = false)
	private WebElement rdbEscalated_87;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_11;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-CaseID']", AI = false)
	private WebElement inpClaim_116;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-DueDate']", AI = false)
	private WebElement inpDue_16;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Exposure']", AI = false)
	private WebElement inpExposures_58;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-DueDate']", AI = false)
	private WebElement inpDue_100;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Escalated']", AI = false)
	private WebElement rdbEscalated;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Priority']", AI = false)
	private WebElement drpPriority_30;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-State']", AI = false)
	private WebElement drpState_13;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Priority']", AI = false)
	private WebElement drpPriority_162;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-State']", AI = false)
	private WebElement drpState_145;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Subject']", AI = false)
	private WebElement inpSubject_67;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_149;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-LOB']", AI = false)
	private WebElement drpLOB_36;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Priority']", AI = false)
	private WebElement drpPriority_18;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Insured']", AI = false)
	private WebElement inpInsured_57;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-DueDate']", AI = false)
	private WebElement inpDue_40;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_47;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Escalated']", AI = false)
	private WebElement rdbEscalated_51;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-DueDate']", AI = false)
	private WebElement inpDue_112;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Exposure']", AI = false)
	private WebElement inpExposures;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-LOB']", AI = false)
	private WebElement drpLOB_108;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-ExternallyOwned']", AI = false)
	private WebElement rdbExternal;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Exposure']", AI = false)
	private WebElement inpExposures_94;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-CaseID']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_77;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Subject']", AI = false)
	private WebElement inpSubject_31;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Priority']", AI = false)
	private WebElement drpPriority_150;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-State']", AI = false)
	private WebElement drpState_133;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-LOB']", AI = false)
	private WebElement drpLOB_24;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Insured']", AI = false)
	private WebElement inpInsured_45;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_35;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Escalated']", AI = false)
	private WebElement rdbEscalated_63;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Insured']", AI = false)
	private WebElement inpInsured_9;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-DueDate']", AI = false)
	private WebElement inpDue_124;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Exposure']", AI = false)
	private WebElement inpExposures_82;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_89;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Subject']", AI = false)
	private WebElement inpSubject_43;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-State']", AI = false)
	private WebElement drpState_121;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-DueDate']", AI = false)
	private WebElement inpDue_64;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_125;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_ApproveButton>div[role='button']", AI = false)
	private WebElement btnApprove;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Updated']", AI = false)
	private WebElement rdbUpdated_38;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-LOB']", AI = false)
	private WebElement drpLOB_12;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-State']", AI = false)
	private WebElement drpState_61;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-CaseID']", AI = false)
	private WebElement inpClaim_8;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Updated']", AI = false)
	private WebElement rdbUpdated_110;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Insured']", AI = false)
	private WebElement inpInsured_81;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_17;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Insured']", AI = false)
	private WebElement inpInsured_69;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_137;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-DueDate']", AI = false)
	private WebElement inpDue_52;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Subject']", AI = false)
	private WebElement inpSubject_19;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Updated']", AI = false)
	private WebElement rdbUpdated_26;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Subject']", AI = false)
	private WebElement inpSubject_139;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Exposure']", AI = false)
	private WebElement inpExposures_166;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_29;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-DueDate']", AI = false)
	private WebElement inpDue_88;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Escalated']", AI = false)
	private WebElement rdbEscalated_99;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_101;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_41;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Updated']", AI = false)
	private WebElement rdbUpdated_14;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Updated']", AI = false)
	private WebElement rdbUpdated;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Updated']", AI = false)
	private WebElement rdbUpdated_2;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Subject']", AI = false)
	private WebElement inpSubject_127;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-State']", AI = false)
	private WebElement drpState_49;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-CaseID']", AI = false)
	private WebElement inpClaim_92;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Subject']", AI = false)
	private WebElement inpSubject_115;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-DueDate']", AI = false)
	private WebElement inpDue_76;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_53;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_113;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Priority']", AI = false)
	private WebElement drpPriority_6;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-State']", AI = false)
	private WebElement drpState_37;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Insured']", AI = false)
	private WebElement inpInsured_93;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-State']", AI = false)
	private WebElement drpState_169;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-DesktopActivitiesFilter']", AI = false)
	private WebElement drpDesktopActivitiesFilter;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Insured']", AI = false)
	private WebElement inpInsured_165;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Escalated']", AI = false)
	private WebElement rdbEscalated_135;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Updated']", AI = false)
	private WebElement rdbUpdated_74;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-LOB']", AI = false)
	private WebElement drpLOB_168;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Exposure']", AI = false)
	private WebElement inpExposures_130;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_155;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_5;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-LOB']", AI = false)
	private WebElement drpLOB;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_95;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Subject']", AI = false)
	private WebElement inpSubject_7;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-State']", AI = false)
	private WebElement drpState_97;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Escalated']", AI = false)
	private WebElement rdbEscalated_123;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Updated']", AI = false)
	private WebElement rdbUpdated_62;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-LOB']", AI = false)
	private WebElement drpLOB_156;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Updated']", AI = false)
	private WebElement rdbUpdated_146;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_143;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Insured']", AI = false)
	private WebElement inpInsured_153;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-CaseID']", AI = false)
	private WebElement inpClaim_80;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-CaseID']", AI = false)
	private WebElement inpClaim_164;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Subject']", AI = false)
	private WebElement inpSubject_163;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-State']", AI = false)
	private WebElement drpState_85;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Escalated']", AI = false)
	private WebElement rdbEscalated_111;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Updated']", AI = false)
	private WebElement rdbUpdated_50;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Exposure']", AI = false)
	private WebElement inpExposures_10;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-CaseID']", AI = false)
	private WebElement inpClaim_56;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Updated']", AI = false)
	private WebElement rdbUpdated_134;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Insured']", AI = false)
	private WebElement inpInsured_141;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Exposure']", AI = false)
	private WebElement inpExposures_154;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-DueDate']", AI = false)
	private WebElement inpDue;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-State']", AI = false)
	private WebElement drpState_73;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-CaseID']", AI = false)
	private WebElement inpClaim_68;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Priority']", AI = false)
	private WebElement drpPriority_90;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Updated']", AI = false)
	private WebElement rdbUpdated_122;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Exposure']", AI = false)
	private WebElement inpExposures_142;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Subject']", AI = false)
	private WebElement inpSubject_151;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_167;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Escalated']", AI = false)
	private WebElement rdbEscalated_3;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_119;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-DueDate']", AI = false)
	private WebElement inpDue_136;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Insured']", AI = false)
	private WebElement inpInsured;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-LOB']", AI = false)
	private WebElement drpLOB_120;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Insured']", AI = false)
	private WebElement inpInsured_129;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-CaseID']", AI = false)
	private WebElement inpClaim_32;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Exposure']", AI = false)
	private WebElement inpExposures_34;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Priority']", AI = false)
	private WebElement drpPriority_138;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Subject']", AI = false)
	private WebElement inpSubject_91;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Escalated']", AI = false)
	private WebElement rdbEscalated_27;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_71;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_107;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-CaseID']", AI = false)
	private WebElement inpClaim_152;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Insured']", AI = false)
	private WebElement inpInsured_117;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_59;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-DueDate']", AI = false)
	private WebElement inpDue_148;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Exposure']", AI = false)
	private WebElement inpExposures_22;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_SkipButton>div[role='button']", AI = false)
	private WebElement btnSkip;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-CaseID']", AI = false)
	private WebElement inpClaim_44;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Priority']", AI = false)
	private WebElement drpPriority_126;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-State']", AI = false)
	private WebElement drpState_109;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Priority']", AI = false)
	private WebElement drpPriority_78;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-LOB']", AI = false)
	private WebElement drpLOB_96;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Escalated']", AI = false)
	private WebElement rdbEscalated_39;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Insured']", AI = false)
	private WebElement inpInsured_105;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Escalated']", AI = false)
	private WebElement rdbEscalated_159;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-CaseID']", AI = false)
	private WebElement inpClaim_128;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Updated']", AI = false)
	private WebElement rdbUpdated_98;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-LOB']", AI = false)
	private WebElement drpLOB_144;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_RejectButton>div[role='button']", AI = false)
	private WebElement btnReject;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Exposure']", AI = false)
	private WebElement inpExposures_46;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Exposure']", AI = false)
	private WebElement inpExposures_118;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Priority']", AI = false)
	private WebElement drpPriority_114;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-DesktopActivitiesFilter']", AI = false)
	private WebElement drpDesktopActivitiesFilter_1;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-LOB']", AI = false)
	private WebElement drpLOB_84;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Priority']", AI = false)
	private WebElement drpPriority_66;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Insured']", AI = false)
	private WebElement inpInsured_21;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_131;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Subject']", AI = false)
	private WebElement inpSubject_79;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-DueDate']", AI = false)
	private WebElement inpDue_160;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Escalated']", AI = false)
	private WebElement rdbEscalated_147;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Updated']", AI = false)
	private WebElement rdbUpdated_158;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Updated']", AI = false)
	private WebElement rdbUpdated_86;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-LOB']", AI = false)
	private WebElement drpLOB_132;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_CompleteButton>div[role='button']", AI = false)
	private WebElement btnComplete;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-CaseID']", AI = false)
	private WebElement inpClaim_20;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Exposure']", AI = false)
	private WebElement inpExposures_106;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Priority']", AI = false)
	private WebElement drpPriority_102;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-LOB']", AI = false)
	private WebElement drpLOB_72;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Priority']", AI = false)
	private WebElement drpPriority_54;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_83;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Escalated']", AI = false)
	private WebElement rdbEscalated_15;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-CaseID']", AI = false)
	private WebElement inpClaim_140;
	
	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar'] div[id='DesktopActivities-DesktopActivitiesScreen-0']", AI = false)
	private WebElement ttlActivities;//DesktopActivities-DesktopActivitiesScreen-0
	
	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-_Checkbox']", AI = false)
	private WebElement inpActivity_1;
	
	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-_Checkbox']", AI = false)
	private WebElement inpActivity_2;
	
	@IFindBy(how = How.CSS, using = "div[id$='-0-Subject'] div[id$='Subject_button']", AI = false)
	private WebElement lnkSubject;

	public ActivitiesPage(){
	}

	public ActivitiesPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		desktopactivitiesTable = new DesktopActivities();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlActivities))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public ActivitiesPage enterInsured_33(WebDriver driver,String Insured_33) {
		            BrowserActions.type(driver, inpInsured_33,Insured_33, "Insured_33");
			        return this;
           }
public ActivitiesPage enterSubject_103(WebDriver driver,String Subject_103) {
		            BrowserActions.type(driver, inpSubject_103,Subject_103, "Subject_103");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_65(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_65,"DueDateIcon_65");
				    return this;
			}
public ActivitiesPage clickEscalated_75(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_75,"Escalated_75");
				    return this;
			}
public ActivitiesPage clickExternal_23(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_23,"External_23");
				    return this;
			}
public ActivitiesPage enterClaim_104(WebDriver driver,String Claim_104) {
		            BrowserActions.type(driver, inpClaim_104,Claim_104, "Claim_104");
			        return this;
           }
public ActivitiesPage enterDue_28(WebDriver driver,String Due_28) {
		            BrowserActions.type(driver, inpDue_28,Due_28, "Due_28");
			        return this;
           }
public ActivitiesPage selectState_25(WebDriver driver,String State_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_25,State_25,"State_25");
				    return this;
			}
public ActivitiesPage selectPriority_42(WebDriver driver,String Priority_42)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_42,Priority_42,"Priority_42");
				    return this;
			}
public ActivitiesPage selectLOB_60(WebDriver driver,String LOB_60)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_60,LOB_60,"LOB_60");
				    return this;
			}
public ActivitiesPage enterExposures_70(WebDriver driver,String Exposures_70) {
		            BrowserActions.type(driver, inpExposures_70,Exposures_70, "Exposures_70");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_161(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_161,"DueDateIcon_161");
				    return this;
			}
public ActivitiesPage selectState_157(WebDriver driver,String State_157)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_157,State_157,"State_157");
				    return this;
			}
public ActivitiesPage enterSubject_55(WebDriver driver,String Subject_55) {
		            BrowserActions.type(driver, inpSubject_55,Subject_55, "Subject_55");
			        return this;
           }
public ActivitiesPage enterDue_4(WebDriver driver,String Due_4) {
		            BrowserActions.type(driver, inpDue_4,Due_4, "Due_4");
			        return this;
           }
public ActivitiesPage selectLOB_48(WebDriver driver,String LOB_48)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_48,LOB_48,"LOB_48");
				    return this;
			}
public ActivitiesPage clickEscalated_87(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_87,"Escalated_87");
				    return this;
			}
public ActivitiesPage clickExternal_11(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_11,"External_11");
				    return this;
			}
public ActivitiesPage enterClaim_116(WebDriver driver,String Claim_116) {
		            BrowserActions.type(driver, inpClaim_116,Claim_116, "Claim_116");
			        return this;
           }
public ActivitiesPage enterDue_16(WebDriver driver,String Due_16) {
		            BrowserActions.type(driver, inpDue_16,Due_16, "Due_16");
			        return this;
           }
public ActivitiesPage enterExposures_58(WebDriver driver,String Exposures_58) {
		            BrowserActions.type(driver, inpExposures_58,Exposures_58, "Exposures_58");
			        return this;
           }
public ActivitiesPage enterDue_100(WebDriver driver,String Due_100) {
		            BrowserActions.type(driver, inpDue_100,Due_100, "Due_100");
			        return this;
           }
public ActivitiesPage clickEscalated(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated,"Escalated");
				    return this;
			}
public ActivitiesPage selectPriority_30(WebDriver driver,String Priority_30)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_30,Priority_30,"Priority_30");
				    return this;
			}
public ActivitiesPage selectState_13(WebDriver driver,String State_13)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_13,State_13,"State_13");
				    return this;
			}
public ActivitiesPage selectPriority_162(WebDriver driver,String Priority_162)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_162,Priority_162,"Priority_162");
				    return this;
			}
public ActivitiesPage selectState_145(WebDriver driver,String State_145)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_145,State_145,"State_145");
				    return this;
			}
public ActivitiesPage enterSubject_67(WebDriver driver,String Subject_67) {
		            BrowserActions.type(driver, inpSubject_67,Subject_67, "Subject_67");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_149(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_149,"DueDateIcon_149");
				    return this;
			}
public ActivitiesPage selectLOB_36(WebDriver driver,String LOB_36)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_36,LOB_36,"LOB_36");
				    return this;
			}
public ActivitiesPage selectPriority_18(WebDriver driver,String Priority_18)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_18,Priority_18,"Priority_18");
				    return this;
			}
public ActivitiesPage enterInsured_57(WebDriver driver,String Insured_57) {
		            BrowserActions.type(driver, inpInsured_57,Insured_57, "Insured_57");
			        return this;
           }
public ActivitiesPage enterDue_40(WebDriver driver,String Due_40) {
		            BrowserActions.type(driver, inpDue_40,Due_40, "Due_40");
			        return this;
           }
public ActivitiesPage clickExternal_47(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_47,"External_47");
				    return this;
			}
public ActivitiesPage clickEscalated_51(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_51,"Escalated_51");
				    return this;
			}
public ActivitiesPage enterDue_112(WebDriver driver,String Due_112) {
		            BrowserActions.type(driver, inpDue_112,Due_112, "Due_112");
			        return this;
           }
public ActivitiesPage enterExposures(WebDriver driver,String Exposures) {
		            BrowserActions.type(driver, inpExposures,Exposures, "Exposures");
			        return this;
           }
public ActivitiesPage selectLOB_108(WebDriver driver,String LOB_108)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_108,LOB_108,"LOB_108");
				    return this;
			}
public ActivitiesPage clickExternal(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal,"External");
				    return this;
			}
public ActivitiesPage enterExposures_94(WebDriver driver,String Exposures_94) {
		            BrowserActions.type(driver, inpExposures_94,Exposures_94, "Exposures_94");
			        return this;
           }
public ActivitiesPage enterClaim(WebDriver driver,String Claim) {
		            BrowserActions.type(driver, inpClaim,Claim, "Claim");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_77(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_77,"DueDateIcon_77");
				    return this;
			}
public ActivitiesPage enterSubject_31(WebDriver driver,String Subject_31) {
		            BrowserActions.type(driver, inpSubject_31,Subject_31, "Subject_31");
			        return this;
           }
public ActivitiesPage selectPriority_150(WebDriver driver,String Priority_150)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_150,Priority_150,"Priority_150");
				    return this;
			}
public ActivitiesPage selectState_133(WebDriver driver,String State_133)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_133,State_133,"State_133");
				    return this;
			}
public ActivitiesPage selectLOB_24(WebDriver driver,String LOB_24)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_24,LOB_24,"LOB_24");
				    return this;
			}
public ActivitiesPage enterInsured_45(WebDriver driver,String Insured_45) {
		            BrowserActions.type(driver, inpInsured_45,Insured_45, "Insured_45");
			        return this;
           }
public ActivitiesPage clickExternal_35(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_35,"External_35");
				    return this;
			}
public ActivitiesPage clickEscalated_63(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_63,"Escalated_63");
				    return this;
			}
public ActivitiesPage enterInsured_9(WebDriver driver,String Insured_9) {
		            BrowserActions.type(driver, inpInsured_9,Insured_9, "Insured_9");
			        return this;
           }
public ActivitiesPage enterDue_124(WebDriver driver,String Due_124) {
		            BrowserActions.type(driver, inpDue_124,Due_124, "Due_124");
			        return this;
           }
public ActivitiesPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public ActivitiesPage enterExposures_82(WebDriver driver,String Exposures_82) {
		            BrowserActions.type(driver, inpExposures_82,Exposures_82, "Exposures_82");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_89(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_89,"DueDateIcon_89");
				    return this;
			}
public ActivitiesPage enterSubject_43(WebDriver driver,String Subject_43) {
		            BrowserActions.type(driver, inpSubject_43,Subject_43, "Subject_43");
			        return this;
           }
public ActivitiesPage selectState_121(WebDriver driver,String State_121)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_121,State_121,"State_121");
				    return this;
			}
public ActivitiesPage enterDue_64(WebDriver driver,String Due_64) {
		            BrowserActions.type(driver, inpDue_64,Due_64, "Due_64");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_125(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_125,"DueDateIcon_125");
				    return this;
			}
public ActivitiesPage clickApprove(WebDriver driver)  {
					BrowserActions.click(driver, btnApprove,"Approve");
				    return this;
			}
public ActivitiesPage clickUpdated_38(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_38,"Updated_38");
				    return this;
			}
public ActivitiesPage selectLOB_12(WebDriver driver,String LOB_12)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_12,LOB_12,"LOB_12");
				    return this;
			}
public ActivitiesPage selectState_61(WebDriver driver,String State_61)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_61,State_61,"State_61");
				    return this;
			}
public ActivitiesPage enterClaim_8(WebDriver driver,String Claim_8) {
		            BrowserActions.type(driver, inpClaim_8,Claim_8, "Claim_8");
			        return this;
           }
public ActivitiesPage clickUpdated_110(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_110,"Updated_110");
				    return this;
			}
public ActivitiesPage enterInsured_81(WebDriver driver,String Insured_81) {
		            BrowserActions.type(driver, inpInsured_81,Insured_81, "Insured_81");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_17(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_17,"DueDateIcon_17");
				    return this;
			}
public ActivitiesPage enterInsured_69(WebDriver driver,String Insured_69) {
		            BrowserActions.type(driver, inpInsured_69,Insured_69, "Insured_69");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_137(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_137,"DueDateIcon_137");
				    return this;
			}
public ActivitiesPage enterDue_52(WebDriver driver,String Due_52) {
		            BrowserActions.type(driver, inpDue_52,Due_52, "Due_52");
			        return this;
           }
public ActivitiesPage enterSubject_19(WebDriver driver,String Subject_19) {
		            BrowserActions.type(driver, inpSubject_19,Subject_19, "Subject_19");
			        return this;
           }
public ActivitiesPage clickUpdated_26(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_26,"Updated_26");
				    return this;
			}
public ActivitiesPage enterSubject_139(WebDriver driver,String Subject_139) {
		            BrowserActions.type(driver, inpSubject_139,Subject_139, "Subject_139");
			        return this;
           }
public ActivitiesPage enterExposures_166(WebDriver driver,String Exposures_166) {
		            BrowserActions.type(driver, inpExposures_166,Exposures_166, "Exposures_166");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_29(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_29,"DueDateIcon_29");
				    return this;
			}
public ActivitiesPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
public ActivitiesPage enterDue_88(WebDriver driver,String Due_88) {
		            BrowserActions.type(driver, inpDue_88,Due_88, "Due_88");
			        return this;
           }
public ActivitiesPage clickEscalated_99(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_99,"Escalated_99");
				    return this;
			}
public ActivitiesPage clickDueDateIcon_101(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_101,"DueDateIcon_101");
				    return this;
			}
public ActivitiesPage clickDueDateIcon_41(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_41,"DueDateIcon_41");
				    return this;
			}
public ActivitiesPage clickUpdated_14(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_14,"Updated_14");
				    return this;
			}
public ActivitiesPage clickUpdated(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated,"Updated");
				    return this;
			}
public ActivitiesPage clickUpdated_2(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_2,"Updated_2");
				    return this;
			}
public ActivitiesPage enterSubject_127(WebDriver driver,String Subject_127) {
		            BrowserActions.type(driver, inpSubject_127,Subject_127, "Subject_127");
			        return this;
           }
public ActivitiesPage selectState_49(WebDriver driver,String State_49)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_49,State_49,"State_49");
				    return this;
			}
public ActivitiesPage enterClaim_92(WebDriver driver,String Claim_92) {
		            BrowserActions.type(driver, inpClaim_92,Claim_92, "Claim_92");
			        return this;
           }
public ActivitiesPage enterSubject_115(WebDriver driver,String Subject_115) {
		            BrowserActions.type(driver, inpSubject_115,Subject_115, "Subject_115");
			        return this;
           }
public ActivitiesPage enterDue_76(WebDriver driver,String Due_76) {
		            BrowserActions.type(driver, inpDue_76,Due_76, "Due_76");
			        return this;
           }
public ActivitiesPage clickDueDateIcon_53(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_53,"DueDateIcon_53");
				    return this;
			}
public ActivitiesPage clickDueDateIcon_113(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_113,"DueDateIcon_113");
				    return this;
			}
public ActivitiesPage selectPriority_6(WebDriver driver,String Priority_6)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_6,Priority_6,"Priority_6");
				    return this;
			}
public ActivitiesPage selectState_37(WebDriver driver,String State_37)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_37,State_37,"State_37");
				    return this;
			}
public ActivitiesPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public ActivitiesPage enterInsured_93(WebDriver driver,String Insured_93) {
		            BrowserActions.type(driver, inpInsured_93,Insured_93, "Insured_93");
			        return this;
           }
public ActivitiesPage selectState_169(WebDriver driver,String State_169)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_169,State_169,"State_169");
				    return this;
			}
public ActivitiesPage selectDesktopActivitiesFilter(WebDriver driver,String DesktopActivitiesFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDesktopActivitiesFilter,DesktopActivitiesFilter,true,1,"DesktopActivitiesFilter");
				    return this;
			}
public ActivitiesPage enterInsured_165(WebDriver driver,String Insured_165) {
		            BrowserActions.type(driver, inpInsured_165,Insured_165, "Insured_165");
			        return this;
           }
public ActivitiesPage clickEscalated_135(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_135,"Escalated_135");
				    return this;
			}
public ActivitiesPage clickUpdated_74(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_74,"Updated_74");
				    return this;
			}
public ActivitiesPage selectLOB_168(WebDriver driver,String LOB_168)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_168,LOB_168,"LOB_168");
				    return this;
			}
public ActivitiesPage enterExposures_130(WebDriver driver,String Exposures_130) {
		            BrowserActions.type(driver, inpExposures_130,Exposures_130, "Exposures_130");
			        return this;
           }
public ActivitiesPage clickExternal_155(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_155,"External_155");
				    return this;
			}
public ActivitiesPage clickDueDateIcon_5(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_5,"DueDateIcon_5");
				    return this;
			}
public ActivitiesPage selectLOB(WebDriver driver,String LOB)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB,LOB,"LOB");
				    return this;
			}
public ActivitiesPage clickExternal_95(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_95,"External_95");
				    return this;
			}
public ActivitiesPage enterSubject_7(WebDriver driver,String Subject_7) {
		            BrowserActions.type(driver, inpSubject_7,Subject_7, "Subject_7");
			        return this;
           }
public ActivitiesPage selectState_97(WebDriver driver,String State_97)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_97,State_97,"State_97");
				    return this;
			}
public ActivitiesPage clickEscalated_123(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_123,"Escalated_123");
				    return this;
			}
public ActivitiesPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public ActivitiesPage clickUpdated_62(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_62,"Updated_62");
				    return this;
			}
public ActivitiesPage selectLOB_156(WebDriver driver,String LOB_156)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_156,LOB_156,"LOB_156");
				    return this;
			}
public ActivitiesPage clickUpdated_146(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_146,"Updated_146");
				    return this;
			}
public ActivitiesPage clickExternal_143(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_143,"External_143");
				    return this;
			}
public ActivitiesPage enterInsured_153(WebDriver driver,String Insured_153) {
		            BrowserActions.type(driver, inpInsured_153,Insured_153, "Insured_153");
			        return this;
           }
public ActivitiesPage enterClaim_80(WebDriver driver,String Claim_80) {
		            BrowserActions.type(driver, inpClaim_80,Claim_80, "Claim_80");
			        return this;
           }
public ActivitiesPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public ActivitiesPage enterClaim_164(WebDriver driver,String Claim_164) {
		            BrowserActions.type(driver, inpClaim_164,Claim_164, "Claim_164");
			        return this;
           }
public ActivitiesPage enterSubject_163(WebDriver driver,String Subject_163) {
		            BrowserActions.type(driver, inpSubject_163,Subject_163, "Subject_163");
			        return this;
           }
public ActivitiesPage selectState_85(WebDriver driver,String State_85)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_85,State_85,"State_85");
				    return this;
			}
public ActivitiesPage clickEscalated_111(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_111,"Escalated_111");
				    return this;
			}
public ActivitiesPage clickUpdated_50(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_50,"Updated_50");
				    return this;
			}
public ActivitiesPage enterExposures_10(WebDriver driver,String Exposures_10) {
		            BrowserActions.type(driver, inpExposures_10,Exposures_10, "Exposures_10");
			        return this;
           }
public ActivitiesPage enterClaim_56(WebDriver driver,String Claim_56) {
		            BrowserActions.type(driver, inpClaim_56,Claim_56, "Claim_56");
			        return this;
           }
public ActivitiesPage clickUpdated_134(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_134,"Updated_134");
				    return this;
			}
public ActivitiesPage enterInsured_141(WebDriver driver,String Insured_141) {
		            BrowserActions.type(driver, inpInsured_141,Insured_141, "Insured_141");
			        return this;
           }
public ActivitiesPage enterExposures_154(WebDriver driver,String Exposures_154) {
		            BrowserActions.type(driver, inpExposures_154,Exposures_154, "Exposures_154");
			        return this;
           }
public ActivitiesPage enterDue(WebDriver driver,String Due) {
		            BrowserActions.type(driver, inpDue,Due, "Due");
			        return this;
           }
public ActivitiesPage selectState_73(WebDriver driver,String State_73)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_73,State_73,"State_73");
				    return this;
			}
public ActivitiesPage enterClaim_68(WebDriver driver,String Claim_68) {
		            BrowserActions.type(driver, inpClaim_68,Claim_68, "Claim_68");
			        return this;
           }
public ActivitiesPage selectPriority_90(WebDriver driver,String Priority_90)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_90,Priority_90,"Priority_90");
				    return this;
			}
public ActivitiesPage clickUpdated_122(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_122,"Updated_122");
				    return this;
			}
public ActivitiesPage enterExposures_142(WebDriver driver,String Exposures_142) {
		            BrowserActions.type(driver, inpExposures_142,Exposures_142, "Exposures_142");
			        return this;
           }
public ActivitiesPage enterSubject_151(WebDriver driver,String Subject_151) {
		            BrowserActions.type(driver, inpSubject_151,Subject_151, "Subject_151");
			        return this;
           }
public ActivitiesPage clickExternal_167(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_167,"External_167");
				    return this;
			}
public ActivitiesPage clickEscalated_3(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_3,"Escalated_3");
				    return this;
			}
public ActivitiesPage clickExternal_119(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_119,"External_119");
				    return this;
			}
public ActivitiesPage enterDue_136(WebDriver driver,String Due_136) {
		            BrowserActions.type(driver, inpDue_136,Due_136, "Due_136");
			        return this;
           }
public ActivitiesPage enterInsured(WebDriver driver,String Insured) {
		            BrowserActions.type(driver, inpInsured,Insured, "Insured");
			        return this;
           }
public ActivitiesPage selectLOB_120(WebDriver driver,String LOB_120)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_120,LOB_120,"LOB_120");
				    return this;
			}
public ActivitiesPage enterInsured_129(WebDriver driver,String Insured_129) {
		            BrowserActions.type(driver, inpInsured_129,Insured_129, "Insured_129");
			        return this;
           }
public ActivitiesPage enterClaim_32(WebDriver driver,String Claim_32) {
		            BrowserActions.type(driver, inpClaim_32,Claim_32, "Claim_32");
			        return this;
           }
public ActivitiesPage enterExposures_34(WebDriver driver,String Exposures_34) {
		            BrowserActions.type(driver, inpExposures_34,Exposures_34, "Exposures_34");
			        return this;
           }
public ActivitiesPage selectPriority_138(WebDriver driver,String Priority_138)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_138,Priority_138,"Priority_138");
				    return this;
			}
public ActivitiesPage enterSubject_91(WebDriver driver,String Subject_91) {
		            BrowserActions.type(driver, inpSubject_91,Subject_91, "Subject_91");
			        return this;
           }
public ActivitiesPage clickEscalated_27(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_27,"Escalated_27");
				    return this;
			}
public ActivitiesPage clickExternal_71(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_71,"External_71");
				    return this;
			}
public ActivitiesPage clickExternal_107(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_107,"External_107");
				    return this;
			}
public ActivitiesPage enterClaim_152(WebDriver driver,String Claim_152) {
		            BrowserActions.type(driver, inpClaim_152,Claim_152, "Claim_152");
			        return this;
           }
public ActivitiesPage enterInsured_117(WebDriver driver,String Insured_117) {
		            BrowserActions.type(driver, inpInsured_117,Insured_117, "Insured_117");
			        return this;
           }
public ActivitiesPage clickExternal_59(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_59,"External_59");
				    return this;
			}
public ActivitiesPage enterDue_148(WebDriver driver,String Due_148) {
		            BrowserActions.type(driver, inpDue_148,Due_148, "Due_148");
			        return this;
           }
public ActivitiesPage enterExposures_22(WebDriver driver,String Exposures_22) {
		            BrowserActions.type(driver, inpExposures_22,Exposures_22, "Exposures_22");
			        return this;
           }
public ActivitiesPage clickSkip(WebDriver driver)  {
					BrowserActions.click(driver, btnSkip,"Skip");
				    return this;
			}
public ActivitiesPage enterClaim_44(WebDriver driver,String Claim_44) {
		            BrowserActions.type(driver, inpClaim_44,Claim_44, "Claim_44");
			        return this;
           }
public ActivitiesPage selectPriority_126(WebDriver driver,String Priority_126)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_126,Priority_126,"Priority_126");
				    return this;
			}
public ActivitiesPage selectState_109(WebDriver driver,String State_109)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_109,State_109,"State_109");
				    return this;
			}
public ActivitiesPage selectPriority_78(WebDriver driver,String Priority_78)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_78,Priority_78,"Priority_78");
				    return this;
			}
public ActivitiesPage selectLOB_96(WebDriver driver,String LOB_96)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_96,LOB_96,"LOB_96");
				    return this;
			}
public ActivitiesPage clickEscalated_39(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_39,"Escalated_39");
				    return this;
			}
public ActivitiesPage enterInsured_105(WebDriver driver,String Insured_105) {
		            BrowserActions.type(driver, inpInsured_105,Insured_105, "Insured_105");
			        return this;
           }
public ActivitiesPage clickDueDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon,"DueDateIcon");
				    return this;
			}
public ActivitiesPage clickEscalated_159(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_159,"Escalated_159");
				    return this;
			}
public ActivitiesPage enterClaim_128(WebDriver driver,String Claim_128) {
		            BrowserActions.type(driver, inpClaim_128,Claim_128, "Claim_128");
			        return this;
           }
public ActivitiesPage clickUpdated_98(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_98,"Updated_98");
				    return this;
			}
public ActivitiesPage selectLOB_144(WebDriver driver,String LOB_144)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_144,LOB_144,"LOB_144");
				    return this;
			}
public ActivitiesPage clickReject(WebDriver driver)  {
					BrowserActions.click(driver, btnReject,"Reject");
				    return this;
			}
public ActivitiesPage enterExposures_46(WebDriver driver,String Exposures_46) {
		            BrowserActions.type(driver, inpExposures_46,Exposures_46, "Exposures_46");
			        return this;
           }
public ActivitiesPage enterExposures_118(WebDriver driver,String Exposures_118) {
		            BrowserActions.type(driver, inpExposures_118,Exposures_118, "Exposures_118");
			        return this;
           }
public ActivitiesPage selectPriority_114(WebDriver driver,String Priority_114)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_114,Priority_114,"Priority_114");
				    return this;
			}
public ActivitiesPage selectDesktopActivitiesFilter_1(WebDriver driver,String DesktopActivitiesFilter_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDesktopActivitiesFilter_1,DesktopActivitiesFilter_1,"DesktopActivitiesFilter_1");
				    return this;
			}
public ActivitiesPage selectLOB_84(WebDriver driver,String LOB_84)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_84,LOB_84,"LOB_84");
				    return this;
			}
public ActivitiesPage selectPriority_66(WebDriver driver,String Priority_66)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_66,Priority_66,"Priority_66");
				    return this;
			}
public ActivitiesPage enterInsured_21(WebDriver driver,String Insured_21) {
		            BrowserActions.type(driver, inpInsured_21,Insured_21, "Insured_21");
			        return this;
           }
public ActivitiesPage clickExternal_131(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_131,"External_131");
				    return this;
			}
public ActivitiesPage enterSubject_79(WebDriver driver,String Subject_79) {
		            BrowserActions.type(driver, inpSubject_79,Subject_79, "Subject_79");
			        return this;
           }
public ActivitiesPage enterDue_160(WebDriver driver,String Due_160) {
		            BrowserActions.type(driver, inpDue_160,Due_160, "Due_160");
			        return this;
           }
public ActivitiesPage clickEscalated_147(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_147,"Escalated_147");
				    return this;
			}
public ActivitiesPage clickUpdated_158(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_158,"Updated_158");
				    return this;
			}
public ActivitiesPage clickUpdated_86(WebDriver driver)  {
					BrowserActions.click(driver, rdbUpdated_86,"Updated_86");
				    return this;
			}
public ActivitiesPage selectLOB_132(WebDriver driver,String LOB_132)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_132,LOB_132,"LOB_132");
				    return this;
			}
public ActivitiesPage clickComplete(WebDriver driver)  {
					BrowserActions.click(driver, btnComplete,"Complete");
				    return this;
			}
public ActivitiesPage enterClaim_20(WebDriver driver,String Claim_20) {
		            BrowserActions.type(driver, inpClaim_20,Claim_20, "Claim_20");
			        return this;
           }
public ActivitiesPage enterExposures_106(WebDriver driver,String Exposures_106) {
		            BrowserActions.type(driver, inpExposures_106,Exposures_106, "Exposures_106");
			        return this;
           }
public ActivitiesPage selectPriority_102(WebDriver driver,String Priority_102)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_102,Priority_102,"Priority_102");
				    return this;
			}
public ActivitiesPage selectLOB_72(WebDriver driver,String LOB_72)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_72,LOB_72,"LOB_72");
				    return this;
			}
public ActivitiesPage selectPriority_54(WebDriver driver,String Priority_54)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_54,Priority_54,"Priority_54");
				    return this;
			}
public ActivitiesPage clickExternal_83(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_83,"External_83");
				    return this;
			}
public ActivitiesPage clickEscalated_15(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_15,"Escalated_15");
				    return this;
			}
public ActivitiesPage enterClaim_140(WebDriver driver,String Claim_140) {
		            BrowserActions.type(driver, inpClaim_140,Claim_140, "Claim_140");
			        return this;
           }
public ActivitiesPage selectActivity_1(WebDriver driver) {
	BrowserActions.click(driver, inpActivity_1, "Activity_1");
	return this;
}
public ActivitiesPage selectActivity_2(WebDriver driver) {
	BrowserActions.click(driver, inpActivity_2, "Activity_2");
	return this;
}
public WorkplanPage clickActivity(WebDriver driver) {
	BrowserActions.click(driver, lnkSubject,1, "Subject");
	return new WorkplanPage(driver).get();
	
}
}
