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

public class AuthorityProfilesPage extends LoadableComponent<AuthorityProfilesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-11-Description']", AI = false)
	private WebElement inpDescription_32;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-6-Name']", AI = false)
	private WebElement inpName_16;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-0-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-5-Name']", AI = false)
	private WebElement inpName_13;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-4-Name']", AI = false)
	private WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-7-UserCount']", AI = false)
	private WebElement inpUserCount_21;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-7-Name']", AI = false)
	private WebElement inpName_19;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-13-Description']", AI = false)
	private WebElement inpDescription_38;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-12-Description']", AI = false)
	private WebElement inpDescription_35;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-9-UserCount']", AI = false)
	private WebElement inpUserCount_27;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-8-UserCount']", AI = false)
	private WebElement inpUserCount_24;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-2-Description']", AI = false)
	private WebElement inpDescription_5;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-14-Description']", AI = false)
	private WebElement inpDescription_41;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-1-Description']", AI = false)
	private WebElement inpDescription_2;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-14-Name']", AI = false)
	private WebElement inpName_40;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-3-UserCount']", AI = false)
	private WebElement inpUserCount_9;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-3-Description']", AI = false)
	private WebElement inpDescription_8;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-2-UserCount']", AI = false)
	private WebElement inpUserCount_6;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-4-UserCount']", AI = false)
	private WebElement inpUserCount_12;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-1-UserCount']", AI = false)
	private WebElement inpUserCount_3;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-6-UserCount']", AI = false)
	private WebElement inpUserCount_18;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-0-UserCount']", AI = false)
	private WebElement inpUserCount;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-5-UserCount']", AI = false)
	private WebElement inpUserCount_15;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-11-Name']", AI = false)
	private WebElement inpName_31;

	@IFindBy(how = How.CSS, using = "#UWAuthorityProfiles-ProfilesScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-4-Description']", AI = false)
	private WebElement inpDescription_11;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-13-Name']", AI = false)
	private WebElement inpName_37;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-12-Name']", AI = false)
	private WebElement inpName_34;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-14-UserCount']", AI = false)
	private WebElement inpUserCount_42;

	@IFindBy(how = How.CSS, using = "#UWAuthorityProfiles-ProfilesScreen-DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-5-Description']", AI = false)
	private WebElement inpDescription_14;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-6-Description']", AI = false)
	private WebElement inpDescription_17;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-8-Description']", AI = false)
	private WebElement inpDescription_23;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-7-Description']", AI = false)
	private WebElement inpDescription_20;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-10-Name']", AI = false)
	private WebElement inpName_28;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-9-Name']", AI = false)
	private WebElement inpName_25;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-8-Name']", AI = false)
	private WebElement inpName_22;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-11-UserCount']", AI = false)
	private WebElement inpUserCount_33;

	@IFindBy(how = How.CSS, using = "#UWAuthorityProfiles-ProfilesScreen-NewButton>div[role='button']", AI = false)
	private WebElement btnNew;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-10-UserCount']", AI = false)
	private WebElement inpUserCount_30;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-1-Name']", AI = false)
	private WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-9-Description']", AI = false)
	private WebElement inpDescription_26;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-2-Name']", AI = false)
	private WebElement inpName_4;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-13-UserCount']", AI = false)
	private WebElement inpUserCount_39;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-3-Name']", AI = false)
	private WebElement inpName_7;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-12-UserCount']", AI = false)
	private WebElement inpUserCount_36;

	@IFindBy(how = How.CSS, using = "#UWAuthorityProfiles-ProfilesScreen-CloneButton>div[role='button']", AI = false)
	private WebElement btnClone;

	@IFindBy(how = How.CSS, using = "input[name='UWAuthorityProfiles-ProfilesScreen-ProfilesLV-10-Description']", AI = false)
	private WebElement inpDescription_29;

	@IFindBy(how = How.CSS, using = "td[id$='Name_Cell']", AI = false)
	public List<WebElement> lblName;

	@IFindBy(how = How.CSS, using = "td[id$='Description_Cell']", AI = false)
	public List<WebElement> lblDescription;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public List<WebElement> lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-first']", AI = false)
	public WebElement btnFirstPageNo;

	public AuthorityProfilesPage(){
	}

	public AuthorityProfilesPage(WebDriver driver){
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
	}public AuthorityProfilesPage enterDescription_32(WebDriver driver,String Description_32) {
		BrowserActions.type(driver, inpDescription_32,Description_32, "Description_32");
		return this;
	}
	public AuthorityProfilesPage enterName_16(WebDriver driver,String Name_16) {
		BrowserActions.type(driver, inpName_16,Name_16, "Name_16");
		return this;
	}
	public AuthorityProfilesPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public AuthorityProfilesPage enterName_13(WebDriver driver,String Name_13) {
		BrowserActions.type(driver, inpName_13,Name_13, "Name_13");
		return this;
	}
	public AuthorityProfilesPage enterName_10(WebDriver driver,String Name_10) {
		BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_21(WebDriver driver,String UserCount_21) {
		BrowserActions.type(driver, inpUserCount_21,UserCount_21, "UserCount_21");
		return this;
	}
	public AuthorityProfilesPage enterName_19(WebDriver driver,String Name_19) {
		BrowserActions.type(driver, inpName_19,Name_19, "Name_19");
		return this;
	}
	public AuthorityProfilesPage enterDescription_38(WebDriver driver,String Description_38) {
		BrowserActions.type(driver, inpDescription_38,Description_38, "Description_38");
		return this;
	}
	public AuthorityProfilesPage enterDescription_35(WebDriver driver,String Description_35) {
		BrowserActions.type(driver, inpDescription_35,Description_35, "Description_35");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_27(WebDriver driver,String UserCount_27) {
		BrowserActions.type(driver, inpUserCount_27,UserCount_27, "UserCount_27");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_24(WebDriver driver,String UserCount_24) {
		BrowserActions.type(driver, inpUserCount_24,UserCount_24, "UserCount_24");
		return this;
	}
	public AuthorityProfilesPage enterDescription_5(WebDriver driver,String Description_5) {
		BrowserActions.type(driver, inpDescription_5,Description_5, "Description_5");
		return this;
	}
	public AuthorityProfilesPage enterDescription_41(WebDriver driver,String Description_41) {
		BrowserActions.type(driver, inpDescription_41,Description_41, "Description_41");
		return this;
	}
	public AuthorityProfilesPage enterDescription_2(WebDriver driver,String Description_2) {
		BrowserActions.type(driver, inpDescription_2,Description_2, "Description_2");
		return this;
	}
	public AuthorityProfilesPage enterName_40(WebDriver driver,String Name_40) {
		BrowserActions.type(driver, inpName_40,Name_40, "Name_40");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_9(WebDriver driver,String UserCount_9) {
		BrowserActions.type(driver, inpUserCount_9,UserCount_9, "UserCount_9");
		return this;
	}
	public AuthorityProfilesPage enterDescription_8(WebDriver driver,String Description_8) {
		BrowserActions.type(driver, inpDescription_8,Description_8, "Description_8");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_6(WebDriver driver,String UserCount_6) {
		BrowserActions.type(driver, inpUserCount_6,UserCount_6, "UserCount_6");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_12(WebDriver driver,String UserCount_12) {
		BrowserActions.type(driver, inpUserCount_12,UserCount_12, "UserCount_12");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_3(WebDriver driver,String UserCount_3) {
		BrowserActions.type(driver, inpUserCount_3,UserCount_3, "UserCount_3");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_18(WebDriver driver,String UserCount_18) {
		BrowserActions.type(driver, inpUserCount_18,UserCount_18, "UserCount_18");
		return this;
	}
	public AuthorityProfilesPage enterUserCount(WebDriver driver,String UserCount) {
		BrowserActions.type(driver, inpUserCount,UserCount, "UserCount");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_15(WebDriver driver,String UserCount_15) {
		BrowserActions.type(driver, inpUserCount_15,UserCount_15, "UserCount_15");
		return this;
	}
	public AuthorityProfilesPage enterName_31(WebDriver driver,String Name_31) {
		BrowserActions.type(driver, inpName_31,Name_31, "Name_31");
		return this;
	}
	public AuthorityProfilesPage enterDescription_11(WebDriver driver,String Description_11) {
		BrowserActions.type(driver, inpDescription_11,Description_11, "Description_11");
		return this;
	}
	public AuthorityProfilesPage enterName_37(WebDriver driver,String Name_37) {
		BrowserActions.type(driver, inpName_37,Name_37, "Name_37");
		return this;
	}
	public AuthorityProfilesPage enterName_34(WebDriver driver,String Name_34) {
		BrowserActions.type(driver, inpName_34,Name_34, "Name_34");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_42(WebDriver driver,String UserCount_42) {
		BrowserActions.type(driver, inpUserCount_42,UserCount_42, "UserCount_42");
		return this;
	}
	public AuthorityProfilesPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		BrowserActions.confirmAlert(driver, "Confirm Alert");
		return this;
	}
	public AuthorityProfilesPage enterDescription_14(WebDriver driver,String Description_14) {
		BrowserActions.type(driver, inpDescription_14,Description_14, "Description_14");
		return this;
	}
	public AuthorityProfilesPage enterDescription_17(WebDriver driver,String Description_17) {
		BrowserActions.type(driver, inpDescription_17,Description_17, "Description_17");
		return this;
	}
	public AuthorityProfilesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public AuthorityProfilesPage enterDescription_23(WebDriver driver,String Description_23) {
		BrowserActions.type(driver, inpDescription_23,Description_23, "Description_23");
		return this;
	}
	public AuthorityProfilesPage enterDescription_20(WebDriver driver,String Description_20) {
		BrowserActions.type(driver, inpDescription_20,Description_20, "Description_20");
		return this;
	}
	public AuthorityProfilesPage enterName_28(WebDriver driver,String Name_28) {
		BrowserActions.type(driver, inpName_28,Name_28, "Name_28");
		return this;
	}
	public AuthorityProfilesPage enterName_25(WebDriver driver,String Name_25) {
		BrowserActions.type(driver, inpName_25,Name_25, "Name_25");
		return this;
	}
	public AuthorityProfilesPage enterName_22(WebDriver driver,String Name_22) {
		BrowserActions.type(driver, inpName_22,Name_22, "Name_22");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_33(WebDriver driver,String UserCount_33) {
		BrowserActions.type(driver, inpUserCount_33,UserCount_33, "UserCount_33");
		return this;
	}
	public NewAuthorityProfilePage clickNew(WebDriver driver)  {
		BrowserActions.click(driver, btnNew,"New");
		return new NewAuthorityProfilePage(driver).get();
	}
	public AuthorityProfilesPage enterUserCount_30(WebDriver driver,String UserCount_30) {
		BrowserActions.type(driver, inpUserCount_30,UserCount_30, "UserCount_30");
		return this;
	}
	public AuthorityProfilesPage enterName_1(WebDriver driver,String Name_1) {
		BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
		return this;
	}
	public AuthorityProfilesPage enterDescription_26(WebDriver driver,String Description_26) {
		BrowserActions.type(driver, inpDescription_26,Description_26, "Description_26");
		return this;
	}
	public AuthorityProfilesPage enterName_4(WebDriver driver,String Name_4) {
		BrowserActions.type(driver, inpName_4,Name_4, "Name_4");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_39(WebDriver driver,String UserCount_39) {
		BrowserActions.type(driver, inpUserCount_39,UserCount_39, "UserCount_39");
		return this;
	}
	public AuthorityProfilesPage enterName_7(WebDriver driver,String Name_7) {
		BrowserActions.type(driver, inpName_7,Name_7, "Name_7");
		return this;
	}
	public AuthorityProfilesPage enterUserCount_36(WebDriver driver,String UserCount_36) {
		BrowserActions.type(driver, inpUserCount_36,UserCount_36, "UserCount_36");
		return this;
	}
	public AuthorityProfilesPage clickClone(WebDriver driver)  {
		BrowserActions.click(driver, btnClone,"Clone");
		return this;
	}
	public AuthorityProfilesPage enterDescription_29(WebDriver driver,String Description_29) {
		BrowserActions.type(driver, inpDescription_29,Description_29, "Description_29");
		return this;
	}
	public AuthorityProfilesPage  verifyDescriptionIsDisplayed(WebDriver driver) {
		for (int i = 0; i <= lblDescription.size()-1; i++) {
			BrowserActions.verifyElementDisplayed(driver, lblDescription.get(i), "Description were displayed");
		}
		return this;
	}
	public AuthorityProfilesPage  verifyNameIsDisplayed(WebDriver driver) {
		for (int i = 0; i <= lblName.size()-1; i++) {
			BrowserActions.verifyElementDisplayed(driver, lblName.get(i), "All the Aurthority Profile Name is displayed");
		}
		return this;
	}
	/**
	 * Click CheckBox
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */

	public AuthorityProfilesPage selectCheckBox(WebDriver driver,String name){
		if(lblLastPageNo.size()>0) {
			String pageNo=lblLastPageNo.get(0).getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			for(int i=1;i<=no;i++) {
				List<WebElement> userRoleCheckBox = driver.findElements(By.xpath("//div[text()='"+name+"']//ancestor::td/preceding-sibling::td//descendant::div[contains(@id,'Checkbox')]"));
				if (userRoleCheckBox.size() > 0) {
					By checkBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td/preceding-sibling::td//descendant::div[contains(@id,'Checkbox')]");

					BrowserActions.waitForElementToDisplay(driver, checkBoxBy, "checkBox");
					WebElement checkBox = checkBoxBy.findElement(driver);
					BrowserActions.click(driver, checkBox, "Check box");
					break;
				}
				else {
					BrowserActions.click(driver, btnNextArrow,true,"Next Button");
				}
			}}
		else
		{
			By checkBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td/preceding-sibling::td//descendant::div[contains(@id,'Checkbox')]");

			BrowserActions.waitForElementToDisplay(driver, checkBoxBy, "attributeName");
			WebElement checkBox = checkBoxBy.findElement(driver);
			BrowserActions.click(driver, checkBox, "Check box");
		}
		return this;
	}

	/**
	 * Verify clone button is display
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public AuthorityProfilesPage  verifyCloneButtonIsDisplay(WebDriver driver) {
	    BrowserActions.verifyElementDisplayed(driver, btnClone, "Clone button is displayed");
		return this;
	}
	/**
	 * Verify clone Delete is display
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */

	public AuthorityProfilesPage  verifyDeleteButtonIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnDelete, "Delete button is displayed");
		return this;
	}

	public class NewAuthorityProfilePage extends LoadableComponent<NewAuthorityProfilePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-Description textarea", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
		private WebElement inpColumn;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV-0-Value']", AI = false)
		private WebElement inpValue;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
		private WebElement inpLanguage;

		@IFindBy(how = How.CSS, using = "select[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV-0-ComparisonType']", AI = false)
		private WebElement drpComparison;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV-0-Type-SelectType", AI = false)
		private WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV-0-Description']", AI = false)
		private WebElement inpDescription_1;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV-0-Type']", AI = false)
		private WebElement inpType;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_3;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
		private WebElement inpLanguage_9;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
		private WebElement inpColumn_11;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
		private WebElement inpLanguage_6;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
		private WebElement inpColumn_10;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
		private WebElement inpFieldHeading_4;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-Update>div[role='button']", AI = false)
		private WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
		private WebElement inpFieldHeading;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-Name']", AI = false)
		private WebElement inpName;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
		private WebElement inpColumn_8;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_2;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
		private WebElement inpColumn_7;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
		private WebElement inpColumn_5;

		@IFindBy(how = How.CSS, using = "input[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
		private WebElement inpLanguageHeading;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "select[name='NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV-0-Currency']", AI = false)
		private WebElement drpCurrency;

		@IFindBy(how = How.CSS, using = "#NewUWAuthorityProfile-UWAuthorityProfileDetailScreen-ProfileDetailDV-AuthorityGrantsLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-0-0-column']", AI = false)
		public WebElement inpLocalizationName;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-2-0-column']", AI = false)
		public WebElement inpLocalizationName_1;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-2-1-column']", AI = false)
		public WebElement inpLocalizationDescription_1;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-0-1-column']", AI = false)
		public WebElement inpLocalizationDescription;


		public NewAuthorityProfilePage(){
		}

		public NewAuthorityProfilePage(WebDriver driver){
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
		}public NewAuthorityProfilePage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public NewAuthorityProfilePage enterColumn(WebDriver driver,String Column) {
			BrowserActions.type(driver, inpColumn,Column, "Column");
			return this;
		}
		public NewAuthorityProfilePage enterValue(WebDriver driver,String Value) {
			BrowserActions.type(driver, inpValue,Value, "Value");
			return this;
		}
		public NewAuthorityProfilePage enterLanguage(WebDriver driver,String Language) {
			BrowserActions.type(driver, inpLanguage,Language, "Language");
			return this;
		}
		public NewAuthorityProfilePage selectComparison(WebDriver driver,String Comparison)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpComparison,Comparison,"Comparison");
			return this;
		}
		public IssueTypeSearchPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,3,"Search");
			return new IssueTypeSearchPage(driver).get();
		}
		public NewAuthorityProfilePage enterDescription_1(WebDriver driver,String Description_1) {
			BrowserActions.type(driver, inpDescription_1,Description_1, "Description_1");
			return this;
		}
		public NewAuthorityProfilePage enterType(WebDriver driver,String Type) {
			BrowserActions.type(driver, inpType,Type, "Type");
			return this;
		}
		public NewAuthorityProfilePage clickRemove_3(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_3,"Remove_3");
			return this;
		}
		public NewAuthorityProfilePage enterLanguage_9(WebDriver driver,String Language_9) {
			BrowserActions.type(driver, inpLanguage_9,Language_9, "Language_9");
			return this;
		}
		public NewAuthorityProfilePage enterColumn_11(WebDriver driver,String Column_11) {
			BrowserActions.type(driver, inpColumn_11,Column_11, "Column_11");
			return this;
		}
		public NewAuthorityProfilePage enterLanguage_6(WebDriver driver,String Language_6) {
			BrowserActions.type(driver, inpLanguage_6,Language_6, "Language_6");
			return this;
		}
		public NewAuthorityProfilePage enterColumn_10(WebDriver driver,String Column_10) {
			BrowserActions.type(driver, inpColumn_10,Column_10, "Column_10");
			return this;
		}
		public NewAuthorityProfilePage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewAuthorityProfilePage enterFieldHeading_4(WebDriver driver,String FieldHeading_4) {
			BrowserActions.type(driver, inpFieldHeading_4,FieldHeading_4, "FieldHeading_4");
			return this;
		}
		public AuthorityProfilesPage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return new AuthorityProfilesPage(driver).get();
		}
		public NewAuthorityProfilePage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewAuthorityProfilePage enterFieldHeading(WebDriver driver,String FieldHeading) {
			BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			return this;
		}
		public NewAuthorityProfilePage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewAuthorityProfilePage enterColumn_8(WebDriver driver,String Column_8) {
			BrowserActions.type(driver, inpColumn_8,Column_8, "Column_8");
			return this;
		}
		public NewAuthorityProfilePage clickAdd_2(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_2,"Add_2");
			return this;
		}
		public NewAuthorityProfilePage enterColumn_7(WebDriver driver,String Column_7) {
			BrowserActions.type(driver, inpColumn_7,Column_7, "Column_7");
			return this;
		}
		public NewAuthorityProfilePage enterColumn_5(WebDriver driver,String Column_5) {
			BrowserActions.type(driver, inpColumn_5,Column_5, "Column_5");
			return this;
		}
		public NewAuthorityProfilePage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
			BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			return this;
		}
		public NewAuthorityProfilePage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewAuthorityProfilePage selectCurrency(WebDriver driver,String Currency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
			return this;
		}
		public NewAuthorityProfilePage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
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
		public class IssueTypeSearchPage extends LoadableComponent<IssueTypeSearchPage> {

			WebDriver driver;
			private boolean isPageLoaded;
			public ElementLayer elementLayer;
			String elementObject;
			HashMap<String, String> getPageObjects;
			public  List<Object> pageFactoryKey = new ArrayList<Object>();
			public  List<String> pageFactoryValue = new ArrayList<String>();

			//TopNavBar object

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-1-Code']", AI = false)
			private WebElement inpCode_3;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-7-Code']", AI = false)
			private WebElement inpCode_21;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-2-Code']", AI = false)
			private WebElement inpCode_6;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-10-Description']", AI = false)
			private WebElement inpDescription_32;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-5-Name']", AI = false)
			private WebElement inpName_16;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-9-Code']", AI = false)
			private WebElement inpCode_27;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchDV-Description']", AI = false)
			private WebElement inpDescription;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-4-Name']", AI = false)
			private WebElement inpName_13;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-3-Name']", AI = false)
			private WebElement inpName_10;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-8-Code']", AI = false)
			private WebElement inpCode_24;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-0-Code']", AI = false)
			private WebElement inpCode;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-6-Name']", AI = false)
			private WebElement inpName_19;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-12-Description']", AI = false)
			private WebElement inpDescription_38;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-11-Description']", AI = false)
			private WebElement inpDescription_35;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-3-Code']", AI = false)
			private WebElement inpCode_9;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-1-Description']", AI = false)
			private WebElement inpDescription_5;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-13-Description']", AI = false)
			private WebElement inpDescription_41;

			@IFindBy(how = How.CSS, using = "#UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
			private WebElement btnSearch;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-0-Description']", AI = false)
			private WebElement inpDescription_2;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-13-Name']", AI = false)
			private WebElement inpName_40;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-14-Description']", AI = false)
			private WebElement inpDescription_44;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-6-Code']", AI = false)
			private WebElement inpCode_18;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-2-Description']", AI = false)
			private WebElement inpDescription_8;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-5-Code']", AI = false)
			private WebElement inpCode_15;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-4-Code']", AI = false)
			private WebElement inpCode_12;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-14-Name']", AI = false)
			private WebElement inpName_43;

			@IFindBy(how = How.CSS, using = "#UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
			private WebElement btnReset;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-10-Name']", AI = false)
			private WebElement inpName_31;

			@IFindBy(how = How.CSS, using = "#UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-ttlBar", AI = false)
			private WebElement lblTtlBar;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-14-Code']", AI = false)
			private WebElement inpCode_42;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-3-Description']", AI = false)
			private WebElement inpDescription_11;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-12-Name']", AI = false)
			private WebElement inpName_37;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-11-Name']", AI = false)
			private WebElement inpName_34;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-4-Description']", AI = false)
			private WebElement inpDescription_14;

			@IFindBy(how = How.CSS, using = "#UWIssueTypeSearchPopup-__crumb__", AI = false)
			private WebElement btnReturntoNewAuthorityProfile;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-5-Description']", AI = false)
			private WebElement inpDescription_17;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-11-Code']", AI = false)
			private WebElement inpCode_33;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-10-Code']", AI = false)
			private WebElement inpCode_30;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchDV-Name']", AI = false)
			private WebElement inpName;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-7-Description']", AI = false)
			private WebElement inpDescription_23;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-6-Description']", AI = false)
			private WebElement inpDescription_20;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-9-Name']", AI = false)
			private WebElement inpName_28;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-8-Name']", AI = false)
			private WebElement inpName_25;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-13-Code']", AI = false)
			private WebElement inpCode_39;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-12-Code']", AI = false)
			private WebElement inpCode_36;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-7-Name']", AI = false)
			private WebElement inpName_22;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-0-Name']", AI = false)
			private WebElement inpName_1;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-8-Description']", AI = false)
			private WebElement inpDescription_26;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-1-Name']", AI = false)
			private WebElement inpName_4;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-2-Name']", AI = false)
			private WebElement inpName_7;

			@IFindBy(how = How.CSS, using = "input[name='UWIssueTypeSearchPopup-UWIssueTypeSearchScreen-UWIssueTypeSearchResultsLV-9-Description']", AI = false)
			private WebElement inpDescription_29;

			@IFindBy(how = How.CSS, using = "div[id$='UWIssueTypeSearchResultsLV-1-_Select']", AI = false)
			private WebElement btn_Select;

			public IssueTypeSearchPage(){
			}

			public IssueTypeSearchPage(WebDriver driver) {
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
			}public IssueTypeSearchPage enterCode_3(WebDriver driver,String Code_3) {
				BrowserActions.type(driver, inpCode_3,Code_3, "Code_3");
				return this;
			}
			public IssueTypeSearchPage enterCode_21(WebDriver driver,String Code_21) {
				BrowserActions.type(driver, inpCode_21,Code_21, "Code_21");
				return this;
			}
			public IssueTypeSearchPage enterCode_6(WebDriver driver,String Code_6) {
				BrowserActions.type(driver, inpCode_6,Code_6, "Code_6");
				return this;
			}
			public IssueTypeSearchPage enterDescription_32(WebDriver driver,String Description_32) {
				BrowserActions.type(driver, inpDescription_32,Description_32, "Description_32");
				return this;
			}
			public IssueTypeSearchPage enterName_16(WebDriver driver,String Name_16) {
				BrowserActions.type(driver, inpName_16,Name_16, "Name_16");
				return this;
			}
			public IssueTypeSearchPage enterCode_27(WebDriver driver,String Code_27) {
				BrowserActions.type(driver, inpCode_27,Code_27, "Code_27");
				return this;
			}
			public IssueTypeSearchPage enterDescription(WebDriver driver,String Description) {
				BrowserActions.type(driver, inpDescription,Description, "Description");
				return this;
			}
			public IssueTypeSearchPage enterName_13(WebDriver driver,String Name_13) {
				BrowserActions.type(driver, inpName_13,Name_13, "Name_13");
				return this;
			}
			public IssueTypeSearchPage enterName_10(WebDriver driver,String Name_10) {
				BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
				return this;
			}
			public IssueTypeSearchPage enterCode_24(WebDriver driver,String Code_24) {
				BrowserActions.type(driver, inpCode_24,Code_24, "Code_24");
				return this;
			}
			public IssueTypeSearchPage enterCode(WebDriver driver,String Code) {
				BrowserActions.type(driver, inpCode,Code, "Code");
				return this;
			}
			public IssueTypeSearchPage enterName_19(WebDriver driver,String Name_19) {
				BrowserActions.type(driver, inpName_19,Name_19, "Name_19");
				return this;
			}
			public IssueTypeSearchPage enterDescription_38(WebDriver driver,String Description_38) {
				BrowserActions.type(driver, inpDescription_38,Description_38, "Description_38");
				return this;
			}
			public IssueTypeSearchPage enterDescription_35(WebDriver driver,String Description_35) {
				BrowserActions.type(driver, inpDescription_35,Description_35, "Description_35");
				return this;
			}
			public IssueTypeSearchPage enterCode_9(WebDriver driver,String Code_9) {
				BrowserActions.type(driver, inpCode_9,Code_9, "Code_9");
				return this;
			}
			public IssueTypeSearchPage enterDescription_5(WebDriver driver,String Description_5) {
				BrowserActions.type(driver, inpDescription_5,Description_5, "Description_5");
				return this;
			}
			public IssueTypeSearchPage enterDescription_41(WebDriver driver,String Description_41) {
				BrowserActions.type(driver, inpDescription_41,Description_41, "Description_41");
				return this;
			}
			public IssueTypeSearchPage clickSearch(WebDriver driver)  {
				BrowserActions.click(driver, btnSearch,"Search");
				return this;
			}
			public IssueTypeSearchPage enterDescription_2(WebDriver driver,String Description_2) {
				BrowserActions.type(driver, inpDescription_2,Description_2, "Description_2");
				return this;
			}
			public IssueTypeSearchPage enterName_40(WebDriver driver,String Name_40) {
				BrowserActions.type(driver, inpName_40,Name_40, "Name_40");
				return this;
			}
			public IssueTypeSearchPage enterDescription_44(WebDriver driver,String Description_44) {
				BrowserActions.type(driver, inpDescription_44,Description_44, "Description_44");
				return this;
			}
			public IssueTypeSearchPage enterCode_18(WebDriver driver,String Code_18) {
				BrowserActions.type(driver, inpCode_18,Code_18, "Code_18");
				return this;
			}
			public IssueTypeSearchPage enterDescription_8(WebDriver driver,String Description_8) {
				BrowserActions.type(driver, inpDescription_8,Description_8, "Description_8");
				return this;
			}
			public IssueTypeSearchPage enterCode_15(WebDriver driver,String Code_15) {
				BrowserActions.type(driver, inpCode_15,Code_15, "Code_15");
				return this;
			}
			public IssueTypeSearchPage enterCode_12(WebDriver driver,String Code_12) {
				BrowserActions.type(driver, inpCode_12,Code_12, "Code_12");
				return this;
			}
			public IssueTypeSearchPage enterName_43(WebDriver driver,String Name_43) {
				BrowserActions.type(driver, inpName_43,Name_43, "Name_43");
				return this;
			}
			public IssueTypeSearchPage clickReset(WebDriver driver)  {
				BrowserActions.click(driver, btnReset,"Reset");
				return this;
			}
			public IssueTypeSearchPage enterName_31(WebDriver driver,String Name_31) {
				BrowserActions.type(driver, inpName_31,Name_31, "Name_31");
				return this;
			}
			public IssueTypeSearchPage enterCode_42(WebDriver driver,String Code_42) {
				BrowserActions.type(driver, inpCode_42,Code_42, "Code_42");
				return this;
			}
			public IssueTypeSearchPage enterDescription_11(WebDriver driver,String Description_11) {
				BrowserActions.type(driver, inpDescription_11,Description_11, "Description_11");
				return this;
			}
			public IssueTypeSearchPage enterName_37(WebDriver driver,String Name_37) {
				BrowserActions.type(driver, inpName_37,Name_37, "Name_37");
				return this;
			}
			public IssueTypeSearchPage enterName_34(WebDriver driver,String Name_34) {
				BrowserActions.type(driver, inpName_34,Name_34, "Name_34");
				return this;
			}
			public IssueTypeSearchPage enterDescription_14(WebDriver driver,String Description_14) {
				BrowserActions.type(driver, inpDescription_14,Description_14, "Description_14");
				return this;
			}
			public IssueTypeSearchPage clickReturntoNewAuthorityProfile(WebDriver driver)  {
				BrowserActions.click(driver, btnReturntoNewAuthorityProfile,"ReturntoNewAuthorityProfile");
				return this;
			}
			public IssueTypeSearchPage enterDescription_17(WebDriver driver,String Description_17) {
				BrowserActions.type(driver, inpDescription_17,Description_17, "Description_17");
				return this;
			}
			public IssueTypeSearchPage enterCode_33(WebDriver driver,String Code_33) {
				BrowserActions.type(driver, inpCode_33,Code_33, "Code_33");
				return this;
			}
			public IssueTypeSearchPage enterCode_30(WebDriver driver,String Code_30) {
				BrowserActions.type(driver, inpCode_30,Code_30, "Code_30");
				return this;
			}
			public IssueTypeSearchPage enterName(WebDriver driver,String Name) {
				BrowserActions.type(driver, inpName,Name, "Name");
				return this;
			}
			public IssueTypeSearchPage enterDescription_23(WebDriver driver,String Description_23) {
				BrowserActions.type(driver, inpDescription_23,Description_23, "Description_23");
				return this;
			}
			public IssueTypeSearchPage enterDescription_20(WebDriver driver,String Description_20) {
				BrowserActions.type(driver, inpDescription_20,Description_20, "Description_20");
				return this;
			}
			public IssueTypeSearchPage enterName_28(WebDriver driver,String Name_28) {
				BrowserActions.type(driver, inpName_28,Name_28, "Name_28");
				return this;
			}
			public IssueTypeSearchPage enterName_25(WebDriver driver,String Name_25) {
				BrowserActions.type(driver, inpName_25,Name_25, "Name_25");
				return this;
			}
			public IssueTypeSearchPage enterCode_39(WebDriver driver,String Code_39) {
				BrowserActions.type(driver, inpCode_39,Code_39, "Code_39");
				return this;
			}
			public IssueTypeSearchPage enterCode_36(WebDriver driver,String Code_36) {
				BrowserActions.type(driver, inpCode_36,Code_36, "Code_36");
				return this;
			}
			public IssueTypeSearchPage enterName_22(WebDriver driver,String Name_22) {
				BrowserActions.type(driver, inpName_22,Name_22, "Name_22");
				return this;
			}
			public IssueTypeSearchPage enterName_1(WebDriver driver,String Name_1) {
				BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
				return this;
			}
			public IssueTypeSearchPage enterDescription_26(WebDriver driver,String Description_26) {
				BrowserActions.type(driver, inpDescription_26,Description_26, "Description_26");
				return this;
			}
			public IssueTypeSearchPage enterName_4(WebDriver driver,String Name_4) {
				BrowserActions.type(driver, inpName_4,Name_4, "Name_4");
				return this;
			}
			public IssueTypeSearchPage enterName_7(WebDriver driver,String Name_7) {
				BrowserActions.type(driver, inpName_7,Name_7, "Name_7");
				return this;
			}
			public IssueTypeSearchPage enterDescription_29(WebDriver driver,String Description_29) {
				BrowserActions.type(driver, inpDescription_29,Description_29, "Description_29");
				return this;
			}
			/**
			 * click select
			 * @author vignesh.ravi
			 * @param driver
			 * @return NewAuthorityProfilePage
			 */
			public NewAuthorityProfilePage clickSelect(WebDriver driver) {
				BrowserActions.click(driver,btn_Select, "Select Button");
				return new NewAuthorityProfilePage(driver).get();
			}
			/**
			 * Enter Select Button
			 * @author vignesh.ravi
			 * @param driver
			 * @return NewAuthorityProfilePage
			 */

			public NewAuthorityProfilePage clickSelectIssueType(WebDriver driver) {
				By selectBy = By.xpath("//div[text()='IsClassificationCodeHazardous']//ancestor::td//preceding-sibling::td//ancestor::div[contains(@id,'_Select')]");
				BrowserActions.waitForElementToDisplay(driver, selectBy, "select");
				WebElement select = selectBy.findElement(driver);
				BrowserActions.click(driver,select, "Select Button");
				return new NewAuthorityProfilePage(driver).get();
			}
		}

	}
}
