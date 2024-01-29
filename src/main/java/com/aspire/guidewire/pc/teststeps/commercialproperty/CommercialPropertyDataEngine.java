package com.aspire.guidewire.pc.teststeps.commercialproperty;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;

@Getter
public class CommercialPropertyDataEngine {

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
	
	private String classCode;
	
	private String limit;

	private String coverageForm;
	
	private String currentDate;
	
	private String blanketType;
	
	private String groupType;
	
	private String deductible;
	
	private String billingMethod;
	
	private String paymentPlan;
	
	private String cancellationSource;
	
	private String cancellationReason;
	
	private String reinstatementReason;
	
	private String upfrontMethod;
	
	private String preRenewalDirection;
	
	private String preRenewalSecurity;
	
	private String preRenewalReason;
	
	private String preRenewalText;
	
	private String renewalCode;
	
	private String uwIssueType;
	
	private String longDescription;
	
	private String contingencyTitle;
	
	private String contingencyDescription;

	private String contingencyAction;
	
	private String effectiveDateOneMonthAhead;
	
	private String lossHistoryType;
	
	private String totalIncurred;
	
	private String documentName;
	
	private String uploadDocumentStatus;
	
	private String lossPercent;
	
	private String amount;
	
	private String fireProductionValue;
	
	private String coverage1;
	
	private String coverage2;
	
	private String coverage3;
	
	private String coverage4;
	
	private String value;
	
	private String ratingSheet;
	
	private String fileName;
	
	private String policyNumber;
	
	public CommercialPropertyDataEngine(String workBook,String sheetName,String testcaseID) {
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
		this.classCode=setClassCode();
		this.limit=setLimit();
		this.coverageForm=setCoverageForm();
		this.currentDate =setCurrentDate();
		this.blanketType =setBlanketType();
		this.deductible =setDeductible();
		this.billingMethod =setBillingMethod();
		this.paymentPlan =setPaymentPlan();
		this.groupType =setGroupType();
		this.reinstatementReason =setReinstatementReason();
		this.cancellationSource =setCancellationSource();
		this.cancellationReason=setCancellationReason();
		this.upfrontMethod=setUpfrontMethod();
		this.preRenewalDirection =setPreRenewalDirection();
		this.preRenewalSecurity =setPreRenewalSecurity();
		this.preRenewalReason=setPreRenewalReason();
		this.preRenewalText=setPreRenewalText();
		this.renewalCode=setRenewalCode();
		this.uwIssueType=setUwIssueType();
		this.longDescription=setLongDescription();
		this.contingencyTitle=setContingencyTitle();
		this.contingencyDescription=setContingencyDescription();
		this.contingencyAction=setContingencyAction();
		this.effectiveDateOneMonthAhead=setEffectiveDateOneMonthAhead();
		this.lossHistoryType=setLossHistoryType();
		this.totalIncurred=setTotalIncurred();
		this.documentName=setDocumentName();
		this.uploadDocumentStatus = setUploadDocumentStatus();
		this.lossPercent = setLossPercent();
		this.amount =setAmount();
		this.fireProductionValue=setFireProductionValue();
		this.coverage1 =setcoverage1();
		this.coverage2 =setcoverage2();
		this.coverage3 =setcoverage3();
		this.coverage4 =setcoverage4();
		this.value =setValue();
		this.ratingSheet =setRatingSheet();
		this.fileName =setFileName();
		this.policyNumber=setPolicyNumber();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X")  || data.get("FIRST_NAME").trim().length() == 0 ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X")  || data.get("LAST_NAME").trim().length() == 0 ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X")  || data.get("ADDRESS_LINE1").trim().length() == 0 ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length() == 0  ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X")  || data.get("CITY").trim().length() == 0 ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X")  || data.get("ZIPCODE").trim().length() == 0 ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}

	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X")  || data.get("ADDRESS_TYPE").trim().length() == 0 ? DataFakers.addressType() :
			data.get("ADDRESS_TYPE").trim();
	}
	
	public String setProducerOrganization() {
		return producerOrganization=data.get("PRODUCER_ORGANIZATION").trim().equals("X")  || data.get("PRODUCER_ORGANIZATION").trim().length() == 0 ? DataFakers.producerOrganization() :
			data.get("PRODUCER_ORGANIZATION").trim();
	}

	public String setOrganizationType() {
		return organizationType=data.get("ORGANIZATION_TYPE").trim().equals("X")  || data.get("ORGANIZATION_TYPE").trim().length() == 0 ? DataFakers.organizationType() :
			data.get("ORGANIZATION_TYPE").trim();
	}

	public String setPolicyTerm() {
		return policyTerm=data.get("POLICY_TERM").trim().equals("X")  || data.get("POLICY_TERM").trim().length() == 0 ? DataFakers.policyTerms() :
			data.get("POLICY_TERM").trim();
	}
	
	public String setCurrentDate() {
		return currentDate=data.get("CURRENT_DATE").trim().equals("X")  || data.get("CURRENT_DATE").trim().length() == 0 ? DataFakers.currentDate() : 
			data.get("CURRENT_DATE").trim();
	}
	
	public String setClassCode() {
		return classCode=data.get("CLASS_CODE").trim().equals("X")  || data.get("CLASS_CODE").trim().length() == 0 ? DataFakers.classCode() :
			data.get("CLASS_CODE").trim();
	}
	public String setLimit() {
		return limit=data.get("LIMIT").trim().equals("X")  || data.get("LIMIT").trim().length() == 0 ? DataFakers.limit() :
			data.get("LIMIT").trim();
	}
	public String setCoverageForm() {
		return coverageForm=data.get("COVERAGE_FORM").trim().equals("X")  || data.get("COVERAGE_FORM").trim().length() == 0 ? DataFakers.coverageForm() :
			data.get("COVERAGE_FORM").trim();
	}
	public String setBlanketType() {
		return blanketType=data.get("BLANKET_TYPE").trim().equals("X")  || data.get("BLANKET_TYPE").trim().length() == 0 ? DataFakers.blanketType() :
			data.get("BLANKET_TYPE").trim();
	}
	public String setGroupType() {
		return groupType=data.get("GROUP_TYPE").trim().equals("X")  || data.get("GROUP_TYPE").trim().length() == 0 ? DataFakers.groupType() :
			data.get("GROUP_TYPE").trim();
	}
	public String setDeductible() {
		return deductible=data.get("DEDUCTIBLE").trim().equals("X")  || data.get("DEDUCTIBLE").trim().length() == 0 ? DataFakers.deductible() :
			data.get("DEDUCTIBLE").trim();
	}
	public String setBillingMethod() {
		return billingMethod=data.get("BILLING_METHOD").trim().equals("X")  || data.get("BILLING_METHOD").trim().length() == 0 ? DataFakers.billingMethod() :
			data.get("BILLING_METHOD").trim();
	}
	public String setPaymentPlan() {
		return paymentPlan=data.get("PAYMENT_PLAN").trim().equals("X")  || data.get("PAYMENT_PLAN").trim().length() == 0 ? DataFakers.paymentPlan() :
			data.get("PAYMENT_PLAN").trim();
	}
	
	public String setCancellationSource() {
		return cancellationSource=data.get("CANCELLATION_SOURCE").trim().equals("X")  || data.get("CANCELLATION_SOURCE").trim().length() == 0 ? DataFakers.cancellationSource() : 
			data.get("CANCELLATION_SOURCE").trim();
	}
	
	public String setCancellationReason() {
		return cancellationReason=data.get("CANCELLATION_REASON").trim().equals("X")  || data.get("CANCELLATION_REASON").trim().length() == 0 ? DataFakers.cancellationReason() : 
			data.get("CANCELLATION_REASON").trim();
	}
	
	public String setReinstatementReason() {
		return reinstatementReason=data.get("REINSTATE_REASON").trim().equals("X")  || data.get("REINSTATE_REASON").trim().length() == 0 ? DataFakers.reinstatementReason() : 
			data.get("REINSTATE_REASON").trim();
	}
	public String setUpfrontMethod() {
		return upfrontMethod=data.get("UPFRONT_METHOD").trim().equals("X")  || data.get("UPFRONT_METHOD").trim().length() == 0 ? DataFakers.upfrontMethod() : 
			data.get("UPFRONT_METHOD").trim();
	}
	
	public String setPreRenewalDirection() {
		return preRenewalDirection=data.get("PRE_RENEWAL_DIRECTION").trim().equals("X")  || data.get("PRE_RENEWAL_DIRECTION").trim().length() == 0 ? DataFakers.preRenewalDirection() :
			data.get("PRE_RENEWAL_DIRECTION").trim();
	}
	
	public String setPreRenewalSecurity() {
		return preRenewalSecurity=data.get("PRE_RENEWAL_SECURITY").trim().equals("X")  || data.get("PRE_RENEWAL_SECURITY").trim().length() == 0 ? DataFakers.preRenewalSecurity() : 
			data.get("PRE_RENEWAL_SECURITY").trim();
	}
	
	public String setPreRenewalReason() {
		return preRenewalReason=data.get("PRE_RENEWAL_REASON").trim().equals("X")  || data.get("PRE_RENEWAL_REASON").trim().length() == 0 ? DataFakers.preRenewalReason() : 
			data.get("PRE_RENEWAL_REASON").trim();
	}
	public String setLossHistoryType() {
		return lossHistoryType=data.get("LOSS_HISTORY_TYPE").trim().equals("X") || data.get("LOSS_HISTORY_TYPE").trim().length() == 0 ? DataFakers.lossHistoryType() :
			data.get("LOSS_HISTORY_TYPE").trim();
	}
	public String setTotalIncurred() {
		return totalIncurred = data.get("TOTAL_INCURRED").trim().equals("X")  || data.get("TOTAL_INCURRED").trim().length() == 0 ? DataFakers.amount() :
			data.get("TOTAL_INCURRED").trim();
	}
	public String setPreRenewalText() {
		return preRenewalText=data.get("PRE_RENEWAL_TEXT").trim().equals("X")  || data.get("PRE_RENEWAL_TEXT").trim().length() == 0 ? DataFakers.generateRandomString("PreRenewalText") :
			data.get("PRE_RENEWAL_TEXT").trim();
	}
	public String setRenewalCode() {
		return renewalCode=data.get("RENEWAL_CODE").trim().equals("X")  || data.get("RENEWAL_CODE").trim().length() == 0 ? DataFakers.renewalCode():
			data.get("RENEWAL_CODE").trim();
	}
	public String setUwIssueType() {
		return uwIssueType=data.get("UW_ISSUE_TYPE").trim().equals("X")  || data.get("UW_ISSUE_TYPE").trim().length() == 0 ? DataFakers.uwIssueType() :
			data.get("UW_ISSUE_TYPE").trim();
	}
	public String setLongDescription() {
		return longDescription=data.get("LONG_DESCRIPTION").trim().equals("X")  || data.get("LONG_DESCRIPTION").trim().length() == 0 ? DataFakers.generateRandomString("Description") :
			data.get("LONG_DESCRIPTION").trim();
	}
	public String setContingencyTitle() {
		return contingencyTitle=data.get("CONTINGENCY_TITLE").trim().equals("X")  || data.get("CONTINGENCY_TITLE").trim().length() == 0 ? DataFakers.generateRandomString("Title-Contigency") : 
			data.get("CONTINGENCY_TITLE").trim();
	}
	public String setContingencyDescription() {
		return contingencyDescription=data.get("CONTINGENCY_DESCRIPTION").trim().equals("X")  || data.get("CONTINGENCY_DESCRIPTION").trim().length() == 0 ? DataFakers.generateRandomString("Desc-Contigency") : 
			data.get("CONTINGENCY_DESCRIPTION").trim();
	}
	public String setContingencyAction() {
		return contingencyAction=data.get("CONTINGENCY_ACTION").trim().equals("X")  || data.get("CONTINGENCY_ACTION").trim().length() == 0 ? DataFakers.contigencyAction(): 
			data.get("CONTINGENCY_ACTION").trim();
	}
	
	public String setEffectiveDateOneMonthAhead() {
		return effectiveDateOneMonthAhead=data.get("EFFECTIVE_DATE").trim().equals("X")  || data.get("EFFECTIVE_DATE").trim().length() == 0 ? DataFakers.dateOneMonthAhead() : 
			data.get("EFFECTIVE_DATE").trim();
	}
	public String setUploadDocumentStatus() {
		return uploadDocumentStatus = data.get("UPLOAD_DOCUMENT_STATUS").trim().equals("X")  || data.get("UPLOAD_DOCUMENT_STATUS").trim().length() == 0 ? DataFakers.status() :
			data.get("UPLOAD_DOCUMENT_STATUS").trim();
	}
	
	public String setLossPercent() {
		return lossPercent = data.get("LOSS_PERCENT").trim().equals("X")  || data.get("LOSS_PERCENT").trim().length() == 0 ? DataFakers.percent() :
			data.get("LOSS_PERCENT").trim();
	}
	
	public String setDocumentName() {
		return documentName = data.get("DOCUMENT_NAME").trim();
	}
	
	public String setAmount() {
		return amount = data.get("AMOUNT").trim().equals("X")  || data.get("AMOUNT").trim().length() == 0 ? DataFakers.amount() :
			data.get("AMOUNT").trim();
	}
	
	public String setFireProductionValue() {
		return fireProductionValue = data.get("FIRE_PRODUCTION_VALUE").trim();
    }
	public String setcoverage1() {
		return coverage1 = data.get("COVERAGE1").trim().equals("X")  || data.get("COVERAGE1").trim().length() == 0 ? DataFakers.coverage() :
			data.get("COVERAGE1").trim();
	}
	public String setcoverage2() {
		return coverage2 = data.get("COVERAGE2").trim().equals("X")  || data.get("COVERAGE2").trim().length() == 0 ? DataFakers.coverage() :
			data.get("COVERAGE2").trim();
	}
	public String setcoverage3() {
		return coverage3 = data.get("COVERAGE3").trim().equals("X")  || data.get("COVERAGE3").trim().length() == 0 ? DataFakers.coverage() :
			data.get("COVERAGE3").trim();
	}
	public String setcoverage4() {
		return coverage4 = data.get("COVERAGE4").trim().equals("X")  || data.get("COVERAGE4").trim().length() == 0 ? DataFakers.coverage() :
			data.get("COVERAGE4").trim();
	}
	public String setValue() {
		return value = data.get("VALUE").trim();
	}
	public String setRatingSheet() {
		return ratingSheet = data.get("RATING_SHEET").trim();
	}
	public String setFileName() {
		return fileName = data.get("FILE_NAME").trim();
	}
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim();
		
	}
}