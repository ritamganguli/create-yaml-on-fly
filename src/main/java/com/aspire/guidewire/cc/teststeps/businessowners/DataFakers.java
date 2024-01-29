package com.aspire.guidewire.cc.teststeps.businessowners;

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

	public static String country(){
		return new Faker().expression("#{options.option 'United States'}");
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
		//return new Faker().expression("#{options.option 'Phoenix', 'Wiscon', 'San Francisco'}");
		Faker faker = new Faker(new Locale("en-US"));
		return faker.address().cityName();
	}

	public static String producerOrganization() {
		return new Faker().expression("#{options.option 'Whiplash Bros. Auto Insurance'}");
	}

	public static String costOfVehicle() {
		Faker faker = new Faker();
		return faker.number().digits(3);
	}

	public static String VIN() {
		Faker faker = new Faker();
		return faker.number().digits(8);
	}
	public static String generateRandomLetters() {
	    Faker faker = new Faker();
	    int length = faker.number().numberBetween(4, 7);
	    return faker.regexify("[a-zA-Z]{" + length + "}");
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
	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	 }
	
	public static String taxID() {
		Faker faker = new Faker();
		return faker.numerify("##-#######");
	}
	
	public static String propertyName() {
		return new Faker().expression("#{options.option 'Whiplash Bros. Auto Insurance'}");
	}
	
	public static String claimantType() {
		return new Faker().expression("#{options.option 'Insured','Customer'}"); 
	}
	
	public static String lossOccurred() {
		return new Faker().expression("#{options.option 'Whiplash Bros. Auto Insurance'}");
	}
	
	public static String lossCause() {
		return new Faker().expression("#{options.option 'Broken glass','Fire','Glass breakage'}");
	}
	public static String documentType() {
		return new Faker().expression("#{options.option 'Email','Email Sent','Other'}");
	}
	public static String status() {
		return new Faker().expression("#{options.option 'Approved','Draft','Final'}");
	}
	public static String costType() {
		return new Faker().expression("#{options.option 'Claim Cost','Unspecified Cost Type','Expense - A&O'}");
	}
	public static String reserveCostCategory() {
		return new Faker().expression("#{options.option 'Unspecified Cost Category','Other','Emergency Services'}");
	}
	public static String reserveLine() {
		return new Faker().expression("#{options.option 'Claim Cost','Unspecified Cost Type','Expense - A&O'}");
	}
	public static String costCategory() {
		return new Faker().expression("#{options.option 'Rental','Other','Expense - A&O'}");
	}
	public static String recoveryCategory() {
		return new Faker().expression("#{options.option 'Rental','Other','Expense - A&O'}");
	}
	public static String service() {
		return new Faker().expression("#{options.option 'Kitchen_Appliances'}");
	}
	public static String requestType() {
		return new Faker().expression("#{options.option 'Quote','Perform Service'}");
	}
	public static String paymentType() {
		return new Faker().expression("#{options.option 'Quote','Perform Service'}");
	}
	public static String outcome() {
		return new Faker().expression("#{options.option 'Mistake'}");
	}
	public static String closedStatus() {
		return new Faker().expression("#{options.option 'Closed'}");
	}
	public static String openStatus() {
		return new Faker().expression("#{options.option 'Open'}");
	}
	public static String reason() {
		return new Faker().expression("#{options.option 'Mistake'}");
	}

}
