package com.aspire.guidewire.cc.teststeps.businessowners;

public class BusinessOwnersConstants{

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
		COVERAGE_L,
		COVERAGE_A,
		COVERAGE_C,
		COVERAGE_D,
		COVERAGE_E,
		COVERAGE_P,
		COVERAGE_T,
		COVERAGE_R,
		COVERAGE_U,
		SPECIAL_COVERAGES_PACKAGES,
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
	
	public enum PaymentType {
		RECOVERY,
		MANUAL_CHECK,
		MET_CHECK,
		TRANSFER_CHECK,
		CLONE_CHECK;
	}
	public enum DocumentType{
		TEMPLATE_CLAIM,
		UPLOAD_DOCUMENT,
		INDICATE_EXISTENCE;
	}

}

