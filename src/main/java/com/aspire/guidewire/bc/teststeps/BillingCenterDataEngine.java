package com.aspire.guidewire.bc.teststeps;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;

import lombok.Getter;


@Getter
public class BillingCenterDataEngine {

	HashMap<String,String> data;
	
	private String accountNumber;
	
	private String draftDate;

	private String amount;
	
	private String paymentMethod;
	
	private String unappliedFund;
	
	private String paymentInstrument;
	
	private String disbursementReason;
	
	private String disbursementAmount;
	
	private String paymentDate;
	
	private String troubleTicketType;
	
	private String troubleTicketSubject;
	
	private String troubleTicketDetails;
	
	private String troubleTicketAssignedTo;
	
	private String troubleTicketPriority;
	
	private String troubleTicketRealeseDate;
	
	private String creditType;
	
	private String writeOffReason;
	
	private String writeOffReversalReason;
	
	private String chargePattern;
	
	private String minimumAmount;
	
	private String writeOffAmount;
	
	private String batchProcessName;
	
	private String effectiveDate;
	
	private String delinquencyReason;
	
	private String category;
	
	private String policyNumber;
	
	private String policyNumberPayment;
	
	public BillingCenterDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.accountNumber=setAccountNumber();
		this.amount=setAmount();
		this.draftDate=setDraftDate();
		this.unappliedFund = setunappliedFund();
		this.paymentMethod = setPaymentMethod();
		this.paymentInstrument=setPaymentInstrument();
		this.disbursementReason =setDisbursementReason();
		this.disbursementAmount =setDisbursementAmount();
		this.paymentDate=setPaymentDate();
		this.troubleTicketType=setTroubleTicketType();
		this.troubleTicketSubject=setTroubleTicketSubject();
		this.troubleTicketDetails=setTroubleTicketDetails();
		this.troubleTicketAssignedTo=setTroubleTicketAssignedTo();
		this.troubleTicketPriority=setTroubleTicketPriority();
		this.troubleTicketRealeseDate= setTroubleTicketRealeseDate();
		this.creditType=setCreditType();
		this.writeOffReason =setWriteOffReason();
		this.writeOffReversalReason=setReversalWriteOffReason();
		this.minimumAmount = setMinimumAmount();
		this.chargePattern = setChargePattern();
		this.writeOffAmount = setWriteOffAmount();
		this.batchProcessName = setBatchProcessName();
		this.effectiveDate = setEffectiveDate();
		this.delinquencyReason = setDelinquencyReason();
		this.category = setCategory();
		this.policyNumber=setPolicyNumber();
		this.policyNumberPayment=setPolicyNumberPayment();
	}
	private String setDraftDate() {
		return draftDate=data.get("DRAFT_DATE").trim().equals("X") ? DataFakers.currentDate():
			data.get("DRAFT_DATE").trim();
	}
	public String setAccountNumber() {
		return accountNumber=data.get("ACCOUNT_NUMBER").trim().equals("X") ? DataFakers.category():
			data.get("ACCOUNT_NUMBER").trim();
	}
	public String setAmount() {
		return amount=data.get("AMOUNT").trim().equals("X") ? DataFakers.amount():
			data.get("AMOUNT").trim();
	}
	public String setPaymentMethod() {
		return paymentMethod=data.get("PAYMENT_METHOD").trim().equals("X") ? DataFakers.paymentMethod():
			data.get("PAYMENT_METHOD").trim();
	}
	private String setunappliedFund() {
		return draftDate=data.get("UNAPPLIED_FUND").trim().equals("X") ? DataFakers.unAppliedFund():
			data.get("UNAPPLIED_FUND").trim();
	}
	public String setPaymentDate() {
		return paymentDate=data.get("PAYMENT_DATE").trim().equals("X") ? DataFakers.currentDate():
			data.get("PAYMENT_DATE").trim();
	}
	public String setPaymentInstrument() {
		return paymentInstrument=data.get("PAYMENT_INSTRUMENT").trim().equals("X") ? DataFakers.paymentInstrument():
			data.get("PAYMENT_INSTRUMENT").trim();
	}
	public String setDisbursementReason() {
		return disbursementReason=data.get("DISBURSEMENT_REASON").trim().equals("X") ? DataFakers.disbursementRaeson():
			data.get("DISBURSEMENT_REASON").trim();
	}
	public String setDisbursementAmount() {
		return disbursementAmount=data.get("DISBURSEMENT_AMOUNT").trim().equals("X") ? DataFakers.disbursementAmount():
			data.get("DISBURSEMENT_AMOUNT").trim();
	}
	public String setTroubleTicketType() {
		return troubleTicketType=data.get("TROUBLE_TICKET_TYPE").trim().equals("X") ? DataFakers.troubleTicketType():
			data.get("TROUBLE_TICKET_TYPE").trim();
	}
	public String setTroubleTicketSubject() {
		return troubleTicketSubject=data.get("SUBJECT").trim().equals("X") ? DataFakers.generateRandomString("Sub:"):
			data.get("SUBJECT").trim();
	}
	public String setTroubleTicketDetails() {
		return troubleTicketDetails=data.get("DETAILS").trim().equals("X") ? DataFakers.generateRandomString("Detail:"):
			data.get("DETAILS").trim();
	}
	public String setTroubleTicketAssignedTo() {
		return troubleTicketAssignedTo=data.get("ASSIGNED_TO").trim().equals("X") ? DataFakers.assignedTo():
			data.get("ASSIGNED_TO").trim();
	}
	public String setTroubleTicketPriority() {
		return troubleTicketPriority=data.get("PRIORITY").trim().equals("X") ? DataFakers.priority():
			data.get("PRIORITY").trim();
	}
	public String setTroubleTicketRealeseDate() {
		return troubleTicketRealeseDate=data.get("RELEASE_DATE").trim().equals("X") ? DataFakers.currentDate():
			data.get("RELEASE_DATE").trim();
	}
	public String setCreditType() {
		return creditType=data.get("CREDIT_TYPE").trim().equals("X") ? DataFakers.creditType():
			data.get("CREDIT_TYPE").trim();
	}
	public String setWriteOffReason() {
		return writeOffReason=data.get("WRITEOFF_REASON").trim().equals("X") ? DataFakers.writeOffReason():
			data.get("WRITEOFF_REASON").trim();
	}
	public String setReversalWriteOffReason() {
		return writeOffReversalReason=data.get("WRITEOFF_REVERSAL_REASON").trim().equals("X") ? DataFakers.writeOffReversalReason():
			data.get("WRITEOFF_REVERSAL_REASON").trim();
	}
	private String setMinimumAmount() {
		return minimumAmount=data.get("MINIMUM_AMOUNT").trim().equals("X") ? DataFakers.minimumAmount():
			data.get("MINIMUM_AMOUNT").trim();
	}
	private String setChargePattern() {
		return chargePattern=data.get("CHARGE_PATTERN").trim().equals("X") ? DataFakers.chargePattern():
			data.get("CHARGE_PATTERN").trim();
	}
	private String setWriteOffAmount() {
		return draftDate=data.get("WRITEOFF_AMOUNT").trim().equals("X") ? DataFakers.writeOffAmount():
			data.get("WRITEOFF_AMOUNT").trim();
	}
	private String setBatchProcessName() {
		return draftDate=data.get("BATCH_PROCESS_NAME").trim().equals("X") ? DataFakers.batchProcessName():
			data.get("BATCH_PROCESS_NAME").trim();
	}
	private String setEffectiveDate() {
		return draftDate=data.get("EFFECTIVE_DATE").trim().equals("X") ? DataFakers.currentDate():
			data.get("EFFECTIVE_DATE").trim();
	}
	private String setDelinquencyReason() {
		return draftDate=data.get("DELINQUENCY_REASON").trim().equals("X") ? DataFakers.delinquencyReason():
			data.get("DELINQUENCY_REASON").trim();
	}
	private String setCategory() {
		return category=data.get("CATEGORY").trim().equals("X") ? DataFakers.category():
			data.get("CATEGORY").trim();
	}
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	public String setPolicyNumberPayment() {
		return policyNumberPayment=data.get("POLICY_PAYMENT").trim();
	}	
	
}