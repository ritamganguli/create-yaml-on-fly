package com.aspire.guidewire.pc.teststeps.commercialproperty;

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
	public static String organizationType() {
		return new Faker().expression("#{options.option 'Common ownership','Corporation - private','Individual','Partnership'}");
	}

	public static String addressType() {
		return new Faker().expression("#{options.option 'Billing','Business','Home'}");
	}
	
	public static String policyTerms() {
		return new Faker().expression("#{options.option 'Annual','Other'}");
	}
	public static String coverageForm() {
		return new Faker().expression("#{options.option 'Building and Personal Property','Condominium Association','Condominium Unit-Owners'}");
	}
	public static String blanketType() {
		return new Faker().expression("#{options.option 'Multiple Locations','Single Location','Single Coverage'}");
	}
	public static String groupType() {
		return new Faker().expression("#{options.option 'Direct Loss','Time Element'}");
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
	
	public static String limit() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}
	
	public static String deductible(){
		return new Faker().expression("#{options.option '500','1,000','2,500','5,000'}");
	}
	public static String billingMethod(){
		return new Faker().expression("#{options.option 'Direct Bill','List Bill'}");
	}
	public static String paymentPlan(){
		return new Faker().expression("#{options.option 'C Monthly 25% Down, 11 Max installments'}");
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
	
	public static String renewalCode() {
		return new Faker().expression("#{options.option 'Renew - account consideration','Other'}");
	}
	public static String upfrontMethod() {
		return new Faker().expression("#{options.option 'Held by Agent','Electronic'}");
	}
	
	public static String preRenewalDirection() {
		return new Faker().expression("#{options.option 'Non-Renew','Other'}");
	}
	
	public static String preRenewalSecurity() {
		return new Faker().expression("#{options.option 'Internal Only','Other'}");
	}
	
	public static String preRenewalReason() {
		return new Faker().expression("#{options.option 'Non-Renew - Insured Request','Other'}");
	}
	
	public static String uwIssueType(){
		return new Faker().expression("#{options.option 'To be reviewed by underwriter 1, blocking bind','To be reviewed by underwriter 1, blocking issuance'}");
	}
	
	public static String contigencyAction(){
		return new Faker().expression("#{options.option 'Change policy retroactively','Change policy for remainder of term','Cancel retroactively','Cancel remainder of term','Cancel / Rewrite'}");
	}
	
	public static String lossHistoryType(){
		return new Faker().expression("#{options.option 'Manually Entered','Attached'}");
	}
	
	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}
	public static String percent() {
		Faker faker = new Faker();
		return faker.number().digits(2);
	}
	public static String status(){
		return new Faker().expression("#{options.option 'Approved','Approving','Draft','Final'}");
	}
	public static String coverage(){
		return new Faker().expression("#{options.option 'Building Coverage Basic Group I','Building Coverage Basic Group II','Business Personal Property Coverage Basic Group I','Business Personal Property Coverage Basic Group II'}");
	}
}
