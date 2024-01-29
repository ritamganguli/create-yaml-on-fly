package com.aspire.guidewire.cc.teststeps.commercialproperty;

import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class CommercialPropertyFeatures {

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

		private Coverage businessPersonalPropertyStock;
		
		private Coverage extraExpenseCoverage;
		
		private Coverage businessPersonalPropertyCoverage;

		public static ChooseCoveragesByTypeBuilder builder(Coverages coverages) {
			return new ChooseCoveragesByTypeBuilder().coverages(coverages);
		}

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

		private String description;

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
		
		private Coverage businessCoverage;
		
		private Coverage extraExpenseCoverage;
		
		private Coverage businessPersonalPropertyCoverage;
		
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
		
		private String documentType;
		
		private String jurisdictionState;
		
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
	public static class EmailDetails{
		
		private String emailAdress;
		
		private String subject;
		
		private String body;
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








