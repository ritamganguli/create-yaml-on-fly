package com.aspire.guidewire.pc.teststeps.workerscompensation;

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
import com.aspire.guidewire.pc.pages.workerscompensation.IndustryCodeSearchPage;
import com.aspire.guidewire.pc.pages.workerscompensation.LocationsPage;
import com.aspire.guidewire.pc.pages.workerscompensation.PolicyInfoPage;
import com.aspire.guidewire.pc.pages.workerscompensation.SupplementalPage;
import com.aspire.guidewire.pc.pages.workerscompensation.WCCoveragePage;
import com.aspire.guidewire.pc.pages.workerscompensation.WCOptionsPage;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.Offerings;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcCoverages;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcoptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RiskAnalysis;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class WorkersCompensationStepsImpl implements WorkersCompensationSteps {

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
		EnterAccountInformationPage enterAccountInformationPage = new HeaderPage(DriverManager.getDriver()).clickToggleAccountSubMenu(DriverManager.getDriver()).clickNewAccount(DriverManager.getDriver());
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
			CreateNewAccountFromPerson createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; // set createNewAccountFromPerson inside the PERSON case

			new EnterAccountInformationPage(DriverManager.getDriver());
			if(createNewAccountFromPerson.getFirstName()!=null) createAccountPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) createAccountPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
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
		Log.messageStep("Product :" + productName.getName()+ " selected" , DriverManager.getDriver());
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
			policyInfoPage.enterSSN(DriverManager.getDriver(),policyInfo.getSsn())
			.selectOrganizationType(DriverManager.getDriver(), policyInfo.getOrganizationType())
			.clickIndustrySearch(DriverManager.getDriver());
			new IndustryCodeSearchPage(DriverManager.getDriver()).clickSelectBtn(DriverManager.getDriver());
			Log.messageStep("Policy Information entered on Orgnaisation type as : " +policyInfo.getOrganizationType()+" and Term type as : "+policyInfo.getPolicyTerm(),DriverManager.getDriver());
			policyInfoPage.clickNext(DriverManager.getDriver());
			new LocationsPage(DriverManager.getDriver()).get();
		}
	}

	/**
	 * Click "Next" button to navigate to next page
	 * @param addLocationDetails
	 * @return Buildings Page
	 */
	@Override
	public void addLocationDetails(AddLocationDetails addLocationDetails) {
		if(addLocationDetails.isNext() == true) {
			LocationsPage locationpage = new LocationsPage(DriverManager.getDriver());
			locationpage.clickNext(DriverManager.getDriver());
		}
		else {
			LocationsPage locationsPage = new LocationsPage(DriverManager.getDriver());
			locationsPage.clickNext(DriverManager.getDriver());
			new WCCoveragePage(DriverManager.getDriver()).get();
		}
		Log.messageStep("Location is processed",DriverManager.getDriver());
	}

	/**
	 * Click "Next" button to navigate to next page
	 * @param add Wc Coverages
	 * @return Wc Coverages
	 */
	@Override
	public void addWcCoverages(AddWcCoverages addWcCoverages) {
		if(addWcCoverages.isNext()) {
			new WCCoveragePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new SupplementalPage(DriverManager.getDriver()).get();
			Log.messageStep("Wc Coverages is processed",DriverManager.getDriver());
		}
		else {
			WCCoveragePage wcCoveragePage = new WCCoveragePage(DriverManager.getDriver());
			wcCoveragePage.clickAddClass(DriverManager.getDriver()).selectGoverningLaw(DriverManager.getDriver(), addWcCoverages.getGoverningLaw())
			.selectLocation(DriverManager.getDriver())
			.enterClassCodeSearch(DriverManager.getDriver(),addWcCoverages.getCode())
			.enterBasis(DriverManager.getDriver(),addWcCoverages.getBasis()).clickNext(DriverManager.getDriver());
			new SupplementalPage(DriverManager.getDriver()).get();
			Log.messageStep("Wc Coverages is added for GoverningLaw : " +addWcCoverages.getGoverningLaw(),DriverManager.getDriver());
		}
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return PolicyReviewPage
	 */
	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		switch (policyreview.getPolicyReviewType())
		{
		case NONE:
			new PolicyReviewPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
			new QuotePage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());

			break;

		case REWRITE_NEWTERM:
			new PolicyReviewPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new QuotePage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;
		case RENEW:
			new PolicyReviewPage(DriverManager.getDriver()).clickEditPolicyTransaction(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;
		case OUT_OF_SEQUENCE:
			new PolicyReviewPage(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
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
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {
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
		new PaymentsPage(DriverManager.getDriver()).get();
		PaymentsPage paymentsPage = new PaymentsPage(DriverManager.getDriver());
		if(payments.getBillingMethod()!=null) {
			billingMethod=payments.getBillingMethod();
			paymentsPage.selectBillingMethod(DriverManager.getDriver(),billingMethod);
		}
		if(payments.getPaymentPlan()!=null) {
			paymentPlan=payments.getPaymentPlan();
			paymentsPage.choosePaymentSchedule(DriverManager.getDriver(),paymentPlan);
		}
		if(payments.getUpFrontPayment()!=null) {
			upFrontPayment=payments.getUpFrontPayment();
			paymentsPage.chooseUpFrontPayment((DriverManager.getDriver()),upFrontPayment).clickAdd((DriverManager.getDriver()));	
		}
		if (payments.getBillingMethod()== null && payments.getPaymentPlan()== null && payments.getUpFrontPayment()==null){
			Log.messageStep("Entered Payment  Billing Method as  'Direct Bill' and Payment Plan as : 'A Monthly 10% Down, 9 Max installments' ", DriverManager.getDriver());
		}
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
			new PaymentsPage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;
		case POLICY_CHANGE:
			new PaymentsPage(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
			new PolicyBoundPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;
		case REWRITE_FULL_TERM:
		case REWRITE_NEW_TERM:
		case REWRITE_REMAINDER_TERM:
			new PaymentsPage(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;
		case RENEW_POLICY:	
			new PaymentsPage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickRenew(DriverManager.getDriver());
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
		new PolicyBoundPage(DriverManager.getDriver()).clickViewPolicy(DriverManager.getDriver());
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
		Log.messageStep("effective date : " +policyChange.getDate()+ " updated in start policy change" ,DriverManager.getDriver());
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
		Log.messageStep("Quote will be processed Succesfully",DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickReinstate(DriverManager.getDriver());	
		Log.messageStep("Clicked on Reinstate Policy link for Reason : " +reinstatementReason.getReason(),DriverManager.getDriver());
	}

	/**
	 * Click on "RewriteFullTerm" Button 
	 * @returns PolicyBoundPage
	 */
	@Override
	public void policyRewriteFullTerm() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickRewriteFullTermPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite Full Term link",DriverManager.getDriver());
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
	 * Click Reinstate button from Actions menu
	 * click reinstate button
	 * @param reinstatementReason
	 * @author anitha.raphel
	 */
	@Override
	public void policyRenew() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickRenewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed and Renew Policy will be Processed",DriverManager.getDriver());
	}

	/**
	 * Click "Action" Button
	 * select RenewalCode from RenewalCode dropdown
	 * Click "Ok" Button
	 * @returns RenewalDataEntryPage
	 */
	@Override
	public void policyRenewal(RenewPolicy renewPolicy) {
		new RenewalDataEntryPage(DriverManager.getDriver()).selectRenewalCode(DriverManager.getDriver(),renewPolicy.getRenewalcode())
		.clickOk(DriverManager.getDriver());
		Log.messageStep("Policy Will be Renewed Succefully with Renewal code as "+renewPolicy.getRenewalcode(),DriverManager.getDriver());
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
			Log.messageStep("Policy will be Withdrawn Successfully",DriverManager.getDriver());
			break;
		case NOT_TAKEN:
			new PaymentsPage(DriverManager.getDriver()).clickCloseOptions(DriverManager.getDriver())
			.clickNotTaken(DriverManager.getDriver());
			new NotTakenReasonPage(DriverManager.getDriver()).selectReasonCode(DriverManager.getDriver(),closeOptions.getReasonNotTaken())
			.clickNotTaken(DriverManager.getDriver());
			Log.messageStep("Policy will be Closed with "+closeOptions.getReasonNotTaken()+" Option",DriverManager.getDriver());
			break;
		case DECLINE:
			new PaymentsPage(DriverManager.getDriver()).clickCloseOptions(DriverManager.getDriver())
			.clickDecline(DriverManager.getDriver());
			new SubmissionDeclinedPage(DriverManager.getDriver()).selectReasonCode(DriverManager.getDriver(),closeOptions.getReasonDeclined())
			.clickDecline((DriverManager.getDriver()));
			Log.messageStep("Policy will be Declined with "+closeOptions.getReasonDeclined()+" Options",DriverManager.getDriver());
			break;
		}
	}
	/**
	 * click "Actions" button
	 * click "CopySubmission" button
	 */
	@Override
	public void copySubmission() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickCopySubmission(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission and Copy Submission will be Processed",DriverManager.getDriver());
	}
	
	/**
	 * Click "Next" button to navigate to next page
	 * @param add Wc Options
	 * @return Wc Options
	 */
	@Override
	public void addSupplemental() {
		SupplementalPage supplementalPage = new SupplementalPage(DriverManager.getDriver());
		supplementalPage.clickNext(DriverManager.getDriver());
		new WCOptionsPage(DriverManager.getDriver()).get();
		Log.messageStep("Supplemental page processed",DriverManager.getDriver());
	}

	/**
	 * Click "Next" button to navigate to next page
	 * @param add Wc Options
	 * @return Wc Options
	 */
	@Override
	public void addWcoptions(AddWcoptions addwcoptions) {
		if(addwcoptions.isNext()) {
			new WCOptionsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		}
		else {
			WCOptionsPage wcOptionsPage = new WCOptionsPage(DriverManager.getDriver());
			wcOptionsPage.clickAddOption(DriverManager.getDriver()).clickManuscript(DriverManager.getDriver())
			.enterManuscriptDescription(DriverManager.getDriver(),addwcoptions.getDescription())
			.clickNext(DriverManager.getDriver());
		}
		new RiskAnalysisPage(DriverManager.getDriver()).get();
		Log.messageStep("WC Options processed",DriverManager.getDriver());
	}

	/**
	 * To verify out of sequence message in every page
	 * @param policyChange
	 */
	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
		new HeaderPage(DriverManager.getDriver()).verifyOutOfSequenceMessage(DriverManager.getDriver(), policyChange.getDate());
	}

	/**
	 * click "Next" button to navigate to form page
	 * @return FormsPage
	 */
	@Override
	public void viewQuote() {
		new QuotePage(DriverManager.getDriver()).get();
		new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("quote page details verified",DriverManager.getDriver());
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