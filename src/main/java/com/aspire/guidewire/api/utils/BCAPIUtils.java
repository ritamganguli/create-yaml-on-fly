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

public class BCAPIUtils {

	static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
	
	private static final String BASE_URL = configProperty.getProperty("bcUrl");
	private static final String FILE_UPLOAD_URL = configProperty.getProperty("fileUploadUrl");
	
	private static ThreadLocal<String> csrfToken = new ThreadLocal<>();
	private static ThreadLocal<String> cookieSessionID = new ThreadLocal<>();
	private static ThreadLocal<String> unappliedFund = new ThreadLocal<>();
	private static ThreadLocal<String> policyPeriod = new ThreadLocal<>();

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
		System.out.println(requestBody);
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
		String filePath = "./src/main/resources/api.bc.payloads"+ "/" + folderName + "/" + fileName;
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
			}
		}
		return fileContent.toString();
	}

	public static void setUnappliedFund(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		Element selectElement = doc.select("[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-UnappliedFunds']").first();
		
		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements.size() > 1) {
				String value = optionElements.get(1).attr("value");
				unappliedFund.set(value);
			}
		}
	}
	
	public static String getUnappliedFund() {
		return unappliedFund.get();
	}
	
	public static void setPolicyEffectiveDate(Response response) {
		Document doc = Jsoup.parse(response.getBody().asString());
		Element selectElement = doc.select("[name='PolicyGroup-PolicyDetailAcceleratedMenuActions-PolicyGroup_EffectiveDate-PolicyGroup_EffectiveDate_Arg']").first();
		System.out.println(selectElement);
		if (selectElement != null) {
			Elements optionElements = selectElement.select("option");

			if (optionElements != null && optionElements.size() >= 1) {
				String value = optionElements.get(0).attr("value");
				policyPeriod.set(value);
			}
		}
	}
	
	public static String getPolicyPeriod() {
		return policyPeriod.get();
	}
	
	/**
     * Clears the thread-local values associated with the current thread.
     * This method should be called at the end of methods where thread-local values are used
     * to prevent potential memory leaks and unintended retention of data.
     */
	 public static void clearThreadLocalValues() {
	        csrfToken.remove();
	        cookieSessionID.remove();
	        unappliedFund.remove();
	        policyPeriod.remove();
	    }
	
}