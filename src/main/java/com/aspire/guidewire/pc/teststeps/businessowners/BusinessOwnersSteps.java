package com.aspire.guidewire.pc.teststeps.businessowners;

import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddBuildingDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UpdateBusinessOwnersLine;


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
	 * Click on "Action" Button
	 * Click on "NewAccount" Button
	 * firstName - first name to be entered
	 * lastName - last name to be entered
	 * Click on the "Search" button for the Account Search
	 * Click on the create new account button 
	 * @param enterAccountInformation
	 */
	public String searchAccount(EnterAccountInformation enterAccountInformation);

	/**
	 * Click on "CreateNewAccount" Toggle
	 * Used click Account for a "Person"
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * Used to verify AccountNo Generated with Numeric values
	 * @param createNewAccount
	 */
	public String createAccount(CreateNewAccount createNewAccount);
	
	/**
	 * Click on "Action" Button
	 * Click on "NewSubmission" Button(After Account created)
	 * click "select" button based on Product Name
	 * @param productName
	 * returns account number which we created
	 */
	public void selectProduct(ProductNames productName);
	
	/**
	 * Used to select Offering Selection field option
	 * click "next" button to navigate to next page
	 * @return QualificationsPage
	 */
	public void selectOfferings(Offerings offerings);
	
	/**
	 * click "next" button to navigate to next page
	 * @return PolicyInfoPage
	 */
	public void selectQualifications(Qualification qualification);
	
	/**
	 * Enters the date in "QuoteDate" Field
	 * Select Term type from "TermType" Drop down
	 * click "Next" button to navigate to next page
	 * @return DriversPage
	 */
	public void updatePolicyInfo(PolicyInfo policyInfo);
	
	/**
	 * Select the "Small Business Type" drop donw Field
	 * click "Next" button to navigate to next page 
	 * @param updateBusinessOwnersLineIC
	 * @return LocationsPage
	 */
	public void updateBusinessOwnersLine(UpdateBusinessOwnersLine updateBusinessOwnersLineIC);
	
	/**
	 * Click "Next" button to navigate to next page
	 * @param addLocationDetails
	 * @return Buildings Page
	 */
	public void addLocationDetails(AddLocationDetails addLocationDetails);
	
	/**
	 * Used to add Building Details
	 * Enter "Basic Amount", "Property Amount" and "limit"
	 * Click "Next" button to navigate to next page
	 * @param addBuildingDetails
	 */
	public void addBuildingDetails(AddBuildingDetails addBuildingDetails);
	
	/**
	 * Used to Add Modifier Details
	 * Click "Next" button to navigate to next page
	 */
	public void addModifiersDetails();

	/**
	 * Used to Handles Uw issues, contigency, Resolve waive
	 * click "Next" button to navigate to next page
	 * else Process "UW_ISSUE"
	 * Process  "UW_ISSUE_APPROVE_REQUEST"
	 * Process "CONTINGENCY"
	 * Process "PRIORLOSSES_ATTACH_DOCUMENT"
	 * Process "PRIORLOSSES_MANUAL_ENTER"
	 * Process "RESOLVE_CONTINGENCY"
	 * Process "WAIVE_CONTINGENCY"
	 * Process "ATTACH_DOCUMENT_CONTINGENCY"
	 * @return RiskAnalysisPage
	 */
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis);

	/**
	 * click "Next" button to navigate to next page
	 * @return PolicyReviewPage
	 */
	public void reviewPolicy(PolicyReview policyreview);
	
	/**
	 * click "Next" button to navigate to next page
	 * @return QuotePage
	 */
	public void viewForms();
	
	/**
	 * click "Next" button to navigate to next page
	 * @return FormsPage
	 */
	public void selectPayments(Payments payments);
	
	/**
	 * click "Next" button to navigate to next page
	 * Select BillingMethod from BillingMethod dropdown
	 * Select PaymentSchedule from PaymentSchedule dropdown
	 * Select cash from Upfront payment
	 * @return PaymentsPage
	 */
	public void issuepolicy(Transactions transaction);
	
	/**
	 * click "View Policy" submission
	 * @return PolicySummary Page
	 */
	public void viewPolicy();
	
	/**
	 * click "cancel policy" from Policy summary page
	 * Used to start Cancellation Process
	 * Used to select "Source" and "Reason" Fields
	 * Used to click on "Start Cancellation" button
	 * Used to Click on "Bind" option then click on "Cancel Now" button
	 * Verify that the submission has been Cancelled 
	 * Used to click on "ViewPolicy"
	 */
	public void cancelPolicy(CancellationSource cancellationSource);
	
	/**
	 * Click "Action" Button
	 * Click on "RewriteRemainderofTerm" Button
	 * @return 
	 */
	public void policyRewriteRemainderTerm();

	/**
	 * Click "Action" Button
	 * Click on "ChangePolicy" Button
	 * click "Next" button to navigate to next page
	 * @param EffectiveDate
	 * @returns OfferingsPage
	 */
	public void policyChange(PolicyChange policyChange);

	/**
	 * Click on "RewriteFullTerm" Button 
	 * @returns PolicyBoundPage
	 */
	public void policyRewriteFullTerm();

	/**
	 * Click Reinstate button from Actions menu
	 * click Start Reinstate, select neccessary option and clik quote button
	 * click reinstate button
	 * @param reinstatementReason
	 * @return
	 */
	public void reinstatePolicy(ReinstatementReason reinstatementReason);

	/**
	 * Click Renew button from Actions menu
	 * Click on "Actions" menu options
	 * click Renew button
	 */
	public void policyRenew();

	/**
	 * Click "Action" Button
	 * select RenewalCode from RenewalCode dropdown
	 * Click "Ok" Button
	 * @returns RenewalDataEntryPage
	 */
	public void policyRenewal(RenewPolicy renewPolicy);

	/**
	 * Click on Action then Clicked on PreRenewal Direction button
	 * Click Edit button
	 * EnterText and Select SecurityLevel,NonRenewReason,Direction PreRenewal Direction of an policy
	 * Click Update Button
	 * @param PreRenewalDirection
	 */
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection);

	/**
	 * click "Actions" button
	 * click "CopySubmission" button
	 */
	public void copySubmission();

	/**
	 * click "closeOptions" button
	 * choose Whether withdraw Transaction, Not Taken, Decline for closing the policy
	 * @param closeOptions
	 * @return 
	 */
	public void policyCloseOptions(CloseOptions closeOptions);

	/**
	 * click add secondary insured
	 * @param createNewAccountFromPerson
	 * @return PolicyInfoPage
	 */
	public String addInsured(CreateNewAccount createNewAccount) ;
	
	/**
	 * Proceed Rewrite Process
	 * Click on Action Button
	 * Click on Rewrite New Term to Proceed
	 * @return PolicyInfoPage 
	 */
	public void policyRewriteNewTerm();

	/**
	 * Proceed to Risk Analysis Page
	 * Click on CompletedPolicyTransaction to Proceed
	 * click on Risk analysis page
	 * @return RiskAnalysisPage 
	 */
	public void CompletedPolicyTransactions();
	
	/**
	 * Click Details Button
	 * Click Approve button 
	 * Click OK button
	 * Click Next  button
	 */
	public void approveUWissue(UWIssueType uwIssueType);
	
	/**
	 * Used to run Batch Process Info  "Handle Unresolved Contingency" Batch
	 * Click on "Gotobatch Process" button
	 * Click on "RunHandleUnResolvedCotingency" button
	 */
	public void runBatchProcessInfo();
	
	/**
	 * Used to run Work Queue Info "WorkFlow Batch Process" Batch
	 * Click on "WorkQueueInfo" button
	 * Click on "clickRunWriter_644" button
	 */
	public void runWorkQueueInfo();
	
	/**
	 * Enters "policy number"
	 * clicks on "search"
	 * Enters "LossDate"
	 * clicks on next
	 * @param policyDetails
	 */
	public void searchPolicyNumber(PolicyDetails policyDetails);
	
	/**
	 * Used to copy the policy Submission
	 * Click on "Action" and click on "Copy Submission"
	 */
	public void copySubmissions();
	
	/**
	 * Used to get the "Policy Number"
	 * Click on "View Policy"
	 * Get the "Policy No" using Text
	 * @return policyNo
	 */
	public String getPolicyNumber();
 
}
