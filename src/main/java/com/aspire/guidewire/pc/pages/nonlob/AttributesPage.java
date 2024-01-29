package com.aspire.guidewire.pc.pages.nonlob;
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

public class AttributesPage extends LoadableComponent<AttributesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#Attributes-AttributesScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='Attributes-AttributesScreen-AttributesLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='Attributes-AttributesScreen-AttributesLV-0-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#Attributes-AttributesScreen-Attributes_DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "select[name='Attributes-AttributesScreen-AttributesLV-0-Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#Attributes-AttributesScreen-Attributes_NewAttributeButton>div[role='button']", AI = false)
	private WebElement btnNewAttribute;
	
	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	private List<WebElement> lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	private WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-first']", AI = false)
	private WebElement btnFirstPageNo;

	public AttributesPage(){
	}

	public AttributesPage(WebDriver driver){
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
}public AttributesPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public AttributesPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public AttributesPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public AttributesPage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public NewAttributePage clickNewAttribute(WebDriver driver)  {
					BrowserActions.click(driver, btnNewAttribute,"NewAttribute");
				    return new NewAttributePage(driver).get();
			}
public AttributesPage clickAttributeChkBox(WebDriver driver , String attributeName)  {
	By newAttributeNameBy = By.xpath("//div[text()='"+attributeName+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
	BrowserActions.waitForElementToDisplay(driver, newAttributeNameBy, "newAttributeName");
	WebElement newAttributeName = newAttributeNameBy.findElement(driver);
	
	BrowserActions.click(driver, newAttributeName,"NewAttribute");
	return this;
}

/**
 * Verify Attribute Name is display
 * @author vignesh.ravi
 * @param driver , name
 */

public void  verifyAttributeNameIsDisplay(WebDriver driver,String name) {
	if(lblLastPageNo.size()>0) {
	String pageNo=lblLastPageNo.get(0).getText();
	String num=pageNo.replaceAll("[^0-9]","");
	int no=Integer.parseInt(num);
	for(int i=1;i<=no;i++) {
		//BrowserActions.waitForNetworkIdleState(driver,3 );
		List<WebElement> attribute = driver.findElements(By.xpath("//div[text()='"+name+"']"));
		if (attribute.size() > 0) {
			By attributeNameBy = By.xpath("//div[text()='"+name+"']");
			BrowserActions.waitForElementToDisplay(driver, attributeNameBy, "attributeName");
			WebElement attributeName = attributeNameBy.findElement(driver);
			Log.assertThat(attributeName.isDisplayed(), "Sucessfully Added the New Attribute", "Can't able to view added New Attribute");
			break;
		}
		else {
			BrowserActions.click(driver, btnNextArrow,true,"Next Button");
		}}}
	else {
		By attributeNameBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, attributeNameBy, "attributeName");
		WebElement attributeName = attributeNameBy.findElement(driver);
		Log.assertThat(attributeName.isDisplayed(), "Sucessfully Added the New Attribute", "Can't able to view added New Attribute");
	}
	

}

public class NewAttributePage extends LoadableComponent<NewAttributePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public  List<Object> pageFactoryKey = new ArrayList<Object>();
	public  List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-AttributeDetailDV-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
	private WebElement inpColumn_8;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
	private WebElement inpColumn_7;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
	private WebElement inpColumn_4;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
	private WebElement inpColumn_5;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
	private WebElement inpColumn_2;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
	private WebElement inpFieldHeading_1;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-AttributeDetailDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
	private WebElement inpLanguageHeading;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
	private WebElement inpColumn;

	@IFindBy(how = How.CSS, using = "select[name='NewAttribute-AttributeDetailScreen-AttributeDetailDV-Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
	private WebElement inpLanguage_6;

	@IFindBy(how = How.CSS, using = "#NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
	private WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
	private WebElement inpLanguage_3;

	@IFindBy(how = How.CSS, using = "input[name='NewAttribute-AttributeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
	private WebElement inpFieldHeading;
	
	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-0-0-column']", AI = false)
	public WebElement inpLocalizationName;
	
	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-2-0-column']", AI = false)
	public WebElement inpLocalizationName_1;
	
	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-2-1-column']", AI = false)
	public WebElement inpLocalizationDescription_1;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-0-1-column']", AI = false)
	public WebElement inpLocalizationDescription;

	public NewAttributePage(){
	}

	public NewAttributePage(WebDriver driver){
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
}public NewAttributePage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public NewAttributePage enterColumn_8(WebDriver driver,String Column_8) {
		            BrowserActions.type(driver, inpColumn_8,Column_8, "Column_8");
			        return this;
           }
public NewAttributePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewAttributePage enterColumn_7(WebDriver driver,String Column_7) {
		            BrowserActions.type(driver, inpColumn_7,Column_7, "Column_7");
			        return this;
           }
public AttributesPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
					return new AttributesPage(driver).get();
			}
public NewAttributePage enterColumn_4(WebDriver driver,String Column_4) {
		            BrowserActions.type(driver, inpColumn_4,Column_4, "Column_4");
			        return this;
           }
public NewAttributePage enterColumn_5(WebDriver driver,String Column_5) {
		            BrowserActions.type(driver, inpColumn_5,Column_5, "Column_5");
			        return this;
           }
public NewAttributePage enterColumn_2(WebDriver driver,String Column_2) {
		            BrowserActions.type(driver, inpColumn_2,Column_2, "Column_2");
			        return this;
           }
public NewAttributePage enterFieldHeading_1(WebDriver driver,String FieldHeading_1) {
		            BrowserActions.type(driver, inpFieldHeading_1,FieldHeading_1, "FieldHeading_1");
			        return this;
           }
public NewAttributePage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public NewAttributePage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
		            BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			        return this;
           }
public NewAttributePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewAttributePage enterColumn(WebDriver driver,String Column) {
		            BrowserActions.type(driver, inpColumn,Column, "Column");
			        return this;
           }
public NewAttributePage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public NewAttributePage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public NewAttributePage enterLanguage_6(WebDriver driver,String Language_6) {
		            BrowserActions.type(driver, inpLanguage_6,Language_6, "Language_6");
			        return this;
           }
public NewAttributePage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public NewAttributePage enterLanguage(WebDriver driver,String Language) {
		            BrowserActions.type(driver, inpLanguage,Language, "Language");
			        return this;
           }
public NewAttributePage enterLanguage_3(WebDriver driver,String Language_3) {
		            BrowserActions.type(driver, inpLanguage_3,Language_3, "Language_3");
			        return this;
           }
public NewAttributePage enterFieldHeading(WebDriver driver,String FieldHeading) {
		            BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			        return this;
           }

/**
 * Enter Localization Name
 * @author vignesh.ravi
 * @param driver , name
 */
public void enterLocalizationName(WebDriver driver,String name) {
	BrowserActions.type(driver,inpLocalizationName,name, "Localization Name");
}

/**
 * Enter Localization Description
 * @author vignesh.ravi
 * @param driver , description
 */
public void enterLocalizationDescription(WebDriver driver,String description) {
	BrowserActions.type(driver,inpLocalizationDescription,description, "Localization Descripton");
}

/**
 * Enter Localization Name
 * @author vignesh.ravi
 * @param driver , name
 */
public void enterLocalizationName_1(WebDriver driver,String name) {
	BrowserActions.type(driver,inpLocalizationName_1,name, "Localization Name");
}

/**
 * Enter Localization Description
 * @author vignesh.ravi
 * @param driver , description
 */

public void enterLocalizationDescription_1(WebDriver driver,String description) {
	BrowserActions.type(driver,inpLocalizationDescription_1,description, "Localization Descripton");
}
}


}
