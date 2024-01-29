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

import com.aspire.guidewire.cc.pages.commercialauto.NewAutoTowingAgencyPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class ServicesPage extends LoadableComponent<ServicesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyGeneral>div[role='menuitem']", AI = false)
	private WebElement btnPolicyGeneral;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicPartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicMainContacts>div[role='menuitem']", AI = false)
	private WebElement btnOLDBasicInfo;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_ServicesScreen-ServiceRequestSubmitMessage']", AI = false)
	private WebElement inpServiceRequestSubmitMessage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	private WebElement btnDocuments_4;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-BasicInfo>div[role='menuitem']", AI = false)
	private WebElement btnBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved_3;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicExposures>div[role='menuitem']", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Services>div[role='menuitem']", AI = false)
	private WebElement btnServices;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAutoFirstAndFinal>div[role='menuitem']", AI = false)
	private WebElement btnAutoFirstandFinal;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_ServicesScreen-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicLossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAuto>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimAuto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelTripCancelOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickTripCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FindPolicy>div[role='menuitem']", AI = false)
	private WebElement btnFindPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup>div[role='menuitem']", AI = false)
	private WebElement btnPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicDocuments>div[role='menuitem']", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicAssign>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_ServicesScreen-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-AddServiceRequest>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Notes>div[role='menuitem']", AI = false)
	private WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimGL>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaim;

	@IFindBy(how = How.CSS, using = "div[id=$'FNOLWizard-FNOLMenuActions']>div[role='button']", AI = false)
	private WebElement btnFNOLMenuActions;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim_2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails_1;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	private WebElement btnInvolvedVehicles;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyDetails>div[role='menuitem']", AI = false)
	private WebElement btnPolicyDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelBaggageOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimBaggage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_ServicesScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicSummary>div[role='menuitem']", AI = false)
	private WebElement btnSaveClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimPr>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimProperty;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_ServicesScreen-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-_checkbox']", AI = false)
	private WebElement chkClaimlevelServices;

	@IFindBy(how = How.CSS, using = "input[name$='TowingInputGroup-_checkbox']", AI = false)
	public WebElement chkTowing;

	@IFindBy(how = How.CSS, using = "div[id$='TowingAgency-TowingAgencyMenuIcon']", AI = false)
	public WebElement toggleTowingAgencySunMenu;

	@IFindBy(how = How.CSS, using = "div[id$='MenuItemSet-NewAutoTowingAgency']", AI = false)
	public WebElement tabNewAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "select[name$='ServiceAddressPicker']", AI = false)
	public WebElement drpPickUpLocation;
	
	@IFindBy(how = How.CSS, using = "div[id*=ServicesScreen-]", AI = false)
	public WebElement ttlServices;

	public ServicesPage(){
	}

	public ServicesPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlServices))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ServicesPage clickPolicyGeneral(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyGeneral,"PolicyGeneral");
		return this;
	}
	public ServicesPage clickPartiesInvolved(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved,"PartiesInvolved");
		return this;
	}
	public ServicesPage clickOLDBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnOLDBasicInfo,"OLDBasicInfo");
		return this;
	}
	public ServicesPage enterServiceRequestSubmitMessage(WebDriver driver,String ServiceRequestSubmitMessage) {
		BrowserActions.type(driver, inpServiceRequestSubmitMessage,ServiceRequestSubmitMessage, "ServiceRequestSubmitMessage");
		return this;
	}
	public ServicesPage clickDocuments_4(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments_4,"Documents_4");
		return this;
	}
	public ServicesPage clickBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnBasicInfo,"BasicInfo");
		return this;
	}
	public ServicesPage clickPartiesInvolved_3(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved_3,"PartiesInvolved_3");
		return this;
	}
	public ServicesPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public ServicesPage clickServices(WebDriver driver)  {
		BrowserActions.click(driver, btnServices,"Services");
		return this;
	}
	public ServicesPage clickAutoFirstandFinal(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFirstandFinal,"AutoFirstandFinal");
		return this;
	}
	public ServicesPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public ServicesPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public ServicesPage clickLossDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails,"LossDetails");
		return this;
	}
	public ServicesPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public ServicesPage clickQuickClaimAuto(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimAuto,"QuickClaimAuto");
		return this;
	}
	public ServicesPage clickQuickTripCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickTripCancel,"QuickTripCancel");
		return this;
	}
	public ServicesPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public ServicesPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public ServicesPage clickFindPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnFindPolicy,"FindPolicy");
		return this;
	}
	public ServicesPage clickPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicy,"Policy");
		return this;
	}
	public ServicesPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public ServicesPage clickSaveAssignClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim,"SaveAssignClaim");
		return this;
	}
	public ServicesPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public ServicesPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public ServicesPage clickQuickClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaim,"QuickClaim");
		return this;
	}
	public ServicesPage clickFNOLMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnFNOLMenuActions,"FNOLMenuActions");
		return this;
	}
	public ServicesPage clickSaveAssignClaim_2(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim_2,"SaveAssignClaim_2");
		return this;
	}
	public ServicesPage clickLossDetails_1(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails_1,"LossDetails_1");
		return this;
	}
	public ServicesPage clickInvolvedVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnInvolvedVehicles,"InvolvedVehicles");
		return this;
	}
	public ServicesPage clickPolicyDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyDetails,"PolicyDetails");
		return this;
	}
	public ServicesPage clickQuickClaimBaggage(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimBaggage,"QuickClaimBaggage");
		return this;
	}
	public ServicesPage clickSaveClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveClaim,"SaveClaim");
		return this;
	}
	public ServicesPage clickQuickClaimProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimProperty,"QuickClaimProperty");
		return this;
	}
	public ServicesPage clickClaimlevelServices(WebDriver driver)  {
		BrowserActions.click(driver, chkClaimlevelServices,"ClaimlevelServices");
		return this;
	}

	public ServicesPage clickTowingCheckBox(WebDriver driver)   {
		BrowserActions.click(driver, chkTowing,"towing checkbox");
		return this;
	}

	public ServicesPage clickTowingToggleSubMenu(WebDriver driver)  {
		BrowserActions.click(driver, toggleTowingAgencySunMenu,"towing toggle sub menu");
		return this;
	}

	public NewAutoTowingAgencyPage clickNewAutoTowingAgency(WebDriver driver)  {
		BrowserActions.click(driver, tabNewAutoTowingAgency, "New auto towing agency");
		return new NewAutoTowingAgencyPage(driver).get();
	}
	public ServicesPage selectPickUpLocation(WebDriver driver) {
		BrowserActions.selectDropDownByIndex(driver, drpPickUpLocation, 1, "Pick up location");
		return this;
	}
}
