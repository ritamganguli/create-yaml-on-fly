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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchChecksPage extends LoadableComponent<SearchChecksPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public CheckSearchResults checksearchresultsTable;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByUser']", AI = false)
	private WebElement drpApprovedByUser;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByGroup-ApprovedByGroupMenuIcon>div[role='button']", AI = false)
	private WebElement btnApprovedByGroupMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-TaxID']", AI = false)
	private WebElement inpPayeeTaxID;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByUser-ApprovedByUserMenuIcon>div[role='button']", AI = false)
	private WebElement btnApprovedByUserMenuIcon;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-CreatedBy-CreatedByUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser_1;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialCurrencyLabel']", AI = false)
	private WebElement inpCheckTotal;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByGroup']", AI = false)
	private WebElement drpApprovedByGroup;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-CreatedBy']", AI = false)
	private WebElement drpCreatedBy;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByUser-ApprovedByUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpPayeeLastName;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-CheckNumber']", AI = false)
	private WebElement inpCheckNumber;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-CreatedBy-CreatedByMenuIcon>div[role='button']", AI = false)
	private WebElement btnCreatedByMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-DateSearch-DateSearchEndDate']", AI = false)
	private WebElement inpTo;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-CheckSearchResultsLV_tb-PaymentSearch_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-DateSearch-DateSearchEndDate_dateIcon", AI = false)
	private WebElement btnToDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialExpressionTypeLabel']", AI = false)
	private WebElement inpCheckTotal_3;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialAmountStartLabel']", AI = false)
	private WebElement inpCheckTotal_5;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-CreatedBy-CreatedByUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser_2;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialAmountEndLabel']", AI = false)
	private WebElement inpCheckTotal_7;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialAmountStart']", AI = false)
	private WebElement inpCheckTotal_6;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-IncludeSubGroups']", AI = false)
	private WebElement rdbIncludeChildGroups;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByGroup-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSearchforGroup;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialChosenOption']", AI = false)
	private WebElement drpCheckTotal_4;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-DateSearch-DateSearchChosenOption']", AI = false)
	private WebElement drpDateSearchChosenOption;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-DateSearch-DateSearchStartDate']", AI = false)
	private WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ClaimNumber']", AI = false)
	private WebElement inpClaimNumber;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-PayTo']", AI = false)
	private WebElement inpPayTo;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-DateSearch-DateSearchRangeValue']", AI = false)
	private WebElement drpSince;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByUser-ApprovedByUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpPayeeFirstName;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-DateSearch-DateSearchStartDate_dateIcon", AI = false)
	private WebElement btnFromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "#PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-ApprovedByGroup-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSelectGroup;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpPayeeOrganizationName;

	@IFindBy(how = How.CSS, using = "select[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialCurrency']", AI = false)
	private WebElement drpCheckTotal;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchOptionalInputSet-FinancialAmountEnd']", AI = false)
	private WebElement inpCheckTotal_8;

	@IFindBy(how = How.CSS, using = "input[name='PaymentSearch-PaymentSearchScreen-PaymentSearchDV-PaymentSearchRequiredInputSet-InvoiceNumber']", AI = false)
	private WebElement inpInvoiceNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Insured']", AI = false)
	private WebElement txtInsured;
	
	@IFindBy(how = How.CSS, using = "td[id$='LV-0-PolicyID_Cell']", AI = false)
	private WebElement txtPolicy;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Claimant']", AI = false)
	private WebElement txtClaimant;
	
	@IFindBy(how = How.CSS, using = "div[id$='-0-Status']", AI = false)
	private WebElement txtStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-LossDate']", AI = false)
	private WebElement txtLossDate;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Subject']", AI = false)
	private WebElement txtSubject;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-PayTo']", AI = false)
	private WebElement txtPayTo;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Amount']", AI = false)
	private WebElement txtAmount;




	public SearchChecksPage(){
	}

	public SearchChecksPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		checksearchresultsTable = new CheckSearchResults();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpInvoiceNumber))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public SearchChecksPage selectApprovedByUser(WebDriver driver,String ApprovedByUser)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpApprovedByUser,ApprovedByUser,"ApprovedByUser");
				    return this;
			}
public SearchChecksPage clickApprovedByGroupMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnApprovedByGroupMenuIcon,"ApprovedByGroupMenuIcon");
				    return this;
			}
public SearchChecksPage enterPayeeTaxID(WebDriver driver,String PayeeTaxID) {
		            BrowserActions.type(driver, inpPayeeTaxID,PayeeTaxID, "PayeeTaxID");
			        return this;
           }
public SearchChecksPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public SearchChecksPage clickApprovedByUserMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnApprovedByUserMenuIcon,"ApprovedByUserMenuIcon");
				    return this;
			}
public SearchChecksPage clickSearchforaUser_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforaUser_1,"SearchforaUser_1");
				    return this;
			}
public SearchChecksPage enterCheckTotal(WebDriver driver,String CheckTotal) {
		            BrowserActions.type(driver, inpCheckTotal,CheckTotal, "CheckTotal");
			        return this;
           }
public SearchChecksPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public SearchChecksPage selectApprovedByGroup(WebDriver driver,String ApprovedByGroup)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpApprovedByGroup,ApprovedByGroup,"ApprovedByGroup");
				    return this;
			}
public SearchChecksPage selectCreatedBy(WebDriver driver,String CreatedBy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCreatedBy,CreatedBy,"CreatedBy");
				    return this;
			}
public SearchChecksPage clickSearchforaUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
				    return this;
			}
public SearchChecksPage enterPayeeLastName(WebDriver driver,String PayeeLastName) {
		            BrowserActions.type(driver, inpPayeeLastName,PayeeLastName, "PayeeLastName");
			        return this;
           }
public SearchChecksPage enterCheckNumber(WebDriver driver,String CheckNumber) {
		            BrowserActions.type(driver, inpCheckNumber,CheckNumber, "CheckNumber");
			        return this;
           }
public SearchChecksPage clickCreatedByMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreatedByMenuIcon,"CreatedByMenuIcon");
				    return this;
			}
public SearchChecksPage enterTo(WebDriver driver,String To) {
		            BrowserActions.type(driver, inpTo,To, "To");
			        return this;
           }
public SearchChecksPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public SearchChecksPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
public SearchChecksPage clickToDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnToDateIcon,"ToDateIcon");
				    return this;
			}
public SearchChecksPage enterCheckTotal_3(WebDriver driver,String CheckTotal_3) {
		            BrowserActions.type(driver, inpCheckTotal_3,CheckTotal_3, "CheckTotal_3");
			        return this;
           }
public SearchChecksPage enterCheckTotal_5(WebDriver driver,String CheckTotal_5) {
		            BrowserActions.type(driver, inpCheckTotal_5,CheckTotal_5, "CheckTotal_5");
			        return this;
           }
public SearchChecksPage clickSelectUser_2(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser_2,"SelectUser_2");
				    return this;
			}
public SearchChecksPage enterCheckTotal_7(WebDriver driver,String CheckTotal_7) {
		            BrowserActions.type(driver, inpCheckTotal_7,CheckTotal_7, "CheckTotal_7");
			        return this;
           }
public SearchChecksPage enterCheckTotal_6(WebDriver driver,String CheckTotal_6) {
		            BrowserActions.type(driver, inpCheckTotal_6,CheckTotal_6, "CheckTotal_6");
			        return this;
           }
public SearchChecksPage clickIncludeChildGroups(WebDriver driver)  {
					BrowserActions.click(driver, rdbIncludeChildGroups,"IncludeChildGroups");
				    return this;
			}
public SearchChecksPage clickSearchforGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
				    return this;
			}
public SearchChecksPage selectCheckTotal_4(WebDriver driver,String CheckTotal_4)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckTotal_4,CheckTotal_4,"CheckTotal_4");
				    return this;
			}
public SearchChecksPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public SearchChecksPage selectDateSearchChosenOption(WebDriver driver,String DateSearchChosenOption)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDateSearchChosenOption,DateSearchChosenOption,"DateSearchChosenOption");
				    return this;
			}
public SearchChecksPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public SearchChecksPage enterFrom(WebDriver driver,String From) {
		            BrowserActions.type(driver, inpFrom,From, "From");
			        return this;
           }
public SearchChecksPage enterClaimNumber(WebDriver driver,String ClaimNumber) {
		            BrowserActions.type(driver, inpClaimNumber,ClaimNumber, "ClaimNumber");
			        return this;
           }
public SearchChecksPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public SearchChecksPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public SearchChecksPage enterPayTo(WebDriver driver,String PayTo) {
		            BrowserActions.type(driver, inpPayTo,PayTo, "PayTo");
			        return this;
           }
public SearchChecksPage selectSince(WebDriver driver,String Since)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSince,Since,"Since");
				    return this;
			}
public SearchChecksPage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public SearchChecksPage enterPayeeFirstName(WebDriver driver,String PayeeFirstName) {
		            BrowserActions.type(driver, inpPayeeFirstName,PayeeFirstName, "PayeeFirstName");
			        return this;
           }
public SearchChecksPage clickFromDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFromDateIcon,"FromDateIcon");
				    return this;
			}
public SearchChecksPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public SearchChecksPage clickSelectGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
				    return this;
			}
public SearchChecksPage enterPayeeOrganizationName(WebDriver driver,String PayeeOrganizationName) {
		            BrowserActions.type(driver, inpPayeeOrganizationName,PayeeOrganizationName, "PayeeOrganizationName");
			        return this;
           }
public SearchChecksPage selectCheckTotal(WebDriver driver,String CheckTotal)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckTotal,CheckTotal,"CheckTotal");
				    return this;
			}
public SearchChecksPage enterCheckTotal_8(WebDriver driver,String CheckTotal_8) {
		            BrowserActions.type(driver, inpCheckTotal_8,CheckTotal_8, "CheckTotal_8");
			        return this;
           }
public SearchChecksPage enterInvoiceNumber(WebDriver driver,String InvoiceNumber) {
		            BrowserActions.type(driver, inpInvoiceNumber,InvoiceNumber, "InvoiceNumber");
			        return this;
           }
public SearchChecksPage verifyPayTo(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtPayTo,"Pay To");
Log.messageStep("PayTo is displayed",DriverManager.getDriver());		
return this;
}
public SearchChecksPage verifyStatusValue(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtStatus,"Status Value");
Log.messageStep("Status is displayed",DriverManager.getDriver());		
return this;
}
public SearchChecksPage verifyAmountvalue(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtAmount,"Amount Value");
Log.messageStep("Amount is displayed",DriverManager.getDriver());		
return this;
}
}
