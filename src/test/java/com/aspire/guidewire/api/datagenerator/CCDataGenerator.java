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

import com.aspire.guidewire.api.utils.CCAPIUtils.ProductNames;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures;
import com.aspire.guidewire.cc.teststeps.workerscompensation.DataFakers;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures;
import com.aspire.guidewire.pc.teststeps.personalauto.APIPersonalStepsImpl;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoSteps;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;

public class CCDataGenerator {

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
	private static final String CC_TESTDATA_SHEET = "src\\main\\resources\\testdata\\data\\CC_GWTestData_DataEngine.xlsx";

	static String  policyNo ;
	static String  accountNo ;
	static String  claimNo;


	@Test
	public static void personalAutoClaimCreation() throws InterruptedException{
		String sheetName = "PersonalAuto";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.PERSONAL_AUTO,CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void workersCompensationPolicyCreation() throws InterruptedException{
		String sheetName = "WorkersCompenstaion";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.WORKERS_COMPENSATION,CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void generalLiabilityPolicyCreation() throws InterruptedException {
		String sheetName = "GeneralLiability";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.GENERAL_LIABILITY,CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void commercialPropertyPolicyCreation()  throws InterruptedException {
		String sheetName = "CommercialProperty";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.COMMERCIAL_PROPERTY,CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void commercialAutoPolicyCreation() throws InterruptedException{
		String sheetName = "CommercialAuto";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.COMMERCIAL_AUTO,CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void businessOwnersPolicyCreation() throws InterruptedException {
		String sheetName = "Businessowners";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.BUSINESS_OWNERS,CC_TESTDATA_SHEET, sheetName);
	}
	@Test
	public static void commercialPackagePolicyCreation() throws InterruptedException  {
		String sheetName = "CommercialPackage";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.COMMERCIAL_PACKAGE,CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void homeownersPolicyCreation() throws InterruptedException{
		String sheetName = "Homeowners";
		updateSheetWithClaimNumbersAndPolicyNumbersforHomeOwners(CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void inlandMarinePolicyCreation() throws InterruptedException {
		String sheetName = "InlandMarine";
		updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames.INLAND_MARINE,CC_TESTDATA_SHEET, sheetName);
	}

	@Test
	public static void NonLobAccountAndPolicyCreation() throws InterruptedException{
		String sheetName = "NonLob";
		updateSheetWithPolicyNumbersAndAccountNumbersForNonLOB(CC_TESTDATA_SHEET, sheetName);
	}

	/**
	 * @param excelFileName
	 * @param sheetName
	 * @author charu.anbarasan
	 * To update claimNumbers and policyNumber created through API.
	 * In excelsheet, Based on the value "NA",it will decide whether claim need to be created or policy need to be created.
	 * if NA is present in any cell in ClaimNumber column, it will not write claim for that particular testcase
	 * if NA is present in any cell in policyNumber column, it will not write policy for that particular testcase
	 */
	public static void updateSheetWithClaimNumbersAndPolicyNumbers(ProductNames product,String excelFileName, String sheetName) throws InterruptedException {
		String dataCleared = configProperty.getProperty("clearedAPIData");
		try (FileInputStream inputStream = new FileInputStream(excelFileName)) {
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet(sheetName);

			//If sheet not found sheet nof found will be printed
			if (sheet == null) {
				throw new IllegalArgumentException("Sheet not found: " + sheetName);
			}

			int lastRowNum = sheet.getLastRowNum();
			
			//the property value is given in Config file, if it is true it will clear the existing values
            if(dataCleared.equals("false")) {
            	
			//Firstly empty string has been entered in policynumber column 
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell claimNumberCell = row.getCell(1);
				Cell policyNumberCell = row.getCell(2); 
				String claimNA = claimNumberCell.getStringCellValue();
				String policyNA = policyNumberCell.getStringCellValue();	

				if(!claimNA.equals("NA")) claimNumberCell.setCellValue("");

				if(!policyNA.equals("NA")) policyNumberCell.setCellValue("");


				try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
					workbook.write(outputStream);
				}
			}

			Log.message("Existing policy numbers cleared for  :CC-"+product);
            }
			// Then policy number entered in PolicyNumber column 
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell claimNumberCell = row.getCell(1); 
				Cell policyNumberCell = row.getCell(2); 
				String claimNA = claimNumberCell.getStringCellValue();
				String policyNA = policyNumberCell.getStringCellValue();

				/*  Here first, the policy will be created in policyCenter and then using the same policy the claim will be created in claimCenter
		      so the delay of 45 secs given between policy creation and claim creation*/
               if(claimNA.length()==0 || policyNA.length()==0) {
				switch (product) {
				case BUSINESS_OWNERS:
					policyNo = PCDataGenerator.createBusinessOwnersPolicy();
					Thread.sleep(45000);
					if(!claimNA.equals("NA")) 
						claimNo = createClaimforBusinessOwners(policyNo);
					break;
				case COMMERCIAL_AUTO:
					policyNo = PCDataGenerator.createCommercialAutoPolicyCreationForBusinessAuto();
					Thread.sleep(45000);
					if(!claimNA.equals("NA")) 
						claimNo = createClaimForCommercialAuto(policyNo);
					break;
				case COMMERCIAL_PACKAGE:
					policyNo = PCDataGenerator.createCommercialPackagePolicy();
					Thread.sleep(45000);
					if(!claimNA.equals("NA")) 
						claimNo = createClaimForCommercialPackage(policyNo);
					break;
				case COMMERCIAL_PROPERTY:
					policyNo = PCDataGenerator.createCommercialPropertyPolicy();
					Thread.sleep(45000);
					if(!claimNA.equals("NA")) 
						claimNo = createClaimForCommercialProperty(policyNo);
					break;
				case GENERAL_LIABILITY:
					policyNo = PCDataGenerator.createGeneralLiabilityPolicy();
					Thread.sleep(45000);
					if(!claimNA.equals("NA")) 
						claimNo = createClaimForGeneralLiability(policyNo);
					break;
				case INLAND_MARINE:
					policyNo = PCDataGenerator.createInlandMarinePolicy();
					Thread.sleep(45000);
					if(!claimNA.equals("NA")) 
						claimNo = createClaimForInlandMarine(policyNo);
					break;
				case WORKERS_COMPENSATION:
					policyNo = PCDataGenerator.createWorkersCompensationPolicy();
					Thread.sleep(45000);
					if(!claimNA.equals("NA"))
						claimNo = createClaimForWorkersCompensation(policyNo);
					break;
				case PERSONAL_AUTO:
					policyNo = PCDataGenerator.createPersonalAutoPolicy();
					Thread.sleep(45000);
					if(!claimNA.equals("NA")) 
						claimNo = createClaimForPersonalAuto(policyNo);
					break;
				default:
					break;	

				}
				if(policyNA.length()==0) policyNumberCell.setCellValue(policyNo);
				if(claimNA.length()==0) claimNumberCell.setCellValue(claimNo);

				try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
					workbook.write(outputStream);
				}
               }

			} 
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}



	/**
	 * @param excelFileName
	 * @param sheetName
	 * @author charu.anbarasan
	 * To update claimNumbers and policyNumber created through API.
	 * In excelsheet, Based on the value "NA",it will decide whether claim need to be created or policy need to be created.
	 * if NA is present in any cell in ClaimNumber column, it will not write claim for that particular testcase
	 * if NA is present in any cell in policyNumber column, it will not write policy for that particular testcase
	 */
	public static void updateSheetWithClaimNumbersAndPolicyNumbersforHomeOwners(String excelFileName, String sheetName) throws InterruptedException {
		String dataCleared = configProperty.getProperty("clearedAPIData");
		
		try (FileInputStream inputStream = new FileInputStream(excelFileName)) {
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet(sheetName);

			// If sheet not found sheet not found will be printed
			if (sheet == null) {
				throw new IllegalArgumentException("Sheet not found: " + sheetName);
			}

			int lastRowNum = sheet.getLastRowNum();

			//the property value is given in Config file, if it is true it will clear the existing values
            if(dataCleared.equals("false")) {
            	
			// Firstly empty string has been entered in policynumber column
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell claimNumberCell = row.getCell(1);
				Cell policyNumberCell = row.getCell(2);
				String claimNA = claimNumberCell.getStringCellValue();
				String policyNA = policyNumberCell.getStringCellValue();

				if (!claimNA.equals("NA")) claimNumberCell.setCellValue("");

				if (!policyNA.equals("NA")) policyNumberCell.setCellValue("");
				
				try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
					workbook.write(outputStream);
				}
			}
			
			Log.message("PolicyNumbers and ClaimNumbers got cleared in CC - HomeOwners");
            }
			// Then policy number entered in PolicyNumber column
            
			for (int i = 1; i <= lastRowNum; i++) {
				Row row = sheet.getRow(i);
				Cell claimNumberCell = row.getCell(1);
				Cell policyNumberCell = row.getCell(2);
				Cell typeCell = row.getCell(3);
				String claimNA = claimNumberCell.getStringCellValue();
				String policyNA = policyNumberCell.getStringCellValue();
				String type = typeCell.getStringCellValue();

		 if(claimNA.length()==0 || policyNA.length()==0) {
				switch (type) {
				case "DWELLING":
					policyNo = PCDataGenerator.createHomeOwnersPolicyForDwelling();
					Thread.sleep(45000);
					if (!claimNA.equals("NA"))
						claimNo = createClaimForHomeOwners(policyNo);
					break;
				case "CONDOMINIUM":
					policyNo = PCDataGenerator.createHomeOwnersPolicyForCondominium();
					Thread.sleep(45000);
					if (!claimNA.equals("NA"))
						claimNo = createClaimForHomeOwners(policyNo);
					break;
				case "RENTAL":
					policyNo = PCDataGenerator.createHomeOwnersPolicyForRental();
					Thread.sleep(45000);
					if (!claimNA.equals("NA"))
						claimNo = createClaimForHomeOwners(policyNo);
					break;
				}
				if (policyNA.length()==0) policyNumberCell.setCellValue(policyNo);
				if (claimNA.length()==0) claimNumberCell.setCellValue(claimNo);
		 
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
	 * @author charu.anbarasan
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


			//the property value is given in Config file, if it is true it will clear the existing values
            if(dataCleared.equals("false")) {
            	
			//Firstly empty string has been entered in policynumber and AccountNumber and claimNumber column 
			for (int i = 1; i <= lastRowNum; i++) {

				Row row = sheet.getRow(i);
				String type = row.getCell(4).getStringCellValue(); // types are in column 4
				String policy = row.getCell(2).getStringCellValue(); // policies are in column 2
				String claim = row.getCell(1).getStringCellValue(); // claims are in column 1

				if (type.equals("ACCOUNT")) {
					row.getCell(3).setCellValue("");//Empty the AccountNumber call
				}
				else if((!type.equals("ACCOUNT")) && (!type.equals("NA")) && (!policy.equals("NA"))) {
					row.getCell(2).setCellValue("");//Empty the claimNumber cell
				}
				else if((!type.equals("ACCOUNT")) && (!type.equals("NA")) && (!claim.equals("NA"))) {
					row.getCell(1).setCellValue("");//Empty the policyNumber cell
				}
				
				try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
					workbook.write(outputStream);
				}
			}
			Log.message("PolicyNumbers and ClaimNumbers got cleared in CC - NonLob");
            }

			//Entering the values - Account number and policy number into the respective cells

			for (int i = 1; i <= lastRowNum; i++) {

				Row row = sheet.getRow(i);
				Cell typeCell = row.getCell(4); 
				Cell accountNumberCell  = row.getCell(3); 
				Cell policyNumberCell  = row.getCell(2); 
				Cell claimNumberCell = row.getCell(1); 
				String account = accountNumberCell.getStringCellValue();
				String policy = policyNumberCell.getStringCellValue();
				String claim = claimNumberCell.getStringCellValue();

				// Get the value in the "Type" column
				String type = typeCell.getStringCellValue();

				String accountNo = null;

				if(account.length()==0 || policy.length()==0 || claim.length()==0) {
					
					switch (type) {
					case "ACCOUNT":
						accountNo = createAccount();
						accountNumberCell.setCellValue(accountNo);
						break;
					case "PERSONAL_AUTO":
						policyNo = PCDataGenerator.createPersonalAutoPolicy();
						Thread.sleep(45000);
						claimNo = createClaimForPersonalAuto(policyNo);
						break;
					case "HOME_OWNERS":
						policyNo = PCDataGenerator.createHomeOwnersPolicyForCondominium();
						Thread.sleep(45000);
						claimNo = createClaimForHomeOwners( policyNo);
						break;
					case "INLAND_MARINE":
						policyNo = PCDataGenerator.createInlandMarinePolicy();
						Thread.sleep(45000);
						claimNo = createClaimForInlandMarine(policyNo);
						break;
					case "GENERAL_LIABILITY":
						policyNo = PCDataGenerator.createGeneralLiabilityPolicy();
						Thread.sleep(45000);
						claimNo = createClaimForGeneralLiability(policyNo);
						break;
					case "WORKERS_COMPENSATION":
						policyNo = PCDataGenerator.createWorkersCompensationPolicy();
						Thread.sleep(45000);
						claimNo = createClaimForWorkersCompensation(policyNo);
						break;
					case "COMMERCIAL_PACKAGE":
						policyNo = PCDataGenerator.createCommercialPackagePolicy();
						Thread.sleep(45000);
						claimNo = createClaimForCommercialPackage(policyNo);
						break;
					case "BUSINESS_OWNERS":
						policyNo = PCDataGenerator.createBusinessOwnersPolicy();
						Thread.sleep(45000);
						claimNo = createClaimforBusinessOwners(policyNo);
						break;
					case "COMMERCIAL_AUTO":
						policyNo = PCDataGenerator.createCommercialAutoPolicyCreationForBusinessAuto();
						Thread.sleep(45000);
						claimNo = createClaimForCommercialAuto(policyNo);
						break;
					}

					if(policy.length()==0) policyNumberCell.setCellValue(policyNo);
					if(claim.length()==0) claimNumberCell.setCellValue(claimNo);

			try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
				workbook.write(outputStream);
			}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//create account through API for CC-NonLob cases
	public static String createAccount() {

		APIPersonalStepsImpl pc = PersonalAutoSteps.createAPI();

		pc.loginIntoTheApplication("su", "gw");

		pc.searchAccount(EnterAccountInformation.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		String accountNumber = pc.createAccount(CreateNewAccountFromPerson.builder()
				.firstName(DataFakers.firstName())
				.lastName(DataFakers.lastName()).build());

		Log.assertThat(accountNumber != null,"Account created successfully - "+accountNumber,"Account not created");
		return accountNumber;

	}

	//create claim for personal Auto policy
	public static String createClaimForPersonalAuto(String policyNo) {

		com.aspire.guidewire.cc.teststeps.personalauto.APIPersonalAutoStepsImpl cc = com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoSteps.createAPI();

		cc.loginIntoTheApplication("su", "gw");

		cc.createClaim();

		cc.searchPolicy(PersonalAutoFeatures.Searchpolicy.builder().policyNo(policyNo).lossDate(DataFakers.currentDate()).build());

		cc.enterBasicInformation(PersonalAutoFeatures.BasicInfo.builder().build());

		cc.addClaimInformation(PersonalAutoFeatures.ClaimInfo.builder().build());

		cc.addServices();

		String claimNo = cc.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;

	}

	//create claim for Commercial Auto policy
	public static String createClaimForCommercialAuto(String policyNo) {

		com.aspire.guidewire.cc.teststeps.commercialauto.APICommercialAutoStepsImpl ca = com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoSteps.createAPI();

		ca.loginIntoTheApplication("su", "gw");

		ca.createClaim();

		ca.searchPolicy(CommercialAutoFeatures.Searchpolicy.builder().policyNo(policyNo).lossDate(DataFakers.currentDate()).build());

		ca.SelectInvolvedPolicyVehicle();

		ca.enterBasicInformation(CommercialAutoFeatures.BasicInfo.builder().build());

		ca.addClaimInformation(CommercialAutoFeatures.ClaimInfo.builder().build());       

		ca.addServices(CommercialAutoFeatures.TowingAgency.builder().build());

		String claimNo = ca.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}

	//create claim for Workers Compensation policy
	public static String createClaimForWorkersCompensation(String policyNo) {

		com.aspire.guidewire.cc.teststeps.workerscompensation.APIWorkersCompensationStepsImpl wc = com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationSteps.createAPI();		

		wc.loginIntoTheApplication("su", "gw");

		wc.createClaim();

		wc.searchPolicy(WorkersCompensationFeatures.Searchpolicy.builder().policyNo(policyNo).lossDate(DataFakers.currentDate()).build());

		wc.enterBasicInformation(WorkersCompensationFeatures.BasicInfo.builder().build());

		wc.addClaimInformation(WorkersCompensationFeatures.ClaimInfo.builder().dateEmployerNotified(DataFakers.currentDate()).build());       

		String claimNo = wc.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}

	//create claim for General Liability policy
	public static String createClaimForGeneralLiability(String policyNo) {

		com.aspire.guidewire.cc.teststeps.generalliability.APIGeneralLiabilityStepsImpl gl = com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilitySteps.createAPI();

		gl.loginIntoTheApplication("su", "gw");

		gl.createClaim();

		gl.searchPolicy(GeneralLiabilityFeatures.Searchpolicy.builder().policyNo(policyNo).lossDate(DataFakers.currentDate()).build());

		gl.enterBasicInformation(GeneralLiabilityFeatures.BasicInfo.builder().lossDate(DataFakers.currentDate()).build());

		gl.addClaimInformation(GeneralLiabilityFeatures.ClaimInfo.builder().build());

		String claimNo = gl.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}

	//create claim for Commercial property policy
	public static String createClaimForCommercialProperty(String policyNo) {

		com.aspire.guidewire.cc.teststeps.commercialproperty.APICommercialPropertyStepsImpl comproperty = com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertySteps.createAPI();	

		comproperty.loginIntoTheApplication("su", "gw");

		comproperty.createClaim();

		comproperty.searchPolicy(CommercialPropertyFeatures.Searchpolicy.builder().policyNo(policyNo)
				.lossDate(DataFakers.currentDate()).build());

		comproperty.updateInvolvedPolicyProperties();

		comproperty.enterBasicInformation(CommercialPropertyFeatures.BasicInfo.builder().build());

		comproperty.addClaimInformation(CommercialPropertyFeatures.ClaimInfo.builder().build());

		comproperty.addServices();

		String claimNo = comproperty.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}

	//create claim for Home Owners policy
	public static String createClaimForHomeOwners(String policyNo) {

		com.aspire.guidewire.cc.teststeps.homeowners.APIHomeOwnersStepsImpl ho = com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersSteps.createAPI();		

		ho.loginIntoTheApplication("su", "gw");

		ho.createClaim();

		ho.searchPolicy(HomeOwnersFeatures.Searchpolicy.builder().policyNo(policyNo).lossDate(DataFakers.currentDate()).build());

		ho.enterBasicInformation(HomeOwnersFeatures.BasicInfo.builder().build());

		ho.addClaimInformation(HomeOwnersFeatures.ClaimInfo.builder().build());       

		String claimNo = ho.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}


	//create claim for Commercial package policy
	public static String createClaimForCommercialPackage(String policyNo) {

		com.aspire.guidewire.cc.teststeps.commercialpackage.APICommercialPackageStepsImpl comPackage = com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageSteps.createAPI();

		comPackage.loginIntoTheApplication("su", "gw");

		comPackage.createClaim();

		comPackage.searchPolicy(CommercialPackageFeatures.Searchpolicy.builder().policyNo(policyNo).lossDate(DataFakers.currentDate()).build());

		comPackage.enterBasicInformation(CommercialPackageFeatures.BasicInfo.builder().lossDate(DataFakers.currentDate()).build());

		comPackage.addClaimInformation(CommercialPackageFeatures.ClaimInfo.builder().build());

		String claimNo = comPackage.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}

	//create claim for Inland marine policy
	public static String createClaimForInlandMarine(String policyNo) {

		com.aspire.guidewire.cc.teststeps.inlandmarine.APIInlandMarineStepsImpl inlandMarine = com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineSteps.createAPI();	

		inlandMarine.loginIntoTheApplication("su", "gw");

		inlandMarine.createClaim();

		inlandMarine.searchPolicy(InlandMarineFeatures.Searchpolicy.builder().policyNo(policyNo).lossDate(DataFakers.currentDate()).build());

		inlandMarine.enterBasicInformation(InlandMarineFeatures.BasicInfo.builder().build());

		inlandMarine.addClaimInformation(InlandMarineFeatures.ClaimInfo.builder().build());

		inlandMarine.addServices();

		String claimNo = inlandMarine.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}

	//create claim for Business Owners marine policy
	public static String createClaimforBusinessOwners(String policy) {

		com.aspire.guidewire.cc.teststeps.businessowners.APIBusinessOwnersStepsImpl businessOwners = com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersSteps.createAPI();	

		businessOwners.loginIntoTheApplication("su", "gw");

		businessOwners.createClaim();

		businessOwners.searchPolicy(BusinessOwnersFeatures.Searchpolicy.builder().policyNo(policy).lossDate(DataFakers.currentDate()).build());

		businessOwners.enterBasicInformation(BusinessOwnersFeatures.BasicInfo.builder().lossDate(DataFakers.currentDate()).build());

		businessOwners.addClaimInformation(BusinessOwnersFeatures.ClaimInfo.builder().build());

		String claimNo = businessOwners.saveAndAssignClaim();

		Log.assertThat(claimNo != null,"Claim created successfully - "+claimNo,"Claim not created");

		return claimNo;
	}

}