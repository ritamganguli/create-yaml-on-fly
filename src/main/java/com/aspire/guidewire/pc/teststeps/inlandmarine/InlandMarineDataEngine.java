package com.aspire.guidewire.pc.teststeps.inlandmarine;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class InlandMarineDataEngine {

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

	private String policyTerm;

	private String buildingDescription;
	
	private String businessClass;

	private String receptacleType;

	private String percentDuplicate;

	private String limit;
	
	private String contractorType;

	private String coinsurancePct;

	private String deductible;

	private String signType;
	
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
	
	private String policy;
	
	public InlandMarineDataEngine(String workBook,String sheetName,String testcaseID) {
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
		this.buildingDescription=setBuildingDescription();
		this.businessClass=setBusinessClass();
		this.receptacleType=setReceptacleType();
		this.percentDuplicate=setPercentDuplicate();
		this.limit=setLimit();
		this.contractorType=setContractorType();
		this.coinsurancePct=setCoinsurancePct();
		this.deductible=setDeductible();
		this.signType=setSignType();
		this.cancellationSource=setCancellationSource();
		this.cancellationReason=setCancellationReason();
		this.reinstatementReason=setReinstatementReason();
		this.effectiveDateOneMonthAhead=setEffectiveDateOneMonthAhead();
		this.upFrontPayment=setUpFrontPayment();
		this.renewalCode=setRenewalCode();
		this.notTakenReason=setNotTakenReason();
		this.declinedReason=setDeclinedReason();
		this.preRenewalDirection=setPreRenewalDirection();
		this.preRenewalSecurity=setPreRenewalSecurity();
		this.preRenewalReason=setPreRenewalReason();
		this.preRenewalText=setPreRenewalText();
		this.organizationType2=setOrganizationType2();
		this.policy=setPolicy();
		
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
	
	public String setOrganizationType2() {
		return organizationType=data.get("ORGANIZATION_TYPE2").trim().equals("X") || data.get("ORGANIZATION_TYPE2").trim().length() == 0 ? DataFakers.organizationType() : 
			data.get("ORGANIZATION_TYPE2").trim();
	}

	public String setPolicyTerm() {
		return policyTerm=data.get("POLICY_TERM").trim().equals("X") || data.get("POLICY_TERM").trim().length() == 0 ? DataFakers.policyTerms() :
			data.get("POLICY_TERM").trim();
	}

	public String setBuildingDescription() {
		return buildingDescription=data.get("BUILDING_DESCRIPTION").trim().equals("X") || data.get("BUILDING_DESCRIPTION").trim().length() == 0 ? DataFakers.generateRandomString("Description") :
			data.get("BUILDING_DESCRIPTION").trim();
	}

	public String setBusinessClass() {
		return businessClass=data.get("BUSINESS_CLASS").trim().equals("X") || data.get("BUSINESS_CLASS").trim().length() == 0 ? DataFakers.businessClass():
			data.get("BUSINESS_CLASS").trim();
	}

	public String setReceptacleType() {
		return receptacleType=data.get("RECEPTACLE_TYPE").trim().equals("X") || data.get("RECEPTACLE_TYPE").trim().length() == 0 ? DataFakers.receptacleType():
			data.get("RECEPTACLE_TYPE").trim();
	}

	public String setPercentDuplicate() {
		return percentDuplicate=data.get("PERCENT_DUPLICATED").trim().equals("X") || data.get("PERCENT_DUPLICATED").trim().length() == 0 ? DataFakers.percentDuplicated() :
			data.get("PERCENT_DUPLICATED").trim();
	}

	public String setLimit() {
		return limit=data.get("LIMIT").trim().equals("X") || data.get("LIMIT").trim().length() == 0 ? DataFakers.limit() :
			data.get("LIMIT").trim();
	}

	public String setContractorType() {
		return contractorType=data.get("CONTRACTOR_TYPE").trim().equals("X") || data.get("CONTRACTOR_TYPE").trim().length() == 0 ? DataFakers.contractorType() :
			data.get("CONTRACTOR_TYPE").trim();
	}

	public String setCoinsurancePct() {
		return coinsurancePct=data.get("COINSURANCE_PCT").trim().equals("X") || data.get("COINSURANCE_PCT").trim().length() == 0 ? DataFakers.coinsurancePct() :
			data.get("COINSURANCE_PCT").trim();
	}
	
	public String setDeductible() {
		return deductible=data.get("DEDUCTIBLE").trim().equals("X") || data.get("DEDUCTIBLE").trim().length() == 0 ? DataFakers.deductible() :
			data.get("DEDUCTIBLE").trim();
	}

	public String setSignType() {
		return signType=data.get("SIGN_TYPE").trim().equals("X") || data.get("SIGN_TYPE").trim().length() == 0 ? DataFakers.signType() :
			data.get("SIGN_TYPE").trim();
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
	
	public String setUpFrontPayment() {
		return upFrontPayment=data.get("UPFRONT_PAYMENT").trim().equals("X") || data.get("UPFRONT_PAYMENT").trim().length() == 0 ? DataFakers.upFrontPayment() : 
			data.get("UPFRONT_PAYMENT").trim();
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
		return preRenewalText=data.get("PRE_RENEWAL_TEXT").trim().equals("X") || data.get("PRE_RENEWAL_TEXT").trim().length() == 0 ? DataFakers.generateRandomString("PreRenewalText") : // Have to check
			data.get("PRE_RENEWAL_TEXT").trim();
	}
	public String setPolicy() {
		return policy=data.get("POLICY_NO").trim();
	}
}