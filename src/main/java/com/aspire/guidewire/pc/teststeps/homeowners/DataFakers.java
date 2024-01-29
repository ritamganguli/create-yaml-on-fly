package com.aspire.guidewire.pc.teststeps.homeowners;

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
	
	public static String dateSixMonthAhead() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH,6);
		Date futureDateTime = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = sdf.format(futureDateTime);
		return formattedDate;
	}
	
	public static String covCLimit() {
		return new Faker().numerify("####");
	}
	
	public static String generateRandomString(String title) {
		Faker faker = new Faker();
		return faker.letterify(title+ "- ?????");
	}
	
	public static String generateNumerics(String title) {
		return new Faker().numerify("####");
	}
	public static String policyTerm() {
		return new Faker().expression("#{options.option 'Annual','Other'}");
	}
	public static String reasonDeclined() {
		return new Faker().expression("#{options.option 'Payment history', 'Loss history'}");
	}
	public static String reasonNotTaken() {
		return new Faker().expression("#{options.option 'Policy not-taken', 'Decline', 'Withdraw Transaction' }");
	}
	public static String source() {
		return new Faker().expression("#{options.option 'Insured', 'Insurer'}");
	}
	public static String direction() {
		return new Faker().expression("#{options.option 'Non-Renew', 'Non-Renew and Refer to Underwriter', 'Not-Taken', 'Refer to Customer Service Representative'}");
	}
	public static String security() {
		return new Faker().expression("#{options.option 'Internal Only', 'Unrestricted', 'Sensitive note' }");
	}
	public static String reason() {
		return new Faker().expression("#{options.option 'Non-Renew - Insured Request', ,'Other'}");
	}
	public static String reinstateReason() {
		return new Faker().expression("#{options.option 'Payment received'}");
	}
	public static String policyType() {
		return new Faker().expression("#{options.option 'Dwelling','Condominium','Rental'}");
	}
	public static String coverageForm() {
		return new Faker().expression("#{options.option 'HO2','HO6',HO4}");
	}
	public static String dwellingOccupied() {
		return new Faker().expression("#{options.option 'Myself', 'Tenant'}");
	}
	public static String dwellingFullTime() {
		return new Faker().expression("#{options.option 'Yes','No'}");
	}
	public static String fireProtection() {
		return new Faker().expression("#{options.option 'Limited','Superior','Standard'}");
	}
	public static String coInsurance() {
		return new Faker().expression("#{options.option '50%','60%','100%'}");
	}
	public static String rentalIncome() {
		return new Faker().expression("#{options.option 'Yes','No'}");
	}
	public static String prohibitedUse() {
		return new Faker().expression("#{options.option '14 Days','45 Days'}");
	}
	public static String addressType() {
		return new Faker().expression("#{options.option 'Home','Billing','Business'}");
	}
	public static String preRenewalReason() {
		return new Faker().expression("#{options.option 'Non-Renew - Insured Request','Non-Renew - losses', 'Non-Renew - material change'}");
	}
	public static String renewalCode() {
		return new Faker().expression("#{options.option 'Renew - account consideration','Other'}");
	}
	public static String valuationMethod() {
		return new Faker().expression("#{options.option 'Replacement Cost','Actual cash value'}");
	}
	public static String contingencyDocumentType(){
		return new Faker().expression("#{options.option 'Loss information', 'MVR', 'Other'}");
	}
	public static String contigencyAction(){
		return new Faker().expression("#{options.option 'Change policy retroactively','Change policy for remainder of term','Cancel retroactively','Cancel remainder of term','Cancel / Rewrite'}");
	}
	public static String contigencyStatus(){
		return new Faker().expression("#{options.option 'Approved','Approving','Draft'}");
	}
	public static String uwIssueType(){
		return new Faker().expression("#{options.option 'To be reviewed by underwriter 1, blocking bind','To be reviewed by underwriter 1, blocking issuance'}");
	}
	public static String errorMessage(){
		return new Faker().expression("#{options.option 'Dwelling must be owner occupied'");
	}
	public static String documentType(){
		return new Faker().expression("#{options.option 'Letter sent'");
	}
}