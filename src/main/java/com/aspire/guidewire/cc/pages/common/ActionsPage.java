package com.aspire.guidewire.cc.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.cc.pages.nonlob.NewActivityClaimPage;
import com.aspire.guidewire.pc.pages.common.AccountFileDocumentsPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class ActionsPage  extends LoadableComponent<ActionsPage>{
	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuActions']", AI = false)
	public WebElement lnkActions;

	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType']", AI = false)
	public WebElement lnkChooseByCoverageType;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage']", AI = false)
	public WebElement lnkChooseByCoverage;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item']", AI = false)
	public WebElement lnkPolicyLevelCovearge;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-1-item']", AI = false)
	public WebElement lnkAddressCoverage;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-1-item-0-item']", AI = false)
	public WebElement lnkCoverageADwelling;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-1-item-1-item']", AI = false)
	public WebElement lnkCoverageBOtherStructures;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-1-item-2-item']", AI = false)
	public WebElement lnkCoverageCPersonalProperty;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-1-item-3-item']", AI = false)
	public WebElement lnkCoverageDLossOfUse;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Rented Equipment']", AI = false)
	public WebElement lnkRentedEquipment;

	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-0-item']", AI = false)
	public WebElement lnkCoverageTypeC;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-1-item']", AI = false)
	public WebElement lnkCoverageTypeD;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='E']//ancestor::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement lnkCoverageTypeE;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-6-item']", AI = false)
	public WebElement lnkCoverageTypeR;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='U']//ancestor::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement lnkCoverageTypeU;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Collision']", AI = false)
	public WebElement lnkCollision;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Comprehensive']", AI = false)
	public WebElement lnkComprehensive;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-5-item']", AI = false)
	public WebElement lnkCoverageTypeP;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-7-item']", AI = false)
	public WebElement lnkCoverageTypeT;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='PIP - Kentucky']", AI = false)
	public WebElement lnkPipKentucky;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Tape / Disc Media']", AI = false)
	public WebElement lnkTapeAndDisc;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Towing and Labor']", AI = false)
	public WebElement lnkTowingAndLabor;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Death and Disability Benefit']", AI = false)
	public WebElement lnkDeathAndDisability;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Electronic Equipment']", AI = false)
	public WebElement lnkElectronicEquipment;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Rental Reimbursement']", AI = false)
	public WebElement lnkRentalReimburement;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Rental Car Loss of Use']", AI = false)
	public WebElement lnkRentalCarLossOfUse;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item-0-item-0-item']", AI = false)
	public WebElement lnkLiabilityBodilyInjury;

	@IFindBy(how = How.CSS, using = "div[id$='_ByCoverage-0-item-4-item']", AI = false)
	public WebElement lnkUninsuredMotoristsBodilyInjury;
	
	@IFindBy(how = How.CSS, using = "div[id$='_ByCoverage-0-item-3-item']", AI = false)
	public WebElement lnkUnderinsuredMotoristsBodilyInjury;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item-0-item-2-item']", AI = false)
	public WebElement lnkLiabilityVehicleDamage;
	
	@IFindBy(how = How.CSS, using = "div[id$='_ByCoverage-0-item-2-item']", AI = false)
	public WebElement btnMedicalPayments;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Uninsured Motorist - Property Damage']", AI = false)
	public WebElement lnkUninsuredMotoristsPropertyDamage;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Underinsured Motorist - Property Damage']", AI = false)
	public WebElement lnkUnderInsuredMotoristsPropertyDamage;
	
	@IFindBy(how = How.CSS, using = "div[id$='_ByCoverage-0-item-3-item']", AI = false)
	public WebElement lnkUnderInsuredMotoristsBodilyInjury;

	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item-1-item-0-item']", AI = false)
	public WebElement lnkMexicoCovBI;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item-1-item-1-item']", AI = false)
	public WebElement lnkMexicoCovPD;
	
	@IFindBy(how = How.CSS, using = "div[id$='_ByCoverage-0-item-1-item']", AI = false)
	public WebElement lnkMexicoCovLimited;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewNote']", AI = false)
	public WebElement lnkNewNote;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimMenuActions_CloseClaim']", AI = false)
	public WebElement btnCloseClaim;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimMenuActions_ReopenClaim']", AI = false)
	public WebElement lnkReopenclaim;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Additionally Acquired Property']", AI = false)
	public WebElement lnkAdditionallyAcquiredProperty;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Preservation Of Property']", AI = false)
	public WebElement lnkPreservationOfProperty;
	
	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'1: UL Class A')]", AI = false)
	public WebElement lnkUlClassA;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Accounts Receivable']", AI = false)
	public WebElement lnkAccountsReceivable;////div[contains(@id,'ByCoverage-2-item-0-item')]//following::div[text()='Accounts Receivable']
	
	@IFindBy(how = How.CSS, using = "select[name$='Topic']", AI = false)
	public WebElement drpTopic;

	@IFindBy(how = How.CSS, using = "select[name$='SecurityType']", AI = false)
	public WebElement drpSecurityType;

	@IFindBy(how = How.CSS, using = "select[name$='RelatedTo']", AI = false)
	public WebElement drpRelatedTo;

	@IFindBy(how = How.CSS, using = "input[name$='Subject']", AI = false)
	public WebElement txtSubject;

	@IFindBy(how = How.CSS, using = "textarea[name$='Body']", AI = false)
	public WebElement txtText;

	@IFindBy(how = How.CSS, using = "input[id$='Confidential_0']", AI = false)
	public WebElement rdbYesConfidential;

	@IFindBy(how = How.CSS, using = "input[id$='Confidential_1']", AI = false)
	public WebElement rdbNoConfidential;	

	@IFindBy(how = How.CSS, using = "div[id*='Update']", AI = false)
	public WebElement btnUpdate;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimPartiesGroup']", AI = false)
	public WebElement btnPartiesGroup;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimContacts']", AI = false)
	public WebElement btnClaimContacts;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimMenuActions_Assign']", AI = false)
	public WebElement btnAssignClaim;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimLossDetailsGroup']", AI = false)
	public WebElement btnLossDetails;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSubrogationGroup']", AI = false)
	public WebElement btnSubrogation;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewExposureMenuItemSet_ByCoverage-1-item']", AI = false)
	public WebElement btnAddedVehicleCoverage;
 
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-5-item']", AI = false)
	public WebElement btnCoverageTypeH;
	@IFindBy(how = How.CSS, using = "div[id$='ClaimMenuActions_NewServiceRequest']", AI = false)
	public WebElement btnService;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimMenuActions_Email']", AI = false)
	public WebElement lnkEmail;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimNewDocumentMenuItemSet_Create']", AI = false)
	public WebElement btnCreateTemplate;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimNewDocumentMenuItemSet_Link']", AI = false)
	public WebElement btnUploadDocument;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimNewDocumentMenuItemSet_IndicateExists']", AI = false)
	public WebElement btnIndicateExistenceDocument;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewClaimMenuActions_NewDocument']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-10-item']", AI = false)
	public WebElement btnCoverageTypeM;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Hired Auto Liability']", AI = false)
	public WebElement btnHiredAutoLiability;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Hired Auto Liability - Vehicle Damage']", AI = false)
	public WebElement btnHiredAutoLiabilityVehicleDamage;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-10-item-4-item']", AI = false)
	public WebElement drpMoneyAndSecuritiesCoverageType;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='L']//ancestor::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement btnCoverageTypeL;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-0-item']", AI = false)
	public WebElement btnCoverageTypeA;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-0-item-1-item']", AI = false)
	public WebElement btnAggregateLimitsOfInsuranceType;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewExposureMenuItemSet_ByCoverageType-9-item-1-item']", AI = false)
	public WebElement btnLiability;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimMenuActions_NewOtherTrans']", AI = false)
	public WebElement btnOther;

	@IFindBy(how = How.CSS, using = "div[id$='NewTransaction_RecoverySet']", AI = false)
	public WebElement btnRecovery;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimWorkplan']", AI = false)
	public WebElement btnWorkPlan;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimExposures']", AI = false)
	public WebElement btnExposure;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimMenuActions_NewTransaction_ReserveSet']", AI = false)
	public WebElement btnReserve;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimFinancialsSummary']", AI = false)
	public WebElement btnSummary;
	
	@IFindBy(how = How.CSS, using = "#Claim-MenuLinks-Claim_ClaimDocuments", AI = false)
	public WebElement btnDocument;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-9-item-1-item-1-item']", AI = false)
	public WebElement btnLiabilityPD;
	
	@IFindBy(how = How.CSS, using = "div[id$='ReturnToApp']", AI = false)
	public WebElement btnReturnToClaimCenter;
	
	@IFindBy(how = How.CSS, using = "input[name$='FindClaim']", AI = false)
	public WebElement inpclaim;
	
	@IFindBy(how = How.CSS, using = "div[id$='FindClaim_Button']", AI = false)
	public WebElement btnSearchClaim;
	
	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-ClaimTab']//child::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement btnClaimToggleMenu;
	
	@IFindBy(how = How.XPATH, using = "//div[@data-gw-click='toggleSubMenu'] //parent::div[@id='Claim-MenuLinks-Claim_ClaimFinancialsGroup']", AI = false)
	public WebElement btnFinancialsSubMenu;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimFinancialsGroup_ClaimFinancialsChecks']", AI = false)
	public WebElement btnFinancialsChecks;
	
	@IFindBy(how = How.TAG_NAME, using = "html", AI = false)
	public WebElement lnkHtml;

	@IFindBy(how = How.CSS, using = "div[id$='NewTransaction_Check']", AI = false)
	public WebElement btnManualCheck;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewTransaction_CheckSet']", AI = false)
	public WebElement btnCheck;

	@IFindBy(how = How.XPATH, using = "//div[text()='Special Coverage Packages']", AI = false)
	public WebElement btnSpecialCoveragePackages;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Liability - Bodily Injury and Property Damage']", AI = false)
	public WebElement lnkLiablityBodilyInjuryAndPropertyDamage;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Coverage for Injury to Leased Workers']", AI = false)
	public WebElement lnkCoverageForInjuryToLeasedWorkers;

	@IFindBy(how = How.XPATH, using = "//div[text()='General Liability']", AI = false)
	public WebElement lnkGeneralLiability;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item-1-item-7-item']", AI = false)
	public WebElement lnkGLProdMedPay;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-3-item']", AI = false)
	public WebElement lnkCoverageTypeG;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Governmental Subdivisions']", AI = false)
	public WebElement lnkGovermenatalSubdivisions;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-3-item-2-item-2-item']", AI = false)
	public WebElement lnkGovtSubdivisionGenDamage;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item-1-item-0-item']", AI = false)
	public WebElement lnkGLPesrsonalAdvertisingInjury;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-3-item-2-item-1-item']", AI = false)
	public WebElement lnkGovtSubdivisionPD;

	@IFindBy(how = How.CSS, using = "div[id$='NewExposureMenuItemSet_ByCoverageType-2-item']", AI = false)
	public WebElement btnBusinessPersonalPropertyStock;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverage-0-item']", AI = false)
	public WebElement btnBusinessAddressDetails;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-2-item']", AI = false)
	public WebElement lnkCoverageC_CA;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewExposureMenuItemSet_ByCoverage-0-item-1-item']", AI = false)
	public WebElement lnkLiablityBodilyInjuryAndPropertyDamage_CA;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewExposureMenuItemSet_ByCoverage-0-item-1-item-2-item']", AI = false)
	public WebElement lnkLiabilityBodilyInjury_CA;//
	
	@IFindBy(how = How.CSS, using = "div[id$='_ByCoverage-1-item-3-item']", AI = false)
	public WebElement lnkUninsuredMotoristsBodilyInjury_CA;

	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-3-item']", AI = false)
	public WebElement lnkPersonalPropertyCoverage;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-4-item']", AI = false)
	public WebElement lnkLossOfUse;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-5-item']", AI = false)
	public WebElement lnkMedicalPaymentsToOthers;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-6-item']", AI = false)
	public WebElement lnkFungusAndRemediation;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-8-item']", AI = false)
	public WebElement lnkScheduledPersonalProperty;
	
	@IFindBy(how = How.CSS, using = "div[id$='_ByCoverage-0-item-2-item']", AI = false)
	public WebElement lnkIdentityTheftProtection;

	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-0-item']", AI = false)
	public WebElement lnkCoverageEPersonalLiability;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-0-item-0-item']", AI = false)
	public WebElement lnkCoverageELiabilityBodilyInjury;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-0-item-1-item']", AI = false)
	public WebElement lnkCoverageELiabilityGeneral;
	
	@IFindBy(how = How.CSS, using = "div[id$='ByCoverageType-0-item-2-item']", AI = false)
	public WebElement lnkCoverageELiabilityProperty;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewExposureMenuItemSet_ByCoverage-0-item-0-item']", AI = false)
	public WebElement btnBusinessCoverage;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewExposureMenuItemSet_ByCoverage-0-item-1-item']", AI = false)
	public WebElement btnBusinessIncomeCoverage;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Business Personal Property Coverage']", AI = false)
	public WebElement btnBusinessPersonalPropertyCoverage;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Extra Expense Coverage']", AI = false)
	public WebElement btnBusinessExtraExpenseCoverage;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Underground Resources Cov - Gen. Damages']", AI = false)
	public WebElement lnkUndergroundResourcesCovGenDamages;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Ltd Contractual Liab for Personal Advertising and Injury']", AI = false)
	public WebElement lnkLtdContractualLiabForPersonalAdvertisingInjury;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Employee Benefits Liability']", AI = false)
	public WebElement lnkEmployeeBenefitsLiability;
	
	@IFindBy(how = How.XPATH, using = "(//div[text()='Contractual Liability - Railroads']//ancestor::div[@data-gw-click='toggleSubMenu'])[last()]", AI = false)
	public WebElement lnkContractualLiabilityRailroads;
	
	@IFindBy(how = How.XPATH, using = "(//div[text()='Contract Liability - RR  -BI']//ancestor::div[@role='menuitem'])[last()]", AI = false)
	public WebElement lnkContractLiabilityRR_BI;
	
	@IFindBy(how = How.XPATH, using = "(//div[text()='Liquor Liability Endorsement']//ancestor::div[@role='menuitem'])[last()]", AI = false)
	public WebElement lnkLiquorLiabilityEndorsement;
	
	@IFindBy(how = How.XPATH, using = "(//div[text()='Liquor Liability Cov - BI']//ancestor::div[@role='menuitem'])[last()]", AI = false)
	public WebElement lnkLiquorLiabilityCov_BI; 
	
	@IFindBy(how = How.CSS, using = "div[id$='Documents']", AI = false)
	 public WebElement lnkDocuments;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewPolicyDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked']", AI = false)
	 public WebElement btnUploadDocuments;
	
	@IFindBy(how = How.CSS, using = "div[id$='2-NewActivityMenuItemSet_Category']", AI = false)
	 public WebElement lnkInterview;
	
	@IFindBy(how = How.CSS, using = "div[id$='2-NewActivityMenuItemSet_Category-0-item']", AI = false)
	 public WebElement lnkfirstActivity;

	public ActionsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lnkActions))){
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * Used to click on Actions
	 * @author vignesh.ravi
	 * @param driver
	 */
	public ActionsPage clickActions(WebDriver driver) {
		BrowserActions.click(driver, lnkActions,1.5,"Actions");
		return this;
	}

	/**
	 * Used to click Choose by Coverage type
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage moveToChooseByCoverageType(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkChooseByCoverageType, "Choose By Coverage Type");
		return this;
	}
	
	/**
	 * Used to click Choose by Coverage 
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage moveToChooseByCoverage(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkChooseByCoverage,1,"Choose By Coverage");
		return this;
	}
	
	/**
	 * Used to click Choose by Coverage 
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage moveToPolicyLevelCoverage(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkPolicyLevelCovearge,2,"Policy level Coverage");
		return this;
	}
	
	/**
	 * Used to click Choose by Coverage 
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickToRentedEquipmentCoverage(WebDriver driver) {
		BrowserActions.click(driver, lnkRentedEquipment, "Policy level Coverage");
		return this;
	}

	/**
	 * Used to click Choose by Coverage type C
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToC(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeC, "Coverage Type is C");
	}
	/**
	 * Used to click Choose by Coverage type D
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToD(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeD, "Coverage Type is D");
	}
	/**
	 * Used to click Choose by Coverage type D
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage moveToE(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeE, "Coverage Type is E");
		return this;
	}
	/**
	 * Used to click Choose by Coverage type R
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToR(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeR, "Coverage Type is E");
	}
	/**
	 * Used to click Choose by Coverage type P
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToP(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeP, "Coverage Type is P");
	}
	/**
	 * Used to click Choose by Coverage type P
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToT(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeT, "Coverage Type is T");
	}
	/**
	 * Used to click Choose by Coverage type P
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage moveToU(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeU, "Coverage Type is U");
		return this;
	}
	
	/**
	 * Used to click Collision coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCollision(WebDriver driver) {
		BrowserActions.click(driver, lnkCollision, "Collision");
	}
	
	/**
	 * Used to click Comprehensive coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickComprehensive(WebDriver driver) {
		BrowserActions.click(driver, lnkComprehensive, "Comprehensive");
	}
	
	/**
	 * Used to click Choose PIP Kentucky Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickPipKentuckyCoverage(WebDriver driver) {
		BrowserActions.click(driver, lnkPipKentucky, "PIP Kentucky Coverage");
	}
	/**
	 * Used to click Choose PIP Kentucky Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickTapeDiscCoverage(WebDriver driver) {
		BrowserActions.click(driver, lnkTapeAndDisc, "Tape and Disc Coverage");
	}
	/**
	 * Used to click Choose Liablity bodily injury Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickLiabilityBodilyInjury(WebDriver driver) {
		BrowserActions.click(driver, lnkLiabilityBodilyInjury, "Liability bodily injury Coverage");
	}
	/**
	 * Used to click Choose Liability bodily injury and property damage Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToLiabilityBodilyInjuryPropertyDamage(WebDriver driver) {
		BrowserActions.moveToElement(driver,lnkLiablityBodilyInjuryAndPropertyDamage, "Liability bodily injury Coverage");
	}
	
	/**
	 * Used to click uninsured motorists bodily injury Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickUninsuredMotoristsBodilyInjury(WebDriver driver) {
		BrowserActions.click(driver, lnkUninsuredMotoristsBodilyInjury, "Uninsured Motorists bodily injury Coverage");
	}
	/**
	 * Used to click uninsured motorists bodily injury Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickUninsuredMotoristsPropertyDamage(WebDriver driver) {
		BrowserActions.click(driver, lnkUninsuredMotoristsPropertyDamage, "Uninsured Motorists Property damageCoverage");
	}
	/**
	 * Used to click Liability vehicle damage coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickLiabilityVehicleDamage(WebDriver driver) {
		BrowserActions.click(driver, lnkLiabilityVehicleDamage, "Liability Vehicle Damage");
	}
	/**
	 * Used to click under insured motorists bodily injury Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickUnderInsuredMotoristsPropertyDamage(WebDriver driver) {
		BrowserActions.click(driver, lnkUnderInsuredMotoristsPropertyDamage, "Uninsured Motorists Property damage Coverage");
	}
	/**
	 * Used to click under insured motorists bodily injury Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickUnderInsuredMotoristsBodilyInjury(WebDriver driver) {
		BrowserActions.click(driver, lnkUnderInsuredMotoristsBodilyInjury,0.5, "Uninsured Motorists bodily injury Coverage");
	}
	/**
	 * Used to click Death and Disability coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickDeathAndDisability(WebDriver driver) {
		BrowserActions.click(driver, lnkDeathAndDisability, "Death and disability Coverage");
	}
	/**
	 * Used to click Electronic Equipment coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickElectronicEquipmentCoverage(WebDriver driver) {
		BrowserActions.click(driver, lnkElectronicEquipment, "Electronic equipment Coverage");
	}
	/**
	 * Used to click Electronic Equipment coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveMexicoCovLimited(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkMexicoCovLimited, "Mexico Coverage limited");
	}
	/**
	 * Used to click Mexico cov BI coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickMexicoCov_BI(WebDriver driver) {
		BrowserActions.click(driver, lnkMexicoCovBI, "Mexico Coverage BI");
	}
	/**
	 * Used to click Mexico cov PD coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickMexicoCov_PD(WebDriver driver) {
		BrowserActions.click(driver, lnkMexicoCovPD, "Mexico Coverage PD");
	}
	/**
	 * Used to click Electronic Equipment coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage clickRentalReimbursement(WebDriver driver) {
		BrowserActions.click(driver, lnkRentalReimburement, "Rental Reimbursement Coverage");
		return this;
	}
	/**
	 * Used to click Electronic Equipment coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickRentalCarLossOfUse(WebDriver driver) {
		BrowserActions.click(driver, lnkRentalCarLossOfUse, "Rental car loss of use Coverage");
	}
	/**
	 * Used to click Towing and Labor coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickTowingAndLabor(WebDriver driver) {
		BrowserActions.click(driver, lnkTowingAndLabor, "Towing and Labor Coverage");
	}
	
	/**
	 * Used to click Towing and Labor coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage clickNote(WebDriver driver){
		BrowserActions.click(driver, lnkNewNote, "New Note");
		return this;
	}
	
	/**
	 * select the topic DropDown
	 * @author siva.panjanathan 
	 * @param driver,topic
	 */
	public ActionsPage selectTopic(WebDriver driver, String topic) {
		BrowserActions.selectDropDownByVisibleText(driver, drpTopic, topic, "topic");
		return this;
	}

	/**
	 * select the Security Type DropDown
	 * @author siva.panjanathan 
	 * @param driver
	 * @param securityType
	 */
	public void selectSecurityType(WebDriver driver, String securityType) {
		BrowserActions.selectDropDownByVisibleText(driver, drpSecurityType, securityType, "Security Type");
	}

	/**
	 * select the Related To DropDown
	 * @author siva.panjanathan 
	 * @param driver,topic
	 */
	public void selectRelatedTo(WebDriver driver, String relatedTo) {
		BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo, relatedTo, "Related To");
	}

	/**
	 * enter the Subject
	 * @author siva.panjanathan
	 * @param driver,subject
	 */
	public void enterSubject(WebDriver driver, String subject) {
		BrowserActions.type(driver, txtSubject, subject, "Subject");
	}

	/**
	 * enter the Text
	 * @author siva.panjanathan 
	 * @param driver,text
	 */
	public ActionsPage enterText(WebDriver driver, String text) {
		BrowserActions.type(driver, txtText, text,1, "Text");
		return this;
	}

	/**
	 * Used to click on Update button
	 * @author siva.panjanathan 
	 * @param driver
	 */
	public void clickUpdate(WebDriver driver) {
		BrowserActions.click(driver, btnUpdate,true, "Update button");
	}
	
	/**
	 * Used to click on "PartiesGroup" link
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickPartiesGroup(WebDriver driver) {
		BrowserActions.click(driver, btnPartiesGroup,"PartiesGroup");
		return this;
	}
	/**
	 * Used to click on "Assign Claim" link
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickAssignClaim(WebDriver driver) {
		BrowserActions.click(driver, btnAssignClaim,"Assign Claim");
		return this;
	}
	/**
	 * Used to click on "PartiesGroup" link
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickSubrogation(WebDriver driver) {
		BrowserActions.click(driver, btnSubrogation,true,"Subrogation");
		return this;
	}

	/**
	 * Used to click on "ClaimContacts" link
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public ContactsPage clickContacts(WebDriver driver) {
		BrowserActions.click(driver, btnClaimContacts,1.5,"ClaimContacts");
		return new ContactsPage(driver).get();
	}
	/**
	 * Used to click on "ClaimContacts" link
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public LossDetailsPage clickLossDetails(WebDriver driver) {
		BrowserActions.click(driver, btnLossDetails,"Loss Details");
		return new LossDetailsPage(driver).get();
	}
	
	public void moveToAddedVehicleCoverage(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnAddedVehicleCoverage, "Added vehicle Coverage");
	}

	public AddServicePage clickService(WebDriver driver) {
		BrowserActions.click(driver, btnService,1,"Service");
		return new AddServicePage(driver).get();
	}
	/**
	 * Used to click Choose by Coverage type H
	 * @author lavanya.bala
	 * @param driver
	 */
	public void moveToH(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnCoverageTypeH, "Coverage Type is H");
	}
	
	/**
	 * Used to click HiredAutoLiability
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickHiredAutoLiability(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnHiredAutoLiability, "Hired auto liability");
	}
	
	/**
	 * Used to clicklnkHiredAutoLiability-VehicleDamage
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickHiredAutoLiabilityVehicleDamage(WebDriver driver) {
		BrowserActions.click(driver, btnHiredAutoLiabilityVehicleDamage, "Hired auto liability-vehicle damage");
	}
	
	
	/**
	 * Used to click Email in actions Page
	 * @author surendar.baskaran
	 * @param driver
	 */
	public ActionsPage clickEmail(WebDriver driver){
		BrowserActions.click(driver, lnkEmail, "New Note");
		return this;
	}

	/**
	 * Used to click on Create from a Template button
	 * @author surendar.baskaran
	 * @param driver
	 * @return 
	 */
	public ActionsPage clickCreateTemplate(WebDriver driver) {
		BrowserActions.click(driver, btnCreateTemplate, "Create from a Template button");
		return this;
	}
	
	/**
	 * Used to click on Upload Document button
	 * @author surendar.baskaran
	 * @param driver
	 * @return 
	 */
	public void clickUploadDocument(WebDriver driver) {
		BrowserActions.click(driver, btnUploadDocument,true, "Upload Document");
	}
	
	/**
	 * Used to click on Create from a Template button
	 * @author surendar.baskaran
	 * @param driver
	 * @return 
	 */
	public ActionsPage clickIndicateExistenceDocument(WebDriver driver) {
		BrowserActions.click(driver, btnIndicateExistenceDocument, "Indicate Existence Document button");
		return this;
	}

	public void clickNewDocumentButton(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnNewDocument, "New Document button");
	}
	
	public void moveToM(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnCoverageTypeM, "Coverage Type is M");
	}
	
	public void clickMoneyAndSecuritiesCoverageType(WebDriver driver) {
		BrowserActions.moveToElementandClick(driver, drpMoneyAndSecuritiesCoverageType, "Coverage Type is MoneyAndSecurities");
	}
	
	public void moveToA(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnCoverageTypeA, "Coverage Type is A");
	}
	
	public ActionsPage moveToL(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnCoverageTypeL, "Coverage Type is L");
		return this;
	}
	
	public ActionsPage moveToOther(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnOther,2, "Other");
		return this;
	}
	public void clickAggregateLimitsOfInsuranceType(WebDriver driver) {
		BrowserActions.moveToElementandClick(driver, btnAggregateLimitsOfInsuranceType, "Coverage Type is Aggregate Limits Of InsuranceType");
	}
	public CreateRecoveryPage clickRecovery(WebDriver driver) {
		BrowserActions.click(driver, btnRecovery, "Recovery");
		return new CreateRecoveryPage(driver).get();
	}
	
	public ActionsPage clickWorkPlan(WebDriver driver) {
		BrowserActions.click(driver, btnWorkPlan,1,"WorkPlan");
		return this;
	}
	
	public ActionsPage clickExposure(WebDriver driver) {
		BrowserActions.click(driver, btnExposure,"WorkPlan");
		return this;
	}
	
	public EditReservesPage clickReserve(WebDriver driver) {
		BrowserActions.click(driver, btnReserve, "reserve");
		return new EditReservesPage(driver).get();
		}
	public void clickMedicalPayments(WebDriver driver) {
		BrowserActions.click(driver, btnMedicalPayments, "reserve");
	}
	public ActionsPage clickSummary(WebDriver driver) {
		BrowserActions.click(driver, btnSummary, "reserve");
		return this;
	}
	
	public ActionsPage clickDocument(WebDriver driver) {
		BrowserActions.click(driver, btnDocument, "Document");
		return this;
		}
	
	/**
	 * Clicks on close claim button
	 * @author manikandan.manohar
	 * @param driver
	 * @return 
	 */
	public ActionsPage clickCloseClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseClaim,"Close claim");
		return this;
	}
	
	public ActionsPage moveLiability(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnLiability, "Liability");
		return this;
	}

	public ActionsPage clickLiabilityPD(WebDriver driver) {
		BrowserActions.click(driver, btnLiabilityPD, "Liability PD");
		return this;
	}
	
	public ActionsPage clickCheck(WebDriver driver) {
		BrowserActions.click(driver, btnCheck, "Check");
		return this;
		}
	
	public void clickSpecialCoveragePackages(WebDriver driver) {
		BrowserActions.click(driver, btnSpecialCoveragePackages, "Special Coverage Packages");
	}
	
	public EnterPayeeInformationPage clickManualCheck(WebDriver driver) {
		BrowserActions.click(driver, btnManualCheck, "Manual Check");
		return new EnterPayeeInformationPage(driver).get();
		}
		
	/**
	 * Used to click Reopen claim
	 * @author vignesh.ravi  
	 * @param driver
	 */
	public ActionsPage clickReopenClaim(WebDriver driver) {
		BrowserActions.click(driver, lnkReopenclaim, "Reopen Claim");
		return this;
	}
	/**
	 * Used to navigate to claim center
	 * @author vignesh.ravi  
	 * @param driver
	 */
	public ActionsPage clickReturnToClaimCenter(WebDriver driver) {
		BrowserActions.click(driver, btnReturnToClaimCenter, "Return to claim center");
		return this;
	}
	
	/**
	 * Used to click toggle menu
	 * @author vignesh.ravi  
	 * @param driver
	 */
	public ActionsPage clickClaimToggleMenu(WebDriver driver) {
		BrowserActions.click(driver, btnClaimToggleMenu, "claim toggle menu");
		return this;
	}
	/**
	 * Used to click toggle menu
	 * @author vignesh.ravi  
	 * @param driver
	 */
	public ActionsPage clickFinancialsSubMenu(WebDriver driver) {
		BrowserActions.click(driver, btnFinancialsSubMenu, "claim toggle menu");
		return this;
	}
	/**
	 * Used to click toggle menu
	 * @author vignesh.ravi  
	 * @param driver
	 */
	public ActionsPage clickFinancialsChecks(WebDriver driver) {
		BrowserActions.click(driver, btnFinancialsChecks, "Financials Checks");
		return this;
	}
	/**
	 * Used to click toggle menu
	 * @author vignesh.ravi  
	 * @param driver
	 */
	public SummaryPage clickSearchClaim(WebDriver driver) {
		BrowserActions.click(driver, btnSearchClaim, "Financials Checks");
		return new SummaryPage(driver).get();
	}
	/**
	 * Used to navigate to claim center
	 * @author vignesh.ravi  
	 * @param driver
	 */
	public ActionsPage enterClaimNumber(WebDriver driver, String value) {
		BrowserActions.type(driver, inpclaim,value, "claim");
		return this;
	}
	
	/**
	 * Used to click on "Additionally Acquired Property" 
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickAdditionallyAcquiredProperty(WebDriver driver) {
		BrowserActions.click(driver, lnkAdditionallyAcquiredProperty, "Additionally Acquired Property");
		return this;
	}
	
	/**
	 * Used to click on "Preservation Of Property"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickPreservationOfProperty(WebDriver driver) {
		BrowserActions.click(driver, lnkPreservationOfProperty, "Preservation Of Property");
		return this;
	}
	
	public void clickBusinessPersonalPropertyStock(WebDriver driver) {
		BrowserActions.click(driver, btnBusinessPersonalPropertyStock, "Special Coverage Packages");
	}
	
	public void clickBuildingAddressDetails(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnBusinessCoverage,1, "Business Address Details");
	}
	
	public void clickBusinessCoverage(WebDriver driver) {
		BrowserActions.click(driver, btnBusinessCoverage,1, "Business Address Details");
	}
	
	public void clickBusinessIncomeCoverage(WebDriver driver) {
		BrowserActions.click(driver, btnBusinessIncomeCoverage, "Building Address Income Details");
	}
	
	public void clickBusinessPersonalPropertyCoverage(WebDriver driver) {
		BrowserActions.click(driver, btnBusinessPersonalPropertyCoverage, "Business Personal Property Coverage");
	}
	
	public void clickBusinessExtraExpenseCoverage(WebDriver driver) {
		BrowserActions.click(driver, btnBusinessExtraExpenseCoverage, "Business Extra Expense Coverage");
	}
	/**
	 * Used to move on "Preservation Of Property"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage moveToUlClassA(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkUlClassA,1.5,"Ul Class A");
		return this;
	}
	
	/**
	 * Used to click on "Accounts Receivable"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickAccountsReceivable(WebDriver driver) {
		BrowserActions.click(driver, lnkAccountsReceivable,1,"Accounts Receivable");
		return this;
	}
	
	/**
	 * Used to click on "CoverageForInjuryToLeasedWorkers"
	 * @author surendar.baskaran
	 * @param driver
	 */
	public ActionsPage clickCoverageForInjuryToLeasedWorkers(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageForInjuryToLeasedWorkers, "CoverageForInjuryToLeasedWorkers");
		return this;
	}
	/**
	 * Used to click Choose by Coverage type C
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToCoverageC_CA(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageC_CA, "Coverage Type is C");
	}
	
	/**
	 * Used to move on "General Liability"
	 * @author surendar.baskaran
	 * @param driver
	 */
	public ActionsPage moveToGeneralLiability(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkGeneralLiability, "General Liability");
		return this;
	}
	
	/**
	 * Used to click Choose Liability bodily injury and property damage Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToLiabilityBodilyInjuryPropertyDamage_CA(WebDriver driver) {
		BrowserActions.moveToElement(driver,lnkLiablityBodilyInjuryAndPropertyDamage_CA, "Liability bodily injury Coverage");
	}

	/**
	 * Used to click on "GLMedPay"
	 * @author surendar.baskaran
	 * @param driver
	 */
	public ActionsPage clickGLMedPay(WebDriver driver) {
		BrowserActions.click(driver, lnkGLProdMedPay, "GLProdMedPay");
		return this;
	}
	
	/**
	 * Used to click Choose by Coverage type G
	 * @author surendar.baskaran
	 * @param driver
	 */
	public void moveToG(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageTypeG, "Coverage Type is G");
	}
	
	/**
	 * Used to click Choose by Coverage type G
	 * @author surendar.baskaran
	 * @param driver
	 */
	public void moveToGovermenatalSubdivisions(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkGovermenatalSubdivisions, "GovermenatalSubdivisions");
	}
	
	/**
	 * Used to click on "Govt Subdivision Gen Damage"
	 * @author surendar.baskaran
	 * @param driver
	 */
	public ActionsPage clickGovSubdivisionsGenDamage(WebDriver driver) {
		BrowserActions.click(driver, lnkGovtSubdivisionGenDamage, "Govt Subdivision Gen Damage");
		return this;
	}
	
	/**
	 * Used to click on "GLMedPay"
	 * @author surendar.baskaran
	 * @param driver
	 */
	public ActionsPage clickGLPerosnalAdvertisingInjury(WebDriver driver) {
		BrowserActions.click(driver, lnkGLPesrsonalAdvertisingInjury, "GLPersonal/Advertising Injury");
		return this;
	}
	
	/**
	 * Used to click on "GLSubdivisionPD"
	 * @author surendar.baskaran
	 * @param driver
	 */
	public ActionsPage clickGovSubdivisionsPD(WebDriver driver) {
		BrowserActions.click(driver, lnkGovtSubdivisionPD, "GLSubdivisionPD");
		return this;
	}

	/**
	 * Used to click Choose Liability bodily injury Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage clickLiabilityBodilyInjury_CA(WebDriver driver) {
		BrowserActions.click(driver, lnkLiabilityBodilyInjury_CA, "Liability bodily injury Coverage");
		return this;
	}
	
	/**
	 * Used to click uninsured motorists bodily injury Coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public ActionsPage clickUninsuredMotoristsBodilyInjury_CA(WebDriver driver) {
		BrowserActions.click(driver, lnkUninsuredMotoristsBodilyInjury_CA, "Uninsured Motorists bodily injury Coverage");
		return this;
	}
	
	/**
	 * Used to mouse over on"Contractual Liability Railroads Coverage"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage moveToContractualLiabilityRailroads(WebDriver driver) {
		BrowserActions.moveToElement(driver,lnkContractualLiabilityRailroads, "Contractual Liability Railroads Coverage");
		return this;
	}
	
	/**
	 * Used to mouse over on "Liquor Liability Endorsement Coverage"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage moveToLiquorLiabilityEndorsement(WebDriver driver) {
		BrowserActions.moveToElement(driver,lnkLiquorLiabilityEndorsement, "Liquor Liability Endorsement Coverage");
		return this;
	}
	
	/**
	 * Used to click on "Underground Resources Cov Gen. Damages Coverage"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickUndergroundResourcesCovGenDamages(WebDriver driver) {
		BrowserActions.click(driver,lnkUndergroundResourcesCovGenDamages, "Underground Resources Cov Gen. Damages Coverage");
		return this;
	}
	
	/**
	 * Used to click on "Ltd Contractual Liab Personal Advertising Injury Coverage"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickLtdContractualLiabForPersonalAdvertisingInjury(WebDriver driver) {
		BrowserActions.click(driver,lnkLtdContractualLiabForPersonalAdvertisingInjury, "Ltd Contractual Liab Personal Advertising Injury Coverage");
		return this;
	}
	
	/**
	 * Used to click on "Employee Benefits Liability Coverage"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickEmployeeBenefitsLiability(WebDriver driver) {
		BrowserActions.click(driver,lnkEmployeeBenefitsLiability, "Employee Benefits Liability Coverage");
		return this;
	}
	
	/**
	 * Used to click on "Contract Liability RR BI Coverage"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickContractLiabilityRR_BI(WebDriver driver) {
		BrowserActions.click(driver,lnkContractLiabilityRR_BI, "Contract Liability RR BI Coverage");
		return this;
	}
	
	/**
	 * Used to click on "Liquor Liability Cov BI Coverage"
	 * @author anitha.raphel
	 * @param driver
	 */
	public ActionsPage clickLiquorLiabilityCov_BI(WebDriver driver) {
		BrowserActions.click(driver,lnkLiquorLiabilityCov_BI, "Liquor Liability Cov BI Coverage");
		return this;
	}

	/**
	 * Used to click personal property coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickPersonalProperty(WebDriver driver) {
		BrowserActions.click(driver, lnkPersonalPropertyCoverage, "Personal property Coverage");
	}
	/**
	 * Used to click Loss of use coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickLossOfUse(WebDriver driver) {
		BrowserActions.click(driver, lnkLossOfUse, "Loss of use");
	}
	/**
	 * Used to click Fungus and Remediation coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickFungusAndRemediation(WebDriver driver) {
		BrowserActions.click(driver, lnkFungusAndRemediation, "Fungus and remediation");
	}
	/**
	 * Used to click coverage E -Liability Bodily Injury coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageELiabilityBodilyInjury(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageELiabilityBodilyInjury, "Liability bodily injury");
	}
	/**
	 * Used to click coverage E -Liability General coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageELiabilityGeneral(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageELiabilityGeneral, "Liability General");
	}
	/**
	 * Used to click coverage E -Liability General coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageELiabilityProperty(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageELiabilityProperty,"Liability property");
	}
	/**
	 * Used to click coverage E -Liability Bodily Injury coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageFMedicalpaymentToOthers(WebDriver driver) {
		BrowserActions.click(driver, lnkMedicalPaymentsToOthers, "Medical payments to others");
	}
	
	/**
	 * Used to click coverage E -Liability Bodily Injury coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickIdentityTheftProtection(WebDriver driver) {
		BrowserActions.click(driver, lnkIdentityTheftProtection, "Identity theft protection ");
	}
	
	/**
	 * Used to click coverage E -Liability Bodily Injury coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickScheduledPersonalProperty(WebDriver driver) {
		BrowserActions.click(driver, lnkScheduledPersonalProperty, "Scheduled personal property");
	}
	/**
	 * Used to click coverage E -Liability Bodily Injury coverage
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickAddressCoverage(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkAddressCoverage, "Address Coverage");
	}
	/**
	 * Used to click coverage A Dwelling
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageADwelling(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageADwelling, "Coverage A Dwelling");
	}
	
	/**
	 * Used to click coverage B Other Structures
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageBOtherStructures(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageBOtherStructures, "Coverage B other Structures");
	}
	/**
	 * Used to click coverage C Personal property
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageCPersonalProperty(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageCPersonalProperty, "Coverage C Personal property");
	}
	/**
	 * Used to click coverage D Loss Of Use
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickCoverageDLossOfUse(WebDriver driver) {
		BrowserActions.click(driver, lnkCoverageDLossOfUse, "Coverage D Loss of use");
	}
	
	/**
	 * Used to click coverage E - Personal liability
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void movetoEPersonalLiability(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkCoverageEPersonalLiability, "PersonalLiability");
	}
	
	public ActionsPage clickUploadDocuments(WebDriver driver) {
		BrowserActions.click(driver, btnUploadDocuments, "Upload Documents");
		 return this;
		 }
		/**
		���� * Used to click on Documents link
		���� * @author manikandan.manohar
		���� * @param driver
		���� * @return�
		���� */
		public AccountFileDocumentsPage clickDocuments(WebDriver driver) {
	 BrowserActions.click(driver, lnkDocuments , "Documents link");
		 return new AccountFileDocumentsPage(driver).get();
		 }
	
		public ActionsPage clickInterview(WebDriver driver) {
			BrowserActions.moveToElement(driver, lnkInterview, " Interview");
			 return this;
			 }
		public NewActivityClaimPage clickStatementFromWitness(WebDriver driver) {
			BrowserActions.click(driver, lnkfirstActivity,1," Statement from witness");
			 return new NewActivityClaimPage(driver).get();
			 }
		
}