package com.aspire.guidewire.pc.teststeps.commercialauto;

import com.aspire.guidewire.pc.pages.commercialauto.BatchProcessInfoPage;
import com.aspire.guidewire.pc.pages.commercialauto.CommercialAutoLinePage;
import com.aspire.guidewire.pc.pages.commercialauto.CommercialAutoLinePage.NewAdditionalInsuredPage;
import com.aspire.guidewire.pc.pages.commercialauto.CommercialAutoLinePage.SearchCoveragesPage;
import com.aspire.guidewire.pc.pages.commercialauto.CoveredVehiclesPage;
import com.aspire.guidewire.pc.pages.commercialauto.DriversPage;
import com.aspire.guidewire.pc.pages.commercialauto.DriversPage.DriverDetailsPage;
import com.aspire.guidewire.pc.pages.commercialauto.LocationsPage;
import com.aspire.guidewire.pc.pages.commercialauto.StateInfoPage;
import com.aspire.guidewire.pc.pages.commercialauto.VehiclesPage;
import com.aspire.guidewire.pc.pages.commercialauto.VehiclesPage.VehiclesInformationPage;
import com.aspire.guidewire.pc.pages.commercialauto.WorkQueueInfoPage;
import com.aspire.guidewire.pc.pages.common.AccountFileDocumentsPage;
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
import com.aspire.guidewire.pc.pages.common.SubmissionManagerPage;
import com.aspire.guidewire.pc.pages.common.SubmissionManagerPage.ConfirmationLetter;
import com.aspire.guidewire.pc.pages.nonlob.SearchPoliciesPage;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CommercialAutoLine;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.SearchFor;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Vehicles;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;

public class CommercialAutoStepsImpl implements CommercialAutoSteps {

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
		new MySummaryPage(DriverManager.getDriver()).get();
		EnterAccountInformationPage enterAccountInformationPage = new HeaderPage(DriverManager.getDriver()).clickToggleAccountSubMenu(DriverManager.getDriver()).clickNewAccount(DriverManager.getDriver());
		enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), enterAccountInfo.getFirstName());
		enterAccountInformationPage.enterLastname(DriverManager.getDriver(), enterAccountInfo.getLastName());
		enterAccountInformationPage.clickSearch(DriverManager.getDriver());
		enterAccountInformationPage.clickCreateNewAccount(DriverManager.getDriver());
		String name = enterAccountInfo.getFirstName()+" "+enterAccountInfo.getLastName();
		Log.messageStep("Searched for account with First Name : " + enterAccountInfo.getFirstName() + " and Last Name : " + enterAccountInfo.getLastName(), DriverManager.getDriver());
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
			AccountSummaryPage accountSummaryPage = new AccountSummaryPage(DriverManager.getDriver()).get();
			accountNumberText = accountSummaryPage.getAccountNumberText(DriverManager.getDriver());
			Log.messageStep("Created new Person account with First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName(), DriverManager.getDriver());

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
		ActionsPage actionsPage = new MySummaryPage(DriverManager.getDriver()).get()
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
	 * @return CommercialAutoLinePage
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
			if(policyInfo.getPolicyEffectiveDate()!=null) policyInfoPage.enterDateQuoteNeeded(DriverManager.getDriver(), policyInfo.getPolicyEffectiveDate());
			if(policyInfo.getPolicyTerm()!= null) policyInfoPage.selectTermType(DriverManager.getDriver(), policyInfo.getPolicyTerm());
			if(policyInfo.getOrganizationType()!= null) policyInfoPage.selectOrganizationType(DriverManager.getDriver(), policyInfo.getOrganizationType());

			if(policyInfo.isAddSecondaryInsured()) { 
				policyInfoPage.clickAddNewSecondaryInsurer(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
			}
			if(policyInfo.isAddAdditionalInsured()) { 
				policyInfoPage.clickAddAdditionalInsured(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
			}
			policyInfoPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Information entered for date : " +policyInfo.getPolicyEffectiveDate() + " and policy term : " +policyInfo.getPolicyTerm(), DriverManager.getDriver());
		}
	}

	/**
	 * select Product and fleets
	 * Add Coverages
	 * Add Additional inusred
	 * click "next" button to navigate to next page
	 * @return LocationsPage 
	 */
	public void addCommercialAutoLineDetails(CommercialAutoLine commercialAutoLine) {
		CommercialAutoLinePage commercialAutoLinePage = new CommercialAutoLinePage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(commercialAutoLine).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(CommercialAutoLine.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			commercialAutoLinePage.clickNext(DriverManager.getDriver());
			Log.messageStep("Commercial Auto Line details processed",DriverManager.getDriver());
		}
		else {
			if(commercialAutoLine.getProduct()!=null)commercialAutoLinePage.selectProduct(DriverManager.getDriver(),commercialAutoLine.getProduct());
			if(commercialAutoLine.getFleet()!=null)commercialAutoLinePage.selectFleet(DriverManager.getDriver(), commercialAutoLine.getFleet());
			commercialAutoLinePage.clickAdditionalCoverages (DriverManager.getDriver());
			commercialAutoLinePage.clickAdditionalCoverage(DriverManager.getDriver());
			SearchCoveragesPage searchCoveragesPage = commercialAutoLinePage.new SearchCoveragesPage(DriverManager.getDriver()).get()
					.clickSearch(DriverManager.getDriver());
			searchCoveragesPage.clickLiabilityCoverage(DriverManager.getDriver());
			searchCoveragesPage.clickAddSelectedCoverages(DriverManager.getDriver());
			if(commercialAutoLine.getProduct()!=null)Log.messageStep("commercialAutoLinePage : " +commercialAutoLine.getProduct() + " and  fleet : " +commercialAutoLine.getFleet(), DriverManager.getDriver());

			if(commercialAutoLine.getAddCoverage()!=null) {
				commercialAutoLinePage.clickCoverages(DriverManager.getDriver());
				Coverages coverages = commercialAutoLine.getAddCoverage();
				commercialAutoLinePage.clickHiredAutoLiability(DriverManager.getDriver());
				commercialAutoLinePage.selectSelectState(DriverManager.getDriver(), coverages.getState());
				commercialAutoLinePage.clickAddState(DriverManager.getDriver());
				commercialAutoLinePage.enterCostOfHire(DriverManager.getDriver(), coverages.getCostOfHire());
				commercialAutoLinePage.clickHiredAutoCollision(DriverManager.getDriver());
				Log.messageStep("Commercial Auto Line  coverage added for State : " + coverages.getState(), DriverManager.getDriver());
			}

			if(commercialAutoLine.isAddAdditionalInsured()) { 
				commercialAutoLinePage.clickAdditionalInsuredTab(DriverManager.getDriver());
				commercialAutoLinePage.clickAdd(DriverManager.getDriver());
				addInsured(commercialAutoLine.getCreateInsured());
				Log.messageStep("Additional Insured is added successfully", DriverManager.getDriver());

			}
			commercialAutoLinePage.clickNext(DriverManager.getDriver());
			Log.messageStep("Commercial Auto Line details processed", DriverManager.getDriver());
		}
	}
	/**
	 * click "next" button to navigate to next page
	 * @return VehiclesPage
	 */
	@Override
	public void addLocations() {
		new LocationsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Default Location details added and processed",DriverManager.getDriver());
	}

	/**
	 * click Add button to add drivers
	 * Enter Driver Details
	 * Enter year of first licensed, firstName,addressLineOne ,dateOfBirth,state,
	 * city,zipCode,addressType,licenseNumber,licenseState
	 * numberOfAccidentsPolicyLevel,numberOfAccidentsAccountLevel,
	 * numberOfViolationsPolicyLevel,numberOfViolationsAccountLevel
	 * click "Next" button to navigate to next page
	 * @return VehiclesPage
	 */
	@Override
	public void addNewDriver(Drivers drivers) {
		DriversPage driversPage = new DriversPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(drivers).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(Drivers.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {			
			driversPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Driver details processed",DriverManager.getDriver());
		}
		else {
			driversPage.clickAdd(DriverManager.getDriver());
			DriverDetailsPage driverDetailsPage = driversPage.new DriverDetailsPage(DriverManager.getDriver()).get();
			driverDetailsPage.enterFirstname(DriverManager.getDriver(), drivers.getFirstName())
			.enterLastname(DriverManager.getDriver(), drivers.getLastName())
			.enterDateofBirth(DriverManager.getDriver(), drivers.getDateOfBirth())
			.selectLicenseState(DriverManager.getDriver(), drivers.getLicenseState()) 
			.enterLicense(DriverManager.getDriver(),drivers.getLicenseNumber())
			.clickOK(DriverManager.getDriver());
			driversPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Driver information entered with First Name: " + drivers.getFirstName() + " and Last Name: " + drivers.getLastName(), DriverManager.getDriver());
		}
	}

	/**
	 * click "next" button to navigate to next page
	 * @return DriversPagee
	 */
	@Override
	public void addStateInfo() {
		new StateInfoPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("State Info details processed",DriverManager.getDriver());
	}

	/**
	 * Enter Vehicle Details
	 * add vehicle from vehicles page
	 * Click CreateVehicle,vehiclecheckBox,Add,Person,chkboxPerson
	 * Select Vehicle type,State
	 * Enter VIN,cost vehicle
	 * click "Next" button to navigate to next page
	 * @return CoveragePage
	 */
	@Override
	public void addVehicle(Vehicles vehicleInfo) {
		new ActionsPage(DriverManager.getDriver()).clickVehicleScreen(DriverManager.getDriver());
		VehiclesPage vehiclesPage = new VehiclesPage(DriverManager.getDriver()).get();
		String inputParams = new GsonBuilder().create().toJsonTree(vehicleInfo).getAsJsonObject().toString();
		String defaultParams = new GsonBuilder().create().toJsonTree(Vehicles.builder().build()).getAsJsonObject().toString();
		if(inputParams.equals(defaultParams)) {
			vehiclesPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Vehicle details processed",DriverManager.getDriver());
		}
		else {
			if(vehicleInfo.isExistingVehiceDeletionStatus()) {
				vehiclesPage.clickVehicleDetailsCheckbox(DriverManager.getDriver())
				.clickRemoveVehicle(DriverManager.getDriver());
			}
			vehiclesPage.clickCreateVehicle(DriverManager.getDriver());
			VehiclesInformationPage vehiclesInformationPage = vehiclesPage.new VehiclesInformationPage(DriverManager.getDriver()).get();
			vehiclesInformationPage.selectGaragedat(DriverManager.getDriver());
			if(vehicleInfo.getVehicleType()!=null) vehiclesInformationPage.selectVehicleType(DriverManager.getDriver(), vehicleInfo.getVehicleType());
			if(vehicleInfo.getVIN()!=null) vehiclesInformationPage.enterVIN(DriverManager.getDriver(),vehicleInfo.getVIN());
			if(vehicleInfo.getCost()!=null) vehiclesInformationPage.enterCost(DriverManager.getDriver(), vehicleInfo.getCost());
			vehiclesInformationPage.clickMagnifierClassCode(DriverManager.getDriver());
			vehiclesInformationPage.clickSearch(DriverManager.getDriver());
			vehiclesInformationPage.clickSelect(DriverManager.getDriver());
			vehiclesInformationPage.clickOK(DriverManager.getDriver());
			vehiclesPage.clickNext(DriverManager.getDriver()); 
			Log.messageStep("New Vehicles with type of : " + vehicleInfo.getVehicleType()+" got selected",DriverManager.getDriver());
		}
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return ModifiersPage
	 */
	@Override
	public void addCoveredVehicles() {
		new CoveredVehiclesPage(DriverManager.getDriver()).get()
		.clickNext(DriverManager.getDriver());
		new ModifiersPage(DriverManager.getDriver()).get();
		Log.messageStep("Covered vehicles processed",DriverManager.getDriver());
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void addModifiersDetails() {
		new ModifiersPage(DriverManager.getDriver()).get().clickNext(DriverManager.getDriver());
		new RiskAnalysisPage(DriverManager.getDriver()).get();
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
			Log.messageStep("UW Issue is Created with Issue Type as " + riskAnalysis.getUWIssueType() + " and Approved the Issue" ,DriverManager.getDriver());
			break;
		case CONTINGENCY:
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickAddNewContigency(DriverManager.getDriver()).enterContingencyTitle(DriverManager.getDriver(),riskAnalysis.getContingencyTitle())
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
			.enterLossesInPastFiveYears(DriverManager.getDriver(), riskAnalysis.getLossPercent()).enterPriorLossTotalIncurred(DriverManager.getDriver(), riskAnalysis.getLossTotalIncurred())
			.clickAttachDocumentButton(DriverManager.getDriver()).documentAttachBeforeCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName()).selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getUploadDocumentStatus())
			.clickUploadDocumentButton(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
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
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver())
			.new NewContingencyPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver()).clickUploadDocumentLink(DriverManager.getDriver())
			.documentAttachAfterCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName()).selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentStatus())
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
	 * @return PolicyReviewPage
	 */
	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		PolicyReviewPage policyReviewPage = new PolicyReviewPage(DriverManager.getDriver());
		switch (policyreview.getPolicyReviewType())
		{
		case SUBMISSION:
			if(policyReviewPage.getQuoteButtonSize(DriverManager.getDriver()) == 1) {
				policyReviewPage.clickQuote(DriverManager.getDriver());
				new ActionsPage(DriverManager.getDriver()).clickCommercialAutoLine(DriverManager.getDriver());
				new PolicyReviewPage(DriverManager.getDriver()).get().clickQuote(DriverManager.getDriver());
			}
			else {
				policyReviewPage.clickNext(DriverManager.getDriver());
			}
			if(policyReviewPage.getNextButtonSize(DriverManager.getDriver()) == 1) {
				Log.messageStep("Policy Review page is processed",DriverManager.getDriver());
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
		case RENEW:
			policyReviewPage.clickEditPolicyTransaction(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Renew is processed",DriverManager.getDriver());
			break;
		case OUT_OF_SEQUENCE:
			policyReviewPage.clickChangeConflictTab(DriverManager.getDriver()).
			clickShouldOverrideNoRadioButton(DriverManager.getDriver()).clickSubmit(DriverManager.getDriver())
			.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy out of Sequence is processed",DriverManager.getDriver());
			break;
		case NONE:
			policyReviewPage.clickQuote(DriverManager.getDriver());
			Log.messageStep("Policy Review processed",DriverManager.getDriver());
		default:
			break;

		}
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return FormsPage
	 */
	@Override
	public void viewQuote() {
		new QuotePage(DriverManager.getDriver()).get();
		new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Quote page processed",DriverManager.getDriver());
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return PaymentsPage
	 */
	@Override
	public void viewForms() {
		new FormsPage(DriverManager.getDriver()).get();	
		new FormsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Forms page processed",DriverManager.getDriver());
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
			Log.messageStep("Policy Issued successfully for Bind Only ", DriverManager.getDriver());
			break;
		case SUBMISSION:
			new PaymentsPage(DriverManager.getDriver())
			.clickBindOptions(DriverManager.getDriver());
			new PaymentsPage(DriverManager.getDriver())
			.clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Issued successfully for Submission", DriverManager.getDriver());
			break;
		case POLICY_CHANGE:
			new PaymentsPage(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
			new PolicyBoundPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Issued successfully for Policy Change",DriverManager.getDriver());
			break;
		case REWRITE_FULL_TERM:
		case REWRITE_NEW_TERM:
		case REWRITE_REMAINDER_TERM:
			new PaymentsPage(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Issued successfully for "+transaction.toString(),DriverManager.getDriver());
			break;
		case RENEW_POLICY:	
			new PaymentsPage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver())
			.clickRenew(DriverManager.getDriver());
			new RenewalDataEntryPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Issued successfully for Renew Policy",DriverManager.getDriver());
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
		new PolicyBoundPage(DriverManager.getDriver()).get()
		.clickViewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on View policy Link",DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).get();
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
		new ConfirmationPage(DriverManager.getDriver()).get()
		.clickbindOptions(DriverManager.getDriver())
		.clickCancelNow(DriverManager.getDriver());
		Log.messageStep("Policy cancelled successfully for Refund Method : "+refundMethod,DriverManager.getDriver());
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
		Log.messageStep("Clicked on Rewrite Remainder Term link and process is Started",DriverManager.getDriver());
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
		StartPolicyChangePage startPolicyChangePage = new ActionsPage(DriverManager.getDriver()).get().clickActions(DriverManager.getDriver())
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
		Log.messageStep("Clicked on ReinstatePolicy and process has started",DriverManager.getDriver());
		new StartReinstatementPage(DriverManager.getDriver()).get()
		.selectReason(DriverManager.getDriver(), reinstatementReason.getReason())
		.clickQuote(DriverManager.getDriver());
		Log.messageStep("Clicked on Quote Button",DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickReinstate(DriverManager.getDriver());	
		Log.messageStep("Reinstate Policy is processed for Reason : " +reinstatementReason.getReason(),DriverManager.getDriver());
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
		Log.messageStep("Clicked on Rewrite Full Term link and Started Rewrite Full Term Process",DriverManager.getDriver());
	}

	/**
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
		.clickActions(DriverManager.getDriver()).clickPreRenewalDirection(DriverManager.getDriver());
		Log.messageStep("Clicked on Pre Renewal Direction and process has started", DriverManager.getDriver());
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
		Log.messageStep("Clicked on Renew policy and Process is started",DriverManager.getDriver());
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
	 * Verify out of sequence message in every page
	 * @param policyChange
	 */
	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
		new HeaderPage(DriverManager.getDriver())
		.verifyOutOfSequenceMessage(DriverManager.getDriver(), policyChange.getDate());
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
		Log.messageStep("Clicked on Copy Submission and Copy Submission Process is Started",DriverManager.getDriver());
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
		CreateNewAccountFromPerson createNewAccountFromPerson = null; // declare and initialize createNewAccountFromPerson to null

		switch(createAccountOption) {

		case PERSON:
			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());	
			EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
			createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; // set createNewAccountFromPerson inside the PERSON case

			if(createNewAccountFromPerson.isAddSecondaryInsured())
				new PolicyInfoPage(DriverManager.getDriver()).clickSecondaryInsuredForPerson(DriverManager.getDriver());

			if(createNewAccountFromPerson.isAddAdditionalInsured()) {
				CommercialAutoLinePage commercialAutoLinePage = new CommercialAutoLinePage(DriverManager.getDriver()).clickAddInsuredFromPerson(DriverManager.getDriver());

				NewAdditionalInsuredPage newAdditionalInsuredPage = commercialAutoLinePage.new NewAdditionalInsuredPage(DriverManager.getDriver());
				if(createNewAccountFromPerson.getInsuredType()!=null) newAdditionalInsuredPage.selectType(DriverManager.getDriver(), createNewAccountFromPerson.getInsuredType());
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
			Log.messageStep("Insured New person account created First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName(), DriverManager.getDriver());
			break;
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
	 * clicks Go to submission manager
	 * clicks create confirmation
	 * clicks Generate Confirmation
	 * Document had been generated
	 */
	@Override
	public void documentCreation(){
		SubmissionManagerPage SubmissionManagerPage = new PolicyBoundPage(DriverManager.getDriver())
				.clickSubmissionManager(DriverManager.getDriver());
		SubmissionManagerPage.clickCreateConfirmation(DriverManager.getDriver());
		Log.messageStep("Clicked on Create Confirmation", DriverManager.getDriver());
		ConfirmationLetter confirmationLetter = SubmissionManagerPage.new ConfirmationLetter(DriverManager.getDriver()).clickPolicyCheckbox(DriverManager.getDriver());
		confirmationLetter.clickGenerateConfirmation(DriverManager.getDriver());
		Log.messageStep("Clicked on generate Confirmation", DriverManager.getDriver());
		confirmationLetter.clickReturnToSubmissionManager(DriverManager.getDriver());
		confirmationLetter.clickTickMark(DriverManager.getDriver());
		Log.messageStep("Clicked on Sending confirmation", DriverManager.getDriver());
		AccountFileDocumentsPage accountFileDocumentsPage = new ActionsPage(DriverManager.getDriver()).clickDocuments(DriverManager.getDriver());
		accountFileDocumentsPage.verifyDocumentEntry(DriverManager.getDriver());
		Log.messageStep("Document had been processed",DriverManager.getDriver());
	}
	/**
	 * Click Quote Button
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
	public void searchSubmission(SearchFor searchFor) {
		new MySummaryPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver());
		new SearchPoliciesPage(DriverManager.getDriver())
		.selectSearchFor(DriverManager.getDriver(),searchFor.getSearchType())
		.enterSubmissionNumber(DriverManager.getDriver(),searchFor.getSubissionNumber())
		.clickSearch_14(DriverManager.getDriver())
		.clickSubmissionNo(DriverManager.getDriver());
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
				Log.messageStep("Handled UW Issue",DriverManager.getDriver());}
			catch(Exception e) {
				Log.messageStep("UW issues not happened", DriverManager.getDriver());
			}
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