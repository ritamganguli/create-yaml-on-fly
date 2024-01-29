package com.aspire.guidewire.cc.teststeps.commercialproperty;

import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage;
import com.aspire.guidewire.cc.pages.common.AddServicePage;
import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.cc.pages.common.BasicInformationPage;
import com.aspire.guidewire.cc.pages.common.CheckDetailsPage;
import com.aspire.guidewire.cc.pages.common.ContactInformationPage;
import com.aspire.guidewire.cc.pages.common.CreateRecoveryPage;
import com.aspire.guidewire.cc.pages.common.DocumentPage;
import com.aspire.guidewire.cc.pages.common.EditReservesPage;
import com.aspire.guidewire.cc.pages.common.EmailPage;
import com.aspire.guidewire.cc.pages.common.EnterPayeeInformationPage;
import com.aspire.guidewire.cc.pages.common.EnterPaymentInformationPage;
import com.aspire.guidewire.cc.pages.common.ExposuresPage;
import com.aspire.guidewire.cc.pages.common.FinancialsChecksPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.NewDocumentPage;
import com.aspire.guidewire.cc.pages.common.NewExposurePage;
import com.aspire.guidewire.cc.pages.common.NewPropertyIncidentPage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectInvolvedPolicyPropertiesPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.ServicesPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ServiceDetails;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class CommercialPropertyStepsImpl implements CommercialPropertySteps {

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
		Log.messageStep("New Claim Initiated",DriverManager.getDriver());
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
		SearchOrCreatePolicyPage searchOrCreatePolicyPage = new SearchOrCreatePolicyPage(DriverManager.getDriver()).get();
		searchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo())
		.clickSearch(DriverManager.getDriver())
		.enterLossDate(DriverManager.getDriver(), searchPolicy.getLossDate());
		String insuredName = searchOrCreatePolicyPage.getInsuredName(DriverManager.getDriver());
		searchOrCreatePolicyPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Searching with policy number"+searchPolicy.getPolicyNo()+"to create a claim"+insuredName,DriverManager.getDriver());
		return insuredName;
	}

	/**
	 * Click Property Selected Check Box
	 * Click Next Button
	 */
	@Override
	public void updateInvolvedPolicyProperties() {
		new	SelectInvolvedPolicyPropertiesPage(DriverManager.getDriver()).clickSelected(DriverManager.getDriver())
		.clickNext(DriverManager.getDriver());
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
		Log.messageStep("Basic Information Insured Name : "+basicInfo.getInsuredName()+ "is entered",DriverManager.getDriver());
	}

	/**
	 * Select "Loss of cause"
	 * Select "location"
	 * Select state and enter city
	 * CLick on Next 
	 * @param claimInfo
	 */
	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver())
				.selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause())
				.selectState(DriverManager.getDriver(), claimInfo.getState())
				.enterCity(DriverManager.getDriver(), claimInfo.getCity());
		addClaimInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep("All Claim Information Like Loss cause as :"+claimInfo.getLossCause()+" State and City were Entered",DriverManager.getDriver());

	}

	/**
	 * Clicks on next
	 * returns SaveAndAssignClaimPage
	 */
	@Override
	public void addServices() {
		new ServicesPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		Log.messageStep("Requried services are added and requested",DriverManager.getDriver());
	}

	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
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
	 * clicks on "Go to claim"
	 * getting the created claim number
	 * returns claimNumber
	 */
	@Override
	public void viewClaim() {
		NewClaimSavedPage newClaimSavedPage = new NewClaimSavedPage(DriverManager.getDriver()).get();
		String claimNumber = newClaimSavedPage.getClaimNumber(DriverManager.getDriver());
		newClaimSavedPage.clickGoToClaim(DriverManager.getDriver());
		Log.messageStep("Created claim id is "+ claimNumber +" viewed created claim",DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * clicks on choose by coverage Type
	 * clicks coverage type "BUSINESS_PERSONAL_PROPERTY_SEPARATION OF STOCK,EXTRA_EXPENSE_COVERAGE"
	 * clicks on coverage
	 * Create Exposure for Business personal property separation of stock or Extra expense coverage
	 * @param ChooseCoveragesByType
	 */
	@Override
	public void addCoveragesByType(ChooseCoveragesByType chooseCovearges) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverageType(DriverManager.getDriver());
		switch(chooseCovearges.getCoverages()) {

		case BUSINESS_PERSONAL_PROPERTY_SEPARATIONOFSTOCK:
			actionsPage.clickBusinessPersonalPropertyStock(DriverManager.getDriver());
			Coverage coverages = chooseCovearges.getBusinessPersonalPropertyStock();
			NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver())
					.selectClaimant(DriverManager.getDriver(), coverages.getClaimant())
					.selectType(DriverManager.getDriver(), coverages.getClaimantType());
			createExposureIncident(coverages);
			newExposurePage.clickUpdate(DriverManager.getDriver());
			break;

		case EXTRA_EXPENSE_COVERAGE:
			actionsPage.clickBusinessExtraExpenseCoverage(DriverManager.getDriver());
			Coverage coverage = chooseCovearges.getExtraExpenseCoverage();
			NewExposurePage newExposurePages = new NewExposurePage(DriverManager.getDriver())
					.selectClaimant(DriverManager.getDriver(), coverage.getClaimant())
					.selectType(DriverManager.getDriver(), coverage.getClaimantType())
					.selectLoaction(DriverManager.getDriver());	
			newExposurePages.clickUpdate(DriverManager.getDriver());
			break;
		case BUSINESS_PERSONAL_PROPERTY_COVERAGE:
			coverages = chooseCovearges.getBusinessPersonalPropertyCoverage();
			actionsPage.clickBusinessPersonalPropertyCoverage(DriverManager.getDriver());
			new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), coverages.getClaimant())
			.selectType(DriverManager.getDriver(), coverages.getClaimantType()).clickIncidentMenuIcon(DriverManager.getDriver())
			.clickNewIncident(DriverManager.getDriver());
			new NewExposurePage(DriverManager.getDriver()).new NewPropertyIncidentExposurePage(DriverManager.getDriver())
			.enterDamageDescription(DriverManager.getDriver(), coverages.getDescription()).clickOK(DriverManager.getDriver());
			new NewExposurePage(DriverManager.getDriver()).clickUpdate(DriverManager.getDriver());
			Log.messageStep("Business personal property coverage packages is added",DriverManager.getDriver());
			break;
		default:
			break;
		}
	}

	/**
	 * ** REUSABLE METHOD **
	 * clicking Incident menu icon and clicking "new incident" Button
	 * Enter Damage Description and click on "Ok" Button
	 * @param coverage
	 */
	public void createExposureIncident(Coverage coverage){
		new NewExposurePage(DriverManager.getDriver())
		.clickIncidentMenuIcon(DriverManager.getDriver())
		.clickNewIncident(DriverManager.getDriver());
		NewPropertyIncidentPage newPropertyIncidentPage = new NewPropertyIncidentPage(DriverManager.getDriver());
		if(coverage.getDescription()!=null) 
			newPropertyIncidentPage.enterDamageDescription(DriverManager.getDriver(), coverage.getDescription())
			.clickOK(DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * clicks on choose by coverage 
	 * clicks on Buildings address
	 * clicks coverage type "BUSINESS_COVERAGE,BUSINESS_PERSONAL_PROPERTY_COVERAGE"
	 * clicks on coverage
	 * Create Exposure for Business coverage or business personal property coverage
	 * Enter exposure details : Select claimant and claimant type 
	 * Click update button
	 * @param chooseCoverages
	 */
	@Override
	public void addCoverages(ChooseCoverages chooseCoverages) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverage(DriverManager.getDriver());
		actionsPage.moveToPolicyLevelCoverage(DriverManager.getDriver());
		actionsPage.clickBuildingAddressDetails(DriverManager.getDriver());
		switch(chooseCoverages.getCoverages()) {

		case BUSINESS_COVERAGE:
			Coverage coverage = chooseCoverages.getBusinessCoverage();
			if (chooseCoverages.getBusinessCoverage()!=null) {
				actionsPage.clickBusinessCoverage(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
				.clickNewPerson(DriverManager.getDriver());
				addContactInformation(chooseCoverages.getContactDetails());
				NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
				if(coverage.getClaimant()!=null) newExposurePage.selectClaimant(DriverManager.getDriver(), coverage.getClaimant());
				if(coverage.getClaimantType()!=null)newExposurePage.selectType(DriverManager.getDriver(), coverage.getClaimantType());
				newExposurePage.clickUpdate(DriverManager.getDriver());
			}
			Log.messageStep("Business Coverage Packages Is Added",DriverManager.getDriver());
			break;

		case BUSINESS_PERSONAL_PROPERTY_COVERAGE:
			Coverage coverages = chooseCoverages.getBusinessPersonalPropertyCoverage();
			actionsPage.clickBusinessPersonalPropertyCoverage(DriverManager.getDriver());
			new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), coverages.getClaimant())
			.selectType(DriverManager.getDriver(), coverages.getClaimantType()).clickIncidentMenuIcon(DriverManager.getDriver())
			.clickNewIncident(DriverManager.getDriver());
			new NewExposurePage(DriverManager.getDriver()).new NewPropertyIncidentExposurePage(DriverManager.getDriver())
			.enterDamageDescription(DriverManager.getDriver(), coverages.getDescription()).clickOK(DriverManager.getDriver());
			new NewExposurePage(DriverManager.getDriver()).clickUpdate(DriverManager.getDriver());
			Log.messageStep("Business personal property coverage packages is added",DriverManager.getDriver());
			break;

		case EXTRA_EXPENSE_COVERAGE:
			actionsPage.clickBusinessExtraExpenseCoverage(DriverManager.getDriver());
			coverage = chooseCoverages.getExtraExpenseCoverage();
			NewExposurePage newExposurePages = new NewExposurePage(DriverManager.getDriver())
					.selectClaimant(DriverManager.getDriver(), coverage.getClaimant())
					.selectType(DriverManager.getDriver(), coverage.getClaimantType())
					.selectLoaction(DriverManager.getDriver());	
			newExposurePages.clickUpdate(DriverManager.getDriver());
			break;
		default:
			break;

		}			
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
		Log.messageStep("Entered note details and created a note",DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * move to "Other"
	 * select Payment options
	 * Select Payment Type
	 * Enter Amount
	 * click Check Box of Workplan
	 * click Complete button
	 * click FinancialsnChecks
	 * Click Amount and Click On Transfer
	 * @param paymentOptions
	 */
	@Override
	public void paymentChecks(PaymentOptions paymentOptions) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());
		switch(paymentOptions.getPaymentType()) {
		case RECOVERY:	
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver());
			actionsPage.clickRecovery(DriverManager.getDriver());
			new CreateRecoveryPage(DriverManager.getDriver())
			.selectPayer(DriverManager.getDriver())
			.selectReserveLine(DriverManager.getDriver(),paymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCostCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectRecoveryCategory(DriverManager.getDriver(), paymentOptions.getRecoveryCategory())
			.enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickUpdate(DriverManager.getDriver());

			Log.messageStep("Choose Payment Checks by Selecting Payment Type: "+paymentOptions.getPayment()+" Recovered the loss of cause by: "+paymentOptions.getPayer()+"cost of category for"+paymentOptions.getRecoveryCategory(),DriverManager.getDriver());
			break;

		case MANUAL_CHECK:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver());
			actionsPage.clickManualCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).selectName(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			EnterPaymentInformationPage enterPaymentInformationPage = new EnterPaymentInformationPage(DriverManager.getDriver()).selectReserveLine(DriverManager.getDriver());
			if(paymentOptions.getCostType()!= null) enterPaymentInformationPage.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType());
			if(paymentOptions.getCostCategory()!=null) enterPaymentInformationPage.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory());
			if(paymentOptions.getPayment()!=null) enterPaymentInformationPage.selectPaymentType(DriverManager.getDriver(), paymentOptions.getPayment())
			.enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());

			Log.messageStep("Choose Payment Checks by Selecting Payment Type: "+paymentOptions.getPayment()+" and Enter the Payment Amount : "+paymentOptions.getAmount(),DriverManager.getDriver());
			break;

		case TRANSFER_CHECK:
			actionsPage.clickWorkPlan(DriverManager.getDriver());
			new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver()).clickComplete(DriverManager.getDriver());
			actionsPage.clickFinancialsChecks(DriverManager.getDriver());
			new FinancialsChecksPage(DriverManager.getDriver()).clickAmount(DriverManager.getDriver());
			new CheckDetailsPage(DriverManager.getDriver()).clickTransfer(DriverManager.getDriver());
			TransferCheckPage transferCheckPage = new TransferCheckPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver());
			new SearchClaimsPage(DriverManager.getDriver())
			.enterClaim(DriverManager.getDriver(), paymentOptions.getClaimNumber())
			.clickSearch(DriverManager.getDriver())
			.clickSelect(DriverManager.getDriver());
			transferCheckPage.clickTransfer(DriverManager.getDriver());

			Log.messageStep("Transfer Checks by Enter Claim number: "+paymentOptions.getClaimNumber(),DriverManager.getDriver());
			break;
		}
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
		Log.messageStep("Assign Claim by Searching Location : "+ assignClaim.getAssignType(),DriverManager.getDriver());
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
	public void createreserve(Reserve reserve) {
		new ExposuresPage(DriverManager.getDriver(),2).clickExposureCheckbox(DriverManager.getDriver());
		new ExposuresPage(DriverManager.getDriver()).clickCreateReserve(DriverManager.getDriver());
		new EditReservesPage(DriverManager.getDriver()).selectExposure(DriverManager.getDriver())
		.selectReserveCostType(DriverManager.getDriver(),reserve.getCostType() )
		.selectReserveCostCategory(DriverManager.getDriver(), reserve.getCostCategory())
		.enterReserveAmount(DriverManager.getDriver(), reserve.getNewAvailableReserves())
		.clickSave(DriverManager.getDriver());

		Log.messageStep("Created Reserve by selecting Cost Type : "+ reserve.getCostType()+"and Cost Category : "+reserve.getCostCategory(),DriverManager.getDriver());
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
		case "CONSTRUCTIONSERVICE_ELECTRICAL":
			selectServiceToAddPage.clickConstructionServiceElectrical(DriverManager.getDriver());
			break;
		case "APPRAISAL":
			selectServiceToAddPage.clickAppraisal(DriverManager.getDriver());
			break;
		case "AUDIO_EQUIPMENT":
			selectServiceToAddPage.clickAudioEquipment(DriverManager.getDriver());
			break;
		case "GLASS":
			selectServiceToAddPage.clickGlass(DriverManager.getDriver());
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
	 * ** REUSABLE METHOD **
	 * Entering Contact Details like First name,last name,tax id,address,state,city etc,.
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

		Log.messageStep("Contact information entered",DriverManager.getDriver());

	}

	/**
	 * Navigate to Document Page page from action menu by clicking Template Claim Button
	 * select Type and Jurisdiction type in Documents page
	 * Click Create document button 
	 * Click Update button
	 */
	@Override
	public void createDocument(ChooseDocumentsByType chooseDocumentsByType) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());

		switch(chooseDocumentsByType.getDocumentType()) {
		case TEMPLATE_CLAIM :
			new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			new ActionsPage(DriverManager.getDriver()).clickCreateTemplate(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver()).clickSearchDocumentIcon(DriverManager.getDriver())
			.selectType(DriverManager.getDriver(), chooseDocumentsByType.getTemplateClaim().getDocumentType())
			.selectJurisdictionState(DriverManager.getDriver(), chooseDocumentsByType.getTemplateClaim().getJurisdictionState())
			.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver()).clickCreateDocument(DriverManager.getDriver())
			.clickUpdateButton(DriverManager.getDriver());
			break;

		case UPLOAD_DOCUMENT:
			new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			new ActionsPage(DriverManager.getDriver()).clickUploadDocument(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver()).documentAttach(DriverManager.getDriver(), chooseDocumentsByType.getUploadDocument().getDocumentName())
			.selectStatus(DriverManager.getDriver(), chooseDocumentsByType.getUploadDocument().getStatus()).selectUploadDocumentType(DriverManager.getDriver(), chooseDocumentsByType.getUploadDocument().getDocumentType())
			.clickUpdateButton(DriverManager.getDriver());
			break;

		case INDICATE_EXISTENCE:
			new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			new ActionsPage(DriverManager.getDriver()).clickIndicateExistenceDocument(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver()).enterName(DriverManager.getDriver(),chooseDocumentsByType.getIndicateExistence().getName())
			.selectStatus(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getStatus()).selectDocumentType(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getDocumentType())
			.clickUpdateButton(DriverManager.getDriver());
			break;
		}
		Log.messageStep("Document has been created",DriverManager.getDriver());
	}

	/**
	 * Click "Workplan" Screen Button
	 * click Workplan checkbox in workplan table
	 * click "Complete" Button
	 * Click "Exposure" Screen Button
	 * click Exposure checkbox in Exposure table
	 * click "CloseExposure" Button
	 * Enter "Note" and select "outcome"
	 * click "CloseExposure" button
	 */
	@Override
	public void closeExposure(ExposureDetails exposureDetails) {
		new ActionsPage(DriverManager.getDriver()).clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver()).clickComplete(DriverManager.getDriver());
		new ActionsPage(DriverManager.getDriver()).clickExposure(DriverManager.getDriver());
		new ExposuresPage(DriverManager.getDriver()).clickCheckBoxExposure(DriverManager.getDriver()).clickCloseExposure(DriverManager.getDriver())
		.enterNote(DriverManager.getDriver(),exposureDetails.getNote()).selectOutcome(DriverManager.getDriver(), exposureDetails.getOutcome())
		.clickCloseExposure(DriverManager.getDriver()).verifyStatus(DriverManager.getDriver(), exposureDetails.getExposureValue());

		Log.messageStep("Exposure has been closed",DriverManager.getDriver());
	}

	/**
	 * Click Document
	 *Verify Document is created or not
	 */
	@Override
	public void verifyDocumentCreation() {
		new ActionsPage(DriverManager.getDriver()).clickDocument(DriverManager.getDriver());
		new DocumentPage(DriverManager.getDriver()).verifyDocumentCreated(DriverManager.getDriver());

		Log.messageStep("Successfully Document is created",DriverManager.getDriver());
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

	/**
	 * Navigate to email page from action menu 
	 * Enter "Email Address" in  email address field
	 * Enter Body and subject in respective field
	 * Click send email button
	 */
	@Override
	public void emailClaim(EmailDetails emailDetails) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.clickEmail(DriverManager.getDriver());
		new EmailPage(DriverManager.getDriver()).enterEmailAddress(DriverManager.getDriver(), emailDetails.getEmailAdress())
		.enterSubject(DriverManager.getDriver(), emailDetails.getSubject()).enterBody(DriverManager.getDriver(), emailDetails.getBody())
		.clickSendEmail(DriverManager.getDriver());

		Log.messageStep("Claim using Email : enter email Address : "+emailDetails.getEmailAdress()+" and Suceesfully Claim is done using mentioned Email",DriverManager.getDriver());
	}
}