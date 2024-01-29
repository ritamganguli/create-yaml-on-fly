package com.aspire.guidewire.cc.teststeps.nonlob;

import java.util.HashMap;

import com.aspire.guidewire.utils.TestDataUtils;

import lombok.Getter;



@Getter
public class NonLobDataEngine {

	HashMap<String,String> data;

	private String state;

	private String city;

	private String type;

	private String lossCause;

	private String documentType;

	private String status;

	private String costType;

	private String text;

	private String damageDescription;

	private String propertyDescription;

	private String propertyName;

	private String claimNumber;

	private String lossDate;

	private String policyNumber;

	private String lastName;

	private String effectiveDate;

	private String expirationDate;

	private String name;

	private String edgePolicyholder;

	private String edgeEnglish;

	private String description;

	private String permission;

	private String searchFor;

	private String firstName;

	private String amount;

	private String taxId;

	private String limitType;

	private String policyType;

	private String coverageType;

	private String lineOfBusiness;

	private String password;

	private String createdBy;

	private String handler;

	private String jurisdiction;

	private String workflowType;

	private String email;

	private String accountNumber;

	private String claimStatus;

	private String pendingAssignment;

	private String userFirstName;

	private String userLastName;

	private String activityPattern;

	private String triggerEntity;

	private String triggerAction;

	private String ruleVariableExpression;

	private String actionType;

	private String actionParameterType;

	private String incidentType;

	private String selectFromList;

	private String assignedTo;

	private String batchProcessDropDown;

	private String batchProcessName;

	private String searchRadius;

	private String country;

	private String lossType;

	private String costCategory;

	private String code;

	private String category;

	private String calenderImportance;

	private String activityPatternName;

	private String icdCode;

	private String bodySystems;

	private String fileName;

	private String suspendScheduler;

	private String resumeScheduler;

	private String workQueueName;

	private String logger;

	private String newConfiguredLevel;

	private String logFile;

	private String filterGrep;

	private String serviceStatus;

	private String catastrophes;

	private String fromDate;

	private String toDate;

	private String hoildayDate;

	private String regionsName;

	private String defaultValue;

	private String treatyType;

	private String thresholdValue;

	private String reportingThreshold;

	private String days;

	private String daysOpen;

	private String maxppdPercentage;

	private String minppdPercentage;

	private String maxAmount;

	private String minAmount;

	private String denialPeriodFormula;

	private String targetIncludedDays;

	private String exportData;

	private String scriptParameterValue;

	private String groupName;

	private String organizationName;

	private String coverageInQuestion;

	private String flaggedType;

	private String jurisdictionState;

	private String vehicleName;

	private String make;

	private String model;

	private String vin;

	private String year;

	private String claimantType;

	private String lossOccurred;

	private String reserveLine;
	
	private String recoveryCategory;
	
	private String paymentType;
	
	private String randomText;
	
	private String documentName;


	public NonLobDataEngine(String workBook,String sheetName,String testcaseID) {
		this.data=TestDataUtils.getTestData(workBook, sheetName, testcaseID);
		this.type=setType();
		this.lossCause=setLossCause();
		this.damageDescription=setDamageDescription();
		this.propertyDescription=setPropertyDescription();
		this.propertyName=setPropertyName();
		this.lossDate=setLossDate();
		this.city=setCity();
		this.state=setState();
		this.policyNumber=setPolicyNumber();
		this.firstName=setFirstName();
		this.lastName=setLastName();
		this.effectiveDate=setEffectiveDate();
		this.expirationDate=setExpirationDate();
		this.propertyName=setPropertyName();
		this.claimNumber=setClaimNumber();
		this.searchFor=setSearchFor();
		this.firstName=setFirstName();
		this.taxId=setTaxId();
		this.lineOfBusiness=setLineOfBusiness();
		this.createdBy=setCreatedBy();
		this.propertyName=setPropertyName();
		this.name=setName();
		this.edgePolicyholder=setEdgePolicyholder();
		this.edgeEnglish=setEdgeEnglish();
		this.description=setDescription();
		this.handler=setHandler();
		this.status=setStatus();
		this.workflowType=setWorkflowType();
		this.fromDate=setFromDate();
		this.toDate=setToDate();
		this.jurisdiction=setJurisdiction();
		this.claimStatus=setClaimStatus();
		this.lossType=setLossType();
		this.pendingAssignment=setPendingAssignment();
		this.assignedTo=setAssignedTo();
		this.permission=setPermission();
		this.amount=setAmount();
		this.limitType=setLimitsType();
		this.policyType=setPolicyType();
		this.coverageType=setCoverageType();
		this.costType=setCostType();
		this.password=setPassword();
		this.email=setEmail();
		this.accountNumber=setAccountNumber();
		this.userFirstName=setUserFirstName();
		this.userLastName=setUserLastName();
		this.activityPattern=setActivityPattern();
		this.triggerEntity=setTriggerEntity();
		this.triggerAction=setTriggerAction();
		this.ruleVariableExpression=setRuleVariableExpression();
		this.actionType=setActionType();
		this.actionParameterType=setActionParameterType();
		this.incidentType=setIncidentType();
		this.costCategory=setCostCategory();
		this.lossType=setLossType();
		this.code=setCode();
		this.category=setCategory();
		this.calenderImportance=setCalenderImportance();
		this.activityPatternName=setActivityPatternName();
		this.selectFromList=setSelectFromList();
		this.assignedTo=setAssignedTo();
		this.catastrophes=setCatastrophes();
		this.fromDate=setFromDate();
		this.toDate=setFromDate();
		this.searchRadius=setSearchRadius();
		this.country=setCountry();
		this.batchProcessDropDown=setBatchProcessDropDown();
		this.batchProcessName=setBatchProcessName();
		this.logger=setLogger();
		this.newConfiguredLevel=setNewConfiguredLevel();
		this.logFile=setLogFile();
		this.filterGrep=setFilterGrep();
		this.serviceStatus=setServiceStatus();
		this.hoildayDate=setDate();
		this.regionsName=setRegionsName();
		this.defaultValue=setDeafultValue();
		this.treatyType = setTreatyType();
		this.thresholdValue=setThresholdValue();
		this.reportingThreshold=setReportingThreshold();
		this.days =setDays();
		this.daysOpen =setDaysOpen();
		this.icdCode=setIcdCode();
		this.bodySystems=setBodySystems();
		this.fileName=setFileName();
		this.suspendScheduler=setSuspendScheduler();
		this.resumeScheduler=setResumeScheduler();
		this.workQueueName=setWorkQueueName();
		this.maxppdPercentage=setMaxPPDPercentage();
		this.minppdPercentage=setMinPPDPercentage();
		this.maxAmount=setMaxAmount();
		this.minAmount=setMinAmount();
		this.denialPeriodFormula=setDenialPeriodFormula();
		this.targetIncludedDays=setTargetIncludedDays();
		this.exportData=setExportData();
		this.scriptParameterValue=setScriptParameterValue();
		this.groupName=setGroupName();
		this.organizationName=setOrganizationName();
		this.coverageInQuestion=setCoverageInQuestion();
		this.flaggedType=setFlaggedType();
		this.jurisdictionState=setJurisdictionState();
		this.vehicleName=setVehicleName();
		this.make = setMake();
		this.model = setModel();
		this.year = setYear();
		this.vin = setVin();
		this.claimantType=setClaimantType();
		this.lossOccurred=setLossOccurred();
		this.reserveLine =setReserveLine();
		this.recoveryCategory=setRecoveryCategory();
		this.paymentType=setPaymentType();
		this.randomText=setRandomText();
		this.documentName=setDocumentName();
	}

	public String setVehicleName() {
		return vehicleName=data.get("VEHICLE_NAME").trim().equals("X") ? DataFakers.vehicleName():
			data.get("VEHICLE_NAME").trim();
	}
	public String setType() {
		return type=data.get("TYPE").trim().equals("X") ? DataFakers.type() :
			data.get("TYPE").trim();
	}


	public String setName() {
		return name=data.get("NAME").trim().equals("X") ? DataFakers.generateRandomString("TestNewGen") :
			data.get("NAME").trim();
	}

	public String setEdgePolicyholder() {
		return edgePolicyholder=data.get("EDGE_POLICY_HOLDER").trim().equals("X") ? DataFakers.generateRandomString("TestNewGen") :
			data.get("EDGE_POLICY_HOLDER").trim();
	}

	public String setEdgeEnglish() {
		return edgeEnglish=data.get("EDGE_ENGLISH").trim().equals("X") ? DataFakers.generateRandomString("TestNewGen") :
			data.get("EDGE_ENGLISH").trim();
	}

	public String setDescription() {
		return description=data.get("DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("TestNewGen") :
			data.get("DESCRIPTION").trim();
	}

	public String setPermission() {
		return permission=data.get("PERMISSION").trim().equals("X") ? DataFakers.permission() :
			data.get("PERMISSION").trim();
	}


	public String setLossCause() {
		return lossCause=data.get("LOSS_CAUSE").trim().equals("X") ? DataFakers.lossCause() :
			data.get("LOSS_CAUSE").trim();
	}

	public String setDamageDescription() {
		return damageDescription=data.get("DAMAGE_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("Damage") :
			data.get("DAMAGE_DESCRIPTION").trim();
	}

	public String setPropertyDescription() {
		return propertyDescription=data.get("PROPERTY_DESCRIPTION").trim().equals("X") ? DataFakers.generateRandomString("Property") :
			data.get("PROPERTY_DESCRIPTION").trim();
	}

	public String setClaimNumber() {
		return claimNumber=data.get("CLAIM_NUMBER").trim().equals("X") ? DataFakers.claimNumber() :
			data.get("CLAIM_NUMBER").trim();
	}


	public String setSearchFor() {
		return searchFor=data.get("SEARCH_FOR").trim().equals("X") ? DataFakers.generateRandomString("Property") :
			data.get("SEARCH_FOR").trim();
	}

	public String setFirstName() {
		return firstName=data.get("FIRST_NAME").trim().equals("X") ? DataFakers.firstName() :
			data.get("FIRST_NAME").trim();
	}
	public String setPropertyName() {
		return propertyName=data.get("PROPERTY_NAME").trim().equals("X") ? DataFakers.propertyName() :
			data.get("PROPERTY_NAME").trim();
	}
	public String setLastName() {
		return lastName=data.get("LAST_NAME").trim().equals("X") ? DataFakers.lastName() :
			data.get("LAST_NAME").trim();
	}

	public String setTaxId() {
		return taxId=data.get("TAX_ID").trim().equals("X") ? DataFakers.taxID() :
			data.get("TAX_ID").trim();
	}

	public String setLineOfBusiness() {
		return lineOfBusiness=data.get("LINE_OF_BUSINESS").trim().equals("X") ? DataFakers.lineOfBusiness() :
			data.get("LINE_OF_BUSINESS").trim();
	}

	public String setCreatedBy() {
		return createdBy=data.get("CREATED_BY").trim().equals("X") ? DataFakers.createBy() :
			data.get("CREATED_BY").trim();
	}

	public String setLossDate() {
		return lossDate=data.get("LOSS_DATE").trim().equals("X") ? DataFakers.currentDate() :
			data.get("LOSS_DATE").trim();
	}

	public String setState() {
		return state=data.get("STATE").trim().equals("X") ? DataFakers.state() :
			data.get("STATE").trim();
	}

	public String setCity() {
		return city=data.get("CITY").trim().equals("X") ? DataFakers.city() :
			data.get("CITY").trim();
	}
	public String setPolicyNumber() {
		return policyNumber=data.get("POLICY_NUMBER").trim().equals("X") ? DataFakers.policyNumber() :
			data.get("POLICY_NUMBER").trim();
	}

	public String setEffectiveDate() {
		return effectiveDate=data.get("EFFECTIVE_DATE").trim().equals("X") ? DataFakers.currentDate() :
			data.get("EFFECTIVE_DATE").trim();
	}

	public String setExpirationDate() {
		return expirationDate=data.get("EXPIRATION_DATE").trim().equals("X") ? DataFakers.dateOneMonthAhead() :
			data.get("EXPIRATION_DATE").trim();
	}
	public String setHandler() {
		return handler=data.get("HANDLER").trim().equals("X") ? DataFakers.handler() :
			data.get("HANDLER").trim();
	}
	public String setStatus() {
		return status=data.get("STATUS").trim().equals("X") ? DataFakers.status() :
			data.get("STATUS").trim();
	}
	public String setWorkflowType() {
		return workflowType=data.get("WORKFLOW_TYPE").trim().equals("X") ? DataFakers.workflowType() :
			data.get("WORKFLOW_TYPE").trim();
	}

	public String setJurisdiction() {
		return jurisdiction=data.get("JURISDICTION").trim().equals("X") ? DataFakers.jurisdiction() :
			data.get("JURISDICTION").trim();
	}

	public String setClaimStatus() {
		return claimStatus=data.get("CLAIM_STATUS").trim().equals("X") ? DataFakers.claimStatus() :
			data.get("CLAIM_STATUS").trim();
	}

	public String setPendingAssignment() {
		return pendingAssignment=data.get("PENDING_ASSIGNMENT").trim().equals("X") ? DataFakers.pendingAssignment() :
			data.get("PENDING_ASSIGNMENT").trim();
	}
	public String setAssignedTo() {
		return assignedTo=data.get("ASSIGNED_TO").trim().equals("X") ? DataFakers.assignedTo() :
			data.get("ASSIGNED_TO").trim();
	}

	public String setAmount() {
		return amount=data.get("AMOUNT").trim().equals("X") ? DataFakers.amount() :
			data.get("AMOUNT").trim();
	}

	public String setLimitsType() {
		return limitType=data.get("LIMITS_TYPE").trim().equals("X") ? DataFakers.limitType() :
			data.get("LIMITS_TYPE").trim();
	}
	public String setPolicyType() {
		return policyType=data.get("POLICY_TYPE").trim().equals("X") ? DataFakers.policyType() :
			data.get("POLICY_TYPE").trim();
	}
	public String setCoverageType() {
		return coverageType=data.get("COVERAGE_TYPE").trim().equals("X") ? DataFakers.coverageType() :
			data.get("COVERAGE_TYPE").trim();
	}
	public String setCostType() {
		return costType=data.get("COST_TYPE").trim().equals("X") ? DataFakers.costType() :
			data.get("COST_TYPE").trim();
	}

	public String setPassword() {
		return password=data.get("PASSWORD").trim().equals("X") ? DataFakers.randomNumber() :
			data.get("PASSWORD").trim();
	}

	public String setEmail() {
		return email=data.get("EMAIL").trim().equals("X") ? DataFakers.generateEmail() :
			data.get("EMAIL").trim();
	}
	public String setAccountNumber() {
		return accountNumber=data.get("ACCOUNT_NUMBER").trim().equals("X") ? DataFakers.randomNumber() :
			data.get("ACCOUNT_NUMBER").trim();
	}

	public String setUserLastName() {
		return userLastName=data.get("USER_LAST_NAME").trim().equals("X") ? DataFakers.lastName() :
			data.get("USER_LAST_NAME").trim();
	}

	public String setUserFirstName() {
		return userFirstName=data.get("USER_FIRST_NAME").trim().equals("X") ? DataFakers.firstName() :
			data.get("USER_FIRST_NAME").trim();
	}

	public String setActivityPattern() {
		return activityPattern=data.get("ACTIVITY_PATTERN").trim().equals("X") ? DataFakers.activityPattern() :
			data.get("ACTIVITY_PATTERN").trim();
	}

	public String setTriggerEntity() {
		return triggerEntity=data.get("TRIGGER_ENTITY").trim().equals("X") ? DataFakers.triggerEntity() :
			data.get("TRIGGER_ENTITY").trim();
	}

	public String setSelectFromList() {
		return selectFromList=data.get("SELECT_FROM_LIST").trim().equals("X") ? DataFakers.selectFromList() :
			data.get("SELECT_FROM_LIST").trim();
	}
	public String setBatchProcessDropDown() {
		return batchProcessDropDown=data.get("BATCH_PROCESS_DROPDOWN").trim().equals("X") ? DataFakers.batchProcessDropDown() :
			data.get("BATCH_PROCESS_DROPDOWN").trim();
	}

	public String setBatchProcessName() {
		return batchProcessName=data.get("BATCH_PROCESS_NAME").trim().equals("X") ? DataFakers.batchProcessName() :
			data.get("BATCH_PROCESS_NAME").trim();
	}

	public String setSearchRadius() {
		return searchRadius=data.get("SEARCH_RADIUS").trim().equals("X") ? DataFakers.searchRadius():
			data.get("SEARCH_RADIUS").trim();
	}

	public String setCountry() {
		return country=data.get("COUNTRY").trim().equals("X") ? DataFakers.country() :
			data.get("COUNTRY").trim();
	}

	public String setTriggerAction() {
		return triggerAction=data.get("TRIGGER_ACTION").trim().equals("X") ? DataFakers.triggerAction() :
			data.get("TRIGGER_ACTION").trim();
	}

	public String setRuleVariableExpression() {
		return ruleVariableExpression=data.get("RULE_VARIABLE_EXPRESSION").trim().equals("X") ? DataFakers.ruleVariableExpression() :
			data.get("RULE_VARIABLE_EXPRESSION").trim();
	}

	public String setActionType() {
		return actionType=data.get("ACTION_TYPE").trim().equals("X") ? DataFakers.actionType() :
			data.get("ACTION_TYPE").trim();
	}

	public String setActionParameterType() {
		return actionParameterType=data.get("ACTION_PARAMETER_TYPE").trim().equals("X") ? DataFakers.actionParameterType() :
			data.get("ACTION_PARAMETER_TYPE").trim();
	}

	public String setIncidentType() {
		return incidentType=data.get("INCIDENT_TYPE").trim().equals("X") ? DataFakers.actionType() :
			data.get("INCIDENT_TYPE").trim();
	}

	public String setLossType() {
		return lossType=data.get("LOSS_TYPE").trim().equals("X") ? DataFakers.lossType() :
			data.get("LOSS_TYPE").trim();
	}

	public String setCostCategory() {
		return costCategory=data.get("COST_CATEGORY").trim().equals("X") ? DataFakers.costCategory() :
			data.get("COST_CATEGORY").trim();
	}

	public String setCode() {
		return code=data.get("CODE").trim().equals("X") ? DataFakers.amount() :
			data.get("CODE").trim();
	}

	public String setCategory() {
		return category=data.get("CATEGORY").trim().equals("X") ? DataFakers.category() :
			data.get("CATEGORY").trim();
	}

	public String setCalenderImportance() {
		return  calenderImportance=data.get("CALENDER_IMPORTANCE").trim().equals("X") ? DataFakers.calenderImportance() :
			data.get("CALENDER_IMPORTANCE").trim();
	}

	public String setActivityPatternName() {
		return activityPatternName=data.get("ACTIVITY_PATTERN_NAME").trim().equals("X") ? DataFakers.generateRandomString("Activity") :
			data.get("ACTIVITY_PATTERN_NAME").trim();
	}

	public String setLogger() {
		return logger=data.get("LOGGER").trim().equals("X") ? DataFakers.logger() :
			data.get("LOGGER").trim();
	}

	public String setNewConfiguredLevel() {
		return newConfiguredLevel=data.get("NEW_CONFIGURED_LEVEL").trim().equals("X") ? DataFakers.newConfiguredLevel() :
			data.get("NEW_CONFIGURED_LEVEL").trim();
	}

	public String setLogFile() {
		return logFile=data.get("LOG_FILE").trim().equals("X") ? DataFakers.logFile() :
			data.get("LOG_FILE").trim();
	}

	public String setFilterGrep() {
		return filterGrep=data.get("FILTER_GREP").trim().equals("X") ? DataFakers.amount() :
			data.get("FILTER_GREP").trim();
	}

	public String setServiceStatus() {
		return serviceStatus=data.get("SERVICE_STATUS").trim().equals("X") ? DataFakers.serviceStatus() :
			data.get("SERVICE_STATUS").trim();
	}

	public String setCatastrophes() {
		return catastrophes=data.get("CATASTROPHES").trim().equals("X") ? DataFakers.catastrophes() :
			data.get("CATASTROPHES").trim();
	}

	public String setIcdCode() {
		return icdCode=data.get("ICD_CODE").trim().equals("X") ? DataFakers.generateRandomString("") :
			data.get("ICD_CODE").trim();
	}
	public String setBodySystems() {
		return bodySystems=data.get("BODY_SYSTEMS").trim().equals("X") ? DataFakers.bodySytems() :
			data.get("BODY_SYSTEMS").trim();
	}

	public String setFileName() {
		return fileName=data.get("FILE_NAME").trim().equals("X") ? DataFakers.generateRandomString("Activity") :
			data.get("FILE_NAME").trim();
	}

	public String setSuspendScheduler() {
		return suspendScheduler=data.get("SUSPEND_SCHEDULER").trim().equals("X") ? DataFakers.suspendScheduler() :
			data.get("SUSPEND_SCHEDULER").trim();
	}

	public String setResumeScheduler() {
		return resumeScheduler=data.get("RESUME_SCHEDULER").trim().equals("X") ? DataFakers.resumeScheduler() :
			data.get("RESUME_SCHEDULER").trim();
	}

	public String setWorkQueueName() {
		return workQueueName=data.get("WORK_QUEUE_NAME").trim().equals("X") ? DataFakers.batchProcessName() :
			data.get("WORK_QUEUE_NAME").trim();
	}

	public String setFromDate() {
		return fromDate=data.get("FROM_DATE").trim().equals("X") ? DataFakers.currentDate():
			data.get("FROM_DATE").trim();
	}

	public String setToDate() {
		return toDate=data.get("TO_DATE").trim().equals("X") ? DataFakers.dateOneMonthAhead() :
			data.get("TO_DATE").trim();
	}

	public String setDate() {
		return toDate=data.get("DATE").trim().equals("X") ? DataFakers.hoildayDate() :
			data.get("DATE").trim();
	}

	public String setRegionsName() {
		return regionsName=data.get("REGIONS_NAME").trim().equals("X") ? DataFakers.generateRandomString("Region") :
			data.get("REGIONS_NAME").trim();
	}

	public String setDeafultValue() {
		return defaultValue=data.get("DEFAULT_VALUE").trim().equals("X") ? DataFakers.deafultValue() :
			data.get("DEFAULT_VALUE").trim();
	}

	public String setTreatyType() {
		return treatyType=data.get("TREATY_TYPE").trim().equals("X") ? DataFakers.treatyType() :
			data.get("TREATY_TYPE").trim();
	}

	public String setThresholdValue() {
		return thresholdValue=data.get("THRESHOLD_VALUE").trim().equals("X") ? DataFakers.thresholdValue() :
			data.get("THRESHOLD_VALUE").trim();
	}

	public String setReportingThreshold() {
		return reportingThreshold=data.get("REPORTING_THRESHOLD").trim().equals("X") ? DataFakers.maxPPDPercentage() :
			data.get("REPORTING_THRESHOLD").trim();
	}

	public String setDays() {
		return days=data.get("DAYS").trim().equals("X") ? DataFakers.twoDigitRandomnumber() :
			data.get("DAYS").trim();
	}
	public String setDaysOpen() {
		return daysOpen=data.get("DAYS_OPEN").trim().equals("X") ? DataFakers.twoDigitRandomnumber() :
			data.get("DAYS_OPEN").trim();
	}

	public String setMinPPDPercentage() {
		return minppdPercentage=data.get("MIN_PPD_PERCENTAGE").trim().equals("X") ? DataFakers.minPPDPercentage() :
			data.get("MIN_PPD_PERCENTAGE").trim();
	}

	public String setMaxPPDPercentage() {
		return maxppdPercentage=data.get("MAX_PPD_PERCENTAGE").trim().equals("X") ? DataFakers.maxPPDPercentage() :
			data.get("MAX_PPD_PERCENTAGE").trim();
	}

	public String setMaxAmount() {
		return maxAmount=data.get("MAX_AMOUNT").trim().equals("X") ? DataFakers.maxNumber() :
			data.get("MAX_AMOUNT").trim();
	}

	public String setMinAmount() {
		return minAmount=data.get("MIN_AMOUNT").trim().equals("X") ? DataFakers.minNumber() :
			data.get("MIN_AMOUNT").trim();
	}

	public String setDenialPeriodFormula() {
		return denialPeriodFormula=data.get("DENIAL_PERIOD_FORMULA").trim().equals("X") ? DataFakers.denialPeriodFormula() :
			data.get("DENIAL_PERIOD_FORMULA").trim();
	}

	public String setTargetIncludedDays() {
		return targetIncludedDays=data.get("TARGET_DAYS").trim().equals("X") ? DataFakers.targetIncludedDays() :
			data.get("TARGET_DAYS").trim();
	}

	public String setExportData() {
		return exportData=data.get("EXPORT_DATA").trim().equals("X") ? DataFakers.exportData() :
			data.get("EXPORT_DATA").trim();
	}

	public String setScriptParameterValue() {
		return scriptParameterValue=data.get("SCRIPT_PARAMETER_VALUE").trim().equals("X") ? DataFakers.generateRandomString("localhost:9009:80:") :
			data.get("SCRIPT_PARAMETER_VALUE").trim();
	}

	public String setGroupName() {
		return groupName=data.get("GROUP_NAME").trim().equals("X") ? DataFakers.groupName() :
			data.get("GROUP_NAME").trim();
	}

	public String setOrganizationName() {
		return organizationName=data.get("ORGANIZATION_NAME").trim().equals("X") ? DataFakers.organizationName() :
			data.get("ORGANIZATION_NAME").trim();
	}
	public String setCoverageInQuestion() {
		return coverageInQuestion=data.get("COVERAGE_IN_QUESTION").trim().equals("X") ? DataFakers.coverageInQuestion() :
			data.get("COVERAGE_IN_QUESTION").trim();
	}
	public String setFlaggedType() {
		return flaggedType=data.get("FLAGGED_TYPE").trim().equals("X") ? DataFakers.flaggedType() :
			data.get("FLAGGED_TYPE").trim();
	}
	public String setJurisdictionState() {
		return jurisdictionState=data.get("JURISDICTION_STATE").trim().equals("X") ? DataFakers.jurisdiction() :
			data.get("JURISDICTION_STATE").trim();
	}
	public String setMake() {
		return make=data.get("MAKE").trim().equals("X") ? DataFakers.make():
			data.get("MAKE").trim();
	}
	public String setModel() {
		return model=data.get("MODEL").trim().equals("X") ? DataFakers.model():
			data.get("MODEL").trim();
	}
	public String setYear() {
		return year=data.get("YEAR").trim().equals("X") ? DataFakers.year():
			data.get("YEAR").trim();
	}

	public String setVin() {
		return vin=data.get("VIN").trim().equals("X") ? DataFakers.vin():
			data.get("VIN").trim();
	}


	public String setClaimantType() {
		return claimantType=data.get("CLAIMANT_TYPE").trim().equals("X") ? DataFakers.claimantType() :
			data.get("CLAIMANT_TYPE").trim();
	}

	public String setLossOccurred() {
		return lossOccurred=data.get("LOSS_OCCURRED").trim().equals("X") ? DataFakers.lossOccurred() :
			data.get("LOSS_OCCURRED").trim();
	}

	public String setReserveLine() {
		return reserveLine=data.get("RESERVE_LINE").trim().equals("X") ? DataFakers.reserveLine() :
			data.get("RESERVE_LINE").trim();
	}
	public String setRecoveryCategory() {
		return recoveryCategory=data.get("RECOVERY_CATEGORY").trim().equals("X") ? DataFakers.recoveryCategory() :
			data.get("RECOVERY_CATEGORY").trim();
	}
	public String setPaymentType() {
		return paymentType=data.get("PAYMENT_TYPE").trim().equals("X") ? DataFakers.paymentType() :
			data.get("PAYMENT_TYPE").trim();
	}
	public String setRandomText() {
		return randomText=data.get("RANDOM_TEXT").trim().equals("X") ? DataFakers.generateRandomLetters() :
			data.get("RANDOM_TEXT").trim();
	}
	public String setDocumentName() {
		return documentName=data.get("DOCUMENT_NAME").trim();
	}

}