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

public class SetCheckInstructionsPage extends LoadableComponent<SetCheckInstructionsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-ServicePeriod_Start']", AI = false)
	public WebElement inpServicePeriodStart;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_PrevServiceDate']", AI = false)
	public WebElement inpCheck_PrevServiceDate;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Next>div[role='button']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-Check_ClaimantMenuIcon>div[role='button']", AI = false)
	public WebElement btnCheck_ClaimantMenuIcon;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-ServicePeriod_Start_dateIcon", AI = false)
	public WebElement btnServicePeriodStartDateIcon;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-ServicePeriod_End_dateIcon", AI = false)
	public WebElement btnServicePeriodEndDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-ServicePeriod_End']", AI = false)
	public WebElement inpServicePeriodEnd;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant']", AI = false)
	public WebElement drpClaimant;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-PayTo_AccountName textarea", AI = false)
	public WebElement inpNameontheAccount;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_DateOfService']", AI = false)
	public WebElement inpDateofService;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_InvoiceNumber']", AI = false)
	public WebElement inpInvoiceNumber;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_MailTo']", AI = false)
	public WebElement inpMailingAddress;

	@IFindBy(how = How.CSS, using = "div[id$='-Finish']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckInstructions>div[role='menuitem']", AI = false)
	public WebElement btnInstructions;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_DateOfService_dateIcon", AI = false)
	public WebElement btnDateofServiceDateIcon;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckPayees>div[role='menuitem']", AI = false)
	public WebElement btnPayees;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Memo']", AI = false)
	public WebElement inpMemo;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckPayments>div[role='menuitem']", AI = false)
	public WebElement btnPayments;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckInstructionsScreen-ManualCheckPaymentInstructionsDV-CheckWizardCheckSummaryInputSet-Check_PayTo']", AI = false)
	public WebElement inpPayToTheOrderOf;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	public SetCheckInstructionsPage(){
	}

	public SetCheckInstructionsPage(WebDriver driver) {
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
}public SetCheckInstructionsPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public SetCheckInstructionsPage enterServicePeriodStart(WebDriver driver,String ServicePeriodStart) {
		            BrowserActions.type(driver, inpServicePeriodStart,ServicePeriodStart, "ServicePeriodStart");
			        return this;
           }
public SetCheckInstructionsPage enterCheck_PrevServiceDate(WebDriver driver,String Check_PrevServiceDate) {
		            BrowserActions.type(driver, inpCheck_PrevServiceDate,Check_PrevServiceDate, "Check_PrevServiceDate");
			        return this;
           }
public SetCheckInstructionsPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public SetCheckInstructionsPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,"Next");
				    return this;
			}
public SetCheckInstructionsPage clickCheck_ClaimantMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCheck_ClaimantMenuIcon,"Check_ClaimantMenuIcon");
				    return this;
			}
public SetCheckInstructionsPage clickServicePeriodStartDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnServicePeriodStartDateIcon,"ServicePeriodStartDateIcon");
				    return this;
			}
public SetCheckInstructionsPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public SetCheckInstructionsPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public SetCheckInstructionsPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public SetCheckInstructionsPage clickServicePeriodEndDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnServicePeriodEndDateIcon,"ServicePeriodEndDateIcon");
				    return this;
			}
public SetCheckInstructionsPage enterServicePeriodEnd(WebDriver driver,String ServicePeriodEnd) {
		            BrowserActions.type(driver, inpServicePeriodEnd,ServicePeriodEnd, "ServicePeriodEnd");
			        return this;
           }
public SetCheckInstructionsPage selectClaimant(WebDriver driver,String Claimant)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClaimant,Claimant,"Claimant");
				    return this;
			}
public SetCheckInstructionsPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public SetCheckInstructionsPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public SetCheckInstructionsPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public SetCheckInstructionsPage enterNameontheAccount(WebDriver driver,String NameontheAccount) {
		            BrowserActions.type(driver, inpNameontheAccount,NameontheAccount, "NameontheAccount");
			        return this;
           }
public SetCheckInstructionsPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public SetCheckInstructionsPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public SetCheckInstructionsPage enterDateofService(WebDriver driver,String DateofService) {
		            BrowserActions.type(driver, inpDateofService,DateofService, "DateofService");
			        return this;
           }
public SetCheckInstructionsPage enterInvoiceNumber(WebDriver driver,String InvoiceNumber) {
		            BrowserActions.type(driver, inpInvoiceNumber,InvoiceNumber, "InvoiceNumber");
			        return this;
           }
public SetCheckInstructionsPage enterMailingAddress(WebDriver driver,String MailingAddress) {
		            BrowserActions.type(driver, inpMailingAddress,MailingAddress, "MailingAddress");
			        return this;
           }
public SetCheckInstructionsPage clickFinish(WebDriver driver)  {
					BrowserActions.click(driver, btnFinish,"Finish");
				    return this;
			}
public SetCheckInstructionsPage clickInstructions(WebDriver driver)  {
					BrowserActions.click(driver, btnInstructions,"Instructions");
				    return this;
			}
public SetCheckInstructionsPage clickDateofServiceDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateofServiceDateIcon,"DateofServiceDateIcon");
				    return this;
			}
public SetCheckInstructionsPage clickPayees(WebDriver driver)  {
					BrowserActions.click(driver, btnPayees,"Payees");
				    return this;
			}
public SetCheckInstructionsPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public SetCheckInstructionsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public SetCheckInstructionsPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public SetCheckInstructionsPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public SetCheckInstructionsPage enterMemo(WebDriver driver,String Memo) {
		            BrowserActions.type(driver, inpMemo,Memo, "Memo");
			        return this;
           }
public SetCheckInstructionsPage clickPayments(WebDriver driver)  {
					BrowserActions.click(driver, btnPayments,"Payments");
				    return this;
			}
public SetCheckInstructionsPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public SetCheckInstructionsPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public SetCheckInstructionsPage enterPayToTheOrderOf(WebDriver driver,String PayToTheOrderOf) {
		            BrowserActions.type(driver, inpPayToTheOrderOf,PayToTheOrderOf, "PayToTheOrderOf");
			        return this;
           }
public SetCheckInstructionsPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
}
