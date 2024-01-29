package com.aspire.guidewire.pc.teststeps.workerscompensation;

import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.Offerings;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcCoverages;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcoptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RiskAnalysis;

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
	 * @return DriversPage
	 */
	public void updatePolicyInfo(PolicyInfo policyInfo);


	/**
	 * Click "Next" button to navigate to next page
	 * @param addLocationDetails
	 * @return Buildings Page
	 */
	public void addLocationDetails(AddLocationDetails addLocationDetails);
	/**
	 * Click "Next" button to navigate to next page
	 * @param add Wc Coverages
	 * @return Wc Coverages
	 */
	public void addWcCoverages(AddWcCoverages addWcCoverages);

	/**
	 * Click "Next" button to navigate to next page
	 * @param add Wc Options
	 * @return Wc Options
	 */
	public void addSupplemental();

	/**
	 * Click "Next" button to navigate to next page
	 * @param add Wc Options
	 * @return Wc Options
	 */
	public void addWcoptions(AddWcoptions addwcoptions);

	/**
	 * Used to Proceed Risk Analysis
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
	 * Click Reinstate button from Actions menu
	 * click reinstate button
	 * @param reinstatementReason
	 * @author anitha.raphel
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
	 * To verify out of sequence message in every page
	 * @param policyChange
	 */
	public void verifyOutOfSequenceMessage(PolicyChange policyChange);

	/**
	 * click "Next" button to navigate to form page
	 * @return FormsPage
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
