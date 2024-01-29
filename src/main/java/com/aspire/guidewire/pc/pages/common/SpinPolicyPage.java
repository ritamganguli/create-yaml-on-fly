package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
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

public class SpinPolicyPage extends LoadableComponent<SpinPolicyPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-vehicleCopierIterator-0-VehicleCopierInputGroup-IncludeAllCoverages']", AI = false)
	public WebElement chkIncludeAllCoverages;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-vehicleCopierIterator-0-VehicleCopierInputGroup-IncludeAddlInterests']", AI = false)
	public WebElement chkIncludeAdditionalInterests;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-1-Coverage']", AI = false)
	public WebElement chkMedicalPayments;

	@IFindBy(how = How.CSS, using = "#SpinPolicy-SpinPolicy-DividePolicyPanelSet-Account-SelectAccount", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-policyDriverCopierIterator-0-PolicyDriver']", AI = false)
	public WebElement chkMathewThomas;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-5-Coverage']", AI = false)
	public WebElement chkUninsuredMotoristBodilyInjury;

	@IFindBy(how = How.CSS, using = "#SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-LineCardTab", AI = false)
	public WebElement btnPersonalAutoLine;

	@IFindBy(how = How.CSS, using = "select[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-QuoteType']", AI = false)
	public WebElement drpQuoteType;

	@IFindBy(how = How.CSS, using = "#SpinPolicy-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-Account']", AI = false)
	public WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-3-Coverage']", AI = false)
	public WebElement chkPIPFlorida;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-6-Coverage']", AI = false)
	public WebElement chkCoverage_1;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-AccountName']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-0-Coverage']", AI = false)
	public WebElement chkCoverage;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-DefaultPPEffDate']", AI = false)
	public WebElement inpDefaultEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-2-Coverage']", AI = false)
	public WebElement chkMexicoCoverageLimited;

	@IFindBy(how = How.CSS, using = "#SpinPolicy-CancelButton>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='SpinPolicy-SpinPolicy-DividePolicyPanelSet-PrimaryNamedInsuredCandidate']", AI = false)
	public WebElement drpPrimaryNamedInsured;

	@IFindBy(how = How.CSS, using = "#SpinPolicy-CreateButton>div[role='button']", AI = false)
	public WebElement btnCreateSubmission;

	public SpinPolicyPage(){
	}

	public SpinPolicyPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
public SpinPolicyPage clickIncludeAllCoverages(WebDriver driver)  {
					BrowserActions.click(driver, chkIncludeAllCoverages,"IncludeAllCoverages");
				    return this;
			}
public SpinPolicyPage clickIncludeAdditionalInterests(WebDriver driver)  {
					BrowserActions.click(driver, chkIncludeAdditionalInterests,"IncludeAdditionalInterests");
				    return this;
			}
public SpinPolicyPage clickMedicalPayments(WebDriver driver)  {
					BrowserActions.click(driver, chkMedicalPayments,"MedicalPayments");
				    return this;
			}
public SpinPolicyPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public SpinPolicyPage clickMathewThomas(WebDriver driver)  {
					BrowserActions.click(driver, chkMathewThomas,"MathewThomas");
				    return this;
			}
public SpinPolicyPage clickUninsuredMotoristBodilyInjury(WebDriver driver)  {
					BrowserActions.click(driver, chkUninsuredMotoristBodilyInjury,"UninsuredMotoristBodilyInjury");
				    return this;
			}
public SpinPolicyPage clickPersonalAutoLine(WebDriver driver)  {
					BrowserActions.click(driver, btnPersonalAutoLine,"PersonalAutoLine");
				    return this;
			}
public SpinPolicyPage selectQuoteType(WebDriver driver,String QuoteType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpQuoteType,QuoteType,"QuoteType");
				    return this;
			}
public SpinPolicyPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		            BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
			        return this;
           }
public SpinPolicyPage clickPIPFlorida(WebDriver driver)  {
					BrowserActions.click(driver, chkPIPFlorida,"PIPFlorida");
				    return this;
			}
public SpinPolicyPage clickCoverage_1(WebDriver driver)  {
					BrowserActions.click(driver, chkCoverage_1,"Coverage_1");
				    return this;
			}
public SpinPolicyPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public SpinPolicyPage clickCoverage(WebDriver driver)  {
					BrowserActions.click(driver, chkCoverage,"Coverage");
				    return this;
			}
public SpinPolicyPage enterDefaultEffectiveDate(WebDriver driver,String DefaultEffectiveDate) {
		            BrowserActions.type(driver, inpDefaultEffectiveDate,DefaultEffectiveDate, "DefaultEffectiveDate");
			        return this;
           }
public SpinPolicyPage clickMexicoCoverageLimited(WebDriver driver)  {
					BrowserActions.click(driver, chkMexicoCoverageLimited,"MexicoCoverageLimited");
				    return this;
			}
public SpinPolicyPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public SpinPolicyPage selectPrimaryNamedInsured(WebDriver driver,String PrimaryNamedInsured)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryNamedInsured,PrimaryNamedInsured,"PrimaryNamedInsured");
				    return this;
			}
public SpinPolicyPage clickCreateSubmission(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateSubmission,"CreateSubmission");
				    return this;
			}
}
