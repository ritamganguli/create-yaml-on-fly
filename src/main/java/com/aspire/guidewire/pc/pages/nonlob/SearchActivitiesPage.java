package com.aspire.guidewire.pc.pages.nonlob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchActivitiesPage extends LoadableComponent<SearchActivitiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-AssignedUser']", AI = false)
	public WebElement inpAssignedto;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivityPriority']", AI = false)
	public WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-PolicyNumber']", AI = false)
	public WebElement inpPolicyNumber;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-AssignedUser-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "select[name$='ActivityStatus']", AI = false)
	public WebElement drpActivityStatus;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitiesSearchLV_tb-ActivitySearch_SkipButton>div[role='button']", AI = false)
	public WebElement btnSkip;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitiesSearchLV_tb-PrintMe>div[role='button']", AI = false)
	public WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-AccountNumber']", AI = false)
	public WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitiesSearchLV_tb-ActivitySearch_CompleteButton>div[role='button']", AI = false)
	public WebElement btnComplete;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitiesSearchLV_tb-ActivitySearch_AssignButton>div[role='button']", AI = false)
	public WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "div[class$='gw-editable']  input[name$='AssignedUser']", AI = false)
	public WebElement txtEmptyAssignedTo;

	@IFindBy(how = How.CSS, using = "div[class$='gw-editable']  input[name$='PolicyNumber']", AI = false)
	public WebElement txtEmptyPolicyNumber;

	@IFindBy(how = How.CSS, using = "div[class$='gw-editable']  input[name$='AccountNumber']", AI = false)
	public WebElement txtEmptyAccountNumber;

	@IFindBy(how = How.CSS, using = "select[name$='OverdueNow']", AI = false)
	public WebElement drpOverdueNow;

	@IFindBy(how = How.XPATH, using = "//div[text()='Open']", AI = false)
	public WebElement lblOpen;

	@IFindBy(how = How.XPATH, using = "//div[text()='All ordered MVRs received - Clear']", AI = false)
	public WebElement lnkOpenSubject;

	@IFindBy(how = How.XPATH, using = "//div[text()='Activity Detail']", AI = false)
	public WebElement lblActivityDetail;

	@IFindBy(how = How.XPATH, using = "//option[@selected]/parent::select[contains(@name,'ActivityStatus')]", AI = false)
	public WebElement drpSelectedActivityStatus;

	@IFindBy(how = How.XPATH, using = "//option[@selected]/parent::select[contains(@name,'ActivityPriority')]", AI = false)
	public WebElement drpSelectedPriority;

	@IFindBy(how = How.XPATH, using = "//option[@selected]/parent::select[contains(@name,'OverdueNow')]", AI = false)
	public WebElement drpSelectedOverdueNow;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Open']//ancestor::table", AI = false)
	public WebElement lblOpenStatus;
	
	public String drpactivityStatus = "select[name$='ActivityStatus']";

	public String drpactivityPriority = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivityPriority']";

	public String drpOverDueNow = "select[name$='OverdueNow']";


	public SearchActivitiesPage(){
	}

	public SearchActivitiesPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnAssign))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}
	public SearchActivitiesPage enterAssignedto(WebDriver driver,String Assignedto) {
		BrowserActions.type(driver, inpAssignedto,Assignedto, "Assignedto");
		return this;
	}
	public SearchActivitiesPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public SearchActivitiesPage enterPolicyNumber(WebDriver driver,String PolicyNumber) {
		BrowserActions.type(driver, inpPolicyNumber,PolicyNumber, "PolicyNumber");
		return this;
	}
	public SearchActivitiesPage clickSelectUser(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser,3,"SelectUser");
		return this;
	}
	public SearchActivitiesPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,true,"Search");
		return this;
	}
	public SearchActivitiesPage selectActivityStatus(WebDriver driver,String ActivityStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityStatus,ActivityStatus,2,"ActivityStatus");
		return this;
	}
	public SearchActivitiesPage clickSkip(WebDriver driver)  {
		BrowserActions.click(driver, btnSkip,"Skip");
		return this;
	}
	public SearchActivitiesPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,true,"Reset");
		return this;
	}
	public SearchActivitiesPage clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}
	public SearchActivitiesPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
		return this;
	}
	public SearchActivitiesPage clickComplete(WebDriver driver)  {
		BrowserActions.click(driver, btnComplete,"Complete");
		return this;
	}
	public SearchActivitiesPage clickAssign(WebDriver driver)  {
		BrowserActions.click(driver, btnAssign,"Assign");
		return this;
	}
	
	/**
	 * @author siva.panjanathan
	 * select Overdue Now
	 * @param driver , overdueNow
	 * @return
	 */
	public SearchActivitiesPage selectOverdueNow(WebDriver driver,String overdueNow){
		BrowserActions.selectDropDownByVisibleText(driver, drpOverdueNow, overdueNow,"Overdue Now is selected");
		return this;
	}

	/**
	 * @author siva.panjanathan
	 * verify open status
	 * @param driver
	 */
	public SearchActivitiesPage verifyStatus(WebDriver driver,String status,int rowNo){
		By drpdwnEleBy = By.cssSelector(drpactivityStatus);
		BrowserActions.waitForElementToDisplay(driver, drpdwnEleBy, "drpdwnEle");
		WebElement drpdwnEle = drpdwnEleBy.findElement(driver);
		Select sel = new Select(drpdwnEle);
		BrowserActions.selectDropDownByVisibleText(driver, drpdwnEle, status,true,"Activity status is selected");
		BrowserActions.waitForElementToDisplay(driver, drpdwnEle);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		String selectedopt = firstSelectedOption.getText();

		By tableBy = By.tagName("table");
		BrowserActions.waitForElementToDisplay(driver, tableBy, "table");
		WebElement table = tableBy.findElement(driver);
		List<WebElement> findElements = table.findElements(By.cssSelector("tbody tr"));
		List<Boolean>options = new ArrayList<>();
		List<Boolean>expectedOption = new ArrayList<>(Arrays.asList(false));
		for(int i = 1;i<findElements.size();i++) {
			List<WebElement> rows = findElements.get(i).findElements(By.tagName("td"));
			String actualText = rows.get(rowNo).getText();
			options.add(selectedopt.equals(actualText));
		}
		Log.assertThat(!options.containsAll(expectedOption), "Activity Status is Matched", "Activity Status is Not Matched", driver);

		//BrowserActions.verifyElementDisplayed(driver, lblOpen, "label open");
		return this;
	}

	/**
	 * @author siva.panjanathan
	 * verify activity detail
	 * @param driver
	 * @return
	 */
	public SearchActivitiesPage verifyActivityDetail(WebDriver driver){
		BrowserActions.verifyElementDisplayed(driver, lblActivityDetail, "label activity detail");
		return this;
	}

	/**
	 * @author siva.panjanathan
	 * verify open status
	 * @param driver
	 */
	public SearchActivitiesPage verifyOverDueNow(WebDriver driver,String status,int rowNo){
		By drpdwnEleBy = By.cssSelector(drpOverDueNow);
		BrowserActions.waitForElementToDisplay(driver, drpdwnEleBy, "drpdwnEle");
		WebElement drpdwnEle = drpdwnEleBy.findElement(driver);
		Select sel = new Select(drpdwnEle);
		BrowserActions.selectDropDownByVisibleText(driver, drpdwnEle, status,"Overdue status is selected");

		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		String selectedopt = firstSelectedOption.getText();

		By tableBy = By.tagName("table");
		BrowserActions.waitForElementToDisplay(driver, tableBy, "table");
		WebElement table = tableBy.findElement(driver);
		List<WebElement> findElements = table.findElements(By.cssSelector("tbody tr"));
		List<Boolean>options = new ArrayList<>();
		List<Boolean>expectedOption = new ArrayList<>(Arrays.asList(false));
		for(int i = 1;i<findElements.size();i++) {
			List<WebElement> rows = findElements.get(i).findElements(By.tagName("td"));
			String actualText = rows.get(rowNo).getText();
			options.add(selectedopt.equals(actualText));
		}
		Log.assertThat(!options.containsAll(expectedOption), "Overdue Status is Matched", "Overdue Status is Not Matched", driver);
		return this;
	}

	/**
	 * @author siva.panjanathan
	 * verify open status
	 * @param driver
	 */
	public SearchActivitiesPage verifyPriority(WebDriver driver,String status,int rowNo){
		By drpdwnEleBy = By.cssSelector(drpactivityPriority);
		BrowserActions.waitForElementToDisplay(driver, drpdwnEleBy, "attributeName");
		WebElement drpdwnEle = drpdwnEleBy.findElement(driver);
		Select sel = new Select(drpdwnEle);
		BrowserActions.selectDropDownByVisibleText(driver, drpdwnEle, status,"priority status is selected");

		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		String selectedopt = firstSelectedOption.getText();

		By tableBy = By.tagName("table");
		BrowserActions.waitForElementToDisplay(driver, tableBy, "attributeName");
		WebElement table = tableBy.findElement(driver);
		List<WebElement> findElements = table.findElements(By.cssSelector("tbody tr"));
		List<Boolean>options = new ArrayList<>();
		List<Boolean>expectedOption = new ArrayList<>(Arrays.asList(false));
		for(int i = 1;i<findElements.size();i++) {
			List<WebElement> rows = findElements.get(i).findElements(By.tagName("td"));
			String actualText = rows.get(rowNo).getText();
			options.add(selectedopt.equals(actualText));
		}
		Log.assertThat(!options.containsAll(expectedOption), "priority Status is Matched", "priority Status is Not Matched", driver);
		return this;
	}
	
	/**
	 * Verify Default Selected Value Activity Status is display
	 * @param driver , textExpected
	 * @return
	 */

	public SearchActivitiesPage verifyDefaultSelectedValueActivityStatus(WebDriver driver,String textExpected){
		BrowserActions.verifyElementTextIsDisplayedforSelcetedDropDown(driver, drpActivityStatus, textExpected, true, "Activity Status First Selected Option is Matching");
		return this;
	}
	
	/**
	 * Verify Default Selected Value Priority  is display
	 * @param driver , textExpected
	 * @return
	 */
	
	public SearchActivitiesPage verifyDefaultSelectedValuePriority(WebDriver driver,String textExpected){
		BrowserActions.verifyElementTextIsDisplayedforSelcetedDropDown(driver, drpPriority, textExpected, true, "Priority First Selected Option is Matching");
		return this;
	}
	
	/**
	 * Verify Default Selected Value overdue  is display
	 * @param driver , textExpected
	 * @return
	 */

	public SearchActivitiesPage verifyDefaultSelectedValueOverDue(WebDriver driver,String textExpected){
		BrowserActions.verifyElementTextIsDisplayedforSelcetedDropDown(driver, drpOverdueNow, textExpected, true, "OverDue First Selected Option is Matching");
		return this;
	}
	
	/**
	 * Verify policy no field is empty or not
	 * @param driver 
	 * @return
	 */


	public SearchActivitiesPage verifyPolicyNumberFieldIsEmpty(WebDriver driver) {
		Log.assertThat(inpPolicyNumber.getAttribute("value").isEmpty(), "Text field is cleared", "Text field is not cleared");
		return this;
	}
	
	/**
	 * Verify Account no field is empty or not
	 * @param driver
	 * @return
	 */
	
	public SearchActivitiesPage verifyAccountNumberFieldIsEmpty(WebDriver driver) {
		Log.assertThat(inpAccountNumber.getAttribute("value").isEmpty(), "Text field is cleared", "Text field is not cleared");
		return this;
	}
	
	/**
	 * Verify Assigned To Field Is Empty or not
	 * @param driver 
	 * @return
	 */
	
	public SearchActivitiesPage verifyAssignedToFieldIsEmpty(WebDriver driver) {
		Log.assertThat(inpAssignedto.getAttribute("value").isEmpty(), "Text field is cleared", "Text field is not cleared");
		return this;
	}
	
	/**
	 * Verify Status1 is display
	 * @param driver , status
	 * @return
	 */
	
	public SearchActivitiesPage verifyStatus1(WebDriver driver,String status){
		 By statusBy = By.xpath("//div[text()='"+status+"']//ancestor::tr");
		 int size = BrowserActions.getWebElementSize(driver, statusBy, "status", 0.5);
	     Log.assertThat(size>0, status+" activities assigned to the Respective User are display ", status+" activities assigned to the Respective User are not display ");
	 	 return this;
	}



	public class SearchUserPage extends LoadableComponent<SearchUserPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[id$='UserSearchPopup-UserSearchPopupScreen-ttlBar']", AI = false)
		public WebElement ttlSearchUsers;

		@IFindBy(how = How.CSS, using = "input[name$='Username']", AI = false)
		public WebElement txtUserName;

		@IFindBy(how = How.CSS, using = "div[id$='LV-0-_Select']", AI = false)
		public WebElement btnSelect;

		@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
		public WebElement btnSearch;

		public SearchUserPage(){
		}

		public SearchUserPage(WebDriver driver) {
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlSearchUsers))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}

		/**
		 * @author siva.panjanathan
		 * Enter UserName
		 * @param driver , userName
		 * @return
		 */
		public SearchUserPage enterSelectUserName(WebDriver driver,String userName){
			BrowserActions.type(driver, txtUserName, userName,"UserName is entered");
			return this;
		}

		/**
		 * @author charu.anbarasan
		 * click search button
		 * @param driver
		 * @return
		 */
		public SearchUserPage clickSearch(WebDriver driver){
			BrowserActions.click(driver, btnSearch,2, "Search");
			return this;
		}

		/**
		 * @author charu.anbarasan
		 * click select user button
		 * @param driver
		 * @return
		 */
		public void clickSelectUser(WebDriver driver){
			BrowserActions.click(driver, btnSelect ,2,"Select button");

		}
		
		
	}
	
}

