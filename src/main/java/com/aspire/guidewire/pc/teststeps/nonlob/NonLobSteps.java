package com.aspire.guidewire.pc.teststeps.nonlob;

import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.MessageQueue;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.PolicyDetails;

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
	 * Click on "CreateNewAccount" Toggle
	 * Used click Account for a "Person"
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * Used to verify AccountNo Generated with Numeric values
	 * @param createNewAccount
	 */
	public void searchAccount(EnterAccountInformation createNewAccount);
	/**
	 * Click on "Action" Button
	 * Click on "NewSubmission" Button(After Account created)
	 * click "select" button based on Product Name
	 * @param productName
	 * returns account number which we created
	 * @return 
	 */
	public String createAccount(CreateNewAccount createNewAccount);	

	/**
	 * Verify the Error message
	 * @param expectedActualErrorMessage
	 */
	public void verifyErrorMessage(String expectedActualErrorMessage);

	/**
	 * Used to Search the Policy Number
	 * Click on the Policy Arrow button
	 * Enter the Policy number in the Policy Number textbox
	 * Click on "Search" Button
	 */
	public void searchPolicyNumber(PolicyDetails policyDetails);

	/**
	 * Used to Copy Submission 
	 * Click on "Actions"
	 * Click on "Copy Submission"
	 * Click on "Quote"
	 * Click on "Bind Options"
	 * Click on "Issue Policy"
	 */
	public void copySubmissions();

	/**
	 * click "View Policy" submission
	 */
	public void viewPolicy();
	
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
