package com.aspire.guidewire.cc.teststeps.commercialauto;

import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.TowingAgency;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ServiceDetails;

public interface CommercialAutoSteps {

	public static CommercialAutoStepsImpl create() {
		return new CommercialAutoStepsImpl();
	}
	public static APICommercialAutoStepsImpl createAPI() {
		return new APICommercialAutoStepsImpl();
	}

	/**
	 * Enter "User name" in the User name Field 
	 * Enter "Password" in the Password Field 
	 * Click "Login" Button
	 * Login to application with valid credentials
	 * @param username
	 * @param password
	 */
	public void loginIntoTheApplication(String username, String password);	
	
	/**
	 * clicks on "Claim"
	 * clicks on "New claim"
	 */
	public void createClaim();
	
	/**
	 * Enters "policy number"
	 * clicks on "search"
	 * Enters "LossDate"
	 * clicks on next
	 * @param searchPolicy
	 * @return insured name
	 */
	public String searchPolicy(Searchpolicy searchPolicy);
	
	/**
	 * Selects "insured name"
	 * Selects "Relation to insured"
	 * clicks on next
	 * @param basicInfo
	 */
	public void enterBasicInformation(BasicInfo basicInfo);
	
	/**
	 * Selects "loss cause"
	 * Enters city 
	 * Selects State 
	 * Adds property damage
	 * @param claimInfo
	 */
	public void addClaimInformation(ClaimInfo claimInfo);
	
	/**
	 * clicks on the "TowingToggleSubMenu" and "NewAutoTowingAgency"
	 * enter the name, taxid
	 * Clicks on "update" and "uplicateContactCancel"
	 * click update
	 * click next
	 *  @param towingAgency
	 */
	public void addServices(TowingAgency towingAgency);
	
	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
	 */
	public String saveAndAssignClaim();
	
	/**
	 * clicks on "Go to claim"
	 * returns SummaryPage
	 */
	public void viewClaim();
	
	/**
	 * clicks on "Action"
	 * clicks on choose by coverage Type
	 * clicks coverage type "C, D, E, P, T, U, H"
	 * clicks on coverage
	 * Create Exposure for Vehicle incident or Injury incident
	 * @param ChooseCoveragesByType
	 */
	public void addCoveragesByType(ChooseCoveragesByType ChooseCovearges);
	
	/**
	 * select the claimant and type
	 * clicks on Incident menuIcon and click new Incident
	 * select the "selected vehicle" and "Driver name"
	 * Enter Vin,year,Make
	 * Select the loss occured
	 * Click Update
	 * @param Covearge
	 */
	public void createExposureVehicleIncident(Coverage Coverage);
	
	/**
	 * select the claimant and type
	 * clicks on Incident menuIcon and click new Incident
	 * select the "Injured person" and "Loss party"
	 * Click Update
	 * @param covearge
	 */
	public void createExposureInjuryIncident(Coverage Coverage);
	
	/**
	 * clicks on "Action"
	 * clicks on "Note"
	 * Enters text
	 * Clicks on update
	 * @param createNote
	 */
	public void createNote(CreateNote createNote);
	
	
	/**
	 * Select the  Involved Policy Vehicles
	 * Click "Next" Button
	 * returns BasicInformationPage
	 */
	public void SelectInvolvedPolicyVehicle() ;
	
	/**
	 * clicks on "Create Reserve"
	 * select "Exposure" from exposure dropdown
	 * select "ReserveCostType" from ReserveCostType dropdown
	 * select "ReserveCostCategory" from ReserveCostCategory dropdown
	 * Enter "Amount" in Amount field
	 * Clicked on "save"
	 * @param reserve
	 */
	public void createReserve(Reserve reserve);
	
	/**
	 * clicks on "Action"
	 * move to "Other"
	 * select Payment options
	 * Select Payment Type
	 * Enter Amount
	 * click Check Box of Workplan
	 * click Complete button
	 * click FinancialsnChecks
	 * Click Amount and Click On Transfer
	 * @param paymentOptions
	 */
	public void paymentChecks(PaymentOptions PaymentOptions);
	
	/**
	 * clicks on "Actions"
	 * clicks on Parties group
	 * clicks on Contacts
	 * clicks on "New Contact"
	 * clicks on any contacts
	 * Enters name, Firstname, Lastname, TaxId, Address,City, State
	 * Clicks on Update
	 * @param contact
	 */
	public void createContact(Contact contact);
	
	/**
	 * clicks on "Action"
	 * clicks on "Service"
	 * Select "RequestType" from RequestType drop down
	 * Select "ServiceAddress" from ServiceAddress drop down
	 * Clicked "Add" Button
	 * Clicked on "service" 
	 * Clicked on "Ok" Button
	 * Enter contact information details
	 * Clicked on "Submit"
	 * @param serviceDetails
	 */
	public void addClaimService(ServiceDetails serviceDetails);
	
	/**
	 * Navigate to Document Page page from action menu by clicking New Document button
	 * select respective button to Create from template claim ,upload Document and indicate Existence of a DocumentClaim
	 * To create a document and verify it in document page
	 */
	
	public void newDocumentClaim(ChooseDocumentsByType chooseDocumentsByType);
	
	/**
	 * clicks on "Actions"
	 * clicks on  Assign
	 * choose radio button "select form list","Search by location","Search by Distance from location"
	 * selects country if needed
	 * @param assignClaim
	 */
	public void assignClaim(AssignClaim assignClaim);
	
	/**
	 * click on claim menu and click on search
	 * enter claim number and search
	 * @param searchClaim
	 * @return insuredName
	 */
	
	public String searchClaim(SearchClaim searchClaim); 
	
}
