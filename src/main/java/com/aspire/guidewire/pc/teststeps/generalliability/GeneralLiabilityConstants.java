package com.aspire.guidewire.pc.teststeps.generalliability;

public class GeneralLiabilityConstants{

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
		POLICY_CHANGE,
		REWRITE_FULL_TERM,
		REWRITE_REMAINDER_TERM,
		REWRITE_NEW_TERM, 
		RENEW_POLICY;
	}

	public enum PolicyReviewType{		
		OUT_OF_SEQUENCE,
		RENEW,
		NONE;
	}
	
	public enum CloseOptionType{
		WITHDRAW_TRANSACTION,
		DECLINE,
		NOT_TAKEN;
	}
}

