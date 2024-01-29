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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class NewMatterPage extends LoadableComponent<NewMatterPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_66;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_52;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_38;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_64;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_7;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_60;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_72;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_41;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-Matter_AssignActivity']", AI = false)
	private WebElement drpOwner;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-Counsel_PlaintiffAttorneyMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_PlaintiffAttorneyMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-Counsel_DefenseAttorneyMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_DefenseAttorneyMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_67;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_40;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_51;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_18;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_23;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_20;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_3;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_8;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_61;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_17;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_56;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_43;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-DefendantMenuIcon>div[role='button']", AI = false)
	private WebElement btnDefendantMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_59;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_24;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_58;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_10;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_71;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_2;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_53;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-Plaintiff']", AI = false)
	private WebElement drpPlaintiff;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_57;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_45;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-Defendant']", AI = false)
	private WebElement drpDefendant;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_63;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-MatterType']", AI = false)
	private WebElement drpMatterType;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm']", AI = false)
	private WebElement drpPlaintiffLawFirm;

	@IFindBy(how = How.CSS, using = "input[name='NewMatter-NewMatterScreen-NewMatterDV-Matter_Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_25;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_9;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_32;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_42;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_74;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_30;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_39;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm']", AI = false)
	private WebElement drpDefenseLawFirm;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_21;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_48;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_15;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-Counsel_PlaintiffLawFirmMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_PlaintiffLawFirmMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Matter_AssignActivity-Matter_AssignActivity_PickerButton", AI = false)
	private WebElement btnMatter_AssignActivity_PickerButton;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_27;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_47;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_73;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_16;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_70;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_22;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_68;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_54;

	@IFindBy(how = How.CSS, using = "input[name='NewMatter-NewMatterScreen-NewMatterDV-TrialDetails_SubroRelated']", AI = false)
	private WebElement rdbRelatedtoSubrogation;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_65;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_19;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-Counsel_DefenseLawFirmMenuIcon>div[role='button']", AI = false)
	private WebElement btnCounsel_DefenseLawFirmMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney']", AI = false)
	private WebElement drpDefenseAttorney;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney']", AI = false)
	private WebElement drpPlaintiffAttorney;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_11;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_14;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_69;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_55;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_35;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_37;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_49;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_62;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-PlaintiffMenuIcon>div[role='button']", AI = false)
	private WebElement btnPlaintiffMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_12;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_26;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_31;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-TrialDetails_PrimaryCause']", AI = false)
	private WebElement drpPrimaryCause;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-CourtType']", AI = false)
	private WebElement drpCourtType;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_44;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_1;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_13;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_4;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_6;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_28;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_29;

	@IFindBy(how = How.CSS, using = "input[name='NewMatter-NewMatterScreen-NewMatterDV-Matter_CaseNumber']", AI = false)
	private WebElement inpCaseNumber;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-LegalSpecialty']", AI = false)
	private WebElement drpLegalSpecialty;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_34;

	@IFindBy(how = How.CSS, using = "select[name='NewMatter-NewMatterScreen-NewMatterDV-CourtDistrict']", AI = false)
	private WebElement drpCourtDistrict;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_36;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_50;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_5;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_46;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_75;

	@IFindBy(how = How.CSS, using = "#NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_33;

	public NewMatterPage(){
	}

	public NewMatterPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnUpdate))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public NewMatterPage clickMedicalCareOrganization_66(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_66,"MedicalCareOrganization_66");
				    return this;
			}
public NewMatterPage clickVendorCompany_52(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_52,"VendorCompany_52");
				    return this;
			}
public NewMatterPage clickNewCompany_38(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_38,"NewCompany_38");
				    return this;
			}
public NewMatterPage clickAutoTowingAgency_64(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_64,"AutoTowingAgency_64");
				    return this;
			}
public NewMatterPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public NewMatterPage clickVendorCompany_7(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_7,"VendorCompany_7");
				    return this;
			}
public NewMatterPage clickViewContactDetails_60(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_60,"ViewContactDetails_60");
				    return this;
			}
public NewMatterPage clickLawFirm_72(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_72,"LawFirm_72");
				    return this;
			}
public NewMatterPage clickAttorney_41(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_41,"Attorney_41");
				    return this;
			}
public NewMatterPage selectOwner(WebDriver driver,String Owner)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOwner,Owner,"Owner");
				    return this;
			}
public NewMatterPage clickCounsel_PlaintiffAttorneyMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_PlaintiffAttorneyMenuIcon,"Counsel_PlaintiffAttorneyMenuIcon");
				    return this;
			}
public NewMatterPage clickCounsel_DefenseAttorneyMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_DefenseAttorneyMenuIcon,"Counsel_DefenseAttorneyMenuIcon");
				    return this;
			}
public NewMatterPage clickVendorCompany_67(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_67,"VendorCompany_67");
				    return this;
			}
public NewMatterPage clickAdjudicator_40(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_40,"Adjudicator_40");
				    return this;
			}
public NewMatterPage clickMedicalCareOrganization_51(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_51,"MedicalCareOrganization_51");
				    return this;
			}
public NewMatterPage clickAutobodyRepairShop_18(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_18,"AutobodyRepairShop_18");
				    return this;
			}
public NewMatterPage clickNewCompany_23(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_23,"NewCompany_23");
				    return this;
			}
public NewMatterPage clickDoctor_20(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_20,"Doctor_20");
				    return this;
			}
public NewMatterPage clickAutobodyRepairShop_3(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_3,"AutobodyRepairShop_3");
				    return this;
			}
public NewMatterPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public NewMatterPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public NewMatterPage clickNewCompany_8(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_8,"NewCompany_8");
				    return this;
			}
public NewMatterPage clickNewPerson_61(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_61,"NewPerson_61");
				    return this;
			}
public NewMatterPage clickNewVendor_17(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_17,"NewVendor_17");
				    return this;
			}
public NewMatterPage clickAttorney_56(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_56,"Attorney_56");
				    return this;
			}
public NewMatterPage clickLegalVenue_43(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_43,"LegalVenue_43");
				    return this;
			}
public NewMatterPage clickDefendantMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDefendantMenuIcon,"DefendantMenuIcon");
				    return this;
			}
public NewMatterPage clickSearch_59(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_59,"Search_59");
				    return this;
			}
public NewMatterPage clickNewLegal_24(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_24,"NewLegal_24");
				    return this;
			}
public NewMatterPage clickLegalVenue_58(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_58,"LegalVenue_58");
				    return this;
			}
public NewMatterPage clickAdjudicator_10(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_10,"Adjudicator_10");
				    return this;
			}
public NewMatterPage clickAttorney_71(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_71,"Attorney_71");
				    return this;
			}
public NewMatterPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public NewMatterPage clickNewVendor_2(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_2,"NewVendor_2");
				    return this;
			}
public NewMatterPage clickNewCompany_53(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_53,"NewCompany_53");
				    return this;
			}
public NewMatterPage selectPlaintiff(WebDriver driver,String Plaintiff)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPlaintiff,Plaintiff,"Plaintiff");
				    return this;
			}
public NewMatterPage clickLawFirm_57(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_57,"LawFirm_57");
				    return this;
			}
public NewMatterPage clickViewContactDetails_45(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_45,"ViewContactDetails_45");
				    return this;
			}
public NewMatterPage selectDefendant(WebDriver driver,String Defendant)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefendant,Defendant,"Defendant");
				    return this;
			}
public NewMatterPage clickAutobodyRepairShop_63(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_63,"AutobodyRepairShop_63");
				    return this;
			}
public NewMatterPage selectMatterType(WebDriver driver,String MatterType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMatterType,MatterType,"MatterType");
				    return this;
			}
public NewMatterPage selectPlaintiffLawFirm(WebDriver driver,String PlaintiffLawFirm)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPlaintiffLawFirm,PlaintiffLawFirm,"PlaintiffLawFirm");
				    return this;
			}
public NewMatterPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
		            Log.messageStep("Entered New Mater Name as " +Name,DriverManager.getDriver());
			        return this;
           }
public NewMatterPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public NewMatterPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public NewMatterPage clickAdjudicator_25(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_25,"Adjudicator_25");
				    return this;
			}
public NewMatterPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public NewMatterPage clickNewLegal_9(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_9,"NewLegal_9");
				    return this;
			}
public NewMatterPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public NewMatterPage clickNewVendor_32(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_32,"NewVendor_32");
				    return this;
			}
public NewMatterPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public NewMatterPage clickLawFirm_42(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_42,"LawFirm_42");
				    return this;
			}
public NewMatterPage clickSearch_74(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_74,"Search_74");
				    return this;
			}
public NewMatterPage clickViewContactDetails_30(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_30,"ViewContactDetails_30");
				    return this;
			}
public NewMatterPage clickNewLegal_39(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_39,"NewLegal_39");
				    return this;
			}
public NewMatterPage selectDefenseLawFirm(WebDriver driver,String DefenseLawFirm)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefenseLawFirm,DefenseLawFirm,"DefenseLawFirm");
				    return this;
			}
public NewMatterPage clickMedicalCareOrganization_21(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_21,"MedicalCareOrganization_21");
				    return this;
			}
public NewMatterPage clickAutobodyRepairShop_48(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_48,"AutobodyRepairShop_48");
				    return this;
			}
public NewMatterPage clickViewContactDetails_15(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_15,"ViewContactDetails_15");
				    return this;
			}
public NewMatterPage clickCounsel_PlaintiffLawFirmMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_PlaintiffLawFirmMenuIcon,"Counsel_PlaintiffLawFirmMenuIcon");
				    return this;
			}
public NewMatterPage clickMatter_AssignActivity_PickerButton(WebDriver driver)  {
					BrowserActions.click(driver, btnMatter_AssignActivity_PickerButton,"Matter_AssignActivity_PickerButton");
				    return this;
			}
public NewMatterPage clickLawFirm_27(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_27,"LawFirm_27");
				    return this;
			}
public NewMatterPage clickNewVendor_47(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_47,"NewVendor_47");
				    return this;
			}
public NewMatterPage clickLegalVenue_73(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_73,"LegalVenue_73");
				    return this;
			}
public NewMatterPage clickNewPerson_16(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_16,"NewPerson_16");
				    return this;
			}
public NewMatterPage clickAdjudicator_70(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_70,"Adjudicator_70");
				    return this;
			}
public NewMatterPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public NewMatterPage clickVendorCompany_22(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_22,"VendorCompany_22");
				    return this;
			}
public NewMatterPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public NewMatterPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public NewMatterPage clickNewCompany_68(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_68,"NewCompany_68");
				    return this;
			}
public NewMatterPage clickNewLegal_54(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_54,"NewLegal_54");
				    return this;
			}
public NewMatterPage clickRelatedtoSubrogation(WebDriver driver)  {
					BrowserActions.click(driver, rdbRelatedtoSubrogation,"RelatedtoSubrogation");
				    return this;
			}
public NewMatterPage clickDoctor_65(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_65,"Doctor_65");
				    return this;
			}
public NewMatterPage clickAutoTowingAgency_19(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_19,"AutoTowingAgency_19");
				    return this;
			}
public NewMatterPage clickCounsel_DefenseLawFirmMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCounsel_DefenseLawFirmMenuIcon,"Counsel_DefenseLawFirmMenuIcon");
				    return this;
			}
public NewMatterPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public NewMatterPage selectDefenseAttorney(WebDriver driver,String DefenseAttorney)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefenseAttorney,DefenseAttorney,"DefenseAttorney");
				    return this;
			}
public NewMatterPage selectPlaintiffAttorney(WebDriver driver,String PlaintiffAttorney)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPlaintiffAttorney,PlaintiffAttorney,"PlaintiffAttorney");
				    return this;
			}
public NewMatterPage clickAttorney_11(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_11,"Attorney_11");
				    return this;
			}
public NewMatterPage clickSearch_14(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_14,"Search_14");
				    return this;
			}
public NewMatterPage clickNewLegal_69(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_69,"NewLegal_69");
				    return this;
			}
public NewMatterPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewMatterPage clickAdjudicator_55(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_55,"Adjudicator_55");
				    return this;
			}
public NewMatterNamePage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
					Log.messageStep("New Matter is Updated Successfully",DriverManager.getDriver());
				    return new NewMatterNamePage(driver).get();
			}
public NewMatterPage clickDoctor_35(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_35,"Doctor_35");
				    return this;
			}
public NewMatterPage clickVendorCompany_37(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_37,"VendorCompany_37");
				    return this;
			}
public NewMatterPage clickAutoTowingAgency_49(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_49,"AutoTowingAgency_49");
				    return this;
			}
public NewMatterPage clickNewVendor_62(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_62,"NewVendor_62");
				    return this;
			}
public NewMatterPage clickPlaintiffMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnPlaintiffMenuIcon,"PlaintiffMenuIcon");
				    return this;
			}
public NewMatterPage clickLawFirm_12(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_12,"LawFirm_12");
				    return this;
			}
public NewMatterPage clickAttorney_26(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_26,"Attorney_26");
				    return this;
			}
public NewMatterPage clickNewPerson_31(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_31,"NewPerson_31");
				    return this;
			}
public NewMatterPage selectPrimaryCause(WebDriver driver,String PrimaryCause)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryCause,PrimaryCause,"PrimaryCause");
				    return this;
			}
public NewMatterPage selectCourtType(WebDriver driver,String CourtType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCourtType,CourtType,"CourtType");
				    return this;
			}
public NewMatterPage clickSearch_44(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_44,"Search_44");
				    return this;
			}
public NewMatterPage clickNewPerson_1(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_1,"NewPerson_1");
				    return this;
			}
public NewMatterPage clickLegalVenue_13(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_13,"LegalVenue_13");
				    return this;
			}
public NewMatterPage clickAutoTowingAgency_4(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_4,"AutoTowingAgency_4");
				    return this;
			}
public NewMatterPage clickMedicalCareOrganization_6(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_6,"MedicalCareOrganization_6");
				    return this;
			}
public NewMatterPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public NewMatterPage clickLegalVenue_28(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_28,"LegalVenue_28");
				    return this;
			}
public NewMatterPage clickSearch_29(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_29,"Search_29");
				    return this;
			}
public NewMatterPage enterCaseNumber(WebDriver driver,String CaseNumber) {
		            BrowserActions.type(driver, inpCaseNumber,CaseNumber, "CaseNumber");
			        return this;
           }
public NewMatterPage selectLegalSpecialty(WebDriver driver,String LegalSpecialty)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLegalSpecialty,LegalSpecialty,"LegalSpecialty");
				    return this;
			}
public NewMatterPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public NewMatterPage clickAutoTowingAgency_34(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_34,"AutoTowingAgency_34");
				    return this;
			}
public NewMatterPage selectCourtDistrict(WebDriver driver,String CourtDistrict)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCourtDistrict,CourtDistrict,"CourtDistrict");
				    return this;
			}
public NewMatterPage clickMedicalCareOrganization_36(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_36,"MedicalCareOrganization_36");
				    return this;
			}
public NewMatterPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewMatterPage clickDoctor_50(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_50,"Doctor_50");
				    return this;
			}
public NewMatterPage clickDoctor_5(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_5,"Doctor_5");
				    return this;
			}
public NewMatterPage clickNewPerson_46(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_46,"NewPerson_46");
				    return this;
			}
public NewMatterPage clickViewContactDetails_75(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_75,"ViewContactDetails_75");
				    return this;
			}
public NewMatterPage clickAutobodyRepairShop_33(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_33,"AutobodyRepairShop_33");
				    return this;
			}
}
