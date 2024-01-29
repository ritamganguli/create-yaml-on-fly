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
import org.openqa.selenium.support.ui.Select;
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

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-11-Description']", AI = false)
	private WebElement inpDescription_34;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-13-Type']", AI = false)
	private WebElement drpType_39;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-10-Description']", AI = false)
	private WebElement inpDescription_31;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-6-Name']", AI = false)
	private WebElement inpName_17;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-5-Name']", AI = false)
	private WebElement inpName_14;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-12-Type']", AI = false)
	private WebElement drpType_36;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-10-Type']", AI = false)
	private WebElement drpType_30;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-gosuFilters']", AI = false)
	private WebElement drpGosuFilters_1;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-0-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-4-Name']", AI = false)
	private WebElement inpName_11;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-11-Type']", AI = false)
	private WebElement drpType_33;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-12-Description']", AI = false)
	private WebElement inpDescription_37;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-13-Description']", AI = false)
	private WebElement inpDescription_40;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-14-Name']", AI = false)
	private WebElement inpName_41;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-1-Description']", AI = false)
	private WebElement inpDescription_4;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-gosuFilters']", AI = false)
	private WebElement drpGosuFilters;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-14-Description']", AI = false)
	private WebElement inpDescription_43;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-14-Type']", AI = false)
	private WebElement drpType_42;

	@IFindBy(how = How.CSS, using = "#Roles-RolesScreen-Roles_NewRoleButton>div[role='button']", AI = false)
	private WebElement btnNewRole;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-2-Description']", AI = false)
	private WebElement inpDescription_7;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-0-Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#Roles-RolesScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-6-Type']", AI = false)
	private WebElement drpType_18;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-3-Description']", AI = false)
	private WebElement inpDescription_10;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-4-Type']", AI = false)
	private WebElement drpType_12;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-13-Name']", AI = false)
	private WebElement inpName_38;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-5-Type']", AI = false)
	private WebElement drpType_15;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-12-Name']", AI = false)
	private WebElement inpName_35;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-11-Name']", AI = false)
	private WebElement inpName_32;

	@IFindBy(how = How.CSS, using = "#Roles-RolesScreen-Roles_DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-3-Type']", AI = false)
	private WebElement drpType_9;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-5-Description']", AI = false)
	private WebElement inpDescription_16;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-4-Description']", AI = false)
	private WebElement inpDescription_13;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-2-Type']", AI = false)
	private WebElement drpType_6;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-6-Description']", AI = false)
	private WebElement inpDescription_19;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-1-Type']", AI = false)
	private WebElement drpType_3;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-7-Name']", AI = false)
	private WebElement inpName_20;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-7-Description']", AI = false)
	private WebElement inpDescription_22;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-9-Type']", AI = false)
	private WebElement drpType_27;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-8-Type']", AI = false)
	private WebElement drpType_24;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-9-Name']", AI = false)
	private WebElement inpName_26;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-8-Name']", AI = false)
	private WebElement inpName_23;

	@IFindBy(how = How.CSS, using = "select[name='Roles-RolesScreen-RolesLV-7-Type']", AI = false)
	private WebElement drpType_21;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-10-Name']", AI = false)
	private WebElement inpName_29;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-1-Name']", AI = false)
	private WebElement inpName_2;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-8-Description']", AI = false)
	private WebElement inpDescription_25;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-2-Name']", AI = false)
	private WebElement inpName_5;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-9-Description']", AI = false)
	private WebElement inpDescription_28;

	@IFindBy(how = How.CSS, using = "input[name='Roles-RolesScreen-RolesLV-3-Name']", AI = false)
	private WebElement inpName_8;

	@IFindBy(how = How.CSS, using = "select[name$='Filters']", AI = false)
	private WebElement drpRolesFilter;
	
	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public WebElement lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-first']", AI = false)
	public WebElement btnFirstPageNo;
	
	
	String rolesFiltersOptions="//select[contains(@name,'Filters')]/option";

	public RolesPage(){
	}

	public RolesPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}

	public RolesPage enterDescription_34(WebDriver driver,String Description_34) {
		BrowserActions.type(driver, inpDescription_34,Description_34, "Description_34");
		return this;
	}
	public RolesPage selectType_39(WebDriver driver,String Type_39)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_39,Type_39,"Type_39");
		return this;
	}
	public RolesPage enterDescription_31(WebDriver driver,String Description_31) {
		BrowserActions.type(driver, inpDescription_31,Description_31, "Description_31");
		return this;
	}
	public RolesPage enterName_17(WebDriver driver,String Name_17) {
		BrowserActions.type(driver, inpName_17,Name_17, "Name_17");
		return this;
	}
	public RolesPage enterName_14(WebDriver driver,String Name_14) {
		BrowserActions.type(driver, inpName_14,Name_14, "Name_14");
		return this;
	}
	public RolesPage selectType_36(WebDriver driver,String Type_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_36,Type_36,"Type_36");
		return this;
	}
	public RolesPage selectType_30(WebDriver driver,String Type_30)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_30,Type_30,"Type_30");
		return this;
	}
	public RolesPage selectGosuFilters_1(WebDriver driver,String GosuFilters_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGosuFilters_1,GosuFilters_1,"GosuFilters_1");
		return this;
	}
	public RolesPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public RolesPage enterName_11(WebDriver driver,String Name_11) {
		BrowserActions.type(driver, inpName_11,Name_11, "Name_11");
		return this;
	}
	public RolesPage selectType_33(WebDriver driver,String Type_33)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_33,Type_33,"Type_33");
		return this;
	}
	public RolesPage enterDescription_37(WebDriver driver,String Description_37) {
		BrowserActions.type(driver, inpDescription_37,Description_37, "Description_37");
		return this;
	}
	public RolesPage enterDescription_40(WebDriver driver,String Description_40) {
		BrowserActions.type(driver, inpDescription_40,Description_40, "Description_40");
		return this;
	}
	public RolesPage enterName_41(WebDriver driver,String Name_41) {
		BrowserActions.type(driver, inpName_41,Name_41, "Name_41");
		return this;
	}
	public RolesPage enterDescription_4(WebDriver driver,String Description_4) {
		BrowserActions.type(driver, inpDescription_4,Description_4, "Description_4");
		return this;
	}
	public RolesPage selectGosuFilters(WebDriver driver,String GosuFilters)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGosuFilters,GosuFilters,"GosuFilters");
		return this;
	}
	public RolesPage enterDescription_43(WebDriver driver,String Description_43) {
		BrowserActions.type(driver, inpDescription_43,Description_43, "Description_43");
		return this;
	}
	public RolesPage selectType_42(WebDriver driver,String Type_42)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_42,Type_42,"Type_42");
		return this;
	}
	public RolesPage clickNewRole(WebDriver driver)  {
		BrowserActions.click(driver, btnNewRole,"NewRole");
		return this;
	}
	public RolesPage enterDescription_7(WebDriver driver,String Description_7) {
		BrowserActions.type(driver, inpDescription_7,Description_7, "Description_7");
		return this;
	}
	public RolesPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public RolesPage selectType_18(WebDriver driver,String Type_18)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_18,Type_18,"Type_18");
		return this;
	}
	public RolesPage enterDescription_10(WebDriver driver,String Description_10) {
		BrowserActions.type(driver, inpDescription_10,Description_10, "Description_10");
		return this;
	}
	public RolesPage selectType_12(WebDriver driver,String Type_12)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_12,Type_12,"Type_12");
		return this;
	}
	public RolesPage enterName_38(WebDriver driver,String Name_38) {
		BrowserActions.type(driver, inpName_38,Name_38, "Name_38");
		return this;
	}
	public RolesPage selectType_15(WebDriver driver,String Type_15)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_15,Type_15,"Type_15");
		return this;
	}
	public RolesPage enterName_35(WebDriver driver,String Name_35) {
		BrowserActions.type(driver, inpName_35,Name_35, "Name_35");
		return this;
	}
	public RolesPage enterName_32(WebDriver driver,String Name_32) {
		BrowserActions.type(driver, inpName_32,Name_32, "Name_32");
		return this;
	}
	public RolesPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public RolesPage selectType_9(WebDriver driver,String Type_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_9,Type_9,"Type_9");
		return this;
	}
	public RolesPage enterDescription_16(WebDriver driver,String Description_16) {
		BrowserActions.type(driver, inpDescription_16,Description_16, "Description_16");
		return this;
	}
	public RolesPage enterDescription_13(WebDriver driver,String Description_13) {
		BrowserActions.type(driver, inpDescription_13,Description_13, "Description_13");
		return this;
	}
	public RolesPage selectType_6(WebDriver driver,String Type_6)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_6,Type_6,"Type_6");
		return this;
	}
	public RolesPage enterDescription_19(WebDriver driver,String Description_19) {
		BrowserActions.type(driver, inpDescription_19,Description_19, "Description_19");
		return this;
	}
	public RolesPage selectType_3(WebDriver driver,String Type_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_3,Type_3,"Type_3");
		return this;
	}
	public RolesPage enterName_20(WebDriver driver,String Name_20) {
		BrowserActions.type(driver, inpName_20,Name_20, "Name_20");
		return this;
	}
	public RolesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public RolesPage enterDescription_22(WebDriver driver,String Description_22) {
		BrowserActions.type(driver, inpDescription_22,Description_22, "Description_22");
		return this;
	}
	public RolesPage selectType_27(WebDriver driver,String Type_27)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_27,Type_27,"Type_27");
		return this;
	}
	public RolesPage selectType_24(WebDriver driver,String Type_24)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_24,Type_24,"Type_24");
		return this;
	}
	public RolesPage enterName_26(WebDriver driver,String Name_26) {
		BrowserActions.type(driver, inpName_26,Name_26, "Name_26");
		return this;
	}
	public RolesPage enterName_23(WebDriver driver,String Name_23) {
		BrowserActions.type(driver, inpName_23,Name_23, "Name_23");
		return this;
	}
	public RolesPage selectType_21(WebDriver driver,String Type_21)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_21,Type_21,"Type_21");
		return this;
	}
	public RolesPage enterName_29(WebDriver driver,String Name_29) {
		BrowserActions.type(driver, inpName_29,Name_29, "Name_29");
		return this;
	}
	public RolesPage enterName_2(WebDriver driver,String Name_2) {
		BrowserActions.type(driver, inpName_2,Name_2, "Name_2");
		return this;
	}
	public RolesPage enterDescription_25(WebDriver driver,String Description_25) {
		BrowserActions.type(driver, inpDescription_25,Description_25, "Description_25");
		return this;
	}
	public RolesPage enterName_5(WebDriver driver,String Name_5) {
		BrowserActions.type(driver, inpName_5,Name_5, "Name_5");
		return this;
	}
	public RolesPage enterDescription_28(WebDriver driver,String Description_28) {
		BrowserActions.type(driver, inpDescription_28,Description_28, "Description_28");
		return this;
	}
	public RolesPage enterName_8(WebDriver driver,String Name_8) {
		BrowserActions.type(driver, inpName_8,Name_8, "Name_8");
		return this;
	}
	
	/**
	 * Verify role is matching 
	 * @param driver , role
	 * @return
	 */
	public void verifyRoleIsMatching(WebDriver driver, String role) {
		
		String pageNo=lblLastPageNo.getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			By roleBy = By.xpath("//div[text()='"+role+"']");
			int size = BrowserActions.getWebElementSize(driver, roleBy, "Role", 0.5);
			if (size > 0) {
				By userRoleBy =By.xpath("//div[text()='"+role+"']");
				
				BrowserActions.waitForElementToDisplay(driver, userRoleBy, "userRole");
				WebElement userRole = userRoleBy.findElement(driver);
				Log.assertThat(userRole.isDisplayed(), "Sucessfully New Role is Added", "New Role is not added");
				break;
			}
			else {
				BrowserActions.click(driver, btnNextArrow,true,"Next Button");
			}
		}
	}
	
	/**
	 * Verify Roles DropDown Default Value text
	 * @param driver , role
	 * @return
	 */
	public void verifyRolesDropDownDefaultValue(WebDriver driver,String roles){
		Select rolesDrpValue= new Select(drpRolesFilter);
		WebElement firstSelectedOption = rolesDrpValue.getFirstSelectedOption();
		Log.assertThat(firstSelectedOption.getText().equals(roles), "Default value is matching", "Default value is not matching");
	}
	
	/**
	 * Verify DropDown Option Values For Roles were matched or not
	 * @param driver 
	 * @return
	 */
	public RolesPage verifyDropDownOptionValuesForRoles(WebDriver driver) {
		List<String> webList = new ArrayList<String>();
		webList.add("All Roles");
		webList.add("Producer Code Role");
		webList.add("User Role");
		List <WebElement> op = driver.findElements(By.xpath(rolesFiltersOptions));
		List<String> elementList = new ArrayList<String>();
		int size = op.size();
		for(int i =0; i<size ; i++){
			String options = op.get(i).getText();
			elementList.add(options);
		}
		if(webList.equals(elementList)){
			Log.message("Roles Drop down values are matched");
		}else {
			Log.fail("Roles Drop down values are not matched");
		}
		return this;
	}
	
	/**
	 * Click roles check box
	 * @param driver m roles
	 * @return
	 */
	public void clickRolesChkBox(WebDriver driver,String roles){
		By userRoleBy = By.xpath("//div[text()='"+roles+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, userRoleBy, "userRole");
		WebElement userRole = userRoleBy.findElement(driver);
		BrowserActions.click(driver, userRole, "Roles");

	}

	public class NewRolesPage extends LoadableComponent<NewRolesPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-Update>div[role='button']", AI = false)
		public WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
		public WebElement inpFieldHeading_3;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetailDV-Description textarea", AI = false)
		public WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleProducerCodesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove_14;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
		public WebElement inpColumn;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetail_UsersCardTab", AI = false)
		public WebElement btnUsers;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleUsersLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove_12;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-RoleDetailDV-CarrierInternalRole']", AI = false)
		public WebElement rdbInternalRoleOnly;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetail_RolesCardTab", AI = false)
		public WebElement btnBasics;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetailDV-RolePrivilegesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
		public WebElement inpLanguage;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
		public WebElement inpFieldHeading;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-RoleDetailDV-Name']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
		public WebElement inpColumn_9;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
		public WebElement inpColumn_6;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
		public WebElement inpColumn_7;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
		public WebElement inpColumn_4;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd_1;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetail_ProducerCodesCardTab", AI = false)
		public WebElement btnProducerCodes;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
		public WebElement inpLanguageHeading;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
		public WebElement inpLanguage_8;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
		public WebElement inpLanguage_5;

		@IFindBy(how = How.CSS, using = "select[name='NewRole-RoleDetailScreen-RoleDetailDV-RoleType']", AI = false)
		public WebElement drpType;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleDetailDV-RolePrivilegesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove_2;

		@IFindBy(how = How.CSS, using = "input[name='NewRole-RoleDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
		public WebElement inpColumn_10;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleUsersLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd_11;

		@IFindBy(how = How.CSS, using = "#NewRole-RoleDetailScreen-RoleProducerCodesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd_13;
		
		@IFindBy(how = How.CSS, using = "select[name$='RolePrivilegesLV-0-Permission']", AI = false)
		public WebElement drpPermission;

		public NewRolesPage(){
		}

		public NewRolesPage(WebDriver driver) throws Exception{
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
		}public NewRolesPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewRolesPage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return this;
		}
		public NewRolesPage enterFieldHeading_3(WebDriver driver,String FieldHeading_3) {
			BrowserActions.type(driver, inpFieldHeading_3,FieldHeading_3, "FieldHeading_3");
			return this;
		}
		public NewRolesPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public NewRolesPage clickRemove_14(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_14,"Remove_14");
			return this;
		}
		public NewRolesPage enterColumn(WebDriver driver,String Column) {
			BrowserActions.type(driver, inpColumn,Column, "Column");
			return this;
		}
		public NewRolesPage clickUsers(WebDriver driver)  {
			BrowserActions.click(driver, btnUsers,"Users");
			return this;
		}
		public NewRolesPage clickRemove_12(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_12,"Remove_12");
			return this;
		}
		public NewRolesPage clickInternalRoleOnly(WebDriver driver)  {
			BrowserActions.click(driver, rdbInternalRoleOnly,"InternalRoleOnly");
			return this;
		}
		public NewRolesPage clickBasics(WebDriver driver)  {
			BrowserActions.click(driver, btnBasics,"Basics");
			return this;
		}
		public NewRolesPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewRolesPage enterLanguage(WebDriver driver,String Language) {
			BrowserActions.type(driver, inpLanguage,Language, "Language");
			return this;
		}
		public NewRolesPage enterFieldHeading(WebDriver driver,String FieldHeading) {
			BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			return this;
		}
		public NewRolesPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewRolesPage enterColumn_9(WebDriver driver,String Column_9) {
			BrowserActions.type(driver, inpColumn_9,Column_9, "Column_9");
			return this;
		}
		public NewRolesPage enterColumn_6(WebDriver driver,String Column_6) {
			BrowserActions.type(driver, inpColumn_6,Column_6, "Column_6");
			return this;
		}
		public NewRolesPage enterColumn_7(WebDriver driver,String Column_7) {
			BrowserActions.type(driver, inpColumn_7,Column_7, "Column_7");
			return this;
		}
		public NewRolesPage enterColumn_4(WebDriver driver,String Column_4) {
			BrowserActions.type(driver, inpColumn_4,Column_4, "Column_4");
			return this;
		}
		public NewRolesPage clickAdd_1(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_1,"Add_1");
			return this;
		}
		public NewRolesPage clickProducerCodes(WebDriver driver)  {
			BrowserActions.click(driver, btnProducerCodes,"ProducerCodes");
			return this;
		}
		public NewRolesPage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
			BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			return this;
		}
		public NewRolesPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewRolesPage enterLanguage_8(WebDriver driver,String Language_8) {
			BrowserActions.type(driver, inpLanguage_8,Language_8, "Language_8");
			return this;
		}
		public NewRolesPage enterLanguage_5(WebDriver driver,String Language_5) {
			BrowserActions.type(driver, inpLanguage_5,Language_5, "Language_5");
			return this;
		}
		public NewRolesPage selectType(WebDriver driver,String Type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
			return this;
		}
		public NewRolesPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public NewRolesPage clickRemove_2(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_2,"Remove_2");
			return this;
		}
		public NewRolesPage enterColumn_10(WebDriver driver,String Column_10) {
			BrowserActions.type(driver, inpColumn_10,Column_10, "Column_10");
			return this;
		}
		public NewRolesPage clickAdd_11(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_11,"Add_11");
			return this;
		}
		public NewRolesPage clickAdd_13(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_13,"Add_13");
			return this;
		}
		
		/**
		 * Select permission ddrop down with text
		 * @param driver , permission
		 * @return
		 */

		public NewRolesPage selectPermission(WebDriver driver,String permission)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPermission,permission,"Permission");
			return this;
		}
		
	}
}