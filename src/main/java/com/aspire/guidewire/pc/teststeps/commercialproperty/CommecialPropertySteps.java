package com.aspire.guidewire.pc.teststeps.commercialproperty;

import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Blanket;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.UWIssueType;


public interface CommecialPropertySteps {


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
	 * Click on "Action" Button
	 * Click on "NewAccount" Button
	 * firstName - first name to be entered
	 * lastName - last name to be entereds
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
	 * @return Policy account number
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
	 * Used to add Building and Locations details
	 * Click on Add Building a dropdown New building button
	 * Enter the Description of the Building 
	 * Click on "OK" Button
	 * Click "Next" button to navigate to next page
	 * @param addBuildingLocationDetails
	 * @return Accounts Receivable Page
	 */
	public void addBuildingLocationDetails(AddBuildingLocationDetails addBuildingLocationDetails);

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	public void addBlankets(Blanket blanket);

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	public void addModifiersDetails();

	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis);

	/**
	 * click "Next" button to navigate to next page
	 * @return PolicyReviewPage
	 */
	public void reviewPolicy(PolicyReview policyreview);

	/**
	  * Click on Next Button 
	  * Returns Forms Page
	  */
	public void viewQuote(Quote quote);

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
	 * returns OfferingsPage
	 */
	public void policyChange(PolicyChange policyChange);

	/**
	 * Click on Action then Clicked on PreRenewal Direction button
	 * Click Edit button
	 * EnterText and Select SecurityLevel,NonRenewReason,Direction PreRenewal Direction of an policy
	 * Click Update Button
	 * @param PreRenewalDirection
	 */
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection);

	/**
	 * Click on "RewriteFullTerm" Button 
	 * Returns PolicyBoundPage
	 */
	public void policyRewriteFullTerm();

	/**
	 * Click Reinstate button from Actions menu
	 * click Start Reinstate, select neccessary option and clik quote button
	 * click reinstate button
	 * @param reinstatementReason
	 */
	public void reinstatePolicy(ReinstatementReason reinstatementReason);

	/**
	 * Click Reinstate button from Actions menu
	 * click reinstate button
	 * @param reinstatementReason
	 */
	public void policyRenew();

	/**
	 * Click "Action" Button
	 * select RenewalCode from RenewalCode dropdown
	 * Click "Ok" Button
	 * returns RenewalDataEntryPage
	 */
	public void policyRenewal(RenewPolicy renewPolicy);

	/**
	 * click "Actions" button
	 * click "CopySubmission" button
	 */
	public void copySubmission();

	/**
	 * Enter Additional Insured Person Details
	 * Enter Secondary Insured Person Details
	 * @param createNewAccountFromPerson
	 * @return 
	 */
	public String addInsured(CreateNewAccount createNewAccount) ;

	/**
	 * Clicks on Actions
	 * Used to click on Rewrite New Term transaction
	 */
	public void policyRewriteNewTerm();

	/**
	 * To verify out of sequence message in every page
	 * @param policyChange
	 */
	public void verifyOutOfSequenceMessage(PolicyChange policyChange);
	
	/**
	 * Proceed to Risk Analysis Page
	 * Click on CompletedPolicyTransaction to Proceed
	 * click on Risk analysis page
	 * @return RiskAnalysisPage 
	 */
	public void completedPolicyTransactions();
	/**
	 * Click on ShowRatingWorksheet Button
	 * Click on IDeductiblesToggle Button
	 * verify Coverage Are Display
	 * verify All Perils Deduct Factor 
	 * click Base Premium Toggle Button
	 * verify State
	 * verify ActualValue Form Factor
	 * click Coverage F Toggle
	 * verify Coverage F Limit
	 * click Download Drop Icon
	 * click Option HTML
	 * verify IsFileDownloaded In Local
	 * @return Rating 
	 */
   
	
	public void viewShowRating(Rating rate) throws InterruptedException;
	
	/**
	 * Click Setting
	 * Click "LogOut" Button
	 * Logout The application
	 */
	
	   public void logOutTheApplication() ;
		/**
		 * Click Search Tab
		 * Select SearchFor dropdown 
		 * Enter the Submission Number
		 * Click Search  button
		 * click on Account Number 
		 */
	   
	   public void searchSubmission(String searchType, String subissionNumber);
	   
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
		 * Used to Search given Policy Number 
		 * Click on Policy Toggle Sub menu
		 * Type Policy Number in Policy Search field
		 * Click on policy Search icon
		 */
		public void searchPolicyNumber(PolicyDetails policyDetails);
		
		/**
		 * Used to Copy Submission 
		 * Click on "Actions"
		 * Click on "Copy Submission"
		 * Click on "Rate"
		 * Click on "Quote"
		 * Click on "Bind Options"
		 * Click on "Issue Policy"
		 */
		public void copySubmissions();
		
}