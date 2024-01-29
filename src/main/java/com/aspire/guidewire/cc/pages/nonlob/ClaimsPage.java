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

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class ClaimsPage extends LoadableComponent<ClaimsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public DesktopClaims desktopclaimsTable;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-PolicyID']", AI = false)
	private WebElement inpPolicy_64;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-DesktopClaimsFilter']", AI = false)
	private WebElement drpDesktopClaimsFilter_1;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-Status']", AI = false)
	private WebElement drpStatus_46;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-Flagged']", AI = false)
	private WebElement rdbFlagged_14;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-InjuredWorker']", AI = false)
	private WebElement inpInjuredWorker;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-JurisdictionState']", AI = false)
	private WebElement drpState_25;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-LOBCode']", AI = false)
	private WebElement drpLOB_60;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-Insured']", AI = false)
	private WebElement inpInsured_41;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-LOBCode']", AI = false)
	private WebElement drpLOB;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-LOBCode']", AI = false)
	private WebElement drpLOB_48;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-Insured']", AI = false)
	private WebElement inpInsured_29;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-Status']", AI = false)
	private WebElement drpStatus_34;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-Workload']", AI = false)
	private WebElement inpWeight_71;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-InjuredWorker']", AI = false)
	private WebElement inpInjuredWorker_30;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-JurisdictionState']", AI = false)
	private WebElement drpState_13;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-Claimant']", AI = false)
	private WebElement inpClaimant_19;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-LossDate']", AI = false)
	private WebElement inpLossDate_20;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-Status']", AI = false)
	private WebElement drpStatus_22;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-LOBCode']", AI = false)
	private WebElement drpLOB_36;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_69;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-Flagged']", AI = false)
	private WebElement rdbFlagged_38;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-claimID']", AI = false)
	private WebElement inpClaim_51;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-claimID']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-Workload']", AI = false)
	private WebElement inpWeight_59;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-PolicyID']", AI = false)
	private WebElement inpPolicy_52;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-Insured']", AI = false)
	private WebElement inpInsured_65;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-LOBCode']", AI = false)
	private WebElement drpLOB_24;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-Status']", AI = false)
	private WebElement drpStatus_10;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-Insured']", AI = false)
	private WebElement inpInsured_5;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-Flagged']", AI = false)
	private WebElement rdbFlagged_26;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-JurisdictionState']", AI = false)
	private WebElement drpState_73;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-JurisdictionState']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-InjuredWorker']", AI = false)
	private WebElement inpInjuredWorker_18;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-claimID']", AI = false)
	private WebElement inpClaim_63;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-Insured']", AI = false)
	private WebElement inpInsured_53;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-Workload']", AI = false)
	private WebElement inpWeight;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-Flagged']", AI = false)
	private WebElement rdbFlagged_50;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_45;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-Workload']", AI = false)
	private WebElement inpWeight_47;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-Claimant']", AI = false)
	private WebElement inpClaimant_67;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-LOBCode']", AI = false)
	private WebElement drpLOB_12;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-DesktopClaimsFilter']", AI = false)
	private WebElement drpDesktopClaimsFilter;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-claimID']", AI = false)
	private WebElement inpClaim_39;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-PolicyID']", AI = false)
	private WebElement inpPolicy_28;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-JurisdictionState']", AI = false)
	private WebElement drpState_61;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-Insured']", AI = false)
	private WebElement inpInsured;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-InjuredWorker']", AI = false)
	private WebElement inpInjuredWorker_66;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-claimID']", AI = false)
	private WebElement inpClaim_3;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-LossDate']", AI = false)
	private WebElement inpLossDate_56;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-PolicyID']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-Workload']", AI = false)
	private WebElement inpWeight_35;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_57;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-Flagged']", AI = false)
	private WebElement rdbFlagged;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-Claimant']", AI = false)
	private WebElement inpClaimant_55;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-Status']", AI = false)
	private WebElement drpStatus_70;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-PolicyID']", AI = false)
	private WebElement inpPolicy_4;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-LossDate']", AI = false)
	private WebElement inpLossDate_68;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaims_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-InjuredWorker']", AI = false)
	private WebElement inpInjuredWorker_6;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-PolicyID']", AI = false)
	private WebElement inpPolicy_40;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-Workload']", AI = false)
	private WebElement inpWeight_23;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_21;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-Insured']", AI = false)
	private WebElement inpInsured_17;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-Claimant']", AI = false)
	private WebElement inpClaimant_43;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-InjuredWorker']", AI = false)
	private WebElement inpInjuredWorker_42;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-claimID']", AI = false)
	private WebElement inpClaim_15;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-JurisdictionState']", AI = false)
	private WebElement drpState_49;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-LossDate']", AI = false)
	private WebElement inpLossDate;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-LossDate']", AI = false)
	private WebElement inpLossDate_32;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-Workload']", AI = false)
	private WebElement inpWeight_11;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-Flagged']", AI = false)
	private WebElement rdbFlagged_2;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-Flagged']", AI = false)
	private WebElement rdbFlagged_62;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_33;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-Status']", AI = false)
	private WebElement drpStatus_58;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-2-PolicyID']", AI = false)
	private WebElement inpPolicy_16;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-Claimant']", AI = false)
	private WebElement inpClaimant_31;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-0-Claimant']", AI = false)
	private WebElement inpClaimant;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-Claimant']", AI = false)
	private WebElement inpClaimant_7;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-claimID']", AI = false)
	private WebElement inpClaim_27;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-5-InjuredWorker']", AI = false)
	private WebElement inpInjuredWorker_54;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-LossDate']", AI = false)
	private WebElement inpLossDate_8;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-3-JurisdictionState']", AI = false)
	private WebElement drpState_37;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaims_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "#DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-1-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon_9;

	@IFindBy(how = How.CSS, using = "select[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-6-LOBCode']", AI = false)
	private WebElement drpLOB_72;

	@IFindBy(how = How.CSS, using = "input[name='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4-LossDate']", AI = false)
	private WebElement inpLossDate_44;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopClaims-DesktopClaimsScreen-0']", AI = false)
	private WebElement lblttlbar;
	
	@IFindBy(how = How.CSS, using = "input[name$='DesktopClaimsLV-0-_Checkbox']", AI = false)
	private WebElement rbtnClaims;
	
	
	
	

	public ClaimsPage(){
	}

	public ClaimsPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//desktopclaimsTable = new DesktopClaims();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblttlbar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public ClaimsPage enterPolicy_64(WebDriver driver,String Policy_64) {
		            BrowserActions.type(driver, inpPolicy_64,Policy_64, "Policy_64");
			        return this;
           }
public ClaimsPage selectDesktopClaimsFilter_1(WebDriver driver,String DesktopClaimsFilter_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDesktopClaimsFilter_1,DesktopClaimsFilter_1,"DesktopClaimsFilter_1");
				    return this;
			}
public ClaimsPage selectStatus_46(WebDriver driver,String Status_46)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_46,Status_46,"Status_46");
				    return this;
			}
public ClaimsPage clickFlagged_14(WebDriver driver)  {
					BrowserActions.click(driver, rdbFlagged_14,"Flagged_14");
				    return this;
			}
public ClaimsPage enterInjuredWorker(WebDriver driver,String InjuredWorker) {
		            BrowserActions.type(driver, inpInjuredWorker,InjuredWorker, "InjuredWorker");
			        return this;
           }
public ClaimsPage selectState_25(WebDriver driver,String State_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_25,State_25,"State_25");
				    return this;
			}
public ClaimsPage selectLOB_60(WebDriver driver,String LOB_60)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_60,LOB_60,"LOB_60");
				    return this;
			}
public ClaimsPage enterInsured_41(WebDriver driver,String Insured_41) {
		            BrowserActions.type(driver, inpInsured_41,Insured_41, "Insured_41");
			        return this;
           }
public ClaimsPage selectLOB(WebDriver driver,String LOB)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB,LOB,"LOB");
				    return this;
			}
public ClaimsPage selectLOB_48(WebDriver driver,String LOB_48)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_48,LOB_48,"LOB_48");
				    return this;
			}
public ClaimsPage enterInsured_29(WebDriver driver,String Insured_29) {
		            BrowserActions.type(driver, inpInsured_29,Insured_29, "Insured_29");
			        return this;
           }
public ClaimsPage selectStatus_34(WebDriver driver,String Status_34)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_34,Status_34,"Status_34");
				    return this;
			}
public ClaimsPage enterWeight_71(WebDriver driver,String Weight_71) {
		            BrowserActions.type(driver, inpWeight_71,Weight_71, "Weight_71");
			        return this;
           }
public ClaimsPage enterInjuredWorker_30(WebDriver driver,String InjuredWorker_30) {
		            BrowserActions.type(driver, inpInjuredWorker_30,InjuredWorker_30, "InjuredWorker_30");
			        return this;
           }
public ClaimsPage selectState_13(WebDriver driver,String State_13)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_13,State_13,"State_13");
				    return this;
			}
public ClaimsPage enterClaimant_19(WebDriver driver,String Claimant_19) {
		            BrowserActions.type(driver, inpClaimant_19,Claimant_19, "Claimant_19");
			        return this;
           }
public ClaimsPage enterLossDate_20(WebDriver driver,String LossDate_20) {
		            BrowserActions.type(driver, inpLossDate_20,LossDate_20, "LossDate_20");
			        return this;
           }
public ClaimsPage selectStatus_22(WebDriver driver,String Status_22)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_22,Status_22,"Status_22");
				    return this;
			}
public ClaimsPage selectLOB_36(WebDriver driver,String LOB_36)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_36,LOB_36,"LOB_36");
				    return this;
			}
public ClaimsPage clickLossDateDateIcon_69(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon_69,"LossDateDateIcon_69");
				    return this;
			}
public ClaimsPage clickFlagged_38(WebDriver driver)  {
					BrowserActions.click(driver, rdbFlagged_38,"Flagged_38");
				    return this;
			}
public ClaimsPage enterClaim_51(WebDriver driver,String Claim_51) {
		            BrowserActions.type(driver, inpClaim_51,Claim_51, "Claim_51");
			        return this;
           }
public ClaimsPage clickLossDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon,"LossDateDateIcon");
				    return this;
			}
public ClaimsPage enterClaim(WebDriver driver,String Claim) {
		            BrowserActions.type(driver, inpClaim,Claim, "Claim");
			        return this;
           }
public ClaimsPage enterWeight_59(WebDriver driver,String Weight_59) {
		            BrowserActions.type(driver, inpWeight_59,Weight_59, "Weight_59");
			        return this;
           }
public ClaimsPage enterPolicy_52(WebDriver driver,String Policy_52) {
		            BrowserActions.type(driver, inpPolicy_52,Policy_52, "Policy_52");
			        return this;
           }
public ClaimsPage enterInsured_65(WebDriver driver,String Insured_65) {
		            BrowserActions.type(driver, inpInsured_65,Insured_65, "Insured_65");
			        return this;
           }
public ClaimsPage selectLOB_24(WebDriver driver,String LOB_24)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_24,LOB_24,"LOB_24");
				    return this;
			}
public ClaimsPage selectStatus_10(WebDriver driver,String Status_10)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_10,Status_10,"Status_10");
				    return this;
			}
public ClaimsPage enterInsured_5(WebDriver driver,String Insured_5) {
		            BrowserActions.type(driver, inpInsured_5,Insured_5, "Insured_5");
			        return this;
           }
public ClaimsPage clickFlagged_26(WebDriver driver)  {
					BrowserActions.click(driver, rdbFlagged_26,"Flagged_26");
				    return this;
			}
public ClaimsPage selectState_73(WebDriver driver,String State_73)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_73,State_73,"State_73");
				    return this;
			}
public ClaimsPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public ClaimsPage enterInjuredWorker_18(WebDriver driver,String InjuredWorker_18) {
		            BrowserActions.type(driver, inpInjuredWorker_18,InjuredWorker_18, "InjuredWorker_18");
			        return this;
           }
public ClaimsPage enterClaim_63(WebDriver driver,String Claim_63) {
		            BrowserActions.type(driver, inpClaim_63,Claim_63, "Claim_63");
			        return this;
           }
public ClaimsPage enterInsured_53(WebDriver driver,String Insured_53) {
		            BrowserActions.type(driver, inpInsured_53,Insured_53, "Insured_53");
			        return this;
           }
public ClaimsPage enterWeight(WebDriver driver,String Weight) {
		            BrowserActions.type(driver, inpWeight,Weight, "Weight");
			        return this;
           }
public ClaimsPage clickFlagged_50(WebDriver driver)  {
					BrowserActions.click(driver, rdbFlagged_50,"Flagged_50");
				    return this;
			}
public ClaimsPage clickLossDateDateIcon_45(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon_45,"LossDateDateIcon_45");
				    return this;
			}
public ClaimsPage enterWeight_47(WebDriver driver,String Weight_47) {
		            BrowserActions.type(driver, inpWeight_47,Weight_47, "Weight_47");
			        return this;
           }
public ClaimsPage enterClaimant_67(WebDriver driver,String Claimant_67) {
		            BrowserActions.type(driver, inpClaimant_67,Claimant_67, "Claimant_67");
			        return this;
           }
public ClaimsPage selectLOB_12(WebDriver driver,String LOB_12)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_12,LOB_12,"LOB_12");
				    return this;
			}
public ClaimsPage selectDesktopClaimsFilter(WebDriver driver,String DesktopClaimsFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDesktopClaimsFilter,DesktopClaimsFilter,"DesktopClaimsFilter");
				    return this;
			}
public ClaimsPage enterClaim_39(WebDriver driver,String Claim_39) {
		            BrowserActions.type(driver, inpClaim_39,Claim_39, "Claim_39");
			        return this;
           }
public ClaimsPage enterPolicy_28(WebDriver driver,String Policy_28) {
		            BrowserActions.type(driver, inpPolicy_28,Policy_28, "Policy_28");
			        return this;
           }
public ClaimsPage selectState_61(WebDriver driver,String State_61)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_61,State_61,"State_61");
				    return this;
			}
public ClaimsPage enterInsured(WebDriver driver,String Insured) {
		            BrowserActions.type(driver, inpInsured,Insured, "Insured");
			        return this;
           }
public ClaimsPage enterInjuredWorker_66(WebDriver driver,String InjuredWorker_66) {
		            BrowserActions.type(driver, inpInjuredWorker_66,InjuredWorker_66, "InjuredWorker_66");
			        return this;
           }
public ClaimsPage enterClaim_3(WebDriver driver,String Claim_3) {
		            BrowserActions.type(driver, inpClaim_3,Claim_3, "Claim_3");
			        return this;
           }
public ClaimsPage enterLossDate_56(WebDriver driver,String LossDate_56) {
		            BrowserActions.type(driver, inpLossDate_56,LossDate_56, "LossDate_56");
			        return this;
           }
public ClaimsPage enterPolicy(WebDriver driver,String Policy) {
		            BrowserActions.type(driver, inpPolicy,Policy, "Policy");
			        return this;
           }
public ClaimsPage enterWeight_35(WebDriver driver,String Weight_35) {
		            BrowserActions.type(driver, inpWeight_35,Weight_35, "Weight_35");
			        return this;
           }
public ClaimsPage clickLossDateDateIcon_57(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon_57,"LossDateDateIcon_57");
				    return this;
			}
public ClaimsPage clickFlagged(WebDriver driver)  {
					BrowserActions.click(driver, rdbFlagged,"Flagged");
				    return this;
			}
public ClaimsPage enterClaimant_55(WebDriver driver,String Claimant_55) {
		            BrowserActions.type(driver, inpClaimant_55,Claimant_55, "Claimant_55");
			        return this;
           }
public ClaimsPage selectStatus_70(WebDriver driver,String Status_70)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_70,Status_70,"Status_70");
				    return this;
			}
public ClaimsPage enterPolicy_4(WebDriver driver,String Policy_4) {
		            BrowserActions.type(driver, inpPolicy_4,Policy_4, "Policy_4");
			        return this;
           }
public ClaimsPage enterLossDate_68(WebDriver driver,String LossDate_68) {
		            BrowserActions.type(driver, inpLossDate_68,LossDate_68, "LossDate_68");
			        return this;
           }
public PrintExportOptionsPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return new PrintExportOptionsPage(driver).get();
			}
public ClaimsPage enterInjuredWorker_6(WebDriver driver,String InjuredWorker_6) {
		            BrowserActions.type(driver, inpInjuredWorker_6,InjuredWorker_6, "InjuredWorker_6");
			        return this;
           }
public ClaimsPage enterPolicy_40(WebDriver driver,String Policy_40) {
		            BrowserActions.type(driver, inpPolicy_40,Policy_40, "Policy_40");
			        return this;
           }
public ClaimsPage enterWeight_23(WebDriver driver,String Weight_23) {
		            BrowserActions.type(driver, inpWeight_23,Weight_23, "Weight_23");
			        return this;
           }
public ClaimsPage clickLossDateDateIcon_21(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon_21,"LossDateDateIcon_21");
				    return this;
			}
public ClaimsPage enterInsured_17(WebDriver driver,String Insured_17) {
		            BrowserActions.type(driver, inpInsured_17,Insured_17, "Insured_17");
			        return this;
           }
public ClaimsPage enterClaimant_43(WebDriver driver,String Claimant_43) {
		            BrowserActions.type(driver, inpClaimant_43,Claimant_43, "Claimant_43");
			        return this;
           }
public ClaimsPage enterInjuredWorker_42(WebDriver driver,String InjuredWorker_42) {
		            BrowserActions.type(driver, inpInjuredWorker_42,InjuredWorker_42, "InjuredWorker_42");
			        return this;
           }
public ClaimsPage enterClaim_15(WebDriver driver,String Claim_15) {
		            BrowserActions.type(driver, inpClaim_15,Claim_15, "Claim_15");
			        return this;
           }
public ClaimsPage selectState_49(WebDriver driver,String State_49)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_49,State_49,"State_49");
				    return this;
			}
public ClaimsPage enterLossDate(WebDriver driver,String LossDate) {
		            BrowserActions.type(driver, inpLossDate,LossDate, "LossDate");
			        return this;
           }
public ClaimsPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public ClaimsPage enterLossDate_32(WebDriver driver,String LossDate_32) {
		            BrowserActions.type(driver, inpLossDate_32,LossDate_32, "LossDate_32");
			        return this;
           }
public ClaimsPage enterWeight_11(WebDriver driver,String Weight_11) {
		            BrowserActions.type(driver, inpWeight_11,Weight_11, "Weight_11");
			        return this;
           }
public ClaimsPage clickFlagged_2(WebDriver driver)  {
					BrowserActions.click(driver, rdbFlagged_2,"Flagged_2");
				    return this;
			}
public ClaimsPage clickFlagged_62(WebDriver driver)  {
					BrowserActions.click(driver, rdbFlagged_62,"Flagged_62");
				    return this;
			}
public ClaimsPage clickLossDateDateIcon_33(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon_33,"LossDateDateIcon_33");
				    return this;
			}
public ClaimsPage selectStatus_58(WebDriver driver,String Status_58)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_58,Status_58,"Status_58");
				    return this;
			}
public ClaimsPage enterPolicy_16(WebDriver driver,String Policy_16) {
		            BrowserActions.type(driver, inpPolicy_16,Policy_16, "Policy_16");
			        return this;
           }
public ClaimsPage enterClaimant_31(WebDriver driver,String Claimant_31) {
		            BrowserActions.type(driver, inpClaimant_31,Claimant_31, "Claimant_31");
			        return this;
           }
public ClaimsPage enterClaimant(WebDriver driver,String Claimant) {
		            BrowserActions.type(driver, inpClaimant,Claimant, "Claimant");
			        return this;
           }
public ClaimsPage enterClaimant_7(WebDriver driver,String Claimant_7) {
		            BrowserActions.type(driver, inpClaimant_7,Claimant_7, "Claimant_7");
			        return this;
           }
public ClaimsPage enterClaim_27(WebDriver driver,String Claim_27) {
		            BrowserActions.type(driver, inpClaim_27,Claim_27, "Claim_27");
			        return this;
           }
public ClaimsPage enterInjuredWorker_54(WebDriver driver,String InjuredWorker_54) {
		            BrowserActions.type(driver, inpInjuredWorker_54,InjuredWorker_54, "InjuredWorker_54");
			        return this;
           }
public ClaimsPage enterLossDate_8(WebDriver driver,String LossDate_8) {
		            BrowserActions.type(driver, inpLossDate_8,LossDate_8, "LossDate_8");
			        return this;
           }
public ClaimsPage selectState_37(WebDriver driver,String State_37)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_37,State_37,"State_37");
				    return this;
			}
public ClaimsPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public ClaimsPage clickLossDateDateIcon_9(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon_9,"LossDateDateIcon_9");
				    return this;
			}
public ClaimsPage selectLOB_72(WebDriver driver,String LOB_72)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLOB_72,LOB_72,"LOB_72");
				    return this;
			}
public ClaimsPage enterLossDate_44(WebDriver driver,String LossDate_44) {
		            BrowserActions.type(driver, inpLossDate_44,LossDate_44, "LossDate_44");
			        return this;
           }
public ClaimsPage clickClaim(WebDriver driver)  {
	BrowserActions.click(driver, rbtnClaims,"claim");
    return this;
}
}
