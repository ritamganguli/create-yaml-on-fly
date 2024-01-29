package com.aspire.guidewire.pc.pages.nonlob;

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

public class RateTableDefinitionsPage extends LoadableComponent<RateTableDefinitionsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#RateTableDefinitions-RateTableDefinitionSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#RateTableDefinitions-RateTableDefinitionSearchScreen-RateTableDefinitionSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='RateTableDefinitions-RateTableDefinitionSearchScreen-RateTableDefinitionSearchDV-name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#RateTableDefinitions-RateTableDefinitionSearchScreen-DefinitionsLV_tb-DeleteSelectedDefinitions>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='RateTableDefinitions-RateTableDefinitionSearchScreen-RateTableDefinitionSearchDV-code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "#RateTableDefinitions-RateTableDefinitionSearchScreen-DefinitionsLV_tb-AddRateTableDefButton>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='RateTableDefinitions-RateTableDefinitionSearchScreen-RateTableDefinitionSearchDV-PolicyLine']", AI = false)
	private WebElement drpPolicyLine;

	@IFindBy(how = How.CSS, using = "#RateTableDefinitions-RateTableDefinitionSearchScreen-RateTableDefinitionSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "div[id$='DefinitionsLV-0-Name']", AI = false)
	private WebElement lnkName;

	@IFindBy(how = How.CSS, using = "div[id$='RateTableDefinitionDV']", AI = false)
	public WebElement lblBasicsAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='ParametersCardTab']", AI = false)
	public WebElement btnParameters;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='ParametersCard']", AI = false)
	public WebElement lblParametersAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='FactorsCardTab']", AI = false)
	public WebElement btnFactor;

	@IFindBy(how = How.CSS, using = "div[id$='FactorsCard']", AI = false)
	public WebElement lblFactorAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='ArgumentSourceCardTab']", AI = false)
	public WebElement btnArgumentSources;

	@IFindBy(how = How.CSS, using = "div[id$='ArgumentSourceCard']", AI = false)
	public WebElement lblArgumentSourcesAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='UsageTab']", AI = false)
	public WebElement btnUsage;

	@IFindBy(how = How.CSS, using = "div[id$='RateTableDefinitionUsagePanelSet']", AI = false)
	public WebElement lblUsageAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='BasicsTab']", AI = false)
	public WebElement btnBasics;

	@IFindBy(how = How.CSS, using = "div[id$='-Code']", AI = false)
	public WebElement lblCode;

	@IFindBy(how = How.CSS, using = "div[id$='-PolicyLine']", AI = false)
	public WebElement lblPolicyLine;

	@IFindBy(how = How.CSS, using = "div[id$='LocalizedValuesLV-LocalizedValuesLV']", AI = false)
	public WebElement lblLocalization;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='AddParameter'] div", AI = false)
	public WebElement btnAddParameter;

	@IFindBy(how = How.CSS, using = "div[id$='AddParameter-0-MatchOp']", AI = false)
	public WebElement btnExactMatch;

	@IFindBy(how = How.CSS, using = "input[name$='ParameterCV-Name']", AI = false)
	public WebElement txtCode;

	@IFindBy(how = How.CSS, using = "input[name$='DisplayText']", AI = false)
	public WebElement txtLabel;

	@IFindBy(how = How.CSS, using = "select[name$='DataType']", AI = false)
	public WebElement drpDataType;

	@IFindBy(how = How.CSS, using = "input[name$='SortOrder']", AI = false)
	public WebElement txtPriority;

	@IFindBy(how = How.CSS, using = "select[name$='DisplayType']", AI = false)
	public WebElement drpDisplayType;

	@IFindBy(how = How.CSS, using = "select[name$='PhysicalColumn']", AI = false)
	public WebElement drpPhysicalColumn;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-0-0-column']", AI = false)
	public WebElement txtEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-2-0-column']", AI = false)
	public WebElement txtEdgeEnglish;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "div[id$='ClearButton']", AI = false)
	public WebElement btnClear;

	@IFindBy(how = How.CSS, using = "div[id$='Remove']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public WebElement lblLastPageNo;

	@IFindBy(how = How.CSS, using = "input[id$='ListPaging-input']", AI = false)
	public WebElement txtFirstPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	private WebElement inpParameterCode;


	public String parameterTable = "//table[@class='gw-ListViewWidget--table gw-table']/tbody/tr/td[2]/div";

	public RateTableDefinitionsPage(){
	}

	public RateTableDefinitionsPage(WebDriver driver){
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
	}public RateTableDefinitionsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public RateTableDefinitionsPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public RateTableDefinitionsPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public RateTableDefinitionsPage enterCode(WebDriver driver,String Code) {
		BrowserActions.type(driver, inpCode,Code, "Code");
		return this;
	}
	public RateTableDefinitionsPage enterParameterCode(WebDriver driver,String Code) {
		BrowserActions.type(driver, inpParameterCode,Code,true, "Parameter Code");
		return this;
	}
	public RateTableDefinitionsPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public RateTableDefinitionsPage selectPolicyLine(WebDriver driver,String PolicyLine)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLine,PolicyLine,"PolicyLine");
		return this;
	}
	public RateTableDefinitionsPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public RateTableDefinitionsPage clickName(WebDriver driver)  {
		BrowserActions.click(driver, lnkName,"Name");
		return this;
	}
	public RateTableDefinitionsPage clickParameters(WebDriver driver)  {
		BrowserActions.click(driver, btnParameters, "Parameter");
		return this;
	}
	public RateTableDefinitionsPage verifyBasicsDetailsIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblBasicsAllDetails, "Basic Below Details");
		return this;
	}

	public RateTableDefinitionsPage verifyParameterDetailsIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblParametersAllDetails, "Parameter Below Details");
		return this;
	}
	public RateTableDefinitionsPage clickFactor(WebDriver driver)  {
		BrowserActions.click(driver, btnFactor, "Factor");
		return this;
	}
	public RateTableDefinitionsPage verifyFactorDetailsIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblFactorAllDetails, "Factor Below Details");
		return this;
	}
	public RateTableDefinitionsPage clickArgumentSource(WebDriver driver)  {
		BrowserActions.click(driver, btnArgumentSources, "Argument Source");
		return this;
	}
	public RateTableDefinitionsPage verifyArgumentSourceDetailsIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblArgumentSourcesAllDetails, "Argument Source Details");
		return this;
	}
	public RateTableDefinitionsPage clickUsage(WebDriver driver)  {
		BrowserActions.click(driver, btnUsage, "Usage");
		return this;
	}
	public RateTableDefinitionsPage verifyUsageDetailsIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblUsageAllDetails, "Usage belo Details");
		return this;
	}
	public RateTableDefinitionsPage verifyCodeIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblCode, "Code");
		return this;
	}
	public RateTableDefinitionsPage verifyLocalizationIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblLocalization, "Localization");
		return this;
	}
	public RateTableDefinitionsPage verifyPolicyLineIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblPolicyLine, "Policy Line");
		return this;
	}
	public RateTableDefinitionsPage clickBascis(WebDriver driver) {
		BrowserActions.click(driver, btnBasics, "Basics");
		return this;
	}
	public RateTableDefinitionsPage clickEdit(WebDriver driver) {
		BrowserActions.click(driver, btnEdit,true,"Edit Button");
		return this;
	}

	public RateTableDefinitionsPage clickAddParameter(WebDriver driver) {
		BrowserActions.click(driver, btnAddParameter, 1,"Add Parameter Button");
		return this;
	}

	public RateTableDefinitionsPage clickExactMatch(WebDriver driver) {
		BrowserActions.click(driver, btnExactMatch,1, "Exact Match");
		return this;
	}

	public void enterLabel(WebDriver driver,String label) {
		BrowserActions.type(driver,txtLabel,label,3, "Label");
	}

	public void enterPriority(WebDriver driver,String priority) {
		BrowserActions.type(driver,txtPriority,priority, "Priority");
	}

	public void selectDataType(WebDriver driver, String dataType) {
		BrowserActions.selectDropDownByVisibleText(driver, drpDataType,dataType,"Data Type");
	}

	public void selectDisplayType(WebDriver driver, String displayType) {
		BrowserActions.selectDropDownByVisibleText(driver, drpDisplayType,displayType,"Display Type");
	}

	public void selectPhysicalColumn(WebDriver driver) {
		BrowserActions.selectDropDownByIndex(driver, drpPhysicalColumn,2,"Physical Column");
	}

	public void enterEdgePolicyholderEnglish(WebDriver driver, String edgePolicyholderEnglish){
		BrowserActions.type(driver, txtEdgePolicyholderEnglish,edgePolicyholderEnglish,true,"Edge Policy holder English");
	}

	public void enterEdgeEnglish(WebDriver driver, String edgePolicyholderEnglish) {
		BrowserActions.type(driver, txtEdgeEnglish,edgePolicyholderEnglish,3,"Edge Policy holder English");
	}

	public void clickUpdate(WebDriver driver) {
		BrowserActions.click(driver, btnUpdate, "Update Button");
	}

	public void clickClearButton(WebDriver driver) {
		BrowserActions.click(driver, btnClear, "Clear Button");
	}
	
	/**
	 * Click check box based on label name
	 * @param driver , label
	 * @return
	 */

	public void ClickCheckBoxBasedOnLabelName(WebDriver driver,String label) {
		String pageNo=lblLastPageNo.getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			By lableNameBy = By.xpath("//div[text()='"+label+"']//ancestor::td[contains(@id,'name_Cell')]//preceding-sibling::td");
			int size = BrowserActions.getWebElementSize(driver, lableNameBy, "Lable Name", 0.5);
			if (size > 0) {
				By labelNameBy =By.xpath("//div[text()='"+label+"']//ancestor::td[contains(@id,'name_Cell')]//preceding-sibling::td");
				BrowserActions.waitForElementToDisplay(driver, labelNameBy, "labelName");
				WebElement labelName = labelNameBy.findElement(driver);
				BrowserActions.click(driver, labelName, "Check box");
				break;
			}
			else {
				BrowserActions.click(driver, btnNextArrow,"Next Button");
			}
		}
	}
	
	/**
	 * Click Remove Button
	 * @param driver 
	 * @return
	 */
	public void clickRemove(WebDriver driver) {
		BrowserActions.click(driver, btnRemove,"btn Remove");
	}
	
	/**
	 * Verify Added Element Not Displayed
	 * @param driver , label
	 * @return
	 */

	public boolean verifyAddedElementNotDisplayed(WebDriver driver,String label) {	
	boolean status = false;
	int tableSize = driver.findElements(By.xpath(parameterTable)).size();
	for (int i = 0; i < tableSize-1; i++) {
		By textSubjectBy = By.xpath("td[id='RateTableDefinitionDetail-RateTableDefinitionDetailsScreen-MatchOpLV-"+i+"-name_Cell']'] /div //div[@class='gw-ActionValueWidget']");
		BrowserActions.waitForElementToDisplay(driver, textSubjectBy, "textSubject");
		WebElement subject = textSubjectBy.findElement(driver);
		String textSubject =BrowserActions.getText(driver, subject,"subject");
		if(textSubject.equals(label)) {
			status = true;
			break;
		}
		else {
			BrowserActions.click(driver, btnNextArrow,"Next Button");
		}
	}
	Log.softAssertThat(!status, "Deleted successfully", "Failed to delete");
	return status;
}
	
	/**
	 * Click Parameter Check box
	 * @param driver , parameter name
	 * @return
	 */
	public void clickParameterCheckBox(WebDriver driver, String parameterName) {
		By addedParameterBy = By.xpath("//div[text()='"+parameterName+"']//ancestor::td//preceding-sibling::td//ancestor::div[contains(@id,'Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, addedParameterBy, "addedParameter");
		WebElement addedParameter = addedParameterBy.findElement(driver);
		BrowserActions.click(driver, addedParameter,"btn Remove");
	}


}
