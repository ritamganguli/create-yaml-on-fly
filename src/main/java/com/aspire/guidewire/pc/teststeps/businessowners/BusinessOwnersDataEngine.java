package com.aspire.guidewire.pc.teststeps.businessowners;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;

import lombok.Getter;

@Getter
public class BusinessOwnersDataEngine {

	HashMap<String,String> data;

	private String firstName;

	private String lastName;

	private String addressLine1;

	private String state;

	private String city;

	private String zipcode;

	private String addressType;

	private String organizationType;

	private String organizationType2;

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

	private String effectiveDateOneMonthAhead;

	private String upFrontPayment;

	private String renewalCode;

	private String notTakenReason;

	private String declinedReason;

	private String preRenewalDirection;

	private String preRenewalSecurity;

	private String preRenewalReason;

	private String preRenewalText;

	private String insuredType;

	private String producerCode;

	private String offerings;

	private String product;

	private String currentDate;

	private String fleet;

	private String fleet2;

	private String vehicleType;

	private String cost;

	private String yearFirstLicensed;

	private String contingencyTitle;

	private String contingencyDescription;

	private String contingencyAction;

	private String uwIssueType;

	private String lossHistoryType;

	private String totalIncurred;

	private String priorLoss;

	private String amount;

	private String openReserve;

	private String lossHistoryStatus;

	private String lossPercent;

	private String uploadDocumentStatus;

	private String documentName;

	private String contingencyDocumentStatus;

	private String contingencyDocumentType;

	private String searchType;

	private String policyNo;

	private String amountPaid;

	private String reinstateReason;	

	private String description;	
	
	private String organization;
	
	private String businessType;
	
	public BusinessOwnersDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.addressLine1=setAddressLine1();
		this.state=setState();
		this.city=setCity();
		this.zipcode=setZipcode();
		this.openReserve = setOpenReserve();
		this.amount = setAmount();
		this.lossHistoryStatus = setLossHistoryStatus();
		this.lossPercent = setLossPercent();
		this.policyNo = setPolicyNo();
		this.cancellationSource=setCancellationSource();
		this.cancellationReason=setCancellationReason();
		this.renewalCode=setRenewalCode();
		this.contingencyAction = setContingencyAction();
		this.uwIssueType = setUWIssueType();
		this.contingencyDocumentStatus =setContingencyDocumentStatus();
		this.contingencyDocumentType =setContingencyDocumentType();
		this.lossHistoryType = setLossHistoryType();
		this.totalIncurred = setTotalIncurred();
		this.uploadDocumentStatus = setUploadDocumentStatus();
		this.reinstateReason=setReinstateReason();
		this.addressType =setAddressType();
		this.organizationType=setOrganizationType();
		this.effectiveDateOneMonthAhead=setEffectiveDateOneMonthAhead();
		this.contingencyDescription = setContingencyDescription();
		this.priorLoss=setPriorLoss();
		this.description=setDescription();
		this.amountPaid=setAmountPaid();
		this.offerings =setOfferings();
		this.organization=setOrganization();
		this.businessType=setBusinessType();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X") ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") ? DataFakers.state() :
			data.get("STATE").trim();
	}

	public String setCity() {
		return city=data.get("CITY").trim().equals("X") ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X") ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}

	public String setAmount() {
		return amount = data.get("AMOUNT").trim().equals("X") ? DataFakers.amount() :
			data.get("AMOUNT").trim();
	}

	public String setOpenReserve() {
		return openReserve = data.get("OPEN_RESERVE").trim().equals("X") ? DataFakers.amount() :
			data.get("OPEN_RESERVE").trim();
	}

	public String setLossHistoryStatus() {
		return lossHistoryStatus = data.get("LOSS_HISTORY_STATUS").trim().equals("X") ? DataFakers.lossHistoryStatus() :
			data.get("LOSS_HISTORY_STATUS").trim();
	}

	public String setLossPercent() {
		return lossPercent = data.get("LOSS_PERCENT").trim().equals("X") ? DataFakers.percentage() :
			data.get("LOSS_PERCENT").trim();
	}

	public String setPolicyNo() {
		return policyNo = data.get("POLICYNO").trim();
	}

	public String setCancellationSource() {
		return cancellationSource=data.get("CANCELLATION_SOURCE").trim().equals("X") ? DataFakers.cancellationSource() : 
			data.get("CANCELLATION_SOURCE").trim();
	}

	public String setCancellationReason() {
		return cancellationReason=data.get("CANCELLATION_REASON").trim().equals("X") ? DataFakers.cancellationReason() : 
			data.get("CANCELLATION_REASON").trim();
	}

	public String setRenewalCode() {
		return renewalCode=data.get("RENEWAL_CODE").trim().equals("X") ? DataFakers.renewalCode() : 
			data.get("RENEWAL_CODE").trim();
	}

	public String setContingencyAction() {
		return contingencyAction=data.get("CONTINGENCY_ACTION").trim().equals("X") ? DataFakers.contigencyAction(): 
			data.get("CONTINGENCY_ACTION").trim();
	}

	public String setUWIssueType() {
		return uwIssueType=data.get("UW_ISSUE_TYPE").trim().equals("X") ? DataFakers.uwIssueType() :
			data.get("UW_ISSUE_TYPE").trim();
	}

	public String setContingencyDocumentStatus() {
		return contingencyDocumentStatus = data.get("CONTINGENCY_STATUS").trim().equals("X") ? DataFakers.status() :
			data.get("CONTINGENCY_STATUS").trim();
	}

	public String setContingencyDocumentType() {
		return contingencyDocumentType = data.get("CONTINGENCY_TYPE").trim().equals("X") ? DataFakers.contingencyDocumentType() :
			data.get("CONTINGENCY_TYPE").trim();
	}

	public String setLossHistoryType() {
		return lossHistoryType=data.get("LOSS_HISTORY_TYPE").trim().equals("X") ? DataFakers.lossHistoryType() :
			data.get("LOSS_HISTORY_TYPE").trim();
	}

	public String setTotalIncurred() {
		return totalIncurred = data.get("TOTAL_INCURRED").trim().equals("X") ? DataFakers.amount() :
			data.get("TOTAL_INCURRED").trim();
	}

	public String setUploadDocumentStatus() {
		return uploadDocumentStatus = data.get("UPLOAD_DOCUMENT_STATUS").trim().equals("X") ? DataFakers.status() :
			data.get("UPLOAD_DOCUMENT_STATUS").trim();
	}

	public String setReinstateReason() {
		return reinstateReason=data.get("REINSTATE_REASON").trim().equals("X") ? DataFakers.reinstateReason() : 
			data.get("REINSTATE_REASON").trim();	
	}

	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X") ? DataFakers.addressType() : 
			data.get("ADDRESS_TYPE").trim();	
	}

	public String setOrganizationType() {
		return organizationType=data.get("ORGANIZATION_TYPE").trim().equals("X") ? DataFakers.organizationType() :
			data.get("ORGANIZATION_TYPE").trim();
	}

	public String setEffectiveDateOneMonthAhead() {
		return effectiveDateOneMonthAhead=data.get("EFFECTIVE_DATE").trim().equals("X") ? DataFakers.dateOneMonthAhead() : 
			data.get("EFFECTIVE_DATE").trim();
	}

	public String setContingencyDescription() {
		return contingencyDescription=data.get("CONTINGENCY_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("Contigency") : 
			data.get("CONTINGENCY_DESCRIPTION").trim();
	}

	public String setPriorLoss() {
		return priorLoss=data.get("PRIOR_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("PriorLoss") : 
			data.get("PRIOR_DESCRIPTION").trim();
	}

	public String setDescription() {
		return description=data.get("DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("Description") :
			data.get("DESCRIPTION").trim();
	}

	public String setAmountPaid() {
		return amount = data.get("AMOUNT_PAID").trim().equals("X") ? DataFakers.amount() :
			data.get("AMOUNT_PAID").trim();
	}
	public String setOfferings() {
		return offerings=data.get("OFFERINGS").trim().equals("X") ? DataFakers.offerings() : 
			data.get("OFFERINGS").trim();	
	}
	
	public String setOrganization() {
		return organization=data.get("ORGANIZATION").trim().equals("X") ? DataFakers.producerOrganization() :
			data.get("ORGANIZATION").trim();
	}
	public String setBusinessType() {
		return businessType=data.get("BUSINESS_TYPE").trim().equals("X") ? DataFakers.businessType() :
			data.get("BUSINESS_TYPE").trim();
	}
	
}