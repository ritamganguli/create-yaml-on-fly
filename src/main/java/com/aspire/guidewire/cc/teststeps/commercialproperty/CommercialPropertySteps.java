package com.aspire.guidewire.cc.teststeps.commercialproperty;

import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.AssignClaim;

public interface CommercialPropertySteps {

	public static CommercialPropertyStepsImpl create() {
		return new CommercialPropertyStepsImpl();
	}
	
	public static APICommercialPropertyStepsImpl createAPI() {
		return new APICommercialPropertyStepsImpl();
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
	 * Click Property Selected Check Box
	 * Click Next Button
	 */
	public void updateInvolvedPolicyProperties();
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
	public void addCoveragesByType(ChooseCoveragesByType chooseCovearges);
	
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
	 * clicks on "Action"
	 * move to "Other"
	 * select any Payment options(RECOVERY,MANUAL_CHECK,MET_CHECK,TRANSFER_CHECK,CLONE_CHECK)
	 * @param paymentOptions
	 */
	public void paymentChecks(PaymentOptions paymentOptions);
	/**
	 * clicks on "Actions"
	 * clicks on  Assign
	 * choose radio button "select form list","Search by location","Search by Distance from location"
	 * selects country if needed
	 * @param assignClaim
	 */
	public void assignClaim(AssignClaim assignClaim);
	/**
	 * clicks on "Create Reserve"
	 * select "Exposure" from exposure dropdown
	 * select "ReserveCostType" from ReserveCostType dropdown
	 * select "ReserveCostCategory" from ReserveCostCategory dropdown
	 * Enter "Amount" in Amount field
	 * Clicked on "save"
	 * @param reserve
	 */
	public void createreserve(Reserve reserve);
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
	public void closeExposure(ExposureDetails exposureDetails);
	/**
	 * Click "Document" Section
	 * Verify "Email Address" in  email address field
	 */
	public void verifyDocumentCreation() ;
	
	/**
	 * Navigate to email page from action menu 
	 * Enter "Email Address" in  email address field
	 * Enter Body and subject in respective field
	 * Click send email button
	 */
	public void emailClaim(EmailDetails emailDetails);
	

	/**
	 * Click Claim toggle menu
	 * Enter "claimnumber" in search 
	 * Click search button
	 * Get insured name
	 */	public String searchClaim(SearchClaim searchClaim);


}
