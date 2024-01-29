package com.aspire.guidewire.pc.teststeps.commercialauto;

import com.aspire.guidewire.api.utils.PCAPIUtils;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CommercialAutoLine;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.SearchFor;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Vehicles;
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APICommercialAutoStepsImpl implements CommercialAutoSteps {

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

		String selectPolicy = PCAPIUtils.readFormDataFile("commercialAuto","7.SelectPolicy");
		selectPolicy = selectPolicy.replace("<CSRF_TOKEN>", csrfToken);
		selectPolicy = selectPolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response selectPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPolicy);	
		Log.message("Select Policy response: "+selectPolicyResponse);

	}

	@Override
	public void selectOfferings(Offerings offerings) {

		/* Select the Offerings */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateofferings = PCAPIUtils.readFormDataFile("commercialAuto","8.SelectOfferings");
		updateofferings = updateofferings.replace("<CSRF_TOKEN>", csrfToken);
		updateofferings = updateofferings.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response offeringsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateofferings);	
		Log.message("Offerings Page response: "+offeringsResponse);


	}

	@Override
	public void selectQualifications(Qualification qualification) {

		/* Select the Qualification */

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String selectQualification = PCAPIUtils.readFormDataFile("commercialAuto","9.SelectQualification");
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

		String updatePolicy = PCAPIUtils.readFormDataFile("commercialAuto","10.updatePolicyInfo");
		updatePolicy = updatePolicy.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicy = updatePolicy.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response policyInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicy);
		Log.message("Policy Info Page response: "+policyInfoResponse);


	}


	public void addCommercialAutoLineDetails(CommercialAutoLine commercialAutoLine) {

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String fromChooseProductDataFile;
		String fromAddCoverageDataFile;

		switch (commercialAutoLine.getProductType()) {
		case BUSINESSAUTO:
			fromChooseProductDataFile= "11.updateCommercialAutoLine";
			fromAddCoverageDataFile="26.clickAdditinalCoverageForBusinessAuto";
			break;
		case GARAGE_KEEPER:
			fromChooseProductDataFile = "11.a.updateCommercialAutoLineAsGarageKeepers";
			fromAddCoverageDataFile="26.a.clickAdditinalCoverageForGarageKeepers";

			break;
		case MOTOR_CARRIERANDTRUCKERS:
			fromChooseProductDataFile = "11.b.updateCommercialAutoLineAsMotorCarrier";
			fromAddCoverageDataFile="26.b.clickAdditinalCoverageForMotorCarrier";
			break;
		case BUSINESSAUTO_PHYSICALDAMAGE:
			fromChooseProductDataFile = "11.c.updateCommercialAutoLineAsBusinessAutoPhysicalDamage";
			fromAddCoverageDataFile="26.c.clickAdditinalCoverageForBusinessAutoPhysicalDamage";
			break;
		default:
			throw new IllegalArgumentException("Invalid product type: " );
		}

		String selectProductAndFleet = PCAPIUtils.readFormDataFile("commercialAuto",fromChooseProductDataFile);
		selectProductAndFleet = selectProductAndFleet.replace("<CSRF_TOKEN>", csrfToken);
		selectProductAndFleet = selectProductAndFleet.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response productAndFleetResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectProductAndFleet);
		Log.message("Product and Fleet response: "+productAndFleetResponse);

		String clickAdditinalCoverage = PCAPIUtils.readFormDataFile("commercialAuto",fromAddCoverageDataFile);
		clickAdditinalCoverage = clickAdditinalCoverage.replace("<CSRF_TOKEN>", csrfToken);
		clickAdditinalCoverage = clickAdditinalCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response additionalCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickAdditinalCoverage);	
		Log.message("Additional Coverage  response: "+additionalCoverageResponse);


		String clickAddCoverage = PCAPIUtils.readFormDataFile("commercialAuto","27.clickAddCoverage");
		clickAddCoverage = clickAddCoverage.replace("<CSRF_TOKEN>", csrfToken);
		clickAddCoverage = clickAddCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickAddCoverage);
		Log.message("Add Coverage response: "+addCoverageResponse);

		String clickSearch = PCAPIUtils.readFormDataFile("commercialAuto","28.clickSearch");
		clickSearch = clickSearch.replace("<CSRF_TOKEN>", csrfToken);
		clickSearch = clickSearch.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response searchResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickSearch);
		Log.message("Search response: "+searchResponse);

		String addSelectedCoverage = PCAPIUtils.readFormDataFile("commercialAuto","29.clickAddBodilyInjuryAndPropertyDamageCoverage");
		addSelectedCoverage = addSelectedCoverage.replace("<CSRF_TOKEN>", csrfToken);
		addSelectedCoverage = addSelectedCoverage.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addSelectedCoverageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addSelectedCoverage);
		Log.message("Selected Coverage response: "+addSelectedCoverageResponse);

		String updateCommercialAuto = PCAPIUtils.readFormDataFile("commercialAuto","30.UpdateCoverage");
		updateCommercialAuto = updateCommercialAuto.replace("<CSRF_TOKEN>", csrfToken);
		updateCommercialAuto = updateCommercialAuto.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response commericalAutoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateCommercialAuto);	
		Log.message("Commercial Auto response: "+commericalAutoResponse);

	}

	@Override
	public void addLocations() {

		/* Update the Locations*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateLocation = PCAPIUtils.readFormDataFile("commercialAuto","12.updateLocation");
		updateLocation = updateLocation.replace("<CSRF_TOKEN>", csrfToken);
		updateLocation = updateLocation.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addLocationsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateLocation);	
		Log.message("Add Location Page response: "+addLocationsResponse);
	}

	@Override
	public void addNewDriver(Drivers drivers) {

		/* Click Add Driver*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String addDriver = PCAPIUtils.readFormDataFile("commercialAuto","17.addDriver");
		addDriver = addDriver.replace("<CSRF_TOKEN>", csrfToken);
		addDriver = addDriver.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addNewDriverResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addDriver);
		Log.message("Add new driver response: "+addNewDriverResponse);

		/* Update Driver Details*/

		String driverDetails = PCAPIUtils.readFormDataFile("commercialAuto","18.updateDriverdetails");
		driverDetails = driverDetails.replace("<CSRF_TOKEN>", csrfToken);
		driverDetails = driverDetails.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		driverDetails = driverDetails.replace("<FIRST_NAME>", drivers.getFirstName());
		driverDetails = driverDetails.replace("<LAST_NAME>", drivers.getLastName());
		driverDetails = driverDetails.replace("<LICENSE_NUMBER>", drivers.getLicenseNumber());

		Response driverDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, driverDetails);
		Log.message("Driver Details response: "+driverDetailsResponse);

		/* Click Next in Driver Page*/

		String clickNext = PCAPIUtils.readFormDataFile("commercialAuto","21.clickNextAfterDriverDetails");
		clickNext = clickNext.replace("<CSRF_TOKEN>", csrfToken);
		clickNext = clickNext.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addNewDriverPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickNext);
		Log.message("Add New Driver Page response: "+addNewDriverPageResponse);

	}

	@Override
	public void addStateInfo() {

		/* Update State Info*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateStateInfo = PCAPIUtils.readFormDataFile("commercialAuto","16.updateStateInfo");
		updateStateInfo = updateStateInfo.replace("<CSRF_TOKEN>", csrfToken);
		updateStateInfo = updateStateInfo.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addStateInfoResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateStateInfo);
		Log.message("State Info Page response: "+addStateInfoResponse);
	}

	@Override
	public void addVehicle(Vehicles vehicleInfo) {

		/* Click Create Vehicles*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String createVehicle = PCAPIUtils.readFormDataFile("commercialAuto","13.createVehicle");
		createVehicle = createVehicle.replace("<CSRF_TOKEN>", csrfToken);
		createVehicle = createVehicle.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response VehicleInformationresponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, createVehicle);
		Log.message("Vehicle Information response: "+VehicleInformationresponse);

		PCAPIUtils.setGaragedLocation(VehicleInformationresponse);

		String location = PCAPIUtils.getLocation();

		/* Enter Vehicle Information*/

		String vehicleInformation = PCAPIUtils.readFormDataFile("commercialAuto","14.updateVehicleInformation");
		vehicleInformation = vehicleInformation.replace("<CSRF_TOKEN>", csrfToken);
		vehicleInformation = vehicleInformation.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());
		vehicleInformation = vehicleInformation.replace("<LOCATION>",  location);

		Response enterVehileDetailsResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, vehicleInformation);
		Log.message("Vehicle Details response: "+enterVehileDetailsResponse);

		/* Update Vehicle Information*/

		String updateVehicle = PCAPIUtils.readFormDataFile("commercialAuto","15.UpdateVehicle");
		updateVehicle = updateVehicle.replace("<CSRF_TOKEN>", csrfToken);
		updateVehicle = updateVehicle.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response addVehiclePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateVehicle);
		Log.message("Add Vehicle Page response: "+addVehiclePageResponse);

	}

	public void handleLiabilityRequiredWarningAlert(CommercialAutoLine commercialAutoLine) {

		/*click Commercial Auto line*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String clickCommercialAutoLine = PCAPIUtils.readFormDataFile("commercialAuto","22.clickCommercialAutoLine");

		clickCommercialAutoLine = clickCommercialAutoLine.replace("<CSRF_TOKEN>", csrfToken);
		clickCommercialAutoLine = clickCommercialAutoLine.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response commercialAutoLineResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickCommercialAutoLine);
		Log.message("Commercial Auto Line response: "+commercialAutoLineResponse);


		/*click state Info screen to continue with policy creation flow after handling alert message*/
		String fromClickClearDataFile;
		String fromClickStateInfoScreenDataFile;

		switch (commercialAutoLine.getProductType()) {
		case BUSINESSAUTO:
			fromClickClearDataFile= "25.a.clickClear";
			fromClickStateInfoScreenDataFile="26.a.clickStateInfo";
			break;
		case GARAGE_KEEPER:
			fromClickClearDataFile = "25.b.clickClear";
			fromClickStateInfoScreenDataFile="26.b.clickStateInfo";
			break;
		case MOTOR_CARRIERANDTRUCKERS:
			fromClickClearDataFile = "25.c.clickClear";
			fromClickStateInfoScreenDataFile="26.c.clickStateInfo";
			break;
		case BUSINESSAUTO_PHYSICALDAMAGE:
			fromClickClearDataFile = "25.d.clickClear";
			fromClickStateInfoScreenDataFile="26.d.clickStateInfo";
			break;
		default:
			throw new IllegalArgumentException("Invalid product type: " );
		}

		/* Click Quote*/

		String clickClearOnwarningAlert = PCAPIUtils.readFormDataFile("commercialAuto",fromClickClearDataFile);

		clickClearOnwarningAlert = clickClearOnwarningAlert.replace("<CSRF_TOKEN>", csrfToken);
		clickClearOnwarningAlert = clickClearOnwarningAlert.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response clearOnwarningAlertResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickClearOnwarningAlert);
		Log.message("Clear on warning ALert response: "+clearOnwarningAlertResponse);

		String clickStateInfoScreen = PCAPIUtils.readFormDataFile("commercialAuto",fromClickStateInfoScreenDataFile);

		clickStateInfoScreen = clickStateInfoScreen.replace("<CSRF_TOKEN>", csrfToken);
		clickStateInfoScreen = clickStateInfoScreen.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response stateInfoScreenPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickStateInfoScreen);
		Log.message("State Info Screen Page response: "+stateInfoScreenPageResponse);


	}


	@Override
	public void addCoveredVehicles() {

		/* Update Covered Vehicle*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateCoveredVehicles = PCAPIUtils.readFormDataFile("commercialAuto","19.coveredVehicles");
		updateCoveredVehicles = updateCoveredVehicles.replace("<CSRF_TOKEN>", csrfToken);
		updateCoveredVehicles = updateCoveredVehicles.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response coveredVehiclesPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateCoveredVehicles);
		Log.message("Covered Vehicles Page response: "+coveredVehiclesPageResponse);
	}

	@Override
	public void addModifiersDetails() {

		/* Update Modifiers*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateModifiers = PCAPIUtils.readFormDataFile("commercialAuto","20.updateModifiers");
		updateModifiers = updateModifiers.replace("<CSRF_TOKEN>", csrfToken);
		updateModifiers = updateModifiers.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response modifiersPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateModifiers);
		Log.message("Modifiers Page response: "+modifiersPageResponse);
	}


	@Override
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis) {

		/*Select Risk Analysis details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updateRiskAnalysis = PCAPIUtils.readFormDataFile("common","19.UpdateRiskAnalysis");

		updateRiskAnalysis = updateRiskAnalysis.replace("<CSRF_TOKEN>", csrfToken);
		updateRiskAnalysis = updateRiskAnalysis.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response riskanalysisPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updateRiskAnalysis);
		Log.message("RiskAnalysis Page response: "+riskanalysisPageResponse);

	}

	@Override
	public void reviewPolicy(PolicyReview policyreview) {

		/*Select Review Policy details*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String updatePolicyReview = PCAPIUtils.readFormDataFile("common","20.UpdatePolicyReview");

		updatePolicyReview = updatePolicyReview.replace("<CSRF_TOKEN>", csrfToken);
		updatePolicyReview = updatePolicyReview.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response reviewPolicyResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updatePolicyReview);
		Log.message("Review Policy response: "+reviewPolicyResponse);

	}

	@Override
	public void viewQuote() {

		/*click Commercial Auto line*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		/* Click Next in Quote Page*/

		String updtaeQuote = PCAPIUtils.readFormDataFile("commercialAuto","25.updateQuote");

		updtaeQuote = updtaeQuote.replace("<CSRF_TOKEN>", csrfToken);
		updtaeQuote = updtaeQuote.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response quotePageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, updtaeQuote);
		Log.message("Quote Page response: "+quotePageResponse);
	}


	@Override
	public void viewForms() {

		/*View Forms*/

		String csrfToken = PCAPIUtils.getCSRFToken();
		String cookieSessionID = PCAPIUtils.getCookieSessionID();

		String viewForms = PCAPIUtils.readFormDataFile("common","22.ViewForms");

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

		String selectPayment = PCAPIUtils.readFormDataFile("common","23.UpdatePaymentDetails");

		selectPayment = selectPayment.replace("<CSRF_TOKEN>", csrfToken);
		selectPayment = selectPayment.replace("<FILE_UPLOAD_URL>", PCAPIUtils.getFileUploadURL());

		Response paymentPageResponse = PCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectPayment);
		Log.message("Payment Page response: "+paymentPageResponse);

	}	

	@Override
	public void issuepolicy(Transactions transactions) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewPolicy() {
		// TODO Auto-generated method stub
	}

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
		System.out.println(policyNumber);

		/* Clear ThreadLocal values */
		PCAPIUtils.clearThreadLocalValues();

		return policyNumber;
	}

	@Override
	public void cancelPolicy(CancellationSource cancellationSource) {

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
	public void verifyOutOfSequenceMessage(PolicyChange policyChange) {

	}

	@Override
	public void copySubmission() {

	}

	@Override
	public void addInsured(CreateNewAccount createNewAccount) {

	}

	@Override
	public void completedPolicyTransactions() {

	}

	@Override
	public void documentCreation(){

	}

	@Override
	public void logOutTheApplication() {

	}

	@Override
	public void searchSubmission(SearchFor searchFor) {

	}

	@Override
	public void approveUWissue(UWIssueType uwIssueType) {

	}


	@Override
	public void runBatchProcessInfo() {

	}

	@Override
	public void searchPolicyNumber(PolicyDetails policyDetails) {

	}

	@Override
	public void runWorkQueueInfo() {

	}

	@Override
	public void copySubmissions() {

	}
}