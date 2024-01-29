package com.aspire.guidewire.pc.teststeps.commercialpackage;


import com.aspire.guidewire.pc.pages.commercialpackage.AccountsReceivablePage;
import com.aspire.guidewire.pc.pages.commercialpackage.BatchProcessInfoPage;
import com.aspire.guidewire.pc.pages.commercialpackage.BlanketsPage;
import com.aspire.guidewire.pc.pages.commercialpackage.BuildingsAndLocationsPage;
import com.aspire.guidewire.pc.pages.commercialpackage.ContractorsEquipmentPage;
import com.aspire.guidewire.pc.pages.commercialpackage.CoveragePage;
import com.aspire.guidewire.pc.pages.commercialpackage.CoveragePartSelectionPage;
import com.aspire.guidewire.pc.pages.commercialpackage.ExposuresPage;
import com.aspire.guidewire.pc.pages.commercialpackage.LineReviewPage;
import com.aspire.guidewire.pc.pages.commercialpackage.LineSelectionPage;
import com.aspire.guidewire.pc.pages.commercialpackage.LocationsPage;
import com.aspire.guidewire.pc.pages.commercialpackage.SignsPage;
import com.aspire.guidewire.pc.pages.commercialpackage.WorkQueueInfoPage;
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
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBlanketDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragesDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddExposuresDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineSelectionDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ViewQuote;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;

public  class CommercialPackageStepsImpl implements CommercialPackageSteps {

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
			if(createNewAccountFromPerson.getCity()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if(createNewAccountFromPerson.getState()!=null) createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
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
	 * Used to select Offering Selection field option
	 * click "next" button to navigate to next page
	 * @return QualificationsPage
	 */
	@Override
	public void selectQualifications() {
		new QualificationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new PolicyInfoPage(DriverManager.getDriver()).get();
		Log.messageStep("Qualifications details Processed",DriverManager.getDriver());
	}

	/**
	 * Used to update the Policy Info Pages
	 * click "next" button to navigate to next page
	 * Select the Organization Type
	 * Click additional Insured
	 * Add the Insured Details
	 * @return QualificationsPage
	 */
	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {
		PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(policyInfo).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(PolicyInfo.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			policyInfoPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Information Processed",DriverManager.getDriver());
		}
		else {
			policyInfoPage.selectOrganizationType(DriverManager.getDriver(), policyInfo.getOrganizationType());
			if(policyInfo.isAddAdditionalInsured()) { 
				policyInfoPage.clickAddAdditionalInsured(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
				Log.messageStep("Policy Information entered for organization type : " + policyInfo.getOrganizationType(), DriverManager.getDriver());
			}
			policyInfoPage.clickNext(DriverManager.getDriver());
		}
	}


	/**
	 * click Quote button
	 * click Next button
	 * Click Edit policy Transaction for Renew policy
	 * click ChangeConflictTab for OUT_OF_SEQUENCE
	 * click ShouldOverrideNoRadioButton for OUT_OF_SEQUENCE
	 * click Submit for OUT_OF_SEQUENCE
	 */
	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		switch (policyreview.getPolicyReviewType())
		{
		case NONE:
			new PolicyReviewPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;

		case REWRITE_NEWTERM:
			new PolicyReviewPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
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
		default:
			break;
		}
	}

	/**
	 * Handles Uw Issues
	 * click "Next" button to navigate to next page
	 * else Process "UW_ISSUE" or
	 * Process  "UW_ISSUE_APPROVE_REQUEST" or
	 * Process "RESOLVE_CONTINGENCY" or
	 * Process "REOPEN" or
	 * Process "PRIORLOSSES_MANUAL_ENTER" or
	 * Process "PRIORLOSSES_ATTACH_DOCUMENT" or
	 * Process "WAIVE_CONTINGENCY" or
	 * Process "ATTACH_DOCUMENT_CONTINGENCY" or
	 * Process "PRIOR_POLICIES"
	 * @return RiskAnalysisPage
	 */
	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {
		RiskAnalysisPage riskAnalysisPage=new RiskAnalysisPage(DriverManager.getDriver());
		switch (riskAnalysis.getRiskAnalysisType())
		{
		case NONE:
			if(riskAnalysis.getLineType()!=null && (riskAnalysis.getLineType().getName().equals("Commercial Property Line"))) {
				riskAnalysisPage.clickRate(DriverManager.getDriver());
				break;
			}
			riskAnalysisPage.clickQuote(DriverManager.getDriver());
			if(riskAnalysisPage.getNextButtonSize(DriverManager.getDriver()) == 1) {
				Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			}
			break;
		case UW_ISSUE:
			riskAnalysisPage.clickAddUWIssue(DriverManager.getDriver());
			riskAnalysisPage.new CreateNewUWIssuePage(DriverManager.getDriver())
			.selectIssueType(DriverManager.getDriver(), riskAnalysis.getUWIssueType())
			.enterLongDescription(DriverManager.getDriver(), riskAnalysis.getLongDescription())
			.clickOK(DriverManager.getDriver());
			Log.messageStep("UW Issue is Created with Issue Type as : " + riskAnalysis.getUWIssueType(),DriverManager.getDriver());
			break;

		case REOPEN:
			new RiskAnalysisPage(DriverManager.getDriver())
			.clickRiskAnalysis(DriverManager.getDriver())
			.clickReopen(DriverManager.getDriver())
			.verifyApproveButtonIsDisplay(DriverManager.getDriver())
			.verifyRejectButtonIsDisplay(DriverManager.getDriver());
			Log.messageStep("User Re-Opened the closed UW issue Successfully ",DriverManager.getDriver());
			break;
		case UW_ISSUE_APPROVE_REQUEST:
			riskAnalysisPage.clickAddUWIssue(DriverManager.getDriver());
			riskAnalysisPage.new CreateNewUWIssuePage(DriverManager.getDriver())
			.selectIssueType(DriverManager.getDriver(), riskAnalysis.getUWIssueType())
			.enterLongDescription(DriverManager.getDriver(), riskAnalysis.getLongDescription())
			.clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickApprove(DriverManager.getDriver());
			riskAnalysisPage.new RiskApprovalDetailsPage(DriverManager.getDriver()).clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickRequestApproval(DriverManager.getDriver());
			riskAnalysisPage.new UWActivityPage(DriverManager.getDriver()).clickSendRequest(DriverManager.getDriver());
			Log.messageStep("UW Issue is Created with Issue Type as " + riskAnalysis.getUWIssueType() + " and Approved the Issue" ,DriverManager.getDriver());
			break;
		case CONTINGENCY:
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickAddNewContigency(DriverManager.getDriver()).enterContingencyTitle(DriverManager.getDriver(),riskAnalysis.getContingencyTitle())
			.enterContingencyDescription(DriverManager.getDriver(),riskAnalysis.getContingencyDescription())
			.selectContingencyAction(DriverManager.getDriver(),riskAnalysis.getContingencyAction())
			.enterDateDueField(DriverManager.getDriver(),riskAnalysis.getContingencyDueDate())
			.clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickQuote(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Contingency created with Contigency Action as "+ riskAnalysis.getContingencyAction() ,DriverManager.getDriver());
			break;
		case PRIORLOSSES_ATTACH_DOCUMENT:
			riskAnalysisPage.new PriorLossesPage(DriverManager.getDriver())
			.clickPriorLosses(DriverManager.getDriver()).selectLossHistoryType(DriverManager.getDriver(), riskAnalysis.getLossHistoryType());
			new RiskAnalysisPage(DriverManager.getDriver()).new NewContingencyPage(DriverManager.getDriver())
			.enterLossesInPastFiveYears(DriverManager.getDriver(), riskAnalysis.getLossPercent()).enterPriorLossTotalIncurred(DriverManager.getDriver(), riskAnalysis.getLossTotalIncurred())
			.clickAttachDocumentButton(DriverManager.getDriver())
			.documentAttachBeforeCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName())
			.selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getUploadDocumentStatus())
			.clickUploadDocumentButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Prior Losses attach document is attched with Document Name as" + riskAnalysis.getDocumentName(),DriverManager.getDriver());
			break;
		case PRIORLOSSES_MANUAL_ENTER:
			PriorLossesPage priorLossesPage = riskAnalysisPage.new PriorLossesPage(DriverManager.getDriver())
			.clickPriorLosses(DriverManager.getDriver()).selectLossHistoryType(DriverManager.getDriver(), riskAnalysis.getLossHistoryType());
			if(riskAnalysis.getLossCount()>1) priorLossesPage.clickAddLossHistory(DriverManager.getDriver());
			priorLossesPage.enterOccurenceDateField(DriverManager.getDriver(), riskAnalysis.getOccurenceDateField(), riskAnalysis.getLossCount())
			.enterPriorLossDescription(DriverManager.getDriver(), riskAnalysis.getPriorLossDescription(), riskAnalysis.getLossCount())
			.enterTotalIncurred(DriverManager.getDriver(), riskAnalysis.getTotalIncurred(), riskAnalysis.getLossCount())
			.enterAmountPaid(DriverManager.getDriver(), riskAnalysis.getAmountPaid(), riskAnalysis.getLossCount())
			.enterOpenReserve(DriverManager.getDriver(), riskAnalysis.getOpenReserve(), riskAnalysis.getLossCount())
			.selectLossHistoryStatus(DriverManager.getDriver(), riskAnalysis.getLossHistoryStatus(), riskAnalysis.getLossCount());
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
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver())
			.new NewContingencyPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver()).clickUploadDocumentLink(DriverManager.getDriver())
			.documentAttachAfterCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName())
			.selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentStatus())
			.selectUploadDocumentType(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentType())
			.clickUploadDocumentButton(DriverManager.getDriver())
			.clickContingencyResolveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Contingency attach Document is attached with Document Name as " + riskAnalysis.getDocumentName() ,DriverManager.getDriver());
			break;

		case PRIOR_POLICIES:
			riskAnalysisPage.clickPriorPolicies(DriverManager.getDriver())
			.clickAddInPriorityPolicies(DriverManager.getDriver())
			.enterCarrier(DriverManager.getDriver(), riskAnalysis.getCarrier())
			.enterPolicyNumber(DriverManager.getDriver(), riskAnalysis.getPolicyNo())
			.enterEffectiveDate(DriverManager.getDriver(), riskAnalysis.getEffectiveDate())
			.enterExpirationDate(DriverManager.getDriver(), riskAnalysis.getExpirationDate())
			.enterAnnualPremium(DriverManager.getDriver(), riskAnalysis.getAnnualPremium())
			.enterLosses(DriverManager.getDriver(), riskAnalysis.getLosses())
			.enterTotalLosses(DriverManager.getDriver(), riskAnalysis.getTotalLosses());
			Log.messageStep("Risk analysis: Prior Policies created with Losses as " + riskAnalysis.getTotalLosses(),DriverManager.getDriver());
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
		FormsPage formsPage = new FormsPage(DriverManager.getDriver()).get();
		formsPage.clickNext(DriverManager.getDriver());
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
			.clickBindOptions(DriverManager.getDriver())
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
		case REOPEN:
			new RiskAnalysisPage(DriverManager.getDriver())
			.clickRiskAnalysis(DriverManager.getDriver())
			.clickReopen(DriverManager.getDriver())
			.verifyApproveButtonIsDisplay(DriverManager.getDriver())
			.verifyRejectButtonIsDisplay(DriverManager.getDriver());
			Log.messageStep("User Re-Opened the closed UW issue Successfully ",DriverManager.getDriver());
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
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickPreRenewalDirection(DriverManager.getDriver());
		new PreRenewalDirectionForPolicyTermPage(DriverManager.getDriver()).clickEdit(DriverManager.getDriver())
		.enterText(DriverManager.getDriver(), preRenewalDirection.getText())
		.selectDirection(DriverManager.getDriver(), preRenewalDirection.getDirection())
		.selectSecurityLevel(DriverManager.getDriver(), preRenewalDirection.getSecurity())
		.selectNonRenewReason(DriverManager.getDriver(), preRenewalDirection.getReason())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Pre Renewal Direction link for Direction : " +preRenewalDirection.getDirection()+" is processed",DriverManager.getDriver());
	}

	/**
	 * Click "Action" Button
	 * Click "Renew Policy" Button
	 * @returns RenewalDataEntryPage
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
	 * click "Actions" button
	 * click "CopySubmission" button
	 */
	@Override
	public void copySubmission() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickCopySubmission(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());
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

			if(createNewAccountFromPerson.isAddAdditionalInsured()) {
				new PolicyInfoPage(DriverManager.getDriver()).clickAdditionalInsuredForPerson(DriverManager.getDriver());
				new CoveragePage(DriverManager.getDriver()).selectTypeInAdditionalInsureds(DriverManager.getDriver(),createNewAccountFromPerson.getInsuredType());
			}

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
	 * Used to Add Modifier Details
	 * Click "Next" button to navigate to next page
	 */
	@Override
	public void addModifiersDetails() {
		new ModifiersPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Modifier details processed",DriverManager.getDriver());
	}

	/**
	 * Proceed to Risk Analysis Page
	 * Click on CompletedPolicyTransaction to Proceed
	 * click on Risk analysis page
	 * @return RiskAnalysisPage 
	 */
	@Override
	public void completedPolicyTransactions() {
		new PolicySummaryPage(DriverManager.getDriver()).clickCompletedTransactionId(DriverManager.getDriver());
		new ActionsPage(DriverManager.getDriver()).clickRiskAnalysisScreen(DriverManager.getDriver());
		Log.messageStep("Risk Analysis Page processed",DriverManager.getDriver());
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
	 * Used to enter the Line selection details
	 * Select Package Risk Type
	 * select or deselect the line Types
	 * click "Next" button to navigate to next page
	 * @param addLineSelectionDetails
	 * return Location Page
	 */
	@Override
	public void addLineSelectionDetails(AddLineSelectionDetails addLineSelectionDetails) {
		LineSelectionPage lineSelectionPage = new LineSelectionPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addLineSelectionDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddLineSelectionDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			lineSelectionPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Line Selection Details processed",DriverManager.getDriver());

		}else {

			if(addLineSelectionDetails.getPackageRiskType()!=null) lineSelectionPage
			.selectPackageRiskType(DriverManager.getDriver(),addLineSelectionDetails.getPackageRiskType());

			if(addLineSelectionDetails.getUnSelectLineType() != null)

				switch(addLineSelectionDetails.getUnSelectLineType()) {
				case INLAND_MARINE_LINE:
					lineSelectionPage.unSelectInlandMarineCheckbox(DriverManager.getDriver());
					Log.messageStep("Inland Marine Line selection is unselected",DriverManager.getDriver());
					break;
				case COMMERCIAL_PROPERTY_LINE:
					lineSelectionPage.unSelectCommercialPropertyCheckbox(DriverManager.getDriver());
					Log.messageStep("Commercial Property Line selection is unselected",DriverManager.getDriver());
					break;
				case GENERAL_LIABILITY_LINE:
					lineSelectionPage.unSelectGeneralLiabilityCheckbox(DriverManager.getDriver());
					Log.messageStep("General Liability Line selection is  unselected",DriverManager.getDriver());
					break;	
				}
		}
		if(addLineSelectionDetails.getSelectLineType()!= null) {
			switch(addLineSelectionDetails.getSelectLineType()) {
			case INLAND_MARINE_LINE:
				lineSelectionPage.clickEnabled_5(DriverManager.getDriver());
				Log.messageStep("Inland Marine Line selection is selected",DriverManager.getDriver());
				break;
			case COMMERCIAL_PROPERTY_LINE:
				lineSelectionPage.clickEnabled_2(DriverManager.getDriver());
				Log.messageStep("Commercial Property Line selection is selected",DriverManager.getDriver());
				break;
			case GENERAL_LIABILITY_LINE:
				lineSelectionPage.clickEnabled(DriverManager.getDriver());
				Log.messageStep("General Liability Line selection is unselected",DriverManager.getDriver());
				break;		
			}
		}
	}

	/**
	 * Used to enter new  Location Details
	 * Enter the Address1, City,Zip code and Territory code
	 * @param addLocationDetails
	 * return Building And Locations Page
	 */
	@Override
	public void addLocationDetails(AddLocationDetails addLocationDetails) {
		LocationsPage locationpage = new LocationsPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addLocationDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddLocationDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			locationpage.clickNext(DriverManager.getDriver());
			Log.messageStep("Location Details processed",DriverManager.getDriver());
		}
		else {
			switch(addLocationDetails.getLocation()) {
			case NEW_LOCATION:
				locationpage.clickNewLocation(DriverManager.getDriver());
				locationpage.new LocationInformationPage(DriverManager.getDriver())
				.enterAddress1(DriverManager.getDriver(),addLocationDetails.getAddressLine1())
				.enterCity(DriverManager.getDriver(), addLocationDetails.getCity())
				.selectState(DriverManager.getDriver(), addLocationDetails.getState())
				.enterZIPCode(DriverManager.getDriver(), addLocationDetails.getZipCode())
				.clickAutofillTerritoryCodes(DriverManager.getDriver())
				.clickOK(DriverManager.getDriver());
				Log.messageStep("New Location Details for state : " + addLocationDetails.getState() + " entered",DriverManager.getDriver());
				break;
			case EXISTING_LOCATION:
				locationpage.clickAddress(DriverManager.getDriver());
				locationpage.new LocationInformationPage(DriverManager.getDriver())
				.clickAutofillTerritoryCodes(DriverManager.getDriver())
				.clickOK(DriverManager.getDriver());
				Log.messageStep("Existing Location Details selected",DriverManager.getDriver());
				break;
			}
		}
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

		BuildingsAndLocationsPage buildingsAndLocationsPage = new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addAddBuildingLocationDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddBuildingLocationDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {	
			buildingsAndLocationsPage.clickNext(DriverManager.getDriver());
			new BlanketsPage(DriverManager.getDriver()).get();
			Log.messageStep("Building Details processed",DriverManager.getDriver());
		}else {
			switch(addAddBuildingLocationDetails.getLineType()) {
			case INLAND_MARINE_LINE:
				buildingsAndLocationsPage=new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
				buildingsAndLocationsPage.clickAddBuildingDropdown(DriverManager.getDriver())
				.mouseOverAddBuilding(DriverManager.getDriver())
				.clickNewBuildings(DriverManager.getDriver());
				buildingsAndLocationsPage.new NewBuildingPage(DriverManager.getDriver())
				.enterDescription(DriverManager.getDriver(),addAddBuildingLocationDetails.getBuildingDescription())
				.clickOK(DriverManager.getDriver())
				.clickNext(DriverManager.getDriver());
				new AccountsReceivablePage(DriverManager.getDriver()).get();
				Log.messageStep("Building Details for Inland Marine : " + addAddBuildingLocationDetails.getBuildingDescription()+ " entered",DriverManager.getDriver());

				break;
			case COMMERCIAL_PROPERTY_LINE:
				buildingsAndLocationsPage=new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
				buildingsAndLocationsPage.clickAddBuildingDropdown(DriverManager.getDriver())
				.mouseOverAddBuilding(DriverManager.getDriver())
				.clickNewBuildings(DriverManager.getDriver());
				buildingsAndLocationsPage.new NewBuildingPage(DriverManager.getDriver())
				.enterDescription(DriverManager.getDriver(),addAddBuildingLocationDetails.getBuildingDescription())
				.clickCodeSeachIcon(DriverManager.getDriver());
				buildingsAndLocationsPage.new ClassCodeSearchPage(DriverManager.getDriver())
				.clickSearch(DriverManager.getDriver())
				.selectCode(DriverManager.getDriver());
				buildingsAndLocationsPage.new NewBuildingPage(DriverManager.getDriver())
				.selectCoverageForm(DriverManager.getDriver(),addAddBuildingLocationDetails.getCoverageForm())
				.clickCoverages(DriverManager.getDriver())
				.enterIncomeLimitNotMfgorRental(DriverManager.getDriver(),addAddBuildingLocationDetails.getLimit())
				.clickAddCoverages(DriverManager.getDriver());
				buildingsAndLocationsPage.new SearchCoveragesPage(DriverManager.getDriver()).get()
				.clickSearch(DriverManager.getDriver())
				.clickCoveragechkbox(DriverManager.getDriver())
				.clickAddSelectedCoverages(DriverManager.getDriver());
				buildingsAndLocationsPage.new NewBuildingPage(DriverManager.getDriver())
				.clickOK(DriverManager.getDriver());
				buildingsAndLocationsPage.clickNext(DriverManager.getDriver());
				new BlanketsPage(DriverManager.getDriver()).get();
				Log.messageStep("Building Details for Commercial Property Line : " + addAddBuildingLocationDetails.getBuildingDescription()+ " entered",DriverManager.getDriver());

				break;
			case GENERAL_LIABILITY_LINE:
				//Yet to implement	

			}
		}

	}

	/**
	 * Used to add Blanket Details 
	 * Click "Add" Button
	 * Select "Blanket Type" and "Group Type"
	 * Click on "Show Coverages"
	 * Select any 2 coverages and click on "Include Selected in Blanket" button
	 * Select "Location" drop down
	 * Click on "OK" Button
	 * Click "Next" button to navigate to next page
	 * @param addBlanketDetails
	 * return Modifier Page
	 */
	@Override
	public void addBlanketDetails(AddBlanketDetails addBlanketDetails) {
		BlanketsPage blanketsPage = new BlanketsPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addBlanketDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddBlanketDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			blanketsPage.clickNext(DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			Log.messageStep("Blanket Details processed",DriverManager.getDriver());

		}else {
			blanketsPage.clickAddBlanket(DriverManager.getDriver());
			blanketsPage.new BlanketDetailsPage(DriverManager.getDriver()).get()
			.selectBlanketType(DriverManager.getDriver(), addBlanketDetails.getBlanketType())
			.selectGroupType(DriverManager.getDriver(), addBlanketDetails.getGroupType())
			.selectDeductible(DriverManager.getDriver(), addBlanketDetails.getDeductible())
			.clickShowCoverages(DriverManager.getDriver())
			.clickBlanketCoverageCheckBox(DriverManager.getDriver())
			.clickIncludeSelectedinBlanket(DriverManager.getDriver())
			.selectLocation(DriverManager.getDriver())
			.clickOK(DriverManager.getDriver());
			blanketsPage.clickNext(DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			Log.messageStep("Blanket Details : " + addBlanketDetails.getBlanketType() + " selected",DriverManager.getDriver());
		}
	}

	/**
	 * Used to Add Line Review Details
	 * Click "Next" button to navigate to next page
	 */
	@Override
	public void addLineReview(AddLineReview addLineReview) {
		LineReviewPage lineReviewPage=new LineReviewPage(DriverManager.getDriver()).get();
		switch(addLineReview.getLineType()) {
		case COMMERCIAL_PROPERTY_LINE:
			lineReviewPage.clickNext(DriverManager.getDriver());
			new CoveragePartSelectionPage(DriverManager.getDriver()).get();
			Log.messageStep("Commercial Property Line Review details processed",DriverManager.getDriver());
			break;
		case INLAND_MARINE_LINE:
			lineReviewPage.clickNext(DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			Log.messageStep("Inland Marine Line Review details processed",DriverManager.getDriver());
			break;
		case GENERAL_LIABILITY_LINE:
			lineReviewPage.clickNext(DriverManager.getDriver());
			new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
			Log.messageStep("General Liability Line Review details processed",DriverManager.getDriver());
			break;
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
		AccountsReceivablePage accountsReceivablePage = new AccountsReceivablePage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addAddAccountReceivableDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddAccountReceivableDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			accountsReceivablePage.clickNext(DriverManager.getDriver());
			new ContractorsEquipmentPage(DriverManager.getDriver()).get();
			Log.messageStep("Account Receivable Details processed",DriverManager.getDriver());

		}else {
			accountsReceivablePage.selectBusinessClass(DriverManager.getDriver(), addAddAccountReceivableDetails.getBusinessClass())
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
		CoveragePartSelectionPage coveragePartSelectionPage=new CoveragePartSelectionPage(DriverManager.getDriver());
		String inputParams = new GsonBuilder().create().toJsonTree(addCoveragePartSelections).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddCoveragePartSelections.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			coveragePartSelectionPage.clickNext(DriverManager.getDriver());
			new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
			Log.messageStep("Coverage Part Selections Details processed",DriverManager.getDriver());

		}else {
			switch(addCoveragePartSelections.getCoveragePart()) {
			case ACCOUNTS_RECEIVABLE:
				coveragePartSelectionPage.clickAddCoveragePart(DriverManager.getDriver())
				.clickAccountsReceivable(DriverManager.getDriver());
				Log.messageStep("Account Receivable Coverage Part Selection Details selected",DriverManager.getDriver());
				break;
			case CONTRACTORS_EQUIPMENTS:
				coveragePartSelectionPage.clickAddCoveragePart(DriverManager.getDriver())
				.clickContractorsEquipment(DriverManager.getDriver());
				Log.messageStep("Contractors equipment Coverage Part Selection Details selected",DriverManager.getDriver());
				break;
			case SIGNS:
				coveragePartSelectionPage.clickAddCoveragePart(DriverManager.getDriver())
				.clickSigns(DriverManager.getDriver());
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

		ContractorsEquipmentPage contractorsEquipmentPage = new ContractorsEquipmentPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addContractorsEquipmentDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddContractorsEquipmentDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			contractorsEquipmentPage.clickNext(DriverManager.getDriver());
			new SignsPage(DriverManager.getDriver()).get();
			Log.messageStep("Contractors Equipment Details processed",DriverManager.getDriver());
		}else {
			new ContractorsEquipmentPage(DriverManager.getDriver())
			.selectContractorType(DriverManager.getDriver(), addContractorsEquipmentDetails.getContractorType())
			.selectCoinsurance(DriverManager.getDriver(), addContractorsEquipmentDetails.getCoinsurancePct())
			.clickContractorsEquipmentMiscItems(DriverManager.getDriver())
			.enterLimit(DriverManager.getDriver(), addContractorsEquipmentDetails.getLimit())
			.selectDeductible(DriverManager.getDriver(), addContractorsEquipmentDetails.getDeductible())
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
		SignsPage signsPage = new SignsPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addSignsDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddSignsDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			signsPage.clickNext(DriverManager.getDriver());
			new LineReviewPage(DriverManager.getDriver()).get();
			Log.messageStep("Sign Details processed",DriverManager.getDriver());
		}
		else {
			new SignsPage(DriverManager.getDriver()).get()
			.selectCoinsurance(DriverManager.getDriver(),addSignsDetails.getCoinsurancePct())
			.clickAdd(DriverManager.getDriver())
			.selectLocation(DriverManager.getDriver())
			.enterDescription(DriverManager.getDriver(), addSignsDetails.getDescription())
			.selectSignType(DriverManager.getDriver(), addSignsDetails.getSignType())
			.enterLimit(DriverManager.getDriver(), addSignsDetails.getLimit())
			.clickNext(DriverManager.getDriver());
			new LineReviewPage(DriverManager.getDriver()).get();
			Log.messageStep("Sign Details type : " + addSignsDetails.getSignType() + " selected",DriverManager.getDriver());
		}
	}

	/**
	 * Used to add Coverages Details
	 * click "Next" button to navigate to next page
	 * return Exposure Page
	 */
	@Override
	public void addCoveragesDetails(AddCoveragesDetails addCoveragesDetails) {
		CoveragePage coveragePage = new CoveragePage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addCoveragesDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddCoveragesDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			coveragePage.clickNext(DriverManager.getDriver());
			new ExposuresPage(DriverManager.getDriver()).get();
			Log.messageStep("Coverage Details processed",DriverManager.getDriver());
		}
		else {
			switch(addCoveragesDetails.getCoveragesType()) {
			case STANDARD_COVERAGES:
				coveragePage.selectPolicyBasis(DriverManager.getDriver(), addCoveragesDetails.getPolicyBasis());
				Log.messageStep("Standard Coverage Details processed",DriverManager.getDriver());
				break;
			case ADDITIONAL_COVERAGES:
				coveragePage.clickAdditionalCoverages(DriverManager.getDriver())
				.clickAdd(DriverManager.getDriver());
				coveragePage.new SearchCoveragesPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver())
				.clickCoveragechkbox(DriverManager.getDriver()).clickAddSelectedCoverages(DriverManager.getDriver());
				coveragePage.enterDesignatedPollutants(DriverManager.getDriver(), addCoveragesDetails.getDesignatedPollutants());
				Log.messageStep("Additional Coverages Details processed",DriverManager.getDriver());
				break;
			case EXCLUSION_AND_CONDITIONS:
				//Yet to implement
				break;
			case ADDITIONAL_INSURED:
				coveragePage.clickAdditionalInsureds(DriverManager.getDriver())
				.clickAddDropDown(DriverManager.getDriver());
				addInsured(addCoveragesDetails.getCreateInsured());
				Log.messageStep("Additional Insured Details processed",DriverManager.getDriver());
				break;
			case MULTIPLE_COVEARGES:
				coveragePage.clickAdditionalCoverages(DriverManager.getDriver())
				.clickAdd(DriverManager.getDriver());
				coveragePage.new SearchCoveragesPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver())
				.clickLiquorLiabilityEndorsementCoverage(DriverManager.getDriver())
				.clickContractualiabilityRailRoadsCoverage(DriverManager.getDriver())
				.clickAddSelectedCoverages(DriverManager.getDriver())
				.clickNext(DriverManager.getDriver());
				Log.messageStep("Multiple Coverages Details processed",DriverManager.getDriver());
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Used to add Exposures Details
	 * click "Next" button to navigate to next page
	 * @param Modifier Page
	 */
	@Override
	public void addExposuresDetails(AddExposuresDetails addExposuresDetails) {
		ExposuresPage exposuresPage = new ExposuresPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addExposuresDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddExposuresDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			exposuresPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Exposures details processed",DriverManager.getDriver());
		}
		else {
			exposuresPage.clickAdd(DriverManager.getDriver())
			.selectLocationName(DriverManager.getDriver())
			.enterClassCode(DriverManager.getDriver(),addExposuresDetails.getCode())
			.enterBasis(DriverManager.getDriver(), addExposuresDetails.getBasis())
			.clickNext(DriverManager.getDriver());
			Log.messageStep("Exposures details with class code : " + addExposuresDetails.getCode() + " entered",DriverManager.getDriver());
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
	 * click "Finish Quote" button to navigate to Quote  page
	 * @return FormsPage
	 */
	@Override
	public void viewQuote(ViewQuote viewQuote) {
		QuotePage quotePage=new QuotePage(DriverManager.getDriver());
		if(viewQuote.getLineType()!=null && (viewQuote.getLineType().getName().equals("Commercial Property Line"))) {
			quotePage.clickFinishQuote(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			Log.messageStep("Quote page processed",DriverManager.getDriver());
		}else {
			new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Quote page processed",DriverManager.getDriver());
		}

	}

	/**
	 * Used to run Batch Process Info  "Handle Unresolved Contingency" Batch
	 * Click on "GotoBatch Process" button
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
	 * Click on "Risk analysis"
	 * Add "Contingency"
	 * Click on "Bind Options"
	 * Click on "Issue Policy"
	 */
	@Override
	public void copySubmissionsandAddContingincy(RiskAnalysis riskAnalysis) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickCopySubmission(DriverManager.getDriver());
		new OfferingsPage(DriverManager.getDriver());
		new ActionsPage(DriverManager.getDriver()).clickRiskAnalysisScreen(DriverManager.getDriver());
		RiskAnalysisPage riskAnalysisPage=new RiskAnalysisPage(DriverManager.getDriver());
		riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
		.clickAddNewContigency(DriverManager.getDriver())
		.enterContingencyTitle(DriverManager.getDriver(),riskAnalysis.getContingencyTitle())
		.enterContingencyDescription(DriverManager.getDriver(),riskAnalysis.getContingencyDescription())
		.selectContingencyAction(DriverManager.getDriver(),riskAnalysis.getContingencyAction())
		.enterDateDueField(DriverManager.getDriver(),riskAnalysis.getContingencyDueDate())
		.clickOK(DriverManager.getDriver());
		riskAnalysisPage.clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());
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