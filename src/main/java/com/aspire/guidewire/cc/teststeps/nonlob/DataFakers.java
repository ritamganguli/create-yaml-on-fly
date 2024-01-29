package com.aspire.guidewire.cc.teststeps.nonlob;

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
		return new Faker().expression("#{options.option 'Arkansas','Arizona','Florida'}");
	}
	
	public static String country(){
		return new Faker().expression("#{options.option 'United States'}");
	}

	public static String city() {
		//return new Faker().expression("#{options.option 'Phoenix', 'Wiscon', 'San Francisco'}");
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

	public static String generateRandomString(String title) {
		Faker faker = new Faker();
		return faker.letterify(title+ "?????");
	}

	public static String amount() {
		Faker faker = new Faker();
		return faker.number().digits(3);
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

	public static String policyNumber() {
		Faker faker = new Faker();
		return faker.number().digits(9);
	}

	public static String type() {
		return new Faker().expression("#{options.option 'Businessowners','Commercial Property','Personal Auto'}");
	}

	public static String lossCause() {
		return new Faker().expression("#{options.option 'Broken glass','Fire','Glass breakage'}");
	}

	public static String permission() {
		return new Faker().expression("#{options.option 'Approve Rule','Close claims','Close exposures','Create claims'}");
	}

	public static String claimNumber() {
		return new Faker().numerify("###-##-######");
	}

	public static String limitType() {
		return new Faker().expression("#{options.option 'Claim total reserves','Payment amount','Reserve change size'}");
	}

	public static String policyType() {
		return new Faker().expression("#{options.option 'Businessowners','Homeowners','Personal Auto'}");
	}

	public static String coverageType() {
		return new Faker().expression("#{options.option 'Building','Liability','Money and Securities'}");
	}

	public static String costType() {
		return new Faker().expression("#{options.option 'Claim Cost','Unspecified Cost Type','Expense - A&O'}");
	}

	public static String randomNumber() {
		Faker faker = new Faker();
		return faker.number().digits(9);
	}

	public static String activityPattern() {
		return new Faker().expression("#{options.option 'Consult Account regarding fatality','Produce claim strategy narrative','Review matter-related Special Handling instructions'}");
	}

	public static String lineOfBusiness() {
		return new Faker().expression("#{options.option 'Businessowners Line','Commercial Auto Line','Commercial Property Line','General Liability Line','Homeowners Line'}");
	}
	public static String createBy() {
		return new Faker().expression("#{options.option 'DataProtection Officer','Default Owner','Super User'}");
	}

	public static String workflowType() {
		return new Faker().expression("#{options.option 'MetroReportWorkflow'}");
	}
	public static String handler() {
		return new Faker().expression("#{options.option 'Internal','Test'}");
	}
	public static String status() {
		return new Faker().expression("#{options.option 'Active','Completed','Error','Suspended'}");
	}

	public static String triggerEntity() {
		return new Faker().expression("#{options.option 'Claim','Exposure','Claim: Repeat for each Exposure'}");
	}

	public static String triggerAction() {
		return new Faker().expression("#{options.option 'Creation','Update','Exception'}");
	}

	public static String ruleVariableExpression() {
		return new Faker().expression("#{options.option 'claim','claim.claimant'}");
	}

	public static String actionType() {
		return new Faker().expression("#{options.option 'Generate History Event','Set Field'}");
	}

	public static String actionParameterType() {
		return new Faker().expression("#{options.option 'Assigned','Closed'}");
	}

	public static String costCategory() {
		return new Faker().expression("#{options.option 'Claim Cost','Rental','Other'}");
	}

	public static String category() {
		return new Faker().expression("#{options.option 'General','Interview','Reminder'}");
	}

	public static String calenderImportance() {
		return new Faker().expression("#{options.option 'Top','High','Low'}");
	}

	public static String jurisdiction() {
//		return new Faker().expression("#{options.option 'kentucky','Alberta','Alabama','California'}");
		Faker faker = new Faker(new Locale("en-US"));
		return faker.address().state();
	}

	public static String claimStatus() {
		return new Faker().expression("#{options.option 'Draft','Open','Closed'}");
	}

	public static String lossType() {
		return new Faker().expression("#{options.option 'Auto','Liability','Property','Travel','Workers' comp'}");
	}	

	public static String pendingAssignment() {
		return new Faker().expression("#{options.option 'Yes','No'}");
	}	
	public static String selectFromList() {
		return new Faker().expression("#{options.option 'Use automated assignment','Claim/Exposure Owner','FNOL - Acme Insurance','Super User (Acme Insurance)','Super Visor (Acme Insurance)'}");
	}
	public static String assignedTo() {
		return new Faker().expression("#{options.option 'Use automated assignment','Claim/Exposure Owner','FNOL - Acme Insurance','Super User (Acme Insurance)','Super Visor (Acme Insurance)'}");
	}

	public static String catastrophes() {
		Faker faker = new Faker();
		String cityName = "";
		while (!cityName.startsWith("A")) {
			cityName =  faker.address().city();
		}
		String catastrophe = "Earthquake";
		return cityName+" "+catastrophe;
	}

	public static String searchRadius() {
		return new Faker().expression("#{options.option '25 kilometers','3 kilometers'}");
	}
	public static String batchProcessDropDown() {
		return new Faker().expression("#{options.option 'Default','Any','Runnable','Schedulable'}");
	}
	public static String batchProcessName() {
		return new Faker().expression("#{options.option 'Activity Escalation','Aggregate Limit Calculations','Bulk Invoice Escalation','Bulk Invoice Workflow Monitor'}");
	}
	public static String logger() {
		return new Faker().expression("#{options.option 'Application.ClaimUsers','Application.ContactRetire'}");
	}
	public static String newConfiguredLevel() {
		return new Faker().expression("#{options.option 'ALL','TRACE'}");
	}
	public static String logFile() {
		return new Faker().expression("#{options.option 'cclog.log'}");
	}
	public static String serviceStatus() {
		return new Faker().expression("#{options.option 'Started','Stopped'}");
	}

	public static String hoildayDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 5);
		Date futureDateTime = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = sdf.format(futureDateTime);
		return formattedDate;
	}

	public static String deafultValue() {
		return new Faker().expression("#{options.option '<none>','none'}");
	}

	public static String treatyType() {
		return new Faker().expression("#{options.option 'Liability','Property'}");
	}

	public static String thresholdValue() {
		Faker faker = new Faker();
		return faker.number().digits(5);
	}

	public static String minPPDPercentage() {
		Faker faker = new Faker();
		int randomPercentage = faker.number().numberBetween(20, 50);
		String minPercentage = Integer.toString(randomPercentage);
		return minPercentage;	
	}
	
	public static String maxPPDPercentage() {
		Faker faker = new Faker();
		int randomPercentage = faker.number().numberBetween(60, 90);
		String maxPercentage = Integer.toString(randomPercentage);
		return maxPercentage;	
	}


	public static String twoDigitRandomnumber() {
		Faker faker = new Faker();
		int numberBetween = faker.number().numberBetween(20,100);
		String strNum = Integer.toString(numberBetween);
		return strNum;
	}

	public static String maxNumber() {
		Faker faker = new Faker();
		int numberBetween = faker.number().numberBetween(700,1000);
		String strNum = Integer.toString(numberBetween);
		return strNum;
	}

	public static String minNumber() {
		Faker faker = new Faker();
		int numberBetween = faker.number().numberBetween(200,600);
		String strNum = Integer.toString(numberBetween);
		return strNum;
	}

	public static String bodySytems() {
		return new Faker().expression("#{options.option 'Neoplasms (ICD10 C00-D49)','Diseases of the nervous system (ICD10 G00-G99)'}");
	}
	public static String suspendScheduler() {
		return new Faker().expression("#{options.option 'Scheduler suspended.'}");
	}
	public static String resumeScheduler() {
		return new Faker().expression("#{options.option 'Scheduler resumed.'}");
	}
	public static String workQueueName() {
		return new Faker().expression("#{options.option 'ActivityEsc','AddressDelete','AggLimitCalc'}");
	}

	public static String denialPeriodFormula() {
		return new Faker().expression("#{options.option 'Greater of x days after Loss Date or y days after Notice Date','x days after Loss Date','y days after Notice Date'}");
	}

	public static String targetIncludedDays() {
		return new Faker().expression("#{options.option 'Business days','Calendar days'}");
	}

	public static String exportData() {
		return new Faker().expression("#{options.option 'Admin','Roles','Catastrophes'}");
	}

	public static String groupName() {
		return new Faker().expression("#{options.option 'Configuration','Integration'}");
	}
	public static String organizationName() {
		return new Faker().expression("#{options.option 'Armstrong and Sons'}");
	}
	
	public static String coverageInQuestion() {
		return new Faker().expression("#{options.option 'Yes',''No'}");
	}
	public static String flaggedType() {
		return new Faker().expression("#{options.option 'Never flagged',''Was flagged','Is flagged'}");
	}
	
	public static String vehicleName(){
		return new Faker().expression("#{options.option 'New...'}");
	}
	public static String propertyName(){
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
	
	public static String claimantType() {
		return new Faker().expression("#{options.option 'Insured','Owner of other vehicle','Customer','Employee'}");
	}

	public static String lossOccurred() {
		return new Faker().expression("#{options.option 'At premises','In transit','Other'}");
	}
	public static String reserveLine() {
		return new Faker().expression("#{options.option 'New...'}");
	}
	public static String recoveryCategory() {
		return new Faker().expression("#{options.option 'Credit to loss','Credit to expense','Deductible','Salvage','Subrogation'}");
	}
	public static String paymentType() {
		return new Faker().expression("#{options.option 'Final','Partial'}");
	}
}
