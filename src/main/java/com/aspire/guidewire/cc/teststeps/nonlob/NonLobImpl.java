package com.aspire.guidewire.cc.teststeps.nonlob;

import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage;
import com.aspire.guidewire.cc.pages.common.AddClaimInformationPage.NewPropertyIncidentPage;
import com.aspire.guidewire.cc.pages.common.BasicInformationPage;
import com.aspire.guidewire.cc.pages.common.BatchProcessInfoPage;
import com.aspire.guidewire.cc.pages.common.CheckDetailsPage;
import com.aspire.guidewire.cc.pages.common.ContactInformationPage;
import com.aspire.guidewire.cc.pages.common.CreateRecoveryPage;
import com.aspire.guidewire.cc.pages.common.EnterPayeeInformationPage;
import com.aspire.guidewire.cc.pages.common.EnterPaymentInformationPage;
import com.aspire.guidewire.cc.pages.common.FinancialsChecksPage;
import com.aspire.guidewire.cc.pages.common.FinancialsSummaryPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.NewClaimSavedPage;
import com.aspire.guidewire.cc.pages.common.SaveAndAssignClaimPage;
import com.aspire.guidewire.cc.pages.common.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.common.ServicesPage;
import com.aspire.guidewire.cc.pages.common.SetCheckInstructionsPage;
import com.aspire.guidewire.cc.pages.common.TransferCheckPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.pages.nonlob.MessageQueuesPage;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.MessageQueue;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.SearchClaim;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class NonLobImpl implements NonLobSteps {

	private String CCwebSite;
	private String CMwebSite;

	/**
	 * Enter "User name" in the User name Field 
	 * Enter "Password" in the Pass	word Field 
	 * Click "Login" Button
	 * Login to application with valid credentials
	 * @param username
	 * @param password
	 */
	@Override
	public void loginIntoTheApplication(String username, String password) {
		this.CCwebSite = DriverManager.getCCWebsite();
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), CCwebSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		new ActivitiesPage(DriverManager.getDriver()).get();
		Log.messageStep("Logged into the Application",DriverManager.getDriver());
	}

	public void loginIntoContactManagerApplication(String username, String password) {
		this.CMwebSite = DriverManager.getCMwebsite();
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), CMwebSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		Log.messageStep("Logged into the Contact Manager Application",DriverManager.getDriver());
	}

	/**
	 * clicks on "Claim"
	 * clicks on "New claim"
	 */
	@Override
	public void createClaim(){
		new HeaderPage(DriverManager.getDriver()).clicktoggleClaimSubMenu(DriverManager.getDriver()).clickNewClaim(DriverManager.getDriver());
		Log.messageStep("New Claim Initiated",DriverManager.getDriver());
	}

	/**
	 * Selects "insured name"
	 * Selects "Relation to insured"
	 * clicks on next
	 * @param basicInfo
	 */
	@Override
	public void enterBasicInformation(BasicInfo basicInfo) {
		BasicInformationPage basicInformationPage = new BasicInformationPage(DriverManager.getDriver()).get().selectInsuredName(DriverManager.getDriver());
		if(basicInfo.getRelationToInsured()!=null) basicInformationPage.selectRelationtoInsured(DriverManager.getDriver(), basicInfo.getRelationToInsured());
		basicInformationPage.clickNext(DriverManager.getDriver());
	}

	/**
	 * Selects "loss cause"
	 * Enters city 
	 * Selects State 
	 * Adds property damage
	 * @param claimInfo
	 */
	@Override
	public void addClaimInformation(ClaimInfo claimInfo) {
		AddClaimInformationPage addClaimInformationPage = new AddClaimInformationPage(DriverManager.getDriver()).get().selectLossCause(DriverManager.getDriver(), claimInfo.getLossCause())
				.selectState(DriverManager.getDriver(), claimInfo.getState()).enterCity(DriverManager.getDriver(), claimInfo.getCity());
		if(claimInfo.getFaultRating()!=null)addClaimInformationPage.selectFaultRating(DriverManager.getDriver(), claimInfo.getFaultRating());

		if(claimInfo.getAddPropertyDamage()!= null) {
			AddPropertyDamage addPropertyDamage = claimInfo.getAddPropertyDamage();
			addClaimInformationPage.clickAddPropertyDamage(DriverManager.getDriver());
			NewPropertyIncidentPage newPropertyIncidentPage = addClaimInformationPage.new NewPropertyIncidentPage(DriverManager.getDriver());
			newPropertyIncidentPage.enterDamageDescription(DriverManager.getDriver(),addPropertyDamage.getDamageDescription());
			newPropertyIncidentPage.enterPropertyDescription(DriverManager.getDriver(),addPropertyDamage.getPropertyDescription());
			newPropertyIncidentPage.selectPropertyName(DriverManager.getDriver(),addPropertyDamage.getPropertyName());
			newPropertyIncidentPage.clickOK(DriverManager.getDriver());
		}
		addClaimInformationPage.clickNext(DriverManager.getDriver());
		Log.messageStep("New Claim Initiated",DriverManager.getDriver());

	}

	/**
	 * Clicks on next
	 * returns SaveAndAssignClaimPage
	 */
	@Override
	public void addServices() {
		new ServicesPage(DriverManager.getDriver()).get().clickNext(DriverManager.getDriver());
	}

	/**
	 * clicks on "Finish" button
	 * returns NewClaimSavedPage
	 */
	@Override
	public void saveAndAssignClaim() {
		new SaveAndAssignClaimPage(DriverManager.getDriver()).get().clickFinish(DriverManager.getDriver());

	}

	/**
	 * clicks on "Go to claim"
	 * returns SummaryPage
	 */
	@Override
	public String viewClaim() {
		NewClaimSavedPage newClaimSavedPage = new NewClaimSavedPage(DriverManager.getDriver()).get();
		String claimNumber = newClaimSavedPage.getClaimNumber(DriverManager.getDriver());
		newClaimSavedPage.clickGoToClaim(DriverManager.getDriver());
		return claimNumber;
	}

	/**
	 * Enter "FirstName" in First name Field
	 * Enter "LastName" in Last name Field
	 * Enter "Name" in  Name Field
	 * Enter "Address" in  Address Field
	 * Enter "TaxIdSSN" in TaxIdSSN Field
	 * Enter "TaxId" in TaxId Field
	 * select "State" from State drop down
	 * Enter "City" in City Field
	 * Enter "Roles" in Roles Field
	 * Clicked on "Add" Button
	 * select "Roles" from Roles drop down
	 * Clicked on "Update" Button
	 * @param contactDetails
	 */
	@Override
	public void addContactInformation(ContactDetails contactDetails) {
		ContactInformationPage newAutoRepairShop = new ContactInformationPage(DriverManager.getDriver());
		if(contactDetails.getFirstName()!=null) newAutoRepairShop.enterFirstname(DriverManager.getDriver(),contactDetails.getFirstName());
		if(contactDetails.getLastName()!=null) newAutoRepairShop.enterLastname(DriverManager.getDriver(), contactDetails.getLastName());
		if(contactDetails.getName()!=null) newAutoRepairShop.enterName(DriverManager.getDriver(),contactDetails.getName());
		if(contactDetails.getAddress()!=null)newAutoRepairShop.enterAddress1(DriverManager.getDriver(),contactDetails.getAddress());
		if(contactDetails.getTaxIdSSN()!=null) newAutoRepairShop.enterSSN(DriverManager.getDriver(),contactDetails.getTaxIdSSN());
		if(contactDetails.getTaxId()!=null) newAutoRepairShop.enterTaxIDEIN(DriverManager.getDriver(),contactDetails.getTaxId());
		if(contactDetails.getCity()!=null) newAutoRepairShop.enterCity(DriverManager.getDriver(),contactDetails.getCity());
		if(contactDetails.getState()!=null) newAutoRepairShop.selectState(DriverManager.getDriver(),contactDetails.getState());
		if(contactDetails.getRoles()!=null) {
			newAutoRepairShop.clickAdd(DriverManager.getDriver());
			newAutoRepairShop.selectRoles(DriverManager.getDriver(), contactDetails.getRoles());
		}
		newAutoRepairShop.clickUpdate(DriverManager.getDriver());
	}

	@Override
	public void paymentChecks(PaymentOptions paymentOptions) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());			
		switch(paymentOptions.getPaymentType()) {
		case RECOVERY:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver());
			actionsPage.clickRecovery(DriverManager.getDriver());
			new CreateRecoveryPage(DriverManager.getDriver())
			.selectPayer(DriverManager.getDriver())
			.selectReserveLine(DriverManager.getDriver(),paymentOptions.getReserveLine())
			.selectRecoveryCategory(DriverManager.getDriver(), paymentOptions.getRecoveryCategory())
			.enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectCostCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.clickUpdate(DriverManager.getDriver());
			break;

		case CHECK:
			actionsPage.clickActions(DriverManager.getDriver())
			.clickCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).selectName(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).selectReserveLine(DriverManager.getDriver())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectPaymentType(DriverManager.getDriver(), paymentOptions.getPayment()).
			enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;

		case MANUAL_CHECK:
			actionsPage.clickActions(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver())
			.moveToOther(DriverManager.getDriver());
			actionsPage.clickManualCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).selectName(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).selectReserveLine(DriverManager.getDriver(),paymentOptions.getReserveLine())
			.selectCostType(DriverManager.getDriver(), paymentOptions.getCostType())
			.selectCategory(DriverManager.getDriver(), paymentOptions.getCostCategory())
			.selectPaymentType(DriverManager.getDriver(), paymentOptions.getPayment()).
			enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;
		case MET_CHECK:
			actionsPage.clickSummary(DriverManager.getDriver());
			new FinancialsSummaryPage(DriverManager.getDriver()).clickFinancialMenuIcon(DriverManager.getDriver())
			.clickCreateCheck(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).enterAmount(DriverManager.getDriver(), paymentOptions.getAmount())
			.clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			FinancialsChecksPage financialsChecksPage = new FinancialsChecksPage(DriverManager.getDriver())
					.verifyStatus(DriverManager.getDriver(),paymentOptions.getBeforeRunStatus());
			new BatchProcessInfoPage(DriverManager.getDriver()).clickGotoBatchProcess(DriverManager.getDriver())
			.clickRunBatchInfo(DriverManager.getDriver(), paymentOptions.getBatchName());
			actionsPage.clickActions(DriverManager.getDriver()).clickReturnToClaimCenter(DriverManager.getDriver())
			.clickClaimToggleMenu(DriverManager.getDriver()).enterClaimNumber(DriverManager.getDriver(),paymentOptions.getClaimNumber())
			.clickSearchClaim(DriverManager.getDriver());
			actionsPage.clickFinancialsSubMenu(DriverManager.getDriver()).clickFinancialsChecks(DriverManager.getDriver());
			financialsChecksPage.verifyStatus(DriverManager.getDriver(),paymentOptions.getAfterRunStatus());
			break;
		case TRANSFER_CHECK:
			actionsPage.clickWorkPlan(DriverManager.getDriver());
			new WorkplanPage(DriverManager.getDriver()).clickCheckBoxWorkplan(DriverManager.getDriver()).clickComplete(DriverManager.getDriver());
			actionsPage.clickFinancialsChecks(DriverManager.getDriver());
			new FinancialsChecksPage(DriverManager.getDriver()).clickAmount(DriverManager.getDriver());
			new CheckDetailsPage(DriverManager.getDriver()).clickTransfer(DriverManager.getDriver());
			TransferCheckPage transferCheckPage = new TransferCheckPage(DriverManager.getDriver()).clickSearch(DriverManager.getDriver());
			new SearchClaimsPage(DriverManager.getDriver()).enterClaim(DriverManager.getDriver(), paymentOptions.getClaimNumber())
			.clickSearch(DriverManager.getDriver()).clickSelect(DriverManager.getDriver());
			transferCheckPage.clickTransfer(DriverManager.getDriver());
			break;

		case CLONE_CHECK:
			actionsPage.clickFinancialsChecks(DriverManager.getDriver());
			new FinancialsChecksPage(DriverManager.getDriver()).clickAmount(DriverManager.getDriver());
			new CheckDetailsPage(DriverManager.getDriver()).clickClone(DriverManager.getDriver());
			new EnterPayeeInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new EnterPaymentInformationPage(DriverManager.getDriver()).clickNext(DriverManager.getDriver());
			new SetCheckInstructionsPage(DriverManager.getDriver()).clickFinish(DriverManager.getDriver());
			break;

		}
	}

	@Override
	public String searchClaim(SearchClaim searchClaim) {
		new ActionsPage(DriverManager.getDriver())
		.clickClaimToggleMenu(DriverManager.getDriver())
		.enterClaimNumber(DriverManager.getDriver(), searchClaim.getClaimNo())
		.clickSearchClaim(DriverManager.getDriver());

		String result = new HeaderPage(DriverManager.getDriver())
				.getInsureName(DriverManager.getDriver());
		String[] split = result.split(":\n");
		String insuredName = split[1].trim();
		return insuredName;
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
		new HeaderPage(DriverManager.getDriver())
		.clickAdministrationbutton(DriverManager.getDriver())
		.clickToggleMonitoringSubmenu(DriverManager.getDriver()).clickMessageQueue(DriverManager.getDriver());
		//Resume the suspended queues
		MessageQueuesPage messageQueuesPage = new MessageQueuesPage(DriverManager.getDriver()).get();
		messageQueuesPage.validateAndUpdateMessageQueueStatusAsStarted(DriverManager.getDriver());
		//Restart Messaging Engine
		if(messageQueue.isRestartMessageQueue()) {
			new MessageQueuesPage(DriverManager.getDriver())
			.clickAllMessageQueueDestination(DriverManager.getDriver())
			.clickRestartMessagingEngine(DriverManager.getDriver());
			Log.messageStep("Restarted Message Engine service", DriverManager.getDriver(), true);
		}

	}
}