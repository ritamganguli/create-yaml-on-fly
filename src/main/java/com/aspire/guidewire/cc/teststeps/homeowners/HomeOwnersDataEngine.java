package com.aspire.guidewire.cc.teststeps.homeowners;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class HomeOwnersDataEngine {

	HashMap<String,String> data;

	private String damageDescription;

	private String propertyDescription;

	private String propertyName;

	private String lossDate;

	private String lossCause;

	private String claimantType;

	private String coverage;

	private String lossParty;

	private String documentName;

	private String firstName;

	private String lastName;

	private String documentType;

	private String status;

	private String taxId;

	private String coverageType;

	private String address;

	private String state;

	private String city;

	private String roles;

	private String reserveLine;

	private String costCategory;

	private String costType;

	private String amount;

	private String payment;

	private String recoveryCategory;
	
	private String service;
	
	private String requestType;
	
	private String dataMessage;

	private String outcome;

	private String closedStatus;

	private String noteText;

	private String text;

	private String type;

	private String jurisdictionState;
	
	private String location;
	
	private String note;
	
	private String reason;
	
	private String closedExposureValue;
	
	private String openExposureValue;
	
	private String reopenReason; 
	
	private String reOpenStatus;
	
	private String generateRandomLetters;
	
	private String generateEmail;
	
	private String batchName;
	
	private String beforeRunStatus;
	
	private String afterRunStatus;
	
	private String email;
	
	private String subject;
	
	private String body;
	
	private String relationToInsured;
	
	private String policy;
	
	private String claimNumber;


	public HomeOwnersDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.damageDescription=setDamageDescription();
		this.propertyDescription=setPropertyDescription();
		this.propertyName=setPropertyName();
		this.lossDate=setLossDate();
		this.lossCause=setLossCause();
		this.claimantType=setClaimantType();
		this.coverage=setCoverage();
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.taxId=setTaxId();
		this.address=setAddress();
		this.state=setState();
		this.city=setCity();
		this.roles=setRoles();
		this.lossParty=setLossParty();
		this.documentName=setDocumentName();
		this.documentType=setDocumentType();
		this.status=setStatus();
		this.coverageType=setCoverageType();
		this.costType=setCostType();
		this.costCategory=setCostCategory();
		this.amount=setAmount();
		this.payment=setPayment();
		this.reserveLine=setReserveLine();
		this.recoveryCategory=setRecoveryCategory();
		this.text=setText();
		this.type =setType();
		this.jurisdictionState= setJurisdictionState();
		this.location = setLocation();
		this.outcome = setOutcome();
		this.closedExposureValue =setClosedExposureValue();
		this.openExposureValue =setOpenExposureValue();
		this.outcome=setOutcome();
		this.note=setNote();
		this.service=setService();
		this.requestType=setRequestType();
		this.reason=setReason();
		this.batchName=setBatchName();
		this.beforeRunStatus=setBeforeRunStatus();
		this.afterRunStatus=setAfterRunStatus();
		this.dataMessage=setDataMessage();
		this.outcome=setOutcome();
		this.closedStatus=setClosedStatus();
		this.noteText=setNoteText();
		this.reopenReason=setReopenReason();
		this.reOpenStatus=setReOpenStatus();
		this.generateRandomLetters = setGenerateRandomLetters();
		this.generateEmail = setGenerateEmail();
		this.relationToInsured = setRelationToInsured();
		this.policy=setPolicy();
		this.claimNumber = setClaimNumber();

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

	public String setLossCause() {
		return lossCause=data.get("LOSS_CAUSE").trim().equals("X") ? DataFakers.lossCause() :
			data.get("LOSS_CAUSE").trim();
	}

	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}
	public String setCoverage() {
		return coverage=data.get("COVERAGE").trim().equals("X") ? DataFakers.coverage():
			data.get("COVERAGE").trim();
	}
	public String setLossParty() {
		return lossParty=data.get("LOSS_PARTY").trim().equals("X") ? DataFakers.lossParty() :
			data.get("LOSS_PARTY").trim();
	}
	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") ? DataFakers.status():
			data.get("STATUS").trim();
	}
	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}
	public String setDocumentName() {
		return documentName=data.get("DOCUMENT_NAME").trim().equals("X") ? DataFakers.documentName("orrange.png"):
			data.get("DOCUMENT_NAME").trim();
	}
	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setTaxId() {
		return taxId=data.get("TAX_ID").trim().equals("X") ? DataFakers.taxID() :
			data.get("TAX_ID").trim();
	}

	public String setAddress() {
		return address=data.get("ADDRESS").trim().equals("X") ? DataFakers.addressLineOne() :
			data.get("ADDRESS").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") ? DataFakers.state() :
			data.get("STATE").trim();
	}

	public String setCity() {
		return city=data.get("CITY").trim().equals("X") ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setRoles() {
		return roles=data.get("ROLES").trim().equals("X") ? DataFakers.roles() :
			data.get("ROLES").trim();
	}
	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X") ? DataFakers.documentType():
			data.get("DOCUMENT_TYPE").trim();
	}

	public String setCoverageType() {
		return coverageType=data.get("COVERAGE_TYPE").trim().equals("X") ? DataFakers.coverageType():
			data.get("COVERAGE_TYPE").trim();
	}

	public String setReserveLine() {
		return reserveLine=data.get("RESERVE_LINE").trim().equals("X") ? DataFakers.reserveLine():
			data.get("RESERVE_LINE").trim();
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

	public String setPayment() {
		return payment=data.get("PAYMENT").trim().equals("X") ? DataFakers.payment():
			data.get("PAYMENT").trim();
	}
	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") ? DataFakers.requestType():
			data.get("RECOVERY_CATEGORY").trim();
	}

	public String setText() {
		return text=data.get("TEXT").trim().equals("X") ? DataFakers.generateRandomString("test") :
			data.get("TEXT").trim();
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
	public String setNote() {
		return note=data.get("NOTE").trim().equals("X") ? DataFakers.generateRandomString("test"):
			data.get("NOTE").trim();
	}
	
	public String setReason() {
		return reason=data.get("REASON").trim().equals("X") ? DataFakers.reason():
			data.get("REASON").trim();
	}
	
	public String setClosedExposureValue() {
		return closedExposureValue=data.get("CLOSED_EXPOSURE_VALUE").trim().equals("X") ? DataFakers.closeExposureValue():
			data.get("CLOSED_EXPOSURE_VALUE").trim();
	}
	
	public String setOpenExposureValue() {
		return openExposureValue=data.get("OPEN_EXPOSURE_VALUE").trim().equals("X") ? DataFakers.openExposureValue():
			data.get("OPEN_EXPOSURE_VALUE").trim();
	}
	public String setOutcome() {
		return outcome=data.get("OUTCOME").trim().equals("X") ? DataFakers.outcome():
			data.get("OUTCOME").trim();
	}
	
	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") ? DataFakers.service():
			data.get("SERVICE").trim();
	}
	
	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") ? DataFakers.requestType():
			data.get("REQUEST_TYPE").trim();
	}
	
	public String setBeforeRunStatus() {
		return beforeRunStatus=data.get("BEFORE_RUN_STATUS").trim().equals("X") ? DataFakers.beforeRunStatus():
			data.get("BEFORE_RUN_STATUS").trim();
	}
	public String setAfterRunStatus() {
		return afterRunStatus=data.get("AFTER_RUN_STATUS").trim().equals("X") ? DataFakers.afterRunStatus():
			data.get("AFTER_RUN_STATUS").trim();
	}
	public String setBatchName() {
		return batchName=data.get("BATCH_NAME").trim().equals("X") ? DataFakers.batchName():
			data.get("BATCH_NAME").trim();
	}

	public String setDataMessage() {
		return dataMessage=data.get("DATA_MESSAGE").trim().equals("X") ?DataFakers.dataMessage() :
			data.get("DATA_MESSAGE").trim();
	}

	public String setClosedStatus() {
		return closedStatus=data.get("CLOSE_STATUS").trim().equals("X")  ? DataFakers.status() :
			data.get("CLOSE_STATUS").trim();
	}
	public String setNoteText() {
		return noteText=data.get("NOTE_TEXT").trim().equals("X") ? DataFakers.generateRandomString("NoteText ") :
			data.get("NOTE_TEXT").trim();
	}
	
	public String setReopenReason() {
		return reopenReason=data.get("REOPEN_REASON").trim().equals("X") ? DataFakers.reopenReason() :
			data.get("REOPEN_REASON").trim();
	}
	
	public String setReOpenStatus() {
		return reOpenStatus=data.get("REOPEN_STATUS").trim().equals("X") ? DataFakers.reopenStatus() :
			data.get("REOPEN_STATUS").trim();
	}
	
	public String setGenerateRandomLetters() {
		return generateRandomLetters=data.get("RANDOM_LETTERS").trim().equals("X") ? DataFakers.generateRandomLetters():
			data.get("RANDOM_LETTERS").trim();
	}
	
	public String setGenerateEmail() {
		return generateEmail=data.get("EMAIL").trim().equals("X") ? DataFakers.generateEmail():
			data.get("EMAIL").trim();
	}
	
	public String setRelationToInsured() {
		return relationToInsured=data.get("RELATION_TO_INSURED").trim().equals("X") ? DataFakers.relationToInsured():
			data.get("RELATION_TO_INSURED").trim();
	}
	public String setPolicy() {
		return policy=data.get("POLICY_NUMBER").trim();
	}
	
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}
}