package com.aspire.guidewire.cc.teststeps.commercialpackage;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class CommercialPackageDataEngine {

	HashMap<String,String> data;
	
	private String lossDate;
	
	private String state;

	private String city;

	private String damageDescription;
	
	private String claimantType;

	private String lossOccurred;

	private String lossCause;

	private String reserveLine;

	private String costType;

	private String costCategory;

	private String recoveryCategory;

	private String amount;

	private String service;

	private String requestType;

	private String taxID;

	private String noteText;

	private String documentType;
	
	private String documentName;

	private String status;

	private String dataMessage;

	private String outcome;

	private String closedStatus;
	
	private String faultRating; 
	
	private String byCoverageType; 
	
	private String lossParty; 
	
	private String reopenReason; 
	
	private String reOpenStatus; 
	
	private String country;

	private String reserveCostCategory;

	private String paymentType;
	
	private String policyNumber;
	
	private String claimNumber;

	public CommercialPackageDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.state=setState();
		this.city=setCity();
		this.lossDate=setLossDate();
		this.damageDescription=setDamageDescription();
		this.claimantType=setClaimantType();
		this.lossCause=setLossCause();
		this.reserveLine=setReserveLine();
		this.costType=setCostType();
		this.costCategory=setCostCategory();
		this.recoveryCategory=setRecoveryCategory();
		this.amount=setAmount();
		this.service=setService();
		this.requestType=setRequestType();
		this.taxID=setTaxID();
		this.noteText=setNoteText();
		this.documentType=setDocumentType();
		this.documentName=setDocumentName();
		this.status=setStatus();
		this.dataMessage=setDataMessage();
		this.outcome=setOutcome();
		this.closedStatus=setClosedStatus();
		this.faultRating=setFaultRating();
		this.lossParty=setLossParty();
		this.byCoverageType=setByCoverageType();
		this.reopenReason=setReopenReason();
		this.reOpenStatus=setReOpenStatus();
		this.country=setCountry();
		this.reserveCostCategory=setReserveCostCategory();
		this.paymentType=setPaymentType();
		this.policyNumber=setPolicyNumber();
		this.claimNumber=setClaimNumber();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length()==0 ? DataFakers.state() :
			data.get("STATE").trim();
	}

	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length()==0? DataFakers.city() :
			data.get("CITY").trim();
	}
	
	public String setLossDate() {
		return lossDate=data.get("LOSS_DATE").trim().equals("X") || data.get("LOSS_DATE").trim().length()==0 ? DataFakers.currentDate() :
			data.get("LOSS_DATE").trim();
	}

	public String setDamageDescription() {
		return damageDescription=data.get("DAMAGE_DESCRIPTION").trim().equals("X") || data.get("DAMAGE_DESCRIPTION").trim().length()==0 ? DataFakers.generateRandomString("Damage") :
			data.get("DAMAGE_DESCRIPTION").trim();
	}

	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") || data.get("CLAIMANT_TYPE").trim().length()==0 ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}

	public String setLossCause() {
		return lossCause=data.get("LOSS_CAUSE").trim().equals("X") || data.get("LOSS_CAUSE").trim().length()==0 ? DataFakers.lossCause() :
			data.get("LOSS_CAUSE").trim();
	}


	public String setReserveLine() {
		return reserveLine=data.get("RESERVE_LINE").trim().equals("X") || data.get("RESERVE_LINE").trim().length()==0? DataFakers.reserveLine() :
			data.get("RESERVE_LINE").trim();
	}

	public String setCostType() {
		return costType=data.get("COST_TYPE").trim().equals("X") || data.get("COST_TYPE").trim().length()==0 ? DataFakers.costType() :
			data.get("COST_TYPE").trim();
	}

	public String setCostCategory() {
		return costCategory=data.get("COST_CATEGORY").trim().equals("X") || data.get("COST_CATEGORY").trim().length()==0 ? DataFakers.costCategory() :
			data.get("COST_CATEGORY").trim();
	}

	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") || data.get("RECOVERY_CATEGORY").trim().length()==0 ? DataFakers.recoveryCategory() :
			data.get("RECOVERY_CATEGORY").trim();
	}

	public String setAmount() {
		return amount=data.get("AMOUNT").trim().equals("X") || data.get("AMOUNT").trim().length()==0 ? DataFakers.amount() :
			data.get("AMOUNT").trim();
	}

	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") || data.get("SERVICE").trim().length()==0 ? DataFakers.service() :
			data.get("SERVICE").trim();
	}

	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") || data.get("REQUEST_TYPE").trim().length()==0 ? DataFakers.requestType() :
			data.get("REQUEST_TYPE").trim();
	}

	public String setTaxID() {
		return taxID=data.get("TAX_ID").trim().equals("X") || data.get("TAX_ID").trim().length()==0? DataFakers.taxID() :
			data.get("TAX_ID").trim();
	}

	public String setNoteText() {
		return noteText=data.get("NOTE_TEXT").trim().equals("X") || data.get("NOTE_TEXT").trim().length()==0 ? DataFakers.generateRandomString("NoteText ") :
			data.get("NOTE_TEXT").trim();
	}

	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X") || data.get("DOCUMENT_TYPE").trim().length()==0 ? DataFakers.documentType() :
			data.get("DOCUMENT_TYPE").trim();
	}
	
	public String setDocumentName() {
		return documentName=data.get("DOCUMENT_NAME").trim().equals("X") || data.get("DOCUMENT_NAME").trim().length()==0 ? DataFakers.documentName() :
			data.get("DOCUMENT_NAME").trim();
	}

	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") || data.get("STATUS").trim().length()==0 ? DataFakers.status() :
			data.get("STATUS").trim();
	}

	public String setDataMessage() {
		return dataMessage=data.get("DATA_MESSAGE").trim().equals("X") || data.get("DATA_MESSAGE").trim().length()==0 ? DataFakers.dataMessage() :
			data.get("DATA_MESSAGE").trim();
	}

	public String setOutcome() {
		return outcome=data.get("OUTCOME").trim().equals("X") || data.get("OUTCOME").trim().length()==0? DataFakers.outcome() :
			data.get("OUTCOME").trim();
	}

	public String setClosedStatus() {
		return closedStatus=data.get("CLOSE_STATUS").trim().equals("X") || data.get("CLOSE_STATUS").trim().length()==0 ? DataFakers.closeStatus() :
			data.get("CLOSE_STATUS").trim();
	}
	
	public String setFaultRating() {
		return faultRating=data.get("FAULT_RATING").trim().equals("X") || data.get("FAULT_RATING").trim().length()==0 ? DataFakers.faultRating() :
			data.get("FAULT_RATING").trim();
	}
	
	public String setByCoverageType() {
		return byCoverageType=data.get("BY_COVERAGE_TYPE").trim().equals("X") || data.get("BY_COVERAGE_TYPE").trim().length()==0 ? DataFakers.byCoverageType() :
			data.get("BY_COVERAGE_TYPE").trim();
	}
	
	public String setLossParty() {
		return lossParty=data.get("LOSS_PARTY").trim().equals("X") || data.get("LOSS_PARTY").trim().length()==0 ? DataFakers.lossParty() :
			data.get("LOSS_PARTY").trim();
	}
	
	public String setReopenReason() {
		return reopenReason=data.get("REOPEN_REASON").trim().equals("X") || data.get("REOPEN_REASON").trim().length()==0 ? DataFakers.reopenReason() :
			data.get("REOPEN_REASON").trim();
	}
	
	public String setReOpenStatus() {
		return reOpenStatus=data.get("REOPEN_STATUS").trim().equals("X") || data.get("REOPEN_STATUS").trim().length()==0 ? DataFakers.reopenStatus() :
			data.get("REOPEN_STATUS").trim();
	}
	

	public String setCountry() {
		return country=data.get("COUNTRY").trim().equals("X") || data.get("COUNTRY").trim().length()==0 ? DataFakers.country() :
			data.get("COUNTRY").trim();
	}

	public String setReserveCostCategory() {
		return reserveCostCategory=data.get("RESERVE_COST_CATEGORY").trim().equals("X") || data.get("RESERVE_COST_CATEGORY").trim().length()==0 ? DataFakers.reserveCostCategory() :
			data.get("RESERVE_COST_CATEGORY").trim();
	}

	public String setPaymentType() {
		return paymentType=data.get("PAYMENT_TYPE").trim().equals("X") || data.get("PAYMENT_TYPE").trim().length()==0 ? DataFakers.paymentType() :
			data.get("PAYMENT_TYPE").trim();
	}
	
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}
	
}