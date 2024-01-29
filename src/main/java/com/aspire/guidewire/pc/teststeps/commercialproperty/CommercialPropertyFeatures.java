package com.aspire.guidewire.pc.teststeps.commercialproperty;

import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.RiskAnalysisType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class CommercialPropertyFeatures {

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Qualification {

		private String medicalfacilitiesprovided;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PolicyInfo {

		private String quoteDate;

		private String policyTerm;

		private String policyEffectiveDate;

		private String organizationType;

		private boolean next;

		private boolean addSecondaryInsured;

		private boolean addAdditionalInsured;

		private CreateNewAccount createInsured;


	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddBuildingLocationDetails {
		
		private String propertClassCode;

		private String coverageForm;

		private String description;
		
		private String incomelimit;
		
		private String classcode;
		
		private int buildingMenuCount;

		private int addBuildingCount;
		
		private int addNewBuildingCount;

		private LocationInformation addLocation;
		
		private NewBuilding addBuildingsAndLocation;
		
		private String addressLine1;

		private String city;

		private String state;

		private String zipCode;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class LocationInformation {
		
		private String locationCode;
		
		private String locationName;
		
		private String addressLine1;
		
		private String territoryCodeforCommercialPropertyLine;
		
		private String city;

		private String state;

		private String zipCode;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class NewBuilding {
		
		private String propertyClassCode;
		
		private String coverageForm;

		private String incomeLimit;
		
	}
	
	
	
	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class EnterAccountInformation{

		private String companyName;

		private String firstName;

		private String lastName;

	}

	public interface CreateNewAccount{

		public static final CreateNewAccountFromPerson fromPerson = null;

		public CreateAccountOptions getCreateAccountPreference();

	}

	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class CreateNewAccountFromPerson implements CreateNewAccount {

		private String firstName;

		private String lastName;

		private String addressLine1;

		private String city;

		private String state;

		private String zipCode;

		private String addressType;

		private String organization;

		private boolean addSecondaryInsured;

		private boolean addAdditionalInsured;

		@Override
		public CreateAccountOptions getCreateAccountPreference() {
			return CreateAccountOptions.PERSON;
		}

	}

	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class Blanket  {

		private String blanketType;

		private String groupType;

		private String limit;

		private String deductible;

		private String coinsurance;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Coverage{

		private boolean addAdditionalCoverage;

		private boolean addExclusionAndCondition;

		private String designatedPollutants;

		private boolean next;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RiskAnalysis{
		
		@NonNull
		private RiskAnalysisType riskAnalysisType;

		private String issueType;

		private String shortDescription;

		private String longDescription;

		private String contingencyTitle;

		private String contingencyDescription;
		
		private String contingencyAction;

		private String contingencyDueDate;
		
		private String contingencyDocumentStatus;

		private String contingencyDocumentType;
		
		private String lossHistoryType;

		private String occurenceDateField;

		private String priorLossDescription;

		private String totalIncurred;

		private String amountPaid;
		
		private String openReserve;
		
		private String lossHistoryStatus;
				
		private String uWIssueType;
		
		private String uploadDocumentStatus;
		
		private String uploadDocumentType;
		
		private String lossPercent;
		
		private String lossTotalIncurred;
		
	    private String documentName;
		
        private int lossCount;
				
		public static RiskAnalysisBuilder builder(RiskAnalysisType riskAnalysisType) 
		{
			return new RiskAnalysisBuilder().riskAnalysisType(riskAnalysisType);
		}
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Payments{

		private String paymentsOption;

		private String billingMethod;

		private String paymentPlan;

		private String upFrontPayment;
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PreRenewalDirection{

		private String direction;

		private String security;

		private String reason;

		private String text;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CancellationSource{

		private String source;

		private String reason;
		
		private String refundMethod;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ReinstatementReason{

		private String reason;

		private String other;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PolicyReview{
		@NonNull
		private PolicyReviewType policyReviewType;

		public static PolicyReviewBuilder builder(PolicyReviewType policyReviewType) 
		{
			return new PolicyReviewBuilder().policyReviewType(policyReviewType);
		}
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RenewPolicy{

		private String renewalcode;
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PolicyChange{

		private String date;
	}


	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class BillingOption{

		private String billingMethod;
		private String paymentPlan; 
		private String paymentInstrumentcash;
		private String referenceText;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Quote{
		
		private boolean showRatingWorksheet;
		
		private String IssueType;
		
		private boolean reOpen;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Rating{
		
		private boolean showRatingWorksheet;
		
		private String value;
		
		private String state;
		
		private String fireProductionValue;
		
		private String limit;
		
		private String fileName;
		
		private String coverage1;
		
		private String coverage2;
		
		private String coverage3;
		
		private String coverage4;
		
		private String effectiveDate;
		
		private String expirationDate;
		
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class UWIssueType{

		private String IssueType;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PolicyDetails{
		
		private String policyNumber;
	}

}



