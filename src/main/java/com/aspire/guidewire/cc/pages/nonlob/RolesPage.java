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

public class RolesPage extends LoadableComponent<RolesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-6-Description']", AI = false)
	public WebElement inpDescription_12;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-5-Description']", AI = false)
	public WebElement inpDescription_10;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-6-Name']", AI = false)
	public WebElement inpRole_11;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-0-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#Roles-RolesScreen-Roles_DeleteButton>div[role='button']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-13-Name']", AI = false)
	public WebElement inpRole_25;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-14-Name']", AI = false)
	public WebElement inpRole_27;

	@IFindBy(how = How.CSS, using = "#Roles-RolesScreen-Roles_AddRoleButton>div[role='button']", AI = false)
	public WebElement btnAddRole;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-8-Description']", AI = false)
	public WebElement inpDescription_16;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-7-Description']", AI = false)
	public WebElement inpDescription_14;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-9-Description']", AI = false)
	public WebElement inpDescription_18;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-2-Description']", AI = false)
	public WebElement inpDescription_4;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-1-Description']", AI = false)
	public WebElement inpDescription_2;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-11-Description']", AI = false)
	public WebElement inpDescription_22;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-10-Description']", AI = false)
	public WebElement inpDescription_20;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-11-Name']", AI = false)
	public WebElement inpRole_21;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-12-Name']", AI = false)
	public WebElement inpRole_23;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-4-Description']", AI = false)
	public WebElement inpDescription_8;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-3-Description']", AI = false)
	public WebElement inpDescription_6;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-9-Name']", AI = false)
	public WebElement inpRole_17;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-4-Name']", AI = false)
	public WebElement inpRole_7;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-10-Name']", AI = false)
	public WebElement inpRole_19;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-5-Name']", AI = false)
	public WebElement inpRole_9;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-7-Name']", AI = false)
	public WebElement inpRole_13;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-0-Name']", AI = false)
	public WebElement inpRole;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-8-Name']", AI = false)
	public WebElement inpRole_15;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-13-Description']", AI = false)
	public WebElement inpDescription_26;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-12-Description']", AI = false)
	public WebElement inpDescription_24;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-1-Name']", AI = false)
	public WebElement inpRole_1;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-2-Name']", AI = false)
	public WebElement inpRole_3;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-14-Description']", AI = false)
	public WebElement inpDescription_28;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-3-Name']", AI = false)
	public WebElement inpRole_5;

	public RolesPage(){
	}

	public RolesPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpRole_5))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public RolesPage enterDescription_12(WebDriver driver,String Description_12) {
		BrowserActions.type(driver, inpDescription_12,Description_12, "Description_12");
		return this;
	}
	public RolesPage enterDescription_10(WebDriver driver,String Description_10) {
		BrowserActions.type(driver, inpDescription_10,Description_10, "Description_10");
		return this;
	}
	public RolesPage enterRole_11(WebDriver driver,String Role_11) {
		BrowserActions.type(driver, inpRole_11,Role_11, "Role_11");
		return this;
	}
	public RolesPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public RolesPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public RolesPage enterRole_25(WebDriver driver,String Role_25) {
		BrowserActions.type(driver, inpRole_25,Role_25, "Role_25");
		return this;
	}
	public RolesPage enterRole_27(WebDriver driver,String Role_27) {
		BrowserActions.type(driver, inpRole_27,Role_27, "Role_27");
		return this;
	}
	public RolesPage clickAddRole(WebDriver driver)  {
		BrowserActions.click(driver, btnAddRole,"AddRole");
		return this;
	}
	public RolesPage enterDescription_16(WebDriver driver,String Description_16) {
		BrowserActions.type(driver, inpDescription_16,Description_16, "Description_16");
		return this;
	}
	public RolesPage enterDescription_14(WebDriver driver,String Description_14) {
		BrowserActions.type(driver, inpDescription_14,Description_14, "Description_14");
		return this;
	}
	public RolesPage enterDescription_18(WebDriver driver,String Description_18) {
		BrowserActions.type(driver, inpDescription_18,Description_18, "Description_18");
		return this;
	}
	public RolesPage enterDescription_4(WebDriver driver,String Description_4) {
		BrowserActions.type(driver, inpDescription_4,Description_4, "Description_4");
		return this;
	}
	public RolesPage enterDescription_2(WebDriver driver,String Description_2) {
		BrowserActions.type(driver, inpDescription_2,Description_2, "Description_2");
		return this;
	}
	public RolesPage enterDescription_22(WebDriver driver,String Description_22) {
		BrowserActions.type(driver, inpDescription_22,Description_22, "Description_22");
		return this;
	}
	public RolesPage enterDescription_20(WebDriver driver,String Description_20) {
		BrowserActions.type(driver, inpDescription_20,Description_20, "Description_20");
		return this;
	}
	public RolesPage enterRole_21(WebDriver driver,String Role_21) {
		BrowserActions.type(driver, inpRole_21,Role_21, "Role_21");
		return this;
	}
	public RolesPage enterRole_23(WebDriver driver,String Role_23) {
		BrowserActions.type(driver, inpRole_23,Role_23, "Role_23");
		return this;
	}
	public RolesPage enterDescription_8(WebDriver driver,String Description_8) {
		BrowserActions.type(driver, inpDescription_8,Description_8, "Description_8");
		return this;
	}
	public RolesPage enterDescription_6(WebDriver driver,String Description_6) {
		BrowserActions.type(driver, inpDescription_6,Description_6, "Description_6");
		return this;
	}
	public RolesPage enterRole_17(WebDriver driver,String Role_17) {
		BrowserActions.type(driver, inpRole_17,Role_17, "Role_17");
		return this;
	}
	public RolesPage enterRole_7(WebDriver driver,String Role_7) {
		BrowserActions.type(driver, inpRole_7,Role_7, "Role_7");
		return this;
	}
	public RolesPage enterRole_19(WebDriver driver,String Role_19) {
		BrowserActions.type(driver, inpRole_19,Role_19, "Role_19");
		return this;
	}
	public RolesPage enterRole_9(WebDriver driver,String Role_9) {
		BrowserActions.type(driver, inpRole_9,Role_9, "Role_9");
		return this;
	}
	public RolesPage enterRole_13(WebDriver driver,String Role_13) {
		BrowserActions.type(driver, inpRole_13,Role_13, "Role_13");
		return this;
	}
	public RolesPage enterRole(WebDriver driver,String Role) {
		BrowserActions.type(driver, inpRole,Role, "Role");
		return this;
	}
	public RolesPage enterRole_15(WebDriver driver,String Role_15) {
		BrowserActions.type(driver, inpRole_15,Role_15, "Role_15");
		return this;
	}
	public RolesPage enterDescription_26(WebDriver driver,String Description_26) {
		BrowserActions.type(driver, inpDescription_26,Description_26, "Description_26");
		return this;
	}
	public RolesPage enterDescription_24(WebDriver driver,String Description_24) {
		BrowserActions.type(driver, inpDescription_24,Description_24, "Description_24");
		return this;
	}
	public RolesPage enterRole_1(WebDriver driver,String Role_1) {
		BrowserActions.type(driver, inpRole_1,Role_1, "Role_1");
		return this;
	}
	public RolesPage enterRole_3(WebDriver driver,String Role_3) {
		BrowserActions.type(driver, inpRole_3,Role_3, "Role_3");
		return this;
	}
	public RolesPage enterDescription_28(WebDriver driver,String Description_28) {
		BrowserActions.type(driver, inpDescription_28,Description_28, "Description_28");
		return this;
	}
	public RolesPage enterRole_5(WebDriver driver,String Role_5) {
		BrowserActions.type(driver, inpRole_5,Role_5, "Role_5");
		return this;
	}

	public class NewRolePage extends LoadableComponent<NewRolePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

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

		@IFindBy(how = How.CSS, using = "select[name$='RolePrivilegesLV-0-Permission']", AI = false)
		public WebElement drpPermission;

		@IFindBy(how = How.CSS, using = "div[id$='Roles_DeleteButton']", AI = false)
		public WebElement btnDelete;

		@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
		public WebElement lblLastPageNo;

		@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
		public WebElement btnNextArrow;

		@IFindBy(how = How.CSS, using = "div[id$='ListPaging-first']", AI = false)
		public WebElement btnFirstPageNo;

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

		public NewRolePage selectPermission(WebDriver driver,String permission)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPermission,permission,"Permission");
			return this;
		}
		public void verifyAddedRolesIsDisplaying(WebDriver driver, String role) {
			String pageNo=lblLastPageNo.getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			for(int i=1;i<=no;i++) {
				BrowserActions.waitForNetworkIdleState(driver,1 );
				By roleBy = By.xpath("//div[text()='"+role+"']");
				int size = BrowserActions.getWebElementSize(driver, roleBy, "roleBy", 0.5);
				if (size > 0) {
					By addesRolesBy = By.xpath("//div[text()='"+role+"']");
					BrowserActions.waitForElementToDisplay(driver, addesRolesBy, "added roles");
					WebElement addesRoles = addesRolesBy.findElement(driver);
					Log.assertThat(addesRoles.isDisplayed(), "Added Roles is Displayed", "Added roles is not displayed");
				break;
				}
				else {
					BrowserActions.click(driver, btnNextArrow,"Next Button");
				}

			}
		}

		public void clickDelete(WebDriver driver)  {
			BrowserActions.click(driver, btnDelete,"Delete button");
			BrowserActions.confirmAlert(driver, "Are you sure you would like to delete the selected roles?");
		}

		public void clickRolesCheckBox(WebDriver driver,String role) {
			String pageNo=lblLastPageNo.getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			for(int i=1;i<=no;i++) {
				BrowserActions.waitForNetworkIdleState(driver,3 );
				By userRoles = By.xpath("//div[text()='"+role+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
				int size = BrowserActions.getWebElementSize(driver, userRoles, "num", 0.5);
				if (size > 0) {
					By userRoleBy = By.xpath("//div[text()='"+role+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
					BrowserActions.waitForElementToDisplay(driver, userRoleBy, "user role by");
					WebElement userRole = userRoleBy.findElement(driver);
					BrowserActions.click(driver, userRole, "Check box");
					break;
				}
				else {
					BrowserActions.click(driver, btnNextArrow,"Next Button");
				}
			}
		}

		public void verifyDeletedRolesNotDisplayed(WebDriver driver, String role)  {
			String pageNo=lblLastPageNo.getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			//BrowserActions.click(driver, btnFirstPageNo, "First Button");
			for(int i=1;i<=no;i++) {
				boolean flag = false;
				BrowserActions.waitForNetworkIdleState(driver,2 );
				By roleBy = By.xpath("//div[text()='"+role+"']");
				int size = BrowserActions.getWebElementSize(driver, roleBy, "roleBy", 0.5);
				if(size == 0) {
					flag = true;
					break;
				}
				else {
					BrowserActions.click(driver, btnNextArrow,"Next Button");
				}
				Log.softAssertThat(flag, "Roles("+role+") is not present as expected", "Roles("+role+") present in list");
			}
		}
	}
}
