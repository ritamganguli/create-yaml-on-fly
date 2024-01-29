package com.aspire.guidewire.pc.teststeps.commercialauto;

import java.util.HashMap;
import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;

@Getter
public class CommercialAutoDataEngine {

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

	private String cancellationSource;
	
	private String cancellationReason;
	
	private String reinstatementReason;
	
	private String effectiveDateOneMonthAhead;
	
	private String renewalCode;
	
	private String declinedReason;
	
	private String preRenewalDirection;
	
	private String preRenewalSecurity;
	
	private String preRenewalReason;
	
	private String preRenewalText;
	
	private String insuredType;
	
	private String offerings;
	
	private String product;
	
	private String currentDate;
	
	private String fleet;
	
	private String fleet2;
	
	private String vehicleType;
	
	private String cost;
	
	private String vin;
	
	private String yearFirstLicensed;
	
	private String dateOfBirth;
	
	private String licenseNumber;
	
	private String licenseState;
	
	private String policyTerm2;
	
	private String contingencyTitle;
	
	private String contingencyDescription;
	
	private String contingencyAction;
	
	private String uwIssueType;
	
	private String longDescription;
	
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
	
	private String policyNumber;

	public CommercialAutoDataEngine(String workBook,String sheetName,String testcaseID) {
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
		this.preRenewalDirection=setPreRenewalDirection();
		this.preRenewalSecurity=setPreRenewalSecurity();
		this.preRenewalReason=setPreRenewalReason();
		this.preRenewalText=setPreRenewalText();
		this.insuredType=setInsuredType();
		this.offerings=setOfferings();
		this.product =setProduct();
		this.currentDate =setCurrentDate();
		this.fleet =setFleet();
		this.fleet2 =setFleet2();
		this.vehicleType =setVehicleType();
		this.cost =setCost();
		this.vin =setVin();
		this.yearFirstLicensed =setYearFirstLicensed();
		this.dateOfBirth =setDateOfBirth();
		this.licenseNumber = setLicenseNumber();
		this.licenseState = setLicenseState();
		this.contingencyTitle =setContingencyTitle();
		this.contingencyDescription = setContingencyDescription();
		this.contingencyAction = setContingencyAction();
		this.uwIssueType = setUWIssueType();
		this.longDescription = setLongDescription();
		this.lossHistoryType = setLossHistoryType();
		this.openReserve = setOpenReserve();
		this.amount = setAmount();
		this.totalIncurred = setTotalIncurred();
		this.priorLoss = setPriorLoss();
		this.lossHistoryStatus = setLossHistoryStatus();
		this.lossPercent = setLossPercent();
		this.uploadDocumentStatus = setUploadDocumentStatus();
		this.documentName = setDocumentName();
		this.contingencyDocumentStatus =setContingencyDocumentStatus();
		this.contingencyDocumentType =setContingencyDocumentType();
		this.searchType = setSearchType();
		this.policyNumber = setPolicyNumber();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") || data.get("FIRST_NAME").trim().length() ==0  ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length() ==0  ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X") || data.get("ADDRESS_LINE1").trim().length() ==0 ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE").trim().length() ==0  ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length() ==0  ? DataFakers.city() :
			data.get("CITY").trim();
	}

	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X") || data.get("ZIPCODE").trim().length() ==0  ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}

	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X") || data.get("ADDRESS_TYPE").trim().length() ==0  ? DataFakers.addressType() :
			data.get("ADDRESS_TYPE").trim();
	}
	public String setInsuredType() {
		return insuredType=data.get("INSURED_TYPE").trim().equals("X") || data.get("INSURED_TYPE").trim().length() ==0  ? DataFakers.InsuredType() :
			data.get("INSURED_TYPE").trim();
	}
	
	public String setProducerOrganization() {
		return producerOrganization=data.get("PRODUCER_ORGANIZATION").trim().equals("X") || data.get("PRODUCER_ORGANIZATION").trim().length() ==0  ? DataFakers.producerOrganization() :
			data.get("PRODUCER_ORGANIZATION").trim();
	}

	public String setOrganizationType() {
		return organizationType=data.get("ORGANIZATION_TYPE").trim().equals("X") || data.get("ORGANIZATION_TYPE").trim().length() ==0  ? DataFakers.organizationType() :
			data.get("ORGANIZATION_TYPE").trim();
	}

	public String setProduct() {
		return product=data.get("PRODUCT").trim().equals("X") || data.get("PRODUCT").trim().length() ==0  ? DataFakers.product() : 
			data.get("PRODUCT").trim();
	}

	public String setPolicyTerm() {
		return policyTerm=data.get("POLICY_TERM").trim().equals("X") || data.get("POLICY_TERM").trim().length() ==0  ? DataFakers.policyTerms() :
			data.get("POLICY_TERM").trim();
	}
	public String setPolicyTerm2() {
		return policyTerm2=data.get("POLICY_TERM2").trim().equals("X") || data.get("POLICY_TERM2").trim().length() ==0  ? DataFakers.policyTerms() :
			data.get("POLICY_TERM2").trim();
	}
	
	public String setOfferings() {
		return offerings=data.get("OFFERINGS").trim().equals("X") || data.get("OFFERINGS").trim().length() ==0  ? DataFakers.offerings() : 
			data.get("OFFERINGS").trim();
	}
	
	public String setCurrentDate() {
		return currentDate=data.get("CURRENT_DATE").trim().equals("X") || data.get("CURRENT_DATE").trim().length() ==0  ? DataFakers.currentDate() : 
			data.get("CURRENT_DATE").trim();
	}
	
	public String setVin() {
		return vin=data.get("VIN").trim().equals("X") || data.get("VIN").trim().length() ==0  ? DataFakers.VIN() : 
			data.get("VIN").trim();
	}
	public String setYearFirstLicensed() {
		return yearFirstLicensed=data.get("YEAR_FIRST_LICENSED").trim().equals("X") || data.get("YEAR_FIRST_LICENSED").trim().length() ==0  ? DataFakers.currentYear() : 
			data.get("YEAR_FIRST_LICENSED").trim();
	}
	
	public String setFleet() {
		return fleet=data.get("FLEET").trim().equals("X")  || data.get("FLEET").trim().length() ==0 ? DataFakers.fleet() : 
			data.get("FLEET").trim();
	}
	public String setFleet2() {
		return fleet2=data.get("FLEET2").trim().equals("X") || data.get("FLEET2").trim().length() ==0 ? DataFakers.fleet() : 
			data.get("FLEET2").trim();
	}
	public String setVehicleType() {
		return vehicleType=data.get("VEHICLE_TYPE").trim().equals("X") || data.get("VEHICLE_TYPE").trim().length() ==0 ? DataFakers.vehicleType() : 
			data.get("VEHICLE_TYPE").trim();
	}
	public String setCost() {
		return cost=data.get("COST").trim().equals("X") || data.get("COST").trim().length() ==0 ? DataFakers.costOfVehicle() : 
			data.get("COST").trim();
	}
	public String setDateOfBirth() {
		return dateOfBirth=data.get("DOB").trim().equals("X") || data.get("DOB").trim().length() ==0 ? DataFakers.dateOfBirth() : 
			data.get("DOB").trim();
	}
	public String setLicenseNumber() {
		return licenseState=data.get("LICENSE_STATE").trim().equals("X") || data.get("LICENSE_STATE").trim().length() ==0 ? DataFakers.licenseNumber() : 
			data.get("LICENSE_STATE").trim();
	}
	public String setLicenseState() {
		return licenseNumber=data.get("LICENSE_NUMBER").trim().equals("X") || data.get("LICENSE_NUMBER").trim().length() ==0  ? DataFakers.state() : 
			data.get("LICENSE_NUMBER").trim();
	}

	public String setCancellationSource() {
		return cancellationSource=data.get("CANCELLATION_SOURCE").trim().equals("X") || data.get("CANCELLATION_SOURCE").trim().length() ==0  ? DataFakers.cancellationSource() : 
			data.get("CANCELLATION_SOURCE").trim();
	}
	
	public String setCancellationReason() {
		return cancellationReason=data.get("CANCELLATION_REASON").trim().equals("X") || data.get("CANCELLATION_REASON").trim().length() ==0  ? DataFakers.cancellationReason() : 
			data.get("CANCELLATION_REASON").trim();
	}
	
	public String setReinstatementReason() {
		return reinstatementReason=data.get("REINSTATE_REASON").trim().equals("X") || data.get("REINSTATE_REASON").trim().length() ==0  ? DataFakers.reinstatementReason() : 
			data.get("REINSTATE_REASON").trim();
	}
	
	public String setEffectiveDateOneMonthAhead() {
		return effectiveDateOneMonthAhead=data.get("EFFECTIVE_DATE").trim().equals("X") || data.get("EFFECTIVE_DATE").trim().length() ==0 ? DataFakers.dateOneMonthAhead() : 
			data.get("EFFECTIVE_DATE").trim();
	}
	
	public String setRenewalCode() {
		return renewalCode=data.get("RENEWAL_CODE").trim().equals("X") || data.get("RENEWAL_CODE").trim().length() ==0 ? DataFakers.renewalCode() : 
			data.get("RENEWAL_CODE").trim();
	}
	
	public String setPreRenewalDirection() {
		return preRenewalDirection=data.get("PRE_RENEWAL_DIRECTION").trim().equals("X") || data.get("PRE_RENEWAL_DIRECTION").trim().length() ==0 ? DataFakers.preRenewalDirection() :
			data.get("PRE_RENEWAL_DIRECTION").trim();
	}
	
	public String setPreRenewalSecurity() {
		return preRenewalSecurity=data.get("PRE_RENEWAL_SECURITY").trim().equals("X") || data.get("PRE_RENEWAL_SECURITY").trim().length() ==0 ? DataFakers.preRenewalSecurity() : 
			data.get("PRE_RENEWAL_SECURITY").trim();
	}
	
	public String setPreRenewalReason() {
		return preRenewalReason=data.get("PRE_RENEWAL_REASON").trim().equals("X") || data.get("PRE_RENEWAL_REASON").trim().length() ==0 ? DataFakers.preRenewalReason() : 
			data.get("PRE_RENEWAL_REASON").trim();
	}
	
	public String setPreRenewalText() {
		return preRenewalText=data.get("PRE_RENEWAL_TEXT").trim().equals("X") || data.get("PRE_RENEWAL_TEXT").trim().length() ==0 ? DataFakers.generateRandomString("PreRenewalText") : 
			data.get("PRE_RENEWAL_TEXT").trim();
	}
	public String setContingencyTitle() {
		return contingencyTitle=data.get("CONTINGENCY_TITLE").trim().equals("X") || data.get("CONTINGENCY_TITLE").trim().length() ==0 ? DataFakers.generateRandomString("Title-Contigency") : 
			data.get("CONTINGENCY_TITLE").trim();
	}
	public String setContingencyDescription() {
		return contingencyDescription=data.get("CONTINGENCY_DESCRIPTION").trim().equals("X") || data.get("CONTINGENCY_DESCRIPTION").trim().length() ==0 ? DataFakers.generateRandomString("Desc-Contigency") : 
			data.get("CONTINGENCY_DESCRIPTION").trim();
	}
	public String setContingencyAction() {
		return contingencyAction=data.get("CONTINGENCY_ACTION").trim().equals("X") || data.get("CONTINGENCY_ACTION").trim().length() ==0 ? DataFakers.contigencyAction(): 
			data.get("CONTINGENCY_ACTION").trim();
	}
	public String setUWIssueType() {
		return uwIssueType=data.get("UW_ISSUE_TYPE").trim().equals("X") || data.get("UW_ISSUE_TYPE").trim().length() ==0 ? DataFakers.uwIssueType() :
			data.get("UW_ISSUE_TYPE").trim();
	}
	public String setLongDescription() {
		return longDescription=data.get("LONG_DESCRIPTION").trim().equals("X") || data.get("LONG_DESCRIPTION").trim().length() ==0 ? DataFakers.generateRandomString("Description") :
			data.get("LONG_DESCRIPTION").trim();
	}
	public String setLossHistoryType() {
		return lossHistoryType=data.get("LOSS_HISTORY_TYPE").trim().equals("X") || data.get("LOSS_HISTORY_TYPE").trim().length() ==0  ? DataFakers.lossHistoryType() :
			data.get("LOSS_HISTORY_TYPE").trim();
	}
	public String setTotalIncurred() {
		return totalIncurred = data.get("TOTAL_INCURRED").trim().equals("X") || data.get("TOTAL_INCURRED").trim().length() ==0 ? DataFakers.amount() :
			data.get("TOTAL_INCURRED").trim();
	}
	public String setPriorLoss() {
		return priorLoss = data.get("PRIOR_LOSS").trim().equals("X") || data.get("PRIOR_LOSS").trim().length() ==0 ? DataFakers.generateRandomString("PriorLoss") :
			data.get("PRIOR_LOSS").trim();
	}
	public String setAmount() {
		return amount = data.get("AMOUNT").trim().equals("X") || data.get("AMOUNT").trim().length() ==0 ? DataFakers.amount() :
			data.get("AMOUNT").trim();
	}
	public String setOpenReserve() {
		return openReserve = data.get("OPEN_RESERVE").trim().equals("X") || data.get("OPEN_RESERVE").trim().length() ==0 ? DataFakers.amount() :
			data.get("OPEN_RESERVE").trim();
	}
	public String setLossHistoryStatus() {
		return lossHistoryStatus = data.get("LOSS_HISTORY_STATUS").trim().equals("X") || data.get("LOSS_HISTORY_STATUS").trim().length() ==0 ? DataFakers.lossHistoryStatus() :
			data.get("LOSS_HISTORY_STATUS").trim();
	}
	public String setLossPercent() {
		return lossPercent = data.get("LOSS_PERCENT").trim().equals("X") || data.get("LOSS_PERCENT").trim().length() ==0 ? DataFakers.amount() :
			data.get("LOSS_PERCENT").trim();
	}
	public String setUploadDocumentStatus() {
		return uploadDocumentStatus = data.get("UPLOAD_DOCUMENT_STATUS").trim().equals("X") || data.get("UPLOAD_DOCUMENT_STATUS").trim().length() ==0 ? DataFakers.status() :
			data.get("UPLOAD_DOCUMENT_STATUS").trim();
	}
	public String setDocumentName() {
		return documentName = data.get("DOCUMENT_NAME").trim();
	}
	public String setContingencyDocumentStatus() {
		return contingencyDocumentStatus = data.get("CONTINGENCY_STATUS").trim().equals("X") || data.get("CONTINGENCY_STATUS").trim().length() ==0 ? DataFakers.status() :
			data.get("CONTINGENCY_STATUS").trim();
	}
	public String setContingencyDocumentType() {
		return contingencyDocumentType = data.get("CONTINGENCY_TYPE").trim().equals("X") || data.get("STATE").trim().length() ==0 ? DataFakers.contingencyDocumentType() :
			data.get("CONTINGENCY_TYPE").trim();
	}
	public String setSearchType() {
		return searchType = data.get("SEARCH_TYPE").trim().equals("X") || data.get("SEARCH_TYPE").trim().length() ==0 ? DataFakers.searchType() :
			data.get("SEARCH_TYPE").trim();
	}
	public String setPolicyNumber() {
		return policyNumber = data.get("POLICY_NUMBER").trim();
	}

}