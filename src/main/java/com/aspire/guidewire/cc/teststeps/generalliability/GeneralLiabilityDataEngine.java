package com.aspire.guidewire.cc.teststeps.generalliability;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;

import lombok.Getter;


@Getter
public class GeneralLiabilityDataEngine {

	HashMap<String,String> data;

	private String state;

	private String city;

	private String damageDescription;

	private String propertyDescription;

	private String propertyName;

	private String lossDate;
	
	private String claimantType;

	private String lossOccurred;
	
	private String lossCause;
	
	private String lossParty;
	
	private String text;
	
	private String address;
	
	private String whatHappened;
	
	private String coverage;
	
	private String costType;

	private String costCategory;

	private String amount;
	
	private String service;
	
	private String requestType;
	
	private String taxId;
	
	private String firstName;

	private String lastName;
	
	private String reserveLine;
	
	private String payment;

	private String type;
	
	private String jurisdictionState;
	
	private String location;
	
	private String searchFor;
	
	private String recoveryCategory;

	private String policyNumber;
	
	private String claimNumber;

	public GeneralLiabilityDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.state=setState();
		this.city=setCity();
		this.damageDescription=setDamageDescription();
		this.propertyDescription=setPropertyDescription();
		this.propertyName=setPropertyName();
		this.lossDate=setLossDate();
		this.claimantType=setClaimantType();
		this.lossOccurred=setLossOccurred();
		this.lossCause=setLossCause();
		this.lossParty=setLossParty();
		this.whatHappened=setWhatHappened();
		this.coverage=setCoverage();
		this.costCategory=setCostCategory();
		this.costType=setCostType();
		this.amount=setAmount();
		this.service=setService();
		this.requestType=setRequestType();
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.taxId=setTaxId();
		this.reserveLine=setReserveLine();
		this.payment=setPayment();
		this.type=setType();
		this.jurisdictionState=setJurisdictionState();
		this.text=setText();
		this.location=setLocation();
		this.searchFor=setSearchFor();
		this.recoveryCategory=setRecoveryCategory();
		this.policyNumber=setPolicy();
		this.claimNumber = setClaimNumber();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setDamageDescription() {
		return damageDescription=data.get("DAMAGE_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("Damage") :
			data.get("DAMAGE_DESCRIPTION").trim();
	}

	public String setPropertyDescription() {
		return propertyDescription=data.get("PROPERTY_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("Property") :
			data.get("PROPERTY_DESCRIPTION").trim();
	}

	public String setPropertyName() {
		return propertyName=data.get("PROPERTY_NAME").trim().equals("X") ? DataFakers.propertyName() :
			data.get("PROPERTY_NAME").trim();
	}

	public String setLossDate() {
		return lossDate=data.get("LOSS_DATE").trim().equals("X") ? DataFakers.currentDate() :
			data.get("LOSS_DATE").trim();
	}
             
	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}

	public String setLossOccurred() {
		return lossOccurred=data.get("LOSS_OCCURRED").trim().equals("X") ? DataFakers.lossOccurred() :
			data.get("LOSS_OCCURRED").trim();
	}
	
	public String setLossCause() {
		return lossCause=data.get("LOSS_CAUSE").trim().equals("X") ? DataFakers.lossCause() :
			data.get("LOSS_CAUSE").trim();
	}
	
	public String setLossParty() {
		return lossParty=data.get("LOSS_PARTY").trim().equals("X") ? DataFakers.lossParty() :
			data.get("LOSS_PARTY").trim();
	}
	
	public String setText() {
		return text=data.get("TEXT").trim().equals("X") ? DataFakers.generateRandomString("test") :
			data.get("TEXT").trim();
	}
	
	public String setAddress() {
		return address=data.get("ADDRESS").trim().equals("X") ? DataFakers.addressLineOne() :
			data.get("ADDRESS").trim();
	}
	public String setWhatHappened() {
		return whatHappened=data.get("WHAT_HAPPPENED").trim().equals("X") ? DataFakers.generateRandomString("Accident") :
			data.get("WHAT_HAPPPENED").trim();
	}
	public String setCoverage() {
		return coverage=data.get("COVERAGE").trim().equals("X") ? DataFakers.coverage():
			data.get("COVERAGE").trim();
	}
	public String setCostCategory() {
		return costCategory=data.get("COST_CATEGORY").trim().equals("X") ? DataFakers.costCategory():
			data.get("COST_CATEGORY").trim();
	}
	
	public String setCostType() {
		return costType=data.get("COST_TYPE").trim().equals("X") ? DataFakers.costType():
			data.get("COST_TYPE").trim();
	}
	
	public String setAmount() {
		return amount=data.get("AMOUNT").trim().equals("X") ? DataFakers.amount():
			data.get("AMOUNT").trim();
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
	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") ? DataFakers.service():
			data.get("SERVICE").trim();
	}
	
	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") ? DataFakers.requestType():
			data.get("REQUEST_TYPE").trim();
	}
	public String setPayment() {
		return payment=data.get("PAYMENT").trim().equals("X") ? DataFakers.payment():
			data.get("PAYMENT").trim();
	}
	public String setReserveLine() {
		return reserveLine=data.get("RESERVE_LINE").trim().equals("X") ? DataFakers.reserveLine():
			data.get("RESERVE_LINE").trim();
	}
	public String setType() {
		return type=data.get("TYPE").trim().equals("X") ? DataFakers.type():
			data.get("TYPE").trim();
	}
	
	public String setJurisdictionState() {
		return jurisdictionState=data.get("JURISDICTION_STATE").trim().equals("X") ? DataFakers.jurisdictionState():
			data.get("JURISDICTION_STATE").trim();
	}
	public String setLocation() {
		return location=data.get("LOCATION").trim().equals("X") ? DataFakers.country():
			data.get("LOCATION").trim();
	}
	
	public String setSearchFor() {
		return searchFor=data.get("SEARCH_FOR").trim().equals("X") ? DataFakers.searchFor():
			data.get("SEARCH_FOR").trim();
	}
	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") ? DataFakers.recoveryCategory():
			data.get("RECOVERY_CATEGORY").trim();
	}
	public String setPolicy() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}
}