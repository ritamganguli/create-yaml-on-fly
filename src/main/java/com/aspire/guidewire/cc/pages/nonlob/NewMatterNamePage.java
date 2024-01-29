package com.aspire.guidewire.cc.pages.nonlob;
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

public class NewMatterNamePage extends LoadableComponent<NewMatterNamePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public EditableMatterStatusLines editablematterstatuslinesTable;
//
//	public EditableBudgetLines editablebudgetlinesTable;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_192;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_66;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_52;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_137;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_125;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_38;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_64;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_84;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_144;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_ReopenedReason']", AI = false)
	private WebElement drpReasonReopened;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_95;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_7;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_60;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailPage_CalendarButton>div[role='button']", AI = false)
	private WebElement btnMyCalendar;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue']", AI = false)
	private WebElement drpMediationVenue;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-HearingDetails_ArbitratorMenuIcon>div[role='button']", AI = false)
	private WebElement btnHearingDetails_ArbitratorMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_41;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_168;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_196;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-Counsel_DefenseAttorneyMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_DefenseAttorneyMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-BudgetLineCardDVTab", AI = false)
	private WebElement btnBudgetLines;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_67;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_40;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_122;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_184;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_99;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_51;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_Resolution']", AI = false)
	private WebElement drpResolution;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-BudgetLinesLV-EditableBudgetLinesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_216;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_180;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_23;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_163;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_SecAttorney-EditableSecondaryAttorneyLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_214;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_92;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-TrialDetails_VenueMenuIcon>div[role='button']", AI = false)
	private WebElement btnTrialDetails_VenueMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_110;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator']", AI = false)
	private WebElement drpArbitrator;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_195;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ResponseFiled']", AI = false)
	private WebElement inpResponseFiled;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Room']", AI = false)
	private WebElement inpHearingRoom;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_132;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_93;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_136;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_56;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-DefendantMenuIcon>div[role='button']", AI = false)
	private WebElement btnDefendantMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_152;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_10;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_71;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Room']", AI = false)
	private WebElement inpRoom_182;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue']", AI = false)
	private WebElement drpArbitrationVenue;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_199;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_2;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_53;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_202;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_133;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_80;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_101;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_129;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_166;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_206;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_45;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-BudgetLinesLV-EditableBudgetLinesLV_tb-AddAllBudgetLines>div[role='button']", AI = false)
	private WebElement btnAddalllines;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant']", AI = false)
	private WebElement drpDefendant;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_63;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_109;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_FinalSettleDate_dateIcon", AI = false)
	private WebElement btnFinalSettlementDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_78;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ArbitrationDetails_ArbitratorMenuIcon>div[role='button']", AI = false)
	private WebElement btnArbitrationDetails_ArbitratorMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_148;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_82;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_25;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_79;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_113;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_116;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FilingDate_dateIcon", AI = false)
	private WebElement btnFilingDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-AssignedUser_Name']", AI = false)
	private WebElement inpOwner;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_151;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_81;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_165;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_30;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue']", AI = false)
	private WebElement drpTrialVenue;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_15;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_117;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_112;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_169;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_188;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_201;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_191;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_208;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ResponseDue']", AI = false)
	private WebElement inpResponseDue;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_MediationDate']", AI = false)
	private WebElement inpMediationDate;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator']", AI = false)
	private WebElement drpMediator;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ServiceDate_dateIcon", AI = false)
	private WebElement btnServiceDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_TrialDate']", AI = false)
	private WebElement inpArbitrationDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_141;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_105;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MatterGeneral_Status-EditableMatterStatusLinesLV-0-CompletionDate']", AI = false)
	private WebElement inpCompletionDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_70;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_22;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_85;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_68;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_94;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_96;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_167;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ResponseFiled_dateIcon", AI = false)
	private WebElement btnResponseFiledDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_174;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_146;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_SentToDefenseDate']", AI = false)
	private WebElement inpSentToDefenseDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_156;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_MediationDate_dateIcon", AI = false)
	private WebElement btnMediationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_175;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_212;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney']", AI = false)
	private WebElement drpDefenseAttorney;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MatterGeneral_Status-EditableMatterStatusLinesLV-0-CompletionDate_dateIcon", AI = false)
	private WebElement btnCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney']", AI = false)
	private WebElement drpPlaintiffAttorney;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_185;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_11;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_198;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_55;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_HearingDate_dateIcon", AI = false)
	private WebElement btnHearingDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_98;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_126;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_37;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_176;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseApptDate']", AI = false)
	private WebElement inpDefenseAppointedDate;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-AssignedGroup_Name']", AI = false)
	private WebElement inpGroup;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-PlaintiffMenuIcon>div[role='button']", AI = false)
	private WebElement btnPlaintiffMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_120;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_26;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_103;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_209;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MatterGeneral_Status-EditableMatterStatusLinesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_1;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_13;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_102;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-AdDamnumSpecified']", AI = false)
	private WebElement rdbAdDamnum;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_28;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_161;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_154;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_CaseNumber']", AI = false)
	private WebElement inpCaseNumber;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_TrialDate_dateIcon", AI = false)
	private WebElement btnTrialDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_172;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_183;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_83;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-CourtDistrict']", AI = false)
	private WebElement drpCourtDistrict;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_159;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_CloseDate']", AI = false)
	private WebElement inpCloseDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailPage_SupervisorCalendarButton>div[role='button']", AI = false)
	private WebElement btnSupervisorCalendar;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_5;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_87;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_210;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailPage_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_204;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_TrialDate_dateIcon", AI = false)
	private WebElement btnArbitrationDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Room']", AI = false)
	private WebElement inpRoom_121;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_158;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_142;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_124;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_187;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Room']", AI = false)
	private WebElement inpRoom;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_119;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_72;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-MediationDetails_MediatorMenuIcon>div[role='button']", AI = false)
	private WebElement btnMediationDetails_MediatorMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue']", AI = false)
	private WebElement drpHearingVenue;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_145;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-Counsel_PlaintiffAttorneyMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_PlaintiffAttorneyMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_143;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_157;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_18;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_100;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_CloseDate_dateIcon", AI = false)
	private WebElement btnCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_139;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_20;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_3;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_130;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy']", AI = false)
	private WebElement drpFiledBy;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_104;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_MatterType']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ArbitrationDetails_VenueMenuIcon>div[role='button']", AI = false)
	private WebElement btnArbitrationDetails_VenueMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_8;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_61;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_17;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_118;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_TrialDate']", AI = false)
	private WebElement inpTrialDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_43;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_59;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_24;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_58;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MatterGeneral_Status-EditableMatterStatusLinesLV-0-StartDate']", AI = false)
	private WebElement inpStartDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_108;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-DocketNumber']", AI = false)
	private WebElement inpDocketNumber;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_186;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseApptDate_dateIcon", AI = false)
	private WebElement btnDefenseAppointedDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-TrialDetails_FiledByMenuIcon>div[role='button']", AI = false)
	private WebElement btnTrialDetails_FiledByMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_131;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff']", AI = false)
	private WebElement drpPlaintiff;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_57;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_76;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_160;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_149;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_89;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_107;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_127;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_211;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm']", AI = false)
	private WebElement drpPlaintiffLawFirm;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_190;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_SentToDefenseDate_dateIcon", AI = false)
	private WebElement btnSentToDefenseDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_123;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_91;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_9;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_170;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-PunitiveDamages']", AI = false)
	private WebElement rdbPunitiveDamages;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MatterGeneral_Status-EditableMatterStatusLinesLV-0-Status']", AI = false)
	private WebElement drpMatterStatus;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge']", AI = false)
	private WebElement drpJudge;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_32;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-MediationDetails_VenueMenuIcon>div[role='button']", AI = false)
	private WebElement btnMediationDetails_VenueMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_134;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_115;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MatterGeneral_Status-EditableMatterStatusLinesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ServiceDate']", AI = false)
	private WebElement inpServiceDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_42;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_74;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_171;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_193;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_128;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_HearingDate']", AI = false)
	private WebElement inpHearingDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_39;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm']", AI = false)
	private WebElement drpDefenseLawFirm;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_200;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_21;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_48;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_97;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MatterGeneral_Status-EditableMatterStatusLinesLV-0-StartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_194;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-Counsel_PlaintiffLawFirmMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_PlaintiffLawFirmMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_181;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_27;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_164;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_162;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_47;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_86;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_150;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator']", AI = false)
	private WebElement drpHearingJudge;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_73;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-BudgetLinesLV-EditableBudgetLinesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_215;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_16;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_SecAttorney-EditableSecondaryAttorneyLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_213;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_155;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_189;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_54;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_111;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_SubroRelated']", AI = false)
	private WebElement rdbRelatedtoSubrogation;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_65;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-HearingDetails_VenueMenuIcon>div[role='button']", AI = false)
	private WebElement btnHearingDetails_VenueMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_177;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_19;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-Counsel_DefenseLawFirmMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_DefenseLawFirmMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailCardDVTab", AI = false)
	private WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_90;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_138;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MethodServed']", AI = false)
	private WebElement drpMethodServed;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_14;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_88;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_69;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_203;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Arbitrator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_153;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_140;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_35;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_173;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_49;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_62;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_178;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailPage_CloseMatterButton>div[role='button']", AI = false)
	private WebElement btnCloseMatter;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Arbitrator-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_135;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_205;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FiledBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_207;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_12;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_31;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_PrimaryCause2']", AI = false)
	private WebElement drpPrimaryCause;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_147;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-CourtType']", AI = false)
	private WebElement drpCourtType;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_44;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_4;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_6;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Matter_FinalSettleDate']", AI = false)
	private WebElement inpFinalSettlementDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffAttorney-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_29;

	@IFindBy(how = How.CSS, using = "select[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-LegalSpecialty']", AI = false)
	private WebElement drpLegalSpecialty;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "input[name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_FilingDate']", AI = false)
	private WebElement inpFilingDate;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_34;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_36;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ResponseDue_dateIcon", AI = false)
	private WebElement btnResponseDueDateIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailPage_ReopenMatterButton>div[role='button']", AI = false)
	private WebElement btnReopenMatter;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Mediator-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_197;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_50;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_77;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_179;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-TrialDetails_Judge-TrialDetails_JudgeMenuIcon>div[role='button']", AI = false)
	private WebElement btnTrialDetails_JudgeMenuIcon;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_106;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_Venue-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_114;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_46;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_DefenseLawFirm-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_75;

	@IFindBy(how = How.CSS, using = "#MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_33;
	
	@IFindBy(how = How.CSS, using = "div[id='MatterDetailPage-MatterDetailPage_UpLink']", AI = false)
	private WebElement btnUptoLitigation;

	public NewMatterNamePage(){
	}

	public NewMatterNamePage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		editablematterstatuslinesTable = new EditableMatterStatusLines();
//		editablebudgetlinesTable = new EditableBudgetLines();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver,lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public NewMatterNamePage clickAdjudicator_192(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_192,"Adjudicator_192");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_66(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_66,"MedicalCareOrganization_66");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_52(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_52,"VendorCompany_52");
				    return this;
			}
public NewMatterNamePage clickNewPerson_137(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_137,"NewPerson_137");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_125(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_125,"AutoTowingAgency_125");
				    return this;
			}
public NewMatterNamePage clickNewCompany_38(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_38,"NewCompany_38");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_64(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_64,"AutoTowingAgency_64");
				    return this;
			}
public NewMatterNamePage clickNewLegal_84(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_84,"NewLegal_84");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public NewMatterNamePage clickNewCompany_144(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_144,"NewCompany_144");
				    return this;
			}
public NewMatterNamePage selectReasonReopened(WebDriver driver,String ReasonReopened)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReasonReopened,ReasonReopened,"ReasonReopened");
				    return this;
			}
public NewMatterNamePage clickDoctor_95(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_95,"Doctor_95");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_7(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_7,"VendorCompany_7");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_60(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_60,"ViewContactDetails_60");
				    return this;
			}
public NewMatterNamePage clickMyCalendar(WebDriver driver)  {
					BrowserActions.click(driver, btnMyCalendar,"MyCalendar");
				    return this;
			}
public NewMatterNamePage selectMediationVenue(WebDriver driver,String MediationVenue)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMediationVenue,MediationVenue,"MediationVenue");
				    return this;
			}
public NewMatterNamePage clickHearingDetails_ArbitratorMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnHearingDetails_ArbitratorMenuIcon,"HearingDetails_ArbitratorMenuIcon");
				    return this;
			}
public NewMatterNamePage clickAttorney_41(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_41,"Attorney_41");
				    return this;
			}
public NewMatterNamePage clickNewVendor_168(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_168,"NewVendor_168");
				    return this;
			}
public NewMatterNamePage clickSearch_196(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_196,"Search_196");
				    return this;
			}
public NewMatterNamePage clickCounsel_DefenseAttorneyMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_DefenseAttorneyMenuIcon,"Counsel_DefenseAttorneyMenuIcon");
				    return this;
			}
public NewMatterNamePage clickBudgetLines(WebDriver driver)  {
					BrowserActions.click(driver, btnBudgetLines,"BudgetLines");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_67(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_67,"VendorCompany_67");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_40(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_40,"Adjudicator_40");
				    return this;
			}
public NewMatterNamePage clickNewPerson_122(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_122,"NewPerson_122");
				    return this;
			}
public NewMatterNamePage clickNewVendor_184(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_184,"NewVendor_184");
				    return this;
			}
public NewMatterNamePage clickNewLegal_99(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_99,"NewLegal_99");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_51(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_51,"MedicalCareOrganization_51");
				    return this;
			}
public NewMatterNamePage selectResolution(WebDriver driver,String Resolution)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpResolution,Resolution,"Resolution");
				    return this;
			}
public NewMatterNamePage clickRemove_216(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_216,"Remove_216");
				    return this;
			}
public NewMatterNamePage clickSearch_180(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_180,"Search_180");
				    return this;
			}
public NewMatterNamePage clickNewCompany_23(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_23,"NewCompany_23");
				    return this;
			}
public NewMatterNamePage clickLawFirm_163(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_163,"LawFirm_163");
				    return this;
			}
public NewMatterNamePage clickRemove_214(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_214,"Remove_214");
				    return this;
			}
public NewMatterNamePage clickNewVendor_92(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_92,"NewVendor_92");
				    return this;
			}
public NewMatterNamePage clickTrialDetails_VenueMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTrialDetails_VenueMenuIcon,"TrialDetails_VenueMenuIcon");
				    return this;
			}
public NewMatterNamePage clickDoctor_110(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_110,"Doctor_110");
				    return this;
			}
public NewMatterNamePage selectArbitrator(WebDriver driver,String Arbitrator)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpArbitrator,Arbitrator,"Arbitrator");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_195(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_195,"LegalVenue_195");
				    return this;
			}
public NewMatterNamePage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public NewMatterNamePage enterResponseFiled(WebDriver driver,String ResponseFiled) {
		            BrowserActions.type(driver, inpResponseFiled,ResponseFiled, "ResponseFiled");
			        return this;
           }
public NewMatterNamePage enterHearingRoom(WebDriver driver,String HearingRoom) {
		            BrowserActions.type(driver, inpHearingRoom,HearingRoom, "HearingRoom");
			        return this;
           }
public NewMatterNamePage clickAttorney_132(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_132,"Attorney_132");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_93(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_93,"AutobodyRepairShop_93");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_136(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_136,"ViewContactDetails_136");
				    return this;
			}
public NewMatterNamePage clickAttorney_56(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_56,"Attorney_56");
				    return this;
			}
public NewMatterNamePage clickDefendantMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDefendantMenuIcon,"DefendantMenuIcon");
				    return this;
			}
public NewMatterNamePage clickNewPerson_152(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_152,"NewPerson_152");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_10(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_10,"Adjudicator_10");
				    return this;
			}
public NewMatterNamePage clickAttorney_71(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_71,"Attorney_71");
				    return this;
			}
public NewMatterNamePage enterRoom_182(WebDriver driver,String Room_182) {
		            BrowserActions.type(driver, inpRoom_182,Room_182, "Room_182");
			        return this;
           }
public NewMatterNamePage selectArbitrationVenue(WebDriver driver,String ArbitrationVenue)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpArbitrationVenue,ArbitrationVenue,"ArbitrationVenue");
				    return this;
			}
public NewMatterNamePage clickNewVendor_199(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_199,"NewVendor_199");
				    return this;
			}
public NewMatterNamePage clickNewVendor_2(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_2,"NewVendor_2");
				    return this;
			}
public NewMatterNamePage clickNewCompany_53(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_53,"NewCompany_53");
				    return this;
			}
public NewMatterNamePage clickDoctor_202(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_202,"Doctor_202");
				    return this;
			}
public NewMatterNamePage clickLawFirm_133(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_133,"LawFirm_133");
				    return this;
			}
public NewMatterNamePage clickDoctor_80(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_80,"Doctor_80");
				    return this;
			}
public NewMatterNamePage clickAttorney_101(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_101,"Attorney_101");
				    return this;
			}
public NewMatterNamePage clickNewCompany_129(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_129,"NewCompany_129");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_166(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_166,"ViewContactDetails_166");
				    return this;
			}
public NewMatterNamePage clickNewLegal_206(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_206,"NewLegal_206");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_45(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_45,"ViewContactDetails_45");
				    return this;
			}
public NewMatterNamePage clickAddalllines(WebDriver driver)  {
					BrowserActions.click(driver, btnAddalllines,"Addalllines");
				    return this;
			}
public NewMatterNamePage selectDefendant(WebDriver driver,String Defendant)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefendant,Defendant,"Defendant");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_63(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_63,"AutobodyRepairShop_63");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_109(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_109,"AutoTowingAgency_109");
				    return this;
			}
public NewMatterNamePage clickFinalSettlementDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFinalSettlementDateDateIcon,"FinalSettlementDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_78(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_78,"AutobodyRepairShop_78");
				    return this;
			}
public NewMatterNamePage clickArbitrationDetails_ArbitratorMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnArbitrationDetails_ArbitratorMenuIcon,"ArbitrationDetails_ArbitratorMenuIcon");
				    return this;
			}
public NewMatterNamePage clickLawFirm_148(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_148,"LawFirm_148");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_82(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_82,"VendorCompany_82");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_25(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_25,"Adjudicator_25");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_79(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_79,"AutoTowingAgency_79");
				    return this;
			}
public NewMatterNamePage clickNewCompany_113(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_113,"NewCompany_113");
				    return this;
			}
public NewMatterNamePage clickAttorney_116(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_116,"Attorney_116");
				    return this;
			}
public NewMatterNamePage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public NewMatterNamePage clickFilingDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFilingDateDateIcon,"FilingDateDateIcon");
				    return this;
			}
public NewMatterNamePage enterOwner(WebDriver driver,String Owner) {
		            BrowserActions.type(driver, inpOwner,Owner, "Owner");
			        return this;
           }
public NewMatterNamePage clickViewContactDetails_151(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_151,"ViewContactDetails_151");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_81(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_81,"MedicalCareOrganization_81");
				    return this;
			}
public NewMatterNamePage clickSearch_165(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_165,"Search_165");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_30(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_30,"ViewContactDetails_30");
				    return this;
			}
public NewMatterNamePage selectTrialVenue(WebDriver driver,String TrialVenue)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTrialVenue,TrialVenue,"TrialVenue");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_15(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_15,"ViewContactDetails_15");
				    return this;
			}
public NewMatterNamePage clickLawFirm_117(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_117,"LawFirm_117");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_112(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_112,"VendorCompany_112");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_169(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_169,"AutobodyRepairShop_169");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_188(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_188,"MedicalCareOrganization_188");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_201(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_201,"AutoTowingAgency_201");
				    return this;
			}
public NewMatterNamePage clickNewLegal_191(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_191,"NewLegal_191");
				    return this;
			}
public NewMatterNamePage clickAttorney_208(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_208,"Attorney_208");
				    return this;
			}
public NewMatterNamePage enterResponseDue(WebDriver driver,String ResponseDue) {
		            BrowserActions.type(driver, inpResponseDue,ResponseDue, "ResponseDue");
			        return this;
           }
public NewMatterNamePage enterMediationDate(WebDriver driver,String MediationDate) {
		            BrowserActions.type(driver, inpMediationDate,MediationDate, "MediationDate");
			        return this;
           }
public NewMatterNamePage selectMediator(WebDriver driver,String Mediator)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMediator,Mediator,"Mediator");
				    return this;
			}
public NewMatterNamePage clickServiceDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnServiceDateDateIcon,"ServiceDateDateIcon");
				    return this;
			}
public NewMatterNamePage enterArbitrationDate(WebDriver driver,String ArbitrationDate) {
		            BrowserActions.type(driver, inpArbitrationDate,ArbitrationDate, "ArbitrationDate");
			        return this;
           }
public NewMatterNamePage clickDoctor_141(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_141,"Doctor_141");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_105(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_105,"ViewContactDetails_105");
				    return this;
			}
public NewMatterNamePage enterCompletionDate(WebDriver driver,String CompletionDate) {
		            BrowserActions.type(driver, inpCompletionDate,CompletionDate, "CompletionDate");
			        return this;
           }
public NewMatterNamePage clickAdjudicator_70(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_70,"Adjudicator_70");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_22(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_22,"VendorCompany_22");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_85(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_85,"Adjudicator_85");
				    return this;
			}
public NewMatterNamePage clickNewCompany_68(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_68,"NewCompany_68");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_94(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_94,"AutoTowingAgency_94");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_96(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_96,"MedicalCareOrganization_96");
				    return this;
			}
public NewMatterNamePage clickNewPerson_167(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_167,"NewPerson_167");
				    return this;
			}
public NewMatterNamePage clickResponseFiledDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnResponseFiledDateIcon,"ResponseFiledDateIcon");
				    return this;
			}
public NewMatterNamePage clickNewCompany_174(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_174,"NewCompany_174");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_146(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_146,"Adjudicator_146");
				    return this;
			}
public NewMatterNamePage enterSentToDefenseDate(WebDriver driver,String SentToDefenseDate) {
		            BrowserActions.type(driver, inpSentToDefenseDate,SentToDefenseDate, "SentToDefenseDate");
			        return this;
           }
public NewMatterNamePage clickDoctor_156(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_156,"Doctor_156");
				    return this;
			}
public NewMatterNamePage clickMediationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnMediationDateDateIcon,"MediationDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickNewLegal_175(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_175,"NewLegal_175");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_212(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_212,"ViewContactDetails_212");
				    return this;
			}
public NewMatterNamePage selectDefenseAttorney(WebDriver driver,String DefenseAttorney)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefenseAttorney,DefenseAttorney,"DefenseAttorney");
				    return this;
			}
public NewMatterNamePage clickCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCompletionDateDateIcon,"CompletionDateDateIcon");
				    return this;
			}
public NewMatterNamePage selectPlaintiffAttorney(WebDriver driver,String PlaintiffAttorney)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPlaintiffAttorney,PlaintiffAttorney,"PlaintiffAttorney");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_185(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_185,"AutobodyRepairShop_185");
				    return this;
			}
public NewMatterNamePage clickAttorney_11(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_11,"Attorney_11");
				    return this;
			}
public NewMatterNamePage clickNewPerson_198(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_198,"NewPerson_198");
				    return this;
			}
public NewMatterNamePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_55(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_55,"Adjudicator_55");
				    return this;
			}
public NewMatterNamePage clickHearingDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnHearingDateDateIcon,"HearingDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public NewMatterNamePage clickNewCompany_98(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_98,"NewCompany_98");
				    return this;
			}
public NewMatterNamePage clickDoctor_126(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_126,"Doctor_126");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_37(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_37,"VendorCompany_37");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_176(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_176,"Adjudicator_176");
				    return this;
			}
public NewMatterNamePage enterDefenseAppointedDate(WebDriver driver,String DefenseAppointedDate) {
		            BrowserActions.type(driver, inpDefenseAppointedDate,DefenseAppointedDate, "DefenseAppointedDate");
			        return this;
           }
public NewMatterNamePage enterGroup(WebDriver driver,String Group) {
		            BrowserActions.type(driver, inpGroup,Group, "Group");
			        return this;
           }
public NewMatterNamePage clickPlaintiffMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnPlaintiffMenuIcon,"PlaintiffMenuIcon");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_120(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_120,"ViewContactDetails_120");
				    return this;
			}
public NewMatterNamePage clickAttorney_26(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_26,"Attorney_26");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_103(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_103,"LegalVenue_103");
				    return this;
			}
public NewMatterNamePage clickLawFirm_209(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_209,"LawFirm_209");
				    return this;
			}
public NewMatterNamePage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public NewMatterNamePage clickNewPerson_1(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_1,"NewPerson_1");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_13(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_13,"LegalVenue_13");
				    return this;
			}
public NewMatterNamePage clickLawFirm_102(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_102,"LawFirm_102");
				    return this;
			}
public NewMatterNamePage clickAdDamnum(WebDriver driver)  {
					BrowserActions.click(driver, rdbAdDamnum,"AdDamnum");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_28(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_28,"LegalVenue_28");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_161(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_161,"Adjudicator_161");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_154(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_154,"AutobodyRepairShop_154");
				    return this;
			}
public NewMatterNamePage enterCaseNumber(WebDriver driver,String CaseNumber) {
		            BrowserActions.type(driver, inpCaseNumber,CaseNumber, "CaseNumber");
			        return this;
           }
public NewMatterNamePage clickTrialDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTrialDateDateIcon,"TrialDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_172(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_172,"MedicalCareOrganization_172");
				    return this;
			}
public NewMatterNamePage clickNewPerson_183(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_183,"NewPerson_183");
				    return this;
			}
public NewMatterNamePage clickNewCompany_83(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_83,"NewCompany_83");
				    return this;
			}
public NewMatterNamePage selectCourtDistrict(WebDriver driver,String CourtDistrict)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCourtDistrict,CourtDistrict,"CourtDistrict");
				    return this;
			}
public NewMatterNamePage clickNewCompany_159(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_159,"NewCompany_159");
				    return this;
			}
public NewMatterNamePage enterCloseDate(WebDriver driver,String CloseDate) {
		            BrowserActions.type(driver, inpCloseDate,CloseDate, "CloseDate");
			        return this;
           }
public NewMatterNamePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewMatterNamePage clickSupervisorCalendar(WebDriver driver)  {
					BrowserActions.click(driver, btnSupervisorCalendar,"SupervisorCalendar");
				    return this;
			}
public NewMatterNamePage clickDoctor_5(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_5,"Doctor_5");
				    return this;
			}
public NewMatterNamePage clickLawFirm_87(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_87,"LawFirm_87");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_210(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_210,"LegalVenue_210");
				    return this;
			}
public NewMatterNamePage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_204(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_204,"VendorCompany_204");
				    return this;
			}
public NewMatterNamePage clickArbitrationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnArbitrationDateDateIcon,"ArbitrationDateDateIcon");
				    return this;
			}
public NewMatterNamePage enterRoom_121(WebDriver driver,String Room_121) {
		            BrowserActions.type(driver, inpRoom_121,Room_121, "Room_121");
			        return this;
           }
public NewMatterNamePage clickVendorCompany_158(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_158,"VendorCompany_158");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_142(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_142,"MedicalCareOrganization_142");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_124(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_124,"AutobodyRepairShop_124");
				    return this;
			}
public NewMatterNamePage clickDoctor_187(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_187,"Doctor_187");
				    return this;
			}
public NewMatterNamePage enterRoom(WebDriver driver,String Room) {
		            BrowserActions.type(driver, inpRoom,Room, "Room");
			        return this;
           }
public NewMatterNamePage clickSearch_119(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_119,"Search_119");
				    return this;
			}
public NewMatterNamePage clickLawFirm_72(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_72,"LawFirm_72");
				    return this;
			}
public NewMatterNamePage clickMediationDetails_MediatorMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnMediationDetails_MediatorMenuIcon,"MediationDetails_MediatorMenuIcon");
				    return this;
			}
public NewMatterNamePage selectHearingVenue(WebDriver driver,String HearingVenue)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHearingVenue,HearingVenue,"HearingVenue");
				    return this;
			}
public NewMatterNamePage clickNewLegal_145(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_145,"NewLegal_145");
				    return this;
			}
public NewMatterNamePage clickCounsel_PlaintiffAttorneyMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_PlaintiffAttorneyMenuIcon,"Counsel_PlaintiffAttorneyMenuIcon");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_143(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_143,"VendorCompany_143");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_157(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_157,"MedicalCareOrganization_157");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_18(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_18,"AutobodyRepairShop_18");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_100(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_100,"Adjudicator_100");
				    return this;
			}
public NewMatterNamePage clickCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseDateDateIcon,"CloseDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_139(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_139,"AutobodyRepairShop_139");
				    return this;
			}
public NewMatterNamePage clickDoctor_20(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_20,"Doctor_20");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_3(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_3,"AutobodyRepairShop_3");
				    return this;
			}
public NewMatterNamePage clickNewLegal_130(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_130,"NewLegal_130");
				    return this;
			}
public NewMatterNamePage selectFiledBy(WebDriver driver,String FiledBy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFiledBy,FiledBy,"FiledBy");
				    return this;
			}
public NewMatterNamePage clickSearch_104(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_104,"Search_104");
				    return this;
			}
public NewMatterNamePage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public NewMatterNamePage clickArbitrationDetails_VenueMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnArbitrationDetails_VenueMenuIcon,"ArbitrationDetails_VenueMenuIcon");
				    return this;
			}
public NewMatterNamePage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public NewMatterNamePage clickNewCompany_8(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_8,"NewCompany_8");
				    return this;
			}
public NewMatterNamePage clickNewPerson_61(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_61,"NewPerson_61");
				    return this;
			}
public NewMatterNamePage clickNewVendor_17(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_17,"NewVendor_17");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_118(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_118,"LegalVenue_118");
				    return this;
			}
public NewMatterNamePage enterTrialDate(WebDriver driver,String TrialDate) {
		            BrowserActions.type(driver, inpTrialDate,TrialDate, "TrialDate");
			        return this;
           }
public NewMatterNamePage clickLegalVenue_43(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_43,"LegalVenue_43");
				    return this;
			}
public NewMatterNamePage clickSearch_59(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_59,"Search_59");
				    return this;
			}
public NewMatterNamePage clickNewLegal_24(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_24,"NewLegal_24");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_58(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_58,"LegalVenue_58");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public NewMatterNamePage enterStartDate(WebDriver driver,String StartDate) {
		            BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
			        return this;
           }
public NewMatterNamePage clickAutobodyRepairShop_108(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_108,"AutobodyRepairShop_108");
				    return this;
			}
public NewMatterNamePage enterDocketNumber(WebDriver driver,String DocketNumber) {
		            BrowserActions.type(driver, inpDocketNumber,DocketNumber, "DocketNumber");
			        return this;
           }
public NewMatterNamePage clickAutoTowingAgency_186(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_186,"AutoTowingAgency_186");
				    return this;
			}
public NewMatterNamePage clickDefenseAppointedDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDefenseAppointedDateDateIcon,"DefenseAppointedDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickTrialDetails_FiledByMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTrialDetails_FiledByMenuIcon,"TrialDetails_FiledByMenuIcon");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_131(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_131,"Adjudicator_131");
				    return this;
			}
public NewMatterNamePage selectPlaintiff(WebDriver driver,String Plaintiff)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPlaintiff,Plaintiff,"Plaintiff");
				    return this;
			}
public NewMatterNamePage clickLawFirm_57(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_57,"LawFirm_57");
				    return this;
			}
public NewMatterNamePage clickNewPerson_76(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_76,"NewPerson_76");
				    return this;
			}
public NewMatterNamePage clickNewLegal_160(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_160,"NewLegal_160");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_149(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_149,"LegalVenue_149");
				    return this;
			}
public NewMatterNamePage clickSearch_89(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_89,"Search_89");
				    return this;
			}
public NewMatterNamePage clickNewVendor_107(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_107,"NewVendor_107");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_127(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_127,"MedicalCareOrganization_127");
				    return this;
			}
public NewMatterNamePage clickSearch_211(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_211,"Search_211");
				    return this;
			}
public NewMatterNamePage selectPlaintiffLawFirm(WebDriver driver,String PlaintiffLawFirm)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPlaintiffLawFirm,PlaintiffLawFirm,"PlaintiffLawFirm");
				    return this;
			}
public NewMatterNamePage clickNewCompany_190(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_190,"NewCompany_190");
				    return this;
			}
public NewMatterNamePage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public NewMatterNamePage clickSentToDefenseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSentToDefenseDateDateIcon,"SentToDefenseDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public NewMatterNamePage clickNewVendor_123(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_123,"NewVendor_123");
				    return this;
			}
public NewMatterNamePage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public NewMatterNamePage clickNewPerson_91(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_91,"NewPerson_91");
				    return this;
			}
public NewMatterNamePage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public NewMatterNamePage clickNewLegal_9(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_9,"NewLegal_9");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_170(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_170,"AutoTowingAgency_170");
				    return this;
			}
public NewMatterNamePage clickPunitiveDamages(WebDriver driver)  {
					BrowserActions.click(driver, rdbPunitiveDamages,"PunitiveDamages");
				    return this;
			}
public NewMatterNamePage selectMatterStatus(WebDriver driver,String MatterStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMatterStatus,MatterStatus,"MatterStatus");
				    return this;
			}
public NewMatterNamePage selectJudge(WebDriver driver,String Judge)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJudge,Judge,"Judge");
				    return this;
			}
public NewMatterNamePage clickNewVendor_32(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_32,"NewVendor_32");
				    return this;
			}
public NewMatterNamePage clickMediationDetails_VenueMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnMediationDetails_VenueMenuIcon,"MediationDetails_VenueMenuIcon");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_134(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_134,"LegalVenue_134");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_115(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_115,"Adjudicator_115");
				    return this;
			}
public NewMatterNamePage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public NewMatterNamePage enterServiceDate(WebDriver driver,String ServiceDate) {
		            BrowserActions.type(driver, inpServiceDate,ServiceDate, "ServiceDate");
			        return this;
           }
public NewMatterNamePage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public NewMatterNamePage clickLawFirm_42(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_42,"LawFirm_42");
				    return this;
			}
public NewMatterNamePage clickSearch_74(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_74,"Search_74");
				    return this;
			}
public NewMatterNamePage clickDoctor_171(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_171,"Doctor_171");
				    return this;
			}
public NewMatterNamePage clickAttorney_193(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_193,"Attorney_193");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_128(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_128,"VendorCompany_128");
				    return this;
			}
public NewMatterNamePage enterHearingDate(WebDriver driver,String HearingDate) {
		            BrowserActions.type(driver, inpHearingDate,HearingDate, "HearingDate");
			        return this;
           }
public NewMatterNamePage clickNewLegal_39(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_39,"NewLegal_39");
				    return this;
			}
public NewMatterNamePage selectDefenseLawFirm(WebDriver driver,String DefenseLawFirm)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefenseLawFirm,DefenseLawFirm,"DefenseLawFirm");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_200(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_200,"AutobodyRepairShop_200");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_21(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_21,"MedicalCareOrganization_21");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_48(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_48,"AutobodyRepairShop_48");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_97(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_97,"VendorCompany_97");
				    return this;
			}
public NewMatterNamePage clickStartDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
				    return this;
			}
public NewMatterNamePage clickLawFirm_194(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_194,"LawFirm_194");
				    return this;
			}
public NewMatterNamePage clickCounsel_PlaintiffLawFirmMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_PlaintiffLawFirmMenuIcon,"Counsel_PlaintiffLawFirmMenuIcon");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_181(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_181,"ViewContactDetails_181");
				    return this;
			}
public NewMatterNamePage clickLawFirm_27(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_27,"LawFirm_27");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_164(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_164,"LegalVenue_164");
				    return this;
			}
public NewMatterNamePage clickAttorney_162(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_162,"Attorney_162");
				    return this;
			}
public NewMatterNamePage clickNewVendor_47(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_47,"NewVendor_47");
				    return this;
			}
public NewMatterNamePage clickAttorney_86(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_86,"Attorney_86");
				    return this;
			}
public NewMatterNamePage clickSearch_150(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_150,"Search_150");
				    return this;
			}
public NewMatterNamePage selectHearingJudge(WebDriver driver,String HearingJudge)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHearingJudge,HearingJudge,"HearingJudge");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_73(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_73,"LegalVenue_73");
				    return this;
			}
public NewMatterNamePage clickAdd_215(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_215,"Add_215");
				    return this;
			}
public NewMatterNamePage clickNewPerson_16(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_16,"NewPerson_16");
				    return this;
			}
public NewMatterNamePage clickAdd_213(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_213,"Add_213");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public NewMatterNamePage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public NewMatterNamePage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_155(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_155,"AutoTowingAgency_155");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_189(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_189,"VendorCompany_189");
				    return this;
			}
public NewMatterNamePage clickNewLegal_54(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_54,"NewLegal_54");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_111(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_111,"MedicalCareOrganization_111");
				    return this;
			}
public NewMatterNamePage clickRelatedtoSubrogation(WebDriver driver)  {
					BrowserActions.click(driver, rdbRelatedtoSubrogation,"RelatedtoSubrogation");
				    return this;
			}
public NewMatterNamePage clickDoctor_65(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_65,"Doctor_65");
				    return this;
			}
public NewMatterNamePage clickHearingDetails_VenueMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnHearingDetails_VenueMenuIcon,"HearingDetails_VenueMenuIcon");
				    return this;
			}
public NewMatterNamePage clickAttorney_177(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_177,"Attorney_177");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_19(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_19,"AutoTowingAgency_19");
				    return this;
			}
public NewMatterNamePage clickCounsel_DefenseLawFirmMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_DefenseLawFirmMenuIcon,"Counsel_DefenseLawFirmMenuIcon");
				    return this;
			}
public NewMatterNamePage clickDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDetails,"Details");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_90(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_90,"ViewContactDetails_90");
				    return this;
			}
public NewMatterNamePage clickNewVendor_138(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_138,"NewVendor_138");
				    return this;
			}
public NewMatterNamePage selectMethodServed(WebDriver driver,String MethodServed)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMethodServed,MethodServed,"MethodServed");
				    return this;
			}
public NewMatterNamePage clickSearch_14(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_14,"Search_14");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_88(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_88,"LegalVenue_88");
				    return this;
			}
public NewMatterNamePage clickNewLegal_69(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_69,"NewLegal_69");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_203(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_203,"MedicalCareOrganization_203");
				    return this;
			}
public NewMatterNamePage clickNewVendor_153(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_153,"NewVendor_153");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_140(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_140,"AutoTowingAgency_140");
				    return this;
			}
public NewMatterNamePage clickDoctor_35(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_35,"Doctor_35");
				    return this;
			}
public NewMatterNamePage clickVendorCompany_173(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_173,"VendorCompany_173");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_49(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_49,"AutoTowingAgency_49");
				    return this;
			}
public NewMatterNamePage clickNewVendor_62(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_62,"NewVendor_62");
				    return this;
			}
public NewMatterNamePage clickLawFirm_178(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_178,"LawFirm_178");
				    return this;
			}
public NewMatterNamePage clickCloseMatter(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseMatter,"CloseMatter");
				    return this;
			}
public NewMatterNamePage clickSearch_135(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_135,"Search_135");
				    return this;
			}
public NewMatterNamePage clickNewCompany_205(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_205,"NewCompany_205");
				    return this;
			}
public NewMatterNamePage clickAdjudicator_207(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_207,"Adjudicator_207");
				    return this;
			}
public NewMatterNamePage clickLawFirm_12(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_12,"LawFirm_12");
				    return this;
			}
public NewMatterNamePage clickNewPerson_31(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_31,"NewPerson_31");
				    return this;
			}
public NewMatterNamePage selectPrimaryCause(WebDriver driver,String PrimaryCause)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryCause,PrimaryCause,"PrimaryCause");
				    return this;
			}
public NewMatterNamePage clickAttorney_147(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_147,"Attorney_147");
				    return this;
			}
public NewMatterNamePage selectCourtType(WebDriver driver,String CourtType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCourtType,CourtType,"CourtType");
				    return this;
			}
public NewMatterNamePage clickSearch_44(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_44,"Search_44");
				    return this;
			}
public NewMatterNamePage clickAutoTowingAgency_4(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_4,"AutoTowingAgency_4");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_6(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_6,"MedicalCareOrganization_6");
				    return this;
			}
public NewMatterNamePage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public NewMatterNamePage enterFinalSettlementDate(WebDriver driver,String FinalSettlementDate) {
		            BrowserActions.type(driver, inpFinalSettlementDate,FinalSettlementDate, "FinalSettlementDate");
			        return this;
           }
public NewMatterNamePage clickSearch_29(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_29,"Search_29");
				    return this;
			}
public NewMatterNamePage selectLegalSpecialty(WebDriver driver,String LegalSpecialty)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLegalSpecialty,LegalSpecialty,"LegalSpecialty");
				    return this;
			}
public NewMatterNamePage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public NewMatterNamePage enterFilingDate(WebDriver driver,String FilingDate) {
		            BrowserActions.type(driver, inpFilingDate,FilingDate, "FilingDate");
			        return this;
           }
public NewMatterNamePage clickAutoTowingAgency_34(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_34,"AutoTowingAgency_34");
				    return this;
			}
public NewMatterNamePage clickMedicalCareOrganization_36(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_36,"MedicalCareOrganization_36");
				    return this;
			}
public NewMatterNamePage clickResponseDueDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnResponseDueDateIcon,"ResponseDueDateIcon");
				    return this;
			}
public NewMatterNamePage clickReopenMatter(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenMatter,"ReopenMatter");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_197(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_197,"ViewContactDetails_197");
				    return this;
			}
public NewMatterNamePage clickDoctor_50(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_50,"Doctor_50");
				    return this;
			}
public NewMatterNamePage clickNewVendor_77(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_77,"NewVendor_77");
				    return this;
			}
public NewMatterNamePage clickLegalVenue_179(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_179,"LegalVenue_179");
				    return this;
			}
public NewMatterNamePage clickTrialDetails_JudgeMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTrialDetails_JudgeMenuIcon,"TrialDetails_JudgeMenuIcon");
				    return this;
			}
public NewMatterNamePage clickNewPerson_106(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_106,"NewPerson_106");
				    return this;
			}
public NewMatterNamePage clickNewLegal_114(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_114,"NewLegal_114");
				    return this;
			}
public NewMatterNamePage clickNewPerson_46(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_46,"NewPerson_46");
				    return this;
			}
public NewMatterNamePage clickViewContactDetails_75(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_75,"ViewContactDetails_75");
				    return this;
			}
public NewMatterNamePage clickAutobodyRepairShop_33(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_33,"AutobodyRepairShop_33");
				    return this;
			}
public LitigationPage clickUpToLitigation(WebDriver driver)  {
	BrowserActions.click(driver, btnUptoLitigation,"Up To Litigation");
	return new LitigationPage(driver).get();
}
}
