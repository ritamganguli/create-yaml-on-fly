package com.aspire.guidewire.cc.teststeps.inlandmarine;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;

import lombok.Getter;


@Getter
public class InlandMarineDataEngine {

	HashMap<String,String> data;

	private String state;

	private String city;

	private String damageDescription;

	private String propertyDescription;

	private String propertyName;

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

	private String noteText;

	private String documentType;

	private String status;

	private String country;

	private String coverageType;

	private String coverageByType;

	private String reserveCostCategory;

	private String paymentType;

	private String dataMessage;

	private String outcome;

	private String closedStatus;
	
	private String faultRating;
	
	private String policyNumber ;
	
	private String claimNumber;
	
	private String firstName;

	private String lastName;

	private String address;
	
	private String taxId;



	public InlandMarineDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.state=setState();
		this.city=setCity();
		this.damageDescription=setDamageDescription();
		this.propertyDescription=setPropertyDescription();
		this.propertyName=setPropertyName();
		this.claimantType=setClaimantType();
		this.lossOccurred=setLossOccurred();
		this.lossCause=setLossCause();
		this.reserveLine=setReserveLine();
		this.costType=setCostType();
		this.costCategory=setCostCategory();
		this.recoveryCategory=setRecoveryCategory();
		this.amount=setAmount();
		this.service=setService();
		this.requestType=setRequestType();
		this.noteText=setNoteText();
		this.documentType=setDocumentType();
		this.status=setStatus();
		this.country=setCountry();
		this.coverageType=setCoverageType();
		this.coverageByType=setCoverageByType();
		this.reserveCostCategory=setReserveCostCategory();
		this.paymentType=setPaymentType();
		this.dataMessage=setDataMessage();
		this.outcome=setOutcome();
		this.closedStatus=setClosedStatus();
		this.faultRating=setFaultRating();
		this.policyNumber =setPolicyNumber();
		this.claimNumber=setClaimNumber();
		this.address=setAddress();
		this.taxId=setTaxId();
		this.firstName=setFirstName();
		this.lastName=setLastName();


	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length()==0 ? DataFakers.state() :
			data.get("STATE").trim();
	}

	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length()==0? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setDamageDescription() {
		return damageDescription=data.get("DAMAGE_DESCRIPTION").trim().equals("X") || data.get("DAMAGE_DESCRIPTION").trim().length()==0 ? DataFakers.generateRandomString("Damage") :
			data.get("DAMAGE_DESCRIPTION").trim();
	}

	public String setPropertyDescription() {
		return propertyDescription=data.get("PROPERTY_DESCRIPTION").trim().equals("X") || data.get("PROPERTY_DESCRIPTION").trim().length()==0 ? DataFakers.generateRandomString("Property") :
			data.get("PROPERTY_DESCRIPTION").trim();
	}

	public String setPropertyName() {
		return propertyName=data.get("PROPERTY_NAME").trim().equals("X") || data.get("PROPERTY_NAME").trim().length()==0 ? DataFakers.propertyName() :
			data.get("PROPERTY_NAME").trim();
	}

	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") || data.get("CLAIMANT_TYPE").trim().length()==0 ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}

	public String setLossOccurred() {
		return lossOccurred=data.get("LOSS_OCCURRED").trim().equals("X") || data.get("LOSS_OCCURRED").trim().length()==0 ? DataFakers.lossOccurred() :
			data.get("LOSS_OCCURRED").trim();
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

	public String setNoteText() {
		return noteText=data.get("NOTE_TEXT").trim().equals("X") || data.get("NOTE_TEXT").trim().length()==0 ? DataFakers.generateRandomString("NoteText ") :
			data.get("NOTE_TEXT").trim();
	}

	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X") || data.get("DOCUMENT_TYPE").trim().length()==0 ? DataFakers.documentType() :
			data.get("DOCUMENT_TYPE").trim();
	}

	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") || data.get("STATUS").trim().length()==0 ? DataFakers.status() :
			data.get("STATUS").trim();
	}

	public String setCountry() {
		return country=data.get("COUNTRY").trim().equals("X") || data.get("COUNTRY").trim().length()==0 ? DataFakers.country() :
			data.get("COUNTRY").trim();
	}

	public String setCoverageType() {
		return coverageType=data.get("COVERAGE_TYPE").trim().equals("X") || data.get("COVERAGE_TYPE").trim().length()==0 ? DataFakers.coverageType() :
			data.get("COVERAGE_TYPE").trim();
	}

	public String setCoverageByType() {
		return coverageByType=data.get("COVERAGE_BY_TYPE").trim().equals("X") || data.get("COVERAGE_BY_TYPE").trim().length()==0? DataFakers.coverageByType() :
			data.get("COVERAGE_BY_TYPE").trim();
	}

	public String setReserveCostCategory() {
		return reserveCostCategory=data.get("RECOVERY_COST_CATEGORY").trim().equals("X") || data.get("RECOVERY_COST_CATEGORY").trim().length()==0 ? DataFakers.reserveCostCategory() :
			data.get("RECOVERY_COST_CATEGORY").trim();
	}

	public String setPaymentType() {
		return paymentType=data.get("PAYMENT_TYPE").trim().equals("X") || data.get("PAYMENT_TYPE").trim().length()==0 ? DataFakers.paymentType() :
			data.get("PAYMENT_TYPE").trim();
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
		return closedStatus=data.get("CLOSE_STATUS").trim().equals("X") || data.get("CLOSE_STATUS").trim().length()==0 ? DataFakers.status() :
			data.get("CLOSE_STATUS").trim();
	}
	
	public String setFaultRating() {
		return faultRating=data.get("FAULT_RATING").trim().equals("X") || data.get("FAULT_RATING").trim().length()==0 ? DataFakers.faultRating() :
			data.get("FAULT_RATING").trim();
	}
	
	public String setPolicyNumber() {
		return policyNumber = data.get("POLICY_NUMBER").trim();
	}
	
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}

	public String setAddress() {
		return address=data.get("ADDRESS").trim().equals("X") ? DataFakers.addressLineOne() :
			data.get("ADDRESS").trim();
	}

	
	public String setTaxId() {
		return taxId=data.get("TAX_ID").trim().equals("X") ? DataFakers.taxID() :
			data.get("TAX_ID").trim();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}
	
	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	}
	