package com.aspire.guidewire.cc.pages.commercialauto;
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

public class NewAutoTowingAgencyPage extends LoadableComponent<NewAutoTowingAgencyPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpHomeRegionCode;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_10;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewStatus']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_44;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewContact']", AI = false)
	private WebElement inpVendor;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactActivitiesLV-AddressBookContactActivitiesFilterSet']", AI = false)
	private WebElement drpAddressBookContactActivitiesFilterSet;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpFax_4;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidTo_dateIcon", AI = false)
	private WebElement btnW9ValidtoDateIcon;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDetailCardTab", AI = false)
	private WebElement btnReview;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidTo']", AI = false)
	private WebElement inpClaimInvolvementEnd;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewedBy']", AI = false)
	private WebElement inpReviewedBy;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_35;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_58;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusMessage']", AI = false)
	private WebElement inpLinkStatusMessage;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9received']", AI = false)
	private WebElement rdbW9Received;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_27;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewType']", AI = false)
	private WebElement inpReviewType;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_41;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpFaxExtension;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim-SelectReviewClaim", AI = false)
	private WebElement btnSearch_63;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpHome;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpWork_2;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil_32;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9receivedDate_dateIcon", AI = false)
	private WebElement btnW9ReceivedDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidFrom_dateIcon", AI = false)
	private WebElement btnClaimInvolvementStartDateIcon;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidTo_dateIcon", AI = false)
	private WebElement btnClaimInvolvementEndDateIcon;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ShowExposuresButton>div[role='button']", AI = false)
	private WebElement btnShowExposuresButton;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpHome_3;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_8;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
	private WebElement drpReviewsFilter;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_59;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1_21;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-ContactProhibited']", AI = false)
	private WebElement rdbContactProhibited;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpWorkExtension;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_37;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_11;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorAdditionalInfoInputSet-IsPreferredVendor']", AI = false)
	private WebElement rdbPreferredVendor;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-ContactEFTLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_6;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_46;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-V_EIN']", AI = false)
	private WebElement inpTaxIDEIN;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_16;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_24;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_40;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_39;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpFaxRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactMattersLV-AddressBookContactMattersFilterSet']", AI = false)
	private WebElement drpAddressBookContactMattersFilterSet_50;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_22;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidFrom_dateIcon", AI = false)
	private WebElement btnW9ValidfromDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_20;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpMobile;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-Currency']", AI = false)
	private WebElement drpPreferredCurrency;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation_19;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewComments textarea", AI = false)
	private WebElement inpAdjustersComments;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_7;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_57;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactClaimsLV-AddressBookContactClaimsFilterSet']", AI = false)
	private WebElement drpAddressBookContactClaimsFilterSet_48;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewClaim']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactDocumentsCardTab", AI = false)
	private WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Fax-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpFax;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-LinkStatusRelationshipsMessage']", AI = false)
	private WebElement inpLinkStatusRelationshipsMessage;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9receivedDate']", AI = false)
	private WebElement inpW9ReceivedDate;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactActivitiesLV-AddressBookContactActivitiesFilterSet']", AI = false)
	private WebElement drpAddressBookContactActivitiesFilterSet_47;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-__crumb__", AI = false)
	private WebElement btnReturntoStep5of6Services;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpWorkRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidTo']", AI = false)
	private WebElement inpW9Validto;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-OrganizationName-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode_34;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactAddressesCardTab", AI = false)
	private WebElement btnAddresses;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpMobileExtension;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-W9ValidFrom']", AI = false)
	private WebElement inpW9Validfrom;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit_52;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_56;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactMattersLV-AddressBookContactMattersFilterSet']", AI = false)
	private WebElement drpAddressBookContactMattersFilterSet;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-Notes textarea", AI = false)
	private WebElement inpNotes;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-TextInput0']", AI = false)
	private WebElement inpServicedBy;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryPhone']", AI = false)
	private WebElement drpPrimaryphone;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate']", AI = false)
	private WebElement inpServiceDate;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType_30;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnOK_38;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_43;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorAdditionalInfoInputSet-CompanyVendorSpecialtyInputSet-BusinessLicense']", AI = false)
	private WebElement inpAutoTowingBusinessLicense;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel_54;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-ToolbarButton>div[role='button']", AI = false)
	private WebElement btnEdit_62;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressBookContactExposuresCardTab", AI = false)
	private WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook_14;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceDate_dateIcon", AI = false)
	private WebElement btnServiceDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV-ClaimContactRelatedContactsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_45;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsCardTab", AI = false)
	private WebElement btnRelatedContacts;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewServiceType']", AI = false)
	private WebElement drpServiceType;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_51;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ShowClaimsButton>div[role='button']", AI = false)
	private WebElement btnShowClaimsButton;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewRE>div[role='button']", AI = false)
	private WebElement btnAddNewReview;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-CheckDuplicatesButton>div[role='button']", AI = false)
	private WebElement btnCheckforDuplicates_15;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ShowMattersButton>div[role='button']", AI = false)
	private WebElement btnShowMattersButton;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV-ReviewsFilter']", AI = false)
	private WebElement drpReviewsFilter_61;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact-PrimaryContactMenuIcon>div[role='button']", AI = false)
	private WebElement btnPrimaryContactMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_LinkButton>div[role='button']", AI = false)
	private WebElement btnLink_55;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactExposuresLV-AddressBookContactExposuresFilterSet']", AI = false)
	private WebElement drpAddressBookContactExposuresFilterSet;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressBookContactClaimsCardTab", AI = false)
	private WebElement btnClaims;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressBookContactActivitiesCardTab", AI = false)
	private WebElement btnActivities;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnOK_53;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnOK_9;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressBookContactReviewCardTab", AI = false)
	private WebElement btnReviews;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorAdditionalInfoInputSet-OverallReviewScore']", AI = false)
	private WebElement inpOverallReviewScore;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Home-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpHomeExtension;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-VendorW9InfoInputSet-TaxStatus']", AI = false)
	private WebElement drpTaxStatus;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_42;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactClaimsLV-AddressBookContactClaimsFilterSet']", AI = false)
	private WebElement drpAddressBookContactClaimsFilterSet;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-ReviewCompleteSelectedNRE>div[role='button']", AI = false)
	private WebElement btnCompleteSelected;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpMobilePhoneNumber;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Cell-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpMobileRegionCode;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet-AddressDetailCardTab", AI = false)
	private WebElement btnAddressDetail;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Email2']", AI = false)
	private WebElement inpAlternateEmail;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV_tb-Delete>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsCardTab", AI = false)
	private WebElement btnBasics;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-ViewAddressBookToolbarButtonSet-ViewAddressBookToolbarButtons_ViewAddressBookButton>div[role='button']", AI = false)
	private WebElement btnViewinAddressBook;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet-AddressesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_17;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-ContactBasicsHeaderInputSet-EditableClaimContactRolesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook_13;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon_33;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewRelatedTo']", AI = false)
	private WebElement drpRelatedTo;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-PrimaryContact']", AI = false)
	private WebElement drpPrimaryContact;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewsLV_tb-Reviews_AddReviewNewNRE>div[role='button']", AI = false)
	private WebElement btnAddNewReview_60;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-CompanyVendorValidFrom']", AI = false)
	private WebElement inpClaimInvolvementStart;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-ContactEFTLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_5;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation_18;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink_12;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressBookContactMattersCardTab", AI = false)
	private WebElement btnMatters;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_23;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactRelatedContactsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton>div[role='button']", AI = false)
	private WebElement btnUpdate_36;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Work-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpWork;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ReviewsPanelSet-ReviewCardPanel-ReviewDV-ReviewScore']", AI = false)
	private WebElement inpReviewScore;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewContactPopup-ContactDetailScreen-AddressBookContactExposuresLV-AddressBookContactExposuresFilterSet']", AI = false)
	private WebElement drpAddressBookContactExposuresFilterSet_49;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_SyncFromAddressBookButton>div[role='button']", AI = false)
	private WebElement btnCopyfromAddressBook;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ShowActivitiesButton>div[role='button']", AI = false)
	private WebElement btnShowActivitiesButton;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_28;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-ContactBasicsDV-BusinessContactInfoInputSet-Email1']", AI = false)
	private WebElement inpMainEmail;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_25;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_26;

	@IFindBy(how = How.CSS, using = "input[name='NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription_31;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-LinkContactToolbarButtonSet-LinkContactToolbarButtons_UnlinkButton>div[role='button']", AI = false)
	private WebElement btnUnlink;

	@IFindBy(how = How.CSS, using = "#NewContactPopup-ContactDetailScreen-AddressesPanelSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_29;

	@IFindBy(how = How.CSS, using = "div[id$='DuplicateContact_CancelButton']", AI = false)
	private WebElement btnDuplicateContactCancel;


	public NewAutoTowingAgencyPage(){
	}

	public NewAutoTowingAgencyPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewAutoTowingAgencyPage selectHomeRegionCode(WebDriver driver,String HomeRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHomeRegionCode,HomeRegionCode,"HomeRegionCode");
		return this;
	}
	public NewAutoTowingAgencyPage clickCancel_10(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_10,"Cancel_10");
		return this;
	}
	public NewAutoTowingAgencyPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public NewAutoTowingAgencyPage clickCheckforDuplicates_44(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_44,"CheckforDuplicates_44");
		return this;
	}
	public NewAutoTowingAgencyPage enterVendor(WebDriver driver,String Vendor) {
		BrowserActions.type(driver, inpVendor,Vendor, "Vendor");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactActivitiesFilterSet(WebDriver driver,String AddressBookContactActivitiesFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactActivitiesFilterSet,AddressBookContactActivitiesFilterSet,"AddressBookContactActivitiesFilterSet");
		return this;
	}
	public NewAutoTowingAgencyPage enterFax_4(WebDriver driver,String Fax_4) {
		BrowserActions.type(driver, inpFax_4,Fax_4, "Fax_4");
		return this;
	}
	public NewAutoTowingAgencyPage clickW9ValidtoDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ValidtoDateIcon,"W9ValidtoDateIcon");
		return this;
	}
	public NewAutoTowingAgencyPage clickReview(WebDriver driver)  {
		BrowserActions.click(driver, btnReview,"Review");
		return this;
	}
	public NewAutoTowingAgencyPage enterClaimInvolvementEnd(WebDriver driver,String ClaimInvolvementEnd) {
		BrowserActions.type(driver, inpClaimInvolvementEnd,ClaimInvolvementEnd, "ClaimInvolvementEnd");
		return this;
	}
	public NewAutoTowingAgencyPage clickViewContactDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
		return this;
	}
	public NewAutoTowingAgencyPage enterReviewedBy(WebDriver driver,String ReviewedBy) {
		BrowserActions.type(driver, inpReviewedBy,ReviewedBy, "ReviewedBy");
		return this;
	}
	public NewAutoTowingAgencyPage selectJurisdiction_35(WebDriver driver,String Jurisdiction_35)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_35,Jurisdiction_35,"Jurisdiction_35");
		return this;
	}
	public NewAutoTowingAgencyPage clickViewinAddressBook_58(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_58,"ViewinAddressBook_58");
		return this;
	}
	public NewAutoTowingAgencyPage enterLinkStatusMessage(WebDriver driver,String LinkStatusMessage) {
		BrowserActions.type(driver, inpLinkStatusMessage,LinkStatusMessage, "LinkStatusMessage");
		return this;
	}
	public NewAutoTowingAgencyPage clickW9Received(WebDriver driver)  {
		BrowserActions.click(driver, rdbW9Received,"W9Received");
		return this;
	}
	public NewAutoTowingAgencyPage selectState_27(WebDriver driver,String State_27)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_27,State_27,"State_27");
		return this;
	}
	public NewAutoTowingAgencyPage enterReviewType(WebDriver driver,String ReviewType) {
		BrowserActions.type(driver, inpReviewType,ReviewType, "ReviewType");
		return this;
	}
	public NewAutoTowingAgencyPage clickUnlink_41(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_41,"Unlink_41");
		return this;
	}
	public NewAutoTowingAgencyPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public NewAutoTowingAgencyPage enterFaxExtension(WebDriver driver,String FaxExtension) {
		BrowserActions.type(driver, inpFaxExtension,FaxExtension, "FaxExtension");
		return this;
	}
	public NewAutoTowingAgencyPage clickSearch_63(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_63,"Search_63");
		return this;
	}
	public NewAutoTowingAgencyPage enterHome(WebDriver driver,String Home) {
		BrowserActions.type(driver, inpHome,Home, "Home");
		return this;
	}
	public NewAutoTowingAgencyPage enterWork_2(WebDriver driver,String Work_2) {
		BrowserActions.type(driver, inpWork_2,Work_2, "Work_2");
		return this;
	}
	public NewAutoTowingAgencyPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public NewAutoTowingAgencyPage enterValiduntil_32(WebDriver driver,String Validuntil_32) {
		BrowserActions.type(driver, inpValiduntil_32,Validuntil_32, "Validuntil_32");
		return this;
	}
	public NewAutoTowingAgencyPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public NewAutoTowingAgencyPage clickW9ReceivedDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ReceivedDateDateIcon,"W9ReceivedDateDateIcon");
		return this;
	}
	public NewAutoTowingAgencyPage clickClaimInvolvementStartDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimInvolvementStartDateIcon,"ClaimInvolvementStartDateIcon");
		return this;
	}
	public NewAutoTowingAgencyPage clickClaimInvolvementEndDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimInvolvementEndDateIcon,"ClaimInvolvementEndDateIcon");
		return this;
	}
	public NewAutoTowingAgencyPage clickShowExposuresButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowExposuresButton,"ShowExposuresButton");
		return this;
	}
	public NewAutoTowingAgencyPage enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
		return this;
	}
	public NewAutoTowingAgencyPage enterHome_3(WebDriver driver,String Home_3) {
		BrowserActions.type(driver, inpHome_3,Home_3, "Home_3");
		return this;
	}
	public NewAutoTowingAgencyPage clickEdit_8(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_8,"Edit_8");
		return this;
	}
	public NewAutoTowingAgencyPage selectReviewsFilter(WebDriver driver,String ReviewsFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter,ReviewsFilter,"ReviewsFilter");
		return this;
	}
	public NewAutoTowingAgencyPage clickCheckforDuplicates_59(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_59,"CheckforDuplicates_59");
		return this;
	}
	public NewAutoTowingAgencyPage enterAddress1_21(WebDriver driver,String Address1_21) {
		BrowserActions.type(driver, inpAddress1_21,Address1_21, "Address1_21");
		return this;
	}
	public NewAutoTowingAgencyPage clickContactProhibited(WebDriver driver)  {
		BrowserActions.click(driver, rdbContactProhibited,"ContactProhibited");
		return this;
	}
	public NewAutoTowingAgencyPage enterWorkExtension(WebDriver driver,String WorkExtension) {
		BrowserActions.type(driver, inpWorkExtension,WorkExtension, "WorkExtension");
		return this;
	}
	public NewAutoTowingAgencyPage clickEdit_37(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_37,"Edit_37");
		return this;
	}
	public NewAutoTowingAgencyPage clickLink_11(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_11,"Link_11");
		return this;
	}
	public NewAutoTowingAgencyPage clickLink(WebDriver driver)  {
		BrowserActions.click(driver, btnLink,"Link");
		return this;
	}
	public NewAutoTowingAgencyPage clickPreferredVendor(WebDriver driver)  {
		BrowserActions.click(driver, rdbPreferredVendor,"PreferredVendor");
		return this;
	}
	public NewAutoTowingAgencyPage clickRemove_6(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_6,"Remove_6");
		return this;
	}
	public NewAutoTowingAgencyPage clickRemove_46(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_46,"Remove_46");
		return this;
	}
	public NewAutoTowingAgencyPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public NewAutoTowingAgencyPage enterTaxIDEIN(WebDriver driver,String TaxIDEIN) {
		BrowserActions.type(driver, inpTaxIDEIN,TaxIDEIN, "TaxIDEIN");
		return this;
	}
	public NewAutoTowingAgencyPage clickAdd_16(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_16,"Add_16");
		return this;
	}
	public NewAutoTowingAgencyPage enterCity_24(WebDriver driver,String City_24) {
		BrowserActions.type(driver, inpCity_24,City_24, "City_24");
		return this;
	}
	public NewAutoTowingAgencyPage clickLink_40(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_40,"Link_40");
		return this;
	}
	public NewAutoTowingAgencyPage clickCancel_39(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_39,"Cancel_39");
		return this;
	}
	public NewAutoTowingAgencyPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public NewAutoTowingAgencyPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
		return this;
	}
	public NewAutoTowingAgencyPage selectFaxRegionCode(WebDriver driver,String FaxRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFaxRegionCode,FaxRegionCode,"FaxRegionCode");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactMattersFilterSet_50(WebDriver driver,String AddressBookContactMattersFilterSet_50)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactMattersFilterSet_50,AddressBookContactMattersFilterSet_50,"AddressBookContactMattersFilterSet_50");
		return this;
	}
	public NewAutoTowingAgencyPage enterAddress2_22(WebDriver driver,String Address2_22) {
		BrowserActions.type(driver, inpAddress2_22,Address2_22, "Address2_22");
		return this;
	}
	public NewAutoTowingAgencyPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public NewAutoTowingAgencyPage clickW9ValidfromDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnW9ValidfromDateIcon,"W9ValidfromDateIcon");
		return this;
	}
	public NewAutoTowingAgencyPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public NewAutoTowingAgencyPage selectCountry_20(WebDriver driver,String Country_20)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_20,Country_20,"Country_20");
		return this;
	}
	public NewAutoTowingAgencyPage enterMobile(WebDriver driver,String Mobile) {
		BrowserActions.type(driver, inpMobile,Mobile, "Mobile");
		return this;
	}
	public NewAutoTowingAgencyPage selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public NewAutoTowingAgencyPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
		return this;
	}
	public NewAutoTowingAgencyPage clickCheckforDuplicates(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
		return this;
	}
	public NewAutoTowingAgencyPage enterLocation_19(WebDriver driver,String Location_19) {
		BrowserActions.type(driver, inpLocation_19,Location_19, "Location_19");
		return this;
	}
	public NewAutoTowingAgencyPage enterAdjustersComments(WebDriver driver,String AdjustersComments) {
		BrowserActions.type(driver, inpAdjustersComments,AdjustersComments, "AdjustersComments");
		return this;
	}
	public NewAutoTowingAgencyPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public NewAutoTowingAgencyPage clickUpdate_7(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_7,"Update_7");
		return this;
	}
	public NewAutoTowingAgencyPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public NewAutoTowingAgencyPage clickCopyfromAddressBook_57(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_57,"CopyfromAddressBook_57");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactClaimsFilterSet_48(WebDriver driver,String AddressBookContactClaimsFilterSet_48)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactClaimsFilterSet_48,AddressBookContactClaimsFilterSet_48,"AddressBookContactClaimsFilterSet_48");
		return this;
	}
	public NewAutoTowingAgencyPage enterClaim(WebDriver driver,String Claim) {
		BrowserActions.type(driver, inpClaim,Claim, "Claim");
		return this;
	}
	public NewAutoTowingAgencyPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public NewAutoTowingAgencyPage enterValiduntil(WebDriver driver,String Validuntil) {
		BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
		return this;
	}
	public NewAutoTowingAgencyPage enterFax(WebDriver driver,String Fax) {
		BrowserActions.type(driver, inpFax,Fax, "Fax");
		return this;
	}
	public NewAutoTowingAgencyPage enterLinkStatusRelationshipsMessage(WebDriver driver,String LinkStatusRelationshipsMessage) {
		BrowserActions.type(driver, inpLinkStatusRelationshipsMessage,LinkStatusRelationshipsMessage, "LinkStatusRelationshipsMessage");
		return this;
	}
	public NewAutoTowingAgencyPage enterW9ReceivedDate(WebDriver driver,String W9ReceivedDate) {
		BrowserActions.type(driver, inpW9ReceivedDate,W9ReceivedDate, "W9ReceivedDate");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactActivitiesFilterSet_47(WebDriver driver,String AddressBookContactActivitiesFilterSet_47)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactActivitiesFilterSet_47,AddressBookContactActivitiesFilterSet_47,"AddressBookContactActivitiesFilterSet_47");
		return this;
	}
	public NewAutoTowingAgencyPage clickReturntoStep5of6Services(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoStep5of6Services,"ReturntoStep5of6Services");
		return this;
	}
	public NewAutoTowingAgencyPage selectWorkRegionCode(WebDriver driver,String WorkRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWorkRegionCode,WorkRegionCode,"WorkRegionCode");
		return this;
	}
	public NewAutoTowingAgencyPage enterW9Validto(WebDriver driver,String W9Validto) {
		BrowserActions.type(driver, inpW9Validto,W9Validto, "W9Validto");
		return this;
	}
	public NewAutoTowingAgencyPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public NewAutoTowingAgencyPage enterLocationCode_34(WebDriver driver,String LocationCode_34) {
		BrowserActions.type(driver, inpLocationCode_34,LocationCode_34, "LocationCode_34");
		return this;
	}
	public NewAutoTowingAgencyPage clickAddresses(WebDriver driver)  {
		BrowserActions.click(driver, btnAddresses,"Addresses");
		return this;
	}
	public NewAutoTowingAgencyPage enterMobileExtension(WebDriver driver,String MobileExtension) {
		BrowserActions.type(driver, inpMobileExtension,MobileExtension, "MobileExtension");
		return this;
	}
	public NewAutoTowingAgencyPage enterW9Validfrom(WebDriver driver,String W9Validfrom) {
		BrowserActions.type(driver, inpW9Validfrom,W9Validfrom, "W9Validfrom");
		return this;
	}
	public NewAutoTowingAgencyPage clickEdit_52(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_52,"Edit_52");
		return this;
	}
	public NewAutoTowingAgencyPage clickUnlink_56(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_56,"Unlink_56");
		return this;
	}
	public NewAutoTowingAgencyPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public NewAutoTowingAgencyPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactMattersFilterSet(WebDriver driver,String AddressBookContactMattersFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactMattersFilterSet,AddressBookContactMattersFilterSet,"AddressBookContactMattersFilterSet");
		return this;
	}
	public NewAutoTowingAgencyPage enterNotes(WebDriver driver,String Notes) {
		BrowserActions.type(driver, inpNotes,Notes, "Notes");
		return this;
	}
	public NewAutoTowingAgencyPage enterServicedBy(WebDriver driver,String ServicedBy) {
		BrowserActions.type(driver, inpServicedBy,ServicedBy, "ServicedBy");
		return this;
	}
	public NewAutoTowingAgencyPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewAutoTowingAgencyPage selectPrimaryphone(WebDriver driver,String Primaryphone)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryphone,Primaryphone,"Primaryphone");
		return this;
	}
	public NewAutoTowingAgencyPage enterServiceDate(WebDriver driver,String ServiceDate) {
		BrowserActions.type(driver, inpServiceDate,ServiceDate, "ServiceDate");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressType_30(WebDriver driver,String AddressType_30)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_30,AddressType_30,"AddressType_30");
		return this;
	}
	public NewAutoTowingAgencyPage clickOK_38(WebDriver driver)  {
		BrowserActions.click(driver, btnOK_38,"OK_38");
		return this;
	}
	public NewAutoTowingAgencyPage clickViewinAddressBook_43(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_43,"ViewinAddressBook_43");
		return this;
	}
	public NewAutoTowingAgencyPage enterAutoTowingBusinessLicense(WebDriver driver,String AutoTowingBusinessLicense) {
		BrowserActions.type(driver, inpAutoTowingBusinessLicense,AutoTowingBusinessLicense, "AutoTowingBusinessLicense");
		return this;
	}
	public NewAutoTowingAgencyPage clickCancel_54(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel_54,"Cancel_54");
		return this;
	}
	public NewAutoTowingAgencyPage clickEdit_62(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit_62,"Edit_62");
		return this;
	}
	public NewAutoTowingAgencyPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public NewAutoTowingAgencyPage clickViewinAddressBook_14(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook_14,"ViewinAddressBook_14");
		return this;
	}
	public NewAutoTowingAgencyPage clickServiceDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnServiceDateDateIcon,"ServiceDateDateIcon");
		return this;
	}
	public NewAutoTowingAgencyPage clickAdd_45(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_45,"Add_45");
		return this;
	}
	public NewAutoTowingAgencyPage clickRelatedContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnRelatedContacts,"RelatedContacts");
		return this;
	}
	public NewAutoTowingAgencyPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public NewAutoTowingAgencyPage selectServiceType(WebDriver driver,String ServiceType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpServiceType,ServiceType,"ServiceType");
		return this;
	}
	public NewAutoTowingAgencyPage clickUpdate_51(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_51,"Update_51");
		return this;
	}
	public NewAutoTowingAgencyPage clickOK(WebDriver driver)  {
		BrowserActions.click(driver, btnOK,"OK");
		return this;
	}
	public NewAutoTowingAgencyPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public NewAutoTowingAgencyPage clickShowClaimsButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowClaimsButton,"ShowClaimsButton");
		return this;
	}
	public NewAutoTowingAgencyPage clickAddNewReview(WebDriver driver)  {
		BrowserActions.click(driver, btnAddNewReview,"AddNewReview");
		return this;
	}
	public NewAutoTowingAgencyPage clickCheckforDuplicates_15(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates_15,"CheckforDuplicates_15");
		return this;
	}
	public NewAutoTowingAgencyPage clickShowMattersButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowMattersButton,"ShowMattersButton");
		return this;
	}
	public NewAutoTowingAgencyPage selectReviewsFilter_61(WebDriver driver,String ReviewsFilter_61)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReviewsFilter_61,ReviewsFilter_61,"ReviewsFilter_61");
		return this;
	}
	public NewAutoTowingAgencyPage clickPrimaryContactMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnPrimaryContactMenuIcon,"PrimaryContactMenuIcon");
		return this;
	}
	public NewAutoTowingAgencyPage clickLink_55(WebDriver driver)  {
		BrowserActions.click(driver, btnLink_55,"Link_55");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactExposuresFilterSet(WebDriver driver,String AddressBookContactExposuresFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactExposuresFilterSet,AddressBookContactExposuresFilterSet,"AddressBookContactExposuresFilterSet");
		return this;
	}
	public NewAutoTowingAgencyPage clickClaims(WebDriver driver)  {
		BrowserActions.click(driver, btnClaims,"Claims");
		return this;
	}
	public NewAutoTowingAgencyPage clickActivities(WebDriver driver)  {
		BrowserActions.click(driver, btnActivities,"Activities");
		return this;
	}
	public NewAutoTowingAgencyPage clickOK_53(WebDriver driver)  {
		BrowserActions.click(driver, btnOK_53,"OK_53");
		return this;
	}
	public NewAutoTowingAgencyPage clickOK_9(WebDriver driver)  {
		BrowserActions.click(driver, btnOK_9,"OK_9");
		return this;
	}
	public NewAutoTowingAgencyPage clickReviews(WebDriver driver)  {
		BrowserActions.click(driver, btnReviews,"Reviews");
		return this;
	}
	public NewAutoTowingAgencyPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public NewAutoTowingAgencyPage enterOverallReviewScore(WebDriver driver,String OverallReviewScore) {
		BrowserActions.type(driver, inpOverallReviewScore,OverallReviewScore, "OverallReviewScore");
		return this;
	}
	public NewAutoTowingAgencyPage enterHomeExtension(WebDriver driver,String HomeExtension) {
		BrowserActions.type(driver, inpHomeExtension,HomeExtension, "HomeExtension");
		return this;
	}
	public NewAutoTowingAgencyPage selectTaxStatus(WebDriver driver,String TaxStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTaxStatus,TaxStatus,"TaxStatus");
		return this;
	}
	public NewAutoTowingAgencyPage clickCopyfromAddressBook_42(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_42,"CopyfromAddressBook_42");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactClaimsFilterSet(WebDriver driver,String AddressBookContactClaimsFilterSet)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactClaimsFilterSet,AddressBookContactClaimsFilterSet,"AddressBookContactClaimsFilterSet");
		return this;
	}
	public NewAutoTowingAgencyPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewAutoTowingAgencyPage clickCompleteSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnCompleteSelected,"CompleteSelected");
		return this;
	}
	public NewAutoTowingAgencyPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,true,"Update");
		return this;
	}
	public NewAutoTowingAgencyPage enterMobilePhoneNumber(WebDriver driver,String MobilePhoneNumber) {
		BrowserActions.type(driver, inpMobilePhoneNumber,MobilePhoneNumber, "MobilePhoneNumber");
		return this;
	}
	public NewAutoTowingAgencyPage selectMobileRegionCode(WebDriver driver,String MobileRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMobileRegionCode,MobileRegionCode,"MobileRegionCode");
		return this;
	}
	public NewAutoTowingAgencyPage clickAddressDetail(WebDriver driver)  {
		BrowserActions.click(driver, btnAddressDetail,"AddressDetail");
		return this;
	}
	public NewAutoTowingAgencyPage enterAlternateEmail(WebDriver driver,String AlternateEmail) {
		BrowserActions.type(driver, inpAlternateEmail,AlternateEmail, "AlternateEmail");
		return this;
	}
	public NewAutoTowingAgencyPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public NewAutoTowingAgencyPage clickBasics(WebDriver driver)  {
		BrowserActions.click(driver, btnBasics,"Basics");
		return this;
	}
	public NewAutoTowingAgencyPage clickViewinAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnViewinAddressBook,"ViewinAddressBook");
		return this;
	}
	public NewAutoTowingAgencyPage clickRemove_17(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_17,"Remove_17");
		return this;
	}
	public NewAutoTowingAgencyPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public NewAutoTowingAgencyPage clickCopyfromAddressBook_13(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook_13,"CopyfromAddressBook_13");
		return this;
	}
	public NewAutoTowingAgencyPage clickValiduntilDateIcon_33(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon_33,"ValiduntilDateIcon_33");
		return this;
	}
	public NewAutoTowingAgencyPage selectRelatedTo(WebDriver driver,String RelatedTo)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo,RelatedTo,"RelatedTo");
		return this;
	}
	public NewAutoTowingAgencyPage selectPrimaryContact(WebDriver driver,String PrimaryContact)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryContact,PrimaryContact,"PrimaryContact");
		return this;
	}
	public NewAutoTowingAgencyPage clickAddNewReview_60(WebDriver driver)  {
		BrowserActions.click(driver, btnAddNewReview_60,"AddNewReview_60");
		return this;
	}
	public NewAutoTowingAgencyPage enterClaimInvolvementStart(WebDriver driver,String ClaimInvolvementStart) {
		BrowserActions.type(driver, inpClaimInvolvementStart,ClaimInvolvementStart, "ClaimInvolvementStart");
		return this;
	}
	public NewAutoTowingAgencyPage clickAdd_5(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_5,"Add_5");
		return this;
	}
	public NewAutoTowingAgencyPage selectLocation_18(WebDriver driver,String Location_18)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation_18,Location_18,"Location_18");
		return this;
	}
	public NewAutoTowingAgencyPage clickUnlink_12(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink_12,"Unlink_12");
		return this;
	}
	public NewAutoTowingAgencyPage clickMatters(WebDriver driver)  {
		BrowserActions.click(driver, btnMatters,"Matters");
		return this;
	}
	public NewAutoTowingAgencyPage enterAddress3_23(WebDriver driver,String Address3_23) {
		BrowserActions.type(driver, inpAddress3_23,Address3_23, "Address3_23");
		return this;
	}
	public NewAutoTowingAgencyPage clickUpdate_36(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_36,"Update_36");
		return this;
	}
	public NewAutoTowingAgencyPage enterWork(WebDriver driver,String Work) {
		BrowserActions.type(driver, inpWork,Work, "Work");
		return this;
	}
	public NewAutoTowingAgencyPage enterReviewScore(WebDriver driver,String ReviewScore) {
		BrowserActions.type(driver, inpReviewScore,ReviewScore, "ReviewScore");
		return this;
	}
	public NewAutoTowingAgencyPage clickValiduntilDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
		return this;
	}
	public NewAutoTowingAgencyPage selectAddressBookContactExposuresFilterSet_49(WebDriver driver,String AddressBookContactExposuresFilterSet_49)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressBookContactExposuresFilterSet_49,AddressBookContactExposuresFilterSet_49,"AddressBookContactExposuresFilterSet_49");
		return this;
	}
	public NewAutoTowingAgencyPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewAutoTowingAgencyPage clickCopyfromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyfromAddressBook,"CopyfromAddressBook");
		return this;
	}
	public NewAutoTowingAgencyPage clickShowActivitiesButton(WebDriver driver)  {
		BrowserActions.click(driver, btnShowActivitiesButton,"ShowActivitiesButton");
		return this;
	}
	public NewAutoTowingAgencyPage enterZIPCode_28(WebDriver driver,String ZIPCode_28) {
		BrowserActions.type(driver, inpZIPCode_28,ZIPCode_28, "ZIPCode_28");
		return this;
	}
	public NewAutoTowingAgencyPage enterMainEmail(WebDriver driver,String MainEmail) {
		BrowserActions.type(driver, inpMainEmail,MainEmail, "MainEmail");
		return this;
	}
	public NewAutoTowingAgencyPage clickAutoFillIcon_25(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_25,"AutoFillIcon_25");
		return this;
	}
	public NewAutoTowingAgencyPage enterCounty_26(WebDriver driver,String County_26) {
		BrowserActions.type(driver, inpCounty_26,County_26, "County_26");
		return this;
	}
	public NewAutoTowingAgencyPage enterLocationDescription_31(WebDriver driver,String LocationDescription_31) {
		BrowserActions.type(driver, inpLocationDescription_31,LocationDescription_31, "LocationDescription_31");
		return this;
	}
	public NewAutoTowingAgencyPage clickUnlink(WebDriver driver)  {
		BrowserActions.click(driver, btnUnlink,"Unlink");
		return this;
	}
	public NewAutoTowingAgencyPage clickAutoFillIcon_29(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_29,"AutoFillIcon_29");
		return this;
	}
	public boolean checkDuplicateContactIsThere(WebDriver driver)  {
		return BrowserActions.waitForElementToDisplay(driver, btnDuplicateContactCancel, 1);
	}
	public NewAutoTowingAgencyPage clickCancelButton(WebDriver driver)  {
		BrowserActions.click(driver, btnDuplicateContactCancel,"cancel Button");
		return this;
	}
}
