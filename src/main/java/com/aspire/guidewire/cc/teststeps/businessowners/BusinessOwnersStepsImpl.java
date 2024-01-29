package com.aspire.guidewire.cc.teststeps.businessowners;

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
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.NewDocumentPage;
import com.aspire.guidewire.cc.pages.common.NewExposurePage;
import com.aspire.guidewire.cc.pages.common.NewPropertyIncidentPage;
import com.aspire.guidewire.cc.pages.common.ReopenClaimPage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.ServicesPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.SearchClaim;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class BusinessOwnersStepsImpl implements BusinessOwnersSteps {

	private String CCwebSite;

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
		this.CCwebSite = DriverManager.getCCWebsite();
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), CCwebSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		new ActivitiesPage(DriverManager.getDriver()).get();
		Log.messageStep("Logged into the Application",DriverManager.getDriver());
	}

	/**
	 * clicks on "Claim"
	 * clicks on "New claim"
	 */
	@Override
	public void createClaim(){
		new HeaderPage(DriverManager.getDriver()).clicktoggleClaimSubMenu(DriverManager.getDriver()).clickNewClaim(DriverManager.getDriver());
		Log.messageStep("New claim initiated",DriverManager.getDriver());
	}
	/**
	 * Enters "policy number"
	 * clicks on "search"
	 * Enters "LossDate"
	 * clicks on next
	 * @param searchPolicy
	 * @return insured name
	 */
	@Override
	public String searchPolicy(Searchpolicy searchPolicy) {
		SearchOrCreatePolicyPage SearchOrCreatePolicyPage = new SearchOrCreatePolicyPage(DriverManager.getDriver()).get();
		SearchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo()).clickSearch(DriverManager.getDriver())
		.enterLossDate(DriverManager.getDriver(), searchPolicy.getLossDate());
		String insuredName = SearchOrCreatePolicyPage.getInsuredName(DriverManager.getDriver());
		SearchOrCreatePolicyPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Entered policy number"+ searchPolicy.getPolicyNo()+"processed for new claim",DriverManager.getDriver());
		return insuredName;
	}
	/**
	 * Selects "insured name"
	 * Selects "Relation to insured"
	 * clicks on next
	 * @param basicInfo
	 */
	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {
		BasicInformationPage basicInformationPage = new BasicInformationPage(DriverManager.getDriver()).get().selectName(DriverManager.getDriver(), basicInfo.getInsuredName());
		if(basicInfo.getRelationToInsured()!=null) basicInformationPage.selectRelationtoInsured(DriverManager.getDriver(), basicInfo.getRelationToInsured());
		basicInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Basic Information Insured Name : "+basicInfo.getInsuredName()+" and Relation to Insured : "+ basicInfo.getRelationToInsured()+" is entered",DriverManager.getDriver());
	}
	/**
	 * Selects "loss cause"
	 * Enters city 
	 * Selects State 
	 * Adds property damage
	 * @param claimInfo
	 */
	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver())
				.selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause())
				.clickPrimaryLocation(DriverManager.getDriver());
		addClaimInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep(" Add Claim Information are Processed",DriverManager.getDriver());
	}
	
	/**
	 * Clicks on next
	 * returns SaveAndAssignClaimPage
	 */
	@Override
	public void addServices() {
		new ServicesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Add Services are Processed",DriverManager.getDriver());
	}
	
	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
	 * @return 
	 */
	@Override
	public String saveAndAssignClaim() {
		new SaveAndAssignClaimPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
		Log.messageStep("Save and Assign Claim are Processed",DriverManager.getDriver());
		NewClaimSavedPage newClaimSavedPage = new NewClaimSavedPage(DriverManager.getDriver()).get();
		String claimNumber = newClaimSavedPage.getClaimNumber(DriverManager.getDriver());
		return claimNumber;
	}
	
	/**
	 * clicks on "Go to claim"
	 * returns SummaryPage
	 */
	@Override
	public void viewClaim() {
		new NewClaimSavedPage(DriverManager.getDriver()).clickGoToClaim(DriverManager.getDriver());
		Log.messageStep("Clicked on created claim view link",DriverManager.getDriver());
	}
	
	/**
	 * clicks on "Action"
	 * clicks on choose by coverage Type
	 * clicks coverage type "M,L"
	 * clicks on coverage
	 * Create Exposure for Liability or MoneyAndSecurities
	 * @param ChooseCoveragesByType
	 */
	@Override
	public void addCoveragesByType(ChooseCoveragesByType chooseCovearges) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverageType(DriverManager.getDriver());
		switch(chooseCovearges.getCoverages()) {

		case COVERAGE_M:
			actionsPage.moveToM(DriverManager.getDriver());
			actionsPage.clickMoneyAndSecuritiesCoverageType(DriverManager.getDriver());
			Coverage coverage = chooseCovearges.getCoverage_M().getMoneyAndSecurities();
			if (chooseCovearges.getCoverage_M().getMoneyAndSecurities()!=null) {
				new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(),coverage.getClaimant())
				.selectType(DriverManager.getDriver(),coverage.getClaimantType())
				.clickUpdate(DriverManager.getDriver());
			}
			break;

		case COVERAGE_L:
			actionsPage.moveToL(DriverManager.getDriver()).moveLiability(DriverManager.getDriver()).clickLiabilityPD(DriverManager.getDriver());
			Coverage coverages = chooseCovearges.getCoverage_L().getLiability().getLiability_PD();
			if (chooseCovearges.getCoverage_L().getLiability().getLiability_PD()!=null) {
				NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
				newExposurePage.clickClaimant_PickerMenuIcon(DriverManager.getDriver())
				.clickNewPerson(DriverManager.getDriver());
		        addContactInformation(chooseCovearges.getContactDetails());
				if(coverages.getClaimant()!= null) newExposurePage.selectClaimant(DriverManager.getDriver(),coverages.getClaimant());
				if(coverages.getClaimantType()!=null) newExposurePage.selectType(DriverManager.getDriver(),coverages.getClaimantType());
				newExposurePage.clickIncidentMenuIcon(DriverManager.getDriver());
				newExposurePage.clickNewIncident(DriverManager.getDriver());
				new NewPropertyIncidentPage(DriverManager.getDriver()).selectPropertyName(DriverManager.getDriver()).clickOK(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).clickUpdate(DriverManager.getDriver());
			}
			break;
		default:
			break;	
		}
		Log.messageStep("Coverage : "+chooseCovearges.getCoverages()+" initiated",DriverManager.getDriver());
	}

	/**
	* Used to Add the Coverages Using "Add Coverage"
	* Click on "Action" 
	* Move to "ChooseByCoverage" 
	* Move to "Policy Level Coverage"
	* Click "Special Coverage"
	* Select "Claimant" and "Claimant Type"
	* Click on "Update"
	*/
	@Override
	public void addCoverages(ChooseCoverages chooseCoverages) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverage(DriverManager.getDriver());
		actionsPage.moveToPolicyLevelCoverage(DriverManager.getDriver());
		actionsPage.clickSpecialCoveragePackages(DriverManager.getDriver());
		Coverage coverage = chooseCoverages.getSpecialCoveragePackages();
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
		newExposurePage.clickClaimant_PickerMenuIcon(DriverManager.getDriver())
		.clickNewPerson(DriverManager.getDriver());
        addContactInformation(chooseCoverages.getContactDetails());
		if(coverage.getClaimant()!= null) newExposurePage.selectClaimant(DriverManager.getDriver(),coverage.getClaimant());
		if(coverage.getClaimantType()!=null) newExposurePage.selectType(DriverManager.getDriver(),coverage.getClaimantType());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Coverage : "+chooseCoverages.getCoverages()+" created",DriverManager.getDriver());
	}
	
	/**
	 * clicks on "Action"
	 * clicks on "Note"
	 * Enters text
	 * Clicks on update
	 * @param createNote
	 */
	@Override
	public void createNote(CreateNote createNote) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickNote(DriverManager.getDriver())
		.enterText(DriverManager.getDriver(), createNote.getText()).clickUpdate(DriverManager.getDriver());
		Log.messageStep("Entered notes details and created",DriverManager.getDriver());

	}

	/**
	 * clicks on "Action"
	 * move to "Other"
	 * select Payment options
	 * @param createNote
	 */
	@Override
	public void paymentChecks(PaymentOptions paymentOptions) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());
		switch(paymentOptions.getPaymentType()) {
		case RECOVERY:
			actionsPage.clickActions(DriverManager.getDriver());
			actionsPage.moveToOther(DriverManager.getDriver());
			actionsPage.moveToOther(DriverManager.getDriver());
			actionsPage.clickRecovery(DriverManager.getDriver());
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
			actionsPage.clickActions(DriverManager.getDriver());
			actionsPage.moveToOther(DriverManager.getDriver());
			actionsPage.moveToOther(DriverManager.getDriver());
			actionsPage.clickManualCheck(DriverManager.getDriver());
			EnterPayeeInformationPage enterPayeeinformation = new EnterPayeeInformationPage(DriverManager.getDriver());
			enterPayeeinformation.selectName(DriverManager.getDriver());
			enterPayeeinformation.clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver())
			.selectReserveLine(DriverManager.getDriver())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectPaymentType(DriverManager.getDriver(), paymentOptions.getPayment())
			.enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;
		case TRANSFER_CHECK:
			actionsPage.clickWorkPlan(DriverManager.getDriver());
			new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver()).clickComplete(DriverManager.getDriver());
			actionsPage.clickFinancialsChecks(DriverManager.getDriver());
			new FinancialsChecksPage(DriverManager.getDriver()).clickAmount(DriverManager.getDriver());
			new CheckDetailsPage(DriverManager.getDriver()).clickTransfer(DriverManager.getDriver());
			TransferCheckPage transferCheckPage = new TransferCheckPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver());
			new SearchClaimsPage(DriverManager.getDriver()).enterClaim(DriverManager.getDriver(), paymentOptions.getClaimNumber())
			.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver());
			transferCheckPage.clickTransfer(DriverManager.getDriver());
			break;
		default:
			break;	
		}
		Log.messageStep("Payments Type: "+paymentOptions.getPaymentType()+" is Processed",DriverManager.getDriver());
	}
	
	/**
	 * clicks on "Actions"
	 * clicks on  Assign
	 * choose radio button "select form list","Search by location","Search by Distance from location"
	 * selects country if needed
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
		Log.messageStep("Assign claim: "+assignClaim.getAssignType()+" is Assigned",DriverManager.getDriver());

	}
	
	/**
	 * clicks on "Create Reserve"
	 * select "Exposure" from exposure dropdown
	 * select "ReserveCostType" from ReserveCostType dropdown
	 * select "ReserveCostCategory" from ReserveCostCategory dropdown
	 * Enter "Amount" in Amount field
	 * Clicked on "save"
	 * @param reserve
	 */
	@Override
	public void createReserve(Reserve reserve) {
		new ExposuresPage(DriverManager.getDriver(),2).clickExposureCheckbox(DriverManager.getDriver());
		new ExposuresPage(DriverManager.getDriver()).clickCreateReserve(DriverManager.getDriver());
		new EditReservesPage(DriverManager.getDriver()).selectExposure(DriverManager.getDriver())
		.selectReserveCostType(DriverManager.getDriver(),reserve.getCostType() )
		.selectReserveCostCategory(DriverManager.getDriver(), reserve.getCostCategory())
		.enterReserveAmount(DriverManager.getDriver(), reserve.getNewAvailableReserves())
		.clickSave(DriverManager.getDriver());
		Log.messageStep("Reserve created Successfully",DriverManager.getDriver());

	}

	/**
	 * clicks on "Action"
	 * clicks on "Service"
	 * Select "RequestType" from RequestType drop down
	 * Select "ServiceAddress" from ServiceAddress drop down
	 * Clicked "Add" Button
	 * Clicked on "service" 
	 * Clicked on "Ok" Button
	 * Enter contact information details
	 * Clicked on "Submit"
	 * @param serviceDetails
	 */
	@Override
	public void addClaimService(ServiceDetails serviceDetails) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickService(DriverManager.getDriver());
		SelectServiceToAddPage selectServiceToAddPage = new SelectServiceToAddPage(DriverManager.getDriver());
		AddServicePage addServicePage = new AddServicePage(DriverManager.getDriver()).selectRequestType(DriverManager.getDriver(), serviceDetails.getRequestType())
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
		case "TOWING":
			selectServiceToAddPage.clickTowing(DriverManager.getDriver());
			break;
		}
		selectServiceToAddPage.clickOK(DriverManager.getDriver());
		new AddServicePage(DriverManager.getDriver()).clickSpecialistMenuIcon(DriverManager.getDriver()).moveToNewVendor(DriverManager.getDriver()).clickVendorPerson(DriverManager.getDriver());
		addContactInformation(serviceDetails.getContactDetails());
		addServicePage.clickSubmit(DriverManager.getDriver());
		Log.messageStep(serviceDetails.getService()+" service is added successfully",DriverManager.getDriver());
	}

	/**
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
	}

	/**
	 * Navigate to Document Page page from action menu by clicking New Document button
	 * select respective button to Create from template claim ,upload Document and indicate Existence of a DocumentClaim
	 * To create a document and verify it in document page
	 */
	@Override
	public void addNewDocumentClaim(ChooseDocumentsByType chooseDocumentsByType) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());

		switch(chooseDocumentsByType.getDocumentType()) {

		case INDICATE_EXISTENCE:
			if(chooseDocumentsByType.getIndicateExistence().isNewDocument()) {
				new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			}
			new ActionsPage(DriverManager.getDriver()).clickIndicateExistenceDocument(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver()).enterName(DriverManager.getDriver(),chooseDocumentsByType.getIndicateExistence().getName())
			.selectStatus(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getStatus()).selectDocumentType(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getDocumentType())
			.clickUpdateButton(DriverManager.getDriver());
			break;
		default:
			break;
		}
		Log.messageStep("New Claim Document is created",DriverManager.getDriver());
	}

	/**
	 * Navigate to Documents Page
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */
	@Override
	public void reOpenClaim(ReOpenClaim reOpenClaim) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());
		actionsPage.clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver());
		actionsPage.clickExposure(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickCloseClaim(DriverManager.getDriver());
		new CloseClaimPage(DriverManager.getDriver()).enterNote(DriverManager.getDriver(),reOpenClaim.getNote())
		.selectOutcome(DriverManager.getDriver(),reOpenClaim.getOutcome()).clickCloseClaim(DriverManager.getDriver()).clickSummary(DriverManager.getDriver()).clickStatus(DriverManager.getDriver())
		.VerifyStatus(DriverManager.getDriver(), reOpenClaim.getClosedStatus());
		actionsPage.clickActions(DriverManager.getDriver()).clickReopenClaim(DriverManager.getDriver());
		new ReopenClaimPage(DriverManager.getDriver()).enterNote(DriverManager.getDriver(),reOpenClaim.getNote()).selectReason(DriverManager.getDriver(),reOpenClaim.getReason())
		.clickReopenClaim(DriverManager.getDriver()).clickSummary(DriverManager.getDriver()).clickStatus(DriverManager.getDriver())
		.VerifyStatus(DriverManager.getDriver(), reOpenClaim.getOpenStatus());
		Log.messageStep("Claim closed and reopened the closed claim successfully",DriverManager.getDriver());
	}
	
	/**
	 * Navigate to Work plan page clear all the data
	 * Navigate to Exposure Page enter "Note" in note field and select outcome reason
	 * Click close exposure
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */
	@Override
	public void updateExposure(ExposureDetails exposureDetails) {
		new ActionsPage(DriverManager.getDriver()).clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver());
		new ActionsPage(DriverManager.getDriver()).clickExposure(DriverManager.getDriver());

		if (exposureDetails.getExposureValue().equalsIgnoreCase("Closed")) {
			new ExposuresPage(DriverManager.getDriver()).clickCheckBoxExposure(DriverManager.getDriver()).clickCloseExposure(DriverManager.getDriver())
			.enterNote(DriverManager.getDriver(),exposureDetails.getNote()).selectOutcome(DriverManager.getDriver(), exposureDetails.getOutcome())
			.clickCloseExposure(DriverManager.getDriver()).verifyStatus(DriverManager.getDriver(), exposureDetails.getExposureValue());
		}
		if (exposureDetails.getTypeValue().equals("Open")) {
			new ExposuresPage(DriverManager.getDriver()).clickType(DriverManager.getDriver()).clickReopenExposure(DriverManager.getDriver())
			.enterNote(DriverManager.getDriver(),exposureDetails.getNote()).selectReason(DriverManager.getDriver(), exposureDetails.getReason())
			.clickReopenExposure(DriverManager.getDriver()).clickupToExposure(DriverManager.getDriver())
			.verifyStatus(DriverManager.getDriver(), exposureDetails.getTypeValue());
		}
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