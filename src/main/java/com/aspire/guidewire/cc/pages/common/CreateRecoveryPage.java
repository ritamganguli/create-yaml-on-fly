package com.aspire.guidewire.cc.pages.common;

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

public class CreateRecoveryPage extends LoadableComponent<CreateRecoveryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	//public EditableRecoveryLineItems editablerecoverylineitemsTable;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails_15;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany_7;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-TransactionExchangeRateInputSet-Transaction_RateSet_Date_dateIcon", AI = false)
	public WebElement btnExchangeRateEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-EditableRecoveryLineItemsLV-0-LineCategory']", AI = false)
	public WebElement drpCategory;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-ReserveLineInputSet-ReservingCurrency']", AI = false)
	public WebElement drpReservingCurrency;

	@IFindBy(how = How.CSS, using = "input[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-TransactionExchangeRateInputSet-Transaction_RateSet_Date']", AI = false)
	public WebElement inpExchangeRateEffectiveDate;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-ReserveLineInputSet-Matter']", AI = false)
	public WebElement drpMatter;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop_3;

	@IFindBy(how = How.CSS, using = "input[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-EditableRecoveryLineItemsLV-0-Comments']", AI = false)
	public WebElement inpComments_16;

	@IFindBy(how = How.CSS, using = "input[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-TransactionExchangeRateInputSet-Transaction_ExchangeRate']", AI = false)
	public WebElement inpExchangeRate;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany_8;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney_11;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch_14;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-ReserveLineInputSet-Exposure']", AI = false)
	public WebElement drpExposure;

	@IFindBy(how = How.CSS, using = "input[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Comments']", AI = false)
	public WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-PayerMenuIcon>div[role='button']", AI = false)
	public WebElement btnPayerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator_10;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "input[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-TransactionExchangeRateInputSet-Transaction_ExchangeRateOverride']", AI = false)
	public WebElement rdbExchangeRateMode;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-EditableRecoveryLineItemsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAddItem;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor_2;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-RecoveryCategory']", AI = false)
	public WebElement drpRecoveryCategory;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm_12;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-ReserveLineInputSet-ReserveLine']", AI = false)
	public WebElement drpReserveLine;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-EditableRecoveryLineItemsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson_1;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue_13;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-OnBehalfOfMenuIcon>div[role='button']", AI = false)
	public WebElement btnOnBehalfOfMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency_4;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf']", AI = false)
	public WebElement drpOnBehalfOf;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization_6;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "input[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-TransactionExchangeRateInputSet-Transaction_RateSet_Description']", AI = false)
	public WebElement inpExchangeRateDescription;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal_9;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-ReserveLineInputSet-CostType']", AI = false)
	public WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Currency']", AI = false)
	public WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-OnBehalfOf-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor_5;

	@IFindBy(how = How.CSS, using = "#NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-ReserveLineInputSet-Coverage']", AI = false)
	public WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-Payer']", AI = false)
	public WebElement drpPayer;

	@IFindBy(how = How.CSS, using = "select[name='NewRecoverySet-NewRecoveryScreen-RecoveryDetailDV-ReserveLineInputSet-CostCategory']", AI = false)
	public WebElement drpCostCategory;

	@IFindBy(how = How.CSS, using = "input[name$='Amount']", AI = false)
	public WebElement inpAmount;

	public CreateRecoveryPage(){
	}

	public CreateRecoveryPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//editablerecoverylineitemsTable = new EditableRecoveryLineItems();
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
	}public CreateRecoveryPage clickViewContactDetails_15(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails_15,"ViewContactDetails_15");
		return this;
	}
	public CreateRecoveryPage clickViewContactDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
		return this;
	}
	public CreateRecoveryPage clickVendorCompany_7(WebDriver driver)  {
		BrowserActions.click(driver, btnVendorCompany_7,"VendorCompany_7");
		return this;
	}
	public CreateRecoveryPage clickExchangeRateEffectiveDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExchangeRateEffectiveDateDateIcon,"ExchangeRateEffectiveDateDateIcon");
		return this;
	}
	public CreateRecoveryPage selectCategory(WebDriver driver,String Category)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
		return this;
	}
	public CreateRecoveryPage selectReservingCurrency(WebDriver driver,String ReservingCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency,ReservingCurrency,"ReservingCurrency");
		return this;
	}
	public CreateRecoveryPage enterExchangeRateEffectiveDate(WebDriver driver,String ExchangeRateEffectiveDate) {
		BrowserActions.type(driver, inpExchangeRateEffectiveDate,ExchangeRateEffectiveDate, "ExchangeRateEffectiveDate");
		return this;
	}
	public CreateRecoveryPage clickMedicalCareOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
		return this;
	}
	public CreateRecoveryPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public CreateRecoveryPage clickAttorney(WebDriver driver)  {
		BrowserActions.click(driver, btnAttorney,"Attorney");
		return this;
	}
	public CreateRecoveryPage selectMatter(WebDriver driver,String Matter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMatter,Matter,"Matter");
		return this;
	}
	public CreateRecoveryPage clickAutobodyRepairShop_3(WebDriver driver)  {
		BrowserActions.click(driver, btnAutobodyRepairShop_3,"AutobodyRepairShop_3");
		return this;
	}
	public CreateRecoveryPage enterComments_16(WebDriver driver,String Comments_16) {
		BrowserActions.type(driver, inpComments_16,Comments_16, "Comments_16");
		return this;
	}
	public CreateRecoveryPage enterExchangeRate(WebDriver driver,String ExchangeRate) {
		BrowserActions.type(driver, inpExchangeRate,ExchangeRate, "ExchangeRate");
		return this;
	}
	public CreateRecoveryPage clickAdjudicator(WebDriver driver)  {
		BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
		return this;
	}
	public CreateRecoveryPage clickAutoTowingAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
		return this;
	}
	public CreateRecoveryPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public CreateRecoveryPage clickNewCompany_8(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany_8,"NewCompany_8");
		return this;
	}
	public CreateRecoveryPage clickAttorney_11(WebDriver driver)  {
		BrowserActions.click(driver, btnAttorney_11,"Attorney_11");
		return this;
	}
	public CreateRecoveryPage clickSearch_14(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_14,"Search_14");
		return this;
	}
	public CreateRecoveryPage selectExposure(WebDriver driver,String Exposure)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpExposure,Exposure,"Exposure");
		return this;
	}
	public CreateRecoveryPage enterComments(WebDriver driver,String Comments) {
		BrowserActions.type(driver, inpComments,Comments, "Comments");
		return this;
	}
	public CreateRecoveryPage clickPayerMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnPayerMenuIcon,"PayerMenuIcon");
		return this;
	}
	public CreateRecoveryPage clickAdjudicator_10(WebDriver driver)  {
		BrowserActions.click(driver, btnAdjudicator_10,"Adjudicator_10");
		return this;
	}
	public CreateRecoveryPage clickAutobodyRepairShop(WebDriver driver)  {
		BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
		return this;
	}
	public CreateRecoveryPage clickExchangeRateMode(WebDriver driver)  {
		BrowserActions.click(driver, rdbExchangeRateMode,"ExchangeRateMode");
		return this;
	}
	public CreateRecoveryPage clickAddItem(WebDriver driver)  {
		BrowserActions.click(driver, btnAddItem,"AddItem");
		return this;
	}
	public CreateRecoveryPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,2,"Update");
		return this;
	}
	public CreateRecoveryPage clickNewVendor_2(WebDriver driver)  {
		BrowserActions.click(driver, btnNewVendor_2,"NewVendor_2");
		return this;
	}
	public CreateRecoveryPage selectRecoveryCategory(WebDriver driver,String RecoveryCategory)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRecoveryCategory,RecoveryCategory,true,"RecoveryCategory");
		return this;
	}
	public CreateRecoveryPage clickLawFirm_12(WebDriver driver)  {
		BrowserActions.click(driver, btnLawFirm_12,"LawFirm_12");
		return this;
	}
	public CreateRecoveryPage selectReserveLine(WebDriver driver,String ReserveLine)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReserveLine,ReserveLine,true,"ReserveLine");
		return this;
	}
	public CreateRecoveryPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public CreateRecoveryPage clickNewPerson_1(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson_1,"NewPerson_1");
		return this;
	}
	public CreateRecoveryPage clickLegalVenue_13(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalVenue_13,"LegalVenue_13");
		return this;
	}
	public CreateRecoveryPage clickOnBehalfOfMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnOnBehalfOfMenuIcon,"OnBehalfOfMenuIcon");
		return this;
	}
	public CreateRecoveryPage clickAutoTowingAgency_4(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoTowingAgency_4,"AutoTowingAgency_4");
		return this;
	}
	public CreateRecoveryPage selectOnBehalfOf(WebDriver driver,String OnBehalfOf)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOnBehalfOf,OnBehalfOf,"OnBehalfOf");
		return this;
	}
	public CreateRecoveryPage clickMedicalCareOrganization_6(WebDriver driver)  {
		BrowserActions.click(driver, btnMedicalCareOrganization_6,"MedicalCareOrganization_6");
		return this;
	}
	public CreateRecoveryPage clickNewCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany,"NewCompany");
		return this;
	}
	public CreateRecoveryPage enterExchangeRateDescription(WebDriver driver,String ExchangeRateDescription) {
		BrowserActions.type(driver, inpExchangeRateDescription,ExchangeRateDescription, "ExchangeRateDescription");
		return this;
	}
	public CreateRecoveryPage clickNewVendor(WebDriver driver)  {
		BrowserActions.click(driver, btnNewVendor,"NewVendor");
		return this;
	}
	public CreateRecoveryPage clickDoctor(WebDriver driver)  {
		BrowserActions.click(driver, btnDoctor,"Doctor");
		return this;
	}
	public CreateRecoveryPage clickVendorCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
		return this;
	}
	public CreateRecoveryPage clickLawFirm(WebDriver driver)  {
		BrowserActions.click(driver, btnLawFirm,"LawFirm");
		return this;
	}
	public CreateRecoveryPage clickNewLegal_9(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLegal_9,"NewLegal_9");
		return this;
	}
	public CreateRecoveryPage selectCostType(WebDriver driver,String CostType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,true,"CostType");
		return this;
	}
	public CreateRecoveryPage clickNewLegal(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLegal,"NewLegal");
		return this;
	}
	public CreateRecoveryPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CreateRecoveryPage selectCurrency(WebDriver driver,String Currency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
		return this;
	}
	public CreateRecoveryPage clickDoctor_5(WebDriver driver)  {
		BrowserActions.click(driver, btnDoctor_5,"Doctor_5");
		return this;
	}
	public CreateRecoveryPage clickLegalVenue(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
		return this;
	}
	public CreateRecoveryPage selectCoverage(WebDriver driver,String Coverage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
		return this;
	}
	public CreateRecoveryPage selectPayer(WebDriver driver)  {
		BrowserActions.selectDropDownByIndex(driver, drpPayer,1,true,"Payer");
		return this;
	}
	public CreateRecoveryPage selectReserveLine(WebDriver driver)  {
		BrowserActions.selectDropDownByIndex(driver, drpReserveLine,1,true,"Payer");
		return this;
	}
	public CreateRecoveryPage selectCostCategory(WebDriver driver,String CostCategory)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory,CostCategory,true,"CostCategory");
		return this;
	}
	public CreateRecoveryPage enterAmount(WebDriver driver,String Amount) {
		BrowserActions.type(driver, inpAmount,Amount, "Amount");
		return this;
	}

}
