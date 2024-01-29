package com.aspire.guidewire.pc.teststeps.commercialauto;

import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.PolicyType;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.RiskAnalysisType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class CommercialAutoFeatures {

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Qualification {

		private String coverageForm;
		
		private String errorMessage;
		
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Offerings {
		
		private String offerings;
		
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

		private boolean addSecondaryInsured;

		private boolean addAdditionalInsured;

		private CreateNewAccount createInsured;

		private String organizationType;

		private String organisationName;

		private String uwCompany;

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

		private String producerCode;

		private boolean addSecondaryInsured;

		private boolean addAdditionalInsured;

		private String insuredType;

		private String schoolName;

		@Override
		public CreateAccountOptions getCreateAccountPreference() {
			return CreateAccountOptions.PERSON;
		}

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
		
		private String issueType;

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
	public static class Vehicles{

		private String vehicleType; 
		private String VIN;
		private String cost;
		private String state;
		private String classCode;
		private boolean existingVehiceDeletionStatus;
	}


	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Drivers{

		private boolean motorVehicleRecord; 

		private String yearFirstLicensed;

		private String firstName;

		private String lastName;

		private String dateOfBirth;

		private String addressLineOne;

		private String zipCode;

		private String state;

		private String city;

		private String addressType;

		private String licenseState;

		private String licenseNumber;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CommercialAutoLine {
		
		private PolicyType productType;

		private String fleet;

		private String product;

		private String noOfEmployees;

		private String nonOwnedLiabilityState;

		private boolean addAdditionalInsured;

		private Coverages addCoverage;

		private CreateNewAccount createInsured;
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Coverages{

		private String state;

		private String costOfHire;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class UWIssueType{

		private String issueType;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class SearchFor{
		
		private String subissionNumber;
		
		private String searchType;
		
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



