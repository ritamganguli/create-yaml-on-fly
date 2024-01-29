package com.aspire.guidewire.cc.teststeps.nonlob;

import com.aspire.guidewire.cc.teststeps.nonlob.NonLobConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class NonLobFeatures {
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Searchpolicy {
		
		private UnVerifiedpolicy unVerifiedPolicy;
		
		private VerifiedPolicy verifiedPolicy;

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
	public static class UnVerifiedpolicy {
		
		private String policyNumber;
		
		private String type;

		private String expirationDate;

		private String effectiveDate;

		private String lossDate;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class VerifiedPolicy {

		private String lossDate;
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
		
		private String faultRating;
		
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
		
		private CoverageType_C coverage_C;

		private CoverageType_P coverage_P;
		
		private CoverageType_T coverage_T;
		
		private CoverageType_D coverage_D;
		
		private CoverageType_E coverage_E;
		
		private CoverageType_R coverage_R;
		
		private CoverageType_U coverage_U;
		
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
	public static class CoverageType_M {
		
		private Coverage moneyAndSecurities;
		
		
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
		
		private String vehicleName;
		
		private String driverName;
		
		private String lossOccurred;
		
		private String injuredPerson;
		
		private String lossParty;
		
		private String description;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseCoverages {
		
		private Coverages coverages;
		
		private Liability_BodilyCoverageAndPropertyCoverage liability_Coverage;
		
		private MexicoCoverageLimited mexicoCoverage;
		
		private Coverage uninsuredMotoristsodilyInjury;
		
		private Coverage underInsuredMotoristsodilyInjury;
		
		private Coverage medicalpayments;
		
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
		
		private ContactDetails adjudicator;
		
		private ContactDetails attorney;
		
		private ContactDetails lawFirm;
		
		private ContactDetails legalVenue;
		
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
	public static class AssignClaim{
		
		private AssignType assignType;
		
		private String location;
}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class LossDetails{
		
		private String faultRating;
		
		private SubrogationDetails subrogationDetails;
		
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class SubrogationDetails{
		
		@NonNull
		private String status;
		
		private String outcome;
	
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
	public static class ExposureDetails{
		
		private String closeExposureValue;
		
		private String openExposureValue;
		
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
	public static class MessageQueue{
		
		private boolean restartMessageQueue;
	}
}



