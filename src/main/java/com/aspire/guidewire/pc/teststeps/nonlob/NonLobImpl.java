package com.aspire.guidewire.pc.teststeps.nonlob;

import org.openqa.selenium.WebDriver;

import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.ActionsPage;
import com.aspire.guidewire.pc.pages.common.CancellationPage;
import com.aspire.guidewire.pc.pages.common.ConfirmationPage;
import com.aspire.guidewire.pc.pages.common.CreateAccountPage;
import com.aspire.guidewire.pc.pages.common.EnterAccountInformationPage;
import com.aspire.guidewire.pc.pages.common.FormsPage;
import com.aspire.guidewire.pc.pages.common.HeaderPage;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.pc.pages.common.MySummaryPage;
import com.aspire.guidewire.pc.pages.common.OfferingsPage;
import com.aspire.guidewire.pc.pages.common.PaymentsPage;
import com.aspire.guidewire.pc.pages.common.PolicyBoundPage;
import com.aspire.guidewire.pc.pages.common.PolicySummaryPage;
import com.aspire.guidewire.pc.pages.common.QuotePage;
import com.aspire.guidewire.pc.pages.common.SearchAddressBookPage;
import com.aspire.guidewire.pc.pages.common.StartPolicyChangePage;
import com.aspire.guidewire.pc.pages.common.StartReinstatementPage;
import com.aspire.guidewire.pc.pages.nonlob.AdministrationPage;
import com.aspire.guidewire.pc.pages.nonlob.MessageQueuesPage;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccount;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccountFromAddressBook;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccountFromCompany;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.MessageQueue;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.PolicyDetails;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class NonLobImpl implements NonLobSteps {

	private static String webSite = DriverManager.getPCwebsite();

	/**
	 * Enter "User name" in the User name Field 
	 * Enter "Password" in the Password Field 
	 * Click "Login" Button
	 * Login to application with valid credentials
	 * @param username
	 * @param password
	 */
	@Override
	public void loginIntoTheApplication(String username, String password) {
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), webSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		Log.messageStep("Logged into the Application",DriverManager.getDriver());	
	}

	/**
	 * Click on "Action" Button
	 * Click on "NewAccount" Button
	 * firstName - first name to be entered
	 * lastName - last name to be entered
	 * Click on the "Search" button for the Account Search
	 * Click on the create new account button 
	 * @param enterAccountInformation
	 */
	@Override
	public void searchAccount(EnterAccountInformation enterAccountInfo) {
		new MySummaryPage(DriverManager.getDriver()).get();
		EnterAccountInformationPage enterAccountInformationPage = new HeaderPage(DriverManager.getDriver()).clickToggleAccountSubMenu(DriverManager.getDriver()).clickNewAccount(DriverManager.getDriver());
		if(enterAccountInfo.getFirstName()!=null) enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), enterAccountInfo.getFirstName());
		if(enterAccountInfo.getLastName()!=null)  enterAccountInformationPage.enterLastname(DriverManager.getDriver(), enterAccountInfo.getLastName());
		if(enterAccountInfo.getCompanyName()!=null) enterAccountInformationPage.enterCompanyName(DriverManager.getDriver(), enterAccountInfo.getCompanyName());
		enterAccountInformationPage.clickSearch(DriverManager.getDriver());
		enterAccountInformationPage.clickCreateNewAccount(DriverManager.getDriver());
		Log.messageStep("Searched for account with First Name : " + enterAccountInfo.getFirstName() + " and Last Name: " + enterAccountInfo.getLastName(), DriverManager.getDriver());
	}

	/**
	 * Click on "CreateNewAccount" Toggle
	 * Used click Account for a "Person"
	 * Used to enter AddressLineOne,Zipcode,City and Organization
	 * Used to select State, Address type
	 * Click on the "Update" button for the create Account 
	 * Used to verify AccountNo Generated with Numeric values
	 * @param createNewAccount
	 */
	@Override
	public String createAccount(CreateNewAccount createNewAccount) {
		CreateAccountOptions  createAccountOption = createNewAccount.getCreateAccountPreference();
		CreateAccountPage createAccountPage=new CreateAccountPage(DriverManager.getDriver());
		EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(DriverManager.getDriver());
		String accountNumberText = "";

		switch(createAccountOption) {

		case PERSON:
			new EnterAccountInformationPage(DriverManager.getDriver()).clickPerson(DriverManager.getDriver());
			CreateNewAccountFromPerson createNewAccountFromPerson = (CreateNewAccountFromPerson)createNewAccount;

			if(createNewAccountFromPerson.getFirstName()!=null) enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromPerson.getFirstName());
			if(createNewAccountFromPerson.getLastName()!=null) enterAccountInformationPage.enterLastname(DriverManager.getDriver(), createNewAccountFromPerson.getLastName());
			if(createNewAccountFromPerson.getAddressLine1()!=null) createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromPerson.getAddressLine1());
			if(createNewAccountFromPerson.getState()!=null) createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromPerson.getState());
			if(createNewAccountFromPerson.getCity()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromPerson.getCity());
			if(createNewAccountFromPerson.getZipCode()!=null) createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromPerson.getZipCode());
			if(createNewAccountFromPerson.getAddressType()!=null) createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromPerson.getAddressType());
			if(createNewAccountFromPerson.getOrganization()!=null) createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromPerson.getOrganization());
			if(createNewAccountFromPerson.getProducerCode()!=null) createAccountPage.selectProducerCode(DriverManager.getDriver(), createNewAccountFromPerson.getProducerCode());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			AccountSummaryPage accountSummaryPage = new AccountSummaryPage(DriverManager.getDriver()).get();
			accountNumberText = accountSummaryPage.getAccountNumberText(DriverManager.getDriver());
			Log.messageStep("Created account with First Name: " + createNewAccountFromPerson.getFirstName() + " and Last Name: " + createNewAccountFromPerson.getLastName(), DriverManager.getDriver());
			break;

		case COMPANY:
			new EnterAccountInformationPage(DriverManager.getDriver()).clickCompany(DriverManager.getDriver());
			CreateNewAccountFromCompany createNewAccountFromCompany = (CreateNewAccountFromCompany)createNewAccount;

			if(createNewAccountFromCompany.getCompanyName()!=null) enterAccountInformationPage.enterCompanyName(DriverManager.getDriver(), createNewAccountFromCompany.getCompanyName());
			if(createNewAccountFromCompany.getAddressLine1()!=null) createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromCompany.getAddressLine1());
			if(createNewAccountFromCompany.getState()!=null) createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromCompany.getState());
			if(createNewAccountFromCompany.getCity()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromCompany.getCity());
			if(createNewAccountFromCompany.getZipCode()!=null) createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromCompany.getZipCode());
			if(createNewAccountFromCompany.getAddressType()!=null) createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromCompany.getAddressType());
			if(createNewAccountFromCompany.getOrganization()!=null) createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromCompany.getOrganization());
			if(createNewAccountFromCompany.getProducerCode()!=null) createAccountPage.selectProducerCode(DriverManager.getDriver(), createNewAccountFromCompany.getProducerCode());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			Log.messageStep("Created account with Company Name : " + createNewAccountFromCompany.getCompanyName() + " and Organization : " + createNewAccountFromCompany.getOrganization(), DriverManager.getDriver());

			break;

		case FROM_ADDRESS_BOOK:
			new EnterAccountInformationPage(DriverManager.getDriver()).clickFromAddressBook(DriverManager.getDriver());
			CreateNewAccountFromAddressBook createNewAccountFromAddressBook = (CreateNewAccountFromAddressBook)createNewAccount;

			SearchAddressBookPage searchAddressBookPage = new SearchAddressBookPage(DriverManager.getDriver());
			searchAddressBookPage.selectType(DriverManager.getDriver(), createNewAccountFromAddressBook.getType());
			searchAddressBookPage.enterFirstName(DriverManager.getDriver(), createNewAccountFromAddressBook.getFirstName());
			searchAddressBookPage.enterLastName(DriverManager.getDriver(), createNewAccountFromAddressBook.getLastName());
			searchAddressBookPage.clickSearchButton(DriverManager.getDriver());
			searchAddressBookPage.clickSelect(DriverManager.getDriver());
			if(createNewAccountFromAddressBook.getFirstName()!=null) enterAccountInformationPage.enterFirstname(DriverManager.getDriver(), createNewAccountFromAddressBook.getFirstName());
			if(createNewAccountFromAddressBook.getLastName()!=null) enterAccountInformationPage.enterLastname(DriverManager.getDriver(), createNewAccountFromAddressBook.getLastName());
			if(createNewAccountFromAddressBook.getAddressLine1()!=null) createAccountPage.enterAddress1(DriverManager.getDriver(),  createNewAccountFromAddressBook.getAddressLine1());
			if(createNewAccountFromAddressBook.getState()!=null) createAccountPage.selectState(DriverManager.getDriver(), createNewAccountFromAddressBook.getState());
			if(createNewAccountFromAddressBook.getCity()!=null) createAccountPage.enterCity(DriverManager.getDriver(), createNewAccountFromAddressBook.getCity());
			if(createNewAccountFromAddressBook.getZipCode()!=null) createAccountPage.enterZIPCode(DriverManager.getDriver(), createNewAccountFromAddressBook.getZipCode());
			if(createNewAccountFromAddressBook.getAddressType()!=null) createAccountPage.selectAddressType(DriverManager.getDriver(), createNewAccountFromAddressBook.getAddressType());
			if(createNewAccountFromAddressBook.getOrganization()!=null) createAccountPage.enterOrganization(DriverManager.getDriver(), createNewAccountFromAddressBook.getOrganization());
			if(createNewAccountFromAddressBook.getProducerCode()!=null) createAccountPage.selectProducerCode(DriverManager.getDriver(), createNewAccountFromAddressBook.getProducerCode());
			createAccountPage.clickUpdate(DriverManager.getDriver());
			accountSummaryPage = new AccountSummaryPage(DriverManager.getDriver()).get();
			Log.messageStep("Created account with First Name: " + createNewAccountFromAddressBook.getFirstName() + " and Last Name: " + createNewAccountFromAddressBook.getLastName(), DriverManager.getDriver());
		default:
			break;
		}
		Log.messageStep("Account Created successfully", DriverManager.getDriver());
		return accountNumberText;
	}

	/**
	 * Verify Error message in every page
	 * @param policyChange
	 */
	public void verifyErrorMessage(String expectedActualErrorMessage) {
		String actualErrorMessage = new HeaderPage(DriverManager.getDriver()).getErrorMessage(DriverManager.getDriver());
		Log.assertThat(actualErrorMessage.equals(expectedActualErrorMessage), "Error message displayed successfully: "+actualErrorMessage,
				"Actual error message: "+actualErrorMessage+" is not matching with expected: "+expectedActualErrorMessage, DriverManager.getDriver());

	}


	/**
	 * Click "Action" Button
	 * Click on "ChangePolicy" Button
	 * click "Next" button to navigate to next page
	 * click "Quote" on offerings page
	 * click "Next" on quote page
	 * click "Next" on Forms page
	 * click "Issue Policy" on Forms page
	 * click "view Policy" on Forms page
	 * 
	 */
	public String policyChange(WebDriver driver) {
		StartPolicyChangePage startPolicyChangePage = new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver())
				.clickChangePolicy(DriverManager.getDriver());	
		startPolicyChangePage.clickNext(DriverManager.getDriver());
		OfferingsPage OfferingsPage = new OfferingsPage(DriverManager.getDriver()).get();
		OfferingsPage.clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).get();	
		new QuotePage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new FormsPage(DriverManager.getDriver()).get();	
		new FormsPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
		new PaymentsPage(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		new PolicyBoundPage(DriverManager.getDriver()).get()
		.clickViewPolicy(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Clicked on View policy Link",DriverManager.getDriver());
		return new PolicySummaryPage(DriverManager.getDriver()).getPolicyNo(DriverManager.getDriver());
	}

	/**
	 * click "cancel policy" from Policy summary page
	 * Used to start Cancellation Process
	 * Used to select "Source" and "Reason" Fields
	 * Used to click on "Start Cancellation" button
	 * Used to Click on "Bind" option then click on "Cancel Now" button
	 * Verify that the submission has been Cancelled 
	 * Used to click on "ViewPolicy"
	 */
	public void cancelPolicy(WebDriver driver) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).clickCancelPolicy(DriverManager.getDriver());
		CancellationPage cancellationPage=new CancellationPage(DriverManager.getDriver())
				.selectSource(DriverManager.getDriver(), "Insured")
				.selectReason(DriverManager.getDriver(), "Policy not-taken");
		String refundMethod=cancellationPage.getRefundMethod(DriverManager.getDriver());
		cancellationPage.clickStartCancellation(DriverManager.getDriver());
		new ConfirmationPage(DriverManager.getDriver()).clickbindOptions(DriverManager.getDriver()).clickCancelNow(DriverManager.getDriver());
		Log.messageStep("Policy cancelled successfully for "+refundMethod,DriverManager.getDriver());
		new PolicyBoundPage(DriverManager.getDriver()).get()
		.clickViewPolicy(DriverManager.getDriver());
	}

	/**
	 * Click Reinstate button from Actions menu
	 * click Start Reinstate, select neccessary option and clik quote button
	 * click reinstate button
	 * @param reinstatementReason
	 * click view policy
	 */
	public String reinstatePolicy(WebDriver driver) {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickReinstatePolicy(DriverManager.getDriver());
		new StartReinstatementPage(DriverManager.getDriver()).selectReason(DriverManager.getDriver(), "Other")
		.clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickReinstate(DriverManager.getDriver());	
		Log.messageStep("Clicked on Reinstate Policy link for Reason : " ,DriverManager.getDriver());
		new PolicyBoundPage(DriverManager.getDriver()).get()
		.clickViewPolicy(DriverManager.getDriver());
		return new PolicySummaryPage(DriverManager.getDriver()).getPolicyNo(DriverManager.getDriver());
	}

	/**
	 * Used to Search the Policy Number
	 * Click on the Policy Arrow button
	 * Enter the Policy number in the Policy Number textbox
	 * Click on "Search" Button
	 */
	@Override
	public void searchPolicyNumber(PolicyDetails policyDetails) {
		new HeaderPage(DriverManager.getDriver())
		.clickTogglePolicySubMenu(DriverManager.getDriver())
		.enterPolicyNumber(DriverManager.getDriver(), policyDetails.getPolicyNumber())
		.clickPolicySearch(DriverManager.getDriver());
		Log.messageStep("Searched on Policy Number",DriverManager.getDriver());

	}

	/**
	 * Used to Copy Submission 
	 * Click on "Actions"
	 * Click on "Copy Submission"
	 * Click on "Quote"
	 * Click on "Bind Options"
	 * Click on "Issue Policy"
	 */
	@Override
	public void copySubmissions() {
		new ActionsPage(DriverManager.getDriver()).clickActions(DriverManager.getDriver()).clickCopySubmission(DriverManager.getDriver());
		new OfferingsPage(DriverManager.getDriver()).clickQuote(DriverManager.getDriver());
		new QuotePage(DriverManager.getDriver()).clickBindOptions(DriverManager.getDriver()).clickIssuePolicy(DriverManager.getDriver());
		Log.messageStep("Clicked on Copy Submission",DriverManager.getDriver());

	}
	/**
	 * click "View Policy" submission
	 */
	@Override
	public void viewPolicy() {
		new PolicyBoundPage(DriverManager.getDriver()).get()
		.clickViewPolicy(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Clicked on View policy Link",DriverManager.getDriver());
	}	

	/**
	 * click "Administration" 
	 * click "Monitoring" 
	 * click "Message Queue" 
	 * verify the status if it is "suspended" in status then click "suspended status check box" 
	 * and click "Resume" or
	 * click "Check all destination message queue check box" 
	 * click "Restart Messaging Engine" 
	 */
	public void resumeOrRestartMessageQueues(MessageQueue messageQueue) {
		new AdministrationPage(DriverManager.getDriver())
		.clickToggleAdministrationSubMenu(DriverManager.getDriver())
		.clickMonitoring(DriverManager.getDriver()).clickMessageQueues(DriverManager.getDriver());
		//Resume the suspended queues
		MessageQueuesPage messageQueuesPage = new MessageQueuesPage(DriverManager.getDriver()).get();
		messageQueuesPage.updateMessageQueueStatusAsResume(DriverManager.getDriver());
		//Restart Messaging Engine
		if(messageQueue.isRestartMessageQueue()) {
			new MessageQueuesPage(DriverManager.getDriver())
			.clickAllMessageQueueDestination(DriverManager.getDriver())
			.clickRestartMessagingEngine(DriverManager.getDriver());
			Log.messageStep("Restarted Message Engine service", DriverManager.getDriver(), true);
		}

	}

}