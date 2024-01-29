package com.aspire.guidewire.cc.pages.nonlob;
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

public class BenefitParameterDetailPage extends LoadableComponent<BenefitParameterDetailPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-PPDMinAdjToAWW']", AI = false)
	private WebElement rdbMinimumadjustedbyWeeklyWage_10;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TPDPercentOfWages']", AI = false)
	private WebElement inpPercentageofWages;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-WPNotAppliedToPPD']", AI = false)
	private WebElement chkDoesnotApplytoPPD;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TTDPercentOfWages']", AI = false)
	private WebElement inpPercentOfWages;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-PTDMinAdjToAWW']", AI = false)
	private WebElement rdbMinimumadjustedbyWeeklyWage_7;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TPDMinAdjToAWW']", AI = false)
	private WebElement rdbMinimumadjustedbyWeeklyWage_3;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-PPDMax']", AI = false)
	private WebElement inpMaximumWeeklyBenefit_8;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TPTDMax']", AI = false)
	private WebElement inpMaximumWeeklyBenefit_5;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TPDMax']", AI = false)
	private WebElement inpMaximumWeeklyBenefit_1;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-RetroactivePeriod']", AI = false)
	private WebElement inpRetroactivePeriod;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-StartDate']", AI = false)
	private WebElement inpStartDate;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-WCBenefitParameterSetDV-Factors-WCBenefitFactorsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-WCBenefitParameterSetDV-EndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-WCBenefitParameterSetDV-StartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-__crumb__", AI = false)
	private WebElement btnReturntoBenefitParameters;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-WPNotAppliedToPTD']", AI = false)
	private WebElement chkDoesnotApplytoPTD;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-WaitingPeriodDays']", AI = false)
	private WebElement inpNumberofDays;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-PPDPercentOfWages']", AI = false)
	private WebElement inpPercentofWages;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TTDMax']", AI = false)
	private WebElement inpMaximumWeeklyBenefit;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-RateCommentsw']", AI = false)
	private WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TTDMinAdjToAWW']", AI = false)
	private WebElement rdbMinimumadjustedbyWeeklyWage;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-WCBenefitParameterSetDV_tb-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-WCBenefitParameterSetDV_tb-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TTDMin']", AI = false)
	private WebElement inpMinimumWeeklyBenefit;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-EndDate']", AI = false)
	private WebElement inpEndDate;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-TPDMin']", AI = false)
	private WebElement inpMinimumWeeklyBenefit_2;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-WCBenefitParameterSetDV-Factors-WCBenefitFactorsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-PTDMin']", AI = false)
	private WebElement inpMinimumWeeklyBenefit_6;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-PPDMin']", AI = false)
	private WebElement inpMinimumWeeklyBenefit_9;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSetPopup-WCBenefitParameterSetDV-PTDPercentOfWages']", AI = false)
	private WebElement inpPercentageofWages_4;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSetPopup-WCBenefitParameterSetDV_tb-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;


	public BenefitParameterDetailPage(){
	}

	public BenefitParameterDetailPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnCancel))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public BenefitParameterDetailPage clickMinimumadjustedbyWeeklyWage_10(WebDriver driver)  {
		BrowserActions.click(driver, rdbMinimumadjustedbyWeeklyWage_10,"MinimumadjustedbyWeeklyWage_10");
		return this;
	}
	public BenefitParameterDetailPage enterPercentageofWages(WebDriver driver,String PercentageofWages) {
		BrowserActions.type(driver, inpPercentageofWages,PercentageofWages, "PercentageofWages");
		return this;
	}
	public BenefitParameterDetailPage clickDoesnotApplytoPPD(WebDriver driver)  {
		BrowserActions.click(driver, chkDoesnotApplytoPPD,"DoesnotApplytoPPD");
		return this;
	}
	public BenefitParameterDetailPage enterPercentOfWages(WebDriver driver,String PercentOfWages) {
		BrowserActions.type(driver, inpPercentOfWages,PercentOfWages, "PercentOfWages");
		return this;
	}
	public BenefitParameterDetailPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public BenefitParameterDetailPage clickMinimumadjustedbyWeeklyWage_7(WebDriver driver)  {
		BrowserActions.click(driver, rdbMinimumadjustedbyWeeklyWage_7,"MinimumadjustedbyWeeklyWage_7");
		return this;
	}
	public BenefitParameterDetailPage clickMinimumadjustedbyWeeklyWage_3(WebDriver driver)  {
		BrowserActions.click(driver, rdbMinimumadjustedbyWeeklyWage_3,"MinimumadjustedbyWeeklyWage_3");
		return this;
	}
	public BenefitParameterDetailPage enterMaximumWeeklyBenefit_8(WebDriver driver,String MaximumWeeklyBenefit_8) {
		BrowserActions.type(driver, inpMaximumWeeklyBenefit_8,MaximumWeeklyBenefit_8, "MaximumWeeklyBenefit_8");
		return this;
	}
	public BenefitParameterDetailPage enterMaximumWeeklyBenefit_5(WebDriver driver,String MaximumWeeklyBenefit_5) {
		BrowserActions.type(driver, inpMaximumWeeklyBenefit_5,MaximumWeeklyBenefit_5, "MaximumWeeklyBenefit_5");
		return this;
	}
	public BenefitParameterDetailPage enterMaximumWeeklyBenefit_1(WebDriver driver,String MaximumWeeklyBenefit_1) {
		BrowserActions.type(driver, inpMaximumWeeklyBenefit_1,MaximumWeeklyBenefit_1, "MaximumWeeklyBenefit_1");
		return this;
	}
	public BenefitParameterDetailPage enterRetroactivePeriod(WebDriver driver,String RetroactivePeriod) {
		BrowserActions.type(driver, inpRetroactivePeriod,RetroactivePeriod, "RetroactivePeriod");
		return this;
	}
	public BenefitParameterDetailPage enterStartDate(WebDriver driver,String StartDate) {
		BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
		return this;
	}
	public BenefitParameterDetailPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public BenefitParameterDetailPage clickEndDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
		return this;
	}
	public BenefitParameterDetailPage clickStartDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
		return this;
	}
	public BenefitParameterDetailPage clickReturntoBenefitParameters(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoBenefitParameters,"ReturntoBenefitParameters");
		return this;
	}
	public BenefitParameterDetailPage clickDoesnotApplytoPTD(WebDriver driver)  {
		BrowserActions.click(driver, chkDoesnotApplytoPTD,"DoesnotApplytoPTD");
		return this;
	}
	public BenefitParameterDetailPage enterNumberofDays(WebDriver driver,String NumberofDays) {
		BrowserActions.type(driver, inpNumberofDays,NumberofDays, "NumberofDays");
		return this;
	}
	public BenefitParameterDetailPage enterPercentofWages(WebDriver driver,String PercentofWages) {
		BrowserActions.type(driver, inpPercentofWages,PercentofWages, "PercentofWages");
		return this;
	}
	public BenefitParameterDetailPage enterMaximumWeeklyBenefit(WebDriver driver,String MaximumWeeklyBenefit) {
		BrowserActions.type(driver, inpMaximumWeeklyBenefit,MaximumWeeklyBenefit, "MaximumWeeklyBenefit");
		return this;
	}
	public BenefitParameterDetailPage enterComments(WebDriver driver,String Comments) {
		BrowserActions.type(driver, inpComments,Comments, "Comments");
		return this;
	}
	public BenefitParameterDetailPage clickMinimumadjustedbyWeeklyWage(WebDriver driver)  {
		BrowserActions.click(driver, rdbMinimumadjustedbyWeeklyWage,"MinimumadjustedbyWeeklyWage");
		return this;
	}
	public BenefitParameterDetailPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public BenefitParameterDetailPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public BenefitParameterDetailPage enterMinimumWeeklyBenefit(WebDriver driver,String MinimumWeeklyBenefit) {
		BrowserActions.type(driver, inpMinimumWeeklyBenefit,MinimumWeeklyBenefit, "MinimumWeeklyBenefit");
		return this;
	}
	public BenefitParameterDetailPage enterEndDate(WebDriver driver,String EndDate) {
		BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
		return this;
	}
	public BenefitParameterDetailPage enterMinimumWeeklyBenefit_2(WebDriver driver,String MinimumWeeklyBenefit_2) {
		BrowserActions.type(driver, inpMinimumWeeklyBenefit_2,MinimumWeeklyBenefit_2, "MinimumWeeklyBenefit_2");
		return this;
	}
	public BenefitParameterDetailPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public BenefitParameterDetailPage enterMinimumWeeklyBenefit_6(WebDriver driver,String MinimumWeeklyBenefit_6) {
		BrowserActions.type(driver, inpMinimumWeeklyBenefit_6,MinimumWeeklyBenefit_6, "MinimumWeeklyBenefit_6");
		return this;
	}
	public BenefitParameterDetailPage enterMinimumWeeklyBenefit_9(WebDriver driver,String MinimumWeeklyBenefit_9) {
		BrowserActions.type(driver, inpMinimumWeeklyBenefit_9,MinimumWeeklyBenefit_9, "MinimumWeeklyBenefit_9");
		return this;
	}
	public BenefitParameterDetailPage enterPercentageofWages_4(WebDriver driver,String PercentageofWages_4) {
		BrowserActions.type(driver, inpPercentageofWages_4,PercentageofWages_4, "PercentageofWages_4");
		return this;
	}
	public BenefitParameterDetailPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}



}
