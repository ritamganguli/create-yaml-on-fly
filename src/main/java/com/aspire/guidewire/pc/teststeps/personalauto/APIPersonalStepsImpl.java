package com.aspire.guidewire.pc.teststeps.personalauto;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.AdditionalInterest;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.EnterAccountInformation;
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
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIPersonalStepsImpl implements PersonalAutoSteps {


	@Override
	public void loginIntoTheApplication(String username, String password) {

		/* Invoke application */

		Response invokeAppResponse = PCAPIUtils.sendGetRequest();
		PCAPIUtils.setCSRFToken(invokeAppResponse);
		PCAPIUtils.setCookieSessionID(invokeAppResponse);

		/* Login to the application */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String loginPayload = PCAPIUtils.readFormDataFile("common","1.Login");
		loginPayload = loginPayload.replace("<USERNAME>", username);
		loginPayload = loginPayload.replace("<PASSWORD>", password);
		loginPayload = loginPayload.replace("<CSRF_TOKEN>", csrfToken);
		loginPayload = loginPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response loginResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, loginPayload);
		Log.message("Log-in response: "+loginResponse);
		PCAPIUtils.setCSRFToken(loginResponse);
		PCAPIUtils.setCookieSessionID(loginResponse);
	}

	@Override
	public String searchAccount(EnterAccountInformation enterAccountInformation) {	

		/* Click on NewAccount */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String newAccountPayload = PCAPIUtils.readFormDataFile("common","2.NewAccount");
		newAccountPayload = newAccountPayload.replace("<CSRF_TOKEN>", csrfToken);
		newAccountPayload = newAccountPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response newAccountResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newAccountPayload);
		Log.message("Create new Account response: "+newAccountResponse);

		/* Search Account */

		String searchAccountPayload = PCAPIUtils.readFormDataFile("common","3.SearchAccount");
		searchAccountPayload = searchAccountPayload.replace("<FIRST_NAME>", enterAccountInformation.getFirstName());
		searchAccountPayload = searchAccountPayload.replace("<LAST_NAME>", enterAccountInformation.getLastName());
		searchAccountPayload = searchAccountPayload.replace("<CSRF_TOKEN>", csrfToken);
		searchAccountPayload = searchAccountPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response searchAccountResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchAccountPayload);
		Log.message("Search Account response: "+searchAccountResponse);
		return null;
	}

	@Override
	public String createAccount(CreateNewAccount createNewAccount) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		CreateAccountOptions  createAccountOption = createNewAccount.getCreateAccountPreference();
		CreateNewAccountFromPerson createNewAccountFromPerson = null;
		String accountNumber = null;

		switch(createAccountOption) {

		case PERSON:
			createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount; 

			/* Click Create Account From Person */

			String fromPersonPayload = PCAPIUtils.readFormDataFile("common","4.FromPerson");
			fromPersonPayload = fromPersonPayload.replace("<FIRST_NAME>", createNewAccountFromPerson.getFirstName());
			fromPersonPayload = fromPersonPayload.replace("<LAST_NAME>", createNewAccountFromPerson.getLastName());
			fromPersonPayload = fromPersonPayload.replace("<CSRF_TOKEN>", csrfToken);
			fromPersonPayload = fromPersonPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response createAccountForPersonResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromPersonPayload);
			Log.message("Create Account For Person response: "+createAccountForPersonResponse);

			/* Enter create account from person details */

			String createAccountFromPersonPayload = PCAPIUtils.readFormDataFile("common","5.CreateNewAccountFromPerson");
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<FIRST_NAME>", createNewAccountFromPerson.getFirstName());
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<LAST_NAME>", createNewAccountFromPerson.getLastName());
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<STATE>", createNewAccountFromPerson.getState());

			String city = null;
			String zipcode = null;

			switch(createNewAccountFromPerson.getState()) {
			case"AZ":
				city = "Phoenix";
				zipcode = "85001";
			case"FL":
				city = "Plantation";
				zipcode = "33322";
			case"CA":
				city = "San Francisco";
				zipcode = "94101";	
			}

			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<CITY>", city);
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<ZIPCODE>", zipcode);
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<CSRF_TOKEN>", csrfToken);
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, createAccountFromPersonPayload);

			// Re-sending request to ignore producer code missing error

			response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, createAccountFromPersonPayload);	
			Log.message("Account Created response: "+response);
			accountNumber = PCAPIUtils.getHTMLAttributeValue(response, "AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountNumber");
			break;
		default: 

			break;
		}

		return accountNumber;
	}

	@Override
	public void selectProduct(ProductNames productName) {
		/* Click on NewSubmission */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String fromSelectProductPayload = PCAPIUtils.readFormDataFile("common","6.CreateNewSubmission");
		fromSelectProductPayload = fromSelectProductPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromSelectProductPayload = fromSelectProductPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response newSubmissionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromSelectProductPayload);
		Log.message("New Submission response: "+newSubmissionResponse);

		/* Choose the Product */

		String selectPolicy = PCAPIUtils.readFormDataFile("common","7.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);	
		Log.message("Select Policy response: "+selectPolicyResponse);

	}

	@Override
	public void selectOfferings(Offerings offerings) {

		/* Select the Offerings */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateofferings = PCAPIUtils.readFormDataFile("personalauto","8.SelectOfferings");
		updateofferings = updateofferings.replace("<CSRF_TOKEN>", csrfToken);
		updateofferings = updateofferings.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response offeringsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateofferings);
		Log.message("Offerings Page response: "+offeringsResponse);

	}

	@Override
	public void selectQualifications(Qualification qualification) {

		/* Select the Qualification */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String selectQualification = PCAPIUtils.readFormDataFile("personalauto","9.SelectQualification");
		selectQualification = selectQualification.replace("<CSRF_TOKEN>", csrfToken);
		selectQualification = selectQualification.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response qualificationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectQualification);
		Log.message("Qualification Page response: "+qualificationResponse);
	}

	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {

		/* Update the PolicyInfo*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updatePolicy = PCAPIUtils.readFormDataFile("common","10.updatePolicyInfo");
		updatePolicy = updatePolicy.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicy = updatePolicy.replace("<FILE_UPLOAD_URL>",fileUploadURL);

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicy);
		Log.message("Policy Info Page response: "+policyInfoResponse);
	}

	@Override
	public void addNewDriver(Drivers driver) {
		/* Add New Driver*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String newDriver = PCAPIUtils.readFormDataFile("personalauto","11.AddNewDriver");

		newDriver = newDriver.replace("<CSRF_TOKEN>", csrfToken);
		newDriver = newDriver.replace("<FILE_UPLOAD_URL>",fileUploadURL);

		Response newDriverResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newDriver);
		Log.message("New Driver Response: "+newDriverResponse);

		/* Enter Driver Details*/

		String driverDetails = PCAPIUtils.readFormDataFile("personalauto","12.UpdateDriverDetails");

		driverDetails = driverDetails.replace("<CSRF_TOKEN>", csrfToken);
		driverDetails = driverDetails.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		driverDetails = driverDetails.replace("<FIRST_NAME>", driver.getFirstName());
		driverDetails = driverDetails.replace("<LAST_NAME>", driver.getLastName());
		driverDetails = driverDetails.replace("<LICENSE_NUMBER>", driver.getLicenseNumber());

		Response driverDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, driverDetails);
		Log.message("Driver details response: "+driverDetailsResponse);

		/* Enter Driver Roles Tab Details*/

		String driverRolesDetails = PCAPIUtils.readFormDataFile("personalauto","13.UpdateDriverRolesTab");

		driverRolesDetails = driverRolesDetails.replace("<CSRF_TOKEN>", csrfToken);
		driverRolesDetails = driverRolesDetails.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		driverRolesDetails = driverRolesDetails.replace("<FIRST_NAME>", driver.getFirstName());
		driverRolesDetails = driverRolesDetails.replace("<LAST_NAME>", driver.getLastName());
		driverRolesDetails = driverRolesDetails.replace("<LICENSE_NUMBER>", driver.getLicenseNumber());

		Response driverRolesResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, driverRolesDetails);
		Log.message("Driver Roles response: "+driverRolesResponse);

		/* Enter Driver Entered Details Entered and clicked on next*/

		String driversNext = PCAPIUtils.readFormDataFile("personalauto","14.UpdatedDriversNext");

		driversNext = driversNext.replace("<CSRF_TOKEN>", csrfToken);
		driversNext = driversNext.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response driverPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, driversNext);
		Log.message("Driver page response: "+driverPageResponse);
	}

	@Override
	public void addVehicle(Vehicles vehicles) {
		/*Create vehicle*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String createVehicle = PCAPIUtils.readFormDataFile("personalauto","15.AddVehicle");

		createVehicle = createVehicle.replace("<CSRF_TOKEN>", csrfToken);
		createVehicle = createVehicle.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response createVehicleResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, createVehicle);
		Log.message("Create vehicle Response: "+createVehicleResponse);

		/*Update vehicle details*/

		String updateVehicleDetails = PCAPIUtils.readFormDataFile("personalauto","16.UpdateVehicleDetails");

		updateVehicleDetails = updateVehicleDetails.replace("<CSRF_TOKEN>", csrfToken);
		updateVehicleDetails = updateVehicleDetails.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		updateVehicleDetails = updateVehicleDetails.replace("<VIN>",vehicles.getVIN());
		updateVehicleDetails = updateVehicleDetails.replace("<COST_NEW>",vehicles.getCost());

		Response vehicleDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateVehicleDetails);
		Log.message("Vehicle Details response: "+vehicleDetailsResponse);

		/*clicking next once driver assigned to vehicle*/

		String vehicleScreenNext = PCAPIUtils.readFormDataFile("personalauto","17.VehicleScreenNext");

		vehicleScreenNext = vehicleScreenNext.replace("<CSRF_TOKEN>", csrfToken);
		vehicleScreenNext = vehicleScreenNext.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		vehicleScreenNext = vehicleScreenNext.replace("<VIN>",vehicles.getVIN());
		vehicleScreenNext = vehicleScreenNext.replace("<COST_NEW>",vehicles.getCost());

		Response vehiclePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, vehicleScreenNext);
		Log.message("Vehicle Page response: "+vehiclePageResponse);
	}

	@Override
	public void addPACoverage(PACoverage paCoverage) {

		/*Update Coverage details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateCoverage = PCAPIUtils.readFormDataFile("personalauto","18.UpdateCoverageDetails");

		updateCoverage = updateCoverage.replace("<CSRF_TOKEN>", csrfToken);
		updateCoverage = updateCoverage.replace("<FILE_UPLOAD_URL>",fileUploadURL);

		Response paCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateCoverage);
		Log.message("PA Coverage page response: "+paCoverageResponse);
	}

	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {

		/*Select Risk Analysis details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateRiskAnalysis = PCAPIUtils.readFormDataFile("common","19.UpdateRiskAnalysis");

		updateRiskAnalysis = updateRiskAnalysis.replace("<CSRF_TOKEN>", csrfToken);
		updateRiskAnalysis = updateRiskAnalysis.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response riskanalysisPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateRiskAnalysis);
		Log.message("RiskAnalysis Page response: "+riskanalysisPageResponse);

	}

	@Override
	public void reviewPolicy(PolicyReview policyreview) {

		/*Select Review Policy details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updatePolicyReview = PCAPIUtils.readFormDataFile("common","20.UpdatePolicyReview");

		updatePolicyReview = updatePolicyReview.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicyReview = updatePolicyReview.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response reviewPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicyReview);
		Log.message("Review Policy response: "+reviewPolicyResponse);

	}

	@Override
	public void viewQuote() {

		/*click Quote*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String quote = PCAPIUtils.readFormDataFile("common","21.ClickQuote");

		quote = quote.replace("<CSRF_TOKEN>", csrfToken);
		quote = quote.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response quotePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quote);
		Log.message("Quote Page response: "+quotePageResponse);
	}


	@Override
	public void viewForms() {

		/*View Forms*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String viewForms = PCAPIUtils.readFormDataFile("common","22.ViewForms");

		viewForms = viewForms.replace("<CSRF_TOKEN>", csrfToken);
		viewForms = viewForms.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response viewFormsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewForms);
		Log.message(" Forms Page response: "+viewFormsResponse);

	}

	@Override
	public void selectPayments(Payments payments) {

		/*Select Payment method*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String selectPayment = PCAPIUtils.readFormDataFile("common","23.UpdatePaymentDetails");

		selectPayment = selectPayment.replace("<CSRF_TOKEN>", csrfToken);
		selectPayment = selectPayment.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response paymentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPayment);
		Log.message("Payment Page response: "+paymentPageResponse);

	}

	@Override
	public void issuepolicy(Transactions transactions) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewPolicy() {
		// TODO Auto-generated method stub
	}

	public String getPolicyNumber() {
		/*click view policy link*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String viewPolicy = PCAPIUtils.readFormDataFile("common","24.ViewPolicy");

		viewPolicy = viewPolicy.replace("<CSRF_TOKEN>", csrfToken);
		viewPolicy = viewPolicy.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		/*Get Policy Number*/
		Response response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewPolicy);
		Log.message("View Policy Response: "+response);
		String policyNumber = PCAPIUtils.getHTMLAttributeValue(response, "PolicyFile_Summary-PolicyOverviewDashboard-PolicyDetailsDetailViewTile-PolicyDetailsDetailViewTile_DV-PolicyNumber");


		/* Clear ThreadLocal values */
		PCAPIUtils.clearThreadLocalValues();

		return policyNumber;
	}

	@Override
	public void cancelPolicy(CancellationSource cancellationSource) {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyRewriteRemainderTerm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyChange(PolicyChange policyChange) {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyRewriteFullTerm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reinstatePolicy(ReinstatementReason reinstatementReason) {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyRenew() {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyRenewal(RenewPolicy renewPolicy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void splitOffPolicy(SplitOff splitOff) {
		// TODO Auto-generated method stub

	}

	@Override
	public void spinOffPolicy(SpinOff spinOff) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
		// TODO Auto-generated method stub

	}

	@Override
	public void motorvehicleRecords() {
		// TODO Auto-generated method stub

	}

	@Override
	public void copySubmission() {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyCloseOptions(CloseOptions closeOptions) {
		// TODO Auto-generated method stub

	}

	@Override
	public String addInsured(CreateNewAccount createNewAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAdditionalInterestInVehicles(AdditionalInterest additionalInterest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void approvedUWIssues(UnderWriterIssue underWriterIssue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyRewriteNewTerm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyErrorMessage(String expectedErrorMessage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void uploadDocument(UploadDocument uploadDocument) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewShowRating(Rating rate) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void completedPolicyTransactions() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchPolicyNumber(PolicyDetails policyDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void copySubmissions() {
		// TODO Auto-generated method stub

	}


}
