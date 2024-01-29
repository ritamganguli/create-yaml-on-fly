package com.aspire.guidewire.cc.teststeps.inlandmarine;

import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class InlandMarineFeatures {

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

		private Coverage coverageByType;

		private String coverageName;

		public static ChooseCoveragesByTypeBuilder builder(String coverageName) {
			return new ChooseCoveragesByTypeBuilder().coverageName(coverageName);
		}

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

		private Ul_Class_A ul_Class_A;

		private One_Null one_null;
		
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
	public static class Policy_Level_Coverage{

		private Coverage misc_Unscheduled_Items;

		private Coverage rented_Equipment;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Ul_Class_A{

		private Coverage byCoverage;

		private String coverageName;
		
		private Coverage accounts_Receivable;

	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class One_Null{

		private Coverage sign;

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

		private String coverageByType;
		
		private String coverageType;
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
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class WorkPlanDataUnavailability{

		private String dataMessage;
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CloseClaim{

		private String note;
		
		private String dataMessage;
		
		private String outcome;
		
		private String closedStatus;
		
		private boolean workPlanDataUnavailability;
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