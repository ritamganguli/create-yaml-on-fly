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

public class MetricsThresholdsPage extends LoadableComponent<MetricsThresholdsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_227;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_228;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_140;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_33;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_470;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_26;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_424;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_425;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-Label']", AI = false)
	public WebElement inpLabel;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_98;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_119;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-Unit']", AI = false)
	public WebElement inpUnit_338;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_452;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_334;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-Tier']", AI = false)
	public WebElement inpTier;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_110;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_120;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_213;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-Unit']", AI = false)
	public WebElement inpUnit_211;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_5;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_32;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_236;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_288;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_275;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_12;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-9-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_412;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_313;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_158;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_398;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-6-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_409;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_138;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-4-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_407;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-ClaimMetricLimitCategoryHeader']", AI = false)
	public WebElement inpClaimMetricLimitCategoryHeader_179;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_270;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_403;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_153;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_321;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_371;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_393;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_447;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_206;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_440;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_255;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_328;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_496;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label']", AI = false)
	public WebElement inpLabel_401;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_42;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_51;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_209;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_352;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_218;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_477;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_92;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_90;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_310;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_114;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_16;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-Unit']", AI = false)
	public WebElement inpUnit_112;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_231;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_176;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_84;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_318;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_368;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_293;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-6-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_434;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-4-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_432;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-Unit']", AI = false)
	public WebElement inpUnit_229;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_450;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_428;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_225;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_331;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_422;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-Unit']", AI = false)
	public WebElement inpUnit_463;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_252;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_273;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_465;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-Unit']", AI = false)
	public WebElement inpUnit;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_493;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-Unit']", AI = false)
	public WebElement inpUnit_15;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_108;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_345;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_135;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_156;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_340;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_101;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_396;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_53;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_415;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_146;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_272;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_105;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_106;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_172;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_320;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_349;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_73;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_222;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_223;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-Tier']", AI = false)
	public WebElement inpTier_210;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-9-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_437;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_82;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_155;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_439;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-Unit']", AI = false)
	public WebElement inpUnit_49;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_300;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_395;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-Unit']", AI = false)
	public WebElement inpUnit_413;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-Unit']", AI = false)
	public WebElement inpUnit_31;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_65;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_289;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_193;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_291;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_81;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-4-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_335;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-6-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_336;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-4-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_457;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_67;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_453;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_302;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_350;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_330;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_402;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_475;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_164;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_174;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureRedValueHeader']", AI = false)
	public WebElement rdbExposureRedValueHeader;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_281;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_38;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_50;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_128;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-Unit']", AI = false)
	public WebElement inpUnit_63;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_96;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_370;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_245;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_305;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_35;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_208;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_449;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-LabelHeader']", AI = false)
	public WebElement inpLabelHeader;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-9-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_462;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-Unit']", AI = false)
	public WebElement inpUnit_438;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_241;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-Unit']", AI = false)
	public WebElement inpUnit_319;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_414;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_124;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-9-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_337;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-6-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_459;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_417;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_495;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_254;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_315;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_59;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_137;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_188;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-7-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalHighComplexity_385;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_22;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_189;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_191;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_303;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-4-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_357;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_478;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_259;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_312;

	@IFindBy(how = How.CSS, using = "select[name='KeyMetrics-PolicyType']", AI = false)
	public WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_353;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_171;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_375;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_263;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_427;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_64;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-Unit']", AI = false)
	public WebElement inpUnit_301;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_190;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_253;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_136;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-Unit']", AI = false)
	public WebElement inpUnit_80;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-5-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalLowComplexity_483;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricsCardTab", AI = false)
	public WebElement btnExposureMetricLimits;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_423;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_494;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-TargetValueHeader']", AI = false)
	public WebElement inpTargetValueHeader;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_141;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_175;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_202;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_443;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_322;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-7-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalHighComplexity_485;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-ClaimMetricLimitCategoryHeader']", AI = false)
	public WebElement inpClaimMetricLimitCategoryHeader;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_306;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_369;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_258;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_499;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_311;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_441;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_200;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_292;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_41;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnRental_404;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_19;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureLabelHeader']", AI = false)
	public WebElement inpExposureLabelHeader;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_374;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-7-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalHighComplexity_360;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_68;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_154;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_290;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_95;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_173;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_418;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_416;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricLimitsHeader']", AI = false)
	public WebElement inpExposureMetricLimitsHeader;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-Tier']", AI = false)
	public WebElement inpTier_62;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_448;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-5-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalLowComplexity_383;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_271;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_394;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_240;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_274;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_123;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_397;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_157;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_165;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_3;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_421;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_99;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_282;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_11;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-7-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalHighComplexity_460;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-ClaimMetricLimitCategoryHeader']", AI = false)
	public WebElement inpClaimMetricLimitCategoryHeader_44;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-Unit']", AI = false)
	public WebElement inpUnit_94;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_304;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_309;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_474;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_207;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnRental_429;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_329;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_25;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_85;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-7-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalHighComplexity;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_117;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_115;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_147;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_348;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_104;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-7-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalHighComplexity_435;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_500;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_221;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_232;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_36;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_205;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_446;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_372;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_497;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_256;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_327;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_217;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_264;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_139;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnRental_454;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_366;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_473;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_468;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_203;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnTowing_405;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_444;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_325;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_239;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_317;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_294;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-Tier']", AI = false)
	public WebElement inpTier_14;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_121;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_177;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_219;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_20;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_234;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-3-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalLowComplexity_431;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_18;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_129;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_216;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_214;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_235;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_246;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-7-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalHighComplexity_410;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_17;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_122;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_346;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_472;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_400;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-3-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalLowComplexity_406;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_118;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnRental_354;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_298;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_238;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_54;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_102;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnRental_479;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_343;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_100;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_373;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_466;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_344;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_324;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_9;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_469;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_159;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_399;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_498;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-DecimalRedValue']", AI = false)
	public WebElement inpDecimalRedValue_257;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_341;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_237;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-LargeLossThresholdCardTab", AI = false)
	public WebElement btnLargeLossThreshold;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_220;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_276;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_103;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnHighSeverity_111;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_471;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_347;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_34;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_4;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-8-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalHighComplexity_461;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_287;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureYellowValueHeader']", AI = false)
	public WebElement rdbExposureYellowValueHeader;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_391;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_151;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnTowing_430;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_57;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnRental_379;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-5-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalLowComplexity_408;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_419;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_169;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-Label']", AI = false)
	public WebElement inpLabel_28;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-3-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalLowComplexity_481;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_170;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureTargetValueHeader']", AI = false)
	public WebElement inpExposureTargetValueHeader;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-3-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalLowComplexity;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_286;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_332;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_198;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_39;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_40;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_163;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_52;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_280;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-3-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalLowComplexity_356;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_71;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_491;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_184;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_250;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_133;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_187;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnTowing;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_10;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-Tier']", AI = false)
	public WebElement inpTier_196;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_66;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_268;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_21;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-UnitsHeader']", AI = false)
	public WebElement inpUnitsHeader;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_24;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_167;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_194;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_145;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-5-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalLowComplexity_433;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnRental;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_262;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_307;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-3-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalLowComplexity_456;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_8;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnTowing_355;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_83;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_78;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-Label']", AI = false)
	public WebElement inpLabel_278;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label-8-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalHighComplexity_436;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-Tier']", AI = false)
	public WebElement inpTier_93;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_88;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-5-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalLowComplexity_458;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_127;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_244;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-Label']", AI = false)
	public WebElement inpLabel_161;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnTowing_480;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-LargeLossThresholdInputSet-PolicySystemThreshold']", AI = false)
	public WebElement inpPolicySystemNotification;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_97;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-YellowValueHeader']", AI = false)
	public WebElement rdbYellowValueHeader;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnTowing_455;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-Unit']", AI = false)
	public WebElement inpUnit_1;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-Label']", AI = false)
	public WebElement inpLabel_296;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-3-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn1stPartyMedicalLowComplexity_381;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-Label']", AI = false)
	public WebElement inpLabel_45;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue_186;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_109;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-3-Label-8-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalHighComplexity_411;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_192;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_226;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-Label']", AI = false)
	public WebElement inpLabel_180;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-5-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalLowComplexity_358;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_2;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_47;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_442;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_27;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-4-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_482;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-Label']", AI = false)
	public WebElement inpLabel_107;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_323;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-RedValueHeader']", AI = false)
	public WebElement rdbRedValueHeader;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_201;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-Unit']", AI = false)
	public WebElement inpUnit_183;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_70;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_181;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-9-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_487;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-9-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_362;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_364;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-6-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_484;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_113;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_297;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_29;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_142;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnLowSeverity_316;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-6-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_359;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label']", AI = false)
	public WebElement inpLabel_351;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label']", AI = false)
	public WebElement inpLabel_476;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_87;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_215;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_86;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_48;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_378;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_230;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_464;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_277;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-Unit']", AI = false)
	public WebElement inpUnit_166;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_168;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-Label']", AI = false)
	public WebElement inpLabel_242;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_285;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-Label']", AI = false)
	public WebElement inpLabel_125;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-4-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_382;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_342;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_56;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_467;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-Label']", AI = false)
	public WebElement inpLabel_76;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-9-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_387;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-6-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnCreateLimitForTier_384;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_30;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-1-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_212;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureUnitsHeader']", AI = false)
	public WebElement inpExposureUnitsHeader;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_339;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_199;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label']", AI = false)
	public WebElement inpLabel_376;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_160;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_233;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-2-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_116;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-Unit']", AI = false)
	public WebElement inpUnit_197;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_299;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_13;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_295;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-IntegerYellowValue']", AI = false)
	public WebElement inpIntegerYellowValue_6;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_178;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-Label']", AI = false)
	public WebElement inpLabel_260;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-2-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnTowing_380;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-Label']", AI = false)
	public WebElement inpLabel_143;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricsCardTab", AI = false)
	public WebElement btnClaimMetricLimits;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-Label-0-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_182;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_185;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_367;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-8-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalHighComplexity_386;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-Label']", AI = false)
	public WebElement inpLabel_426;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_61;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_37;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_284;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_261;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_490;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-2-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_377;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_72;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_132;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_134;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-Label']", AI = false)
	public WebElement inpLabel_314;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_249;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-Unit']", AI = false)
	public WebElement inpUnit_130;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_75;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_77;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-8-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalHighComplexity;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_251;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_492;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_266;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-0-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_204;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_89;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-0-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_195;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_243;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-6-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_326;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_389;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_149;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_126;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-Unit']", AI = false)
	public WebElement inpUnit_363;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-1-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_365;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-Unit']", AI = false)
	public WebElement inpUnit_247;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_60;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-4-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_445;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-Unit']", AI = false)
	public WebElement inpUnit_488;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_7;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-6-Label-8-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalHighComplexity_486;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-Unit']", AI = false)
	public WebElement inpUnit_283;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_269;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-1-Label-8-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalHighComplexity_361;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_55;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-Label-1-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btnMediumSeverity_79;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-1-PercentRedValue']", AI = false)
	public WebElement inpPercentRedValue_43;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-5-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_162;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_150;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-IntegerRedValue']", AI = false)
	public WebElement inpIntegerRedValue_58;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_390;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-2-4-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_279;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_46;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-5-Label']", AI = false)
	public WebElement inpLabel_451;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-1-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_91;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label']", AI = false)
	public WebElement inpLabel_333;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-PercentReadonlyRedValue']", AI = false)
	public WebElement inpPercentReadonlyRedValue_74;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-0-0-DecimalYellowValue']", AI = false)
	public WebElement inpDecimalYellowValue_69;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_392;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-1-PercentYellowValue']", AI = false)
	public WebElement inpPercentYellowValue_23;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-3-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_131;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-PercentTargetValue']", AI = false)
	public WebElement inpPercentTargetValue_152;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ExposureMetricDefaultLimitIterator-0-Label-5-CreateLimitForTier>div[role='button']", AI = false)
	public WebElement btn3rdPartyMedicalLowComplexity;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-6-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_489;

	@IFindBy(how = How.CSS, using = "#KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-Label-LabelMenuIcon>div[role='button']", AI = false)
	public WebElement btnLabelMenuIcon_144;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-2-IntegerTargetValue']", AI = false)
	public WebElement inpIntegerTargetValue_248;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-5-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_308;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-Unit']", AI = false)
	public WebElement inpUnit_265;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-3-DecimalTargetValue']", AI = false)
	public WebElement inpDecimalTargetValue_267;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-2-Unit']", AI = false)
	public WebElement inpUnit_388;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-0-0-PercentReadonlyTargetValue']", AI = false)
	public WebElement inpPercentReadonlyTargetValue;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-1-4-Unit']", AI = false)
	public WebElement inpUnit_148;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ClaimMetricLimitCategoryIterator-2-1-Label']", AI = false)
	public WebElement inpLabel_224;

	@IFindBy(how = How.CSS, using = "input[name='KeyMetrics-ExposureMetricDefaultLimitIterator-3-PercentReadonlyYellowValue']", AI = false)
	public WebElement inpPercentReadonlyYellowValue_420;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Net Total Incurred']//ancestor::td//following-sibling::td[contains(@id,'TargetValue_Cell')]", AI = false)
	public WebElement lblNetTotalIncurred;

	@IFindBy(how = How.XPATH, using = "//div[text()='Days Open']//ancestor::td//following-sibling::td[contains(@id,'TargetValue_Cell')]", AI = false)
	public WebElement lblDaysOpen;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Days Since Last View - Adjuster']//ancestor::td//following-sibling::td[contains(@id,'TargetValue_Cell')]", AI = false)
	public WebElement lblDaysSinceLastViewAdjuster;

	@IFindBy(how = How.CSS, using = "input[name$='CategoryIterator-0-0-IntegerTargetValue']", AI = false)
	public WebElement inpDaysOpenIntegerTargetValue;
	
	@IFindBy(how = How.CSS, using = "input[name$='CategoryIterator-1-0-IntegerTargetValue']", AI = false)
	public WebElement inpDaysSinceLastViewAdjuster;

	@IFindBy(how = How.CSS, using = "input[name$='CategoryIterator-2-0-MoneyTargetValue']", AI = false)
	public WebElement inpNetTotalIncurred;
	
	@IFindBy(how = How.CSS, using = "input[name$='ExposureMetricDefaultLimitIterator-0-IntegerTargetValue']", AI = false)
	public WebElement inpDaysOpenExposureMetricDefaultLimit;

	@IFindBy(how = How.CSS, using = "input[name$='ExposureMetricDefaultLimitIterator-5-PercentTargetValue']", AI = false)
	public WebElement inpPaidLossCostsAsPercentageOfTotalPaid;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Paid Loss Costs as % of Total Paid']//ancestor::td//following-sibling::td[contains(@id,'TargetValue_Cell')]", AI = false)
	public WebElement lblPaidLossCostsPercentageAsOfTotalPaid;

	@IFindBy(how = How.CSS, using = "div[id$='LargeLossThresholdInputSet-ClaimCenterThreshold']", AI = false)
	public WebElement lblLargeLossIndicator;
	
	@IFindBy(how = How.CSS, using = "input[name$='LargeLossThresholdInputSet-ClaimCenterThreshold']", AI = false)
	public WebElement inpLargeLossIndicator;


	public MetricsThresholdsPage(){
	}

	public MetricsThresholdsPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpPercentReadonlyYellowValue_420))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public MetricsThresholdsPage clickMediumSeverity_227(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_227,"MediumSeverity_227");
				    return this;
			}
public MetricsThresholdsPage clickHighSeverity_228(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_228,"HighSeverity_228");
				    return this;
			}
public MetricsThresholdsPage enterDecimalRedValue_140(WebDriver driver,String DecimalRedValue_140) {
		            BrowserActions.type(driver, inpDecimalRedValue_140,DecimalRedValue_140, "DecimalRedValue_140");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_33(WebDriver driver,String DecimalTargetValue_33) {
		            BrowserActions.type(driver, inpDecimalTargetValue_33,DecimalTargetValue_33, "DecimalTargetValue_33");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_470(WebDriver driver,String PercentReadonlyYellowValue_470) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_470,PercentReadonlyYellowValue_470, "PercentReadonlyYellowValue_470");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_26(WebDriver driver,String PercentReadonlyRedValue_26) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_26,PercentReadonlyRedValue_26, "PercentReadonlyRedValue_26");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_424(WebDriver driver,String PercentReadonlyRedValue_424) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_424,PercentReadonlyRedValue_424, "PercentReadonlyRedValue_424");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_425(WebDriver driver,String PercentRedValue_425) {
		            BrowserActions.type(driver, inpPercentRedValue_425,PercentRedValue_425, "PercentRedValue_425");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue(WebDriver driver,String PercentTargetValue) {
		            BrowserActions.type(driver, inpPercentTargetValue,PercentTargetValue, "PercentTargetValue");
			        return this;
           }
public MetricsThresholdsPage enterLabel(WebDriver driver,String Label) {
		            BrowserActions.type(driver, inpLabel,Label, "Label");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_98(WebDriver driver,String PercentTargetValue_98) {
		            BrowserActions.type(driver, inpPercentTargetValue_98,PercentTargetValue_98, "PercentTargetValue_98");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_119(WebDriver driver,String PercentReadonlyYellowValue_119) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_119,PercentReadonlyYellowValue_119, "PercentReadonlyYellowValue_119");
			        return this;
           }
public MetricsThresholdsPage enterUnit_338(WebDriver driver,String Unit_338) {
		            BrowserActions.type(driver, inpUnit_338,Unit_338, "Unit_338");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_452(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_452,"LabelMenuIcon_452");
				    return this;
			}
public MetricsThresholdsPage clickLabelMenuIcon_334(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_334,"LabelMenuIcon_334");
				    return this;
			}
public MetricsThresholdsPage enterTier(WebDriver driver,String Tier) {
		            BrowserActions.type(driver, inpTier,Tier, "Tier");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_110(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_110,"MediumSeverity_110");
				    return this;
			}
public MetricsThresholdsPage enterPercentYellowValue_120(WebDriver driver,String PercentYellowValue_120) {
		            BrowserActions.type(driver, inpPercentYellowValue_120,PercentYellowValue_120, "PercentYellowValue_120");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_213(WebDriver driver,String DecimalTargetValue_213) {
		            BrowserActions.type(driver, inpDecimalTargetValue_213,DecimalTargetValue_213, "DecimalTargetValue_213");
			        return this;
           }
public MetricsThresholdsPage enterUnit_211(WebDriver driver,String Unit_211) {
		            BrowserActions.type(driver, inpUnit_211,Unit_211, "Unit_211");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_5(WebDriver driver,String PercentTargetValue_5) {
		            BrowserActions.type(driver, inpPercentTargetValue_5,PercentTargetValue_5, "PercentTargetValue_5");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_32(WebDriver driver,String IntegerTargetValue_32) {
		            BrowserActions.type(driver, inpIntegerTargetValue_32,IntegerTargetValue_32, "IntegerTargetValue_32");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_236(WebDriver driver,String PercentReadonlyYellowValue_236) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_236,PercentReadonlyYellowValue_236, "PercentReadonlyYellowValue_236");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_288(WebDriver driver,String IntegerYellowValue_288) {
		            BrowserActions.type(driver, inpIntegerYellowValue_288,IntegerYellowValue_288, "IntegerYellowValue_288");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_275(WebDriver driver,String DecimalRedValue_275) {
		            BrowserActions.type(driver, inpDecimalRedValue_275,DecimalRedValue_275, "DecimalRedValue_275");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_12(WebDriver driver,String PercentReadonlyRedValue_12) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_12,PercentReadonlyRedValue_12, "PercentReadonlyRedValue_12");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_412(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_412,"CreateLimitForTier_412");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier,"CreateLimitForTier");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_313(WebDriver driver,String PercentRedValue_313) {
		            BrowserActions.type(driver, inpPercentRedValue_313,PercentRedValue_313, "PercentRedValue_313");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_158(WebDriver driver,String DecimalRedValue_158) {
		            BrowserActions.type(driver, inpDecimalRedValue_158,DecimalRedValue_158, "DecimalRedValue_158");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_398(WebDriver driver,String DecimalRedValue_398) {
		            BrowserActions.type(driver, inpDecimalRedValue_398,DecimalRedValue_398, "DecimalRedValue_398");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_409(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_409,"CreateLimitForTier_409");
				    return this;
			}
public MetricsThresholdsPage enterPercentYellowValue_138(WebDriver driver,String PercentYellowValue_138) {
		            BrowserActions.type(driver, inpPercentYellowValue_138,PercentYellowValue_138, "PercentYellowValue_138");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_407(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_407,"CreateLimitForTier_407");
				    return this;
			}
public MetricsThresholdsPage enterClaimMetricLimitCategoryHeader_179(WebDriver driver,String ClaimMetricLimitCategoryHeader_179) {
		            BrowserActions.type(driver, inpClaimMetricLimitCategoryHeader_179,ClaimMetricLimitCategoryHeader_179, "ClaimMetricLimitCategoryHeader_179");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_270(WebDriver driver,String IntegerYellowValue_270) {
		            BrowserActions.type(driver, inpIntegerYellowValue_270,IntegerYellowValue_270, "IntegerYellowValue_270");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_403(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_403,"CreateLimitForTier_403");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue_153(WebDriver driver,String IntegerYellowValue_153) {
		            BrowserActions.type(driver, inpIntegerYellowValue_153,IntegerYellowValue_153, "IntegerYellowValue_153");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_321(WebDriver driver,String DecimalTargetValue_321) {
		            BrowserActions.type(driver, inpDecimalTargetValue_321,DecimalTargetValue_321, "DecimalTargetValue_321");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_371(WebDriver driver,String PercentYellowValue_371) {
		            BrowserActions.type(driver, inpPercentYellowValue_371,PercentYellowValue_371, "PercentYellowValue_371");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_393(WebDriver driver,String IntegerYellowValue_393) {
		            BrowserActions.type(driver, inpIntegerYellowValue_393,IntegerYellowValue_393, "IntegerYellowValue_393");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_447(WebDriver driver,String IntegerRedValue_447) {
		            BrowserActions.type(driver, inpIntegerRedValue_447,IntegerRedValue_447, "IntegerRedValue_447");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_206(WebDriver driver,String IntegerRedValue_206) {
		            BrowserActions.type(driver, inpIntegerRedValue_206,IntegerRedValue_206, "IntegerRedValue_206");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_440(WebDriver driver,String DecimalTargetValue_440) {
		            BrowserActions.type(driver, inpDecimalTargetValue_440,DecimalTargetValue_440, "DecimalTargetValue_440");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_255(WebDriver driver,String PercentYellowValue_255) {
		            BrowserActions.type(driver, inpPercentYellowValue_255,PercentYellowValue_255, "PercentYellowValue_255");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_328(WebDriver driver,String IntegerRedValue_328) {
		            BrowserActions.type(driver, inpIntegerRedValue_328,IntegerRedValue_328, "IntegerRedValue_328");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_496(WebDriver driver,String PercentYellowValue_496) {
		            BrowserActions.type(driver, inpPercentYellowValue_496,PercentYellowValue_496, "PercentYellowValue_496");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue(WebDriver driver,String DecimalTargetValue) {
		            BrowserActions.type(driver, inpDecimalTargetValue,DecimalTargetValue, "DecimalTargetValue");
			        return this;
           }
public MetricsThresholdsPage enterLabel_401(WebDriver driver,String Label_401) {
		            BrowserActions.type(driver, inpLabel_401,Label_401, "Label_401");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_42(WebDriver driver,String PercentReadonlyRedValue_42) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_42,PercentReadonlyRedValue_42, "PercentReadonlyRedValue_42");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_51(WebDriver driver,String DecimalTargetValue_51) {
		            BrowserActions.type(driver, inpDecimalTargetValue_51,DecimalTargetValue_51, "DecimalTargetValue_51");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue(WebDriver driver,String PercentRedValue) {
		            BrowserActions.type(driver, inpPercentRedValue,PercentRedValue, "PercentRedValue");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_209(WebDriver driver,String PercentRedValue_209) {
		            BrowserActions.type(driver, inpPercentRedValue_209,PercentRedValue_209, "PercentRedValue_209");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_352(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_352,"LabelMenuIcon_352");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue_218(WebDriver driver,String PercentReadonlyYellowValue_218) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_218,PercentReadonlyYellowValue_218, "PercentReadonlyYellowValue_218");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_477(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_477,"LabelMenuIcon_477");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_92(WebDriver driver,String PercentRedValue_92) {
		            BrowserActions.type(driver, inpPercentRedValue_92,PercentRedValue_92, "PercentRedValue_92");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_90(WebDriver driver,String DecimalRedValue_90) {
		            BrowserActions.type(driver, inpDecimalRedValue_90,DecimalRedValue_90, "DecimalRedValue_90");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_310(WebDriver driver,String IntegerRedValue_310) {
		            BrowserActions.type(driver, inpIntegerRedValue_310,IntegerRedValue_310, "IntegerRedValue_310");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_114(WebDriver driver,String DecimalTargetValue_114) {
		            BrowserActions.type(driver, inpDecimalTargetValue_114,DecimalTargetValue_114, "DecimalTargetValue_114");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_16(WebDriver driver,String IntegerTargetValue_16) {
		            BrowserActions.type(driver, inpIntegerTargetValue_16,IntegerTargetValue_16, "IntegerTargetValue_16");
			        return this;
           }
public MetricsThresholdsPage enterUnit_112(WebDriver driver,String Unit_112) {
		            BrowserActions.type(driver, inpUnit_112,Unit_112, "Unit_112");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_231(WebDriver driver,String DecimalTargetValue_231) {
		            BrowserActions.type(driver, inpDecimalTargetValue_231,DecimalTargetValue_231, "DecimalTargetValue_231");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_176(WebDriver driver,String DecimalRedValue_176) {
		            BrowserActions.type(driver, inpDecimalRedValue_176,DecimalRedValue_176, "DecimalRedValue_176");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_84(WebDriver driver,String PercentTargetValue_84) {
		            BrowserActions.type(driver, inpPercentTargetValue_84,PercentTargetValue_84, "PercentTargetValue_84");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_318(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_318,"HighSeverity_318");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue_368(WebDriver driver,String IntegerYellowValue_368) {
		            BrowserActions.type(driver, inpIntegerYellowValue_368,IntegerYellowValue_368, "IntegerYellowValue_368");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_293(WebDriver driver,String DecimalRedValue_293) {
		            BrowserActions.type(driver, inpDecimalRedValue_293,DecimalRedValue_293, "DecimalRedValue_293");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_434(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_434,"CreateLimitForTier_434");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_432(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_432,"CreateLimitForTier_432");
				    return this;
			}
public MetricsThresholdsPage enterUnit_229(WebDriver driver,String Unit_229) {
		            BrowserActions.type(driver, inpUnit_229,Unit_229, "Unit_229");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_450(WebDriver driver,String PercentRedValue_450) {
		            BrowserActions.type(driver, inpPercentRedValue_450,PercentRedValue_450, "PercentRedValue_450");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_428(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_428,"CreateLimitForTier_428");
				    return this;
			}
public MetricsThresholdsPage clickLabelMenuIcon_225(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_225,"LabelMenuIcon_225");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_331(WebDriver driver,String PercentRedValue_331) {
		            BrowserActions.type(driver, inpPercentRedValue_331,PercentRedValue_331, "PercentRedValue_331");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_422(WebDriver driver,String IntegerRedValue_422) {
		            BrowserActions.type(driver, inpIntegerRedValue_422,IntegerRedValue_422, "IntegerRedValue_422");
			        return this;
           }
public MetricsThresholdsPage enterUnit_463(WebDriver driver,String Unit_463) {
		            BrowserActions.type(driver, inpUnit_463,Unit_463, "Unit_463");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_252(WebDriver driver,String IntegerYellowValue_252) {
		            BrowserActions.type(driver, inpIntegerYellowValue_252,IntegerYellowValue_252, "IntegerYellowValue_252");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_273(WebDriver driver,String PercentYellowValue_273) {
		            BrowserActions.type(driver, inpPercentYellowValue_273,PercentYellowValue_273, "PercentYellowValue_273");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_465(WebDriver driver,String DecimalTargetValue_465) {
		            BrowserActions.type(driver, inpDecimalTargetValue_465,DecimalTargetValue_465, "DecimalTargetValue_465");
			        return this;
           }
public MetricsThresholdsPage enterUnit(WebDriver driver,String Unit) {
		            BrowserActions.type(driver, inpUnit,Unit, "Unit");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_493(WebDriver driver,String IntegerYellowValue_493) {
		            BrowserActions.type(driver, inpIntegerYellowValue_493,IntegerYellowValue_493, "IntegerYellowValue_493");
			        return this;
           }
public MetricsThresholdsPage enterUnit_15(WebDriver driver,String Unit_15) {
		            BrowserActions.type(driver, inpUnit_15,Unit_15, "Unit_15");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_108(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_108,"LabelMenuIcon_108");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue_345(WebDriver driver,String PercentReadonlyYellowValue_345) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_345,PercentReadonlyYellowValue_345, "PercentReadonlyYellowValue_345");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_135(WebDriver driver,String IntegerYellowValue_135) {
		            BrowserActions.type(driver, inpIntegerYellowValue_135,IntegerYellowValue_135, "IntegerYellowValue_135");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_156(WebDriver driver,String PercentYellowValue_156) {
		            BrowserActions.type(driver, inpPercentYellowValue_156,PercentYellowValue_156, "PercentYellowValue_156");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_340(WebDriver driver,String DecimalTargetValue_340) {
		            BrowserActions.type(driver, inpDecimalTargetValue_340,DecimalTargetValue_340, "DecimalTargetValue_340");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_101(WebDriver driver,String PercentReadonlyYellowValue_101) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_101,PercentReadonlyYellowValue_101, "PercentReadonlyYellowValue_101");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_396(WebDriver driver,String PercentYellowValue_396) {
		            BrowserActions.type(driver, inpPercentYellowValue_396,PercentYellowValue_396, "PercentYellowValue_396");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_53(WebDriver driver,String PercentTargetValue_53) {
		            BrowserActions.type(driver, inpPercentTargetValue_53,PercentTargetValue_53, "PercentTargetValue_53");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_415(WebDriver driver,String DecimalTargetValue_415) {
		            BrowserActions.type(driver, inpDecimalTargetValue_415,DecimalTargetValue_415, "DecimalTargetValue_415");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_146(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_146,"MediumSeverity_146");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue_272(WebDriver driver,String PercentReadonlyYellowValue_272) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_272,PercentReadonlyYellowValue_272, "PercentReadonlyYellowValue_272");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_105(WebDriver driver,String PercentReadonlyRedValue_105) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_105,PercentReadonlyRedValue_105, "PercentReadonlyRedValue_105");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_106(WebDriver driver,String PercentRedValue_106) {
		            BrowserActions.type(driver, inpPercentRedValue_106,PercentRedValue_106, "PercentRedValue_106");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_172(WebDriver driver,String DecimalYellowValue_172) {
		            BrowserActions.type(driver, inpDecimalYellowValue_172,DecimalYellowValue_172, "DecimalYellowValue_172");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_320(WebDriver driver,String IntegerTargetValue_320) {
		            BrowserActions.type(driver, inpIntegerTargetValue_320,IntegerTargetValue_320, "IntegerTargetValue_320");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_349(WebDriver driver,String PercentReadonlyRedValue_349) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_349,PercentReadonlyRedValue_349, "PercentReadonlyRedValue_349");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_73(WebDriver driver,String DecimalRedValue_73) {
		            BrowserActions.type(driver, inpDecimalRedValue_73,DecimalRedValue_73, "DecimalRedValue_73");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_222(WebDriver driver,String PercentReadonlyRedValue_222) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_222,PercentReadonlyRedValue_222, "PercentReadonlyRedValue_222");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_223(WebDriver driver,String PercentRedValue_223) {
		            BrowserActions.type(driver, inpPercentRedValue_223,PercentRedValue_223, "PercentRedValue_223");
			        return this;
           }
public MetricsThresholdsPage enterTier_210(WebDriver driver,String Tier_210) {
		            BrowserActions.type(driver, inpTier_210,Tier_210, "Tier_210");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_437(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_437,"CreateLimitForTier_437");
				    return this;
			}
public MetricsThresholdsPage enterDecimalTargetValue_82(WebDriver driver,String DecimalTargetValue_82) {
		            BrowserActions.type(driver, inpDecimalTargetValue_82,DecimalTargetValue_82, "DecimalTargetValue_82");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_155(WebDriver driver,String PercentReadonlyYellowValue_155) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_155,PercentReadonlyYellowValue_155, "PercentReadonlyYellowValue_155");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_439(WebDriver driver,String IntegerTargetValue_439) {
		            BrowserActions.type(driver, inpIntegerTargetValue_439,IntegerTargetValue_439, "IntegerTargetValue_439");
			        return this;
           }
public MetricsThresholdsPage enterUnit_49(WebDriver driver,String Unit_49) {
		            BrowserActions.type(driver, inpUnit_49,Unit_49, "Unit_49");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_300(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_300,"HighSeverity_300");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue_395(WebDriver driver,String PercentReadonlyYellowValue_395) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_395,PercentReadonlyYellowValue_395, "PercentReadonlyYellowValue_395");
			        return this;
           }
public MetricsThresholdsPage enterUnit_413(WebDriver driver,String Unit_413) {
		            BrowserActions.type(driver, inpUnit_413,Unit_413, "Unit_413");
			        return this;
           }
public MetricsThresholdsPage enterUnit_31(WebDriver driver,String Unit_31) {
		            BrowserActions.type(driver, inpUnit_31,Unit_31, "Unit_31");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_65(WebDriver driver,String DecimalTargetValue_65) {
		            BrowserActions.type(driver, inpDecimalTargetValue_65,DecimalTargetValue_65, "DecimalTargetValue_65");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_289(WebDriver driver,String DecimalYellowValue_289) {
		            BrowserActions.type(driver, inpDecimalYellowValue_289,DecimalYellowValue_289, "DecimalYellowValue_289");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_193(WebDriver driver,String DecimalRedValue_193) {
		            BrowserActions.type(driver, inpDecimalRedValue_193,DecimalRedValue_193, "DecimalRedValue_193");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_291(WebDriver driver,String PercentYellowValue_291) {
		            BrowserActions.type(driver, inpPercentYellowValue_291,PercentYellowValue_291, "PercentYellowValue_291");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_81(WebDriver driver,String IntegerTargetValue_81) {
		            BrowserActions.type(driver, inpIntegerTargetValue_81,IntegerTargetValue_81, "IntegerTargetValue_81");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_335(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_335,"CreateLimitForTier_335");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_336(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_336,"CreateLimitForTier_336");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_457(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_457,"CreateLimitForTier_457");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_67(WebDriver driver,String PercentTargetValue_67) {
		            BrowserActions.type(driver, inpPercentTargetValue_67,PercentTargetValue_67, "PercentTargetValue_67");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_453(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_453,"CreateLimitForTier_453");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_302(WebDriver driver,String IntegerTargetValue_302) {
		            BrowserActions.type(driver, inpIntegerTargetValue_302,IntegerTargetValue_302, "IntegerTargetValue_302");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_350(WebDriver driver,String PercentRedValue_350) {
		            BrowserActions.type(driver, inpPercentRedValue_350,PercentRedValue_350, "PercentRedValue_350");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_330(WebDriver driver,String PercentReadonlyRedValue_330) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_330,PercentReadonlyRedValue_330, "PercentReadonlyRedValue_330");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_402(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_402,"LabelMenuIcon_402");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_475(WebDriver driver,String PercentRedValue_475) {
		            BrowserActions.type(driver, inpPercentRedValue_475,PercentRedValue_475, "PercentRedValue_475");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_164(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_164,"MediumSeverity_164");
				    return this;
			}
public MetricsThresholdsPage enterPercentYellowValue_174(WebDriver driver,String PercentYellowValue_174) {
		            BrowserActions.type(driver, inpPercentYellowValue_174,PercentYellowValue_174, "PercentYellowValue_174");
			        return this;
           }
public MetricsThresholdsPage clickExposureRedValueHeader(WebDriver driver)  {
					BrowserActions.click(driver, rdbExposureRedValueHeader,"ExposureRedValueHeader");
				    return this;
			}
public MetricsThresholdsPage clickMediumSeverity_281(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_281,"MediumSeverity_281");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue_38(WebDriver driver,String PercentReadonlyYellowValue_38) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_38,PercentReadonlyYellowValue_38, "PercentReadonlyYellowValue_38");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_50(WebDriver driver,String IntegerTargetValue_50) {
		            BrowserActions.type(driver, inpIntegerTargetValue_50,IntegerTargetValue_50, "IntegerTargetValue_50");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_128(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_128,"MediumSeverity_128");
				    return this;
			}
public MetricsThresholdsPage enterUnit_63(WebDriver driver,String Unit_63) {
		            BrowserActions.type(driver, inpUnit_63,Unit_63, "Unit_63");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_96(WebDriver driver,String DecimalTargetValue_96) {
		            BrowserActions.type(driver, inpDecimalTargetValue_96,DecimalTargetValue_96, "DecimalTargetValue_96");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_370(WebDriver driver,String PercentReadonlyYellowValue_370) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_370,PercentReadonlyYellowValue_370, "PercentReadonlyYellowValue_370");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_245(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_245,"MediumSeverity_245");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_305(WebDriver driver,String PercentTargetValue_305) {
		            BrowserActions.type(driver, inpPercentTargetValue_305,PercentTargetValue_305, "PercentTargetValue_305");
			        return this;
           }
public MetricsThresholdsPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,true,"Update");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue(WebDriver driver,String IntegerYellowValue) {
		            BrowserActions.type(driver, inpIntegerYellowValue,IntegerYellowValue, "IntegerYellowValue");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_35(WebDriver driver,String PercentTargetValue_35) {
		            BrowserActions.type(driver, inpPercentTargetValue_35,PercentTargetValue_35, "PercentTargetValue_35");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_208(WebDriver driver,String PercentReadonlyRedValue_208) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_208,PercentReadonlyRedValue_208, "PercentReadonlyRedValue_208");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_449(WebDriver driver,String PercentReadonlyRedValue_449) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_449,PercentReadonlyRedValue_449, "PercentReadonlyRedValue_449");
			        return this;
           }
public MetricsThresholdsPage enterLabelHeader(WebDriver driver,String LabelHeader) {
		            BrowserActions.type(driver, inpLabelHeader,LabelHeader, "LabelHeader");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_462(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_462,"CreateLimitForTier_462");
				    return this;
			}
public MetricsThresholdsPage enterUnit_438(WebDriver driver,String Unit_438) {
		            BrowserActions.type(driver, inpUnit_438,Unit_438, "Unit_438");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_241(WebDriver driver,String PercentRedValue_241) {
		            BrowserActions.type(driver, inpPercentRedValue_241,PercentRedValue_241, "PercentRedValue_241");
			        return this;
           }
public MetricsThresholdsPage enterUnit_319(WebDriver driver,String Unit_319) {
		            BrowserActions.type(driver, inpUnit_319,Unit_319, "Unit_319");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_414(WebDriver driver,String IntegerTargetValue_414) {
		            BrowserActions.type(driver, inpIntegerTargetValue_414,IntegerTargetValue_414, "IntegerTargetValue_414");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_124(WebDriver driver,String PercentRedValue_124) {
		            BrowserActions.type(driver, inpPercentRedValue_124,PercentRedValue_124, "PercentRedValue_124");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_337(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_337,"CreateLimitForTier_337");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_459(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_459,"CreateLimitForTier_459");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_417(WebDriver driver,String PercentTargetValue_417) {
		            BrowserActions.type(driver, inpPercentTargetValue_417,PercentTargetValue_417, "PercentTargetValue_417");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_495(WebDriver driver,String PercentReadonlyYellowValue_495) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_495,PercentReadonlyYellowValue_495, "PercentReadonlyYellowValue_495");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_254(WebDriver driver,String PercentReadonlyYellowValue_254) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_254,PercentReadonlyYellowValue_254, "PercentReadonlyYellowValue_254");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_315(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_315,"LabelMenuIcon_315");
				    return this;
			}
public MetricsThresholdsPage enterDecimalRedValue_59(WebDriver driver,String DecimalRedValue_59) {
		            BrowserActions.type(driver, inpDecimalRedValue_59,DecimalRedValue_59, "DecimalRedValue_59");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_137(WebDriver driver,String PercentReadonlyYellowValue_137) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_137,PercentReadonlyYellowValue_137, "PercentReadonlyYellowValue_137");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_188(WebDriver driver,String IntegerYellowValue_188) {
		            BrowserActions.type(driver, inpIntegerYellowValue_188,IntegerYellowValue_188, "IntegerYellowValue_188");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalHighComplexity_385(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalHighComplexity_385,"1stPartyMedicalHighComplexity_385");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue_22(WebDriver driver,String PercentReadonlyYellowValue_22) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_22,PercentReadonlyYellowValue_22, "PercentReadonlyYellowValue_22");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_189(WebDriver driver,String DecimalYellowValue_189) {
		            BrowserActions.type(driver, inpDecimalYellowValue_189,DecimalYellowValue_189, "DecimalYellowValue_189");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity,"HighSeverity");
				    return this;
			}
public MetricsThresholdsPage enterPercentYellowValue_191(WebDriver driver,String PercentYellowValue_191) {
		            BrowserActions.type(driver, inpPercentYellowValue_191,PercentYellowValue_191, "PercentYellowValue_191");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_303(WebDriver driver,String DecimalTargetValue_303) {
		            BrowserActions.type(driver, inpDecimalTargetValue_303,DecimalTargetValue_303, "DecimalTargetValue_303");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_357(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_357,"CreateLimitForTier_357");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_478(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_478,"CreateLimitForTier_478");
				    return this;
			}
public MetricsThresholdsPage enterDecimalRedValue(WebDriver driver,String DecimalRedValue) {
		            BrowserActions.type(driver, inpDecimalRedValue,DecimalRedValue, "DecimalRedValue");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_259(WebDriver driver,String PercentRedValue_259) {
		            BrowserActions.type(driver, inpPercentRedValue_259,PercentRedValue_259, "PercentRedValue_259");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_312(WebDriver driver,String PercentReadonlyRedValue_312) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_312,PercentReadonlyRedValue_312, "PercentReadonlyRedValue_312");
			        return this;
           }
public MetricsThresholdsPage selectPolicyType(WebDriver driver,String PolicyType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,"PolicyType");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_353(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_353,"CreateLimitForTier_353");
				    return this;
			}
public MetricsThresholdsPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue_171(WebDriver driver,String IntegerYellowValue_171) {
		            BrowserActions.type(driver, inpIntegerYellowValue_171,IntegerYellowValue_171, "IntegerYellowValue_171");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_375(WebDriver driver,String PercentRedValue_375) {
		            BrowserActions.type(driver, inpPercentRedValue_375,PercentRedValue_375, "PercentRedValue_375");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_263(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_263,"MediumSeverity_263");
				    return this;
			}
public MetricsThresholdsPage clickLabelMenuIcon_427(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_427,"LabelMenuIcon_427");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_64(WebDriver driver,String IntegerTargetValue_64) {
		            BrowserActions.type(driver, inpIntegerTargetValue_64,IntegerTargetValue_64, "IntegerTargetValue_64");
			        return this;
           }
public MetricsThresholdsPage enterUnit_301(WebDriver driver,String Unit_301) {
		            BrowserActions.type(driver, inpUnit_301,Unit_301, "Unit_301");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_190(WebDriver driver,String PercentReadonlyYellowValue_190) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_190,PercentReadonlyYellowValue_190, "PercentReadonlyYellowValue_190");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_253(WebDriver driver,String DecimalYellowValue_253) {
		            BrowserActions.type(driver, inpDecimalYellowValue_253,DecimalYellowValue_253, "DecimalYellowValue_253");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_136(WebDriver driver,String DecimalYellowValue_136) {
		            BrowserActions.type(driver, inpDecimalYellowValue_136,DecimalYellowValue_136, "DecimalYellowValue_136");
			        return this;
           }
public MetricsThresholdsPage enterUnit_80(WebDriver driver,String Unit_80) {
		            BrowserActions.type(driver, inpUnit_80,Unit_80, "Unit_80");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalLowComplexity_483(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalLowComplexity_483,"3rdPartyMedicalLowComplexity_483");
				    return this;
			}
public MetricsThresholdsPage clickExposureMetricLimits(WebDriver driver)  {
					BrowserActions.click(driver, btnExposureMetricLimits,true,"ExposureMetricLimits");
				    return this;
			}
public MetricsThresholdsPage enterDecimalRedValue_423(WebDriver driver,String DecimalRedValue_423) {
		            BrowserActions.type(driver, inpDecimalRedValue_423,DecimalRedValue_423, "DecimalRedValue_423");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_494(WebDriver driver,String DecimalYellowValue_494) {
		            BrowserActions.type(driver, inpDecimalYellowValue_494,DecimalYellowValue_494, "DecimalYellowValue_494");
			        return this;
           }
public MetricsThresholdsPage enterTargetValueHeader(WebDriver driver,String TargetValueHeader) {
		            BrowserActions.type(driver, inpTargetValueHeader,TargetValueHeader, "TargetValueHeader");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_141(WebDriver driver,String PercentReadonlyRedValue_141) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_141,PercentReadonlyRedValue_141, "PercentReadonlyRedValue_141");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_175(WebDriver driver,String IntegerRedValue_175) {
		            BrowserActions.type(driver, inpIntegerRedValue_175,IntegerRedValue_175, "IntegerRedValue_175");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_202(WebDriver driver,String IntegerYellowValue_202) {
		            BrowserActions.type(driver, inpIntegerYellowValue_202,IntegerYellowValue_202, "IntegerYellowValue_202");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_443(WebDriver driver,String IntegerYellowValue_443) {
		            BrowserActions.type(driver, inpIntegerYellowValue_443,IntegerYellowValue_443, "IntegerYellowValue_443");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_322(WebDriver driver,String PercentReadonlyTargetValue_322) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_322,PercentReadonlyTargetValue_322, "PercentReadonlyTargetValue_322");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalHighComplexity_485(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalHighComplexity_485,"1stPartyMedicalHighComplexity_485");
				    return this;
			}
public MetricsThresholdsPage enterClaimMetricLimitCategoryHeader(WebDriver driver,String ClaimMetricLimitCategoryHeader) {
		            BrowserActions.type(driver, inpClaimMetricLimitCategoryHeader,ClaimMetricLimitCategoryHeader, "ClaimMetricLimitCategoryHeader");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_306(WebDriver driver,String IntegerYellowValue_306) {
		            BrowserActions.type(driver, inpIntegerYellowValue_306,IntegerYellowValue_306, "IntegerYellowValue_306");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_369(WebDriver driver,String DecimalYellowValue_369) {
		            BrowserActions.type(driver, inpDecimalYellowValue_369,DecimalYellowValue_369, "DecimalYellowValue_369");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_258(WebDriver driver,String PercentReadonlyRedValue_258) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_258,PercentReadonlyRedValue_258, "PercentReadonlyRedValue_258");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_499(WebDriver driver,String PercentReadonlyRedValue_499) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_499,PercentReadonlyRedValue_499, "PercentReadonlyRedValue_499");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_311(WebDriver driver,String DecimalRedValue_311) {
		            BrowserActions.type(driver, inpDecimalRedValue_311,DecimalRedValue_311, "DecimalRedValue_311");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_441(WebDriver driver,String PercentReadonlyTargetValue_441) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_441,PercentReadonlyTargetValue_441, "PercentReadonlyTargetValue_441");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_200(WebDriver driver,String PercentReadonlyTargetValue_200) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_200,PercentReadonlyTargetValue_200, "PercentReadonlyTargetValue_200");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_292(WebDriver driver,String IntegerRedValue_292) {
		            BrowserActions.type(driver, inpIntegerRedValue_292,IntegerRedValue_292, "IntegerRedValue_292");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_41(WebDriver driver,String DecimalRedValue_41) {
		            BrowserActions.type(driver, inpDecimalRedValue_41,DecimalRedValue_41, "DecimalRedValue_41");
			        return this;
           }
public MetricsThresholdsPage clickRental_404(WebDriver driver)  {
					BrowserActions.click(driver, btnRental_404,"Rental_404");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_19(WebDriver driver,String PercentTargetValue_19) {
		            BrowserActions.type(driver, inpPercentTargetValue_19,PercentTargetValue_19, "PercentTargetValue_19");
			        return this;
           }
public MetricsThresholdsPage enterExposureLabelHeader(WebDriver driver,String ExposureLabelHeader) {
		            BrowserActions.type(driver, inpExposureLabelHeader,ExposureLabelHeader, "ExposureLabelHeader");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_374(WebDriver driver,String PercentReadonlyRedValue_374) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_374,PercentReadonlyRedValue_374, "PercentReadonlyRedValue_374");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalHighComplexity_360(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalHighComplexity_360,"1stPartyMedicalHighComplexity_360");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue_68(WebDriver driver,String IntegerYellowValue_68) {
		            BrowserActions.type(driver, inpIntegerYellowValue_68,IntegerYellowValue_68, "IntegerYellowValue_68");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_154(WebDriver driver,String DecimalYellowValue_154) {
		            BrowserActions.type(driver, inpDecimalYellowValue_154,DecimalYellowValue_154, "DecimalYellowValue_154");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_290(WebDriver driver,String PercentReadonlyYellowValue_290) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_290,PercentReadonlyYellowValue_290, "PercentReadonlyYellowValue_290");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_95(WebDriver driver,String IntegerTargetValue_95) {
		            BrowserActions.type(driver, inpIntegerTargetValue_95,IntegerTargetValue_95, "IntegerTargetValue_95");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_173(WebDriver driver,String PercentReadonlyYellowValue_173) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_173,PercentReadonlyYellowValue_173, "PercentReadonlyYellowValue_173");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_418(WebDriver driver,String IntegerYellowValue_418) {
		            BrowserActions.type(driver, inpIntegerYellowValue_418,IntegerYellowValue_418, "IntegerYellowValue_418");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_416(WebDriver driver,String PercentReadonlyTargetValue_416) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_416,PercentReadonlyTargetValue_416, "PercentReadonlyTargetValue_416");
			        return this;
           }
public MetricsThresholdsPage enterExposureMetricLimitsHeader(WebDriver driver,String ExposureMetricLimitsHeader) {
		            BrowserActions.type(driver, inpExposureMetricLimitsHeader,ExposureMetricLimitsHeader, "ExposureMetricLimitsHeader");
			        return this;
           }
public MetricsThresholdsPage enterTier_62(WebDriver driver,String Tier_62) {
		            BrowserActions.type(driver, inpTier_62,Tier_62, "Tier_62");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_448(WebDriver driver,String DecimalRedValue_448) {
		            BrowserActions.type(driver, inpDecimalRedValue_448,DecimalRedValue_448, "DecimalRedValue_448");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalLowComplexity_383(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalLowComplexity_383,"3rdPartyMedicalLowComplexity_383");
				    return this;
			}
public MetricsThresholdsPage enterDecimalYellowValue_271(WebDriver driver,String DecimalYellowValue_271) {
		            BrowserActions.type(driver, inpDecimalYellowValue_271,DecimalYellowValue_271, "DecimalYellowValue_271");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_394(WebDriver driver,String DecimalYellowValue_394) {
		            BrowserActions.type(driver, inpDecimalYellowValue_394,DecimalYellowValue_394, "DecimalYellowValue_394");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_240(WebDriver driver,String PercentReadonlyRedValue_240) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_240,PercentReadonlyRedValue_240, "PercentReadonlyRedValue_240");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_274(WebDriver driver,String IntegerRedValue_274) {
		            BrowserActions.type(driver, inpIntegerRedValue_274,IntegerRedValue_274, "IntegerRedValue_274");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_123(WebDriver driver,String PercentReadonlyRedValue_123) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_123,PercentReadonlyRedValue_123, "PercentReadonlyRedValue_123");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_397(WebDriver driver,String IntegerRedValue_397) {
		            BrowserActions.type(driver, inpIntegerRedValue_397,IntegerRedValue_397, "IntegerRedValue_397");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_157(WebDriver driver,String IntegerRedValue_157) {
		            BrowserActions.type(driver, inpIntegerRedValue_157,IntegerRedValue_157, "IntegerRedValue_157");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_165(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_165,"HighSeverity_165");
				    return this;
			}
public MetricsThresholdsPage enterDecimalTargetValue_3(WebDriver driver,String DecimalTargetValue_3) {
		            BrowserActions.type(driver, inpDecimalTargetValue_3,DecimalTargetValue_3, "DecimalTargetValue_3");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_421(WebDriver driver,String PercentYellowValue_421) {
		            BrowserActions.type(driver, inpPercentYellowValue_421,PercentYellowValue_421, "PercentYellowValue_421");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_99(WebDriver driver,String IntegerYellowValue_99) {
		            BrowserActions.type(driver, inpIntegerYellowValue_99,IntegerYellowValue_99, "IntegerYellowValue_99");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_282(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_282,"HighSeverity_282");
				    return this;
			}
public MetricsThresholdsPage enterDecimalRedValue_11(WebDriver driver,String DecimalRedValue_11) {
		            BrowserActions.type(driver, inpDecimalRedValue_11,DecimalRedValue_11, "DecimalRedValue_11");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalHighComplexity_460(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalHighComplexity_460,"1stPartyMedicalHighComplexity_460");
				    return this;
			}
public MetricsThresholdsPage enterClaimMetricLimitCategoryHeader_44(WebDriver driver,String ClaimMetricLimitCategoryHeader_44) {
		            BrowserActions.type(driver, inpClaimMetricLimitCategoryHeader_44,ClaimMetricLimitCategoryHeader_44, "ClaimMetricLimitCategoryHeader_44");
			        return this;
           }
public MetricsThresholdsPage enterUnit_94(WebDriver driver,String Unit_94) {
		            BrowserActions.type(driver, inpUnit_94,Unit_94, "Unit_94");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_304(WebDriver driver,String PercentReadonlyTargetValue_304) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_304,PercentReadonlyTargetValue_304, "PercentReadonlyTargetValue_304");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_309(WebDriver driver,String PercentYellowValue_309) {
		            BrowserActions.type(driver, inpPercentYellowValue_309,PercentYellowValue_309, "PercentYellowValue_309");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_474(WebDriver driver,String PercentReadonlyRedValue_474) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_474,PercentReadonlyRedValue_474, "PercentReadonlyRedValue_474");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_207(WebDriver driver,String DecimalRedValue_207) {
		            BrowserActions.type(driver, inpDecimalRedValue_207,DecimalRedValue_207, "DecimalRedValue_207");
			        return this;
           }
public MetricsThresholdsPage clickRental_429(WebDriver driver)  {
					BrowserActions.click(driver, btnRental_429,"Rental_429");
				    return this;
			}
public MetricsThresholdsPage enterDecimalRedValue_329(WebDriver driver,String DecimalRedValue_329) {
		            BrowserActions.type(driver, inpDecimalRedValue_329,DecimalRedValue_329, "DecimalRedValue_329");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_25(WebDriver driver,String DecimalRedValue_25) {
		            BrowserActions.type(driver, inpDecimalRedValue_25,DecimalRedValue_25, "DecimalRedValue_25");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_85(WebDriver driver,String IntegerYellowValue_85) {
		            BrowserActions.type(driver, inpIntegerYellowValue_85,IntegerYellowValue_85, "IntegerYellowValue_85");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalHighComplexity(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalHighComplexity,"1stPartyMedicalHighComplexity");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue_117(WebDriver driver,String IntegerYellowValue_117) {
		            BrowserActions.type(driver, inpIntegerYellowValue_117,IntegerYellowValue_117, "IntegerYellowValue_117");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_115(WebDriver driver,String PercentReadonlyTargetValue_115) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_115,PercentReadonlyTargetValue_115, "PercentReadonlyTargetValue_115");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_147(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_147,"HighSeverity_147");
				    return this;
			}
public MetricsThresholdsPage enterDecimalRedValue_348(WebDriver driver,String DecimalRedValue_348) {
		            BrowserActions.type(driver, inpDecimalRedValue_348,DecimalRedValue_348, "DecimalRedValue_348");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_104(WebDriver driver,String DecimalRedValue_104) {
		            BrowserActions.type(driver, inpDecimalRedValue_104,DecimalRedValue_104, "DecimalRedValue_104");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalHighComplexity_435(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalHighComplexity_435,"1stPartyMedicalHighComplexity_435");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_500(WebDriver driver,String PercentRedValue_500) {
		            BrowserActions.type(driver, inpPercentRedValue_500,PercentRedValue_500, "PercentRedValue_500");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_221(WebDriver driver,String DecimalRedValue_221) {
		            BrowserActions.type(driver, inpDecimalRedValue_221,DecimalRedValue_221, "DecimalRedValue_221");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_232(WebDriver driver,String PercentReadonlyTargetValue_232) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_232,PercentReadonlyTargetValue_232, "PercentReadonlyTargetValue_232");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_36(WebDriver driver,String IntegerYellowValue_36) {
		            BrowserActions.type(driver, inpIntegerYellowValue_36,IntegerYellowValue_36, "IntegerYellowValue_36");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_205(WebDriver driver,String PercentYellowValue_205) {
		            BrowserActions.type(driver, inpPercentYellowValue_205,PercentYellowValue_205, "PercentYellowValue_205");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_446(WebDriver driver,String PercentYellowValue_446) {
		            BrowserActions.type(driver, inpPercentYellowValue_446,PercentYellowValue_446, "PercentYellowValue_446");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon,"LabelMenuIcon");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_372(WebDriver driver,String IntegerRedValue_372) {
		            BrowserActions.type(driver, inpIntegerRedValue_372,IntegerRedValue_372, "IntegerRedValue_372");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_497(WebDriver driver,String IntegerRedValue_497) {
		            BrowserActions.type(driver, inpIntegerRedValue_497,IntegerRedValue_497, "IntegerRedValue_497");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_256(WebDriver driver,String IntegerRedValue_256) {
		            BrowserActions.type(driver, inpIntegerRedValue_256,IntegerRedValue_256, "IntegerRedValue_256");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_327(WebDriver driver,String PercentYellowValue_327) {
		            BrowserActions.type(driver, inpPercentYellowValue_327,PercentYellowValue_327, "PercentYellowValue_327");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_217(WebDriver driver,String DecimalYellowValue_217) {
		            BrowserActions.type(driver, inpDecimalYellowValue_217,DecimalYellowValue_217, "DecimalYellowValue_217");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_264(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_264,"HighSeverity_264");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_139(WebDriver driver,String IntegerRedValue_139) {
		            BrowserActions.type(driver, inpIntegerRedValue_139,IntegerRedValue_139, "IntegerRedValue_139");
			        return this;
           }
public MetricsThresholdsPage clickRental_454(WebDriver driver)  {
					BrowserActions.click(driver, btnRental_454,"Rental_454");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyTargetValue_366(WebDriver driver,String PercentReadonlyTargetValue_366) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_366,PercentReadonlyTargetValue_366, "PercentReadonlyTargetValue_366");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_473(WebDriver driver,String DecimalRedValue_473) {
		            BrowserActions.type(driver, inpDecimalRedValue_473,DecimalRedValue_473, "DecimalRedValue_473");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_468(WebDriver driver,String IntegerYellowValue_468) {
		            BrowserActions.type(driver, inpIntegerYellowValue_468,IntegerYellowValue_468, "IntegerYellowValue_468");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_203(WebDriver driver,String DecimalYellowValue_203) {
		            BrowserActions.type(driver, inpDecimalYellowValue_203,DecimalYellowValue_203, "DecimalYellowValue_203");
			        return this;
           }
public MetricsThresholdsPage clickTowing_405(WebDriver driver)  {
					BrowserActions.click(driver, btnTowing_405,"Towing_405");
				    return this;
			}
public MetricsThresholdsPage clickMediumSeverity(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity,"MediumSeverity");
				    return this;
			}
public MetricsThresholdsPage enterDecimalYellowValue_444(WebDriver driver,String DecimalYellowValue_444) {
		            BrowserActions.type(driver, inpDecimalYellowValue_444,DecimalYellowValue_444, "DecimalYellowValue_444");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_325(WebDriver driver,String DecimalYellowValue_325) {
		            BrowserActions.type(driver, inpDecimalYellowValue_325,DecimalYellowValue_325, "DecimalYellowValue_325");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_239(WebDriver driver,String DecimalRedValue_239) {
		            BrowserActions.type(driver, inpDecimalRedValue_239,DecimalRedValue_239, "DecimalRedValue_239");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_317(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_317,"MediumSeverity_317");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyRedValue_294(WebDriver driver,String PercentReadonlyRedValue_294) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_294,PercentReadonlyRedValue_294, "PercentReadonlyRedValue_294");
			        return this;
           }
public MetricsThresholdsPage enterTier_14(WebDriver driver,String Tier_14) {
		            BrowserActions.type(driver, inpTier_14,Tier_14, "Tier_14");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_121(WebDriver driver,String IntegerRedValue_121) {
		            BrowserActions.type(driver, inpIntegerRedValue_121,IntegerRedValue_121, "IntegerRedValue_121");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_177(WebDriver driver,String PercentReadonlyRedValue_177) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_177,PercentReadonlyRedValue_177, "PercentReadonlyRedValue_177");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_219(WebDriver driver,String PercentYellowValue_219) {
		            BrowserActions.type(driver, inpPercentYellowValue_219,PercentYellowValue_219, "PercentYellowValue_219");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_20(WebDriver driver,String IntegerYellowValue_20) {
		            BrowserActions.type(driver, inpIntegerYellowValue_20,IntegerYellowValue_20, "IntegerYellowValue_20");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_234(WebDriver driver,String IntegerYellowValue_234) {
		            BrowserActions.type(driver, inpIntegerYellowValue_234,IntegerYellowValue_234, "IntegerYellowValue_234");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalLowComplexity_431(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalLowComplexity_431,"1stPartyMedicalLowComplexity_431");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyTargetValue_18(WebDriver driver,String PercentReadonlyTargetValue_18) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_18,PercentReadonlyTargetValue_18, "PercentReadonlyTargetValue_18");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_129(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_129,"HighSeverity_129");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue_216(WebDriver driver,String IntegerYellowValue_216) {
		            BrowserActions.type(driver, inpIntegerYellowValue_216,IntegerYellowValue_216, "IntegerYellowValue_216");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_214(WebDriver driver,String PercentReadonlyTargetValue_214) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_214,PercentReadonlyTargetValue_214, "PercentReadonlyTargetValue_214");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_235(WebDriver driver,String DecimalYellowValue_235) {
		            BrowserActions.type(driver, inpDecimalYellowValue_235,DecimalYellowValue_235, "DecimalYellowValue_235");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_246(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_246,"HighSeverity_246");
				    return this;
			}
public MetricsThresholdsPage click1stPartyMedicalHighComplexity_410(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalHighComplexity_410,"1stPartyMedicalHighComplexity_410");
				    return this;
			}
public MetricsThresholdsPage enterDecimalTargetValue_17(WebDriver driver,String DecimalTargetValue_17) {
		            BrowserActions.type(driver, inpDecimalTargetValue_17,DecimalTargetValue_17, "DecimalTargetValue_17");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_122(WebDriver driver,String DecimalRedValue_122) {
		            BrowserActions.type(driver, inpDecimalRedValue_122,DecimalRedValue_122, "DecimalRedValue_122");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_346(WebDriver driver,String PercentYellowValue_346) {
		            BrowserActions.type(driver, inpPercentYellowValue_346,PercentYellowValue_346, "PercentYellowValue_346");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_472(WebDriver driver,String IntegerRedValue_472) {
		            BrowserActions.type(driver, inpIntegerRedValue_472,IntegerRedValue_472, "IntegerRedValue_472");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_400(WebDriver driver,String PercentRedValue_400) {
		            BrowserActions.type(driver, inpPercentRedValue_400,PercentRedValue_400, "PercentRedValue_400");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalLowComplexity_406(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalLowComplexity_406,"1stPartyMedicalLowComplexity_406");
				    return this;
			}
public MetricsThresholdsPage enterDecimalYellowValue_118(WebDriver driver,String DecimalYellowValue_118) {
		            BrowserActions.type(driver, inpDecimalYellowValue_118,DecimalYellowValue_118, "DecimalYellowValue_118");
			        return this;
           }
public MetricsThresholdsPage clickRental_354(WebDriver driver)  {
					BrowserActions.click(driver, btnRental_354,"Rental_354");
				    return this;
			}
public MetricsThresholdsPage clickLowSeverity_298(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_298,"LowSeverity_298");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_238(WebDriver driver,String IntegerRedValue_238) {
		            BrowserActions.type(driver, inpIntegerRedValue_238,IntegerRedValue_238, "IntegerRedValue_238");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_54(WebDriver driver,String IntegerYellowValue_54) {
		            BrowserActions.type(driver, inpIntegerYellowValue_54,IntegerYellowValue_54, "IntegerYellowValue_54");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_102(WebDriver driver,String PercentYellowValue_102) {
		            BrowserActions.type(driver, inpPercentYellowValue_102,PercentYellowValue_102, "PercentYellowValue_102");
			        return this;
           }
public MetricsThresholdsPage clickRental_479(WebDriver driver)  {
					BrowserActions.click(driver, btnRental_479,"Rental_479");
				    return this;
			}
public MetricsThresholdsPage enterIntegerYellowValue_343(WebDriver driver,String IntegerYellowValue_343) {
		            BrowserActions.type(driver, inpIntegerYellowValue_343,IntegerYellowValue_343, "IntegerYellowValue_343");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_100(WebDriver driver,String DecimalYellowValue_100) {
		            BrowserActions.type(driver, inpDecimalYellowValue_100,DecimalYellowValue_100, "DecimalYellowValue_100");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_373(WebDriver driver,String DecimalRedValue_373) {
		            BrowserActions.type(driver, inpDecimalRedValue_373,DecimalRedValue_373, "DecimalRedValue_373");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_466(WebDriver driver,String PercentReadonlyTargetValue_466) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_466,PercentReadonlyTargetValue_466, "PercentReadonlyTargetValue_466");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_344(WebDriver driver,String DecimalYellowValue_344) {
		            BrowserActions.type(driver, inpDecimalYellowValue_344,DecimalYellowValue_344, "DecimalYellowValue_344");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_324(WebDriver driver,String IntegerYellowValue_324) {
		            BrowserActions.type(driver, inpIntegerYellowValue_324,IntegerYellowValue_324, "IntegerYellowValue_324");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_9(WebDriver driver,String PercentYellowValue_9) {
		            BrowserActions.type(driver, inpPercentYellowValue_9,PercentYellowValue_9, "PercentYellowValue_9");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_469(WebDriver driver,String DecimalYellowValue_469) {
		            BrowserActions.type(driver, inpDecimalYellowValue_469,DecimalYellowValue_469, "DecimalYellowValue_469");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_159(WebDriver driver,String PercentReadonlyRedValue_159) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_159,PercentReadonlyRedValue_159, "PercentReadonlyRedValue_159");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_399(WebDriver driver,String PercentReadonlyRedValue_399) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_399,PercentReadonlyRedValue_399, "PercentReadonlyRedValue_399");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_498(WebDriver driver,String DecimalRedValue_498) {
		            BrowserActions.type(driver, inpDecimalRedValue_498,DecimalRedValue_498, "DecimalRedValue_498");
			        return this;
           }
public MetricsThresholdsPage enterDecimalRedValue_257(WebDriver driver,String DecimalRedValue_257) {
		            BrowserActions.type(driver, inpDecimalRedValue_257,DecimalRedValue_257, "DecimalRedValue_257");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_341(WebDriver driver,String PercentReadonlyTargetValue_341) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_341,PercentReadonlyTargetValue_341, "PercentReadonlyTargetValue_341");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_237(WebDriver driver,String PercentYellowValue_237) {
		            BrowserActions.type(driver, inpPercentYellowValue_237,PercentYellowValue_237, "PercentYellowValue_237");
			        return this;
           }
public MetricsThresholdsPage clickLargeLossThreshold(WebDriver driver)  {
					BrowserActions.click(driver, btnLargeLossThreshold,"LargeLossThreshold");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_220(WebDriver driver,String IntegerRedValue_220) {
		            BrowserActions.type(driver, inpIntegerRedValue_220,IntegerRedValue_220, "IntegerRedValue_220");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_276(WebDriver driver,String PercentReadonlyRedValue_276) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_276,PercentReadonlyRedValue_276, "PercentReadonlyRedValue_276");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_103(WebDriver driver,String IntegerRedValue_103) {
		            BrowserActions.type(driver, inpIntegerRedValue_103,IntegerRedValue_103, "IntegerRedValue_103");
			        return this;
           }
public MetricsThresholdsPage clickHighSeverity_111(WebDriver driver)  {
					BrowserActions.click(driver, btnHighSeverity_111,"HighSeverity_111");
				    return this;
			}
public MetricsThresholdsPage enterPercentYellowValue_471(WebDriver driver,String PercentYellowValue_471) {
		            BrowserActions.type(driver, inpPercentYellowValue_471,PercentYellowValue_471, "PercentYellowValue_471");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_347(WebDriver driver,String IntegerRedValue_347) {
		            BrowserActions.type(driver, inpIntegerRedValue_347,IntegerRedValue_347, "IntegerRedValue_347");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_34(WebDriver driver,String PercentReadonlyTargetValue_34) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_34,PercentReadonlyTargetValue_34, "PercentReadonlyTargetValue_34");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_4(WebDriver driver,String PercentReadonlyTargetValue_4) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_4,PercentReadonlyTargetValue_4, "PercentReadonlyTargetValue_4");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalHighComplexity_461(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalHighComplexity_461,"3rdPartyMedicalHighComplexity_461");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_287(WebDriver driver,String PercentTargetValue_287) {
		            BrowserActions.type(driver, inpPercentTargetValue_287,PercentTargetValue_287, "PercentTargetValue_287");
			        return this;
           }
public MetricsThresholdsPage clickExposureYellowValueHeader(WebDriver driver)  {
					BrowserActions.click(driver, rdbExposureYellowValueHeader,"ExposureYellowValueHeader");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyTargetValue_391(WebDriver driver,String PercentReadonlyTargetValue_391) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_391,PercentReadonlyTargetValue_391, "PercentReadonlyTargetValue_391");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_151(WebDriver driver,String PercentReadonlyTargetValue_151) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_151,PercentReadonlyTargetValue_151, "PercentReadonlyTargetValue_151");
			        return this;
           }
public MetricsThresholdsPage clickTowing_430(WebDriver driver)  {
					BrowserActions.click(driver, btnTowing_430,"Towing_430");
				    return this;
			}
public MetricsThresholdsPage enterPercentYellowValue_57(WebDriver driver,String PercentYellowValue_57) {
		            BrowserActions.type(driver, inpPercentYellowValue_57,PercentYellowValue_57, "PercentYellowValue_57");
			        return this;
           }
public MetricsThresholdsPage clickRental_379(WebDriver driver)  {
					BrowserActions.click(driver, btnRental_379,"Rental_379");
				    return this;
			}
public MetricsThresholdsPage click3rdPartyMedicalLowComplexity_408(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalLowComplexity_408,"3rdPartyMedicalLowComplexity_408");
				    return this;
			}
public MetricsThresholdsPage enterDecimalYellowValue_419(WebDriver driver,String DecimalYellowValue_419) {
		            BrowserActions.type(driver, inpDecimalYellowValue_419,DecimalYellowValue_419, "DecimalYellowValue_419");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_169(WebDriver driver,String PercentReadonlyTargetValue_169) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_169,PercentReadonlyTargetValue_169, "PercentReadonlyTargetValue_169");
			        return this;
           }
public MetricsThresholdsPage enterLabel_28(WebDriver driver,String Label_28) {
		            BrowserActions.type(driver, inpLabel_28,Label_28, "Label_28");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalLowComplexity_481(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalLowComplexity_481,"1stPartyMedicalLowComplexity_481");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_170(WebDriver driver,String PercentTargetValue_170) {
		            BrowserActions.type(driver, inpPercentTargetValue_170,PercentTargetValue_170, "PercentTargetValue_170");
			        return this;
           }
public MetricsThresholdsPage enterExposureTargetValueHeader(WebDriver driver,String ExposureTargetValueHeader) {
		            BrowserActions.type(driver, inpExposureTargetValueHeader,ExposureTargetValueHeader, "ExposureTargetValueHeader");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalLowComplexity(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalLowComplexity,"1stPartyMedicalLowComplexity");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyTargetValue_286(WebDriver driver,String PercentReadonlyTargetValue_286) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_286,PercentReadonlyTargetValue_286, "PercentReadonlyTargetValue_286");
			        return this;
           }
public MetricsThresholdsPage clickRemove_332(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_332,"Remove_332");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_198(WebDriver driver,String IntegerTargetValue_198) {
		            BrowserActions.type(driver, inpIntegerTargetValue_198,IntegerTargetValue_198, "IntegerTargetValue_198");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_39(WebDriver driver,String PercentYellowValue_39) {
		            BrowserActions.type(driver, inpPercentYellowValue_39,PercentYellowValue_39, "PercentYellowValue_39");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_40(WebDriver driver,String IntegerRedValue_40) {
		            BrowserActions.type(driver, inpIntegerRedValue_40,IntegerRedValue_40, "IntegerRedValue_40");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_163(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_163,"LowSeverity_163");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyTargetValue_52(WebDriver driver,String PercentReadonlyTargetValue_52) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_52,PercentReadonlyTargetValue_52, "PercentReadonlyTargetValue_52");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_280(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_280,"LowSeverity_280");
				    return this;
			}
public MetricsThresholdsPage click1stPartyMedicalLowComplexity_356(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalLowComplexity_356,"1stPartyMedicalLowComplexity_356");
				    return this;
			}
public MetricsThresholdsPage enterPercentYellowValue_71(WebDriver driver,String PercentYellowValue_71) {
		            BrowserActions.type(driver, inpPercentYellowValue_71,PercentYellowValue_71, "PercentYellowValue_71");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_491(WebDriver driver,String PercentReadonlyTargetValue_491) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_491,PercentReadonlyTargetValue_491, "PercentReadonlyTargetValue_491");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_184(WebDriver driver,String IntegerTargetValue_184) {
		            BrowserActions.type(driver, inpIntegerTargetValue_184,IntegerTargetValue_184, "IntegerTargetValue_184");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_250(WebDriver driver,String PercentReadonlyTargetValue_250) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_250,PercentReadonlyTargetValue_250, "PercentReadonlyTargetValue_250");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_133(WebDriver driver,String PercentReadonlyTargetValue_133) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_133,PercentReadonlyTargetValue_133, "PercentReadonlyTargetValue_133");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_187(WebDriver driver,String PercentTargetValue_187) {
		            BrowserActions.type(driver, inpPercentTargetValue_187,PercentTargetValue_187, "PercentTargetValue_187");
			        return this;
           }
public MetricsThresholdsPage clickTowing(WebDriver driver)  {
					BrowserActions.click(driver, btnTowing,"Towing");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_10(WebDriver driver,String IntegerRedValue_10) {
		            BrowserActions.type(driver, inpIntegerRedValue_10,IntegerRedValue_10, "IntegerRedValue_10");
			        return this;
           }
public MetricsThresholdsPage enterTier_196(WebDriver driver,String Tier_196) {
		            BrowserActions.type(driver, inpTier_196,Tier_196, "Tier_196");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_66(WebDriver driver,String PercentReadonlyTargetValue_66) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_66,PercentReadonlyTargetValue_66, "PercentReadonlyTargetValue_66");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_268(WebDriver driver,String PercentReadonlyTargetValue_268) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_268,PercentReadonlyTargetValue_268, "PercentReadonlyTargetValue_268");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_21(WebDriver driver,String DecimalYellowValue_21) {
		            BrowserActions.type(driver, inpDecimalYellowValue_21,DecimalYellowValue_21, "DecimalYellowValue_21");
			        return this;
           }
public MetricsThresholdsPage enterUnitsHeader(WebDriver driver,String UnitsHeader) {
		            BrowserActions.type(driver, inpUnitsHeader,UnitsHeader, "UnitsHeader");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity,"LowSeverity");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_24(WebDriver driver,String IntegerRedValue_24) {
		            BrowserActions.type(driver, inpIntegerRedValue_24,IntegerRedValue_24, "IntegerRedValue_24");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_167(WebDriver driver,String IntegerTargetValue_167) {
		            BrowserActions.type(driver, inpIntegerTargetValue_167,IntegerTargetValue_167, "IntegerTargetValue_167");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_194(WebDriver driver,String PercentReadonlyRedValue_194) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_194,PercentReadonlyRedValue_194, "PercentReadonlyRedValue_194");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_145(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_145,"LowSeverity_145");
				    return this;
			}
public MetricsThresholdsPage click3rdPartyMedicalLowComplexity_433(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalLowComplexity_433,"3rdPartyMedicalLowComplexity_433");
				    return this;
			}
public MetricsThresholdsPage clickRental(WebDriver driver)  {
					BrowserActions.click(driver, btnRental,"Rental");
				    return this;
			}
public MetricsThresholdsPage clickLowSeverity_262(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_262,"LowSeverity_262");
				    return this;
			}
public MetricsThresholdsPage enterDecimalYellowValue_307(WebDriver driver,String DecimalYellowValue_307) {
		            BrowserActions.type(driver, inpDecimalYellowValue_307,DecimalYellowValue_307, "DecimalYellowValue_307");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalLowComplexity_456(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalLowComplexity_456,"1stPartyMedicalLowComplexity_456");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue(WebDriver driver,String PercentReadonlyYellowValue) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue,PercentReadonlyYellowValue, "PercentReadonlyYellowValue");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_8(WebDriver driver,String PercentReadonlyYellowValue_8) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_8,PercentReadonlyYellowValue_8, "PercentReadonlyYellowValue_8");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue(WebDriver driver,String PercentYellowValue) {
		            BrowserActions.type(driver, inpPercentYellowValue,PercentYellowValue, "PercentYellowValue");
			        return this;
           }
public MetricsThresholdsPage clickTowing_355(WebDriver driver)  {
					BrowserActions.click(driver, btnTowing_355,"Towing_355");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyTargetValue_83(WebDriver driver,String PercentReadonlyTargetValue_83) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_83,PercentReadonlyTargetValue_83, "PercentReadonlyTargetValue_83");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_78(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_78,"LowSeverity_78");
				    return this;
			}
public MetricsThresholdsPage enterLabel_278(WebDriver driver,String Label_278) {
		            BrowserActions.type(driver, inpLabel_278,Label_278, "Label_278");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue(WebDriver driver,String IntegerRedValue) {
		            BrowserActions.type(driver, inpIntegerRedValue,IntegerRedValue, "IntegerRedValue");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalHighComplexity_436(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalHighComplexity_436,"3rdPartyMedicalHighComplexity_436");
				    return this;
			}
public MetricsThresholdsPage enterTier_93(WebDriver driver,String Tier_93) {
		            BrowserActions.type(driver, inpTier_93,Tier_93, "Tier_93");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_88(WebDriver driver,String PercentYellowValue_88) {
		            BrowserActions.type(driver, inpPercentYellowValue_88,PercentYellowValue_88, "PercentYellowValue_88");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalLowComplexity_458(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalLowComplexity_458,"3rdPartyMedicalLowComplexity_458");
				    return this;
			}
public MetricsThresholdsPage clickLowSeverity_127(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_127,"LowSeverity_127");
				    return this;
			}
public MetricsThresholdsPage clickLowSeverity_244(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_244,"LowSeverity_244");
				    return this;
			}
public MetricsThresholdsPage enterLabel_161(WebDriver driver,String Label_161) {
		            BrowserActions.type(driver, inpLabel_161,Label_161, "Label_161");
			        return this;
           }
public MetricsThresholdsPage clickTowing_480(WebDriver driver)  {
					BrowserActions.click(driver, btnTowing_480,"Towing_480");
				    return this;
			}
public MetricsThresholdsPage enterPolicySystemNotification(WebDriver driver,String PolicySystemNotification) {
		            BrowserActions.type(driver, inpPolicySystemNotification,PolicySystemNotification, "PolicySystemNotification");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_97(WebDriver driver,String PercentReadonlyTargetValue_97) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_97,PercentReadonlyTargetValue_97, "PercentReadonlyTargetValue_97");
			        return this;
           }
public MetricsThresholdsPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,0.5,"Edit");
				    return this;
			}
public MetricsThresholdsPage clickYellowValueHeader(WebDriver driver)  {
					BrowserActions.click(driver, rdbYellowValueHeader,"YellowValueHeader");
				    return this;
			}
public MetricsThresholdsPage clickTowing_455(WebDriver driver)  {
					BrowserActions.click(driver, btnTowing_455,"Towing_455");
				    return this;
			}
public MetricsThresholdsPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public MetricsThresholdsPage enterUnit_1(WebDriver driver,String Unit_1) {
		            BrowserActions.type(driver, inpUnit_1,Unit_1, "Unit_1");
			        return this;
           }
public MetricsThresholdsPage enterLabel_296(WebDriver driver,String Label_296) {
		            BrowserActions.type(driver, inpLabel_296,Label_296, "Label_296");
			        return this;
           }
public MetricsThresholdsPage click1stPartyMedicalLowComplexity_381(WebDriver driver)  {
					BrowserActions.click(driver, btn1stPartyMedicalLowComplexity_381,"1stPartyMedicalLowComplexity_381");
				    return this;
			}
public MetricsThresholdsPage enterLabel_45(WebDriver driver,String Label_45) {
		            BrowserActions.type(driver, inpLabel_45,Label_45, "Label_45");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue_186(WebDriver driver,String PercentReadonlyTargetValue_186) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue_186,PercentReadonlyTargetValue_186, "PercentReadonlyTargetValue_186");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_109(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_109,"LowSeverity_109");
				    return this;
			}
public MetricsThresholdsPage click3rdPartyMedicalHighComplexity_411(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalHighComplexity_411,"3rdPartyMedicalHighComplexity_411");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_192(WebDriver driver,String IntegerRedValue_192) {
		            BrowserActions.type(driver, inpIntegerRedValue_192,IntegerRedValue_192, "IntegerRedValue_192");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_226(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_226,"LowSeverity_226");
				    return this;
			}
public MetricsThresholdsPage enterLabel_180(WebDriver driver,String Label_180) {
		            BrowserActions.type(driver, inpLabel_180,Label_180, "Label_180");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalLowComplexity_358(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalLowComplexity_358,"3rdPartyMedicalLowComplexity_358");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_2(WebDriver driver,String IntegerTargetValue_2) {
		            BrowserActions.type(driver, inpIntegerTargetValue_2,IntegerTargetValue_2, "IntegerTargetValue_2");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_47(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_47,"LowSeverity_47");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_442(WebDriver driver,String PercentTargetValue_442) {
		            BrowserActions.type(driver, inpPercentTargetValue_442,PercentTargetValue_442, "PercentTargetValue_442");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_27(WebDriver driver,String PercentRedValue_27) {
		            BrowserActions.type(driver, inpPercentRedValue_27,PercentRedValue_27, "PercentRedValue_27");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_482(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_482,"CreateLimitForTier_482");
				    return this;
			}
public MetricsThresholdsPage enterLabel_107(WebDriver driver,String Label_107) {
		            BrowserActions.type(driver, inpLabel_107,Label_107, "Label_107");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_323(WebDriver driver,String PercentTargetValue_323) {
		            BrowserActions.type(driver, inpPercentTargetValue_323,PercentTargetValue_323, "PercentTargetValue_323");
			        return this;
           }
public MetricsThresholdsPage clickRedValueHeader(WebDriver driver)  {
					BrowserActions.click(driver, rdbRedValueHeader,"RedValueHeader");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_201(WebDriver driver,String PercentTargetValue_201) {
		            BrowserActions.type(driver, inpPercentTargetValue_201,PercentTargetValue_201, "PercentTargetValue_201");
			        return this;
           }
public MetricsThresholdsPage enterUnit_183(WebDriver driver,String Unit_183) {
		            BrowserActions.type(driver, inpUnit_183,Unit_183, "Unit_183");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_70(WebDriver driver,String PercentReadonlyYellowValue_70) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_70,PercentReadonlyYellowValue_70, "PercentReadonlyYellowValue_70");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_181(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_181,"LabelMenuIcon_181");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_487(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_487,"CreateLimitForTier_487");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_362(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_362,"CreateLimitForTier_362");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_364(WebDriver driver,String IntegerTargetValue_364) {
		            BrowserActions.type(driver, inpIntegerTargetValue_364,IntegerTargetValue_364, "IntegerTargetValue_364");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_484(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_484,"CreateLimitForTier_484");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_113(WebDriver driver,String IntegerTargetValue_113) {
		            BrowserActions.type(driver, inpIntegerTargetValue_113,IntegerTargetValue_113, "IntegerTargetValue_113");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_297(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_297,"LabelMenuIcon_297");
				    return this;
			}
public MetricsThresholdsPage clickLabelMenuIcon_29(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_29,"LabelMenuIcon_29");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_142(WebDriver driver,String PercentRedValue_142) {
		            BrowserActions.type(driver, inpPercentRedValue_142,PercentRedValue_142, "PercentRedValue_142");
			        return this;
           }
public MetricsThresholdsPage clickLowSeverity_316(WebDriver driver)  {
					BrowserActions.click(driver, btnLowSeverity_316,"LowSeverity_316");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_359(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_359,"CreateLimitForTier_359");
				    return this;
			}
public MetricsThresholdsPage enterLabel_351(WebDriver driver,String Label_351) {
		            BrowserActions.type(driver, inpLabel_351,Label_351, "Label_351");
			        return this;
           }
public MetricsThresholdsPage enterLabel_476(WebDriver driver,String Label_476) {
		            BrowserActions.type(driver, inpLabel_476,Label_476, "Label_476");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_87(WebDriver driver,String PercentReadonlyYellowValue_87) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_87,PercentReadonlyYellowValue_87, "PercentReadonlyYellowValue_87");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_215(WebDriver driver,String PercentTargetValue_215) {
		            BrowserActions.type(driver, inpPercentTargetValue_215,PercentTargetValue_215, "PercentTargetValue_215");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_86(WebDriver driver,String DecimalYellowValue_86) {
		            BrowserActions.type(driver, inpDecimalYellowValue_86,DecimalYellowValue_86, "DecimalYellowValue_86");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_48(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_48,"MediumSeverity_48");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_378(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_378,"CreateLimitForTier_378");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_230(WebDriver driver,String IntegerTargetValue_230) {
		            BrowserActions.type(driver, inpIntegerTargetValue_230,IntegerTargetValue_230, "IntegerTargetValue_230");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue(WebDriver driver,String IntegerTargetValue) {
		            BrowserActions.type(driver, inpIntegerTargetValue,IntegerTargetValue, "IntegerTargetValue");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_464(WebDriver driver,String IntegerTargetValue_464) {
		            BrowserActions.type(driver, inpIntegerTargetValue_464,IntegerTargetValue_464, "IntegerTargetValue_464");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_277(WebDriver driver,String PercentRedValue_277) {
		            BrowserActions.type(driver, inpPercentRedValue_277,PercentRedValue_277, "PercentRedValue_277");
			        return this;
           }
public MetricsThresholdsPage enterUnit_166(WebDriver driver,String Unit_166) {
		            BrowserActions.type(driver, inpUnit_166,Unit_166, "Unit_166");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_168(WebDriver driver,String DecimalTargetValue_168) {
		            BrowserActions.type(driver, inpDecimalTargetValue_168,DecimalTargetValue_168, "DecimalTargetValue_168");
			        return this;
           }
public MetricsThresholdsPage enterLabel_242(WebDriver driver,String Label_242) {
		            BrowserActions.type(driver, inpLabel_242,Label_242, "Label_242");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_285(WebDriver driver,String DecimalTargetValue_285) {
		            BrowserActions.type(driver, inpDecimalTargetValue_285,DecimalTargetValue_285, "DecimalTargetValue_285");
			        return this;
           }
public MetricsThresholdsPage enterLabel_125(WebDriver driver,String Label_125) {
		            BrowserActions.type(driver, inpLabel_125,Label_125, "Label_125");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_382(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_382,"CreateLimitForTier_382");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_342(WebDriver driver,String PercentTargetValue_342) {
		            BrowserActions.type(driver, inpPercentTargetValue_342,PercentTargetValue_342, "PercentTargetValue_342");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_56(WebDriver driver,String PercentReadonlyYellowValue_56) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_56,PercentReadonlyYellowValue_56, "PercentReadonlyYellowValue_56");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_467(WebDriver driver,String PercentTargetValue_467) {
		            BrowserActions.type(driver, inpPercentTargetValue_467,PercentTargetValue_467, "PercentTargetValue_467");
			        return this;
           }
public MetricsThresholdsPage enterLabel_76(WebDriver driver,String Label_76) {
		            BrowserActions.type(driver, inpLabel_76,Label_76, "Label_76");
			        return this;
           }
public MetricsThresholdsPage clickCreateLimitForTier_387(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_387,"CreateLimitForTier_387");
				    return this;
			}
public MetricsThresholdsPage clickCreateLimitForTier_384(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateLimitForTier_384,"CreateLimitForTier_384");
				    return this;
			}
public MetricsThresholdsPage clickMediumSeverity_30(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_30,"MediumSeverity_30");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_212(WebDriver driver,String IntegerTargetValue_212) {
		            BrowserActions.type(driver, inpIntegerTargetValue_212,IntegerTargetValue_212, "IntegerTargetValue_212");
			        return this;
           }
public MetricsThresholdsPage enterExposureUnitsHeader(WebDriver driver,String ExposureUnitsHeader) {
		            BrowserActions.type(driver, inpExposureUnitsHeader,ExposureUnitsHeader, "ExposureUnitsHeader");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_339(WebDriver driver,String IntegerTargetValue_339) {
		            BrowserActions.type(driver, inpIntegerTargetValue_339,IntegerTargetValue_339, "IntegerTargetValue_339");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_199(WebDriver driver,String DecimalTargetValue_199) {
		            BrowserActions.type(driver, inpDecimalTargetValue_199,DecimalTargetValue_199, "DecimalTargetValue_199");
			        return this;
           }
public MetricsThresholdsPage enterLabel_376(WebDriver driver,String Label_376) {
		            BrowserActions.type(driver, inpLabel_376,Label_376, "Label_376");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_160(WebDriver driver,String PercentRedValue_160) {
		            BrowserActions.type(driver, inpPercentRedValue_160,PercentRedValue_160, "PercentRedValue_160");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_233(WebDriver driver,String PercentTargetValue_233) {
		            BrowserActions.type(driver, inpPercentTargetValue_233,PercentTargetValue_233, "PercentTargetValue_233");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_116(WebDriver driver,String PercentTargetValue_116) {
		            BrowserActions.type(driver, inpPercentTargetValue_116,PercentTargetValue_116, "PercentTargetValue_116");
			        return this;
           }
public MetricsThresholdsPage enterUnit_197(WebDriver driver,String Unit_197) {
		            BrowserActions.type(driver, inpUnit_197,Unit_197, "Unit_197");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_299(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_299,"MediumSeverity_299");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_13(WebDriver driver,String PercentRedValue_13) {
		            BrowserActions.type(driver, inpPercentRedValue_13,PercentRedValue_13, "PercentRedValue_13");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_295(WebDriver driver,String PercentRedValue_295) {
		            BrowserActions.type(driver, inpPercentRedValue_295,PercentRedValue_295, "PercentRedValue_295");
			        return this;
           }
public MetricsThresholdsPage enterIntegerYellowValue_6(WebDriver driver,String IntegerYellowValue_6) {
		            BrowserActions.type(driver, inpIntegerYellowValue_6,IntegerYellowValue_6, "IntegerYellowValue_6");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_178(WebDriver driver,String PercentRedValue_178) {
		            BrowserActions.type(driver, inpPercentRedValue_178,PercentRedValue_178, "PercentRedValue_178");
			        return this;
           }
public MetricsThresholdsPage enterLabel_260(WebDriver driver,String Label_260) {
		            BrowserActions.type(driver, inpLabel_260,Label_260, "Label_260");
			        return this;
           }
public MetricsThresholdsPage clickTowing_380(WebDriver driver)  {
					BrowserActions.click(driver, btnTowing_380,"Towing_380");
				    return this;
			}
public MetricsThresholdsPage enterLabel_143(WebDriver driver,String Label_143) {
		            BrowserActions.type(driver, inpLabel_143,Label_143, "Label_143");
			        return this;
           }
public MetricsThresholdsPage clickClaimMetricLimits(WebDriver driver)  {
					BrowserActions.click(driver, btnClaimMetricLimits,"ClaimMetricLimits");
				    return this;
			}
public MetricsThresholdsPage clickMediumSeverity_182(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_182,"MediumSeverity_182");
				    return this;
			}
public MetricsThresholdsPage enterDecimalTargetValue_185(WebDriver driver,String DecimalTargetValue_185) {
		            BrowserActions.type(driver, inpDecimalTargetValue_185,DecimalTargetValue_185, "DecimalTargetValue_185");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_367(WebDriver driver,String PercentTargetValue_367) {
		            BrowserActions.type(driver, inpPercentTargetValue_367,PercentTargetValue_367, "PercentTargetValue_367");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalHighComplexity_386(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalHighComplexity_386,"3rdPartyMedicalHighComplexity_386");
				    return this;
			}
public MetricsThresholdsPage enterLabel_426(WebDriver driver,String Label_426) {
		            BrowserActions.type(driver, inpLabel_426,Label_426, "Label_426");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_61(WebDriver driver,String PercentRedValue_61) {
		            BrowserActions.type(driver, inpPercentRedValue_61,PercentRedValue_61, "PercentRedValue_61");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_37(WebDriver driver,String DecimalYellowValue_37) {
		            BrowserActions.type(driver, inpDecimalYellowValue_37,DecimalYellowValue_37, "DecimalYellowValue_37");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_284(WebDriver driver,String IntegerTargetValue_284) {
		            BrowserActions.type(driver, inpIntegerTargetValue_284,IntegerTargetValue_284, "IntegerTargetValue_284");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_261(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_261,"LabelMenuIcon_261");
				    return this;
			}
public MetricsThresholdsPage enterDecimalTargetValue_490(WebDriver driver,String DecimalTargetValue_490) {
		            BrowserActions.type(driver, inpDecimalTargetValue_490,DecimalTargetValue_490, "DecimalTargetValue_490");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_377(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_377,"LabelMenuIcon_377");
				    return this;
			}
public MetricsThresholdsPage enterIntegerRedValue_72(WebDriver driver,String IntegerRedValue_72) {
		            BrowserActions.type(driver, inpIntegerRedValue_72,IntegerRedValue_72, "IntegerRedValue_72");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_132(WebDriver driver,String DecimalTargetValue_132) {
		            BrowserActions.type(driver, inpDecimalTargetValue_132,DecimalTargetValue_132, "DecimalTargetValue_132");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_134(WebDriver driver,String PercentTargetValue_134) {
		            BrowserActions.type(driver, inpPercentTargetValue_134,PercentTargetValue_134, "PercentTargetValue_134");
			        return this;
           }
public MetricsThresholdsPage enterLabel_314(WebDriver driver,String Label_314) {
		            BrowserActions.type(driver, inpLabel_314,Label_314, "Label_314");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_249(WebDriver driver,String DecimalTargetValue_249) {
		            BrowserActions.type(driver, inpDecimalTargetValue_249,DecimalTargetValue_249, "DecimalTargetValue_249");
			        return this;
           }
public MetricsThresholdsPage enterUnit_130(WebDriver driver,String Unit_130) {
		            BrowserActions.type(driver, inpUnit_130,Unit_130, "Unit_130");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_75(WebDriver driver,String PercentRedValue_75) {
		            BrowserActions.type(driver, inpPercentRedValue_75,PercentRedValue_75, "PercentRedValue_75");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_77(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_77,"LabelMenuIcon_77");
				    return this;
			}
public MetricsThresholdsPage click3rdPartyMedicalHighComplexity(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalHighComplexity,"3rdPartyMedicalHighComplexity");
				    return this;
			}
public MetricsThresholdsPage enterPercentTargetValue_251(WebDriver driver,String PercentTargetValue_251) {
		            BrowserActions.type(driver, inpPercentTargetValue_251,PercentTargetValue_251, "PercentTargetValue_251");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_492(WebDriver driver,String PercentTargetValue_492) {
		            BrowserActions.type(driver, inpPercentTargetValue_492,PercentTargetValue_492, "PercentTargetValue_492");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_266(WebDriver driver,String IntegerTargetValue_266) {
		            BrowserActions.type(driver, inpIntegerTargetValue_266,IntegerTargetValue_266, "IntegerTargetValue_266");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue(WebDriver driver,String PercentReadonlyRedValue) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue,PercentReadonlyRedValue, "PercentReadonlyRedValue");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_204(WebDriver driver,String PercentReadonlyYellowValue_204) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_204,PercentReadonlyYellowValue_204, "PercentReadonlyYellowValue_204");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_89(WebDriver driver,String IntegerRedValue_89) {
		            BrowserActions.type(driver, inpIntegerRedValue_89,IntegerRedValue_89, "IntegerRedValue_89");
			        return this;
           }
public MetricsThresholdsPage enterPercentRedValue_195(WebDriver driver,String PercentRedValue_195) {
		            BrowserActions.type(driver, inpPercentRedValue_195,PercentRedValue_195, "PercentRedValue_195");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_243(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_243,"LabelMenuIcon_243");
				    return this;
			}
public MetricsThresholdsPage enterPercentReadonlyYellowValue_326(WebDriver driver,String PercentReadonlyYellowValue_326) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_326,PercentReadonlyYellowValue_326, "PercentReadonlyYellowValue_326");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_389(WebDriver driver,String IntegerTargetValue_389) {
		            BrowserActions.type(driver, inpIntegerTargetValue_389,IntegerTargetValue_389, "IntegerTargetValue_389");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_149(WebDriver driver,String IntegerTargetValue_149) {
		            BrowserActions.type(driver, inpIntegerTargetValue_149,IntegerTargetValue_149, "IntegerTargetValue_149");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_126(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_126,"LabelMenuIcon_126");
				    return this;
			}
public MetricsThresholdsPage enterUnit_363(WebDriver driver,String Unit_363) {
		            BrowserActions.type(driver, inpUnit_363,Unit_363, "Unit_363");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_365(WebDriver driver,String DecimalTargetValue_365) {
		            BrowserActions.type(driver, inpDecimalTargetValue_365,DecimalTargetValue_365, "DecimalTargetValue_365");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue(WebDriver driver,String DecimalYellowValue) {
		            BrowserActions.type(driver, inpDecimalYellowValue,DecimalYellowValue, "DecimalYellowValue");
			        return this;
           }
public MetricsThresholdsPage enterUnit_247(WebDriver driver,String Unit_247) {
		            BrowserActions.type(driver, inpUnit_247,Unit_247, "Unit_247");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_60(WebDriver driver,String PercentReadonlyRedValue_60) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_60,PercentReadonlyRedValue_60, "PercentReadonlyRedValue_60");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_445(WebDriver driver,String PercentReadonlyYellowValue_445) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_445,PercentReadonlyYellowValue_445, "PercentReadonlyYellowValue_445");
			        return this;
           }
public MetricsThresholdsPage enterUnit_488(WebDriver driver,String Unit_488) {
		            BrowserActions.type(driver, inpUnit_488,Unit_488, "Unit_488");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_7(WebDriver driver,String DecimalYellowValue_7) {
		            BrowserActions.type(driver, inpDecimalYellowValue_7,DecimalYellowValue_7, "DecimalYellowValue_7");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalHighComplexity_486(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalHighComplexity_486,"3rdPartyMedicalHighComplexity_486");
				    return this;
			}
public MetricsThresholdsPage enterUnit_283(WebDriver driver,String Unit_283) {
		            BrowserActions.type(driver, inpUnit_283,Unit_283, "Unit_283");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_269(WebDriver driver,String PercentTargetValue_269) {
		            BrowserActions.type(driver, inpPercentTargetValue_269,PercentTargetValue_269, "PercentTargetValue_269");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalHighComplexity_361(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalHighComplexity_361,"3rdPartyMedicalHighComplexity_361");
				    return this;
			}
public MetricsThresholdsPage enterDecimalYellowValue_55(WebDriver driver,String DecimalYellowValue_55) {
		            BrowserActions.type(driver, inpDecimalYellowValue_55,DecimalYellowValue_55, "DecimalYellowValue_55");
			        return this;
           }
public MetricsThresholdsPage clickMediumSeverity_79(WebDriver driver)  {
					BrowserActions.click(driver, btnMediumSeverity_79,"MediumSeverity_79");
				    return this;
			}
public MetricsThresholdsPage enterPercentRedValue_43(WebDriver driver,String PercentRedValue_43) {
		            BrowserActions.type(driver, inpPercentRedValue_43,PercentRedValue_43, "PercentRedValue_43");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_162(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_162,"LabelMenuIcon_162");
				    return this;
			}
public MetricsThresholdsPage enterDecimalTargetValue_150(WebDriver driver,String DecimalTargetValue_150) {
		            BrowserActions.type(driver, inpDecimalTargetValue_150,DecimalTargetValue_150, "DecimalTargetValue_150");
			        return this;
           }
public MetricsThresholdsPage enterIntegerRedValue_58(WebDriver driver,String IntegerRedValue_58) {
		            BrowserActions.type(driver, inpIntegerRedValue_58,IntegerRedValue_58, "IntegerRedValue_58");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_390(WebDriver driver,String DecimalTargetValue_390) {
		            BrowserActions.type(driver, inpDecimalTargetValue_390,DecimalTargetValue_390, "DecimalTargetValue_390");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_279(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_279,"LabelMenuIcon_279");
				    return this;
			}
public MetricsThresholdsPage clickLabelMenuIcon_46(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_46,"LabelMenuIcon_46");
				    return this;
			}
public MetricsThresholdsPage enterLabel_451(WebDriver driver,String Label_451) {
		            BrowserActions.type(driver, inpLabel_451,Label_451, "Label_451");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_91(WebDriver driver,String PercentReadonlyRedValue_91) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_91,PercentReadonlyRedValue_91, "PercentReadonlyRedValue_91");
			        return this;
           }
public MetricsThresholdsPage enterLabel_333(WebDriver driver,String Label_333) {
		            BrowserActions.type(driver, inpLabel_333,Label_333, "Label_333");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyRedValue_74(WebDriver driver,String PercentReadonlyRedValue_74) {
		            BrowserActions.type(driver, inpPercentReadonlyRedValue_74,PercentReadonlyRedValue_74, "PercentReadonlyRedValue_74");
			        return this;
           }
public MetricsThresholdsPage enterDecimalYellowValue_69(WebDriver driver,String DecimalYellowValue_69) {
		            BrowserActions.type(driver, inpDecimalYellowValue_69,DecimalYellowValue_69, "DecimalYellowValue_69");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_392(WebDriver driver,String PercentTargetValue_392) {
		            BrowserActions.type(driver, inpPercentTargetValue_392,PercentTargetValue_392, "PercentTargetValue_392");
			        return this;
           }
public MetricsThresholdsPage enterPercentYellowValue_23(WebDriver driver,String PercentYellowValue_23) {
		            BrowserActions.type(driver, inpPercentYellowValue_23,PercentYellowValue_23, "PercentYellowValue_23");
			        return this;
           }
public MetricsThresholdsPage enterIntegerTargetValue_131(WebDriver driver,String IntegerTargetValue_131) {
		            BrowserActions.type(driver, inpIntegerTargetValue_131,IntegerTargetValue_131, "IntegerTargetValue_131");
			        return this;
           }
public MetricsThresholdsPage enterPercentTargetValue_152(WebDriver driver,String PercentTargetValue_152) {
		            BrowserActions.type(driver, inpPercentTargetValue_152,PercentTargetValue_152, "PercentTargetValue_152");
			        return this;
           }
public MetricsThresholdsPage click3rdPartyMedicalLowComplexity(WebDriver driver)  {
					BrowserActions.click(driver, btn3rdPartyMedicalLowComplexity,"3rdPartyMedicalLowComplexity");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_489(WebDriver driver,String IntegerTargetValue_489) {
		            BrowserActions.type(driver, inpIntegerTargetValue_489,IntegerTargetValue_489, "IntegerTargetValue_489");
			        return this;
           }
public MetricsThresholdsPage clickLabelMenuIcon_144(WebDriver driver)  {
					BrowserActions.click(driver, btnLabelMenuIcon_144,"LabelMenuIcon_144");
				    return this;
			}
public MetricsThresholdsPage enterIntegerTargetValue_248(WebDriver driver,String IntegerTargetValue_248) {
		            BrowserActions.type(driver, inpIntegerTargetValue_248,IntegerTargetValue_248, "IntegerTargetValue_248");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_308(WebDriver driver,String PercentReadonlyYellowValue_308) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_308,PercentReadonlyYellowValue_308, "PercentReadonlyYellowValue_308");
			        return this;
           }
public MetricsThresholdsPage enterUnit_265(WebDriver driver,String Unit_265) {
		            BrowserActions.type(driver, inpUnit_265,Unit_265, "Unit_265");
			        return this;
           }
public MetricsThresholdsPage enterDecimalTargetValue_267(WebDriver driver,String DecimalTargetValue_267) {
		            BrowserActions.type(driver, inpDecimalTargetValue_267,DecimalTargetValue_267, "DecimalTargetValue_267");
			        return this;
           }
public MetricsThresholdsPage enterUnit_388(WebDriver driver,String Unit_388) {
		            BrowserActions.type(driver, inpUnit_388,Unit_388, "Unit_388");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyTargetValue(WebDriver driver,String PercentReadonlyTargetValue) {
		            BrowserActions.type(driver, inpPercentReadonlyTargetValue,PercentReadonlyTargetValue, "PercentReadonlyTargetValue");
			        return this;
           }
public MetricsThresholdsPage enterUnit_148(WebDriver driver,String Unit_148) {
		            BrowserActions.type(driver, inpUnit_148,Unit_148, "Unit_148");
			        return this;
           }
public MetricsThresholdsPage enterLabel_224(WebDriver driver,String Label_224) {
		            BrowserActions.type(driver, inpLabel_224,Label_224, "Label_224");
			        return this;
           }
public MetricsThresholdsPage enterPercentReadonlyYellowValue_420(WebDriver driver,String PercentReadonlyYellowValue_420) {
		            BrowserActions.type(driver, inpPercentReadonlyYellowValue_420,PercentReadonlyYellowValue_420, "PercentReadonlyYellowValue_420");
			        return this;
           }

public String getNetTotalIncurredValue(WebDriver driver)  {
	String value = BrowserActions.getText(driver, lblNetTotalIncurred,"Net total incurred");
    return value;
}

public String getDaysOpenValue(WebDriver driver)  {
	BrowserActions.waitForNetworkIdleState(driver, 1);
	String value = BrowserActions.getText(driver, lblDaysOpen,"Days open",1);
    return value;
}

public String getDaysSinceLastViewAdjuster(WebDriver driver)  {
	String value = BrowserActions.getText(driver, lblDaysSinceLastViewAdjuster,"Days Since Last View Adjuster");
    return value;
}

public MetricsThresholdsPage enterDaysOpenTargetValue(WebDriver driver,String value) {
    BrowserActions.type(driver, inpDaysOpenIntegerTargetValue,value, "Days Open Integer Target Value");
    return this;
}

public MetricsThresholdsPage enterDaysSinceLastViewAdjuster(WebDriver driver,String value) {
    BrowserActions.type(driver, inpDaysSinceLastViewAdjuster,value, "Days since last view adjuster");
    return this;
}

public MetricsThresholdsPage enterNetTotalIncurred(WebDriver driver,String value) {
    BrowserActions.type(driver, inpNetTotalIncurred,value, "Net Total Incurred");
    return this;
}

public void verifyNetTotalIncurredValueIsUpdated(WebDriver driver,String beforeUpdate)  {
	BrowserActions.waitForNetworkIdleState(driver, 1);
	String afterUpdate = BrowserActions.getText(driver, lblNetTotalIncurred,"Net total incurred");
	if (!afterUpdate.equals(beforeUpdate)) {
		Log.message("Value Updated in Net Total Incurred updated successfully");
	}
	else {
		Log.message("There is no Update in Net Total Incurred");
	}
}

public void verifyDaysOpenValueIsUpdated(WebDriver driver,String beforeUpdate)  {
	String afterUpdate = BrowserActions.getText(driver, lblDaysOpen,"Day open");
	if (!afterUpdate.equals(beforeUpdate)) {
		Log.message("Value Updated in days open field updated Successfully");
	}
	else {
		Log.message("There is no Update in days open field");
	}
}

public void verifyDaysSinceLastViewAdjusterIsUpdated(WebDriver driver,String beforeUpdate)  {
	String afterUpdate = BrowserActions.getText(driver, lblDaysSinceLastViewAdjuster,"Days Since LastView Adjuster");
	if (!afterUpdate.equals(beforeUpdate)) {
		Log.message("Value Updated in days since last view adjuster field updated Successfully");
	}
	else {
		Log.message("There is no Update in days since last view adjuster field");
	}
}

public MetricsThresholdsPage enterDaysOpenExposureMetricDefaultLimit(WebDriver driver,String value) {
    BrowserActions.type(driver, inpDaysOpenExposureMetricDefaultLimit,value, "Days Open Exposure Metric Default Limit");
    return this;
}

public String getPaidLossCostsAsPercentageOfTotalPaid(WebDriver driver)  {
	String percentage = BrowserActions.getText(driver, lblPaidLossCostsPercentageAsOfTotalPaid,"Paid LossCosts As Percentage Of Total Paid");
    return percentage;
}

public MetricsThresholdsPage enterPaidLossCostsAsPercentageOfTotalPaid(WebDriver driver,String percent) {
    BrowserActions.type(driver, inpPaidLossCostsAsPercentageOfTotalPaid,percent, "Paid Loss Costs As Percentage Of Total Paid");
    return this;
}

public void verifyPaidLossCostsAsPercentageOfTotalPaidIsUpdated(WebDriver driver,String beforeUpdate)  {
	BrowserActions.waitForElementToDisplay(driver, lblPaidLossCostsPercentageAsOfTotalPaid);
	String afterUpdate = BrowserActions.getText(driver, lblPaidLossCostsPercentageAsOfTotalPaid,"Paid Loss Costs As Percentage Of Total Paid");
	if (!afterUpdate.equals(beforeUpdate)) {
		Log.message("Value Updated in Paid Loss Costs As Percentage Of Total Paid Successfully");
	}
	else {
		Log.message("There is no Update in Paid Loss Costs As Percentage Of Total Paid field");
	}
}

public void verifyAmountIsPresent(WebDriver driver,String amount)  {
	BrowserActions.waitForElementToDisplay(driver, lblLargeLossIndicator);
	String text = BrowserActions.getText(driver, lblLargeLossIndicator,"Large loss amount");
//	String amountText = text.replace("$", "");
//	double textDouble = Double.parseDouble(amountText);
//	int amountInt=(int)textDouble;
//	String amountString = String.valueOf(amountInt);
	Log.assertThat(!amount.equals(text), "Entered Amount is verified", "Entered Amount is not verified");
}

public String getLargeLossIndicatorAmount(WebDriver driver)  {
	BrowserActions.waitForNetworkIdleState(driver, 1);
	String percentage = BrowserActions.getText(driver, lblLargeLossIndicator,"Large Loss Indicator Amount");
    return percentage;
}

public MetricsThresholdsPage enterLargeLossIndicator(WebDriver driver,String amount) {
    BrowserActions.type(driver, inpLargeLossIndicator,amount, "Large Loss Indicator");
    return this;
}

}
