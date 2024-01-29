package com.aspire.guidewire.bc.teststeps;

import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.Delinquency;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.DirectBillPayment;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.Disbursment;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.MessageQueue;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.WriteOffReversal;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.PaymentRequest;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.PolicyNo;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.RunBatchProcess;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.SearchAccount;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.TroubleTicket;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.WriteOff;

public interface BillingCenterSteps {

	public static BillingCenterStepsImpl create() {
		return new BillingCenterStepsImpl();
	}
	public static APIBillingCenterStepsImpl createAPI() {
		return new APIBillingCenterStepsImpl();
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
	 * Used to run Batch Process Info  "Handle Unresolved Contingency" Batch
	 * Click on "Gotobatch Process" button
	 * Click on "Invoice" button
	 */
	public void runBatchProcessInfo(RunBatchProcess runBatchProcess);

	/**
	 * clicked on "Trouble Ticket"
	 * clicked on "New" button
	 * Select "Trouble Ticket Type" from TroubleTicketType
	 * enter "Details" in Trouble ticket subject
	 * enter "Priority" in Trouble ticket Priority
	 * clicked on "Next" Button
	 * clicked on "Finish" Button
	 */
	public void createTroubleTicket(TroubleTicket troubleTicket);
	
	/**
	 * Clicked on Action button
	 * Move to new Transaction
	 * clicked on "writeoff"
	 * clicked on "select"
	 * clicked on "next"
	 * select "charge pattern"
	 * enter "amount"
	 * enter "reason"
	 */
	public void writeOff(WriteOff writeOff);
	
	/**
	 * Clicked on Action button
	 * Move to "NewTransaction"
	 * clicked on "negative writeoff"
	 * clicked on "next"
	 * enter "Unapplied Fund"
	 * enter "Amount"
	 */
	public void writeOffReversal(WriteOffReversal negativeWriteOff);

	/**
     * Click "Account" in Headerpage
	 * Enter "Account Number" in the Account Number field
	 * click on Search
	 * Select the Account
	 * @param accountNumber
	 * @return Account Summary
	 */
	public void searchAccount(SearchAccount searchAccount);
	
	/**
     * Enters New Direct Bill Payment
	 * select "New Direct Bill Payment" from Actions
	 * Enter "Amount"
	 * Select "Unapplied Fund"
	 * Select "Payment Instrument"
	 * @param directbillpayment
	 * @return Account Summary
	 */
	public void enterNewDirectBillPayment(DirectBillPayment directbillpayment);
	

	/**
	 * Enters Disbursement
	 * select "Disbursement" from Actions
	 * Enter "Amount"
	 * Enter "Payment Date"
	 * Select "Reason"
	 * @param disbursment
	 * @return Account Summary
	 */
	public void enterDisbursment(Disbursment disbursment);
	
	/**
	 * Enters Payment Request
	 * select "Payment Request" from Actions
	 * Enter Amount
	 * Enter draft Date
	 * Select Payment Instrument
	 * @param paymentrequest
	 * @return Account Summary
	 */
	public void enterPaymentRequest(PaymentRequest paymentrequest);
	
	/**
	 * Start Delinquency
	 * Select "Start Delinquency" from Account Summary Page
	 * Select Reason
	 * Select Targeted Policy
	 * @param delinquency
	 * @return Account Summary
	 */
	public void startDelinquency(Delinquency delinquency);
	
	/**
	 * Search the Policy created from PC
	 * Click on Policy tab
	 * Enter "Policy No" in Policy No field
	 * Click on "Search" 
	 * Click on the Policy
	 * @param policyNo
	 */
	public void searchPolicy(PolicyNo policyNo);
	
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