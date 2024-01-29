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

public class DocumentPage extends LoadableComponent<DocumentPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	//public Exposures exposuresTable;

	@IFindBy(how = How.CSS, using = "#ClaimDocuments-Claim_DocumentsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Email Sent']", AI = false)
	private WebElement lblEmailsent;

	public DocumentPage(){
	}

	public DocumentPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	//	exposuresTable = new Exposures();
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
}
	
	public DocumentPage verifyDocumentCreated(WebDriver driver)  {
	   By tagName = By.tagName("tr");
	   int size = BrowserActions.getWebElementSize(driver, tagName, "Documents size",0.5);
		 	if ( size > 1) {
		 		Log.event("Document details verified");
			}
	    return this;
	}
	public DocumentPage verifyEmailIsSent(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblEmailsent, "Email is sent successfully");
		return this;
	}


}
