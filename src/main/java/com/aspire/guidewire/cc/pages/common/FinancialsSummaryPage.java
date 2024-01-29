package com.aspire.guidewire.cc.pages.common;
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

public class FinancialsSummaryPage extends LoadableComponent<FinancialsSummaryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public FinancialsSummary financialssummaryTable;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-FuturePayments']", AI = false)
	private WebElement inpFuturePayments_45;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-ts-tsMenuIcon>div[role='button']", AI = false)
	private WebElement btnTsMenuIcon_15;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-FuturePayments']", AI = false)
	private WebElement inpFuturePayments;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-ts-tsMenuIcon>div[role='button']", AI = false)
	private WebElement btnTsMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-TotalIncurredNet']", AI = false)
	private WebElement inpNetTotalIncurred_60;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-ts']", AI = false)
	private WebElement inpTs_50;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-ts-QuickMenu_CreateCheck>div[role='menuitem']", AI = false)
	private WebElement btnCreateCheck_18;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-TotalRecoveries']", AI = false)
	private WebElement inpRecoveries_59;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-ts-QuickMenu_QuickCheck>div[role='menuitem']", AI = false)
	private WebElement btnQuickCheck_65;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-OpenRecoveryReserves']", AI = false)
	private WebElement inpOpenRecoveryReserves_67;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-OpenRecoveryReserves']", AI = false)
	private WebElement inpOpenRecoveryReserves;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-FuturePayments']", AI = false)
	private WebElement inpFuturePayments_33;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-ts-tsMenuIcon>div[role='button']", AI = false)
	private WebElement btnTsMenuIcon_27;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-TotalPayments']", AI = false)
	private WebElement inpTotalPaid_58;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-TotalIncurredNet']", AI = false)
	private WebElement inpNetTotalIncurred_72;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-FinancialsSummaryLabel']", AI = false)
	private WebElement inpFinancialsSummaryLabel_13;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-TotalRecoveries']", AI = false)
	private WebElement inpRecoveries_71;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-ts']", AI = false)
	private WebElement inpTs;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-ts-QuickMenu_EditReserve>div[role='menuitem']", AI = false)
	private WebElement btnEditReserve_16;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-ts-QuickMenu_QuickCheck>div[role='menuitem']", AI = false)
	private WebElement btnQuickCheck_5;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-ts-QuickMenu_QuickCheck>div[role='menuitem']", AI = false)
	private WebElement btnQuickCheck_53;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-FinancialsSummaryLabel']", AI = false)
	private WebElement inpFinancialsSummaryLabel_61;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-TotalIncurredNet']", AI = false)
	private WebElement inpNetTotalIncurred_48;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-FuturePayments']", AI = false)
	private WebElement inpFuturePayments_21;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-TotalRecoveries']", AI = false)
	private WebElement inpRecoveries_35;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-ts-QuickMenu_EditReserve>div[role='menuitem']", AI = false)
	private WebElement btnEditReserve_28;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-ts-QuickMenu_QuickCheck>div[role='menuitem']", AI = false)
	private WebElement btnQuickCheck_41;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-OpenRecoveryReserves']", AI = false)
	private WebElement inpOpenRecoveryReserves_43;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-RemainingReserves']", AI = false)
	private WebElement inpRemainingReserves;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-TotalPayments']", AI = false)
	private WebElement inpTotalPaid_70;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-RemainingReserves']", AI = false)
	private WebElement inpRemainingReserves_20;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-FinancialsSummaryLabel']", AI = false)
	private WebElement inpFinancialsSummaryLabel;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-ts']", AI = false)
	private WebElement inpTs_62;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-FuturePayments']", AI = false)
	private WebElement inpFuturePayments_9;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-TotalRecoveries']", AI = false)
	private WebElement inpRecoveries_47;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-ts-QuickMenu_CreateCheck>div[role='menuitem']", AI = false)
	private WebElement btnCreateCheck_6;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-FinancialsSummaryLabel']", AI = false)
	private WebElement inpFinancialsSummaryLabel_1;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-OpenRecoveryReserves']", AI = false)
	private WebElement inpOpenRecoveryReserves_55;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-TotalIncurredNet']", AI = false)
	private WebElement inpNetTotalIncurred_24;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-ts']", AI = false)
	private WebElement inpTs_14;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-OpenRecoveryReserves']", AI = false)
	private WebElement inpOpenRecoveryReserves_19;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-ts']", AI = false)
	private WebElement inpTs_2;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-ts-QuickMenu_CreateCheck>div[role='menuitem']", AI = false)
	private WebElement btnCreateCheck_54;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-TotalPayments']", AI = false)
	private WebElement inpTotalPaid_22;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-RemainingReserves']", AI = false)
	private WebElement inpRemainingReserves_32;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-TotalRecoveries']", AI = false)
	private WebElement inpRecoveries;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-ts-QuickMenu_EditReserve>div[role='menuitem']", AI = false)
	private WebElement btnEditReserve_40;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-TotalRecoveries']", AI = false)
	private WebElement inpRecoveries_11;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-ts-QuickMenu_QuickCheck>div[role='menuitem']", AI = false)
	private WebElement btnQuickCheck_29;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-FinancialsSummaryLabel']", AI = false)
	private WebElement inpFinancialsSummaryLabel_37;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-ts-tsMenuIcon>div[role='button']", AI = false)
	private WebElement btnTsMenuIcon_3;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-ts-tsMenuIcon>div[role='button']", AI = false)
	private WebElement btnTsMenuIcon_51;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-TotalIncurredNet']", AI = false)
	private WebElement inpNetTotalIncurred_36;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet_tb-floatingFinancialsInputWidget']", AI = false)
	private WebElement drpExchangeRate;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-ts-QuickMenu_CreateCheck>div[role='menuitem']", AI = false)
	private WebElement btnCreateCheck_66;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-TotalPayments']", AI = false)
	private WebElement inpTotalPaid_10;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet_tb-FinancialsSummaryRangeInput']", AI = false)
	private WebElement drpView;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-RemainingReserves']", AI = false)
	private WebElement inpRemainingReserves_44;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-ts-QuickMenu_EditReserve>div[role='menuitem']", AI = false)
	private WebElement btnEditReserve_52;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-FinancialsSummaryLabel']", AI = false)
	private WebElement inpFinancialsSummaryLabel_49;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-ts-QuickMenu_QuickCheck>div[role='menuitem']", AI = false)
	private WebElement btnQuickCheck_17;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-TotalRecoveries']", AI = false)
	private WebElement inpRecoveries_23;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-OpenRecoveryReserves']", AI = false)
	private WebElement inpOpenRecoveryReserves_31;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-ts-tsMenuIcon>div[role='button']", AI = false)
	private WebElement btnTsMenuIcon_63;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-FuturePayments']", AI = false)
	private WebElement inpFuturePayments_69;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-ts-tsMenuIcon>div[role='button']", AI = false)
	private WebElement btnTsMenuIcon_39;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-ts']", AI = false)
	private WebElement inpTs_38;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-FinancialsSummaryLabel']", AI = false)
	private WebElement inpFinancialsSummaryLabel_25;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-TotalPayments']", AI = false)
	private WebElement inpTotalPaid_46;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-ts-QuickMenu_CreateCheck>div[role='menuitem']", AI = false)
	private WebElement btnCreateCheck_30;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-OpenRecoveryReserves']", AI = false)
	private WebElement inpOpenRecoveryReserves_7;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-RemainingReserves']", AI = false)
	private WebElement inpRemainingReserves_56;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-TotalPayments']", AI = false)
	private WebElement inpTotalPaid;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-ts-QuickMenu_EditReserve>div[role='menuitem']", AI = false)
	private WebElement btnEditReserve_64;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-ts-QuickMenu_EditReserve>div[role='menuitem']", AI = false)
	private WebElement btnEditReserve_4;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-ts-QuickMenu_QuickCheck>div[role='menuitem']", AI = false)
	private WebElement btnQuickCheck;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-FuturePayments']", AI = false)
	private WebElement inpFuturePayments_57;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-TotalIncurredNet']", AI = false)
	private WebElement inpNetTotalIncurred_12;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-ts']", AI = false)
	private WebElement inpTs_26;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-1-ts-QuickMenu_CreateCheck>div[role='menuitem']", AI = false)
	private WebElement btnCreateCheck_42;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-1-0-RemainingReserves']", AI = false)
	private WebElement inpRemainingReserves_68;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-RemainingReserves']", AI = false)
	private WebElement inpRemainingReserves_8;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-0-0-0-TotalPayments']", AI = false)
	private WebElement inpTotalPaid_34;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-ts-QuickMenu_EditReserve>div[role='menuitem']", AI = false)
	private WebElement btnEditReserve;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsSummary-ClaimFinancialsSummaryScreen-financialsPanel-FinancialsSummaryPanelSet-FinancialsSummaryLV-0-TotalIncurredNet']", AI = false)
	private WebElement inpNetTotalIncurred;
	
	@IFindBy(how = How.XPATH, using = "(//div[contains(@id,'-0-0-ts-tsMenuIcon')]) [last()]", AI = false)
	private WebElement btnFinancialMenuIcon;
	
	@IFindBy(how = How.XPATH, using = "(//div[contains(@id,'0-0-ts-QuickMenu_CreateChec')]) [last()]", AI = false)
	private WebElement btnCreateCheck;
	
	@IFindBy(how = How.CSS, using = "div[id$='FinancialsSummaryLV-0-1-0-1-ts-tsMenuIcon']", AI = false)
	private WebElement btnFinancialMenuIcon_CA;

	@IFindBy(how = How.CSS, using = "div[id$='1-ts-QuickMenu_CreateCheck']", AI = false)
	private WebElement btnCreateCheck_CA;
	
	public FinancialsSummaryPage(){
	}

	public FinancialsSummaryPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		financialssummaryTable = new FinancialsSummary();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpNetTotalIncurred))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public FinancialsSummaryPage enterFuturePayments_45(WebDriver driver,String FuturePayments_45) {
		            BrowserActions.type(driver, inpFuturePayments_45,FuturePayments_45, "FuturePayments_45");
			        return this;
           }
public FinancialsSummaryPage clickTsMenuIcon_15(WebDriver driver)  {
					BrowserActions.click(driver, btnTsMenuIcon_15,"TsMenuIcon_15");
				    return this;
			}
public FinancialsSummaryPage enterFuturePayments(WebDriver driver,String FuturePayments) {
		            BrowserActions.type(driver, inpFuturePayments,FuturePayments, "FuturePayments");
			        return this;
           }
public FinancialsSummaryPage clickTsMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTsMenuIcon,"TsMenuIcon");
				    return this;
			}
public FinancialsSummaryPage enterNetTotalIncurred_60(WebDriver driver,String NetTotalIncurred_60) {
		            BrowserActions.type(driver, inpNetTotalIncurred_60,NetTotalIncurred_60, "NetTotalIncurred_60");
			        return this;
           }
public FinancialsSummaryPage enterTs_50(WebDriver driver,String Ts_50) {
		            BrowserActions.type(driver, inpTs_50,Ts_50, "Ts_50");
			        return this;
           }
public FinancialsSummaryPage clickCreateCheck_18(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateCheck_18,"CreateCheck_18");
				    return this;
			}
public FinancialsSummaryPage enterRecoveries_59(WebDriver driver,String Recoveries_59) {
		            BrowserActions.type(driver, inpRecoveries_59,Recoveries_59, "Recoveries_59");
			        return this;
           }
public FinancialsSummaryPage clickQuickCheck_65(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickCheck_65,"QuickCheck_65");
				    return this;
			}
public FinancialsSummaryPage enterOpenRecoveryReserves_67(WebDriver driver,String OpenRecoveryReserves_67) {
		            BrowserActions.type(driver, inpOpenRecoveryReserves_67,OpenRecoveryReserves_67, "OpenRecoveryReserves_67");
			        return this;
           }
public FinancialsSummaryPage enterOpenRecoveryReserves(WebDriver driver,String OpenRecoveryReserves) {
		            BrowserActions.type(driver, inpOpenRecoveryReserves,OpenRecoveryReserves, "OpenRecoveryReserves");
			        return this;
           }
public FinancialsSummaryPage enterFuturePayments_33(WebDriver driver,String FuturePayments_33) {
		            BrowserActions.type(driver, inpFuturePayments_33,FuturePayments_33, "FuturePayments_33");
			        return this;
           }
public FinancialsSummaryPage clickTsMenuIcon_27(WebDriver driver)  {
					BrowserActions.click(driver, btnTsMenuIcon_27,"TsMenuIcon_27");
				    return this;
			}
public FinancialsSummaryPage enterTotalPaid_58(WebDriver driver,String TotalPaid_58) {
		            BrowserActions.type(driver, inpTotalPaid_58,TotalPaid_58, "TotalPaid_58");
			        return this;
           }
public FinancialsSummaryPage enterNetTotalIncurred_72(WebDriver driver,String NetTotalIncurred_72) {
		            BrowserActions.type(driver, inpNetTotalIncurred_72,NetTotalIncurred_72, "NetTotalIncurred_72");
			        return this;
           }
public FinancialsSummaryPage enterFinancialsSummaryLabel_13(WebDriver driver,String FinancialsSummaryLabel_13) {
		            BrowserActions.type(driver, inpFinancialsSummaryLabel_13,FinancialsSummaryLabel_13, "FinancialsSummaryLabel_13");
			        return this;
           }
public FinancialsSummaryPage enterRecoveries_71(WebDriver driver,String Recoveries_71) {
		            BrowserActions.type(driver, inpRecoveries_71,Recoveries_71, "Recoveries_71");
			        return this;
           }
public FinancialsSummaryPage enterTs(WebDriver driver,String Ts) {
		            BrowserActions.type(driver, inpTs,Ts, "Ts");
			        return this;
           }
public FinancialsSummaryPage clickEditReserve_16(WebDriver driver)  {
					BrowserActions.click(driver, btnEditReserve_16,"EditReserve_16");
				    return this;
			}
public FinancialsSummaryPage clickQuickCheck_5(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickCheck_5,"QuickCheck_5");
				    return this;
			}
public FinancialsSummaryPage clickQuickCheck_53(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickCheck_53,"QuickCheck_53");
				    return this;
			}
public FinancialsSummaryPage enterFinancialsSummaryLabel_61(WebDriver driver,String FinancialsSummaryLabel_61) {
		            BrowserActions.type(driver, inpFinancialsSummaryLabel_61,FinancialsSummaryLabel_61, "FinancialsSummaryLabel_61");
			        return this;
           }
public FinancialsSummaryPage enterNetTotalIncurred_48(WebDriver driver,String NetTotalIncurred_48) {
		            BrowserActions.type(driver, inpNetTotalIncurred_48,NetTotalIncurred_48, "NetTotalIncurred_48");
			        return this;
           }
public FinancialsSummaryPage enterFuturePayments_21(WebDriver driver,String FuturePayments_21) {
		            BrowserActions.type(driver, inpFuturePayments_21,FuturePayments_21, "FuturePayments_21");
			        return this;
           }
public FinancialsSummaryPage enterRecoveries_35(WebDriver driver,String Recoveries_35) {
		            BrowserActions.type(driver, inpRecoveries_35,Recoveries_35, "Recoveries_35");
			        return this;
           }
public FinancialsSummaryPage clickEditReserve_28(WebDriver driver)  {
					BrowserActions.click(driver, btnEditReserve_28,"EditReserve_28");
				    return this;
			}
public FinancialsSummaryPage clickQuickCheck_41(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickCheck_41,"QuickCheck_41");
				    return this;
			}
public FinancialsSummaryPage enterOpenRecoveryReserves_43(WebDriver driver,String OpenRecoveryReserves_43) {
		            BrowserActions.type(driver, inpOpenRecoveryReserves_43,OpenRecoveryReserves_43, "OpenRecoveryReserves_43");
			        return this;
           }
public FinancialsSummaryPage enterRemainingReserves(WebDriver driver,String RemainingReserves) {
		            BrowserActions.type(driver, inpRemainingReserves,RemainingReserves, "RemainingReserves");
			        return this;
           }
public FinancialsSummaryPage enterTotalPaid_70(WebDriver driver,String TotalPaid_70) {
		            BrowserActions.type(driver, inpTotalPaid_70,TotalPaid_70, "TotalPaid_70");
			        return this;
           }
public FinancialsSummaryPage enterRemainingReserves_20(WebDriver driver,String RemainingReserves_20) {
		            BrowserActions.type(driver, inpRemainingReserves_20,RemainingReserves_20, "RemainingReserves_20");
			        return this;
           }
public FinancialsSummaryPage enterFinancialsSummaryLabel(WebDriver driver,String FinancialsSummaryLabel) {
		            BrowserActions.type(driver, inpFinancialsSummaryLabel,FinancialsSummaryLabel, "FinancialsSummaryLabel");
			        return this;
           }
public FinancialsSummaryPage enterTs_62(WebDriver driver,String Ts_62) {
		            BrowserActions.type(driver, inpTs_62,Ts_62, "Ts_62");
			        return this;
           }
public FinancialsSummaryPage enterFuturePayments_9(WebDriver driver,String FuturePayments_9) {
		            BrowserActions.type(driver, inpFuturePayments_9,FuturePayments_9, "FuturePayments_9");
			        return this;
           }
public FinancialsSummaryPage enterRecoveries_47(WebDriver driver,String Recoveries_47) {
		            BrowserActions.type(driver, inpRecoveries_47,Recoveries_47, "Recoveries_47");
			        return this;
           }
public FinancialsSummaryPage clickCreateCheck_6(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateCheck_6,"CreateCheck_6");
				    return this;
			}
public FinancialsSummaryPage enterFinancialsSummaryLabel_1(WebDriver driver,String FinancialsSummaryLabel_1) {
		            BrowserActions.type(driver, inpFinancialsSummaryLabel_1,FinancialsSummaryLabel_1, "FinancialsSummaryLabel_1");
			        return this;
           }
public FinancialsSummaryPage enterOpenRecoveryReserves_55(WebDriver driver,String OpenRecoveryReserves_55) {
		            BrowserActions.type(driver, inpOpenRecoveryReserves_55,OpenRecoveryReserves_55, "OpenRecoveryReserves_55");
			        return this;
           }
public FinancialsSummaryPage enterNetTotalIncurred_24(WebDriver driver,String NetTotalIncurred_24) {
		            BrowserActions.type(driver, inpNetTotalIncurred_24,NetTotalIncurred_24, "NetTotalIncurred_24");
			        return this;
           }
public FinancialsSummaryPage enterTs_14(WebDriver driver,String Ts_14) {
		            BrowserActions.type(driver, inpTs_14,Ts_14, "Ts_14");
			        return this;
           }
public FinancialsSummaryPage enterOpenRecoveryReserves_19(WebDriver driver,String OpenRecoveryReserves_19) {
		            BrowserActions.type(driver, inpOpenRecoveryReserves_19,OpenRecoveryReserves_19, "OpenRecoveryReserves_19");
			        return this;
           }
public FinancialsSummaryPage enterTs_2(WebDriver driver,String Ts_2) {
		            BrowserActions.type(driver, inpTs_2,Ts_2, "Ts_2");
			        return this;
           }
public FinancialsSummaryPage clickCreateCheck_54(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateCheck_54,"CreateCheck_54");
				    return this;
			}
public FinancialsSummaryPage enterTotalPaid_22(WebDriver driver,String TotalPaid_22) {
		            BrowserActions.type(driver, inpTotalPaid_22,TotalPaid_22, "TotalPaid_22");
			        return this;
           }
public FinancialsSummaryPage enterRemainingReserves_32(WebDriver driver,String RemainingReserves_32) {
		            BrowserActions.type(driver, inpRemainingReserves_32,RemainingReserves_32, "RemainingReserves_32");
			        return this;
           }
public FinancialsSummaryPage enterRecoveries(WebDriver driver,String Recoveries) {
		            BrowserActions.type(driver, inpRecoveries,Recoveries, "Recoveries");
			        return this;
           }
public FinancialsSummaryPage clickEditReserve_40(WebDriver driver)  {
					BrowserActions.click(driver, btnEditReserve_40,"EditReserve_40");
				    return this;
			}
public FinancialsSummaryPage enterRecoveries_11(WebDriver driver,String Recoveries_11) {
		            BrowserActions.type(driver, inpRecoveries_11,Recoveries_11, "Recoveries_11");
			        return this;
           }
public FinancialsSummaryPage clickQuickCheck_29(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickCheck_29,"QuickCheck_29");
				    return this;
			}
public FinancialsSummaryPage enterFinancialsSummaryLabel_37(WebDriver driver,String FinancialsSummaryLabel_37) {
		            BrowserActions.type(driver, inpFinancialsSummaryLabel_37,FinancialsSummaryLabel_37, "FinancialsSummaryLabel_37");
			        return this;
           }
public FinancialsSummaryPage clickTsMenuIcon_3(WebDriver driver)  {
					BrowserActions.click(driver, btnTsMenuIcon_3,"TsMenuIcon_3");
				    return this;
			}
public FinancialsSummaryPage clickTsMenuIcon_51(WebDriver driver)  {
					BrowserActions.click(driver, btnTsMenuIcon_51,"TsMenuIcon_51");
				    return this;
			}
public FinancialsSummaryPage enterNetTotalIncurred_36(WebDriver driver,String NetTotalIncurred_36) {
		            BrowserActions.type(driver, inpNetTotalIncurred_36,NetTotalIncurred_36, "NetTotalIncurred_36");
			        return this;
           }
public FinancialsSummaryPage selectExchangeRate(WebDriver driver,String ExchangeRate)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpExchangeRate,ExchangeRate,"ExchangeRate");
				    return this;
			}
public FinancialsSummaryPage clickCreateCheck_66(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateCheck_66,"CreateCheck_66");
				    return this;
			}
public FinancialsSummaryPage enterTotalPaid_10(WebDriver driver,String TotalPaid_10) {
		            BrowserActions.type(driver, inpTotalPaid_10,TotalPaid_10, "TotalPaid_10");
			        return this;
           }
public FinancialsSummaryPage selectView(WebDriver driver,String View)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpView,View,"View");
				    return this;
			}
public FinancialsSummaryPage enterRemainingReserves_44(WebDriver driver,String RemainingReserves_44) {
		            BrowserActions.type(driver, inpRemainingReserves_44,RemainingReserves_44, "RemainingReserves_44");
			        return this;
           }
public FinancialsSummaryPage clickEditReserve_52(WebDriver driver)  {
					BrowserActions.click(driver, btnEditReserve_52,"EditReserve_52");
				    return this;
			}
public FinancialsSummaryPage enterFinancialsSummaryLabel_49(WebDriver driver,String FinancialsSummaryLabel_49) {
		            BrowserActions.type(driver, inpFinancialsSummaryLabel_49,FinancialsSummaryLabel_49, "FinancialsSummaryLabel_49");
			        return this;
           }
public FinancialsSummaryPage clickQuickCheck_17(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickCheck_17,"QuickCheck_17");
				    return this;
			}
public FinancialsSummaryPage enterRecoveries_23(WebDriver driver,String Recoveries_23) {
		            BrowserActions.type(driver, inpRecoveries_23,Recoveries_23, "Recoveries_23");
			        return this;
           }
public FinancialsSummaryPage enterOpenRecoveryReserves_31(WebDriver driver,String OpenRecoveryReserves_31) {
		            BrowserActions.type(driver, inpOpenRecoveryReserves_31,OpenRecoveryReserves_31, "OpenRecoveryReserves_31");
			        return this;
           }
public FinancialsSummaryPage clickTsMenuIcon_63(WebDriver driver)  {
					BrowserActions.click(driver, btnTsMenuIcon_63,"TsMenuIcon_63");
				    return this;
			}
public FinancialsSummaryPage enterFuturePayments_69(WebDriver driver,String FuturePayments_69) {
		            BrowserActions.type(driver, inpFuturePayments_69,FuturePayments_69, "FuturePayments_69");
			        return this;
           }
public FinancialsSummaryPage clickTsMenuIcon_39(WebDriver driver)  {
					BrowserActions.click(driver, btnTsMenuIcon_39,"TsMenuIcon_39");
				    return this;
			}
public FinancialsSummaryPage enterTs_38(WebDriver driver,String Ts_38) {
		            BrowserActions.type(driver, inpTs_38,Ts_38, "Ts_38");
			        return this;
           }
public FinancialsSummaryPage enterFinancialsSummaryLabel_25(WebDriver driver,String FinancialsSummaryLabel_25) {
		            BrowserActions.type(driver, inpFinancialsSummaryLabel_25,FinancialsSummaryLabel_25, "FinancialsSummaryLabel_25");
			        return this;
           }
public FinancialsSummaryPage enterTotalPaid_46(WebDriver driver,String TotalPaid_46) {
		            BrowserActions.type(driver, inpTotalPaid_46,TotalPaid_46, "TotalPaid_46");
			        return this;
           }
public FinancialsSummaryPage clickCreateCheck_30(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateCheck_30,"CreateCheck_30");
				    return this;
			}
public FinancialsSummaryPage enterOpenRecoveryReserves_7(WebDriver driver,String OpenRecoveryReserves_7) {
		            BrowserActions.type(driver, inpOpenRecoveryReserves_7,OpenRecoveryReserves_7, "OpenRecoveryReserves_7");
			        return this;
           }
public FinancialsSummaryPage enterRemainingReserves_56(WebDriver driver,String RemainingReserves_56) {
		            BrowserActions.type(driver, inpRemainingReserves_56,RemainingReserves_56, "RemainingReserves_56");
			        return this;
           }
public FinancialsSummaryPage enterTotalPaid(WebDriver driver,String TotalPaid) {
		            BrowserActions.type(driver, inpTotalPaid,TotalPaid, "TotalPaid");
			        return this;
           }
public FinancialsSummaryPage clickEditReserve_64(WebDriver driver)  {
					BrowserActions.click(driver, btnEditReserve_64,"EditReserve_64");
				    return this;
			}
public FinancialsSummaryPage clickEditReserve_4(WebDriver driver)  {
					BrowserActions.click(driver, btnEditReserve_4,"EditReserve_4");
				    return this;
			}
public FinancialsSummaryPage clickQuickCheck(WebDriver driver)  {
					BrowserActions.click(driver, btnQuickCheck,"QuickCheck");
				    return this;
			}
public FinancialsSummaryPage enterFuturePayments_57(WebDriver driver,String FuturePayments_57) {
		            BrowserActions.type(driver, inpFuturePayments_57,FuturePayments_57, "FuturePayments_57");
			        return this;
           }
public FinancialsSummaryPage enterNetTotalIncurred_12(WebDriver driver,String NetTotalIncurred_12) {
		            BrowserActions.type(driver, inpNetTotalIncurred_12,NetTotalIncurred_12, "NetTotalIncurred_12");
			        return this;
           }
public FinancialsSummaryPage enterTs_26(WebDriver driver,String Ts_26) {
		            BrowserActions.type(driver, inpTs_26,Ts_26, "Ts_26");
			        return this;
           }
public FinancialsSummaryPage clickCreateCheck_42(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateCheck_42,"CreateCheck_42");
				    return this;
			}
public FinancialsSummaryPage enterRemainingReserves_68(WebDriver driver,String RemainingReserves_68) {
		            BrowserActions.type(driver, inpRemainingReserves_68,RemainingReserves_68, "RemainingReserves_68");
			        return this;
           }
public FinancialsSummaryPage enterRemainingReserves_8(WebDriver driver,String RemainingReserves_8) {
		            BrowserActions.type(driver, inpRemainingReserves_8,RemainingReserves_8, "RemainingReserves_8");
			        return this;
           }
public FinancialsSummaryPage enterTotalPaid_34(WebDriver driver,String TotalPaid_34) {
		            BrowserActions.type(driver, inpTotalPaid_34,TotalPaid_34, "TotalPaid_34");
			        return this;
           }
public FinancialsSummaryPage clickEditReserve(WebDriver driver)  {
					BrowserActions.click(driver, btnEditReserve,"EditReserve");
				    return this;
			}
public FinancialsSummaryPage enterNetTotalIncurred(WebDriver driver,String NetTotalIncurred) {
		            BrowserActions.type(driver, inpNetTotalIncurred,NetTotalIncurred, "NetTotalIncurred");
			        return this;
           }
public FinancialsSummaryPage clickFinancialMenuIcon(WebDriver driver) {
	BrowserActions.click(driver,btnFinancialMenuIcon,"Financial menu icon");
	return this;
}
public FinancialsSummaryPage clickCreateCheck(WebDriver driver) {
	BrowserActions.click(driver,btnCreateCheck,"Create check");
	return this;
}
public FinancialsSummaryPage clickFinancialMenuIcon_CA(WebDriver driver) {
	BrowserActions.click(driver,btnFinancialMenuIcon_CA,"Financial menu icon");
	return this;
}
public FinancialsSummaryPage clickCreateCheck_CA(WebDriver driver) {
	BrowserActions.click(driver,btnCreateCheck_CA,"Create check");
	return this;
}
}
