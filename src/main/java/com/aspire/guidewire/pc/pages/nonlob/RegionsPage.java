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

public class RegionsPage extends LoadableComponent<RegionsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-7-Zones']", AI = false)
	private WebElement inpAreasCovered_14;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-4-Zones']", AI = false)
	private WebElement inpAreasCovered_8;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-6-Zones']", AI = false)
	private WebElement inpAreasCovered_12;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-3-Zones']", AI = false)
	private WebElement inpAreasCovered_6;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-5-Zones']", AI = false)
	private WebElement inpAreasCovered_10;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-2-Zones']", AI = false)
	private WebElement inpAreasCovered_4;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-9-Name']", AI = false)
	private WebElement inpName_17;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-8-Name']", AI = false)
	private WebElement inpName_15;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-7-Name']", AI = false)
	private WebElement inpName_13;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-9-Zones']", AI = false)
	private WebElement inpAreasCovered_18;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-6-Name']", AI = false)
	private WebElement inpName_11;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-8-Zones']", AI = false)
	private WebElement inpAreasCovered_16;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchDV-Code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-10-Name']", AI = false)
	private WebElement inpName_19;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-1-Zones']", AI = false)
	private WebElement inpAreasCovered_2;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchDV-Name']", AI = false)
	private WebElement inpRegionName;

	@IFindBy(how = How.CSS, using = "#RegionsPage-RegionsScreen-RegionSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "select[name='RegionsPage-RegionsScreen-RegionSearchDV-zoneType']", AI = false)
	private WebElement drpZoneType;

	@IFindBy(how = How.CSS, using = "#RegionsPage-RegionsScreen-RegionSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-0-Zones']", AI = false)
	private WebElement inpAreasCovered;

	@IFindBy(how = How.CSS, using = "#RegionsPage-RegionsScreen-RegionSearchResultsLV_tb-Regions_DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#RegionsPage-RegionsScreen-RegionSearchResultsLV_tb-Regions_AddRegionButton>div[role='button']", AI = false)
	private WebElement btnAddRegion;

	@IFindBy(how = How.CSS, using = "#RegionsPage-RegionsScreen-SearchResultsTitleBar", AI = false)
	private WebElement lblSearchResultsTitleBar;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-5-Name']", AI = false)
	private WebElement inpName_9;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-12-Zones']", AI = false)
	private WebElement inpAreasCovered_24;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-11-Zones']", AI = false)
	private WebElement inpAreasCovered_22;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-10-Zones']", AI = false)
	private WebElement inpAreasCovered_20;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-14-Name']", AI = false)
	private WebElement inpName_27;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-13-Name']", AI = false)
	private WebElement inpName_25;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-12-Name']", AI = false)
	private WebElement inpName_23;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-14-Zones']", AI = false)
	private WebElement inpAreasCovered_28;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-11-Name']", AI = false)
	private WebElement inpName_21;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-13-Zones']", AI = false)
	private WebElement inpAreasCovered_26;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-1-Name']", AI = false)
	private WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-2-Name']", AI = false)
	private WebElement inpName_3;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-3-Name']", AI = false)
	private WebElement inpName_5;

	@IFindBy(how = How.CSS, using = "input[name='RegionsPage-RegionsScreen-RegionSearchResultsLV-4-Name']", AI = false)
	private WebElement inpName_7;
	
	@IFindBy(how = How.CSS, using = "td[id$='Name_Cell']", AI = false)
	private WebElement lblRegionsName;
	
	@IFindBy(how = How.CSS, using = "td[id$='Name_Cell']", AI = false)
	private WebElement lblTtlBar;
	
	public	String regionNames="(//td[contains(@id,'Name_Cell')])";

	public RegionsPage(){
	}

	public RegionsPage(WebDriver driver){
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
}public RegionsPage enterAreasCovered_14(WebDriver driver,String AreasCovered_14) {
		            BrowserActions.type(driver, inpAreasCovered_14,AreasCovered_14, "AreasCovered_14");
			        return this;
           }
public RegionsPage enterAreasCovered_8(WebDriver driver,String AreasCovered_8) {
		            BrowserActions.type(driver, inpAreasCovered_8,AreasCovered_8, "AreasCovered_8");
			        return this;
           }
public RegionsPage enterAreasCovered_12(WebDriver driver,String AreasCovered_12) {
		            BrowserActions.type(driver, inpAreasCovered_12,AreasCovered_12, "AreasCovered_12");
			        return this;
           }
public RegionsPage enterAreasCovered_6(WebDriver driver,String AreasCovered_6) {
		            BrowserActions.type(driver, inpAreasCovered_6,AreasCovered_6, "AreasCovered_6");
			        return this;
           }
public RegionsPage enterAreasCovered_10(WebDriver driver,String AreasCovered_10) {
		            BrowserActions.type(driver, inpAreasCovered_10,AreasCovered_10, "AreasCovered_10");
			        return this;
           }
public RegionsPage enterAreasCovered_4(WebDriver driver,String AreasCovered_4) {
		            BrowserActions.type(driver, inpAreasCovered_4,AreasCovered_4, "AreasCovered_4");
			        return this;
           }
public RegionsPage enterName_17(WebDriver driver,String Name_17) {
		            BrowserActions.type(driver, inpName_17,Name_17, "Name_17");
			        return this;
           }
public RegionsPage enterName_15(WebDriver driver,String Name_15) {
		            BrowserActions.type(driver, inpName_15,Name_15, "Name_15");
			        return this;
           }
public RegionsPage enterName_13(WebDriver driver,String Name_13) {
		            BrowserActions.type(driver, inpName_13,Name_13, "Name_13");
			        return this;
           }
public RegionsPage enterAreasCovered_18(WebDriver driver,String AreasCovered_18) {
		            BrowserActions.type(driver, inpAreasCovered_18,AreasCovered_18, "AreasCovered_18");
			        return this;
           }
public RegionsPage enterName_11(WebDriver driver,String Name_11) {
		            BrowserActions.type(driver, inpName_11,Name_11, "Name_11");
			        return this;
           }
public RegionsPage enterAreasCovered_16(WebDriver driver,String AreasCovered_16) {
		            BrowserActions.type(driver, inpAreasCovered_16,AreasCovered_16, "AreasCovered_16");
			        return this;
           }
public RegionsPage enterCode(WebDriver driver,String Code) {
		            BrowserActions.type(driver, inpCode,Code, "Code");
			        return this;
           }
public RegionsPage enterName_19(WebDriver driver,String Name_19) {
		            BrowserActions.type(driver, inpName_19,Name_19, "Name_19");
			        return this;
           }
public RegionsPage enterAreasCovered_2(WebDriver driver,String AreasCovered_2) {
		            BrowserActions.type(driver, inpAreasCovered_2,AreasCovered_2, "AreasCovered_2");
			        return this;
           }
public RegionsPage enterRegionName(WebDriver driver,String RegionName) {
		            BrowserActions.type(driver, inpRegionName,RegionName, "RegionName");
			        return this;
           }
public RegionsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,true,"Search");
				    return this;
			}
public RegionsPage selectZoneType(WebDriver driver,String ZoneType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpZoneType,ZoneType,"ZoneType");
				    return this;
			}
public RegionsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,true,"Reset");
				    return this;
			}
public RegionsPage enterAreasCovered(WebDriver driver,String AreasCovered) {
		            BrowserActions.type(driver, inpAreasCovered,AreasCovered, "AreasCovered");
			        return this;
           }
public RegionsPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public RegionsPage clickAddRegion(WebDriver driver)  {
					BrowserActions.click(driver, btnAddRegion,"AddRegion");
				    return this;
			}
public RegionsPage enterName_9(WebDriver driver,String Name_9) {
		            BrowserActions.type(driver, inpName_9,Name_9, "Name_9");
			        return this;
           }
public RegionsPage enterAreasCovered_24(WebDriver driver,String AreasCovered_24) {
		            BrowserActions.type(driver, inpAreasCovered_24,AreasCovered_24, "AreasCovered_24");
			        return this;
           }
public RegionsPage enterAreasCovered_22(WebDriver driver,String AreasCovered_22) {
		            BrowserActions.type(driver, inpAreasCovered_22,AreasCovered_22, "AreasCovered_22");
			        return this;
           }
public RegionsPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public RegionsPage enterAreasCovered_20(WebDriver driver,String AreasCovered_20) {
		            BrowserActions.type(driver, inpAreasCovered_20,AreasCovered_20, "AreasCovered_20");
			        return this;
           }
public RegionsPage enterName_27(WebDriver driver,String Name_27) {
		            BrowserActions.type(driver, inpName_27,Name_27, "Name_27");
			        return this;
           }
public RegionsPage enterName_25(WebDriver driver,String Name_25) {
		            BrowserActions.type(driver, inpName_25,Name_25, "Name_25");
			        return this;
           }
public RegionsPage enterName_23(WebDriver driver,String Name_23) {
		            BrowserActions.type(driver, inpName_23,Name_23, "Name_23");
			        return this;
           }
public RegionsPage enterAreasCovered_28(WebDriver driver,String AreasCovered_28) {
		            BrowserActions.type(driver, inpAreasCovered_28,AreasCovered_28, "AreasCovered_28");
			        return this;
           }
public RegionsPage enterName_21(WebDriver driver,String Name_21) {
		            BrowserActions.type(driver, inpName_21,Name_21, "Name_21");
			        return this;
           }
public RegionsPage enterAreasCovered_26(WebDriver driver,String AreasCovered_26) {
		            BrowserActions.type(driver, inpAreasCovered_26,AreasCovered_26, "AreasCovered_26");
			        return this;
           }
public RegionsPage enterName_1(WebDriver driver,String Name_1) {
		            BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
			        return this;
           }
public RegionsPage enterName_3(WebDriver driver,String Name_3) {
		            BrowserActions.type(driver, inpName_3,Name_3, "Name_3");
			        return this;
           }
public RegionsPage enterName_5(WebDriver driver,String Name_5) {
		            BrowserActions.type(driver, inpName_5,Name_5, "Name_5");
			        return this;
           }
public RegionsPage enterName_7(WebDriver driver,String Name_7) {
		            BrowserActions.type(driver, inpName_7,Name_7, "Name_7");
			        return this;
           }

/**
 * Verify selected region 
 * @param driver , addedRegion
 * @return
 */

public void verifySelectedRegion(WebDriver driver, String addedRegion){
	List<WebElement> regionList = driver.findElements(By.xpath(regionNames));
	for (int i = 0; i < regionList.size(); i++) {
		WebElement regionsName = regionList.get(i);
		String regionText = regionsName.getText();
		if (regionText.startsWith(addedRegion)) {
			Log.message("Search Result verified");
		}else {
			Log.fail("Searched Results not verified");
		}
	}
	
}

/**
 * Verify field is empty
 * @param driver 
 * @return
 */
public RegionsPage verifyfieldIsEmpty(WebDriver driver) {
	Log.assertThat(inpRegionName.getAttribute("value").isEmpty(), "Text field is cleared", "Text field is not cleared");
    return this;
}

/**
 * Verify Search region is display
 * @param driver 
 * @return
 */
public RegionsPage verifSearchRegionIsDisplayed(WebDriver driver) {
	By regionBy = By.cssSelector("td[id$='Name_Cell']");
	int size = BrowserActions.getWebElementSize(driver, regionBy, "Region", 0.5);
	for(int i = 1; i<=size; i++) {
		BrowserActions.verifyElementDisplayed(driver, lblRegionsName, "Search region are displayed");
	}
	return this;
}


public class AddRegionPage extends LoadableComponent<AddRegionPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public List<Object> pageFactoryKey = new ArrayList<Object>();
	public List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-Zones textarea", AI = false)
	public WebElement inpAreasCovered;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
	public WebElement inpColumn_6;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
	public WebElement inpColumn_4;

	@IFindBy(how = How.CSS, using = "select[name='NewRegion-RegionDetailScreen-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "select[name='NewRegion-RegionDetailScreen-RegionDetailDV-state']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
	public WebElement inpLanguageHeading;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
	public WebElement inpColumn;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
	public WebElement inpLanguage_5;

	@IFindBy(how = How.CSS, using = "select[name='NewRegion-RegionDetailScreen-RegionDetailDV-zoneType']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-RegionDetailDV-RegionZonesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='NewRegion-RegionDetailScreen-RegionDetailDV-ZoneInput']", AI = false)
	public WebElement drpAreasCovered;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_2;

	@IFindBy(how = How.CSS, using = "#NewRegion-RegionDetailScreen-RegionDetailDV-RegionZonesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
	public WebElement inpLanguage_3;

	@IFindBy(how = How.CSS, using = "input[name='NewRegion-RegionDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
	public WebElement inpFieldHeading;

	public AddRegionPage(){
	}

	public AddRegionPage(WebDriver driver) throws Exception{
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
	}public AddRegionPage enterAreasCovered(WebDriver driver,String AreasCovered) {
		BrowserActions.type(driver, inpAreasCovered,AreasCovered, "AreasCovered");
		return this;
	}
	public AddRegionPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public AddRegionPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public AddRegionPage enterColumn_6(WebDriver driver,String Column_6) {
		BrowserActions.type(driver, inpColumn_6,Column_6, "Column_6");
		return this;
	}
	public AddRegionPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public AddRegionPage enterColumn_4(WebDriver driver,String Column_4) {
		BrowserActions.type(driver, inpColumn_4,Column_4, "Column_4");
		return this;
	}
	public AddRegionPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public AddRegionPage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public AddRegionPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public AddRegionPage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
		BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
		return this;
	}
	public AddRegionPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public AddRegionPage enterColumn(WebDriver driver,String Column) {
		BrowserActions.type(driver, inpColumn,Column, "Column");
		return this;
	}
	public AddRegionPage enterLanguage_5(WebDriver driver,String Language_5) {
		BrowserActions.type(driver, inpLanguage_5,Language_5, "Language_5");
		return this;
	}
	public AddRegionPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public AddRegionPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public AddRegionPage selectAreasCovered(WebDriver driver,String AreasCovered)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAreasCovered,AreasCovered,"AreasCovered");
		return this;
	}
	public AddRegionPage clickRemove_2(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_2,"Remove_2");
		return this;
	}
	public AddRegionPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public AddRegionPage enterLanguage(WebDriver driver,String Language) {
		BrowserActions.type(driver, inpLanguage,Language, "Language");
		return this;
	}
	public AddRegionPage enterLanguage_3(WebDriver driver,String Language_3) {
		BrowserActions.type(driver, inpLanguage_3,Language_3, "Language_3");
		return this;
	}
	public AddRegionPage enterFieldHeading(WebDriver driver,String FieldHeading) {
		BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
		return this;
	}
}
}


