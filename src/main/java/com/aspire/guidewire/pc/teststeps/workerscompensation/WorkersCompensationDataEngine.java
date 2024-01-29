package com.aspire.guidewire.pc.teststeps.workerscompensation;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class WorkersCompensationDataEngine {

	HashMap<String,String> data;

	private String state;

	private String city;

	private String firstName;

	private String lastName;

	private String addressLine1;

	private String zipcode;

	private String addressType;

	private String producerOrganization;
	
	private String organizationType;
	
	private String organizationType2;
	
	private String policyTerm;
	
	private String governingLaw;
	
	private String text;
	
	private String upFrontPayment;
	
	private String ssn;
	
	private String basis;
	
	private String code;
	
	private String reasonDeclined;
	
	private String reasonNotTaken;
	
	private String source;
	
	private String cancellationReason;
	
	private String currentYear;
	
	private String currentDate;
	
	private String direction;
	
	private String security;
	
	private String reason;
	
	private String renewalcode;
	
	private String reinstateReason;
	
	private String dateOneMonthAhead;
	
	private String policyNumber;

	
	public WorkersCompensationDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.state=setState();
		this.city=setCity();
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.addressLine1=setAddressLine1();
		this.state=setState();
		this.city=setCity();
		this.zipcode=setZipcode();
		this.addressType =setAddressType();
		this.producerOrganization=setProducerOrganization();
		this.organizationType=setOrganizationType();
		this.organizationType2=setOrganizationType2();
		this.policyTerm =setPolicyTerm();
		this.governingLaw=setGoverningLaw();
		this.text=setText();
		this.upFrontPayment=setUpFrontPayment();
		this.ssn=setSsn();
		this.basis=setBasis();
		this.code=setCode();
		this.reasonDeclined=setReasonDeclined();
		this.reasonNotTaken=setReasonNotTaken();
		this.source=setSource();
		this.cancellationReason=setCancellationReason();
		this.currentYear=setCurrentYear();
		this.currentDate=setCurrentDate();
		this.direction=setDirection();
		this.security=setSecurity();
		this.reason=setReason();
		this.renewalcode=setRenewalcode();
		this.reinstateReason=setReinstateReason();
		this.dateOneMonthAhead=setDateOneMonthAhead();
		this.policyNumber=setPolicyNumber();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length() == 0  ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length() == 0 ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X") || data.get("ADDRESS_TYPE").trim().length() == 0 ? DataFakers.addressType() : 
			data.get("ADDRESS_TYPE").trim();	
	}
	public String setProducerOrganization() {
		return producerOrganization=data.get("PRODUCER_ORGANIZATION").trim().equals("X") || data.get("PRODUCER_ORGANIZATION").trim().length() == 0 ? DataFakers.producerOrganization() :
			data.get("PRODUCER_ORGANIZATION").trim();
	}
	
	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") || data.get("FIRST_NAME").trim().length() == 0 ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length() == 0 ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}
	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X") || data.get("ZIPCODE").trim().length() == 0 ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}
	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X") || data.get("ADDRESS_LINE1").trim().length() == 0 ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}
	public String setOrganizationType() {
		return organizationType=data.get("ORGANIZATION_TYPE").trim().equals("X") || data.get("ORGANIZATION_TYPE").trim().length() == 0 ? DataFakers.organizationType() :
			data.get("ORGANIZATION_TYPE").trim();
	}	
	public String setOrganizationType2() {
		return organizationType2=data.get("ORGANIZATION_TYPE2").trim().equals("X") || data.get("ORGANIZATION_TYPE2").trim().length() == 0 ? DataFakers.organizationType() :
			data.get("ORGANIZATION_TYPE2").trim();
	}	
	
	public String setPolicyTerm() {
		return policyTerm=data.get("POLICY_TERM").trim().equals("X") || data.get("POLICY_TERM").trim().length() == 0? DataFakers.policyTerm() : 
			data.get("POLICY_TERM").trim();	
	}
	
	public String setGoverningLaw() {
		return governingLaw=data.get("GOVERNING_LAW").trim().equals("X") || data.get("GOVERNING_LAW").trim().length() == 0 ? DataFakers.governingLaw() : 
			data.get("GOVERNING_LAW").trim();	
	}
	
	public String setText() {
		return text=data.get("TEXT").trim().equals("X") || data.get("TEXT").trim().length() == 0 ? DataFakers.generateRandomString("Description") : 
			data.get("TEXT").trim();
		
	}
	public String setUpFrontPayment() {
		return upFrontPayment=data.get("UPFRONT_PAYMENT").trim().equals("X") || data.get("UPFRONT_PAYMENT").trim().length() == 0 ? DataFakers.upFrontPayment() : 
			data.get("UPFRONT_PAYMENT").trim();
		
	}
	public String setSsn() {
		return ssn=data.get("SSN").trim().equals("X") || data.get("SSN").trim().length() == 0 ? DataFakers.ssn() : 
			data.get("SSN").trim();	
	}
	public String setBasis() {
		return basis=data.get("BASIS").trim().equals("X") || data.get("BASIS").trim().length() == 0 ? DataFakers.amount() : 
			data.get("BASIS").trim();
		
	}
	public String setCode() {
		return code=data.get("CODE").trim().equals("X") || data.get("CODE").trim().length() == 0 ? DataFakers.classCode() : 
			data.get("CODE").trim();	
	}
	public String setReasonDeclined() {
		return reasonDeclined=data.get("REASON_DECLINED").trim().equals("X") || data.get("REASON_DECLINED").trim().length() == 0  ? DataFakers.reasonDeclined() : 
			data.get("REASON_DECLINED").trim();	
	}
	public String setReasonNotTaken() {
		return reasonNotTaken=data.get("REASON_NOT_TAKEN").trim().equals("X") || data.get("REASON_NOT_TAKEN").trim().length() == 0 ? DataFakers.reasonNotTaken() : 
			data.get("REASON_NOT_TAKEN").trim();	
	}
	public String setSource() {
		return source=data.get("SOURCE").trim().equals("X") || data.get("SOURCE").trim().length() == 0 ? DataFakers.source() : 
			data.get("SOURCE").trim();	
	}
	public String setCancellationReason() {
		return cancellationReason=data.get("CANCELLATION_REASON").trim().equals("X") || data.get("CANCELLATION_REASON").trim().length() == 0 ? DataFakers.cancellationReason() : 
			data.get("CANCELLATION_REASON").trim();	
	}
	
	public String setCurrentYear() {
		return currentYear=data.get("CURRENT_YEAR").trim().equals("X") || data.get("CURRENT_YEAR").trim().length() == 0 ? DataFakers.currentYear() : 
			data.get("CURRENT_YEAR").trim();
	}
	
	public String setCurrentDate() {
		return currentDate=data.get("CURRENT_DATE").trim().equals("X") || data.get("CURRENT_DATE").trim().length() == 0 ? DataFakers.currentDate() : 
			data.get("CURRENT_DATE").trim();	
	}
	public String setDirection() {
		return direction=data.get("DIRECTION").trim().equals("X") || data.get("DIRECTION").trim().length() == 0? DataFakers.direction() : 
			data.get("DIRECTION").trim();	
	}
	public String setSecurity() {
		return security=data.get("SECURITY").trim().equals("X") || data.get("SECURITY").trim().length() == 0 ? DataFakers.security() : 
			data.get("SECURITY").trim();	
	}
	public String setReason() {
		return reason=data.get("REASON").trim().equals("X") || data.get("REASON").trim().length() == 0 ? DataFakers.reason() : 
			data.get("REASON").trim();	
	}
	public String setRenewalcode() {
		return renewalcode=data.get("RENEWAL_CODE").trim().equals("X") || data.get("RENEWAL_CODE").trim().length() == 0 ? DataFakers.renewalcode() : 
			data.get("RENEWAL_CODE").trim();	
	}
	public String setReinstateReason() {
		return reinstateReason=data.get("REINSTATE_REASON").trim().equals("X") || data.get("REINSTATE_REASON").trim().length() == 0 ? DataFakers.reinstateReason() : 
			data.get("REINSTATE_REASON").trim();	
	}
	public String setDateOneMonthAhead() {
		return dateOneMonthAhead=data.get("DATE_ONE_MONTH_AHEAD").trim().equals("X") || data.get("DATE_ONE_MONTH_AHEAD").trim().length() == 0 ? DataFakers.dateOneMonthAhead() : 
			data.get("DATE_ONE_MONTH_AHEAD").trim();
		
	}
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
		
	}

}