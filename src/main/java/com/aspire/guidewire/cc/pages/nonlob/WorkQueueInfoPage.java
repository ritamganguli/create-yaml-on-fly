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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class WorkQueueInfoPage extends LoadableComponent<WorkQueueInfoPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public WorkQueueInfo workqueueinfoTable;

//	public WorkQueueWritersPanelSet workqueuewriterspanelsetTable;

	//public WorkQueueExecutorsPanelSet workqueueexecutorspanelsetTable;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_15;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numActive']", AI = false)
	private WebElement inpAvailable_350;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-RestartWorkers", AI = false)
	private WebElement btnRestart_119;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-AvailableCount']", AI = false)
	private WebElement inpAvailable_593;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numActive']", AI = false)
	private WebElement inpAvailable_110;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-RestartWorkers", AI = false)
	private WebElement btnRestart_359;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkItemsByWriterTab", AI = false)
	private WebElement btnByWriters;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-ServerId']", AI = false)
	private WebElement inpServer_613;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_612;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_865;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_135;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_301;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_589;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-ProcessId']", AI = false)
	private WebElement inpProcessID_506;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-UpTime']", AI = false)
	private WebElement inpUpFor_798;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_375;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_494;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_833;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-RunWriter", AI = false)
	private WebElement btnRunWriter_176;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_422;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_669;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_900;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numFailed']", AI = false)
	private WebElement inpFailed_28;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-AvailableCount']", AI = false)
	private WebElement inpAvailable_580;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_27;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-RestartWorkers", AI = false)
	private WebElement btnRestart_107;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-ServerId']", AI = false)
	private WebElement inpServer_600;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-RestartWorkers", AI = false)
	private WebElement btnRestart_347;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_874;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_147;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_313;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_387;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_488;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-ProcessId']", AI = false)
	private WebElement inpProcessID_519;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_1;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_842;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV_tb-download>div[role='button']", AI = false)
	private WebElement btnDownload;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-StopWorkers", AI = false)
	private WebElement btnStop;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-RunWriter", AI = false)
	private WebElement btnRunWriter_164;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_435;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_39;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_883;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numActive']", AI = false)
	private WebElement inpAvailable_14;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-UpTime']", AI = false)
	private WebElement inpUpFor_771;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-RestartWorkers", AI = false)
	private WebElement btnRestart_335;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_159;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-RunWriter", AI = false)
	private WebElement btnRunWriter_392;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_399;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-ServerId']", AI = false)
	private WebElement inpServer_639;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_563;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_475;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_325;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_682;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_927;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-RunWriter", AI = false)
	private WebElement btnRunWriter_152;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_815;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numActive']", AI = false)
	private WebElement inpAvailable_338;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_448;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-StartedTime']", AI = false)
	private WebElement inpStarted_895;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_892;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-UpTime']", AI = false)
	private WebElement inpUpFor_780;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-RestartWorkers", AI = false)
	private WebElement btnRestart_323;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-RunWriter", AI = false)
	private WebElement btnRunWriter_380;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_462;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-ServerId']", AI = false)
	private WebElement inpServer_626;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_909;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-ProcessId']", AI = false)
	private WebElement inpProcessID;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-UpTime']", AI = false)
	private WebElement inpUpFor_789;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_707;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_337;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_576;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_171;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_918;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-RunWriter", AI = false)
	private WebElement btnRunWriter_140;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_824;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-AvailableCount']", AI = false)
	private WebElement inpAvailable_567;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numActive']", AI = false)
	private WebElement inpAvailable_326;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_695;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-StartedTime']", AI = false)
	private WebElement inpStarted_886;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numFailed']", AI = false)
	private WebElement inpFailed_16;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numFailed']", AI = false)
	private WebElement inpFailed;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-ServerId']", AI = false)
	private WebElement inpServer_652;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-RestartWorkers", AI = false)
	private WebElement btnRestart_311;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_455;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-ProcessId']", AI = false)
	private WebElement inpProcessID_701;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-ServerId']", AI = false)
	private WebElement inpServer_418;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_349;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_183;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numFailed']", AI = false)
	private WebElement inpFailed_184;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_109;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_689;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_402;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_51;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numActive']", AI = false)
	private WebElement inpAvailable_158;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-StartedTime']", AI = false)
	private WebElement inpStarted_877;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_312;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numActive']", AI = false)
	private WebElement inpAvailable_398;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-StartedTime']", AI = false)
	private WebElement inpStarted_868;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-ProcessId']", AI = false)
	private WebElement inpProcessID_714;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-Active']", AI = false)
	private WebElement rdbActive;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numFailed']", AI = false)
	private WebElement inpFailed_172;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-WasScheduled']", AI = false)
	private WebElement rdbScheduled_627;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numActive']", AI = false)
	private WebElement inpAvailable_146;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_324;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_806;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_63;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_630;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-RunWriter", AI = false)
	private WebElement btnRunWriter_128;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numActive']", AI = false)
	private WebElement inpAvailable_386;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-RunWriter", AI = false)
	private WebElement btnRunWriter_368;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-ServerId']", AI = false)
	private WebElement inpServer_431;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numActive']", AI = false)
	private WebElement inpAvailable_374;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-StartedTime']", AI = false)
	private WebElement inpStarted_859;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_121;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_361;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-ServerId']", AI = false)
	private WebElement inpServer_678;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_195;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-RunWriter", AI = false)
	private WebElement btnRunWriter_356;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-WriterId']", AI = false)
	private WebElement inpWriter_933;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_468;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-WasScheduled']", AI = false)
	private WebElement rdbScheduled_614;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_643;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_75;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numActive']", AI = false)
	private WebElement inpAvailable_134;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-StartedTime']", AI = false)
	private WebElement inpStarted_850;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-RunWriter", AI = false)
	private WebElement btnRunWriter_116;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numActive']", AI = false)
	private WebElement inpAvailable_362;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_133;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-ServerId']", AI = false)
	private WebElement inpServer_665;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_373;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-TasksTab", AI = false)
	private WebElement btnByTasks_925;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_481;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-RunWriter", AI = false)
	private WebElement btnRunWriter_344;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numFailed']", AI = false)
	private WebElement inpFailed_196;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-WriterId']", AI = false)
	private WebElement inpWriter_948;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numActive']", AI = false)
	private WebElement inpAvailable_122;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_300;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-WasScheduled']", AI = false)
	private WebElement rdbScheduled_601;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-StartedTime']", AI = false)
	private WebElement inpStarted_841;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_87;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-RunWriter", AI = false)
	private WebElement btnRunWriter_104;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_656;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-ProcessId']", AI = false)
	private WebElement inpProcessID_584;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-RunWriter", AI = false)
	private WebElement btnRunWriter;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-ServerId']", AI = false)
	private WebElement inpServer_457;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_456;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_512;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-RunWriter", AI = false)
	private WebElement btnRunWriter_80;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_341;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_650;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-Notify", AI = false)
	private WebElement btnNotify_333;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_101;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_690;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_747;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-AvailableCount']", AI = false)
	private WebElement inpAvailable_515;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-StartedTime']", AI = false)
	private WebElement inpStarted_832;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numActive']", AI = false)
	private WebElement inpAvailable_86;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-ServerId']", AI = false)
	private WebElement inpServer_444;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-ProcessId']", AI = false)
	private WebElement inpProcessID_597;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_303;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-StartedTime']", AI = false)
	private WebElement inpStarted_823;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-Notify", AI = false)
	private WebElement btnNotify_345;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_663;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_542;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_443;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_525;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-Notify", AI = false)
	private WebElement btnNotify_105;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_353;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_511;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_113;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_738;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkItemExceptionCV-WorkItemExceptionCardTab", AI = false)
	private WebElement btnError;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_416;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-AvailableCount']", AI = false)
	private WebElement inpAvailable_502;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_3;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-ServerId']", AI = false)
	private WebElement inpServer_691;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numActive']", AI = false)
	private WebElement inpAvailable_74;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numActive']", AI = false)
	private WebElement inpAvailable_98;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_604;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-FailedCount']", AI = false)
	private WebElement inpFaileditems_902;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_677;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_315;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-StartedTime']", AI = false)
	private WebElement inpStarted_814;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_555;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_430;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_538;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_802;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-RunWriter", AI = false)
	private WebElement btnRunWriter_68;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-Notify", AI = false)
	private WebElement btnNotify_309;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_429;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_896;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_317;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_765;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-ServerId']", AI = false)
	private WebElement inpServer_483;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_617;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-StartedTime']", AI = false)
	private WebElement inpStarted_805;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_327;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_568;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkQueueWorkItemsLV_tb-WorkItem_Restart>div[role='button']", AI = false)
	private WebElement btnRestart_962;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_811;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-Notify", AI = false)
	private WebElement btnNotify_321;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_664;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_442;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-RunWriter", AI = false)
	private WebElement btnRunWriter_56;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_676;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_329;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-AvailableCount']", AI = false)
	private WebElement inpAvailable_723;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_756;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-ServerId']", AI = false)
	private WebElement inpServer_470;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-ProcessId']", AI = false)
	private WebElement inpProcessID_571;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_417;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-ServerId']", AI = false)
	private WebElement inpServer_496;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_339;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numActive']", AI = false)
	private WebElement inpAvailable_38;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_820;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-ProcessId']", AI = false)
	private WebElement inpProcessID_545;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_651;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_18;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-Hostname']", AI = false)
	private WebElement inpHostname_826;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_829;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_878;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numActive']", AI = false)
	private WebElement inpAvailable_314;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-AvailableCount']", AI = false)
	private WebElement inpAvailable_554;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_621;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-Notify", AI = false)
	private WebElement btnNotify_381;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_550;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numActive']", AI = false)
	private WebElement inpAvailable_26;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-Notify", AI = false)
	private WebElement btnNotify_141;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_720;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-ProcessId']", AI = false)
	private WebElement inpProcessID_558;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-Hostname']", AI = false)
	private WebElement inpHostname_817;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_838;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_581;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_936;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_305;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_887;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_611;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numActive']", AI = false)
	private WebElement inpAvailable_302;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-RunWriter", AI = false)
	private WebElement btnRunWriter_8;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-AvailableCount']", AI = false)
	private WebElement inpAvailable_541;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_638;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_608;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_524;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-Hostname']", AI = false)
	private WebElement inpHostname_808;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-Notify", AI = false)
	private WebElement btnNotify_357;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_111;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_847;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_594;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_351;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_860;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-Notify", AI = false)
	private WebElement btnNotify_117;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_851;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_624;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_30;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_729;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numActive']", AI = false)
	private WebElement inpAvailable_62;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_625;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-RunWriter", AI = false)
	private WebElement btnRunWriter_92;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-ProcessId']", AI = false)
	private WebElement inpProcessID_532;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_856;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_123;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_537;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-Notify", AI = false)
	private WebElement btnNotify_129;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_363;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-Notify", AI = false)
	private WebElement btnNotify_369;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-RunWriter", AI = false)
	private WebElement btnRunWriter_188;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_637;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-AvailableCount']", AI = false)
	private WebElement inpAvailable_528;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_869;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_951;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-Notify", AI = false)
	private WebElement btnNotify_21;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numActive']", AI = false)
	private WebElement inpAvailable_50;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_473;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-FailedCount']", AI = false)
	private WebElement inpFaileditems_848;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-Notify", AI = false)
	private WebElement btnNotify_297;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-Hostname']", AI = false)
	private WebElement inpHostname_862;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_185;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-Status']", AI = false)
	private WebElement inpStatus_885;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_174;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_54;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_543;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-FailedCount']", AI = false)
	private WebElement inpFailed_544;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-ConsecutiveErrors']", AI = false)
	private WebElement inpConsecutiveErrors_946;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-StopWorkers", AI = false)
	private WebElement btnStop_310;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_791;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_486;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-FailedCount']", AI = false)
	private WebElement inpFaileditems_839;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-ConsecutiveErrors']", AI = false)
	private WebElement inpConsecutiveErrors_961;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-Hostname']", AI = false)
	private WebElement inpHostname_853;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-Status']", AI = false)
	private WebElement inpStatus_876;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_197;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-TaskFilter']", AI = false)
	private WebElement drpTasks_926;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_162;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_42;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-FailedCount']", AI = false)
	private WebElement inpFaileditems_830;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_530;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-FailedCount']", AI = false)
	private WebElement inpFailed_531;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-StopWorkers", AI = false)
	private WebElement btnStop_322;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-Hostname']", AI = false)
	private WebElement inpHostname_844;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_782;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_180;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_161;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-Notify", AI = false)
	private WebElement btnNotify_273;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-FailedCount']", AI = false)
	private WebElement inpFailed_557;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-Success']", AI = false)
	private WebElement rdbSuccess_934;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numFailed']", AI = false)
	private WebElement inpFailed_316;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_499;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-FailedCount']", AI = false)
	private WebElement inpFaileditems_866;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_24;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_78;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_517;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_192;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-FailedCount']", AI = false)
	private WebElement inpFaileditems_857;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numFailed']", AI = false)
	private WebElement inpFailed_304;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-Notify", AI = false)
	private WebElement btnNotify_285;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_12;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_173;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_66;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_186;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-Hostname']", AI = false)
	private WebElement inpHostname_835;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-Status']", AI = false)
	private WebElement inpStatus_894;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-Success']", AI = false)
	private WebElement rdbSuccess_949;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_773;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_607;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-FailedCount']", AI = false)
	private WebElement inpFaileditems_803;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-Status']", AI = false)
	private WebElement inpStatus_849;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_434;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_307;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_389;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-Status']", AI = false)
	private WebElement inpStatus_840;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_495;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_137;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-UpTime']", AI = false)
	private WebElement inpUpFor_906;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_582;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-RestartWorkers", AI = false)
	private WebElement btnRestart;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-StopWorkers", AI = false)
	private WebElement btnStop_118;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-StopWorkers", AI = false)
	private WebElement btnStop_358;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_90;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_764;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_319;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-Hostname']", AI = false)
	private WebElement inpHostname_898;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkItemExceptionCV-WorkItemExceptionDV-Exception']", AI = false)
	private WebElement inpException;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-FailedCount']", AI = false)
	private WebElement inpFailed_726;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_447;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_891;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_620;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-Status']", AI = false)
	private WebElement inpStatus_831;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_482;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-maximumPoolSize", AI = false)
	private WebElement txtMaximumPoolSize;
	
	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-poolSize_Input", AI = false)
	private WebElement txtPoolSize;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-UpTime']", AI = false)
	private WebElement inpUpFor_924;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_149;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_722;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-UpTime']", AI = false)
	private WebElement inpUpFor_915;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_198;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkItemsByWriterTab", AI = false)
	private WebElement btnByWriters_409;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_755;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_681;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_694;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-FailedCount']", AI = false)
	private WebElement inpFailed_518;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_633;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-FailedCount']", AI = false)
	private WebElement inpFaileditems_821;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-Status']", AI = false)
	private WebElement inpStatus_867;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_125;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_365;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-Hostname']", AI = false)
	private WebElement inpHostname_889;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-ExceptionsCount']", AI = false)
	private WebElement inpExceptions;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-InstanceId']", AI = false)
	private WebElement inpID_932;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-Hostname']", AI = false)
	private WebElement inpHostname_880;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_746;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-StopWorkers", AI = false)
	private WebElement btnStop_334;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_569;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-Success']", AI = false)
	private WebElement rdbSuccess;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_646;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-FailedCount']", AI = false)
	private WebElement inpFaileditems_812;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-FailedCount']", AI = false)
	private WebElement inpFailed_505;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-Status']", AI = false)
	private WebElement inpStatus_858;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-Hostname']", AI = false)
	private WebElement inpHostname_871;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_469;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_377;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_331;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_737;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_709;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-StopWorkers", AI = false)
	private WebElement btnStop_106;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-StopWorkers", AI = false)
	private WebElement btnStop_346;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_460;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_556;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-StopWorkers", AI = false)
	private WebElement btnStop_154;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numActive']", AI = false)
	private WebElement inpAvailable_194;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_360;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-StopWorkers", AI = false)
	private WebElement btnStop_394;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_265;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-Status']", AI = false)
	private WebElement inpStatus_804;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_103;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-InstanceId']", AI = false)
	private WebElement inpID_947;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_343;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-RunWriter", AI = false)
	private WebElement btnRunWriter_212;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_728;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numFailed']", AI = false)
	private WebElement inpFailed_148;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numFailed']", AI = false)
	private WebElement inpFailed_388;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_99;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_372;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numActive']", AI = false)
	private WebElement inpAvailable_182;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_355;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_115;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_277;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-ConsecutiveErrors']", AI = false)
	private WebElement inpConsecutiveErrors;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-EndedTime_dateIcon", AI = false)
	private WebElement btnEndedDateIcon_959;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-RunWriter", AI = false)
	private WebElement btnRunWriter_200;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_527;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-WasScheduled']", AI = false)
	private WebElement rdbScheduled_549;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_318;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numFailed']", AI = false)
	private WebElement inpFailed_136;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numFailed']", AI = false)
	private WebElement inpFailed_376;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_120;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-StopWorkers", AI = false)
	private WebElement btnStop_166;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-StopWorkers", AI = false)
	private WebElement btnStop_130;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numActive']", AI = false)
	private WebElement inpAvailable_170;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-StopWorkers", AI = false)
	private WebElement btnStop_370;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-RestartWorkers", AI = false)
	private WebElement btnRestart_299;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_367;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-Status']", AI = false)
	private WebElement inpStatus_822;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_289;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_127;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_102;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_514;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numFailed']", AI = false)
	private WebElement inpFailed_160;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_342;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numFailed']", AI = false)
	private WebElement inpFailed_88;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_336;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-WasScheduled']", AI = false)
	private WebElement rdbScheduled_536;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-StopWorkers", AI = false)
	private WebElement btnStop_142;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-StopWorkers", AI = false)
	private WebElement btnStop_382;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_139;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-Status']", AI = false)
	private WebElement inpStatus_813;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-RestartWorkers", AI = false)
	private WebElement btnRestart_287;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_379;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_501;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_330;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_108;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_348;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-WasScheduled']", AI = false)
	private WebElement rdbScheduled_523;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_595;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-StopWorkers", AI = false)
	private WebElement btnStop_190;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-UpTime']", AI = false)
	private WebElement inpUpFor_753;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-RestartWorkers", AI = false)
	private WebElement btnRestart_275;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_366;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_391;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_579;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_151;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numFailed']", AI = false)
	private WebElement inpFailed_64;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_126;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_461;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-FailedCount']", AI = false)
	private WebElement inpFaileditems_884;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numFailed']", AI = false)
	private WebElement inpFailed_100;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_156;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numFailed']", AI = false)
	private WebElement inpFailed_340;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_396;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-FailedCount']", AI = false)
	private WebElement inpFailed_583;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numFailed']", AI = false)
	private WebElement inpFailed_328;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-UpTime']", AI = false)
	private WebElement inpUpFor_762;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-Notify", AI = false)
	private WebElement btnNotify_9;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-RestartWorkers", AI = false)
	private WebElement btnRestart_263;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_917;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_354;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-FailedCount']", AI = false)
	private WebElement inpFailed_570;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_163;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_566;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numFailed']", AI = false)
	private WebElement inpFailed_76;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_474;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_114;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-FailedCount']", AI = false)
	private WebElement inpFaileditems_875;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_168;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-RunWriter", AI = false)
	private WebElement btnRunWriter_404;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-WasScheduled']", AI = false)
	private WebElement rdbScheduled_588;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-CheckedOutItemsCount']", AI = false)
	private WebElement inpCheckedoutitems;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_390;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-RestartWorkers", AI = false)
	private WebElement btnRestart_251;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_553;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-ServerId']", AI = false)
	private WebElement inpServer_717;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-UpTime']", AI = false)
	private WebElement inpUpFor_735;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_150;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numFailed']", AI = false)
	private WebElement inpFailed_40;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_908;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_5;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numFailed']", AI = false)
	private WebElement inpFailed_124;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_487;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numFailed']", AI = false)
	private WebElement inpFailed_364;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_132;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-StopWorkers", AI = false)
	private WebElement btnStop_178;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-WasScheduled']", AI = false)
	private WebElement rdbScheduled_575;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-WasScheduled']", AI = false)
	private WebElement rdbScheduled_562;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-ServerId']", AI = false)
	private WebElement inpServer_704;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-UpTime']", AI = false)
	private WebElement inpUpFor_744;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_175;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-EndedTime_dateIcon", AI = false)
	private WebElement btnEndedDateIcon_944;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_540;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_138;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numFailed']", AI = false)
	private WebElement inpFailed_52;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_378;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numFailed']", AI = false)
	private WebElement inpFailed_112;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_144;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-FailedCount']", AI = false)
	private WebElement inpFailed_596;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-FailedCount']", AI = false)
	private WebElement inpFaileditems_893;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numFailed']", AI = false)
	private WebElement inpFailed_352;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_384;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-TasksTab", AI = false)
	private WebElement btnByTasks;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-RestartWorkers", AI = false)
	private WebElement btnRestart_23;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-RestartWorkers", AI = false)
	private WebElement btnRestart_239;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numActive']", AI = false)
	private WebElement inpAvailable_230;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_65;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-ProcessId']", AI = false)
	private WebElement inpProcessID_623;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_25;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_255;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_748;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_187;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-SkippedCount']", AI = false)
	private WebElement inpSkippeditems_940;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-WasScheduled']", AI = false)
	private WebElement rdbScheduled_718;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-RunWriter", AI = false)
	private WebElement btnRunWriter_296;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV_tb-downloadRawData>div[role='button']", AI = false)
	private WebElement btnDownloadRawData;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_957;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-StartedTime']", AI = false)
	private WebElement inpStarted_796;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-AvailableCount']", AI = false)
	private WebElement inpAvailable_476;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_472;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numActive']", AI = false)
	private WebElement inpAvailable_2;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_53;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-RestartWorkers", AI = false)
	private WebElement btnRestart_11;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-RestartWorkers", AI = false)
	private WebElement btnRestart_227;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-ProcessId']", AI = false)
	private WebElement inpProcessID_636;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_267;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_757;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_13;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-PrintHistory", AI = false)
	private WebElement btnDownloadHistory;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkQueueWorkItemsLV-Filter']", AI = false)
	private WebElement drpFilter_963;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_199;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_408;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-WasScheduled']", AI = false)
	private WebElement rdbScheduled_705;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-SkippedCount']", AI = false)
	private WebElement inpSkippeditems_955;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-RunWriter", AI = false)
	private WebElement btnRunWriter_284;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_552;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-StartedTime']", AI = false)
	private WebElement inpStarted_787;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-AvailableCount']", AI = false)
	private WebElement inpAvailable_463;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_41;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_680;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-AvailableCount']", AI = false)
	private WebElement inpAvailable_450;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_716;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-RestartWorkers", AI = false)
	private WebElement btnRestart_215;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_766;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_279;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_446;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_592;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-UpTime']", AI = false)
	private WebElement inpUpFor_897;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_205;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numActive']", AI = false)
	private WebElement inpAvailable_218;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_931;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-RunWriter", AI = false)
	private WebElement btnRunWriter_272;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_565;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-StartedTime']", AI = false)
	private WebElement inpStarted_778;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_801;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-AvailableCount']", AI = false)
	private WebElement inpAvailable_697;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_703;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_693;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-ProcessId']", AI = false)
	private WebElement inpProcessID_610;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_775;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-RestartWorkers", AI = false)
	private WebElement btnRestart_203;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-StartedTime']", AI = false)
	private WebElement inpStarted_769;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-RunWriter", AI = false)
	private WebElement btnRunWriter_260;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_459;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-ServerId']", AI = false)
	private WebElement inpServer_509;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_217;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_291;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_942;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-Hostname']", AI = false)
	private WebElement inpHostname;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numActive']", AI = false)
	private WebElement inpAvailable_206;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-AvailableCount']", AI = false)
	private WebElement inpAvailable_684;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_578;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-StartedTime']", AI = false)
	private WebElement inpStarted_760;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_784;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-ServerId']", AI = false)
	private WebElement inpServer_535;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_229;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_572;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkQueueWorkItemsLV-Filter']", AI = false)
	private WebElement drpFilter;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_914;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numActive']", AI = false)
	private WebElement inpAvailable_278;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_500;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-WasScheduled']", AI = false)
	private WebElement rdbScheduled_510;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-StartedTime']", AI = false)
	private WebElement inpStarted_751;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_793;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-ServerId']", AI = false)
	private WebElement inpServer_522;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_585;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numFailed']", AI = false)
	private WebElement inpFailed_292;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_923;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_204;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numActive']", AI = false)
	private WebElement inpAvailable_266;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-StartedTime']", AI = false)
	private WebElement inpStarted_742;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-RunWriter", AI = false)
	private WebElement btnRunWriter_248;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_513;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_485;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_89;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_19;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_241;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_598;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-EndedTime_dateIcon", AI = false)
	private WebElement btnEndedDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-StartedTime']", AI = false)
	private WebElement inpStarted_733;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_306;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numActive']", AI = false)
	private WebElement inpAvailable_254;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_526;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-RunWriter", AI = false)
	private WebElement btnRunWriter_236;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-ServerId']", AI = false)
	private WebElement inpServer_561;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-RestartWorkers", AI = false)
	private WebElement btnRestart_407;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_539;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numActive']", AI = false)
	private WebElement inpAvailable_242;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_253;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_77;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-EndedTime']", AI = false)
	private WebElement inpEnded;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-ServerId']", AI = false)
	private WebElement inpServer_548;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_498;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-Notify", AI = false)
	private WebElement btnNotify_405;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-RunWriter", AI = false)
	private WebElement btnRunWriter_224;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-AvailableCount']", AI = false)
	private WebElement inpAvailable_489;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_905;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-ServerId']", AI = false)
	private WebElement inpServer_574;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_659;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-ProcessId']", AI = false)
	private WebElement inpProcessID_467;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_413;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-StartedTime']", AI = false)
	private WebElement inpStarted_956;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_708;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-Notify", AI = false)
	private WebElement btnNotify_213;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-Hostname']", AI = false)
	private WebElement inpHostname_907;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_573;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-StopWorkers", AI = false)
	private WebElement btnStop_34;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_901;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_221;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-CheckedOutItemsCount']", AI = false)
	private WebElement inpCheckedoutitems_950;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV_tb-refresh>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_84;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_797;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_628;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-AvailableCount']", AI = false)
	private WebElement inpAvailable_632;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_6;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_31;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_864;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_425;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_642;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_910;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-Notify", AI = false)
	private WebElement btnNotify_225;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-StopWorkers", AI = false)
	private WebElement btnStop_46;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_233;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_560;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_919;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_72;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_533;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-StartedTime']", AI = false)
	private WebElement inpStarted_941;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_855;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-ProcessId']", AI = false)
	private WebElement inpProcessID_441;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_438;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-FailedCount']", AI = false)
	private WebElement inpFailed_713;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_655;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-ProcessId']", AI = false)
	private WebElement inpProcessID_688;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-StopWorkers", AI = false)
	private WebElement btnStop_10;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-UpTime']", AI = false)
	private WebElement inpUpFor;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_602;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_672;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-ExceptionCount']", AI = false)
	private WebElement inpExceptions_928;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-AvailableCount']", AI = false)
	private WebElement inpAvailable_619;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_546;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-OrphansCount']", AI = false)
	private WebElement inpOrphansreclaimed;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-WriterStatus']", AI = false)
	private WebElement inpWriterStatus;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_779;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_882;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-StartedTime']", AI = false)
	private WebElement inpStarted_930;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-CheckedOutItemsCount']", AI = false)
	private WebElement inpCheckedoutitems_935;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_55;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_721;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_421;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-ProcessId']", AI = false)
	private WebElement inpProcessID_454;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-ServerId']", AI = false)
	private WebElement inpServer_587;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_207;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-TaskFilter']", AI = false)
	private WebElement drpTasks;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_547;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-FailedCount']", AI = false)
	private WebElement inpFailed_700;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-StartedTime']", AI = false)
	private WebElement inpStarted_922;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-StopWorkers", AI = false)
	private WebElement btnStop_22;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_685;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-Notify", AI = false)
	private WebElement btnNotify_201;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_668;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-ExceptionCount']", AI = false)
	private WebElement inpExceptions_937;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_559;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_96;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_615;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_788;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_209;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-AvailableCount']", AI = false)
	private WebElement inpAvailable_606;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_873;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_43;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_79;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_219;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_504;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-ProcessId']", AI = false)
	private WebElement inpProcessID_662;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-AvailableCount']", AI = false)
	private WebElement inpAvailable_671;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-10-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_534;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-StartedTime']", AI = false)
	private WebElement inpStarted_913;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_698;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_667;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_48;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-ProcessId']", AI = false)
	private WebElement inpProcessID_428;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_451;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_420;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_29;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_761;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_752;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_828;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-AvailableCount']", AI = false)
	private WebElement inpAvailable_437;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_67;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-Notify", AI = false)
	private WebElement btnNotify_261;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-StartedTime']", AI = false)
	private WebElement inpStarted_904;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-ProcessId']", AI = false)
	private WebElement inpProcessID_675;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-ExceptionCount']", AI = false)
	private WebElement inpExceptions_952;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_17;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_36;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_464;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_521;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_603;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_770;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-Status']", AI = false)
	private WebElement inpStatus_795;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_433;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_819;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-StopWorkers", AI = false)
	private WebElement btnStop_406;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-AvailableCount']", AI = false)
	private WebElement inpAvailable_424;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_810;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_725;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_477;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_616;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-ProcessId']", AI = false)
	private WebElement inpProcessID_649;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_231;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_641;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-Notify", AI = false)
	private WebElement btnNotify_237;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_60;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_507;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_846;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-AvailableCount']", AI = false)
	private WebElement inpAvailable_658;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_734;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_91;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-AvailableCount']", AI = false)
	private WebElement inpAvailable_412;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_508;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_730;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_520;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-ProcessId']", AI = false)
	private WebElement inpProcessID_415;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-Hostname']", AI = false)
	private WebElement inpHostname_916;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numCheckedOut']", AI = false)
	private WebElement inpCheckedOut_243;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-ExceptionsCount']", AI = false)
	private WebElement inpExceptions_739;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_629;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_654;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-Notify", AI = false)
	private WebElement btnNotify_249;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_837;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_490;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_401;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-StartedTime_dateIcon", AI = false)
	private WebElement btnStartedDateIcon_743;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-AvailableCount']", AI = false)
	private WebElement inpAvailable_645;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_712;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_7;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-ServerId']", AI = false)
	private WebElement inpServer;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-Hostname']", AI = false)
	private WebElement inpHostname_745;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-Notify", AI = false)
	private WebElement btnNotify_177;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-FailedCount']", AI = false)
	private WebElement inpFailed_414;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-Status']", AI = false)
	private WebElement inpStatus_768;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_294;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_660;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-Notify", AI = false)
	private WebElement btnNotify_33;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_426;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-FailedCount']", AI = false)
	private WebElement inpFailed_661;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_590;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-FailedCount']", AI = false)
	private WebElement inpFailed_648;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-Status']", AI = false)
	private WebElement inpStatus_759;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-FailedCount']", AI = false)
	private WebElement inpFaileditems_954;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-Notify", AI = false)
	private WebElement btnNotify_189;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-Hostname']", AI = false)
	private WebElement inpHostname_736;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_282;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-Status']", AI = false)
	private WebElement inpStatus_750;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-StartedTime']", AI = false)
	private WebElement inpStarted;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-Notify", AI = false)
	private WebElement btnNotify_45;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-StopWorkers", AI = false)
	private WebElement btnStop_202;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-Notify", AI = false)
	private WebElement btnNotify_393;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_647;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-FailedCount']", AI = false)
	private WebElement inpFaileditems_749;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_403;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-WriterId']", AI = false)
	private WebElement inpWriter;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_711;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-Notify", AI = false)
	private WebElement btnNotify_153;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_281;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-poolSize']", AI = false)
	private WebElement inpPoolSize;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-Hostname']", AI = false)
	private WebElement inpHostname_727;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-Status']", AI = false)
	private WebElement inpStatus_786;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-Notify", AI = false)
	private WebElement btnNotify;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_702;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-FailedCount']", AI = false)
	private WebElement inpFailed_687;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-FailedCount']", AI = false)
	private WebElement inpFaileditems;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-FailedCount']", AI = false)
	private WebElement inpFaileditems_740;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-Notify", AI = false)
	private WebElement btnNotify_57;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-WasScheduled']", AI = false)
	private WebElement rdbScheduled_497;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-FailedCount']", AI = false)
	private WebElement inpFailed_440;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-WasScheduled']", AI = false)
	private WebElement rdbScheduled_484;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_890;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-OrphansCount']", AI = false)
	private WebElement inpOrphansreclaimed_953;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_724;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-Notify", AI = false)
	private WebElement btnNotify_165;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-FailedCount']", AI = false)
	private WebElement inpFailed_427;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_293;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-Status']", AI = false)
	private WebElement inpStatus_777;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-CreationTime']", AI = false)
	private WebElement inpItemCreationTime_715;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-WasScheduled']", AI = false)
	private WebElement rdbScheduled;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-FailedCount']", AI = false)
	private WebElement inpFaileditems_731;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_899;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-FailedCount']", AI = false)
	private WebElement inpFailed_674;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsTab", AI = false)
	private WebElement btnWorkitems;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_634;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-Notify", AI = false)
	private WebElement btnNotify_69;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsTab", AI = false)
	private WebElement btnWorkitems_411;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-EndedTime']", AI = false)
	private WebElement inpEnded_958;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-11-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_551;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_881;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-FailedCount']", AI = false)
	private WebElement inpFaileditems_920;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-RunWriter", AI = false)
	private WebElement btnRunWriter_44;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-FailedCount']", AI = false)
	private WebElement inpFaileditems_929;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-StopWorkers", AI = false)
	private WebElement btnStop_82;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_706;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-Hostname']", AI = false)
	private WebElement inpHostname_781;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-StopWorkers", AI = false)
	private WebElement btnStop_238;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_465;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-FailedCount']", AI = false)
	private WebElement inpFailed_622;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-23-AvailableCount']", AI = false)
	private WebElement inpAvailable_710;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_783;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-16-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_618;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-12-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_564;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_503;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-FailedCount']", AI = false)
	private WebElement inpFaileditems_911;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-EndedTime']", AI = false)
	private WebElement inpEnded_943;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-Hostname']", AI = false)
	private WebElement inpHostname_772;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-OrphansCount']", AI = false)
	private WebElement inpOrphansreclaimed_938;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-RunWriter", AI = false)
	private WebElement btnRunWriter_32;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-FailedCount']", AI = false)
	private WebElement inpFailed_609;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-24-NumberOfItems']", AI = false)
	private WebElement inpNumberofItems_719;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-Notify", AI = false)
	private WebElement btnNotify_81;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_269;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-StopWorkers", AI = false)
	private WebElement btnStop_94;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_605;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_774;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_452;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_872;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_699;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-8-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_516;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-Hostname']", AI = false)
	private WebElement inpHostname_763;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-15-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_599;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsTab", AI = false)
	private WebElement btnByExecutors_410;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-13-LastWorkerEndTime']", AI = false)
	private WebElement inpWorkerEndTime_577;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-FailedCount']", AI = false)
	private WebElement inpFailed_635;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-RunWriter", AI = false)
	private WebElement btnRunWriter_20;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-StopWorkers", AI = false)
	private WebElement btnStop_58;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-Status']", AI = false)
	private WebElement inpStatus_741;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_245;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numFailed']", AI = false)
	private WebElement inpFailed_4;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-Notify", AI = false)
	private WebElement btnNotify_93;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_686;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-StopWorkers", AI = false)
	private WebElement btnStop_214;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numFailed']", AI = false)
	private WebElement inpFailed_400;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-ProcessId']", AI = false)
	private WebElement inpProcessID_480;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_863;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-9-CheckedOutCount']", AI = false)
	private WebElement inpCheckedOut_529;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_439;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-Hostname']", AI = false)
	private WebElement inpHostname_754;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-ProcessedItemsCount']", AI = false)
	private WebElement inpProcesseditems_792;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numActive']", AI = false)
	private WebElement inpAvailable;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-CreationTime_dateIcon", AI = false)
	private WebElement btnItemCreationTimeDateIcon_586;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-Status']", AI = false)
	private WebElement inpStatus_732;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numExecutorsActive']", AI = false)
	private WebElement inpExecutorsRunning_257;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-FailedCount']", AI = false)
	private WebElement inpFaileditems_939;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_211;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-StopWorkers", AI = false)
	private WebElement btnStop_70;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_854;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-StopWorkers", AI = false)
	private WebElement btnStop_226;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_673;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-7-ProcessId']", AI = false)
	private WebElement inpProcessID_493;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_240;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-StopWorkers", AI = false)
	private WebElement btnStop_274;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_385;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_223;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-Status']", AI = false)
	private WebElement inpStatus_921;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_145;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-UpTime']", AI = false)
	private WebElement inpUpFor_834;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_657;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-RunWriter", AI = false)
	private WebElement btnRunWriter_332;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-WasScheduled']", AI = false)
	private WebElement rdbScheduled_679;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_845;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numFailed']", AI = false)
	private WebElement inpFailed_268;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-WasScheduled']", AI = false)
	private WebElement rdbScheduled_432;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-StopWorkers", AI = false)
	private WebElement btnStop_286;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_397;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-RestartWorkers", AI = false)
	private WebElement btnRestart_95;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-Status']", AI = false)
	private WebElement inpStatus_912;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_235;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_157;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-UpTime']", AI = false)
	private WebElement inpUpFor_843;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_97;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_491;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-6-FailedCount']", AI = false)
	private WebElement inpFailed_492;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-RestartWorkers", AI = false)
	private WebElement btnRestart_191;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-RunWriter", AI = false)
	private WebElement btnRunWriter_320;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_644;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_836;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numFailed']", AI = false)
	private WebElement inpFailed_256;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-WasScheduled']", AI = false)
	private WebElement rdbScheduled_666;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-FailedCount']", AI = false)
	private WebElement inpFaileditems_794;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_85;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-StopWorkers", AI = false)
	private WebElement btnStop_250;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numActive']", AI = false)
	private WebElement inpAvailable_290;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-RestartWorkers", AI = false)
	private WebElement btnRestart_179;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-RestartWorkers", AI = false)
	private WebElement btnRestart_83;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_169;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_247;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-17-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_631;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_222;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-UpTime']", AI = false)
	private WebElement inpUpFor_807;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-WasScheduled']", AI = false)
	private WebElement rdbScheduled_419;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numFailed']", AI = false)
	private WebElement inpFailed_280;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_827;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_216;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-19-WasScheduled']", AI = false)
	private WebElement rdbScheduled_653;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_73;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-Hostname']", AI = false)
	private WebElement inpHostname_799;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-StopWorkers", AI = false)
	private WebElement btnStop_262;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-RestartWorkers", AI = false)
	private WebElement btnRestart_71;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-RestartWorkers", AI = false)
	private WebElement btnRestart_167;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_259;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-UpTime']", AI = false)
	private WebElement inpUpFor_825;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_818;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-UpTime']", AI = false)
	private WebElement inpUpFor_816;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_210;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_228;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-RunWriter", AI = false)
	private WebElement btnRunWriter_308;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-Hostname']", AI = false)
	private WebElement inpHostname_790;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-18-WasScheduled']", AI = false)
	private WebElement rdbScheduled_640;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-2-Active']", AI = false)
	private WebElement rdbActive_960;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-SucceededItemCount']", AI = false)
	private WebElement inpSucceeded_478;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_61;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-WasScheduled']", AI = false)
	private WebElement rdbScheduled_471;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_181;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-UpTime']", AI = false)
	private WebElement inpUpFor_870;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-FailedCount']", AI = false)
	private WebElement inpFaileditems_767;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-RestartWorkers", AI = false)
	private WebElement btnRestart_155;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-RestartWorkers", AI = false)
	private WebElement btnRestart_395;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-activeThreads", AI = false)
	private WebElement txtActiveThreadsCount;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_696;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-UpTime']", AI = false)
	private WebElement inpUpFor_879;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-0-CreationTime']", AI = false)
	private WebElement inpItemCreationTime;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_271;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_809;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_246;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-MaxWorkers']", AI = false)
	private WebElement inpMaxNumberofWorkers_800;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-FailedCount']", AI = false)
	private WebElement inpFailed_466;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_276;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numFailed']", AI = false)
	private WebElement inpFailed_220;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_193;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numFailed']", AI = false)
	private WebElement inpFailed_208;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-FailedCount']", AI = false)
	private WebElement inpFaileditems_758;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-1-Active']", AI = false)
	private WebElement rdbActive_945;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-RestartWorkers", AI = false)
	private WebElement btnRestart_143;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-UpTime']", AI = false)
	private WebElement inpUpFor_888;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-RestartWorkers", AI = false)
	private WebElement btnRestart_383;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-21-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_683;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_234;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-14-LastWorkerEndTime_dateIcon", AI = false)
	private WebElement btnWorkerEndTimeDateIcon_591;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_283;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_449;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_288;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-FailedCount']", AI = false)
	private WebElement inpFailed_453;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-InstanceId']", AI = false)
	private WebElement inpID;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-RestartWorkers", AI = false)
	private WebElement btnRestart_59;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-RestartWorkers", AI = false)
	private WebElement btnRestart_47;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-22-WasScheduled']", AI = false)
	private WebElement rdbScheduled_692;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-0-SkippedCount']", AI = false)
	private WebElement inpSkippeditems;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-Status']", AI = false)
	private WebElement inpStatus_903;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_49;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_270;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-20-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_670;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-UpTime']", AI = false)
	private WebElement inpUpFor_852;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-RestartWorkers", AI = false)
	private WebElement btnRestart_131;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-RestartWorkers", AI = false)
	private WebElement btnRestart_371;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-2-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_436;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-WriterStatus']", AI = false)
	private WebElement inpWriterStatus_295;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-4-WasScheduled']", AI = false)
	private WebElement rdbScheduled_458;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-FailedCount']", AI = false)
	private WebElement inpFaileditems_785;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numFailed']", AI = false)
	private WebElement inpFailed_244;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_252;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-StopWorkers", AI = false)
	private WebElement btnStop_298;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsTab", AI = false)
	private WebElement btnByExecutors;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-RestartWorkers", AI = false)
	private WebElement btnRestart_35;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-UpTime']", AI = false)
	private WebElement inpUpFor_861;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-WorkQueueName']", AI = false)
	private WebElement inpWorkQueue_37;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-1-ExecutionTime']", AI = false)
	private WebElement inpExecutionTime_423;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-startedClusterWide']", AI = false)
	private WebElement inpClusterWideState_258;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-5-FailedCount']", AI = false)
	private WebElement inpFailed_479;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-FailedCount']", AI = false)
	private WebElement inpFaileditems_776;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numFailed']", AI = false)
	private WebElement inpFailed_232;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWritersPanelSet-WorkQueueItemByWriterLV-3-WasScheduled']", AI = false)
	private WebElement rdbScheduled_445;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-PrintHistory", AI = false)
	private WebElement btnDownloadHistory_264;
	
	@IFindBy(how = How.CSS, using = "td[id$='WorkQueueNameHeader_Cell']", AI = false)
	private WebElement lblWorkQueue;
	
	@IFindBy(how = How.CSS, using = "td[id$='numActiveHeader_Cell']", AI = false)
	private WebElement lblAvailable;
	
	@IFindBy(how = How.CSS, using = "td[id$='numCheckedOutHeader_Cell']", AI = false)
	private WebElement lblCheckout;
	
	@IFindBy(how = How.CSS, using = "td[id$='numFailedHeader_Cell']", AI = false)
	private WebElement lblFailed;
	
	@IFindBy(how = How.CSS, using = "td[id$='numExecutorsActiveHeader_Cell']", AI = false)
	private WebElement lblExecutors;
	
	@IFindBy(how = How.CSS, using = "td[id$='startedClusterWideHeader_Cell']", AI = false)
	private WebElement lblClusterWide;
	
	@IFindBy(how = How.CSS, using = "td[id$='WriterStatusHeader_Cell']", AI = false)
	private WebElement lblWriterStatus;
	
	@IFindBy(how = How.CSS, using = "td[id$='NotifyCellHeader_Cell']", AI = false)
	private WebElement lblActions;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-ProcessId']", AI = false)
	private WebElement txtProcessId;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-CreationTime']", AI = false)
	private WebElement txtItemCreationTime;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-NumberOfItems']", AI = false)
	private WebElement txtNumberofItems;
	
	@IFindBy(how = How.CSS, using = "div[id$='HostnameHeader_inner']", AI = false)
	public WebElement fldHostname;

	@IFindBy(how = How.CSS, using = "div[id$='MaxWorkersHeader_inner']", AI = false)
	public WebElement fldMaxNumberOfWorkers;

	@IFindBy(how = How.CSS, using = "div[id$='ProcessedItemsCountHeader_inner']", AI = false)
	public WebElement fldProcessedItems;

	@IFindBy(how = How.CSS, using = "div[id$='ExceptionsCountHeader_inner']", AI = false)
	public WebElement fldExceptions;

	@IFindBy(how = How.CSS, using = "div[id$='UpTimeHeader_inner']", AI = false)
	public WebElement fldUpTime;

	@IFindBy(how = How.CSS, using = "td[id$='LV-0-Status_Cell']", AI = false)
	public WebElement txtStatus;

	@IFindBy(how = How.CSS, using = "div[id$='ExecutorDetailLV-StartedTimeHeader_inner']", AI = false)
	public WebElement fldStarted;

	
	
	
	

	public WorkQueueInfoPage(){
	}

	public WorkQueueInfoPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	//	workqueueinfoTable = new WorkQueueInfo();
	//	workqueuewriterspanelsetTable = new WorkQueueWritersPanelSet();
	//	workqueueexecutorspanelsetTable = new WorkQueueExecutorsPanelSet();
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
}public WorkQueueInfoPage enterCheckedOut_15(WebDriver driver,String CheckedOut_15) {
		            BrowserActions.type(driver, inpCheckedOut_15,CheckedOut_15, "CheckedOut_15");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_350(WebDriver driver,String Available_350) {
		            BrowserActions.type(driver, inpAvailable_350,Available_350, "Available_350");
			        return this;
           }
public WorkQueueInfoPage clickRestart_119(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_119,"Restart_119");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_593(WebDriver driver,String Available_593) {
		            BrowserActions.type(driver, inpAvailable_593,Available_593, "Available_593");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_110(WebDriver driver,String Available_110) {
		            BrowserActions.type(driver, inpAvailable_110,Available_110, "Available_110");
			        return this;
           }
public WorkQueueInfoPage clickRestart_359(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_359,"Restart_359");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon,"StartedDateIcon");
				    return this;
			}
public WorkQueueInfoPage clickByWriters(WebDriver driver)  {
					BrowserActions.click(driver, btnByWriters,"ByWriters");
				    return this;
			}
public WorkQueueInfoPage enterServer_613(WebDriver driver,String Server_613) {
		            BrowserActions.type(driver, inpServer_613,Server_613, "Server_613");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_612(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_612,"ItemCreationTimeDateIcon_612");
				    return this;
			}
public WorkQueueInfoPage enterExceptions_865(WebDriver driver,String Exceptions_865) {
		            BrowserActions.type(driver, inpExceptions_865,Exceptions_865, "Exceptions_865");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_135(WebDriver driver,String CheckedOut_135) {
		            BrowserActions.type(driver, inpCheckedOut_135,CheckedOut_135, "CheckedOut_135");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_301(WebDriver driver,String WorkQueue_301) {
		            BrowserActions.type(driver, inpWorkQueue_301,WorkQueue_301, "WorkQueue_301");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_589(WebDriver driver,String NumberofItems_589) {
		            BrowserActions.type(driver, inpNumberofItems_589,NumberofItems_589, "NumberofItems_589");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_506(WebDriver driver,String ProcessID_506) {
		            BrowserActions.type(driver, inpProcessID_506,ProcessID_506, "ProcessID_506");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_798(WebDriver driver,String UpFor_798) {
		            BrowserActions.type(driver, inpUpFor_798,UpFor_798, "UpFor_798");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_375(WebDriver driver,String CheckedOut_375) {
		            BrowserActions.type(driver, inpCheckedOut_375,CheckedOut_375, "CheckedOut_375");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_494(WebDriver driver,String ItemCreationTime_494) {
		            BrowserActions.type(driver, inpItemCreationTime_494,ItemCreationTime_494, "ItemCreationTime_494");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_833(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_833,"StartedDateIcon_833");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_176(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_176,"RunWriter_176");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_422(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_422,"WorkerEndTimeDateIcon_422");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_669(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_669,"WorkerEndTimeDateIcon_669");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems_900(WebDriver driver,String Processeditems_900) {
		            BrowserActions.type(driver, inpProcesseditems_900,Processeditems_900, "Processeditems_900");
			        return this;
           }
public WorkQueueInfoPage enterFailed_28(WebDriver driver,String Failed_28) {
		            BrowserActions.type(driver, inpFailed_28,Failed_28, "Failed_28");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_580(WebDriver driver,String Available_580) {
		            BrowserActions.type(driver, inpAvailable_580,Available_580, "Available_580");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_27(WebDriver driver,String CheckedOut_27) {
		            BrowserActions.type(driver, inpCheckedOut_27,CheckedOut_27, "CheckedOut_27");
			        return this;
           }
public WorkQueueInfoPage clickRestart_107(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_107,"Restart_107");
				    return this;
			}
public WorkQueueInfoPage enterServer_600(WebDriver driver,String Server_600) {
		            BrowserActions.type(driver, inpServer_600,Server_600, "Server_600");
			        return this;
           }
public WorkQueueInfoPage clickRestart_347(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_347,"Restart_347");
				    return this;
			}
public WorkQueueInfoPage enterExceptions_874(WebDriver driver,String Exceptions_874) {
		            BrowserActions.type(driver, inpExceptions_874,Exceptions_874, "Exceptions_874");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_147(WebDriver driver,String CheckedOut_147) {
		            BrowserActions.type(driver, inpCheckedOut_147,CheckedOut_147, "CheckedOut_147");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_313(WebDriver driver,String WorkQueue_313) {
		            BrowserActions.type(driver, inpWorkQueue_313,WorkQueue_313, "WorkQueue_313");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_387(WebDriver driver,String CheckedOut_387) {
		            BrowserActions.type(driver, inpCheckedOut_387,CheckedOut_387, "CheckedOut_387");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_488(WebDriver driver,String ExecutionTime_488) {
		            BrowserActions.type(driver, inpExecutionTime_488,ExecutionTime_488, "ExecutionTime_488");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_519(WebDriver driver,String ProcessID_519) {
		            BrowserActions.type(driver, inpProcessID_519,ProcessID_519, "ProcessID_519");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_1(WebDriver driver,String WorkQueue_1) {
		            BrowserActions.type(driver, inpWorkQueue_1,WorkQueue_1, "WorkQueue_1");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_842(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_842,"StartedDateIcon_842");
				    return this;
			}
public WorkQueueInfoPage clickDownload(WebDriver driver)  {
					BrowserActions.click(driver, btnDownload,"Download");
				    return this;
			}
public WorkQueueInfoPage verifyDownload(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnDownload,"Download");
    return this;
}

public WorkQueueInfoPage clickStop(WebDriver driver,String batchProcess)  {
	By btnStopBy = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'NotifyCell')]//div[contains(@id,'StopWorkers')]");
	BrowserActions.waitForElementToDisplay(driver, btnStopBy, "Stop By");
	WebElement btnStop = btnStopBy.findElement(driver);
	BrowserActions.moveToElementandClick(driver, btnStop,2," Stop");
    return this;
			}
public WorkQueueInfoPage verifyStop(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnStop,"Stop");
    return this;
}
public WorkQueueInfoPage clickRunWriter_164(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_164,"RunWriter_164");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_435(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_435,"WorkerEndTimeDateIcon_435");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_39(WebDriver driver,String CheckedOut_39) {
		            BrowserActions.type(driver, inpCheckedOut_39,CheckedOut_39, "CheckedOut_39");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_883(WebDriver driver,String Exceptions_883) {
		            BrowserActions.type(driver, inpExceptions_883,Exceptions_883, "Exceptions_883");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_14(WebDriver driver,String Available_14) {
		            BrowserActions.type(driver, inpAvailable_14,Available_14, "Available_14");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_771(WebDriver driver,String UpFor_771) {
		            BrowserActions.type(driver, inpUpFor_771,UpFor_771, "UpFor_771");
			        return this;
           }
public WorkQueueInfoPage clickRestart_335(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_335,"Restart_335");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_159(WebDriver driver,String CheckedOut_159) {
		            BrowserActions.type(driver, inpCheckedOut_159,CheckedOut_159, "CheckedOut_159");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_392(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_392,"RunWriter_392");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_399(WebDriver driver,String CheckedOut_399) {
		            BrowserActions.type(driver, inpCheckedOut_399,CheckedOut_399, "CheckedOut_399");
			        return this;
           }
public WorkQueueInfoPage enterServer_639(WebDriver driver,String Server_639) {
		            BrowserActions.type(driver, inpServer_639,Server_639, "Server_639");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_563(WebDriver driver,String NumberofItems_563) {
		            BrowserActions.type(driver, inpNumberofItems_563,NumberofItems_563, "NumberofItems_563");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_475(WebDriver driver,String ExecutionTime_475) {
		            BrowserActions.type(driver, inpExecutionTime_475,ExecutionTime_475, "ExecutionTime_475");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_325(WebDriver driver,String WorkQueue_325) {
		            BrowserActions.type(driver, inpWorkQueue_325,WorkQueue_325, "WorkQueue_325");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_682(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_682,"WorkerEndTimeDateIcon_682");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems_927(WebDriver driver,String Processeditems_927) {
		            BrowserActions.type(driver, inpProcesseditems_927,Processeditems_927, "Processeditems_927");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_152(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_152,"RunWriter_152");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon_815(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_815,"StartedDateIcon_815");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_338(WebDriver driver,String Available_338) {
		            BrowserActions.type(driver, inpAvailable_338,Available_338, "Available_338");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_448(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_448,"WorkerEndTimeDateIcon_448");
				    return this;
			}
public WorkQueueInfoPage enterStarted_895(WebDriver driver,String Started_895) {
		            BrowserActions.type(driver, inpStarted_895,Started_895, "Started_895");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_892(WebDriver driver,String Exceptions_892) {
		            BrowserActions.type(driver, inpExceptions_892,Exceptions_892, "Exceptions_892");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_780(WebDriver driver,String UpFor_780) {
		            BrowserActions.type(driver, inpUpFor_780,UpFor_780, "UpFor_780");
			        return this;
           }
public WorkQueueInfoPage clickRestart_323(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_323,"Restart_323");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_380(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_380,"RunWriter_380");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_462(WebDriver driver,String ExecutionTime_462) {
		            BrowserActions.type(driver, inpExecutionTime_462,ExecutionTime_462, "ExecutionTime_462");
			        return this;
           }
public WorkQueueInfoPage enterServer_626(WebDriver driver,String Server_626) {
		            BrowserActions.type(driver, inpServer_626,Server_626, "Server_626");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_909(WebDriver driver,String Processeditems_909) {
		            BrowserActions.type(driver, inpProcesseditems_909,Processeditems_909, "Processeditems_909");
			        return this;
           }
public WorkQueueInfoPage enterProcessID(WebDriver driver,String ProcessID) {
		            BrowserActions.type(driver, inpProcessID,ProcessID, "ProcessID");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_789(WebDriver driver,String UpFor_789) {
		            BrowserActions.type(driver, inpUpFor_789,UpFor_789, "UpFor_789");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_707(WebDriver driver,String WorkerEndTime_707) {
		            BrowserActions.type(driver, inpWorkerEndTime_707,WorkerEndTime_707, "WorkerEndTime_707");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_337(WebDriver driver,String WorkQueue_337) {
		            BrowserActions.type(driver, inpWorkQueue_337,WorkQueue_337, "WorkQueue_337");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_576(WebDriver driver,String NumberofItems_576) {
		            BrowserActions.type(driver, inpNumberofItems_576,NumberofItems_576, "NumberofItems_576");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_171(WebDriver driver,String CheckedOut_171) {
		            BrowserActions.type(driver, inpCheckedOut_171,CheckedOut_171, "CheckedOut_171");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_918(WebDriver driver,String Processeditems_918) {
		            BrowserActions.type(driver, inpProcesseditems_918,Processeditems_918, "Processeditems_918");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_140(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_140,"RunWriter_140");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon_824(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_824,"StartedDateIcon_824");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_567(WebDriver driver,String Available_567) {
		            BrowserActions.type(driver, inpAvailable_567,Available_567, "Available_567");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_326(WebDriver driver,String Available_326) {
		            BrowserActions.type(driver, inpAvailable_326,Available_326, "Available_326");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_695(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_695,"WorkerEndTimeDateIcon_695");
				    return this;
			}
public WorkQueueInfoPage enterStarted_886(WebDriver driver,String Started_886) {
		            BrowserActions.type(driver, inpStarted_886,Started_886, "Started_886");
			        return this;
           }
public WorkQueueInfoPage enterFailed_16(WebDriver driver,String Failed_16) {
		            BrowserActions.type(driver, inpFailed_16,Failed_16, "Failed_16");
			        return this;
           }
public WorkQueueInfoPage enterFailed(WebDriver driver,String Failed) {
		            BrowserActions.type(driver, inpFailed,Failed, "Failed");
			        return this;
           }
public WorkQueueInfoPage enterServer_652(WebDriver driver,String Server_652) {
		            BrowserActions.type(driver, inpServer_652,Server_652, "Server_652");
			        return this;
           }
public WorkQueueInfoPage clickRestart_311(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_311,"Restart_311");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_455(WebDriver driver,String ItemCreationTime_455) {
		            BrowserActions.type(driver, inpItemCreationTime_455,ItemCreationTime_455, "ItemCreationTime_455");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_701(WebDriver driver,String ProcessID_701) {
		            BrowserActions.type(driver, inpProcessID_701,ProcessID_701, "ProcessID_701");
			        return this;
           }
public WorkQueueInfoPage enterServer_418(WebDriver driver,String Server_418) {
		            BrowserActions.type(driver, inpServer_418,Server_418, "Server_418");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_349(WebDriver driver,String WorkQueue_349) {
		            BrowserActions.type(driver, inpWorkQueue_349,WorkQueue_349, "WorkQueue_349");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_183(WebDriver driver,String CheckedOut_183) {
		            BrowserActions.type(driver, inpCheckedOut_183,CheckedOut_183, "CheckedOut_183");
			        return this;
           }
public WorkQueueInfoPage enterFailed_184(WebDriver driver,String Failed_184) {
		            BrowserActions.type(driver, inpFailed_184,Failed_184, "Failed_184");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_109(WebDriver driver,String WorkQueue_109) {
		            BrowserActions.type(driver, inpWorkQueue_109,WorkQueue_109, "WorkQueue_109");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_689(WebDriver driver,String ItemCreationTime_689) {
		            BrowserActions.type(driver, inpItemCreationTime_689,ItemCreationTime_689, "ItemCreationTime_689");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_402(WebDriver driver,String ClusterWideState_402) {
		            BrowserActions.type(driver, inpClusterWideState_402,ClusterWideState_402, "ClusterWideState_402");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_51(WebDriver driver,String CheckedOut_51) {
		            BrowserActions.type(driver, inpCheckedOut_51,CheckedOut_51, "CheckedOut_51");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_158(WebDriver driver,String Available_158) {
		            BrowserActions.type(driver, inpAvailable_158,Available_158, "Available_158");
			        return this;
           }
public WorkQueueInfoPage enterStarted_877(WebDriver driver,String Started_877) {
		            BrowserActions.type(driver, inpStarted_877,Started_877, "Started_877");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_312(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_312,"DownloadHistory_312");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_398(WebDriver driver,String Available_398) {
		            BrowserActions.type(driver, inpAvailable_398,Available_398, "Available_398");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded(WebDriver driver,String Succeeded) {
		            BrowserActions.type(driver, inpSucceeded,Succeeded, "Succeeded");
			        return this;
           }
public WorkQueueInfoPage enterStarted_868(WebDriver driver,String Started_868) {
		            BrowserActions.type(driver, inpStarted_868,Started_868, "Started_868");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_714(WebDriver driver,String ProcessID_714) {
		            BrowserActions.type(driver, inpProcessID_714,ProcessID_714, "ProcessID_714");
			        return this;
           }
public WorkQueueInfoPage clickActive(WebDriver driver)  {
					BrowserActions.click(driver, rdbActive,"Active");
				    return this;
			}
public WorkQueueInfoPage enterFailed_172(WebDriver driver,String Failed_172) {
		            BrowserActions.type(driver, inpFailed_172,Failed_172, "Failed_172");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_627(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_627,"Scheduled_627");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_146(WebDriver driver,String Available_146) {
		            BrowserActions.type(driver, inpAvailable_146,Available_146, "Available_146");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_324(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_324,"DownloadHistory_324");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon_806(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_806,"StartedDateIcon_806");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_63(WebDriver driver,String CheckedOut_63) {
		            BrowserActions.type(driver, inpCheckedOut_63,CheckedOut_63, "CheckedOut_63");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_630(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_630,"WorkerEndTimeDateIcon_630");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_128(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_128,"RunWriter_128");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_386(WebDriver driver,String Available_386) {
		            BrowserActions.type(driver, inpAvailable_386,Available_386, "Available_386");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_368(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_368,"RunWriter_368");
				    return this;
			}
public WorkQueueInfoPage enterServer_431(WebDriver driver,String Server_431) {
		            BrowserActions.type(driver, inpServer_431,Server_431, "Server_431");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_374(WebDriver driver,String Available_374) {
		            BrowserActions.type(driver, inpAvailable_374,Available_374, "Available_374");
			        return this;
           }
public WorkQueueInfoPage enterStarted_859(WebDriver driver,String Started_859) {
		            BrowserActions.type(driver, inpStarted_859,Started_859, "Started_859");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_121(WebDriver driver,String WorkQueue_121) {
		            BrowserActions.type(driver, inpWorkQueue_121,WorkQueue_121, "WorkQueue_121");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_361(WebDriver driver,String WorkQueue_361) {
		            BrowserActions.type(driver, inpWorkQueue_361,WorkQueue_361, "WorkQueue_361");
			        return this;
           }
public WorkQueueInfoPage enterServer_678(WebDriver driver,String Server_678) {
		            BrowserActions.type(driver, inpServer_678,Server_678, "Server_678");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_195(WebDriver driver,String CheckedOut_195) {
		            BrowserActions.type(driver, inpCheckedOut_195,CheckedOut_195, "CheckedOut_195");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_356(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_356,"RunWriter_356");
				    return this;
			}
public WorkQueueInfoPage enterWriter_933(WebDriver driver,String Writer_933) {
		            BrowserActions.type(driver, inpWriter_933,Writer_933, "Writer_933");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_468(WebDriver driver,String ItemCreationTime_468) {
		            BrowserActions.type(driver, inpItemCreationTime_468,ItemCreationTime_468, "ItemCreationTime_468");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_614(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_614,"Scheduled_614");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_643(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_643,"WorkerEndTimeDateIcon_643");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_75(WebDriver driver,String CheckedOut_75) {
		            BrowserActions.type(driver, inpCheckedOut_75,CheckedOut_75, "CheckedOut_75");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_134(WebDriver driver,String Available_134) {
		            BrowserActions.type(driver, inpAvailable_134,Available_134, "Available_134");
			        return this;
           }
public WorkQueueInfoPage enterStarted_850(WebDriver driver,String Started_850) {
		            BrowserActions.type(driver, inpStarted_850,Started_850, "Started_850");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_116(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_116,"RunWriter_116");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_362(WebDriver driver,String Available_362) {
		            BrowserActions.type(driver, inpAvailable_362,Available_362, "Available_362");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_133(WebDriver driver,String WorkQueue_133) {
		            BrowserActions.type(driver, inpWorkQueue_133,WorkQueue_133, "WorkQueue_133");
			        return this;
           }
public WorkQueueInfoPage enterServer_665(WebDriver driver,String Server_665) {
		            BrowserActions.type(driver, inpServer_665,Server_665, "Server_665");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_373(WebDriver driver,String WorkQueue_373) {
		            BrowserActions.type(driver, inpWorkQueue_373,WorkQueue_373, "WorkQueue_373");
			        return this;
           }
public WorkQueueInfoPage clickByTasks_925(WebDriver driver)  {
					BrowserActions.click(driver, btnByTasks_925,"ByTasks_925");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_481(WebDriver driver,String ItemCreationTime_481) {
		            BrowserActions.type(driver, inpItemCreationTime_481,ItemCreationTime_481, "ItemCreationTime_481");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_344(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_344,"RunWriter_344");
				    return this;
			}
public WorkQueueInfoPage enterFailed_196(WebDriver driver,String Failed_196) {
		            BrowserActions.type(driver, inpFailed_196,Failed_196, "Failed_196");
			        return this;
           }
public WorkQueueInfoPage enterWriter_948(WebDriver driver,String Writer_948) {
		            BrowserActions.type(driver, inpWriter_948,Writer_948, "Writer_948");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_122(WebDriver driver,String Available_122) {
		            BrowserActions.type(driver, inpAvailable_122,Available_122, "Available_122");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_300(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_300,"DownloadHistory_300");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_601(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_601,"Scheduled_601");
				    return this;
			}
public WorkQueueInfoPage enterStarted_841(WebDriver driver,String Started_841) {
		            BrowserActions.type(driver, inpStarted_841,Started_841, "Started_841");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_87(WebDriver driver,String CheckedOut_87) {
		            BrowserActions.type(driver, inpCheckedOut_87,CheckedOut_87, "CheckedOut_87");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_104(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_104,"RunWriter_104");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_656(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_656,"WorkerEndTimeDateIcon_656");
				    return this;
			}
public WorkQueueInfoPage enterProcessID_584(WebDriver driver,String ProcessID_584) {
		            BrowserActions.type(driver, inpProcessID_584,ProcessID_584, "ProcessID_584");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter,"RunWriter");
				    return this;
			}
public WorkQueueInfoPage verifyRunWriter(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnRunWriter,"RunWriter");
    return this;
}
public WorkQueueInfoPage enterServer_457(WebDriver driver,String Server_457) {
		            BrowserActions.type(driver, inpServer_457,Server_457, "Server_457");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_456(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_456,"ItemCreationTimeDateIcon_456");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_512(WebDriver driver,String WorkerEndTime_512) {
		            BrowserActions.type(driver, inpWorkerEndTime_512,WorkerEndTime_512, "WorkerEndTime_512");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_80(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_80,"RunWriter_80");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_341(WebDriver driver,String ExecutorsRunning_341) {
		            BrowserActions.type(driver, inpExecutorsRunning_341,ExecutorsRunning_341, "ExecutorsRunning_341");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_650(WebDriver driver,String ItemCreationTime_650) {
		            BrowserActions.type(driver, inpItemCreationTime_650,ItemCreationTime_650, "ItemCreationTime_650");
			        return this;
           }
public WorkQueueInfoPage clickNotify_333(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_333,"Notify_333");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_101(WebDriver driver,String ExecutorsRunning_101) {
		            BrowserActions.type(driver, inpExecutorsRunning_101,ExecutorsRunning_101, "ExecutorsRunning_101");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_690(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_690,"ItemCreationTimeDateIcon_690");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems_747(WebDriver driver,String Processeditems_747) {
		            BrowserActions.type(driver, inpProcesseditems_747,Processeditems_747, "Processeditems_747");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_515(WebDriver driver,String Available_515) {
		            BrowserActions.type(driver, inpAvailable_515,Available_515, "Available_515");
			        return this;
           }
public WorkQueueInfoPage enterStarted_832(WebDriver driver,String Started_832) {
		            BrowserActions.type(driver, inpStarted_832,Started_832, "Started_832");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_86(WebDriver driver,String Available_86) {
		            BrowserActions.type(driver, inpAvailable_86,Available_86, "Available_86");
			        return this;
           }
public WorkQueueInfoPage enterServer_444(WebDriver driver,String Server_444) {
		            BrowserActions.type(driver, inpServer_444,Server_444, "Server_444");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_597(WebDriver driver,String ProcessID_597) {
		            BrowserActions.type(driver, inpProcessID_597,ProcessID_597, "ProcessID_597");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_303(WebDriver driver,String CheckedOut_303) {
		            BrowserActions.type(driver, inpCheckedOut_303,CheckedOut_303, "CheckedOut_303");
			        return this;
           }
public WorkQueueInfoPage enterStarted_823(WebDriver driver,String Started_823) {
		            BrowserActions.type(driver, inpStarted_823,Started_823, "Started_823");
			        return this;
           }
public WorkQueueInfoPage clickNotify_345(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_345,"Notify_345");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_663(WebDriver driver,String ItemCreationTime_663) {
		            BrowserActions.type(driver, inpItemCreationTime_663,ItemCreationTime_663, "ItemCreationTime_663");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_542(WebDriver driver,String CheckedOut_542) {
		            BrowserActions.type(driver, inpCheckedOut_542,CheckedOut_542, "CheckedOut_542");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_443(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_443,"ItemCreationTimeDateIcon_443");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_525(WebDriver driver,String WorkerEndTime_525) {
		            BrowserActions.type(driver, inpWorkerEndTime_525,WorkerEndTime_525, "WorkerEndTime_525");
			        return this;
           }
public WorkQueueInfoPage clickNotify_105(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_105,"Notify_105");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_353(WebDriver driver,String ExecutorsRunning_353) {
		            BrowserActions.type(driver, inpExecutorsRunning_353,ExecutorsRunning_353, "ExecutorsRunning_353");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_511(WebDriver driver,String NumberofItems_511) {
		            BrowserActions.type(driver, inpNumberofItems_511,NumberofItems_511, "NumberofItems_511");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_113(WebDriver driver,String ExecutorsRunning_113) {
		            BrowserActions.type(driver, inpExecutorsRunning_113,ExecutorsRunning_113, "ExecutorsRunning_113");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_738(WebDriver driver,String Processeditems_738) {
		            BrowserActions.type(driver, inpProcesseditems_738,Processeditems_738, "Processeditems_738");
			        return this;
           }
public WorkQueueInfoPage clickError(WebDriver driver)  {
					BrowserActions.click(driver, btnError,"Error");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_416(WebDriver driver,String ItemCreationTime_416) {
		            BrowserActions.type(driver, inpItemCreationTime_416,ItemCreationTime_416, "ItemCreationTime_416");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_502(WebDriver driver,String Available_502) {
		            BrowserActions.type(driver, inpAvailable_502,Available_502, "Available_502");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_3(WebDriver driver,String CheckedOut_3) {
		            BrowserActions.type(driver, inpCheckedOut_3,CheckedOut_3, "CheckedOut_3");
			        return this;
           }
public WorkQueueInfoPage enterServer_691(WebDriver driver,String Server_691) {
		            BrowserActions.type(driver, inpServer_691,Server_691, "Server_691");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_74(WebDriver driver,String Available_74) {
		            BrowserActions.type(driver, inpAvailable_74,Available_74, "Available_74");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_98(WebDriver driver,String Available_98) {
		            BrowserActions.type(driver, inpAvailable_98,Available_98, "Available_98");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_604(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_604,"WorkerEndTimeDateIcon_604");
				    return this;
			}
public WorkQueueInfoPage enterFaileditems_902(WebDriver driver,String Faileditems_902) {
		            BrowserActions.type(driver, inpFaileditems_902,Faileditems_902, "Faileditems_902");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_677(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_677,"ItemCreationTimeDateIcon_677");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_315(WebDriver driver,String CheckedOut_315) {
		            BrowserActions.type(driver, inpCheckedOut_315,CheckedOut_315, "CheckedOut_315");
			        return this;
           }
public WorkQueueInfoPage enterStarted_814(WebDriver driver,String Started_814) {
		            BrowserActions.type(driver, inpStarted_814,Started_814, "Started_814");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_555(WebDriver driver,String CheckedOut_555) {
		            BrowserActions.type(driver, inpCheckedOut_555,CheckedOut_555, "CheckedOut_555");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_430(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_430,"ItemCreationTimeDateIcon_430");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_538(WebDriver driver,String WorkerEndTime_538) {
		            BrowserActions.type(driver, inpWorkerEndTime_538,WorkerEndTime_538, "WorkerEndTime_538");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_802(WebDriver driver,String Exceptions_802) {
		            BrowserActions.type(driver, inpExceptions_802,Exceptions_802, "Exceptions_802");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_68(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_68,"RunWriter_68");
				    return this;
			}
public WorkQueueInfoPage clickNotify_309(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_309,"Notify_309");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_429(WebDriver driver,String ItemCreationTime_429) {
		            BrowserActions.type(driver, inpItemCreationTime_429,ItemCreationTime_429, "ItemCreationTime_429");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime(WebDriver driver,String WorkerEndTime) {
		            BrowserActions.type(driver, inpWorkerEndTime,WorkerEndTime, "WorkerEndTime");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_896(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_896,"StartedDateIcon_896");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_317(WebDriver driver,String ExecutorsRunning_317) {
		            BrowserActions.type(driver, inpExecutorsRunning_317,ExecutorsRunning_317, "ExecutorsRunning_317");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_765(WebDriver driver,String Processeditems_765) {
		            BrowserActions.type(driver, inpProcesseditems_765,Processeditems_765, "Processeditems_765");
			        return this;
           }
public WorkQueueInfoPage enterServer_483(WebDriver driver,String Server_483) {
		            BrowserActions.type(driver, inpServer_483,Server_483, "Server_483");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_617(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_617,"WorkerEndTimeDateIcon_617");
				    return this;
			}
public WorkQueueInfoPage enterStarted_805(WebDriver driver,String Started_805) {
		            BrowserActions.type(driver, inpStarted_805,Started_805, "Started_805");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_327(WebDriver driver,String CheckedOut_327) {
		            BrowserActions.type(driver, inpCheckedOut_327,CheckedOut_327, "CheckedOut_327");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_568(WebDriver driver,String CheckedOut_568) {
		            BrowserActions.type(driver, inpCheckedOut_568,CheckedOut_568, "CheckedOut_568");
			        return this;
           }
public WorkQueueInfoPage clickRestart_962(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_962,"Restart_962");
				    return this;
			}
public WorkQueueInfoPage enterExceptions_811(WebDriver driver,String Exceptions_811) {
		            BrowserActions.type(driver, inpExceptions_811,Exceptions_811, "Exceptions_811");
			        return this;
           }
public WorkQueueInfoPage clickNotify_321(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_321,"Notify_321");
				    return this;
			}
public WorkQueueInfoPage clickItemCreationTimeDateIcon_664(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_664,"ItemCreationTimeDateIcon_664");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_442(WebDriver driver,String ItemCreationTime_442) {
		            BrowserActions.type(driver, inpItemCreationTime_442,ItemCreationTime_442, "ItemCreationTime_442");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_56(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_56,"RunWriter_56");
				    return this;
			}
public WorkQueueInfoPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_676(WebDriver driver,String ItemCreationTime_676) {
		            BrowserActions.type(driver, inpItemCreationTime_676,ItemCreationTime_676, "ItemCreationTime_676");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_329(WebDriver driver,String ExecutorsRunning_329) {
		            BrowserActions.type(driver, inpExecutorsRunning_329,ExecutorsRunning_329, "ExecutorsRunning_329");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon,"WorkerEndTimeDateIcon");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_723(WebDriver driver,String Available_723) {
		            BrowserActions.type(driver, inpAvailable_723,Available_723, "Available_723");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_756(WebDriver driver,String Processeditems_756) {
		            BrowserActions.type(driver, inpProcesseditems_756,Processeditems_756, "Processeditems_756");
			        return this;
           }
public WorkQueueInfoPage enterServer_470(WebDriver driver,String Server_470) {
		            BrowserActions.type(driver, inpServer_470,Server_470, "Server_470");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_571(WebDriver driver,String ProcessID_571) {
		            BrowserActions.type(driver, inpProcessID_571,ProcessID_571, "ProcessID_571");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning(WebDriver driver,String ExecutorsRunning) {
		            BrowserActions.type(driver, inpExecutorsRunning,ExecutorsRunning, "ExecutorsRunning");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_417(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_417,"ItemCreationTimeDateIcon_417");
				    return this;
			}
public WorkQueueInfoPage enterServer_496(WebDriver driver,String Server_496) {
		            BrowserActions.type(driver, inpServer_496,Server_496, "Server_496");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_339(WebDriver driver,String CheckedOut_339) {
		            BrowserActions.type(driver, inpCheckedOut_339,CheckedOut_339, "CheckedOut_339");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_38(WebDriver driver,String Available_38) {
		            BrowserActions.type(driver, inpAvailable_38,Available_38, "Available_38");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_820(WebDriver driver,String Exceptions_820) {
		            BrowserActions.type(driver, inpExceptions_820,Exceptions_820, "Exceptions_820");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_545(WebDriver driver,String ProcessID_545) {
		            BrowserActions.type(driver, inpProcessID_545,ProcessID_545, "ProcessID_545");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_651(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_651,"ItemCreationTimeDateIcon_651");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_18(WebDriver driver,String ClusterWideState_18) {
		            BrowserActions.type(driver, inpClusterWideState_18,ClusterWideState_18, "ClusterWideState_18");
			        return this;
           }
public WorkQueueInfoPage enterHostname_826(WebDriver driver,String Hostname_826) {
		            BrowserActions.type(driver, inpHostname_826,Hostname_826, "Hostname_826");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_829(WebDriver driver,String Exceptions_829) {
		            BrowserActions.type(driver, inpExceptions_829,Exceptions_829, "Exceptions_829");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_878(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_878,"StartedDateIcon_878");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_314(WebDriver driver,String Available_314) {
		            BrowserActions.type(driver, inpAvailable_314,Available_314, "Available_314");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_554(WebDriver driver,String Available_554) {
		            BrowserActions.type(driver, inpAvailable_554,Available_554, "Available_554");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_621(WebDriver driver,String Succeeded_621) {
		            BrowserActions.type(driver, inpSucceeded_621,Succeeded_621, "Succeeded_621");
			        return this;
           }
public WorkQueueInfoPage clickNotify_381(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_381,"Notify_381");
				    return this;
			}
public WorkQueueInfoPage enterNumberofItems_550(WebDriver driver,String NumberofItems_550) {
		            BrowserActions.type(driver, inpNumberofItems_550,NumberofItems_550, "NumberofItems_550");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_26(WebDriver driver,String Available_26) {
		            BrowserActions.type(driver, inpAvailable_26,Available_26, "Available_26");
			        return this;
           }
public WorkQueueInfoPage clickNotify_141(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_141,"Notify_141");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_720(WebDriver driver,String WorkerEndTime_720) {
		            BrowserActions.type(driver, inpWorkerEndTime_720,WorkerEndTime_720, "WorkerEndTime_720");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_558(WebDriver driver,String ProcessID_558) {
		            BrowserActions.type(driver, inpProcessID_558,ProcessID_558, "ProcessID_558");
			        return this;
           }
public WorkQueueInfoPage enterHostname_817(WebDriver driver,String Hostname_817) {
		            BrowserActions.type(driver, inpHostname_817,Hostname_817, "Hostname_817");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_838(WebDriver driver,String Exceptions_838) {
		            BrowserActions.type(driver, inpExceptions_838,Exceptions_838, "Exceptions_838");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_581(WebDriver driver,String CheckedOut_581) {
		            BrowserActions.type(driver, inpCheckedOut_581,CheckedOut_581, "CheckedOut_581");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_936(WebDriver driver,String Processeditems_936) {
		            BrowserActions.type(driver, inpProcesseditems_936,Processeditems_936, "Processeditems_936");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_305(WebDriver driver,String ExecutorsRunning_305) {
		            BrowserActions.type(driver, inpExecutorsRunning_305,ExecutorsRunning_305, "ExecutorsRunning_305");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems(WebDriver driver,String NumberofItems) {
		            BrowserActions.type(driver, inpNumberofItems,NumberofItems, "NumberofItems");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_887(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_887,"StartedDateIcon_887");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_611(WebDriver driver,String ItemCreationTime_611) {
		            BrowserActions.type(driver, inpItemCreationTime_611,ItemCreationTime_611, "ItemCreationTime_611");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_302(WebDriver driver,String Available_302) {
		            BrowserActions.type(driver, inpAvailable_302,Available_302, "Available_302");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_8(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_8,"RunWriter_8");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_541(WebDriver driver,String Available_541) {
		            BrowserActions.type(driver, inpAvailable_541,Available_541, "Available_541");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_638(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_638,"ItemCreationTimeDateIcon_638");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_608(WebDriver driver,String Succeeded_608) {
		            BrowserActions.type(driver, inpSucceeded_608,Succeeded_608, "Succeeded_608");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_524(WebDriver driver,String NumberofItems_524) {
		            BrowserActions.type(driver, inpNumberofItems_524,NumberofItems_524, "NumberofItems_524");
			        return this;
           }
public WorkQueueInfoPage enterHostname_808(WebDriver driver,String Hostname_808) {
		            BrowserActions.type(driver, inpHostname_808,Hostname_808, "Hostname_808");
			        return this;
           }
public WorkQueueInfoPage clickNotify_357(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_357,"Notify_357");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_111(WebDriver driver,String CheckedOut_111) {
		            BrowserActions.type(driver, inpCheckedOut_111,CheckedOut_111, "CheckedOut_111");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_847(WebDriver driver,String Exceptions_847) {
		            BrowserActions.type(driver, inpExceptions_847,Exceptions_847, "Exceptions_847");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_594(WebDriver driver,String CheckedOut_594) {
		            BrowserActions.type(driver, inpCheckedOut_594,CheckedOut_594, "CheckedOut_594");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_351(WebDriver driver,String CheckedOut_351) {
		            BrowserActions.type(driver, inpCheckedOut_351,CheckedOut_351, "CheckedOut_351");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_860(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_860,"StartedDateIcon_860");
				    return this;
			}
public WorkQueueInfoPage clickNotify_117(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_117,"Notify_117");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon_851(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_851,"StartedDateIcon_851");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_624(WebDriver driver,String ItemCreationTime_624) {
		            BrowserActions.type(driver, inpItemCreationTime_624,ItemCreationTime_624, "ItemCreationTime_624");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_30(WebDriver driver,String ClusterWideState_30) {
		            BrowserActions.type(driver, inpClusterWideState_30,ClusterWideState_30, "ClusterWideState_30");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_729(WebDriver driver,String Processeditems_729) {
		            BrowserActions.type(driver, inpProcesseditems_729,Processeditems_729, "Processeditems_729");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_62(WebDriver driver,String Available_62) {
		            BrowserActions.type(driver, inpAvailable_62,Available_62, "Available_62");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_625(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_625,"ItemCreationTimeDateIcon_625");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_92(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_92,"RunWriter_92");
				    return this;
			}
public WorkQueueInfoPage enterProcessID_532(WebDriver driver,String ProcessID_532) {
		            BrowserActions.type(driver, inpProcessID_532,ProcessID_532, "ProcessID_532");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_856(WebDriver driver,String Exceptions_856) {
		            BrowserActions.type(driver, inpExceptions_856,Exceptions_856, "Exceptions_856");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_123(WebDriver driver,String CheckedOut_123) {
		            BrowserActions.type(driver, inpCheckedOut_123,CheckedOut_123, "CheckedOut_123");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_537(WebDriver driver,String NumberofItems_537) {
		            BrowserActions.type(driver, inpNumberofItems_537,NumberofItems_537, "NumberofItems_537");
			        return this;
           }
public WorkQueueInfoPage clickNotify_129(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_129,"Notify_129");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_363(WebDriver driver,String CheckedOut_363) {
		            BrowserActions.type(driver, inpCheckedOut_363,CheckedOut_363, "CheckedOut_363");
			        return this;
           }
public WorkQueueInfoPage clickNotify_369(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_369,"Notify_369");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_188(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_188,"RunWriter_188");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_637(WebDriver driver,String ItemCreationTime_637) {
		            BrowserActions.type(driver, inpItemCreationTime_637,ItemCreationTime_637, "ItemCreationTime_637");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_528(WebDriver driver,String Available_528) {
		            BrowserActions.type(driver, inpAvailable_528,Available_528, "Available_528");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_869(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_869,"StartedDateIcon_869");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems_951(WebDriver driver,String Processeditems_951) {
		            BrowserActions.type(driver, inpProcesseditems_951,Processeditems_951, "Processeditems_951");
			        return this;
           }
public WorkQueueInfoPage clickNotify_21(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_21,"Notify_21");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_50(WebDriver driver,String Available_50) {
		            BrowserActions.type(driver, inpAvailable_50,Available_50, "Available_50");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_473(WebDriver driver,String WorkerEndTime_473) {
		            BrowserActions.type(driver, inpWorkerEndTime_473,WorkerEndTime_473, "WorkerEndTime_473");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_848(WebDriver driver,String Faileditems_848) {
		            BrowserActions.type(driver, inpFaileditems_848,Faileditems_848, "Faileditems_848");
			        return this;
           }
public WorkQueueInfoPage clickNotify_297(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_297,"Notify_297");
				    return this;
			}
public WorkQueueInfoPage enterHostname_862(WebDriver driver,String Hostname_862) {
		            BrowserActions.type(driver, inpHostname_862,Hostname_862, "Hostname_862");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_185(WebDriver driver,String ExecutorsRunning_185) {
		            BrowserActions.type(driver, inpExecutorsRunning_185,ExecutorsRunning_185, "ExecutorsRunning_185");
			        return this;
           }
public WorkQueueInfoPage enterStatus_885(WebDriver driver,String Status_885) {
		            BrowserActions.type(driver, inpStatus_885,Status_885, "Status_885");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_174(WebDriver driver,String ClusterWideState_174) {
		            BrowserActions.type(driver, inpClusterWideState_174,ClusterWideState_174, "ClusterWideState_174");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_54(WebDriver driver,String ClusterWideState_54) {
		            BrowserActions.type(driver, inpClusterWideState_54,ClusterWideState_54, "ClusterWideState_54");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_543(WebDriver driver,String Succeeded_543) {
		            BrowserActions.type(driver, inpSucceeded_543,Succeeded_543, "Succeeded_543");
			        return this;
           }
public WorkQueueInfoPage enterFailed_544(WebDriver driver,String Failed_544) {
		            BrowserActions.type(driver, inpFailed_544,Failed_544, "Failed_544");
			        return this;
           }
public WorkQueueInfoPage enterConsecutiveErrors_946(WebDriver driver,String ConsecutiveErrors_946) {
		            BrowserActions.type(driver, inpConsecutiveErrors_946,ConsecutiveErrors_946, "ConsecutiveErrors_946");
			        return this;
           }
public WorkQueueInfoPage clickStop_310(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_310,"Stop_310");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_791(WebDriver driver,String MaxNumberofWorkers_791) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_791,MaxNumberofWorkers_791, "MaxNumberofWorkers_791");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_486(WebDriver driver,String WorkerEndTime_486) {
		            BrowserActions.type(driver, inpWorkerEndTime_486,WorkerEndTime_486, "WorkerEndTime_486");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_839(WebDriver driver,String Faileditems_839) {
		            BrowserActions.type(driver, inpFaileditems_839,Faileditems_839, "Faileditems_839");
			        return this;
           }
public WorkQueueInfoPage enterConsecutiveErrors_961(WebDriver driver,String ConsecutiveErrors_961) {
		            BrowserActions.type(driver, inpConsecutiveErrors_961,ConsecutiveErrors_961, "ConsecutiveErrors_961");
			        return this;
           }
public WorkQueueInfoPage enterHostname_853(WebDriver driver,String Hostname_853) {
		            BrowserActions.type(driver, inpHostname_853,Hostname_853, "Hostname_853");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut(WebDriver driver,String CheckedOut) {
		            BrowserActions.type(driver, inpCheckedOut,CheckedOut, "CheckedOut");
			        return this;
           }
public WorkQueueInfoPage enterStatus_876(WebDriver driver,String Status_876) {
		            BrowserActions.type(driver, inpStatus_876,Status_876, "Status_876");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_197(WebDriver driver,String ExecutorsRunning_197) {
		            BrowserActions.type(driver, inpExecutorsRunning_197,ExecutorsRunning_197, "ExecutorsRunning_197");
			        return this;
           }
public WorkQueueInfoPage selectTasks_926(WebDriver driver,String Tasks_926)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTasks_926,Tasks_926,"Tasks_926");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_162(WebDriver driver,String ClusterWideState_162) {
		            BrowserActions.type(driver, inpClusterWideState_162,ClusterWideState_162, "ClusterWideState_162");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon,"ItemCreationTimeDateIcon");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_42(WebDriver driver,String ClusterWideState_42) {
		            BrowserActions.type(driver, inpClusterWideState_42,ClusterWideState_42, "ClusterWideState_42");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_830(WebDriver driver,String Faileditems_830) {
		            BrowserActions.type(driver, inpFaileditems_830,Faileditems_830, "Faileditems_830");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_530(WebDriver driver,String Succeeded_530) {
		            BrowserActions.type(driver, inpSucceeded_530,Succeeded_530, "Succeeded_530");
			        return this;
           }
public WorkQueueInfoPage enterFailed_531(WebDriver driver,String Failed_531) {
		            BrowserActions.type(driver, inpFailed_531,Failed_531, "Failed_531");
			        return this;
           }
public WorkQueueInfoPage clickStop_322(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_322,"Stop_322");
				    return this;
			}
public WorkQueueInfoPage enterHostname_844(WebDriver driver,String Hostname_844) {
		            BrowserActions.type(driver, inpHostname_844,Hostname_844, "Hostname_844");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_782(WebDriver driver,String MaxNumberofWorkers_782) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_782,MaxNumberofWorkers_782, "MaxNumberofWorkers_782");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_180(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_180,"DownloadHistory_180");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_161(WebDriver driver,String ExecutorsRunning_161) {
		            BrowserActions.type(driver, inpExecutorsRunning_161,ExecutorsRunning_161, "ExecutorsRunning_161");
			        return this;
           }
public WorkQueueInfoPage clickNotify_273(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_273,"Notify_273");
				    return this;
			}
public WorkQueueInfoPage enterFailed_557(WebDriver driver,String Failed_557) {
		            BrowserActions.type(driver, inpFailed_557,Failed_557, "Failed_557");
			        return this;
           }
public WorkQueueInfoPage clickSuccess_934(WebDriver driver)  {
					BrowserActions.click(driver, rdbSuccess_934,"Success_934");
				    return this;
			}
public WorkQueueInfoPage enterFailed_316(WebDriver driver,String Failed_316) {
		            BrowserActions.type(driver, inpFailed_316,Failed_316, "Failed_316");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_499(WebDriver driver,String WorkerEndTime_499) {
		            BrowserActions.type(driver, inpWorkerEndTime_499,WorkerEndTime_499, "WorkerEndTime_499");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_866(WebDriver driver,String Faileditems_866) {
		            BrowserActions.type(driver, inpFaileditems_866,Faileditems_866, "Faileditems_866");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_24(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_24,"DownloadHistory_24");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_78(WebDriver driver,String ClusterWideState_78) {
		            BrowserActions.type(driver, inpClusterWideState_78,ClusterWideState_78, "ClusterWideState_78");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_517(WebDriver driver,String Succeeded_517) {
		            BrowserActions.type(driver, inpSucceeded_517,Succeeded_517, "Succeeded_517");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_192(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_192,"DownloadHistory_192");
				    return this;
			}
public WorkQueueInfoPage enterFaileditems_857(WebDriver driver,String Faileditems_857) {
		            BrowserActions.type(driver, inpFaileditems_857,Faileditems_857, "Faileditems_857");
			        return this;
           }
public WorkQueueInfoPage enterFailed_304(WebDriver driver,String Failed_304) {
		            BrowserActions.type(driver, inpFailed_304,Failed_304, "Failed_304");
			        return this;
           }
public WorkQueueInfoPage clickNotify_285(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_285,"Notify_285");
				    return this;
			}
public WorkQueueInfoPage clickDownloadHistory_12(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_12,"DownloadHistory_12");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_173(WebDriver driver,String ExecutorsRunning_173) {
		            BrowserActions.type(driver, inpExecutorsRunning_173,ExecutorsRunning_173, "ExecutorsRunning_173");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_66(WebDriver driver,String ClusterWideState_66) {
		            BrowserActions.type(driver, inpClusterWideState_66,ClusterWideState_66, "ClusterWideState_66");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_186(WebDriver driver,String ClusterWideState_186) {
		            BrowserActions.type(driver, inpClusterWideState_186,ClusterWideState_186, "ClusterWideState_186");
			        return this;
           }
public WorkQueueInfoPage enterHostname_835(WebDriver driver,String Hostname_835) {
		            BrowserActions.type(driver, inpHostname_835,Hostname_835, "Hostname_835");
			        return this;
           }
public WorkQueueInfoPage enterStatus_894(WebDriver driver,String Status_894) {
		            BrowserActions.type(driver, inpStatus_894,Status_894, "Status_894");
			        return this;
           }
public WorkQueueInfoPage clickSuccess_949(WebDriver driver)  {
					BrowserActions.click(driver, rdbSuccess_949,"Success_949");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_773(WebDriver driver,String MaxNumberofWorkers_773) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_773,MaxNumberofWorkers_773, "MaxNumberofWorkers_773");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_607(WebDriver driver,String CheckedOut_607) {
		            BrowserActions.type(driver, inpCheckedOut_607,CheckedOut_607, "CheckedOut_607");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_803(WebDriver driver,String Faileditems_803) {
		            BrowserActions.type(driver, inpFaileditems_803,Faileditems_803, "Faileditems_803");
			        return this;
           }
public WorkQueueInfoPage enterStatus_849(WebDriver driver,String Status_849) {
		            BrowserActions.type(driver, inpStatus_849,Status_849, "Status_849");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_434(WebDriver driver,String WorkerEndTime_434) {
		            BrowserActions.type(driver, inpWorkerEndTime_434,WorkerEndTime_434, "WorkerEndTime_434");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_307(WebDriver driver,String WriterStatus_307) {
		            BrowserActions.type(driver, inpWriterStatus_307,WriterStatus_307, "WriterStatus_307");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_389(WebDriver driver,String ExecutorsRunning_389) {
		            BrowserActions.type(driver, inpExecutorsRunning_389,ExecutorsRunning_389, "ExecutorsRunning_389");
			        return this;
           }
public WorkQueueInfoPage enterStatus_840(WebDriver driver,String Status_840) {
		            BrowserActions.type(driver, inpStatus_840,Status_840, "Status_840");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_495(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_495,"ItemCreationTimeDateIcon_495");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_137(WebDriver driver,String ExecutorsRunning_137) {
		            BrowserActions.type(driver, inpExecutorsRunning_137,ExecutorsRunning_137, "ExecutorsRunning_137");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_906(WebDriver driver,String UpFor_906) {
		            BrowserActions.type(driver, inpUpFor_906,UpFor_906, "UpFor_906");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_582(WebDriver driver,String Succeeded_582) {
		            BrowserActions.type(driver, inpSucceeded_582,Succeeded_582, "Succeeded_582");
			        return this;
           }
public WorkQueueInfoPage clickRestart(WebDriver driver,String batchProcess)  {
	By btnRunWriterBy = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'NotifyCell')]//div[contains(@id,'RestartWorkers')]");
	BrowserActions.waitForElementToDisplay(driver, btnRunWriterBy, "name check box");
	WebElement btnRunWriter = btnRunWriterBy.findElement(driver);
	BrowserActions.click(driver, btnRunWriter,1, " Restart");
    return this;
				}
public WorkQueueInfoPage verifyRestart(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnRestart,"Restart");
    return this;
}
public WorkQueueInfoPage clickStop_118(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_118,"Stop_118");
				    return this;
			}
public WorkQueueInfoPage clickStop_358(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_358,"Stop_358");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_90(WebDriver driver,String ClusterWideState_90) {
		            BrowserActions.type(driver, inpClusterWideState_90,ClusterWideState_90, "ClusterWideState_90");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_764(WebDriver driver,String MaxNumberofWorkers_764) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_764,MaxNumberofWorkers_764, "MaxNumberofWorkers_764");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_319(WebDriver driver,String WriterStatus_319) {
		            BrowserActions.type(driver, inpWriterStatus_319,WriterStatus_319, "WriterStatus_319");
			        return this;
           }
public WorkQueueInfoPage enterHostname_898(WebDriver driver,String Hostname_898) {
		            BrowserActions.type(driver, inpHostname_898,Hostname_898, "Hostname_898");
			        return this;
           }
public WorkQueueInfoPage enterException(WebDriver driver,String Exception) {
		            BrowserActions.type(driver, inpException,Exception, "Exception");
			        return this;
           }
public WorkQueueInfoPage enterFailed_726(WebDriver driver,String Failed_726) {
		            BrowserActions.type(driver, inpFailed_726,Failed_726, "Failed_726");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_447(WebDriver driver,String WorkerEndTime_447) {
		            BrowserActions.type(driver, inpWorkerEndTime_447,WorkerEndTime_447, "WorkerEndTime_447");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_891(WebDriver driver,String Processeditems_891) {
		            BrowserActions.type(driver, inpProcesseditems_891,Processeditems_891, "Processeditems_891");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_620(WebDriver driver,String CheckedOut_620) {
		            BrowserActions.type(driver, inpCheckedOut_620,CheckedOut_620, "CheckedOut_620");
			        return this;
           }
public WorkQueueInfoPage enterStatus_831(WebDriver driver,String Status_831) {
		            BrowserActions.type(driver, inpStatus_831,Status_831, "Status_831");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_482(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_482,"ItemCreationTimeDateIcon_482");
				    return this;
			}
public WorkQueueInfoPage verifyMaximumPoolSize(WebDriver driver) {
		            BrowserActions.verifyElementDisplayed(driver, txtMaximumPoolSize, "Maximum Pool Size");
			        return this;
           }
public WorkQueueInfoPage verifyPoolSize(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver,txtPoolSize, " Pool Size");
    return this;
}
public WorkQueueInfoPage enterUpFor_924(WebDriver driver,String UpFor_924) {
		            BrowserActions.type(driver, inpUpFor_924,UpFor_924, "UpFor_924");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_149(WebDriver driver,String ExecutorsRunning_149) {
		            BrowserActions.type(driver, inpExecutorsRunning_149,ExecutorsRunning_149, "ExecutorsRunning_149");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_722(WebDriver driver,String ExecutionTime_722) {
		            BrowserActions.type(driver, inpExecutionTime_722,ExecutionTime_722, "ExecutionTime_722");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_915(WebDriver driver,String UpFor_915) {
		            BrowserActions.type(driver, inpUpFor_915,UpFor_915, "UpFor_915");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_198(WebDriver driver,String ClusterWideState_198) {
		            BrowserActions.type(driver, inpClusterWideState_198,ClusterWideState_198, "ClusterWideState_198");
			        return this;
           }
public WorkQueueInfoPage clickByWriters_409(WebDriver driver)  {
					BrowserActions.click(driver, btnByWriters_409,"ByWriters_409");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_755(WebDriver driver,String MaxNumberofWorkers_755) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_755,MaxNumberofWorkers_755, "MaxNumberofWorkers_755");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_681(WebDriver driver,String WorkerEndTime_681) {
		            BrowserActions.type(driver, inpWorkerEndTime_681,WorkerEndTime_681, "WorkerEndTime_681");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_694(WebDriver driver,String WorkerEndTime_694) {
		            BrowserActions.type(driver, inpWorkerEndTime_694,WorkerEndTime_694, "WorkerEndTime_694");
			        return this;
           }
public WorkQueueInfoPage enterFailed_518(WebDriver driver,String Failed_518) {
		            BrowserActions.type(driver, inpFailed_518,Failed_518, "Failed_518");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_633(WebDriver driver,String CheckedOut_633) {
		            BrowserActions.type(driver, inpCheckedOut_633,CheckedOut_633, "CheckedOut_633");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_821(WebDriver driver,String Faileditems_821) {
		            BrowserActions.type(driver, inpFaileditems_821,Faileditems_821, "Faileditems_821");
			        return this;
           }
public WorkQueueInfoPage enterStatus_867(WebDriver driver,String Status_867) {
		            BrowserActions.type(driver, inpStatus_867,Status_867, "Status_867");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_125(WebDriver driver,String ExecutorsRunning_125) {
		            BrowserActions.type(driver, inpExecutorsRunning_125,ExecutorsRunning_125, "ExecutorsRunning_125");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_365(WebDriver driver,String ExecutorsRunning_365) {
		            BrowserActions.type(driver, inpExecutorsRunning_365,ExecutorsRunning_365, "ExecutorsRunning_365");
			        return this;
           }
public WorkQueueInfoPage enterHostname_889(WebDriver driver,String Hostname_889) {
		            BrowserActions.type(driver, inpHostname_889,Hostname_889, "Hostname_889");
			        return this;
           }
public WorkQueueInfoPage enterExceptions(WebDriver driver,String Exceptions) {
		            BrowserActions.type(driver, inpExceptions,Exceptions, "Exceptions");
			        return this;
           }
public WorkQueueInfoPage enterID_932(WebDriver driver,String ID_932) {
		            BrowserActions.type(driver, inpID_932,ID_932, "ID_932");
			        return this;
           }
public WorkQueueInfoPage enterHostname_880(WebDriver driver,String Hostname_880) {
		            BrowserActions.type(driver, inpHostname_880,Hostname_880, "Hostname_880");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_746(WebDriver driver,String MaxNumberofWorkers_746) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_746,MaxNumberofWorkers_746, "MaxNumberofWorkers_746");
			        return this;
           }
public WorkQueueInfoPage clickStop_334(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_334,"Stop_334");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_569(WebDriver driver,String Succeeded_569) {
		            BrowserActions.type(driver, inpSucceeded_569,Succeeded_569, "Succeeded_569");
			        return this;
           }
public WorkQueueInfoPage clickSuccess(WebDriver driver)  {
					BrowserActions.click(driver, rdbSuccess,"Success");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_646(WebDriver driver,String CheckedOut_646) {
		            BrowserActions.type(driver, inpCheckedOut_646,CheckedOut_646, "CheckedOut_646");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_812(WebDriver driver,String Faileditems_812) {
		            BrowserActions.type(driver, inpFaileditems_812,Faileditems_812, "Faileditems_812");
			        return this;
           }
public WorkQueueInfoPage enterFailed_505(WebDriver driver,String Failed_505) {
		            BrowserActions.type(driver, inpFailed_505,Failed_505, "Failed_505");
			        return this;
           }
public WorkQueueInfoPage enterStatus_858(WebDriver driver,String Status_858) {
		            BrowserActions.type(driver, inpStatus_858,Status_858, "Status_858");
			        return this;
           }
public WorkQueueInfoPage enterHostname_871(WebDriver driver,String Hostname_871) {
		            BrowserActions.type(driver, inpHostname_871,Hostname_871, "Hostname_871");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_469(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_469,"ItemCreationTimeDateIcon_469");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_377(WebDriver driver,String ExecutorsRunning_377) {
		            BrowserActions.type(driver, inpExecutorsRunning_377,ExecutorsRunning_377, "ExecutorsRunning_377");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_331(WebDriver driver,String WriterStatus_331) {
		            BrowserActions.type(driver, inpWriterStatus_331,WriterStatus_331, "WriterStatus_331");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_737(WebDriver driver,String MaxNumberofWorkers_737) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_737,MaxNumberofWorkers_737, "MaxNumberofWorkers_737");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_709(WebDriver driver,String ExecutionTime_709) {
		            BrowserActions.type(driver, inpExecutionTime_709,ExecutionTime_709, "ExecutionTime_709");
			        return this;
           }
public WorkQueueInfoPage clickStop_106(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_106,"Stop_106");
				    return this;
			}
public WorkQueueInfoPage clickStop_346(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_346,"Stop_346");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_460(WebDriver driver,String WorkerEndTime_460) {
		            BrowserActions.type(driver, inpWorkerEndTime_460,WorkerEndTime_460, "WorkerEndTime_460");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_556(WebDriver driver,String Succeeded_556) {
		            BrowserActions.type(driver, inpSucceeded_556,Succeeded_556, "Succeeded_556");
			        return this;
           }
public WorkQueueInfoPage clickStop_154(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_154,"Stop_154");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_194(WebDriver driver,String Available_194) {
		            BrowserActions.type(driver, inpAvailable_194,Available_194, "Available_194");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_360(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_360,"DownloadHistory_360");
				    return this;
			}
public WorkQueueInfoPage clickStop_394(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_394,"Stop_394");
				    return this;
			}
public WorkQueueInfoPage enterWorkQueue_265(WebDriver driver,String WorkQueue_265) {
		            BrowserActions.type(driver, inpWorkQueue_265,WorkQueue_265, "WorkQueue_265");
			        return this;
           }
public WorkQueueInfoPage enterStatus_804(WebDriver driver,String Status_804) {
		            BrowserActions.type(driver, inpStatus_804,Status_804, "Status_804");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_103(WebDriver driver,String WriterStatus_103) {
		            BrowserActions.type(driver, inpWriterStatus_103,WriterStatus_103, "WriterStatus_103");
			        return this;
           }
public WorkQueueInfoPage enterID_947(WebDriver driver,String ID_947) {
		            BrowserActions.type(driver, inpID_947,ID_947, "ID_947");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_343(WebDriver driver,String WriterStatus_343) {
		            BrowserActions.type(driver, inpWriterStatus_343,WriterStatus_343, "WriterStatus_343");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_212(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_212,"RunWriter_212");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_728(WebDriver driver,String MaxNumberofWorkers_728) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_728,MaxNumberofWorkers_728, "MaxNumberofWorkers_728");
			        return this;
           }
public WorkQueueInfoPage enterFailed_148(WebDriver driver,String Failed_148) {
		            BrowserActions.type(driver, inpFailed_148,Failed_148, "Failed_148");
			        return this;
           }
public WorkQueueInfoPage enterFailed_388(WebDriver driver,String Failed_388) {
		            BrowserActions.type(driver, inpFailed_388,Failed_388, "Failed_388");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_99(WebDriver driver,String CheckedOut_99) {
		            BrowserActions.type(driver, inpCheckedOut_99,CheckedOut_99, "CheckedOut_99");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_372(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_372,"DownloadHistory_372");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_182(WebDriver driver,String Available_182) {
		            BrowserActions.type(driver, inpAvailable_182,Available_182, "Available_182");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_355(WebDriver driver,String WriterStatus_355) {
		            BrowserActions.type(driver, inpWriterStatus_355,WriterStatus_355, "WriterStatus_355");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_115(WebDriver driver,String WriterStatus_115) {
		            BrowserActions.type(driver, inpWriterStatus_115,WriterStatus_115, "WriterStatus_115");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_277(WebDriver driver,String WorkQueue_277) {
		            BrowserActions.type(driver, inpWorkQueue_277,WorkQueue_277, "WorkQueue_277");
			        return this;
           }
public WorkQueueInfoPage enterConsecutiveErrors(WebDriver driver,String ConsecutiveErrors) {
		            BrowserActions.type(driver, inpConsecutiveErrors,ConsecutiveErrors, "ConsecutiveErrors");
			        return this;
           }
public WorkQueueInfoPage clickEndedDateIcon_959(WebDriver driver)  {
					BrowserActions.click(driver, btnEndedDateIcon_959,"EndedDateIcon_959");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_200(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_200,"RunWriter_200");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_527(WebDriver driver,String ExecutionTime_527) {
		            BrowserActions.type(driver, inpExecutionTime_527,ExecutionTime_527, "ExecutionTime_527");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_549(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_549,"Scheduled_549");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_318(WebDriver driver,String ClusterWideState_318) {
		            BrowserActions.type(driver, inpClusterWideState_318,ClusterWideState_318, "ClusterWideState_318");
			        return this;
           }
public WorkQueueInfoPage enterFailed_136(WebDriver driver,String Failed_136) {
		            BrowserActions.type(driver, inpFailed_136,Failed_136, "Failed_136");
			        return this;
           }
public WorkQueueInfoPage enterFailed_376(WebDriver driver,String Failed_376) {
		            BrowserActions.type(driver, inpFailed_376,Failed_376, "Failed_376");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_120(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_120,"DownloadHistory_120");
				    return this;
			}
public WorkQueueInfoPage clickStop_166(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_166,"Stop_166");
				    return this;
			}
public WorkQueueInfoPage clickStop_130(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_130,"Stop_130");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_170(WebDriver driver,String Available_170) {
		            BrowserActions.type(driver, inpAvailable_170,Available_170, "Available_170");
			        return this;
           }
public WorkQueueInfoPage clickStop_370(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_370,"Stop_370");
				    return this;
			}
public WorkQueueInfoPage clickRestart_299(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_299,"Restart_299");
				    return this;
			}
public WorkQueueInfoPage enterWriterStatus_367(WebDriver driver,String WriterStatus_367) {
		            BrowserActions.type(driver, inpWriterStatus_367,WriterStatus_367, "WriterStatus_367");
			        return this;
           }
public WorkQueueInfoPage enterStatus_822(WebDriver driver,String Status_822) {
		            BrowserActions.type(driver, inpStatus_822,Status_822, "Status_822");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_289(WebDriver driver,String WorkQueue_289) {
		            BrowserActions.type(driver, inpWorkQueue_289,WorkQueue_289, "WorkQueue_289");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_127(WebDriver driver,String WriterStatus_127) {
		            BrowserActions.type(driver, inpWriterStatus_127,WriterStatus_127, "WriterStatus_127");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_102(WebDriver driver,String ClusterWideState_102) {
		            BrowserActions.type(driver, inpClusterWideState_102,ClusterWideState_102, "ClusterWideState_102");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_514(WebDriver driver,String ExecutionTime_514) {
		            BrowserActions.type(driver, inpExecutionTime_514,ExecutionTime_514, "ExecutionTime_514");
			        return this;
           }
public WorkQueueInfoPage enterFailed_160(WebDriver driver,String Failed_160) {
		            BrowserActions.type(driver, inpFailed_160,Failed_160, "Failed_160");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_342(WebDriver driver,String ClusterWideState_342) {
		            BrowserActions.type(driver, inpClusterWideState_342,ClusterWideState_342, "ClusterWideState_342");
			        return this;
           }
public WorkQueueInfoPage enterFailed_88(WebDriver driver,String Failed_88) {
		            BrowserActions.type(driver, inpFailed_88,Failed_88, "Failed_88");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_336(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_336,"DownloadHistory_336");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_536(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_536,"Scheduled_536");
				    return this;
			}
public WorkQueueInfoPage clickStop_142(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_142,"Stop_142");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime(WebDriver driver,String ExecutionTime) {
		            BrowserActions.type(driver, inpExecutionTime,ExecutionTime, "ExecutionTime");
			        return this;
           }
public WorkQueueInfoPage clickStop_382(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_382,"Stop_382");
				    return this;
			}
public WorkQueueInfoPage enterWriterStatus_139(WebDriver driver,String WriterStatus_139) {
		            BrowserActions.type(driver, inpWriterStatus_139,WriterStatus_139, "WriterStatus_139");
			        return this;
           }
public WorkQueueInfoPage enterStatus_813(WebDriver driver,String Status_813) {
		            BrowserActions.type(driver, inpStatus_813,Status_813, "Status_813");
			        return this;
           }
public WorkQueueInfoPage clickRestart_287(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_287,"Restart_287");
				    return this;
			}
public WorkQueueInfoPage enterWriterStatus_379(WebDriver driver,String WriterStatus_379) {
		            BrowserActions.type(driver, inpWriterStatus_379,WriterStatus_379, "WriterStatus_379");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_501(WebDriver driver,String ExecutionTime_501) {
		            BrowserActions.type(driver, inpExecutionTime_501,ExecutionTime_501, "ExecutionTime_501");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_330(WebDriver driver,String ClusterWideState_330) {
		            BrowserActions.type(driver, inpClusterWideState_330,ClusterWideState_330, "ClusterWideState_330");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_108(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_108,"DownloadHistory_108");
				    return this;
			}
public WorkQueueInfoPage clickDownloadHistory_348(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_348,"DownloadHistory_348");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_523(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_523,"Scheduled_523");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_595(WebDriver driver,String Succeeded_595) {
		            BrowserActions.type(driver, inpSucceeded_595,Succeeded_595, "Succeeded_595");
			        return this;
           }
public WorkQueueInfoPage clickStop_190(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_190,"Stop_190");
				    return this;
			}
public WorkQueueInfoPage enterUpFor_753(WebDriver driver,String UpFor_753) {
		            BrowserActions.type(driver, inpUpFor_753,UpFor_753, "UpFor_753");
			        return this;
           }
public WorkQueueInfoPage clickRestart_275(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_275,"Restart_275");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_366(WebDriver driver,String ClusterWideState_366) {
		            BrowserActions.type(driver, inpClusterWideState_366,ClusterWideState_366, "ClusterWideState_366");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_391(WebDriver driver,String WriterStatus_391) {
		            BrowserActions.type(driver, inpWriterStatus_391,WriterStatus_391, "WriterStatus_391");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_579(WebDriver driver,String ExecutionTime_579) {
		            BrowserActions.type(driver, inpExecutionTime_579,ExecutionTime_579, "ExecutionTime_579");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_151(WebDriver driver,String WriterStatus_151) {
		            BrowserActions.type(driver, inpWriterStatus_151,WriterStatus_151, "WriterStatus_151");
			        return this;
           }
public WorkQueueInfoPage enterFailed_64(WebDriver driver,String Failed_64) {
		            BrowserActions.type(driver, inpFailed_64,Failed_64, "Failed_64");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_126(WebDriver driver,String ClusterWideState_126) {
		            BrowserActions.type(driver, inpClusterWideState_126,ClusterWideState_126, "ClusterWideState_126");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_461(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_461,"WorkerEndTimeDateIcon_461");
				    return this;
			}
public WorkQueueInfoPage enterFaileditems_884(WebDriver driver,String Faileditems_884) {
		            BrowserActions.type(driver, inpFaileditems_884,Faileditems_884, "Faileditems_884");
			        return this;
           }
public WorkQueueInfoPage enterFailed_100(WebDriver driver,String Failed_100) {
		            BrowserActions.type(driver, inpFailed_100,Failed_100, "Failed_100");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_156(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_156,"DownloadHistory_156");
				    return this;
			}
public WorkQueueInfoPage enterFailed_340(WebDriver driver,String Failed_340) {
		            BrowserActions.type(driver, inpFailed_340,Failed_340, "Failed_340");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_396(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_396,"DownloadHistory_396");
				    return this;
			}
public WorkQueueInfoPage enterFailed_583(WebDriver driver,String Failed_583) {
		            BrowserActions.type(driver, inpFailed_583,Failed_583, "Failed_583");
			        return this;
           }
public WorkQueueInfoPage enterFailed_328(WebDriver driver,String Failed_328) {
		            BrowserActions.type(driver, inpFailed_328,Failed_328, "Failed_328");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_762(WebDriver driver,String UpFor_762) {
		            BrowserActions.type(driver, inpUpFor_762,UpFor_762, "UpFor_762");
			        return this;
           }
public WorkQueueInfoPage clickNotify_9(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_9,"Notify_9");
				    return this;
			}
public WorkQueueInfoPage clickRestart_263(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_263,"Restart_263");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_917(WebDriver driver,String MaxNumberofWorkers_917) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_917,MaxNumberofWorkers_917, "MaxNumberofWorkers_917");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_354(WebDriver driver,String ClusterWideState_354) {
		            BrowserActions.type(driver, inpClusterWideState_354,ClusterWideState_354, "ClusterWideState_354");
			        return this;
           }
public WorkQueueInfoPage enterFailed_570(WebDriver driver,String Failed_570) {
		            BrowserActions.type(driver, inpFailed_570,Failed_570, "Failed_570");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_163(WebDriver driver,String WriterStatus_163) {
		            BrowserActions.type(driver, inpWriterStatus_163,WriterStatus_163, "WriterStatus_163");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_566(WebDriver driver,String ExecutionTime_566) {
		            BrowserActions.type(driver, inpExecutionTime_566,ExecutionTime_566, "ExecutionTime_566");
			        return this;
           }
public WorkQueueInfoPage enterFailed_76(WebDriver driver,String Failed_76) {
		            BrowserActions.type(driver, inpFailed_76,Failed_76, "Failed_76");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_474(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_474,"WorkerEndTimeDateIcon_474");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState_114(WebDriver driver,String ClusterWideState_114) {
		            BrowserActions.type(driver, inpClusterWideState_114,ClusterWideState_114, "ClusterWideState_114");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_875(WebDriver driver,String Faileditems_875) {
		            BrowserActions.type(driver, inpFaileditems_875,Faileditems_875, "Faileditems_875");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_168(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_168,"DownloadHistory_168");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_404(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_404,"RunWriter_404");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_588(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_588,"Scheduled_588");
				    return this;
			}
public WorkQueueInfoPage enterCheckedoutitems(WebDriver driver,String Checkedoutitems) {
		            BrowserActions.type(driver, inpCheckedoutitems,Checkedoutitems, "Checkedoutitems");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_390(WebDriver driver,String ClusterWideState_390) {
		            BrowserActions.type(driver, inpClusterWideState_390,ClusterWideState_390, "ClusterWideState_390");
			        return this;
           }
public WorkQueueInfoPage clickRestart_251(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_251,"Restart_251");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_553(WebDriver driver,String ExecutionTime_553) {
		            BrowserActions.type(driver, inpExecutionTime_553,ExecutionTime_553, "ExecutionTime_553");
			        return this;
           }
public WorkQueueInfoPage enterServer_717(WebDriver driver,String Server_717) {
		            BrowserActions.type(driver, inpServer_717,Server_717, "Server_717");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_735(WebDriver driver,String UpFor_735) {
		            BrowserActions.type(driver, inpUpFor_735,UpFor_735, "UpFor_735");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_150(WebDriver driver,String ClusterWideState_150) {
		            BrowserActions.type(driver, inpClusterWideState_150,ClusterWideState_150, "ClusterWideState_150");
			        return this;
           }
public WorkQueueInfoPage enterFailed_40(WebDriver driver,String Failed_40) {
		            BrowserActions.type(driver, inpFailed_40,Failed_40, "Failed_40");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_908(WebDriver driver,String MaxNumberofWorkers_908) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_908,MaxNumberofWorkers_908, "MaxNumberofWorkers_908");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_5(WebDriver driver,String ExecutorsRunning_5) {
		            BrowserActions.type(driver, inpExecutorsRunning_5,ExecutorsRunning_5, "ExecutorsRunning_5");
			        return this;
           }
public WorkQueueInfoPage enterFailed_124(WebDriver driver,String Failed_124) {
		            BrowserActions.type(driver, inpFailed_124,Failed_124, "Failed_124");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_487(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_487,"WorkerEndTimeDateIcon_487");
				    return this;
			}
public WorkQueueInfoPage enterFailed_364(WebDriver driver,String Failed_364) {
		            BrowserActions.type(driver, inpFailed_364,Failed_364, "Failed_364");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_132(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_132,"DownloadHistory_132");
				    return this;
			}
public WorkQueueInfoPage clickStop_178(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_178,"Stop_178");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_575(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_575,"Scheduled_575");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_562(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_562,"Scheduled_562");
				    return this;
			}
public WorkQueueInfoPage enterServer_704(WebDriver driver,String Server_704) {
		            BrowserActions.type(driver, inpServer_704,Server_704, "Server_704");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_744(WebDriver driver,String UpFor_744) {
		            BrowserActions.type(driver, inpUpFor_744,UpFor_744, "UpFor_744");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_175(WebDriver driver,String WriterStatus_175) {
		            BrowserActions.type(driver, inpWriterStatus_175,WriterStatus_175, "WriterStatus_175");
			        return this;
           }
public WorkQueueInfoPage clickEndedDateIcon_944(WebDriver driver)  {
					BrowserActions.click(driver, btnEndedDateIcon_944,"EndedDateIcon_944");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_540(WebDriver driver,String ExecutionTime_540) {
		            BrowserActions.type(driver, inpExecutionTime_540,ExecutionTime_540, "ExecutionTime_540");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_138(WebDriver driver,String ClusterWideState_138) {
		            BrowserActions.type(driver, inpClusterWideState_138,ClusterWideState_138, "ClusterWideState_138");
			        return this;
           }
public WorkQueueInfoPage enterFailed_52(WebDriver driver,String Failed_52) {
		            BrowserActions.type(driver, inpFailed_52,Failed_52, "Failed_52");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_378(WebDriver driver,String ClusterWideState_378) {
		            BrowserActions.type(driver, inpClusterWideState_378,ClusterWideState_378, "ClusterWideState_378");
			        return this;
           }
public WorkQueueInfoPage enterFailed_112(WebDriver driver,String Failed_112) {
		            BrowserActions.type(driver, inpFailed_112,Failed_112, "Failed_112");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_144(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_144,"DownloadHistory_144");
				    return this;
			}
public WorkQueueInfoPage enterFailed_596(WebDriver driver,String Failed_596) {
		            BrowserActions.type(driver, inpFailed_596,Failed_596, "Failed_596");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_893(WebDriver driver,String Faileditems_893) {
		            BrowserActions.type(driver, inpFaileditems_893,Faileditems_893, "Faileditems_893");
			        return this;
           }
public WorkQueueInfoPage enterFailed_352(WebDriver driver,String Failed_352) {
		            BrowserActions.type(driver, inpFailed_352,Failed_352, "Failed_352");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_384(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_384,"DownloadHistory_384");
				    return this;
			}
public WorkQueueInfoPage clickByTasks(WebDriver driver)  {
					BrowserActions.click(driver, btnByTasks,"ByTasks");
				    return this;
			}
public WorkQueueInfoPage enterStatus(WebDriver driver,String Status) {
		            BrowserActions.type(driver, inpStatus,Status, "Status");
			        return this;
           }
public WorkQueueInfoPage clickRestart_23(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_23,"Restart_23");
				    return this;
			}
public WorkQueueInfoPage clickRestart_239(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_239,"Restart_239");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_230(WebDriver driver,String Available_230) {
		            BrowserActions.type(driver, inpAvailable_230,Available_230, "Available_230");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_65(WebDriver driver,String ExecutorsRunning_65) {
		            BrowserActions.type(driver, inpExecutorsRunning_65,ExecutorsRunning_65, "ExecutorsRunning_65");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_623(WebDriver driver,String ProcessID_623) {
		            BrowserActions.type(driver, inpProcessID_623,ProcessID_623, "ProcessID_623");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_25(WebDriver driver,String WorkQueue_25) {
		            BrowserActions.type(driver, inpWorkQueue_25,WorkQueue_25, "WorkQueue_25");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_255(WebDriver driver,String CheckedOut_255) {
		            BrowserActions.type(driver, inpCheckedOut_255,CheckedOut_255, "CheckedOut_255");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_748(WebDriver driver,String Exceptions_748) {
		            BrowserActions.type(driver, inpExceptions_748,Exceptions_748, "Exceptions_748");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_187(WebDriver driver,String WriterStatus_187) {
		            BrowserActions.type(driver, inpWriterStatus_187,WriterStatus_187, "WriterStatus_187");
			        return this;
           }
public WorkQueueInfoPage enterSkippeditems_940(WebDriver driver,String Skippeditems_940) {
		            BrowserActions.type(driver, inpSkippeditems_940,Skippeditems_940, "Skippeditems_940");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_718(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_718,"Scheduled_718");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_296(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_296,"RunWriter_296");
				    return this;
			}
public WorkQueueInfoPage clickDownloadRawData(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadRawData,"DownloadRawData");
				    return this;
			}
public WorkQueueInfoPage verifyDownloadRawData(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnDownloadRawData,"DownloadRawData");
    return this;
}
public WorkQueueInfoPage enterMaxNumberofWorkers(WebDriver driver,String MaxNumberofWorkers) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers,MaxNumberofWorkers, "MaxNumberofWorkers");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_957(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_957,"StartedDateIcon_957");
				    return this;
			}
public WorkQueueInfoPage enterStarted_796(WebDriver driver,String Started_796) {
		            BrowserActions.type(driver, inpStarted_796,Started_796, "Started_796");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_476(WebDriver driver,String Available_476) {
		            BrowserActions.type(driver, inpAvailable_476,Available_476, "Available_476");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_472(WebDriver driver,String NumberofItems_472) {
		            BrowserActions.type(driver, inpNumberofItems_472,NumberofItems_472, "NumberofItems_472");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_2(WebDriver driver,String Available_2) {
		            BrowserActions.type(driver, inpAvailable_2,Available_2, "Available_2");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_53(WebDriver driver,String ExecutorsRunning_53) {
		            BrowserActions.type(driver, inpExecutorsRunning_53,ExecutorsRunning_53, "ExecutorsRunning_53");
			        return this;
           }
public WorkQueueInfoPage clickRestart_11(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_11,"Restart_11");
				    return this;
			}
public WorkQueueInfoPage clickRestart_227(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_227,"Restart_227");
				    return this;
			}
public WorkQueueInfoPage enterProcessID_636(WebDriver driver,String ProcessID_636) {
		            BrowserActions.type(driver, inpProcessID_636,ProcessID_636, "ProcessID_636");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_267(WebDriver driver,String CheckedOut_267) {
		            BrowserActions.type(driver, inpCheckedOut_267,CheckedOut_267, "CheckedOut_267");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_757(WebDriver driver,String Exceptions_757) {
		            BrowserActions.type(driver, inpExceptions_757,Exceptions_757, "Exceptions_757");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_13(WebDriver driver,String WorkQueue_13) {
		            BrowserActions.type(driver, inpWorkQueue_13,WorkQueue_13, "WorkQueue_13");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory,"DownloadHistory");
				    return this;
			}
public WorkQueueInfoPage verifyDownloadHistory(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnDownloadHistory,"DownloadHistory");
    return this;
}
public WorkQueueInfoPage selectFilter_963(WebDriver driver,String Filter_963)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFilter_963,Filter_963,"Filter_963");
				    return this;
			}
public WorkQueueInfoPage enterWriterStatus_199(WebDriver driver,String WriterStatus_199) {
		            BrowserActions.type(driver, inpWriterStatus_199,WriterStatus_199, "WriterStatus_199");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_408(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_408,"DownloadHistory_408");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems(WebDriver driver,String Processeditems) {
		            BrowserActions.type(driver, inpProcesseditems,Processeditems, "Processeditems");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_705(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_705,"Scheduled_705");
				    return this;
			}
public WorkQueueInfoPage enterSkippeditems_955(WebDriver driver,String Skippeditems_955) {
		            BrowserActions.type(driver, inpSkippeditems_955,Skippeditems_955, "Skippeditems_955");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_284(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_284,"RunWriter_284");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_552(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_552,"WorkerEndTimeDateIcon_552");
				    return this;
			}
public WorkQueueInfoPage enterStarted_787(WebDriver driver,String Started_787) {
		            BrowserActions.type(driver, inpStarted_787,Started_787, "Started_787");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_463(WebDriver driver,String Available_463) {
		            BrowserActions.type(driver, inpAvailable_463,Available_463, "Available_463");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_41(WebDriver driver,String ExecutorsRunning_41) {
		            BrowserActions.type(driver, inpExecutorsRunning_41,ExecutorsRunning_41, "ExecutorsRunning_41");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_680(WebDriver driver,String NumberofItems_680) {
		            BrowserActions.type(driver, inpNumberofItems_680,NumberofItems_680, "NumberofItems_680");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_450(WebDriver driver,String Available_450) {
		            BrowserActions.type(driver, inpAvailable_450,Available_450, "Available_450");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_716(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_716,"ItemCreationTimeDateIcon_716");
				    return this;
			}
public WorkQueueInfoPage clickRestart_215(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_215,"Restart_215");
				    return this;
			}
public WorkQueueInfoPage enterExceptions_766(WebDriver driver,String Exceptions_766) {
		            BrowserActions.type(driver, inpExceptions_766,Exceptions_766, "Exceptions_766");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_279(WebDriver driver,String CheckedOut_279) {
		            BrowserActions.type(driver, inpCheckedOut_279,CheckedOut_279, "CheckedOut_279");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_446(WebDriver driver,String NumberofItems_446) {
		            BrowserActions.type(driver, inpNumberofItems_446,NumberofItems_446, "NumberofItems_446");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_592(WebDriver driver,String ExecutionTime_592) {
		            BrowserActions.type(driver, inpExecutionTime_592,ExecutionTime_592, "ExecutionTime_592");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_897(WebDriver driver,String UpFor_897) {
		            BrowserActions.type(driver, inpUpFor_897,UpFor_897, "UpFor_897");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_205(WebDriver driver,String WorkQueue_205) {
		            BrowserActions.type(driver, inpWorkQueue_205,WorkQueue_205, "WorkQueue_205");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_218(WebDriver driver,String Available_218) {
		            BrowserActions.type(driver, inpAvailable_218,Available_218, "Available_218");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_931(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_931,"StartedDateIcon_931");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_272(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_272,"RunWriter_272");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_565(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_565,"WorkerEndTimeDateIcon_565");
				    return this;
			}
public WorkQueueInfoPage enterStarted_778(WebDriver driver,String Started_778) {
		            BrowserActions.type(driver, inpStarted_778,Started_778, "Started_778");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_801(WebDriver driver,String Processeditems_801) {
		            BrowserActions.type(driver, inpProcesseditems_801,Processeditems_801, "Processeditems_801");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_697(WebDriver driver,String Available_697) {
		            BrowserActions.type(driver, inpAvailable_697,Available_697, "Available_697");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_703(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_703,"ItemCreationTimeDateIcon_703");
				    return this;
			}
public WorkQueueInfoPage enterNumberofItems_693(WebDriver driver,String NumberofItems_693) {
		            BrowserActions.type(driver, inpNumberofItems_693,NumberofItems_693, "NumberofItems_693");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_610(WebDriver driver,String ProcessID_610) {
		            BrowserActions.type(driver, inpProcessID_610,ProcessID_610, "ProcessID_610");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_775(WebDriver driver,String Exceptions_775) {
		            BrowserActions.type(driver, inpExceptions_775,Exceptions_775, "Exceptions_775");
			        return this;
           }
public WorkQueueInfoPage clickRestart_203(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_203,"Restart_203");
				    return this;
			}
public WorkQueueInfoPage enterStarted_769(WebDriver driver,String Started_769) {
		            BrowserActions.type(driver, inpStarted_769,Started_769, "Started_769");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_260(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_260,"RunWriter_260");
				    return this;
			}
public WorkQueueInfoPage enterNumberofItems_459(WebDriver driver,String NumberofItems_459) {
		            BrowserActions.type(driver, inpNumberofItems_459,NumberofItems_459, "NumberofItems_459");
			        return this;
           }
public WorkQueueInfoPage enterServer_509(WebDriver driver,String Server_509) {
		            BrowserActions.type(driver, inpServer_509,Server_509, "Server_509");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_217(WebDriver driver,String WorkQueue_217) {
		            BrowserActions.type(driver, inpWorkQueue_217,WorkQueue_217, "WorkQueue_217");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_291(WebDriver driver,String CheckedOut_291) {
		            BrowserActions.type(driver, inpCheckedOut_291,CheckedOut_291, "CheckedOut_291");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_942(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_942,"StartedDateIcon_942");
				    return this;
			}
public WorkQueueInfoPage enterHostname(WebDriver driver,String Hostname) {
		            BrowserActions.type(driver, inpHostname,Hostname, "Hostname");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_206(WebDriver driver,String Available_206) {
		            BrowserActions.type(driver, inpAvailable_206,Available_206, "Available_206");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_684(WebDriver driver,String Available_684) {
		            BrowserActions.type(driver, inpAvailable_684,Available_684, "Available_684");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_578(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_578,"WorkerEndTimeDateIcon_578");
				    return this;
			}
public WorkQueueInfoPage enterStarted_760(WebDriver driver,String Started_760) {
		            BrowserActions.type(driver, inpStarted_760,Started_760, "Started_760");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_784(WebDriver driver,String Exceptions_784) {
		            BrowserActions.type(driver, inpExceptions_784,Exceptions_784, "Exceptions_784");
			        return this;
           }
public WorkQueueInfoPage enterServer_535(WebDriver driver,String Server_535) {
		            BrowserActions.type(driver, inpServer_535,Server_535, "Server_535");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_229(WebDriver driver,String WorkQueue_229) {
		            BrowserActions.type(driver, inpWorkQueue_229,WorkQueue_229, "WorkQueue_229");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_572(WebDriver driver,String ItemCreationTime_572) {
		            BrowserActions.type(driver, inpItemCreationTime_572,ItemCreationTime_572, "ItemCreationTime_572");
			        return this;
           }
public WorkQueueInfoPage selectFilter(WebDriver driver,String Filter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFilter,Filter,"Filter");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon_914(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_914,"StartedDateIcon_914");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_278(WebDriver driver,String Available_278) {
		            BrowserActions.type(driver, inpAvailable_278,Available_278, "Available_278");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_500(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_500,"WorkerEndTimeDateIcon_500");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_510(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_510,"Scheduled_510");
				    return this;
			}
public WorkQueueInfoPage enterStarted_751(WebDriver driver,String Started_751) {
		            BrowserActions.type(driver, inpStarted_751,Started_751, "Started_751");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_793(WebDriver driver,String Exceptions_793) {
		            BrowserActions.type(driver, inpExceptions_793,Exceptions_793, "Exceptions_793");
			        return this;
           }
public WorkQueueInfoPage enterServer_522(WebDriver driver,String Server_522) {
		            BrowserActions.type(driver, inpServer_522,Server_522, "Server_522");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_585(WebDriver driver,String ItemCreationTime_585) {
		            BrowserActions.type(driver, inpItemCreationTime_585,ItemCreationTime_585, "ItemCreationTime_585");
			        return this;
           }
public WorkQueueInfoPage enterFailed_292(WebDriver driver,String Failed_292) {
		            BrowserActions.type(driver, inpFailed_292,Failed_292, "Failed_292");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_923(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_923,"StartedDateIcon_923");
				    return this;
			}
public WorkQueueInfoPage clickDownloadHistory_204(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_204,"DownloadHistory_204");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_266(WebDriver driver,String Available_266) {
		            BrowserActions.type(driver, inpAvailable_266,Available_266, "Available_266");
			        return this;
           }
public WorkQueueInfoPage enterStarted_742(WebDriver driver,String Started_742) {
		            BrowserActions.type(driver, inpStarted_742,Started_742, "Started_742");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_248(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_248,"RunWriter_248");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_513(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_513,"WorkerEndTimeDateIcon_513");
				    return this;
			}
public WorkQueueInfoPage enterNumberofItems_485(WebDriver driver,String NumberofItems_485) {
		            BrowserActions.type(driver, inpNumberofItems_485,NumberofItems_485, "NumberofItems_485");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_89(WebDriver driver,String ExecutorsRunning_89) {
		            BrowserActions.type(driver, inpExecutorsRunning_89,ExecutorsRunning_89, "ExecutorsRunning_89");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_19(WebDriver driver,String WriterStatus_19) {
		            BrowserActions.type(driver, inpWriterStatus_19,WriterStatus_19, "WriterStatus_19");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_241(WebDriver driver,String WorkQueue_241) {
		            BrowserActions.type(driver, inpWorkQueue_241,WorkQueue_241, "WorkQueue_241");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_598(WebDriver driver,String ItemCreationTime_598) {
		            BrowserActions.type(driver, inpItemCreationTime_598,ItemCreationTime_598, "ItemCreationTime_598");
			        return this;
           }
public WorkQueueInfoPage clickEndedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEndedDateIcon,"EndedDateIcon");
				    return this;
			}
public WorkQueueInfoPage enterStarted_733(WebDriver driver,String Started_733) {
		            BrowserActions.type(driver, inpStarted_733,Started_733, "Started_733");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_306(WebDriver driver,String ClusterWideState_306) {
		            BrowserActions.type(driver, inpClusterWideState_306,ClusterWideState_306, "ClusterWideState_306");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_254(WebDriver driver,String Available_254) {
		            BrowserActions.type(driver, inpAvailable_254,Available_254, "Available_254");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_526(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_526,"WorkerEndTimeDateIcon_526");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_236(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_236,"RunWriter_236");
				    return this;
			}
public WorkQueueInfoPage enterServer_561(WebDriver driver,String Server_561) {
		            BrowserActions.type(driver, inpServer_561,Server_561, "Server_561");
			        return this;
           }
public WorkQueueInfoPage clickRestart_407(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_407,"Restart_407");
				    return this;
			}
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_539(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_539,"WorkerEndTimeDateIcon_539");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_242(WebDriver driver,String Available_242) {
		            BrowserActions.type(driver, inpAvailable_242,Available_242, "Available_242");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_253(WebDriver driver,String WorkQueue_253) {
		            BrowserActions.type(driver, inpWorkQueue_253,WorkQueue_253, "WorkQueue_253");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_77(WebDriver driver,String ExecutorsRunning_77) {
		            BrowserActions.type(driver, inpExecutorsRunning_77,ExecutorsRunning_77, "ExecutorsRunning_77");
			        return this;
           }
public WorkQueueInfoPage enterEnded(WebDriver driver,String Ended) {
		            BrowserActions.type(driver, inpEnded,Ended, "Ended");
			        return this;
           }
public WorkQueueInfoPage enterServer_548(WebDriver driver,String Server_548) {
		            BrowserActions.type(driver, inpServer_548,Server_548, "Server_548");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_498(WebDriver driver,String NumberofItems_498) {
		            BrowserActions.type(driver, inpNumberofItems_498,NumberofItems_498, "NumberofItems_498");
			        return this;
           }
public WorkQueueInfoPage clickNotify_405(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_405,"Notify_405");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_224(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_224,"RunWriter_224");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_489(WebDriver driver,String Available_489) {
		            BrowserActions.type(driver, inpAvailable_489,Available_489, "Available_489");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_905(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_905,"StartedDateIcon_905");
				    return this;
			}
public WorkQueueInfoPage enterServer_574(WebDriver driver,String Server_574) {
		            BrowserActions.type(driver, inpServer_574,Server_574, "Server_574");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_659(WebDriver driver,String CheckedOut_659) {
		            BrowserActions.type(driver, inpCheckedOut_659,CheckedOut_659, "CheckedOut_659");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_467(WebDriver driver,String ProcessID_467) {
		            BrowserActions.type(driver, inpProcessID_467,ProcessID_467, "ProcessID_467");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_413(WebDriver driver,String CheckedOut_413) {
		            BrowserActions.type(driver, inpCheckedOut_413,CheckedOut_413, "CheckedOut_413");
			        return this;
           }
public WorkQueueInfoPage enterStarted_956(WebDriver driver,String Started_956) {
		            BrowserActions.type(driver, inpStarted_956,Started_956, "Started_956");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_708(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_708,"WorkerEndTimeDateIcon_708");
				    return this;
			}
public WorkQueueInfoPage clickNotify_213(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_213,"Notify_213");
				    return this;
			}
public WorkQueueInfoPage enterHostname_907(WebDriver driver,String Hostname_907) {
		            BrowserActions.type(driver, inpHostname_907,Hostname_907, "Hostname_907");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_573(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_573,"ItemCreationTimeDateIcon_573");
				    return this;
			}
public WorkQueueInfoPage clickStop_34(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_34,"Stop_34");
				    return this;
			}
public WorkQueueInfoPage enterExceptions_901(WebDriver driver,String Exceptions_901) {
		            BrowserActions.type(driver, inpExceptions_901,Exceptions_901, "Exceptions_901");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_221(WebDriver driver,String ExecutorsRunning_221) {
		            BrowserActions.type(driver, inpExecutorsRunning_221,ExecutorsRunning_221, "ExecutorsRunning_221");
			        return this;
           }
public WorkQueueInfoPage enterCheckedoutitems_950(WebDriver driver,String Checkedoutitems_950) {
		            BrowserActions.type(driver, inpCheckedoutitems_950,Checkedoutitems_950, "Checkedoutitems_950");
			        return this;
           }
public WorkQueueInfoPage clickRefresh(WebDriver driver)  {
					BrowserActions.click(driver, btnRefresh,"Refresh");
				    return this;
			}
public WorkQueueInfoPage verifyRefresh(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnRefresh,"Refresh");
    return this;
}
public WorkQueueInfoPage clickDownloadHistory_84(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_84,"DownloadHistory_84");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon_797(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_797,"StartedDateIcon_797");
				    return this;
			}
public WorkQueueInfoPage enterNumberofItems_628(WebDriver driver,String NumberofItems_628) {
		            BrowserActions.type(driver, inpNumberofItems_628,NumberofItems_628, "NumberofItems_628");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_632(WebDriver driver,String Available_632) {
		            BrowserActions.type(driver, inpAvailable_632,Available_632, "Available_632");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_6(WebDriver driver,String ClusterWideState_6) {
		            BrowserActions.type(driver, inpClusterWideState_6,ClusterWideState_6, "ClusterWideState_6");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_31(WebDriver driver,String WriterStatus_31) {
		            BrowserActions.type(driver, inpWriterStatus_31,WriterStatus_31, "WriterStatus_31");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_864(WebDriver driver,String Processeditems_864) {
		            BrowserActions.type(driver, inpProcesseditems_864,Processeditems_864, "Processeditems_864");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue(WebDriver driver,String WorkQueue) {
		            BrowserActions.type(driver, inpWorkQueue,WorkQueue, "WorkQueue");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_425(WebDriver driver,String CheckedOut_425) {
		            BrowserActions.type(driver, inpCheckedOut_425,CheckedOut_425, "CheckedOut_425");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_642(WebDriver driver,String WorkerEndTime_642) {
		            BrowserActions.type(driver, inpWorkerEndTime_642,WorkerEndTime_642, "WorkerEndTime_642");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_910(WebDriver driver,String Exceptions_910) {
		            BrowserActions.type(driver, inpExceptions_910,Exceptions_910, "Exceptions_910");
			        return this;
           }
public WorkQueueInfoPage clickNotify_225(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_225,"Notify_225");
				    return this;
			}
public WorkQueueInfoPage clickStop_46(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_46,"Stop_46");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_233(WebDriver driver,String ExecutorsRunning_233) {
		            BrowserActions.type(driver, inpExecutorsRunning_233,ExecutorsRunning_233, "ExecutorsRunning_233");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_560(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_560,"ItemCreationTimeDateIcon_560");
				    return this;
			}
public WorkQueueInfoPage enterExceptions_919(WebDriver driver,String Exceptions_919) {
		            BrowserActions.type(driver, inpExceptions_919,Exceptions_919, "Exceptions_919");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_72(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_72,"DownloadHistory_72");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_533(WebDriver driver,String ItemCreationTime_533) {
		            BrowserActions.type(driver, inpItemCreationTime_533,ItemCreationTime_533, "ItemCreationTime_533");
			        return this;
           }
public WorkQueueInfoPage enterStarted_941(WebDriver driver,String Started_941) {
		            BrowserActions.type(driver, inpStarted_941,Started_941, "Started_941");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_855(WebDriver driver,String Processeditems_855) {
		            BrowserActions.type(driver, inpProcesseditems_855,Processeditems_855, "Processeditems_855");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_441(WebDriver driver,String ProcessID_441) {
		            BrowserActions.type(driver, inpProcessID_441,ProcessID_441, "ProcessID_441");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_438(WebDriver driver,String CheckedOut_438) {
		            BrowserActions.type(driver, inpCheckedOut_438,CheckedOut_438, "CheckedOut_438");
			        return this;
           }
public WorkQueueInfoPage enterFailed_713(WebDriver driver,String Failed_713) {
		            BrowserActions.type(driver, inpFailed_713,Failed_713, "Failed_713");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_655(WebDriver driver,String WorkerEndTime_655) {
		            BrowserActions.type(driver, inpWorkerEndTime_655,WorkerEndTime_655, "WorkerEndTime_655");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_688(WebDriver driver,String ProcessID_688) {
		            BrowserActions.type(driver, inpProcessID_688,ProcessID_688, "ProcessID_688");
			        return this;
           }
public WorkQueueInfoPage clickStop_10(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_10,"Stop_10");
				    return this;
			}
public WorkQueueInfoPage enterUpFor(WebDriver driver,String UpFor) {
		            BrowserActions.type(driver, inpUpFor,UpFor, "UpFor");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_602(WebDriver driver,String NumberofItems_602) {
		            BrowserActions.type(driver, inpNumberofItems_602,NumberofItems_602, "NumberofItems_602");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_672(WebDriver driver,String CheckedOut_672) {
		            BrowserActions.type(driver, inpCheckedOut_672,CheckedOut_672, "CheckedOut_672");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_928(WebDriver driver,String Exceptions_928) {
		            BrowserActions.type(driver, inpExceptions_928,Exceptions_928, "Exceptions_928");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_619(WebDriver driver,String Available_619) {
		            BrowserActions.type(driver, inpAvailable_619,Available_619, "Available_619");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_546(WebDriver driver,String ItemCreationTime_546) {
		            BrowserActions.type(driver, inpItemCreationTime_546,ItemCreationTime_546, "ItemCreationTime_546");
			        return this;
           }
public WorkQueueInfoPage enterOrphansreclaimed(WebDriver driver,String Orphansreclaimed) {
		            BrowserActions.type(driver, inpOrphansreclaimed,Orphansreclaimed, "Orphansreclaimed");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus(WebDriver driver,String WriterStatus) {
		            BrowserActions.type(driver, inpWriterStatus,WriterStatus, "WriterStatus");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_779(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_779,"StartedDateIcon_779");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems_882(WebDriver driver,String Processeditems_882) {
		            BrowserActions.type(driver, inpProcesseditems_882,Processeditems_882, "Processeditems_882");
			        return this;
           }
public WorkQueueInfoPage enterStarted_930(WebDriver driver,String Started_930) {
		            BrowserActions.type(driver, inpStarted_930,Started_930, "Started_930");
			        return this;
           }
public WorkQueueInfoPage enterCheckedoutitems_935(WebDriver driver,String Checkedoutitems_935) {
		            BrowserActions.type(driver, inpCheckedoutitems_935,Checkedoutitems_935, "Checkedoutitems_935");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_55(WebDriver driver,String WriterStatus_55) {
		            BrowserActions.type(driver, inpWriterStatus_55,WriterStatus_55, "WriterStatus_55");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_721(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_721,"WorkerEndTimeDateIcon_721");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_421(WebDriver driver,String WorkerEndTime_421) {
		            BrowserActions.type(driver, inpWorkerEndTime_421,WorkerEndTime_421, "WorkerEndTime_421");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_454(WebDriver driver,String ProcessID_454) {
		            BrowserActions.type(driver, inpProcessID_454,ProcessID_454, "ProcessID_454");
			        return this;
           }
public WorkQueueInfoPage enterServer_587(WebDriver driver,String Server_587) {
		            BrowserActions.type(driver, inpServer_587,Server_587, "Server_587");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_207(WebDriver driver,String CheckedOut_207) {
		            BrowserActions.type(driver, inpCheckedOut_207,CheckedOut_207, "CheckedOut_207");
			        return this;
           }
public WorkQueueInfoPage selectTasks(WebDriver driver,String Tasks)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTasks,Tasks,"Tasks");
				    return this;
			}
public WorkQueueInfoPage clickItemCreationTimeDateIcon_547(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_547,"ItemCreationTimeDateIcon_547");
				    return this;
			}
public WorkQueueInfoPage enterFailed_700(WebDriver driver,String Failed_700) {
		            BrowserActions.type(driver, inpFailed_700,Failed_700, "Failed_700");
			        return this;
           }
public WorkQueueInfoPage enterStarted_922(WebDriver driver,String Started_922) {
		            BrowserActions.type(driver, inpStarted_922,Started_922, "Started_922");
			        return this;
           }
public WorkQueueInfoPage clickStop_22(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_22,"Stop_22");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_685(WebDriver driver,String CheckedOut_685) {
		            BrowserActions.type(driver, inpCheckedOut_685,CheckedOut_685, "CheckedOut_685");
			        return this;
           }
public WorkQueueInfoPage clickNotify_201(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_201,"Notify_201");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_668(WebDriver driver,String WorkerEndTime_668) {
		            BrowserActions.type(driver, inpWorkerEndTime_668,WorkerEndTime_668, "WorkerEndTime_668");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_937(WebDriver driver,String Exceptions_937) {
		            BrowserActions.type(driver, inpExceptions_937,Exceptions_937, "Exceptions_937");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_559(WebDriver driver,String ItemCreationTime_559) {
		            BrowserActions.type(driver, inpItemCreationTime_559,ItemCreationTime_559, "ItemCreationTime_559");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_96(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_96,"DownloadHistory_96");
				    return this;
			}
public WorkQueueInfoPage enterNumberofItems_615(WebDriver driver,String NumberofItems_615) {
		            BrowserActions.type(driver, inpNumberofItems_615,NumberofItems_615, "NumberofItems_615");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_788(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_788,"StartedDateIcon_788");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_209(WebDriver driver,String ExecutorsRunning_209) {
		            BrowserActions.type(driver, inpExecutorsRunning_209,ExecutorsRunning_209, "ExecutorsRunning_209");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_606(WebDriver driver,String Available_606) {
		            BrowserActions.type(driver, inpAvailable_606,Available_606, "Available_606");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_873(WebDriver driver,String Processeditems_873) {
		            BrowserActions.type(driver, inpProcesseditems_873,Processeditems_873, "Processeditems_873");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_43(WebDriver driver,String WriterStatus_43) {
		            BrowserActions.type(driver, inpWriterStatus_43,WriterStatus_43, "WriterStatus_43");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_79(WebDriver driver,String WriterStatus_79) {
		            BrowserActions.type(driver, inpWriterStatus_79,WriterStatus_79, "WriterStatus_79");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_219(WebDriver driver,String CheckedOut_219) {
		            BrowserActions.type(driver, inpCheckedOut_219,CheckedOut_219, "CheckedOut_219");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_504(WebDriver driver,String Succeeded_504) {
		            BrowserActions.type(driver, inpSucceeded_504,Succeeded_504, "Succeeded_504");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_662(WebDriver driver,String ProcessID_662) {
		            BrowserActions.type(driver, inpProcessID_662,ProcessID_662, "ProcessID_662");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_671(WebDriver driver,String Available_671) {
		            BrowserActions.type(driver, inpAvailable_671,Available_671, "Available_671");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_534(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_534,"ItemCreationTimeDateIcon_534");
				    return this;
			}
public WorkQueueInfoPage enterStarted_913(WebDriver driver,String Started_913) {
		            BrowserActions.type(driver, inpStarted_913,Started_913, "Started_913");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_698(WebDriver driver,String CheckedOut_698) {
		            BrowserActions.type(driver, inpCheckedOut_698,CheckedOut_698, "CheckedOut_698");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_667(WebDriver driver,String NumberofItems_667) {
		            BrowserActions.type(driver, inpNumberofItems_667,NumberofItems_667, "NumberofItems_667");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_48(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_48,"DownloadHistory_48");
				    return this;
			}
public WorkQueueInfoPage enterProcessID_428(WebDriver driver,String ProcessID_428) {
		            BrowserActions.type(driver, inpProcessID_428,ProcessID_428, "ProcessID_428");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_451(WebDriver driver,String CheckedOut_451) {
		            BrowserActions.type(driver, inpCheckedOut_451,CheckedOut_451, "CheckedOut_451");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_420(WebDriver driver,String NumberofItems_420) {
		            BrowserActions.type(driver, inpNumberofItems_420,NumberofItems_420, "NumberofItems_420");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_29(WebDriver driver,String ExecutorsRunning_29) {
		            BrowserActions.type(driver, inpExecutorsRunning_29,ExecutorsRunning_29, "ExecutorsRunning_29");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_761(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_761,"StartedDateIcon_761");
				    return this;
			}
public WorkQueueInfoPage clickStartedDateIcon_752(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_752,"StartedDateIcon_752");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems_828(WebDriver driver,String Processeditems_828) {
		            BrowserActions.type(driver, inpProcesseditems_828,Processeditems_828, "Processeditems_828");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_437(WebDriver driver,String Available_437) {
		            BrowserActions.type(driver, inpAvailable_437,Available_437, "Available_437");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_67(WebDriver driver,String WriterStatus_67) {
		            BrowserActions.type(driver, inpWriterStatus_67,WriterStatus_67, "WriterStatus_67");
			        return this;
           }
public WorkQueueInfoPage clickNotify_261(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_261,"Notify_261");
				    return this;
			}
public WorkQueueInfoPage enterStarted_904(WebDriver driver,String Started_904) {
		            BrowserActions.type(driver, inpStarted_904,Started_904, "Started_904");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_675(WebDriver driver,String ProcessID_675) {
		            BrowserActions.type(driver, inpProcessID_675,ProcessID_675, "ProcessID_675");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_952(WebDriver driver,String Exceptions_952) {
		            BrowserActions.type(driver, inpExceptions_952,Exceptions_952, "Exceptions_952");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_17(WebDriver driver,String ExecutorsRunning_17) {
		            BrowserActions.type(driver, inpExecutorsRunning_17,ExecutorsRunning_17, "ExecutorsRunning_17");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_36(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_36,"DownloadHistory_36");
				    return this;
			}
public WorkQueueInfoPage enterCheckedOut_464(WebDriver driver,String CheckedOut_464) {
		            BrowserActions.type(driver, inpCheckedOut_464,CheckedOut_464, "CheckedOut_464");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_521(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_521,"ItemCreationTimeDateIcon_521");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_603(WebDriver driver,String WorkerEndTime_603) {
		            BrowserActions.type(driver, inpWorkerEndTime_603,WorkerEndTime_603, "WorkerEndTime_603");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_770(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_770,"StartedDateIcon_770");
				    return this;
			}
public WorkQueueInfoPage enterStatus_795(WebDriver driver,String Status_795) {
		            BrowserActions.type(driver, inpStatus_795,Status_795, "Status_795");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_433(WebDriver driver,String NumberofItems_433) {
		            BrowserActions.type(driver, inpNumberofItems_433,NumberofItems_433, "NumberofItems_433");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_819(WebDriver driver,String Processeditems_819) {
		            BrowserActions.type(driver, inpProcesseditems_819,Processeditems_819, "Processeditems_819");
			        return this;
           }
public WorkQueueInfoPage clickStop_406(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_406,"Stop_406");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_424(WebDriver driver,String Available_424) {
		            BrowserActions.type(driver, inpAvailable_424,Available_424, "Available_424");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_810(WebDriver driver,String Processeditems_810) {
		            BrowserActions.type(driver, inpProcesseditems_810,Processeditems_810, "Processeditems_810");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_725(WebDriver driver,String Succeeded_725) {
		            BrowserActions.type(driver, inpSucceeded_725,Succeeded_725, "Succeeded_725");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_477(WebDriver driver,String CheckedOut_477) {
		            BrowserActions.type(driver, inpCheckedOut_477,CheckedOut_477, "CheckedOut_477");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_616(WebDriver driver,String WorkerEndTime_616) {
		            BrowserActions.type(driver, inpWorkerEndTime_616,WorkerEndTime_616, "WorkerEndTime_616");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_649(WebDriver driver,String ProcessID_649) {
		            BrowserActions.type(driver, inpProcessID_649,ProcessID_649, "ProcessID_649");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_231(WebDriver driver,String CheckedOut_231) {
		            BrowserActions.type(driver, inpCheckedOut_231,CheckedOut_231, "CheckedOut_231");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_641(WebDriver driver,String NumberofItems_641) {
		            BrowserActions.type(driver, inpNumberofItems_641,NumberofItems_641, "NumberofItems_641");
			        return this;
           }
public WorkQueueInfoPage clickNotify_237(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_237,"Notify_237");
				    return this;
			}
public WorkQueueInfoPage clickDownloadHistory_60(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_60,"DownloadHistory_60");
				    return this;
			}
public WorkQueueInfoPage enterItemCreationTime_507(WebDriver driver,String ItemCreationTime_507) {
		            BrowserActions.type(driver, inpItemCreationTime_507,ItemCreationTime_507, "ItemCreationTime_507");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_846(WebDriver driver,String Processeditems_846) {
		            BrowserActions.type(driver, inpProcesseditems_846,Processeditems_846, "Processeditems_846");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_658(WebDriver driver,String Available_658) {
		            BrowserActions.type(driver, inpAvailable_658,Available_658, "Available_658");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_734(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_734,"StartedDateIcon_734");
				    return this;
			}
public WorkQueueInfoPage enterWriterStatus_91(WebDriver driver,String WriterStatus_91) {
		            BrowserActions.type(driver, inpWriterStatus_91,WriterStatus_91, "WriterStatus_91");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_412(WebDriver driver,String Available_412) {
		            BrowserActions.type(driver, inpAvailable_412,Available_412, "Available_412");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_508(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_508,"ItemCreationTimeDateIcon_508");
				    return this;
			}
public WorkQueueInfoPage enterExceptions_730(WebDriver driver,String Exceptions_730) {
		            BrowserActions.type(driver, inpExceptions_730,Exceptions_730, "Exceptions_730");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_520(WebDriver driver,String ItemCreationTime_520) {
		            BrowserActions.type(driver, inpItemCreationTime_520,ItemCreationTime_520, "ItemCreationTime_520");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_415(WebDriver driver,String ProcessID_415) {
		            BrowserActions.type(driver, inpProcessID_415,ProcessID_415, "ProcessID_415");
			        return this;
           }
public WorkQueueInfoPage enterHostname_916(WebDriver driver,String Hostname_916) {
		            BrowserActions.type(driver, inpHostname_916,Hostname_916, "Hostname_916");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_243(WebDriver driver,String CheckedOut_243) {
		            BrowserActions.type(driver, inpCheckedOut_243,CheckedOut_243, "CheckedOut_243");
			        return this;
           }
public WorkQueueInfoPage enterExceptions_739(WebDriver driver,String Exceptions_739) {
		            BrowserActions.type(driver, inpExceptions_739,Exceptions_739, "Exceptions_739");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_629(WebDriver driver,String WorkerEndTime_629) {
		            BrowserActions.type(driver, inpWorkerEndTime_629,WorkerEndTime_629, "WorkerEndTime_629");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_654(WebDriver driver,String NumberofItems_654) {
		            BrowserActions.type(driver, inpNumberofItems_654,NumberofItems_654, "NumberofItems_654");
			        return this;
           }
public WorkQueueInfoPage clickNotify_249(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_249,"Notify_249");
				    return this;
			}
public WorkQueueInfoPage enterProcesseditems_837(WebDriver driver,String Processeditems_837) {
		            BrowserActions.type(driver, inpProcesseditems_837,Processeditems_837, "Processeditems_837");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_490(WebDriver driver,String CheckedOut_490) {
		            BrowserActions.type(driver, inpCheckedOut_490,CheckedOut_490, "CheckedOut_490");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_401(WebDriver driver,String ExecutorsRunning_401) {
		            BrowserActions.type(driver, inpExecutorsRunning_401,ExecutorsRunning_401, "ExecutorsRunning_401");
			        return this;
           }
public WorkQueueInfoPage clickStartedDateIcon_743(WebDriver driver)  {
					BrowserActions.click(driver, btnStartedDateIcon_743,"StartedDateIcon_743");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_645(WebDriver driver,String Available_645) {
		            BrowserActions.type(driver, inpAvailable_645,Available_645, "Available_645");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_712(WebDriver driver,String Succeeded_712) {
		            BrowserActions.type(driver, inpSucceeded_712,Succeeded_712, "Succeeded_712");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_7(WebDriver driver,String WriterStatus_7) {
		            BrowserActions.type(driver, inpWriterStatus_7,WriterStatus_7, "WriterStatus_7");
			        return this;
           }
public WorkQueueInfoPage enterServer(WebDriver driver,String Server) {
		            BrowserActions.type(driver, inpServer,Server, "Server");
			        return this;
           }
public WorkQueueInfoPage enterHostname_745(WebDriver driver,String Hostname_745) {
		            BrowserActions.type(driver, inpHostname_745,Hostname_745, "Hostname_745");
			        return this;
           }
public WorkQueueInfoPage clickNotify_177(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_177,"Notify_177");
				    return this;
			}
public WorkQueueInfoPage enterFailed_414(WebDriver driver,String Failed_414) {
		            BrowserActions.type(driver, inpFailed_414,Failed_414, "Failed_414");
			        return this;
           }
public WorkQueueInfoPage enterStatus_768(WebDriver driver,String Status_768) {
		            BrowserActions.type(driver, inpStatus_768,Status_768, "Status_768");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_294(WebDriver driver,String ClusterWideState_294) {
		            BrowserActions.type(driver, inpClusterWideState_294,ClusterWideState_294, "ClusterWideState_294");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_660(WebDriver driver,String Succeeded_660) {
		            BrowserActions.type(driver, inpSucceeded_660,Succeeded_660, "Succeeded_660");
			        return this;
           }
public WorkQueueInfoPage clickNotify_33(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_33,"Notify_33");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_426(WebDriver driver,String Succeeded_426) {
		            BrowserActions.type(driver, inpSucceeded_426,Succeeded_426, "Succeeded_426");
			        return this;
           }
public WorkQueueInfoPage enterFailed_661(WebDriver driver,String Failed_661) {
		            BrowserActions.type(driver, inpFailed_661,Failed_661, "Failed_661");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_590(WebDriver driver,String WorkerEndTime_590) {
		            BrowserActions.type(driver, inpWorkerEndTime_590,WorkerEndTime_590, "WorkerEndTime_590");
			        return this;
           }
public WorkQueueInfoPage enterFailed_648(WebDriver driver,String Failed_648) {
		            BrowserActions.type(driver, inpFailed_648,Failed_648, "Failed_648");
			        return this;
           }
public WorkQueueInfoPage enterStatus_759(WebDriver driver,String Status_759) {
		            BrowserActions.type(driver, inpStatus_759,Status_759, "Status_759");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_954(WebDriver driver,String Faileditems_954) {
		            BrowserActions.type(driver, inpFaileditems_954,Faileditems_954, "Faileditems_954");
			        return this;
           }
public WorkQueueInfoPage clickNotify_189(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_189,"Notify_189");
				    return this;
			}
public WorkQueueInfoPage enterHostname_736(WebDriver driver,String Hostname_736) {
		            BrowserActions.type(driver, inpHostname_736,Hostname_736, "Hostname_736");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_282(WebDriver driver,String ClusterWideState_282) {
		            BrowserActions.type(driver, inpClusterWideState_282,ClusterWideState_282, "ClusterWideState_282");
			        return this;
           }
public WorkQueueInfoPage enterStatus_750(WebDriver driver,String Status_750) {
		            BrowserActions.type(driver, inpStatus_750,Status_750, "Status_750");
			        return this;
           }
public WorkQueueInfoPage enterStarted(WebDriver driver,String Started) {
		            BrowserActions.type(driver, inpStarted,Started, "Started");
			        return this;
           }
public WorkQueueInfoPage clickNotify_45(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_45,"Notify_45");
				    return this;
			}
public WorkQueueInfoPage clickStop_202(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_202,"Stop_202");
				    return this;
			}
public WorkQueueInfoPage clickNotify_393(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_393,"Notify_393");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_647(WebDriver driver,String Succeeded_647) {
		            BrowserActions.type(driver, inpSucceeded_647,Succeeded_647, "Succeeded_647");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_749(WebDriver driver,String Faileditems_749) {
		            BrowserActions.type(driver, inpFaileditems_749,Faileditems_749, "Faileditems_749");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_403(WebDriver driver,String WriterStatus_403) {
		            BrowserActions.type(driver, inpWriterStatus_403,WriterStatus_403, "WriterStatus_403");
			        return this;
           }
public WorkQueueInfoPage enterWriter(WebDriver driver,String Writer) {
		            BrowserActions.type(driver, inpWriter,Writer, "Writer");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_711(WebDriver driver,String CheckedOut_711) {
		            BrowserActions.type(driver, inpCheckedOut_711,CheckedOut_711, "CheckedOut_711");
			        return this;
           }
public WorkQueueInfoPage clickNotify_153(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_153,"Notify_153");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_281(WebDriver driver,String ExecutorsRunning_281) {
		            BrowserActions.type(driver, inpExecutorsRunning_281,ExecutorsRunning_281, "ExecutorsRunning_281");
			        return this;
           }
public WorkQueueInfoPage enterPoolSize(WebDriver driver,String PoolSize) {
		            BrowserActions.type(driver, inpPoolSize,PoolSize, "PoolSize");
			        return this;
           }
public WorkQueueInfoPage enterHostname_727(WebDriver driver,String Hostname_727) {
		            BrowserActions.type(driver, inpHostname_727,Hostname_727, "Hostname_727");
			        return this;
           }
public WorkQueueInfoPage enterStatus_786(WebDriver driver,String Status_786) {
		            BrowserActions.type(driver, inpStatus_786,Status_786, "Status_786");
			        return this;
           }
public WorkQueueInfoPage clickNotify(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify,"Notify");
				    return this;
			}
public WorkQueueInfoPage verifyNotify(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnNotify,"Notify");
    return this;
}
public WorkQueueInfoPage enterItemCreationTime_702(WebDriver driver,String ItemCreationTime_702) {
		            BrowserActions.type(driver, inpItemCreationTime_702,ItemCreationTime_702, "ItemCreationTime_702");
			        return this;
           }
public WorkQueueInfoPage enterFailed_687(WebDriver driver,String Failed_687) {
		            BrowserActions.type(driver, inpFailed_687,Failed_687, "Failed_687");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems(WebDriver driver,String Faileditems) {
		            BrowserActions.type(driver, inpFaileditems,Faileditems, "Faileditems");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_740(WebDriver driver,String Faileditems_740) {
		            BrowserActions.type(driver, inpFaileditems_740,Faileditems_740, "Faileditems_740");
			        return this;
           }
public WorkQueueInfoPage clickNotify_57(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_57,"Notify_57");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_497(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_497,"Scheduled_497");
				    return this;
			}
public WorkQueueInfoPage enterFailed_440(WebDriver driver,String Failed_440) {
		            BrowserActions.type(driver, inpFailed_440,Failed_440, "Failed_440");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_484(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_484,"Scheduled_484");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_890(WebDriver driver,String MaxNumberofWorkers_890) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_890,MaxNumberofWorkers_890, "MaxNumberofWorkers_890");
			        return this;
           }
public WorkQueueInfoPage enterOrphansreclaimed_953(WebDriver driver,String Orphansreclaimed_953) {
		            BrowserActions.type(driver, inpOrphansreclaimed_953,Orphansreclaimed_953, "Orphansreclaimed_953");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_724(WebDriver driver,String CheckedOut_724) {
		            BrowserActions.type(driver, inpCheckedOut_724,CheckedOut_724, "CheckedOut_724");
			        return this;
           }
public WorkQueueInfoPage clickNotify_165(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_165,"Notify_165");
				    return this;
			}
public WorkQueueInfoPage enterFailed_427(WebDriver driver,String Failed_427) {
		            BrowserActions.type(driver, inpFailed_427,Failed_427, "Failed_427");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_293(WebDriver driver,String ExecutorsRunning_293) {
		            BrowserActions.type(driver, inpExecutorsRunning_293,ExecutorsRunning_293, "ExecutorsRunning_293");
			        return this;
           }
public WorkQueueInfoPage enterStatus_777(WebDriver driver,String Status_777) {
		            BrowserActions.type(driver, inpStatus_777,Status_777, "Status_777");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime_715(WebDriver driver,String ItemCreationTime_715) {
		            BrowserActions.type(driver, inpItemCreationTime_715,ItemCreationTime_715, "ItemCreationTime_715");
			        return this;
           }
public WorkQueueInfoPage clickScheduled(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled,"Scheduled");
				    return this;
			}
public WorkQueueInfoPage enterFaileditems_731(WebDriver driver,String Faileditems_731) {
		            BrowserActions.type(driver, inpFaileditems_731,Faileditems_731, "Faileditems_731");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_899(WebDriver driver,String MaxNumberofWorkers_899) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_899,MaxNumberofWorkers_899, "MaxNumberofWorkers_899");
			        return this;
           }
public WorkQueueInfoPage enterFailed_674(WebDriver driver,String Failed_674) {
		            BrowserActions.type(driver, inpFailed_674,Failed_674, "Failed_674");
			        return this;
           }
public WorkQueueInfoPage clickWorkitems(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkitems,"Workitems");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_634(WebDriver driver,String Succeeded_634) {
		            BrowserActions.type(driver, inpSucceeded_634,Succeeded_634, "Succeeded_634");
			        return this;
           }
public WorkQueueInfoPage clickNotify_69(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_69,"Notify_69");
				    return this;
			}
public WorkQueueInfoPage clickWorkitems_411(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkitems_411,"Workitems_411");
				    return this;
			}
public WorkQueueInfoPage enterEnded_958(WebDriver driver,String Ended_958) {
		            BrowserActions.type(driver, inpEnded_958,Ended_958, "Ended_958");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_551(WebDriver driver,String WorkerEndTime_551) {
		            BrowserActions.type(driver, inpWorkerEndTime_551,WorkerEndTime_551, "WorkerEndTime_551");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_881(WebDriver driver,String MaxNumberofWorkers_881) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_881,MaxNumberofWorkers_881, "MaxNumberofWorkers_881");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_920(WebDriver driver,String Faileditems_920) {
		            BrowserActions.type(driver, inpFaileditems_920,Faileditems_920, "Faileditems_920");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_44(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_44,"RunWriter_44");
				    return this;
			}
public WorkQueueInfoPage enterFaileditems_929(WebDriver driver,String Faileditems_929) {
		            BrowserActions.type(driver, inpFaileditems_929,Faileditems_929, "Faileditems_929");
			        return this;
           }
public WorkQueueInfoPage clickStop_82(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_82,"Stop_82");
				    return this;
			}
public WorkQueueInfoPage enterNumberofItems_706(WebDriver driver,String NumberofItems_706) {
		            BrowserActions.type(driver, inpNumberofItems_706,NumberofItems_706, "NumberofItems_706");
			        return this;
           }
public WorkQueueInfoPage enterHostname_781(WebDriver driver,String Hostname_781) {
		            BrowserActions.type(driver, inpHostname_781,Hostname_781, "Hostname_781");
			        return this;
           }
public WorkQueueInfoPage clickStop_238(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_238,"Stop_238");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_465(WebDriver driver,String Succeeded_465) {
		            BrowserActions.type(driver, inpSucceeded_465,Succeeded_465, "Succeeded_465");
			        return this;
           }
public WorkQueueInfoPage enterFailed_622(WebDriver driver,String Failed_622) {
		            BrowserActions.type(driver, inpFailed_622,Failed_622, "Failed_622");
			        return this;
           }
public WorkQueueInfoPage enterAvailable_710(WebDriver driver,String Available_710) {
		            BrowserActions.type(driver, inpAvailable_710,Available_710, "Available_710");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_783(WebDriver driver,String Processeditems_783) {
		            BrowserActions.type(driver, inpProcesseditems_783,Processeditems_783, "Processeditems_783");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_618(WebDriver driver,String ExecutionTime_618) {
		            BrowserActions.type(driver, inpExecutionTime_618,ExecutionTime_618, "ExecutionTime_618");
			        return this;
           }
public WorkQueueInfoPage enterWorkerEndTime_564(WebDriver driver,String WorkerEndTime_564) {
		            BrowserActions.type(driver, inpWorkerEndTime_564,WorkerEndTime_564, "WorkerEndTime_564");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_503(WebDriver driver,String CheckedOut_503) {
		            BrowserActions.type(driver, inpCheckedOut_503,CheckedOut_503, "CheckedOut_503");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_911(WebDriver driver,String Faileditems_911) {
		            BrowserActions.type(driver, inpFaileditems_911,Faileditems_911, "Faileditems_911");
			        return this;
           }
public WorkQueueInfoPage enterEnded_943(WebDriver driver,String Ended_943) {
		            BrowserActions.type(driver, inpEnded_943,Ended_943, "Ended_943");
			        return this;
           }
public WorkQueueInfoPage enterHostname_772(WebDriver driver,String Hostname_772) {
		            BrowserActions.type(driver, inpHostname_772,Hostname_772, "Hostname_772");
			        return this;
           }
public WorkQueueInfoPage enterOrphansreclaimed_938(WebDriver driver,String Orphansreclaimed_938) {
		            BrowserActions.type(driver, inpOrphansreclaimed_938,Orphansreclaimed_938, "Orphansreclaimed_938");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_32(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_32,"RunWriter_32");
				    return this;
			}
public WorkQueueInfoPage enterFailed_609(WebDriver driver,String Failed_609) {
		            BrowserActions.type(driver, inpFailed_609,Failed_609, "Failed_609");
			        return this;
           }
public WorkQueueInfoPage enterNumberofItems_719(WebDriver driver,String NumberofItems_719) {
		            BrowserActions.type(driver, inpNumberofItems_719,NumberofItems_719, "NumberofItems_719");
			        return this;
           }
public WorkQueueInfoPage clickNotify_81(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_81,"Notify_81");
				    return this;
			}
public WorkQueueInfoPage enterExecutorsRunning_269(WebDriver driver,String ExecutorsRunning_269) {
		            BrowserActions.type(driver, inpExecutorsRunning_269,ExecutorsRunning_269, "ExecutorsRunning_269");
			        return this;
           }
public WorkQueueInfoPage clickStop_94(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_94,"Stop_94");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_605(WebDriver driver,String ExecutionTime_605) {
		            BrowserActions.type(driver, inpExecutionTime_605,ExecutionTime_605, "ExecutionTime_605");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_774(WebDriver driver,String Processeditems_774) {
		            BrowserActions.type(driver, inpProcesseditems_774,Processeditems_774, "Processeditems_774");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_452(WebDriver driver,String Succeeded_452) {
		            BrowserActions.type(driver, inpSucceeded_452,Succeeded_452, "Succeeded_452");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_872(WebDriver driver,String MaxNumberofWorkers_872) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_872,MaxNumberofWorkers_872, "MaxNumberofWorkers_872");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_699(WebDriver driver,String Succeeded_699) {
		            BrowserActions.type(driver, inpSucceeded_699,Succeeded_699, "Succeeded_699");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_516(WebDriver driver,String CheckedOut_516) {
		            BrowserActions.type(driver, inpCheckedOut_516,CheckedOut_516, "CheckedOut_516");
			        return this;
           }
public WorkQueueInfoPage enterHostname_763(WebDriver driver,String Hostname_763) {
		            BrowserActions.type(driver, inpHostname_763,Hostname_763, "Hostname_763");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_599(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_599,"ItemCreationTimeDateIcon_599");
				    return this;
			}
public WorkQueueInfoPage clickByExecutors_410(WebDriver driver)  {
					BrowserActions.click(driver, btnByExecutors_410,"ByExecutors_410");
				    return this;
			}
public WorkQueueInfoPage enterWorkerEndTime_577(WebDriver driver,String WorkerEndTime_577) {
		            BrowserActions.type(driver, inpWorkerEndTime_577,WorkerEndTime_577, "WorkerEndTime_577");
			        return this;
           }
public WorkQueueInfoPage enterFailed_635(WebDriver driver,String Failed_635) {
		            BrowserActions.type(driver, inpFailed_635,Failed_635, "Failed_635");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_20(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_20,"RunWriter_20");
				    return this;
			}
public WorkQueueInfoPage clickStop_58(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_58,"Stop_58");
				    return this;
			}
public WorkQueueInfoPage enterStatus_741(WebDriver driver,String Status_741) {
		            BrowserActions.type(driver, inpStatus_741,Status_741, "Status_741");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_245(WebDriver driver,String ExecutorsRunning_245) {
		            BrowserActions.type(driver, inpExecutorsRunning_245,ExecutorsRunning_245, "ExecutorsRunning_245");
			        return this;
           }
public WorkQueueInfoPage enterFailed_4(WebDriver driver,String Failed_4) {
		            BrowserActions.type(driver, inpFailed_4,Failed_4, "Failed_4");
			        return this;
           }
public WorkQueueInfoPage clickNotify_93(WebDriver driver)  {
					BrowserActions.click(driver, btnNotify_93,"Notify_93");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_686(WebDriver driver,String Succeeded_686) {
		            BrowserActions.type(driver, inpSucceeded_686,Succeeded_686, "Succeeded_686");
			        return this;
           }
public WorkQueueInfoPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public WorkQueueInfoPage clickStop_214(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_214,"Stop_214");
				    return this;
			}
public WorkQueueInfoPage enterFailed_400(WebDriver driver,String Failed_400) {
		            BrowserActions.type(driver, inpFailed_400,Failed_400, "Failed_400");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_480(WebDriver driver,String ProcessID_480) {
		            BrowserActions.type(driver, inpProcessID_480,ProcessID_480, "ProcessID_480");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_863(WebDriver driver,String MaxNumberofWorkers_863) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_863,MaxNumberofWorkers_863, "MaxNumberofWorkers_863");
			        return this;
           }
public WorkQueueInfoPage enterCheckedOut_529(WebDriver driver,String CheckedOut_529) {
		            BrowserActions.type(driver, inpCheckedOut_529,CheckedOut_529, "CheckedOut_529");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_439(WebDriver driver,String Succeeded_439) {
		            BrowserActions.type(driver, inpSucceeded_439,Succeeded_439, "Succeeded_439");
			        return this;
           }
public WorkQueueInfoPage enterHostname_754(WebDriver driver,String Hostname_754) {
		            BrowserActions.type(driver, inpHostname_754,Hostname_754, "Hostname_754");
			        return this;
           }
public WorkQueueInfoPage enterProcesseditems_792(WebDriver driver,String Processeditems_792) {
		            BrowserActions.type(driver, inpProcesseditems_792,Processeditems_792, "Processeditems_792");
			        return this;
           }
public WorkQueueInfoPage enterAvailable(WebDriver driver,String Available) {
		            BrowserActions.type(driver, inpAvailable,Available, "Available");
			        return this;
           }
public WorkQueueInfoPage clickItemCreationTimeDateIcon_586(WebDriver driver)  {
					BrowserActions.click(driver, btnItemCreationTimeDateIcon_586,"ItemCreationTimeDateIcon_586");
				    return this;
			}
public WorkQueueInfoPage enterStatus_732(WebDriver driver,String Status_732) {
		            BrowserActions.type(driver, inpStatus_732,Status_732, "Status_732");
			        return this;
           }
public WorkQueueInfoPage enterExecutorsRunning_257(WebDriver driver,String ExecutorsRunning_257) {
		            BrowserActions.type(driver, inpExecutorsRunning_257,ExecutorsRunning_257, "ExecutorsRunning_257");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_939(WebDriver driver,String Faileditems_939) {
		            BrowserActions.type(driver, inpFaileditems_939,Faileditems_939, "Faileditems_939");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_211(WebDriver driver,String WriterStatus_211) {
		            BrowserActions.type(driver, inpWriterStatus_211,WriterStatus_211, "WriterStatus_211");
			        return this;
           }
public WorkQueueInfoPage clickStop_70(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_70,"Stop_70");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_854(WebDriver driver,String MaxNumberofWorkers_854) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_854,MaxNumberofWorkers_854, "MaxNumberofWorkers_854");
			        return this;
           }
public WorkQueueInfoPage clickStop_226(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_226,"Stop_226");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_673(WebDriver driver,String Succeeded_673) {
		            BrowserActions.type(driver, inpSucceeded_673,Succeeded_673, "Succeeded_673");
			        return this;
           }
public WorkQueueInfoPage enterProcessID_493(WebDriver driver,String ProcessID_493) {
		            BrowserActions.type(driver, inpProcessID_493,ProcessID_493, "ProcessID_493");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_240(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_240,"DownloadHistory_240");
				    return this;
			}
public WorkQueueInfoPage clickStop_274(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_274,"Stop_274");
				    return this;
			}
public WorkQueueInfoPage enterWorkQueue_385(WebDriver driver,String WorkQueue_385) {
		            BrowserActions.type(driver, inpWorkQueue_385,WorkQueue_385, "WorkQueue_385");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_223(WebDriver driver,String WriterStatus_223) {
		            BrowserActions.type(driver, inpWriterStatus_223,WriterStatus_223, "WriterStatus_223");
			        return this;
           }
public WorkQueueInfoPage enterStatus_921(WebDriver driver,String Status_921) {
		            BrowserActions.type(driver, inpStatus_921,Status_921, "Status_921");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_145(WebDriver driver,String WorkQueue_145) {
		            BrowserActions.type(driver, inpWorkQueue_145,WorkQueue_145, "WorkQueue_145");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_834(WebDriver driver,String UpFor_834) {
		            BrowserActions.type(driver, inpUpFor_834,UpFor_834, "UpFor_834");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_657(WebDriver driver,String ExecutionTime_657) {
		            BrowserActions.type(driver, inpExecutionTime_657,ExecutionTime_657, "ExecutionTime_657");
			        return this;
           }
public WorkQueueInfoPage clickRunWriter_332(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_332,"RunWriter_332");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_679(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_679,"Scheduled_679");
				    return this;
			}
public WorkQueueInfoPage enterMaxNumberofWorkers_845(WebDriver driver,String MaxNumberofWorkers_845) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_845,MaxNumberofWorkers_845, "MaxNumberofWorkers_845");
			        return this;
           }
public WorkQueueInfoPage enterFailed_268(WebDriver driver,String Failed_268) {
		            BrowserActions.type(driver, inpFailed_268,Failed_268, "Failed_268");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_432(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_432,"Scheduled_432");
				    return this;
			}
public WorkQueueInfoPage clickStop_286(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_286,"Stop_286");
				    return this;
			}
public WorkQueueInfoPage enterWorkQueue_397(WebDriver driver,String WorkQueue_397) {
		            BrowserActions.type(driver, inpWorkQueue_397,WorkQueue_397, "WorkQueue_397");
			        return this;
           }
public WorkQueueInfoPage clickRestart_95(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_95,"Restart_95");
				    return this;
			}
public WorkQueueInfoPage enterStatus_912(WebDriver driver,String Status_912) {
		            BrowserActions.type(driver, inpStatus_912,Status_912, "Status_912");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_235(WebDriver driver,String WriterStatus_235) {
		            BrowserActions.type(driver, inpWriterStatus_235,WriterStatus_235, "WriterStatus_235");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_157(WebDriver driver,String WorkQueue_157) {
		            BrowserActions.type(driver, inpWorkQueue_157,WorkQueue_157, "WorkQueue_157");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_843(WebDriver driver,String UpFor_843) {
		            BrowserActions.type(driver, inpUpFor_843,UpFor_843, "UpFor_843");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_97(WebDriver driver,String WorkQueue_97) {
		            BrowserActions.type(driver, inpWorkQueue_97,WorkQueue_97, "WorkQueue_97");
			        return this;
           }
public WorkQueueInfoPage enterSucceeded_491(WebDriver driver,String Succeeded_491) {
		            BrowserActions.type(driver, inpSucceeded_491,Succeeded_491, "Succeeded_491");
			        return this;
           }
public WorkQueueInfoPage enterFailed_492(WebDriver driver,String Failed_492) {
		            BrowserActions.type(driver, inpFailed_492,Failed_492, "Failed_492");
			        return this;
           }
public WorkQueueInfoPage clickRestart_191(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_191,"Restart_191");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_320(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_320,"RunWriter_320");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_644(WebDriver driver,String ExecutionTime_644) {
		            BrowserActions.type(driver, inpExecutionTime_644,ExecutionTime_644, "ExecutionTime_644");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_836(WebDriver driver,String MaxNumberofWorkers_836) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_836,MaxNumberofWorkers_836, "MaxNumberofWorkers_836");
			        return this;
           }
public WorkQueueInfoPage enterFailed_256(WebDriver driver,String Failed_256) {
		            BrowserActions.type(driver, inpFailed_256,Failed_256, "Failed_256");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_666(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_666,"Scheduled_666");
				    return this;
			}
public WorkQueueInfoPage enterFaileditems_794(WebDriver driver,String Faileditems_794) {
		            BrowserActions.type(driver, inpFaileditems_794,Faileditems_794, "Faileditems_794");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_85(WebDriver driver,String WorkQueue_85) {
		            BrowserActions.type(driver, inpWorkQueue_85,WorkQueue_85, "WorkQueue_85");
			        return this;
           }
public WorkQueueInfoPage clickStop_250(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_250,"Stop_250");
				    return this;
			}
public WorkQueueInfoPage enterAvailable_290(WebDriver driver,String Available_290) {
		            BrowserActions.type(driver, inpAvailable_290,Available_290, "Available_290");
			        return this;
           }
public WorkQueueInfoPage clickRestart_179(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_179,"Restart_179");
				    return this;
			}
public WorkQueueInfoPage clickRestart_83(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_83,"Restart_83");
				    return this;
			}
public WorkQueueInfoPage enterWorkQueue_169(WebDriver driver,String WorkQueue_169) {
		            BrowserActions.type(driver, inpWorkQueue_169,WorkQueue_169, "WorkQueue_169");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_247(WebDriver driver,String WriterStatus_247) {
		            BrowserActions.type(driver, inpWriterStatus_247,WriterStatus_247, "WriterStatus_247");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_631(WebDriver driver,String ExecutionTime_631) {
		            BrowserActions.type(driver, inpExecutionTime_631,ExecutionTime_631, "ExecutionTime_631");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_222(WebDriver driver,String ClusterWideState_222) {
		            BrowserActions.type(driver, inpClusterWideState_222,ClusterWideState_222, "ClusterWideState_222");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_807(WebDriver driver,String UpFor_807) {
		            BrowserActions.type(driver, inpUpFor_807,UpFor_807, "UpFor_807");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_419(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_419,"Scheduled_419");
				    return this;
			}
public WorkQueueInfoPage enterFailed_280(WebDriver driver,String Failed_280) {
		            BrowserActions.type(driver, inpFailed_280,Failed_280, "Failed_280");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_827(WebDriver driver,String MaxNumberofWorkers_827) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_827,MaxNumberofWorkers_827, "MaxNumberofWorkers_827");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_216(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_216,"DownloadHistory_216");
				    return this;
			}
public WorkQueueInfoPage enterClusterWideState(WebDriver driver,String ClusterWideState) {
		            BrowserActions.type(driver, inpClusterWideState,ClusterWideState, "ClusterWideState");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_653(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_653,"Scheduled_653");
				    return this;
			}
public WorkQueueInfoPage enterWorkQueue_73(WebDriver driver,String WorkQueue_73) {
		            BrowserActions.type(driver, inpWorkQueue_73,WorkQueue_73, "WorkQueue_73");
			        return this;
           }
public WorkQueueInfoPage enterHostname_799(WebDriver driver,String Hostname_799) {
		            BrowserActions.type(driver, inpHostname_799,Hostname_799, "Hostname_799");
			        return this;
           }
public WorkQueueInfoPage clickStop_262(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_262,"Stop_262");
				    return this;
			}
public WorkQueueInfoPage clickRestart_71(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_71,"Restart_71");
				    return this;
			}
public WorkQueueInfoPage clickRestart_167(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_167,"Restart_167");
				    return this;
			}
public WorkQueueInfoPage enterWriterStatus_259(WebDriver driver,String WriterStatus_259) {
		            BrowserActions.type(driver, inpWriterStatus_259,WriterStatus_259, "WriterStatus_259");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_825(WebDriver driver,String UpFor_825) {
		            BrowserActions.type(driver, inpUpFor_825,UpFor_825, "UpFor_825");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_818(WebDriver driver,String MaxNumberofWorkers_818) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_818,MaxNumberofWorkers_818, "MaxNumberofWorkers_818");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_816(WebDriver driver,String UpFor_816) {
		            BrowserActions.type(driver, inpUpFor_816,UpFor_816, "UpFor_816");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_210(WebDriver driver,String ClusterWideState_210) {
		            BrowserActions.type(driver, inpClusterWideState_210,ClusterWideState_210, "ClusterWideState_210");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_228(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_228,"DownloadHistory_228");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter_308(WebDriver driver)  {
					BrowserActions.click(driver, btnRunWriter_308,"RunWriter_308");
				    return this;
			}
public WorkQueueInfoPage enterHostname_790(WebDriver driver,String Hostname_790) {
		            BrowserActions.type(driver, inpHostname_790,Hostname_790, "Hostname_790");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_640(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_640,"Scheduled_640");
				    return this;
			}
public WorkQueueInfoPage clickActive_960(WebDriver driver)  {
					BrowserActions.click(driver, rdbActive_960,"Active_960");
				    return this;
			}
public WorkQueueInfoPage enterSucceeded_478(WebDriver driver,String Succeeded_478) {
		            BrowserActions.type(driver, inpSucceeded_478,Succeeded_478, "Succeeded_478");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_61(WebDriver driver,String WorkQueue_61) {
		            BrowserActions.type(driver, inpWorkQueue_61,WorkQueue_61, "WorkQueue_61");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_471(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_471,"Scheduled_471");
				    return this;
			}
public WorkQueueInfoPage enterWorkQueue_181(WebDriver driver,String WorkQueue_181) {
		            BrowserActions.type(driver, inpWorkQueue_181,WorkQueue_181, "WorkQueue_181");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_870(WebDriver driver,String UpFor_870) {
		            BrowserActions.type(driver, inpUpFor_870,UpFor_870, "UpFor_870");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_767(WebDriver driver,String Faileditems_767) {
		            BrowserActions.type(driver, inpFaileditems_767,Faileditems_767, "Faileditems_767");
			        return this;
           }
public WorkQueueInfoPage clickRestart_155(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_155,"Restart_155");
				    return this;
			}
public WorkQueueInfoPage clickRestart_395(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_395,"Restart_395");
				    return this;
			}
public WorkQueueInfoPage verifyActiveThreadsCount(WebDriver driver) {
		            BrowserActions.verifyElementDisplayed(driver, txtActiveThreadsCount, "ActiveThreadsCount");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_696(WebDriver driver,String ExecutionTime_696) {
		            BrowserActions.type(driver, inpExecutionTime_696,ExecutionTime_696, "ExecutionTime_696");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_879(WebDriver driver,String UpFor_879) {
		            BrowserActions.type(driver, inpUpFor_879,UpFor_879, "UpFor_879");
			        return this;
           }
public WorkQueueInfoPage enterItemCreationTime(WebDriver driver,String ItemCreationTime) {
		            BrowserActions.type(driver, inpItemCreationTime,ItemCreationTime, "ItemCreationTime");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_271(WebDriver driver,String WriterStatus_271) {
		            BrowserActions.type(driver, inpWriterStatus_271,WriterStatus_271, "WriterStatus_271");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_809(WebDriver driver,String MaxNumberofWorkers_809) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_809,MaxNumberofWorkers_809, "MaxNumberofWorkers_809");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_246(WebDriver driver,String ClusterWideState_246) {
		            BrowserActions.type(driver, inpClusterWideState_246,ClusterWideState_246, "ClusterWideState_246");
			        return this;
           }
public WorkQueueInfoPage enterMaxNumberofWorkers_800(WebDriver driver,String MaxNumberofWorkers_800) {
		            BrowserActions.type(driver, inpMaxNumberofWorkers_800,MaxNumberofWorkers_800, "MaxNumberofWorkers_800");
			        return this;
           }
public WorkQueueInfoPage enterFailed_466(WebDriver driver,String Failed_466) {
		            BrowserActions.type(driver, inpFailed_466,Failed_466, "Failed_466");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_276(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_276,"DownloadHistory_276");
				    return this;
			}
public WorkQueueInfoPage enterFailed_220(WebDriver driver,String Failed_220) {
		            BrowserActions.type(driver, inpFailed_220,Failed_220, "Failed_220");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_193(WebDriver driver,String WorkQueue_193) {
		            BrowserActions.type(driver, inpWorkQueue_193,WorkQueue_193, "WorkQueue_193");
			        return this;
           }
public WorkQueueInfoPage enterFailed_208(WebDriver driver,String Failed_208) {
		            BrowserActions.type(driver, inpFailed_208,Failed_208, "Failed_208");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_758(WebDriver driver,String Faileditems_758) {
		            BrowserActions.type(driver, inpFaileditems_758,Faileditems_758, "Faileditems_758");
			        return this;
           }
public WorkQueueInfoPage clickActive_945(WebDriver driver)  {
					BrowserActions.click(driver, rdbActive_945,"Active_945");
				    return this;
			}
public WorkQueueInfoPage clickRestart_143(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_143,"Restart_143");
				    return this;
			}
public WorkQueueInfoPage enterUpFor_888(WebDriver driver,String UpFor_888) {
		            BrowserActions.type(driver, inpUpFor_888,UpFor_888, "UpFor_888");
			        return this;
           }
public WorkQueueInfoPage clickRestart_383(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_383,"Restart_383");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_683(WebDriver driver,String ExecutionTime_683) {
		            BrowserActions.type(driver, inpExecutionTime_683,ExecutionTime_683, "ExecutionTime_683");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_234(WebDriver driver,String ClusterWideState_234) {
		            BrowserActions.type(driver, inpClusterWideState_234,ClusterWideState_234, "ClusterWideState_234");
			        return this;
           }
public WorkQueueInfoPage clickWorkerEndTimeDateIcon_591(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkerEndTimeDateIcon_591,"WorkerEndTimeDateIcon_591");
				    return this;
			}
public WorkQueueInfoPage enterWriterStatus_283(WebDriver driver,String WriterStatus_283) {
		            BrowserActions.type(driver, inpWriterStatus_283,WriterStatus_283, "WriterStatus_283");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_449(WebDriver driver,String ExecutionTime_449) {
		            BrowserActions.type(driver, inpExecutionTime_449,ExecutionTime_449, "ExecutionTime_449");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_288(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_288,"DownloadHistory_288");
				    return this;
			}
public WorkQueueInfoPage enterFailed_453(WebDriver driver,String Failed_453) {
		            BrowserActions.type(driver, inpFailed_453,Failed_453, "Failed_453");
			        return this;
           }
public WorkQueueInfoPage enterID(WebDriver driver,String ID) {
		            BrowserActions.type(driver, inpID,ID, "ID");
			        return this;
           }
public WorkQueueInfoPage clickRestart_59(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_59,"Restart_59");
				    return this;
			}
public WorkQueueInfoPage clickRestart_47(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_47,"Restart_47");
				    return this;
			}
public WorkQueueInfoPage clickScheduled_692(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_692,"Scheduled_692");
				    return this;
			}
public WorkQueueInfoPage enterSkippeditems(WebDriver driver,String Skippeditems) {
		            BrowserActions.type(driver, inpSkippeditems,Skippeditems, "Skippeditems");
			        return this;
           }
public WorkQueueInfoPage enterStatus_903(WebDriver driver,String Status_903) {
		            BrowserActions.type(driver, inpStatus_903,Status_903, "Status_903");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_49(WebDriver driver,String WorkQueue_49) {
		            BrowserActions.type(driver, inpWorkQueue_49,WorkQueue_49, "WorkQueue_49");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_270(WebDriver driver,String ClusterWideState_270) {
		            BrowserActions.type(driver, inpClusterWideState_270,ClusterWideState_270, "ClusterWideState_270");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_670(WebDriver driver,String ExecutionTime_670) {
		            BrowserActions.type(driver, inpExecutionTime_670,ExecutionTime_670, "ExecutionTime_670");
			        return this;
           }
public WorkQueueInfoPage enterUpFor_852(WebDriver driver,String UpFor_852) {
		            BrowserActions.type(driver, inpUpFor_852,UpFor_852, "UpFor_852");
			        return this;
           }
public WorkQueueInfoPage clickRestart_131(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_131,"Restart_131");
				    return this;
			}
public WorkQueueInfoPage clickRestart_371(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_371,"Restart_371");
				    return this;
			}
public WorkQueueInfoPage enterExecutionTime_436(WebDriver driver,String ExecutionTime_436) {
		            BrowserActions.type(driver, inpExecutionTime_436,ExecutionTime_436, "ExecutionTime_436");
			        return this;
           }
public WorkQueueInfoPage enterWriterStatus_295(WebDriver driver,String WriterStatus_295) {
		            BrowserActions.type(driver, inpWriterStatus_295,WriterStatus_295, "WriterStatus_295");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_458(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_458,"Scheduled_458");
				    return this;
			}
public WorkQueueInfoPage enterFaileditems_785(WebDriver driver,String Faileditems_785) {
		            BrowserActions.type(driver, inpFaileditems_785,Faileditems_785, "Faileditems_785");
			        return this;
           }
public WorkQueueInfoPage enterFailed_244(WebDriver driver,String Failed_244) {
		            BrowserActions.type(driver, inpFailed_244,Failed_244, "Failed_244");
			        return this;
           }
public WorkQueueInfoPage clickDownloadHistory_252(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_252,"DownloadHistory_252");
				    return this;
			}
public WorkQueueInfoPage clickStop_298(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_298,"Stop_298");
				    return this;
			}
public WorkQueueInfoPage clickByExecutors(WebDriver driver)  {
					BrowserActions.click(driver, btnByExecutors,"ByExecutors");
				    return this;
			}
public WorkQueueInfoPage clickRestart_35(WebDriver driver)  {
					BrowserActions.click(driver, btnRestart_35,"Restart_35");
				    return this;
			}
public WorkQueueInfoPage enterUpFor_861(WebDriver driver,String UpFor_861) {
		            BrowserActions.type(driver, inpUpFor_861,UpFor_861, "UpFor_861");
			        return this;
           }
public WorkQueueInfoPage enterWorkQueue_37(WebDriver driver,String WorkQueue_37) {
		            BrowserActions.type(driver, inpWorkQueue_37,WorkQueue_37, "WorkQueue_37");
			        return this;
           }
public WorkQueueInfoPage enterExecutionTime_423(WebDriver driver,String ExecutionTime_423) {
		            BrowserActions.type(driver, inpExecutionTime_423,ExecutionTime_423, "ExecutionTime_423");
			        return this;
           }
public WorkQueueInfoPage enterClusterWideState_258(WebDriver driver,String ClusterWideState_258) {
		            BrowserActions.type(driver, inpClusterWideState_258,ClusterWideState_258, "ClusterWideState_258");
			        return this;
           }
public WorkQueueInfoPage enterFailed_479(WebDriver driver,String Failed_479) {
		            BrowserActions.type(driver, inpFailed_479,Failed_479, "Failed_479");
			        return this;
           }
public WorkQueueInfoPage enterFaileditems_776(WebDriver driver,String Faileditems_776) {
		            BrowserActions.type(driver, inpFaileditems_776,Faileditems_776, "Faileditems_776");
			        return this;
           }
public WorkQueueInfoPage enterFailed_232(WebDriver driver,String Failed_232) {
		            BrowserActions.type(driver, inpFailed_232,Failed_232, "Failed_232");
			        return this;
           }
public WorkQueueInfoPage clickScheduled_445(WebDriver driver)  {
					BrowserActions.click(driver, rdbScheduled_445,"Scheduled_445");
				    return this;
			}
public WorkQueueInfoPage clickDownloadHistory_264(WebDriver driver)  {
					BrowserActions.click(driver, btnDownloadHistory_264,"DownloadHistory_264");
				    return this;
			}
public WorkQueueInfoPage clickRunWriter(WebDriver driver,String batchProcess) {
	By btnRunWriterBy = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'NotifyCell')]//div[contains(@id,'RunWriter')]");
	BrowserActions.waitForElementToDisplay(driver, btnRunWriterBy, batchProcess);
	WebElement btnRunWriter = btnRunWriterBy.findElement(driver);
	BrowserActions.click(driver, btnRunWriter, " Run Writer");
	Log.messageStep("Clicked on Run Writter",DriverManager.getDriver());
    return this;
}
public WorkQueueInfoPage verifyWorkqueue(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblWorkQueue,"Work queue");
    return this;
}
public WorkQueueInfoPage verifyAvaialble(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblAvailable,"Available");
    return this;
}
public WorkQueueInfoPage verifyCheckedout(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblCheckout,"Checked out");
    return this;
}
public WorkQueueInfoPage verifyFailed(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblFailed,"Failed");
    return this;
}
public WorkQueueInfoPage verifyExecutors(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblExecutors,"Executors");
    return this;
}
public WorkQueueInfoPage verifyClusterWide(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblClusterWide,"ClusterWide");
    return this;
}
public WorkQueueInfoPage verifyWriterStatus(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblWriterStatus,"WriterStatus");
    return this;
}
public WorkQueueInfoPage verifyActions(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblActions,"Actions");
	 Log.messageStep("MaximumPoolSize , PoolSize, ActiveThreadsCount , Refresh, Download , Download raw data , workQueue , Available and Checkout Fields were Displayed ",DriverManager.getDriver());
    return this;
}
public WorkQueueInfoPage verifyAvailableValue(WebDriver driver,String batchProcess) {
	By availableValue = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'numActive_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, availableValue, batchProcess);
	Log.messageStep("Availabel value : " +batchProcess,DriverManager.getDriver());
	return this;
}
public WorkQueueInfoPage verifyCheckedOutValue(WebDriver driver,String batchProcess) {
	By checkedOutValue = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'numCheckedOut_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, checkedOutValue, batchProcess);
	Log.messageStep("Check Out value : " +batchProcess,DriverManager.getDriver());
	return this;
}
public WorkQueueInfoPage verifyFailedValue(WebDriver driver,String batchProcess) {
	By txtFailedBy = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'numFailed_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, txtFailedBy, batchProcess);
	Log.messageStep("Failed value : "+batchProcess,DriverManager.getDriver());
	return this;
}
public WorkQueueInfoPage verifyExecutorsRuningValue(WebDriver driver,String batchProcess) {
	By txtExecutorsRunning = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'numExecutorsActive')]");
	BrowserActions.waitForElementToDisplay(driver, txtExecutorsRunning, batchProcess);
	Log.messageStep("Executor value : "+batchProcess,DriverManager.getDriver());
	return this;
}
public WorkQueueInfoPage verifyClusterWideValue(WebDriver driver,String batchProcess) {
	By txtClusterWide = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'startedClusterWide_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, txtClusterWide, batchProcess);
	Log.messageStep("Cluster value : "+batchProcess,DriverManager.getDriver());
	return this;
}
public WorkQueueInfoPage verifyWriterStatusValue(WebDriver driver,String batchProcess) {
	By txtWriterStatus = By.xpath("//div[text()='"+batchProcess+"']//ancestor::td//following-sibling::td[contains(@id,'WriterStatus_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, txtWriterStatus, batchProcess);
	Log.messageStep("Writer Status value : "+batchProcess,DriverManager.getDriver());
	return this;
}
public WorkQueueInfoPage verifyProcessIdValue(WebDriver driver) {
	String text=txtProcessId.getText();
	Log.messageStep("Process Id  : " +text,driver);
	return this;
}
public WorkQueueInfoPage verifyItemCreationValue(WebDriver driver) {
	String text=txtItemCreationTime.getText();
	Log.messageStep("Item Creation Time  : " +text, driver);
	return this;
}
public WorkQueueInfoPage verifyNumberOfItemsValue(WebDriver driver) {
	String text=txtNumberofItems.getText();
	Log.messageStep("Number of  Items  : " +text, driver);
	return this;
}
public WorkQueueInfoPage verifyHostName(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, fldHostname,"Hostname");
	return this;
}
public WorkQueueInfoPage verifyMaxNumberOfWorkers(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, fldMaxNumberOfWorkers,"Maximum number of workers");
	return this;
}
public WorkQueueInfoPage verifyProcessedItems(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, fldProcessedItems,"Processed items");
	return this;
}
public WorkQueueInfoPage verifyExceptions(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, fldExceptions,"Exceptions");
	return this;
}
public WorkQueueInfoPage verifyStarted(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, fldStarted,"Started");
	return this;
}
public WorkQueueInfoPage verifyUpFor(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, fldUpTime,"Up For");
	return this;
}
public WorkQueueInfoPage verifyStatusRunning(WebDriver driver,String Status) {
	BrowserActions.verifyElementTextIsDisplayed(driver, txtStatus,Status,true, "Running");
	return this;
}
public WorkQueueInfoPage verifyStatusStopped(WebDriver driver,String Status) {
	BrowserActions.verifyElementTextIsDisplayed(driver, txtStatus,Status,true, "Stopped");
	return this;
}
}

