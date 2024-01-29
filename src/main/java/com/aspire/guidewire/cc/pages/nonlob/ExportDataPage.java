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

public class ExportDataPage extends LoadableComponent<ExportDataPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-12-DataSet']", AI = false)
	private WebElement inpDatatoExport_12;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-13-DataSet']", AI = false)
	private WebElement inpDatatoExport_13;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-14-DataSet']", AI = false)
	private WebElement inpDatatoExport_14;

	@IFindBy(how = How.CSS, using = "#ExportData-ExportDataScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-15-DataSet']", AI = false)
	private WebElement inpDatatoExport_15;

	@IFindBy(how = How.CSS, using = "#ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV_tb-ExportButton>div[role='button']", AI = false)
	private WebElement btnExport;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-10-DataSet']", AI = false)
	private WebElement inpDatatoExport_10;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-11-DataSet']", AI = false)
	private WebElement inpDatatoExport_11;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-0-DataSet']", AI = false)
	private WebElement inpDatatoExport;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-20-DataSet']", AI = false)
	private WebElement inpDatatoExport_20;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-9-DataSet']", AI = false)
	private WebElement inpDatatoExport_9;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-7-DataSet']", AI = false)
	private WebElement inpDatatoExport_7;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-8-DataSet']", AI = false)
	private WebElement inpDatatoExport_8;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-5-DataSet']", AI = false)
	private WebElement inpDatatoExport_5;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-6-DataSet']", AI = false)
	private WebElement inpDatatoExport_6;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-3-DataSet']", AI = false)
	private WebElement inpDatatoExport_3;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-4-DataSet']", AI = false)
	private WebElement inpDatatoExport_4;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-1-DataSet']", AI = false)
	private WebElement inpDatatoExport_1;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-2-DataSet']", AI = false)
	private WebElement inpDatatoExport_2;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-16-DataSet']", AI = false)
	private WebElement inpDatatoExport_16;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-17-DataSet']", AI = false)
	private WebElement inpDatatoExport_17;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-18-DataSet']", AI = false)
	private WebElement inpDatatoExport_18;

	@IFindBy(how = How.CSS, using = "input[name='ExportData-ExportDataScreen-ExportDataDV-ExportDataSetLV-19-DataSet']", AI = false)
	private WebElement inpDatatoExport_19;

	@IFindBy(how = How.CSS, using = "#ExportData-ExportDataScreen-SecurityDictionaryDV-DownloadButton>div[role='button']", AI = false)
	private WebElement btnDownloadButton;

	@IFindBy(how = How.CSS, using = "input[value='XML']", AI = false)
	private WebElement rdoXML;


	public ExportDataPage(){
	}

	public ExportDataPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnDownloadButton))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ExportDataPage enterDatatoExport_12(WebDriver driver,String DatatoExport_12) {
		BrowserActions.type(driver, inpDatatoExport_12,DatatoExport_12, "DatatoExport_12");
		return this;
	}
	public ExportDataPage enterDatatoExport_13(WebDriver driver,String DatatoExport_13) {
		BrowserActions.type(driver, inpDatatoExport_13,DatatoExport_13, "DatatoExport_13");
		return this;
	}
	public ExportDataPage enterDatatoExport_14(WebDriver driver,String DatatoExport_14) {
		BrowserActions.type(driver, inpDatatoExport_14,DatatoExport_14, "DatatoExport_14");
		return this;
	}
	public ExportDataPage enterDatatoExport_15(WebDriver driver,String DatatoExport_15) {
		BrowserActions.type(driver, inpDatatoExport_15,DatatoExport_15, "DatatoExport_15");
		return this;
	}
	public ExportDataPage clickExport(WebDriver driver)  {
		BrowserActions.click(driver, btnExport,"Export");
		return this;
	}
	public ExportDataPage enterDatatoExport_10(WebDriver driver,String DatatoExport_10) {
		BrowserActions.type(driver, inpDatatoExport_10,DatatoExport_10, "DatatoExport_10");
		return this;
	}
	public ExportDataPage enterDatatoExport_11(WebDriver driver,String DatatoExport_11) {
		BrowserActions.type(driver, inpDatatoExport_11,DatatoExport_11, "DatatoExport_11");
		return this;
	}
	public ExportDataPage enterDatatoExport(WebDriver driver,String DatatoExport) {
		BrowserActions.type(driver, inpDatatoExport,DatatoExport, "DatatoExport");
		return this;
	}
	public ExportDataPage enterDatatoExport_20(WebDriver driver,String DatatoExport_20) {
		BrowserActions.type(driver, inpDatatoExport_20,DatatoExport_20, "DatatoExport_20");
		return this;
	}
	public ExportDataPage enterDatatoExport_9(WebDriver driver,String DatatoExport_9) {
		BrowserActions.type(driver, inpDatatoExport_9,DatatoExport_9, "DatatoExport_9");
		return this;
	}
	public ExportDataPage enterDatatoExport_7(WebDriver driver,String DatatoExport_7) {
		BrowserActions.type(driver, inpDatatoExport_7,DatatoExport_7, "DatatoExport_7");
		return this;
	}
	public ExportDataPage enterDatatoExport_8(WebDriver driver,String DatatoExport_8) {
		BrowserActions.type(driver, inpDatatoExport_8,DatatoExport_8, "DatatoExport_8");
		return this;
	}
	public ExportDataPage enterDatatoExport_5(WebDriver driver,String DatatoExport_5) {
		BrowserActions.type(driver, inpDatatoExport_5,DatatoExport_5, "DatatoExport_5");
		return this;
	}
	public ExportDataPage enterDatatoExport_6(WebDriver driver,String DatatoExport_6) {
		BrowserActions.type(driver, inpDatatoExport_6,DatatoExport_6, "DatatoExport_6");
		return this;
	}
	public ExportDataPage enterDatatoExport_3(WebDriver driver,String DatatoExport_3) {
		BrowserActions.type(driver, inpDatatoExport_3,DatatoExport_3, "DatatoExport_3");
		return this;
	}
	public ExportDataPage enterDatatoExport_4(WebDriver driver,String DatatoExport_4) {
		BrowserActions.type(driver, inpDatatoExport_4,DatatoExport_4, "DatatoExport_4");
		return this;
	}
	public ExportDataPage enterDatatoExport_1(WebDriver driver,String DatatoExport_1) {
		BrowserActions.type(driver, inpDatatoExport_1,DatatoExport_1, "DatatoExport_1");
		return this;
	}
	public ExportDataPage enterDatatoExport_2(WebDriver driver,String DatatoExport_2) {
		BrowserActions.type(driver, inpDatatoExport_2,DatatoExport_2, "DatatoExport_2");
		return this;
	}
	public ExportDataPage enterDatatoExport_16(WebDriver driver,String DatatoExport_16) {
		BrowserActions.type(driver, inpDatatoExport_16,DatatoExport_16, "DatatoExport_16");
		return this;
	}
	public ExportDataPage enterDatatoExport_17(WebDriver driver,String DatatoExport_17) {
		BrowserActions.type(driver, inpDatatoExport_17,DatatoExport_17, "DatatoExport_17");
		return this;
	}
	public ExportDataPage enterDatatoExport_18(WebDriver driver,String DatatoExport_18) {
		BrowserActions.type(driver, inpDatatoExport_18,DatatoExport_18, "DatatoExport_18");
		return this;
	}
	public ExportDataPage enterDatatoExport_19(WebDriver driver,String DatatoExport_19) {
		BrowserActions.type(driver, inpDatatoExport_19,DatatoExport_19, "DatatoExport_19");
		return this;
	}
	public ExportDataPage clickDownloadButton(WebDriver driver)  {
		BrowserActions.click(driver, btnDownloadButton,"DownloadButton");
		return this;
	}

	public ExportDataPage clickExportAdministrativeDataCheckBox(WebDriver driver,String name) {
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy,"name checkbox");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,1,"Name check box");
		return this;
	}

	public ExportDataPage clickXMLRadioButton(WebDriver driver)  {
		BrowserActions.click(driver, rdoXML,"XML radio button");
		return this;
	}


}
