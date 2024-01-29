package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
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

public class SubmissionDeclinedPage extends LoadableComponent<SubmissionDeclinedPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#DeclineReasonPopup-RejectScreen-RejectReasonDV-RejectReasonText", AI = false)
	public WebElement inpReasonTextforletter;

	@IFindBy(how = How.CSS, using = "#DeclineReasonPopup-__crumb__", AI = false)
	public WebElement btnReturntoPolicyInfo;

	@IFindBy(how = How.CSS, using = "select[name='DeclineReasonPopup-RejectScreen-RejectReasonDV-RejectReason']", AI = false)
	public WebElement drpReasonCode;

	@IFindBy(how = How.CSS, using = "#DeclineReasonPopup-RejectScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#DeclineReasonPopup-RejectScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#DeclineReasonPopup-RejectScreen-Update>div[role='button']", AI = false)
	public WebElement btnDecline;

	public SubmissionDeclinedPage(){
	}

	public SubmissionDeclinedPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
public SubmissionDeclinedPage enterReasonTextforletter(WebDriver driver,String ReasonTextforletter) {
		            BrowserActions.type(driver, inpReasonTextforletter,ReasonTextforletter, "ReasonTextforletter");
			        return this;
           }
public SubmissionDeclinedPage clickReturntoPolicyInfo(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoPolicyInfo,"ReturntoPolicyInfo");
				    return this;
			}
public SubmissionDeclinedPage selectReasonCode(WebDriver driver,String ReasonCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReasonCode,ReasonCode,"ReasonCode");
				    return this;
			}
public SubmissionDeclinedPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public SubmissionDeclinedPage clickDecline(WebDriver driver)  {
					BrowserActions.click(driver, btnDecline,"Decline");
				    return this;
			}
}
