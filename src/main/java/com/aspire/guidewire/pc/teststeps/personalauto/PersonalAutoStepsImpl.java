package com.aspire.guidewire.pc.teststeps.personalauto;

import java.io.IOException;

import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.ActionsPage;
import com.aspire.guidewire.pc.pages.common.CancellationPage;
import com.aspire.guidewire.pc.pages.common.ConfirmationPage;
import com.aspire.guidewire.pc.pages.common.CreateAccountPage;
import com.aspire.guidewire.pc.pages.common.DocumentPage;
import com.aspire.guidewire.pc.pages.common.EnterAccountInformationPage;
import com.aspire.guidewire.pc.pages.common.FormsPage;
import com.aspire.guidewire.pc.pages.common.HeaderPage;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.pc.pages.common.MySummaryPage;
import com.aspire.guidewire.pc.pages.common.NewAdditionalInterestPage;
import com.aspire.guidewire.pc.pages.common.NewDocumentPage;
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
import com.aspire.guidewire.pc.pages.common.RatingWorkSheetPage;
import com.aspire.guidewire.pc.pages.common.RenewalDataEntryPage;
import com.aspire.guidewire.pc.pages.common.RiskAnalysisPage;
import com.aspire.guidewire.pc.pages.common.SpinPolicyPage;
import com.aspire.guidewire.pc.pages.common.SplitPolicyPage;
import com.aspire.guidewire.pc.pages.common.StartPolicyChangePage;
import com.aspire.guidewire.pc.pages.common.StartReinstatementPage;
import com.aspire.guidewire.pc.pages.common.SubmissionDeclinedPage;
import com.aspire.guidewire.pc.pages.personalauto.CoveragePage;
import com.aspire.guidewire.pc.pages.personalauto.DriversPage;
import com.aspire.guidewire.pc.pages.personalauto.DriversPage.NewDriverPage;
import com.aspire.guidewire.pc.pages.personalauto.VehiclesPage;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.AdditionalInterest;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.AdditionalInterestFromOtherContacts;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.AdditionalInterestFromPerson;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.DownloadDocument;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PACoverage;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.SpinOff;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.SplitOff;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.UnderWriterIssue;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.UploadDocument;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Vehicles;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class PersonalAutoStepsImpl implements PersonalAutoSteps {

	private String pCWebSite;

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
		this.pCWebSite = DriverManager.getPCwebsite();
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), pCWebSite).get();
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
	public String searchAccount(EnterAccountInformation enterAccountInformation) {
		EnterAccountInformationPage enterAccountInformationPage = new HeaderPage(DriverManager.getDriver())
				.clickToggleAccountSubMenu(DriverManager.getDriver()).clickNewAccount(DriverManager.getDriver());
		enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), enterAccountInformation.getFirstName());
		enterAccountInformationPage.enterLastname(DriverManager.getDriver(), enterAccountInformation.getLastName());
		enterAccountInformationPage.clickSearch(DriverManager.getDriver());
		enterAccountInformationPage.clickCreateNewAccount(DriverManager.getDriver());
		String name = enterAccountInformation.getFirstName()+" "+enterAccountInformation.getLastName();
		Log.messageStep("Searched for account with First Name: " + enterAccountInformation.getFirstName() + " and Last Name: " + enterAccountInformation.getLastName(), DriverManager.getDriver());
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
		CreateNewAccountFromPerson createNewAccountFromPerson = null; // declare and initialize createNewAccountFromPerson to null
		switch(createAccountOption) {

		case PERSON:

			new EnterAccountInformationPage(DriverManager.getDriver()).get().clickPerson(DriverManager.getDriver());
			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());
			createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; // set createNewAccountFromPerson inside the PERSON case

			CreateAccountPage creatAccountPage = new CreateAccountPage(DriverManager.getDriver());
			if(createNewAccountFromPerson.getFirstName()!=null) creatAccountPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) creatAccountPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
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
		NewSubmissionsPage newSubmissionsPage = actionsPage.clickNewSubmissionAccount(DriverManager.getDriver());
		newSubmissionsPage.clickSelectBtn(DriverManager.getDriver(), productName.getName());
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
		JsonObject params = new GsonBuilder().create().toJsonTree(policyInfo).getAsJsonObject();
		if(params.toString().equals("{}")) {
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			policyInfoPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Policy Information Processed",DriverManager.getDriver());
		}
		else {
			new ActionsPage(DriverManager.getDriver()).clickPolicyInfoScreen(DriverManager.getDriver());
			PolicyInfoPage policyInfoPage = new PolicyInfoPage(DriverManager.getDriver());
			if(policyInfo.getPolicyEffectiveDate()!=null) policyInfoPage.enterDateQuoteNeeded(DriverManager.getDriver(), policyInfo.getPolicyEffectiveDate());
			if(policyInfo.getPolicyTerm()!=null) policyInfoPage.selectTermType(DriverManager.getDriver(), policyInfo.getPolicyTerm());
			if(policyInfo.isAddSecondaryInsured()) { 
				policyInfoPage.clickAddNewSecondaryInsurer(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
			}
			if(policyInfo.isAddAdditionalInsured()) { 
				policyInfoPage.clickAdd(DriverManager.getDriver());
				addInsured(policyInfo.getCreateInsured());
			}
			policyInfoPage.clickNext(DriverManager.getDriver());
			new DriversPage(DriverManager.getDriver()).get();
			Log.messageStep("Policy Information entered for date :" +policyInfo.getPolicyEffectiveDate() + " and policy term :" +policyInfo.getPolicyTerm(), DriverManager.getDriver());
		}
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
	public void addNewDriver(Drivers driverInfo) {
		switch(driverInfo.getUsertype()) {
		case NEW:
			new ActionsPage(DriverManager.getDriver()).clickDriversScreen(DriverManager.getDriver());
			DriversPage driversPage =new DriversPage(DriverManager.getDriver());
			driversPage.clickAdd(DriverManager.getDriver());
			NewDriverPage newDriverPage = driversPage.clickNewPerson(DriverManager.getDriver());

			newDriverPage.enterFirstname(DriverManager.getDriver(), driverInfo.getFirstName())
			.enterLastname(DriverManager.getDriver(), driverInfo.getLastName())
			.enterDateofBirth(DriverManager.getDriver(), driverInfo.getDateOfBirth())
			.enterAddress1(DriverManager.getDriver(), driverInfo.getAddressLineOne())
			.selectState(DriverManager.getDriver(),driverInfo.getState())
			.enterCity(DriverManager.getDriver(), driverInfo.getCity()) 
			.enterZIPCode(DriverManager.getDriver(), driverInfo.getZipCode())
			.selectAddressType(DriverManager.getDriver(), driverInfo.getAddressType())
			.selectLicenseState(DriverManager.getDriver(), driverInfo.getLicenseState()) 
			.enterLicense(DriverManager.getDriver(),driverInfo.getLicenseNumber());
			//Adding rated driver and excluded
			if(driverInfo.isGoodStudent()) newDriverPage.GoodStudentRadioButton(DriverManager.getDriver(),driverInfo.getRdbGoodStudent().getName());
			if(driverInfo.isApplyGoodDriverDiscount()) newDriverPage.ApplyGoodDriverDiscountRadioButton(DriverManager.getDriver(),driverInfo.getRdbApplyGoodDriverDiscount().getName());
			if(driverInfo.isQualifiesForGoodDriverDiscount()) newDriverPage.QualifiesForGoodDriverDiscountCheckBox(DriverManager.getDriver(),driverInfo.getRdbQualifiesForGoodDriverDiscount().getName());
			if(driverInfo.isExclude()) newDriverPage.excludedRadioButton(DriverManager.getDriver(), driverInfo.getRdbExclude().getName());
			newDriverPage.clickOK(DriverManager.getDriver());
			driversPage.clickRoles(DriverManager.getDriver())
			.selectNumberOfAccidentsAccountLevel(DriverManager.getDriver(), driverInfo.getNumberOfAccidentsAccountLevel())
			.selectNumberOfAccidentsPolicyLevel(DriverManager.getDriver(), driverInfo.getNumberOfAccidentsPolicyLevel())
			.selectNumberOfViolationsAccountLevel(DriverManager.getDriver(), driverInfo.getNumberOfViolationsAccountLevel())
			.selectNumberOfViolationsPolicyLevel(DriverManager.getDriver(), driverInfo.getNumberOfViolationsPolicyLevel());
			newDriverPage.enterYearFirstLicensed(DriverManager.getDriver(), driverInfo.getYearFirstLicensed());
			if(driverInfo.isMotorVehicleRecord())
				driversPage.clickDriverDetail(DriverManager.getDriver())
				.clickRetreive(DriverManager.getDriver());
			driversPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Driver information entered with First Name: " + driverInfo.getFirstName() + " and Last Name: " + driverInfo.getLastName(), DriverManager.getDriver());
			break;

		case REMOVE:
			new ActionsPage(DriverManager.getDriver()).clickDriversScreen(DriverManager.getDriver());
			new DriversPage(DriverManager.getDriver()).clickDriverChkBox(DriverManager.getDriver()).clickDriverRemoveButton(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new VehiclesPage(DriverManager.getDriver()).get();
			Log.messageStep("Driver information removed",DriverManager.getDriver());
			break;

		case NONE:
			new DriversPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new VehiclesPage(DriverManager.getDriver()).get();
			Log.messageStep("Driver information added",DriverManager.getDriver());
			break;

		case UPDATE:
			if(driverInfo.getLicenseState()!=null) 
				new DriversPage(DriverManager.getDriver())
				.clickContactDetails(DriverManager.getDriver())
				.selectLicenseState(DriverManager.getDriver(), driverInfo.getLicenseState());
			new DriversPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new VehiclesPage(DriverManager.getDriver()).get();
			Log.messageStep("Driver information updated",DriverManager.getDriver());
			break;
		default:
			break;		
		}
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
		new VehiclesPage(DriverManager.getDriver()).get();
		switch(vehicleInfo.getUserType()) {
		case NEW:
			new ActionsPage(DriverManager.getDriver()).clickVehicleScreen(DriverManager.getDriver());
			VehiclesPage vehiclesPage = new VehiclesPage(DriverManager.getDriver())
					.clickCreateVehicle(DriverManager.getDriver());
			if(vehicleInfo.getVehicleType()!=null) vehiclesPage.selectVehicleType(DriverManager.getDriver(), vehicleInfo.getVehicleType());
			if(vehicleInfo.getVIN()!=null) vehiclesPage.enterVIN(DriverManager.getDriver(),vehicleInfo.getVIN());
			if(vehicleInfo.isVintelligence()) {
				vehiclesPage.verifyModelYearAutoPopulated(DriverManager.getDriver())
				.verifyMakeAutoPopulated(DriverManager.getDriver())
				.verifyModelAutoPopulated(DriverManager.getDriver())
				.verifyColorAutoPopulated(DriverManager.getDriver());
				Log.messageStep("VIN Integaration fields autopopulation are Processed", DriverManager.getDriver());
			}
			vehiclesPage.clickAdd(DriverManager.getDriver()).clickPerson(DriverManager.getDriver());
			if(vehicleInfo.getState()!=null) vehiclesPage.selectLicenseState(DriverManager.getDriver(), vehicleInfo.getState());
			if(vehicleInfo.getCost()!=null) vehiclesPage.enterCostNew(DriverManager.getDriver(), vehicleInfo.getCost());
			new VehiclesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new CoveragePage(DriverManager.getDriver()).get();
			Log.messageStep("New Vehicles for type of: " + vehicleInfo.getVehicleType()+" got selected",DriverManager.getDriver());
			break;

		case EXISTING:
			VehiclesPage existing = new VehiclesPage(DriverManager.getDriver());
			if(vehicleInfo.getVehicleType()!=null) existing.selectVehicleType(DriverManager.getDriver(), vehicleInfo.getVehicleType());
			if(vehicleInfo.getVIN()!=null) existing.enterVIN(DriverManager.getDriver(),vehicleInfo.getVIN());
			if(vehicleInfo.getCost()!=null) existing.enterCostNew(DriverManager.getDriver(), vehicleInfo.getCost());
			if(vehicleInfo.getState()!=null) existing.selectLicenseState(DriverManager.getDriver(), vehicleInfo.getState());
			existing.clickNext(DriverManager.getDriver());
			new CoveragePage(DriverManager.getDriver()).get();
			Log.messageStep("Existing Vehicles processed",DriverManager.getDriver());
			break;

		case ASSIGN_DRIVERS:
			vehiclesPage = new VehiclesPage(DriverManager.getDriver())
			.clickAdd(DriverManager.getDriver())
			.clickPerson(DriverManager.getDriver())
			.clickchkboxPerson(DriverManager.getDriver())
			.enterPercentageFirstPerson(DriverManager.getDriver())
			.enterPercentageSecondPerson(DriverManager.getDriver());
			new VehiclesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new CoveragePage(DriverManager.getDriver()).get();
			Log.messageStep("Drivers got selected",DriverManager.getDriver());
			break;

		case REMOVE:
			new VehiclesPage(DriverManager.getDriver()).clickAddvehicleCheckBox(DriverManager.getDriver()).clickRemoveVehicle(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver());
			Log.messageStep("Vehicle got removed",DriverManager.getDriver());
			break;

		case NONE:
			new VehiclesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("New Vehicle added and Information entered",DriverManager.getDriver());
		default:
			break;
		}
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void addPACoverage(PACoverage paCoverage) {
		CoveragePage coveragePage=new CoveragePage(DriverManager.getDriver()).get();
		if(paCoverage.getComprehensiveCoverage()!=null) {
			coveragePage.selectComprehensiveDeductibleChangeChangePolicy(DriverManager.getDriver(), paCoverage.getComprehensiveCoverage());
			Log.messageStep("Comprehensive Coverage updated",DriverManager.getDriver());
		}
		if(paCoverage.getCollisionCoverage()!=null) {
			coveragePage.selectCollisionDeductibleChangePolicy(DriverManager.getDriver(), paCoverage.getCollisionCoverage());
			Log.messageStep("Collision Deductible Coverage updated",DriverManager.getDriver());
		}
		coveragePage.clickNext(DriverManager.getDriver());
		new RiskAnalysisPage(DriverManager.getDriver()).get();
		Log.messageStep("PA Coverages are added and processed",DriverManager.getDriver());
	}

	/**
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

		case CONTINGENCY:
			riskAnalysisPage.new NewContingencyPage(DriverManager.getDriver())
			.clickAddNewContigency(DriverManager.getDriver())
			.enterContingencyTitle(DriverManager.getDriver(),riskAnalysis.getContingencyTitle())
			.enterContingencyDescription(DriverManager.getDriver(),riskAnalysis.getContingencyDescription())
			.selectContingencyAction(DriverManager.getDriver(),riskAnalysis.getContingencyAction())
			.enterDateDueField(DriverManager.getDriver(),riskAnalysis.getContingencyDueDate())
			.clickOK(DriverManager.getDriver());
			riskAnalysisPage.clickNext(DriverManager.getDriver());
			Log.messageStep("Risk analysis Contigency details : " + riskAnalysis.getContingencyDescription() + " entered" ,DriverManager.getDriver());
			break;

		case ATTACH_DOCUMENT_CONTINGENCY_RESOLVE:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver())
			.new NewContingencyPage(DriverManager.getDriver()).get()
			.clickNewDocumentButton(DriverManager.getDriver()).clickUploadDocumentLink(DriverManager.getDriver())
			.documentAttachAfterCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName())
			.selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentStatus())
			.selectUploadDocumentType(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentType())
			.clickUploadDocumentButton(DriverManager.getDriver());
			riskAnalysisPage.clickResolve(DriverManager.getDriver());
			Log.messageStep("Risk analysis contigency document details :" + riskAnalysis.getDocumentName() + " attached and Resolved" ,DriverManager.getDriver());
			break;

		case ATTACH_DOCUMENT_CONTINGENCY:
			riskAnalysisPage.clickContingencies(DriverManager.getDriver()).clickContingencyTitle(DriverManager.getDriver())
			.new NewContingencyPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver()).clickUploadDocumentLink(DriverManager.getDriver())
			.documentAttachAfterCreation(DriverManager.getDriver(),riskAnalysis.getDocumentName()).selectUploadDocumentStatus(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentStatus())
			.selectUploadDocumentType(DriverManager.getDriver(), riskAnalysis.getContingencyDocumentType())
			.clickUploadDocumentButton(DriverManager.getDriver()).clickContingencyWaiveButton(DriverManager.getDriver());
			Log.messageStep("Risk analysis Contigency Document details :" + riskAnalysis.getDocumentName() + " attached" ,DriverManager.getDriver());
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
			Log.messageStep("Risk analysis Prior Policies details : " + riskAnalysis.getTotalLosses() + " attached" ,DriverManager.getDriver());
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
			break;
		case UW_ISSUE :
			new PaymentsPage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
			Log.messageStep("Policy Informations processed",DriverManager.getDriver());
			break;
		default:
			break;
		}
		Log.messageStep("Policy Informations processed",DriverManager.getDriver());
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
	 * Used to click view policy in Policy bound page
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
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickRewriteFullTermPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Rewrite Full Term link",DriverManager.getDriver());
	}

	/**
	 * Clicks on Actions
	 * Used to click on Rewrite New Term transaction
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
		Log.messageStep("Clicked on Pre Renewal Direction link for : " +preRenewalDirection.getDirection() + " Direction",DriverManager.getDriver());
	}

	/**
	 * Click Actions menu
	 * click Renew button
	 */
	@Override
	public void policyRenew() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickRenewPolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Renewed Successfully",DriverManager.getDriver());
	}

	/**
	 * Click "Action" Button
	 * select RenewalCode from RenewalCode dropdown
	 * Click "Ok" Button
	 * returns RenewalDataEntryPage
	 */
	@Override
	public void policyRenewal(RenewPolicy renewPolicy) {
		new RenewalDataEntryPage(DriverManager.getDriver()).selectRenewalCode(DriverManager.getDriver(),renewPolicy.getRenewalcode())
		.clickOk(DriverManager.getDriver());;
		Log.messageStep("Clicked on Renewed : " +renewPolicy.getRenewalcode()+ " successfully",DriverManager.getDriver());
	}

	/**
	 * Clicks on Actions
	 * Click on Split Policy
	 * Enter the account number one which we created
	 * Enter the account number two which we created
	 * Click Create Submission Button
	 * @param SplitOff
	 */
	@Override
	public void splitOffPolicy(SplitOff splitOff) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickSplitPolicy(DriverManager.getDriver());
		SplitPolicyPage splitPolicyPage = new SplitPolicyPage(DriverManager.getDriver())
				.enterAccountNumber(DriverManager.getDriver(), splitOff.getAccountNumber1());
		splitPolicyPage.enterAccountNumber_1(DriverManager.getDriver(),splitOff.getAccountNumber2())
		.clickCreateSubmissions(DriverManager.getDriver());
		Log.messageStep("Clicked on splitoff Policy Successfully",DriverManager.getDriver());
	}

	/**
	 * Clicks on Actions
	 * Click on Spin-off
	 * Enter the account number which we created
	 * Click Search Icon for account number
	 * Click create submission button
	 * @param SpinOff
	 */
	@Override
	public void spinOffPolicy(SpinOff spinOff){
		SpinPolicyPage spinPolicyPage = new ActionsPage(DriverManager.getDriver())
				.clickActions(DriverManager.getDriver())
				.clickSpinOffPolicy(DriverManager.getDriver());
		spinPolicyPage.enterAccountNumber(DriverManager.getDriver(), spinOff.getAccountNumber())
		.clickCreateSubmission(DriverManager.getDriver());
		Log.messageStep("Clicked on spinoff Policy Successfully",DriverManager.getDriver());
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
	 * Click MotorVehicleTab
	 * Click Renew 
	 * Verify the records
	 * returns Risk Analysis Page
	 */
	@Override
	public void motorvehicleRecords() {
		new RiskAnalysisPage(DriverManager.getDriver())
		.clickMotorVehileRecord(DriverManager.getDriver())
		.clickReportDetails(DriverManager.getDriver())
		.clickReturnPage(DriverManager.getDriver());
		Log.messageStep("Vehicle records processed",DriverManager.getDriver());
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
	 * click Additional Interest Tab
	 * click Additional Intrest Add Button
	 * move to other Contacts
	 * click Additional Interest Add Button and clicks on 0ther contacts and clicks on additional user
	 * Select the interest type for person1
	 * click next button to navigate to next page
	 * @param createNewAccountFromPerson
	 */
	@Override
	public void addAdditionalInterestInVehicles(AdditionalInterest additionalInterest) {
		CreateAccountOptions  createAccountOption = additionalInterest.getCreateAccountPreference();
		switch(createAccountOption) {

		case PERSON:

			AdditionalInterestFromPerson additionalInterestFromPerson = (AdditionalInterestFromPerson)additionalInterest;
			new ActionsPage(DriverManager.getDriver()).clickVehicleScreen(DriverManager.getDriver());
			new VehiclesPage(DriverManager.getDriver()).clickAdditionalIntrestTab(DriverManager.getDriver()).clickAdd_1(DriverManager.getDriver())
			.movetoNewPerson(DriverManager.getDriver());
			CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());
			NewAdditionalInterestPage additionalInterestPage=new NewAdditionalInterestPage(DriverManager.getDriver());
			additionalInterestPage.selectInterestType(DriverManager.getDriver(), additionalInterestFromPerson.getInterestType().getName());

			new EnterAccountInformationPage(DriverManager.getDriver()).enterFirstname(DriverManager.getDriver(), additionalInterestFromPerson.getFirstName())
			.enterLastname(DriverManager.getDriver(), additionalInterestFromPerson.getLastName());
			createAccountPage.enterAddress1(DriverManager.getDriver(),  additionalInterestFromPerson.getAddressLine1())
			.selectState(DriverManager.getDriver(), additionalInterestFromPerson.getState())
			.enterCity(DriverManager.getDriver(), additionalInterestFromPerson.getCity())
			.enterCity(DriverManager.getDriver(), additionalInterestFromPerson.getZipCode())
			.selectAddressType(DriverManager.getDriver(), additionalInterestFromPerson.getAddressType())
			.clickUpdate(DriverManager.getDriver());

			new VehiclesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver()); 
			new CoveragePage(DriverManager.getDriver()).get();
			Log.messageStep("Additional Interest in vehicles First Name: " + additionalInterestFromPerson.getFirstName() + " and Last Name: " + additionalInterestFromPerson.getLastName()+ (" entered "), DriverManager.getDriver());

		case COMPANY:
			//yet to implement
			break;

		case FROM_ADDRESS_BOOK:
			//yet to implement

		case OTHER_CONTACTS:

			AdditionalInterestFromOtherContacts additionalInterestFromOtherContacts = (AdditionalInterestFromOtherContacts)additionalInterest;
			new ActionsPage(DriverManager.getDriver())
			.clickVehicleScreen(DriverManager.getDriver());
			new VehiclesPage(DriverManager.getDriver())
			.clickAdditionalIntrestTab(DriverManager.getDriver())
			.clickAdd_1(DriverManager.getDriver())
			.movetoOtherContacts(DriverManager.getDriver())
			.clickAdditionalIntrestOtherContact(DriverManager.getDriver(), additionalInterestFromOtherContacts.getInsuredName());		
			VehiclesPage vehiclesPage = new VehiclesPage(DriverManager.getDriver());
			if(additionalInterestFromOtherContacts.getInterestType1()!=null) vehiclesPage.selectInterestTypePerson1(DriverManager.getDriver(), additionalInterestFromOtherContacts.getInterestType1().getName());
			if(additionalInterestFromOtherContacts.getInterestType2()!=null) vehiclesPage.selectInterestTypePerson2(DriverManager.getDriver(), additionalInterestFromOtherContacts.getInterestType2().getName());
			new VehiclesPage(DriverManager.getDriver())
			.clickNext(DriverManager.getDriver()); 
			new CoveragePage(DriverManager.getDriver()).get();
			Log.messageStep("Additional Interest in vehicles Interest type: " + additionalInterestFromOtherContacts.getInterestType1() + " and Interest type: " +additionalInterestFromOtherContacts.getInterestType2()+ (" entered "), DriverManager.getDriver());

		}
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
	 * Used to click on Details
	 * click Approve Button
	 * Click ok button after verifying the fields
	 */
	@Override
	public void approvedUWIssues(UnderWriterIssue underWriterIssue) { 
		if(BrowserActions.waitForElementToDisplay(DriverManager.getDriver(), new PaymentsPage(DriverManager.getDriver()).lblUWIssueMsg,5)){
			RiskAnalysisPage riskAnalysisPage = new RiskAnalysisPage(DriverManager.getDriver())
					.clickDetails(DriverManager.getDriver())
					.clickApprove(DriverManager.getDriver())
					.clickOK(DriverManager.getDriver());
			//Handling the uw issue Alert
			if(underWriterIssue.isUwIssueAlert()) {
				riskAnalysisPage.clickHandleuWIssueAlert(DriverManager.getDriver());
			}
			riskAnalysisPage.clickNext(DriverManager.getDriver());
		}
		Log.messageStep("Approved UW Issue",DriverManager.getDriver());
	}

	/**
	 * Verify Error Message Expected Actual ErrorMessage
	 * @return ExpectedErrorMessage
	 */
	@Override
	public void verifyErrorMessage(String expectedActualErrorMessage) {
		String actualErrorMessage = new HeaderPage(DriverManager.getDriver()).getErrorMessage(DriverManager.getDriver());
		Log.assertThat(actualErrorMessage.equals(expectedActualErrorMessage), "Error message displayed successfully: "+actualErrorMessage, 
				"Actual error message: "+actualErrorMessage+" is not matching with expected: "+expectedActualErrorMessage, DriverManager.getDriver());
	}

	/**
	 * Click on Next Button 
	 * Returns Forms Page
	 */
	@Override
	public void viewQuote() {
		new QuotePage(DriverManager.getDriver()).get();	
		new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("quote page details verified",DriverManager.getDriver());
	}

	/**
	 * Click NewDocument Button
	 * Click on Upload Document button
	 * Attach the required document
	 * Select the Status
	 * Select the Upload Document type
	 * Click Update button
	 */
	@Override
	public void uploadDocument(UploadDocument uploadDocument) {
		new ActionsPage(DriverManager.getDriver())
		.clickActions(DriverManager.getDriver())
		.clickNewDocumentButton(DriverManager.getDriver())
		.clickUploadDocuments(DriverManager.getDriver());
		new NewDocumentPage(DriverManager.getDriver())
		.documentAttach(DriverManager.getDriver(), uploadDocument.getDocumentName())
		.selectStatus(DriverManager.getDriver(), uploadDocument.getStatus())
		.selectUploadDocumentType(DriverManager.getDriver(), uploadDocument.getDocumentType())
		.clickUpdateButton(DriverManager.getDriver());
		Log.messageStep("Upload the Document with Status as "+uploadDocument.getStatus()+"and Document type as "+uploadDocument.getDocumentType(),DriverManager.getDriver());
	}

	/**
	 * Click on Document Button
	 * Click Download Button
	 * Verify Downloaded Document
	 * @throws InterruptedException 
	 */
	public void verifyDownloadDocument(DownloadDocument downloadDocument) throws IOException, InterruptedException {
		new ActionsPage(DriverManager.getDriver())
		.clickDocument(DriverManager.getDriver());
		new DocumentPage(DriverManager.getDriver())
		.clickDownload(DriverManager.getDriver())
		.verifyDownloadedDocument(DriverManager.getDriver(),downloadDocument.getFilename());
		Log.messageStep("Downloaded file Name : "+downloadDocument.getFilename(),DriverManager.getDriver());
	}

	/**
	 * Click on ShowRatingWorksheet Button
	 * Click on LiablityBodilyToggle Button
	 * verify Coverage Are Display
	 * verify Coverage Factor Value are display
	 * click Vehicle Type Value are display
	 * verify UWcompany Actual Value are display
	 * verify Multi car Discount Value
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
			//verify Coverages Are Displayed
			RatingWorkSheetPage ratingWorkSheetPage = new RatingWorkSheetPage(DriverManager.getDriver()).get();
			ratingWorkSheetPage.verifyBodilyInjuryandPropertyDamage(DriverManager.getDriver(),rate.getCoverage1(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyUninuredMotoristBodilyInjury(DriverManager.getDriver(),rate.getCoverage2(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyMexicoCoverage(DriverManager.getDriver(), rate.getCoverage3(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyMedicalPayments(DriverManager.getDriver(), rate.getCoverage4(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.verifyUninuredMotoristBodilyInjury(DriverManager.getDriver(), rate.getCoverage5(),rate.getEffectiveDate() ,rate.getExpirationDate())
			.clickLiablityBodilyToggle(DriverManager.getDriver())
			.verifyCoverageFactorValue(DriverManager.getDriver(),rate.getFactorVal())
			.verifyVehicleTypeValue(DriverManager.getDriver(), rate.getVehicleTypeValue())
			.verifyUWcompanyActualValue(DriverManager.getDriver(), rate.getUwValue())
			.verifyMulticarDiscountValue(DriverManager.getDriver(), rate.getMultiCarDiscountValue());
			// Rating Process
			ratingWorkSheetPage.clickDownloadDrpIcon(DriverManager.getDriver())
			.clickOptionHTML(DriverManager.getDriver())
			.verifyIsFileDownloaded(DriverManager.getDriver(), rate.getFileName());
			Log.messageStep("Bodily Injury and Property Damage,Uninured Motorist Bodily Injury Coverage, Mexico Coverage , MedicalPayments and Uninured Motorist Bodily Injury Coverages of Personal Auto were Displayed",DriverManager.getDriver());
			Log.messageStep("Viewed Rating WorkSheet contains UW value as : "+rate.getUwValue()+" and Actual Value Form Factor : "+rate.getFactorVal()+" and MutiCarDiscountValue : "+rate.getMultiCarDiscountValue(),DriverManager.getDriver());
		}
		else {
			new QuotePage(DriverManager.getDriver()).get();
			new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			Log.messageStep("Quote page details processed",DriverManager.getDriver());
		}
	}

	/**
	 * Used to complete the Policy Trasaction
	 * Click on completed transaction ID
	 * Click on "Risk Analysis" Screen
	 */
	@Override
	public void completedPolicyTransactions() {
		new PolicySummaryPage(DriverManager.getDriver()).clickCompletedTransactionId(DriverManager.getDriver());
		new ActionsPage(DriverManager.getDriver()).clickRiskAnalysisScreen(DriverManager.getDriver());
		Log.messageStep("Risk Analysis Page processed",DriverManager.getDriver());

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
		new OfferingsPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());

	}

	/**
	 * Used to get PolicyNumber in Policy Bound Page
	 * Click on "View Policy"
	 * get the "Policy No" using text method
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