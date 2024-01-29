package com.aspire.guidewire.bc.pages;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.PageFactory;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.IFindBy;

public class StartDeliquencyPage extends LoadableComponent<StartDeliquencyPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#StartDelinquencyProcessPopup-StartDelinquencyProcessScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#StartDelinquencyProcessPopup-StartDelinquencyProcessScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='StartDelinquencyProcessPopup-StartDelinquencyProcessScreen-Reason']", AI = false)
	public WebElement drpReason;

	@IFindBy(how = How.CSS, using = "#StartDelinquencyProcessPopup-StartDelinquencyProcessScreen-Execute>div[role='button']", AI = false)
	public WebElement btnExecute;

	@IFindBy(how = How.CSS, using = "#StartDelinquencyProcessPopup-__crumb__", AI = false)
	public WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "div[id='StartDelinquencyProcessPopup-StartDelinquencyProcessScreen-TargetsLV-1-_Checkbox']", AI = false)
	public WebElement chkPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public List<WebElement> lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	public StartDeliquencyPage(){
	}

	public StartDeliquencyPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}
	
	public StartDeliquencyPage(WebDriver driver, int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpReason))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);

	}

	public StartDeliquencyPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public StartDeliquencyPage selectReason(WebDriver driver,String Reason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,"Reason");
		return this;
	}
	public PolicySummaryPage clickExecute(WebDriver driver)  {
		BrowserActions.click(driver, btnExecute,"Execute");
		return new PolicySummaryPage(driver).get();
	}
	public StartDeliquencyPage clickReturntoAccountSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
		return this;
	}
	public StartDeliquencyPage selectPolicy(WebDriver driver)  {
		BrowserActions.click(driver, chkPolicy,"Select Policy");
		return this;
	}
	public StartDeliquencyPage selectSearchedPolicy(WebDriver driver , String policyNo)  {
		if(lblLastPageNo.size()==0) {
			By policyBy = By.xpath("//div[contains(@id,'DelinquencyTarget')]//div[text()='"+policyNo+"-1']//ancestor::td//preceding-sibling::td//div[contains(@id,'Checkbox')]");
			BrowserActions.waitForElementToDisplay(driver, policyBy, policyNo);
			WebElement chkPolicy = policyBy.findElement(driver);
			BrowserActions.click(driver, chkPolicy, "Policy No");	
		}
		else{
			String pageNo=lblLastPageNo.get(0).getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			for(int i=1;i<=no;i++) {
				By policyBy = By.xpath("//div[contains(@id,'DelinquencyTarget')]//div[text()='"+policyNo+"-1']//ancestor::td//preceding-sibling::td//div[contains(@id,'Checkbox')]");
				List<WebElement> policy = policyBy.findElements(driver);
				if (policy.size() > 0) {
					WebElement chkPolicy = policyBy.findElement(driver);
					BrowserActions.click(driver, chkPolicy,"Policy No");
					break;
				}
				else {
					BrowserActions.click(driver, btnNextArrow,true,"Next Button");
				}
			}
		}
		return this;
	}
}

