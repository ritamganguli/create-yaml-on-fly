package com.aspire.guidewire.cc.teststeps.businessowners;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class BusinessOwnersDataEngine {

	HashMap<String,String> data;

	private String state;

	private String city;
	
	private String claimantType;
	
	private String lossCause;
	
	private String documentType;

	private String status;

	private String costType;

	private String text;
	
	private String reserveCostCategory;
	
	private String reserveLine;

	private String costCategory;

	private String recoveryCategory;

	private String country;

	private String service;

	private String requestType;

	private String paymentType;
	
	private String outcome;
	
	private String reason;

	private String closedStatus;

	private String openStatus;
	
	private String policyNumber;

	private String claimNumber;
	
	private String firstName;
	
	private String lastName;
	
	private String taxIdSSN;
	
	private String address;
	
	public BusinessOwnersDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.claimantType=setClaimantType();
		this.lossCause=setLossCause();
		this.documentType=setdocumentType();
		this.status=setStatus();
		this.costType=setcostType();
		this.text=setText();
		this.reserveCostCategory=setReserveCostCategory();
		this.country=setCountry();
		this.reserveLine=setReserveLine();
		this.costCategory=setCostCategory();
		this.recoveryCategory=setRecoveryCategory();
		this.service=setService();
		this.requestType=setRequestType();
		this.paymentType=setPaymentType();
		this.outcome=setOutcome();
		this.closedStatus=setClosedStatus();
		this.openStatus=setOutcome();
		this.reason=setOutcome();
		this.policyNumber=setPolicyNumber();
		this.claimNumber=setClaimNumber();
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.taxIdSSN=setTaxID();
		this.address=setAddress();
		this.city=setCity();
		this.state=setState();
	}

	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}
	
	public String setLossCause() {
		return lossCause=data.get("LOSS_CAUSE").trim().equals("X") ? DataFakers.lossCause() :
			data.get("LOSS_CAUSE").trim();
	}
	public String setdocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X") ? DataFakers.documentType() :
			data.get("DOCUMENT_TYPE").trim();
	}
	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") ? DataFakers.status() :
			data.get("STATUS").trim();
	}
	public String setcostType() {
		return costType=data.get("COST_TYPE").trim().equals("X") ? DataFakers.costType() :
			data.get("COST_TYPE").trim();
}
	public String setText() {
		return text=data.get("TEXT").trim().equals("X") ? DataFakers.generateRandomString("Text") :
			data.get("TEXT").trim();
	}
	public String setReserveCostCategory() {
		return reserveCostCategory=data.get("RESERVE_COST_CATEGORY").trim().equals("X") ? DataFakers.reserveCostCategory() :
			data.get("RESERVE_COST_CATEGORY").trim();
	}
	public String setCountry() {
		return country=data.get("COUNTRY").trim().equals("X") ? DataFakers.country() :
			data.get("COUNTRY").trim();
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
	
	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") ? DataFakers.service() :
			data.get("SERVICE").trim();
	}

	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") ? DataFakers.requestType() :
			data.get("REQUEST_TYPE").trim();
	}
	
	public String setPaymentType() {
		return paymentType=data.get("RESERVE_PAYMENT_TYPE").trim().equals("X") ? DataFakers.paymentType() :
			data.get("RESERVE_PAYMENT_TYPE").trim();
	}
	
	public String setOutcome() {
		return outcome=data.get("OUTCOME").trim().equals("X") ? DataFakers.outcome() :
			data.get("OUTCOME").trim();
	}
	public String setOpenStatus() {
		return openStatus=data.get("OPEN_STATUS").trim().equals("X") ? DataFakers.openStatus() :
			data.get("OPEN_STATUS").trim();
	}
	public String setClosedStatus() {
		return closedStatus=data.get("CLOSED_STATUS").trim().equals("X") ? DataFakers.closedStatus() :
			data.get("CLOSED_STATUS").trim();
	}
	public String setReason() {
		return reason=data.get("REASON").trim().equals("X") ? DataFakers.reason() :
			data.get("REASON").trim();
	}
	
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}
	
	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}
	
	public String setTaxID() {
		return taxIdSSN=data.get("TAX_ID").trim().trim().equals("X") ? DataFakers.taxID() :
			data.get("TAX_ID").trim();
	}
	
	public String setAddress() {
		return address=data.get("ADDRESS").trim().trim().equals("X") ? DataFakers.addressLineOne() :
			data.get("ADDRESS").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") ? DataFakers.city() :
			data.get("CITY").trim();
	}
	
	public String setState() {
		return state=data.get("STATE").trim().equals("X") ? DataFakers.state() :
			data.get("STATE").trim();
	}


}