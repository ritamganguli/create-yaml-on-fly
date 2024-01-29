package com.aspire.guidewire.bc.teststeps;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class BillingCenterFeatures {
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class TroubleTicket {
		
		private String troubleTicketType;
		
		private String troubleTicketSubject;

		private String troubleTicketDetails;
		
		private String troubleTicketPriority;
		
		private String troubleTicketRealeaseDate;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class WriteOff {
		
		private String reason;
		
		private String chargePattern;

		private String writeoffAmount;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class WriteOffReversal {

		private String unAppliedFund;
		
		private String minimumAmount;
		
		private String maximumAmount;
		
		private String earliestDate;
		
		private String latestDate;
		
		private String chargePattern;
		
		private String reason;
		
		private String reasonWriteOffReversal;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class SearchAccount{
		
		private String AccountNumber;

		private String amount;

		private String UnappliedFund;
		
	}
	
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Disbursment{
		
		private String reason;
		
		private String amount;
		
		private String date;

		private String unappliedFund;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DirectBillPayment{
		
		private String paymentInstrument;

		private String amount;

		private String UnappliedFund;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PaymentRequest{
		
		private String paymentMethod;

		private String amount;
		
		private String draftDate;

		private String UnappliedFund;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Delinquency{
		
		private String reason;
		
		private String policyNo;

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RunBatchProcess{
		
		private String BatchProcessName;
		
		private String EffectiveDate;
		

	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PolicyNo{
		
		private String policyNo;

		
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class MessageQueue{
		
		private boolean restartMessageQueue;
	}
	
}



