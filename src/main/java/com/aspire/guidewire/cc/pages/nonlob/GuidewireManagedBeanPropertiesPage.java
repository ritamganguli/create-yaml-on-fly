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

public class GuidewireManagedBeanPropertiesPage extends LoadableComponent<GuidewireManagedBeanPropertiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public MBean mbeanTable;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-2-ResetBtn", AI = false)
	private WebElement btnCancel_11;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-3-ResetBtn", AI = false)
	private WebElement btnCancel_15;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-8-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_32;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanOperationsLV-0-doit", AI = false)
	private WebElement btnExecute;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-10-Value']", AI = false)
	private WebElement inpValue_41;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-9-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_36;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-0-Value']", AI = false)
	private WebElement inpValue;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-4-ResetBtn", AI = false)
	private WebElement btnCancel_19;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-5-ResetBtn", AI = false)
	private WebElement btnCancel_23;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-6-ResetBtn", AI = false)
	private WebElement btnCancel_27;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-1-SaveBtn", AI = false)
	private WebElement btnSave_6;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-10-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_40;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-10-SaveBtn", AI = false)
	private WebElement btnSave_42;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-8-ResetBtn", AI = false)
	private WebElement btnCancel_35;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-9-ResetBtn", AI = false)
	private WebElement btnCancel_39;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-7-ResetBtn", AI = false)
	private WebElement btnCancel_31;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanOperationsLV-1-operation']", AI = false)
	private WebElement inpOperation_1;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBean_BackButton>div[role='button']", AI = false)
	private WebElement btnBacktomanagementbeans;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-10-ResetBtn", AI = false)
	private WebElement btnCancel_43;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanOperationsLV-0-operation']", AI = false)
	private WebElement inpOperation;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-1-Value']", AI = false)
	private WebElement inpValue_5;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanOperationsLV-1-doit", AI = false)
	private WebElement btnExecute_2;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-1-ResetBtn", AI = false)
	private WebElement btnCancel_7;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-2-Value']", AI = false)
	private WebElement inpValue_9;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-3-SaveBtn", AI = false)
	private WebElement btnSave_14;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-2-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_8;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-4-SaveBtn", AI = false)
	private WebElement btnSave_18;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-1-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_4;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-2-SaveBtn", AI = false)
	private WebElement btnSave_10;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-3-Value']", AI = false)
	private WebElement inpValue_13;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-4-Value']", AI = false)
	private WebElement inpValue_17;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-0-SaveBtn", AI = false)
	private WebElement btnSave;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanOperationsLV-1-Value']", AI = false)
	private WebElement inpResult_3;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-5-Value']", AI = false)
	private WebElement inpValue_21;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-6-Value']", AI = false)
	private WebElement inpValue_25;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-3-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_12;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-9-SaveBtn", AI = false)
	private WebElement btnSave_38;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-4-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_16;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanOperationsLV-0-Value']", AI = false)
	private WebElement inpResult;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-7-SaveBtn", AI = false)
	private WebElement btnSave_30;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-8-SaveBtn", AI = false)
	private WebElement btnSave_34;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-8-Value']", AI = false)
	private WebElement inpValue_33;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-9-Value']", AI = false)
	private WebElement inpValue_37;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-6-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_24;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-5-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_20;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-6-SaveBtn", AI = false)
	private WebElement btnSave_26;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-0-ResetBtn", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-0-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-7-PropertyName']", AI = false)
	private WebElement inpMBeanPropertyName_28;

	@IFindBy(how = How.CSS, using = "input[name='MBean-MBeanScreen-MBeanLV-7-Value']", AI = false)
	private WebElement inpValue_29;

	@IFindBy(how = How.CSS, using = "#MBean-MBeanScreen-MBeanLV-5-SaveBtn", AI = false)
	private WebElement btnSave_22;
	
	@IFindBy(how = How.CSS, using = "div[id$='MBeanScreen-MBeanLV-PropertyNameHeader']", AI = false)
	private WebElement lblMBeanPropertyName;

	public GuidewireManagedBeanPropertiesPage(){
	}

	public GuidewireManagedBeanPropertiesPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//mbeanTable = new MBean();
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
}public GuidewireManagedBeanPropertiesPage clickCancel_11(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_11,"Cancel_11");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_15(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_15,"Cancel_15");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_32(WebDriver driver,String MBeanPropertyName_32) {
		            BrowserActions.type(driver, inpMBeanPropertyName_32,MBeanPropertyName_32, "MBeanPropertyName_32");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickExecute(WebDriver driver)  {
					BrowserActions.click(driver, btnExecute,"Execute");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterValue_41(WebDriver driver,String Value_41) {
		            BrowserActions.type(driver, inpValue_41,Value_41, "Value_41");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_36(WebDriver driver,String MBeanPropertyName_36) {
		            BrowserActions.type(driver, inpMBeanPropertyName_36,MBeanPropertyName_36, "MBeanPropertyName_36");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterValue(WebDriver driver,String Value) {
		            BrowserActions.type(driver, inpValue,Value, "Value");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickCancel_19(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_19,"Cancel_19");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_23(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_23,"Cancel_23");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_27(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_27,"Cancel_27");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickSave_6(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_6,"Save_6");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_40(WebDriver driver,String MBeanPropertyName_40) {
		            BrowserActions.type(driver, inpMBeanPropertyName_40,MBeanPropertyName_40, "MBeanPropertyName_40");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_42(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_42,"Save_42");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_35(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_35,"Cancel_35");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_39(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_39,"Cancel_39");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_31(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_31,"Cancel_31");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterOperation_1(WebDriver driver,String Operation_1) {
		            BrowserActions.type(driver, inpOperation_1,Operation_1, "Operation_1");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickBacktomanagementbeans(WebDriver driver)  {
					BrowserActions.click(driver, btnBacktomanagementbeans,"Backtomanagementbeans");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_43(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_43,"Cancel_43");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterOperation(WebDriver driver,String Operation) {
		            BrowserActions.type(driver, inpOperation,Operation, "Operation");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterValue_5(WebDriver driver,String Value_5) {
		            BrowserActions.type(driver, inpValue_5,Value_5, "Value_5");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickExecute_2(WebDriver driver)  {
					BrowserActions.click(driver, btnExecute_2,"Execute_2");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel_7(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel_7,"Cancel_7");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterValue_9(WebDriver driver,String Value_9) {
		            BrowserActions.type(driver, inpValue_9,Value_9, "Value_9");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_14(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_14,"Save_14");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_8(WebDriver driver,String MBeanPropertyName_8) {
		            BrowserActions.type(driver, inpMBeanPropertyName_8,MBeanPropertyName_8, "MBeanPropertyName_8");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_18(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_18,"Save_18");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_4(WebDriver driver,String MBeanPropertyName_4) {
		            BrowserActions.type(driver, inpMBeanPropertyName_4,MBeanPropertyName_4, "MBeanPropertyName_4");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_10(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_10,"Save_10");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterValue_13(WebDriver driver,String Value_13) {
		            BrowserActions.type(driver, inpValue_13,Value_13, "Value_13");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterValue_17(WebDriver driver,String Value_17) {
		            BrowserActions.type(driver, inpValue_17,Value_17, "Value_17");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave(WebDriver driver)  {
					BrowserActions.click(driver, btnSave,"Save");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterResult_3(WebDriver driver,String Result_3) {
		            BrowserActions.type(driver, inpResult_3,Result_3, "Result_3");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterValue_21(WebDriver driver,String Value_21) {
		            BrowserActions.type(driver, inpValue_21,Value_21, "Value_21");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterValue_25(WebDriver driver,String Value_25) {
		            BrowserActions.type(driver, inpValue_25,Value_25, "Value_25");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_12(WebDriver driver,String MBeanPropertyName_12) {
		            BrowserActions.type(driver, inpMBeanPropertyName_12,MBeanPropertyName_12, "MBeanPropertyName_12");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_38(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_38,"Save_38");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_16(WebDriver driver,String MBeanPropertyName_16) {
		            BrowserActions.type(driver, inpMBeanPropertyName_16,MBeanPropertyName_16, "MBeanPropertyName_16");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterResult(WebDriver driver,String Result) {
		            BrowserActions.type(driver, inpResult,Result, "Result");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_30(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_30,"Save_30");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickSave_34(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_34,"Save_34");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterValue_33(WebDriver driver,String Value_33) {
		            BrowserActions.type(driver, inpValue_33,Value_33, "Value_33");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterValue_37(WebDriver driver,String Value_37) {
		            BrowserActions.type(driver, inpValue_37,Value_37, "Value_37");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_24(WebDriver driver,String MBeanPropertyName_24) {
		            BrowserActions.type(driver, inpMBeanPropertyName_24,MBeanPropertyName_24, "MBeanPropertyName_24");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_20(WebDriver driver,String MBeanPropertyName_20) {
		            BrowserActions.type(driver, inpMBeanPropertyName_20,MBeanPropertyName_20, "MBeanPropertyName_20");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_26(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_26,"Save_26");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName(WebDriver driver,String MBeanPropertyName) {
		            BrowserActions.type(driver, inpMBeanPropertyName,MBeanPropertyName, "MBeanPropertyName");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterMBeanPropertyName_28(WebDriver driver,String MBeanPropertyName_28) {
		            BrowserActions.type(driver, inpMBeanPropertyName_28,MBeanPropertyName_28, "MBeanPropertyName_28");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage enterValue_29(WebDriver driver,String Value_29) {
		            BrowserActions.type(driver, inpValue_29,Value_29, "Value_29");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickSave_22(WebDriver driver)  {
					BrowserActions.click(driver, btnSave_22,"Save_22");
				    return this;
			}
public GuidewireManagedBeanPropertiesPage verifyNodeStatusJsonExecute(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnExecute,"nodeStatusJson execute");
    return this;
}

public GuidewireManagedBeanPropertiesPage verifyResetExecute(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnExecute_2,"Reset");
	return this;
}

public GuidewireManagedBeanPropertiesPage verifyMBeanPropertyName(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblMBeanPropertyName,"MBean Property Name");
	Log.messageStep("MBeanPropertyName is Displayed",DriverManager.getDriver());
	return this;
}
public GuidewireManagedBeanPropertiesPage verifyBackToManagementBeans(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnBacktomanagementbeans,"Back To Management beans");
	Log.messageStep("NodeStatusJsonExecute ,ResetExecute, BackToManagementBeans Buttons were Displayed",DriverManager.getDriver());
	return this;
}

}
