package com.aspire.guidewire.cc.teststeps.homeowners;

public class HomeOwnersConstants{

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

		COVERAGE_A,
		COVERAGE_C,
		COVERAGE_D,
		COVERAGE_E,
		COVERAGE_F,
		COVERAGE_B,
		FUNGUS_AND_MOLD_REMEDIATION,
		IDENTITY_THEFT_PROTECTION,
		SCHEDULED_PERSONAL_PROPERY;
	} 

	public enum ContactType{
		PERSON,
		VENDOR,
		COMPANY,
		LEGAL,
		EXISTING_CONTACT;
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
		CLONE_CHECK;
	}

	public enum PolicyType{
		DWELLING,
		CONDOMINIUM,
		RENTAL;
	}

	public enum State{

		ARIZONA ("Arizona"),
		FLORIDA ("Florida"),
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

