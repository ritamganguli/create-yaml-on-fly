package com.aspire.guidewire.pc.pages.common;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
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

	@IFindBy(how = How.CSS, using = "#ClaimDocuments-Claim_DocumentsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Email Sent']", AI = false)
	private WebElement lblEmailsent;
	
	@IFindBy(how = How.CSS, using = "div[id$='-DownloadLink']", AI = false)
	private WebElement lblDownload;

	

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
		//WebElement table= driver.findElement(By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//tr"));
	    By documentBy = By.tagName("tr");
	    int size = BrowserActions.getWebElementSize(driver, documentBy, "Document created", 0.5);
		 	if ( size > 1) {
		 		Log.message("Document details verified");
			}
	    return this;
	}
	public DocumentPage verifyEmailIsSent(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblEmailsent, "Email is sent successfully and ");
		return this;
	}
	public DocumentPage clickDownload(WebDriver driver)  {
		BrowserActions.click(driver, lblDownload,true, "Download Icon");
		return this;
	}

	
	public void verifyDownloadedDocument(WebDriver driver,String fileName) throws InterruptedException {

		EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
		String env = configProperty.getProperty("runDesktop");

		if (env.equals("false")) {

			((JavascriptExecutor) driver).executeScript("lambda-file-exists=" + fileName + "html");
		}

		//For local download
		else {
			String downloadPath = "C:/Users/" + System.getProperty("user.name") + "/Downloads/";
			File dir = new File(downloadPath);
			File[] dirContents = dir.listFiles();

			for (int i = 0; i < 5; i++) {
				if (dirContents[i].getName().contains(fileName)) {
					// File has been found, it can now be deleted:
					Log.message("File Downloaded successfully in Local Downloads");
					boolean deleted = dirContents[i].delete();
					Log.assertThat(deleted, "File deleted successfully from Local Downloads", "Failed to delete the file from Local Downloads");
					break; 
				}
			}
		}
	}


}
