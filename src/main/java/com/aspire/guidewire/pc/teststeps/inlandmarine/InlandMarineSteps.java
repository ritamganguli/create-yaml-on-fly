package com.aspire.guidewire.pc.teststeps.inlandmarine;

import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyDetails;

public interface InlandMarineSteps{

	public static InlandMarineStepsImpl create() {
		return new InlandMarineStepsImpl();
	}
	
	public static APIInlandMarineStepsImpl createAPI() {
		return new APIInlandMarineStepsImpl();
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
	 * Enters the date in "QuoteDate" Field
	 * Select Term type from "TermType" Drop down
	 * click "Next" button to navigate to next page
	 * return Coverage Part Selection Page
	 */
	public void updatePolicyInfo(PolicyInfo policyInfo);

	/**
	 * Used to add Coverage Part Selections
	 * Click on "AddCoveragePart"
	 * Select "ACCOUNTS_RECEIVABLE"
	 * Select "CONTRACTORS_EQUIPMENTS"
	 * Select "SIGNS"
	 * Click on "Next" Button
	 * @param addCoveragePartSelections
	 * return BuildingsAndLocationsPage
	 */
	public void addCoveragePartSelections(AddCoveragePartSelections addCoveragePartSelections);

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
	 * Used to add Account Receivable Details
	 * Select "Business Class" and "Coinsurance Pct" 
	 * Click on "Add" button in Account Receivable Coverage section
	 * Select "Location/Building" ,"Receptacle Type", and "Percentage Duplicated"
	 * Enter the "Limit"
	 * Click "Next" button to navigate to next page
	 * @param addAddAccountReceivableDetails
	 * return Contractors equipment Page
	 */
	public void addAccountReceivableDetails(AddAccountReceivableDetails addAddAccountReceivableDetails);

	/**
	 * Used to add Contractors Equipment Details
	 * Select "Contructors Type", "Coinsurance"
	 * Click any unscheduled equipments check box
	 * Enter "Limit" and select "Deductable" fields
	 * Click "Next" button to navigate to next page
	 * @param addContractorsEquipmentDetails
	 * return SignsPage
	 */
	public void addContractorsEquipmentDetails(AddContractorsEquipmentDetails addContractorsEquipmentDetails);

	/**
	 * Used to add Signs Details
	 * Select "Coinsurance" field
	 * Click "Add" button
	 * Select "Location, Sign Type
	 * Enter "Description" and "Limit"
	 * Click "Next" button to navigate to next page
	 * @param addSignDetails
	 * return Risk Analysis Page
	 */
	public void addSignsDetails(AddSignsDetails addSignDetails);

	/**
	 * Used to Proceed Risk Analysis
	 * click "Next" button to navigate to next page
	 * @return RiskAnalysisPage
	 */
	public void selectRiskAnalysis();

	/**
	 * Used to proceed the Review Policy
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
	 * To verify out of sequence message in every page
	 * @param policyChange
	 */
	public void verifyOutOfSequenceMessage(PolicyChange policyChange);

	/**
	 * Click on Action then Clicked on PreRenewal Direction button
	 * Click Edit button
	 * EnterText and Select SecurityLevel,NonRenewReason,Direction PreRenewal Direction of an policy
	 * Click Update Button
	 * @param PreRenewalDirection
	 */
	public void policyPreRenewalDirection(PreRenewalDirection preRenewalDirection);

	/**
	 * click Details button
	 * click approve or special approve button
	 * click next button
	 */
	public void approveUWIssues();

	/**
	�* Click on Next Button�
	�* Returns Forms Page
	�*/
	public void viewQuote();

	/**
	 * Used to Search the Policy Number
	 * Click on the Policy Arrow button
	 * Enter the Policy number in the Policy Number textbox
	 * Click on "Search" Button
	 */
	public void searchPolicyNumber(PolicyDetails policyDetails);

	/**
	 * Used to Copy the Policy Submissions
	 * Click on "Action" and Click on "Copy Submission".
	 * Click on "Quote" button in Offering Page
	 * Click on "Bind Options" and click on "Issue Policy"
	 */
	public void copySubmissions();

}
