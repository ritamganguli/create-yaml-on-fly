package com.aspire.guidewire.bc.teststeps;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

//	public static String amount() {
//		Faker faker = new Faker();
//		return faker.number().digits(2);
//	 }
	
	public static String amount() {
	    Faker faker = new Faker();
	    return String.valueOf(faker.number().numberBetween(10, 100));
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
public static String disbursementAmount() {
	Faker faker = new Faker();
	return faker.number().digits(2);
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

public static String generateRandomString(String title) {
	Faker faker = new Faker();
	return faker.letterify(title+ "- ?????");
}

public static String unAppliedFund(){
	return new Faker().expression("#{options.option 'Default'}");
}
public static String paymentMethod(){
	return new Faker().expression("#{options.option 'ACH/EFT','Credit Card','Misc','Wire'}");
}
public static String paymentInstrument(){
	return new Faker().expression("#{options.option 'Check'}");
}
public static String disbursementRaeson(){
	return new Faker().expression("#{options.option 'Cancellation','Other','Overpayment','Return Premium Audit','Wrong Payer', 'Return Premium PolicyChange'}");
}
public static String troubleTicketType(){
	return new Faker().expression("#{options.option 'Dispute','Processing Error','Report Error','Disaster Hold','Customer Complaint','Customer Question'}");
}
public static String assignedTo(){
	return new Faker().expression("#{options.option 'Super User (Default Root Group)'}");
}
public static String priority(){
	return new Faker().expression("#{options.option 'Urgent','High','Normal','Low'}");
}
public static String creditType(){
	return new Faker().expression("#{options.option 'Collections','Goodwill','Interest','Other'}");
}
public static String writeOffReason(){
	return new Faker().expression("#{options.option 'Commission Remainder','Minor Adjustment','Negotiation','Recovery Shortfall','Uncollectable'}");
}
public static String writeOffReversalReason(){
	return new Faker().expression("#{options.option 'Error Correction', 'Payment Received'}");
}
public static String chargePattern(){
	return new Faker().expression("#{options.option 'Premium', 'Taxes'}");
}
public static String category(){
	return new Faker().expression("#{options.option 'Reinstatement Fee'}");
}
public static String minimumAmount(){
	return new Faker().expression("#{options.option '5', '10'}");
}
public static String writeOffAmount(){
	return new Faker().expression("#{options.option '55', '76'}");
}
public static String batchProcessName(){
	return new Faker().expression("#{options.option 'Invoice', 'Invoice Due'}");
}
public static String delinquencyReason(){
	return new Faker().expression("#{options.option 'Not Taken', 'Failure to Report'}");
}
public static String policyNumber() {
	Faker faker = new Faker();
	return faker.number().digits(10);
 }


}




