package com.aspire.guidewire.pc.teststeps.nonlob;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;
import lombok.Getter;


@Getter
public class NonLobDataEngine {

	HashMap<String,String> data;

	private String firstName;

	private String lastName;
	
	private String status;
	
	private String priority;
	
	private String overdue;
	
	private String userName;
	
	private String producerCode;
	
	private String type;
	
	private String searchFor;
	
	private String policyNumber;
	
	private String accountNumber;
	
	private String product;
	
	private String state;

	private String city;
	
	private String organizationName;
	
	private String underwritingCompany;
	
	private String groupType;
	
	private String groupName;
	
	private String rolesName;
	
	private String rolesType;
	
	private String regionName;

	private String country;
	
	private String regionType;
	
	private String permission;
	
	private String userType;
	
	private String code;
	
	private String subject;
	
	private String patternLevel;
	
	private String organizationType;
	
	private String activityClass;
	
	private String policyLine;
	
	private String dataType;
	
	private String displayType;
	
	private String physicalColumn;
	
	private String batchProcess;
	
	private String dropDownvalue;
	
	private String sosFilter;
	
	private String ruleName;
	
	private String activityPatternName;
	
	private String clusterWideStateValue;
	
	private String availableValue;
	
	private String checkOutValue;
	
	private String executorsRunningValue;
	
	private String failedValue;
	
	private String addressLine1;
	
	private String zipcode;

	private String addressType;
	
	private String companyName;
	
	private String description;
	
	private String branchCode;
	
	private String attributeType;
	
	private String fileName;
	
	public NonLobDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.status=setStatus();
		this.priority=setPriority();
		this.overdue=setOverdue();
		this.userName=setUserName();
		this.producerCode=setProducerCode();
		this.type=setType();
		this.searchFor=setSearchFor();
		this.policyNumber=setPolicyNumber();
		this.accountNumber=setAccountNumber();
		this.product=setProduct();
		this.state=setState();
		this.city=setCity();
		this.organizationName=setOrganizationName();
		this.underwritingCompany=setUnderwritingCompany();
		this.groupType=setGroupType();
		this.groupName=setGroupName();
		this.rolesName=setRolesName();
		this.rolesType=setRolesType();
		this.regionName=setRegionName();
		this.country=setCountry();
		this.regionType=setRegionType();
		this.permission=setPermission();
		this.userType=setUserType();
		this.code=setCode();
		this.subject=setSubject();
		this.patternLevel=setPatternLevel();
		this.organizationType=setOrganizationType();
		this.activityClass=setActivityClass();
		this.policyLine=setPolicyLine();
		this.dataType=setDataType();
		this.displayType=setDisplayType();
		this.physicalColumn=setPhysicalColumn();
		this.batchProcess=setBatchProcess();
		this.dropDownvalue=setDropDownvalue();
		this.sosFilter=setSosFilter();
		this.ruleName=setRuleName();
		this.activityPatternName=setActivityPatternName();
		this.clusterWideStateValue=setClusterWideStateValue();
		this.availableValue=setAvailableValue();
		this.checkOutValue=setCheckOutValue();
		this.executorsRunningValue=setExecutorsRunningValue();
		this.failedValue=setFailedValue();
		this.addressLine1=setAddressLine1();
		this.zipcode=setZipcode();
		this.addressType =setAddressType();
		this.companyName =setCompanyName();
		this.description=setDescription();
		this.branchCode = setBranchCode();
		this.attributeType = setAttributeType();
		this.fileName= setFileName();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") || data.get("FIRST_NAME").trim().length() == 0 ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}

	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") || data.get("LAST_NAME").trim().length() == 0 ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}
	
	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") || data.get("STATUS").trim().length() == 0 ? DataFakers.status() :
			data.get("STATUS").trim();
	}
	public String setPriority() {
		return priority=data.get("PRIORITY").trim().equals("X") || data.get("PRIORITY").trim().length() == 0 ? DataFakers.priority():
			data.get("PRIORITY").trim();
	}
	public String setOverdue() {
		return overdue=data.get("OVERDUE").trim().equals("X") || data.get("OVERDUE").trim().length() == 0 ? DataFakers.overdue():
			data.get("OVERDUE").trim();
	}
	public String setUserName() {
		return userName=data.get("USER_NAME").trim().equals("X") || data.get("USER_NAME").trim().length() == 0 ? DataFakers.userName():
			data.get("USER_NAME").trim();
	}
	public String setProducerCode() {
		return producerCode=data.get("PRODUCER_CODE").trim().equals("X") || data.get("PRODUCER_CODE").trim().length() == 0 ? DataFakers.producerCode():
			data.get("PRODUCER_CODE").trim();
	}
	public String setType() {
		return type=data.get("ACTIVITY_TYPE").trim().equals("X") || data.get("ACTIVITY_TYPE").trim().length() == 0 ? DataFakers.type():
			data.get("ACTIVITY_TYPE").trim();
	}
	public String setSearchFor() {
		return searchFor=data.get("SEARCH_FOR").trim().equals("X") || data.get("SEARCH_FOR").trim().length() == 0 ? DataFakers.searchFor() :
			data.get("SEARCH_FOR").trim();
	}
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim().equals("X") || data.get("POLICY_NUMBER").trim().length() == 0 ? DataFakers.policyNumber() :
			data.get("POLICY_NUMBER").trim();
	}
	
	public String setAccountNumber() {
		return accountNumber=data.get("ACCOUNT_NUMBER").trim().equals("X") || data.get("ACCOUNT_NUMBER").trim().length() == 0 ? DataFakers.accountNumber():
			data.get("ACCOUNT_NUMBER").trim();
	}
	
	public String setProduct() {
		return product=data.get("PRODUCT").trim().equals("X") || data.get("PRODUCT").trim().length() == 0 ? DataFakers.product():
			data.get("PRODUCT").trim();
	}
	
	public String setState() {
		return state=data.get("STATE").trim().equals("X") || data.get("STATE") .trim().length() == 0 ? DataFakers.state() :
			data.get("STATE").trim();
	}
	
	public String setCity() {
		return city=data.get("CITY").trim().equals("X") || data.get("CITY").trim().length() == 0  ? DataFakers.city() :
			data.get("CITY").trim();
	}
	
	public String setOrganizationName() {
		return organizationName=data.get("ORGANIZATION_NAME").trim().equals("X") || data.get("ORGANIZATION_NAME").length() == 0 ? DataFakers.producerOrganization() :
			data.get("ORGANIZATION_NAME").trim();
	}
	public String setUnderwritingCompany() {
		return underwritingCompany=data.get("UNDERWRITING_COMPANY").trim().equals("X") || data.get("UNDERWRITING_COMPANY").length() == 0 ? DataFakers.producerOrganization() :
			data.get("UNDERWRITING_COMPANY").trim();
	}
	public String setGroupType() {
		return groupType=data.get("GROUP_TYPE").trim().equals("X") || data.get("GROUP_TYPE").trim().length() == 0 ? DataFakers.groupType() :
			data.get("GROUP_TYPE").trim();
	}
	public String setGroupName() {
		return groupName=data.get("GROUP_NAME").trim().equals("X") || data.get("GROUP_NAME").trim().length() == 0 ? DataFakers.singleChar() :
			data.get("GROUP_NAME").trim();
	}
	public String setRolesName() {
		return rolesName=data.get("ROLES_NAME").trim().equals("X") || data.get("ROLES_NAME").trim().length() == 0 ? DataFakers.rolesName() :
			data.get("ROLES_NAME").trim();
	}
	public String setRolesType() {
		return rolesType=data.get("ROLES_TYPE").trim().equals("X") || data.get("ROLES_TYPE").trim().length() == 0 ? DataFakers.rolesType() :
			data.get("ROLES_TYPE").trim();
	}
	public String setRegionName() {
		return regionName=data.get("REGION_NAME").trim();
	}
	public String setCountry() {
		return country=data.get("COUNTRY").trim();
	}
	public String setRegionType() {
		return regionType=data.get("REGION_TYPE").trim().equals("X") || data.get("REGION_TYPE").trim().length() == 0 ? DataFakers.regionType() :
			data.get("REGION_TYPE").trim();
	}
	public String setPermission() {
		return permission=data.get("PERMISSION").trim().equals("X") || data.get("PERMISSION").trim().length() == 0  ? DataFakers.permission() :
			data.get("PERMISSION").trim();
	}
	public String setUserType() {
		return userType=data.get("USER_TYPE").trim().equals("X") || data.get("USER_TYPE").trim().length() == 0 ? DataFakers.userType() :
			data.get("USER_TYPE").trim();
	}
	public String setCode() {
		return code=data.get("CODE").trim().equals("X") || data.get("CODE").trim().length() == 0 ? DataFakers.amount() : 
			data.get("CODE").trim();	
	}
	public String setSubject() {
		return subject=data.get("SUBJECT").trim().equals("X") || data.get("SUBJECT").trim().length() == 0 ? DataFakers.generateRandomString("Test Pattern"):
			data.get("SUBJECT").trim();
	}
	
	public String setPatternLevel() {
		return patternLevel=data.get("PATTERN_LEVEL").trim().equals("X") || data.get("PATTERN_LEVEL").trim().length() == 0  ? DataFakers.generateRandomString("All"):
			data.get("PATTERN_LEVEL").trim();
	}
	public String setOrganizationType() {
		return organizationType=data.get("ORGANIZATION_TYPE").trim().equals("X") || data.get("ORGANIZATION_TYPE").trim().length() == 0 ? DataFakers.organizationType() :
			data.get("ORGANIZATION_TYPE").trim();
	}
	public String setActivityClass() {
		return activityClass=data.get("ACTIVITY_CLASS").trim().equals("X") || data.get("ACTIVITY_CLASS").trim().length() == 0  ? DataFakers.generateRandomString("Task") :
			data.get("ACTIVITY_CLASS").trim();
	}
	public String setPolicyLine() {
		return policyLine=data.get("POLICY_LINE").trim().equals("X") || data.get("POLICY_LINE").trim().length() == 0 ? DataFakers.product() :
			data.get("POLICY_LINE").trim();
	}
	public String setDataType() {
		return dataType=data.get("DATATYPE").trim().equals("X") || data.get("DATATYPE").trim().length() == 0  ? DataFakers.dataType() :
			data.get("DATATYPE").trim();
	}
	public String setDisplayType() {
		return displayType=data.get("DISPLAY_TYPE").trim().equals("X") || data.get("DISPLAY_TYPE").trim().length() == 0 ? DataFakers.displayType() :
			data.get("DISPLAY_TYPE").trim();
	}
	public String setPhysicalColumn() {
		return physicalColumn=data.get("PHYSICAL_COLUMN").trim().equals("X") || data.get("PHYSICAL_COLUMN").trim().length() == 0 ? DataFakers.generateRandomString("str3") :
			data.get("PHYSICAL_COLUMN").trim();
	}
	public String setBatchProcess() {
		return batchProcess=data.get("BATCH_PROCESS").trim().equals("X") || data.get("BATCH_PROCESS").trim().length() == 0 ? DataFakers.batchProcess() :
			data.get("BATCH_PROCESS").trim();
	}
	public String setDropDownvalue() {
		return dropDownvalue=data.get("DROPDOWN_VALUE").trim().equals("X") || data.get("DROPDOWN_VALUE").trim().length() == 0 ? DataFakers.dropDownvalue() :
			data.get("DROPDOWN_VALUE").trim();
	}
	public String setSosFilter() {
		return sosFilter=data.get("SOS_FILTER").trim().equals("X") || data.get("SOS_FILTER").trim().length() == 0 ? DataFakers.sosFilter() :
			data.get("SOS_FILTER").trim();
	}
	
	public String setRuleName() {
		return ruleName=data.get("RULE_NAME").trim();
	}
	public String setActivityPatternName() {
		return activityPatternName=data.get("ACTIVITY_PATTERN_NAME").trim();
	}
	public String setClusterWideStateValue() {
		return clusterWideStateValue=data.get("CLUSTER_WIDESTATE_VALUE").trim();
	}
	public String setAvailableValue() {
		return availableValue=data.get("AVAILABLE_VALUE").trim().equals("X") || data.get("AVAILABLE_VALUE").trim().length() == 0 ? DataFakers.generateRandomString("0") :
			data.get("AVAILABLE_VALUE").trim();
	}
	public String setCheckOutValue() {
		return checkOutValue=data.get("CHECKOUT_VALUE").trim().equals("X") || data.get("CHECKOUT_VALUE").trim().length() == 0 ? DataFakers.generateRandomString("0") :
			data.get("CHECKOUT_VALUE").trim();
	}
	public String setFailedValue() {
		return failedValue=data.get("FAILED_VALUE").trim().equals("X") || data.get("FAILED_VALUE").trim().length() == 0 ? DataFakers.generateRandomString("0") :
			data.get("FAILED_VALUE").trim();
	}
	public String setExecutorsRunningValue() {
		return executorsRunningValue=data.get("EXECUTORS_RUNNING_VALUE").trim().equals("X") || data.get("EXECUTORS_RUNNING_VALUE").trim().length() == 0 ? DataFakers.generateRandomString("1") :
			data.get("EXECUTORS_RUNNING_VALUE").trim();
	}
	
	public String setAddressLine1() {
		return addressLine1=data.get("ADDRESS_LINE1").trim().equals("X") || data.get("ADDRESS_LINE1").trim().length() == 0 ? DataFakers.addressLineOne() :
			data.get("ADDRESS_LINE1").trim();
	}
	
	public String setZipcode() {
		return zipcode=data.get("ZIPCODE").trim().equals("X") || data.get("ZIPCODE").trim().length() == 0 ? DataFakers.zipCode() :
			data.get("ZIPCODE").trim();
	}
	public String setAddressType() {
		return addressType=data.get("ADDRESS_TYPE").trim().equals("X") || data.get("ADDRESS_TYPE").trim().length() == 0 ? DataFakers.addressType() : 
			data.get("ADDRESS_TYPE").trim();	
	}
	public String setCompanyName() {
		return companyName=data.get("COMPANY_NAME").trim().equals("X")  || data.get("COMPANY_NAME").trim().length() == 0 ? DataFakers.generateRandomCompanyName("company") : 
			data.get("COMPANY_NAME").trim();	
	}
	
	public String setDescription() {
		return description=data.get("DESCRIPTION").trim().equals("X") || data.get("DESCRIPTION").trim().length() == 0 ? DataFakers.generateRandomString("damage"):
			data.get("DESCRIPTION").trim();
	}
	public String setBranchCode() {
		return description=data.get("BRANCH_CODE").trim().equals("X") || data.get("BRANCH_CODE").trim().length() == 0 ? DataFakers.branchCode():
			data.get("BRANCH_CODE").trim();
	}
	public String setAttributeType() {
		return description=data.get("ATTRIBUTE_TYPE").trim().equals("X") || data.get("ATTRIBUTE_TYPE").trim().length() == 0 ? DataFakers.attributeType():
			data.get("ATTRIBUTE_TYPE").trim();
	}
	
	public String setFileName() {
		return fileName=data.get("FILE_NAME").trim();
	}
	
}