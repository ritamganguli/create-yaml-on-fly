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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

	public class MotorVehicleRecordsPage extends LoadableComponent<MotorVehicleRecordsPage>{
		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();
		
		@IFindBy(how = How.CSS, using = "div[id$='DriverMVRInfoPopup-ttlBar']", AI = false)
		public WebElement ttlMotorVehicle;
		
		@IFindBy(how = How.CSS, using = "div[id$='MVRReportButton']", AI = false)
		public WebElement btnMVRReportDetails;	
		
		@IFindBy(how = How.XPATH, using = "//div[text()='Return to Risk Analysis']", AI = false)
		public WebElement lnkReturnPage;


		
		public MotorVehicleRecordsPage() {}

		public MotorVehicleRecordsPage(WebDriver driver){
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlMotorVehicle))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded


		/**
		 * @author surendar.baskaran
		 * click Return page 
		 * @param driver
		 * @return
		 */
		public void clickReturnPage(WebDriver driver){
			BrowserActions.click(driver, lnkReturnPage,"Return Page link");
		}


}
