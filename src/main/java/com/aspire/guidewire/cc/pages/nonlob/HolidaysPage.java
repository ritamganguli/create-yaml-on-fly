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

public class HolidaysPage extends LoadableComponent<HolidaysPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#HolidaysPage-HolidaysScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#HolidaysPage-HolidaysScreen-HolidaysLV_tb-Holidays_AddHolidayButton>div[role='button']", AI = false)
	public WebElement btnAddHoliday;

	@IFindBy(how = How.CSS, using = "#HolidaysPage-HolidaysScreen-HolidaysLV-0-Date_dateIcon", AI = false)
	public WebElement btnDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='HolidaysPage-HolidaysScreen-HolidaysLV-0-Zones']", AI = false)
	public WebElement inpZones;

	@IFindBy(how = How.CSS, using = "input[name='HolidaysPage-HolidaysScreen-HolidaysLV-0-Tags']", AI = false)
	public WebElement inpTypes;

	@IFindBy(how = How.CSS, using = "#HolidaysPage-HolidaysScreen-HolidaysLV_tb-Holidays_DeleteButton>div[role='button']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='HolidaysPage-HolidaysScreen-HolidaysLV-0-Name']", AI = false)
	public WebElement inpHoliday;

	@IFindBy(how = How.CSS, using = "input[name='HolidaysPage-HolidaysScreen-HolidaysLV-0-Date']", AI = false)
	public WebElement inpDate;

	@IFindBy(how = How.CSS, using = "div[id$='Name_button']", AI = false)
	public WebElement btnHolidayName;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='HolidayDetail_UpLink']", AI = false)
	public WebElement btnUptoHoliday;
	
	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public List<WebElement> lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;


	public HolidaysPage(){
	}

	public HolidaysPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpDate))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public HolidaysPage clickAddHoliday(WebDriver driver)  {
		BrowserActions.click(driver, btnAddHoliday,"AddHoliday");
		return this;
	}
	public HolidaysPage clickDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateDateIcon,"DateDateIcon");
		return this;
	}
	public HolidaysPage enterZones(WebDriver driver,String Zones) {
		BrowserActions.type(driver, inpZones,Zones, "Zones");
		return this;
	}
	public HolidaysPage enterTypes(WebDriver driver,String Types) {
		BrowserActions.type(driver, inpTypes,Types, "Types");
		return this;
	}
	public HolidaysPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public HolidaysPage enterHoliday(WebDriver driver,String Holiday) {
		BrowserActions.type(driver, inpHoliday,Holiday, "Holiday");
		return this;
	}
	public HolidaysPage enterDate(WebDriver driver,String Date) {
		BrowserActions.type(driver, inpDate,Date, "Date");
		return this;
	}

	public HolidaysPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}

	public HolidaysPage clickHolidayNameLink(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,btnHolidayName);
		By catastrophesNameBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, catastrophesNameBy,"catastrophes Name");
		WebElement catastrophesName = catastrophesNameBy.findElement(driver);
		BrowserActions.click(driver, catastrophesName,"Catastrophes Name Name Link");
		return this;
	}

	public HolidaysPage clickNameCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,btnHolidayName);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy,"name ");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,1,"Name check box");
		return this;
	}

	public HolidaysPage clickUptoHoliday(WebDriver driver)  {
		BrowserActions.click(driver, btnUptoHoliday,"Upto Holiday");
		return this;
	}

	public void verifyHolidayMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTtlBar,"Main Page Title");
	}

	public HolidaysPage verifyEditButtonIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnEdit,"Edit Button");
		return this;
	}
	public HolidaysPage selectCreatedHoliday(WebDriver driver ,String holiday)  {
		By holidayChkBoxBy = By.xpath("//div[text()='"+holiday+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, holidayChkBoxBy, "holiday check box");
		WebElement holidayChkBox = holidayChkBoxBy.findElement(driver);
		BrowserActions.click(driver, holidayChkBox,1,"Check Box");
		return this;
	}

	
	public HolidaysPage verifyHolidayDateUpdated(WebDriver driver,String holiday,String updatedDate) 
	{
		if(lblLastPageNo.size()>0){
			String pageNo=lblLastPageNo.get(0).getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			for(int i=1;i<=no;i++) 
			{
				BrowserActions.waitForNetworkIdleState(driver,3 );
				By holidayBy = By.xpath("//div[text()='"+holiday+"']//ancestor::td//following-sibling::td//descendant::div[contains(@id,'Date')]");
				int size = BrowserActions.getWebElementSize(driver, holidayBy, "Holiday",0.5);
				if (size > 0) {
					By holidayDateBy = By.xpath("//div[text()='"+holiday+"']//ancestor::td//following-sibling::td//descendant::div[contains(@id,'Date')]");
					BrowserActions.waitForElementToDisplay(driver, holidayDateBy,"holiday date by");
					WebElement holidayDate = holidayDateBy.findElement(driver);
					Log.assertThat(holidayDate.getText().equals(updatedDate), "Holiday name is updated", "Holiday name not updated");
					break;
				}
				else {
					BrowserActions.click(driver, btnNextArrow,true,"Next Button");
				}
			}
		  }
		else
		{
			By holidayDateBy = By.xpath("//div[text()='"+holiday+"']//ancestor::td//following-sibling::td//descendant::div[contains(@id,'Date')]");
			BrowserActions.waitForElementToDisplay(driver, holidayDateBy,"holiday date by");
			WebElement holidayDate = holidayDateBy.findElement(driver);
			Log.assertThat(holidayDate.getText().equals(updatedDate), "Holiday name is updated", "Holiday name not updated");
		}
			return this;

		}


	public class AddHolidayPage extends LoadableComponent<AddHolidayPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();


		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
		public WebElement inpHoliday_3;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-AllZones']", AI = false)
		public WebElement rdbAppliestoAllZones;

		@IFindBy(how = How.CSS, using = "select[name='NewHoliday-HolidayDetailScreen-TagInput']", AI = false)
		public WebElement drpTypes;

		@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column0']", AI = false)
		public WebElement inpHoliday_6;

		@IFindBy(how = How.CSS, using = "select[name='NewHoliday-HolidayDetailScreen-HolidayDetailDV-ZoneInput']", AI = false)
		public WebElement drpZones;

		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-Date_dateIcon", AI = false)
		public WebElement btnDateDateIcon;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-Zones textarea", AI = false)
		public WebElement inpZones;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-Tags textarea", AI = false)
		public WebElement inpTypes;

		@IFindBy(how = How.CSS, using = "input[name$='HolidayDetailScreen-Date']", AI = false)
		public WebElement inpDate;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-HolidayDetailDV-HolidayZonesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
		public WebElement inpLanguage;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column1']", AI = false)
		public WebElement inpDependentonRender_7;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
		public WebElement inpDependentonRender_8;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
		public WebElement inpDependentonRender_4;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
		public WebElement inpHoliday_10;

		@IFindBy(how = How.CSS, using = "select[name='NewHoliday-HolidayDetailScreen-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd_1;

		@IFindBy(how = How.CSS, using = "select[name='NewHoliday-HolidayDetailScreen-HolidayDetailDV-ZoneType']", AI = false)
		public WebElement drpZoneType;

		@IFindBy(how = How.CSS, using = "select[name='NewHoliday-HolidayDetailScreen-HolidayDetailDV-state']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
		public WebElement inpLanguage_9;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
		public WebElement inpDependentonRender_11;

		@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
		public WebElement inpDependentonRender_12;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
		public WebElement inpLanguage_5;

		@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
		public WebElement inpHoliday;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-HolidayDetailDV-HolidayZonesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove_2;

		@IFindBy(how = How.CSS, using = "input[name='NewHoliday-HolidayDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
		public WebElement inpDependentonRender;

		@IFindBy(how = How.CSS, using = "input[name$='LV-0-column0']", AI = false)
		public WebElement inpNameEdgePolicyholderEnglish;

		@IFindBy(how = How.CSS, using = "input[name$='LV-2-column0']", AI = false)
		public WebElement inpNameEdgeEnglish;

		public AddHolidayPage(){
		}

		public AddHolidayPage(WebDriver driver) throws Exception{
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpDependentonRender))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public AddHolidayPage enterHoliday_3(WebDriver driver,String Holiday_3) {
			BrowserActions.type(driver, inpHoliday_3,Holiday_3, "Holiday_3");
			return this;
		}
		public AddHolidayPage clickAppliestoAllZones(WebDriver driver)  {
			BrowserActions.click(driver, rdbAppliestoAllZones,"AppliestoAllZones");
			return this;
		}
		public AddHolidayPage selectTypes(WebDriver driver,String Types)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTypes,Types,"Types");
			return this;
		}
		public AddHolidayPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public AddHolidayPage enterHoliday_6(WebDriver driver,String Holiday_6) {
			BrowserActions.type(driver, inpHoliday_6,Holiday_6, "Holiday_6");
			return this;
		}
		public AddHolidayPage selectZones(WebDriver driver,String Zones)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpZones,Zones,"Zones");
			return this;
		}
		public AddHolidayPage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return this;
		}
		public AddHolidayPage clickDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnDateDateIcon,"DateDateIcon");
			return this;
		}
		public AddHolidayPage enterZones(WebDriver driver,String Zones) {
			BrowserActions.type(driver, inpZones,Zones, "Zones");
			return this;
		}
		public AddHolidayPage enterTypes(WebDriver driver,String Types) {
			BrowserActions.type(driver, inpTypes,Types, "Types");
			return this;
		}
		public AddHolidayPage enterDate(WebDriver driver,String Date) {
			BrowserActions.type(driver, inpDate,Date, "Date");
			return this;
		}
		public AddHolidayPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public AddHolidayPage enterLanguage(WebDriver driver,String Language) {
			BrowserActions.type(driver, inpLanguage,Language, "Language");
			return this;
		}
		public AddHolidayPage enterDependentonRender_7(WebDriver driver,String DependentonRender_7) {
			BrowserActions.type(driver, inpDependentonRender_7,DependentonRender_7, "DependentonRender_7");
			return this;
		}
		public AddHolidayPage enterDependentonRender_8(WebDriver driver,String DependentonRender_8) {
			BrowserActions.type(driver, inpDependentonRender_8,DependentonRender_8, "DependentonRender_8");
			return this;
		}
		public AddHolidayPage enterDependentonRender_4(WebDriver driver,String DependentonRender_4) {
			BrowserActions.type(driver, inpDependentonRender_4,DependentonRender_4, "DependentonRender_4");
			return this;
		}
		public AddHolidayPage enterHoliday_10(WebDriver driver,String Holiday_10) {
			BrowserActions.type(driver, inpHoliday_10,Holiday_10, "Holiday_10");
			return this;
		}
		public AddHolidayPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public AddHolidayPage clickAdd_1(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_1,"Add_1");
			return this;
		}
		public AddHolidayPage selectZoneType(WebDriver driver,String ZoneType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpZoneType,ZoneType,"ZoneType");
			return this;
		}
		public AddHolidayPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public AddHolidayPage enterLanguage_9(WebDriver driver,String Language_9) {
			BrowserActions.type(driver, inpLanguage_9,Language_9, "Language_9");
			return this;
		}
		public AddHolidayPage enterDependentonRender_11(WebDriver driver,String DependentonRender_11) {
			BrowserActions.type(driver, inpDependentonRender_11,DependentonRender_11, "DependentonRender_11");
			return this;
		}
		public AddHolidayPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public AddHolidayPage enterDependentonRender_12(WebDriver driver,String DependentonRender_12) {
			BrowserActions.type(driver, inpDependentonRender_12,DependentonRender_12, "DependentonRender_12");
			return this;
		}
		public AddHolidayPage enterLanguage_5(WebDriver driver,String Language_5) {
			BrowserActions.type(driver, inpLanguage_5,Language_5, "Language_5");
			return this;
		}
		public AddHolidayPage enterHoliday(WebDriver driver,String Holiday) {
			BrowserActions.type(driver, inpHoliday,Holiday, "Holiday");
			return this;
		}
		public AddHolidayPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public AddHolidayPage clickRemove_2(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_2,"Remove_2");
			return this;
		}
		public AddHolidayPage enterDependentonRender(WebDriver driver,String DependentonRender) {
			BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
			return this;
		}

		public void verifyHolidayNameIsUpdated(WebDriver driver,String oldName) {
			BrowserActions.waitForElementToDisplay(driver, inpHoliday);
			String updatedName = inpHoliday.getAttribute("value");
			if (!updatedName.equals(oldName)) {
				Log.message("Holiday name is updated");
			}
			else{
				Log.message("Holiday name not updated");
			}
		}

		public AddHolidayPage enterNameEdgePolicyholderEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpNameEdgePolicyholderEnglish,localization,1, "Name Edge Policyholder English");
			return this;
		}
		public AddHolidayPage enterNameEdgeEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpNameEdgeEnglish,localization, 1,"Name Edge English");
			return this;
		}

		public AddHolidayPage verifyUpdateButtonIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnUpdate,"Update Button");
			return this;
		}

		public AddHolidayPage verifyCancelButtonIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnCancel,"Cancel Button");
			return this;
		}
		public String getDate(WebDriver driver) {
			String hoildayDate = BrowserActions.getText(driver, inpDate, "Date");
			return hoildayDate;
		}


	}

}
