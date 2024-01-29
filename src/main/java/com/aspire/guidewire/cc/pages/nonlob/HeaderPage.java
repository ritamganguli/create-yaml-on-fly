package com.aspire.guidewire.cc.pages.nonlob;

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

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class HeaderPage extends LoadableComponent<HeaderPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-ClaimTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleClaimSubMenu;
	
	@IFindBy(how = How.CSS, using = "div[id$=TabBar-ClaimTab-ClaimTab_FNOLWizard]", AI = false)
	public WebElement tabNewClaim;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSearchesGroup']", AI = false)
	public WebElement lblClaim;
	
	@IFindBy(how = How.CSS, using = "div[id$='SimpleClaimSearch']", AI = false)
	public WebElement lblSimpleSearch;
	
	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-SearchTab']//following::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement toggleSearchMenu;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSearchesGroup_ClaimSearch']", AI = false)
	public WebElement lblAdvancedSearch;
	
	@IFindBy(how = How.CSS, using = "div[id$='_ICD']", AI = false)
	public WebElement lnkICDCodes;
	

	public HeaderPage() {}

	public HeaderPage(WebDriver driver){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, toggleClaimSubMenu))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * Clicks on  toggleClaimSubMenu
	 * @author seetha.varanasi
	 * @param driver
	 * @return 
	 */
	public HeaderPage clicktoggleClaimSubMenu(WebDriver driver)  {
		BrowserActions.click(driver, toggleClaimSubMenu,1,"ToggleClaimSubMenu");
		return this;
	}
	
	/**
	 * Used to click on "Toggle Search Menu"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public HeaderPage clickSearchToggleSubMenu(WebDriver driver)  {
		BrowserActions.click(driver, toggleSearchMenu,2,"Toggle Search Menu");
		return this;

	}
	
	/**
	 * Used to click on "Simple Search"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public SearchClaimsPage clickSimpleSearch(WebDriver driver)  {
		BrowserActions.click(driver, lblSimpleSearch,"Simple Search");
		return new SearchClaimsPage(driver).get();
	}
	
	/**
	 * Used to Mouse over on "Claim"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public HeaderPage moveToClaim(WebDriver driver)  {
		BrowserActions.moveToElement(driver, lblClaim,"Claim");
		return this;
	}
	
	/**
	 * Used to click on "Advanced Search"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public AdvanceSearchClaimsPage clickAdvancedSearch(WebDriver driver)  {
		BrowserActions.click(driver, lblAdvancedSearch,"Advanced Search");
		return new AdvanceSearchClaimsPage(driver).get();
	}
	
	/**
	 * click ICD codes
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public HeaderPage clickICDCodes(WebDriver driver)  {
		BrowserActions.click(driver, lnkICDCodes,"ICD codes");
		return new HeaderPage(driver).get();
	}
	
	public BatchProcessInfoPage clickAltShiftT(WebDriver driver) throws AWTException  {
	        Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_ALT);
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        robot.keyPress(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        robot.keyRelease(KeyEvent.VK_ALT);
			return new BatchProcessInfoPage(driver).get();
	    }
	}



