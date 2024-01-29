package com.aspire.guidewire.pc.teststeps.personalauto;


import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.AdditionalInterest;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PACoverage;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.SpinOff;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.SplitOff;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.UnderWriterIssue;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.UploadDocument;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Vehicles;

public interface PersonalAutoSteps {

	public static PersonalAutoStepsImpl create() {
		return new PersonalAutoStepsImpl();
	}
	
	public static APIPersonalStepsImpl createAPI() {
		return new APIPersonalStepsImpl();
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
	 * @return RiskAnalysisPage
	 */
	public void addPACoverage(PACoverage paCoverage);
	
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
	public void issuepolicy(Transactions transactions);
	
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
	 * Click Actions menu
	 * click Renew button
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
	 * Click on Action then Clicked on PreRenewal Direction button
	 * Click Edit button
	 * EnterText and Select SecurityLevel,NonRenewReason,Direction PreRenewal Direction of an policy
	 * Click Update Button
	 * @param PreRenewalDirection
	 */
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection);

	/**
	 * Clicks on Actions
	 * Click on Split Policy
	 * Enter the account number one which we created
	 * Enter the account number two which we created
	 * Click Create Submission Button
	 * @param SplitOff
	 */
	public void splitOffPolicy(SplitOff splitOff);

	/**
	 * Clicks on Actions
	 * Click on Spin-off
	 * Enter the account number which we created
	 * Click Search Icon for account number
	 * Click create submission button
	 * @param SpinOff
	 */
	public void spinOffPolicy(SpinOff spinOff);
	
    /**
     * To verify out of sequence message in every page
     * @param policyChange
     */
	public void verifyOutOfSequenceMessage(PolicyChange policyChange);

	/**
	 * Click MotorVehicleTab
	 * Click Renew 
	 * Verify the records
	 * returns Risk Analysis Page
	 */
	public void motorvehicleRecords();
	
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
	 * Enter Additional Insured Person Details
	 * Enter Secondary Insured Person Details
	 * @param createNewAccountFromPerson
	 * @return 
	 */
	public String addInsured(CreateNewAccount createNewAccount) ;
	
	/**
	 * click Additional Interest Tab
	 * click Additional Intrest Add Button
     * move to other Contacts
     * click Additional Interest Add Button and clicks on 0ther contacts and clicks on additional user
	 * Select the interest type for person1
	 * click next button to navigate to next page
	 * @param createNewAccountFromPerson
	 */
	public void addAdditionalInterestInVehicles(AdditionalInterest additionalInterest);
	
	/**
	 * Used to click on Details
	 * click Approve Button
	 * Click ok button after verifying the fields
	 */
	public void approvedUWIssues(UnderWriterIssue underWriterIssue);
	
	/**
	 * Clicks on Actions
	 * Used to click on Rewrite New Term transaction
    */
	public void policyRewriteNewTerm();
	
	/**
	 * Verify Error Message Expected Actual ErrorMessage
	 * @return ExpectedErrorMessage
    */
	public void verifyErrorMessage(String expectedErrorMessage);
	
	/**
	 * Click on Next Button 
	 * Returns Forms Page
	 */
	public void viewQuote();
	/**
	 * Click NewDocument Button
	 * Click on Upload Document button
	 * Attach the required document
	 * Select the Status
	 * Select the Upload Document type
	 * Click Update button
	 */
	public void uploadDocument(UploadDocument uploadDocument) ;
	
	/**
	 * Click on ShowRatingWorksheet Button
	 * Click on LiablityBodilyToggle Button
	 * verify Coverage Are Display
	 * verify Coverage Factor Value are display
	 * click Vehicle Type Value are display
	 * verify UWcompany Actual Value are display
	 * verify Multicar Discount Value
	 * click Download Drop Icon
	 * click Option HTML
	 * verify IsFileDownloaded In Local
	 * @return Rating 
	 */
	public void viewShowRating(Rating rate) throws InterruptedException;
	
	/**
	 * Used to complete the Policy Trasaction
	 * Click on completed transaction ID
	 * Click on "Risk Analysis" Screen
	 */
	public void completedPolicyTransactions();

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
	 * Used to get the Policy number in View Policy
	 * @return
	 */
	public String getPolicyNumber();
	
}
