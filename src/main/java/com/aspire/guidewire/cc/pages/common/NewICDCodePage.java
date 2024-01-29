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

public class NewICDCodePage extends LoadableComponent<NewICDCodePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public LocalizedValues localizedvaluesTable;

	@IFindBy(how = How.CSS, using = "#NewICDPopup-ICDPopupScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewICDPopup-ICDPopupScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-ICD_Code']", AI = false)
	private WebElement inpICDCode;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-Available_Date']", AI = false)
	private WebElement inpAvailableFrom;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-Body_System']", AI = false)
	private WebElement drpBodySystem;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-End_Date']", AI = false)
	private WebElement inpExpiresOn;

	@IFindBy(how = How.CSS, using = "#NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
	private WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "#NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-Available_Date_dateIcon", AI = false)
	private WebElement btnAvailableFromDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
	private WebElement inpDependentonRender_6;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	private WebElement inpDependentonRender_9;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
	private WebElement inpDependentonRender_2;

	@IFindBy(how = How.CSS, using = "input[name$='column0']", AI = false)
	private WebElement inpDescriptionEdgePolicyHolder;

	@IFindBy(how = How.CSS, using = "input[name$='LV-2-column0']", AI = false)
	private WebElement inpDescriptionEdge;

	@IFindBy(how = How.CSS, using = "#NewICDPopup-__crumb__", AI = false)
	private WebElement btnReturntoICDCodeReferencePage;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	private WebElement inpDescription_1;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-Chronic']", AI = false)
	private WebElement chkChronic;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	private WebElement inpDescription_8;

	@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
	private WebElement inpDependentonRender_10;

	@IFindBy(how = How.CSS, using = "#NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
	private WebElement inpLanguage_7;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	private WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "#NewICDPopup-ICDPopupScreen-ICDDVPanel-ICDDV-End_Date_dateIcon", AI = false)
	private WebElement btnExpiresOnDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewICDPopup-ICDPopupScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
	private WebElement inpLanguage_3;

	public NewICDCodePage(){
	}

	public NewICDCodePage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		localizedvaluesTable = new LocalizedValues();
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
}public NewICDCodePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewICDCodePage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,true,"Update");
				    return this;
			}
public NewICDCodePage enterICDCode(WebDriver driver,String ICDCode) {
		            BrowserActions.type(driver, inpICDCode,ICDCode, "ICDCode");
			        return this;
           }
public NewICDCodePage enterAvailableFrom(WebDriver driver,String AvailableFrom) {
		            BrowserActions.type(driver, inpAvailableFrom,AvailableFrom, "AvailableFrom");
			        return this;
           }
public NewICDCodePage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public NewICDCodePage selectBodySystem(WebDriver driver,String BodySystem)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBodySystem,BodySystem,"BodySystem");
				    return this;
			}
public NewICDCodePage enterExpiresOn(WebDriver driver,String ExpiresOn) {
		            BrowserActions.type(driver, inpExpiresOn,ExpiresOn, "ExpiresOn");
			        return this;
           }
public NewICDCodePage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public NewICDCodePage enterLanguage(WebDriver driver,String Language) {
		            BrowserActions.type(driver, inpLanguage,Language, "Language");
			        return this;
           }
public NewICDCodePage clickAvailableFromDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAvailableFromDateIcon,"AvailableFromDateIcon");
				    return this;
			}
public NewICDCodePage enterDependentonRender_6(WebDriver driver,String DependentonRender_6) {
		            BrowserActions.type(driver, inpDependentonRender_6,DependentonRender_6, "DependentonRender_6");
			        return this;
           }
public NewICDCodePage enterDependentonRender_9(WebDriver driver,String DependentonRender_9) {
		            BrowserActions.type(driver, inpDependentonRender_9,DependentonRender_9, "DependentonRender_9");
			        return this;
           }
public NewICDCodePage enterDependentonRender_2(WebDriver driver,String DependentonRender_2) {
		            BrowserActions.type(driver, inpDependentonRender_2,DependentonRender_2, "DependentonRender_2");
			        return this;
           }
public NewICDCodePage enterDescriptionEdgePolicyHolder(WebDriver driver,String Description_4) {
		            BrowserActions.type(driver, inpDescriptionEdgePolicyHolder,Description_4, "Description_4");
			        return this;
           }
public NewICDCodePage clickReturntoICDCodeReferencePage(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoICDCodeReferencePage,"ReturntoICDCodeReferencePage");
				    return this;
			}
public NewICDCodePage enterDescriptionEdge(WebDriver driver,String Description_1) {
		            BrowserActions.type(driver, inpDescriptionEdge,Description_1, "Description_1");
			        return this;
           }
public NewICDCodePage clickChronic(WebDriver driver)  {
					BrowserActions.click(driver, chkChronic,"Chronic");
				    return this;
			}
public NewICDCodePage enterDescription_8(WebDriver driver,String Description_8) {
		            BrowserActions.type(driver, inpDescription_8,Description_8, "Description_8");
			        return this;
           }
public NewICDCodePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,true,"Cancel");
				    return this;
			}
public NewICDCodePage enterDependentonRender_10(WebDriver driver,String DependentonRender_10) {
		            BrowserActions.type(driver, inpDependentonRender_10,DependentonRender_10, "DependentonRender_10");
			        return this;
           }
public NewICDCodePage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public NewICDCodePage enterLanguage_7(WebDriver driver,String Language_7) {
		            BrowserActions.type(driver, inpLanguage_7,Language_7, "Language_7");
			        return this;
           }
public NewICDCodePage enterDependentonRender(WebDriver driver,String DependentonRender) {
		            BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
			        return this;
           }
public NewICDCodePage clickExpiresOnDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnExpiresOnDateIcon,"ExpiresOnDateIcon");
				    return this;
			}
public NewICDCodePage enterLanguage_3(WebDriver driver,String Language_3) {
		            BrowserActions.type(driver, inpLanguage_3,Language_3, "Language_3");
			        return this;
           }
}
