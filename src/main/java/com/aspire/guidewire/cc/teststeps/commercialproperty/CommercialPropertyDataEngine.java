package com.aspire.guidewire.cc.teststeps.commercialproperty;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;

import lombok.Getter;


@Getter
public class CommercialPropertyDataEngine {

	HashMap<String,String> data;

	private String state;

	private String city;

	private String lossDate;
	
	private String lossCause;
	
	private String claimantType;

	private String damageDescription;

	private String costType;
	
	private String reserveCostCategory;
	
	private String service;

	private String requestType;
	
	private String reserveLine;

	private String costCategory;

	private String recoveryCategory;

	private String paymentType;

	private String jurisdictionState;
	
	private String documentType;
	
	private String emailSubject;

	private String emailBody;

	private String emailAddress;

	private String outcome;
	
	private String closedStatus;

	private String policyNumber;
	
	private String claimNumber;

	private String firstName;

	private String lastName;

	private String address;
	
	private String taxId;

	
	public CommercialPropertyDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.state=setState();
		this.city=setCity();
		this.lossDate=setLossDate();
		this.lossCause=setLossCause();
		this.claimantType=setClaimantType();
		this.damageDescription=setDamageDescription();
		this.lossCause=setLossCause();
		this.service=setService();
		this.costType=setcostType();
		this.requestType=setRequestType();
		this.reserveLine=setReserveLine();
		this.costCategory=setCostCategory();
		this.recoveryCategory=setRecoveryCategory();
		this.reserveCostCategory=setReserveCostCategory();
		this.paymentType=setPaymentType();
		this.documentType=setDocumentType();
		this.jurisdictionState=setJurisdictionState();
		this.emailSubject=setEmailSubject();
		this.emailBody=setEmailBody();
		this.emailAddress=setEmailAddress();
		this.outcome=setOutcome();
		this.closedStatus=setClosedStatus();
		this.policyNumber=setPolicyNumber();
		this.claimNumber=setClaimNumber();
		this.address=setAddress();
		this.taxId=setTaxId();
		this.firstName=setFirstName();
		this.lastName=setLastName();


	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setLossDate() {
		return lossDate=data.get("LOSS_DATE").trim().equals("X") ? DataFakers.currentDate() :
			data.get("LOSS_DATE").trim();
	}
	
	public String setLossCause() {
		return lossCause=data.get("LOSS_CAUSE").trim().equals("X") ? DataFakers.lossCause() :
			data.get("LOSS_CAUSE").trim();
	}
	
	public String setDamageDescription() {
		return damageDescription=data.get("DAMAGE_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("Damage") :
			data.get("DAMAGE_DESCRIPTION").trim();
	}
	
	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}
	
	public String setcostType() {
		return costType=data.get("COST_TYPE").trim().equals("X") ? DataFakers.costType() :
			data.get("COST_TYPE").trim();
}

	public String setReserveCostCategory() {
		return reserveCostCategory=data.get("RESERVE_COST_CATEGORY").trim().equals("X") ? DataFakers.reserveCostCategory() :
			data.get("RESERVE_COST_CATEGORY").trim();
	}

	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") ? DataFakers.service() :
			data.get("SERVICE").trim();
	}

	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") ? DataFakers.requestType() :
			data.get("REQUEST_TYPE").trim();
	}
	
	public String setReserveLine() {
		return reserveLine=data.get("RESERVE_LINE").trim().equals("X") ? DataFakers.reserveLine() :
			data.get("RESERVE_LINE").trim();
	}
	
	public String setCostCategory() {
		return costCategory=data.get("COST_CATEGORY").trim().equals("X") ? DataFakers.costCategory() :
			data.get("COST_CATEGORY").trim();
	}
	
	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") ? DataFakers.recoveryCategory() :
			data.get("RECOVERY_CATEGORY").trim();
	}

	public String setPaymentType() {
		return paymentType=data.get("PAYMENT_TYPE").trim().equals("X") ? DataFakers.paymentType() :
			data.get("PAYMENT_TYPE").trim();
	}
	
	public String setJurisdictionState() {
		return jurisdictionState=data.get("JURISDICTION_STATE").trim().equals("X") ? DataFakers.jurisdictionState() :
			data.get("JURISDICTION_STATE").trim();
	}
	
	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X") ? DataFakers.documentType() :
			data.get("DOCUMENT_TYPE").trim();
	}

	public String setEmailAddress() {
		return emailAddress=data.get("EMAIL_ADDRESS").trim().equals("X") ? DataFakers.generateEmail() :
			data.get("EMAIL_ADDRESS").trim();
	}

	public String setEmailBody() {
		return emailBody=data.get("EMAIL_BODY").trim().equals("X") ? DataFakers.generateRandomLetters() :
			data.get("EMAIL_BODY").trim();
	}
	
	public String setEmailSubject() {
		return emailSubject=data.get("EMAIL_SUBJECT").trim().equals("X") ? DataFakers.generateRandomLetters() :
			data.get("EMAIL_SUBJECT").trim();
	}
	
	public String setOutcome() {
		return outcome=data.get("OUTCOME").trim().equals("X") ? DataFakers.outcome() :
			data.get("OUTCOME").trim();
	}
	public String setClosedStatus() {
		return closedStatus=data.get("CLOSED_STATUS").trim().equals("X") ? DataFakers.closedStatus() :
			data.get("CLOSED_STATUS").trim();
	}
	
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
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