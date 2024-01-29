package com.aspire.guidewire.cc.teststeps.businessowners;

import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class BusinessOwnersFeatures {

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Searchpolicy {

		private String lossDate;
		
		private String policyNo;
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

		private AddPropertyDamage addPropertyDamage;
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
	public static class ChooseCoveragesByType {

		private Coverages coverages;

		private CoverageType_M coverage_M;
		
		private CoverageType_L coverage_L;

		private CoverageType_A coverage_A;

		private CoverageType_C coverage_C;

		private CoverageType_P coverage_P;

		private CoverageType_T coverage_T;

		private CoverageType_D coverage_D;

		private CoverageType_E coverage_E;

		private CoverageType_R coverage_R;

		private CoverageType_U coverage_U;
		
		private ContactDetails contactDetails;

		public static ChooseCoveragesByTypeBuilder builder(Coverages coverages) {
			return new ChooseCoveragesByTypeBuilder().coverages(coverages);
		}

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_L {

		private Liability Liability;
		
		private ContactDetails contactDetails;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_M {

		private Coverage moneyAndSecurities;

		private Coverage comprehensive;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AssignClaim{
		
		private AssignType assignType;
		
		private String location;
}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_A {

		private Coverage aggregateLimitsOfInusrance;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_C {

		private Coverage collision;

		private Coverage comprehensive;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_P {

		private Coverage PIP_Kentucky;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_R {

		private Coverage rentalReimbursement;

		private Coverage rentalCarLossOfUse;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_U {

		private Coverage uninsuredMotoristsPropertyDamage;

		private Coverage underInsuredMotoristsPropertyDamage;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_T {

		private Coverage tapeAndDisc;

		private Coverage towingAndLabor;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_D {

		private Coverage deathAndDisability;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CoverageType_E {

		private Coverage electronicEquipment;

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
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseCoverages {

		private Coverages coverages;
		
		private Liability liability;

		private Liability_BodilyCoverageAndPropertyCoverage liability_Coverage;

		private MexicoCoverageLimited mexicoCoverage;
		
		private Coverage specialCoveragePackages;

		private Coverage uninsuredMotoristsodilyInjury;

		private Coverage underInsuredMotoristsodilyInjury;
		
		private ContactDetails contactDetails;

		public static ChooseCoveragesBuilder builder(Coverages coverages) {
			return new ChooseCoveragesBuilder().coverages(coverages);
		}

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Liability_BodilyCoverageAndPropertyCoverage{

		private Coverage liability_BodilyInjury;

		private Coverage liability_PropertyDamage;

		private Coverage liability_VehicleDamage;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Liability{

		private Coverage liability_BI;

		private Coverage liability_PD;

		private Coverage liability_GenDamages;
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class MexicoCoverageLimited{

		private Coverage mexicoCoverage_BI;

		private Coverage mexicoCoverage_PD;

		private Coverage mexicoCoverage_VehicleDamage;

		private Coverage mexicoCoverage_GenDamage;
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
	public static class Contact{

		private ContactType contactType;

		private ContactDetails person;

		private ContactDetails company;

		private Vendor vendor;

		private Legal legal;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Vendor{

		private ContactDetails autobodyRepairShop;

		private ContactDetails autoTowingAgency;

		private ContactDetails doctor;

		private ContactDetails medicalCareOrganization;

		private ContactDetails vendor_Company;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Legal{

		private String adjudicator;

		private String attorney;

		private String lawFirm;

		private String legalVenue;

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
		
		private String payment;
		
		private String claimNumber;
		
		private String state;
		
		private String city;
		
		private PaymentType paymentType;
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
		
		private String newAvailableReserves;
		
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
	public static class ChooseDocumentsByType {
		
		private DocumentType documentType;
		
		private IndicateExistence indicateExistence;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ExposureDetails{
		
		private String exposureValue;
		
		private String typeValue;
		
		private String note;
		
		private String outcome;
		
		private String reason;

		private String openstatus;

		private String closedstatus;

		
		
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
	public static class ReOpenClaim{

		private String note;
		
		private String outcome;
			
		private String closedStatus;
		
		private String openStatus;
		
		private String reason;


	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class SearchClaim {
		
		private String claimNo;
		
	}
	
}








