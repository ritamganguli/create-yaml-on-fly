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

public class AddClaimInformationPage extends LoadableComponent<AddClaimInformationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-CategorizationDV-Claim_Weather']", AI = false)
	private WebElement drpWeather;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AtTheSceneDV-Claim_Officials-EditableOfficialsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_3;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AtTheSceneDV-PoliceReportLV-MetroReportsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_5;


	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	private WebElement btnDocuments_9;


	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-Claim_LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "select[name$='LossCause']", AI = false)
	private WebElement drpLossCause;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name$='CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name$='Fault']", AI = false)
	private WebElement drpFaultRating;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicExposures>div[role='menuitem']", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved_8;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Services>div[role='menuitem']", AI = false)
	private WebElement btnServices;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAutoFirstAndFinal>div[role='menuitem']", AI = false)
	private WebElement btnAutoFirstandFinal;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-CategorizationDV-Claim_PermissionRequired']", AI = false)
	private WebElement drpSpecialClaimPermission;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-Claim_LossDate']", AI = false)
	private WebElement inpLossDate;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AtTheSceneDV-WitnessLV-EditableWitnessesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AtTheSceneDV-PoliceReportLV-MetroReportsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_4;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AtTheSceneDV-Claim_Officials-EditableOfficialsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicLossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails;

	@IFindBy(how = How.XPATH, using = "//div[text()='Add Property Damage']", AI = false)//div[id$='AddPropertyDamageButton']
	private WebElement btnAddPropertyDamage;//div[id$='InjuryAndFixedPropertyIncidentsPanelSet_tb'] div[id$='AddPropertyDamageButton']

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimAuto>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimAuto;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelTripCancelOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickTripCancel;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AddVehicleButton>div[role='button']", AI = false)
	private WebElement btnAddVehicle;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name$='InjurySeverity_IncidentReport']", AI = false)
	private WebElement chkIncidentOnly;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FindPolicy>div[role='menuitem']", AI = false)
	private WebElement btnFindPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup>div[role='menuitem']", AI = false)
	private WebElement btnPolicy;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicDocuments>div[role='menuitem']", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicAssign>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim;

	@IFindBy(how = How.CSS, using = "textarea[name$='LossDetailsAddressDV-Description'],textarea[name$='NewLossDetailsGeneralLiabilityDV-Description']", AI = false)
	private WebElement inpWhatHappened;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AtTheSceneDV-WitnessLV-EditableWitnessesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Notes>div[role='menuitem']", AI = false)
	private WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimGL>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim_7;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails_6;

	@IFindBy(how = How.CSS, using = "div[id=$'FNOLWizard-FNOLMenuActions']>div[role='button']", AI = false)
	private WebElement btnFNOLMenuActions;

	@IFindBy(how = How.CSS, using = "input[name$='AddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	private WebElement btnInvolvedVehicles;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyDetails>div[role='menuitem']", AI = false)
	private WebElement btnPolicyDetails;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimTravelBaggageOnly>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimBaggage;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicSummary>div[role='menuitem']", AI = false)
	private WebElement btnSaveClaim;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-QuickClaimPr>div[role='menuitem']", AI = false)
	private WebElement btnQuickClaimProperty;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-AddPedestrianButton>div[role='button']", AI = false)
	private WebElement btnAddPedestrian;
	
	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-CompensabilityDecision']", AI = false)
	private WebElement drpDecision;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-EmploymentData_PaidFullWages']", AI = false)
	private WebElement rdbFullPayforLastDayWorked;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-MedCase_HospitalMenuIcon>div[role='button']", AI = false)
	private WebElement btnMedCase_HospitalMenuIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PolicyWizardStepGroup-PolicyGeneral>div[role='menuitem']", AI = false)
	private WebElement btnPolicyGeneral;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessDate_dateIcon", AI = false)
	private WebElement btnDateofInjuryIllnessLossDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-Claim_InjuredOnRegularJob']", AI = false)
	private WebElement rdbPerformingRegularJob;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_HireState']", AI = false)
	private WebElement drpStateofHire;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicPartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Catastrophe_CatastropheNumber']", AI = false)
	private WebElement drpCatastrophe;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_6;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_TaxNumber']", AI = false)
	private WebElement inpSocialSecurity;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-ClassicMainContacts>div[role='menuitem']", AI = false)
	private WebElement btnOLDBasicInfo;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-PartiesInvolved>div[role='menuitem']", AI = false)
	private WebElement btnPartiesInvolved_31;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital']", AI = false)
	private WebElement drpHospital;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_14;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_MedicalDiagnosis']", AI = false)
	private WebElement inpDiagnosis;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_HospitalDate']", AI = false)
	private WebElement inpAdmittedDate;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_EmploymentStatus']", AI = false)
	private WebElement drpEmploymentStatus;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_ClassCodeByLocation']", AI = false)
	private WebElement rdbSelectClassCodebyLocation;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-BasicInfo>div[role='menuitem']", AI = false)
	private WebElement btnBasicInfo;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessCause']", AI = false)
	private WebElement drpCauseofInjurySource;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_ReportedDate_dateIcon", AI = false)
	private WebElement btnReportDateDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_InitialTreatment']", AI = false)
	private WebElement drpInitialTreatment;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Summary>div[role='menuitem']", AI = false)
	private WebElement btnSaveAssignClaim_30;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessDate']", AI = false)
	private WebElement inpDateofInjuryIllnessLossDate;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_TreatmentRend textarea", AI = false)
	private WebElement inpTreatmentRendered;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_InjuryStartDate']", AI = false)
	private WebElement inpDateShiftStarted;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_19;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_11;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-EmploymentData_WagePaymentContinued']", AI = false)
	private WebElement rdbSalaryContinued;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_DrugsInvolved']", AI = false)
	private WebElement drpDrugsInvolved;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_HospitalDate_dateIcon", AI = false)
	private WebElement btnAdmittedDateDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_4;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-DateReportedtoEmployer']", AI = false)
	private WebElement inpDateEmployerNotified;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_SupervisorPicker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_22;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-MedCase_FirstIntakeDoctorMenuIcon>div[role='button']", AI = false)
	private WebElement btnMedCase_FirstIntakeDoctorMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-CompensabilityDecisionDate']", AI = false)
	private WebElement inpDecisionDate;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-DateReportedtoEmployer_dateIcon", AI = false)
	private WebElement btnDateEmployerNotifiedDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_AccidentPremises']", AI = false)
	private WebElement drpAccidentPremises;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_SupervisorPicker']", AI = false)
	private WebElement drpSupervisor;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_Occupation']", AI = false)
	private WebElement inpOccupation;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_JurisdictionState']", AI = false)
	private WebElement drpStateofJurisdiction;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-DetailedBodyPartDescription']", AI = false)
	private WebElement drpBodyPartDescription;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_ClassCode']", AI = false)
	private WebElement drpEmploymentClassCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_15;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_17;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PermamentImpairmentPercentage']", AI = false)
	private WebElement inpPPDPercentage;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_AccidentType']", AI = false)
	private WebElement drpDetailedCauseSource;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-DetailedBodyPartSide']", AI = false)
	private WebElement drpSide;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-LossDetails>div[role='menuitem']", AI = false)
	private WebElement btnLossDetails_29;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_3;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_5;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_2;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV_tb-MakeFirstButton>div[role='button']", AI = false)
	private WebElement btnMakeFirst;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_EmploymentInjury']", AI = false)
	private WebElement rdbInjuryDuringEmployment;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_9;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_InjuryStartTime_dateIcon", AI = false)
	private WebElement btnTimeShiftStartedDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_TimeLossReport']", AI = false)
	private WebElement rdbLosttimefromwork;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_DateOfBirth_dateIcon", AI = false)
	private WebElement btnDateofBirthDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_ActivityPerformed']", AI = false)
	private WebElement inpClaim_ActivityPerformed;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Injury_CardTab", AI = false)
	private WebElement btnInjury;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_PrimaryInjury']", AI = false)
	private WebElement drpPrimaryInjuryType;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-Documents>div[role='menuitem']", AI = false)
	private WebElement btnDocuments_32;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_HireDate_dateIcon", AI = false)
	private WebElement btnDateofHireDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_13;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_MedicalReport']", AI = false)
	private WebElement rdbMedicalattentionrequired;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_EquipmentUsed']", AI = false)
	private WebElement inpEquipmentUsed;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-EmploymentData_PayPeriod']", AI = false)
	private WebElement drpPayPeriod;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-Claim_ModifiedDutyAvailable']", AI = false)
	private WebElement rdbModifiedDutyAvailable;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-SelectRiskUnitsStep>div[role='menuitem']", AI = false)
	private WebElement btnSelectRiskUnitsStep;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Picker-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-DetailedBodyPart']", AI = false)
	private WebElement drpBodyPart;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_7;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_CardTab", AI = false)
	private WebElement btnLostTime;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_ReportedDate']", AI = false)
	private WebElement inpReportDate;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_DetailedInjury']", AI = false)
	private WebElement drpDetailedInjuryType;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_Severity']", AI = false)
	private WebElement drpSeverity;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_HospitalDays']", AI = false)
	private WebElement inpEstimatedDays;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_DeathReport']", AI = false)
	private WebElement rdbInjuryIllnessResultinDeath;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_SafetyEquipmentProvided']", AI = false)
	private WebElement rdbSafetyEquipmentProvided;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Address']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_ExaminationDate_dateIcon", AI = false)
	private WebElement btnExaminationDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-EmploymentData_NumHoursWorkedPerDay']", AI = false)
	private WebElement inpHoursWorkedperDay;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor']", AI = false)
	private WebElement drpDoctor;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_InjuryStartDate_dateIcon", AI = false)
	private WebElement btnDateShiftStartedDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_CardTab", AI = false)
	private WebElement btnEmploymentData;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_HireDate']", AI = false)
	private WebElement inpDateofHire;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Officials_CardTab", AI = false)
	private WebElement btnOfficials;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_18;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_EmploymentLocation']", AI = false)
	private WebElement inpEmploymentLocation;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_MedicalTreatment']", AI = false)
	private WebElement drpTreatmentType;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Picker']", AI = false)
	private WebElement drpName;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_MaritalStatus']", AI = false)
	private WebElement drpMaritalStatus;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_OccurrenceDescription textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PrimaryBodyPart']", AI = false)
	private WebElement drpAreaofBody;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_SupervisorPicker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_21;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_SupervisorPicker-EmploymentData_SupervisorPickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnEmploymentData_SupervisorPickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_10;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Gender']", AI = false)
	private WebElement drpGender;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Picker-Claimant_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnClaimant_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_16;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_SafetyEquipmentUsed']", AI = false)
	private WebElement rdbSafetyEquipmentUsed;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_SupervisorPicker-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_20;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_ExaminationDate']", AI = false)
	private WebElement inpExaminationDate;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_Phone']", AI = false)
	private WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "select[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-Claim_ConcurrentEmployment']", AI = false)
	private WebElement drpConcurrentJobs;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-CompensabilityComments']", AI = false)
	private WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_12;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-TimeLoss_InputSet-EmploymentData_NumDaysWorkedPerWeek']", AI = false)
	private WebElement inpDaysWorkedperWeek;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claimant_DateOfBirth']", AI = false)
	private WebElement inpDateofBirth;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-Ordering']", AI = false)
	private WebElement inpOrder;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableOfficialsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_23;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_8;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_ConcurrentEmploymentLV-EditableConcurrentEmploymentLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_27;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_DepartmentCode']", AI = false)
	private WebElement inpDepartmentCode;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableWorkStatusChangesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_25;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-MedicalReport_InputSet-MedCase_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-CompensabilityDecisionDate_dateIcon", AI = false)
	private WebElement btnDecisionDateDateIcon;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableWorkStatusChangesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_26;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableOfficialsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_24;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryDescription']", AI = false)
	private WebElement inpInjuryDescription;

	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_ConcurrentEmploymentLV-EditableConcurrentEmploymentLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_28;

	@IFindBy(how = How.CSS, using = "input[name='FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EmploymentData_InjuryStartTime']", AI = false)
	private WebElement inpTimeShiftStarted;
	
	@IFindBy(how = How.CSS, using = "input[id$='DeathReport_0']", AI = false)
	public WebElement rdbInjuryResultsInDeathYes;
	
	@IFindBy(how = How.CSS, using = "input[id$='DeathReport_0']", AI = false)
	public WebElement rdbInjuryResultsInDeathNo;
	
	@IFindBy(how = How.CSS, using = "input[id$='MedicalReport_1']", AI = false)
	public WebElement rdbMedicalAttentionNo;
	
	@IFindBy(how = How.CSS, using = "input[id$='MedicalReport_0']", AI = false)
	public WebElement rdbMedicalAttentionYes;
	
	@IFindBy(how = How.CSS, using = "input[id$='TimeLossReport_0']", AI = false)
	public WebElement rdbLostTimeWorkYes;
	
	@IFindBy(how = How.CSS, using = "input[id$='TimeLossReport_1']", AI = false)
	public WebElement rdbLostTimeWorkNo;
	
	@IFindBy(how = How.CSS, using = "input[id$='InjurySeverity_DeathReport_0']", AI = false)
	public WebElement rdbInjuryIllnessresultInDeathYes;
	
	@IFindBy(how = How.CSS, using = "input[id$='InjurySeverity_DeathReport_1']", AI = false)
	public WebElement rdbInjuryIllnessresultInDeathNo;
	
	@IFindBy(how = How.CSS, using = "div[id$='PrimaryLocationChoice_Choice_radio']", AI = false)
	public WebElement rdbPrimaryLocation;
	
	@IFindBy(how = How.CSS, using = "#FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-IncidentPanelRef-InjuryAndFixedPropertyIncidentsPanelSet_tb-AddInjuryButton", AI = false)
	public WebElement btnAddInjury;
	
	public AddClaimInformationPage(){
	}

	public AddClaimInformationPage(WebDriver driver){
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
	}public AddClaimInformationPage selectWeather(WebDriver driver,String Weather)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWeather,Weather,"Weather");
		return this;
	}
	public AddClaimInformationPage clickPolicyGeneral(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyGeneral,"PolicyGeneral");
		return this;
	}
	public AddClaimInformationPage clickPartiesInvolved(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved,"PartiesInvolved");
		return this;
	}
	public AddClaimInformationPage clickRemove_3(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_3,"Remove_3");
		return this;
	}
	public AddClaimInformationPage clickRemove_5(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_5,"Remove_5");
		return this;
	}
	public AddClaimInformationPage selectCatastrophe(WebDriver driver,String Catastrophe)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCatastrophe,Catastrophe,"Catastrophe");
		return this;
	}
	public AddClaimInformationPage clickOLDBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnOLDBasicInfo,"OLDBasicInfo");
		return this;
	}
	public AddClaimInformationPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public AddClaimInformationPage clickDocuments_9(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments_9,"Documents_9");
		return this;
	}
	public AddClaimInformationPage selectLocation(WebDriver driver)  {
		BrowserActions.selectDropDownByIndex(driver, drpLocation, 1, true,"location");
		return this;
	}
	public AddClaimInformationPage clickBasicInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnBasicInfo,"BasicInfo");
		return this;
	}
	public AddClaimInformationPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public AddClaimInformationPage clickLossDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDateDateIcon,"LossDateDateIcon");
		return this;
	}
	public AddClaimInformationPage enterValiduntil(WebDriver driver,String Validuntil) {
		BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
		return this;
	}
	public AddClaimInformationPage selectLossCause(WebDriver driver,String LossCause)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossCause,LossCause,true,"LossCause");
		return this;
	}
	public AddClaimInformationPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public AddClaimInformationPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,true,"State");
		return this;
	}
	public AddClaimInformationPage selectFaultRating(WebDriver driver,String FaultRating)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFaultRating,FaultRating,true,"FaultRating");
		return this;
	}
	public AddClaimInformationPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public AddClaimInformationPage clickPartiesInvolved_8(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved_8,"PartiesInvolved_8");
		return this;
	}
	public AddClaimInformationPage clickServices(WebDriver driver)  {
		BrowserActions.click(driver, btnServices,"Services");
		return this;
	}
	public AddClaimInformationPage clickAutoFirstandFinal(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFirstandFinal,"AutoFirstandFinal");
		return this;
	}
	public AddClaimInformationPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public AddClaimInformationPage selectSpecialClaimPermission(WebDriver driver,String SpecialClaimPermission)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSpecialClaimPermission,SpecialClaimPermission,"SpecialClaimPermission");
		return this;
	}
	public AddClaimInformationPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public AddClaimInformationPage enterLossDate(WebDriver driver,String LossDate) {
		BrowserActions.type(driver, inpLossDate,LossDate, "LossDate");
		return this;
	}
	public AddClaimInformationPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public AddClaimInformationPage clickAdd_4(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_4,"Add_4");
		return this;
	}
	public AddClaimInformationPage clickAdd_2(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_2,"Add_2");
		return this;
	}
	public AddClaimInformationPage clickValiduntilDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
		return this;
	}
	public AddClaimInformationPage clickLossDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails,"LossDetails");
		return this;
	}
	public AddClaimInformationPage clickAddPropertyDamage(WebDriver driver)  {
		BrowserActions.click(driver, btnAddPropertyDamage,0.5,"AddPropertyDamage");
		return this;
	}
	public AddClaimInformationPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public AddClaimInformationPage clickQuickClaimAuto(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimAuto,"QuickClaimAuto");
		return this;
	}
	public AddClaimInformationPage clickQuickTripCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickTripCancel,"QuickTripCancel");
		return this;
	}
	public AddClaimInformationPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public AddClaimInformationPage clickAddVehicle(WebDriver driver)  {
		BrowserActions.click(driver, btnAddVehicle,"AddVehicle");
		return this;
	}
	public AddClaimInformationPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public AddClaimInformationPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public AddClaimInformationPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public AddClaimInformationPage enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
		return this;
	}
	public AddClaimInformationPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,1,"Next");
		return this;
	}
	public AddClaimInformationPage clickIncidentOnly(WebDriver driver)  {
		BrowserActions.click(driver, chkIncidentOnly,"IncidentOnly");
		return this;
	}
	public AddClaimInformationPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public AddClaimInformationPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
		return this;
	}
	public AddClaimInformationPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public AddClaimInformationPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public AddClaimInformationPage clickFindPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnFindPolicy,"FindPolicy");
		return this;
	}
	public AddClaimInformationPage clickPolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicy,"Policy");
		return this;
	}
	public AddClaimInformationPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public AddClaimInformationPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public AddClaimInformationPage clickSaveAssignClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim,"SaveAssignClaim");
		return this;
	}
	public AddClaimInformationPage enterWhatHappened(WebDriver driver,String WhatHappened) {
		BrowserActions.type(driver, inpWhatHappened,WhatHappened, "WhatHappened");
		return this;
	}
	public AddClaimInformationPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public AddClaimInformationPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public AddClaimInformationPage clickQuickClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaim,"QuickClaim");
		return this;
	}
	public AddClaimInformationPage clickSaveAssignClaim_7(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim_7,"SaveAssignClaim_7");
		return this;
	}
	public AddClaimInformationPage clickLossDetails_6(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails_6,"LossDetails_6");
		return this;
	}
	public AddClaimInformationPage clickFNOLMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnFNOLMenuActions,"FNOLMenuActions");
		return this;
	}
	public AddClaimInformationPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City,true, "City");
		return this;
	}
	public AddClaimInformationPage clickInvolvedVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnInvolvedVehicles,"InvolvedVehicles");
		return this;
	}
	public AddClaimInformationPage clickPolicyDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyDetails,"PolicyDetails");
		return this;
	}
	public AddClaimInformationPage clickQuickClaimBaggage(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimBaggage,"QuickClaimBaggage");
		return this;
	}
	public AddClaimInformationPage clickSaveClaim(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveClaim,"SaveClaim");
		return this;
	}
	public AddClaimInformationPage clickQuickClaimProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnQuickClaimProperty,"QuickClaimProperty");
		return this;
	}
	public AddClaimInformationPage clickAddPedestrian(WebDriver driver)  {
		BrowserActions.click(driver, btnAddPedestrian,"AddPedestrian");
		return this;
	}
	public AddClaimInformationPage selectDecision(WebDriver driver,String Decision)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDecision,Decision,"Decision");
	    return this;
}
public AddClaimInformationPage clickFullPayforLastDayWorked(WebDriver driver)  {
		BrowserActions.click(driver, rdbFullPayforLastDayWorked,"FullPayforLastDayWorked");
	    return this;
}
public AddClaimInformationPage clickMedCase_HospitalMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnMedCase_HospitalMenuIcon,"MedCase_HospitalMenuIcon");
	    return this;
}
public AddClaimInformationPage clickDateofInjuryIllnessLossDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateofInjuryIllnessLossDateDateIcon,"DateofInjuryIllnessLossDateDateIcon");
	    return this;
}
public AddClaimInformationPage clickPerformingRegularJob(WebDriver driver)  {
		BrowserActions.click(driver, rdbPerformingRegularJob,"PerformingRegularJob");
	    return this;
}
public AddClaimInformationPage selectStateofHire(WebDriver driver,String StateofHire)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStateofHire,StateofHire,"StateofHire");
	    return this;
}
public AddClaimInformationPage clickAdjudicator(WebDriver driver)  {
		BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
	    return this;
}
public AddClaimInformationPage clickNewVendor_6(WebDriver driver)  {
		BrowserActions.click(driver, btnNewVendor_6,"NewVendor_6");
	    return this;
}
public AddClaimInformationPage enterSocialSecurity(WebDriver driver,String SocialSecurity) {
        BrowserActions.type(driver, inpSocialSecurity,SocialSecurity, "SocialSecurity");
        return this;
}
public AddClaimInformationPage clickPartiesInvolved_31(WebDriver driver)  {
		BrowserActions.click(driver, btnPartiesInvolved_31,"PartiesInvolved_31");
	    return this;
}
public AddClaimInformationPage selectHospital(WebDriver driver,String Hospital)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHospital,Hospital,"Hospital");
	    return this;
}
public AddClaimInformationPage clickAdjudicator_14(WebDriver driver)  {
		BrowserActions.click(driver, btnAdjudicator_14,"Adjudicator_14");
	    return this;
}
public AddClaimInformationPage enterDiagnosis(WebDriver driver,String Diagnosis) {
        BrowserActions.type(driver, inpDiagnosis,Diagnosis, "Diagnosis");
        return this;
}
public AddClaimInformationPage enterAdmittedDate(WebDriver driver,String AdmittedDate) {
        BrowserActions.type(driver, inpAdmittedDate,AdmittedDate, "AdmittedDate");
        return this;
}
public AddClaimInformationPage selectEmploymentStatus(WebDriver driver,String EmploymentStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEmploymentStatus,EmploymentStatus,"EmploymentStatus");
	    return this;
}
public AddClaimInformationPage clickSelectClassCodebyLocation(WebDriver driver)  {
		BrowserActions.click(driver, rdbSelectClassCodebyLocation,"SelectClassCodebyLocation");
	    return this;
}
public AddClaimInformationPage selectCauseofInjurySource(WebDriver driver,String CauseofInjurySource)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCauseofInjurySource,CauseofInjurySource,2,"CauseofInjurySource");
	    return this;
}
public AddClaimInformationPage clickReportDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnReportDateDateIcon,"ReportDateDateIcon");
	    return this;
}
public AddClaimInformationPage clickNewLegal(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLegal,"NewLegal");
	    return this;
}
public AddClaimInformationPage selectInitialTreatment(WebDriver driver,String InitialTreatment)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpInitialTreatment,InitialTreatment,"InitialTreatment");
	    return this;
}
public AddClaimInformationPage clickSaveAssignClaim_30(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveAssignClaim_30,"SaveAssignClaim_30");
	    return this;
}
public AddClaimInformationPage enterDateofInjuryIllnessLossDate(WebDriver driver,String DateofInjuryIllnessLossDate) {
        BrowserActions.type(driver, inpDateofInjuryIllnessLossDate,DateofInjuryIllnessLossDate, "DateofInjuryIllnessLossDate");
        return this;
}
public AddClaimInformationPage enterTreatmentRendered(WebDriver driver,String TreatmentRendered) {
        BrowserActions.type(driver, inpTreatmentRendered,TreatmentRendered, "TreatmentRendered");
        return this;
}
public AddClaimInformationPage enterDateShiftStarted(WebDriver driver,String DateShiftStarted) {
        BrowserActions.type(driver, inpDateShiftStarted,DateShiftStarted, "DateShiftStarted");
        return this;
}
public AddClaimInformationPage clickViewContactDetails_19(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails_19,"ViewContactDetails_19");
	    return this;
}
public AddClaimInformationPage clickVendorCompany_11(WebDriver driver)  {
		BrowserActions.click(driver, btnVendorCompany_11,"VendorCompany_11");
	    return this;
}
public AddClaimInformationPage clickSalaryContinued(WebDriver driver)  {
		BrowserActions.click(driver, rdbSalaryContinued,"SalaryContinued");
	    return this;
}
public AddClaimInformationPage selectDrugsInvolved(WebDriver driver,String DrugsInvolved)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDrugsInvolved,DrugsInvolved,"DrugsInvolved");
	    return this;
}
public AddClaimInformationPage clickAdmittedDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAdmittedDateDateIcon,"AdmittedDateDateIcon");
	    return this;
}
public AddClaimInformationPage clickViewContactDetails_4(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails_4,"ViewContactDetails_4");
	    return this;
}
public AddClaimInformationPage enterDateEmployerNotified(WebDriver driver,String DateEmployerNotified) {
        BrowserActions.type(driver, inpDateEmployerNotified,DateEmployerNotified,1, "DateEmployerNotified");
        return this;
}
public AddClaimInformationPage clickViewContactDetails_22(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails_22,"ViewContactDetails_22");
	    return this;
}
public AddClaimInformationPage clickMedCase_FirstIntakeDoctorMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnMedCase_FirstIntakeDoctorMenuIcon,"MedCase_FirstIntakeDoctorMenuIcon");
	    return this;
}
public AddClaimInformationPage enterDecisionDate(WebDriver driver,String DecisionDate) {
        BrowserActions.type(driver, inpDecisionDate,DecisionDate, "DecisionDate");
        return this;
}
public AddClaimInformationPage clickDateEmployerNotifiedDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateEmployerNotifiedDateIcon,"DateEmployerNotifiedDateIcon");
	    return this;
}
public AddClaimInformationPage selectAccidentPremises(WebDriver driver,String AccidentPremises)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAccidentPremises,AccidentPremises,"AccidentPremises");
	    return this;
}
public AddClaimInformationPage selectSupervisor(WebDriver driver,String Supervisor)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSupervisor,Supervisor,"Supervisor");
	    return this;
}
public AddClaimInformationPage enterOccupation(WebDriver driver,String Occupation) {
        BrowserActions.type(driver, inpOccupation,Occupation, "Occupation");
        return this;
}
public AddClaimInformationPage selectStateofJurisdiction(WebDriver driver,String StateofJurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStateofJurisdiction,StateofJurisdiction,"StateofJurisdiction");
	    return this;
}
public AddClaimInformationPage selectBodyPartDescription(WebDriver driver,String BodyPartDescription)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBodyPartDescription,BodyPartDescription,"BodyPartDescription");
	    return this;
}
public AddClaimInformationPage selectEmploymentClassCode(WebDriver driver,String EmploymentClassCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEmploymentClassCode,EmploymentClassCode,"EmploymentClassCode");
	    return this;
}
public AddClaimInformationPage clickAttorney_15(WebDriver driver)  {
		BrowserActions.click(driver, btnAttorney_15,"Attorney_15");
	    return this;
}
public AddClaimInformationPage clickAutoTowingAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
	    return this;
}
public AddClaimInformationPage clickLegalVenue_17(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalVenue_17,"LegalVenue_17");
	    return this;
}
public AddClaimInformationPage enterPPDPercentage(WebDriver driver,String PPDPercentage) {
        BrowserActions.type(driver, inpPPDPercentage,PPDPercentage, "PPDPercentage");
        return this;
}
public AddClaimInformationPage selectDetailedCauseSource(WebDriver driver,String DetailedCauseSource)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDetailedCauseSource,DetailedCauseSource,"DetailedCauseSource");
	    return this;
}
public AddClaimInformationPage selectSide(WebDriver driver,String Side)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSide,Side,"Side");
	    return this;
}
public AddClaimInformationPage clickLossDetails_29(WebDriver driver)  {
		BrowserActions.click(driver, btnLossDetails_29,"LossDetails_29");
	    return this;
}
public AddClaimInformationPage clickSearch_3(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_3,"Search_3");
	    return this;
}
public AddClaimInformationPage clickNewPerson_5(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson_5,"NewPerson_5");
	    return this;
}
public AddClaimInformationPage clickNewPerson_2(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson_2,"NewPerson_2");
	    return this;
}
public AddClaimInformationPage clickMakeFirst(WebDriver driver)  {
		BrowserActions.click(driver, btnMakeFirst,"MakeFirst");
	    return this;
}
public AddClaimInformationPage clickInjuryDuringEmployment(WebDriver driver)  {
		BrowserActions.click(driver, rdbInjuryDuringEmployment,"InjuryDuringEmployment");
	    return this;
}
public AddClaimInformationPage clickDoctor_9(WebDriver driver)  {
		BrowserActions.click(driver, btnDoctor_9,"Doctor_9");
	    return this;
}
public AddClaimInformationPage clickTimeShiftStartedDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnTimeShiftStartedDateIcon,"TimeShiftStartedDateIcon");
	    return this;
}
public AddClaimInformationPage clickLosttimefromwork(WebDriver driver)  {
		BrowserActions.click(driver, rdbLosttimefromwork,"Losttimefromwork");
	    return this;
}
public AddClaimInformationPage clickDateofBirthDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateofBirthDateIcon,"DateofBirthDateIcon");
	    return this;
}
public AddClaimInformationPage enterClaim_ActivityPerformed(WebDriver driver,String Claim_ActivityPerformed) {
        BrowserActions.type(driver, inpClaim_ActivityPerformed,Claim_ActivityPerformed, "Claim_ActivityPerformed");
        return this;
}
public AddClaimInformationPage clickInjury(WebDriver driver)  {
		BrowserActions.click(driver, btnInjury,"Injury");
	    return this;
}
public AddClaimInformationPage selectPrimaryInjuryType(WebDriver driver,String PrimaryInjuryType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryInjuryType,PrimaryInjuryType,"PrimaryInjuryType");
	    return this;
}
public AddClaimInformationPage clickDocuments_32(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments_32,"Documents_32");
	    return this;
}
public AddClaimInformationPage clickDateofHireDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateofHireDateIcon,"DateofHireDateIcon");
	    return this;
}
public AddClaimInformationPage clickNewLegal_13(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLegal_13,"NewLegal_13");
	    return this;
}
public AddClaimInformationPage clickMedicalattentionrequired(WebDriver driver)  {
		BrowserActions.click(driver, rdbMedicalattentionrequired,"Medicalattentionrequired");
	    return this;
}
public AddClaimInformationPage enterEquipmentUsed(WebDriver driver,String EquipmentUsed) {
        BrowserActions.type(driver, inpEquipmentUsed,EquipmentUsed, "EquipmentUsed");
        return this;
}
public AddClaimInformationPage clickContactProhibited(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited,"ContactProhibited");
	    return this;
}
public AddClaimInformationPage selectPayPeriod(WebDriver driver,String PayPeriod)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPayPeriod,PayPeriod,"PayPeriod");
	    return this;
}
public AddClaimInformationPage clickModifiedDutyAvailable(WebDriver driver)  {
		BrowserActions.click(driver, rdbModifiedDutyAvailable,"ModifiedDutyAvailable");
	    return this;
}
public AddClaimInformationPage clickSelectRiskUnitsStep(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectRiskUnitsStep,"SelectRiskUnitsStep");
	    return this;
}
public AddClaimInformationPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
	    return this;
}
public AddClaimInformationPage selectBodyPart(WebDriver driver,String BodyPart)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBodyPart,BodyPart,"BodyPart");
	    return this;
}
public AddClaimInformationPage clickAutobodyRepairShop_7(WebDriver driver)  {
		BrowserActions.click(driver, btnAutobodyRepairShop_7,"AutobodyRepairShop_7");
	    return this;
}
public AddClaimInformationPage clickLostTime(WebDriver driver)  {
		BrowserActions.click(driver, btnLostTime,"LostTime");
	    return this;
}
public AddClaimInformationPage enterReportDate(WebDriver driver,String ReportDate) {
        BrowserActions.type(driver, inpReportDate,ReportDate, "ReportDate");
        return this;
}
public AddClaimInformationPage clickAutobodyRepairShop(WebDriver driver)  {
		BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
	    return this;
}
public AddClaimInformationPage selectDetailedInjuryType(WebDriver driver,String DetailedInjuryType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDetailedInjuryType,DetailedInjuryType,"DetailedInjuryType");
	    return this;
}
public AddClaimInformationPage selectSeverity(WebDriver driver,String Severity)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSeverity,Severity,"Severity");
	    return this;
}
public AddClaimInformationPage enterEstimatedDays(WebDriver driver,String EstimatedDays) {
        BrowserActions.type(driver, inpEstimatedDays,EstimatedDays, "EstimatedDays");
        return this;
}
public AddClaimInformationPage clickInjuryIllnessResultinDeath(WebDriver driver)  {
		BrowserActions.click(driver, rdbInjuryIllnessResultinDeath,"InjuryIllnessResultinDeath");
	    return this;
}
public AddClaimInformationPage clickSafetyEquipmentProvided(WebDriver driver)  {
		BrowserActions.click(driver, rdbSafetyEquipmentProvided,"SafetyEquipmentProvided");
	    return this;
}
public AddClaimInformationPage enterAddress(WebDriver driver,String Address) {
        BrowserActions.type(driver, inpAddress,Address, "Address");
        return this;
}
public AddClaimInformationPage clickExaminationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExaminationDateDateIcon,"ExaminationDateDateIcon");
	    return this;
}
public AddClaimInformationPage enterHoursWorkedperDay(WebDriver driver,String HoursWorkedperDay) {
        BrowserActions.type(driver, inpHoursWorkedperDay,HoursWorkedperDay, "HoursWorkedperDay");
        return this;
}
public AddClaimInformationPage clickNewVendor(WebDriver driver)  {
		BrowserActions.click(driver, btnNewVendor,"NewVendor");
	    return this;
}
public AddClaimInformationPage clickVendorCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
	    return this;
}
public AddClaimInformationPage clickLawFirm(WebDriver driver)  {
		BrowserActions.click(driver, btnLawFirm,"LawFirm");
	    return this;
}
public AddClaimInformationPage selectDoctor(WebDriver driver,String Doctor)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDoctor,Doctor,"Doctor");
	    return this;
}
public AddClaimInformationPage clickDateShiftStartedDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateShiftStartedDateIcon,"DateShiftStartedDateIcon");
	    return this;
}
public AddClaimInformationPage clickLegalVenue(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
	    return this;
}
public AddClaimInformationPage clickEmploymentData(WebDriver driver)  {
		BrowserActions.click(driver, btnEmploymentData,"EmploymentData");
	    return this;
}
public AddClaimInformationPage enterDateofHire(WebDriver driver,String DateofHire) {
        BrowserActions.type(driver, inpDateofHire,DateofHire, "DateofHire");
        return this;
}
public AddClaimInformationPage clickOfficials(WebDriver driver)  {
		BrowserActions.click(driver, btnOfficials,"Officials");
	    return this;
}
public AddClaimInformationPage clickSearch_18(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_18,"Search_18");
	    return this;
}
public AddClaimInformationPage enterEmploymentLocation(WebDriver driver,String EmploymentLocation) {
        BrowserActions.type(driver, inpEmploymentLocation,EmploymentLocation, "EmploymentLocation");
        return this;
}
public AddClaimInformationPage selectTreatmentType(WebDriver driver,String TreatmentType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTreatmentType,TreatmentType,"TreatmentType");
	    return this;
}
public AddClaimInformationPage selectName(WebDriver driver,String Name)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,"Name");
	    return this;
}
public AddClaimInformationPage selectMaritalStatus(WebDriver driver,String MaritalStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMaritalStatus,MaritalStatus,"MaritalStatus");
	    return this;
}
public AddClaimInformationPage enterDescription(WebDriver driver,String Description) {
        BrowserActions.type(driver, inpDescription,Description, "Description");
        return this;
}
public AddClaimInformationPage selectAreaofBody(WebDriver driver,String AreaofBody)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAreaofBody,AreaofBody,"AreaofBody");
	    return this;
}
public AddClaimInformationPage clickSearch_21(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_21,"Search_21");
	    return this;
}
public AddClaimInformationPage clickEmploymentData_SupervisorPickerMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEmploymentData_SupervisorPickerMenuIcon,"EmploymentData_SupervisorPickerMenuIcon");
	    return this;
}
public AddClaimInformationPage clickMedicalCareOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
	    return this;
}
public AddClaimInformationPage clickMedicalCareOrganization_10(WebDriver driver)  {
		BrowserActions.click(driver, btnMedicalCareOrganization_10,"MedicalCareOrganization_10");
	    return this;
}
public AddClaimInformationPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
	    return this;
}
public AddClaimInformationPage clickAttorney(WebDriver driver)  {
		BrowserActions.click(driver, btnAttorney,"Attorney");
	    return this;
}
public AddClaimInformationPage selectGender(WebDriver driver,String Gender)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGender,Gender,"Gender");
	    return this;
}
public AddClaimInformationPage clickClaimant_PickerMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimant_PickerMenuIcon,"Claimant_PickerMenuIcon");
	    return this;
}
public AddClaimInformationPage clickLawFirm_16(WebDriver driver)  {
		BrowserActions.click(driver, btnLawFirm_16,"LawFirm_16");
	    return this;
}
public AddClaimInformationPage clickSafetyEquipmentUsed(WebDriver driver)  {
		BrowserActions.click(driver, rdbSafetyEquipmentUsed,"SafetyEquipmentUsed");
	    return this;
}
public AddClaimInformationPage clickNewPerson_20(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson_20,"NewPerson_20");
	    return this;
}
public AddClaimInformationPage enterExaminationDate(WebDriver driver,String ExaminationDate) {
        BrowserActions.type(driver, inpExaminationDate,ExaminationDate, "ExaminationDate");
        return this;
}
public AddClaimInformationPage enterPhone(WebDriver driver,String Phone) {
        BrowserActions.type(driver, inpPhone,Phone, "Phone");
        return this;
}
public AddClaimInformationPage selectConcurrentJobs(WebDriver driver,String ConcurrentJobs)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpConcurrentJobs,ConcurrentJobs,"ConcurrentJobs");
	    return this;
}
public AddClaimInformationPage enterComments(WebDriver driver,String Comments) {
        BrowserActions.type(driver, inpComments,Comments, "Comments");
        return this;
}
public AddClaimInformationPage clickNewCompany_12(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany_12,"NewCompany_12");
	    return this;
}
public AddClaimInformationPage enterDaysWorkedperWeek(WebDriver driver,String DaysWorkedperWeek) {
        BrowserActions.type(driver, inpDaysWorkedperWeek,DaysWorkedperWeek, "DaysWorkedperWeek");
        return this;
}
public AddClaimInformationPage enterDateofBirth(WebDriver driver,String DateofBirth) {
        BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
        return this;
}
public AddClaimInformationPage enterOrder(WebDriver driver,String Order) {
        BrowserActions.type(driver, inpOrder,Order, "Order");
        return this;
}
public AddClaimInformationPage clickAdd_23(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_23,"Add_23");
	    return this;
}
public AddClaimInformationPage clickAutoTowingAgency_8(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoTowingAgency_8,"AutoTowingAgency_8");
	    return this;
}
public AddClaimInformationPage clickAdd_27(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_27,"Add_27");
	    return this;
}
public AddClaimInformationPage enterDepartmentCode(WebDriver driver,String DepartmentCode) {
        BrowserActions.type(driver, inpDepartmentCode,DepartmentCode, "DepartmentCode");
        return this;
}
public AddClaimInformationPage clickAdd_25(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_25,"Add_25");
	    return this;
}
public AddClaimInformationPage clickNewCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany,"NewCompany");
	    return this;
}
public AddClaimInformationPage clickDoctor(WebDriver driver)  {
		BrowserActions.click(driver, btnDoctor,"Doctor");
	    return this;
}
public AddClaimInformationPage clickDecisionDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDecisionDateDateIcon,"DecisionDateDateIcon");
	    return this;
}
public AddClaimInformationPage clickRemove_26(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_26,"Remove_26");
	    return this;
}
public AddClaimInformationPage clickRemove_24(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_24,"Remove_24");
	    return this;
}
public AddClaimInformationPage enterInjuryDescription(WebDriver driver,String InjuryDescription) {
        BrowserActions.type(driver, inpInjuryDescription,InjuryDescription,1,"InjuryDescription");
        return this;
}
public AddClaimInformationPage clickRemove_28(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_28,"Remove_28");
	    return this;
}
public AddClaimInformationPage enterTimeShiftStarted(WebDriver driver,String TimeShiftStarted) {
        BrowserActions.type(driver, inpTimeShiftStarted,TimeShiftStarted, "TimeShiftStarted");
        return this;
}
public AddClaimInformationPage clickNoRadioButton(WebDriver driver) {
	BrowserActions.click(driver, rdbInjuryResultsInDeathNo,"Death No");
	return this;
}
public AddClaimInformationPage clickYesRadioButton(WebDriver driver) {
	BrowserActions.click(driver, rdbInjuryResultsInDeathYes,"Death Yes");
	return this;
}
public AddClaimInformationPage clickNoMedicalAttention(WebDriver driver) {
	BrowserActions.click(driver, rdbMedicalAttentionNo,2,"Medical attention No");
	return this;
}
public AddClaimInformationPage clickYesMedicalAttention(WebDriver driver) {
	BrowserActions.click(driver, rdbMedicalAttentionYes,"Medical attention Yes");
	return this;
}
public AddClaimInformationPage clickNoLostTimeWork(WebDriver driver) {
	BrowserActions.click(driver, rdbLostTimeWorkNo,true,"Lost time work No");
	return this;
}
public AddClaimInformationPage clickYesLostTimeWork(WebDriver driver) {
	BrowserActions.click(driver, rdbLostTimeWorkYes,"Lost time work Yes");
	return this;
}
public AddClaimInformationPage clickNoInjuryIllnessresultInDeath(WebDriver driver) {
	BrowserActions.click(driver, rdbInjuryIllnessresultInDeathNo,"Injury Illness result In Death No radio Button");
	return this;
}
public AddClaimInformationPage clickYesInjuryIllnessresultInDeath(WebDriver driver) {
	BrowserActions.click(driver, rdbInjuryIllnessresultInDeathYes,"Injury Illness result In Death Yes radio Button");
	return this;
}
public AddClaimInformationPage clickInjuryIllnessresultInDeath(WebDriver driver ,String radioButtonOption) {
	if ("Yes".equals(radioButtonOption)) {
		BrowserActions.click(driver, rdbInjuryIllnessresultInDeathYes,true,"Injury Illness result In Death Yes radio Button");
		Log.message("Incident only button is enabled");
	}
	else if ("No".equals(radioButtonOption)) {
		BrowserActions.click(driver, rdbInjuryIllnessresultInDeathNo,true,"Injury Illness result In Death No radio Button");
		Log.message("Incident only button is not enabled");
	} 
	return new AddClaimInformationPage(driver).get();
}
	public AddClaimInformationPage clickAddInjury(WebDriver driver) {
		BrowserActions.click(driver, btnAddInjury,"Add Injury");
		return this;
	}

public AddClaimInformationPage clickPrimaryLocation(WebDriver driver) {
	BrowserActions.click(driver, rdbPrimaryLocation,"Primary Location Radio Button");
	return this;
}


	public class NewPropertyIncidentPage extends LoadableComponent<NewPropertyIncidentPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		//	public TopNavBar topnavbar;
		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker']", AI = false)
		private WebElement drpInitialAssessor;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-__crumb__", AI = false)
		private WebElement btn__crumb__;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
		private WebElement btnViewContactDetails;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_41;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate_dateIcon", AI = false)
		private WebElement btnRequestedServiceCompletionDateDateIcon;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
		private WebElement drpJurisdiction_33;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-_checkbox']", AI = false)
		private WebElement chkOtherServices;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_SprinklerType']", AI = false)
		private WebElement drpSprinklerType;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessSourceLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_37;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_35;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
		private WebElement drpState_25;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_39;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_1;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner']", AI = false)
		private WebElement drpOwner;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
		private WebElement drpJurisdiction;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-General_Comment']", AI = false)
		private WebElement inpComment;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
		private WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-_checkbox']", AI = false)
		private WebElement chkAppraisal;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-TargetCloseDate_dateIcon", AI = false)
		private WebElement btnTargetCloseDateDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
		private WebElement inpLocationCode;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
		private WebElement btnNewLegal_12;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSearchMenuItem>div[role='menuitem']", AI = false)
		private WebElement btnSearchforaUser;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-LossLocation_Mold']", AI = false)
		private WebElement drpMoldInvolved;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-LossLocation_Hazard']", AI = false)
		private WebElement drpHazardousWasteInvolved;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-Incident_AssessmentTab", AI = false)
		private WebElement btnAssessment;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
		private WebElement btnAdjudicator;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
		private WebElement btnAutobodyRepairShop_6;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
		private WebElement btnNewVendor_5;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
		private WebElement btnNewPerson;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
		private WebElement drpCountry_19;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-ContentSourceRange']", AI = false)
		private WebElement drpSource_44;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name']", AI = false)
		private WebElement drpInternalUser;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
		private WebElement inpCity_22;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
		private WebElement inpValiduntil_30;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Deny>div[role='button']", AI = false)
		private WebElement btnDeny_43;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ServiceRequestSubmitMessage']", AI = false)
		private WebElement inpServiceRequestSubmitMessage;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
		private WebElement btnAutobodyRepairShop;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
		private WebElement btnAdjudicator_13;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
		private WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
		private WebElement inpLocationDescription;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate']", AI = false)
		private WebElement inpRequestedServiceCompletionDate;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
		private WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
		private WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_LossArea']", AI = false)
		private WebElement drpLossArea;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
		private WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
		private WebElement inpAddress2_20;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
		private WebElement drpLocation;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumSprinkler']", AI = false)
		private WebElement inpTotalofSprinklers;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
		private WebElement inpPropertyName;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
		private WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact']", AI = false)
		private WebElement drpCustomerContact;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
		private WebElement inpValiduntil;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-IncludeContentsLineItems']", AI = false)
		private WebElement rdbToContents;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
		private WebElement drpAddressType_28;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_RoofMaterial']", AI = false)
		private WebElement drpRoofCoveringMaterials;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-TargetCloseDate']", AI = false)
		private WebElement inpTargetCloseDate;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
		private WebElement btnNewVendor;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
		private WebElement inpLocationCode_32;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstDamageAmt']", AI = false)
		private WebElement drpEstimateofDamage;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
		private WebElement btnVendorCompany;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
		private WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSelectMenuItem>div[role='menuitem']", AI = false)
		private WebElement btnSelectUser;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
		private WebElement btnLawFirm;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_ClassType']", AI = false)
		private WebElement drpClassType;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-OwnerMenuIcon>div[role='button']", AI = false)
		private WebElement btnOwnerMenuIcon;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
		private WebElement drpState;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
		private WebElement btnNewLegal;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-AddServiceRequest>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
		private WebElement btnLegalVenue;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ServiceRequestSubmitMessageFNOL']", AI = false)
		private WebElement inpServiceRequestSubmitMessageFNOL;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-IncludeLineItems']", AI = false)
		private WebElement rdbToBuilding;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_Search>div[role='menuitem']", AI = false)
		private WebElement btnSearch_17;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
		private WebElement btnVendorCompany_10;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressPicker']", AI = false)
		private WebElement drpAppraisalLocation;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Approve>div[role='button']", AI = false)
		private WebElement btnApprove;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
		private WebElement btnViewContactDetails_18;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-ApproveContent>div[role='button']", AI = false)
		private WebElement btnApprove_42;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_SprinkRetServ']", AI = false)
		private WebElement drpSprinklersReturnedtoService;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-General_Description']", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-AssociateContent>div[role='button']", AI = false)
		private WebElement btnAssociateWith_45;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumSprinkOper']", AI = false)
		private WebElement inpOfSprinklersthatOperated;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_40;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-CloseDate']", AI = false)
		private WebElement inpActualCloseDate;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
		private WebElement btnViewContactDetails_3;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
		private WebElement inpCity;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
		private WebElement btnNewVendorCompany;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ExtDamagetxt textarea", AI = false)
		private WebElement inpExtentofDamagetoProperty;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate']", AI = false)
		private WebElement inpRequestedQuoteCompletionDate;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
		private WebElement btnMedicalCareOrganization;

		@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar'] div[id$='-Update']", AI = false)
		private WebElement btnOK;//#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Update>div[role='button']

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-MenuItem_Search>div[role='menuitem']", AI = false)
		private WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyDescription']", AI = false)
		private WebElement inpPropertyDescription;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
		private WebElement btnAttorney;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameMenuIcon>div[role='button']", AI = false)
		private WebElement btnInternalUser_NameMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
		private WebElement inpAddressSummary;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
		private WebElement inpAddressLine1;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstimateTime']", AI = false)
		private WebElement inpEstimatedRepairTime;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
		private WebElement btnAttorney_14;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-Vehicle_DetailsCardTab", AI = false)
		private WebElement btnDetails;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
		private WebElement btnAutoTowingAgency;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-Display_Name']", AI = false)
		private WebElement inpInvolving;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressName']", AI = false)
		private WebElement inpServiceAddressName;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-InstructionText textarea", AI = false)
		private WebElement inpAdditionalInstructions;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
		private WebElement btnLegalVenue_16;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstimatedReceived']", AI = false)
		private WebElement drpEstimateReceived;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_ExtWallMat']", AI = false)
		private WebElement drpExteriorWallMaterial;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
		private WebElement btnNewCompany_11;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Deny>div[role='button']", AI = false)
		private WebElement btnDeny;

		@IFindBy(how = How.XPATH, using = "//select[contains(@name,'Address_Picker')]", AI = false)
		private WebElement drpPropertyName;//select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_Picker']

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
		private WebElement btnLawFirm_15;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Description textarea", AI = false)
		private WebElement inpDamageDescription;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
		private WebElement inpLocationDescription_29;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumStories']", AI = false)
		private WebElement inpOfStories;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-CustomerContactMenuIcon>div[role='button']", AI = false)
		private WebElement btnCustomerContactMenuIcon;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
		private WebElement btnNewPerson_4;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
		private WebElement btnSearch_2;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
		private WebElement btnAutoTowingAgency_7;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
		private WebElement btnValiduntilDateIcon_31;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-Status']", AI = false)
		private WebElement drpStatus;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
		private WebElement btnNewCompany;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
		private WebElement btnMedicalCareOrganization_9;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_PersonVendor>div[role='menuitem']", AI = false)
		private WebElement btnNewVendorPerson;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
		private WebElement btnDoctor;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Associate>div[role='button']", AI = false)
		private WebElement btnAssociateWith;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
		private WebElement inpAddress3_21;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
		private WebElement btnValiduntilDateIcon;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-SourceRange']", AI = false)
		private WebElement drpSource;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate_dateIcon", AI = false)
		private WebElement btnRequestedQuoteCompletionDateDateIcon;

		@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-OccupancyType']", AI = false)
		private WebElement drpTypeofOccupancy;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
		private WebElement inpZIPCode_26;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-CloseDate_dateIcon", AI = false)
		private WebElement btnActualCloseDateDateIcon;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
		private WebElement btnDoctor_8;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-Assessor_PickerMenuIcon>div[role='button']", AI = false)
		private WebElement btnAssessor_PickerMenuIcon;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_34;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_23;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
		private WebElement inpCounty_24;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_38;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_27;

		@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessSourceLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_36;

		@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AlreadyRepaired']", AI = false)
		private WebElement rdbAlreadyRepaired;
		
		public NewPropertyIncidentPage(){
		}

		public NewPropertyIncidentPage(WebDriver driver){
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, rdbAlreadyRepaired))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public NewPropertyIncidentPage selectInitialAssessor(WebDriver driver,String InitialAssessor)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInitialAssessor,InitialAssessor,"InitialAssessor");
			return this;
		}
		public NewPropertyIncidentPage click__crumb__(WebDriver driver)  {
			BrowserActions.click(driver, btn__crumb__,"__crumb__");
			return this;
		}
		public NewPropertyIncidentPage clickViewContactDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
			return this;
		}
		public NewPropertyIncidentPage clickRemove_41(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_41,"Remove_41");
			return this;
		}
		public NewPropertyIncidentPage clickRequestedServiceCompletionDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnRequestedServiceCompletionDateDateIcon,"RequestedServiceCompletionDateDateIcon");
			return this;
		}
		public NewPropertyIncidentPage selectJurisdiction_33(WebDriver driver,String Jurisdiction_33)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_33,Jurisdiction_33,"Jurisdiction_33");
			return this;
		}
		public NewPropertyIncidentPage clickOtherServices(WebDriver driver)  {
			BrowserActions.click(driver, chkOtherServices,"OtherServices");
			return this;
		}
		public NewPropertyIncidentPage selectSprinklerType(WebDriver driver,String SprinklerType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSprinklerType,SprinklerType,"SprinklerType");
			return this;
		}
		public NewPropertyIncidentPage clickRemove_37(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_37,"Remove_37");
			return this;
		}
		public NewPropertyIncidentPage clickRemove_35(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_35,"Remove_35");
			return this;
		}
		public NewPropertyIncidentPage selectState_25(WebDriver driver,String State_25)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState_25,State_25,"State_25");
			return this;
		}
		public NewPropertyIncidentPage clickRemove_39(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_39,"Remove_39");
			return this;
		}
		public NewPropertyIncidentPage clickAutoFillIcon_1(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
			return this;
		}
		public NewPropertyIncidentPage selectOwner(WebDriver driver,String Owner)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpOwner,Owner,"Owner");
			return this;
		}
		public NewPropertyIncidentPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
			return this;
		}
		public NewPropertyIncidentPage enterComment(WebDriver driver,String Comment) {
			BrowserActions.type(driver, inpComment,Comment, "Comment");
			return this;
		}
		public NewPropertyIncidentPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public NewPropertyIncidentPage clickAppraisal(WebDriver driver)  {
			BrowserActions.click(driver, chkAppraisal,"Appraisal");
			return this;
		}
		public NewPropertyIncidentPage clickTargetCloseDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnTargetCloseDateDateIcon,"TargetCloseDateDateIcon");
			return this;
		}
		public NewPropertyIncidentPage enterLocationCode(WebDriver driver,String LocationCode) {
			BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			return this;
		}
		public NewPropertyIncidentPage clickNewLegal_12(WebDriver driver)  {
			BrowserActions.click(driver, btnNewLegal_12,"NewLegal_12");
			return this;
		}
		public NewPropertyIncidentPage clickSearchforaUser(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
			return this;
		}
		public NewPropertyIncidentPage selectMoldInvolved(WebDriver driver,String MoldInvolved)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMoldInvolved,MoldInvolved,"MoldInvolved");
			return this;
		}
		public NewPropertyIncidentPage selectHazardousWasteInvolved(WebDriver driver,String HazardousWasteInvolved)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpHazardousWasteInvolved,HazardousWasteInvolved,"HazardousWasteInvolved");
			return this;
		}
		public NewPropertyIncidentPage clickAssessment(WebDriver driver)  {
			BrowserActions.click(driver, btnAssessment,"Assessment");
			return this;
		}
		public NewPropertyIncidentPage clickAdjudicator(WebDriver driver)  {
			BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
			return this;
		}
		public NewPropertyIncidentPage clickAutobodyRepairShop_6(WebDriver driver)  {
			BrowserActions.click(driver, btnAutobodyRepairShop_6,"AutobodyRepairShop_6");
			return this;
		}
		public NewPropertyIncidentPage clickNewVendor_5(WebDriver driver)  {
			BrowserActions.click(driver, btnNewVendor_5,"NewVendor_5");
			return this;
		}
		public NewPropertyIncidentPage clickNewPerson(WebDriver driver)  {
			BrowserActions.click(driver, btnNewPerson,"NewPerson");
			return this;
		}
		public NewPropertyIncidentPage selectCountry_19(WebDriver driver,String Country_19)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry_19,Country_19,"Country_19");
			return this;
		}
		public NewPropertyIncidentPage selectSource_44(WebDriver driver,String Source_44)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSource_44,Source_44,"Source_44");
			return this;
		}
		public NewPropertyIncidentPage selectInternalUser(WebDriver driver,String InternalUser)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInternalUser,InternalUser,"InternalUser");
			return this;
		}
		public NewPropertyIncidentPage enterCity_22(WebDriver driver,String City_22) {
			BrowserActions.type(driver, inpCity_22,City_22, "City_22");
			return this;
		}
		public NewPropertyIncidentPage enterValiduntil_30(WebDriver driver,String Validuntil_30) {
			BrowserActions.type(driver, inpValiduntil_30,Validuntil_30, "Validuntil_30");
			return this;
		}
		public NewPropertyIncidentPage clickDeny_43(WebDriver driver)  {
			BrowserActions.click(driver, btnDeny_43,"Deny_43");
			return this;
		}
		public NewPropertyIncidentPage enterServiceRequestSubmitMessage(WebDriver driver,String ServiceRequestSubmitMessage) {
			BrowserActions.type(driver, inpServiceRequestSubmitMessage,ServiceRequestSubmitMessage, "ServiceRequestSubmitMessage");
			return this;
		}
		public NewPropertyIncidentPage clickAutobodyRepairShop(WebDriver driver)  {
			BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
			return this;
		}
		public NewPropertyIncidentPage clickAdjudicator_13(WebDriver driver)  {
			BrowserActions.click(driver, btnAdjudicator_13,"Adjudicator_13");
			return this;
		}
		public NewPropertyIncidentPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public NewPropertyIncidentPage enterLocationDescription(WebDriver driver,String LocationDescription) {
			BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			return this;
		}
		public NewPropertyIncidentPage enterRequestedServiceCompletionDate(WebDriver driver,String RequestedServiceCompletionDate) {
			BrowserActions.type(driver, inpRequestedServiceCompletionDate,RequestedServiceCompletionDate, "RequestedServiceCompletionDate");
			return this;
		}
		public NewPropertyIncidentPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public NewPropertyIncidentPage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
			return this;
		}
		public NewPropertyIncidentPage selectLossArea(WebDriver driver,String LossArea)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLossArea,LossArea,"LossArea");
			return this;
		}
		public NewPropertyIncidentPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public NewPropertyIncidentPage enterAddress2_20(WebDriver driver,String Address2_20) {
			BrowserActions.type(driver, inpAddress2_20,Address2_20, "Address2_20");
			return this;
		}
		public NewPropertyIncidentPage selectLocation(WebDriver driver,String Location)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
			return this;
		}
		public NewPropertyIncidentPage enterTotalofSprinklers(WebDriver driver,String TotalofSprinklers) {
			BrowserActions.type(driver, inpTotalofSprinklers,TotalofSprinklers, "TotalofSprinklers");
			return this;
		}
		public NewPropertyIncidentPage enterPropertyName(WebDriver driver,String PropertyName) {
			BrowserActions.type(driver, inpPropertyName,PropertyName, "PropertyName");
			return this;
		}
		public NewPropertyIncidentPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public NewPropertyIncidentPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public NewPropertyIncidentPage selectCustomerContact(WebDriver driver,String CustomerContact)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCustomerContact,CustomerContact,"CustomerContact");
			return this;
		}
		public NewPropertyIncidentPage enterValiduntil(WebDriver driver,String Validuntil) {
			BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			return this;
		}
		public NewPropertyIncidentPage clickToContents(WebDriver driver)  {
			BrowserActions.click(driver, rdbToContents,"ToContents");
			return this;
		}
		public NewPropertyIncidentPage selectAddressType_28(WebDriver driver,String AddressType_28)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_28,AddressType_28,"AddressType_28");
			return this;
		}
		public NewPropertyIncidentPage selectRoofCoveringMaterials(WebDriver driver,String RoofCoveringMaterials)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpRoofCoveringMaterials,RoofCoveringMaterials,"RoofCoveringMaterials");
			return this;
		}
		public NewPropertyIncidentPage enterTargetCloseDate(WebDriver driver,String TargetCloseDate) {
			BrowserActions.type(driver, inpTargetCloseDate,TargetCloseDate, "TargetCloseDate");
			return this;
		}
		public NewPropertyIncidentPage clickNewVendor(WebDriver driver)  {
			BrowserActions.click(driver, btnNewVendor,"NewVendor");
			return this;
		}
		public NewPropertyIncidentPage enterLocationCode_32(WebDriver driver,String LocationCode_32) {
			BrowserActions.type(driver, inpLocationCode_32,LocationCode_32, "LocationCode_32");
			return this;
		}
		public NewPropertyIncidentPage selectEstimateofDamage(WebDriver driver,String EstimateofDamage)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpEstimateofDamage,EstimateofDamage,"EstimateofDamage");
			return this;
		}
		public NewPropertyIncidentPage clickVendorCompany(WebDriver driver)  {
			BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
			return this;
		}
		public NewPropertyIncidentPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public NewPropertyIncidentPage clickSelectUser(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser,"SelectUser");
			return this;
		}
		public NewPropertyIncidentPage clickLawFirm(WebDriver driver)  {
			BrowserActions.click(driver, btnLawFirm,"LawFirm");
			return this;
		}
		public NewPropertyIncidentPage selectClassType(WebDriver driver,String ClassType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpClassType,ClassType,"ClassType");
			return this;
		}
		public NewPropertyIncidentPage clickOwnerMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnOwnerMenuIcon,"OwnerMenuIcon");
			return this;
		}
		public NewPropertyIncidentPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public NewPropertyIncidentPage clickNewLegal(WebDriver driver)  {
			BrowserActions.click(driver, btnNewLegal,"NewLegal");
			return this;
		}
		public NewPropertyIncidentPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public NewPropertyIncidentPage clickLegalVenue(WebDriver driver)  {
			BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
			return this;
		}
		public NewPropertyIncidentPage enterServiceRequestSubmitMessageFNOL(WebDriver driver,String ServiceRequestSubmitMessageFNOL) {
			BrowserActions.type(driver, inpServiceRequestSubmitMessageFNOL,ServiceRequestSubmitMessageFNOL, "ServiceRequestSubmitMessageFNOL");
			return this;
		}
		public NewPropertyIncidentPage clickToBuilding(WebDriver driver)  {
			BrowserActions.click(driver, rdbToBuilding,"ToBuilding");
			return this;
		}
		public NewPropertyIncidentPage clickSearch_17(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch_17,"Search_17");
			return this;
		}
		public NewPropertyIncidentPage clickVendorCompany_10(WebDriver driver)  {
			BrowserActions.click(driver, btnVendorCompany_10,"VendorCompany_10");
			return this;
		}
		public NewPropertyIncidentPage selectAppraisalLocation(WebDriver driver,String AppraisalLocation)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAppraisalLocation,AppraisalLocation,"AppraisalLocation");
			return this;
		}
		public NewPropertyIncidentPage clickApprove(WebDriver driver)  {
			BrowserActions.click(driver, btnApprove,"Approve");
			return this;
		}
		public NewPropertyIncidentPage clickViewContactDetails_18(WebDriver driver)  {
			BrowserActions.click(driver, btnViewContactDetails_18,"ViewContactDetails_18");
			return this;
		}
		public NewPropertyIncidentPage clickApprove_42(WebDriver driver)  {
			BrowserActions.click(driver, btnApprove_42,"Approve_42");
			return this;
		}
		public NewPropertyIncidentPage selectSprinklersReturnedtoService(WebDriver driver,String SprinklersReturnedtoService)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSprinklersReturnedtoService,SprinklersReturnedtoService,"SprinklersReturnedtoService");
			return this;
		}
		public NewPropertyIncidentPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public NewPropertyIncidentPage clickAssociateWith_45(WebDriver driver)  {
			BrowserActions.click(driver, btnAssociateWith_45,"AssociateWith_45");
			return this;
		}
		public NewPropertyIncidentPage enterOfSprinklersthatOperated(WebDriver driver,String OfSprinklersthatOperated) {
			BrowserActions.type(driver, inpOfSprinklersthatOperated,OfSprinklersthatOperated, "OfSprinklersthatOperated");
			return this;
		}
		public NewPropertyIncidentPage clickAdd_40(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_40,"Add_40");
			return this;
		}
		public NewPropertyIncidentPage enterActualCloseDate(WebDriver driver,String ActualCloseDate) {
			BrowserActions.type(driver, inpActualCloseDate,ActualCloseDate, "ActualCloseDate");
			return this;
		}
		public NewPropertyIncidentPage clickViewContactDetails_3(WebDriver driver)  {
			BrowserActions.click(driver, btnViewContactDetails_3,"ViewContactDetails_3");
			return this;
		}
		public NewPropertyIncidentPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public NewPropertyIncidentPage clickNewVendorCompany(WebDriver driver)  {
			BrowserActions.click(driver, btnNewVendorCompany,"NewVendorCompany");
			return this;
		}
		public NewPropertyIncidentPage enterExtentofDamagetoProperty(WebDriver driver,String ExtentofDamagetoProperty) {
			BrowserActions.type(driver, inpExtentofDamagetoProperty,ExtentofDamagetoProperty, "ExtentofDamagetoProperty");
			return this;
		}
		public NewPropertyIncidentPage enterRequestedQuoteCompletionDate(WebDriver driver,String RequestedQuoteCompletionDate) {
			BrowserActions.type(driver, inpRequestedQuoteCompletionDate,RequestedQuoteCompletionDate, "RequestedQuoteCompletionDate");
			return this;
		}
		public NewPropertyIncidentPage clickMedicalCareOrganization(WebDriver driver)  {
			BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
			return this;
		}
		public NewPropertyIncidentPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
			return this;
		}
		public NewPropertyIncidentPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public NewPropertyIncidentPage enterPropertyDescription(WebDriver driver,String PropertyDescription) {
			BrowserActions.type(driver, inpPropertyDescription,PropertyDescription, "PropertyDescription");
			return this;
		}
		public NewPropertyIncidentPage clickAttorney(WebDriver driver)  {
			BrowserActions.click(driver, btnAttorney,"Attorney");
			return this;
		}
		public NewPropertyIncidentPage clickInternalUser_NameMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnInternalUser_NameMenuIcon,"InternalUser_NameMenuIcon");
			return this;
		}
		public NewPropertyIncidentPage enterAddressSummary(WebDriver driver,String AddressSummary) {
			BrowserActions.type(driver, inpAddressSummary,AddressSummary, "AddressSummary");
			return this;
		}
		public NewPropertyIncidentPage enterAddressLine1(WebDriver driver,String AddressLine1) {
			BrowserActions.type(driver, inpAddressLine1,AddressLine1, "AddressLine1");
			return this;
		}
		public NewPropertyIncidentPage enterEstimatedRepairTime(WebDriver driver,String EstimatedRepairTime) {
			BrowserActions.type(driver, inpEstimatedRepairTime,EstimatedRepairTime, "EstimatedRepairTime");
			return this;
		}
		public NewPropertyIncidentPage clickAttorney_14(WebDriver driver)  {
			BrowserActions.click(driver, btnAttorney_14,"Attorney_14");
			return this;
		}
		public NewPropertyIncidentPage clickDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnDetails,"Details");
			return this;
		}
		public NewPropertyIncidentPage clickAutoTowingAgency(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
			return this;
		}
		public NewPropertyIncidentPage enterInvolving(WebDriver driver,String Involving) {
			BrowserActions.type(driver, inpInvolving,Involving, "Involving");
			return this;
		}
		public NewPropertyIncidentPage enterServiceAddressName(WebDriver driver,String ServiceAddressName) {
			BrowserActions.type(driver, inpServiceAddressName,ServiceAddressName, "ServiceAddressName");
			return this;
		}
		public NewPropertyIncidentPage enterAdditionalInstructions(WebDriver driver,String AdditionalInstructions) {
			BrowserActions.type(driver, inpAdditionalInstructions,AdditionalInstructions, "AdditionalInstructions");
			return this;
		}
		public NewPropertyIncidentPage clickLegalVenue_16(WebDriver driver)  {
			BrowserActions.click(driver, btnLegalVenue_16,"LegalVenue_16");
			return this;
		}
		public NewPropertyIncidentPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewPropertyIncidentPage selectEstimateReceived(WebDriver driver,String EstimateReceived)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpEstimateReceived,EstimateReceived,"EstimateReceived");
			return this;
		}
		public NewPropertyIncidentPage selectExteriorWallMaterial(WebDriver driver,String ExteriorWallMaterial)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpExteriorWallMaterial,ExteriorWallMaterial,"ExteriorWallMaterial");
			return this;
		}
		public NewPropertyIncidentPage clickNewCompany_11(WebDriver driver)  {
			BrowserActions.click(driver, btnNewCompany_11,"NewCompany_11");
			return this;
		}
		public NewPropertyIncidentPage clickDeny(WebDriver driver)  {
			BrowserActions.click(driver, btnDeny,"Deny");
			return this;
		}
		public NewPropertyIncidentPage selectPropertyName(WebDriver driver, String propertyName)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPropertyName,propertyName,0.5,"PropertyName");
			return this;
		}
		public NewPropertyIncidentPage clickLawFirm_15(WebDriver driver)  {
			BrowserActions.click(driver, btnLawFirm_15,"LawFirm_15");
			return this;
		}
		public NewPropertyIncidentPage enterDamageDescription(WebDriver driver,String DamageDescription) {
			BrowserActions.type(driver, inpDamageDescription,DamageDescription,0.5, "DamageDescription");
			return this;
		}
		public NewPropertyIncidentPage enterLocationDescription_29(WebDriver driver,String LocationDescription_29) {
			BrowserActions.type(driver, inpLocationDescription_29,LocationDescription_29, "LocationDescription_29");
			return this;
		}
		public NewPropertyIncidentPage enterOfStories(WebDriver driver,String OfStories) {
			BrowserActions.type(driver, inpOfStories,OfStories, "OfStories");
			return this;
		}
		public NewPropertyIncidentPage clickCustomerContactMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnCustomerContactMenuIcon,"CustomerContactMenuIcon");
			return this;
		}
		public NewPropertyIncidentPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewPropertyIncidentPage clickNewPerson_4(WebDriver driver)  {
			BrowserActions.click(driver, btnNewPerson_4,"NewPerson_4");
			return this;
		}
		public NewPropertyIncidentPage clickSearch_2(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch_2,"Search_2");
			return this;
		}
		public NewPropertyIncidentPage clickAutoTowingAgency_7(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoTowingAgency_7,"AutoTowingAgency_7");
			return this;
		}
		public NewPropertyIncidentPage clickValiduntilDateIcon_31(WebDriver driver)  {
			BrowserActions.click(driver, btnValiduntilDateIcon_31,"ValiduntilDateIcon_31");
			return this;
		}
		public NewPropertyIncidentPage selectStatus(WebDriver driver,String Status)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
			return this;
		}
		public NewPropertyIncidentPage clickNewCompany(WebDriver driver)  {
			BrowserActions.click(driver, btnNewCompany,"NewCompany");
			return this;
		}
		public NewPropertyIncidentPage clickMedicalCareOrganization_9(WebDriver driver)  {
			BrowserActions.click(driver, btnMedicalCareOrganization_9,"MedicalCareOrganization_9");
			return this;
		}
		public NewPropertyIncidentPage clickNewVendorPerson(WebDriver driver)  {
			BrowserActions.click(driver, btnNewVendorPerson,"NewVendorPerson");
			return this;
		}
		public NewPropertyIncidentPage clickDoctor(WebDriver driver)  {
			BrowserActions.click(driver, btnDoctor,"Doctor");
			return this;
		}
		public NewPropertyIncidentPage clickAssociateWith(WebDriver driver)  {
			BrowserActions.click(driver, btnAssociateWith,"AssociateWith");
			return this;
		}
		public NewPropertyIncidentPage enterAddress3_21(WebDriver driver,String Address3_21) {
			BrowserActions.type(driver, inpAddress3_21,Address3_21, "Address3_21");
			return this;
		}
		public NewPropertyIncidentPage clickValiduntilDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
			return this;
		}
		public NewPropertyIncidentPage selectSource(WebDriver driver,String Source)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSource,Source,"Source");
			return this;
		}
		public NewPropertyIncidentPage clickRequestedQuoteCompletionDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnRequestedQuoteCompletionDateDateIcon,"RequestedQuoteCompletionDateDateIcon");
			return this;
		}
		public NewPropertyIncidentPage selectTypeofOccupancy(WebDriver driver,String TypeofOccupancy)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTypeofOccupancy,TypeofOccupancy,"TypeofOccupancy");
			return this;
		}
		public NewPropertyIncidentPage enterZIPCode_26(WebDriver driver,String ZIPCode_26) {
			BrowserActions.type(driver, inpZIPCode_26,ZIPCode_26, "ZIPCode_26");
			return this;
		}
		public NewPropertyIncidentPage clickActualCloseDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnActualCloseDateDateIcon,"ActualCloseDateDateIcon");
			return this;
		}
		public NewPropertyIncidentPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewPropertyIncidentPage clickDoctor_8(WebDriver driver)  {
			BrowserActions.click(driver, btnDoctor_8,"Doctor_8");
			return this;
		}
		public NewPropertyIncidentPage clickAssessor_PickerMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAssessor_PickerMenuIcon,"Assessor_PickerMenuIcon");
			return this;
		}
		public NewPropertyIncidentPage clickAdd_34(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_34,"Add_34");
			return this;
		}
		public NewPropertyIncidentPage clickAutoFillIcon_23(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_23,"AutoFillIcon_23");
			return this;
		}
		public NewPropertyIncidentPage enterCounty_24(WebDriver driver,String County_24) {
			BrowserActions.type(driver, inpCounty_24,County_24, "County_24");
			return this;
		}
		public NewPropertyIncidentPage clickAdd_38(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_38,"Add_38");
			return this;
		}
		public NewPropertyIncidentPage clickAutoFillIcon_27(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_27,"AutoFillIcon_27");
			return this;
		}
		public NewPropertyIncidentPage clickAdd_36(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_36,"Add_36");
			return this;
		}
		public NewPropertyIncidentPage clickAlreadyRepaired(WebDriver driver)  {
			BrowserActions.click(driver, rdbAlreadyRepaired,"AlreadyRepaired");
			return this;
		}

	}
}
