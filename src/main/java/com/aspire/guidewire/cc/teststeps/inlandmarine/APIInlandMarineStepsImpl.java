package com.aspire.guidewire.cc.teststeps.inlandmarine;


import com.aspire.guidewire.api.utils.CCAPIUtils;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.WorkPlanDataUnavailability;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIInlandMarineStepsImpl implements InlandMarineSteps {
	
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
		String searchOrCreatePayload = CCAPIUtils.readFormDataFile("inlandMarine","4.SearchOrCreatePolicy");
		searchOrCreatePayload = searchOrCreatePayload.replace("<CSRF_TOKEN>", csrfToken);
		searchOrCreatePayload = searchOrCreatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		searchOrCreatePayload = searchOrCreatePayload.replace("<LOSS_DATE>", searchPolicy.getLossDate());
		searchOrCreatePayload = searchOrCreatePayload.replace("<POLICY_NUMBER>", searchPolicy.getPolicyNo());

		Response basicInfoResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchOrCreatePayload);
		Log.message("Search Policy Page response: "+basicInfoResponse);
	    CCAPIUtils.setClaimantNameForInlandMarine(basicInfoResponse);
		return null;	
		
	}
	
	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		String claimantName = CCAPIUtils.getClaimantNameForInlandMarine();
		
		// Refresh for selecting claimant Name
		String refreshPayload = CCAPIUtils.readFormDataFile("inlandMarine","5.RefreshForClaimantName");
		refreshPayload = refreshPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPayload = refreshPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refreshPayload = refreshPayload.replace("<CLAIMANT_NAME>", claimantName);
		
		Response refreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPayload);
		Log.message("ClaimantName refresh response: "+refreshResponse);
		
		//selecting claimant name
		String basicInformationPayload = CCAPIUtils.readFormDataFile("inlandMarine","6.BasicInformation");
		basicInformationPayload = basicInformationPayload.replace("<CSRF_TOKEN>", csrfToken);
		basicInformationPayload = basicInformationPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		basicInformationPayload = basicInformationPayload.replace("<CLAIMANT_NAME>", claimantName);
		
		Response basicInfoResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, basicInformationPayload);
		Log.message("Basic Information Page response: "+basicInfoResponse);
		
	}

	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		 //To close duplicate claim popup
		String closePayload = CCAPIUtils.readFormDataFile("inlandMarine","7.CloseDuplicateClaim");
		closePayload = closePayload.replace("<CSRF_TOKEN>", csrfToken);
		closePayload = closePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		Response closeButtonResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, closePayload);
		Log.message("Close Button response: "+closeButtonResponse);
				
		// Refresh for selecting state from dropdown
		String refreshForStatePayload = CCAPIUtils.readFormDataFile("inlandMarine","8.RefreshForState");
		refreshForStatePayload = refreshForStatePayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshForStatePayload = refreshForStatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		//refreshForStatePayload = refreshForStatePayload.replace("<LOSS_CAUSE>", claimInfo.getLossCause());

		Response selectStateRefreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshForStatePayload);
		Log.message("select state refresh response: "+selectStateRefreshResponse);
		
		//adding loss details
		String lossDetailsPayload = CCAPIUtils.readFormDataFile("inlandMarine","9.LossDetails");
		lossDetailsPayload = lossDetailsPayload.replace("<CSRF_TOKEN>", csrfToken);
		lossDetailsPayload = lossDetailsPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		//lossDetailsPayload = lossDetailsPayload.replace("<LOSS_CAUSE", claimInfo.getLossCause());

		Response addLossdetailsResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, lossDetailsPayload);
		Log.message("Add loss Details  response: "+addLossdetailsResponse);
		
	}
	
	@Override
	public void addServices() {
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		// click next in services page
		String servicesPayload = CCAPIUtils.readFormDataFile("inlandMarine","10.AddServices");
		servicesPayload = servicesPayload.replace("<CSRF_TOKEN>", csrfToken);
		servicesPayload = servicesPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		Response addServicesResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, servicesPayload);
		Log.message("Add service response: "+addServicesResponse);
		
	}

	@Override
	public String saveAndAssignClaim() {
		
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		//click finish in save and assign claim page
		String saveAndAssignClaimPayload = CCAPIUtils.readFormDataFile("inlandMarine","11.SaveAndAssignClaim");
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

	@Override
	public void viewClaim() {
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		//click the go to claim link after claim is created
		String viewClaimPayload = CCAPIUtils.readFormDataFile("inlandMarine","15.ViewClaim");
		viewClaimPayload = viewClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		viewClaimPayload = viewClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		
		CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Response viewClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Log.message("View claim page response: "+viewClaimResponse);
		
		
	}

	/**
	 * Click Claim toggle menu
	 * Enter "claimnumber" in search 
	 * Click search button
	 * Get insured name
	 */
	@Override
	public String searchClaim(SearchClaim searchClaim) {
		return null;
	}
	@Override
	public void addCoveragesByType(ChooseCoveragesByType ChooseCovearges) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCoverages(ChooseCoverages chooseCoverages) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createNewExposure(Coverage Coverage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createNote(CreateNote createNote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentChecks(PaymentOptions PaymentOptions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addClaimService(ServiceDetails serviceDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newDocumentClaim(ChooseDocumentsByType chooseDocumentsByType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignClaim(AssignClaim assignClaim) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyWorkPlanDataUnavailability(WorkPlanDataUnavailability workPlanDataUnavailability) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeClaim(CloseClaim closeClaim) {
		// TODO Auto-generated method stub
		
	}
	
}