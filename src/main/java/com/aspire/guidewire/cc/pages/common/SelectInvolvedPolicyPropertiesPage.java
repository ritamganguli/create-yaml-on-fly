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

public class SelectInvolvedPolicyPropertiesPage extends LoadableComponent<SelectInvolvedPolicyPropertiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	////public TopNavBar topnavbar;
	//public PolicySummaryProperty policysummarypropertyTable;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	public WebElement btnPartiesInvolved_4;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelTripCancelOnly>div[role='menuitem']", AI = false)
	public WebElement btnQuickTripCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimGL>div[role='menuitem']", AI = false)
	public WebElement btnQuickClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV_tb-EditSelectionsVehicle>div[role='button']", AI = false)
	public WebElement btnEditSelections;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicExposures>div[role='menuitem']", AI = false)
	public WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Services>div[role='menuitem']", AI = false)
	public WebElement btnServices;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAutoFirstAndFinal>div[role='menuitem']", AI = false)
	public WebElement btnAutoFirstandFinal;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	public WebElement btnSaveAssignClaim_3;

	@IFindBy(how = How.CSS, using = "div[id=$'FNOLWizard-FNOLMenuActions']>div[role='button']", AI = false)
	public WebElement btnFNOLMenuActions;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	public WebElement btnLossDetails_2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-Location']", AI = false)
	public WebElement inpAddressNumber;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV_tb-EditSelectionsProperty>div[role='button']", AI = false)
	public WebElement btnEditSelections_1;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-PropertySelected']", AI = false)
	public WebElement chkSelected;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyGeneral>div[role='menuitem']", AI = false)
	public WebElement btnPolicyGeneral;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Next>div[role='button']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicPartiesInvolved>div[role='menuitem']", AI = false)
	public WebElement btnPartiesInvolved;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyDetails>div[role='menuitem']", AI = false)
	public WebElement btnPolicyDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelBaggageOnly>div[role='menuitem']", AI = false)
	public WebElement btnQuickClaimBaggage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicMainContacts>div[role='menuitem']", AI = false)
	public WebElement btnOLDBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	public WebElement btnInvolvedProperties;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-BuildingNumber']", AI = false)
	public WebElement inpBuildingNumber;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments_5;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicSummary>div[role='menuitem']", AI = false)
	public WebElement btnSaveClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FindPolicy>div[role='menuitem']", AI = false)
	public WebElement btnFindPolicy;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-Address']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimPr>div[role='menuitem']", AI = false)
	public WebElement btnQuickClaimProperty;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicy;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-PropertyNumber']", AI = false)
	public WebElement inpPropertyNumber;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-BasicInfo>div[role='menuitem']", AI = false)
	public WebElement btnBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicDocuments>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicAssign>div[role='menuitem']", AI = false)
	public WebElement btnSaveAssignClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicLossDetails>div[role='menuitem']", AI = false)
	public WebElement btnLossDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAuto>div[role='menuitem']", AI = false)
	public WebElement btnQuickClaimAuto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	public SelectInvolvedPolicyPropertiesPage(){
	}

	public SelectInvolvedPolicyPropertiesPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnNotes))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}
	public SelectInvolvedPolicyPropertiesPage clickPartiesInvolved_4(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved_4,"PartiesInvolved_4");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickQuickTripCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickTripCancel,"QuickTripCancel");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickQuickClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaim,"QuickClaim");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickEditSelections(WebDriver driver)  {
		BrowserActions.click(driver, btnEditSelections,"EditSelections");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickServices(WebDriver driver)  {
		BrowserActions.click(driver, btnServices,"Services");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickAutoFirstandFinal(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFirstandFinal,"AutoFirstandFinal");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickSaveAssignClaim_3(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim_3,"SaveAssignClaim_3");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickFNOLMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnFNOLMenuActions,"FNOLMenuActions");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickLossDetails_2(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails_2,"LossDetails_2");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage enterAddressNumber(WebDriver driver,String AddressNumber) {
		BrowserActions.type(driver, inpAddressNumber,AddressNumber, "AddressNumber");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickEditSelections_1(WebDriver driver)  {
		BrowserActions.click(driver, btnEditSelections_1,"EditSelections_1");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickSelected(WebDriver driver)  {
		BrowserActions.click(driver, chkSelected,"Selected");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickPolicyGeneral(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyGeneral,"PolicyGeneral");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickPartiesInvolved(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved,"PartiesInvolved");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickPolicyDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyDetails,"PolicyDetails");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickQuickClaimBaggage(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimBaggage,"QuickClaimBaggage");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickOLDBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnOLDBasicInfo,"OLDBasicInfo");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickInvolvedProperties(WebDriver driver)  {
		BrowserActions.click(driver, btnInvolvedProperties,"InvolvedProperties");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage enterBuildingNumber(WebDriver driver,String BuildingNumber) {
		BrowserActions.type(driver, inpBuildingNumber,BuildingNumber, "BuildingNumber");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickDocuments_5(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments_5,"Documents_5");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickSaveClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveClaim,"SaveClaim");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickFindPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnFindPolicy,"FindPolicy");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickQuickClaimProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimProperty,"QuickClaimProperty");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicy,"Policy");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage enterPropertyNumber(WebDriver driver,String PropertyNumber) {
		BrowserActions.type(driver, inpPropertyNumber,PropertyNumber, "PropertyNumber");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnBasicInfo,"BasicInfo");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickSaveAssignClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim,"SaveAssignClaim");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickLossDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails,"LossDetails");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickQuickClaimAuto(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimAuto,"QuickClaimAuto");
		return this;
	}
	public SelectInvolvedPolicyPropertiesPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
}
