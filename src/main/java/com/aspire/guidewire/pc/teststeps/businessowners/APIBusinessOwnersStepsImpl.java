package com.aspire.guidewire.pc.teststeps.businessowners;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddBuildingDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UpdateBusinessOwnersLine;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIBusinessOwnersStepsImpl implements BusinessOwnersSteps {



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
	public String searchAccount(EnterAccountInformation enterAccountInfo) {
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
		searchAccountPayload = searchAccountPayload.replace("<FIRST_NAME>", enterAccountInfo.getFirstName());
		searchAccountPayload = searchAccountPayload.replace("<LAST_NAME>", enterAccountInfo.getLastName());
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

		String selectPolicy = PCAPIUtils.readFormDataFile("BusinessOwners","1.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);
		Log.message("Select Policy response: "+selectPolicyResponse);

	}

	@Override
	public void selectOfferings(Offerings offerings) {
		/* Click on Next in offering*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		// click next
		String OfferingsNext = PCAPIUtils.readFormDataFile("BusinessOwners","2.OfferingsNext");
		OfferingsNext = OfferingsNext.replace("<CSRF_TOKEN>", csrfToken);
		OfferingsNext = OfferingsNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response offeringsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, OfferingsNext);
		Log.message("Offerings Page response: "+offeringsResponse);

	}


	@Override
	public void selectQualifications(Qualification qualification) {
		/* Click on Next in Qualification*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String QualificationNext = PCAPIUtils.readFormDataFile("BusinessOwners","3.QualificationNext");
		QualificationNext = QualificationNext.replace("<CSRF_TOKEN>", csrfToken);
		QualificationNext = QualificationNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response qualificationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, QualificationNext);
		Log.message("Qualification Page response: "+qualificationResponse);
	}


	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {
		/* Click on Next in Qualification*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();


		String PolicyInfo = PCAPIUtils.readFormDataFile("BusinessOwners","4.PolicyInfo");
		PolicyInfo = PolicyInfo.replace("<CSRF_TOKEN>", csrfToken);
		PolicyInfo = PolicyInfo.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, PolicyInfo);
		Log.message("Policy Info Page response: "+policyInfoResponse);

	}

	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		/*Select Review Policy details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updatePolicyReview = PCAPIUtils.readFormDataFile("common","20.UpdatePolicyReview");

		updatePolicyReview = updatePolicyReview.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicyReview = updatePolicyReview.replace("<getFileUploadURL()>", PCAPIUtils.getFileUploadURL());

		Response reviewPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicyReview);
		Log.message("Review Policy Page response: "+reviewPolicyResponse);
	}


	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis)  {

		/*Select Risk Analysis details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateRiskAnalysis = PCAPIUtils.readFormDataFile("common","19.UpdateRiskAnalysis");

		updateRiskAnalysis = updateRiskAnalysis.replace("<CSRF_TOKEN>", csrfToken);
		updateRiskAnalysis = updateRiskAnalysis.replace("<getFileUploadURL()>", PCAPIUtils.getFileUploadURL());

		Response riskanalysisPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateRiskAnalysis);
		Log.message("RiskAnalysis Page response: "+riskanalysisPageResponse);
	}


	@Override
	public void viewForms() {

		/*click Quote*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String quote = PCAPIUtils.readFormDataFile("common","21.ClickQuote");

		quote = quote.replace("<CSRF_TOKEN>", csrfToken);
		quote = quote.replace("<getFileUploadURL()>", PCAPIUtils.getFileUploadURL());

		Response quotePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quote);
		Log.message(" Quote Page response: "+quotePageResponse);
		/*View Forms*/


		String viewForms = PCAPIUtils.readFormDataFile("common","22.ViewForms");

		viewForms = viewForms.replace("<CSRF_TOKEN>", csrfToken);
		viewForms = viewForms.replace("<getFileUploadURL()>", PCAPIUtils.getFileUploadURL());

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
		selectPayment = selectPayment.replace("<getFileUploadURL()>", PCAPIUtils.getFileUploadURL());

		Response paymentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPayment);
		Log.message("Payment Page response: "+paymentPageResponse);
	}

	@Override
	public void updateBusinessOwnersLine(UpdateBusinessOwnersLine updateBusinessOwnersLineIC) {
		/* Click on small details and next in Qualification*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String BusinessOwnersLine = PCAPIUtils.readFormDataFile("BusinessOwners","5.BusinessOwnersLine");
		BusinessOwnersLine = BusinessOwnersLine.replace("<CSRF_TOKEN>", csrfToken);
		BusinessOwnersLine = BusinessOwnersLine.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response updateBusinessOwnersLineResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, BusinessOwnersLine);
		Log.message("BusinessOwners Line Page response: "+updateBusinessOwnersLineResponse);

	}

	@Override
	public void addLocationDetails(AddLocationDetails addLocationDetails) {
		/* Click on Next in Location*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String Locations = PCAPIUtils.readFormDataFile("BusinessOwners","6.Locations");
		Locations = Locations.replace("<CSRF_TOKEN>", csrfToken);
		Locations = Locations.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addLocationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, Locations);
		Log.message("Add Location page response: "+addLocationResponse);

	}

	@Override
	public void addBuildingDetails(AddBuildingDetails addBuildingDetails) {
		/* Click on add in buildings*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String BuildingsAdd = PCAPIUtils.readFormDataFile("BusinessOwners","7.BuildingsAdd");
		BuildingsAdd = BuildingsAdd.replace("<CSRF_TOKEN>", csrfToken);
		BuildingsAdd = BuildingsAdd.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addBuildingResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, BuildingsAdd);
		Log.message("Add Building Page response: "+addBuildingResponse);

		// class code search 
		String ClassCodeSearch = PCAPIUtils.readFormDataFile("BusinessOwners","8.ClassCodeSearch");
		ClassCodeSearch = ClassCodeSearch.replace("<CSRF_TOKEN>", csrfToken);
		ClassCodeSearch = ClassCodeSearch.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response classCodeSearchResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, ClassCodeSearch);
		Log.message("Class code search response: "+classCodeSearchResponse);
		// class code select 
		String ClassCodeSelect = PCAPIUtils.readFormDataFile("BusinessOwners","9.ClassCodeSelect");
		ClassCodeSelect = ClassCodeSelect.replace("<CSRF_TOKEN>", csrfToken);
		ClassCodeSelect = ClassCodeSelect.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response selectClassCodeResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, ClassCodeSelect);
		Log.message("Select Class code response: "+selectClassCodeResponse);
		// update Building
		String UpdateBuilding = PCAPIUtils.readFormDataFile("BusinessOwners","10.UpdateBuilding");
		UpdateBuilding = UpdateBuilding.replace("<CSRF_TOKEN>", csrfToken);
		UpdateBuilding = UpdateBuilding.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response buildingResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, UpdateBuilding);
		Log.message("Building response: "+buildingResponse);
		// Buildings next
		String BuildingsNext = PCAPIUtils.readFormDataFile("BusinessOwners","11.BuildingsNext");
		BuildingsNext = BuildingsNext.replace("<CSRF_TOKEN>", csrfToken);
		BuildingsNext = BuildingsNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addBuildingPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, BuildingsNext);
		Log.message("Add Building Page response: "+addBuildingPageResponse);

	}

	@Override
	public void addModifiersDetails() {
		/* Click on next in modifiers*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String ModifiersNext = PCAPIUtils.readFormDataFile("BusinessOwners","12.ModifiersNext");
		ModifiersNext = ModifiersNext.replace("<CSRF_TOKEN>", csrfToken);
		ModifiersNext = ModifiersNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response modifiersPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, ModifiersNext);
		Log.message("Modifiers Page response: "+modifiersPageResponse);

	}

	@Override
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
	public void policyRewriteNewTerm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void CompletedPolicyTransactions() {
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
	public void issuepolicy(Transactions transaction) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewPolicy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void copySubmissions() {
		// TODO Auto-generated method stub

	}
}
