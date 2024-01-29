package com.aspire.guidewire.pc.teststeps.commercialpackage;

import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CloseOptionType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CoveragePart;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CoveragesType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.LineType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.Location;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.RiskAnalysisType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class CommercialPackageFeatures {

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
	public static class Offerings {

		private String offerings;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddLineSelectionDetails {

		private String packageRiskType;

		private LineType selectLineType;

		private LineType unSelectLineType;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddLocationDetails {

		private String businessType;

		private String blanket;

		private String addressLine1;

		private String city;

		private String state;

		private String zipCode;

		private Location location;

	}



	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddBuildingLocationDetails {

		private String buildingDescription;

		private String coverageForm;

		private String limit;

		private LineType lineType;

	}


	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddBlanketDetails{

		private String blanketType;

		private String groupType;

		private String limit;

		private String deductible;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddCoveragePartSelections {

		private CoveragePart coveragePart;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddAccountReceivableDetails {

		private String businessClass;

		private String coinsurancePct;

		private String receptacleType;

		private String percentDuplicated;

		private String limit;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddContractorsEquipmentDetails {

		private String contractorType;

		private String coinsurancePct;

		private String limit;

		private String deductible;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddLineReview {

		private LineType lineType;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddSignsDetails {

		private String coinsurancePct;

		private String signType;

		private String limit;

		private String deductible;

		private String description;

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

		private String insuredType;

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
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ViewQuote{
		
		private LineType lineType;
		private String IssueType;
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
		
		private String carrier;
		
		private String policyNo;
		
		private String effectiveDate;
		
		private String expirationDate;
		
		private String annualPremium;
		
		private String losses;
		
		private String totalLosses;
		
		private int lossCount;
		
		private LineType lineType;
		
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
	public static class AddCoveragesDetails{  

		private CoveragesType coveragesType;
		
		private String designatedPollutants;

		private String policyBasis;
		
		private CreateNewAccount createInsured;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddExposuresDetails{

		private String basis;

		private String code;

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
