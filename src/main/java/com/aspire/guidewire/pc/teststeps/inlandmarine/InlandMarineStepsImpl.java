package com.aspire.guidewire.pc.teststeps.inlandmarine;

import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.ActionsPage;
import com.aspire.guidewire.pc.pages.common.CancellationPage;
import com.aspire.guidewire.pc.pages.common.ConfirmationPage;
import com.aspire.guidewire.pc.pages.common.CreateAccountPage;
import com.aspire.guidewire.pc.pages.common.EnterAccountInformationPage;
import com.aspire.guidewire.pc.pages.common.FormsPage;
import com.aspire.guidewire.pc.pages.common.HeaderPage;
import com.aspire.guidewire.pc.pages.common.LoginPage;
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
import com.aspire.guidewire.pc.pages.common.QuotePage;
import com.aspire.guidewire.pc.pages.common.RenewalDataEntryPage;
import com.aspire.guidewire.pc.pages.common.RiskAnalysisPage;
import com.aspire.guidewire.pc.pages.common.StartPolicyChangePage;
import com.aspire.guidewire.pc.pages.common.StartReinstatementPage;
import com.aspire.guidewire.pc.pages.common.SubmissionDeclinedPage;
import com.aspire.guidewire.pc.pages.inlandmarine.AccountsReceivablePage;
import com.aspire.guidewire.pc.pages.inlandmarine.BuildingsAndLocationsPage;
import com.aspire.guidewire.pc.pages.inlandmarine.ContractorsEquipmentPage;
import com.aspire.guidewire.pc.pages.inlandmarine.CoveragePartSelectionPage;
import com.aspire.guidewire.pc.pages.inlandmarine.SignsPage;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyDetails;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;

public class InlandMarineStepsImpl implements InlandMarineSteps {

	private static String webSite = DriverManager.getPCwebsite();

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
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), webSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		new MySummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Logged into the Application",DriverManager.getDriver());
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
		new MySummaryPage(DriverManager.getDriver()).get();
		EnterAccountInformationPage enterAccountInformationPage = new HeaderPage(DriverManager.getDriver()).clickToggleAccountSubMenu(DriverManager.getDriver()).clickNewAccount(DriverManager.getDriver());
		enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), enterAccountInfo.getFirstName());
		enterAccountInformationPage.enterLastname(DriverManager.getDriver(), enterAccountInfo.getLastName());
		enterAccountInformationPage.clickSearch(DriverManager.getDriver());
		enterAccountInformationPage.clickCreateNewAccount(DriverManager.getDriver());
		String name = enterAccountInfo.getFirstName()+" "+enterAccountInfo.getLastName();
		Log.messageStep("Searched for account with First Name : " + enterAccountInfo.getFirstName() + " and Last Name: " + enterAccountInfo.getLastName(), DriverManager.getDriver());
		return name;
	}

	/**
	 * Click on "CreateNewAccount" Toggle
	 * Used click Account for a "Person"
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * Used to verify AccountNo Generated with Numeric values
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

			EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
			if(createNewAccountFromPerson.getFirstName()!=null) enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) enterAccountInformationPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
			if(createNewAccountFromPerson.getAddressLine1()!=null) createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromPerson.getAddressLine1());
			if(createNewAccountFromPerson.getState()!=null) createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if(createNewAccountFromPerson.getCity()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if(createNewAccountFromPerson.getZipCode()!=null) createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if(createNewAccountFromPerson.getAddressType()!=null) createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromPerson.getAddressType());
			if(createNewAccountFromPerson.getOrganization()!=null) createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromPerson.getOrganization());
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
		ActionsPage actionsPage = new MySummaryPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		NewSubmissionsPage NewSubmissionsPage = actionsPage.clickNewSubmissionAccount(DriverManager.getDriver());
		NewSubmissionsPage.clickSelectBtn(DriverManager.getDriver(), productName.getName());
		Log.messageStep("Product : " + productName.getName()+ " selected" , DriverManager.getDriver());
	}

	/**
	 * Enters the date in "QuoteDate" Field
	 * Select Term type from "TermType" Drop down
	 * click "Next" button to navigate to next page
	 * return Coverage Part Selection Page
	 */
	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {
		String inputParams = new GsonBuilder().create().toJsonTree(policyInfo).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(PolicyInfo.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			policyInfoPage.clickNext(DriverManager.getDriver());
			new CoveragePartSelectionPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Information Processed with Policy term as "+policyInfo.getPolicyTerm(),DriverManager.getDriver());
		}
		else {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			policyInfoPage.selectOrganizationType(DriverManager.getDriver(), policyInfo.getOrganizationType());
			
			if(policyInfo.getCreateInsured()!=null)
			{ 
				policyInfoPage.clickAddAdditionalInsured(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
			}
			policyInfoPage.clickNext(DriverManager.getDriver());
			new CoveragePartSelectionPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Information entered with Term Type as "+policyInfo.getPolicyTerm()+" and Organization Type as " + policyInfo.getOrganizationType() + " are selected" ,DriverManager.getDriver());
		}
	}

	/**
	 * Used to proceed the Review Policy
	 * click "Next" button to navigate to next page
	 * @return PolicyReviewPage
	 */
	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		switch (policyreview.getPolicyReviewType())
		{
		case NONE:
			new PolicyReviewPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Review Informations processed",DriverManager.getDriver());
			break;

		case REWRITE_NEWTERM:
			new PolicyReviewPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Review Informations processed for REWRITE NEW TERM",DriverManager.getDriver());
			break;
		case RENEW:
			new PolicyReviewPage(DriverManager.getDriver()).clickEditPolicyTransaction(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Review Informations processed for RENEW",DriverManager.getDriver());
			break;
		case OUT_OF_SEQUENCE:
			new PolicyReviewPage(DriverManager.getDriver()).clickChangeConflictTab(DriverManager.getDriver()).
			clickShouldOverrideNoRadioButton(DriverManager.getDriver()).clickSubmit(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Review Informations processed for OUT OF SEQUENCE",DriverManager.getDriver());
		default:
			break;
		}
	}

	/**
	 * Used to Proceed Risk Analysis
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void selectRiskAnalysis() {
			new RiskAnalysisPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new PolicyReviewPage(DriverManager.getDriver()).get();
			Log.messageStep("Risk analysis details processed",DriverManager.getDriver());
	}
	
	/**
	 * click "Next" button to navigate to next page
	 * @return QuotePage
	 */
	@Override
	public void viewForms() {
		new FormsPage(DriverManager.getDriver()).get();	
		new FormsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Forms page is processed",DriverManager.getDriver());
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
		new PaymentsPage(DriverManager.getDriver()).get();
		PaymentsPage paymentsPage = new PaymentsPage(DriverManager.getDriver());
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
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;
		case POLICY_CHANGE:
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			new PolicyBoundPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;
		case REWRITE_FULL_TERM:
		case REWRITE_NEW_TERM:
		case REWRITE_REMAINDER_TERM:
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;
		case RENEW_POLICY:	
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver())
			.clickRenew(DriverManager.getDriver());
			new RenewalDataEntryPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;
		default:
			break;
		}
	}

	/**
	 * click "View Policy" submission
	 * @return PolicySummary Page
	 */
	@Override
	public void viewPolicy() {
		new PolicyBoundPage(DriverManager.getDriver()).get()
		.clickViewPolicy(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Clicked on View policy Link",DriverManager.getDriver());
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
		new ConfirmationPage(DriverManager.getDriver()).clickbindOptions(DriverManager.getDriver()).clickCancelNow(DriverManager.getDriver());
		Log.messageStep("Policy cancelled successfully for "+refundMethod,DriverManager.getDriver());
	}

	/**
	 * Click "Action" Button
	 * Click on "RewriteRemainderofTerm" Button
	 * @return 
	 */
	@Override
	public void policyRewriteRemainderTerm() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickRewriteRemainderOfTerm(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite Remainder Term link",DriverManager.getDriver());
	}

	/**
	 * Click "Action" Button
	 * Click on "ChangePolicy" Button
	 * click "Next" button to navigate to next page
	 * @param EffectiveDate
	 * @returns OfferingsPage
	 */
	@Override
	public void policyChange(PolicyChange policyChange) {
		StartPolicyChangePage startPolicyChangePage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
				.clickChangePolicy(DriverManager.getDriver());	
		startPolicyChangePage.enterEffectiveDate(DriverManager.getDriver(), policyChange.getDate());
		startPolicyChangePage.clickNext(DriverManager.getDriver());
		new PolicyInfoPage(DriverManager.getDriver()).get();
		Log.messageStep("Effective date : " +policyChange.getDate()+ " updated in start policy change" ,DriverManager.getDriver());
	}

	/**
	 * Click Reinstate button from Actions menu
	 * click Start Reinstate, select neccessary option and clik quote button
	 * click reinstate button
	 * @param reinstatementReason
	 * @return
	 */
	@Override
	public void reinstatePolicy(ReinstatementReason reinstatementReason) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickReinstatePolicy(DriverManager.getDriver());
		new StartReinstatementPage(DriverManager.getDriver()).selectReason(DriverManager.getDriver(), reinstatementReason.getReason())
		.clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickReinstate(DriverManager.getDriver());	
		Log.messageStep("Clicked on Reinstate Policy link for Reason : " +reinstatementReason.getReason(),DriverManager.getDriver());
	}

	/**
	 * Click on "RewriteFullTerm" Button 
	 * @returns PolicyBoundPage
	 */
	@Override
	public void policyRewriteFullTerm() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRewriteFullTermPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite Full Term link",DriverManager.getDriver());
	}

	/**
	 * Proceed Rewrite Process
	 * Click on Action Button
	 * Click on Rewrite New Term to Proceed
	 * @return PolicyInfoPage 
	 */
	@Override
	public void policyRewriteNewTerm() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRewriteNewTerm(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite New Term link",DriverManager.getDriver());
	}

	/**
	 * Click Renew button from Actions menu
	 * Click on "Actions" menu options
	 * click Renew button
	 */
	@Override
	public void policyRenew() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRenewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed Successfully",DriverManager.getDriver());
	}
	
	/**
	 * Click "Action" Button
	 * select RenewalCode from RenewalCode dropdown
	 * Click "Ok" Button
	 * @returns RenewalDataEntryPage
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
	 * @return 
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
			new PaymentsPage(DriverManager.getDriver()).clickCloseOptions(DriverManager.getDriver())
			.clickNotTaken(DriverManager.getDriver());
			new NotTakenReasonPage(DriverManager.getDriver()).selectReasonCode(DriverManager.getDriver(),closeOptions.getReasonNotTaken())
			.clickNotTaken(DriverManager.getDriver());
			Log.messageStep("Clicked on Not Taken",DriverManager.getDriver());
			break;
		case DECLINE:
			new PaymentsPage(DriverManager.getDriver()).clickCloseOptions(DriverManager.getDriver())
			.clickDecline(DriverManager.getDriver());
			new SubmissionDeclinedPage(DriverManager.getDriver()).selectReasonCode(DriverManager.getDriver(),closeOptions.getReasonDeclined())
			.clickDecline((DriverManager.getDriver()));
			Log.messageStep("Clicked on Decline",DriverManager.getDriver());
			break;
		}
	}

	/**
	 * click add secondary insured
	 * @param createNewAccountFromPerson
	 * @return PolicyInfoPage
	 */
	@Override
	public String addInsured(CreateNewAccount createNewAccount) {
		CreateAccountOptions  createAccountOption = createNewAccount.getCreateAccountPreference();
		String name = "";
		switch(createAccountOption) {
		
		case PERSON:
			
			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());	
			EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
			CreateNewAccountFromPerson createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; // set createNewAccountFromPerson inside the PERSON case

			if(createNewAccountFromPerson.isAddSecondaryInsured())
				new PolicyInfoPage(DriverManager.getDriver()).clickSecondaryInsuredForPerson(DriverManager.getDriver());

			if(createNewAccountFromPerson.isAddAdditionalInsured())
				new PolicyInfoPage(DriverManager.getDriver()).clickAdditionalInsuredForPerson(DriverManager.getDriver());
			
			if(createNewAccountFromPerson.getFirstName()!=null) enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) enterAccountInformationPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
			if(createNewAccountFromPerson.getAddressLine1()!=null) createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromPerson.getAddressLine1());
			if(createNewAccountFromPerson.getState()!=null) createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if(createNewAccountFromPerson.getCity()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if(createNewAccountFromPerson.getZipCode()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if(createNewAccountFromPerson.getAddressType()!=null) createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromPerson.getAddressType());
			if(createNewAccountFromPerson.getOrganization()!=null) createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromPerson.getOrganization());
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
	 * Used to add Building and Locations details
	 * Click on Add Building a dropdown New building button
	 * Enter the Description of the Building 
	 * Click on "OK" Button
	 * Click "Next" button to navigate to next page
	 * @param addBuildingLocationDetails
	 * @return Accounts Receivable Page
	 */
	@Override
	public void addBuildingLocationDetails(AddBuildingLocationDetails addAddBuildingLocationDetails) {
		String inputParams = new GsonBuilder().create().toJsonTree(addAddBuildingLocationDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddBuildingLocationDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new BuildingsAndLocationsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new AccountsReceivablePage(DriverManager.getDriver()).get();	
			Log.messageStep("Building Details processed",DriverManager.getDriver());
		}
		else {
			BuildingsAndLocationsPage buildingsAndLocationsPage=new BuildingsAndLocationsPage(DriverManager.getDriver())
					.clickAddBuildingDropdown(DriverManager.getDriver())
					.mouseOverAddBuilding(DriverManager.getDriver())
					.clickNewBuildings(DriverManager.getDriver());
			buildingsAndLocationsPage.new NewBuildingPage(DriverManager.getDriver())
			.enterDescription(DriverManager.getDriver(),addAddBuildingLocationDetails.getDescription())
			.clickOK(DriverManager.getDriver());
			buildingsAndLocationsPage.clickNext(DriverManager.getDriver());
			new AccountsReceivablePage(DriverManager.getDriver()).get();
			Log.messageStep("Building Details : " + addAddBuildingLocationDetails.getDescription()+ " entered",DriverManager.getDriver());

		}
	}

	/**
	 * Used to add Account Receivable Details
	 * Select "Business Class" and "Coinsurance Pct" 
	 * Click on "Add" button in Account Receivable Coverage section
	 * Select "Location/Building" ,"Receptacle Type", and "Percentage Duplicated"
	 * Enter the "Limit"
	 * Click "Next" button to navigate to next page
	 * @param addAddAccountReceivableDetails
	 * return Contractors equipment Page
	 */
	@Override
	public void addAccountReceivableDetails(AddAccountReceivableDetails addAddAccountReceivableDetails) {
		String inputParams = new GsonBuilder().create().toJsonTree(addAddAccountReceivableDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddAccountReceivableDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new AccountsReceivablePage(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			new ContractorsEquipmentPage(DriverManager.getDriver()).get();
			Log.messageStep("Account Receivable Details processed",DriverManager.getDriver());

		}
		else {
			new AccountsReceivablePage(DriverManager.getDriver())
			.selectBusinessClass(DriverManager.getDriver(), addAddAccountReceivableDetails.getBusinessClass())
			.selectCoinsurancePct(DriverManager.getDriver(), addAddAccountReceivableDetails.getCoinsurancePct())
			.clickAdd(DriverManager.getDriver())
			.selectLocationBuilding(DriverManager.getDriver())
			.selectReceptacleType(DriverManager.getDriver(), addAddAccountReceivableDetails.getReceptacleType())
			.selectPercentDuplicated(DriverManager.getDriver(), addAddAccountReceivableDetails.getPercentDuplicated())
			.enterLimit(DriverManager.getDriver(), addAddAccountReceivableDetails.getLimit())
			.clickNext(DriverManager.getDriver());
			new ContractorsEquipmentPage(DriverManager.getDriver()).get();
			Log.messageStep("Account Receivable Details for type : " + addAddAccountReceivableDetails.getReceptacleType() + " entered",DriverManager.getDriver());
		}
	}
	
	/**
	 * Used to add Coverage Part Selections
	 * Click on "AddCoveragePart"
	 * Select "ACCOUNTS_RECEIVABLE"
	 * Select "CONTRACTORS_EQUIPMENTS"
	 * Select "SIGNS"
	 * Click on "Next" Button
	 * @param addCoveragePartSelections
	 * return BuildingsAndLocationsPage
	 */
	@Override
	public void addCoveragePartSelections(AddCoveragePartSelections addCoveragePartSelections) {
		String inputParams = new GsonBuilder().create().toJsonTree(addCoveragePartSelections).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddCoveragePartSelections.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new CoveragePartSelectionPage(DriverManager.getDriver()).get()
			.clickNext(DriverManager.getDriver());
			new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
			Log.messageStep("Coverage Part Selection Details processed",DriverManager.getDriver());
		}
		else {

			CoveragePartSelectionPage coveragePartSelectionPage=new CoveragePartSelectionPage(DriverManager.getDriver()).get();

			switch(addCoveragePartSelections.getCoveragePart()) {
			case ACCOUNTS_RECEIVABLE:
				coveragePartSelectionPage.clickAddCoveragePart(DriverManager.getDriver())
				.clickAccountsReceivableLink(DriverManager.getDriver());
				Log.messageStep("Account Receivable Coverage Part Selection Details selected",DriverManager.getDriver());
				break;
			case CONTRACTORS_EQUIPMENTS:
				coveragePartSelectionPage.clickAddCoveragePart(DriverManager.getDriver())
				.clickContractorsEquipmentLink(DriverManager.getDriver());
				Log.messageStep("Contractors equipment Coverage Part Selection Details selected",DriverManager.getDriver());
				break;
			case SIGNS:
				coveragePartSelectionPage.clickAddCoveragePart(DriverManager.getDriver())
				.clickSignsLink(DriverManager.getDriver());
				Log.messageStep("Signs Coverage Part Selection Details selected",DriverManager.getDriver());
				break;
			}
		}
	}

	/**
	 * Used to add Contractors Equipment Details
	 * Select "Contructors Type", "Coinsurance"
	 * Click any unscheduled equipments check box
	 * Enter "Limit" and select "Deductable" fields
	 * Click "Next" button to navigate to next page
	 * @param addContractorsEquipmentDetails
	 * return SignsPage
	 */
	@Override
	public void addContractorsEquipmentDetails(AddContractorsEquipmentDetails addContractorsEquipmentDetails) {
		String inputParams = new GsonBuilder().create().toJsonTree(addContractorsEquipmentDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddContractorsEquipmentDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new ContractorsEquipmentPage(DriverManager.getDriver()).get()
			.clickNext(DriverManager.getDriver());
			new SignsPage(DriverManager.getDriver()).get();
			Log.messageStep("Contractors Equipment Details processed",DriverManager.getDriver());
		}
			else {
			new ContractorsEquipmentPage(DriverManager.getDriver())
			.selectContractorType(DriverManager.getDriver(), addContractorsEquipmentDetails.getContractorType())
			.selectCoinsurance(DriverManager.getDriver(), addContractorsEquipmentDetails.getCoinsurancePct())
			.clickContractorsEquipmentMiscItems(DriverManager.getDriver())
			.enterLimit(DriverManager.getDriver(), addContractorsEquipmentDetails.getLimit())
			.selectDeductible(DriverManager.getDriver(), addContractorsEquipmentDetails.getDeductible())
			.clickContractorsRentedEquipment(DriverManager.getDriver())
			.enterLimitRental(DriverManager.getDriver(), addContractorsEquipmentDetails.getLimit())
			.selectDeductibleRental(DriverManager.getDriver(), addContractorsEquipmentDetails.getDeductible())
			.clickNext(DriverManager.getDriver());
			new SignsPage(DriverManager.getDriver()).get();
			Log.messageStep("Contractors Equipment details with limit of : " + addContractorsEquipmentDetails.getLimit() + " entered",DriverManager.getDriver());
		}
	}

	/**
	 * Used to add Signs Details
	 * Select "Coinsurance" field
	 * Click "Add" button
	 * Select "Location, Sign Type
	 * Enter "Description" and "Limit"
	 * Click "Next" button to navigate to next page
	 * @param addSignDetails
	 * return Risk Analysis Page
	 */
	@Override
	public void addSignsDetails(AddSignsDetails addSignsDetails) {
		String inputParams = new GsonBuilder().create().toJsonTree(addSignsDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddSignsDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new SignsPage(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			new RiskAnalysisPage(DriverManager.getDriver()).get();
			Log.messageStep("Sign Details processed",DriverManager.getDriver());
		}
		else {
			new SignsPage(DriverManager.getDriver())
			.selectCoinsurance(DriverManager.getDriver(),addSignsDetails.getCoinsurancePct())
			.clickAdd(DriverManager.getDriver())
			.selectLocation(DriverManager.getDriver())
			.enterDescription(DriverManager.getDriver(), addSignsDetails.getDescription())
			.selectType(DriverManager.getDriver(), addSignsDetails.getSignType())
			.enterLimit(DriverManager.getDriver(), addSignsDetails.getLimit())
			.clickNext(DriverManager.getDriver());
			new RiskAnalysisPage(DriverManager.getDriver()).get();
			Log.messageStep("Sign Details type : " + addSignsDetails.getSignType()+ " selected",DriverManager.getDriver());
		}
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
	 * click Details button
	 * click approve or special approve button
	 * click next button
	 */
	@Override
	public void approveUWIssues() {
		new RiskAnalysisPage(DriverManager.getDriver()).clickDetails(DriverManager.getDriver())
		.clickApprove(DriverManager.getDriver())
		.clickOK(DriverManager.getDriver())
		.clickNext(DriverManager.getDriver());
		Log.messageStep("UW issues has been Approved", DriverManager.getDriver());
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
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickPreRenewalDirection(DriverManager.getDriver());
		new PreRenewalDirectionForPolicyTermPage(DriverManager.getDriver()).clickEdit(DriverManager.getDriver())
		.enterText(DriverManager.getDriver(), preRenewalDirection.getText())
		.selectDirection(DriverManager.getDriver(), preRenewalDirection.getDirection())
		.selectSecurityLevel(DriverManager.getDriver(), preRenewalDirection.getSecurity())
		.selectNonRenewReason(DriverManager.getDriver(), preRenewalDirection.getReason())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Clicked on Pre Renewal Direction link for Direction : " +preRenewalDirection.getDirection(),DriverManager.getDriver());
	}
	
	/**
	 * Click on Next Button�
	 * Returns Forms Page
	 */
	 @Override
	 public void viewQuote() {
        new QuotePage(DriverManager.getDriver()).get();;
        new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Quote page is processed",DriverManager.getDriver());
	}

	/**
	 * Used to Search the Policy Number
	 * Click on the Policy Arrow button
	 * Enter the Policy number in the Policy Number textbox
	 * Click on "Search" Button
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
	 * Used to Copy the Policy Submissions
	 * Click on "Action" and Click on "Copy Submission".
	 * Click on "Quote" button in Offering Page
	 * Click on "Bind Options" and click on "Issue Policy"
	 */
	@Override
	public void copySubmissions() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickCopySubmission(DriverManager.getDriver());
		new OfferingsPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());
	}

}