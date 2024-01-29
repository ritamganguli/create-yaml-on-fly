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

public class BrowseGroupPage extends LoadableComponent<BrowseGroupPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#OrganizationGroupTreePopup-__crumb__", AI = false)
	private WebElement btnReturntoSearchClaims;

	@IFindBy(how = How.CSS, using = "#OrganizationGroupTreePopup-OrganizationGroupTreePopupScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;
	
	@IFindBy(how = How.CSS, using = "#OrganizationGroupTreePopup-OrganizationGroupTreePopupScreen-OrganizationGroupTreePopup-OrganizationGroupTreePopupPicker-0_label", AI = false)
	private WebElement btnAcmeInsurance;
	
	

	public BrowseGroupPage(){
	}

	public BrowseGroupPage(WebDriver driver) {
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
}public AdvanceSearchClaimsPage clickReturntoSearchClaims(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoSearchClaims,1,"ReturntoSearchClaims");
				    return new AdvanceSearchClaimsPage(driver).get();
			}
public BrowseGroupPage clickAcmeInsurance(WebDriver driver)  {
	BrowserActions.click(driver, btnAcmeInsurance,1," Acme Insurance");
    return this;
}
}
