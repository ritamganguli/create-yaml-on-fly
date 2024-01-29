package com.aspire.guidewire.cc.teststeps.generalliability;

import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoveragesByType;

public interface GeneralLiabilitySteps {

	public static GeneralLiabilityStepsImpl create() {
		return new GeneralLiabilityStepsImpl();
	}
	
	public static APIGeneralLiabilityStepsImpl createAPI() {
		return new APIGeneralLiabilityStepsImpl();
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
	 * clicks on "Action"
	 * move to "Other"
	 * select any Payment options - recovery,clone check, manual check, Transfer check
	 * @param createNote
	 */
	public void paymentChecks(PaymentOptions PaymentOptions);


	/**
	 * clicks on "Action"
	 * clicks on "Note"
	 * Enters text
	 * Clicks on update
	 * @param createNote
	 */
	public void createNote(CreateNote createNote);
	
	/**
	 * Navigate to Document Page page from action menu by clicking New Document button
	 * select respective button to Create from template claim ,upload Document and indicate Existence of a DocumentClaim
	 * To create a document and verify it in document page
	 */
	
	public void createDocument(ChooseDocumentsByType chooseDocumentsByType);
	
	/**
	 * Navigate to Documents Page
	 * Navigate to reopen Page enter "Note" in note field and select reason
	 * Click close exposure
	 * Verify close and open status in exposure page
	 */

	public void verifyDocumentCreation();
	
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





