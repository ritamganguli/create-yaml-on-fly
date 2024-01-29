package com.aspire.guidewire.pc.pages.nonlob;

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

public class DestinationEmailPage extends LoadableComponent<DestinationEmailPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-TotalStatistics-MessageDestinationStatisticsDV-Error']", AI = false)
	private WebElement inpFailed;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-SendTime']", AI = false)
	private WebElement inpSendTime;

	@IFindBy(how = How.CSS, using = "#MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListScreen_RetryButton>div[role='button']", AI = false)
	private WebElement btnRetry;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-TotalStatistics-MessageDestinationStatisticsDV-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#MessageControlForDestinationList-MessageControlForDestinationListScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-InFlight']", AI = false)
	private WebElement inpInFlight_4;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-Unsent']", AI = false)
	private WebElement inpUnsent_12;

	@IFindBy(how = How.CSS, using = "select[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-SOOMessageFilter']", AI = false)
	private WebElement drpSOOMessageFilter;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-TotalStatistics-MessageDestinationStatisticsDV-InFlight']", AI = false)
	private WebElement inpInFlight;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-SendTime']", AI = false)
	private WebElement inpSendTime_7;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-RetryableErrorMessage']", AI = false)
	private WebElement inpErrorMessage;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-RetryableError']", AI = false)
	private WebElement inpRetryableError_10;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-Unsent']", AI = false)
	private WebElement inpUnsent_5;

	@IFindBy(how = How.CSS, using = "#MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListScreen_SkipButton>div[role='button']", AI = false)
	private WebElement btnSkipfirst;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-TotalStatistics-MessageDestinationStatisticsDV-Retry']", AI = false)
	private WebElement inpRetryableError;

	@IFindBy(how = How.CSS, using = "#MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListScreen_ResyncButton>div[role='button']", AI = false)
	private WebElement btnResync;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlSearchItem']", AI = false)
	private WebElement inpMessageControlSearchItem;

	@IFindBy(how = How.CSS, using = "select[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-SOOMessageFilter']", AI = false)
	private WebElement drpSOOMessageFilter_1;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-Error']", AI = false)
	private WebElement inpFailed_2;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-TotalStatistics-MessageDestinationStatisticsDV-Batched']", AI = false)
	private WebElement inpBatched;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-TotalStatistics-MessageDestinationStatisticsDV-ErrorCount']", AI = false)
	private WebElement inpAwaitingRetry;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-SOOName']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-RetryableErrorMessage']", AI = false)
	private WebElement inpErrorMessage_13;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-TotalStatistics-MessageDestinationStatisticsDV-Unsent']", AI = false)
	private WebElement inpUnsent;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-RetryableError']", AI = false)
	private WebElement inpRetryableError_3;

	@IFindBy(how = How.CSS, using = "#MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-SendTime_dateIcon", AI = false)
	private WebElement btnSendTimeDateIcon_8;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-InFlight']", AI = false)
	private WebElement inpInFlight_11;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-Error']", AI = false)
	private WebElement inpFailed_9;

	@IFindBy(how = How.CSS, using = "#MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlSearchItem_Button", AI = false)
	private WebElement btnMessageControlSearchItem_Button;

	@IFindBy(how = How.CSS, using = "#MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-0-SendTime_dateIcon", AI = false)
	private WebElement btnSendTimeDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='MessageControlForDestinationList-MessageControlForDestinationListScreen-MessageControlForDestinationListLV-1-SOOName']", AI = false)
	private WebElement inpAccount_6;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Status']", AI = false)
	private WebElement lblStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='-MessageDestinationStatisticsDV-Error']", AI = false)
	private WebElement lblFailed;
	
	@IFindBy(how = How.CSS, using = "div[id$='-MessageDestinationStatisticsDV-Retry']", AI = false)
	private WebElement lblRetryableError;
	
	@IFindBy(how = How.CSS, using = "div[id$='-MessageDestinationStatisticsDV-InFlight']", AI = false)
	private WebElement lblInFlight;
	
	@IFindBy(how = How.CSS, using = "div[id$='-MessageDestinationStatisticsDV-Unsent']", AI = false)
	private WebElement lblUnsent;
	
	@IFindBy(how = How.CSS, using = "div[id$='-MessageDestinationStatisticsDV-Batched']", AI = false)
	private WebElement lblBatched;
	
	@IFindBy(how = How.CSS, using = "div[id$='-MessageDestinationStatisticsDV-Batched']", AI = false)
	private WebElement lblAwaitingRetry;
	
	@IFindBy(how = How.CSS, using = "div[id$='SOONameHeader_inner']", AI = false)
	private WebElement lblAccount;
	
	@IFindBy(how = How.CSS, using = "div[id$='SendTimeHeader_inner']", AI = false)
	private WebElement lblSendTime;
	
	@IFindBy(how = How.CSS, using = "div[id$='-ErrorHeader_inner']", AI = false)
	private WebElement lblDetailedStatisticsFailed;
	
	@IFindBy(how = How.CSS, using = "div[id$='RetryableErrorHeader_inner']", AI = false)
	private WebElement lblDetailedStatisticsRetryableError;
	
	@IFindBy(how = How.CSS, using = "div[id$='InFlightHeader_inner']", AI = false)
	private WebElement lblDetailedStatisticsInFlight;
	
	@IFindBy(how = How.CSS, using = "div[id$='UnsentHeader_inner']", AI = false)
	private WebElement lblDetailedStatisticsUnsent;
	
	@IFindBy(how = How.CSS, using = "div[id$='RetryableErrorMessageHeader_inner']", AI = false)
	private WebElement lblErrorMessage;
	
	public DestinationEmailPage(){
	}

	public DestinationEmailPage(WebDriver driver){
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
}public DestinationEmailPage enterFailed(WebDriver driver,String Failed) {
		            BrowserActions.type(driver, inpFailed,Failed, "Failed");
			        return this;
           }
public DestinationEmailPage enterSendTime(WebDriver driver,String SendTime) {
		            BrowserActions.type(driver, inpSendTime,SendTime, "SendTime");
			        return this;
           }
public DestinationEmailPage clickRetry(WebDriver driver)  {
					BrowserActions.click(driver, btnRetry,"Retry");
				    return this;
			}
public DestinationEmailPage enterStatus(WebDriver driver,String Status) {
		            BrowserActions.type(driver, inpStatus,Status, "Status");
			        return this;
           }
public DestinationEmailPage enterInFlight_4(WebDriver driver,String InFlight_4) {
		            BrowserActions.type(driver, inpInFlight_4,InFlight_4, "InFlight_4");
			        return this;
           }
public DestinationEmailPage enterUnsent_12(WebDriver driver,String Unsent_12) {
		            BrowserActions.type(driver, inpUnsent_12,Unsent_12, "Unsent_12");
			        return this;
           }
public DestinationEmailPage selectSOOMessageFilter(WebDriver driver,String SOOMessageFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSOOMessageFilter,SOOMessageFilter,"SOOMessageFilter");
				    return this;
			}
public DestinationEmailPage enterInFlight(WebDriver driver,String InFlight) {
		            BrowserActions.type(driver, inpInFlight,InFlight, "InFlight");
			        return this;
           }
public DestinationEmailPage enterSendTime_7(WebDriver driver,String SendTime_7) {
		            BrowserActions.type(driver, inpSendTime_7,SendTime_7, "SendTime_7");
			        return this;
           }
public DestinationEmailPage enterErrorMessage(WebDriver driver,String ErrorMessage) {
		            BrowserActions.type(driver, inpErrorMessage,ErrorMessage, "ErrorMessage");
			        return this;
           }
public DestinationEmailPage enterRetryableError_10(WebDriver driver,String RetryableError_10) {
		            BrowserActions.type(driver, inpRetryableError_10,RetryableError_10, "RetryableError_10");
			        return this;
           }
public DestinationEmailPage enterUnsent_5(WebDriver driver,String Unsent_5) {
		            BrowserActions.type(driver, inpUnsent_5,Unsent_5, "Unsent_5");
			        return this;
           }
public DestinationEmailPage clickSkipfirst(WebDriver driver)  {
					BrowserActions.click(driver, btnSkipfirst,"Skipfirst");
				    return this;
			}
public DestinationEmailPage enterRetryableError(WebDriver driver,String RetryableError) {
		            BrowserActions.type(driver, inpRetryableError,RetryableError, "RetryableError");
			        return this;
           }
public DestinationEmailPage clickResync(WebDriver driver)  {
					BrowserActions.click(driver, btnResync,"Resync");
				    return this;
			}
public DestinationEmailPage enterMessageControlSearchItem(WebDriver driver,String MessageControlSearchItem) {
		            BrowserActions.type(driver, inpMessageControlSearchItem,MessageControlSearchItem, "MessageControlSearchItem");
			        return this;
           }
public DestinationEmailPage selectSOOMessageFilter_1(WebDriver driver,String SOOMessageFilter_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSOOMessageFilter_1,SOOMessageFilter_1,"SOOMessageFilter_1");
				    return this;
			}
public DestinationEmailPage enterFailed_2(WebDriver driver,String Failed_2) {
		            BrowserActions.type(driver, inpFailed_2,Failed_2, "Failed_2");
			        return this;
           }
public DestinationEmailPage enterBatched(WebDriver driver,String Batched) {
		            BrowserActions.type(driver, inpBatched,Batched, "Batched");
			        return this;
           }
public DestinationEmailPage enterAwaitingRetry(WebDriver driver,String AwaitingRetry) {
		            BrowserActions.type(driver, inpAwaitingRetry,AwaitingRetry, "AwaitingRetry");
			        return this;
           }
public DestinationEmailPage enterAccount(WebDriver driver,String Account) {
		            BrowserActions.type(driver, inpAccount,Account, "Account");
			        return this;
           }
public DestinationEmailPage enterErrorMessage_13(WebDriver driver,String ErrorMessage_13) {
		            BrowserActions.type(driver, inpErrorMessage_13,ErrorMessage_13, "ErrorMessage_13");
			        return this;
           }
public DestinationEmailPage enterUnsent(WebDriver driver,String Unsent) {
		            BrowserActions.type(driver, inpUnsent,Unsent, "Unsent");
			        return this;
           }
public DestinationEmailPage enterRetryableError_3(WebDriver driver,String RetryableError_3) {
		            BrowserActions.type(driver, inpRetryableError_3,RetryableError_3, "RetryableError_3");
			        return this;
           }
public DestinationEmailPage clickSendTimeDateIcon_8(WebDriver driver)  {
					BrowserActions.click(driver, btnSendTimeDateIcon_8,"SendTimeDateIcon_8");
				    return this;
			}
public DestinationEmailPage enterInFlight_11(WebDriver driver,String InFlight_11) {
		            BrowserActions.type(driver, inpInFlight_11,InFlight_11, "InFlight_11");
			        return this;
           }
public DestinationEmailPage enterFailed_9(WebDriver driver,String Failed_9) {
		            BrowserActions.type(driver, inpFailed_9,Failed_9, "Failed_9");
			        return this;
           }
public DestinationEmailPage clickMessageControlSearchItem_Button(WebDriver driver)  {
					BrowserActions.click(driver, btnMessageControlSearchItem_Button,"MessageControlSearchItem_Button");
				    return this;
			}
public DestinationEmailPage clickSendTimeDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSendTimeDateIcon,"SendTimeDateIcon");
				    return this;
			}
public DestinationEmailPage enterAccount_6(WebDriver driver,String Account_6) {
		            BrowserActions.type(driver, inpAccount_6,Account_6, "Account_6");
			        return this;
           }

/**
 * Verify Status Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */

public DestinationEmailPage verifyStatusIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblStatus ,"Status");
	return this;
}

/**
 * Verify Failed Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyFailedIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblFailed ,"Failed");
	return this;
}

/**
 * Verify Retryable Error Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyRetryableErrorIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblRetryableError ,"Retryable Error");
	return this;
}

/**
 * Verify light  Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyInFlightIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblInFlight ,"Inflight");
	return this;
}

/**
 * Verify Unsent  Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyUnsentIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblUnsent ,"Unsent");
	return this;
}

/**
 * Verify Batch Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyBatchedIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblBatched ,"Batched");
	return this;
}

/**
 * Verify Awaiting Retry Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyAwaitingRetryIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblAwaitingRetry ,"Awaiting Retry");
	return this;
}

/**
 * Verify Account Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyAccountIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblAccount, "Account");
	return this;
}

/**
 * Verify Send Time  Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifySendTimeIsDisplayed(WebDriver driver) {
	 BrowserActions.verifyElementDisplayed(driver, lblSendTime, "Send Time");
	return this;
}

/**
 * Verify Detailed Statistics Failed Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyDetailedStatisticsFailedIsDisplayed(WebDriver driver) {
	 BrowserActions.verifyElementDisplayed(driver, lblDetailedStatisticsFailed, "Detailed Statistics Failed");
	return this;
}

/**
 * Verify Statistics Retryable Error Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyDetailedStatisticsRetryableErrorIsDisplayed(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, lblDetailedStatisticsRetryableError, "Detailed Statistics Retryable Error");
	return this;
}
/**
 * Verify Statistics in Flight Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyDetailedStatisticsInFlightIsDisplayed(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, lblDetailedStatisticsInFlight, "Detailed Statistics In Flight");
	return this;
}
/**
 * Verify Detailed Statistics Unsent Is Display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyDetailedStatisticsUnsentIsDisplayed(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, lblDetailedStatisticsUnsent, "Detailed Statistics Un sent");
	return this;
}
/**
 * Verify error messege is display
 * @author vignesh.ravi
 * @param driver 
 * @return
 */
public DestinationEmailPage verifyErrorMessage(WebDriver driver) {
    BrowserActions.verifyElementDisplayed(driver, lblErrorMessage, "Error Message");
	return this;
}
}
