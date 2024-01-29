package com.aspire.guidewire.pageobjectsgenerator;

import java.util.LinkedHashMap;

final class PrimarySecondaryMaps {

	private final LinkedHashMap<String, String> mapSecondaryLnkTxts;
	private final LinkedHashMap<String, String> mapPrimaryLnkTxts;
	
	
	public PrimarySecondaryMaps(LinkedHashMap<String, String> mapPrimaryLnkTxts,
			LinkedHashMap<String, String> mapSecondaryLnkTxts) {
		this.mapPrimaryLnkTxts = mapPrimaryLnkTxts;
		this.mapSecondaryLnkTxts = mapSecondaryLnkTxts;
	}

	public LinkedHashMap<String, String> getPrimaryTagValues() {
		return mapPrimaryLnkTxts;
	}

	public LinkedHashMap<String, String> getSecondaryTagValues() {
		return mapSecondaryLnkTxts;
	}

}
