package com.aspire.guidewire.ui.gridconfig;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;

import java.lang.reflect.*;
import java.util.*;

@Getter
@Setter
public class BrowserStackCapabilitiesConfiguration implements IGridCapabilitiesConfiguration {
	// Selenium Capabilities
	private String acceptSslCerts;

	// BrowserStack-specific capabilities
	private String os;
	private String osVersion;
	private String browserName;
	private String browserVersion;

	// Test configuration capabilities
	private String projectName;
	private String buildName;
	private String sessionName;
	private String local;
	private String localIdentifier;
	private String debug;
	private String consoleLogs;
	private String networkLogs;
	private String appiumLogs;
	private String video;
	private String seleniumLogs;
	private String geoLocation;
	private String timezone;
	private String resolution;
	private String seleniumVersion;
	private String[] maskCommands;

	// Mobile capabilities
	private String deviceName;
	private String realMobile;
	private String appiumVersion;
	private String deviceOrientation;
	private String customNetwork;
	private String networkProfile;

	// Chrome capabilities
	private String driver;

	// IE/Edge capabilities
	private String ie_noFlash;
	private String ie_compatibility;
	private String ie_arch;
	private String ie_driver;
	private String ie_enablePopups;
	private String edge_enablePopups;
	private String sendKeys;

	// Safari capabilities
	private String enablePopups;
	private String allowAllCookies;

	private String idleTimeout;

	private String userName;
	private String accessKey;

	private String seleniumCdp;

	/**
	 * Sets all class variables of {@link BrowserStackCapabilitiesConfiguration} and
	 * its super class based on config.properties If the property is not present,
	 * set it to null.
	 */
	public BrowserStackCapabilitiesConfiguration() {
		List<String> capNotToInclude = Arrays.asList("osVersion", "browserVersion");
		EnvironmentPropertiesReader pr = EnvironmentPropertiesReader.getInstance();
		Object[] fieldObjects = ArrayUtils.addAll(this.getClass().getDeclaredFields(),
				this.getClass().getSuperclass().getDeclaredFields());
		List<Field> fields = Arrays.asList(Arrays.copyOf(fieldObjects, fieldObjects.length, Field[].class));
		fields.forEach(field -> {
			String fieldName = field.getName();
			String value = pr.hasProperty(fieldName) ? pr.getProperty(fieldName) : null;
			try {
				if (!capNotToInclude.contains(fieldName))
					invokeSetter(fieldName, value);
			} catch (Exception e) {
				try {
					Log.exception(e);
				} catch (Exception logException) {
					// TODO Auto-generated catch block
					System.err.println("Exception: " + e.getMessage());	
			}			}
		});
	}

	/**
	 * Return the {@link DesiredCapabilities} for the configuration. This method
	 * should only be called before spawning the session.
	 * 
	 * @return the {@link DesiredCapabilities} for the configuration
	 */
	@Override
	public DesiredCapabilities getDesiredCapabilities() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", browserName);
		caps.setCapability("browserVersion", browserVersion);
		setBrowserStackOptions(caps);
		return caps;
	}

	/**
	 * Sets the browser stack options.
	 *
	 * @param caps the new browser stack options
	 */
	private void setBrowserStackOptions(DesiredCapabilities caps) {
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		List<String> capNotToInclude = Arrays.asList("idleTimeout", "local", "consoleLogs", "networkLogs",
				"browserName", "browserVersion");
		List<Field> fields = new ArrayList<>(Arrays.asList(this.getClass().getDeclaredFields()));
		fields.forEach(field -> {
			try {
				if (field.get(this) != null && !capNotToInclude.contains(field.getName())) {
					browserstackOptions.put(field.getName(), (String) field.get(this));
				}
			} catch (IllegalAccessException e) {
				try {
					Log.exception(e);
				} catch (Exception logException) {
					// TODO Auto-generated catch block
					System.err.println("Exception: " + e.getMessage());	
			}			}
		});
		browserstackOptions.put("idleTimeout", idleTimeout);
		boolean local = System.getProperty("local") != null ? Boolean.valueOf(System.getProperty("local"))
				: this.local != null ? Boolean.valueOf(this.local) : false;
		boolean captureNetworkLogs = System.getProperty("networkLogs") != null
				? Boolean.valueOf(System.getProperty("networkLogs"))
				: this.networkLogs != null ? Boolean.valueOf(this.networkLogs) : false;
		browserstackOptions.put("local", local);
		browserstackOptions.put("networkLogs", captureNetworkLogs);
		setConsoleLogs(consoleLogs);
		browserstackOptions.put("consoleLogs", consoleLogs);
		caps.setCapability("bstack:options", browserstackOptions);
	}

	/**
	 * Invoke the setter method of {@link BrowserStackCapabilitiesConfiguration}
	 * class variables
	 * 
	 * @param fieldName the name of the variable
	 * @param value     the value of the variable to be set to
	 * @throws NoSuchMethodException     thrown when the setter is not found
	 * @throws IllegalAccessException    thrown when the setter does not have the
	 *                                   correct permission
	 * @throws InvocationTargetException thrown when the setter throws an exception
	 */
	private void invokeSetter(String fieldName, String value)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		String setterName = "set" + fieldName.toUpperCase().charAt(0) + fieldName.substring(1);
		Method setter = null;
		try {
			setter = this.getClass().getMethod(setterName, String.class);
		} catch (Exception e) {
			// MaskCommands takes string[] hence it is getting failed. Handling that using
			// String[]
			setter = this.getClass().getMethod(setterName, String[].class);
		}

		setter.invoke(this, value);
	}

	/**
	 * Given a map, key as variable name and value as value, override class
	 * variables. Ignores the pair if key does not match any variable names.
	 * 
	 * @param capsToOverride the Map containing variable, value pairs
	 */
	public void override(Map<String, String> capsToOverride) {
		capsToOverride.forEach((cap, value) -> {
			try {
				invokeSetter(cap, value);
			} catch (IllegalAccessException e) {
				Log.message(String.format("Illegal capability %s found.", cap));
			} catch (InvocationTargetException e) {
				try {
					Log.exception(e);
				} catch (Exception logException) {
					// TODO Auto-generated catch block
					System.err.println("Exception: " + e.getMessage());	
			}			} catch (NoSuchMethodException e) {
				Log.message("Unable to override capability. " + e.getMessage());
			}
		});
	}

	/**
	 * Sets the browser version.
	 *
	 * @param browser_version the new browser version
	 */
	public void setBrowserVersion(String browser_version) {
		if (browser_version.equals("latest")) {
			this.browserVersion = null;
		} else {
			this.browserVersion = browser_version;
		}
	}

	/**
	 * Sets the os.
	 *
	 * @param os the new os
	 */
	public void setOs(String os) {
		if (os != null) {
			if (os.toLowerCase().contains("win") || os.toLowerCase().contains("windows")) {
				this.os = "Windows";
			} else if (os.toLowerCase().contains("mac") || os.toLowerCase().contains("os x")) {
				this.os = "OS X";
			} else if (os.toLowerCase().contains("ios")) {
				this.os = "ios";
			} else if (os.toLowerCase().contains("android")) {
				this.os = "android";
			}
		} else {
			this.os = "Windows";
		}
	}

	/**
	 * Sets the os version.
	 *
	 * @param os_version the new os version
	 */
	public void setOsVersion(String os_version) {
		// User defined axis in jenkins is not allowing space between words. When using
		// High Sierra it
		// actually treats 2 separate builds. So using hyphen(-) in place of space.
		if (os_version.contains("-")) {
			this.osVersion = os_version.replace("-", " ");
		} else {
			this.osVersion = os_version;
		}
	}

	/**
	 * Sets the console logs.
	 *
	 * @param consoleLogs the new console logs
	 */
	public void setConsoleLogs(String consoleLogs) {
		if (consoleLogs != null) {
			String logLevel = consoleLogs.trim().toLowerCase();
			if (logLevel.equals("disable") || logLevel.equals("errors") || logLevel.equals("warnings")
					|| logLevel.equals("info") || logLevel.equals("verbose")) {
				this.consoleLogs = logLevel;
			} else {
				Log.event("Invalid console log value. Setting it to error.");
				this.consoleLogs = "errors";
			}
		} else {
			this.consoleLogs = "errors";
		}
	}

	/**
	 * Sets the resolution.
	 *
	 * @param resolution the new resolution
	 */
	public void setResolution(String resolution) {
		if (resolution != null) {
			if (resolution.equals("largest")) {
				if (this.getOs().equals("Windows")) {
					this.resolution = "2048x1536";
				} else if (this.getOs().equals("OS X")) {
					this.resolution = "1920x1080";
				}
			} else {
				String res = resolution.trim().replace(" ", "");
				if (res.matches("\\d+x\\d+")) {
					this.resolution = resolution;
				}
			}
		}
	}
}
