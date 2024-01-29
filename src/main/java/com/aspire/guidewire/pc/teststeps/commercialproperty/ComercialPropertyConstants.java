package com.aspire.guidewire.pc.teststeps.commercialproperty;

public class ComercialPropertyConstants{

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

	public enum Transactions{
		SUBMISSION,
		BIND_ONLY,
		POLICY_CHANGE,
		REWRITE_FULL_TERM,
		REWRITE_REMAINDER_TERM,
		REWRITE_NEW_TERM, 
		RENEW_POLICY;
	}

	/**
	 * In Risk Analysis page, based on contingency , we choose which one to execute
	 */
	public enum RiskAnalysisType{
		NONE,
		UW_ISSUE,
		UW_ISSUE_REOPEN,
		UW_ISSUE_APPROVE_REQUEST,
		CONTINGENCY,
		PRIORLOSSES_ATTACH_DOCUMENT,
		PRIORLOSSES_MANUAL_ENTER,
		RESOLVE_CONTINGENCY,
		WAIVE_CONTINGENCY,
		ATTACH_DOCUMENT_CONTINGENCY;
	}
	
	/**
	 * In Review policy page, based on transaction , we choose which one to execute
	 */
	public enum PolicyReviewType{		
		OUT_OF_SEQUENCE,
		RENEW,
		REOPEN,
		NONE;
	}
	
	public enum CloseOptionType{
		WITHDRAW_TRANSACTION,
		DECLINE,
		NOT_TAKEN;
	}
}

