package com.aspire.guidewire.pc.teststeps.generalliability;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.AddLocationInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Exposures;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Offerings;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIGeneralLiabilityStepsImpl implements GeneralLiabilitySteps {

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

		String selectPolicy = PCAPIUtils.readFormDataFile("GeneralLiability","7.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);	
		Log.message("Select Policy response: "+selectPolicyResponse);

	}
	@Override
	public void selectOfferings(Offerings offerings) {

		/* Select the Offerings */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateofferings = PCAPIUtils.readFormDataFile("GeneralLiability","8.SelectOfferings");
		updateofferings = updateofferings.replace("<CSRF_TOKEN>", csrfToken);
		updateofferings = updateofferings.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response offeringsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateofferings);
		Log.message("Offerings Page response: "+offeringsResponse);

	}

	@Override
	public void selectQualifications(Qualification qualification) {

		/* Select the Qualification */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String selectQualification = PCAPIUtils.readFormDataFile("GeneralLiability","9.SelectQualification");
		selectQualification = selectQualification.replace("<CSRF_TOKEN>", csrfToken);
		selectQualification = selectQualification.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response qualificationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectQualification);	
		Log.message("Qualification Page response: "+qualificationResponse);
	}

	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {

		/* Update the PolicyInfo*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updatePolicy = PCAPIUtils.readFormDataFile("GeneralLiability","10.updatePolicyInfo");
		updatePolicy = updatePolicy.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicy = updatePolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicy);	
		Log.message("Policy Info Page response: "+policyInfoResponse);


	}

	@Override
	public void addLocation(AddLocationInfo addLocationInfo ) {
		
		/* Default location available , Click Next */
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String location = PCAPIUtils.readFormDataFile("GeneralLiability","11.Location");
		location = location.replace("<CSRF_TOKEN>", csrfToken);
		location = location.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response locationPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, location);
		Log.message("Location Page response: "+locationPageResponse);
	}
	

	@Override
	public void addCoverage(Coverages coverage) {
		/* click Addtional Coverage */
		
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String location = PCAPIUtils.readFormDataFile("GeneralLiability","13.AddtionalCoverages");
		location = location.replace("<CSRF_TOKEN>", csrfToken);
		location = location.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addAdditionalCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, location);
		Log.message("Add additional coverage response: "+addAdditionalCoverageResponse);
		
		/* Add  Coverage */
		String addCoverage = PCAPIUtils.readFormDataFile("GeneralLiability","14.AddCoverage");
		addCoverage = addCoverage.replace("<CSRF_TOKEN>", csrfToken);
		addCoverage = addCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addCoverage);
		Log.message("Add coverage response: "+addCoverageResponse);
		
		/* Search Coverage */
		String searchCoverage = PCAPIUtils.readFormDataFile("GeneralLiability","15.SearchCoverage");
		searchCoverage = searchCoverage.replace("<CSRF_TOKEN>", csrfToken);
		searchCoverage = searchCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		
		Response searchCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchCoverage);
		Log.message("Search Coverage response: "+searchCoverageResponse);
		
		/* Select Coverage */
		String addSelectedCoverage = PCAPIUtils.readFormDataFile("GeneralLiability","16.AddSelectedCoverage");
		addSelectedCoverage = addSelectedCoverage.replace("<CSRF_TOKEN>", csrfToken);
		addSelectedCoverage = addSelectedCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		
		Response selectCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addSelectedCoverage);
		Log.message("Select Coverage response: "+selectCoverageResponse);
		
		/* Enter Basis */
		String enterBasis = PCAPIUtils.readFormDataFile("GeneralLiability","17.EnterCoverageBasis");
		enterBasis = enterBasis.replace("<CSRF_TOKEN>", csrfToken);
		enterBasis = enterBasis.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		
		Response addCoveragePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, enterBasis);
		Log.message("Add Coverage Page response: "+addCoveragePageResponse);
		
		
	}

	@Override
	public void addExposures(Exposures exposures) {
		
		/*Click Add Exposure */
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String addExposure = PCAPIUtils.readFormDataFile("GeneralLiability","18.AddExposure");
		addExposure = addExposure.replace("<CSRF_TOKEN>", csrfToken);
		addExposure = addExposure.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addExposureRespone  = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addExposure);
		Log.message("Add Exposure response: "+addExposureRespone);

		PCAPIUtils.setExposureLocation(addExposureRespone);		

		/* Select require location*/

		String location = PCAPIUtils.getLocation();

		String refresh = PCAPIUtils.readFormDataFile("GeneralLiability","19.LocationRefresh");
		refresh = refresh.replace("<CSRF_TOKEN>", csrfToken);
		refresh = refresh.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		refresh = refresh.replace("<LOCATION>",  location);

		PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refresh);
	
		/* update Class code and Basis */
		String classCode = PCAPIUtils.readFormDataFile("GeneralLiability","20.ClassCodeDetails");
		classCode = classCode.replace("<CSRF_TOKEN>", csrfToken);
		classCode = classCode.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		classCode = classCode.replace("<LOCATION>",  location);
		
		Response updateExposurePage = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, classCode);
		Log.message("Update Exposure Page response: "+updateExposurePage);
		
		
	}

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	@Override
	public void addModifiersDetails() {
		
		/* Update modifiers */
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String modifiers = PCAPIUtils.readFormDataFile("GeneralLiability","21.Modifiers");
		modifiers = modifiers.replace("<CSRF_TOKEN>", csrfToken);
		modifiers = modifiers.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response modifiersPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, modifiers);
		Log.message("Modifiers Page response: "+modifiersPageResponse);
	}

		@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {

		/*Select Risk Analysis details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateRiskAnalysis = PCAPIUtils.readFormDataFile("common","19.UpdateRiskAnalysis");

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

		String updatePolicyReview = PCAPIUtils.readFormDataFile("common","20.UpdatePolicyReview");

		updatePolicyReview = updatePolicyReview.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicyReview = updatePolicyReview.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response reviewPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicyReview);
		Log.message("Review Policy response: "+reviewPolicyResponse);



	}

	@Override
	public void viewQuote() {

		/*click Quote*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String quote = PCAPIUtils.readFormDataFile("common","21.ClickQuote");

		quote = quote.replace("<CSRF_TOKEN>", csrfToken);
		quote = quote.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response quotePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quote);
		Log.message("Quote Page response: "+quotePageResponse);
	}


	@Override
	public void viewForms() {

		/*View Forms*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String viewForms = PCAPIUtils.readFormDataFile("common","22.ViewForms");

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
	public void cancelPolicy(CancellationSource cancellationSource) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void policyChange(PolicyChange policyChange) {
		// TODO Auto-generated method stub
	}


	@Override
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection) {
		// TODO Auto-generated method stub
	}

	@Override
	public void reinstatePolicy(ReinstatementReason reinstatementReason) {
		// TODO Auto-generated method stub
	}

	@Override
	public void policyRewriteFullTerm() {
		// TODO Auto-generated method stub
	}

	@Override
	public void policyRewriteNewTerm() {
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
	public void policyCloseOptions(CloseOptions closeOptions) {
		// TODO Auto-generated method stub
	}

	@Override
	public void copySubmission() {
		// TODO Auto-generated method stub
	}

	@Override
	public String addInsured(CreateNewAccount createNewAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	public void verifyErrorMessage(String expectedActualErrorMessage) {
		// TODO Auto-generated method stub
	}

	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
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

	@Override
	public void issuepolicy(Transactions transactions) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewPolicy() {
		// TODO Auto-generated method stub
	}
}