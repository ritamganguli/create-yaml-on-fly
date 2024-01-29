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

public class RateRountinesPage extends LoadableComponent<RateRountinesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#RateRoutines-RateRoutineSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#RateRoutines-RateRoutineSearchScreen-RateRoutineSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutines-RateRoutineSearchScreen-RateRoutineSearchDV-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#RateRoutines-RateRoutineSearchScreen-RateRoutinePanelSet-RateroutinesLV_tb-DeleteRateRoutineDefButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutines-RateRoutineSearchScreen-RateRoutineSearchDV-Code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "#RateRoutines-RateRoutineSearchScreen-RateRoutinePanelSet-RateroutinesLV_tb-AddRateRoutineDefButton>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutines-RateRoutineSearchScreen-RateRoutineSearchDV-PolicyLine']", AI = false)
	private WebElement drpPolicyLine;

	@IFindBy(how = How.CSS, using = "#RateRoutines-RateRoutineSearchScreen-RateRoutineSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;
	
	@IFindBy(how = How.CSS, using = "div[id$='RateroutineName']", AI = false)
	private WebElement lnkRateRountineName;

	public RateRountinesPage(){
	}

	public RateRountinesPage(WebDriver driver){
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
}public RateRountinesPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public RateRountinesPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public RateRountinesPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public RateRountinesPage enterCode(WebDriver driver,String Code) {
		            BrowserActions.type(driver, inpCode,Code, "Code");
			        return this;
           }
public RateRountinesPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public RateRountinesPage selectPolicyLine(WebDriver driver,String PolicyLine)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLine,PolicyLine,"PolicyLine");
				    return this;
			}
public RateRountinesPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public RateRountineNamePage clickRateRountineName(WebDriver driver)  {
	BrowserActions.click(driver, lnkRateRountineName,"Rate Rountine Name");
	return new RateRountineNamePage(driver).get();
}
public class RateRountineNamePage extends LoadableComponent<RateRountineNamePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public  List<Object> pageFactoryKey = new ArrayList<Object>();
	public  List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-StepNote']", AI = false)
	private WebElement inpStepNote_81;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-5-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_71;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-StepNote']", AI = false)
	private WebElement inpStepNote_120;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-StepNoteColumnLabel']", AI = false)
	private WebElement inpStepNoteColumnLabel;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-LineNumber']", AI = false)
	private WebElement inpLineNumber_114;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-12-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_162;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_67;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-Code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_46;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-LineNumber']", AI = false)
	private WebElement inpLineNumber_88;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-6-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_84;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-StepNote']", AI = false)
	private WebElement inpStepNote_133;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_52;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-LineNumber']", AI = false)
	private WebElement inpLineNumber_101;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_80;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-0-SectionComment textarea", AI = false)
	private WebElement inpSectionComment;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_165;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-ActionOperand']", AI = false)
	private WebElement inpActionOperand_92;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_33;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-LineNumber']", AI = false)
	private WebElement inpLineNumber_75;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_17;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-StepNote']", AI = false)
	private WebElement inpStepNote_94;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_104;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_30;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LeftParenthesisGroupColumnLabel']", AI = false)
	private WebElement inpLeftParenthesisGroupColumnLabel;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-LastUpdateTime']", AI = false)
	private WebElement inpLastUpdateTime;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineLineNumberColumnLabel']", AI = false)
	private WebElement inpRateRoutineLineNumberColumnLabel;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-4-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_58;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_26;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_41;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_20;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-Version']", AI = false)
	private WebElement inpVersion;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-LineNumber']", AI = false)
	private WebElement inpLineNumber_62;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_117;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-11-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_149;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_43;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_108;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RightParenthesisGroupColumnLabel']", AI = false)
	private WebElement inpRightParenthesisGroupColumnLabel;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_39;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-12-ActionOperator']", AI = false)
	private WebElement drpActionOperator_155;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_54;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-10-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_136;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-StepNote']", AI = false)
	private WebElement inpStepNote_107;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_56;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_130;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_21;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-2-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_32;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_83;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_24;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-LineNumber']", AI = false)
	private WebElement inpLineNumber_49;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_85;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
	private WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-9-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_123;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_48;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_139;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_13;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_143;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_69;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineInstructionColumnLabel']", AI = false)
	private WebElement inpRateRoutineInstructionColumnLabel;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_34;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-ActionOperand']", AI = false)
	private WebElement inpActionOperand_105;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_121;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_37;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-3-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_45;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-ActionOperand']", AI = false)
	private WebElement inpActionOperand;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_70;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-LineNumber']", AI = false)
	private WebElement inpLineNumber_36;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-8-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_110;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_72;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_126;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_35;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-RoutineParamSet']", AI = false)
	private WebElement drpParameterSet;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_161;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_156;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp_10;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateroutineDetailToolbar-EditButton>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_134;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-StepOperatorColumnLabel']", AI = false)
	private WebElement inpStepOperatorColumnLabel;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-ParamInfo", AI = false)
	private WebElement btnParamInfo;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_93;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_152;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-LineNumber']", AI = false)
	private WebElement inpLineNumber_23;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_22;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineUsedByPromotedBookMessage-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_147;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_96;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_82;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-LastUpdatedBy']", AI = false)
	private WebElement inpLastUpdatedBy;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_138;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-ActionOperand']", AI = false)
	private WebElement inpActionOperand_118;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-1-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_19;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-LineNumber']", AI = false)
	private WebElement inpLineNumber_11;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateroutineDetailToolbar-VersionButton>div[role='button']", AI = false)
	private WebElement btnCreateNewVersion;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_59;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineOperandColumnLabel']", AI = false)
	private WebElement inpRateRoutineOperandColumnLabel;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_95;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-4-ActionOperator']", AI = false)
	private WebElement drpActionOperator_51;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_148;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_44;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-8-ActionOperator']", AI = false)
	private WebElement drpActionOperator_103;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-ActionOperand']", AI = false)
	private WebElement inpActionOperand_131;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-AlertBarForDeletedParamSet-CloseBtn", AI = false)
	private WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
	private WebElement inpColumn;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_128;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_125;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineUsedByPromotedBookMessage .gw-AlertBar--label", AI = false)
	private WebElement lblRateRoutineUsedByPromotedBookMessage;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_63;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_60;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_106;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_87;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-Jurisdiction']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_111;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_31;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_135;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-ActionOperand']", AI = false)
	private WebElement inpActionOperand_144;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow_160;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_119;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-ActionOperand']", AI = false)
	private WebElement inpActionOperand_14;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-StepNote']", AI = false)
	private WebElement inpStepNote_16;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_73;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
	private WebElement inpLanguage_4;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_115;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
	private WebElement inpLanguage_7;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_74;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_112;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-3-ActionOperator']", AI = false)
	private WebElement drpActionOperator_38;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_124;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateroutineDetailToolbar-BranchButton>div[role='button']", AI = false)
	private WebElement btnCreateJurisdictionVariant;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateroutineDetailToolbar-GoToRateRoutines']", AI = false)
	private WebElement inpGoToRateRoutines;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-ActionOperand']", AI = false)
	private WebElement inpActionOperand_157;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-9-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_122;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_47;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-2-ActionOperator']", AI = false)
	private WebElement drpActionOperator_25;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-StepNote']", AI = false)
	private WebElement inpStepNote_29;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-ActionOperand']", AI = false)
	private WebElement inpActionOperand_27;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_61;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_102;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_113;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
	private WebElement inpFieldHeading;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-LastUpdateTime_dateIcon", AI = false)
	private WebElement btnLastUpdateTimeDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
	private WebElement inpColumn_8;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
	private WebElement inpColumn_9;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_57;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
	private WebElement inpColumn_6;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_137;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-LastUpdatedBy-UserBrowseMenuItem", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
	private WebElement inpColumn_5;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
	private WebElement inpColumn_3;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_132;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-8-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_109;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-1-ActionOperator']", AI = false)
	private WebElement drpActionOperator_12;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-VoidFunctionStepNote']", AI = false)
	private WebElement inpVoidFunctionStepNote_100;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_50;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp_164;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_98;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-AlertBarForDeletedParamSet .gw-AlertBar--label", AI = false)
	private WebElement lblAlertBarForDeletedParamSet;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp_76;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_145;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-LineNumber']", AI = false)
	private WebElement inpLineNumber_153;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-7-ActionOperator']", AI = false)
	private WebElement drpActionOperator_90;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-11-ActionOperator']", AI = false)
	private WebElement drpActionOperator_142;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-2-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_28;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp_154;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_91;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp_151;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-ActionOperand']", AI = false)
	private WebElement inpActionOperand_40;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-3-StepNote']", AI = false)
	private WebElement inpStepNote_42;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-StepNote']", AI = false)
	private WebElement inpStepNote;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp_86;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-LineNumber']", AI = false)
	private WebElement inpLineNumber_140;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_150;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-RateRoutineDV-RoutineLOB']", AI = false)
	private WebElement drpPolicyLine;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_158;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateroutineDetailToolbar-CopyButton>div[role='button']", AI = false)
	private WebElement btnCopy;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-6-ActionOperator']", AI = false)
	private WebElement drpActionOperator_77;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-StepNote']", AI = false)
	private WebElement inpStepNote_55;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForNoOp']", AI = false)
	private WebElement inpRateRoutineStepInstructionForNoOp_141;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-4-ActionOperand']", AI = false)
	private WebElement inpActionOperand_53;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-LineNumberCommentRow']", AI = false)
	private WebElement inpLineNumberCommentRow;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-11-StepNote']", AI = false)
	private WebElement inpStepNote_146;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_65;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
	private WebElement inpFieldHeading_2;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-RateRoutineStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_89;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-7-SectionComment textarea", AI = false)
	private WebElement inpSectionComment_97;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-10-ActionOperator']", AI = false)
	private WebElement drpActionOperator_129;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow_163;

	@IFindBy(how = How.CSS, using = "#RateRoutineDetail-RateRoutineDetailsScreen-RateroutineDetailToolbar-Delete>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-5-ActionOperator']", AI = false)
	private WebElement drpActionOperator_64;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-StepNote']", AI = false)
	private WebElement inpStepNote_68;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-RateroutineDetailToolbar-GoToRateBook']", AI = false)
	private WebElement inpGoToRateBook;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-5-ActionOperand']", AI = false)
	private WebElement inpActionOperand_66;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-SectionCommentInstruction']", AI = false)
	private WebElement inpSectionCommentInstruction_18;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-12-StepNote']", AI = false)
	private WebElement inpStepNote_159;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-LeftParenthesisGroup']", AI = false)
	private WebElement inpLeftParenthesisGroup_78;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-0-ActionOperator']", AI = false)
	private WebElement drpActionOperator;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-7-RateRoutineVoidFunctionStepInstruction-RateRoutineStepInstruction-RateRoutineStepInstructionForAssignment']", AI = false)
	private WebElement inpRateRoutineStepInstructionForAssignment_99;

	@IFindBy(how = How.CSS, using = "select[name='RateRoutineDetail-RateRoutineDetailsScreen-9-ActionOperator']", AI = false)
	private WebElement drpActionOperator_116;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-10-LineNumber']", AI = false)
	private WebElement inpLineNumber_127;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
	private WebElement inpLanguageHeading;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-LineNumberVoidFunctionRow']", AI = false)
	private WebElement inpLineNumberVoidFunctionRow;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-6-ActionOperand']", AI = false)
	private WebElement inpActionOperand_79;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-1-RightParenthesisGroup']", AI = false)
	private WebElement inpRightParenthesisGroup_15;

	@IFindBy(how = How.CSS, using = "input[name='RateRoutineDetail-RateRoutineDetailsScreen-0-LineNumber']", AI = false)
	private WebElement inpLineNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Code']", AI = false)
	private WebElement lblCode;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Version']", AI = false)
	private WebElement lblVersion;
	
	@IFindBy(how = How.CSS, using = "div[id$='-RoutineLOB']", AI = false)
	private WebElement lblPolicyLine;
	
	@IFindBy(how = How.CSS, using = "div[id$='-RoutineParamSet']", AI = false)
	private WebElement lblParameterSet;
	
	@IFindBy(how = How.CSS, using = "div[id$='-ParamInfo']", AI = false)
	private WebElement lblParametersInParameterSet;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Language']", AI = false)
	private WebElement lblLanguage;
	
	@IFindBy(how = How.CSS, using = "td[id$='-RateRoutineInstructionColumnLabel_Cell']", AI = false)
	private WebElement lblInstruction;
	
	@IFindBy(how = How.CSS, using = "td[id$='-StepOperatorColumnLabel_Cell']", AI = false)
	private WebElement lblOp;
	
	@IFindBy(how = How.CSS, using = "td[id$='-RateRoutineOperandColumnLabel_Cell']", AI = false)
	private WebElement lblOperand;
	
	@IFindBy(how = How.CSS, using = "td[id$='-StepNoteColumnLabel_Cell']", AI = false)
	private WebElement lblLineComment;

	public RateRountineNamePage(){
	}

	public RateRountineNamePage(WebDriver driver){
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
}public RateRountineNamePage enterStepNote_81(WebDriver driver,String StepNote_81) {
		            BrowserActions.type(driver, inpStepNote_81,StepNote_81, "StepNote_81");
			        return this;
           }
public RateRountineNamePage enterSectionComment_71(WebDriver driver,String SectionComment_71) {
		            BrowserActions.type(driver, inpSectionComment_71,SectionComment_71, "SectionComment_71");
			        return this;
           }
public RateRountineNamePage enterStepNote_120(WebDriver driver,String StepNote_120) {
		            BrowserActions.type(driver, inpStepNote_120,StepNote_120, "StepNote_120");
			        return this;
           }
public RateRountineNamePage enterStepNoteColumnLabel(WebDriver driver,String StepNoteColumnLabel) {
		            BrowserActions.type(driver, inpStepNoteColumnLabel,StepNoteColumnLabel, "StepNoteColumnLabel");
			        return this;
           }
public RateRountineNamePage enterLineNumber_114(WebDriver driver,String LineNumber_114) {
		            BrowserActions.type(driver, inpLineNumber_114,LineNumber_114, "LineNumber_114");
			        return this;
           }
public RateRountineNamePage enterSectionComment_162(WebDriver driver,String SectionComment_162) {
		            BrowserActions.type(driver, inpSectionComment_162,SectionComment_162, "SectionComment_162");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction(WebDriver driver,String SectionCommentInstruction) {
		            BrowserActions.type(driver, inpSectionCommentInstruction,SectionCommentInstruction, "SectionCommentInstruction");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_67(WebDriver driver,String RightParenthesisGroup_67) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_67,RightParenthesisGroup_67, "RightParenthesisGroup_67");
			        return this;
           }
public RateRountineNamePage enterCode(WebDriver driver,String Code) {
		            BrowserActions.type(driver, inpCode,Code, "Code");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_46(WebDriver driver,String LineNumberVoidFunctionRow_46) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_46,LineNumberVoidFunctionRow_46, "LineNumberVoidFunctionRow_46");
			        return this;
           }
public RateRountineNamePage enterLineNumber_88(WebDriver driver,String LineNumber_88) {
		            BrowserActions.type(driver, inpLineNumber_88,LineNumber_88, "LineNumber_88");
			        return this;
           }
public RateRountineNamePage enterSectionComment_84(WebDriver driver,String SectionComment_84) {
		            BrowserActions.type(driver, inpSectionComment_84,SectionComment_84, "SectionComment_84");
			        return this;
           }
public RateRountineNamePage enterStepNote_133(WebDriver driver,String StepNote_133) {
		            BrowserActions.type(driver, inpStepNote_133,StepNote_133, "StepNote_133");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_52(WebDriver driver,String LeftParenthesisGroup_52) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_52,LeftParenthesisGroup_52, "LeftParenthesisGroup_52");
			        return this;
           }
public RateRountineNamePage enterLineNumber_101(WebDriver driver,String LineNumber_101) {
		            BrowserActions.type(driver, inpLineNumber_101,LineNumber_101, "LineNumber_101");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_80(WebDriver driver,String RightParenthesisGroup_80) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_80,RightParenthesisGroup_80, "RightParenthesisGroup_80");
			        return this;
           }
public RateRountineNamePage enterSectionComment(WebDriver driver,String SectionComment) {
		            BrowserActions.type(driver, inpSectionComment,SectionComment, "SectionComment");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_165(WebDriver driver,String VoidFunctionStepNote_165) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_165,VoidFunctionStepNote_165, "VoidFunctionStepNote_165");
			        return this;
           }
public RateRountineNamePage enterActionOperand_92(WebDriver driver,String ActionOperand_92) {
		            BrowserActions.type(driver, inpActionOperand_92,ActionOperand_92, "ActionOperand_92");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_33(WebDriver driver,String LineNumberVoidFunctionRow_33) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_33,LineNumberVoidFunctionRow_33, "LineNumberVoidFunctionRow_33");
			        return this;
           }
public RateRountineNamePage enterLineNumber_75(WebDriver driver,String LineNumber_75) {
		            BrowserActions.type(driver, inpLineNumber_75,LineNumber_75, "LineNumber_75");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_17(WebDriver driver,String LineNumberCommentRow_17) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_17,LineNumberCommentRow_17, "LineNumberCommentRow_17");
			        return this;
           }
public RateRountineNamePage enterStepNote_94(WebDriver driver,String StepNote_94) {
		            BrowserActions.type(driver, inpStepNote_94,StepNote_94, "StepNote_94");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_104(WebDriver driver,String LeftParenthesisGroup_104) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_104,LeftParenthesisGroup_104, "LeftParenthesisGroup_104");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_30(WebDriver driver,String LineNumberCommentRow_30) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_30,LineNumberCommentRow_30, "LineNumberCommentRow_30");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroupColumnLabel(WebDriver driver,String LeftParenthesisGroupColumnLabel) {
		            BrowserActions.type(driver, inpLeftParenthesisGroupColumnLabel,LeftParenthesisGroupColumnLabel, "LeftParenthesisGroupColumnLabel");
			        return this;
           }
public RateRountineNamePage enterLastUpdateTime(WebDriver driver,String LastUpdateTime) {
		            BrowserActions.type(driver, inpLastUpdateTime,LastUpdateTime, "LastUpdateTime");
			        return this;
           }
public RateRountineNamePage enterRateRoutineLineNumberColumnLabel(WebDriver driver,String RateRoutineLineNumberColumnLabel) {
		            BrowserActions.type(driver, inpRateRoutineLineNumberColumnLabel,RateRoutineLineNumberColumnLabel, "RateRoutineLineNumberColumnLabel");
			        return this;
           }
public RateRountineNamePage enterSectionComment_58(WebDriver driver,String SectionComment_58) {
		            BrowserActions.type(driver, inpSectionComment_58,SectionComment_58, "SectionComment_58");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_26(WebDriver driver,String LeftParenthesisGroup_26) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_26,LeftParenthesisGroup_26, "LeftParenthesisGroup_26");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_41(WebDriver driver,String RightParenthesisGroup_41) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_41,RightParenthesisGroup_41, "RightParenthesisGroup_41");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup(WebDriver driver,String RightParenthesisGroup) {
		            BrowserActions.type(driver, inpRightParenthesisGroup,RightParenthesisGroup, "RightParenthesisGroup");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_20(WebDriver driver,String LineNumberVoidFunctionRow_20) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_20,LineNumberVoidFunctionRow_20, "LineNumberVoidFunctionRow_20");
			        return this;
           }
public RateRountineNamePage enterVersion(WebDriver driver,String Version) {
		            BrowserActions.type(driver, inpVersion,Version, "Version");
			        return this;
           }
public RateRountineNamePage enterLineNumber_62(WebDriver driver,String LineNumber_62) {
		            BrowserActions.type(driver, inpLineNumber_62,LineNumber_62, "LineNumber_62");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_117(WebDriver driver,String LeftParenthesisGroup_117) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_117,LeftParenthesisGroup_117, "LeftParenthesisGroup_117");
			        return this;
           }
public RateRountineNamePage enterSectionComment_149(WebDriver driver,String SectionComment_149) {
		            BrowserActions.type(driver, inpSectionComment_149,SectionComment_149, "SectionComment_149");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_43(WebDriver driver,String LineNumberCommentRow_43) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_43,LineNumberCommentRow_43, "LineNumberCommentRow_43");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_108(WebDriver driver,String LineNumberCommentRow_108) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_108,LineNumberCommentRow_108, "LineNumberCommentRow_108");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroupColumnLabel(WebDriver driver,String RightParenthesisGroupColumnLabel) {
		            BrowserActions.type(driver, inpRightParenthesisGroupColumnLabel,RightParenthesisGroupColumnLabel, "RightParenthesisGroupColumnLabel");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_39(WebDriver driver,String LeftParenthesisGroup_39) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_39,LeftParenthesisGroup_39, "LeftParenthesisGroup_39");
			        return this;
           }
public RateRountineNamePage selectActionOperator_155(WebDriver driver,String ActionOperator_155)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_155,ActionOperator_155,"ActionOperator_155");
				    return this;
			}
public RateRountineNamePage enterRightParenthesisGroup_54(WebDriver driver,String RightParenthesisGroup_54) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_54,RightParenthesisGroup_54, "RightParenthesisGroup_54");
			        return this;
           }
public RateRountineNamePage enterSectionComment_136(WebDriver driver,String SectionComment_136) {
		            BrowserActions.type(driver, inpSectionComment_136,SectionComment_136, "SectionComment_136");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup(WebDriver driver,String LeftParenthesisGroup) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup,LeftParenthesisGroup, "LeftParenthesisGroup");
			        return this;
           }
public RateRountineNamePage enterStepNote_107(WebDriver driver,String StepNote_107) {
		            BrowserActions.type(driver, inpStepNote_107,StepNote_107, "StepNote_107");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_56(WebDriver driver,String LineNumberCommentRow_56) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_56,LineNumberCommentRow_56, "LineNumberCommentRow_56");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_130(WebDriver driver,String LeftParenthesisGroup_130) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_130,LeftParenthesisGroup_130, "LeftParenthesisGroup_130");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_21(WebDriver driver,String RateRoutineStepInstructionForAssignment_21) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_21,RateRoutineStepInstructionForAssignment_21, "RateRoutineStepInstructionForAssignment_21");
			        return this;
           }
public RateRountineNamePage enterSectionComment_32(WebDriver driver,String SectionComment_32) {
		            BrowserActions.type(driver, inpSectionComment_32,SectionComment_32, "SectionComment_32");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_83(WebDriver driver,String SectionCommentInstruction_83) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_83,SectionCommentInstruction_83, "SectionCommentInstruction_83");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_24(WebDriver driver,String RateRoutineStepInstructionForAssignment_24) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_24,RateRoutineStepInstructionForAssignment_24, "RateRoutineStepInstructionForAssignment_24");
			        return this;
           }
public RateRountineNamePage enterLineNumber_49(WebDriver driver,String LineNumber_49) {
		            BrowserActions.type(driver, inpLineNumber_49,LineNumber_49, "LineNumber_49");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_85(WebDriver driver,String LineNumberVoidFunctionRow_85) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_85,LineNumberVoidFunctionRow_85, "LineNumberVoidFunctionRow_85");
			        return this;
           }
public RateRountineNamePage enterLanguage(WebDriver driver,String Language) {
		            BrowserActions.type(driver, inpLanguage,Language, "Language");
			        return this;
           }
public RateRountineNamePage enterSectionComment_123(WebDriver driver,String SectionComment_123) {
		            BrowserActions.type(driver, inpSectionComment_123,SectionComment_123, "SectionComment_123");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_48(WebDriver driver,String VoidFunctionStepNote_48) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_48,VoidFunctionStepNote_48, "VoidFunctionStepNote_48");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_139(WebDriver driver,String VoidFunctionStepNote_139) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_139,VoidFunctionStepNote_139, "VoidFunctionStepNote_139");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_13(WebDriver driver,String LeftParenthesisGroup_13) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_13,LeftParenthesisGroup_13, "LeftParenthesisGroup_13");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_143(WebDriver driver,String LeftParenthesisGroup_143) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_143,LeftParenthesisGroup_143, "LeftParenthesisGroup_143");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_69(WebDriver driver,String LineNumberCommentRow_69) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_69,LineNumberCommentRow_69, "LineNumberCommentRow_69");
			        return this;
           }
public RateRountineNamePage enterRateRoutineInstructionColumnLabel(WebDriver driver,String RateRoutineInstructionColumnLabel) {
		            BrowserActions.type(driver, inpRateRoutineInstructionColumnLabel,RateRoutineInstructionColumnLabel, "RateRoutineInstructionColumnLabel");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_34(WebDriver driver,String RateRoutineStepInstructionForAssignment_34) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_34,RateRoutineStepInstructionForAssignment_34, "RateRoutineStepInstructionForAssignment_34");
			        return this;
           }
public RateRountineNamePage enterActionOperand_105(WebDriver driver,String ActionOperand_105) {
		            BrowserActions.type(driver, inpActionOperand_105,ActionOperand_105, "ActionOperand_105");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_121(WebDriver driver,String LineNumberCommentRow_121) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_121,LineNumberCommentRow_121, "LineNumberCommentRow_121");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_37(WebDriver driver,String RateRoutineStepInstructionForAssignment_37) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_37,RateRoutineStepInstructionForAssignment_37, "RateRoutineStepInstructionForAssignment_37");
			        return this;
           }
public RateRountineNamePage enterSectionComment_45(WebDriver driver,String SectionComment_45) {
		            BrowserActions.type(driver, inpSectionComment_45,SectionComment_45, "SectionComment_45");
			        return this;
           }
public RateRountineNamePage enterActionOperand(WebDriver driver,String ActionOperand) {
		            BrowserActions.type(driver, inpActionOperand,ActionOperand, "ActionOperand");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_70(WebDriver driver,String SectionCommentInstruction_70) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_70,SectionCommentInstruction_70, "SectionCommentInstruction_70");
			        return this;
           }
public RateRountineNamePage enterLineNumber_36(WebDriver driver,String LineNumber_36) {
		            BrowserActions.type(driver, inpLineNumber_36,LineNumber_36, "LineNumber_36");
			        return this;
           }
public RateRountineNamePage enterSectionComment_110(WebDriver driver,String SectionComment_110) {
		            BrowserActions.type(driver, inpSectionComment_110,SectionComment_110, "SectionComment_110");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_72(WebDriver driver,String LineNumberVoidFunctionRow_72) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_72,LineNumberVoidFunctionRow_72, "LineNumberVoidFunctionRow_72");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_126(WebDriver driver,String VoidFunctionStepNote_126) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_126,VoidFunctionStepNote_126, "VoidFunctionStepNote_126");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_35(WebDriver driver,String VoidFunctionStepNote_35) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_35,VoidFunctionStepNote_35, "VoidFunctionStepNote_35");
			        return this;
           }
public RateRountineNamePage selectParameterSet(WebDriver driver,String ParameterSet)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpParameterSet,ParameterSet,"ParameterSet");
				    return this;
			}
public RateRountineNamePage enterSectionCommentInstruction_161(WebDriver driver,String SectionCommentInstruction_161) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_161,SectionCommentInstruction_161, "SectionCommentInstruction_161");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_156(WebDriver driver,String LeftParenthesisGroup_156) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_156,LeftParenthesisGroup_156, "LeftParenthesisGroup_156");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp_10(WebDriver driver,String RateRoutineStepInstructionForNoOp_10) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp_10,RateRoutineStepInstructionForNoOp_10, "RateRoutineStepInstructionForNoOp_10");
			        return this;
           }
public RateRountineNamePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public RateRountineNamePage enterVoidFunctionStepNote(WebDriver driver,String VoidFunctionStepNote) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote,VoidFunctionStepNote, "VoidFunctionStepNote");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_134(WebDriver driver,String LineNumberCommentRow_134) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_134,LineNumberCommentRow_134, "LineNumberCommentRow_134");
			        return this;
           }
public RateRountineNamePage enterStepOperatorColumnLabel(WebDriver driver,String StepOperatorColumnLabel) {
		            BrowserActions.type(driver, inpStepOperatorColumnLabel,StepOperatorColumnLabel, "StepOperatorColumnLabel");
			        return this;
           }
public RateRountineNamePage clickParamInfo(WebDriver driver)  {
					BrowserActions.click(driver, btnParamInfo,"ParamInfo");
				    return this;
			}
public RateRountineNamePage enterRightParenthesisGroup_93(WebDriver driver,String RightParenthesisGroup_93) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_93,RightParenthesisGroup_93, "RightParenthesisGroup_93");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_152(WebDriver driver,String VoidFunctionStepNote_152) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_152,VoidFunctionStepNote_152, "VoidFunctionStepNote_152");
			        return this;
           }
public RateRountineNamePage enterLineNumber_23(WebDriver driver,String LineNumber_23) {
		            BrowserActions.type(driver, inpLineNumber_23,LineNumber_23, "LineNumber_23");
			        return this;
           }
public RateRountineNamePage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public RateRountineNamePage enterVoidFunctionStepNote_22(WebDriver driver,String VoidFunctionStepNote_22) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_22,VoidFunctionStepNote_22, "VoidFunctionStepNote_22");
			        return this;
           }
public RateRountineNamePage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public RateRountineNamePage enterLineNumberCommentRow_147(WebDriver driver,String LineNumberCommentRow_147) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_147,LineNumberCommentRow_147, "LineNumberCommentRow_147");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_96(WebDriver driver,String SectionCommentInstruction_96) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_96,SectionCommentInstruction_96, "SectionCommentInstruction_96");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_82(WebDriver driver,String LineNumberCommentRow_82) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_82,LineNumberCommentRow_82, "LineNumberCommentRow_82");
			        return this;
           }
public RateRountineNamePage enterLastUpdatedBy(WebDriver driver,String LastUpdatedBy) {
		            BrowserActions.type(driver, inpLastUpdatedBy,LastUpdatedBy, "LastUpdatedBy");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_138(WebDriver driver,String RateRoutineStepInstructionForAssignment_138) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_138,RateRoutineStepInstructionForAssignment_138, "RateRoutineStepInstructionForAssignment_138");
			        return this;
           }
public RateRountineNamePage enterActionOperand_118(WebDriver driver,String ActionOperand_118) {
		            BrowserActions.type(driver, inpActionOperand_118,ActionOperand_118, "ActionOperand_118");
			        return this;
           }
public RateRountineNamePage enterSectionComment_19(WebDriver driver,String SectionComment_19) {
		            BrowserActions.type(driver, inpSectionComment_19,SectionComment_19, "SectionComment_19");
			        return this;
           }
public RateRountineNamePage enterLineNumber_11(WebDriver driver,String LineNumber_11) {
		            BrowserActions.type(driver, inpLineNumber_11,LineNumber_11, "LineNumber_11");
			        return this;
           }
public RateRountineNamePage clickCreateNewVersion(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateNewVersion,"CreateNewVersion");
				    return this;
			}
public RateRountineNamePage enterLineNumberVoidFunctionRow_59(WebDriver driver,String LineNumberVoidFunctionRow_59) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_59,LineNumberVoidFunctionRow_59, "LineNumberVoidFunctionRow_59");
			        return this;
           }
public RateRountineNamePage enterRateRoutineOperandColumnLabel(WebDriver driver,String RateRoutineOperandColumnLabel) {
		            BrowserActions.type(driver, inpRateRoutineOperandColumnLabel,RateRoutineOperandColumnLabel, "RateRoutineOperandColumnLabel");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_95(WebDriver driver,String LineNumberCommentRow_95) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_95,LineNumberCommentRow_95, "LineNumberCommentRow_95");
			        return this;
           }
public RateRountineNamePage selectActionOperator_51(WebDriver driver,String ActionOperator_51)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_51,ActionOperator_51,"ActionOperator_51");
				    return this;
			}
public RateRountineNamePage enterSectionCommentInstruction_148(WebDriver driver,String SectionCommentInstruction_148) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_148,SectionCommentInstruction_148, "SectionCommentInstruction_148");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp(WebDriver driver,String RateRoutineStepInstructionForNoOp) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp,RateRoutineStepInstructionForNoOp, "RateRoutineStepInstructionForNoOp");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_44(WebDriver driver,String SectionCommentInstruction_44) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_44,SectionCommentInstruction_44, "SectionCommentInstruction_44");
			        return this;
           }
public RateRountineNamePage selectActionOperator_103(WebDriver driver,String ActionOperator_103)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_103,ActionOperator_103,"ActionOperator_103");
				    return this;
			}
public RateRountineNamePage enterActionOperand_131(WebDriver driver,String ActionOperand_131) {
		            BrowserActions.type(driver, inpActionOperand_131,ActionOperand_131, "ActionOperand_131");
			        return this;
           }
public RateRountineNamePage clickClose_1(WebDriver driver)  {
					BrowserActions.click(driver, btnClose_1,"Close_1");
				    return this;
			}
public RateRountineNamePage enterColumn(WebDriver driver,String Column) {
		            BrowserActions.type(driver, inpColumn,Column, "Column");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_128(WebDriver driver,String RateRoutineStepInstructionForAssignment_128) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_128,RateRoutineStepInstructionForAssignment_128, "RateRoutineStepInstructionForAssignment_128");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_125(WebDriver driver,String RateRoutineStepInstructionForAssignment_125) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_125,RateRoutineStepInstructionForAssignment_125, "RateRoutineStepInstructionForAssignment_125");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_63(WebDriver driver,String RateRoutineStepInstructionForAssignment_63) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_63,RateRoutineStepInstructionForAssignment_63, "RateRoutineStepInstructionForAssignment_63");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_60(WebDriver driver,String RateRoutineStepInstructionForAssignment_60) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_60,RateRoutineStepInstructionForAssignment_60, "RateRoutineStepInstructionForAssignment_60");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_106(WebDriver driver,String RightParenthesisGroup_106) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_106,RightParenthesisGroup_106, "RightParenthesisGroup_106");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_87(WebDriver driver,String VoidFunctionStepNote_87) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_87,VoidFunctionStepNote_87, "VoidFunctionStepNote_87");
			        return this;
           }
public RateRountineNamePage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public RateRountineNamePage enterLineNumberVoidFunctionRow_111(WebDriver driver,String LineNumberVoidFunctionRow_111) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_111,LineNumberVoidFunctionRow_111, "LineNumberVoidFunctionRow_111");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_31(WebDriver driver,String SectionCommentInstruction_31) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_31,SectionCommentInstruction_31, "SectionCommentInstruction_31");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_135(WebDriver driver,String SectionCommentInstruction_135) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_135,SectionCommentInstruction_135, "SectionCommentInstruction_135");
			        return this;
           }
public RateRountineNamePage enterActionOperand_144(WebDriver driver,String ActionOperand_144) {
		            BrowserActions.type(driver, inpActionOperand_144,ActionOperand_144, "ActionOperand_144");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow_160(WebDriver driver,String LineNumberCommentRow_160) {
		            BrowserActions.type(driver, inpLineNumberCommentRow_160,LineNumberCommentRow_160, "LineNumberCommentRow_160");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_119(WebDriver driver,String RightParenthesisGroup_119) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_119,RightParenthesisGroup_119, "RightParenthesisGroup_119");
			        return this;
           }
public RateRountineNamePage enterActionOperand_14(WebDriver driver,String ActionOperand_14) {
		            BrowserActions.type(driver, inpActionOperand_14,ActionOperand_14, "ActionOperand_14");
			        return this;
           }
public RateRountineNamePage enterStepNote_16(WebDriver driver,String StepNote_16) {
		            BrowserActions.type(driver, inpStepNote_16,StepNote_16, "StepNote_16");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_73(WebDriver driver,String RateRoutineStepInstructionForAssignment_73) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_73,RateRoutineStepInstructionForAssignment_73, "RateRoutineStepInstructionForAssignment_73");
			        return this;
           }
public RateRountineNamePage enterLanguage_4(WebDriver driver,String Language_4) {
		            BrowserActions.type(driver, inpLanguage_4,Language_4, "Language_4");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_115(WebDriver driver,String RateRoutineStepInstructionForAssignment_115) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_115,RateRoutineStepInstructionForAssignment_115, "RateRoutineStepInstructionForAssignment_115");
			        return this;
           }
public RateRountineNamePage enterLanguage_7(WebDriver driver,String Language_7) {
		            BrowserActions.type(driver, inpLanguage_7,Language_7, "Language_7");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_74(WebDriver driver,String VoidFunctionStepNote_74) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_74,VoidFunctionStepNote_74, "VoidFunctionStepNote_74");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_112(WebDriver driver,String RateRoutineStepInstructionForAssignment_112) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_112,RateRoutineStepInstructionForAssignment_112, "RateRoutineStepInstructionForAssignment_112");
			        return this;
           }
public RateRountineNamePage selectActionOperator_38(WebDriver driver,String ActionOperator_38)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_38,ActionOperator_38,"ActionOperator_38");
				    return this;
			}
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment(WebDriver driver,String RateRoutineStepInstructionForAssignment) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment,RateRoutineStepInstructionForAssignment, "RateRoutineStepInstructionForAssignment");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_124(WebDriver driver,String LineNumberVoidFunctionRow_124) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_124,LineNumberVoidFunctionRow_124, "LineNumberVoidFunctionRow_124");
			        return this;
           }
public RateRountineNamePage clickCreateJurisdictionVariant(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateJurisdictionVariant,"CreateJurisdictionVariant");
				    return this;
			}
public RateRountineNamePage enterGoToRateRoutines(WebDriver driver,String GoToRateRoutines) {
		            BrowserActions.type(driver, inpGoToRateRoutines,GoToRateRoutines, "GoToRateRoutines");
			        return this;
           }
public RateRountineNamePage enterActionOperand_157(WebDriver driver,String ActionOperand_157) {
		            BrowserActions.type(driver, inpActionOperand_157,ActionOperand_157, "ActionOperand_157");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_122(WebDriver driver,String SectionCommentInstruction_122) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_122,SectionCommentInstruction_122, "SectionCommentInstruction_122");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_47(WebDriver driver,String RateRoutineStepInstructionForAssignment_47) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_47,RateRoutineStepInstructionForAssignment_47, "RateRoutineStepInstructionForAssignment_47");
			        return this;
           }
public RateRountineNamePage selectActionOperator_25(WebDriver driver,String ActionOperator_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_25,ActionOperator_25,"ActionOperator_25");
				    return this;
			}
public RateRountineNamePage enterStepNote_29(WebDriver driver,String StepNote_29) {
		            BrowserActions.type(driver, inpStepNote_29,StepNote_29, "StepNote_29");
			        return this;
           }
public RateRountineNamePage enterActionOperand_27(WebDriver driver,String ActionOperand_27) {
		            BrowserActions.type(driver, inpActionOperand_27,ActionOperand_27, "ActionOperand_27");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_61(WebDriver driver,String VoidFunctionStepNote_61) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_61,VoidFunctionStepNote_61, "VoidFunctionStepNote_61");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_102(WebDriver driver,String RateRoutineStepInstructionForAssignment_102) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_102,RateRoutineStepInstructionForAssignment_102, "RateRoutineStepInstructionForAssignment_102");
			        return this;
           }
public RateRountineNamePage enterVoidFunctionStepNote_113(WebDriver driver,String VoidFunctionStepNote_113) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_113,VoidFunctionStepNote_113, "VoidFunctionStepNote_113");
			        return this;
           }
public RateRountineNamePage enterFieldHeading(WebDriver driver,String FieldHeading) {
		            BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			        return this;
           }
public RateRountineNamePage clickLastUpdateTimeDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLastUpdateTimeDateIcon,"LastUpdateTimeDateIcon");
				    return this;
			}
public RateRountineNamePage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public RateRountineNamePage enterColumn_8(WebDriver driver,String Column_8) {
		            BrowserActions.type(driver, inpColumn_8,Column_8, "Column_8");
			        return this;
           }
public RateRountineNamePage enterColumn_9(WebDriver driver,String Column_9) {
		            BrowserActions.type(driver, inpColumn_9,Column_9, "Column_9");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_57(WebDriver driver,String SectionCommentInstruction_57) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_57,SectionCommentInstruction_57, "SectionCommentInstruction_57");
			        return this;
           }
public RateRountineNamePage enterColumn_6(WebDriver driver,String Column_6) {
		            BrowserActions.type(driver, inpColumn_6,Column_6, "Column_6");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_137(WebDriver driver,String LineNumberVoidFunctionRow_137) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_137,LineNumberVoidFunctionRow_137, "LineNumberVoidFunctionRow_137");
			        return this;
           }
public RateRountineNamePage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public RateRountineNamePage enterColumn_5(WebDriver driver,String Column_5) {
		            BrowserActions.type(driver, inpColumn_5,Column_5, "Column_5");
			        return this;
           }
public RateRountineNamePage enterColumn_3(WebDriver driver,String Column_3) {
		            BrowserActions.type(driver, inpColumn_3,Column_3, "Column_3");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_132(WebDriver driver,String RightParenthesisGroup_132) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_132,RightParenthesisGroup_132, "RightParenthesisGroup_132");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_109(WebDriver driver,String SectionCommentInstruction_109) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_109,SectionCommentInstruction_109, "SectionCommentInstruction_109");
			        return this;
           }
public RateRountineNamePage selectActionOperator_12(WebDriver driver,String ActionOperator_12)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_12,ActionOperator_12,"ActionOperator_12");
				    return this;
			}
public RateRountineNamePage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public RateRountineNamePage enterVoidFunctionStepNote_100(WebDriver driver,String VoidFunctionStepNote_100) {
		            BrowserActions.type(driver, inpVoidFunctionStepNote_100,VoidFunctionStepNote_100, "VoidFunctionStepNote_100");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_50(WebDriver driver,String RateRoutineStepInstructionForAssignment_50) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_50,RateRoutineStepInstructionForAssignment_50, "RateRoutineStepInstructionForAssignment_50");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp_164(WebDriver driver,String RateRoutineStepInstructionForNoOp_164) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp_164,RateRoutineStepInstructionForNoOp_164, "RateRoutineStepInstructionForNoOp_164");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_98(WebDriver driver,String LineNumberVoidFunctionRow_98) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_98,LineNumberVoidFunctionRow_98, "LineNumberVoidFunctionRow_98");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp_76(WebDriver driver,String RateRoutineStepInstructionForNoOp_76) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp_76,RateRoutineStepInstructionForNoOp_76, "RateRoutineStepInstructionForNoOp_76");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_145(WebDriver driver,String RightParenthesisGroup_145) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_145,RightParenthesisGroup_145, "RightParenthesisGroup_145");
			        return this;
           }
public RateRountineNamePage enterLineNumber_153(WebDriver driver,String LineNumber_153) {
		            BrowserActions.type(driver, inpLineNumber_153,LineNumber_153, "LineNumber_153");
			        return this;
           }
public RateRountineNamePage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public RateRountineNamePage selectActionOperator_90(WebDriver driver,String ActionOperator_90)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_90,ActionOperator_90,"ActionOperator_90");
				    return this;
			}
public RateRountineNamePage selectActionOperator_142(WebDriver driver,String ActionOperator_142)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_142,ActionOperator_142,"ActionOperator_142");
				    return this;
			}
public RateRountineNamePage enterRightParenthesisGroup_28(WebDriver driver,String RightParenthesisGroup_28) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_28,RightParenthesisGroup_28, "RightParenthesisGroup_28");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp_154(WebDriver driver,String RateRoutineStepInstructionForNoOp_154) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp_154,RateRoutineStepInstructionForNoOp_154, "RateRoutineStepInstructionForNoOp_154");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_91(WebDriver driver,String LeftParenthesisGroup_91) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_91,LeftParenthesisGroup_91, "LeftParenthesisGroup_91");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp_151(WebDriver driver,String RateRoutineStepInstructionForNoOp_151) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp_151,RateRoutineStepInstructionForNoOp_151, "RateRoutineStepInstructionForNoOp_151");
			        return this;
           }
public RateRountineNamePage enterActionOperand_40(WebDriver driver,String ActionOperand_40) {
		            BrowserActions.type(driver, inpActionOperand_40,ActionOperand_40, "ActionOperand_40");
			        return this;
           }
public RateRountineNamePage enterStepNote_42(WebDriver driver,String StepNote_42) {
		            BrowserActions.type(driver, inpStepNote_42,StepNote_42, "StepNote_42");
			        return this;
           }
public RateRountineNamePage enterStepNote(WebDriver driver,String StepNote) {
		            BrowserActions.type(driver, inpStepNote,StepNote, "StepNote");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp_86(WebDriver driver,String RateRoutineStepInstructionForNoOp_86) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp_86,RateRoutineStepInstructionForNoOp_86, "RateRoutineStepInstructionForNoOp_86");
			        return this;
           }
public RateRountineNamePage enterLineNumber_140(WebDriver driver,String LineNumber_140) {
		            BrowserActions.type(driver, inpLineNumber_140,LineNumber_140, "LineNumber_140");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow_150(WebDriver driver,String LineNumberVoidFunctionRow_150) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_150,LineNumberVoidFunctionRow_150, "LineNumberVoidFunctionRow_150");
			        return this;
           }
public RateRountineNamePage selectPolicyLine(WebDriver driver,String PolicyLine)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLine,PolicyLine,"PolicyLine");
				    return this;
			}
public RateRountineNamePage enterRightParenthesisGroup_158(WebDriver driver,String RightParenthesisGroup_158) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_158,RightParenthesisGroup_158, "RightParenthesisGroup_158");
			        return this;
           }
public RateRountineNamePage clickCopy(WebDriver driver)  {
					BrowserActions.click(driver, btnCopy,"Copy");
				    return this;
			}
public RateRountineNamePage selectActionOperator_77(WebDriver driver,String ActionOperator_77)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_77,ActionOperator_77,"ActionOperator_77");
				    return this;
			}
public RateRountineNamePage enterStepNote_55(WebDriver driver,String StepNote_55) {
		            BrowserActions.type(driver, inpStepNote_55,StepNote_55, "StepNote_55");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForNoOp_141(WebDriver driver,String RateRoutineStepInstructionForNoOp_141) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForNoOp_141,RateRoutineStepInstructionForNoOp_141, "RateRoutineStepInstructionForNoOp_141");
			        return this;
           }
public RateRountineNamePage enterActionOperand_53(WebDriver driver,String ActionOperand_53) {
		            BrowserActions.type(driver, inpActionOperand_53,ActionOperand_53, "ActionOperand_53");
			        return this;
           }
public RateRountineNamePage enterLineNumberCommentRow(WebDriver driver,String LineNumberCommentRow) {
		            BrowserActions.type(driver, inpLineNumberCommentRow,LineNumberCommentRow, "LineNumberCommentRow");
			        return this;
           }
public RateRountineNamePage enterStepNote_146(WebDriver driver,String StepNote_146) {
		            BrowserActions.type(driver, inpStepNote_146,StepNote_146, "StepNote_146");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_65(WebDriver driver,String LeftParenthesisGroup_65) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_65,LeftParenthesisGroup_65, "LeftParenthesisGroup_65");
			        return this;
           }
public RateRountineNamePage enterFieldHeading_2(WebDriver driver,String FieldHeading_2) {
		            BrowserActions.type(driver, inpFieldHeading_2,FieldHeading_2, "FieldHeading_2");
			        return this;
           }
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_89(WebDriver driver,String RateRoutineStepInstructionForAssignment_89) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_89,RateRoutineStepInstructionForAssignment_89, "RateRoutineStepInstructionForAssignment_89");
			        return this;
           }
public RateRountineNamePage enterSectionComment_97(WebDriver driver,String SectionComment_97) {
		            BrowserActions.type(driver, inpSectionComment_97,SectionComment_97, "SectionComment_97");
			        return this;
           }
public RateRountineNamePage selectActionOperator_129(WebDriver driver,String ActionOperator_129)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_129,ActionOperator_129,"ActionOperator_129");
				    return this;
			}
public RateRountineNamePage enterLineNumberVoidFunctionRow_163(WebDriver driver,String LineNumberVoidFunctionRow_163) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow_163,LineNumberVoidFunctionRow_163, "LineNumberVoidFunctionRow_163");
			        return this;
           }
public RateRountineNamePage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public RateRountineNamePage selectActionOperator_64(WebDriver driver,String ActionOperator_64)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_64,ActionOperator_64,"ActionOperator_64");
				    return this;
			}
public RateRountineNamePage enterStepNote_68(WebDriver driver,String StepNote_68) {
		            BrowserActions.type(driver, inpStepNote_68,StepNote_68, "StepNote_68");
			        return this;
           }
public RateRountineNamePage enterGoToRateBook(WebDriver driver,String GoToRateBook) {
		            BrowserActions.type(driver, inpGoToRateBook,GoToRateBook, "GoToRateBook");
			        return this;
           }
public RateRountineNamePage enterActionOperand_66(WebDriver driver,String ActionOperand_66) {
		            BrowserActions.type(driver, inpActionOperand_66,ActionOperand_66, "ActionOperand_66");
			        return this;
           }
public RateRountineNamePage enterSectionCommentInstruction_18(WebDriver driver,String SectionCommentInstruction_18) {
		            BrowserActions.type(driver, inpSectionCommentInstruction_18,SectionCommentInstruction_18, "SectionCommentInstruction_18");
			        return this;
           }
public RateRountineNamePage enterStepNote_159(WebDriver driver,String StepNote_159) {
		            BrowserActions.type(driver, inpStepNote_159,StepNote_159, "StepNote_159");
			        return this;
           }
public RateRountineNamePage enterLeftParenthesisGroup_78(WebDriver driver,String LeftParenthesisGroup_78) {
		            BrowserActions.type(driver, inpLeftParenthesisGroup_78,LeftParenthesisGroup_78, "LeftParenthesisGroup_78");
			        return this;
           }
public RateRountineNamePage selectActionOperator(WebDriver driver,String ActionOperator)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator,ActionOperator,"ActionOperator");
				    return this;
			}
public RateRountineNamePage enterRateRoutineStepInstructionForAssignment_99(WebDriver driver,String RateRoutineStepInstructionForAssignment_99) {
		            BrowserActions.type(driver, inpRateRoutineStepInstructionForAssignment_99,RateRoutineStepInstructionForAssignment_99, "RateRoutineStepInstructionForAssignment_99");
			        return this;
           }
public RateRountineNamePage selectActionOperator_116(WebDriver driver,String ActionOperator_116)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActionOperator_116,ActionOperator_116,"ActionOperator_116");
				    return this;
			}
public RateRountineNamePage enterLineNumber_127(WebDriver driver,String LineNumber_127) {
		            BrowserActions.type(driver, inpLineNumber_127,LineNumber_127, "LineNumber_127");
			        return this;
           }
public RateRountineNamePage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
		            BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			        return this;
           }
public RateRountineNamePage enterLineNumberVoidFunctionRow(WebDriver driver,String LineNumberVoidFunctionRow) {
		            BrowserActions.type(driver, inpLineNumberVoidFunctionRow,LineNumberVoidFunctionRow, "LineNumberVoidFunctionRow");
			        return this;
           }
public RateRountineNamePage enterActionOperand_79(WebDriver driver,String ActionOperand_79) {
		            BrowserActions.type(driver, inpActionOperand_79,ActionOperand_79, "ActionOperand_79");
			        return this;
           }
public RateRountineNamePage enterRightParenthesisGroup_15(WebDriver driver,String RightParenthesisGroup_15) {
		            BrowserActions.type(driver, inpRightParenthesisGroup_15,RightParenthesisGroup_15, "RightParenthesisGroup_15");
			        return this;
           }
public RateRountineNamePage enterLineNumber(WebDriver driver,String LineNumber) {
		            BrowserActions.type(driver, inpLineNumber,LineNumber, "LineNumber");
			        return this;
           }

/**
 * Verify Create New Version button  is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyCreateNewVersion(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnCreateNewVersion, "Create New Version Button");
	return this;
}

/**
 * Verify Create Jurisdiction Variant button is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyCreateJurisdictionVariant(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnCreateJurisdictionVariant, "Create Jurisdiction Variant Button");
	return this;
}

/**
 * Verify label Create New Version  is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyCodeIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblCode, "Code");
	return this;
}
/**
 * Verify label Create Policy line is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyPolicyLineIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblPolicyLine, "Policy Line");
	return this;
}

/**
 * Verify label Parameter set is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyParametersetIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblParameterSet, "Parameter set");
	return this;
}

/**
 * Verify label Parameter set In ParameterSet is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyParametersInParameterSetIsDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblParametersInParameterSet, "Parameter in Parameter set");
	return this;
}

/**
 * Verify label Language is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyLanguageDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblLanguage, "Language");
	return this;
}

/**
 * Verify label Instruction is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyInstructionDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblInstruction, "Instruction");
	return this;
}

/**
 * Verify label op is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyOpDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblOp, "Op");
	return this;
}

/**
 * Verify label Operand is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyOperandDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblOperand, "Operand");
	return this;
}

/**
 * Verify label Line Comment is display
 * @param driver 
 * @return
 */
public RateRountineNamePage verifyLineCommentDisplayed(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblLineComment, "Line Comment");
	return this;
}
}
}
