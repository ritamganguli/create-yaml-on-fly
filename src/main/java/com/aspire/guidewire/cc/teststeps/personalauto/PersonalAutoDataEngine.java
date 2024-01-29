package com.aspire.guidewire.cc.teststeps.personalauto;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class PersonalAutoDataEngine {

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
	
	private String taxId;
	
	private String taxSsnId;

	private String roles;
	
	private String firstName;

	private String lastName;
	
	private String location;
	
	private String faultRating;
	
	private String initialStatus;
	
	private String finalStatus;

	private String outcome;
	
	private String emailAddress;
	
	private String body;
	
	private String subject;

	private String service;
	
	private String requestType;
	
	private String reserveLine;

	private String costType;

	private String costCategory;

	private String recoveryCategory;
	
	private String amount;
	
	private String type;
	
	private String jurisdictionState;
	
	private String documentName;

	private String documentType;

	private String status;

	private String exposureValue;
	
	private String note;
	
	private String reason;
	
	private String closedExposureValue;
	
	private String openExposureValue;
	
	private String closedStatus;
	
	private String openStatus;
	
	private String coverageType;
	
	private String description;

	private String payment;

	private String batchName;

	private String beforeRunStatus;

	private String afterRunStatus;
	
	private String coverage;
	
	private String policy;
	
	private String claimNumber;
	
	private String vehicleName;
	
	private String make;
	
	private String model;
	
	private String year;
	
	private String vin;

	
	
	public PersonalAutoDataEngine(String workBook,String sheetName,String testcaseID) {
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
		this.text=setText();
		this.address=setAddress();
		this.roles=setRoles();
		this.taxId=setTaxId();
		this.taxSsnId=setTaxSsnId();
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.location=setLocation();
		this.initialStatus=setInitialStatus();
		this.finalStatus=setFinalStatus();
		this.outcome=setOutcome();
		this.faultRating=setFaultRating();
		this.emailAddress=setEmailAddress();
		this.body=setBody();
		this.subject=setSubject();
		this.service=setService();
		this.requestType=setRequestType();
		this.recoveryCategory=setRecoveryCategory();
		this.reserveLine=setReserveLine();
		this.costCategory=setCostCategory();
		this.costType=setCostType();
		this.amount=setAmount();
		this.type=setType();
		this.jurisdictionState=setJurisdictionState();
		this.status=setStatus();
		this.documentName=setDocumentName();
		this.documentType=setDocumentType();
		this.note=setNote();
		this.reason=setReason();
		this.closedExposureValue=setClosedExposureValue();
		this.openExposureValue=setOpenExposureValue();
		this.closedStatus=setClosedStatus();
		this.openStatus=setOpenStatus();
		this.coverageType=setCoverageType();
		this.description=setDescription();
		this.payment=setPayment();
		this.beforeRunStatus=setBeforeRunStatus();
		this.afterRunStatus=setAfterRunStatus();
		this.batchName=setBatchName();
		this.coverage=setCoverage();
		this.policy=setPolicy();
		this.claimNumber = setClaimNumber();
		this.vehicleName = setVehicleName();
		this.make = setMake();
		this.model = setModel();
		this.year = setYear();
		this.vin = setVin();

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

	
	public String setTaxId() {
		return taxId=data.get("TAX_ID").trim().equals("X") ? DataFakers.taxID() :
			data.get("TAX_ID").trim();
	}
	
	public String setRoles() {
		return roles=data.get("ROLES").trim().equals("X") ? DataFakers.roles() :
			data.get("ROLES").trim();
	}
	
	public String setTaxSsnId() {
		return taxSsnId=data.get("TAX_SSN_ID").trim().equals("X") ? DataFakers.taxID() :
			data.get("TAX_SSN_ID").trim();
	}
	
	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}
	
	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}
	
	public String setLocation() {
		return location=data.get("LOCATION").trim().equals("X") ? DataFakers.country():
			data.get("LOCATION").trim();
	}
	
	public String setFaultRating() {
		return faultRating=data.get("FAULT_RATING").trim().equals("X") ? DataFakers.faultRating():
			data.get("FAULT_RATING").trim();
	}
	
	public String setOutcome() {
		return outcome=data.get("OUTCOME").trim().equals("X") ? DataFakers.outcome():
			data.get("OUTCOME").trim();
	}
	
	public String setInitialStatus() {
		return initialStatus=data.get("INITIAL_STATUS").trim().equals("X") ? DataFakers.faultRating():
			data.get("INITIAL_STATUS").trim();
	}
	
	public String setFinalStatus() {
		return finalStatus=data.get("FINAL_STATUS").trim().equals("X") ? DataFakers.faultRating():
			data.get("FINAL_STATUS").trim();
	}
	
	public String setEmailAddress() {
		return emailAddress=data.get("EMAIL_ADDRESS").trim().equals("X") ? DataFakers.generateEmail():
			data.get("EMAIL_ADDRESS").trim();
	}
	
	public String setBody() {
		return body=data.get("BODY").trim().equals("X") ? DataFakers.generateRandomString("test"):
			data.get("BODY").trim();
	}
	
	public String setSubject() {
		return subject=data.get("SUBJECT").trim().equals("X") ? DataFakers.generateRandomString("test"):
			data.get("SUBJECT").trim();
	}
	
	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") ? DataFakers.service():
			data.get("SERVICE").trim();
	}
	
	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") ? DataFakers.requestType():
			data.get("REQUEST_TYPE").trim();
	}
	
	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") ? DataFakers.requestType():
			data.get("RECOVERY_CATEGORY").trim();
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
	
	public String setType() {
		return type=data.get("TYPE").trim().equals("X") ? DataFakers.type():
			data.get("TYPE").trim();
	}
	
	public String setJurisdictionState() {
		return jurisdictionState=data.get("JURISDICTION_STATE").trim().equals("X") ? DataFakers.jurisdictionState():
			data.get("JURISDICTION_STATE").trim();
	}
	
	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") ? DataFakers.status():
			data.get("STATUS").trim();
	}
	
	public String setDocumentName() {
		return documentName=data.get("DOCUMENT_NAME").trim().equals("X") ? DataFakers.documentName("orrange.png"):
			data.get("DOCUMENT_NAME").trim();
	}
	
	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X") ? DataFakers.documentType():
			data.get("DOCUMENT_TYPE").trim();
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
	
	public String setClosedStatus() {
		return closedStatus=data.get("CLOSED_STATUS").trim().equals("X") ? DataFakers.closeExposureValue():
			data.get("CLOSED_STATUS").trim();
	}
	
	public String setOpenStatus() {
		return openStatus=data.get("OPEN_STATUS").trim().equals("X") ? DataFakers.openExposureValue():
			data.get("OPEN_STATUS").trim();
	}
	
	public String setCoverageType() {
		return coverageType=data.get("COVERAGE_TYPE").trim().equals("X") ? DataFakers.coverageType():
			data.get("COVERAGE_TYPE").trim();
	}
	public String setDescription() {
		return description=data.get("DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("damage"):
			data.get("DESCRIPTION").trim();
	}
	public String setPayment() {
		return payment=data.get("PAYMENT").trim().equals("X") ? DataFakers.payment():
			data.get("PAYMENT").trim();
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
	public String setCoverage() {
		return coverage=data.get("COVERAGE").trim().equals("X") ? DataFakers.coverage():
			data.get("COVERAGE").trim();
	}
	public String setPolicy() {
		return policy=data.get("POLICY_NUMBER").trim();
	}
	
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}
	public String setVehicleName() {
		return vehicleName=data.get("VEHICLE_NAME").trim().equals("X") ? DataFakers.vehicleName():
			data.get("VEHICLE_NAME").trim();
	}
	public String setMake() {
		return make=data.get("MAKE").trim().equals("X") ? DataFakers.make():
			data.get("MAKE").trim();
	}
	public String setModel() {
		return model=data.get("MODEL").trim().equals("X") ? DataFakers.model():
			data.get("MODEL").trim();
	}
	public String setYear() {
		return year=data.get("YEAR").trim().equals("X") ? DataFakers.year():
			data.get("YEAR").trim();
	}
	
	public String setVin() {
		return vin=data.get("VIN").trim().equals("X") ? DataFakers.vin():
			data.get("VIN").trim();
	}
	
	
	
}