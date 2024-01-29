package com.aspire.guidewire.pc.pages.common;
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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class AccountSummaryPage extends LoadableComponent<AccountSummaryPage> {

	WebDriver driver;
	String elementIdentifier;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountStatus']", AI = false)
	public WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AddressDescription']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='AccountFile_Summary-AccountSummaryDashboard-CurrentPoliciesTileLV-CurrentPolicyTermsListViewTile-CurrentPolicyTermsListViewTile_LV-filters']", AI = false)
	public WebElement drpFilters;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-NotesDetailViewTile-NotesDetailViewTile_DV-NoteBody0']", AI = false)
	public WebElement inpNoteBody0;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-MultipleCurrenciesWarning-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-NotesDetailViewTile-NotesDetailViewTile_DV-NoteBody2']", AI = false)
	public WebElement inpNoteBody2;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-NotesDetailViewTile-NotesDetailViewTile_DV-NoteBody1']", AI = false)
	public WebElement inpNoteBody1;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-_viewMore", AI = false)
	public WebElement lnkViewAccountBilling;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-NotesDetailViewTile-_viewMore", AI = false)
	public WebElement lnkViewAll;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-NotesDetailViewTile-NewNote>div[role='button']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-NotesDetailViewTile-NotesDetailViewTile_DV-NoteRelatedTo2']", AI = false)
	public WebElement inpDependentonRender_1;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-AccountOverviewDetailViewTile-Indicators-ThreeYearLoss", AI = false)
	public WebElement lbl3YrLoss;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountOverviewDetailViewTile-AccountOverviewDetailViewTile_DV-DelinquenciesCount']", AI = false)
	public WebElement inpDelinquenciesLast12Months;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-CoverageCurrency']", AI = false)
	public WebElement inpCoverageCurrency;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-LastPayment2']", AI = false)
	public WebElement inpLastPayment_1;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-LossRatioAlert .gw-AlertBar--label", AI = false)
	public WebElement lblLossRatioAlert;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-AccountOverviewDetailViewTile-Indicators-ThreeYearLossRatio", AI = false)
	public WebElement lbl3YrLossRatio;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountStatusUpdateTime']", AI = false)
	public WebElement inpWithdrawnDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountOverviewDetailViewTile-AccountOverviewDetailViewTile_DV-NonPaymentCancellationsCount']", AI = false)
	public WebElement inpNonpayCancelsLast12Months;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id='AccountFile_Summary-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-AccountOverviewDetailViewTile-Actions-RecalculateLossRatio>div[role='button']", AI = false)
	public WebElement btnRecalculate;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-Actions-EditAccount>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-ContactDetailsTileInputSet-SSN']", AI = false)
	public WebElement inpSSN;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountOverviewDetailViewTile-AccountOverviewDetailViewTile_DV-AccountSince']", AI = false)
	public WebElement inpAccountSince;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-AccountLabel2']", AI = false)
	public WebElement inpAccountLabel2;

	@IFindBy(how = How.CSS, using = "select[name='AccountFile_Summary-AccountSummaryDashboard-CurrentPoliciesTileLV-CurrentPolicyTermsListViewTile-CurrentPolicyTermsListViewTile_LV-displayPolicyPeriodByStatus']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-SettlementCurrency']", AI = false)
	public WebElement inpSettlementCurrency;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-MultipleCurrenciesWarning .gw-AlertBar--label", AI = false)
	public WebElement lblMultipleCurrenciesWarning;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-LossRatioAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountHolder']", AI = false)
	public WebElement inpAccountHolder;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-Address']", AI = false)
	public WebElement inpBillingAddress;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-OpenBilling-0-0>div[role='button']", AI = false)
	public WebElement btnOpenBilling;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-AccountLabel0']", AI = false)
	public WebElement inpAccountLabel0;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-AccountLabel1']", AI = false)
	public WebElement inpAccountLabel1;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-NextInvoice0']", AI = false)
	public WebElement inpNextInvoiceDue;

	@IFindBy(how = How.CSS, using = "div[id*='AccountNumber'] div[id$='AccountNumber']", AI = false)
	public WebElement inpAccountNo;

	@IFindBy(how = How.CSS, using = "#AccountFile_Summary-AccountSummaryDashboard-AccountOverviewDetailViewTile-Indicators-ThreeYearPremium", AI = false)
	public WebElement lbl3YrPremium;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-LastPayment0']", AI = false)
	public WebElement inpLastPayment;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-BillingSummaryChartTile-NextInvoice2']", AI = false)
	public WebElement inpNextInvoiceDue_1;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_Summary-AccountSummaryDashboard-NotesDetailViewTile-NotesDetailViewTile_DV-NoteTopicLabel0']", AI = false)
	public WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "div[id$='AccountHolder']", AI = false)
	public WebElement lblAccountHolder;

	@IFindBy(how = How.CSS, using = "div[id$='AccountStatus']", AI = false)
	public WebElement lnkAccountStatus;

	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'CurrentActivitiesAccountListViewTile_LV')]//div[text()='No data to display']", AI = false)
	public WebElement lblNocurrentActivities;
	
	@IFindBy(how = How.CSS, using = "div[id$='Transaction_button']", AI = false)
	public WebElement lblSubmissionNo;
	
	@IFindBy(how = How.CSS, using ="div[id='gw-TabBarWidget--settings']", AI = false)
	public WebElement btnSetting;
	
	@IFindBy(how = How.CSS, using ="div[id='TabBar-LogoutTabBarLink']", AI = false)
	public WebElement lnkLogOutSuperUser;
	
	@IFindBy(how = How.CSS, using ="div[id$='AccountDetailsDetailViewTile_DV-AccountNumber']", AI = false)
	public WebElement lblAccountNumber;

	public String currentActivitiesList = "tr[id*='CurrentActivitiesAccountListViewTile']";
	
	public AccountSummaryPage(){
	}

	public AccountSummaryPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.minElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}
	
	public AccountSummaryPage(WebDriver driver, int timeout){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	public AccountSummaryPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public AccountSummaryPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public AccountSummaryPage selectFilters(WebDriver driver,String Filters)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFilters,Filters,"Filters");
		return this;
	}
	public AccountSummaryPage enterNoteBody0(WebDriver driver,String NoteBody0) {
		BrowserActions.type(driver, inpNoteBody0,NoteBody0, "NoteBody0");
		return this;
	}
	public AccountSummaryPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public AccountSummaryPage enterNoteBody2(WebDriver driver,String NoteBody2) {
		BrowserActions.type(driver, inpNoteBody2,NoteBody2, "NoteBody2");
		return this;
	}
	public AccountSummaryPage enterNoteBody1(WebDriver driver,String NoteBody1) {
		BrowserActions.type(driver, inpNoteBody1,NoteBody1, "NoteBody1");
		return this;
	}
	public AccountSummaryPage clickViewAccountBilling(WebDriver driver)  {
		BrowserActions.click(driver, lnkViewAccountBilling,"ViewAccountBilling");
		return this;
	}
	public AccountSummaryPage clickViewAll(WebDriver driver)  {
		BrowserActions.click(driver, lnkViewAll,"ViewAll");
		return this;
	}
	public AccountSummaryPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public AccountSummaryPage enterDependentonRender_1(WebDriver driver,String DependentonRender_1) {
		BrowserActions.type(driver, inpDependentonRender_1,DependentonRender_1, "DependentonRender_1");
		return this;
	}
	public AccountSummaryPage enterDelinquenciesLast12Months(WebDriver driver,String DelinquenciesLast12Months) {
		BrowserActions.type(driver, inpDelinquenciesLast12Months,DelinquenciesLast12Months, "DelinquenciesLast12Months");
		return this;
	}
	public AccountSummaryPage enterCoverageCurrency(WebDriver driver,String CoverageCurrency) {
		BrowserActions.type(driver, inpCoverageCurrency,CoverageCurrency, "CoverageCurrency");
		return this;
	}
	public AccountSummaryPage enterLastPayment_1(WebDriver driver,String LastPayment_1) {
		BrowserActions.type(driver, inpLastPayment_1,LastPayment_1, "LastPayment_1");
		return this;
	}
	public AccountSummaryPage enterWithdrawnDate(WebDriver driver,String WithdrawnDate) {
		BrowserActions.type(driver, inpWithdrawnDate,WithdrawnDate, "WithdrawnDate");
		return this;
	}
	public AccountSummaryPage enterNonpayCancelsLast12Months(WebDriver driver,String NonpayCancelsLast12Months) {
		BrowserActions.type(driver, inpNonpayCancelsLast12Months,NonpayCancelsLast12Months, "NonpayCancelsLast12Months");
		return this;
	}
	public AccountSummaryPage clickRecalculate(WebDriver driver)  {
		BrowserActions.click(driver, btnRecalculate,"Recalculate");
		return this;
	}
	public EditAccountPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return new EditAccountPage(driver).get();
	}
	public AccountSummaryPage enterSSN(WebDriver driver,String SSN) {
		BrowserActions.type(driver, inpSSN,SSN, "SSN");
		return this;
	}
	public AccountSummaryPage enterAccountSince(WebDriver driver,String AccountSince) {
		BrowserActions.type(driver, inpAccountSince,AccountSince, "AccountSince");
		return this;
	}
	public AccountSummaryPage enterAccountLabel2(WebDriver driver,String AccountLabel2) {
		BrowserActions.type(driver, inpAccountLabel2,AccountLabel2, "AccountLabel2");
		return this;
	}
	public AccountSummaryPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public AccountSummaryPage enterSettlementCurrency(WebDriver driver,String SettlementCurrency) {
		BrowserActions.type(driver, inpSettlementCurrency,SettlementCurrency, "SettlementCurrency");
		return this;
	}
	public AccountSummaryPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public AccountSummaryPage enterAccountHolder(WebDriver driver,String AccountHolder) {
		BrowserActions.type(driver, inpAccountHolder,AccountHolder, "AccountHolder");
		return this;
	}
	public AccountSummaryPage enterBillingAddress(WebDriver driver,String BillingAddress) {
		BrowserActions.type(driver, inpBillingAddress,BillingAddress, "BillingAddress");
		return this;
	}
	public AccountSummaryPage clickOpenBilling(WebDriver driver)  {
		BrowserActions.click(driver, btnOpenBilling,"OpenBilling");
		return this;
	}
	public AccountSummaryPage enterAccountLabel0(WebDriver driver,String AccountLabel0) {
		BrowserActions.type(driver, inpAccountLabel0,AccountLabel0, "AccountLabel0");
		return this;
	}
	public AccountSummaryPage enterAccountLabel1(WebDriver driver,String AccountLabel1) {
		BrowserActions.type(driver, inpAccountLabel1,AccountLabel1, "AccountLabel1");
		return this;
	}
	public AccountSummaryPage enterNextInvoiceDue(WebDriver driver,String NextInvoiceDue) {
		BrowserActions.type(driver, inpNextInvoiceDue,NextInvoiceDue, "NextInvoiceDue");
		return this;
	}
	public AccountSummaryPage enterAccountNo(WebDriver driver,String AccountNo) {
		BrowserActions.type(driver, inpAccountNo,AccountNo, "AccountNo");
		return this;
	}
	public AccountSummaryPage enterLastPayment(WebDriver driver,String LastPayment) {
		BrowserActions.type(driver, inpLastPayment,LastPayment, "LastPayment");
		return this;
	}
	public AccountSummaryPage enterNextInvoiceDue_1(WebDriver driver,String NextInvoiceDue_1) {
		BrowserActions.type(driver, inpNextInvoiceDue_1,NextInvoiceDue_1, "NextInvoiceDue_1");
		return this;
	}
	public AccountSummaryPage enterDependentonRender(WebDriver driver,String DependentonRender) {
		BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
		return this;
	}

	public AccountSummaryPage verifyAccountNo(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, inpAccountNo, "Account Number");
		return this;
	}
	public void verifyAccountHolderNameUpdated(WebDriver driver,String beforeUpdate) {
		String accountHolder = BrowserActions.getText(driver, lblAccountHolder, "Account Holder");
		Log.assertThat(!(accountHolder.equals(beforeUpdate)), "Changes are updated successfully"," Changes are not Updated");
	}

	public String getAccountNumberText(WebDriver driver)  {
		String accNo=BrowserActions.getText(driver, inpAccountNo, "Account No");
		return accNo;
	}
	public  AccountSummaryPage accountStatus(WebDriver driver, String statusName) {
		String actualStatus= lnkAccountStatus.getText();
		Log.assertThat(actualStatus.equals(statusName), "Account Status  is changed as "+statusName, "Account status is not Changed");
		return this;
	}
	public String getAccountHolderName(WebDriver driver) {
		String accountHolder = BrowserActions.getText(driver, lblAccountHolder, "Account Holder");
		return accountHolder;
	}

	public void verifyCurrentActivitiesDisplayed(WebDriver driver) {
		List<WebElement> currentActivities = driver.findElements(By.cssSelector(currentActivitiesList));
		Log.assertThat(currentActivities.size()>1, "Current Activities Displayed", "No Current Activities Listed");
	}

	public AccountSummaryPage verifyNoActivitiesDisplayed(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblNocurrentActivities, "No Activities");
		return this;
	}
	
	public  String submissionNo(WebDriver driver) {
		String submissionNo = BrowserActions.getText(driver, lblSubmissionNo, "Submission Number");
		return submissionNo;
	}
	public AccountSummaryPage clickSetting(WebDriver driver){
		BrowserActions.click(driver, btnSetting,"Setting Button");
		return this;
	}
	public AccountSummaryPage clickLogOutSuperUser(WebDriver driver){
		BrowserActions.click(driver, lnkLogOutSuperUser,3,"Log out Super user");
		return this;
	}
	public String getAccountNo(WebDriver driver)  {
		String accountNo=BrowserActions.getText(driver, lblAccountNumber,"Account Number");
		return accountNo;
	}
	
	
	
	public class EditAccountPage extends LoadableComponent<EditAccountPage> {
		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		@IFindBy(how = How.CSS, using = "#EditAccountPopup-__crumb__", AI = false)
		private WebElement btn__crumb__;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-MaritalStatus']", AI = false)
		private WebElement drpMaritalStatus;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpHomePhone_1;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressDescription']", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
		private WebElement btnEditaddress;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon>div[role='button']", AI = false)
		private WebElement btnLinkAddressMenuMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpHomePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		private WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		private WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ServiceTier']", AI = false)
		private WebElement drpServiceTier;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpMobilePhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-PrimaryPhone']", AI = false)
		private WebElement drpPrimaryPhone;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		private WebElement inpCity;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-PrimaryLanguage']", AI = false)
		private WebElement drpPreferredLanguage;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_6;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpWorkPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		private WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-IndustryCode-SelectIndustryCode", AI = false)
		private WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpFaxPhone;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-Nickname']", AI = false)
		private WebElement inpAccountNickname;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		private WebElement inpAddress_5;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpHomePhone;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-EmailAddress2']", AI = false)
		private WebElement inpSecondaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpWorkPhone_2;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-IndustryCode']", AI = false)
		private WebElement inpIndustryCode;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		private WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpMobilePhone;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-Update>div[role='button']", AI = false)
		private WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		private WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpHomePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		private WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-AddressType']", AI = false)
		private WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-EmailAddress1']", AI = false)
		private WebElement inpPrimaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		private WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
		private WebElement inpSSN;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-DateOfBirth']", AI = false)
		private WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
		private WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		private WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		private WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-OrgType']", AI = false)
		private WebElement drpOrganizationType;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpWorkPhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpFaxPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpMobilePhone_3;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpMobilePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		private WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		private WebElement inpName;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		private WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		private WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		private WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpWorkPhone;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-AccountCurrency-AccountCurrencyInputSet-PreferredCoverageCurrency']", AI = false)
		private WebElement drpCoverage;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-DescriptionOfBusiness']", AI = false)
		private WebElement inpDescriptionofBusiness;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpFaxPhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='EditAccountPopup-EditAccountScreen-ContactNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpFaxPhone_4;

		@IFindBy(how = How.CSS, using = "select[name='EditAccountPopup-EditAccountScreen-AccountCurrency-AccountCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
		private WebElement drpSettlement;

		@IFindBy(how = How.CSS, using = "#EditAccountPopup-EditAccountScreen-ContactNameInputSet-DateOfBirth_dateIcon", AI = false)
		private WebElement btnDateofBirthDateIcon;

		public EditAccountPage(){
		}

		public EditAccountPage(WebDriver driver){
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
		}public EditAccountPage click__crumb__(WebDriver driver)  {
			BrowserActions.click(driver, btn__crumb__,"__crumb__");
			return this;
		}
		public EditAccountPage selectMaritalStatus(WebDriver driver,String MaritalStatus)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMaritalStatus,MaritalStatus,"MaritalStatus");
			return this;
		}
		public EditAccountPage enterHomePhone_1(WebDriver driver,String HomePhone_1) {
			BrowserActions.type(driver, inpHomePhone_1,HomePhone_1, "HomePhone_1");
			return this;
		}
		public EditAccountPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public EditAccountPage clickEditaddress(WebDriver driver)  {
			BrowserActions.click(driver, btnEditaddress,"Editaddress");
			return this;
		}
		public EditAccountPage clickLinkAddressMenuMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLinkAddressMenuMenuIcon,"LinkAddressMenuMenuIcon");
			return this;
		}
		public EditAccountPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
			BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			return this;
		}
		public EditAccountPage enterParticle(WebDriver driver,String Particle) {
			BrowserActions.type(driver, inpParticle,Particle, "Particle");
			return this;
		}
		public EditAccountPage enterLastname(WebDriver driver,String Lastname) {
			BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			return this;
		}
		public EditAccountPage selectServiceTier(WebDriver driver,String ServiceTier)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpServiceTier,ServiceTier,"ServiceTier");
			return this;
		}
		public EditAccountPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
			BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			return this;
		}
		public EditAccountPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
			return this;
		}
		public EditAccountPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public EditAccountPage selectPreferredLanguage(WebDriver driver,String PreferredLanguage)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPreferredLanguage,PreferredLanguage,"PreferredLanguage");
			return this;
		}
		public EditAccountPage clickAutoFillIcon_6(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_6,"AutoFillIcon_6");
			return this;
		}
		public EditAccountPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
			return this;
		}
		public EditAccountPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public EditAccountPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public EditAccountPage enterFaxPhone(WebDriver driver,String FaxPhone) {
			BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
			return this;
		}
		public EditAccountPage enterAccountNickname(WebDriver driver,String AccountNickname) {
			BrowserActions.type(driver, inpAccountNickname,AccountNickname, "AccountNickname");
			return this;
		}
		public EditAccountPage enterAddress_5(WebDriver driver,String Address_5) {
			BrowserActions.type(driver, inpAddress_5,Address_5, "Address_5");
			return this;
		}
		public EditAccountPage enterHomePhone(WebDriver driver,String HomePhone) {
			BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
			return this;
		}
		public EditAccountPage enterSecondaryEmail(WebDriver driver,String SecondaryEmail) {
			BrowserActions.type(driver, inpSecondaryEmail,SecondaryEmail, "SecondaryEmail");
			return this;
		}
		public EditAccountPage enterWorkPhone_2(WebDriver driver,String WorkPhone_2) {
			BrowserActions.type(driver, inpWorkPhone_2,WorkPhone_2, "WorkPhone_2");
			return this;
		}
		public EditAccountPage enterIndustryCode(WebDriver driver,String IndustryCode) {
			BrowserActions.type(driver, inpIndustryCode,IndustryCode, "IndustryCode");
			return this;
		}
		public EditAccountPage enterFirstname(WebDriver driver,String Firstname) {
			BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			return this;
		}
		public EditAccountPage enterMobilePhone(WebDriver driver,String MobilePhone) {
			BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			return this;
		}
		public EditAccountPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public AccountSummaryPage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return new AccountSummaryPage(driver).get();
		}
		public EditAccountPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public EditAccountPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
			return this;
		}
		public EditAccountPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public EditAccountPage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
			return this;
		}
		public EditAccountPage enterPrimaryEmail(WebDriver driver,String PrimaryEmail) {
			BrowserActions.type(driver, inpPrimaryEmail,PrimaryEmail, "PrimaryEmail");
			return this;
		}
		public EditAccountPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public EditAccountPage enterSSN(WebDriver driver,String SSN) {
			BrowserActions.type(driver, inpSSN,SSN, "SSN");
			return this;
		}
		public EditAccountPage enterDateofBirth(WebDriver driver,String DateofBirth) {
			BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
			return this;
		}
		public EditAccountPage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public EditAccountPage enterMiddlename(WebDriver driver,String Middlename) {
			BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			return this;
		}
		public EditAccountPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public EditAccountPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public EditAccountPage selectOrganizationType(WebDriver driver,String OrganizationType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpOrganizationType,OrganizationType,"OrganizationType");
			return this;
		}
		public EditAccountPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
			BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			return this;
		}
		public EditAccountPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
			return this;
		}
		public EditAccountPage enterMobilePhone_3(WebDriver driver,String MobilePhone_3) {
			BrowserActions.type(driver, inpMobilePhone_3,MobilePhone_3, "MobilePhone_3");
			return this;
		}
		public EditAccountPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
			return this;
		}
		public EditAccountPage selectPrefix(WebDriver driver,String Prefix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
			return this;
		}
		public EditAccountPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public EditAccountPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public EditAccountPage selectSuffix(WebDriver driver,String Suffix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
			return this;
		}
		public EditAccountPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public EditAccountPage enterWorkPhone(WebDriver driver,String WorkPhone) {
			BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			return this;
		}
		public EditAccountPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public EditAccountPage selectCoverage(WebDriver driver,String Coverage)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
			return this;
		}
		public EditAccountPage enterDescriptionofBusiness(WebDriver driver,String DescriptionofBusiness) {
			BrowserActions.type(driver, inpDescriptionofBusiness,DescriptionofBusiness, "DescriptionofBusiness");
			return this;
		}
		public EditAccountPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
			BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
			return this;
		}
		public EditAccountPage enterFaxPhone_4(WebDriver driver,String FaxPhone_4) {
			BrowserActions.type(driver, inpFaxPhone_4,FaxPhone_4, "FaxPhone_4");
			return this;
		}
		public EditAccountPage selectSettlement(WebDriver driver,String Settlement)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSettlement,Settlement,"Settlement");
			return this;
		}
		public EditAccountPage clickDateofBirthDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnDateofBirthDateIcon,"DateofBirthDateIcon");
			return this;
		}
	}
}
