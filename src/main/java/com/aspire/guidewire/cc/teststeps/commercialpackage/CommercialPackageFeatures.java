package com.aspire.guidewire.cc.teststeps.commercialpackage;

import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.ByCoverages;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class CommercialPackageFeatures {

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

		private String faultRating;

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
	public static class ChooseCoveragesByType {

		private By_Coverage_Type_U bycoverageType_U;
		
		private By_Coverage_Type_L bycoverageType_L;
		
		private By_Coverage_Type_E bycoverageType_E;
		
		private ByCoverages byCoverageTypeName;
						
		public static ChooseCoveragesByTypeBuilder builder(ByCoverages byCoverageTypeName) {
			return new ChooseCoveragesByTypeBuilder().byCoverageTypeName(byCoverageTypeName);
		}

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class By_Coverage_Type_U{

		private Coverage underground_Resources_Cov_Gen_Damages;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class By_Coverage_Type_L{

		private Coverage contractual_Liab_Personal_Advertising_Injury;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class By_Coverage_Type_E{

		private Coverage employee_Benefits_Liability;

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
		
		private String damageDescription;
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseCoverages {

		private Coverages coverages;

		private Policy_Level_Coverage policy_Level_Coverage;

		public static ChooseCoveragesBuilder builder(Coverages coverages) {
			return new ChooseCoveragesBuilder().coverages(coverages);
		}

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Policy_Level_Coverage{
		
		private Coverages coverages;
		
		private Contractual_Liability_Railroads contractual_Liability_Railroads;

		private Liquor_Liability_Endorsement liquor_Liability_Endorsement;
		
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Contractual_Liability_Railroads{
		
		private Coverage contract_Liability_RR_BI;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Liquor_Liability_Endorsement{

		private Coverage liquor_Liability_Cov_BI;

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
	public static class Reserve{

		private String costType;

		private String reserveCostCategory;

		private String reserveAmount;

		private String byCoverageType;
		
		private String coverageType;
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ChooseDocumentsByType {

		private DocumentType documentType;
		
		private UploadDocument uploadDocument;
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
	public static class AssignClaim{

		private AssignType assignType;

		private String location;
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CloseClaim{

		private String dataMessage;
		
		private String note;
		
		private String outcome;
		
		private String closedStatus;
		
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ReOpenClaim{

		private String note;
		
		private String openStatus;
		
		private String reOpenReason;
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