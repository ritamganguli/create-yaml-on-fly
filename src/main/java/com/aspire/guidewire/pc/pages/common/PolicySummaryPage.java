package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.pc.pages.common.PolicySummaryPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class PolicySummaryPage extends LoadableComponent<PolicySummaryPage> {
	
	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id$='PolicyDetailsDetailViewTile-0'] div[class$='expand-button gw-no-pointer']", AI = false)
	public WebElement btnNewTransaction;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id='PolicyFile_Summary-ttlBar']", AI = false)
	public WebElement ttlPolicySummary;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyDetailsDetailViewTile-CancelPolicy']", AI = false)
	public WebElement txtCancelPolicyFromPolicySummaryPage;
	
	@IFindBy(how = How.CSS, using = "div[id$='CancelPolicy']", AI = false)
	public WebElement btnCancelPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='ChangePolicy']", AI = false)
	public WebElement txtchangePolicy;

	@IFindBy(how = How.XPATH, using = "//div[text()='Recalculate Loss Ratio']", AI = false)
	public WebElement btnRecalculateLossRatio;

	@IFindBy(how = How.CSS, using = "div[id$='DetailViewTile-NewNote']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyNumber']", AI = false)
	public WebElement txtPolicyId;

	@IFindBy(how = How.CSS, using = "div[id$='DV-PolicyNumber']", AI = false)
	public WebElement txtPolicyNumber;

	@IFindBy(how = How.CSS, using = "div[id$='Badge']", AI = false)
	public WebElement lblDetailTileBadge;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyDetailsDetailViewTile-CancelPolicy']", AI = false)
	public WebElement lnkNewTransactionCancelPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='ViewTile-RewriteNewTerm']", AI = false)
	public WebElement lnkRewriteNewTerm;

	@IFindBy(how = How.CSS, using = "div[id$='StatusAndExpDate']", AI = false)
	public WebElement lblCanceledFlat;

	@IFindBy(how = How.XPATH, using = "//div[text()='Additional Named Insured, Additional Interest']", AI = false)
	public WebElement txtAdditionalinsurerAdditionalInterest;

	@IFindBy(how = How.CSS, using = "div[id$='Type']", AI = false)
	public WebElement txtTypeOfTransaction;

	@IFindBy(how = How.ID, using = "PolicyFile_Summary-PolicyOverviewDashboard-CompletedPolicyTransactionsListViewTile-CompletedPolicyTransactionsListViewTile_LV-0-Number_button", AI = false)
	public WebElement txtCompletedTransactionId;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Risk Analysis']", AI = false)
	public WebElement tabRiskAnalysisSideBar;

	@IFindBy(how = How.CSS, using = "div[id='PolicyFile-MenuLinks-PolicyFile_PolicyFile_Summary']", AI = false)
	public WebElement tabSummarySideBar;

	@IFindBy(how = How.CSS, using = "div[id$='PrimaryNamedInsured_button']", AI = false)
	public WebElement btnPrimaryInsuredName;

	@IFindBy(how = How.CSS, using = "[id$='AccountDetailViewTile_DV-AccountNumber']", AI = false)
	public WebElement lblAccNumber;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyDetailsDetailViewTile_DV-PolicyNumber']", AI = false)
	public WebElement lblPolicyNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$=PolicyFile_PolicyFile_History]", AI = false)
	public WebElement lblHistory;

	@IFindBy(how = How.CSS, using = "div[id$='JobInProgressType']", AI = false)
	public WebElement txtOpenPolicyType;
	
	@IFindBy(how = How.CSS, using = "div[id$='PrimaryNamedInsured_Input'] div[id$='PrimaryNamedInsured']", AI = false)
	public WebElement lblPrimaryInsuredName;
	
	public PolicySummaryPage() {}

	public PolicySummaryPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPolicySummary))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	/**
	 * click new transaction button will display some options
	 * @author manikandan.manohar 
	 * @param driver
	 * @return PolicySummaryPage
	 */
	public PolicySummaryPage clickNewTransactionButton(WebDriver driver) {
		BrowserActions.click(driver, btnNewTransaction, "New Transaction button");
		return this;
	}
	
	/**
	 * @author vignesh.ravi 
	 * click cancel policy from Policy summary page
	 * @param driver
	 * @return policyReviewPage
	 */
	public PolicySummaryPage clickCancelPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelPolicy, 1,"Cancel Policy");
		return new PolicySummaryPage(driver);
	}
	
	/**
	 * Click on the Completed transactions ID
	 * @author manikandan manohar
	 * @param driver
	 * @return PolicySummaryPage
	 */
	public PolicySummaryPage clickCompletedTransactionId(WebDriver driver)  {
		BrowserActions.click(driver, txtCompletedTransactionId,2, "Completed Transaction Id");
		return this;
	}
	
	/**
	 * Go to Batch Process page
	 * @author vignesh.ravi
	 * @param driver
	 */
	public PolicySummaryPage clickGotoBatchProcess(WebDriver driver) {
		String selectAll = Keys.chord(Keys.ALT, Keys.SHIFT,"t");
		driver.findElement(By.tagName("html")).sendKeys(selectAll);
		return this;

	}
	public String getPolicyNo(WebDriver driver)  {
		String policyNo=BrowserActions.getText(driver, lblPolicyNumber,"Policy Number");
		return policyNo;
	}
	
	public String getAccountNumberText(WebDriver driver)  {
		String accNo=BrowserActions.getText(driver, lblAccNumber, "Account No");
		return accNo;
	}
	
	public String getFirstName(WebDriver driver)  {
		String name=BrowserActions.getText(driver, lblPrimaryInsuredName, "FirstName");
		String[] split = name.split(" ");
		String firstName = split[0];
		return firstName;
	}
	public String getLastName(WebDriver driver)  {
		String name=BrowserActions.getText(driver, lblPrimaryInsuredName, "LastName");
		String[] split = name.split(" ");
		String lastName = split[1];
		
		return lastName;
	}
	
}
