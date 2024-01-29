package com.aspire.guidewire.bc.pages;
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

public class NewPaymentInstrumentPage extends LoadableComponent<NewPaymentInstrumentPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='NewPaymentInstrumentPopup-Detail']", AI = false)
	private WebElement inpDetail;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-__crumb__", AI = false)
	private WebElement btnReturntoDirectBillPayment;

	@IFindBy(how = How.CSS, using = "select[name$='PaymentMethod']", AI = false)
	private WebElement drpPaymentMethod;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-Update>div[role='button']", AI = false)
	private WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-CreditCardLink", AI = false)
	private WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "input[name='NewPaymentInstrumentPopup-OneTime']", AI = false)
	private WebElement chkOnetimeuse;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewPaymentInstrumentPopup-Token']", AI = false)
	private WebElement inpToken;
	
	public NewPaymentInstrumentPage(){
	}

	public NewPaymentInstrumentPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpToken))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public NewPaymentInstrumentPage enterDetail(WebDriver driver,String Detail) {
		            BrowserActions.type(driver, inpDetail,Detail, "Detail");
			        return this;
           }
public NewPaymentInstrumentPage clickReturntoDirectBillPayment(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoDirectBillPayment,"ReturntoDirectBillPayment");
				    return this;
			}
public NewPaymentInstrumentPage selectPaymentMethod(WebDriver driver,String PaymentMethod)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPaymentMethod,PaymentMethod,true,"PaymentMethod");
				    return this;
			}
public NewPaymentInstrumentPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public NewPaymentInstrumentPage clickCollectCreditCard(WebDriver driver)  {
					BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
				    return this;
			}
public NewPaymentInstrumentPage clickOnetimeuse(WebDriver driver)  {
					BrowserActions.click(driver, chkOnetimeuse,"Onetimeuse");
				    return this;
			}
public NewPaymentInstrumentPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewPaymentInstrumentPage enterToken(WebDriver driver,String Token) {
		            BrowserActions.type(driver, inpToken,Token, "Token");
			        return this;
           }
}
