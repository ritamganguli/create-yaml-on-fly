package com.aspire.guidewire.cc.pages.common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;


public class ContactsPage extends LoadableComponent<ContactsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public PeopleInvolvedDetailed peopleinvolveddetailedTable;
	//
	//	public EditableClaimContactRoles editableclaimcontactrolesTable;
	//
	//	public Addresses addressesTable;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpHomeRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewStatus']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode_67;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-W9ValidTo_dateIcon", AI = false)
	private WebElement btnW9ValidtoDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_45;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDetailCardTab", AI = false)
	private WebElement btnReview;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_56;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_27;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-CompanyVendorValidTo']", AI = false)
	private WebElement inpClaimInvolvementEnd;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-Name']", AI = false)
	private WebElement inpName_11;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-AddressesLV-0-DisplayName']", AI = false)
	private WebElement inpDisplayName;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-W9received']", AI = false)
	private WebElement rdbW9Received;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-State']", AI = false)
	private WebElement drpState_25;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-Name']", AI = false)
	private WebElement inpName_19;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactEFTLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_39;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-RoleFilter']", AI = false)
	private WebElement drpRoleFilter;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_75;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpFax_37;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-CompanyVendorValidTo_dateIcon", AI = false)
	private WebElement btnClaimInvolvementEndDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-AddressesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_50;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpWorkExtension;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation_52;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-State']", AI = false)
	private WebElement drpState_17;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewLegal-ClaimContacts_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimContacts_CreateNewContactButton']", AI = false)
	private WebElement btnNewContact;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-RoleFilter']", AI = false)
	private WebElement drpRoleFilter_2;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-V_EIN']", AI = false)
	private WebElement inpTaxIDEIN;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_86;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
	private WebElement drpReviewsFilter_90;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_41;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpFaxRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-W9ValidFrom_dateIcon", AI = false)
	private WebElement btnW9ValidfromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-Address']", AI = false)
	private WebElement inpAddress_23;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-0-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_59;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription_64;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpFax;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-W9receivedDate']", AI = false)
	private WebElement inpW9ReceivedDate;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpWorkRegionCode;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_43;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesCardTab", AI = false)
	private WebElement btnAddresses;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "div[id$='GlobalAddressInputSet-State'] select[name$='State']", AI = false)
	private WebElement drpState;//select[name$='State']

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_47;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-Delete>div[role='button']", AI = false)
	private WebElement btnDelete_92;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-Notes textarea", AI = false)
	private WebElement inpNotes;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-Address']", AI = false)
	private WebElement inpAddress_15;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_69;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_60;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate_dateIcon", AI = false)
	private WebElement btnServiceDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-PostalCode']", AI = false)
	private WebElement inpZIPCode_18;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ClaimContactRelatedContactsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_79;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_85;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_58;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-RelatedContactsCardTab", AI = false)
	private WebElement btnRelatedContacts;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewRelatedTo']", AI = false)
	private WebElement drpRelatedTo_94;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-PostalCode']", AI = false)
	private WebElement inpZIPCode_10;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-PeopleInvolvedDetailedFilter']", AI = false)
	private WebElement drpPeopleInvolvedDetailedFilter;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV-0-IsActive']", AI = false)
	private WebElement rdbActive;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_74;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewVendor-ClaimContacts_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim-SelectReviewClaim", AI = false)
	private WebElement btnSearch_93;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsCardTab", AI = false)
	private WebElement btnReviews;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon_66;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-Roles']", AI = false)
	private WebElement inpRoles_12;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_40;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_84;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id*='Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_42;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_72;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Email2']", AI = false)
	private WebElement inpAlternateEmail;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-Address']", AI = false)
	private WebElement inpAddress_7;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_32;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-BasicsCardTab", AI = false)
	private WebElement btnBasics;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType_63;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV-0-Owner']", AI = false)
	private WebElement drpRelatedTo;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_73;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-CompanyVendorValidFrom']", AI = false)
	private WebElement inpClaimInvolvementStart;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_30;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_31;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewScore']", AI = false)
	private WebElement inpReviewScore;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_83;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-PostalCode']", AI = false)
	private WebElement inpZIPCode_26;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Email1']", AI = false)
	private WebElement inpMainEmail;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-Phone_Work']", AI = false)
	private WebElement inpPhone_6;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited_33;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewContact']", AI = false)
	private WebElement inpVendor;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_48;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_61;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewedBy']", AI = false)
	private WebElement inpReviewedBy;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited_5;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusMessage']", AI = false)
	private WebElement inpLinkStatusMessage;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewType']", AI = false)
	private WebElement inpReviewType;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpFaxExtension;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-City']", AI = false)
	private WebElement inpCity_16;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpHome;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-W9receivedDate_dateIcon", AI = false)
	private WebElement btnW9ReceivedDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-CompanyVendorValidFrom_dateIcon", AI = false)
	private WebElement btnClaimInvolvementStartDateIcon;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimContacts_NewLegal']", AI = false)
	private WebElement btnLegal;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_29;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
	private WebElement drpReviewsFilter;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-0-ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpHome_35;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-AddressesLV-0-AddressType']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-City']", AI = false)
	private WebElement inpCity_24;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited_13;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_82;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_Company>div[role='menuitem']", AI = false)
	private WebElement btnCompany;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewVendor-ClaimContacts_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-2-Phone_Work']", AI = false)
	private WebElement inpPhone_14;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_80;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1_54;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactBasicsHeaderInputSet_TransferRolesButton>div[role='button']", AI = false)
	private WebElement btnContactBasicsHeaderInputSet_TransferRolesButton;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_44;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpMobile;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-0-Address']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-Currency']", AI = false)
	private WebElement drpPreferredCurrency;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewComments textarea", AI = false)
	private WebElement inpAdjustersComments;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-Roles']", AI = false)
	private WebElement inpRoles_20;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDocumentsCardTab", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusRelationshipsMessage']", AI = false)
	private WebElement inpLinkStatusRelationshipsMessage;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_71;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-W9ValidTo']", AI = false)
	private WebElement inpW9Validto;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited_21;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_77;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-3-Phone_Work']", AI = false)
	private WebElement inpPhone_22;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpMobileExtension;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-W9ValidFrom']", AI = false)
	private WebElement inpW9Validfrom;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewVendor-ClaimContacts_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewLegal-ClaimContacts_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation_51;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendor;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-TextInput0']", AI = false)
	private WebElement inpServicedBy;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryPhone']", AI = false)
	private WebElement drpPrimaryphone;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate']", AI = false)
	private WebElement inpServiceDate;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewLegal-ClaimContacts_LegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_62;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ClaimContactRelatedContactsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_78;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-Name']", AI = false)
	private WebElement inpName_3;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil_65;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_88;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-0-Roles']", AI = false)
	private WebElement inpRoles;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-Roles']", AI = false)
	private WebElement inpRoles_4;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewNRE>div[role='button']", AI = false)
	private WebElement btnAddNewReview_89;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-0-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-AddressesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_49;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpMobile_36;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_57;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceType']", AI = false)
	private WebElement drpServiceType;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnPerson;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewVendor-ClaimContacts_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "div[id$=SearchAndResetInputSet-SearchLinksInputSet-Search]", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
	private WebElement btnSelect;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_70;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewLegal-ClaimContacts_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewRE>div[role='button']", AI = false)
	private WebElement btnAddNewReview;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_53;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-PrimaryContactMenuIcon>div[role='button']", AI = false)
	private WebElement btnPrimaryContactMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpHomeExtension;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_46;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-VendorW9InfoInputSet-TaxStatus']", AI = false)
	private WebElement drpTaxStatus;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-0-Phone_Work']", AI = false)
	private WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV-0-Comments']", AI = false)
	private WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_81;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-ReviewCompleteSelectedNRE>div[role='button']", AI = false)
	private WebElement btnCompleteSelected;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpMobileRegionCode;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-AddressDetailCardTab", AI = false)
	private WebElement btnAddressDetail;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpWork_34;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-State']", AI = false)
	private WebElement drpState_9;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_76;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact']", AI = false)
	private WebElement drpPrimaryContact;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-ToolbarButton>div[role='button']", AI = false)
	private WebElement btnEdit_91;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV_tb-ClaimContacts_CreateNewContactButton-ClaimContacts_NewVendor-ClaimContacts_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-PeopleInvolvedDetailedFilter']", AI = false)
	private WebElement drpPeopleInvolvedDetailedFilter_1;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-OrganizationName-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpName_28;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_55;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpWork;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_68;

	@IFindBy(how = How.CSS, using = "input[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-PeopleInvolvedDetailedLV-1-City']", AI = false)
	private WebElement inpCity_8;

	@IFindBy(how = How.CSS, using = "select[name='ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV-0-Role']", AI = false)
	private WebElement drpRole;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ContactBasicsDV-ContactEFTLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_38;

	@IFindBy(how = How.CSS, using = "#ClaimContacts-ClaimContactsScreen-PeopleInvolvedDetailedListDetail-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_87;

	@IFindBy(how = How.CSS, using = "div[id$='AddExistingButton']", AI = false)
	private WebElement btnAddExistingContact;

	public ContactsPage(){
	}

	public ContactsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		peopleinvolveddetailedTable = new PeopleInvolvedDetailed();
		//		editableclaimcontactrolesTable = new EditableClaimContactRoles();
		//		addressesTable = new Addresses();
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ContactsPage selectHomeRegionCode(WebDriver driver,String HomeRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHomeRegionCode,HomeRegionCode,"HomeRegionCode");
		return this;
	}
	public ContactsPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public ContactsPage enterLocationCode_67(WebDriver driver,String LocationCode_67) {
		BrowserActions.type(driver, inpLocationCode_67,LocationCode_67, "LocationCode_67");
		return this;
	}
	public ContactsPage clickW9ValidtoDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ValidtoDateIcon,"W9ValidtoDateIcon");
		return this;
	}
	public ContactsPage clickUnlink_45(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_45,"Unlink_45");
		return this;
	}
	public ContactsPage clickReview(WebDriver driver)  {
		BrowserActions.click(driver, btnReview,"Review");
		return this;
	}
	public ContactsPage enterAddress3_56(WebDriver driver,String Address3_56) {
		BrowserActions.type(driver, inpAddress3_56,Address3_56, "Address3_56");
		return this;
	}
	public ContactsPage clickUpdate_27(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_27,"Update_27");
		return this;
	}
	public ContactsPage enterClaimInvolvementEnd(WebDriver driver,String ClaimInvolvementEnd) {
		BrowserActions.type(driver, inpClaimInvolvementEnd,ClaimInvolvementEnd, "ClaimInvolvementEnd");
		return this;
	}
	public ContactsPage clickViewContactDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
		return this;
	}
	public ContactsPage enterName_11(WebDriver driver,String Name_11) {
		BrowserActions.type(driver, inpName_11,Name_11, "Name_11");
		return this;
	}
	public ContactsPage enterDisplayName(WebDriver driver,String DisplayName) {
		BrowserActions.type(driver, inpDisplayName,DisplayName, "DisplayName");
		return this;
	}
	public ContactsPage clickW9Received(WebDriver driver)  {
		BrowserActions.click(driver, rdbW9Received,"W9Received");
		return this;
	}
	public ContactsPage selectState_25(WebDriver driver,String State_25)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_25,State_25,"State_25");
		return this;
	}
	public ContactsPage enterName_19(WebDriver driver,String Name_19) {
		BrowserActions.type(driver, inpName_19,Name_19, "Name_19");
		return this;
	}
	public ContactsPage clickRemove_39(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_39,"Remove_39");
		return this;
	}
	public ContactsPage selectRoleFilter(WebDriver driver,String RoleFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRoleFilter,RoleFilter,"RoleFilter");
		return this;
	}
	public ContactsPage clickCopyfromAddressBook_75(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_75,"CopyfromAddressBook_75");
		return this;
	}
	public ContactsPage enterFax_37(WebDriver driver,String Fax_37) {
		BrowserActions.type(driver, inpFax_37,Fax_37, "Fax_37");
		return this;
	}
	public ContactsPage clickClaimInvolvementEndDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimInvolvementEndDateIcon,"ClaimInvolvementEndDateIcon");
		return this;
	}
	public ContactsPage clickRemove_50(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_50,"Remove_50");
		return this;
	}
	public ContactsPage enterWorkExtension(WebDriver driver,String WorkExtension) {
		BrowserActions.type(driver, inpWorkExtension,WorkExtension, "WorkExtension");
		return this;
	}
	public ContactsPage enterLocation_52(WebDriver driver,String Location_52) {
		BrowserActions.type(driver, inpLocation_52,Location_52, "Location_52");
		return this;
	}
	public ContactsPage selectState_17(WebDriver driver,String State_17)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_17,State_17,"State_17");
		return this;
	}
	public ContactsPage clickLink(WebDriver driver)  {
		BrowserActions.click(driver, btnLink,"Link");
		return this;
	}
	public ContactsPage clickAdjudicator(WebDriver driver)  {
		BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
		return this;
	}
	public ContactsPage clickNewContact(WebDriver driver)  {
		BrowserActions.click(driver, btnNewContact,1.5,"NewContact");
		return this;
	}
	public ContactsPage selectRoleFilter_2(WebDriver driver,String RoleFilter_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRoleFilter_2,RoleFilter_2,"RoleFilter_2");
		return this;
	}
	public ContactsPage enterTaxIDEIN(WebDriver driver,String TaxIDEIN) {
		BrowserActions.type(driver, inpTaxIDEIN,TaxIDEIN, "TaxIDEIN");
		return this;
	}
	public ContactsPage clickCopyfromAddressBook_86(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_86,"CopyfromAddressBook_86");
		return this;
	}
	public ContactsPage selectReviewsFilter_90(WebDriver driver,String ReviewsFilter_90)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter_90,ReviewsFilter_90,"ReviewsFilter_90");
		return this;
	}
	public ContactsPage clickEdit_41(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_41,"Edit_41");
		return this;
	}
	public ContactsPage selectFaxRegionCode(WebDriver driver,String FaxRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFaxRegionCode,FaxRegionCode,"FaxRegionCode");
		return this;
	}
	public ContactsPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public ContactsPage clickW9ValidfromDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ValidfromDateIcon,"W9ValidfromDateIcon");
		return this;
	}
	public ContactsPage selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public ContactsPage clickCheckforDuplicates(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
		return this;
	}
	public ContactsPage enterAddress_23(WebDriver driver,String Address_23) {
		BrowserActions.type(driver, inpAddress_23,Address_23, "Address_23");
		return this;
	}
	public ContactsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public ContactsPage enterCounty_59(WebDriver driver,String County_59) {
		BrowserActions.type(driver, inpCounty_59,County_59, "County_59");
		return this;
	}
	public ContactsPage enterLocationDescription_64(WebDriver driver,String LocationDescription_64) {
		BrowserActions.type(driver, inpLocationDescription_64,LocationDescription_64, "LocationDescription_64");
		return this;
	}
	public ContactsPage enterClaim(WebDriver driver,String Claim) {
		BrowserActions.type(driver, inpClaim,Claim, "Claim");
		return this;
	}
	public ContactsPage enterValiduntil(WebDriver driver,String Validuntil) {
		BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
		return this;
	}
	public ContactsPage enterFax(WebDriver driver,String Fax) {
		BrowserActions.type(driver, inpFax,Fax, "Fax");
		return this;
	}
	public ContactsPage enterW9ReceivedDate(WebDriver driver,String W9ReceivedDate) {
		BrowserActions.type(driver, inpW9ReceivedDate,W9ReceivedDate, "W9ReceivedDate");
		return this;
	}
	public ContactsPage selectWorkRegionCode(WebDriver driver,String WorkRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWorkRegionCode,WorkRegionCode,"WorkRegionCode");
		return this;
	}
	public ContactsPage clickCancel_43(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_43,"Cancel_43");
		return this;
	}
	public ContactsPage clickAddresses(WebDriver driver)  {
		BrowserActions.click(driver, btnAddresses,"Addresses");
		return this;
	}
	public ContactsPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public ContactsPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public ContactsPage clickViewinAddressBook_47(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_47,"ViewinAddressBook_47");
		return this;
	}
	public ContactsPage clickDelete_92(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete_92,"Delete_92");
		return this;
	}
	public ContactsPage enterNotes(WebDriver driver,String Notes) {
		BrowserActions.type(driver, inpNotes,Notes, "Notes");
		return this;
	}
	public ContactsPage enterAddress_15(WebDriver driver,String Address_15) {
		BrowserActions.type(driver, inpAddress_15,Address_15, "Address_15");
		return this;
	}
	public ContactsPage clickUpdate_69(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_69,"Update_69");
		return this;
	}
	public ContactsPage selectState_60(WebDriver driver,String State_60)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_60,State_60,"State_60");
		return this;
	}
	public ContactsPage clickServiceDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnServiceDateDateIcon,"ServiceDateDateIcon");
		return this;
	}
	public ContactsPage enterZIPCode_18(WebDriver driver,String ZIPCode_18) {
		BrowserActions.type(driver, inpZIPCode_18,ZIPCode_18, "ZIPCode_18");
		return this;
	}
	public ContactsPage clickRemove_79(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_79,"Remove_79");
		return this;
	}
	public ContactsPage clickUnlink_85(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_85,"Unlink_85");
		return this;
	}
	public ContactsPage clickAutoFillIcon_58(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_58,"AutoFillIcon_58");
		return this;
	}
	public ContactsPage clickRelatedContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnRelatedContacts,"RelatedContacts");
		return this;
	}
	public ContactsPage selectRelatedTo_94(WebDriver driver,String RelatedTo_94)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo_94,RelatedTo_94,"RelatedTo_94");
		return this;
	}
	public ContactsPage enterZIPCode_10(WebDriver driver,String ZIPCode_10) {
		BrowserActions.type(driver, inpZIPCode_10,ZIPCode_10, "ZIPCode_10");
		return this;
	}
	public ContactsPage selectPeopleInvolvedDetailedFilter(WebDriver driver,String PeopleInvolvedDetailedFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPeopleInvolvedDetailedFilter,PeopleInvolvedDetailedFilter,"PeopleInvolvedDetailedFilter");
		return this;
	}
	public ContactsPage clickActive(WebDriver driver)  {
		BrowserActions.click(driver, rdbActive,"Active");
		return this;
	}
	public ContactsPage clickUnlink_74(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_74,"Unlink_74");
		return this;
	}
	public ContactsPage clickAutoTowingAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
		return this;
	}
	public ContactsPage clickSearch_93(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_93,"Search_93");
		return this;
	}
	public ContactsPage clickReviews(WebDriver driver)  {
		BrowserActions.click(driver, btnReviews,"Reviews");
		return this;
	}
	public ContactsPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public ContactsPage clickValiduntilDateIcon_66(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon_66,"ValiduntilDateIcon_66");
		return this;
	}
	public ContactsPage enterRoles_12(WebDriver driver,String Roles_12) {
		BrowserActions.type(driver, inpRoles_12,Roles_12, "Roles_12");
		return this;
	}
	public ContactsPage clickUpdate_40(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_40,"Update_40");
		return this;
	}
	public ContactsPage clickLink_84(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_84,"Link_84");
		return this;
	}
	public ContactsPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public ContactsPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public ContactsPage clickUpdate_42(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_42,"Update_42");
		return this;
	}
	public ContactsPage clickCancel_72(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_72,"Cancel_72");
		return this;
	}
	public ContactsPage enterAlternateEmail(WebDriver driver,String AlternateEmail) {
		BrowserActions.type(driver, inpAlternateEmail,AlternateEmail, "AlternateEmail");
		return this;
	}
	public ContactsPage enterAddress_7(WebDriver driver,String Address_7) {
		BrowserActions.type(driver, inpAddress_7,Address_7, "Address_7");
		return this;
	}
	public ContactsPage clickAutoFillIcon_32(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_32,"AutoFillIcon_32");
		return this;
	}
	public ContactsPage clickBasics(WebDriver driver)  {
		BrowserActions.click(driver, btnBasics,"Basics");
		return this;
	}
	public ContactsPage selectAddressType_63(WebDriver driver,String AddressType_63)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_63,AddressType_63,"AddressType_63");
		return this;
	}
	public ContactsPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public ContactsPage selectRelatedTo(WebDriver driver,String RelatedTo)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo,RelatedTo,"RelatedTo");
		return this;
	}
	public ContactsPage clickLink_73(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_73,"Link_73");
		return this;
	}
	public ContactsPage enterClaimInvolvementStart(WebDriver driver,String ClaimInvolvementStart) {
		BrowserActions.type(driver, inpClaimInvolvementStart,ClaimInvolvementStart, "ClaimInvolvementStart");
		return this;
	}
	public ContactsPage selectState_30(WebDriver driver,String State_30)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_30,State_30,"State_30");
		return this;
	}
	public ContactsPage enterZIPCode_31(WebDriver driver,String ZIPCode_31) {
		BrowserActions.type(driver, inpZIPCode_31,ZIPCode_31, "ZIPCode_31");
		return this;
	}
	public ContactsPage enterReviewScore(WebDriver driver,String ReviewScore) {
		BrowserActions.type(driver, inpReviewScore,ReviewScore, "ReviewScore");
		return this;
	}
	public ContactsPage clickValiduntilDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
		return this;
	}
	public ContactsPage clickCancel_83(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_83,"Cancel_83");
		return this;
	}
	public ContactsPage enterZIPCode_26(WebDriver driver,String ZIPCode_26) {
		BrowserActions.type(driver, inpZIPCode_26,ZIPCode_26, "ZIPCode_26");
		return this;
	}
	public ContactsPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public ContactsPage clickCopyfromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook,"CopyfromAddressBook");
		return this;
	}
	public ContactsPage enterMainEmail(WebDriver driver,String MainEmail) {
		BrowserActions.type(driver, inpMainEmail,MainEmail, "MainEmail");
		return this;
	}
	public ContactsPage enterPhone_6(WebDriver driver,String Phone_6) {
		BrowserActions.type(driver, inpPhone_6,Phone_6, "Phone_6");
		return this;
	}
	public ContactsPage clickContactProhibited_33(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited_33,"ContactProhibited_33");
		return this;
	}
	public ContactsPage enterVendor(WebDriver driver,String Vendor) {
		BrowserActions.type(driver, inpVendor,Vendor, "Vendor");
		return this;
	}
	public ContactsPage clickCheckforDuplicates_48(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_48,"CheckforDuplicates_48");
		return this;
	}
	public ContactsPage enterZIPCode_61(WebDriver driver,String ZIPCode_61) {
		BrowserActions.type(driver, inpZIPCode_61,ZIPCode_61, "ZIPCode_61");
		return this;
	}
	public ContactsPage enterReviewedBy(WebDriver driver,String ReviewedBy) {
		BrowserActions.type(driver, inpReviewedBy,ReviewedBy, "ReviewedBy");
		return this;
	}
	public ContactsPage clickContactProhibited_5(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited_5,"ContactProhibited_5");
		return this;
	}
	public ContactsPage enterLinkStatusMessage(WebDriver driver,String LinkStatusMessage) {
		BrowserActions.type(driver, inpLinkStatusMessage,LinkStatusMessage, "LinkStatusMessage");
		return this;
	}
	public ContactsPage enterReviewType(WebDriver driver,String ReviewType) {
		BrowserActions.type(driver, inpReviewType,ReviewType, "ReviewType");
		return this;
	}
	public ContactsPage enterFaxExtension(WebDriver driver,String FaxExtension) {
		BrowserActions.type(driver, inpFaxExtension,FaxExtension, "FaxExtension");
		return this;
	}
	public ContactsPage enterCity_16(WebDriver driver,String City_16) {
		BrowserActions.type(driver, inpCity_16,City_16, "City_16");
		return this;
	}
	public ContactsPage enterHome(WebDriver driver,String Home) {
		BrowserActions.type(driver, inpHome,Home, "Home");
		return this;
	}
	public ContactsPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public ContactsPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public ContactsPage clickW9ReceivedDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ReceivedDateDateIcon,"W9ReceivedDateDateIcon");
		return this;
	}
	public ContactsPage clickClaimInvolvementStartDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimInvolvementStartDateIcon,"ClaimInvolvementStartDateIcon");
		return this;
	}
	public ContactsPage clickLegal(WebDriver driver)  {
		BrowserActions.moveToElement(driver, btnLegal,"Legal");
		return this;
	}
	public ContactsPage enterCity_29(WebDriver driver,String City_29) {
		BrowserActions.type(driver, inpCity_29,City_29, "City_29");
		return this;
	}
	public ContactsPage enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
		return this;
	}
	public ContactsPage selectReviewsFilter(WebDriver driver,String ReviewsFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter,ReviewsFilter,"ReviewsFilter");
		return this;
	}
	public ContactsPage clickContactProhibited(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited,"ContactProhibited");
		return this;
	}
	public ContactsPage enterHome_35(WebDriver driver,String Home_35) {
		BrowserActions.type(driver, inpHome_35,Home_35, "Home_35");
		return this;
	}
	public ContactsPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public ContactsPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public ContactsPage enterCity_24(WebDriver driver,String City_24) {
		BrowserActions.type(driver, inpCity_24,City_24, "City_24");
		return this;
	}
	public ContactsPage clickContactProhibited_13(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited_13,"ContactProhibited_13");
		return this;
	}
	public ContactsPage clickUpdate_82(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_82,"Update_82");
		return this;
	}
	public ContactsPage clickCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnCompany,"Company");
		return this;
	}
	public ContactsPage clickAutobodyRepairShop(WebDriver driver)  {
		BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
		return this;
	}
	public ContactsPage enterPhone_14(WebDriver driver,String Phone_14) {
		BrowserActions.type(driver, inpPhone_14,Phone_14, "Phone_14");
		return this;
	}
	public ContactsPage clickUpdate_80(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_80,"Update_80");
		return this;
	}
	public ContactsPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public ContactsPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
		return this;
	}
	public ContactsPage enterAddress1_54(WebDriver driver,String Address1_54) {
		BrowserActions.type(driver, inpAddress1_54,Address1_54, "Address1_54");
		return this;
	}
	public ContactsPage clickContactBasicsHeaderInputSet_TransferRolesButton(WebDriver driver)  {
		BrowserActions.click(driver, btnContactBasicsHeaderInputSet_TransferRolesButton,"ContactBasicsHeaderInputSet_TransferRolesButton");
		return this;
	}
	public ContactsPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public ContactsPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public ContactsPage clickLink_44(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_44,"Link_44");
		return this;
	}
	public ContactsPage enterMobile(WebDriver driver,String Mobile) {
		BrowserActions.type(driver, inpMobile,Mobile, "Mobile");
		return this;
	}
	public ContactsPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public ContactsPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
		return this;
	}
	public ContactsPage enterAdjustersComments(WebDriver driver,String AdjustersComments) {
		BrowserActions.type(driver, inpAdjustersComments,AdjustersComments, "AdjustersComments");
		return this;
	}
	public ContactsPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public ContactsPage enterRoles_20(WebDriver driver,String Roles_20) {
		BrowserActions.type(driver, inpRoles_20,Roles_20, "Roles_20");
		return this;
	}
	public ContactsPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public ContactsPage enterLinkStatusRelationshipsMessage(WebDriver driver,String LinkStatusRelationshipsMessage) {
		BrowserActions.type(driver, inpLinkStatusRelationshipsMessage,LinkStatusRelationshipsMessage, "LinkStatusRelationshipsMessage");
		return this;
	}
	public ContactsPage clickUpdate_71(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_71,"Update_71");
		return this;
	}
	public ContactsPage enterW9Validto(WebDriver driver,String W9Validto) {
		BrowserActions.type(driver, inpW9Validto,W9Validto, "W9Validto");
		return this;
	}
	public ContactsPage clickContactProhibited_21(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited_21,"ContactProhibited_21");
		return this;
	}
	public ContactsPage clickCheckforDuplicates_77(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_77,"CheckforDuplicates_77");
		return this;
	}
	public ContactsPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public ContactsPage enterPhone_22(WebDriver driver,String Phone_22) {
		BrowserActions.type(driver, inpPhone_22,Phone_22, "Phone_22");
		return this;
	}
	public ContactsPage enterMobileExtension(WebDriver driver,String MobileExtension) {
		BrowserActions.type(driver, inpMobileExtension,MobileExtension, "MobileExtension");
		return this;
	}
	public ContactsPage enterW9Validfrom(WebDriver driver,String W9Validfrom) {
		BrowserActions.type(driver, inpW9Validfrom,W9Validfrom, "W9Validfrom");
		return this;
	}
	public ContactsPage clickVendorCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
		return this;
	}
	public ContactsPage clickLawFirm(WebDriver driver)  {
		BrowserActions.click(driver, btnLawFirm,"LawFirm");
		return this;
	}
	public ContactsPage selectLocation_51(WebDriver driver,String Location_51)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation_51,Location_51,"Location_51");
		return this;
	}
	public ContactsPage clickVendor(WebDriver driver)  {
		BrowserActions.moveToElement(driver, btnVendor,1,"Vendor");
		return this;
	}
	public ContactsPage enterServicedBy(WebDriver driver,String ServicedBy) {
		BrowserActions.type(driver, inpServicedBy,ServicedBy, "ServicedBy");
		return this;
	}
	public ContactsPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public ContactsPage selectPrimaryphone(WebDriver driver,String Primaryphone)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryphone,Primaryphone,"Primaryphone");
		return this;
	}
	public ContactsPage enterServiceDate(WebDriver driver,String ServiceDate) {
		BrowserActions.type(driver, inpServiceDate,ServiceDate, "ServiceDate");
		return this;
	}
	public ContactsPage clickLegalVenue(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
		return this;
	}
	public ContactsPage clickAutoFillIcon_62(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_62,"AutoFillIcon_62");
		return this;
	}
	public ContactsPage clickAdd_78(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_78,"Add_78");
		return this;
	}
	public ContactsPage enterName_3(WebDriver driver,String Name_3) {
		BrowserActions.type(driver, inpName_3,Name_3, "Name_3");
		return this;
	}
	public ContactsPage enterValiduntil_65(WebDriver driver,String Validuntil_65) {
		BrowserActions.type(driver, inpValiduntil_65,Validuntil_65, "Validuntil_65");
		return this;
	}
	public ContactsPage clickCheckforDuplicates_88(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_88,"CheckforDuplicates_88");
		return this;
	}
	public ContactsPage enterRoles(WebDriver driver,String Roles) {
		BrowserActions.type(driver, inpRoles,Roles, "Roles");
		return this;
	}
	public ContactsPage enterRoles_4(WebDriver driver,String Roles_4) {
		BrowserActions.type(driver, inpRoles_4,Roles_4, "Roles_4");
		return this;
	}
	public ContactsPage clickAddNewReview_89(WebDriver driver)  {
		BrowserActions.click(driver, btnAddNewReview_89,"AddNewReview_89");
		return this;
	}
	public ContactsPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public ContactsPage clickAdd_49(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_49,"Add_49");
		return this;
	}
	public ContactsPage enterMobile_36(WebDriver driver,String Mobile_36) {
		BrowserActions.type(driver, inpMobile_36,Mobile_36, "Mobile_36");
		return this;
	}
	public ContactsPage enterCity_57(WebDriver driver,String City_57) {
		BrowserActions.type(driver, inpCity_57,City_57, "City_57");
		return this;
	}
	public ContactsPage selectServiceType(WebDriver driver,String ServiceType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpServiceType,ServiceType,"ServiceType");
		return this;
	}
	public ContactsPage clickPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnPerson,"Person");
		return this;
	}
	public ContactsPage clickMedicalCareOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
		return this;
	}
	public ContactsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public ContactsPage clickSelect(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,"Select");
		return this;
	}
	public ContactsPage clickEdit_70(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_70,"Edit_70");
		return this;
	}
	public ContactsPage clickAttorney(WebDriver driver)  {
		BrowserActions.click(driver, btnAttorney,"Attorney");
		return this;
	}
	public ContactsPage clickAddNewReview(WebDriver driver)  {
		BrowserActions.click(driver, btnAddNewReview,"AddNewReview");
		return this;
	}
	public ContactsPage selectCountry_53(WebDriver driver,String Country_53)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_53,Country_53,"Country_53");
		return this;
	}
	public ContactsPage clickPrimaryContactMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnPrimaryContactMenuIcon,"PrimaryContactMenuIcon");
		return this;
	}
	public ContactsPage enterHomeExtension(WebDriver driver,String HomeExtension) {
		BrowserActions.type(driver, inpHomeExtension,HomeExtension, "HomeExtension");
		return this;
	}
	public ContactsPage clickCopyfromAddressBook_46(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_46,"CopyfromAddressBook_46");
		return this;
	}
	public ContactsPage selectTaxStatus(WebDriver driver,String TaxStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTaxStatus,TaxStatus,"TaxStatus");
		return this;
	}
	public ContactsPage enterPhone(WebDriver driver,String Phone) {
		BrowserActions.type(driver, inpPhone,Phone, "Phone");
		return this;
	}
	public ContactsPage enterComments(WebDriver driver,String Comments) {
		BrowserActions.type(driver, inpComments,Comments, "Comments");
		return this;
	}
	public ContactsPage clickEdit_81(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_81,"Edit_81");
		return this;
	}
	public ContactsPage clickCompleteSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnCompleteSelected,"CompleteSelected");
		return this;
	}
	public ContactsPage selectMobileRegionCode(WebDriver driver,String MobileRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMobileRegionCode,MobileRegionCode,"MobileRegionCode");
		return this;
	}
	public ContactsPage clickAddressDetail(WebDriver driver)  {
		BrowserActions.click(driver, btnAddressDetail,"AddressDetail");
		return this;
	}
	public ContactsPage enterWork_34(WebDriver driver,String Work_34) {
		BrowserActions.type(driver, inpWork_34,Work_34, "Work_34");
		return this;
	}
	public ContactsPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public ContactsPage clickViewinAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook,"ViewinAddressBook");
		return this;
	}
	public ContactsPage selectState_9(WebDriver driver,String State_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_9,State_9,"State_9");
		return this;
	}
	public ContactsPage clickViewinAddressBook_76(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_76,"ViewinAddressBook_76");
		return this;
	}
	public ContactsPage selectPrimaryContact(WebDriver driver,String PrimaryContact)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryContact,PrimaryContact,"PrimaryContact");
		return this;
	}
	public ContactsPage clickEdit_91(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_91,"Edit_91");
		return this;
	}
	public ContactsPage clickDoctor(WebDriver driver)  {
		BrowserActions.click(driver, btnDoctor,"Doctor");
		return this;
	}
	public ContactsPage selectPeopleInvolvedDetailedFilter_1(WebDriver driver,String PeopleInvolvedDetailedFilter_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPeopleInvolvedDetailedFilter_1,PeopleInvolvedDetailedFilter_1,"PeopleInvolvedDetailedFilter_1");
		return this;
	}
	public ContactsPage enterName_28(WebDriver driver,String Name_28) {
		BrowserActions.type(driver, inpName_28,Name_28, "Name_28");
		return this;
	}
	public ContactsPage enterAddress2_55(WebDriver driver,String Address2_55) {
		BrowserActions.type(driver, inpAddress2_55,Address2_55, "Address2_55");
		return this;
	}
	public ContactsPage enterWork(WebDriver driver,String Work) {
		BrowserActions.type(driver, inpWork,Work, "Work");
		return this;
	}
	public ContactsPage selectJurisdiction_68(WebDriver driver,String Jurisdiction_68)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_68,Jurisdiction_68,"Jurisdiction_68");
		return this;
	}
	public ContactsPage enterCity_8(WebDriver driver,String City_8) {
		BrowserActions.type(driver, inpCity_8,City_8, "City_8");
		return this;
	}
	public ContactsPage selectRole(WebDriver driver,String Role)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRole,Role,"Role");
		return this;
	}
	public ContactsPage clickUnlink(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink,"Unlink");
		return this;
	}
	public ContactsPage clickAdd_38(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_38,"Add_38");
		return this;
	}
	public ContactsPage clickViewinAddressBook_87(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_87,"ViewinAddressBook_87");
		return this;
	}
	public ContactsPage clickAddExistingContact(WebDriver driver)  {
		BrowserActions.click(driver, btnAddExistingContact,"Add existing contact");
		return this;
	}
	
	public class RelatedContactsPage extends LoadableComponent<RelatedContactsPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
	 	public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
//		public TopNavBar topnavbar;
//		public ClaimContactRelatedContacts claimcontactrelatedcontactsTable;

//		public Addresses addressesTable;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Home-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpHomeRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewStatus']", AI = false)
		private WebElement inpStatus;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel_16;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDetailCardTab", AI = false)
		private WebElement btnReview;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactMattersLV-AddressBookContactMattersFilterSet']", AI = false)
		private WebElement drpAddressBookContactMattersFilterSet_71;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
		private WebElement btnUnlink_47;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Guardian-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
		private WebElement btnViewContactDetails;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
		private WebElement btnVendorCompany_59;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV-0-DisplayName']", AI = false)
		private WebElement inpDisplayName;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
		private WebElement btnViewContactDetails_67;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
		private WebElement btnCopyfromAddressBook_78;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Work-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpWork_2;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactActivitiesLV-AddressBookContactActivitiesFilterSet']", AI = false)
		private WebElement drpAddressBookContactActivitiesFilterSet_68;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactExposuresLV-AddressBookContactExposuresFilterSet']", AI = false)
		private WebElement drpAddressBookContactExposuresFilterSet_70;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Rel']", AI = false)
		private WebElement drpRelationtoContact;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Home-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpHome_3;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
		private WebElement inpValiduntil_38;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-DriversLicenseInfoInputSet-LicenseState']", AI = false)
		private WebElement drpState_10;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
		private WebElement btnUpdate_13;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Work-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpWorkExtension;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization']", AI = false)
		private WebElement drpOrganization;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
		private WebElement btnUpdate_15;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
		private WebElement drpJurisdiction_41;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
		private WebElement btnAutoTowingAgency_56;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_52;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
		private WebElement btnMedicalCareOrganization_58;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
		private WebElement btnLink;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
		private WebElement btnAdjudicator;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Primary']", AI = false)
		private WebElement inpMain;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-SSNReleaseAuthorized']", AI = false)
		private WebElement rdbSSNReleaseAuthorized;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactEFTLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_11;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-PassportNumber']", AI = false)
		private WebElement inpPassportNumber;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-TaxFilingStatus']", AI = false)
		private WebElement drpTaxFilingStatus;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		private WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
		private WebElement btnCopyfromAddressBook_48;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Fax-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpFaxRegionCode;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
		private WebElement btnEdit_43;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
		private WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
		private WebElement drpCountry_26;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
		private WebElement drpLocation;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
		private WebElement btnCheckforDuplicates;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
		private WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
		private WebElement inpLocationCode_40;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
		private WebElement btnAttorney_63;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim']", AI = false)
		private WebElement inpClaim;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Fax-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpFax;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
		private WebElement inpValiduntil;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
		private WebElement btnUpdate_1;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-DriversLicenseInfoInputSet-LicenseNumber']", AI = false)
		private WebElement inpNumber;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		private WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel_45;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Work-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpWorkRegionCode;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactAddressesCardTab", AI = false)
		private WebElement btnAddresses;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-TaxID']", AI = false)
		private WebElement inpTaxIDSSN;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
		private WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		private WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
		private WebElement drpState;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
		private WebElement drpReviewsFilter_82;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactMattersLV-AddressBookContactMattersFilterSet']", AI = false)
		private WebElement drpAddressBookContactMattersFilterSet;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
		private WebElement btnNewLegal;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
		private WebElement inpLocation_25;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-Notes textarea", AI = false)
		private WebElement inpNotes;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
		private WebElement drpAddressType_36;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
		private WebElement btnViewinAddressBook_49;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactExposuresCardTab", AI = false)
		private WebElement btnExposures;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-EducationLevel']", AI = false)
		private WebElement inpEducationLevel;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate_dateIcon", AI = false)
		private WebElement btnServiceDateDateIcon;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
		private WebElement btnViewContactDetails_9;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsCardTab", AI = false)
		private WebElement btnRelatedContacts;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactClaimsLV-AddressBookContactClaimsFilterSet']", AI = false)
		private WebElement drpAddressBookContactClaimsFilterSet_69;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ShowClaimsButton>div[role='button']", AI = false)
		private WebElement btnShowClaimsButton;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
		private WebElement btnUnlink_77;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
		private WebElement btnNewCompany_60;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Occupation']", AI = false)
		private WebElement inpOccupation;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactClaimsCardTab", AI = false)
		private WebElement btnClaims;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactActivitiesCardTab", AI = false)
		private WebElement btnActivities;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
		private WebElement btnAutoTowingAgency;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactReviewCardTab", AI = false)
		private WebElement btnReviews;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
		private WebElement inpLocation;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
		private WebElement btnViewinAddressBook_20;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactClaimsLV-AddressBookContactClaimsFilterSet']", AI = false)
		private WebElement drpAddressBookContactClaimsFilterSet;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
		private WebElement btnCheckforDuplicates_21;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-__crumb__", AI = false)
		private WebElement btnReturntoContacts;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
		private WebElement btnNewPerson_7;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
		private WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-VisaNumber']", AI = false)
		private WebElement inpVisaNumber;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
		private WebElement btnUpdate_42;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel_75;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
		private WebElement btnUpdate_44;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-MenuItem_Search>div[role='menuitem']", AI = false)
		private WebElement btnSearch_8;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-OrganizationMenuIcon>div[role='button']", AI = false)
		private WebElement btnOrganizationMenuIcon;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsCardTab", AI = false)
		private WebElement btnBasics;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_31;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_35;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewRelatedTo']", AI = false)
		private WebElement drpRelatedTo;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
		private WebElement btnAdjudicator_62;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
		private WebElement btnValiduntilDateIcon_39;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactMattersCardTab", AI = false)
		private WebElement btnMatters;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewScore']", AI = false)
		private WebElement inpReviewScore;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
		private WebElement btnValiduntilDateIcon;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
		private WebElement btnEdit_14;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
		private WebElement inpZIPCode_34;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
		private WebElement btnLink_76;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
		private WebElement btnCopyfromAddressBook;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ShowActivitiesButton>div[role='button']", AI = false)
		private WebElement btnShowActivitiesButton;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
		private WebElement drpState_33;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-DateOfBirth_dateIcon", AI = false)
		private WebElement btnDateofBirthDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
		private WebElement inpLocationDescription_37;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
		private WebElement drpLocation_24;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewContact']", AI = false)
		private WebElement inpVendor;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactActivitiesLV-AddressBookContactActivitiesFilterSet']", AI = false)
		private WebElement drpAddressBookContactActivitiesFilterSet;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Fax-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpFax_5;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Secondary']", AI = false)
		private WebElement inpAlternate;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewedBy']", AI = false)
		private WebElement inpReviewedBy;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Guardian-GuardianMenuIcon>div[role='button']", AI = false)
		private WebElement btnGuardianMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusMessage']", AI = false)
		private WebElement inpLinkStatusMessage;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-EmployeeSecurityID']", AI = false)
		private WebElement inpEmployeeSecurityID;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
		private WebElement btnNewPerson_53;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewType']", AI = false)
		private WebElement inpReviewType;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Fax-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpFaxExtension;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		private WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-GreenCardNumber']", AI = false)
		private WebElement inpGreenCardNumber;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Home-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpHome;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-MenuItem_Search>div[role='menuitem']", AI = false)
		private WebElement btnSearch_66;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
		private WebElement drpJurisdiction;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_6;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
		private WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
		private WebElement inpAddress1_27;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ShowExposuresButton>div[role='button']", AI = false)
		private WebElement btnShowExposuresButton;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-IDType']", AI = false)
		private WebElement drpIDType;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
		private WebElement inpLocationCode;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
		private WebElement drpReviewsFilter;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
		private WebElement btnLink_17;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-ContactProhibited']", AI = false)
		private WebElement rdbContactProhibited;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
		private WebElement btnCheckforDuplicates_50;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV-0-AddressType']", AI = false)
		private WebElement drpType;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Guardian-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
		private WebElement btnNewPerson;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
		private WebElement btnLawFirm_64;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
		private WebElement inpAddress2_28;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
		private WebElement btnAutobodyRepairShop;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
		private WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
		private WebElement inpLocationDescription;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
		private WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
		private WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
		private WebElement btnLink_46;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-JurisdictionAssignedID']", AI = false)
		private WebElement inpJurisdictionAssignedID;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Cell-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpMobile;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
		private WebElement inpCity_30;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Currency']", AI = false)
		private WebElement drpPreferredCurrency;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewComments textarea", AI = false)
		private WebElement inpAdjustersComments;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim-SelectReviewClaim", AI = false)
		private WebElement btnSearch_84;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactDocumentsCardTab", AI = false)
		private WebElement btnDocuments;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusRelationshipsMessage']", AI = false)
		private WebElement inpLinkStatusRelationshipsMessage;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
		private WebElement btnUpdate_72;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
		private WebElement btnUpdate_74;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		private WebElement inpName;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Cell-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpMobileExtension;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
		private WebElement btnNewVendor;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
		private WebElement btnVendorCompany;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
		private WebElement btnLawFirm;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-TextInput0']", AI = false)
		private WebElement inpServicedBy;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-PrimaryPhone']", AI = false)
		private WebElement drpPrimaryphone;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ContactMenuIcon>div[role='button']", AI = false)
		private WebElement btnContactMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate']", AI = false)
		private WebElement inpServiceDate;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
		private WebElement btnLegalVenue;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
		private WebElement btnLegalVenue_65;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact']", AI = false)
		private WebElement drpName;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
		private WebElement btnDoctor_57;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
		private WebElement btnCheckforDuplicates_80;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		private WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
		private WebElement inpCity;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewNRE>div[role='button']", AI = false)
		private WebElement btnAddNewReview_81;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
		private WebElement inpCounty_32;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceType']", AI = false)
		private WebElement drpServiceType;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
		private WebElement btnMedicalCareOrganization;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Guardian-MenuItem_Search>div[role='menuitem']", AI = false)
		private WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
		private WebElement btnAttorney;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
		private WebElement btnEdit_73;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Gender']", AI = false)
		private WebElement drpGender;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewRE>div[role='button']", AI = false)
		private WebElement btnAddNewReview;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ShowMattersButton>div[role='button']", AI = false)
		private WebElement btnShowMattersButton;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressBookContactExposuresLV-AddressBookContactExposuresFilterSet']", AI = false)
		private WebElement drpAddressBookContactExposuresFilterSet;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
		private WebElement btnNewVendor_54;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_51;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-TaxExemptionsEntitled']", AI = false)
		private WebElement inpTaxExemptionsEntitled;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Home-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpHomeExtension;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
		private WebElement btnAutobodyRepairShop_55;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-FormerName']", AI = false)
		private WebElement inpFormername;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-ToolbarButton>div[role='button']", AI = false)
		private WebElement btnEdit_83;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-ReviewCompleteSelectedNRE>div[role='button']", AI = false)
		private WebElement btnCompleteSelected;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Cell-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpMobileRegionCode;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV-0-Contact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
		private WebElement btnNewLegal_61;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressDetailCardTab", AI = false)
		private WebElement btnAddressDetail;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-MaritalStatus']", AI = false)
		private WebElement drpMaritalstatus;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-DateOfBirth']", AI = false)
		private WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
		private WebElement btnViewinAddressBook_79;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactEFTLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_12;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-Delete>div[role='button']", AI = false)
		private WebElement btnDelete;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
		private WebElement btnViewinAddressBook;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		private WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_22;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
		private WebElement btnNewCompany;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
		private WebElement btnCopyfromAddressBook_19;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
		private WebElement inpAddress3_29;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Organization-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
		private WebElement btnDoctor;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Work-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpWork;

		@IFindBy(how = How.CSS, using = "input[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Cell-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpMobile_4;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
		private WebElement btnUnlink_18;

		@IFindBy(how = How.CSS, using = "select[name='AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-Guardian']", AI = false)
		private WebElement drpGuardian;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_23;

		@IFindBy(how = How.CSS, using = "#AddExistingPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
		private WebElement btnUnlink;

		public RelatedContactsPage(){
		}

		public RelatedContactsPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
			PageFactory.initElements(finder, this);
//			claimcontactrelatedcontactsTable = new ClaimContactRelatedContacts();
//			addressesTable = new Addresses();
	}
	@Override
		protected void load() {
			isPageLoaded = true;
			WaitUtils.waitForPageLoad(driver);
		}@Override
		protected void isLoaded() {
			if (!isPageLoaded) {
				Assert.fail();
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnUnlink))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
	}public RelatedContactsPage selectHomeRegionCode(WebDriver driver,String HomeRegionCode)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpHomeRegionCode,HomeRegionCode,"HomeRegionCode");
					    return this;
				}
	public RelatedContactsPage enterStatus(WebDriver driver,String Status) {
			            BrowserActions.type(driver, inpStatus,Status, "Status");
				        return this;
	           }
	public RelatedContactsPage clickCancel_16(WebDriver driver)  {
						BrowserActions.click(driver, btnCancel_16,"Cancel_16");
					    return this;
				}
	public RelatedContactsPage clickReview(WebDriver driver)  {
						BrowserActions.click(driver, btnReview,"Review");
					    return this;
				}
	public RelatedContactsPage selectAddressBookContactMattersFilterSet_71(WebDriver driver,String AddressBookContactMattersFilterSet_71)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactMattersFilterSet_71,AddressBookContactMattersFilterSet_71,"AddressBookContactMattersFilterSet_71");
					    return this;
				}
	public RelatedContactsPage clickUnlink_47(WebDriver driver)  {
						BrowserActions.click(driver, btnUnlink_47,"Unlink_47");
					    return this;
				}
	public RelatedContactsPage clickViewContactDetails(WebDriver driver)  {
						BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
					    return this;
				}
	public RelatedContactsPage clickVendorCompany_59(WebDriver driver)  {
						BrowserActions.click(driver, btnVendorCompany_59,"VendorCompany_59");
					    return this;
				}
	public RelatedContactsPage enterDisplayName(WebDriver driver,String DisplayName) {
			            BrowserActions.type(driver, inpDisplayName,DisplayName, "DisplayName");
				        return this;
	           }
	public RelatedContactsPage clickViewContactDetails_67(WebDriver driver)  {
						BrowserActions.click(driver, btnViewContactDetails_67,"ViewContactDetails_67");
					    return this;
				}
	public RelatedContactsPage clickCopyfromAddressBook_78(WebDriver driver)  {
						BrowserActions.click(driver, btnCopyfromAddressBook_78,"CopyfromAddressBook_78");
					    return this;
				}
	public RelatedContactsPage enterWork_2(WebDriver driver,String Work_2) {
			            BrowserActions.type(driver, inpWork_2,Work_2, "Work_2");
				        return this;
	           }
	public RelatedContactsPage selectAddressBookContactActivitiesFilterSet_68(WebDriver driver,String AddressBookContactActivitiesFilterSet_68)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactActivitiesFilterSet_68,AddressBookContactActivitiesFilterSet_68,"AddressBookContactActivitiesFilterSet_68");
					    return this;
				}
	public RelatedContactsPage selectAddressBookContactExposuresFilterSet_70(WebDriver driver,String AddressBookContactExposuresFilterSet_70)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactExposuresFilterSet_70,AddressBookContactExposuresFilterSet_70,"AddressBookContactExposuresFilterSet_70");
					    return this;
				}
	public RelatedContactsPage selectRelationtoContact(WebDriver driver,String RelationtoContact)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpRelationtoContact,RelationtoContact,"RelationtoContact");
					    return this;
				}
	public RelatedContactsPage enterHome_3(WebDriver driver,String Home_3) {
			            BrowserActions.type(driver, inpHome_3,Home_3, "Home_3");
				        return this;
	           }
	public RelatedContactsPage enterValiduntil_38(WebDriver driver,String Validuntil_38) {
			            BrowserActions.type(driver, inpValiduntil_38,Validuntil_38, "Validuntil_38");
				        return this;
	           }
	public RelatedContactsPage selectState_10(WebDriver driver,String State_10)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpState_10,State_10,"State_10");
					    return this;
				}
	public RelatedContactsPage clickUpdate_13(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate_13,"Update_13");
					    return this;
				}
	public RelatedContactsPage enterWorkExtension(WebDriver driver,String WorkExtension) {
			            BrowserActions.type(driver, inpWorkExtension,WorkExtension, "WorkExtension");
				        return this;
	           }
	public RelatedContactsPage selectOrganization(WebDriver driver,String Organization)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpOrganization,Organization,"Organization");
					    return this;
				}
	public RelatedContactsPage clickUpdate_15(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate_15,"Update_15");
					    return this;
				}
	public RelatedContactsPage selectJurisdiction_41(WebDriver driver,String Jurisdiction_41)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_41,Jurisdiction_41,"Jurisdiction_41");
					    return this;
				}
	public RelatedContactsPage clickAutoTowingAgency_56(WebDriver driver)  {
						BrowserActions.click(driver, btnAutoTowingAgency_56,"AutoTowingAgency_56");
					    return this;
				}
	public RelatedContactsPage clickRemove_52(WebDriver driver)  {
						BrowserActions.click(driver, btnRemove_52,"Remove_52");
					    return this;
				}
	public RelatedContactsPage clickMedicalCareOrganization_58(WebDriver driver)  {
						BrowserActions.click(driver, btnMedicalCareOrganization_58,"MedicalCareOrganization_58");
					    return this;
				}
	public RelatedContactsPage clickLink(WebDriver driver)  {
						BrowserActions.click(driver, btnLink,"Link");
					    return this;
				}
	public RelatedContactsPage clickAdjudicator(WebDriver driver)  {
						BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
					    return this;
				}
	public RelatedContactsPage enterMain(WebDriver driver,String Main) {
			            BrowserActions.type(driver, inpMain,Main, "Main");
				        return this;
	           }
	public RelatedContactsPage clickSSNReleaseAuthorized(WebDriver driver)  {
						BrowserActions.click(driver, rdbSSNReleaseAuthorized,"SSNReleaseAuthorized");
					    return this;
				}
	public RelatedContactsPage clickAdd_11(WebDriver driver)  {
						BrowserActions.click(driver, btnAdd_11,"Add_11");
					    return this;
				}
	public RelatedContactsPage enterPassportNumber(WebDriver driver,String PassportNumber) {
			            BrowserActions.type(driver, inpPassportNumber,PassportNumber, "PassportNumber");
				        return this;
	           }
	public RelatedContactsPage selectTaxFilingStatus(WebDriver driver,String TaxFilingStatus)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpTaxFilingStatus,TaxFilingStatus,"TaxFilingStatus");
					    return this;
				}
	public RelatedContactsPage enterFirstname(WebDriver driver,String Firstname) {
			            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
				        return this;
	           }
	public RelatedContactsPage clickCopyfromAddressBook_48(WebDriver driver)  {
						BrowserActions.click(driver, btnCopyfromAddressBook_48,"CopyfromAddressBook_48");
					    return this;
				}
	public RelatedContactsPage selectFaxRegionCode(WebDriver driver,String FaxRegionCode)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpFaxRegionCode,FaxRegionCode,"FaxRegionCode");
					    return this;
				}
	public RelatedContactsPage clickEdit_43(WebDriver driver)  {
						BrowserActions.click(driver, btnEdit_43,"Edit_43");
					    return this;
				}
	public RelatedContactsPage selectAddressType(WebDriver driver,String AddressType)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
					    return this;
				}
	public RelatedContactsPage selectCountry_26(WebDriver driver,String Country_26)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpCountry_26,Country_26,"Country_26");
					    return this;
				}
	public RelatedContactsPage selectLocation(WebDriver driver,String Location)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
					    return this;
				}
	public RelatedContactsPage clickCheckforDuplicates(WebDriver driver)  {
						BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
					    return this;
				}
	public RelatedContactsPage enterZIPCode(WebDriver driver,String ZIPCode) {
			            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
				        return this;
	           }
	public RelatedContactsPage enterLocationCode_40(WebDriver driver,String LocationCode_40) {
			            BrowserActions.type(driver, inpLocationCode_40,LocationCode_40, "LocationCode_40");
				        return this;
	           }
	public RelatedContactsPage clickAttorney_63(WebDriver driver)  {
						BrowserActions.click(driver, btnAttorney_63,"Attorney_63");
					    return this;
				}
	public RelatedContactsPage enterClaim(WebDriver driver,String Claim) {
			            BrowserActions.type(driver, inpClaim,Claim, "Claim");
				        return this;
	           }
	public RelatedContactsPage enterFax(WebDriver driver,String Fax) {
			            BrowserActions.type(driver, inpFax,Fax, "Fax");
				        return this;
	           }
	public RelatedContactsPage enterValiduntil(WebDriver driver,String Validuntil) {
			            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
				        return this;
	           }
	public RelatedContactsPage clickUpdate_1(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate_1,"Update_1");
					    return this;
				}
	public RelatedContactsPage enterNumber(WebDriver driver,String Number) {
			            BrowserActions.type(driver, inpNumber,Number, "Number");
				        return this;
	           }
	public RelatedContactsPage selectPrefix(WebDriver driver,String Prefix)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
					    return this;
				}
	public RelatedContactsPage clickCancel_45(WebDriver driver)  {
						BrowserActions.click(driver, btnCancel_45,"Cancel_45");
					    return this;
				}
	public RelatedContactsPage selectWorkRegionCode(WebDriver driver,String WorkRegionCode)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpWorkRegionCode,WorkRegionCode,"WorkRegionCode");
					    return this;
				}
	public RelatedContactsPage clickAddresses(WebDriver driver)  {
						BrowserActions.click(driver, btnAddresses,"Addresses");
					    return this;
				}
	public RelatedContactsPage enterTaxIDSSN(WebDriver driver,String TaxIDSSN) {
			            BrowserActions.type(driver, inpTaxIDSSN,TaxIDSSN, "TaxIDSSN");
				        return this;
	           }
	public RelatedContactsPage selectCountry(WebDriver driver,String Country)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
					    return this;
				}
	public RelatedContactsPage selectSuffix(WebDriver driver,String Suffix)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
					    return this;
				}
	public RelatedContactsPage selectState(WebDriver driver,String State)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
					    return this;
				}
	public RelatedContactsPage selectReviewsFilter_82(WebDriver driver,String ReviewsFilter_82)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter_82,ReviewsFilter_82,"ReviewsFilter_82");
					    return this;
				}
	public RelatedContactsPage selectAddressBookContactMattersFilterSet(WebDriver driver,String AddressBookContactMattersFilterSet)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactMattersFilterSet,AddressBookContactMattersFilterSet,"AddressBookContactMattersFilterSet");
					    return this;
				}
	public RelatedContactsPage clickNewLegal(WebDriver driver)  {
						BrowserActions.click(driver, btnNewLegal,"NewLegal");
					    return this;
				}
	public RelatedContactsPage enterLocation_25(WebDriver driver,String Location_25) {
			            BrowserActions.type(driver, inpLocation_25,Location_25, "Location_25");
				        return this;
	           }
	public RelatedContactsPage enterNotes(WebDriver driver,String Notes) {
			            BrowserActions.type(driver, inpNotes,Notes, "Notes");
				        return this;
	           }
	public RelatedContactsPage selectAddressType_36(WebDriver driver,String AddressType_36)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_36,AddressType_36,"AddressType_36");
					    return this;
				}
	public RelatedContactsPage clickViewinAddressBook_49(WebDriver driver)  {
						BrowserActions.click(driver, btnViewinAddressBook_49,"ViewinAddressBook_49");
					    return this;
				}
	public RelatedContactsPage clickExposures(WebDriver driver)  {
						BrowserActions.click(driver, btnExposures,"Exposures");
					    return this;
				}
	public RelatedContactsPage enterEducationLevel(WebDriver driver,String EducationLevel) {
			            BrowserActions.type(driver, inpEducationLevel,EducationLevel, "EducationLevel");
				        return this;
	           }
	public RelatedContactsPage clickServiceDateDateIcon(WebDriver driver)  {
						BrowserActions.click(driver, btnServiceDateDateIcon,"ServiceDateDateIcon");
					    return this;
				}
	public RelatedContactsPage clickViewContactDetails_9(WebDriver driver)  {
						BrowserActions.click(driver, btnViewContactDetails_9,"ViewContactDetails_9");
					    return this;
				}
	public RelatedContactsPage clickRelatedContacts(WebDriver driver)  {
						BrowserActions.click(driver, btnRelatedContacts,"RelatedContacts");
					    return this;
				}
	public RelatedContactsPage selectAddressBookContactClaimsFilterSet_69(WebDriver driver,String AddressBookContactClaimsFilterSet_69)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactClaimsFilterSet_69,AddressBookContactClaimsFilterSet_69,"AddressBookContactClaimsFilterSet_69");
					    return this;
				}
	public RelatedContactsPage clickShowClaimsButton(WebDriver driver)  {
						BrowserActions.click(driver, btnShowClaimsButton,"ShowClaimsButton");
					    return this;
				}
	public RelatedContactsPage clickUnlink_77(WebDriver driver)  {
						BrowserActions.click(driver, btnUnlink_77,"Unlink_77");
					    return this;
				}
	public RelatedContactsPage clickNewCompany_60(WebDriver driver)  {
						BrowserActions.click(driver, btnNewCompany_60,"NewCompany_60");
					    return this;
				}
	public RelatedContactsPage enterOccupation(WebDriver driver,String Occupation) {
			            BrowserActions.type(driver, inpOccupation,Occupation, "Occupation");
				        return this;
	           }
	public RelatedContactsPage clickClaims(WebDriver driver)  {
						BrowserActions.click(driver, btnClaims,"Claims");
					    return this;
				}
	public RelatedContactsPage clickActivities(WebDriver driver)  {
						BrowserActions.click(driver, btnActivities,"Activities");
					    return this;
				}
	public RelatedContactsPage clickAutoTowingAgency(WebDriver driver)  {
						BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
					    return this;
				}
	public RelatedContactsPage clickReviews(WebDriver driver)  {
						BrowserActions.click(driver, btnReviews,"Reviews");
					    return this;
				}
	public RelatedContactsPage enterLocation(WebDriver driver,String Location) {
			            BrowserActions.type(driver, inpLocation,Location, "Location");
				        return this;
	           }
	public RelatedContactsPage clickViewinAddressBook_20(WebDriver driver)  {
						BrowserActions.click(driver, btnViewinAddressBook_20,"ViewinAddressBook_20");
					    return this;
				}
	public RelatedContactsPage selectAddressBookContactClaimsFilterSet(WebDriver driver,String AddressBookContactClaimsFilterSet)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactClaimsFilterSet,AddressBookContactClaimsFilterSet,"AddressBookContactClaimsFilterSet");
					    return this;
				}
	public RelatedContactsPage clickCheckforDuplicates_21(WebDriver driver)  {
						BrowserActions.click(driver, btnCheckforDuplicates_21,"CheckforDuplicates_21");
					    return this;
				}
	public RelatedContactsPage clickReturntoContacts(WebDriver driver)  {
						BrowserActions.click(driver, btnReturntoContacts,"ReturntoContacts");
					    return this;
				}
	public RelatedContactsPage clickEdit(WebDriver driver)  {
						BrowserActions.click(driver, btnEdit,"Edit");
					    return this;
				}
	public RelatedContactsPage clickNewPerson_7(WebDriver driver)  {
						BrowserActions.click(driver, btnNewPerson_7,"NewPerson_7");
					    return this;
				}
	public RelatedContactsPage clickUpdate(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate,"Update");
					    return this;
				}
	public RelatedContactsPage enterVisaNumber(WebDriver driver,String VisaNumber) {
			            BrowserActions.type(driver, inpVisaNumber,VisaNumber, "VisaNumber");
				        return this;
	           }
	public RelatedContactsPage clickUpdate_42(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate_42,"Update_42");
					    return this;
				}
	public RelatedContactsPage clickCancel_75(WebDriver driver)  {
						BrowserActions.click(driver, btnCancel_75,"Cancel_75");
					    return this;
				}
	public RelatedContactsPage clickUpdate_44(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate_44,"Update_44");
					    return this;
				}
	public RelatedContactsPage clickSearch_8(WebDriver driver)  {
						BrowserActions.click(driver, btnSearch_8,"Search_8");
					    return this;
				}
	public RelatedContactsPage clickOrganizationMenuIcon(WebDriver driver)  {
						BrowserActions.click(driver, btnOrganizationMenuIcon,"OrganizationMenuIcon");
					    return this;
				}
	public RelatedContactsPage clickBasics(WebDriver driver)  {
						BrowserActions.click(driver, btnBasics,"Basics");
					    return this;
				}
	public RelatedContactsPage clickAutoFillIcon_31(WebDriver driver)  {
						BrowserActions.click(driver, btnAutoFillIcon_31,"AutoFillIcon_31");
					    return this;
				}
	public RelatedContactsPage clickRemove(WebDriver driver)  {
						BrowserActions.click(driver, btnRemove,"Remove");
					    return this;
				}
	public RelatedContactsPage clickAutoFillIcon_35(WebDriver driver)  {
						BrowserActions.click(driver, btnAutoFillIcon_35,"AutoFillIcon_35");
					    return this;
				}
	public RelatedContactsPage selectRelatedTo(WebDriver driver,String RelatedTo)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo,RelatedTo,"RelatedTo");
					    return this;
				}
	public RelatedContactsPage clickAdjudicator_62(WebDriver driver)  {
						BrowserActions.click(driver, btnAdjudicator_62,"Adjudicator_62");
					    return this;
				}
	public RelatedContactsPage clickValiduntilDateIcon_39(WebDriver driver)  {
						BrowserActions.click(driver, btnValiduntilDateIcon_39,"ValiduntilDateIcon_39");
					    return this;
				}
	public RelatedContactsPage clickMatters(WebDriver driver)  {
						BrowserActions.click(driver, btnMatters,"Matters");
					    return this;
				}
	public RelatedContactsPage enterReviewScore(WebDriver driver,String ReviewScore) {
			            BrowserActions.type(driver, inpReviewScore,ReviewScore, "ReviewScore");
				        return this;
	           }
	public RelatedContactsPage clickValiduntilDateIcon(WebDriver driver)  {
						BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
					    return this;
				}
	public RelatedContactsPage clickEdit_14(WebDriver driver)  {
						BrowserActions.click(driver, btnEdit_14,"Edit_14");
					    return this;
				}
	public RelatedContactsPage enterZIPCode_34(WebDriver driver,String ZIPCode_34) {
			            BrowserActions.type(driver, inpZIPCode_34,ZIPCode_34, "ZIPCode_34");
				        return this;
	           }
	public RelatedContactsPage clickLink_76(WebDriver driver)  {
						BrowserActions.click(driver, btnLink_76,"Link_76");
					    return this;
				}
	public RelatedContactsPage clickCancel(WebDriver driver)  {
						BrowserActions.click(driver, btnCancel,"Cancel");
					    return this;
				}
	public RelatedContactsPage clickCopyfromAddressBook(WebDriver driver)  {
						BrowserActions.click(driver, btnCopyfromAddressBook,"CopyfromAddressBook");
					    return this;
				}
	public RelatedContactsPage clickShowActivitiesButton(WebDriver driver)  {
						BrowserActions.click(driver, btnShowActivitiesButton,"ShowActivitiesButton");
					    return this;
				}
	public RelatedContactsPage selectState_33(WebDriver driver,String State_33)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpState_33,State_33,"State_33");
					    return this;
				}
	public RelatedContactsPage clickDateofBirthDateIcon(WebDriver driver)  {
						BrowserActions.click(driver, btnDateofBirthDateIcon,"DateofBirthDateIcon");
					    return this;
				}
	public RelatedContactsPage enterLocationDescription_37(WebDriver driver,String LocationDescription_37) {
			            BrowserActions.type(driver, inpLocationDescription_37,LocationDescription_37, "LocationDescription_37");
				        return this;
	           }
	public RelatedContactsPage selectLocation_24(WebDriver driver,String Location_24)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpLocation_24,Location_24,"Location_24");
					    return this;
				}
	public RelatedContactsPage enterVendor(WebDriver driver,String Vendor) {
			            BrowserActions.type(driver, inpVendor,Vendor, "Vendor");
				        return this;
	           }
	public RelatedContactsPage selectAddressBookContactActivitiesFilterSet(WebDriver driver,String AddressBookContactActivitiesFilterSet)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactActivitiesFilterSet,AddressBookContactActivitiesFilterSet,"AddressBookContactActivitiesFilterSet");
					    return this;
				}
	public RelatedContactsPage enterFax_5(WebDriver driver,String Fax_5) {
			            BrowserActions.type(driver, inpFax_5,Fax_5, "Fax_5");
				        return this;
	           }
	public RelatedContactsPage enterAlternate(WebDriver driver,String Alternate) {
			            BrowserActions.type(driver, inpAlternate,Alternate, "Alternate");
				        return this;
	           }
	public RelatedContactsPage enterReviewedBy(WebDriver driver,String ReviewedBy) {
			            BrowserActions.type(driver, inpReviewedBy,ReviewedBy, "ReviewedBy");
				        return this;
	           }
	public RelatedContactsPage clickGuardianMenuIcon(WebDriver driver)  {
						BrowserActions.click(driver, btnGuardianMenuIcon,"GuardianMenuIcon");
					    return this;
				}
	public RelatedContactsPage enterLinkStatusMessage(WebDriver driver,String LinkStatusMessage) {
			            BrowserActions.type(driver, inpLinkStatusMessage,LinkStatusMessage, "LinkStatusMessage");
				        return this;
	           }
	public RelatedContactsPage enterEmployeeSecurityID(WebDriver driver,String EmployeeSecurityID) {
			            BrowserActions.type(driver, inpEmployeeSecurityID,EmployeeSecurityID, "EmployeeSecurityID");
				        return this;
	           }
	public RelatedContactsPage clickNewPerson_53(WebDriver driver)  {
						BrowserActions.click(driver, btnNewPerson_53,"NewPerson_53");
					    return this;
				}
	public RelatedContactsPage enterReviewType(WebDriver driver,String ReviewType) {
			            BrowserActions.type(driver, inpReviewType,ReviewType, "ReviewType");
				        return this;
	           }
	public RelatedContactsPage enterFaxExtension(WebDriver driver,String FaxExtension) {
			            BrowserActions.type(driver, inpFaxExtension,FaxExtension, "FaxExtension");
				        return this;
	           }
	public RelatedContactsPage enterLastname(WebDriver driver,String Lastname) {
			            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
				        return this;
	           }
	public RelatedContactsPage enterGreenCardNumber(WebDriver driver,String GreenCardNumber) {
			            BrowserActions.type(driver, inpGreenCardNumber,GreenCardNumber, "GreenCardNumber");
				        return this;
	           }
	public RelatedContactsPage enterHome(WebDriver driver,String Home) {
			            BrowserActions.type(driver, inpHome,Home, "Home");
				        return this;
	           }
	public RelatedContactsPage clickSearch_66(WebDriver driver)  {
						BrowserActions.click(driver, btnSearch_66,"Search_66");
					    return this;
				}
	public RelatedContactsPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
					    return this;
				}
	public RelatedContactsPage clickAutoFillIcon_6(WebDriver driver)  {
						BrowserActions.click(driver, btnAutoFillIcon_6,"AutoFillIcon_6");
					    return this;
				}
	public RelatedContactsPage enterCounty(WebDriver driver,String County) {
			            BrowserActions.type(driver, inpCounty,County, "County");
				        return this;
	           }
	public RelatedContactsPage enterAddress1_27(WebDriver driver,String Address1_27) {
			            BrowserActions.type(driver, inpAddress1_27,Address1_27, "Address1_27");
				        return this;
	           }
	public RelatedContactsPage clickShowExposuresButton(WebDriver driver)  {
						BrowserActions.click(driver, btnShowExposuresButton,"ShowExposuresButton");
					    return this;
				}
	public RelatedContactsPage selectIDType(WebDriver driver,String IDType)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpIDType,IDType,"IDType");
					    return this;
				}
	public RelatedContactsPage enterLocationCode(WebDriver driver,String LocationCode) {
			            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
				        return this;
	           }
	public RelatedContactsPage selectReviewsFilter(WebDriver driver,String ReviewsFilter)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter,ReviewsFilter,"ReviewsFilter");
					    return this;
				}
	public RelatedContactsPage clickLink_17(WebDriver driver)  {
						BrowserActions.click(driver, btnLink_17,"Link_17");
					    return this;
				}
	public RelatedContactsPage clickContactProhibited(WebDriver driver)  {
						BrowserActions.click(driver, rdbContactProhibited,"ContactProhibited");
					    return this;
				}
	public RelatedContactsPage clickCheckforDuplicates_50(WebDriver driver)  {
						BrowserActions.click(driver, btnCheckforDuplicates_50,"CheckforDuplicates_50");
					    return this;
				}
	public RelatedContactsPage selectType(WebDriver driver,String Type)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
					    return this;
				}
	public RelatedContactsPage clickNewPerson(WebDriver driver)  {
						BrowserActions.click(driver, btnNewPerson,"NewPerson");
					    return this;
				}
	public RelatedContactsPage clickLawFirm_64(WebDriver driver)  {
						BrowserActions.click(driver, btnLawFirm_64,"LawFirm_64");
					    return this;
				}
	public RelatedContactsPage enterAddress2_28(WebDriver driver,String Address2_28) {
			            BrowserActions.type(driver, inpAddress2_28,Address2_28, "Address2_28");
				        return this;
	           }
	public RelatedContactsPage clickAutobodyRepairShop(WebDriver driver)  {
						BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
					    return this;
				}
	public RelatedContactsPage enterAddress3(WebDriver driver,String Address3) {
			            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
				        return this;
	           }
	public RelatedContactsPage enterLocationDescription(WebDriver driver,String LocationDescription) {
			            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
				        return this;
	           }
	public RelatedContactsPage enterAddress1(WebDriver driver,String Address1) {
			            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
				        return this;
	           }
	public RelatedContactsPage enterAddress2(WebDriver driver,String Address2) {
			            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
				        return this;
	           }
	public RelatedContactsPage clickLink_46(WebDriver driver)  {
						BrowserActions.click(driver, btnLink_46,"Link_46");
					    return this;
				}
	public RelatedContactsPage enterJurisdictionAssignedID(WebDriver driver,String JurisdictionAssignedID) {
			            BrowserActions.type(driver, inpJurisdictionAssignedID,JurisdictionAssignedID, "JurisdictionAssignedID");
				        return this;
	           }
	public RelatedContactsPage enterMobile(WebDriver driver,String Mobile) {
			            BrowserActions.type(driver, inpMobile,Mobile, "Mobile");
				        return this;
	           }
	public RelatedContactsPage enterCity_30(WebDriver driver,String City_30) {
			            BrowserActions.type(driver, inpCity_30,City_30, "City_30");
				        return this;
	           }
	public RelatedContactsPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
					    return this;
				}
	public RelatedContactsPage enterAdjustersComments(WebDriver driver,String AdjustersComments) {
			            BrowserActions.type(driver, inpAdjustersComments,AdjustersComments, "AdjustersComments");
				        return this;
	           }
	public RelatedContactsPage clickSearch_84(WebDriver driver)  {
						BrowserActions.click(driver, btnSearch_84,"Search_84");
					    return this;
				}
	public RelatedContactsPage clickAutoFillIcon(WebDriver driver)  {
						BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
					    return this;
				}
	public RelatedContactsPage clickDocuments(WebDriver driver)  {
						BrowserActions.click(driver, btnDocuments,"Documents");
					    return this;
				}
	public RelatedContactsPage enterLinkStatusRelationshipsMessage(WebDriver driver,String LinkStatusRelationshipsMessage) {
			            BrowserActions.type(driver, inpLinkStatusRelationshipsMessage,LinkStatusRelationshipsMessage, "LinkStatusRelationshipsMessage");
				        return this;
	           }
	public RelatedContactsPage clickUpdate_72(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate_72,"Update_72");
					    return this;
				}
	public RelatedContactsPage clickUpdate_74(WebDriver driver)  {
						BrowserActions.click(driver, btnUpdate_74,"Update_74");
					    return this;
				}
	public RelatedContactsPage enterName(WebDriver driver,String Name) {
			            BrowserActions.type(driver, inpName,Name, "Name");
				        return this;
	           }
	public RelatedContactsPage enterMobileExtension(WebDriver driver,String MobileExtension) {
			            BrowserActions.type(driver, inpMobileExtension,MobileExtension, "MobileExtension");
				        return this;
	           }
	public RelatedContactsPage clickNewVendor(WebDriver driver)  {
						BrowserActions.click(driver, btnNewVendor,"NewVendor");
					    return this;
				}
	public RelatedContactsPage clickVendorCompany(WebDriver driver)  {
						BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
					    return this;
				}
	public RelatedContactsPage clickLawFirm(WebDriver driver)  {
						BrowserActions.click(driver, btnLawFirm,"LawFirm");
					    return this;
				}
	public RelatedContactsPage enterServicedBy(WebDriver driver,String ServicedBy) {
			            BrowserActions.type(driver, inpServicedBy,ServicedBy, "ServicedBy");
				        return this;
	           }
	public RelatedContactsPage clickAdd(WebDriver driver)  {
						BrowserActions.click(driver, btnAdd,"Add");
					    return this;
				}
	public RelatedContactsPage selectPrimaryphone(WebDriver driver,String Primaryphone)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryphone,Primaryphone,"Primaryphone");
					    return this;
				}
	public RelatedContactsPage clickContactMenuIcon(WebDriver driver)  {
						BrowserActions.click(driver, btnContactMenuIcon,"ContactMenuIcon");
					    return this;
				}
	public RelatedContactsPage enterServiceDate(WebDriver driver,String ServiceDate) {
			            BrowserActions.type(driver, inpServiceDate,ServiceDate, "ServiceDate");
				        return this;
	           }
	public RelatedContactsPage clickLegalVenue(WebDriver driver)  {
						BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
					    return this;
				}
	public RelatedContactsPage clickLegalVenue_65(WebDriver driver)  {
						BrowserActions.click(driver, btnLegalVenue_65,"LegalVenue_65");
					    return this;
				}
	public RelatedContactsPage selectName(WebDriver driver,String Name)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,"Name");
					    return this;
				}
	public RelatedContactsPage clickDoctor_57(WebDriver driver)  {
						BrowserActions.click(driver, btnDoctor_57,"Doctor_57");
					    return this;
				}
	public RelatedContactsPage clickCheckforDuplicates_80(WebDriver driver)  {
						BrowserActions.click(driver, btnCheckforDuplicates_80,"CheckforDuplicates_80");
					    return this;
				}
	public RelatedContactsPage enterParticle(WebDriver driver,String Particle) {
			            BrowserActions.type(driver, inpParticle,Particle, "Particle");
				        return this;
	           }
	public RelatedContactsPage enterCity(WebDriver driver,String City) {
			            BrowserActions.type(driver, inpCity,City, "City");
				        return this;
	           }
	public RelatedContactsPage clickAddNewReview_81(WebDriver driver)  {
						BrowserActions.click(driver, btnAddNewReview_81,"AddNewReview_81");
					    return this;
				}
	public RelatedContactsPage enterCounty_32(WebDriver driver,String County_32) {
			            BrowserActions.type(driver, inpCounty_32,County_32, "County_32");
				        return this;
	           }
	public RelatedContactsPage selectServiceType(WebDriver driver,String ServiceType)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpServiceType,ServiceType,"ServiceType");
					    return this;
				}
	public RelatedContactsPage clickMedicalCareOrganization(WebDriver driver)  {
						BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
					    return this;
				}
	public RelatedContactsPage clickSearch(WebDriver driver)  {
						BrowserActions.click(driver, btnSearch,"Search");
					    return this;
				}
	public RelatedContactsPage clickAttorney(WebDriver driver)  {
						BrowserActions.click(driver, btnAttorney,"Attorney");
					    return this;
				}
	public RelatedContactsPage clickEdit_73(WebDriver driver)  {
						BrowserActions.click(driver, btnEdit_73,"Edit_73");
					    return this;
				}
	public RelatedContactsPage selectGender(WebDriver driver,String Gender)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpGender,Gender,"Gender");
					    return this;
				}
	public RelatedContactsPage clickAddNewReview(WebDriver driver)  {
						BrowserActions.click(driver, btnAddNewReview,"AddNewReview");
					    return this;
				}
	public RelatedContactsPage clickShowMattersButton(WebDriver driver)  {
						BrowserActions.click(driver, btnShowMattersButton,"ShowMattersButton");
					    return this;
				}
	public RelatedContactsPage selectAddressBookContactExposuresFilterSet(WebDriver driver,String AddressBookContactExposuresFilterSet)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactExposuresFilterSet,AddressBookContactExposuresFilterSet,"AddressBookContactExposuresFilterSet");
					    return this;
				}
	public RelatedContactsPage clickNewVendor_54(WebDriver driver)  {
						BrowserActions.click(driver, btnNewVendor_54,"NewVendor_54");
					    return this;
				}
	public RelatedContactsPage clickAdd_51(WebDriver driver)  {
						BrowserActions.click(driver, btnAdd_51,"Add_51");
					    return this;
				}
	public RelatedContactsPage enterTaxExemptionsEntitled(WebDriver driver,String TaxExemptionsEntitled) {
			            BrowserActions.type(driver, inpTaxExemptionsEntitled,TaxExemptionsEntitled, "TaxExemptionsEntitled");
				        return this;
	           }
	public RelatedContactsPage enterHomeExtension(WebDriver driver,String HomeExtension) {
			            BrowserActions.type(driver, inpHomeExtension,HomeExtension, "HomeExtension");
				        return this;
	           }
	public RelatedContactsPage clickAutobodyRepairShop_55(WebDriver driver)  {
						BrowserActions.click(driver, btnAutobodyRepairShop_55,"AutobodyRepairShop_55");
					    return this;
				}
	public RelatedContactsPage enterFormername(WebDriver driver,String Formername) {
			            BrowserActions.type(driver, inpFormername,Formername, "Formername");
				        return this;
	           }
	public RelatedContactsPage clickEdit_83(WebDriver driver)  {
						BrowserActions.click(driver, btnEdit_83,"Edit_83");
					    return this;
				}
	public RelatedContactsPage clickCompleteSelected(WebDriver driver)  {
						BrowserActions.click(driver, btnCompleteSelected,"CompleteSelected");
					    return this;
				}
	public RelatedContactsPage selectMobileRegionCode(WebDriver driver,String MobileRegionCode)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpMobileRegionCode,MobileRegionCode,"MobileRegionCode");
					    return this;
				}
	public RelatedContactsPage clickNewLegal_61(WebDriver driver)  {
						BrowserActions.click(driver, btnNewLegal_61,"NewLegal_61");
					    return this;
				}
	public RelatedContactsPage clickAddressDetail(WebDriver driver)  {
						BrowserActions.click(driver, btnAddressDetail,"AddressDetail");
					    return this;
				}
	public RelatedContactsPage selectMaritalstatus(WebDriver driver,String Maritalstatus)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpMaritalstatus,Maritalstatus,"Maritalstatus");
					    return this;
				}
	public RelatedContactsPage enterDateofBirth(WebDriver driver,String DateofBirth) {
			            BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
				        return this;
	           }
	public RelatedContactsPage clickViewinAddressBook_79(WebDriver driver)  {
						BrowserActions.click(driver, btnViewinAddressBook_79,"ViewinAddressBook_79");
					    return this;
				}
	public RelatedContactsPage clickRemove_12(WebDriver driver)  {
						BrowserActions.click(driver, btnRemove_12,"Remove_12");
					    return this;
				}
	public RelatedContactsPage clickDelete(WebDriver driver)  {
						BrowserActions.click(driver, btnDelete,"Delete");
					    return this;
				}
	public RelatedContactsPage clickViewinAddressBook(WebDriver driver)  {
						BrowserActions.click(driver, btnViewinAddressBook,"ViewinAddressBook");
					    return this;
				}
	public RelatedContactsPage enterMiddlename(WebDriver driver,String Middlename) {
			            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
				        return this;
	           }
	public RelatedContactsPage clickAdd_22(WebDriver driver)  {
						BrowserActions.click(driver, btnAdd_22,"Add_22");
					    return this;
				}
	public RelatedContactsPage clickNewCompany(WebDriver driver)  {
						BrowserActions.click(driver, btnNewCompany,"NewCompany");
					    return this;
				}
	public RelatedContactsPage clickCopyfromAddressBook_19(WebDriver driver)  {
						BrowserActions.click(driver, btnCopyfromAddressBook_19,"CopyfromAddressBook_19");
					    return this;
				}
	public RelatedContactsPage enterAddress3_29(WebDriver driver,String Address3_29) {
			            BrowserActions.type(driver, inpAddress3_29,Address3_29, "Address3_29");
				        return this;
	           }
	public RelatedContactsPage clickDoctor(WebDriver driver)  {
						BrowserActions.click(driver, btnDoctor,"Doctor");
					    return this;
				}
	public RelatedContactsPage enterWork(WebDriver driver,String Work) {
			            BrowserActions.type(driver, inpWork,Work, "Work");
				        return this;
	           }
	public RelatedContactsPage enterMobile_4(WebDriver driver,String Mobile_4) {
			            BrowserActions.type(driver, inpMobile_4,Mobile_4, "Mobile_4");
				        return this;
	           }
	public RelatedContactsPage clickUnlink_18(WebDriver driver)  {
						BrowserActions.click(driver, btnUnlink_18,"Unlink_18");
					    return this;
				}
	public RelatedContactsPage selectGuardian(WebDriver driver,String Guardian)  {
						BrowserActions.selectDropDownByVisibleText(driver, drpGuardian,Guardian,"Guardian");
					    return this;
				}
	public RelatedContactsPage clickRemove_23(WebDriver driver)  {
						BrowserActions.click(driver, btnRemove_23,"Remove_23");
					    return this;
				}
	public RelatedContactsPage clickUnlink(WebDriver driver)  {
						BrowserActions.click(driver, btnUnlink,"Unlink");
					    return this;
				}
}
}
