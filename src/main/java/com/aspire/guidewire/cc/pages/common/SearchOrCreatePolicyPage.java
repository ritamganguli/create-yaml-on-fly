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

public class SearchOrCreatePolicyPage extends LoadableComponent<SearchOrCreatePolicyPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public FNOLWizardFindPolicyPanelSetSearch fnolwizardfindpolicypanelsetsearchTable;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyGeneral>div[role='menuitem']", AI = false)
	private WebElement btnPolicyGeneral;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherPolicyID_dateIcon", AI = false)
	private WebElement btnReportedDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicPartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicMainContacts>div[role='menuitem']", AI = false)
	private WebElement btnOLDBasicInfo;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-BasicInfo>div[role='menuitem']", AI = false)
	private WebElement btnBasicInfo;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-date_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-ClaimNumber2']", AI = false)
	private WebElement inpClaimNumber;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherID']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_lossTime_dateIcon", AI = false)
	private WebElement btnTimeDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherPolicyID']", AI = false)
	private WebElement inpReported;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherStatus']", AI = false)
	private WebElement drpStatus_8;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicExposures>div[role='menuitem']", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails_11;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Services>div[role='menuitem']", AI = false)
	private WebElement btnServices;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAutoFirstAndFinal>div[role='menuitem']", AI = false)
	private WebElement btnAutoFirstandFinal;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name$='olicyNumber']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-PolicyNumber']", AI = false)
	private WebElement inpPolicy_2;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim_12;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpOrganizationName;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-date']", AI = false)
	private WebElement inpLossDate_6;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyType']", AI = false)
	private WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicLossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-IncludeArchivedPolicies']", AI = false)
	private WebElement chkIncludeArchivedPolicies;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-selectButton", AI = false)
	private WebElement btnSelect;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_7;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAuto>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimAuto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelTripCancelOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickTripCancel;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherClaimant']", AI = false)
	private WebElement inpAssignedto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-Zip']", AI = false)
	private WebElement inpZIPCode_5;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherLossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_10;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_lossTime']", AI = false)
	private WebElement inpTime;

	@IFindBy(how = How.CSS, using = "select[name$='Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-Effective_dateIcon", AI = false)
	private WebElement btnEffectiveDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FindPolicy>div[role='menuitem']", AI = false)
	private WebElement btnFindPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	private WebElement btnDocuments_14;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-Address']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup>div[role='menuitem']", AI = false)
	private WebElement btnPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicDocuments>div[role='menuitem']", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicAssign>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-vin']", AI = false)
	private WebElement inpVIN;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Notes>div[role='menuitem']", AI = false)
	private WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-ssn']", AI = false)
	private WebElement inpSSNorTaxID;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimGL>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaim;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-ScreenMode']", AI = false)
	private WebElement rdbScreenMode;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-Insured']", AI = false)
	private WebElement inpInsured;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherInsured']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "div[id=$'FNOLWizard-FNOLMenuActions']>div[role='button']", AI = false)
	private WebElement btnFNOLMenuActions;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-Expiration_dateIcon", AI = false)
	private WebElement btnExpiresDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-FNOLWizard_PolicySearchInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	private WebElement btnInvolvedVehicles;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyDetails>div[role='menuitem']", AI = false)
	private WebElement btnPolicyDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelBaggageOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimBaggage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-unselectButton", AI = false)
	private WebElement btnUnselect;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar'] div[id=FNOLWizard-FNOLWizard_FindPolicyScreen-ttlBar]", AI = false)
	private WebElement lblTtlBar;//#FNOLWizard-FNOLWizard_FindPolicyScreen-ttlBar

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicSummary>div[role='menuitem']", AI = false)
	private WebElement btnSaveClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimPr>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimProperty;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-State']", AI = false)
	private WebElement drpState_4;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name$='EffectiveDate']", AI = false)
	private WebElement inpEffective;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved_13;

	@IFindBy(how = How.CSS, using = "input[name$='ExpirationDate']", AI = false)
	private WebElement inpExpires;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-otherClaimLV-0-otherLossDate']", AI = false)
	private WebElement inpLossDate_9;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyResultLV-0-City']", AI = false)
	private WebElement inpCity_3;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_LossDate']", AI = false)
	private WebElement inpLossDate;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyResultLV-0-Insured']", AI = false)
	public WebElement lblInsured;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyNumber']", AI = false)
	public WebElement inpPolicyNumber;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-NewClaimPolicyGeneralDV-EffectiveDate']", AI = false)
	public WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-NewClaimPolicyGeneralDV-ExpirationDate']", AI = false)
	public WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-NewClaimPolicyGeneralPanelSet-NewClaimPolicyGeneralDV-Insured_Name-Insured_NameMenuIcon>div[role='button']", AI = false)
	public WebElement btnInsured_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "input[id$='FindPolicyScreen-ScreenMode_1']", AI = false)
	public WebElement rdoCreateUnverifiedPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='NewContactPickerMenuItemSet_NewPerson']", AI = false)
	public WebElement btnInsuredNewPerson;

	@IFindBy(how = How.CSS, using = "div[id$='Insured_NameMenuIcon']", AI = false)
	public WebElement btnInsuredNameMenuIcon;

	public SearchOrCreatePolicyPage(){
	}

	public SearchOrCreatePolicyPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		fnolwizardfindpolicypanelsetsearchTable = new FNOLWizardFindPolicyPanelSetSearch();
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
	}public SearchOrCreatePolicyPage clickPolicyGeneral(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyGeneral,"PolicyGeneral");
		return this;
	}
	public SearchOrCreatePolicyPage clickReportedDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnReportedDateIcon,"ReportedDateIcon");
		return this;
	}
	public SearchOrCreatePolicyPage clickPartiesInvolved(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved,"PartiesInvolved");
		return this;
	}
	public SearchOrCreatePolicyPage clickOLDBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnOLDBasicInfo,"OLDBasicInfo");
		return this;
	}
	public SearchOrCreatePolicyPage enterFirstname(WebDriver driver,String Firstname) {
		BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
		return this;
	}
	public SearchOrCreatePolicyPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public SearchOrCreatePolicyPage selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public SearchOrCreatePolicyPage clickBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnBasicInfo,"BasicInfo");
		return this;
	}
	public SearchOrCreatePolicyPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public SearchOrCreatePolicyPage clickLossDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDateDateIcon,"LossDateDateIcon");
		return this;
	}
	public SearchOrCreatePolicyPage enterClaimNumber(WebDriver driver,String ClaimNumber) {
		BrowserActions.type(driver, inpClaimNumber,ClaimNumber, "ClaimNumber");
		return this;
	}
	public SearchOrCreatePolicyPage enterClaim(WebDriver driver,String Claim) {
		BrowserActions.type(driver, inpClaim,Claim, "Claim");
		return this;
	}
	public SearchOrCreatePolicyPage enterValiduntil(WebDriver driver,String Validuntil) {
		BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
		return this;
	}
	public SearchOrCreatePolicyPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public SearchOrCreatePolicyPage clickTimeDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnTimeDateIcon,"TimeDateIcon");
		return this;
	}
	public SearchOrCreatePolicyPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public SearchOrCreatePolicyPage enterReported(WebDriver driver,String Reported) {
		BrowserActions.type(driver, inpReported,Reported, "Reported");
		return this;
	}
	public SearchOrCreatePolicyPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public SearchOrCreatePolicyPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public SearchOrCreatePolicyPage selectStatus_8(WebDriver driver,String Status_8)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus_8,Status_8,"Status_8");
		return this;
	}
	public SearchOrCreatePolicyPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public SearchOrCreatePolicyPage clickLossDetails_11(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails_11,"LossDetails_11");
		return this;
	}
	public SearchOrCreatePolicyPage clickServices(WebDriver driver)  {
		BrowserActions.click(driver, btnServices,"Services");
		return this;
	}
	public SearchOrCreatePolicyPage clickAutoFirstandFinal(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFirstandFinal,"AutoFirstandFinal");
		return this;
	}
	public SearchOrCreatePolicyPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public SearchOrCreatePolicyPage enterPolicy(WebDriver driver,String Policy) {
		BrowserActions.type(driver, inpPolicy,Policy,true,1,"Policy");
		return this;
	}
	public SearchOrCreatePolicyPage enterPolicy_2(WebDriver driver,String Policy_2) {
		BrowserActions.type(driver, inpPolicy_2,Policy_2, "Policy_2");
		return this;
	}
	public SearchOrCreatePolicyPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public SearchOrCreatePolicyPage clickSaveAssignClaim_12(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim_12,"SaveAssignClaim_12");
		return this;
	}
	public SearchOrCreatePolicyPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public SearchOrCreatePolicyPage enterOrganizationName(WebDriver driver,String OrganizationName) {
		BrowserActions.type(driver, inpOrganizationName,OrganizationName, "OrganizationName");
		return this;
	}
	public SearchOrCreatePolicyPage enterLossDate(WebDriver driver,String LossDate) {
		BrowserActions.type(driver, inpLossDate,LossDate,0.5, "LossDate");
		return this;
	}
	public SearchOrCreatePolicyPage selectPolicyType(WebDriver driver,String PolicyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,"PolicyType");
		return this;
	}
	public SearchOrCreatePolicyPage clickValiduntilDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
		return this;
	}
	public SearchOrCreatePolicyPage clickLossDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails,"LossDetails");
		return this;
	}
	public SearchOrCreatePolicyPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public SearchOrCreatePolicyPage clickIncludeArchivedPolicies(WebDriver driver)  {
		BrowserActions.click(driver, chkIncludeArchivedPolicies,"IncludeArchivedPolicies");
		return this;
	}
	public SearchOrCreatePolicyPage clickSelect(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,"Select");
		return this;
	}
	public SearchOrCreatePolicyPage clickLossDateDateIcon_7(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDateDateIcon_7,"LossDateDateIcon_7");
		return this;
	}
	public SearchOrCreatePolicyPage clickQuickClaimAuto(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimAuto,"QuickClaimAuto");
		return this;
	}
	public SearchOrCreatePolicyPage clickQuickTripCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickTripCancel,"QuickTripCancel");
		return this;
	}
	public SearchOrCreatePolicyPage enterAssignedto(WebDriver driver,String Assignedto) {
		BrowserActions.type(driver, inpAssignedto,Assignedto, "Assignedto");
		return this;
	}
	public SearchOrCreatePolicyPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public SearchOrCreatePolicyPage enterLastname(WebDriver driver,String Lastname) {
		BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
		return this;
	}
	public SearchOrCreatePolicyPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public SearchOrCreatePolicyPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public SearchOrCreatePolicyPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public SearchOrCreatePolicyPage enterZIPCode_5(WebDriver driver,String ZIPCode_5) {
		BrowserActions.type(driver, inpZIPCode_5,ZIPCode_5, "ZIPCode_5");
		return this;
	}
	public SearchOrCreatePolicyPage enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
		return this;
	}
	public SearchOrCreatePolicyPage clickLossDateDateIcon_10(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDateDateIcon_10,"LossDateDateIcon_10");
		return this;
	}
	public SearchOrCreatePolicyPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public SearchOrCreatePolicyPage enterTime(WebDriver driver,String Time) {
		BrowserActions.type(driver, inpTime,Time, "Time");
		return this;
	}
	public SearchOrCreatePolicyPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,true,"Type");
		return this;
	}
	public SearchOrCreatePolicyPage clickEffectiveDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon,"EffectiveDateIcon");
		return this;
	}
	public SearchOrCreatePolicyPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public SearchOrCreatePolicyPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
		return this;
	}
	public SearchOrCreatePolicyPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public SearchOrCreatePolicyPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public SearchOrCreatePolicyPage clickFindPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnFindPolicy,"FindPolicy");
		return this;
	}
	public SearchOrCreatePolicyPage clickDocuments_14(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments_14,"Documents_14");
		return this;
	}
	public SearchOrCreatePolicyPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public SearchOrCreatePolicyPage clickPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicy,"Policy");
		return this;
	}
	public SearchOrCreatePolicyPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public SearchOrCreatePolicyPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public SearchOrCreatePolicyPage clickSaveAssignClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim,"SaveAssignClaim");
		return this;
	}
	public SearchOrCreatePolicyPage enterVIN(WebDriver driver,String VIN) {
		BrowserActions.type(driver, inpVIN,VIN, "VIN");
		return this;
	}
	public SearchOrCreatePolicyPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public SearchOrCreatePolicyPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public SearchOrCreatePolicyPage enterSSNorTaxID(WebDriver driver,String SSNorTaxID) {
		BrowserActions.type(driver, inpSSNorTaxID,SSNorTaxID, "SSNorTaxID");
		return this;
	}
	public SearchOrCreatePolicyPage clickQuickClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaim,"QuickClaim");
		return this;
	}
	public SearchOrCreatePolicyPage clickScreenMode(WebDriver driver)  {
		BrowserActions.click(driver, rdbScreenMode,"ScreenMode");
		return this;
	}
	public SearchOrCreatePolicyPage enterInsured(WebDriver driver,String Insured) {
		BrowserActions.type(driver, inpInsured,Insured, "Insured");
		return this;
	}
	public SearchOrCreatePolicyPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public SearchOrCreatePolicyPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public SearchOrCreatePolicyPage clickFNOLMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnFNOLMenuActions,"FNOLMenuActions");
		return this;
	}
	public SearchOrCreatePolicyPage clickExpiresDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExpiresDateIcon,"ExpiresDateIcon");
		return this;
	}
	public SearchOrCreatePolicyPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public SearchOrCreatePolicyPage clickInvolvedVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnInvolvedVehicles,"InvolvedVehicles");
		return this;
	}
	public SearchOrCreatePolicyPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public SearchOrCreatePolicyPage clickPolicyDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyDetails,"PolicyDetails");
		return this;
	}
	public SearchOrCreatePolicyPage clickQuickClaimBaggage(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimBaggage,"QuickClaimBaggage");
		return this;
	}
	public SearchOrCreatePolicyPage clickUnselect(WebDriver driver)  {
		BrowserActions.click(driver, btnUnselect,"Unselect");
		return this;
	}
	public SearchOrCreatePolicyPage clickSaveClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveClaim,"SaveClaim");
		return this;
	}
	public SearchOrCreatePolicyPage clickQuickClaimProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimProperty,"QuickClaimProperty");
		return this;
	}
	public SearchOrCreatePolicyPage selectState_4(WebDriver driver,String State_4)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_4,State_4,"State_4");
		return this;
	}
	public SearchOrCreatePolicyPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public SearchOrCreatePolicyPage enterEffective(WebDriver driver,String Effective) {
		BrowserActions.type(driver, inpEffectiveDate,Effective, "Effective");
		return this;
	}
	public SearchOrCreatePolicyPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public SearchOrCreatePolicyPage clickPartiesInvolved_13(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved_13,"PartiesInvolved_13");
		return this;
	}
	public SearchOrCreatePolicyPage enterExpires(WebDriver driver,String Expires) {
		BrowserActions.type(driver, inpExpirationDate,Expires, "Expiratrion date");
		return this;
	}
	public SearchOrCreatePolicyPage enterLossDate_9(WebDriver driver,String LossDate_9) {
		BrowserActions.type(driver, inpLossDate_9,LossDate_9, "LossDate_9");
		return this;
	}
	public SearchOrCreatePolicyPage enterCity_3(WebDriver driver,String City_3) {
		BrowserActions.type(driver, inpCity_3,City_3, "City_3");
		return this;
	}
	public SearchOrCreatePolicyPage enterLossDate_6(WebDriver driver,String LossDate_6) {
		BrowserActions.type(driver, inpLossDate_6,LossDate_6, "LossDate_6");
		return this;
	}

	public SearchOrCreatePolicyPage clickCreateUnverifiedPolicy(WebDriver driver) {
		BrowserActions.click(driver, rdoCreateUnverifiedPolicy,true, "Create Unverified Policy Radio Button");
		return this;
	}

	public SearchOrCreatePolicyPage clickInsuredNameMenuIcon(WebDriver driver) {
		BrowserActions.click(driver, btnInsuredNameMenuIcon,true, "Insured name menu icon");
		return this;
	}
	
	public SearchOrCreatePolicyPage clickInsuredNewPerson(WebDriver driver) {
		BrowserActions.click(driver, btnInsuredNewPerson, "Insured new person");
		return this;
	}
	public String getInsuredName(WebDriver driver) {
		String insuredName = BrowserActions.getText(driver, lblInsured, "insured name ");
		return insuredName;
	}
}
