package com.dxc.application.web.api.model;

import java.util.Objects;
import com.dxc.application.web.api.model.RequestContactRelationship;
import com.dxc.application.web.api.model.RequestPersonPrivacy;
import com.dxc.application.web.api.model.RequestPersonQualificationSuffix;
import com.dxc.application.web.api.model.RequestPersonQualificationSuffixAssociation;
import com.dxc.application.web.api.model.RequestPersonSocialMedia;
import com.dxc.application.web.api.model.RequestPersonUri;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPerson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestPerson   {
  @JsonProperty("systemName")
  private String systemName = null;

  @JsonProperty("systemUniqueID")
  private String systemUniqueID = null;

  @JsonProperty("collectionSystemName")
  private String collectionSystemName = null;

  @JsonProperty("mdmContactID")
  private String mdmContactID = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("familyName")
  private String familyName = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("secondName")
  private String secondName = null;

  @JsonProperty("salutationPrefix")
  private String salutationPrefix = null;

  @JsonProperty("generationSuffix")
  private String generationSuffix = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    M("M"),
    
    F("F");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("nicknameFamilyName")
  private String nicknameFamilyName = null;

  @JsonProperty("nicknameFirstName")
  private String nicknameFirstName = null;

  @JsonProperty("nicknameSecondName")
  private String nicknameSecondName = null;

  @JsonProperty("phoneticFamilyName")
  private String phoneticFamilyName = null;

  @JsonProperty("phoneticFirstName")
  private String phoneticFirstName = null;

  @JsonProperty("phoneticSecondName")
  private String phoneticSecondName = null;

  @JsonProperty("localFamilyName")
  private String localFamilyName = null;

  @JsonProperty("localFirstName")
  private String localFirstName = null;

  @JsonProperty("localSecondName")
  private String localSecondName = null;

  @JsonProperty("partyId")
  private String partyId = null;

  @JsonProperty("companyDunsID")
  private String companyDunsID = null;

  @JsonProperty("companyOrganizationID")
  private String companyOrganizationID = null;

  @JsonProperty("companySiteID")
  private String companySiteID = null;

  @JsonProperty("companyOpsiID")
  private String companyOpsiID = null;

  @JsonProperty("businessEmailAddress")
  private String businessEmailAddress = null;

  @JsonProperty("businessTelephoneNumber")
  private String businessTelephoneNumber = null;

  @JsonProperty("businessTelephoneExtensionNumber")
  private String businessTelephoneExtensionNumber = null;

  @JsonProperty("businessTelephoneCountryCode")
  private String businessTelephoneCountryCode = null;

  @JsonProperty("businessTelephoneCityCode")
  private String businessTelephoneCityCode = null;

  @JsonProperty("businessMobileNumber")
  private String businessMobileNumber = null;

  @JsonProperty("businessMobileCountryCode")
  private String businessMobileCountryCode = null;

  @JsonProperty("businessMobileCityCode")
  private String businessMobileCityCode = null;

  @JsonProperty("businessFaxNumber")
  private String businessFaxNumber = null;

  @JsonProperty("businessFaxExtensionNumber")
  private String businessFaxExtensionNumber = null;

  @JsonProperty("businessFaxCountryCode")
  private String businessFaxCountryCode = null;

  @JsonProperty("businessFaxCityCode")
  private String businessFaxCityCode = null;

  @JsonProperty("businessAddressCompanyName")
  private String businessAddressCompanyName = null;

  @JsonProperty("businessAddressLine1")
  private String businessAddressLine1 = null;

  @JsonProperty("businessAddressLine2")
  private String businessAddressLine2 = null;

  @JsonProperty("businessAddressLine3")
  private String businessAddressLine3 = null;

  @JsonProperty("businessAddressCityName")
  private String businessAddressCityName = null;

  @JsonProperty("businessAddressCityDistrict")
  private String businessAddressCityDistrict = null;

  @JsonProperty("businessAddressStateProvinceName")
  private String businessAddressStateProvinceName = null;

  @JsonProperty("businessAddressPostalCode")
  private String businessAddressPostalCode = null;

  @JsonProperty("businessAddressPostalCodeExtension")
  private String businessAddressPostalCodeExtension = null;

  @JsonProperty("businessAddressCountryCode")
  private String businessAddressCountryCode = null;

  /**
   * Gets or Sets multibyteInd
   */
  public enum MultibyteIndEnum {
    N("N"),
    
    Y("Y");

    private String value;

    MultibyteIndEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MultibyteIndEnum fromValue(String text) {
      for (MultibyteIndEnum b : MultibyteIndEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("multibyteInd")
  private MultibyteIndEnum multibyteInd = MultibyteIndEnum.N;

  @JsonProperty("ContactRelationship")
  private RequestContactRelationship contactRelationship = null;

  @JsonProperty("PersonPrivacy")
  private RequestPersonPrivacy personPrivacy = null;

  @JsonProperty("PersonQualificationSuffix")
  private RequestPersonQualificationSuffix personQualificationSuffix = null;

  @JsonProperty("PersonQualificationSuffixAssociation")
  private RequestPersonQualificationSuffixAssociation personQualificationSuffixAssociation = null;

  @JsonProperty("PersonSocialMedia")
  private RequestPersonSocialMedia personSocialMedia = null;

  @JsonProperty("PersonUri")
  private RequestPersonUri personUri = null;

  public RequestPerson systemName(String systemName) {
    this.systemName = systemName;
    return this;
  }

   /**
   * Get systemName
   * @return systemName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=60)
  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public RequestPerson systemUniqueID(String systemUniqueID) {
    this.systemUniqueID = systemUniqueID;
    return this;
  }

   /**
   * Get systemUniqueID
   * @return systemUniqueID
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=100)
  public String getSystemUniqueID() {
    return systemUniqueID;
  }

  public void setSystemUniqueID(String systemUniqueID) {
    this.systemUniqueID = systemUniqueID;
  }

  public RequestPerson collectionSystemName(String collectionSystemName) {
    this.collectionSystemName = collectionSystemName;
    return this;
  }

   /**
   * Get collectionSystemName
   * @return collectionSystemName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=60)
  public String getCollectionSystemName() {
    return collectionSystemName;
  }

  public void setCollectionSystemName(String collectionSystemName) {
    this.collectionSystemName = collectionSystemName;
  }

  public RequestPerson mdmContactID(String mdmContactID) {
    this.mdmContactID = mdmContactID;
    return this;
  }

   /**
   * Get mdmContactID
   * @return mdmContactID
  **/
  @ApiModelProperty(value = "")

 @Size(max=14)
  public String getMdmContactID() {
    return mdmContactID;
  }

  public void setMdmContactID(String mdmContactID) {
    this.mdmContactID = mdmContactID;
  }

  public RequestPerson countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=2)
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RequestPerson languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=2)
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public RequestPerson familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=50)
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public RequestPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public RequestPerson secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

   /**
   * Get secondName
   * @return secondName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public RequestPerson salutationPrefix(String salutationPrefix) {
    this.salutationPrefix = salutationPrefix;
    return this;
  }

   /**
   * Get salutationPrefix
   * @return salutationPrefix
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getSalutationPrefix() {
    return salutationPrefix;
  }

  public void setSalutationPrefix(String salutationPrefix) {
    this.salutationPrefix = salutationPrefix;
  }

  public RequestPerson generationSuffix(String generationSuffix) {
    this.generationSuffix = generationSuffix;
    return this;
  }

   /**
   * Get generationSuffix
   * @return generationSuffix
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getGenerationSuffix() {
    return generationSuffix;
  }

  public void setGenerationSuffix(String generationSuffix) {
    this.generationSuffix = generationSuffix;
  }

  public RequestPerson gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public RequestPerson nicknameFamilyName(String nicknameFamilyName) {
    this.nicknameFamilyName = nicknameFamilyName;
    return this;
  }

   /**
   * Get nicknameFamilyName
   * @return nicknameFamilyName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getNicknameFamilyName() {
    return nicknameFamilyName;
  }

  public void setNicknameFamilyName(String nicknameFamilyName) {
    this.nicknameFamilyName = nicknameFamilyName;
  }

  public RequestPerson nicknameFirstName(String nicknameFirstName) {
    this.nicknameFirstName = nicknameFirstName;
    return this;
  }

   /**
   * Get nicknameFirstName
   * @return nicknameFirstName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getNicknameFirstName() {
    return nicknameFirstName;
  }

  public void setNicknameFirstName(String nicknameFirstName) {
    this.nicknameFirstName = nicknameFirstName;
  }

  public RequestPerson nicknameSecondName(String nicknameSecondName) {
    this.nicknameSecondName = nicknameSecondName;
    return this;
  }

   /**
   * Get nicknameSecondName
   * @return nicknameSecondName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getNicknameSecondName() {
    return nicknameSecondName;
  }

  public void setNicknameSecondName(String nicknameSecondName) {
    this.nicknameSecondName = nicknameSecondName;
  }

  public RequestPerson phoneticFamilyName(String phoneticFamilyName) {
    this.phoneticFamilyName = phoneticFamilyName;
    return this;
  }

   /**
   * Get phoneticFamilyName
   * @return phoneticFamilyName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getPhoneticFamilyName() {
    return phoneticFamilyName;
  }

  public void setPhoneticFamilyName(String phoneticFamilyName) {
    this.phoneticFamilyName = phoneticFamilyName;
  }

  public RequestPerson phoneticFirstName(String phoneticFirstName) {
    this.phoneticFirstName = phoneticFirstName;
    return this;
  }

   /**
   * Get phoneticFirstName
   * @return phoneticFirstName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getPhoneticFirstName() {
    return phoneticFirstName;
  }

  public void setPhoneticFirstName(String phoneticFirstName) {
    this.phoneticFirstName = phoneticFirstName;
  }

  public RequestPerson phoneticSecondName(String phoneticSecondName) {
    this.phoneticSecondName = phoneticSecondName;
    return this;
  }

   /**
   * Get phoneticSecondName
   * @return phoneticSecondName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getPhoneticSecondName() {
    return phoneticSecondName;
  }

  public void setPhoneticSecondName(String phoneticSecondName) {
    this.phoneticSecondName = phoneticSecondName;
  }

  public RequestPerson localFamilyName(String localFamilyName) {
    this.localFamilyName = localFamilyName;
    return this;
  }

   /**
   * Get localFamilyName
   * @return localFamilyName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getLocalFamilyName() {
    return localFamilyName;
  }

  public void setLocalFamilyName(String localFamilyName) {
    this.localFamilyName = localFamilyName;
  }

  public RequestPerson localFirstName(String localFirstName) {
    this.localFirstName = localFirstName;
    return this;
  }

   /**
   * Get localFirstName
   * @return localFirstName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getLocalFirstName() {
    return localFirstName;
  }

  public void setLocalFirstName(String localFirstName) {
    this.localFirstName = localFirstName;
  }

  public RequestPerson localSecondName(String localSecondName) {
    this.localSecondName = localSecondName;
    return this;
  }

   /**
   * Get localSecondName
   * @return localSecondName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getLocalSecondName() {
    return localSecondName;
  }

  public void setLocalSecondName(String localSecondName) {
    this.localSecondName = localSecondName;
  }

  public RequestPerson partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

   /**
   * Get partyId
   * @return partyId
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public RequestPerson companyDunsID(String companyDunsID) {
    this.companyDunsID = companyDunsID;
    return this;
  }

   /**
   * Get companyDunsID
   * @return companyDunsID
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getCompanyDunsID() {
    return companyDunsID;
  }

  public void setCompanyDunsID(String companyDunsID) {
    this.companyDunsID = companyDunsID;
  }

  public RequestPerson companyOrganizationID(String companyOrganizationID) {
    this.companyOrganizationID = companyOrganizationID;
    return this;
  }

   /**
   * Get companyOrganizationID
   * @return companyOrganizationID
  **/
  @ApiModelProperty(value = "")

 @Size(max=14)
  public String getCompanyOrganizationID() {
    return companyOrganizationID;
  }

  public void setCompanyOrganizationID(String companyOrganizationID) {
    this.companyOrganizationID = companyOrganizationID;
  }

  public RequestPerson companySiteID(String companySiteID) {
    this.companySiteID = companySiteID;
    return this;
  }

   /**
   * Get companySiteID
   * @return companySiteID
  **/
  @ApiModelProperty(value = "")

 @Size(max=14)
  public String getCompanySiteID() {
    return companySiteID;
  }

  public void setCompanySiteID(String companySiteID) {
    this.companySiteID = companySiteID;
  }

  public RequestPerson companyOpsiID(String companyOpsiID) {
    this.companyOpsiID = companyOpsiID;
    return this;
  }

   /**
   * Get companyOpsiID
   * @return companyOpsiID
  **/
  @ApiModelProperty(value = "")

 @Size(max=14)
  public String getCompanyOpsiID() {
    return companyOpsiID;
  }

  public void setCompanyOpsiID(String companyOpsiID) {
    this.companyOpsiID = companyOpsiID;
  }

  public RequestPerson businessEmailAddress(String businessEmailAddress) {
    this.businessEmailAddress = businessEmailAddress;
    return this;
  }

   /**
   * Get businessEmailAddress
   * @return businessEmailAddress
  **/
  @ApiModelProperty(value = "")

 @Size(max=200)
  public String getBusinessEmailAddress() {
    return businessEmailAddress;
  }

  public void setBusinessEmailAddress(String businessEmailAddress) {
    this.businessEmailAddress = businessEmailAddress;
  }

  public RequestPerson businessTelephoneNumber(String businessTelephoneNumber) {
    this.businessTelephoneNumber = businessTelephoneNumber;
    return this;
  }

   /**
   * Get businessTelephoneNumber
   * @return businessTelephoneNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=200)
  public String getBusinessTelephoneNumber() {
    return businessTelephoneNumber;
  }

  public void setBusinessTelephoneNumber(String businessTelephoneNumber) {
    this.businessTelephoneNumber = businessTelephoneNumber;
  }

  public RequestPerson businessTelephoneExtensionNumber(String businessTelephoneExtensionNumber) {
    this.businessTelephoneExtensionNumber = businessTelephoneExtensionNumber;
    return this;
  }

   /**
   * Get businessTelephoneExtensionNumber
   * @return businessTelephoneExtensionNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=200)
  public String getBusinessTelephoneExtensionNumber() {
    return businessTelephoneExtensionNumber;
  }

  public void setBusinessTelephoneExtensionNumber(String businessTelephoneExtensionNumber) {
    this.businessTelephoneExtensionNumber = businessTelephoneExtensionNumber;
  }

  public RequestPerson businessTelephoneCountryCode(String businessTelephoneCountryCode) {
    this.businessTelephoneCountryCode = businessTelephoneCountryCode;
    return this;
  }

   /**
   * Get businessTelephoneCountryCode
   * @return businessTelephoneCountryCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=2)
  public String getBusinessTelephoneCountryCode() {
    return businessTelephoneCountryCode;
  }

  public void setBusinessTelephoneCountryCode(String businessTelephoneCountryCode) {
    this.businessTelephoneCountryCode = businessTelephoneCountryCode;
  }

  public RequestPerson businessTelephoneCityCode(String businessTelephoneCityCode) {
    this.businessTelephoneCityCode = businessTelephoneCityCode;
    return this;
  }

   /**
   * Get businessTelephoneCityCode
   * @return businessTelephoneCityCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getBusinessTelephoneCityCode() {
    return businessTelephoneCityCode;
  }

  public void setBusinessTelephoneCityCode(String businessTelephoneCityCode) {
    this.businessTelephoneCityCode = businessTelephoneCityCode;
  }

  public RequestPerson businessMobileNumber(String businessMobileNumber) {
    this.businessMobileNumber = businessMobileNumber;
    return this;
  }

   /**
   * Get businessMobileNumber
   * @return businessMobileNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=200)
  public String getBusinessMobileNumber() {
    return businessMobileNumber;
  }

  public void setBusinessMobileNumber(String businessMobileNumber) {
    this.businessMobileNumber = businessMobileNumber;
  }

  public RequestPerson businessMobileCountryCode(String businessMobileCountryCode) {
    this.businessMobileCountryCode = businessMobileCountryCode;
    return this;
  }

   /**
   * Get businessMobileCountryCode
   * @return businessMobileCountryCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=2)
  public String getBusinessMobileCountryCode() {
    return businessMobileCountryCode;
  }

  public void setBusinessMobileCountryCode(String businessMobileCountryCode) {
    this.businessMobileCountryCode = businessMobileCountryCode;
  }

  public RequestPerson businessMobileCityCode(String businessMobileCityCode) {
    this.businessMobileCityCode = businessMobileCityCode;
    return this;
  }

   /**
   * Get businessMobileCityCode
   * @return businessMobileCityCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getBusinessMobileCityCode() {
    return businessMobileCityCode;
  }

  public void setBusinessMobileCityCode(String businessMobileCityCode) {
    this.businessMobileCityCode = businessMobileCityCode;
  }

  public RequestPerson businessFaxNumber(String businessFaxNumber) {
    this.businessFaxNumber = businessFaxNumber;
    return this;
  }

   /**
   * Get businessFaxNumber
   * @return businessFaxNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=200)
  public String getBusinessFaxNumber() {
    return businessFaxNumber;
  }

  public void setBusinessFaxNumber(String businessFaxNumber) {
    this.businessFaxNumber = businessFaxNumber;
  }

  public RequestPerson businessFaxExtensionNumber(String businessFaxExtensionNumber) {
    this.businessFaxExtensionNumber = businessFaxExtensionNumber;
    return this;
  }

   /**
   * Get businessFaxExtensionNumber
   * @return businessFaxExtensionNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getBusinessFaxExtensionNumber() {
    return businessFaxExtensionNumber;
  }

  public void setBusinessFaxExtensionNumber(String businessFaxExtensionNumber) {
    this.businessFaxExtensionNumber = businessFaxExtensionNumber;
  }

  public RequestPerson businessFaxCountryCode(String businessFaxCountryCode) {
    this.businessFaxCountryCode = businessFaxCountryCode;
    return this;
  }

   /**
   * Get businessFaxCountryCode
   * @return businessFaxCountryCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=2)
  public String getBusinessFaxCountryCode() {
    return businessFaxCountryCode;
  }

  public void setBusinessFaxCountryCode(String businessFaxCountryCode) {
    this.businessFaxCountryCode = businessFaxCountryCode;
  }

  public RequestPerson businessFaxCityCode(String businessFaxCityCode) {
    this.businessFaxCityCode = businessFaxCityCode;
    return this;
  }

   /**
   * Get businessFaxCityCode
   * @return businessFaxCityCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getBusinessFaxCityCode() {
    return businessFaxCityCode;
  }

  public void setBusinessFaxCityCode(String businessFaxCityCode) {
    this.businessFaxCityCode = businessFaxCityCode;
  }

  public RequestPerson businessAddressCompanyName(String businessAddressCompanyName) {
    this.businessAddressCompanyName = businessAddressCompanyName;
    return this;
  }

   /**
   * Get businessAddressCompanyName
   * @return businessAddressCompanyName
  **/
  @ApiModelProperty(value = "")

 @Size(max=500)
  public String getBusinessAddressCompanyName() {
    return businessAddressCompanyName;
  }

  public void setBusinessAddressCompanyName(String businessAddressCompanyName) {
    this.businessAddressCompanyName = businessAddressCompanyName;
  }

  public RequestPerson businessAddressLine1(String businessAddressLine1) {
    this.businessAddressLine1 = businessAddressLine1;
    return this;
  }

   /**
   * Get businessAddressLine1
   * @return businessAddressLine1
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getBusinessAddressLine1() {
    return businessAddressLine1;
  }

  public void setBusinessAddressLine1(String businessAddressLine1) {
    this.businessAddressLine1 = businessAddressLine1;
  }

  public RequestPerson businessAddressLine2(String businessAddressLine2) {
    this.businessAddressLine2 = businessAddressLine2;
    return this;
  }

   /**
   * Get businessAddressLine2
   * @return businessAddressLine2
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getBusinessAddressLine2() {
    return businessAddressLine2;
  }

  public void setBusinessAddressLine2(String businessAddressLine2) {
    this.businessAddressLine2 = businessAddressLine2;
  }

  public RequestPerson businessAddressLine3(String businessAddressLine3) {
    this.businessAddressLine3 = businessAddressLine3;
    return this;
  }

   /**
   * Get businessAddressLine3
   * @return businessAddressLine3
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getBusinessAddressLine3() {
    return businessAddressLine3;
  }

  public void setBusinessAddressLine3(String businessAddressLine3) {
    this.businessAddressLine3 = businessAddressLine3;
  }

  public RequestPerson businessAddressCityName(String businessAddressCityName) {
    this.businessAddressCityName = businessAddressCityName;
    return this;
  }

   /**
   * Get businessAddressCityName
   * @return businessAddressCityName
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getBusinessAddressCityName() {
    return businessAddressCityName;
  }

  public void setBusinessAddressCityName(String businessAddressCityName) {
    this.businessAddressCityName = businessAddressCityName;
  }

  public RequestPerson businessAddressCityDistrict(String businessAddressCityDistrict) {
    this.businessAddressCityDistrict = businessAddressCityDistrict;
    return this;
  }

   /**
   * Get businessAddressCityDistrict
   * @return businessAddressCityDistrict
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getBusinessAddressCityDistrict() {
    return businessAddressCityDistrict;
  }

  public void setBusinessAddressCityDistrict(String businessAddressCityDistrict) {
    this.businessAddressCityDistrict = businessAddressCityDistrict;
  }

  public RequestPerson businessAddressStateProvinceName(String businessAddressStateProvinceName) {
    this.businessAddressStateProvinceName = businessAddressStateProvinceName;
    return this;
  }

   /**
   * Get businessAddressStateProvinceName
   * @return businessAddressStateProvinceName
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getBusinessAddressStateProvinceName() {
    return businessAddressStateProvinceName;
  }

  public void setBusinessAddressStateProvinceName(String businessAddressStateProvinceName) {
    this.businessAddressStateProvinceName = businessAddressStateProvinceName;
  }

  public RequestPerson businessAddressPostalCode(String businessAddressPostalCode) {
    this.businessAddressPostalCode = businessAddressPostalCode;
    return this;
  }

   /**
   * Get businessAddressPostalCode
   * @return businessAddressPostalCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=10)
  public String getBusinessAddressPostalCode() {
    return businessAddressPostalCode;
  }

  public void setBusinessAddressPostalCode(String businessAddressPostalCode) {
    this.businessAddressPostalCode = businessAddressPostalCode;
  }

  public RequestPerson businessAddressPostalCodeExtension(String businessAddressPostalCodeExtension) {
    this.businessAddressPostalCodeExtension = businessAddressPostalCodeExtension;
    return this;
  }

   /**
   * Get businessAddressPostalCodeExtension
   * @return businessAddressPostalCodeExtension
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getBusinessAddressPostalCodeExtension() {
    return businessAddressPostalCodeExtension;
  }

  public void setBusinessAddressPostalCodeExtension(String businessAddressPostalCodeExtension) {
    this.businessAddressPostalCodeExtension = businessAddressPostalCodeExtension;
  }

  public RequestPerson businessAddressCountryCode(String businessAddressCountryCode) {
    this.businessAddressCountryCode = businessAddressCountryCode;
    return this;
  }

   /**
   * Get businessAddressCountryCode
   * @return businessAddressCountryCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getBusinessAddressCountryCode() {
    return businessAddressCountryCode;
  }

  public void setBusinessAddressCountryCode(String businessAddressCountryCode) {
    this.businessAddressCountryCode = businessAddressCountryCode;
  }

  public RequestPerson multibyteInd(MultibyteIndEnum multibyteInd) {
    this.multibyteInd = multibyteInd;
    return this;
  }

   /**
   * Get multibyteInd
   * @return multibyteInd
  **/
  @ApiModelProperty(value = "")


  public MultibyteIndEnum getMultibyteInd() {
    return multibyteInd;
  }

  public void setMultibyteInd(MultibyteIndEnum multibyteInd) {
    this.multibyteInd = multibyteInd;
  }

  public RequestPerson contactRelationship(RequestContactRelationship contactRelationship) {
    this.contactRelationship = contactRelationship;
    return this;
  }

   /**
   * Get contactRelationship
   * @return contactRelationship
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestContactRelationship getContactRelationship() {
    return contactRelationship;
  }

  public void setContactRelationship(RequestContactRelationship contactRelationship) {
    this.contactRelationship = contactRelationship;
  }

  public RequestPerson personPrivacy(RequestPersonPrivacy personPrivacy) {
    this.personPrivacy = personPrivacy;
    return this;
  }

   /**
   * Get personPrivacy
   * @return personPrivacy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestPersonPrivacy getPersonPrivacy() {
    return personPrivacy;
  }

  public void setPersonPrivacy(RequestPersonPrivacy personPrivacy) {
    this.personPrivacy = personPrivacy;
  }

  public RequestPerson personQualificationSuffix(RequestPersonQualificationSuffix personQualificationSuffix) {
    this.personQualificationSuffix = personQualificationSuffix;
    return this;
  }

   /**
   * Get personQualificationSuffix
   * @return personQualificationSuffix
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestPersonQualificationSuffix getPersonQualificationSuffix() {
    return personQualificationSuffix;
  }

  public void setPersonQualificationSuffix(RequestPersonQualificationSuffix personQualificationSuffix) {
    this.personQualificationSuffix = personQualificationSuffix;
  }

  public RequestPerson personQualificationSuffixAssociation(RequestPersonQualificationSuffixAssociation personQualificationSuffixAssociation) {
    this.personQualificationSuffixAssociation = personQualificationSuffixAssociation;
    return this;
  }

   /**
   * Get personQualificationSuffixAssociation
   * @return personQualificationSuffixAssociation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestPersonQualificationSuffixAssociation getPersonQualificationSuffixAssociation() {
    return personQualificationSuffixAssociation;
  }

  public void setPersonQualificationSuffixAssociation(RequestPersonQualificationSuffixAssociation personQualificationSuffixAssociation) {
    this.personQualificationSuffixAssociation = personQualificationSuffixAssociation;
  }

  public RequestPerson personSocialMedia(RequestPersonSocialMedia personSocialMedia) {
    this.personSocialMedia = personSocialMedia;
    return this;
  }

   /**
   * Get personSocialMedia
   * @return personSocialMedia
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestPersonSocialMedia getPersonSocialMedia() {
    return personSocialMedia;
  }

  public void setPersonSocialMedia(RequestPersonSocialMedia personSocialMedia) {
    this.personSocialMedia = personSocialMedia;
  }

  public RequestPerson personUri(RequestPersonUri personUri) {
    this.personUri = personUri;
    return this;
  }

   /**
   * Get personUri
   * @return personUri
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestPersonUri getPersonUri() {
    return personUri;
  }

  public void setPersonUri(RequestPersonUri personUri) {
    this.personUri = personUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPerson requestPerson = (RequestPerson) o;
    return Objects.equals(this.systemName, requestPerson.systemName) &&
        Objects.equals(this.systemUniqueID, requestPerson.systemUniqueID) &&
        Objects.equals(this.collectionSystemName, requestPerson.collectionSystemName) &&
        Objects.equals(this.mdmContactID, requestPerson.mdmContactID) &&
        Objects.equals(this.countryCode, requestPerson.countryCode) &&
        Objects.equals(this.languageCode, requestPerson.languageCode) &&
        Objects.equals(this.familyName, requestPerson.familyName) &&
        Objects.equals(this.firstName, requestPerson.firstName) &&
        Objects.equals(this.secondName, requestPerson.secondName) &&
        Objects.equals(this.salutationPrefix, requestPerson.salutationPrefix) &&
        Objects.equals(this.generationSuffix, requestPerson.generationSuffix) &&
        Objects.equals(this.gender, requestPerson.gender) &&
        Objects.equals(this.nicknameFamilyName, requestPerson.nicknameFamilyName) &&
        Objects.equals(this.nicknameFirstName, requestPerson.nicknameFirstName) &&
        Objects.equals(this.nicknameSecondName, requestPerson.nicknameSecondName) &&
        Objects.equals(this.phoneticFamilyName, requestPerson.phoneticFamilyName) &&
        Objects.equals(this.phoneticFirstName, requestPerson.phoneticFirstName) &&
        Objects.equals(this.phoneticSecondName, requestPerson.phoneticSecondName) &&
        Objects.equals(this.localFamilyName, requestPerson.localFamilyName) &&
        Objects.equals(this.localFirstName, requestPerson.localFirstName) &&
        Objects.equals(this.localSecondName, requestPerson.localSecondName) &&
        Objects.equals(this.partyId, requestPerson.partyId) &&
        Objects.equals(this.companyDunsID, requestPerson.companyDunsID) &&
        Objects.equals(this.companyOrganizationID, requestPerson.companyOrganizationID) &&
        Objects.equals(this.companySiteID, requestPerson.companySiteID) &&
        Objects.equals(this.companyOpsiID, requestPerson.companyOpsiID) &&
        Objects.equals(this.businessEmailAddress, requestPerson.businessEmailAddress) &&
        Objects.equals(this.businessTelephoneNumber, requestPerson.businessTelephoneNumber) &&
        Objects.equals(this.businessTelephoneExtensionNumber, requestPerson.businessTelephoneExtensionNumber) &&
        Objects.equals(this.businessTelephoneCountryCode, requestPerson.businessTelephoneCountryCode) &&
        Objects.equals(this.businessTelephoneCityCode, requestPerson.businessTelephoneCityCode) &&
        Objects.equals(this.businessMobileNumber, requestPerson.businessMobileNumber) &&
        Objects.equals(this.businessMobileCountryCode, requestPerson.businessMobileCountryCode) &&
        Objects.equals(this.businessMobileCityCode, requestPerson.businessMobileCityCode) &&
        Objects.equals(this.businessFaxNumber, requestPerson.businessFaxNumber) &&
        Objects.equals(this.businessFaxExtensionNumber, requestPerson.businessFaxExtensionNumber) &&
        Objects.equals(this.businessFaxCountryCode, requestPerson.businessFaxCountryCode) &&
        Objects.equals(this.businessFaxCityCode, requestPerson.businessFaxCityCode) &&
        Objects.equals(this.businessAddressCompanyName, requestPerson.businessAddressCompanyName) &&
        Objects.equals(this.businessAddressLine1, requestPerson.businessAddressLine1) &&
        Objects.equals(this.businessAddressLine2, requestPerson.businessAddressLine2) &&
        Objects.equals(this.businessAddressLine3, requestPerson.businessAddressLine3) &&
        Objects.equals(this.businessAddressCityName, requestPerson.businessAddressCityName) &&
        Objects.equals(this.businessAddressCityDistrict, requestPerson.businessAddressCityDistrict) &&
        Objects.equals(this.businessAddressStateProvinceName, requestPerson.businessAddressStateProvinceName) &&
        Objects.equals(this.businessAddressPostalCode, requestPerson.businessAddressPostalCode) &&
        Objects.equals(this.businessAddressPostalCodeExtension, requestPerson.businessAddressPostalCodeExtension) &&
        Objects.equals(this.businessAddressCountryCode, requestPerson.businessAddressCountryCode) &&
        Objects.equals(this.multibyteInd, requestPerson.multibyteInd) &&
        Objects.equals(this.contactRelationship, requestPerson.contactRelationship) &&
        Objects.equals(this.personPrivacy, requestPerson.personPrivacy) &&
        Objects.equals(this.personQualificationSuffix, requestPerson.personQualificationSuffix) &&
        Objects.equals(this.personQualificationSuffixAssociation, requestPerson.personQualificationSuffixAssociation) &&
        Objects.equals(this.personSocialMedia, requestPerson.personSocialMedia) &&
        Objects.equals(this.personUri, requestPerson.personUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemName, systemUniqueID, collectionSystemName, mdmContactID, countryCode, languageCode, familyName, firstName, secondName, salutationPrefix, generationSuffix, gender, nicknameFamilyName, nicknameFirstName, nicknameSecondName, phoneticFamilyName, phoneticFirstName, phoneticSecondName, localFamilyName, localFirstName, localSecondName, partyId, companyDunsID, companyOrganizationID, companySiteID, companyOpsiID, businessEmailAddress, businessTelephoneNumber, businessTelephoneExtensionNumber, businessTelephoneCountryCode, businessTelephoneCityCode, businessMobileNumber, businessMobileCountryCode, businessMobileCityCode, businessFaxNumber, businessFaxExtensionNumber, businessFaxCountryCode, businessFaxCityCode, businessAddressCompanyName, businessAddressLine1, businessAddressLine2, businessAddressLine3, businessAddressCityName, businessAddressCityDistrict, businessAddressStateProvinceName, businessAddressPostalCode, businessAddressPostalCodeExtension, businessAddressCountryCode, multibyteInd, contactRelationship, personPrivacy, personQualificationSuffix, personQualificationSuffixAssociation, personSocialMedia, personUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPerson {\n");
    
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    systemUniqueID: ").append(toIndentedString(systemUniqueID)).append("\n");
    sb.append("    collectionSystemName: ").append(toIndentedString(collectionSystemName)).append("\n");
    sb.append("    mdmContactID: ").append(toIndentedString(mdmContactID)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    salutationPrefix: ").append(toIndentedString(salutationPrefix)).append("\n");
    sb.append("    generationSuffix: ").append(toIndentedString(generationSuffix)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    nicknameFamilyName: ").append(toIndentedString(nicknameFamilyName)).append("\n");
    sb.append("    nicknameFirstName: ").append(toIndentedString(nicknameFirstName)).append("\n");
    sb.append("    nicknameSecondName: ").append(toIndentedString(nicknameSecondName)).append("\n");
    sb.append("    phoneticFamilyName: ").append(toIndentedString(phoneticFamilyName)).append("\n");
    sb.append("    phoneticFirstName: ").append(toIndentedString(phoneticFirstName)).append("\n");
    sb.append("    phoneticSecondName: ").append(toIndentedString(phoneticSecondName)).append("\n");
    sb.append("    localFamilyName: ").append(toIndentedString(localFamilyName)).append("\n");
    sb.append("    localFirstName: ").append(toIndentedString(localFirstName)).append("\n");
    sb.append("    localSecondName: ").append(toIndentedString(localSecondName)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    companyDunsID: ").append(toIndentedString(companyDunsID)).append("\n");
    sb.append("    companyOrganizationID: ").append(toIndentedString(companyOrganizationID)).append("\n");
    sb.append("    companySiteID: ").append(toIndentedString(companySiteID)).append("\n");
    sb.append("    companyOpsiID: ").append(toIndentedString(companyOpsiID)).append("\n");
    sb.append("    businessEmailAddress: ").append(toIndentedString(businessEmailAddress)).append("\n");
    sb.append("    businessTelephoneNumber: ").append(toIndentedString(businessTelephoneNumber)).append("\n");
    sb.append("    businessTelephoneExtensionNumber: ").append(toIndentedString(businessTelephoneExtensionNumber)).append("\n");
    sb.append("    businessTelephoneCountryCode: ").append(toIndentedString(businessTelephoneCountryCode)).append("\n");
    sb.append("    businessTelephoneCityCode: ").append(toIndentedString(businessTelephoneCityCode)).append("\n");
    sb.append("    businessMobileNumber: ").append(toIndentedString(businessMobileNumber)).append("\n");
    sb.append("    businessMobileCountryCode: ").append(toIndentedString(businessMobileCountryCode)).append("\n");
    sb.append("    businessMobileCityCode: ").append(toIndentedString(businessMobileCityCode)).append("\n");
    sb.append("    businessFaxNumber: ").append(toIndentedString(businessFaxNumber)).append("\n");
    sb.append("    businessFaxExtensionNumber: ").append(toIndentedString(businessFaxExtensionNumber)).append("\n");
    sb.append("    businessFaxCountryCode: ").append(toIndentedString(businessFaxCountryCode)).append("\n");
    sb.append("    businessFaxCityCode: ").append(toIndentedString(businessFaxCityCode)).append("\n");
    sb.append("    businessAddressCompanyName: ").append(toIndentedString(businessAddressCompanyName)).append("\n");
    sb.append("    businessAddressLine1: ").append(toIndentedString(businessAddressLine1)).append("\n");
    sb.append("    businessAddressLine2: ").append(toIndentedString(businessAddressLine2)).append("\n");
    sb.append("    businessAddressLine3: ").append(toIndentedString(businessAddressLine3)).append("\n");
    sb.append("    businessAddressCityName: ").append(toIndentedString(businessAddressCityName)).append("\n");
    sb.append("    businessAddressCityDistrict: ").append(toIndentedString(businessAddressCityDistrict)).append("\n");
    sb.append("    businessAddressStateProvinceName: ").append(toIndentedString(businessAddressStateProvinceName)).append("\n");
    sb.append("    businessAddressPostalCode: ").append(toIndentedString(businessAddressPostalCode)).append("\n");
    sb.append("    businessAddressPostalCodeExtension: ").append(toIndentedString(businessAddressPostalCodeExtension)).append("\n");
    sb.append("    businessAddressCountryCode: ").append(toIndentedString(businessAddressCountryCode)).append("\n");
    sb.append("    multibyteInd: ").append(toIndentedString(multibyteInd)).append("\n");
    sb.append("    contactRelationship: ").append(toIndentedString(contactRelationship)).append("\n");
    sb.append("    personPrivacy: ").append(toIndentedString(personPrivacy)).append("\n");
    sb.append("    personQualificationSuffix: ").append(toIndentedString(personQualificationSuffix)).append("\n");
    sb.append("    personQualificationSuffixAssociation: ").append(toIndentedString(personQualificationSuffixAssociation)).append("\n");
    sb.append("    personSocialMedia: ").append(toIndentedString(personSocialMedia)).append("\n");
    sb.append("    personUri: ").append(toIndentedString(personUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

