package com.aspire.guidewire.pc.teststeps.nonlob;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobConstants.CreateAccountOptions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;

public class NonLobFeatures {

	@Getter
	@Setter
	@Builder

	@AllArgsConstructor
	public static class EnterAccountInformation{

		private String companyName;

		private String firstName;

		private String lastName;

	}

	public interface CreateNewAccount{

		public static final CreateNewAccountFromPerson fromPerson = null;
		
		public static final CreateNewAccountFromCompany fromCompany = null;
		
		public static final CreateNewAccountFromCompany fromAddressBook = null;

		public CreateAccountOptions getCreateAccountPreference();

	}

	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class CreateNewAccountFromPerson implements CreateNewAccount {

		private String firstName;

		private String lastName;

		private String addressLine1;

		private String city;

		private String state;

		private String zipCode;

		private String addressType;

		private String organization;

		private String producerCode;

		private boolean addSecondaryInsured;

		private boolean addAdditionalInsured;

		private String insuredType;

		private String schoolName;

		@Override
		public CreateAccountOptions getCreateAccountPreference() {
			return CreateAccountOptions.PERSON;
		}

	}
	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class CreateNewAccountFromCompany implements CreateNewAccount {
		
		private String companyName;
		
		private String addressLine1;
		
		private String city;
		
		private String state;
		
		private String zipCode;
		
		private String addressType;
		
		private String organization;
		
		private String producerCode;
		
		@Override
		public CreateAccountOptions getCreateAccountPreference() {
			return CreateAccountOptions.COMPANY;
		}
		
	}
	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	public static class CreateNewAccountFromAddressBook implements CreateNewAccount {
		
		private String firstName;

		private String lastName;
		
		private String companyName;
		
		private String addressLine1;
		
		private String city;
		
		private String state;
		
		private String zipCode;
		
		private String addressType;
		
		private String organization;
		
		private String producerCode;
		
		private String type;
		
		@Override
		public CreateAccountOptions getCreateAccountPreference() {
			return CreateAccountOptions.FROM_ADDRESS_BOOK;
		}
		
	}

	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PolicyDetails{
		
		private String policyNumber;
	}
	
	@Getter
	@Setter
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class MessageQueue{
		
		private boolean restartMessageQueue;
	}
}



