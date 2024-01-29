package com.aspire.guidewire.cc.teststeps.homeowners;

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
import com.aspire.guidewire.cc.pages.common.ReopenClaimPage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchAddressBookPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.ServicesPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.SubrogationPage;
import com.aspire.guidewire.cc.pages.common.SummaryPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.pages.homeowners.PersonalPropertyPage;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ExposureDataUnavailability;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.SubrogationDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.WorkPlanDataUnavailability;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.SearchClaim;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.pc.teststeps.homeowners.DataFakers;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class HomeOwnersStepsImpl implements HomeOwnersSteps {   
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
		switch(searchPolicy.getPolicyType()) {
		case DWELLING:
			SearchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(),searchPolicy.getPolicyNo());
			break;
		case CONDOMINIUM:
			SearchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo());
			break;
		case RENTAL:
			SearchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo());
			break;
		}
		SearchOrCreatePolicyPage.clickSearch(DriverManager.getDriver()).enterLossDate(DriverManager.getDriver(), searchPolicy.getLossDate());
		String insuredName = SearchOrCreatePolicyPage.getInsuredName(DriverManager.getDriver());
		SearchOrCreatePolicyPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Entered policy number"+searchPolicy.getPolicyType()+"processed for new claim",DriverManager.getDriver());
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
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver()).get().selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause());
		if(claimInfo.getFaultRating()!=null)addClaimInformationPage.selectFaultRating(DriverManager.getDriver(), claimInfo.getFaultRating());

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
	 * @return 
	 */
	@Override
	public String saveAndAssignClaim() {
		new SaveAndAssignClaimPage(DriverManager.getDriver()).get()
		.clickFinish(DriverManager.getDriver());
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
			actionsPage.clickPersonalProperty(DriverManager.getDriver());
			CreateExposure(ChooseCoveragesByType.getCoverage_C().getPersonalProperty());
			break;
		case COVERAGE_D:		
			actionsPage.clickLossOfUse(DriverManager.getDriver());
			CreateExposure(ChooseCoveragesByType.getCoverage_D().getLossOfUse());
			break;

		case COVERAGE_E:
			actionsPage.movetoEPersonalLiability(DriverManager.getDriver());
			if(ChooseCoveragesByType.getCoverage_E().getPersonalLiabilityBodilyInjury()!=null) {
				actionsPage.clickCoverageELiabilityBodilyInjury(DriverManager.getDriver());
				CreateExposureInjuryIncident(ChooseCoveragesByType.getCoverage_E().getPersonalLiabilityBodilyInjury());
			}
			if(ChooseCoveragesByType.getCoverage_E().getPersonalLiabilityGeneral()!=null) {
				Coverage Coverage = ChooseCoveragesByType.getCoverage_E().getPersonalLiabilityGeneral();
				actionsPage.clickCoverageELiabilityGeneral(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver())
						.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
						.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
						.clickUpdate(DriverManager.getDriver());
			}
			if(ChooseCoveragesByType.getCoverage_E().getPersonalLiabilityProperty()!=null) {
				actionsPage.clickCoverageELiabilityProperty(DriverManager.getDriver());
				CreateExposure(ChooseCoveragesByType.getCoverage_E().getPersonalLiabilityProperty());
			}
			break;

		case COVERAGE_F:		
			actionsPage.clickCoverageFMedicalpaymentToOthers(DriverManager.getDriver());
			CreateExposureInjuryIncident(ChooseCoveragesByType.getCoverage_F().getMedicalPaymentsToOthers());
			break;

		case FUNGUS_AND_MOLD_REMEDIATION:
			actionsPage.clickFungusAndRemediation(DriverManager.getDriver());
			CreateExposure(ChooseCoveragesByType.getFungusAndMoldRemediation());
			break;    
		case SCHEDULED_PERSONAL_PROPERY:
			actionsPage.clickScheduledPersonalProperty(DriverManager.getDriver());
			CreateExposure(ChooseCoveragesByType.getScheduledPersonalProperty());
			break;
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
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
		switch(chooseCoverages.getCoverages()) {
		case IDENTITY_THEFT_PROTECTION:
			actionsPage.moveToPolicyLevelCoverage(DriverManager.getDriver());
			Coverage Coverage = chooseCoverages.getIdentityTheftProtection();
			actionsPage.clickIdentityTheftProtection(DriverManager.getDriver());
			if(Coverage.getContactDetails()!=null) {
				newExposurePage.clickClaimant_PickerMenuIcon(DriverManager.getDriver())
				.clickNewPerson(DriverManager.getDriver());
				addContactInformation(Coverage.getContactDetails());
			}
			if(Coverage.getClaimant()!=null)newExposurePage.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant());	
			newExposurePage.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
			.clickUpdate(DriverManager.getDriver());
			break;
		case COVERAGE_A:
			actionsPage.clickAddressCoverage(DriverManager.getDriver());
			actionsPage.clickCoverageADwelling(DriverManager.getDriver());
			CreateExposure(chooseCoverages.getCoverageADwelling());
			break;
		case COVERAGE_B:
			actionsPage.clickAddressCoverage(DriverManager.getDriver());
			actionsPage.clickCoverageBOtherStructures(DriverManager.getDriver());
			CreateExposure(chooseCoverages.getCoverageBOtherStructures());
			break;
		case COVERAGE_C:
			actionsPage.clickAddressCoverage(DriverManager.getDriver());
			actionsPage.clickCoverageCPersonalProperty(DriverManager.getDriver());
			CreateExposure(chooseCoverages.getCoverageCPersonalProperty());
			break;
		case COVERAGE_D:
			actionsPage.clickAddressCoverage(DriverManager.getDriver());
			actionsPage.clickCoverageDLossOfUse(DriverManager.getDriver());
			CreateExposure(chooseCoverages.getCoverageDLossOfUse());
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
	public void CreateExposure(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
		if(Coverage.getContactDetails()!=null) {
			newExposurePage.clickClaimant_PickerMenuIcon(DriverManager.getDriver())
			.clickNewPerson(DriverManager.getDriver());
			addContactInformation(Coverage.getContactDetails());
		}
		if(Coverage.getClaimant()!=null)newExposurePage.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant());	
		newExposurePage	.selectType(DriverManager.getDriver(), Coverage.getClaimantType()).clickIncidentMenuIcon(DriverManager.getDriver())
		.clickNewIncident(DriverManager.getDriver());
		PersonalPropertyPage personalPropertyPage=new PersonalPropertyPage(DriverManager.getDriver());
		if(Coverage.getDescription()!=null) personalPropertyPage.enterDamageLossDescription(DriverManager.getDriver(),Coverage.getDescription());
		if(Coverage.getPropertyName()!=null) personalPropertyPage.selectPropertyName(DriverManager.getDriver(), Coverage.getPropertyName());
		personalPropertyPage.clickOK(DriverManager.getDriver());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Created Exposure by select Coverage type as : "+Coverage.getClaimantType(),DriverManager.getDriver());
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
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType()).clickIncidentMenuIcon(DriverManager.getDriver())
				.clickNewIncident(DriverManager.getDriver());
		new InjuryIncidentPage(DriverManager.getDriver()).selectInjuredPerson(DriverManager.getDriver(), Coverage.getInjuredPerson())
		.selectLossParty(DriverManager.getDriver(), Coverage.getLossParty()).clickOK(DriverManager.getDriver());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Created Exposure Injury Incident by select Coverage type as : "+Coverage.getClaimantType()+" and Injured Person : "+Coverage.getInjuredPerson(),DriverManager.getDriver());
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
	 * Enters name, Firstname, Lastname, TaxId, Address, City, State
	 * Clicks on Update
	 * @param contact
	 */
	@Override
	public void createContact(Contact contact) {
		new ActionsPage(DriverManager.getDriver()).clickPartiesGroup(DriverManager.getDriver()).clickContacts(DriverManager.getDriver());
		ContactsPage ContactsPage = new ContactsPage(DriverManager.getDriver()).clickNewContact(DriverManager.getDriver());
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
		case EXISTING_CONTACT:
			ContactsPage.clickAddExistingContact(DriverManager.getDriver());
			 new SearchAddressBookPage(DriverManager.getDriver()).get()
					.selectType(DriverManager.getDriver(), contact.getExistingContact().getType())
					.enterNameOrLastName(DriverManager.getDriver(), contact.getExistingContact().getFirstName())
					.clickSearch(DriverManager.getDriver())
					.clickSelect(DriverManager.getDriver());
			addContactInformation(contact.getExistingContact());
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
		if(!subrogationDetails.getStatus().equals("Open"))subrogationPage.selectSubrogationStatus(DriverManager.getDriver(), subrogationDetails.getStatus());
		if(!subrogationDetails.getStatus().equals("Closed"))subrogationPage.selectSubrogationStatus(DriverManager.getDriver(), subrogationDetails.getStatus());
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
		AddServicePage addServicePage = new AddServicePage(DriverManager.getDriver())
				.selectRequestType(DriverManager.getDriver(), serviceDetails.getRequestType())
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
		case "ALTERNATIVE_ACCOMMODATION":
			selectServiceToAddPage.clickAlternativeAccommodation(DriverManager.getDriver());
			break;
		case "COMPUTER_EQUIPMENT":
			selectServiceToAddPage.clickComputerEquipment(DriverManager.getDriver());
			break;
		case "ELECTRONICS":
			selectServiceToAddPage.clickElectronics(DriverManager.getDriver());
			break;
		case "FURNITURE":
			selectServiceToAddPage.clickFurniture(DriverManager.getDriver());
			break;
		case "GARDEN":
			selectServiceToAddPage.clickGarden(DriverManager.getDriver());
			break;
		case "KITCHEN_APPLIANCES":
			selectServiceToAddPage.clickKitchenAppliances(DriverManager.getDriver());
			break;
		case "CLEANING":
			selectServiceToAddPage.clickCleaning(DriverManager.getDriver());
			break;
		case "MAKE_SAFE":
			selectServiceToAddPage.clickMakeSafe(DriverManager.getDriver());
			break;
		case "MEDICAL_CARE":
			selectServiceToAddPage.clickMedicalCare(DriverManager.getDriver());
			break;
		case "ARBORIST":
			selectServiceToAddPage.clickArborist(DriverManager.getDriver());
			break;
		case "FLOORING":
			selectServiceToAddPage.clickFlooring(DriverManager.getDriver());
			break;
		case "PLASTER":
			selectServiceToAddPage.clickPlaster(DriverManager.getDriver());
			break;
		case "WINDOWS":
			selectServiceToAddPage.clickWindows(DriverManager.getDriver());
			break;
		case "DEBRIS_REMOVAL":
			selectServiceToAddPage.clickDebrisRemoval(DriverManager.getDriver());
			break;
		case "INDEPENDENT_APPRAISAL":
			selectServiceToAddPage.clickIndependentAppraisal(DriverManager.getDriver());
			break;
			
		}

		selectServiceToAddPage.clickOK(DriverManager.getDriver());
		new AddServicePage(DriverManager.getDriver()).clickSpecialistMenuIcon(DriverManager.getDriver()).moveToNewVendor(DriverManager.getDriver()).clickVendorPerson(DriverManager.getDriver());
		addContactInformation(serviceDetails.getContactDetails());
		addServicePage.clickSubmit(DriverManager.getDriver());
		Log.messageStep("Claim the services : Request Type : "+serviceDetails.getRequestType()+"and fill Contact Information "+serviceDetails.getContactDetails(),DriverManager.getDriver());
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
			NewDocumentPage newDocumentPage = new NewDocumentPage(DriverManager.getDriver()).clickSearchDocumentIcon(DriverManager.getDriver());
			if(chooseDocumentsByType.getTemplateClaim().getType()!=null)newDocumentPage.selectType(DriverManager.getDriver(), chooseDocumentsByType.getTemplateClaim().getType());
			if(chooseDocumentsByType.getTemplateClaim().getJurisdiction()!=null)newDocumentPage.selectJurisdictionState(DriverManager.getDriver(), chooseDocumentsByType.getTemplateClaim().getJurisdiction());
			newDocumentPage.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver()).clickCreateDocument(DriverManager.getDriver());
			newDocumentPage.clickUpdateButton(DriverManager.getDriver());
			break;

		case UPLOAD_DOCUMENT:
			if(chooseDocumentsByType.getUploadDocument().isNewDocument()) {
				new ActionsPage(DriverManager.getDriver()).clickNewDocumentButton(DriverManager.getDriver());
			}
			new ActionsPage(DriverManager.getDriver())
			.clickUploadDocument(DriverManager.getDriver());
			new NewDocumentPage(DriverManager.getDriver())
			.documentAttach(DriverManager.getDriver(), chooseDocumentsByType.getUploadDocument().getDocumentName())
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
		new EditReservesPage(DriverManager.getDriver()).get()
		.selectExposure(DriverManager.getDriver())
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
	public void updateExposureStatus(ExposureDetails exposureDetails) {
		new ActionsPage(DriverManager.getDriver()).clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver());
		new ActionsPage(DriverManager.getDriver()).clickExposure(DriverManager.getDriver());
		new ExposuresPage(DriverManager.getDriver()).clickCheckBoxExposure(DriverManager.getDriver()).clickCloseExposure(DriverManager.getDriver())
		.enterNote(DriverManager.getDriver(),exposureDetails.getNote()).selectOutcome(DriverManager.getDriver(), exposureDetails.getOutcome())
		.clickCloseExposure(DriverManager.getDriver()).verifyStatus(DriverManager.getDriver(), exposureDetails.getCloseExposureValue());
		if (exposureDetails.getOpenExposureValue()!=null) {
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
		new ReopenClaimPage(DriverManager.getDriver())
		.enterNote(DriverManager.getDriver(),reOpenClaim.getNote())
		.selectReason(DriverManager.getDriver(),reOpenClaim.getReOpenReason())
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
		Log.messageStep("Note is created",DriverManager.getDriver());
	}

	/**
	 * click Exposure
	 * Used to verify the "No Data to Display" message in Exposure Page
	 * @param exposureDataUnavailability
	 */
	@Override
	public void verifyExposureDataUnavailability(ExposureDataUnavailability exposureDataUnavailability) {
		new ActionsPage(DriverManager.getDriver()).clickExposure(DriverManager.getDriver());
		new ExposuresPage(DriverManager.getDriver()).get()
		.verifyNoDataMessage(DriverManager.getDriver(), exposureDataUnavailability.getDataMessage());
		Log.messageStep("Verified "+exposureDataUnavailability.getDataMessage()+" Message",DriverManager.getDriver());

	}

	/**
	 * Used to verify the "No Data to Display" message in Work Plan Page
	 * Click on the open "Work Plan" Check box
	 * Click on "Complete" button
	 * Verify "No Data to Display" Message
	 * @param workPlanDataUnavailability
	 */
	@Override
	public void verifyWorkPlanDataUnavailability(WorkPlanDataUnavailability workPlanDataUnavailability) {
		new ActionsPage(DriverManager.getDriver()).get().clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).get().clickCheckBoxWorkplan(DriverManager.getDriver())
		.verifyNoDataMessage(DriverManager.getDriver(), workPlanDataUnavailability.getDataMessage());
		Log.messageStep("Verified "+workPlanDataUnavailability.getDataMessage()+" Message",DriverManager.getDriver());	}


	/**
	 * Used to close the Claim
	 * Click on "Actions" Button
	 * Click on "Close Claim" Button
	 * Enter "Close Claim Notes" 
	 * Select "Outcome"
	 * Click on "Close Claim"
	 * Click on "Summary"
	 * Click on "Status"
	 * Verify Status as "Closed"
	 * @param closeClaim
	 */
	@Override
	public void closeClaim(CloseClaim closeClaim) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).get()
		.clickCloseClaim(DriverManager.getDriver());
		 new CloseClaimPage(DriverManager.getDriver()).get().enterNote(DriverManager.getDriver(),closeClaim.getNote())
		    .selectOutcome(DriverManager.getDriver(),closeClaim.getOutcome())
		    .clickCloseClaim(DriverManager.getDriver())
		    .clickSummary(DriverManager.getDriver()).clickStatus(DriverManager.getDriver())
		    .VerifyStatus(DriverManager.getDriver(), closeClaim.getClosedStatus());
		 Log.messageStep("Claim Closed is Processed ",DriverManager.getDriver());
	}
		/**
		 * Clicks on "Claims Toggle menu"
		 * Enter Claim Number and click on search
		 * @return insured name
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
