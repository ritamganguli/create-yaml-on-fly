package com.aspire.guidewire.pc.pages.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class RatingWorkSheetPage extends LoadableComponent<RatingWorkSheetPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using ="div[id$='RatingWorksheetPopup-ttlBar']", AI = false)  
	public WebElement ttlRatingWorkSheetPage;

	@IFindBy(how = How.CSS, using = "div[id$='DownloadButton']", AI = false)
	public WebElement drpDownloadIcon;

	@IFindBy(how = How.CSS, using = "div[id$='DownloadHTMLMenuItem']", AI = false)
	public WebElement optnHTML;

	@IFindBy(how = How.CSS, using = "div[class$='children']", AI = false)
	public WebElement btnReturnToQuote;

	@IFindBy(how = How.CSS, using = "div[id$='WorksheetLV-1-0-expandCollapse--toggle']", AI = false)
	public WebElement btnBasePremiumToggle;

	@IFindBy(how = How.CSS, using = "div[id='RatingWorksheetPopup-WorksheetLV-1-0-2-OperandValue']", AI = false)
	public WebElement lblActualValueTerritoryCode;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:CoverageFIncreasedLimit']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblActualValueCoverageFlimit;

	@IFindBy(how = How.CSS, using = "div[id$='RatingWorksheetPopup-WorksheetLV-0-1-expandCollapse--toggle']", AI = false)
	public WebElement lblCoverageFlimitToggle;

	@IFindBy(how = How.CSS, using = "div[id='RatingWorksheetPopup-WorksheetLV-1-2-expandCollapse']", AI = false)
	public WebElement lblIDeductiblesToggle;

	@IFindBy(how = How.XPATH, using = "//div[text()='allPerilsDeductFactor']//ancestor::td//following-sibling::td[contains(@id,'Result_Cell')]", AI = false)
	public WebElement lblActualValueAllPerilsDeductFactor;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:FormFactor']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblActualValueFormFactor;

	@IFindBy(how = How.CSS, using = "div[id$='RatingWorksheetPopup-WorksheetLV-0-0-0-expandCollapse--toggle']", AI = false)
	public WebElement lblBuildingCoverageBasicGroup1;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:DeductibleFactor']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblDeductibleFactorActualValue;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:FireProtectClassFactor']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblFireProductionActualValue;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:UWCompanyFactor']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblUWcompanyActualValue;

	@IFindBy(how = How.XPATH, using = "//div[text()='Coverage.Limit']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblCoverageLimitActualValue;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Liability - Bodily Injury ')]//ancestor::div/preceding-sibling::div[contains(@id,'expandCollapse')]//child::div[contains(@id,'expandCollapse--toggle')]", AI = false)
	public WebElement lblLiablityBodilyToggle;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:CoverageFactor']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblCoverageFactorValue;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:VehicleTypeFactor']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblVehicleTypeFactorValue;

	@IFindBy(how = How.XPATH, using = "//div[text()='table:VehicleCostFactor']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblVehicleCostFactorValue;

	@IFindBy(how = How.XPATH, using = "//div[text()='PolicyLine.PAMultiCarDiscount']//ancestor::td//following-sibling::td[contains(@id,'OperandValue_Cell')]", AI = false)
	public WebElement lblMulticarDiscountValue;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Coverage E - Personal Liability')]", AI = false)
	public WebElement lblCoverageE;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Coverage F - Medical Payments')]", AI = false)
	public WebElement lblCoverageF;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Coverage D - Loss of Use')]", AI = false)
	public WebElement lblCoverageD;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Section I Deductibles')]", AI = false)
	public WebElement lblSectionIDeductible;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Liability - Bodily Injury and Property')]", AI = false)
	public WebElement lblLiablity;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Medical Payments')]", AI = false)
	public WebElement lblMedicalPayments;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Mexico Coverage')]", AI = false)
	public WebElement lblMexicoCoverage;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Uninsured Motorist - Bodily Injury ')]", AI = false)
	public WebElement lblUninuredMotoristBodilyInjury;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Uninsured Motorist - Property Damage')]", AI = false)
	public WebElement lblUninsuredMotoristPropertyDamage;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Building Coverage Basic Group I ')]", AI = false)
	public WebElement lblBuildingCoverage1;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Building Coverage Basic Group II ')]", AI = false)
	public WebElement  lblBuildingCoverage2;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Business Personal Property Coverage Basic Group I ')]", AI = false)
	public WebElement lblBusinessPersonalProperty1;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Business Personal Property Coverage Basic Group II ')]", AI = false)
	public WebElement lblBusinessPersonalProperty2;

	String coverages ="div[id$='containerLabel']";

	public RatingWorkSheetPage() {}

	public RatingWorkSheetPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlRatingWorkSheetPage))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * Click on Download Drop down options
	 * @author anitha.raphel
	 * @param driver
	 */
	public RatingWorkSheetPage clickDownloadDrpIcon(WebDriver driver)  {
		BrowserActions.click(driver, drpDownloadIcon,"drp Download Icon");
		return this;
	}

	/**
	 * Used to Click on Option HTML
	 * @author anitha.raphel
	 * @param driver
	 */
	public RatingWorkSheetPage clickOptionHTML(WebDriver driver)  {
		BrowserActions.click(driver, optnHTML,true,"Show Rating Worksheet");
		return this;
	}

	/**
	 * Used to Click on Return To Quote
	 * @author anitha.raphel
	 * @param driver
	 */
	public void clickReturnToQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnReturnToQuote,"Return To Quote");
	}
	
	public RatingWorkSheetPage verifyCoverageAreDisplay(WebDriver driver, String coverage1 , String coverage2, String coverage3 , String coverage4, String coverage5)  {
		List<WebElement> list = driver.findElements(By.cssSelector(coverages));//Coverage E - Personal Liability,Coverage F - Medical Payments To Others,Coverage D - Loss of Use, Section I Deductibles 
		List<String> l = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		for(int i = 0; i<list.size();i++) {
			l.add(list.get(i).getText().replaceAll("[0-9]", "").replace("(", "").replace(")","").replace("/","").replace("-","").stripLeading().stripTrailing());
		}
		
		l2.add(coverage1);
		l2.add(coverage2);
		l2.add(coverage3);
		l2.add(coverage4);
		l2.add(coverage5);
		System.out.println(l2);
		Log.assertThat(l.containsAll(l2), "All the coverages are displayed", "Coverages are not displayed");
		return this;
	}
	public RatingWorkSheetPage clickBasePremiumToggle(WebDriver driver)  {
		BrowserActions.click(driver, btnBasePremiumToggle,2,"BasePremium Toggle button");
		return this;
	}
	public RatingWorkSheetPage clickCoverageFToggle(WebDriver driver)  {
		BrowserActions.click(driver, lblCoverageFlimitToggle,2,"Coverage F Toggle Button");
		return this;
	}
	public RatingWorkSheetPage verifyState(WebDriver driver, String state)  {
		String text = BrowserActions.getText(driver, lblActualValueTerritoryCode,"Actual Territory Code");
		Log.assertThat(text.contains(state), "State is matching with Account", "State is not matching with Account");
		return this;
	}
	public RatingWorkSheetPage verifyCoverageFLimit(WebDriver driver, String limit)  {
		String text = BrowserActions.getText(driver, lblActualValueCoverageFlimit,"Coverage F limit");
		Log.assertThat(text.contains(limit), "Coverage Limit is same", "Coverage Limit is not same");
		return this;
	}
	public RatingWorkSheetPage clickIDeductiblesToggle(WebDriver driver)  {
		BrowserActions.click(driver, lblIDeductiblesToggle,"Deductible toggle");
		return this;
	}
	public RatingWorkSheetPage verifyAllPerilsDeductFactor(WebDriver driver, String value)  {
		String text = BrowserActions.getText(driver, lblActualValueAllPerilsDeductFactor,"All Perils Deduct Factor");
		Log.assertThat(text.equals(value), "AllPerilsDeduct Factor Actual value is Display as expeted", "AllPerilsDeduct Actual value is not Display as expeted");
		return this;
	}
	public RatingWorkSheetPage verifyActualValueFormFactor(WebDriver driver, String factorVal)  {
		String text = BrowserActions.getText(driver, lblActualValueFormFactor,"Form Factor Value");
		Log.assertThat(text.equals(factorVal), "FormFactor Actual value is Display as expected", "FormFactor Actual value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage clickBuildingCoverageBasicGroup1Toggle(WebDriver driver)  {
		BrowserActions.click(driver, lblBuildingCoverageBasicGroup1,2,"Building CoverageBasic Group1 Toggle");
		return this;
	}

	public void verifyIsFileDownloaded(WebDriver driver,String fileName) throws InterruptedException {

		EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
		String env = configProperty.getProperty("runDesktop");

		if (env.equals("false")) {

			((JavascriptExecutor) driver).executeScript("lambda-file-exists=" + fileName + "html");
		}

		//For local Upload
		else {
			String downloadPath = "C:/Users/" + System.getProperty("user.name") + "/Downloads/";
			File dir = new File(downloadPath);
			File[] dirContents = dir.listFiles();

			for (int i = 0; i < 3; i++) {
				if (dirContents[i].getName().contains(fileName)) {
					// File has been found, it can now be deleted:
					Log.message("File Downloaded successfully in Local Downloads");
					boolean deleted = dirContents[i].delete();
					Log.assertThat(deleted, "File deleted successfully from Local Downloads", "Failed to delete the file from Local Downloads");
					break; 
				}
			}
		}
	}

	public RatingWorkSheetPage verifyDeductibleFactorActualValue(WebDriver driver, String factorVal)  {
		String text = BrowserActions.getText(driver, lblDeductibleFactorActualValue,"Deductible Factor Actual Value");
		Log.assertThat(text.contains(factorVal), "Deductible Factor Actual Value is Display as expected", "Deductible Factor Actual Value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage verifyFireProductionActualValue(WebDriver driver, String fireProductionVal)  {
		String text = BrowserActions.getText(driver, lblFireProductionActualValue,"Fire Production Actual Value");
		Log.assertThat(text.equals(fireProductionVal), "Fire Production value is Display as expected", "Fire Production value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage verifyUWcompanyActualValue(WebDriver driver, String value)  {
		String text = BrowserActions.getText(driver, lblUWcompanyActualValue,"UWcompany Actual Value");
		Log.assertThat(text.equals(value), "UW company Actual value is Display as expected", "UW company Actual value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage verifyCoverageLimitActualValue(WebDriver driver, String limit)  {
		String text = BrowserActions.getText(driver, lblCoverageLimitActualValue,"Coverage Limit Actual Value");
		Log.assertThat(text.equals(limit), "Coverage Limit Actual Value is Display as expected", "Coverage Limit Actual is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage clickLiablityBodilyToggle(WebDriver driver)  {
		BrowserActions.click(driver, lblLiablityBodilyToggle,2,"Liablity Bodily Toggle");
		return this;
	}
	public RatingWorkSheetPage verifyCoverageFactorValue(WebDriver driver, String coverageFactorValue)  {
		String text = BrowserActions.getText(driver, lblCoverageFactorValue,"Coverage Factor Value");
		Log.assertThat(text.equals(coverageFactorValue), "Coverage Factor Actual Value is Display as expected", "Coverage Factor Actual Value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage verifyVehicleTypeValue(WebDriver driver, String vehicleTypeValue)  {
		String text = BrowserActions.getText(driver, lblVehicleTypeFactorValue,"VehicleType Factor Value");
		Log.assertThat(text.contains(vehicleTypeValue), "Vehicle Type Factor Actual Value is Display as expected", "Vehicle Type Factor Actual Value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage verifyVehicleCostFactorValue(WebDriver driver, String vehicleCostValue)  {
		String text = BrowserActions.getText(driver, lblVehicleCostFactorValue,"Vehicle Cost Factor Value");
		Log.assertThat(text.equals(vehicleCostValue), "vehicle Cost Value is Display as expected", "vehicle Cost Value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage verifyMulticarDiscountValue(WebDriver driver, String vehicleCostValue)  {
		String text = BrowserActions.getText(driver, lblMulticarDiscountValue,"Multicar Discount  Value");
		Log.assertThat(text.equals(vehicleCostValue), "Multicar Discount  Value is Display as expected", "Multicar Discount  Value is not Display as expected");
		return this;
	}
	public RatingWorkSheetPage verifyCoveragesE(WebDriver driver, String coverage ,String effectiveDate , String expirationDate )  {
		String text = BrowserActions.getText(driver, lblCoverageE,"Cooverage");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Coverage E is Present", "Coverage E is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyCoveragesF(WebDriver driver, String coverage,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblCoverageF,"Cooverage");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Coverage F is Present", "Coverage F is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyCoveragesD(WebDriver driver, String coverage ,String effectiveDate , String expirationDate )  {
		String text = BrowserActions.getText(driver, lblCoverageD,"Cooverage");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Coverage D is Present", "Coverage D is not Present");
		return this;
	}
	public RatingWorkSheetPage verifySectionIDeductible(WebDriver driver, String coverage , String effectiveDate , String expirationDate )  {
		String text = BrowserActions.getText(driver, lblSectionIDeductible,"Cooverage");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Coverage SectionIDeductible is Present", "Coverage SectionIDeductible is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyBuildingCoverage1(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblBuildingCoverage1,"Building Coverage1");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Building Coverage1 is Present", "Building Coverage1 is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyBuildingCoverage2(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblBuildingCoverage2,"Building Covergae 2");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Building Coverage2 is Present", "Building Coverage2 is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyBusinessPersonalProperty1(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblBusinessPersonalProperty1,"Business Personal Property1");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Coverage MedicalPayments is Present", "Coverage SectionIDeductible is not Present");
		return this;
	}

	public RatingWorkSheetPage verifyBusinessPersonalProperty2(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblBusinessPersonalProperty2,"Business Personal Property2");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Business PersonalProperty 2 is Present", "Business Personal Property2 is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyBodilyInjuryandPropertyDamage(WebDriver driver, String coverage, String effectiveDate , String expirationDate )  {
		String text = BrowserActions.getText(driver, lblLiablity,"Liablity Coverage");
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Bodily Injury and Property Damage is Present", "Bodily Injury and Property Damage is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyMedicalPayments(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblMedicalPayments,"Medical Payments");
		System.out.println(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"));
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Coverage MedicalPayments is Present", "Coverage MedicalPayments is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyMexicoCoverage(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblMexicoCoverage,"Mexico Coverage Payments");
		System.out.println(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"));
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Mexico Coverage is Present", "Mexico Coverage is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyUninsuredMotoristPropertyDamage(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblUninsuredMotoristPropertyDamage,"Uninsured Motorist Property Damage");
		System.out.println(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"));
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Uninsured Motorist Property Damage Coverage is Present", "Uninsured Motorist Property Damage Coverage is not Present");
		return this;
	}
	public RatingWorkSheetPage verifyUninuredMotoristBodilyInjury(WebDriver driver, String coverage ,String effectiveDate , String expirationDate  )  {
		String text = BrowserActions.getText(driver, lblUninuredMotoristBodilyInjury,"Uninured Motorist Bodily Injury");
		System.out.println(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"));
		Log.assertThat(text.equals(coverage+" ("+effectiveDate+" - "+expirationDate+")"), "Uninured Motorist Bodily Injury Coverage is Present", "Uninured Motorist Bodily Injury Coverage is not Present");
		return this;
	}
}