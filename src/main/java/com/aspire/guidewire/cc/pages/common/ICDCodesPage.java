package com.aspire.guidewire.cc.pages.common;
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

public class ICDCodesPage extends LoadableComponent<ICDCodesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#ICD-Search_Button>div[role='button']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name$='Code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "#ICD-ICDPanel-Search_Results", AI = false)
	private WebElement lblSearch_Results;

	@IFindBy(how = How.CSS, using = "#ICD-Add_ICD_Code_Button>div[role='button']", AI = false)
	private WebElement btnAddnewcode;

	@IFindBy(how = How.CSS, using = "select[name='ICD-Find_Body_System']", AI = false)
	private WebElement drpBodySystem;

	@IFindBy(how = How.CSS, using = "div[id$='ICDFullCode_button']", AI = false)
	private WebElement lnkCode;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	private WebElement btnEdit;

	public String bodysystems="td[id$='-Body_System_Cell']";
	public String codes="div[id$='ICDFullCode_button']";

	public ICDCodesPage(){
	}

	public ICDCodesPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpBodySystem))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ICDCodesPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,true,"Search");
		return this;
	}
	public ICDCodesPage enterCode(WebDriver driver,String Code) {
		BrowserActions.type(driver, inpCode,Code, "Code");
		return this;
	}
	public NewICDCodePage clickAddnewcode(WebDriver driver)  {
		BrowserActions.click(driver, btnAddnewcode,"Addnewcode");
		return new NewICDCodePage(driver).get();
	}
	public ICDCodesPage selectBodySystem(WebDriver driver,String BodySystem)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBodySystem,BodySystem,"BodySystem");
		return this;
	}
	public ICDCodesPage clickOnCode(WebDriver driver)  {
		BrowserActions.click(driver, lnkCode,"BodySystem");
		return this;
	}
	public ICDCodesPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public ICDCodesPage verifyCodeIsUpdated(WebDriver driver, String code)  {
		By codesBy = By.cssSelector(codes);
		List<WebElement> codes = BrowserActions.getWebElements(driver, codesBy, "code",1);
		for(WebElement element:codes) {
			String text = element.getText();
			if(text.equals(code)) {
				break;
			}
		}
		return this;
	}
	public ICDCodesPage verifyCodeIsNotUpdated(WebDriver driver, String code)  {
		By codesBy = By.cssSelector(codes);
		List<WebElement> codes = BrowserActions.getWebElements(driver, codesBy, "code",1);
		for(WebElement element:codes) {
			String text = element.getText();
			if(text.equals(code)) {
				Log.fail("code is updated after cancelling the edit");
			}
		}
		return this;
	}
	public void verifySearchResults(WebDriver driver, String name) {
		By bodySystemsBy = By.cssSelector(bodysystems);
		List<WebElement> bodySystemsList = BrowserActions.getWebElements(driver, bodySystemsBy, "code",1);
		for(WebElement element:bodySystemsList) {
			String text = element.getText();
			if(!text.equals(name)) {
				Log.fail("Search results not matches");
			
			}
		}
	
		Log.message("Search results displayed correctly");
	}
}
