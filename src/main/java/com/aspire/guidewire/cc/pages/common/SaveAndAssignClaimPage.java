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

public class SaveAndAssignClaimPage extends LoadableComponent<SaveAndAssignClaimPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPArkansas;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-4-item-0-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovPD_7;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-0-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnLiabilityBodilyInjury;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyGeneral>div[role='menuitem']", AI = false)
	private WebElement btnPolicyGeneral;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-19-item>div[role='menuitem']", AI = false)
	private WebElement btnPropertyProtectionInsurance;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicPartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-16-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPTexas;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicMainContacts>div[role='menuitem']", AI = false)
	private WebElement btnOLDBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-4-item-0-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovVehicleDamage_8;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-BasicInfo>div[role='menuitem']", AI = false)
	private WebElement btnBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-2-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnElectronicEquipment;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-7-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnTapeDiscMedia;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-4-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnMedicalPayments_10;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-ClaimAssign-ClaimAssign_PickerButton", AI = false)
	private WebElement btnClaimAssign_PickerButton;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-Note textarea", AI = false)
	private WebElement inpNewNote;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicExposures>div[role='menuitem']", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Services>div[role='menuitem']", AI = false)
	private WebElement btnServices;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-4-item-0-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovBI_6;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAutoFirstAndFinal>div[role='menuitem']", AI = false)
	private WebElement btnAutoFirstandFinal;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-4-item-0-item-3-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovGenDamages_9;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-CommonAssign-CommonAssign_PickerButton", AI = false)
	private WebElement btnCommonAssign_PickerButton;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim_16;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-7-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnTowingandLabor;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-8-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnUninsuredMotoristBodilyInjury_13;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-15-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPPennsylvania;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-3-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnLiabilityVehicleDamage_4;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-3-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnLiabilityPropertyDamage_3;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-4-item>div[role='menuitem']", AI = false)
	private WebElement btnUninsuredMotoristBodilyInjury;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-14-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPOregon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure>div[role='button']", AI = false)
	private WebElement btnNewExposure;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicLossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-11-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPNewJersey;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails_15;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAuto>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimAuto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCoverageLimited;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelTripCancelOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickTripCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPDelaware;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-0-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnCollision;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-13-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPNorthDakota;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-CommonAssign']", AI = false)
	private WebElement drpAssignclaimandallexposuresto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-18-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPWashington;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-8-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPMassachusetts;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-0-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnLiabilityVehicleDamage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-6-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnRentalCarLossofUse;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-1-item>div[role='menuitem']", AI = false)
	private WebElement btnD;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-2-item>div[role='menuitem']", AI = false)
	private WebElement btnE;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-0-item>div[role='menuitem']", AI = false)
	private WebElement btnC;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FindPolicy>div[role='menuitem']", AI = false)
	private WebElement btnFindPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-1-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnDeathandDisabilityBenefit;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup>div[role='menuitem']", AI = false)
	private WebElement btnPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-6-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPKentucky;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-7-item>div[role='menuitem']", AI = false)
	private WebElement btnT;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-8-item>div[role='menuitem']", AI = false)
	private WebElement btnU;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-6-item>div[role='menuitem']", AI = false)
	private WebElement btnR;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPDistrictofColumbia;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item>div[role='menuitem']", AI = false)
	private WebElement btnP;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicDocuments>div[role='menuitem']", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicAssign>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-3-item>div[role='menuitem']", AI = false)
	private WebElement btnL;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	private WebElement btnDocuments_18;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-4-item>div[role='menuitem']", AI = false)
	private WebElement btnM;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-ClaimAssign']", AI = false)
	private WebElement drpClaimAssignment;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-1-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovPD;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-9-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPMichigan;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-4-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPHawaii;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Notes>div[role='menuitem']", AI = false)
	private WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-0-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnComprehensive;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-4-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCoverageLimited_5;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-12-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPNewYork;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-1-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovBI;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimGL>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-3-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPFlorida;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnMedicalPayments;

	@IFindBy(how = How.CSS, using = "div[id=$'FNOLWizard-FNOLMenuActions']>div[role='button']", AI = false)
	private WebElement btnFNOLMenuActions;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	private WebElement btnInvolvedVehicles;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-0-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnCollisionLimitedCoverage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item>div[role='menuitem']", AI = false)
	private WebElement btnPolicyLevelCoverage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-10-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPMinnesota;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-1-item>div[role='menuitem']", AI = false)
	private WebElement btn2004PontiacGTO;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyDetails>div[role='menuitem']", AI = false)
	private WebElement btnPolicyDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelBaggageOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimBaggage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-17-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPUtah;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType>div[role='menuitem']", AI = false)
	private WebElement btnChoosebyCoverageType;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-6-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnRentalReimbursement;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar'] div[id='FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-ttlBar']", AI = false)
	private WebElement lblTtlBar;//#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-ttlBar

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-7-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPMaryland;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-3-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnLiabilityBodilyInjury_2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnItem;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-5-item-5-item>div[role='menuitem']", AI = false)
	private WebElement btnPIPKansas;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-3-item>div[role='menuitem']", AI = false)
	private WebElement btnItem_1;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicSummary>div[role='menuitem']", AI = false)
	private WebElement btnSaveClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-1-item-2-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovVehicleDamage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-0-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnLiabilityPropertyDamage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimPr>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimProperty;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved_17;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-0-item-1-item-3-item>div[role='menuitem']", AI = false)
	private WebElement btnMexicoCovGenDamages;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-8-item-0-item>div[role='menuitem']", AI = false)
	private WebElement btnItem_11;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-8-item-1-item>div[role='menuitem']", AI = false)
	private WebElement btnItem_12;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_AssignSaveScreen-NewExposureLV_tb-AddExposure-NewExposureMenuItemSet_ByCoverageType-8-item-3-item>div[role='menuitem']", AI = false)
	private WebElement btnItem_14;

	public SaveAndAssignClaimPage(){
	}

	public SaveAndAssignClaimPage(WebDriver driver){
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
}public SaveAndAssignClaimPage clickPIPArkansas(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPArkansas,"PIPArkansas");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovPD_7(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovPD_7,"MexicoCovPD_7");
				    return this;
			}
public SaveAndAssignClaimPage clickLiabilityBodilyInjury(WebDriver driver)  {
					BrowserActions.click(driver, btnLiabilityBodilyInjury,"LiabilityBodilyInjury");
				    return this;
			}
public SaveAndAssignClaimPage clickPolicyGeneral(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyGeneral,"PolicyGeneral");
				    return this;
			}
public SaveAndAssignClaimPage clickPropertyProtectionInsurance(WebDriver driver)  {
					BrowserActions.click(driver, btnPropertyProtectionInsurance,"PropertyProtectionInsurance");
				    return this;
			}
public SaveAndAssignClaimPage clickPartiesInvolved(WebDriver driver)  {
					BrowserActions.click(driver, btnPartiesInvolved,"PartiesInvolved");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPTexas(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPTexas,"PIPTexas");
				    return this;
			}
public SaveAndAssignClaimPage clickOLDBasicInfo(WebDriver driver)  {
					BrowserActions.click(driver, btnOLDBasicInfo,"OLDBasicInfo");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovVehicleDamage_8(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovVehicleDamage_8,"MexicoCovVehicleDamage_8");
				    return this;
			}
public SaveAndAssignClaimPage clickBasicInfo(WebDriver driver)  {
					BrowserActions.click(driver, btnBasicInfo,"BasicInfo");
				    return this;
			}
public SaveAndAssignClaimPage clickElectronicEquipment(WebDriver driver)  {
					BrowserActions.click(driver, btnElectronicEquipment,"ElectronicEquipment");
				    return this;
			}
public SaveAndAssignClaimPage clickTapeDiscMedia(WebDriver driver)  {
					BrowserActions.click(driver, btnTapeDiscMedia,"TapeDiscMedia");
				    return this;
			}
public SaveAndAssignClaimPage clickMedicalPayments_10(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalPayments_10,"MedicalPayments_10");
				    return this;
			}
public SaveAndAssignClaimPage clickClaimAssign_PickerButton(WebDriver driver)  {
					BrowserActions.click(driver, btnClaimAssign_PickerButton,"ClaimAssign_PickerButton");
				    return this;
			}
public SaveAndAssignClaimPage enterNewNote(WebDriver driver,String NewNote) {
		            BrowserActions.type(driver, inpNewNote,NewNote, "NewNote");
			        return this;
           }
public SaveAndAssignClaimPage clickExposures(WebDriver driver)  {
					BrowserActions.click(driver, btnExposures,"Exposures");
				    return this;
			}
public SaveAndAssignClaimPage clickServices(WebDriver driver)  {
					BrowserActions.click(driver, btnServices,"Services");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovBI_6(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovBI_6,"MexicoCovBI_6");
				    return this;
			}
public SaveAndAssignClaimPage clickAutoFirstandFinal(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFirstandFinal,"AutoFirstandFinal");
				    return this;
			}
public SaveAndAssignClaimPage clickFinish(WebDriver driver)  {
					BrowserActions.click(driver, btnFinish,0.5,"Finish");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovGenDamages_9(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovGenDamages_9,"MexicoCovGenDamages_9");
				    return this;
			}
public SaveAndAssignClaimPage clickCommonAssign_PickerButton(WebDriver driver)  {
					BrowserActions.click(driver, btnCommonAssign_PickerButton,"CommonAssign_PickerButton");
				    return this;
			}
public SaveAndAssignClaimPage clickSaveAssignClaim_16(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveAssignClaim_16,"SaveAssignClaim_16");
				    return this;
			}
public SaveAndAssignClaimPage clickTowingandLabor(WebDriver driver)  {
					BrowserActions.click(driver, btnTowingandLabor,"TowingandLabor");
				    return this;
			}
public SaveAndAssignClaimPage clickUninsuredMotoristBodilyInjury_13(WebDriver driver)  {
					BrowserActions.click(driver, btnUninsuredMotoristBodilyInjury_13,"UninsuredMotoristBodilyInjury_13");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPPennsylvania(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPPennsylvania,"PIPPennsylvania");
				    return this;
			}
public SaveAndAssignClaimPage clickLiabilityVehicleDamage_4(WebDriver driver)  {
					BrowserActions.click(driver, btnLiabilityVehicleDamage_4,"LiabilityVehicleDamage_4");
				    return this;
			}
public SaveAndAssignClaimPage clickLiabilityPropertyDamage_3(WebDriver driver)  {
					BrowserActions.click(driver, btnLiabilityPropertyDamage_3,"LiabilityPropertyDamage_3");
				    return this;
			}
public SaveAndAssignClaimPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public SaveAndAssignClaimPage clickUninsuredMotoristBodilyInjury(WebDriver driver)  {
					BrowserActions.click(driver, btnUninsuredMotoristBodilyInjury,"UninsuredMotoristBodilyInjury");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPOregon(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPOregon,"PIPOregon");
				    return this;
			}
public SaveAndAssignClaimPage clickNewExposure(WebDriver driver)  {
					BrowserActions.click(driver, btnNewExposure,"NewExposure");
				    return this;
			}
public SaveAndAssignClaimPage clickLossDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDetails,"LossDetails");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPNewJersey(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPNewJersey,"PIPNewJersey");
				    return this;
			}
public SaveAndAssignClaimPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public SaveAndAssignClaimPage clickLossDetails_15(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDetails_15,"LossDetails_15");
				    return this;
			}
public SaveAndAssignClaimPage clickQuickClaimAuto(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaimAuto,"QuickClaimAuto");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCoverageLimited(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCoverageLimited,"MexicoCoverageLimited");
				    return this;
			}
public SaveAndAssignClaimPage clickQuickTripCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickTripCancel,"QuickTripCancel");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPDelaware(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPDelaware,"PIPDelaware");
				    return this;
			}
public SaveAndAssignClaimPage clickCollision(WebDriver driver)  {
					BrowserActions.click(driver, btnCollision,"Collision");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPNorthDakota(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPNorthDakota,"PIPNorthDakota");
				    return this;
			}
public SaveAndAssignClaimPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public SaveAndAssignClaimPage selectAssignclaimandallexposuresto(WebDriver driver,String Assignclaimandallexposuresto)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAssignclaimandallexposuresto,Assignclaimandallexposuresto,"Assignclaimandallexposuresto");
				    return this;
			}
public SaveAndAssignClaimPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,"Next");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPWashington(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPWashington,"PIPWashington");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPMassachusetts(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPMassachusetts,"PIPMassachusetts");
				    return this;
			}
public SaveAndAssignClaimPage clickLiabilityVehicleDamage(WebDriver driver)  {
					BrowserActions.click(driver, btnLiabilityVehicleDamage,"LiabilityVehicleDamage");
				    return this;
			}
public SaveAndAssignClaimPage clickRentalCarLossofUse(WebDriver driver)  {
					BrowserActions.click(driver, btnRentalCarLossofUse,"RentalCarLossofUse");
				    return this;
			}
public SaveAndAssignClaimPage clickD(WebDriver driver)  {
					BrowserActions.click(driver, btnD,"D");
				    return this;
			}
public SaveAndAssignClaimPage clickE(WebDriver driver)  {
					BrowserActions.click(driver, btnE,"E");
				    return this;
			}
public SaveAndAssignClaimPage clickC(WebDriver driver)  {
					BrowserActions.click(driver, btnC,"C");
				    return this;
			}
public SaveAndAssignClaimPage clickFindPolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnFindPolicy,"FindPolicy");
				    return this;
			}
public SaveAndAssignClaimPage clickDeathandDisabilityBenefit(WebDriver driver)  {
					BrowserActions.click(driver, btnDeathandDisabilityBenefit,"DeathandDisabilityBenefit");
				    return this;
			}
public SaveAndAssignClaimPage clickPolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicy,"Policy");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPKentucky(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPKentucky,"PIPKentucky");
				    return this;
			}
public SaveAndAssignClaimPage clickT(WebDriver driver)  {
					BrowserActions.click(driver, btnT,"T");
				    return this;
			}
public SaveAndAssignClaimPage clickU(WebDriver driver)  {
					BrowserActions.click(driver, btnU,"U");
				    return this;
			}
public SaveAndAssignClaimPage clickR(WebDriver driver)  {
					BrowserActions.click(driver, btnR,"R");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPDistrictofColumbia(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPDistrictofColumbia,"PIPDistrictofColumbia");
				    return this;
			}
public SaveAndAssignClaimPage clickP(WebDriver driver)  {
					BrowserActions.click(driver, btnP,"P");
				    return this;
			}
public SaveAndAssignClaimPage clickDocuments(WebDriver driver)  {
					BrowserActions.click(driver, btnDocuments,"Documents");
				    return this;
			}
public SaveAndAssignClaimPage clickSaveAssignClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveAssignClaim,"SaveAssignClaim");
				    return this;
			}
public SaveAndAssignClaimPage clickL(WebDriver driver)  {
					BrowserActions.click(driver, btnL,"L");
				    return this;
			}
public SaveAndAssignClaimPage clickDocuments_18(WebDriver driver)  {
					BrowserActions.click(driver, btnDocuments_18,"Documents_18");
				    return this;
			}
public SaveAndAssignClaimPage clickM(WebDriver driver)  {
					BrowserActions.click(driver, btnM,"M");
				    return this;
			}
public SaveAndAssignClaimPage selectClaimAssignment(WebDriver driver,String ClaimAssignment)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClaimAssignment,ClaimAssignment,"ClaimAssignment");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovPD(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovPD,"MexicoCovPD");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPMichigan(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPMichigan,"PIPMichigan");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPHawaii(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPHawaii,"PIPHawaii");
				    return this;
			}
public SaveAndAssignClaimPage clickNotes(WebDriver driver)  {
					BrowserActions.click(driver, btnNotes,"Notes");
				    return this;
			}
public SaveAndAssignClaimPage clickComprehensive(WebDriver driver)  {
					BrowserActions.click(driver, btnComprehensive,"Comprehensive");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCoverageLimited_5(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCoverageLimited_5,"MexicoCoverageLimited_5");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPNewYork(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPNewYork,"PIPNewYork");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovBI(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovBI,"MexicoCovBI");
				    return this;
			}
public SaveAndAssignClaimPage clickQuickClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaim,"QuickClaim");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPFlorida(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPFlorida,"PIPFlorida");
				    return this;
			}
public SaveAndAssignClaimPage clickMedicalPayments(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalPayments,"MedicalPayments");
				    return this;
			}
public SaveAndAssignClaimPage clickFNOLMenuActions(WebDriver driver)  {
					BrowserActions.click(driver, btnFNOLMenuActions,"FNOLMenuActions");
				    return this;
			}
public SaveAndAssignClaimPage clickInvolvedVehicles(WebDriver driver)  {
					BrowserActions.click(driver, btnInvolvedVehicles,"InvolvedVehicles");
				    return this;
			}
public SaveAndAssignClaimPage clickCollisionLimitedCoverage(WebDriver driver)  {
					BrowserActions.click(driver, btnCollisionLimitedCoverage,"CollisionLimitedCoverage");
				    return this;
			}
public SaveAndAssignClaimPage clickPolicyLevelCoverage(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyLevelCoverage,"PolicyLevelCoverage");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPMinnesota(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPMinnesota,"PIPMinnesota");
				    return this;
			}
public SaveAndAssignClaimPage click2004PontiacGTO(WebDriver driver)  {
					BrowserActions.click(driver, btn2004PontiacGTO,"2004PontiacGTO");
				    return this;
			}
public SaveAndAssignClaimPage clickPolicyDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyDetails,"PolicyDetails");
				    return this;
			}
public SaveAndAssignClaimPage clickQuickClaimBaggage(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaimBaggage,"QuickClaimBaggage");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPUtah(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPUtah,"PIPUtah");
				    return this;
			}
public SaveAndAssignClaimPage clickChoosebyCoverageType(WebDriver driver)  {
					BrowserActions.click(driver, btnChoosebyCoverageType,"ChoosebyCoverageType");
				    return this;
			}
public SaveAndAssignClaimPage clickRentalReimbursement(WebDriver driver)  {
					BrowserActions.click(driver, btnRentalReimbursement,"RentalReimbursement");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPMaryland(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPMaryland,"PIPMaryland");
				    return this;
			}
public SaveAndAssignClaimPage clickLiabilityBodilyInjury_2(WebDriver driver)  {
					BrowserActions.click(driver, btnLiabilityBodilyInjury_2,"LiabilityBodilyInjury_2");
				    return this;
			}
public SaveAndAssignClaimPage clickItem(WebDriver driver)  {
					BrowserActions.click(driver, btnItem,"Item");
				    return this;
			}
public SaveAndAssignClaimPage clickPIPKansas(WebDriver driver)  {
					BrowserActions.click(driver, btnPIPKansas,"PIPKansas");
				    return this;
			}
public SaveAndAssignClaimPage clickItem_1(WebDriver driver)  {
					BrowserActions.click(driver, btnItem_1,"Item_1");
				    return this;
			}
public SaveAndAssignClaimPage clickSaveClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveClaim,"SaveClaim");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovVehicleDamage(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovVehicleDamage,"MexicoCovVehicleDamage");
				    return this;
			}
public SaveAndAssignClaimPage clickLiabilityPropertyDamage(WebDriver driver)  {
					BrowserActions.click(driver, btnLiabilityPropertyDamage,"LiabilityPropertyDamage");
				    return this;
			}
public SaveAndAssignClaimPage clickQuickClaimProperty(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickClaimProperty,"QuickClaimProperty");
				    return this;
			}
public SaveAndAssignClaimPage clickPartiesInvolved_17(WebDriver driver)  {
					BrowserActions.click(driver, btnPartiesInvolved_17,"PartiesInvolved_17");
				    return this;
			}
public SaveAndAssignClaimPage clickMexicoCovGenDamages(WebDriver driver)  {
					BrowserActions.click(driver, btnMexicoCovGenDamages,"MexicoCovGenDamages");
				    return this;
			}
public SaveAndAssignClaimPage clickItem_11(WebDriver driver)  {
					BrowserActions.click(driver, btnItem_11,"Item_11");
				    return this;
			}
public SaveAndAssignClaimPage clickItem_12(WebDriver driver)  {
					BrowserActions.click(driver, btnItem_12,"Item_12");
				    return this;
			}
public SaveAndAssignClaimPage clickItem_14(WebDriver driver)  {
					BrowserActions.click(driver, btnItem_14,"Item_14");
				    return this;
			}
}
