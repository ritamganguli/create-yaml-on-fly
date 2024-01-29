package com.aspire.guidewire.pc.teststeps.businessowners;

import com.aspire.guidewire.pc.pages.businessowners.BatchProcessInfoPage;
import com.aspire.guidewire.pc.pages.businessowners.BuildingsPage;
import com.aspire.guidewire.pc.pages.businessowners.BusinessownersLinePage;
import com.aspire.guidewire.pc.pages.businessowners.LocationsPage;
import com.aspire.guidewire.pc.pages.businessowners.WorkQueueInfoPage;
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
import com.aspire.guidewire.pc.pages.common.RiskAnalysisPage.PriorLossesPage;
import com.aspire.guidewire.pc.pages.common.StartPolicyChangePage;
import com.aspire.guidewire.pc.pages.common.StartReinstatementPage;
import com.aspire.guidewire.pc.pages.common.SubmissionDeclinedPage;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddBuildingDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UpdateBusinessOwnersLine;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;

public class BusinessOwnersStepsImpl implements BusinessOwnersSteps {

	private static String PCwebSite = DriverManager.getPCwebsite();

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
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), PCwebSite).get();
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
		Log.messageStep("Product :" + productName.getName()+ " selected" , DriverManager.getDriver());
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
			OfferingsPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Offerings page processed" ,DriverManager.getDriver());
		}
		else {
			OfferingsPage.selectOfferingSelection(DriverManager.getDriver(), offerings.getOfferings());	
			OfferingsPage.clickNext(DriverManager.getDriver()); 
			Log.messageStep("Offerings :" +offerings.getOfferings()+" selected "  ,DriverManager.getDriver());
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

		String inputParams = new GsonBuilder().create().toJsonTree(policyInfo).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(PolicyInfo.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			policyInfoPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Information processed", DriverManager.getDriver());
		}
		else {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			policyInfoPage.selectOrganizationType(DriverManager.getDriver(), policyInfo.getOrganizationType());
			if(policyInfo.isAddAdditionalInsured()) { 
				policyInfoPage.clickAddAdditionalInsured(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
				Log.messageStep("Additional Insured is added successfully",DriverManager.getDriver());
			}
			policyInfoPage.clickNext(DriverManager.getDriver());
			new BusinessownersLinePage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Information entered for date : " +policyInfo.getPolicyEffectiveDate() + " and policy term : " +policyInfo.getPolicyTerm(), DriverManager.getDriver());
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
			PolicyReviewPage policyReviewPage = new PolicyReviewPage(DriverManager.getDriver());
			if(policyReviewPage.getQuoteButtonSize(DriverManager.getDriver()) == 1) {
				policyReviewPage.clickQuote(DriverManager.getDriver());
				if (policyReviewPage.getNextButtonSize(DriverManager.getDriver()) == 1) {
					Log.messageStep("Policy Review is Processed",DriverManager.getDriver());
				}
			}
			else {
				policyReviewPage.clickNext(DriverManager.getDriver());
			}
			break;

		case REOPEN:
			new RiskAnalysisPage(DriverManager.getDriver())
			.clickRiskAnalysis(DriverManager.getDriver())
			.clickReopen(DriverManager.getDriver())
			.verifyApproveButtonIsDisplay(DriverManager.getDriver())
			.verifyRejectButtonIsDisplay(DriverManager.getDriver());
			Log.messageStep("User Re-Opened the closed UW issue Successfully ",DriverManager.getDriver());
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
			new PolicyReviewPage(DriverManager.getDriver()).clickChangeConflictTab(DriverManager.getDriver()).
			clickShouldOverrideNoRadioButton(DriverManager.getDriver()).clickSubmit(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
		default:
			break;
		}
	}

	/**
	 * Handles Uw issues, contigency, Resolve waive
	 * click "Next" button to navigate to next page
	 * else Process "UW_ISSUE" or
	 * Process  "UW_ISSUE_APPROVE_REQUEST" or
	 * Process "CONTINGENCY" or
	 * Process "PRIORLOSSES_ATTACH_DOCUMENT" or
	 * Process "PRIORLOSSES_MANUAL_ENTER" or
	 * Process "RESOLVE_CONTINGENCY" or
	 * Process "WAIVE_CONTINGENCY" or
	 * Process "ATTACH_DOCUMENT_CONTINGENCY" 
	 * @return RiskAnalysisPage
	 */
	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis)  {
		new ActionsPage(DriverManager.getDriver()).clickRiskAnalysisScreen(DriverManager.getDriver());
		RiskAnalysisPage riskAnalysisPage=new RiskAnalysisPage(DriverManager.getDriver()).get();
		switch (riskAnalysis.getRiskAnalysisType())
		{
		case NONE:
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis details processed",DriverManager.getDriver());
			break;
		case UW_ISSUE:
			riskAnalysisPage.clickAddUWIssue(DriverManager.getDriver());
			riskAnalysisPage.new CreateNewUWIssuePage(DriverManager.getDriver())
			.selectIssueType(DriverManager.getDriver(), riskAnalysis.getUWIssueType())
			.enterLongDescription(DriverManager.getDriver(), riskAnalysis.getLongDescription())
			.clickOK(DriverManager.getDriver());
			Log.messageStep("UW Issue Created with Issue Type as : " + riskAnalysis.getUWIssueType() ,DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			break;

		case UW_ISSUE_APPROVE_REQUEST:
			riskAnalysisPage.clickAddUWIssue(DriverManager.getDriver());
			riskAnalysisPage.new CreateNewUWIssuePage(DriverManager.getDriver())
			.selectIssueType(DriverManager.getDriver(), riskAnalysis.getUWIssueType())
			.enterLongDescription(DriverManager.getDriver(), riskAnalysis.getLongDescription())
			.clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickApprove(DriverManager.getDriver());
			riskAnalysisPage.new RiskApprovalDetailsPage(DriverManager.getDriver())
			.clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickRequestApproval(DriverManager.getDriver());
			riskAnalysisPage.new UWActivityPage(DriverManager.getDriver())
			.clickSendRequest(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("UW Issue Created with Issue Type as  : " + riskAnalysis.getUWIssueType() + " and Approved the Issue" ,DriverManager.getDriver());
			break;
		case CONTINGENCY:
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickAddNewContigency(DriverManager.getDriver())
			.enterContingencyTitle(DriverManager.getDriver(),riskAnalysis.getContingencyTitle())
			.enterContingencyDescription(DriverManager.getDriver(),riskAnalysis.getContingencyDescription())
			.selectContingencyAction(DriverManager.getDriver(),riskAnalysis.getContingencyAction())
			.enterDateDueField(DriverManager.getDriver(),riskAnalysis.getContingencyDueDate())
			.clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Contingency created with Contigency Action as "+ riskAnalysis.getContingencyAction() ,DriverManager.getDriver());
			break;
		case PRIORLOSSES_ATTACH_DOCUMENT:
			riskAnalysisPage.new PriorLossesPage(DriverManager.getDriver())
			.clickPriorLosses(DriverManager.getDriver()).selectLossHistoryType(DriverManager.getDriver(), riskAnalysis.getLossHistoryType());
			new RiskAnalysisPage(DriverManager.getDriver()).new NewContingencyPage(DriverManager.getDriver())
			.enterLossesInPastFiveYears(DriverManager.getDriver(), riskAnalysis.getLossPercent())
			.enterPriorLossTotalIncurred(DriverManager.getDriver(), riskAnalysis.getLossTotalIncurred())
			.clickAttachDocumentButton(DriverManager.getDriver())
			.documentAttachBeforeCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName())
			.selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getUploadDocumentStatus())
			.clickUploadDocumentButton(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Prior Losses attach document is attched with Document Name as" + riskAnalysis.getDocumentName(),DriverManager.getDriver());
			break;
		case PRIORLOSSES_MANUAL_ENTER:
			PriorLossesPage priorLossesPage = riskAnalysisPage.new PriorLossesPage(DriverManager.getDriver())
			.clickPriorLosses(DriverManager.getDriver())
			.selectLossHistoryType(DriverManager.getDriver(), riskAnalysis.getLossHistoryType());
			if(riskAnalysis.getLossCount()>1) priorLossesPage.clickAddLossHistory(DriverManager.getDriver());
			priorLossesPage.enterOccurenceDateField(DriverManager.getDriver(), riskAnalysis.getOccurenceDateField(), riskAnalysis.getLossCount())
			.enterPriorLossDescription(DriverManager.getDriver(), riskAnalysis.getPriorLossDescription(), riskAnalysis.getLossCount())
			.enterTotalIncurred(DriverManager.getDriver(), riskAnalysis.getTotalIncurred(), riskAnalysis.getLossCount())
			.enterAmountPaid(DriverManager.getDriver(), riskAnalysis.getAmountPaid(), riskAnalysis.getLossCount())
			.enterOpenReserve(DriverManager.getDriver(), riskAnalysis.getOpenReserve(), riskAnalysis.getLossCount())
			.selectLossHistoryStatus(DriverManager.getDriver(), riskAnalysis.getLossHistoryStatus(), riskAnalysis.getLossCount());	
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Prior Losses Manual Enter created with Loss History as "+riskAnalysis.getLossHistoryType(),DriverManager.getDriver());
			break;
		case RESOLVE_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver());
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver()).clickContingencyResolveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Contingency resolved successfully" ,DriverManager.getDriver());
			break;

		case WAIVE_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver());
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver()).clickContingencyWaiveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Waive processed successfully" ,DriverManager.getDriver());
			break;

		case ATTACH_DOCUMENT_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver())
			.clickContingencyTitle(DriverManager.getDriver())
			.new NewContingencyPage(DriverManager.getDriver())
			.clickNewDocumentButton(DriverManager.getDriver())
			.clickUploadDocumentLink(DriverManager.getDriver())
			.documentAttachAfterCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName())
			.selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentStatus())
			.selectUploadDocumentType(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentType())
			.clickUploadDocumentButton(DriverManager.getDriver()).clickContingencyWaiveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Contingency attach Document is attached with Document Name as " + riskAnalysis.getDocumentName() ,DriverManager.getDriver());
			break;
		default:
			break;
		}

	}

	/**
	 * click "Next" button to navigate to next page
	 * @return QuotePage
	 */
	@Override
	public void viewForms() {
		new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new FormsPage(DriverManager.getDriver()).get();	
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
		new FormsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
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
		switch (transaction) {

		case BIND_ONLY:
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver())
			.clickBindOnly(DriverManager.getDriver());//need to add click ok
			break;
		case SUBMISSION:
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver());
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
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
		new OfferingsPage(DriverManager.getDriver()).get();
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
		.enterText(DriverManager.getDriver(), preRenewalDirection.getText())
		.selectDirection(DriverManager.getDriver(), preRenewalDirection.getDirection())
		.selectSecurityLevel(DriverManager.getDriver(), preRenewalDirection.getSecurity())
		.selectNonRenewReason(DriverManager.getDriver(), preRenewalDirection.getReason())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Clicked on Pre Renewal Direction link for Direction : " +preRenewalDirection.getDirection(),DriverManager.getDriver());
	}

	/**
	 * Click Renew button from Actions menu
	 * Click on "Actions" menu options
	 * click Renew button
	 */
	@Override
	public void policyRenew() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickRenewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed Policy creation Started",DriverManager.getDriver());
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
	 * click "Actions" button
	 * click "CopySubmission" button
	 */
	@Override
	public void copySubmission() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickCopySubmission(DriverManager.getDriver());
		Log.messageStep("Copy Submission Process creation is Started",DriverManager.getDriver());
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
			if(createNewAccountFromPerson.getZipCode()!=null) createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
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
	 * Select the "Small Business Type" drop donw Field
	 * click "Next" button to navigate to next page 
	 * @param updateBusinessOwnersLineIC
	 * @return LocationsPage
	 */
	@Override
	public void updateBusinessOwnersLine(UpdateBusinessOwnersLine updateBusinessOwnersLine) {
		String inputParams = new GsonBuilder().create().toJsonTree(updateBusinessOwnersLine).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(UpdateBusinessOwnersLine.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new BusinessownersLinePage(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			new LocationsPage(DriverManager.getDriver()).get();
			Log.messageStep("Business Owners Line Details processed",DriverManager.getDriver());
		}
		else {
			BusinessownersLinePage businessownersLinePage=new BusinessownersLinePage(DriverManager.getDriver())
					.selectSmallBusinessType(DriverManager.getDriver(),updateBusinessOwnersLine.getBusinessType());
			if(updateBusinessOwnersLine.isAddAdditionalCoverage()) { 
				businessownersLinePage.clickAdditionalCoverages(DriverManager.getDriver())
				.clickAddCoverage(DriverManager.getDriver());
				businessownersLinePage.new SearchCoveragesPage(DriverManager.getDriver())
				.clickSearch(DriverManager.getDriver())
				.clickCoveragechkbox(DriverManager.getDriver())
				.clickAddSelectedCoverages(DriverManager.getDriver());
				new BusinessownersLinePage(DriverManager.getDriver()).get();
				Log.messageStep("Business Owners Line Details with Additional Coverage processed",DriverManager.getDriver());
			}
			if(updateBusinessOwnersLine.isAddExclusionAndCondition()) { 
				businessownersLinePage.clickExclusionsConditions(DriverManager.getDriver()).clickAddExclusionsAndCondition(DriverManager.getDriver());
				businessownersLinePage.new SearchExclusionsAndConditionsPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver())
				.clickExclusionConditionChkbox(DriverManager.getDriver()).clickAddSelectedExclusionCondition(DriverManager.getDriver());
				new BusinessownersLinePage(DriverManager.getDriver()).get();
				Log.messageStep("Business Owners Line Details added with Exclusion And Condition processed",DriverManager.getDriver());
			}
			businessownersLinePage.clickNext(DriverManager.getDriver());
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

		String inputParams = new GsonBuilder().create().toJsonTree(addLocationDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddLocationDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			LocationsPage locationpage = new LocationsPage(DriverManager.getDriver());
			locationpage.clickNext(DriverManager.getDriver());
			new BuildingsPage(DriverManager.getDriver()).get();
			Log.messageStep("Location Details processed",DriverManager.getDriver());
		}
		else {
			LocationsPage locationpage = new LocationsPage(DriverManager.getDriver());
			locationpage.clickNewLocation(DriverManager.getDriver());
			locationpage.new LocationInformationPage(DriverManager.getDriver())
			.enterAddress1(DriverManager.getDriver(),addLocationDetails.getAddressLine1())
			.enterCity(DriverManager.getDriver(), addLocationDetails.getCity())
			.selectState(DriverManager.getDriver(), addLocationDetails.getState())
			.enterZIPCode(DriverManager.getDriver(), addLocationDetails.getZipCode())
			.clickAutofillTerritoryCodes(DriverManager.getDriver()).clickOK(DriverManager.getDriver());
			locationpage.clickNext(DriverManager.getDriver());
			new BuildingsPage(DriverManager.getDriver()).get();
			Log.messageStep("Location Details : " + addLocationDetails.getState() + " entered",DriverManager.getDriver());
		}
	}

	/**
	 * Used to add Building Details
	 * Enter "Basic Amount", "Property Amount" and "limit"
	 * Click "Next" button to navigate to next page
	 * @param addBuildingDetails
	 */
	@Override
	public void addBuildingDetails(AddBuildingDetails addBuildingDetails) {

		String inputParams = new GsonBuilder().create().toJsonTree(addBuildingDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddBuildingDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			new BuildingsPage(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			Log.messageStep("Building Details processed",DriverManager.getDriver());
		}
		else {
			BuildingsPage buildingPage = new BuildingsPage(DriverManager.getDriver())
					.clickAdd(DriverManager.getDriver())
					.clickBuildingClassCodeSearch(DriverManager.getDriver());
			buildingPage.new ClassCodeSearchPage(DriverManager.getDriver())
			.clickSelect(DriverManager.getDriver());
			buildingPage.enterPremiumBasisAmount(DriverManager.getDriver(), addBuildingDetails.getBasicAmount())
			.enterBuildingLimit(DriverManager.getDriver(), addBuildingDetails.getBuildingLimit())
			.enterBusinessPersonalPropertyLimit(DriverManager.getDriver(), addBuildingDetails.getBusinessPropertyLimit())
			.clickUpdateBuilding(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			Log.messageStep("Building Details with basic amount of : " + addBuildingDetails.getBasicAmount()+ " entered",DriverManager.getDriver());
		}

	}


	/**
	 * Used to Add Modifier Details
	 * Click "Next" button to navigate to next page
	 */
	@Override
	public void addModifiersDetails() {
		new ModifiersPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new RiskAnalysisPage(DriverManager.getDriver()).get();
		Log.messageStep("Modifier details processed",DriverManager.getDriver());
	}

	/**
	 * Proceed to Risk Analysis Page
	 * Click on CompletedPolicyTransaction to Proceed
	 * click on Risk analysis page
	 * @return RiskAnalysisPage 
	 */
	@Override
	public void CompletedPolicyTransactions() {
		new PolicySummaryPage(DriverManager.getDriver()).clickCompletedTransactionId(DriverManager.getDriver());
		new ActionsPage(DriverManager.getDriver()).clickRiskAnalysisScreen(DriverManager.getDriver());
		Log.messageStep("Risk Analysis Page processed",DriverManager.getDriver());
	}

	/**
	 * Click Details Button
	 * Click Approve button 
	 * Click OK button
	 * Click Next  button
	 */
	@Override
	public void approveUWissue(UWIssueType uwIssueType) {

		if(uwIssueType.getIssueType()!=null) {
			
			switch(uwIssueType.getIssueType().toUpperCase()) {
			case "TO BE REVIEWED BY UNDERWRITER 1, BLOCKING ISSUANCE" :
			case "TO BE REVIEWED BY UNDERWRITER 1, BLOCKING BIND" :
			case "TO BE REVIEWED BY UNDERWRITER 1, BLOCKING QUOTE RELEASE" :
			case "TO BE REVIEWED BY UNDERWRITING MANAGER, BLOCKING QUOTE RELEASE" :
				QuotePage quotePage = new QuotePage(DriverManager.getDriver());
				quotePage.verifyBlockMsgDisplay(DriverManager.getDriver());
				Log.messageStep("Created UW Issue will Block the Submission",DriverManager.getDriver());
				quotePage.clickDetails(DriverManager.getDriver());
				RiskAnalysisPage riskAnalysisPage = new RiskAnalysisPage(DriverManager.getDriver());
				riskAnalysisPage.clickApprove(DriverManager.getDriver());
				riskAnalysisPage.new CreateNewUWIssuePage(DriverManager.getDriver())
				.clickOK(DriverManager.getDriver());
				Log.messageStep("UW Issue is Approved Successfully",DriverManager.getDriver());
				riskAnalysisPage.clickNext(DriverManager.getDriver());
				break;	
			}
		}else {
			new RiskAnalysisPage(DriverManager.getDriver()).clickDetails(DriverManager.getDriver())
			.clickApprove(DriverManager.getDriver())
			.clickOK(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			Log.messageStep("Approved UW Issue",DriverManager.getDriver());

		}
	}

	/**
	 * Used to run Batch Process Info  "Handle Unresolved Contingency" Batch
	 * Click on "Gotobatch Process" button
	 * Click on "RunHandleUnResolvedCotingency" button
	 */
	@Override
	public void runBatchProcessInfo() {
		new PolicySummaryPage(DriverManager.getDriver()).get()
		.clickGotoBatchProcess(DriverManager.getDriver());
		new BatchProcessInfoPage(DriverManager.getDriver()).get()
		.clickRunHandleUnresolvedContingency(DriverManager.getDriver());
		Log.message("Batch Process : Handle Unresolved Contingency batch ran successfully",DriverManager.getDriver());
	}

	/**
	 * Used to run Work Queue Info "WorkFlow Batch Process" Batch
	 * Click on "WorkQueueInfo" button
	 * Click on "clickRunWriter_644" button
	 */
	@Override
	public void runWorkQueueInfo() {
		new BatchProcessInfoPage(DriverManager.getDriver()).get()
		.clickWorkQueueInfo(DriverManager.getDriver());
		new WorkQueueInfoPage(DriverManager.getDriver()).get()
		.clickRunWriter_644(DriverManager.getDriver());
		Log.message("Batch process: Work flow batch ran successfully",DriverManager.getDriver());
	}

	/**
	 * Enters "policy number"
	 * clicks on "search"
	 * Enters "LossDate"
	 * clicks on next
	 * @param policyDetails
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
	 * Used to copy the policy Submission
	 * Click on "Action" and click on "Copy Submission"
	 */
	@Override
	public void copySubmissions() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver()).clickCopySubmission(DriverManager.getDriver());
		new OfferingsPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());

	}

	/**
	 * Used to get the "Policy Number"
	 * Click on "View Policy"
	 * Get the "Policy No" using Text
	 * @return policyNo
	 */
	@Override
	public String getPolicyNumber() {
		new PolicyBoundPage(DriverManager.getDriver()).get()
		.clickViewPolicy(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Clicked on View policy Link",DriverManager.getDriver());
		String policyNumber=new PolicySummaryPage(DriverManager.getDriver()).getPolicyNo(DriverManager.getDriver());
		return policyNumber;

	}

}
