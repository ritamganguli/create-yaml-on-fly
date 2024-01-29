package com.aspire.guidewire.cc.teststeps.workerscompensation;

import com.aspire.guidewire.api.utils.CCAPIUtils;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimStatus;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseExposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Exposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ServiceDetails;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIWorkersCompensationStepsImpl implements WorkersCompensationSteps {

	@Override
	public void loginIntoTheApplication(String username, String password) {

		/* Invoke application */

		Response invokeAppResponse = CCAPIUtils.sendGetRequest();
		CCAPIUtils.setCSRFToken(invokeAppResponse);
		CCAPIUtils.setCookieSessionID(invokeAppResponse);

		/* Login to the application */

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		String loginPayload = CCAPIUtils.readFormDataFile("common","1.Login");
		loginPayload = loginPayload.replace("<USERNAME>", username);
		loginPayload = loginPayload.replace("<PASSWORD>", password);
		loginPayload = loginPayload.replace("<CSRF_TOKEN>", csrfToken);
		loginPayload = loginPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response loginResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, loginPayload);
		Log.message("Log-in response: "+loginResponse);
		CCAPIUtils.setCSRFToken(loginResponse);
		CCAPIUtils.setCookieSessionID(loginResponse);
	}

	@Override
	public void createClaim() {

		//clicks new claim
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		String newClaimPayload = CCAPIUtils.readFormDataFile("common","2.SearchClaim");
		newClaimPayload = newClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		newClaimPayload = newClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response createClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newClaimPayload);
		Log.message("create Claim response: "+createClaimResponse);
	}

	@Override
	public String searchPolicy(Searchpolicy searchPolicy) {

		//Enters policy number and click search
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		String searchClaimPayload = CCAPIUtils.readFormDataFile("common","3.SearchPolicy");
		searchClaimPayload = searchClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		searchClaimPayload = searchClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		searchClaimPayload = searchClaimPayload.replace("<POLICY_NUMBER>", searchPolicy.getPolicyNo());

		Response searchPolicyNumberResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchClaimPayload);
		Log.message("search PolicyNumber response: "+searchPolicyNumberResponse);

		//enter current date
		String searchOrCreatePayload = CCAPIUtils.readFormDataFile("WorkersCompensation","4.SearchOrCreatePolicy");
		searchOrCreatePayload = searchOrCreatePayload.replace("<CSRF_TOKEN>", csrfToken);
		searchOrCreatePayload = searchOrCreatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		searchOrCreatePayload = searchOrCreatePayload.replace("<LOSS_DATE>", searchPolicy.getLossDate());
		searchOrCreatePayload = searchOrCreatePayload.replace("<POLICY_NUMBER>", searchPolicy.getPolicyNo());

		Response searchPolicyResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchOrCreatePayload);
		Log.message("Search Policy Page response: "+searchPolicyResponse);
		CCAPIUtils.setClaimantNameinWorkersCompensation(searchPolicyResponse);
		return null;	

	}
	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		String claimantName = CCAPIUtils.getClaimantNameinWorkersCompensation();

		System.out.println(claimantName);
		// Refresh for selecting claimant Name
		String refreshPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","5.RefreshForClaimantName");
		refreshPayload = refreshPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPayload = refreshPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refreshPayload = refreshPayload.replace("<CLAIMANT_NAME>", claimantName);

		Response refreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPayload);
		Log.message("ClaimantName refresh response: "+refreshResponse);

		// Refresh for injured worker Name
		String refreshInjuredWorkerPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","6.RefreshForInjuredWorkerName");
		refreshInjuredWorkerPayload = refreshInjuredWorkerPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshInjuredWorkerPayload = refreshInjuredWorkerPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refreshInjuredWorkerPayload = refreshInjuredWorkerPayload.replace("<CLAIMANT_NAME>", claimantName);

		Response injuredWorkerRefreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshInjuredWorkerPayload);
		Log.message("Injured Worker refresh response: "+injuredWorkerRefreshResponse);

		//selecting claimant name
		String basicInformationPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","7.BasicInformation");
		basicInformationPayload = basicInformationPayload.replace("<CSRF_TOKEN>", csrfToken);
		basicInformationPayload = basicInformationPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		basicInformationPayload = basicInformationPayload.replace("<CLAIMANT_NAME>", claimantName);

		Response basicInfoResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, basicInformationPayload);
		Log.message("Basic Information Page response: "+basicInfoResponse);
		CCAPIUtils.setLocationInWorkersCompensation(basicInfoResponse);
	}

	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {

		String claimantName = CCAPIUtils.getClaimantNameinWorkersCompensation();
		String location = CCAPIUtils.getLocationinWorkersCompensation();
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		// To close duplicate claim popup
		String closePayload = CCAPIUtils.readFormDataFile("WorkersCompensation","8.CloseButton");
		closePayload = closePayload.replace("<CSRF_TOKEN>", csrfToken);
		closePayload = closePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response closeButtonResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, closePayload);
		Log.message("Close Button response: "+closeButtonResponse);

		// Refresh for select the location
		String locationRefreshPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","9.LocationRefresh");
		locationRefreshPayload = locationRefreshPayload.replace("<CSRF_TOKEN>", csrfToken);
		locationRefreshPayload = locationRefreshPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		locationRefreshPayload = locationRefreshPayload.replace("<CLAIMANT_NAME>", claimantName);
		locationRefreshPayload = locationRefreshPayload.replace("<REPORTED_DATE>", claimInfo.getDateEmployerNotified());
		locationRefreshPayload = locationRefreshPayload.replace("<LOCATION>", location);

		Response locationRefreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, locationRefreshPayload);
		Log.message("Location refresh response: "+locationRefreshResponse);

		// To select medical Attention radio button
		String medicalAttentionPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","10.MedicalAttention");
		medicalAttentionPayload = medicalAttentionPayload.replace("<CSRF_TOKEN>", csrfToken);
		medicalAttentionPayload = medicalAttentionPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		medicalAttentionPayload = medicalAttentionPayload.replace("<CLAIMANT_NAME>", claimantName);
		medicalAttentionPayload = medicalAttentionPayload.replace("<REPORTED_DATE>", claimInfo.getDateEmployerNotified());
		medicalAttentionPayload = medicalAttentionPayload.replace("<LOCATION>", location);

		Response radioButtonResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, medicalAttentionPayload);
		Log.message("Radio button response: "+radioButtonResponse);

		// To select lost time for work
		String lostTimePayload = CCAPIUtils.readFormDataFile("WorkersCompensation","11.LostTimeforWork");
		lostTimePayload = lostTimePayload.replace("<CSRF_TOKEN>", csrfToken);
		lostTimePayload = lostTimePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		lostTimePayload = lostTimePayload.replace("<CLAIMANT_NAME>", claimantName);
		lostTimePayload = lostTimePayload.replace("<REPORTED_DATE>", claimInfo.getDateEmployerNotified());
		lostTimePayload = lostTimePayload.replace("<LOCATION>", location);

		Response lostTimeWorkResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, lostTimePayload);
		Log.message("Lost time for work response: "+lostTimeWorkResponse);

		//click next in add claim information page
		String addClaimPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","12.AddClaimInformation");
		addClaimPayload = addClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		addClaimPayload = addClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		addClaimPayload = addClaimPayload.replace("<CLAIMANT_NAME>", claimantName);
		addClaimPayload = addClaimPayload.replace("<REPORTED_DATE>", claimInfo.getDateEmployerNotified());
		addClaimPayload = addClaimPayload.replace("<LOCATION>", location);

		Response addClaimInformationResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addClaimPayload);
		Log.message("Add Claim information page response: "+addClaimInformationResponse);
	}

	@Override
	public String saveAndAssignClaim() {
		
		//click Finish button
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		String saveAndAssignPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","13.SaveAndAssignClaim");
		saveAndAssignPayload = saveAndAssignPayload.replace("<CSRF_TOKEN>", csrfToken);
		saveAndAssignPayload = saveAndAssignPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response saveAndAssignClaimResponse=CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, saveAndAssignPayload);
		Log.message("Save and assign page response: "+saveAndAssignClaimResponse);
		String result = CCAPIUtils.getHTMLAttributeValue(saveAndAssignClaimResponse, "NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-GoToClaim");
		String claimNo = result.replaceAll("[^\\d]", "");
		
		/* Clear ThreadLocal values */
		CCAPIUtils.clearThreadLocalValues();
		
		return claimNo;
	}

	@Override
	public void viewClaim() {
		
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		//click the go to claim link after claim is created
		String viewClaimPayload = CCAPIUtils.readFormDataFile("WorkersCompensation","14.ViewClaim");
		viewClaimPayload = viewClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		viewClaimPayload = viewClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Response viewClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Log.message("View claim page response: "+viewClaimResponse);
	}

	@Override
	public void assignClaim(AssignClaim assignClaim) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createReserve(Exposure exposure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExposure(Exposure exposure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void paymentChecks(PaymentOptions PaymentOptions) {
		// TODO Auto-generated method stub

	}

	@Override
	public void emailClaim(EmailDetails emailDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDocumentCreation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addClaimService(ServiceDetails serviceDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeClaim(CloseClaim closeClaim) {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeExistingExposure(CloseExposure closeExposure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLossDetails(LossDetails loseDeatils) {
		// TODO Auto-generated method stub

	}

	@Override
	public void completeWorkplan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyClaimStatus(ClaimStatus claimStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public String searchClaim(SearchClaim searchClaim) {
		// TODO Auto-generated method stub
		return null;
	}


}

