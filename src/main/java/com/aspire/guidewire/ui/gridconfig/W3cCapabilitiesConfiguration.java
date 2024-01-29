package com.aspire.guidewire.ui.gridconfig;

/**
 * Base class to W3C defined capabilities that implementation to WebDriver
 * connection must support
 */
public class W3cCapabilitiesConfiguration {
	protected String browserName;
	protected String browserVersion;
	protected String platformName;
	protected String acceptInsecureCerts;
	protected String pageLoadStrategy;
	protected String proxy;
	protected String setWindowRect;
	protected String timeouts;
	protected String strictFileInteractability;
	protected String unhandledPromptBehavior;

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getAcceptInsecureCerts() {
		return acceptInsecureCerts;
	}

	public void setAcceptInsecureCerts(String acceptInsecureCerts) {
		this.acceptInsecureCerts = acceptInsecureCerts;
	}

	public String getPageLoadStrategy() {
		return pageLoadStrategy;
	}

	public void setPageLoadStrategy(String pageLoadStrategy) {
		this.pageLoadStrategy = pageLoadStrategy;
	}

	public String getProxy() {
		return proxy;
	}

	public void setProxy(String proxy) {
		this.proxy = proxy;
	}

	public String getSetWindowRect() {
		return setWindowRect;
	}

	public void setSetWindowRect(String setWindowRect) {
		this.setWindowRect = setWindowRect;
	}

	public String getTimeouts() {
		return timeouts;
	}

	public void setTimeouts(String timeouts) {
		this.timeouts = timeouts;
	}

	public String getStrictFileInteractability() {
		return strictFileInteractability;
	}

	public void setStrictFileInteractability(String strictFileInteractability) {
		this.strictFileInteractability = strictFileInteractability;
	}

	public String getUnhandledPromptBehavior() {
		return unhandledPromptBehavior;
	}

	public void setUnhandledPromptBehavior(String unhandledPromptBehavior) {
		this.unhandledPromptBehavior = unhandledPromptBehavior;
	}
}
