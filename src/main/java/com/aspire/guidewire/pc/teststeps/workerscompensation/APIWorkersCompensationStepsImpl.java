package com.aspire.guidewire.pc.teststeps.workerscompensation;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.pages.common.HeaderPage;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcCoverages;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcoptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RiskAnalysis;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

import io.restassured.response.Response;

public class APIWorkersCompensationStepsImpl implements WorkersCompensationSteps {

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

		String selectPolicy = PCAPIUtils.readFormDataFile("workersCompensation","7.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);	
		Log.message("Select Policy response: "+selectPolicyResponse);

	}

	@Override
	public void selectQualifications(Qualification qualification) {

		/* Select the Qualification */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String selectQualification = PCAPIUtils.readFormDataFile("workersCompensation","8.QualificationPage");
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

		String updatePolicy = PCAPIUtils.readFormDataFile("workersCompensation","9.UpdatePolicyInfo");
		updatePolicy = updatePolicy.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicy = updatePolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());


		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicy);	
		Log.message("Policy Info Page response: "+policyInfoResponse);

	}

	@Override
	public void addLocationDetails(AddLocationDetails addLocationDetails) {
		/* Add the Location details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String locationDetails = PCAPIUtils.readFormDataFile("workersCompensation","10.Location");
		locationDetails = locationDetails.replace("<CSRF_TOKEN>", csrfToken);
		locationDetails = locationDetails.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response locationPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, locationDetails);
		Log.message("Location Page response: "+locationPageResponse);
	}

	@Override
	public void addWcCoverages(AddWcCoverages addWcCoverages) {

		/* Click Add Class */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String addClass = PCAPIUtils.readFormDataFile("workersCompensation","11.AddClass");
		addClass = addClass.replace("<CSRF_TOKEN>", csrfToken);
		addClass = addClass.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addClassRespone  = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addClass);
		Log.message("Add Class response: "+addClassRespone);

		PCAPIUtils.setLocation(addClassRespone);		

		/* Select require location*/

		String location = PCAPIUtils.getLocation();

		String refresh = PCAPIUtils.readFormDataFile("workersCompensation","12.LocationRefresh");
		refresh = refresh.replace("<CSRF_TOKEN>", csrfToken);
		refresh = refresh.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		refresh = refresh.replace("<LOCATION>",  location);

		PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refresh);

		/* Add the Class details*/
		String wcCoverage = PCAPIUtils.readFormDataFile("workersCompensation","13.WcCoverage");

		wcCoverage = wcCoverage.replace("<CSRF_TOKEN>", csrfToken);
		wcCoverage = wcCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		wcCoverage = wcCoverage.replace("<LOCATION>", location);

		Response wcCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, wcCoverage);
		Log.message("WC Covearge Page response: "+wcCoverageResponse);

	}

	@Override
	public void reviewPolicy(PolicyReview policyreview) {
		/* click on Quote*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String quotePage = PCAPIUtils.readFormDataFile("workersCompensation","17.ClickQuote");
		quotePage = quotePage.replace("<CSRF_TOKEN>", csrfToken);
		quotePage = quotePage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response reviewPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quotePage);
		Log.message("Review Policy response: "+reviewPolicyResponse);

	}

	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {
		/*Click on next */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String riskanalysisPage = PCAPIUtils.readFormDataFile("workersCompensation","16.Riskanalysis");
		riskanalysisPage = riskanalysisPage.replace("<CSRF_TOKEN>", csrfToken);
		riskanalysisPage = riskanalysisPage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response riskanalysisPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, riskanalysisPage);
		Log.message("RiskAnalysis Page response: "+riskanalysisPageResponse);
	}

	@Override
	public void viewForms() {
		/* click on next*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String formsPage = PCAPIUtils.readFormDataFile("workersCompensation","19.Forms");
		formsPage = formsPage.replace("<CSRF_TOKEN>", csrfToken);
		formsPage = formsPage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response viewFormsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, formsPage);	
		Log.message(" Forms Page response: "+viewFormsResponse);
	}

	@Override
	public void issuepolicy(Transactions transaction) {
		/* click on Issue policy*/
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String issuePolicyPage = PCAPIUtils.readFormDataFile("workersCompensation","20.IssuePolicy");
		issuePolicyPage = issuePolicyPage.replace("<CSRF_TOKEN>", csrfToken);
		issuePolicyPage = issuePolicyPage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response issuePolicyPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, issuePolicyPage);
		Log.message("Issue Policy Page response: "+issuePolicyPageResponse);

	}

	public String getPolicyNumber() {
		/*click view policy link*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String viewPolicy = PCAPIUtils.readFormDataFile("workersCompensation","21.viewPolicy");

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
	public void addSupplemental() {
		/* click on next*/
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String supplemental = PCAPIUtils.readFormDataFile("workersCompensation","14.Supplemental");
		supplemental = supplemental.replace("<CSRF_TOKEN>", csrfToken);
		supplemental = supplemental.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addSupplementalPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, supplemental);
		Log.message("Add Supplemental Page Response: "+addSupplementalPageResponse);

	}

	@Override
	public void addWcoptions(AddWcoptions addwcoptions) {
		/* click on next*/
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String wcOptions = PCAPIUtils.readFormDataFile("workersCompensation","15.WcOptions");
		wcOptions = wcOptions.replace("<CSRF_TOKEN>", csrfToken);
		wcOptions = wcOptions.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response wcOptionsPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, wcOptions);	
		Log.message("Wc options page Response: "+wcOptionsPageResponse);

	}

	@Override
	public void viewQuote() {
		/* click on next*/
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String quote = PCAPIUtils.readFormDataFile("workersCompensation","18.Quote");
		quote = quote.replace("<CSRF_TOKEN>", csrfToken);
		quote = quote.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response quotePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, quote);
		Log.message("Quote Page Response: "+quotePageResponse);
	}

	@Override
	public void searchPolicyNumber(PolicyDetails policyDetails) {
		new HeaderPage(DriverManager.getDriver())
		.clickTogglePolicySubMenu(DriverManager.getDriver())
		.enterPolicyNumber(DriverManager.getDriver(), policyDetails.getPolicyNumber())
		.clickPolicySearch(DriverManager.getDriver());
		Log.messageStep("Searched on Policy Number",DriverManager.getDriver());
	}


	@Override
	public void copySubmissions() {


	}
	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {
	}


	@Override
	public void viewPolicy() {

	}

	@Override
	public void cancelPolicy(CancellationSource cancellationSource) {


	}


	@Override
	public void policyChange(PolicyChange policyChange) {
	}

	@Override
	public void reinstatePolicy(ReinstatementReason reinstatementReason) {

	}

	@Override
	public void policyRewriteFullTerm() {

	}

	@Override
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection) {

	}

	@Override
	public void policyRenew() {

	}

	@Override
	public void policyRenewal(RenewPolicy renewPolicy) {

	}

	@Override
	public void policyCloseOptions(CloseOptions closeOptions) {

	}

	@Override
	public void copySubmission() {
	}
	
	@Override
	public void selectPayments(Payments payments) {


	}
}






