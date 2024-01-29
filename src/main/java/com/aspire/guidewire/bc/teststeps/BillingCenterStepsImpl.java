package com.aspire.guidewire.bc.teststeps;

import com.aspire.guidewire.bc.pages.AccountDisbursementWizardPage;
import com.aspire.guidewire.bc.pages.AccountSummaryPage;
import com.aspire.guidewire.bc.pages.AccountsPage;
import com.aspire.guidewire.bc.pages.ActionsPage;
import com.aspire.guidewire.bc.pages.BatchProcessInfoPage;
import com.aspire.guidewire.bc.pages.DirectBillPaymentPage;
import com.aspire.guidewire.bc.pages.DownloadHistoryPage;
import com.aspire.guidewire.bc.pages.HeaderPage;
import com.aspire.guidewire.bc.pages.MessageQueuesPage;
import com.aspire.guidewire.bc.pages.NewPaymentInstrumentPage;
import com.aspire.guidewire.bc.pages.PaymentRequestWizardPage;
import com.aspire.guidewire.bc.pages.PolicySummaryPage;
import com.aspire.guidewire.bc.pages.StartDeliquencyPage;
import com.aspire.guidewire.bc.pages.TroubleTicketWizardPage;
import com.aspire.guidewire.bc.pages.TroubleTicketsPage;
import com.aspire.guidewire.bc.pages.UserSearchPage;
import com.aspire.guidewire.bc.pages.WriteOffReversalWizardPage;
import com.aspire.guidewire.bc.pages.WriteOffWizardPage;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.Delinquency;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.DirectBillPayment;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.Disbursment;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.MessageQueue;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.PaymentRequest;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.PolicyNo;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.RunBatchProcess;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.SearchAccount;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.TroubleTicket;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.WriteOff;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.WriteOffReversal;
import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class BillingCenterStepsImpl implements BillingCenterSteps {

	private String bcWebSite;

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
		this.bcWebSite = DriverManager.getBCwebsite();
		LoginPage loginPage = new LoginPage(DriverManager.getDriver(), bcWebSite).get();
		loginPage.enterUsername(DriverManager.getDriver(), username)
		.enterPassword(DriverManager.getDriver(), password)
		.clickLogin(DriverManager.getDriver());
		new UserSearchPage(DriverManager.getDriver()).get();
		Log.messageStep("Logged into the Application",DriverManager.getDriver());
	}
	
	/**
	 * Used to run Batch Process Info  "Invoice" Batch
	 * Click on "Gotobatch Process" button
	 * Click on "Invoice" button
	 */
	@Override
	public void runBatchProcessInfo(RunBatchProcess runBatchProcess) {
		BatchProcessInfoPage batchProcessInfoPage = new BatchProcessInfoPage(DriverManager.getDriver());
		batchProcessInfoPage.clickGotoBatchProcess(DriverManager.getDriver());
		batchProcessInfoPage.clickBatchProcessRunButton(DriverManager.getDriver());
		batchProcessInfoPage.verifyBatchProcessLastRunStatus(DriverManager.getDriver(),runBatchProcess.getBatchProcessName());
		Log.message("Batch Process : Invoice batch ran successfully",DriverManager.getDriver());
		DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(DriverManager.getDriver(),runBatchProcess.getBatchProcessName());
		downloadHistoryPage.enterStartdate(DriverManager.getDriver(), runBatchProcess.getEffectiveDate());
		downloadHistoryPage.enterEnddate(DriverManager.getDriver(), runBatchProcess.getEffectiveDate());
		downloadHistoryPage.clickDownload(DriverManager.getDriver());
		downloadHistoryPage.clickReturntoBatchButton(DriverManager.getDriver());
		Log.message("Batch Process : History downloaded successfully",DriverManager.getDriver());
	}
	
	/**
	 * clicked on "Trouble Ticket"
	 * clicked on "New" button
	 * Select "Trouble Ticket Type" from TroubleTicketType
	 * enter "Details" in Trouble ticket subject
	 * enter "Priority" in Trouble ticket Priority
	 * clicked on "Next" Button
	 * clicked on "Finish" Button
	 */
	@Override
	public void createTroubleTicket(TroubleTicket troubleTicket) {
		new ActionsPage(DriverManager.getDriver()).clickTroubleTicket(DriverManager.getDriver());
		new TroubleTicketsPage(DriverManager.getDriver())
		.clickNew(DriverManager.getDriver());
		TroubleTicketWizardPage troubleTicketWizardPage = new TroubleTicketWizardPage(DriverManager.getDriver())
		.selectType(DriverManager.getDriver(), troubleTicket.getTroubleTicketType())
		.enterSubject(DriverManager.getDriver(), troubleTicket.getTroubleTicketSubject())
		.enterDetails(DriverManager.getDriver(), troubleTicket.getTroubleTicketDetails())
		.selectPriority(DriverManager.getDriver(), troubleTicket.getTroubleTicketPriority())
		.clickNext(DriverManager.getDriver())
		.selectAccount(DriverManager.getDriver())
		.clickNext(DriverManager.getDriver());
		Log.messageStep("Trouble ticket type " + troubleTicket.getTroubleTicketType() + " selected",DriverManager.getDriver());
		Log.messageStep("Trouble ticket subject " + troubleTicket.getTroubleTicketSubject() + " entered",DriverManager.getDriver());
		Log.messageStep("Trouble ticket details " + troubleTicket.getTroubleTicketDetails() + " entered",DriverManager.getDriver());
		Log.messageStep("Trouble ticket priority " + troubleTicket.getTroubleTicketPriority() + " selected",DriverManager.getDriver());
		Log.messageStep("Trouble ticket account has been created",DriverManager.getDriver());
		

		if(troubleTicket.getTroubleTicketRealeaseDate()!=null) {
		troubleTicketWizardPage.clickDeliquency(DriverManager.getDriver())
		.enterDeliquencyDate(DriverManager.getDriver(), troubleTicket.getTroubleTicketRealeaseDate());
		Log.messageStep("Deliquency release date " + troubleTicket.getTroubleTicketRealeaseDate() + " entered",DriverManager.getDriver());
		}
		
		if(troubleTicket.getTroubleTicketRealeaseDate()!=null) {
		troubleTicketWizardPage.clickInvoice(DriverManager.getDriver())
		.enterInvoiceDate(DriverManager.getDriver(), troubleTicket.getTroubleTicketRealeaseDate());
		Log.messageStep("Invoice release date " + troubleTicket.getTroubleTicketRealeaseDate() + " entered",DriverManager.getDriver());

		}
		
		if(troubleTicket.getTroubleTicketRealeaseDate()!=null) {
		troubleTicketWizardPage.clickEarnings(DriverManager.getDriver())
		.enterEarningsDate(DriverManager.getDriver(), troubleTicket.getTroubleTicketRealeaseDate());
		Log.messageStep("Earnings release date " + troubleTicket.getTroubleTicketRealeaseDate() + " entered",DriverManager.getDriver());
		}
		
		if(troubleTicket.getTroubleTicketRealeaseDate()!=null) {
		troubleTicketWizardPage.clickPayments(DriverManager.getDriver())
		.enterPaymentsDate(DriverManager.getDriver(), troubleTicket.getTroubleTicketRealeaseDate());
		Log.messageStep("Payment release date " + troubleTicket.getTroubleTicketRealeaseDate() + " entered",DriverManager.getDriver());
	    }
	
	    if(troubleTicket.getTroubleTicketRealeaseDate()!=null) {
	    troubleTicketWizardPage.clickDistribution(DriverManager.getDriver())
		.enterDistributionDate(DriverManager.getDriver(), troubleTicket.getTroubleTicketRealeaseDate());
	    Log.messageStep("Distribution release date " + troubleTicket.getTroubleTicketRealeaseDate() + " entered",DriverManager.getDriver());
	    }
	    
	    if(troubleTicket.getTroubleTicketRealeaseDate()!=null) {
	    troubleTicketWizardPage.clickDisbursements(DriverManager.getDriver())
		.enterDisbursementsDate(DriverManager.getDriver(), troubleTicket.getTroubleTicketRealeaseDate());
	    Log.messageStep("Disbursement release date " + troubleTicket.getTroubleTicketRealeaseDate() + " entered",DriverManager.getDriver());
	    }
		
	    troubleTicketWizardPage.clickNext(DriverManager.getDriver())
		.clickAddTransaction(DriverManager.getDriver())
		.selectchkTransaction(DriverManager.getDriver())
		.selectTransaction(DriverManager.getDriver());
		Log.messageStep("Transaction has been added",DriverManager.getDriver());
	    troubleTicketWizardPage.clickNext(DriverManager.getDriver())
		.clickFinish(DriverManager.getDriver());
		Log.messageStep("Trouble ticket has been created",DriverManager.getDriver());
	}
	
	/**
	 * Clicked on Action button
	 * Move to new Transaction
	 * clicked on "writeoff"
	 * clicked on "select"
	 * clicked on "next"
	 * select "charge pattern"
	 * enter "amount"
	 * enter "reason"
	 */
	@Override
	public void writeOff(WriteOff writeOff) {
		new ActionsPage(DriverManager.getDriver()).clickAction(DriverManager.getDriver())
		.moveToNewTransaction(DriverManager.getDriver())
		.clickWriteOff(DriverManager.getDriver());
		WriteOffWizardPage writeOffWizardPage = new WriteOffWizardPage(DriverManager.getDriver())
		.clickSelect(DriverManager.getDriver())
		.clickNext(DriverManager.getDriver());
		
		if( writeOff.getChargePattern()!=null) {
		writeOffWizardPage.selectChargePattern(DriverManager.getDriver(), writeOff.getChargePattern());
		Log.messageStep("Charge Pattern " + writeOff.getChargePattern() + " selected",DriverManager.getDriver());
		}
		
		if( writeOff.getWriteoffAmount()!=null){
		writeOffWizardPage.clickAllCheckbox(DriverManager.getDriver());
		writeOffWizardPage.enterAmount(DriverManager.getDriver(), writeOff.getWriteoffAmount());
		Log.messageStep("Write-off amount " + writeOff.getWriteoffAmount() + " entered",DriverManager.getDriver());
		}
		
		if( writeOff.getReason()!=null) {
		writeOffWizardPage.selectReason(DriverManager.getDriver(), writeOff.getReason());
		Log.messageStep("Write-off Reason " + writeOff.getReason() + " selected",DriverManager.getDriver());
		}
		
		writeOffWizardPage.clickNext(DriverManager.getDriver())
		.clickFinish(DriverManager.getDriver());
		 Log.messageStep("Writeoff Processed",DriverManager.getDriver());
		
	}
	
	/**
	 * Clicked on Action button
	 * Move to new Transaction
	 * clicked on "negative writeoff"
	 * clicked on "next"
	 * enter "Unapplied Fund"
	 * enter "Amount"
	 */
	@Override
	public void writeOffReversal(WriteOffReversal writeoffReversal) {
		new ActionsPage(DriverManager.getDriver())
		.clickAction(DriverManager.getDriver())
		.moveToNewTransaction(DriverManager.getDriver())
		.clickWriteOffReversal(DriverManager.getDriver());
		WriteOffReversalWizardPage writeOffReversal=  new WriteOffReversalWizardPage(DriverManager.getDriver());
				
		if(writeoffReversal.getReason()!=null) {
			writeOffReversal.selectReason(DriverManager.getDriver(),writeoffReversal.getReason());
			Log.messageStep("Write-off Reversal Reason " + writeoffReversal.getReason() + " selected",DriverManager.getDriver());
		}
		
		if(writeoffReversal.getMinimumAmount()!=null) {
			writeOffReversal.enterMinimumAmount(DriverManager.getDriver(), writeoffReversal.getMinimumAmount());
			Log.messageStep("Write-off Reversal minimum amount " + writeoffReversal.getMinimumAmount() + " entered to search",DriverManager.getDriver());
		}
        
        if(writeoffReversal.getMaximumAmount()!=null) {
        	writeOffReversal.enterMaximumAmount(DriverManager.getDriver(), writeoffReversal.getMaximumAmount());
        	Log.messageStep("Write-off Reversal maximum amount " + writeoffReversal.getMaximumAmount() + " entered to search",DriverManager.getDriver());
        }
        
        if(writeoffReversal.getEarliestDate()!=null) {
        	writeOffReversal .enterEarliestDate(DriverManager.getDriver(), writeoffReversal.getEarliestDate());
        	Log.messageStep("Earliest date " + writeoffReversal.getEarliestDate() + " entered",DriverManager.getDriver());
        	
        }
        
        if(writeoffReversal.getLatestDate()!=null) {
        	writeOffReversal.enterLatestDate(DriverManager.getDriver(), writeoffReversal.getLatestDate());
        	Log.messageStep("Latest date " + writeoffReversal.getLatestDate() + " entered",DriverManager.getDriver());
        }
        
        if(writeoffReversal.getChargePattern()!=null) {
        	writeOffReversal.selectChargePattern(DriverManager.getDriver(), writeoffReversal.getChargePattern());
        	Log.messageStep("Charge Pattern  " + writeoffReversal.getChargePattern() + " selected",DriverManager.getDriver());
        }
        
        writeOffReversal.clickSearch(DriverManager.getDriver())
        .clickSelect(DriverManager.getDriver());
        
        if(writeoffReversal.getReasonWriteOffReversal()!=null) {
        	writeOffReversal.selectReasonWriteOffReversal(DriverManager.getDriver(), writeoffReversal.getReasonWriteOffReversal());
        	Log.messageStep("Write-off Reversal reason  " + writeoffReversal.getReasonWriteOffReversal() + " selected",DriverManager.getDriver());
        }
        
        writeOffReversal.clickFinish(DriverManager.getDriver());
        Log.messageStep("Writeoff Reversal Processed",DriverManager.getDriver());
        }
	

	/**
	 * Click "Account" in Headerpage
	 * Enters "Account Number" in the Account Number field
	 * clicks on Search
	 * Select the Account
	 * @param accountNumber
	 * @return Account Summary
	 */
	@Override
	public void searchAccount(SearchAccount searchAccount) {
		HeaderPage headerpage = new HeaderPage(DriverManager.getDriver()).get();
		headerpage.clickAccount(DriverManager.getDriver());
		AccountsPage accountsPage = new AccountsPage(DriverManager.getDriver());
		accountsPage.enterAccount(DriverManager.getDriver(), searchAccount.getAccountNumber())
		.clickSearch_1(DriverManager.getDriver())
		.clickAccount(DriverManager.getDriver());
		new AccountSummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Account Number: " + searchAccount.getAccountNumber() + " selected" , DriverManager.getDriver());
	}

	/**
	 * Enters New Direct Bill Payment
	 * select "New Direct Bill Payment" from Actions
	 * Enter "Amount"
	 * Select "Unapplied Fund"
	 * Select "Payment Instrument"
	 * @param Amount
	 * @param Unapplied fund
	 * @param Payment Instrument
	 * @return Account Summary
	 */
	@Override
	public void enterNewDirectBillPayment(DirectBillPayment directbillpayment) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());
		actionsPage.clickAction(DriverManager.getDriver())
		.moveToNewPayments(DriverManager.getDriver())
		.clickNewDirectBillPayment(DriverManager.getDriver());
		DirectBillPaymentPage directBillPaymentPage = new DirectBillPaymentPage(DriverManager.getDriver());


		if(directbillpayment.getPaymentInstrument()!=null) {
			directBillPaymentPage.clickNew(DriverManager.getDriver());
			 new NewPaymentInstrumentPage(DriverManager.getDriver())
			.selectPaymentMethod(DriverManager.getDriver(), directbillpayment.getPaymentInstrument())
			.clickOK(DriverManager.getDriver());
			 Log.messageStep("Payment method: " + directbillpayment.getPaymentInstrument() + " selected",DriverManager.getDriver());
		}
		
		if(directbillpayment.getUnappliedFund()!=null) {
			new DirectBillPaymentPage(DriverManager.getDriver()).get();
		directBillPaymentPage.selectUnappliedFund(DriverManager.getDriver(),directbillpayment.getUnappliedFund());
		Log.messageStep("Unappliedfund: " + directbillpayment.getUnappliedFund() + " selected",DriverManager.getDriver());
		}
		directBillPaymentPage.enterAmount(DriverManager.getDriver(),directbillpayment.getAmount());
		Log.messageStep("Payment amount  " + directbillpayment.getAmount() + " entered",DriverManager.getDriver());
		directBillPaymentPage.clickExecuteWithoutDistribution(DriverManager.getDriver());
		new AccountSummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("New Direct Bill Payment Processed",DriverManager.getDriver());
	}

	/**
	 * Enters Disbursement
	 * select "Disbursement" from Actions
	 * Enter "Amount"
	 * Enter "Payment Date"
	 * Select "Reason"
	 * @param Amount
	 * @param Date
	 * @param Reason
	 * @return Account Summary
	 */
	@Override
	public void enterDisbursment(Disbursment disbursment) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver()).get();
		actionsPage.clickAction(DriverManager.getDriver())
		.moveToNewTransaction(DriverManager.getDriver())
		.clickDisbursements(DriverManager.getDriver());
		AccountDisbursementWizardPage accountDisbursementWizardPage = new AccountDisbursementWizardPage(DriverManager.getDriver()).get();
		Log.messageStep("Clicked on Disbursement",DriverManager.getDriver());

		if(disbursment.getUnappliedFund()!=null) {
			accountDisbursementWizardPage.selectUnappliedFund(DriverManager.getDriver(),disbursment.getUnappliedFund());
			Log.messageStep("Unappliedfund  " + disbursment.getUnappliedFund() + " selected",DriverManager.getDriver());
		}

		accountDisbursementWizardPage.enterAmount(DriverManager.getDriver(),disbursment.getAmount())
		.enterPaymentDate(DriverManager.getDriver(),disbursment.getDate())
		.selectReason(DriverManager.getDriver(),disbursment.getReason())
		.clickNext(DriverManager.getDriver())
		.clickFinish(DriverManager.getDriver());
		
		Log.messageStep("Disbursement amount  " + disbursment.getAmount()+ " entered",DriverManager.getDriver());
		Log.messageStep("Disbursement date  " + disbursment.getDate()+ " entered",DriverManager.getDriver());
		Log.messageStep("Disbursement reason  " + disbursment.getReason()+ " selected",DriverManager.getDriver());
		
		new AccountSummaryPage(DriverManager.getDriver()).get();
		
		Log.messageStep("Disbursment has been Processed",DriverManager.getDriver());
	}

	/**
	 * Enters Payment Request
	 * select "Payment Request" from Actions
	 * Enter Amount
	 * Enter draft Date
	 * Select Payment Instrument
	 * @param Amount
	 * @param Date
	 * @param Payment Instrument
	 * @return Account Summary
	 */
	@Override
	public void enterPaymentRequest(PaymentRequest paymentrequest) {
		ActionsPage actionsPage = new ActionsPage(DriverManager.getDriver());
		actionsPage.clickAction(DriverManager.getDriver())
		.moveToNewPayments(DriverManager.getDriver())
		.clickPaymentRequest(DriverManager.getDriver());
		Log.messageStep("Clicked on Payment Request",DriverManager.getDriver());
		PaymentRequestWizardPage paymentRequestPage = new PaymentRequestWizardPage(DriverManager.getDriver()).get();
			paymentRequestPage.enterAmount(DriverManager.getDriver(), paymentrequest.getAmount());
			Log.messageStep("Payment request amount " + paymentrequest.getAmount()+ " entered",DriverManager.getDriver());
		
		if(paymentrequest.getDraftDate()!=null) {
			paymentRequestPage.enterDraftDate(DriverManager.getDriver(),paymentrequest.getDraftDate());
			Log.messageStep("Payment request date " + paymentrequest.getDraftDate()+ " entered",DriverManager.getDriver());
		}

		if(paymentrequest.getPaymentMethod()!=null) {
			paymentRequestPage.clickNew(DriverManager.getDriver());
			NewPaymentInstrumentPage  newPaymentInstrumentPage = new NewPaymentInstrumentPage(DriverManager.getDriver()).get();
			newPaymentInstrumentPage.selectPaymentMethod(DriverManager.getDriver(), paymentrequest.getPaymentMethod());
			newPaymentInstrumentPage.clickOK(DriverManager.getDriver());
			Log.messageStep("Payment method:  " + paymentrequest.getPaymentMethod()+ " selected",DriverManager.getDriver());
			}

		paymentRequestPage.clickNext(DriverManager.getDriver())
		.clickFinish(DriverManager.getDriver());
		new AccountSummaryPage(DriverManager.getDriver()).get();
		Log.messageStep("Payment Request has been Processed",DriverManager.getDriver());
	}

	/**
	 * Search the Policy created from PC
	 * Click on Policy tab
	 * Enter "Policy No" in Policy No field
	 * Click on "Search" 
	 * Click on the Policy
	 * @param policyNo
	 */
	@Override
	public void searchPolicy(PolicyNo policyNo) {
		HeaderPage headerpage = new HeaderPage(DriverManager.getDriver()).get();
		headerpage.clickPolicyTab(DriverManager.getDriver())
		.enterPolicyNo(DriverManager.getDriver(),policyNo.getPolicyNo())
		.clickSearchPolicy(DriverManager.getDriver())
		.clickPolicy(DriverManager.getDriver(),policyNo.getPolicyNo());
	}
	
	/**
	 * Start Delinquency
	 * Select "Start Delinquency" from Account Summary Page
	 * Select Reason
	 * Select Targeted Policy
	 * @param delinquency
	 * @return Account Summary
	 */
	@Override
	public void startDelinquency(Delinquency delinquency) {

		PolicySummaryPage policySummaryPage = new PolicySummaryPage(DriverManager.getDriver()).get();
		policySummaryPage.clickStartDelinquency(DriverManager.getDriver());
		Log.messageStep("Clicked on Start Delinquency",DriverManager.getDriver());
		StartDeliquencyPage startDeliquencyPage = new StartDeliquencyPage(DriverManager.getDriver());

		if(delinquency.getReason()!=null) {
			startDeliquencyPage.selectReason(DriverManager.getDriver(), delinquency.getReason());
			Log.messageStep("Delinquncy reason :  " + delinquency.getReason()+ " selected",DriverManager.getDriver());
			}
        
		startDeliquencyPage = new StartDeliquencyPage(DriverManager.getDriver(), 2);
		startDeliquencyPage.selectSearchedPolicy(DriverManager.getDriver(), delinquency.getPolicyNo());
		startDeliquencyPage = new StartDeliquencyPage(DriverManager.getDriver());
		startDeliquencyPage.clickExecute(DriverManager.getDriver());
		new PolicySummaryPage(DriverManager.getDriver()).get()
		.clickDeliquency(DriverManager.getDriver());
		Log.messageStep("Delinquency has been Processed",DriverManager.getDriver());
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
		.clickAdministrationSubMenu(DriverManager.getDriver())
		.clickAdministrationMonitoring(DriverManager.getDriver())
		.clickMonitoringMessageQueues(DriverManager.getDriver());	
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
