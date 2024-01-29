package com.aspire.guidewire.cc.pages.nonlob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class ExposuresPage extends LoadableComponent<ExposuresPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public DesktopExposures desktopexposuresTable;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-4-Claimant']", AI = false)
	private WebElement inpClaimant_27;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-6-Status']", AI = false)
	private WebElement drpStatus_42;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-2-Order']", AI = false)
	private WebElement inpOrder_10;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-3-Claimant']", AI = false)
	private WebElement inpClaimant_20;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-1-Coverage']", AI = false)
	private WebElement drpCoverage_5;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-7-Status']", AI = false)
	private WebElement drpStatus_49;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-2-Claimant']", AI = false)
	private WebElement inpClaimant_13;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-5-Status']", AI = false)
	private WebElement drpStatus_35;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-0-Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-3-Status']", AI = false)
	private WebElement drpStatus_21;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-5-Order']", AI = false)
	private WebElement inpOrder_31;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-3-Type']", AI = false)
	private WebElement drpType_18;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-1-Order']", AI = false)
	private WebElement inpOrder_3;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-2-Type']", AI = false)
	private WebElement drpType_11;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-4-Coverage']", AI = false)
	private WebElement drpCoverage_26;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-4-Status']", AI = false)
	private WebElement drpStatus_28;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-0-CaseID']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-1-Type']", AI = false)
	private WebElement drpType_4;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-2-Status']", AI = false)
	private WebElement drpStatus_14;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-4-Order']", AI = false)
	private WebElement inpOrder_24;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-4-Type']", AI = false)
	private WebElement drpType_25;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-7-WorkloadWeight']", AI = false)
	private WebElement inpWeight_50;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-3-Coverage']", AI = false)
	private WebElement drpCoverage_19;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-0-Coverage']", AI = false)
	private WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-2-Coverage']", AI = false)
	private WebElement drpCoverage_12;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-3-Order']", AI = false)
	private WebElement inpOrder_17;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-0-WorkloadWeight']", AI = false)
	private WebElement inpWeight;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-1-Status']", AI = false)
	private WebElement drpStatus_7;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-6-Type']", AI = false)
	private WebElement drpType_39;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-6-WorkloadWeight']", AI = false)
	private WebElement inpWeight_43;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-1-WorkloadWeight']", AI = false)
	private WebElement inpWeight_8;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-5-Type']", AI = false)
	private WebElement drpType_32;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-6-CaseID']", AI = false)
	private WebElement inpClaim_37;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-2-CaseID']", AI = false)
	private WebElement inpClaim_9;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-5-CaseID']", AI = false)
	private WebElement inpClaim_30;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-7-Coverage']", AI = false)
	private WebElement drpCoverage_47;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-1-CaseID']", AI = false)
	private WebElement inpClaim_2;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-6-Coverage']", AI = false)
	private WebElement drpCoverage_40;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-5-WorkloadWeight']", AI = false)
	private WebElement inpWeight_36;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-7-Order']", AI = false)
	private WebElement inpOrder_45;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-7-Type']", AI = false)
	private WebElement drpType_46;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-7-CaseID']", AI = false)
	private WebElement inpClaim_44;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-6-Order']", AI = false)
	private WebElement inpOrder_38;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-5-Coverage']", AI = false)
	private WebElement drpCoverage_33;

	@IFindBy(how = How.CSS, using = "#DesktopExposures-DesktopExposuresScreen-DesktopExposures_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-4-WorkloadWeight']", AI = false)
	private WebElement inpWeight_29;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-3-WorkloadWeight']", AI = false)
	private WebElement inpWeight_22;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-7-Claimant']", AI = false)
	private WebElement inpClaimant_48;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-6-Claimant']", AI = false)
	private WebElement inpClaimant_41;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-3-CaseID']", AI = false)
	private WebElement inpClaim_16;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-0-Order']", AI = false)
	private WebElement inpOrder;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-0-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-2-WorkloadWeight']", AI = false)
	private WebElement inpWeight_15;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-DesktopExposuresFilter']", AI = false)
	private WebElement drpDesktopExposuresFilter;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-5-Claimant']", AI = false)
	private WebElement inpClaimant_34;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-0-Claimant']", AI = false)
	private WebElement inpClaimant;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-1-Claimant']", AI = false)
	private WebElement inpClaimant_6;

	@IFindBy(how = How.CSS, using = "input[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-4-CaseID']", AI = false)
	private WebElement inpClaim_23;

	@IFindBy(how = How.CSS, using = "#DesktopExposures-DesktopExposuresScreen-DesktopExposures_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "select[name='DesktopExposures-DesktopExposuresScreen-DesktopExposuresLV-DesktopExposuresFilter']", AI = false)
	private WebElement drpDesktopExposuresFilter_1;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopExposuresScreen-0']", AI = false)
	private WebElement lblTtlBar;
	
	@IFindBy(how = How.CSS, using = "input[name$='DesktopExposuresLV-0-_Checkbox']", AI = false)
	private WebElement rbtnClaim;

	public ExposuresPage(){
	}

	public ExposuresPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//desktopexposuresTable = new DesktopExposures();
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
}public ExposuresPage enterClaimant_27(WebDriver driver,String Claimant_27) {
		            BrowserActions.type(driver, inpClaimant_27,Claimant_27, "Claimant_27");
			        return this;
           }
public ExposuresPage selectStatus_42(WebDriver driver,String Status_42)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_42,Status_42,"Status_42");
				    return this;
			}
public ExposuresPage enterOrder_10(WebDriver driver,String Order_10) {
		            BrowserActions.type(driver, inpOrder_10,Order_10, "Order_10");
			        return this;
           }
public ExposuresPage enterClaimant_20(WebDriver driver,String Claimant_20) {
		            BrowserActions.type(driver, inpClaimant_20,Claimant_20, "Claimant_20");
			        return this;
           }
public ExposuresPage selectCoverage_5(WebDriver driver,String Coverage_5)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_5,Coverage_5,"Coverage_5");
				    return this;
			}
public ExposuresPage selectStatus_49(WebDriver driver,String Status_49)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_49,Status_49,"Status_49");
				    return this;
			}
public ExposuresPage enterClaimant_13(WebDriver driver,String Claimant_13) {
		            BrowserActions.type(driver, inpClaimant_13,Claimant_13, "Claimant_13");
			        return this;
           }
public ExposuresPage selectStatus_35(WebDriver driver,String Status_35)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_35,Status_35,"Status_35");
				    return this;
			}
public ExposuresPage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public ExposuresPage selectStatus_21(WebDriver driver,String Status_21)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_21,Status_21,"Status_21");
				    return this;
			}
public ExposuresPage enterOrder_31(WebDriver driver,String Order_31) {
		            BrowserActions.type(driver, inpOrder_31,Order_31, "Order_31");
			        return this;
           }
public ExposuresPage selectType_18(WebDriver driver,String Type_18)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_18,Type_18,"Type_18");
				    return this;
			}
public ExposuresPage enterOrder_3(WebDriver driver,String Order_3) {
		            BrowserActions.type(driver, inpOrder_3,Order_3, "Order_3");
			        return this;
           }
public ExposuresPage selectType_11(WebDriver driver,String Type_11)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_11,Type_11,"Type_11");
				    return this;
			}
public ExposuresPage selectCoverage_26(WebDriver driver,String Coverage_26)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_26,Coverage_26,"Coverage_26");
				    return this;
			}
public ExposuresPage selectStatus_28(WebDriver driver,String Status_28)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_28,Status_28,"Status_28");
				    return this;
			}
public ExposuresPage enterClaim(WebDriver driver,String Claim) {
		            BrowserActions.type(driver, inpClaim,Claim, "Claim");
			        return this;
           }
public ExposuresPage selectType_4(WebDriver driver,String Type_4)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_4,Type_4,"Type_4");
				    return this;
			}
public ExposuresPage selectStatus_14(WebDriver driver,String Status_14)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_14,Status_14,"Status_14");
				    return this;
			}
public ExposuresPage enterOrder_24(WebDriver driver,String Order_24) {
		            BrowserActions.type(driver, inpOrder_24,Order_24, "Order_24");
			        return this;
           }
public ExposuresPage selectType_25(WebDriver driver,String Type_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_25,Type_25,"Type_25");
				    return this;
			}
public ExposuresPage enterWeight_50(WebDriver driver,String Weight_50) {
		            BrowserActions.type(driver, inpWeight_50,Weight_50, "Weight_50");
			        return this;
           }
public ExposuresPage selectCoverage_19(WebDriver driver,String Coverage_19)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_19,Coverage_19,"Coverage_19");
				    return this;
			}
public ExposuresPage selectCoverage(WebDriver driver,String Coverage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
				    return this;
			}
public ExposuresPage selectCoverage_12(WebDriver driver,String Coverage_12)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_12,Coverage_12,"Coverage_12");
				    return this;
			}
public ExposuresPage enterOrder_17(WebDriver driver,String Order_17) {
		            BrowserActions.type(driver, inpOrder_17,Order_17, "Order_17");
			        return this;
           }
public ExposuresPage enterWeight(WebDriver driver,String Weight) {
		            BrowserActions.type(driver, inpWeight,Weight, "Weight");
			        return this;
           }
public ExposuresPage selectStatus_7(WebDriver driver,String Status_7)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_7,Status_7,"Status_7");
				    return this;
			}
public ExposuresPage selectType_39(WebDriver driver,String Type_39)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_39,Type_39,"Type_39");
				    return this;
			}
public ExposuresPage enterWeight_43(WebDriver driver,String Weight_43) {
		            BrowserActions.type(driver, inpWeight_43,Weight_43, "Weight_43");
			        return this;
           }
public ExposuresPage enterWeight_8(WebDriver driver,String Weight_8) {
		            BrowserActions.type(driver, inpWeight_8,Weight_8, "Weight_8");
			        return this;
           }
public ExposuresPage selectType_32(WebDriver driver,String Type_32)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_32,Type_32,"Type_32");
				    return this;
			}
public ExposuresPage enterClaim_37(WebDriver driver,String Claim_37) {
		            BrowserActions.type(driver, inpClaim_37,Claim_37, "Claim_37");
			        return this;
           }
public ExposuresPage enterClaim_9(WebDriver driver,String Claim_9) {
		            BrowserActions.type(driver, inpClaim_9,Claim_9, "Claim_9");
			        return this;
           }
public ExposuresPage enterClaim_30(WebDriver driver,String Claim_30) {
		            BrowserActions.type(driver, inpClaim_30,Claim_30, "Claim_30");
			        return this;
           }
public ExposuresPage selectCoverage_47(WebDriver driver,String Coverage_47)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_47,Coverage_47,"Coverage_47");
				    return this;
			}
public ExposuresPage enterClaim_2(WebDriver driver,String Claim_2) {
		            BrowserActions.type(driver, inpClaim_2,Claim_2, "Claim_2");
			        return this;
           }
public ExposuresPage selectCoverage_40(WebDriver driver,String Coverage_40)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_40,Coverage_40,"Coverage_40");
				    return this;
			}
public ExposuresPage enterWeight_36(WebDriver driver,String Weight_36) {
		            BrowserActions.type(driver, inpWeight_36,Weight_36, "Weight_36");
			        return this;
           }
public ExposuresPage enterOrder_45(WebDriver driver,String Order_45) {
		            BrowserActions.type(driver, inpOrder_45,Order_45, "Order_45");
			        return this;
           }
public ExposuresPage selectType_46(WebDriver driver,String Type_46)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_46,Type_46,"Type_46");
				    return this;
			}
public ExposuresPage enterClaim_44(WebDriver driver,String Claim_44) {
		            BrowserActions.type(driver, inpClaim_44,Claim_44, "Claim_44");
			        return this;
           }
public ExposuresPage enterOrder_38(WebDriver driver,String Order_38) {
		            BrowserActions.type(driver, inpOrder_38,Order_38, "Order_38");
			        return this;
           }
public ExposuresPage selectCoverage_33(WebDriver driver,String Coverage_33)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_33,Coverage_33,"Coverage_33");
				    return this;
			}
public ExposuresPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
public ExposuresPage enterWeight_29(WebDriver driver,String Weight_29) {
		            BrowserActions.type(driver, inpWeight_29,Weight_29, "Weight_29");
			        return this;
           }
public ExposuresPage enterWeight_22(WebDriver driver,String Weight_22) {
		            BrowserActions.type(driver, inpWeight_22,Weight_22, "Weight_22");
			        return this;
           }
public ExposuresPage enterClaimant_48(WebDriver driver,String Claimant_48) {
		            BrowserActions.type(driver, inpClaimant_48,Claimant_48, "Claimant_48");
			        return this;
           }
public ExposuresPage enterClaimant_41(WebDriver driver,String Claimant_41) {
		            BrowserActions.type(driver, inpClaimant_41,Claimant_41, "Claimant_41");
			        return this;
           }
public ExposuresPage enterClaim_16(WebDriver driver,String Claim_16) {
		            BrowserActions.type(driver, inpClaim_16,Claim_16, "Claim_16");
			        return this;
           }
public ExposuresPage enterOrder(WebDriver driver,String Order) {
		            BrowserActions.type(driver, inpOrder,Order, "Order");
			        return this;
           }
public ExposuresPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public ExposuresPage enterWeight_15(WebDriver driver,String Weight_15) {
		            BrowserActions.type(driver, inpWeight_15,Weight_15, "Weight_15");
			        return this;
           }
public ExposuresPage selectDesktopExposuresFilter(WebDriver driver,String DesktopExposuresFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDesktopExposuresFilter,DesktopExposuresFilter,"DesktopExposuresFilter");
				    return this;
			}
public ExposuresPage enterClaimant_34(WebDriver driver,String Claimant_34) {
		            BrowserActions.type(driver, inpClaimant_34,Claimant_34, "Claimant_34");
			        return this;
           }
public ExposuresPage enterClaimant(WebDriver driver,String Claimant) {
		            BrowserActions.type(driver, inpClaimant,Claimant, "Claimant");
			        return this;
           }
public ExposuresPage enterClaimant_6(WebDriver driver,String Claimant_6) {
		            BrowserActions.type(driver, inpClaimant_6,Claimant_6, "Claimant_6");
			        return this;
           }
public ExposuresPage enterClaim_23(WebDriver driver,String Claim_23) {
		            BrowserActions.type(driver, inpClaim_23,Claim_23, "Claim_23");
			        return this;
           }
public AssignPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return new AssignPage(driver).get();
			}
public ExposuresPage selectDesktopExposuresFilter_1(WebDriver driver,String DesktopExposuresFilter_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDesktopExposuresFilter_1,DesktopExposuresFilter_1,"DesktopExposuresFilter_1");
				    return this;
			}
public ExposuresPage clickClaim(WebDriver driver)  {
	BrowserActions.click(driver, rbtnClaim,"Claim");
	return this;
}
}
