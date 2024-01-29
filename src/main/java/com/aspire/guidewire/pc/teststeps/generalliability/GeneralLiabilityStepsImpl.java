package com.aspire.guidewire.pc.teststeps.generalliability;

import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.ActionsPage;
import com.aspire.guidewire.pc.pages.common.CancellationPage;
import com.aspire.guidewire.pc.pages.common.ConfirmationPage;
import com.aspire.guidewire.pc.pages.common.CreateAccountPage;
import com.aspire.guidewire.pc.pages.common.EnterAccountInformationPage;
import com.aspire.guidewire.pc.pages.common.FormsPage;
import com.aspire.guidewire.pc.pages.common.HeaderPage;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.pc.pages.common.ModifiersPage;
import com.aspire.guidewire.pc.pages.common.MySummaryPage;
import com.aspire.guidewire.pc.pages.common.NewSubmissionsPage;
import com.aspire.guidewire.pc.pages.common.NotTakenReasonPage;
import com.aspire.guidewire.pc.pages.common.OfferingsPage;
import com.aspire.guidewire.pc.pages.common.PaymentsPage;
import com.aspire.guidewire.pc.pages.common.PolicyBoundPage;
import com.aspire.guidewire.pc.pages.common.PolicyInfoPage;
import com.aspire.guidewire.pc.pages.common.PolicyReviewPage;
import com.aspire.guidewire.pc.pages.common.PolicySummaryPage;
import com.aspire.guidewire.pc.pages.common.PreRenewalDirectionForPolicyTermPage;
import com.aspire.guidewire.pc.pages.common.QualificationPage;
import com.aspire.guidewire.pc.pages.common.QuotePage;
import com.aspire.guidewire.pc.pages.common.RenewalDataEntryPage;
import com.aspire.guidewire.pc.pages.common.RiskAnalysisPage;
import com.aspire.guidewire.pc.pages.common.StartPolicyChangePage;
import com.aspire.guidewire.pc.pages.common.StartReinstatementPage;
import com.aspire.guidewire.pc.pages.common.SubmissionDeclinedPage;
import com.aspire.guidewire.pc.pages.generalliability.CoveragesPage;
import com.aspire.guidewire.pc.pages.generalliability.ExposuresPage;
import com.aspire.guidewire.pc.pages.generalliability.LocationsPage;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.AddLocationInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Exposures;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RiskAnalysis;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;

public class GeneralLiabilityStepsImpl implements GeneralLiabilitySteps {

	private String webSite;

	/**
	 * Enter "User name" in the User name Field 
	 * Enter "Password" in the Password Field 
	 * Click "Login" Button
	 * Login to application with valid credentials
	 * @param username
	 * @param password
	 */
	@Override
	public void loginIntoTheApplication(String username, String password) {
		this.webSite = DriverManager.getPCwebsite();
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), webSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		Log.messageStep("Logged into the Application",DriverManager.getDriver());
		new MySummaryPage(DriverManager.getDriver()).get();
	}

	/**
	 * Click on "Action" Button
	 * Click on "NewAccount" Button
	 * firstName - first name to be entered
	 * lastName - last name to be entered
	 * Click on the "Search" button for the Account Search
	 * Click on the create new account button 
	 * @param enterAccountInformation
	 */
	@Override
	public String searchAccount(EnterAccountInformation enterAccountInfo) {
		EnterAccountInformationPage enterAccountInformationPage = new HeaderPage(DriverManager.getDriver())
				.clickToggleAccountSubMenu(DriverManager.getDriver())
				.clickNewAccount(DriverManager.getDriver());
		enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), enterAccountInfo.getFirstName());
		enterAccountInformationPage.enterLastname(DriverManager.getDriver(), enterAccountInfo.getLastName());
		enterAccountInformationPage.clickSearch(DriverManager.getDriver());
		enterAccountInformationPage.clickCreateNewAccount(DriverManager.getDriver());
		String name = enterAccountInfo.getFirstName()+" "+enterAccountInfo.getLastName();
		Log.messageStep("Searched for account with First Name: " + enterAccountInfo.getFirstName() + " and Last Name: " + enterAccountInfo.getLastName(), DriverManager.getDriver());
		return name;
	}

	/**
	 * Click on "CreateNewAccount" Toggle
	 * Used click Account for a "Person"
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * Used to verify AccountNo Generated with Numeric values
	 * @return Policy account number
	 * @param createNewAccount
	 */
	@Override
	public String createAccount(CreateNewAccount createNewAccount) {
		CreateAccountOptions  createAccountOption = createNewAccount.getCreateAccountPreference();
		String accountNumberText = "";
		switch(createAccountOption) {

		case PERSON:

			new EnterAccountInformationPage(DriverManager.getDriver()).clickPerson(DriverManager.getDriver());
			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());
			CreateNewAccountFromPerson createNewAccountFromPerson = (CreateNewAccountFromPerson)createNewAccount;

			new EnterAccountInformationPage(DriverManager.getDriver());
			if(createNewAccountFromPerson.getFirstName()!=null) 
				createAccountPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) 
				createAccountPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
			if(createNewAccountFromPerson.getAddressLine1()!=null) 
				createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromPerson.getAddressLine1());
			if(createNewAccountFromPerson.getState()!=null) 
				createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if(createNewAccountFromPerson.getCity()!=null) 
				createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if(createNewAccountFromPerson.getZipCode()!=null) 
				createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if(createNewAccountFromPerson.getAddressType()!=null) 
				createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromPerson.getAddressType());
			if(createNewAccountFromPerson.getOrganization()!=null) 
				createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromPerson.getOrganization());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			new AccountSummaryPage(DriverManager.getDriver()).get();
			Log.messageStep("Created account with First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName(), DriverManager.getDriver());

		case COMPANY:
			//yet to implement
			break;

		case FROM_ADDRESS_BOOK:
			//yet to implement
		default:
			break;
		}
		return accountNumberText;
	}
	
	/**
	 * Click on "Action" Button
	 * Click on "NewSubmission" Button(After Account created)
	 * click "select" button based on Product Name
	 * @param productName
	 * returns account number which we created
	 */
	@Override
	public void selectProduct(ProductNames productName) {
		ActionsPage actionsPage = new MySummaryPage(DriverManager.getDriver())
				.clickActions(DriverManager.getDriver());
		NewSubmissionsPage NewSubmissionsPage = actionsPage.clickNewSubmissionAccount(DriverManager.getDriver());
		NewSubmissionsPage.clickSelectBtn(DriverManager.getDriver(), productName.getName());
		Log.messageStep("Product : " + productName.getName()+ " selected" , DriverManager.getDriver());
	}
	/**
	 * Used to select Offering Selection field option
	 * click "next" button to navigate to next page
	 * @return QualificationsPage
	 */
	@Override
	public void selectOfferings(Offerings offerings) {
		OfferingsPage OfferingsPage = new OfferingsPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(offerings).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(Offerings.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new OfferingsPage(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver()); 
			Log.messageStep("Offerings page processed",DriverManager.getDriver());
		}

		else {
			OfferingsPage.selectOfferingSelection(DriverManager.getDriver(), offerings.getOffering());	
			OfferingsPage.clickNext(DriverManager.getDriver()); 
			Log.messageStep("Offerings : " +offerings.getOffering()+ " selected"  ,DriverManager.getDriver());
		}
	}
	/**
	 * click "next" button to navigate to next page
	 * @return PolicyInfoPage
	 */
	@Override
	public void selectQualifications(Qualification qualification) {
		new QualificationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new PolicyInfoPage(DriverManager.getDriver()).get();
		Log.messageStep("Qualifications details Processed",DriverManager.getDriver());
	}

	/**
	 * Enters the date in "QuoteDate" Field
	 * Select Term type from "TermType" Drop down
	 * click "Next" button to navigate to next page
	 * @return DriversPage
	 */
	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {
		if(policyInfo.isNext() == true) {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			policyInfoPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Information Processed",DriverManager.getDriver());

		}
		else {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			if(policyInfo.getOrganizationType()!=null)
				policyInfoPage.selectOrganizationType(DriverManager.getDriver(), policyInfo.getOrganizationType());
			if(policyInfo.getPolicyEffectiveDate()!=null) 
				policyInfoPage.enterDateQuoteNeeded(DriverManager.getDriver(), policyInfo.getPolicyEffectiveDate());
			if(policyInfo.getPolicyTerm()!=null) 
				policyInfoPage.selectTermType(DriverManager.getDriver(), policyInfo.getPolicyTerm());
			if(policyInfo.isAddAdditionalInsured()) { 
				policyInfoPage.clickAdditionalInsuredForPerson(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
				Log.messageStep("Policy Information entered for date : " +policyInfo.getPolicyEffectiveDate() + " and policy term type : " +policyInfo.getPolicyTerm(), DriverManager.getDriver());
			}
			policyInfoPage.clickNext(DriverManager.getDriver());
			new LocationsPage(DriverManager.getDriver()).get();
		}
	}

	/**
	 * Used to add the location details
	 * Enter the Address 1 ,City, Country, Territory code and Zip Code
	 * @param addLocationInfo
	 */
	@Override
	public void addLocation(AddLocationInfo addLocationInfo ) {
		if(addLocationInfo.isNext() == true) {
			LocationsPage locationpage = new LocationsPage(DriverManager.getDriver());
			locationpage.clickNext(DriverManager.getDriver());
			Log.messageStep("Location Details processed",DriverManager.getDriver());
		}
		else {
			LocationsPage locationpage = new LocationsPage(DriverManager.getDriver());
			locationpage.clickNewLocation(DriverManager.getDriver());
			locationpage.new LocationInformationPage(DriverManager.getDriver())
			.enterAddress1(DriverManager.getDriver(),addLocationInfo.getAddressLine1())
			.enterCity(DriverManager.getDriver(), addLocationInfo.getCity())
			.selectState(DriverManager.getDriver(), addLocationInfo.getState())
			.enterZIPCode(DriverManager.getDriver(), addLocationInfo.getZipCode())
			.clickAutofillTerritoryCodes(DriverManager.getDriver()).clickOK(DriverManager.getDriver());
			locationpage.clickNext(DriverManager.getDriver());
			Log.messageStep("Location Details for state : " + addLocationInfo.getState() + " entered",DriverManager.getDriver());
		}
	}
	
	/**
	 * Used to click on "Add Coverage"
	 * click search button
	 * click coverage check box
	 * click add Selected Coverage
	 * Enter designated pollutants
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void addCoverage(Coverages coverage) {
		if(coverage.isNext()) {
			new CoveragesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new ExposuresPage(DriverManager.getDriver()).get();
			Log.messageStep("Coverage Details processed",DriverManager.getDriver());
		}
		else if(coverage.isAddAdditionalCoverage()) { 
			CoveragesPage coveragePage= new CoveragesPage(DriverManager.getDriver());
			coveragePage.clickAdditionalCoverages(DriverManager.getDriver())
			.clickAddAdditionalCoverages(DriverManager.getDriver());
			coveragePage.new SearchCoveragesPage(DriverManager.getDriver())
			.clickSearch(DriverManager.getDriver())
			.clickCoveragechkbox(DriverManager.getDriver())
			.clickAddSelectedCoverages(DriverManager.getDriver());
			coveragePage.enterDesignatedPollutants(DriverManager.getDriver(), coverage.getDesignatedPollutants());
			new CoveragesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Coverage Details with Pollutants : " + coverage.getDesignatedPollutants() + " entered",DriverManager.getDriver());
		}
	}

	/**
	 * Used to click on Add button
	 * Used to select location
	 * Used to Enter on Class code Search
	 * Used to Enter Basis
	 * click next button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void addExposures(Exposures exposures) {

		if(exposures.isNext()) {
			new ExposuresPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Exposures details processed",DriverManager.getDriver());
		}
		else {
			new ExposuresPage(DriverManager.getDriver()).clickAdd(DriverManager.getDriver())
			.selectLocation(DriverManager.getDriver())
			.enterClassCodeSearch(DriverManager.getDriver(),exposures.getCode())
			.enterBasis(DriverManager.getDriver(), exposures.getBasis())
			.clickNext(DriverManager.getDriver());
			Log.messageStep("Exposures details with class code : " + exposures.getCode() + " entered",DriverManager.getDriver());
		}
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void addModifiersDetails() {
		new ModifiersPage(DriverManager.getDriver()).get();
		new ModifiersPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Modifier details processed",DriverManager.getDriver());
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {
		new RiskAnalysisPage(DriverManager.getDriver()).get();
		new RiskAnalysisPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Risk analysis details processed",DriverManager.getDriver());
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return PolicyReviewPage
	 */
	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		new PolicyReviewPage(DriverManager.getDriver()).get();
		switch (policyreview.getPolicyReviewType())
		{
		case NONE:
			new PolicyReviewPage(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;
		case RENEW:
			new PolicyReviewPage(DriverManager.getDriver())
			.clickEditPolicyTransaction(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;
		case OUT_OF_SEQUENCE:
			new PolicyReviewPage(DriverManager.getDriver())
			.clickChangeConflictTab(DriverManager.getDriver())
			.clickShouldOverrideNoRadioButton(DriverManager.getDriver())
			.clickSubmit(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
		}
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return QuotePage
	 */
	@Override
	public void viewForms() {
		new FormsPage(DriverManager.getDriver()).get();	
		new FormsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());	
		Log.messageStep("Forms page processed",DriverManager.getDriver());
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return FormsPage
	 */
	@Override
	public void selectPayments(Payments payments) {
		String billingMethod="None";
		String paymentPlan="None";
		String upFrontPayment="None";
		PaymentsPage paymentsPage = new PaymentsPage(DriverManager.getDriver()).get();
		if(payments.getBillingMethod()!=null) {
			billingMethod=payments.getBillingMethod();
			paymentsPage.selectBillingMethod(DriverManager.getDriver(),payments.getBillingMethod());
		}
		if(payments.getPaymentPlan()!=null) {
			paymentPlan=payments.getPaymentPlan();
			paymentsPage.choosePaymentSchedule(DriverManager.getDriver(),payments.getPaymentPlan());
		}
		if(payments.getUpFrontPayment()!=null) {
			upFrontPayment=payments.getUpFrontPayment();
			paymentsPage.chooseUpFrontPayment((DriverManager.getDriver()),payments.getUpFrontPayment()).clickAdd((DriverManager.getDriver()));	
		}
		Log.messageStep("Entered payment details - Billing Method : " +billingMethod + " , Payment Plan : " +paymentPlan +" and upFrontPayment : " +upFrontPayment, DriverManager.getDriver());
	}

	/**
	 * click "Next" button to navigate to next page
	 * Select BillingMethod from BillingMethod dropdown
	 * Select PaymentSchedule from PaymentSchedule dropdown
	 * Select cash from Upfront payment
	 * @return PaymentsPage
	 */
	@Override
	public void issuepolicy(Transactions transaction) {
		switch(transaction) {
		case SUBMISSION:
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Issued successfully for "+transaction,DriverManager.getDriver());
			break;
		case POLICY_CHANGE:
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			new PolicyBoundPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Issued successfully for "+transaction,DriverManager.getDriver());
			break;
		case REWRITE_FULL_TERM:
		case REWRITE_NEW_TERM:
		case REWRITE_REMAINDER_TERM:
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Issued successfully for "+transaction,DriverManager.getDriver());
			break;
		case RENEW_POLICY:	
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver())
			.clickRenew(DriverManager.getDriver());
			new RenewalDataEntryPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Issued successfully for "+transaction,DriverManager.getDriver());
			break;
		}
	}

	/**
	 * click "View Policy" submission
	 */
	@Override
	public void viewPolicy() {
		new PolicyBoundPage(DriverManager.getDriver())
		.clickViewPolicy(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Policy Viewed Successfully",DriverManager.getDriver());
	}	
	
	/**
	 * click "cancel policy" from Policy summary page
	 * Used to start Cancellation Process
	 * Used to select "Source" and "Reason" Fields
	 * Used to click on "Start Cancellation" button
	 * Used to Click on "Bind" option then click on "Cancel Now" button
	 * Verify that the submission has been Cancelled 
	 * Used to click on "ViewPolicy"
	 */
	@Override
	public void cancelPolicy(CancellationSource cancellationSource) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).clickCancelPolicy(DriverManager.getDriver());
		CancellationPage cancellationPage=new CancellationPage(DriverManager.getDriver()).selectSource(DriverManager.getDriver(), cancellationSource.getSource())
		.selectReason(DriverManager.getDriver(), cancellationSource.getReason());
		String refundMethod=cancellationPage.getRefundMethod(DriverManager.getDriver());
		cancellationPage.clickStartCancellation(DriverManager.getDriver());
		new ConfirmationPage(DriverManager.getDriver())
		.clickbindOptions(DriverManager.getDriver())
		.clickCancelNow(DriverManager.getDriver());
		Log.messageStep("Policy cancelled successfully for "+refundMethod,DriverManager.getDriver());
	}

	/**
	 * Click "Action" Button
	 * Click on "ChangePolicy" Button
	 * click "Next" button to navigate to next page
	 * @param EffectiveDate
	 * returns OfferingsPage
	 */
	@Override
	public void policyChange(PolicyChange policyChange) {
		StartPolicyChangePage startPolicyChangePage = new ActionsPage(DriverManager.getDriver())
				.clickActions(DriverManager.getDriver())
				.clickChangePolicy(DriverManager.getDriver());	
		startPolicyChangePage.enterEffectiveDate(DriverManager.getDriver(), policyChange.getDate());
		startPolicyChangePage.clickNext(DriverManager.getDriver());
		Log.messageStep("Effective date : " +policyChange.getDate()+ " updated in start policy change" ,DriverManager.getDriver());
	}

	/**
	 * Click on Action then Clicked on PreRenewal Direction button
	 * Click Edit button
	 * EnterText and Select SecurityLevel,NonRenewReason,Direction PreRenewal Direction of an policy
	 * Click Update Button
	 * @param PreRenewalDirection
	 */
	@Override
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection) {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickPreRenewalDirection(DriverManager.getDriver());
		new PreRenewalDirectionForPolicyTermPage(DriverManager.getDriver())
		.clickEdit(DriverManager.getDriver())
		.selectDirection(DriverManager.getDriver(), preRenewalDirection.getDirection())
		.selectNonRenewReason(DriverManager.getDriver(), preRenewalDirection.getReason())
		.selectSecurityLevel(DriverManager.getDriver(), preRenewalDirection.getSecurity())
		.enterText(DriverManager.getDriver(), preRenewalDirection.getText())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Clicked on Pre Renewal Direction link for Direction : " +preRenewalDirection.getDirection(),DriverManager.getDriver());
	}

	/**
	 * Click Reinstate button from Actions menu
	 * click Start Reinstate, select neccessary option and clik quote button
	 * click reinstate button
	 * @param reinstatementReason
	 */
	@Override
	public void reinstatePolicy(ReinstatementReason reinstatementReason) {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickReinstatePolicy(DriverManager.getDriver());
		new StartReinstatementPage(DriverManager.getDriver())
		.selectReason(DriverManager.getDriver(), reinstatementReason.getReason())
		.clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver())
		.clickReinstate(DriverManager.getDriver());
		Log.messageStep("Reinstate Policy is Processed for Reason : " +reinstatementReason.getReason(),DriverManager.getDriver());
	}


	/**
	 * Click on "RewriteFullTerm" Button 
	 * Returns PolicyBoundPage
	 */
	@Override
	public void policyRewriteFullTerm() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRewriteFullTermPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite Full Term link",DriverManager.getDriver());
	}


	/**
	 * Clicks on Actions
	 * Used to click on Rewrite New Term transaction
	 */
	@Override
	public void policyRewriteNewTerm() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRewriteNewTerm(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite New Term link",DriverManager.getDriver());
	}

	/**
	 * Click Reinstate button from Actions menu
	 * click reinstate button
	 * @param reinstatementReason
	 */
	@Override
	public void policyRenew() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRenewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Renew Successfully and Renew Policy process is started",DriverManager.getDriver());
	}

	/**
	 * Click "Action" Button
	 * select RenewalCode from RenewalCode dropdown
	 * Click "Ok" Button
	 * returns RenewalDataEntryPage
	 */
	@Override
	public void policyRenewal(RenewPolicy renewPolicy) {
		new RenewalDataEntryPage(DriverManager.getDriver())
		.selectRenewalCode(DriverManager.getDriver(),renewPolicy.getRenewalcode()).clickOk(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed : " +renewPolicy.getRenewalcode()+ " successfully",DriverManager.getDriver());
	}

	/**
	 * click "closeOptions" button
	 * choose Whether withdraw Transaction, Not Taken, Decline for closing the policy
	 * @param closeOptions
	 */
	@Override
	public void policyCloseOptions(CloseOptions closeOptions) {
		switch(closeOptions.getCloseOptionType()) {
		case WITHDRAW_TRANSACTION:
			new PaymentsPage(DriverManager.getDriver())
			.clickCloseOptions(DriverManager.getDriver())
			.clickWithdrawTransaction(DriverManager.getDriver());
			Log.messageStep("Clicked on Withdrawn Direction",DriverManager.getDriver());
			break;
		case NOT_TAKEN:
			new PaymentsPage(DriverManager.getDriver())
			.clickCloseOptions(DriverManager.getDriver())
			.clickNotTaken(DriverManager.getDriver());
			new NotTakenReasonPage(DriverManager.getDriver())
			.selectReasonCode(DriverManager.getDriver(),closeOptions.getReasonNotTaken())
			.clickNotTaken(DriverManager.getDriver());
			Log.messageStep("Clicked on Not Taken",DriverManager.getDriver());
			break;
		case DECLINE:
			new PaymentsPage(DriverManager.getDriver())
			.clickCloseOptions(DriverManager.getDriver())
			.clickDecline(DriverManager.getDriver());
			new SubmissionDeclinedPage(DriverManager.getDriver())
			.selectReasonCode(DriverManager.getDriver(),closeOptions.getReasonDeclined())
			.clickDecline((DriverManager.getDriver()));
			Log.messageStep("Clicked on Decline",DriverManager.getDriver());
			break;
		}
	}

	/**
	 * click "Actions" button
	 * click "CopySubmission" button
	 */
	@Override
	public void copySubmission() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickCopySubmission(DriverManager.getDriver());
		Log.messageStep("Copy Submission Policy process is started",DriverManager.getDriver());
	}

	/**
	 * Enter Additional Insured Person Details
	 * Enter Secondary Insured Person Details
	 * @param createNewAccountFromPerson
	 * @return 
	 */
	@Override
	public String addInsured(CreateNewAccount createNewAccount) {
		CreateAccountOptions  createAccountOption = createNewAccount.getCreateAccountPreference();
		String name = "";
		CreateNewAccountFromPerson createNewAccountFromPerson = null; // declare and initialize createNewAccountFromPerson to null
		switch(createAccountOption) {

		case PERSON:

			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());	
			EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
			createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; // set createNewAccountFromPerson inside the PERSON case

			if(createNewAccountFromPerson.isAddSecondaryInsured())
				new PolicyInfoPage(DriverManager.getDriver()).clickSecondaryInsuredForPerson(DriverManager.getDriver());

			if(createNewAccountFromPerson.isAddAdditionalInsured())
				new PolicyInfoPage(DriverManager.getDriver()).clickAdditionalInsuredForPerson(DriverManager.getDriver());

			if(createNewAccountFromPerson.getFirstName()!=null) 
				enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) 
				enterAccountInformationPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
			if(createNewAccountFromPerson.getAddressLine1()!=null) 
				createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromPerson.getAddressLine1());
			if(createNewAccountFromPerson.getState()!=null) 
				createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if(createNewAccountFromPerson.getCity()!=null) 
				createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if(createNewAccountFromPerson.getZipCode()!=null) 
				createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if(createNewAccountFromPerson.getAddressType()!=null) 
				createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromPerson.getAddressType());
			if(createNewAccountFromPerson.getOrganization()!=null) 
				createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromPerson.getOrganization());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			name = createNewAccountFromPerson.getFirstName()+" "+createNewAccountFromPerson.getLastName();
			Log.messageStep("Insured account First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName() + (" entered"), DriverManager.getDriver());

		case COMPANY:
			//yet to implement
			break;

		case FROM_ADDRESS_BOOK:
			//yet to implement
		default:
			break;
		}
		return name;
	}

	/**
	 * To verify out of sequence message in every page
	 * @param policyChange
	 */
	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
		new HeaderPage(DriverManager.getDriver())
		.verifyOutOfSequenceMessage(DriverManager.getDriver(), policyChange.getDate());
	}

	/**
	 *Click on Next Button 
	 * Returns Forms Page
	 */
	@Override
	public void viewQuote() {
		new QuotePage(DriverManager.getDriver()).get()
		.clickNext(DriverManager.getDriver());
		Log.messageStep("Quote page processed",DriverManager.getDriver());
	}
	
	/**
	 * Used to Search given Policy Number 
	 * Click on Policy Toggle Sub menu
	 * Type Policy Number in Policy Search field
	 * Click on policy Search icon
	 */
	@Override
	public void searchPolicyNumber(PolicyDetails policyDetails) {
		new HeaderPage(DriverManager.getDriver())
				.clickTogglePolicySubMenu(DriverManager.getDriver())
				.enterPolicyNumber(DriverManager.getDriver(), policyDetails.getPolicyNumber())
				.clickPolicySearch(DriverManager.getDriver());
		        Log.messageStep("Searched on Policy Number",DriverManager.getDriver());
	}
	
	/**
	 * Used to Copy Submission 
	 * Click on "Actions"
	 * Click on "Copy Submission"
	 * Click on "Quote"
	 * Click on "Bind Options"
	 * Click on "Issue Policy"
	 */
	@Override
	public void copySubmissions() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickCopySubmission(DriverManager.getDriver());
		new OfferingsPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());
	}

}