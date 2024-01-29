package com.aspire.guidewire.pc.pages.commercialauto;
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

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_15;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numActive']", AI = false)
	public WebElement inpAvailable_350;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-RestartWorkers", AI = false)
	public WebElement btnRestart_119;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numActive']", AI = false)
	public WebElement inpAvailable_110;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-RestartWorkers", AI = false)
	public WebElement btnRestart_359;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_862;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkItemsByWriterTab", AI = false)
	public WebElement btnByWriters;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-RestartWorkers", AI = false)
	public WebElement btnRestart_599;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-numActive']", AI = false)
	public WebElement inpAvailable_590;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-UpTime']", AI = false)
	public WebElement inpUpFor_795;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_135;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_301;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_375;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_541;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_830;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_516;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-RunWriter", AI = false)
	public WebElement btnRunWriter_176;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_839;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-StartedTime']", AI = false)
	public WebElement inpStarted_676;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numFailed']", AI = false)
	public WebElement inpFailed_28;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_606;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_27;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-RestartWorkers", AI = false)
	public WebElement btnRestart_107;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-RestartWorkers", AI = false)
	public WebElement btnRestart_347;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-RestartWorkers", AI = false)
	public WebElement btnRestart_587;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_147;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_313;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_387;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_553;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_1;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-Notify", AI = false)
	public WebElement btnNotify_501;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_528;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV_tb-download>div[role='button']", AI = false)
	public WebElement btnDownload;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-StopWorkers", AI = false)
	public WebElement btnStop;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-RunWriter", AI = false)
	public WebElement btnRunWriter_164;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_848;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-StartedTime']", AI = false)
	public WebElement inpStarted_667;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_509;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_39;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numActive']", AI = false)
	public WebElement inpAvailable_14;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-RestartWorkers", AI = false)
	public WebElement btnRestart_335;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_159;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-StartedTime']", AI = false)
	public WebElement inpStarted_658;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-RestartWorkers", AI = false)
	public WebElement btnRestart_575;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-RunWriter", AI = false)
	public WebElement btnRunWriter_392;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_399;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_565;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-UpTime']", AI = false)
	public WebElement inpUpFor_777;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_325;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-RunWriter", AI = false)
	public WebElement btnRunWriter_152;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_812;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-numActive']", AI = false)
	public WebElement inpAvailable_578;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numActive']", AI = false)
	public WebElement inpAvailable_338;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_655;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-RestartWorkers", AI = false)
	public WebElement btnRestart_323;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-RunWriter", AI = false)
	public WebElement btnRunWriter_380;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_577;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-RestartWorkers", AI = false)
	public WebElement btnRestart_563;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-UpTime']", AI = false)
	public WebElement inpUpFor_786;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_337;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_171;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_504;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_821;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-RunWriter", AI = false)
	public WebElement btnRunWriter_140;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-numActive']", AI = false)
	public WebElement inpAvailable_566;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numActive']", AI = false)
	public WebElement inpAvailable_326;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_618;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numFailed']", AI = false)
	public WebElement inpFailed_16;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numFailed']", AI = false)
	public WebElement inpFailed;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_664;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-RestartWorkers", AI = false)
	public WebElement btnRestart_311;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-RestartWorkers", AI = false)
	public WebElement btnRestart_551;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_349;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-Notify", AI = false)
	public WebElement btnNotify_537;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_589;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_183;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numFailed']", AI = false)
	public WebElement inpFailed_184;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_109;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_402;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_642;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_51;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numActive']", AI = false)
	public WebElement inpAvailable_158;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_312;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_552;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numActive']", AI = false)
	public WebElement inpAvailable_398;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_673;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_630;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numFailed']", AI = false)
	public WebElement inpFailed_172;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numActive']", AI = false)
	public WebElement inpAvailable_146;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_324;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_803;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-StartedTime']", AI = false)
	public WebElement inpStarted_865;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_63;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_564;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-RunWriter", AI = false)
	public WebElement btnRunWriter_128;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numActive']", AI = false)
	public WebElement inpAvailable_386;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-RunWriter", AI = false)
	public WebElement btnRunWriter_368;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-RestartWorkers", AI = false)
	public WebElement btnRestart_539;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_682;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numActive']", AI = false)
	public WebElement inpAvailable_374;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_121;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_361;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-StartedTime']", AI = false)
	public WebElement inpStarted_856;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_195;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-Notify", AI = false)
	public WebElement btnNotify_513;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-RunWriter", AI = false)
	public WebElement btnRunWriter_356;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-RunWriter", AI = false)
	public WebElement btnRunWriter_596;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_75;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numActive']", AI = false)
	public WebElement inpAvailable_134;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_426;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_691;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-RunWriter", AI = false)
	public WebElement btnRunWriter_116;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-RestartWorkers", AI = false)
	public WebElement btnRestart_527;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numActive']", AI = false)
	public WebElement inpAvailable_362;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_133;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-StartedTime']", AI = false)
	public WebElement inpStarted_847;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_373;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-Notify", AI = false)
	public WebElement btnNotify_525;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-RunWriter", AI = false)
	public WebElement btnRunWriter_344;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numFailed']", AI = false)
	public WebElement inpFailed_196;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-RunWriter", AI = false)
	public WebElement btnRunWriter_584;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_414;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numActive']", AI = false)
	public WebElement inpAvailable_122;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_300;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_87;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_540;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-RunWriter", AI = false)
	public WebElement btnRunWriter_104;

	@IFindBy(how = How.CSS, using = "div[id$='WorkQueueInfoScreen-WorkQueueInfoLV-0-RunWriter']", AI = false)
	public WebElement btnRunWriter;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-RestartWorkers", AI = false)
	public WebElement btnRestart_515;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-StartedTime']", AI = false)
	public WebElement inpStarted_838;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-Notify", AI = false)
	public WebElement btnNotify_573;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-RunWriter", AI = false)
	public WebElement btnRunWriter_80;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_341;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_531;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-Notify", AI = false)
	public WebElement btnNotify_333;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_581;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_101;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_677;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-numActive']", AI = false)
	public WebElement inpAvailable_518;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numActive']", AI = false)
	public WebElement inpAvailable_86;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_744;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-StartedTime']", AI = false)
	public WebElement inpStarted_829;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-RestartWorkers", AI = false)
	public WebElement btnRestart_503;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_303;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-Notify", AI = false)
	public WebElement btnNotify_345;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_543;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_593;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-Notify", AI = false)
	public WebElement btnNotify_585;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-Notify", AI = false)
	public WebElement btnNotify_105;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_353;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_695;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_113;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_686;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkItemExceptionCV-WorkItemExceptionCardTab", AI = false)
	public WebElement btnError;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-numActive']", AI = false)
	public WebElement inpAvailable_506;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-StartedTime']", AI = false)
	public WebElement inpStarted_820;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_3;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_735;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numActive']", AI = false)
	public WebElement inpAvailable_74;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numActive']", AI = false)
	public WebElement inpAvailable_98;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_315;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_555;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-RunWriter", AI = false)
	public WebElement btnRunWriter_68;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-Notify", AI = false)
	public WebElement btnNotify_309;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_557;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_808;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-Notify", AI = false)
	public WebElement btnNotify_549;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_317;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_659;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-StartedTime']", AI = false)
	public WebElement inpStarted_811;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_762;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_327;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-Notify", AI = false)
	public WebElement btnNotify_561;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_567;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-StartedTime']", AI = false)
	public WebElement inpStarted_802;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-Notify", AI = false)
	public WebElement btnNotify_321;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-RunWriter", AI = false)
	public WebElement btnRunWriter_56;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_817;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_569;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_668;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_329;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_753;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_339;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_579;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numActive']", AI = false)
	public WebElement inpAvailable_38;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_18;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_826;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-Status']", AI = false)
	public WebElement inpStatus_684;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-Hostname']", AI = false)
	public WebElement inpHostname_823;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkQueueWorkItemsLV-Filter']", AI = false)
	public WebElement drpFilter_871;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_533;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_505;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_708;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-StopWorkers", AI = false)
	public WebElement btnStop_514;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numActive']", AI = false)
	public WebElement inpAvailable_314;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-numActive']", AI = false)
	public WebElement inpAvailable_554;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-Notify", AI = false)
	public WebElement btnNotify_381;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numActive']", AI = false)
	public WebElement inpAvailable_26;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-Notify", AI = false)
	public WebElement btnNotify_141;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_835;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-Status']", AI = false)
	public WebElement inpStatus_675;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-Hostname']", AI = false)
	public WebElement inpHostname_814;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_305;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_517;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_545;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-StopWorkers", AI = false)
	public WebElement btnStop_526;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numActive']", AI = false)
	public WebElement inpAvailable_302;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-RunWriter", AI = false)
	public WebElement btnRunWriter_8;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-numActive']", AI = false)
	public WebElement inpAvailable_542;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_844;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-Notify", AI = false)
	public WebElement btnNotify_357;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_111;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-Notify", AI = false)
	public WebElement btnNotify_597;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-Hostname']", AI = false)
	public WebElement inpHostname_805;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_351;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_521;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-Notify", AI = false)
	public WebElement btnNotify_117;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_591;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_529;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_726;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_30;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_857;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numActive']", AI = false)
	public WebElement inpAvailable_62;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-numActive']", AI = false)
	public WebElement inpAvailable_530;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-RunWriter", AI = false)
	public WebElement btnRunWriter_92;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_853;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_123;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-Notify", AI = false)
	public WebElement btnNotify_129;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_363;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-Notify", AI = false)
	public WebElement btnNotify_369;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-Status']", AI = false)
	public WebElement inpStatus_693;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_717;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-RunWriter", AI = false)
	public WebElement btnRunWriter_188;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_866;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-StopWorkers", AI = false)
	public WebElement btnStop_502;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-Notify", AI = false)
	public WebElement btnNotify_21;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numActive']", AI = false)
	public WebElement inpAvailable_50;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-StopWorkers", AI = false)
	public WebElement btnStop_550;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-Notify", AI = false)
	public WebElement btnNotify_297;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-FailedCount']", AI = false)
	public WebElement inpFaileditems_845;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-RunWriter", AI = false)
	public WebElement btnRunWriter_608;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_185;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_174;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_54;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-numFailed']", AI = false)
	public WebElement inpFailed_544;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-StopWorkers", AI = false)
	public WebElement btnStop_310;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_690;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-FailedCount']", AI = false)
	public WebElement inpFaileditems_836;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-Hostname']", AI = false)
	public WebElement inpHostname_850;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_511;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_197;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-Hostname']", AI = false)
	public WebElement inpHostname_859;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_162;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_42;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-numFailed']", AI = false)
	public WebElement inpFailed_532;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-StopWorkers", AI = false)
	public WebElement btnStop_322;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_699;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_797;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-StopWorkers", AI = false)
	public WebElement btnStop_562;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-Hostname']", AI = false)
	public WebElement inpHostname_841;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_180;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_161;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-Notify", AI = false)
	public WebElement btnNotify_273;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-numFailed']", AI = false)
	public WebElement inpFailed_316;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_24;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_78;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_523;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-Status']", AI = false)
	public WebElement inpStatus_666;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-StopWorkers", AI = false)
	public WebElement btnStop_538;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_788;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-FailedCount']", AI = false)
	public WebElement inpFaileditems_863;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_770;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-Hostname']", AI = false)
	public WebElement inpHostname_832;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_603;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_192;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_535;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-numFailed']", AI = false)
	public WebElement inpFailed_304;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-FailedCount']", AI = false)
	public WebElement inpFaileditems_854;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-Notify", AI = false)
	public WebElement btnNotify_285;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_12;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_173;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-Status']", AI = false)
	public WebElement inpStatus_657;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_66;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_186;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-numFailed']", AI = false)
	public WebElement inpFailed_556;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_779;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_615;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_761;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_547;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_307;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-Hostname']", AI = false)
	public WebElement inpHostname_661;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-FailedCount']", AI = false)
	public WebElement inpFaileditems_800;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-Status']", AI = false)
	public WebElement inpStatus_846;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-FailedCount']", AI = false)
	public WebElement inpFaileditems_809;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_389;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_137;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-RestartWorkers", AI = false)
	public WebElement btnRestart;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-StopWorkers", AI = false)
	public WebElement btnStop_118;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-StopWorkers", AI = false)
	public WebElement btnStop_358;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_663;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_90;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-StopWorkers", AI = false)
	public WebElement btnStop_598;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_319;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_627;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkItemExceptionCV-WorkItemExceptionDV-Exception']", AI = false)
	public WebElement inpException;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-Hostname']", AI = false)
	public WebElement inpHostname_652;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-Status']", AI = false)
	public WebElement inpStatus_837;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_559;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-maximumPoolSize']", AI = false)
	public WebElement inpMaximumPoolSize;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_149;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_198;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_654;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkItemsByWriterTab", AI = false)
	public WebElement btnByWriters_649;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_752;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_639;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-FailedCount']", AI = false)
	public WebElement inpFaileditems_827;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_681;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-Status']", AI = false)
	public WebElement inpStatus_864;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_125;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_365;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-ExceptionsCount']", AI = false)
	public WebElement inpExceptions;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-numFailed']", AI = false)
	public WebElement inpFailed_520;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-StopWorkers", AI = false)
	public WebElement btnStop_334;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-StopWorkers", AI = false)
	public WebElement btnStop_574;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_743;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-numFailed']", AI = false)
	public WebElement inpFailed_508;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_672;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-Status']", AI = false)
	public WebElement inpStatus_855;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_377;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_571;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_331;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-FailedCount']", AI = false)
	public WebElement inpFaileditems_818;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-StopWorkers", AI = false)
	public WebElement btnStop_106;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_734;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-StopWorkers", AI = false)
	public WebElement btnStop_346;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-StopWorkers", AI = false)
	public WebElement btnStop_586;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-StopWorkers", AI = false)
	public WebElement btnStop_154;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-numActive']", AI = false)
	public WebElement inpAvailable_194;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_360;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-StopWorkers", AI = false)
	public WebElement btnStop_394;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_265;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-Status']", AI = false)
	public WebElement inpStatus_801;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_103;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_570;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_583;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-UpTime']", AI = false)
	public WebElement inpUpFor_714;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_343;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-RunWriter", AI = false)
	public WebElement btnRunWriter_212;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-UpTime']", AI = false)
	public WebElement inpUpFor_705;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-RunWriter", AI = false)
	public WebElement btnRunWriter_452;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-numFailed']", AI = false)
	public WebElement inpFailed_148;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-numFailed']", AI = false)
	public WebElement inpFailed_388;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_725;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_99;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-FailedCount']", AI = false)
	public WebElement inpFaileditems_683;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_372;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-numActive']", AI = false)
	public WebElement inpAvailable_182;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-Hostname']", AI = false)
	public WebElement inpHostname_697;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_355;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_115;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_277;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-UpTime']", AI = false)
	public WebElement inpUpFor_723;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_595;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-RunWriter", AI = false)
	public WebElement btnRunWriter_200;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-RunWriter", AI = false)
	public WebElement btnRunWriter_440;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_716;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_318;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-FailedCount']", AI = false)
	public WebElement inpFaileditems_674;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-numFailed']", AI = false)
	public WebElement inpFailed_136;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_558;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-numFailed']", AI = false)
	public WebElement inpFailed_376;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_120;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-StopWorkers", AI = false)
	public WebElement btnStop_166;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-StopWorkers", AI = false)
	public WebElement btnStop_130;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-numActive']", AI = false)
	public WebElement inpAvailable_170;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-Hostname']", AI = false)
	public WebElement inpHostname_688;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-Status']", AI = false)
	public WebElement inpStatus_828;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-StopWorkers", AI = false)
	public WebElement btnStop_370;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-RestartWorkers", AI = false)
	public WebElement btnRestart_299;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_367;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_289;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_127;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_102;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-numFailed']", AI = false)
	public WebElement inpFailed_160;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_342;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numFailed']", AI = false)
	public WebElement inpFailed_88;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_707;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_336;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_576;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-Hostname']", AI = false)
	public WebElement inpHostname_679;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-StopWorkers", AI = false)
	public WebElement btnStop_142;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-Status']", AI = false)
	public WebElement inpStatus_819;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-StopWorkers", AI = false)
	public WebElement btnStop_382;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_139;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-RestartWorkers", AI = false)
	public WebElement btnRestart_287;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_379;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-Status']", AI = false)
	public WebElement inpStatus_810;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_582;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_330;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_108;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_348;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_588;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-Hostname']", AI = false)
	public WebElement inpHostname_670;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-RunWriter", AI = false)
	public WebElement btnRunWriter_428;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-FailedCount']", AI = false)
	public WebElement inpFaileditems_692;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-UpTime']", AI = false)
	public WebElement inpUpFor_750;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-StopWorkers", AI = false)
	public WebElement btnStop_190;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-RestartWorkers", AI = false)
	public WebElement btnRestart_275;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-UpTime']", AI = false)
	public WebElement inpUpFor_759;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_366;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_391;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-49-numFailed']", AI = false)
	public WebElement inpFailed_580;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_151;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numFailed']", AI = false)
	public WebElement inpFailed_64;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_126;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-RunWriter", AI = false)
	public WebElement btnRunWriter_416;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-numFailed']", AI = false)
	public WebElement inpFailed_100;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_156;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-29-numFailed']", AI = false)
	public WebElement inpFailed_340;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_396;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-numFailed']", AI = false)
	public WebElement inpFailed_328;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-numFailed']", AI = false)
	public WebElement inpFailed_568;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-Notify", AI = false)
	public WebElement btnNotify_9;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-RestartWorkers", AI = false)
	public WebElement btnRestart_263;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-UpTime']", AI = false)
	public WebElement inpUpFor_768;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_354;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_163;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_594;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numFailed']", AI = false)
	public WebElement inpFailed_76;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_114;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_168;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-RunWriter", AI = false)
	public WebElement btnRunWriter_404;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-RunWriter", AI = false)
	public WebElement btnRunWriter_644;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_390;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-UpTime']", AI = false)
	public WebElement inpUpFor_732;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-RestartWorkers", AI = false)
	public WebElement btnRestart_251;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_150;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-RestartWorkers", AI = false)
	public WebElement btnRestart_491;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numFailed']", AI = false)
	public WebElement inpFailed_40;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_5;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-FailedCount']", AI = false)
	public WebElement inpFaileditems_665;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-numFailed']", AI = false)
	public WebElement inpFailed_124;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-numFailed']", AI = false)
	public WebElement inpFailed_364;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_132;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-StopWorkers", AI = false)
	public WebElement btnStop_178;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-RunWriter", AI = false)
	public WebElement btnRunWriter_632;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-FailedCount']", AI = false)
	public WebElement inpFaileditems_656;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-UpTime']", AI = false)
	public WebElement inpUpFor_741;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_175;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-numFailed']", AI = false)
	public WebElement inpFailed_592;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-RunWriter", AI = false)
	public WebElement btnRunWriter_620;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_138;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numFailed']", AI = false)
	public WebElement inpFailed_52;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_378;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-10-numFailed']", AI = false)
	public WebElement inpFailed_112;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_144;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-30-numFailed']", AI = false)
	public WebElement inpFailed_352;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_384;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-TasksTab", AI = false)
	public WebElement btnByTasks;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-numActive']", AI = false)
	public WebElement inpAvailable_470;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-Status']", AI = false)
	public WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-RestartWorkers", AI = false)
	public WebElement btnRestart_23;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-RestartWorkers", AI = false)
	public WebElement btnRestart_239;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numActive']", AI = false)
	public WebElement inpAvailable_230;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-RestartWorkers", AI = false)
	public WebElement btnRestart_479;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_65;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_745;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_25;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_255;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_421;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-UpTime']", AI = false)
	public WebElement inpUpFor_678;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_495;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_187;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-RunWriter", AI = false)
	public WebElement btnRunWriter_296;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_617;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_636;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-Notify", AI = false)
	public WebElement btnNotify_609;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_713;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV_tb-downloadRawData>div[role='button']", AI = false)
	public WebElement btnDownloadRawData;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-StartedTime']", AI = false)
	public WebElement inpStarted_793;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numActive']", AI = false)
	public WebElement inpAvailable_2;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_53;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-RestartWorkers", AI = false)
	public WebElement btnRestart_11;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-RestartWorkers", AI = false)
	public WebElement btnRestart_227;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-RestartWorkers", AI = false)
	public WebElement btnRestart_467;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_754;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_267;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_433;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-Notify", AI = false)
	public WebElement btnNotify_621;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-UpTime']", AI = false)
	public WebElement inpUpFor_687;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_13;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-PrintHistory", AI = false)
	public WebElement btnDownloadHistory;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_199;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_408;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_648;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_722;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-RunWriter", AI = false)
	public WebElement btnRunWriter_284;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_629;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-StartedTime']", AI = false)
	public WebElement inpStarted_784;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_41;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_763;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-RestartWorkers", AI = false)
	public WebElement btnRestart_215;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-RestartWorkers", AI = false)
	public WebElement btnRestart_455;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_279;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_445;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_205;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numActive']", AI = false)
	public WebElement inpAvailable_218;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-RunWriter", AI = false)
	public WebElement btnRunWriter_272;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_612;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_807;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-numActive']", AI = false)
	public WebElement inpAvailable_458;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-StartedTime']", AI = false)
	public WebElement inpStarted_775;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_772;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-UpTime']", AI = false)
	public WebElement inpUpFor_660;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-RestartWorkers", AI = false)
	public WebElement btnRestart_203;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-RestartWorkers", AI = false)
	public WebElement btnRestart_443;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-RunWriter", AI = false)
	public WebElement btnRunWriter_260;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_217;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-UpTime']", AI = false)
	public WebElement inpUpFor_669;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_457;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_291;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_605;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_624;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-Hostname']", AI = false)
	public WebElement inpHostname;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-numActive']", AI = false)
	public WebElement inpAvailable_446;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_704;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-StartedTime']", AI = false)
	public WebElement inpStarted_766;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numActive']", AI = false)
	public WebElement inpAvailable_206;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_781;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-StartedTime']", AI = false)
	public WebElement inpStarted_757;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-RestartWorkers", AI = false)
	public WebElement btnRestart_431;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_229;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_469;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkQueueWorkItemsLV-Filter']", AI = false)
	public WebElement drpFilter;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_522;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numActive']", AI = false)
	public WebElement inpAvailable_278;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_432;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_790;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-StartedTime']", AI = false)
	public WebElement inpStarted_748;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_799;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-RunWriter", AI = false)
	public WebElement btnRunWriter_488;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numFailed']", AI = false)
	public WebElement inpFailed_292;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-Notify", AI = false)
	public WebElement btnNotify_417;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_510;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_204;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numActive']", AI = false)
	public WebElement inpAvailable_266;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_444;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-RunWriter", AI = false)
	public WebElement btnRunWriter_248;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_481;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-numActive']", AI = false)
	public WebElement inpAvailable_494;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-StartedTime']", AI = false)
	public WebElement inpStarted_739;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_89;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_19;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_241;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-UpTime']", AI = false)
	public WebElement inpUpFor_696;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-Notify", AI = false)
	public WebElement btnNotify_633;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-RunWriter", AI = false)
	public WebElement btnRunWriter_476;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_546;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_306;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numActive']", AI = false)
	public WebElement inpAvailable_254;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-StartedTime']", AI = false)
	public WebElement inpStarted_730;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-RunWriter", AI = false)
	public WebElement btnRunWriter_236;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-RestartWorkers", AI = false)
	public WebElement btnRestart_419;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-RestartWorkers", AI = false)
	public WebElement btnRestart_407;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-numActive']", AI = false)
	public WebElement inpAvailable_482;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-RestartWorkers", AI = false)
	public WebElement btnRestart_647;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numActive']", AI = false)
	public WebElement inpAvailable_242;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_253;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_77;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_493;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-Notify", AI = false)
	public WebElement btnNotify_405;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-Notify", AI = false)
	public WebElement btnNotify_645;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-RunWriter", AI = false)
	public WebElement btnRunWriter_224;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-RunWriter", AI = false)
	public WebElement btnRunWriter_464;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_534;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-StartedTime']", AI = false)
	public WebElement inpStarted_721;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_420;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-RestartWorkers", AI = false)
	public WebElement btnRestart_635;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-Notify", AI = false)
	public WebElement btnNotify_213;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_411;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_461;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-StopWorkers", AI = false)
	public WebElement btnStop_34;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-Notify", AI = false)
	public WebElement btnNotify_453;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsLDV-WorkQueueWorkItemsLV_tb-WorkItem_Restart>div[role='button']", AI = false)
	public WebElement btnRestart_870;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_221;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV_tb-refresh>div[role='button']", AI = false)
	public WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_84;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-numActive']", AI = false)
	public WebElement inpAvailable_638;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-StartedTime']", AI = false)
	public WebElement inpStarted_712;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_6;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_861;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_31;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-RestartWorkers", AI = false)
	public WebElement btnRestart_623;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-StartedTime']", AI = false)
	public WebElement inpStarted_703;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_423;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-Notify", AI = false)
	public WebElement btnNotify_225;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_473;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-StopWorkers", AI = false)
	public WebElement btnStop_46;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-Notify", AI = false)
	public WebElement btnNotify_465;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_233;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_72;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-numActive']", AI = false)
	public WebElement inpAvailable_626;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_852;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-RestartWorkers", AI = false)
	public WebElement btnRestart_611;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_435;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-StopWorkers", AI = false)
	public WebElement btnStop_10;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-UpTime']", AI = false)
	public WebElement inpUpFor;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_601;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_437;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_776;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-Notify", AI = false)
	public WebElement btnNotify_429;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-numActive']", AI = false)
	public WebElement inpAvailable_614;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-WriterStatus']", AI = false)
	public WebElement inpWriterStatus;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_55;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_207;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-TaskFilter']", AI = false)
	public WebElement drpTasks;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-Notify", AI = false)
	public WebElement btnNotify_441;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_447;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-StopWorkers", AI = false)
	public WebElement btnStop_22;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-Notify", AI = false)
	public WebElement btnNotify_201;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_613;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_794;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_785;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_96;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_449;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_209;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-numActive']", AI = false)
	public WebElement inpAvailable_602;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_43;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_79;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_219;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_459;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_700;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_48;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-Hostname']", AI = false)
	public WebElement inpHostname_706;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_625;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_29;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_709;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_413;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_825;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_758;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-numActive']", AI = false)
	public WebElement inpAvailable_434;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-StopWorkers", AI = false)
	public WebElement btnStop_634;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_67;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-Notify", AI = false)
	public WebElement btnNotify_261;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_17;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_36;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_718;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_425;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-Status']", AI = false)
	public WebElement inpStatus_792;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_816;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_637;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_767;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-StopWorkers", AI = false)
	public WebElement btnStop_406;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-50-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_600;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-StopWorkers", AI = false)
	public WebElement btnStop_646;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-numActive']", AI = false)
	public WebElement inpAvailable_422;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_607;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-Notify", AI = false)
	public WebElement btnNotify_477;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_231;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_641;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_727;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-Notify", AI = false)
	public WebElement btnNotify_237;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_471;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_409;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_60;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_731;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_91;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-StopWorkers", AI = false)
	public WebElement btnStop_610;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-numActive']", AI = false)
	public WebElement inpAvailable_410;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_843;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_619;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-Notify", AI = false)
	public WebElement btnNotify_489;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-ExceptionsCount']", AI = false)
	public WebElement inpExceptions_736;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_243;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_483;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-Notify", AI = false)
	public WebElement btnNotify_249;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_740;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_401;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-StartedTime_dateIcon", AI = false)
	public WebElement btnStartedDateIcon_749;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-StopWorkers", AI = false)
	public WebElement btnStop_622;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_7;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_834;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_698;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-FailedCount']", AI = false)
	public WebElement inpFaileditems_728;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-Hostname']", AI = false)
	public WebElement inpHostname_742;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-Notify", AI = false)
	public WebElement btnNotify_177;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_680;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-Status']", AI = false)
	public WebElement inpStatus_765;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_294;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-Notify", AI = false)
	public WebElement btnNotify_33;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_689;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-numFailed']", AI = false)
	public WebElement inpFailed_424;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-StopWorkers", AI = false)
	public WebElement btnStop_430;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-3-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_671;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-Hostname']", AI = false)
	public WebElement inpHostname_733;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_631;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-Status']", AI = false)
	public WebElement inpStatus_756;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-Notify", AI = false)
	public WebElement btnNotify_189;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-FailedCount']", AI = false)
	public WebElement inpFaileditems_719;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_282;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-numFailed']", AI = false)
	public WebElement inpFailed_412;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsTab", AI = false)
	public WebElement btnByExecutors_650;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-StartedTime']", AI = false)
	public WebElement inpStarted;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-Notify", AI = false)
	public WebElement btnNotify_45;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-FailedCount']", AI = false)
	public WebElement inpFaileditems_710;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-StopWorkers", AI = false)
	public WebElement btnStop_202;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-StopWorkers", AI = false)
	public WebElement btnStop_442;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-Notify", AI = false)
	public WebElement btnNotify_393;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-2-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_662;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_403;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-FailedCount']", AI = false)
	public WebElement inpFaileditems_746;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-numFailed']", AI = false)
	public WebElement inpFailed_436;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-Notify", AI = false)
	public WebElement btnNotify_153;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_281;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-poolSize']", AI = false)
	public WebElement inpPoolSize;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_643;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-Hostname']", AI = false)
	public WebElement inpHostname_724;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-Status']", AI = false)
	public WebElement inpStatus_783;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-Notify", AI = false)
	public WebElement btnNotify;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-StopWorkers", AI = false)
	public WebElement btnStop_418;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-0-FailedCount']", AI = false)
	public WebElement inpFaileditems;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-Notify", AI = false)
	public WebElement btnNotify_57;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-FailedCount']", AI = false)
	public WebElement inpFaileditems_737;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-Notify", AI = false)
	public WebElement btnNotify_165;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-35-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_415;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_293;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-Hostname']", AI = false)
	public WebElement inpHostname_715;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-Status']", AI = false)
	public WebElement inpStatus_774;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsTab", AI = false)
	public WebElement btnWorkitems_651;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueWorkItemsTab", AI = false)
	public WebElement btnWorkitems;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-1-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_653;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-Notify", AI = false)
	public WebElement btnNotify_69;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-52-numFailed']", AI = false)
	public WebElement inpFailed_616;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-Hostname']", AI = false)
	public WebElement inpHostname_787;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-9-Status']", AI = false)
	public WebElement inpStatus_729;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-36-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_427;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_780;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-8-Status']", AI = false)
	public WebElement inpStatus_720;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-RunWriter", AI = false)
	public WebElement btnRunWriter_44;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-StopWorkers", AI = false)
	public WebElement btnStop_82;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-StopWorkers", AI = false)
	public WebElement btnStop_238;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-StopWorkers", AI = false)
	public WebElement btnStop_478;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_789;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_507;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-Hostname']", AI = false)
	public WebElement inpHostname_778;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-51-numFailed']", AI = false)
	public WebElement inpFailed_604;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_771;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_439;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-7-Status']", AI = false)
	public WebElement inpStatus_711;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-RunWriter", AI = false)
	public WebElement btnRunWriter_32;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-Notify", AI = false)
	public WebElement btnNotify_81;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_269;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-StopWorkers", AI = false)
	public WebElement btnStop_94;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_860;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-FailedCount']", AI = false)
	public WebElement inpFaileditems_701;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-11-Status']", AI = false)
	public WebElement inpStatus_747;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-Hostname']", AI = false)
	public WebElement inpHostname_760;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-2-RunWriter", AI = false)
	public WebElement btnRunWriter_20;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-StopWorkers", AI = false)
	public WebElement btnStop_58;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_485;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-Hostname']", AI = false)
	public WebElement inpHostname_769;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_245;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-1-numFailed']", AI = false)
	public WebElement inpFailed_4;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-Notify", AI = false)
	public WebElement btnNotify_93;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-StopWorkers", AI = false)
	public WebElement btnStop_214;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-numFailed']", AI = false)
	public WebElement inpFailed_400;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-StopWorkers", AI = false)
	public WebElement btnStop_454;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-54-numFailed']", AI = false)
	public WebElement inpFailed_640;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-numCheckedOut']", AI = false)
	public WebElement inpCheckedOut_519;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-53-numFailed']", AI = false)
	public WebElement inpFailed_628;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-10-Status']", AI = false)
	public WebElement inpStatus_738;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-Hostname']", AI = false)
	public WebElement inpHostname_751;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-numActive']", AI = false)
	public WebElement inpAvailable;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_451;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_257;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_211;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-numExecutorsActive']", AI = false)
	public WebElement inpExecutorsRunning_497;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-StopWorkers", AI = false)
	public WebElement btnStop_70;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-StopWorkers", AI = false)
	public WebElement btnStop_226;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-StopWorkers", AI = false)
	public WebElement btnStop_466;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_851;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-ProcessedItemsCount']", AI = false)
	public WebElement inpProcesseditems_798;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_240;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-StopWorkers", AI = false)
	public WebElement btnStop_274;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_480;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_385;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_223;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-UpTime']", AI = false)
	public WebElement inpUpFor_831;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_145;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_450;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_463;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-28-RunWriter", AI = false)
	public WebElement btnRunWriter_332;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-48-RunWriter", AI = false)
	public WebElement btnRunWriter_572;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-numFailed']", AI = false)
	public WebElement inpFailed_268;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_842;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-StopWorkers", AI = false)
	public WebElement btnStop_286;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_492;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-34-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_397;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-RestartWorkers", AI = false)
	public WebElement btnRestart_95;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-UpTime']", AI = false)
	public WebElement inpUpFor_840;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_235;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_157;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-9-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_97;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_475;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-RestartWorkers", AI = false)
	public WebElement btnRestart_191;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-27-RunWriter", AI = false)
	public WebElement btnRunWriter_320;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-47-RunWriter", AI = false)
	public WebElement btnRunWriter_560;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-21-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_833;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-numFailed']", AI = false)
	public WebElement inpFailed_256;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-37-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_438;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-numFailed']", AI = false)
	public WebElement inpFailed_496;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-16-FailedCount']", AI = false)
	public WebElement inpFaileditems_791;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-8-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_85;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-StopWorkers", AI = false)
	public WebElement btnStop_250;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-numActive']", AI = false)
	public WebElement inpAvailable_290;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-StopWorkers", AI = false)
	public WebElement btnStop_490;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-RestartWorkers", AI = false)
	public WebElement btnRestart_179;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_487;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-6-Status']", AI = false)
	public WebElement inpStatus_702;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-RestartWorkers", AI = false)
	public WebElement btnRestart_83;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-15-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_169;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_247;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-UpTime']", AI = false)
	public WebElement inpUpFor_813;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-UpTime']", AI = false)
	public WebElement inpUpFor_804;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_222;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_462;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-numFailed']", AI = false)
	public WebElement inpFailed_280;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_216;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_456;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-0-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-20-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_824;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-7-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_73;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-StopWorkers", AI = false)
	public WebElement btnStop_262;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-17-Hostname']", AI = false)
	public WebElement inpHostname_796;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-RestartWorkers", AI = false)
	public WebElement btnRestart_71;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-14-RestartWorkers", AI = false)
	public WebElement btnRestart_167;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_499;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_259;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-UpTime']", AI = false)
	public WebElement inpUpFor_822;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_210;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-19-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_815;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_228;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-26-RunWriter", AI = false)
	public WebElement btnRunWriter_308;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_468;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-46-RunWriter", AI = false)
	public WebElement btnRunWriter_548;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-6-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_61;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-16-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_181;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-13-RestartWorkers", AI = false)
	public WebElement btnRestart_155;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-33-RestartWorkers", AI = false)
	public WebElement btnRestart_395;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-activeThreads']", AI = false)
	public WebElement inpActiveThreadsCount;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_271;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-39-numFailed']", AI = false)
	public WebElement inpFailed_460;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_486;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_246;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-18-MaxWorkers']", AI = false)
	public WebElement inpMaxNumberofWorkers_806;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-13-FailedCount']", AI = false)
	public WebElement inpFaileditems_764;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_276;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-45-RunWriter", AI = false)
	public WebElement btnRunWriter_536;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-19-numFailed']", AI = false)
	public WebElement inpFailed_220;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-17-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_193;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-18-numFailed']", AI = false)
	public WebElement inpFailed_208;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-12-FailedCount']", AI = false)
	public WebElement inpFaileditems_755;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-38-numFailed']", AI = false)
	public WebElement inpFailed_448;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-TasksTab", AI = false)
	public WebElement btnByTasks_868;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-12-RestartWorkers", AI = false)
	public WebElement btnRestart_143;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-32-RestartWorkers", AI = false)
	public WebElement btnRestart_383;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_234;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_283;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_474;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-24-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_288;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-44-RunWriter", AI = false)
	public WebElement btnRunWriter_524;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-RestartWorkers", AI = false)
	public WebElement btnRestart_59;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-RestartWorkers", AI = false)
	public WebElement btnRestart_47;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-5-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_49;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-23-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_270;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-11-RestartWorkers", AI = false)
	public WebElement btnRestart_131;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-31-RestartWorkers", AI = false)
	public WebElement btnRestart_371;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-23-UpTime']", AI = false)
	public WebElement inpUpFor_858;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-22-UpTime']", AI = false)
	public WebElement inpUpFor_849;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-WriterStatus']", AI = false)
	public WebElement inpWriterStatus_295;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-15-FailedCount']", AI = false)
	public WebElement inpFaileditems_782;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-numFailed']", AI = false)
	public WebElement inpFailed_244;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-21-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_252;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-25-StopWorkers", AI = false)
	public WebElement btnStop_298;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-41-numFailed']", AI = false)
	public WebElement inpFailed_484;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-43-RunWriter", AI = false)
	public WebElement btnRunWriter_512;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsTab", AI = false)
	public WebElement btnByExecutors;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-5-StartedTime']", AI = false)
	public WebElement inpStarted_694;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-3-RestartWorkers", AI = false)
	public WebElement btnRestart_35;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-4-WorkQueueName']", AI = false)
	public WebElement inpWorkQueue_37;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-24-UpTime']", AI = false)
	public WebElement inpUpFor_867;

	@IFindBy(how = How.CSS, using = "select[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-WorkersDV-WorkersLV-TaskFilter']", AI = false)
	public WebElement drpTasks_869;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_498;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-startedClusterWide']", AI = false)
	public WebElement inpClusterWideState_258;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-14-FailedCount']", AI = false)
	public WebElement inpFaileditems_773;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-20-numFailed']", AI = false)
	public WebElement inpFailed_232;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueDV-WorkQueueExecutorsPanelSet-WorkQueueExecutorLDV-ExecutorDetailLV-4-StartedTime']", AI = false)
	public WebElement inpStarted_685;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-22-PrintHistory", AI = false)
	public WebElement btnDownloadHistory_264;

	@IFindBy(how = How.CSS, using = "input[name='WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-40-numFailed']", AI = false)
	public WebElement inpFailed_472;

	@IFindBy(how = How.CSS, using = "#WorkQueueInfo-WorkQueueInfoScreen-WorkQueueInfoLV-42-RunWriter", AI = false)
	public WebElement btnRunWriter_500;

	//	@IFindBy(how = How.CSS, using = "//div[text()='Workflow']//ancestor::td/following-sibling::td[contains(@id,'NotifyCell')]//descendant::div[text()='Run Writer']", AI = false)
	//	public WebElement btnWorkflowRunWriter;

	public WorkQueueInfoPage(){
	}

	public WorkQueueInfoPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		workqueueinfoTable = new WorkQueueInfo();
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
	public WorkQueueInfoPage enterExceptions_862(WebDriver driver,String Exceptions_862) {
		BrowserActions.type(driver, inpExceptions_862,Exceptions_862, "Exceptions_862");
		return this;
	}
	public WorkQueueInfoPage clickByWriters(WebDriver driver)  {
		BrowserActions.click(driver, btnByWriters,"ByWriters");
		return this;
	}
	public WorkQueueInfoPage clickRestart_599(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_599,"Restart_599");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_590(WebDriver driver,String Available_590) {
		BrowserActions.type(driver, inpAvailable_590,Available_590, "Available_590");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_795(WebDriver driver,String UpFor_795) {
		BrowserActions.type(driver, inpUpFor_795,UpFor_795, "UpFor_795");
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
	public WorkQueueInfoPage enterCheckedOut_375(WebDriver driver,String CheckedOut_375) {
		BrowserActions.type(driver, inpCheckedOut_375,CheckedOut_375, "CheckedOut_375");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_541(WebDriver driver,String WorkQueue_541) {
		BrowserActions.type(driver, inpWorkQueue_541,WorkQueue_541, "WorkQueue_541");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_830(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_830,"StartedDateIcon_830");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_516(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_516,"DownloadHistory_516");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_176(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_176,"RunWriter_176");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_839(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_839,"StartedDateIcon_839");
		return this;
	}
	public WorkQueueInfoPage enterStarted_676(WebDriver driver,String Started_676) {
		BrowserActions.type(driver, inpStarted_676,Started_676, "Started_676");
		return this;
	}
	public WorkQueueInfoPage enterFailed_28(WebDriver driver,String Failed_28) {
		BrowserActions.type(driver, inpFailed_28,Failed_28, "Failed_28");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_606(WebDriver driver,String ClusterWideState_606) {
		BrowserActions.type(driver, inpClusterWideState_606,ClusterWideState_606, "ClusterWideState_606");
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
	public WorkQueueInfoPage clickRestart_347(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_347,"Restart_347");
		return this;
	}
	public WorkQueueInfoPage clickRestart_587(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_587,"Restart_587");
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
	public WorkQueueInfoPage enterWorkQueue_553(WebDriver driver,String WorkQueue_553) {
		BrowserActions.type(driver, inpWorkQueue_553,WorkQueue_553, "WorkQueue_553");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_1(WebDriver driver,String WorkQueue_1) {
		BrowserActions.type(driver, inpWorkQueue_1,WorkQueue_1, "WorkQueue_1");
		return this;
	}
	public WorkQueueInfoPage clickNotify_501(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_501,"Notify_501");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_528(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_528,"DownloadHistory_528");
		return this;
	}
	public WorkQueueInfoPage clickDownload(WebDriver driver)  {
		BrowserActions.click(driver, btnDownload,"Download");
		return this;
	}
	public WorkQueueInfoPage clickStop(WebDriver driver)  {
		BrowserActions.click(driver, btnStop,"Stop");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_164(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_164,"RunWriter_164");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_848(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_848,"StartedDateIcon_848");
		return this;
	}
	public WorkQueueInfoPage enterStarted_667(WebDriver driver,String Started_667) {
		BrowserActions.type(driver, inpStarted_667,Started_667, "Started_667");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_509(WebDriver driver,String ExecutorsRunning_509) {
		BrowserActions.type(driver, inpExecutorsRunning_509,ExecutorsRunning_509, "ExecutorsRunning_509");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_39(WebDriver driver,String CheckedOut_39) {
		BrowserActions.type(driver, inpCheckedOut_39,CheckedOut_39, "CheckedOut_39");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_14(WebDriver driver,String Available_14) {
		BrowserActions.type(driver, inpAvailable_14,Available_14, "Available_14");
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
	public WorkQueueInfoPage enterStarted_658(WebDriver driver,String Started_658) {
		BrowserActions.type(driver, inpStarted_658,Started_658, "Started_658");
		return this;
	}
	public WorkQueueInfoPage clickRestart_575(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_575,"Restart_575");
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
	public WorkQueueInfoPage enterWorkQueue_565(WebDriver driver,String WorkQueue_565) {
		BrowserActions.type(driver, inpWorkQueue_565,WorkQueue_565, "WorkQueue_565");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_777(WebDriver driver,String UpFor_777) {
		BrowserActions.type(driver, inpUpFor_777,UpFor_777, "UpFor_777");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_325(WebDriver driver,String WorkQueue_325) {
		BrowserActions.type(driver, inpWorkQueue_325,WorkQueue_325, "WorkQueue_325");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_152(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_152,"RunWriter_152");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_812(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_812,"StartedDateIcon_812");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_578(WebDriver driver,String Available_578) {
		BrowserActions.type(driver, inpAvailable_578,Available_578, "Available_578");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_338(WebDriver driver,String Available_338) {
		BrowserActions.type(driver, inpAvailable_338,Available_338, "Available_338");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_655(WebDriver driver,String Exceptions_655) {
		BrowserActions.type(driver, inpExceptions_655,Exceptions_655, "Exceptions_655");
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
	public WorkQueueInfoPage enterWorkQueue_577(WebDriver driver,String WorkQueue_577) {
		BrowserActions.type(driver, inpWorkQueue_577,WorkQueue_577, "WorkQueue_577");
		return this;
	}
	public WorkQueueInfoPage clickRestart_563(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_563,"Restart_563");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_786(WebDriver driver,String UpFor_786) {
		BrowserActions.type(driver, inpUpFor_786,UpFor_786, "UpFor_786");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_337(WebDriver driver,String WorkQueue_337) {
		BrowserActions.type(driver, inpWorkQueue_337,WorkQueue_337, "WorkQueue_337");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_171(WebDriver driver,String CheckedOut_171) {
		BrowserActions.type(driver, inpCheckedOut_171,CheckedOut_171, "CheckedOut_171");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_504(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_504,"DownloadHistory_504");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_821(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_821,"StartedDateIcon_821");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_140(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_140,"RunWriter_140");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_566(WebDriver driver,String Available_566) {
		BrowserActions.type(driver, inpAvailable_566,Available_566, "Available_566");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_326(WebDriver driver,String Available_326) {
		BrowserActions.type(driver, inpAvailable_326,Available_326, "Available_326");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_618(WebDriver driver,String ClusterWideState_618) {
		BrowserActions.type(driver, inpClusterWideState_618,ClusterWideState_618, "ClusterWideState_618");
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
	public WorkQueueInfoPage enterExceptions_664(WebDriver driver,String Exceptions_664) {
		BrowserActions.type(driver, inpExceptions_664,Exceptions_664, "Exceptions_664");
		return this;
	}
	public WorkQueueInfoPage clickRestart_311(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_311,"Restart_311");
		return this;
	}
	public WorkQueueInfoPage clickRestart_551(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_551,"Restart_551");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_349(WebDriver driver,String WorkQueue_349) {
		BrowserActions.type(driver, inpWorkQueue_349,WorkQueue_349, "WorkQueue_349");
		return this;
	}
	public WorkQueueInfoPage clickNotify_537(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_537,"Notify_537");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_589(WebDriver driver,String WorkQueue_589) {
		BrowserActions.type(driver, inpWorkQueue_589,WorkQueue_589, "WorkQueue_589");
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
	public WorkQueueInfoPage enterClusterWideState_402(WebDriver driver,String ClusterWideState_402) {
		BrowserActions.type(driver, inpClusterWideState_402,ClusterWideState_402, "ClusterWideState_402");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_642(WebDriver driver,String ClusterWideState_642) {
		BrowserActions.type(driver, inpClusterWideState_642,ClusterWideState_642, "ClusterWideState_642");
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
	public WorkQueueInfoPage clickDownloadHistory_312(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_312,"DownloadHistory_312");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_552(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_552,"DownloadHistory_552");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_398(WebDriver driver,String Available_398) {
		BrowserActions.type(driver, inpAvailable_398,Available_398, "Available_398");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_673(WebDriver driver,String Exceptions_673) {
		BrowserActions.type(driver, inpExceptions_673,Exceptions_673, "Exceptions_673");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_630(WebDriver driver,String ClusterWideState_630) {
		BrowserActions.type(driver, inpClusterWideState_630,ClusterWideState_630, "ClusterWideState_630");
		return this;
	}
	public WorkQueueInfoPage enterFailed_172(WebDriver driver,String Failed_172) {
		BrowserActions.type(driver, inpFailed_172,Failed_172, "Failed_172");
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
	public WorkQueueInfoPage clickStartedDateIcon_803(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_803,"StartedDateIcon_803");
		return this;
	}
	public WorkQueueInfoPage enterStarted_865(WebDriver driver,String Started_865) {
		BrowserActions.type(driver, inpStarted_865,Started_865, "Started_865");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_63(WebDriver driver,String CheckedOut_63) {
		BrowserActions.type(driver, inpCheckedOut_63,CheckedOut_63, "CheckedOut_63");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_564(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_564,"DownloadHistory_564");
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
	public WorkQueueInfoPage clickRestart_539(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_539,"Restart_539");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_682(WebDriver driver,String Exceptions_682) {
		BrowserActions.type(driver, inpExceptions_682,Exceptions_682, "Exceptions_682");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_374(WebDriver driver,String Available_374) {
		BrowserActions.type(driver, inpAvailable_374,Available_374, "Available_374");
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
	public WorkQueueInfoPage enterStarted_856(WebDriver driver,String Started_856) {
		BrowserActions.type(driver, inpStarted_856,Started_856, "Started_856");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_195(WebDriver driver,String CheckedOut_195) {
		BrowserActions.type(driver, inpCheckedOut_195,CheckedOut_195, "CheckedOut_195");
		return this;
	}
	public WorkQueueInfoPage clickNotify_513(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_513,"Notify_513");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_356(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_356,"RunWriter_356");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_596(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_596,"RunWriter_596");
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
	public WorkQueueInfoPage enterClusterWideState_426(WebDriver driver,String ClusterWideState_426) {
		BrowserActions.type(driver, inpClusterWideState_426,ClusterWideState_426, "ClusterWideState_426");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_691(WebDriver driver,String Exceptions_691) {
		BrowserActions.type(driver, inpExceptions_691,Exceptions_691, "Exceptions_691");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_116(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_116,"RunWriter_116");
		return this;
	}
	public WorkQueueInfoPage clickRestart_527(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_527,"Restart_527");
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
	public WorkQueueInfoPage enterStarted_847(WebDriver driver,String Started_847) {
		BrowserActions.type(driver, inpStarted_847,Started_847, "Started_847");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_373(WebDriver driver,String WorkQueue_373) {
		BrowserActions.type(driver, inpWorkQueue_373,WorkQueue_373, "WorkQueue_373");
		return this;
	}
	public WorkQueueInfoPage clickNotify_525(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_525,"Notify_525");
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
	public WorkQueueInfoPage clickRunWriter_584(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_584,"RunWriter_584");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_414(WebDriver driver,String ClusterWideState_414) {
		BrowserActions.type(driver, inpClusterWideState_414,ClusterWideState_414, "ClusterWideState_414");
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
	public WorkQueueInfoPage enterCheckedOut_87(WebDriver driver,String CheckedOut_87) {
		BrowserActions.type(driver, inpCheckedOut_87,CheckedOut_87, "CheckedOut_87");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_540(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_540,"DownloadHistory_540");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_104(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_104,"RunWriter_104");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter,"RunWriter");
		return this;
	}
	public WorkQueueInfoPage clickRestart_515(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_515,"Restart_515");
		return this;
	}
	public WorkQueueInfoPage enterStarted_838(WebDriver driver,String Started_838) {
		BrowserActions.type(driver, inpStarted_838,Started_838, "Started_838");
		return this;
	}
	public WorkQueueInfoPage clickNotify_573(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_573,"Notify_573");
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
	public WorkQueueInfoPage enterCheckedOut_531(WebDriver driver,String CheckedOut_531) {
		BrowserActions.type(driver, inpCheckedOut_531,CheckedOut_531, "CheckedOut_531");
		return this;
	}
	public WorkQueueInfoPage clickNotify_333(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_333,"Notify_333");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_581(WebDriver driver,String ExecutorsRunning_581) {
		BrowserActions.type(driver, inpExecutorsRunning_581,ExecutorsRunning_581, "ExecutorsRunning_581");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_101(WebDriver driver,String ExecutorsRunning_101) {
		BrowserActions.type(driver, inpExecutorsRunning_101,ExecutorsRunning_101, "ExecutorsRunning_101");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_677(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_677,"StartedDateIcon_677");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_518(WebDriver driver,String Available_518) {
		BrowserActions.type(driver, inpAvailable_518,Available_518, "Available_518");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_86(WebDriver driver,String Available_86) {
		BrowserActions.type(driver, inpAvailable_86,Available_86, "Available_86");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_744(WebDriver driver,String Processeditems_744) {
		BrowserActions.type(driver, inpProcesseditems_744,Processeditems_744, "Processeditems_744");
		return this;
	}
	public WorkQueueInfoPage enterStarted_829(WebDriver driver,String Started_829) {
		BrowserActions.type(driver, inpStarted_829,Started_829, "Started_829");
		return this;
	}
	public WorkQueueInfoPage clickRestart_503(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_503,"Restart_503");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_303(WebDriver driver,String CheckedOut_303) {
		BrowserActions.type(driver, inpCheckedOut_303,CheckedOut_303, "CheckedOut_303");
		return this;
	}
	public WorkQueueInfoPage clickNotify_345(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_345,"Notify_345");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_543(WebDriver driver,String CheckedOut_543) {
		BrowserActions.type(driver, inpCheckedOut_543,CheckedOut_543, "CheckedOut_543");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_593(WebDriver driver,String ExecutorsRunning_593) {
		BrowserActions.type(driver, inpExecutorsRunning_593,ExecutorsRunning_593, "ExecutorsRunning_593");
		return this;
	}
	public WorkQueueInfoPage clickNotify_585(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_585,"Notify_585");
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
	public WorkQueueInfoPage clickStartedDateIcon_695(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_695,"StartedDateIcon_695");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_113(WebDriver driver,String ExecutorsRunning_113) {
		BrowserActions.type(driver, inpExecutorsRunning_113,ExecutorsRunning_113, "ExecutorsRunning_113");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_686(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_686,"StartedDateIcon_686");
		return this;
	}
	public WorkQueueInfoPage clickError(WebDriver driver)  {
		BrowserActions.click(driver, btnError,"Error");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_506(WebDriver driver,String Available_506) {
		BrowserActions.type(driver, inpAvailable_506,Available_506, "Available_506");
		return this;
	}
	public WorkQueueInfoPage enterStarted_820(WebDriver driver,String Started_820) {
		BrowserActions.type(driver, inpStarted_820,Started_820, "Started_820");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_3(WebDriver driver,String CheckedOut_3) {
		BrowserActions.type(driver, inpCheckedOut_3,CheckedOut_3, "CheckedOut_3");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_735(WebDriver driver,String Processeditems_735) {
		BrowserActions.type(driver, inpProcesseditems_735,Processeditems_735, "Processeditems_735");
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
	public WorkQueueInfoPage enterCheckedOut_315(WebDriver driver,String CheckedOut_315) {
		BrowserActions.type(driver, inpCheckedOut_315,CheckedOut_315, "CheckedOut_315");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_555(WebDriver driver,String CheckedOut_555) {
		BrowserActions.type(driver, inpCheckedOut_555,CheckedOut_555, "CheckedOut_555");
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
	public WorkQueueInfoPage enterExecutorsRunning_557(WebDriver driver,String ExecutorsRunning_557) {
		BrowserActions.type(driver, inpExecutorsRunning_557,ExecutorsRunning_557, "ExecutorsRunning_557");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_808(WebDriver driver,String Exceptions_808) {
		BrowserActions.type(driver, inpExceptions_808,Exceptions_808, "Exceptions_808");
		return this;
	}
	public WorkQueueInfoPage clickNotify_549(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_549,"Notify_549");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_317(WebDriver driver,String ExecutorsRunning_317) {
		BrowserActions.type(driver, inpExecutorsRunning_317,ExecutorsRunning_317, "ExecutorsRunning_317");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_659(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_659,"StartedDateIcon_659");
		return this;
	}
	public WorkQueueInfoPage enterStarted_811(WebDriver driver,String Started_811) {
		BrowserActions.type(driver, inpStarted_811,Started_811, "Started_811");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_762(WebDriver driver,String Processeditems_762) {
		BrowserActions.type(driver, inpProcesseditems_762,Processeditems_762, "Processeditems_762");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_327(WebDriver driver,String CheckedOut_327) {
		BrowserActions.type(driver, inpCheckedOut_327,CheckedOut_327, "CheckedOut_327");
		return this;
	}
	public WorkQueueInfoPage clickNotify_561(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_561,"Notify_561");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_567(WebDriver driver,String CheckedOut_567) {
		BrowserActions.type(driver, inpCheckedOut_567,CheckedOut_567, "CheckedOut_567");
		return this;
	}
	public WorkQueueInfoPage enterStarted_802(WebDriver driver,String Started_802) {
		BrowserActions.type(driver, inpStarted_802,Started_802, "Started_802");
		return this;
	}
	public WorkQueueInfoPage clickNotify_321(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_321,"Notify_321");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_56(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_56,"RunWriter_56");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_817(WebDriver driver,String Exceptions_817) {
		BrowserActions.type(driver, inpExceptions_817,Exceptions_817, "Exceptions_817");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_569(WebDriver driver,String ExecutorsRunning_569) {
		BrowserActions.type(driver, inpExecutorsRunning_569,ExecutorsRunning_569, "ExecutorsRunning_569");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_668(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_668,"StartedDateIcon_668");
		return this;
	}
	public WorkQueueInfoPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_329(WebDriver driver,String ExecutorsRunning_329) {
		BrowserActions.type(driver, inpExecutorsRunning_329,ExecutorsRunning_329, "ExecutorsRunning_329");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_753(WebDriver driver,String Processeditems_753) {
		BrowserActions.type(driver, inpProcesseditems_753,Processeditems_753, "Processeditems_753");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning(WebDriver driver,String ExecutorsRunning) {
		BrowserActions.type(driver, inpExecutorsRunning,ExecutorsRunning, "ExecutorsRunning");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_339(WebDriver driver,String CheckedOut_339) {
		BrowserActions.type(driver, inpCheckedOut_339,CheckedOut_339, "CheckedOut_339");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_579(WebDriver driver,String CheckedOut_579) {
		BrowserActions.type(driver, inpCheckedOut_579,CheckedOut_579, "CheckedOut_579");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_38(WebDriver driver,String Available_38) {
		BrowserActions.type(driver, inpAvailable_38,Available_38, "Available_38");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_18(WebDriver driver,String ClusterWideState_18) {
		BrowserActions.type(driver, inpClusterWideState_18,ClusterWideState_18, "ClusterWideState_18");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_826(WebDriver driver,String Exceptions_826) {
		BrowserActions.type(driver, inpExceptions_826,Exceptions_826, "Exceptions_826");
		return this;
	}
	public WorkQueueInfoPage enterStatus_684(WebDriver driver,String Status_684) {
		BrowserActions.type(driver, inpStatus_684,Status_684, "Status_684");
		return this;
	}
	public WorkQueueInfoPage enterHostname_823(WebDriver driver,String Hostname_823) {
		BrowserActions.type(driver, inpHostname_823,Hostname_823, "Hostname_823");
		return this;
	}
	public WorkQueueInfoPage selectFilter_871(WebDriver driver,String Filter_871)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFilter_871,Filter_871,"Filter_871");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_533(WebDriver driver,String ExecutorsRunning_533) {
		BrowserActions.type(driver, inpExecutorsRunning_533,ExecutorsRunning_533, "ExecutorsRunning_533");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_505(WebDriver driver,String WorkQueue_505) {
		BrowserActions.type(driver, inpWorkQueue_505,WorkQueue_505, "WorkQueue_505");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_708(WebDriver driver,String Processeditems_708) {
		BrowserActions.type(driver, inpProcesseditems_708,Processeditems_708, "Processeditems_708");
		return this;
	}
	public WorkQueueInfoPage clickStop_514(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_514,"Stop_514");
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
	public WorkQueueInfoPage clickNotify_381(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_381,"Notify_381");
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
	public WorkQueueInfoPage enterExceptions_835(WebDriver driver,String Exceptions_835) {
		BrowserActions.type(driver, inpExceptions_835,Exceptions_835, "Exceptions_835");
		return this;
	}
	public WorkQueueInfoPage enterStatus_675(WebDriver driver,String Status_675) {
		BrowserActions.type(driver, inpStatus_675,Status_675, "Status_675");
		return this;
	}
	public WorkQueueInfoPage enterHostname_814(WebDriver driver,String Hostname_814) {
		BrowserActions.type(driver, inpHostname_814,Hostname_814, "Hostname_814");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_305(WebDriver driver,String ExecutorsRunning_305) {
		BrowserActions.type(driver, inpExecutorsRunning_305,ExecutorsRunning_305, "ExecutorsRunning_305");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_517(WebDriver driver,String WorkQueue_517) {
		BrowserActions.type(driver, inpWorkQueue_517,WorkQueue_517, "WorkQueue_517");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_545(WebDriver driver,String ExecutorsRunning_545) {
		BrowserActions.type(driver, inpExecutorsRunning_545,ExecutorsRunning_545, "ExecutorsRunning_545");
		return this;
	}
	public WorkQueueInfoPage clickStop_526(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_526,"Stop_526");
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
	public WorkQueueInfoPage enterAvailable_542(WebDriver driver,String Available_542) {
		BrowserActions.type(driver, inpAvailable_542,Available_542, "Available_542");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_844(WebDriver driver,String Exceptions_844) {
		BrowserActions.type(driver, inpExceptions_844,Exceptions_844, "Exceptions_844");
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
	public WorkQueueInfoPage clickNotify_597(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_597,"Notify_597");
		return this;
	}
	public WorkQueueInfoPage enterHostname_805(WebDriver driver,String Hostname_805) {
		BrowserActions.type(driver, inpHostname_805,Hostname_805, "Hostname_805");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_351(WebDriver driver,String CheckedOut_351) {
		BrowserActions.type(driver, inpCheckedOut_351,CheckedOut_351, "CheckedOut_351");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_521(WebDriver driver,String ExecutorsRunning_521) {
		BrowserActions.type(driver, inpExecutorsRunning_521,ExecutorsRunning_521, "ExecutorsRunning_521");
		return this;
	}
	public WorkQueueInfoPage clickNotify_117(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_117,"Notify_117");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_591(WebDriver driver,String CheckedOut_591) {
		BrowserActions.type(driver, inpCheckedOut_591,CheckedOut_591, "CheckedOut_591");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_529(WebDriver driver,String WorkQueue_529) {
		BrowserActions.type(driver, inpWorkQueue_529,WorkQueue_529, "WorkQueue_529");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_726(WebDriver driver,String Processeditems_726) {
		BrowserActions.type(driver, inpProcesseditems_726,Processeditems_726, "Processeditems_726");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_30(WebDriver driver,String ClusterWideState_30) {
		BrowserActions.type(driver, inpClusterWideState_30,ClusterWideState_30, "ClusterWideState_30");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_857(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_857,"StartedDateIcon_857");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_62(WebDriver driver,String Available_62) {
		BrowserActions.type(driver, inpAvailable_62,Available_62, "Available_62");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_530(WebDriver driver,String Available_530) {
		BrowserActions.type(driver, inpAvailable_530,Available_530, "Available_530");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_92(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_92,"RunWriter_92");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_853(WebDriver driver,String Exceptions_853) {
		BrowserActions.type(driver, inpExceptions_853,Exceptions_853, "Exceptions_853");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_123(WebDriver driver,String CheckedOut_123) {
		BrowserActions.type(driver, inpCheckedOut_123,CheckedOut_123, "CheckedOut_123");
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
	public WorkQueueInfoPage enterStatus_693(WebDriver driver,String Status_693) {
		BrowserActions.type(driver, inpStatus_693,Status_693, "Status_693");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_717(WebDriver driver,String Processeditems_717) {
		BrowserActions.type(driver, inpProcesseditems_717,Processeditems_717, "Processeditems_717");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_188(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_188,"RunWriter_188");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_866(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_866,"StartedDateIcon_866");
		return this;
	}
	public WorkQueueInfoPage clickStop_502(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_502,"Stop_502");
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
	public WorkQueueInfoPage clickStop_550(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_550,"Stop_550");
		return this;
	}
	public WorkQueueInfoPage clickNotify_297(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_297,"Notify_297");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_845(WebDriver driver,String Faileditems_845) {
		BrowserActions.type(driver, inpFaileditems_845,Faileditems_845, "Faileditems_845");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_608(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_608,"RunWriter_608");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_185(WebDriver driver,String ExecutorsRunning_185) {
		BrowserActions.type(driver, inpExecutorsRunning_185,ExecutorsRunning_185, "ExecutorsRunning_185");
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
	public WorkQueueInfoPage enterFailed_544(WebDriver driver,String Failed_544) {
		BrowserActions.type(driver, inpFailed_544,Failed_544, "Failed_544");
		return this;
	}
	public WorkQueueInfoPage clickStop_310(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_310,"Stop_310");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_690(WebDriver driver,String Processeditems_690) {
		BrowserActions.type(driver, inpProcesseditems_690,Processeditems_690, "Processeditems_690");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_836(WebDriver driver,String Faileditems_836) {
		BrowserActions.type(driver, inpFaileditems_836,Faileditems_836, "Faileditems_836");
		return this;
	}
	public WorkQueueInfoPage enterHostname_850(WebDriver driver,String Hostname_850) {
		BrowserActions.type(driver, inpHostname_850,Hostname_850, "Hostname_850");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut(WebDriver driver,String CheckedOut) {
		BrowserActions.type(driver, inpCheckedOut,CheckedOut, "CheckedOut");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_511(WebDriver driver,String WriterStatus_511) {
		BrowserActions.type(driver, inpWriterStatus_511,WriterStatus_511, "WriterStatus_511");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_197(WebDriver driver,String ExecutorsRunning_197) {
		BrowserActions.type(driver, inpExecutorsRunning_197,ExecutorsRunning_197, "ExecutorsRunning_197");
		return this;
	}
	public WorkQueueInfoPage enterHostname_859(WebDriver driver,String Hostname_859) {
		BrowserActions.type(driver, inpHostname_859,Hostname_859, "Hostname_859");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_162(WebDriver driver,String ClusterWideState_162) {
		BrowserActions.type(driver, inpClusterWideState_162,ClusterWideState_162, "ClusterWideState_162");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_42(WebDriver driver,String ClusterWideState_42) {
		BrowserActions.type(driver, inpClusterWideState_42,ClusterWideState_42, "ClusterWideState_42");
		return this;
	}
	public WorkQueueInfoPage enterFailed_532(WebDriver driver,String Failed_532) {
		BrowserActions.type(driver, inpFailed_532,Failed_532, "Failed_532");
		return this;
	}
	public WorkQueueInfoPage clickStop_322(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_322,"Stop_322");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_699(WebDriver driver,String Processeditems_699) {
		BrowserActions.type(driver, inpProcesseditems_699,Processeditems_699, "Processeditems_699");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_797(WebDriver driver,String MaxNumberofWorkers_797) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_797,MaxNumberofWorkers_797, "MaxNumberofWorkers_797");
		return this;
	}
	public WorkQueueInfoPage clickStop_562(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_562,"Stop_562");
		return this;
	}
	public WorkQueueInfoPage enterHostname_841(WebDriver driver,String Hostname_841) {
		BrowserActions.type(driver, inpHostname_841,Hostname_841, "Hostname_841");
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
	public WorkQueueInfoPage enterFailed_316(WebDriver driver,String Failed_316) {
		BrowserActions.type(driver, inpFailed_316,Failed_316, "Failed_316");
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
	public WorkQueueInfoPage enterWriterStatus_523(WebDriver driver,String WriterStatus_523) {
		BrowserActions.type(driver, inpWriterStatus_523,WriterStatus_523, "WriterStatus_523");
		return this;
	}
	public WorkQueueInfoPage enterStatus_666(WebDriver driver,String Status_666) {
		BrowserActions.type(driver, inpStatus_666,Status_666, "Status_666");
		return this;
	}
	public WorkQueueInfoPage clickStop_538(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_538,"Stop_538");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_788(WebDriver driver,String MaxNumberofWorkers_788) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_788,MaxNumberofWorkers_788, "MaxNumberofWorkers_788");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_863(WebDriver driver,String Faileditems_863) {
		BrowserActions.type(driver, inpFaileditems_863,Faileditems_863, "Faileditems_863");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_770(WebDriver driver,String MaxNumberofWorkers_770) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_770,MaxNumberofWorkers_770, "MaxNumberofWorkers_770");
		return this;
	}
	public WorkQueueInfoPage enterHostname_832(WebDriver driver,String Hostname_832) {
		BrowserActions.type(driver, inpHostname_832,Hostname_832, "Hostname_832");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_603(WebDriver driver,String CheckedOut_603) {
		BrowserActions.type(driver, inpCheckedOut_603,CheckedOut_603, "CheckedOut_603");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_192(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_192,"DownloadHistory_192");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_535(WebDriver driver,String WriterStatus_535) {
		BrowserActions.type(driver, inpWriterStatus_535,WriterStatus_535, "WriterStatus_535");
		return this;
	}
	public WorkQueueInfoPage enterFailed_304(WebDriver driver,String Failed_304) {
		BrowserActions.type(driver, inpFailed_304,Failed_304, "Failed_304");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_854(WebDriver driver,String Faileditems_854) {
		BrowserActions.type(driver, inpFaileditems_854,Faileditems_854, "Faileditems_854");
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
	public WorkQueueInfoPage enterStatus_657(WebDriver driver,String Status_657) {
		BrowserActions.type(driver, inpStatus_657,Status_657, "Status_657");
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
	public WorkQueueInfoPage enterFailed_556(WebDriver driver,String Failed_556) {
		BrowserActions.type(driver, inpFailed_556,Failed_556, "Failed_556");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_779(WebDriver driver,String MaxNumberofWorkers_779) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_779,MaxNumberofWorkers_779, "MaxNumberofWorkers_779");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_615(WebDriver driver,String CheckedOut_615) {
		BrowserActions.type(driver, inpCheckedOut_615,CheckedOut_615, "CheckedOut_615");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_761(WebDriver driver,String MaxNumberofWorkers_761) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_761,MaxNumberofWorkers_761, "MaxNumberofWorkers_761");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_547(WebDriver driver,String WriterStatus_547) {
		BrowserActions.type(driver, inpWriterStatus_547,WriterStatus_547, "WriterStatus_547");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_307(WebDriver driver,String WriterStatus_307) {
		BrowserActions.type(driver, inpWriterStatus_307,WriterStatus_307, "WriterStatus_307");
		return this;
	}
	public WorkQueueInfoPage enterHostname_661(WebDriver driver,String Hostname_661) {
		BrowserActions.type(driver, inpHostname_661,Hostname_661, "Hostname_661");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_800(WebDriver driver,String Faileditems_800) {
		BrowserActions.type(driver, inpFaileditems_800,Faileditems_800, "Faileditems_800");
		return this;
	}
	public WorkQueueInfoPage enterStatus_846(WebDriver driver,String Status_846) {
		BrowserActions.type(driver, inpStatus_846,Status_846, "Status_846");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_809(WebDriver driver,String Faileditems_809) {
		BrowserActions.type(driver, inpFaileditems_809,Faileditems_809, "Faileditems_809");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_389(WebDriver driver,String ExecutorsRunning_389) {
		BrowserActions.type(driver, inpExecutorsRunning_389,ExecutorsRunning_389, "ExecutorsRunning_389");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_137(WebDriver driver,String ExecutorsRunning_137) {
		BrowserActions.type(driver, inpExecutorsRunning_137,ExecutorsRunning_137, "ExecutorsRunning_137");
		return this;
	}
	public WorkQueueInfoPage clickRestart(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart,"Restart");
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
	public WorkQueueInfoPage enterProcesseditems_663(WebDriver driver,String Processeditems_663) {
		BrowserActions.type(driver, inpProcesseditems_663,Processeditems_663, "Processeditems_663");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_90(WebDriver driver,String ClusterWideState_90) {
		BrowserActions.type(driver, inpClusterWideState_90,ClusterWideState_90, "ClusterWideState_90");
		return this;
	}
	public WorkQueueInfoPage clickStop_598(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_598,"Stop_598");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_319(WebDriver driver,String WriterStatus_319) {
		BrowserActions.type(driver, inpWriterStatus_319,WriterStatus_319, "WriterStatus_319");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_627(WebDriver driver,String CheckedOut_627) {
		BrowserActions.type(driver, inpCheckedOut_627,CheckedOut_627, "CheckedOut_627");
		return this;
	}
	public WorkQueueInfoPage enterException(WebDriver driver,String Exception) {
		BrowserActions.type(driver, inpException,Exception, "Exception");
		return this;
	}
	public WorkQueueInfoPage enterHostname_652(WebDriver driver,String Hostname_652) {
		BrowserActions.type(driver, inpHostname_652,Hostname_652, "Hostname_652");
		return this;
	}
	public WorkQueueInfoPage enterStatus_837(WebDriver driver,String Status_837) {
		BrowserActions.type(driver, inpStatus_837,Status_837, "Status_837");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_559(WebDriver driver,String WriterStatus_559) {
		BrowserActions.type(driver, inpWriterStatus_559,WriterStatus_559, "WriterStatus_559");
		return this;
	}
	public WorkQueueInfoPage enterMaximumPoolSize(WebDriver driver,String MaximumPoolSize) {
		BrowserActions.type(driver, inpMaximumPoolSize,MaximumPoolSize, "MaximumPoolSize");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_149(WebDriver driver,String ExecutorsRunning_149) {
		BrowserActions.type(driver, inpExecutorsRunning_149,ExecutorsRunning_149, "ExecutorsRunning_149");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_198(WebDriver driver,String ClusterWideState_198) {
		BrowserActions.type(driver, inpClusterWideState_198,ClusterWideState_198, "ClusterWideState_198");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_654(WebDriver driver,String Processeditems_654) {
		BrowserActions.type(driver, inpProcesseditems_654,Processeditems_654, "Processeditems_654");
		return this;
	}
	public WorkQueueInfoPage clickByWriters_649(WebDriver driver)  {
		BrowserActions.click(driver, btnByWriters_649,"ByWriters_649");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_752(WebDriver driver,String MaxNumberofWorkers_752) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_752,MaxNumberofWorkers_752, "MaxNumberofWorkers_752");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_639(WebDriver driver,String CheckedOut_639) {
		BrowserActions.type(driver, inpCheckedOut_639,CheckedOut_639, "CheckedOut_639");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_827(WebDriver driver,String Faileditems_827) {
		BrowserActions.type(driver, inpFaileditems_827,Faileditems_827, "Faileditems_827");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_681(WebDriver driver,String Processeditems_681) {
		BrowserActions.type(driver, inpProcesseditems_681,Processeditems_681, "Processeditems_681");
		return this;
	}
	public WorkQueueInfoPage enterStatus_864(WebDriver driver,String Status_864) {
		BrowserActions.type(driver, inpStatus_864,Status_864, "Status_864");
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
	public WorkQueueInfoPage enterExceptions(WebDriver driver,String Exceptions) {
		BrowserActions.type(driver, inpExceptions,Exceptions, "Exceptions");
		return this;
	}
	public WorkQueueInfoPage enterFailed_520(WebDriver driver,String Failed_520) {
		BrowserActions.type(driver, inpFailed_520,Failed_520, "Failed_520");
		return this;
	}
	public WorkQueueInfoPage clickStop_334(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_334,"Stop_334");
		return this;
	}
	public WorkQueueInfoPage clickStop_574(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_574,"Stop_574");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_743(WebDriver driver,String MaxNumberofWorkers_743) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_743,MaxNumberofWorkers_743, "MaxNumberofWorkers_743");
		return this;
	}
	public WorkQueueInfoPage enterFailed_508(WebDriver driver,String Failed_508) {
		BrowserActions.type(driver, inpFailed_508,Failed_508, "Failed_508");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_672(WebDriver driver,String Processeditems_672) {
		BrowserActions.type(driver, inpProcesseditems_672,Processeditems_672, "Processeditems_672");
		return this;
	}
	public WorkQueueInfoPage enterStatus_855(WebDriver driver,String Status_855) {
		BrowserActions.type(driver, inpStatus_855,Status_855, "Status_855");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_377(WebDriver driver,String ExecutorsRunning_377) {
		BrowserActions.type(driver, inpExecutorsRunning_377,ExecutorsRunning_377, "ExecutorsRunning_377");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_571(WebDriver driver,String WriterStatus_571) {
		BrowserActions.type(driver, inpWriterStatus_571,WriterStatus_571, "WriterStatus_571");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_331(WebDriver driver,String WriterStatus_331) {
		BrowserActions.type(driver, inpWriterStatus_331,WriterStatus_331, "WriterStatus_331");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_818(WebDriver driver,String Faileditems_818) {
		BrowserActions.type(driver, inpFaileditems_818,Faileditems_818, "Faileditems_818");
		return this;
	}
	public WorkQueueInfoPage clickStop_106(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_106,"Stop_106");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_734(WebDriver driver,String MaxNumberofWorkers_734) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_734,MaxNumberofWorkers_734, "MaxNumberofWorkers_734");
		return this;
	}
	public WorkQueueInfoPage clickStop_346(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_346,"Stop_346");
		return this;
	}
	public WorkQueueInfoPage clickStop_586(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_586,"Stop_586");
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
	public WorkQueueInfoPage enterStatus_801(WebDriver driver,String Status_801) {
		BrowserActions.type(driver, inpStatus_801,Status_801, "Status_801");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_103(WebDriver driver,String WriterStatus_103) {
		BrowserActions.type(driver, inpWriterStatus_103,WriterStatus_103, "WriterStatus_103");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_570(WebDriver driver,String ClusterWideState_570) {
		BrowserActions.type(driver, inpClusterWideState_570,ClusterWideState_570, "ClusterWideState_570");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_583(WebDriver driver,String WriterStatus_583) {
		BrowserActions.type(driver, inpWriterStatus_583,WriterStatus_583, "WriterStatus_583");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_714(WebDriver driver,String UpFor_714) {
		BrowserActions.type(driver, inpUpFor_714,UpFor_714, "UpFor_714");
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
	public WorkQueueInfoPage enterUpFor_705(WebDriver driver,String UpFor_705) {
		BrowserActions.type(driver, inpUpFor_705,UpFor_705, "UpFor_705");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_452(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_452,"RunWriter_452");
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
	public WorkQueueInfoPage enterMaxNumberofWorkers_725(WebDriver driver,String MaxNumberofWorkers_725) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_725,MaxNumberofWorkers_725, "MaxNumberofWorkers_725");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_99(WebDriver driver,String CheckedOut_99) {
		BrowserActions.type(driver, inpCheckedOut_99,CheckedOut_99, "CheckedOut_99");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_683(WebDriver driver,String Faileditems_683) {
		BrowserActions.type(driver, inpFaileditems_683,Faileditems_683, "Faileditems_683");
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
	public WorkQueueInfoPage enterHostname_697(WebDriver driver,String Hostname_697) {
		BrowserActions.type(driver, inpHostname_697,Hostname_697, "Hostname_697");
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
	public WorkQueueInfoPage enterUpFor_723(WebDriver driver,String UpFor_723) {
		BrowserActions.type(driver, inpUpFor_723,UpFor_723, "UpFor_723");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_595(WebDriver driver,String WriterStatus_595) {
		BrowserActions.type(driver, inpWriterStatus_595,WriterStatus_595, "WriterStatus_595");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_200(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_200,"RunWriter_200");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_440(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_440,"RunWriter_440");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_716(WebDriver driver,String MaxNumberofWorkers_716) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_716,MaxNumberofWorkers_716, "MaxNumberofWorkers_716");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_318(WebDriver driver,String ClusterWideState_318) {
		BrowserActions.type(driver, inpClusterWideState_318,ClusterWideState_318, "ClusterWideState_318");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_674(WebDriver driver,String Faileditems_674) {
		BrowserActions.type(driver, inpFaileditems_674,Faileditems_674, "Faileditems_674");
		return this;
	}
	public WorkQueueInfoPage enterFailed_136(WebDriver driver,String Failed_136) {
		BrowserActions.type(driver, inpFailed_136,Failed_136, "Failed_136");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_558(WebDriver driver,String ClusterWideState_558) {
		BrowserActions.type(driver, inpClusterWideState_558,ClusterWideState_558, "ClusterWideState_558");
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
	public WorkQueueInfoPage enterHostname_688(WebDriver driver,String Hostname_688) {
		BrowserActions.type(driver, inpHostname_688,Hostname_688, "Hostname_688");
		return this;
	}
	public WorkQueueInfoPage enterStatus_828(WebDriver driver,String Status_828) {
		BrowserActions.type(driver, inpStatus_828,Status_828, "Status_828");
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
	public WorkQueueInfoPage enterMaxNumberofWorkers_707(WebDriver driver,String MaxNumberofWorkers_707) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_707,MaxNumberofWorkers_707, "MaxNumberofWorkers_707");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_336(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_336,"DownloadHistory_336");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_576(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_576,"DownloadHistory_576");
		return this;
	}
	public WorkQueueInfoPage enterHostname_679(WebDriver driver,String Hostname_679) {
		BrowserActions.type(driver, inpHostname_679,Hostname_679, "Hostname_679");
		return this;
	}
	public WorkQueueInfoPage clickStop_142(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_142,"Stop_142");
		return this;
	}
	public WorkQueueInfoPage enterStatus_819(WebDriver driver,String Status_819) {
		BrowserActions.type(driver, inpStatus_819,Status_819, "Status_819");
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
	public WorkQueueInfoPage clickRestart_287(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_287,"Restart_287");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_379(WebDriver driver,String WriterStatus_379) {
		BrowserActions.type(driver, inpWriterStatus_379,WriterStatus_379, "WriterStatus_379");
		return this;
	}
	public WorkQueueInfoPage enterStatus_810(WebDriver driver,String Status_810) {
		BrowserActions.type(driver, inpStatus_810,Status_810, "Status_810");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_582(WebDriver driver,String ClusterWideState_582) {
		BrowserActions.type(driver, inpClusterWideState_582,ClusterWideState_582, "ClusterWideState_582");
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
	public WorkQueueInfoPage clickDownloadHistory_588(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_588,"DownloadHistory_588");
		return this;
	}
	public WorkQueueInfoPage enterHostname_670(WebDriver driver,String Hostname_670) {
		BrowserActions.type(driver, inpHostname_670,Hostname_670, "Hostname_670");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_428(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_428,"RunWriter_428");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_692(WebDriver driver,String Faileditems_692) {
		BrowserActions.type(driver, inpFaileditems_692,Faileditems_692, "Faileditems_692");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_750(WebDriver driver,String UpFor_750) {
		BrowserActions.type(driver, inpUpFor_750,UpFor_750, "UpFor_750");
		return this;
	}
	public WorkQueueInfoPage clickStop_190(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_190,"Stop_190");
		return this;
	}
	public WorkQueueInfoPage clickRestart_275(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_275,"Restart_275");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_759(WebDriver driver,String UpFor_759) {
		BrowserActions.type(driver, inpUpFor_759,UpFor_759, "UpFor_759");
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
	public WorkQueueInfoPage enterFailed_580(WebDriver driver,String Failed_580) {
		BrowserActions.type(driver, inpFailed_580,Failed_580, "Failed_580");
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
	public WorkQueueInfoPage clickRunWriter_416(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_416,"RunWriter_416");
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
	public WorkQueueInfoPage enterFailed_328(WebDriver driver,String Failed_328) {
		BrowserActions.type(driver, inpFailed_328,Failed_328, "Failed_328");
		return this;
	}
	public WorkQueueInfoPage enterFailed_568(WebDriver driver,String Failed_568) {
		BrowserActions.type(driver, inpFailed_568,Failed_568, "Failed_568");
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
	public WorkQueueInfoPage enterUpFor_768(WebDriver driver,String UpFor_768) {
		BrowserActions.type(driver, inpUpFor_768,UpFor_768, "UpFor_768");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_354(WebDriver driver,String ClusterWideState_354) {
		BrowserActions.type(driver, inpClusterWideState_354,ClusterWideState_354, "ClusterWideState_354");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_163(WebDriver driver,String WriterStatus_163) {
		BrowserActions.type(driver, inpWriterStatus_163,WriterStatus_163, "WriterStatus_163");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_594(WebDriver driver,String ClusterWideState_594) {
		BrowserActions.type(driver, inpClusterWideState_594,ClusterWideState_594, "ClusterWideState_594");
		return this;
	}
	public WorkQueueInfoPage enterFailed_76(WebDriver driver,String Failed_76) {
		BrowserActions.type(driver, inpFailed_76,Failed_76, "Failed_76");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_114(WebDriver driver,String ClusterWideState_114) {
		BrowserActions.type(driver, inpClusterWideState_114,ClusterWideState_114, "ClusterWideState_114");
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
	public WorkQueueInfoPage clickRunWriter_644(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_644,"RunWriter_644");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_390(WebDriver driver,String ClusterWideState_390) {
		BrowserActions.type(driver, inpClusterWideState_390,ClusterWideState_390, "ClusterWideState_390");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_732(WebDriver driver,String UpFor_732) {
		BrowserActions.type(driver, inpUpFor_732,UpFor_732, "UpFor_732");
		return this;
	}
	public WorkQueueInfoPage clickRestart_251(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_251,"Restart_251");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_150(WebDriver driver,String ClusterWideState_150) {
		BrowserActions.type(driver, inpClusterWideState_150,ClusterWideState_150, "ClusterWideState_150");
		return this;
	}
	public WorkQueueInfoPage clickRestart_491(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_491,"Restart_491");
		return this;
	}
	public WorkQueueInfoPage enterFailed_40(WebDriver driver,String Failed_40) {
		BrowserActions.type(driver, inpFailed_40,Failed_40, "Failed_40");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_5(WebDriver driver,String ExecutorsRunning_5) {
		BrowserActions.type(driver, inpExecutorsRunning_5,ExecutorsRunning_5, "ExecutorsRunning_5");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_665(WebDriver driver,String Faileditems_665) {
		BrowserActions.type(driver, inpFaileditems_665,Faileditems_665, "Faileditems_665");
		return this;
	}
	public WorkQueueInfoPage enterFailed_124(WebDriver driver,String Failed_124) {
		BrowserActions.type(driver, inpFailed_124,Failed_124, "Failed_124");
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
	public WorkQueueInfoPage clickRunWriter_632(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_632,"RunWriter_632");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_656(WebDriver driver,String Faileditems_656) {
		BrowserActions.type(driver, inpFaileditems_656,Faileditems_656, "Faileditems_656");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_741(WebDriver driver,String UpFor_741) {
		BrowserActions.type(driver, inpUpFor_741,UpFor_741, "UpFor_741");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_175(WebDriver driver,String WriterStatus_175) {
		BrowserActions.type(driver, inpWriterStatus_175,WriterStatus_175, "WriterStatus_175");
		return this;
	}
	public WorkQueueInfoPage enterFailed_592(WebDriver driver,String Failed_592) {
		BrowserActions.type(driver, inpFailed_592,Failed_592, "Failed_592");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_620(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_620,"RunWriter_620");
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
	public WorkQueueInfoPage enterAvailable_470(WebDriver driver,String Available_470) {
		BrowserActions.type(driver, inpAvailable_470,Available_470, "Available_470");
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
	public WorkQueueInfoPage clickRestart_479(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_479,"Restart_479");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_65(WebDriver driver,String ExecutorsRunning_65) {
		BrowserActions.type(driver, inpExecutorsRunning_65,ExecutorsRunning_65, "ExecutorsRunning_65");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_745(WebDriver driver,String Exceptions_745) {
		BrowserActions.type(driver, inpExceptions_745,Exceptions_745, "Exceptions_745");
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
	public WorkQueueInfoPage enterWorkQueue_421(WebDriver driver,String WorkQueue_421) {
		BrowserActions.type(driver, inpWorkQueue_421,WorkQueue_421, "WorkQueue_421");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_678(WebDriver driver,String UpFor_678) {
		BrowserActions.type(driver, inpUpFor_678,UpFor_678, "UpFor_678");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_495(WebDriver driver,String CheckedOut_495) {
		BrowserActions.type(driver, inpCheckedOut_495,CheckedOut_495, "CheckedOut_495");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_187(WebDriver driver,String WriterStatus_187) {
		BrowserActions.type(driver, inpWriterStatus_187,WriterStatus_187, "WriterStatus_187");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_296(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_296,"RunWriter_296");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_617(WebDriver driver,String ExecutorsRunning_617) {
		BrowserActions.type(driver, inpExecutorsRunning_617,ExecutorsRunning_617, "ExecutorsRunning_617");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_636(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_636,"DownloadHistory_636");
		return this;
	}
	public WorkQueueInfoPage clickNotify_609(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_609,"Notify_609");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_713(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_713,"StartedDateIcon_713");
		return this;
	}
	public WorkQueueInfoPage clickDownloadRawData(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadRawData,"DownloadRawData");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers(WebDriver driver,String MaxNumberofWorkers) {
		BrowserActions.type(driver, inpMaxNumberofWorkers,MaxNumberofWorkers, "MaxNumberofWorkers");
		return this;
	}
	public WorkQueueInfoPage enterStarted_793(WebDriver driver,String Started_793) {
		BrowserActions.type(driver, inpStarted_793,Started_793, "Started_793");
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
	public WorkQueueInfoPage clickRestart_467(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_467,"Restart_467");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_754(WebDriver driver,String Exceptions_754) {
		BrowserActions.type(driver, inpExceptions_754,Exceptions_754, "Exceptions_754");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_267(WebDriver driver,String CheckedOut_267) {
		BrowserActions.type(driver, inpCheckedOut_267,CheckedOut_267, "CheckedOut_267");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_433(WebDriver driver,String WorkQueue_433) {
		BrowserActions.type(driver, inpWorkQueue_433,WorkQueue_433, "WorkQueue_433");
		return this;
	}
	public WorkQueueInfoPage clickNotify_621(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_621,"Notify_621");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_687(WebDriver driver,String UpFor_687) {
		BrowserActions.type(driver, inpUpFor_687,UpFor_687, "UpFor_687");
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
	public WorkQueueInfoPage clickDownloadHistory_648(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_648,"DownloadHistory_648");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_722(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_722,"StartedDateIcon_722");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_284(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_284,"RunWriter_284");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_629(WebDriver driver,String ExecutorsRunning_629) {
		BrowserActions.type(driver, inpExecutorsRunning_629,ExecutorsRunning_629, "ExecutorsRunning_629");
		return this;
	}
	public WorkQueueInfoPage enterStarted_784(WebDriver driver,String Started_784) {
		BrowserActions.type(driver, inpStarted_784,Started_784, "Started_784");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_41(WebDriver driver,String ExecutorsRunning_41) {
		BrowserActions.type(driver, inpExecutorsRunning_41,ExecutorsRunning_41, "ExecutorsRunning_41");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_763(WebDriver driver,String Exceptions_763) {
		BrowserActions.type(driver, inpExceptions_763,Exceptions_763, "Exceptions_763");
		return this;
	}
	public WorkQueueInfoPage clickRestart_215(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_215,"Restart_215");
		return this;
	}
	public WorkQueueInfoPage clickRestart_455(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_455,"Restart_455");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_279(WebDriver driver,String CheckedOut_279) {
		BrowserActions.type(driver, inpCheckedOut_279,CheckedOut_279, "CheckedOut_279");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_445(WebDriver driver,String WorkQueue_445) {
		BrowserActions.type(driver, inpWorkQueue_445,WorkQueue_445, "WorkQueue_445");
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
	public WorkQueueInfoPage clickRunWriter_272(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_272,"RunWriter_272");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_612(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_612,"DownloadHistory_612");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_807(WebDriver driver,String Processeditems_807) {
		BrowserActions.type(driver, inpProcesseditems_807,Processeditems_807, "Processeditems_807");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_458(WebDriver driver,String Available_458) {
		BrowserActions.type(driver, inpAvailable_458,Available_458, "Available_458");
		return this;
	}
	public WorkQueueInfoPage enterStarted_775(WebDriver driver,String Started_775) {
		BrowserActions.type(driver, inpStarted_775,Started_775, "Started_775");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_772(WebDriver driver,String Exceptions_772) {
		BrowserActions.type(driver, inpExceptions_772,Exceptions_772, "Exceptions_772");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_660(WebDriver driver,String UpFor_660) {
		BrowserActions.type(driver, inpUpFor_660,UpFor_660, "UpFor_660");
		return this;
	}
	public WorkQueueInfoPage clickRestart_203(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_203,"Restart_203");
		return this;
	}
	public WorkQueueInfoPage clickRestart_443(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_443,"Restart_443");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_260(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_260,"RunWriter_260");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_217(WebDriver driver,String WorkQueue_217) {
		BrowserActions.type(driver, inpWorkQueue_217,WorkQueue_217, "WorkQueue_217");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_669(WebDriver driver,String UpFor_669) {
		BrowserActions.type(driver, inpUpFor_669,UpFor_669, "UpFor_669");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_457(WebDriver driver,String WorkQueue_457) {
		BrowserActions.type(driver, inpWorkQueue_457,WorkQueue_457, "WorkQueue_457");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_291(WebDriver driver,String CheckedOut_291) {
		BrowserActions.type(driver, inpCheckedOut_291,CheckedOut_291, "CheckedOut_291");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_605(WebDriver driver,String ExecutorsRunning_605) {
		BrowserActions.type(driver, inpExecutorsRunning_605,ExecutorsRunning_605, "ExecutorsRunning_605");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_624(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_624,"DownloadHistory_624");
		return this;
	}
	public WorkQueueInfoPage enterHostname(WebDriver driver,String Hostname) {
		BrowserActions.type(driver, inpHostname,Hostname, "Hostname");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_446(WebDriver driver,String Available_446) {
		BrowserActions.type(driver, inpAvailable_446,Available_446, "Available_446");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_704(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_704,"StartedDateIcon_704");
		return this;
	}
	public WorkQueueInfoPage enterStarted_766(WebDriver driver,String Started_766) {
		BrowserActions.type(driver, inpStarted_766,Started_766, "Started_766");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_206(WebDriver driver,String Available_206) {
		BrowserActions.type(driver, inpAvailable_206,Available_206, "Available_206");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_781(WebDriver driver,String Exceptions_781) {
		BrowserActions.type(driver, inpExceptions_781,Exceptions_781, "Exceptions_781");
		return this;
	}
	public WorkQueueInfoPage enterStarted_757(WebDriver driver,String Started_757) {
		BrowserActions.type(driver, inpStarted_757,Started_757, "Started_757");
		return this;
	}
	public WorkQueueInfoPage clickRestart_431(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_431,"Restart_431");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_229(WebDriver driver,String WorkQueue_229) {
		BrowserActions.type(driver, inpWorkQueue_229,WorkQueue_229, "WorkQueue_229");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_469(WebDriver driver,String WorkQueue_469) {
		BrowserActions.type(driver, inpWorkQueue_469,WorkQueue_469, "WorkQueue_469");
		return this;
	}
	public WorkQueueInfoPage selectFilter(WebDriver driver,String Filter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFilter,Filter,"Filter");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_522(WebDriver driver,String ClusterWideState_522) {
		BrowserActions.type(driver, inpClusterWideState_522,ClusterWideState_522, "ClusterWideState_522");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_278(WebDriver driver,String Available_278) {
		BrowserActions.type(driver, inpAvailable_278,Available_278, "Available_278");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_432(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_432,"DownloadHistory_432");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_790(WebDriver driver,String Exceptions_790) {
		BrowserActions.type(driver, inpExceptions_790,Exceptions_790, "Exceptions_790");
		return this;
	}
	public WorkQueueInfoPage enterStarted_748(WebDriver driver,String Started_748) {
		BrowserActions.type(driver, inpStarted_748,Started_748, "Started_748");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_799(WebDriver driver,String Exceptions_799) {
		BrowserActions.type(driver, inpExceptions_799,Exceptions_799, "Exceptions_799");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_488(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_488,"RunWriter_488");
		return this;
	}
	public WorkQueueInfoPage enterFailed_292(WebDriver driver,String Failed_292) {
		BrowserActions.type(driver, inpFailed_292,Failed_292, "Failed_292");
		return this;
	}
	public WorkQueueInfoPage clickNotify_417(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_417,"Notify_417");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_510(WebDriver driver,String ClusterWideState_510) {
		BrowserActions.type(driver, inpClusterWideState_510,ClusterWideState_510, "ClusterWideState_510");
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
	public WorkQueueInfoPage clickDownloadHistory_444(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_444,"DownloadHistory_444");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_248(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_248,"RunWriter_248");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_481(WebDriver driver,String WorkQueue_481) {
		BrowserActions.type(driver, inpWorkQueue_481,WorkQueue_481, "WorkQueue_481");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_494(WebDriver driver,String Available_494) {
		BrowserActions.type(driver, inpAvailable_494,Available_494, "Available_494");
		return this;
	}
	public WorkQueueInfoPage enterStarted_739(WebDriver driver,String Started_739) {
		BrowserActions.type(driver, inpStarted_739,Started_739, "Started_739");
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
	public WorkQueueInfoPage enterUpFor_696(WebDriver driver,String UpFor_696) {
		BrowserActions.type(driver, inpUpFor_696,UpFor_696, "UpFor_696");
		return this;
	}
	public WorkQueueInfoPage clickNotify_633(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_633,"Notify_633");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_476(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_476,"RunWriter_476");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_546(WebDriver driver,String ClusterWideState_546) {
		BrowserActions.type(driver, inpClusterWideState_546,ClusterWideState_546, "ClusterWideState_546");
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
	public WorkQueueInfoPage enterStarted_730(WebDriver driver,String Started_730) {
		BrowserActions.type(driver, inpStarted_730,Started_730, "Started_730");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_236(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_236,"RunWriter_236");
		return this;
	}
	public WorkQueueInfoPage clickRestart_419(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_419,"Restart_419");
		return this;
	}
	public WorkQueueInfoPage clickRestart_407(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_407,"Restart_407");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_482(WebDriver driver,String Available_482) {
		BrowserActions.type(driver, inpAvailable_482,Available_482, "Available_482");
		return this;
	}
	public WorkQueueInfoPage clickRestart_647(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_647,"Restart_647");
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
	public WorkQueueInfoPage enterWorkQueue_493(WebDriver driver,String WorkQueue_493) {
		BrowserActions.type(driver, inpWorkQueue_493,WorkQueue_493, "WorkQueue_493");
		return this;
	}
	public WorkQueueInfoPage clickNotify_405(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_405,"Notify_405");
		return this;
	}
	public WorkQueueInfoPage clickNotify_645(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_645,"Notify_645");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_224(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_224,"RunWriter_224");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_464(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_464,"RunWriter_464");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_534(WebDriver driver,String ClusterWideState_534) {
		BrowserActions.type(driver, inpClusterWideState_534,ClusterWideState_534, "ClusterWideState_534");
		return this;
	}
	public WorkQueueInfoPage enterStarted_721(WebDriver driver,String Started_721) {
		BrowserActions.type(driver, inpStarted_721,Started_721, "Started_721");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_420(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_420,"DownloadHistory_420");
		return this;
	}
	public WorkQueueInfoPage clickRestart_635(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_635,"Restart_635");
		return this;
	}
	public WorkQueueInfoPage clickNotify_213(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_213,"Notify_213");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_411(WebDriver driver,String CheckedOut_411) {
		BrowserActions.type(driver, inpCheckedOut_411,CheckedOut_411, "CheckedOut_411");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_461(WebDriver driver,String ExecutorsRunning_461) {
		BrowserActions.type(driver, inpExecutorsRunning_461,ExecutorsRunning_461, "ExecutorsRunning_461");
		return this;
	}
	public WorkQueueInfoPage clickStop_34(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_34,"Stop_34");
		return this;
	}
	public WorkQueueInfoPage clickNotify_453(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_453,"Notify_453");
		return this;
	}
	public WorkQueueInfoPage clickRestart_870(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_870,"Restart_870");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_221(WebDriver driver,String ExecutorsRunning_221) {
		BrowserActions.type(driver, inpExecutorsRunning_221,ExecutorsRunning_221, "ExecutorsRunning_221");
		return this;
	}
	public WorkQueueInfoPage clickRefresh(WebDriver driver)  {
		BrowserActions.click(driver, btnRefresh,"Refresh");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_84(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_84,"DownloadHistory_84");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_638(WebDriver driver,String Available_638) {
		BrowserActions.type(driver, inpAvailable_638,Available_638, "Available_638");
		return this;
	}
	public WorkQueueInfoPage enterStarted_712(WebDriver driver,String Started_712) {
		BrowserActions.type(driver, inpStarted_712,Started_712, "Started_712");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_6(WebDriver driver,String ClusterWideState_6) {
		BrowserActions.type(driver, inpClusterWideState_6,ClusterWideState_6, "ClusterWideState_6");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_861(WebDriver driver,String Processeditems_861) {
		BrowserActions.type(driver, inpProcesseditems_861,Processeditems_861, "Processeditems_861");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_31(WebDriver driver,String WriterStatus_31) {
		BrowserActions.type(driver, inpWriterStatus_31,WriterStatus_31, "WriterStatus_31");
		return this;
	}
	public WorkQueueInfoPage clickRestart_623(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_623,"Restart_623");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue(WebDriver driver,String WorkQueue) {
		BrowserActions.type(driver, inpWorkQueue,WorkQueue, "WorkQueue");
		return this;
	}
	public WorkQueueInfoPage enterStarted_703(WebDriver driver,String Started_703) {
		BrowserActions.type(driver, inpStarted_703,Started_703, "Started_703");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_423(WebDriver driver,String CheckedOut_423) {
		BrowserActions.type(driver, inpCheckedOut_423,CheckedOut_423, "CheckedOut_423");
		return this;
	}
	public WorkQueueInfoPage clickNotify_225(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_225,"Notify_225");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_473(WebDriver driver,String ExecutorsRunning_473) {
		BrowserActions.type(driver, inpExecutorsRunning_473,ExecutorsRunning_473, "ExecutorsRunning_473");
		return this;
	}
	public WorkQueueInfoPage clickStop_46(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_46,"Stop_46");
		return this;
	}
	public WorkQueueInfoPage clickNotify_465(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_465,"Notify_465");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_233(WebDriver driver,String ExecutorsRunning_233) {
		BrowserActions.type(driver, inpExecutorsRunning_233,ExecutorsRunning_233, "ExecutorsRunning_233");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_72(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_72,"DownloadHistory_72");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_626(WebDriver driver,String Available_626) {
		BrowserActions.type(driver, inpAvailable_626,Available_626, "Available_626");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_852(WebDriver driver,String Processeditems_852) {
		BrowserActions.type(driver, inpProcesseditems_852,Processeditems_852, "Processeditems_852");
		return this;
	}
	public WorkQueueInfoPage clickRestart_611(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_611,"Restart_611");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_435(WebDriver driver,String CheckedOut_435) {
		BrowserActions.type(driver, inpCheckedOut_435,CheckedOut_435, "CheckedOut_435");
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
	public WorkQueueInfoPage enterWorkQueue_601(WebDriver driver,String WorkQueue_601) {
		BrowserActions.type(driver, inpWorkQueue_601,WorkQueue_601, "WorkQueue_601");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_437(WebDriver driver,String ExecutorsRunning_437) {
		BrowserActions.type(driver, inpExecutorsRunning_437,ExecutorsRunning_437, "ExecutorsRunning_437");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_776(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_776,"StartedDateIcon_776");
		return this;
	}
	public WorkQueueInfoPage clickNotify_429(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_429,"Notify_429");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_614(WebDriver driver,String Available_614) {
		BrowserActions.type(driver, inpAvailable_614,Available_614, "Available_614");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus(WebDriver driver,String WriterStatus) {
		BrowserActions.type(driver, inpWriterStatus,WriterStatus, "WriterStatus");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_55(WebDriver driver,String WriterStatus_55) {
		BrowserActions.type(driver, inpWriterStatus_55,WriterStatus_55, "WriterStatus_55");
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
	public WorkQueueInfoPage clickNotify_441(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_441,"Notify_441");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_447(WebDriver driver,String CheckedOut_447) {
		BrowserActions.type(driver, inpCheckedOut_447,CheckedOut_447, "CheckedOut_447");
		return this;
	}
	public WorkQueueInfoPage clickStop_22(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_22,"Stop_22");
		return this;
	}
	public WorkQueueInfoPage clickNotify_201(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_201,"Notify_201");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_613(WebDriver driver,String WorkQueue_613) {
		BrowserActions.type(driver, inpWorkQueue_613,WorkQueue_613, "WorkQueue_613");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_794(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_794,"StartedDateIcon_794");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_785(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_785,"StartedDateIcon_785");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_96(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_96,"DownloadHistory_96");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_449(WebDriver driver,String ExecutorsRunning_449) {
		BrowserActions.type(driver, inpExecutorsRunning_449,ExecutorsRunning_449, "ExecutorsRunning_449");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_209(WebDriver driver,String ExecutorsRunning_209) {
		BrowserActions.type(driver, inpExecutorsRunning_209,ExecutorsRunning_209, "ExecutorsRunning_209");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_602(WebDriver driver,String Available_602) {
		BrowserActions.type(driver, inpAvailable_602,Available_602, "Available_602");
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
	public WorkQueueInfoPage enterCheckedOut_459(WebDriver driver,String CheckedOut_459) {
		BrowserActions.type(driver, inpCheckedOut_459,CheckedOut_459, "CheckedOut_459");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_700(WebDriver driver,String Exceptions_700) {
		BrowserActions.type(driver, inpExceptions_700,Exceptions_700, "Exceptions_700");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_48(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_48,"DownloadHistory_48");
		return this;
	}
	public WorkQueueInfoPage enterHostname_706(WebDriver driver,String Hostname_706) {
		BrowserActions.type(driver, inpHostname_706,Hostname_706, "Hostname_706");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_625(WebDriver driver,String WorkQueue_625) {
		BrowserActions.type(driver, inpWorkQueue_625,WorkQueue_625, "WorkQueue_625");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_29(WebDriver driver,String ExecutorsRunning_29) {
		BrowserActions.type(driver, inpExecutorsRunning_29,ExecutorsRunning_29, "ExecutorsRunning_29");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_709(WebDriver driver,String Exceptions_709) {
		BrowserActions.type(driver, inpExceptions_709,Exceptions_709, "Exceptions_709");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_413(WebDriver driver,String ExecutorsRunning_413) {
		BrowserActions.type(driver, inpExecutorsRunning_413,ExecutorsRunning_413, "ExecutorsRunning_413");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_825(WebDriver driver,String Processeditems_825) {
		BrowserActions.type(driver, inpProcesseditems_825,Processeditems_825, "Processeditems_825");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_758(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_758,"StartedDateIcon_758");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_434(WebDriver driver,String Available_434) {
		BrowserActions.type(driver, inpAvailable_434,Available_434, "Available_434");
		return this;
	}
	public WorkQueueInfoPage clickStop_634(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_634,"Stop_634");
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
	public WorkQueueInfoPage enterExecutorsRunning_17(WebDriver driver,String ExecutorsRunning_17) {
		BrowserActions.type(driver, inpExecutorsRunning_17,ExecutorsRunning_17, "ExecutorsRunning_17");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_36(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_36,"DownloadHistory_36");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_718(WebDriver driver,String Exceptions_718) {
		BrowserActions.type(driver, inpExceptions_718,Exceptions_718, "Exceptions_718");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_425(WebDriver driver,String ExecutorsRunning_425) {
		BrowserActions.type(driver, inpExecutorsRunning_425,ExecutorsRunning_425, "ExecutorsRunning_425");
		return this;
	}
	public WorkQueueInfoPage enterStatus_792(WebDriver driver,String Status_792) {
		BrowserActions.type(driver, inpStatus_792,Status_792, "Status_792");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_816(WebDriver driver,String Processeditems_816) {
		BrowserActions.type(driver, inpProcesseditems_816,Processeditems_816, "Processeditems_816");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_637(WebDriver driver,String WorkQueue_637) {
		BrowserActions.type(driver, inpWorkQueue_637,WorkQueue_637, "WorkQueue_637");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_767(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_767,"StartedDateIcon_767");
		return this;
	}
	public WorkQueueInfoPage clickStop_406(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_406,"Stop_406");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_600(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_600,"DownloadHistory_600");
		return this;
	}
	public WorkQueueInfoPage clickStop_646(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_646,"Stop_646");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_422(WebDriver driver,String Available_422) {
		BrowserActions.type(driver, inpAvailable_422,Available_422, "Available_422");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_607(WebDriver driver,String WriterStatus_607) {
		BrowserActions.type(driver, inpWriterStatus_607,WriterStatus_607, "WriterStatus_607");
		return this;
	}
	public WorkQueueInfoPage clickNotify_477(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_477,"Notify_477");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_231(WebDriver driver,String CheckedOut_231) {
		BrowserActions.type(driver, inpCheckedOut_231,CheckedOut_231, "CheckedOut_231");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_641(WebDriver driver,String ExecutorsRunning_641) {
		BrowserActions.type(driver, inpExecutorsRunning_641,ExecutorsRunning_641, "ExecutorsRunning_641");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_727(WebDriver driver,String Exceptions_727) {
		BrowserActions.type(driver, inpExceptions_727,Exceptions_727, "Exceptions_727");
		return this;
	}
	public WorkQueueInfoPage clickNotify_237(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_237,"Notify_237");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_471(WebDriver driver,String CheckedOut_471) {
		BrowserActions.type(driver, inpCheckedOut_471,CheckedOut_471, "CheckedOut_471");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_409(WebDriver driver,String WorkQueue_409) {
		BrowserActions.type(driver, inpWorkQueue_409,WorkQueue_409, "WorkQueue_409");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_60(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_60,"DownloadHistory_60");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_731(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_731,"StartedDateIcon_731");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_91(WebDriver driver,String WriterStatus_91) {
		BrowserActions.type(driver, inpWriterStatus_91,WriterStatus_91, "WriterStatus_91");
		return this;
	}
	public WorkQueueInfoPage clickStop_610(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_610,"Stop_610");
		return this;
	}
	public WorkQueueInfoPage enterAvailable_410(WebDriver driver,String Available_410) {
		BrowserActions.type(driver, inpAvailable_410,Available_410, "Available_410");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_843(WebDriver driver,String Processeditems_843) {
		BrowserActions.type(driver, inpProcesseditems_843,Processeditems_843, "Processeditems_843");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_619(WebDriver driver,String WriterStatus_619) {
		BrowserActions.type(driver, inpWriterStatus_619,WriterStatus_619, "WriterStatus_619");
		return this;
	}
	public WorkQueueInfoPage clickNotify_489(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_489,"Notify_489");
		return this;
	}
	public WorkQueueInfoPage enterExceptions_736(WebDriver driver,String Exceptions_736) {
		BrowserActions.type(driver, inpExceptions_736,Exceptions_736, "Exceptions_736");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_243(WebDriver driver,String CheckedOut_243) {
		BrowserActions.type(driver, inpCheckedOut_243,CheckedOut_243, "CheckedOut_243");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_483(WebDriver driver,String CheckedOut_483) {
		BrowserActions.type(driver, inpCheckedOut_483,CheckedOut_483, "CheckedOut_483");
		return this;
	}
	public WorkQueueInfoPage clickNotify_249(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_249,"Notify_249");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_740(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_740,"StartedDateIcon_740");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_401(WebDriver driver,String ExecutorsRunning_401) {
		BrowserActions.type(driver, inpExecutorsRunning_401,ExecutorsRunning_401, "ExecutorsRunning_401");
		return this;
	}
	public WorkQueueInfoPage clickStartedDateIcon_749(WebDriver driver)  {
		BrowserActions.click(driver, btnStartedDateIcon_749,"StartedDateIcon_749");
		return this;
	}
	public WorkQueueInfoPage clickStop_622(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_622,"Stop_622");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_7(WebDriver driver,String WriterStatus_7) {
		BrowserActions.type(driver, inpWriterStatus_7,WriterStatus_7, "WriterStatus_7");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_834(WebDriver driver,String Processeditems_834) {
		BrowserActions.type(driver, inpProcesseditems_834,Processeditems_834, "Processeditems_834");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_698(WebDriver driver,String MaxNumberofWorkers_698) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_698,MaxNumberofWorkers_698, "MaxNumberofWorkers_698");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_728(WebDriver driver,String Faileditems_728) {
		BrowserActions.type(driver, inpFaileditems_728,Faileditems_728, "Faileditems_728");
		return this;
	}
	public WorkQueueInfoPage enterHostname_742(WebDriver driver,String Hostname_742) {
		BrowserActions.type(driver, inpHostname_742,Hostname_742, "Hostname_742");
		return this;
	}
	public WorkQueueInfoPage clickNotify_177(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_177,"Notify_177");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_680(WebDriver driver,String MaxNumberofWorkers_680) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_680,MaxNumberofWorkers_680, "MaxNumberofWorkers_680");
		return this;
	}
	public WorkQueueInfoPage enterStatus_765(WebDriver driver,String Status_765) {
		BrowserActions.type(driver, inpStatus_765,Status_765, "Status_765");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_294(WebDriver driver,String ClusterWideState_294) {
		BrowserActions.type(driver, inpClusterWideState_294,ClusterWideState_294, "ClusterWideState_294");
		return this;
	}
	public WorkQueueInfoPage clickNotify_33(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_33,"Notify_33");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_689(WebDriver driver,String MaxNumberofWorkers_689) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_689,MaxNumberofWorkers_689, "MaxNumberofWorkers_689");
		return this;
	}
	public WorkQueueInfoPage enterFailed_424(WebDriver driver,String Failed_424) {
		BrowserActions.type(driver, inpFailed_424,Failed_424, "Failed_424");
		return this;
	}
	public WorkQueueInfoPage clickStop_430(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_430,"Stop_430");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_671(WebDriver driver,String MaxNumberofWorkers_671) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_671,MaxNumberofWorkers_671, "MaxNumberofWorkers_671");
		return this;
	}
	public WorkQueueInfoPage enterHostname_733(WebDriver driver,String Hostname_733) {
		BrowserActions.type(driver, inpHostname_733,Hostname_733, "Hostname_733");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_631(WebDriver driver,String WriterStatus_631) {
		BrowserActions.type(driver, inpWriterStatus_631,WriterStatus_631, "WriterStatus_631");
		return this;
	}
	public WorkQueueInfoPage enterStatus_756(WebDriver driver,String Status_756) {
		BrowserActions.type(driver, inpStatus_756,Status_756, "Status_756");
		return this;
	}
	public WorkQueueInfoPage clickNotify_189(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_189,"Notify_189");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_719(WebDriver driver,String Faileditems_719) {
		BrowserActions.type(driver, inpFaileditems_719,Faileditems_719, "Faileditems_719");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_282(WebDriver driver,String ClusterWideState_282) {
		BrowserActions.type(driver, inpClusterWideState_282,ClusterWideState_282, "ClusterWideState_282");
		return this;
	}
	public WorkQueueInfoPage enterFailed_412(WebDriver driver,String Failed_412) {
		BrowserActions.type(driver, inpFailed_412,Failed_412, "Failed_412");
		return this;
	}
	public WorkQueueInfoPage clickByExecutors_650(WebDriver driver)  {
		BrowserActions.click(driver, btnByExecutors_650,"ByExecutors_650");
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
	public WorkQueueInfoPage enterFaileditems_710(WebDriver driver,String Faileditems_710) {
		BrowserActions.type(driver, inpFaileditems_710,Faileditems_710, "Faileditems_710");
		return this;
	}
	public WorkQueueInfoPage clickStop_202(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_202,"Stop_202");
		return this;
	}
	public WorkQueueInfoPage clickStop_442(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_442,"Stop_442");
		return this;
	}
	public WorkQueueInfoPage clickNotify_393(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_393,"Notify_393");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_662(WebDriver driver,String MaxNumberofWorkers_662) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_662,MaxNumberofWorkers_662, "MaxNumberofWorkers_662");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_403(WebDriver driver,String WriterStatus_403) {
		BrowserActions.type(driver, inpWriterStatus_403,WriterStatus_403, "WriterStatus_403");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_746(WebDriver driver,String Faileditems_746) {
		BrowserActions.type(driver, inpFaileditems_746,Faileditems_746, "Faileditems_746");
		return this;
	}
	public WorkQueueInfoPage enterFailed_436(WebDriver driver,String Failed_436) {
		BrowserActions.type(driver, inpFailed_436,Failed_436, "Failed_436");
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
	public WorkQueueInfoPage enterWriterStatus_643(WebDriver driver,String WriterStatus_643) {
		BrowserActions.type(driver, inpWriterStatus_643,WriterStatus_643, "WriterStatus_643");
		return this;
	}
	public WorkQueueInfoPage enterHostname_724(WebDriver driver,String Hostname_724) {
		BrowserActions.type(driver, inpHostname_724,Hostname_724, "Hostname_724");
		return this;
	}
	public WorkQueueInfoPage enterStatus_783(WebDriver driver,String Status_783) {
		BrowserActions.type(driver, inpStatus_783,Status_783, "Status_783");
		return this;
	}
	public WorkQueueInfoPage clickNotify(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify,"Notify");
		return this;
	}
	public WorkQueueInfoPage clickStop_418(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_418,"Stop_418");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems(WebDriver driver,String Faileditems) {
		BrowserActions.type(driver, inpFaileditems,Faileditems, "Faileditems");
		return this;
	}
	public WorkQueueInfoPage clickNotify_57(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_57,"Notify_57");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_737(WebDriver driver,String Faileditems_737) {
		BrowserActions.type(driver, inpFaileditems_737,Faileditems_737, "Faileditems_737");
		return this;
	}
	public WorkQueueInfoPage clickNotify_165(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_165,"Notify_165");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_415(WebDriver driver,String WriterStatus_415) {
		BrowserActions.type(driver, inpWriterStatus_415,WriterStatus_415, "WriterStatus_415");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_293(WebDriver driver,String ExecutorsRunning_293) {
		BrowserActions.type(driver, inpExecutorsRunning_293,ExecutorsRunning_293, "ExecutorsRunning_293");
		return this;
	}
	public WorkQueueInfoPage enterHostname_715(WebDriver driver,String Hostname_715) {
		BrowserActions.type(driver, inpHostname_715,Hostname_715, "Hostname_715");
		return this;
	}
	public WorkQueueInfoPage enterStatus_774(WebDriver driver,String Status_774) {
		BrowserActions.type(driver, inpStatus_774,Status_774, "Status_774");
		return this;
	}
	public WorkQueueInfoPage clickWorkitems_651(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkitems_651,"Workitems_651");
		return this;
	}
	public WorkQueueInfoPage clickWorkitems(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkitems,"Workitems");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_653(WebDriver driver,String MaxNumberofWorkers_653) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_653,MaxNumberofWorkers_653, "MaxNumberofWorkers_653");
		return this;
	}
	public WorkQueueInfoPage clickNotify_69(WebDriver driver)  {
		BrowserActions.click(driver, btnNotify_69,"Notify_69");
		return this;
	}
	public WorkQueueInfoPage enterFailed_616(WebDriver driver,String Failed_616) {
		BrowserActions.type(driver, inpFailed_616,Failed_616, "Failed_616");
		return this;
	}
	public WorkQueueInfoPage enterHostname_787(WebDriver driver,String Hostname_787) {
		BrowserActions.type(driver, inpHostname_787,Hostname_787, "Hostname_787");
		return this;
	}
	public WorkQueueInfoPage enterStatus_729(WebDriver driver,String Status_729) {
		BrowserActions.type(driver, inpStatus_729,Status_729, "Status_729");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_427(WebDriver driver,String WriterStatus_427) {
		BrowserActions.type(driver, inpWriterStatus_427,WriterStatus_427, "WriterStatus_427");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_780(WebDriver driver,String Processeditems_780) {
		BrowserActions.type(driver, inpProcesseditems_780,Processeditems_780, "Processeditems_780");
		return this;
	}
	public WorkQueueInfoPage enterStatus_720(WebDriver driver,String Status_720) {
		BrowserActions.type(driver, inpStatus_720,Status_720, "Status_720");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_44(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_44,"RunWriter_44");
		return this;
	}
	public WorkQueueInfoPage clickStop_82(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_82,"Stop_82");
		return this;
	}
	public WorkQueueInfoPage clickStop_238(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_238,"Stop_238");
		return this;
	}
	public WorkQueueInfoPage clickStop_478(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_478,"Stop_478");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_789(WebDriver driver,String Processeditems_789) {
		BrowserActions.type(driver, inpProcesseditems_789,Processeditems_789, "Processeditems_789");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_507(WebDriver driver,String CheckedOut_507) {
		BrowserActions.type(driver, inpCheckedOut_507,CheckedOut_507, "CheckedOut_507");
		return this;
	}
	public WorkQueueInfoPage enterHostname_778(WebDriver driver,String Hostname_778) {
		BrowserActions.type(driver, inpHostname_778,Hostname_778, "Hostname_778");
		return this;
	}
	public WorkQueueInfoPage enterFailed_604(WebDriver driver,String Failed_604) {
		BrowserActions.type(driver, inpFailed_604,Failed_604, "Failed_604");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_771(WebDriver driver,String Processeditems_771) {
		BrowserActions.type(driver, inpProcesseditems_771,Processeditems_771, "Processeditems_771");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_439(WebDriver driver,String WriterStatus_439) {
		BrowserActions.type(driver, inpWriterStatus_439,WriterStatus_439, "WriterStatus_439");
		return this;
	}
	public WorkQueueInfoPage enterStatus_711(WebDriver driver,String Status_711) {
		BrowserActions.type(driver, inpStatus_711,Status_711, "Status_711");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_32(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_32,"RunWriter_32");
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
	public WorkQueueInfoPage enterMaxNumberofWorkers_860(WebDriver driver,String MaxNumberofWorkers_860) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_860,MaxNumberofWorkers_860, "MaxNumberofWorkers_860");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_701(WebDriver driver,String Faileditems_701) {
		BrowserActions.type(driver, inpFaileditems_701,Faileditems_701, "Faileditems_701");
		return this;
	}
	public WorkQueueInfoPage enterStatus_747(WebDriver driver,String Status_747) {
		BrowserActions.type(driver, inpStatus_747,Status_747, "Status_747");
		return this;
	}
	public WorkQueueInfoPage enterHostname_760(WebDriver driver,String Hostname_760) {
		BrowserActions.type(driver, inpHostname_760,Hostname_760, "Hostname_760");
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
	public WorkQueueInfoPage enterExecutorsRunning_485(WebDriver driver,String ExecutorsRunning_485) {
		BrowserActions.type(driver, inpExecutorsRunning_485,ExecutorsRunning_485, "ExecutorsRunning_485");
		return this;
	}
	public WorkQueueInfoPage enterHostname_769(WebDriver driver,String Hostname_769) {
		BrowserActions.type(driver, inpHostname_769,Hostname_769, "Hostname_769");
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
	public WorkQueueInfoPage clickStop_454(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_454,"Stop_454");
		return this;
	}
	public WorkQueueInfoPage enterFailed_640(WebDriver driver,String Failed_640) {
		BrowserActions.type(driver, inpFailed_640,Failed_640, "Failed_640");
		return this;
	}
	public WorkQueueInfoPage enterCheckedOut_519(WebDriver driver,String CheckedOut_519) {
		BrowserActions.type(driver, inpCheckedOut_519,CheckedOut_519, "CheckedOut_519");
		return this;
	}
	public WorkQueueInfoPage enterFailed_628(WebDriver driver,String Failed_628) {
		BrowserActions.type(driver, inpFailed_628,Failed_628, "Failed_628");
		return this;
	}
	public WorkQueueInfoPage enterStatus_738(WebDriver driver,String Status_738) {
		BrowserActions.type(driver, inpStatus_738,Status_738, "Status_738");
		return this;
	}
	public WorkQueueInfoPage enterHostname_751(WebDriver driver,String Hostname_751) {
		BrowserActions.type(driver, inpHostname_751,Hostname_751, "Hostname_751");
		return this;
	}
	public WorkQueueInfoPage enterAvailable(WebDriver driver,String Available) {
		BrowserActions.type(driver, inpAvailable,Available, "Available");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_451(WebDriver driver,String WriterStatus_451) {
		BrowserActions.type(driver, inpWriterStatus_451,WriterStatus_451, "WriterStatus_451");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_257(WebDriver driver,String ExecutorsRunning_257) {
		BrowserActions.type(driver, inpExecutorsRunning_257,ExecutorsRunning_257, "ExecutorsRunning_257");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_211(WebDriver driver,String WriterStatus_211) {
		BrowserActions.type(driver, inpWriterStatus_211,WriterStatus_211, "WriterStatus_211");
		return this;
	}
	public WorkQueueInfoPage enterExecutorsRunning_497(WebDriver driver,String ExecutorsRunning_497) {
		BrowserActions.type(driver, inpExecutorsRunning_497,ExecutorsRunning_497, "ExecutorsRunning_497");
		return this;
	}
	public WorkQueueInfoPage clickStop_70(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_70,"Stop_70");
		return this;
	}
	public WorkQueueInfoPage clickStop_226(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_226,"Stop_226");
		return this;
	}
	public WorkQueueInfoPage clickStop_466(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_466,"Stop_466");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_851(WebDriver driver,String MaxNumberofWorkers_851) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_851,MaxNumberofWorkers_851, "MaxNumberofWorkers_851");
		return this;
	}
	public WorkQueueInfoPage enterProcesseditems_798(WebDriver driver,String Processeditems_798) {
		BrowserActions.type(driver, inpProcesseditems_798,Processeditems_798, "Processeditems_798");
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
	public WorkQueueInfoPage clickDownloadHistory_480(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_480,"DownloadHistory_480");
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
	public WorkQueueInfoPage enterUpFor_831(WebDriver driver,String UpFor_831) {
		BrowserActions.type(driver, inpUpFor_831,UpFor_831, "UpFor_831");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_145(WebDriver driver,String WorkQueue_145) {
		BrowserActions.type(driver, inpWorkQueue_145,WorkQueue_145, "WorkQueue_145");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_450(WebDriver driver,String ClusterWideState_450) {
		BrowserActions.type(driver, inpClusterWideState_450,ClusterWideState_450, "ClusterWideState_450");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_463(WebDriver driver,String WriterStatus_463) {
		BrowserActions.type(driver, inpWriterStatus_463,WriterStatus_463, "WriterStatus_463");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_332(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_332,"RunWriter_332");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_572(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_572,"RunWriter_572");
		return this;
	}
	public WorkQueueInfoPage enterFailed_268(WebDriver driver,String Failed_268) {
		BrowserActions.type(driver, inpFailed_268,Failed_268, "Failed_268");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_842(WebDriver driver,String MaxNumberofWorkers_842) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_842,MaxNumberofWorkers_842, "MaxNumberofWorkers_842");
		return this;
	}
	public WorkQueueInfoPage clickStop_286(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_286,"Stop_286");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_492(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_492,"DownloadHistory_492");
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
	public WorkQueueInfoPage enterUpFor_840(WebDriver driver,String UpFor_840) {
		BrowserActions.type(driver, inpUpFor_840,UpFor_840, "UpFor_840");
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
	public WorkQueueInfoPage enterWorkQueue_97(WebDriver driver,String WorkQueue_97) {
		BrowserActions.type(driver, inpWorkQueue_97,WorkQueue_97, "WorkQueue_97");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_475(WebDriver driver,String WriterStatus_475) {
		BrowserActions.type(driver, inpWriterStatus_475,WriterStatus_475, "WriterStatus_475");
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
	public WorkQueueInfoPage clickRunWriter_560(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_560,"RunWriter_560");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_833(WebDriver driver,String MaxNumberofWorkers_833) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_833,MaxNumberofWorkers_833, "MaxNumberofWorkers_833");
		return this;
	}
	public WorkQueueInfoPage enterFailed_256(WebDriver driver,String Failed_256) {
		BrowserActions.type(driver, inpFailed_256,Failed_256, "Failed_256");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_438(WebDriver driver,String ClusterWideState_438) {
		BrowserActions.type(driver, inpClusterWideState_438,ClusterWideState_438, "ClusterWideState_438");
		return this;
	}
	public WorkQueueInfoPage enterFailed_496(WebDriver driver,String Failed_496) {
		BrowserActions.type(driver, inpFailed_496,Failed_496, "Failed_496");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_791(WebDriver driver,String Faileditems_791) {
		BrowserActions.type(driver, inpFaileditems_791,Faileditems_791, "Faileditems_791");
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
	public WorkQueueInfoPage clickStop_490(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_490,"Stop_490");
		return this;
	}
	public WorkQueueInfoPage clickRestart_179(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_179,"Restart_179");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_487(WebDriver driver,String WriterStatus_487) {
		BrowserActions.type(driver, inpWriterStatus_487,WriterStatus_487, "WriterStatus_487");
		return this;
	}
	public WorkQueueInfoPage enterStatus_702(WebDriver driver,String Status_702) {
		BrowserActions.type(driver, inpStatus_702,Status_702, "Status_702");
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
	public WorkQueueInfoPage enterUpFor_813(WebDriver driver,String UpFor_813) {
		BrowserActions.type(driver, inpUpFor_813,UpFor_813, "UpFor_813");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_804(WebDriver driver,String UpFor_804) {
		BrowserActions.type(driver, inpUpFor_804,UpFor_804, "UpFor_804");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_222(WebDriver driver,String ClusterWideState_222) {
		BrowserActions.type(driver, inpClusterWideState_222,ClusterWideState_222, "ClusterWideState_222");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_462(WebDriver driver,String ClusterWideState_462) {
		BrowserActions.type(driver, inpClusterWideState_462,ClusterWideState_462, "ClusterWideState_462");
		return this;
	}
	public WorkQueueInfoPage enterFailed_280(WebDriver driver,String Failed_280) {
		BrowserActions.type(driver, inpFailed_280,Failed_280, "Failed_280");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_216(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_216,"DownloadHistory_216");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_456(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_456,"DownloadHistory_456");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState(WebDriver driver,String ClusterWideState) {
		BrowserActions.type(driver, inpClusterWideState,ClusterWideState, "ClusterWideState");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_824(WebDriver driver,String MaxNumberofWorkers_824) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_824,MaxNumberofWorkers_824, "MaxNumberofWorkers_824");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_73(WebDriver driver,String WorkQueue_73) {
		BrowserActions.type(driver, inpWorkQueue_73,WorkQueue_73, "WorkQueue_73");
		return this;
	}
	public WorkQueueInfoPage clickStop_262(WebDriver driver)  {
		BrowserActions.click(driver, btnStop_262,"Stop_262");
		return this;
	}
	public WorkQueueInfoPage enterHostname_796(WebDriver driver,String Hostname_796) {
		BrowserActions.type(driver, inpHostname_796,Hostname_796, "Hostname_796");
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
	public WorkQueueInfoPage enterWriterStatus_499(WebDriver driver,String WriterStatus_499) {
		BrowserActions.type(driver, inpWriterStatus_499,WriterStatus_499, "WriterStatus_499");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_259(WebDriver driver,String WriterStatus_259) {
		BrowserActions.type(driver, inpWriterStatus_259,WriterStatus_259, "WriterStatus_259");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_822(WebDriver driver,String UpFor_822) {
		BrowserActions.type(driver, inpUpFor_822,UpFor_822, "UpFor_822");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_210(WebDriver driver,String ClusterWideState_210) {
		BrowserActions.type(driver, inpClusterWideState_210,ClusterWideState_210, "ClusterWideState_210");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_815(WebDriver driver,String MaxNumberofWorkers_815) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_815,MaxNumberofWorkers_815, "MaxNumberofWorkers_815");
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
	public WorkQueueInfoPage clickDownloadHistory_468(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_468,"DownloadHistory_468");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_548(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_548,"RunWriter_548");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_61(WebDriver driver,String WorkQueue_61) {
		BrowserActions.type(driver, inpWorkQueue_61,WorkQueue_61, "WorkQueue_61");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_181(WebDriver driver,String WorkQueue_181) {
		BrowserActions.type(driver, inpWorkQueue_181,WorkQueue_181, "WorkQueue_181");
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
	public WorkQueueInfoPage enterActiveThreadsCount(WebDriver driver,String ActiveThreadsCount) {
		BrowserActions.type(driver, inpActiveThreadsCount,ActiveThreadsCount, "ActiveThreadsCount");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_271(WebDriver driver,String WriterStatus_271) {
		BrowserActions.type(driver, inpWriterStatus_271,WriterStatus_271, "WriterStatus_271");
		return this;
	}
	public WorkQueueInfoPage enterFailed_460(WebDriver driver,String Failed_460) {
		BrowserActions.type(driver, inpFailed_460,Failed_460, "Failed_460");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_486(WebDriver driver,String ClusterWideState_486) {
		BrowserActions.type(driver, inpClusterWideState_486,ClusterWideState_486, "ClusterWideState_486");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_246(WebDriver driver,String ClusterWideState_246) {
		BrowserActions.type(driver, inpClusterWideState_246,ClusterWideState_246, "ClusterWideState_246");
		return this;
	}
	public WorkQueueInfoPage enterMaxNumberofWorkers_806(WebDriver driver,String MaxNumberofWorkers_806) {
		BrowserActions.type(driver, inpMaxNumberofWorkers_806,MaxNumberofWorkers_806, "MaxNumberofWorkers_806");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_764(WebDriver driver,String Faileditems_764) {
		BrowserActions.type(driver, inpFaileditems_764,Faileditems_764, "Faileditems_764");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_276(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_276,"DownloadHistory_276");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_536(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_536,"RunWriter_536");
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
	public WorkQueueInfoPage enterFaileditems_755(WebDriver driver,String Faileditems_755) {
		BrowserActions.type(driver, inpFaileditems_755,Faileditems_755, "Faileditems_755");
		return this;
	}
	public WorkQueueInfoPage enterFailed_448(WebDriver driver,String Failed_448) {
		BrowserActions.type(driver, inpFailed_448,Failed_448, "Failed_448");
		return this;
	}
	public WorkQueueInfoPage clickByTasks_868(WebDriver driver)  {
		BrowserActions.click(driver, btnByTasks_868,"ByTasks_868");
		return this;
	}
	public WorkQueueInfoPage clickRestart_143(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_143,"Restart_143");
		return this;
	}
	public WorkQueueInfoPage clickRestart_383(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_383,"Restart_383");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_234(WebDriver driver,String ClusterWideState_234) {
		BrowserActions.type(driver, inpClusterWideState_234,ClusterWideState_234, "ClusterWideState_234");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_283(WebDriver driver,String WriterStatus_283) {
		BrowserActions.type(driver, inpWriterStatus_283,WriterStatus_283, "WriterStatus_283");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_474(WebDriver driver,String ClusterWideState_474) {
		BrowserActions.type(driver, inpClusterWideState_474,ClusterWideState_474, "ClusterWideState_474");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_288(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_288,"DownloadHistory_288");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_524(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_524,"RunWriter_524");
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
	public WorkQueueInfoPage enterWorkQueue_49(WebDriver driver,String WorkQueue_49) {
		BrowserActions.type(driver, inpWorkQueue_49,WorkQueue_49, "WorkQueue_49");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_270(WebDriver driver,String ClusterWideState_270) {
		BrowserActions.type(driver, inpClusterWideState_270,ClusterWideState_270, "ClusterWideState_270");
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
	public WorkQueueInfoPage enterUpFor_858(WebDriver driver,String UpFor_858) {
		BrowserActions.type(driver, inpUpFor_858,UpFor_858, "UpFor_858");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_849(WebDriver driver,String UpFor_849) {
		BrowserActions.type(driver, inpUpFor_849,UpFor_849, "UpFor_849");
		return this;
	}
	public WorkQueueInfoPage enterWriterStatus_295(WebDriver driver,String WriterStatus_295) {
		BrowserActions.type(driver, inpWriterStatus_295,WriterStatus_295, "WriterStatus_295");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_782(WebDriver driver,String Faileditems_782) {
		BrowserActions.type(driver, inpFaileditems_782,Faileditems_782, "Faileditems_782");
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
	public WorkQueueInfoPage enterFailed_484(WebDriver driver,String Failed_484) {
		BrowserActions.type(driver, inpFailed_484,Failed_484, "Failed_484");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_512(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_512,"RunWriter_512");
		return this;
	}
	public WorkQueueInfoPage clickByExecutors(WebDriver driver)  {
		BrowserActions.click(driver, btnByExecutors,"ByExecutors");
		return this;
	}
	public WorkQueueInfoPage enterStarted_694(WebDriver driver,String Started_694) {
		BrowserActions.type(driver, inpStarted_694,Started_694, "Started_694");
		return this;
	}
	public WorkQueueInfoPage clickRestart_35(WebDriver driver)  {
		BrowserActions.click(driver, btnRestart_35,"Restart_35");
		return this;
	}
	public WorkQueueInfoPage enterWorkQueue_37(WebDriver driver,String WorkQueue_37) {
		BrowserActions.type(driver, inpWorkQueue_37,WorkQueue_37, "WorkQueue_37");
		return this;
	}
	public WorkQueueInfoPage enterUpFor_867(WebDriver driver,String UpFor_867) {
		BrowserActions.type(driver, inpUpFor_867,UpFor_867, "UpFor_867");
		return this;
	}
	public WorkQueueInfoPage selectTasks_869(WebDriver driver,String Tasks_869)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTasks_869,Tasks_869,"Tasks_869");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_498(WebDriver driver,String ClusterWideState_498) {
		BrowserActions.type(driver, inpClusterWideState_498,ClusterWideState_498, "ClusterWideState_498");
		return this;
	}
	public WorkQueueInfoPage enterClusterWideState_258(WebDriver driver,String ClusterWideState_258) {
		BrowserActions.type(driver, inpClusterWideState_258,ClusterWideState_258, "ClusterWideState_258");
		return this;
	}
	public WorkQueueInfoPage enterFaileditems_773(WebDriver driver,String Faileditems_773) {
		BrowserActions.type(driver, inpFaileditems_773,Faileditems_773, "Faileditems_773");
		return this;
	}
	public WorkQueueInfoPage enterFailed_232(WebDriver driver,String Failed_232) {
		BrowserActions.type(driver, inpFailed_232,Failed_232, "Failed_232");
		return this;
	}
	public WorkQueueInfoPage enterStarted_685(WebDriver driver,String Started_685) {
		BrowserActions.type(driver, inpStarted_685,Started_685, "Started_685");
		return this;
	}
	public WorkQueueInfoPage clickDownloadHistory_264(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadHistory_264,"DownloadHistory_264");
		return this;
	}
	public WorkQueueInfoPage enterFailed_472(WebDriver driver,String Failed_472) {
		BrowserActions.type(driver, inpFailed_472,Failed_472, "Failed_472");
		return this;
	}
	public WorkQueueInfoPage clickRunWriter_500(WebDriver driver)  {
		BrowserActions.click(driver, btnRunWriter_500,"RunWriter_500");
		return this;
	}

}
