package com.aspire.guidewire.cc.teststeps.inlandmarine;

import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage;
import com.aspire.guidewire.cc.pages.common.AddServicePage;
import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.cc.pages.common.BasicInformationPage;
import com.aspire.guidewire.cc.pages.common.CheckDetailsPage;
import com.aspire.guidewire.cc.pages.common.CloseClaimPage;
import com.aspire.guidewire.cc.pages.common.ContactInformationPage;
import com.aspire.guidewire.cc.pages.common.CreateRecoveryPage;
import com.aspire.guidewire.cc.pages.common.EditReservesPage;
import com.aspire.guidewire.cc.pages.common.EnterPayeeInformationPage;
import com.aspire.guidewire.cc.pages.common.EnterPaymentInformationPage;
import com.aspire.guidewire.cc.pages.common.ExposuresPage;
import com.aspire.guidewire.cc.pages.common.FinancialsChecksPage;
import com.aspire.guidewire.cc.pages.common.FinancialsSummaryPage;
import com.aspire.guidewire.cc.pages.common.FinancialsTransactionsPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.NewDocumentPage;
import com.aspire.guidewire.cc.pages.common.NewExposurePage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.ServicesPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.StatusPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.WorkPlanDataUnavailability;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class InlandMarineStepsImpl implements InlandMarineSteps {

	private String CCwebSite;

	/**
	 * Used to login to the CC Application
	 * Enter "User name" in the User name Field 
	 * Enter "Password" in the Password Field 
	 * Click "Login" Button
	 * Login to application with valid credentials
	 * @param username
	 * @param password
	 */
	@Override
	public void loginIntoTheApplication(String username, String password) {
		this.CCwebSite = DriverManager.getCCWebsite();
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), CCwebSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		new ActivitiesPage(DriverManager.getDriver()).get();
		Log.messageStep("Logged into the Application",DriverManager.getDriver());
	}

	/**
	 * Used to initiate a New Claim
	 * Click on toggle "ClaimSubMenu"
	 * Click on "New Claim"
	 */
	@Override
	public void createClaim(){
		new HeaderPage(DriverManager.getDriver())
		.clicktoggleClaimSubMenu(DriverManager.getDriver())
		.clickNewClaim(DriverManager.getDriver());
		Log.messageStep("New Claim Initiated",DriverManager.getDriver());
	}

	/**
	 * Used to Search Policy
	 * Enter "Policy No"
	 * Enter "Loss Date" as current date
	 * Enter "Insured Name"
	 * Click on "next" button to navigate to next page
	 * @param searchPolicy
	 * @return BasicInformationPage
	 */
	@Override
	public String searchPolicy(Searchpolicy searchPolicy) {
		SearchOrCreatePolicyPage SearchOrCreatePolicyPage = new SearchOrCreatePolicyPage(DriverManager.getDriver()).get();
		SearchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo())
		.clickSearch(DriverManager.getDriver())
		.enterLossDate(DriverManager.getDriver(), searchPolicy.getLossDate());
		String insuredName = SearchOrCreatePolicyPage.getInsuredName(DriverManager.getDriver());
		SearchOrCreatePolicyPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Search Policy Processed",DriverManager.getDriver());
		return insuredName;
	}

	/**
	 * Used to enter the Basic Informations
	 * Select "Insured Name"
	 * Select "Relation to Insured"
	 * Click on "next" button to navigate to next page
	 * @param basicInfo
	 */
	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {
		BasicInformationPage basicInformationPage = new BasicInformationPage(DriverManager.getDriver()).get()
				.selectName(DriverManager.getDriver(), basicInfo.getInsuredName());
		if(basicInfo.getRelationToInsured()!=null) basicInformationPage
		.selectRelationtoInsured(DriverManager.getDriver(), basicInfo.getRelationToInsured());
		basicInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Basic Information Insured Name : "+basicInfo.getInsuredName()+" and Relation to Insured : "+ basicInfo.getRelationToInsured()+" is entered",DriverManager.getDriver());
	}

	/**
	 * Used to add Claim Information 
	 * Select "Loss Cause"
	 * Enter "City"
	 * Select "State"
	 * Click on "next" button to navigate to next page
	 * @param claimInfo
	 */
	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver()).get()
				.selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause())
				.selectFaultRating(DriverManager.getDriver(), claimInfo.getFaultRating())
				.enterCity(DriverManager.getDriver(), claimInfo.getCity())
				.selectState(DriverManager.getDriver(), claimInfo.getState());
		addClaimInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep(" Add Claim Information are Processed",DriverManager.getDriver());

	}

	/**
	 * Used to Add Services
	 * Click on "next" button to navigate to next page
	 */
	@Override
	public void addServices() {
		new ServicesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Add Services are Processed",DriverManager.getDriver());
	}

	/**
	 * Used to save and assign the Claim
	 * Click on "Finish" button to complete the claim creation
	 * Click on "next" button to navigate to next page
	 */
	@Override
	public String saveAndAssignClaim() {
		new SaveAndAssignClaimPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
		Log.messageStep("New claim saved and assigned successsfully",DriverManager.getDriver());
		NewClaimSavedPage newClaimSavedPage = new NewClaimSavedPage(DriverManager.getDriver()).get();
		String claimNumber = newClaimSavedPage.getClaimNumber(DriverManager.getDriver());
		Log.messageStep("Viewed Created Claim: "+claimNumber,DriverManager.getDriver());
		return claimNumber;
	}

	/**
	 * Used to View Created Claim
	 * Click "GoToClaim" link too view Claim
	 */
	@Override
	public void viewClaim() {
		NewClaimSavedPage newClaimSavedPage = new NewClaimSavedPage(DriverManager.getDriver()).get();
		newClaimSavedPage.clickGoToClaim(DriverManager.getDriver());
		Log.messageStep(" View Claim are Processed",DriverManager.getDriver());
	}

	/**
	 * Used to add Coverage By Types
	 * Move to "Coverage By Type"
	 * Click on particular "Coverage"
	 * @param ChooseCovearges
	 */
	@Override
	public void addCoveragesByType(ChooseCoveragesByType chooseCovearges) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).get()
				.clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverageType(DriverManager.getDriver());
		switch(chooseCovearges.getCoverageName().toUpperCase()) {
		case "PRESERVATION OF PROPERTY":
			actionsPage.clickPreservationOfProperty(DriverManager.getDriver());
			break;
		case "ADDITIONALLY ACQUIRED PROPERTY":
			actionsPage.clickAdditionallyAcquiredProperty(DriverManager.getDriver());
			break;
		case "RENTAL REIMBURSEMENT":
			actionsPage.clickRentalReimbursement(DriverManager.getDriver());
			break;
		}
		createNewExposure(chooseCovearges.getCoverageByType());
		Log.messageStep("Coverage By Type is Initiated ",DriverManager.getDriver());
	}

	/**
	 * Used to add Coverage By Types
	 * Move to "Coverage By Type"
	 * Click on particular "Coverage"
	 * @param ChooseCovearges
	 */
	@Override
	public void addCoverages(ChooseCoverages chooseCoverages) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver())
				.clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverage(DriverManager.getDriver());
		switch(chooseCoverages.getCoverages()) {
		case POLICY_LEVEL_COVERAGES:
			actionsPage.moveToPolicyLevelCoverage(DriverManager.getDriver());
			if (chooseCoverages.getPolicy_Level_Coverage().getRented_Equipment()!=null) {
				actionsPage.clickToRentedEquipmentCoverage(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
				.clickNewPerson(DriverManager.getDriver());
				addContactInformation(chooseCoverages.getContactDetails());
				createNewExposure(chooseCoverages.getPolicy_Level_Coverage().getRented_Equipment());
			}
			break;

		case UL_CLASS_A:
			actionsPage.moveToUlClassA(DriverManager.getDriver());
			if(chooseCoverages.getUl_Class_A().getAccounts_Receivable()!=null) {
				actionsPage.clickAccountsReceivable(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
				.clickNewPerson(DriverManager.getDriver());
				addContactInformation(chooseCoverages.getContactDetails());
				createNewExposure(chooseCoverages.getUl_Class_A().getAccounts_Receivable());
			}
			break;	
		case ONE_NULL:
			// yet to implement
			break;
		}
		Log.messageStep("Coverage : "+chooseCoverages.getCoverages()+" initiated",DriverManager.getDriver());
	}

	/**
	 * Used to Add new Exposure
	 * Select "Claimant"
	 * Select "Claimant Type"
	 * Click on "Update" 
	 * @param Coverage
	 */
	@Override
	public void createNewExposure(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
		if(Coverage.getClaimant()!=null) newExposurePage.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant());
		if(Coverage.getClaimantType()!=null) newExposurePage.selectType(DriverManager.getDriver(), Coverage.getClaimantType());
		newExposurePage.enterDamageDescription(DriverManager.getDriver(), Coverage.getDamageDescription());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("New Exposure is created",DriverManager.getDriver());
	}

	/**
	 * Used to create a Notes
	 * Click on "Action"
	 * Click on "Notes"
	 * Enter "text"
	 * Click on "Update"
	 * @param createNote
	 */
	@Override
	public void createNote(CreateNote createNote) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickNote(DriverManager.getDriver())
		.enterText(DriverManager.getDriver(), createNote.getText())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Notes Created",DriverManager.getDriver());
	}

	/**
	 * Used to Add Payments Checks Ootions
	 * Click on "Action"
	 * Mouse over on "Other"
	 * Click on "Payment option"
	 * Select "Payer","Reserve Line","Cost Type","Recovery category" and "Cost category"
	 * Enter "Amount"
	 * Click on "Update"
	 * @param PaymentOptions
	 */
	@Override
	public void paymentChecks(PaymentOptions paymentOptions) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());
		switch(paymentOptions.getPaymentType()) {
		case RECOVERY:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.clickRecovery(DriverManager.getDriver());
			new CreateRecoveryPage(DriverManager.getDriver())
			.selectPayer(DriverManager.getDriver())
			.selectReserveLine(DriverManager.getDriver(),paymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCostCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectRecoveryCategory(DriverManager.getDriver(), paymentOptions.getRecoveryCategory())
			.enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickUpdate(DriverManager.getDriver());
			break;
		case MANUAL_CHECK:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.clickManualCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver())
			.selectName(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver())
			.selectReserveLine(DriverManager.getDriver(),paymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectPaymentType(DriverManager.getDriver(), paymentOptions.getPayment()).
			enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;

		case MET_CHECK:
			new ActionsPage(DriverManager.getDriver()).clickSummary(DriverManager.getDriver());
			new FinancialsSummaryPage(DriverManager.getDriver()).clickFinancialMenuIcon(DriverManager.getDriver())
			.clickCreateCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;

		case TRANSFER_CHECK:
			actionsPage.clickWorkPlan(DriverManager.getDriver());
			new WorkplanPage(DriverManager.getDriver())
			.clickCheckBoxWorkplan(DriverManager.getDriver()).clickComplete(DriverManager.getDriver());
			actionsPage.clickFinancialsChecks(DriverManager.getDriver());
			new FinancialsChecksPage(DriverManager.getDriver()).clickAmount(DriverManager.getDriver());
			new CheckDetailsPage(DriverManager.getDriver()).clickTransfer(DriverManager.getDriver());
			TransferCheckPage transferCheckPage = new TransferCheckPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver());
			new SearchClaimsPage(DriverManager.getDriver()).enterClaim(DriverManager.getDriver(), paymentOptions.getClaimNumber())
			.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver());
			transferCheckPage.clickTransfer(DriverManager.getDriver());
			break;

		}
		Log.messageStep("Payments Type: "+paymentOptions.getPaymentType()+" is Processed",DriverManager.getDriver());
	}

	/**
	 *  ** REUSABLE METHOD **
	 * Enter "FirstName" in First name Field
	 * Enter "LastName" in Last name Field
	 * Enter "Name" in  Name Field
	 * Enter "Address" in  Address Field
	 * Enter "TaxIdSSN" in TaxIdSSN Field
	 * Enter "TaxId" in TaxId Field
	 * select "State" from State drop down
	 * Enter "City" in City Field
	 * Enter "Roles" in Roles Field
	 * Clicked on "Add" Button
	 * select "Roles" from Roles drop down
	 * Clicked on "Update" Button
	 * @param contactDetails
	 */
	public void addContactInformation(ContactDetails contactDetails) {
		ContactInformationPage newAutoRepairShop = new ContactInformationPage(DriverManager.getDriver());
		if(contactDetails.getFirstName()!=null) newAutoRepairShop.enterFirstname(DriverManager.getDriver(),contactDetails.getFirstName());
		if(contactDetails.getLastName()!=null) newAutoRepairShop.enterLastname(DriverManager.getDriver(), contactDetails.getLastName());
		if(contactDetails.getName()!=null) newAutoRepairShop.enterName(DriverManager.getDriver(),contactDetails.getName());
		if(contactDetails.getAddress()!=null)newAutoRepairShop.enterAddress1(DriverManager.getDriver(),contactDetails.getAddress());
		if(contactDetails.getTaxIdSSN()!=null) newAutoRepairShop.enterSSN(DriverManager.getDriver(),contactDetails.getTaxIdSSN());
		if(contactDetails.getTaxId()!=null) newAutoRepairShop.enterTaxIDEIN(DriverManager.getDriver(),contactDetails.getTaxId());
		if(contactDetails.getCity()!=null) newAutoRepairShop.enterCity(DriverManager.getDriver(),contactDetails.getCity());
		if(contactDetails.getState()!=null) newAutoRepairShop.selectState(DriverManager.getDriver(),contactDetails.getState());
		if(contactDetails.getRoles()!=null) {
			newAutoRepairShop.clickAdd(DriverManager.getDriver());
			newAutoRepairShop.selectRoles(DriverManager.getDriver(), contactDetails.getRoles());
		}
		newAutoRepairShop.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Contact Information are Processed",DriverManager.getDriver());
	}

	/**
	 * Used to add Claim Services
	 * Click on "Action"
	 * Click on "Services"
	 * Select "Request Type" and "Service Address"
	 * Click on "Add" button
	 * Click on "Services check box"
	 * Click on "OK" button
	 * Click on "Submit".
	 * @param serviceDetails
	 */
	@Override
	public void addClaimService(ServiceDetails serviceDetails) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickService(DriverManager.getDriver());
		SelectServiceToAddPage selectServiceToAddPage = new SelectServiceToAddPage(DriverManager.getDriver());
		AddServicePage addServicePage = new AddServicePage(DriverManager.getDriver())
				.selectRequestType(DriverManager.getDriver(), serviceDetails.getRequestType())
				.selectServiceAddress(DriverManager.getDriver())
				.clickAdd(DriverManager.getDriver());
		switch(serviceDetails.getService().toUpperCase().trim()) {
		case "KITCHEN_APPLIANCES":
			selectServiceToAddPage.clickKitchenAppliance(DriverManager.getDriver());
			break;
		case "APPRAISAL":
			selectServiceToAddPage.clickAppraisal(DriverManager.getDriver());
			break;
		case "AUDIO_EQUIPMENT":
			selectServiceToAddPage.clickAudioEquipment(DriverManager.getDriver());
			break;
		case "AUTO_BODY":
			selectServiceToAddPage.clickAutoBody(DriverManager.getDriver());
			break;
		case "GLASS":
			selectServiceToAddPage.clickGlass(DriverManager.getDriver());
			break;
		case "PROVIDE_COURTESY_CAR":
			selectServiceToAddPage.clickProvideCourtesyCar(DriverManager.getDriver());
			break;
		case "ROADSIDE_ASSISTANCE":
			selectServiceToAddPage.clickRoadSideAssistance(DriverManager.getDriver());
			break;
		case "SALVAGE":
			selectServiceToAddPage.clickSalvage(DriverManager.getDriver());
			break;
		case "TOWING":
			selectServiceToAddPage.clickTowing(DriverManager.getDriver());
			break;

		case "ROADSIDE_ASSISTANCE_SALVAGE":
			selectServiceToAddPage.clickRoadSideAssistance(DriverManager.getDriver());
			selectServiceToAddPage.clickSalvage(DriverManager.getDriver());
			break;
		}
		selectServiceToAddPage.clickOK(DriverManager.getDriver());
		new AddServicePage(DriverManager.getDriver()).clickSpecialistMenuIcon(DriverManager.getDriver()).moveToNewVendor(DriverManager.getDriver()).clickVendorPerson(DriverManager.getDriver());
		addContactInformation(serviceDetails.getContactDetails());
		addServicePage.clickSubmit(DriverManager.getDriver());
		Log.messageStep("Claim Services are Processed",DriverManager.getDriver());
	}

	/**
	 * Used to Create Reserve
	 * Click on the "Exposure check box"
	 * Click on the "Create Reserve" Button
	 * Select "Reserve Cost"
	 * Select "Reserve Category"
	 * Enter "Reserve Amount"
	 * Click on "Save"
	 * Verify Created Reserve.
	 * @param reserve
	 */
	@Override
	public void createReserve(Reserve reserve) {
		new ExposuresPage(DriverManager.getDriver(),2).clickExposureCheckbox(DriverManager.getDriver());
		new ExposuresPage(DriverManager.getDriver()).clickCreateReserve(DriverManager.getDriver());
		new EditReservesPage(DriverManager.getDriver()).selectExposure(DriverManager.getDriver())
		.selectReserveCostType(DriverManager.getDriver(),reserve.getCostType() )
		.selectReserveCostCategory(DriverManager.getDriver(), reserve.getReserveCostCategory())
		.enterReserveAmount(DriverManager.getDriver(), reserve.getReserveAmount())
		.clickSave(DriverManager.getDriver());
		new FinancialsTransactionsPage(DriverManager.getDriver()).get()
		.verifyReserveCreated(DriverManager.getDriver(),reserve.getCoverageByType());
		Log.messageStep("Reserve is created and verified",DriverManager.getDriver());
	}

	/**
	 * Used to Add Documents in Claim
	 * Navigate to Document Page page from action menu by clicking New Document button
	 * select respective button to Create from template claim 
	 * upload Document and indicate Existence of a DocumentClaim
	 * To create a document and verify it in document page
	 */
	@Override
	public void newDocumentClaim(ChooseDocumentsByType chooseDocumentsByType) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		switch(chooseDocumentsByType.getDocumentType()) {
		case INDICATE_EXISTENCE:
			if(chooseDocumentsByType.getIndicateExistence().isNewDocument()) {
				new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			}
			new ActionsPage(DriverManager.getDriver()).clickIndicateExistenceDocument(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver())
			.enterName(DriverManager.getDriver(),chooseDocumentsByType.getIndicateExistence().getName())
			.selectStatus(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getStatus())
			.selectDocumentType(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getDocumentType())
			.clickUpdateButton(DriverManager.getDriver());
			break;

		default:
			break;
		}
		Log.messageStep("New claim Document is Updated",DriverManager.getDriver());
	}

	/**
	 * Used to assign the Claim
	 * Click on "Actions" 
	 * Select "Assign Type"
	 * Click on "Assign" button
	 * @param assignClaim
	 */
	@Override
	public void assignClaim(AssignClaim assignClaim) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickAssignClaim(DriverManager.getDriver());
		AssignPage assignpage = new AssignPage(DriverManager.getDriver());

		switch(assignClaim.getAssignType()) {

		case SELECT_FROM_LIST:
			assignpage.clickSelectFromList(DriverManager.getDriver())
			.clickAssign(DriverManager.getDriver());
			break;

		case SEARCH_BY_LOCATION:
			assignpage.clickSearchbyLocation(DriverManager.getDriver())
			.selectCountry(DriverManager.getDriver(), assignClaim.getLocation())
			.clickSearch(DriverManager.getDriver())
			.clickSelect(DriverManager.getDriver());
			break;

		case SEARCH_BY_DISTANCE_FROM_LOCATION:
			assignpage.clickSearchbyDistanceFromLocation(DriverManager.getDriver())
			.clickSearch(DriverManager.getDriver())
			.clickSelect(DriverManager.getDriver());
			break;
		}	
		Log.messageStep("Assign Claim is completed for "+assignClaim.getAssignType(),DriverManager.getDriver());
	}

	@Override
	public void verifyWorkPlanDataUnavailability(WorkPlanDataUnavailability workPlanDataUnavailability) {
		new ActionsPage(DriverManager.getDriver()).get().clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).get().clickCheckBoxWorkplan(DriverManager.getDriver())
		.verifyNoDataMessage(DriverManager.getDriver(), workPlanDataUnavailability.getDataMessage());
		Log.messageStep("Verified "+workPlanDataUnavailability.getDataMessage()+" Message in WorkPlan Page",DriverManager.getDriver());	

	}

	@Override
	public void closeClaim(CloseClaim closeClaim) {

		new ActionsPage(DriverManager.getDriver()).clickExposure(DriverManager.getDriver());
		new ExposuresPage(DriverManager.getDriver()).get()
		.verifyNoDataMessage(DriverManager.getDriver(), closeClaim.getDataMessage());
		Log.messageStep("Verified "+closeClaim.getDataMessage()+" Message in Exposure Page",DriverManager.getDriver());

		new ActionsPage(DriverManager.getDriver()).get().clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).get().clickCheckBoxWorkplan(DriverManager.getDriver())
		.verifyNoDataMessage(DriverManager.getDriver(), closeClaim.getDataMessage());
		Log.messageStep("Verified "+closeClaim.getDataMessage()+" Message in WorkPlan Page",DriverManager.getDriver());	

		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).get()
		.clickCloseClaim(DriverManager.getDriver());
		CloseClaimPage closeClaimPage = new CloseClaimPage(DriverManager.getDriver()).get()
				.enterNote(DriverManager.getDriver(),closeClaim.getNote())
				.selectOutcome(DriverManager.getDriver(),closeClaim.getOutcome())
				.clickCloseClaim(DriverManager.getDriver())
				.clickSummary(DriverManager.getDriver())
				.clickStatus(DriverManager.getDriver());
		new StatusPage(DriverManager.getDriver()).get();
		closeClaimPage   .VerifyStatus(DriverManager.getDriver(), closeClaim.getClosedStatus());
		Log.messageStep("Claim Closed is Processed ",DriverManager.getDriver());
	}

	/**
	 * Click Claim toggle menu
	 * Enter "claimnumber" in search 
	 * Click search button
	 * Get insured name
	 */
	@Override
	public String searchClaim(SearchClaim searchClaim) {
		new ActionsPage(DriverManager.getDriver())
		.clickClaimToggleMenu(DriverManager.getDriver())
		.enterClaimNumber(DriverManager.getDriver(), searchClaim.getClaimNo())
		.clickSearchClaim(DriverManager.getDriver());

		String result = new HeaderPage(DriverManager.getDriver())
				.getInsureName(DriverManager.getDriver());
		String[] split = result.split(":\n");
		String insuredName = split[1].trim();
		return insuredName;
	}

}