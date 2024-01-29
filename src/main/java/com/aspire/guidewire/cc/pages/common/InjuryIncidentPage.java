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

public class InjuryIncidentPage extends LoadableComponent<InjuryIncidentPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-DisabledDueToAccident']", AI = false)
	private WebElement drpDisabledDueToAccident;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-ServiceRequestSubmitMessage']", AI = false)
	private WebElement inpServiceRequestSubmitMessage;

	@IFindBy(how = How.CSS, using = "select[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-TreatmentType']", AI = false)
	private WebElement drpTreatmentType;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-Injured_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "select[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-DetailedInjuryType']", AI = false)
	private WebElement drpDetailedInjuryType;

	@IFindBy(how = How.CSS, using = "select[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-Severity']", AI = false)
	private WebElement drpSeverity;

	@IFindBy(how = How.CSS, using = "select[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-doctor']", AI = false)
	private WebElement drpPrimaryDoctor;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-__crumb__", AI = false)
	private WebElement btnReturntoNewExposurePIP;

	@IFindBy(how = How.CSS, using = "select[name$='InjuryIncidentInputSet-LossParty']", AI = false)
	private WebElement drpLossParty;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-EditableBodyPartDetailsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-doctor-ClaimNewDoctorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnNewDoctor;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-doctor-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_2;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-doctor-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-EditableBodyPartDetailsLV_tb-MakeFirstButton>div[role='button']", AI = false)
	private WebElement btnMakeFirst;

	@IFindBy(how = How.CSS, using = "select[name$='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-Injured_Picker']", AI = false)
	private WebElement drpInjuredPerson;

	@IFindBy(how = How.CSS, using = "div[id$='-Update']", AI = false)
	private WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-Injured_Picker-Injured_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnInjured_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-Injured_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-OtherServicesLVInputSet-OtherServicesLV_tb-AddServiceRequest>div[role='button']", AI = false)
	private WebElement btnAdd_5;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_3;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Make_Primary>div[role='button']", AI = false)
	private WebElement btnMakePrimary;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Reconfirmed_Diagnosis>div[role='button']", AI = false)
	private WebElement btnReconfirmDiagnosis;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-doctor-doctorMenuIcon>div[role='button']", AI = false)
	private WebElement btnDoctorMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-LostWages']", AI = false)
	private WebElement rdbLostWages;

	@IFindBy(how = How.CSS, using = "select[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-PrimaryInjuryType']", AI = false)
	private WebElement drpGeneralInjuryType;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-MedicalDiagnosisLVInput-MedicalDiagnosisLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_4;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-OtherServicesLVInputSet-OtherServicesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_6;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-EditableBodyPartDetailsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-AmbulanceUsed']", AI = false)
	private WebElement rdbAmbulanceUsed;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-Injured_Picker-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-ReceivedTreatment']", AI = false)
	private WebElement rdbReceivedTreatment;

	@IFindBy(how = How.CSS, using = "#NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-InjuryDescription textarea", AI = false)
	private WebElement inpDescribeInjuries;

	@IFindBy(how = How.CSS, using = "input[name='NewInjuryIncidentPopup-NewInjuryIncidentScreen-InjuryIncidentDV-InjuryIncidentInputSet-ServiceRequestSubmitMessageFNOL']", AI = false)
	private WebElement inpServiceRequestSubmitMessageFNOL;
	
	@IFindBy(how = How.CSS, using = "select[name$='ClaimContactPerson']", AI = false)
	private WebElement drpPerson;

	public InjuryIncidentPage(){
	}

	public InjuryIncidentPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpServiceRequestSubmitMessageFNOL))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public InjuryIncidentPage selectDisabledDueToAccident(WebDriver driver,String DisabledDueToAccident)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDisabledDueToAccident,DisabledDueToAccident,"DisabledDueToAccident");
				    return this;
			}
public InjuryIncidentPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public InjuryIncidentPage enterServiceRequestSubmitMessage(WebDriver driver,String ServiceRequestSubmitMessage) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessage,ServiceRequestSubmitMessage, "ServiceRequestSubmitMessage");
			        return this;
           }
public InjuryIncidentPage selectTreatmentType(WebDriver driver,String TreatmentType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTreatmentType,TreatmentType,"TreatmentType");
				    return this;
			}
public InjuryIncidentPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public InjuryIncidentPage selectDetailedInjuryType(WebDriver driver,String DetailedInjuryType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDetailedInjuryType,DetailedInjuryType,"DetailedInjuryType");
				    return this;
			}
public InjuryIncidentPage selectSeverity(WebDriver driver,String Severity)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSeverity,Severity,"Severity");
				    return this;
			}
public InjuryIncidentPage selectPrimaryDoctor(WebDriver driver,String PrimaryDoctor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryDoctor,PrimaryDoctor,"PrimaryDoctor");
				    return this;
			}
public InjuryIncidentPage clickReturntoNewExposurePIP(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoNewExposurePIP,"ReturntoNewExposurePIP");
				    return this;
			}
public InjuryIncidentPage selectLossParty(WebDriver driver,String LossParty)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLossParty,LossParty,"LossParty");
				    return this;
			}
public InjuryIncidentPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public InjuryIncidentPage clickNewDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewDoctor,"NewDoctor");
				    return this;
			}
public InjuryIncidentPage clickViewContactDetails_2(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_2,"ViewContactDetails_2");
				    return this;
			}
public InjuryIncidentPage clickSearch_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_1,"Search_1");
				    return this;
			}
public InjuryIncidentPage clickMakeFirst(WebDriver driver)  {
					BrowserActions.click(driver, btnMakeFirst,"MakeFirst");
				    return this;
			}
public InjuryIncidentPage selectInjuredPerson(WebDriver driver,String InjuredPerson)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInjuredPerson,InjuredPerson,"InjuredPerson");
				    return this;
			}
public InjuryIncidentPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public InjuryIncidentPage clickInjured_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnInjured_PickerMenuIcon,"Injured_PickerMenuIcon");
				    return this;
			}
public InjuryIncidentPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public InjuryIncidentPage clickAdd_5(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_5,"Add_5");
				    return this;
			}
public InjuryIncidentPage clickAdd_3(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_3,"Add_3");
				    return this;
			}
public InjuryIncidentPage clickMakePrimary(WebDriver driver)  {
					BrowserActions.click(driver, btnMakePrimary,"MakePrimary");
				    return this;
			}
public InjuryIncidentPage clickReconfirmDiagnosis(WebDriver driver)  {
					BrowserActions.click(driver, btnReconfirmDiagnosis,"ReconfirmDiagnosis");
				    return this;
			}
public InjuryIncidentPage clickDoctorMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctorMenuIcon,"DoctorMenuIcon");
				    return this;
			}
public InjuryIncidentPage clickLostWages(WebDriver driver)  {
					BrowserActions.click(driver, rdbLostWages,"LostWages");
				    return this;
			}
public InjuryIncidentPage selectGeneralInjuryType(WebDriver driver,String GeneralInjuryType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpGeneralInjuryType,GeneralInjuryType,"GeneralInjuryType");
				    return this;
			}
public InjuryIncidentPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public InjuryIncidentPage clickRemove_4(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_4,"Remove_4");
				    return this;
			}
public InjuryIncidentPage clickRemove_6(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_6,"Remove_6");
				    return this;
			}
public InjuryIncidentPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public InjuryIncidentPage clickAmbulanceUsed(WebDriver driver)  {
					BrowserActions.click(driver, rdbAmbulanceUsed,"AmbulanceUsed");
				    return this;
			}
public InjuryIncidentPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public InjuryIncidentPage clickReceivedTreatment(WebDriver driver)  {
					BrowserActions.click(driver, rdbReceivedTreatment,"ReceivedTreatment");
				    return this;
			}
public InjuryIncidentPage enterDescribeInjuries(WebDriver driver,String DescribeInjuries) {
		            BrowserActions.type(driver, inpDescribeInjuries,DescribeInjuries, "DescribeInjuries");
			        return this;
           }
public InjuryIncidentPage enterServiceRequestSubmitMessageFNOL(WebDriver driver,String ServiceRequestSubmitMessageFNOL) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessageFNOL,ServiceRequestSubmitMessageFNOL, "ServiceRequestSubmitMessageFNOL");
			        return this;
           }
public InjuryIncidentPage selectPerson(WebDriver driver,String Person)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpPerson,Person,2,"Person");
    return this;
}
}
