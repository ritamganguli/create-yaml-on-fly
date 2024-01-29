package com.aspire.guidewire.pc.teststeps.inlandmarine;

public class InlandMarineConstants{

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
		POLICY_CHANGE,
		CANCELLATION,
		REINSTATEMENT,
		REWRITE_FULL_TERM,
		REWRITE_REMAINDER_TERM,
		REWRITE_NEW_TERM, 
		RENEW_POLICY,
		WITHDRAW_TRANSACTION,
		DECLINE,
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

}

