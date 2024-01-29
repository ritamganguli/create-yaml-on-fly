package com.aspire.guidewire.cc.teststeps.inlandmarine;

public class InlandMarineConstants{

	public enum Coverages{
		
		POLICY_LEVEL_COVERAGES,
		UL_CLASS_A,
		ONE_NULL;
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

