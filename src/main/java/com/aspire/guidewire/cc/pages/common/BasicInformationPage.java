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

public class BasicInformationPage extends LoadableComponent<BasicInformationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_homephone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpHomePhone_2;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-RightPanel-FNOLWizard_BasicInfoRightPanelSet-0-InsuredVehicleDV-InsuredVehicleInputGroup-_checkbox']", AI = false)
	private WebElement chk2004PontiacGTO;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyGeneral>div[role='menuitem']", AI = false)
	private WebElement btnPolicyGeneral;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicPartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Insured_WorkPhone']", AI = false)
	private WebElement inpPrimaryPhone;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicMainContacts>div[role='menuitem']", AI = false)
	private WebElement btnOLDBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-EditContact>div[role='button']", AI = false)
	private WebElement btnEditContact;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_homephone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpHomePhoneRegionCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-BasicInfo>div[role='menuitem']", AI = false)
	private WebElement btnBasicInfo;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Claim_MainContactType']", AI = false)
	private WebElement drpRelationtoInsured_9;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails_10;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicExposures>div[role='menuitem']", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Services>div[role='menuitem']", AI = false)
	private WebElement btnServices;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_homephone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpHomePhoneExtension;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-MainContact_Name-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_8;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAutoFirstAndFinal>div[role='menuitem']", AI = false)
	private WebElement btnAutoFirstandFinal;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim_11;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_businessphone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpWorkPhone_1;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-MainContact_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_6;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-MainContact_Name-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_7;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicLossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_businessphone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpWorkPhone;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-MainContactChoice']", AI = false)
	private WebElement rdbSamePerson;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAuto>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimAuto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-DOB_dateIcon", AI = false)
	private WebElement btnDateofBirthDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelTripCancelOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickTripCancel;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Claim_ReportedByType']", AI = false)
	private WebElement drpRelationtoInsured;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_email']", AI = false)
	private WebElement inpEmail;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_primarytype']", AI = false)
	private WebElement drpPrimaryPhone;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Insured_Address']", AI = false)
	private WebElement inpAddress_4;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_homephone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpHomePhone;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Notification_ReportedDate_dateIcon", AI = false)
	private WebElement btnDateofNoticeDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Notification_ReportedDate']", AI = false)
	private WebElement inpDateofNotice;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_mobile-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpMobile;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	private WebElement btnDocuments_13;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FindPolicy>div[role='menuitem']", AI = false)
	private WebElement btnFindPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup>div[role='menuitem']", AI = false)
	private WebElement btnPolicy;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-HowReported']", AI = false)
	private WebElement drpHowReported;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_businessphone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpWorkPhoneExtension;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicDocuments>div[role='menuitem']", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicAssign>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Insured_Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_mobile-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpMobileExtension;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Notes>div[role='menuitem']", AI = false)
	private WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimGL>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaim;

	@IFindBy(how = How.CSS, using = "select[name$='_Name']", AI = false)
	private WebElement drpName;

	@IFindBy(how = How.CSS, using = "div[id=$'FNOLWizard-FNOLMenuActions']>div[role='button']", AI = false)
	private WebElement btnFNOLMenuActions;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-MainContact_Name']", AI = false)
	private WebElement drpName_5;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	private WebElement btnInvolvedVehicles;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_businessphone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpWorkPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyDetails>div[role='menuitem']", AI = false)
	private WebElement btnPolicyDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelBaggageOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimBaggage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ReportedBy_NameMenuIcon>div[role='button']", AI = false)
	private WebElement btnReportedBy_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "div[id='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ttlBar']", AI = false)
	private WebElement lblTtlBar;////div[contains(@id,'_BasicInfoScreen-ttlBar')]//..//div[contains(text(),'Basic information')]

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-MainContact_Name-MainContact_NameMenuIcon>div[role='button']", AI = false)
	private WebElement btnMainContact_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_mobile-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpMobileRegionCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicSummary>div[role='menuitem']", AI = false)
	private WebElement btnSaveClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-DOB']", AI = false)
	private WebElement inpDateofBirth;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimPr>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimProperty;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved_12;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-reporter_mobile-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpMobile_3;

	@IFindBy(how = How.CSS, using = "select[name$='-Claimant_Name']", AI = false)
	private WebElement drpInjuredWorkerName;

	@IFindBy(how = How.CSS, using = "select[name$='-ReportedBy_Name']", AI = false)
	private WebElement drpInjuredName;
	
	@IFindBy(how = How.CSS, using = "input[name$='0-InsuredVehicleDV-InsuredVehicleInputGroup-_checkbox']", AI = false)
	private WebElement chkVehicles;
	
	@IFindBy(how = How.CSS, using = "div[id='FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Insured_Address'] ", AI = false)
	private WebElement inpAddress;
	

	public BasicInformationPage(){
	}

	public BasicInformationPage(WebDriver driver){
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
	}public BasicInformationPage clickViewContactDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
		return this;
	}
	public BasicInformationPage enterHomePhone_2(WebDriver driver,String HomePhone_2) {
		BrowserActions.type(driver, inpHomePhone_2,HomePhone_2, "HomePhone_2");
		return this;
	}
	public BasicInformationPage click2004PontiacGTO(WebDriver driver)  {
		BrowserActions.click(driver, chk2004PontiacGTO,"2004PontiacGTO");
		return this;
	}
	public BasicInformationPage clickPolicyGeneral(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyGeneral,"PolicyGeneral");
		return this;
	}
	public BasicInformationPage clickPartiesInvolved(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved,"PartiesInvolved");
		return this;
	}
	public BasicInformationPage enterPrimaryPhone(WebDriver driver,String PrimaryPhone) {
		BrowserActions.type(driver, inpPrimaryPhone,PrimaryPhone, "PrimaryPhone");
		return this;
	}
	public BasicInformationPage clickOLDBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnOLDBasicInfo,"OLDBasicInfo");
		return this;
	}
	public BasicInformationPage clickEditContact(WebDriver driver)  {
		BrowserActions.click(driver, btnEditContact,"EditContact");
		return this;
	}
	public BasicInformationPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
		return this;
	}
	public BasicInformationPage clickBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnBasicInfo,"BasicInfo");
		return this;
	}
	public BasicInformationPage selectRelationtoInsured_9(WebDriver driver,String RelationtoInsured_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRelationtoInsured_9,RelationtoInsured_9,"RelationtoInsured_9");
		return this;
	}
	public BasicInformationPage clickLossDetails_10(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails_10,"LossDetails_10");
		return this;
	}
	public BasicInformationPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public BasicInformationPage clickServices(WebDriver driver)  {
		BrowserActions.click(driver, btnServices,"Services");
		return this;
	}
	public BasicInformationPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
		BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
		return this;
	}
	public BasicInformationPage clickViewContactDetails_8(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails_8,"ViewContactDetails_8");
		return this;
	}
	public BasicInformationPage clickAutoFirstandFinal(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFirstandFinal,"AutoFirstandFinal");
		return this;
	}
	public BasicInformationPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public BasicInformationPage clickSaveAssignClaim_11(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim_11,"SaveAssignClaim_11");
		return this;
	}
	public BasicInformationPage enterWorkPhone_1(WebDriver driver,String WorkPhone_1) {
		BrowserActions.type(driver, inpWorkPhone_1,WorkPhone_1, "WorkPhone_1");
		return this;
	}
	public BasicInformationPage clickNewPerson_6(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson_6,"NewPerson_6");
		return this;
	}
	public BasicInformationPage clickSearch_7(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_7,"Search_7");
		return this;
	}
	public BasicInformationPage clickLossDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails,"LossDetails");
		return this;
	}
	public BasicInformationPage enterWorkPhone(WebDriver driver,String WorkPhone) {
		BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
		return this;
	}
	public BasicInformationPage clickSamePerson(WebDriver driver)  {
		BrowserActions.click(driver, rdbSamePerson,"SamePerson");
		return this;
	}
	public BasicInformationPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public BasicInformationPage clickQuickClaimAuto(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimAuto,"QuickClaimAuto");
		return this;
	}
	public BasicInformationPage clickDateofBirthDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateofBirthDateIcon,"DateofBirthDateIcon");
		return this;
	}
	public BasicInformationPage clickQuickTripCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickTripCancel,"QuickTripCancel");
		return this;
	}
	public BasicInformationPage selectRelationtoInsured(WebDriver driver,String RelationtoInsured)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRelationtoInsured,RelationtoInsured,"RelationtoInsured");
		return this;
	}
	public BasicInformationPage enterEmail(WebDriver driver,String Email) {
		BrowserActions.type(driver, inpEmail,Email, "Email");
		return this;
	}
	public BasicInformationPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
		return this;
	}
	public BasicInformationPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public BasicInformationPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public BasicInformationPage enterAddress_4(WebDriver driver,String Address_4) {
		BrowserActions.type(driver, inpAddress_4,Address_4, "Address_4");
		return this;
	}
	public BasicInformationPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public BasicInformationPage enterHomePhone(WebDriver driver,String HomePhone) {
		BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
		return this;
	}
	public BasicInformationPage clickDateofNoticeDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateofNoticeDateIcon,"DateofNoticeDateIcon");
		return this;
	}
	public BasicInformationPage enterDateofNotice(WebDriver driver,String DateofNotice) {
		BrowserActions.type(driver, inpDateofNotice,DateofNotice, "DateofNotice");
		return this;
	}
	public BasicInformationPage enterMobile(WebDriver driver,String Mobile) {
		BrowserActions.type(driver, inpMobile,Mobile, "Mobile");
		return this;
	}
	public BasicInformationPage clickDocuments_13(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments_13,"Documents_13");
		return this;
	}
	public BasicInformationPage clickFindPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnFindPolicy,"FindPolicy");
		return this;
	}
	public BasicInformationPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public BasicInformationPage clickPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicy,"Policy");
		return this;
	}
	public BasicInformationPage selectHowReported(WebDriver driver,String HowReported)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHowReported,HowReported,"HowReported");
		return this;
	}
	public BasicInformationPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
		BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
		return this;
	}
	public BasicInformationPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public BasicInformationPage clickSaveAssignClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim,"SaveAssignClaim");
		return this;
	}
	public BasicInformationPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public BasicInformationPage enterMobileExtension(WebDriver driver,String MobileExtension) {
		BrowserActions.type(driver, inpMobileExtension,MobileExtension, "MobileExtension");
		return this;
	}
	public BasicInformationPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public BasicInformationPage clickQuickClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaim,"QuickClaim");
		return this;
	}
	public BasicInformationPage selectName(WebDriver driver,String Name)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,1,"Name");
		return this;
	}
	public BasicInformationPage clickFNOLMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnFNOLMenuActions,"FNOLMenuActions");
		return this;
	}
	public BasicInformationPage selectName_5(WebDriver driver,String Name_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpName_5,Name_5,"Name_5");
		return this;
	}
	public BasicInformationPage clickInvolvedVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnInvolvedVehicles,"InvolvedVehicles");
		return this;
	}
	public BasicInformationPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
		return this;
	}
	public BasicInformationPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public BasicInformationPage clickPolicyDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyDetails,"PolicyDetails");
		return this;
	}
	public BasicInformationPage clickQuickClaimBaggage(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimBaggage,"QuickClaimBaggage");
		return this;
	}
	public BasicInformationPage clickReportedBy_NameMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnReportedBy_NameMenuIcon,"ReportedBy_NameMenuIcon");
		return this;
	}
	public BasicInformationPage clickMainContact_NameMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnMainContact_NameMenuIcon,"MainContact_NameMenuIcon");
		return this;
	}
	public BasicInformationPage selectMobileRegionCode(WebDriver driver,String MobileRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMobileRegionCode,MobileRegionCode,"MobileRegionCode");
		return this;
	}
	public BasicInformationPage clickSaveClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveClaim,"SaveClaim");
		return this;
	}
	public BasicInformationPage enterDateofBirth(WebDriver driver,String DateofBirth) {
		BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
		return this;
	}
	public BasicInformationPage clickQuickClaimProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimProperty,"QuickClaimProperty");
		return this;
	}
	public BasicInformationPage clickPartiesInvolved_12(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved_12,"PartiesInvolved_12");
		return this;
	}
	public BasicInformationPage enterMobile_3(WebDriver driver,String Mobile_3) {
		BrowserActions.type(driver, inpMobile_3,Mobile_3, "Mobile_3");
		return this;
	}
	public BasicInformationPage selectInjuredWorkerName(WebDriver driver,String InjuredWorker)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpInjuredWorkerName,InjuredWorker,1,"Injured Worker");
		return this;
	}

	public BasicInformationPage selectInsuredName(WebDriver driver)  {
		BrowserActions.selectDropDownByIndex(driver, drpInjuredName,1,"Injured Name");
		return this;
	}
	public BasicInformationPage clickVehicle(WebDriver driver)  {
		BrowserActions.click(driver, chkVehicles,"Vehicles Checkbox");
		return this;
	}

}
