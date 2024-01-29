package com.aspire.guidewire.cc.teststeps.workerscompensation;

import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimStatus;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseExposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Exposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ServiceDetails;

public interface WorkersCompensationSteps {
	public static WorkersCompensationStepsImpl create() {
		return new WorkersCompensationStepsImpl();
	}
	
	public static APIWorkersCompensationStepsImpl createAPI() {
		return new APIWorkersCompensationStepsImpl();
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
	 * Selects "location"
	 * 
	 * Selects Cause of injury source 
	 * Click Medical Attention radio button
	 * Click Time Work radio button 
	 * @param claimInfo
	 */
	
	public void addClaimInformation(ClaimInfo claimInfo);
	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
	 */
	
	public String saveAndAssignClaim();
	
	/**
	 * clicks on "Go to claim"
	 * returns SummaryPage
	 */
	
	
	public void viewClaim() ;
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
	
	public void createReserve(Exposure exposure);
	/**
	 * select "Exposure" 
	 * Verify Exposure is created or not
	 * @param exposure
	 */
	
	public void verifyExposure(Exposure exposure);
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
	 * Navigate to email page from action menu 
	 * Enter "Email Address" in  email address field
	 * Enter Body and subject in respective field
	 * Click send email button
	 */
	
	public void emailClaim(EmailDetails emailDetails);
	/**
	 * Click Document
	 *Verify Document is created or not
	 */
	
	
	public void verifyDocumentCreation();

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
     *Click on Actions
     *Click on Close Claim
     *Enter Note field
     *Select "Outcome" from Outcome drop down
     * Click on Close Button
     * @param closeClaim
    */
	
	public void closeClaim(CloseClaim closeClaim) ;
	
	/**
	 *Click on Medical Details
	 * Close the Medical Exposure 
	 *Click on Indemnity
	 * Close the Indemnity Exposure 
	 * @param closeExposure
	 */
	public void closeExistingExposure(CloseExposure closeExposure); 
	

	/**
	 * clicks on "LossDetails"
	 * clicks on "Edit"
	 * click on "Injury During Employment RadioButton"
	 * click on "Performing Regular Job RadioButton"
	 * click on "Safety Equipment Provided RadioButton"
	 * click on "Employer Questions Claim RadioButton"
	 * click on "Safety Equipment Used RadioButton"
	 * click on "Drugs Involved RadioButton"
	 * Select "Compensability" from compensability drop down
	 * Clicked "Update" Button
	 * @param lossDetails
	 */
	public void updateLossDetails(LossDetails loseDeatils);
	/**
	 *Click on WorkPlan
	 *Click on Complete button
	 */
	public void completeWorkplan();
	
	/**
	 *Click on Summary 
	 *Click on Status
	 * Verify the Claim status is "Close"
	 * @param claimStatus
	 */
	public void verifyClaimStatus(ClaimStatus claimStatus);
	
	/**
	 * click on claim menu and click on search
	 * enter claim number and search
	 * @param searchClaim
	 * @return insuredName
	 */
	public String searchClaim(SearchClaim searchClaim);
}
