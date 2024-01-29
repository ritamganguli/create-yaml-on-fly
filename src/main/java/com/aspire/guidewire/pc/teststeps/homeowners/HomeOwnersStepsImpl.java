package com.aspire.guidewire.pc.teststeps.homeowners;

import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.ActionsPage;
import com.aspire.guidewire.pc.pages.common.CancellationPage;
import com.aspire.guidewire.pc.pages.common.ConfirmationPage;
import com.aspire.guidewire.pc.pages.common.CreateAccountPage;
import com.aspire.guidewire.pc.pages.common.EnterAccountInformationPage;
import com.aspire.guidewire.pc.pages.common.FormsPage;
import com.aspire.guidewire.pc.pages.common.HeaderPage;
import com.aspire.guidewire.pc.pages.common.HistoryPage;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.pc.pages.common.ModifiersPage;
import com.aspire.guidewire.pc.pages.common.MySummaryPage;
import com.aspire.guidewire.pc.pages.common.NewDocumentPage;
import com.aspire.guidewire.pc.pages.common.NewSubmissionsPage;
import com.aspire.guidewire.pc.pages.common.NotTakenReasonPage;
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
import com.aspire.guidewire.pc.pages.common.SubmissionDeclinedPage;
import com.aspire.guidewire.pc.pages.homeowners.CoveragePage;
import com.aspire.guidewire.pc.pages.homeowners.DwellingConstructionPage;
import com.aspire.guidewire.pc.pages.homeowners.DwellingPage;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.AdditionalInterest;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.AdditionalInterestFromPerson;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CreateEmail;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingConstruction;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.HistoryDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.UWIssueType;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class HomeOwnersStepsImpl implements HomeOwnersSteps {

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
			AccountSummaryPage accountSummaryPage = new AccountSummaryPage(DriverManager.getDriver()).get();
			accountSummaryPage.verifyAccountNo(DriverManager.getDriver());
			accountNumberText = accountSummaryPage.getAccountNumberText(DriverManager.getDriver());
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
	 * click "next" button to navigate to next page
	 * @return PolicyInfoPage
	 */
	@Override
	public void selectQualifications(Qualification qualification) {
		String inputParams = new GsonBuilder().create().toJsonTree(qualification).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(Qualification.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			QualificationPage qualificationPage = new QualificationPage(DriverManager.getDriver());
			qualificationPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Qualifications details Processed",DriverManager.getDriver());
		}

		else {
			QualificationPage qualificationPage = new QualificationPage(DriverManager.getDriver()).selectPolicyType(DriverManager.getDriver(), qualification.getPolicyType())
					.selectCoverageForm(DriverManager.getDriver(), qualification.getCoverageForm().toString())
					.selectOccupyDwelling(DriverManager.getDriver(), qualification.getDwellingOccupied());
			Log.messageStep("Qualification Policy Type : "+qualification.getPolicyType()+" is Selected",  DriverManager.getDriver());
			if (qualification.getDwellingOccupied().equals("Tenant")) {
				qualificationPage.clickNext(DriverManager.getDriver());
				Log.messageStep("Qualifications details entered for dwelling : " + qualification.getDwellingOccupied().equals("Tenant") + " selected ", DriverManager.getDriver());
			}

			if (qualification.getDwellingOccupied().equals("Myself")) {
				qualificationPage.doYouOccupyDwellingFullTime(DriverManager.getDriver(), qualification.getOccupyDwellingFullTime())
				.clickNext(DriverManager.getDriver());
				Log.messageStep("Qualifications details entered for dwelling : " + qualification.getDwellingOccupied().equals("Myself") + " selected ", DriverManager.getDriver());
			}
		}
	}

	/**
	 * Enters the date in "QuoteDate" Field
	 * Select Term type from "TermType" Drop down
	 * click "Next" button to navigate to next page
	 * @return DwellingPage
	 */
	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {
		PolicyInfoPage policyInfoPage= new PolicyInfoPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(policyInfo).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(PolicyInfo.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			policyInfoPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Information Processed",DriverManager.getDriver());
		}
		else {
			new ActionsPage(DriverManager.getDriver()).clickPolicyInfoScreen(DriverManager.getDriver());
			if(policyInfo.getPolicyEffectiveDate()!=null) policyInfoPage.enterDateQuoteNeeded(DriverManager.getDriver(), policyInfo.getPolicyEffectiveDate());
			if(policyInfo.getPolicyTerm()!=null) {policyInfoPage.selectTermType(DriverManager.getDriver(), policyInfo.getPolicyTerm());
			if((policyInfo.getPolicyTerm()).equalsIgnoreCase("OTHER")) policyInfoPage.enterExpirationDate(DriverManager.getDriver(), policyInfo.getPolicyExpirationDate());
			}

			if(policyInfo.isAddSecondaryInsured()) { 
				policyInfoPage.clickAddNewSecondaryInsurer(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
			}
			if(policyInfo.isAddAdditionalInsured()) { 
				policyInfoPage.clickAddAdditionalInsured(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
			}
			policyInfoPage.clickNext(DriverManager.getDriver());
			new DwellingPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Information Processed for Effective Date as "+policyInfo.getPolicyEffectiveDate(),DriverManager.getDriver());
		}
	}

	/**
	 * Enters Fire Protection and navigate to next Page
	 * @param FireProtection
	 */
	@Override
	public void addDwellingDetails(DwellingDetails dwellingDetails) {
		String inputParams = new GsonBuilder().create().toJsonTree(dwellingDetails).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(DwellingDetails.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			policyInfoPage.clickNext(DriverManager.getDriver());
			Log.message("Dwelling Details processed");
		}else {	
			DwellingPage dwellingPage=new DwellingPage(DriverManager.getDriver())
					.clickDwellingScreen(DriverManager.getDriver());
			if(dwellingDetails.getFireProtection()!=null) dwellingPage.selectFireProtectionClass(DriverManager.getDriver(), dwellingDetails.getFireProtection());
			if(dwellingDetails.isAddAdditionalInsured()) { 
				dwellingPage.clickAdditionalInterestCardTab(DriverManager.getDriver()).clickAdd_5(DriverManager.getDriver());
				addInsured(dwellingDetails.getCreateInsured());
			}
			if(dwellingDetails.isAddAdditionalInterest()) { 
				dwellingPage.clickAdditionalInterestCardTab(DriverManager.getDriver()).clickAdd_3(DriverManager.getDriver());
				addAdditionalInterestInDwelling(dwellingDetails.getCreateInterest());
			}
			dwellingPage.clickNext(DriverManager.getDriver());
		}

	}

	/**
	 * Enters Year of construction and clicks next
	 * @param dwellingConstruction
	 */
	@Override
	public void addDwellingConstructionDetails(DwellingConstruction dwellingConstruction) {

		JsonObject params = new GsonBuilder().create().toJsonTree(dwellingConstruction).getAsJsonObject();
		if(params.toString().equals("{}")) {
			DwellingConstructionPage dwellingConstructionPage = new DwellingConstructionPage(DriverManager.getDriver());
			dwellingConstructionPage.clickNext(DriverManager.getDriver());
			Log.message("Dwelling construction details processed");
		}
		else {
			new DwellingConstructionPage(DriverManager.getDriver())
			.enterYearBuilt(DriverManager.getDriver(), dwellingConstruction.getYear())
			.clickNext(DriverManager.getDriver());
			Log.message("Dwelling construction details of year " + dwellingConstruction.getYear() + " entered");
			new CoveragePage(DriverManager.getDriver()).get();
		}


	}

	/**
	 * Enters Coverage details for respective policy type like Dwelling, Condominium, Rental
	 * click "Next" button to navigate to next page
	 * @return ModifiersPage
	 */
	@Override
	public void addCoverages(Coverages coverage) {
		CoveragePage coveragePage= new CoveragePage(DriverManager.getDriver());
		switch(coverage.getPolicyType()) {
		case DWELLING:
			coveragePage.selectCoinsurance(DriverManager.getDriver(), coverage.getCoinsurance());
			coveragePage.selectProhibitedUseCivilAuthority(DriverManager.getDriver(), coverage.getProhibitedUse())
			.lossOfRentalIncome(DriverManager.getDriver(), coverage.getLossOfRentalIncome())
			.clickNext(DriverManager.getDriver());
			Log.messageStep("Coverages details for dwelling processed", DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			break;
		case CONDOMINIUM:
			coveragePage.selectCoinsurance(DriverManager.getDriver(), coverage.getCoinsurance())
			.enterCovCLimit(DriverManager.getDriver(), coverage.getCovCLimit())
			.selectValuationMethod_2(DriverManager.getDriver(), coverage.getValuationMethod())
			.lossOfRentalIncome(DriverManager.getDriver(), coverage.getLossOfRentalIncome())
			.selectProhibitedUseCivilAuthority(DriverManager.getDriver(), coverage.getProhibitedUse())
			.clickNext(DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			Log.messageStep("Coverages details for condominium: " + coverage.getCoinsurance()+ " selected"  , DriverManager.getDriver());
			break;	
		case RENTAL:
			coveragePage.selectValuationMethod(DriverManager.getDriver(), coverage.getValuationMethod())
			.enterCovCLimit(DriverManager.getDriver(), coverage.getCovCLimit())
			.selectProhibitedUseCivilAuthority(DriverManager.getDriver(), coverage.getProhibitedUse())
			.clickNext(DriverManager.getDriver());
			new ModifiersPage(DriverManager.getDriver()).get();
			Log.messageStep("Coverages details for rental: " + coverage.getCoinsurance()+ " selected"  , DriverManager.getDriver());

			break;
		case NONE:
			new CoveragePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver()); 
			Log.messageStep("Coverage details processed",DriverManager.getDriver());
		}
	}

	/**
	 * click next button
	 * @return RiskAnalysisPage
	 */
	@Override
	public void addModifiersDetails() {
		new ModifiersPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new RiskAnalysisPage(DriverManager.getDriver()).get();
		Log.messageStep("Modifiers details processed",DriverManager.getDriver());
	}

	/**
	 * Handles Uw issues, contigency, Resolve waive
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {
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
			Log.messageStep("UW Issue is Created with Issue Type as : " + riskAnalysis.getUWIssueType(),DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
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
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis details :" + riskAnalysis.getUWIssueType() + " entered" ,DriverManager.getDriver());
			break;
		case CONTINGENCY:
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickAddNewContigency(DriverManager.getDriver()).enterContingencyTitle(DriverManager.getDriver(),riskAnalysis.getContingencyTitle())
			.enterContingencyDescription(DriverManager.getDriver(),riskAnalysis.getContingencyDescription())
			.selectContingencyAction(DriverManager.getDriver(),riskAnalysis.getContingencyAction())
			.enterDateDueField(DriverManager.getDriver(),riskAnalysis.getContingencyDueDate())
			.clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis details :" + riskAnalysis.getContingencyDescription() + " entered" ,DriverManager.getDriver());
			break;
		case PRIORLOSSES_ATTACH_DOCUMENT:
			riskAnalysisPage.new PriorLossesPage(DriverManager.getDriver())
			.clickPriorLosses(DriverManager.getDriver()).selectLossHistoryType(DriverManager.getDriver(), riskAnalysis.getLossHistoryType());
			new RiskAnalysisPage(DriverManager.getDriver()).new NewContingencyPage(DriverManager.getDriver())
			.enterLossesInPastFiveYears(DriverManager.getDriver(), riskAnalysis.getLossPercent()).enterPriorLossTotalIncurred(DriverManager.getDriver(), riskAnalysis.getLossTotalIncurred())
			.clickAttachDocumentButton(DriverManager.getDriver()).documentAttachBeforeCreation(DriverManager.getDriver(), riskAnalysis.getDocumentName()).selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getUploadDocumentStatus())
			.clickUploadDocumentButton(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis details :" + riskAnalysis.getDocumentName() + " attached" ,DriverManager.getDriver());
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
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis details :" + riskAnalysis.getOccurenceDateField() + " entered" ,DriverManager.getDriver());
			break;

		case RESOLVE_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver());
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver()).clickContingencyResolveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis details processed" ,DriverManager.getDriver());
			break;

		case WAIVE_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver());
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver()).clickContingencyWaiveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis details processed" ,DriverManager.getDriver());
			break;

		case ATTACH_DOCUMENT_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver())
			.new NewContingencyPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver()).clickUploadDocumentLink(DriverManager.getDriver())
			.documentAttachAfterCreation(DriverManager.getDriver(), riskAnalysis.getDocumentName()).selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentStatus())
			.selectUploadDocumentType(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentType())
			.clickUploadDocumentButton(DriverManager.getDriver()).clickContingencyWaiveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis details :" + riskAnalysis.getDocumentName() + " attached" ,DriverManager.getDriver());
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
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis details : " + riskAnalysis.getTotalLosses() + " attached" ,DriverManager.getDriver());
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
		switch (policyreview.getPolicyReviewType())
		{
		case NONE:
			new PolicyReviewPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
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
	 * Enters Rating sheet details
	 * click "Next" button to navigate to next page
	 * @return QuotePage
	 */
	@Override
	public void viewForms(Quote quote) {
		if(quote.isCoverageForm()) {
			new ActionsPage(DriverManager.getDriver()).clickFormsScreen(DriverManager.getDriver());
			new FormsPage(DriverManager.getDriver()).get().
			verifyCoverageForm(DriverManager.getDriver(), quote.getCoverageFormName());
			Log.messageStep("Forms page " + quote.getCoverageFormName() + " verified",DriverManager.getDriver());
		}
		else {
			new FormsPage(DriverManager.getDriver()).get();
			new FormsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Forms page processed",DriverManager.getDriver());
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
	 * click BindOptions
	 * click issue policy button
	 * @return PolicyBoundPage
	 */
	@Override
	public void issuepolicy(Transactions transaction) {
		switch (transaction) {

		case BIND_ONLY:
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver())
			.clickBindOnly(DriverManager.getDriver());
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
	 * returns OfferingsPage
	 */
	@Override
	public void policyChange(PolicyChange policyChange) {
		StartPolicyChangePage startPolicyChangePage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
				.clickChangePolicy(DriverManager.getDriver());	
		startPolicyChangePage.enterEffectiveDate(DriverManager.getDriver(), policyChange.getDate());
		startPolicyChangePage.clickNext(DriverManager.getDriver());
		Log.messageStep("Effective date : " +policyChange.getDate()+ " updated in start policy change" ,DriverManager.getDriver());
	}

	/**
	 * Click Reinstate button from Actions menu
	 * click Start Reinstate, select neccessary option and clik quote button
	 * click reinstate button
	 * @param reinstatementReason
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
	 * Returns PolicyBoundPage
	 */
	@Override
	public void policyRewriteFullTerm() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickRewriteFullTermPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite Full Term link",DriverManager.getDriver());
	}

	/**
	 * Click on Action Button
	 * Click on Rewrite New Term to Proceed
	 * @return PolicyInfoPage 
	 */
	@Override
	public void policyRewriteNewTerm() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickRewriteNewTerm(DriverManager.getDriver());
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
		Log.messageStep("Clicked on Pre Renewal Direction link for Direction : " +preRenewalDirection.getDirection(),DriverManager.getDriver());
	}

	/**
	 * Click Renew Policy button from Action menu
	 */
	@Override
	public void policyRenew() {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickRenewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed Successfully",DriverManager.getDriver());
	}

	/**
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
	 * To verify out of sequence message in every page
	 * @param policyChange
	 */
	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
		new HeaderPage(DriverManager.getDriver()).verifyOutOfSequenceMessage(DriverManager.getDriver(), policyChange.getDate());
		Log.messageStep("Out Of Sequence message verified Successfully",DriverManager.getDriver());
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
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());
	}

	/**
	 * click add insured button
	 * Add both secondary and additional insured
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * @param createNewAccount
	 * @return 
	 */
	@Override
	public void addAdditionalInterestInDwelling(AdditionalInterest additionalInterest) {
		CreateAccountOptions  createAccountOption = additionalInterest.getCreateAccountPreference();
		switch(createAccountOption) {

		case PERSON:

			AdditionalInterestFromPerson additionalInterestFromPerson = (AdditionalInterestFromPerson)additionalInterest;
			DwellingPage dwellingPage =new DwellingPage(DriverManager.getDriver()).clickNewPerson(DriverManager.getDriver());
			dwellingPage.new NewAdditionalInterestPage(DriverManager.getDriver())
			.selectInterestType(DriverManager.getDriver(), additionalInterestFromPerson.getInterestType().getName());
			Log.messageStep("Interest Type :"+ additionalInterestFromPerson.getInterestType().getName()+" is selected",DriverManager.getDriver());
			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());
			new EnterAccountInformationPage(DriverManager.getDriver()).enterFirstname(DriverManager.getDriver(), additionalInterestFromPerson.getFirstName())
			.enterLastname(DriverManager.getDriver(), additionalInterestFromPerson.getLastName());
			createAccountPage.enterAddress1(DriverManager.getDriver(),  additionalInterestFromPerson.getAddressLine1())
			.selectState(DriverManager.getDriver(), additionalInterestFromPerson.getState())
			.enterCity(DriverManager.getDriver(), additionalInterestFromPerson.getCity())
			.enterZIPCode(DriverManager.getDriver(), additionalInterestFromPerson.getZipCode())
			.selectAddressType(DriverManager.getDriver(), additionalInterestFromPerson.getAddressType())
			.clickUpdate(DriverManager.getDriver());
			Log.messageStep("Additional Interest In Dwelling with First Name: " + additionalInterestFromPerson.getFirstName() + " and Last Name: " + additionalInterestFromPerson.getLastName() + (" entered"), DriverManager.getDriver());

		case COMPANY:
			//yet to implement
			break;

		case FROM_ADDRESS_BOOK:
			//yet to implement

		case OTHER_CONTACTS:

			//yet to implement
		}
		Log.message("Additional Interest added", DriverManager.getDriver());
	}


	/**
	 * click add insured button
	 * Add both secondary and additional insured
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * @param createNewAccount
	 * @return 
	 */
	@Override
	public void addInsured(CreateNewAccount createNewAccount) {
		CreateAccountOptions  createAccountOption = createNewAccount.getCreateAccountPreference();
		switch(createAccountOption) {

		case PERSON:
			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());	
			EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
			CreateNewAccountFromPerson createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; // set createNewAccountFromPerson inside the PERSON case

			if(createNewAccountFromPerson.isAddSecondaryInsured())
				new PolicyInfoPage(DriverManager.getDriver()).clickSecondaryInsuredForPerson(DriverManager.getDriver());

			if(createNewAccountFromPerson.isAddAdditionalInsured()) {
				new PolicyInfoPage(DriverManager.getDriver()).clickAdditionalInsuredForPerson(DriverManager.getDriver());
				DwellingPage dwellingPage = new DwellingPage(DriverManager.getDriver());
				dwellingPage.new NewAdditionalInsuredPage(DriverManager.getDriver()).selectType(DriverManager.getDriver(), createNewAccountFromPerson.getInsuredType().getName());
				Log.messageStep("Additional Insured Type "+createNewAccountFromPerson.getInsuredType().getName()+"is selected", DriverManager.getDriver());
			}

			if(createNewAccountFromPerson.getFirstName()!=null) enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) enterAccountInformationPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
			if(createNewAccountFromPerson.getAddressLine1()!=null) createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromPerson.getAddressLine1());
			if(createNewAccountFromPerson.getState()!=null) createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if(createNewAccountFromPerson.getCity()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if(createNewAccountFromPerson.getZipCode()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if(createNewAccountFromPerson.getAddressType()!=null) createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromPerson.getAddressType());
			if(createNewAccountFromPerson.getOrganization()!=null) createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromPerson.getOrganization());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			if(createNewAccountFromPerson.getInsuredType()!=null) {
				if((createNewAccountFromPerson.getInsuredType().getName()).equalsIgnoreCase("STUDENT")) {
					new DwellingPage(DriverManager.getDriver()).enterSchoolName(DriverManager.getDriver(),createNewAccountFromPerson.getSchoolName());
					Log.messageStep("Insured account First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName() + (" entered"), DriverManager.getDriver());
				}
			}
		case COMPANY:
			//yet to implement
			break;

		case FROM_ADDRESS_BOOK:
			//yet to implement
		default:
			break;
		}
	}

	/**
	 * click on actions button
	 * click on New Documents button
	 * click on Create new template
	 * choose any template
	 * update the choosed template
	 * @param createEmail
	 * 
	 */
	public String templateCreation(CreateEmail createEmail) {
		String documentTremplate ="";
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickNewDocumentButton(DriverManager.getDriver()).clickCreateTemplate(DriverManager.getDriver());
		NewDocumentPage newDocumentPage = new NewDocumentPage(DriverManager.getDriver());
		newDocumentPage.clickSearchDocumentIcon(DriverManager.getDriver());
		if (createEmail.getDocumentType()!=null) newDocumentPage.selectDocumentType(DriverManager.getDriver(), createEmail.getDocumentType());
		newDocumentPage.clickSearch(DriverManager.getDriver())
		.clickSelect(DriverManager.getDriver());
		if (createEmail.getEmailSubject()!=null) newDocumentPage.enterSubject(DriverManager.getDriver(), createEmail.getEmailSubject());
		if (createEmail.getEmailBody()!=null) {
			newDocumentPage.enterBody(DriverManager.getDriver(), createEmail.getEmailBody());
			documentTremplate = newDocumentPage.getDocumentTemplate(DriverManager.getDriver());
		}
		newDocumentPage.clickCreateDocument(DriverManager.getDriver());
		if (createEmail.getEmailBody()!=null) {
			newDocumentPage.clickViewEdit(DriverManager.getDriver())
			.verifyEmailBody(DriverManager.getDriver(),  createEmail.getEmailBody())
			.verifyEmailSubject(DriverManager.getDriver(), createEmail.getEmailSubject());
			Log.messageStep("Email is Created with : Email Body : "+createEmail.getEmailBody()+" and Email Subject : "+createEmail.getEmailSubject(), DriverManager.getDriver());
		}
		newDocumentPage.clickUpdateButton(DriverManager.getDriver());
		Log.messageStep("Template had been processed",DriverManager.getDriver());
		return documentTremplate;
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
		new QuotePage(DriverManager.getDriver()).clickRiskAnalysis(DriverManager.getDriver());
		Log.messageStep("Risk Analysis Page processed",DriverManager.getDriver());
	}
	/**
	 * Proceed to Header Page
	 * Click on History Button
	 * @return HistoryPage 
	 */
	@Override
	public void verifyChangesInHistoryPage(HistoryDetails historyDetails) {
		new HeaderPage(DriverManager.getDriver()).clickHistory(DriverManager.getDriver());
		new HistoryPage(DriverManager.getDriver())
		.verifyAnswerChangedTextValue(DriverManager.getDriver(), historyDetails.getOriginalValue(),historyDetails.getNewValue());
		Log.messageStep("Changes in History page is verified",DriverManager.getDriver());
	}

	/**
	 * Verify Error Message
	 * @return HistoryPage 
	 */
	@Override
	public void verifyErrorMessage(String expectedActualErrorMessage) {
		String actualErrorMessage = new HeaderPage(DriverManager.getDriver()).getErrorMessage(DriverManager.getDriver());
		Log.assertThat(actualErrorMessage.equals(expectedActualErrorMessage), "Error message displayed successfully: "+actualErrorMessage,
				"Actual error message: "+actualErrorMessage+" is not matching with expected: "+expectedActualErrorMessage, DriverManager.getDriver());
	}

	/**
	 * Proceed to Header Page
	 * Click on ShowRatingWorksheet Button
	 * click on Download Drop Icon
	 * click Option HTML
	 * click ReturnToQuote Button
	 * click on Next Button
	 * @return HistoryPage 
	 */
	@Override
	public void viewQuote(Quote quote) {
		if (quote.isShowRatingWorksheet()) {
			QuotePage quotePage = new QuotePage(DriverManager.getDriver());
			quotePage.clickShowRatingWorksheet(DriverManager.getDriver());
			new RatingWorkSheetPage(DriverManager.getDriver()).get();
			new RatingWorkSheetPage(DriverManager.getDriver()).clickDownloadDrpIcon(DriverManager.getDriver())
			.clickOptionHTML(DriverManager.getDriver())
			.clickReturnToQuote(DriverManager.getDriver());
			quotePage.clickNext(DriverManager.getDriver());
			Log.messageStep("Rating sheet downloaded",DriverManager.getDriver());
		}
		else {
			new QuotePage(DriverManager.getDriver()).get();
			new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("quote page details processed",DriverManager.getDriver());
		}
	}

	/**
	 * Click on Document
	 * Verify Email is Created or not
	 * @return HistoryPage 
	 */
	@Override
	public void verifyDocumentIsCreated(String documentName) {
		new NewDocumentPage(DriverManager.getDriver()).clickDocument(DriverManager.getDriver());
		String doc =new NewDocumentPage(DriverManager.getDriver()).verifyEmailDocumentCreated(DriverManager.getDriver());
		Log.assertThat(doc.equals(documentName), "Document is created Successfully","Document is not created Successfully");
	}

	/**
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

			//verifyCoveragesAndValuesAreDisplay

			RatingWorkSheetPage ratingWorkSheetPage = new RatingWorkSheetPage(DriverManager.getDriver()).get();
			ratingWorkSheetPage
			.verifyCoveragesE(DriverManager.getDriver(),rate.getCoverage1(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyCoveragesF(DriverManager.getDriver(),rate.getCoverage2(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyCoveragesD(DriverManager.getDriver(),rate.getCoverage3(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifySectionIDeductible(DriverManager.getDriver(),rate.getCoverage4(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.clickIDeductiblesToggle(DriverManager.getDriver())
			.verifyAllPerilsDeductFactor(DriverManager.getDriver(), rate.getValue())
			.clickBasePremiumToggle(DriverManager.getDriver())
			.verifyState(DriverManager.getDriver(), rate.getState())
			.verifyActualValueFormFactor(DriverManager.getDriver(), rate.getFactorVal())
			.clickCoverageFToggle(DriverManager.getDriver())
			.verifyCoverageFLimit(DriverManager.getDriver(), rate.getLimit());

			//Rating process

			ratingWorkSheetPage = new RatingWorkSheetPage(DriverManager.getDriver());
			ratingWorkSheetPage.clickDownloadDrpIcon(DriverManager.getDriver())
			.clickOptionHTML(DriverManager.getDriver())
			.verifyIsFileDownloaded(DriverManager.getDriver(), rate.getFileName());
			Log.messageStep("CoveragesE ,CoveragesF, CoveragesD, Coverage SectionIDeductible are Created for Home owners ", DriverManager.getDriver());
			Log.messageStep("Viewed Rating WorkSheet contains State as : "+rate.getState()+" and Actual Value Form Factor : "+rate.getFactorVal()+" and Coverage limit as : "+rate.getLimit(),DriverManager.getDriver());
		}
		else {
			new QuotePage(DriverManager.getDriver()).get();
			new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("quote page details processed",DriverManager.getDriver());
		}
	}

	/**
	 * Click on Forms
	 * Verify Coverage were Created or not
	 * @return HistoryPage 
	 */
	@Override
	public void verifyFormsCreated(Transactions transactions) {
		FormsPage formsPage = new FormsPage(DriverManager.getDriver()).clickForms(DriverManager.getDriver());
		switch(transactions) {
		case SUBMISSION:
			formsPage.verifyCoverageName(DriverManager.getDriver());
			Log.messageStep(""+"Forms-HOP 06 00 "+" is Created Successfully after Submission",DriverManager.getDriver());
			break;
		case POLICY_CHANGE:	
			formsPage.verifyCoverageNameAfterPolicyChange(DriverManager.getDriver());
			Log.messageStep(""+"HOP 06 00_PolicyChange"+" is Created  Successfully After Policy Change",DriverManager.getDriver());
			break;
		default:
			break;

		}

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
		new QualificationPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());
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
			try {
				new RiskAnalysisPage(DriverManager.getDriver()).clickDetails(DriverManager.getDriver())
				.clickApprove(DriverManager.getDriver())
				.clickOK(DriverManager.getDriver())
				.clickNext(DriverManager.getDriver());
				Log.messageStep("Approved UW Issue",DriverManager.getDriver());}
			catch(Exception e) {
				Log.messageStep("UW issues not happened", DriverManager.getDriver());
			}
		}

	}

	/**
	 * Used to get the Policy Number
	 * Click on "View Policy"
	 * Get the Policy Number using text
	 * @return
	 */
	@Override
	public String getPolicyNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}