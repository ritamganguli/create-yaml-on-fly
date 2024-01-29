package com.aspire.guidewire.pc.teststeps.generalliability;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class GeneralLiabilityDataEngine {

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
	
	private String policyTerm;

	private String cancellationSource;
	
	private String cancellationReason;
	
	private String reinstatementReason;
	
	private String effectiveDateOneMonthAhead;
	
	private String upFrontPayment;
	
	private String renewalCode;
	
	private String notTakenReason;
	
	private String declinedReason;
	
	private String preRenewalDirection;
	
	private String preRenewalSecurity;
	
	private String preRenewalReason;
	
	private String preRenewalText;
	
	private String currentDate;
	
	private String Exposuresbasis;
	
	private String classCode;
	
	private String policyNumber;
	
	private String offering;
	
	public GeneralLiabilityDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.addressLine1=setAddressLine1();
		this.state=setState();
		this.city=setCity();
		this.zipcode=setZipcode();
		this.addressType=setAddressType();
		this.producerOrganization=setProducerOrganization();
		this.organizationType=setOrganizationType();
		this.policyTerm=setPolicyTerm();
		this.cancellationSource=setCancellationSource();
		this.cancellationReason=setCancellationReason();
		this.reinstatementReason=setReinstatementReason();
		this.effectiveDateOneMonthAhead=setEffectiveDateOneMonthAhead();
		this.renewalCode=setRenewalCode();
		this.notTakenReason=setNotTakenReason();
		this.declinedReason=setDeclinedReason();
		this.preRenewalDirection=setPreRenewalDirection();
		this.preRenewalSecurity=setPreRenewalSecurity();
		this.preRenewalReason=setPreRenewalReason();
		this.preRenewalText=setPreRenewalText();
		this.currentDate=setCurrentDate(); 
		this.Exposuresbasis=setExposuresbasis();
		this.classCode=setClassCode();	
		this.policyNumber=setPolicyNumber();
		this.offering=setOffering();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") || data.get("FIRST_NAME").trim().length() == 0 ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length() == 0 ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X") || data.get("ADDRESS_LINE1").trim().length() == 0 ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length() == 0 ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length() == 0 ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X") || data.get("ZIPCODE").trim().length() == 0 ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}

	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X") || data.get("ADDRESS_TYPE").trim().length() == 0 ? DataFakers.addressType() :
			data.get("ADDRESS_TYPE").trim();
	}

	public String setProducerOrganization() {
		return producerOrganization=data.get("PRODUCER_ORGANIZATION").trim().equals("X") || data.get("PRODUCER_ORGANIZATION").trim().length() == 0 ? DataFakers.producerOrganization() :
			data.get("PRODUCER_ORGANIZATION").trim();
	}

	public String setOrganizationType() {
		return organizationType=data.get("ORGANIZATION_TYPE").trim().equals("X") || data.get("ORGANIZATION_TYPE").trim().length() == 0 ? DataFakers.organizationType() :
			data.get("ORGANIZATION_TYPE").trim();
	}
	
	public String setPolicyTerm() {
		return policyTerm=data.get("POLICY_TERM").trim().equals("X") || data.get("POLICY_TERM").trim().length() == 0 ? DataFakers.policyTerms() :
			data.get("POLICY_TERM").trim();
	}

	public String setCancellationSource() {
		return cancellationSource=data.get("CANCELLATION_SOURCE").trim().equals("X") || data.get("CANCELLATION_SOURCE").trim().length() == 0 ? DataFakers.cancellationSource() : 
			data.get("CANCELLATION_SOURCE").trim();
	}
	
	public String setCancellationReason() {
		return cancellationReason=data.get("CANCELLATION_REASON").trim().equals("X") || data.get("CANCELLATION_REASON").trim().length() == 0 ? DataFakers.cancellationReason() : 
			data.get("CANCELLATION_REASON").trim();
	}
	
	public String setReinstatementReason() {
		return reinstatementReason=data.get("REINSTATE_REASON").trim().equals("X") || data.get("REINSTATE_REASON").trim().length() == 0 ? DataFakers.reinstatementReason() : 
			data.get("REINSTATE_REASON").trim();
	}
	
	public String setEffectiveDateOneMonthAhead() {
		return effectiveDateOneMonthAhead=data.get("EFFECTIVE_DATE").trim().equals("X") || data.get("EFFECTIVE_DATE").trim().length() == 0 ? DataFakers.dateOneMonthAhead() : 
			data.get("EFFECTIVE_DATE").trim();
	}
	
	public String setRenewalCode() {
		return renewalCode=data.get("RENEWAL_CODE").trim().equals("X") || data.get("RENEWAL_CODE").trim().length() == 0 ? DataFakers.renewalCode() : 
			data.get("RENEWAL_CODE").trim();
	}
	
	public String setNotTakenReason() {
		return notTakenReason=data.get("NOT_TAKEN_REASON").trim().equals("X") || data.get("NOT_TAKEN_REASON").trim().length() == 0 ? DataFakers.notTakenReason() : 
			data.get("NOT_TAKEN_REASON").trim();
	}
	
	public String setDeclinedReason() {
		return declinedReason=data.get("DECLINED_REASON").trim().equals("X") || data.get("DECLINED_REASON").trim().length() == 0 ? DataFakers.declinedReason() :
			data.get("DECLINED_REASON").trim();
	}
	
	public String setPreRenewalDirection() {
		return preRenewalDirection=data.get("PRE_RENEWAL_DIRECTION").trim().equals("X") || data.get("PRE_RENEWAL_DIRECTION").trim().length() == 0 ? DataFakers.preRenewalDirection() :
			data.get("PRE_RENEWAL_DIRECTION").trim();
	}
	
	public String setPreRenewalSecurity() {
		return preRenewalSecurity=data.get("PRE_RENEWAL_SECURITY").trim().equals("X") || data.get("PRE_RENEWAL_SECURITY").trim().length() == 0 ? DataFakers.preRenewalSecurity() : 
			data.get("PRE_RENEWAL_SECURITY").trim();
	}
	
	public String setPreRenewalReason() {
		return preRenewalReason=data.get("PRE_RENEWAL_REASON").trim().equals("X") || data.get("PRE_RENEWAL_REASON").trim().length() == 0 ? DataFakers.preRenewalReason() : 
			data.get("PRE_RENEWAL_REASON").trim();
	}
	
	public String setPreRenewalText() {
		return preRenewalText=data.get("PRE_RENEWAL_TEXT").trim().equals("X") || data.get("PRE_RENEWAL_TEXT").trim().length() == 0 ? DataFakers.generateRandomString("PreRenewalText") : 
			data.get("PRE_RENEWAL_TEXT").trim();
	}
	
	public String setCurrentDate() {
		return currentDate=data.get("CURRENT_DATE").trim().equals("X") || data.get("CURRENT_DATE").trim().length() == 0 ? DataFakers.currentDate() :
			data.get("CURRENT_DATE").trim();
	}
	
	public String setExposuresbasis() {
		return Exposuresbasis=data.get("EXPOSURES_BASIS").trim().equals("X") || data.get("EXPOSURES_BASIS").trim().length() == 0 ? DataFakers.basis() :
			data.get("EXPOSURES_BASIS").trim();
	}
	
	public String setClassCode() {
		return classCode=data.get("CLASS_CODE").trim().equals("X") || data.get("CLASS_CODE").trim().length() == 0 ? DataFakers.classCode() :
			data.get("CLASS_CODE").trim();
	}
	
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	public String setOffering() {
		return offering=data.get("OFFERINGS").trim().equals("X") || data.get("OFFERINGS").trim().length() == 0 ? DataFakers.offerings() :
			data.get("OFFERINGS").trim();
	}
	
}