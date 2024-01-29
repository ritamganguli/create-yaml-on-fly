package com.aspire.guidewire.pc.teststeps.personalauto;

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
		return new Faker().numerify("85001-####");
	}

	public static String licenseNumber() {
		return new Faker().numerify("AB####CD###");
	}
	public static String VIN() {
		return new Faker().numerify("##NEK##ZX#R######");
	}

	public static String dateOfBirth() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String date = formatter.format(new Faker().date().birthday(26, 50)); 
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

	public static String costOfVehicle() {
		Faker faker = new Faker();
		return faker.number().digits(3);
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
	public static String basis() {
		Faker faker = new Faker();
		return faker.number().digits(4);

	}
	public static String cancellationReason() {
		return new Faker().expression("#{options.option 'Non-payment', 'Policy not-taken'}");
	}
	public static String source() {
		return new Faker().expression("#{options.option 'Insurer', 'Insured'}");
	}
	public static String reinstateReason() {
		return new Faker().expression("#{options.option 'Payment received'}");
	}
	public static String direction() {
		return new Faker().expression("#{options.option 'Non-Renew', 'Non-Renew and Refer to Underwriter', 'Not-Taken', 'Refer to Customer Service Representative'");
	}
	public static String security() {
		return new Faker().expression("#{options.option 'Internal Only', 'Unrestricted', 'Sensitive note'}");
	}
	public static String reason() {
		return new Faker().expression("#{options.option 'Non-Renew - Insured Request','Other'}");
	}
	public static String renewalCode() {
		return new Faker().expression("#{options.option 'Renew - account consideration', 'Other'}");
	}
	public static String reasonNotTaken() {
		return new Faker().expression("#{options.option 'Policy not-taken', 'Decline', 'Withdraw Transaction'}");
	}
	public static String reasonDeclined() {
		return new Faker().expression("#{options.option 'Loss history', 'Payment history'}");
	}
	public static String billingMethod() {
		return new Faker().expression("#{options.option 'Direct Bill', 'List Bill'}");
	}
	public static String paymentPlan() {
		return new Faker().expression("#{options.option 'F Annual 100% Down, 0 Max installments', Every Other Week, }");
	}
	public static String documentType() {
		return new Faker().expression("#{options.option 'DecSheet'}");
	}
	public static String documentName() {
		return new Faker().expression("#{options.option 'Policy.pdf', 'orrange.png}");
	}
	public static String status() {
		return new Faker().expression("#{options.option 'Approved','Approving','Draft'}");
	}
	public static String coverge1() {
		return new Faker().expression("#{options.option 'Liability - Bodily Injury and Property Damage'}");
	}
	public static String coverge2() {
		return new Faker().expression("#{options.option 'Uninsured Motorist - Bodily Injury'}");
	}
	public static String coverge3() {
		return new Faker().expression("#{options.option 'Mexico Coverage - Limited'}");
	}
	public static String coverge4() {
		return new Faker().expression("#{options.option 'Medical Payments'}");
	}
	public static String coverge5() {
		return new Faker().expression("#{options.option 'Uninsured Motorist - Bodily Injury'}");
	}
	public static String factorVal() {
		return new Faker().expression("#{options.option '(PALiabilityCov, PALiability, 250/500/100, VA) = 3.8'}");
	}
	public static String vehicleTypeval() {
		return new Faker().expression("#{options.option '(VA, auto) = 15'}");
	}
	public static String uwvalue() {
		return new Faker().expression("#{options.option '(1111_11111, VA) = 0.9'}");
	}
	public static String multiCarDiscountVal() {
		return new Faker().expression("#{options.option '1'}");
	}
	public static String fileName() {
		return new Faker().expression("#{options.option 'Ratings+Worksheet.'}");
	}
	public static String contingencyAction() {
		return new Faker().expression("#{options.option ''Change policy retroactively','Change policy for remainder of term','Cancel retroactively','Cancel remainder of term','Cancel / Rewrite'}");//
	}
	public static String contingencyDocumentType() {
		return new Faker().expression("#{options.option 'Loss information', 'MVR', 'Other'}");
	}
	public static String rolesAccidentSummary() {
		return new Faker().expression("#{options.option '0'}");
	}
	public static String offerings() {
		return new Faker().expression("#{options.option 'Basic Program','Standard Program','Premium Program'}");
	}
	public static String policyTerm() {
		return new Faker().expression("#{options.option 'Annual','6 months'}");
	}
	public static String addressType() {
		return new Faker().expression("#{options.option 'Billing','Business','Home'}");
	}
	public static String vehicleType(){
		return new Faker().expression("#{options.option 'Passenger/Light Truck', 'Other'}");
	}
	public static String stateNotation(){
		return new Faker().expression("#{options.option 'CA','FL', 'AZ'}");
	}
}