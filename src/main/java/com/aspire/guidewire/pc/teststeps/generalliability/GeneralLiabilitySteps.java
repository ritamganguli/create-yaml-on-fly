package com.aspire.guidewire.pc.teststeps.generalliability;

import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.AddLocationInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Exposures;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Offerings;

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
	 * Used to enter Address1
	 * Used to enter City
	 * Select the State from the state dropdown
	 * Enters the zipcode in zipcode field 
	 * Used to Click on Auto fill Territory Codes Button
	 * Used to Click on Ok button
	 * click next button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	/**
	 * Used to add the location details
	 * Enter the Address 1 ,City, Country, Territory code and Zip Code
	 * @param addLocationInfo
	 */
	public void addLocation(AddLocationInfo addLocationInfo);

	/**
	 * Used to click on "Add Coverage"
	 * click search button
	 * click coverage check box
	 * click add Selected Coverage
	 * Enter designated pollutants
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	public void addCoverage(Coverages coverage);

	/**
	 * Used to click on Add button
	 * Used to select location
	 * Used to Enter on Class code Search
	 * Used to Enter Basis
	 * click next button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	public void addExposures(Exposures exposures);

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
	 * Click on Next Button
	 * Returns Forms Page
	 */
	public void viewQuote();

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
