package com.aspire.guidewire.pc.teststeps.homeowners;

import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.CloseOptionType;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.InsuredType;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.InterestType;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.PolicyType;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants.RiskAnalysisType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class HomeOwnersFeatures {

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Qualification {

		private String applicansLicenseCurrently;

		private String driverTrafficViolations;

		private String policyType;

		private String coverageForm;

		private String dwellingOccupied;

		private String occupyDwellingFullTime;

		private boolean tenant;

		private boolean myself;

		private boolean next;

		private String errorMessage;

		private String qualificationType;

		private PolicyType typeOfPolicy;

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

		private String policyExpirationDate;

		private boolean next;

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

		private InsuredType insuredType;

		private String schoolName;

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

		private InterestType interestType;

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

		public static class AdditionalInterestFromOtherContactsBuilder{

			public AdditionalInterestFromOtherContactsBuilder interestType1(InterestType interestType) {
				this.interestType1 = interestType.getName();
				return this;
			}
		}

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

		private int lossCount;

		private String carrier;

		private String policyNo;

		private String effectiveDate;

		private String expirationDate;

		private String annualPremium;

		private String losses;

		private String totalLosses;

		private String documentName;

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
	public static class SplitOff{

		private String accountNumber1;

		private String accountNumber2;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class SpinOff{

		private String accountNumber;

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
	public static class DwellingConstruction{

		private String year;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Coverages {

		private String coinsurance;

		private String prohibitedUse;

		private String lossOfRentalIncome;

		private String covCLimit;

		private String valuationMethod;
		
		@NonNull
		private PolicyType policyType;

		public static CoveragesBuilder builder(PolicyType policyType) {
			return new CoveragesBuilder().policyType(policyType);
		}
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DwellingDetails {

		private String fireProtection;

		private boolean addAdditionalInsured;

		private boolean addAdditionalInterest;

		private CreateNewAccount createInsured;

		private AdditionalInterest createInterest;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Quote{

		private boolean showRatingWorksheet;

		private boolean coverageForm;

		private String coverageFormName;

	}
	
	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class CreateEmail {

		private String emailBody;

		private String emailSubject;

		private String documentType;

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

		private String factorVal;

		private String limit;

		private String fileName;

		private String coverage1;

		private String coverage2;

		private String coverage3;

		private String coverage4;

		private String coverage5;

		private String coverageName;

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
	public static class HistoryDetails{

		private String originalValue;

		private String newValue;	

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