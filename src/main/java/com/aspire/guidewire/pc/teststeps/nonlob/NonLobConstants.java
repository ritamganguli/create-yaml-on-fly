package com.aspire.guidewire.pc.teststeps.nonlob;

public class NonLobConstants{

	public enum CreateAccountOptions {

		COMPANY ("Company"),
		PERSON ("Person"),
		FROM_ADDRESS_BOOK ("From Address Book"),
		OTHER_CONTACTS ("Other Contacts");

		private String name;

		CreateAccountOptions(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	}	
}

