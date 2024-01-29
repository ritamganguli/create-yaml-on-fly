package com.aspire.guidewire.cc.teststeps.generalliability;


import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class GeneralLiabilityFeatures {

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Searchpolicy {
		
		private String policyNo;

		private String lossDate;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class SearchClaim {
		
		private String claimNo;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class BasicInfo {
		
		private String insuredName;
		
		private String relationToInsured;
		
		private String lossDate;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ClaimInfo {
		
		private String lossCause;
		
		private String city;
		
		private String state;
		
		private String faultRating;
		
		private String whatHappened;
		
		private AddPropertyDamage addPropertyDamage;
		
		private AddInjury addInjury;
		
		private String lossLocation;
	}
	

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddPropertyDamage {
		
		private String damageDescription;
		
		private String propertyDescription;
		
		private String propertyName;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AddInjury {
		
		private String person;
		
		private String lossParty;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseCoveragesByType {
		
		private Coverages coverages;
		
		private Coverage coverage_M;
		
		private CoverageType_C coverage_C;

		private CoverageType_G coverage_G;
		
		private Coverage coverage_T;
		
		private Coverage coverage_D;
		
		private Coverage coverage_E;
		
		private String coverage;
				
		public static ChooseCoveragesByTypeBuilder builder(Coverages coverages) {
			return new ChooseCoveragesByTypeBuilder().coverages(coverages);
		}

	}
	
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_C {
		
		private Coverage CoverageForInjuryToLeasedWorkers;
		
		private Coverage comprehensive;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_G {
		
	//	private GLDeductible gLDeductible;
		
		private GeneralLiability generalLiability;
		
		private GovermenatalSubdivisions govermenatalSubdivisions;

		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class GovermenatalSubdivisions {
		
	//	private GLDeductible gLDeductible;
		
	//	private GeneralLiability generalLiability;
		
		private Coverage govermenatalSubdivisionsGenDamange;
		
		private Coverage govermenatalSubdivisionsPD;

		

		
	}

	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Coverage {
		
		private String claimant;
		
		private String claimantType;
		
		private String vehicle;
		
		private String driverName;
		
		private String lossOccurred;
		
		private String injuredPerson;
		
		private String lossParty;
		
		private String description;
		
		private String damageDescription;
		
		private String propertyDescription;
		
		private String propertyName;
	}
	
	
		
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseCoverages {
		
		private Coverages coverages;
		
		private GeneralLiability generalLiability;
		
		private DesignatedPollutants designatedPollutants;
		
		private String coverage;
				
		public static ChooseCoveragesBuilder builder(Coverages coverages) {
			return new ChooseCoveragesBuilder().coverages(coverages);
		}
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class GeneralLiability {
		
		private Coverage designatedPollutantCovBI;
		
		private Coverage gLProdCompOpsPropertyDamage;
		
		private Coverage gLPremiseOpsBodilyInjury;

		private Coverage gLPersonalAdvertisingInjury;
		
		private Coverage gLPremiseOpsGeneralDamage;
		
		private Coverage gLPremiseOpsMedPay;
		
		private Coverage gLPremiseOpsPropertyDamage;
		
		private Coverage gLProdCompOpsBodilyInjury;
		
		private Coverage gLProdCompOpsGeneralDamage;
		
		private Coverage gLProdCompOpsMedPay;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DesignatedPollutants {
		
		private Coverage designatedPollutantCovBI;
		
		private Coverage designatedPollutantCovGenDamages;
		
		private Coverage designatedPollutantCovPD;

		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Reserve{
		
		private String costType;
		
		private String costCategory;
		
		private String reserveAmount;
		
		private String coverageType;
		
		private String exposureFilterName;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ServiceDetails{
		
		private String relatedTo;
		
		private String requestType;
		
		private String serviceAddress;
		
		private String service;
		
		private ContactDetails contactDetails;
		
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ContactDetails{
		
		private String taxId;
		
		private String taxIdSSN;
		
		private String name;
		
		private String city;
		
		private String state;
		
		private String address;
		
		private String roles;
		
		private String firstName;
		
		private String lastName;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PaymentOptions{

		private String payer;
		
		private String reserveLine;

		private String exposure;

		private String coverage;

		private String costType;

		private String costCategory;
		
		private String recoveryCategory;

		private String amount;
		
		private PaymentType paymentType;
		
		private String beforeRunStatus;
		
		private String afterRunStatus;
		
		private String batchName;
		
		private String claimNumber;
		
		private String payment;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CreateNote{
		
	private String text;
	
	}
	
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseDocumentsByType {
		
		private DocumentType documentType;
		
		private TemplateClaim templateClaim;
		
		private UploadDocument uploadDocument;
		
		private IndicateExistence indicateExistence;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class TemplateClaim{
		
		private String type;
		
		private String jurisdiction;
		
		private boolean newDocument;

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


	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class IndicateExistence{
		
		private String name;
		
		private String status;
		
		private String documentType;
		
		private boolean newDocument;

		
	}
	

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AssignClaim{
		
		private AssignType assignType;
		
		private String location;
		
		private String searchFor;
}
}



