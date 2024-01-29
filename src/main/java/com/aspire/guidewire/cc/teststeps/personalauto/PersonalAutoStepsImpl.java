package com.aspire.guidewire.cc.teststeps.personalauto;

import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage.NewPropertyIncidentPage;
import com.aspire.guidewire.cc.pages.common.AddServicePage;
import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.cc.pages.common.BasicInformationPage;
import com.aspire.guidewire.cc.pages.common.BatchProcessInfoPage;
import com.aspire.guidewire.cc.pages.common.CheckDetailsPage;
import com.aspire.guidewire.cc.pages.common.CloseClaimPage;
import com.aspire.guidewire.cc.pages.common.ContactInformationPage;
import com.aspire.guidewire.cc.pages.common.ContactsPage;
import com.aspire.guidewire.cc.pages.common.CreateRecoveryPage;
import com.aspire.guidewire.cc.pages.common.DocumentPage;
import com.aspire.guidewire.cc.pages.common.EditReservesPage;
import com.aspire.guidewire.cc.pages.common.EmailPage;
import com.aspire.guidewire.cc.pages.common.EnterPayeeInformationPage;
import com.aspire.guidewire.cc.pages.common.EnterPaymentInformationPage;
import com.aspire.guidewire.cc.pages.common.ExposuresPage;
import com.aspire.guidewire.cc.pages.common.FinancialsChecksPage;
import com.aspire.guidewire.cc.pages.common.FinancialsSummaryPage;
import com.aspire.guidewire.cc.pages.common.FinancialsTransactionsPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.InjuryIncidentPage;
import com.aspire.guidewire.cc.pages.common.LossDetailsPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.NewDocumentPage;
import com.aspire.guidewire.cc.pages.common.NewExposurePage;
import com.aspire.guidewire.cc.pages.common.NewVehicleIncidentPage;
import com.aspire.guidewire.cc.pages.common.ReopenClaimPage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.ServicesPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.SubrogationPage;
import com.aspire.guidewire.cc.pages.common.SummaryPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.SubrogationDetails;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class PersonalAutoStepsImpl implements PersonalAutoSteps {

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
	public void loginIntoTheApplication(String username, String password) {//3 & 4
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
	public void createClaim(){//2 & 2
		new HeaderPage(DriverManager.getDriver()).clicktoggleClaimSubMenu(DriverManager.getDriver())
		.clickNewClaim(DriverManager.getDriver());
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
		SearchOrCreatePolicyPage
		.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo())
		.clickSearch(DriverManager.getDriver())
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
//		basicInformationPage.clickVehicle(DriverManager.getDriver());
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
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver()).get().selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause())
				.selectState(DriverManager.getDriver(), claimInfo.getState()).enterCity(DriverManager.getDriver(), claimInfo.getCity());
		if(claimInfo.getFaultRating()!=null)addClaimInformationPage.selectFaultRating(DriverManager.getDriver(), claimInfo.getFaultRating());

		if(claimInfo.getAddPropertyDamage()!= null) {
			AddPropertyDamage addPropertyDamage = claimInfo.getAddPropertyDamage();
			addClaimInformationPage.clickAddPropertyDamage(DriverManager.getDriver());
			NewPropertyIncidentPage newPropertyIncidentPage = addClaimInformationPage.new NewPropertyIncidentPage(DriverManager.getDriver());
			newPropertyIncidentPage.enterDamageDescription(DriverManager.getDriver(),addPropertyDamage.getDamageDescription());
			newPropertyIncidentPage.enterPropertyDescription(DriverManager.getDriver(),addPropertyDamage.getPropertyDescription());
			newPropertyIncidentPage.selectPropertyName(DriverManager.getDriver(),addPropertyDamage.getPropertyName());
			newPropertyIncidentPage.clickOK(DriverManager.getDriver());
		}
		addClaimInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep(" Add Claim Information are Processed",DriverManager.getDriver());

	}

	/**
	 * Clicks on next
	 * returns SaveAndAssignClaimPage
	 */
	@Override
	public void addServices() {
		new ServicesPage(DriverManager.getDriver()).get().clickNext(DriverManager.getDriver());
		Log.messageStep("Add Services are Processed",DriverManager.getDriver());
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
		Log.messageStep("Viewed Created Claim: "+claimNumber,DriverManager.getDriver());
		return claimNumber;
	}

	/**
	 * clicks on "Go to claim"
	 * returns SummaryPage
	 */
	@Override
	public void viewClaim() {
		NewClaimSavedPage newClaimSavedPage = new NewClaimSavedPage(DriverManager.getDriver()).get();
		newClaimSavedPage.clickGoToClaim(DriverManager.getDriver());
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
			if (ChooseCoveragesByType.getCoverage_C().getCollision()!=null) {
			    actionsPage.clickCollision(DriverManager.getDriver());
				CreateExposureVehicleIncident(ChooseCoveragesByType.getCoverage_C().getCollision());
			}
			if (ChooseCoveragesByType.getCoverage_C().getComprehensive()!=null) {
				actionsPage.clickComprehensive(DriverManager.getDriver());
				CreateExposureVehicleIncident(ChooseCoveragesByType.getCoverage_C().getComprehensive());
			}
			break;

		case COVERAGE_P:
			actionsPage.moveToP(DriverManager.getDriver());
			if(ChooseCoveragesByType.getCoverage_P().getPIP_Kentucky()!=null) {
				actionsPage.clickPipKentuckyCoverage(DriverManager.getDriver());
				CreateExposureInjuryIncident(ChooseCoveragesByType.getCoverage_P().getPIP_Kentucky());
			}
			break;

		case COVERAGE_T:
			actionsPage.moveToT(DriverManager.getDriver());
			if(ChooseCoveragesByType.getCoverage_T().getTapeAndDisc()!=null) {
				Coverage Coverage = ChooseCoveragesByType.getCoverage_T().getTapeAndDisc();
				actionsPage.clickTapeDiscCoverage(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
				.clickUpdate(DriverManager.getDriver());
			}
			if(ChooseCoveragesByType.getCoverage_T().getTowingAndLabor()!=null) {
				ChooseCoveragesByType.getCoverage_T().getTowingAndLabor();
				actionsPage.clickTowingAndLabor(DriverManager.getDriver());
				CreateExposureVehicleIncident(ChooseCoveragesByType.getCoverage_T().getTowingAndLabor());
			}
			break;
		case COVERAGE_D:
			actionsPage.moveToD(DriverManager.getDriver());
			actionsPage.clickDeathAndDisability(DriverManager.getDriver());
			CreateExposureInjuryIncident(ChooseCoveragesByType.getCoverage_D().getDeathAndDisability());
			break;
		case COVERAGE_E:
			actionsPage.moveToE(DriverManager.getDriver());
			actionsPage.clickElectronicEquipmentCoverage(DriverManager.getDriver());
			CreateExposureVehicleIncident(ChooseCoveragesByType.getCoverage_E().getElectronicEquipment());
			break;
		case COVERAGE_R:
			actionsPage.moveToR(DriverManager.getDriver());
			if(ChooseCoveragesByType.getCoverage_R().getRentalReimbursement()!=null) {
				actionsPage.clickRentalReimbursement(DriverManager.getDriver());
				CreateExposureVehicleIncident(ChooseCoveragesByType.getCoverage_R().getRentalReimbursement());
			}
			if(ChooseCoveragesByType.getCoverage_R().getRentalCarLossOfUse()!=null) {
				Coverage Coverage = ChooseCoveragesByType.getCoverage_R().getRentalCarLossOfUse();
				actionsPage.clickRentalCarLossOfUse(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType()).selectLoaction(DriverManager.getDriver())
				.clickUpdate(DriverManager.getDriver());
			}
			break;
		case COVERAGE_U:
			actionsPage.moveToU(DriverManager.getDriver());
			if(ChooseCoveragesByType.getCoverage_U().getUninsuredMotoristsPropertyDamage()!=null) {
				actionsPage.clickUninsuredMotoristsPropertyDamage(DriverManager.getDriver());
				CreateExposureVehicleIncident(ChooseCoveragesByType.getCoverage_U().getUninsuredMotoristsPropertyDamage());
			}
			if(ChooseCoveragesByType.getCoverage_U().getUnderInsuredMotoristsPropertyDamage()!=null) {
				actionsPage.clickUnderInsuredMotoristsPropertyDamage(DriverManager.getDriver());
				CreateExposureVehicleIncident(ChooseCoveragesByType.getCoverage_U().getUnderInsuredMotoristsPropertyDamage());
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
		case LIABILITY_BODILY_INJURY_PROPERTY_DAMAGE:
			actionsPage.moveToLiabilityBodilyInjuryPropertyDamage(DriverManager.getDriver());
			if(chooseCoverages.getLiability_Coverage().getLiability_BodilyInjury()!=null) {
				actionsPage.clickLiabilityBodilyInjury(DriverManager.getDriver());
				CreateExposureInjuryIncident(chooseCoverages.getLiability_Coverage().getLiability_BodilyInjury());
			}
			if(chooseCoverages.getLiability_Coverage().getLiability_VehicleDamage()!=null) {
				actionsPage.clickLiabilityVehicleDamage(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
						.clickNewPerson(DriverManager.getDriver());
				addContactInformation(chooseCoverages.getContactDetails());
				CreateExposureVehicleIncident(chooseCoverages.getLiability_Coverage().getLiability_VehicleDamage());
			}
			break;
		case UNINSURED_MOTORISTS_BODILY_INJURY:
			actionsPage.clickUninsuredMotoristsBodilyInjury(DriverManager.getDriver());
			NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
					.clickNewPerson(DriverManager.getDriver());
			addContactInformation(chooseCoverages.getContactDetails());
			CreateExposureInjuryIncident(chooseCoverages.getUninsuredMotoristsodilyInjury());
			break;	
		case UNDERINSURED_MOTORIST_BODILY_INJURY:
			actionsPage.clickUnderInsuredMotoristsBodilyInjury(DriverManager.getDriver());
			newExposurePage = new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
					.clickNewPerson(DriverManager.getDriver());
			addContactInformation(chooseCoverages.getContactDetails());
			CreateExposureInjuryIncident(chooseCoverages.getUnderInsuredMotoristsodilyInjury());
			break;
		case MEXICO_COVERAGE_LIMITED:
			actionsPage.moveMexicoCovLimited(DriverManager.getDriver());
			if(chooseCoverages.getMexicoCoverage().getMexicoCoverage_BI()!=null) {
				actionsPage.clickMexicoCov_BI(DriverManager.getDriver());
				CreateExposureInjuryIncident(chooseCoverages.getMexicoCoverage().getMexicoCoverage_BI());
			}
			if(chooseCoverages.getMexicoCoverage().getMexicoCoverage_PD()!=null) {
				Coverage Coverage = chooseCoverages.getMexicoCoverage().getMexicoCoverage_PD();
				actionsPage.clickMexicoCov_PD(DriverManager.getDriver());
				 newExposurePage = new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
				.clickNewPerson(DriverManager.getDriver());
				addContactInformation(chooseCoverages.getContactDetails());
				newExposurePage.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
				.clickUpdate(DriverManager.getDriver());
			}
			break;
		case MEDICAL_PAYMENTS:
			actionsPage.clickMedicalPayments(DriverManager.getDriver());
			CreateExposureInjuryIncident(chooseCoverages.getMedicalpayments());
			break;
		default:
			break;
		}
		new ExposuresPage(DriverManager.getDriver()).verifyExposureCreated(DriverManager.getDriver(), chooseCoverages.getCoverage());
		Log.messageStep("Coverage : "+chooseCoverages.getCoverages()+" initiated",DriverManager.getDriver());
	}

	/**
	 * select "Claimant Name"
	 * select "Claimant Type"
	 * clicks on Incident menu icon
	 * clicks on New incident
	 * Select vehicle, drivername
	 * Enter damage description
	 * select loss occurred 
	 * click ok then update
	 * @param Coverage
	 */
	public void CreateExposureVehicleIncident(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
		if(Coverage.getClaimant()!=null) newExposurePage.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant());
		if(Coverage.getClaimantType()!=null) newExposurePage.selectType(DriverManager.getDriver(), Coverage.getClaimantType());
		newExposurePage.clickIncidentMenuIcon(DriverManager.getDriver()).clickNewIncident(DriverManager.getDriver());
		NewVehicleIncidentPage NewVehicleIncidentPage = new NewVehicleIncidentPage(DriverManager.getDriver())
				.selectSelectvehicle(DriverManager.getDriver(),Coverage.getVehicleName())
	            .selectDriverName(DriverManager.getDriver(),Coverage.getDriverName());
		if(Coverage.getDescription()!=null) NewVehicleIncidentPage.enterDamageDescription(DriverManager.getDriver(), Coverage.getDescription());
		NewVehicleIncidentPage.enterYear(DriverManager.getDriver(),Coverage.getYear()).enterMake(DriverManager.getDriver(),Coverage.getMake())
		.enterModel(DriverManager.getDriver(), Coverage.getModel());
		if(Coverage.getVin()!=null) NewVehicleIncidentPage.enterVIN(DriverManager.getDriver(),Coverage.getVin());
		NewVehicleIncidentPage.selectLossOccurred(DriverManager.getDriver(), Coverage.getLossOccurred()).clickOK(DriverManager.getDriver());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Vehicle incident is added",DriverManager.getDriver());
	}

	/**
	 * select "Claimant Name"
	 * select "Claimant Type"
	 * clicks on Incident menu icon
	 * clicks on New incident
	 * Select Injured person
	 * select loss party 
	 * click ok then update
	 * @param Coverage
	 */
	public void CreateExposureInjuryIncident(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
		if(Coverage.getClaimant()!=null) newExposurePage.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant());
		if(Coverage.getClaimantType()!=null) newExposurePage.selectType(DriverManager.getDriver(), Coverage.getClaimantType());
		newExposurePage.clickIncidentMenuIcon(DriverManager.getDriver()).clickNewIncident(DriverManager.getDriver());
		new InjuryIncidentPage(DriverManager.getDriver()).selectInjuredPerson(DriverManager.getDriver(), Coverage.getInjuredPerson())
		.selectLossParty(DriverManager.getDriver(), Coverage.getLossParty()).clickOK(DriverManager.getDriver());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Injury incident is added",DriverManager.getDriver());
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
	 * clicks on "Actions"
	 * clicks on Parties group
	 * clicks on Contacts
	 * clicks on "New Contact"
	 * clicks on any contacts
	 * Enters name, Firstname, Lastname, TaxId, Address,City, State
	 * Clicks on Update
	 * @param contact
	 */
	@Override
	public void createContact(Contact contact) {
		new ActionsPage(DriverManager.getDriver())
		.clickPartiesGroup(DriverManager.getDriver())
		.clickContacts(DriverManager.getDriver());
		ContactsPage ContactsPage = new ContactsPage(DriverManager.getDriver())
				.clickNewContact(DriverManager.getDriver());
		switch(contact.getContactType()) {
		case PERSON:
			ContactsPage.clickPerson(DriverManager.getDriver());
			addContactInformation(contact.getPerson());
			break;

		case COMPANY:
			ContactsPage.clickCompany(DriverManager.getDriver());
			addContactInformation(contact.getCompany());
			break;

		case LEGAL:
			ContactsPage.clickLegal(DriverManager.getDriver());

			if (contact.getLegal().getAdjudicator()!=null) {
				ContactsPage.clickAdjudicator(DriverManager.getDriver());
				addContactInformation(contact.getLegal().getAdjudicator());
			}

			if (contact.getLegal().getAttorney()!=null) {
				ContactsPage.clickAttorney(DriverManager.getDriver());
				addContactInformation(contact.getLegal().getAttorney());
			}

			if (contact.getLegal().getLawFirm()!=null) {
				ContactsPage.clickLawFirm(DriverManager.getDriver());
				addContactInformation(contact.getLegal().getLawFirm());
			}

			if (contact.getLegal().getLegalVenue()!=null) {
				ContactsPage.clickLegalVenue(DriverManager.getDriver());
				addContactInformation(contact.getLegal().getLegalVenue());
			}
			break;

		case VENDOR:
			ContactsPage.clickVendor(DriverManager.getDriver());
			if (contact.getVendor().getAutobodyRepairShop()!=null) {
				ContactsPage.clickAutobodyRepairShop(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getAutobodyRepairShop());
			}
			if (contact.getVendor().getAutoTowingAgency()!=null) {
				ContactsPage.clickAutoTowingAgency(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getAutoTowingAgency());
			}
			if (contact.getVendor().getDoctor()!=null) {
				ContactsPage.clickDoctor(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getDoctor());
			}
			if (contact.getVendor().getMedicalCareOrganization()!=null) {
				ContactsPage.clickMedicalCareOrganization(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getMedicalCareOrganization());
			}
			break;	
		}	
		Log.messageStep("Create Contact : "+contact.getContactType()+" is Processed",DriverManager.getDriver());
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
	 * click "Loss Details"
	 * click Edit button
	 * select fault rating
	 * clicks "update" button
	 */
	@Override
	public void updateLossDetails(LossDetails lossDetails) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());
		actionsPage.clickLossDetails(DriverManager.getDriver());
		new LossDetailsPage(DriverManager.getDriver()).clickEdit(DriverManager.getDriver())
		.selectFaultRating(DriverManager.getDriver(),lossDetails.getFaultRating())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Loss details has been updated",DriverManager.getDriver());
	}
	/**
	 * click "subrogation"
	 * clicks edit button
	 * select status - open , closed
	 * select outcome
	 * clicks update button
	 */
	@Override
	public void addSubrogation(SubrogationDetails subrogationDetails) {
		new ActionsPage(DriverManager.getDriver()).clickSubrogation(DriverManager.getDriver());
		SubrogationPage subrogationPage = new SubrogationPage(DriverManager.getDriver()).clickEdit(DriverManager.getDriver());
		if (!subrogationDetails.getStatus().equals("Open"))subrogationPage.selectSubrogationStatus(DriverManager.getDriver(), subrogationDetails.getStatus());
		if (!subrogationDetails.getStatus().equals("Closed"))subrogationPage.selectSubrogationStatus(DriverManager.getDriver(), subrogationDetails.getStatus());
		if(subrogationDetails.getOutcome()!=null)subrogationPage.selectOutcome(DriverManager.getDriver(), subrogationDetails.getOutcome()).clickUpdate(DriverManager.getDriver());
		subrogationPage.clickUpdate(DriverManager.getDriver())
		.verifySubrogationStatus(DriverManager.getDriver(), subrogationDetails.getStatus());
		Log.messageStep("Subrogation status has been updated as"+subrogationDetails.getStatus(),DriverManager.getDriver());
	}
	/**
	 * Enter firstname, lastname or name
	 * Enter Address, tax id, city
	 * select state
	 * Add roles
	 * @param contactDetails
	 */
	public void addContactInformation(ContactDetails contactDetails) {
		ContactInformationPage newAutoRepairShop = new ContactInformationPage(DriverManager.getDriver());
		if(contactDetails.getFirstName()!=null) newAutoRepairShop.enterFirstname(DriverManager.getDriver(),contactDetails.getFirstName());
		if(contactDetails.getLastName()!=null) newAutoRepairShop.enterLastname(DriverManager.getDriver(), contactDetails.getLastName());
		if(contactDetails.getName()!=null) newAutoRepairShop.enterName(DriverManager.getDriver(),contactDetails.getName());
		if(contactDetails.getAddress()!=null)newAutoRepairShop.enterAddress1(DriverManager.getDriver(),contactDetails.getAddress());
		if(contactDetails.getTaxIdSSN()!=null)newAutoRepairShop.enterSSN(DriverManager.getDriver(),contactDetails.getTaxIdSSN());
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
		case "ADJUDICATE_CLAIM":
			selectServiceToAddPage.clickAdjudicateClaim(DriverManager.getDriver());
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

		}

		selectServiceToAddPage.clickOK(DriverManager.getDriver());
		new AddServicePage(DriverManager.getDriver()).clickSpecialistMenuIcon(DriverManager.getDriver()).moveToNewVendor(DriverManager.getDriver()).clickVendorPerson(DriverManager.getDriver());
		addContactInformation(serviceDetails.getContactDetails());
		addServicePage.clickSubmit(DriverManager.getDriver());
		Log.messageStep("Added services successfully",DriverManager.getDriver());

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
		Log.messageStep("Email has been sent successfully",DriverManager.getDriver());
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
		Log.messageStep("Document has been created",DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * move to "Other"
	 * select any Payment options -recovery, clone check, manual check, Transfer check
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
			break;
		case MET_CHECK:
			actionsPage.clickSummary(DriverManager.getDriver());
			new FinancialsSummaryPage(DriverManager.getDriver()).clickFinancialMenuIcon(DriverManager.getDriver())
			.clickCreateCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			FinancialsChecksPage financialsChecksPage = new FinancialsChecksPage(DriverManager.getDriver())
					.verifyStatus(DriverManager.getDriver(),paymentOptions.getBeforeRunStatus());
			new BatchProcessInfoPage(DriverManager.getDriver()).clickGotoBatchProcess(DriverManager.getDriver())
			.clickRunBatchInfo(DriverManager.getDriver(), paymentOptions.getBatchName());
			actionsPage.clickActions(DriverManager.getDriver()).clickReturnToClaimCenter(DriverManager.getDriver())
			.clickClaimToggleMenu(DriverManager.getDriver()).enterClaimNumber(DriverManager.getDriver(),paymentOptions.getClaimNumber())
			.clickSearchClaim(DriverManager.getDriver());
			actionsPage.clickFinancialsSubMenu(DriverManager.getDriver()).clickFinancialsChecks(DriverManager.getDriver());
			financialsChecksPage.verifyStatus(DriverManager.getDriver(),paymentOptions.getAfterRunStatus());
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

		case CLONE_CHECK:
			actionsPage.clickFinancialsChecks(DriverManager.getDriver());
			new FinancialsChecksPage(DriverManager.getDriver()).clickAmount(DriverManager.getDriver());
			new CheckDetailsPage(DriverManager.getDriver()).clickClone(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;
			
		case CHECK:
			actionsPage.clickActions(DriverManager.getDriver()).clickCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).selectName(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).selectReserveLine(DriverManager.getDriver(),paymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectPaymentType(DriverManager.getDriver(), paymentOptions.getPayment()).
			enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;
		}
		Log.messageStep("Payments Type: "+paymentOptions.getPaymentType()+" is Processed",DriverManager.getDriver());
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
		.enterReserveAmount(DriverManager.getDriver(), reserve.getReserveAmount())
		.clickSave(DriverManager.getDriver());
		new FinancialsTransactionsPage(DriverManager.getDriver()).verifyReserveCreated(DriverManager.getDriver(),reserve.getCoverageType());
		Log.messageStep("Reserve created Successfully",DriverManager.getDriver());
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

		if (exposureDetails.getCloseExposureValue().equalsIgnoreCase("Closed")) {
			new ExposuresPage(DriverManager.getDriver()).clickCheckBoxExposure(DriverManager.getDriver()).clickCloseExposure(DriverManager.getDriver())
			.enterNote(DriverManager.getDriver(),exposureDetails.getNote()).selectOutcome(DriverManager.getDriver(), exposureDetails.getOutcome())
			.clickCloseExposure(DriverManager.getDriver()).verifyStatus(DriverManager.getDriver(), exposureDetails.getCloseExposureValue());
		}
		if (exposureDetails.getOpenExposureValue().equals("Open")) {
			new ExposuresPage(DriverManager.getDriver()).clickType(DriverManager.getDriver()).clickReopenExposure(DriverManager.getDriver())
			.enterNote(DriverManager.getDriver(),exposureDetails.getNote()).selectReason(DriverManager.getDriver(), exposureDetails.getReason())
			.clickReopenExposure(DriverManager.getDriver()).clickupToExposure(DriverManager.getDriver())
			.verifyStatus(DriverManager.getDriver(), exposureDetails.getOpenExposureValue());
		}
		Log.messageStep("Exposure status has been updated",DriverManager.getDriver());
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
	 * Navigate to Action Page click "Close Claim" button
	 * Enter "note" select "outcome" verify Closed status in Status Page
	 * Navigate to Action Page click "Open Claim" button
   � * Enter "note" select "Reason" verify Open status in Status Page
   � * Verify open status in exposure page
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
		Log.messageStep("Claim has reopened successfully",DriverManager.getDriver());
	}	

	/**
	 * click summary 
	 * verify note is created
	 * @param createNote
	 */
	@Override
	public void verifyNoteCreation(CreateNote createNote) {
		new SummaryPage(DriverManager.getDriver()).verifyNoteCreated(DriverManager.getDriver(), createNote.getText());	
	}

	/**
	 *
	 * Used to logout the Application
	 * Click on "Setting" Button
	 * Click on "Logout" Label
	 */
	@Override
	public void logoutTheApplication() {
		new HeaderPage(DriverManager.getDriver()).get().clickSettings(DriverManager.getDriver())
		.clickLogout(DriverManager.getDriver());
		Log.message("Logged out the Application ");
		
	}
	
	/**
	 * Clicks on "Claim"
	 * Enter Claim Number
	 * clicks on "Search"
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


