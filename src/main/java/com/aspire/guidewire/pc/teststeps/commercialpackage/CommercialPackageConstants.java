package com.aspire.guidewire.pc.teststeps.commercialpackage;

public class CommercialPackageConstants{

	public enum ProductNames {

		BUSINESS_OWNERS ("Businessowners"),
		COMMERCIAL_AUTO ("Commercial Auto"),
		COMMERCIAL_PACKAGE ("Commercial Package"),
		COMMERCIAL_PROPERTY ("Commercial Property"),
		GENERAL_LIABILITY ("General Liability"),
		HOME_OWNERS ("Homeowners"),
		INLAND_MARINE ("Inland Marine"),
		WORKERS_COMPENSATION ("Workers' Compensation"),
		PERSONAL_AUTO ("Personal Auto");

		private String name;

		ProductNames(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}

	public enum Location {

		NEW_LOCATION ("New Location"),
		EXISTING_LOCATION ("Existing Location");

		private String name;

		Location(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}

	public enum LineType {

		INLAND_MARINE_LINE ("Inland Marine Line"),
		COMMERCIAL_PROPERTY_LINE ("Commercial Property Line"),
		GENERAL_LIABILITY_LINE ("General Liability Line");

		private String name;

		LineType(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}

	public enum CreateAccountOptions {

		COMPANY ("Company"),
		PERSON ("Person"),
		FROM_ADDRESS_BOOK ("From Address Book"),
		OTHER_CONTACTS ("Other Contacts");

		private String name;

		CreateAccountOptions(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}

	public enum CoveragePart {

		ACCOUNTS_RECEIVABLE ("Accounts Receivable"),
		CONTRACTORS_EQUIPMENTS ("Contractors Equipment"),
		SIGNS ("Signs");

		private String name;

		CoveragePart(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}

	public enum CoveragesType {

		NONE("None"),
		STANDARD_COVERAGES ("Standard Coverages"),
		ADDITIONAL_COVERAGES ("Additional Coverages"),
		EXCLUSION_AND_CONDITIONS ("Exclusions & Conditions"),
		ADDITIONAL_INSURED ("Additional Insureds"),
		MULTIPLE_COVEARGES ("Multiple Coverages");

		private String name;

		CoveragesType(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}

	public enum Transactions{
		SUBMISSION,
		POLICY_CHANGE,
		CANCELLATION,
		REINSTATEMENT,
		REWRITE_FULL_TERM,
		REWRITE_REMAINDER_TERM,
		REWRITE_NEW_TERM, 
		RENEW_POLICY,
		WITHDRAW_TRANSACTION,
		DECLINE,
		BIND_ONLY,
		REOPEN,
		NOT_TAKEN;
	}

	/**
	 * To add New, edit existing,remove existing 
	 */
	public enum UserType{
		NEW,
		EXISTING,
		REMOVE,
		ASSIGN_DRIVERS,
		NONE;	
	}

	/**
	 * In Review policy page, based on transaction , we choose which one to execute
	 */
	public enum PolicyReviewType{		
		OUT_OF_SEQUENCE,
		RENEW,
		NONE,
		REWRITE_NEWTERM,
		ACTUAL;
	}

	public enum CloseOptionType{
		WITHDRAW_TRANSACTION,
		DECLINE,
		NOT_TAKEN;
	}

	public enum RiskAnalysisType{
		NONE,
		UW_ISSUE,
		CONTINGENCY,
		RESOLVE_WAIVE,
		REOPEN,
		UW_ISSUE_APPROVE_REQUEST,
		PRIORLOSSES_ATTACH_DOCUMENT,
		PRIORLOSSES_MANUAL_ENTER,
		RESOLVE_CONTINGENCY,
		WAIVE_CONTINGENCY,
		ATTACH_DOCUMENT_CONTINGENCY,
		PRIORLOSSES,
		PRIOR_POLICIES;
	}

}

