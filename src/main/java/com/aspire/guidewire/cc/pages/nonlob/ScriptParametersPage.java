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

public class ScriptParametersPage extends LoadableComponent<ScriptParametersPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-6-Name']", AI = false)
	private WebElement inpName_16;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-6-Type']", AI = false)
	private WebElement inpType_17;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-5-Name']", AI = false)
	private WebElement inpName_13;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-4-Name']", AI = false)
	private WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-14-Value']", AI = false)
	private WebElement inpValue_42;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-3-Value']", AI = false)
	private WebElement inpValue_9;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-8-Type']", AI = false)
	private WebElement inpType_23;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-7-Type']", AI = false)
	private WebElement inpType_20;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-9-Type']", AI = false)
	private WebElement inpType_26;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-7-Name']", AI = false)
	private WebElement inpName_19;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-4-Value']", AI = false)
	private WebElement inpValue_12;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-14-Name']", AI = false)
	private WebElement inpName_40;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-5-Value']", AI = false)
	private WebElement inpValue_15;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-0-Type']", AI = false)
	private WebElement inpType;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-4-Type']", AI = false)
	private WebElement inpType_11;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-5-Type']", AI = false)
	private WebElement inpType_14;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-7-Value']", AI = false)
	private WebElement inpValue_21;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-11-Name']", AI = false)
	private WebElement inpName_31;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-8-Value']", AI = false)
	private WebElement inpValue_24;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-9-Value']", AI = false)
	private WebElement inpValue_27;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-13-Name']", AI = false)
	private WebElement inpName_37;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-12-Name']", AI = false)
	private WebElement inpName_34;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-6-Value']", AI = false)
	private WebElement inpValue_18;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-14-Type']", AI = false)
	private WebElement inpType_41;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-11-Value']", AI = false)
	private WebElement inpValue_33;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-12-Value']", AI = false)
	private WebElement inpValue_36;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-13-Value']", AI = false)
	private WebElement inpValue_39;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-10-Name']", AI = false)
	private WebElement inpName_28;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-9-Name']", AI = false)
	private WebElement inpName_25;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-1-Value']", AI = false)
	private WebElement inpValue_3;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-10-Type']", AI = false)
	private WebElement inpType_29;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-2-Value']", AI = false)
	private WebElement inpValue_6;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-8-Name']", AI = false)
	private WebElement inpName_22;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-10-Value']", AI = false)
	private WebElement inpValue_30;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-11-Type']", AI = false)
	private WebElement inpType_32;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-13-Type']", AI = false)
	private WebElement inpType_38;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-12-Type']", AI = false)
	private WebElement inpType_35;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-1-Name']", AI = false)
	private WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-1-Type']", AI = false)
	private WebElement inpType_2;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-2-Type']", AI = false)
	private WebElement inpType_5;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-2-Name']", AI = false)
	private WebElement inpName_4;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-3-Name']", AI = false)
	private WebElement inpName_7;

	@IFindBy(how = How.CSS, using = "input[name='ScriptParametersPage-ScriptParametersScreen-ScriptParametersLV-3-Type']", AI = false)
	private WebElement inpType_8;

	@IFindBy(how = How.CSS, using = "div[id$='ScriptParametersLV-0-Name_button']", AI = false)
	private WebElement btnName;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='ScriptParametersLV-0-Value']", AI = false)
	private WebElement lblValue;

	@IFindBy(how = How.CSS, using = "input[name$='ScriptParameterDetailDV-VarcharValue']", AI = false)
	private WebElement inpValue;

	@IFindBy(how = How.CSS, using = "div[id$='ScriptParameterDetail_UpLink']", AI = false)
	private WebElement btnUptoScriptParameter;
	
	@IFindBy(how = How.CSS, using = "div[id$='ScriptParametersScreen-0']", AI = false)
	private WebElement lblttl;


	public ScriptParametersPage(){
	}

	public ScriptParametersPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpType_8))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ScriptParametersPage enterName_16(WebDriver driver,String Name_16) {
		BrowserActions.type(driver, inpName_16,Name_16, "Name_16");
		return this;
	}
	public ScriptParametersPage enterType_17(WebDriver driver,String Type_17) {
		BrowserActions.type(driver, inpType_17,Type_17, "Type_17");
		return this;
	}
	public ScriptParametersPage enterName_13(WebDriver driver,String Name_13) {
		BrowserActions.type(driver, inpName_13,Name_13, "Name_13");
		return this;
	}
	public ScriptParametersPage enterName_10(WebDriver driver,String Name_10) {
		BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
		return this;
	}
	public ScriptParametersPage enterValue_42(WebDriver driver,String Value_42) {
		BrowserActions.type(driver, inpValue_42,Value_42, "Value_42");
		return this;
	}
	public ScriptParametersPage enterValue_9(WebDriver driver,String Value_9) {
		BrowserActions.type(driver, inpValue_9,Value_9, "Value_9");
		return this;
	}
	public ScriptParametersPage enterType_23(WebDriver driver,String Type_23) {
		BrowserActions.type(driver, inpType_23,Type_23, "Type_23");
		return this;
	}
	public ScriptParametersPage enterType_20(WebDriver driver,String Type_20) {
		BrowserActions.type(driver, inpType_20,Type_20, "Type_20");
		return this;
	}
	public ScriptParametersPage enterType_26(WebDriver driver,String Type_26) {
		BrowserActions.type(driver, inpType_26,Type_26, "Type_26");
		return this;
	}
	public ScriptParametersPage enterValue(WebDriver driver,String Value) {
		BrowserActions.type(driver, inpValue,Value, "Value");
		return this;
	}
	public ScriptParametersPage enterName_19(WebDriver driver,String Name_19) {
		BrowserActions.type(driver, inpName_19,Name_19, "Name_19");
		return this;
	}
	public ScriptParametersPage enterValue_12(WebDriver driver,String Value_12) {
		BrowserActions.type(driver, inpValue_12,Value_12, "Value_12");
		return this;
	}
	public ScriptParametersPage enterName_40(WebDriver driver,String Name_40) {
		BrowserActions.type(driver, inpName_40,Name_40, "Name_40");
		return this;
	}
	public ScriptParametersPage enterValue_15(WebDriver driver,String Value_15) {
		BrowserActions.type(driver, inpValue_15,Value_15, "Value_15");
		return this;
	}
	public ScriptParametersPage enterType(WebDriver driver,String Type) {
		BrowserActions.type(driver, inpType,Type, "Type");
		return this;
	}
	public ScriptParametersPage enterType_11(WebDriver driver,String Type_11) {
		BrowserActions.type(driver, inpType_11,Type_11, "Type_11");
		return this;
	}
	public ScriptParametersPage enterType_14(WebDriver driver,String Type_14) {
		BrowserActions.type(driver, inpType_14,Type_14, "Type_14");
		return this;
	}
	public ScriptParametersPage enterValue_21(WebDriver driver,String Value_21) {
		BrowserActions.type(driver, inpValue_21,Value_21, "Value_21");
		return this;
	}
	public ScriptParametersPage enterName_31(WebDriver driver,String Name_31) {
		BrowserActions.type(driver, inpName_31,Name_31, "Name_31");
		return this;
	}
	public ScriptParametersPage enterValue_24(WebDriver driver,String Value_24) {
		BrowserActions.type(driver, inpValue_24,Value_24, "Value_24");
		return this;
	}
	public ScriptParametersPage enterValue_27(WebDriver driver,String Value_27) {
		BrowserActions.type(driver, inpValue_27,Value_27, "Value_27");
		return this;
	}
	public ScriptParametersPage enterName_37(WebDriver driver,String Name_37) {
		BrowserActions.type(driver, inpName_37,Name_37, "Name_37");
		return this;
	}
	public ScriptParametersPage enterName_34(WebDriver driver,String Name_34) {
		BrowserActions.type(driver, inpName_34,Name_34, "Name_34");
		return this;
	}
	public ScriptParametersPage enterValue_18(WebDriver driver,String Value_18) {
		BrowserActions.type(driver, inpValue_18,Value_18, "Value_18");
		return this;
	}
	public ScriptParametersPage enterType_41(WebDriver driver,String Type_41) {
		BrowserActions.type(driver, inpType_41,Type_41, "Type_41");
		return this;
	}
	public ScriptParametersPage enterValue_33(WebDriver driver,String Value_33) {
		BrowserActions.type(driver, inpValue_33,Value_33, "Value_33");
		return this;
	}
	public ScriptParametersPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public ScriptParametersPage enterValue_36(WebDriver driver,String Value_36) {
		BrowserActions.type(driver, inpValue_36,Value_36, "Value_36");
		return this;
	}
	public ScriptParametersPage enterValue_39(WebDriver driver,String Value_39) {
		BrowserActions.type(driver, inpValue_39,Value_39, "Value_39");
		return this;
	}
	public ScriptParametersPage enterName_28(WebDriver driver,String Name_28) {
		BrowserActions.type(driver, inpName_28,Name_28, "Name_28");
		return this;
	}
	public ScriptParametersPage enterName_25(WebDriver driver,String Name_25) {
		BrowserActions.type(driver, inpName_25,Name_25, "Name_25");
		return this;
	}
	public ScriptParametersPage enterValue_3(WebDriver driver,String Value_3) {
		BrowserActions.type(driver, inpValue_3,Value_3, "Value_3");
		return this;
	}
	public ScriptParametersPage enterType_29(WebDriver driver,String Type_29) {
		BrowserActions.type(driver, inpType_29,Type_29, "Type_29");
		return this;
	}
	public ScriptParametersPage enterValue_6(WebDriver driver,String Value_6) {
		BrowserActions.type(driver, inpValue_6,Value_6, "Value_6");
		return this;
	}
	public ScriptParametersPage enterName_22(WebDriver driver,String Name_22) {
		BrowserActions.type(driver, inpName_22,Name_22, "Name_22");
		return this;
	}
	public ScriptParametersPage enterValue_30(WebDriver driver,String Value_30) {
		BrowserActions.type(driver, inpValue_30,Value_30, "Value_30");
		return this;
	}
	public ScriptParametersPage enterType_32(WebDriver driver,String Type_32) {
		BrowserActions.type(driver, inpType_32,Type_32, "Type_32");
		return this;
	}
	public ScriptParametersPage enterType_38(WebDriver driver,String Type_38) {
		BrowserActions.type(driver, inpType_38,Type_38, "Type_38");
		return this;
	}
	public ScriptParametersPage enterType_35(WebDriver driver,String Type_35) {
		BrowserActions.type(driver, inpType_35,Type_35, "Type_35");
		return this;
	}
	public ScriptParametersPage enterName_1(WebDriver driver,String Name_1) {
		BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
		return this;
	}
	public ScriptParametersPage enterType_2(WebDriver driver,String Type_2) {
		BrowserActions.type(driver, inpType_2,Type_2, "Type_2");
		return this;
	}
	public ScriptParametersPage enterType_5(WebDriver driver,String Type_5) {
		BrowserActions.type(driver, inpType_5,Type_5, "Type_5");
		return this;
	}
	public ScriptParametersPage enterName_4(WebDriver driver,String Name_4) {
		BrowserActions.type(driver, inpName_4,Name_4, "Name_4");
		return this;
	}
	public ScriptParametersPage enterName_7(WebDriver driver,String Name_7) {
		BrowserActions.type(driver, inpName_7,Name_7, "Name_7");
		return this;
	}
	public ScriptParametersPage enterType_8(WebDriver driver,String Type_8) {
		BrowserActions.type(driver, inpType_8,Type_8, "Type_8");
		return this;
	}
	
	public ScriptParametersPage clickUpdate(WebDriver driver) {
		BrowserActions.click(driver, btnUpdate, "Update");
		return this;
	}

	public ScriptParametersPage clickCancel(WebDriver driver) {
		BrowserActions.click(driver, btnCancel, "Cancel");
		return this;
	}

	public ScriptParametersPage clickEdit(WebDriver driver) {
		BrowserActions.click(driver, btnEdit, "Edit");
		return this;
	}

	public ScriptParametersPage clickScriptParameterName(WebDriver driver) {
		BrowserActions.click(driver, btnName, "Name button");
		return this;
	}

	public String getScriptParameterValue(WebDriver driver) {
		String value = BrowserActions.getText(driver, lblValue, "Value");
		return value;
	}
	
	public void verifyScriptParameterValue(WebDriver driver,String beforeUpdateValue) {
		BrowserActions.waitForElementToDisplay(driver, lblValue);
		String afterUpdateValue = BrowserActions.getText(driver, lblValue, "Value");
		if(!afterUpdateValue.equals(beforeUpdateValue)) {
			Log.message(beforeUpdateValue +" Parameter value updated as "+ afterUpdateValue);
		}
		else {
			Log.message("No update in parameter value remains same parameter value as: "+ afterUpdateValue);
		}
	}

	public void verifyScriptParameterValueIsUpdated(WebDriver driver,String beforeUpdateValue) {
		String afterUpdateValue = BrowserActions.getText(driver, lblValue, "Value");
		Log.assertThat(afterUpdateValue.equals(beforeUpdateValue), "Value has been Updated", "Value has not been updated");
	}

	public void verifyScriptParameterMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblttl,"Script Parameter Page Title");
	}

	public ScriptParametersPage clickUptoScriptParameter(WebDriver driver) {
		BrowserActions.click(driver, btnUptoScriptParameter, "Up to ScriptParameter");
		return this;
	}

}
