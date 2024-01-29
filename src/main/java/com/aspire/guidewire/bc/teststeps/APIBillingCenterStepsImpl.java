package com.aspire.guidewire.bc.teststeps;

import com.aspire.guidewire.api.utils.BCAPIUtils;
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
import com.aspire.guidewire.utils.Log;

import io.restassured.response.Response;

public class APIBillingCenterStepsImpl implements BillingCenterSteps {

	@Override
	public void loginIntoTheApplication(String username, String password) {

		/* Invoke application */

		Response invokeAppResponse = BCAPIUtils.sendGetRequest();
		BCAPIUtils.setCSRFToken(invokeAppResponse);
		BCAPIUtils.setCookieSessionID(invokeAppResponse);

		/* Login to the application */

		String csrfToken = BCAPIUtils.getCSRFToken();
		String cookieSessionID = BCAPIUtils.getCookieSessionID();

		String loginPayload = BCAPIUtils.readFormDataFile("common","1.Login");
		loginPayload = loginPayload.replace("<USERNAME>", username);
		loginPayload = loginPayload.replace("<PASSWORD>", password);
		loginPayload = loginPayload.replace("<CSRF_TOKEN>", csrfToken);
		loginPayload = loginPayload.replace("<FILE_UPLOAD_URL>", BCAPIUtils.getFileUploadURL());

		Response loginResponse = BCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, loginPayload);
		Log.message("Log-in response: "+loginResponse);
		BCAPIUtils.setCSRFToken(loginResponse);
		BCAPIUtils.setCookieSessionID(loginResponse);
	}

	@Override
	public void searchPolicy(PolicyNo searchPolicyNumber) {	

		/* Search on Policy */

		String csrfToken = BCAPIUtils.getCSRFToken();
		String cookieSessionID = BCAPIUtils.getCookieSessionID();

		String searchPolicy = BCAPIUtils.readFormDataFile("common","2.Searchpolicy");
		searchPolicy = searchPolicy.replace("<CSRF_TOKEN>", csrfToken);
		searchPolicy = searchPolicy.replace("<FILE_UPLOAD_URL>", BCAPIUtils.getFileUploadURL());
		searchPolicy = searchPolicy.replace("<POLICY_NUMBER>",searchPolicyNumber.getPolicyNo());
		
		Response policyResponse = BCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, searchPolicy);
		Log.message("Policy response: "+policyResponse);
		BCAPIUtils.setPolicyEffectiveDate(policyResponse);

		/* Search Account */

		String selectAccount = BCAPIUtils.readFormDataFile("common","3.SelectAccount");
		selectAccount = selectAccount.replace("<CSRF_TOKEN>", csrfToken);
		selectAccount = selectAccount.replace("<FILE_UPLOAD_URL>", BCAPIUtils.getFileUploadURL());
		selectAccount = selectAccount.replace("<POLICY_PERIOD>", BCAPIUtils.getPolicyPeriod());
		
		Response selectAccountResponse = BCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, selectAccount);
		Log.message("Select Account response: "+selectAccountResponse);
	}

	public void clickDirectBillPayment(String amount) {
		
		/* Click on Direct Bill Payment */

		String csrfToken = BCAPIUtils.getCSRFToken();
		String cookieSessionID = BCAPIUtils.getCookieSessionID();
		
		String clickBillPayment = BCAPIUtils.readFormDataFile("common","4.ClickDirectBillPayment");
		clickBillPayment = clickBillPayment.replace("<CSRF_TOKEN>", csrfToken);
		clickBillPayment = clickBillPayment.replace("<FILE_UPLOAD_URL>", BCAPIUtils.getFileUploadURL());
		
		Response clickBillPaymentResponse = BCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, clickBillPayment);
		Log.message("Click Bill Payment response: "+clickBillPaymentResponse);
		
		/* Enter Amount Direct Bill Payment */
		
		String newPayment = BCAPIUtils.readFormDataFile("common","5.NewPayment");
		newPayment = newPayment.replace("<CSRF_TOKEN>", csrfToken);
		newPayment = newPayment.replace("<FILE_UPLOAD_URL>", BCAPIUtils.getFileUploadURL());
		newPayment = newPayment.replace("<AMOUNT>", amount);
		Response newPaymentResponse = BCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, newPayment);	
		Log.message("New Payment response: "+newPaymentResponse);
		BCAPIUtils.setUnappliedFund(newPaymentResponse);
	}
	
	public void enterDirectBillPayment(String amount) {

		String csrfToken = BCAPIUtils.getCSRFToken();
		String cookieSessionID = BCAPIUtils.getCookieSessionID();
		String unAppliedFund = BCAPIUtils.getUnappliedFund();

		/* Select on Select Unapplied Fund */

		String unappliedFund = BCAPIUtils.readFormDataFile("common","6.SelectUnappliedFund");
		unappliedFund = unappliedFund.replace("<CSRF_TOKEN>", csrfToken);
		unappliedFund = unappliedFund.replace("<FILE_UPLOAD_URL>", BCAPIUtils.getFileUploadURL());
		unappliedFund = unappliedFund.replace("<UNAPPLIED_FUND>",unAppliedFund );
		unappliedFund = unappliedFund.replace("<AMOUNT>", amount);
		
		Response unAppliedFundResponse = BCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, unappliedFund);
		Log.message("Un Appliedfund response: "+unAppliedFundResponse);
		
		/* click Without Distribution */
		
		String addPayment = BCAPIUtils.readFormDataFile("common","7.AddPayment");
		addPayment = addPayment.replace("<CSRF_TOKEN>", csrfToken);
		addPayment = addPayment.replace("<FILE_UPLOAD_URL>", BCAPIUtils.getFileUploadURL());
		addPayment = addPayment.replace("<UNAPPLIED_FUND>",unAppliedFund );
		addPayment = addPayment.replace("<AMOUNT>", amount);

		Response addPaymentResponse = BCAPIUtils.sendPostRequest(cookieSessionID, csrfToken, addPayment);	
		Log.message("Add  Payment response: "+addPaymentResponse);
		
		/* Clear ThreadLocal values */
		BCAPIUtils.clearThreadLocalValues();

	}

	@Override
	public void runBatchProcessInfo(RunBatchProcess runBatchProcess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createTroubleTicket(TroubleTicket troubleTicket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeOff(WriteOff writeOff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeOffReversal(WriteOffReversal negativeWriteOff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchAccount(SearchAccount searchAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNewDirectBillPayment(DirectBillPayment directbillpayment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDisbursment(Disbursment disbursment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPaymentRequest(PaymentRequest paymentrequest) {
		// TODO Auto-generated method stub
	}

	@Override
	public void startDelinquency(Delinquency delinquency) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void resumeOrRestartMessageQueues(MessageQueue messageQueue) {
		// TODO Auto-generated method stub
	}
	

}
