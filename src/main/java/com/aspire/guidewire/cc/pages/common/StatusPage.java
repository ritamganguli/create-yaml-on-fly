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

public class StatusPage extends LoadableComponent<StatusPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-DaysOpen']", AI = false)
	public WebElement inpDaysOpen;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-PrimaryUser']", AI = false)
	public WebElement inpPrimaryAdjuster;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-3-ClaimIndicatorInputSet-CoverageInQuestionIcon", AI = false)
	public WebElement btnCoverageInQuestionIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-ClaimStrategy']", AI = false)
	public WebElement drpClaimStrategy;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-PrimaryGroup']", AI = false)
	public WebElement inpPrimaryGroup;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-ClaimValidationLevel']", AI = false)
	public WebElement drpClaimValidationLevel;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-StorageInputSet-StorageCategory']", AI = false)
	public WebElement drpStorageCategory;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-5-ClaimIndicatorInputSet-FlaggedDate_dateIcon", AI = false)
	public WebElement btnDateFlaggedDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-ReopenedReason']", AI = false)
	public WebElement drpReasonReopened;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-6-ClaimIndicatorInputSet-SubrogationStatusSetter']", AI = false)
	public WebElement drpSubrogationStatus;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-StorageInputSet-StorageBoxNumber']", AI = false)
	public WebElement inpBox;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-DateReported']", AI = false)
	public WebElement inpDateReported;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-SalvageStatus']", AI = false)
	public WebElement drpSalvageStatus;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-2-ClaimIndicatorInputSet-LargeLossIcon", AI = false)
	public WebElement btnLargeLossIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-3-ClaimIndicatorInputSet-CoverageInQuestion']", AI = false)
	public WebElement rdbCoverageinQuestion;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-CreateDate']", AI = false)
	public WebElement inpCreateDate;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-StorageInputSet-StorageType']", AI = false)
	public WebElement drpStorageType;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-5-ClaimIndicatorInputSet-FlagIndicatorText", AI = false)
	public WebElement btnNeverflagged;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-ReinsuranceInputSet-ReinsuranceReason textarea", AI = false)
	public WebElement inpReinsuranceEditReason;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-1-ClaimIndicatorInputSet-FatalityText", AI = false)
	public WebElement btnFatality;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-Resolution']", AI = false)
	public WebElement drpResolution;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-4-ClaimIndicatorInputSet-SIURefer']", AI = false)
	public WebElement drpReferredtoSIUteam;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-CloseDate_dateIcon", AI = false)
	public WebElement btnCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-StorageInputSet-DateShippedToStorage']", AI = false)
	public WebElement inpDateShippedtoStorage;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-SpecialClaimPermission']", AI = false)
	public WebElement drpSpecialClaimPermission;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-Workload-ClassificationWorkload']", AI = false)
	public WebElement inpClassificationWeight;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-CreateDate_dateIcon", AI = false)
	public WebElement btnCreateDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-3-ClaimIndicatorInputSet-CoverageInQuestionText", AI = false)
	public WebElement btnCoverageInQuestionText;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-StorageInputSet-DateShippedToStorage_dateIcon", AI = false)
	public WebElement btnDateShippedtoStorageDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-5-ClaimIndicatorInputSet-FlaggedReason textarea", AI = false)
	public WebElement inpReasonforFlag;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-DateReported_dateIcon", AI = false)
	public WebElement btnDateReportedDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-StorageInputSet-StorageLocationState']", AI = false)
	public WebElement drpStorageLocationState;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-ISOEnabled']", AI = false)
	public WebElement rdbISOEnabled;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-RemoveFlagButton>div[role='button']", AI = false)
	public WebElement btnRemoveFlag;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-4-ClaimIndicatorInputSet-SIUStatusText", AI = false)
	public WebElement btnNoSIUreferral;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-4-ClaimIndicatorInputSet-SIUScore']", AI = false)
	public WebElement inpSIUScore;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-2-ClaimIndicatorInputSet-LargeLossText", AI = false)
	public WebElement btnLargeLossText;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-IncidentOnly']", AI = false)
	public WebElement chkIncidentOnly;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-0-ClaimIndicatorInputSet-LitigationIdentified']", AI = false)
	public WebElement inpLitigationIdentified;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-6-ClaimIndicatorInputSet-SubrogationStatusIcon", AI = false)
	public WebElement btnSubrogationStatusIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-ReinsuranceInputSet-ReinsuranceFlagged']", AI = false)
	public WebElement drpReinsuranceFlaggedStatus;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-ReOpenDate_dateIcon", AI = false)
	public WebElement btnReopenedDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-5-ClaimIndicatorInputSet-FlaggedDate']", AI = false)
	public WebElement inpDateFlagged;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-0-ClaimIndicatorInputSet-FirstNoticeSuit']", AI = false)
	public WebElement rdbFirstNoticeSuit;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-0-ClaimIndicatorInputSet-LitigationIdentified_dateIcon", AI = false)
	public WebElement btnLitigationIdentifiedDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-0-ClaimIndicatorInputSet-NextTrialDate_dateIcon", AI = false)
	public WebElement btnNextTrialDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-Workload-Classification']", AI = false)
	public WebElement inpClassification;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-1-ClaimIndicatorInputSet-FatalityIcon", AI = false)
	public WebElement btnFatalityIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-LossType']", AI = false)
	public WebElement drpLossType;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-LineOfBusiness']", AI = false)
	public WebElement drpLineofBusiness;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-StorageInputSet-StorageNotes textarea", AI = false)
	public WebElement inpStorageNotes;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-0-ClaimIndicatorInputSet-NextTrialDate']", AI = false)
	public WebElement inpNextTrialDate;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-StorageInputSet-StorageBarCodeNumber']", AI = false)
	public WebElement inpBarCode;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-0-ClaimIndicatorInputSet-LitigationStatusEdit']", AI = false)
	public WebElement drpLitigationStatus;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-5-ClaimIndicatorInputSet-FlagIndicatorIcon", AI = false)
	public WebElement btnFlagIndicatorIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-Workload-SupplementalWorkloadWeight']", AI = false)
	public WebElement inpSupplementalWeight;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-CloseDate']", AI = false)
	public WebElement inpCloseDate;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-ClaimSegment']", AI = false)
	public WebElement drpClaimSegment;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-0-ClaimIndicatorInputSet-DaysAfterFNOL']", AI = false)
	public WebElement inpDaysafterFROI;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-ReOpenDate']", AI = false)
	public WebElement inpReopenedDate;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-StorageInputSet-StorageVolumes']", AI = false)
	public WebElement inpStorageVolumes;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-3-ClaimIndicatorInputSet-CoverageInQuestionReasons textarea", AI = false)
	public WebElement inpReasons;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-4-ClaimIndicatorInputSet-SIUStatusIcon", AI = false)
	public WebElement btnSIUStatusIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-Workload-TotalWorkloadWeight']", AI = false)
	public WebElement inpTotalWeight;

	@IFindBy(how = How.CSS, using = "#ClaimStatus-6-ClaimIndicatorInputSet-SubrogationStatusText", AI = false)
	public WebElement btnNone;

	@IFindBy(how = How.CSS, using = "select[name='ClaimStatus-OtherRecoverableStatus']", AI = false)
	public WebElement drpOtherRecoverableStatus;

	@IFindBy(how = How.CSS, using = "input[name='ClaimStatus-2-ClaimIndicatorInputSet-NetTotalIncurred']", AI = false)
	public WebElement inpNetTotalIncurred;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimStatus-ClaimStatus']", AI = false)
	public WebElement lblClaimStatus;

	public StatusPage(){
	}

	public StatusPage(WebDriver driver){
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
}public StatusPage enterDaysOpen(WebDriver driver,String DaysOpen) {
		            BrowserActions.type(driver, inpDaysOpen,DaysOpen, "DaysOpen");
			        return this;
           }
public StatusPage enterPrimaryAdjuster(WebDriver driver,String PrimaryAdjuster) {
		            BrowserActions.type(driver, inpPrimaryAdjuster,PrimaryAdjuster, "PrimaryAdjuster");
			        return this;
           }
public StatusPage clickCoverageInQuestionIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCoverageInQuestionIcon,"CoverageInQuestionIcon");
				    return this;
			}
public StatusPage selectClaimStrategy(WebDriver driver,String ClaimStrategy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClaimStrategy,ClaimStrategy,"ClaimStrategy");
				    return this;
			}
public StatusPage enterPrimaryGroup(WebDriver driver,String PrimaryGroup) {
		            BrowserActions.type(driver, inpPrimaryGroup,PrimaryGroup, "PrimaryGroup");
			        return this;
           }
public StatusPage selectClaimValidationLevel(WebDriver driver,String ClaimValidationLevel)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClaimValidationLevel,ClaimValidationLevel,"ClaimValidationLevel");
				    return this;
			}
public StatusPage selectStorageCategory(WebDriver driver,String StorageCategory)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStorageCategory,StorageCategory,"StorageCategory");
				    return this;
			}
public StatusPage clickDateFlaggedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateFlaggedDateIcon,"DateFlaggedDateIcon");
				    return this;
			}
public StatusPage selectReasonReopened(WebDriver driver,String ReasonReopened)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReasonReopened,ReasonReopened,"ReasonReopened");
				    return this;
			}
public StatusPage selectSubrogationStatus(WebDriver driver,String SubrogationStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSubrogationStatus,SubrogationStatus,"SubrogationStatus");
				    return this;
			}
public StatusPage enterBox(WebDriver driver,String Box) {
		            BrowserActions.type(driver, inpBox,Box, "Box");
			        return this;
           }
public StatusPage enterDateReported(WebDriver driver,String DateReported) {
		            BrowserActions.type(driver, inpDateReported,DateReported, "DateReported");
			        return this;
           }
public StatusPage selectSalvageStatus(WebDriver driver,String SalvageStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSalvageStatus,SalvageStatus,"SalvageStatus");
				    return this;
			}
public StatusPage clickLargeLossIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLargeLossIcon,"LargeLossIcon");
				    return this;
			}
public StatusPage clickCoverageinQuestion(WebDriver driver)  {
					BrowserActions.click(driver, rdbCoverageinQuestion,"CoverageinQuestion");
				    return this;
			}
public StatusPage enterCreateDate(WebDriver driver,String CreateDate) {
		            BrowserActions.type(driver, inpCreateDate,CreateDate, "CreateDate");
			        return this;
           }
public StatusPage selectStorageType(WebDriver driver,String StorageType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStorageType,StorageType,"StorageType");
				    return this;
			}
public StatusPage clickNeverflagged(WebDriver driver)  {
					BrowserActions.click(driver, btnNeverflagged,"Neverflagged");
				    return this;
			}
public StatusPage enterReinsuranceEditReason(WebDriver driver,String ReinsuranceEditReason) {
		            BrowserActions.type(driver, inpReinsuranceEditReason,ReinsuranceEditReason, "ReinsuranceEditReason");
			        return this;
           }
public StatusPage clickFatality(WebDriver driver)  {
					BrowserActions.click(driver, btnFatality,"Fatality");
				    return this;
			}
public StatusPage selectResolution(WebDriver driver,String Resolution)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpResolution,Resolution,"Resolution");
				    return this;
			}
public StatusPage selectReferredtoSIUteam(WebDriver driver,String ReferredtoSIUteam)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReferredtoSIUteam,ReferredtoSIUteam,"ReferredtoSIUteam");
				    return this;
			}
public StatusPage clickCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseDateDateIcon,"CloseDateDateIcon");
				    return this;
			}
public StatusPage enterDateShippedtoStorage(WebDriver driver,String DateShippedtoStorage) {
		            BrowserActions.type(driver, inpDateShippedtoStorage,DateShippedtoStorage, "DateShippedtoStorage");
			        return this;
           }
public StatusPage selectSpecialClaimPermission(WebDriver driver,String SpecialClaimPermission)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSpecialClaimPermission,SpecialClaimPermission,"SpecialClaimPermission");
				    return this;
			}
public StatusPage enterClassificationWeight(WebDriver driver,String ClassificationWeight) {
		            BrowserActions.type(driver, inpClassificationWeight,ClassificationWeight, "ClassificationWeight");
			        return this;
           }
public StatusPage clickCreateDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateDateDateIcon,"CreateDateDateIcon");
				    return this;
			}
public StatusPage clickCoverageInQuestionText(WebDriver driver)  {
					BrowserActions.click(driver, btnCoverageInQuestionText,"CoverageInQuestionText");
				    return this;
			}
public StatusPage clickDateShippedtoStorageDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateShippedtoStorageDateIcon,"DateShippedtoStorageDateIcon");
				    return this;
			}
public StatusPage enterReasonforFlag(WebDriver driver,String ReasonforFlag) {
		            BrowserActions.type(driver, inpReasonforFlag,ReasonforFlag, "ReasonforFlag");
			        return this;
           }
public StatusPage clickDateReportedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateReportedDateIcon,"DateReportedDateIcon");
				    return this;
			}
public StatusPage selectStorageLocationState(WebDriver driver,String StorageLocationState)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStorageLocationState,StorageLocationState,"StorageLocationState");
				    return this;
			}
public StatusPage clickISOEnabled(WebDriver driver)  {
					BrowserActions.click(driver, rdbISOEnabled,"ISOEnabled");
				    return this;
			}
public StatusPage clickRemoveFlag(WebDriver driver)  {
					BrowserActions.click(driver, btnRemoveFlag,"RemoveFlag");
				    return this;
			}
public StatusPage clickNoSIUreferral(WebDriver driver)  {
					BrowserActions.click(driver, btnNoSIUreferral,"NoSIUreferral");
				    return this;
			}
public StatusPage enterSIUScore(WebDriver driver,String SIUScore) {
		            BrowserActions.type(driver, inpSIUScore,SIUScore, "SIUScore");
			        return this;
           }
public StatusPage clickLargeLossText(WebDriver driver)  {
					BrowserActions.click(driver, btnLargeLossText,"LargeLossText");
				    return this;
			}
public StatusPage clickIncidentOnly(WebDriver driver)  {
					BrowserActions.click(driver, chkIncidentOnly,"IncidentOnly");
				    return this;
			}
public StatusPage enterLitigationIdentified(WebDriver driver,String LitigationIdentified) {
		            BrowserActions.type(driver, inpLitigationIdentified,LitigationIdentified, "LitigationIdentified");
			        return this;
           }
public StatusPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public StatusPage clickSubrogationStatusIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSubrogationStatusIcon,"SubrogationStatusIcon");
				    return this;
			}
public StatusPage selectReinsuranceFlaggedStatus(WebDriver driver,String ReinsuranceFlaggedStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReinsuranceFlaggedStatus,ReinsuranceFlaggedStatus,"ReinsuranceFlaggedStatus");
				    return this;
			}
public StatusPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public StatusPage clickReopenedDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenedDateDateIcon,"ReopenedDateDateIcon");
				    return this;
			}
public StatusPage enterDateFlagged(WebDriver driver,String DateFlagged) {
		            BrowserActions.type(driver, inpDateFlagged,DateFlagged, "DateFlagged");
			        return this;
           }
public StatusPage clickFirstNoticeSuit(WebDriver driver)  {
					BrowserActions.click(driver, rdbFirstNoticeSuit,"FirstNoticeSuit");
				    return this;
			}
public StatusPage clickLitigationIdentifiedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLitigationIdentifiedDateIcon,"LitigationIdentifiedDateIcon");
				    return this;
			}
public StatusPage clickNextTrialDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnNextTrialDateDateIcon,"NextTrialDateDateIcon");
				    return this;
			}
public StatusPage enterClassification(WebDriver driver,String Classification) {
		            BrowserActions.type(driver, inpClassification,Classification, "Classification");
			        return this;
           }
public StatusPage clickFatalityIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFatalityIcon,"FatalityIcon");
				    return this;
			}
public StatusPage selectLossType(WebDriver driver,String LossType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLossType,LossType,"LossType");
				    return this;
			}
public StatusPage selectLineofBusiness(WebDriver driver,String LineofBusiness)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLineofBusiness,LineofBusiness,"LineofBusiness");
				    return this;
			}
public StatusPage enterStorageNotes(WebDriver driver,String StorageNotes) {
		            BrowserActions.type(driver, inpStorageNotes,StorageNotes, "StorageNotes");
			        return this;
           }
public StatusPage enterNextTrialDate(WebDriver driver,String NextTrialDate) {
		            BrowserActions.type(driver, inpNextTrialDate,NextTrialDate, "NextTrialDate");
			        return this;
           }
public StatusPage enterBarCode(WebDriver driver,String BarCode) {
		            BrowserActions.type(driver, inpBarCode,BarCode, "BarCode");
			        return this;
           }
public StatusPage selectLitigationStatus(WebDriver driver,String LitigationStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLitigationStatus,LitigationStatus,"LitigationStatus");
				    return this;
			}
public StatusPage clickFlagIndicatorIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFlagIndicatorIcon,"FlagIndicatorIcon");
				    return this;
			}
public StatusPage enterSupplementalWeight(WebDriver driver,String SupplementalWeight) {
		            BrowserActions.type(driver, inpSupplementalWeight,SupplementalWeight, "SupplementalWeight");
			        return this;
           }
public StatusPage enterCloseDate(WebDriver driver,String CloseDate) {
		            BrowserActions.type(driver, inpCloseDate,CloseDate, "CloseDate");
			        return this;
           }
public StatusPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public StatusPage selectClaimSegment(WebDriver driver,String ClaimSegment)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClaimSegment,ClaimSegment,"ClaimSegment");
				    return this;
			}
public StatusPage enterDaysafterFROI(WebDriver driver,String DaysafterFROI) {
		            BrowserActions.type(driver, inpDaysafterFROI,DaysafterFROI, "DaysafterFROI");
			        return this;
           }
public StatusPage enterReopenedDate(WebDriver driver,String ReopenedDate) {
		            BrowserActions.type(driver, inpReopenedDate,ReopenedDate, "ReopenedDate");
			        return this;
           }
public StatusPage enterStorageVolumes(WebDriver driver,String StorageVolumes) {
		            BrowserActions.type(driver, inpStorageVolumes,StorageVolumes, "StorageVolumes");
			        return this;
           }
public StatusPage enterReasons(WebDriver driver,String Reasons) {
		            BrowserActions.type(driver, inpReasons,Reasons, "Reasons");
			        return this;
           }
public StatusPage clickSIUStatusIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSIUStatusIcon,"SIUStatusIcon");
				    return this;
			}
public StatusPage enterTotalWeight(WebDriver driver,String TotalWeight) {
		            BrowserActions.type(driver, inpTotalWeight,TotalWeight, "TotalWeight");
			        return this;
           }
public StatusPage clickNone(WebDriver driver)  {
					BrowserActions.click(driver, btnNone,"None");
				    return this;
			}
public StatusPage selectOtherRecoverableStatus(WebDriver driver,String OtherRecoverableStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOtherRecoverableStatus,OtherRecoverableStatus,"OtherRecoverableStatus");
				    return this;
			}
public StatusPage enterNetTotalIncurred(WebDriver driver,String NetTotalIncurred) {
		            BrowserActions.type(driver, inpNetTotalIncurred,NetTotalIncurred, "NetTotalIncurred");
			        return this;
           }
public StatusPage verifyClaimStatus(WebDriver driver,String status) {
	String actualSatus = BrowserActions.getText(driver, lblClaimStatus, "Calim Status");
	Log.assertThat(actualSatus.equals(status), "Claim is "+status+"ed Successfully", actualSatus);
	return this;
}
}
