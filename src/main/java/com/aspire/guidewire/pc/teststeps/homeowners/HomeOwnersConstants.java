package com.aspire.guidewire.pc.teststeps.homeowners;

public class HomeOwnersConstants{

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
		
	FIRST_MORTGAGE("First Mortgagee"),
	SECOND_MORTGAGE("Second Mortgagee"),
	THIRD_MORTGAGE("Third Mortgagee"),
	ADDITIONAL_MORTGAGE("Additional Mortgagee"),
	CERTIFICATE_HOLDER("Certificate Holder"),
    THIRD_PARTY_DESIGNEE("Third Party Designee"),
    LANDLORD("Landlord"),
    LEASING_COMPANY("Leasing Company");
	
		
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
		KENTUCKY("Kentucky");

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
		BIND_ONLY,
		REOPEN,
		NOT_TAKEN;
	}
	
	public enum UserType{
		NEW,
		EXISTING,
		REMOVE,
		ASSIGN_DRIVERS,
		NONE;	
	}
	
	public enum PolicyReviewType{		
		OUT_OF_SEQUENCE,
		RENEW,
		NONE,
		ACTUAL;
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
	
	public enum PolicyType{
		DWELLING("Dwelling"),
		CONDOMINIUM("Condominium"),
		RENTAL("Rental"),
		NONE("NONE");
		
		private String name;

		PolicyType(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	
	public enum CoverageForm{
		HO2,
		HO3,
		HO4,
		HO5,
		HO6;
	}
	
	public enum DwellingOccupied{
		MYSELF("Myself"),
		TENANT("Tenant");
		private String name;

		DwellingOccupied(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	
	public enum FireProtection{
		
		SUPERIOR("Superior"),
		STANDARD("Standard"),
		LIMITED("Limited"),
		POOR("Poor"),
		NONE("None");
		
		private String name;

		FireProtection(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	
	public enum ProhibitedUse {
	
		DAYS_14("14 Days"),
		DAYS_45("45 Days");

		private String name;

		ProhibitedUse(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	
	public enum ValuationMethod {
		
		REPLACEMENT_COST("Replacement Cost"),
		ACTUAL_CASH_VALUE("Actual cash value");

		private String name;

		ValuationMethod(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	
	public enum InsuredType{
		CONDO_ASSOCIATION("Condo Association"),
		HOMEOWNERS_ASSOCIATION("Homeowners Association"),
		LANDLORD("Landlord"),
		LEASING_COMPANY("Leasing Company"),
		STUDENT("Student");
		
		private String name;

		InsuredType(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	
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
		ATTACH_DOCUMENT_CONTINGENCY,
		PRIOR_POLICIES;
	}
	
}