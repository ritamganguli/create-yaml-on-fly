package com.aspire.guidewire.cc.teststeps.commercialpackage;

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

	public static String claimantType() {
		return new Faker().expression("#{options.option 'Insured','Customer','Owner of the lost/damaged property','Employee','Other third party'}");
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
		return new Faker().expression("#{options.option 'Fire','Explosion','Breach of contract','Broken glass','Product failure'}");
	}
	
	public static String reserveLine(){
		return new Faker().expression("#{options.option 'New...'}");
	}
	
	public static String costType(){
		return new Faker().expression("#{options.option 'Claim Cost','Unspecified Cost Type','Expense - A&O','Expense - D&CC'}");
	}
	
	public static String costCategory(){
		return new Faker().expression("#{options.option 'Rental','Medical','Legal','Contents','Reimbursement'}");
	}
	
	public static String recoveryCategory(){
		return new Faker().expression("#{options.option 'Credit to loss','Subrogation','Salvage','Credit to expense'}");
	}

	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(3);
	 }
	
	public static String taxID() {
		Faker faker = new Faker();
		return faker.numerify("##-#######");
	}
	
	public static String firstName() {
		return new Faker().name().firstName();
	}

	public static String lastName() {
		return new Faker().name().lastName();
	}

	public static String addressLineOne() {
		return new Faker().address().streetAddress();
	}
	
	public static String service(){
		return new Faker().expression("#{options.option 'Roadside_assistance','Salvage','Glass','Towing','Appraisal'}");
	}
	
	public static String requestType(){
		return new Faker().expression("#{options.option 'Perform Service','Quote','Quote and Perform Service'}");
	}
	
	public static String documentType(){
		return new Faker().expression("#{options.option 'Email'}");
	}
	
	public static String documentName(){
		return new Faker().expression("#{options.option 'orrange.png'}");
	}
	
	public static String status(){
		return new Faker().expression("#{options.option 'Approved','Closed'}");
	}
	
	public static String byCoverageType(){
		return new Faker().expression("#{options.option 'Preservation Of Property','Additionally Acquired Property'}");
	}

	public static String dataMessage(){
		return new Faker().expression("#{options.option 'No data to display'}");
	}
	
	public static String outcome(){
		return new Faker().expression("#{options.option 'Completed','Duplicate','Payments Complete'}");
	}
	
	public static String faultRating(){
		return new Faker().expression("#{options.option 'Other party at fault','Fault unknown','No fault','Insured at fault'}");
	}
	
	public static String lossParty(){
		return new Faker().expression("#{options.option 'Third-party liability'}");
	}
	
	public static String closeStatus(){
		return new Faker().expression("#{options.option 'Closed'}");
	}
	
	public static String reopenReason(){
		return new Faker().expression("#{options.option 'Mistake','New information','Payment Denied'}");
	}
	
	public static String reopenStatus(){
		return new Faker().expression("#{options.option 'Open'}");
	}
	
	public static String country(){
		return new Faker().expression("#{options.option 'United States'}");
	}
	
	public static String paymentType(){
		return new Faker().expression("#{options.option 'Final'}");
	}
	
	public static String reserveCostCategory(){
		return new Faker().expression("#{options.option 'Unspecified Cost Category','Other','Vehicle inspection'}");
	}
	
	public static String policynumber() {
		Faker faker = new Faker();
		return faker.number().digits(10);
	 }
	
}
