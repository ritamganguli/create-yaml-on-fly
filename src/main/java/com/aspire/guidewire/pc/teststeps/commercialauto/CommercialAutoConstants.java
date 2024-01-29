package com.aspire.guidewire.pc.teststeps.commercialauto;

public class CommercialAutoConstants{

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
	/**
	 * In Risk Analysis page, based on contingency , we choose which one to execute
	 */
	public enum RiskAnalysisType{
		NONE,
		UW_ISSUE,
		CONTINGENCY,
		RESOLVE_CONTINGENCY,
		WAIVE_CONTINGENCY,
		PRIORLOSSES_ATTACH_DOCUMENT,
		PRIORLOSSES_MANUAL_ENTER,
		UW_ISSUE_REOPEN,
		UW_ISSUE_APPROVE_REQUEST,
		ATTACH_DOCUMENT_CONTINGENCY;
	}

	/**
	 * In Review policy page, based on transaction , we choose which one to execute
	 */
	public enum PolicyReviewType{	
		SUBMISSION,
		OUT_OF_SEQUENCE,
		RENEW,
		NONE,
		REOPEN,
		SUB,
		ACTUAL;
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
		NOT_TAKEN;
	}
	
	public enum PolicyType{
		BUSINESSAUTO,
		GARAGE_KEEPER,
		BUSINESSAUTO_PHYSICALDAMAGE, 
		MOTOR_CARRIERANDTRUCKERS;
	}
}

