package com.aspire.guidewire.cc.teststeps.commercialauto;

import com.aspire.guidewire.cc.pages.commercialauto.NewAutoTowingAgencyPage;
import com.aspire.guidewire.cc.pages.commercialauto.SelectInvolvedPolicyVehiclesPage;
import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage.NewPropertyIncidentPage;
import com.aspire.guidewire.cc.pages.common.AddServicePage;
import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.cc.pages.common.BasicInformationPage;
import com.aspire.guidewire.cc.pages.common.BatchProcessInfoPage;
import com.aspire.guidewire.cc.pages.common.CheckDetailsPage;
import com.aspire.guidewire.cc.pages.common.ContactInformationPage;
import com.aspire.guidewire.cc.pages.common.ContactsPage;
import com.aspire.guidewire.cc.pages.common.CreateRecoveryPage;
import com.aspire.guidewire.cc.pages.common.EditReservesPage;
import com.aspire.guidewire.cc.pages.common.EnterPayeeInformationPage;
import com.aspire.guidewire.cc.pages.common.EnterPaymentInformationPage;
import com.aspire.guidewire.cc.pages.common.ExposuresPage;
import com.aspire.guidewire.cc.pages.common.FinancialsChecksPage;
import com.aspire.guidewire.cc.pages.common.FinancialsSummaryPage;
import com.aspire.guidewire.cc.pages.common.FinancialsTransactionsPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.InjuryIncidentPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.NewDocumentPage;
import com.aspire.guidewire.cc.pages.common.NewExposurePage;
import com.aspire.guidewire.cc.pages.common.NewVehicleIncidentPage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.ServicesPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.TowingAgency;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class CommercialAutoStepsImpl implements CommercialAutoSteps {

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
		SearchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo()).clickSearch(DriverManager.getDriver()).enterLossDate(DriverManager.getDriver(), searchPolicy.getLossDate());
		String insuredName = SearchOrCreatePolicyPage.getInsuredName(DriverManager.getDriver());
		SearchOrCreatePolicyPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Entered policy number "+searchPolicy.getPolicyNo()+" processed for new claim",DriverManager.getDriver());
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
		BasicInformationPage basicInformationPage = new BasicInformationPage(DriverManager.getDriver()).get()
				.selectName(DriverManager.getDriver(), basicInfo.getInsuredName());
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
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver()).selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause())
				.enterCity(DriverManager.getDriver(), claimInfo.getCity())
				.selectState(DriverManager.getDriver(), claimInfo.getState());

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
		Log.messageStep("Claim Information was added",DriverManager.getDriver());
	}

	/**
	 * clicks on the "TowingToggleSubMenu" and "NewAutoTowingAgency"
	 * enter the name, taxid
	 * Clicks on "update" and "uplicateContactCancel"
	 * click update
	 * click next
	 *  @param towingAgency
	 */
	@Override
	public void addServices(TowingAgency towingAgency) {
		ServicesPage servicesPage = new ServicesPage(DriverManager.getDriver());
		servicesPage.clickTowingCheckBox(DriverManager.getDriver())
		.clickTowingToggleSubMenu(DriverManager.getDriver())
		.clickNewAutoTowingAgency(DriverManager.getDriver());
		NewAutoTowingAgencyPage newAutoTowingAgencyPage = new NewAutoTowingAgencyPage(DriverManager.getDriver()).get()
				.enterName(DriverManager.getDriver(), towingAgency.getName())
				.enterTaxIDEIN(DriverManager.getDriver(), towingAgency.getTaxId());
		newAutoTowingAgencyPage.clickUpdate(DriverManager.getDriver());

		
		if(newAutoTowingAgencyPage.checkDuplicateContactIsThere(DriverManager.getDriver())) {
			newAutoTowingAgencyPage.clickCancelButton(DriverManager.getDriver())
			.clickUpdate(DriverManager.getDriver());
		}
		servicesPage.selectPickUpLocation(DriverManager.getDriver());
		servicesPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Service is added by Entering New Towing Agency Name : "+towingAgency.getName()+" and Towing Agency Tax Id : "+towingAgency.getTaxId()+"and Serivces is Successfully Added",DriverManager.getDriver());

	}

	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
	 */
	@Override
	public String saveAndAssignClaim() {
		new SaveAndAssignClaimPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
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
		new NewClaimSavedPage(DriverManager.getDriver()).clickGoToClaim(DriverManager.getDriver());
	}
	
	/**
	 * clicks on "Action"
	 * clicks on choose by coverage Type
	 * clicks coverage type "C, D, E, P, T, U, H"
	 * clicks on coverage
	 * Create Exposure for Vehicle incident or Injury incident
	 * @param ChooseCoveragesByType
	 */
	@Override
	public void addCoveragesByType(ChooseCoveragesByType ChooseCovearges) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverageType(DriverManager.getDriver());
		switch(ChooseCovearges.getCoverages()) {
		case COVERAGE_C:
			actionsPage.moveToCoverageC_CA(DriverManager.getDriver());
			if (ChooseCovearges.getCoverage_C().getCollision()!=null) {
				actionsPage.clickCollision(DriverManager.getDriver());
				createExposureVehicleIncident(ChooseCovearges.getCoverage_C().getCollision());
			}
			if (ChooseCovearges.getCoverage_C().getComprehensive()!=null) {
				actionsPage.clickComprehensive(DriverManager.getDriver());
				createExposureVehicleIncident(ChooseCovearges.getCoverage_C().getComprehensive());
			}
			break;

		case COVERAGE_P:
			actionsPage.moveToP(DriverManager.getDriver());
			if(ChooseCovearges.getCoverage_P().getPIP_Kentucky()!=null) {
				actionsPage.clickPipKentuckyCoverage(DriverManager.getDriver());
				createExposureInjuryIncident(ChooseCovearges.getCoverage_P().getPIP_Kentucky());
			}
			break;

		case COVERAGE_T:
			actionsPage.moveToT(DriverManager.getDriver());
			if(ChooseCovearges.getCoverage_T().getTapeAndDisc()!=null) {
				Coverage Coverage = ChooseCovearges.getCoverage_T().getTapeAndDisc();
				actionsPage.clickTapeDiscCoverage(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
				.clickUpdate(DriverManager.getDriver());
			}
			if(ChooseCovearges.getCoverage_T().getTowingAndLabor()!=null) {
				Coverage Coverage = ChooseCovearges.getCoverage_T().getTowingAndLabor();
				actionsPage.clickTowingAndLabor(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
				.clickUpdate(DriverManager.getDriver());
			}
			break;
		case COVERAGE_D:
			actionsPage.moveToD(DriverManager.getDriver());
			actionsPage.clickDeathAndDisability(DriverManager.getDriver());
			createExposureInjuryIncident(ChooseCovearges.getCoverage_D().getDeathAndDisability());
			break;
		case COVERAGE_E:
			actionsPage.moveToE(DriverManager.getDriver());
			actionsPage.clickElectronicEquipmentCoverage(DriverManager.getDriver());
			createExposureVehicleIncident(ChooseCovearges.getCoverage_E().getElectronicEquipment());
			break;
		case COVERAGE_R:
			actionsPage.moveToR(DriverManager.getDriver());
			if(ChooseCovearges.getCoverage_R().getRentalReimbursement()!=null) {
				actionsPage.clickRentalReimbursement(DriverManager.getDriver());
				createExposureVehicleIncident(ChooseCovearges.getCoverage_R().getRentalReimbursement());
			}
			if(ChooseCovearges.getCoverage_R().getRentalCarLossOfUse()!=null) {
				Coverage Coverage = ChooseCovearges.getCoverage_R().getRentalCarLossOfUse();
				actionsPage.clickRentalCarLossOfUse(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType()).selectLoaction(DriverManager.getDriver())
				.clickUpdate(DriverManager.getDriver());
			}
			break;
		case COVERAGE_U:
			actionsPage.moveToU(DriverManager.getDriver());
			if(ChooseCovearges.getCoverage_U().getUninsuredMotoristsPropertyDamage()!=null) {
				actionsPage.clickUninsuredMotoristsPropertyDamage(DriverManager.getDriver());
				createExposureVehicleIncident(ChooseCovearges.getCoverage_U().getUninsuredMotoristsPropertyDamage());
			}
			if(ChooseCovearges.getCoverage_U().getUnderInsuredMotoristsPropertyDamage()!=null) {
				actionsPage.clickUnderInsuredMotoristsPropertyDamage(DriverManager.getDriver());
				createExposureVehicleIncident(ChooseCovearges.getCoverage_U().getUnderInsuredMotoristsPropertyDamage());
			}

		case COVERAGE_H:
			actionsPage.moveToH(DriverManager.getDriver());
			if (ChooseCovearges.getCoverage_H().getHiredAutoLiability().getHiredAutoLiability_BI()!=null) {
				actionsPage.clickHiredAutoLiability(DriverManager.getDriver());
				actionsPage.clickHiredAutoLiabilityVehicleDamage(DriverManager.getDriver());
				createExposureVehicleIncident(ChooseCovearges.getCoverage_H().getHiredAutoLiability().getHiredAutoLiability_BI());
			}
			break;
		default:
			break;
		}
		Log.messageStep("Coverage By Type is Added Successfully for "+ChooseCovearges.getCoverages(),DriverManager.getDriver());
	}

	/**
	 * clicks on "Action"
	 * clicks on choose by coverage
	 * clicks on Policy level Coverage
	 * clicks on coverage
	 * Create Exposure for Vehicle incident or Injury incident
	 * @param ChooseCovearges
	 */
	public void addCoverages(ChooseCoverages chooseCoverages) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		actionsPage.moveToChooseByCoverage(DriverManager.getDriver());
		switch(chooseCoverages.getCoverages()) {
		case LIABILITY_BODILY_INJURY_PROPERTY_DAMAGE:
			actionsPage.moveToPolicyLevelCoverage(DriverManager.getDriver());
			actionsPage.moveToLiabilityBodilyInjuryPropertyDamage_CA(DriverManager.getDriver());
			if(chooseCoverages.getLiability_Coverage().getLiability_BodilyInjury()!=null)
				actionsPage.clickLiabilityBodilyInjury_CA(DriverManager.getDriver());
			createExposureInjuryIncident(chooseCoverages.getLiability_Coverage().getLiability_BodilyInjury());
			break;


		case MEXICO_COVERAGE_LIMITED:
			actionsPage.moveToPolicyLevelCoverage(DriverManager.getDriver());
			actionsPage.moveMexicoCovLimited(DriverManager.getDriver());
			if(chooseCoverages.getMexicoCoverage().getMexicoCoverage_BI()!=null) {
				actionsPage.clickMexicoCov_BI(DriverManager.getDriver());
				createExposureInjuryIncident(chooseCoverages.getMexicoCoverage().getMexicoCoverage_BI());
			}
			if(chooseCoverages.getMexicoCoverage().getMexicoCoverage_PD()!=null) {
				Coverage Coverage = chooseCoverages.getMexicoCoverage().getMexicoCoverage_PD();
				actionsPage.clickMexicoCov_PD(DriverManager.getDriver());
				new NewExposurePage(DriverManager.getDriver()).selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
				.clickUpdate(DriverManager.getDriver());
			}
			break;
		case UNINSURED_MOTORISTS_BODILY_INJURY:
			actionsPage.moveToAddedVehicleCoverage(DriverManager.getDriver());
			actionsPage.clickUninsuredMotoristsBodilyInjury_CA(DriverManager.getDriver());
			new NewExposurePage(DriverManager.getDriver()).clickClaimant_PickerMenuIcon(DriverManager.getDriver())
					.clickNewPerson(DriverManager.getDriver());
			addContactInformation(chooseCoverages.getContactDetails());
			createExposureInjuryIncident(chooseCoverages.getUninsuredMotoristsodilyInjury());
			break;
		default:
			break;
		}
		Log.messageStep("Coverages is Added Successfully for "+chooseCoverages.getCoverages(),DriverManager.getDriver());

	}

	/**
	 * select the claimant and type
	 * clicks on Incident menuIcon and click new Incident
	 * select the "selected vehicle" and "Driver name"
	 * Enter Vin,year,Make
	 * Select the loss occured
	 * Click Update
	 * @param Covearges
	 */
	@Override
	public void createExposureVehicleIncident(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver()).get()
				.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant())
				.selectType(DriverManager.getDriver(), Coverage.getClaimantType())
				.clickIncidentMenuIcon(DriverManager.getDriver())
				.clickNewIncident(DriverManager.getDriver());
		NewVehicleIncidentPage NewVehicleIncidentPage = new NewVehicleIncidentPage(DriverManager.getDriver()).get()
				.selectDriverName(DriverManager.getDriver(),Coverage.getDriverName())
				.selectSelectvehicle(DriverManager.getDriver(),Coverage.getVehicle())
				.enterYear(DriverManager.getDriver(), Coverage.getYear()).enterMake(DriverManager.getDriver(), Coverage.getMake()).enterModel(DriverManager.getDriver(), Coverage.getModel())
				.enterVIN(DriverManager.getDriver(), Coverage.getVin());

		if(Coverage.getDescription()!=null) NewVehicleIncidentPage.enterDamageDescription(DriverManager.getDriver(), Coverage.getDescription());
		NewVehicleIncidentPage.selectLossOccurred(DriverManager.getDriver(), Coverage.getLossOccurred()).clickOK(DriverManager.getDriver());
		newExposurePage.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Created Exposure Vehicle Incident by select Coverage type as : "+Coverage.getClaimantType()+" and Incident Vehicle Driver Name : "+Coverage.getDriverName(),DriverManager.getDriver());
	}

	/**
	 * select the claimant and type
	 * clicks on Incident menuIcon and click new Incident
	 * select the "Injured person" and "Loss party"
	 * Click Update
	 * @param covearge
	 */
	@Override
	public void createExposureInjuryIncident(Coverage Coverage){
		NewExposurePage newExposurePage = new NewExposurePage(DriverManager.getDriver());
		if(Coverage.getClaimant()!= null) newExposurePage.selectClaimant(DriverManager.getDriver(), Coverage.getClaimant());
		if(Coverage.getClaimantType()!=null) newExposurePage.selectType(DriverManager.getDriver(), Coverage.getClaimantType());
		newExposurePage.clickIncidentMenuIcon(DriverManager.getDriver());
		newExposurePage.clickNewIncident(DriverManager.getDriver());
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
		.enterText(DriverManager.getDriver(), createNote.getText())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Note is created ",DriverManager.getDriver());
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
		new ActionsPage(DriverManager.getDriver()).get()
		.clickPartiesGroup(DriverManager.getDriver())
		.clickContacts(DriverManager.getDriver());
		ContactsPage ContactsPage = new ContactsPage(DriverManager.getDriver()).get()
				.clickNewContact(DriverManager.getDriver());
		switch(contact.getContactType()) {
		case PERSON:
			ContactsPage.clickPerson(DriverManager.getDriver());
			addContactInformation(contact.getPerson());
			Log.messageStep("Contact is created using "+contact.getPerson(),DriverManager.getDriver());
			break;

		case COMPANY:
			ContactsPage.clickCompany(DriverManager.getDriver());
			addContactInformation(contact.getCompany());
			Log.messageStep("Contact is created using "+contact.getCompany(),DriverManager.getDriver());
			break;

		case VENDOR:
			ContactsPage.clickVendor(DriverManager.getDriver());
			if (contact.getVendor().getAutobodyRepairShop()!=null) {
				ContactsPage.clickAutobodyRepairShop(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getAutobodyRepairShop());
				Log.messageStep("Contact is created using "+contact.getVendor().getAutobodyRepairShop(),DriverManager.getDriver());
			}
			if (contact.getVendor().getAutoTowingAgency()!=null) {
				ContactsPage.clickAutoTowingAgency(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getAutoTowingAgency());
				Log.messageStep("Contact is created using "+contact.getVendor().getAutoTowingAgency(),DriverManager.getDriver());
			}
			if (contact.getVendor().getDoctor()!=null) {
				ContactsPage.clickDoctor(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getDoctor());
				Log.messageStep("Contact is created using "+contact.getVendor().getDoctor(),DriverManager.getDriver());
			}
			if (contact.getVendor().getMedicalCareOrganization()!=null) {
				ContactsPage.clickMedicalCareOrganization(DriverManager.getDriver());
				addContactInformation(contact.getVendor().getMedicalCareOrganization());
				Log.messageStep("Contact is created using "+contact.getVendor().getMedicalCareOrganization(),DriverManager.getDriver());
			}
			break;
		default:
			break;	
		}

	}

	/**
	 * clicks on "Involved policy check box"
	 * Clicked on "next"
	 */
	@Override
	public void SelectInvolvedPolicyVehicle() {
		new SelectInvolvedPolicyVehiclesPage(DriverManager.getDriver()).get()
		.clickSelected(DriverManager.getDriver())
		.clickNext(DriverManager.getDriver());
		Log.messageStep("Involved policy is selected ",DriverManager.getDriver());

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
		new FinancialsTransactionsPage(DriverManager.getDriver()).get()
		.verifyReserveCreated_CA(DriverManager.getDriver(),reserve.getCoverageType());
		Log.messageStep("Create Reserve for by selecting Cost Type : "+ reserve.getCostType()+"and Cost Category : "+reserve.getCostCategory(),DriverManager.getDriver());
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
	public void paymentChecks(PaymentOptions PaymentOptions) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());			
		switch(PaymentOptions.getPaymentType()) {
		case RECOVERY:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver());
			actionsPage.clickRecovery(DriverManager.getDriver());
			new CreateRecoveryPage(DriverManager.getDriver())
			.selectPayer(DriverManager.getDriver())
			.selectReserveLine(DriverManager.getDriver(),PaymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), PaymentOptions.getCostType())
			.selectCostCategory(DriverManager.getDriver(), PaymentOptions.getCostCategory())
			.selectRecoveryCategory(DriverManager.getDriver(), PaymentOptions.getRecoveryCategory())
			.enterAmount(DriverManager.getDriver(), PaymentOptions.getAmount())
			.clickUpdate(DriverManager.getDriver());
			Log.messageStep("Create Recovery by selecting Category: "+PaymentOptions.getRecoveryCategory()+" and Reserve  Line as : "+PaymentOptions.getReserveLine(),DriverManager.getDriver());
			break;
		case MANUAL_CHECK:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver());
			actionsPage.clickManualCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver())
			.selectName(DriverManager.getDriver())
			.enterCity(DriverManager.getDriver(),PaymentOptions.getCity())
			.selectState(DriverManager.getDriver(),PaymentOptions.getState())
			.clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).get()
			.selectReserveLine(DriverManager.getDriver(),PaymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), PaymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), PaymentOptions.getCostCategory())
			.selectPaymentType(DriverManager.getDriver(), PaymentOptions.getPayment())
			.enterAmount(DriverManager.getDriver(), PaymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			Log.messageStep("Choose Payment Checks by Selecting Payment Type: "+PaymentOptions.getPayment()+" and Enter the Payment Amount : "+PaymentOptions.getAmount(),DriverManager.getDriver());
			break;
		case TRANSFER_CHECK:
			actionsPage.clickWorkPlan(DriverManager.getDriver());
			new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver()).clickComplete(DriverManager.getDriver());
			actionsPage.clickFinancialsChecks(DriverManager.getDriver());
			new FinancialsChecksPage(DriverManager.getDriver()).clickAmount(DriverManager.getDriver());
			new CheckDetailsPage(DriverManager.getDriver()).clickTransfer(DriverManager.getDriver());
			TransferCheckPage transferCheckPage = new TransferCheckPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver());
			new SearchClaimsPage(DriverManager.getDriver()).enterClaim(DriverManager.getDriver(), PaymentOptions.getClaimNumber())
			.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver());
			Log.messageStep("Transfer Checks by Enter Claim number: "+PaymentOptions.getClaimNumber(),DriverManager.getDriver());
			transferCheckPage.clickTransfer(DriverManager.getDriver());
			break;
		case MET_CHECK:
			actionsPage.clickSummary(DriverManager.getDriver());
			new FinancialsSummaryPage(DriverManager.getDriver()).clickFinancialMenuIcon(DriverManager.getDriver())
			.clickCreateCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).enterAmount(DriverManager.getDriver(), PaymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			FinancialsChecksPage financialsChecksPage = new FinancialsChecksPage(DriverManager.getDriver())
					.verifyStatus(DriverManager.getDriver(),PaymentOptions.getBeforeRunStatus());
			new BatchProcessInfoPage(DriverManager.getDriver()).clickGotoBatchProcess(DriverManager.getDriver())
			.clickRunBatchInfo(DriverManager.getDriver(), PaymentOptions.getBatchName());
			actionsPage.clickActions(DriverManager.getDriver()).clickReturnToClaimCenter(DriverManager.getDriver())
			.clickClaimToggleMenu(DriverManager.getDriver()).enterClaimNumber(DriverManager.getDriver(),PaymentOptions.getClaimNumber())
			.clickSearchClaim(DriverManager.getDriver());
			actionsPage.clickFinancialsSubMenu(DriverManager.getDriver()).clickFinancialsChecks(DriverManager.getDriver());
			financialsChecksPage.verifyStatus(DriverManager.getDriver(),PaymentOptions.getAfterRunStatus());
			Log.messageStep("Met_check by Enter Claim number: "+PaymentOptions.getClaimNumber(),DriverManager.getDriver());
			break;
		default:
			break;
		}
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
		Log.messageStep("Contact information name : "+contactDetails.getFirstName()+contactDetails.getLastName()+"Contact information Address : "+contactDetails.getAddress()+"Contact information State :"+contactDetails.getState()+"Contact information City :"+contactDetails.getCity(),DriverManager.getDriver());
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
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickService(DriverManager.getDriver());
		AddServicePage addServicePage = new AddServicePage(DriverManager.getDriver()).get()
				.selectRequestType(DriverManager.getDriver(), serviceDetails.getRequestType())
				.selectServiceAddress(DriverManager.getDriver())
				.clickAdd(DriverManager.getDriver());
		SelectServiceToAddPage selectServiceToAddPage = new SelectServiceToAddPage(DriverManager.getDriver()).get();
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
		new AddServicePage(DriverManager.getDriver())
		.clickSpecialistMenuIcon(DriverManager.getDriver())
		.moveToNewVendor(DriverManager.getDriver()).clickVendorPerson(DriverManager.getDriver());
		addContactInformation(serviceDetails.getContactDetails());
		addServicePage.clickSubmit(DriverManager.getDriver());
		Log.messageStep("Claim the services : Request Type : "+serviceDetails.getRequestType()+"and fill Contact Information "+serviceDetails.getContactDetails(),DriverManager.getDriver());
	}

	/**
	 * Navigate to Document Page page from action menu by clicking Template Claim Button
	 * select Type and Jurisdiction type in Documents page
	 * Click Create document button 
	 * Click Update button
	 */

	@Override
	public void newDocumentClaim(ChooseDocumentsByType chooseDocumentsByType) {
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
			.selectSearchFor(DriverManager.getDriver(),assignClaim.getSearchFor())
			.clickSearch(DriverManager.getDriver())
			.clickSelect(DriverManager.getDriver());
			break;
		}	
		Log.messageStep("Save and Assign Claim are Processed for assign type "+assignClaim.getAssignType(),DriverManager.getDriver());
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
}
