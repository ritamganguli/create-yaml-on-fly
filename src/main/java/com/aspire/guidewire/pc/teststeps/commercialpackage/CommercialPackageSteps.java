package com.aspire.guidewire.pc.teststeps.commercialpackage;

import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBlanketDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragesDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddExposuresDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineSelectionDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ViewQuote;

public interface CommercialPackageSteps {

	public static CommercialPackageStepsImpl create() {
		return new CommercialPackageStepsImpl();
	}
	public static APICommercialPackageStepsImpl createAPI() {
		return new APICommercialPackageStepsImpl();
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
	public void selectQualifications();
	
	/**
	 * Enters the date in "QuoteDate" Field
	 * Select Term type from "TermType" Drop down
	 * click "Next" button to navigate to next page
	 * @return DriversPage
	 */
	public void updatePolicyInfo(PolicyInfo policyInfo);

	/**
	 * Used to enter new  Location Details
	 * Enter the Address1, City,Zip code and Territory code
	 * @param addLocationDetails
	 * return Building And Locations Page
	 */
	public void addLocationDetails(AddLocationDetails addLocationDetails);

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
	 * Used to enter the Line selection details
	 * Select Package Risk Type
	 * select or deselect the line Types
	 * click "Next" button to navigate to next page
	 * @param addLineSelectionDetails
	 * return Location Page
	 */
	public void addLineSelectionDetails(AddLineSelectionDetails addLineSelectionDetails);

	/**
	 * Used to add Blanket Details 
	 * Click "Add" Button
	 * Select "Blanket Type" and "Group Type"
	 * Click on "Show Coverages"
	 * Select any 2 coverages and click on "Include Selected in Blanket" button
	 * Select "Location" drop down
	 * Click on "OK" Button
	 * Click "Next" button to navigate to next page
	 * @param addBlanketDetails
	 * return Modifier Page
	 */
	public void addBlanketDetails(AddBlanketDetails addBlanketDetails);

	/**
	 * Used to Add Modifier Details
	 * Click "Next" button to navigate to next page
	 */
	public void addModifiersDetails();

	/**
	 * Used to Add Line Review Details
	 * Click "Next" button to navigate to next page
	 */
	public void addLineReview(AddLineReview addLineReview);

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
	 * Used to add Account Receivable Details
	 * Select "Business Class" and "Coinsurance Pct" 
	 * Click on "Add" button in Account Receivable Coverage section
	 * Select "Location/Building" ,"Receptacle Type", and "Percentage Duplicated"
	 * Enter the "Limit"
	 * Click "Next" button to navigate to next page
	 * @param addAddAccountReceivableDetails
	 * return Contractors equipment Page
	 * 
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
	public void selectRiskAnalysis(RiskAnalysis riskAnalysis);
	
	/**
	 * Used to add Coverages Details
	 * click "Next" button to navigate to next page
	 * return Exposure Page
	 */
	public void addCoveragesDetails(AddCoveragesDetails addCoveragesDetails);
	
	/**
	 * Used to add Exposures Details
	 * click "Next" button to navigate to next page
	 * @param Modifier Page
	 */
	public void addExposuresDetails(AddExposuresDetails addExposuresDetails);
	
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
    * To verify out of sequence message in every page
    * @param policyChange
    */
	public void verifyOutOfSequenceMessage(PolicyChange policyChange);
	
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
	 * Click "Action" Button
	 * Click "Renew Policy" Button
	 * @returns RenewalDataEntryPage
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
	public void completedPolicyTransactions();

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
	 * click "Next" button to navigate to next page
	 * @param viewQuote
	 */
	public void viewQuote(ViewQuote viewQuote);
	
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
	public void copySubmissionsandAddContingincy(RiskAnalysis riskAnalysis);
	
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
