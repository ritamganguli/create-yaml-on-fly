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

public class ManagementBeansPage extends LoadableComponent<ManagementBeansPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public MBeans mbeansTable;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-9-BeanName']", AI = false)
	private WebElement inpBeanName_9;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-4-BeanName']", AI = false)
	private WebElement inpBeanName_4;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-3-BeanName']", AI = false)
	private WebElement inpBeanName_3;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-2-BeanName']", AI = false)
	private WebElement inpBeanName_2;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-1-BeanName']", AI = false)
	private WebElement inpBeanName_1;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-8-BeanName']", AI = false)
	private WebElement inpBeanName_8;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-7-BeanName']", AI = false)
	private WebElement inpBeanName_7;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-6-BeanName']", AI = false)
	private WebElement inpBeanName_6;

	@IFindBy(how = How.CSS, using = "div[id='MBeans-MBeansScreen-MBeansLV-MBeansLV-5-BeanName']", AI = false)
	private WebElement inpBeanName_5;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-42-BeanName']", AI = false)
	private WebElement inpBeanName_42;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-41-BeanName']", AI = false)
	private WebElement inpBeanName_41;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-40-BeanName']", AI = false)
	private WebElement inpBeanName_40;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-0-BeanName']", AI = false)
	private WebElement inpBeanName;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-44-BeanName']", AI = false)
	private WebElement inpBeanName_44;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-43-BeanName']", AI = false)
	private WebElement inpBeanName_43;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-31-BeanName']", AI = false)
	private WebElement inpBeanName_31;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-30-BeanName']", AI = false)
	private WebElement inpBeanName_30;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-39-BeanName']", AI = false)
	private WebElement inpBeanName_39;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-38-BeanName']", AI = false)
	private WebElement inpBeanName_38;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-37-BeanName']", AI = false)
	private WebElement inpBeanName_37;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-36-BeanName']", AI = false)
	private WebElement inpBeanName_36;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-35-BeanName']", AI = false)
	private WebElement inpBeanName_35;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-34-BeanName']", AI = false)
	private WebElement inpBeanName_34;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-33-BeanName']", AI = false)
	private WebElement inpBeanName_33;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-32-BeanName']", AI = false)
	private WebElement inpBeanName_32;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-29-BeanName']", AI = false)
	private WebElement inpBeanName_29;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-20-BeanName']", AI = false)
	private WebElement inpBeanName_20;

	@IFindBy(how = How.CSS, using = "#MBeans-MBeansScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-28-BeanName']", AI = false)
	private WebElement inpBeanName_28;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-27-BeanName']", AI = false)
	private WebElement inpBeanName_27;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-26-BeanName']", AI = false)
	private WebElement inpBeanName_26;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-25-BeanName']", AI = false)
	private WebElement inpBeanName_25;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-24-BeanName']", AI = false)
	private WebElement inpBeanName_24;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-23-BeanName']", AI = false)
	private WebElement inpBeanName_23;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-22-BeanName']", AI = false)
	private WebElement inpBeanName_22;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-21-BeanName']", AI = false)
	private WebElement inpBeanName_21;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-19-BeanName']", AI = false)
	private WebElement inpBeanName_19;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-18-BeanName']", AI = false)
	private WebElement inpBeanName_18;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-17-BeanName']", AI = false)
	private WebElement inpBeanName_17;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-16-BeanName']", AI = false)
	private WebElement inpBeanName_16;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-15-BeanName']", AI = false)
	private WebElement inpBeanName_15;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-14-BeanName']", AI = false)
	private WebElement inpBeanName_14;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-13-BeanName']", AI = false)
	private WebElement inpBeanName_13;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-12-BeanName']", AI = false)
	private WebElement inpBeanName_12;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-11-BeanName']", AI = false)
	private WebElement inpBeanName_11;

	@IFindBy(how = How.CSS, using = "input[name='MBeans-MBeansScreen-MBeansLV-MBeansLV-10-BeanName']", AI = false)
	private WebElement inpBeanName_10;

	public ManagementBeansPage(){
	}

	public ManagementBeansPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//mbeansTable = new MBeans();
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
}public ManagementBeansPage enterBeanName_9(WebDriver driver,String BeanName_9) {
		            BrowserActions.type(driver, inpBeanName_9,BeanName_9, "BeanName_9");
			        return this;
           }
public ManagementBeansPage enterBeanName_4(WebDriver driver,String BeanName_4) {
		            BrowserActions.type(driver, inpBeanName_4,BeanName_4, "BeanName_4");
			        return this;
           }
public ManagementBeansPage enterBeanName_3(WebDriver driver,String BeanName_3) {
		            BrowserActions.type(driver, inpBeanName_3,BeanName_3, "BeanName_3");
			        return this;
           }
public ManagementBeansPage enterBeanName_2(WebDriver driver,String BeanName_2) {
		            BrowserActions.type(driver, inpBeanName_2,BeanName_2, "BeanName_2");
			        return this;
           }
public ManagementBeansPage enterBeanName_1(WebDriver driver,String BeanName_1) {
		            BrowserActions.type(driver, inpBeanName_1,BeanName_1, "BeanName_1");
			        return this;
           }
public ManagementBeansPage enterBeanName_8(WebDriver driver,String BeanName_8) {
		            BrowserActions.type(driver, inpBeanName_8,BeanName_8, "BeanName_8");
			        return this;
           }
public ManagementBeansPage enterBeanName_7(WebDriver driver,String BeanName_7) {
		            BrowserActions.type(driver, inpBeanName_7,BeanName_7, "BeanName_7");
			        return this;
           }
public ManagementBeansPage enterBeanName_6(WebDriver driver,String BeanName_6) {
		            BrowserActions.type(driver, inpBeanName_6,BeanName_6, "BeanName_6");
			        return this;
           }
public ManagementBeansPage enterBeanName_5(WebDriver driver,String BeanName_5) {
		            BrowserActions.type(driver, inpBeanName_5,BeanName_5, "BeanName_5");
			        return this;
           }
public ManagementBeansPage enterBeanName_42(WebDriver driver,String BeanName_42) {
		            BrowserActions.type(driver, inpBeanName_42,BeanName_42, "BeanName_42");
			        return this;
           }
public ManagementBeansPage enterBeanName_41(WebDriver driver,String BeanName_41) {
		            BrowserActions.type(driver, inpBeanName_41,BeanName_41, "BeanName_41");
			        return this;
           }
public ManagementBeansPage enterBeanName_40(WebDriver driver,String BeanName_40) {
		            BrowserActions.type(driver, inpBeanName_40,BeanName_40, "BeanName_40");
			        return this;
           }
public ManagementBeansPage enterBeanName(WebDriver driver,String BeanName) {
		            BrowserActions.type(driver, inpBeanName,BeanName, "BeanName");
			        return this;
           }
public ManagementBeansPage enterBeanName_44(WebDriver driver,String BeanName_44) {
		            BrowserActions.type(driver, inpBeanName_44,BeanName_44, "BeanName_44");
			        return this;
           }
public ManagementBeansPage enterBeanName_43(WebDriver driver,String BeanName_43) {
		            BrowserActions.type(driver, inpBeanName_43,BeanName_43, "BeanName_43");
			        return this;
           }
public ManagementBeansPage enterBeanName_31(WebDriver driver,String BeanName_31) {
		            BrowserActions.type(driver, inpBeanName_31,BeanName_31, "BeanName_31");
			        return this;
           }
public ManagementBeansPage enterBeanName_30(WebDriver driver,String BeanName_30) {
		            BrowserActions.type(driver, inpBeanName_30,BeanName_30, "BeanName_30");
			        return this;
           }
public ManagementBeansPage enterBeanName_39(WebDriver driver,String BeanName_39) {
		            BrowserActions.type(driver, inpBeanName_39,BeanName_39, "BeanName_39");
			        return this;
           }
public ManagementBeansPage enterBeanName_38(WebDriver driver,String BeanName_38) {
		            BrowserActions.type(driver, inpBeanName_38,BeanName_38, "BeanName_38");
			        return this;
           }
public ManagementBeansPage enterBeanName_37(WebDriver driver,String BeanName_37) {
		            BrowserActions.type(driver, inpBeanName_37,BeanName_37, "BeanName_37");
			        return this;
           }
public ManagementBeansPage enterBeanName_36(WebDriver driver,String BeanName_36) {
		            BrowserActions.type(driver, inpBeanName_36,BeanName_36, "BeanName_36");
			        return this;
           }
public ManagementBeansPage enterBeanName_35(WebDriver driver,String BeanName_35) {
		            BrowserActions.type(driver, inpBeanName_35,BeanName_35, "BeanName_35");
			        return this;
           }
public ManagementBeansPage enterBeanName_34(WebDriver driver,String BeanName_34) {
		            BrowserActions.type(driver, inpBeanName_34,BeanName_34, "BeanName_34");
			        return this;
           }
public ManagementBeansPage enterBeanName_33(WebDriver driver,String BeanName_33) {
		            BrowserActions.type(driver, inpBeanName_33,BeanName_33, "BeanName_33");
			        return this;
           }
public ManagementBeansPage enterBeanName_32(WebDriver driver,String BeanName_32) {
		            BrowserActions.type(driver, inpBeanName_32,BeanName_32, "BeanName_32");
			        return this;
           }
public ManagementBeansPage enterBeanName_29(WebDriver driver,String BeanName_29) {
		            BrowserActions.type(driver, inpBeanName_29,BeanName_29, "BeanName_29");
			        return this;
           }
public ManagementBeansPage enterBeanName_20(WebDriver driver,String BeanName_20) {
		            BrowserActions.type(driver, inpBeanName_20,BeanName_20, "BeanName_20");
			        return this;
           }
public ManagementBeansPage enterBeanName_28(WebDriver driver,String BeanName_28) {
		            BrowserActions.type(driver, inpBeanName_28,BeanName_28, "BeanName_28");
			        return this;
           }
public ManagementBeansPage enterBeanName_27(WebDriver driver,String BeanName_27) {
		            BrowserActions.type(driver, inpBeanName_27,BeanName_27, "BeanName_27");
			        return this;
           }
public ManagementBeansPage enterBeanName_26(WebDriver driver,String BeanName_26) {
		            BrowserActions.type(driver, inpBeanName_26,BeanName_26, "BeanName_26");
			        return this;
           }
public ManagementBeansPage enterBeanName_25(WebDriver driver,String BeanName_25) {
		            BrowserActions.type(driver, inpBeanName_25,BeanName_25, "BeanName_25");
			        return this;
           }
public ManagementBeansPage enterBeanName_24(WebDriver driver,String BeanName_24) {
		            BrowserActions.type(driver, inpBeanName_24,BeanName_24, "BeanName_24");
			        return this;
           }
public ManagementBeansPage enterBeanName_23(WebDriver driver,String BeanName_23) {
		            BrowserActions.type(driver, inpBeanName_23,BeanName_23, "BeanName_23");
			        return this;
           }
public ManagementBeansPage enterBeanName_22(WebDriver driver,String BeanName_22) {
		            BrowserActions.type(driver, inpBeanName_22,BeanName_22, "BeanName_22");
			        return this;
           }
public ManagementBeansPage enterBeanName_21(WebDriver driver,String BeanName_21) {
		            BrowserActions.type(driver, inpBeanName_21,BeanName_21, "BeanName_21");
			        return this;
           }
public ManagementBeansPage enterBeanName_19(WebDriver driver,String BeanName_19) {
		            BrowserActions.type(driver, inpBeanName_19,BeanName_19, "BeanName_19");
			        return this;
           }
public ManagementBeansPage enterBeanName_18(WebDriver driver,String BeanName_18) {
		            BrowserActions.type(driver, inpBeanName_18,BeanName_18, "BeanName_18");
			        return this;
           }
public ManagementBeansPage enterBeanName_17(WebDriver driver,String BeanName_17) {
		            BrowserActions.type(driver, inpBeanName_17,BeanName_17, "BeanName_17");
			        return this;
           }
public ManagementBeansPage enterBeanName_16(WebDriver driver,String BeanName_16) {
		            BrowserActions.type(driver, inpBeanName_16,BeanName_16, "BeanName_16");
			        return this;
           }
public ManagementBeansPage enterBeanName_15(WebDriver driver,String BeanName_15) {
		            BrowserActions.type(driver, inpBeanName_15,BeanName_15, "BeanName_15");
			        return this;
           }
public ManagementBeansPage enterBeanName_14(WebDriver driver,String BeanName_14) {
		            BrowserActions.type(driver, inpBeanName_14,BeanName_14, "BeanName_14");
			        return this;
           }
public ManagementBeansPage enterBeanName_13(WebDriver driver,String BeanName_13) {
		            BrowserActions.type(driver, inpBeanName_13,BeanName_13, "BeanName_13");
			        return this;
           }
public ManagementBeansPage enterBeanName_12(WebDriver driver,String BeanName_12) {
		            BrowserActions.type(driver, inpBeanName_12,BeanName_12, "BeanName_12");
			        return this;
           }
public ManagementBeansPage enterBeanName_11(WebDriver driver,String BeanName_11) {
		            BrowserActions.type(driver, inpBeanName_11,BeanName_11, "BeanName_11");
			        return this;
           }
public ManagementBeansPage enterBeanName_10(WebDriver driver,String BeanName_10) {
		            BrowserActions.type(driver, inpBeanName_10,BeanName_10, "BeanName_10");
			        return this;
           }
public GuidewireManagedBeanPropertiesPage clickInputBean_5(WebDriver driver) {
	BrowserActions.click(driver, inpBeanName_5, "BeanName_5");
	return new GuidewireManagedBeanPropertiesPage(driver).get();
}
}
