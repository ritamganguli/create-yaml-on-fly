package com.aspire.guidewire.cc.teststeps.commercialauto;

import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.DocumentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class CommercialAutoFeatures {

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

		private CoverageType_C coverage_C;

		private CoverageType_P coverage_P;

		private CoverageType_T coverage_T;

		private CoverageType_D coverage_D;

		private CoverageType_E coverage_E;

		private CoverageType_R coverage_R;

		private CoverageType_U coverage_U;

		private CoverageType_H coverage_H;

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
	public static class CoverageType_H {

		private HiredAutoLiability hiredAutoLiability;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class HiredAutoLiability {

		private Coverage hiredAutoLiability_BI;

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

		private String year;

		private String make;

		private String model;

		private String description;

		private String vin;
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseCoverages {

		private Coverages coverages;
		
		private ContactDetails contactDetails;

		private Liability_BodilyCoverageAndPropertyCoverage liability_Coverage;

		private MexicoCoverageLimited mexicoCoverage;

		private Coverage uninsuredMotoristsodilyInjury;

		private Coverage underInsuredMotoristsodilyInjury;

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

		private String name;

		private String city;

		private String state;

		private String address;

		private String roles;

		private String firstName;

		private String lastName;

		private String taxIdSSN;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class TowingAgency{

		private String taxId;

		private String name;
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

		private String payment;

		private String claimNumber;

		private String beforeRunStatus;

		private String afterRunStatus;

		private String batchName;

		private String city;

		private String state;
	}

	public enum PaymentType {
		RECOVERY,
		MANUAL_CHECK,
		MET_CHECK,
		CLONE_CHECK,
		TRANSFER_CHECK;
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
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class policyDetails{
		
		private String policyNo;
	}
}





