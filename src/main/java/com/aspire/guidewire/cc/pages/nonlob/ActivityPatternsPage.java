package com.aspire.guidewire.cc.pages.nonlob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
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

public class ActivityPatternsPage extends LoadableComponent<ActivityPatternsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "#ActivityPatterns-ActivityPatternsScreen-ActivityPatternsTitle", AI = false)
	public WebElement lblActivityPatternsTitle;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_36;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Category']", AI = false)
	public WebElement drpCategory_4;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Type']", AI = false)
	public WebElement drpType_75;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Type']", AI = false)
	public WebElement drpType_82;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-ActivityClass']", AI = false)
	public WebElement drpClass_10;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-ActivityPatternsFilter']", AI = false)
	public WebElement drpActivityPatternsFilter_1;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Priority']", AI = false)
	public WebElement drpPriority_41;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-ActivityClass']", AI = false)
	public WebElement drpClass_17;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Category']", AI = false)
	public WebElement drpCategory;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Category']", AI = false)
	public WebElement drpCategory_88;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Subject']", AI = false)
	public WebElement inpSubject_51;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-ActivityPatternsFilter']", AI = false)
	public WebElement drpActivityPatternsFilter;

	@IFindBy(how = How.CSS, using = "#ActivityPatterns-ActivityPatternsScreen-ActivityPatterns_NewActivityPatternButton>div[role='button']", AI = false)
	public WebElement btnNewActivityPattern;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Mandatory']", AI = false)
	public WebElement rdbMandatory_63;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Category']", AI = false)
	public WebElement drpCategory_81;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-ActivityClass']", AI = false)
	public WebElement drpClass_94;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_43;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Priority']", AI = false)
	public WebElement drpPriority_48;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Subject']", AI = false)
	public WebElement inpSubject_58;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Subject']", AI = false)
	public WebElement inpSubject_9;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_29;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Type']", AI = false)
	public WebElement drpType_89;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Subject']", AI = false)
	public WebElement inpSubject_2;

	@IFindBy(how = How.CSS, using = "input[name$='Subject']", AI = false)
	public WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-ActivityClass']", AI = false)
	public WebElement drpClass_24;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Priority']", AI = false)
	public WebElement drpPriority_34;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Category']", AI = false)
	public WebElement drpCategory_11;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Mandatory']", AI = false)
	public WebElement rdbMandatory_56;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Priority']", AI = false)
	public WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Subject']", AI = false)
	public WebElement inpSubject_65;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Category']", AI = false)
	public WebElement drpCategory_95;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_15;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Type']", AI = false)
	public WebElement drpType_19;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Type']", AI = false)
	public WebElement drpType_12;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Type']", AI = false)
	public WebElement drpType_96;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-ActivityClass']", AI = false)
	public WebElement drpClass_38;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Priority']", AI = false)
	public WebElement drpPriority_20;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Mandatory']", AI = false)
	public WebElement rdbMandatory_49;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Subject']", AI = false)
	public WebElement inpSubject_30;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Mandatory']", AI = false)
	public WebElement rdbMandatory_42;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Priority']", AI = false)
	public WebElement drpPriority_27;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Type']", AI = false)
	public WebElement drpType_5;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-ActivityClass']", AI = false)
	public WebElement drpClass_31;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_22;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Category']", AI = false)
	public WebElement drpCategory_60;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Subject']", AI = false)
	public WebElement inpSubject_37;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Category']", AI = false)
	public WebElement drpCategory_67;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Type']", AI = false)
	public WebElement drpType_26;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-ActivityClass']", AI = false)
	public WebElement drpClass_45;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Priority']", AI = false)
	public WebElement drpPriority_90;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Priority']", AI = false)
	public WebElement drpPriority_97;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Mandatory']", AI = false)
	public WebElement rdbMandatory_35;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Priority']", AI = false)
	public WebElement drpPriority_13;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_92;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Category']", AI = false)
	public WebElement drpCategory_74;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_99;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Subject']", AI = false)
	public WebElement inpSubject_44;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_8;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_78;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Category']", AI = false)
	public WebElement drpCategory_39;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-ActivityClass']", AI = false)
	public WebElement drpClass;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Type']", AI = false)
	public WebElement drpType_33;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Mandatory']", AI = false)
	public WebElement rdbMandatory_28;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Type']", AI = false)
	public WebElement drpType_40;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Priority']", AI = false)
	public WebElement drpPriority_83;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-ActivityClass']", AI = false)
	public WebElement drpClass_59;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Subject']", AI = false)
	public WebElement inpSubject_93;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Mandatory']", AI = false)
	public WebElement rdbMandatory_21;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-ActivityClass']", AI = false)
	public WebElement drpClass_52;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_85;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Mandatory']", AI = false)
	public WebElement rdbMandatory_91;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Subject']", AI = false)
	public WebElement inpSubject_16;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Category']", AI = false)
	public WebElement drpCategory_46;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Type']", AI = false)
	public WebElement drpType_47;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Mandatory']", AI = false)
	public WebElement rdbMandatory_7;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-ActivityClass']", AI = false)
	public WebElement drpClass_66;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Mandatory']", AI = false)
	public WebElement rdbMandatory_14;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_71;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Priority']", AI = false)
	public WebElement drpPriority_76;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Category']", AI = false)
	public WebElement drpCategory_53;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Mandatory']", AI = false)
	public WebElement rdbMandatory_98;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Subject']", AI = false)
	public WebElement inpSubject_23;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Category']", AI = false)
	public WebElement drpCategory_18;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_57;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Type']", AI = false)
	public WebElement drpType_54;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Type']", AI = false)
	public WebElement drpType_61;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteButton']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Priority']", AI = false)
	public WebElement drpPriority_62;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Subject']", AI = false)
	public WebElement inpSubject_72;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Mandatory']", AI = false)
	public WebElement rdbMandatory;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_64;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Mandatory']", AI = false)
	public WebElement rdbMandatory_84;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Priority']", AI = false)
	public WebElement drpPriority_69;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-ActivityClass']", AI = false)
	public WebElement drpClass_73;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Mandatory']", AI = false)
	public WebElement rdbMandatory_70;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Subject']", AI = false)
	public WebElement inpSubject_79;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Category']", AI = false)
	public WebElement drpCategory_25;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Priority']", AI = false)
	public WebElement drpPriority_6;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Type']", AI = false)
	public WebElement drpType_68;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-ActivityClass']", AI = false)
	public WebElement drpClass_3;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-ActivityClass']", AI = false)
	public WebElement drpClass_87;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Category']", AI = false)
	public WebElement drpCategory_32;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Mandatory']", AI = false)
	public WebElement rdbMandatory_77;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-AutomatedOnly']", AI = false)
	public WebElement rdbAutomated_50;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Priority']", AI = false)
	public WebElement drpPriority_55;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-ActivityClass']", AI = false)
	public WebElement drpClass_80;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Subject']", AI = false)
	public WebElement inpSubject_86;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternsLV-0-Subject_button']", AI = false)
	public WebElement btnSubject;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternsLV-0-ActivityClass']", AI = false)
	public WebElement lblClass;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternsLV-0-Category']", AI = false)
	public WebElement lblCategory;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternsLV-0-Type']", AI = false)
	public WebElement lblType;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternsLV-0-Priority']", AI = false)
	public WebElement lblPriority;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternsLV-0-Mandatory']", AI = false)
	public WebElement lblMandatory;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternsLV-0-AutomatedOnly']", AI = false)
	public WebElement lblAutomated;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public WebElement lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-first']", AI = false)
	public WebElement btnFirstPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternDetail_UpLink']", AI = false)
	public WebElement btnUptoActivityPattern;

	public String activitySubjectList = "div[id$='Subject_button']";


	public ActivityPatternsPage(){
	}

	public ActivityPatternsPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpSubject_86))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ActivityPatternsPage clickAutomated_36(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_36,"Automated_36");
		return this;
	}
	public ActivityPatternsPage selectCategory_4(WebDriver driver,String Category_4)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_4,Category_4,"Category_4");
		return this;
	}
	public ActivityPatternsPage selectType_75(WebDriver driver,String Type_75)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_75,Type_75,"Type_75");
		return this;
	}
	public ActivityPatternsPage selectType_82(WebDriver driver,String Type_82)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_82,Type_82,"Type_82");
		return this;
	}
	public ActivityPatternsPage selectClass_10(WebDriver driver,String Class_10)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_10,Class_10,"Class_10");
		return this;
	}
	public ActivityPatternsPage selectActivityPatternsFilter_1(WebDriver driver,String ActivityPatternsFilter_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityPatternsFilter_1,ActivityPatternsFilter_1,"ActivityPatternsFilter_1");
		return this;
	}
	public ActivityPatternsPage selectPriority_41(WebDriver driver,String Priority_41)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_41,Priority_41,"Priority_41");
		return this;
	}
	public ActivityPatternsPage selectClass_17(WebDriver driver,String Class_17)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_17,Class_17,"Class_17");
		return this;
	}
	public ActivityPatternsPage selectCategory(WebDriver driver,String Category)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
		return this;
	}
	public ActivityPatternsPage selectCategory_88(WebDriver driver,String Category_88)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_88,Category_88,"Category_88");
		return this;
	}
	public ActivityPatternsPage enterSubject_51(WebDriver driver,String Subject_51) {
		BrowserActions.type(driver, inpSubject_51,Subject_51, "Subject_51");
		return this;
	}
	public ActivityPatternsPage selectActivityPatternsFilter(WebDriver driver,String ActivityPatternsFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityPatternsFilter,ActivityPatternsFilter,"ActivityPatternsFilter");
		return this;
	}
	public ActivityPatternsPage clickNewActivityPattern(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivityPattern,true,"NewActivityPattern");
		return this;
	}
	public ActivityPatternsPage clickMandatory_63(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_63,"Mandatory_63");
		return this;
	}
	public ActivityPatternsPage selectCategory_81(WebDriver driver,String Category_81)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_81,Category_81,"Category_81");
		return this;
	}
	public ActivityPatternsPage selectClass_94(WebDriver driver,String Class_94)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_94,Class_94,"Class_94");
		return this;
	}
	public ActivityPatternsPage clickAutomated_43(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_43,"Automated_43");
		return this;
	}
	public ActivityPatternsPage selectPriority_48(WebDriver driver,String Priority_48)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_48,Priority_48,"Priority_48");
		return this;
	}
	public ActivityPatternsPage enterSubject_58(WebDriver driver,String Subject_58) {
		BrowserActions.type(driver, inpSubject_58,Subject_58, "Subject_58");
		return this;
	}
	public ActivityPatternsPage enterSubject_9(WebDriver driver,String Subject_9) {
		BrowserActions.type(driver, inpSubject_9,Subject_9, "Subject_9");
		return this;
	}
	public ActivityPatternsPage clickAutomated_29(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_29,"Automated_29");
		return this;
	}
	public ActivityPatternsPage selectType_89(WebDriver driver,String Type_89)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_89,Type_89,"Type_89");
		return this;
	}
	public ActivityPatternsPage enterSubject_2(WebDriver driver,String Subject_2) {
		BrowserActions.type(driver, inpSubject_2,Subject_2, "Subject_2");
		return this;
	}
	public ActivityPatternsPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}
	public ActivityPatternsPage selectClass_24(WebDriver driver,String Class_24)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_24,Class_24,"Class_24");
		return this;
	}
	public ActivityPatternsPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public ActivityPatternsPage selectPriority_34(WebDriver driver,String Priority_34)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_34,Priority_34,"Priority_34");
		return this;
	}
	public ActivityPatternsPage selectCategory_11(WebDriver driver,String Category_11)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_11,Category_11,"Category_11");
		return this;
	}
	public ActivityPatternsPage clickMandatory_56(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_56,"Mandatory_56");
		return this;
	}
	public ActivityPatternsPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public ActivityPatternsPage enterSubject_65(WebDriver driver,String Subject_65) {
		BrowserActions.type(driver, inpSubject_65,Subject_65, "Subject_65");
		return this;
	}
	public ActivityPatternsPage selectCategory_95(WebDriver driver,String Category_95)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_95,Category_95,"Category_95");
		return this;
	}
	public ActivityPatternsPage clickAutomated_15(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_15,"Automated_15");
		return this;
	}
	public ActivityPatternsPage selectType_19(WebDriver driver,String Type_19)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_19,Type_19,"Type_19");
		return this;
	}
	public ActivityPatternsPage selectType_12(WebDriver driver,String Type_12)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_12,Type_12,"Type_12");
		return this;
	}
	public ActivityPatternsPage selectType_96(WebDriver driver,String Type_96)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_96,Type_96,"Type_96");
		return this;
	}
	public ActivityPatternsPage selectClass_38(WebDriver driver,String Class_38)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_38,Class_38,"Class_38");
		return this;
	}
	public ActivityPatternsPage selectPriority_20(WebDriver driver,String Priority_20)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_20,Priority_20,"Priority_20");
		return this;
	}
	public ActivityPatternsPage clickMandatory_49(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_49,"Mandatory_49");
		return this;
	}
	public ActivityPatternsPage enterSubject_30(WebDriver driver,String Subject_30) {
		BrowserActions.type(driver, inpSubject_30,Subject_30, "Subject_30");
		return this;
	}
	public ActivityPatternsPage clickMandatory_42(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_42,"Mandatory_42");
		return this;
	}
	public ActivityPatternsPage selectPriority_27(WebDriver driver,String Priority_27)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_27,Priority_27,"Priority_27");
		return this;
	}
	public ActivityPatternsPage selectType_5(WebDriver driver,String Type_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_5,Type_5,"Type_5");
		return this;
	}
	public ActivityPatternsPage selectClass_31(WebDriver driver,String Class_31)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_31,Class_31,"Class_31");
		return this;
	}
	public ActivityPatternsPage clickAutomated_22(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_22,"Automated_22");
		return this;
	}
	public ActivityPatternsPage selectCategory_60(WebDriver driver,String Category_60)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_60,Category_60,"Category_60");
		return this;
	}
	public ActivityPatternsPage enterSubject_37(WebDriver driver,String Subject_37) {
		BrowserActions.type(driver, inpSubject_37,Subject_37, "Subject_37");
		return this;
	}
	public ActivityPatternsPage selectCategory_67(WebDriver driver,String Category_67)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_67,Category_67,"Category_67");
		return this;
	}
	public ActivityPatternsPage selectType_26(WebDriver driver,String Type_26)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_26,Type_26,"Type_26");
		return this;
	}
	public ActivityPatternsPage selectClass_45(WebDriver driver,String Class_45)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_45,Class_45,"Class_45");
		return this;
	}
	public ActivityPatternsPage selectPriority_90(WebDriver driver,String Priority_90)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_90,Priority_90,"Priority_90");
		return this;
	}
	public ActivityPatternsPage selectPriority_97(WebDriver driver,String Priority_97)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_97,Priority_97,"Priority_97");
		return this;
	}
	public ActivityPatternsPage clickMandatory_35(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_35,"Mandatory_35");
		return this;
	}
	public ActivityPatternsPage selectPriority_13(WebDriver driver,String Priority_13)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_13,Priority_13,"Priority_13");
		return this;
	}
	public ActivityPatternsPage clickAutomated_92(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_92,"Automated_92");
		return this;
	}
	public ActivityPatternsPage selectCategory_74(WebDriver driver,String Category_74)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_74,Category_74,"Category_74");
		return this;
	}
	public ActivityPatternsPage clickAutomated_99(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_99,"Automated_99");
		return this;
	}
	public ActivityPatternsPage enterSubject_44(WebDriver driver,String Subject_44) {
		BrowserActions.type(driver, inpSubject_44,Subject_44, "Subject_44");
		return this;
	}
	public ActivityPatternsPage clickAutomated_8(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_8,"Automated_8");
		return this;
	}
	public ActivityPatternsPage clickAutomated_78(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_78,"Automated_78");
		return this;
	}
	public ActivityPatternsPage selectCategory_39(WebDriver driver,String Category_39)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_39,Category_39,"Category_39");
		return this;
	}
	public ActivityPatternsPage selectClass(WebDriver driver,String Class)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass,Class,"Class");
		return this;
	}
	public ActivityPatternsPage selectType_33(WebDriver driver,String Type_33)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_33,Type_33,"Type_33");
		return this;
	}
	public ActivityPatternsPage clickMandatory_28(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_28,"Mandatory_28");
		return this;
	}
	public ActivityPatternsPage selectType_40(WebDriver driver,String Type_40)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_40,Type_40,"Type_40");
		return this;
	}
	public ActivityPatternsPage selectPriority_83(WebDriver driver,String Priority_83)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_83,Priority_83,"Priority_83");
		return this;
	}
	public ActivityPatternsPage selectClass_59(WebDriver driver,String Class_59)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_59,Class_59,"Class_59");
		return this;
	}
	public ActivityPatternsPage enterSubject_93(WebDriver driver,String Subject_93) {
		BrowserActions.type(driver, inpSubject_93,Subject_93, "Subject_93");
		return this;
	}
	public ActivityPatternsPage clickMandatory_21(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_21,"Mandatory_21");
		return this;
	}
	public ActivityPatternsPage selectClass_52(WebDriver driver,String Class_52)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_52,Class_52,"Class_52");
		return this;
	}
	public ActivityPatternsPage clickAutomated_85(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_85,"Automated_85");
		return this;
	}
	public ActivityPatternsPage clickMandatory_91(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_91,"Mandatory_91");
		return this;
	}
	public ActivityPatternsPage enterSubject_16(WebDriver driver,String Subject_16) {
		BrowserActions.type(driver, inpSubject_16,Subject_16, "Subject_16");
		return this;
	}
	public ActivityPatternsPage selectCategory_46(WebDriver driver,String Category_46)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_46,Category_46,"Category_46");
		return this;
	}
	public ActivityPatternsPage selectType_47(WebDriver driver,String Type_47)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_47,Type_47,"Type_47");
		return this;
	}
	public ActivityPatternsPage clickMandatory_7(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_7,"Mandatory_7");
		return this;
	}
	public ActivityPatternsPage selectClass_66(WebDriver driver,String Class_66)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_66,Class_66,"Class_66");
		return this;
	}
	public ActivityPatternsPage clickMandatory_14(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_14,"Mandatory_14");
		return this;
	}
	public ActivityPatternsPage clickAutomated_71(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_71,"Automated_71");
		return this;
	}
	public ActivityPatternsPage selectPriority_76(WebDriver driver,String Priority_76)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_76,Priority_76,"Priority_76");
		return this;
	}
	public ActivityPatternsPage selectCategory_53(WebDriver driver,String Category_53)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_53,Category_53,"Category_53");
		return this;
	}
	public ActivityPatternsPage clickMandatory_98(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_98,"Mandatory_98");
		return this;
	}
	public ActivityPatternsPage enterSubject_23(WebDriver driver,String Subject_23) {
		BrowserActions.type(driver, inpSubject_23,Subject_23, "Subject_23");
		return this;
	}
	public ActivityPatternsPage selectCategory_18(WebDriver driver,String Category_18)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_18,Category_18,"Category_18");
		return this;
	}
	public ActivityPatternsPage clickAutomated_57(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_57,"Automated_57");
		return this;
	}
	public ActivityPatternsPage selectType_54(WebDriver driver,String Type_54)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_54,Type_54,"Type_54");
		return this;
	}
	public ActivityPatternsPage selectType_61(WebDriver driver,String Type_61)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_61,Type_61,"Type_61");
		return this;
	}
	public ActivityPatternsPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,true,"Delete");
		return this;
	}
	public ActivityPatternsPage selectPriority_62(WebDriver driver,String Priority_62)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_62,Priority_62,"Priority_62");
		return this;
	}
	public ActivityPatternsPage enterSubject_72(WebDriver driver,String Subject_72) {
		BrowserActions.type(driver, inpSubject_72,Subject_72, "Subject_72");
		return this;
	}
	public ActivityPatternsPage clickMandatory(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory,"Mandatory");
		return this;
	}
	public ActivityPatternsPage clickAutomated_64(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_64,"Automated_64");
		return this;
	}
	public ActivityPatternsPage clickMandatory_84(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_84,"Mandatory_84");
		return this;
	}
	public ActivityPatternsPage selectPriority_69(WebDriver driver,String Priority_69)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_69,Priority_69,"Priority_69");
		return this;
	}
	public ActivityPatternsPage selectClass_73(WebDriver driver,String Class_73)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_73,Class_73,"Class_73");
		return this;
	}
	public ActivityPatternsPage clickMandatory_70(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_70,"Mandatory_70");
		return this;
	}
	public ActivityPatternsPage enterSubject_79(WebDriver driver,String Subject_79) {
		BrowserActions.type(driver, inpSubject_79,Subject_79, "Subject_79");
		return this;
	}
	public ActivityPatternsPage clickAutomated(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated,"Automated");
		return this;
	}
	public ActivityPatternsPage selectCategory_25(WebDriver driver,String Category_25)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_25,Category_25,"Category_25");
		return this;
	}
	public ActivityPatternsPage selectPriority_6(WebDriver driver,String Priority_6)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_6,Priority_6,"Priority_6");
		return this;
	}
	public ActivityPatternsPage selectType_68(WebDriver driver,String Type_68)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_68,Type_68,"Type_68");
		return this;
	}
	public ActivityPatternsPage selectClass_3(WebDriver driver,String Class_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_3,Class_3,"Class_3");
		return this;
	}
	public ActivityPatternsPage selectClass_87(WebDriver driver,String Class_87)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_87,Class_87,"Class_87");
		return this;
	}
	public ActivityPatternsPage selectCategory_32(WebDriver driver,String Category_32)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory_32,Category_32,"Category_32");
		return this;
	}
	public ActivityPatternsPage clickMandatory_77(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory_77,"Mandatory_77");
		return this;
	}
	public ActivityPatternsPage clickAutomated_50(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomated_50,"Automated_50");
		return this;
	}
	public ActivityPatternsPage selectPriority_55(WebDriver driver,String Priority_55)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_55,Priority_55,"Priority_55");
		return this;
	}
	public ActivityPatternsPage selectClass_80(WebDriver driver,String Class_80)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClass_80,Class_80,"Class_80");
		return this;
	}
	public ActivityPatternsPage enterSubject_86(WebDriver driver,String Subject_86) {
		BrowserActions.type(driver, inpSubject_86,Subject_86, "Subject_86");
		return this;
	}

	public ActivityPatternsPage verifyActivitySubjectIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnSubject,"Activity Subject");
		return this;
	}

	public ActivityPatternsPage verifyActivityClassIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblClass,"Activity Class ");
		return this;
	}

	public ActivityPatternsPage verifyActivityCategoryIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblCategory,"Activity Category");
		return this;
	}

	public ActivityPatternsPage verifyActivityTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblType,"Activity Type");
		return this;
	}

	public ActivityPatternsPage verifyActivityPriorityIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblPriority,"Activity Priority");
		return this;
	}

	public ActivityPatternsPage verifyActivityMandatoryIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblMandatory,"Activity Mandatory");
		return this;
	}

	public ActivityPatternsPage verifyActivityAutomatedIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblAutomated,"Activity Automated");
		return this;
	}

	public void verifyDeletedActivitySubjectNotDisplayed(WebDriver driver, String subject)  {
		String pageNo=lblLastPageNo.getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			BrowserActions.waitForNetworkIdleState(driver, 2);
			By activitySubjectBy = By.cssSelector(activitySubjectList);
			List<WebElement> nameList = BrowserActions.getWebElements(driver, activitySubjectBy, "activity Subject By", 0.5);
			for (WebElement listOfrules : nameList) {
				if (listOfrules.getText().equals(subject)) {
					Log.fail("Deleted Subject still exist");
				}
			}
				if(i!=no) {
					BrowserActions.click(driver, btnNextArrow,"Next Button");
				}
				if(i==no)
					break;
			}
				Log.message("Recently added subject deleted");
			}
	

	public void clickSubjectCheckBox(WebDriver driver,String subject) {
		boolean flag =false;
		String pageNo=lblLastPageNo.getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			BrowserActions.waitForNetworkIdleState(driver, 2);
			By activitySubjectBy = By.cssSelector(activitySubjectList);
			List<WebElement> nameList = BrowserActions.getWebElements(driver, activitySubjectBy, "activity Subject", 0.5);
			for (WebElement listOfrules : nameList) {
				BrowserActions.waitForElementToDisplay(driver,btnSubject);
				if (listOfrules.getText().equals(subject)) {
					By subjectCheckBoxBy = By.xpath("//div[text()='"+subject+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
					BrowserActions.waitForElementToDisplay(driver, subjectCheckBoxBy, "Subject Checkbox");
					WebElement subjectCheckBox = subjectCheckBoxBy.findElement(driver);
					BrowserActions.click(driver, subjectCheckBox,"Added subject check box");
					flag=true;
					break;
				}
			}
			if(!flag)
				BrowserActions.click(driver, btnNextArrow,"Next Button");
			if(flag)
				break;
		}
			Log.message("Recently added subject checkbox selected");
		}
	

	public void clickActivityPatternSubjectLink(WebDriver driver,String subject) {
		boolean flag =false;
		String pageNo=lblLastPageNo.getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			BrowserActions.waitForNetworkIdleState(driver);
			By nameListBy =By.cssSelector(activitySubjectList);
			List<WebElement> nameList = BrowserActions.getWebElements(driver, nameListBy, "name list", 0.5);
			for (WebElement listOfrules : nameList) {
				BrowserActions.waitForElementToDisplay(driver,btnSubject);
				String text = BrowserActions.getText(driver, listOfrules, "List of rules");
				if (text.equals(subject)) {
					By subjectNameBy = By.xpath("//div[text()='"+subject+"']");
					BrowserActions.waitForElementToDisplay(driver, subjectNameBy, "Subject Name");
					WebElement subjectName = subjectNameBy.findElement(driver);
					BrowserActions.click(driver, subjectName,"Activity Subject Link");
					flag=true;
					break;
				}
			}
			if(!flag)
				BrowserActions.click(driver, btnNextArrow,2,"Next Button");
			if(flag)
				break;
		}
		Log.message("Recently added subject link selected");
	}


	public ActivityPatternsPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}

	public void verifyActivitySubjectIsUpdated(WebDriver driver,String oldSubjectName) {
		BrowserActions.waitForElementToDisplay(driver, inpSubject);
		String updatedSubjectName = inpSubject.getAttribute("value");
		if (!updatedSubjectName.equals(oldSubjectName)) {
			Log.message("Activity subject is updated");
		}
		else{
			Log.message("Activity subject name not updated");
		}
	}

	public ActivityPatternsPage clickUptoActivityPattern(WebDriver driver)  {
		BrowserActions.click(driver, btnUptoActivityPattern,"Upto activity pattern");
		return this;
	}


	public class NewActivityPatternPage extends LoadableComponent<NewActivityPatternPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetStartPoint']", AI = false)
		public WebElement drpTargetStartPoint;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationInclDays']", AI = false)
		public WebElement drpEscalationIncludeDays;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-ShortSubject']", AI = false)
		public WebElement inpShortSubject;

		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
		public WebElement inpFieldHeading_2;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-FieldHeading']", AI = false)
		public WebElement inpFieldHeading_3;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationHours']", AI = false)
		public WebElement inpEscalationHours;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-2-column']", AI = false)
		public WebElement inpColumn_13;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Description']", AI = false)
		public WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
		public WebElement inpColumn;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailScreen_DeleteButton>div[role='button']", AI = false)
		public WebElement btnDelete;

		@IFindBy(how = How.CSS, using = "input[name$='Code']", AI = false)
		public WebElement inpCode;

		@IFindBy(how = How.CSS, using = "select[name$='Category']", AI = false)
		public WebElement drpCategory;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EmailTemplate']", AI = false)
		public WebElement inpEmailTemplate;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationDays']", AI = false)
		public WebElement inpEscalationDays;

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetIncludeDays']", AI = false)
		public WebElement drpTargetIncludeDays;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
		public WebElement inpLanguage;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EmailTemplate-SelectEmailTemplate", AI = false)
		public WebElement btnSearch_1;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Mandatory']", AI = false)
		public WebElement rdbMandatory;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
		public WebElement inpFieldHeading;

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-ActivityClass']", AI = false)
		public WebElement drpActivityClass;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-DocumentTemplate-SelectDocumentTemplate", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-AutomatedOnly']", AI = false)
		public WebElement rdbAutomatedOnly;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
		public WebElement inpColumn_8;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-2-column']", AI = false)
		public WebElement inpColumn_9;

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-PatternLevel']", AI = false)
		public WebElement drpPatternLevel;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
		public WebElement inpColumn_7;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
		public WebElement inpColumn_4;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-2-column']", AI = false)
		public WebElement inpColumn_5;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
		public WebElement inpLanguage_10;

		@IFindBy(how = How.CSS, using = "input[name$='Subject']", AI = false)
		public WebElement inpSubject;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
		public WebElement inpLanguageHeading;

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationStartPt']", AI = false)
		public WebElement drpEscalationStartPoint;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Recurring']", AI = false)
		public WebElement rdbRecurring;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetHours']", AI = false)
		public WebElement inpTargetHours;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
		public WebElement inpColumn_11;

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Type']", AI = false)
		public WebElement drpType;

		@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
		public WebElement inpColumn_12;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
		public WebElement inpLanguage_6;

		@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Priority']", AI = false)
		public WebElement drpPriority;

		@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetDays']", AI = false)
		public WebElement inpTargetDays;

		@IFindBy(how = How.CSS, using = "select[name$='Importance']", AI = false)
		public WebElement drpCalenderImportance;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
		public WebElement inpEdgePolicyholderEnglish;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
		public WebElement inpEdgeEnglish;

		public NewActivityPatternPage(){
		}

		public NewActivityPatternPage(WebDriver driver) throws Exception{
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpTargetDays))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public NewActivityPatternPage selectTargetStartPoint(WebDriver driver,String TargetStartPoint)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTargetStartPoint,TargetStartPoint,"TargetStartPoint");
			return this;
		}
		public NewActivityPatternPage selectEscalationIncludeDays(WebDriver driver,String EscalationIncludeDays)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpEscalationIncludeDays,EscalationIncludeDays,"EscalationIncludeDays");
			return this;
		}
		public NewActivityPatternPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewActivityPatternPage enterShortSubject(WebDriver driver,String ShortSubject) {
			BrowserActions.type(driver, inpShortSubject,ShortSubject, "ShortSubject");
			return this;
		}
		public NewActivityPatternPage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,2,"Update");
			return this;
		}
		public NewActivityPatternPage enterFieldHeading_2(WebDriver driver,String FieldHeading_2) {
			BrowserActions.type(driver, inpFieldHeading_2,FieldHeading_2, "FieldHeading_2");
			return this;
		}
		public NewActivityPatternPage enterFieldHeading_3(WebDriver driver,String FieldHeading_3) {
			BrowserActions.type(driver, inpFieldHeading_3,FieldHeading_3, "FieldHeading_3");
			return this;
		}
		public NewActivityPatternPage enterEscalationHours(WebDriver driver,String EscalationHours) {
			BrowserActions.type(driver, inpEscalationHours,EscalationHours, "EscalationHours");
			return this;
		}
		public NewActivityPatternPage enterColumn_13(WebDriver driver,String Column_13) {
			BrowserActions.type(driver, inpColumn_13,Column_13, "Column_13");
			return this;
		}
		public NewActivityPatternPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public NewActivityPatternPage enterColumn(WebDriver driver,String Column) {
			BrowserActions.type(driver, inpColumn,Column, "Column");
			return this;
		}
		public NewActivityPatternPage clickDelete(WebDriver driver)  {
			BrowserActions.click(driver, btnDelete,"Delete");
			return this;
		}
		public NewActivityPatternPage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code,true, "Code");
			return this;
		}
		public NewActivityPatternPage selectCategory(WebDriver driver,String Category)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,true,"Category");
			return this;
		}
		public NewActivityPatternPage enterEmailTemplate(WebDriver driver,String EmailTemplate) {
			BrowserActions.type(driver, inpEmailTemplate,EmailTemplate, "EmailTemplate");
			return this;
		}
		public NewActivityPatternPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewActivityPatternPage enterEscalationDays(WebDriver driver,String EscalationDays) {
			BrowserActions.type(driver, inpEscalationDays,EscalationDays, "EscalationDays");
			return this;
		}
		public NewActivityPatternPage selectTargetIncludeDays(WebDriver driver,String TargetIncludeDays)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTargetIncludeDays,TargetIncludeDays,"TargetIncludeDays");
			return this;
		}
		public NewActivityPatternPage enterLanguage(WebDriver driver,String Language) {
			BrowserActions.type(driver, inpLanguage,Language, "Language");
			return this;
		}
		public NewActivityPatternPage clickSearch_1(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch_1,"Search_1");
			return this;
		}
		public NewActivityPatternPage clickMandatory(WebDriver driver)  {
			BrowserActions.click(driver, rdbMandatory,"Mandatory");
			return this;
		}
		public NewActivityPatternPage enterFieldHeading(WebDriver driver,String FieldHeading) {
			BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			return this;
		}
		public NewActivityPatternPage selectActivityClass(WebDriver driver,String ActivityClass)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass,ActivityClass,"ActivityClass");
			return this;
		}
		public NewActivityPatternPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public NewActivityPatternPage clickAutomatedOnly(WebDriver driver)  {
			BrowserActions.click(driver, rdbAutomatedOnly,"AutomatedOnly");
			return this;
		}
		public NewActivityPatternPage enterColumn_8(WebDriver driver,String Column_8) {
			BrowserActions.type(driver, inpColumn_8,Column_8, "Column_8");
			return this;
		}
		public NewActivityPatternPage enterColumn_9(WebDriver driver,String Column_9) {
			BrowserActions.type(driver, inpColumn_9,Column_9, "Column_9");
			return this;
		}
		public NewActivityPatternPage selectPatternLevel(WebDriver driver,String PatternLevel)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel,PatternLevel,"PatternLevel");
			return this;
		}
		public NewActivityPatternPage enterColumn_7(WebDriver driver,String Column_7) {
			BrowserActions.type(driver, inpColumn_7,Column_7, "Column_7");
			return this;
		}
		public NewActivityPatternPage enterColumn_4(WebDriver driver,String Column_4) {
			BrowserActions.type(driver, inpColumn_4,Column_4, "Column_4");
			return this;
		}
		public NewActivityPatternPage enterColumn_5(WebDriver driver,String Column_5) {
			BrowserActions.type(driver, inpColumn_5,Column_5, "Column_5");
			return this;
		}
		public NewActivityPatternPage enterLanguage_10(WebDriver driver,String Language_10) {
			BrowserActions.type(driver, inpLanguage_10,Language_10, "Language_10");
			return this;
		}
		public NewActivityPatternPage enterSubject(WebDriver driver,String Subject) {
			BrowserActions.type(driver, inpSubject,Subject,true,"Subject");
			return this;
		}
		
		public NewActivityPatternPage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
			BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			return this;
		}
		public NewActivityPatternPage selectEscalationStartPoint(WebDriver driver,String EscalationStartPoint)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpEscalationStartPoint,EscalationStartPoint,"EscalationStartPoint");
			return this;
		}
		public NewActivityPatternPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewActivityPatternPage clickRecurring(WebDriver driver)  {
			BrowserActions.click(driver, rdbRecurring,"Recurring");
			return this;
		}
		public NewActivityPatternPage enterTargetHours(WebDriver driver,String TargetHours) {
			BrowserActions.type(driver, inpTargetHours,TargetHours, "TargetHours");
			return this;
		}
		public NewActivityPatternPage enterColumn_11(WebDriver driver,String Column_11) {
			BrowserActions.type(driver, inpColumn_11,Column_11, "Column_11");
			return this;
		}
		public NewActivityPatternPage selectType(WebDriver driver,String Type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
			return this;
		}
		public NewActivityPatternPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public NewActivityPatternPage enterColumn_12(WebDriver driver,String Column_12) {
			BrowserActions.type(driver, inpColumn_12,Column_12, "Column_12");
			return this;
		}
		public NewActivityPatternPage enterLanguage_6(WebDriver driver,String Language_6) {
			BrowserActions.type(driver, inpLanguage_6,Language_6, "Language_6");
			return this;
		}
		public NewActivityPatternPage selectPriority(WebDriver driver,String Priority)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
			return this;
		}
		public NewActivityPatternPage enterTargetDays(WebDriver driver,String TargetDays) {
			BrowserActions.type(driver, inpTargetDays,TargetDays, "TargetDays");
			return this;
		}

		public NewActivityPatternPage selectCalenderImportance(WebDriver driver,String calenderImpotance)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCalenderImportance,calenderImpotance,true,"Calender Impotance");
			return this;
		}

		public NewActivityPatternPage enterEdgePolicyholderEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpEdgePolicyholderEnglish,localization, "Edge Policyholder English");
			return this;
		}
		public NewActivityPatternPage enterEdgeEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpEdgeEnglish,localization, "Edge English");
			return this;
		}


	}

}
