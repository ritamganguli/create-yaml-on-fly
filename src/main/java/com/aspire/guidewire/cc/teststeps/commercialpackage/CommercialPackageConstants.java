package com.aspire.guidewire.cc.teststeps.commercialpackage;

public class CommercialPackageConstants{

	public enum Coverages{
		POLICY_LEVEL_COVERAGES,
		CONTRACTUAL_LIABILITY_RAILROADS,
		LIQUOR_LIABILITY_ENDORSEMENT;
		
	}
	
	public enum ByCoverages{
		BY_COVERAGE_TYPE_U,
		BY_COVERAGE_TYPE_L,
		BY_COVERAGE_TYPE_E;
	}

	public enum ContactType{
		PERSON,
		VENDOR,
		COMPANY,
		LEGAL;
	}

	public enum PaymentType {
		RECOVERY,
		MET_CHECK,
		TRANSFER_CHECK,
		MANUAL_CHECK;
	}

	public enum DocumentType{
		TEMPLATE_CLAIM,
		UPLOAD_DOCUMENT,
		INDICATE_EXISTENCE;
	}

	public enum AssignType{
		SELECT_FROM_LIST,
		SEARCH_BY_LOCATION,
		SEARCH_BY_DISTANCE_FROM_LOCATION;
	}
}

