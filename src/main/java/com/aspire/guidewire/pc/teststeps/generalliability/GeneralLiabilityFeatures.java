package com.aspire.guidewire.pc.teststeps.generalliability;

import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.CloseOptionType;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants.PolicyReviewType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class GeneralLiabilityFeatures {

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
		
		private String interestType;
		
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
		
		private String interestType1;
		
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
	@AllArgsConstructor
	public static class AddLocationInfo  {

		private String addressLine1;

		private String city;

		private String state;

		private String zipCode;
		
		private boolean next;
		}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Coverages{

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
	public static class Exposures{

		private String basis;
		
		private String code;
		
		private boolean next;


	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RiskAnalysis{

		private String issueType;

		private String shortDescription;

		private String longDescription;

		private String contingencyTitle;

		private String contingencyDescription;

		private String contingencyAction;

		private String contingencyDueDate;
		
		private String motorVehicleRecords;

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

		public static CloseOptionsBuilder builder(CloseOptionType closeOptionType) {
			return new CloseOptionsBuilder().closeOptionType(closeOptionType);
		}
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
	public static class Offerings{
		
		private String offering;
	}
	
}



