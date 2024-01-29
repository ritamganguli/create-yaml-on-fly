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

public class SelectServiceToAddPage extends LoadableComponent<SelectServiceToAddPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public SelectServicesPopup selectservicespopupTable;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-AvailableServicesDescription']", AI = false)
	private WebElement inpAvailableServicesDescription;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-3-ServiceLeaf']", AI = false)
	private WebElement inpServices_41;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_40;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-7-ServiceLeaf']", AI = false)
	private WebElement inpServices_45;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-IncompatibleServicesAlert']", AI = false)
	private WebElement inpIncompatibleServicesAlert;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-6-ServiceLeaf']", AI = false)
	private WebElement inpServices_44;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-5-ServiceLeaf']", AI = false)
	private WebElement inpServices_43;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-4-ServiceLeaf']", AI = false)
	private WebElement inpServices_42;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-11-ServiceLeaf']", AI = false)
	private WebElement inpServices_49;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-10-ServiceLeaf']", AI = false)
	private WebElement inpServices_48;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-9-ServiceLeaf']", AI = false)
	private WebElement inpServices_47;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-8-ServiceLeaf']", AI = false)
	private WebElement inpServices_46;

	@IFindBy(how = How.CSS, using = "#SelectServicesPopup-__crumb__", AI = false)
	private WebElement btnReturntoAddService;

	@IFindBy(how = How.CSS, using = "#SelectServicesPopup-UpdateServiceRequestServices>div[role='button']", AI = false)
	private WebElement btnOK;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-FilterKeyword']", AI = false)
	private WebElement inpFilterKeyword;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-14-ServiceLeaf']", AI = false)
	private WebElement inpServices_52;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-13-ServiceLeaf']", AI = false)
	private WebElement inpServices_51;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-0-ServiceLeaf']", AI = false)
	private WebElement inpServices;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-12-ServiceLeaf']", AI = false)
	private WebElement inpServices_50;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-3-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_12;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_56;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-3-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_11;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-1-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_55;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-3-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_10;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-1-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_54;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_53;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-0-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_16;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_15;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-2-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_59;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_14;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-2-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_58;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-3-3-ServiceLeaf']", AI = false)
	private WebElement inpServices_13;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-2-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_57;

	@IFindBy(how = How.CSS, using = "#SelectServicesPopup-ResetFilter>div[role='button']", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-1-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_19;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-1-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_18;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_17;

	@IFindBy(how = How.CSS, using = "#SelectServicesPopup-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-2-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_7;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-2-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_6;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-3-ServiceLeaf']", AI = false)
	private WebElement inpServices_9;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-2-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_8;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-NoAvailableServicesMessage']", AI = false)
	private WebElement inpNoAvailableServicesMessage;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_23;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-1-4-ServiceLeaf']", AI = false)
	private WebElement inpServices_22;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-1-3-ServiceLeaf']", AI = false)
	private WebElement inpServices_21;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-1-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_20;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-2-3-ServiceLeaf']", AI = false)
	private WebElement inpServices_27;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-2-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_26;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-2-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_25;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-2-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_24;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-2-5-ServiceLeaf']", AI = false)
	private WebElement inpServices_29;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-2-2-4-ServiceLeaf']", AI = false)
	private WebElement inpServices_28;

	@IFindBy(how = How.CSS, using = "#SelectServicesPopup-FilterServices>div[role='button']", AI = false)
	private WebElement btnFilter;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-3-ServiceLeaf']", AI = false)
	private WebElement inpServices_30;

	@IFindBy(how = How.CSS, using = "#SelectServicesPopup-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-4-ServiceLeaf']", AI = false)
	private WebElement inpServices_34;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-3-0-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_33;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-3-0-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_32;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-3-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_31;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_3;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_38;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_2;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_37;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-2-ServiceLeaf']", AI = false)
	private WebElement inpServices_5;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-ServiceLeaf']", AI = false)
	private WebElement inpServices_36;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-1-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_4;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-4-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_35;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-0-0-ServiceLeaf']", AI = false)
	private WebElement inpServices_1;

	@IFindBy(how = How.CSS, using = "input[name='SelectServicesPopup-SpecialistServiceTreeLV-5-0-1-ServiceLeaf']", AI = false)
	private WebElement inpServices_39;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-0-_Checkbox']", AI = false)
	public WebElement chkAdjudicateClaim;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-1-_Checkbox']", AI = false)
	public WebElement chkAppraisal;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-2-0-_Checkbox']", AI = false)
	public WebElement chkAudioEquipment;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-2-1-_Checkbox']", AI = false)
	public WebElement chkAutoBody;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-2-2-_Checkbox']", AI = false)
	public WebElement chkGlass;

	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-3-0-_Checkbox']", AI = false)
	public WebElement chkProvideCourtesyCar;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-3-1-_Checkbox']", AI = false)
	public WebElement chkRoadSideAssitance;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-3-2-_Checkbox']", AI = false)
	public WebElement chkSalvage;

	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-1-3-3-_Checkbox']", AI = false)
	public WebElement chkTowing;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-2-1-4-_Checkbox']", AI = false)
	public WebElement chkKitchenAppliance;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-4-0-_Checkbox']", AI = false)
	public WebElement chkMedicalCare;

	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-5-0-4-_Checkbox']", AI = false)
	public WebElement chkConstructionServiceElectrical;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-3-0-1-_Checkbox']", AI = false)
	public WebElement chkMakeSafe;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-0-0-_Checkbox']", AI = false)
	public WebElement chkAlternativeAccommodation;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-2-1-0-_Checkbox']", AI = false)
	public WebElement chkComputerEquipment;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-2-1-1-_Checkbox']", AI = false)
	public WebElement chkElectronics;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-2-1-2-_Checkbox']", AI = false)
	public WebElement chkFurniture;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-2-1-3-_Checkbox']", AI = false)
	public WebElement chkGarden;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-2-1-4-_Checkbox']", AI = false)
	public WebElement chkKitchenAppliances;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-3-0-0-_Checkbox']", AI = false)
	public WebElement chkCleaning;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-5-0-0-_Checkbox']", AI = false)
	public WebElement chkArborist;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-5-0-6-_Checkbox']", AI = false)
	public WebElement chkFlooring;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-5-0-10-_Checkbox']", AI = false)
	public WebElement chkPlaster;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-5-0-14-_Checkbox']", AI = false)
	public WebElement chkWindows;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-5-1-0-_Checkbox']", AI = false)
	public WebElement chkDebrisRemoval;
	
	@IFindBy(how = How.CSS, using = "input[name$='SpecialistServiceTreeLV-5-2-2-_Checkbox']", AI = false)
	public WebElement chkIndependentAppraisal;

	public SelectServiceToAddPage(){
	}

	public SelectServiceToAddPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		selectservicespopupTable = new SelectServicesPopup();
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
}public SelectServiceToAddPage enterAvailableServicesDescription(WebDriver driver,String AvailableServicesDescription) {
		            BrowserActions.type(driver, inpAvailableServicesDescription,AvailableServicesDescription, "AvailableServicesDescription");
			        return this;
           }
public SelectServiceToAddPage enterServices_41(WebDriver driver,String Services_41) {
		            BrowserActions.type(driver, inpServices_41,Services_41, "Services_41");
			        return this;
           }
public SelectServiceToAddPage enterServices_40(WebDriver driver,String Services_40) {
		            BrowserActions.type(driver, inpServices_40,Services_40, "Services_40");
			        return this;
           }
public SelectServiceToAddPage enterServices_45(WebDriver driver,String Services_45) {
		            BrowserActions.type(driver, inpServices_45,Services_45, "Services_45");
			        return this;
           }
public SelectServiceToAddPage enterIncompatibleServicesAlert(WebDriver driver,String IncompatibleServicesAlert) {
		            BrowserActions.type(driver, inpIncompatibleServicesAlert,IncompatibleServicesAlert, "IncompatibleServicesAlert");
			        return this;
           }
public SelectServiceToAddPage enterServices_44(WebDriver driver,String Services_44) {
		            BrowserActions.type(driver, inpServices_44,Services_44, "Services_44");
			        return this;
           }
public SelectServiceToAddPage enterServices_43(WebDriver driver,String Services_43) {
		            BrowserActions.type(driver, inpServices_43,Services_43, "Services_43");
			        return this;
           }
public SelectServiceToAddPage enterServices_42(WebDriver driver,String Services_42) {
		            BrowserActions.type(driver, inpServices_42,Services_42, "Services_42");
			        return this;
           }
public SelectServiceToAddPage enterServices_49(WebDriver driver,String Services_49) {
		            BrowserActions.type(driver, inpServices_49,Services_49, "Services_49");
			        return this;
           }
public SelectServiceToAddPage enterServices_48(WebDriver driver,String Services_48) {
		            BrowserActions.type(driver, inpServices_48,Services_48, "Services_48");
			        return this;
           }
public SelectServiceToAddPage enterServices_47(WebDriver driver,String Services_47) {
		            BrowserActions.type(driver, inpServices_47,Services_47, "Services_47");
			        return this;
           }
public SelectServiceToAddPage enterServices_46(WebDriver driver,String Services_46) {
		            BrowserActions.type(driver, inpServices_46,Services_46, "Services_46");
			        return this;
           }
public SelectServiceToAddPage clickReturntoAddService(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoAddService,"ReturntoAddService");
				    return this;
			}
public SelectServiceToAddPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public SelectServiceToAddPage enterFilterKeyword(WebDriver driver,String FilterKeyword) {
		            BrowserActions.type(driver, inpFilterKeyword,FilterKeyword, "FilterKeyword");
			        return this;
           }
public SelectServiceToAddPage enterServices_52(WebDriver driver,String Services_52) {
		            BrowserActions.type(driver, inpServices_52,Services_52, "Services_52");
			        return this;
           }
public SelectServiceToAddPage enterServices_51(WebDriver driver,String Services_51) {
		            BrowserActions.type(driver, inpServices_51,Services_51, "Services_51");
			        return this;
           }
public SelectServiceToAddPage enterServices(WebDriver driver,String Services) {
		            BrowserActions.type(driver, inpServices,Services, "Services");
			        return this;
           }
public SelectServiceToAddPage enterServices_50(WebDriver driver,String Services_50) {
		            BrowserActions.type(driver, inpServices_50,Services_50, "Services_50");
			        return this;
           }
public SelectServiceToAddPage enterServices_12(WebDriver driver,String Services_12) {
		            BrowserActions.type(driver, inpServices_12,Services_12, "Services_12");
			        return this;
           }
public SelectServiceToAddPage enterServices_56(WebDriver driver,String Services_56) {
		            BrowserActions.type(driver, inpServices_56,Services_56, "Services_56");
			        return this;
           }
public SelectServiceToAddPage enterServices_11(WebDriver driver,String Services_11) {
		            BrowserActions.type(driver, inpServices_11,Services_11, "Services_11");
			        return this;
           }
public SelectServiceToAddPage enterServices_55(WebDriver driver,String Services_55) {
		            BrowserActions.type(driver, inpServices_55,Services_55, "Services_55");
			        return this;
           }
public SelectServiceToAddPage enterServices_10(WebDriver driver,String Services_10) {
		            BrowserActions.type(driver, inpServices_10,Services_10, "Services_10");
			        return this;
           }
public SelectServiceToAddPage enterServices_54(WebDriver driver,String Services_54) {
		            BrowserActions.type(driver, inpServices_54,Services_54, "Services_54");
			        return this;
           }
public SelectServiceToAddPage enterServices_53(WebDriver driver,String Services_53) {
		            BrowserActions.type(driver, inpServices_53,Services_53, "Services_53");
			        return this;
           }
public SelectServiceToAddPage enterServices_16(WebDriver driver,String Services_16) {
		            BrowserActions.type(driver, inpServices_16,Services_16, "Services_16");
			        return this;
           }
public SelectServiceToAddPage enterServices_15(WebDriver driver,String Services_15) {
		            BrowserActions.type(driver, inpServices_15,Services_15, "Services_15");
			        return this;
           }
public SelectServiceToAddPage enterServices_59(WebDriver driver,String Services_59) {
		            BrowserActions.type(driver, inpServices_59,Services_59, "Services_59");
			        return this;
           }
public SelectServiceToAddPage enterServices_14(WebDriver driver,String Services_14) {
		            BrowserActions.type(driver, inpServices_14,Services_14, "Services_14");
			        return this;
           }
public SelectServiceToAddPage enterServices_58(WebDriver driver,String Services_58) {
		            BrowserActions.type(driver, inpServices_58,Services_58, "Services_58");
			        return this;
           }
public SelectServiceToAddPage enterServices_13(WebDriver driver,String Services_13) {
		            BrowserActions.type(driver, inpServices_13,Services_13, "Services_13");
			        return this;
           }
public SelectServiceToAddPage enterServices_57(WebDriver driver,String Services_57) {
		            BrowserActions.type(driver, inpServices_57,Services_57, "Services_57");
			        return this;
           }
public SelectServiceToAddPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public SelectServiceToAddPage enterServices_19(WebDriver driver,String Services_19) {
		            BrowserActions.type(driver, inpServices_19,Services_19, "Services_19");
			        return this;
           }
public SelectServiceToAddPage enterServices_18(WebDriver driver,String Services_18) {
		            BrowserActions.type(driver, inpServices_18,Services_18, "Services_18");
			        return this;
           }
public SelectServiceToAddPage enterServices_17(WebDriver driver,String Services_17) {
		            BrowserActions.type(driver, inpServices_17,Services_17, "Services_17");
			        return this;
           }
public SelectServiceToAddPage enterServices_7(WebDriver driver,String Services_7) {
		            BrowserActions.type(driver, inpServices_7,Services_7, "Services_7");
			        return this;
           }
public SelectServiceToAddPage enterServices_6(WebDriver driver,String Services_6) {
		            BrowserActions.type(driver, inpServices_6,Services_6, "Services_6");
			        return this;
           }
public SelectServiceToAddPage enterServices_9(WebDriver driver,String Services_9) {
		            BrowserActions.type(driver, inpServices_9,Services_9, "Services_9");
			        return this;
           }
public SelectServiceToAddPage enterServices_8(WebDriver driver,String Services_8) {
		            BrowserActions.type(driver, inpServices_8,Services_8, "Services_8");
			        return this;
           }
public SelectServiceToAddPage enterNoAvailableServicesMessage(WebDriver driver,String NoAvailableServicesMessage) {
		            BrowserActions.type(driver, inpNoAvailableServicesMessage,NoAvailableServicesMessage, "NoAvailableServicesMessage");
			        return this;
           }
public SelectServiceToAddPage enterServices_23(WebDriver driver,String Services_23) {
		            BrowserActions.type(driver, inpServices_23,Services_23, "Services_23");
			        return this;
           }
public SelectServiceToAddPage enterServices_22(WebDriver driver,String Services_22) {
		            BrowserActions.type(driver, inpServices_22,Services_22, "Services_22");
			        return this;
           }
public SelectServiceToAddPage enterServices_21(WebDriver driver,String Services_21) {
		            BrowserActions.type(driver, inpServices_21,Services_21, "Services_21");
			        return this;
           }
public SelectServiceToAddPage enterServices_20(WebDriver driver,String Services_20) {
		            BrowserActions.type(driver, inpServices_20,Services_20, "Services_20");
			        return this;
           }
public SelectServiceToAddPage enterServices_27(WebDriver driver,String Services_27) {
		            BrowserActions.type(driver, inpServices_27,Services_27, "Services_27");
			        return this;
           }
public SelectServiceToAddPage enterServices_26(WebDriver driver,String Services_26) {
		            BrowserActions.type(driver, inpServices_26,Services_26, "Services_26");
			        return this;
           }
public SelectServiceToAddPage enterServices_25(WebDriver driver,String Services_25) {
		            BrowserActions.type(driver, inpServices_25,Services_25, "Services_25");
			        return this;
           }
public SelectServiceToAddPage enterServices_24(WebDriver driver,String Services_24) {
		            BrowserActions.type(driver, inpServices_24,Services_24, "Services_24");
			        return this;
           }
public SelectServiceToAddPage enterServices_29(WebDriver driver,String Services_29) {
		            BrowserActions.type(driver, inpServices_29,Services_29, "Services_29");
			        return this;
           }
public SelectServiceToAddPage enterServices_28(WebDriver driver,String Services_28) {
		            BrowserActions.type(driver, inpServices_28,Services_28, "Services_28");
			        return this;
           }
public SelectServiceToAddPage clickFilter(WebDriver driver)  {
					BrowserActions.click(driver, btnFilter,"Filter");
				    return this;
			}
public SelectServiceToAddPage enterServices_30(WebDriver driver,String Services_30) {
		            BrowserActions.type(driver, inpServices_30,Services_30, "Services_30");
			        return this;
           }
public SelectServiceToAddPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public SelectServiceToAddPage enterServices_34(WebDriver driver,String Services_34) {
		            BrowserActions.type(driver, inpServices_34,Services_34, "Services_34");
			        return this;
           }
public SelectServiceToAddPage enterServices_33(WebDriver driver,String Services_33) {
		            BrowserActions.type(driver, inpServices_33,Services_33, "Services_33");
			        return this;
           }
public SelectServiceToAddPage enterServices_32(WebDriver driver,String Services_32) {
		            BrowserActions.type(driver, inpServices_32,Services_32, "Services_32");
			        return this;
           }
public SelectServiceToAddPage enterServices_31(WebDriver driver,String Services_31) {
		            BrowserActions.type(driver, inpServices_31,Services_31, "Services_31");
			        return this;
           }
public SelectServiceToAddPage enterServices_3(WebDriver driver,String Services_3) {
		            BrowserActions.type(driver, inpServices_3,Services_3, "Services_3");
			        return this;
           }
public SelectServiceToAddPage enterServices_38(WebDriver driver,String Services_38) {
		            BrowserActions.type(driver, inpServices_38,Services_38, "Services_38");
			        return this;
           }
public SelectServiceToAddPage enterServices_2(WebDriver driver,String Services_2) {
		            BrowserActions.type(driver, inpServices_2,Services_2, "Services_2");
			        return this;
           }
public SelectServiceToAddPage enterServices_37(WebDriver driver,String Services_37) {
		            BrowserActions.type(driver, inpServices_37,Services_37, "Services_37");
			        return this;
           }
public SelectServiceToAddPage enterServices_5(WebDriver driver,String Services_5) {
		            BrowserActions.type(driver, inpServices_5,Services_5, "Services_5");
			        return this;
           }
public SelectServiceToAddPage enterServices_36(WebDriver driver,String Services_36) {
		            BrowserActions.type(driver, inpServices_36,Services_36, "Services_36");
			        return this;
           }
public SelectServiceToAddPage enterServices_4(WebDriver driver,String Services_4) {
		            BrowserActions.type(driver, inpServices_4,Services_4, "Services_4");
			        return this;
           }
public SelectServiceToAddPage enterServices_35(WebDriver driver,String Services_35) {
		            BrowserActions.type(driver, inpServices_35,Services_35, "Services_35");
			        return this;
           }
public SelectServiceToAddPage enterServices_1(WebDriver driver,String Services_1) {
		            BrowserActions.type(driver, inpServices_1,Services_1, "Services_1");
			        return this;
           }
public SelectServiceToAddPage enterServices_39(WebDriver driver,String Services_39) {
		            BrowserActions.type(driver, inpServices_39,Services_39, "Services_39");
			        return this;
           }
public SelectServiceToAddPage clickAdjudicateClaim(WebDriver driver) {
	BrowserActions.click(driver, chkAdjudicateClaim, "Adjudicate claim");
	return this;
}
public SelectServiceToAddPage clickAppraisal(WebDriver driver) {
	BrowserActions.click(driver, chkAppraisal, "Appraisal");
	return this;
}
public SelectServiceToAddPage clickAudioEquipment(WebDriver driver) {
	BrowserActions.click(driver, chkAudioEquipment,1,"AUdio Equipment");
	return this;
}
public SelectServiceToAddPage clickAutoBody(WebDriver driver) {
	BrowserActions.click(driver, chkAutoBody, "Auto body");
	return this;
}
public SelectServiceToAddPage clickGlass(WebDriver driver) {
	BrowserActions.click(driver, chkGlass, "Glass");
	return this;
}
public SelectServiceToAddPage clickProvideCourtesyCar(WebDriver driver) {
	BrowserActions.click(driver, chkProvideCourtesyCar, "Provide Courtesy car");
	return this;
}
public SelectServiceToAddPage clickRoadSideAssistance(WebDriver driver) {
	BrowserActions.click(driver, chkRoadSideAssitance, "Roadside Assistance");
	return this;
}
public SelectServiceToAddPage clickSalvage(WebDriver driver) {
	BrowserActions.click(driver, chkSalvage, "Salvage");
	return this;
}
public SelectServiceToAddPage clickTowing(WebDriver driver) {
	BrowserActions.click(driver, chkTowing, "Towing");
	return this;
}
public SelectServiceToAddPage clickKitchenAppliance(WebDriver driver) {
	BrowserActions.click(driver, chkKitchenAppliance, "Kitchen Appliance");
	return this;
}

public SelectServiceToAddPage clickMedicalCare(WebDriver driver) {
	BrowserActions.click(driver, chkMedicalCare, "Medical Care");
	return this;
}

public SelectServiceToAddPage clickConstructionServiceElectrical(WebDriver driver) {
	BrowserActions.click(driver, chkConstructionServiceElectrical, "Construction Service Electrical");
	return this;
}

public SelectServiceToAddPage clickMakeSafe(WebDriver driver) {
	BrowserActions.click(driver, chkMakeSafe, "Make Safe check box");
	return this;
}

public SelectServiceToAddPage clickAlternativeAccommodation (WebDriver driver) {
	BrowserActions.click(driver, chkAlternativeAccommodation , "Alternative accommodation ");
	return this;
}
public SelectServiceToAddPage clickComputerEquipment (WebDriver driver) {
	BrowserActions.click(driver, chkComputerEquipment , "Computer equipment ");
	return this;
}
public SelectServiceToAddPage clickElectronics (WebDriver driver) {
	BrowserActions.click(driver, chkElectronics , "Electronics ");
	return this;
}
public SelectServiceToAddPage clickFurniture (WebDriver driver) {
	BrowserActions.click(driver, chkFurniture , "Furniture");
	return this;
}
public SelectServiceToAddPage clickGarden (WebDriver driver) {
	BrowserActions.click(driver, chkGarden , "Furniture");
	return this;
}
public SelectServiceToAddPage clickKitchenAppliances (WebDriver driver) {
	BrowserActions.click(driver, chkKitchenAppliances , "Furniture");
	return this;
}
public SelectServiceToAddPage clickCleaning (WebDriver driver) {
	BrowserActions.click(driver, chkCleaning , "Cleaning");
	return this;
}
public SelectServiceToAddPage clickArborist(WebDriver driver) {
	BrowserActions.click(driver, chkArborist , "Arborist");
	return this;
}
public SelectServiceToAddPage clickFlooring(WebDriver driver) {
	BrowserActions.click(driver, chkFlooring , "Flooring");
	return this;
}
public SelectServiceToAddPage clickPlaster(WebDriver driver) {
	BrowserActions.click(driver, chkPlaster , "Plaster");
	return this;
}
public SelectServiceToAddPage clickWindows(WebDriver driver) {
	BrowserActions.click(driver, chkWindows , "Windows");
	return this;
}
public SelectServiceToAddPage clickDebrisRemoval(WebDriver driver) {
	BrowserActions.click(driver, chkDebrisRemoval , "Debris removal");
	return this;
}
public SelectServiceToAddPage clickIndependentAppraisal(WebDriver driver) {
	BrowserActions.click(driver, chkIndependentAppraisal , "Independent appraisal");
	return this;
}

}
