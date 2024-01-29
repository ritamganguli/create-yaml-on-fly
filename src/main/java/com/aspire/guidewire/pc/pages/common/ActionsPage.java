package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.pc.pages.commercialproperty.BuildingsAndLocationsPage;
import com.aspire.guidewire.pc.pages.nonlob.MergeAccountIntoThisAccountPage;
import com.aspire.guidewire.pc.pages.personalauto.DriversPage;
import com.aspire.guidewire.pc.pages.personalauto.VehiclesPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class ActionsPage  extends LoadableComponent<ActionsPage>{
	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id$='MenuActions'] > div[role='button']", AI = false)
	public WebElement btnActions;

	@IFindBy(how = How.CSS, using = "div[id$='Actions_NewAccount']", AI = false)
	public WebElement lnkNewAccount;

	@IFindBy(how = How.CSS, using = "div[id$='NewSubmission']", AI = false)
	public WebElement lnkNewSubmission;

	@IFindBy(how = How.CSS, using = "div[id$='Goto']", AI = false)
	public WebElement lnkGoTo;

	@IFindBy(how = How.CSS, using = "div[id$='ToAccountFile']", AI = false)
	public WebElement lnkAccountFile;

	@IFindBy(how = How.CSS, using = "div[id$='ToPolicyFile']", AI = false)
	public WebElement lnkPolicyFile;

	@IFindBy(how = How.CSS, using = "div[id$='Create']", AI = false)
	public WebElement lnkCreate;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_NewNote']", AI = false)
	public WebElement lnkNewNote;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_NewDocument']", AI = false)
	public WebElement lnkNewDocument;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_NewActivity']", AI = false)
	public WebElement lnkNewActivity;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_NewEmail']", AI = false)
	public WebElement lnkNewEmail;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_PreRenewalDirection']", AI = false)
	public WebElement lnkPreRenewalDirection;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_CopySubmission']", AI = false)
	public WebElement lnkCopySubmission;

	@IFindBy(how = How.CSS, using = "div[id$='AddProductButton']", AI = false)
	public WebElement btnAddProduct;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_NewWorkOrder']", AI = false)
	public WebElement lnkNewPolicyTransaction;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_ChangePolicy']", AI = false)
	public WebElement lnkChangePolicy;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_CancelPolicy']", AI = false)
	public WebElement lnkCancelPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_RenewPolicy']", AI = false)
	public WebElement lnkRenewPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_Archiving']", AI = false)
	public WebElement lnkArchiving;

	@IFindBy(how = How.XPATH, using = "//div[text()='Enable/Disable']", AI = false)
	public WebElement lnkEnableDisable;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_Create']", AI = false)
	public WebElement lnkCreateAccount;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_NewNote']", AI = false)
	public WebElement lnkNewNoteAccount;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_NewDocument']", AI = false)
	public WebElement lnkNewDocumentAccount;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_NewEmail']", AI = false)
	public WebElement lnkNewEmailAccount;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_NewSubmission']", AI = false)
	public WebElement lnkNewSubmissionAccount;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_NewActivity']", AI = false)
	public WebElement lnkNewActivityAccount;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_MovePolicies']", AI = false)
	public WebElement btnMovePoliciesAccount;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_NewWorkOrder-StartRewriteMenuItemSet-RewriteRemainderOfTerm']", AI = false)
	public WebElement lnkRewriteRemainderOfTerm;

	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_MergeAccounts']", AI = false)
	public WebElement btnMergeAccountIntoThisAccount;

	@IFindBy(how = How.CSS, using = "//div[text()='Sub Manager']", AI = false)
	public WebElement lnkSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='JobGroup']", AI = false)
	public WebElement lnkGroup;

	@IFindBy(how = How.CSS, using = "div[id$='WithdrawAccount']", AI = false)
	public WebElement btnWithdrawAccount;

	@IFindBy(how = How.CSS, using = "div[id$='ReopenAccount']", AI = false)
	public WebElement btnReOpenAccount;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFileMenuActions_ReinstatePolicy']", AI = false)
	public WebElement lnkReinstatePolicy;

	@IFindBy(how = How.CSS, using = "div[id$='RewriteNewTerm']", AI = false)
	public WebElement lnkRewriteNewTerm;

	@IFindBy(how = How.CSS, using = "div[id$='MenuItemSet-RewriteFullTerm']", AI = false)
	public WebElement btnRewriteFullTerm;

	@IFindBy(how = How.CSS, using = "div[id$='StartRewriteMenuItemSet-RewriteFullTerm']", AI = false)
	public WebElement lnkRewriteFullTerm;

	@IFindBy(how = How.CSS, using = "div[id$='SpinPolicy']", AI = false)
	public WebElement lnkSpinOffFromThisOne;

	@IFindBy(how = How.CSS, using = "div[id$='SplitPolicy']", AI = false)
	public WebElement lnkSplitPolicyIntoTwo;

	@IFindBy(how = How.CSS, using = "div[id$='Documents']", AI = false)
	public WebElement lnkDocuments;

	@IFindBy(how = How.CSS, using = "input[name*='Date']", AI = false)//input[name*='EffectiveDate']
	public WebElement txtEffectiveDate;

	@IFindBy(how = How.CSS, using = "div[id$='OfferingScreen-ttlBar'", AI = false)//input[name*='EffectiveDate']
	public WebElement ttlOfferings;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyInfoScreen-ttlBar']", AI = false)
	public WebElement ttlPolicyInfo;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimWorkplan']", AI = false)
	public WebElement lnkWorkPlan;

	@IFindBy(how = How.CSS, using = "div[id$='PADrivers'] div", AI = false)
	public WebElement btnDriverScreen;
	
	@IFindBy(how = How.CSS, using = "div[id$='PersonalVehicles'] div , div[id$='BusinessVehicles'] div", AI = false)
	public WebElement btnVehicleScreen;
	
	@IFindBy(how = How.CSS, using = "div[id$='PolicyInfo'] div", AI = false)
	public WebElement btnPolicyInfoScreen;
	
	@IFindBy(how = How.CSS, using = "div[id$='RiskAnalysis']", AI = false)
	public WebElement btnRiskAnalysisScreen;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuActions_NewDocument']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "div[id$='MenuItemSet_Template']", AI = false)
	public WebElement btnCreateTemplate;
	
	@IFindBy(how = How.CSS, using = "div[id$='baLineStep']", AI = false)
	public WebElement lnkCommercialAutoLine;
	
	@IFindBy(how = How.CSS, using = "div[id$='CPBuildings'] div", AI = false)
	public WebElement btnBuildingsAndLocationScreen;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyMenuItemSet_Endorsements']", AI = false)
	public WebElement btnForms;	
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountFileMenuActions_RewritePolicies']", AI = false)
	public WebElement btnRewritePolicieToThisAccount;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewPolicyDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked']", AI = false)
	public WebElement btnUploadDocuments;
	
	@IFindBy(how = How.CSS, using = "div[id$='PolicyMenuItemSet_Pricing']", AI = false)
	public WebElement lnkQuote;
	
	public ActionsPage() {}

	public ActionsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}
	
	public ActionsPage(WebDriver driver, int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnActions))){
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * Click on new Account
	 * @author vignesh.ravi
	 * @param driver
	 * @return EnterAccountInformationPage
	 */
	public EnterAccountInformationPage clickNewAccount(WebDriver driver){
		BrowserActions.click(driver, lnkNewAccount,"New Account");
		return new EnterAccountInformationPage(driver).get();
	}

	/**
	 * Click on New Submission(After Account created)
	 * @author vignesh.ravi
	 * @param driver
	 * @return EnterAccountInformationPage
	 */
	public NewSubmissionsPage clickNewSubmissionAccount(WebDriver driver){
		BrowserActions.click(driver, lnkNewSubmissionAccount,"New submission");
		return new NewSubmissionsPage(driver).get();
	}

	/**
	 * Clicks on Actions
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 */
	public ActionsPage clickActions(WebDriver driver) {
		BrowserActions.click(driver, btnActions,"Actions button");
		return this;
	}

	/**
	 * Click on Rewrite Remainder policy (After Account created)
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 */
	public void clickRewriteRemainderOfTerm(WebDriver driver){
		BrowserActions.click(driver, lnkRewriteRemainderOfTerm,"Rewrite Remainder term");
	}

	/**
	 * Click on Change Policy
	�* @author vignesh.ravi
	 * @param driver
	 * @return
	 */
	public StartPolicyChangePage clickChangePolicy(WebDriver driver){
		BrowserActions.click(driver, lnkChangePolicy,1,"Change Policy");
		return new StartPolicyChangePage(driver).get();
	}

	/**
	 * Click on Reinstate Policy
	 * @author siva.panjanathan
	 * @param driver
	 * @return
	 */
	public StartReinstatementPage clickReinstatePolicy(WebDriver driver){
		BrowserActions.click(driver, lnkReinstatePolicy,"Reinstate Policy");
		return new StartReinstatementPage(driver).get();
	}

	/**
	 * @author anitha.raphel
	 * Click on RewriteFullTerm Policy
	 * @param driver
	 */
	public ActionsPage clickRewriteFullTermPolicy(WebDriver driver){
		BrowserActions.click(driver, btnRewriteFullTerm,"Reinstate Policy");
		return this;
	}

	/**
	 * Click on Renew Policy
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 * @throws Exception
	 */
	public void clickRenewPolicy(WebDriver driver)  {
		BrowserActions.click(driver, lnkRenewPolicy,"Renew Policy");
		BrowserActions.confirmAlert(driver, "Confirm Alert");
	}

	/**
	 * @author charu.anbarasan
	 * click pre renewal direction
	 * @param driver
	 */
	public void clickPreRenewalDirection(WebDriver driver) {
		BrowserActions.click(driver, lnkPreRenewalDirection,"PreRenewalDirection");
	}

	/**
	 * Click on Split Policy
	 * @author mani
	 * @param driver
	 * @return
	 */
	public SplitPolicyPage clickSplitPolicy(WebDriver driver){
		BrowserActions.click(driver, lnkSplitPolicyIntoTwo,"Split policy");
		return new SplitPolicyPage(driver).get();
	}

	/**
	 * Click on Spin-off
	 * @author mani
	 * @param driver
	 * @return
	 */
	public SpinPolicyPage clickSpinOffPolicy(WebDriver driver){
		BrowserActions.click(driver, lnkSpinOffFromThisOne,"spinOff policy");
		return new SpinPolicyPage(driver).get();
		}
	
	/**
	� * Click on CopySubmission
   �� * @author vignesh.ravi
	��* @param driver
	��* @return�
	� */
	public ActionsPage clickCopySubmission(WebDriver driver) {
		BrowserActions.click(driver, lnkCopySubmission,"Copy submission");
		return this;
		}
	
	/**
	 * Click on Drivers 
	 * @author manikandan.manohar
	 * @param driver
	 * @return
	 */
	public DriversPage clickDriversScreen(WebDriver driver){
		BrowserActions.click(driver, btnDriverScreen,"Drivers Screen Button");
		return new DriversPage(driver).get();
	}
	
	/**
	�* Click on Vehicle Screen
	 * @author manikandan.manohar
	 * @param driver
	 * @return
   � */
	public VehiclesPage clickVehicleScreen(WebDriver driver){
	 BrowserActions.click(driver, btnVehicleScreen,1,"Vehicle Screen Button");
	 return new VehiclesPage(driver).get();
	 }
	
	
	/**
	��* Click on Vehicle Screen
	��* @author manikandan.manohar
   �� * @param driver
  ��� * @return
	� */
	public PolicyInfoPage clickPolicyInfoScreen(WebDriver driver){
		BrowserActions.click(driver, btnPolicyInfoScreen,"Vehicle Screen Button");
		return new PolicyInfoPage(driver).get();
		}
	
	/**
	 * @author anitha.raphel 
	 * Used to click on Rewrite New Term transaction
	 * @param driver
	 * @return PolicySummaryPage
	 */
	public void clickRewriteNewTerm(WebDriver driver) {
		BrowserActions.click(driver, lnkRewriteNewTerm, "Rewrite New Term button");
	}
	
	/**
	 * Click on Cancel Policy
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 */
	public ActionsPage clickCancelPolicy(WebDriver driver){
		BrowserActions.click(driver, lnkCancelPolicy,"Cancel Policy");
		return this;
	}
	
	/**
	 * Click on RiskAnalysis Screen
	 * @author manikandan.manohar
	 * @param driver
	 * @return
	 */
	public RiskAnalysisPage clickRiskAnalysisScreen(WebDriver driver){
		BrowserActions.click(driver, btnRiskAnalysisScreen,1,"RiskAnalysis Screen Button");
		return new RiskAnalysisPage(driver).get();
	}
	
	/**
	 * Used to click on Create from a Template button
	 * @author manikandan.manohar
	 * @param driver
	 * @return 
	 */
	public ActionsPage clickCreateTemplate(WebDriver driver) {
		BrowserActions.click(driver, btnCreateTemplate, "Create from a Template button");
		return this;
	}
	
	/**
	 * Used to click on New Document button
	 * @author manikandan.manohar
	 * @param driver
	 * @return 
	 */
	public ActionsPage clickNewDocumentButton(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnNewDocument, "New Document button");
		return this;
	}
	/**
	 * Used to click on Commercial AUto Line link
	 * @author manikandan.manohar
	 * @param driver
	 * @return 
	 */
	public void clickCommercialAutoLine(WebDriver driver) {
		 BrowserActions.click(driver, lnkCommercialAutoLine,1.5, "Commercial Auto Line");
		 }
	
	/**
	 * Used to click on Documents link
	 * @author manikandan.manohar
	 * @param driver
	 * @return 
	 */
	public AccountFileDocumentsPage clickDocuments(WebDriver driver) {
		BrowserActions.click(driver, lnkDocuments , "Documents link");
		return new AccountFileDocumentsPage(driver).get();
	}
	
	/**
	 * Clicks on  Buildings And Location Screen button
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 */
	public BuildingsAndLocationsPage clickBuildingsAndLocationScreen(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsAndLocationScreen,"Buildings And Location Screen button");
		return new BuildingsAndLocationsPage(driver).get();
	}
	public FormsPage clickFormsScreen(WebDriver driver)  {
		BrowserActions.click(driver, btnForms, "Forms Tab");
		return new FormsPage(driver).get();
	}
	public MergeAccountIntoThisAccountPage clickMergeAccountIntoThisAccount(WebDriver driver) {
		BrowserActions.click(driver, btnMergeAccountIntoThisAccount,"Merge Accounts");
		return new MergeAccountIntoThisAccountPage(driver).get();
	}
	public AccountSummaryPage clickWithdrawAccount(WebDriver driver) {
		BrowserActions.click(driver, btnWithdrawAccount,true,"Withdraw Account");
		return new AccountSummaryPage(driver).get();
	}
	public  AccountSummaryPage clickReopenAccount(WebDriver driver) {
		BrowserActions.click(driver, btnReOpenAccount,true, "ReOpenAccount");
		return new AccountSummaryPage(driver).get();
	}
	public ActionsPage clickMovePolicies(WebDriver driver){
		BrowserActions.click(driver, btnMovePoliciesAccount,"Move policy");
		return this;
	}
	public ActionsPage clickRewritePolicieToThisAccount(WebDriver driver){
		BrowserActions.click(driver, btnRewritePolicieToThisAccount,"Rewrite policy");
		return this;
	}
	
	public ActionsPage clickQuotelink(WebDriver driver){
		BrowserActions.click(driver, lnkQuote,"Quote link");
		return this;
	}
	public ActionsPage clickUploadDocuments(WebDriver driver) {
		BrowserActions.click(driver, btnUploadDocuments,true, "Upload Documents");
		return this;
	}
	public void clickDocument(WebDriver driver) {
		BrowserActions.click(driver, lnkDocuments , 2,"Documents link");
	}
	
}