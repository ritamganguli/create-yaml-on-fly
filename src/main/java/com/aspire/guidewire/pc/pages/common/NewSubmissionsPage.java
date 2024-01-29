package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class NewSubmissionsPage extends LoadableComponent<NewSubmissionsPage> {
	
	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name$='Account']", AI = false)
	public WebElement fldaccount;

	@IFindBy(how = How.CSS, using = "input[name$='Producer']", AI = false)
	public WebElement fldorganization;

	@IFindBy(how = How.CSS, using = "select[name$='ProducerCode']", AI = false)
	public WebElement drpProducerCode;

	@IFindBy(how = How.CSS, using = "input[aria-label='Single']", AI = false)
	public WebElement rdbSingle;

	@IFindBy(how = How.CSS, using = "input[aria-label='Multiple']", AI = false)
	public WebElement rdbMultiple;

	@IFindBy(how = How.CSS, using = "select[name$='QuoteType']", AI = false)
	public WebElement drpQuoteType;

	@IFindBy(how = How.CSS, using = "select[name$='DefaultBaseState']", AI = false)
	public WebElement drpDefaultBaseState;

	@IFindBy(how = How.CSS, using = "input[name$='DefaultPPEffDate']", AI = false)
	public WebElement drpDefaultEffectiveDate;

	@IFindBy(how = How.CSS, using = "//div[text()='Personal Auto']/ancestor::td[1]/preceding-sibling::td//descendant::div[text()='Select'] ", AI = false)
	public WebElement btnSelectBasedProductName;//click on select based on personal Auto

	@IFindBy(how = How.CSS, using = "div[id*='VisualizedTab']", AI = false)
	public WebElement tabVisualizedProducts;

	@IFindBy(how = How.CSS, using = "div[id$='AddProductButton']", AI = false)
	public WebElement btnAddProduct;

	@IFindBy(how = How.CSS, using = "div[id$='NewProduct']", AI = false)
	public WebElement lnkNewProduct;

	@IFindBy(how = How.CSS, using = "div[id$='FromTemplate']", AI = false)
	public WebElement lnkFromTemplate;

	@IFindBy(how = How.CSS, using = "div[id$='FromXmind']", AI = false)
	public WebElement lnkFromXmind;
	
	@IFindBy(how = How.XPATH, using = "(//div[contains(text(),'Compensation')]/preceding::td[1])", AI = false)
	public WebElement btnSelectWorkersCompensation;

	public NewSubmissionsPage() {}

	public NewSubmissionsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, fldorganization))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	/**
	 * click select button based on Product Name
	 * @author vignesh.ravi
	 * @param driver
	 */
	public void clickSelectBtn(WebDriver driver, String ProductName) {
		By productNameBy = By.xpath("(//div[contains(text(),'" + ProductName + "')]/preceding::td[1])[1]");
		BrowserActions.waitForElementToDisplay(driver, productNameBy, "Product Name");
		WebElement btnSelectPolicy = productNameBy.findElement(driver);
		BrowserActions.click(driver, btnSelectPolicy,"Select button");
	}
	
}
