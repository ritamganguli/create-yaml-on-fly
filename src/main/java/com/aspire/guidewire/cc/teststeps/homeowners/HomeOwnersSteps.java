package com.aspire.guidewire.cc.teststeps.homeowners;

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
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.SearchClaim;

public interface HomeOwnersSteps {

	public static HomeOwnersStepsImpl create() {
		return new HomeOwnersStepsImpl();
	}
	
	public static APIHomeOwnersStepsImpl createAPI() {
		return new APIHomeOwnersStepsImpl();
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
	 * Clicks on next
	 * returns SaveAndAssignClaimPage
	 */
	public void addServices();
	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
	 * @return 
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
	 * clicks coverage type "C, D, E, P, T, U, R"
	 * clicks on coverage
	 * Create Exposure for Vehicle incident or Injury incident
	 * @param ChooseCoveragesByType
	 */
	public void addCoveragesByType(ChooseCoveragesByType ChooseCoveragesByType);
	/**
	 * clicks on "Action"
	 * clicks on choose by coverage
	 * clicks on Policy level Coverage
	 * clicks on coverage
	 * Create Exposure for Vehicle incident or Injury incident
	 * @param ChooseCovearges
	 */
	public void addCoverages(ChooseCoverages chooseCoverages);
	/**
	 * clicks on "Action"
	 * clicks on "Note"
	 * Enters text
	 * Clicks on update
	 * @param createNote
	 */
	public void createNote(CreateNote createNote);
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
	 * clicks on "Actions"
	 * clicks on  Assign
	 * choose radio button "select form list","Search by location","Search by Distance from location"
	 * selects country if needed
	 * @param assignClaim
	 */
	public void assignClaim(AssignClaim assignClaim);
	
	/**
	 * click "Loss Details"
	 * click Edit button
	 * select fault rating
	 * clicks "update" button
	 */
	public void updateLossDetails(LossDetails lossDetails);
	
	/**
	 * clicks on "Action"
	 * clicks on "Service"
	 * select "RequestType" from RequestType dropdown
	 * select "ServiceAddress" from ServiceAddress dropdown
	 * Clicked "Add" Button
	 * Clicked on "service" 
	 * Click on ok button
	 * Enter contact Information details
	 * Clicked on "Submit"
	 * @param serviceDetails
	 */
	public void addClaimService(ServiceDetails serviceDetails);

	/**
	 * Navigate to email page from action menu 
	 * Enter "Email Address" in  email address field
	 * Enter Body and subject in respective field
	 * Click send email button
	 */
	public void emailClaim(EmailDetails emailDetails);
	
	/**
	 * Navigate to Document Page page from action menu by clicking New Document button
	 * select respective button to Create from template claim ,upload Document and indicate Existence of a DocumentClaim
	 * To create a document and verify it in document page
	 */
	
	public void createDocument(ChooseDocumentsByType chooseDocumentsByType);
	
	/**
	 * Navigate to Work plan page clear all the data
	 * Navigate to Exposure Page enter "Note" in note field and select outcome reason
	 * Click close exposure
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */
	
	public void updateExposureStatus(ExposureDetails exposureDetails);
	
	/**
	 * clicks on "Action"
	 * move to "Other"
	 * select any Payment options - recovery,clone check, manual check, Transfer check
	 * @param createNote
	 */
	public void paymentChecks(PaymentOptions PaymentOptions);
	
	/**
	 * Navigate to Documents Page
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */

	public void verifyDocumentCreation();
	
	/**
	 * Navigate to Action Page click "Close Claim" button
	 * Enter "note" select "outcome" verify Closed status in Status Page
	 * Navigate to Action Page click "Open Claim" button
   � * Enter "note" select "Reason" verify Open status in Status Page
   � * Verify open status in exposure page
	 */

	public void reOpenClaim(ReOpenClaim reOpenClaim);
	
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
	 * click "subrogation"
	 * clicks edit button
	 * select status - open , closed
	 * select outcome
	 * clicks update button
	 */
	public void addSubrogation(SubrogationDetails subrogationDetails);
	
	/**
	 * Used to verify the "No Data to Display" message in Exposure Page
	 * @param exposureDataUnavailability
	 */
	public void verifyExposureDataUnavailability(ExposureDataUnavailability exposureDataUnavailability);
	
	/**
	 * Used to verify the "No Data to Display" message in Work Plan Page
	 * Click on the open "Work Plan" Check box
	 * Click on "Complete" button
	 * Verify "No Data to Display" Message
	 * @param workPlanDataUnavailability
	 */
	public void verifyWorkPlanDataUnavailability(WorkPlanDataUnavailability workPlanDataUnavailability);
	
	/**
	 * Used to close the Claim
	 * Click on "Actions" Button
	 * Click on "Close Claim" Button
	 * Enter "Close Claim Notes" 
	 * Select "Outcome"
	 * Click on "Close Claim"
	 * Click on "Summary"
	 * Click on "Status"
	 * Verify Status as "Closed"
	 * @param closeClaim
	 */
	public void closeClaim(CloseClaim closeClaim);

	
	/**
	 * click summary 
	 * verify note is created
	 * @param createNote
	 */
	public void verifyNoteCreation(CreateNote createNote);
	
	/**
	 * Clicks on "Claims Toggle menu"
	 * Enter Claim Number and click on search
	 * @return insured name
	 */
	public String searchClaim(SearchClaim searchClaim);
	
}
