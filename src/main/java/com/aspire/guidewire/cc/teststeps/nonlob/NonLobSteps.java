package com.aspire.guidewire.cc.teststeps.nonlob;

import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.MessageQueue;

public interface NonLobSteps {

	public static NonLobImpl create() {
		return new NonLobImpl();
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
	 * Enter "User name" in the User name Field 
	 * Enter "Password" in the Password Field 
	 * Click "Login" Button
	 * Login to ContactManager application with valid credentials
	 * @param username
	 * @param password
	 */
	public void loginIntoContactManagerApplication(String username, String password);	
	/**
	 * clicks on "Claim"
	 * clicks on "New claim"
	 */
	public void createClaim();
	
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
	public void saveAndAssignClaim();
	/**
	 * clicks on "Go to claim"
	 * returns SummaryPage
	 */
	public String viewClaim();
	
	/**
	 * Enter "FirstName" in First name Field
	 * Enter "LastName" in Last name Field
	 * Enter "Name" in  Name Field
	 * Enter "Address" in  Address Field
	 * Enter "TaxIdSSN" in TaxIdSSN Field
	 * Enter "TaxId" in TaxId Field
	 * select "State" from State drop down
	 * Enter "City" in City Field
	 * Enter "Roles" in Roles Field
	 * Clicked on "Add" Button
	 * select "Roles" from Roles drop down
	 * Clicked on "Update" Button
	 * @param contactDetails
	 */
	public void addContactInformation(ContactDetails contactDetails);
	
	/**
	 * clicks on "Action"
	 * move to "Other"
	 * select any Payment options - recovery,clone check, manual check, Transfer check
	 * @param createNote
	 */
	public void paymentChecks(PaymentOptions PaymentOptions);
	
	/**
	 * clicks on "Claim"
	 * Enter Claim Number
	 * clicks on "Search"
	 */
	public String searchClaim(SearchClaim searchClaim);
	
	/**
	 * click "Administration" 
	 * click "Monitoring" 
	 * click "Message Queue" 
	 * verify the status if it is "suspended" in status then click "suspended status check box" 
	 * and click "Resume" or
	 * click "Check all destination message queue check box" 
	 * click "Restart Messaging Engine" 
	 */
	public void resumeOrRestartMessageQueues(MessageQueue messageQueue);
	
	
}
