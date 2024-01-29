package com.aspire.guidewire.cc.teststeps.homeowners;

import com.aspire.guidewire.api.utils.CCAPIUtils;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ExposureDataUnavailability;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.SubrogationDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.WorkPlanDataUnavailability;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.SearchClaim;

import io.restassured.response.Response;


public class APIHomeOwnersStepsImpl implements HomeOwnersSteps {

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
		String searchOrCreatePayload = CCAPIUtils.readFormDataFile("HomeOwners","4.SearchorCreatePolicy");
		searchOrCreatePayload = searchOrCreatePayload.replace("<CSRF_TOKEN>", csrfToken);
		searchOrCreatePayload = searchOrCreatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		searchOrCreatePayload = searchOrCreatePayload.replace("<LOSS_DATE>", searchPolicy.getLossDate());
		searchOrCreatePayload = searchOrCreatePayload.replace("<POLICY_NUMBER>", searchPolicy.getPolicyNo());

		CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchOrCreatePayload);
		Response searchPolicyResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchOrCreatePayload);
		Log.message("Search Policy Page response: "+searchPolicyResponse);
		CCAPIUtils.setClaimantName(searchPolicyResponse);
		return null;	


	}

	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {
		//Enter claimant name and claimant type
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		String claimantName = CCAPIUtils.getClaimantName();

		// Refresh for selecting claimant Name
		String refreshPayload = CCAPIUtils.readFormDataFile("HomeOwners","5.RefreshForClaimantName");
		refreshPayload = refreshPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPayload = refreshPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refreshPayload = refreshPayload.replace("<CLAIMANT_NAME>", claimantName);

		Response refreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPayload);
		Log.message("ClaimantName refresh response: "+refreshResponse);

		//selecting claimant name
		String basicInformationPayload = CCAPIUtils.readFormDataFile("HomeOwners","6.BasicInformation");
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

		// To close duplicate claim popup
		String closePayload = CCAPIUtils.readFormDataFile("HomeOwners","7.CloseButton");
		closePayload = closePayload.replace("<CSRF_TOKEN>", csrfToken);
		closePayload = closePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response closeButtonResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, closePayload);
		Log.message("Close Button response: "+closeButtonResponse);

		//choose loss cause
		String propertyDamagePayload = CCAPIUtils.readFormDataFile("HomeOwners","8.LossCause");
		propertyDamagePayload = propertyDamagePayload.replace("<CSRF_TOKEN>", csrfToken);
		propertyDamagePayload = propertyDamagePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response lossCauseResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, propertyDamagePayload);
		Log.message("Loss cause response: "+lossCauseResponse);

		// click property damage
		String refreshPropertyPayload = CCAPIUtils.readFormDataFile("HomeOwners","9.AddPropertyDamage");
		refreshPropertyPayload = refreshPropertyPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPropertyPayload = refreshPropertyPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response propertyDamageRefreshResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPropertyPayload);
		Log.message("Property Damage refresh response: "+propertyDamageRefreshResponse);

		//updating property name
		String updatePropertyPayload = CCAPIUtils.readFormDataFile("HomeOwners","10.UpdatePropertyName");
		updatePropertyPayload = updatePropertyPayload.replace("<CSRF_TOKEN>", csrfToken);
		updatePropertyPayload = updatePropertyPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response propertyNameResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePropertyPayload);
		Log.message("Property Name response: "+propertyNameResponse);

		//adding loss details
		String refreshForStatePayload = CCAPIUtils.readFormDataFile("HomeOwners","11.LossDetails");
		refreshForStatePayload = refreshForStatePayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshForStatePayload = refreshForStatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response lossDetailsResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshForStatePayload);
		Log.message("Loss Details response: "+lossDetailsResponse);
		
	}
		

	@Override
	public void addServices() {
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		// click next in services page
		String servicesPayload = CCAPIUtils.readFormDataFile("HomeOwners","12.Services");
		servicesPayload = servicesPayload.replace("<CSRF_TOKEN>", csrfToken);
		servicesPayload = servicesPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addServiceResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, servicesPayload);
		Log.message("Service Page response: "+addServiceResponse);

	}
		

	@Override
	public String saveAndAssignClaim() {
		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		//click finish in save and assign claim page
		String saveAndAssignClaimPayload = CCAPIUtils.readFormDataFile("HomeOwners","13.SaveAndAssignClaim");
		saveAndAssignClaimPayload = saveAndAssignClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		saveAndAssignClaimPayload = saveAndAssignClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response saveAndAssignClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, saveAndAssignClaimPayload);
		Log.message("Save and assign page response: "+saveAndAssignClaimResponse);
		String result = CCAPIUtils.getHTMLAttributeValue(saveAndAssignClaimResponse, "NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-GoToClaim");
		String claimNo = result.replaceAll("[^\\d]", "");
		System.out.println("claimNumber is --->>>"+claimNo);
		
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
		String viewClaimPayload = CCAPIUtils.readFormDataFile("HomeOwners","14.ViewClaim");
		viewClaimPayload = viewClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		viewClaimPayload = viewClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Response viewClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Log.message("view claim page response: "+viewClaimResponse);
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
	public void createNote(CreateNote createNote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignClaim(AssignClaim assignClaim) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLossDetails(LossDetails lossDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addClaimService(ServiceDetails serviceDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emailClaim(EmailDetails emailDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDocument(ChooseDocumentsByType chooseDocumentsByType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateExposureStatus(ExposureDetails exposureDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentChecks(PaymentOptions PaymentOptions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyDocumentCreation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reOpenClaim(ReOpenClaim reOpenClaim) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSubrogation(SubrogationDetails subrogationDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyExposureDataUnavailability(ExposureDataUnavailability exposureDataUnavailability) {
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

	@Override
	public void verifyNoteCreation(CreateNote createNote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String searchClaim(SearchClaim searchClaim) {
		// TODO Auto-generated method stub
		return null;
	}

}