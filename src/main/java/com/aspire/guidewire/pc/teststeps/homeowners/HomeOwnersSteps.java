package com.aspire.guidewire.pc.teststeps.homeowners;

import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.AdditionalInterest;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingConstruction;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.HistoryDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.UWIssueType;

public interface HomeOwnersSteps {

	public static HomeOwnersStepsImpl create() {
		return new HomeOwnersStepsImpl();
	}

	public static APIHomeOwnersStepsImpl createAPI() {
		return new APIHomeOwnersStepsImpl();
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
	 * click "next" button to navigate to next page
	 * @return PolicyInfoPage
	 */
	public void selectQualifications(Qualification qualification);
	/**
	 * Enters the date in "QuoteDate" Field
	 * Select Term type from "TermType" Drop down
	 * click "Next" button to navigate to next page
	 * @return DwellingPage
	 */
	public void updatePolicyInfo(PolicyInfo policyInfo);

	/**
	 * Enters Fire Protection and navigate to next Page
	 * @param FireProtection
	 */
	public void addDwellingDetails(DwellingDetails dwellingDetails);
	/**
	 * Enters Year of construction and clicks next
	 * @param dwellingConstruction
	 */
	public void addDwellingConstructionDetails(DwellingConstruction dwellingConstruction);

	/**
	 * Enters Coverage details for respective policy type like Dwelling, Condominium, Rental
	 * click "Next" button to navigate to next page
	 * @return ModifiersPage
	 */
	public void addCoverages(Coverages coverage);

	/**
	 * click next button
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
	 * Enters Rating sheet details
	 * click "Next" button to navigate to next page
	 * @return QuotePage
	 */
	public void viewForms(Quote quote);

	/**
	 * click "Next" button to navigate to next page
	 * Select BillingMethod from BillingMethod dropdown
	 * Select PaymentSchedule from PaymentSchedule dropdown
	 * Select cash from Upfront payment
	 * @return PaymentsPage
	 */
	public void selectPayments(Payments payments);

	/**
	 * click BindOptions
	 * click issue policy button
	 * @return PolicyBoundPage
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
	 * Click Renew Policy button from Action menu
	 */
	public void policyRenew();

	/**
	 * select RenewalCode from RenewalCode dropdown
	 * Click "Ok" Button
	 * returns RenewalDataEntryPage
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
	 * To verify out of sequence message in every page
	 * @param policyChange
	 */
	public void verifyOutOfSequenceMessage(PolicyChange policyChange);

	/**
	 * click "Actions" button
	 * click "CopySubmission" button
	 */
	public void copySubmission();

	/**
	 * click "closeOptions" button
	 * choose Whether withdraw Transaction, Not Taken, Decline for closing the policy
	 * @param closeOptions
	 */
	public void policyCloseOptions(CloseOptions closeOptions);

	/**
	 * click add insured button
	 * Add both secondary and additional insured
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * @param createNewAccount
	 * @return 
	 */
	public void addInsured(CreateNewAccount createNewAccount);

	/**
	 * Add additional interest from person, company, other contacts
	 * @param additionalInterest
	 */
	public void addAdditionalInterestInDwelling(AdditionalInterest additionalInterest);

	/**
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
	public void completedPolicyTransactions();

	/**
	 * Proceed to Header Page
	 * Click on History Button
	 * @return HistoryPage 
	 */
	public void verifyChangesInHistoryPage(HistoryDetails historyDetails);
	/**
	 * Verify Error message
	 * @return Qualifications 
	 */

	public void verifyErrorMessage(String expectedActualErrorMessage);
	/**
	 * Proceed to Quote Page
	 * Click on next
	 * @return Policy 
	 */

	public void viewQuote(Quote quote);

	/**
	 * Click on Document
	 * Verify Email is Created or not
	 * @return HistoryPage 
	 */
	public void verifyDocumentIsCreated(String documentName);

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
	 * Verify Coverage Name is created or not
	 * @return HistoryPage 
	 */
	public void verifyFormsCreated(Transactions transactions);

	/**
	 * Click Details Button
	 * Click Approve button 
	 * Click OK button
	 * Click Next  button
	 */
	public void approveUWissue(UWIssueType uwIssueType);


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
	 * Click on "Quote"
	 * Click on "Bind Options"
	 * Click on "Issue Policy"
	 */
	public void copySubmissions();

	/**
	 * Used to get the Policy Number
	 * Click on "View Policy"
	 * Get the Policy Number using text
	 * @return
	 */
	public String getPolicyNumber();

}