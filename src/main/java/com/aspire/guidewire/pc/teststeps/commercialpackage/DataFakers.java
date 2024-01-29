package com.aspire.guidewire.pc.teststeps.commercialpackage;

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

	public static String producerOrganization() {
		return new Faker().expression("#{options.option 'Whiplash Bros. Auto Insurance'}");
	}
	
	public static String limit() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}
	
	public static String policyNo() {
		Faker faker = new Faker();
		return faker.number().digits(10);
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
	
	public static String percentDuplicated(){
		return new Faker().expression("#{options.option '50% or less','at least 51%','at least 90%'}");
	}
	
	public static String classCode() {
		return new Faker().expression("#{options.option '0002','0005','0007'}");
	}
	
	public static String basis() {
		Faker faker = new Faker();
		return faker.number().digits(3);
	}
	
	public static String addressType() {
		return new Faker().expression("#{options.option 'Billing','Business','Home'}");
	}
	
	public static String organizationType() {
		return new Faker().expression("#{options.option 'Common ownership','Corporation - private','Individual','Corporation - public','Partnership','Limited partnership'}");
	}
	
	public static String businessClass() {
		return new Faker().expression("#{options.option 'Manufacturer','Wholesaler','Insurance Agent','Other'}");
	}
	
	public static String receptacleType() {
		return new Faker().expression("#{options.option 'UL Class A','UL Class B','UL Class C'}");
	}
	
	public static String contractorType() {
		return new Faker().expression("#{options.option 'Small Contractor','Building Contractor','Heavy Construction','Road / Building'}");
	}
	
	public static String signType() {
		return new Faker().expression("#{options.option 'Mechanical','Neon','Fluorescent','Automatic','Lamps'}");
	}
	
	public static String cancellationSource() {
		return new Faker().expression("#{options.option 'Insurer','Insured'}");
	}
	
	public static String reinstatementReason() {
		return new Faker().expression("#{options.option 'Payment received','Other'}");
	}
	
	public static String cancellationReason() {
		return new Faker().expression("#{options.option 'Non-payment','Policy not-taken','Insured's request - (finance co. nonpay)'}");
	}
	
	public static String upFrontPayment() {
		return new Faker().expression("#{options.option 'Cash','Electronic','Held by Agent'}");
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
	
	public static String contractorDeductible(){
		return new Faker().expression("#{options.option '500','1000','2500','5000'}");
	}
	
	public static String deductible(){
		return new Faker().expression("#{options.option '2,500','500','1,000','5,000'}");
	}
	
	public static String policyTerms() {
		return new Faker().expression("#{options.option 'Annual','6 months'}");
	}
	
	public static String coinsurancePct(){
		return new Faker().expression("#{options.option '80%','90%','100%'}");
	}

	public static String offerings(){
		return new Faker().expression("#{options.option 'Standard','Special Risk'}");
	}

	public static String packageRiskType(){
		return new Faker().expression("#{options.option 'Apartment','Motel/Hotel','Contractor','Industrial/Processing','Institutional','Services','Office','Mercantile'}");
	}

	public static String coverageForm(){
		return new Faker().expression("#{options.option 'Building and Personal Property','Condominium Association','Condominium Unit-Owners'}");
	}

	public static String blanketType(){
		return new Faker().expression("#{options.option 'Single Location','Multiple Locations','Single Coverage'}");
	}

	public static String groupType(){
		return new Faker().expression("#{options.option 'Direct Loss','Time Element'}");
	}

	public static String policyBasis(){
		return new Faker().expression("#{options.option 'Occurrence','Claims Made'}"); 
	}

	public static String insuredType(){
		return new Faker().expression("#{options.option 'Charitable Institutions','Club Members','Controlling Interest','Vendors'}");
	}
	
	public static String uWIssueType(){
		return new Faker().expression("#{options.option 'To be reviewed by underwriter 1, blocking bind','To be reviewed by underwriter 1, blocking quote release','To be reviewed by underwriter 1, blocking issuance'}");
	}

	public static String lossHistoryStatus(){
		return new Faker().expression("#{options.option 'Open','Closed'}");
	}

	public static String lossHistoryType(){
		return new Faker().expression("#{options.option 'Manually Entered','No Loss History','Attached'}");
	}
	
	public static String contingencyAction(){
		return new Faker().expression("#{options.option 'Change policy retroactively','Cancel / Rewrite','Cancel retroactively','Change policy for remainder of term','Cancel remainder of term'}");
	}

	public static String contingencyDocumentStatus(){
		return new Faker().expression("#{options.option 'Approved','Approving','Final','Draft'}"); 
	}
	
	public static String contingencyDocumentType(){
		return new Faker().expression("#{options.option 'Loss information','Audit report','Binder','MVR','Quote'}");
	}
}
