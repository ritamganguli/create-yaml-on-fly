package com.aspire.guidewire.api.datagenerator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.aspire.guidewire.bc.teststeps.APIBillingCenterStepsImpl;
import com.aspire.guidewire.bc.teststeps.BillingCenterSteps;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.PolicyNo;
import com.aspire.guidewire.pc.teststeps.personalauto.APIPersonalStepsImpl;
import com.aspire.guidewire.pc.teststeps.personalauto.DataFakers;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.UserType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PACoverage;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Vehicles;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoSteps;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;




public class BCDataGenerator {

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
	private static final String BC_TESTDATA_SHEET = "src\\main\\resources\\testdata\\data\\BC_GWTestData_DataEngine.xlsx";

	static String  policyNo ;
	static String  accountNo ;


	@Test
	public static void personalAutoPolicyCreationInBC() throws InterruptedException{
		String sheetName = "NonInterfaceSuite";
		updateSheetWithPolicyNumbers(BC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void accountAndPolicyCreationForInterface(){
		String sheetName = "InterfaceSuite";
		updateSheetWithPolicyNumbersAndAccountNumbersForInterface(BC_TESTDATA_SHEET, sheetName);
	}

	/**
	 * @param excelFileName
	 * @param sheetName
	 * @author somasundaram.muthu
	 * To update policy and policy with bill payment created through API.
	 * In excelsheet, Based on the value "NA",it will decide whether policy need to be created or policy with bill payment need to be created.
	 * if NA is present in any cell in policyNumber column, it will not write policyNumber for that particular testcase
	 * if NA is present in any cell in policyPayment column, it will not write policyPayment for that particular testcase
	 */
	public static void updateSheetWithPolicyNumbers(String excelFileName, String sheetName) throws InterruptedException {
		String dataCleared = configProperty.getProperty("clearedAPIData");
		try (FileInputStream inputStream = new FileInputStream(excelFileName)) {
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet(sheetName);

			//If sheet not found sheet nof found will be printed
			if (sheet == null) {
				throw new IllegalArgumentException("Sheet not found: " + sheetName);
			}

			int lastRowNum = sheet.getLastRowNum();

			if(dataCleared.equals("false")) {
				//Firstly empty string has been entered in policynumber column 
				for (int i = 1; i <= lastRowNum; i++) {
					Row row = sheet.getRow(i);
					Cell policyNumberCell = row.getCell(1);
					Cell policyWithPaymentCell = row.getCell(2); 
					String policyNA = policyNumberCell.getStringCellValue();
					String policyPaymentNA = policyWithPaymentCell.getStringCellValue();	
					if(!policyNA.equals("NA")) policyNumberCell.setCellValue("");
					if(!policyPaymentNA.equals("NA")) policyWithPaymentCell.setCellValue("");

					try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
						workbook.write(outputStream);
					}
				}
				Log.message("Existing Policy Numbers got Cleared for BC - NonInterface");
			}

			//Then policy number entered in PolicyNumber column 
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell policyNumberCell = row.getCell(1);
				Cell policyWithPaymentCell = row.getCell(2); 
				String policyNA = policyNumberCell.getStringCellValue();
				String policyPaymentNA = policyWithPaymentCell.getStringCellValue();

				if(policyNA.length()==0 || policyPaymentNA.length()==0) {
					policyNo=createPersonalAutoPolicy();

					if(!policyNA.equals("NA")) policyNumberCell.setCellValue(policyNo);
					if(!policyPaymentNA.equals("NA")){
						createNewDirectBillPayment(policyNo);
						policyWithPaymentCell.setCellValue(policyNo);
					}
					Thread.sleep(10000);

					try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
						workbook.write(outputStream);
					}		
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param excelFileName
	 * @param sheetName
	 * @author somasundaram.muthu
	 * To update accountNumber and policyNumber created through API.
	 * In excelsheet, Based on the value "NA",it will decide whether accountNumber need to be created or policyNumber need to be created.
	 * if NA is present in any cell in accountNumber column, it will not write account for that particular testcase
	 * if NA is present in any cell in policyNumber column, it will not write policy for that particular testcase
	 */
	public static void updateSheetWithPolicyNumbersAndAccountNumbersForInterface(String excelFileName, String sheetName) {
		String dataCleared = configProperty.getProperty("clearedAPIData");
		try (FileInputStream inputStream = new FileInputStream(excelFileName)) {
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet(sheetName);

			if (sheet == null) {
				throw new IllegalArgumentException("Sheet not found: " + sheetName);
			}

			int lastRowNum = sheet.getLastRowNum();

			if(dataCleared.equals("false")) {
			//Firstly empty string has been entered in policynumber and AccountNumber column 
			for (int i = 1; i <= lastRowNum; i++) {

				Row row = sheet.getRow(i);
				Cell accountNumberCell = row.getCell(2);
				Cell policyNumberCell = row.getCell(1);
				String accountValue = accountNumberCell.getStringCellValue();
				String policyValue = policyNumberCell.getStringCellValue();
				if(!accountValue.equals("NA"))
					accountNumberCell.setCellValue("");
				if(!policyValue.equals("NA"))
					policyNumberCell.setCellValue("");

				try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
					workbook.write(outputStream);
				}
			}
			Log.message("Existing Account Numbers and Policy Numbers got Cleared for BC - Interface");
			}
			//Entering the values - Account number and policy number into the respective cells

			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell accountNumberCell = row.getCell(2);
				Cell policyNumberCell = row.getCell(1);
				String accountValue = accountNumberCell.getStringCellValue();
				String policyValue = policyNumberCell.getStringCellValue();

				String policyNo = null;
				String accountNo = null;
				if(policyValue.length()==0 || accountValue.length()==0) {
				if(!accountValue.equals("NA")) {
					accountNo = createAccountInPersonalAuto();
					accountNumberCell.setCellValue(accountNo);}
				else if(!policyValue.equals("NA")){
					policyNo = createPersonalAutoPolicy();
					policyNumberCell.setCellValue(policyNo);
				}

				try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
					workbook.write(outputStream);
				}
			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// get Policy number by creating personal auto policy
	public static String createPersonalAutoPolicy() {

		APIPersonalStepsImpl pc = PersonalAutoSteps.createAPI();

		pc.loginIntoTheApplication("su", "gw");

		pc.searchAccount(EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		String accountNumber = pc.createAccount(CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		Log.message("AccountNumber: "+ accountNumber);

		pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);	

		pc.selectOfferings(Offerings.builder().build());

		pc.selectQualifications(Qualification.builder().build());

		pc.updatePolicyInfo(PolicyInfo.builder().build());

		pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.licenseNumber(DataFakers.licenseNumber()).build());

		pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
				.VIN(DataFakers.VIN())
				.cost(DataFakers.costOfVehicle())
				.build());

		pc.addPACoverage(PACoverage.builder().build());

		pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

		pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());

		pc.viewQuote();

		pc.viewForms();

		pc.selectPayments(Payments.builder().build());

		String policyNumberPA = pc.getPolicyNumber();

		Log.assertThat(policyNumberPA != null,"Policy created successfully - "+policyNumberPA,"Policy not created");

		return policyNumberPA;

	}

	// get account number by creating personal auto policy
	public static String createAccountInPersonalAuto() {

		APIPersonalStepsImpl pc = PersonalAutoSteps.createAPI();

		pc.loginIntoTheApplication("su", "gw");

		pc.searchAccount(EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		String accountNumber = pc.createAccount(CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		Log.message("AccountNumber: "+ accountNumber);

		pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);	

		pc.selectOfferings(Offerings.builder().build());

		pc.selectQualifications(Qualification.builder().build());

		pc.updatePolicyInfo(PolicyInfo.builder().build());

		pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.licenseNumber(DataFakers.licenseNumber()).build());

		pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
				.VIN(DataFakers.VIN())
				.cost(DataFakers.costOfVehicle())
				.build());

		pc.addPACoverage(PACoverage.builder().build());

		pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

		pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());

		pc.viewQuote();

		pc.viewForms();

		pc.selectPayments(Payments.builder().build());

		pc.getPolicyNumber();

		Log.assertThat(accountNumber != null,"Account created successfully - "+accountNumber,"Account not created");

		return accountNumber;
	}

	// create New bill payment for policy in BC

	public static void createNewDirectBillPayment(String policyNo) {

		String amount = com.aspire.guidewire.bc.teststeps.DataFakers.amount();

		APIBillingCenterStepsImpl pc = BillingCenterSteps.createAPI();

		pc.loginIntoTheApplication("su", "gw");

		pc.searchPolicy(PolicyNo.builder().policyNo(policyNo).build());

		pc.clickDirectBillPayment(amount);

		pc.enterDirectBillPayment(amount);

		Log.assertThat(policyNo != null,"Policy payment transaction completed successfully - "+policyNo,"Policy payment transaction not completed");
	}


}
