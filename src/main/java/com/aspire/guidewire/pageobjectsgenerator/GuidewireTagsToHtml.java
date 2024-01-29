package com.aspire.guidewire.pageobjectsgenerator;

public interface GuidewireTagsToHtml {
	public interface LocatorReplacer {
		public static String RENDER_ID = "${RenderID}";
		public static String LOCATOR_SUFFIX = "${LocatorSuffix}";
	}

	public interface Table {
		public static String ITERATORHEADERCHECKBOX = "${RenderID}";
		public static String HEADERCELLVALUE = "${RenderID}_inner";
		public static String CELL = "div[id^='${RenderID}'][id$='${LocatorSuffix}']";
	}

	public static String TEXTBOX = "input[name='${RenderID}']";
	public static String DROPDOWN = "select[name='${RenderID}']";
	public static String CHECKBOX ="input[name='${RenderID}']";
	public static String RADIOBUITTON ="input[name='${RenderID}']";
	public static String BUTTON ="#${RenderID}>div[role='button']";
	public static String LINK_SEARCH_IMAGE_BREADCRUMB_BUTTON ="#${RenderID}";
	public static String TEXTAREA = "#${RenderID} textarea";
	public static String ALERT_LABEL ="#${RenderID} .gw-AlertBar--label";
	public static String LABEL ="#${RenderID}";
	public static String TAB ="#${RenderID}";
	public static String VIEWMORELINK ="#${RenderID}";
	public static String TITLEBAR ="#${RenderID}";
	public static String MENUITEM ="#${RenderID}>div[role='menuitem']";
	public static String TABEXPAND ="#${RenderID} .gw-icon--expand";
	public static String DATEVALUEICON ="#${RenderID}_dateIcon";
	
	public interface ActionsMenu{
		public static String MENUACTIONS = "div[id=$'${RenderID}']>div[role='button']";
		public static String MENUITEMS = "div[id=$'${RenderID}']>div[role='menuitem']";
	}

}
