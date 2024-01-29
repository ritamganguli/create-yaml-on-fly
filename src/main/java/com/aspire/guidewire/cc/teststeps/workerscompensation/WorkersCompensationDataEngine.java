package com.aspire.guidewire.cc.teststeps.workerscompensation;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class WorkersCompensationDataEngine {

	HashMap<String,String> data;

	private String lossDate;
	
	private String claimantType;

	private String lossOccurred;
	
	private String lossCause;
	
	private String country;
	
	private String dateEmployerNotified;
	
	private String injurySource;
	
	private String costType;
	
	private String costCategory;
	
	private String name;
	
	private String reserveLine;
	
	private String recoveryCategory;
	
	private String amount;
	
	private String generateRandomLetters;
	
	private String generateEmail;
	
	private String type;
	
	private String jurisdictionState;
	
	private String requestType;
	
	private String service;
	
	private String state;
	
	private String city;
	
	private String injuryDescription;
	
	private String paymentType;
	
	private String compensability;
	
	private String outcome;
	
	private String notes;
	
	private String claimStatus;
	
	private String radioButtonOptions;
	
	private String policyNumber;
	
	private String claimNumber;
	
	public WorkersCompensationDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.lossDate=setLossDate();
		this.claimantType=setClaimantType();
		this.lossOccurred=setLossOccurred();
		this.country =setCountry();
		this.dateEmployerNotified = setdateEmployerNotified();
		this.injurySource = setinjurySource();
		this.costType = setcostType();
		this.costCategory = setcostCategory();
		this.name = setName();
		this.reserveLine = setReserveLine();
		this.recoveryCategory = setRecoveryCategory();
		this.amount = setAmount();
		this.generateRandomLetters = setGenerateRandomLetters();
		this.generateEmail = setGenerateEmail();
		this.jurisdictionState = setJurisdictionState();
		this.type = setType();
		this.requestType = setRequestType();
		this.service = setService();
		this.state = setState();
		this.city = setCity();
		this.injuryDescription = setInjuryDescription();
		this.paymentType = setPaymentType();
		this.compensability = setCompensability();
		this.outcome = setOutcome();
		this.notes = setNote();
		this.claimStatus = setClaimStatus();
		this.radioButtonOptions = setRadioButtonOptions();
		this.policyNumber=setPolicy();
		this.claimNumber=setClaimNumber();
	}

	
	public String setLossDate() { 
		return	lossDate=data.get("LOSS_DATE").trim().equals("X") ? DataFakers.currentDate()
					: data.get("LOSS_DATE").trim(); }


	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}

	public String setLossOccurred() {
		return lossOccurred=data.get("LOSS_OCCURRED").trim().equals("X") ? DataFakers.lossOccurred() :
			data.get("LOSS_OCCURRED").trim();
	}
	
	public String setCountry() {
		return country=data.get("COUNTRY").trim().equals("X") ? DataFakers.country() :
			data.get("COUNTRY").trim();
	}
	public String setdateEmployerNotified() {
		return dateEmployerNotified=data.get("EMPLOYERNOTIFIED_DATE").trim().equals("X") ? DataFakers.currentDate() :
			data.get("EMPLOYERNOTIFIED_DATE").trim();
	}
	public String setinjurySource() {
		return injurySource=data.get("INJURY_SOURCE").trim().equals("X") ? DataFakers.injurySource() :
			data.get("INJURY_SOURCE").trim();
	}
	public String setcostType() {
		return costType=data.get("COST_TYPE").trim().equals("X") ? DataFakers.costType() :
			data.get("COST_TYPE").trim();
	}
	public String setcostCategory() {
		return costCategory=data.get("COST_CATEGORY").trim().equals("X") ? DataFakers.costCategory() :
			data.get("COST_CATEGORY").trim();
	}
	public String setName() {
		return name=data.get("NAME").trim();
	}
	public String setReserveLine() {
		return reserveLine= data.get("RESERVE_LINE").trim(); 
	}
	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") ? DataFakers.recoveryCategory() :
			data.get("RECOVERY_CATEGORY").trim();
	}
	public String setAmount() {
		return amount=data.get("AMOUNT").trim().equals("X") ? DataFakers.amount():
			data.get("AMOUNT").trim();
	}
	public String setGenerateRandomLetters() {
		return generateRandomLetters=data.get("RANDOM_LETTERS").trim().equals("X") ? DataFakers.generateRandomLetters():
			data.get("RANDOM_LETTERS").trim();
	}
	public String setGenerateEmail() {
		return generateEmail=data.get("EMAIL").trim().equals("X") ? DataFakers.generateEmail():
			data.get("EMAIL").trim();
	}
	public String setJurisdictionState() {
		return jurisdictionState=data.get("JURISDICTION_STATE").trim().equals("X") ? DataFakers.jurisdictionState():
			data.get("JURISDICTION_STATE").trim();
	}
	public String setType() {
		return type=data.get("TYPE").trim().equals("X") ? DataFakers.type():
			data.get("TYPE").trim();
	}
	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") ? DataFakers.requestType():
			data.get("REQUEST_TYPE").trim();
	}
	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") ? DataFakers.service():
			data.get("SERVICE").trim();
	}
	public String setState() {
		return state=data.get("STATE").trim().equals("X") ? DataFakers.state():
			data.get("STATE").trim();
	}
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") ? DataFakers.city():
			data.get("CITY").trim();
	}
	public String setInjuryDescription () {
		return injuryDescription=data.get("INJURY_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomLetters():
			data.get("INJURY_DESCRIPTION").trim();
	}
	public String setPaymentType () {
		return paymentType=data.get("PAYMENT_TYPE").trim().equals("X") ? DataFakers.paymentType():
			data.get("PAYMENT_TYPE").trim();
	}
	public String setCompensability () {
		return compensability=data.get("COMPENSABILITY").trim().equals("X") ? DataFakers.compensability():
			data.get("COMPENSABILITY").trim();
	}
	public String setOutcome () {
		return outcome=data.get("OUTCOME").trim().equals("X") ? DataFakers.outcome():
			data.get("OUTCOME").trim();
	}
	public String setNote () {
		return notes=data.get("NOTES").trim().equals("X") ? DataFakers.generateRandomLetters():
			data.get("NOTES").trim();
	}
	public String setClaimStatus() {
		return claimStatus=data.get("CLAIM_STATUS").trim();
	}
	public String setRadioButtonOptions() {
		return radioButtonOptions=data.get("RADIO_BUTTON_OPTIONS").trim();
	}
	public String setPolicy() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}

}