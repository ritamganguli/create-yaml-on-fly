package com.aspire.guidewire.cc.teststeps.workerscompensation;


import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationConstants.ExposureType;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationConstants.PaymentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class WorkersCompensationFeatures {

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
	public static class SearchClaim {
		
		private String claimNo;
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class BasicInfo {
		
		private String reportedByName;
		
		private String relationToInsured;
		
		private String injuredWorkerName;
		
		private String insuredName;
		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ClaimInfo {
		
		private String dateEmployerNotified;
		
		private String city;
		
		private String state;
		
		private String location;
		
		private String injurySource;
		
		private String radioButtonOptions;
		
		private boolean incidentOnly;
		
		private String injuryDescription;
		
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
		
		private String country;
		
		
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
		
		private ExposureType exposure;
		
		private boolean incidentOnly;
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Exposure{
		
		private ExposureType exposure;
		
		private String name;
		
		private Reserve reserve;
		
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
		
		private PaymentType paymentType;
		
        private String claimNumber;
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
	public static class CloseClaim{
		
		private String note;
		
		private String outcome;
		
		private String reason;

	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CloseExposure{
		
		private String note;
		
		private String outcome;
		
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ClaimStatus{
		
		private String claimStatus;
	}
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class LossDetails{
		//add boolean
		private String compensability;
		
		private boolean InjuryDuringEmploymentRadioButton;
		
		private boolean PerformingRegularJobRadioButton;
		
		private boolean EmployerQuestionsClaimRadioButton;
		
		private boolean SafetyEquipmentProvidedRadioButton;
		
		private boolean SafetyEquipmentUsedRadioButton;
		
		private boolean DrugsInvolvedRadioButton;
		
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
	
	
}



