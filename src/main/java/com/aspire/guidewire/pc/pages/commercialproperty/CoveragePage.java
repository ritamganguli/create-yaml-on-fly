package com.aspire.guidewire.pc.pages.commercialproperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class CoveragePage extends LoadableComponent<CoveragePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	
	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmType']", AI = false)
	public WebElement drpAlarmType;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdatePlumbing']", AI = false)
	public WebElement inpYearofLastUpdatePlumbing;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact-0-acctContact>div[role='button']", AI = false)
	public WebElement btnLennySchuppe;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddFromSearch>div[role='button']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-DetailsDV-ClassDescription textarea", AI = false)
	public WebElement inpPropertyClassDescription;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-PercentVacant']", AI = false)
	public WebElement drpVacant;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-YearBuilt']", AI = false)
	public WebElement inpYearBuilt;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpMonthlyLimit;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-NumBasements']", AI = false)
	public WebElement inpOfBasements;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-ClassCode']", AI = false)
	public WebElement inpPropertyClassCode;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovValuationMethod']", AI = false)
	public WebElement drpValuationMethod;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-BuildingCoveragesTab", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovCoinsurance']", AI = false)
	public WebElement drpCoinsurance;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdateWiring']", AI = false)
	public WebElement inpYearofLastUpdateWiring;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPValuationMethod']", AI = false)
	public WebElement drpValuationMethod_7;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-1-ContactType>div[role='button']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovAutoIncrease']", AI = false)
	public WebElement drpAutoIncrease;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-BurglarySafeguard']", AI = false)
	public WebElement drpBurglarySafeguard;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeVandalism']", AI = false)
	public WebElement rdbExcludeVandalism;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-BuildingNumber']", AI = false)
	public WebElement inpBuildingNumber;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-RearExposure']", AI = false)
	public WebElement inpRearExposure;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LeftExposure']", AI = false)
	public WebElement inpLeftExposure;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-BuildingLocation']", AI = false)
	public WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdateHeating']", AI = false)
	public WebElement inpYearofLastUpdateHeating;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovLimit-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpLimit;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovCauseOfLoss']", AI = false)
	public WebElement drpCauseOfLoss;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovDeductible']", AI = false)
	public WebElement drpDeductible;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-BuildingAddlInterestTab", AI = false)
	public WebElement btnAdditionalInterest;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact>div[role='button']", AI = false)
	public WebElement btnOtherContacts;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovExcludeVandalism']", AI = false)
	public WebElement rdbExcludeVandalism_3;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkExtraExpenseCoverage;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-PercentSprinklered']", AI = false)
	public WebElement drpSprinklered;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmClass']", AI = false)
	public WebElement drpAlarmClass;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovExcludeTheft']", AI = false)
	public WebElement rdbCPBPPCovExcludeTheft;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-RentedOthers']", AI = false)
	public WebElement drpRentedToOthers;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeSprinkler']", AI = false)
	public WebElement rdbExcludeSprinkler;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeTheft']", AI = false)
	public WebElement rdbCPBldgCovExcludeTheft;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovLimit-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpLimit_1;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmExpiration']", AI = false)
	public WebElement inpAlarmExpiration;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-TotalArea']", AI = false)
	public WebElement inpTotalAreaexclbasement;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpLimit_9;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-WindRating']", AI = false)
	public WebElement drpWindRating;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovReportingForm']", AI = false)
	public WebElement drpReportingForm;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovDeductible']", AI = false)
	public WebElement drpDeductible_5;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovWindDeductible']", AI = false)
	public WebElement drpWindDeductible_6;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-BasementArea']", AI = false)
	public WebElement inpBasementArea;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmGrade']", AI = false)
	public WebElement drpAlarmGrade;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-Update>div[role='button']", AI = false)
	public WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-DetailsDV-ClassCode-SelectClassCode", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-InterestType']", AI = false)
	public WebElement drpInterestType;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-HeatingBoilerElsewhere']", AI = false)
	public WebElement rdbBoilerInsuredElsewhere;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-ConstructionType']", AI = false)
	public WebElement drpConstructionType;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovExcludeSprinkler']", AI = false)
	public WebElement rdbExcludeSprinkler_4;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-BuildingDetailsTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovWindDeductible']", AI = false)
	public WebElement drpWindDeductible;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-__crumb__", AI = false)
	public WebElement btnReturntoBuildingsandLocations;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdateRoofing']", AI = false)
	public WebElement inpYearofLastUpdateRoofing;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovCauseOfLoss']", AI = false)
	public WebElement drpCauseOfLoss_2;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-CoverageForm']", AI = false)
	public WebElement drpCoverageForm;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-HeatingBoilerOnPremises']", AI = false)
	public WebElement rdbBoileronPremises;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-NumStories']", AI = false)
	public WebElement inpOfStories;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmCertificate']", AI = false)
	public WebElement inpAlarmCertificate;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-0-ContactType>div[role='button']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-EditPolicyButton>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-_checkbox']", AI = false)
	public WebElement chkHasAlarm;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-RoofType']", AI = false)
	public WebElement drpRoofType;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovCoinsurance']", AI = false)
	public WebElement drpCoinsurance_8;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkBuildingCoverage;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmExpiration_dateIcon", AI = false)
	public WebElement btnAlarmExpirationDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-RightExposure']", AI = false)
	public WebElement inpRightExposure;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-RateType']", AI = false)
	public WebElement drpRateType;

	@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddExistingContact>div[role='button']", AI = false)
	public WebElement btnExistingAdditionalInterest;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-FrontExposure']", AI = false)
	public WebElement inpFrontExposure;

	public CoveragePage(){
	}

	public CoveragePage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public CoveragePage selectAlarmType(WebDriver driver,String AlarmType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAlarmType,AlarmType,"AlarmType");
		return this;
	}
	public CoveragePage enterYearofLastUpdatePlumbing(WebDriver driver,String YearofLastUpdatePlumbing) {
		BrowserActions.type(driver, inpYearofLastUpdatePlumbing,YearofLastUpdatePlumbing, "YearofLastUpdatePlumbing");
		return this;
	}
	public CoveragePage clickLennySchuppe(WebDriver driver)  {
		BrowserActions.click(driver, btnLennySchuppe,"LennySchuppe");
		return this;
	}
	public CoveragePage clickFromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
		return this;
	}
	public CoveragePage enterPropertyClassDescription(WebDriver driver,String PropertyClassDescription) {
		BrowserActions.type(driver, inpPropertyClassDescription,PropertyClassDescription, "PropertyClassDescription");
		return this;
	}
	public CoveragePage selectVacant(WebDriver driver,String Vacant)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpVacant,Vacant,"Vacant");
		return this;
	}
	public CoveragePage enterYearBuilt(WebDriver driver,String YearBuilt) {
		BrowserActions.type(driver, inpYearBuilt,YearBuilt, "YearBuilt");
		return this;
	}
	public CoveragePage selectMonthlyLimit(WebDriver driver,String MonthlyLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMonthlyLimit,MonthlyLimit,"MonthlyLimit");
		return this;
	}
	public CoveragePage enterOfBasements(WebDriver driver,String OfBasements) {
		BrowserActions.type(driver, inpOfBasements,OfBasements, "OfBasements");
		return this;
	}
	public CoveragePage enterPropertyClassCode(WebDriver driver,String PropertyClassCode) {
		BrowserActions.type(driver, inpPropertyClassCode,PropertyClassCode, "PropertyClassCode");
		return this;
	}
	public CoveragePage selectValuationMethod(WebDriver driver,String ValuationMethod)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpValuationMethod,ValuationMethod,"ValuationMethod");
		return this;
	}
	public CoveragePage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public CoveragePage selectCoinsurance(WebDriver driver,String Coinsurance)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance,Coinsurance,"Coinsurance");
		return this;
	}
	public CoveragePage enterYearofLastUpdateWiring(WebDriver driver,String YearofLastUpdateWiring) {
		BrowserActions.type(driver, inpYearofLastUpdateWiring,YearofLastUpdateWiring, "YearofLastUpdateWiring");
		return this;
	}
	public CoveragePage selectValuationMethod_7(WebDriver driver,String ValuationMethod_7)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpValuationMethod_7,ValuationMethod_7,"ValuationMethod_7");
		return this;
	}
	public CoveragePage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public CoveragePage selectAutoIncrease(WebDriver driver,String AutoIncrease)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAutoIncrease,AutoIncrease,"AutoIncrease");
		return this;
	}
	public CoveragePage selectBurglarySafeguard(WebDriver driver,String BurglarySafeguard)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBurglarySafeguard,BurglarySafeguard,"BurglarySafeguard");
		return this;
	}
	public CoveragePage clickExcludeVandalism(WebDriver driver)  {
		BrowserActions.click(driver, rdbExcludeVandalism,"ExcludeVandalism");
		return this;
	}
	public CoveragePage enterBuildingNumber(WebDriver driver,String BuildingNumber) {
		BrowserActions.type(driver, inpBuildingNumber,BuildingNumber, "BuildingNumber");
		return this;
	}
	public CoveragePage enterRearExposure(WebDriver driver,String RearExposure) {
		BrowserActions.type(driver, inpRearExposure,RearExposure, "RearExposure");
		return this;
	}
	public CoveragePage enterLeftExposure(WebDriver driver,String LeftExposure) {
		BrowserActions.type(driver, inpLeftExposure,LeftExposure, "LeftExposure");
		return this;
	}
	public CoveragePage selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public CoveragePage enterYearofLastUpdateHeating(WebDriver driver,String YearofLastUpdateHeating) {
		BrowserActions.type(driver, inpYearofLastUpdateHeating,YearofLastUpdateHeating, "YearofLastUpdateHeating");
		return this;
	}
	public CoveragePage enterLimit(WebDriver driver,String Limit) {
		BrowserActions.type(driver, inpLimit,Limit, "Limit");
		return this;
	}
	public CoveragePage selectCauseOfLoss(WebDriver driver,String CauseOfLoss)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCauseOfLoss,CauseOfLoss,"CauseOfLoss");
		return this;
	}
	public CoveragePage selectDeductible(WebDriver driver,String Deductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductible,Deductible,"Deductible");
		return this;
	}
	public CoveragePage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public CoveragePage clickAdditionalInterest(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalInterest,"AdditionalInterest");
		return this;
	}
	public CoveragePage clickOtherContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
		return this;
	}
	public CoveragePage clickExcludeVandalism_3(WebDriver driver)  {
		BrowserActions.click(driver, rdbExcludeVandalism_3,"ExcludeVandalism_3");
		return this;
	}
	public CoveragePage clickExtraExpenseCoverage(WebDriver driver)  {
		BrowserActions.click(driver, chkExtraExpenseCoverage,"ExtraExpenseCoverage");
		return this;
	}
	public CoveragePage selectSprinklered(WebDriver driver,String Sprinklered)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSprinklered,Sprinklered,"Sprinklered");
		return this;
	}
	public CoveragePage selectAlarmClass(WebDriver driver,String AlarmClass)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAlarmClass,AlarmClass,"AlarmClass");
		return this;
	}
	public CoveragePage clickCPBPPCovExcludeTheft(WebDriver driver)  {
		BrowserActions.click(driver, rdbCPBPPCovExcludeTheft,"CPBPPCovExcludeTheft");
		return this;
	}
	public CoveragePage click_checkbox(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox,"_checkbox");
		return this;
	}
	public CoveragePage selectRentedToOthers(WebDriver driver,String RentedToOthers)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRentedToOthers,RentedToOthers,"RentedToOthers");
		return this;
	}
	public CoveragePage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public CoveragePage clickExcludeSprinkler(WebDriver driver)  {
		BrowserActions.click(driver, rdbExcludeSprinkler,"ExcludeSprinkler");
		return this;
	}
	public CoveragePage clickCPBldgCovExcludeTheft(WebDriver driver)  {
		BrowserActions.click(driver, rdbCPBldgCovExcludeTheft,"CPBldgCovExcludeTheft");
		return this;
	}
	public CoveragePage enterLimit_1(WebDriver driver,String Limit_1) {
		BrowserActions.type(driver, inpLimit_1,Limit_1, "Limit_1");
		return this;
	}
	public CoveragePage enterAlarmExpiration(WebDriver driver,String AlarmExpiration) {
		BrowserActions.type(driver, inpAlarmExpiration,AlarmExpiration, "AlarmExpiration");
		return this;
	}
	public CoveragePage enterTotalAreaexclbasement(WebDriver driver,String TotalAreaexclbasement) {
		BrowserActions.type(driver, inpTotalAreaexclbasement,TotalAreaexclbasement, "TotalAreaexclbasement");
		return this;
	}
	public CoveragePage enterLimit_9(WebDriver driver,String Limit_9) {
		BrowserActions.type(driver, inpLimit_9,Limit_9, "Limit_9");
		return this;
	}
	public CoveragePage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public CoveragePage selectWindRating(WebDriver driver,String WindRating)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWindRating,WindRating,"WindRating");
		return this;
	}
	public CoveragePage selectReportingForm(WebDriver driver,String ReportingForm)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReportingForm,ReportingForm,"ReportingForm");
		return this;
	}
	public CoveragePage selectDeductible_5(WebDriver driver,String Deductible_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductible_5,Deductible_5,"Deductible_5");
		return this;
	}
	public CoveragePage selectWindDeductible_6(WebDriver driver,String WindDeductible_6)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWindDeductible_6,WindDeductible_6,"WindDeductible_6");
		return this;
	}
	public CoveragePage enterBasementArea(WebDriver driver,String BasementArea) {
		BrowserActions.type(driver, inpBasementArea,BasementArea, "BasementArea");
		return this;
	}
	public CoveragePage selectAlarmGrade(WebDriver driver,String AlarmGrade)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAlarmGrade,AlarmGrade,"AlarmGrade");
		return this;
	}
	public CoveragePage clickOK(WebDriver driver)  {
		BrowserActions.click(driver, btnOK,"OK");
		return this;
	}
	public CoveragePage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public CoveragePage selectInterestType(WebDriver driver,String InterestType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpInterestType,InterestType,"InterestType");
		return this;
	}
	public CoveragePage clickBoilerInsuredElsewhere(WebDriver driver)  {
		BrowserActions.click(driver, rdbBoilerInsuredElsewhere,"BoilerInsuredElsewhere");
		return this;
	}
	public CoveragePage selectConstructionType(WebDriver driver,String ConstructionType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpConstructionType,ConstructionType,"ConstructionType");
		return this;
	}
	public CoveragePage clickExcludeSprinkler_4(WebDriver driver)  {
		BrowserActions.click(driver, rdbExcludeSprinkler_4,"ExcludeSprinkler_4");
		return this;
	}
	public CoveragePage clickDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails,"Details");
		return this;
	}
	public CoveragePage selectWindDeductible(WebDriver driver,String WindDeductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWindDeductible,WindDeductible,"WindDeductible");
		return this;
	}
	public CoveragePage clickReturntoBuildingsandLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoBuildingsandLocations,"ReturntoBuildingsandLocations");
		return this;
	}
	public CoveragePage enterYearofLastUpdateRoofing(WebDriver driver,String YearofLastUpdateRoofing) {
		BrowserActions.type(driver, inpYearofLastUpdateRoofing,YearofLastUpdateRoofing, "YearofLastUpdateRoofing");
		return this;
	}
	public CoveragePage selectCauseOfLoss_2(WebDriver driver,String CauseOfLoss_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCauseOfLoss_2,CauseOfLoss_2,"CauseOfLoss_2");
		return this;
	}
	public CoveragePage selectCoverageForm(WebDriver driver,String CoverageForm)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageForm,CoverageForm,"CoverageForm");
		return this;
	}
	public CoveragePage clickBoileronPremises(WebDriver driver)  {
		BrowserActions.click(driver, rdbBoileronPremises,"BoileronPremises");
		return this;
	}
	public CoveragePage enterOfStories(WebDriver driver,String OfStories) {
		BrowserActions.type(driver, inpOfStories,OfStories, "OfStories");
		return this;
	}
	public CoveragePage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public CoveragePage enterAlarmCertificate(WebDriver driver,String AlarmCertificate) {
		BrowserActions.type(driver, inpAlarmCertificate,AlarmCertificate, "AlarmCertificate");
		return this;
	}
	public CoveragePage clickNewCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany,"NewCompany");
		return this;
	}
	public CoveragePage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public CoveragePage clickHasAlarm(WebDriver driver)  {
		BrowserActions.click(driver, chkHasAlarm,"HasAlarm");
		return this;
	}
	public CoveragePage selectRoofType(WebDriver driver,String RoofType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRoofType,RoofType,"RoofType");
		return this;
	}
	public CoveragePage selectCoinsurance_8(WebDriver driver,String Coinsurance_8)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance_8,Coinsurance_8,"Coinsurance_8");
		return this;
	}
	public CoveragePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CoveragePage clickBuildingCoverage(WebDriver driver)  {
		BrowserActions.click(driver, chkBuildingCoverage,"BuildingCoverage");
		return this;
	}
	public CoveragePage clickAlarmExpirationDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAlarmExpirationDateIcon,"AlarmExpirationDateIcon");
		return this;
	}
	public CoveragePage enterRightExposure(WebDriver driver,String RightExposure) {
		BrowserActions.type(driver, inpRightExposure,RightExposure, "RightExposure");
		return this;
	}
	public CoveragePage enterCoveragesin(WebDriver driver,String Coveragesin) {
		BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
		return this;
	}
	public CoveragePage selectRateType(WebDriver driver,String RateType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRateType,RateType,"RateType");
		return this;
	}
	public CoveragePage clickExistingAdditionalInterest(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingAdditionalInterest,"ExistingAdditionalInterest");
		return this;
	}
	public CoveragePage enterFrontExposure(WebDriver driver,String FrontExposure) {
		BrowserActions.type(driver, inpFrontExposure,FrontExposure, "FrontExposure");
		return this;
	}

	public class SearchCoveragesPage extends LoadableComponent<SearchCoveragesPage> {

		WebDriver driver;
		public boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		//	public TopNavBar topnavbar;
		@IFindBy(how = How.CSS, using = "select[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-CoverageCategory']", AI = false)
		public WebElement drpCategory;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton>div[role='button']", AI = false)
		public WebElement btnAddSelectedCoverages;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-__crumb__", AI = false)
		public WebElement btnReturntoNewBuilding;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-Keyword']", AI = false)
		public WebElement inpKeyword;

		public SearchCoveragesPage(){
		}

		public SearchCoveragesPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
			PageFactory.initElements(finder, this);
		}
		@Override
		protected void load() {
			isPageLoaded = true;
			WaitUtils.waitForPageLoad(driver);
		}@Override
		protected void isLoaded() {
			if (!isPageLoaded) {
				Assert.fail();
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public SearchCoveragesPage selectCategory(WebDriver driver,String Category)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
			return this;
		}
		public SearchCoveragesPage clickAddSelectedCoverages(WebDriver driver)  {
			BrowserActions.click(driver, btnAddSelectedCoverages,"AddSelectedCoverages");
			return this;
		}
		public SearchCoveragesPage clickReturntoNewBuilding(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoNewBuilding,"ReturntoNewBuilding");
			return this;
		}
		public SearchCoveragesPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public SearchCoveragesPage clickReset(WebDriver driver)  {
			BrowserActions.click(driver, btnReset,"Reset");
			return this;
		}
		public SearchCoveragesPage enterKeyword(WebDriver driver,String Keyword) {
			BrowserActions.type(driver, inpKeyword,Keyword, "Keyword");
			return this;
		}
	}

	public class ClassCodeSearchPage extends LoadableComponent<ClassCodeSearchPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		//	public TopNavBar topnavbar;
		//	public CPClassCodeSearchPopup cpclasscodesearchpopupTable;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-1-Code']", AI = false)
		public WebElement inpCode_3;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-10-Code']", AI = false)
		public WebElement inpCode_21;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-2-Code']", AI = false)
		public WebElement inpCode_5;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-0-Code']", AI = false)
		public WebElement inpCode_1;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-14-Code']", AI = false)
		public WebElement inpCode_29;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-13-Code']", AI = false)
		public WebElement inpCode_27;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-12-Code']", AI = false)
		public WebElement inpCode_25;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-11-Code']", AI = false)
		public WebElement inpCode_23;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-CPClassCodeSearchDV-Code']", AI = false)
		public WebElement inpCode;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-14-Classification']", AI = false)
		public WebElement inpClassification_30;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-3-Code']", AI = false)
		public WebElement inpCode_7;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-4-Code']", AI = false)
		public WebElement inpCode_9;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-5-Code']", AI = false)
		public WebElement inpCode_11;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-9-Code']", AI = false)
		public WebElement inpCode_19;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-13-Classification']", AI = false)
		public WebElement inpClassification_28;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-8-Code']", AI = false)
		public WebElement inpCode_17;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-7-Code']", AI = false)
		public WebElement inpCode_15;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-11-Classification']", AI = false)
		public WebElement inpClassification_24;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-6-Code']", AI = false)
		public WebElement inpCode_13;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-12-Classification']", AI = false)
		public WebElement inpClassification_26;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-9-Classification']", AI = false)
		public WebElement inpClassification_20;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-10-Classification']", AI = false)
		public WebElement inpClassification_22;

		@IFindBy(how = How.CSS, using = "#CPClassCodeSearchPopup-__crumb__", AI = false)
		public WebElement btnReturntoNewBuilding;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-1-Classification']", AI = false)
		public WebElement inpClassification_4;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-0-Classification']", AI = false)
		public WebElement inpClassification_2;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-3-Classification']", AI = false)
		public WebElement inpClassification_8;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-2-Classification']", AI = false)
		public WebElement inpClassification_6;

		@IFindBy(how = How.CSS, using = "#CPClassCodeSearchPopup-CPClassCodeSearchScreen-CPClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "#CPClassCodeSearchPopup-CPClassCodeSearchScreen-CPClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.CSS, using = "#CPClassCodeSearchPopup-CPClassCodeSearchScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-8-Classification']", AI = false)
		public WebElement inpClassification_18;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-6-Classification']", AI = false)
		public WebElement inpClassification_14;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-7-Classification']", AI = false)
		public WebElement inpClassification_16;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-4-Classification']", AI = false)
		public WebElement inpClassification_10;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-5-Classification']", AI = false)
		public WebElement inpClassification_12;

		@IFindBy(how = How.CSS, using = "input[name='CPClassCodeSearchPopup-CPClassCodeSearchScreen-CPClassCodeSearchDV-Classification']", AI = false)
		public WebElement inpClassification;

		public ClassCodeSearchPage(){
		}

		public ClassCodeSearchPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
			PageFactory.initElements(finder, this);
			//		cpclasscodesearchpopupTable = new CPClassCodeSearchPopup();
		}
		@Override
		protected void load() {
			isPageLoaded = true;
			WaitUtils.waitForPageLoad(driver);
		}@Override
		protected void isLoaded() {
			if (!isPageLoaded) {
				Assert.fail();
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public ClassCodeSearchPage enterCode_3(WebDriver driver,String Code_3) {
			BrowserActions.type(driver, inpCode_3,Code_3, "Code_3");
			return this;
		}
		public ClassCodeSearchPage enterCode_21(WebDriver driver,String Code_21) {
			BrowserActions.type(driver, inpCode_21,Code_21, "Code_21");
			return this;
		}
		public ClassCodeSearchPage enterCode_5(WebDriver driver,String Code_5) {
			BrowserActions.type(driver, inpCode_5,Code_5, "Code_5");
			return this;
		}
		public ClassCodeSearchPage enterCode_1(WebDriver driver,String Code_1) {
			BrowserActions.type(driver, inpCode_1,Code_1, "Code_1");
			return this;
		}
		public ClassCodeSearchPage enterCode_29(WebDriver driver,String Code_29) {
			BrowserActions.type(driver, inpCode_29,Code_29, "Code_29");
			return this;
		}
		public ClassCodeSearchPage enterCode_27(WebDriver driver,String Code_27) {
			BrowserActions.type(driver, inpCode_27,Code_27, "Code_27");
			return this;
		}
		public ClassCodeSearchPage enterCode_25(WebDriver driver,String Code_25) {
			BrowserActions.type(driver, inpCode_25,Code_25, "Code_25");
			return this;
		}
		public ClassCodeSearchPage enterCode_23(WebDriver driver,String Code_23) {
			BrowserActions.type(driver, inpCode_23,Code_23, "Code_23");
			return this;
		}
		public ClassCodeSearchPage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public ClassCodeSearchPage enterClassification_30(WebDriver driver,String Classification_30) {
			BrowserActions.type(driver, inpClassification_30,Classification_30, "Classification_30");
			return this;
		}
		public ClassCodeSearchPage enterCode_7(WebDriver driver,String Code_7) {
			BrowserActions.type(driver, inpCode_7,Code_7, "Code_7");
			return this;
		}
		public ClassCodeSearchPage enterCode_9(WebDriver driver,String Code_9) {
			BrowserActions.type(driver, inpCode_9,Code_9, "Code_9");
			return this;
		}
		public ClassCodeSearchPage enterCode_11(WebDriver driver,String Code_11) {
			BrowserActions.type(driver, inpCode_11,Code_11, "Code_11");
			return this;
		}
		public ClassCodeSearchPage enterCode_19(WebDriver driver,String Code_19) {
			BrowserActions.type(driver, inpCode_19,Code_19, "Code_19");
			return this;
		}
		public ClassCodeSearchPage enterClassification_28(WebDriver driver,String Classification_28) {
			BrowserActions.type(driver, inpClassification_28,Classification_28, "Classification_28");
			return this;
		}
		public ClassCodeSearchPage enterCode_17(WebDriver driver,String Code_17) {
			BrowserActions.type(driver, inpCode_17,Code_17, "Code_17");
			return this;
		}
		public ClassCodeSearchPage enterCode_15(WebDriver driver,String Code_15) {
			BrowserActions.type(driver, inpCode_15,Code_15, "Code_15");
			return this;
		}
		public ClassCodeSearchPage enterClassification_24(WebDriver driver,String Classification_24) {
			BrowserActions.type(driver, inpClassification_24,Classification_24, "Classification_24");
			return this;
		}
		public ClassCodeSearchPage enterCode_13(WebDriver driver,String Code_13) {
			BrowserActions.type(driver, inpCode_13,Code_13, "Code_13");
			return this;
		}
		public ClassCodeSearchPage enterClassification_26(WebDriver driver,String Classification_26) {
			BrowserActions.type(driver, inpClassification_26,Classification_26, "Classification_26");
			return this;
		}
		public ClassCodeSearchPage enterClassification_20(WebDriver driver,String Classification_20) {
			BrowserActions.type(driver, inpClassification_20,Classification_20, "Classification_20");
			return this;
		}
		public ClassCodeSearchPage enterClassification_22(WebDriver driver,String Classification_22) {
			BrowserActions.type(driver, inpClassification_22,Classification_22, "Classification_22");
			return this;
		}
		public ClassCodeSearchPage clickReturntoNewBuilding(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoNewBuilding,"ReturntoNewBuilding");
			return this;
		}
		public ClassCodeSearchPage enterClassification_4(WebDriver driver,String Classification_4) {
			BrowserActions.type(driver, inpClassification_4,Classification_4, "Classification_4");
			return this;
		}
		public ClassCodeSearchPage enterClassification_2(WebDriver driver,String Classification_2) {
			BrowserActions.type(driver, inpClassification_2,Classification_2, "Classification_2");
			return this;
		}
		public ClassCodeSearchPage enterClassification_8(WebDriver driver,String Classification_8) {
			BrowserActions.type(driver, inpClassification_8,Classification_8, "Classification_8");
			return this;
		}
		public ClassCodeSearchPage enterClassification_6(WebDriver driver,String Classification_6) {
			BrowserActions.type(driver, inpClassification_6,Classification_6, "Classification_6");
			return this;
		}
		public ClassCodeSearchPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public ClassCodeSearchPage clickReset(WebDriver driver)  {
			BrowserActions.click(driver, btnReset,"Reset");
			return this;
		}
		public ClassCodeSearchPage enterClassification_18(WebDriver driver,String Classification_18) {
			BrowserActions.type(driver, inpClassification_18,Classification_18, "Classification_18");
			return this;
		}
		public ClassCodeSearchPage enterClassification_14(WebDriver driver,String Classification_14) {
			BrowserActions.type(driver, inpClassification_14,Classification_14, "Classification_14");
			return this;
		}
		public ClassCodeSearchPage enterClassification_16(WebDriver driver,String Classification_16) {
			BrowserActions.type(driver, inpClassification_16,Classification_16, "Classification_16");
			return this;
		}
		public ClassCodeSearchPage enterClassification_10(WebDriver driver,String Classification_10) {
			BrowserActions.type(driver, inpClassification_10,Classification_10, "Classification_10");
			return this;
		}
		public ClassCodeSearchPage enterClassification_12(WebDriver driver,String Classification_12) {
			BrowserActions.type(driver, inpClassification_12,Classification_12, "Classification_12");
			return this;
		}
		public ClassCodeSearchPage enterClassification(WebDriver driver,String Classification) {
			BrowserActions.type(driver, inpClassification,Classification, "Classification");
			return this;
		}
	}
}
