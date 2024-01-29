package com.aspire.guidewire.pc.teststeps.businessowners;

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

	public static String licenseNumber() {
		return new Faker().numerify("AB####CD###");
	}

	/**
	 * @return - age between 18 to 65
	 */
	public static String dateOfBirth() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String date = formatter.format(new Faker().date().birthday()); 
		return date;
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

	public static String randomDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String date = formatter.format(new Faker().date());
		return date;
	}

	public static String state(){
		return new Faker().expression("#{options.option 'Arizona','California','Florida'}");
	}

	public static String city() {
		Faker faker = new Faker(new Locale("en-US"));
		return faker.address().cityName();
	}

	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}
	
	public static String VIN() {
		Faker faker = new Faker();
		return faker.number().digits(8);
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
	
	public static String policynumber() {
		Faker faker = new Faker();
		return faker.number().digits(10);
	 }
	
	public static String cancellationSource() {
		return new Faker().expression("#{options.option 'Insurer','Insured'}");
	}
	
	public static String cancellationReason() {
		return new Faker().expression("#{options.option 'Non-payment','Policy not-taken','Loss of reinsurance','Insured's request - (finance co. nonpay)'}");
	}
	
	public static String renewalCode() {
		return new Faker().expression("#{options.option 'Renew - account consideration','Renew - assigned risk','Renew - good risk','Renew - legal requirement'}");
	}
	
	public static String contigencyAction(){
		return new Faker().expression("#{options.option 'Change policy retroactively','Change policy for remainder of term','Cancel retroactively','Cancel remainder of term','Cancel / Rewrite'}");
	}
	
	public static String uwIssueType(){
		return new Faker().expression("#{options.option 'To be reviewed by underwriter 1, blocking bind','To be reviewed by underwriter 1, blocking issuance'}");
	}
	
	public static String status(){
		return new Faker().expression("#{options.option 'Approved','Approving','Final','Draft'}"); 
	}
	
	public static String contingencyDocumentType(){
		return new Faker().expression("#{options.option 'Loss information','Audit report','Binder','MVR','Quote'}");
	}
	
	public static String lossHistoryType(){
		return new Faker().expression("#{options.option 'Manually Entered','No Loss History','Attached'}");
	}

	public static String lossHistoryStatus(){
		return new Faker().expression("#{options.option 'Open','Closed'}");
	}
	
	public static String reinstateReason() {
		return new Faker().expression("#{options.option 'Payment received','Other'}");
	}
	
	public static String addressType() {
		return new Faker().expression("#{options.option 'Billing','Business','Home'}");
	}
	
	public static String organizationType() {
		return new Faker().expression("#{options.option 'Common ownership','Corporation - private','Individual','Corporation - public','Partnership','Limited partnership'}");
	}
	
	public static String producerOrganization() {
		return new Faker().expression("#{options.option 'Whiplash Bros. Auto Insurance'}");
	}
	public static String offerings() {
		return new Faker().expression("#{options.option 'Platinum','Silver','None'}");
	}
	public static String businessType() {
		return new Faker().expression("#{options.option 'Motel','Apartment','Self Storage'}");
	}
	public static String percentage() {
		Faker faker = new Faker();
		return faker.number().digits(2);
	}
}
