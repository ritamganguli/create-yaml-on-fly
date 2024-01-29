package com.aspire.guidewire.cc.teststeps.generalliability;

import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage.NewPropertyIncidentPage;
import com.aspire.guidewire.cc.pages.common.AddServicePage;
import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.cc.pages.common.BasicInformationPage;
import com.aspire.guidewire.cc.pages.common.CheckDetailsPage;
import com.aspire.guidewire.cc.pages.common.ContactInformationPage;
import com.aspire.guidewire.cc.pages.common.CreateRecoveryPage;
import com.aspire.guidewire.cc.pages.common.DocumentPage;
import com.aspire.guidewire.cc.pages.common.EditReservesPage;
import com.aspire.guidewire.cc.pages.common.EnterPayeeInformationPage;
import com.aspire.guidewire.cc.pages.common.EnterPaymentInformationPage;
import com.aspire.guidewire.cc.pages.common.ExposuresPage;
import com.aspire.guidewire.cc.pages.common.FinancialsChecksPage;
import com.aspire.guidewire.cc.pages.common.FinancialsTransactionsPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.InjuryIncidentPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.NewDocumentPage;
import com.aspire.guidewire.cc.pages.common.NewExposurePage;
import com.aspire.guidewire.cc.pages.common.NewExposurePage.NewPropertyIncidentExposurePage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.AddInjury;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ServiceDetails;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.pc.teststeps.generalliability.DataFakers;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class GeneralLiabilityStepsImpl implements GeneralLiabilitySteps {

	private String CCwebSite;
	String firstName = DataFakers.firstName();
	String lastName = DataFakers.lastName();

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

		SearchOrCreatePolicyPage SearchOrCreatePolicyPage = new SearchOrCreatePolicyPage(DriverManager.getDriver()).get();
		SearchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo()).clickSearch(DriverManager.getDriver()).enterLossDate(DriverManager.getDriver(), searchPolicy.getLossDate());
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
		Log.messageStep("Basic Information Insured Name : "+basicInfo.getInsuredName(),DriverManager.getDriver());
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
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver()).get().selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause())
				.enterWhatHappened(DriverManager.getDriver(), claimInfo.getWhatHappened()).clickPrimaryLocation(DriverManager.getDriver());

		if(claimInfo.getAddPropertyDamage()!= null) {
			AddPropertyDamage addPropertyDamage = claimInfo.getAddPropertyDamage();
			addClaimInformationPage.clickAddPropertyDamage(DriverManager.getDriver());
			NewPropertyIncidentPage newPropertyIncidentPage = addClaimInformationPage.new NewPropertyIncidentPage(DriverManager.getDriver());
			newPropertyIncidentPage.enterDamageDescription(DriverManager.getDriver(),addPropertyDamage.getDamageDescription());
			newPropertyIncidentPage.enterPropertyDescription(DriverManager.getDriver(),addPropertyDamage.getPropertyDescription());
			newPropertyIncidentPage.selectPropertyName(DriverManager.getDriver(),addPropertyDamage.getPropertyName());
			newPropertyIncidentPage.clickOK(DriverManager.getDriver());
			Log.messageStep("Claim Information add  Incident Property Name : "+addPropertyDamage.getPropertyName(),DriverManager.getDriver());
		}

		if(claimInfo.getAddInjury()!= null) {
			AddInjury addInjury=claimInfo.getAddInjury();
			addClaimInformationPage.clickAddInjury(DriverManager.getDriver());
			InjuryIncidentPage injuryIncidentPage =new InjuryIncidentPage(DriverManager.getDriver());
			injuryIncidentPage.selectPerson(DriverManager.getDriver(), addInjury.getPerson());
			injuryIncidentPage.selectLossParty(DriverManager.getDriver(), addInjury.getLossParty());
			injuryIncidentPage.clickOK(DriverManager.getDriver());
			Log.messageStep("Claim Information add  Injured Person : "+addInjury.getPerson(),DriverManager.getDriver());

		}
		addClaimInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep(" Add Claim Information are Processed",DriverManager.getDriver());

	}


	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
	 */
	@Override
	public String saveAndAssignClaim() {
		new SaveAndAssignClaimPage(DriverManager.getDriver()).get().clickFinish(DriverManager.getDriver());
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
		Log.messageStep("Viewed Created Claim",DriverManager.getDriver());
		
	}

	/**
	 * click on claim menu and click on search
	 * enter claim number and search
	 * @param searchClaim
	 * @return insuredName
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
	 * ** REUSABLE METHOD **
	 * Used to create Exposure Property Incident
	 * @param Coverage
	 */
	public void createExposurePropertyIncident(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
				.clickIncidentMenuIcon(DriverManager.getDriver()).clickNewIncident(DriverManager.getDriver());

		NewPropertyIncidentExposurePage newPropertyIncidentPage =newExposurePage.new NewPropertyIncidentExposurePage(DriverManager.getDriver());
		newPropertyIncidentPage.enterDamageDescription(DriverManager.getDriver(),Coverage.getDamageDescription());
		newPropertyIncidentPage.enterPropertyDescription(DriverManager.getDriver(),Coverage.getPropertyDescription());
		newPropertyIncidentPage.selectPropertyName(DriverManager.getDriver(),Coverage.getPropertyName());
		newPropertyIncidentPage.clickOK(DriverManager.getDriver());
		newExposurePage.clickUpdate(DriverManager.getDriver());

		Log.messageStep("Created Exposure for Property Damage select Coverage type as : "+Coverage.getClaimantType()+" and Damaged Property Name : "+Coverage.getPropertyName(),DriverManager.getDriver());
	}	
	
	/**
	 * ** REUSABLE METHOD **
	 * Used to create Exposure 
	 * Select "Claimant" and "Claimant Type"
	 * Click on "Update"
	 * @param Coverage
	 */
	public void createExposure(Coverage Coverage){
		new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
		.selectType(DriverManager.getDriver(), Coverage.getClaimantType()).clickUpdate(DriverManager.getDriver());
		Log.messageStep("Created Exposure by select Coverage type as : "+Coverage.getClaimantType(),DriverManager.getDriver());
	}

	/**
	 * ** REUSABLE METHOD **
	 * Select "Claimant" and "Claimant Type"
	 * Click on "Update"
	 * Add Injury Incident
	 * Select "Person", "Loss party" 
	 * Click on "Ok" and "Update" button
	 * @param Coverage
	 */
	public void createExposureInjuryIncident(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType()).clickIncidentMenuIcon(DriverManager.getDriver())
				.clickNewIncident(DriverManager.getDriver());
		new InjuryIncidentPage(DriverManager.getDriver()).selectInjuredPerson(DriverManager.getDriver(), Coverage.getInjuredPerson())
		.selectLossParty(DriverManager.getDriver(), Coverage.getLossParty()).clickOK(DriverManager.getDriver());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Created Exposure Injury Incident by select Coverage type as : "+Coverage.getClaimantType()+" and Injured Person Name : "+Coverage.getInjuredPerson(),DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * clicks on choose by coverage Type
	 * clicks coverage type "C, D, E, P, T, U, R"
	 * clicks on coverage
	 * Create Exposure for Vehicle incident or Injury incident
	 * @param ChooseCoveragesByType
	 */
	@Override
	public void addCoveragesByType(ChooseCoveragesByType ChooseCoveragesByType) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverageType(DriverManager.getDriver());
		switch(ChooseCoveragesByType.getCoverages()) {
		case COVERAGE_C:
			actionsPage.moveToC(DriverManager.getDriver());
			if (ChooseCoveragesByType.getCoverage_C().getCoverageForInjuryToLeasedWorkers()!=null) {
				actionsPage.clickCoverageForInjuryToLeasedWorkers(DriverManager.getDriver());
				createExposureInjuryIncident(ChooseCoveragesByType.getCoverage_C().getCoverageForInjuryToLeasedWorkers());
			}
			break;

		case COVERAGE_G:
			actionsPage.moveToG(DriverManager.getDriver());
			actionsPage.moveToGovermenatalSubdivisions(DriverManager.getDriver());
			if (ChooseCoveragesByType.getCoverage_G().getGovermenatalSubdivisions().getGovermenatalSubdivisionsGenDamange()!=null) {
				actionsPage.clickGovSubdivisionsGenDamage(DriverManager.getDriver());
				createExposure(ChooseCoveragesByType.getCoverage_G().getGovermenatalSubdivisions().getGovermenatalSubdivisionsGenDamange());
			}
			if (ChooseCoveragesByType.getCoverage_G().getGovermenatalSubdivisions().getGovermenatalSubdivisionsPD()!=null) {
				actionsPage.clickGovSubdivisionsPD(DriverManager.getDriver());
				createExposurePropertyIncident(ChooseCoveragesByType.getCoverage_G().getGovermenatalSubdivisions().getGovermenatalSubdivisionsPD());
			}
		default:
			break;
		}
		new ExposuresPage(DriverManager.getDriver()).verifyExposureCreated(DriverManager.getDriver(), ChooseCoveragesByType.getCoverage());	
		Log.messageStep("Coverage : "+ChooseCoveragesByType.getCoverages()+" initiated",DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * clicks on choose by coverage
	 * clicks on Policy level Coverage
	 * clicks on coverage
	 * Create Exposure for Vehicle incident or Injury incident
	 * @param ChooseCovearges
	 */
	@Override
	public void addCoverages(ChooseCoverages chooseCoverages) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverage(DriverManager.getDriver());
		actionsPage.moveToPolicyLevelCoverage(DriverManager.getDriver());
		switch(chooseCoverages.getCoverages()) {
		case GL_PROD_COMP_OPS_MED_PAY:
			actionsPage.moveToGeneralLiability(DriverManager.getDriver());
			if(chooseCoverages.getGeneralLiability().getGLProdCompOpsMedPay()!= null) {
				actionsPage.clickGLMedPay(DriverManager.getDriver());
				createExposureInjuryIncident(chooseCoverages.getGeneralLiability().getGLProdCompOpsMedPay());
			}
			break;

		case GL_PERSONAL_ADVERTISING_INJURY:
			actionsPage.moveToGeneralLiability(DriverManager.getDriver());
			if(chooseCoverages.getGeneralLiability().getGLPersonalAdvertisingInjury()!= null) {
				actionsPage.clickGLPerosnalAdvertisingInjury(DriverManager.getDriver());
				createExposure(chooseCoverages.getGeneralLiability().getGLPersonalAdvertisingInjury());
			}
			break;
		default:
			break;
		}
		new ExposuresPage(DriverManager.getDriver()).verifyExposureCreated(DriverManager.getDriver(), chooseCoverages.getCoverage());
		Log.messageStep("Coverage : "+chooseCoverages.getCoverages()+" initiated",DriverManager.getDriver());
	}

	/**
	 * ** REUSABLE METHOD **
	 * Used to add the contact Informations
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
		Log.messageStep("Contact information name : "+contactDetails.getFirstName()+contactDetails.getLastName()+"Contact information Address : "+contactDetails.getAddress()+"Contact information State :"+contactDetails.getState()+"Contact information City :"+contactDetails.getCity(),DriverManager.getDriver());

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
		new ExposuresPage(DriverManager.getDriver()).selectExposuresFilter_1(DriverManager.getDriver(), reserve.getExposureFilterName()).clickExposureCheckbox(DriverManager.getDriver())
		.clickCreateReserve(DriverManager.getDriver());
		new EditReservesPage(DriverManager.getDriver()).selectExposure(DriverManager.getDriver())
		.selectReserveCostType(DriverManager.getDriver(),reserve.getCostType() )
		.selectReserveCostCategory(DriverManager.getDriver(), reserve.getCostCategory())
		.enterReserveAmount(DriverManager.getDriver(), reserve.getReserveAmount())
		.clickSave(DriverManager.getDriver());
		new FinancialsTransactionsPage(DriverManager.getDriver()).verifyReserveCreated(DriverManager.getDriver(),reserve.getCoverageType());
		Log.messageStep("Create Reserve for by selecting Cost Type : "+ reserve.getCostType()+" and Cost Category : "+reserve.getCostCategory(),DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * clicks on "Service"
	 * select "RequestType" from RequestType dropdown
	 * select "ServiceAddress" from ServiceAddress dropdown
	 * Clicked "Add" Button
	 * Clicked on "service" 
	 * Click on ok button
	 * Enter contact Information details
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
		case "MEDICAL_CARE":
			selectServiceToAddPage.clickMedicalCare(DriverManager.getDriver());
			break;

		}

		selectServiceToAddPage.clickOK(DriverManager.getDriver());
		new AddServicePage(DriverManager.getDriver()).clickSpecialistMenuIcon(DriverManager.getDriver()).moveToNewVendor(DriverManager.getDriver()).clickVendorPerson(DriverManager.getDriver());
		addContactInformation(serviceDetails.getContactDetails());
		addServicePage.clickSubmit(DriverManager.getDriver());
		Log.messageStep("Claim the services : Request Type : "+serviceDetails.getRequestType()+"and fill Contact Information "+serviceDetails.getContactDetails(),DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * move to "Other"
	 * select any Payment options - recovery,clone check, manual check, Transfer check
	 * @param createNote
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
			Log.messageStep("Create Recovery by selecting Category: "+paymentOptions.getRecoveryCategory()+" and Reserve  Line as : "+paymentOptions.getReserveLine(),DriverManager.getDriver());
			break;
		case MANUAL_CHECK:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver());
			actionsPage.clickManualCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).selectName(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).selectReserveLine(DriverManager.getDriver(),paymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectPaymentType(DriverManager.getDriver(), paymentOptions.getPayment()).
			enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
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
			new SearchClaimsPage(DriverManager.getDriver()).enterClaim(DriverManager.getDriver(), paymentOptions.getClaimNumber())
			.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver());
			Log.messageStep("Transfer Checks by Enter Claim number: "+paymentOptions.getClaimNumber(),DriverManager.getDriver());
			transferCheckPage.clickTransfer(DriverManager.getDriver());
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
		Log.messageStep("Note has been created",DriverManager.getDriver());
	}

	/**
	 * Navigate to Document Page page from action menu by clicking New Document button
	 * select respective button to Create from template claim ,upload Document and indicate Existence of a DocumentClaim
	 * To create a document and verify it in document page
	 */
	@Override
	public void createDocument(ChooseDocumentsByType chooseDocumentsByType) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());

		switch(chooseDocumentsByType.getDocumentType()) {
		case TEMPLATE_CLAIM :
			if(chooseDocumentsByType.getTemplateClaim().isNewDocument()) {
				new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			}
			new ActionsPage(DriverManager.getDriver()).clickCreateTemplate(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver()).clickSearchDocumentIcon(DriverManager.getDriver())
			.selectType(DriverManager.getDriver(), chooseDocumentsByType.getTemplateClaim().getType()).selectJurisdictionState(DriverManager.getDriver(), chooseDocumentsByType.getTemplateClaim().getJurisdiction())
			.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver()).clickCreateDocument(DriverManager.getDriver())
			.clickUpdateButton(DriverManager.getDriver());
			break;

		case UPLOAD_DOCUMENT:
			if(chooseDocumentsByType.getUploadDocument().isNewDocument()) {
				new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			}
			new ActionsPage(DriverManager.getDriver()).clickUploadDocument(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver()).documentAttach(DriverManager.getDriver(), chooseDocumentsByType.getUploadDocument().getDocumentName())
			.selectStatus(DriverManager.getDriver(), chooseDocumentsByType.getUploadDocument().getStatus()).selectUploadDocumentType(DriverManager.getDriver(), chooseDocumentsByType.getUploadDocument().getDocumentType())
			.clickUpdateButton(DriverManager.getDriver());


			break;

		case INDICATE_EXISTENCE:
			if(chooseDocumentsByType.getIndicateExistence().isNewDocument()) {
				new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			}
			new ActionsPage(DriverManager.getDriver()).clickIndicateExistenceDocument(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver()).enterName(DriverManager.getDriver(),chooseDocumentsByType.getIndicateExistence().getName())
			.selectStatus(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getStatus()).selectDocumentType(DriverManager.getDriver(), chooseDocumentsByType.getIndicateExistence().getDocumentType())
			.clickUpdateButton(DriverManager.getDriver());

			break;
		}
		Log.messageStep("New Claim Document is created for "+chooseDocumentsByType.getDocumentType(),DriverManager.getDriver());

	}

	/**
	 * Navigate to Documents Page
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */
	@Override
	public void verifyDocumentCreation() {
		new ActionsPage(DriverManager.getDriver()).clickDocument(DriverManager.getDriver());
		new DocumentPage(DriverManager.getDriver()).verifyDocumentCreated(DriverManager.getDriver());
		Log.messageStep("Created document validated successfully",DriverManager.getDriver());
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
			.selectSearchFor(DriverManager.getDriver(), assignClaim.getSearchFor())
			.clickSearch(DriverManager.getDriver())
			.clickAssignForSearchByDistanceFromLocation(DriverManager.getDriver());
			break;
		}
		Log.messageStep("Save and Assign Claim are Processed for assign type "+assignClaim.getAssignType(),DriverManager.getDriver());
	}
}