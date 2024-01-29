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

public class NewRolePage extends LoadableComponent<NewRolePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDescription_11;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetailDV-Description textarea", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	public WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleUsersLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_14;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetail_UserCardTab", AI = false)
	public WebElement btnUsers;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetail_RolesCardTab", AI = false)
	public WebElement btnBasics;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetailDV-RolePrivilegesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
	public WebElement inpDependentonRender_8;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDescription_4;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-RoleDetailDV-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column1']", AI = false)
	public WebElement inpDescription_7;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
	public WebElement inpLanguage_9;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
	public WebElement inpDependentonRender_12;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
	public WebElement inpLanguage_5;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetailDV-RolePrivilegesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_2;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
	public WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	public WebElement inpName_3;

	@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column0']", AI = false)
	public WebElement inpName_6;

	@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleUsersLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_13;

	public NewRolePage(){
	}

	public NewRolePage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnAdd_13))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public NewRolePage enterDescription_11(WebDriver driver,String Description_11) {
		            BrowserActions.type(driver, inpDescription_11,Description_11, "Description_11");
			        return this;
           }
public NewRolePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewRolePage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public NewRolePage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public NewRolePage enterName_10(WebDriver driver,String Name_10) {
		            BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
			        return this;
           }
public NewRolePage clickRemove_14(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_14,"Remove_14");
				    return this;
			}
public NewRolePage clickUsers(WebDriver driver)  {
					BrowserActions.click(driver, btnUsers,"Users");
				    return this;
			}
public NewRolePage clickBasics(WebDriver driver)  {
					BrowserActions.click(driver, btnBasics,"Basics");
				    return this;
			}
public NewRolePage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public NewRolePage enterLanguage(WebDriver driver,String Language) {
		            BrowserActions.type(driver, inpLanguage,Language, "Language");
			        return this;
           }
public NewRolePage enterDependentonRender_8(WebDriver driver,String DependentonRender_8) {
		            BrowserActions.type(driver, inpDependentonRender_8,DependentonRender_8, "DependentonRender_8");
			        return this;
           }
public NewRolePage enterDescription_4(WebDriver driver,String Description_4) {
		            BrowserActions.type(driver, inpDescription_4,Description_4, "Description_4");
			        return this;
           }
public NewRolePage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public NewRolePage clickAdd_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_1,"Add_1");
				    return this;
			}
public NewRolePage enterDescription_7(WebDriver driver,String Description_7) {
		            BrowserActions.type(driver, inpDescription_7,Description_7, "Description_7");
			        return this;
           }
public NewRolePage enterLanguage_9(WebDriver driver,String Language_9) {
		            BrowserActions.type(driver, inpLanguage_9,Language_9, "Language_9");
			        return this;
           }
public NewRolePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewRolePage enterDependentonRender_12(WebDriver driver,String DependentonRender_12) {
		            BrowserActions.type(driver, inpDependentonRender_12,DependentonRender_12, "DependentonRender_12");
			        return this;
           }
public NewRolePage enterLanguage_5(WebDriver driver,String Language_5) {
		            BrowserActions.type(driver, inpLanguage_5,Language_5, "Language_5");
			        return this;
           }
public NewRolePage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public NewRolePage clickRemove_2(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_2,"Remove_2");
				    return this;
			}
public NewRolePage enterDependentonRender(WebDriver driver,String DependentonRender) {
		            BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
			        return this;
           }
public NewRolePage enterName_3(WebDriver driver,String Name_3) {
		            BrowserActions.type(driver, inpName_3,Name_3, "Name_3");
			        return this;
           }
public NewRolePage enterName_6(WebDriver driver,String Name_6) {
		            BrowserActions.type(driver, inpName_6,Name_6, "Name_6");
			        return this;
           }
public NewRolePage clickAdd_13(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_13,"Add_13");
				    return this;
			}
}
