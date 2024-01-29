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

public class MyActivitiesPage extends LoadableComponent<MyActivitiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Subject']", AI = false)
	public WebElement inpSubject_47;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_143;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_90;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_122;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-DueDate']", AI = false)
	public WebElement inpDueDate_17;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Insured']", AI = false)
	public WebElement inpAccountHolder_62;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-State']", AI = false)
	public WebElement drpState_27;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-SearchResultID']", AI = false)
	public WebElement inpID_87;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_15;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Priority']", AI = false)
	public WebElement drpPriority_45;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Priority']", AI = false)
	public WebElement drpPriority_175;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-State']", AI = false)
	public WebElement drpState_157;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_156;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-activitiesFilter']", AI = false)
	public WebElement drpActivitiesFilter;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Escalated']", AI = false)
	public WebElement rdbEscalated_81;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Insured']", AI = false)
	public WebElement inpAccountHolder_75;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Product']", AI = false)
	public WebElement inpProduct_180;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Escalated']", AI = false)
	public WebElement rdbEscalated;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-State']", AI = false)
	public WebElement drpState_14;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Subject']", AI = false)
	public WebElement inpSubject_60;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Priority']", AI = false)
	public WebElement drpPriority_32;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Priority']", AI = false)
	public WebElement drpPriority_162;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Status']", AI = false)
	public WebElement drpStatus_137;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-State']", AI = false)
	public WebElement drpState_144;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Priority']", AI = false)
	public WebElement drpPriority_19;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Escalated']", AI = false)
	public WebElement rdbEscalated_55;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-DueDate']", AI = false)
	public WebElement inpDueDate_30;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_168;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_169;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Insured']", AI = false)
	public WebElement inpAccountHolder_88;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_135;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Product']", AI = false)
	public WebElement inpProduct;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_18;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Subject']", AI = false)
	public WebElement inpSubject_34;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Status']", AI = false)
	public WebElement drpStatus_124;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-State']", AI = false)
	public WebElement drpState_131;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Escalated']", AI = false)
	public WebElement rdbEscalated_68;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Status']", AI = false)
	public WebElement drpStatus_98;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-DueDate']", AI = false)
	public WebElement inpDueDate_43;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-activitiesFilter']", AI = false)
	public WebElement drpActivitiesFilter_1;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-SearchResultID']", AI = false)
	public WebElement inpID_100;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Status']", AI = false)
	public WebElement drpStatus_111;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_148;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Priority']", AI = false)
	public WebElement drpPriority_149;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_181;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_28;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Status']", AI = false)
	public WebElement drpStatus_7;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_51;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_161;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-DueDate']", AI = false)
	public WebElement inpDueDate_56;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_104;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Product']", AI = false)
	public WebElement inpProduct_37;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Insured']", AI = false)
	public WebElement inpAccountHolder_23;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_31;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-SearchResultID']", AI = false)
	public WebElement inpID_48;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-SearchResultID']", AI = false)
	public WebElement inpID_113;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_65;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-State']", AI = false)
	public WebElement drpState_66;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-State']", AI = false)
	public WebElement drpState_53;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_117;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-DueDate']", AI = false)
	public WebElement inpDueDate_69;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Subject']", AI = false)
	public WebElement inpSubject_138;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_174;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Product']", AI = false)
	public WebElement inpProduct_141;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Product']", AI = false)
	public WebElement inpProduct_24;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-SearchResultID']", AI = false)
	public WebElement inpID_126;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_78;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Insured']", AI = false)
	public WebElement inpAccountHolder_36;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Subject']", AI = false)
	public WebElement inpSubject_21;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_77;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Subject']", AI = false)
	public WebElement inpSubject_125;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-State']", AI = false)
	public WebElement drpState_183;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Escalated']", AI = false)
	public WebElement rdbEscalated_94;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-State']", AI = false)
	public WebElement drpState_40;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Product']", AI = false)
	public WebElement inpProduct_11;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Insured']", AI = false)
	public WebElement inpAccountHolder_49;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_57;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-SearchResultID']", AI = false)
	public WebElement inpID_139;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Product']", AI = false)
	public WebElement inpProduct_154;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-SearchResultID']", AI = false)
	public WebElement inpID_61;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Insured']", AI = false)
	public WebElement inpAccountHolder_166;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_130;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_CanceledActivitiesAlertBar-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_64;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-DueDate']", AI = false)
	public WebElement inpDueDate_82;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Subject']", AI = false)
	public WebElement inpSubject_112;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Insured']", AI = false)
	public WebElement inpAccountHolder;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-State']", AI = false)
	public WebElement drpState_170;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Priority']", AI = false)
	public WebElement drpPriority_6;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-SearchResultID']", AI = false)
	public WebElement inpID_9;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_44;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Product']", AI = false)
	public WebElement inpProduct_167;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV_tb-DesktopActivities_AssignButton>div[role='button']", AI = false)
	public WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-SearchResultID']", AI = false)
	public WebElement inpID_74;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_91;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Insured']", AI = false)
	public WebElement inpAccountHolder_179;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Insured']", AI = false)
	public WebElement inpAccountHolder_153;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-DueDate']", AI = false)
	public WebElement inpDueDate_95;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Status']", AI = false)
	public WebElement drpStatus_46;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_103;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-AssignedBy']", AI = false)
	public WebElement inpAssignedBy;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_70;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Escalated']", AI = false)
	public WebElement rdbEscalated_133;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_158;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_93;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Product']", AI = false)
	public WebElement inpProduct_76;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-DueDate']", AI = false)
	public WebElement inpDueDate_108;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-SearchResultID']", AI = false)
	public WebElement inpID_152;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_12;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Status']", AI = false)
	public WebElement drpStatus_33;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Subject']", AI = false)
	public WebElement inpSubject_8;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Subject']", AI = false)
	public WebElement inpSubject_177;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_26;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_116;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Subject']", AI = false)
	public WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_80;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Escalated']", AI = false)
	public WebElement rdbEscalated_120;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-State']", AI = false)
	public WebElement drpState_92;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivities_CanceledActivitiesAlertBar .gw-AlertBar--label", AI = false)
	public WebElement lblDesktopActivities_CanceledActivitiesAlertBar;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_145;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Product']", AI = false)
	public WebElement inpProduct_63;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Product']", AI = false)
	public WebElement inpProduct_102;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Priority']", AI = false)
	public WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-SearchResultID']", AI = false)
	public WebElement inpID_165;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Status']", AI = false)
	public WebElement drpStatus_20;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_171;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Subject']", AI = false)
	public WebElement inpSubject_164;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_39;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_96;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-DueDate']", AI = false)
	public WebElement inpDueDate_121;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-SearchResultID']", AI = false)
	public WebElement inpID_178;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-SearchResultID']", AI = false)
	public WebElement inpID_22;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Product']", AI = false)
	public WebElement inpProduct_115;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Product']", AI = false)
	public WebElement inpProduct_50;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_38;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Insured']", AI = false)
	public WebElement inpAccountHolder_127;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Insured']", AI = false)
	public WebElement inpAccountHolder_140;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Escalated']", AI = false)
	public WebElement rdbEscalated_107;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_83;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-DueDate']", AI = false)
	public WebElement inpDueDate_134;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_52;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Insured']", AI = false)
	public WebElement inpAccountHolder_10;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-State']", AI = false)
	public WebElement drpState_79;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Priority']", AI = false)
	public WebElement drpPriority_97;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-SearchResultID']", AI = false)
	public WebElement inpID_35;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Subject']", AI = false)
	public WebElement inpSubject_151;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_25;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_2;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Product']", AI = false)
	public WebElement inpProduct_128;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-Escalated']", AI = false)
	public WebElement rdbEscalated_3;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Status']", AI = false)
	public WebElement drpStatus_85;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-DueDate']", AI = false)
	public WebElement inpDueDate_4;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-DueDate']", AI = false)
	public WebElement inpDueDate_147;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_142;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Escalated']", AI = false)
	public WebElement rdbEscalated_172;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_106;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-Priority']", AI = false)
	public WebElement drpPriority_136;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_54;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Priority']", AI = false)
	public WebElement drpPriority_84;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-State']", AI = false)
	public WebElement drpState_118;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-3-Escalated']", AI = false)
	public WebElement rdbEscalated_29;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_182;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Subject']", AI = false)
	public WebElement inpSubject_99;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-Insured']", AI = false)
	public WebElement inpAccountHolder_101;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_5;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-Escalated']", AI = false)
	public WebElement rdbEscalated_42;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Status']", AI = false)
	public WebElement drpStatus_72;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_155;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV_tb-DesktopActivities_SkipButton>div[role='button']", AI = false)
	public WebElement btnSkip;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-4-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_41;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Priority']", AI = false)
	public WebElement drpPriority_71;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-Status']", AI = false)
	public WebElement drpStatus_176;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-Priority']", AI = false)
	public WebElement drpPriority_123;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-8-State']", AI = false)
	public WebElement drpState_105;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-SearchResultID']", AI = false)
	public WebElement inpID;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Insured']", AI = false)
	public WebElement inpAccountHolder_114;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-AssignedBy']", AI = false)
	public WebElement inpAssignedBy_129;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-DueDate']", AI = false)
	public WebElement inpDueDate_160;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Escalated']", AI = false)
	public WebElement rdbEscalated_159;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-11-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_132;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-13-Status']", AI = false)
	public WebElement drpStatus_163;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-Priority']", AI = false)
	public WebElement drpPriority_110;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-Subject']", AI = false)
	public WebElement inpSubject_73;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-DueDate']", AI = false)
	public WebElement inpDueDate;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-14-DueDate']", AI = false)
	public WebElement inpDueDate_173;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Status']", AI = false)
	public WebElement drpStatus_59;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Escalated']", AI = false)
	public WebElement rdbEscalated_146;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV_tb-DesktopActivities_CompleteButton>div[role='button']", AI = false)
	public WebElement btnComplete;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-10-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_119;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Product']", AI = false)
	public WebElement inpProduct_89;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-6-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed_67;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-1-AssignedBy-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_13;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-12-Status']", AI = false)
	public WebElement drpStatus_150;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-0-UpdatedSinceLastViewed']", AI = false)
	public WebElement rdbUpdatedSinceLastViewed;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-9-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateDateIcon_109;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-2-Escalated']", AI = false)
	public WebElement rdbEscalated_16;

	@IFindBy(how = How.CSS, using = "input[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-7-Subject']", AI = false)
	public WebElement inpSubject_86;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-5-Priority']", AI = false)
	public WebElement drpPriority_58;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityDetailToolbarButtons_SkipButton']", AI = false)
	public WebElement btnActivitySkip;

	@IFindBy(how = How.CSS, using = "div[id='DesktopActivities-DesktopActivitiesScreen-0']", AI = false)
	public WebElement ttlMyActivityPage;
	
	public String activity ="//input[@type='checkbox']";

	public String normalPrioritySubject ="//div[@data-gw-value='normal']//ancestor::td//following-sibling::td[contains(@id,'Subject_Cell')]";


	public MyActivitiesPage(){
	}

	public MyActivitiesPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlMyActivityPage))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public MyActivitiesPage enterSubject_47(WebDriver driver,String Subject_47) {
		BrowserActions.type(driver, inpSubject_47,Subject_47, "Subject_47");
		return this;
	}
	public MyActivitiesPage clickSelectUser_143(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_143,"SelectUser_143");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_90(WebDriver driver,String AssignedBy_90) {
		BrowserActions.type(driver, inpAssignedBy_90,AssignedBy_90, "AssignedBy_90");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_122(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_122,"DueDateDateIcon_122");
		return this;
	}
	public MyActivitiesPage enterDueDate_17(WebDriver driver,String DueDate_17) {
		BrowserActions.type(driver, inpDueDate_17,DueDate_17, "DueDate_17");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_62(WebDriver driver,String AccountHolder_62) {
		BrowserActions.type(driver, inpAccountHolder_62,AccountHolder_62, "AccountHolder_62");
		return this;
	}
	public MyActivitiesPage selectState_27(WebDriver driver,String State_27)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_27,State_27,"State_27");
		return this;
	}
	public MyActivitiesPage enterID_87(WebDriver driver,String ID_87) {
		BrowserActions.type(driver, inpID_87,ID_87, "ID_87");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_15(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_15,"UpdatedSinceLastViewed_15");
		return this;
	}
	public MyActivitiesPage selectPriority_45(WebDriver driver,String Priority_45)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_45,Priority_45,"Priority_45");
		return this;
	}
	public MyActivitiesPage selectPriority_175(WebDriver driver,String Priority_175)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_175,Priority_175,"Priority_175");
		return this;
	}
	public MyActivitiesPage selectState_157(WebDriver driver,String State_157)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_157,State_157,"State_157");
		return this;
	}
	public MyActivitiesPage clickSelectUser_156(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_156,"SelectUser_156");
		return this;
	}
	public MyActivitiesPage selectActivitiesFilter(WebDriver driver,String ActivitiesFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivitiesFilter,ActivitiesFilter,"ActivitiesFilter");
		return this;
	}
	public MyActivitiesPage clickEscalated_81(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_81,"Escalated_81");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_75(WebDriver driver,String AccountHolder_75) {
		BrowserActions.type(driver, inpAccountHolder_75,AccountHolder_75, "AccountHolder_75");
		return this;
	}
	public MyActivitiesPage enterProduct_180(WebDriver driver,String Product_180) {
		BrowserActions.type(driver, inpProduct_180,Product_180, "Product_180");
		return this;
	}
	public MyActivitiesPage clickEscalated(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated,"Escalated");
		return this;
	}
	public MyActivitiesPage selectState_14(WebDriver driver,String State_14)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_14,State_14,"State_14");
		return this;
	}
	public MyActivitiesPage enterSubject_60(WebDriver driver,String Subject_60) {
		BrowserActions.type(driver, inpSubject_60,Subject_60, "Subject_60");
		return this;
	}
	public MyActivitiesPage selectPriority_32(WebDriver driver,String Priority_32)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_32,Priority_32,"Priority_32");
		return this;
	}
	public MyActivitiesPage selectPriority_162(WebDriver driver,String Priority_162)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_162,Priority_162,"Priority_162");
		return this;
	}
	public MyActivitiesPage selectStatus_137(WebDriver driver,String Status_137)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_137,Status_137,"Status_137");
		return this;
	}
	public MyActivitiesPage selectState_144(WebDriver driver,String State_144)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_144,State_144,"State_144");
		return this;
	}
	public MyActivitiesPage selectPriority_19(WebDriver driver,String Priority_19)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_19,Priority_19,"Priority_19");
		return this;
	}
	public MyActivitiesPage clickEscalated_55(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_55,"Escalated_55");
		return this;
	}
	public MyActivitiesPage enterDueDate_30(WebDriver driver,String DueDate_30) {
		BrowserActions.type(driver, inpDueDate_30,DueDate_30, "DueDate_30");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_168(WebDriver driver,String AssignedBy_168) {
		BrowserActions.type(driver, inpAssignedBy_168,AssignedBy_168, "AssignedBy_168");
		return this;
	}
	public MyActivitiesPage clickSelectUser_169(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_169,"SelectUser_169");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_88(WebDriver driver,String AccountHolder_88) {
		BrowserActions.type(driver, inpAccountHolder_88,AccountHolder_88, "AccountHolder_88");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_135(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_135,"DueDateDateIcon_135");
		return this;
	}
	public MyActivitiesPage enterProduct(WebDriver driver,String Product) {
		BrowserActions.type(driver, inpProduct,Product, "Product");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_18(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_18,"DueDateDateIcon_18");
		return this;
	}
	public MyActivitiesPage enterSubject_34(WebDriver driver,String Subject_34) {
		BrowserActions.type(driver, inpSubject_34,Subject_34, "Subject_34");
		return this;
	}
	public MyActivitiesPage selectStatus_124(WebDriver driver,String Status_124)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_124,Status_124,"Status_124");
		return this;
	}
	public MyActivitiesPage selectState_131(WebDriver driver,String State_131)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_131,State_131,"State_131");
		return this;
	}
	public MyActivitiesPage clickEscalated_68(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_68,"Escalated_68");
		return this;
	}
	public MyActivitiesPage selectStatus_98(WebDriver driver,String Status_98)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_98,Status_98,"Status_98");
		return this;
	}
	public MyActivitiesPage enterDueDate_43(WebDriver driver,String DueDate_43) {
		BrowserActions.type(driver, inpDueDate_43,DueDate_43, "DueDate_43");
		return this;
	}
	public MyActivitiesPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public MyActivitiesPage selectActivitiesFilter_1(WebDriver driver,String ActivitiesFilter_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivitiesFilter_1,ActivitiesFilter_1,"ActivitiesFilter_1");
		return this;
	}
	public MyActivitiesPage enterID_100(WebDriver driver,String ID_100) {
		BrowserActions.type(driver, inpID_100,ID_100, "ID_100");
		return this;
	}
	public MyActivitiesPage selectStatus_111(WebDriver driver,String Status_111)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_111,Status_111,"Status_111");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_148(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_148,"DueDateDateIcon_148");
		return this;
	}
	public MyActivitiesPage selectPriority_149(WebDriver driver,String Priority_149)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_149,Priority_149,"Priority_149");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_181(WebDriver driver,String AssignedBy_181) {
		BrowserActions.type(driver, inpAssignedBy_181,AssignedBy_181, "AssignedBy_181");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_28(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_28,"UpdatedSinceLastViewed_28");
		return this;
	}
	public MyActivitiesPage selectStatus_7(WebDriver driver,String Status_7)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_7,Status_7,"Status_7");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_51(WebDriver driver,String AssignedBy_51) {
		BrowserActions.type(driver, inpAssignedBy_51,AssignedBy_51, "AssignedBy_51");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_161(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_161,"DueDateDateIcon_161");
		return this;
	}
	public MyActivitiesPage enterDueDate_56(WebDriver driver,String DueDate_56) {
		BrowserActions.type(driver, inpDueDate_56,DueDate_56, "DueDate_56");
		return this;
	}
	public MyActivitiesPage clickSelectUser_104(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_104,"SelectUser_104");
		return this;
	}
	public MyActivitiesPage enterProduct_37(WebDriver driver,String Product_37) {
		BrowserActions.type(driver, inpProduct_37,Product_37, "Product_37");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_23(WebDriver driver,String AccountHolder_23) {
		BrowserActions.type(driver, inpAccountHolder_23,AccountHolder_23, "AccountHolder_23");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_31(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_31,"DueDateDateIcon_31");
		return this;
	}
	public MyActivitiesPage enterID_48(WebDriver driver,String ID_48) {
		BrowserActions.type(driver, inpID_48,ID_48, "ID_48");
		return this;
	}
	public MyActivitiesPage enterID_113(WebDriver driver,String ID_113) {
		BrowserActions.type(driver, inpID_113,ID_113, "ID_113");
		return this;
	}
	public MyActivitiesPage clickSelectUser_65(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_65,"SelectUser_65");
		return this;
	}
	public MyActivitiesPage selectState_66(WebDriver driver,String State_66)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_66,State_66,"State_66");
		return this;
	}
	public MyActivitiesPage selectState_53(WebDriver driver,String State_53)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_53,State_53,"State_53");
		return this;
	}
	public MyActivitiesPage clickSelectUser_117(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_117,"SelectUser_117");
		return this;
	}
	public MyActivitiesPage enterDueDate_69(WebDriver driver,String DueDate_69) {
		BrowserActions.type(driver, inpDueDate_69,DueDate_69, "DueDate_69");
		return this;
	}
	public MyActivitiesPage enterSubject_138(WebDriver driver,String Subject_138) {
		BrowserActions.type(driver, inpSubject_138,Subject_138, "Subject_138");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_174(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_174,"DueDateDateIcon_174");
		return this;
	}
	public MyActivitiesPage enterProduct_141(WebDriver driver,String Product_141) {
		BrowserActions.type(driver, inpProduct_141,Product_141, "Product_141");
		return this;
	}
	public MyActivitiesPage enterProduct_24(WebDriver driver,String Product_24) {
		BrowserActions.type(driver, inpProduct_24,Product_24, "Product_24");
		return this;
	}
	public MyActivitiesPage enterID_126(WebDriver driver,String ID_126) {
		BrowserActions.type(driver, inpID_126,ID_126, "ID_126");
		return this;
	}
	public MyActivitiesPage clickSelectUser_78(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_78,"SelectUser_78");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_36(WebDriver driver,String AccountHolder_36) {
		BrowserActions.type(driver, inpAccountHolder_36,AccountHolder_36, "AccountHolder_36");
		return this;
	}
	public MyActivitiesPage enterSubject_21(WebDriver driver,String Subject_21) {
		BrowserActions.type(driver, inpSubject_21,Subject_21, "Subject_21");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_77(WebDriver driver,String AssignedBy_77) {
		BrowserActions.type(driver, inpAssignedBy_77,AssignedBy_77, "AssignedBy_77");
		return this;
	}
	public MyActivitiesPage enterSubject_125(WebDriver driver,String Subject_125) {
		BrowserActions.type(driver, inpSubject_125,Subject_125, "Subject_125");
		return this;
	}
	public MyActivitiesPage selectState_183(WebDriver driver,String State_183)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_183,State_183,"State_183");
		return this;
	}
	public MyActivitiesPage clickEscalated_94(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_94,"Escalated_94");
		return this;
	}
	public MyActivitiesPage selectState_40(WebDriver driver,String State_40)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_40,State_40,"State_40");
		return this;
	}
	public MyActivitiesPage enterProduct_11(WebDriver driver,String Product_11) {
		BrowserActions.type(driver, inpProduct_11,Product_11, "Product_11");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_49(WebDriver driver,String AccountHolder_49) {
		BrowserActions.type(driver, inpAccountHolder_49,AccountHolder_49, "AccountHolder_49");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_57(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_57,"DueDateDateIcon_57");
		return this;
	}
	public MyActivitiesPage enterID_139(WebDriver driver,String ID_139) {
		BrowserActions.type(driver, inpID_139,ID_139, "ID_139");
		return this;
	}
	public MyActivitiesPage enterProduct_154(WebDriver driver,String Product_154) {
		BrowserActions.type(driver, inpProduct_154,Product_154, "Product_154");
		return this;
	}
	public MyActivitiesPage enterID_61(WebDriver driver,String ID_61) {
		BrowserActions.type(driver, inpID_61,ID_61, "ID_61");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_166(WebDriver driver,String AccountHolder_166) {
		BrowserActions.type(driver, inpAccountHolder_166,AccountHolder_166, "AccountHolder_166");
		return this;
	}
	public MyActivitiesPage clickSelectUser_130(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_130,"SelectUser_130");
		return this;
	}
	public MyActivitiesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_64(WebDriver driver,String AssignedBy_64) {
		BrowserActions.type(driver, inpAssignedBy_64,AssignedBy_64, "AssignedBy_64");
		return this;
	}
	public MyActivitiesPage enterDueDate_82(WebDriver driver,String DueDate_82) {
		BrowserActions.type(driver, inpDueDate_82,DueDate_82, "DueDate_82");
		return this;
	}
	public MyActivitiesPage enterSubject_112(WebDriver driver,String Subject_112) {
		BrowserActions.type(driver, inpSubject_112,Subject_112, "Subject_112");
		return this;
	}
	public MyActivitiesPage enterAccountHolder(WebDriver driver,String AccountHolder) {
		BrowserActions.type(driver, inpAccountHolder,AccountHolder, "AccountHolder");
		return this;
	}
	public MyActivitiesPage selectState_170(WebDriver driver,String State_170)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_170,State_170,"State_170");
		return this;
	}
	public MyActivitiesPage selectPriority_6(WebDriver driver,String Priority_6)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_6,Priority_6,"Priority_6");
		return this;
	}
	public MyActivitiesPage enterID_9(WebDriver driver,String ID_9) {
		BrowserActions.type(driver, inpID_9,ID_9, "ID_9");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_44(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_44,"DueDateDateIcon_44");
		return this;
	}
	public MyActivitiesPage enterProduct_167(WebDriver driver,String Product_167) {
		BrowserActions.type(driver, inpProduct_167,Product_167, "Product_167");
		return this;
	}
	public MyActivitiesPage clickAssign(WebDriver driver)  {
		BrowserActions.click(driver, btnAssign,true,"Assign");
		return this;
	}
	public MyActivitiesPage enterID_74(WebDriver driver,String ID_74) {
		BrowserActions.type(driver, inpID_74,ID_74, "ID_74");
		return this;
	}
	public MyActivitiesPage clickSelectUser_91(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_91,"SelectUser_91");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_179(WebDriver driver,String AccountHolder_179) {
		BrowserActions.type(driver, inpAccountHolder_179,AccountHolder_179, "AccountHolder_179");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_153(WebDriver driver,String AccountHolder_153) {
		BrowserActions.type(driver, inpAccountHolder_153,AccountHolder_153, "AccountHolder_153");
		return this;
	}
	public MyActivitiesPage enterDueDate_95(WebDriver driver,String DueDate_95) {
		BrowserActions.type(driver, inpDueDate_95,DueDate_95, "DueDate_95");
		return this;
	}
	public MyActivitiesPage selectStatus_46(WebDriver driver,String Status_46)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_46,Status_46,"Status_46");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_103(WebDriver driver,String AssignedBy_103) {
		BrowserActions.type(driver, inpAssignedBy_103,AssignedBy_103, "AssignedBy_103");
		return this;
	}
	public MyActivitiesPage enterAssignedBy(WebDriver driver,String AssignedBy) {
		BrowserActions.type(driver, inpAssignedBy,AssignedBy, "AssignedBy");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_70(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_70,"DueDateDateIcon_70");
		return this;
	}
	public MyActivitiesPage clickEscalated_133(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_133,"Escalated_133");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_158(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_158,"UpdatedSinceLastViewed_158");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_93(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_93,"UpdatedSinceLastViewed_93");
		return this;
	}
	public MyActivitiesPage enterProduct_76(WebDriver driver,String Product_76) {
		BrowserActions.type(driver, inpProduct_76,Product_76, "Product_76");
		return this;
	}
	public MyActivitiesPage enterDueDate_108(WebDriver driver,String DueDate_108) {
		BrowserActions.type(driver, inpDueDate_108,DueDate_108, "DueDate_108");
		return this;
	}
	public MyActivitiesPage enterID_152(WebDriver driver,String ID_152) {
		BrowserActions.type(driver, inpID_152,ID_152, "ID_152");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_12(WebDriver driver,String AssignedBy_12) {
		BrowserActions.type(driver, inpAssignedBy_12,AssignedBy_12, "AssignedBy_12");
		return this;
	}
	public MyActivitiesPage selectStatus_33(WebDriver driver,String Status_33)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_33,Status_33,"Status_33");
		return this;
	}
	public MyActivitiesPage enterSubject_8(WebDriver driver,String Subject_8) {
		BrowserActions.type(driver, inpSubject_8,Subject_8, "Subject_8");
		return this;
	}
	public MyActivitiesPage enterSubject_177(WebDriver driver,String Subject_177) {
		BrowserActions.type(driver, inpSubject_177,Subject_177, "Subject_177");
		return this;
	}
	public MyActivitiesPage clickSelectUser_26(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_26,"SelectUser_26");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_116(WebDriver driver,String AssignedBy_116) {
		BrowserActions.type(driver, inpAssignedBy_116,AssignedBy_116, "AssignedBy_116");
		return this;
	}
	public MyActivitiesPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_80(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_80,"UpdatedSinceLastViewed_80");
		return this;
	}
	public MyActivitiesPage clickEscalated_120(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_120,"Escalated_120");
		return this;
	}
	public MyActivitiesPage selectState_92(WebDriver driver,String State_92)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_92,State_92,"State_92");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_145(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_145,"UpdatedSinceLastViewed_145");
		return this;
	}
	public MyActivitiesPage enterProduct_63(WebDriver driver,String Product_63) {
		BrowserActions.type(driver, inpProduct_63,Product_63, "Product_63");
		return this;
	}
	public MyActivitiesPage enterProduct_102(WebDriver driver,String Product_102) {
		BrowserActions.type(driver, inpProduct_102,Product_102, "Product_102");
		return this;
	}
	public MyActivitiesPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public MyActivitiesPage enterID_165(WebDriver driver,String ID_165) {
		BrowserActions.type(driver, inpID_165,ID_165, "ID_165");
		return this;
	}
	public MyActivitiesPage selectStatus_20(WebDriver driver,String Status_20)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_20,Status_20,"Status_20");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_171(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_171,"UpdatedSinceLastViewed_171");
		return this;
	}
	public MyActivitiesPage enterSubject_164(WebDriver driver,String Subject_164) {
		BrowserActions.type(driver, inpSubject_164,Subject_164, "Subject_164");
		return this;
	}
	public MyActivitiesPage clickSelectUser_39(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_39,"SelectUser_39");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_96(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_96,"DueDateDateIcon_96");
		return this;
	}
	public MyActivitiesPage enterDueDate_121(WebDriver driver,String DueDate_121) {
		BrowserActions.type(driver, inpDueDate_121,DueDate_121, "DueDate_121");
		return this;
	}
	public MyActivitiesPage enterID_178(WebDriver driver,String ID_178) {
		BrowserActions.type(driver, inpID_178,ID_178, "ID_178");
		return this;
	}
	public MyActivitiesPage enterID_22(WebDriver driver,String ID_22) {
		BrowserActions.type(driver, inpID_22,ID_22, "ID_22");
		return this;
	}
	public MyActivitiesPage enterProduct_115(WebDriver driver,String Product_115) {
		BrowserActions.type(driver, inpProduct_115,Product_115, "Product_115");
		return this;
	}
	public MyActivitiesPage enterProduct_50(WebDriver driver,String Product_50) {
		BrowserActions.type(driver, inpProduct_50,Product_50, "Product_50");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_38(WebDriver driver,String AssignedBy_38) {
		BrowserActions.type(driver, inpAssignedBy_38,AssignedBy_38, "AssignedBy_38");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_127(WebDriver driver,String AccountHolder_127) {
		BrowserActions.type(driver, inpAccountHolder_127,AccountHolder_127, "AccountHolder_127");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_140(WebDriver driver,String AccountHolder_140) {
		BrowserActions.type(driver, inpAccountHolder_140,AccountHolder_140, "AccountHolder_140");
		return this;
	}
	public MyActivitiesPage clickEscalated_107(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_107,"Escalated_107");
		return this;
	}
	public MyActivitiesPage clickSelectUser(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser,"SelectUser");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_83(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_83,"DueDateDateIcon_83");
		return this;
	}
	public MyActivitiesPage enterDueDate_134(WebDriver driver,String DueDate_134) {
		BrowserActions.type(driver, inpDueDate_134,DueDate_134, "DueDate_134");
		return this;
	}
	public MyActivitiesPage clickSelectUser_52(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_52,"SelectUser_52");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_10(WebDriver driver,String AccountHolder_10) {
		BrowserActions.type(driver, inpAccountHolder_10,AccountHolder_10, "AccountHolder_10");
		return this;
	}
	public MyActivitiesPage selectState_79(WebDriver driver,String State_79)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_79,State_79,"State_79");
		return this;
	}
	public MyActivitiesPage selectPriority_97(WebDriver driver,String Priority_97)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_97,Priority_97,"Priority_97");
		return this;
	}
	public MyActivitiesPage enterID_35(WebDriver driver,String ID_35) {
		BrowserActions.type(driver, inpID_35,ID_35, "ID_35");
		return this;
	}
	public MyActivitiesPage enterSubject_151(WebDriver driver,String Subject_151) {
		BrowserActions.type(driver, inpSubject_151,Subject_151, "Subject_151");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_25(WebDriver driver,String AssignedBy_25) {
		BrowserActions.type(driver, inpAssignedBy_25,AssignedBy_25, "AssignedBy_25");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_2(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_2,"UpdatedSinceLastViewed_2");
		return this;
	}
	public MyActivitiesPage enterProduct_128(WebDriver driver,String Product_128) {
		BrowserActions.type(driver, inpProduct_128,Product_128, "Product_128");
		return this;
	}
	public MyActivitiesPage clickEscalated_3(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_3,"Escalated_3");
		return this;
	}
	public MyActivitiesPage selectStatus_85(WebDriver driver,String Status_85)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_85,Status_85,"Status_85");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon,"DueDateDateIcon");
		return this;
	}
	public MyActivitiesPage enterDueDate_4(WebDriver driver,String DueDate_4) {
		BrowserActions.type(driver, inpDueDate_4,DueDate_4, "DueDate_4");
		return this;
	}
	public MyActivitiesPage enterDueDate_147(WebDriver driver,String DueDate_147) {
		BrowserActions.type(driver, inpDueDate_147,DueDate_147, "DueDate_147");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_142(WebDriver driver,String AssignedBy_142) {
		BrowserActions.type(driver, inpAssignedBy_142,AssignedBy_142, "AssignedBy_142");
		return this;
	}
	public MyActivitiesPage clickEscalated_172(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_172,"Escalated_172");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_106(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_106,"UpdatedSinceLastViewed_106");
		return this;
	}
	public MyActivitiesPage selectPriority_136(WebDriver driver,String Priority_136)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_136,Priority_136,"Priority_136");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_54(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_54,"UpdatedSinceLastViewed_54");
		return this;
	}
	public MyActivitiesPage selectPriority_84(WebDriver driver,String Priority_84)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_84,Priority_84,"Priority_84");
		return this;
	}
	public MyActivitiesPage selectState_118(WebDriver driver,String State_118)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_118,State_118,"State_118");
		return this;
	}
	public MyActivitiesPage clickEscalated_29(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_29,"Escalated_29");
		return this;
	}
	public MyActivitiesPage clickSelectUser_182(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_182,"SelectUser_182");
		return this;
	}
	public MyActivitiesPage enterSubject_99(WebDriver driver,String Subject_99) {
		BrowserActions.type(driver, inpSubject_99,Subject_99, "Subject_99");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_101(WebDriver driver,String AccountHolder_101) {
		BrowserActions.type(driver, inpAccountHolder_101,AccountHolder_101, "AccountHolder_101");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_5,"DueDateDateIcon_5");
		return this;
	}
	public MyActivitiesPage clickEscalated_42(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_42,"Escalated_42");
		return this;
	}
	public MyActivitiesPage selectStatus_72(WebDriver driver,String Status_72)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_72,Status_72,"Status_72");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_155(WebDriver driver,String AssignedBy_155) {
		BrowserActions.type(driver, inpAssignedBy_155,AssignedBy_155, "AssignedBy_155");
		return this;
	}
	public MyActivitiesPage clickSkip(WebDriver driver)  {
		BrowserActions.click(driver, btnSkip,"Skip");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_41(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_41,"UpdatedSinceLastViewed_41");
		return this;
	}
	public MyActivitiesPage selectPriority_71(WebDriver driver,String Priority_71)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_71,Priority_71,"Priority_71");
		return this;
	}
	public MyActivitiesPage selectStatus_176(WebDriver driver,String Status_176)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_176,Status_176,"Status_176");
		return this;
	}
	public MyActivitiesPage selectPriority_123(WebDriver driver,String Priority_123)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_123,Priority_123,"Priority_123");
		return this;
	}
	public MyActivitiesPage selectState_105(WebDriver driver,String State_105)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_105,State_105,"State_105");
		return this;
	}
	public MyActivitiesPage enterID(WebDriver driver,String ID) {
		BrowserActions.type(driver, inpID,ID, "ID");
		return this;
	}
	public MyActivitiesPage enterAccountHolder_114(WebDriver driver,String AccountHolder_114) {
		BrowserActions.type(driver, inpAccountHolder_114,AccountHolder_114, "AccountHolder_114");
		return this;
	}
	public MyActivitiesPage enterAssignedBy_129(WebDriver driver,String AssignedBy_129) {
		BrowserActions.type(driver, inpAssignedBy_129,AssignedBy_129, "AssignedBy_129");
		return this;
	}
	public MyActivitiesPage enterDueDate_160(WebDriver driver,String DueDate_160) {
		BrowserActions.type(driver, inpDueDate_160,DueDate_160, "DueDate_160");
		return this;
	}
	public MyActivitiesPage clickEscalated_159(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_159,"Escalated_159");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_132(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_132,"UpdatedSinceLastViewed_132");
		return this;
	}
	public MyActivitiesPage selectStatus_163(WebDriver driver,String Status_163)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_163,Status_163,"Status_163");
		return this;
	}
	public MyActivitiesPage selectPriority_110(WebDriver driver,String Priority_110)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_110,Priority_110,"Priority_110");
		return this;
	}
	public MyActivitiesPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public MyActivitiesPage enterSubject_73(WebDriver driver,String Subject_73) {
		BrowserActions.type(driver, inpSubject_73,Subject_73, "Subject_73");
		return this;
	}
	public MyActivitiesPage enterDueDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpDueDate,DueDate, "DueDate");
		return this;
	}
	public MyActivitiesPage enterDueDate_173(WebDriver driver,String DueDate_173) {
		BrowserActions.type(driver, inpDueDate_173,DueDate_173, "DueDate_173");
		return this;
	}
	public MyActivitiesPage selectStatus_59(WebDriver driver,String Status_59)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_59,Status_59,"Status_59");
		return this;
	}
	public MyActivitiesPage clickEscalated_146(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_146,"Escalated_146");
		return this;
	}
	public MyActivitiesPage clickComplete(WebDriver driver)  {
		BrowserActions.click(driver, btnComplete,"Complete");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_119(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_119,"UpdatedSinceLastViewed_119");
		return this;
	}
	public MyActivitiesPage enterProduct_89(WebDriver driver,String Product_89) {
		BrowserActions.type(driver, inpProduct_89,Product_89, "Product_89");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed_67(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed_67,"UpdatedSinceLastViewed_67");
		return this;
	}
	public MyActivitiesPage clickSelectUser_13(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_13,"SelectUser_13");
		return this;
	}
	public MyActivitiesPage selectStatus_150(WebDriver driver,String Status_150)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_150,Status_150,"Status_150");
		return this;
	}
	public MyActivitiesPage clickUpdatedSinceLastViewed(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdatedSinceLastViewed,"UpdatedSinceLastViewed");
		return this;
	}
	public MyActivitiesPage clickDueDateDateIcon_109(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon_109,"DueDateDateIcon_109");
		return this;
	}
	public MyActivitiesPage clickEscalated_16(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_16,"Escalated_16");
		return this;
	}
	public MyActivitiesPage enterSubject_86(WebDriver driver,String Subject_86) {
		BrowserActions.type(driver, inpSubject_86,Subject_86, "Subject_86");
		return this;
	}
	public MyActivitiesPage selectPriority_58(WebDriver driver,String Priority_58)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_58,Priority_58,"Priority_58");
		return this;
	}

	/**
	 * multiple activities are selected
	 * @author charu.anbarasan
	 * @param driver
	 */
	public MyActivitiesPage selectMultipleActivities(WebDriver driver) {
		BrowserActions.waitForNetworkIdleState(driver, 1);
		for(int i=2;i<4;i++) {
			By activityBy =By.xpath("("+activity+")"+"["+i+"]");
			BrowserActions.waitForElementToDisplay(driver, activityBy, "activity");
			WebElement activity = activityBy.findElement(driver);
			BrowserActions.click(driver, activity, "activity");
		}
		return this;
	}

	/**
	 * multiple activities are selected
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void selectNormalPriorityActivities(WebDriver driver) {
		BrowserActions.waitForNetworkIdleState(driver, 1);
		By normalActivityBy = By.xpath(normalPrioritySubject);
		BrowserActions.waitForElementToDisplay(driver, normalActivityBy, "normalActivity");
		WebElement normalActivity = normalActivityBy.findElement(driver);
		BrowserActions.click(driver, normalActivity, "Normal Activity");
	}
	
	/**
	 * Click Activity Skip
	 * @param driver 
	 * @return
	 */

	public void clickActivitySkip(WebDriver driver)  {
		BrowserActions.click(driver, btnActivitySkip,"Activity Skip Button");
	}

	public class AssignActivitiesPage extends LoadableComponent<AssignActivitiesPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "select[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-PLNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		public WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-GroupName']", AI = false)
		public WebElement inpGroupName_2;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-GroupNameKanji']", AI = false)
		public WebElement inpGroupName_3;

		@IFindBy(how = How.CSS, using = "#AssignActivitiesPopup-AssignmentPopupScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-GroupCriteriaNameKanji']", AI = false)
		public WebElement inpGroupName_1;

		@IFindBy(how = How.CSS, using = "#AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-PLNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "select[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-PLNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		public WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "#AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupScreen_CancelButton>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-Username']", AI = false)
		public WebElement inpUsername;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-PLNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		public WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-GroupCriteriaName']", AI = false)
		public WebElement inpGroupName;

		@IFindBy(how = How.CSS, using = "select[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-SearchFor']", AI = false)
		public WebElement drpSearchFor;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-QueueName']", AI = false)
		public WebElement inpQueueName;

		@IFindBy(how = How.CSS, using = "#AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentByGroupPopupScreen_ButtonButton>div[role='button']", AI = false)
		public WebElement btnAssignmentByGroupPopupScreen_ButtonButton;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-PLNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		public WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-PLNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		public WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "#AssignActivitiesPopup-__crumb__", AI = false)
		public WebElement btnReturntoMyActivities;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-SelectFromSearch']", AI = false)
		public WebElement inpFindausergrouporqueue;

		@IFindBy(how = How.CSS, using = "#AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.CSS, using = "select[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-SelectFromList']", AI = false)
		public WebElement drpSelectfromlist;

		@IFindBy(how = How.CSS, using = "input[name='AssignActivitiesPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentSearchInputSet-PLNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		public WebElement inpFirstname;

		public AssignActivitiesPage(){
		}

		public AssignActivitiesPage(WebDriver driver) throws Exception{
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
		}public AssignActivitiesPage selectPrefix(WebDriver driver,String Prefix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
			return this;
		}
		public AssignActivitiesPage enterGroupName_2(WebDriver driver,String GroupName_2) {
			BrowserActions.type(driver, inpGroupName_2,GroupName_2, "GroupName_2");
			return this;
		}
		public AssignActivitiesPage enterGroupName_3(WebDriver driver,String GroupName_3) {
			BrowserActions.type(driver, inpGroupName_3,GroupName_3, "GroupName_3");
			return this;
		}
		public AssignActivitiesPage enterGroupName_1(WebDriver driver,String GroupName_1) {
			BrowserActions.type(driver, inpGroupName_1,GroupName_1, "GroupName_1");
			return this;
		}
		public AssignActivitiesPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public AssignActivitiesPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public AssignActivitiesPage selectSuffix(WebDriver driver,String Suffix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
			return this;
		}
		public AssignActivitiesPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public AssignActivitiesPage enterUsername(WebDriver driver,String Username) {
			BrowserActions.type(driver, inpUsername,Username, "Username");
			return this;
		}
		public AssignActivitiesPage enterParticle(WebDriver driver,String Particle) {
			BrowserActions.type(driver, inpParticle,Particle, "Particle");
			return this;
		}
		public AssignActivitiesPage enterGroupName(WebDriver driver,String GroupName) {
			BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
			return this;
		}
		public AssignActivitiesPage selectSearchFor(WebDriver driver,String SearchFor)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSearchFor,SearchFor,"SearchFor");
			return this;
		}
		public AssignActivitiesPage enterQueueName(WebDriver driver,String QueueName) {
			BrowserActions.type(driver, inpQueueName,QueueName, "QueueName");
			return this;
		}
		public AssignActivitiesPage clickAssignment(WebDriver driver)  {
			BrowserActions.click(driver, btnAssignmentByGroupPopupScreen_ButtonButton,"AssignmentByGroupPopupScreen_ButtonButton");
			return this;
		}
		public AssignActivitiesPage enterMiddlename(WebDriver driver,String Middlename) {
			BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			return this;
		}
		public AssignActivitiesPage enterLastname(WebDriver driver,String Lastname) {
			BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			return this;
		}
		public AssignActivitiesPage clickReturntoMyActivities(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoMyActivities,"ReturntoMyActivities");
			return this;
		}
		public AssignActivitiesPage enterFindausergrouporqueue(WebDriver driver,String Findausergrouporqueue) {
			BrowserActions.type(driver, inpFindausergrouporqueue,Findausergrouporqueue, "Findausergrouporqueue");
			return this;
		}
		public AssignActivitiesPage clickReset(WebDriver driver)  {
			BrowserActions.click(driver, btnReset,"Reset");
			return this;
		}
		public AssignActivitiesPage selectSelectfromlist(WebDriver driver,String Selectfromlist)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSelectfromlist,Selectfromlist,"Selectfromlist");
			return this;
		}
		public AssignActivitiesPage enterFirstname(WebDriver driver,String Firstname) {
			BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			return this;
		}
	}

}
