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

public class NewActivityClaimPage extends LoadableComponent<NewActivityClaimPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-IDCSDisabledAlert .gw-AlertBar--label", AI = false)
	private WebElement lblIDCSDisabledAlert;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_StartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_AssignActivity']", AI = false)
	private WebElement drpAssignTo;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_StartDate']", AI = false)
	private WebElement inpStartDate;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivity_UpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_DueDate_dateIcon", AI = false)
	private WebElement btnDueDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-Activity_ExternalOwnerMenuIcon>div[role='button']", AI = false)
	private WebElement btnActivity_ExternalOwnerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-IDMSUnavailableAlert-CloseBtn", AI = false)
	private WebElement btnClose_2;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-IDCSUnavailableAlert-CloseBtn", AI = false)
	private WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_EndDate']", AI = false)
	private WebElement inpEndDate;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-EmailTemplate-SelectEmailTemplate", AI = false)
	private WebElement btnSearch_4;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_CreateDocument-SelectActivity_CreateDocument", AI = false)
	private WebElement btnSearch_3;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-EmailTemplate']", AI = false)
	private WebElement inpEmailTemplate;

	@IFindBy(how = How.CSS, using = "select[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner']", AI = false)
	private WebElement drpExternalOwner;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_Mandatory']", AI = false)
	private WebElement rdbMandatory;

	@IFindBy(how = How.CSS, using = "select[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_RelatedTo']", AI = false)
	private WebElement drpRelatedTo;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_DueDate']", AI = false)
	private WebElement inpDueDate;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_EscalationDate']", AI = false)
	private WebElement inpEscalationDate;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-IDCSDisabledAlert-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-IDMSUnavailableAlert .gw-AlertBar--label", AI = false)
	private WebElement lblIDMSUnavailableAlert;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-IDCSUnavailableAlert .gw-AlertBar--label", AI = false)
	private WebElement lblIDCSUnavailableAlert;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_EscalationDate_dateIcon", AI = false)
	private WebElement btnEscalationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternallyOwned']", AI = false)
	private WebElement rdbExternallyOwned;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivity_CancelButton>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_Recurring']", AI = false)
	private WebElement rdbRecurring;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_AssignActivity-Activity_AssignActivity_PickerButton", AI = false)
	private WebElement btnActivity_AssignActivity_PickerButton;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_ExternalOwner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#NewActivity-NewActivityScreen-NewActivityDV-Activity_EndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "select[name='NewActivity-NewActivityScreen-NewActivityDV-Activity_Importance']", AI = false)
	private WebElement drpCalendarImportance;

	public NewActivityClaimPage(){
	}

	public NewActivityClaimPage(WebDriver driver) {
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
}public NewActivityClaimPage clickStartDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
				    return this;
			}
public NewActivityClaimPage selectAssignTo(WebDriver driver,String AssignTo)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAssignTo,AssignTo,"AssignTo");
				    return this;
			}
public NewActivityClaimPage enterStartDate(WebDriver driver,String StartDate) {
		            BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
			        return this;
           }
public NewActivityClaimPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public NewActivityClaimPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public NewActivityClaimPage clickDueDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateDateIcon,"DueDateDateIcon");
				    return this;
			}
public NewActivityClaimPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public NewActivityClaimPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public NewActivityClaimPage clickActivity_ExternalOwnerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnActivity_ExternalOwnerMenuIcon,"Activity_ExternalOwnerMenuIcon");
				    return this;
			}
public NewActivityClaimPage clickClose_2(WebDriver driver)  {
					BrowserActions.click(driver, btnClose_2,"Close_2");
				    return this;
			}
public NewActivityClaimPage clickClose_1(WebDriver driver)  {
					BrowserActions.click(driver, btnClose_1,"Close_1");
				    return this;
			}
public NewActivityClaimPage enterEndDate(WebDriver driver,String EndDate) {
		            BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
			        return this;
           }
public NewActivityClaimPage clickSearch_4(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_4,"Search_4");
				    return this;
			}
public NewActivityClaimPage clickSearch_3(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_3,"Search_3");
				    return this;
			}
public NewActivityClaimPage enterEmailTemplate(WebDriver driver,String EmailTemplate) {
		            BrowserActions.type(driver, inpEmailTemplate,EmailTemplate, "EmailTemplate");
			        return this;
           }
public NewActivityClaimPage selectExternalOwner(WebDriver driver,String ExternalOwner)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpExternalOwner,ExternalOwner,"ExternalOwner");
				    return this;
			}
public NewActivityClaimPage clickMandatory(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory,"Mandatory");
				    return this;
			}
public NewActivityClaimPage selectRelatedTo(WebDriver driver,String RelatedTo)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo,RelatedTo,"RelatedTo");
				    return this;
			}
public NewActivityClaimPage enterDueDate(WebDriver driver,String DueDate) {
		            BrowserActions.type(driver, inpDueDate,DueDate, "DueDate");
			        return this;
           }
public NewActivityClaimPage enterEscalationDate(WebDriver driver,String EscalationDate) {
		            BrowserActions.type(driver, inpEscalationDate,EscalationDate, "EscalationDate");
			        return this;
           }
public NewActivityClaimPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public NewActivityClaimPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public NewActivityClaimPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public NewActivityClaimPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public NewActivityClaimPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public NewActivityClaimPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public NewActivityClaimPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public NewActivityClaimPage clickEscalationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEscalationDateDateIcon,"EscalationDateDateIcon");
				    return this;
			}
public NewActivityClaimPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public NewActivityClaimPage clickExternallyOwned(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternallyOwned,"ExternallyOwned");
				    return this;
			}
public NewActivityClaimPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public NewActivityClaimPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public NewActivityClaimPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public NewActivityClaimPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewActivityClaimPage clickRecurring(WebDriver driver)  {
					BrowserActions.click(driver, rdbRecurring,"Recurring");
				    return this;
			}
public NewActivityClaimPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public NewActivityClaimPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public NewActivityClaimPage clickActivity_AssignActivity_PickerButton(WebDriver driver)  {
					BrowserActions.click(driver, btnActivity_AssignActivity_PickerButton,"Activity_AssignActivity_PickerButton");
				    return this;
			}
public NewActivityClaimPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public NewActivityClaimPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public NewActivityClaimPage clickEndDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
				    return this;
			}
public NewActivityClaimPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public NewActivityClaimPage selectCalendarImportance(WebDriver driver,String CalendarImportance)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCalendarImportance,CalendarImportance,"CalendarImportance");
				    return this;
			}
}
