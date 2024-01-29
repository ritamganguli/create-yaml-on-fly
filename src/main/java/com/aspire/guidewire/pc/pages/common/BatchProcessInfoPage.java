package com.aspire.guidewire.pc.pages.common;
import java.io.File;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;


public class BatchProcessInfoPage extends LoadableComponent<BatchProcessInfoPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public BatchProcessScreen batchprocessscreenTable;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_353;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_198;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-LastRun']", AI = false)
	private WebElement inpLastRun_246;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-ScheduleStart", AI = false)
	private WebElement btnStart_112;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_115;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-LastRun']", AI = false)
	private WebElement inpLastRun_484;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-ScheduleStart", AI = false)
	private WebElement btnStart_350;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_591;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_711;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-Description']", AI = false)
	private WebElement inpDescription_116;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-ScheduleSync", AI = false)
	private WebElement btnSync_85;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_511;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-Description']", AI = false)
	private WebElement inpDescription_354;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-Description']", AI = false)
	private WebElement inpDescription_592;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_101;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-ScheduleStart", AI = false)
	private WebElement btnStart_588;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-LastRun']", AI = false)
	private WebElement inpLastRun_498;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_23;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_725;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV_tb-download>div[role='button']", AI = false)
	private WebElement btnDownload;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_525;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-Description']", AI = false)
	private WebElement inpDescription_102;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_763;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-ScheduleSync", AI = false)
	private WebElement btnSync_71;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-Description']", AI = false)
	private WebElement inpDescription_340;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-ScheduleStart", AI = false)
	private WebElement btnStart_378;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_577;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-LastRun']", AI = false)
	private WebElement inpLastRun_260;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_735;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-Description']", AI = false)
	private WebElement inpDescription_578;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_339;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_739;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-SchedulerSuspendedAlert .gw-AlertBar--label", AI = false)
	private WebElement lblSchedulersuspended;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-ScheduleStart", AI = false)
	private WebElement btnStart_126;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_563;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-LastRun']", AI = false)
	private WebElement inpLastRun_274;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_325;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-ScheduleStart", AI = false)
	private WebElement btnStart_364;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-LastRunStatus", AI = false)
	private WebElement txtLastRunStatus;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-LastRunStatus", AI = false)
	private WebElement txtLastRunStatusofAggregate;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-LastRunStatus", AI = false)
	private WebElement txtLastRunStatusofArchiveReference;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_749;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_501;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-ScheduleSync", AI = false)
	private WebElement btnSync_99;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-Description']", AI = false)
	private WebElement inpDescription_326;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-Description']", AI = false)
	private WebElement inpDescription_564;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_157;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-LastRun']", AI = false)
	private WebElement inpLastRun_288;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_395;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_515;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-ProcuessHistoryCV-ProcessHistoryChartTabTab", AI = false)
	private WebElement btnChart_773;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_65;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_753;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_315;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-Description']", AI = false)
	private WebElement inpDescription_312;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_553;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-Description']", AI = false)
	private WebElement inpDescription_550;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_173;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-ScheduleStart", AI = false)
	private WebElement btnStart_308;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_143;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-ScheduleStart", AI = false)
	private WebElement btnStart_546;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_381;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_767;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_329;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_567;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_529;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_187;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-ScheduleStart", AI = false)
	private WebElement btnStart_336;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-ScheduleStart", AI = false)
	private WebElement btnStart_574;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_17;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_37;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_539;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-Description']", AI = false)
	private WebElement inpDescription_536;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-ScheduleStart", AI = false)
	private WebElement btnStart_322;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_367;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-ScheduleStart", AI = false)
	private WebElement btnStart_560;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_305;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_543;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_51;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-Description']", AI = false)
	private WebElement inpDescription_522;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_129;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_301;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-Description']", AI = false)
	private WebElement inpDescription_760;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_590;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_199;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-ScheduleStart", AI = false)
	private WebElement btnStart_756;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_352;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_31;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_369;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-ScheduleStop", AI = false)
	private WebElement btnStop_713;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_166;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-ScheduleStart", AI = false)
	private WebElement btnStart_14;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-ScheduleSync", AI = false)
	private WebElement btnSync_715;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-ScheduleStart", AI = false)
	private WebElement btnStart_504;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_131;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-ScheduleStart", AI = false)
	private WebElement btnStart_742;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_720;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_45;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-ScheduleStop", AI = false)
	private WebElement btnStop_727;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_185;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-ScheduleStart", AI = false)
	private WebElement btnStart_28;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_163;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-Description']", AI = false)
	private WebElement inpDescription_508;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_180;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-ScheduleSync", AI = false)
	private WebElement btnSync_701;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-Description']", AI = false)
	private WebElement inpDescription_746;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_276;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_114;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_383;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_145;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-ScheduleStart", AI = false)
	private WebElement btnStart_532;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_171;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-ScheduleStart", AI = false)
	private WebElement btnStart_770;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_79;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_59;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_373;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-ScheduleSync", AI = false)
	private WebElement btnSync_29;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_135;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-Description']", AI = false)
	private WebElement inpDescription_732;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_366;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_128;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_380;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_397;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-ScheduleStart", AI = false)
	private WebElement btnStart_42;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_142;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_159;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_194;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_706;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-ScheduleSync", AI = false)
	private WebElement btnSync_15;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_387;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_93;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_149;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_290;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-ScheduleStart", AI = false)
	private WebElement btnStart_518;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_394;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_565;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_156;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-ScheduleStop", AI = false)
	private WebElement btnStop_755;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_73;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_327;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_191;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-Description']", AI = false)
	private WebElement inpDescription_718;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-ScheduleSync", AI = false)
	private WebElement btnSync_757;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-ScheduleStop", AI = false)
	private WebElement btnStop_517;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-ScheduleSync", AI = false)
	private WebElement btnSync_519;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV_tb-suspendScheduler>div[role='button']", AI = false)
	private WebElement btnSuspendScheduler;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-ScheduleSync", AI = false)
	private WebElement btnSync_43;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_510;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-ScheduleStart", AI = false)
	private WebElement btnStart_700;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_762;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_87;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_579;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-ScheduleStop", AI = false)
	private WebElement btnStop_769;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-ScheduleSync", AI = false)
	private WebElement btnSync_743;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-ScheduleSync", AI = false)
	private WebElement btnSync_505;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-Description']", AI = false)
	private WebElement inpDescription_704;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_721;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_524;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_341;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_103;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_734;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_170;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_177;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-ScheduleStart", AI = false)
	private WebElement btnStart_728;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_593;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_184;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_355;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-ScheduleStop", AI = false)
	private WebElement btnStop_741;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_117;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_748;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_707;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-ScheduleSync", AI = false)
	private WebElement btnSync_729;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-ScheduleSync", AI = false)
	private WebElement btnSync_57;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-ScheduleStop", AI = false)
	private WebElement btnStop_503;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-ScheduleStart", AI = false)
	private WebElement btnStart_714;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_208;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_446;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_444;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-ScheduleSync", AI = false)
	private WebElement btnSync_673;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-ScheduleStart", AI = false)
	private WebElement btnStart_98;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_684;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_649;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_151;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_206;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-ScheduleSync", AI = false)
	private WebElement btnSync_435;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_506;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_682;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-ScheduleStop", AI = false)
	private WebElement btnStop_559;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_314;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-LastRun']", AI = false)
	private WebElement inpLastRun_8;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_744;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_552;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_26;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_411;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_698;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-ScheduleSync", AI = false)
	private WebElement btnSync_421;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_165;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_681;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_443;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_430;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_328;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_205;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_566;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-ScheduleStop", AI = false)
	private WebElement btnStop_321;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_758;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_663;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_772;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_12;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_425;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_222;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_460;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-ScheduleSync", AI = false)
	private WebElement btnSync_659;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_653;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_220;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_21;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_538;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_179;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_415;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_520;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-ScheduleStop", AI = false)
	private WebElement btnStop_531;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_175;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-ScheduleStart", AI = false)
	private WebElement btnStart;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_677;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_236;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_696;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_439;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_474;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_458;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-ScheduleSync", AI = false)
	private WebElement btnSync_645;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-ScheduleSync", AI = false)
	private WebElement btnSync_407;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-ScheduleStop", AI = false)
	private WebElement btnStop_307;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_667;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_534;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-ScheduleStop", AI = false)
	private WebElement btnStop_545;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_189;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_300;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_429;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_594;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_488;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_310;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-ScheduleStart", AI = false)
	private WebElement btnStart_56;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_248;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_607;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_471;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_193;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-ScheduleSync", AI = false)
	private WebElement btnSync_477;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_233;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-ScheduleSync", AI = false)
	private WebElement btnSync_239;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_486;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_118;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV_tb-resumeScheduler>div[role='button']", AI = false)
	private WebElement btnResumeScheduler;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_356;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-ScheduleStop", AI = false)
	private WebElement btnStop_111;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_548;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_717;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-ScheduleStop", AI = false)
	private WebElement btnStop_363;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_68;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_562;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_234;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-BatchProcess']", AI = false)
	private WebElement drpBatchProcess;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-ScheduleSync", AI = false)
	private WebElement btnSync_463;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-ScheduleSync", AI = false)
	private WebElement btnSync_225;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_250;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_485;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_472;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_247;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_703;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-ScheduleStop", AI = false)
	private WebElement btnStop_125;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-ScheduleStart", AI = false)
	private WebElement btnStart_70;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_54;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_621;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_264;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-ScheduleSync", AI = false)
	private WebElement btnSync_211;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_695;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_262;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_457;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_219;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_324;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-ScheduleStop", AI = false)
	private WebElement btnStop_335;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-LastRun']", AI = false)
	private WebElement inpLastRun_610;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-ScheduleStop", AI = false)
	private WebElement btnStop_573;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_580;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_278;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-ScheduleStart", AI = false)
	private WebElement btnStart_84;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_100;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_635;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_40;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-ScheduleSync", AI = false)
	private WebElement btnSync_687;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-ScheduleSync", AI = false)
	private WebElement btnSync_449;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-ScheduleStop", AI = false)
	private WebElement btnStop_349;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_576;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_104;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_338;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-ScheduleStop", AI = false)
	private WebElement btnStop_587;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_342;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-LastRun']", AI = false)
	private WebElement inpLastRun_624;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-ScheduleStop", AI = false)
	private WebElement btnStop_153;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-LastRun']", AI = false)
	private WebElement inpLastRun_400;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-ScheduleStop", AI = false)
	private WebElement btnStop_391;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_600;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-Description']", AI = false)
	private WebElement inpDescription_32;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-ScheduleStart", AI = false)
	private WebElement btnStart_196;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_557;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_38;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_119;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_357;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_759;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-LastRun']", AI = false)
	private WebElement inpLastRun_638;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_595;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_398;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_319;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_371;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-LastRun']", AI = false)
	private WebElement inpLastRun_652;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_614;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_160;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-ScheduleSync", AI = false)
	private WebElement btnSync_267;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-ScheduleStart", AI = false)
	private WebElement btnStart_182;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-Description']", AI = false)
	private WebElement inpDescription_46;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_745;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-ScheduleStop", AI = false)
	private WebElement btnStop_167;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_507;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_132;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_581;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_96;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_370;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-ScheduleSync", AI = false)
	private WebElement btnSync_491;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_731;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-ScheduleSync", AI = false)
	private WebElement btnSync_253;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_571;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_626;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_333;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-ScheduleStop", AI = false)
	private WebElement btnStop_139;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_628;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-ScheduleSync", AI = false)
	private WebElement btnSync;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-Description']", AI = false)
	private WebElement inpDescription_298;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-ScheduleStop", AI = false)
	private WebElement btnStop_377;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_10;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-LastRun']", AI = false)
	private WebElement inpLastRun_414;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-Description']", AI = false)
	private WebElement inpDescription_18;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_384;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_585;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_612;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-NextRun']", AI = false)
	private WebElement inpNextScheduledRun;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_82;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_109;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_347;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_105;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_24;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-LastRun']", AI = false)
	private WebElement inpLastRun_428;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_343;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_146;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-LastRun']", AI = false)
	private WebElement inpLastRun_666;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-Description']", AI = false)
	private WebElement inpDescription_284;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_404;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-Description']", AI = false)
	private WebElement inpDescription_74;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_311;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-LastRun']", AI = false)
	private WebElement inpLastRun_442;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_161;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-ScheduleStop", AI = false)
	private WebElement btnStop_195;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_642;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-LastRun']", AI = false)
	private WebElement inpLastRun_680;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_80;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-ScheduleStart", AI = false)
	private WebElement btnStart_154;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_402;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-ScheduleStart", AI = false)
	private WebElement btnStart_392;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_599;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_640;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_399;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_639;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_702;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-LastRun']", AI = false)
	private WebElement inpLastRun_694;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_656;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_94;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-Description']", AI = false)
	private WebElement inpDescription_270;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-Description']", AI = false)
	private WebElement inpDescription_88;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_123;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-ScheduleStart", AI = false)
	private WebElement btnStart_140;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_361;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_716;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_401;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_549;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-LastRun']", AI = false)
	private WebElement inpLastRun_204;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_418;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_174;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-ScheduleSync", AI = false)
	private WebElement btnSync_295;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_535;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_375;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-LastRunStatus", AI = false)
	private WebElement inpLastRunStatus_668;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-LastRunStatus", AI = false)
	private WebElement txtLastRunStatus_6;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-ScheduleStop", AI = false)
	private WebElement btnStop_2;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_6;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_137;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_611;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-Description']", AI = false)
	private WebElement inpDescription_256;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_52;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-LastRun']", AI = false)
	private WebElement inpLastRun_456;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_133;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-LastRun", AI = false)
	private WebElement txtLastRun;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-LastRun", AI = false)
	private WebElement txtLastRunAggregate;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-LastRun", AI = false)
	private WebElement txtLastRunArchivereference;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-LastRun']", AI = false)
	private WebElement inpLastRun_218;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-Description']", AI = false)
	private WebElement inpDescription_494;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-ScheduleSync", AI = false)
	private WebElement btnSync_281;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-Description']", AI = false)
	private WebElement inpDescription_60;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-LastRun']", AI = false)
	private WebElement inpLastRun_470;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_432;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-ScheduleStart", AI = false)
	private WebElement btnStart_168;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-ScheduleStop", AI = false)
	private WebElement btnStop_181;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_521;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-LastRun']", AI = false)
	private WebElement inpLastRun_232;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_670;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_654;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_416;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_389;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_730;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_147;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_625;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-Description']", AI = false)
	private WebElement inpDescription_242;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_385;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-LastRunStatus", AI = false)
	private WebElement txtLastRunStatus_66;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_188;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-Description']", AI = false)
	private WebElement inpDescription_480;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-LastRun']", AI = false)
	private WebElement inpLastRun_120;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-ScheduleStart", AI = false)
	private WebElement btnStart_238;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_479;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-ScheduleStart", AI = false)
	private WebElement btnStart_476;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_637;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-LastRun']", AI = false)
	private WebElement inpLastRun_358;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_465;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-ProcessUsageFilter']", AI = false)
	private WebElement drpProcessUsageFilter_1;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_227;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-LastRun']", AI = false)
	private WebElement inpLastRun_372;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-LastRun']", AI = false)
	private WebElement inpLastRun_134;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-ScheduleStart", AI = false)
	private WebElement btnStart_224;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-ScheduleStart", AI = false)
	private WebElement btnStart_462;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-Description']", AI = false)
	private WebElement inpDescription_228;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-Description']", AI = false)
	private WebElement inpDescription_466;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-LastRun']", AI = false)
	private WebElement inpLastRun_386;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_451;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_213;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-ScheduleStart", AI = false)
	private WebElement btnStart_252;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-ScheduleStart", AI = false)
	private WebElement btnStart_490;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_613;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-Description']", AI = false)
	private WebElement inpDescription_214;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-Description']", AI = false)
	private WebElement inpDescription_452;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_19;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-Description']", AI = false)
	private WebElement inpDescription_690;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_689;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_623;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-Description']", AI = false)
	private WebElement inpDescription_200;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-LastRun']", AI = false)
	private WebElement inpLastRun_148;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_627;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-ScheduleStart", AI = false)
	private WebElement btnStart_434;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-LastRun']", AI = false)
	private WebElement inpLastRun_162;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-ScheduleStart", AI = false)
	private WebElement btnStart_672;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_72;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-Description']", AI = false)
	private WebElement inpDescription_438;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_679;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-Description']", AI = false)
	private WebElement inpDescription_676;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-LastRun']", AI = false)
	private WebElement inpLastRun_176;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_299;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-ScheduleStart", AI = false)
	private WebElement btnStart_420;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_269;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_403;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-Description']", AI = false)
	private WebElement inpDescription_424;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_641;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_203;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-Description']", AI = false)
	private WebElement inpDescription_662;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-ScheduleStart", AI = false)
	private WebElement btnStart_658;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_441;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_255;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-ScheduleStart", AI = false)
	private WebElement btnStart_210;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_493;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_417;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_655;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_413;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_7;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-Description']", AI = false)
	private WebElement inpDescription_410;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_651;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_712;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-SchedulerSuspendedAlert-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-ScheduleStart", AI = false)
	private WebElement btnStart_448;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-ScheduleStart", AI = false)
	private WebElement btnStart_686;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-LastRun']", AI = false)
	private WebElement inpLastRun_190;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_241;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_669;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-Description']", AI = false)
	private WebElement inpDescription_648;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_86;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_427;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_665;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_243;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-ScheduleStart", AI = false)
	private WebElement btnStart_630;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_34;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_275;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV_tb-refresh>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_164;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_30;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-ScheduleStop", AI = false)
	private WebElement btnStop_41;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-Description']", AI = false)
	private WebElement inpDescription_634;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_95;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_226;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_495;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-Description']", AI = false)
	private WebElement inpDescription_4;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_240;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_257;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_48;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_292;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_150;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_608;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_289;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_77;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-Description']", AI = false)
	private WebElement inpDescription_620;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-ScheduleStop", AI = false)
	private WebElement btnStop_601;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_81;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_478;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-ScheduleStart", AI = false)
	private WebElement btnStart_616;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_297;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_67;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_492;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_254;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-ScheduleStop", AI = false)
	private WebElement btnStop_13;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_58;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_499;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_20;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_271;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-ScheduleStart", AI = false)
	private WebElement btnStart_406;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-ScheduleStart", AI = false)
	private WebElement btnStart_644;

	@IFindBy(how = How.CSS, using = "div[id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-NextRun']", AI = false)
	private WebElement txtNextScheduleRunBulkInvoice;
	
	@IFindBy(how = How.CSS, using = "div[id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-NextRun']", AI = false)
	private WebElement txtNextScheduleRunBulkInvoiceWorkflow;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-ScheduleStop", AI = false)
	private WebElement btnStop_27;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_261;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_283;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-Description']", AI = false)
	private WebElement inpDescription_606;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_44;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_178;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_91;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_285;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_201;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_49;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-ScheduleSync", AI = false)
	private WebElement btnSync_631;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_636;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_268;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_691;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_282;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_453;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_215;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_35;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_39;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_609;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-ScheduleStop", AI = false)
	private WebElement btnStop_405;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-ScheduleStop", AI = false)
	private WebElement btnStop_643;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_192;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_25;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_296;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_467;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_229;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_63;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-ScheduleStop", AI = false)
	private WebElement btnStop_615;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-ScheduleSync", AI = false)
	private WebElement btnSync_617;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_16;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-ScheduleStart", AI = false)
	private WebElement btnStart_602;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_11;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-ScheduleSync", AI = false)
	private WebElement btnSync_603;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-ScheduleStop", AI = false)
	private WebElement btnStop_629;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_622;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_481;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-ScheduleStop", AI = false)
	private WebElement btnStop_671;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_761;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_523;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_277;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_320;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_555;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_678;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_317;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-ScheduleStop", AI = false)
	private WebElement btnStop_433;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-2-LastRun']", AI = false)
	private WebElement inpLastRun_22;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_440;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_334;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_572;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_537;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-ProcuessHistoryCV-ProcessHistoryTabTab", AI = false)
	private WebElement btnHistory_774;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_556;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_318;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-ScheduleSync", AI = false)
	private WebElement btnSync_547;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-ScheduleStop", AI = false)
	private WebElement btnStop_209;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-ScheduleSync", AI = false)
	private WebElement btnSync_309;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_569;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-ScheduleStop", AI = false)
	private WebElement btnStop_447;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_632;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_202;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-ScheduleStop", AI = false)
	private WebElement btnStop_685;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_291;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_348;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_586;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_346;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-ScheduleSync", AI = false)
	private WebElement btnSync_771;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_108;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-ScheduleSync", AI = false)
	private WebElement btnSync_533;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_408;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-ScheduleStop", AI = false)
	private WebElement btnStop_419;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_584;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-ScheduleStop", AI = false)
	private WebElement btnStop_657;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_412;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_646;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_650;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_551;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_660;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_313;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_110;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_5;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_541;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_570;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_303;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-LastRun']", AI = false)
	private WebElement inpLastRun_708;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_332;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_426;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_664;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_230;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_124;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-ScheduleSync", AI = false)
	private WebElement btnSync_351;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_76;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-ScheduleSync", AI = false)
	private WebElement btnSync_113;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_362;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_360;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-ScheduleStop", AI = false)
	private WebElement btnStop_83;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_597;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_122;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_422;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_359;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-ScheduleStop", AI = false)
	private WebElement btnStop_237;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-ScheduleStop", AI = false)
	private WebElement btnStop_475;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_482;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_138;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_733;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_598;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_376;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-ScheduleSync", AI = false)
	private WebElement btnSync_589;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_90;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_121;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-ScheduleStop", AI = false)
	private WebElement btnStop_97;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_674;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-ScheduleStop", AI = false)
	private WebElement btnStop_489;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_436;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_244;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-LastRun']", AI = false)
	private WebElement inpLastRun_722;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_692;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-ProcuessHistoryCV-ProcessHistoryTabTab", AI = false)
	private WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_450;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_388;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-ScheduleSync", AI = false)
	private WebElement btnSync_575;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-ScheduleStop", AI = false)
	private WebElement btnStop_55;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_747;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-ScheduleSync", AI = false)
	private WebElement btnSync_337;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_509;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_390;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_331;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_62;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_216;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-LastRun']", AI = false)
	private WebElement inpLastRun_736;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_688;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-ScheduleStop", AI = false)
	private WebElement btnStop_699;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_454;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-ScheduleStop", AI = false)
	private WebElement btnStop_461;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-LastRun']", AI = false)
	private WebElement inpLastRun_750;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_464;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_136;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-ScheduleSync", AI = false)
	private WebElement btnSync_561;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-ScheduleStop", AI = false)
	private WebElement btnStop_69;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_152;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-ScheduleSync", AI = false)
	private WebElement btnSync_323;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_583;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_345;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_374;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_107;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_212;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_468;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-ScheduleStop", AI = false)
	private WebElement btnStop_223;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-ProcuessHistoryCV-ProcessHistoryChartTabTab", AI = false)
	private WebElement btnChart;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_709;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_272;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-46-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_633;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-ScheduleSync", AI = false)
	private WebElement btnSync_393;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_89;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_431;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-ScheduleSync", AI = false)
	private WebElement btnSync_155;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_724;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-ScheduleStop", AI = false)
	private WebElement btnStop_279;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-LastRun']", AI = false)
	private WebElement inpLastRun_512;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_726;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_231;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_286;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-ScheduleSync", AI = false)
	private WebElement btnSync_141;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-7-LastRun']", AI = false)
	private WebElement inpLastRun_92;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_683;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_710;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-15-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_207;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_445;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_75;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-LastRun']", AI = false)
	private WebElement inpLastRun_526;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_723;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_245;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-LastRun']", AI = false)
	private WebElement inpLastRun_764;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-Description']", AI = false)
	private WebElement inpDescription_186;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_483;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-LastRun']", AI = false)
	private WebElement inpLastRun_540;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_502;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-ScheduleStop", AI = false)
	private WebElement btnStop_251;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_740;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_500;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-51-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_705;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-ScheduleSync", AI = false)
	private WebElement btnSync_379;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_459;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_217;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_697;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-ProcuessHistoryCV-BatchProcessInfo_ProcessHistoryLV-ProcessHistoryFilter']", AI = false)
	private WebElement drpProcessHistoryFilter;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-33-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_455;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_258;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-45-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_619;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-ProcessUsageFilter']", AI = false)
	private WebElement drpProcessUsageFilter;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-50-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_693;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-TerminateBatchWithoutNotify", AI = false)
	private WebElement btnStop_496;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-Description']", AI = false)
	private WebElement inpDescription_172;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_738;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_516;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-LastRun']", AI = false)
	private WebElement inpLastRun_554;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_754;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-16-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_221;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-26-ScheduleSync", AI = false)
	private WebElement btnSync_365;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-ScheduleSync", AI = false)
	private WebElement btnSync_127;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-52-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_719;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_469;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_605;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-LastRun']", AI = false)
	private WebElement inpLastRun_302;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-6-LastRun']", AI = false)
	private WebElement inpLastRun_78;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-ScheduleStop", AI = false)
	private WebElement btnStop_265;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_528;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_768;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-14-ScheduleSync", AI = false)
	private WebElement btnSync_197;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-49-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_675;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_47;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-34-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_473;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_766;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_3;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_751;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-17-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_235;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-Description']", AI = false)
	private WebElement inpDescription_158;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_513;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-32-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_437;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-LastRun", AI = false)
	private WebElement txtLastRun_64;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-29-Description']", AI = false)
	private WebElement inpDescription_396;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-23-LastRun']", AI = false)
	private WebElement inpLastRun_316;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-48-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_661;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-ScheduleStart", AI = false)
	private WebElement btnStart_266;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-13-ScheduleSync", AI = false)
	private WebElement btnSync_183;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-24-LastRun']", AI = false)
	private WebElement inpLastRun_330;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-31-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_423;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_33;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-54-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_752;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_530;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-37-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_514;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-18-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_249;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_9;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-55-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_765;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_487;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-LastRun']", AI = false)
	private WebElement inpLastRun_50;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-38-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_527;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-11-Description']", AI = false)
	private WebElement inpDescription_144;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_287;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-41-LastRun']", AI = false)
	private WebElement inpLastRun_568;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-28-Description']", AI = false)
	private WebElement inpDescription_382;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-25-LastRun']", AI = false)
	private WebElement inpLastRun_344;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_306;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-ScheduleStop", AI = false)
	private WebElement btnStop_293;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-42-LastRun']", AI = false)
	private WebElement inpLastRun_582;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_544;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-21-ScheduleStart", AI = false)
	private WebElement btnStart_294;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_542;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-22-LastRunStatus']", AI = false)
	private WebElement inpLastRunStatus_304;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-RunBatchWithoutNotify", AI = false)
	private WebElement btnRun_61;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_259;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-36-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_497;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-53-LastRun_dateIcon", AI = false)
	private WebElement btnLastRunDateIcon_737;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-Description']", AI = false)
	private WebElement inpDescription_130;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_604;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-DownloadHistory", AI = false)
	private WebElement btnDownloadHistory_273;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-40-NextRun_dateIcon", AI = false)
	private WebElement btnNextScheduledRunDateIcon_558;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-43-LastRun']", AI = false)
	private WebElement inpLastRun_596;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-19-NextRun']", AI = false)
	private WebElement inpNextScheduledRun_263;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-20-ScheduleStart", AI = false)
	private WebElement btnStart_280;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-12-ScheduleSync", AI = false)
	private WebElement btnSync_169;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-3-LastRun']", AI = false)
	private WebElement inpLastRun_36;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-44-Schedule']", AI = false)
	private WebElement inpCronSMHDOMMDOW_618;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-8-LastRun']", AI = false)
	private WebElement inpLastRun_106;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-27-Description']", AI = false)
	private WebElement inpDescription_368;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-47-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_647;

	@IFindBy(how = How.CSS, using = "select[name='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-30-BatchProcess']", AI = false)
	private WebElement drpBatchProcess_409;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-LastRun", AI = false)
	private WebElement txtLastRunOfBulkInovice;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-4-ScheduleActions", AI = false)
	private WebElement txtScheduleBulkInvoice;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-5-ScheduleActions", AI = false)
	private WebElement txtScheduleBulkInvoiceWorkflow;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-LastRun", AI = false)
	private WebElement txtLastRunOfActivityEscalation;
	
	@IFindBy(how = How.CSS, using = "div[id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-0-NextRun']", AI = false)
	private WebElement txtNextScheduleRunActivityEscalation;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-ScheduleStart[aria-disabled='true']", AI = false)
	private WebElement txtNextScheduleStartforAggregateLimit;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-ScheduleStop[aria-disabled='true']", AI = false)
	private WebElement txtNextScheduleStopforAggregateLimit;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-ScheduleStart[aria-disabled='true']", AI = false)
	private WebElement txtNextScheduleStartforClaimHealth;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-ScheduleStop[aria-disabled='true']", AI = false)
	private WebElement txtNextScheduleStopforClaimHealth;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-ScheduleStart[aria-disabled='true']", AI = false)
	private WebElement txtNextScheduleStartforClaimHealthSPM;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-ScheduleStop[aria-disabled='true']", AI = false)
	private WebElement txtNextScheduleStopforClaimHealthSPM;
	
	@IFindBy(how = How.CSS, using = "div[id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-1-NextRun']", AI = false)
	private WebElement txtNextScheduleRunAggregateLimit;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-ServerTools_ViewLogs']", AI = false)
	private WebElement lblViewLogsPage;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-ServerTools_IntentionalLogging']", AI = false)
	private WebElement lblIntentionalLogging;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-ServerTools_MBeans']", AI = false)
	private WebElement lblManagementBeans;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-ServerTools_StartablePlugin']", AI = false)
	private WebElement lblStartableServices;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Handle Unresolved Contingency']//ancestor::td//following-sibling::td//descendant::div[contains(@id,'RunBatchWithoutNotify')]", AI = false)
	public WebElement btnRunHandleUnresolvedContingency;
	
	@IFindBy(how = How.CSS, using = "div[id$='ReturnToApp']", AI = false)
	public WebElement btnReturnToPolicyCenter;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuActions']", AI = false)
	public WebElement btnActions;

	public BatchProcessInfoPage(){
	}

	
	@IFindBy(how = How.CSS, using = "div[id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-9-NextRun']", AI = false)
	private WebElement txtNextScheduleClaimHealth;
	
	@IFindBy(how = How.CSS, using = "div[id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-10-NextRun']", AI = false)
	private WebElement txtNextScheduleClaimHealthSPM;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-SchedulerSuspendedAlert-label", AI = false)
	private WebElement txtSchdulerSuspend;

	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-BatchProcessesLV_tb-resumeScheduler", AI = false)
	private WebElement btnResumeSuspend;
	
	@IFindBy(how = How.CSS, using = "#BatchProcessInfo-BatchProcessScreen-_msgs-0-0", AI = false)
	private WebElement txtSchdulerResumed;
	
	@IFindBy(how = How.CSS, using = "#ServerTools-MenuLinks-ServerTools_WorkQueueInfo", AI = false)
	private WebElement btnWorkQueueInfo;
	
	@IFindBy(how = How.XPATH, using = "//div[@class='gw-action--inner']/div[@class='gw-label'][normalize-space()='Info Pages']", AI = false)
	private WebElement btnInfoConfigurationPages;
	
	@IFindBy(how = How.CSS, using = "td[id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-35-NextRun_Cell']", AI = false)
	private WebElement txtNextScheduleProcessCompletionMonitor;

	public BatchProcessInfoPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		batchprocessscreenTable = new BatchProcessScreen();
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
}public BatchProcessInfoPage selectBatchProcess_353(WebDriver driver,String BatchProcess_353)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_353,BatchProcess_353,"BatchProcess_353");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_198(WebDriver driver,String CronSMHDOMMDOW_198) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_198,CronSMHDOMMDOW_198, "CronSMHDOMMDOW_198");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_246(WebDriver driver,String LastRun_246) {
		            BrowserActions.type(driver, inpLastRun_246,LastRun_246, "LastRun_246");
			        return this;
           }
public BatchProcessInfoPage clickStart_112(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_112,"Start_112");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_115(WebDriver driver,String BatchProcess_115)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_115,BatchProcess_115,"BatchProcess_115");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_484(WebDriver driver,String LastRun_484) {
		            BrowserActions.type(driver, inpLastRun_484,LastRun_484, "LastRun_484");
			        return this;
           }
public BatchProcessInfoPage clickStart_350(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_350,"Start_350");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_591(WebDriver driver,String BatchProcess_591)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_591,BatchProcess_591,"BatchProcess_591");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_711(WebDriver driver,String NextScheduledRun_711) {
		            BrowserActions.type(driver, inpNextScheduledRun_711,NextScheduledRun_711, "NextScheduledRun_711");
			        return this;
           }
public BatchProcessInfoPage enterDescription_116(WebDriver driver,String Description_116) {
		            BrowserActions.type(driver, inpDescription_116,Description_116, "Description_116");
			        return this;
           }
public BatchProcessInfoPage clickSync_85(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_85,"Sync_85");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_511(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_511,"DownloadHistory_511");
				    return this;
			}
public BatchProcessInfoPage enterDescription_354(WebDriver driver,String Description_354) {
		            BrowserActions.type(driver, inpDescription_354,Description_354, "Description_354");
			        return this;
           }
public BatchProcessInfoPage enterDescription_592(WebDriver driver,String Description_592) {
		            BrowserActions.type(driver, inpDescription_592,Description_592, "Description_592");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_101(WebDriver driver,String BatchProcess_101)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_101,BatchProcess_101,"BatchProcess_101");
				    return this;
			}
public BatchProcessInfoPage clickStart_588(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_588,"Start_588");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_498(WebDriver driver,String LastRun_498) {
		            BrowserActions.type(driver, inpLastRun_498,LastRun_498, "LastRun_498");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_23(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_23,"LastRunDateIcon_23");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_725(WebDriver driver,String NextScheduledRun_725) {
		            BrowserActions.type(driver, inpNextScheduledRun_725,NextScheduledRun_725, "NextScheduledRun_725");
			        return this;
           }
public BatchProcessInfoPage clickDownload(WebDriver driver,String fileName)  {
					BrowserActions.click(driver, btnDownload,2,"Download");
					String downloadPath = "C:/Users/" + System.getProperty("user.name") + "/Downloads/";
					File dir = new File(downloadPath);
					File[] files = dir.listFiles();
					if (files != null) {
					    for (File file : files) {
					        if (file.getName().endsWith(".zip") && file.getName().startsWith(fileName)) {
					            Log.message("File Downloaded successfully in Local Downloads with name: " + file.getName());
						        return this;
					        }
					    }	
					}
					Log.fail("Not able to find the Downloaded File in Local Downloads");
					return this;

			}
public BatchProcessInfoPage clickStop(WebDriver driver)  {
					BrowserActions.click(driver, btnStop,"Stop");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_525(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_525,"DownloadHistory_525");
				    return this;
			}
public BatchProcessInfoPage enterDescription_102(WebDriver driver,String Description_102) {
		            BrowserActions.type(driver, inpDescription_102,Description_102, "Description_102");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_763(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_763,"DownloadHistory_763");
				    return this;
			}
public BatchProcessInfoPage clickSync_71(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_71,"Sync_71");
				    return this;
			}
public BatchProcessInfoPage enterDescription_340(WebDriver driver,String Description_340) {
		            BrowserActions.type(driver, inpDescription_340,Description_340, "Description_340");
			        return this;
           }
public BatchProcessInfoPage clickStart_378(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_378,"Start_378");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_577(WebDriver driver,String BatchProcess_577)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_577,BatchProcess_577,"BatchProcess_577");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_260(WebDriver driver,String LastRun_260) {
		            BrowserActions.type(driver, inpLastRun_260,LastRun_260, "LastRun_260");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_735(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_735,"DownloadHistory_735");
				    return this;
			}
public BatchProcessInfoPage enterDescription_578(WebDriver driver,String Description_578) {
		            BrowserActions.type(driver, inpDescription_578,Description_578, "Description_578");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_339(WebDriver driver,String BatchProcess_339)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_339,BatchProcess_339,"BatchProcess_339");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_739(WebDriver driver,String NextScheduledRun_739) {
		            BrowserActions.type(driver, inpNextScheduledRun_739,NextScheduledRun_739, "NextScheduledRun_739");
			        return this;
           }
public BatchProcessInfoPage clickStart_126(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_126,"Start_126");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_563(WebDriver driver,String BatchProcess_563)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_563,BatchProcess_563,"BatchProcess_563");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_274(WebDriver driver,String LastRun_274) {
		            BrowserActions.type(driver, inpLastRun_274,LastRun_274, "LastRun_274");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_325(WebDriver driver,String BatchProcess_325)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_325,BatchProcess_325,"BatchProcess_325");
				    return this;
			}
public BatchProcessInfoPage clickStart_364(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_364,"Start_364");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus(WebDriver driver,String LastRunStatus) {
		            BrowserActions.type(driver, txtLastRunStatus,LastRunStatus, "LastRunStatus");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_749(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_749,"DownloadHistory_749");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_501(WebDriver driver,String NextScheduledRun_501) {
		            BrowserActions.type(driver, inpNextScheduledRun_501,NextScheduledRun_501, "NextScheduledRun_501");
			        return this;
           }
public BatchProcessInfoPage clickSync_99(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_99,"Sync_99");
				    return this;
			}
public BatchProcessInfoPage enterDescription_326(WebDriver driver,String Description_326) {
		            BrowserActions.type(driver, inpDescription_326,Description_326, "Description_326");
			        return this;
           }
public BatchProcessInfoPage enterDescription_564(WebDriver driver,String Description_564) {
		            BrowserActions.type(driver, inpDescription_564,Description_564, "Description_564");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_157(WebDriver driver,String BatchProcess_157)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_157,BatchProcess_157,"BatchProcess_157");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_288(WebDriver driver,String LastRun_288) {
		            BrowserActions.type(driver, inpLastRun_288,LastRun_288, "LastRun_288");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_395(WebDriver driver,String BatchProcess_395)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_395,BatchProcess_395,"BatchProcess_395");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_515(WebDriver driver,String NextScheduledRun_515) {
		            BrowserActions.type(driver, inpNextScheduledRun_515,NextScheduledRun_515, "NextScheduledRun_515");
			        return this;
           }
public BatchProcessInfoPage clickChart_773(WebDriver driver)  {
					BrowserActions.click(driver, btnChart_773,"Chart_773");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_65(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_65,"LastRunDateIcon_65");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_753(WebDriver driver,String NextScheduledRun_753) {
		            BrowserActions.type(driver, inpNextScheduledRun_753,NextScheduledRun_753, "NextScheduledRun_753");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_315(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_315,"DownloadHistory_315");
				    return this;
			}
public BatchProcessInfoPage enterDescription_312(WebDriver driver,String Description_312) {
		            BrowserActions.type(driver, inpDescription_312,Description_312, "Description_312");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_553(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_553,"DownloadHistory_553");
				    return this;
			}
public BatchProcessInfoPage enterDescription_550(WebDriver driver,String Description_550) {
		            BrowserActions.type(driver, inpDescription_550,Description_550, "Description_550");
			        return this;
           }
public BatchProcessInfoPage clickRun_173(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_173,"Run_173");
				    return this;
			}
public BatchProcessInfoPage clickStart_308(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_308,"Start_308");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_143(WebDriver driver,String BatchProcess_143)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_143,BatchProcess_143,"BatchProcess_143");
				    return this;
			}
public BatchProcessInfoPage clickStart_546(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_546,"Start_546");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_381(WebDriver driver,String BatchProcess_381)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_381,BatchProcess_381,"BatchProcess_381");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_767(WebDriver driver,String NextScheduledRun_767) {
		            BrowserActions.type(driver, inpNextScheduledRun_767,NextScheduledRun_767, "NextScheduledRun_767");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_329(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_329,"DownloadHistory_329");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_567(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_567,"DownloadHistory_567");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_529(WebDriver driver,String NextScheduledRun_529) {
		            BrowserActions.type(driver, inpNextScheduledRun_529,NextScheduledRun_529, "NextScheduledRun_529");
			        return this;
           }
public BatchProcessInfoPage clickRun_187(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_187,"Run_187");
				    return this;
			}
public BatchProcessInfoPage clickStart_336(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_336,"Start_336");
				    return this;
			}
public BatchProcessInfoPage clickStart_574(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_574,"Start_574");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_17(WebDriver driver,String BatchProcess_17)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_17,BatchProcess_17,"BatchProcess_17");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_37(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_37,"LastRunDateIcon_37");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon,"NextScheduledRunDateIcon");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_539(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_539,"DownloadHistory_539");
				    return this;
			}
public BatchProcessInfoPage enterDescription_536(WebDriver driver,String Description_536) {
		            BrowserActions.type(driver, inpDescription_536,Description_536, "Description_536");
			        return this;
           }
public BatchProcessInfoPage clickStart_322(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_322,"Start_322");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_367(WebDriver driver,String BatchProcess_367)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_367,BatchProcess_367,"BatchProcess_367");
				    return this;
			}
public BatchProcessInfoPage clickStart_560(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_560,"Start_560");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_305(WebDriver driver,String NextScheduledRun_305) {
		            BrowserActions.type(driver, inpNextScheduledRun_305,NextScheduledRun_305, "NextScheduledRun_305");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_543(WebDriver driver,String NextScheduledRun_543) {
		            BrowserActions.type(driver, inpNextScheduledRun_543,NextScheduledRun_543, "NextScheduledRun_543");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_51(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_51,"LastRunDateIcon_51");
				    return this;
			}
public BatchProcessInfoPage enterDescription_522(WebDriver driver,String Description_522) {
		            BrowserActions.type(driver, inpDescription_522,Description_522, "Description_522");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_129(WebDriver driver,String BatchProcess_129)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_129,BatchProcess_129,"BatchProcess_129");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_301(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_301,"DownloadHistory_301");
				    return this;
			}
public BatchProcessInfoPage enterDescription_760(WebDriver driver,String Description_760) {
		            BrowserActions.type(driver, inpDescription_760,Description_760, "Description_760");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_590(WebDriver driver,String CronSMHDOMMDOW_590) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_590,CronSMHDOMMDOW_590, "CronSMHDOMMDOW_590");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_199(WebDriver driver,String BatchProcess_199)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_199,BatchProcess_199,"BatchProcess_199");
				    return this;
			}
public BatchProcessInfoPage clickStart_756(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_756,"Start_756");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_352(WebDriver driver,String CronSMHDOMMDOW_352) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_352,CronSMHDOMMDOW_352, "CronSMHDOMMDOW_352");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_31(WebDriver driver,String BatchProcess_31)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_31,BatchProcess_31,"BatchProcess_31");
				    return this;
			}
public BatchProcessInfoPage clickRun_369(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_369,"Run_369");
				    return this;
			}
public BatchProcessInfoPage clickStop_713(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_713,"Stop_713");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_166(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_166,"NextScheduledRunDateIcon_166");
				    return this;
			}
public BatchProcessInfoPage clickStart_14(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_14,"Start_14");
				    return this;
			}
public BatchProcessInfoPage clickSync_715(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_715,"Sync_715");
				    return this;
			}
public BatchProcessInfoPage clickStart_504(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_504,"Start_504");
				    return this;
			}
public BatchProcessInfoPage clickRun_131(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_131,"Run_131");
				    return this;
			}
public BatchProcessInfoPage clickStart_742(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_742,"Start_742");
				    return this;
			}
public BatchProcessInfoPage clickStop_720(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_720,"Stop_720");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_45(WebDriver driver,String BatchProcess_45)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_45,BatchProcess_45,"BatchProcess_45");
				    return this;
			}
public BatchProcessInfoPage clickStop_727(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_727,"Stop_727");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_185(WebDriver driver,String BatchProcess_185)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_185,BatchProcess_185,"BatchProcess_185");
				    return this;
			}
public BatchProcessInfoPage clickStart_28(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_28,"Start_28");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_163(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_163,"LastRunDateIcon_163");
				    return this;
			}
public BatchProcessInfoPage enterDescription_508(WebDriver driver,String Description_508) {
		            BrowserActions.type(driver, inpDescription_508,Description_508, "Description_508");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_180(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_180,"NextScheduledRunDateIcon_180");
				    return this;
			}
public BatchProcessInfoPage clickSync_701(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_701,"Sync_701");
				    return this;
			}
public BatchProcessInfoPage enterDescription_746(WebDriver driver,String Description_746) {
		            BrowserActions.type(driver, inpDescription_746,Description_746, "Description_746");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_276(WebDriver driver,String LastRunStatus_276) {
		            BrowserActions.type(driver, inpLastRunStatus_276,LastRunStatus_276, "LastRunStatus_276");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_114(WebDriver driver,String CronSMHDOMMDOW_114) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_114,CronSMHDOMMDOW_114, "CronSMHDOMMDOW_114");
			        return this;
           }
public BatchProcessInfoPage clickRun_383(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_383,"Run_383");
				    return this;
			}
public BatchProcessInfoPage clickRun_145(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_145,"Run_145");
				    return this;
			}
public BatchProcessInfoPage clickStart_532(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_532,"Start_532");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_171(WebDriver driver,String BatchProcess_171)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_171,BatchProcess_171,"BatchProcess_171");
				    return this;
			}
public BatchProcessInfoPage clickStart_770(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_770,"Start_770");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_79(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_79,"LastRunDateIcon_79");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_59(WebDriver driver,String BatchProcess_59)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_59,BatchProcess_59,"BatchProcess_59");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_373(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_373,"LastRunDateIcon_373");
				    return this;
			}
public BatchProcessInfoPage clickSync_29(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_29,"Sync_29");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_135(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_135,"LastRunDateIcon_135");
				    return this;
			}
public BatchProcessInfoPage enterDescription_732(WebDriver driver,String Description_732) {
		            BrowserActions.type(driver, inpDescription_732,Description_732, "Description_732");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_366(WebDriver driver,String CronSMHDOMMDOW_366) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_366,CronSMHDOMMDOW_366, "CronSMHDOMMDOW_366");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_128(WebDriver driver,String CronSMHDOMMDOW_128) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_128,CronSMHDOMMDOW_128, "CronSMHDOMMDOW_128");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_380(WebDriver driver,String CronSMHDOMMDOW_380) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_380,CronSMHDOMMDOW_380, "CronSMHDOMMDOW_380");
			        return this;
           }
public BatchProcessInfoPage clickRun_397(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_397,"Run_397");
				    return this;
			}
public BatchProcessInfoPage clickStart_42(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_42,"Start_42");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_142(WebDriver driver,String CronSMHDOMMDOW_142) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_142,CronSMHDOMMDOW_142, "CronSMHDOMMDOW_142");
			        return this;
           }
public BatchProcessInfoPage clickRun_159(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_159,"Run_159");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_194(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_194,"NextScheduledRunDateIcon_194");
				    return this;
			}
public BatchProcessInfoPage clickStop_706(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_706,"Stop_706");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon,"LastRunDateIcon");
				    return this;
			}
public BatchProcessInfoPage clickSync_15(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_15,"Sync_15");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_387(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_387,"LastRunDateIcon_387");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_93(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_93,"LastRunDateIcon_93");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_149(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_149,"LastRunDateIcon_149");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_290(WebDriver driver,String LastRunStatus_290) {
		            BrowserActions.type(driver, inpLastRunStatus_290,LastRunStatus_290, "LastRunStatus_290");
			        return this;
           }
public BatchProcessInfoPage clickStart_518(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_518,"Start_518");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_394(WebDriver driver,String CronSMHDOMMDOW_394) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_394,CronSMHDOMMDOW_394, "CronSMHDOMMDOW_394");
			        return this;
           }
public BatchProcessInfoPage clickRun_565(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_565,"Run_565");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_156(WebDriver driver,String CronSMHDOMMDOW_156) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_156,CronSMHDOMMDOW_156, "CronSMHDOMMDOW_156");
			        return this;
           }
public BatchProcessInfoPage clickStop_755(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_755,"Stop_755");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_73(WebDriver driver,String BatchProcess_73)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_73,BatchProcess_73,"BatchProcess_73");
				    return this;
			}
public BatchProcessInfoPage clickRun_327(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_327,"Run_327");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_191(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_191,"LastRunDateIcon_191");
				    return this;
			}
public BatchProcessInfoPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public BatchProcessInfoPage enterDescription_718(WebDriver driver,String Description_718) {
		            BrowserActions.type(driver, inpDescription_718,Description_718, "Description_718");
			        return this;
           }
public BatchProcessInfoPage clickSync_757(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_757,"Sync_757");
				    return this;
			}
public BatchProcessInfoPage clickStop_517(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_517,"Stop_517");
				    return this;
			}
public BatchProcessInfoPage clickSync_519(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_519,"Sync_519");
				    return this;
			}
public BatchProcessInfoPage clickSuspendScheduler(WebDriver driver,String Text)  {
					BrowserActions.click(driver, btnSuspendScheduler,1,"SuspendScheduler");
					BrowserActions.verifyElementTextIsDisplayed(driver, txtSchdulerSuspend, Text, true,Text);
				    return this;
			}
public BatchProcessInfoPage clickResumeScheduler(WebDriver driver,String Text)  {
	BrowserActions.click(driver, btnResumeSuspend,1,"REsume Scheduler");
	BrowserActions.verifyElementTextIsDisplayed(driver, txtSchdulerResumed, Text, true,Text);
    return this;
}
public BatchProcessInfoPage clickSync_43(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_43,"Sync_43");
				    return this;
			}
public BatchProcessInfoPage clickStop_510(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_510,"Stop_510");
				    return this;
			}
public BatchProcessInfoPage clickStart_700(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_700,"Start_700");
				    return this;
			}
public BatchProcessInfoPage clickStop_762(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_762,"Stop_762");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_87(WebDriver driver,String BatchProcess_87)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_87,BatchProcess_87,"BatchProcess_87");
				    return this;
			}
public BatchProcessInfoPage clickRun_579(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_579,"Run_579");
				    return this;
			}
public BatchProcessInfoPage clickStop_769(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_769,"Stop_769");
				    return this;
			}
public BatchProcessInfoPage clickSync_743(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_743,"Sync_743");
				    return this;
			}
public BatchProcessInfoPage clickSync_505(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_505,"Sync_505");
				    return this;
			}
public BatchProcessInfoPage enterDescription_704(WebDriver driver,String Description_704) {
		            BrowserActions.type(driver, inpDescription_704,Description_704, "Description_704");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_721(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_721,"DownloadHistory_721");
				    return this;
			}
public BatchProcessInfoPage clickStop_524(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_524,"Stop_524");
				    return this;
			}
public BatchProcessInfoPage clickRun_341(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_341,"Run_341");
				    return this;
			}
public BatchProcessInfoPage clickRun_103(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_103,"Run_103");
				    return this;
			}
public BatchProcessInfoPage clickStop_734(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_734,"Stop_734");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_170(WebDriver driver,String CronSMHDOMMDOW_170) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_170,CronSMHDOMMDOW_170, "CronSMHDOMMDOW_170");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_177(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_177,"LastRunDateIcon_177");
				    return this;
			}
public BatchProcessInfoPage clickStart_728(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_728,"Start_728");
				    return this;
			}
public BatchProcessInfoPage clickRun_593(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_593,"Run_593");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_184(WebDriver driver,String CronSMHDOMMDOW_184) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_184,CronSMHDOMMDOW_184, "CronSMHDOMMDOW_184");
			        return this;
           }
public BatchProcessInfoPage clickRun_355(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_355,"Run_355");
				    return this;
			}
public BatchProcessInfoPage clickStop_741(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_741,"Stop_741");
				    return this;
			}
public BatchProcessInfoPage clickRun_117(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_117,"Run_117");
				    return this;
			}
public BatchProcessInfoPage clickStop_748(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_748,"Stop_748");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_707(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_707,"DownloadHistory_707");
				    return this;
			}
public BatchProcessInfoPage clickSync_729(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_729,"Sync_729");
				    return this;
			}
public BatchProcessInfoPage clickSync_57(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_57,"Sync_57");
				    return this;
			}
public BatchProcessInfoPage clickStop_503(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_503,"Stop_503");
				    return this;
			}
public BatchProcessInfoPage clickStart_714(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_714,"Start_714");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_208(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_208,"NextScheduledRunDateIcon_208");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_446(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_446,"NextScheduledRunDateIcon_446");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_444(WebDriver driver,String LastRunStatus_444) {
		            BrowserActions.type(driver, inpLastRunStatus_444,LastRunStatus_444, "LastRunStatus_444");
			        return this;
           }
public BatchProcessInfoPage clickSync_673(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_673,"Sync_673");
				    return this;
			}
public BatchProcessInfoPage clickStart_98(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_98,"Start_98");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_684(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_684,"NextScheduledRunDateIcon_684");
				    return this;
			}
public BatchProcessInfoPage clickRun_649(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_649,"Run_649");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_151(WebDriver driver,String NextScheduledRun_151) {
		            BrowserActions.type(driver, inpNextScheduledRun_151,NextScheduledRun_151, "NextScheduledRun_151");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_206(WebDriver driver,String LastRunStatus_206) {
		            BrowserActions.type(driver, inpLastRunStatus_206,LastRunStatus_206, "LastRunStatus_206");
			        return this;
           }
public BatchProcessInfoPage clickSync_435(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_435,"Sync_435");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_506(WebDriver driver,String CronSMHDOMMDOW_506) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_506,CronSMHDOMMDOW_506, "CronSMHDOMMDOW_506");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_682(WebDriver driver,String LastRunStatus_682) {
		            BrowserActions.type(driver, inpLastRunStatus_682,LastRunStatus_682, "LastRunStatus_682");
			        return this;
           }
public BatchProcessInfoPage clickStop_559(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_559,"Stop_559");
				    return this;
			}
public BatchProcessInfoPage clickStop_314(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_314,"Stop_314");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_8(WebDriver driver,String LastRun_8) {
		            BrowserActions.type(driver, inpLastRun_8,LastRun_8, "LastRun_8");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_744(WebDriver driver,String CronSMHDOMMDOW_744) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_744,CronSMHDOMMDOW_744, "CronSMHDOMMDOW_744");
			        return this;
           }
public BatchProcessInfoPage clickStop_552(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_552,"Stop_552");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_26(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_26,"NextScheduledRunDateIcon_26");
				    return this;
			}
public BatchProcessInfoPage clickRun_411(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_411,"Run_411");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_698(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_698,"NextScheduledRunDateIcon_698");
				    return this;
			}
public BatchProcessInfoPage clickSync_421(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_421,"Sync_421");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_165(WebDriver driver,String NextScheduledRun_165) {
		            BrowserActions.type(driver, inpNextScheduledRun_165,NextScheduledRun_165, "NextScheduledRun_165");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_681(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_681,"LastRunDateIcon_681");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_443(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_443,"LastRunDateIcon_443");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_430(WebDriver driver,String LastRunStatus_430) {
		            BrowserActions.type(driver, inpLastRunStatus_430,LastRunStatus_430, "LastRunStatus_430");
			        return this;
           }
public BatchProcessInfoPage clickStop_328(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_328,"Stop_328");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_205(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_205,"LastRunDateIcon_205");
				    return this;
			}
public BatchProcessInfoPage clickStop_566(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_566,"Stop_566");
				    return this;
			}
public BatchProcessInfoPage clickStop_321(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_321,"Stop_321");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_758(WebDriver driver,String CronSMHDOMMDOW_758) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_758,CronSMHDOMMDOW_758, "CronSMHDOMMDOW_758");
			        return this;
           }
public BatchProcessInfoPage clickRun_663(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_663,"Run_663");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_772(WebDriver driver,String CronSMHDOMMDOW_772) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_772,CronSMHDOMMDOW_772, "CronSMHDOMMDOW_772");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_12(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_12,"NextScheduledRunDateIcon_12");
				    return this;
			}
public BatchProcessInfoPage clickRun_425(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_425,"Run_425");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_222(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_222,"NextScheduledRunDateIcon_222");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_460(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_460,"NextScheduledRunDateIcon_460");
				    return this;
			}
public BatchProcessInfoPage clickSync_659(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_659,"Sync_659");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_653(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_653,"LastRunDateIcon_653");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_220(WebDriver driver,String LastRunStatus_220) {
		            BrowserActions.type(driver, inpLastRunStatus_220,LastRunStatus_220, "LastRunStatus_220");
			        return this;
           }

public BatchProcessInfoPage clickStop_538(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_538,"Stop_538");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_179(WebDriver driver,String NextScheduledRun_179) {
		            BrowserActions.type(driver, inpNextScheduledRun_179,NextScheduledRun_179, "NextScheduledRun_179");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_415(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_415,"LastRunDateIcon_415");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_520(WebDriver driver,String CronSMHDOMMDOW_520) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_520,CronSMHDOMMDOW_520, "CronSMHDOMMDOW_520");
			        return this;
           }
public BatchProcessInfoPage clickStop_531(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_531,"Stop_531");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_175(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_175,"DownloadHistory_175");
				    return this;
			}
public BatchProcessInfoPage clickStart(WebDriver driver)  {
					BrowserActions.click(driver, btnStart,"Start");
				    return this;
			}
public BatchProcessInfoPage clickRun_677(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_677,"Run_677");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_236(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_236,"NextScheduledRunDateIcon_236");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_696(WebDriver driver,String LastRunStatus_696) {
		            BrowserActions.type(driver, inpLastRunStatus_696,LastRunStatus_696, "LastRunStatus_696");
			        return this;
           }
public BatchProcessInfoPage clickRun_439(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_439,"Run_439");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_474(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_474,"NextScheduledRunDateIcon_474");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_458(WebDriver driver,String LastRunStatus_458) {
		            BrowserActions.type(driver, inpLastRunStatus_458,LastRunStatus_458, "LastRunStatus_458");
			        return this;
           }
public BatchProcessInfoPage clickSync_645(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_645,"Sync_645");
				    return this;
			}
public BatchProcessInfoPage clickSync_407(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_407,"Sync_407");
				    return this;
			}
public BatchProcessInfoPage clickStop_307(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_307,"Stop_307");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_667(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_667,"LastRunDateIcon_667");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_534(WebDriver driver,String CronSMHDOMMDOW_534) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_534,CronSMHDOMMDOW_534, "CronSMHDOMMDOW_534");
			        return this;
           }
public BatchProcessInfoPage clickStop_545(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_545,"Stop_545");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_189(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_189,"DownloadHistory_189");
				    return this;
			}
public BatchProcessInfoPage clickStop_300(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_300,"Stop_300");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_429(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_429,"LastRunDateIcon_429");
				    return this;
			}
public BatchProcessInfoPage clickStop_594(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_594,"Stop_594");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_488(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_488,"NextScheduledRunDateIcon_488");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_310(WebDriver driver,String CronSMHDOMMDOW_310) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_310,CronSMHDOMMDOW_310, "CronSMHDOMMDOW_310");
			        return this;
           }
public BatchProcessInfoPage clickStart_56(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_56,"Start_56");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_248(WebDriver driver,String LastRunStatus_248) {
		            BrowserActions.type(driver, inpLastRunStatus_248,LastRunStatus_248, "LastRunStatus_248");
			        return this;
           }
public BatchProcessInfoPage clickRun_607(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_607,"Run_607");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_471(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_471,"LastRunDateIcon_471");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_193(WebDriver driver,String NextScheduledRun_193) {
		            BrowserActions.type(driver, inpNextScheduledRun_193,NextScheduledRun_193, "NextScheduledRun_193");
			        return this;
           }
public BatchProcessInfoPage clickSync_477(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_477,"Sync_477");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_233(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_233,"LastRunDateIcon_233");
				    return this;
			}
public BatchProcessInfoPage clickSync_239(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_239,"Sync_239");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_486(WebDriver driver,String LastRunStatus_486) {
		            BrowserActions.type(driver, inpLastRunStatus_486,LastRunStatus_486, "LastRunStatus_486");
			        return this;
           }
public BatchProcessInfoPage clickStop_118(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_118,"Stop_118");
				    return this;
			}
public BatchProcessInfoPage clickResumeScheduler(WebDriver driver)  {
					BrowserActions.click(driver, btnResumeScheduler,"ResumeScheduler");
				    return this;
			}
public BatchProcessInfoPage clickStop_356(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_356,"Stop_356");
				    return this;
			}
public BatchProcessInfoPage clickStop_111(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_111,"Stop_111");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_548(WebDriver driver,String CronSMHDOMMDOW_548) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_548,CronSMHDOMMDOW_548, "CronSMHDOMMDOW_548");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_717(WebDriver driver,String BatchProcess_717)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_717,BatchProcess_717,"BatchProcess_717");
				    return this;
			}
public BatchProcessInfoPage clickStop_363(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_363,"Stop_363");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_68(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_68,"NextScheduledRunDateIcon_68");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_562(WebDriver driver,String CronSMHDOMMDOW_562) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_562,CronSMHDOMMDOW_562, "CronSMHDOMMDOW_562");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_234(WebDriver driver,String LastRunStatus_234) {
		            BrowserActions.type(driver, inpLastRunStatus_234,LastRunStatus_234, "LastRunStatus_234");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess(WebDriver driver,String BatchProcess)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess,BatchProcess,"BatchProcess");
				    return this;
			}
public BatchProcessInfoPage clickSync_463(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_463,"Sync_463");
				    return this;
			}
public BatchProcessInfoPage clickSync_225(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_225,"Sync_225");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_250(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_250,"NextScheduledRunDateIcon_250");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_485(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_485,"LastRunDateIcon_485");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_472(WebDriver driver,String LastRunStatus_472) {
		            BrowserActions.type(driver, inpLastRunStatus_472,LastRunStatus_472, "LastRunStatus_472");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_247(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_247,"LastRunDateIcon_247");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_703(WebDriver driver,String BatchProcess_703)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_703,BatchProcess_703,"BatchProcess_703");
				    return this;
			}
public BatchProcessInfoPage clickStop_125(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_125,"Stop_125");
				    return this;
			}
public BatchProcessInfoPage clickStart_70(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_70,"Start_70");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_54(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_54,"NextScheduledRunDateIcon_54");
				    return this;
			}
public BatchProcessInfoPage clickRun_621(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_621,"Run_621");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_264(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_264,"NextScheduledRunDateIcon_264");
				    return this;
			}
public BatchProcessInfoPage clickSync_211(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_211,"Sync_211");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_695(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_695,"LastRunDateIcon_695");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_262(WebDriver driver,String LastRunStatus_262) {
		            BrowserActions.type(driver, inpLastRunStatus_262,LastRunStatus_262, "LastRunStatus_262");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_457(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_457,"LastRunDateIcon_457");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_219(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_219,"LastRunDateIcon_219");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_324(WebDriver driver,String CronSMHDOMMDOW_324) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_324,CronSMHDOMMDOW_324, "CronSMHDOMMDOW_324");
			        return this;
           }
public BatchProcessInfoPage clickStop_335(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_335,"Stop_335");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_610(WebDriver driver,String LastRun_610) {
		            BrowserActions.type(driver, inpLastRun_610,LastRun_610, "LastRun_610");
			        return this;
           }
public BatchProcessInfoPage clickStop_573(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_573,"Stop_573");
				    return this;
			}
public BatchProcessInfoPage clickStop_580(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_580,"Stop_580");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_278(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_278,"NextScheduledRunDateIcon_278");
				    return this;
			}
public BatchProcessInfoPage clickStart_84(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_84,"Start_84");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_100(WebDriver driver,String CronSMHDOMMDOW_100) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_100,CronSMHDOMMDOW_100, "CronSMHDOMMDOW_100");
			        return this;
           }
public BatchProcessInfoPage clickRun_635(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_635,"Run_635");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_40(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_40,"NextScheduledRunDateIcon_40");
				    return this;
			}
public BatchProcessInfoPage clickSync_687(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_687,"Sync_687");
				    return this;
			}
public BatchProcessInfoPage clickSync_449(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_449,"Sync_449");
				    return this;
			}
public BatchProcessInfoPage clickStop_349(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_349,"Stop_349");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_576(WebDriver driver,String CronSMHDOMMDOW_576) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_576,CronSMHDOMMDOW_576, "CronSMHDOMMDOW_576");
			        return this;
           }
public BatchProcessInfoPage clickStop_104(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_104,"Stop_104");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_338(WebDriver driver,String CronSMHDOMMDOW_338) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_338,CronSMHDOMMDOW_338, "CronSMHDOMMDOW_338");
			        return this;
           }
public BatchProcessInfoPage clickStop_587(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_587,"Stop_587");
				    return this;
			}
public BatchProcessInfoPage clickStop_342(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_342,"Stop_342");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_624(WebDriver driver,String LastRun_624) {
		            BrowserActions.type(driver, inpLastRun_624,LastRun_624, "LastRun_624");
			        return this;
           }
public BatchProcessInfoPage clickStop_153(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_153,"Stop_153");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_400(WebDriver driver,String LastRun_400) {
		            BrowserActions.type(driver, inpLastRun_400,LastRun_400, "LastRun_400");
			        return this;
           }
public BatchProcessInfoPage clickStop_391(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_391,"Stop_391");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_600(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_600,"NextScheduledRunDateIcon_600");
				    return this;
			}
public BatchProcessInfoPage enterDescription_32(WebDriver driver,String Description_32) {
		            BrowserActions.type(driver, inpDescription_32,Description_32, "Description_32");
			        return this;
           }
public BatchProcessInfoPage clickStart_196(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_196,"Start_196");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_557(WebDriver driver,String NextScheduledRun_557) {
		            BrowserActions.type(driver, inpNextScheduledRun_557,NextScheduledRun_557, "NextScheduledRun_557");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_38(WebDriver driver,String LastRunStatus_38) {
		            BrowserActions.type(driver, inpLastRunStatus_38,LastRunStatus_38, "LastRunStatus_38");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_119(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_119,"DownloadHistory_119");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_357(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_357,"DownloadHistory_357");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_759(WebDriver driver,String BatchProcess_759)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_759,BatchProcess_759,"BatchProcess_759");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_638(WebDriver driver,String LastRun_638) {
		            BrowserActions.type(driver, inpLastRun_638,LastRun_638, "LastRun_638");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_595(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_595,"DownloadHistory_595");
				    return this;
			}
public BatchProcessInfoPage clickStop_398(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_398,"Stop_398");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_319(WebDriver driver,String NextScheduledRun_319) {
		            BrowserActions.type(driver, inpNextScheduledRun_319,NextScheduledRun_319, "NextScheduledRun_319");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_371(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_371,"DownloadHistory_371");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_652(WebDriver driver,String LastRun_652) {
		            BrowserActions.type(driver, inpLastRun_652,LastRun_652, "LastRun_652");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_614(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_614,"NextScheduledRunDateIcon_614");
				    return this;
			}
public BatchProcessInfoPage clickStop_160(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_160,"Stop_160");
				    return this;
			}
public BatchProcessInfoPage clickSync_267(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_267,"Sync_267");
				    return this;
			}
public BatchProcessInfoPage clickStart_182(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_182,"Start_182");
				    return this;
			}
public BatchProcessInfoPage enterDescription_46(WebDriver driver,String Description_46) {
		            BrowserActions.type(driver, inpDescription_46,Description_46, "Description_46");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_745(WebDriver driver,String BatchProcess_745)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_745,BatchProcess_745,"BatchProcess_745");
				    return this;
			}
public BatchProcessInfoPage clickStop_167(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_167,"Stop_167");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_507(WebDriver driver,String BatchProcess_507)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_507,BatchProcess_507,"BatchProcess_507");
				    return this;
			}
public BatchProcessInfoPage clickStop_132(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_132,"Stop_132");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_581(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_581,"DownloadHistory_581");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_96(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_96,"NextScheduledRunDateIcon_96");
				    return this;
			}
public BatchProcessInfoPage clickStop_370(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_370,"Stop_370");
				    return this;
			}
public BatchProcessInfoPage clickSync_491(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_491,"Sync_491");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_731(WebDriver driver,String BatchProcess_731)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_731,BatchProcess_731,"BatchProcess_731");
				    return this;
			}
public BatchProcessInfoPage clickSync_253(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_253,"Sync_253");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_571(WebDriver driver,String NextScheduledRun_571) {
		            BrowserActions.type(driver, inpNextScheduledRun_571,NextScheduledRun_571, "NextScheduledRun_571");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_626(WebDriver driver,String LastRunStatus_626) {
		            BrowserActions.type(driver, inpLastRunStatus_626,LastRunStatus_626, "LastRunStatus_626");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_333(WebDriver driver,String NextScheduledRun_333) {
		            BrowserActions.type(driver, inpNextScheduledRun_333,NextScheduledRun_333, "NextScheduledRun_333");
			        return this;
           }
public BatchProcessInfoPage clickStop_139(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_139,"Stop_139");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_628(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_628,"NextScheduledRunDateIcon_628");
				    return this;
			}
public BatchProcessInfoPage clickSync(WebDriver driver)  {
					BrowserActions.click(driver, btnSync,"Sync");
				    return this;
			}
public BatchProcessInfoPage enterDescription_298(WebDriver driver,String Description_298) {
		            BrowserActions.type(driver, inpDescription_298,Description_298, "Description_298");
			        return this;
           }
public BatchProcessInfoPage clickStop_377(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_377,"Stop_377");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_10(WebDriver driver,String LastRunStatus_10) {
		            BrowserActions.type(driver, inpLastRunStatus_10,LastRunStatus_10, "LastRunStatus_10");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_414(WebDriver driver,String LastRun_414) {
		            BrowserActions.type(driver, inpLastRun_414,LastRun_414, "LastRun_414");
			        return this;
           }
public BatchProcessInfoPage clickBatchProcessRunButton(WebDriver driver,String batchProcess)  {
					By batchprocessButtonby= By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'RunBatchWithoutNotify')]//child::div[text()='Run']");
					BrowserActions.waitForElementToDisplay(driver, batchprocessButtonby, "batch Process");
					WebElement btnRun = batchprocessButtonby.findElement(driver);
					BrowserActions.click(driver, btnRun,true, batchProcess+"Run button");
					Log.messageStep(batchProcess+" Run button is clicked to Run the Batch Successfully",DriverManager.getDriver());
				    return this;
			}
public BatchProcessInfoPage enterDescription_18(WebDriver driver,String Description_18) {
		            BrowserActions.type(driver, inpDescription_18,Description_18, "Description_18");
			        return this;
           }
public BatchProcessInfoPage clickStop_384(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_384,"Stop_384");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_585(WebDriver driver,String NextScheduledRun_585) {
		            BrowserActions.type(driver, inpNextScheduledRun_585,NextScheduledRun_585, "NextScheduledRun_585");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_612(WebDriver driver,String LastRunStatus_612) {
		            BrowserActions.type(driver, inpLastRunStatus_612,LastRunStatus_612, "LastRunStatus_612");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun(WebDriver driver,String NextScheduledRun) {
		            BrowserActions.type(driver, inpNextScheduledRun,NextScheduledRun, "NextScheduledRun");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_82(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_82,"NextScheduledRunDateIcon_82");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_109(WebDriver driver,String NextScheduledRun_109) {
		            BrowserActions.type(driver, inpNextScheduledRun_109,NextScheduledRun_109, "NextScheduledRun_109");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_347(WebDriver driver,String NextScheduledRun_347) {
		            BrowserActions.type(driver, inpNextScheduledRun_347,NextScheduledRun_347, "NextScheduledRun_347");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_105(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_105,"DownloadHistory_105");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_24(WebDriver driver,String LastRunStatus_24) {
		            BrowserActions.type(driver, inpLastRunStatus_24,LastRunStatus_24, "LastRunStatus_24");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_428(WebDriver driver,String LastRun_428) {
		            BrowserActions.type(driver, inpLastRun_428,LastRun_428, "LastRun_428");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_343(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_343,"DownloadHistory_343");
				    return this;
			}
public BatchProcessInfoPage clickStop_146(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_146,"Stop_146");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_666(WebDriver driver,String LastRun_666) {
		            BrowserActions.type(driver, inpLastRun_666,LastRun_666, "LastRun_666");
			        return this;
           }
public BatchProcessInfoPage enterDescription_284(WebDriver driver,String Description_284) {
		            BrowserActions.type(driver, inpDescription_284,Description_284, "Description_284");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_404(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_404,"NextScheduledRunDateIcon_404");
				    return this;
			}
public BatchProcessInfoPage enterDescription_74(WebDriver driver,String Description_74) {
		            BrowserActions.type(driver, inpDescription_74,Description_74, "Description_74");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_311(WebDriver driver,String BatchProcess_311)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_311,BatchProcess_311,"BatchProcess_311");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_442(WebDriver driver,String LastRun_442) {
		            BrowserActions.type(driver, inpLastRun_442,LastRun_442, "LastRun_442");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_161(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_161,"DownloadHistory_161");
				    return this;
			}
public BatchProcessInfoPage clickStop_195(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_195,"Stop_195");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_642(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_642,"NextScheduledRunDateIcon_642");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_680(WebDriver driver,String LastRun_680) {
		            BrowserActions.type(driver, inpLastRun_680,LastRun_680, "LastRun_680");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_80(WebDriver driver,String LastRunStatus_80) {
		            BrowserActions.type(driver, inpLastRunStatus_80,LastRunStatus_80, "LastRunStatus_80");
			        return this;
           }
public BatchProcessInfoPage clickStart_154(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_154,"Start_154");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_402(WebDriver driver,String LastRunStatus_402) {
		            BrowserActions.type(driver, inpLastRunStatus_402,LastRunStatus_402, "LastRunStatus_402");
			        return this;
           }
public BatchProcessInfoPage clickStart_392(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_392,"Start_392");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_599(WebDriver driver,String NextScheduledRun_599) {
		            BrowserActions.type(driver, inpNextScheduledRun_599,NextScheduledRun_599, "NextScheduledRun_599");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_640(WebDriver driver,String LastRunStatus_640) {
		            BrowserActions.type(driver, inpLastRunStatus_640,LastRunStatus_640, "LastRunStatus_640");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_399(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_399,"DownloadHistory_399");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_639(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_639,"LastRunDateIcon_639");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_702(WebDriver driver,String CronSMHDOMMDOW_702) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_702,CronSMHDOMMDOW_702, "CronSMHDOMMDOW_702");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_694(WebDriver driver,String LastRun_694) {
		            BrowserActions.type(driver, inpLastRun_694,LastRun_694, "LastRun_694");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_656(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_656,"NextScheduledRunDateIcon_656");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_94(WebDriver driver,String LastRunStatus_94) {
		            BrowserActions.type(driver, inpLastRunStatus_94,LastRunStatus_94, "LastRunStatus_94");
			        return this;
           }
public BatchProcessInfoPage enterDescription_270(WebDriver driver,String Description_270) {
		            BrowserActions.type(driver, inpDescription_270,Description_270, "Description_270");
			        return this;
           }
public BatchProcessInfoPage enterDescription_88(WebDriver driver,String Description_88) {
		            BrowserActions.type(driver, inpDescription_88,Description_88, "Description_88");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_123(WebDriver driver,String NextScheduledRun_123) {
		            BrowserActions.type(driver, inpNextScheduledRun_123,NextScheduledRun_123, "NextScheduledRun_123");
			        return this;
           }
public BatchProcessInfoPage clickStart_140(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_140,"Start_140");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_361(WebDriver driver,String NextScheduledRun_361) {
		            BrowserActions.type(driver, inpNextScheduledRun_361,NextScheduledRun_361, "NextScheduledRun_361");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_716(WebDriver driver,String CronSMHDOMMDOW_716) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_716,CronSMHDOMMDOW_716, "CronSMHDOMMDOW_716");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_401(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_401,"LastRunDateIcon_401");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_549(WebDriver driver,String BatchProcess_549)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_549,BatchProcess_549,"BatchProcess_549");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_204(WebDriver driver,String LastRun_204) {
		            BrowserActions.type(driver, inpLastRun_204,LastRun_204, "LastRun_204");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_418(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_418,"NextScheduledRunDateIcon_418");
				    return this;
			}
public BatchProcessInfoPage clickStop_174(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_174,"Stop_174");
				    return this;
			}
public BatchProcessInfoPage clickSync_295(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_295,"Sync_295");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_535(WebDriver driver,String BatchProcess_535)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_535,BatchProcess_535,"BatchProcess_535");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_375(WebDriver driver,String NextScheduledRun_375) {
		            BrowserActions.type(driver, inpNextScheduledRun_375,NextScheduledRun_375, "NextScheduledRun_375");
			        return this;
           }
public BatchProcessInfoPage verifyLastRunStatusOfBulkInvoice(WebDriver driver) {
		            BrowserActions.verifyElementDisplayed(driver, inpLastRunStatus_668, "Last Run ");
			        return this;
           }
public BatchProcessInfoPage verifyLastRunStatusOfBulkInvoiceWorkflow(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, txtLastRunStatus_6, "Last Run Status");
    return this;
}
public BatchProcessInfoPage clickStop_2(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_2,"Stop_2");
				    return this;
			}
public BatchProcessInfoPage clickStop_6(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_6,"Stop_6");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_137(WebDriver driver,String NextScheduledRun_137) {
		            BrowserActions.type(driver, inpNextScheduledRun_137,NextScheduledRun_137, "NextScheduledRun_137");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_611(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_611,"LastRunDateIcon_611");
				    return this;
			}
public BatchProcessInfoPage enterDescription_256(WebDriver driver,String Description_256) {
		            BrowserActions.type(driver, inpDescription_256,Description_256, "Description_256");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_52(WebDriver driver,String LastRunStatus_52) {
		            BrowserActions.type(driver, inpLastRunStatus_52,LastRunStatus_52, "LastRunStatus_52");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_456(WebDriver driver,String LastRun_456) {
		            BrowserActions.type(driver, inpLastRun_456,LastRun_456, "LastRun_456");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_133(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_133,"DownloadHistory_133");
				    return this;
			}
public BatchProcessInfoPage verifyBatchProcessLastRun(WebDriver driver,String batchProcess) {
	 By batchProcessBy = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'LastRun_Cell')]");//Financials Escalation
	 BrowserActions.waitForElementToDisplay(driver, batchProcessBy, "Batch Process");
			        return this;
           }
public BatchProcessInfoPage verifyLastRunOfAggregateLimit(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, txtLastRunAggregate, "Last Run");
    return this;
}
public BatchProcessInfoPage verifyLastRunOfArchiveReference(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, txtLastRunArchivereference, "Last Run");
    return this;
}
public BatchProcessInfoPage enterLastRun_218(WebDriver driver,String LastRun_218) {
		            BrowserActions.type(driver, inpLastRun_218,LastRun_218, "LastRun_218");
			        return this;
           }
public BatchProcessInfoPage enterDescription_494(WebDriver driver,String Description_494) {
		            BrowserActions.type(driver, inpDescription_494,Description_494, "Description_494");
			        return this;
           }
public BatchProcessInfoPage clickSync_281(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_281,"Sync_281");
				    return this;
			}
public BatchProcessInfoPage enterDescription_60(WebDriver driver,String Description_60) {
		            BrowserActions.type(driver, inpDescription_60,Description_60, "Description_60");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_470(WebDriver driver,String LastRun_470) {
		            BrowserActions.type(driver, inpLastRun_470,LastRun_470, "LastRun_470");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_432(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_432,"NextScheduledRunDateIcon_432");
				    return this;
			}
public BatchProcessInfoPage clickStart_168(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_168,"Start_168");
				    return this;
			}
public BatchProcessInfoPage clickStop_181(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_181,"Stop_181");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_521(WebDriver driver,String BatchProcess_521)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_521,BatchProcess_521,"BatchProcess_521");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_232(WebDriver driver,String LastRun_232) {
		            BrowserActions.type(driver, inpLastRun_232,LastRun_232, "LastRun_232");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_670(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_670,"NextScheduledRunDateIcon_670");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_654(WebDriver driver,String LastRunStatus_654) {
		            BrowserActions.type(driver, inpLastRunStatus_654,LastRunStatus_654, "LastRunStatus_654");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_416(WebDriver driver,String LastRunStatus_416) {
		            BrowserActions.type(driver, inpLastRunStatus_416,LastRunStatus_416, "LastRunStatus_416");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_389(WebDriver driver,String NextScheduledRun_389) {
		            BrowserActions.type(driver, inpNextScheduledRun_389,NextScheduledRun_389, "NextScheduledRun_389");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_730(WebDriver driver,String CronSMHDOMMDOW_730) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_730,CronSMHDOMMDOW_730, "CronSMHDOMMDOW_730");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_147(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_147,"DownloadHistory_147");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_625(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_625,"LastRunDateIcon_625");
				    return this;
			}
public BatchProcessInfoPage enterDescription_242(WebDriver driver,String Description_242) {
		            BrowserActions.type(driver, inpDescription_242,Description_242, "Description_242");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_385(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_385,"DownloadHistory_385");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_66(WebDriver driver,String LastRunStatus_66) {
		            BrowserActions.type(driver, txtLastRunStatus_66,LastRunStatus_66, "LastRunStatus_66");
			        return this;
           }
public BatchProcessInfoPage clickStop_188(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_188,"Stop_188");
				    return this;
			}
public BatchProcessInfoPage enterDescription_480(WebDriver driver,String Description_480) {
		            BrowserActions.type(driver, inpDescription_480,Description_480, "Description_480");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_120(WebDriver driver,String LastRun_120) {
		            BrowserActions.type(driver, inpLastRun_120,LastRun_120, "LastRun_120");
			        return this;
           }
public BatchProcessInfoPage clickStart_238(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_238,"Start_238");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_479(WebDriver driver,String BatchProcess_479)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_479,BatchProcess_479,"BatchProcess_479");
				    return this;
			}
public BatchProcessInfoPage clickStart_476(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_476,"Start_476");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_637(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_637,"DownloadHistory_637");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_358(WebDriver driver,String LastRun_358) {
		            BrowserActions.type(driver, inpLastRun_358,LastRun_358, "LastRun_358");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_465(WebDriver driver,String BatchProcess_465)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_465,BatchProcess_465,"BatchProcess_465");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcessDropDown(WebDriver driver,String BatchProcess)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpProcessUsageFilter_1,BatchProcess,"drpProcessUsageFilter_1");
    return this;
}
public BatchProcessInfoPage verfiyDefaultDropDown(WebDriver driver,String ProcessUsageFilter_1)  {
					BrowserActions.verifyElementTextIsDisplayedforSelcetedDropDown(driver, drpProcessUsageFilter_1,ProcessUsageFilter_1,true, "ProcessUsageFilter_1");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_227(WebDriver driver,String BatchProcess_227)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_227,BatchProcess_227,"BatchProcess_227");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_372(WebDriver driver,String LastRun_372) {
		            BrowserActions.type(driver, inpLastRun_372,LastRun_372, "LastRun_372");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_134(WebDriver driver,String LastRun_134) {
		            BrowserActions.type(driver, inpLastRun_134,LastRun_134, "LastRun_134");
			        return this;
           }
public BatchProcessInfoPage clickStart_224(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_224,"Start_224");
				    return this;
			}
public BatchProcessInfoPage clickStart_462(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_462,"Start_462");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory,"DownloadHistory");
				    return this;
			}
public BatchProcessInfoPage enterDescription_228(WebDriver driver,String Description_228) {
		            BrowserActions.type(driver, inpDescription_228,Description_228, "Description_228");
			        return this;
           }
public BatchProcessInfoPage enterDescription_466(WebDriver driver,String Description_466) {
		            BrowserActions.type(driver, inpDescription_466,Description_466, "Description_466");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_386(WebDriver driver,String LastRun_386) {
		            BrowserActions.type(driver, inpLastRun_386,LastRun_386, "LastRun_386");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_451(WebDriver driver,String BatchProcess_451)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_451,BatchProcess_451,"BatchProcess_451");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_213(WebDriver driver,String BatchProcess_213)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_213,BatchProcess_213,"BatchProcess_213");
				    return this;
			}
public BatchProcessInfoPage clickStart_252(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_252,"Start_252");
				    return this;
			}
public BatchProcessInfoPage clickStart_490(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_490,"Start_490");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_613(WebDriver driver,String NextScheduledRun_613) {
		            BrowserActions.type(driver, inpNextScheduledRun_613,NextScheduledRun_613, "NextScheduledRun_613");
			        return this;
           }
public BatchProcessInfoPage enterDescription_214(WebDriver driver,String Description_214) {
		            BrowserActions.type(driver, inpDescription_214,Description_214, "Description_214");
			        return this;
           }
public BatchProcessInfoPage enterDescription_452(WebDriver driver,String Description_452) {
		            BrowserActions.type(driver, inpDescription_452,Description_452, "Description_452");
			        return this;
           }
public BatchProcessInfoPage clickArchiveReferenceRun(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_19," archive reference Run");
				    return this;
			}
public BatchProcessInfoPage enterDescription_690(WebDriver driver,String Description_690) {
		            BrowserActions.type(driver, inpDescription_690,Description_690, "Description_690");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_689(WebDriver driver,String BatchProcess_689)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_689,BatchProcess_689,"BatchProcess_689");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_623(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_623,"DownloadHistory_623");
				    return this;
			}
public BatchProcessInfoPage enterDescription_200(WebDriver driver,String Description_200) {
		            BrowserActions.type(driver, inpDescription_200,Description_200, "Description_200");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_148(WebDriver driver,String LastRun_148) {
		            BrowserActions.type(driver, inpLastRun_148,LastRun_148, "LastRun_148");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_627(WebDriver driver,String NextScheduledRun_627) {
		            BrowserActions.type(driver, inpNextScheduledRun_627,NextScheduledRun_627, "NextScheduledRun_627");
			        return this;
           }
public BatchProcessInfoPage clickStart_434(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_434,"Start_434");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_162(WebDriver driver,String LastRun_162) {
		            BrowserActions.type(driver, inpLastRun_162,LastRun_162, "LastRun_162");
			        return this;
           }
public BatchProcessInfoPage clickStart_672(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_672,"Start_672");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_72(WebDriver driver,String CronSMHDOMMDOW_72) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_72,CronSMHDOMMDOW_72, "CronSMHDOMMDOW_72");
			        return this;
           }
public BatchProcessInfoPage enterDescription_438(WebDriver driver,String Description_438) {
		            BrowserActions.type(driver, inpDescription_438,Description_438, "Description_438");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_679(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_679,"DownloadHistory_679");
				    return this;
			}
public BatchProcessInfoPage enterDescription_676(WebDriver driver,String Description_676) {
		            BrowserActions.type(driver, inpDescription_676,Description_676, "Description_676");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_176(WebDriver driver,String LastRun_176) {
		            BrowserActions.type(driver, inpLastRun_176,LastRun_176, "LastRun_176");
			        return this;
           }
public BatchProcessInfoPage clickRun_299(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_299,"Run_299");
				    return this;
			}
public BatchProcessInfoPage clickStart_420(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_420,"Start_420");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_269(WebDriver driver,String BatchProcess_269)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_269,BatchProcess_269,"BatchProcess_269");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_403(WebDriver driver,String NextScheduledRun_403) {
		            BrowserActions.type(driver, inpNextScheduledRun_403,NextScheduledRun_403, "NextScheduledRun_403");
			        return this;
           }
public BatchProcessInfoPage enterDescription_424(WebDriver driver,String Description_424) {
		            BrowserActions.type(driver, inpDescription_424,Description_424, "Description_424");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_641(WebDriver driver,String NextScheduledRun_641) {
		            BrowserActions.type(driver, inpNextScheduledRun_641,NextScheduledRun_641, "NextScheduledRun_641");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_203(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_203,"DownloadHistory_203");
				    return this;
			}
public BatchProcessInfoPage enterDescription_662(WebDriver driver,String Description_662) {
		            BrowserActions.type(driver, inpDescription_662,Description_662, "Description_662");
			        return this;
           }
public BatchProcessInfoPage clickStart_658(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_658,"Start_658");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_441(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_441,"DownloadHistory_441");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_255(WebDriver driver,String BatchProcess_255)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_255,BatchProcess_255,"BatchProcess_255");
				    return this;
			}
public BatchProcessInfoPage clickStart_210(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_210,"Start_210");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_493(WebDriver driver,String BatchProcess_493)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_493,BatchProcess_493,"BatchProcess_493");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_417(WebDriver driver,String NextScheduledRun_417) {
		            BrowserActions.type(driver, inpNextScheduledRun_417,NextScheduledRun_417, "NextScheduledRun_417");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_655(WebDriver driver,String NextScheduledRun_655) {
		            BrowserActions.type(driver, inpNextScheduledRun_655,NextScheduledRun_655, "NextScheduledRun_655");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW(WebDriver driver,String CronSMHDOMMDOW) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW,CronSMHDOMMDOW, "CronSMHDOMMDOW");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_413(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_413,"DownloadHistory_413");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_7(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_7,"DownloadHistory_7");
				    return this;
			}
public BatchProcessInfoPage enterDescription_410(WebDriver driver,String Description_410) {
		            BrowserActions.type(driver, inpDescription_410,Description_410, "Description_410");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_651(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_651,"DownloadHistory_651");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_712(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_712,"NextScheduledRunDateIcon_712");
				    return this;
			}
public BatchProcessInfoPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public BatchProcessInfoPage clickStart_448(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_448,"Start_448");
				    return this;
			}
public BatchProcessInfoPage clickStart_686(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_686,"Start_686");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_190(WebDriver driver,String LastRun_190) {
		            BrowserActions.type(driver, inpLastRun_190,LastRun_190, "LastRun_190");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_241(WebDriver driver,String BatchProcess_241)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_241,BatchProcess_241,"BatchProcess_241");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_669(WebDriver driver,String NextScheduledRun_669) {
		            BrowserActions.type(driver, inpNextScheduledRun_669,NextScheduledRun_669, "NextScheduledRun_669");
			        return this;
           }
public BatchProcessInfoPage enterDescription_648(WebDriver driver,String Description_648) {
		            BrowserActions.type(driver, inpDescription_648,Description_648, "Description_648");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_86(WebDriver driver,String CronSMHDOMMDOW_86) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_86,CronSMHDOMMDOW_86, "CronSMHDOMMDOW_86");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_427(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_427,"DownloadHistory_427");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_665(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_665,"DownloadHistory_665");
				    return this;
			}
public BatchProcessInfoPage clickRun_243(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_243,"Run_243");
				    return this;
			}
public BatchProcessInfoPage clickStart_630(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_630,"Start_630");
				    return this;
			}
public BatchProcessInfoPage clickStop_34(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_34,"Stop_34");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_275(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_275,"LastRunDateIcon_275");
				    return this;
			}
public BatchProcessInfoPage clickRefresh(WebDriver driver)  {
					String pageSourceBeforeRefresh = driver.getPageSource();
					BrowserActions.click(driver, btnRefresh,"Refresh");
					String pageSourceAfterRefresh = driver.getPageSource();
					if(!pageSourceBeforeRefresh.equals(pageSourceAfterRefresh)) {
					    System.out.println("Page has been refreshed after clicking the refresh button");
					} else {
					    System.out.println("Page has not been refreshed after clicking the refresh button");
					}

				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_164(WebDriver driver,String LastRunStatus_164) {
		            BrowserActions.type(driver, inpLastRunStatus_164,LastRunStatus_164, "LastRunStatus_164");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_30(WebDriver driver,String CronSMHDOMMDOW_30) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_30,CronSMHDOMMDOW_30, "CronSMHDOMMDOW_30");
			        return this;
           }
public BatchProcessInfoPage clickStop_41(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_41,"Stop_41");
				    return this;
			}
public BatchProcessInfoPage enterDescription_634(WebDriver driver,String Description_634) {
		            BrowserActions.type(driver, inpDescription_634,Description_634, "Description_634");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_95(WebDriver driver,String NextScheduledRun_95) {
		            BrowserActions.type(driver, inpNextScheduledRun_95,NextScheduledRun_95, "NextScheduledRun_95");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_226(WebDriver driver,String CronSMHDOMMDOW_226) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_226,CronSMHDOMMDOW_226, "CronSMHDOMMDOW_226");
			        return this;
           }
public BatchProcessInfoPage clickRun_495(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_495,"Run_495");
				    return this;
			}
public BatchProcessInfoPage enterDescription_4(WebDriver driver,String Description_4) {
		            BrowserActions.type(driver, inpDescription_4,Description_4, "Description_4");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_240(WebDriver driver,String CronSMHDOMMDOW_240) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_240,CronSMHDOMMDOW_240, "CronSMHDOMMDOW_240");
			        return this;
           }
public BatchProcessInfoPage clickRun_257(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_257,"Run_257");
				    return this;
			}
public BatchProcessInfoPage clickStop_48(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_48,"Stop_48");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_292(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_292,"NextScheduledRunDateIcon_292");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_150(WebDriver driver,String LastRunStatus_150) {
		            BrowserActions.type(driver, inpLastRunStatus_150,LastRunStatus_150, "LastRunStatus_150");
			        return this;
           }
public BatchProcessInfoPage clickStop_608(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_608,"Stop_608");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_289(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_289,"LastRunDateIcon_289");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_77(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_77,"DownloadHistory_77");
				    return this;
			}
public BatchProcessInfoPage enterDescription_620(WebDriver driver,String Description_620) {
		            BrowserActions.type(driver, inpDescription_620,Description_620, "Description_620");
			        return this;
           }
public BatchProcessInfoPage clickStop_601(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_601,"Stop_601");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_81(WebDriver driver,String NextScheduledRun_81) {
		            BrowserActions.type(driver, inpNextScheduledRun_81,NextScheduledRun_81, "NextScheduledRun_81");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_478(WebDriver driver,String CronSMHDOMMDOW_478) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_478,CronSMHDOMMDOW_478, "CronSMHDOMMDOW_478");
			        return this;
           }
public BatchProcessInfoPage clickStart_616(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_616,"Start_616");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_297(WebDriver driver,String BatchProcess_297)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_297,BatchProcess_297,"BatchProcess_297");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_67(WebDriver driver,String NextScheduledRun_67) {
		            BrowserActions.type(driver, inpNextScheduledRun_67,NextScheduledRun_67, "NextScheduledRun_67");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_492(WebDriver driver,String CronSMHDOMMDOW_492) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_492,CronSMHDOMMDOW_492, "CronSMHDOMMDOW_492");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_254(WebDriver driver,String CronSMHDOMMDOW_254) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_254,CronSMHDOMMDOW_254, "CronSMHDOMMDOW_254");
			        return this;
           }
public BatchProcessInfoPage clickStop_13(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_13,"Stop_13");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_58(WebDriver driver,String CronSMHDOMMDOW_58) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_58,CronSMHDOMMDOW_58, "CronSMHDOMMDOW_58");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_499(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_499,"LastRunDateIcon_499");
				    return this;
			}
public BatchProcessInfoPage clickStop_20(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_20,"Stop_20");
				    return this;
			}
public BatchProcessInfoPage clickRun_271(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_271,"Run_271");
				    return this;
			}
public BatchProcessInfoPage clickStart_406(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_406,"Start_406");
				    return this;
			}
public BatchProcessInfoPage clickStart_644(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_644,"Start_644");
				    return this;
			}
public BatchProcessInfoPage verifyNextScheduledRunBulkInvoice(WebDriver driver) {
		            BrowserActions.verifyElementDisplayed(driver, txtNextScheduleRunBulkInvoice, "Next Scheduled Run");
			        return this;
           }
public BatchProcessInfoPage verifyNextScheduledRunBulkInvoiceWorkflow(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, txtNextScheduleRunBulkInvoiceWorkflow, "Next Scheduled Run");
    return this;
}
public BatchProcessInfoPage clickStop_27(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_27,"Stop_27");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_261(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_261,"LastRunDateIcon_261");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_283(WebDriver driver,String BatchProcess_283)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_283,BatchProcess_283,"BatchProcess_283");
				    return this;
			}
public BatchProcessInfoPage enterDescription_606(WebDriver driver,String Description_606) {
		            BrowserActions.type(driver, inpDescription_606,Description_606, "Description_606");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_44(WebDriver driver,String CronSMHDOMMDOW_44) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_44,CronSMHDOMMDOW_44, "CronSMHDOMMDOW_44");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_178(WebDriver driver,String LastRunStatus_178) {
		            BrowserActions.type(driver, inpLastRunStatus_178,LastRunStatus_178, "LastRunStatus_178");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_91(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_91,"DownloadHistory_91");
				    return this;
			}
public BatchProcessInfoPage clickRun_285(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_285,"Run_285");
				    return this;
			}
public BatchProcessInfoPage clickRun_201(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_201,"Run_201");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_49(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_49,"DownloadHistory_49");
				    return this;
			}
public BatchProcessInfoPage clickSync_631(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_631,"Sync_631");
				    return this;
			}
public BatchProcessInfoPage clickStop_636(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_636,"Stop_636");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_268(WebDriver driver,String CronSMHDOMMDOW_268) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_268,CronSMHDOMMDOW_268, "CronSMHDOMMDOW_268");
			        return this;
           }
public BatchProcessInfoPage clickRun_691(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_691,"Run_691");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_282(WebDriver driver,String CronSMHDOMMDOW_282) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_282,CronSMHDOMMDOW_282, "CronSMHDOMMDOW_282");
			        return this;
           }
public BatchProcessInfoPage clickRun_453(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_453,"Run_453");
				    return this;
			}
public BatchProcessInfoPage clickRun_215(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_215,"Run_215");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_35(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_35,"DownloadHistory_35");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_39(WebDriver driver,String NextScheduledRun_39) {
		            BrowserActions.type(driver, inpNextScheduledRun_39,NextScheduledRun_39, "NextScheduledRun_39");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_609(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_609,"DownloadHistory_609");
				    return this;
			}
public BatchProcessInfoPage clickStop_405(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_405,"Stop_405");
				    return this;
			}
public BatchProcessInfoPage clickStop_643(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_643,"Stop_643");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_192(WebDriver driver,String LastRunStatus_192) {
		            BrowserActions.type(driver, inpLastRunStatus_192,LastRunStatus_192, "LastRunStatus_192");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_25(WebDriver driver,String NextScheduledRun_25) {
		            BrowserActions.type(driver, inpNextScheduledRun_25,NextScheduledRun_25, "NextScheduledRun_25");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_296(WebDriver driver,String CronSMHDOMMDOW_296) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_296,CronSMHDOMMDOW_296, "CronSMHDOMMDOW_296");
			        return this;
           }
public BatchProcessInfoPage clickRun_467(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_467,"Run_467");
				    return this;
			}
public BatchProcessInfoPage clickRun_229(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_229,"Run_229");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_63(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_63,"DownloadHistory_63");
				    return this;
			}
public BatchProcessInfoPage clickStop_615(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_615,"Stop_615");
				    return this;
			}
public BatchProcessInfoPage clickSync_617(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_617,"Sync_617");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_16(WebDriver driver,String CronSMHDOMMDOW_16) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_16,CronSMHDOMMDOW_16, "CronSMHDOMMDOW_16");
			        return this;
           }
public BatchProcessInfoPage clickStart_602(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_602,"Start_602");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_11(WebDriver driver,String NextScheduledRun_11) {
		            BrowserActions.type(driver, inpNextScheduledRun_11,NextScheduledRun_11, "NextScheduledRun_11");
			        return this;
           }
public BatchProcessInfoPage clickSync_603(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_603,"Sync_603");
				    return this;
			}
public BatchProcessInfoPage clickStop_629(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_629,"Stop_629");
				    return this;
			}
public BatchProcessInfoPage clickStop_622(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_622,"Stop_622");
				    return this;
			}
public BatchProcessInfoPage clickRun_481(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_481,"Run_481");
				    return this;
			}
public BatchProcessInfoPage clickStop_671(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_671,"Stop_671");
				    return this;
			}
public BatchProcessInfoPage clickRun_761(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_761,"Run_761");
				    return this;
			}
public BatchProcessInfoPage clickRun_523(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_523,"Run_523");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_277(WebDriver driver,String NextScheduledRun_277) {
		            BrowserActions.type(driver, inpNextScheduledRun_277,NextScheduledRun_277, "NextScheduledRun_277");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_320(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_320,"NextScheduledRunDateIcon_320");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_555(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_555,"LastRunDateIcon_555");
				    return this;
			}
public BatchProcessInfoPage clickStop_678(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_678,"Stop_678");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_317(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_317,"LastRunDateIcon_317");
				    return this;
			}
public BatchProcessInfoPage clickStop_433(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_433,"Stop_433");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_22(WebDriver driver,String LastRun_22) {
		            BrowserActions.type(driver, inpLastRun_22,LastRun_22, "LastRun_22");
			        return this;
           }
public BatchProcessInfoPage clickStop_440(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_440,"Stop_440");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_334(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_334,"NextScheduledRunDateIcon_334");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_572(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_572,"NextScheduledRunDateIcon_572");
				    return this;
			}
public BatchProcessInfoPage clickRun_537(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_537,"Run_537");
				    return this;
			}
public BatchProcessInfoPage clickHistory_774(WebDriver driver)  {
					BrowserActions.click(driver, btnHistory_774,"History_774");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_556(WebDriver driver,String LastRunStatus_556) {
		            BrowserActions.type(driver, inpLastRunStatus_556,LastRunStatus_556, "LastRunStatus_556");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_318(WebDriver driver,String LastRunStatus_318) {
		            BrowserActions.type(driver, inpLastRunStatus_318,LastRunStatus_318, "LastRunStatus_318");
			        return this;
           }
public BatchProcessInfoPage clickSync_547(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_547,"Sync_547");
				    return this;
			}
public BatchProcessInfoPage clickStop_209(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_209,"Stop_209");
				    return this;
			}
public BatchProcessInfoPage clickSync_309(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_309,"Sync_309");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_569(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_569,"LastRunDateIcon_569");
				    return this;
			}
public BatchProcessInfoPage clickStop_447(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_447,"Stop_447");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_632(WebDriver driver,String CronSMHDOMMDOW_632) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_632,CronSMHDOMMDOW_632, "CronSMHDOMMDOW_632");
			        return this;
           }
public BatchProcessInfoPage clickStop_202(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_202,"Stop_202");
				    return this;
			}
public BatchProcessInfoPage clickStop_685(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_685,"Stop_685");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_291(WebDriver driver,String NextScheduledRun_291) {
		            BrowserActions.type(driver, inpNextScheduledRun_291,NextScheduledRun_291, "NextScheduledRun_291");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_348(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_348,"NextScheduledRunDateIcon_348");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_586(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_586,"NextScheduledRunDateIcon_586");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_346(WebDriver driver,String LastRunStatus_346) {
		            BrowserActions.type(driver, inpLastRunStatus_346,LastRunStatus_346, "LastRunStatus_346");
			        return this;
           }
public BatchProcessInfoPage clickSync_771(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_771,"Sync_771");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_108(WebDriver driver,String LastRunStatus_108) {
		            BrowserActions.type(driver, inpLastRunStatus_108,LastRunStatus_108, "LastRunStatus_108");
			        return this;
           }
public BatchProcessInfoPage clickSync_533(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_533,"Sync_533");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_408(WebDriver driver,String CronSMHDOMMDOW_408) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_408,CronSMHDOMMDOW_408, "CronSMHDOMMDOW_408");
			        return this;
           }
public BatchProcessInfoPage clickStop_419(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_419,"Stop_419");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_584(WebDriver driver,String LastRunStatus_584) {
		            BrowserActions.type(driver, inpLastRunStatus_584,LastRunStatus_584, "LastRunStatus_584");
			        return this;
           }
public BatchProcessInfoPage clickStop_657(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_657,"Stop_657");
				    return this;
			}
public BatchProcessInfoPage clickStop_412(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_412,"Stop_412");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_646(WebDriver driver,String CronSMHDOMMDOW_646) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_646,CronSMHDOMMDOW_646, "CronSMHDOMMDOW_646");
			        return this;
           }
public BatchProcessInfoPage clickStop_650(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_650,"Stop_650");
				    return this;
			}
public BatchProcessInfoPage clickRun_551(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_551,"Run_551");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_660(WebDriver driver,String CronSMHDOMMDOW_660) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_660,CronSMHDOMMDOW_660, "CronSMHDOMMDOW_660");
			        return this;
           }
public BatchProcessInfoPage clickRun_313(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_313,"Run_313");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_110(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_110,"NextScheduledRunDateIcon_110");
				    return this;
			}
public BatchProcessInfoPage clickAggregateLimitRun(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_5,"Run_5");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_541(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_541,"LastRunDateIcon_541");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_570(WebDriver driver,String LastRunStatus_570) {
		            BrowserActions.type(driver, inpLastRunStatus_570,LastRunStatus_570, "LastRunStatus_570");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_303(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_303,"LastRunDateIcon_303");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_708(WebDriver driver,String LastRun_708) {
		            BrowserActions.type(driver, inpLastRun_708,LastRun_708, "LastRun_708");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_332(WebDriver driver,String LastRunStatus_332) {
		            BrowserActions.type(driver, inpLastRunStatus_332,LastRunStatus_332, "LastRunStatus_332");
			        return this;
           }
public BatchProcessInfoPage clickStop_426(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_426,"Stop_426");
				    return this;
			}
public BatchProcessInfoPage clickStop_664(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_664,"Stop_664");
				    return this;
			}
public BatchProcessInfoPage clickStop_230(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_230,"Stop_230");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_124(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_124,"NextScheduledRunDateIcon_124");
				    return this;
			}
public BatchProcessInfoPage clickSync_351(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_351,"Sync_351");
				    return this;
			}
public BatchProcessInfoPage clickStop_76(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_76,"Stop_76");
				    return this;
			}
public BatchProcessInfoPage clickSync_113(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_113,"Sync_113");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_362(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_362,"NextScheduledRunDateIcon_362");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_360(WebDriver driver,String LastRunStatus_360) {
		            BrowserActions.type(driver, inpLastRunStatus_360,LastRunStatus_360, "LastRunStatus_360");
			        return this;
           }
public BatchProcessInfoPage clickStop_83(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_83,"Stop_83");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_597(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_597,"LastRunDateIcon_597");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_122(WebDriver driver,String LastRunStatus_122) {
		            BrowserActions.type(driver, inpLastRunStatus_122,LastRunStatus_122, "LastRunStatus_122");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_422(WebDriver driver,String CronSMHDOMMDOW_422) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_422,CronSMHDOMMDOW_422, "CronSMHDOMMDOW_422");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_359(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_359,"LastRunDateIcon_359");
				    return this;
			}
public BatchProcessInfoPage clickStop_237(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_237,"Stop_237");
				    return this;
			}
public BatchProcessInfoPage clickStop_475(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_475,"Stop_475");
				    return this;
			}
public BatchProcessInfoPage clickStop_482(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_482,"Stop_482");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_138(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_138,"NextScheduledRunDateIcon_138");
				    return this;
			}
public BatchProcessInfoPage clickRun_733(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_733,"Run_733");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_598(WebDriver driver,String LastRunStatus_598) {
		            BrowserActions.type(driver, inpLastRunStatus_598,LastRunStatus_598, "LastRunStatus_598");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_376(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_376,"NextScheduledRunDateIcon_376");
				    return this;
			}
public BatchProcessInfoPage clickSync_589(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_589,"Sync_589");
				    return this;
			}
public BatchProcessInfoPage clickStop_90(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_90,"Stop_90");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_121(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_121,"LastRunDateIcon_121");
				    return this;
			}
public BatchProcessInfoPage clickStop_97(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_97,"Stop_97");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_674(WebDriver driver,String CronSMHDOMMDOW_674) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_674,CronSMHDOMMDOW_674, "CronSMHDOMMDOW_674");
			        return this;
           }
public BatchProcessInfoPage clickStop_489(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_489,"Stop_489");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_436(WebDriver driver,String CronSMHDOMMDOW_436) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_436,CronSMHDOMMDOW_436, "CronSMHDOMMDOW_436");
			        return this;
           }
public BatchProcessInfoPage clickStop_244(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_244,"Stop_244");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_722(WebDriver driver,String LastRun_722) {
		            BrowserActions.type(driver, inpLastRun_722,LastRun_722, "LastRun_722");
			        return this;
           }
public BatchProcessInfoPage clickStop_692(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_692,"Stop_692");
				    return this;
			}
public BatchProcessInfoPage clickHistory(WebDriver driver)  {
					BrowserActions.click(driver, btnHistory,"History");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_450(WebDriver driver,String CronSMHDOMMDOW_450) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_450,CronSMHDOMMDOW_450, "CronSMHDOMMDOW_450");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_388(WebDriver driver,String LastRunStatus_388) {
		            BrowserActions.type(driver, inpLastRunStatus_388,LastRunStatus_388, "LastRunStatus_388");
			        return this;
           }
public BatchProcessInfoPage clickSync_575(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_575,"Sync_575");
				    return this;
			}
public BatchProcessInfoPage clickStop_55(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_55,"Stop_55");
				    return this;
			}
public BatchProcessInfoPage clickRun_747(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_747,"Run_747");
				    return this;
			}
public BatchProcessInfoPage clickSync_337(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_337,"Sync_337");
				    return this;
			}
public BatchProcessInfoPage clickRun_509(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_509,"Run_509");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_390(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_390,"NextScheduledRunDateIcon_390");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_331(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_331,"LastRunDateIcon_331");
				    return this;
			}
public BatchProcessInfoPage clickStop_62(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_62,"Stop_62");
				    return this;
			}
public BatchProcessInfoPage clickStop_216(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_216,"Stop_216");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_736(WebDriver driver,String LastRun_736) {
		            BrowserActions.type(driver, inpLastRun_736,LastRun_736, "LastRun_736");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_688(WebDriver driver,String CronSMHDOMMDOW_688) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_688,CronSMHDOMMDOW_688, "CronSMHDOMMDOW_688");
			        return this;
           }
public BatchProcessInfoPage clickStop_699(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_699,"Stop_699");
				    return this;
			}
public BatchProcessInfoPage clickStop_454(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_454,"Stop_454");
				    return this;
			}
public BatchProcessInfoPage clickStop_461(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_461,"Stop_461");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_750(WebDriver driver,String LastRun_750) {
		            BrowserActions.type(driver, inpLastRun_750,LastRun_750, "LastRun_750");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_464(WebDriver driver,String CronSMHDOMMDOW_464) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_464,CronSMHDOMMDOW_464, "CronSMHDOMMDOW_464");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_136(WebDriver driver,String LastRunStatus_136) {
		            BrowserActions.type(driver, inpLastRunStatus_136,LastRunStatus_136, "LastRunStatus_136");
			        return this;
           }
public BatchProcessInfoPage clickSync_561(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_561,"Sync_561");
				    return this;
			}
public BatchProcessInfoPage clickStop_69(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_69,"Stop_69");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_152(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_152,"NextScheduledRunDateIcon_152");
				    return this;
			}
public BatchProcessInfoPage clickSync_323(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_323,"Sync_323");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_583(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_583,"LastRunDateIcon_583");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_345(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_345,"LastRunDateIcon_345");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_374(WebDriver driver,String LastRunStatus_374) {
		            BrowserActions.type(driver, inpLastRunStatus_374,LastRunStatus_374, "LastRunStatus_374");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_107(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_107,"LastRunDateIcon_107");
				    return this;
			}
public BatchProcessInfoPage enterCronSMHDOMMDOW_212(WebDriver driver,String CronSMHDOMMDOW_212) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_212,CronSMHDOMMDOW_212, "CronSMHDOMMDOW_212");
			        return this;
           }
public BatchProcessInfoPage clickStop_468(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_468,"Stop_468");
				    return this;
			}
public BatchProcessInfoPage clickStop_223(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_223,"Stop_223");
				    return this;
			}
public BatchProcessInfoPage clickChart(WebDriver driver)  {
					BrowserActions.click(driver, btnChart,"Chart");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_709(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_709,"LastRunDateIcon_709");
				    return this;
			}
public BatchProcessInfoPage clickStop_272(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_272,"Stop_272");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_633(WebDriver driver,String BatchProcess_633)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_633,BatchProcess_633,"BatchProcess_633");
				    return this;
			}
public BatchProcessInfoPage clickSync_393(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_393,"Sync_393");
				    return this;
			}
public BatchProcessInfoPage clickRun_89(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_89,"Run_89");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_431(WebDriver driver,String NextScheduledRun_431) {
		            BrowserActions.type(driver, inpNextScheduledRun_431,NextScheduledRun_431, "NextScheduledRun_431");
			        return this;
           }
public BatchProcessInfoPage clickSync_155(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_155,"Sync_155");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_724(WebDriver driver,String LastRunStatus_724) {
		            BrowserActions.type(driver, inpLastRunStatus_724,LastRunStatus_724, "LastRunStatus_724");
			        return this;
           }
public BatchProcessInfoPage clickStop_279(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_279,"Stop_279");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_512(WebDriver driver,String LastRun_512) {
		            BrowserActions.type(driver, inpLastRun_512,LastRun_512, "LastRun_512");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_726(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_726,"NextScheduledRunDateIcon_726");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_231(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_231,"DownloadHistory_231");
				    return this;
			}
public BatchProcessInfoPage clickStop_286(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_286,"Stop_286");
				    return this;
			}
public BatchProcessInfoPage clickSync_141(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_141,"Sync_141");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_92(WebDriver driver,String LastRun_92) {
		            BrowserActions.type(driver, inpLastRun_92,LastRun_92, "LastRun_92");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_683(WebDriver driver,String NextScheduledRun_683) {
		            BrowserActions.type(driver, inpNextScheduledRun_683,NextScheduledRun_683, "NextScheduledRun_683");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_710(WebDriver driver,String LastRunStatus_710) {
		            BrowserActions.type(driver, inpLastRunStatus_710,LastRunStatus_710, "LastRunStatus_710");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_207(WebDriver driver,String NextScheduledRun_207) {
		            BrowserActions.type(driver, inpNextScheduledRun_207,NextScheduledRun_207, "NextScheduledRun_207");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_445(WebDriver driver,String NextScheduledRun_445) {
		            BrowserActions.type(driver, inpNextScheduledRun_445,NextScheduledRun_445, "NextScheduledRun_445");
			        return this;
           }
public BatchProcessInfoPage clickRun_75(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_75,"Run_75");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_526(WebDriver driver,String LastRun_526) {
		            BrowserActions.type(driver, inpLastRun_526,LastRun_526, "LastRun_526");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_723(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_723,"LastRunDateIcon_723");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_245(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_245,"DownloadHistory_245");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_764(WebDriver driver,String LastRun_764) {
		            BrowserActions.type(driver, inpLastRun_764,LastRun_764, "LastRun_764");
			        return this;
           }
public BatchProcessInfoPage enterDescription_186(WebDriver driver,String Description_186) {
		            BrowserActions.type(driver, inpDescription_186,Description_186, "Description_186");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_483(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_483,"DownloadHistory_483");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_540(WebDriver driver,String LastRun_540) {
		            BrowserActions.type(driver, inpLastRun_540,LastRun_540, "LastRun_540");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_502(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_502,"NextScheduledRunDateIcon_502");
				    return this;
			}
public BatchProcessInfoPage clickStop_251(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_251,"Stop_251");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_740(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_740,"NextScheduledRunDateIcon_740");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_500(WebDriver driver,String LastRunStatus_500) {
		            BrowserActions.type(driver, inpLastRunStatus_500,LastRunStatus_500, "LastRunStatus_500");
			        return this;
           }
public BatchProcessInfoPage clickRun_705(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_705,"Run_705");
				    return this;
			}
public BatchProcessInfoPage clickSync_379(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_379,"Sync_379");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_459(WebDriver driver,String NextScheduledRun_459) {
		            BrowserActions.type(driver, inpNextScheduledRun_459,NextScheduledRun_459, "NextScheduledRun_459");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_217(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_217,"DownloadHistory_217");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_697(WebDriver driver,String NextScheduledRun_697) {
		            BrowserActions.type(driver, inpNextScheduledRun_697,NextScheduledRun_697, "NextScheduledRun_697");
			        return this;
           }
public BatchProcessInfoPage selectProcessHistoryFilter(WebDriver driver,String ProcessHistoryFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpProcessHistoryFilter,ProcessHistoryFilter,"ProcessHistoryFilter");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_455(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_455,"DownloadHistory_455");
				    return this;
			}
public BatchProcessInfoPage clickStop_258(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_258,"Stop_258");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_619(WebDriver driver,String BatchProcess_619)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_619,BatchProcess_619,"BatchProcess_619");
				    return this;
			}
public BatchProcessInfoPage selectProcessUsageFilter(WebDriver driver,String ProcessUsageFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpProcessUsageFilter,ProcessUsageFilter,"ProcessUsageFilter");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_693(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_693,"DownloadHistory_693");
				    return this;
			}
public BatchProcessInfoPage clickStop_496(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_496,"Stop_496");
				    return this;
			}
public BatchProcessInfoPage enterDescription_172(WebDriver driver,String Description_172) {
		            BrowserActions.type(driver, inpDescription_172,Description_172, "Description_172");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_738(WebDriver driver,String LastRunStatus_738) {
		            BrowserActions.type(driver, inpLastRunStatus_738,LastRunStatus_738, "LastRunStatus_738");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_516(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_516,"NextScheduledRunDateIcon_516");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_554(WebDriver driver,String LastRun_554) {
		            BrowserActions.type(driver, inpLastRun_554,LastRun_554, "LastRun_554");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_754(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_754,"NextScheduledRunDateIcon_754");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_221(WebDriver driver,String NextScheduledRun_221) {
		            BrowserActions.type(driver, inpNextScheduledRun_221,NextScheduledRun_221, "NextScheduledRun_221");
			        return this;
           }
public BatchProcessInfoPage clickSync_365(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_365,"Sync_365");
				    return this;
			}
public BatchProcessInfoPage clickSync_127(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_127,"Sync_127");
				    return this;
			}
public BatchProcessInfoPage clickRun_719(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_719,"Run_719");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_469(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_469,"DownloadHistory_469");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_605(WebDriver driver,String BatchProcess_605)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_605,BatchProcess_605,"BatchProcess_605");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_302(WebDriver driver,String LastRun_302) {
		            BrowserActions.type(driver, inpLastRun_302,LastRun_302, "LastRun_302");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_78(WebDriver driver,String LastRun_78) {
		            BrowserActions.type(driver, inpLastRun_78,LastRun_78, "LastRun_78");
			        return this;
           }
public BatchProcessInfoPage clickStop_265(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_265,"Stop_265");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_528(WebDriver driver,String LastRunStatus_528) {
		            BrowserActions.type(driver, inpLastRunStatus_528,LastRunStatus_528, "LastRunStatus_528");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_768(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_768,"NextScheduledRunDateIcon_768");
				    return this;
			}
public BatchProcessInfoPage clickSync_197(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_197,"Sync_197");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_675(WebDriver driver,String BatchProcess_675)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_675,BatchProcess_675,"BatchProcess_675");
				    return this;
			}
public BatchProcessInfoPage clickBulkInvoiceRun(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_47,"Run_47");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_473(WebDriver driver,String NextScheduledRun_473) {
		            BrowserActions.type(driver, inpNextScheduledRun_473,NextScheduledRun_473, "NextScheduledRun_473");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_766(WebDriver driver,String LastRunStatus_766) {
		            BrowserActions.type(driver, inpLastRunStatus_766,LastRunStatus_766, "LastRunStatus_766");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_3(WebDriver driver,String BatchProcess_3)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_3,BatchProcess_3,"BatchProcess_3");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_751(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_751,"LastRunDateIcon_751");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_235(WebDriver driver,String NextScheduledRun_235) {
		            BrowserActions.type(driver, inpNextScheduledRun_235,NextScheduledRun_235, "NextScheduledRun_235");
			        return this;
           }
public BatchProcessInfoPage enterDescription_158(WebDriver driver,String Description_158) {
		            BrowserActions.type(driver, inpDescription_158,Description_158, "Description_158");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_513(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_513,"LastRunDateIcon_513");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_437(WebDriver driver,String BatchProcess_437)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_437,BatchProcess_437,"BatchProcess_437");
				    return this;
			}
public BatchProcessInfoPage verifyLastRunOfBulkInvoiceWorkflow(WebDriver driver) {
		            BrowserActions.verifyElementDisplayed(driver, txtLastRun_64, "LastRun_64");
			        return this;
           }
public BatchProcessInfoPage enterDescription_396(WebDriver driver,String Description_396) {
		            BrowserActions.type(driver, inpDescription_396,Description_396, "Description_396");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_316(WebDriver driver,String LastRun_316) {
		            BrowserActions.type(driver, inpLastRun_316,LastRun_316, "LastRun_316");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_661(WebDriver driver,String BatchProcess_661)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_661,BatchProcess_661,"BatchProcess_661");
				    return this;
			}
public BatchProcessInfoPage clickStart_266(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_266,"Start_266");
				    return this;
			}
public BatchProcessInfoPage clickSync_183(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_183,"Sync_183");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_330(WebDriver driver,String LastRun_330) {
		            BrowserActions.type(driver, inpLastRun_330,LastRun_330, "LastRun_330");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_423(WebDriver driver,String BatchProcess_423)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_423,BatchProcess_423,"BatchProcess_423");
				    return this;
			}
public BatchProcessInfoPage clickRun_33(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_33,"Run_33");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_752(WebDriver driver,String LastRunStatus_752) {
		            BrowserActions.type(driver, inpLastRunStatus_752,LastRunStatus_752, "LastRunStatus_752");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_530(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_530,"NextScheduledRunDateIcon_530");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_514(WebDriver driver,String LastRunStatus_514) {
		            BrowserActions.type(driver, inpLastRunStatus_514,LastRunStatus_514, "LastRunStatus_514");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_249(WebDriver driver,String NextScheduledRun_249) {
		            BrowserActions.type(driver, inpNextScheduledRun_249,NextScheduledRun_249, "NextScheduledRun_249");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_9(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_9,"LastRunDateIcon_9");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_765(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_765,"LastRunDateIcon_765");
				    return this;
			}
public BatchProcessInfoPage enterNextScheduledRun_487(WebDriver driver,String NextScheduledRun_487) {
		            BrowserActions.type(driver, inpNextScheduledRun_487,NextScheduledRun_487, "NextScheduledRun_487");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_50(WebDriver driver,String LastRun_50) {
		            BrowserActions.type(driver, inpLastRun_50,LastRun_50, "LastRun_50");
			        return this;
           }
public BatchProcessInfoPage clickLastRunDateIcon_527(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_527,"LastRunDateIcon_527");
				    return this;
			}
public BatchProcessInfoPage enterDescription_144(WebDriver driver,String Description_144) {
		            BrowserActions.type(driver, inpDescription_144,Description_144, "Description_144");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_287(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_287,"DownloadHistory_287");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_568(WebDriver driver,String LastRun_568) {
		            BrowserActions.type(driver, inpLastRun_568,LastRun_568, "LastRun_568");
			        return this;
           }
public BatchProcessInfoPage enterDescription_382(WebDriver driver,String Description_382) {
		            BrowserActions.type(driver, inpDescription_382,Description_382, "Description_382");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_344(WebDriver driver,String LastRun_344) {
		            BrowserActions.type(driver, inpLastRun_344,LastRun_344, "LastRun_344");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_306(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_306,"NextScheduledRunDateIcon_306");
				    return this;
			}
public BatchProcessInfoPage clickStop_293(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_293,"Stop_293");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_582(WebDriver driver,String LastRun_582) {
		            BrowserActions.type(driver, inpLastRun_582,LastRun_582, "LastRun_582");
			        return this;
           }
public BatchProcessInfoPage clickNextScheduledRunDateIcon_544(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_544,"NextScheduledRunDateIcon_544");
				    return this;
			}
public BatchProcessInfoPage clickStart_294(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_294,"Start_294");
				    return this;
			}
public BatchProcessInfoPage enterLastRunStatus_542(WebDriver driver,String LastRunStatus_542) {
		            BrowserActions.type(driver, inpLastRunStatus_542,LastRunStatus_542, "LastRunStatus_542");
			        return this;
           }
public BatchProcessInfoPage enterLastRunStatus_304(WebDriver driver,String LastRunStatus_304) {
		            BrowserActions.type(driver, inpLastRunStatus_304,LastRunStatus_304, "LastRunStatus_304");
			        return this;
           }
public BatchProcessInfoPage clickBulkInvoiceWorkflowRun(WebDriver driver)  {
					BrowserActions.click(driver, btnRun_61,"Bulk Invoice Workflow Run");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_259(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_259,"DownloadHistory_259");
				    return this;
			}
public BatchProcessInfoPage clickDownloadHistory_497(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_497,"DownloadHistory_497");
				    return this;
			}
public BatchProcessInfoPage clickLastRunDateIcon_737(WebDriver driver)  {
					BrowserActions.click(driver, btnLastRunDateIcon_737,"LastRunDateIcon_737");
				    return this;
			}
public BatchProcessInfoPage enterDescription_130(WebDriver driver,String Description_130) {
		            BrowserActions.type(driver, inpDescription_130,Description_130, "Description_130");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_604(WebDriver driver,String CronSMHDOMMDOW_604) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_604,CronSMHDOMMDOW_604, "CronSMHDOMMDOW_604");
			        return this;
           }
public BatchProcessInfoPage clickDownloadHistory_273(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_273,"DownloadHistory_273");
				    return this;
			}
public BatchProcessInfoPage clickNextScheduledRunDateIcon_558(WebDriver driver)  {
					BrowserActions.click(driver, btnNextScheduledRunDateIcon_558,"NextScheduledRunDateIcon_558");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_596(WebDriver driver,String LastRun_596) {
		            BrowserActions.type(driver, inpLastRun_596,LastRun_596, "LastRun_596");
			        return this;
           }
public BatchProcessInfoPage enterNextScheduledRun_263(WebDriver driver,String NextScheduledRun_263) {
		            BrowserActions.type(driver, inpNextScheduledRun_263,NextScheduledRun_263, "NextScheduledRun_263");
			        return this;
           }
public BatchProcessInfoPage clickStart_280(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_280,"Start_280");
				    return this;
			}
public BatchProcessInfoPage clickSync_169(WebDriver driver)  {
					BrowserActions.click(driver, btnSync_169,"Sync_169");
				    return this;
			}
public BatchProcessInfoPage enterLastRun_36(WebDriver driver,String LastRun_36) {
		            BrowserActions.type(driver, inpLastRun_36,LastRun_36, "LastRun_36");
			        return this;
           }
public BatchProcessInfoPage enterCronSMHDOMMDOW_618(WebDriver driver,String CronSMHDOMMDOW_618) {
		            BrowserActions.type(driver, inpCronSMHDOMMDOW_618,CronSMHDOMMDOW_618, "CronSMHDOMMDOW_618");
			        return this;
           }
public BatchProcessInfoPage enterLastRun_106(WebDriver driver,String LastRun_106) {
		            BrowserActions.type(driver, inpLastRun_106,LastRun_106, "LastRun_106");
			        return this;
           }
public BatchProcessInfoPage enterDescription_368(WebDriver driver,String Description_368) {
		            BrowserActions.type(driver, inpDescription_368,Description_368, "Description_368");
			        return this;
           }
public BatchProcessInfoPage selectBatchProcess_647(WebDriver driver,String BatchProcess_647)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_647,BatchProcess_647,"BatchProcess_647");
				    return this;
			}
public BatchProcessInfoPage selectBatchProcess_409(WebDriver driver,String BatchProcess_409)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBatchProcess_409,BatchProcess_409,"BatchProcess_409");
				    return this;
			}
public BatchProcessInfoPage verifyLastRunOfBulkInvoice(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, txtLastRunOfBulkInovice, "Last Run");
    return this;
}
public BatchProcessInfoPage verifyRefreshButton(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnRefresh,"Refresh");
    return this;
}
public BatchProcessInfoPage verifyDownloadButton(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnDownload,"Download");
    return this;
}
public BatchProcessInfoPage verifySuspendSchedulerButton(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnSuspendScheduler,"SuspendScheduler");
    return this;
}
public BatchProcessInfoPage verifyScheduleActionsBulkInvoice(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtScheduleBulkInvoice,"Schedule start and stop");
    return this;
}
public BatchProcessInfoPage verifyScheduleActionsBulkInvoiceWorkflow(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtScheduleBulkInvoiceWorkflow,"Schedule start and stop");
    return this;
}
public BatchProcessInfoPage verifyBatchProcessLastRunStatus(WebDriver driver,String batchProcess) {
	By batchProcessby = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'LastRunStatus')]");
	BrowserActions.waitForElementToDisplay(driver, batchProcessby, "batch_Process");
	WebElement btnLastRunStatus = batchProcessby.findElement(driver);
	BrowserActions.verifyElementDisplayed(driver, btnLastRunStatus, "Last Run Status");
	Log.messageStep(batchProcess+" of Last Run status is Displayed",DriverManager.getDriver());
    return this;
}
public BatchProcessInfoPage verifyRunStatusforExchangeRate(WebDriver driver,String batchProcess) {
	By batchProcessBy = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'LastRun_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, batchProcessBy, "batchProcess");
	WebElement btnBeforeLastRunStatus = batchProcessBy.findElement(driver);
	String beforeText= btnBeforeLastRunStatus.getText();
	this.clickBatchProcessRunButton(driver, batchProcess);
	By batchprocessBy = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'LastRun_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, batchprocessBy, "Batch Process");
	WebElement btnAfterLastRunStatus = batchprocessBy.findElement(driver);
	String afterText= btnAfterLastRunStatus.getText();
	 Pattern pattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
	    Matcher beforeMatcher = pattern.matcher(beforeText);
	    Matcher afterMatcher = pattern.matcher(afterText);

	    String beforeTimeString = beforeMatcher.find() ? beforeMatcher.group() : null;
	    String afterTimeString = afterMatcher.find() ? afterMatcher.group() : null;

	    LocalTime beforeTime = beforeTimeString != null ? LocalTime.parse(beforeTimeString) : null;
	    LocalTime afterTime = afterTimeString != null ? LocalTime.parse(afterTimeString) : null;

	    if (beforeTime != null && afterTime != null) {
	        Duration duration = Duration.between(beforeTime, afterTime);
	        if (duration.getSeconds() != 0) {
	        	Log.message("Exchange Rate ran succesfully");
	        }
	        else {
				Log.fail("Exchange batch failed to run");
			}
}
		return this;
}
public BatchProcessInfoPage verifyLastRunStatusOfAggregateLimit(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, txtLastRunStatusofAggregate, "Last Run Status");
    return this;
}
public BatchProcessInfoPage verifyLastRunStatusOfArchiveReference(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, txtLastRunStatusofArchiveReference, "Last Run Status");
    return this;
}
public BatchProcessInfoPage verifyBatchProcessNextScheduledRun(WebDriver driver,String batchProcess) {
	By batchProcessBy= By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'NextRun')]");
	BrowserActions.waitForElementToDisplay(driver, batchProcessBy, "Batch Process");
	WebElement btnNextScheduleRun = batchProcessBy.findElement(driver);
	BrowserActions.verifyElementDisplayed(driver, btnNextScheduleRun, "Next Scheduled Run");
    return this;
}
public BatchProcessInfoPage verifyNextScheduledRunAggregateLimit(WebDriver driver) {
	String text="";
	String actualText=txtNextScheduleRunAggregateLimit.getText();
	Log.assertThat(actualText.equals(text),  "Next Scheduled Run is not displayed", " NextScheduledRun is displayed", driver);
    return this;
}
public BatchProcessInfoPage verifyNextScheduledRunClaimHealth(WebDriver driver) {
	String text="";
	String actualText=txtNextScheduleClaimHealth.getText();
	Log.assertThat(actualText.equals(text),  "Next Scheduled Run is not displayed", " NextScheduled Run is displayed", driver);
    return this;
}

public BatchProcessInfoPage verifyNextScheduledRunClaimHealthSPM(WebDriver driver) {
	String text="";
	String actualText=txtNextScheduleClaimHealthSPM.getText();
	Log.assertThat(actualText.equals(text),  "Next Scheduled Run is not displayed", " NextScheduled Run is displayed", driver);
    return this;
}
public BatchProcessInfoPage verifyBatchProcessSchedule(WebDriver driver,String batchProcess)  {
	By batchProcessBy= By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'ScheduleActions')]");//Financials Escalation
	BrowserActions.waitForElementToDisplay(driver, batchProcessBy, "Batch Process");
	WebElement btnSchedule = batchProcessBy.findElement(driver);
	BrowserActions.verifyElementDisplayed(driver, btnSchedule,"Schedule start and stop");
    return this;
}
public BatchProcessInfoPage verifyScheduleActionsAggregateLimit(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtNextScheduleStartforAggregateLimit,"Schedule start and stop");
	BrowserActions.verifyElementDisplayed(driver, txtNextScheduleStopforAggregateLimit,"Schedule start and stop");
    return this;
}
public BatchProcessInfoPage verifyScheduleActionsClaimHealth(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtNextScheduleStartforClaimHealth,"Schedule start and stop");
	BrowserActions.verifyElementDisplayed(driver, txtNextScheduleStopforClaimHealth,"Schedule start and stop");
    return this;
}
public BatchProcessInfoPage verifyScheduleActionsClaimHealthSPM(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtNextScheduleStartforClaimHealthSPM,"Schedule start and stop");
	BrowserActions.verifyElementDisplayed(driver, txtNextScheduleStopforClaimHealthSPM,"Schedule start and stop");
    return this;
}
public BatchProcessInfoPage verifyScheduleActionAggregateLimit(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtNextScheduleRunActivityEscalation,"Schedule start and stop");
    return this;
}
public BatchProcessInfoPage verifyBatches(WebDriver driver)  {
    By batchBy = By.tagName("tr");
    int size = BrowserActions.getWebElementSize(driver, batchBy, "Batch By", 0.5);
	 	if ( size > 1) {
	 		Log.event("Batch details verified");
		}
    return this;
}
public WorkQueueInfoPage clickWorkQueueInfo(WebDriver driver)  {
	BrowserActions.click(driver, btnWorkQueueInfo,true,"Work Queue Info");
	 Log.messageStep("Work Queue Info Button is Clicked and Details Of Work Queue Info were Displayed",DriverManager.getDriver());
	return new WorkQueueInfoPage(driver).get();
}
public BatchProcessInfoPage verifyBatchProcessScheduledStartAndStop(WebDriver driver,String batchProcess) {
	By batchProcessBy= By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'ScheduleActions')]");
	BrowserActions.waitForElementToDisplay(driver, batchProcessBy, "Batch Process");
	WebElement btnNextScheduleRun = batchProcessBy.findElement(driver);
	BrowserActions.verifyElementDisplayed(driver, btnNextScheduleRun, "Scheduled Start and Stop");
    return this;
}
public BatchProcessInfoPage verifyNextScheduledRunProcessCompletionMonitor(WebDriver driver,String batchProcess) {
 By batchProcessBy =By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'NextRun')]");
 BrowserActions.waitForElementToDisplay(driver, batchProcessBy, "Batch Process");
 WebElement btnNextScheduleRun = batchProcessBy.findElement(driver);
 String text = BrowserActions.getText(driver, btnNextScheduleRun, "Next Schdule");
 if(text.isBlank()) {
	Log.message("next run is not displayed");
}else {
	Log.fail(" next run displayed");	
	}
return this;
}
public BatchProcessInfoPage verifyScheduleActionsProcessCompletionMonitorStartButton(WebDriver driver){
  BrowserActions.verifyElementDisplayed(driver, btnStart_126,"Schedule start Button");
return this;
}
public BatchProcessInfoPage verifyScheduleActionsProcessCompletionMonitorStopButton(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, btnStop_489,"Schedule Stop Button");
	Log.messageStep("Last Run , Last Run Status, Refresh Button , Download Button, Suspend Scheduler Button , NextScheduled RunProcess Completion Monitor , ScheduleActions Process Completion MonitorStart Button Were Displayed ",DriverManager.getDriver());
	return this;
}
public BatchProcessInfoPage clickRunHandleUnresolvedContingency(WebDriver driver) {
	BrowserActions.click(driver,btnRunHandleUnresolvedContingency,2, "Run");
	return this;
}
public MySummaryPage clickReturnToPolicyCenter(WebDriver driver) {
	BrowserActions.click(driver,btnReturnToPolicyCenter,1,"Navigated Back to Policy Center");
	return new MySummaryPage(driver).get();
}
/**
 * Clicks on Actions
 * @author vignesh.ravi
 * @param driver
 * @return 
 */
public BatchProcessInfoPage clickActions(WebDriver driver) {
	BrowserActions.click(driver, btnActions,1.5,"Actions button");
	return this;
}
}
