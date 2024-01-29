package com.aspire.guidewire.cc.teststeps.personalauto;

public class PersonalAutoConstants{

	public enum RadioButton{
		YES("yes"),
		NO("no");
		
		private String name;

		RadioButton(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	public enum Coverages{
		
		COVERAGE_M,
		COVERAGE_C,
		COVERAGE_D,
		COVERAGE_E,
		COVERAGE_P,
		COVERAGE_T,
		COVERAGE_R,
		COVERAGE_U,
		LIABILITY_BODILY_INJURY_PROPERTY_DAMAGE,
		MEXICO_COVERAGE_LIMITED,
		MEDICAL_PAYMENTS,
		UNDERINSURED_MOTORIST_BODILY_INJURY,
		UNINSURED_MOTORISTS_BODILY_INJURY;
	}
	
	public enum ContactType{
		PERSON,
		VENDOR,
		COMPANY,
		LEGAL;
	}
	public enum AssignType{
		SELECT_FROM_LIST,
		SEARCH_BY_LOCATION,
		SEARCH_BY_DISTANCE_FROM_LOCATION;
	}
	
	public enum DocumentType{
		TEMPLATE_CLAIM,
		UPLOAD_DOCUMENT,
		INDICATE_EXISTENCE;
	}
	
	public enum ClaimService{
		
		ADJUDICATE_CLAIM("Adjudicate claim");
		
		private String name;

		ClaimService(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	
	public enum PaymentType {
		RECOVERY,
		MANUAL_CHECK,
		MET_CHECK,
		TRANSFER_CHECK,
		CHECK,
		CLONE_CHECK;
	}
}

