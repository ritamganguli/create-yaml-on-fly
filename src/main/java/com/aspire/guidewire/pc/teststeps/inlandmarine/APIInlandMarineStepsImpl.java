package com.aspire.guidewire.pc.teststeps.inlandmarine;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.RenewPolicy;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIInlandMarineStepsImpl implements InlandMarineSteps {

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

		String selectPolicy = PCAPIUtils.readFormDataFile("inlandMarine","7.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);
		Log.message("Select Policy response: "+selectPolicyResponse);

	}
	
	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {

		/* Update the PolicyInfo*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updatePolicy = PCAPIUtils.readFormDataFile("inlandMarine","8.updatePolicyInfo");
		updatePolicy = updatePolicy.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicy = updatePolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicy);
		Log.message("Policy Info Page response: "+policyInfoResponse);
	}
	
	@Override
	public void addCoveragePartSelections(AddCoveragePartSelections coverage) {

		/* Update the Account*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String selectAccount = PCAPIUtils.readFormDataFile("inlandMarine","9.AccountsReceivable");
		selectAccount = selectAccount.replace("<CSRF_TOKEN>", csrfToken);
		selectAccount = selectAccount.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response accountReceivableResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectAccount);
		Log.message("Account Receivable response: "+accountReceivableResponse);
		
		/* Choose the ContractorsEquipment */

		String selectContractorsEquipment = PCAPIUtils.readFormDataFile("inlandMarine","10.ContractorsEquipment");
		selectContractorsEquipment = selectContractorsEquipment.replace("<CSRF_TOKEN>", csrfToken);
		selectContractorsEquipment = selectContractorsEquipment.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response contractorEquipmentResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectContractorsEquipment);	
		Log.message("Contractor Equipment response: "+contractorEquipmentResponse);

		
		/* Choose the Signs */

		String selectSigns = PCAPIUtils.readFormDataFile("inlandMarine","11.Signs");
		selectSigns = selectSigns.replace("<CSRF_TOKEN>", csrfToken);
		selectSigns = selectSigns.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response signsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectSigns);	
		Log.message("Signs response: "+signsResponse);

		
		/*Select Next*/

		String selectNext = PCAPIUtils.readFormDataFile("inlandMarine","12.NextBuildings");
		selectNext = selectNext.replace("<CSRF_TOKEN>", csrfToken);
		selectNext = selectNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addCoveargePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectNext);	
		Log.message("Add Coverage Page response: "+addCoveargePageResponse);

	}
	
	@Override
	public void addBuildingLocationDetails(AddBuildingLocationDetails addAddBuildingLocationDetails) {
		
		/* select building*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String addNewBuilding = PCAPIUtils.readFormDataFile("inlandMarine","13.AddNewBuilding");
		addNewBuilding = addNewBuilding.replace("<CSRF_TOKEN>", csrfToken);
		addNewBuilding = addNewBuilding.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response buildingResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addNewBuilding);	
		Log.message("Building response: "+buildingResponse);
		
		/* Update the locations*/
		
		String addLocation = PCAPIUtils.readFormDataFile("inlandMarine","14.AddLocation");
		addLocation = addLocation.replace("<CSRF_TOKEN>", csrfToken);
		addLocation = addLocation.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addLocationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addLocation);	
		Log.message("Add Location response: "+addLocationResponse);
		
		/* Click Next*/
		
		String NextAccountsReceivable = PCAPIUtils.readFormDataFile("inlandMarine","15.NextAccountsReceivable");
		NextAccountsReceivable = NextAccountsReceivable.replace("<CSRF_TOKEN>", csrfToken);
		NextAccountsReceivable = NextAccountsReceivable.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addBuildingResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, NextAccountsReceivable);	
		Log.message("Add Building Location Page response: "+addBuildingResponse);
	}
	
	
	@Override
	public void addAccountReceivableDetails(AddAccountReceivableDetails addAddAccountReceivableDetails) {
		
		/* Update the Account*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String addAccountsreceivable = PCAPIUtils.readFormDataFile("inlandMarine","16.AddAccountsreceivable");
		addAccountsreceivable = addAccountsreceivable.replace("<CSRF_TOKEN>", csrfToken);
		addAccountsreceivable = addAccountsreceivable.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		 Response accountRecievableResponse =  PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addAccountsreceivable);
		 Log.message("Add account recievable response: "+accountRecievableResponse);
		 
		 PCAPIUtils.setAccountRecievableLocation(accountRecievableResponse);	
		
		/* Next contractors equipment*/
		 
		String location = PCAPIUtils.getLocation();
		
		String NextContractorsEquipment = PCAPIUtils.readFormDataFile("inlandMarine","17.NextContractorsEquipment");
		NextContractorsEquipment = NextContractorsEquipment.replace("<CSRF_TOKEN>", csrfToken);
		NextContractorsEquipment = NextContractorsEquipment.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		NextContractorsEquipment = NextContractorsEquipment.replace("<LOCATION>",location);

		Response addAccountReceivableDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, NextContractorsEquipment);
		Log.message("Add Account Receivable Page response: "+addAccountReceivableDetailsResponse);
		
	}
	
	@Override
	public void addContractorsEquipmentDetails(AddContractorsEquipmentDetails addContractorsEquipmentDetails) {
		
		/* Update contractors*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		
		/* Click Contractor Misc coverage check box*/
		
		String ContractorMiscCoverage = PCAPIUtils.readFormDataFile("inlandMarine","28.ContractorMiscCoverage");
		ContractorMiscCoverage = ContractorMiscCoverage.replace("<CSRF_TOKEN>", csrfToken);
		ContractorMiscCoverage = ContractorMiscCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		
		Response contractorMiscCoveragePage = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, ContractorMiscCoverage);
		Log.message("Contractor Misc Coverage Page response: "+contractorMiscCoveragePage);
		
		/*Refresh*/
		
		String refresh = PCAPIUtils.readFormDataFile("inlandMarine","29.Refresh");
		refresh = refresh.replace("<CSRF_TOKEN>", csrfToken);
		refresh = refresh.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		
		PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refresh);
		
		/* Update Contractors Equipments*/
		
		String NextSigns = PCAPIUtils.readFormDataFile("inlandMarine","30.UpdateContractorEquipments");
		NextSigns = NextSigns.replace("<CSRF_TOKEN>", csrfToken);
		NextSigns = NextSigns.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response contractorEquipmentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, NextSigns);
		Log.message("Contractor Equipment Page response: "+contractorEquipmentPageResponse);
		
		
	}
	
	@Override
	public void addSignsDetails(AddSignsDetails addSignsDetails) {

		/* Update signs*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String AddSigns = PCAPIUtils.readFormDataFile("inlandMarine","20.AddSigns");
		AddSigns = AddSigns.replace("<CSRF_TOKEN>", csrfToken);
		AddSigns = AddSigns.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response signLocation = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, AddSigns);
		Log.message("Sign Location response: "+signLocation);
		
		PCAPIUtils.setImSignLocation(signLocation);
		
		/* Next from signs*/
		
		String location = PCAPIUtils.getLocation();
		
		String NextRiskAnalysis = PCAPIUtils.readFormDataFile("inlandMarine","21.NextRiskAnalysis");
		NextRiskAnalysis = NextRiskAnalysis.replace("<CSRF_TOKEN>", csrfToken);
		NextRiskAnalysis = NextRiskAnalysis.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		NextRiskAnalysis = NextRiskAnalysis.replace("<LOCATION>", location);

		Response signDetailsPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, NextRiskAnalysis);
		Log.message("Sign Details Page response: "+signDetailsPageResponse);
	}
	
	@Override
	public void selectRiskAnalysis() {

		/*Select Risk Analysis details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String RiskAnalysis = PCAPIUtils.readFormDataFile("inlandMarine","22.RiskAnalysisNext");
		RiskAnalysis = RiskAnalysis.replace("<CSRF_TOKEN>", csrfToken);
		RiskAnalysis = RiskAnalysis.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response riskanalysisPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, RiskAnalysis);
		Log.message("RiskAnalysis Page response: "+riskanalysisPageResponse);
		
	}

	@Override
	public void reviewPolicy(PolicyReview policyreview) {

		/*Select Review Policy details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updatePolicyReview = PCAPIUtils.readFormDataFile("inlandMarine","23.PolicyReview");

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

		String quote = PCAPIUtils.readFormDataFile("inlandMarine","24.QuotePage");

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

		String viewForms = PCAPIUtils.readFormDataFile("inlandMarine","25.FormsPage");

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

		String selectPayment = PCAPIUtils.readFormDataFile("inlandMarine","26.PaymentsPage");

		selectPayment = selectPayment.replace("<CSRF_TOKEN>", csrfToken);
		selectPayment = selectPayment.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response paymentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPayment);
		Log.message("Payment Page response: "+paymentPageResponse);

	}
	
	public String getPolicyNumber() {
		
		/*click view policy link*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String viewPolicy = PCAPIUtils.readFormDataFile("inlandMarine","27.ViewPolicy");

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
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void approveUWIssues() {
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
