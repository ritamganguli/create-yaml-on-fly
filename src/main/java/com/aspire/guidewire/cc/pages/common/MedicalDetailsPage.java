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

public class MedicalDetailsPage extends LoadableComponent<MedicalDetailsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ISODetailsDV-ReceiveDate_dateIcon", AI = false)
	public WebElement btnLastresponsefromISODateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator_33;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_CurrentConditions']", AI = false)
	public WebElement rdbFirstNotice_CurrentConditions;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany_31;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalTreatmentsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_40;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MPN_EmpSentMPNNotice_dateIcon", AI = false)
	public WebElement btnDateemployersentMPNnoticeDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ReopenedReason']", AI = false)
	public WebElement drpReasonReopened;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_44;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalContactStatusLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_42;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-CompensabilityDecision']", AI = false)
	public WebElement drpDecision;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ReOpenDate']", AI = false)
	public WebElement inpReopenDate;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_CloseButton>div[role='button']", AI = false)
	public WebElement btnCloseExposure;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-1-DueDate']", AI = false)
	public WebElement inpDue_4;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-FirstNotice_FirstIntakeDoctorMenuIcon>div[role='button']", AI = false)
	public WebElement btnFirstNotice_FirstIntakeDoctorMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ClosedOutcome']", AI = false)
	public WebElement drpResolution;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Make_Primary>div[role='button']", AI = false)
	public WebElement btnMakePrimary;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ExposureWorkloadInputSet-ClassificationWorkload']", AI = false)
	public WebElement inpClassificationWeight;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-DrugsPrescribedLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_48;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-EditableMedicalActionsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_46;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital']", AI = false)
	public WebElement drpHospital;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails_38;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_MedicalDiagnosis']", AI = false)
	public WebElement inpDiagnosis;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator_18;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_HospitalDate']", AI = false)
	public WebElement inpAdmittedDate;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_PreexDisabilityInfo']", AI = false)
	public WebElement inpPreexistingInformation;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MPN_InsurerSentMPNNotice']", AI = false)
	public WebElement inpDateinsurersentMPNnotice;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_CreateReserveButton>div[role='button']", AI = false)
	public WebElement btnCreateReserve;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-DeductibleInfoInputSet-DeductibleWaived']", AI = false)
	public WebElement rdbWaived;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Reconfirmed_Diagnosis>div[role='button']", AI = false)
	public WebElement btnReconfirmDiagnosis;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-SettlementMethod']", AI = false)
	public WebElement drpSettlementMethod;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ExposureWorkloadInputSet-SupplementalWorkloadWeight']", AI = false)
	public WebElement inpSupplementalWeight;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_InitialTreatment']", AI = false)
	public WebElement drpInitialTreatment;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ISODetailsDV-ISOErrorMessage textarea", AI = false)
	public WebElement inpISOError;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ExposureWorkloadInputSet-TotalWorkloadWeight']", AI = false)
	public WebElement inpTotalWeight;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_TreatmentRend textarea", AI = false)
	public WebElement inpTreatmentRendered;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Strategy']", AI = false)
	public WebElement drpHandlingStrategy;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany_15;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_HospitalDate_dateIcon", AI = false)
	public WebElement btnAdmittedDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name']", AI = false)
	public WebElement drpAlternateContact;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Claim_NurseCaseManager-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails_3;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails_23;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-CompensabilityDecisionDate']", AI = false)
	public WebElement inpDecisionDate;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ReOpenDate_dateIcon", AI = false)
	public WebElement btnReopenDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MPN_EmpSentMPNNotice']", AI = false)
	public WebElement inpDateemployersentMPNnotice;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_SubjComplaints textarea", AI = false)
	public WebElement inpSubjectiveComplaints;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MMI_MMIdate_dateIcon", AI = false)
	public WebElement btnDateMMIwasreachedDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-DetailedBodyPartDescription']", AI = false)
	public WebElement drpBodyPartDescription;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FurtherTreatment']", AI = false)
	public WebElement rdbFurtherTreatmentNeeded;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney_19;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PrimaryCoverage']", AI = false)
	public WebElement drpPrimaryCoverage;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MMI_MMInote textarea", AI = false)
	public WebElement inpMMInotes;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-DeductibleInfoInputSet-DeductibleOverridden']", AI = false)
	public WebElement rdbModified;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ISODetailsDV-SendDate']", AI = false)
	public WebElement inpDatesenttoISO;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson_9;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany_30;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-PermamentImpairmentPercentage']", AI = false)
	public WebElement inpPPDPercentage;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_DiagnosticConsistent']", AI = false)
	public WebElement rdbIstheDiagnosisConsistent;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-DetailedBodyPartSide']", AI = false)
	public WebElement drpSide;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AssignedGroup_Name']", AI = false)
	public WebElement inpGroup;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalPersonnelLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Claim_NurseCaseManager-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch_2;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Claim_NurseCaseManager-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson_1;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-1-Priority']", AI = false)
	public WebElement drpPriority_6;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ClosedDate']", AI = false)
	public WebElement inpCloseDate;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_AssignButton>div[role='button']", AI = false)
	public WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_ObjFindings textarea", AI = false)
	public WebElement inpObjectiveFindings;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney_34;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue_21;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue_36;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_ReopenButton>div[role='button']", AI = false)
	public WebElement btnReopenExposure;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_EmployeeAuthorizationToReleaseMedicalRecords']", AI = false)
	public WebElement rdbFirstNotice_EmployeeAuthorizationToReleaseMedicalRecords;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MPN_PTPinMPN']", AI = false)
	public WebElement rdbMPN_PTPinMPN;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor_13;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MPN_InjWkrInMPN']", AI = false)
	public WebElement inpDateinjuredworkerjoinedMPN;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-1-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateIcon_5;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ISODetailsDV-Status']", AI = false)
	public WebElement drpStatus_49;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ISODetailsDV-KnownToISO']", AI = false)
	public WebElement rdbKnowntoISO;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-1-Subject']", AI = false)
	public WebElement inpSubject_7;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor_28;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ClosedDate_dateIcon", AI = false)
	public WebElement btnCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-0-Subject']", AI = false)
	public WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-SettlementDate_dateIcon", AI = false)
	public WebElement btnSettlementDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-0-AssignedUser']", AI = false)
	public WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-CreateTime_dateIcon", AI = false)
	public WebElement btnCreateDateDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor_10;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-DetailedBodyPart']", AI = false)
	public WebElement drpBodyPart;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-DeductibleInfoInputSet-DeductibleEditReason']", AI = false)
	public WebElement inpEditReason;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-0-Priority']", AI = false)
	public WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal_17;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop_11;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ValidationLevel']", AI = false)
	public WebElement drpValidationLevel;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Claim_NurseCaseManager']", AI = false)
	public WebElement drpNurseCaseManager;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_HospitalDays']", AI = false)
	public WebElement inpEstimatedDays;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor_25;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-AltContact_NameMenuIcon>div[role='button']", AI = false)
	public WebElement btnAltContact_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Exposure_ISOCardTab", AI = false)
	public WebElement btnISO;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_ExaminationDate_dateIcon", AI = false)
	public WebElement btnExaminationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-0-DueDate']", AI = false)
	public WebElement inpDue;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal_32;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor']", AI = false)
	public WebElement drpDoctor;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MPN_InsurerSentMPNNotice_dateIcon", AI = false)
	public WebElement btnDateinsurersentMPNnoticeDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalPersonnelLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AssignedUser_Name']", AI = false)
	public WebElement inpAdjuster;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MMI_MMIdate']", AI = false)
	public WebElement inpDateMMIwasreached;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalTreatmentsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_39;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-CreatedVia']", AI = false)
	public WebElement drpCreatedVia;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_MedicalTreatment']", AI = false)
	public WebElement drpTreatmentType;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization_29;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency_27;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCMedCaseMgmt_DetailsCardTab", AI = false)
	public WebElement btnMedicalCaseMgmt;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-CreateTime']", AI = false)
	public WebElement inpCreateDate;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm_35;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalContactStatusLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_41;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ISODetailsDV-ReceiveDate']", AI = false)
	public WebElement inpLastresponsefromISO;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-EditableMedicalActionsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_45;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-PrimaryBodyPart']", AI = false)
	public WebElement drpAreaofBody;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_43;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch_22;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-MedCaseMgrDV-DrugsPrescribedLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_47;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-MPN_InjWkrInMPN_dateIcon", AI = false)
	public WebElement btnDateinjuredworkerjoinedMPNDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency_12;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_RefreshButton>div[role='button']", AI = false)
	public WebElement btnRefreshResponses;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization_14;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamage_DetailsCardTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_TreatedPatientBefore']", AI = false)
	public WebElement rdbDidDoctorTreatPatientBefore;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_ExaminationDate']", AI = false)
	public WebElement inpExaminationDate;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_PreexDisability']", AI = false)
	public WebElement rdbPreexistingDisability;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm_20;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-SettlementDate']", AI = false)
	public WebElement inpSettlementDate;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Segment']", AI = false)
	public WebElement drpSegment;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson_24;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-CompensabilityComments']", AI = false)
	public WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop_26;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-0-DueDate_dateIcon", AI = false)
	public WebElement btnDueDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-FirstNotice_FirstIntakeDoctor-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany_16;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCMedCaseMgmt_MainCardTab", AI = false)
	public WebElement btnSummary;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-Hospital_HospitalMenuIcon>div[role='button']", AI = false)
	public WebElement btnHospital_HospitalMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-Ordering']", AI = false)
	public WebElement inpOrder;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ExposureWorkloadInputSet-Classification']", AI = false)
	public WebElement inpClassification;

	@IFindBy(how = How.CSS, using = "select[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-State']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-PlannedActivities-WCExposureActivitiesLV-1-AssignedUser']", AI = false)
	public WebElement inpAssignedTo_8;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-Claim_NurseCaseManager-Claim_NurseCaseManagerMenuIcon>div[role='button']", AI = false)
	public WebElement btnClaim_NurseCaseManagerMenuIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-AltContact_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-EditableBodyPartDetailsLV-0-CompensabilityDecisionDate_dateIcon", AI = false)
	public WebElement btnDecisionDateDateIcon;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-ISODetailsDV-SendDate_dateIcon", AI = false)
	public WebElement btnDatesenttoISODateIcon;

	@IFindBy(how = How.CSS, using = "input[name='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-InjuryDescription']", AI = false)
	public WebElement inpInjuryDescription;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_SendToISOButton>div[role='button']", AI = false)
	public WebElement btnSendToISO;

	@IFindBy(how = How.CSS, using = "#TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailDV-WCInjuryDamageDV-Hospital_Hospital-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch_37;
	
	@IFindBy(how = How.CSS, using = "div[id$='ExposureDetailDV-Segment']", AI = false)
	public WebElement lblsegment;

	public MedicalDetailsPage(){
	}

	public MedicalDetailsPage(WebDriver driver){
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
}public MedicalDetailsPage clickLastresponsefromISODateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLastresponsefromISODateIcon,"LastresponsefromISODateIcon");
				    return this;
			}
public MedicalDetailsPage clickAdjudicator_33(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_33,"Adjudicator_33");
				    return this;
			}
public MedicalDetailsPage clickFirstNotice_CurrentConditions(WebDriver driver)  {
					BrowserActions.click(driver, rdbFirstNotice_CurrentConditions,"FirstNotice_CurrentConditions");
				    return this;
			}
public MedicalDetailsPage clickNewCompany_31(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_31,"NewCompany_31");
				    return this;
			}
public MedicalDetailsPage clickRemove_40(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_40,"Remove_40");
				    return this;
			}
public MedicalDetailsPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public MedicalDetailsPage clickDateemployersentMPNnoticeDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateemployersentMPNnoticeDateIcon,"DateemployersentMPNnoticeDateIcon");
				    return this;
			}
public MedicalDetailsPage selectReasonReopened(WebDriver driver,String ReasonReopened)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReasonReopened,ReasonReopened,"ReasonReopened");
				    return this;
			}
public MedicalDetailsPage clickRemove_44(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_44,"Remove_44");
				    return this;
			}
public MedicalDetailsPage clickRemove_42(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_42,"Remove_42");
				    return this;
			}
public MedicalDetailsPage selectDecision(WebDriver driver,String Decision)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDecision,Decision,"Decision");
				    return this;
			}
public MedicalDetailsPage enterReopenDate(WebDriver driver,String ReopenDate) {
		            BrowserActions.type(driver, inpReopenDate,ReopenDate, "ReopenDate");
			        return this;
           }
public MedicalDetailsPage clickCloseExposure(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseExposure,"CloseExposure");
				    return this;
			}
public MedicalDetailsPage enterDue_4(WebDriver driver,String Due_4) {
		            BrowserActions.type(driver, inpDue_4,Due_4, "Due_4");
			        return this;
           }
public MedicalDetailsPage clickFirstNotice_FirstIntakeDoctorMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFirstNotice_FirstIntakeDoctorMenuIcon,"FirstNotice_FirstIntakeDoctorMenuIcon");
				    return this;
			}
public MedicalDetailsPage selectResolution(WebDriver driver,String Resolution)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpResolution,Resolution,"Resolution");
				    return this;
			}
public MedicalDetailsPage clickMakePrimary(WebDriver driver)  {
					BrowserActions.click(driver, btnMakePrimary,"MakePrimary");
				    return this;
			}
public MedicalDetailsPage enterClassificationWeight(WebDriver driver,String ClassificationWeight) {
		            BrowserActions.type(driver, inpClassificationWeight,ClassificationWeight, "ClassificationWeight");
			        return this;
           }
public MedicalDetailsPage clickRemove_48(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_48,"Remove_48");
				    return this;
			}
public MedicalDetailsPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public MedicalDetailsPage clickRemove_46(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_46,"Remove_46");
				    return this;
			}
public MedicalDetailsPage selectHospital(WebDriver driver,String Hospital)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHospital,Hospital,"Hospital");
				    return this;
			}
public MedicalDetailsPage clickViewContactDetails_38(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_38,"ViewContactDetails_38");
				    return this;
			}
public MedicalDetailsPage enterDiagnosis(WebDriver driver,String Diagnosis) {
		            BrowserActions.type(driver, inpDiagnosis,Diagnosis, "Diagnosis");
			        return this;
           }
public MedicalDetailsPage clickAdjudicator_18(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_18,"Adjudicator_18");
				    return this;
			}
public MedicalDetailsPage enterAdmittedDate(WebDriver driver,String AdmittedDate) {
		            BrowserActions.type(driver, inpAdmittedDate,AdmittedDate, "AdmittedDate");
			        return this;
           }
public MedicalDetailsPage enterPreexistingInformation(WebDriver driver,String PreexistingInformation) {
		            BrowserActions.type(driver, inpPreexistingInformation,PreexistingInformation, "PreexistingInformation");
			        return this;
           }
public MedicalDetailsPage enterDateinsurersentMPNnotice(WebDriver driver,String DateinsurersentMPNnotice) {
		            BrowserActions.type(driver, inpDateinsurersentMPNnotice,DateinsurersentMPNnotice, "DateinsurersentMPNnotice");
			        return this;
           }
public EditReservesPage clickCreateReserve(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateReserve,"CreateReserve");
				    return new EditReservesPage(driver);
			}
public MedicalDetailsPage clickWaived(WebDriver driver)  {
					BrowserActions.click(driver, rdbWaived,"Waived");
				    return this;
			}
public MedicalDetailsPage clickReconfirmDiagnosis(WebDriver driver)  {
					BrowserActions.click(driver, btnReconfirmDiagnosis,"ReconfirmDiagnosis");
				    return this;
			}
public MedicalDetailsPage selectSettlementMethod(WebDriver driver,String SettlementMethod)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSettlementMethod,SettlementMethod,"SettlementMethod");
				    return this;
			}
public MedicalDetailsPage enterSupplementalWeight(WebDriver driver,String SupplementalWeight) {
		            BrowserActions.type(driver, inpSupplementalWeight,SupplementalWeight, "SupplementalWeight");
			        return this;
           }
public MedicalDetailsPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public MedicalDetailsPage selectInitialTreatment(WebDriver driver,String InitialTreatment)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInitialTreatment,InitialTreatment,"InitialTreatment");
				    return this;
			}
public MedicalDetailsPage enterISOError(WebDriver driver,String ISOError) {
		            BrowserActions.type(driver, inpISOError,ISOError, "ISOError");
			        return this;
           }
public MedicalDetailsPage enterTotalWeight(WebDriver driver,String TotalWeight) {
		            BrowserActions.type(driver, inpTotalWeight,TotalWeight, "TotalWeight");
			        return this;
           }
public MedicalDetailsPage enterTreatmentRendered(WebDriver driver,String TreatmentRendered) {
		            BrowserActions.type(driver, inpTreatmentRendered,TreatmentRendered, "TreatmentRendered");
			        return this;
           }
public MedicalDetailsPage selectHandlingStrategy(WebDriver driver,String HandlingStrategy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHandlingStrategy,HandlingStrategy,"HandlingStrategy");
				    return this;
			}
public MedicalDetailsPage clickVendorCompany_15(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_15,"VendorCompany_15");
				    return this;
			}
public MedicalDetailsPage clickAdmittedDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAdmittedDateDateIcon,"AdmittedDateDateIcon");
				    return this;
			}
public MedicalDetailsPage selectAlternateContact(WebDriver driver,String AlternateContact)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAlternateContact,AlternateContact,"AlternateContact");
				    return this;
			}
public MedicalDetailsPage clickViewContactDetails_3(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_3,"ViewContactDetails_3");
				    return this;
			}
public MedicalDetailsPage clickViewContactDetails_23(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_23,"ViewContactDetails_23");
				    return this;
			}
public MedicalDetailsPage enterDecisionDate(WebDriver driver,String DecisionDate) {
		            BrowserActions.type(driver, inpDecisionDate,DecisionDate, "DecisionDate");
			        return this;
           }
public MedicalDetailsPage clickReopenDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenDateDateIcon,"ReopenDateDateIcon");
				    return this;
			}
public MedicalDetailsPage enterDateemployersentMPNnotice(WebDriver driver,String DateemployersentMPNnotice) {
		            BrowserActions.type(driver, inpDateemployersentMPNnotice,DateemployersentMPNnotice, "DateemployersentMPNnotice");
			        return this;
           }
public MedicalDetailsPage enterSubjectiveComplaints(WebDriver driver,String SubjectiveComplaints) {
		            BrowserActions.type(driver, inpSubjectiveComplaints,SubjectiveComplaints, "SubjectiveComplaints");
			        return this;
           }
public MedicalDetailsPage clickDateMMIwasreachedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateMMIwasreachedDateIcon,"DateMMIwasreachedDateIcon");
				    return this;
			}
public MedicalDetailsPage selectBodyPartDescription(WebDriver driver,String BodyPartDescription)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBodyPartDescription,BodyPartDescription,"BodyPartDescription");
				    return this;
			}
public MedicalDetailsPage clickFurtherTreatmentNeeded(WebDriver driver)  {
					BrowserActions.click(driver, rdbFurtherTreatmentNeeded,"FurtherTreatmentNeeded");
				    return this;
			}
public MedicalDetailsPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public MedicalDetailsPage clickAttorney_19(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_19,"Attorney_19");
				    return this;
			}
public MedicalDetailsPage selectPrimaryCoverage(WebDriver driver,String PrimaryCoverage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryCoverage,PrimaryCoverage,"PrimaryCoverage");
				    return this;
			}
public MedicalDetailsPage enterMMInotes(WebDriver driver,String MMInotes) {
		            BrowserActions.type(driver, inpMMInotes,MMInotes, "MMInotes");
			        return this;
           }
public MedicalDetailsPage clickModified(WebDriver driver)  {
					BrowserActions.click(driver, rdbModified,"Modified");
				    return this;
			}
public MedicalDetailsPage enterDatesenttoISO(WebDriver driver,String DatesenttoISO) {
		            BrowserActions.type(driver, inpDatesenttoISO,DatesenttoISO, "DatesenttoISO");
			        return this;
           }
public MedicalDetailsPage clickNewPerson_9(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_9,"NewPerson_9");
				    return this;
			}
public MedicalDetailsPage clickVendorCompany_30(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_30,"VendorCompany_30");
				    return this;
			}
public MedicalDetailsPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public MedicalDetailsPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public MedicalDetailsPage enterPPDPercentage(WebDriver driver,String PPDPercentage) {
		            BrowserActions.type(driver, inpPPDPercentage,PPDPercentage, "PPDPercentage");
			        return this;
           }
public MedicalDetailsPage clickIstheDiagnosisConsistent(WebDriver driver)  {
					BrowserActions.click(driver, rdbIstheDiagnosisConsistent,"IstheDiagnosisConsistent");
				    return this;
			}
public MedicalDetailsPage selectSide(WebDriver driver,String Side)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSide,Side,"Side");
				    return this;
			}
public MedicalDetailsPage enterGroup(WebDriver driver,String Group) {
		            BrowserActions.type(driver, inpGroup,Group, "Group");
			        return this;
           }
public MedicalDetailsPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public MedicalDetailsPage clickSearch_2(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_2,"Search_2");
				    return this;
			}
public MedicalDetailsPage clickNewPerson_1(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_1,"NewPerson_1");
				    return this;
			}
public MedicalDetailsPage selectPriority_6(WebDriver driver,String Priority_6)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_6,Priority_6,"Priority_6");
				    return this;
			}
public MedicalDetailsPage enterCloseDate(WebDriver driver,String CloseDate) {
		            BrowserActions.type(driver, inpCloseDate,CloseDate, "CloseDate");
			        return this;
           }
public MedicalDetailsPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public MedicalDetailsPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public MedicalDetailsPage enterObjectiveFindings(WebDriver driver,String ObjectiveFindings) {
		            BrowserActions.type(driver, inpObjectiveFindings,ObjectiveFindings, "ObjectiveFindings");
			        return this;
           }
public MedicalDetailsPage clickAttorney_34(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_34,"Attorney_34");
				    return this;
			}
public MedicalDetailsPage clickLegalVenue_21(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_21,"LegalVenue_21");
				    return this;
			}
public MedicalDetailsPage clickLegalVenue_36(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_36,"LegalVenue_36");
				    return this;
			}
public MedicalDetailsPage clickReopenExposure(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenExposure,"ReopenExposure");
				    return this;
			}
public MedicalDetailsPage clickFirstNotice_EmployeeAuthorizationToReleaseMedicalRecords(WebDriver driver)  {
					BrowserActions.click(driver, rdbFirstNotice_EmployeeAuthorizationToReleaseMedicalRecords,"FirstNotice_EmployeeAuthorizationToReleaseMedicalRecords");
				    return this;
			}
public MedicalDetailsPage clickMPN_PTPinMPN(WebDriver driver)  {
					BrowserActions.click(driver, rdbMPN_PTPinMPN,"MPN_PTPinMPN");
				    return this;
			}
public MedicalDetailsPage clickDoctor_13(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_13,"Doctor_13");
				    return this;
			}
public MedicalDetailsPage enterDateinjuredworkerjoinedMPN(WebDriver driver,String DateinjuredworkerjoinedMPN) {
		            BrowserActions.type(driver, inpDateinjuredworkerjoinedMPN,DateinjuredworkerjoinedMPN, "DateinjuredworkerjoinedMPN");
			        return this;
           }
public MedicalDetailsPage clickDueDateIcon_5(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_5,"DueDateIcon_5");
				    return this;
			}
public MedicalDetailsPage selectStatus_49(WebDriver driver,String Status_49)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_49,Status_49,"Status_49");
				    return this;
			}
public MedicalDetailsPage clickKnowntoISO(WebDriver driver)  {
					BrowserActions.click(driver, rdbKnowntoISO,"KnowntoISO");
				    return this;
			}
public MedicalDetailsPage enterSubject_7(WebDriver driver,String Subject_7) {
		            BrowserActions.type(driver, inpSubject_7,Subject_7, "Subject_7");
			        return this;
           }
public MedicalDetailsPage clickDoctor_28(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_28,"Doctor_28");
				    return this;
			}
public MedicalDetailsPage clickCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseDateDateIcon,"CloseDateDateIcon");
				    return this;
			}
public MedicalDetailsPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public MedicalDetailsPage clickSettlementDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSettlementDateDateIcon,"SettlementDateDateIcon");
				    return this;
			}
public MedicalDetailsPage enterAssignedTo(WebDriver driver,String AssignedTo) {
		            BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
			        return this;
           }
public MedicalDetailsPage clickCreateDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateDateDateIcon,"CreateDateDateIcon");
				    return this;
			}
public MedicalDetailsPage clickNewVendor_10(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_10,"NewVendor_10");
				    return this;
			}
public MedicalDetailsPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public MedicalDetailsPage selectBodyPart(WebDriver driver,String BodyPart)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBodyPart,BodyPart,"BodyPart");
				    return this;
			}
public MedicalDetailsPage enterEditReason(WebDriver driver,String EditReason) {
		            BrowserActions.type(driver, inpEditReason,EditReason, "EditReason");
			        return this;
           }
public MedicalDetailsPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public MedicalDetailsPage clickNewLegal_17(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_17,"NewLegal_17");
				    return this;
			}
public MedicalDetailsPage clickAutobodyRepairShop_11(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_11,"AutobodyRepairShop_11");
				    return this;
			}
public MedicalDetailsPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public MedicalDetailsPage selectValidationLevel(WebDriver driver,String ValidationLevel)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpValidationLevel,ValidationLevel,"ValidationLevel");
				    return this;
			}
public MedicalDetailsPage selectNurseCaseManager(WebDriver driver,String NurseCaseManager)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpNurseCaseManager,NurseCaseManager,"NurseCaseManager");
				    return this;
			}
public MedicalDetailsPage enterEstimatedDays(WebDriver driver,String EstimatedDays) {
		            BrowserActions.type(driver, inpEstimatedDays,EstimatedDays, "EstimatedDays");
			        return this;
           }
public MedicalDetailsPage clickNewVendor_25(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_25,"NewVendor_25");
				    return this;
			}
public MedicalDetailsPage clickAltContact_NameMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAltContact_NameMenuIcon,"AltContact_NameMenuIcon");
				    return this;
			}
public MedicalDetailsPage clickISO(WebDriver driver)  {
					BrowserActions.click(driver, btnISO,"ISO");
				    return this;
			}
public MedicalDetailsPage clickExaminationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnExaminationDateDateIcon,"ExaminationDateDateIcon");
				    return this;
			}
public MedicalDetailsPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public MedicalDetailsPage enterDue(WebDriver driver,String Due) {
		            BrowserActions.type(driver, inpDue,Due, "Due");
			        return this;
           }
public MedicalDetailsPage clickNewLegal_32(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_32,"NewLegal_32");
				    return this;
			}
public MedicalDetailsPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public MedicalDetailsPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public MedicalDetailsPage selectDoctor(WebDriver driver,String Doctor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDoctor,Doctor,"Doctor");
				    return this;
			}
public MedicalDetailsPage clickDateinsurersentMPNnoticeDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateinsurersentMPNnoticeDateIcon,"DateinsurersentMPNnoticeDateIcon");
				    return this;
			}
public MedicalDetailsPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public MedicalDetailsPage enterAdjuster(WebDriver driver,String Adjuster) {
		            BrowserActions.type(driver, inpAdjuster,Adjuster, "Adjuster");
			        return this;
           }
public MedicalDetailsPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public MedicalDetailsPage enterDateMMIwasreached(WebDriver driver,String DateMMIwasreached) {
		            BrowserActions.type(driver, inpDateMMIwasreached,DateMMIwasreached, "DateMMIwasreached");
			        return this;
           }
public MedicalDetailsPage clickAdd_39(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_39,"Add_39");
				    return this;
			}
public MedicalDetailsPage selectCreatedVia(WebDriver driver,String CreatedVia)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCreatedVia,CreatedVia,"CreatedVia");
				    return this;
			}
public MedicalDetailsPage selectTreatmentType(WebDriver driver,String TreatmentType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTreatmentType,TreatmentType,"TreatmentType");
				    return this;
			}
public MedicalDetailsPage clickMedicalCareOrganization_29(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_29,"MedicalCareOrganization_29");
				    return this;
			}
public MedicalDetailsPage clickAutoTowingAgency_27(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_27,"AutoTowingAgency_27");
				    return this;
			}
public MedicalDetailsPage clickMedicalCaseMgmt(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCaseMgmt,"MedicalCaseMgmt");
				    return this;
			}
public MedicalDetailsPage enterCreateDate(WebDriver driver,String CreateDate) {
		            BrowserActions.type(driver, inpCreateDate,CreateDate, "CreateDate");
			        return this;
           }
public MedicalDetailsPage clickLawFirm_35(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_35,"LawFirm_35");
				    return this;
			}
public MedicalDetailsPage clickAdd_41(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_41,"Add_41");
				    return this;
			}
public MedicalDetailsPage enterLastresponsefromISO(WebDriver driver,String LastresponsefromISO) {
		            BrowserActions.type(driver, inpLastresponsefromISO,LastresponsefromISO, "LastresponsefromISO");
			        return this;
           }
public MedicalDetailsPage clickAdd_45(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_45,"Add_45");
				    return this;
			}
public MedicalDetailsPage selectAreaofBody(WebDriver driver,String AreaofBody)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAreaofBody,AreaofBody,"AreaofBody");
				    return this;
			}
public MedicalDetailsPage clickAdd_43(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_43,"Add_43");
				    return this;
			}
public MedicalDetailsPage clickSearch_22(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_22,"Search_22");
				    return this;
			}
public MedicalDetailsPage clickAdd_47(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_47,"Add_47");
				    return this;
			}
public MedicalDetailsPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public MedicalDetailsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public MedicalDetailsPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public MedicalDetailsPage clickDateinjuredworkerjoinedMPNDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateinjuredworkerjoinedMPNDateIcon,"DateinjuredworkerjoinedMPNDateIcon");
				    return this;
			}
public MedicalDetailsPage clickAutoTowingAgency_12(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_12,"AutoTowingAgency_12");
				    return this;
			}
public MedicalDetailsPage clickRefreshResponses(WebDriver driver)  {
					BrowserActions.click(driver, btnRefreshResponses,"RefreshResponses");
				    return this;
			}
public MedicalDetailsPage clickMedicalCareOrganization_14(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_14,"MedicalCareOrganization_14");
				    return this;
			}
public MedicalDetailsPage clickDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDetails,"Details");
				    return this;
			}
public MedicalDetailsPage clickDidDoctorTreatPatientBefore(WebDriver driver)  {
					BrowserActions.click(driver, rdbDidDoctorTreatPatientBefore,"DidDoctorTreatPatientBefore");
				    return this;
			}
public MedicalDetailsPage enterExaminationDate(WebDriver driver,String ExaminationDate) {
		            BrowserActions.type(driver, inpExaminationDate,ExaminationDate, "ExaminationDate");
			        return this;
           }
public MedicalDetailsPage clickPreexistingDisability(WebDriver driver)  {
					BrowserActions.click(driver, rdbPreexistingDisability,"PreexistingDisability");
				    return this;
			}
public MedicalDetailsPage clickLawFirm_20(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_20,"LawFirm_20");
				    return this;
			}
public MedicalDetailsPage enterSettlementDate(WebDriver driver,String SettlementDate) {
		            BrowserActions.type(driver, inpSettlementDate,SettlementDate, "SettlementDate");
			        return this;
           }
public MedicalDetailsPage selectSegment(WebDriver driver,String Segment)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSegment,Segment,"Segment");
				    return this;
			}
public MedicalDetailsPage clickNewPerson_24(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_24,"NewPerson_24");
				    return this;
			}
public MedicalDetailsPage enterComments(WebDriver driver,String Comments) {
		            BrowserActions.type(driver, inpComments,Comments, "Comments");
			        return this;
           }
public MedicalDetailsPage clickAutobodyRepairShop_26(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_26,"AutobodyRepairShop_26");
				    return this;
			}
public MedicalDetailsPage clickDueDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon,"DueDateIcon");
				    return this;
			}
public MedicalDetailsPage clickNewCompany_16(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_16,"NewCompany_16");
				    return this;
			}
public MedicalDetailsPage clickSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnSummary,"Summary");
				    return this;
			}
public MedicalDetailsPage clickHospital_HospitalMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnHospital_HospitalMenuIcon,"Hospital_HospitalMenuIcon");
				    return this;
			}
public MedicalDetailsPage enterOrder(WebDriver driver,String Order) {
		            BrowserActions.type(driver, inpOrder,Order, "Order");
			        return this;
           }
public MedicalDetailsPage enterClassification(WebDriver driver,String Classification) {
		            BrowserActions.type(driver, inpClassification,Classification, "Classification");
			        return this;
           }
public MedicalDetailsPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public MedicalDetailsPage enterAssignedTo_8(WebDriver driver,String AssignedTo_8) {
		            BrowserActions.type(driver, inpAssignedTo_8,AssignedTo_8, "AssignedTo_8");
			        return this;
           }
public MedicalDetailsPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public MedicalDetailsPage clickClaim_NurseCaseManagerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnClaim_NurseCaseManagerMenuIcon,"Claim_NurseCaseManagerMenuIcon");
				    return this;
			}
public MedicalDetailsPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public MedicalDetailsPage clickDecisionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDecisionDateDateIcon,"DecisionDateDateIcon");
				    return this;
			}
public MedicalDetailsPage clickDatesenttoISODateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDatesenttoISODateIcon,"DatesenttoISODateIcon");
				    return this;
			}
public MedicalDetailsPage enterInjuryDescription(WebDriver driver,String InjuryDescription) {
		            BrowserActions.type(driver, inpInjuryDescription,InjuryDescription, "InjuryDescription");
			        return this;
           }
public MedicalDetailsPage clickSendToISO(WebDriver driver)  {
					BrowserActions.click(driver, btnSendToISO,"SendToISO");
				    return this;
			}
public MedicalDetailsPage clickSearch_37(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_37,"Search_37");
				    return this;
			}
public MedicalDetailsPage verifyExposureCreated(WebDriver driver, String name)  {//Workers' Comp - med only
	String exposureName = BrowserActions.getText(driver, lblsegment,"Exposure type");
	Log.assertThat(exposureName.contains(name),"Exposure is created by "+name, "Exposure is not created by "+name);
	return this;
}
}
