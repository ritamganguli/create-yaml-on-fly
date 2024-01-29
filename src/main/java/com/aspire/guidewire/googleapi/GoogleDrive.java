package com.aspire.guidewire.googleapi;

import com.aspire.guidewire.utils.Log;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;


public class GoogleDrive {
	private static final String APPLICATION_NAME = "Google Drive API Java Quickstart";
	private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
	//private static final String CREDENTIALS_FOLDER = "credentials"; // Directory to store user credentials.
	//private static final String CREDENTIALS_FILE_PATH = "./././client_secret.json";
	private static final String CREDENTIALS_FILE_PATH = "/client_secret.json";
	private static final List<String> SCOPES = Arrays.asList(DriveScopes.DRIVE);


	/**
	 * Creates an authorized Credential object.
	 * @param HTTP_TRANSPORT The network HTTP Transport.
	 * @return An authorized Credential object.
	 * @throws IOException If the credentials.json file cannot be found.
	 */
	public static GoogleCredentials getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
		// Load client secrets.
		InputStream in = GoogleDrive.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
		GoogleCredentials googleCredentials = GoogleCredentials.fromStream(in).createScoped(SCOPES);
		return googleCredentials;
	}

	/**
	 * Prints the names and majors of students in a sample spreadsheet:
	 * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
	 */
	public static void downloadFileFromGDrive(String fileNameToDownload) throws Exception {
		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		GoogleCredentials googleCredentials = getCredentials(HTTP_TRANSPORT);

		Drive service = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, new HttpCredentialsAdapter(googleCredentials))
				.setApplicationName(APPLICATION_NAME)
				.build();

		// Print the names and IDs for up to 10 files.
		FileList result = service.files().list()
				.setPageSize(100)
				.setFields("nextPageToken, files(id, name)")
				.execute();
		List<File> files = result.getFiles();
		boolean isFileFound =  false;
		if (files == null || files.isEmpty()) {
			Log.fail("No files found.");
		} else {
			for (File file : files) {
				if(file.getName().toLowerCase().trim().equals(fileNameToDownload.toLowerCase().trim())) {
					Log.event("Title: " + file.getName());
//					Log.event("Description: " + file.getDescription());
//					Log.event("MIME type: " + file.getMimeType());
					exportPdf(googleCredentials, service,file);
					isFileFound = true;
					Log.event("File : "+file.getName()+" downloaded successfully");
					break;
				}
			}
		}
		if(!isFileFound)
			Log.fail("File not found :"+fileNameToDownload);
	}

	/**
	 * @param fileName
	 * Returns the home path for any OS
	 * @return
	 */
	public static String filePath(String fileName) {
		String downloadPath = null;
		String home = System.getProperty("user.home");
		Log.event("Home: "+home);
		downloadPath = home + "/"+fileName+".xlsx";
		Log.event("Downloaded path: "+downloadPath);
		return downloadPath;
	}

	/**
	 * @param credentials
	 * @param service
	 * @param file
	 * @throws IOException
	 * Export Google sheets as .xlsx
	 */
	public static void exportPdf( GoogleCredentials credentials, Drive service, File file) throws IOException{
		
		try(OutputStream outputStream = new FileOutputStream(new java.io.File(filePath(file.getName())))) {
			service.files()
			.export(file.getId(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") //application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
			.executeAndDownloadTo(outputStream);
		} catch (GoogleJsonResponseException e) {
			System.err.println("Unable to export file: " + e.getDetails());
			throw e;
		}
	}
}