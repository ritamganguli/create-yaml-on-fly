package com.aspire.guidewire.pc.pages.nonlob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

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

public class ActivityPatternsPage extends LoadableComponent<ActivityPatternsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Subject']", AI = false)
	private WebElement inpSubject_49;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Category']", AI = false)
	private WebElement drpCategory_3;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_63;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_7;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_64;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Type']", AI = false)
	private WebElement drpType_76;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Subject']", AI = false)
	private WebElement inpSubject_105;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Type']", AI = false)
	private WebElement drpType_84;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Category']", AI = false)
	private WebElement drpCategory;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Priority']", AI = false)
	private WebElement drpPriority_45;

	@IFindBy(how = How.CSS, using = "#ActivityPatterns-ActivityPatternsScreen-ActivityPatterns_NewActivityPatternButton>div[role='button']", AI = false)
	private WebElement btnNewActivityPattern;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-ActivityClass']", AI = false)
	private WebElement drpActivityClass_34;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Mandatory']", AI = false)
	private WebElement rdbMandatory_62;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Category']", AI = false)
	private WebElement drpCategory_83;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-ActivityClass']", AI = false)
	private WebElement drpActivityClass;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Subject']", AI = false)
	private WebElement inpSubject_57;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Priority']", AI = false)
	private WebElement drpPriority_29;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Subject']", AI = false)
	private WebElement inpSubject_9;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_55;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-PatternLevel']", AI = false)
	private WebElement drpPatternLevel;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-ActivityClass']", AI = false)
	private WebElement drpActivityClass_2;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_72;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Subject']", AI = false)
	private WebElement inpSubject_1;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Type']", AI = false)
	private WebElement drpType_92;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Category']", AI = false)
	private WebElement drpCategory_91;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_8;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Category']", AI = false)
	private WebElement drpCategory_11;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-ActivityClass']", AI = false)
	private WebElement drpActivityClass_26;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Category']", AI = false)
	private WebElement drpCategory_99;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Mandatory']", AI = false)
	private WebElement rdbMandatory_54;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Subject']", AI = false)
	private WebElement inpSubject_65;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Priority']", AI = false)
	private WebElement drpPriority_37;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Subject']", AI = false)
	private WebElement inpSubject_25;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_47;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_88;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Category']", AI = false)
	private WebElement drpCategory_59;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Type']", AI = false)
	private WebElement drpType_12;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-ActivityClass']", AI = false)
	private WebElement drpActivityClass_90;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_80;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_112;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-ActivityClass']", AI = false)
	private WebElement drpActivityClass_10;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-ActivityClass']", AI = false)
	private WebElement drpActivityClass_98;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Mandatory']", AI = false)
	private WebElement rdbMandatory_46;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-ActivityClass']", AI = false)
	private WebElement drpActivityClass_18;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Priority']", AI = false)
	private WebElement drpPriority_21;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Type']", AI = false)
	private WebElement drpType_4;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Subject']", AI = false)
	private WebElement inpSubject_33;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_16;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Type']", AI = false)
	private WebElement drpType_28;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Category']", AI = false)
	private WebElement drpCategory_67;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_31;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_96;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_104;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Type']", AI = false)
	private WebElement drpType_20;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_39;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Priority']", AI = false)
	private WebElement drpPriority_93;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Mandatory']", AI = false)
	private WebElement rdbMandatory_38;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-ActivityClass']", AI = false)
	private WebElement drpActivityClass_82;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Priority']", AI = false)
	private WebElement drpPriority_13;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Subject']", AI = false)
	private WebElement inpSubject_41;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Category']", AI = false)
	private WebElement drpCategory_75;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Mandatory']", AI = false)
	private WebElement rdbMandatory_110;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Mandatory']", AI = false)
	private WebElement rdbMandatory_30;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_23;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_24;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Category']", AI = false)
	private WebElement drpCategory_35;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-Type']", AI = false)
	private WebElement drpType_36;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-ActivityClass']", AI = false)
	private WebElement drpActivityClass_106;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-ActivityClass']", AI = false)
	private WebElement drpActivityClass_74;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Priority']", AI = false)
	private WebElement drpPriority_85;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Mandatory']", AI = false)
	private WebElement rdbMandatory_22;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Category']", AI = false)
	private WebElement drpCategory_43;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Mandatory']", AI = false)
	private WebElement rdbMandatory_102;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Subject']", AI = false)
	private WebElement inpSubject_97;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_15;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Subject']", AI = false)
	private WebElement inpSubject_17;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_32;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Type']", AI = false)
	private WebElement drpType_100;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Mandatory']", AI = false)
	private WebElement rdbMandatory_6;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-Type']", AI = false)
	private WebElement drpType_44;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-2-Mandatory']", AI = false)
	private WebElement rdbMandatory_14;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_95;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Priority']", AI = false)
	private WebElement drpPriority_77;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Category']", AI = false)
	private WebElement drpCategory_51;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-ActivityClass']", AI = false)
	private WebElement drpActivityClass_66;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Mandatory']", AI = false)
	private WebElement rdbMandatory_94;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Type']", AI = false)
	private WebElement drpType_108;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_48;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-3-Category']", AI = false)
	private WebElement drpCategory_19;

	@IFindBy(how = How.CSS, using = "#ActivityPatterns-ActivityPatternsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_87;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-5-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_40;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Type']", AI = false)
	private WebElement drpType_52;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Priority']", AI = false)
	private WebElement drpPriority_109;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Type']", AI = false)
	private WebElement drpType_60;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteButton']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-ActivityClass']", AI = false)
	private WebElement drpActivityClass_50;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-Priority']", AI = false)
	private WebElement drpPriority_61;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Mandatory']", AI = false)
	private WebElement rdbMandatory_86;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Subject']", AI = false)
	private WebElement inpSubject_73;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-0-Mandatory']", AI = false)
	private WebElement rdbMandatory;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-8-ActivityClass']", AI = false)
	private WebElement drpActivityClass_58;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Priority']", AI = false)
	private WebElement drpPriority_69;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Mandatory']", AI = false)
	private WebElement rdbMandatory_70;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4-Category']", AI = false)
	private WebElement drpCategory_27;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_79;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-1-Priority']", AI = false)
	private WebElement drpPriority_5;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-PatternLevel']", AI = false)
	private WebElement drpPatternLevel_56;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-Type']", AI = false)
	private WebElement drpType_68;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_111;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-6-ActivityClass']", AI = false)
	private WebElement drpActivityClass_42;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-7-Priority']", AI = false)
	private WebElement drpPriority_53;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_103;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-11-Subject']", AI = false)
	private WebElement inpSubject_81;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-13-Priority']", AI = false)
	private WebElement drpPriority_101;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-10-Mandatory']", AI = false)
	private WebElement rdbMandatory_78;

	@IFindBy(how = How.CSS, using = "select[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-14-Category']", AI = false)
	private WebElement drpCategory_107;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-9-AutomatedOnly']", AI = false)
	private WebElement rdbAutomatedOnly_71;

	@IFindBy(how = How.CSS, using = "input[name='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-12-Subject']", AI = false)
	private WebElement inpSubject_89;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Issue Policy']", AI = false)
	public WebElement lnkIssuePolicy;
	
	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternDetailDV-Subject']", AI = false)
    public WebElement lblSubjectPolicy;
	
	@IFindBy(how = How.CSS, using = "div[id$='Priority']", AI = false)
	public WebElement lblPriority;
	
    
    @IFindBy(how = How.CSS, using = "div[id$='EscalationDays']", AI = false)
    public WebElement lblEscalationDays;
    
    @IFindBy(how = How.CSS, using = "div[id$='TargetDays']", AI = false)
    public WebElement lblTargetDays;
    
    @IFindBy(how = How.CSS, using = "div[id$='Language']", AI = false)
    public WebElement lblLanguage;
    
	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteWip']", AI = false)
	public WebElement btnDelete_1;
    
	@IFindBy(how = How.CSS, using = "div[id$='-Subject']", AI = false)
	public WebElement lblSubject;
	
	@IFindBy(how = How.CSS, using = "div[id$='-ActivityClassHeader']", AI = false)
	public WebElement lblActivityClass;
	
	@IFindBy(how = How.CSS, using = "div[id$='-CategoryHeader']", AI = false)
	public WebElement lblCategoryHeader;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Priority']", AI = false)
	public WebElement lblPriorityHeader;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Mandatory']", AI = false)
	public WebElement lblMandatoryHeader;
	
	@IFindBy(how = How.CSS, using = "div[id$='-AutomatedOnlyHeader']", AI = false)
	public WebElement lblAutomatedOnly;
	
	@IFindBy(how = How.CSS, using = "div[id$='-PatternLevelHeader_inner']", AI = false)
	public WebElement lblPatternLevel;
	
	@IFindBy(how = How.CSS, using = "div[id$='-TypeHeader_inner']", AI = false)
	public WebElement lblType;
	
	@IFindBy(how = How.CSS, using = "div[id$='last']", AI = false)
	public WebElement btnLast;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Code']", AI = false)
	public WebElement lblCode;
	
	@IFindBy(how = How.CSS, using = "div[id$='-Description']", AI = false)
	public WebElement lblDescription;
	
	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public WebElement lblLastPageNo; 
	
	@IFindBy(how = How.CSS, using = "div[id$='next']", AI = false)
	public WebElement btnNext;
	
	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;
	
	public ActivityPatternsPage(){
	}

	public ActivityPatternsPage(WebDriver driver){
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
}public ActivityPatternsPage enterSubject_49(WebDriver driver,String Subject_49) {
		            BrowserActions.type(driver, inpSubject_49,Subject_49, "Subject_49");
			        return this;
           }
public ActivityPatternsPage selectCategory_3(WebDriver driver,String Category_3)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_3,Category_3,"Category_3");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_63(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_63,"AutomatedOnly_63");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_7(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_7,"AutomatedOnly_7");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_64(WebDriver driver,String PatternLevel_64)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_64,PatternLevel_64,"PatternLevel_64");
				    return this;
			}
public ActivityPatternsPage selectType_76(WebDriver driver,String Type_76)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_76,Type_76,"Type_76");
				    return this;
			}
public ActivityPatternsPage enterSubject_105(WebDriver driver,String Subject_105) {
		            BrowserActions.type(driver, inpSubject_105,Subject_105, "Subject_105");
			        return this;
           }
public ActivityPatternsPage selectType_84(WebDriver driver,String Type_84)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_84,Type_84,"Type_84");
				    return this;
			}
public ActivityPatternsPage selectCategory(WebDriver driver,String Category)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
				    return this;
			}
public ActivityPatternsPage selectPriority_45(WebDriver driver,String Priority_45)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_45,Priority_45,"Priority_45");
				    return this;
			}
public ActivityPatternsPage clickNewActivityPattern(WebDriver driver)  {
					BrowserActions.click(driver, btnNewActivityPattern,"NewActivityPattern");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_34(WebDriver driver,String ActivityClass_34)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_34,ActivityClass_34,"ActivityClass_34");
				    return this;
			}
public ActivityPatternsPage clickMandatory_62(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_62,"Mandatory_62");
				    return this;
			}
public ActivityPatternsPage selectCategory_83(WebDriver driver,String Category_83)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_83,Category_83,"Category_83");
				    return this;
			}
public ActivityPatternsPage selectActivityClass(WebDriver driver,String ActivityClass)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass,ActivityClass,"ActivityClass");
				    return this;
			}
public ActivityPatternsPage enterSubject_57(WebDriver driver,String Subject_57) {
		            BrowserActions.type(driver, inpSubject_57,Subject_57, "Subject_57");
			        return this;
           }
public ActivityPatternsPage selectPriority_29(WebDriver driver,String Priority_29)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_29,Priority_29,"Priority_29");
				    return this;
			}
public ActivityPatternsPage enterSubject_9(WebDriver driver,String Subject_9) {
		            BrowserActions.type(driver, inpSubject_9,Subject_9, "Subject_9");
			        return this;
           }
public ActivityPatternsPage clickAutomatedOnly_55(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_55,"AutomatedOnly_55");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel(WebDriver driver,String PatternLevel)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel,PatternLevel,"PatternLevel");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_2(WebDriver driver,String ActivityClass_2)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_2,ActivityClass_2,"ActivityClass_2");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_72(WebDriver driver,String PatternLevel_72)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_72,PatternLevel_72,"PatternLevel_72");
				    return this;
			}
public ActivityPatternsPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public ActivityPatternsPage enterSubject_1(WebDriver driver,String Subject_1) {
		            BrowserActions.type(driver, inpSubject_1,Subject_1, "Subject_1");
			        return this;
           }
public ActivityPatternsPage selectType_92(WebDriver driver,String Type_92)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_92,Type_92,"Type_92");
				    return this;
			}
public ActivityPatternsPage selectCategory_91(WebDriver driver,String Category_91)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_91,Category_91,"Category_91");
				    return this;
			}
public ActivityPatternsPage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_8(WebDriver driver,String PatternLevel_8)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_8,PatternLevel_8,"PatternLevel_8");
				    return this;
			}
public ActivityPatternsPage selectCategory_11(WebDriver driver,String Category_11)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_11,Category_11,"Category_11");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_26(WebDriver driver,String ActivityClass_26)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_26,ActivityClass_26,"ActivityClass_26");
				    return this;
			}
public ActivityPatternsPage selectCategory_99(WebDriver driver,String Category_99)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_99,Category_99,"Category_99");
				    return this;
			}
public ActivityPatternsPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public ActivityPatternsPage clickMandatory_54(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_54,"Mandatory_54");
				    return this;
			}
public ActivityPatternsPage enterSubject_65(WebDriver driver,String Subject_65) {
		            BrowserActions.type(driver, inpSubject_65,Subject_65, "Subject_65");
			        return this;
           }
public ActivityPatternsPage selectPriority_37(WebDriver driver,String Priority_37)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_37,Priority_37,"Priority_37");
				    return this;
			}
public ActivityPatternsPage enterSubject_25(WebDriver driver,String Subject_25) {
		            BrowserActions.type(driver, inpSubject_25,Subject_25, "Subject_25");
			        return this;
           }
public ActivityPatternsPage clickAutomatedOnly_47(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_47,"AutomatedOnly_47");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_88(WebDriver driver,String PatternLevel_88)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_88,PatternLevel_88,"PatternLevel_88");
				    return this;
			}
public ActivityPatternsPage selectCategory_59(WebDriver driver,String Category_59)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_59,Category_59,"Category_59");
				    return this;
			}
public ActivityPatternsPage selectType_12(WebDriver driver,String Type_12)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_12,Type_12,"Type_12");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_90(WebDriver driver,String ActivityClass_90)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_90,ActivityClass_90,"ActivityClass_90");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_80(WebDriver driver,String PatternLevel_80)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_80,PatternLevel_80,"PatternLevel_80");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_112(WebDriver driver,String PatternLevel_112)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_112,PatternLevel_112,"PatternLevel_112");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_10(WebDriver driver,String ActivityClass_10)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_10,ActivityClass_10,"ActivityClass_10");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_98(WebDriver driver,String ActivityClass_98)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_98,ActivityClass_98,"ActivityClass_98");
				    return this;
			}
public ActivityPatternsPage clickMandatory_46(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_46,"Mandatory_46");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_18(WebDriver driver,String ActivityClass_18)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_18,ActivityClass_18,"ActivityClass_18");
				    return this;
			}
public ActivityPatternsPage selectPriority_21(WebDriver driver,String Priority_21)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_21,Priority_21,"Priority_21");
				    return this;
			}
public ActivityPatternsPage selectType_4(WebDriver driver,String Type_4)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_4,Type_4,"Type_4");
				    return this;
			}
public ActivityPatternsPage enterSubject_33(WebDriver driver,String Subject_33) {
		            BrowserActions.type(driver, inpSubject_33,Subject_33, "Subject_33");
			        return this;
           }
public ActivityPatternsPage selectPatternLevel_16(WebDriver driver,String PatternLevel_16)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_16,PatternLevel_16,"PatternLevel_16");
				    return this;
			}
public ActivityPatternsPage selectType_28(WebDriver driver,String Type_28)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_28,Type_28,"Type_28");
				    return this;
			}
public ActivityPatternsPage selectCategory_67(WebDriver driver,String Category_67)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_67,Category_67,"Category_67");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_31(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_31,"AutomatedOnly_31");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_96(WebDriver driver,String PatternLevel_96)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_96,PatternLevel_96,"PatternLevel_96");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_104(WebDriver driver,String PatternLevel_104)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_104,PatternLevel_104,"PatternLevel_104");
				    return this;
			}
public ActivityPatternsPage selectType_20(WebDriver driver,String Type_20)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_20,Type_20,"Type_20");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_39(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_39,"AutomatedOnly_39");
				    return this;
			}
public ActivityPatternsPage selectPriority_93(WebDriver driver,String Priority_93)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_93,Priority_93,"Priority_93");
				    return this;
			}
public ActivityPatternsPage clickMandatory_38(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_38,"Mandatory_38");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_82(WebDriver driver,String ActivityClass_82)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_82,ActivityClass_82,"ActivityClass_82");
				    return this;
			}
public ActivityPatternsPage selectPriority_13(WebDriver driver,String Priority_13)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_13,Priority_13,"Priority_13");
				    return this;
			}
public ActivityPatternsPage enterSubject_41(WebDriver driver,String Subject_41) {
		            BrowserActions.type(driver, inpSubject_41,Subject_41, "Subject_41");
			        return this;
           }
public ActivityPatternsPage selectCategory_75(WebDriver driver,String Category_75)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_75,Category_75,"Category_75");
				    return this;
			}
public ActivityPatternsPage clickMandatory_110(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_110,"Mandatory_110");
				    return this;
			}
public ActivityPatternsPage clickMandatory_30(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_30,"Mandatory_30");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_23(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_23,"AutomatedOnly_23");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_24(WebDriver driver,String PatternLevel_24)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_24,PatternLevel_24,"PatternLevel_24");
				    return this;
			}
public ActivityPatternsPage selectCategory_35(WebDriver driver,String Category_35)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_35,Category_35,"Category_35");
				    return this;
			}
public ActivityPatternsPage selectType_36(WebDriver driver,String Type_36)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_36,Type_36,"Type_36");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_106(WebDriver driver,String ActivityClass_106)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_106,ActivityClass_106,"ActivityClass_106");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_74(WebDriver driver,String ActivityClass_74)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_74,ActivityClass_74,"ActivityClass_74");
				    return this;
			}
public ActivityPatternsPage selectPriority_85(WebDriver driver,String Priority_85)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_85,Priority_85,"Priority_85");
				    return this;
			}
public ActivityPatternsPage clickMandatory_22(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_22,"Mandatory_22");
				    return this;
			}
public ActivityPatternsPage selectCategory_43(WebDriver driver,String Category_43)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_43,Category_43,"Category_43");
				    return this;
			}
public ActivityPatternsPage clickMandatory_102(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_102,"Mandatory_102");
				    return this;
			}
public ActivityPatternsPage enterSubject_97(WebDriver driver,String Subject_97) {
		            BrowserActions.type(driver, inpSubject_97,Subject_97, "Subject_97");
			        return this;
           }
public ActivityPatternsPage clickAutomatedOnly_15(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_15,"AutomatedOnly_15");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly,"AutomatedOnly");
				    return this;
			}
public ActivityPatternsPage enterSubject_17(WebDriver driver,String Subject_17) {
		            BrowserActions.type(driver, inpSubject_17,Subject_17, "Subject_17");
			        return this;
           }
public ActivityPatternsPage selectPatternLevel_32(WebDriver driver,String PatternLevel_32)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_32,PatternLevel_32,"PatternLevel_32");
				    return this;
			}
public ActivityPatternsPage selectType_100(WebDriver driver,String Type_100)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_100,Type_100,"Type_100");
				    return this;
			}
public ActivityPatternsPage clickMandatory_6(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_6,"Mandatory_6");
				    return this;
			}
public ActivityPatternsPage selectType_44(WebDriver driver,String Type_44)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_44,Type_44,"Type_44");
				    return this;
			}
public ActivityPatternsPage clickMandatory_14(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_14,"Mandatory_14");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_95(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_95,"AutomatedOnly_95");
				    return this;
			}
public ActivityPatternsPage selectPriority_77(WebDriver driver,String Priority_77)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_77,Priority_77,"Priority_77");
				    return this;
			}
public ActivityPatternsPage selectCategory_51(WebDriver driver,String Category_51)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_51,Category_51,"Category_51");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_66(WebDriver driver,String ActivityClass_66)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_66,ActivityClass_66,"ActivityClass_66");
				    return this;
			}
public ActivityPatternsPage clickMandatory_94(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_94,"Mandatory_94");
				    return this;
			}
public ActivityPatternsPage selectType_108(WebDriver driver,String Type_108)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_108,Type_108,"Type_108");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_48(WebDriver driver,String PatternLevel_48)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_48,PatternLevel_48,"PatternLevel_48");
				    return this;
			}
public ActivityPatternsPage selectCategory_19(WebDriver driver,String Category_19)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_19,Category_19,"Category_19");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_87(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_87,"AutomatedOnly_87");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_40(WebDriver driver,String PatternLevel_40)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_40,PatternLevel_40,"PatternLevel_40");
				    return this;
			}
public ActivityPatternsPage selectType_52(WebDriver driver,String Type_52)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_52,Type_52,"Type_52");
				    return this;
			}
public ActivityPatternsPage selectPriority_109(WebDriver driver,String Priority_109)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_109,Priority_109,"Priority_109");
				    return this;
			}
public ActivityPatternsPage selectType_60(WebDriver driver,String Type_60)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_60,Type_60,"Type_60");
				    return this;
			}
public ActivityPatternsPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_50(WebDriver driver,String ActivityClass_50)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_50,ActivityClass_50,"ActivityClass_50");
				    return this;
			}
public ActivityPatternsPage selectPriority_61(WebDriver driver,String Priority_61)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_61,Priority_61,"Priority_61");
				    return this;
			}
public ActivityPatternsPage clickMandatory_86(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_86,"Mandatory_86");
				    return this;
			}
public ActivityPatternsPage enterSubject_73(WebDriver driver,String Subject_73) {
		            BrowserActions.type(driver, inpSubject_73,Subject_73, "Subject_73");
			        return this;
           }
public ActivityPatternsPage clickMandatory(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory,"Mandatory");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_58(WebDriver driver,String ActivityClass_58)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_58,ActivityClass_58,"ActivityClass_58");
				    return this;
			}
public ActivityPatternsPage selectPriority_69(WebDriver driver,String Priority_69)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_69,Priority_69,"Priority_69");
				    return this;
			}
public ActivityPatternsPage clickMandatory_70(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_70,"Mandatory_70");
				    return this;
			}
public ActivityPatternsPage selectCategory_27(WebDriver driver,String Category_27)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_27,Category_27,"Category_27");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_79(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_79,"AutomatedOnly_79");
				    return this;
			}
public ActivityPatternsPage selectPriority_5(WebDriver driver,String Priority_5)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_5,Priority_5,"Priority_5");
				    return this;
			}
public ActivityPatternsPage selectPatternLevel_56(WebDriver driver,String PatternLevel_56)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel_56,PatternLevel_56,"PatternLevel_56");
				    return this;
			}
public ActivityPatternsPage selectType_68(WebDriver driver,String Type_68)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_68,Type_68,"Type_68");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_111(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_111,"AutomatedOnly_111");
				    return this;
			}
public ActivityPatternsPage selectActivityClass_42(WebDriver driver,String ActivityClass_42)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass_42,ActivityClass_42,"ActivityClass_42");
				    return this;
			}
public ActivityPatternsPage selectPriority_53(WebDriver driver,String Priority_53)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_53,Priority_53,"Priority_53");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_103(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_103,"AutomatedOnly_103");
				    return this;
			}
public ActivityPatternsPage enterSubject_81(WebDriver driver,String Subject_81) {
		            BrowserActions.type(driver, inpSubject_81,Subject_81, "Subject_81");
			        return this;
           }
public ActivityPatternsPage selectPriority_101(WebDriver driver,String Priority_101)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_101,Priority_101,"Priority_101");
				    return this;
			}
public ActivityPatternsPage clickMandatory_78(WebDriver driver)  {
					BrowserActions.click(driver, rdbMandatory_78,"Mandatory_78");
				    return this;
			}
public ActivityPatternsPage selectCategory_107(WebDriver driver,String Category_107)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCategory_107,Category_107,"Category_107");
				    return this;
			}
public ActivityPatternsPage clickAutomatedOnly_71(WebDriver driver)  {
					BrowserActions.click(driver, rdbAutomatedOnly_71,"AutomatedOnly_71");
				    return this;
			}
public ActivityPatternsPage enterSubject_89(WebDriver driver,String Subject_89) {
		            BrowserActions.type(driver, inpSubject_89,Subject_89, "Subject_89");
			        return this;
           }
public ActivityPatternsPage clickIssuePolicy_1(WebDriver driver) {
    BrowserActions.click(driver,lnkIssuePolicy, "Issue policy");
	return this;
}
public ActivityPatternsPage clickIssuePolicy(WebDriver driver , String activityPatternName) {
	String pageNo=lblLastPageNo.getText();
	String num=pageNo.replaceAll("[^0-9]","");
	int no=Integer.parseInt(num);
	for(int i=1;i<=no;i++) {
	By activityPatternBy = By.xpath("//div[text()='"+activityPatternName+"']");
	int size = BrowserActions.getWebElementSize(driver, activityPatternBy, "Activity pattern", 0.5);
	if (size > 0) {
	By nameBy =By.xpath("//div[text()='"+activityPatternName+"']");
	
	BrowserActions.waitForElementToDisplay(driver, nameBy, "name ");
	WebElement name = nameBy.findElement(driver);
	BrowserActions.click(driver, name, 2,activityPatternName+"");
	break;
	}
	else {
		BrowserActions.click(driver, btnNext,true,"Next Button"); 
} 
	
	}
	return this;
}
public ActivityPatternsPage clickIssuePolicy(WebDriver driver) {
	BrowserActions.click(driver,lnkIssuePolicy, "Issue policy");
	return this;
}
public ActivityPatternsPage verifySubjectPolicy(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblSubjectPolicy, "Subject");
	return this;
}
public ActivityPatternsPage verifyEscalationDays(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblEscalationDays, "Escalation Days");
	return this;
}

public ActivityPatternsPage verifyTargetDays(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblTargetDays, "Target Days"); 
	return this;
}

public ActivityPatternsPage verifyLanguage(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblLanguage, "Language");  
	return this;
}
public ActivityPatternsPage verifySubject(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblSubject, "Subject");   
	return this;
}
public ActivityPatternsPage verifyDeleteButtonIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnDelete, "Delete");   
	return this;
}
public ActivityPatternsPage verifyActivityClass(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblActivityClass, "Activity Class");   
	return this;
}
public ActivityPatternsPage verifyCategory(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblCategoryHeader, "Category");   
	return this;
}
public ActivityPatternsPage verifyPriority(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblPriorityHeader, "Category");   
	return this;
}
public ActivityPatternsPage verifyMandatory(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblMandatoryHeader, "Mandatory");   
	return this;
}
public ActivityPatternsPage verifyAutomatedOnly(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblAutomatedOnly, "Automated Only");   
	return this;
}
public ActivityPatternsPage verifyPatternLevel(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblPatternLevel, "Pattern Level");   
	return this;
}
public ActivityPatternsPage verifyType(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblType, "Type");   
	return this;
}
public ActivityPatternsPage clickLastPage(WebDriver driver) {
	BrowserActions.click(driver,btnLast, "Last Page");
	return this;
}
public ActivityPatternsPage verifyEditbtnIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnEdit, "Edit Button");
	return this;
}
public ActivityPatternsPage verifyDeleteIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnDelete_1 , "Delete Button");
	return this;
}
public ActivityPatternsPage verifyCode(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblCode ,"Code");
	return this;
}
public ActivityPatternsPage verifyDescription(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblDescription ,"Description");
	return this;
}
public void clickUpdate(WebDriver driver) {
	BrowserActions.click(driver, btnUpdate, "Update Button");
}
public class NewActivityPatternPage extends LoadableComponent<NewActivityPatternPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public  List<Object> pageFactoryKey = new ArrayList<Object>();
	public  List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetStartPoint']", AI = false)
	public WebElement drpTargetStartPoint;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationInclDays']", AI = false)
	public WebElement drpEscalationIncludeDays;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-ShortSubject']", AI = false)
	public WebElement inpShortSubject;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
	public WebElement inpFieldHeading_2;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-FieldHeading']", AI = false)
	public WebElement inpFieldHeading_3;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationHours']", AI = false)
	public WebElement inpEscalationHours;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-2-column']", AI = false)
	public WebElement inpColumn_13;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
	public WebElement inpColumn;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatterns_DeleteButton'] div", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Code']", AI = false)
	public WebElement inpCode;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Category']", AI = false)
	public WebElement drpCategory;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EmailTemplate']", AI = false)
	public WebElement inpEmailTemplate;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationDays']", AI = false)
	public WebElement inpEscalationDays;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetIncludeDays']", AI = false)
	public WebElement drpTargetIncludeDays;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EmailTemplate-SelectEmailTemplate", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Mandatory']", AI = false)
	public WebElement rdbMandatory;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
	public WebElement inpFieldHeading;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-ActivityClass']", AI = false)
	public WebElement drpActivityClass;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-DocumentTemplate-SelectDocumentTemplate", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-AutomatedOnly']", AI = false)
	public WebElement rdbAutomatedOnly;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
	public WebElement inpColumn_8;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-2-column']", AI = false)
	public WebElement inpColumn_9;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-PatternLevel']", AI = false)
	public WebElement drpPatternLevel;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
	public WebElement inpColumn_7;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
	public WebElement inpColumn_4;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-2-column']", AI = false)
	public WebElement inpColumn_5;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
	public WebElement inpLanguage_10;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Subject']", AI = false)
	public WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
	public WebElement inpLanguageHeading;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-EscalationStartPt']", AI = false)
	public WebElement drpEscalationStartPoint;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Recurring']", AI = false)
	public WebElement rdbRecurring;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetHours']", AI = false)
	public WebElement inpTargetHours;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
	public WebElement inpColumn_11;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "#NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
	public WebElement inpColumn_12;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
	public WebElement inpLanguage_6;

	@IFindBy(how = How.CSS, using = "select[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-Priority']", AI = false)
	public WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "input[name='NewActivityPattern-ActivityPatternDetailScreen-ActivityPatternDetailDV-TargetDays']", AI = false)
	public WebElement inpTargetDays;

	@IFindBy(how = How.CSS, using = "input[name$='Code']", AI = false)
	public WebElement txtActPatternCode;

	@IFindBy(how = How.CSS, using = "input[name$='ActivityPatternDetailDV-Subject']", AI = false)
	public WebElement txtActPatternSubject;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public WebElement lblLastPageNo;

	@IFindBy(how = How.CSS, using = "input[id$='ListPaging-input']", AI = false)
	public WebElement txtFirstPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-0-0-column']", AI = false)
	public WebElement txtEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-2-0-column']", AI = false)
	public WebElement txtEdgeEnglish;
	
	public NewActivityPatternPage(){
	}

	public NewActivityPatternPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpTargetDays))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewActivityPatternPage selectTargetStartPoint(WebDriver driver,String TargetStartPoint)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTargetStartPoint,TargetStartPoint,"TargetStartPoint");
		return this;
	}
	public NewActivityPatternPage selectEscalationIncludeDays(WebDriver driver,String EscalationIncludeDays)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEscalationIncludeDays,EscalationIncludeDays,"EscalationIncludeDays");
		return this;
	}
	public NewActivityPatternPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewActivityPatternPage enterShortSubject(WebDriver driver,String ShortSubject) {
		BrowserActions.type(driver, inpShortSubject,ShortSubject, "ShortSubject");
		return this;
	}
	public NewActivityPatternPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewActivityPatternPage enterFieldHeading_2(WebDriver driver,String FieldHeading_2) {
		BrowserActions.type(driver, inpFieldHeading_2,FieldHeading_2, "FieldHeading_2");
		return this;
	}
	public NewActivityPatternPage enterFieldHeading_3(WebDriver driver,String FieldHeading_3) {
		BrowserActions.type(driver, inpFieldHeading_3,FieldHeading_3, "FieldHeading_3");
		return this;
	}
	public NewActivityPatternPage enterEscalationHours(WebDriver driver,String EscalationHours) {
		BrowserActions.type(driver, inpEscalationHours,EscalationHours, "EscalationHours");
		return this;
	}
	public NewActivityPatternPage enterColumn_13(WebDriver driver,String Column_13) {
		BrowserActions.type(driver, inpColumn_13,Column_13, "Column_13");
		return this;
	}
	public NewActivityPatternPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public NewActivityPatternPage enterColumn(WebDriver driver,String Column) {
		BrowserActions.type(driver, inpColumn,Column, "Column");
		return this;
	}
	public NewActivityPatternPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public NewActivityPatternPage enterCode(WebDriver driver,String Code) {
		BrowserActions.type(driver, inpCode,Code, "Code");
		return this;
	}
	public NewActivityPatternPage selectCategory(WebDriver driver,String Category)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
		return this;
	}
	public NewActivityPatternPage enterEmailTemplate(WebDriver driver,String EmailTemplate) {
		BrowserActions.type(driver, inpEmailTemplate,EmailTemplate, "EmailTemplate");
		return this;
	}
	public NewActivityPatternPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public NewActivityPatternPage enterEscalationDays(WebDriver driver,String EscalationDays) {
		BrowserActions.type(driver, inpEscalationDays,EscalationDays, "EscalationDays");
		return this;
	}
	public NewActivityPatternPage selectTargetIncludeDays(WebDriver driver,String TargetIncludeDays)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTargetIncludeDays,TargetIncludeDays,"TargetIncludeDays");
		return this;
	}
	public NewActivityPatternPage enterLanguage(WebDriver driver,String Language) {
		BrowserActions.type(driver, inpLanguage,Language, "Language");
		return this;
	}
	public NewActivityPatternPage clickSearch_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_1,"Search_1");
		return this;
	}
	public NewActivityPatternPage clickMandatory(WebDriver driver)  {
		BrowserActions.click(driver, rdbMandatory,"Mandatory");
		return this;
	}
	public NewActivityPatternPage enterFieldHeading(WebDriver driver,String FieldHeading) {
		BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
		return this;
	}
	public NewActivityPatternPage selectActivityClass(WebDriver driver,String ActivityClass)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityClass,ActivityClass,"ActivityClass");
		return this;
	}
	public NewActivityPatternPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public NewActivityPatternPage clickAutomatedOnly(WebDriver driver)  {
		BrowserActions.click(driver, rdbAutomatedOnly,"AutomatedOnly");
		return this;
	}
	public NewActivityPatternPage enterColumn_8(WebDriver driver,String Column_8) {
		BrowserActions.type(driver, inpColumn_8,Column_8, "Column_8");
		return this;
	}
	public NewActivityPatternPage enterColumn_9(WebDriver driver,String Column_9) {
		BrowserActions.type(driver, inpColumn_9,Column_9, "Column_9");
		return this;
	}
	public NewActivityPatternPage selectPatternLevel(WebDriver driver,String PatternLevel)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPatternLevel,PatternLevel,"PatternLevel");
		return this;
	}
	public NewActivityPatternPage enterColumn_7(WebDriver driver,String Column_7) {
		BrowserActions.type(driver, inpColumn_7,Column_7, "Column_7");
		return this;
	}
	public NewActivityPatternPage enterColumn_4(WebDriver driver,String Column_4) {
		BrowserActions.type(driver, inpColumn_4,Column_4, "Column_4");
		return this;
	}
	public NewActivityPatternPage enterColumn_5(WebDriver driver,String Column_5) {
		BrowserActions.type(driver, inpColumn_5,Column_5, "Column_5");
		return this;
	}
	public NewActivityPatternPage enterLanguage_10(WebDriver driver,String Language_10) {
		BrowserActions.type(driver, inpLanguage_10,Language_10, "Language_10");
		return this;
	}
	public NewActivityPatternPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}
	public NewActivityPatternPage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
		BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
		return this;
	}
	public NewActivityPatternPage selectEscalationStartPoint(WebDriver driver,String EscalationStartPoint)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEscalationStartPoint,EscalationStartPoint,"EscalationStartPoint");
		return this;
	}
	public NewActivityPatternPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewActivityPatternPage clickRecurring(WebDriver driver)  {
		BrowserActions.click(driver, rdbRecurring,"Recurring");
		return this;
	}
	public NewActivityPatternPage enterTargetHours(WebDriver driver,String TargetHours) {
		BrowserActions.type(driver, inpTargetHours,TargetHours, "TargetHours");
		return this;
	}
	public NewActivityPatternPage enterColumn_11(WebDriver driver,String Column_11) {
		BrowserActions.type(driver, inpColumn_11,Column_11, "Column_11");
		return this;
	}
	public NewActivityPatternPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public NewActivityPatternPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewActivityPatternPage enterColumn_12(WebDriver driver,String Column_12) {
		BrowserActions.type(driver, inpColumn_12,Column_12, "Column_12");
		return this;
	}
	public NewActivityPatternPage enterLanguage_6(WebDriver driver,String Language_6) {
		BrowserActions.type(driver, inpLanguage_6,Language_6, "Language_6");
		return this;
	}
	public NewActivityPatternPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public NewActivityPatternPage enterTargetDays(WebDriver driver,String TargetDays) {
		BrowserActions.type(driver, inpTargetDays,TargetDays, "TargetDays");
		return this;
	}
	public void enterEdgePolicyholderEnglish(WebDriver driver, String edgePolicyholderEnglish){
		BrowserActions.type(driver, txtEdgePolicyholderEnglish,edgePolicyholderEnglish,"Edge Policy holder English");
	}

	public void enterEdgeEnglish(WebDriver driver, String edgePolicyholderEnglish) {
		BrowserActions.type(driver, txtEdgeEnglish,edgePolicyholderEnglish,"Edge Policy holder English");
	}
	public void verifyAddedElementNotDisplayed(WebDriver driver,String subject) {
		
		try{
			By textSubjectBy = By.xpath("//table[@class='gw-ListViewWidget--table gw-table'] /tbody /tr /td[2] //div[text()='"+subject+"']");
			BrowserActions.waitForElementToDisplay(driver, textSubjectBy, "textSubject");
			WebElement textSubject = textSubjectBy.findElement(driver);
			String text = BrowserActions.getText(driver, textSubject, "element");
			Log.message("Element is verified as "+text);
		}
		catch(NoSuchElementException e ) {
			Log.messageStep("Deleted Successfully", driver);
		}
	}
	
	/**
	 * Verify added subject is deleted
	 * @author vignesh.ravi
	 * @param driver , subject
	 */

	public void verifyAddedSubjectDeleted(WebDriver driver,String subject) {
		By tableBy =By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");
		BrowserActions.waitForElementToDisplay(driver, tableBy, "table");
		WebElement table = tableBy.findElement(driver);
		List<WebElement> eachSubjectrow = table.findElements(By.tagName("tr"));
		WebElement deletedRow = null;
		for(WebElement eachrow:eachSubjectrow ) {
			if(eachrow.getText().contains("")) {
				deletedRow = eachrow;
				break;
			}
		}
		if(deletedRow!=null && eachSubjectrow.contains(deletedRow)) {
			Log.message("Deleted Subject Still Exist");
		}else {
			Log.message("Deleted Subject Deleted Successfully");

		}
	}
	
	/**
	 * Enter the subject
	 * @author vignesh.ravi
	 * @param driver , actPatternSubject
	 */

	public void enterActPatternSubject(WebDriver driver, String actPatternSubject) {
		BrowserActions.type(driver, txtActPatternSubject,actPatternSubject,"Act Pattern Subject");
	}
	
	/**
	 * Enter the code
	 * @author vignesh.ravi
	 * @param driver , actPatternCode
	 */

	public void enterActPatternCode(WebDriver driver, String actPatternCode) {
		BrowserActions.type(driver, txtActPatternCode,actPatternCode,"Act Pattern Code");
	}
	
	/**
	 * Click Checkbox
	 * @author vignesh.ravi
	 * @param driver , name
	 */

	public void selectCheckBox(WebDriver driver,String name) {
		String pageNo=lblLastPageNo.getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			By nameCheckBy = By.xpath("//div[text()='"+name+"']//ancestor::td/preceding-sibling::td//descendant::div[contains(@id,'Checkbox')]");
			int size = BrowserActions.getWebElementSize(driver, nameCheckBy, "Name  Checkbox", 0.5);
			if (size > 0) {
				By activityCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td/preceding-sibling::td//descendant::div[contains(@id,'Checkbox')]");
				BrowserActions.waitForElementToDisplay(driver, activityCheckBoxBy, "activityCheckBox");
				WebElement activityCheckBox = activityCheckBoxBy.findElement(driver);
				
				BrowserActions.click(driver, activityCheckBox, "Check box");
				break;
			}
			else {
				BrowserActions.click(driver, btnNextArrow,true,"Next Button");
			}
		}
	}
		
	/**
	 * Verify Activity pattern is added
	 * @author vignesh.ravi
	 * @param driver , name
	 */
	
		public void verifyActivityPattersIsAdded(WebDriver driver,String name) {
			String pageNo=lblLastPageNo.getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			for(int i=1;i<=no;i++) {
				By textNameBy = By.xpath("//div[text()='"+name+"']");
				int size = BrowserActions.getWebElementSize(driver, textNameBy, "Text Name", 0.5);
				if (size > 0) {
					By activityPatternBy = By.xpath("//div[text()='"+name+"']");
					BrowserActions.waitForElementToDisplay(driver, activityPatternBy, "activityPattern");
					break;
				}
				else {
					BrowserActions.click(driver, btnNextArrow,true,"Next Button");
				}
			}
		}
}
}