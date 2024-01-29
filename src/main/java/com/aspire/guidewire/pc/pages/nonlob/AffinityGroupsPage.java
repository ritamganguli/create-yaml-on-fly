package com.aspire.guidewire.pc.pages.nonlob;
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

public class AffinityGroupsPage extends LoadableComponent<AffinityGroupsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-Organization']", AI = false)
	private WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpGroupName;

	@IFindBy(how = How.CSS, using = "#SearchAffinityGroup-AffinityGroupSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-Organization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "#SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-ProducerCode']", AI = false)
	private WebElement inpAvailableProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-SearchOnlyAvailableGroups']", AI = false)
	private WebElement chkSearchOnlyAvailableGroups;

	@IFindBy(how = How.CSS, using = "select[name='SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-GroupType']", AI = false)
	private WebElement drpGroupType;

	@IFindBy(how = How.CSS, using = "#SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "select[name='SearchAffinityGroup-AffinityGroupSearchScreen-AffinityGroupSearchDV-Product']", AI = false)
	private WebElement drpProduct;
	
    @IFindBy(how = How.XPATH, using = "//div[text()='No data to display']", AI = false)
	public WebElement lblNoDataDisplay;

	public AffinityGroupsPage(){
	}

	public AffinityGroupsPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpProduct))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public AffinityGroupsPage enterOrganization(WebDriver driver,String Organization) {
		            BrowserActions.type(driver, inpOrganization,Organization, "Organization");
			        return this;
           }
public AffinityGroupsPage enterGroupName(WebDriver driver,String GroupName) {
		            BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
			        return this;
           }
public OrganizationsPage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,true,"SelectOrganization");
				    return new OrganizationsPage(driver).get();
			}
public AffinityGroupsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public AffinityGroupsPage enterAvailableProducerCode(WebDriver driver,String AvailableProducerCode) {
		            BrowserActions.type(driver, inpAvailableProducerCode,AvailableProducerCode, "AvailableProducerCode");
			        return this;
           }
public AffinityGroupsPage clickSearchOnlyAvailableGroups(WebDriver driver)  {
					BrowserActions.click(driver, chkSearchOnlyAvailableGroups,"SearchOnlyAvailableGroups");
				    return this;
			}
public AffinityGroupsPage selectGroupType(WebDriver driver,String GroupType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpGroupType,GroupType,"GroupType");
				    return this;
			}
public AffinityGroupsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public AffinityGroupsPage selectProduct(WebDriver driver,String Product)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpProduct,Product,"Product");
				    return this;
			}

/**
 * Verify Messege
 * @author vignesh.ravi
 * @param driver
 * @return
 */
public AffinityGroupsPage verifyMessege(WebDriver driver)  {
	 BrowserActions.verifyElementDisplayed(driver, lblNoDataDisplay, "No data to Display");
	return this;
}
}
