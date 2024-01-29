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

public class NewAutoRepairShop extends LoadableComponent<NewAutoRepairShop> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpHomeRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewStatus']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpWork_3;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_11;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewRE-0-Reviews_AddReviewNewMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnAutoRepairService;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidTo_dateIcon", AI = false)
	private WebElement btnW9ValidtoDateIcon;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDetailCardTab", AI = false)
	private WebElement btnReview;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidTo']", AI = false)
	private WebElement inpClaimInvolvementEnd;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_36;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9received']", AI = false)
	private WebElement rdbW9Received;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_28;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_42;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_59;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidTo_dateIcon", AI = false)
	private WebElement btnClaimInvolvementEndDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil_33;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpHome_4;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpWorkExtension;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_10;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_38;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_47;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorAdditionalInfoInputSet-IsPreferredVendor']", AI = false)
	private WebElement rdbPreferredVendor;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-V_EIN']", AI = false)
	private WebElement inpTaxIDEIN;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactEFTLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_7;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpFaxRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidFrom_dateIcon", AI = false)
	private WebElement btnW9ValidfromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactMattersLV-AddressBookContactMattersFilterSet']", AI = false)
	private WebElement drpAddressBookContactMattersFilterSet_51;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation_20;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_21;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_8;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_9;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpFax;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactActivitiesLV-AddressBookContactActivitiesFilterSet']", AI = false)
	private WebElement drpAddressBookContactActivitiesFilterSet_48;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_1;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9receivedDate']", AI = false)
	private WebElement inpW9ReceivedDate;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpWorkRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode_35;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactAddressesCardTab", AI = false)
	private WebElement btnAddresses;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_53;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_58;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_57;

	@IFindBy(how = How.CSS, using = "select[name$='ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactMattersLV-AddressBookContactMattersFilterSet']", AI = false)
	private WebElement drpAddressBookContactMattersFilterSet;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_40;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-Notes textarea", AI = false)
	private WebElement inpNotes;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_44;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType_31;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_55;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactExposuresCardTab", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate_dateIcon", AI = false)
	private WebElement btnServiceDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_15;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsCardTab", AI = false)
	private WebElement btnRelatedContacts;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_52;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_16;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ShowClaimsButton>div[role='button']", AI = false)
	private WebElement btnShowClaimsButton;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_54;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_56;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactClaimsCardTab", AI = false)
	private WebElement btnClaims;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactActivitiesCardTab", AI = false)
	private WebElement btnActivities;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactReviewCardTab", AI = false)
	private WebElement btnReviews;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactClaimsLV-AddressBookContactClaimsFilterSet']", AI = false)
	private WebElement drpAddressBookContactClaimsFilterSet;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-__crumb__", AI = false)
	private WebElement btnReturntoContacts;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Email2']", AI = false)
	private WebElement inpAlternateEmail;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate_39;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsCardTab", AI = false)
	private WebElement btnBasics;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_30;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon_34;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewRelatedTo']", AI = false)
	private WebElement drpRelatedTo;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactEFTLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_6;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidFrom']", AI = false)
	private WebElement inpClaimInvolvementStart;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactMattersCardTab", AI = false)
	private WebElement btnMatters;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_37;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewScore']", AI = false)
	private WebElement inpReviewScore;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ShowActivitiesButton>div[role='button']", AI = false)
	private WebElement btnShowActivitiesButton;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_29;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Email1']", AI = false)
	private WebElement inpMainEmail;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation_19;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription_32;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_26;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_45;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewContact']", AI = false)
	private WebElement inpVendor;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactActivitiesLV-AddressBookContactActivitiesFilterSet']", AI = false)
	private WebElement drpAddressBookContactActivitiesFilterSet;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpFax_5;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewedBy']", AI = false)
	private WebElement inpReviewedBy;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusMessage']", AI = false)
	private WebElement inpLinkStatusMessage;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewType']", AI = false)
	private WebElement inpReviewType;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpFaxExtension;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim-SelectReviewClaim", AI = false)
	private WebElement btnSearch_64;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpHome;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9receivedDate_dateIcon", AI = false)
	private WebElement btnW9ReceivedDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidFrom_dateIcon", AI = false)
	private WebElement btnClaimInvolvementStartDateIcon;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ShowExposuresButton>div[role='button']", AI = false)
	private WebElement btnShowExposuresButton;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
	private WebElement drpReviewsFilter;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1_22;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_12;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_25;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_41;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_23;

	@IFindBy(how = How.CSS, using = "input[name$='PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_60;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpMobile;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-Currency']", AI = false)
	private WebElement drpPreferredCurrency;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewComments textarea", AI = false)
	private WebElement inpAdjustersComments;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactClaimsLV-AddressBookContactClaimsFilterSet']", AI = false)
	private WebElement drpAddressBookContactClaimsFilterSet_49;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactDocumentsCardTab", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusRelationshipsMessage']", AI = false)
	private WebElement inpLinkStatusRelationshipsMessage;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidTo']", AI = false)
	private WebElement inpW9Validto;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-OrganizationName-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpMobileExtension;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidFrom']", AI = false)
	private WebElement inpW9Validfrom;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorAdditionalInfoInputSet-CompanyVendorSpecialtyInputSet-BusinessLicense']", AI = false)
	private WebElement inpBusinessLicense;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-TextInput0']", AI = false)
	private WebElement inpServicedBy;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryPhone']", AI = false)
	private WebElement drpPrimaryphone;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate']", AI = false)
	private WebElement inpServiceDate;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-ToolbarButton>div[role='button']", AI = false)
	private WebElement btnEdit_63;

	@IFindBy(how = How.CSS, using = "input[name$='ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_46;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceType']", AI = false)
	private WebElement drpServiceType;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewRE>div[role='button']", AI = false)
	private WebElement btnAddNewReview;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ShowMattersButton>div[role='button']", AI = false)
	private WebElement btnShowMattersButton;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-PrimaryContactMenuIcon>div[role='button']", AI = false)
	private WebElement btnPrimaryContactMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactExposuresLV-AddressBookContactExposuresFilterSet']", AI = false)
	private WebElement drpAddressBookContactExposuresFilterSet;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
	private WebElement drpReviewsFilter_62;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorAdditionalInfoInputSet-OverallReviewScore']", AI = false)
	private WebElement inpOverallReviewScore;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpHomeExtension;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-TaxStatus']", AI = false)
	private WebElement drpTaxStatus;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_43;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_17;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-ReviewCompleteSelectedNRE>div[role='button']", AI = false)
	private WebElement btnCompleteSelected;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpMobilePhoneNumber;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpMobileRegionCode;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressDetailCardTab", AI = false)
	private WebElement btnAddressDetail;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_18;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-Delete>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact']", AI = false)
	private WebElement drpPrimaryContact;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewNRE>div[role='button']", AI = false)
	private WebElement btnAddNewReview_61;

	@IFindBy(how = How.CSS, using = "select[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressBookContactExposuresLV-AddressBookContactExposuresFilterSet']", AI = false)
	private WebElement drpAddressBookContactExposuresFilterSet_50;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_14;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_24;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpWork;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_13;

	@IFindBy(how = How.CSS, using = "input[name='NewPartyInvolvedPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_27;

	@IFindBy(how = How.CSS, using = "#NewPartyInvolvedPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink;

	@IFindBy(how = How.CSS, using = "select[name$='0-Role']", AI = false)
	private WebElement drpRoles;
	
	@IFindBy(how = How.CSS, using = "input[name$='FirstName']", AI = false)
	private WebElement inpFirstName;
	
	@IFindBy(how = How.CSS, using = "input[name$='LastName']", AI = false)
	private WebElement inpLastName;
	
	@IFindBy(how = How.CSS, using = "input[name$='ContactDetailScreen-ContactBasicsDV-AdditionalInfoInputSet-TaxID']", AI = false)
	private WebElement inpTaxIDSSN;
	
	@IFindBy(how = How.CSS, using = "input[name$='SSN'],input[name$='TaxID']", AI = false)
	private WebElement inpSSN;

	public NewAutoRepairShop(){
	}

	public NewAutoRepairShop(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnUpdate))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewAutoRepairShop selectHomeRegionCode(WebDriver driver,String HomeRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHomeRegionCode,HomeRegionCode,"HomeRegionCode");
		return this;
	}
	public NewAutoRepairShop enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public NewAutoRepairShop enterWork_3(WebDriver driver,String Work_3) {
		BrowserActions.type(driver, inpWork_3,Work_3, "Work_3");
		return this;
	}
	public NewAutoRepairShop clickCancel_11(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_11,"Cancel_11");
		return this;
	}
	public NewAutoRepairShop clickAutoRepairService(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoRepairService,"AutoRepairService");
		return this;
	}
	public NewAutoRepairShop clickW9ValidtoDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ValidtoDateIcon,"W9ValidtoDateIcon");
		return this;
	}
	public NewAutoRepairShop clickReview(WebDriver driver)  {
		BrowserActions.click(driver, btnReview,"Review");
		return this;
	}
	public NewAutoRepairShop enterClaimInvolvementEnd(WebDriver driver,String ClaimInvolvementEnd) {
		BrowserActions.type(driver, inpClaimInvolvementEnd,ClaimInvolvementEnd, "ClaimInvolvementEnd");
		return this;
	}
	public NewAutoRepairShop clickViewContactDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
		return this;
	}
	public NewAutoRepairShop selectJurisdiction_36(WebDriver driver,String Jurisdiction_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_36,Jurisdiction_36,"Jurisdiction_36");
		return this;
	}
	public NewAutoRepairShop clickW9Received(WebDriver driver)  {
		BrowserActions.click(driver, rdbW9Received,"W9Received");
		return this;
	}
	public NewAutoRepairShop selectState_28(WebDriver driver,String State_28)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_28,State_28,"State_28");
		return this;
	}
	public NewAutoRepairShop clickUnlink_42(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_42,"Unlink_42");
		return this;
	}
	public NewAutoRepairShop clickViewinAddressBook_59(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_59,"ViewinAddressBook_59");
		return this;
	}
	public NewAutoRepairShop clickClaimInvolvementEndDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimInvolvementEndDateIcon,"ClaimInvolvementEndDateIcon");
		return this;
	}
	public NewAutoRepairShop enterValiduntil_33(WebDriver driver,String Validuntil_33) {
		BrowserActions.type(driver, inpValiduntil_33,Validuntil_33, "Validuntil_33");
		return this;
	}
	public NewAutoRepairShop enterHome_4(WebDriver driver,String Home_4) {
		BrowserActions.type(driver, inpHome_4,Home_4, "Home_4");
		return this;
	}
	public NewAutoRepairShop enterWorkExtension(WebDriver driver,String WorkExtension) {
		BrowserActions.type(driver, inpWorkExtension,WorkExtension, "WorkExtension");
		return this;
	}
	public NewAutoRepairShop clickUpdate_10(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_10,"Update_10");
		return this;
	}
	public NewAutoRepairShop clickEdit_38(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_38,"Edit_38");
		return this;
	}
	public NewAutoRepairShop clickRemove_47(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_47,"Remove_47");
		return this;
	}
	public NewAutoRepairShop clickLink(WebDriver driver)  {
		BrowserActions.click(driver, btnLink,"Link");
		return this;
	}
	public NewAutoRepairShop clickPreferredVendor(WebDriver driver)  {
		BrowserActions.click(driver, rdbPreferredVendor,"PreferredVendor");
		return this;
	}
	public NewAutoRepairShop enterTaxIDEIN(WebDriver driver,String TaxIDEIN) {
		BrowserActions.type(driver, inpTaxIDEIN,TaxIDEIN, "TaxIDEIN");
		return this;
	}
	public NewAutoRepairShop clickRemove_7(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_7,"Remove_7");
		return this;
	}
	public NewAutoRepairShop selectFaxRegionCode(WebDriver driver,String FaxRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFaxRegionCode,FaxRegionCode,"FaxRegionCode");
		return this;
	}
	public NewAutoRepairShop selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public NewAutoRepairShop clickW9ValidfromDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ValidfromDateIcon,"W9ValidfromDateIcon");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactMattersFilterSet_51(WebDriver driver,String AddressBookContactMattersFilterSet_51)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactMattersFilterSet_51,AddressBookContactMattersFilterSet_51,"AddressBookContactMattersFilterSet_51");
		return this;
	}
	public NewAutoRepairShop enterLocation_20(WebDriver driver,String Location_20) {
		BrowserActions.type(driver, inpLocation_20,Location_20, "Location_20");
		return this;
	}
	public NewAutoRepairShop selectCountry_21(WebDriver driver,String Country_21)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_21,Country_21,"Country_21");
		return this;
	}
	public NewAutoRepairShop selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public NewAutoRepairShop clickCheckforDuplicates(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
		return this;
	}
	public NewAutoRepairShop clickUpdate_8(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_8,"Update_8");
		return this;
	}
	public NewAutoRepairShop enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public NewAutoRepairShop clickEdit_9(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_9,"Edit_9");
		return this;
	}
	public NewAutoRepairShop enterClaim(WebDriver driver,String Claim) {
		BrowserActions.type(driver, inpClaim,Claim, "Claim");
		return this;
	}
	public NewAutoRepairShop enterValiduntil(WebDriver driver,String Validuntil) {
		BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
		return this;
	}
	public NewAutoRepairShop enterFax(WebDriver driver,String Fax) {
		BrowserActions.type(driver, inpFax,Fax, "Fax");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactActivitiesFilterSet_48(WebDriver driver,String AddressBookContactActivitiesFilterSet_48)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactActivitiesFilterSet_48,AddressBookContactActivitiesFilterSet_48,"AddressBookContactActivitiesFilterSet_48");
		return this;
	}
	public NewAutoRepairShop clickUpdate_1(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_1,"Update_1");
		return this;
	}
	public NewAutoRepairShop enterW9ReceivedDate(WebDriver driver,String W9ReceivedDate) {
		BrowserActions.type(driver, inpW9ReceivedDate,W9ReceivedDate, "W9ReceivedDate");
		return this;
	}
	public NewAutoRepairShop selectWorkRegionCode(WebDriver driver,String WorkRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWorkRegionCode,WorkRegionCode,"WorkRegionCode");
		return this;
	}
	public NewAutoRepairShop enterLocationCode_35(WebDriver driver,String LocationCode_35) {
		BrowserActions.type(driver, inpLocationCode_35,LocationCode_35, "LocationCode_35");
		return this;
	}
	public NewAutoRepairShop clickAddresses(WebDriver driver)  {
		BrowserActions.click(driver, btnAddresses,"Addresses");
		return this;
	}
	public NewAutoRepairShop clickEdit_53(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_53,"Edit_53");
		return this;
	}
	public NewAutoRepairShop clickCopyfromAddressBook_58(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_58,"CopyfromAddressBook_58");
		return this;
	}
	public NewAutoRepairShop selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public NewAutoRepairShop clickUnlink_57(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_57,"Unlink_57");
		return this;
	}
	public NewAutoRepairShop selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactMattersFilterSet(WebDriver driver,String AddressBookContactMattersFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactMattersFilterSet,AddressBookContactMattersFilterSet,"AddressBookContactMattersFilterSet");
		return this;
	}
	public NewAutoRepairShop clickCancel_40(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_40,"Cancel_40");
		return this;
	}
	public NewAutoRepairShop enterNotes(WebDriver driver,String Notes) {
		BrowserActions.type(driver, inpNotes,Notes, "Notes");
		return this;
	}
	public NewAutoRepairShop clickViewinAddressBook_44(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_44,"ViewinAddressBook_44");
		return this;
	}
	public NewAutoRepairShop selectAddressType_31(WebDriver driver,String AddressType_31)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_31,AddressType_31,"AddressType_31");
		return this;
	}
	public NewAutoRepairShop clickCancel_55(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_55,"Cancel_55");
		return this;
	}
	public NewAutoRepairShop clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public NewAutoRepairShop clickServiceDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnServiceDateDateIcon,"ServiceDateDateIcon");
		return this;
	}
	public NewAutoRepairShop clickViewinAddressBook_15(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_15,"ViewinAddressBook_15");
		return this;
	}
	public NewAutoRepairShop clickRelatedContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnRelatedContacts,"RelatedContacts");
		return this;
	}
	public NewAutoRepairShop clickUpdate_52(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_52,"Update_52");
		return this;
	}
	public NewAutoRepairShop clickCheckforDuplicates_16(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_16,"CheckforDuplicates_16");
		return this;
	}
	public NewAutoRepairShop clickShowClaimsButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowClaimsButton,"ShowClaimsButton");
		return this;
	}
	public NewAutoRepairShop clickUpdate_54(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_54,"Update_54");
		return this;
	}
	public NewAutoRepairShop clickLink_56(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_56,"Link_56");
		return this;
	}
	public NewAutoRepairShop clickClaims(WebDriver driver)  {
		BrowserActions.click(driver, btnClaims,"Claims");
		return this;
	}
	public NewAutoRepairShop clickActivities(WebDriver driver)  {
		BrowserActions.click(driver, btnActivities,"Activities");
		return this;
	}
	public NewAutoRepairShop clickReviews(WebDriver driver)  {
		BrowserActions.click(driver, btnReviews,"Reviews");
		return this;
	}
	public NewAutoRepairShop enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactClaimsFilterSet(WebDriver driver,String AddressBookContactClaimsFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactClaimsFilterSet,AddressBookContactClaimsFilterSet,"AddressBookContactClaimsFilterSet");
		return this;
	}
	public NewAutoRepairShop clickReturntoContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoContacts,"ReturntoContacts");
		return this;
	}
	public NewAutoRepairShop clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewAutoRepairShop clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewAutoRepairShop enterAlternateEmail(WebDriver driver,String AlternateEmail) {
		BrowserActions.type(driver, inpAlternateEmail,AlternateEmail, "AlternateEmail");
		return this;
	}
	public NewAutoRepairShop clickUpdate_39(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_39,"Update_39");
		return this;
	}
	public NewAutoRepairShop clickBasics(WebDriver driver)  {
		BrowserActions.click(driver, btnBasics,"Basics");
		return this;
	}
	public NewAutoRepairShop clickAutoFillIcon_30(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_30,"AutoFillIcon_30");
		return this;
	}
	public NewAutoRepairShop clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public NewAutoRepairShop clickValiduntilDateIcon_34(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon_34,"ValiduntilDateIcon_34");
		return this;
	}
	public NewAutoRepairShop selectRelatedTo(WebDriver driver,String RelatedTo)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo,RelatedTo,"RelatedTo");
		return this;
	}
	public NewAutoRepairShop clickAdd_6(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_6,"Add_6");
		return this;
	}
	public NewAutoRepairShop enterClaimInvolvementStart(WebDriver driver,String ClaimInvolvementStart) {
		BrowserActions.type(driver, inpClaimInvolvementStart,ClaimInvolvementStart, "ClaimInvolvementStart");
		return this;
	}
	public NewAutoRepairShop clickMatters(WebDriver driver)  {
		BrowserActions.click(driver, btnMatters,"Matters");
		return this;
	}
	public NewAutoRepairShop clickUpdate_37(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_37,"Update_37");
		return this;
	}
	public NewAutoRepairShop enterReviewScore(WebDriver driver,String ReviewScore) {
		BrowserActions.type(driver, inpReviewScore,ReviewScore, "ReviewScore");
		return this;
	}
	public NewAutoRepairShop clickValiduntilDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
		return this;
	}
	public NewAutoRepairShop clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewAutoRepairShop clickCopyfromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook,"CopyfromAddressBook");
		return this;
	}
	public NewAutoRepairShop clickShowActivitiesButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowActivitiesButton,"ShowActivitiesButton");
		return this;
	}
	public NewAutoRepairShop enterZIPCode_29(WebDriver driver,String ZIPCode_29) {
		BrowserActions.type(driver, inpZIPCode_29,ZIPCode_29, "ZIPCode_29");
		return this;
	}
	public NewAutoRepairShop enterMainEmail(WebDriver driver,String MainEmail) {
		BrowserActions.type(driver, inpMainEmail,MainEmail, "MainEmail");
		return this;
	}
	public NewAutoRepairShop selectLocation_19(WebDriver driver,String Location_19)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation_19,Location_19,"Location_19");
		return this;
	}
	public NewAutoRepairShop enterLocationDescription_32(WebDriver driver,String LocationDescription_32) {
		BrowserActions.type(driver, inpLocationDescription_32,LocationDescription_32, "LocationDescription_32");
		return this;
	}
	public NewAutoRepairShop clickAutoFillIcon_26(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_26,"AutoFillIcon_26");
		return this;
	}
	public NewAutoRepairShop clickCheckforDuplicates_45(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_45,"CheckforDuplicates_45");
		return this;
	}
	public NewAutoRepairShop enterVendor(WebDriver driver,String Vendor) {
		BrowserActions.type(driver, inpVendor,Vendor, "Vendor");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactActivitiesFilterSet(WebDriver driver,String AddressBookContactActivitiesFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactActivitiesFilterSet,AddressBookContactActivitiesFilterSet,"AddressBookContactActivitiesFilterSet");
		return this;
	}
	public NewAutoRepairShop enterFax_5(WebDriver driver,String Fax_5) {
		BrowserActions.type(driver, inpFax_5,Fax_5, "Fax_5");
		return this;
	}
	public NewAutoRepairShop enterReviewedBy(WebDriver driver,String ReviewedBy) {
		BrowserActions.type(driver, inpReviewedBy,ReviewedBy, "ReviewedBy");
		return this;
	}
	public NewAutoRepairShop enterLinkStatusMessage(WebDriver driver,String LinkStatusMessage) {
		BrowserActions.type(driver, inpLinkStatusMessage,LinkStatusMessage, "LinkStatusMessage");
		return this;
	}
	public NewAutoRepairShop enterReviewType(WebDriver driver,String ReviewType) {
		BrowserActions.type(driver, inpReviewType,ReviewType, "ReviewType");
		return this;
	}
	public NewAutoRepairShop enterFaxExtension(WebDriver driver,String FaxExtension) {
		BrowserActions.type(driver, inpFaxExtension,FaxExtension, "FaxExtension");
		return this;
	}
	public NewAutoRepairShop clickSearch_64(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_64,"Search_64");
		return this;
	}
	public NewAutoRepairShop enterHome(WebDriver driver,String Home) {
		BrowserActions.type(driver, inpHome,Home, "Home");
		return this;
	}
	public NewAutoRepairShop clickAutoFillIcon_2(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
		return this;
	}
	public NewAutoRepairShop selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public NewAutoRepairShop enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public NewAutoRepairShop clickW9ReceivedDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ReceivedDateDateIcon,"W9ReceivedDateDateIcon");
		return this;
	}
	public NewAutoRepairShop clickClaimInvolvementStartDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimInvolvementStartDateIcon,"ClaimInvolvementStartDateIcon");
		return this;
	}
	public NewAutoRepairShop clickShowExposuresButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowExposuresButton,"ShowExposuresButton");
		return this;
	}
	public NewAutoRepairShop enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
		return this;
	}
	public NewAutoRepairShop selectReviewsFilter(WebDriver driver,String ReviewsFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter,ReviewsFilter,"ReviewsFilter");
		return this;
	}
	public NewAutoRepairShop clickContactProhibited(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited,"ContactProhibited");
		return this;
	}
	public NewAutoRepairShop enterAddress1_22(WebDriver driver,String Address1_22) {
		BrowserActions.type(driver, inpAddress1_22,Address1_22, "Address1_22");
		return this;
	}
	public NewAutoRepairShop clickLink_12(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_12,"Link_12");
		return this;
	}
	public NewAutoRepairShop clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public NewAutoRepairShop enterCity_25(WebDriver driver,String City_25) {
		BrowserActions.type(driver, inpCity_25,City_25, "City_25");
		return this;
	}
	public NewAutoRepairShop clickLink_41(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_41,"Link_41");
		return this;
	}
	public NewAutoRepairShop enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public NewAutoRepairShop enterLocationDescription(WebDriver driver,String LocationDescription) {
		BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
		return this;
	}
	public NewAutoRepairShop enterAddress2_23(WebDriver driver,String Address2_23) {
		BrowserActions.type(driver, inpAddress2_23,Address2_23, "Address2_23");
		return this;
	}
	public NewAutoRepairShop enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public NewAutoRepairShop enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public NewAutoRepairShop clickCheckforDuplicates_60(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_60,"CheckforDuplicates_60");
		return this;
	}
	public NewAutoRepairShop enterMobile(WebDriver driver,String Mobile) {
		BrowserActions.type(driver, inpMobile,Mobile, "Mobile");
		return this;
	}
	public NewAutoRepairShop selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
		return this;
	}
	public NewAutoRepairShop enterAdjustersComments(WebDriver driver,String AdjustersComments) {
		BrowserActions.type(driver, inpAdjustersComments,AdjustersComments, "AdjustersComments");
		return this;
	}
	public NewAutoRepairShop clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactClaimsFilterSet_49(WebDriver driver,String AddressBookContactClaimsFilterSet_49)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactClaimsFilterSet_49,AddressBookContactClaimsFilterSet_49,"AddressBookContactClaimsFilterSet_49");
		return this;
	}
	public NewAutoRepairShop clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public NewAutoRepairShop enterLinkStatusRelationshipsMessage(WebDriver driver,String LinkStatusRelationshipsMessage) {
		BrowserActions.type(driver, inpLinkStatusRelationshipsMessage,LinkStatusRelationshipsMessage, "LinkStatusRelationshipsMessage");
		return this;
	}
	public NewAutoRepairShop enterW9Validto(WebDriver driver,String W9Validto) {
		BrowserActions.type(driver, inpW9Validto,W9Validto, "W9Validto");
		return this;
	}
	public NewAutoRepairShop enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public NewAutoRepairShop enterMobileExtension(WebDriver driver,String MobileExtension) {
		BrowserActions.type(driver, inpMobileExtension,MobileExtension, "MobileExtension");
		return this;
	}
	public NewAutoRepairShop enterW9Validfrom(WebDriver driver,String W9Validfrom) {
		BrowserActions.type(driver, inpW9Validfrom,W9Validfrom, "W9Validfrom");
		return this;
	}
	public NewAutoRepairShop enterBusinessLicense(WebDriver driver,String BusinessLicense) {
		BrowserActions.type(driver, inpBusinessLicense,BusinessLicense, "BusinessLicense");
		return this;
	}
	public NewAutoRepairShop enterServicedBy(WebDriver driver,String ServicedBy) {
		BrowserActions.type(driver, inpServicedBy,ServicedBy, "ServicedBy");
		return this;
	}
	public NewAutoRepairShop clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewAutoRepairShop selectPrimaryphone(WebDriver driver,String Primaryphone)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryphone,Primaryphone,"Primaryphone");
		return this;
	}
	public NewAutoRepairShop enterServiceDate(WebDriver driver,String ServiceDate) {
		BrowserActions.type(driver, inpServiceDate,ServiceDate, "ServiceDate");
		return this;
	}
	public NewAutoRepairShop clickEdit_63(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_63,"Edit_63");
		return this;
	}
	public NewAutoRepairShop enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public NewAutoRepairShop clickAdd_46(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_46,"Add_46");
		return this;
	}
	public NewAutoRepairShop selectServiceType(WebDriver driver,String ServiceType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpServiceType,ServiceType,"ServiceType");
		return this;
	}
	public NewAutoRepairShop clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public NewAutoRepairShop clickAddNewReview(WebDriver driver)  {
		BrowserActions.click(driver, btnAddNewReview,"AddNewReview");
		return this;
	}
	public NewAutoRepairShop clickShowMattersButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowMattersButton,"ShowMattersButton");
		return this;
	}
	public NewAutoRepairShop clickPrimaryContactMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnPrimaryContactMenuIcon,"PrimaryContactMenuIcon");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactExposuresFilterSet(WebDriver driver,String AddressBookContactExposuresFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactExposuresFilterSet,AddressBookContactExposuresFilterSet,"AddressBookContactExposuresFilterSet");
		return this;
	}
	public NewAutoRepairShop selectReviewsFilter_62(WebDriver driver,String ReviewsFilter_62)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter_62,ReviewsFilter_62,"ReviewsFilter_62");
		return this;
	}
	public NewAutoRepairShop enterOverallReviewScore(WebDriver driver,String OverallReviewScore) {
		BrowserActions.type(driver, inpOverallReviewScore,OverallReviewScore, "OverallReviewScore");
		return this;
	}
	public NewAutoRepairShop enterHomeExtension(WebDriver driver,String HomeExtension) {
		BrowserActions.type(driver, inpHomeExtension,HomeExtension, "HomeExtension");
		return this;
	}
	public NewAutoRepairShop selectTaxStatus(WebDriver driver,String TaxStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTaxStatus,TaxStatus,"TaxStatus");
		return this;
	}
	public NewAutoRepairShop clickCopyfromAddressBook_43(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_43,"CopyfromAddressBook_43");
		return this;
	}
	public NewAutoRepairShop clickAdd_17(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_17,"Add_17");
		return this;
	}
	public NewAutoRepairShop clickCompleteSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnCompleteSelected,"CompleteSelected");
		return this;
	}
	public NewAutoRepairShop enterMobilePhoneNumber(WebDriver driver,String MobilePhoneNumber) {
		BrowserActions.type(driver, inpMobilePhoneNumber,MobilePhoneNumber, "MobilePhoneNumber");
		return this;
	}
	public NewAutoRepairShop selectMobileRegionCode(WebDriver driver,String MobileRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMobileRegionCode,MobileRegionCode,"MobileRegionCode");
		return this;
	}
	public NewAutoRepairShop clickAddressDetail(WebDriver driver)  {
		BrowserActions.click(driver, btnAddressDetail,"AddressDetail");
		return this;
	}
	public NewAutoRepairShop clickRemove_18(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_18,"Remove_18");
		return this;
	}
	public NewAutoRepairShop clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public NewAutoRepairShop clickViewinAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook,"ViewinAddressBook");
		return this;
	}
	public NewAutoRepairShop selectPrimaryContact(WebDriver driver,String PrimaryContact)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryContact,PrimaryContact,"PrimaryContact");
		return this;
	}
	public NewAutoRepairShop clickAddNewReview_61(WebDriver driver)  {
		BrowserActions.click(driver, btnAddNewReview_61,"AddNewReview_61");
		return this;
	}
	public NewAutoRepairShop selectAddressBookContactExposuresFilterSet_50(WebDriver driver,String AddressBookContactExposuresFilterSet_50)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactExposuresFilterSet_50,AddressBookContactExposuresFilterSet_50,"AddressBookContactExposuresFilterSet_50");
		return this;
	}
	public NewAutoRepairShop clickCopyfromAddressBook_14(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_14,"CopyfromAddressBook_14");
		return this;
	}
	public NewAutoRepairShop enterAddress3_24(WebDriver driver,String Address3_24) {
		BrowserActions.type(driver, inpAddress3_24,Address3_24, "Address3_24");
		return this;
	}
	public NewAutoRepairShop enterWork(WebDriver driver,String Work) {
		BrowserActions.type(driver, inpWork,Work, "Work");
		return this;
	}
	public NewAutoRepairShop clickUnlink_13(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_13,"Unlink_13");
		return this;
	}
	public NewAutoRepairShop enterCounty_27(WebDriver driver,String County_27) {
		BrowserActions.type(driver, inpCounty_27,County_27, "County_27");
		return this;
	}
	public NewAutoRepairShop clickUnlink(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink,"Unlink");
		return this;
	}
	public NewAutoRepairShop selectRoles(WebDriver driver, String role)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRoles,role,"Roles");
		return this;
	}
	public NewAutoRepairShop enterFirstname(WebDriver driver, String name)  {
		BrowserActions.type(driver,inpFirstName ,name,"First name");
		return this;
	}
	public NewAutoRepairShop enterLastname(WebDriver driver, String name)  {
		BrowserActions.type(driver,inpLastName ,name,"Last name");
		return this;
	}
	public NewAutoRepairShop enterTaxIDSSN(WebDriver driver, String id)  {
		BrowserActions.type(driver,inpTaxIDSSN ,id,"Tax id SSN");
		return this;
	}
	public NewAutoRepairShop enterSSN(WebDriver driver, String id)  {
		BrowserActions.type(driver,inpSSN ,id," SSN");
		return this;
	}
}
