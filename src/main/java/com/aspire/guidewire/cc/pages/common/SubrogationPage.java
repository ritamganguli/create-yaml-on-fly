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

public class SubrogationPage extends LoadableComponent<SubrogationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public EditableAdverseGeneral editableadversegeneralTable;
//
//	public SubrogationMainPanelSet subrogationmainpanelsetTable;

	@IFindBy(how = How.CSS, using = "select[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Notification_Fault']", AI = false)
	private WebElement drpFault;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubroReferralInfo-SubroReferralDate_dateIcon", AI = false)
	private WebElement btnReferralDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-TotalLabel']", AI = false)
	private WebElement inpTotalLabel;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationRecoveriesLV-TotalFooter']", AI = false)
	private WebElement inpTotalFooter;

	@IFindBy(how = How.CSS, using = "select[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Status']", AI = false)
	private WebElement drpSubrogationStatus;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-ProrateDeductible']", AI = false)
	private WebElement rdbProrateDeductible;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-LabelTopHeader']", AI = false)
	private WebElement inpLabelTopHeader;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubroReferralInfo-SubroReferralDate']", AI = false)
	private WebElement inpReferralDate;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationDocumentsLV_tb-RefreshAsyncContent>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationDocumentsLV_tb-CreateFromTemplate>div[role='button']", AI = false)
	private WebElement btnCreateFromTemplate;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubroReferralInfo-SubroReferralComment textarea", AI = false)
	private WebElement inpReferralComment;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-AdversePartyInfo-EditableAdverseGeneralLV-emptyLabel0']", AI = false)
	private WebElement inpEmptyLabel0;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-ExpectedRecoveryHeader']", AI = false)
	private WebElement inpExpectedRecoveryHeader;

	@IFindBy(how = How.CSS, using = "select[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Outcome']", AI = false)
	private WebElement drpOutcome;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-PaidHeader']", AI = false)
	private WebElement inpPaidHeader;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-WideNotesLV_tb-NewNoteButton>div[role='button']", AI = false)
	private WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-WideNotesLV_tb-EditButton>div[role='button']", AI = false)
	private WebElement btnEdit_6;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-ReferForSubrogation>div[role='button']", AI = false)
	private WebElement btnRefertoSubrogation;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-CloseDate_dateIcon", AI = false)
	private WebElement btnCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator']", AI = false)
	private WebElement drpExternalSubrogator;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-RecoveryHeader']", AI = false)
	private WebElement inpRecoveryHeader;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-StatuteLimitations-EditableStatuteLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_5;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV_tb-CreateRecoveryReserve>div[role='button']", AI = false)
	private WebElement btnSetOpenRecoveryReserves;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationsLV_tb-RemoveSubrogation>div[role='button']", AI = false)
	private WebElement btnRemove_2;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Jurisdiction']", AI = false)
	private WebElement inpJurisdiction;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-GeneralTabTab", AI = false)
	private WebElement btnGeneral;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-ClaimFinancialsHeader']", AI = false)
	private WebElement inpClaimFinancialsHeader;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-NetPaidHeader']", AI = false)
	private WebElement inpNetPaidHeader;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-DeductibleHeader']", AI = false)
	private WebElement inpDeductibleHeader;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Notification_AtFaultPercentage']", AI = false)
	private WebElement inpInsuredsLiability;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-WideNotesLV_tb-DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationsLV_tb-AssignExposureLevelSubrogation>div[role='button']", AI = false)
	private WebElement btnAssign_3;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-AdversePartyInfo-EditableAdverseGeneralLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-CloseComment']", AI = false)
	private WebElement inpClosingComment;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubroReferralInfo-SubroReferralOwner']", AI = false)
	private WebElement inpSubrogationOwner;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-RecoveredHeader']", AI = false)
	private WebElement inpRecoveredHeader;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogateIndividualExposures']", AI = false)
	private WebElement chkSubrogateIndividualExposures;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-DocumentsTabTab", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-SubrogationFinancialsHeader']", AI = false)
	private WebElement inpSubrogationFinancialsHeader;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsCardTab", AI = false)
	private WebElement btnSubrogationFinancials;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-SubrogatorMenuIcon>div[role='button']", AI = false)
	private WebElement btnSubrogatorMenuIcon;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-StatuteLimitations-EditableStatuteLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAddStatute;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-LabelBottomHeader']", AI = false)
	private WebElement inpLabelBottomHeader;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-WideNotesLV_tb-PrintButton>div[role='button']", AI = false)
	private WebElement btnPrint;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationsLV_tb-AddSubrogation>div[role='button']", AI = false)
	private WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubroArbThoseInvolved']", AI = false)
	private WebElement inpPartiesInvolved;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-AvailableRecoveryReservesHeader']", AI = false)
	private WebElement inpAvailableRecoveryReservesHeader;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubroExternalOwner']", AI = false)
	private WebElement rdbExternallyOwned;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationDocumentsLV_tb-AttachDocument>div[role='button']", AI = false)
	private WebElement btnUpload;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-CloseDate']", AI = false)
	private WebElement inpCloseDate;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-AdversePartyInfo-EditableAdverseGeneralLV-AdversePartyExpectedRecovery']", AI = false)
	private WebElement inpAdversePartyExpectedRecovery;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-AdversePartyInfo-EditableAdverseGeneralLV-AdversePartyLiability']", AI = false)
	private WebElement inpAdversePartyLiability;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-AdversePartyInfo-EditableAdverseGeneralLV_tb-AddResponsibleParty>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-AssignClaimLevelSubrogation>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-SubrogationFinancialsLV-PendingHeader']", AI = false)
	private WebElement inpPendingHeader;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-Subrogator-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#SubrogationGeneral-ClaimSubroSummaryScreen-SubrogationMainPanelSet-NotesTabTab", AI = false)
	private WebElement btnNotes;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Status']", AI = false)
	private WebElement lblStatus;

	public SubrogationPage(){
	}

	public SubrogationPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		editableadversegeneralTable = new EditableAdverseGeneral();
//		subrogationmainpanelsetTable = new SubrogationMainPanelSet();
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
}public SubrogationPage selectFault(WebDriver driver,String Fault)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFault,Fault,"Fault");
				    return this;
			}
public SubrogationPage clickReferralDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReferralDateDateIcon,"ReferralDateDateIcon");
				    return this;
			}
public SubrogationPage enterTotalLabel(WebDriver driver,String TotalLabel) {
		            BrowserActions.type(driver, inpTotalLabel,TotalLabel, "TotalLabel");
			        return this;
           }
public SubrogationPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public SubrogationPage enterTotalFooter(WebDriver driver,String TotalFooter) {
		            BrowserActions.type(driver, inpTotalFooter,TotalFooter, "TotalFooter");
			        return this;
           }
public SubrogationPage selectSubrogationStatus(WebDriver driver,String SubrogationStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSubrogationStatus,SubrogationStatus,"SubrogationStatus");
				    return this;
			}
public SubrogationPage clickProrateDeductible(WebDriver driver)  {
					BrowserActions.click(driver, rdbProrateDeductible,"ProrateDeductible");
				    return this;
			}
public SubrogationPage enterLabelTopHeader(WebDriver driver,String LabelTopHeader) {
		            BrowserActions.type(driver, inpLabelTopHeader,LabelTopHeader, "LabelTopHeader");
			        return this;
           }
public SubrogationPage enterReferralDate(WebDriver driver,String ReferralDate) {
		            BrowserActions.type(driver, inpReferralDate,ReferralDate, "ReferralDate");
			        return this;
           }
public SubrogationPage clickRefresh(WebDriver driver)  {
					BrowserActions.click(driver, btnRefresh,"Refresh");
				    return this;
			}
public SubrogationPage clickCreateFromTemplate(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateFromTemplate,"CreateFromTemplate");
				    return this;
			}
public SubrogationPage enterReferralComment(WebDriver driver,String ReferralComment) {
		            BrowserActions.type(driver, inpReferralComment,ReferralComment, "ReferralComment");
			        return this;
           }
public SubrogationPage enterEmptyLabel0(WebDriver driver,String EmptyLabel0) {
		            BrowserActions.type(driver, inpEmptyLabel0,EmptyLabel0, "EmptyLabel0");
			        return this;
           }
public SubrogationPage enterExpectedRecoveryHeader(WebDriver driver,String ExpectedRecoveryHeader) {
		            BrowserActions.type(driver, inpExpectedRecoveryHeader,ExpectedRecoveryHeader, "ExpectedRecoveryHeader");
			        return this;
           }
public SubrogationPage selectOutcome(WebDriver driver,String Outcome)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOutcome,Outcome,"Outcome");
				    return this;
			}
public SubrogationPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public SubrogationPage enterPaidHeader(WebDriver driver,String PaidHeader) {
		            BrowserActions.type(driver, inpPaidHeader,PaidHeader, "PaidHeader");
			        return this;
           }
public SubrogationPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public SubrogationPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public SubrogationPage clickNewNote(WebDriver driver)  {
					BrowserActions.click(driver, btnNewNote,"NewNote");
				    return this;
			}
public SubrogationPage clickEdit_6(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit_6,"Edit_6");
				    return this;
			}
public SubrogationPage clickRefertoSubrogation(WebDriver driver)  {
					BrowserActions.click(driver, btnRefertoSubrogation,"RefertoSubrogation");
				    return this;
			}
public SubrogationPage clickCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseDateDateIcon,"CloseDateDateIcon");
				    return this;
			}
public SubrogationPage selectExternalSubrogator(WebDriver driver,String ExternalSubrogator)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpExternalSubrogator,ExternalSubrogator,"ExternalSubrogator");
				    return this;
			}
public SubrogationPage enterRecoveryHeader(WebDriver driver,String RecoveryHeader) {
		            BrowserActions.type(driver, inpRecoveryHeader,RecoveryHeader, "RecoveryHeader");
			        return this;
           }
public SubrogationPage clickRemove_5(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_5,"Remove_5");
				    return this;
			}
public SubrogationPage clickSetOpenRecoveryReserves(WebDriver driver)  {
					BrowserActions.click(driver, btnSetOpenRecoveryReserves,"SetOpenRecoveryReserves");
				    return this;
			}
public SubrogationPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public SubrogationPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public SubrogationPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public SubrogationPage clickRemove_2(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_2,"Remove_2");
				    return this;
			}
public SubrogationPage enterJurisdiction(WebDriver driver,String Jurisdiction) {
		            BrowserActions.type(driver, inpJurisdiction,Jurisdiction, "Jurisdiction");
			        return this;
           }
public SubrogationPage clickGeneral(WebDriver driver)  {
					BrowserActions.click(driver, btnGeneral,"General");
				    return this;
			}
public SubrogationPage enterClaimFinancialsHeader(WebDriver driver,String ClaimFinancialsHeader) {
		            BrowserActions.type(driver, inpClaimFinancialsHeader,ClaimFinancialsHeader, "ClaimFinancialsHeader");
			        return this;
           }
public SubrogationPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public SubrogationPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public SubrogationPage enterNetPaidHeader(WebDriver driver,String NetPaidHeader) {
		            BrowserActions.type(driver, inpNetPaidHeader,NetPaidHeader, "NetPaidHeader");
			        return this;
           }
public SubrogationPage enterDeductibleHeader(WebDriver driver,String DeductibleHeader) {
		            BrowserActions.type(driver, inpDeductibleHeader,DeductibleHeader, "DeductibleHeader");
			        return this;
           }
public SubrogationPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,true,"Update");
				    return new SubrogationPage(driver).get();
			}
public SubrogationPage enterInsuredsLiability(WebDriver driver,String InsuredsLiability) {
		            BrowserActions.type(driver, inpInsuredsLiability,InsuredsLiability, "InsuredsLiability");
			        return this;
           }
public SubrogationPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public SubrogationPage clickAssign_3(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign_3,"Assign_3");
				    return this;
			}
public SubrogationPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public SubrogationPage enterClosingComment(WebDriver driver,String ClosingComment) {
		            BrowserActions.type(driver, inpClosingComment,ClosingComment, "ClosingComment");
			        return this;
           }
public SubrogationPage enterSubrogationOwner(WebDriver driver,String SubrogationOwner) {
		            BrowserActions.type(driver, inpSubrogationOwner,SubrogationOwner, "SubrogationOwner");
			        return this;
           }
public SubrogationPage enterRecoveredHeader(WebDriver driver,String RecoveredHeader) {
		            BrowserActions.type(driver, inpRecoveredHeader,RecoveredHeader, "RecoveredHeader");
			        return this;
           }
public SubrogationPage clickSubrogateIndividualExposures(WebDriver driver)  {
					BrowserActions.click(driver, chkSubrogateIndividualExposures,"SubrogateIndividualExposures");
				    return this;
			}
public SubrogationPage clickDocuments(WebDriver driver)  {
					BrowserActions.click(driver, btnDocuments,"Documents");
				    return this;
			}
public SubrogationPage enterSubrogationFinancialsHeader(WebDriver driver,String SubrogationFinancialsHeader) {
		            BrowserActions.type(driver, inpSubrogationFinancialsHeader,SubrogationFinancialsHeader, "SubrogationFinancialsHeader");
			        return this;
           }
public SubrogationPage clickSubrogationFinancials(WebDriver driver)  {
					BrowserActions.click(driver, btnSubrogationFinancials,"SubrogationFinancials");
				    return this;
			}
public SubrogationPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public SubrogationPage clickSubrogatorMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSubrogatorMenuIcon,"SubrogatorMenuIcon");
				    return this;
			}
public SubrogationPage clickAddStatute(WebDriver driver)  {
					BrowserActions.click(driver, btnAddStatute,"Add_4");
				    return this;
			}
public SubrogationPage enterLabelBottomHeader(WebDriver driver,String LabelBottomHeader) {
		            BrowserActions.type(driver, inpLabelBottomHeader,LabelBottomHeader, "LabelBottomHeader");
			        return this;
           }
public SubrogationPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public SubrogationPage clickPrint(WebDriver driver)  {
					BrowserActions.click(driver, btnPrint,"Print");
				    return this;
			}
public SubrogationPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public SubrogationPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public SubrogationPage clickAdd_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_1,"Add_1");
				    return this;
			}
public SubrogationPage enterPartiesInvolved(WebDriver driver,String PartiesInvolved) {
		            BrowserActions.type(driver, inpPartiesInvolved,PartiesInvolved, "PartiesInvolved");
			        return this;
           }
public SubrogationPage enterAvailableRecoveryReservesHeader(WebDriver driver,String AvailableRecoveryReservesHeader) {
		            BrowserActions.type(driver, inpAvailableRecoveryReservesHeader,AvailableRecoveryReservesHeader, "AvailableRecoveryReservesHeader");
			        return this;
           }
public SubrogationPage clickExternallyOwned(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternallyOwned,"ExternallyOwned");
				    return this;
			}
public SubrogationPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public SubrogationPage clickUpload(WebDriver driver)  {
					BrowserActions.click(driver, btnUpload,"Upload");
				    return this;
			}
public SubrogationPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public SubrogationPage enterCloseDate(WebDriver driver,String CloseDate) {
		            BrowserActions.type(driver, inpCloseDate,CloseDate, "CloseDate");
			        return this;
           }
public SubrogationPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public SubrogationPage enterAdversePartyExpectedRecovery(WebDriver driver,String AdversePartyExpectedRecovery) {
		            BrowserActions.type(driver, inpAdversePartyExpectedRecovery,AdversePartyExpectedRecovery, "AdversePartyExpectedRecovery");
			        return this;
           }
public SubrogationPage enterAdversePartyLiability(WebDriver driver,String AdversePartyLiability) {
		            BrowserActions.type(driver, inpAdversePartyLiability,AdversePartyLiability, "AdversePartyLiability");
			        return this;
           }
public SubrogationPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public SubrogationPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public SubrogationPage enterPendingHeader(WebDriver driver,String PendingHeader) {
		            BrowserActions.type(driver, inpPendingHeader,PendingHeader, "PendingHeader");
			        return this;
           }
public SubrogationPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public SubrogationPage clickNotes(WebDriver driver)  {
					BrowserActions.click(driver, btnNotes,"Notes");
				    return this;
			}
public SubrogationPage verifySubrogationStatus(WebDriver driver, String expectedText)  {
	String text = BrowserActions.getText(driver, lblStatus,"Status");
	Log.assertThat(text.equals(expectedText), "Status is verified", "Staus is not verifed");
	return this;
}
}
