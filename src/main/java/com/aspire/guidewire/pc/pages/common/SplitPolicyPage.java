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

public class SplitPolicyPage extends LoadableComponent<SplitPolicyPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-CopyPolicyDV-vehicleCopierIterator-0-VehicleCopierInputGroup-IncludeAddlInterests']", AI = false)
	public WebElement chkIncludeAdditionalInterests_1;

	@IFindBy(how = How.CSS, using = "#SplitPolicy-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SplitPolicy-CreateButton>div[role='button']", AI = false)
	public WebElement btnCreateSubmissions;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-CopyPolicyDV-vehicleCopierIterator-0-VehicleCopierInputGroup-IncludeAllCoverages']", AI = false)
	public WebElement chkIncludeAllCoverages;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-CopyPolicyDV-vehicleCopierIterator-0-VehicleCopierInputGroup-IncludeAddlInterests']", AI = false)
	public WebElement chkIncludeAdditionalInterests;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-Account']", AI = false)
	public WebElement inpAccountNumber_1;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-1-Coverage']", AI = false)
	public WebElement chkMedicalPayments_1;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-1-Coverage']", AI = false)
	public WebElement chkMedicalPayments;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-CopyPolicyDV-policyDriverCopierIterator-0-PolicyDriver']", AI = false)
	public WebElement chkGWTESTScriptTransferDemo;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-Account']", AI = false)
	public WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "select[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-QuoteType']", AI = false)
	public WebElement drpQuoteType_1;

	@IFindBy(how = How.CSS, using = "#SplitPolicy-SplitPolicy2-DividePolicyPanelSet-Account-SelectAccount", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-4-Coverage']", AI = false)
	public WebElement chkCoverage_1;

	@IFindBy(how = How.CSS, using = "#SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-LineCardTab", AI = false)
	public WebElement btnPersonalAutoLine_1;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-2-Coverage']", AI = false)
	public WebElement chkMexicoCoverageLimited_1;

	@IFindBy(how = How.CSS, using = "#SplitPolicy-SplitPolicy1-DividePolicyPanelSet-Account-SelectAccount", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-DefaultPPEffDate']", AI = false)
	public WebElement inpDefaultEffectiveDate_1;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-AccountName']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-3-Coverage']", AI = false)
	public WebElement chkUninsuredMotoristBodilyInjury_1;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-3-Coverage']", AI = false)
	public WebElement chkUninsuredMotoristBodilyInjury;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-0-Coverage']", AI = false)
	public WebElement chkCoverage;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-DefaultPPEffDate']", AI = false)
	public WebElement inpDefaultEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-CopyPolicyDV-coverageCopierIterator-2-Coverage']", AI = false)
	public WebElement chkMexicoCoverageLimited;

	@IFindBy(how = How.CSS, using = "select[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-PrimaryNamedInsuredCandidate']", AI = false)
	public WebElement drpPrimaryNamedInsured_1;

	@IFindBy(how = How.CSS, using = "#SplitPolicy-CancelButton>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-CopyPolicyDV-vehicleCopierIterator-0-VehicleCopierInputGroup-IncludeAllCoverages']", AI = false)
	public WebElement chkIncludeAllCoverages_1;

	@IFindBy(how = How.CSS, using = "select[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-PrimaryNamedInsuredCandidate']", AI = false)
	public WebElement drpPrimaryNamedInsured;

	@IFindBy(how = How.CSS, using = "#SplitPolicy-SplitPolicy1-DividePolicyPanelSet-0-LineCardTab", AI = false)
	public WebElement btnPersonalAutoLine;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-AccountName']", AI = false)
	public WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='SplitPolicy-SplitPolicy2-DividePolicyPanelSet-0-CopyPolicyDV-policyDriverCopierIterator-0-PolicyDriver']", AI = false)
	public WebElement chkGWTESTScriptTransferDemo_1;

	@IFindBy(how = How.CSS, using = "select[name='SplitPolicy-SplitPolicy1-DividePolicyPanelSet-QuoteType']", AI = false)
	public WebElement drpQuoteType;

	public SplitPolicyPage(){
	}

	public SplitPolicyPage(WebDriver driver){
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
public SplitPolicyPage clickIncludeAdditionalInterests_1(WebDriver driver)  {
					BrowserActions.click(driver, chkIncludeAdditionalInterests_1,"IncludeAdditionalInterests_1");
				    return this;
			}
public SplitPolicyPage clickCreateSubmissions(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateSubmissions,"CreateSubmissions");
				    return this;
			}
public SplitPolicyPage clickIncludeAllCoverages(WebDriver driver)  {
					BrowserActions.click(driver, chkIncludeAllCoverages,"IncludeAllCoverages");
				    return this;
			}
public SplitPolicyPage clickIncludeAdditionalInterests(WebDriver driver)  {
					BrowserActions.click(driver, chkIncludeAdditionalInterests,"IncludeAdditionalInterests");
				    return this;
			}
public SplitPolicyPage enterAccountNumber_1(WebDriver driver,String AccountNumber_1) {
		            BrowserActions.type(driver, inpAccountNumber_1,AccountNumber_1, "AccountNumber_1");
			        return this;
           }
public SplitPolicyPage clickMedicalPayments_1(WebDriver driver)  {
					BrowserActions.click(driver, chkMedicalPayments_1,"MedicalPayments_1");
				    return this;
			}
public SplitPolicyPage clickMedicalPayments(WebDriver driver)  {
					BrowserActions.click(driver, chkMedicalPayments,"MedicalPayments");
				    return this;
			}
public SplitPolicyPage clickGWTESTScriptTransferDemo(WebDriver driver)  {
					BrowserActions.click(driver, chkGWTESTScriptTransferDemo,"GWTESTScriptTransferDemo");
				    return this;
			}
public SplitPolicyPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		            BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
			        return this;
           }
public SplitPolicyPage selectQuoteType_1(WebDriver driver,String QuoteType_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpQuoteType_1,QuoteType_1,"QuoteType_1");
				    return this;
			}
public SplitPolicyPage clickSearch_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_1,"Search_1");
				    return this;
			}
public SplitPolicyPage clickCoverage_1(WebDriver driver)  {
					BrowserActions.click(driver, chkCoverage_1,"Coverage_1");
				    return this;
			}
public SplitPolicyPage clickPersonalAutoLine_1(WebDriver driver)  {
					BrowserActions.click(driver, btnPersonalAutoLine_1,"PersonalAutoLine_1");
				    return this;
			}
public SplitPolicyPage clickMexicoCoverageLimited_1(WebDriver driver)  {
					BrowserActions.click(driver, chkMexicoCoverageLimited_1,"MexicoCoverageLimited_1");
				    return this;
			}
public SplitPolicyPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public SplitPolicyPage enterDefaultEffectiveDate_1(WebDriver driver,String DefaultEffectiveDate_1) {
		            BrowserActions.type(driver, inpDefaultEffectiveDate_1,DefaultEffectiveDate_1, "DefaultEffectiveDate_1");
			        return this;
           }
public SplitPolicyPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public SplitPolicyPage clickUninsuredMotoristBodilyInjury_1(WebDriver driver)  {
					BrowserActions.click(driver, chkUninsuredMotoristBodilyInjury_1,"UninsuredMotoristBodilyInjury_1");
				    return this;
			}
public SplitPolicyPage clickUninsuredMotoristBodilyInjury(WebDriver driver)  {
					BrowserActions.click(driver, chkUninsuredMotoristBodilyInjury,"UninsuredMotoristBodilyInjury");
				    return this;
			}
public SplitPolicyPage clickCoverage(WebDriver driver)  {
					BrowserActions.click(driver, chkCoverage,"Coverage");
				    return this;
			}
public SplitPolicyPage enterDefaultEffectiveDate(WebDriver driver,String DefaultEffectiveDate) {
		            BrowserActions.type(driver, inpDefaultEffectiveDate,DefaultEffectiveDate, "DefaultEffectiveDate");
			        return this;
           }
public SplitPolicyPage clickMexicoCoverageLimited(WebDriver driver)  {
					BrowserActions.click(driver, chkMexicoCoverageLimited,"MexicoCoverageLimited");
				    return this;
			}
public SplitPolicyPage selectPrimaryNamedInsured_1(WebDriver driver,String PrimaryNamedInsured_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryNamedInsured_1,PrimaryNamedInsured_1,"PrimaryNamedInsured_1");
				    return this;
			}
public SplitPolicyPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public SplitPolicyPage clickIncludeAllCoverages_1(WebDriver driver)  {
					BrowserActions.click(driver, chkIncludeAllCoverages_1,"IncludeAllCoverages_1");
				    return this;
			}
public SplitPolicyPage selectPrimaryNamedInsured(WebDriver driver,String PrimaryNamedInsured)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryNamedInsured,PrimaryNamedInsured,"PrimaryNamedInsured");
				    return this;
			}
public SplitPolicyPage clickPersonalAutoLine(WebDriver driver)  {
					BrowserActions.click(driver, btnPersonalAutoLine,"PersonalAutoLine");
				    return this;
			}
public SplitPolicyPage enterName_1(WebDriver driver,String Name_1) {
		            BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
			        return this;
           }
public SplitPolicyPage clickGWTESTScriptTransferDemo_1(WebDriver driver)  {
					BrowserActions.click(driver, chkGWTESTScriptTransferDemo_1,"GWTESTScriptTransferDemo_1");
				    return this;
			}
public SplitPolicyPage selectQuoteType(WebDriver driver,String QuoteType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpQuoteType,QuoteType,"QuoteType");
				    return this;
			}
}
