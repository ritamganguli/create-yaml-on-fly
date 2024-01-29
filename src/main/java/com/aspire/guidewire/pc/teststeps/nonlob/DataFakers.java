package com.aspire.guidewire.pc.teststeps.nonlob;

import java.text.SimpleDateFormat;

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
	public static String generateRandomCompanyName(String company) {
		Faker faker = new Faker();
		return faker.letterify(company+ "?????");
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
	
	public static String singleChar(){
		return new Faker().expression("#{options.option 'a','b','c'}");
	}
	public static String city() {
		Faker faker = new Faker(new Locale("en-US"));
		return faker.address().cityName();
	}

	public static String producerOrganization() {
		return new Faker().expression("#{options.option 'Whiplash Bros. Auto Insurance'}");
	}
		
	public static String producerCode() {
		return new Faker().expression("#{options.option '301-008574 Whiplash Bros. Auto Insurance'}");
	}
	
	public static String generateRandomString(String title) {
		Faker faker = new Faker();
		return faker.letterify(title+ "?????");
	}
	public static String code() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	 }

	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(4);
	}
	public static String accountNumber() {
		Faker faker = new Faker();
		return faker.number().digits(10);
	}
	public static String policyNumber() {
		Faker faker = new Faker();
		return faker.number().digits(10);
	}
	
	public static String status(){
		return new Faker().expression("#{options.option 'Open','Complete','Active','Canceled'}");
	}
	public static String priority(){
		return new Faker().expression("#{options.option 'Urgent','High','Normal'}");
	}
	public static String overdue(){
		return new Faker().expression("#{options.option 'Yes','No'}");
	}
	public static String userName(){
		return new Faker().expression("#{options.option 'su' , 'A'}");
	}
	public static String type(){
		return new Faker().expression("#{options.option 'Person','General'}");
	}
	public static String searchFor(){
		return new Faker().expression("#{options.option 'Policy','Policy Change','Reinstatement','Submission'}");
	}
	public static String product(){
		return new Faker().expression("#{options.option 'Personal Auto','Homeowners Line'}");
	}
	public static String groupType(){
		return new Faker().expression("#{options.option 'Actuary unit' , 'Any' , 'Branch audit'}");
	}
	public static String rolesName(){
		return new Faker().expression("#{options.option 'Data Protection Officer','Super Admin','Producer','Producer Code - Cancellations'}");
	}
	public static String rolesType(){
		return new Faker().expression("#{options.option 'Producer Code Role' , 'User Role' , 'User Producer Code Role'}");
	}
	public static String regionType(){
		return new Faker().expression("#{options.option 'County' , 'State' , 'Zip code'}");
	}
	public static String permission(){
		return new Faker().expression("#{options.option 'Advance audit'}");
	}
	public static String userType(){
		return new Faker().expression("#{options.option 'Other', 'Producer Assistant', 'Underwriter'}");
	}
	public static String organizationType() {
		return new Faker().expression("#{options.option 'Agency', 'Fee audit company', 'Broker'}");
	}
	public static String dataType() {
		return new Faker().expression("#{options.option 'String', 'Decimal', 'Integer'}");
	}
	public static String displayType() {
		return new Faker().expression("#{options.option 'Small', 'Normal', 'Large' }");
	}
	public static String batchProcess() {
		return new Faker().expression("#{options.option 'AccountHolderCount','HandleUnresolvedContingency'}");
	}
	public static String dropDownvalue() {
		return new Faker().expression("#{options.option 'Default' , 'Schedulable', 'Any'}");
	}
	public static String sosFilter() {
		return new Faker().expression("#{options.option 'Accounts with messages needing retry', 'Accounts with any unfinished messages', 'Accounts with failed messages'}");
	}
	public static String addressType() {
		return new Faker().expression("#{options.option 'Billing','Business'}");
	}
	public static String branchCode() {
		return new Faker().expression("#{options.option '301 -- Minneapolis Branch UW','501 -- Los Angeles Branch UW'}");
	}
	public static String attributeType() {
		return new Faker().expression("#{options.option 'Line of Business','Language' , 'Expertise'}");
	}
	
}
