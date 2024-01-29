package com.aspire.guidewire.pc.teststeps.personalauto;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class PersonalAutoDataEngine {

	HashMap<String,String> data;

	private String firstName;

	private String lastName;

	private String addressLine1;

	private String state;

	private String city;

	private String zipcode;

	private String addressType;

	private String producerOrganization;

	private String organizationType;

	private String organizationType2;
	
	private String organizationType3;

	private String policyTerm;
	
	private String currentYear;
	
	private String dateOfBirth;
	
	private String licenseNumber;
	
	private String costOfVehicle;
	
	private String VIN;
	
	private String currentDate;
	
	private String source;
	
	private String cancellationReason;
	
	private String reinstateReason;
	
	private String direction;
	
	private String security;
	
	private String reason;
	
	private String text;
	
	private String renewalCode;
	
	private String dateOneMonthAhead;
	
	private String reasonNotTaken;
	
	private String reasonDeclined;
	
	private String billingMethod;
	
	private String paymentPlan;
	
	private String carrier;
	
	private String basis;
	
	private String documentType;
	
	private String documentName;
	
	private String status;
	
	private String coverge1;
	
	private String coverge2;
	
	private String coverge3;
	
	private String coverge4;
	
	private String coverge5;
	
	private String factorVal;
	
	private String vehicleTypeval;
	
	private String uwvalue;
	
	private String multiCarDiscountVal;
	
	private String fileName;
	
	private String collisionCoverage;
	
	private String comprehensiveCoverage;
	
	private String contingencyAction;
	
	private String contingencyDocumentType;
	
	private String rolesAccidentSummary;
	
	private String offerings;
	
	private String vehicleType;
	
	private String policyTerm2;
	
	private String policyNumber;
	
	public PersonalAutoDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.addressLine1=setAddressLine1();
		this.state=setState();
		this.city=setCity();
		this.zipcode=setZipcode();
		this.currentYear=setCurrentYear();
		this.dateOfBirth=setDateOfBirth();
		this.licenseNumber=setLicenseNumber();
		this.costOfVehicle=setCostOfVehicle();
		this.VIN=setVIN();
		this.producerOrganization=setProducerOrganization();
		this.currentDate=setCurrentDate();
		this.source=setSource();
		this.cancellationReason=setCancellationReason();
		this.reinstateReason=setReinstateReason();
		this.direction=setDirection();
		this.security=setSecurity();
		this.reason=setReason();
		this.text=setText();
		this.renewalCode=setRenewalCode();
		this.dateOneMonthAhead=setDateOneMonthAhead();
		this.reasonNotTaken=setReasonNotTaken();
		this.reasonDeclined=setReasonDeclined();
		this.billingMethod=setBillingMethod();
		this.paymentPlan=setPaymentPlan();
		this.carrier=setCarrier();
		this.paymentPlan=setPaymentPlan();
		this.basis=setBasis();
		this.documentType=setDocumentType();
		this.documentName=setDocumentName();
		this.status=setStatus();
		this.coverge1=setCoverge1();
		this.coverge2=setCoverge2();
		this.coverge3=setCoverge3();
		this.coverge4=setCoverge4();
		this.coverge5=setCoverge5();
		this.factorVal=setFactorVal();
		this.vehicleTypeval=setVehicleTypeval();
		this.uwvalue=setUWvalue();
		this.multiCarDiscountVal=setMultiCarDiscountVal();
		this.fileName=setFileName();
		this.contingencyAction=setContingencyAction();
		this.contingencyDocumentType=setContingencyDocumentType();
		this.rolesAccidentSummary=setRolesAccidentSummary();
		this.offerings =setOfferings();
		this.policyTerm =setPolicyTerm();
		this.policyTerm2 =setPolicyTerm2();
		this.addressType =setAddressType();
		this.vehicleType =setVehicleType();
		this.policyNumber=setPolicyNumber();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X")|| data.get("FIRST_NAME").trim().length() == 0 ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length() == 0? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X")|| data.get("ADDRESS_LINE1").trim().length() == 0 ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length() == 0? DataFakers.state() :
			data.get("STATE").trim();
	}

	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length() == 0? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X")|| data.get("ZIPCODE").trim().length() == 0 ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}
	
	public String setCurrentYear() {
		return currentYear=data.get("CURRENT_YEAR").trim().equals("X")|| data.get("CURRENT_YEAR").trim().length() == 0 ? DataFakers.currentYear() : 
			data.get("CURRENT_YEAR").trim();
	}
	
	public String setDateOfBirth() {
		return dateOfBirth=data.get("DATE_OF_BIRTH").trim().equals("X") || data.get("DATE_OF_BIRTH").trim().length() == 0? DataFakers.dateOfBirth() : 
			data.get("DATE_OF_BIRTH").trim();
	}
	
	public String setLicenseNumber() {
		return licenseNumber=data.get("LICENSE_NUMBER").trim().equals("X")|| data.get("LICENSE_NUMBER").trim().length() == 0 ? DataFakers.licenseNumber() : 
			data.get("LICENSE_NUMBER").trim();
	}
	
	public String setCostOfVehicle() {
		return costOfVehicle=data.get("COST_OF_VEHICLE").trim().equals("X") || data.get("COST_OF_VEHICLE").trim().length() == 0? DataFakers.costOfVehicle() : 
			data.get("COST_OF_VEHICLE").trim();
	}
	
	public String setVIN() {
		return VIN=data.get("VIN").trim().equals("X")|| data.get("VIN").trim().length() == 0 ? DataFakers.VIN() : 
			data.get("VIN").trim();
	}
	
	public String setProducerOrganization() {
		return producerOrganization=data.get("PRODUCER_ORGANIZATION").trim().equals("X") || data.get("PRODUCER_ORGANIZATION").trim().length() == 0? DataFakers.producerOrganization() :
			data.get("PRODUCER_ORGANIZATION").trim();
	}

	public String setCurrentDate() {
		return currentDate=data.get("CURRENT_DATE").trim().equals("X") || data.get("CURRENT_DATE").trim().length() == 0? DataFakers.currentDate() : 
			data.get("CURRENT_DATE").trim();
	}
	
	public String setSource() {
		return source=data.get("SOURCE").trim().equals("X")|| data.get("SOURCE").trim().length() == 0 ? DataFakers.source() : 
			data.get("SOURCE").trim();
	}
	
	public String setCancellationReason() {
		return cancellationReason=data.get("CANCELLATION_REASON").trim().equals("X")|| data.get("CANCELLATION_REASON").trim().length() == 0 ? DataFakers.cancellationReason() : 
			data.get("CANCELLATION_REASON").trim();
	}
	
	public String setReinstateReason() {
		return reinstateReason=data.get("REINSTATE_REASON").trim().equals("X") || data.get("REINSTATE_REASON").trim().length() == 0? DataFakers.reinstateReason() : 
			data.get("REINSTATE_REASON").trim();
	}
	
	public String setDirection() {
		return direction=data.get("DIRECTION").trim().equals("X")|| data.get("DIRECTION").trim().length() == 0 ? DataFakers.direction() : 
			data.get("DIRECTION").trim();
	}
	
	public String setSecurity() {
		return security=data.get("SECURITY").trim().equals("X")|| data.get("SECURITY").trim().length() == 0 ? DataFakers.security() : 
			data.get("SECURITY").trim();
	}
	
	public String setReason() {
		return reason=data.get("REASON").trim().equals("X")|| data.get("REASON").trim().length() == 0 ? DataFakers.reason() : 
			data.get("REASON").trim();
	}
	
	public String setText() {
		return text=data.get("TEXT").trim().equals("X")|| data.get("TEXT").trim().length() == 0 ? DataFakers.generateRandomString("Description") : 
			data.get("TEXT").trim();
	}
	
	public String setRenewalCode() {
		return renewalCode=data.get("RENEWAL_CODE").trim().equals("X")|| data.get("RENEWAL_CODE").trim().length() == 0 ? DataFakers.renewalCode() : 
			data.get("RENEWAL_CODE").trim();
	}
	
	public String setDateOneMonthAhead() {
		return dateOneMonthAhead=data.get("DATE_ONE_MONTH_AHEAD").trim().equals("X")|| data.get("DATE_ONE_MONTH_AHEAD").trim().length() == 0 ? DataFakers.dateOneMonthAhead() : 
			data.get("DATE_ONE_MONTH_AHEAD").trim();
	}
	
	public String setReasonNotTaken() {
		return reasonNotTaken=data.get("REASON_NOT_TAKEN").trim().equals("X") || data.get("REASON_NOT_TAKEN").trim().length() == 0? DataFakers.reasonNotTaken() : 
			data.get("REASON_NOT_TAKEN").trim();
	}
	
	public String setReasonDeclined() {
		return reasonDeclined=data.get("REASON_DECLINED").trim().equals("X") || data.get("REASON_DECLINED").trim().length() == 0? DataFakers.reasonDeclined() : 
			data.get("REASON_DECLINED").trim();
	}
	
	public String setBillingMethod() {
		return billingMethod=data.get("BILLING_METHOD").trim().equals("X")|| data.get("BILLING_METHOD").trim().length() == 0 ? DataFakers.billingMethod() : 
			data.get("BILLING_METHOD").trim();
	}
	
	public String setPaymentPlan() {
		return paymentPlan=data.get("PAYMENT_PLAN").trim().equals("X")|| data.get("PAYMENT_PLAN").trim().length() == 0 ? DataFakers.paymentPlan() : 
			data.get("PAYMENT_PLAN").trim();
	}
	
	public String setCarrier() {
		return carrier=data.get("CARRIER").trim().equals("X") || data.get("CARRIER").trim().length() == 0? DataFakers.generateRandomString("Carrier") : 
			data.get("CARRIER").trim();
	}
	
	public String setBasis() {
		return basis=data.get("BASIS").trim().equals("X")|| data.get("BASIS").trim().length() == 0 ? DataFakers.basis() : 
			data.get("BASIS").trim();
	}
	
	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X")|| data.get("DOCUMENT_TYPE").trim().length() == 0 ? DataFakers.documentType() : 
			data.get("DOCUMENT_TYPE").trim();
	}
	
	public String setDocumentName() {
		return documentName=data.get("DOCUMENT_NAME").trim().equals("X")|| data.get("DOCUMENT_NAME").trim().length() == 0 ? DataFakers.documentName() : 
			data.get("DOCUMENT_NAME").trim();
	}
	
	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") || data.get("STATUS").trim().length() == 0? DataFakers.status() : 
			data.get("STATUS").trim();	
	}
	
	public String setCoverge1() {
		return coverge1=data.get("COVERGE1").trim().equals("X") || data.get("COVERGE1").trim().length() == 0? DataFakers.coverge1() : 
			data.get("COVERGE1").trim();	
	}
	
	public String setCoverge2() {
		return coverge2=data.get("COVERGE2").trim().equals("X") || data.get("COVERGE2").trim().length() == 0? DataFakers.coverge2() : 
			data.get("COVERGE2").trim();	
	}
	
	public String setCoverge3() {
		return coverge3=data.get("COVERGE3").trim().equals("X") || data.get("COVERGE3").trim().length() == 0? DataFakers.coverge3(): 
			data.get("COVERGE3").trim();	
	}
	
	public String setCoverge4() {
		return coverge4=data.get("COVERGE4").trim().equals("X")|| data.get("COVERGE4").trim().length() == 0 ? DataFakers.coverge4() : 
			data.get("COVERGE4").trim();	
	}
	
	public String setCoverge5() {
		return coverge5=data.get("COVERGE5").trim().equals("X")|| data.get("COVERGE5").trim().length() == 0 ? DataFakers.coverge5() : 
			data.get("COVERGE5").trim();	
	}
	
	public String setFactorVal() {
		return factorVal=data.get("FACTOR_VAL").trim().equals("X") || data.get("FACTOR_VAL").trim().length() == 0? DataFakers.factorVal() : 
			data.get("FACTOR_VAL").trim();	
	}
	
	public String setVehicleTypeval() {
		return vehicleTypeval=data.get("VEHICLE_TYPE_VAL").trim().equals("X")|| data.get("VEHICLE_TYPE_VAL").trim().length() == 0 ? DataFakers.vehicleTypeval() : 
			data.get("VEHICLE_TYPE_VAL").trim();	
	}
	
	public String setUWvalue() {
		return uwvalue=data.get("UW_VALUE").trim().equals("X")|| data.get("UW_VALUE").trim().length() == 0 ? DataFakers.uwvalue() : 
			data.get("UW_VALUE").trim();	
	}
	
	public String setMultiCarDiscountVal() {
		return multiCarDiscountVal=data.get("MULTI_CARD_IS_COUNT_VAL").trim().equals("X")|| data.get("MULTI_CARD_IS_COUNT_VAL").trim().length() == 0 ? DataFakers.multiCarDiscountVal() : 
			data.get("MULTI_CARD_IS_COUNT_VAL").trim();	
	}
	
	public String setFileName() {
		return fileName=data.get("FILE_NAME").trim().equals("X")|| data.get("FILE_NAME").trim().length() == 0 ? DataFakers.fileName() : 
			data.get("FILE_NAME").trim();	
	}
	
	public String setContingencyAction() {
		return contingencyAction=data.get("CONTINGENCY_ACTION").trim().equals("X") || data.get("CONTINGENCY_ACTION").trim().length() == 0? DataFakers.contingencyAction() : 
			data.get("CONTINGENCY_ACTION").trim();	
	}
	
	public String setContingencyDocumentType() {
		return contingencyDocumentType=data.get("CONTINGENCY_DOCUMENT_TYPE").trim().equals("X")|| data.get("CONTINGENCY_DOCUMENT_TYPE").trim().length() == 0 ? DataFakers.contingencyDocumentType() : 
			data.get("CONTINGENCY_DOCUMENT_TYPE").trim();	
	}
	
	public String setRolesAccidentSummary() {
		return rolesAccidentSummary=data.get("ROLES_ACCIDENT_SUMMARY").trim().equals("X") || data.get("ROLES_ACCIDENT_SUMMARY").trim().length() == 0? DataFakers.rolesAccidentSummary() : 
			data.get("ROLES_ACCIDENT_SUMMARY").trim();	
	}
	
	public String setOfferings() {
		return offerings=data.get("OFFERINGS").trim().equals("X") || data.get("OFFERINGS").trim().length() == 0? DataFakers.offerings() : 
			data.get("OFFERINGS").trim();	
	}
	
	public String setPolicyTerm() {
		return policyTerm=data.get("POLICY_TERM").trim().equals("X")|| data.get("POLICY_TERM").trim().length() == 0 ? DataFakers.policyTerm() : 
			data.get("POLICY_TERM").trim();	
	}
	
	public String setPolicyTerm2() {
		return policyTerm2=data.get("POLICY_TERM2").trim().equals("X")|| data.get("POLICY_TERM2").trim().length() == 0 ? DataFakers.policyTerm() : 
			data.get("POLICY_TERM2").trim();	
	}
	
	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X")|| data.get("ADDRESS_TYPE").trim().length() == 0 ? DataFakers.addressType() : 
			data.get("ADDRESS_TYPE").trim();	
	}
	
	public String setVehicleType() {
		return vehicleType=data.get("VEHICLE_TYPE").trim().equals("X")|| data.get("VEHICLE_TYPE").trim().length() == 0 ? DataFakers.vehicleType() : 
			data.get("VEHICLE_TYPE").trim();	
	}
	
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}

}