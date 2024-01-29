package com.aspire.guidewire.pc.teststeps.workerscompensation;

public class WorkersCompensationConstants{

	public enum ProductNames {

		BUSINESS_OWNERS ("Businessowners"),
		COMMERCIAL_AUTO ("Commercial Auto"),
		COMMERCIAL_PACKAGE ("Commercial Package"),
		COMMERCIAL_PROPERTY ("Commercial Property"),
		GENERAL_LIABILITY ("General Liability"),
		HOME_OWNERS ("Homeowners"),
		INLAND_MARINE ("Inland Marine"),
		WORKERS_COMPENSATION ("Compensation"),
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

		SILVER ("Silver"),
		PLATINUM ("Platinum"),
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

	public enum OrganizationType {

		COMMON_OWNERSHIP ("Common ownership"),
		CORPORATION_PRIVATE ("Corporation - private"),
		INDIVIDUAL ("Individual"),
		OTHER ("Other"),
		PARTNERSHIP ("Partnership"),
		NONE("None");

		private String name;

		OrganizationType(String name) 
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

	public enum BusinessType {

		APARTMENT ("Apartment"),
		MOTEL ("Motel"),
		SELF_STORAGE ("Self Storage"),
		WHOLESALER("Whole saler");

		private String name;

		BusinessType(String name) {
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
		CALIFORNIA ("California");

		private String name;

		State(String name) {
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
		
		/**
		 * In Risk Analysis page, based on contingency , we choose which one to execute
		 */
		public enum RiskAnalysisType{
			NONE,
			UW_ISSUE,
			CONTINGENCY,
			RESOLVE_WAIVE,
			PRIORLOSSES;
		}
	
	public enum GoverningLaw {
		STATE_ACT ("State Act"),
		VOLUNTARY_COMP ("Voluntary Comp"),
		USLH ("U.S.L. & H."),
		FED_COAL_MINE_ACT ("Fed Coal Mine Act"),
		NONE ("None");

		private String name;

		GoverningLaw(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
		

	}
	
	public enum WCOptions {
		
      MANUSCRIPT_OPTION("manuscript option");
	
		private String name;

		WCOptions(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}
}

