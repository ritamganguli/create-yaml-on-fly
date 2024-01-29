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

public class AddAttributePage extends LoadableComponent<AddAttributePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "textarea[name$='AttributeDetailDV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
	public WebElement inpDependentonRender_6;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column1']", AI = false)
	public WebElement inpDescription_5;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDescription_2;

	@IFindBy(how = How.CSS, using = "input[name$='AttributeDetailDV-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDescription_9;

	@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
	public WebElement inpDependentonRender_10;

	@IFindBy(how = How.CSS, using = "select[name='NewAttribute-AttributeDetailScreen-AttributeDetailDV-Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
	public WebElement inpLanguage_7;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	public WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
	public WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
	public WebElement inpLanguage_3;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column0']", AI = false)
	public WebElement inpName_4;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	public WebElement inpName_8;
		
	@IFindBy(how = How.CSS, using = "div[id$='Attributes_AddAttributeButton']", AI = false)
	public WebElement btnAddAttribute;
	
	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDescriptionEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDescriptionEdgeEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LV-0-column0']", AI = false)
	public WebElement inpNameEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LV-2-column0']", AI = false)
	public WebElement inpNameEdgeEnglish;
	
	@IFindBy(how = How.CSS, using = "div[id$='AttributesLV-0-Name_button']", AI = false)
	public WebElement lnkAttributeLink;


	public AddAttributePage(){
	}

	public AddAttributePage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public AddAttributePage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public AddAttributePage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public AddAttributePage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public AddAttributePage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public AddAttributePage enterLanguage(WebDriver driver,String Language) {
		BrowserActions.type(driver, inpLanguage,Language, "Language");
		return this;
	}
	public AddAttributePage enterDependentonRender_6(WebDriver driver,String DependentonRender_6) {
		BrowserActions.type(driver, inpDependentonRender_6,DependentonRender_6, "DependentonRender_6");
		return this;
	}
	public AddAttributePage enterDescription_5(WebDriver driver,String Description_5) {
		BrowserActions.type(driver, inpDescription_5,Description_5, "Description_5");
		return this;
	}
	public AddAttributePage enterDescription_2(WebDriver driver,String Description_2) {
		BrowserActions.type(driver, inpDescription_2,Description_2, "Description_2");
		return this;
	}
	public AddAttributePage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public AddAttributePage enterDescription_9(WebDriver driver,String Description_9) {
		BrowserActions.type(driver, inpDescription_9,Description_9, "Description_9");
		return this;
	}
	public AddAttributePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public AddAttributePage enterDependentonRender_10(WebDriver driver,String DependentonRender_10) {
		BrowserActions.type(driver, inpDependentonRender_10,DependentonRender_10, "DependentonRender_10");
		return this;
	}
	public AddAttributePage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public AddAttributePage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public AddAttributePage enterLanguage_7(WebDriver driver,String Language_7) {
		BrowserActions.type(driver, inpLanguage_7,Language_7, "Language_7");
		return this;
	}
	public AddAttributePage enterName_1(WebDriver driver,String Name_1) {
		BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
		return this;
	}
	public AddAttributePage enterDependentonRender(WebDriver driver,String DependentonRender) {
		BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
		return this;
	}
	public AddAttributePage enterLanguage_3(WebDriver driver,String Language_3) {
		BrowserActions.type(driver, inpLanguage_3,Language_3, "Language_3");
		return this;
	}
	public AddAttributePage enterName_4(WebDriver driver,String Name_4) {
		BrowserActions.type(driver, inpName_4,Name_4, "Name_4");
		return this;
	}
	public AddAttributePage enterName_8(WebDriver driver,String Name_8) {
		BrowserActions.type(driver, inpName_8,Name_8, "Name_8");
		return this;
	}
	
	public AddAttributePage clickAddAttribute(WebDriver driver)  {
		BrowserActions.click(driver, btnAddAttribute,"Add Attribute");
		return this;
	}

	public AddAttributePage enterDescriptionEdgePolicyholderEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpDescriptionEdgePolicyholderEnglish,localization, "Edge Policyholder English");
		return this;
	}
	public AddAttributePage enterDescriptionEdgeEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpDescriptionEdgeEnglish,localization, "Edge English");
		return this;
	}
	public AddAttributePage enterNameEdgePolicyholderEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpNameEdgePolicyholderEnglish,localization,1, "Name Edge Policyholder English");
		return this;
	}
	public AddAttributePage enterNameEdgeEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpNameEdgeEnglish,localization, 1,"Name Edge English");
		return this;
	}

	public AddAttributePage clickAttributeNameLink(WebDriver driver,String name) {
		By attributelinkBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, attributelinkBy, "attribute link");
		WebElement attributelink = attributelinkBy.findElement(driver);
		BrowserActions.click(driver, attributelink, "Attribute name link");
		return this;
	}
	
	public AddAttributePage clickFirstAttributeNameLink(WebDriver driver) {
		BrowserActions.click(driver, lnkAttributeLink, "Attribute name link");
		return this;
	}
	
	public String getAttributeName(WebDriver driver) {
		String text = BrowserActions.getText(driver, lnkAttributeLink, "Attribute Name");
		return text;
		
	}

	public void verifyAttributeNameIsUpdated(WebDriver driver,String expectedText) {
		String text = BrowserActions.getText(driver, lnkAttributeLink, "Attribute Name");
		if(text.equals(expectedText)) {
			Log.message("No Changes has been updated in attribute page");
		}
		else {
			Log.message("Attribute Changes has been Updated");
		}
	}

}
