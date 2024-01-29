package com.aspire.guidewire.pc.teststeps.commercialproperty;

import com.aspire.guidewire.pc.pages.commercialproperty.BlanketsPage;
import com.aspire.guidewire.pc.pages.commercialproperty.BuildingsAndLocationsPage;
import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.ActionsPage;
import com.aspire.guidewire.pc.pages.common.BatchProcessInfoPage;
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
import com.aspire.guidewire.pc.pages.common.PaymentsPage;
import com.aspire.guidewire.pc.pages.common.PolicyBoundPage;
import com.aspire.guidewire.pc.pages.common.PolicyInfoPage;
import com.aspire.guidewire.pc.pages.common.PolicyReviewPage;
import com.aspire.guidewire.pc.pages.common.PolicySummaryPage;
import com.aspire.guidewire.pc.pages.common.PreRenewalDirectionForPolicyTermPage;
import com.aspire.guidewire.pc.pages.common.QualificationPage;
import com.aspire.guidewire.pc.pages.common.QuotePage;
import com.aspire.guidewire.pc.pages.common.RatingWorkSheetPage;
import com.aspire.guidewire.pc.pages.common.RenewalDataEntryPage;
import com.aspire.guidewire.pc.pages.common.RiskAnalysisPage;
import com.aspire.guidewire.pc.pages.common.RiskAnalysisPage.PriorLossesPage;
import com.aspire.guidewire.pc.pages.common.StartPolicyChangePage;
import com.aspire.guidewire.pc.pages.common.StartReinstatementPage;
import com.aspire.guidewire.pc.pages.common.WorkQueueInfoPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchPoliciesPage;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Blanket;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.LocationInformation;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.NewBuilding;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.UWIssueType;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;

public class CommercialPropertyStepsImpl implements CommecialPropertySteps {

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
	 * lastName - last name to be entereds
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
		String name = enterAccountInfo.getFirstName() + " " + enterAccountInfo.getLastName();
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
		CreateAccountOptions createAccountOption = createNewAccount.getCreateAccountPreference();
		String accountNumberText = "";
		switch (createAccountOption) {

		case PERSON:

			new EnterAccountInformationPage(DriverManager.getDriver())
			.clickPerson(DriverManager.getDriver());
			CreateAccountPage createAccountPage = new CreateAccountPage(DriverManager.getDriver());
			CreateNewAccountFromPerson createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount;

			EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
			if (createNewAccountFromPerson.getFirstName() != null)enterAccountInformationPage.enterFirstname(DriverManager.getDriver(),createNewAccountFromPerson.getFirstName());
			if (createNewAccountFromPerson.getLastName() != null)enterAccountInformationPage.enterLastname(DriverManager.getDriver(),createNewAccountFromPerson.getLastName());
			if (createNewAccountFromPerson.getAddressLine1() != null)createAccountPage.enterAddress1(DriverManager.getDriver(),createNewAccountFromPerson.getAddressLine1());
			if (createNewAccountFromPerson.getState() != null)createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if (createNewAccountFromPerson.getCity() != null)createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if (createNewAccountFromPerson.getZipCode() != null)createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if (createNewAccountFromPerson.getAddressType() != null)createAccountPage.selectAddressType(DriverManager.getDriver(),createNewAccountFromPerson.getAddressType());
			if (createNewAccountFromPerson.getOrganization() != null)createAccountPage.enterOrganization(DriverManager.getDriver(),createNewAccountFromPerson.getOrganization());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			AccountSummaryPage accountSummaryPage = new AccountSummaryPage(DriverManager.getDriver()).get();
			accountSummaryPage.verifyAccountNo(DriverManager.getDriver());
			accountNumberText = accountSummaryPage.getAccountNumberText(DriverManager.getDriver());
			Log.messageStep("Created account with First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName(), DriverManager.getDriver());

		case COMPANY:
			// yet to implement
			break;

		case FROM_ADDRESS_BOOK:
			// yet to implement
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
		NewSubmissionsPage NewSubmissionsPage = actionsPage
				.clickNewSubmissionAccount(DriverManager.getDriver());
		NewSubmissionsPage.clickSelectBtn(DriverManager.getDriver(), productName.getName());
		Log.messageStep("Product : " + productName.getName()+ " selected" , DriverManager.getDriver());
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
		if (inputParams.equals(defaultParams)) {
			new PolicyInfoPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Information Processed",DriverManager.getDriver());

		} else {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			if (policyInfo.getOrganizationType() != null)
				policyInfoPage.selectOrganizationType(DriverManager.getDriver(), policyInfo.getOrganizationType());
			if (policyInfo.getPolicyEffectiveDate() != null)
				policyInfoPage.enterDateQuoteNeeded(DriverManager.getDriver(),policyInfo.getPolicyEffectiveDate());
			if (policyInfo.getPolicyTerm() != null)
				policyInfoPage.selectTermType(DriverManager.getDriver(), policyInfo.getPolicyTerm());
			if (policyInfo.isAddAdditionalInsured()) {
				policyInfoPage.clickAddAdditionalInsured(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
				//Log.messageStep("Policy Information entered with Effective date as : " +policyInfo.getPolicyEffectiveDate() + " and policy term as : " +policyInfo.getPolicyTerm(), DriverManager.getDriver());
			}
			Log.messageStep("Policy Information entered with Effective date as : " +policyInfo.getPolicyEffectiveDate() + " and policy term as : " +policyInfo.getPolicyTerm(), DriverManager.getDriver());
			policyInfoPage.clickNext(DriverManager.getDriver());
		}
	}

	/**
	 * Adding Location
	 * Adding Building and Location
	 * Adding Second Building and Location
	 * click "Next" button to navigate to next page
	 */
	public void addBuildingLocationDetails(AddBuildingLocationDetails addAddBuildingLocationDetails) {
		new ActionsPage(DriverManager.getDriver()).clickBuildingsAndLocationScreen(DriverManager.getDriver());
		new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(addAddBuildingLocationDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(AddBuildingLocationDetails.builder().build()).getAsJsonObject().toString();

		if (inputParams.equals(defaultParams)) {
			new BuildingsAndLocationsPage(DriverManager.getDriver()).get();
			Log.messageStep("Building Details processed",DriverManager.getDriver());
		} 
		if(addAddBuildingLocationDetails.getAddLocation()!=null) {
			LocationInformation locationInformation = addAddBuildingLocationDetails.getAddLocation();
			BuildingsAndLocationsPage buildingsAndLocationsPage = new BuildingsAndLocationsPage(DriverManager.getDriver());
			buildingsAndLocationsPage.clickAddLocation(DriverManager.getDriver())
			.clickNewLocation(DriverManager.getDriver());
			buildingsAndLocationsPage.new LocationInformationPage(DriverManager.getDriver())
			.enterAddress1(DriverManager.getDriver(),locationInformation.getAddressLine1())
			.enterCity(DriverManager.getDriver(), locationInformation.getCity())
			.selectState(DriverManager.getDriver(), locationInformation.getState())
			.enterZIPCode(DriverManager.getDriver(), locationInformation.getZipCode())
			.clickAutofillTerritoryCodes(DriverManager.getDriver())
			.clickOK(DriverManager.getDriver());
			Log.messageStep("Building Details for State : " + locationInformation.getState() +  " selected",DriverManager.getDriver());
		}
		if(addAddBuildingLocationDetails.getAddBuildingsAndLocation()!=null){
			NewBuilding newBuilding = addAddBuildingLocationDetails.getAddBuildingsAndLocation();
			BuildingsAndLocationsPage buildingsAndLocationsPage = new BuildingsAndLocationsPage(DriverManager.getDriver())
					.clickAddBuildingDropdown(DriverManager.getDriver(),addAddBuildingLocationDetails.getBuildingMenuCount())
					.mouseOverAddBuilding(DriverManager.getDriver(),addAddBuildingLocationDetails.getAddBuildingCount())
					.clickNewBuildings(DriverManager.getDriver(),addAddBuildingLocationDetails.getAddNewBuildingCount());
			buildingsAndLocationsPage.new LocationInformationPage(DriverManager.getDriver()).new NewBuildingPage(DriverManager.getDriver())
			.enterPropertyClassCode(DriverManager.getDriver(), newBuilding.getPropertyClassCode())
			.selectCoverageForm(DriverManager.getDriver(),newBuilding.getCoverageForm())
			.clickCoverages(DriverManager.getDriver());
			buildingsAndLocationsPage.enterIncomeLimitNotMfgorRental(DriverManager.getDriver(), newBuilding.getIncomeLimit());
			Log.messageStep("Coverage will be Processed Successfully with Income Limit as " + newBuilding.getIncomeLimit(),DriverManager.getDriver());
			buildingsAndLocationsPage.clickOK(DriverManager.getDriver());
			Log.messageStep("New Building will be Added Successfully" ,DriverManager.getDriver());
		}

		BuildingsAndLocationsPage buildingsAndLocationsPage = new BuildingsAndLocationsPage(DriverManager.getDriver());
		buildingsAndLocationsPage.clickNext(DriverManager.getDriver());
	}

	/**
	 * Add  Blankets by entering the blanket details
	 * Click Next navigate to next page
	 */
	@Override
	public void addBlankets(Blanket blanket) {
		String inputParams = new GsonBuilder().create().toJsonTree(blanket).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(Blanket.builder().build()).getAsJsonObject().toString();

		if (inputParams.equals(defaultParams)) {
			new BuildingsAndLocationsPage(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			Log.messageStep("Blanket Details processed", DriverManager.getDriver());
		}
		else {
			BlanketsPage blanketsPage = new BlanketsPage(DriverManager.getDriver()).get();	
			blanketsPage.clickAddBlanket(DriverManager.getDriver());
			blanketsPage.new BlanketDetailsPage(DriverManager.getDriver())
			.selectBlanketType(DriverManager.getDriver(),blanket.getBlanketType())
			.selectGroupType(DriverManager.getDriver(), blanket.getGroupType())
			.enterLimit(DriverManager.getDriver(),blanket.getLimit())
			.selectDeductible(DriverManager.getDriver(), blanket.getDeductible())
			.clickShowCoverages(DriverManager.getDriver())
			.clickBlanketCoverageCheckBox(DriverManager.getDriver())
			.clickIncludeSelectedinBlanket(DriverManager.getDriver())
			.clickOK(DriverManager.getDriver());
			blanketsPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Blanket Details : " + blanket.getBlanketType() + " selected",DriverManager.getDriver());
		}
	}

	/**
	 * Add Modifiers Details by entering the Modifiers Details
	 * Click Next navigate to next page
	 */
	@Override
	public void addModifiersDetails() {
		new ModifiersPage(DriverManager.getDriver()).get();
		new ModifiersPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Modifier details processed",DriverManager.getDriver());
	}

	/**
	 * Handles Uw issues, contigency, Resolve waive
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {
		new ActionsPage(DriverManager.getDriver()).clickRiskAnalysisScreen(DriverManager.getDriver());
		RiskAnalysisPage riskAnalysisPage = new RiskAnalysisPage(DriverManager.getDriver()).get();
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
			.enterLongDescription(DriverManager.getDriver(), riskAnalysis.getContingencyDescription())
			.clickOK(DriverManager.getDriver());
			Log.messageStep("Risk analysis details : " + riskAnalysis.getUWIssueType() + " entered" ,DriverManager.getDriver());
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
			Log.messageStep("Risk analysis details : " + riskAnalysis.getUWIssueType() + " entered" ,DriverManager.getDriver());
			riskAnalysisPage.new UWActivityPage(DriverManager.getDriver())
			.clickSendRequest(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());

			break;

		case CONTINGENCY:
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickAddNewContigency(DriverManager.getDriver())
			.enterContingencyTitle(DriverManager.getDriver(),riskAnalysis.getContingencyTitle())
			.enterContingencyDescription(DriverManager.getDriver(),riskAnalysis.getContingencyDescription())
			.selectContingencyAction(DriverManager.getDriver(),riskAnalysis.getContingencyAction())
			.enterDateDueField(DriverManager.getDriver(),riskAnalysis.getContingencyDueDate())
			.clickOK(DriverManager.getDriver());
			Log.messageStep("Risk analysis: Contingency created with Contigency Action as "+ riskAnalysis.getContingencyAction() ,DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());

			break;

		case PRIORLOSSES_ATTACH_DOCUMENT:
			riskAnalysisPage.new PriorLossesPage(DriverManager.getDriver())
			.clickPriorLosses(DriverManager.getDriver())
			.selectLossHistoryType(DriverManager.getDriver(), riskAnalysis.getLossHistoryType());
			new RiskAnalysisPage(DriverManager.getDriver()).new NewContingencyPage(DriverManager.getDriver())
			.enterLossesInPastFiveYears(DriverManager.getDriver(), riskAnalysis.getLossPercent()).enterPriorLossTotalIncurred(DriverManager.getDriver(), riskAnalysis.getLossTotalIncurred())
			.clickAttachDocumentButton(DriverManager.getDriver())
			.documentAttachBeforeCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName())
			.selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getUploadDocumentStatus())
			.clickUploadDocumentButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis details : " + riskAnalysis.getDocumentName() + " attached" ,DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			break;

		case PRIORLOSSES_MANUAL_ENTER:
			PriorLossesPage priorLossesPage = riskAnalysisPage.new PriorLossesPage(DriverManager.getDriver())
			.clickPriorLosses(DriverManager.getDriver())
			.selectLossHistoryType(DriverManager.getDriver(), riskAnalysis.getLossHistoryType());
			if(riskAnalysis.getLossCount()>1) priorLossesPage
			.clickAddLossHistory(DriverManager.getDriver());
			priorLossesPage.enterOccurenceDateField(DriverManager.getDriver(), riskAnalysis.getOccurenceDateField(), riskAnalysis.getLossCount())
			.enterPriorLossDescription(DriverManager.getDriver(), riskAnalysis.getPriorLossDescription(), riskAnalysis.getLossCount())
			.enterTotalIncurred(DriverManager.getDriver(), riskAnalysis.getTotalIncurred(), riskAnalysis.getLossCount())
			.enterAmountPaid(DriverManager.getDriver(), riskAnalysis.getAmountPaid(), riskAnalysis.getLossCount())
			.enterOpenReserve(DriverManager.getDriver(), riskAnalysis.getOpenReserve(), riskAnalysis.getLossCount())
			.selectLossHistoryStatus(DriverManager.getDriver(), riskAnalysis.getLossHistoryStatus(), riskAnalysis.getLossCount());
			Log.messageStep("Risk analysis details : " + riskAnalysis.getOccurenceDateField() + " entered" ,DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			break;

		case RESOLVE_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver())
			.clickContingencyTitle(DriverManager.getDriver());
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickContingencyResolveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis details processed" ,DriverManager.getDriver());
			break;

		case WAIVE_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver())
			.clickContingencyTitle(DriverManager.getDriver());
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickContingencyWaiveButton(DriverManager.getDriver());
			Log.messageStep("Waive Contingency for Policy will be processed successfully" ,DriverManager.getDriver());
			break;

		case ATTACH_DOCUMENT_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver())
			.new NewContingencyPage(DriverManager.getDriver())
			.clickNewDocumentButton(DriverManager.getDriver())
			.clickUploadDocumentLink(DriverManager.getDriver())
			.documentAttachAfterCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName())
			.selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentStatus())
			.selectUploadDocumentType(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentType())
			.clickUploadDocumentButton(DriverManager.getDriver())
			.clickContingencyWaiveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis details :" + riskAnalysis.getDocumentName() + " attached" ,DriverManager.getDriver());
			break;
		default:
			break;
		}
	}


	/**
	 * click "Next" button to navigate to next page
	 * @return PolicyReviewPage
	 */
	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		new PolicyReviewPage(DriverManager.getDriver());
		switch (policyreview.getPolicyReviewType()) {
		case NONE:
			PolicyReviewPage policyReviewPage = new PolicyReviewPage(DriverManager.getDriver());
			if(policyReviewPage.getRateButtonSize(DriverManager.getDriver()) == 1) {
				policyReviewPage.clickRate(DriverManager.getDriver());
			}
			else {
				policyReviewPage.clickNext(DriverManager.getDriver());
			}
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;
		case RENEW:
			new PolicyReviewPage(DriverManager.getDriver())
			.clickRenewEditPolicyTransactionBtn(DriverManager.getDriver())
			.clickRate(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;
		case OUT_OF_SEQUENCE:
			new PolicyReviewPage(DriverManager.getDriver())
			.clickChangeConflictTab(DriverManager.getDriver())
			.clickShouldOverrideNoRadioButton(DriverManager.getDriver())
			.clickSubmit(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());

		case REOPEN:
			new RiskAnalysisPage(DriverManager.getDriver())
			.clickRiskAnalysis(DriverManager.getDriver())
			.clickReopen(DriverManager.getDriver())
			.verifyApproveButtonIsDisplay(DriverManager.getDriver())
			.verifyRejectButtonIsDisplay(DriverManager.getDriver());
			Log.messageStep("User Re-Opened the closed UW issue Successfully ",DriverManager.getDriver());
			break;
		}
	}

	/**
	 * Click on Next Button 
	 * Returns Forms Page
	 */
	@Override
	public void viewQuote(Quote quote) {
		QuotePage quotePage = new QuotePage(DriverManager.getDriver()).get();
		if (quote.isShowRatingWorksheet()) { 
			quotePage.clickShowRatingWorksheet(DriverManager.getDriver());
			new RatingWorkSheetPage(DriverManager.getDriver()).get();
			new RatingWorkSheetPage(DriverManager.getDriver())
			.clickDownloadDrpIcon(DriverManager.getDriver())
			.clickOptionHTML(DriverManager.getDriver())
			.clickReturnToQuote(DriverManager.getDriver());
			new QuotePage(DriverManager.getDriver()).get();	
			Log.messageStep("Rating sheet downloaded",DriverManager.getDriver());
		}
		quotePage = new QuotePage(DriverManager.getDriver(), 2).get();
		if(quotePage.getFinishQuoteButtonSize(DriverManager.getDriver()) == 1) {
			quotePage.clickFinishQuote(DriverManager.getDriver());
		}

		if(quotePage.getNextButtonSize(DriverManager.getDriver()) == 1) {
			quotePage.clickNext(DriverManager.getDriver());
		}
		Log.messageStep("Quote page processed",DriverManager.getDriver());
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return FormsPage
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
		new PaymentsPage(DriverManager.getDriver()).get();
		PaymentsPage paymentsPage = new PaymentsPage(DriverManager.getDriver());
		if(payments.getBillingMethod()!=null) {
			billingMethod=payments.getBillingMethod();
			paymentsPage.selectBillingMethod(DriverManager.getDriver(),payments.getBillingMethod());
			Log.messageStep("Entered payment Billing Method as : " +billingMethod,DriverManager.getDriver());
		}
		if(payments.getPaymentPlan()!=null) {
			paymentPlan=payments.getPaymentPlan();
			paymentsPage.choosePaymentSchedule(DriverManager.getDriver(),payments.getPaymentPlan());
			Log.messageStep("Entered Payment Plan as : " +paymentPlan,DriverManager.getDriver());
		}
		if(payments.getUpFrontPayment()!=null) {
			upFrontPayment=payments.getUpFrontPayment();
			paymentsPage.chooseUpFrontPayment((DriverManager.getDriver()),payments.getUpFrontPayment()).clickAdd((DriverManager.getDriver()));	
			Log.messageStep("Entered Up Front Payment Method as : " +upFrontPayment,DriverManager.getDriver());
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
			Log.messageStep("Policy Issued successfully",DriverManager.getDriver());
			break;

		case POLICY_CHANGE:
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			new PolicyBoundPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Changed successfully",DriverManager.getDriver());
			break;

		case REWRITE_FULL_TERM:
		case REWRITE_NEW_TERM:
		case REWRITE_REMAINDER_TERM:
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy will be ReWrite successfully",DriverManager.getDriver());
			break;
		case RENEW_POLICY:
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver())
			.clickRenew(DriverManager.getDriver());
			new RenewalDataEntryPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Renewed successfully",DriverManager.getDriver());
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
		CancellationPage cancellationPage=new CancellationPage(DriverManager.getDriver())
				.selectSource(DriverManager.getDriver(), cancellationSource.getSource())
				.selectReason(DriverManager.getDriver(), cancellationSource.getReason());
		String refundMethod=cancellationPage.getRefundMethod(DriverManager.getDriver());
		cancellationPage.clickStartCancellation(DriverManager.getDriver());
		new ConfirmationPage(DriverManager.getDriver()).clickbindOptions(DriverManager.getDriver())
		.clickCancelNow(DriverManager.getDriver());
		Log.messageStep("Policy cancelled successfully for "+refundMethod,DriverManager.getDriver());

	}

	/**
	 * Click "Action" Button
	 * Click on "RewriteRemainderofTerm" Button
	 * @return 
	 */
	@Override
	public void policyRewriteRemainderTerm() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRewriteRemainderOfTerm(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite Remainder Term link", DriverManager.getDriver());
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
		.enterText(DriverManager.getDriver(), preRenewalDirection.getText())
		.selectDirection(DriverManager.getDriver(), preRenewalDirection.getDirection())
		.selectSecurityLevel(DriverManager.getDriver(), preRenewalDirection.getSecurity())
		.selectNonRenewReason(DriverManager.getDriver(), preRenewalDirection.getReason());
		Log.messageStep("Pre Renewal Direction for policy with : " +preRenewalDirection.getDirection()+" Successfully",DriverManager.getDriver());
		new PreRenewalDirectionForPolicyTermPage(DriverManager.getDriver()).clickUpdate(DriverManager.getDriver());

	}

	/**
	 * Click Reinstate button from Actions menu
	 * click Start Reinstate, select necessary option and click quote button
	 * click reinstate button
	 * @param reinstatementReason
	 */
	@Override
	public void reinstatePolicy(ReinstatementReason reinstatementReason) {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickReinstatePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Reinstate  and Reinstate Policy will be Processed",DriverManager.getDriver());
		new StartReinstatementPage(DriverManager.getDriver())
		.selectReason(DriverManager.getDriver(), reinstatementReason.getReason())
		.clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickReinstate(DriverManager.getDriver());
		Log.messageStep("Clicked on Reinstate Policy with Reason  as : " +reinstatementReason.getReason(),DriverManager.getDriver());
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
		Log.messageStep("Clicked on Rewrite Full Term link and Rewrite Full term policy will be Processed", DriverManager.getDriver());
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
		Log.messageStep("Clicked on Rewrite New Term link", DriverManager.getDriver());
	}

	/**
	 * Click "Action" button 
	 * click "Renew" button
	 */
	@Override
	public void policyRenew() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRenewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed Successfully", DriverManager.getDriver());
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
		.selectRenewalCode(DriverManager.getDriver(),
				renewPolicy.getRenewalcode()).clickOk(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed : " +renewPolicy.getRenewalcode()+ " successfully",DriverManager.getDriver());
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
	 * Enter Additional Insured Person Details
	 * Enter Secondary Insured Person Details
	 * @param createNewAccountFromPerson
	 * @return String
	 */
	@Override
	public String addInsured(CreateNewAccount createNewAccount) {
		CreateAccountOptions createAccountOption = createNewAccount.getCreateAccountPreference();
		String name = "";
		switch (createAccountOption) {

		case PERSON:

			CreateAccountPage createAccountPage = new CreateAccountPage(DriverManager.getDriver());
			EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
			CreateNewAccountFromPerson createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; // set createNewAccountFromPerson inside the PERSON case

			if (createNewAccountFromPerson.isAddSecondaryInsured())
				new PolicyInfoPage(DriverManager.getDriver())
				.clickSecondaryInsuredForPerson(DriverManager.getDriver());

			if (createNewAccountFromPerson.isAddAdditionalInsured())
				new PolicyInfoPage(DriverManager.getDriver())
				.clickAdditionalInsuredForPerson(DriverManager.getDriver());

			if (createNewAccountFromPerson.getFirstName() != null)
				enterAccountInformationPage.enterFirstname(DriverManager.getDriver(),createNewAccountFromPerson.getFirstName());
			if (createNewAccountFromPerson.getLastName() != null)
				enterAccountInformationPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
			if (createNewAccountFromPerson.getAddressLine1() != null) 
				createAccountPage.enterAddress1(DriverManager.getDriver(),createNewAccountFromPerson.getAddressLine1());
			if (createNewAccountFromPerson.getState() != null)
				createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if (createNewAccountFromPerson.getCity() != null)
				createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if (createNewAccountFromPerson.getZipCode() != null)
				createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if (createNewAccountFromPerson.getAddressType() != null)
				createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromPerson.getAddressType());
			if (createNewAccountFromPerson.getOrganization() != null)
				createAccountPage.enterOrganization(DriverManager.getDriver(),createNewAccountFromPerson.getOrganization());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			name = createNewAccountFromPerson.getFirstName() + " " + createNewAccountFromPerson.getLastName();
			Log.messageStep("Insured account First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName() + (" entered"), DriverManager.getDriver());

		case COMPANY:
			// yet to implement
			break;

		case FROM_ADDRESS_BOOK:
			// yet to implement
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
		new HeaderPage(DriverManager.getDriver()).verifyOutOfSequenceMessage(DriverManager.getDriver(),
				policyChange.getDate());
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
	 * Verify Caverages 
	 * Click on LiablityBodilyToggle Button
	 * verify Coverage Are Display
	 * click on Building Coverage Basic Group1 Toggle
	 * verify Deductible Factor Actual Value
	 * verify FireProduction Actual Value
	 * verify UWcompany Actual Value are display
	 * verify CoverageLimit ActualValue
	 * Click on ShowRatingWorksheet Button
	 * click Download Drop Icon
	 * click Option HTML
	 * verify IsFileDownloaded In Local
	 * @return Rating 
	 */
	@Override
	public void viewShowRating(Rating rate) throws InterruptedException {
		if (rate.isShowRatingWorksheet()) {
			QuotePage quotePage = new QuotePage(DriverManager.getDriver());
			quotePage.clickQuotes(DriverManager.getDriver());
			quotePage.clickShowRatingWorksheet(DriverManager.getDriver());

			//Verify Coverage and values

			RatingWorkSheetPage ratingWorkSheetPage = new RatingWorkSheetPage(DriverManager.getDriver()).get();
			ratingWorkSheetPage.verifyBuildingCoverage1(DriverManager.getDriver(), rate.getCoverage1(), rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyBuildingCoverage2(DriverManager.getDriver(), rate.getCoverage2(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyBusinessPersonalProperty1(DriverManager.getDriver(), rate.getCoverage3(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyBusinessPersonalProperty2(DriverManager.getDriver(), rate.getCoverage4(), rate.getEffectiveDate() ,rate.getExpirationDate())
			.clickBuildingCoverageBasicGroup1Toggle(DriverManager.getDriver())
			.verifyDeductibleFactorActualValue(DriverManager.getDriver(), rate.getState())
			.verifyFireProductionActualValue(DriverManager.getDriver(), rate.getFireProductionValue())
			.verifyUWcompanyActualValue(DriverManager.getDriver(), rate.getValue())
			.verifyCoverageLimitActualValue(DriverManager.getDriver(), rate.getLimit());

			// Rating process

			ratingWorkSheetPage.clickDownloadDrpIcon(DriverManager.getDriver())
			.clickOptionHTML(DriverManager.getDriver())
			.verifyIsFileDownloaded(DriverManager.getDriver(), rate.getFileName());
			Log.messageStep("Building Coverage1 , Building Coverage2 , Business PersonalProperty 2 and Business PersonalProperty 2 Coverages are Created for Commericial Property ",DriverManager.getDriver());
			Log.messageStep("Viewed Rating WorkSheet contains UW value as : "+rate.getValue()+" and Coverage limit : "+rate.getLimit()+" and FireProduction ActualValue : "+rate.getFireProductionValue(),DriverManager.getDriver());
		}
		else {
			new QuotePage(DriverManager.getDriver()).get();
			new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Quote page details processed",DriverManager.getDriver());
		}
	}

	/**
	 * Click Account Number
	 * Get the Submission Number
	 * @return submissionNo
	 */
	public String getSubmissionNo() {
		new PolicyReviewPage(DriverManager.getDriver())
		.clickAccountNo(DriverManager.getDriver());
		String submissionNo = new AccountSummaryPage(DriverManager.getDriver())
				.submissionNo(DriverManager.getDriver());
		return submissionNo;
	}

	/**
	 * Click Setting
	 * Click "LogOut" Button
	 * Logout The application
	 */
	@Override
	public void logOutTheApplication() {
		new AccountSummaryPage(DriverManager.getDriver())
		.clickSetting(DriverManager.getDriver())
		.clickLogOutSuperUser(DriverManager.getDriver());
		Log.messageStep("User is Logged Out",DriverManager.getDriver());
	}

	/**
	 * Click Search Tab
	 * Select SearchFor drop down 
	 * Enter the Submission Number
	 * Click Search  button
	 * click on Account Number 
	 */
	@Override
	public void searchSubmission(String searchType, String subissionNumber) {
		new MySummaryPage(DriverManager.getDriver())
		.clickSearch(DriverManager.getDriver());
		new SearchPoliciesPage(DriverManager.getDriver())
		.selectSearchFor(DriverManager.getDriver(),searchType)
		.enterSubmissionNumber(DriverManager.getDriver(),subissionNumber)
		.clickSearch_14(DriverManager.getDriver())
		.clickSubmissionNo(DriverManager.getDriver());
	}

	/**
	 * Click PolicyInfo Tab
	 * Get the Effective Date
	 * @return  Effective Date
	 */
	public String getEffectiveDate() {
		QuotePage quotePage = new QuotePage(DriverManager.getDriver());
		quotePage.clickPolicyInfo(DriverManager.getDriver());
		String effectiveDate = quotePage.getEffectiveDate(DriverManager.getDriver());
		Log.messageStep("Effective date : "+effectiveDate+" of a Policy",DriverManager.getDriver());
		return effectiveDate;

	}

	/**
	 * Click PolicyInfo Tab
	 * Get the Expiration Date
	 * @return  Expiration Date
	 */
	public String getExpirationDate() {
		QuotePage quotePage = new QuotePage(DriverManager.getDriver());
		String expirationDate = quotePage.getExpirationDate(DriverManager.getDriver());
		Log.messageStep("Expiration date : "+expirationDate+" of a Policy",DriverManager.getDriver());
		return expirationDate;
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
	 * Click on "GotoBatch Process" button
	 * Click on "RunHandleUnResolvedCotingency" button
	 */
	@Override
	public void runBatchProcessInfo() {
		new PolicySummaryPage(DriverManager.getDriver()).get()
		.clickGotoBatchProcess(DriverManager.getDriver());
		BatchProcessInfoPage batchProcessInfoPage = new BatchProcessInfoPage(DriverManager.getDriver()).get();
		batchProcessInfoPage.clickRunHandleUnresolvedContingency(DriverManager.getDriver());
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
	 * Click on "Rate"
	 * Click on "Quote"
	 * Click on "Bind Options"
	 * Click on "Issue Policy"
	 */
	@Override
	public void copySubmissions() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickCopySubmission(DriverManager.getDriver());
		new PolicyInfoPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new BuildingsAndLocationsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new BlanketsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new ModifiersPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new RiskAnalysisPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new PolicyReviewPage(DriverManager.getDriver()).clickRate(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickFinishQuote(DriverManager.getDriver())
		.clickBindOptions(DriverManager.getDriver())
		.clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());

	}

}