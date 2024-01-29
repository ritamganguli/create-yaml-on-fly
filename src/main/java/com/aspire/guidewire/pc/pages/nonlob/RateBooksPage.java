package com.aspire.guidewire.pc.pages.nonlob;

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

public class RateBooksPage extends LoadableComponent<RateBooksPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookEffDate_dateIcon", AI = false)
	private WebElement btnRatebookEffDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-EffectiveDate']", AI = false)
	private WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "select[name='RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookStatus']", AI = false)
	private WebElement drpStatus_3;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV_tb-ImportRateBook>div[role='button']", AI = false)
	private WebElement btnImportfromXML;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookCode']", AI = false)
	private WebElement inpCode_2;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-JARGenerationDate_dateIcon", AI = false)
	private WebElement btnJARGenerationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookSearchDV-LastStatusChangeDate_dateIcon", AI = false)
	private WebElement btnActivationDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookEffDate']", AI = false)
	private WebElement inpRatebookEffDate;

	@IFindBy(how = How.CSS, using = "select[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-Offering']", AI = false)
	private WebElement drpOffering;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookSearchScreen_DownloadJarButton>div[role='button']", AI = false)
	private WebElement btnDownloadJARFile;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-RadioButtonEffecDate']", AI = false)
	private WebElement rdbRadioButtonEffecDate;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookSearchDV-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV_tb-RemoveCheckedRateBooks>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-Code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookSearchScreen_GenerateJarButton>div[role='button']", AI = false)
	private WebElement btnGenerateJARFile;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-LastStatusChangeDate']", AI = false)
	private WebElement inpActivationDate;

	@IFindBy(how = How.CSS, using = "select[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV_tb-MergeCheckedRateBooks>div[role='button']", AI = false)
	private WebElement btnMerge;

	@IFindBy(how = How.CSS, using = "select[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "select[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-UWCompany']", AI = false)
	private WebElement drpUnderwritingCompany;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookEdition']", AI = false)
	private WebElement inpEdition;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookActivity']", AI = false)
	private WebElement inpActivity;

	@IFindBy(how = How.CSS, using = "select[name='RateBooks-RateBookSearchScreen-RateBookSearchDV-PolicyLine']", AI = false)
	private WebElement drpPolicyLine;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookName']", AI = false)
	private WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV-0-RatebookPolicyLine']", AI = false)
	private WebElement inpPolicyLine;

	@IFindBy(how = How.CSS, using = "input[name='RateBooks-RateBookSearchScreen-JARGenerationDate']", AI = false)
	private WebElement inpJARGenerationDate;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-RateBookPanelSet-RatebooksLV_tb-AddRateBookButton>div[role='button']", AI = false)
	private WebElement btnNewRateBook;

	@IFindBy(how = How.CSS, using = "#RateBooks-RateBookSearchScreen-CancelJarGeneration>div[role='button']", AI = false)
	private WebElement btnCancelJarGeneration;

	@IFindBy(how = How.CSS, using = "div[id$='RatebookName_button']", AI = false)
	private WebElement lnkRateBookName;

	public RateBooksPage(){
	}

	public RateBooksPage(WebDriver driver){
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
	}public RateBooksPage clickRatebookEffDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnRatebookEffDateDateIcon,"RatebookEffDateDateIcon");
		return this;
	}
	public RateBooksPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
		return this;
	}
	public RateBooksPage selectStatus_3(WebDriver driver,String Status_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_3,Status_3,"Status_3");
		return this;
	}
	public RateBooksPage clickImportfromXML(WebDriver driver)  {
		BrowserActions.click(driver, btnImportfromXML,"ImportfromXML");
		return this;
	}
	public RateBooksPage enterCode_2(WebDriver driver,String Code_2) {
		BrowserActions.type(driver, inpCode_2,Code_2, "Code_2");
		return this;
	}
	public RateBooksPage clickJARGenerationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnJARGenerationDateDateIcon,"JARGenerationDateDateIcon");
		return this;
	}
	public RateBooksPage clickActivationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnActivationDateDateIcon,"ActivationDateDateIcon");
		return this;
	}
	public RateBooksPage enterRatebookEffDate(WebDriver driver,String RatebookEffDate) {
		BrowserActions.type(driver, inpRatebookEffDate,RatebookEffDate, "RatebookEffDate");
		return this;
	}
	public RateBooksPage selectOffering(WebDriver driver,String Offering)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOffering,Offering,"Offering");
		return this;
	}
	public RateBooksPage clickDownloadJARFile(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadJARFile,"DownloadJARFile");
		return this;
	}
	public RateBooksPage clickRadioButtonEffecDate(WebDriver driver)  {
		BrowserActions.click(driver, rdbRadioButtonEffecDate,"RadioButtonEffecDate");
		return this;
	}
	public RateBooksPage clickEffectiveDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateDateIcon,"EffectiveDateDateIcon");
		return this;
	}
	public RateBooksPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public RateBooksPage enterCode(WebDriver driver,String Code) {
		BrowserActions.type(driver, inpCode,Code, "Code");
		return this;
	}
	public RateBooksPage clickGenerateJARFile(WebDriver driver)  {
		BrowserActions.click(driver, btnGenerateJARFile,"GenerateJARFile");
		return this;
	}
	public RateBooksPage enterActivationDate(WebDriver driver,String ActivationDate) {
		BrowserActions.type(driver, inpActivationDate,ActivationDate, "ActivationDate");
		return this;
	}
	public RateBooksPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public RateBooksPage clickMerge(WebDriver driver)  {
		BrowserActions.click(driver, btnMerge,"Merge");
		return this;
	}
	public RateBooksPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public RateBooksPage selectUnderwritingCompany(WebDriver driver,String UnderwritingCompany)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUnderwritingCompany,UnderwritingCompany,"UnderwritingCompany");
		return this;
	}
	public RateBooksPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public RateBooksPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public RateBooksPage enterEdition(WebDriver driver,String Edition) {
		BrowserActions.type(driver, inpEdition,Edition, "Edition");
		return this;
	}
	public RateBooksPage enterActivity(WebDriver driver,String Activity) {
		BrowserActions.type(driver, inpActivity,Activity, "Activity");
		return this;
	}
	public RateBooksPage selectPolicyLine(WebDriver driver,String PolicyLine)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLine,PolicyLine,"PolicyLine");
		return this;
	}
	public RateBooksPage enterName_1(WebDriver driver,String Name_1) {
		BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
		return this;
	}
	public RateBooksPage enterPolicyLine(WebDriver driver,String PolicyLine) {
		BrowserActions.type(driver, inpPolicyLine,PolicyLine, "PolicyLine");
		return this;
	}
	public RateBooksPage enterJARGenerationDate(WebDriver driver,String JARGenerationDate) {
		BrowserActions.type(driver, inpJARGenerationDate,JARGenerationDate, "JARGenerationDate");
		return this;
	}
	public RateBooksPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public RateBooksPage clickNewRateBook(WebDriver driver)  {
		BrowserActions.click(driver, btnNewRateBook,"NewRateBook");
		return this;
	}
	public RateBooksPage clickCancelJarGeneration(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelJarGeneration,"CancelJarGeneration");
		return this;
	}
	
	/**
	 * click Rate Book name
	 * @param driver 
	 * @return DemoRatingPage
	 */
	public DemoRatingPage clickRateBookName(WebDriver driver)  {
		BrowserActions.click(driver, lnkRateBookName,"Rate book name");
		return new DemoRatingPage(driver).get();
	}

	public class DemoRatingPage extends LoadableComponent<DemoRatingPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-ReturnToDraftButton>div[role='button']", AI = false)
		private WebElement btnReturntoDraft;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-0-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-ExcelExportResultDateTimeStamp']", AI = false)
		private WebElement inpLastSpreadsheetExported;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-1-Name']", AI = false)
		private WebElement inpName_17;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-ActivationDate_dateIcon", AI = false)
		private WebElement btnActivationDateDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-0-Name']", AI = false)
		private WebElement inpName_14;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-3-Code']", AI = false)
		private WebElement inpCode_28;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-2-Code']", AI = false)
		private WebElement inpCode_23;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-ExportButton>div[role='button']", AI = false)
		private WebElement btnExportButton;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-RenewalExpirationDate_dateIcon", AI = false)
		private WebElement btnBeforeDateIcon_5;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Code']", AI = false)
		private WebElement inpCode;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-8-Description']", AI = false)
		private WebElement inpDescription_119;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-7-Description']", AI = false)
		private WebElement inpDescription_114;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-ExportButton-ExportToXMLItem>div[role='menuitem']", AI = false)
		private WebElement btnExporttoXML;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-EffectiveDateLabel']", AI = false)
		private WebElement inpEffectiveDateLabel;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-1-Code']", AI = false)
		private WebElement inpCode_18;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
		private WebElement inpLanguage_11;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-0-Code']", AI = false)
		private WebElement inpCode_15;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-6-Description']", AI = false)
		private WebElement inpDescription_109;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
		private WebElement inpColumn_12;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
		private WebElement inpColumn_10;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-MoveToProductionButton>div[role='button']", AI = false)
		private WebElement btnActivateRateBook;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-5-Description']", AI = false)
		private WebElement inpDescription_104;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-0-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-0-Usage']", AI = false)
		private WebElement inpUsage;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-LastUpdateTime_dateIcon", AI = false)
		private WebElement btnLastUpdatedTimeDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-3-Description']", AI = false)
		private WebElement inpDescription_94;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-4-Description']", AI = false)
		private WebElement inpDescription_99;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesTab", AI = false)
		private WebElement btnIncludedRateRoutines;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-0-Version']", AI = false)
		private WebElement inpVersion;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-RenewalEffectiveDate']", AI = false)
		private WebElement inpOnorAfter_2;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-IncludedRateTablesCardTab", AI = false)
		private WebElement btnIncludedRateTables;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-DownloadButton>div[role='button']", AI = false)
		private WebElement btnDownloadButton;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-5-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_41;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-10-Code']", AI = false)
		private WebElement inpCode_63;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-6-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_46;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-9-Code']", AI = false)
		private WebElement inpCode_121;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-11-Code']", AI = false)
		private WebElement inpCode_68;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-ExcelExportResultDateTimeStamp_dateIcon", AI = false)
		private WebElement btnLastSpreadsheetExportedDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-XMLExportResultDateTimeStamp']", AI = false)
		private WebElement inpLastXMLExported;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
		private WebElement inpLanguage;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-12-Usage']", AI = false)
		private WebElement inpUsage_75;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-7-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_51;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-11-Usage']", AI = false)
		private WebElement inpUsage_70;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-ExpirationDate']", AI = false)
		private WebElement inpBefore;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-3-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_31;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-8-Code']", AI = false)
		private WebElement inpCode_116;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-8-Code']", AI = false)
		private WebElement inpCode_53;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-7-Code']", AI = false)
		private WebElement inpCode_111;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-4-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_36;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-9-Code']", AI = false)
		private WebElement inpCode_58;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-6-Code']", AI = false)
		private WebElement inpCode_43;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-RenewalEffectiveDateLabel']", AI = false)
		private WebElement inpRenewalEffectiveDate;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-1-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_21;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-EditButton>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-5-Code']", AI = false)
		private WebElement inpCode_101;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-2-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_26;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-4-Version']", AI = false)
		private WebElement inpVersion_98;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-StorageLabel", AI = false)
		private WebElement btnSelfcontained;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-EffectiveDate_dateIcon", AI = false)
		private WebElement btnOnorAfterDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-7-Code']", AI = false)
		private WebElement inpCode_48;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-8-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_117;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Group']", AI = false)
		private WebElement inpGroup;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-8-Usage']", AI = false)
		private WebElement inpUsage_55;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-3-Version']", AI = false)
		private WebElement inpVersion_93;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-9-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_122;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-ActivationDate']", AI = false)
		private WebElement inpActivationDate;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-7-Usage']", AI = false)
		private WebElement inpUsage_50;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-6-Code']", AI = false)
		private WebElement inpCode_106;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-4-Code']", AI = false)
		private WebElement inpCode_33;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-ImportSuccessfulMessage-CloseBtn", AI = false)
		private WebElement btnClose;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-2-Version']", AI = false)
		private WebElement inpVersion_88;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-5-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_102;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-5-Code']", AI = false)
		private WebElement inpCode_38;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-6-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_107;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-RenewalExpirationDate']", AI = false)
		private WebElement inpBefore_4;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-LastUpdatedBy']", AI = false)
		private WebElement inpLastUpdatedBy;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-10-Usage']", AI = false)
		private WebElement inpUsage_65;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-ApproveButton>div[role='button']", AI = false)
		private WebElement btnApproveRateBook;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-1-Version']", AI = false)
		private WebElement inpVersion_83;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-7-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_112;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-9-Usage']", AI = false)
		private WebElement inpUsage_60;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-4-Name']", AI = false)
		private WebElement inpName_95;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-4-Description']", AI = false)
		private WebElement inpDescription_34;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-3-Name']", AI = false)
		private WebElement inpName_90;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-1-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_82;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-RenewalEffectiveDate_dateIcon", AI = false)
		private WebElement btnOnorAfterDateIcon_3;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-EffectiveDate']", AI = false)
		private WebElement inpOnorAfter;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookWarningsMessage-CloseBtn", AI = false)
		private WebElement btnClose_1;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
		private WebElement inpColumn;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-4-Usage']", AI = false)
		private WebElement inpUsage_35;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-2-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_87;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-3-Usage']", AI = false)
		private WebElement inpUsage_30;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Jurisdiction']", AI = false)
		private WebElement drpJurisdiction;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-9-Version']", AI = false)
		private WebElement inpVersion_123;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-5-Description']", AI = false)
		private WebElement inpDescription_39;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-2-Name']", AI = false)
		private WebElement inpName_85;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-UWCompany']", AI = false)
		private WebElement drpUnderwritingCompany;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-12-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_76;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-4-Code']", AI = false)
		private WebElement inpCode_96;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-6-Description']", AI = false)
		private WebElement inpDescription_44;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-1-Name']", AI = false)
		private WebElement inpName_80;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-3-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_92;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
		private WebElement inpLanguage_8;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-StorageIcon", AI = false)
		private WebElement btnStorageIcon;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-4-Jurisdiction']", AI = false)
		private WebElement inpJurisdiction_97;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-6-Usage']", AI = false)
		private WebElement inpUsage_45;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-5-Usage']", AI = false)
		private WebElement inpUsage_40;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-7-Description']", AI = false)
		private WebElement inpDescription_49;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-8-Version']", AI = false)
		private WebElement inpVersion_118;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-7-Version']", AI = false)
		private WebElement inpVersion_113;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-12-Name']", AI = false)
		private WebElement inpName_72;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-10-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_66;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-2-Code']", AI = false)
		private WebElement inpCode_86;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-1-Code']", AI = false)
		private WebElement inpCode_81;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-XMLExportResultDateTimeStamp_dateIcon", AI = false)
		private WebElement btnLastXMLExportedDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-0-Name']", AI = false)
		private WebElement inpName_77;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-SubmitForApprovalButton>div[role='button']", AI = false)
		private WebElement btnPromotetoStage;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-VersionRateBookButton>div[role='button']", AI = false)
		private WebElement btnCreateNewEdition;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-0-Description']", AI = false)
		private WebElement inpDescription_16;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-3-Code']", AI = false)
		private WebElement inpCode_91;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-6-Version']", AI = false)
		private WebElement inpVersion_108;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-1-Description']", AI = false)
		private WebElement inpDescription_19;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-11-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_71;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
		private WebElement inpFieldHeading;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-5-Version']", AI = false)
		private WebElement inpVersion_103;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-10-Name']", AI = false)
		private WebElement inpName_62;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Name']", AI = false)
		private WebElement inpName;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-8-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_56;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
		private WebElement inpColumn_9;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-12-Code']", AI = false)
		private WebElement inpCode_73;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-9-Name']", AI = false)
		private WebElement inpName_120;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
		private WebElement inpColumn_7;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-LastUpdatedBy-UserBrowseMenuItem", AI = false)
		private WebElement btnSelectUser;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-11-Name']", AI = false)
		private WebElement inpName_67;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-0-Code']", AI = false)
		private WebElement inpCode_78;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-2-Usage']", AI = false)
		private WebElement inpUsage_25;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-1-Usage']", AI = false)
		private WebElement inpUsage_20;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-2-Description']", AI = false)
		private WebElement inpDescription_24;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-9-Strategy-RateTableStrategyCell-OwnedStrategy']", AI = false)
		private WebElement drpLookup_61;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-3-Description']", AI = false)
		private WebElement inpDescription_29;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-8-Name']", AI = false)
		private WebElement inpName_52;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-12-Description']", AI = false)
		private WebElement inpDescription_74;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-7-Name']", AI = false)
		private WebElement inpName_110;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-8-Name']", AI = false)
		private WebElement inpName_115;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Description']", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-9-Name']", AI = false)
		private WebElement inpName_57;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-ImportSuccessfulMessage .gw-AlertBar--label", AI = false)
		private WebElement lblRateBooksuccessfullyimported;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-0-Description']", AI = false)
		private WebElement inpDescription_79;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-ExportButton-ExportToSpreadsheetItem>div[role='menuitem']", AI = false)
		private WebElement btnExporttoSpreadsheet;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-1-Description']", AI = false)
		private WebElement inpDescription_84;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-6-Name']", AI = false)
		private WebElement inpName_42;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-2-Description']", AI = false)
		private WebElement inpDescription_89;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-DownloadButton-DownloadXMLItem>div[role='menuitem']", AI = false)
		private WebElement btnDownloadXML;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-5-Name']", AI = false)
		private WebElement inpName_100;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-PolicyLine']", AI = false)
		private WebElement drpPolicyLine;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-7-Name']", AI = false)
		private WebElement inpName_47;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-6-Name']", AI = false)
		private WebElement inpName_105;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
		private WebElement inpFieldHeading_6;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-8-Description']", AI = false)
		private WebElement inpDescription_54;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
		private WebElement inpColumn_13;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-5-Name']", AI = false)
		private WebElement inpName_37;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookWarningsMessage .gw-AlertBar--label", AI = false)
		private WebElement lblDependentonRender;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Offering']", AI = false)
		private WebElement drpOffering;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-4-Name']", AI = false)
		private WebElement inpName_32;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-DeleteButton>div[role='button']", AI = false)
		private WebElement btnDelete;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-LastUpdateTime']", AI = false)
		private WebElement inpLastUpdatedTime;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-9-Description']", AI = false)
		private WebElement inpDescription_59;

		@IFindBy(how = How.CSS, using = "select[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Status']", AI = false)
		private WebElement drpStatus;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-DownloadButton-DownloadSpreadsheetItem>div[role='menuitem']", AI = false)
		private WebElement btnDownloadSpreadsheet;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-10-Description']", AI = false)
		private WebElement inpDescription_64;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-Edition']", AI = false)
		private WebElement inpEdition;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-3-Name']", AI = false)
		private WebElement inpName_27;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
		private WebElement inpLanguageHeading;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-2-Name']", AI = false)
		private WebElement inpName_22;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateTablesLV-11-Description']", AI = false)
		private WebElement inpDescription_69;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-IncludedRateRoutinesLV-9-Description']", AI = false)
		private WebElement inpDescription_124;

		@IFindBy(how = How.CSS, using = "input[name='RateBookDetail-RateBookDetailsScreen-RateBookDV-CascadedLookup']", AI = false)
		private WebElement chkCascadedLookup;

		@IFindBy(how = How.CSS, using = "#RateBookDetail-RateBookDetailsScreen-RateBookDV-ExpirationDate_dateIcon", AI = false)
		private WebElement btnBeforeDateIcon;

		@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-Code']", AI = false)
		public WebElement lblCode;

		@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-Status']", AI = false)
		public WebElement lblStatus;

		@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-ActivationDate']", AI = false)
		public WebElement lblActivationDate;
		
		@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-5']", AI = false)
		public WebElement lblPolicyCriteria;

		@IFindBy(how = How.CSS, using = "div[id$='LocalizedValuesLV']", AI = false)
		public WebElement lblLocalization;
		
		@IFindBy(how = How.CSS, using = "div[aria-controls$='IncludedRateTablesCard']", AI = false)
		public WebElement tabIncludedRateTables;

		@IFindBy(how = How.CSS, using = "div[aria-controls$='IncludedRateRoutines']", AI = false)
		public WebElement tabIncludedRateRoutines;


		public DemoRatingPage(){
		}

		public DemoRatingPage(WebDriver driver){
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
		}public DemoRatingPage clickReturntoDraft(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDraft,"ReturntoDraft");
			return this;
		}
		public DemoRatingPage selectLookup(WebDriver driver,String Lookup)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup,Lookup,"Lookup");
			return this;
		}
		public DemoRatingPage enterLastSpreadsheetExported(WebDriver driver,String LastSpreadsheetExported) {
			BrowserActions.type(driver, inpLastSpreadsheetExported,LastSpreadsheetExported, "LastSpreadsheetExported");
			return this;
		}
		public DemoRatingPage enterName_17(WebDriver driver,String Name_17) {
			BrowserActions.type(driver, inpName_17,Name_17, "Name_17");
			return this;
		}
		public DemoRatingPage clickActivationDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnActivationDateDateIcon,"ActivationDateDateIcon");
			return this;
		}
		public DemoRatingPage enterName_14(WebDriver driver,String Name_14) {
			BrowserActions.type(driver, inpName_14,Name_14, "Name_14");
			return this;
		}
		public DemoRatingPage enterCode_28(WebDriver driver,String Code_28) {
			BrowserActions.type(driver, inpCode_28,Code_28, "Code_28");
			return this;
		}
		public DemoRatingPage enterCode_23(WebDriver driver,String Code_23) {
			BrowserActions.type(driver, inpCode_23,Code_23, "Code_23");
			return this;
		}
		public DemoRatingPage clickExportButton(WebDriver driver)  {
			BrowserActions.click(driver, btnExportButton,"ExportButton");
			return this;
		}
		public DemoRatingPage clickBeforeDateIcon_5(WebDriver driver)  {
			BrowserActions.click(driver, btnBeforeDateIcon_5,"BeforeDateIcon_5");
			return this;
		}
		public DemoRatingPage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public DemoRatingPage enterDescription_119(WebDriver driver,String Description_119) {
			BrowserActions.type(driver, inpDescription_119,Description_119, "Description_119");
			return this;
		}
		public DemoRatingPage enterDescription_114(WebDriver driver,String Description_114) {
			BrowserActions.type(driver, inpDescription_114,Description_114, "Description_114");
			return this;
		}
		public DemoRatingPage clickExporttoXML(WebDriver driver)  {
			BrowserActions.click(driver, btnExporttoXML,"ExporttoXML");
			return this;
		}
		public DemoRatingPage enterEffectiveDateLabel(WebDriver driver,String EffectiveDateLabel) {
			BrowserActions.type(driver, inpEffectiveDateLabel,EffectiveDateLabel, "EffectiveDateLabel");
			return this;
		}
		public DemoRatingPage enterCode_18(WebDriver driver,String Code_18) {
			BrowserActions.type(driver, inpCode_18,Code_18, "Code_18");
			return this;
		}
		public DemoRatingPage enterLanguage_11(WebDriver driver,String Language_11) {
			BrowserActions.type(driver, inpLanguage_11,Language_11, "Language_11");
			return this;
		}
		public DemoRatingPage enterCode_15(WebDriver driver,String Code_15) {
			BrowserActions.type(driver, inpCode_15,Code_15, "Code_15");
			return this;
		}
		public DemoRatingPage enterDescription_109(WebDriver driver,String Description_109) {
			BrowserActions.type(driver, inpDescription_109,Description_109, "Description_109");
			return this;
		}
		public DemoRatingPage enterColumn_12(WebDriver driver,String Column_12) {
			BrowserActions.type(driver, inpColumn_12,Column_12, "Column_12");
			return this;
		}
		public DemoRatingPage enterColumn_10(WebDriver driver,String Column_10) {
			BrowserActions.type(driver, inpColumn_10,Column_10, "Column_10");
			return this;
		}
		public DemoRatingPage clickActivateRateBook(WebDriver driver)  {
			BrowserActions.click(driver, btnActivateRateBook,"ActivateRateBook");
			return this;
		}
		public DemoRatingPage enterDescription_104(WebDriver driver,String Description_104) {
			BrowserActions.type(driver, inpDescription_104,Description_104, "Description_104");
			return this;
		}
		public DemoRatingPage enterJurisdiction(WebDriver driver,String Jurisdiction) {
			BrowserActions.type(driver, inpJurisdiction,Jurisdiction, "Jurisdiction");
			return this;
		}
		public DemoRatingPage enterUsage(WebDriver driver,String Usage) {
			BrowserActions.type(driver, inpUsage,Usage, "Usage");
			return this;
		}
		public DemoRatingPage clickLastUpdatedTimeDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLastUpdatedTimeDateIcon,"LastUpdatedTimeDateIcon");
			return this;
		}
		public DemoRatingPage enterDescription_94(WebDriver driver,String Description_94) {
			BrowserActions.type(driver, inpDescription_94,Description_94, "Description_94");
			return this;
		}
		public DemoRatingPage enterDescription_99(WebDriver driver,String Description_99) {
			BrowserActions.type(driver, inpDescription_99,Description_99, "Description_99");
			return this;
		}
		public DemoRatingPage clickIncludedRateRoutines(WebDriver driver)  {
			BrowserActions.click(driver, btnIncludedRateRoutines,"IncludedRateRoutines");
			return this;
		}
		public DemoRatingPage enterVersion(WebDriver driver,String Version) {
			BrowserActions.type(driver, inpVersion,Version, "Version");
			return this;
		}
		public DemoRatingPage enterOnorAfter_2(WebDriver driver,String OnorAfter_2) {
			BrowserActions.type(driver, inpOnorAfter_2,OnorAfter_2, "OnorAfter_2");
			return this;
		}
		public DemoRatingPage clickIncludedRateTables(WebDriver driver)  {
			BrowserActions.click(driver, btnIncludedRateTables,"IncludedRateTables");
			return this;
		}
		public DemoRatingPage clickDownloadButton(WebDriver driver)  {
			BrowserActions.click(driver, btnDownloadButton,"DownloadButton");
			return this;
		}
		public DemoRatingPage selectLookup_41(WebDriver driver,String Lookup_41)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_41,Lookup_41,"Lookup_41");
			return this;
		}
		public DemoRatingPage enterCode_63(WebDriver driver,String Code_63) {
			BrowserActions.type(driver, inpCode_63,Code_63, "Code_63");
			return this;
		}
		public DemoRatingPage selectLookup_46(WebDriver driver,String Lookup_46)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_46,Lookup_46,"Lookup_46");
			return this;
		}
		public DemoRatingPage enterCode_121(WebDriver driver,String Code_121) {
			BrowserActions.type(driver, inpCode_121,Code_121, "Code_121");
			return this;
		}
		public DemoRatingPage enterCode_68(WebDriver driver,String Code_68) {
			BrowserActions.type(driver, inpCode_68,Code_68, "Code_68");
			return this;
		}
		public DemoRatingPage clickLastSpreadsheetExportedDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLastSpreadsheetExportedDateIcon,"LastSpreadsheetExportedDateIcon");
			return this;
		}
		public DemoRatingPage enterLastXMLExported(WebDriver driver,String LastXMLExported) {
			BrowserActions.type(driver, inpLastXMLExported,LastXMLExported, "LastXMLExported");
			return this;
		}
		public DemoRatingPage enterLanguage(WebDriver driver,String Language) {
			BrowserActions.type(driver, inpLanguage,Language, "Language");
			return this;
		}
		public DemoRatingPage enterUsage_75(WebDriver driver,String Usage_75) {
			BrowserActions.type(driver, inpUsage_75,Usage_75, "Usage_75");
			return this;
		}
		public DemoRatingPage selectLookup_51(WebDriver driver,String Lookup_51)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_51,Lookup_51,"Lookup_51");
			return this;
		}
		public DemoRatingPage enterUsage_70(WebDriver driver,String Usage_70) {
			BrowserActions.type(driver, inpUsage_70,Usage_70, "Usage_70");
			return this;
		}
		public DemoRatingPage enterBefore(WebDriver driver,String Before) {
			BrowserActions.type(driver, inpBefore,Before, "Before");
			return this;
		}
		public DemoRatingPage selectLookup_31(WebDriver driver,String Lookup_31)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_31,Lookup_31,"Lookup_31");
			return this;
		}
		public DemoRatingPage enterCode_116(WebDriver driver,String Code_116) {
			BrowserActions.type(driver, inpCode_116,Code_116, "Code_116");
			return this;
		}
		public DemoRatingPage enterCode_53(WebDriver driver,String Code_53) {
			BrowserActions.type(driver, inpCode_53,Code_53, "Code_53");
			return this;
		}
		public DemoRatingPage enterCode_111(WebDriver driver,String Code_111) {
			BrowserActions.type(driver, inpCode_111,Code_111, "Code_111");
			return this;
		}
		public DemoRatingPage selectLookup_36(WebDriver driver,String Lookup_36)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_36,Lookup_36,"Lookup_36");
			return this;
		}
		public DemoRatingPage enterCode_58(WebDriver driver,String Code_58) {
			BrowserActions.type(driver, inpCode_58,Code_58, "Code_58");
			return this;
		}
		public DemoRatingPage enterCode_43(WebDriver driver,String Code_43) {
			BrowserActions.type(driver, inpCode_43,Code_43, "Code_43");
			return this;
		}
		public DemoRatingPage enterRenewalEffectiveDate(WebDriver driver,String RenewalEffectiveDate) {
			BrowserActions.type(driver, inpRenewalEffectiveDate,RenewalEffectiveDate, "RenewalEffectiveDate");
			return this;
		}
		public DemoRatingPage selectLookup_21(WebDriver driver,String Lookup_21)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_21,Lookup_21,"Lookup_21");
			return this;
		}
		public DemoRatingPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public DemoRatingPage enterCode_101(WebDriver driver,String Code_101) {
			BrowserActions.type(driver, inpCode_101,Code_101, "Code_101");
			return this;
		}
		public DemoRatingPage selectLookup_26(WebDriver driver,String Lookup_26)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_26,Lookup_26,"Lookup_26");
			return this;
		}
		public DemoRatingPage enterVersion_98(WebDriver driver,String Version_98) {
			BrowserActions.type(driver, inpVersion_98,Version_98, "Version_98");
			return this;
		}
		public DemoRatingPage clickSelfcontained(WebDriver driver)  {
			BrowserActions.click(driver, btnSelfcontained,"Selfcontained");
			return this;
		}
		public DemoRatingPage clickOnorAfterDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnOnorAfterDateIcon,"OnorAfterDateIcon");
			return this;
		}
		public DemoRatingPage enterCode_48(WebDriver driver,String Code_48) {
			BrowserActions.type(driver, inpCode_48,Code_48, "Code_48");
			return this;
		}
		public DemoRatingPage enterJurisdiction_117(WebDriver driver,String Jurisdiction_117) {
			BrowserActions.type(driver, inpJurisdiction_117,Jurisdiction_117, "Jurisdiction_117");
			return this;
		}
		public DemoRatingPage enterGroup(WebDriver driver,String Group) {
			BrowserActions.type(driver, inpGroup,Group, "Group");
			return this;
		}
		public DemoRatingPage enterUsage_55(WebDriver driver,String Usage_55) {
			BrowserActions.type(driver, inpUsage_55,Usage_55, "Usage_55");
			return this;
		}
		public DemoRatingPage enterVersion_93(WebDriver driver,String Version_93) {
			BrowserActions.type(driver, inpVersion_93,Version_93, "Version_93");
			return this;
		}
		public DemoRatingPage enterJurisdiction_122(WebDriver driver,String Jurisdiction_122) {
			BrowserActions.type(driver, inpJurisdiction_122,Jurisdiction_122, "Jurisdiction_122");
			return this;
		}
		public DemoRatingPage enterActivationDate(WebDriver driver,String ActivationDate) {
			BrowserActions.type(driver, inpActivationDate,ActivationDate, "ActivationDate");
			return this;
		}
		public DemoRatingPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public DemoRatingPage enterUsage_50(WebDriver driver,String Usage_50) {
			BrowserActions.type(driver, inpUsage_50,Usage_50, "Usage_50");
			return this;
		}
		public DemoRatingPage enterCode_106(WebDriver driver,String Code_106) {
			BrowserActions.type(driver, inpCode_106,Code_106, "Code_106");
			return this;
		}
		public DemoRatingPage enterCode_33(WebDriver driver,String Code_33) {
			BrowserActions.type(driver, inpCode_33,Code_33, "Code_33");
			return this;
		}
		public DemoRatingPage clickClose(WebDriver driver)  {
			BrowserActions.click(driver, btnClose,"Close");
			return this;
		}
		public DemoRatingPage enterVersion_88(WebDriver driver,String Version_88) {
			BrowserActions.type(driver, inpVersion_88,Version_88, "Version_88");
			return this;
		}
		public DemoRatingPage enterJurisdiction_102(WebDriver driver,String Jurisdiction_102) {
			BrowserActions.type(driver, inpJurisdiction_102,Jurisdiction_102, "Jurisdiction_102");
			return this;
		}
		public DemoRatingPage enterCode_38(WebDriver driver,String Code_38) {
			BrowserActions.type(driver, inpCode_38,Code_38, "Code_38");
			return this;
		}
		public DemoRatingPage enterJurisdiction_107(WebDriver driver,String Jurisdiction_107) {
			BrowserActions.type(driver, inpJurisdiction_107,Jurisdiction_107, "Jurisdiction_107");
			return this;
		}
		public DemoRatingPage enterBefore_4(WebDriver driver,String Before_4) {
			BrowserActions.type(driver, inpBefore_4,Before_4, "Before_4");
			return this;
		}
		public DemoRatingPage enterLastUpdatedBy(WebDriver driver,String LastUpdatedBy) {
			BrowserActions.type(driver, inpLastUpdatedBy,LastUpdatedBy, "LastUpdatedBy");
			return this;
		}
		public DemoRatingPage enterUsage_65(WebDriver driver,String Usage_65) {
			BrowserActions.type(driver, inpUsage_65,Usage_65, "Usage_65");
			return this;
		}
		public DemoRatingPage clickApproveRateBook(WebDriver driver)  {
			BrowserActions.click(driver, btnApproveRateBook,"ApproveRateBook");
			return this;
		}
		public DemoRatingPage enterVersion_83(WebDriver driver,String Version_83) {
			BrowserActions.type(driver, inpVersion_83,Version_83, "Version_83");
			return this;
		}
		public DemoRatingPage enterJurisdiction_112(WebDriver driver,String Jurisdiction_112) {
			BrowserActions.type(driver, inpJurisdiction_112,Jurisdiction_112, "Jurisdiction_112");
			return this;
		}
		public DemoRatingPage enterUsage_60(WebDriver driver,String Usage_60) {
			BrowserActions.type(driver, inpUsage_60,Usage_60, "Usage_60");
			return this;
		}
		public DemoRatingPage enterName_95(WebDriver driver,String Name_95) {
			BrowserActions.type(driver, inpName_95,Name_95, "Name_95");
			return this;
		}
		public DemoRatingPage enterDescription_34(WebDriver driver,String Description_34) {
			BrowserActions.type(driver, inpDescription_34,Description_34, "Description_34");
			return this;
		}
		public DemoRatingPage enterName_90(WebDriver driver,String Name_90) {
			BrowserActions.type(driver, inpName_90,Name_90, "Name_90");
			return this;
		}
		public DemoRatingPage enterJurisdiction_82(WebDriver driver,String Jurisdiction_82) {
			BrowserActions.type(driver, inpJurisdiction_82,Jurisdiction_82, "Jurisdiction_82");
			return this;
		}
		public DemoRatingPage clickOnorAfterDateIcon_3(WebDriver driver)  {
			BrowserActions.click(driver, btnOnorAfterDateIcon_3,"OnorAfterDateIcon_3");
			return this;
		}
		public DemoRatingPage enterOnorAfter(WebDriver driver,String OnorAfter) {
			BrowserActions.type(driver, inpOnorAfter,OnorAfter, "OnorAfter");
			return this;
		}
		public DemoRatingPage clickClose_1(WebDriver driver)  {
			BrowserActions.click(driver, btnClose_1,"Close_1");
			return this;
		}
		public DemoRatingPage enterColumn(WebDriver driver,String Column) {
			BrowserActions.type(driver, inpColumn,Column, "Column");
			return this;
		}
		public DemoRatingPage enterUsage_35(WebDriver driver,String Usage_35) {
			BrowserActions.type(driver, inpUsage_35,Usage_35, "Usage_35");
			return this;
		}
		public DemoRatingPage enterJurisdiction_87(WebDriver driver,String Jurisdiction_87) {
			BrowserActions.type(driver, inpJurisdiction_87,Jurisdiction_87, "Jurisdiction_87");
			return this;
		}
		public DemoRatingPage enterUsage_30(WebDriver driver,String Usage_30) {
			BrowserActions.type(driver, inpUsage_30,Usage_30, "Usage_30");
			return this;
		}
		public DemoRatingPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
			return this;
		}
		public DemoRatingPage enterVersion_123(WebDriver driver,String Version_123) {
			BrowserActions.type(driver, inpVersion_123,Version_123, "Version_123");
			return this;
		}
		public DemoRatingPage enterDescription_39(WebDriver driver,String Description_39) {
			BrowserActions.type(driver, inpDescription_39,Description_39, "Description_39");
			return this;
		}
		public DemoRatingPage enterName_85(WebDriver driver,String Name_85) {
			BrowserActions.type(driver, inpName_85,Name_85, "Name_85");
			return this;
		}
		public DemoRatingPage selectUnderwritingCompany(WebDriver driver,String UnderwritingCompany)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpUnderwritingCompany,UnderwritingCompany,"UnderwritingCompany");
			return this;
		}
		public DemoRatingPage selectLookup_76(WebDriver driver,String Lookup_76)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_76,Lookup_76,"Lookup_76");
			return this;
		}
		public DemoRatingPage enterCode_96(WebDriver driver,String Code_96) {
			BrowserActions.type(driver, inpCode_96,Code_96, "Code_96");
			return this;
		}
		public DemoRatingPage enterDescription_44(WebDriver driver,String Description_44) {
			BrowserActions.type(driver, inpDescription_44,Description_44, "Description_44");
			return this;
		}
		public DemoRatingPage enterName_80(WebDriver driver,String Name_80) {
			BrowserActions.type(driver, inpName_80,Name_80, "Name_80");
			return this;
		}
		public DemoRatingPage enterJurisdiction_92(WebDriver driver,String Jurisdiction_92) {
			BrowserActions.type(driver, inpJurisdiction_92,Jurisdiction_92, "Jurisdiction_92");
			return this;
		}
		public DemoRatingPage enterLanguage_8(WebDriver driver,String Language_8) {
			BrowserActions.type(driver, inpLanguage_8,Language_8, "Language_8");
			return this;
		}
		public DemoRatingPage clickStorageIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnStorageIcon,"StorageIcon");
			return this;
		}
		public DemoRatingPage enterJurisdiction_97(WebDriver driver,String Jurisdiction_97) {
			BrowserActions.type(driver, inpJurisdiction_97,Jurisdiction_97, "Jurisdiction_97");
			return this;
		}
		public DemoRatingPage enterUsage_45(WebDriver driver,String Usage_45) {
			BrowserActions.type(driver, inpUsage_45,Usage_45, "Usage_45");
			return this;
		}
		public DemoRatingPage enterUsage_40(WebDriver driver,String Usage_40) {
			BrowserActions.type(driver, inpUsage_40,Usage_40, "Usage_40");
			return this;
		}
		public DemoRatingPage enterDescription_49(WebDriver driver,String Description_49) {
			BrowserActions.type(driver, inpDescription_49,Description_49, "Description_49");
			return this;
		}
		public DemoRatingPage enterVersion_118(WebDriver driver,String Version_118) {
			BrowserActions.type(driver, inpVersion_118,Version_118, "Version_118");
			return this;
		}
		public DemoRatingPage enterVersion_113(WebDriver driver,String Version_113) {
			BrowserActions.type(driver, inpVersion_113,Version_113, "Version_113");
			return this;
		}
		public DemoRatingPage enterName_72(WebDriver driver,String Name_72) {
			BrowserActions.type(driver, inpName_72,Name_72, "Name_72");
			return this;
		}
		public DemoRatingPage selectLookup_66(WebDriver driver,String Lookup_66)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_66,Lookup_66,"Lookup_66");
			return this;
		}
		public DemoRatingPage enterCode_86(WebDriver driver,String Code_86) {
			BrowserActions.type(driver, inpCode_86,Code_86, "Code_86");
			return this;
		}
		public DemoRatingPage enterCode_81(WebDriver driver,String Code_81) {
			BrowserActions.type(driver, inpCode_81,Code_81, "Code_81");
			return this;
		}
		public DemoRatingPage clickLastXMLExportedDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLastXMLExportedDateIcon,"LastXMLExportedDateIcon");
			return this;
		}
		public DemoRatingPage enterName_77(WebDriver driver,String Name_77) {
			BrowserActions.type(driver, inpName_77,Name_77, "Name_77");
			return this;
		}
		public DemoRatingPage clickPromotetoStage(WebDriver driver)  {
			BrowserActions.click(driver, btnPromotetoStage,"PromotetoStage");
			return this;
		}
		public DemoRatingPage clickCreateNewEdition(WebDriver driver)  {
			BrowserActions.click(driver, btnCreateNewEdition,"CreateNewEdition");
			return this;
		}
		public DemoRatingPage enterDescription_16(WebDriver driver,String Description_16) {
			BrowserActions.type(driver, inpDescription_16,Description_16, "Description_16");
			return this;
		}
		public DemoRatingPage enterCode_91(WebDriver driver,String Code_91) {
			BrowserActions.type(driver, inpCode_91,Code_91, "Code_91");
			return this;
		}
		public DemoRatingPage enterVersion_108(WebDriver driver,String Version_108) {
			BrowserActions.type(driver, inpVersion_108,Version_108, "Version_108");
			return this;
		}
		public DemoRatingPage enterDescription_19(WebDriver driver,String Description_19) {
			BrowserActions.type(driver, inpDescription_19,Description_19, "Description_19");
			return this;
		}
		public DemoRatingPage selectLookup_71(WebDriver driver,String Lookup_71)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_71,Lookup_71,"Lookup_71");
			return this;
		}
		public DemoRatingPage enterFieldHeading(WebDriver driver,String FieldHeading) {
			BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			return this;
		}
		public DemoRatingPage enterVersion_103(WebDriver driver,String Version_103) {
			BrowserActions.type(driver, inpVersion_103,Version_103, "Version_103");
			return this;
		}
		public DemoRatingPage enterName_62(WebDriver driver,String Name_62) {
			BrowserActions.type(driver, inpName_62,Name_62, "Name_62");
			return this;
		}
		public DemoRatingPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public DemoRatingPage selectLookup_56(WebDriver driver,String Lookup_56)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_56,Lookup_56,"Lookup_56");
			return this;
		}
		public DemoRatingPage enterColumn_9(WebDriver driver,String Column_9) {
			BrowserActions.type(driver, inpColumn_9,Column_9, "Column_9");
			return this;
		}
		public DemoRatingPage enterCode_73(WebDriver driver,String Code_73) {
			BrowserActions.type(driver, inpCode_73,Code_73, "Code_73");
			return this;
		}
		public DemoRatingPage enterName_120(WebDriver driver,String Name_120) {
			BrowserActions.type(driver, inpName_120,Name_120, "Name_120");
			return this;
		}
		public DemoRatingPage enterColumn_7(WebDriver driver,String Column_7) {
			BrowserActions.type(driver, inpColumn_7,Column_7, "Column_7");
			return this;
		}
		public DemoRatingPage clickSelectUser(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser,"SelectUser");
			return this;
		}
		public DemoRatingPage enterName_67(WebDriver driver,String Name_67) {
			BrowserActions.type(driver, inpName_67,Name_67, "Name_67");
			return this;
		}
		public DemoRatingPage enterCode_78(WebDriver driver,String Code_78) {
			BrowserActions.type(driver, inpCode_78,Code_78, "Code_78");
			return this;
		}
		public DemoRatingPage enterUsage_25(WebDriver driver,String Usage_25) {
			BrowserActions.type(driver, inpUsage_25,Usage_25, "Usage_25");
			return this;
		}
		public DemoRatingPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public DemoRatingPage enterUsage_20(WebDriver driver,String Usage_20) {
			BrowserActions.type(driver, inpUsage_20,Usage_20, "Usage_20");
			return this;
		}
		public DemoRatingPage enterDescription_24(WebDriver driver,String Description_24) {
			BrowserActions.type(driver, inpDescription_24,Description_24, "Description_24");
			return this;
		}
		public DemoRatingPage selectLookup_61(WebDriver driver,String Lookup_61)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLookup_61,Lookup_61,"Lookup_61");
			return this;
		}
		public DemoRatingPage enterDescription_29(WebDriver driver,String Description_29) {
			BrowserActions.type(driver, inpDescription_29,Description_29, "Description_29");
			return this;
		}
		public DemoRatingPage enterName_52(WebDriver driver,String Name_52) {
			BrowserActions.type(driver, inpName_52,Name_52, "Name_52");
			return this;
		}
		public DemoRatingPage enterDescription_74(WebDriver driver,String Description_74) {
			BrowserActions.type(driver, inpDescription_74,Description_74, "Description_74");
			return this;
		}
		public DemoRatingPage enterName_110(WebDriver driver,String Name_110) {
			BrowserActions.type(driver, inpName_110,Name_110, "Name_110");
			return this;
		}
		public DemoRatingPage enterName_115(WebDriver driver,String Name_115) {
			BrowserActions.type(driver, inpName_115,Name_115, "Name_115");
			return this;
		}
		public DemoRatingPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public DemoRatingPage enterName_57(WebDriver driver,String Name_57) {
			BrowserActions.type(driver, inpName_57,Name_57, "Name_57");
			return this;
		}
		public DemoRatingPage enterDescription_79(WebDriver driver,String Description_79) {
			BrowserActions.type(driver, inpDescription_79,Description_79, "Description_79");
			return this;
		}
		public DemoRatingPage clickExporttoSpreadsheet(WebDriver driver)  {
			BrowserActions.click(driver, btnExporttoSpreadsheet,"ExporttoSpreadsheet");
			return this;
		}
		public DemoRatingPage enterDescription_84(WebDriver driver,String Description_84) {
			BrowserActions.type(driver, inpDescription_84,Description_84, "Description_84");
			return this;
		}
		public DemoRatingPage enterName_42(WebDriver driver,String Name_42) {
			BrowserActions.type(driver, inpName_42,Name_42, "Name_42");
			return this;
		}
		public DemoRatingPage enterDescription_89(WebDriver driver,String Description_89) {
			BrowserActions.type(driver, inpDescription_89,Description_89, "Description_89");
			return this;
		}
		public DemoRatingPage clickDownloadXML(WebDriver driver)  {
			BrowserActions.click(driver, btnDownloadXML,"DownloadXML");
			return this;
		}
		public DemoRatingPage enterName_100(WebDriver driver,String Name_100) {
			BrowserActions.type(driver, inpName_100,Name_100, "Name_100");
			return this;
		}
		public DemoRatingPage selectPolicyLine(WebDriver driver,String PolicyLine)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLine,PolicyLine,"PolicyLine");
			return this;
		}
		public DemoRatingPage enterName_47(WebDriver driver,String Name_47) {
			BrowserActions.type(driver, inpName_47,Name_47, "Name_47");
			return this;
		}
		public DemoRatingPage enterName_105(WebDriver driver,String Name_105) {
			BrowserActions.type(driver, inpName_105,Name_105, "Name_105");
			return this;
		}
		public DemoRatingPage enterFieldHeading_6(WebDriver driver,String FieldHeading_6) {
			BrowserActions.type(driver, inpFieldHeading_6,FieldHeading_6, "FieldHeading_6");
			return this;
		}
		public DemoRatingPage enterDescription_54(WebDriver driver,String Description_54) {
			BrowserActions.type(driver, inpDescription_54,Description_54, "Description_54");
			return this;
		}
		public DemoRatingPage enterColumn_13(WebDriver driver,String Column_13) {
			BrowserActions.type(driver, inpColumn_13,Column_13, "Column_13");
			return this;
		}
		public DemoRatingPage enterName_37(WebDriver driver,String Name_37) {
			BrowserActions.type(driver, inpName_37,Name_37, "Name_37");
			return this;
		}
		public DemoRatingPage selectOffering(WebDriver driver,String Offering)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpOffering,Offering,"Offering");
			return this;
		}
		public DemoRatingPage enterName_32(WebDriver driver,String Name_32) {
			BrowserActions.type(driver, inpName_32,Name_32, "Name_32");
			return this;
		}
		public DemoRatingPage clickDelete(WebDriver driver)  {
			BrowserActions.click(driver, btnDelete,"Delete");
			return this;
		}
		public DemoRatingPage enterLastUpdatedTime(WebDriver driver,String LastUpdatedTime) {
			BrowserActions.type(driver, inpLastUpdatedTime,LastUpdatedTime, "LastUpdatedTime");
			return this;
		}
		public DemoRatingPage enterDescription_59(WebDriver driver,String Description_59) {
			BrowserActions.type(driver, inpDescription_59,Description_59, "Description_59");
			return this;
		}
		public DemoRatingPage selectStatus(WebDriver driver,String Status)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
			return this;
		}
		public DemoRatingPage clickDownloadSpreadsheet(WebDriver driver)  {
			BrowserActions.click(driver, btnDownloadSpreadsheet,"DownloadSpreadsheet");
			return this;
		}
		public DemoRatingPage enterDescription_64(WebDriver driver,String Description_64) {
			BrowserActions.type(driver, inpDescription_64,Description_64, "Description_64");
			return this;
		}
		public DemoRatingPage enterEdition(WebDriver driver,String Edition) {
			BrowserActions.type(driver, inpEdition,Edition, "Edition");
			return this;
		}
		public DemoRatingPage enterName_27(WebDriver driver,String Name_27) {
			BrowserActions.type(driver, inpName_27,Name_27, "Name_27");
			return this;
		}
		public DemoRatingPage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
			BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			return this;
		}
		public DemoRatingPage enterName_22(WebDriver driver,String Name_22) {
			BrowserActions.type(driver, inpName_22,Name_22, "Name_22");
			return this;
		}
		public DemoRatingPage enterDescription_69(WebDriver driver,String Description_69) {
			BrowserActions.type(driver, inpDescription_69,Description_69, "Description_69");
			return this;
		}
		public DemoRatingPage enterDescription_124(WebDriver driver,String Description_124) {
			BrowserActions.type(driver, inpDescription_124,Description_124, "Description_124");
			return this;
		}
		public DemoRatingPage clickCascadedLookup(WebDriver driver)  {
			BrowserActions.click(driver, chkCascadedLookup,"CascadedLookup");
			return this;
		}
		public DemoRatingPage clickBeforeDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnBeforeDateIcon,"BeforeDateIcon");
			return this;
		}
		
		/**
		 * Verify Code is display
		 * @param driver 
		 * @return
		 */
		public void verifyCodeIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblCode, "Code ");
		}
		
		/**
		 * Verify Status is display
		 * @param driver 
		 * @return
		 */
		public void verifyStatusIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblStatus, "Status");
		}
		
		/**
		 * Verify Activation Date is display
		 * @param driver 
		 * @return
		 */

		public void verifyActivationDateIsDisplayed(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver, lblActivationDate, "Activation Code ");
		}
		
		/**
		 * Verify Export Button is display
		 * @param driver 
		 * @return
		 */
		
		public void verifyExportButton(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,btnExportButton, "Export Button");
		}
		
		/**
		 * Verify Download Button is display
		 * @param driver 
		 * @return
		 */
		
		public void verifyDownloadButton(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,btnDownloadButton, "Download Button");
		}
		
		/**
		 * Verify Create New Edition Button is display
		 * @param driver 
		 * @return
		 */
		
		public void verifyCreateNewEditionButton(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver,btnCreateNewEdition, "CreateNewEdition Button");
		}
		
		/**
		 * Verify PolicyCriteriaLabel is display
		 * @param driver 
		 * @return
		 */
		
		public void verifyPolicyCriteriaLabel(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblPolicyCriteria, "Policy Criteria label");
		}
		
		/**
		 * Verify Localization Label is display
		 * @param driver 
		 * @return
		 */
		public void verifyLocalizationLabel(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,lblLocalization, "Localization label");
		}
		
		/**
		 * Verify Included rate table  is display
		 * @param driver 
		 * @return
		 */
		public void verifyIncludedRateTablesTab(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,tabIncludedRateTables, "tab IncludedRateTables");
		}
		
		/**
		 * Verify Included RateRoutine  is display
		 * @param driver 
		 * @return
		 */
		
		public void verifyIncludedRateRoutinesTab(WebDriver driver) {
			BrowserActions.verifyElementDisplayed(driver,tabIncludedRateRoutines, "tab IncludedRateRoutines");
		}
		

	}

}
