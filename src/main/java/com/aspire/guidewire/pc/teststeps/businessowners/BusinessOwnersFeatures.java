package com.aspire.guidewire.pc.teststeps.businessowners;

import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.CloseOptionType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.RiskAnalysisType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class BusinessOwnersFeatures {

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Qualification {

		private String applicansLicenseCurrently;

		private String driverTrafficViolations;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PolicyInfo {

		private String quoteDate;
		
		private String policyTerm;
		
		private String organizationType;

		private String policyEffectiveDate;
		
		private boolean addSecondaryInsured;
		
		private boolean addAdditionalInsured;
				
		private CreateNewAccount createInsured;
		
	}


	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class UpdateBusinessOwnersLine {

		private String businessType;

		private String blanket;
		
		private boolean addAdditionalInsured;
		
		private boolean addAdditionalCoverage;
		
		private boolean addExclusionAndCondition;
		
		private CreateNewAccount additionalInsured;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddLocationDetails {

		private String businessType;

		private String blanket;
		
		private boolean addAdditionalInsured;
		
		private String addressLine1;

		private String city;

		private String state;

		private String zipCode;
		
		private CreateNewAccount additionalInsured;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddBuildingDetails {

		private String buildingClassCode;

		private String basicAmount;
		
		private String buildingLimit;
		
		private String businessPropertyLimit;
		
		private boolean addAdditionalInterest;
		
		private boolean addAdditionalCoverage;
		
		private CreateNewAccount additionalInterest;

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
	
	public interface AdditionalInterest{
		
		public static final AdditionalInterestFromPerson fromPerson = null;
		
		public static final AdditionalInterestFromOtherContacts fromOtherContacts = null;
		
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
	public static class AdditionalInterestFromPerson implements AdditionalInterest {
		
		private String firstName;
		
		private String lastName;
		
		private String addressLine1;
		
		private String city;
		
		private String state;
		
		private String zipCode;
				
		private String addressType;
		
		@Override
		public CreateAccountOptions getCreateAccountPreference() {
			return CreateAccountOptions.PERSON;
		}
		
	}
	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class AdditionalInterestFromOtherContacts implements AdditionalInterest {
				
		private String interestType2;
		
		private String insuredName;
		
		@Override
		public CreateAccountOptions getCreateAccountPreference() {
			return CreateAccountOptions.OTHER_CONTACTS;
		}
		
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PACoverage{

		private String autoLiabilityPackage;

		private String	medicalLimit;

		private String UninsuredMotoristBILimits;

		private String underinsuredMotoristBILimits;
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
	public static class CloseOptions{
		@NonNull
		private CloseOptionType closeOptionType;
		private String reasonNotTaken; 
		private String reasonDeclined;
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

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Offerings {

		private String offerings;

	}
	
}