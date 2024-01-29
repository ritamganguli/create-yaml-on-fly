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

import com.aspire.guidewire.api.utils.PCAPIUtils.ProductNames;
import com.aspire.guidewire.pc.teststeps.businessowners.APIBusinessOwnersStepsImpl;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddBuildingDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UpdateBusinessOwnersLine;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersSteps;
import com.aspire.guidewire.pc.teststeps.commercialauto.APICommercialAutoStepsImpl;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CommercialAutoLine;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoSteps;
import com.aspire.guidewire.pc.teststeps.commercialpackage.APICommercialPackageStepsImpl;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.LineType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBlanketDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragesDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddExposuresDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineSelectionDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ViewQuote;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageSteps;
import com.aspire.guidewire.pc.teststeps.commercialproperty.APICommercialPropertyStepsImpl;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommecialPropertySteps;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Blanket;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.generalliability.APIGeneralLiabilityStepsImpl;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.AddLocationInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Exposures;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilitySteps;
import com.aspire.guidewire.pc.teststeps.homeowners.APIHomeOwnersStepsImpl;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersConstants;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingConstruction;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersFeatures.DwellingDetails;
import com.aspire.guidewire.pc.teststeps.homeowners.HomeOwnersSteps;
import com.aspire.guidewire.pc.teststeps.inlandmarine.APIInlandMarineStepsImpl;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineSteps;
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
import com.aspire.guidewire.pc.teststeps.workerscompensation.APIWorkersCompensationStepsImpl;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcCoverages;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcoptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationSteps;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;


public class PCDataGenerator {

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
	private static final String PC_TESTDATA_SHEET = "src\\main\\resources\\testdata\\data\\GWTestData_DataEngine.xlsx";

	static String  policyNo ;
	static String  accountNo ;

	@Test
	public static void workersCompensationPolicyCreation() throws InterruptedException{
		String sheetName = "WorkersCompensation";
		updateSheetWithPolicyNumbersforPC(ProductNames.WORKERS_COMPENSATION,PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void generalLiabilityPolicyCreation() throws InterruptedException{
		String sheetName = "GeneralLiability";
		updateSheetWithPolicyNumbersforPC(ProductNames.GENERAL_LIABILITY,PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void inlandMarinePolicyCreationforpc() throws InterruptedException{
		String sheetName = "InlandMarine";
		updateSheetWithPolicyNumbersforPC(ProductNames.INLAND_MARINE,PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void personalAutoPolicyCreation() throws InterruptedException{
		String sheetName = "PersonalAuto";
		updateSheetWithPolicyNumbersforPC(ProductNames.PERSONAL_AUTO,PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void businessOwnersPolicyCreation() throws InterruptedException{
		String sheetName = "BusinessOwners";
		updateSheetWithPolicyNumbersforPC(ProductNames.BUSINESS_OWNERS,PC_TESTDATA_SHEET, sheetName);
	}


	@Test
	public static void commercialPropertyPolicyCreation() throws InterruptedException{
		String sheetName = "CommercialProperty";
		updateSheetWithPolicyNumbersforPC(ProductNames.COMMERCIAL_PROPERTY,PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void commercialAutoPolicyCreation() throws InterruptedException{
		String sheetName = "CommercialAuto";
		updateSheetWithPolicyNumbersForCommercialAuto(ProductNames.COMMERCIAL_AUTO,PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void commercialPackagePolicyCreation() throws InterruptedException{
		String sheetName = "CommercialPackage";
		updateSheetWithPolicyNumbersforPC(ProductNames.COMMERCIAL_PACKAGE,PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void homeownersPolicyCreation() throws InterruptedException{
		String sheetName = "HomeOwners";
		updateSheetWithPolicyNumbersForHomeOwners(PC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void NonLobAccountAndPolicyCreation() throws InterruptedException{
		String sheetName = "NonLob";
		updateSheetWithPolicyNumbersAndAccountNumbersForNonLOB(PC_TESTDATA_SHEET, sheetName);
	}

	/**
	 * @param excelFileName
	 * @param sheetName
	 * @author surendar.baskaran
	 * To update policyNumbers  created through API.
	 * In excel sheet, Based on the POLICYNUMBER column, we will enter the data in the cells
	 * if NA is present in POLICYNUMBER column, no need of values for the respective testcase
	 * if it is not empty or any other than NA, any of the policy name is present, It will empty the cell and write the policy number in cells
	 * @throws InterruptedException 
	 */
	public static void updateSheetWithPolicyNumbersforPC(ProductNames product,String excelFileName, String sheetName) throws InterruptedException {
		String dataCleared = configProperty.getProperty("clearedAPIData");
		try (FileInputStream inputStream = new FileInputStream(excelFileName)) {
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet(sheetName);

			//If sheet not found sheet not found will be printed
			if (sheet == null) {
				throw new IllegalArgumentException("Sheet not found: " + sheetName);
			}

			int lastRowNum = sheet.getLastRowNum();

			//the property value is given in Config file, if it is true it will clear the existing values
			if(dataCleared.equals("false")) {
				//Firstly empty string has been entered in policynumber column 
				for (int i = 1; i <= lastRowNum; i++) {
					Row row = sheet.getRow(i);
					Cell policyNumberCell = row.getCell(1); 

					// Check if the cell contains "NA"
					if (!(policyNumberCell.getStringCellValue().equals("NA"))) {
						policyNumberCell.setCellValue("");
					}
					try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
						workbook.write(outputStream);
					}
				}
				Log.message("Existing policy numbers cleared for  : PC-" + product);
			}
			//Then policy number entered in PolicyNumber column 
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell policyNumberCell = row.getCell(1);
				String policy = policyNumberCell.getStringCellValue();
				
				if (policy.length()==0) {
					switch (product) {
					case BUSINESS_OWNERS:
						policyNo = createBusinessOwnersPolicy();
						Thread.sleep(10000);
						break;
					case COMMERCIAL_PACKAGE:
						policyNo = createCommercialPackagePolicy();
						Thread.sleep(10000);
						break;
					case COMMERCIAL_PROPERTY:
						policyNo = createCommercialPropertyPolicy();
						Thread.sleep(10000);
						break;
					case GENERAL_LIABILITY:
						policyNo = createGeneralLiabilityPolicy();
						Thread.sleep(10000);
						break;
					case INLAND_MARINE:
						policyNo = createInlandMarinePolicy();
						Thread.sleep(10000);
						break;
					case WORKERS_COMPENSATION:
						policyNo = createWorkersCompensationPolicy();
						Thread.sleep(10000);
						break;
					case PERSONAL_AUTO:
						policyNo = createPersonalAutoPolicy();
						Thread.sleep(10000);
						break;
					default:
						break;
					}
					policyNumberCell.setCellValue(policyNo);
				}
				try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
					workbook.write(outputStream);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param excelFileName
	 * @param sheetName
	 * @author surendar.baskaran
	 * To update policyNumbers  created through API.
	 * In excel sheet, Based on the TYPE column, we will enter the POLICYNUMBER in the cells
	 * Based on type of policy "DWELLING","CONDOMINIUM" and "RENTAL" is present in TYPE column it will write the respective policy numbers generated in the cell.
	 * It will clear the cells in policy type before entering the POLICYNUMBERS in cells under POLICY NUMBER column.
	 * @throws InterruptedException 
	 */
	public static void updateSheetWithPolicyNumbersForHomeOwners(String excelFileName, String sheetName) throws InterruptedException {
		String dataCleared = configProperty.getProperty("clearedAPIData");
		try (FileInputStream inputStream = new FileInputStream(excelFileName)) {
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet(sheetName);

			if (sheet == null) {
				throw new IllegalArgumentException("Sheet not found: " + sheetName);
			}

			int lastRowNum = sheet.getLastRowNum();

			if(dataCleared.equals("false")) {
				//Firstly empty string has been entered in policynumber column 
				for (int i = 1; i <= lastRowNum; i++) {
					Row row = sheet.getRow(i);
					Cell typeCell = row.getCell(2);
					Cell policyNumberCell = row.getCell(1); 

					// Check if the cell contains "NA"
					if (!typeCell.getStringCellValue().equals("NA")) {
						policyNumberCell.setCellValue("");
					}

					try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
						workbook.write(outputStream);
					}
				}
				Log.message("Existing policy numbers cleared for  : PC- HomeOwners");
			}

			// Loop through each row
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell typeCell = row.getCell(2); // Assuming policy numbers are in column 3
				Cell policyNumberCell  = row.getCell(1); // Assuming "Type" is in column 2

				// Get the value in the "Type" column
				String type = typeCell.getStringCellValue();

				String policyNo = null;

				String policy = policyNumberCell.getStringCellValue();
				if (policy.length()==0) {
					switch (type) {
					case "DWELLING":
						policyNo = createHomeOwnersPolicyForDwelling();
						Thread.sleep(10000);
						break;
					case "CONDOMINIUM":
						policyNo = createHomeOwnersPolicyForCondominium();
						Thread.sleep(10000);
						break;
					case "RENTAL":
						policyNo = createHomeOwnersPolicyForRental();
						Thread.sleep(10000);
						break;
					}

					if (!type.trim().equals("NA")) { 
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

	/**
	 * @param excelFileName
	 * @param sheetName
	 * @author Manikandan.manohar
	 * To update policyNumbers  created through API.
	 * In excel sheet, Based on the TYPE column, we will enter the POLICYNUMBER in the cells
	 * Based on type of policy "DWELLING","CONDOMINIUM" and "RENTAL" is present in TYPE column it will write the respective policy numbers generated in the cell.
	 * It will clear the cells in policy type before entering the POLICYNUMBERS in cells under POLICY NUMBER column.
	 * @throws InterruptedException 
	 */

	public static void updateSheetWithPolicyNumbersForCommercialAuto(ProductNames product, String excelFileName, String sheetName) throws InterruptedException {
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
					Cell typeCell = row.getCell(2); // Assuming policy numbers are in column 3
					String type = typeCell.getStringCellValue();
					if (!type.equals("NA")) {
						row.getCell(1).setCellValue("");//Empty the AccountNumber call
					}

					try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
						workbook.write(outputStream);
					}
				}
				Log.message("Existing policy numbers cleared for  : PC- CommercialAuto");
			}
			// Loop through each row
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell policyNumberCell  = row.getCell(1); // Assuming "Type" is in column 2
				Cell typeCell = row.getCell(2); // Assuming policy numbers are in column 3

				// Get the value in the "Type" column
				String type = typeCell.getStringCellValue();
				String policy = policyNumberCell.getStringCellValue();
				String policyNo = null;

				if(policy.length()==0) {
					switch (type){
					case "BUSINESSAUTO":
						policyNo = createCommercialAutoPolicyCreationForBusinessAuto();
						Thread.sleep(10000);
						break;
					case "MOTORCARRIERANDTRUCKERS":
						policyNo = createCommercialAutoPolicyCreationForMotorCarrierAndTruckers();
						Thread.sleep(10000);
						break;
					case "GARAGEKEEPERS":
						policyNo = createCommercialAutoPolicyCreationForGaragekeepers();
						Thread.sleep(10000);
						break;
					case "BUSINESSAUTOPHYSICALDAMAGE":
						policyNo = createCommercialAutoPolicyCreationForBusinessAutoPhysicalDamage();
						Thread.sleep(10000);
						break;
					}

					if (!type.equals("NA")) policyNumberCell.setCellValue(policyNo);


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
	 * @author lavanya.bala
	 * To update policyNumbers and Account Number created through API.
	 * In excelsheet, Based on the TYPE column,it will decide whether account need to be created or policy need to be created or no need any data
	 * if NA is present in TYPE column, it will not create any values for the respective testcase
	 * if ACCOUNT is present in TYPE column, it will accountNumber for the respective testcase
	 * if NA and ACCOUNT is not present, any of the policy name is present, it will create the policy which is mentioned in TYPE column
	 * @throws InterruptedException 
	 */
	public static void updateSheetWithPolicyNumbersAndAccountNumbersForNonLOB(String excelFileName, String sheetName) throws InterruptedException {
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
					Cell emptyCell = row.getCell(3); // Assuming policy numbers are in column 3
					String empty = emptyCell.getStringCellValue();
					if (empty.equals("ACCOUNT")) {
						row.getCell(2).setCellValue("");//Empty the AccountNumber call
					}
					else if((!empty.equals("ACCOUNT")) && (!empty.equals("NA"))) {
						row.getCell(1).setCellValue("");//Empty the policyNumber cell
					}

					try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
						workbook.write(outputStream);
					}
				}
				Log.message("Existing policy numbers and Account Numbers got cleared for  : PC-NonLob");
			}
			//Entering the values - Account number and policy number into the respective cells

			for (int i = 1; i <= lastRowNum; i++) {

				Row row = sheet.getRow(i);
				Cell policyNumberCell  = row.getCell(1); 
				Cell accountNumberCell  = row.getCell(2); 
				Cell typeCell = row.getCell(3); 

				// Get the value in the "Type" column
				String type = typeCell.getStringCellValue();

				String policyNo = policyNumberCell.getStringCellValue();
				String accountNo = accountNumberCell.getStringCellValue();

				if (policyNo.length()==0 || accountNo.length()==0) {
					switch (type) {
					case "ACCOUNT":
						accountNo = createAccountInPersonalAutoPolicy();
						accountNumberCell.setCellValue(accountNo);
						break;
					case "PERSONAL_AUTO":
						policyNo = PCDataGenerator.createPersonalAutoPolicy();
						policyNumberCell.setCellValue(policyNo);  
						Thread.sleep(10000);
						break;
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

	// create Workers Compensation policy
	public static String createWorkersCompensationPolicy() {

		APIWorkersCompensationStepsImpl wc = WorkersCompensationSteps.createAPI();


		wc.loginIntoTheApplication("su", "gw");

		wc.searchAccount(WorkersCompensationFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		wc.createAccount(WorkersCompensationFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		wc.selectProduct(WorkersCompensationConstants.ProductNames.WORKERS_COMPENSATION);

		wc.selectQualifications(WorkersCompensationFeatures.Qualification.builder()
				.build());

		wc.updatePolicyInfo(WorkersCompensationFeatures.PolicyInfo.builder()
				.build());

		wc.addLocationDetails(AddLocationDetails.builder().build());

		wc.addWcCoverages(AddWcCoverages.builder()
				.build());

		wc.addSupplemental();

		wc.addWcoptions(AddWcoptions.builder()
				.build());

		wc.selectRiskAnalysis(WorkersCompensationFeatures.RiskAnalysis.builder().build());

		wc.reviewPolicy(WorkersCompensationFeatures.PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE)
				.build());


		wc.viewQuote();

		wc.viewForms();

		wc.issuepolicy(WorkersCompensationConstants.Transactions.SUBMISSION);

		String policyNumber = wc.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;
	}

	// create General Liability policy
	public static String createGeneralLiabilityPolicy() {

		APIGeneralLiabilityStepsImpl gl = GeneralLiabilitySteps.createAPI();

		gl.loginIntoTheApplication("su", "gw");

		gl.searchAccount(GeneralLiabilityFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = gl.createAccount(GeneralLiabilityFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		Log.message("Account Number: "+ accountNumber);

		gl.selectProduct(GeneralLiabilityConstants.ProductNames.GENERAL_LIABILITY);

		gl.selectOfferings(GeneralLiabilityFeatures.Offerings.builder().offering(DataFakers.offerings()).build());

		gl.selectQualifications(GeneralLiabilityFeatures.Qualification.builder()
				.build());

		gl.updatePolicyInfo(GeneralLiabilityFeatures.PolicyInfo.builder()
				.build());

		gl.addLocation(AddLocationInfo.builder()
				.build());

		gl.addCoverage(Coverages.builder()
				.build());

		gl.addExposures(Exposures.builder() 
				.build());

		gl.addModifiersDetails();

		gl.selectRiskAnalysis(GeneralLiabilityFeatures.RiskAnalysis.builder()
				.build());
		gl.reviewPolicy(GeneralLiabilityFeatures.PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE)
				.build());
		gl.viewQuote();
		gl.viewForms();
		gl.selectPayments(GeneralLiabilityFeatures.Payments.builder()
				.build());
		String policyNumber = gl.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;

	}

	// create Inland Marine policy
	public static String createInlandMarinePolicy() {

		APIInlandMarineStepsImpl im = InlandMarineSteps.createAPI();

		im.loginIntoTheApplication("su", "gw");

		im.searchAccount(InlandMarineFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		String accountNumber = im.createAccount(InlandMarineFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		Log.message(accountNumber);

		im.selectProduct(InlandMarineConstants.ProductNames.INLAND_MARINE);

		im.updatePolicyInfo(InlandMarineFeatures.PolicyInfo.builder().build());

		im.addCoveragePartSelections(InlandMarineFeatures.AddCoveragePartSelections.builder().build());

		im.addBuildingLocationDetails(InlandMarineFeatures.AddBuildingLocationDetails.builder()
				.description(DataFakers.generateRandomString("BuildingDescription")).build());

		im.addAccountReceivableDetails(InlandMarineFeatures.AddAccountReceivableDetails.builder()
				.build());

		im.addContractorsEquipmentDetails(InlandMarineFeatures.AddContractorsEquipmentDetails.builder()
				.build());

		im.addSignsDetails(InlandMarineFeatures.AddSignsDetails.builder()
				.build());

		im.selectRiskAnalysis();

		im.reviewPolicy(InlandMarineFeatures.PolicyReview.builder(InlandMarineConstants.PolicyReviewType.NONE).build());

		im.viewQuote();

		im.viewForms();

		im.selectPayments(InlandMarineFeatures.Payments.builder().build());

		im.issuepolicy(InlandMarineConstants.Transactions.SUBMISSION);

		String policyNumber = im.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;
	}

	// create Business Owners policy
	public  static String createBusinessOwnersPolicy() {

		APIBusinessOwnersStepsImpl bo = BusinessOwnersSteps.createAPI();

		bo.loginIntoTheApplication("su", "gw");

		bo.searchAccount(BusinessOwnersFeatures.EnterAccountInformation.builder()
				.firstName(com.aspire.guidewire.pc.teststeps.businessowners.DataFakers.firstName())
				.lastName(com.aspire.guidewire.pc.teststeps.businessowners.DataFakers.lastName())
				.build());

		String accountNumber = bo.createAccount(BusinessOwnersFeatures.CreateNewAccountFromPerson.builder()
				.firstName(com.aspire.guidewire.pc.teststeps.businessowners.DataFakers.firstName())
				.lastName(com.aspire.guidewire.pc.teststeps.businessowners.DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		System.out.println(accountNumber);

		Log.message("AccountNumber: "+ accountNumber);

		bo.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

		bo.selectOfferings(BusinessOwnersFeatures.Offerings.builder()
				.offerings(com.aspire.guidewire.pc.teststeps.businessowners.DataFakers.offerings())
				.build());

		bo.selectQualifications(BusinessOwnersFeatures.Qualification.builder()
				.build());

		bo.updatePolicyInfo(BusinessOwnersFeatures.PolicyInfo.builder().organizationType(com.aspire.guidewire.pc.teststeps.businessowners.DataFakers.organizationType())
				.build());

		bo.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(com.aspire.guidewire.pc.teststeps.businessowners.DataFakers.businessType()).build());


		bo.addLocationDetails(BusinessOwnersFeatures.AddLocationDetails.builder()
				.build());

		bo.addBuildingDetails(AddBuildingDetails.builder()
				.build());

		bo.addModifiersDetails();

		bo.selectRiskAnalysis(BusinessOwnersFeatures.RiskAnalysis.builder(BusinessOwnersConstants.RiskAnalysisType.NONE)
				.build());

		bo.reviewPolicy(BusinessOwnersFeatures.PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE)
				.build());

		bo.viewForms();

		bo.selectPayments(BusinessOwnersFeatures.Payments.builder()
				.build());

		String policyNumber = bo.getPolicyNumber();

		System.out.println(policyNumber);

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;
	}

	// create personal auto policy
	public static String createPersonalAutoPolicy() {

		APIPersonalStepsImpl pc = PersonalAutoSteps.createAPI();

		pc.loginIntoTheApplication("su", "gw");

		pc.searchAccount(EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		String accountNumber = pc.createAccount(CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

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

	// create Commercial property policy
	public static String createCommercialPropertyPolicy() {

		APICommercialPropertyStepsImpl cp = CommecialPropertySteps.createAPI();

		cp.loginIntoTheApplication("su", "gw");

		cp.searchAccount(CommercialPropertyFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = cp.createAccount(CommercialPropertyFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		Log.message("Account Number: "+ accountNumber);

		cp.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

		cp.updatePolicyInfo(CommercialPropertyFeatures.PolicyInfo.builder()
				.build());		

		cp.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
				.build());

		cp.addBlankets(Blanket.builder()
				.build());

		cp.addModifiersDetails();

		cp.selectRiskAnalysis(CommercialPropertyFeatures.RiskAnalysis.builder(ComercialPropertyConstants.RiskAnalysisType.NONE)
				.build());

		cp.reviewPolicy(CommercialPropertyFeatures.PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE)
				.build());

		cp.viewQuote(Quote.builder().build());

		cp.viewForms();

		cp.selectPayments(CommercialPropertyFeatures.Payments.builder()
				.build());

		String policyNumber = cp.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;
	}

	// create Commercial package policy
	public static String createCommercialPackagePolicy() {

		APICommercialPackageStepsImpl cp = CommercialPackageSteps.createAPI();

		cp.loginIntoTheApplication("su", "gw");

		cp.searchAccount(CommercialPackageFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = cp.createAccount(CommercialPackageFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		System.out.println(accountNumber);

		cp.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

		cp.selectOfferings(CommercialPackageFeatures.Offerings.builder()
				.build());

		cp.selectQualifications();

		cp.updatePolicyInfo(CommercialPackageFeatures.PolicyInfo.builder()
				.build());

		cp.addLineSelectionDetails(AddLineSelectionDetails.builder()
				.build());


		cp.addLocationDetails(CommercialPackageFeatures.AddLocationDetails.builder()
				.build());

		cp.addCoveragesDetails(AddCoveragesDetails.builder()
				.build());

		cp.addExposuresDetails(AddExposuresDetails.builder()
				.build());

		cp.addModifiersDetails();

		cp.addLineReview(AddLineReview.builder()
				.build());

		cp.addBuildingLocationDetails(CommercialPackageFeatures.AddBuildingLocationDetails.builder()
				.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
				.build());

		cp.addBlanketDetails(AddBlanketDetails.builder()
				.build());

		cp.addModifiersDetails();

		cp.addLineReview(AddLineReview.builder()
				.build());

		cp.addCoveragePartSelections(AddCoveragePartSelections.builder()
				.build());

		cp.addBuildingLocationDetails(CommercialPackageFeatures.AddBuildingLocationDetails.builder()
				.lineType(LineType.INLAND_MARINE_LINE)
				.build());

		cp.addAccountReceivableDetails(AddAccountReceivableDetails.builder()
				.build());

		cp.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder()
				.build());

		cp.addSignsDetails(AddSignsDetails.builder()
				.build());

		cp.addLineReview(AddLineReview.builder()
				.build());

		cp.selectRiskAnalysis(CommercialPackageFeatures.RiskAnalysis.builder(CommercialPackageConstants.RiskAnalysisType.NONE)
				.build());
		cp.viewQuote(ViewQuote.builder().build());
		cp.viewForms();
		cp.selectPayments(CommercialPackageFeatures.Payments.builder()
				.build());
		String policyNumber = cp.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");
		return policyNumber;

	}
	// create HomeOwners Dwelling policy
	public  static String createHomeOwnersPolicyForDwelling() {

		APIHomeOwnersStepsImpl ho = HomeOwnersSteps.createAPI();

		ho.loginIntoTheApplication("su", "gw");

		ho.searchAccount(HomeOwnersFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = ho.createAccount(HomeOwnersFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		Log.message("AccountNumber: "+ accountNumber);


		ho.selectProduct(HomeOwnersConstants.ProductNames.HOME_OWNERS);


		ho.selectQualifications(HomeOwnersFeatures.Qualification.builder().typeOfPolicy(HomeOwnersConstants.PolicyType.DWELLING)
				.build());

		ho.updatePolicyInfo(HomeOwnersFeatures.PolicyInfo.builder()
				.build());

		ho.addDwellingDetails(DwellingDetails.builder().build());

		ho.addDwellingConstructionDetails(DwellingConstruction.builder().build());

		ho.addCoverages(HomeOwnersFeatures.Coverages.builder(HomeOwnersConstants.PolicyType.DWELLING)
				.build());

		ho.addModifiersDetails();

		ho.selectRiskAnalysis(HomeOwnersFeatures.RiskAnalysis.builder(HomeOwnersConstants.RiskAnalysisType.NONE)
				.build());

		ho.reviewPolicy(HomeOwnersFeatures.PolicyReview.builder(HomeOwnersConstants.PolicyReviewType.NONE)
				.build());

		ho.viewQuote(HomeOwnersFeatures.Quote.builder()
				.build());

		ho.viewForms(HomeOwnersFeatures.Quote.builder()
				.build());

		ho.selectPayments(HomeOwnersFeatures.Payments.builder()
				.build());

		String policyNumber = ho.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;

	}
	// create HomeOwners Condominium policy
	public  static String createHomeOwnersPolicyForCondominium() {

		APIHomeOwnersStepsImpl ho = HomeOwnersSteps.createAPI();

		ho.loginIntoTheApplication("su", "gw");

		ho.searchAccount(HomeOwnersFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = ho.createAccount(HomeOwnersFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		Log.message("AccountNumber: "+ accountNumber);


		ho.selectProduct(HomeOwnersConstants.ProductNames.HOME_OWNERS);

		ho.selectQualifications(HomeOwnersFeatures.Qualification.builder().typeOfPolicy(HomeOwnersConstants.PolicyType.CONDOMINIUM)
				.build());

		ho.updatePolicyInfo(HomeOwnersFeatures.PolicyInfo.builder()
				.build());

		ho.addDwellingDetails(DwellingDetails.builder().build());

		ho.addDwellingConstructionDetails(DwellingConstruction.builder().build());

		ho.addCoverages(HomeOwnersFeatures.Coverages.builder(HomeOwnersConstants.PolicyType.CONDOMINIUM)
				.build());

		ho.addModifiersDetails();

		ho.selectRiskAnalysis(HomeOwnersFeatures.RiskAnalysis.builder(HomeOwnersConstants.RiskAnalysisType.NONE)
				.build());

		ho.reviewPolicy(HomeOwnersFeatures.PolicyReview.builder(HomeOwnersConstants.PolicyReviewType.NONE)
				.build());

		ho.viewQuote(HomeOwnersFeatures.Quote.builder()
				.build());

		ho.viewForms(HomeOwnersFeatures.Quote.builder()
				.build());

		ho.selectPayments(HomeOwnersFeatures.Payments.builder()
				.build());

		String policyNumber = ho.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;

	}

	// create HomeOwners Rental policy
	public  static String createHomeOwnersPolicyForRental() {

		APIHomeOwnersStepsImpl ho = HomeOwnersSteps.createAPI();

		ho.loginIntoTheApplication("su", "gw");

		ho.searchAccount(HomeOwnersFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = ho.createAccount(HomeOwnersFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		Log.message("AccountNumber: "+ accountNumber);


		ho.selectProduct(HomeOwnersConstants.ProductNames.HOME_OWNERS);

		ho.selectQualifications(HomeOwnersFeatures.Qualification.builder().typeOfPolicy(HomeOwnersConstants.PolicyType.RENTAL)
				.build());

		ho.updatePolicyInfo(HomeOwnersFeatures.PolicyInfo.builder()
				.build());

		ho.addDwellingDetails(DwellingDetails.builder().build());

		ho.addDwellingConstructionDetails(DwellingConstruction.builder().build());

		ho.addCoverages(HomeOwnersFeatures.Coverages.builder(HomeOwnersConstants.PolicyType.RENTAL)
				.build());

		ho.addModifiersDetails();

		ho.selectRiskAnalysis(HomeOwnersFeatures.RiskAnalysis.builder(HomeOwnersConstants.RiskAnalysisType.NONE)
				.build());

		ho.reviewPolicy(HomeOwnersFeatures.PolicyReview.builder(HomeOwnersConstants.PolicyReviewType.NONE)
				.build());

		ho.viewQuote(HomeOwnersFeatures.Quote.builder()
				.build());

		ho.viewForms(HomeOwnersFeatures.Quote.builder()
				.build());

		ho.selectPayments(HomeOwnersFeatures.Payments.builder()
				.build());

		String policyNumber = ho.getPolicyNumber();

		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");

		return policyNumber;

	}
	// create CommercialAuto BusinessAuto policy
	public static String createCommercialAutoPolicyCreationForBusinessAuto() {

		APICommercialAutoStepsImpl ca = CommercialAutoSteps.createAPI();

		ca.loginIntoTheApplication("su", "gw");

		ca.searchAccount(CommercialAutoFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = ca.createAccount(CommercialAutoFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		System.out.println(accountNumber);

		ca.selectProduct(CommercialAutoConstants.ProductNames.COMMERCIAL_AUTO);

		ca.selectOfferings(CommercialAutoFeatures.Offerings.builder()
				.offerings(DataFakers.offerings())
				.build());

		ca.selectQualifications(CommercialAutoFeatures.Qualification.builder()
				.build());

		ca.updatePolicyInfo(CommercialAutoFeatures.PolicyInfo.builder()
				.build());

		ca.addCommercialAutoLineDetails(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.BUSINESSAUTO)
				.build());

		ca.addLocations();

		ca.addVehicle(CommercialAutoFeatures.Vehicles.builder()
				.build());

		ca.handleLiabilityRequiredWarningAlert(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.BUSINESSAUTO).build());

		ca.addStateInfo();
		ca.addNewDriver(CommercialAutoFeatures.Drivers.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.dateOfBirth(DataFakers.dateOfBirth())
				.licenseNumber(DataFakers.licenseNumber())
				.build());
		ca.addCoveredVehicles();
		ca.addModifiersDetails();

		ca.selectRiskAnalysis(CommercialAutoFeatures.RiskAnalysis.builder(CommercialAutoConstants.RiskAnalysisType.NONE)
				.build());
		ca.reviewPolicy(CommercialAutoFeatures.PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION)
				.build());
		ca.viewQuote();
		ca.viewForms();
		ca.selectPayments(CommercialAutoFeatures.Payments.builder()
				.build());
		String policyNumber = ca.getPolicyNumber();
		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");
		return policyNumber;
	}

	// create CommercialAuto MotorCarrierAndTruckers policy
	public static String createCommercialAutoPolicyCreationForMotorCarrierAndTruckers() {

		APICommercialAutoStepsImpl ca = CommercialAutoSteps.createAPI();

		ca.loginIntoTheApplication("su", "gw");

		ca.searchAccount(CommercialAutoFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = ca.createAccount(CommercialAutoFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		System.out.println(accountNumber);

		ca.selectProduct(CommercialAutoConstants.ProductNames.COMMERCIAL_AUTO);

		ca.selectOfferings(CommercialAutoFeatures.Offerings.builder()
				.offerings(DataFakers.offerings())
				.build());

		ca.selectQualifications(CommercialAutoFeatures.Qualification.builder()
				.build());

		ca.updatePolicyInfo(CommercialAutoFeatures.PolicyInfo.builder()
				.build());

		ca.addCommercialAutoLineDetails(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.MOTOR_CARRIERANDTRUCKERS)
				.build());

		ca.addLocations();

		ca.addVehicle(CommercialAutoFeatures.Vehicles.builder()
				.build());

		ca.handleLiabilityRequiredWarningAlert(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.MOTOR_CARRIERANDTRUCKERS).build());

		ca.addStateInfo();
		ca.addNewDriver(CommercialAutoFeatures.Drivers.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.dateOfBirth(DataFakers.dateOfBirth())
				.licenseNumber(DataFakers.licenseNumber())
				.build());
		ca.addCoveredVehicles();
		ca.addModifiersDetails();

		ca.selectRiskAnalysis(CommercialAutoFeatures.RiskAnalysis.builder(CommercialAutoConstants.RiskAnalysisType.NONE)
				.build());
		ca.reviewPolicy(CommercialAutoFeatures.PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION)
				.build());
		ca.viewQuote();
		ca.viewForms();
		ca.selectPayments(CommercialAutoFeatures.Payments.builder()
				.build());
		String policyNumber = ca.getPolicyNumber();
		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");
		return policyNumber;
	}

	// create CommercialAuto Garagekeepers policy
	public static String createCommercialAutoPolicyCreationForGaragekeepers() {

		APICommercialAutoStepsImpl ca = CommercialAutoSteps.createAPI();

		ca.loginIntoTheApplication("su", "gw");

		ca.searchAccount(CommercialAutoFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = ca.createAccount(CommercialAutoFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		System.out.println(accountNumber);

		ca.selectProduct(CommercialAutoConstants.ProductNames.COMMERCIAL_AUTO);

		ca.selectOfferings(CommercialAutoFeatures.Offerings.builder()
				.offerings(DataFakers.offerings())
				.build());

		ca.selectQualifications(CommercialAutoFeatures.Qualification.builder()
				.build());

		ca.updatePolicyInfo(CommercialAutoFeatures.PolicyInfo.builder()
				.build());

		ca.addCommercialAutoLineDetails(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.GARAGE_KEEPER)
				.build());

		ca.addLocations();

		ca.addVehicle(CommercialAutoFeatures.Vehicles.builder()
				.build());

		ca.handleLiabilityRequiredWarningAlert(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.GARAGE_KEEPER).build());

		ca.addStateInfo();
		ca.addNewDriver(CommercialAutoFeatures.Drivers.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.dateOfBirth(DataFakers.dateOfBirth())
				.licenseNumber(DataFakers.licenseNumber())
				.build());
		ca.addCoveredVehicles();
		ca.addModifiersDetails();

		ca.selectRiskAnalysis(CommercialAutoFeatures.RiskAnalysis.builder(CommercialAutoConstants.RiskAnalysisType.NONE)
				.build());
		ca.reviewPolicy(CommercialAutoFeatures.PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION)
				.build());
		ca.viewQuote();
		ca.viewForms();
		ca.selectPayments(CommercialAutoFeatures.Payments.builder()
				.build());
		String policyNumber = ca.getPolicyNumber();
		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");
		return policyNumber;
	}

	// create CommercialAuto BusinessAutoPhysicalDamage policy
	public static String createCommercialAutoPolicyCreationForBusinessAutoPhysicalDamage() {

		APICommercialAutoStepsImpl ca = CommercialAutoSteps.createAPI();

		ca.loginIntoTheApplication("su", "gw");

		ca.searchAccount(CommercialAutoFeatures.EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.build());

		String accountNumber = ca.createAccount(CommercialAutoFeatures.CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

		System.out.println(accountNumber);

		ca.selectProduct(CommercialAutoConstants.ProductNames.COMMERCIAL_AUTO);

		ca.selectOfferings(CommercialAutoFeatures.Offerings.builder()
				.offerings(DataFakers.offerings())
				.build());

		ca.selectQualifications(CommercialAutoFeatures.Qualification.builder()
				.build());

		ca.updatePolicyInfo(CommercialAutoFeatures.PolicyInfo.builder()
				.build());

		ca.addCommercialAutoLineDetails(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.BUSINESSAUTO_PHYSICALDAMAGE)
				.build());

		ca.addLocations();

		ca.addVehicle(CommercialAutoFeatures.Vehicles.builder()
				.build());

		ca.handleLiabilityRequiredWarningAlert(CommercialAutoLine.builder().productType(CommercialAutoConstants.PolicyType.BUSINESSAUTO_PHYSICALDAMAGE)
				.build());

		ca.addStateInfo();
		ca.addNewDriver(CommercialAutoFeatures.Drivers.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.dateOfBirth(DataFakers.dateOfBirth())
				.licenseNumber(DataFakers.licenseNumber())
				.build());
		ca.addCoveredVehicles();

		ca.addModifiersDetails();

		ca.selectRiskAnalysis(CommercialAutoFeatures.RiskAnalysis.builder(CommercialAutoConstants.RiskAnalysisType.NONE)
				.build());
		ca.reviewPolicy(CommercialAutoFeatures.PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION)
				.build());
		ca.viewQuote();
		ca.viewForms();
		ca.selectPayments(CommercialAutoFeatures.Payments.builder()
				.build());
		String policyNumber = ca.getPolicyNumber();
		Log.assertThat(policyNumber != null,"Policy created successfully - "+policyNumber,"Policy not created");
		return policyNumber;
	}

	public static String createAccountInPersonalAutoPolicy() {

		APIPersonalStepsImpl pc = PersonalAutoSteps.createAPI();

		pc.loginIntoTheApplication("su", "gw");

		pc.searchAccount(EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		String accountNumber = pc.createAccount(CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName())
				.state(DataFakers.stateNotation())
				.build());

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

		return accountNumber;

	}

}

