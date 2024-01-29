package com.aspire.guidewire.pageobjectsgenerator;

public class GuidewireTableRow {

	String widget;
	String id;
	String renderID;
	String file;
	String label;

	public GuidewireTableRow(String widget, String id, String renderID, String file, String label) {
		this.widget = widget;
		this.id = id;
		this.renderID = renderID;
		this.file = file;
		this.label = label;
	}

	public String getWidget() {
		return widget;
	}

	public void setWidget(String widget) {
		this.widget = widget;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRenderID() {
		return renderID;
	}

	public void setRenderID(String renderID) {
		this.renderID = renderID;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
