package com.aspire.guidewire.cc.teststeps.personalauto;

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
	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(2);
	}

	public static String taxID() {
		Faker faker = new Faker();
		return faker.numerify("##-#######");
	}

	public static String generateEmail() {
		Faker faker = new Faker();
		String username = faker.name().username();
		String domain = faker.internet().domainName();
		return username + "@" + domain;
	}

	public static String generateRandomLetters() {
		Faker faker = new Faker();
		int length = faker.number().numberBetween(4, 7);
		return faker.regexify("[a-zA-Z]{" + length + "}");
	}

	public static String policynumber() {
		Faker faker = new Faker();
		return faker.number().digits(10);
	}
	public static String claimNumber() {
		Faker faker = new Faker();
		return faker.number().digits(11);
	}

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
	public static String documentName (String name) {
		return new Faker().expression(name);
	}

	public static String lossCause(){
		return new Faker().expression("#{options.option 'Collision while turning left','Collision with motor vehicle','Glass breakage','Rollover','Collision with train or bus'}");
	}

	public static String lossParty(){
		return new Faker().expression("#{options.option 'Third-party liability'}");
	}

	public static String roles(){
		return new Faker().expression("#{options.option 'Vendor','Employer','Other','Passenger','Claimant'}");
	}

	public static String country(){
		return new Faker().expression("#{options.option 'United States'}");
	}
	public static String faultRating(){
		return new Faker().expression("#{options.option 'Other party at fault','Fault unknown','Insured at fault','No fault'}");
	}
	public static String service(){
		return new Faker().expression("#{options.option 'Perform Service','Quote','Quote and Perform Service'}");
	}
	public static String requestType(){
		return new Faker().expression("#{options.option 'Adjudicate claim','Appraisal','Audio Equipment','Auto Body','Glass'.'Provide courtesy car','Roadside assistance','Salvage','Towing'}");
	}
	public static String recoveryCategory(){
		return new Faker().expression("#{options.option 'Credit to expense','Credit to loss','Deductible','Salvage','Subrogation','Unspecified Recovery Category'}");
	}
	public static String reserveLine(){
		return new Faker().expression("#{options.option 'New...'}");
	}
	public static String costCategory(){
		return new Faker().expression("#{options.option 'Rental','Emergency Services','Medical','Other'}");
	}
	public static String costType(){
		return new Faker().expression("#{options.option 'Unspecified Cost Type','Claim Cost','Expense - A&O','Expense - D&CC'}");
	}
	public static String type(){
		return new Faker().expression("#{options.option 'ISO match report','Metro report','Diagram','Repair estimate'}");
	}
	public static String jurisdictionState(){
		return new Faker().expression("#{options.option 'Alabama','Alberta','Arizona'}");
	}
	public static String status(){
		return new Faker().expression("#{options.option 'Approved','Approving','Draft','Final'}");
	}
	public static String documentType(){
		return new Faker().expression("#{options.option 'Metro report','Email Sent','Other','Repair estimate'}");
	}
	public static String reason(){
		return new Faker().expression("#{options.option 'Completed','Duplicate','Fraud','Mistake','Payments complete'}");
	}
	public static String outcome(){
		return new Faker().expression("#{options.option 'Completed','Duplicate','Fraud','Mistake','Payments complete'}");
	}
	public static String closeExposureValue(){
		return new Faker().expression("#{options.option 'Closed'}");
	}
	public static String openExposureValue(){
		return new Faker().expression("#{options.option 'Open'}");
	}

	public static String coverageType(){
		return new Faker().expression("#{options.option 'Collision','Medical Payments'}");
	}
	public static String payment(){
		return new Faker().expression("#{options.option 'Final'}");
	}
	public static String beforeRunStatus(){
		return new Faker().expression("#{options.option 'Awaiting submission'}");
	}
	public static String afterRunStatus(){
		return new Faker().expression("#{options.option 'Requesting'}");
	}
	public static String batchName(){
		return new Faker().expression("#{options.option 'Financials Escalation'}");
	}
	public static String coverage(){
		return new Faker().expression("#{options.option 'Collision','Comprehensive','PIP - Kentucky','Liability - Bodily Injury and Property Damage','Electronic Equipment'}");
	}
	public static String vehicleName(){
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
	public static String vin() {
		return new Faker().numerify("##NEK##ZX#R######");
	}
}




