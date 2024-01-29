package com.aspire.guidewire.pc.teststeps.commercialpackage;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class CommercialPackageDataEngine {

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

	private String buildingDescription;

	private String businessClass;

	private String receptacleType;

	private String percentDuplicate;

	private String limit;

	private String contractorType;

	private String coinsurancePct;

	private String deductible;
	
	private String contractorDeductible;

	private String signType;

	private String cancellationSource;

	private String cancellationReason;

	private String reinstatementReason;

	private String effectiveDateOneMonthAhead;

	private String effectiveDateAsCurrentDate;
	
	private String upFrontPayment;

	private String renewalCode;

	private String preRenewalDirection;

	private String preRenewalSecurity;

	private String preRenewalReason;

	private String preRenewalText;

	private String offerings;

	private String packageRiskType;

	private String coverageForm;

	private String blanketType;

	private String groupType;
	
	private String coveragesType;

	private String policyBasis;

	private String basis;

	private String classCode;

	private String insuredType;
	
	private String location;
	
	private String uWIssueType;

	private String uWLongDescription;

	private String priorLossDescription;

	private String totalIncurred;
	
	private String amountPaid;
	
	private String lossHistoryStatus;

	private String openReserve;

	private String carrier;

	private String policyNo;
	
	private String contingencyDescription;
	
	private String contingencyAction;

	private String contingencyTitle;

	private String contingencyDocumentStatus;

	private String contingencyDocumentType;
	
	private String lossHistoryType;
	
	public CommercialPackageDataEngine(String workBook,String sheetName,String testcaseID) {
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
		this.contractorDeductible=setContractorDeductible();
		this.signType=setSignType();
		this.deductible=setDeductible();
		this.cancellationSource=setCancellationSource();
		this.cancellationReason=setCancellationReason();
		this.reinstatementReason=setReinstatementReason();
		this.effectiveDateOneMonthAhead=setEffectiveDateOneMonthAhead();
		this.effectiveDateAsCurrentDate=setEffectiveDateAsCurrentDate();
		this.upFrontPayment=setUpFrontPayment();
		this.renewalCode=setRenewalCode();
		this.preRenewalDirection=setPreRenewalDirection();
		this.preRenewalSecurity=setPreRenewalSecurity();
		this.preRenewalReason=setPreRenewalReason();
		this.preRenewalText=setPreRenewalText();
		this.organizationType2=setOrganizationType2();
		this.organizationType3=setOrganizationType3();
		this.offerings =setOfferings();
		this.groupType=setGroupType();
		this.blanketType=setBlanketType();
		this.coverageForm=setCoverageForm();
		this.packageRiskType =setPackageRiskType();
		this.policyBasis=setPolicyBasis();
		this.basis =setBasis();
		this.classCode=setClassCode();
		this.insuredType=setInsuredType();
		this.uWIssueType=setUWIssueType();
		this.uWLongDescription =setUWlongDescription();
		this.priorLossDescription=setPriorLossDescription();
		this.totalIncurred=setTotalIncurred();
		this.amountPaid =setAmountPaid();
		this.lossHistoryStatus=setLossHistoryStatus();
		this.openReserve =setOpenReserve();
		this.carrier=setCarrier();
		this.policyNo=setPolicyNo();
		this.contingencyDescription =setContingencyDescription();
		this.contingencyAction=setContingencyAction();
		this.contingencyTitle =setContingencyTitle();
		this.contingencyDocumentStatus=setContingencyDocumentStatus();
		this.contingencyDocumentType=setContingencyDocumentType();
		this.lossHistoryType=setLossHistoryType();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") || data.get("FIRST_NAME").trim().length() == 0 ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length() == 0? DataFakers.lastName() :
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
		return organizationType2=data.get("ORGANIZATION_TYPE2").trim().equals("X") || data.get("ORGANIZATION_TYPE2").trim().length() == 0 ? DataFakers.organizationType() : 
			data.get("ORGANIZATION_TYPE2").trim();
	}
	
	public String setOrganizationType3() {
		return organizationType3=data.get("ORGANIZATION_TYPE3").trim().equals("X") || data.get("ORGANIZATION_TYPE3").trim().length() == 0 ? DataFakers.organizationType() : 
			data.get("ORGANIZATION_TYPE3").trim();
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
	
	public String setContractorDeductible() {
		return deductible=data.get("CONTRACTOR_DEDUCTIBLE").trim().equals("X") || data.get("CONTRACTOR_DEDUCTIBLE").trim().length() == 0 ? DataFakers.contractorDeductible() :
			data.get("CONTRACTOR_DEDUCTIBLE").trim();
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
	
	public String setEffectiveDateAsCurrentDate() {
		return effectiveDateAsCurrentDate=data.get("EFFECTIVE_DATE").trim().equals("X") || data.get("EFFECTIVE_DATE").trim().length() == 0 ? DataFakers.currentDate() : 
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

	public String setOfferings() {
		return offerings=data.get("OFFERINGS").trim().equals("X") || data.get("OFFERINGS").trim().length() == 0 ? DataFakers.offerings() : 
			data.get("OFFERINGS").trim();
	}
	
	public String setGroupType() {
		return groupType=data.get("GROUP_TYPE").trim().equals("X") || data.get("GROUP_TYPE").trim().length() == 0 ? DataFakers.groupType() : 
			data.get("GROUP_TYPE").trim();
	}
	
	public String setBlanketType() {
		return blanketType=data.get("BLANKET_TYPE").trim().equals("X") || data.get("BLANKET_TYPE").trim().length() == 0 ? DataFakers.blanketType() : 
			data.get("BLANKET_TYPE").trim();
	}

	public String setCoverageForm() {
		return coverageForm=data.get("COVERAGE_FORM").trim().equals("X") || data.get("COVERAGE_FORM").trim().length() == 0 ? DataFakers.coverageForm() :
			data.get("COVERAGE_FORM").trim();
	}
	
	public String setPackageRiskType() {
		return packageRiskType=data.get("PACKAGE_RISK_TYPE").trim().equals("X") || data.get("PACKAGE_RISK_TYPE").trim().length() == 0 ? DataFakers.packageRiskType() : 
			data.get("PACKAGE_RISK_TYPE").trim();
	}
	
	public String setPolicyBasis() {
		return policyBasis=data.get("POLICY_BASIS").trim().equals("X") || data.get("POLICY_BASIS").trim().length() == 0 ? DataFakers.policyBasis() : 
			data.get("POLICY_BASIS").trim();
	}
	
	public String setBasis() {
		return basis=data.get("BASIS").trim().equals("X") || data.get("BASIS").trim().length() == 0 ? DataFakers.basis() : 
			data.get("BASIS").trim();
	}

	public String setClassCode() {
		return classCode=data.get("CLASS_CODE").trim().equals("X") || data.get("CLASS_CODE").trim().length() == 0 ? DataFakers.classCode() :
			data.get("CLASS_CODE").trim();
	}
	
	public String setInsuredType() {
		return insuredType=data.get("INSURED_TYPE").trim().equals("X") || data.get("INSURED_TYPE").trim().length() == 0 ? DataFakers.insuredType() : 
			data.get("INSURED_TYPE").trim();
	}
	
	public String setUWIssueType() {
		return uWIssueType=data.get("UW_ISSUE_TYPE").trim().equals("X") || data.get("UW_ISSUE_TYPE").trim().length() == 0 ? DataFakers.uWIssueType() : 
			data.get("UW_ISSUE_TYPE").trim();
	}

	public String setUWlongDescription() {
		return uWLongDescription=data.get("UW_LONG_DESCRIPTION").trim().equals("X") || data.get("UW_LONG_DESCRIPTION").trim().length() == 0 ? DataFakers.generateRandomString("LongDescription ") :
			data.get("UW_LONG_DESCRIPTION").trim();
	}
	
	public String setPriorLossDescription() {
		return priorLossDescription=data.get("PRIOR_LOSS_DESCRIPTION").trim().equals("X") || data.get("PRIOR_LOSS_DESCRIPTION").trim().length() == 0 ? DataFakers.generateRandomString("PriorLossDescription") : 
			data.get("PRIOR_LOSS_DESCRIPTION").trim();
	}
	
	public String setTotalIncurred() {
		return totalIncurred=data.get("TOTAL_INCURRED").trim().equals("X") || data.get("TOTAL_INCURRED").trim().length() == 0 ? DataFakers.limit() : 
			data.get("TOTAL_INCURRED").trim();
	}
	
	public String setAmountPaid() {
		return amountPaid=data.get("AMOUNT_PAID").trim().equals("X") || data.get("AMOUNT_PAID").trim().length() == 0 ? DataFakers.basis() : 
			data.get("AMOUNT_PAID").trim();
	}

	public String setLossHistoryStatus() {
		return lossHistoryStatus=data.get("LOSS_HISTORY_STATUS").trim().equals("X") || data.get("LOSS_HISTORY_STATUS").trim().length() == 0 ? DataFakers.lossHistoryStatus() :
			data.get("LOSS_HISTORY_STATUS").trim();
	}
	
	public String setLossHistoryType() {
		return lossHistoryType=data.get("LOSS_HISTORY_TYPE").trim().equals("X") || data.get("LOSS_HISTORY_TYPE").trim().length() == 0 ? DataFakers.lossHistoryType() :
			data.get("LOSS_HISTORY_TYPE").trim();
	}
	
	public String setOpenReserve() {
		return openReserve=data.get("OPEN_RESERVE").trim().equals("X") || data.get("OPEN_RESERVE").trim().length() == 0 ? DataFakers.basis(): 
			data.get("OPEN_RESERVE").trim();
	}
	
	public String setContingencyDescription() {
		return contingencyDescription=data.get("CONTINGENCY_DESCRIPTION").trim().equals("X") || data.get("CONTINGENCY_DESCRIPTION").trim().length() == 0 ? DataFakers.generateRandomString("Contingency Description ") : 
			data.get("CONTINGENCY_DESCRIPTION").trim();
	}
	
	public String setContingencyAction() {
		return contingencyAction=data.get("CONTINGENCY_ACTION").trim().equals("X") || data.get("CONTINGENCY_ACTION").trim().length() == 0 ? DataFakers.contingencyAction() : 
			data.get("CONTINGENCY_ACTION").trim();
	}

	public String setContingencyTitle() {
		return contingencyTitle=data.get("CONTINGENCY_TITLE").trim().equals("X") || data.get("CONTINGENCY_TITLE").trim().length() == 0 ? DataFakers.generateRandomString("ContingencyTitle ") :
			data.get("CONTINGENCY_TITLE").trim();
	}
	
	public String setContingencyDocumentStatus() {
		return contingencyDocumentStatus=data.get("CONTINGENCY_DOCUMENTS_STATUS").trim().equals("X") || data.get("CONTINGENCY_DOCUMENTS_STATUS").trim().length() == 0 ? DataFakers.contingencyDocumentStatus() : 
			data.get("CONTINGENCY_DOCUMENTS_STATUS").trim();
	}
	
	public String setContingencyDocumentType() {
		return contingencyDocumentType=data.get("CONTINGENCY_DOCUMENT_TYPE").trim().equals("X") || data.get("CONTINGENCY_DOCUMENT_TYPE").trim().length() == 0 ? DataFakers.contingencyDocumentType() : 
			data.get("CONTINGENCY_DOCUMENT_TYPE").trim();
	}
	
	public String setCarrier() {
		return carrier=data.get("CARRIER_TITLE").trim().equals("X") || data.get("CARRIER_TITLE").trim().length() == 0 ? DataFakers.generateRandomString("Carrier ") : 
			data.get("CARRIER_TITLE").trim();
	}
	
	public String setPolicyNo() {
		return policyNo=data.get("POLICY_NUMBER").trim();
	}
	
}