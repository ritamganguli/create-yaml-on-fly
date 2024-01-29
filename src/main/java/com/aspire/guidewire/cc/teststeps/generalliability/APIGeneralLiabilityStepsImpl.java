package com.aspire.guidewire.cc.teststeps.generalliability;

import com.aspire.guidewire.api.utils.CCAPIUtils;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ServiceDetails;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.SearchClaim;

import io.restassured.response.Response;


public class APIGeneralLiabilityStepsImpl implements GeneralLiabilitySteps {

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
		String searchOrCreatePayload = CCAPIUtils.readFormDataFile("generalLiability","4.SearchOrCreatePolicy");
		searchOrCreatePayload = searchOrCreatePayload.replace("<CSRF_TOKEN>", csrfToken);
		searchOrCreatePayload = searchOrCreatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		searchOrCreatePayload = searchOrCreatePayload.replace("<LOSS_DATE>", searchPolicy.getLossDate());
		searchOrCreatePayload = searchOrCreatePayload.replace("<POLICY_NUMBER>", searchPolicy.getPolicyNo());

		Response searchorCreateResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchOrCreatePayload);
		Log.message("Search Policy Page response: "+searchorCreateResponse);
		CCAPIUtils.setClaimantName(searchorCreateResponse);
		return null;	

	}

	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		String claimantName = CCAPIUtils.getClaimantName();

		// Refresh for selecting claimant Name
		String refreshPayload = CCAPIUtils.readFormDataFile("generalLiability","5.RefreshForClaimantName");
		refreshPayload = refreshPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPayload = refreshPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refreshPayload = refreshPayload.replace("<CLAIMANT_NAME>", claimantName);
		refreshPayload = refreshPayload.replace("<LOSS_DATE>", basicInfo.getLossDate());

		Response refreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPayload);
		Log.message("ClaimantName refresh response: "+refreshResponse);

		//selecting claimant name
		String basicInformationPayload = CCAPIUtils.readFormDataFile("generalLiability","6.BasicInformation");
		basicInformationPayload = basicInformationPayload.replace("<CSRF_TOKEN>", csrfToken);
		basicInformationPayload = basicInformationPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		basicInformationPayload = basicInformationPayload.replace("<CLAIMANT_NAME>", claimantName);
		basicInformationPayload = basicInformationPayload.replace("<LOSS_DATE>", basicInfo.getLossDate());

		Response basicInfoResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, basicInformationPayload);
		Log.message("Basic Information Page response: "+basicInfoResponse);
	}

	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		// To close duplicate claim popup
		String closePayload = CCAPIUtils.readFormDataFile("generalLiability","7.CloseButton");
		closePayload = closePayload.replace("<CSRF_TOKEN>", csrfToken);
		closePayload = closePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response closeButtonResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, closePayload);
		Log.message("Close Button response: "+closeButtonResponse);

		// To add loss cause
		String lossDetailsPayload = CCAPIUtils.readFormDataFile("generalLiability","8.LossCause");
		lossDetailsPayload = lossDetailsPayload.replace("<CSRF_TOKEN>", csrfToken);
		lossDetailsPayload = lossDetailsPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response lossCauseResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, lossDetailsPayload);
		Log.message("Loss cause response: "+lossCauseResponse);
		
		// To add loss location
		String lossLocationPayload = CCAPIUtils.readFormDataFile("generalLiability","9.LossLocation");
		lossLocationPayload = lossLocationPayload.replace("<CSRF_TOKEN>", csrfToken);
		lossDetailsPayload = lossLocationPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		Response lossLocationResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, lossLocationPayload);
		Log.message("Loss Location response: "+lossLocationResponse);

		// To add claim Information
		String addClaimInformationPayload = CCAPIUtils.readFormDataFile("generalLiability","10.AddClaimInformation");
		addClaimInformationPayload = addClaimInformationPayload.replace("<CSRF_TOKEN>", csrfToken);
		addClaimInformationPayload = addClaimInformationPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addClaimInformationResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addClaimInformationPayload);
		Log.message("Add Claim information page response: "+addClaimInformationResponse);

	}

	@Override
	public String saveAndAssignClaim() {
		
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		//click finish in save and assign claim page
		String saveAndAssignPayload = CCAPIUtils.readFormDataFile("generalLiability","11.SaveAndAssignClaim");
		saveAndAssignPayload = saveAndAssignPayload.replace("<CSRF_TOKEN>", csrfToken);
		saveAndAssignPayload = saveAndAssignPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response saveAndAssignClaimResponse=CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, saveAndAssignPayload);
		Log.message("Save and assign page response: "+saveAndAssignClaimResponse);
		String result = CCAPIUtils.getHTMLAttributeValue(saveAndAssignClaimResponse, "NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-Header");
		String claimNo = result.replaceAll("[^\\d]", "");
		
		/* Clear ThreadLocal values */
		CCAPIUtils.clearThreadLocalValues();
		
		return claimNo;

	}

	@Override
	public void viewClaim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCoveragesByType(ChooseCoveragesByType ChooseCoveragesByType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCoverages(ChooseCoverages chooseCoverages) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createReserve(Reserve reserve) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addClaimService(ServiceDetails serviceDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void paymentChecks(PaymentOptions PaymentOptions) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createNote(CreateNote createNote) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createDocument(ChooseDocumentsByType chooseDocumentsByType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDocumentCreation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void assignClaim(AssignClaim assignClaim) {
		// TODO Auto-generated method stub

	}

	@Override
	public String searchClaim(SearchClaim searchClaim) {
		// TODO Auto-generated method stub
		return null;
	}	
}