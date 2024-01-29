package com.aspire.guidewire.api.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PCAPIUtils {

	static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
	
	private static final String BASE_URL = configProperty.getProperty("pcUrl");
	private static final String FILE_UPLOAD_URL = configProperty.getProperty("fileUploadUrl_PC");

	private static ThreadLocal<String> csrfToken = new ThreadLocal<>();
	private static ThreadLocal<String> cookieSessionID = new ThreadLocal<>();
	private static ThreadLocal<String> location = new ThreadLocal<>();

	public static String getBaseURL() {
		return BASE_URL;
	}

	public static String getFileUploadURL() {
		return FILE_UPLOAD_URL;
	}

	public static Response sendGetRequest() {	
		RestAssured.baseURI = getBaseURL();
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		response.then().assertThat().statusCode(200);
		return response;
	}

	public static Response sendPostRequest(String sessionID, String csrfToken, String requestBody) {	
		RestAssured.baseURI = getBaseURL();
		RequestSpecification request = RestAssured.given();
		request.body(requestBody);
		request.headers(getHeaders(sessionID));
		Response response = request.post();
		response.then().assertThat().statusCode(200);
		String responseBody = response.getBody().asPrettyString();
		System.out.println("Response Body: " + responseBody);
		return response;

	}

	public static void setCSRFToken(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		String token = doc.getElementById("csrfToken").attr("value");
		csrfToken.set(token);
	}

	public static String getHTMLAttributeValue(Response response, String id) {
		Document doc = Jsoup.parse(response.getBody().asString());
		return doc.getElementById(id).text();
	}

	public static String getCSRFToken() {
		return csrfToken.get();
	}

	public static void setCookieSessionID(Response response) {
		String jsessionID = response.getCookie("JSESSIONID");
		cookieSessionID.set(jsessionID);
	}

	public static String getCookieSessionID() {
		return cookieSessionID.get();
	}

	public static HashMap<String, String> getHeaders(String sessionID) {
		HashMap<String, String> headers= new HashMap<String, String>();
		headers.put("accept", "text/html");
		headers.put("Content-Type", "application/x-www-form-urlencoded");
		headers.put("Cookie", "JSESSIONID="+sessionID);
		return headers;
	}


	public static String readFormDataFile(String folderName, String fileName) {
		String filePath = "./src/main/resources/api.pc.payloads"+ "/" + folderName + "/" + fileName;
		StringBuilder fileContent = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            fileContent.append(line); // Append each line
	            fileContent.append("&");   // Add '&' after each line
	        }
	        } catch (IOException e) {
	        	try {
					Log.exception(e);
				} catch (Exception logException) {
					// TODO Auto-generated catch block
					System.err.println("Exception: " + e.getMessage());	
			}		}
		return fileContent.toString();
	}

	public enum ProductNames {

		BUSINESS_OWNERS ("Businessowners"),
		COMMERCIAL_AUTO ("Commercial Auto"),
		COMMERCIAL_PACKAGE ("Commercial Package"),
		COMMERCIAL_PROPERTY ("Commercial Property"),
		GENERAL_LIABILITY ("General Liability"),
		HOME_OWNERS ("Homeowners"),
		INLAND_MARINE ("Inland Marine"),
		WORKERS_COMPENSATION ("Workers' Compensation"),
		PERSONAL_AUTO ("Personal Auto"),
		ACCOUNT_CREATION ("Account Creation"),
		NON_LOB ("NonLob");

		private String name;

		ProductNames(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}
	public static void setLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		System.out.println(doc);
		Element selectElement = doc.select("[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-Loc']").first();
		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}
		}
	}
	
	public static String getLocation() {
		return location.get();
	}
	
	/**
	 * @param response
	 * 
	 * LOB: 
	 */
	public static void setExposureLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		Element selectElement = doc.select("[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-Location']").first();

		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}
		}
	}
	public static void setExposuresLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		Element selectElement = doc.select("[name$='ExposureUnitsLV-0-Location']").first();

		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}
		}
	}
	public static void setGaragedLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		System.out.println(doc);
		Element selectElement = doc.select("[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-BAGarageLocationInputSet-BAGarageLocationInput']").first();

		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}
		}
	}

	public static void setBuildingLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		System.out.println(doc);
		Element selectElement = doc.select("[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-IMARItemDV-0-buildingcell']").first();

		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}
		}

	}

	public static void setSignLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		System.out.println(doc);
		Element selectElement = doc.select("[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMSignsPanelSet-TEMP_0_LV-0-imSignLocation']").first();

		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}

		}

	}

	public static void setImSignLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		System.out.println(doc);
		Element selectElement = doc.select("[name$='0-imSignLocation']").first();

		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}
		}

	}

	public static void setAccountRecievableLocation(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		System.out.println(doc);
		Element selectElement = doc.select("[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-IMARPanelSet-IMARItemDV-0-buildingcell']").first();

		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				location.set(value);
			}
		}
	}
	
	
	/**
     * Clears the thread-local values associated with the current thread.
     * This method should be called at the end of methods where thread-local values are used
     * to prevent potential memory leaks and unintended retention of data.
     */
	 public static void clearThreadLocalValues() {
	        csrfToken.remove();
	        cookieSessionID.remove();
	        location.remove();
	    }
	 
	 
}
