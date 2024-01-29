package com.aspire.guidewire.cc.teststeps.businessowners;

import com.aspire.guidewire.api.utils.CCAPIUtils;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Searchpolicy;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.SearchClaim;

import io.restassured.response.Response;

public class APIBusinessOwnersStepsImpl implements BusinessOwnersSteps {
	
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
		String searchOrCreatePayload = CCAPIUtils.readFormDataFile("BusinesssOwners","4.CreateClaim");
		searchOrCreatePayload = searchOrCreatePayload.replace("<CSRF_TOKEN>", csrfToken);
		searchOrCreatePayload = searchOrCreatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		searchOrCreatePayload = searchOrCreatePayload.replace("<LOSS_DATE>", searchPolicy.getLossDate());
		searchOrCreatePayload = searchOrCreatePayload.replace("<POLICY_NUMBER>", searchPolicy.getPolicyNo());

		Response searchorCreateResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchOrCreatePayload);
		Log.message("Search Policy response: "+searchorCreateResponse);
		CCAPIUtils.setClaimantName(searchorCreateResponse);
		return null;	
		
	}
	
	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		String claimantName = CCAPIUtils.getClaimantName();
		
		// Refresh for selecting claim Name
		String refreshPayload = CCAPIUtils.readFormDataFile("BusinesssOwners","5.RefreshforClaimantName");
		refreshPayload = refreshPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPayload = refreshPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refreshPayload = refreshPayload.replace("<CLAIMANT_NAME>", claimantName);
		refreshPayload = refreshPayload.replace("<LOSS_DATE>", basicInfo.getLossDate());
		
		Response refreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPayload);
		Log.message("ClaimantName refresh response: "+refreshResponse);
		
		//selecting claimant name
		String basicInformationPayload = CCAPIUtils.readFormDataFile("BusinesssOwners","6.BasicInformation");
		basicInformationPayload = basicInformationPayload.replace("<CSRF_TOKEN>", csrfToken);
		basicInformationPayload = basicInformationPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		basicInformationPayload = basicInformationPayload.replace("<CLAIMANT_NAME>", claimantName);
		basicInformationPayload = basicInformationPayload.replace("<LOSS_DATE>", basicInfo.getLossDate());
		
		Response basicInformationResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, basicInformationPayload);
		Log.message("Basic Information Page response: "+basicInformationResponse);
		
	}

	public void addClaimInformation(ClaimInfo claimInfo) {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		// Adding Claim info
		String closePayload = CCAPIUtils.readFormDataFile("BusinesssOwners","7.AddClaimInformation");
		closePayload = closePayload.replace("<CSRF_TOKEN>", csrfToken);
		closePayload = closePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		Response closeButtonResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, closePayload);
		Log.message("Close Button response: "+closeButtonResponse);
		
		//Refresh for Claim information
		String propertyDamagePayload = CCAPIUtils.readFormDataFile("BusinesssOwners","8.RefreshAddClaim");
		propertyDamagePayload = propertyDamagePayload.replace("<CSRF_TOKEN>", csrfToken);
		propertyDamagePayload = propertyDamagePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		Response addClaimRefreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, propertyDamagePayload);
		Log.message("Add Claim refresh response: "+addClaimRefreshResponse);

		// Save and Claim
		String refreshPropertyPayload = CCAPIUtils.readFormDataFile("BusinesssOwners","9.SaveAndClaim");
		refreshPropertyPayload = refreshPropertyPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPropertyPayload = refreshPropertyPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		Response addClaimInformationResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPropertyPayload);
		Log.message("Add claim information page response: "+addClaimInformationResponse);

		
	}
	@Override
	public String saveAndAssignClaim() {
		
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		//click finish in save and assign claim page
		String saveAndAssignClaimPayload = CCAPIUtils.readFormDataFile("BusinesssOwners","10.NewClaim");
		saveAndAssignClaimPayload = saveAndAssignClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		saveAndAssignClaimPayload = saveAndAssignClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		Response saveAndAssignClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, saveAndAssignClaimPayload);
		Log.message("Save and assign page response: "+saveAndAssignClaimResponse);
		String result = CCAPIUtils.getHTMLAttributeValue(saveAndAssignClaimResponse, "NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-GoToClaim");
		String claimNo = result.replaceAll("[^\\d]", "");
		
		/* Clear ThreadLocal values */
		CCAPIUtils.clearThreadLocalValues();
		
		return claimNo;
	}

	public void addServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCoveragesByType(
			com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoveragesByType chooseCovearges) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createNote(
			com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.CreateNote createNote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentChecks(
			com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.PaymentOptions paymentOptions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignClaim(
			com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.AssignClaim assignClaim) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createReserve(com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Reserve reserve) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addClaimService(
			com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ServiceDetails serviceDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewDocumentClaim(
			com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseDocumentsByType chooseDocumentsByType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reOpenClaim(ReOpenClaim reOpenClaim) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateExposure(ExposureDetails exposureDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCoverages(ChooseCoverages chooseCoverages) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewClaim() {
		// TODO Auto-generated method stub
	}

	@Override
	public String searchClaim(SearchClaim searchClaim) {
		// TODO Auto-generated method stub
		return null;
	}



	
}