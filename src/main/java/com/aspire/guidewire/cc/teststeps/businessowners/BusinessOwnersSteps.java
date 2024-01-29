package com.aspire.guidewire.cc.teststeps.businessowners;

import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.SearchClaim;

public interface BusinessOwnersSteps {

	public static BusinessOwnersStepsImpl create() {
		return new BusinessOwnersStepsImpl();
	}
	
	public static APIBusinessOwnersStepsImpl createAPI() {
		return new APIBusinessOwnersStepsImpl();
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
	 * clicks coverage type "M,L"
	 * clicks on coverage
	 * Create Exposure for Liability or MoneyAndSecurities
	 * @param ChooseCoveragesByType
	 */
	public void addCoveragesByType(ChooseCoveragesByType chooseCovearges);
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
	 * select any Payment optionsn(RECOVERY,MANUAL_CHECK,MET_CHECK,TRANSFER_CHECK,CLONE_CHECK)
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
	public void createReserve(Reserve reserve);
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
	public void addNewDocumentClaim(ChooseDocumentsByType chooseDocumentsByType);
	/**
	 * Navigate to Documents Page
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */
	public void reOpenClaim(ReOpenClaim reOpenClaim);
	/**
	 * Navigate to Work plan page clear all the data
	 * Navigate to Exposure Page enter "Note" in note field and select outcome reason
	 * Click close exposure
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */
	public void updateExposure(ExposureDetails exposureDetails); 
	
	/**
	* Used to Add the Coverages Using "Add Coverage"
	* Click on "Action" 
	* Move to "ChooseByCoverage" 
	* Move to "Policy Level Coverage"
	* Click "Special Coverage"
	* Select "Claimant" and "Claimant Type"
	* Click on "Update"
	*/
	public void addCoverages(ChooseCoverages chooseCoverages);

	/**
	 * Click Claim toggle menu
	 * Enter "claimnumber" in search 
	 * Click search button
	 * Get insured name
	 */
	String searchClaim(SearchClaim searchClaim);
	
}
