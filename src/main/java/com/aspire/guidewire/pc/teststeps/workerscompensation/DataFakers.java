package com.aspire.guidewire.pc.teststeps.workerscompensation;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
	

	public static String lossOccurred() {
		return new Faker().expression("#{options.option 'At premises','In transit','Other'}");
	}
	
	public static String currentDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String Date = formatter.format(date);
		return Date;
	}
	
	public static String currentYear() {
		LocalDate date = LocalDate.now();   	
		return String.valueOf(date.getYear());
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
	
	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}
	
	public static String VIN() {
		Faker faker = new Faker();
		return faker.number().digits(8);
	}
	public static String ssn() {
		return new Faker().numerify("111-11-1111");
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
		return new Faker().expression("#{options.option '0005','0016','0036'}");
	}

	public static String addressType() {
		return new Faker().expression("#{options.option 'Billing','Business'}");
	}
	public static String organizationType() {
		return new Faker().expression("#{options.option 'Common ownership','Corporation - private','Individual','Corporation - public','Partnership','Limited partnership'}");
	}
	
	public static String policyTerm() {
		return new Faker().expression("#{options.option 'Annual','Other'}");
	}
	public static String governingLaw() {
		return new Faker().expression("#{options.option 'State Act','Voluntary Comp','U.S.L. & H.'}");
	}
	public static String upFrontPayment() {
		return new Faker().expression("#{options.option 'Cash'}");
	}
	public static String reasonDeclined() {
		return new Faker().expression("#{options.option 'Payment history' , 'Operations characteristics' , 'Loss history'}");
	}
	public static String reasonNotTaken() {
		return new Faker().expression("#{options.option 'Policy not-taken' , 'Insured's request - N.O.C'}");
	}
	public static String source() {
		return new Faker().expression("#{options.option 'Insured' , 'Insurer'}");
	}
	public static String cancellationReason() {
		return new Faker().expression("#{options.option 'Policy not-taken' , 'Insured's request - (finance co. nonpay), 'No employees/operations'}");
	}
	public static String direction() {
		return new Faker().expression("#{options.option 'Non-Renew' ,'Refer to Underwriter' , 'Non-Renew and Refer to Underwriter'}");
	}
	public static String security() {
		return new Faker().expression("#{options.option 'Internal Only', 'Unrestricted' , 'Sensitive note'}");
	}
	public static String reason() {
		return new Faker().expression("#{options.option 'Non-Renew - Insured Request' , 'Non-Renew - losses' , 'Non-Renew - non-compliance'}");
	}
	public static String renewalcode() {
		return new Faker().expression("#{options.option 'Renew - account consideration' ,'Renew - good risk' , 'Renew - assigned risk'}");
	}
	public static String reinstateReason() {
		return new Faker().expression("#{options.option 'Payment received' , 'Other'}");
	}
}
