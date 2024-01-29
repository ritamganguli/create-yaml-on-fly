package com.aspire.guidewire.pc.teststeps.homeowners;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.AdditionalInterest;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingConstruction;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.HistoryDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.UWIssueType;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIHomeOwnersStepsImpl implements HomeOwnersSteps {

	@Override
	public void loginIntoTheApplication(String username, String password) {

		/* Invoke application */

		Response invokeAppResponse = PCAPIUtils.sendGetRequest();
		PCAPIUtils.setCSRFToken(invokeAppResponse);
		PCAPIUtils.setCookieSessionID(invokeAppResponse);

		/* Login to the application */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String loginPayload = PCAPIUtils.readFormDataFile("common","1.Login");
		loginPayload = loginPayload.replace("<USERNAME>", username);
		loginPayload = loginPayload.replace("<PASSWORD>", password);
		loginPayload = loginPayload.replace("<CSRF_TOKEN>", csrfToken);
		loginPayload = loginPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

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

		String newAccountPayload = PCAPIUtils.readFormDataFile("common","2.NewAccount");
		newAccountPayload = newAccountPayload.replace("<CSRF_TOKEN>", csrfToken);
		newAccountPayload = newAccountPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response newAccountResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newAccountPayload);
		Log.message("Create new Account response: "+newAccountResponse);

		/* Search Account */

		String searchAccountPayload = PCAPIUtils.readFormDataFile("common","3.SearchAccount");
		searchAccountPayload = searchAccountPayload.replace("<FIRST_NAME>", enterAccountInformation.getFirstName());
		searchAccountPayload = searchAccountPayload.replace("<LAST_NAME>", enterAccountInformation.getLastName());
		searchAccountPayload = searchAccountPayload.replace("<CSRF_TOKEN>", csrfToken);
		searchAccountPayload = searchAccountPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response searchAccountResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchAccountPayload);	
		Log.message("Search Account response: "+searchAccountResponse);
		return null;
	}

	@Override
	public String createAccount(CreateNewAccount createNewAccount) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
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
			fromPersonPayload = fromPersonPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

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
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

			Response response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, createAccountFromPersonPayload);

			/* Re-sending request to ignore producer code missing error */

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

		String fromSelectProductPayload = PCAPIUtils.readFormDataFile("common","6.CreateNewSubmission");
		fromSelectProductPayload = fromSelectProductPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromSelectProductPayload = fromSelectProductPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response newSubmissionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromSelectProductPayload);
		Log.message("New Submission response: "+newSubmissionResponse);

		/* Choose the Product */

		String selectPolicy = PCAPIUtils.readFormDataFile("homeOwners","7.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);	
		Log.message("Select Policy response: "+selectPolicyResponse);
	}

	@Override
	public void selectQualifications(Qualification qualification) {

		/*Select Qualification and click Next  */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String fromDataFile1;
		String fromDataFile2;

		switch (qualification.getTypeOfPolicy()) {
		case DWELLING:
			fromDataFile1 = "11.SelectQuaificationDwelling";
			fromDataFile2 = "12.SelectHo2";
			break;
		case CONDOMINIUM:
			fromDataFile1 = "19.SelectQualificationCondo";
			fromDataFile2 = "20.SelectQualificationH06";
			break;
		case RENTAL:
			fromDataFile1 = "22.SelectQualificationRental";
			fromDataFile2 = "23.SelectQualificationHo4";
			break;
		default:
			throw new IllegalArgumentException("Invalid qualification value: " );
		}

		String formPayload1 = PCAPIUtils.readFormDataFile("homeOwners", fromDataFile1);
		formPayload1 = formPayload1.replace("<CSRF_TOKEN>", csrfToken);
		formPayload1 = formPayload1.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response qualificationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, formPayload1);
		Log.message("Qualification response: "+qualificationResponse);

		String formPayload2 = PCAPIUtils.readFormDataFile("homeOwners", fromDataFile2);
		formPayload2 = formPayload2.replace("<CSRF_TOKEN>", csrfToken);
		formPayload2 = formPayload2.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response qualificationDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, formPayload2);
		Log.message("Qualification response: "+qualificationDetailsResponse);

		String fromSelectQualificationPayload = PCAPIUtils.readFormDataFile("homeOwners","8.SelectQualification");
		fromSelectQualificationPayload = fromSelectQualificationPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromSelectQualificationPayload = fromSelectQualificationPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response qualificationPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromSelectQualificationPayload);
		Log.message("Qualification Page response: "+qualificationPageResponse);
	}

	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {

		/*Enter Policy Info  and click Next  */		

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String fromEnterPolicyInfoPayload = PCAPIUtils.readFormDataFile("homeOwners","9.PolicyInfo");
		fromEnterPolicyInfoPayload = fromEnterPolicyInfoPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromEnterPolicyInfoPayload = fromEnterPolicyInfoPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromEnterPolicyInfoPayload);
		Log.message("Policy Info Page response: "+policyInfoResponse);
	}

	@Override
	public void addDwellingDetails(DwellingDetails dwellingDetails) {

		/*Enter Dwelling Details  and click Next  */		

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String fromSelectDwellingDetailsPayload = PCAPIUtils.readFormDataFile("homeOwners","10.DwellingDetails");
		fromSelectDwellingDetailsPayload = fromSelectDwellingDetailsPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromSelectDwellingDetailsPayload = fromSelectDwellingDetailsPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addDwellingResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromSelectDwellingDetailsPayload);		
		Log.message("Dwelling Page response: "+addDwellingResponse);
	}

	@Override
	public void addDwellingConstructionDetails(DwellingConstruction dwellingConstruction) {

		/*Enter Dwelling Construction Details  and click Next  */	

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String fromSelectDwellingConstructionDetailsPayload = PCAPIUtils.readFormDataFile("homeOwners","13.DwellingConstruction");
		fromSelectDwellingConstructionDetailsPayload = fromSelectDwellingConstructionDetailsPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromSelectDwellingConstructionDetailsPayload = fromSelectDwellingConstructionDetailsPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response dwellingConstructionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromSelectDwellingConstructionDetailsPayload);	
		Log.message("Dwelling Construction Page response: "+dwellingConstructionResponse);
	}

	@Override
	public void addCoverages(Coverages coverage) {

		/*Enter Coverage Details and click Next  */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String fromDataFile;

		switch (coverage.getPolicyType()) {
		case DWELLING:
			fromDataFile = "14.CoverageDetails";
			break;
		case CONDOMINIUM:
			fromDataFile = "21.CoverageDetailsForCondominium";
			break;
		case RENTAL:
			fromDataFile = "24.CoverageDetailsForRental";
			break;
		default:
			throw new IllegalArgumentException("Invalid qualification value: " );
		}

		String fromEnterCoverageDetailsPayload = PCAPIUtils.readFormDataFile("homeOwners",fromDataFile);
		fromEnterCoverageDetailsPayload = fromEnterCoverageDetailsPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromEnterCoverageDetailsPayload = fromEnterCoverageDetailsPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromEnterCoverageDetailsPayload);	
		Log.message("Coverage Page response: "+addCoverageResponse);
	}

	@Override
	public void addModifiersDetails() {

		/*Click Next in Modifiers page */		

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String fromModifiersPagePayload = PCAPIUtils.readFormDataFile("homeOwners","14.CoverageDetails");
		fromModifiersPagePayload = fromModifiersPagePayload.replace("<CSRF_TOKEN>", csrfToken);
		fromModifiersPagePayload = fromModifiersPagePayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response modifiersPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromModifiersPagePayload);
		Log.message("Modifiers Page response :"+modifiersPageResponse);
	}

	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {

		/*Select Risk Analysis details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateRiskAnalysis = PCAPIUtils.readFormDataFile("homeOwners","16.RiskAnalysis");

		updateRiskAnalysis = updateRiskAnalysis.replace("<CSRF_TOKEN>", csrfToken);
		updateRiskAnalysis = updateRiskAnalysis.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response riskanalysisPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateRiskAnalysis);
		Log.message("RiskAnalysis Page response: "+riskanalysisPageResponse);
	}

	@Override
	public void reviewPolicy(PolicyReview policyreview) {

		/*Select Review Policy details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updatePolicyReview = PCAPIUtils.readFormDataFile("homeOwners","17.ClickQuote");

		updatePolicyReview = updatePolicyReview.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicyReview = updatePolicyReview.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response reviewPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicyReview);
		Log.message("Review Policy response: "+reviewPolicyResponse);
	}

	@Override
	public void viewForms(Quote quote) {

		/*View Forms*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String viewForms = PCAPIUtils.readFormDataFile("homeOwners","18.ViewForms");

		viewForms = viewForms.replace("<CSRF_TOKEN>", csrfToken);
		viewForms = viewForms.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response viewFormsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewForms);
		Log.message(" Forms Page response: "+viewFormsResponse);
	}

	@Override
	public void selectPayments(Payments payments) {

		/*Select Payment method*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String selectPayment = PCAPIUtils.readFormDataFile("common","23.UpdatePaymentDetails");

		selectPayment = selectPayment.replace("<CSRF_TOKEN>", csrfToken);
		selectPayment = selectPayment.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response paymentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPayment);
		Log.message("Payment Page response: "+paymentPageResponse);
	}

	@Override
	public void viewQuote(Quote quote) {

		/*click Quote*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String quotePage = PCAPIUtils.readFormDataFile("common","21.ClickQuote");

		quotePage = quotePage.replace("<CSRF_TOKEN>", csrfToken);
		quotePage = quotePage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response quotePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quotePage);
		Log.message("Quote Page response: "+quotePageResponse);
	}

	public String getPolicyNumber() {

		/*click view policy link*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String viewPolicy = PCAPIUtils.readFormDataFile("common","24.ViewPolicy");

		viewPolicy = viewPolicy.replace("<CSRF_TOKEN>", csrfToken);
		viewPolicy = viewPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		/*Get Policy Number*/

		Response response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewPolicy);	
		Log.message("View Policy Response: "+response);
		String policyNumber = PCAPIUtils.getHTMLAttributeValue(response, "PolicyFile_Summary-PolicyOverviewDashboard-PolicyDetailsDetailViewTile-PolicyDetailsDetailViewTile_DV-PolicyNumber");

		/* Clear ThreadLocal values */
		PCAPIUtils.clearThreadLocalValues();

		return policyNumber;
	}

	@Override
	public void issuepolicy(Transactions transaction) {

	}

	@Override
	public void viewPolicy() {

	}

	@Override
	public void cancelPolicy(CancellationSource cancellationSource) {

	}

	@Override
	public void policyRewriteRemainderTerm() {

	}

	@Override
	public void policyChange(PolicyChange policyChange) {

	}

	@Override
	public void policyRewriteFullTerm() {

	}

	@Override
	public void reinstatePolicy(ReinstatementReason reinstatementReason) {

	}

	@Override
	public void policyRenew() {

	}

	@Override
	public void policyRenewal(RenewPolicy renewPolicy) {

	}

	@Override
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection) {

	}

	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {

	}

	@Override
	public void copySubmission() {

	}

	@Override
	public void policyCloseOptions(CloseOptions closeOptions) {

	}

	@Override
	public void addInsured(CreateNewAccount createNewAccount) {

	}

	@Override
	public void addAdditionalInterestInDwelling(AdditionalInterest additionalInterest) {

	}

	@Override
	public void policyRewriteNewTerm() {

	}

	@Override
	public void completedPolicyTransactions() {

	}

	@Override
	public void verifyChangesInHistoryPage(HistoryDetails historyDetails) {

	}

	@Override
	public void verifyErrorMessage(String expectedActualErrorMessage) {

	}


	@Override
	public void verifyDocumentIsCreated(String documentName) {

	}

	@Override
	public void viewShowRating(Rating rate) throws InterruptedException {

	}

	@Override
	public void verifyFormsCreated(Transactions transactions) {

	}

	@Override
	public void approveUWissue(UWIssueType uwIssueType) {

	}

	@Override
	public void searchPolicyNumber(PolicyDetails policyDetails) {

	}

	@Override
	public void copySubmissions() {

	}

}
