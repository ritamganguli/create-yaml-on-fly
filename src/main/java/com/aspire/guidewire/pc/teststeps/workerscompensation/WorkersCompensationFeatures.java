package com.aspire.guidewire.pc.teststeps.workerscompensation;

import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.AddressType;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.CloseOptionType;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.CreateAccountOptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.InterestType;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.WCOptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class WorkersCompensationFeatures {

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Qualification {

		private boolean next;


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
		
		private boolean next;
		
		private String policyExpirationDate;
		
		private CreateNewAccount createInsured;
		
		private String ssn;
		
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
		
		private CreateNewAccount additionalInsured;
		
		private boolean next;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddWcCoverages {
		
		private String governingLaw;
		
		private String location;
		
		private String basis;
		
		private boolean next;
		
		private String code;
		
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
		
		public static class AdditionalInterestFromPersonBuilder{

			public AdditionalInterestFromPersonBuilder interestType(InterestType interestType) {
				this.interestType = interestType.getName();
				return this;
			}
			public AdditionalInterestFromPersonBuilder addressType(AddressType addressType) {
				this.addressType = addressType.getName();
				return this;
			}
		}
		
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
	public static class AddWcoptions{
		
		private WCOptions wcOptions;
		
		private String premium;
		
		private String description;
		
		private boolean next;
		
		public static class AddWcoptionsBuilder{

			public AddWcoptionsBuilder wcOptions(WCOptions wcOptions) {
				return new AddWcoptionsBuilder().wcOptions(wcOptions);
			}
	}
	}
		
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RiskAnalysis{

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
		
		private boolean documentAttachWaive;
		
		private boolean onlyPriorLoss;
		
		private boolean uWIssue;
		
		private boolean uWIssueStatus;
		
		private boolean waive;
		
		private boolean resolve;
		
		private boolean Next;
		
		private boolean Clear;

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

		private String date;
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
	}

	




