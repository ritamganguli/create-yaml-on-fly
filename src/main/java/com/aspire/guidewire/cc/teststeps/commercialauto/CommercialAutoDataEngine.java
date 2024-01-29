package com.aspire.guidewire.cc.teststeps.commercialauto;

import java.util.HashMap;
import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class CommercialAutoDataEngine {

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
	
	private String taxId;
	
	private String name;
	
	private String lossParty;
	
	private String year;
	
	private String make;
	
	private String model;
	
	private String costType;
	
	private String costCategory;
	
	private String coverage;
	
	private String reserveLine;
	
	private String recoveryCategory;
	
	private String roles;
	
	private String requestType;
	
	private String service;

	private String documentType;
	
	private String status;
	
	private String searchFor;
	
	private String paymentType;
	
	private String batchName;
	
	private String beforeStatus;
	
	private String afterStatus;
	
	private String vin;
	
	private String amount;
	
	private String address;
	
	private String firstName;
	
	private String lastName;
	
	private String policyNumber;
	
	private String claimNumber;
	
	private String vehicleName;
	
	public CommercialAutoDataEngine(String workBook,String sheetName,String testcaseID) {
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
		this.taxId=settaxId();
		this.name=setName();
		this.lossParty=setLossParty();
		this.model=setModel();
		this.make=setMake();
		this.year=setYear();
		this.costType=setCostType();
		this.costCategory=setCostCategory();
		this.coverage=setCoverage();
		this.recoveryCategory=setRecoveryCategory();
		this.reserveLine=setReserveLine();
		this.roles=setRoles();
		this.requestType=setRequestType();
		this.service=setService();
		this.documentType=setDocumentType();
		this.status=setStatus();
		this.searchFor=setSearchFor();
		this.paymentType=setPaymentType();
		this.afterStatus=setAfterStatus();
		this.beforeStatus=setBeforeStatus();
		this.batchName=setBatchName();
		this.vin=setVin();
		this.amount=setAmount();
		this.address=setAddress();
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.policyNumber=setPolicyNumber();
		this.claimNumber=setClaimNumber();
		this.vehicleName=setVehicleName();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length()==0 ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length()==0  ? DataFakers.city() :
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
		return propertyName=data.get("PROPERTY_NAME").trim().equals("X")|| data.get("PROPERTY_NAME").trim().length()==0 ? DataFakers.propertyName() :
			data.get("PROPERTY_NAME").trim();
	}

	public String setLossDate() {
		return lossDate=data.get("LOSS_DATE").trim().equals("X")|| data.get("LOSS_DATE").trim().length()==0 ? DataFakers.currentDate() :
			data.get("LOSS_DATE").trim();
	}

	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") || data.get("CLAIMANT_TYPE").trim().length()==0 ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}

	public String setLossOccurred() {
		return lossOccurred=data.get("LOSS_OCCURRED").trim().equals("X") || data.get("LOSS_OCCURRED").trim().length()==0? DataFakers.lossOccurred() :
			data.get("LOSS_OCCURRED").trim();
	}
	
	public String setLossCause() {
		return lossCause=data.get("LOSS_CAUSE").trim().equals("X")|| data.get("LOSS_CAUSE").trim().length()==0 ? DataFakers.lossCause() :
			data.get("LOSS_CAUSE").trim();
	}
	
	public String settaxId() {
		return taxId=data.get("TAX_ID").trim().equals("X") || data.get("TAX_ID").trim().length()==0? DataFakers.taxID() :
			data.get("TAX_ID").trim();
	}

	public String setName() {
		return name=data.get("NAME").trim().equals("X") || data.get("NAME").trim().length()==0? DataFakers.generateRandomString("TowingAgency") :
			data.get("NAME").trim();
	}

	public String setLossParty() {
		return lossParty=data.get("LOSS_PARTY").trim().equals("X")|| data.get("LOSS_PARTY").trim().length()==0 ? DataFakers.lossParty() :
			data.get("LOSS_PARTY").trim();
	}
	
	public String setYear() {
		return year=data.get("YEAR").trim().equals("X") || data.get("YEAR").trim().length()==0? DataFakers.year() :
			data.get("YEAR").trim();
	}
	
	public String setMake() {
		return make=data.get("MAKE").trim().equals("X") || data.get("MAKE").trim().length()==0? DataFakers.make() :
			data.get("MAKE").trim();
	}
	
	public String setModel() {
		return model=data.get("MODEL").trim().equals("X")|| data.get("MODEL").trim().length()==0 ? DataFakers.model() :
			data.get("MODEL").trim();
	}
	
	public String setCostType() {
		return costType=data.get("COST_TYPE").trim().equals("X") || data.get("COST_TYPE").trim().length()==0? DataFakers.costType() :
			data.get("COST_TYPE").trim();
	}
	
	public String setCostCategory() {
		return costCategory=data.get("COST_CATEGORY").trim().equals("X") || data.get("COST_CATEGORY").trim().length()==0? DataFakers.costCategory() :
			data.get("COST_CATEGORY").trim();
	}
	
	public String setCoverage() {
		return coverage=data.get("COVERAGE").trim().equals("X") || data.get("COVERAGE").trim().length()==0? DataFakers.coverage() :
			data.get("COVERAGE").trim();
	}
	
	public String setReserveLine() {
		return reserveLine=data.get("RESERVE_LINE").trim().equals("X") || data.get("RESERVE_LINE").trim().length()==0? DataFakers.reserveLine() :
			data.get("RESERVE_LINE").trim();
	}
	
	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") || data.get("RECOVERY_CATEGORY").trim().length()==0 ? DataFakers.recoveryCategory() :
			data.get("RECOVERY_CATEGORY").trim();
	}
	
	public String setRoles() {
		return roles=data.get("ROLES").trim().equals("X") || data.get("ROLES").trim().length()==0? DataFakers.roles() :
			data.get("ROLES").trim();
	}
	
	public String setRequestType() {
		return requestType=data.get("REQUEST_TYPE").trim().equals("X") || data.get("REQUEST_TYPE").trim().length()==0 ? DataFakers.requestType() :
			data.get("REQUEST_TYPE").trim();
	}
	
	public String setService() {
		return service=data.get("SERVICE").trim().equals("X") || data.get("SERVICE").trim().length()==0 ? DataFakers.service() :
			data.get("SERVICE").trim();
	}
	
	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X") || data.get("DOCUMENT_TYPE").trim().length()==0 ? DataFakers.documentType() :
			data.get("DOCUMENT_TYPE").trim();
	}
	
	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") || data.get("STATUS").trim().length()==0 ? DataFakers.status() :
			data.get("STATUS").trim();
	}
	
	public String setSearchFor() {
		return searchFor=data.get("SEARCH_FOR").trim().equals("X") || data.get("SEARCH_FOR").trim().length()==0 ? DataFakers.searchFor() :
			data.get("SEARCH_FOR").trim();
	}
	
	public String setPaymentType() {
		return paymentType=data.get("PAYMENT_TYPE").trim().equals("X") || data.get("PAYMENT_TYPE").trim().length()==0 ? DataFakers.paymentType() :
			data.get("PAYMENT_TYPE").trim();
	}
	
	public String setBatchName() {
		return batchName=data.get("BATCH_NAME").trim().equals("X") || data.get("BATCH_NAME").trim().length()==0 ? DataFakers.batchName() :
			data.get("BATCH_NAME").trim();
	}
	
	public String setBeforeStatus() {
		return beforeStatus=data.get("BEFORE_STATUS").trim().equals("X") || data.get("BEFORE_STATUS").trim().length()==0 ? DataFakers.beforeStatus() :
			data.get("BEFORE_STATUS").trim();
	}
	
	public String setAfterStatus() {
		return afterStatus=data.get("AFTER_STATUS").trim().equals("X") || data.get("AFTER_STATUS").trim().length()==0 ? DataFakers.afterStatus() :
			data.get("AFTER_STATUS").trim();
	}
	public String setVin() {
		return vin=data.get("VIN").trim().equals("X") || data.get("VIN").trim().length()==0 ? DataFakers.vin() :
			data.get("VIN").trim();
	}
	public String setAmount() {
		return amount=data.get("AMOUNT").trim().equals("X") || data.get("AMOUNT").trim().length()==0 ? DataFakers.amount() :
			data.get("AMOUNT").trim();
	}
	public String setAddress() {
		return address=data.get("ADDRESS").trim().equals("X") || data.get("ADDRESS").trim().length()==0 ? DataFakers.address() :
			data.get("ADDRESS").trim();
	}
	public String setFirstName() {
		return address=data.get("FIRST_NAME").trim().equals("X") || data.get("FIRST_NAME").trim().length()==0 ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}
	public String setLastName() {
		return address=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length()==0 ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim();
	}
	public String setVehicleName() {
		return vehicleName=data.get("VEHICLE_NAME").trim().equals("X") || data.get("VEHICLE_NAME").trim().length()==0 ? DataFakers.vehicleName() :
			data.get("VEHICLE_NAME").trim();
	}
}