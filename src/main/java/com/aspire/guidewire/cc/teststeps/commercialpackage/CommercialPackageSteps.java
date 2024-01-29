package com.aspire.guidewire.cc.teststeps.commercialpackage;

import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ServiceDetails;

public interface CommercialPackageSteps {

	public static CommercialPackageStepsImpl create() {
		return new CommercialPackageStepsImpl();
	}
	public static APICommercialPackageStepsImpl createAPI() {
		return new APICommercialPackageStepsImpl();
	}
	
	/**
	 * Used to login to the CC Application
	 * Enter "User name" in the User name Field 
	 * Enter "Password" in the Password Field 
	 * Click "Login" Button
	 * Login to application with valid credentials
	 * @param username
	 * @param password
	 */
	public void loginIntoTheApplication(String username, String password);	
	
	/**
	 * Used to initiate a New Claim
	 * Click on toggle "ClaimSubMenu"
	 * Click on "New Claim"
	 */
	public void createClaim();
	
	/**
	 * Used to Search Policy
	 * Enter "Policy No"
	 * Enter "Loss Date" as current date
	 * Enter "Insured Name"
	 * Click on "next" button to navigate to next page
	 * @param searchPolicy
	 * @return BasicInformationPage
	 */
	public String searchPolicy(Searchpolicy searchPolicy);
	
	/**
	 * Used to enter the Basic Informations
	 * Select "Insured Name"
	 * Select "Relation to Insured"
	 * Click on "next" button to navigate to next page
	 * @param basicInfo
	 */
	public void enterBasicInformation(BasicInfo basicInfo);
	
	/**
	 * Used to add Claim Information 
	 * Select "Loss Cause"
	 * Enter "City"
	 * Select "State"
	 * Click on "next" button to navigate to next page
	 * @param claimInfo
	 */
	public void addClaimInformation(ClaimInfo claimInfo);
	
	/**
	 * Used to save and assign the Claim
	 * Click on "Finish" button to complete the claim creation
	 * Click on "next" button to navigate to next page
	 */
	public String saveAndAssignClaim();
	
	/**
	 * Used to View Created Claim
	 * Click "GoToClaim" link too view Claim
	 */
	public void viewClaim();
	
	/**
	 * Used to add Coverage By Types
	 * Move to "Coverage By Type"
	 * Click on particular "Coverage"
	 * @param ChooseCovearges
	 */
	public void addCoveragesByType(ChooseCoveragesByType ChooseCovearges);
	
	/**
	 * Used to add Coverages
	 * Move to "Coverage"
	 * Click on Particular "Coverage"
	 * @param ChooseCovearges
	 */
	public void addCoverages(ChooseCoverages ChooseCovearges);
	
	/**
	 * Used to Add new Exposure
	 * Select "Claimant"
	 * Select "Claimant Type"
	 * Click on "Update" 
	 * @param Coverage
	 */
	public void createNewExposure(Coverage Coverage);
	
	/**
	 * Used to create a Notes
	 * Click on "Action"
	 * Click on "Notes"
	 * Enter "text"
	 * Click on "Update"
	 * @param createNote
	 */
	public void createNote(CreateNote createNote);
	
	/**
	 * Used to Add Payments Checks Ootions
	 * Click on "Action"
	 * Mouse over on "Other"
	 * Click on "Payment option"
	 * Select "Payer","Reserve Line","Cost Type","Recovery category" and "Cost category"
	 * Enter "Amount"
	 * Click on "Update"
	 * @param PaymentOptions
	 */
	public void paymentChecks(PaymentOptions PaymentOptions);
	
	/**
	 * Used to add Claim Services
	 * Click on "Action"
	 * Click on "Services"
	 * Select "Request Type" and "Service Address"
	 * Click on "Add" button
	 * Click on "Services check box"
	 * Click on "OK" button
	 * Click on "Submit".
	 * @param serviceDetails
	 */
	public void addClaimService(ServiceDetails serviceDetails);
	
	/**
	 * Used to Create Reserve
	 * Click on the "Exposure check box"
	 * Click on the "Create Reserve" Button
	 * Select "Reserve Cost"
	 * Select "Reserve Category"
	 * Enter "Reserve Amount"
	 * Click on "Save"
	 * Verify Created Reserve.
	 * @param reserve
	 */
	public void createReserve(Reserve reserve);
	
	/**
	 * Used to Add Documents in Claim
	 * Navigate to Document Page page from action menu by clicking New Document button
	 * select respective button to Create from template claim 
	 * upload Document and indicate Existence of a DocumentClaim
	 * To create a document and verify it in document page
	 */
	public void newDocumentClaim(ChooseDocumentsByType chooseDocumentsByType);
	
	/**
	 * Used to assign the Claim
	 * Click on "Actions" 
	 * Select "Assign Type"
	 * Click on "Assign" button
	 * @param assignClaim
	 */
	public void assignClaim(AssignClaim assignClaim);
	
	/**
	 * Used to verify the "No Data to Display" message in Work Plan Page
	 * Click on the open "Work Plan" Check box
	 * Click on "Complete" button
	 * Verify "No Data to Display" Message
	 * @param workPlanDataUnavailability
	 */
	public void closeClaim(CloseClaim closeClaim);
	
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
	 * Click on "Actions" Button
	 * Click on "Reopen Claim" Button
	 * Enter "Notes"
	 * Enter "Reopen Reason"
	 * Click on "Reopen Claim"
	 * @param closeClaim
	 */
	public void reOpenClaim(ReOpenClaim reOpenClaim);
	
	/**
	 * click on claim menu and click on search
	 * enter claim number and search
	 * @param searchClaim
	 * @return insuredName
	 */
	public String searchClaim(SearchClaim searchClaim);
	
}
