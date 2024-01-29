package com.aspire.guidewire.cc.pages.commercialauto;
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

public class SelectInvolvedPolicyVehiclesPage extends LoadableComponent<SelectInvolvedPolicyVehiclesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	//public PolicySummaryVehicle policysummaryvehicleTable;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved_4;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelTripCancelOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickTripCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimGL>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-Make']", AI = false)
	private WebElement inpMake;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV_tb-EditSelectionsVehicle>div[role='button']", AI = false)
	private WebElement btnEditSelections;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicExposures>div[role='menuitem']", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Services>div[role='menuitem']", AI = false)
	private WebElement btnServices;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAutoFirstAndFinal>div[role='menuitem']", AI = false)
	private WebElement btnAutoFirstandFinal;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim_3;

	@IFindBy(how = How.CSS, using = "div[id=$'FNOLWizard-FNOLMenuActions']>div[role='button']", AI = false)
	private WebElement btnFNOLMenuActions;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails_2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV_tb-EditSelectionsProperty>div[role='button']", AI = false)
	private WebElement btnEditSelections_1;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	private WebElement btnInvolvedVehicles;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-VehicleSelected']", AI = false)
	private WebElement chkSelected;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyGeneral>div[role='menuitem']", AI = false)
	private WebElement btnPolicyGeneral;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-VehicleNumber']", AI = false)
	private WebElement inpVehicleNumber;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-Model']", AI = false)
	private WebElement inpModel;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicPartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyDetails>div[role='menuitem']", AI = false)
	private WebElement btnPolicyDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelBaggageOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimBaggage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicMainContacts>div[role='menuitem']", AI = false)
	private WebElement btnOLDBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	private WebElement btnDocuments_5;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicSummary>div[role='menuitem']", AI = false)
	private WebElement btnSaveClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FindPolicy>div[role='menuitem']", AI = false)
	private WebElement btnFindPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimPr>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimProperty;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup>div[role='menuitem']", AI = false)
	private WebElement btnPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-BasicInfo>div[role='menuitem']", AI = false)
	private WebElement btnBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicDocuments>div[role='menuitem']", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicAssign>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-Vin']", AI = false)
	private WebElement inpVIN;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-LicencePlate']", AI = false)
	private WebElement inpPlate;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicLossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-Color']", AI = false)
	private WebElement inpColor;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAuto>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimAuto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Notes>div[role='menuitem']", AI = false)
	private WebElement btnNotes;

	public SelectInvolvedPolicyVehiclesPage(){
	}

	public SelectInvolvedPolicyVehiclesPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//policysummaryvehicleTable = new PolicySummaryVehicle();
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
}public SelectInvolvedPolicyVehiclesPage clickPartiesInvolved_4(WebDriver driver)  {
					BrowserActions.click(driver, btnPartiesInvolved_4,"PartiesInvolved_4");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickQuickTripCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickTripCancel,"QuickTripCancel");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickQuickClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaim,"QuickClaim");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage enterMake(WebDriver driver,String Make) {
		            BrowserActions.type(driver, inpMake,Make, "Make");
			        return this;
           }
public SelectInvolvedPolicyVehiclesPage clickEditSelections(WebDriver driver)  {
					BrowserActions.click(driver, btnEditSelections,"EditSelections");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickExposures(WebDriver driver)  {
					BrowserActions.click(driver, btnExposures,"Exposures");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickServices(WebDriver driver)  {
					BrowserActions.click(driver, btnServices,"Services");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickAutoFirstandFinal(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFirstandFinal,"AutoFirstandFinal");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickSaveAssignClaim_3(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveAssignClaim_3,"SaveAssignClaim_3");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickFNOLMenuActions(WebDriver driver)  {
					BrowserActions.click(driver, btnFNOLMenuActions,"FNOLMenuActions");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickLossDetails_2(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDetails_2,"LossDetails_2");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickFinish(WebDriver driver)  {
					BrowserActions.click(driver, btnFinish,"Finish");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickEditSelections_1(WebDriver driver)  {
					BrowserActions.click(driver, btnEditSelections_1,"EditSelections_1");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickInvolvedVehicles(WebDriver driver)  {
					BrowserActions.click(driver, btnInvolvedVehicles,"InvolvedVehicles");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickSelected(WebDriver driver)  {
					BrowserActions.click(driver, chkSelected,0.5,"Selected");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickPolicyGeneral(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyGeneral,"PolicyGeneral");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage enterVehicleNumber(WebDriver driver,String VehicleNumber) {
		            BrowserActions.type(driver, inpVehicleNumber,VehicleNumber, "VehicleNumber");
			        return this;
           }
public SelectInvolvedPolicyVehiclesPage enterModel(WebDriver driver,String Model) {
		            BrowserActions.type(driver, inpModel,Model, "Model");
			        return this;
           }
public SelectInvolvedPolicyVehiclesPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,"Next");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickPartiesInvolved(WebDriver driver)  {
					BrowserActions.click(driver, btnPartiesInvolved,"PartiesInvolved");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickPolicyDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyDetails,"PolicyDetails");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickQuickClaimBaggage(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaimBaggage,"QuickClaimBaggage");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickOLDBasicInfo(WebDriver driver)  {
					BrowserActions.click(driver, btnOLDBasicInfo,"OLDBasicInfo");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickDocuments_5(WebDriver driver)  {
					BrowserActions.click(driver, btnDocuments_5,"Documents_5");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickSaveClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveClaim,"SaveClaim");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickFindPolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnFindPolicy,"FindPolicy");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickQuickClaimProperty(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaimProperty,"QuickClaimProperty");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickPolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicy,"Policy");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickBasicInfo(WebDriver driver)  {
					BrowserActions.click(driver, btnBasicInfo,"BasicInfo");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickDocuments(WebDriver driver)  {
					BrowserActions.click(driver, btnDocuments,"Documents");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickSaveAssignClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveAssignClaim,"SaveAssignClaim");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage enterVIN(WebDriver driver,String VIN) {
		            BrowserActions.type(driver, inpVIN,VIN, "VIN");
			        return this;
           }
public SelectInvolvedPolicyVehiclesPage enterPlate(WebDriver driver,String Plate) {
		            BrowserActions.type(driver, inpPlate,Plate, "Plate");
			        return this;
           }
public SelectInvolvedPolicyVehiclesPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickLossDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDetails,"LossDetails");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage enterColor(WebDriver driver,String Color) {
		            BrowserActions.type(driver, inpColor,Color, "Color");
			        return this;
           }
public SelectInvolvedPolicyVehiclesPage clickQuickClaimAuto(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaimAuto,"QuickClaimAuto");
				    return this;
			}
public SelectInvolvedPolicyVehiclesPage clickNotes(WebDriver driver)  {
					BrowserActions.click(driver, btnNotes,"Notes");
				    return this;
			}
}
