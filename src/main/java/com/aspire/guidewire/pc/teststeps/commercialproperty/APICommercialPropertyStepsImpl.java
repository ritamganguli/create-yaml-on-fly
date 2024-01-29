package com.aspire.guidewire.pc.teststeps.commercialproperty;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Blanket;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.UWIssueType;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APICommercialPropertyStepsImpl implements CommecialPropertySteps {



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

		String fromSelectProductPayload = PCAPIUtils.readFormDataFile("common","6.CreateNewSubmission");
		fromSelectProductPayload = fromSelectProductPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromSelectProductPayload = fromSelectProductPayload.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response newSubmissionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromSelectProductPayload);	
		Log.message("New Submission response: "+newSubmissionResponse);

		/* Choose the Product */

		String selectPolicy = PCAPIUtils.readFormDataFile("CommercialProperty","1.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());


		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);	
		Log.message("Select Policy response: "+selectPolicyResponse);

	}


	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {

		/* update the policy */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updatePolicyInfo = PCAPIUtils.readFormDataFile("CommercialProperty","2.UpdatePolicyInfo");
		updatePolicyInfo = updatePolicyInfo.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicyInfo = updatePolicyInfo.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicyInfo);
		Log.message("Policy Info Page response: "+policyInfoResponse);

	}

	@Override
	public void addBuildingLocationDetails(AddBuildingLocationDetails addAddBuildingLocationDetails) {

		/* Navigate to the New Building */
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String newBuilding = PCAPIUtils.readFormDataFile("CommercialProperty","3.NewBuilding");
		newBuilding = newBuilding.replace("<CSRF_TOKEN>", csrfToken);
		newBuilding = newBuilding.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response newBuildingResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newBuilding);
		Log.message("New Building Page response: "+newBuildingResponse);

		//new building details
		String newBuildingDetails = PCAPIUtils.readFormDataFile("CommercialProperty","4.NewBuildingDetails");
		newBuildingDetails = newBuildingDetails.replace("<CSRF_TOKEN>", csrfToken);
		newBuildingDetails = newBuildingDetails.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response newBuildingDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newBuildingDetails);
		Log.message("New Building Details Page response: "+newBuildingDetailsResponse);

		//new building coverage
		String NewBuildingCoverage = PCAPIUtils.readFormDataFile("CommercialProperty","5.NewBuildingCoverage");
		NewBuildingCoverage = NewBuildingCoverage.replace("<CSRF_TOKEN>", csrfToken);
		NewBuildingCoverage = NewBuildingCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response newBuildingCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, NewBuildingCoverage);
		Log.message("New Building Coverage response: "+newBuildingCoverageResponse);

		//new building page next
		String newBuildingNext = PCAPIUtils.readFormDataFile("CommercialProperty","6.NewBuildingNext");
		newBuildingNext = newBuildingNext.replace("<CSRF_TOKEN>", csrfToken);
		newBuildingNext = newBuildingNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addBuildingLocationPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newBuildingNext);
		Log.message("Add Building Location Page response: "+addBuildingLocationPageResponse);

	}


	@Override
	public void addBlankets(Blanket blanket) {
		//add blanket
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String addBlanket = PCAPIUtils.readFormDataFile("CommercialProperty","7.AddBlanket");
		addBlanket = addBlanket.replace("<CSRF_TOKEN>", csrfToken);
		addBlanket = addBlanket.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addBlanketResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addBlanket);
		Log.message("Add Blanket response: "+addBlanketResponse);

		//blanket details show coverage

		String blanketDetailsShowCoverages = PCAPIUtils.readFormDataFile("CommercialProperty","8.BlanketDetailsShowCoverages");
		blanketDetailsShowCoverages = blanketDetailsShowCoverages.replace("<CSRF_TOKEN>", csrfToken);
		blanketDetailsShowCoverages = blanketDetailsShowCoverages.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response blanketCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, blanketDetailsShowCoverages);
		Log.message("Blanket Coverage response: "+blanketCoverageResponse);

		//blanket details IncludeSelectedInBlanket

		String blanketDetailsIncludeSelectedInBlanket = PCAPIUtils.readFormDataFile("CommercialProperty","9.BlanketDetailsIncludeSelectedInBlanket");
		blanketDetailsIncludeSelectedInBlanket = blanketDetailsIncludeSelectedInBlanket.replace("<CSRF_TOKEN>", csrfToken);
		blanketDetailsIncludeSelectedInBlanket = blanketDetailsIncludeSelectedInBlanket.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response blanketDetailsIncludedSelectedResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, blanketDetailsIncludeSelectedInBlanket);
		Log.message("Blanket Detail Included Selected  response: "+blanketDetailsIncludedSelectedResponse);

		//blanket details ok
		String blanketDetailsOk = PCAPIUtils.readFormDataFile("CommercialProperty","10.BlanketDetailsOk");
		blanketDetailsOk = blanketDetailsOk.replace("<CSRF_TOKEN>", csrfToken);
		blanketDetailsOk = blanketDetailsOk.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response blanketOkButtonResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, blanketDetailsOk);
		Log.message("Blanket Ok Button response: "+blanketOkButtonResponse);

		//blanket next
		String blanketNext = PCAPIUtils.readFormDataFile("CommercialProperty","11.BlanketNext");
		blanketNext = blanketNext.replace("<CSRF_TOKEN>", csrfToken);
		blanketNext = blanketNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response blanketPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, blanketNext);
		Log.message("Blanket  Page response: "+blanketPageResponse);

	}

	@Override
	public void addModifiersDetails() {
		/* select next in modifier page*/
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String modifierNext = PCAPIUtils.readFormDataFile("CommercialProperty","12.ModifierNext");
		modifierNext = modifierNext.replace("<CSRF_TOKEN>", csrfToken);
		modifierNext = modifierNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addModifiersDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, modifierNext);
		Log.message("Add Modifiers Details Page response: "+addModifiersDetailsResponse);
	}


	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {

		/* select next in RiskAnalysis page*/
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String riskAnalysisNext = PCAPIUtils.readFormDataFile("CommercialProperty","13.RiskAnalysisNext");
		riskAnalysisNext = riskAnalysisNext.replace("<CSRF_TOKEN>", csrfToken);
		riskAnalysisNext = riskAnalysisNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response riskanalysisPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, riskAnalysisNext);
		Log.message("RiskAnalysis Page response: "+riskanalysisPageResponse);
	}



	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		/* select rate in PolicyReview page*/
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String policyReviewRate = PCAPIUtils.readFormDataFile("CommercialProperty","14.PolicyReviewRate");
		policyReviewRate = policyReviewRate.replace("<CSRF_TOKEN>", csrfToken);
		policyReviewRate = policyReviewRate.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response reviewPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, policyReviewRate);
		Log.message("Review Policy Page response: "+reviewPolicyResponse);
	}


	@Override
	public void viewQuote(Quote quote) {
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String quoteFinishQuote = PCAPIUtils.readFormDataFile("CommercialProperty","15.QuoteFinishQuote");
		quoteFinishQuote = quoteFinishQuote.replace("<CSRF_TOKEN>", csrfToken);
		quoteFinishQuote = quoteFinishQuote.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response finishQuoteResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quoteFinishQuote);
		Log.message("Finish Quote response: "+finishQuoteResponse);
		//quote next
		String quoteNext = PCAPIUtils.readFormDataFile("CommercialProperty","16.QuoteNext");
		quoteNext = quoteNext.replace("<CSRF_TOKEN>", csrfToken);
		quoteNext = quoteNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response quotePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quoteNext);
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
	public void selectQualifications(Qualification qualification) {
		// TODO Auto-generated method stub

	}

	@Override
	public void issuepolicy(Transactions transaction) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewPolicy() {
		// TODO Auto-generated method stub

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
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection) {
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
	public void copySubmission() {
		// TODO Auto-generated method stub

	}

	@Override
	public String addInsured(CreateNewAccount createNewAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void policyRewriteNewTerm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
		// TODO Auto-generated method stub

	}

	@Override
	public void completedPolicyTransactions() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewShowRating(Rating rate) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void logOutTheApplication() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchSubmission(String searchType, String subissionNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void approveUWissue(UWIssueType uwIssueType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void runBatchProcessInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runWorkQueueInfo() {
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


