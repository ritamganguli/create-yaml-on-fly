package com.aspire.guidewire.cc.pages.nonlob;
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

public class BenefitsParametersPage extends LoadableComponent<BenefitsParametersPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-14-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_81;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-6-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_31;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-9-Comment']", AI = false)
	private WebElement inpComments_54;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-6-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_34;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-1-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_4;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-8-Comment']", AI = false)
	private WebElement inpComments_48;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-7-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_40;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-8-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_44;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-13-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_77;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-12-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_71;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-13-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_75;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-0-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-8-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_43;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-8-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_46;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-10-Comment']", AI = false)
	private WebElement inpComments_60;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-7-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_38;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-7-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_37;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-6-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_32;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-11-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_65;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-9-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_52;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-0-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-5-Comment']", AI = false)
	private WebElement inpComments_30;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-3-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_13;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-10-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_58;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-3-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_15;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-5-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_26;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-10-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_59;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-4-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_20;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-9-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_53;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-11-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_64;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-4-Comment']", AI = false)
	private WebElement inpComments_24;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-2-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_9;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-7-Comment']", AI = false)
	private WebElement inpComments_42;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-5-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_25;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-3-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_14;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-5-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_27;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-8-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_47;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-12-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_70;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-7-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_41;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-AddWCBenefitParameterSet>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-1-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_1;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-6-Comment']", AI = false)
	private WebElement inpComments_36;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-4-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_19;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-0-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-2-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_8;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-4-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_21;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-2-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_7;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-1-Comment']", AI = false)
	private WebElement inpComments_6;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-1-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_2;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-1-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_3;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-0-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-13-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_76;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-13-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_73;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-14-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_79;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-6-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_35;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-14-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_82;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-7-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_39;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-1-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_5;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-6-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_33;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-14-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_80;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-5-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_29;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-4-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_23;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-3-Comment']", AI = false)
	private WebElement inpComments_18;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-2-Comment']", AI = false)
	private WebElement inpComments_12;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-13-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_74;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-8-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_45;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-0-Comment']", AI = false)
	private WebElement inpComments;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-2-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_10;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-3-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_17;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-12-Comment']", AI = false)
	private WebElement inpComments_72;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-3-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_16;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-10-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_55;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-0-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-12-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_68;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-9-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_49;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-11-Comment']", AI = false)
	private WebElement inpComments_66;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-2-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_11;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-9-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_51;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-11-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_62;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-10-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_57;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-11-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_61;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-4-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_22;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-14-Comment']", AI = false)
	private WebElement inpComments_84;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-5-TD_BenefitEndDate']", AI = false)
	private WebElement inpEndDate_28;

	@IFindBy(how = How.CSS, using = "select[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-12-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction_67;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-13-Comment']", AI = false)
	private WebElement inpComments_78;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-10-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_56;

	@IFindBy(how = How.CSS, using = "input[name='WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-9-TD_BenefitStartDate']", AI = false)
	private WebElement inpStartDate_50;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-11-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_63;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-14-TD_BenefitEndDate_dateIcon", AI = false)
	private WebElement btnEndDateDateIcon_83;

	@IFindBy(how = How.CSS, using = "#WCBenefitParameterSet-WCBenefitParameterSetScreen-WCBenefitParameterSetLV-12-TD_BenefitStartDate_dateIcon", AI = false)
	private WebElement btnStartDateDateIcon_69;
	
	@IFindBy(how = How.CSS, using = "td[id$='TD_BenefitStartDate_Cell']", AI = false)
	private WebElement lblStartDate;

	@IFindBy(how = How.CSS, using = "td[id$='TD_BenefitEndDate_Cell']", AI = false)
	private WebElement lblEndDate;

	@IFindBy(how = How.CSS, using = "td[id$='Jurisdiction_Cell']", AI = false)
	private WebElement lblJurisdiction;

	@IFindBy(how = How.CSS, using = "td[id$='Comment_Cell']", AI = false)
	private WebElement lblComment;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public List<WebElement> lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-first']", AI = false)
	public WebElement btnFirstPageNo;


	public BenefitsParametersPage(){
	}

	public BenefitsParametersPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnStartDateDateIcon_69))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public BenefitsParametersPage clickStartDateDateIcon_81(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_81,"StartDateDateIcon_81");
				    return this;
			}
public BenefitsParametersPage selectJurisdiction_31(WebDriver driver,String Jurisdiction_31)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_31,Jurisdiction_31,"Jurisdiction_31");
				    return this;
			}
public BenefitsParametersPage enterComments_54(WebDriver driver,String Comments_54) {
		            BrowserActions.type(driver, inpComments_54,Comments_54, "Comments_54");
			        return this;
           }
public BenefitsParametersPage enterEndDate_34(WebDriver driver,String EndDate_34) {
		            BrowserActions.type(driver, inpEndDate_34,EndDate_34, "EndDate_34");
			        return this;
           }
public BenefitsParametersPage enterEndDate_4(WebDriver driver,String EndDate_4) {
		            BrowserActions.type(driver, inpEndDate_4,EndDate_4, "EndDate_4");
			        return this;
           }
public BenefitsParametersPage enterComments_48(WebDriver driver,String Comments_48) {
		            BrowserActions.type(driver, inpComments_48,Comments_48, "Comments_48");
			        return this;
           }
public BenefitsParametersPage enterEndDate_40(WebDriver driver,String EndDate_40) {
		            BrowserActions.type(driver, inpEndDate_40,EndDate_40, "EndDate_40");
			        return this;
           }
public BenefitsParametersPage enterStartDate_44(WebDriver driver,String StartDate_44) {
		            BrowserActions.type(driver, inpStartDate_44,StartDate_44, "StartDate_44");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_77(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_77,"EndDateDateIcon_77");
				    return this;
			}
public BenefitsParametersPage clickEndDateDateIcon_71(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_71,"EndDateDateIcon_71");
				    return this;
			}
public BenefitsParametersPage clickStartDateDateIcon_75(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_75,"StartDateDateIcon_75");
				    return this;
			}
public BenefitsParametersPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public BenefitsParametersPage selectJurisdiction_43(WebDriver driver,String Jurisdiction_43)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_43,Jurisdiction_43,"Jurisdiction_43");
				    return this;
			}
public BenefitsParametersPage enterEndDate_46(WebDriver driver,String EndDate_46) {
		            BrowserActions.type(driver, inpEndDate_46,EndDate_46, "EndDate_46");
			        return this;
           }
public BenefitsParametersPage enterComments_60(WebDriver driver,String Comments_60) {
		            BrowserActions.type(driver, inpComments_60,Comments_60, "Comments_60");
			        return this;
           }
public BenefitsParametersPage enterStartDate_38(WebDriver driver,String StartDate_38) {
		            BrowserActions.type(driver, inpStartDate_38,StartDate_38, "StartDate_38");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_37(WebDriver driver,String Jurisdiction_37)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_37,Jurisdiction_37,"Jurisdiction_37");
				    return this;
			}
public BenefitsParametersPage enterStartDate_32(WebDriver driver,String StartDate_32) {
		            BrowserActions.type(driver, inpStartDate_32,StartDate_32, "StartDate_32");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_65(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_65,"EndDateDateIcon_65");
				    return this;
			}
public BenefitsParametersPage enterEndDate_52(WebDriver driver,String EndDate_52) {
		            BrowserActions.type(driver, inpEndDate_52,EndDate_52, "EndDate_52");
			        return this;
           }
public BenefitsParametersPage enterStartDate(WebDriver driver,String StartDate) {
		            BrowserActions.type(driver, inpStartDate,StartDate, "StartDate");
			        return this;
           }
public BenefitsParametersPage enterComments_30(WebDriver driver,String Comments_30) {
		            BrowserActions.type(driver, inpComments_30,Comments_30, "Comments_30");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_13(WebDriver driver,String Jurisdiction_13)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_13,Jurisdiction_13,"Jurisdiction_13");
				    return this;
			}
public BenefitsParametersPage enterEndDate_58(WebDriver driver,String EndDate_58) {
		            BrowserActions.type(driver, inpEndDate_58,EndDate_58, "EndDate_58");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_15(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_15,"StartDateDateIcon_15");
				    return this;
			}
public BenefitsParametersPage enterStartDate_26(WebDriver driver,String StartDate_26) {
		            BrowserActions.type(driver, inpStartDate_26,StartDate_26, "StartDate_26");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_59(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_59,"EndDateDateIcon_59");
				    return this;
			}
public BenefitsParametersPage enterStartDate_20(WebDriver driver,String StartDate_20) {
		            BrowserActions.type(driver, inpStartDate_20,StartDate_20, "StartDate_20");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_53(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_53,"EndDateDateIcon_53");
				    return this;
			}
public BenefitsParametersPage enterEndDate_64(WebDriver driver,String EndDate_64) {
		            BrowserActions.type(driver, inpEndDate_64,EndDate_64, "EndDate_64");
			        return this;
           }
public BenefitsParametersPage enterComments_24(WebDriver driver,String Comments_24) {
		            BrowserActions.type(driver, inpComments_24,Comments_24, "Comments_24");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_9(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_9,"StartDateDateIcon_9");
				    return this;
			}
public BenefitsParametersPage enterComments_42(WebDriver driver,String Comments_42) {
		            BrowserActions.type(driver, inpComments_42,Comments_42, "Comments_42");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_25(WebDriver driver,String Jurisdiction_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_25,Jurisdiction_25,"Jurisdiction_25");
				    return this;
			}
public BenefitsParametersPage enterStartDate_14(WebDriver driver,String StartDate_14) {
		            BrowserActions.type(driver, inpStartDate_14,StartDate_14, "StartDate_14");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_27(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_27,"StartDateDateIcon_27");
				    return this;
			}
public BenefitsParametersPage clickEndDateDateIcon_47(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_47,"EndDateDateIcon_47");
				    return this;
			}
public BenefitsParametersPage enterEndDate_70(WebDriver driver,String EndDate_70) {
		            BrowserActions.type(driver, inpEndDate_70,EndDate_70, "EndDate_70");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_41(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_41,"EndDateDateIcon_41");
				    return this;
			}
public BenefitsParametersPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public BenefitsParametersPage selectJurisdiction_1(WebDriver driver,String Jurisdiction_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_1,Jurisdiction_1,"Jurisdiction_1");
				    return this;
			}
public BenefitsParametersPage enterComments_36(WebDriver driver,String Comments_36) {
		            BrowserActions.type(driver, inpComments_36,Comments_36, "Comments_36");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_19(WebDriver driver,String Jurisdiction_19)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_19,Jurisdiction_19,"Jurisdiction_19");
				    return this;
			}
public BenefitsParametersPage clickEndDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
				    return this;
			}
public BenefitsParametersPage enterStartDate_8(WebDriver driver,String StartDate_8) {
		            BrowserActions.type(driver, inpStartDate_8,StartDate_8, "StartDate_8");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_21(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_21,"StartDateDateIcon_21");
				    return this;
			}
public BenefitsParametersPage selectJurisdiction_7(WebDriver driver,String Jurisdiction_7)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_7,Jurisdiction_7,"Jurisdiction_7");
				    return this;
			}
public BenefitsParametersPage enterComments_6(WebDriver driver,String Comments_6) {
		            BrowserActions.type(driver, inpComments_6,Comments_6, "Comments_6");
			        return this;
           }
public BenefitsParametersPage enterStartDate_2(WebDriver driver,String StartDate_2) {
		            BrowserActions.type(driver, inpStartDate_2,StartDate_2, "StartDate_2");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_3(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_3,"StartDateDateIcon_3");
				    return this;
			}
public BenefitsParametersPage clickStartDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon,"StartDateDateIcon");
				    return this;
			}
public BenefitsParametersPage enterEndDate_76(WebDriver driver,String EndDate_76) {
		            BrowserActions.type(driver, inpEndDate_76,EndDate_76, "EndDate_76");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_73(WebDriver driver,String Jurisdiction_73)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_73,Jurisdiction_73,"Jurisdiction_73");
				    return this;
			}
public BenefitsParametersPage selectJurisdiction_79(WebDriver driver,String Jurisdiction_79)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_79,Jurisdiction_79,"Jurisdiction_79");
				    return this;
			}
public BenefitsParametersPage clickEndDateDateIcon_35(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_35,"EndDateDateIcon_35");
				    return this;
			}
public BenefitsParametersPage enterEndDate_82(WebDriver driver,String EndDate_82) {
		            BrowserActions.type(driver, inpEndDate_82,EndDate_82, "EndDate_82");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_39(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_39,"StartDateDateIcon_39");
				    return this;
			}
public BenefitsParametersPage clickEndDateDateIcon_5(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_5,"EndDateDateIcon_5");
				    return this;
			}
public BenefitsParametersPage clickStartDateDateIcon_33(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_33,"StartDateDateIcon_33");
				    return this;
			}
public BenefitsParametersPage enterStartDate_80(WebDriver driver,String StartDate_80) {
		            BrowserActions.type(driver, inpStartDate_80,StartDate_80, "StartDate_80");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_29(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_29,"EndDateDateIcon_29");
				    return this;
			}
public BenefitsParametersPage clickEndDateDateIcon_23(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_23,"EndDateDateIcon_23");
				    return this;
			}
public BenefitsParametersPage enterComments_18(WebDriver driver,String Comments_18) {
		            BrowserActions.type(driver, inpComments_18,Comments_18, "Comments_18");
			        return this;
           }
public BenefitsParametersPage enterComments_12(WebDriver driver,String Comments_12) {
		            BrowserActions.type(driver, inpComments_12,Comments_12, "Comments_12");
			        return this;
           }
public BenefitsParametersPage enterStartDate_74(WebDriver driver,String StartDate_74) {
		            BrowserActions.type(driver, inpStartDate_74,StartDate_74, "StartDate_74");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_45(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_45,"StartDateDateIcon_45");
				    return this;
			}
public BenefitsParametersPage enterComments(WebDriver driver,String Comments) {
		            BrowserActions.type(driver, inpComments,Comments, "Comments");
			        return this;
           }
public BenefitsParametersPage enterEndDate_10(WebDriver driver,String EndDate_10) {
		            BrowserActions.type(driver, inpEndDate_10,EndDate_10, "EndDate_10");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_17(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_17,"EndDateDateIcon_17");
				    return this;
			}
public BenefitsParametersPage enterComments_72(WebDriver driver,String Comments_72) {
		            BrowserActions.type(driver, inpComments_72,Comments_72, "Comments_72");
			        return this;
           }
public BenefitsParametersPage enterEndDate_16(WebDriver driver,String EndDate_16) {
		            BrowserActions.type(driver, inpEndDate_16,EndDate_16, "EndDate_16");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_55(WebDriver driver,String Jurisdiction_55)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_55,Jurisdiction_55,"Jurisdiction_55");
				    return this;
			}
public BenefitsParametersPage enterEndDate(WebDriver driver,String EndDate) {
		            BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
			        return this;
           }
public BenefitsParametersPage enterStartDate_68(WebDriver driver,String StartDate_68) {
		            BrowserActions.type(driver, inpStartDate_68,StartDate_68, "StartDate_68");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_49(WebDriver driver,String Jurisdiction_49)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_49,Jurisdiction_49,"Jurisdiction_49");
				    return this;
			}
public BenefitsParametersPage enterComments_66(WebDriver driver,String Comments_66) {
		            BrowserActions.type(driver, inpComments_66,Comments_66, "Comments_66");
			        return this;
           }
public BenefitsParametersPage clickEndDateDateIcon_11(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_11,"EndDateDateIcon_11");
				    return this;
			}
public BenefitsParametersPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public BenefitsParametersPage clickStartDateDateIcon_51(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_51,"StartDateDateIcon_51");
				    return this;
			}
public BenefitsParametersPage enterStartDate_62(WebDriver driver,String StartDate_62) {
		            BrowserActions.type(driver, inpStartDate_62,StartDate_62, "StartDate_62");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_57(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_57,"StartDateDateIcon_57");
				    return this;
			}
public BenefitsParametersPage selectJurisdiction_61(WebDriver driver,String Jurisdiction_61)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_61,Jurisdiction_61,"Jurisdiction_61");
				    return this;
			}
public BenefitsParametersPage enterEndDate_22(WebDriver driver,String EndDate_22) {
		            BrowserActions.type(driver, inpEndDate_22,EndDate_22, "EndDate_22");
			        return this;
           }
public BenefitsParametersPage enterComments_84(WebDriver driver,String Comments_84) {
		            BrowserActions.type(driver, inpComments_84,Comments_84, "Comments_84");
			        return this;
           }
public BenefitsParametersPage enterEndDate_28(WebDriver driver,String EndDate_28) {
		            BrowserActions.type(driver, inpEndDate_28,EndDate_28, "EndDate_28");
			        return this;
           }
public BenefitsParametersPage selectJurisdiction_67(WebDriver driver,String Jurisdiction_67)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_67,Jurisdiction_67,"Jurisdiction_67");
				    return this;
			}
public BenefitsParametersPage enterComments_78(WebDriver driver,String Comments_78) {
		            BrowserActions.type(driver, inpComments_78,Comments_78, "Comments_78");
			        return this;
           }
public BenefitsParametersPage enterStartDate_56(WebDriver driver,String StartDate_56) {
		            BrowserActions.type(driver, inpStartDate_56,StartDate_56, "StartDate_56");
			        return this;
           }
public BenefitsParametersPage enterStartDate_50(WebDriver driver,String StartDate_50) {
		            BrowserActions.type(driver, inpStartDate_50,StartDate_50, "StartDate_50");
			        return this;
           }
public BenefitsParametersPage clickStartDateDateIcon_63(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_63,"StartDateDateIcon_63");
				    return this;
			}
public BenefitsParametersPage clickEndDateDateIcon_83(WebDriver driver)  {
					BrowserActions.click(driver, btnEndDateDateIcon_83,"EndDateDateIcon_83");
				    return this;
			}
public BenefitsParametersPage clickStartDateDateIcon_69(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateDateIcon_69,"StartDateDateIcon_69");
				    return this;
			}

public void verifyStartDateIsDisplayed(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblStartDate,"Start Date");
}

public void verifyEndDateIsDisplayed(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblEndDate,"Start Date");
}

public void verifyJurisdictionIsDisplayed(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblJurisdiction,"Jurisdiction");
}

public void verifyCommentIsDisplayed(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblComment,"Comment");
}

public void clickJurisdictionCheckBox(WebDriver driver,String jurisdiction) {
	
	if(lblLastPageNo.size()>0) {
	String pageNo=lblLastPageNo.get(0).getText();
	String num=pageNo.replaceAll("[^0-9]","");
	int no=Integer.parseInt(num);
	for(int i=1;i<=no;i++) {
		BrowserActions.waitForNetworkIdleState(driver,1 );
		By jurisdictionBy = By.xpath("//div[text()='"+jurisdiction+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		int size = BrowserActions.getWebElementSize(driver, jurisdictionBy, "jurisdictionBy",0.5);
		if (size > 0) {
			By userJurisdictionBy = By.xpath("//div[text()='"+jurisdiction+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
			BrowserActions.waitForElementToDisplay(driver, userJurisdictionBy, "user jurisdication");
			WebElement userJurisdiction = userJurisdictionBy.findElement(driver);
			BrowserActions.click(driver, userJurisdiction, "Check box");
			break;
		}
		else {
			BrowserActions.click(driver, btnNextArrow,"Next Button");
		}
	}}
	else
	{
		By userJurisdictionBy = By.xpath("//div[text()='"+jurisdiction+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, userJurisdictionBy, "user jurisdication");
		WebElement userJurisdiction = userJurisdictionBy.findElement(driver);
		BrowserActions.click(driver, userJurisdiction, "Check box");
	}
}

public void verifyAddedJurisdictionIsDisplayed(WebDriver driver, String jurisdiction) {
	if(lblLastPageNo.size()>0) {
			String pageNo=lblLastPageNo.get(0).getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
					for(int i=1;i<=no;i++)
						{
						By jurisdictionName = By.xpath("//div[text()='"+jurisdiction+"']");
						int size = BrowserActions.getWebElementSize(driver, jurisdictionName, "jurisdiction Name", 0.5);
						if (size > 0) {
							By addesJurisdictionBy= By.xpath("//div[text()='"+jurisdiction+"']");
							BrowserActions.waitForElementToDisplay(driver, addesJurisdictionBy, jurisdiction);
							WebElement addesJurisdiction = addesJurisdictionBy.findElement(driver);
							Log.assertThat(addesJurisdiction.isDisplayed(), "Added jurisdiction is Displayed", "Added jurisdiction is not displayed");
							break;
						}
						else {
							BrowserActions.click(driver, btnNextArrow,"Next Button");
						}

					}
	
	
	}
	else {
		By addesJurisdictionBy= By.xpath("//div[text()='"+jurisdiction+"']");
		BrowserActions.waitForElementToDisplay(driver, addesJurisdictionBy, jurisdiction);
		WebElement addesJurisdiction = addesJurisdictionBy.findElement(driver);
		Log.assertThat(addesJurisdiction.isDisplayed(), "Added jurisdiction is Displayed", "Added jurisdiction is not displayed");
	}
}




}
