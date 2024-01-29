package com.aspire.guidewire.cc.teststeps.workerscompensation;

import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage;
import com.aspire.guidewire.cc.pages.common.AddServicePage;
import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.cc.pages.common.BasicInformationPage;
import com.aspire.guidewire.cc.pages.common.CheckDetailsPage;
import com.aspire.guidewire.cc.pages.common.CloseClaimPage;
import com.aspire.guidewire.cc.pages.common.CloseExposurePage;
import com.aspire.guidewire.cc.pages.common.ContactInformationPage;
import com.aspire.guidewire.cc.pages.common.DocumentPage;
import com.aspire.guidewire.cc.pages.common.EditReservesPage;
import com.aspire.guidewire.cc.pages.common.EmailPage;
import com.aspire.guidewire.cc.pages.common.EnterPayeeInformationPage;
import com.aspire.guidewire.cc.pages.common.EnterPaymentInformationPage;
import com.aspire.guidewire.cc.pages.common.FinancialsChecksPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.IndemnityPage;
import com.aspire.guidewire.cc.pages.common.LossDetailsPage;
import com.aspire.guidewire.cc.pages.common.MedicalDetailsPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.SelectServiceToAddPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.StatusPage;
import com.aspire.guidewire.cc.pages.common.SummaryPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimStatus;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseExposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Exposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ServiceDetails;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class WorkersCompensationStepsImpl implements WorkersCompensationSteps {

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
		new HeaderPage(DriverManager.getDriver())
		.clicktoggleClaimSubMenu(DriverManager.getDriver())
		.clickNewClaim(DriverManager.getDriver());
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
		SearchOrCreatePolicyPage searchOrCreatePolicyPage = new SearchOrCreatePolicyPage(DriverManager.getDriver()).get();
		searchOrCreatePolicyPage.enterPolicy(DriverManager.getDriver(), searchPolicy.getPolicyNo()).clickSearch(DriverManager.getDriver()).enterLossDate(DriverManager.getDriver(), searchPolicy.getLossDate());
		String insuredName = searchOrCreatePolicyPage.getInsuredName(DriverManager.getDriver());
		searchOrCreatePolicyPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Entered policy number"+searchPolicy.getPolicyNo()+"processed for new claim",DriverManager.getDriver());
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
				.selectName(DriverManager.getDriver(), basicInfo.getReportedByName());
		basicInformationPage.selectInjuredWorkerName(DriverManager.getDriver(), basicInfo.getInjuredWorkerName());
		basicInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep("Basic Information Insured Name : "+basicInfo.getInsuredName()+" and Relation to Insured : "+ basicInfo.getRelationToInsured()+" is entered",DriverManager.getDriver());
	}
	/**
	 * Select "location"
	 * Select "Cause of Injury"
	 * click Medical Attention radio button
	 * Click Injury Illness result In Death radio button
	 * Click No Lost Time Work radio button
	 * CLick on Next 
	 * @param claimInfo
	 */
	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver()).get();
		if (claimInfo.isIncidentOnly()) {
			addClaimInformationPage.clickIncidentOnly(DriverManager.getDriver());
		}
		if(claimInfo.getInjuryDescription()!=null) 
			addClaimInformationPage.enterInjuryDescription(DriverManager.getDriver(), claimInfo.getInjuryDescription());
		addClaimInformationPage.enterDateEmployerNotified(DriverManager.getDriver(), claimInfo.getDateEmployerNotified())
		.selectLocation(DriverManager.getDriver())
		.selectCauseofInjurySource(DriverManager.getDriver(), claimInfo.getInjurySource())
		.clickNoMedicalAttention(DriverManager.getDriver())
		.clickInjuryIllnessresultInDeath(DriverManager.getDriver(),claimInfo.getRadioButtonOptions())
		.clickNoLostTimeWork(DriverManager.getDriver())
		.clickNext(DriverManager.getDriver());
		Log.messageStep("Add Claim Information : Cause of Injury : "+claimInfo.getInjurySource()+" and Injury Illness result In Death : "+claimInfo.getRadioButtonOptions(),DriverManager.getDriver());
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
	 * clicks on "Actions"
	 * clicks on  Assign
	 * choose radio button "select form list","Search by location","Search by Distance from location"
	 * selects country if needed
	 * @param assignClaim
	 **/
	@Override
	public void assignClaim(AssignClaim assignClaim) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickAssignClaim(DriverManager.getDriver());
		AssignPage assignpage = new AssignPage(DriverManager.getDriver());
		switch(assignClaim.getAssignType()) {

		case SELECT_FROM_LIST:
			assignpage.clickSelectFromList(DriverManager.getDriver())
			.clickAssign(DriverManager.getDriver());
			break;

		case SEARCH_BY_LOCATION:
			assignpage.clickSearchbyLocation(DriverManager.getDriver())
			.selectCountry(DriverManager.getDriver(), assignClaim.getCountry())
			.clickSearch(DriverManager.getDriver())
			.clickSelect(DriverManager.getDriver());
			break;
		}
		Log.messageStep("Assign Claim by Searching Location : "+ assignClaim.getCountry(),DriverManager.getDriver());

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
	public void createReserve(Exposure exposure) {
		EditReservesPage editReservesPage = new EditReservesPage(DriverManager.getDriver());
		Reserve reserve = exposure.getReserve();
		switch(exposure.getExposure()) {
		case MEDICAL_DETAILS:
			new SummaryPage(DriverManager.getDriver()).clickMedicalDetails(DriverManager.getDriver());
			new MedicalDetailsPage(DriverManager.getDriver()).clickCreateReserve(DriverManager.getDriver());
			editReservesPage.selectCostType(DriverManager.getDriver(),reserve.getCostType())
			.selectCostCategory(DriverManager.getDriver(), reserve.getCostCategory())
			.enterNewAvailableReserves(DriverManager.getDriver(), reserve.getNewAvailableReserves());
			editReservesPage.clickSave(DriverManager.getDriver());
			break;
		case INDEMNITY:
			new SummaryPage(DriverManager.getDriver()).clickIndemnity(DriverManager.getDriver());
			new IndemnityPage(DriverManager.getDriver()).clickCreateReserve(DriverManager.getDriver());
			editReservesPage.selectCostType(DriverManager.getDriver(),reserve.getCostType())
			.selectCostCategory(DriverManager.getDriver(), reserve.getCostCategory())
			.enterNewAvailableReserves(DriverManager.getDriver(), reserve.getNewAvailableReserves());
			editReservesPage.clickSave(DriverManager.getDriver());
			break;
		}
		Log.messageStep("Create Reserve for by selecting Cost Type : "+ reserve.getCostType()+"and Cost Category : "+reserve.getCostCategory(),DriverManager.getDriver());
	}
	/**
	 * select "Exposure" 
	 * Verify Exposure is created or not
	 * @param exposure
	 */
	@Override
	public void verifyExposure(Exposure exposure) {
		switch(exposure.getExposure()) {
		case MEDICAL_DETAILS:
			new SummaryPage(DriverManager.getDriver()).clickMedicalDetails(DriverManager.getDriver());
			new MedicalDetailsPage(DriverManager.getDriver()).verifyExposureCreated(DriverManager.getDriver(), exposure.getName());
			break;

		case INDEMNITY:
			new SummaryPage(DriverManager.getDriver()).clickIndemnity(DriverManager.getDriver());
			new IndemnityPage(DriverManager.getDriver()).verifyExposureCreated(DriverManager.getDriver(),exposure.getName());
			break;
		}
		Log.messageStep("Exposure is Created Successfully",DriverManager.getDriver());

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
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver())
				.clickActions(DriverManager.getDriver())
				.moveToOther(DriverManager.getDriver())
				.moveToOther(DriverManager.getDriver());
		switch(paymentOptions.getPaymentType()) {//warnings remove
		case MANUAL_CHECK:
			actionsPage.clickManualCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).selectName(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).selectReserveLine(DriverManager.getDriver())
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
			transferCheckPage.clickTransfer(DriverManager.getDriver());
			Log.messageStep("Transfer Checks by Enter Claim number: "+paymentOptions.getClaimNumber(),DriverManager.getDriver());
			break;
		default:
			break;
		}
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
		.enterSubject(DriverManager.getDriver(), emailDetails.getSubject())
		.enterBody(DriverManager.getDriver(), emailDetails.getBody())
		.clickSendEmail(DriverManager.getDriver());
		new SummaryPage(DriverManager.getDriver()).clickDocuments(DriverManager.getDriver());
		new DocumentPage(DriverManager.getDriver()).verifyEmailIsSent(DriverManager.getDriver());
		Log.messageStep("Calim using Email : enter email Address : "+emailDetails.getEmailAdress()+" and Suceesfully Claim is done using mentioned Email",DriverManager.getDriver());
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
		Log.messageStep("Claim the services : Request Type : "+serviceDetails.getRequestType()+"and fill Contact Information "+serviceDetails.getContactDetails(),DriverManager.getDriver());

	}
	/**
	 * clicks on "LossDetails"
	 * clicks on "Edit"
	 * click on "Injury During Employment RadioButton"
	 * click on "Performing Regular Job RadioButton"
	 * click on "Safety Equipment Provided RadioButton"
	 * click on "Employer Questions Claim RadioButton"
	 * click on "Safety Equipment Used RadioButton"
	 * click on "Drugs Involved RadioButton"
	 * Select "Compensability" from compensability drop down
	 * Clicked "Update" Button
	 * @param lossDetails
	 */
	@Override
	public void updateLossDetails(LossDetails lossDeatils) {
		LossDetailsPage lossDetails = new LossDetailsPage(DriverManager.getDriver());
		lossDetails.clickLossDetails(DriverManager.getDriver())
		.clickEdit(DriverManager.getDriver());
		if(lossDeatils.isInjuryDuringEmploymentRadioButton()) lossDetails.clickInjuryDuringEmploymentRadioButton(DriverManager.getDriver());
		if(lossDeatils.isPerformingRegularJobRadioButton()) lossDetails.clickPerformingRegularJobRadioButton(DriverManager.getDriver());
		if(lossDeatils.isSafetyEquipmentProvidedRadioButton()) lossDetails.clickSafetyEquipmentProvidedRadioButton(DriverManager.getDriver());
		if(lossDeatils.isEmployerQuestionsClaimRadioButton()) lossDetails.clickEmployerQuestionsClaimRadioButton(DriverManager.getDriver());
		if(lossDeatils.isSafetyEquipmentUsedRadioButton()) lossDetails.clickSafetyEquipmentUsedRadioButton(DriverManager.getDriver());
		if(lossDeatils.isDrugsInvolvedRadioButton()) lossDetails.clickDrugsInvolvedRadioButton(DriverManager.getDriver());
		lossDetails.selectCompensability(DriverManager.getDriver(), lossDeatils.getCompensability())
		.clickUpdate(DriverManager.getDriver());
		Log.messageStep("Update Loss details : selecting Compensability : "+lossDeatils.getCompensability(),DriverManager.getDriver());
	}
	
	/**
	 *Click on Medical Details
	 * Close the Medical Exposure 
	 *Click on Indemnity
	 * Close the Indemnity Exposure 
	 * @param closeExposure
	 */
	@Override
	public void closeExistingExposure(CloseExposure closeExposure) {
		SummaryPage summaryPage = new SummaryPage(DriverManager.getDriver());
		//Close Medical Exposure
		summaryPage.clickMedicalDetails(DriverManager.getDriver());
		closeExposure(closeExposure);
		//Close Indemnity Exposure
		summaryPage.clickIndemnity(DriverManager.getDriver());
		closeExposure(closeExposure);
		Log.messageStep("Existing Exposure Closed Successfully",DriverManager.getDriver());
	}
	
	/**
	 *Click on WorkPlan
	 *Click on Complete button
	 */
	@Override
	public void completeWorkplan() {
		SummaryPage summaryPage = new SummaryPage(DriverManager.getDriver());
		summaryPage.clickWorkPlan(DriverManager.getDriver());
		new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver())
		.clickComplete(DriverManager.getDriver());
		Log.messageStep("Successfully Work plans are completed ",DriverManager.getDriver());
	}
	
	/**
	 *Click on Actions
	 *Click on Close Claim
	 *Enter Note field
	 *Select "Outcome" from Outcome drop down
	 * Click on Close Button
	 * @param closeClaim
	 */
	@Override
	public void closeClaim(CloseClaim closeClaim) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
		.clickCloseClaim(DriverManager.getDriver());
		new CloseClaimPage(DriverManager.getDriver()).enterNote(DriverManager.getDriver(), closeClaim.getNote())
		.selectOutcome(DriverManager.getDriver(), closeClaim.getOutcome())
		.clickCloseClaim(DriverManager.getDriver());
		Log.messageStep("Claims are closed by choosing Outcome : "+closeClaim.getOutcome(),DriverManager.getDriver());
	}
	
	/**
	 *  ** REUSABLE METHOD **
	 *Click on Close Exposure Button
	 *Select "Outcome" from Outcome drop down
	 *Enter Note field
	 * Click on Close Button
	 * @param closeExposure
	 */
	public void closeExposure(CloseExposure closeExposure){
		new SummaryPage(DriverManager.getDriver()).clickCloseExposure(DriverManager.getDriver());
		CloseExposurePage closeExposures = new CloseExposurePage(DriverManager.getDriver());
		closeExposures.selectOutcome(DriverManager.getDriver(), closeExposure.getOutcome())
		.enterNote(DriverManager.getDriver(), closeExposure.getNote())
		.clickCloseExposure(DriverManager.getDriver()); 
	}
	
	/**
	 *Click on Summary 
	 *Click on Status
	 * Verify the Claim status is "Close"
	 * @param claimStatus
	 */
	@Override
	public void verifyClaimStatus(ClaimStatus claimStatus) {
		SummaryPage summaryPage = new SummaryPage(DriverManager.getDriver());
		summaryPage .clickSummary(DriverManager.getDriver());
		summaryPage .clickStatus(DriverManager.getDriver());
		new StatusPage(DriverManager.getDriver()).verifyClaimStatus(DriverManager.getDriver(), claimStatus.getClaimStatus());
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

