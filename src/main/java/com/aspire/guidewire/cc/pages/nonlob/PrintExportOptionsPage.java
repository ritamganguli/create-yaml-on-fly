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

public class PrintExportOptionsPage extends LoadableComponent<PrintExportOptionsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='PrintOptionPopup-PrintOptionPopupScreen-PrintOptionDV-Export']", AI = false)
	public WebElement inpExportasCSV;

	@IFindBy(how = How.CSS, using = "#PrintOptionPopup-PrintOptionPopupScreen-Done>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='PrintOptionPopup-PrintOptionPopupScreen-PrintOptionDV-CustomExport']", AI = false)
	public WebElement inpCustomExportasCSV;

	@IFindBy(how = How.CSS, using = "#PrintOptionPopup-PrintOptionPopupScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#PrintOptionPopup-PrintOptionPopupScreen-Ok>div[role='button']", AI = false)
	public WebElement btnOK;

	@IFindBy(how = How.CSS, using = "select[name='PrintOptionPopup-PrintOptionPopupScreen-PrintOptionDV-charsetRI']", AI = false)
	public WebElement drpCharacterEncoding;

	@IFindBy(how = How.CSS, using = "#PrintOptionPopup-__crumb__", AI = false)
	public WebElement btnReturntoClaims;

	@IFindBy(how = How.CSS, using = "input[name='PrintOptionPopup-PrintOptionPopupScreen-PrintOptionDV-DoPrint']", AI = false)
	public WebElement inpPrintasPDF;
	
	@IFindBy(how = How.CSS, using = "div[id$='PrintChoice_Choice']", AI = false)
	public WebElement rbtnPrintasPDF;
	
	@IFindBy(how = How.CSS, using = "div[id$='ExportChoice_Choice']", AI = false)
	public WebElement rbtnExportasPDF;

	public PrintExportOptionsPage(){
	}

	public PrintExportOptionsPage(WebDriver driver) {
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
}public PrintExportOptionsPage enterExportasCSV(WebDriver driver,String ExportasCSV) {
		            BrowserActions.type(driver, inpExportasCSV,ExportasCSV, "ExportasCSV");
			        return this;
           }
public PrintExportOptionsPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public PrintExportOptionsPage enterCustomExportasCSV(WebDriver driver,String CustomExportasCSV) {
		            BrowserActions.type(driver, inpCustomExportasCSV,CustomExportasCSV, "CustomExportasCSV");
			        return this;
           }
public PrintExportOptionsPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,true,1,"OK");
				    return this;
			}
public PrintExportOptionsPage selectCharacterEncoding(WebDriver driver,String CharacterEncoding)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCharacterEncoding,CharacterEncoding,"CharacterEncoding");
				    return this;
			}
public PrintExportOptionsPage clickReturntoClaims(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoClaims,"ReturntoClaims");
				    return this;
			}
public PrintExportOptionsPage enterPrintasPDF(WebDriver driver,String PrintasPDF) {
		            BrowserActions.type(driver, inpPrintasPDF,PrintasPDF, "PrintasPDF");
			        return this;
           }
public PrintExportOptionsPage clickPrintAsPdf(WebDriver driver) {
	BrowserActions.click(driver, rbtnPrintasPDF, "PrintasPDF");
	return this;
}
public PrintExportOptionsPage clickExportAsPdf(WebDriver driver) {
	BrowserActions.click(driver, rbtnExportasPDF, "Export as pdf");
	return this;
}
}
