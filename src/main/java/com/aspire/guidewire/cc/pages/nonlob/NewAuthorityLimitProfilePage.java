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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class NewAuthorityLimitProfilePage extends LoadableComponent<NewAuthorityLimitProfilePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDescription_11;

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-AuthorityLimitProfileDV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	public WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-AuthorityLimitProfileDV-EditAuthorityLimitsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
	public WebElement inpDependentonRender_8;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDescription_4;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-AuthorityLimitProfileDV-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column1']", AI = false)
	public WebElement inpDescription_7;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
	public WebElement inpLanguage_9;

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
	public WebElement inpDependentonRender_12;

	@IFindBy(how = How.CSS, using = "select[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-AuthorityLimitProfileDV-Currency']", AI = false)
	public WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
	public WebElement inpLanguage_5;

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-AuthorityLimitProfileDV-EditAuthorityLimitsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_2;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
	public WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	public WebElement inpName_3;

	@IFindBy(how = How.CSS, using = "input[name='NewAuthorityLimitProfile-AuthorityLimitProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column0']", AI = false)
	public WebElement inpName_6;

	@IFindBy(how = How.CSS, using = "div[id$='AuthorityLimitProfiles_AddButton']", AI = false)
	public WebElement btnAuthorityLimitProfilesAdd;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDescriptionEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDescriptionEdgeEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LV-0-column0']", AI = false)
	public WebElement inpNameEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LV-2-column0']", AI = false)
	public WebElement inpNameEdgeEnglish;

	@IFindBy(how = How.CSS, using = "select[name$='LimitType']", AI = false)
	public WebElement drpLimitType;

	@IFindBy(how = How.CSS, using = "select[name$='PolicyType']", AI = false)
	public WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "select[name$='CoverageType']", AI = false)
	public WebElement drpCoverageType;
	
	@IFindBy(how = How.CSS, using = "select[name$='CostType']", AI = false)
	public WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "input[name$='LimitAmount']", AI = false)
	public WebElement inpAmount;


	public NewAuthorityLimitProfilePage(){
	}

	public NewAuthorityLimitProfilePage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(Utils.waitForElement(driver, inpName_6))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewAuthorityLimitProfilePage enterDescription_11(WebDriver driver,String Description_11) {
		BrowserActions.type(driver, inpDescription_11,Description_11, "Description_11");
		return this;
	}
	public NewAuthorityLimitProfilePage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewAuthorityLimitProfilePage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public NewAuthorityLimitProfilePage enterName_10(WebDriver driver,String Name_10) {
		BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
		return this;
	}
	public NewAuthorityLimitProfilePage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public NewAuthorityLimitProfilePage enterLanguage(WebDriver driver,String Language) {
		BrowserActions.type(driver, inpLanguage,Language, "Language");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDependentonRender_8(WebDriver driver,String DependentonRender_8) {
		BrowserActions.type(driver, inpDependentonRender_8,DependentonRender_8, "DependentonRender_8");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDescription_4(WebDriver driver,String Description_4) {
		BrowserActions.type(driver, inpDescription_4,Description_4, "Description_4");
		return this;
	}
	public NewAuthorityLimitProfilePage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public NewAuthorityLimitProfilePage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDescription_7(WebDriver driver,String Description_7) {
		BrowserActions.type(driver, inpDescription_7,Description_7, "Description_7");
		return this;
	}
	public NewAuthorityLimitProfilePage enterLanguage_9(WebDriver driver,String Language_9) {
		BrowserActions.type(driver, inpLanguage_9,Language_9, "Language_9");
		return this;
	}
	public NewAuthorityLimitProfilePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDependentonRender_12(WebDriver driver,String DependentonRender_12) {
		BrowserActions.type(driver, inpDependentonRender_12,DependentonRender_12, "DependentonRender_12");
		return this;
	}
	public NewAuthorityLimitProfilePage selectCurrency(WebDriver driver,String Currency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
		return this;
	}
	public NewAuthorityLimitProfilePage enterLanguage_5(WebDriver driver,String Language_5) {
		BrowserActions.type(driver, inpLanguage_5,Language_5, "Language_5");
		return this;
	}
	public NewAuthorityLimitProfilePage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewAuthorityLimitProfilePage clickRemove_2(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_2,"Remove_2");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDependentonRender(WebDriver driver,String DependentonRender) {
		BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
		return this;
	}
	public NewAuthorityLimitProfilePage enterName_3(WebDriver driver,String Name_3) {
		BrowserActions.type(driver, inpName_3,Name_3, "Name_3");
		return this;
	}
	public NewAuthorityLimitProfilePage enterName_6(WebDriver driver,String Name_6) {
		BrowserActions.type(driver, inpName_6,Name_6, "Name_6");
		return this;
	}
	public NewAuthorityLimitProfilePage clickAuthorityLimitProfilesAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAuthorityLimitProfilesAdd,1.5,"Authority Limit Profiles Add Button");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDescriptionEdgePolicyholderEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpDescriptionEdgePolicyholderEnglish,localization, "Edge Policyholder English");
		return this;
	}
	public NewAuthorityLimitProfilePage enterDescriptionEdgeEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpDescriptionEdgeEnglish,localization, "Edge English");
		return this;
	}
	public NewAuthorityLimitProfilePage enterNameEdgePolicyholderEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpNameEdgePolicyholderEnglish,localization,1, "Name Edge Policyholder English");
		return this;
	}
	public NewAuthorityLimitProfilePage enterNameEdgeEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpNameEdgeEnglish,localization, 1,"Name Edge English");
		return this;
	}
	public NewAuthorityLimitProfilePage selectAuthorityLimitsType(WebDriver driver,String localization) {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimitType,localization, 1,"Authority Limits Type");
		return this;
	}
	public NewAuthorityLimitProfilePage selectAuthorityPolicyType(WebDriver driver,String localization) {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,localization, 1,"Authority Policy Type");
		return this;
	}
	public NewAuthorityLimitProfilePage selectAuthorityCoverageType(WebDriver driver,String localization) {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageType,localization, 1,"Authority Coverage Type");
		return this;
	}
	public NewAuthorityLimitProfilePage selectAuthorityCostType(WebDriver driver,String localization) {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostType,localization, 1,"Authority Cost Type");
		return this;
	}
	public NewAuthorityLimitProfilePage enterAmount(WebDriver driver,String amount) {
		BrowserActions.type(driver, inpAmount,amount, 1,"Amount");
		return this;
	}

	public void verifyNewAuthorityLimitProfileIsDisplay(WebDriver driver,String zone) {
		By authorityLimit = By.xpath("//div[text()='"+zone+"']");
		BrowserActions.waitForElementToDisplay(driver, authorityLimit, "Authority Limit Profile");
	}

}
