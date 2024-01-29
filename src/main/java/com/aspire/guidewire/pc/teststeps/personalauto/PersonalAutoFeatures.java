package com.aspire.guidewire.pc.teststeps.personalauto;

import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.CloseOptionType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.InterestType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.RadioButton;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.UserType;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class PersonalAutoFeatures {

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

		private String numberOfAccidentsPolicyLevel;

		private String numberOfAccidentsAccountLevel;

		private String numberOfViolationsPolicyLevel;

		private String numberOfViolationsAccountLevel;
		
		private boolean applyGoodDriverDiscount;
		
		private RadioButton rdbApplyGoodDriverDiscount;
		
		private boolean qualifiesForGoodDriverDiscount;
		
		private RadioButton rdbQualifiesForGoodDriverDiscount;
		
		private boolean goodStudent;
		
		private RadioButton rdbGoodStudent;
		
		private RadioButton yes;
		
		private RadioButton radioButton;
		
		private boolean exclude;

		private RadioButton no;
		
		private RadioButton rdbExclude;
		
		private UserType usertype; 

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
		
		private InterestType interestType1;
		
		private InterestType interestType2;
		
		private String insuredName;
		
		private boolean isAddInstrestFirstPerson;
		
		private boolean isAddInstrestSecondPerson;
		
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
	public static class Vehicles{
		@NonNull
		private UserType userType;
		private String vehicleType; 
		private String VIN;
		private String cost;
		private String state;
		private String[] percentage;
		private boolean vintelligence; // Used to verify the integration of VIN.Verification of auto populate fields as Model Year,Color,Make and Model

		public static VehiclesBuilder builder(UserType userType) {
			return new VehiclesBuilder().userType(userType);
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
		
		private String	comprehensiveCoverage;
		
		private String	collisionCoverage;

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
		
		private String motorVehicleRecords;
		
		private String contingencyDocumentStatus;

		private String contingencyDocumentType;
		
		private String documentName;
		
		private String carrier;
		
		private String policyNo;
		
		private String effectiveDate;
		
		private String expirationDate;
		
		private String annualPremium;
		
		private String losses;
		
		private String totalLosses;
		
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
	public static class UploadDocument{
		
		private String documentName;
		
		private String status;
		
		private String documentType;
		
		private boolean newDocument;
		
		private String uploadDocument;


	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseDocumentsByType {
		
		private String documentType;
		
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Rating{
		
		private boolean showRatingWorksheet;
		
		private String state;
		
		private String factorVal;
		
		private String factorCostVal;
		
		private String uwValue;
		
		private String vehicleTypeValue;
		
		private String fileName;
		
		private String multiCarDiscountValue;
		
		private String coverage1;
		
		private String coverage2;
		
		private String coverage3;
		
		private String coverage4;
		
		private String coverage5;
		
		private String effectiveDate;
		
		private String expirationDate;
		
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DownloadDocument{
		
		private String expectedText;
		
		private String filename;
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
	public static class UnderWriterIssue{
		
		private boolean UwIssueAlert;
	}
	
}