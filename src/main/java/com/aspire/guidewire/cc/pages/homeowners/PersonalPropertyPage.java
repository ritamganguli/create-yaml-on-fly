package com.aspire.guidewire.cc.pages.homeowners;
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

public class PersonalPropertyPage extends LoadableComponent<PersonalPropertyPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public PropertyContentsIncidentPanelSet propertycontentsincidentpanelsetTable;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar'] div[id$='-Update']", AI = false)
	public WebElement btnOK;//div[id$='Update']

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-DamageHeader", AI = false)
	public WebElement lblDamageHeader;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-ServiceRequestSubmitMessage']", AI = false)
	public WebElement inpServiceRequestSubmitMessage;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-PropertyContentsLineItemsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_2;

	@IFindBy(how = How.CSS, using = "textarea[name$='Description']", AI = false)
	public WebElement inpDamageLossDescription;

	@IFindBy(how = How.CSS, using = "select[name='NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-StorageLocation']", AI = false)
	public WebElement drpStorageLocation;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-PropertyContentsLineItemsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_3;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-ScheduledItemsTitle", AI = false)
	public WebElement lblScheduledItemsTitle;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-LineItemsTitle", AI = false)
	public WebElement lblLineItemsTitle;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-OtherServicesLVInputSet-OtherServicesLV_tb-AddServiceRequest>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-PropertyContentsScheduledItemsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-__crumb__", AI = false)
	public WebElement btnReturntoNewExposureContent;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-OtherServicesLVInputSet-OtherServicesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-PropertyContentsScheduledItemsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnChoose;

	@IFindBy(how = How.CSS, using = "input[name='NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-ServiceRequestSubmitMessageFNOL']", AI = false)
	public WebElement inpServiceRequestSubmitMessageFNOL;

	@IFindBy(how = How.CSS, using = "#NewPropertyContentsIncidentPopup-NewPropertyContentsIncidentScreen-PropertyContentsIncidentPanelSet-PropertyContentsLineItemsLV_tb-DesktopActivities_PrintButton>div[role='button']", AI = false)
	public WebElement btnPrintExport;
	
	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpPropertyName;

	public PersonalPropertyPage(){
	}

	public PersonalPropertyPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		propertycontentsincidentpanelsetTable = new PropertyContentsIncidentPanelSet();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnPrintExport))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}
	public PersonalPropertyPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public PersonalPropertyPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public PersonalPropertyPage enterServiceRequestSubmitMessage(WebDriver driver,String ServiceRequestSubmitMessage) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessage,ServiceRequestSubmitMessage, "ServiceRequestSubmitMessage");
			        return this;
           }
public PersonalPropertyPage clickAdd_2(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_2,"Add_2");
				    return this;
			}
public PersonalPropertyPage enterDamageLossDescription(WebDriver driver,String DamageLossDescription) {
		            BrowserActions.type(driver, inpDamageLossDescription,DamageLossDescription, "DamageLossDescription");
			        return this;
           }
public PersonalPropertyPage selectStorageLocation(WebDriver driver,String StorageLocation)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStorageLocation,StorageLocation,"StorageLocation");
				    return this;
			}
public PersonalPropertyPage clickRemove_3(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_3,"Remove_3");
				    return this;
			}
public PersonalPropertyPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public PersonalPropertyPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public PersonalPropertyPage clickRemove_1(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_1,"Remove_1");
				    return this;
			}
public PersonalPropertyPage clickReturntoNewExposureContent(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoNewExposureContent,"ReturntoNewExposureContent");
				    return this;
			}
public PersonalPropertyPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public PersonalPropertyPage clickChoose(WebDriver driver)  {
					BrowserActions.click(driver, btnChoose,"Choose");
				    return this;
			}
public PersonalPropertyPage enterServiceRequestSubmitMessageFNOL(WebDriver driver,String ServiceRequestSubmitMessageFNOL) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessageFNOL,ServiceRequestSubmitMessageFNOL, "ServiceRequestSubmitMessageFNOL");
			        return this;
           }
public PersonalPropertyPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}

public PersonalPropertyPage selectPropertyName(WebDriver driver,String PropertyName)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpPropertyName,PropertyName,"PropertyName");
    return this;
}
}
