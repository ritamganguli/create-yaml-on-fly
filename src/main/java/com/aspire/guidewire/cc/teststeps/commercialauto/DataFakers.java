package com.aspire.guidewire.cc.teststeps.commercialauto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import net.datafaker.Faker;


public class DataFakers {

	public static String state(){
		return new Faker().expression("#{options.option 'Arizona','California','Florida'}");
	}

	public static String city() {
		Faker faker = new Faker(new Locale("en-US"));
		return faker.address().cityName();
	}

	public static String propertyName() {
		return new Faker().expression("#{options.option 'New...'}");
	}

	public static String claimantType() {
		return new Faker().expression("#{options.option 'Insured','Member of the insured's household','Owner of other vehicle','Customer','Employee'}");
	}

	public static String lossOccurred() {
		return new Faker().expression("#{options.option 'At premises','In transit','Other'}");
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

	public static String lossCause(){
		return new Faker().expression("#{options.option 'Damage in loading or unloading','Collision with motor vehicle','Glass breakage','Rollover','Collision with train or bus'}");
	}

	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(3);
	}

	public static String taxID() {
		Faker faker = new Faker();
		return faker.numerify("##-#######");
	}
	public static String address() {
		return new Faker().address().streetAddress();
	}

	public static String firstName() {
		return new Faker().name().firstName();
	}

	public static String lastName() {
		return new Faker().name().lastName();
	}
	public static String lossParty(){
		return new Faker().expression("#{options.option 'Third-party liability'}");
	}
	public static String costType(){
		return new Faker().expression("#{options.option 'Claim Cost','Unspecified Cost Type','Expense - A&O','Expense - D&CC'}");
	}

	public static String costCategory(){
		return new Faker().expression("#{options.option 'Rental','Medical','Legal','Contents','Reimbursement'}");
	}
	public static String coverage(){
		return new Faker().expression("#{options.option 'Collision','Comprehensive','PIP - Kentucky','Liability - Bodily Injury and Property Damage','Electronic Equipment'}");
	}

	public static String reserveLine(){
		return new Faker().expression("#{options.option 'New...'}");
	}
	
	public static String recoveryCategory(){
		return new Faker().expression("#{options.option 'Credit to expense','Credit to loss','Deductible','Salvage','Subrogation','Unspecified Recovery Category'}");
	}
	
	public static String roles(){
		return new Faker().expression("#{options.option 'Vendor','Employer','Other','Passenger','Claimant'}");
	}

	public static String requestType(){
		return new Faker().expression("#{options.option 'Adjudicate claim','Appraisal','Audio Equipment','Auto Body','Glass'.'Provide courtesy car','Roadside assistance','Salvage','Towing'}");
	}
	public static String service(){
		return new Faker().expression("#{options.option 'Perform Service','Quote','Quote and Perform Service'}");
	}

	public static String documentType(){
		return new Faker().expression("#{options.option 'Metro report','Email Sent','Other','Repair estimate'}");
	}
	public static String status(){
		return new Faker().expression("#{options.option 'Approved','Approving','Draft','Final'}");
	}
	public static String searchFor(){
		return new Faker().expression("#{options.option 'Group','User'}");
	}
	public static String paymentType(){
		return new Faker().expression("#{options.option 'Partial','Final','<none>'}");
	}
	public static String batchName(){
		return new Faker().expression("#{options.option 'Financials Escalation'}");
	}
	public static String beforeStatus(){
		return new Faker().expression("#{options.option 'Awaiting submission'}");
	}
	public static String afterStatus(){
		return new Faker().expression("#{options.option 'Requesting'}");
	}
	public static String vin(){
		return new Faker().expression("#{options.option '75382324ARTFY34S3'}");
	}
	public static String vehicleName() {
		return new Faker().expression("#{options.option 'New...'}");
	}
	public static String model() {
		return new Faker().expression("#{options.option 'Impala','Cruze','Camaro'}");
	}
	public static String make() {
		return new Faker().expression("#{options.option 'Chevrolet','Innova','Indigo'}");
	}
	public static String year() {
		Faker faker = new Faker();
		int minYear = 2003;
		int maxYear = 2015;
		int randomYear = faker.number().numberBetween(minYear, maxYear + 1);
		return String.valueOf(randomYear);
	}
}
