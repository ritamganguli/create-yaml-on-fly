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

public class LossDetailsPage extends LoadableComponent<LossDetailsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public EditableFixedPropertyIncidents editablefixedpropertyincidentsTable;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-ISODetailsDV-ReceiveDate_dateIcon", AI = false)
	private WebElement btnLastresponsefromISODateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-LossDate']", AI = false)
	private WebElement inpDateofLoss;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-ReportedBy_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-ISODetailsDV-ReceiveDate']", AI = false)
	private WebElement inpLastresponsefromISO;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-MainContact_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_4;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Claim_EmploymentCourse']", AI = false)
	private WebElement rdbInCourseofEmployment;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-ReportedBy_Picker']", AI = false)
	private WebElement drpReportedBy;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-ISODetailsDV-KnownToISO']", AI = false)
	private WebElement rdbKnowntoISO;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Claim_Weather']", AI = false)
	private WebElement drpWeather;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-ReportedBy_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-ClaimLossDetails_RefreshButton>div[role='button']", AI = false)
	private WebElement btnRefreshResponses;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableInjuryIncidentsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_11;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-MainContact_Picker']", AI = false)
	private WebElement drpMainContact;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Catastrophe_CatastropheNumber']", AI = false)
	private WebElement drpCatastrophe;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-Claim_DetailsCardTab", AI = false)
	private WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-MainContact_Picker-MainContact_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnMainContact_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-ReportedBy_Picker-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_DateReportedToAgent']", AI = false)
	private WebElement inpDateReportedtoAgent;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableOfficialsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_12;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-LossDate_dateIcon", AI = false)
	private WebElement btnDateofLossDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableInjuryIncidentsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_10;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Claim_Properties-EditableFixedPropertyIncidentsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_7;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableContributingFactorsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_16;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableWitnessesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_14;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-ISODetailsDV-SendDate']", AI = false)
	private WebElement inpDatesenttoISO;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-MetroReportsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_18;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-ReportedBy_Picker-ReportedBy_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnReportedBy_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_ReportedByType']", AI = false)
	private WebElement drpRelationshiptoInsured;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_AtFaultPercentage']", AI = false)
	private WebElement inpInsuredsLiability;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableWitnessesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_15;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Claim_Properties-EditableFixedPropertyIncidentsLV-0-Address1']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableOfficialsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_13;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_FirstNoticeSuit']", AI = false)
	private WebElement rdbFirstNoticeSuit;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_HowReported']", AI = false)
	private WebElement drpHowReported;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-MainContact_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_3;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-MetroReportsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_19;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableContributingFactorsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_17;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableVehicleIncidentsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Claim_Properties-EditableFixedPropertyIncidentsLV-0-State']", AI = false)
	private WebElement drpState_9;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-Claim_ISOCardTab", AI = false)
	private WebElement btnISO;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-ISODetailsDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-MainContact_Picker-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_2;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-LossCause']", AI = false)
	private WebElement drpLossCause;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Claim_Properties-EditableFixedPropertyIncidentsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_6;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_MainContactType']", AI = false)
	private WebElement drpRelationshiptoInsured_5;

	@IFindBy(how = How.CSS, using = "input[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Claim_Properties-EditableFixedPropertyIncidentsLV-0-City']", AI = false)
	private WebElement inpCity_8;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_DateReportedToAgent_dateIcon", AI = false)
	private WebElement btnDateReportedtoAgentDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-ISODetailsDV-SendDate_dateIcon", AI = false)
	private WebElement btnDatesenttoISODateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-EditableVehicleIncidentsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-ISODetailsDV-ISOErrorMessage textarea", AI = false)
	private WebElement inpISOError;

	@IFindBy(how = How.CSS, using = "#ClaimLossDetails-ClaimLossDetailsScreen-ClaimLossDetails_SendToISOButton>div[role='button']", AI = false)
	private WebElement btnSendToISO;

	@IFindBy(how = How.CSS, using = "select[name='ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Notification_Fault']", AI = false)
	private WebElement drpFaultRating;
	
	@IFindBy(how = How.CSS, using = "div[id='Claim-MenuLinks-Claim_ClaimLossDetailsGroup']", AI = false)
	private WebElement btnLossDetails;
	
	@IFindBy(how = How.CSS, using = "input[id$='Claim_EmploymentInjury_0']", AI = false)
	private WebElement rdbYesInjuryDuringEmployment;
	
	@IFindBy(how = How.CSS, using = "input[id$='InjuredOnRegularJob_0']", AI = false)
	private WebElement rdbYesPerformingRegularJob;
	
	@IFindBy(how = How.CSS, using = "input[id$='EmployerQuestionsValidity_1']", AI = false)
	private WebElement rdbNoEmployerQuestionsClaim;
	
	@IFindBy(how = How.CSS, using = "input[id$='SafetyEquipmentProvided_0']", AI = false)
	private WebElement rdbYesSafetyEquipmentProvided;
	
	@IFindBy(how = How.CSS, using = "input[id$='SafetyEquipmentUsed_0']", AI = false)
	private WebElement rdbYesSafetyEquipmentUsed;
	
	@IFindBy(how = How.CSS, using = "input[id$='DrugsInvolved_1']", AI = false)
	private WebElement rdbNoDrugsInvolved;
	
	@IFindBy(how = How.CSS, using = "select[name$='CompensableStatus']", AI = false)
	private WebElement drpCompensability;

	public LossDetailsPage(){
	}

	public LossDetailsPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		editablefixedpropertyincidentsTable = new EditableFixedPropertyIncidents();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnEdit))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public LossDetailsPage clickLastresponsefromISODateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLastresponsefromISODateIcon,"LastresponsefromISODateIcon");
				    return this;
			}
public LossDetailsPage enterDateofLoss(WebDriver driver,String DateofLoss) {
		            BrowserActions.type(driver, inpDateofLoss,DateofLoss, "DateofLoss");
			        return this;
           }
public LossDetailsPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public LossDetailsPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public LossDetailsPage enterLastresponsefromISO(WebDriver driver,String LastresponsefromISO) {
		            BrowserActions.type(driver, inpLastresponsefromISO,LastresponsefromISO, "LastresponsefromISO");
			        return this;
           }
public LossDetailsPage clickViewContactDetails_4(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_4,"ViewContactDetails_4");
				    return this;
			}
public LossDetailsPage clickInCourseofEmployment(WebDriver driver)  {
					BrowserActions.click(driver, rdbInCourseofEmployment,"InCourseofEmployment");
				    return this;
			}
public LossDetailsPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public LossDetailsPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public LossDetailsPage selectReportedBy(WebDriver driver,String ReportedBy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReportedBy,ReportedBy,"ReportedBy");
				    return this;
			}
public LossDetailsPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public LossDetailsPage clickKnowntoISO(WebDriver driver)  {
					BrowserActions.click(driver, rdbKnowntoISO,"KnowntoISO");
				    return this;
			}
public LossDetailsPage selectWeather(WebDriver driver,String Weather)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpWeather,Weather,"Weather");
				    return this;
			}
public LossDetailsPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public LossDetailsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public LossDetailsPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public LossDetailsPage clickRefreshResponses(WebDriver driver)  {
					BrowserActions.click(driver, btnRefreshResponses,"RefreshResponses");
				    return this;
			}
public LossDetailsPage clickRemove_11(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_11,"Remove_11");
				    return this;
			}
public LossDetailsPage selectMainContact(WebDriver driver,String MainContact)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMainContact,MainContact,"MainContact");
				    return this;
			}
public LossDetailsPage selectCatastrophe(WebDriver driver,String Catastrophe)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCatastrophe,Catastrophe,"Catastrophe");
				    return this;
			}
public LossDetailsPage clickDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDetails,"Details");
				    return this;
			}
public LossDetailsPage clickMainContact_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnMainContact_PickerMenuIcon,"MainContact_PickerMenuIcon");
				    return this;
			}
public LossDetailsPage enterLocation(WebDriver driver,String Location) {
		            BrowserActions.type(driver, inpLocation,Location, "Location");
			        return this;
           }
public LossDetailsPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public LossDetailsPage enterDateReportedtoAgent(WebDriver driver,String DateReportedtoAgent) {
		            BrowserActions.type(driver, inpDateReportedtoAgent,DateReportedtoAgent, "DateReportedtoAgent");
			        return this;
           }
public LossDetailsPage clickAdd_12(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_12,"Add_12");
				    return this;
			}
public LossDetailsPage clickDateofLossDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateofLossDateIcon,"DateofLossDateIcon");
				    return this;
			}
public LossDetailsPage clickAdd_10(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_10,"Add_10");
				    return this;
			}
public LossDetailsPage clickRemove_7(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_7,"Remove_7");
				    return this;
			}
public LossDetailsPage clickAdd_16(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_16,"Add_16");
				    return this;
			}
public LossDetailsPage clickAdd_14(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_14,"Add_14");
				    return this;
			}
public LossDetailsPage enterDatesenttoISO(WebDriver driver,String DatesenttoISO) {
		            BrowserActions.type(driver, inpDatesenttoISO,DatesenttoISO, "DatesenttoISO");
			        return this;
           }
public LossDetailsPage clickAdd_18(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_18,"Add_18");
				    return this;
			}
public LossDetailsPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public LossDetailsPage clickReportedBy_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReportedBy_PickerMenuIcon,"ReportedBy_PickerMenuIcon");
				    return this;
			}
public LossDetailsPage selectRelationshiptoInsured(WebDriver driver,String RelationshiptoInsured)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRelationshiptoInsured,RelationshiptoInsured,"RelationshiptoInsured");
				    return this;
			}
public LossDetailsPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public LossDetailsPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public LossDetailsPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public LossDetailsPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public LossDetailsPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public LossDetailsPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public LossDetailsPage enterInsuredsLiability(WebDriver driver,String InsuredsLiability) {
		            BrowserActions.type(driver, inpInsuredsLiability,InsuredsLiability, "InsuredsLiability");
			        return this;
           }
public LossDetailsPage clickRemove_15(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_15,"Remove_15");
				    return this;
			}
public LossDetailsPage selectLocation(WebDriver driver,String Location)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
				    return this;
			}
public LossDetailsPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public LossDetailsPage clickRemove_13(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_13,"Remove_13");
				    return this;
			}
public LossDetailsPage clickFirstNoticeSuit(WebDriver driver)  {
					BrowserActions.click(driver, rdbFirstNoticeSuit,"FirstNoticeSuit");
				    return this;
			}
public LossDetailsPage selectHowReported(WebDriver driver,String HowReported)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHowReported,HowReported,"HowReported");
				    return this;
			}
public LossDetailsPage clickSearch_3(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_3,"Search_3");
				    return this;
			}
public LossDetailsPage clickRemove_19(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_19,"Remove_19");
				    return this;
			}
public LossDetailsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public LossDetailsPage clickRemove_17(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_17,"Remove_17");
				    return this;
			}
public LossDetailsPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public LossDetailsPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public LossDetailsPage selectState_9(WebDriver driver,String State_9)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_9,State_9,"State_9");
				    return this;
			}
public LossDetailsPage clickISO(WebDriver driver)  {
					BrowserActions.click(driver, btnISO,"ISO");
				    return this;
			}
public LossDetailsPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public LossDetailsPage clickNewPerson_2(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_2,"NewPerson_2");
				    return this;
			}
public LossDetailsPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public LossDetailsPage selectLossCause(WebDriver driver,String LossCause)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLossCause,LossCause,"LossCause");
				    return this;
			}
public LossDetailsPage clickAdd_6(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_6,"Add_6");
				    return this;
			}
public LossDetailsPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public LossDetailsPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public LossDetailsPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public LossDetailsPage selectRelationshiptoInsured_5(WebDriver driver,String RelationshiptoInsured_5)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRelationshiptoInsured_5,RelationshiptoInsured_5,"RelationshiptoInsured_5");
				    return this;
			}
public LossDetailsPage enterCity_8(WebDriver driver,String City_8) {
		            BrowserActions.type(driver, inpCity_8,City_8, "City_8");
			        return this;
           }
public LossDetailsPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public LossDetailsPage clickDateReportedtoAgentDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateReportedtoAgentDateIcon,"DateReportedtoAgentDateIcon");
				    return this;
			}
public LossDetailsPage clickDatesenttoISODateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDatesenttoISODateIcon,"DatesenttoISODateIcon");
				    return this;
			}
public LossDetailsPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public LossDetailsPage enterISOError(WebDriver driver,String ISOError) {
		            BrowserActions.type(driver, inpISOError,ISOError, "ISOError");
			        return this;
           }
public LossDetailsPage clickSendToISO(WebDriver driver)  {
					BrowserActions.click(driver, btnSendToISO,"SendToISO");
				    return this;
			}
public LossDetailsPage selectFaultRating(WebDriver driver,String FaultRating)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFaultRating,FaultRating,"FaultRating");
				    return this;
			}
public LossDetailsPage clickLossDetails(WebDriver driver)  {
	BrowserActions.click(driver, btnLossDetails,"Loss Details");
    return this;
}
public LossDetailsPage selectCompensability(WebDriver driver,String FaultRating)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpCompensability,FaultRating,"Compensability");
    return this;
}
public LossDetailsPage clickInjuryDuringEmploymentRadioButton(WebDriver driver)  {
	BrowserActions.click(driver, rdbYesInjuryDuringEmployment,"Injury During Employment radio button");
    return this;
}
public LossDetailsPage clickPerformingRegularJobRadioButton(WebDriver driver)  {
	BrowserActions.click(driver, rdbYesPerformingRegularJob,"Performing Regular Job radio button");
	return this;
}
public LossDetailsPage clickEmployerQuestionsClaimRadioButton(WebDriver driver)  {
	BrowserActions.click(driver, rdbNoEmployerQuestionsClaim,"Employer Questions Claim radio button");
	return this;
}
public LossDetailsPage clickSafetyEquipmentProvidedRadioButton(WebDriver driver)  {
	BrowserActions.click(driver, rdbYesSafetyEquipmentProvided,"Safety Equipment Provided radio button");
	return this;
}
public LossDetailsPage clickSafetyEquipmentUsedRadioButton(WebDriver driver)  {
	BrowserActions.click(driver, rdbYesSafetyEquipmentUsed,"Safety EquipmentUsed radio button");
	return this;
}
public LossDetailsPage clickDrugsInvolvedRadioButton(WebDriver driver)  {
	BrowserActions.click(driver, rdbNoDrugsInvolved,2,"Drugs Involved radio button");
	return this;
}
}
