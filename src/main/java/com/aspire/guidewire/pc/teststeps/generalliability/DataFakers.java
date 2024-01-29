package com.aspire.guidewire.pc.teststeps.generalliability;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import net.datafaker.Faker;


public class DataFakers {

	public static String firstName() {
		return new Faker().name().firstName();
	}

	public static String lastName() {
		return new Faker().name().lastName();
	}

	public static String addressLineOne() {
		return new Faker().address().streetAddress();
	}

	public static String zipCode() {
		return new Faker().numerify("55555-####");
	}

	public static String currentDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String Date = formatter.format(date);
		return Date;
	}

	public static String state(){
		return new Faker().expression("#{options.option 'Arizona','California','Florida'}");
	}

	public static String city() {
		Faker faker = new Faker(new Locale("en-US"));
		return faker.address().cityName();
	}

	public static String producerOrganization() {
		return new Faker().expression("#{options.option 'Whiplash Bros. Auto Insurance'}");
	}

	public static String dateOneMonthAhead() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 30);
		Date futureDateTime = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = sdf.format(futureDateTime);
		return formattedDate;
	}
	
	public static String generateRandomString(String title) {
		Faker faker = new Faker();
		return faker.letterify(title+ "- ?????");
	}
	
	public static String classCode() {
		return new Faker().expression("#{options.option '0002','0005','0007'}");
	}
	
	public static String basis() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}
	
	public static String policyTerms() {
		return new Faker().expression("#{options.option 'Annual','Other'}");
	}
	
	public static String addressType() {
		return new Faker().expression("#{options.option 'Billing','Business','Home'}");
	}
	
	public static String organizationType() {
		return new Faker().expression("#{options.option 'Common ownership','Corporation - private','Individual','Corporation - public','Partnership','Limited partnership'}");
	}
	
	public static String cancellationSource() {
		return new Faker().expression("#{options.option 'Insurer','Insured'}");
	}
	
	public static String reinstatementReason() {
		return new Faker().expression("#{options.option 'Payment received','Other'}");
	}
	
	public static String cancellationReason() {
		return new Faker().expression("#{options.option 'Non-payment','Policy not-taken'}");
	}
	
	public static String notTakenReason() {
		return new Faker().expression("#{options.option 'Policy not-taken','Insured's request - N.O.C'}");
	}
	
	public static String declinedReason() {
		return new Faker().expression("#{options.option 'Loss history','Operations characteristics','Payment history','Products characteristics'}");
	}
	
	public static String renewalCode() {
		return new Faker().expression("#{options.option 'Renew - account consideration','Renew - assigned risk','Renew - good risk','Renew - legal requirement'}");
	}
	public static String preRenewalDirection() {
		return new Faker().expression("#{options.option 'Non-Renew','Not-Taken','Non-Renew and Refer to Underwriter','Refer to Underwriter'}");
	}
	public static String preRenewalSecurity() {
		return new Faker().expression("#{options.option 'Internal Only','Sensitive note','Unrestricted'}");
	}
	public static String preRenewalReason() {
		return new Faker().expression("#{options.option 'Non-Renew - Insured Request','Non-Renew - losses','Non-Renew - material change','Non-Renew - Reinsurance'}");
	}
	public static String offerings() {
		return new Faker().expression("#{options.option 'GL Standard','Special Risk'}");
	}
}
