package com.aspire.guidewire.pc.teststeps.homeowners;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;

import lombok.Getter;


@Getter
public class HomeOwnersDataEngine {

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
	
	private String policyNo;
	
	private String basis;
	
	private String documentType;
	
	private String documentName;
	
	private String status;
		
	private String uwIssueType;
		
	private String fileName;
		
	private String contingencyAction;
	
	private String contingencyDocumentType;
		
	private String offerings;
		
	private String policyTerm2;
	
	private String policyNumber;
	
	private String policyType;
	
	private String coverageForm;
	
	private String dwellingOccupied;
	
	private String dwellingFullTime;
	
	private String fireProtection;
	
	private String fireProtection2;

	private String coInsurance;
	
	private String rentalIncome;
	
	private String prohibitedUse;
	
	private String covCLimit;

	private String valuationMethod;
	
	private String dateSixMonthAhead;
	
	private String preRenewalReason;
	
	private String contingencyDescription;

	private String contigencyStatus;
	
	private String description;
	
	private String dwellingOccupied2;
	
	private String errorMessage;
	
	private String losses;

	private String annualPremium;

	private String totalLosses;

	private String emailBody;
	
	private String value;
	
	private String factorialVal;

	private String limit;

	private String coverage1;

	private String coverage2;

	private String coverage3;

	private String coverage4;

	private String emailMessage;
	
	public HomeOwnersDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.addressLine1=setAddressLine1();
		this.state=setState();
		this.city=setCity();
		this.zipcode=setZipcode();
		this.currentYear=setCurrentYear();
		this.producerOrganization=setProducerOrganization();
		this.currentDate=setCurrentDate();
		this.source=setSource();
		this.reinstateReason=setReinstateReason();
		this.reason=setReason();
		this.renewalCode=setRenewalCode();
		this.dateOneMonthAhead=setDateOneMonthAhead();
		this.reasonNotTaken=setReasonNotTaken();
		this.reasonDeclined=setReasonDeclined();
		this.carrier=setCarrier();
		this.documentType=setDocumentType();
		this.uwIssueType=setUwIssueType();
		this.fileName=setFileName();
		this.contingencyAction=setContingencyAction();
		this.contingencyDocumentType=setContingencyDocumentType();
		this.policyTerm =setPolicyTerm();
		this.policyTerm2 =setPolicyTerm2();
		this.addressType =setAddressType();
		this.policyNumber=setPolicyNumber();
		this.policyType=setPolicyType();
		this.coverageForm=setCoverageForm();
		this.dwellingOccupied=setDwellingOccupied();
		this.dwellingFullTime=setDwellingFullTime();
		this.fireProtection=setFireProtection();
		this.fireProtection2=setFireProtection2();
		this.coInsurance=setCoInsurance();
		this.rentalIncome=setRentalIncome();
		this.prohibitedUse=setProhibitedUse();
		this.covCLimit=setCovCLimit();
		this.valuationMethod=setValuationMethod();
		this.dateSixMonthAhead=setDateSixMonthAhead();
		this.preRenewalReason=setPreRenewalReason();
		this.security=setSecurity();
		this.direction=setDirection();
		this.text=setText();
		this.contingencyDescription = setContingencyDescription();
		this.contigencyStatus=setContigencyStatus();
		this.description=setDescription();
		this.dwellingOccupied2=setDwellingOccupied2();
		this.errorMessage=setErrorMessage();
		this.losses=setLosses();
		this.annualPremium=setAnnualPremium();
		this.totalLosses=setTotalLosses();
		this.emailBody=setEmailBody();
		this.emailMessage=setEmailMessage();
		this.value=setValue();
		this.factorialVal=setFactorialValue();
		this.coverage1=setCoverage1();
		this.coverage2=setCoverage2();
		this.coverage3=setCoverage3();
		this.coverage4=setCoverage4();
		this.limit=setLimit();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") || data.get("FIRST_NAME").trim().length() == 0? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length() ==0 ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X")|| data.get("ADDRESS_LINE1").trim().length() ==0 ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X")|| data.get("STATE").trim().length() ==0  ? DataFakers.state() :
			data.get("STATE").trim();
	}

	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length() ==0? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X")|| data.get("ZIPCODE").trim().length() ==0 ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}

	
	public String setCurrentYear() {
		return currentYear=data.get("CURRENT_YEAR").trim().equals("X")|| data.get("CURRENT_YEAR").trim().length() ==0 ? DataFakers.currentYear() : 
			data.get("CURRENT_YEAR").trim();
		
	}
	
	public String setProducerOrganization() {
		return producerOrganization=data.get("PRODUCER_ORGANIZATION").trim().equals("X") || data.get("PRODUCER_ORGANIZATION").trim().length() ==0? DataFakers.producerOrganization() :
			data.get("PRODUCER_ORGANIZATION").trim();
	}

	public String setCurrentDate() {
		return currentDate=data.get("CURRENT_DATE").trim().equals("X")|| data.get("CURRENT_DATE").trim().length() ==0 ? DataFakers.currentDate() : 
			data.get("CURRENT_DATE").trim();
		
	}
	
	public String setSource() {
		return source=data.get("SOURCE").trim().equals("X")|| data.get("SOURCE").trim().length() ==0 ? DataFakers.source() : 
			data.get("SOURCE").trim();
		
	}
	
	public String setReinstateReason() {
		return reinstateReason=data.get("REINSTATE_REASON").trim().equals("X")|| data.get("REINSTATE_REASON").trim().length() ==0 ? DataFakers.reinstateReason() : 
			data.get("REINSTATE_REASON").trim();
		
	}
	
	public String setReason() {
		return reason=data.get("REASON").trim().equals("X")|| data.get("REASON").trim().length() ==0 ? DataFakers.reason() : 
			data.get("REASON").trim();
		
	}
	
	public String setRenewalCode() {
		return renewalCode=data.get("RENEWAL_CODE").trim().equals("X") || data.get("RENEWAL_CODE").trim().length() ==0? DataFakers.renewalCode() : 
			data.get("RENEWAL_CODE").trim();
		
	}
	public String setDateOneMonthAhead() {
		return dateOneMonthAhead=data.get("DATE_ONE_MONTH_AHEAD").trim().equals("X") || data.get("DATE_ONE_MONTH_AHEAD").trim().length() ==0? DataFakers.dateOneMonthAhead() : 
			data.get("DATE_ONE_MONTH_AHEAD").trim();
		
	}
	public String setReasonNotTaken() {
		return reasonNotTaken=data.get("REASON_NOT_TAKEN").trim().equals("X")|| data.get("REASON_NOT_TAKEN").trim().length() ==0 ? DataFakers.reasonNotTaken() : 
			data.get("REASON_NOT_TAKEN").trim();
		
	}
	public String setReasonDeclined() {
		return reasonDeclined=data.get("REASON_DECLINED").trim().equals("X")|| data.get("REASON_DECLINED").trim().length() ==0 ? DataFakers.reasonDeclined() : 
			data.get("REASON_DECLINED").trim();
		
	}

	public String setUwIssueType() {
		return uwIssueType=data.get("UW_ISSUE_TYPE").trim().equals("X")|| data.get("UW_ISSUE_TYPE").trim().length() ==0 ? DataFakers.uwIssueType() : 
			data.get("UW_ISSUE_TYPE").trim();	
	}
	public String setFileName() {
		return fileName=data.get("FILE_NAME").trim().equals("X") || data.get("FILE_NAME").trim().length() ==0? DataFakers.generateRandomString("file") : 
			data.get("FILE_NAME").trim();	
	}
	public String setContingencyAction() {
		return contingencyAction=data.get("CONTIGENCY_ACTION").trim().equals("X")|| data.get("CONTIGENCY_ACTION").trim().length() ==0 ? DataFakers.contigencyAction() : 
			data.get("CONTIGENCY_ACTION").trim();	
	}
	public String setContingencyDocumentType() {
		return contingencyDocumentType=data.get("CONTIGENCY_DOCUMENT_TYPE").trim().equals("X")|| data.get("CONTIGENCY_DOCUMENT_TYPE").trim().length() ==0 ? DataFakers.contingencyDocumentType() : 
			data.get("CONTIGENCY_DOCUMENT_TYPE").trim();	
	}

	public String setPolicyTerm() {
		return policyTerm=data.get("POLICY_TERM").trim().equals("X") || data.get("POLICY_TERM").trim().length() ==0? DataFakers.policyTerm() : 
			data.get("POLICY_TERM").trim();	
	}
	
	public String setPolicyTerm2() {
		return policyTerm2=data.get("POLICY_TERM2").trim().equals("X") || data.get("POLICY_TERM2").trim().length() ==0? DataFakers.policyTerm() : 
			data.get("POLICY_TERM2").trim();	
	}
	
	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X")|| data.get("ADDRESS_TYPE").trim().length() ==0 ? DataFakers.addressType() : 
			data.get("ADDRESS_TYPE").trim();	
	}
	
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
	}
	
	public String setPolicyType() {
		return policyType=data.get("POLICY_TYPE").trim().equals("X") || data.get("POLICY_TYPE").trim().length() ==0? DataFakers.policyType() :
			data.get("POLICY_TYPE").trim();
	}
	public String setCoverageForm() {
		return coverageForm=data.get("COVERAGE_FORM").trim().equals("X")|| data.get("COVERAGE_FORM").trim().length() ==0 ? DataFakers.coverageForm() :
			data.get("COVERAGE_FORM").trim();
	}
	public String setDwellingOccupied() {
		return dwellingOccupied=data.get("DWELLING_OCCUPIED").trim().equals("X")|| data.get("DWELLING_OCCUPIED").trim().length() ==0 ? DataFakers.dwellingOccupied() :
			data.get("DWELLING_OCCUPIED").trim();
	}
	
	public String setDwellingOccupied2() {
		return dwellingOccupied2=data.get("DWELLING_OCCUPIED2").trim().equals("X") || data.get("DWELLING_OCCUPIED2").trim().length() ==0? DataFakers.dwellingOccupied() :
			data.get("DWELLING_OCCUPIED2").trim();
	}
	public String setDwellingFullTime() {
		return dwellingFullTime=data.get("DWELLING_FULL_TIME").trim().equals("X")|| data.get("DWELLING_FULL_TIME").trim().length() ==0 ? DataFakers.dwellingFullTime() :
			data.get("DWELLING_FULL_TIME").trim();
	}
	
	public String setFireProtection() {
		return fireProtection=data.get("FIRE_PROTECTION").trim().equals("X") || data.get("FIRE_PROTECTION").trim().length() ==0? DataFakers.fireProtection() :
			data.get("FIRE_PROTECTION").trim();
	}
	public String setCoInsurance() {
		return coInsurance=data.get("COINSURANCE").trim().equals("X") || data.get("COINSURANCE").trim().length() ==0? DataFakers.coInsurance() :
			data.get("COINSURANCE").trim();
	}
	public String setRentalIncome() {
		return rentalIncome=data.get("RENTAL_INCOME").trim().equals("X")|| data.get("RENTAL_INCOME").trim().length() ==0 ? DataFakers.rentalIncome() :
			data.get("RENTAL_INCOME").trim();
	}
	public String setProhibitedUse() {
		return prohibitedUse=data.get("PROHIBITED_USE").trim().equals("X") || data.get("PROHIBITED_USE").trim().length() ==0? DataFakers.prohibitedUse() :
			data.get("PROHIBITED_USE").trim();
	}
	public String setFireProtection2() {
		return fireProtection2=data.get("FIRE_PROTECTION2").trim().equals("X") || data.get("FIRE_PROTECTION2").trim().length() ==0? DataFakers.fireProtection() :
			data.get("FIRE_PROTECTION2").trim();
	}
	public String setCovCLimit() {
		return covCLimit=data.get("COVC_LIMIT").trim().equals("X") || data.get("COVC_LIMIT").trim().length() ==0? DataFakers.covCLimit() :
			data.get("COVC_LIMIT").trim();
	}
	public String setValuationMethod() {
		return valuationMethod=data.get("VALUATION_METHOD").trim().equals("X") || data.get("VALUATION_METHOD").trim().length() ==0? DataFakers.valuationMethod() :
			data.get("VALUATION_METHOD").trim();
	}
	public String setDateSixMonthAhead() {
		return dateSixMonthAhead=data.get("DATE_SIX_MONTH_AHEAD").trim().equals("X") || data.get("DATE_SIX_MONTH_AHEAD").trim().length() ==0? DataFakers.dateSixMonthAhead() : 
			data.get("DATE_SIX_MONTH_AHEAD").trim();
	}
	public String setPreRenewalReason() {
		return preRenewalReason=data.get("PRE_RENEWAL_REASON").trim().equals("X")|| data.get("PRE_RENEWAL_REASON").trim().length() ==0 ? DataFakers.preRenewalReason() : 
			data.get("PRE_RENEWAL_REASON").trim();
	}
	public String  setText() {
		return text=data.get("TEXT").trim().equals("X")|| data.get("TEXT").trim().length() ==0 ? DataFakers.generateRandomString("PreRenewalText") : 
			data.get("TEXT").trim();
	}
	public String setDirection() {
		return direction=data.get("DIRECTION").trim().equals("X") || data.get("DIRECTION").trim().length() ==0? DataFakers.direction() : 
			data.get("DIRECTION").trim();
	}
	public String setSecurity() {
		return security=data.get("SECURITY").trim().equals("X")|| data.get("SECURITY").trim().length() ==0 ? DataFakers.security() : 
			data.get("SECURITY").trim();
	}
	public String setContingencyDescription() {
		return contingencyDescription=data.get("CONTIGENCY_DESCRIPTION").trim().equals("X") || data.get("CONTIGENCY_DESCRIPTION").trim().length() ==0? DataFakers.generateRandomString("Desc-Contigency") : 
			data.get("CONTIGENCY_DESCRIPTION").trim();
	}
	
	public String setContigencyStatus() {
		return contigencyStatus=data.get("CONTIGENCY_STATUS").trim().equals("X") || data.get("CONTIGENCY_STATUS").trim().length() ==0? DataFakers.contigencyStatus() : 
			data.get("CONTIGENCY_STATUS").trim();
	}
	
	public String setDescription() {
		return description=data.get("DESCRIPTION").trim().equals("X")|| data.get("DESCRIPTION").trim().length() ==0 ? DataFakers.generateRandomString("Desc-") : 
			data.get("DESCRIPTION").trim();
	}
	
	public String setErrorMessage() {
		return errorMessage=data.get("ERROR_MESSAGE").trim().equals("X") || data.get("ERROR_MESSAGE").trim().length() ==0 ? DataFakers.errorMessage() : 
			data.get("ERROR_MESSAGE").trim();
	}
	
	public String setCarrier() {
		return carrier=data.get("CARRIER_TITLE").trim().equals("X")|| data.get("CARRIER_TITLE").trim().length() ==0 ? DataFakers.generateRandomString("Carrier ") : 
			data.get("CARRIER_TITLE").trim();
	}
	public String setLosses() {
		return losses=data.get("LOSSES").trim().equals("X")|| data.get("LOSSES").trim().length() ==0 ? DataFakers.generateNumerics("losses ") : 
			data.get("LOSSES").trim();
	}
	public String setAnnualPremium() {
		return annualPremium=data.get("ANNUAL_PREMIUM").trim().equals("X") || data.get("ANNUAL_PREMIUM").trim().length() ==0? DataFakers.generateNumerics("annual Premium ") : 
			data.get("ANNUAL_PREMIUM").trim();
	}
	public String setTotalLosses() {
		return totalLosses=data.get("TOTAL_LOSSES").trim().equals("X")|| data.get("TOTAL_LOSSES").trim().length() ==0 ? DataFakers.generateNumerics("total losses ") : 
			data.get("TOTAL_LOSSES").trim();
	}
	
	public String setDocumentType() {
		return documentType=data.get("DOCUMENT_TYPE").trim().equals("X")|| data.get("DOCUMENT_TYPE").trim().length() ==0 ? DataFakers.documentType() : 
			data.get("DOCUMENT_TYPE").trim();
	}
	public String setEmailBody() {
		return emailBody=data.get("EMAIL_BODY").trim().equals("X") || data.get("EMAIL_BODY").trim().length() ==0? DataFakers.generateRandomString("Email body") : 
			data.get("EMAIL_BODY").trim();
	}
	public String setEmailMessage() {
		return emailMessage=data.get("EMAIL_MESSAGE").trim().equals("X")|| data.get("EMAIL_MESSAGE").trim().length() ==0 ? DataFakers.generateRandomString("Email message") : 
			data.get("EMAIL_MESSAGE").trim();
	}
	public String setValue() {
		return value=data.get("VALUE").trim().equals("X") || data.get("VALUE").trim().length() ==0? DataFakers.generateNumerics("") : 
			data.get("VALUE").trim();
	}
	public String setFactorialValue()  {
		return factorialVal=data.get("FACTORIAL_VAL").trim().equals("X")|| data.get("FACTORIAL_VAL").trim().length() ==0 ? DataFakers.generateNumerics("") : 
			data.get("FACTORIAL_VAL").trim();
	}
	public String setCoverage1() {
		return coverage1=data.get("COVERAGE1").trim().equals("X") || data.get("COVERAGE1").trim().length() ==0? DataFakers.generateRandomString("Email ") : 
			data.get("COVERAGE1").trim();
	}
	public String setCoverage2() {
		return coverage2=data.get("COVERAGE2").trim().equals("X")|| data.get("COVERAGE2").trim().length() ==0 ? DataFakers.generateRandomString("Email message") : 
			data.get("COVERAGE2").trim();
	}
	public String setCoverage3() {
		return coverage3=data.get("COVERAGE3").trim().equals("X")|| data.get("COVERAGE3").trim().length() ==0 ? DataFakers.generateRandomString("Email message") : 
			data.get("COVERAGE3").trim();
	}
	public String setCoverage4() {
		return coverage4=data.get("COVERAGE4").trim().equals("X") || data.get("COVERAGE4").trim().length() ==0? DataFakers.generateRandomString("Email message") : 
			data.get("COVERAGE4").trim();
	}
	public String setLimit() {
		return limit=data.get("LIMIT").trim().equals("X") || data.get("LIMIT").trim().length() ==0? DataFakers.generateNumerics("") : 
			data.get("LIMIT").trim();
	}
	
	
	
}