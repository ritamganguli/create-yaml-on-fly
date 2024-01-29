package com.aspire.guidewire.cc.teststeps.personalauto;

import com.aspire.guidewire.api.utils.CCAPIUtils;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.SubrogationDetails;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIPersonalAutoStepsImpl implements PersonalAutoSteps {


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
		String searchOrCreatePayload = CCAPIUtils.readFormDataFile("auto","4.SearchOrCreatePolicy");
		searchOrCreatePayload = searchOrCreatePayload.replace("<CSRF_TOKEN>", csrfToken);
		searchOrCreatePayload = searchOrCreatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		searchOrCreatePayload = searchOrCreatePayload.replace("<LOSS_DATE>", searchPolicy.getLossDate());
		searchOrCreatePayload = searchOrCreatePayload.replace("<POLICY_NUMBER>", searchPolicy.getPolicyNo());

		Response searchPolicyResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchOrCreatePayload);
		Log.message("search Policy response: "+searchPolicyResponse);
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
		String refreshPayload = CCAPIUtils.readFormDataFile("auto","5.RefreshForClaimantName");
		refreshPayload = refreshPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPayload = refreshPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refreshPayload = refreshPayload.replace("<CLAIMANT_NAME>", claimantName);

		Response refreshForClaimantNameResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPayload);
		Log.message("Refresh For ClaimantName response: "+refreshForClaimantNameResponse);
		
		//selecting claimant name
		String basicInformationPayload = CCAPIUtils.readFormDataFile("auto","6.BasicInformation");
		basicInformationPayload = basicInformationPayload.replace("<CSRF_TOKEN>", csrfToken);
		basicInformationPayload = basicInformationPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		basicInformationPayload = basicInformationPayload.replace("<CLAIMANT_NAME>", claimantName);

		Response basicInformationResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, basicInformationPayload);
		Log.message("basic Information response: "+basicInformationResponse);
	}


	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();

		// To close duplicate claim popup
		String closePayload = CCAPIUtils.readFormDataFile("auto","7.CloseButton");
		closePayload = closePayload.replace("<CSRF_TOKEN>", csrfToken);
		closePayload = closePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response closePayloadResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, closePayload);
		Log.message("close Button response: "+closePayloadResponse);
		
		//adding property damage
		String propertyDamagePayload = CCAPIUtils.readFormDataFile("auto","8.addPropertyDamage");
		propertyDamagePayload = propertyDamagePayload.replace("<CSRF_TOKEN>", csrfToken);
		propertyDamagePayload = propertyDamagePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addPropertyDamageResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, propertyDamagePayload);
		Log.message("Add Property Damage response: "+addPropertyDamageResponse);
		
		// Refresh for selecting property name
		String refreshPropertyPayload = CCAPIUtils.readFormDataFile("auto","9.RefreshForPropertyName");
		refreshPropertyPayload = refreshPropertyPayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshPropertyPayload = refreshPropertyPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response refreshForPropertyNameResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshPropertyPayload);
		Log.message("Refresh For Property Name response: "+refreshForPropertyNameResponse);
		
		//updating property name
		String updatePropertyPayload = CCAPIUtils.readFormDataFile("auto","10.UpdatePropertyName");
		updatePropertyPayload = updatePropertyPayload.replace("<CSRF_TOKEN>", csrfToken);
		updatePropertyPayload = updatePropertyPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response updatePropertyNameResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePropertyPayload);
		Log.message("update PropertyName response: "+updatePropertyNameResponse);
		
		// Refresh for selecting state from dropdown
		String refreshForStatePayload = CCAPIUtils.readFormDataFile("auto","11.RefreshForState");
		refreshForStatePayload = refreshForStatePayload.replace("<CSRF_TOKEN>", csrfToken);
		refreshForStatePayload = refreshForStatePayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response refreshForStateResponse =  CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refreshForStatePayload);
		Log.message("refresh For State response: "+refreshForStateResponse);
		
		//adding loss details
		String lossDetailsPayload = CCAPIUtils.readFormDataFile("auto","12.LossDetails");
		lossDetailsPayload = lossDetailsPayload.replace("<CSRF_TOKEN>", csrfToken);
		lossDetailsPayload = lossDetailsPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response lossDetailsResponse =  CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, lossDetailsPayload);
		Log.message("loss Details response: "+lossDetailsResponse);
	}

	@Override
	public void addServices() {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		// click next in services page
		String servicesPayload = CCAPIUtils.readFormDataFile("auto","13.Services");
		servicesPayload = servicesPayload.replace("<CSRF_TOKEN>", csrfToken);
		servicesPayload = servicesPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response servicesResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, servicesPayload);
		Log.message("services response: "+servicesResponse);
	}

	@Override
	public String saveAndAssignClaim() {

		String csrfToken = CCAPIUtils.getCSRFToken();
		String cookieSessionID = CCAPIUtils.getCookieSessionID();
		String fileUploadURL = CCAPIUtils.getFileUploadURL();
		
		//click finish in save and assign claim page
		String saveAndAssignClaimPayload = CCAPIUtils.readFormDataFile("auto","14.SaveAndAssignClaim");
		saveAndAssignClaimPayload = saveAndAssignClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		saveAndAssignClaimPayload = saveAndAssignClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response saveAndAssignClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, saveAndAssignClaimPayload);
		Log.message("Save And Assign Claim response: "+saveAndAssignClaimResponse);
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
		String viewClaimPayload = CCAPIUtils.readFormDataFile("auto","15.ViewClaim");
		viewClaimPayload = viewClaimPayload.replace("<CSRF_TOKEN>", csrfToken);
		viewClaimPayload = viewClaimPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Response viewClaimResponse = CCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewClaimPayload);
		Log.message("view Claim response: "+viewClaimResponse);
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
	public void updateExposure(ExposureDetails exposureDetails) {
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
	public void verifyNoteCreation(CreateNote createNote) {
		// TODO Auto-generated method stub

	}

	@Override
	public void logoutTheApplication() {
		// TODO Auto-generated method stub

	}
	@Override
	public String searchClaim(SearchClaim searchClaim) {
	return null;

	}

}
