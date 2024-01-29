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


public class PreRenewalDirectionForPolicyTermPage  extends LoadableComponent<PreRenewalDirectionForPolicyTermPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	
	@IFindBy(how = How.CSS, using = "input[name='PreRenewalDirectionPage-PreRenewalDirectionScreen-Subject']", AI = false)
	public WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-NonRenewAddExpl", AI = false)
	public WebElement inpNonRenewAdditionalText;

	@IFindBy(how = How.CSS, using = "select[name='PreRenewalDirectionPage-PreRenewalDirectionScreen-PreRenewalOwner']", AI = false)
	public WebElement drpAssignTo;

	@IFindBy(how = How.CSS, using = "select[name='PreRenewalDirectionPage-PreRenewalDirectionScreen-NonRenewReason']", AI = false)
	public WebElement drpNonRenewReason;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-SelectedNonRenewalExplanationsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name$='PreRenewalDirection']", AI = false)
	public WebElement drpDirection;

	@IFindBy(how = How.CSS, using = "select[name='PreRenewalDirectionPage-PreRenewalDirectionScreen-Topic']", AI = false)
	public WebElement drpTopic;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "textarea[name='PreRenewalDirectionPage-PreRenewalDirectionScreen-Text']", AI = false)
	public WebElement inpText;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-PreRenewalDirectionScreen_ViewNotesButton>div[role='button']", AI = false)
	public WebElement btnViewNotes;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-PreRenewalDirectionScreen_DeleteButton>div[role='button']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-SelectedNonRenewalExplanationsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "select[name='PreRenewalDirectionPage-PreRenewalDirectionScreen-RelatedTo']", AI = false)
	public WebElement drpRelatedTo;

	@IFindBy(how = How.CSS, using = "select[name='PreRenewalDirectionPage-PreRenewalDirectionScreen-SecurityLevel']", AI = false)
	public WebElement drpSecurityLevel;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#PreRenewalDirectionPage-PreRenewalDirectionScreen-PreRenewalOwner-AssigneePicker", AI = false)
	public WebElement btnAssigneePicker;
	
	@IFindBy(how = How.CSS, using = "div[id$='PreRenewalDirectionScreen-0']", AI = false)
	public WebElement lblTtlBar;

	public PreRenewalDirectionForPolicyTermPage(){
	}

	public PreRenewalDirectionForPolicyTermPage(WebDriver driver) {
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
public PreRenewalDirectionForPolicyTermPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public PreRenewalDirectionForPolicyTermPage enterNonRenewAdditionalText(WebDriver driver,String NonRenewAdditionalText) {
		            BrowserActions.type(driver, inpNonRenewAdditionalText,NonRenewAdditionalText, "NonRenewAdditionalText");
			        return this;
           }
public PreRenewalDirectionForPolicyTermPage selectAssignTo(WebDriver driver,String AssignTo)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAssignTo,AssignTo,"AssignTo");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage selectNonRenewReason(WebDriver driver,String NonRenewReason)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpNonRenewReason,NonRenewReason,"NonRenewReason");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage selectDirection(WebDriver driver,String Direction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDirection,Direction,true,"Direction");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage selectTopic(WebDriver driver,String Topic)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTopic,Topic,"Topic");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,true,"Edit");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage enterText(WebDriver driver,String Text) {
		            BrowserActions.type(driver, inpText,Text, "Text");
			        return this;
           }
public PreRenewalDirectionForPolicyTermPage clickViewNotes(WebDriver driver)  {
					BrowserActions.click(driver, btnViewNotes,"ViewNotes");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage selectRelatedTo(WebDriver driver,String RelatedTo)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo,RelatedTo,"RelatedTo");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage selectSecurityLevel(WebDriver driver,String SecurityLevel)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSecurityLevel,SecurityLevel,0.5, "SecurityLevel");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public PreRenewalDirectionForPolicyTermPage clickAssigneePicker(WebDriver driver)  {
					BrowserActions.click(driver, btnAssigneePicker,"AssigneePicker");
				    return this;
			}
}
