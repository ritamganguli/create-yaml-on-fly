package com.aspire.guidewire.pc.teststeps.commercialauto;

import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CommercialAutoLine;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.SearchFor;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Vehicles;

public interface CommercialAutoSteps {

	public static CommercialAutoStepsImpl create() {
		return new CommercialAutoStepsImpl();
	}
	
	public static APICommercialAutoStepsImpl createAPI() {
		return new APICommercialAutoStepsImpl();
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
	 * @return DwellingPage
	 */
	public void updatePolicyInfo(PolicyInfo policyInfo);
	
	/**
	 * select Product and fleets
	 * Add Coverages
	 * Add Additional inusred
	 * click "next" button to navigate to next page
	 * @return LocationsPage 
	 */
	public void addCommercialAutoLineDetails(CommercialAutoLine commercialAutoLine);
	
	/**
	 * click "next" button to navigate to next page
	 * @return VehiclesPage
	 */
	public void addLocations();
	
	/**
	 * click Add button to add drivers
	 * Enter Driver Details
	 * Enter year of first licensed, firstName,addressLineOne ,dateOfBirth,state,
	 * city,zipCode,addressType,licenseNumber,licenseState
	 * numberOfAccidentsPolicyLevel,numberOfAccidentsAccountLevel,
	 * numberOfViolationsPolicyLevel,numberOfViolationsAccountLevel
	 * click "Next" button to navigate to next page
	 * @return VehiclesPage
	 */
	public void addNewDriver(Drivers driver);
	
	/**
	 * click "next" button to navigate to next page
	 * @return DriversPagee
	 */
	public void addStateInfo();
	
	/**
	 * Enter Vehicle Details
	 * add vehicle from vehicles page
	 * Click CreateVehicle,vehiclecheckBox,Add,Person,chkboxPerson
	 * Select Vehicle type,State
	 * Enter VIN,cost vehicle
	 * click "Next" button to navigate to next page
	 * @return CoveragePage
	 */
	public void addVehicle(Vehicles vehicles);
	
	/**
	 * click "Next" button to navigate to next page
	 * @return ModifiersPage
	 */
	public void addCoveredVehicles();	
	
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
	 * click "Next" button to navigate to next page
	 * @return FormsPage
	 */
	public void viewForms();
	
	/**
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysis
	 */
	public void viewQuote();
	
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
	 * clicks Go to submission manager
	 * clicks create confirmation
	 * clicks Generate Confirmation
	 * Document had been generated
	 */
	public void documentCreation();
	
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
   public void searchSubmission(SearchFor searchFor);
   
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
	 * Click on "Quote"
	 * Click on "Bind Options"
	 * Click on "Issue Policy"
	 */
    public void copySubmissions();
	
}
