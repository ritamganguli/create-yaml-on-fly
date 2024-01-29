package com.aspire.guidewire.cc.teststeps.workerscompensation;

public class WorkersCompensationConstants{

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
		SEARCH_BY_LOCATION;
	}
	public enum ExposureType{
		MEDICAL_DETAILS,
		INDEMNITY;
	}
	public enum PaymentType {
		RECOVERY,
		TRANSFER_CHECK,
		MANUAL_CHECK;

	}
	public enum DocumentType{
		TEMPLATE_CLAIM,
		UPLOAD_DOCUMENT,
		INDICATE_EXISTENCE;
	}
}

