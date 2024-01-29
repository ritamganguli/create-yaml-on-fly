package com.aspire.guidewire.cc.pages.nonlob;
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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class IntentionalLoggingPage extends LoadableComponent<IntentionalLoggingPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public IntentionalLogging intentionalloggingTable;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-2-Start", AI = false)
	private WebElement btnEnable_7;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-16-Start", AI = false)
	private WebElement btnEnable_63;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-0-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-17-Name']", AI = false)
	private WebElement inpElementName_65;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-1-Start", AI = false)
	private WebElement btnEnable_3;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-18-Name']", AI = false)
	private WebElement inpElementName_69;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-38-Stop", AI = false)
	private WebElement btnDisable_152;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-22-Stop", AI = false)
	private WebElement btnDisable_88;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-32-Status']", AI = false)
	private WebElement inpStatus_126;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-39-Stop", AI = false)
	private WebElement btnDisable_156;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-13-Status']", AI = false)
	private WebElement inpStatus_50;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-11-Status']", AI = false)
	private WebElement inpStatus_42;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-21-Stop", AI = false)
	private WebElement btnDisable_84;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-31-Status']", AI = false)
	private WebElement inpStatus_122;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-globalButtonOff>div[role='button']", AI = false)
	private WebElement btnTurnIntentionalLoggingOff;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-37-Stop", AI = false)
	private WebElement btnDisable_148;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-12-Status']", AI = false)
	private WebElement inpStatus_46;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-20-Stop", AI = false)
	private WebElement btnDisable_80;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-15-Start", AI = false)
	private WebElement btnEnable_59;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-30-Name']", AI = false)
	private WebElement inpElementName_117;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-14-Start", AI = false)
	private WebElement btnEnable_55;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-29-Name']", AI = false)
	private WebElement inpElementName_113;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-19-Name']", AI = false)
	private WebElement inpElementName_73;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-13-Start", AI = false)
	private WebElement btnEnable_51;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-14-Name']", AI = false)
	private WebElement inpElementName_53;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-31-Name']", AI = false)
	private WebElement inpElementName_121;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-27-Start", AI = false)
	private WebElement btnEnable_107;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-15-Name']", AI = false)
	private WebElement inpElementName_57;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-30-Status']", AI = false)
	private WebElement inpStatus_118;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-35-Stop", AI = false)
	private WebElement btnDisable_140;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-19-Stop", AI = false)
	private WebElement btnDisable_76;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-29-Status']", AI = false)
	private WebElement inpStatus_114;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-36-Stop", AI = false)
	private WebElement btnDisable_144;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-16-Status']", AI = false)
	private WebElement inpStatus_62;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-26-Start", AI = false)
	private WebElement btnEnable_103;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-14-Status']", AI = false)
	private WebElement inpStatus_54;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-18-Stop", AI = false)
	private WebElement btnDisable_72;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-28-Status']", AI = false)
	private WebElement inpStatus_110;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-0-Name']", AI = false)
	private WebElement inpElementName;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-34-Stop", AI = false)
	private WebElement btnDisable_136;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-15-Status']", AI = false)
	private WebElement inpStatus_58;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-33-Name']", AI = false)
	private WebElement inpElementName_129;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-32-Name']", AI = false)
	private WebElement inpElementName_125;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-12-Start", AI = false)
	private WebElement btnEnable_47;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-16-Name']", AI = false)
	private WebElement inpElementName_61;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-22-Name']", AI = false)
	private WebElement inpElementName_85;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-34-Name']", AI = false)
	private WebElement inpElementName_133;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-11-Start", AI = false)
	private WebElement btnEnable_43;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-30-Start", AI = false)
	private WebElement btnEnable_119;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-23-Name']", AI = false)
	private WebElement inpElementName_89;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-7-Stop", AI = false)
	private WebElement btnDisable_28;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-6-Stop", AI = false)
	private WebElement btnDisable_24;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-28-Start", AI = false)
	private WebElement btnEnable_111;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-5-Stop", AI = false)
	private WebElement btnDisable_20;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-37-Status']", AI = false)
	private WebElement inpStatus_146;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-8-Status']", AI = false)
	private WebElement inpStatus_30;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-29-Start", AI = false)
	private WebElement btnEnable_115;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-6-Status']", AI = false)
	private WebElement inpStatus_22;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-36-Status']", AI = false)
	private WebElement inpStatus_142;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-7-Status']", AI = false)
	private WebElement inpStatus_26;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-10-Start", AI = false)
	private WebElement btnEnable_39;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-0-Stop", AI = false)
	private WebElement btnDisable;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-24-Name']", AI = false)
	private WebElement inpElementName_93;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-9-Start", AI = false)
	private WebElement btnEnable_35;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-35-Name']", AI = false)
	private WebElement inpElementName_137;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-8-Start", AI = false)
	private WebElement btnEnable_31;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-20-Name']", AI = false)
	private WebElement inpElementName_77;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-37-Name']", AI = false)
	private WebElement inpElementName_145;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-4-Stop", AI = false)
	private WebElement btnDisable_16;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-36-Name']", AI = false)
	private WebElement inpElementName_141;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-31-Start", AI = false)
	private WebElement btnEnable_123;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-3-Stop", AI = false)
	private WebElement btnDisable_12;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-35-Status']", AI = false)
	private WebElement inpStatus_138;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-32-Start", AI = false)
	private WebElement btnEnable_127;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-24-Stop", AI = false)
	private WebElement btnDisable_96;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-34-Status']", AI = false)
	private WebElement inpStatus_134;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-9-Status']", AI = false)
	private WebElement inpStatus_34;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-23-Stop", AI = false)
	private WebElement btnDisable_92;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-33-Status']", AI = false)
	private WebElement inpStatus_130;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-10-Status']", AI = false)
	private WebElement inpStatus_38;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-7-Start", AI = false)
	private WebElement btnEnable_27;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-6-Start", AI = false)
	private WebElement btnEnable_23;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-21-Name']", AI = false)
	private WebElement inpElementName_81;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-38-Name']", AI = false)
	private WebElement inpElementName_149;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-39-Name']", AI = false)
	private WebElement inpElementName_153;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-6-Name']", AI = false)
	private WebElement inpElementName_21;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-7-Name']", AI = false)
	private WebElement inpElementName_25;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-12-Stop", AI = false)
	private WebElement btnDisable_48;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-23-Status']", AI = false)
	private WebElement inpStatus_90;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-34-Start", AI = false)
	private WebElement btnEnable_135;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-8-Name']", AI = false)
	private WebElement inpElementName_29;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-11-Stop", AI = false)
	private WebElement btnDisable_44;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-28-Stop", AI = false)
	private WebElement btnDisable_112;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-24-Status']", AI = false)
	private WebElement inpStatus_94;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-35-Start", AI = false)
	private WebElement btnEnable_139;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-10-Stop", AI = false)
	private WebElement btnDisable_40;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-22-Status']", AI = false)
	private WebElement inpStatus_86;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-26-Stop", AI = false)
	private WebElement btnDisable_104;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-5-Start", AI = false)
	private WebElement btnEnable_19;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-27-Stop", AI = false)
	private WebElement btnDisable_108;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-33-Start", AI = false)
	private WebElement btnEnable_131;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-4-Start", AI = false)
	private WebElement btnEnable_15;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-3-Start", AI = false)
	private WebElement btnEnable_11;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-25-Start", AI = false)
	private WebElement btnEnable_99;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-24-Start", AI = false)
	private WebElement btnEnable_95;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-25-Name']", AI = false)
	private WebElement inpElementName_97;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-4-Name']", AI = false)
	private WebElement inpElementName_13;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-23-Start", AI = false)
	private WebElement btnEnable_91;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-5-Name']", AI = false)
	private WebElement inpElementName_17;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-9-Stop", AI = false)
	private WebElement btnDisable_36;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-titleBar", AI = false)
	private WebElement lblTitleBar;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-36-Start", AI = false)
	private WebElement btnEnable_143;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-8-Stop", AI = false)
	private WebElement btnDisable_32;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-25-Stop", AI = false)
	private WebElement btnDisable_100;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-37-Start", AI = false)
	private WebElement btnEnable_147;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-3-Status']", AI = false)
	private WebElement inpStatus_10;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-25-Status']", AI = false)
	private WebElement inpStatus_98;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-39-Status']", AI = false)
	private WebElement inpStatus_154;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-4-Status']", AI = false)
	private WebElement inpStatus_14;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-38-Status']", AI = false)
	private WebElement inpStatus_150;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-5-Status']", AI = false)
	private WebElement inpStatus_18;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-globalButtonOn>div[role='button']", AI = false)
	private WebElement btnTurnIntentionalLoggingOn;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-11-Name']", AI = false)
	private WebElement inpElementName_41;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-22-Start", AI = false)
	private WebElement btnEnable_87;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-12-Name']", AI = false)
	private WebElement inpElementName_45;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-21-Start", AI = false)
	private WebElement btnEnable_83;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-13-Name']", AI = false)
	private WebElement inpElementName_49;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-17-Stop", AI = false)
	private WebElement btnDisable_68;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-27-Status']", AI = false)
	private WebElement inpStatus_106;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-18-Status']", AI = false)
	private WebElement inpStatus_70;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-39-Start", AI = false)
	private WebElement btnEnable_155;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-16-Stop", AI = false)
	private WebElement btnDisable_64;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-26-Status']", AI = false)
	private WebElement inpStatus_102;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-33-Stop", AI = false)
	private WebElement btnDisable_132;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-19-Status']", AI = false)
	private WebElement inpStatus_74;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-15-Stop", AI = false)
	private WebElement btnDisable_60;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-17-Status']", AI = false)
	private WebElement inpStatus_66;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-31-Stop", AI = false)
	private WebElement btnDisable_124;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-32-Stop", AI = false)
	private WebElement btnDisable_128;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-38-Start", AI = false)
	private WebElement btnEnable_151;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-0-Start", AI = false)
	private WebElement btnEnable;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-20-Start", AI = false)
	private WebElement btnEnable_79;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-2-Stop", AI = false)
	private WebElement btnDisable_8;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-9-Name']", AI = false)
	private WebElement inpElementName_33;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-19-Start", AI = false)
	private WebElement btnEnable_75;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-26-Name']", AI = false)
	private WebElement inpElementName_101;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-1-Stop", AI = false)
	private WebElement btnDisable_4;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-10-Name']", AI = false)
	private WebElement inpElementName_37;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-18-Start", AI = false)
	private WebElement btnEnable_71;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-3-Name']", AI = false)
	private WebElement inpElementName_9;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-14-Stop", AI = false)
	private WebElement btnDisable_56;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-21-Status']", AI = false)
	private WebElement inpStatus_82;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-2-Name']", AI = false)
	private WebElement inpElementName_5;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-13-Stop", AI = false)
	private WebElement btnDisable_52;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-30-Stop", AI = false)
	private WebElement btnDisable_120;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-1-Status']", AI = false)
	private WebElement inpStatus_2;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-29-Stop", AI = false)
	private WebElement btnDisable_116;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-1-Name']", AI = false)
	private WebElement inpElementName_1;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-20-Status']", AI = false)
	private WebElement inpStatus_78;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-2-Status']", AI = false)
	private WebElement inpStatus_6;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-28-Name']", AI = false)
	private WebElement inpElementName_109;

	@IFindBy(how = How.CSS, using = "#IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-17-Start", AI = false)
	private WebElement btnEnable_67;

	@IFindBy(how = How.CSS, using = "input[name='IntentionalLogging-IntentionalLoggingScreen-IntentionalLoggingLV-27-Name']", AI = false)
	private WebElement inpElementName_105;

	public IntentionalLoggingPage(){
	}

	public IntentionalLoggingPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//intentionalloggingTable = new IntentionalLogging();
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
}public IntentionalLoggingPage clickEnable_7(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_7,"Enable_7");
				    return this;
			}
public IntentionalLoggingPage clickEnable_63(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_63,"Enable_63");
				    return this;
			}
public IntentionalLoggingPage enterStatus(WebDriver driver,String Status) {
		            BrowserActions.type(driver, inpStatus,Status, "Status");
			        return this;
           }
public IntentionalLoggingPage enterElementName_65(WebDriver driver,String ElementName_65) {
		            BrowserActions.type(driver, inpElementName_65,ElementName_65, "ElementName_65");
			        return this;
           }
public IntentionalLoggingPage clickEnable_3(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_3,"Enable_3");
				    return this;
			}
public IntentionalLoggingPage enterElementName_69(WebDriver driver,String ElementName_69) {
		            BrowserActions.type(driver, inpElementName_69,ElementName_69, "ElementName_69");
			        return this;
           }
public IntentionalLoggingPage clickDisable_152(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_152,"Disable_152");
				    return this;
			}
public IntentionalLoggingPage clickDisable_88(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_88,"Disable_88");
				    return this;
			}
public IntentionalLoggingPage enterStatus_126(WebDriver driver,String Status_126) {
		            BrowserActions.type(driver, inpStatus_126,Status_126, "Status_126");
			        return this;
           }
public IntentionalLoggingPage clickDisable_156(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_156,"Disable_156");
				    return this;
			}
public IntentionalLoggingPage enterStatus_50(WebDriver driver,String Status_50) {
		            BrowserActions.type(driver, inpStatus_50,Status_50, "Status_50");
			        return this;
           }
public IntentionalLoggingPage enterStatus_42(WebDriver driver,String Status_42) {
		            BrowserActions.type(driver, inpStatus_42,Status_42, "Status_42");
			        return this;
           }
public IntentionalLoggingPage clickDisable_84(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_84,"Disable_84");
				    return this;
			}
public IntentionalLoggingPage enterStatus_122(WebDriver driver,String Status_122) {
		            BrowserActions.type(driver, inpStatus_122,Status_122, "Status_122");
			        return this;
           }
public IntentionalLoggingPage clickTurnIntentionalLoggingOff(WebDriver driver)  {
					BrowserActions.click(driver, btnTurnIntentionalLoggingOff,"TurnIntentionalLoggingOff");
				    return this;
			}
public IntentionalLoggingPage clickDisable_148(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_148,"Disable_148");
				    return this;
			}
public IntentionalLoggingPage enterStatus_46(WebDriver driver,String Status_46) {
		            BrowserActions.type(driver, inpStatus_46,Status_46, "Status_46");
			        return this;
           }
public IntentionalLoggingPage clickDisable_80(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_80,"Disable_80");
				    return this;
			}
public IntentionalLoggingPage clickEnable_59(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_59,"Enable_59");
				    return this;
			}
public IntentionalLoggingPage enterElementName_117(WebDriver driver,String ElementName_117) {
		            BrowserActions.type(driver, inpElementName_117,ElementName_117, "ElementName_117");
			        return this;
           }
public IntentionalLoggingPage clickEnable_55(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_55,"Enable_55");
				    return this;
			}
public IntentionalLoggingPage enterElementName_113(WebDriver driver,String ElementName_113) {
		            BrowserActions.type(driver, inpElementName_113,ElementName_113, "ElementName_113");
			        return this;
           }
public IntentionalLoggingPage enterElementName_73(WebDriver driver,String ElementName_73) {
		            BrowserActions.type(driver, inpElementName_73,ElementName_73, "ElementName_73");
			        return this;
           }
public IntentionalLoggingPage clickEnable_51(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_51,"Enable_51");
				    return this;
			}
public IntentionalLoggingPage enterElementName_53(WebDriver driver,String ElementName_53) {
		            BrowserActions.type(driver, inpElementName_53,ElementName_53, "ElementName_53");
			        return this;
           }
public IntentionalLoggingPage enterElementName_121(WebDriver driver,String ElementName_121) {
		            BrowserActions.type(driver, inpElementName_121,ElementName_121, "ElementName_121");
			        return this;
           }
public IntentionalLoggingPage clickEnable_107(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_107,"Enable_107");
				    return this;
			}
public IntentionalLoggingPage enterElementName_57(WebDriver driver,String ElementName_57) {
		            BrowserActions.type(driver, inpElementName_57,ElementName_57, "ElementName_57");
			        return this;
           }
public IntentionalLoggingPage enterStatus_118(WebDriver driver,String Status_118) {
		            BrowserActions.type(driver, inpStatus_118,Status_118, "Status_118");
			        return this;
           }
public IntentionalLoggingPage clickDisable_140(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_140,"Disable_140");
				    return this;
			}
public IntentionalLoggingPage clickDisable_76(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_76,"Disable_76");
				    return this;
			}
public IntentionalLoggingPage enterStatus_114(WebDriver driver,String Status_114) {
		            BrowserActions.type(driver, inpStatus_114,Status_114, "Status_114");
			        return this;
           }
public IntentionalLoggingPage clickDisable_144(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_144,"Disable_144");
				    return this;
			}
public IntentionalLoggingPage enterStatus_62(WebDriver driver,String Status_62) {
		            BrowserActions.type(driver, inpStatus_62,Status_62, "Status_62");
			        return this;
           }
public IntentionalLoggingPage clickEnable_103(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_103,"Enable_103");
				    return this;
			}
public IntentionalLoggingPage enterStatus_54(WebDriver driver,String Status_54) {
		            BrowserActions.type(driver, inpStatus_54,Status_54, "Status_54");
			        return this;
           }
public IntentionalLoggingPage clickDisable_72(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_72,"Disable_72");
				    return this;
			}
public IntentionalLoggingPage enterStatus_110(WebDriver driver,String Status_110) {
		            BrowserActions.type(driver, inpStatus_110,Status_110, "Status_110");
			        return this;
           }
public IntentionalLoggingPage enterElementName(WebDriver driver,String ElementName) {
		            BrowserActions.type(driver, inpElementName,ElementName, "ElementName");
			        return this;
           }
public IntentionalLoggingPage clickDisable_136(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_136,"Disable_136");
				    return this;
			}
public IntentionalLoggingPage enterStatus_58(WebDriver driver,String Status_58) {
		            BrowserActions.type(driver, inpStatus_58,Status_58, "Status_58");
			        return this;
           }
public IntentionalLoggingPage enterElementName_129(WebDriver driver,String ElementName_129) {
		            BrowserActions.type(driver, inpElementName_129,ElementName_129, "ElementName_129");
			        return this;
           }
public IntentionalLoggingPage enterElementName_125(WebDriver driver,String ElementName_125) {
		            BrowserActions.type(driver, inpElementName_125,ElementName_125, "ElementName_125");
			        return this;
           }
public IntentionalLoggingPage clickEnable_47(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_47,"Enable_47");
				    return this;
			}
public IntentionalLoggingPage enterElementName_61(WebDriver driver,String ElementName_61) {
		            BrowserActions.type(driver, inpElementName_61,ElementName_61, "ElementName_61");
			        return this;
           }
public IntentionalLoggingPage enterElementName_85(WebDriver driver,String ElementName_85) {
		            BrowserActions.type(driver, inpElementName_85,ElementName_85, "ElementName_85");
			        return this;
           }
public IntentionalLoggingPage enterElementName_133(WebDriver driver,String ElementName_133) {
		            BrowserActions.type(driver, inpElementName_133,ElementName_133, "ElementName_133");
			        return this;
           }
public IntentionalLoggingPage clickEnable_43(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_43,"Enable_43");
				    return this;
			}
public IntentionalLoggingPage clickEnable_119(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_119,"Enable_119");
				    return this;
			}
public IntentionalLoggingPage enterElementName_89(WebDriver driver,String ElementName_89) {
		            BrowserActions.type(driver, inpElementName_89,ElementName_89, "ElementName_89");
			        return this;
           }
public IntentionalLoggingPage clickDisable_28(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_28,"Disable_28");
				    return this;
			}
public IntentionalLoggingPage clickDisable_24(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_24,"Disable_24");
				    return this;
			}
public IntentionalLoggingPage clickEnable_111(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_111,"Enable_111");
				    return this;
			}
public IntentionalLoggingPage clickDisable_20(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_20,"Disable_20");
				    return this;
			}
public IntentionalLoggingPage enterStatus_146(WebDriver driver,String Status_146) {
		            BrowserActions.type(driver, inpStatus_146,Status_146, "Status_146");
			        return this;
           }
public IntentionalLoggingPage enterStatus_30(WebDriver driver,String Status_30) {
		            BrowserActions.type(driver, inpStatus_30,Status_30, "Status_30");
			        return this;
           }
public IntentionalLoggingPage clickEnable_115(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_115,"Enable_115");
				    return this;
			}
public IntentionalLoggingPage enterStatus_22(WebDriver driver,String Status_22) {
		            BrowserActions.type(driver, inpStatus_22,Status_22, "Status_22");
			        return this;
           }
public IntentionalLoggingPage enterStatus_142(WebDriver driver,String Status_142) {
		            BrowserActions.type(driver, inpStatus_142,Status_142, "Status_142");
			        return this;
           }
public IntentionalLoggingPage enterStatus_26(WebDriver driver,String Status_26) {
		            BrowserActions.type(driver, inpStatus_26,Status_26, "Status_26");
			        return this;
           }
public IntentionalLoggingPage clickEnable_39(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_39,"Enable_39");
				    return this;
			}
public IntentionalLoggingPage clickDisable(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable,"Disable");
				    return this;
			}
public IntentionalLoggingPage enterElementName_93(WebDriver driver,String ElementName_93) {
		            BrowserActions.type(driver, inpElementName_93,ElementName_93, "ElementName_93");
			        return this;
           }
public IntentionalLoggingPage clickEnable_35(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_35,"Enable_35");
				    return this;
			}
public IntentionalLoggingPage enterElementName_137(WebDriver driver,String ElementName_137) {
		            BrowserActions.type(driver, inpElementName_137,ElementName_137, "ElementName_137");
			        return this;
           }
public IntentionalLoggingPage clickEnable_31(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_31,"Enable_31");
				    return this;
			}
public IntentionalLoggingPage enterElementName_77(WebDriver driver,String ElementName_77) {
		            BrowserActions.type(driver, inpElementName_77,ElementName_77, "ElementName_77");
			        return this;
           }
public IntentionalLoggingPage enterElementName_145(WebDriver driver,String ElementName_145) {
		            BrowserActions.type(driver, inpElementName_145,ElementName_145, "ElementName_145");
			        return this;
           }
public IntentionalLoggingPage clickDisable_16(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_16,"Disable_16");
				    return this;
			}
public IntentionalLoggingPage enterElementName_141(WebDriver driver,String ElementName_141) {
		            BrowserActions.type(driver, inpElementName_141,ElementName_141, "ElementName_141");
			        return this;
           }
public IntentionalLoggingPage clickEnable_123(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_123,"Enable_123");
				    return this;
			}
public IntentionalLoggingPage clickDisable_12(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_12,"Disable_12");
				    return this;
			}
public IntentionalLoggingPage enterStatus_138(WebDriver driver,String Status_138) {
		            BrowserActions.type(driver, inpStatus_138,Status_138, "Status_138");
			        return this;
           }
public IntentionalLoggingPage clickEnable_127(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_127,"Enable_127");
				    return this;
			}
public IntentionalLoggingPage clickDisable_96(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_96,"Disable_96");
				    return this;
			}
public IntentionalLoggingPage enterStatus_134(WebDriver driver,String Status_134) {
		            BrowserActions.type(driver, inpStatus_134,Status_134, "Status_134");
			        return this;
           }
public IntentionalLoggingPage enterStatus_34(WebDriver driver,String Status_34) {
		            BrowserActions.type(driver, inpStatus_34,Status_34, "Status_34");
			        return this;
           }
public IntentionalLoggingPage clickDisable_92(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_92,"Disable_92");
				    return this;
			}
public IntentionalLoggingPage enterStatus_130(WebDriver driver,String Status_130) {
		            BrowserActions.type(driver, inpStatus_130,Status_130, "Status_130");
			        return this;
           }
public IntentionalLoggingPage enterStatus_38(WebDriver driver,String Status_38) {
		            BrowserActions.type(driver, inpStatus_38,Status_38, "Status_38");
			        return this;
           }
public IntentionalLoggingPage clickEnable_27(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_27,"Enable_27");
				    return this;
			}
public IntentionalLoggingPage clickEnable_23(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_23,"Enable_23");
				    return this;
			}
public IntentionalLoggingPage enterElementName_81(WebDriver driver,String ElementName_81) {
		            BrowserActions.type(driver, inpElementName_81,ElementName_81, "ElementName_81");
			        return this;
           }
public IntentionalLoggingPage enterElementName_149(WebDriver driver,String ElementName_149) {
		            BrowserActions.type(driver, inpElementName_149,ElementName_149, "ElementName_149");
			        return this;
           }
public IntentionalLoggingPage enterElementName_153(WebDriver driver,String ElementName_153) {
		            BrowserActions.type(driver, inpElementName_153,ElementName_153, "ElementName_153");
			        return this;
           }
public IntentionalLoggingPage enterElementName_21(WebDriver driver,String ElementName_21) {
		            BrowserActions.type(driver, inpElementName_21,ElementName_21, "ElementName_21");
			        return this;
           }
public IntentionalLoggingPage enterElementName_25(WebDriver driver,String ElementName_25) {
		            BrowserActions.type(driver, inpElementName_25,ElementName_25, "ElementName_25");
			        return this;
           }
public IntentionalLoggingPage clickDisable_48(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_48,"Disable_48");
				    return this;
			}
public IntentionalLoggingPage enterStatus_90(WebDriver driver,String Status_90) {
		            BrowserActions.type(driver, inpStatus_90,Status_90, "Status_90");
			        return this;
           }
public IntentionalLoggingPage clickEnable_135(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_135,"Enable_135");
				    return this;
			}
public IntentionalLoggingPage enterElementName_29(WebDriver driver,String ElementName_29) {
		            BrowserActions.type(driver, inpElementName_29,ElementName_29, "ElementName_29");
			        return this;
           }
public IntentionalLoggingPage clickDisable_44(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_44,"Disable_44");
				    return this;
			}
public IntentionalLoggingPage clickDisable_112(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_112,"Disable_112");
				    return this;
			}
public IntentionalLoggingPage enterStatus_94(WebDriver driver,String Status_94) {
		            BrowserActions.type(driver, inpStatus_94,Status_94, "Status_94");
			        return this;
           }
public IntentionalLoggingPage clickEnable_139(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_139,"Enable_139");
				    return this;
			}
public IntentionalLoggingPage clickDisable_40(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_40,"Disable_40");
				    return this;
			}
public IntentionalLoggingPage enterStatus_86(WebDriver driver,String Status_86) {
		            BrowserActions.type(driver, inpStatus_86,Status_86, "Status_86");
			        return this;
           }
public IntentionalLoggingPage clickDisable_104(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_104,"Disable_104");
				    return this;
			}
public IntentionalLoggingPage clickEnable_19(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_19,"Enable_19");
				    return this;
			}
public IntentionalLoggingPage clickDisable_108(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_108,"Disable_108");
				    return this;
			}
public IntentionalLoggingPage clickEnable_131(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_131,"Enable_131");
				    return this;
			}
public IntentionalLoggingPage clickEnable_15(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_15,"Enable_15");
				    return this;
			}
public IntentionalLoggingPage clickEnable_11(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_11,"Enable_11");
				    return this;
			}
public IntentionalLoggingPage clickEnable_99(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_99,"Enable_99");
				    return this;
			}
public IntentionalLoggingPage clickEnable_95(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_95,"Enable_95");
				    return this;
			}
public IntentionalLoggingPage enterElementName_97(WebDriver driver,String ElementName_97) {
		            BrowserActions.type(driver, inpElementName_97,ElementName_97, "ElementName_97");
			        return this;
           }
public IntentionalLoggingPage enterElementName_13(WebDriver driver,String ElementName_13) {
		            BrowserActions.type(driver, inpElementName_13,ElementName_13, "ElementName_13");
			        return this;
           }
public IntentionalLoggingPage clickEnable_91(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_91,"Enable_91");
				    return this;
			}
public IntentionalLoggingPage enterElementName_17(WebDriver driver,String ElementName_17) {
		            BrowserActions.type(driver, inpElementName_17,ElementName_17, "ElementName_17");
			        return this;
           }
public IntentionalLoggingPage clickDisable_36(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_36,"Disable_36");
				    return this;
			}
public IntentionalLoggingPage clickEnable_143(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_143,"Enable_143");
				    return this;
			}
public IntentionalLoggingPage clickDisable_32(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_32,"Disable_32");
				    return this;
			}
public IntentionalLoggingPage clickDisable_100(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_100,"Disable_100");
				    return this;
			}
public IntentionalLoggingPage clickEnable_147(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_147,"Enable_147");
				    return this;
			}
public IntentionalLoggingPage enterStatus_10(WebDriver driver,String Status_10) {
		            BrowserActions.type(driver, inpStatus_10,Status_10, "Status_10");
			        return this;
           }
public IntentionalLoggingPage enterStatus_98(WebDriver driver,String Status_98) {
		            BrowserActions.type(driver, inpStatus_98,Status_98, "Status_98");
			        return this;
           }
public IntentionalLoggingPage enterStatus_154(WebDriver driver,String Status_154) {
		            BrowserActions.type(driver, inpStatus_154,Status_154, "Status_154");
			        return this;
           }
public IntentionalLoggingPage enterStatus_14(WebDriver driver,String Status_14) {
		            BrowserActions.type(driver, inpStatus_14,Status_14, "Status_14");
			        return this;
           }
public IntentionalLoggingPage enterStatus_150(WebDriver driver,String Status_150) {
		            BrowserActions.type(driver, inpStatus_150,Status_150, "Status_150");
			        return this;
           }
public IntentionalLoggingPage enterStatus_18(WebDriver driver,String Status_18) {
		            BrowserActions.type(driver, inpStatus_18,Status_18, "Status_18");
			        return this;
           }
public IntentionalLoggingPage clickTurnIntentionalLoggingOn(WebDriver driver)  {
					BrowserActions.click(driver, btnTurnIntentionalLoggingOn,"TurnIntentionalLoggingOn");
				    return this;
			}
public IntentionalLoggingPage enterElementName_41(WebDriver driver,String ElementName_41) {
		            BrowserActions.type(driver, inpElementName_41,ElementName_41, "ElementName_41");
			        return this;
           }
public IntentionalLoggingPage clickEnable_87(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_87,"Enable_87");
				    return this;
			}
public IntentionalLoggingPage enterElementName_45(WebDriver driver,String ElementName_45) {
		            BrowserActions.type(driver, inpElementName_45,ElementName_45, "ElementName_45");
			        return this;
           }
public IntentionalLoggingPage clickEnable_83(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_83,"Enable_83");
				    return this;
			}
public IntentionalLoggingPage enterElementName_49(WebDriver driver,String ElementName_49) {
		            BrowserActions.type(driver, inpElementName_49,ElementName_49, "ElementName_49");
			        return this;
           }
public IntentionalLoggingPage clickDisable_68(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_68,"Disable_68");
				    return this;
			}
public IntentionalLoggingPage enterStatus_106(WebDriver driver,String Status_106) {
		            BrowserActions.type(driver, inpStatus_106,Status_106, "Status_106");
			        return this;
           }
public IntentionalLoggingPage enterStatus_70(WebDriver driver,String Status_70) {
		            BrowserActions.type(driver, inpStatus_70,Status_70, "Status_70");
			        return this;
           }
public IntentionalLoggingPage clickEnable_155(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_155,"Enable_155");
				    return this;
			}
public IntentionalLoggingPage clickDisable_64(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_64,"Disable_64");
				    return this;
			}
public IntentionalLoggingPage enterStatus_102(WebDriver driver,String Status_102) {
		            BrowserActions.type(driver, inpStatus_102,Status_102, "Status_102");
			        return this;
           }
public IntentionalLoggingPage clickDisable_132(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_132,"Disable_132");
				    return this;
			}
public IntentionalLoggingPage enterStatus_74(WebDriver driver,String Status_74) {
		            BrowserActions.type(driver, inpStatus_74,Status_74, "Status_74");
			        return this;
           }
public IntentionalLoggingPage clickDisable_60(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_60,"Disable_60");
				    return this;
			}
public IntentionalLoggingPage enterStatus_66(WebDriver driver,String Status_66) {
		            BrowserActions.type(driver, inpStatus_66,Status_66, "Status_66");
			        return this;
           }
public IntentionalLoggingPage clickDisable_124(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_124,"Disable_124");
				    return this;
			}
public IntentionalLoggingPage clickDisable_128(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_128,"Disable_128");
				    return this;
			}
public IntentionalLoggingPage clickEnable_151(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_151,"Enable_151");
				    return this;
			}
public IntentionalLoggingPage clickEnable(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable,"Enable");
				    return this;
			}
public IntentionalLoggingPage clickEnable_79(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_79,"Enable_79");
				    return this;
			}
public IntentionalLoggingPage clickDisable_8(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_8,"Disable_8");
				    return this;
			}
public IntentionalLoggingPage enterElementName_33(WebDriver driver,String ElementName_33) {
		            BrowserActions.type(driver, inpElementName_33,ElementName_33, "ElementName_33");
			        return this;
           }
public IntentionalLoggingPage clickEnable_75(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_75,"Enable_75");
				    return this;
			}
public IntentionalLoggingPage enterElementName_101(WebDriver driver,String ElementName_101) {
		            BrowserActions.type(driver, inpElementName_101,ElementName_101, "ElementName_101");
			        return this;
           }
public IntentionalLoggingPage clickDisable_4(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_4,"Disable_4");
				    return this;
			}
public IntentionalLoggingPage enterElementName_37(WebDriver driver,String ElementName_37) {
		            BrowserActions.type(driver, inpElementName_37,ElementName_37, "ElementName_37");
			        return this;
           }
public IntentionalLoggingPage clickEnable_71(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_71,"Enable_71");
				    return this;
			}
public IntentionalLoggingPage enterElementName_9(WebDriver driver,String ElementName_9) {
		            BrowserActions.type(driver, inpElementName_9,ElementName_9, "ElementName_9");
			        return this;
           }
public IntentionalLoggingPage clickDisable_56(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_56,"Disable_56");
				    return this;
			}
public IntentionalLoggingPage enterStatus_82(WebDriver driver,String Status_82) {
		            BrowserActions.type(driver, inpStatus_82,Status_82, "Status_82");
			        return this;
           }
public IntentionalLoggingPage enterElementName_5(WebDriver driver,String ElementName_5) {
		            BrowserActions.type(driver, inpElementName_5,ElementName_5, "ElementName_5");
			        return this;
           }
public IntentionalLoggingPage clickDisable_52(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_52,"Disable_52");
				    return this;
			}
public IntentionalLoggingPage clickDisable_120(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_120,"Disable_120");
				    return this;
			}
public IntentionalLoggingPage enterStatus_2(WebDriver driver,String Status_2) {
		            BrowserActions.type(driver, inpStatus_2,Status_2, "Status_2");
			        return this;
           }
public IntentionalLoggingPage clickDisable_116(WebDriver driver)  {
					BrowserActions.click(driver, btnDisable_116,"Disable_116");
				    return this;
			}
public IntentionalLoggingPage enterElementName_1(WebDriver driver,String ElementName_1) {
		            BrowserActions.type(driver, inpElementName_1,ElementName_1, "ElementName_1");
			        return this;
           }
public IntentionalLoggingPage enterStatus_78(WebDriver driver,String Status_78) {
		            BrowserActions.type(driver, inpStatus_78,Status_78, "Status_78");
			        return this;
           }
public IntentionalLoggingPage enterStatus_6(WebDriver driver,String Status_6) {
		            BrowserActions.type(driver, inpStatus_6,Status_6, "Status_6");
			        return this;
           }
public IntentionalLoggingPage enterElementName_109(WebDriver driver,String ElementName_109) {
		            BrowserActions.type(driver, inpElementName_109,ElementName_109, "ElementName_109");
			        return this;
           }
public IntentionalLoggingPage clickEnable_67(WebDriver driver)  {
					BrowserActions.click(driver, btnEnable_67,"Enable_67");
				    return this;
			}
public IntentionalLoggingPage enterElementName_105(WebDriver driver,String ElementName_105) {
		            BrowserActions.type(driver, inpElementName_105,ElementName_105, "ElementName_105");
			        return this;
           }
public IntentionalLoggingPage verifyTurnIntentionalLoggingOn(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnTurnIntentionalLoggingOn,"Turn IntentionalLoggingOn");
	Log.messageStep("Turn Intentional Logging On and Turn Intentional Logging Off Button is Displayed",DriverManager.getDriver());
    return this;
}
public IntentionalLoggingPage verifyTurnIntentionalLoggingOff(WebDriver driver)  {
	BrowserActions.verifyElementIsEnabled(driver, btnTurnIntentionalLoggingOff,"Turn IntentionalLoggingOff");
	return this;
}
}
