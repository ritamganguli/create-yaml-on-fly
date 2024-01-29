package com.aspire.guidewire.pc.teststeps.commercialpackage;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBlanketDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragesDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddExposuresDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineSelectionDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ViewQuote;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APICommercialPackageStepsImpl implements CommercialPackageSteps {

	@Override
	public void loginIntoTheApplication(String username, String password) {

		/* Invoke application */

		Response invokeAppResponse = PCAPIUtils.sendGetRequest();
		PCAPIUtils.setCSRFToken(invokeAppResponse);
		PCAPIUtils.setCookieSessionID(invokeAppResponse);

		/* Login to the application */
		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String loginPayload = PCAPIUtils.readFormDataFile("common", "1.Login");
		loginPayload = loginPayload.replace("<USERNAME>", username);
		loginPayload = loginPayload.replace("<PASSWORD>", password);
		loginPayload = loginPayload.replace("<CSRF_TOKEN>", csrfToken);
		loginPayload = loginPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

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
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String newAccountPayload = PCAPIUtils.readFormDataFile("common", "2.NewAccount");
		newAccountPayload = newAccountPayload.replace("<CSRF_TOKEN>", csrfToken);
		newAccountPayload = newAccountPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response newAccountResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newAccountPayload);
		Log.message("Create new Account response: "+newAccountResponse);

		/* Search Account */

		String searchAccountPayload = PCAPIUtils.readFormDataFile("common", "3.SearchAccount");
		searchAccountPayload = searchAccountPayload.replace("<FIRST_NAME>", enterAccountInformation.getFirstName());
		searchAccountPayload = searchAccountPayload.replace("<LAST_NAME>", enterAccountInformation.getLastName());
		searchAccountPayload = searchAccountPayload.replace("<CSRF_TOKEN>", csrfToken);
		searchAccountPayload = searchAccountPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response searchAccountResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchAccountPayload);
		Log.message("Search Account response: "+searchAccountResponse);
		return null;
	}

	@Override
	public String createAccount(CreateNewAccount createNewAccount) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		CreateAccountOptions createAccountOption = createNewAccount.getCreateAccountPreference();
		CreateNewAccountFromPerson createNewAccountFromPerson = null;
		String accountNumber = null;

		switch (createAccountOption) {

		case PERSON:
			createNewAccountFromPerson = (CreateNewAccountFromPerson) createNewAccount;

			/* Click Create Account From Person */

			String fromPersonPayload = PCAPIUtils.readFormDataFile("common", "4.FromPerson");
			fromPersonPayload = fromPersonPayload.replace("<FIRST_NAME>", createNewAccountFromPerson.getFirstName());
			fromPersonPayload = fromPersonPayload.replace("<LAST_NAME>", createNewAccountFromPerson.getLastName());
			fromPersonPayload = fromPersonPayload.replace("<CSRF_TOKEN>", csrfToken);
			fromPersonPayload = fromPersonPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response createAccountForPersonResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromPersonPayload);
			Log.message("Create Account For Person response: "+createAccountForPersonResponse);

			/* Enter create account from person details */

			String createAccountFromPersonPayload = PCAPIUtils.readFormDataFile("common", "5.CreateNewAccountFromPerson");
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<FIRST_NAME>",
					createNewAccountFromPerson.getFirstName());
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<LAST_NAME>",
					createNewAccountFromPerson.getLastName());
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
			createAccountFromPersonPayload = createAccountFromPersonPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, createAccountFromPersonPayload);

			/* Re-sending request to ignore producer code missing error */

			response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, createAccountFromPersonPayload);
			Log.message("Account Created response: "+response);
			accountNumber = PCAPIUtils.getHTMLAttributeValue(response,"AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountNumber");
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
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String fromSelectProductPayload = PCAPIUtils.readFormDataFile("common", "6.CreateNewSubmission");
		fromSelectProductPayload = fromSelectProductPayload.replace("<CSRF_TOKEN>", csrfToken);
		fromSelectProductPayload = fromSelectProductPayload.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response newSubmissionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, fromSelectProductPayload);
		Log.message("New Submission response: "+newSubmissionResponse);

		/* Choose the Product */

		String selectPolicy = PCAPIUtils.readFormDataFile("commercialPackage", "7.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);
		Log.message("Select Policy response: "+selectPolicyResponse);

	}

	@Override
	public void selectOfferings(Offerings offerings) {

		/* Select the Offerings */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateofferings = PCAPIUtils.readFormDataFile("commercialPackage", "8.SelectOfferings");
		updateofferings = updateofferings.replace("<CSRF_TOKEN>", csrfToken);
		updateofferings = updateofferings.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response offeringsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateofferings);
		Log.message("Offerings Page response: "+offeringsResponse);

	}

	@Override
	public void updatePolicyInfo(PolicyInfo policyInfo) {

		/* Update the PolicyInfo */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updatePolicy = PCAPIUtils.readFormDataFile("commercialPackage", "18.UpdatePolicyInfo");
		updatePolicy = updatePolicy.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicy = updatePolicy.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicy);
		Log.message("Policy Info Page response: "+policyInfoResponse);

	}

	@Override
	public void selectQualifications() {
		/* Select the Qualification */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String selectQualification = PCAPIUtils.readFormDataFile("commercialPackage", "9.SelectQualification");
		selectQualification = selectQualification.replace("<CSRF_TOKEN>", csrfToken);
		selectQualification = selectQualification.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response qualificationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectQualification);
		Log.message("Qualification Page response: "+qualificationResponse);

	}

	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {

		/* Update Modifiers */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateModifiers = PCAPIUtils.readFormDataFile("commercialPackage", "49.UpdateModifiers");
		updateModifiers = updateModifiers.replace("<CSRF_TOKEN>", csrfToken);
		updateModifiers = updateModifiers.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response modifiersResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateModifiers);
		Log.message("Modifiers Page response: "+modifiersResponse);

		/* Click Quote */

		String clickQuote = PCAPIUtils.readFormDataFile("commercialPackage", "50.ClickQuote");
		clickQuote = clickQuote.replace("<CSRF_TOKEN>", csrfToken);
		clickQuote = clickQuote.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response clickQuoteResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickQuote);
		Log.message("Click Quote response: "+clickQuoteResponse);
	}


	@Override
	public void viewForms() {

		/*View Forms*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String viewForms = PCAPIUtils.readFormDataFile("common","22.ViewForms");

		viewForms = viewForms.replace("<CSRF_TOKEN>", csrfToken);
		viewForms = viewForms.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response viewFormsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewForms);
		Log.message(" Forms Page response: "+viewFormsResponse);

	}

	@Override
	public void selectPayments(Payments payments) {

		/*Select Payment method*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String selectPayment = PCAPIUtils.readFormDataFile("common","23.UpdatePaymentDetails");

		selectPayment = selectPayment.replace("<CSRF_TOKEN>", csrfToken);
		selectPayment = selectPayment.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response paymentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPayment);
		Log.message("Payment Page response: "+paymentPageResponse);

	}

	@Override
	public void addModifiersDetails() {

		/* Update Modifiers */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String modifiers = PCAPIUtils.readFormDataFile("commercialPackage", "22.UpdateModifiers");
		modifiers = modifiers.replace("<CSRF_TOKEN>", csrfToken);
		modifiers = modifiers.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response modifiersPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, modifiers);
		Log.message("Modifiers Page response: "+modifiersPageResponse);

	}

	@Override
	public void addLineSelectionDetails(AddLineSelectionDetails addLineSelectionDetails) {
		/* Update Line Selection */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateLineselection = PCAPIUtils.readFormDataFile("commercialPackage", "11.LineSelection");
		updateLineselection = updateLineselection.replace("<CSRF_TOKEN>", csrfToken);
		updateLineselection = updateLineselection.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addLineSelectionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateLineselection);
		Log.message("Add Line Selection Page response: "+addLineSelectionResponse);

	}

	@Override
	public void addLocationDetails(AddLocationDetails addLocationDetails) {

		/* Update Location */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateLocation = PCAPIUtils.readFormDataFile("commercialPackage", "12.UpdateLocation");
		updateLocation = updateLocation.replace("<CSRF_TOKEN>", csrfToken);
		updateLocation = updateLocation.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response locationPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateLocation);
		Log.message("Location Page response: "+locationPageResponse);

	}

	@Override
	public void addBuildingLocationDetails(AddBuildingLocationDetails addAddBuildingLocationDetails) {

		/* Update the Building Location */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		switch (addAddBuildingLocationDetails.getLineType()) {

		case COMMERCIAL_PROPERTY_LINE:

			/* Click New Building */

			String newLocation = PCAPIUtils.readFormDataFile("commercialPackage", "27.NewBuilding");
			newLocation = newLocation.replace("<CSRF_TOKEN>", csrfToken);
			newLocation = newLocation.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response newLocationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newLocation);
			Log.message("New Location response: "+newLocationResponse);

			/* Click Coverage */

			String coverage = PCAPIUtils.readFormDataFile("commercialPackage", "28.ClickCoverage");
			coverage = coverage.replace("<CSRF_TOKEN>", csrfToken);
			coverage = coverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response clickCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, coverage);
			Log.message("Click Coverage response: "+clickCoverageResponse);

			/* Add Building */

			String coverageDetails = PCAPIUtils.readFormDataFile("commercialPackage", "29.AddBuildings");
			coverageDetails = coverageDetails.replace("<CSRF_TOKEN>", csrfToken);
			coverageDetails = coverageDetails.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response coverageDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, coverageDetails);
			Log.message("Coverage Details response: "+coverageDetailsResponse);

			/* Update building location */

			String updateBuildingAndLocation = PCAPIUtils.readFormDataFile("commercialPackage","26.UpdateBuildingAndLocation");
			updateBuildingAndLocation = updateBuildingAndLocation.replace("<CSRF_TOKEN>", csrfToken);
			updateBuildingAndLocation = updateBuildingAndLocation.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response addBuildingLocationPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateBuildingAndLocation);
			Log.message("Add Building Location Page response: "+addBuildingLocationPageResponse);

			break;

		case INLAND_MARINE_LINE:

			/* Update new location */

			String newLoation = PCAPIUtils.readFormDataFile("commercialPackage", "40.InlandMarineNewLocation");
			newLoation = newLoation.replace("<CSRF_TOKEN>", csrfToken);
			newLoation = newLoation.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response inlandMarineNewLocationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newLoation);
			Log.message("New Location response: "+inlandMarineNewLocationResponse);

			/* Enter the Description */

			String description = PCAPIUtils.readFormDataFile("commercialPackage", "41.UpdateDescription");
			description = description.replace("<CSRF_TOKEN>", csrfToken);
			description = description.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response updateDescriptionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, description);
			Log.message("Update Description response: "+updateDescriptionResponse);

			/* Update the Building Location */

			String updateInlandmarineBuildingAndLoation = PCAPIUtils.readFormDataFile("commercialPackage","26.UpdateBuildingAndLocation");
			updateInlandmarineBuildingAndLoation = updateInlandmarineBuildingAndLoation.replace("<CSRF_TOKEN>",csrfToken);
			updateInlandmarineBuildingAndLoation = updateInlandmarineBuildingAndLoation.replace("<FILE_UPLOAD_URL>", fileUploadURL);

			Response updateInlandmarineBuildingAndLoationResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateInlandmarineBuildingAndLoation);
			Log.message("Update Inlandmarine BuildingAndLoation response: "+updateInlandmarineBuildingAndLoationResponse);
		default:
			break;

		}
	}

	@Override
	public void addBlanketDetails(AddBlanketDetails addBlanketDetails) {

		/* Update Blanket Details */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		/* Click Add Blankets */

		String addBlankets = PCAPIUtils.readFormDataFile("commercialPackage", "30.AddBlankets");
		addBlankets = addBlankets.replace("<CSRF_TOKEN>", csrfToken);
		addBlankets = addBlankets.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addBlanketResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addBlankets);
		Log.message("Add Blanket response: "+addBlanketResponse);

		/* Search for Coverages */

		String searchBlanketCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "31.SearchBlanketCoverage");
		searchBlanketCoverage = searchBlanketCoverage.replace("<CSRF_TOKEN>", csrfToken);
		searchBlanketCoverage = searchBlanketCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response searchCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchBlanketCoverage);
		Log.message("Search Coverage response: "+searchCoverageResponse);

		/* Select the Coverages */

		String includeSelectInBlanket = PCAPIUtils.readFormDataFile("commercialPackage","32.ClickIncludeSelectInBlanket");
		includeSelectInBlanket = includeSelectInBlanket.replace("<CSRF_TOKEN>", csrfToken);
		includeSelectInBlanket = includeSelectInBlanket.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response selectCoveargeResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, includeSelectInBlanket);
		Log.message("Select Coverage response: "+selectCoveargeResponse);


		String addBlanketCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "33.AddBlanketCoverage");
		addBlanketCoverage = addBlanketCoverage.replace("<CSRF_TOKEN>", csrfToken);
		addBlanketCoverage = addBlanketCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addBlanketCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addBlanketCoverage);
		Log.message("Add Blanket Coverage response: "+addBlanketCoverageResponse);
		/* Update the Blankets */

		String updateBlankets = PCAPIUtils.readFormDataFile("commercialPackage", "34.UpdateBlankets");
		updateBlankets = updateBlankets.replace("<CSRF_TOKEN>", csrfToken);
		updateBlankets = updateBlankets.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response blanketPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateBlankets);
		Log.message("Blanket Page response: "+blanketPageResponse);

	}

	@Override
	public void addLineReview(AddLineReview addLineReview) {

		/* Update the Line review */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String lineReview = PCAPIUtils.readFormDataFile("commercialPackage", "23.UpdateLineReview");
		lineReview = lineReview.replace("<CSRF_TOKEN>", csrfToken);
		lineReview = lineReview.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response lineReviewPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, lineReview);
		Log.message("Line Review Page response: "+lineReviewPageResponse);

	}

	@Override
	public void addAccountReceivableDetails(AddAccountReceivableDetails addAddAccountReceivableDetails) {


		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		/* Click Accounts Receivable */

		String addAccountsReceivable = PCAPIUtils.readFormDataFile("commercialPackage", "42.AddAccountsReceivable");
		addAccountsReceivable = addAccountsReceivable.replace("<CSRF_TOKEN>", csrfToken);
		addAccountsReceivable = addAccountsReceivable.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response accountReceivable = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addAccountsReceivable);
		Log.message("Click Account Receivable response: "+accountReceivable);

		PCAPIUtils.setBuildingLocation(accountReceivable);



		/* Update Accounts Recievable */

		String location = PCAPIUtils.getLocation();

		String accountsReceivableDetails = PCAPIUtils.readFormDataFile("commercialPackage",	"43.UpdateAccountsReceivable");
		accountsReceivableDetails = accountsReceivableDetails.replace("<CSRF_TOKEN>", csrfToken);
		accountsReceivableDetails = accountsReceivableDetails.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		accountsReceivableDetails = accountsReceivableDetails.replace("<BUILDING_LOCATION>", location);

		Response accountsReceivablePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, accountsReceivableDetails);
		Log.message("Accounts Receivable Page response: "+accountsReceivablePageResponse);

	}

	@Override
	public void addCoveragePartSelections(AddCoveragePartSelections addCoveragePartSelections) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		/* Select Account Recievable */

		String accountsReceivable = PCAPIUtils.readFormDataFile("commercialPackage", "36.AccountsReceivable");
		accountsReceivable = accountsReceivable.replace("<CSRF_TOKEN>", csrfToken);
		accountsReceivable = accountsReceivable.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response selectAccountReceivableResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, accountsReceivable);
		Log.message("Select Account Receivable response: "+selectAccountReceivableResponse);

		/* Select the Contractors Equipments */

		String contractorsEquipment = PCAPIUtils.readFormDataFile("commercialPackage", "37.ContractorsEquipments");
		contractorsEquipment = contractorsEquipment.replace("<CSRF_TOKEN>", csrfToken);
		contractorsEquipment = contractorsEquipment.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response selectContractorsEquipmentResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, contractorsEquipment);
		Log.message("Select Contractor Equipment response: "+selectContractorsEquipmentResponse);

		/* Select the Signs */

		String signs = PCAPIUtils.readFormDataFile("commercialPackage", "38.Signs");
		signs = signs.replace("<CSRF_TOKEN>", csrfToken);
		signs = signs.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response selectSignsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, signs);
		Log.message("Select sign response: "+selectSignsResponse);

		/* Update coverage Part Selection */

		String coveragePartSelection = PCAPIUtils.readFormDataFile("commercialPackage", "39.UpdateCoveragePartSelection");
		coveragePartSelection = coveragePartSelection.replace("<CSRF_TOKEN>", csrfToken);
		coveragePartSelection = coveragePartSelection.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response coveragePartSelectionResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, coveragePartSelection);
		Log.message("Covearge Part selection page response: "+coveragePartSelectionResponse);

	}

	@Override
	public void addContractorsEquipmentDetails(AddContractorsEquipmentDetails addContractorsEquipmentDetails) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		/* Select the Contractor Equipment */

		String selectContractorsEquipment = PCAPIUtils.readFormDataFile("commercialPackage","44.SelectContractorsEquipment");
		selectContractorsEquipment = selectContractorsEquipment.replace("<CSRF_TOKEN>", csrfToken);
		selectContractorsEquipment = selectContractorsEquipment.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response selectContractorEquipmentResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectContractorsEquipment);
		Log.message("Select Contractor Equipment response: "+selectContractorEquipmentResponse);

		/* Update Contractor Equipment */

		String updateContarctorEquipment = PCAPIUtils.readFormDataFile("commercialPackage","45.UpdateContarctorEquipment");
		updateContarctorEquipment = updateContarctorEquipment.replace("<CSRF_TOKEN>", csrfToken);
		updateContarctorEquipment = updateContarctorEquipment.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response contractorEquipmentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateContarctorEquipment);
		Log.message("Contarctor Equipment Page response: "+contractorEquipmentPageResponse);

	}

	@Override
	public void addSignsDetails(AddSignsDetails addSignsDetails) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		/* Click Add Sign */

		String addSign = PCAPIUtils.readFormDataFile("commercialPackage","46.AddSigns");
		addSign = addSign.replace("<CSRF_TOKEN>", csrfToken);
		addSign = addSign.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response signRespone = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addSign);
		Log.message("Click Add sign response: "+signRespone);

		PCAPIUtils.setSignLocation(signRespone);

		/* Update Signs */

		String location = PCAPIUtils.getLocation();

		String updateSigns = PCAPIUtils.readFormDataFile("commercialPackage",	"47.UpdateSigns");

		updateSigns = updateSigns.replace("<CSRF_TOKEN>", csrfToken);
		updateSigns = updateSigns.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		updateSigns = updateSigns.replace("<LOCATION>", location);

		Response signPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateSigns);
		Log.message("Sign Page response: "+signPageResponse);


	}

	@Override
	public void addCoveragesDetails(AddCoveragesDetails addCoveragesDetails) {


		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		/* Click Additional Coverage */

		String addtionalCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "53.clickAddtionalCoverage");
		addtionalCoverage = addtionalCoverage.replace("<CSRF_TOKEN>", csrfToken);
		addtionalCoverage = addtionalCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response clickAdditionalCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addtionalCoverage);
		Log.message("Click Additional Coverage response: "+clickAdditionalCoverageResponse);

		/* Click Add Coverage */

		String addCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "54.clickAdd");
		addCoverage = addCoverage.replace("<CSRF_TOKEN>", csrfToken);
		addCoverage = addCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response clickAddCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addCoverage);
		Log.message("Click Add Coverage response: "+clickAddCoverageResponse);

		/* Search for Coverage */

		String searchCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "55.clickSearch");
		searchCoverage = searchCoverage.replace("<CSRF_TOKEN>", csrfToken);
		searchCoverage = searchCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response searchCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchCoverage);
		Log.message("Search Coverage response: "+searchCoverageResponse);

		/* click require coverage checkbox  */

		String addSearchedCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "51.AddSearchedCoverage");
		addSearchedCoverage = addSearchedCoverage.replace("<CSRF_TOKEN>", csrfToken);
		addSearchedCoverage = addSearchedCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addSearchedCoverage);
		Log.message("Add Coverage response: "+addCoverageResponse);

		/* Update Coverage  */

		String updateCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "52.UpdateCoverage");
		updateCoverage = updateCoverage.replace("<CSRF_TOKEN>", csrfToken);
		updateCoverage = updateCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response coveragePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateCoverage);
		Log.message("Coverage page response: "+coveragePageResponse);

	}

	@Override
	public void addExposuresDetails(AddExposuresDetails addExposuresDetails) {
		/* Click Add Exposure */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String addExposure = PCAPIUtils.readFormDataFile("commercialPackage", "19.AddExposure");
		addExposure = addExposure.replace("<CSRF_TOKEN>", csrfToken);
		addExposure = addExposure.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response addExposureRespone = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addExposure);
		Log.message("Click Add exposure response: "+addExposureRespone);

		PCAPIUtils.setExposuresLocation(addExposureRespone);

		/* Select require location */

		String location = PCAPIUtils.getLocation();

		String refresh = PCAPIUtils.readFormDataFile("commercialPackage", "21.LocationRefresh");
		refresh = refresh.replace("<CSRF_TOKEN>", csrfToken);
		refresh = refresh.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		refresh = refresh.replace("<LOCATION>", location);

		Response locationRefreshResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, refresh);
		Log.message("Loaction refresh: "+locationRefreshResponse);

		/* Update the Exposure */
		String wcCoverage = PCAPIUtils.readFormDataFile("commercialPackage", "20.UpdateExposure");

		wcCoverage = wcCoverage.replace("<CSRF_TOKEN>", csrfToken);
		wcCoverage = wcCoverage.replace("<FILE_UPLOAD_URL>", fileUploadURL);
		wcCoverage = wcCoverage.replace("<LOCATION>", location);

		Response exposureResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, wcCoverage);
		Log.message("Add Exposure response "+exposureResponse);
	}

	@Override
	public void viewQuote(ViewQuote viewQuote) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String updateQuote = PCAPIUtils.readFormDataFile("commercialPackage", "48.Quote");
		updateQuote = updateQuote.replace("<CSRF_TOKEN>", csrfToken);
		updateQuote = updateQuote.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		Response viewQuoteResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateQuote);
		Log.message("View Quote response: "+viewQuoteResponse);



	}

	public String getPolicyNumber() {
		/*click view policy link*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();
		String fileUploadURL = PCAPIUtils.getFileUploadURL();

		String viewPolicy = PCAPIUtils.readFormDataFile("common","24.ViewPolicy");

		viewPolicy = viewPolicy.replace("<CSRF_TOKEN>", csrfToken);
		viewPolicy = viewPolicy.replace("<FILE_UPLOAD_URL>", fileUploadURL);

		/*Get Policy Number*/
		Response response = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, viewPolicy);	
		Log.message("View Policy Response: "+response);
		String policyNumber = PCAPIUtils.getHTMLAttributeValue(response, "PolicyFile_Summary-PolicyOverviewDashboard-PolicyDetailsDetailViewTile-PolicyDetailsDetailViewTile_DV-PolicyNumber");

		/* Clear ThreadLocal values */
		PCAPIUtils.clearThreadLocalValues();

		return policyNumber;
	}


	@Override
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {

	}

	@Override
	public void reviewPolicy(PolicyReview policyreview) {

	}

	@Override
	public void policyRewriteRemainderTerm() {

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
	public void policyRewriteNewTerm() {

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
	public String addInsured(CreateNewAccount createNewAccount) {
		return null;

	}

	@Override
	public void completedPolicyTransactions() {

	}

	@Override
	public void cancelPolicy(CancellationSource cancellationSource) {

	}


	@Override
	public void runBatchProcessInfo() {

	}

	@Override
	public void runWorkQueueInfo() {

	}

	@Override
	public void approveUWissue(UWIssueType uwIssueType) {

	}

	@Override
	public void searchPolicyNumber(PolicyDetails policyDetails) {

	}

	@Override
	public void copySubmissions() {

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
	public void copySubmissionsandAddContingincy(RiskAnalysis riskAnalysis) {
		// TODO Auto-generated method stub

	}


}