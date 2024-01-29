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

public class HistoryPage extends LoadableComponent<HistoryPage> {
	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFile_History-ttlBar']", AI = false)
	public WebElement ttlHistory;

	public HistoryPage() {

	}

	public HistoryPage(WebDriver driver) {
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlHistory))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}

	// isLoaded


	/**
	 * clicking new transaction choose Cancel Policy transaction
	 * @author surendar.baskaran
	 * @param driver
	 * @return HistoryPage 
	 */

	public HistoryPage verifyAnswerChangedTextValue(WebDriver driver,String expectedOriginalValue,String expectedNewValue) {
		By originalValueTextBy= By.xpath("//div[text()='Answer changed']/ancestor::td//following-sibling::td[contains(@id,'OriginalValue_Cell')]");//remoteDriver
		BrowserActions.waitForElementToDisplay(driver, originalValueTextBy, "Original Text value");
		WebElement originalValue = originalValueTextBy.findElement(driver);
		String originaValueText=BrowserActions.getText(driver, originalValue, "Original Value");
		Log.softAssertThat(originaValueText.equals(expectedOriginalValue), "Original value "+expectedOriginalValue+" is displayed",  "Original value "+expectedOriginalValue+" is not  displayed");

		By newValueTextBy=By.xpath("//div[text()='Answer changed']/ancestor::td//following-sibling::td[contains(@id,'NewValue_Cell')]");//remoteDriver
		BrowserActions.waitForElementToDisplay(driver, newValueTextBy, "New Text value");
		WebElement newValue = newValueTextBy.findElement(driver);
		String newValueText=BrowserActions.getText(driver, newValue, "New Value");
		Log.softAssertThat(newValueText.equals(expectedNewValue), "New value "+expectedNewValue+" is displayed","New value "+expectedNewValue+" is not displayed");
		return this;
	}

}

