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

public class CompensabilityParameterDetailPage extends LoadableComponent<CompensabilityParameterDetailPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-__crumb__", AI = false)
	private WebElement btn__crumb__;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriodPopup-DenialPeriodDV-ExpiryDate']", AI = false)
	private WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriodPopup-DenialPeriodDV-JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriodPopup-DenialPeriodDV-BenefitPaymentAcceptance']", AI = false)
	private WebElement rdbBenefitPaymentAcceptance;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-DenialPeriodDV-ExpiryDate_dateIcon", AI = false)
	private WebElement btnExpirationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-DenialPeriodDV-EffectiveDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriodPopup-DenialPeriodDV-TargetDaysFromNotice']", AI = false)
	private WebElement inpTargetDaysFromNoticey;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriodPopup-DenialPeriodDV-EffectiveDate']", AI = false)
	private WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriodPopup-DenialPeriodDV-DueDateFormula']", AI = false)
	private WebElement drpDenialPeriodFormula;

	@IFindBy(how = How.CSS, using = "select[name='DenialPeriodPopup-DenialPeriodDV-TargetIncludeDays']", AI = false)
	private WebElement drpTargetIncludeDays;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-DenialPeriodDV-AcceptDocumentTemplate-SelectAcceptDocumentTemplate", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='DenialPeriodPopup-DenialPeriodDV-TargetDaysFromLoss']", AI = false)
	private WebElement inpTargetDaysFromLossx;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-DenialPeriodDV_tb-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-DenialPeriodDV_tb-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-DenialPeriodDV-RejectDocumentTemplate-SelectRejectDocumentTemplate", AI = false)
	private WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "#DenialPeriodPopup-DenialPeriodDV_tb-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	public CompensabilityParameterDetailPage(){
	}

	public CompensabilityParameterDetailPage(WebDriver driver) throws Exception{
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
}public CompensabilityParameterDetailPage click__crumb__(WebDriver driver)  {
					BrowserActions.click(driver, btn__crumb__,"__crumb__");
				    return this;
			}
public CompensabilityParameterDetailPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		            BrowserActions.type(driver, inpExpirationDate,ExpirationDate, "ExpirationDate");
			        return this;
           }
public CompensabilityParameterDetailPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public CompensabilityParameterDetailPage clickBenefitPaymentAcceptance(WebDriver driver)  {
					BrowserActions.click(driver, rdbBenefitPaymentAcceptance,"BenefitPaymentAcceptance");
				    return this;
			}
public CompensabilityParameterDetailPage clickExpirationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnExpirationDateDateIcon,"ExpirationDateDateIcon");
				    return this;
			}
public CompensabilityParameterDetailPage clickEffectiveDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEffectiveDateDateIcon,"EffectiveDateDateIcon");
				    return this;
			}
public CompensabilityParameterDetailPage enterTargetDaysFromNoticey(WebDriver driver,String TargetDaysFromNoticey) {
		            BrowserActions.type(driver, inpTargetDaysFromNoticey,TargetDaysFromNoticey, "TargetDaysFromNoticey");
			        return this;
           }
public CompensabilityParameterDetailPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		            BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
			        return this;
           }
public CompensabilityParameterDetailPage selectDenialPeriodFormula(WebDriver driver,String DenialPeriodFormula)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDenialPeriodFormula,DenialPeriodFormula,true,"DenialPeriodFormula");
				    return this;
			}
public CompensabilityParameterDetailPage selectTargetIncludeDays(WebDriver driver,String TargetIncludeDays)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTargetIncludeDays,TargetIncludeDays,true,"TargetIncludeDays");
				    return this;
			}
public CompensabilityParameterDetailPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public CompensabilityParameterDetailPage enterTargetDaysFromLossx(WebDriver driver,String TargetDaysFromLossx) {
		            BrowserActions.type(driver, inpTargetDaysFromLossx,TargetDaysFromLossx, "TargetDaysFromLossx");
			        return this;
           }
public CompensabilityParameterDetailPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public CompensabilityParameterDetailPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public CompensabilityParameterDetailPage clickSearch_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_1,"Search_1");
				    return this;
			}
public CompensabilityParameterDetailPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
}
