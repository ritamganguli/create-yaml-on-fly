package com.aspire.guidewire.pc.teststeps.personalauto;

public class PersonalAutoConstants{

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

	public enum Offerings {
		
		BASIC_PROGRAM ("Basic Program"),
		STANDARD_PROGRAM ("Standard Program"),
		PREMIUM_PROGRAM ("Premium Program"),
		NONE("None");

		private String name;

		Offerings(String name) 
		{
			this.name = name;
		}
		
		public String getName() 
		{
			return this.name;
		}
		
	}
	
	public enum PolicyTerm {

		ANNUAL ("Annual"),
		SIX_MONTHS ("6 months"),
		OTHER ("Other");

		private String name;

		PolicyTerm(String name) {
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

	public enum AddressType {

		BILLING ("Billing"),
		BUSINESS ("Business"),
		HOME ("Home"),
		OTHER("Other");

		private String name;

		AddressType(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}
	public enum InterestType {
		
		LESSOR ("Lessor"),
		LIENHOLDER ("Lienholder"),
		LOSS_PAYEE ("Loss Payee");
		
		
		private String name;
		
		InterestType(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
	}

	public enum State{

		ARIZONA ("Arizona"),
		FLORIDA ("Florida"),
		CALIFORNIA ("California"),
		VIRGINIA("Virginia");

		private String name;

		State(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}

	public enum VehicleType {

		PASSENGER_LIGHTTRUCK ("Passenger/Light Truck"),
		OTHER("Other");

		private String name;

		VehicleType(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}

	public enum CancellationSource{

		INSURER("Insurer"),
		INSURED("Insured");

		private String source;

		CancellationSource(String source) {
			this.source = source;
		}

		public String getSource() {
			return this.source;
		}

	}
	public enum ReinstatementReason{

		PAYMENT_RECEIVED("Payment received"),
		OTHER("Other");

		private String name;

		ReinstatementReason(String name) {
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
		UPDATE,
		NONE;	
	}
	
	/**
	 * In Review policy page, based on transaction , we choose which one to execute
	 */
	public enum PolicyReviewType{		
		OUT_OF_SEQUENCE,
		RENEW,
		NONE,
		ACTUAL,
		UW_ISSUE;
	}
	
	public enum CloseOptionType{
		WITHDRAW_TRANSACTION,
		DECLINE,
		NOT_TAKEN;
	}
	
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
	public enum DocumentType{
		TEMPLATE_CLAIM,
		UPLOAD_DOCUMENT,
		INDICATE_EXISTENCE;
	}
	
	public enum RiskAnalysisType{
		NONE,
		CONTINGENCY,
		RESOLVE_CONTINGENCY,
		ATTACH_DOCUMENT_CONTINGENCY_REOPEN,
		ATTACH_DOCUMENT_CONTINGENCY_RESOLVE,
		ATTACH_DOCUMENT_CONTINGENCY,
		PRIOR_POLICIES;
	}
	
}

