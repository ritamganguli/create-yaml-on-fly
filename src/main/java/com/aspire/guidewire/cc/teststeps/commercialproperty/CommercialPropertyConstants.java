package com.aspire.guidewire.cc.teststeps.commercialproperty;

public class CommercialPropertyConstants{

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
		
		BUSINESS_COVERAGE,
		BUILDING_INCOME_COVERAGE,
		BUSINESS_PERSONAL_PROPERTY_SEPARATIONOFSTOCK,
		BUSINESS_PERSONAL_PROPERTY_COVERAGE,
		CP_BLANKET_COVERAGE,
		EXTRA_EXPENSE_COVERAGE;
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
		TRANSFER_CHECK,
		MANUAL_CHECK;

	}

	public enum DocumentType{
		TEMPLATE_CLAIM,
		UPLOAD_DOCUMENT,
		INDICATE_EXISTENCE;
	}

	public enum State{

		ARIZONA ("Arizona"),
		FLORIDA ("Florida"),
		KENTUCKY("Kentucky"),
		CALIFORNIA ("California");

		private String name;

		State(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}


}

