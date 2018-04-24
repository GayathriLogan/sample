package com.dxc.application.web.api.model;

import java.util.Objects;
import com.dxc.application.web.api.model.ResponseAddress;
import com.dxc.application.web.api.model.ResponseAssociationDuns;
import com.dxc.application.web.api.model.ResponseAssociationOpsi;
import com.dxc.application.web.api.model.ResponseAssociationOrganization;
import com.dxc.application.web.api.model.ResponseAssociationParty;
import com.dxc.application.web.api.model.ResponseAssociationSite;
import com.dxc.application.web.api.model.ResponseContactRelationship;
import com.dxc.application.web.api.model.ResponseDemographicAssignment;
import com.dxc.application.web.api.model.ResponseEmail;
import com.dxc.application.web.api.model.ResponsePrivacyContactMedium;
import com.dxc.application.web.api.model.ResponsePrivacyIsolation;
import com.dxc.application.web.api.model.ResponseQualificationSuffix;
import com.dxc.application.web.api.model.ResponseSocialMedia;
import com.dxc.application.web.api.model.ResponseTelephone;
import com.dxc.application.web.api.model.ResponseUri;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponsePerson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponsePerson   {
  @JsonProperty("mdmContactID")
  private String mdmContactID = null;

  @JsonProperty("preferredCountryCode")
  private String preferredCountryCode = null;

  @JsonProperty("preferredLanguageCode")
  private String preferredLanguageCode = null;

  @JsonProperty("preferredLanguageCharacterScript")
  private String preferredLanguageCharacterScript = null;

  @JsonProperty("familyName")
  private String familyName = null;

  @JsonProperty("firstGivenName")
  private String firstGivenName = null;

  @JsonProperty("secondGivenName")
  private String secondGivenName = null;

  @JsonProperty("salutationPrefix")
  private String salutationPrefix = null;

  @JsonProperty("generationSuffix")
  private String generationSuffix = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("nicknameFamilyName")
  private String nicknameFamilyName = null;

  @JsonProperty("nicknameFirstGivenName")
  private String nicknameFirstGivenName = null;

  @JsonProperty("nicknameSecondGivenName")
  private String nicknameSecondGivenName = null;

  @JsonProperty("phoneticFamilyName")
  private String phoneticFamilyName = null;

  @JsonProperty("phoneticFirstGivenName")
  private String phoneticFirstGivenName = null;

  @JsonProperty("phoneticSecondGivenName")
  private String phoneticSecondGivenName = null;

  @JsonProperty("localFamilyName")
  private String localFamilyName = null;

  @JsonProperty("localFirsGiventName")
  private String localFirsGiventName = null;

  @JsonProperty("localSecondGivenName")
  private String localSecondGivenName = null;

  @JsonProperty("AssociationDuns")
  private ResponseAssociationDuns associationDuns = null;

  @JsonProperty("AssociationParty")
  private ResponseAssociationParty associationParty = null;

  @JsonProperty("Email")
  private ResponseEmail email = null;

  @JsonProperty("Telephone")
  private ResponseTelephone telephone = null;

  @JsonProperty("Address")
  private ResponseAddress address = null;

  @JsonProperty("AssociationOrganization")
  private ResponseAssociationOrganization associationOrganization = null;

  @JsonProperty("AssociationSite")
  private ResponseAssociationSite associationSite = null;

  @JsonProperty("AssociationOpsi")
  private ResponseAssociationOpsi associationOpsi = null;

  @JsonProperty("QualificationSuffix")
  private ResponseQualificationSuffix qualificationSuffix = null;

  @JsonProperty("ContactRelationship")
  private ResponseContactRelationship contactRelationship = null;

  @JsonProperty("PrivacyContactMedium")
  private ResponsePrivacyContactMedium privacyContactMedium = null;

  @JsonProperty("PrivacyIsolation")
  private ResponsePrivacyIsolation privacyIsolation = null;

  @JsonProperty("Uri")
  private ResponseUri uri = null;

  @JsonProperty("SocialMedia")
  private ResponseSocialMedia socialMedia = null;

  @JsonProperty("DemographicAssignment")
  private ResponseDemographicAssignment demographicAssignment = null;

  public ResponsePerson mdmContactID(String mdmContactID) {
    this.mdmContactID = mdmContactID;
    return this;
  }

   /**
   * Get mdmContactID
   * @return mdmContactID
  **/
  @ApiModelProperty(value = "")


  public String getMdmContactID() {
    return mdmContactID;
  }

  public void setMdmContactID(String mdmContactID) {
    this.mdmContactID = mdmContactID;
  }

  public ResponsePerson preferredCountryCode(String preferredCountryCode) {
    this.preferredCountryCode = preferredCountryCode;
    return this;
  }

   /**
   * Get preferredCountryCode
   * @return preferredCountryCode
  **/
  @ApiModelProperty(value = "")


  public String getPreferredCountryCode() {
    return preferredCountryCode;
  }

  public void setPreferredCountryCode(String preferredCountryCode) {
    this.preferredCountryCode = preferredCountryCode;
  }

  public ResponsePerson preferredLanguageCode(String preferredLanguageCode) {
    this.preferredLanguageCode = preferredLanguageCode;
    return this;
  }

   /**
   * Get preferredLanguageCode
   * @return preferredLanguageCode
  **/
  @ApiModelProperty(value = "")


  public String getPreferredLanguageCode() {
    return preferredLanguageCode;
  }

  public void setPreferredLanguageCode(String preferredLanguageCode) {
    this.preferredLanguageCode = preferredLanguageCode;
  }

  public ResponsePerson preferredLanguageCharacterScript(String preferredLanguageCharacterScript) {
    this.preferredLanguageCharacterScript = preferredLanguageCharacterScript;
    return this;
  }

   /**
   * Get preferredLanguageCharacterScript
   * @return preferredLanguageCharacterScript
  **/
  @ApiModelProperty(value = "")


  public String getPreferredLanguageCharacterScript() {
    return preferredLanguageCharacterScript;
  }

  public void setPreferredLanguageCharacterScript(String preferredLanguageCharacterScript) {
    this.preferredLanguageCharacterScript = preferredLanguageCharacterScript;
  }

  public ResponsePerson familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(value = "")


  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public ResponsePerson firstGivenName(String firstGivenName) {
    this.firstGivenName = firstGivenName;
    return this;
  }

   /**
   * Get firstGivenName
   * @return firstGivenName
  **/
  @ApiModelProperty(value = "")


  public String getFirstGivenName() {
    return firstGivenName;
  }

  public void setFirstGivenName(String firstGivenName) {
    this.firstGivenName = firstGivenName;
  }

  public ResponsePerson secondGivenName(String secondGivenName) {
    this.secondGivenName = secondGivenName;
    return this;
  }

   /**
   * Get secondGivenName
   * @return secondGivenName
  **/
  @ApiModelProperty(value = "")


  public String getSecondGivenName() {
    return secondGivenName;
  }

  public void setSecondGivenName(String secondGivenName) {
    this.secondGivenName = secondGivenName;
  }

  public ResponsePerson salutationPrefix(String salutationPrefix) {
    this.salutationPrefix = salutationPrefix;
    return this;
  }

   /**
   * Get salutationPrefix
   * @return salutationPrefix
  **/
  @ApiModelProperty(value = "")


  public String getSalutationPrefix() {
    return salutationPrefix;
  }

  public void setSalutationPrefix(String salutationPrefix) {
    this.salutationPrefix = salutationPrefix;
  }

  public ResponsePerson generationSuffix(String generationSuffix) {
    this.generationSuffix = generationSuffix;
    return this;
  }

   /**
   * Get generationSuffix
   * @return generationSuffix
  **/
  @ApiModelProperty(value = "")


  public String getGenerationSuffix() {
    return generationSuffix;
  }

  public void setGenerationSuffix(String generationSuffix) {
    this.generationSuffix = generationSuffix;
  }

  public ResponsePerson gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ResponsePerson nicknameFamilyName(String nicknameFamilyName) {
    this.nicknameFamilyName = nicknameFamilyName;
    return this;
  }

   /**
   * Get nicknameFamilyName
   * @return nicknameFamilyName
  **/
  @ApiModelProperty(value = "")


  public String getNicknameFamilyName() {
    return nicknameFamilyName;
  }

  public void setNicknameFamilyName(String nicknameFamilyName) {
    this.nicknameFamilyName = nicknameFamilyName;
  }

  public ResponsePerson nicknameFirstGivenName(String nicknameFirstGivenName) {
    this.nicknameFirstGivenName = nicknameFirstGivenName;
    return this;
  }

   /**
   * Get nicknameFirstGivenName
   * @return nicknameFirstGivenName
  **/
  @ApiModelProperty(value = "")


  public String getNicknameFirstGivenName() {
    return nicknameFirstGivenName;
  }

  public void setNicknameFirstGivenName(String nicknameFirstGivenName) {
    this.nicknameFirstGivenName = nicknameFirstGivenName;
  }

  public ResponsePerson nicknameSecondGivenName(String nicknameSecondGivenName) {
    this.nicknameSecondGivenName = nicknameSecondGivenName;
    return this;
  }

   /**
   * Get nicknameSecondGivenName
   * @return nicknameSecondGivenName
  **/
  @ApiModelProperty(value = "")


  public String getNicknameSecondGivenName() {
    return nicknameSecondGivenName;
  }

  public void setNicknameSecondGivenName(String nicknameSecondGivenName) {
    this.nicknameSecondGivenName = nicknameSecondGivenName;
  }

  public ResponsePerson phoneticFamilyName(String phoneticFamilyName) {
    this.phoneticFamilyName = phoneticFamilyName;
    return this;
  }

   /**
   * Get phoneticFamilyName
   * @return phoneticFamilyName
  **/
  @ApiModelProperty(value = "")


  public String getPhoneticFamilyName() {
    return phoneticFamilyName;
  }

  public void setPhoneticFamilyName(String phoneticFamilyName) {
    this.phoneticFamilyName = phoneticFamilyName;
  }

  public ResponsePerson phoneticFirstGivenName(String phoneticFirstGivenName) {
    this.phoneticFirstGivenName = phoneticFirstGivenName;
    return this;
  }

   /**
   * Get phoneticFirstGivenName
   * @return phoneticFirstGivenName
  **/
  @ApiModelProperty(value = "")


  public String getPhoneticFirstGivenName() {
    return phoneticFirstGivenName;
  }

  public void setPhoneticFirstGivenName(String phoneticFirstGivenName) {
    this.phoneticFirstGivenName = phoneticFirstGivenName;
  }

  public ResponsePerson phoneticSecondGivenName(String phoneticSecondGivenName) {
    this.phoneticSecondGivenName = phoneticSecondGivenName;
    return this;
  }

   /**
   * Get phoneticSecondGivenName
   * @return phoneticSecondGivenName
  **/
  @ApiModelProperty(value = "")


  public String getPhoneticSecondGivenName() {
    return phoneticSecondGivenName;
  }

  public void setPhoneticSecondGivenName(String phoneticSecondGivenName) {
    this.phoneticSecondGivenName = phoneticSecondGivenName;
  }

  public ResponsePerson localFamilyName(String localFamilyName) {
    this.localFamilyName = localFamilyName;
    return this;
  }

   /**
   * Get localFamilyName
   * @return localFamilyName
  **/
  @ApiModelProperty(value = "")


  public String getLocalFamilyName() {
    return localFamilyName;
  }

  public void setLocalFamilyName(String localFamilyName) {
    this.localFamilyName = localFamilyName;
  }

  public ResponsePerson localFirsGiventName(String localFirsGiventName) {
    this.localFirsGiventName = localFirsGiventName;
    return this;
  }

   /**
   * Get localFirsGiventName
   * @return localFirsGiventName
  **/
  @ApiModelProperty(value = "")


  public String getLocalFirsGiventName() {
    return localFirsGiventName;
  }

  public void setLocalFirsGiventName(String localFirsGiventName) {
    this.localFirsGiventName = localFirsGiventName;
  }

  public ResponsePerson localSecondGivenName(String localSecondGivenName) {
    this.localSecondGivenName = localSecondGivenName;
    return this;
  }

   /**
   * Get localSecondGivenName
   * @return localSecondGivenName
  **/
  @ApiModelProperty(value = "")


  public String getLocalSecondGivenName() {
    return localSecondGivenName;
  }

  public void setLocalSecondGivenName(String localSecondGivenName) {
    this.localSecondGivenName = localSecondGivenName;
  }

  public ResponsePerson associationDuns(ResponseAssociationDuns associationDuns) {
    this.associationDuns = associationDuns;
    return this;
  }

   /**
   * Get associationDuns
   * @return associationDuns
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseAssociationDuns getAssociationDuns() {
    return associationDuns;
  }

  public void setAssociationDuns(ResponseAssociationDuns associationDuns) {
    this.associationDuns = associationDuns;
  }

  public ResponsePerson associationParty(ResponseAssociationParty associationParty) {
    this.associationParty = associationParty;
    return this;
  }

   /**
   * Get associationParty
   * @return associationParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseAssociationParty getAssociationParty() {
    return associationParty;
  }

  public void setAssociationParty(ResponseAssociationParty associationParty) {
    this.associationParty = associationParty;
  }

  public ResponsePerson email(ResponseEmail email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseEmail getEmail() {
    return email;
  }

  public void setEmail(ResponseEmail email) {
    this.email = email;
  }

  public ResponsePerson telephone(ResponseTelephone telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseTelephone getTelephone() {
    return telephone;
  }

  public void setTelephone(ResponseTelephone telephone) {
    this.telephone = telephone;
  }

  public ResponsePerson address(ResponseAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseAddress getAddress() {
    return address;
  }

  public void setAddress(ResponseAddress address) {
    this.address = address;
  }

  public ResponsePerson associationOrganization(ResponseAssociationOrganization associationOrganization) {
    this.associationOrganization = associationOrganization;
    return this;
  }

   /**
   * Get associationOrganization
   * @return associationOrganization
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseAssociationOrganization getAssociationOrganization() {
    return associationOrganization;
  }

  public void setAssociationOrganization(ResponseAssociationOrganization associationOrganization) {
    this.associationOrganization = associationOrganization;
  }

  public ResponsePerson associationSite(ResponseAssociationSite associationSite) {
    this.associationSite = associationSite;
    return this;
  }

   /**
   * Get associationSite
   * @return associationSite
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseAssociationSite getAssociationSite() {
    return associationSite;
  }

  public void setAssociationSite(ResponseAssociationSite associationSite) {
    this.associationSite = associationSite;
  }

  public ResponsePerson associationOpsi(ResponseAssociationOpsi associationOpsi) {
    this.associationOpsi = associationOpsi;
    return this;
  }

   /**
   * Get associationOpsi
   * @return associationOpsi
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseAssociationOpsi getAssociationOpsi() {
    return associationOpsi;
  }

  public void setAssociationOpsi(ResponseAssociationOpsi associationOpsi) {
    this.associationOpsi = associationOpsi;
  }

  public ResponsePerson qualificationSuffix(ResponseQualificationSuffix qualificationSuffix) {
    this.qualificationSuffix = qualificationSuffix;
    return this;
  }

   /**
   * Get qualificationSuffix
   * @return qualificationSuffix
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseQualificationSuffix getQualificationSuffix() {
    return qualificationSuffix;
  }

  public void setQualificationSuffix(ResponseQualificationSuffix qualificationSuffix) {
    this.qualificationSuffix = qualificationSuffix;
  }

  public ResponsePerson contactRelationship(ResponseContactRelationship contactRelationship) {
    this.contactRelationship = contactRelationship;
    return this;
  }

   /**
   * Get contactRelationship
   * @return contactRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseContactRelationship getContactRelationship() {
    return contactRelationship;
  }

  public void setContactRelationship(ResponseContactRelationship contactRelationship) {
    this.contactRelationship = contactRelationship;
  }

  public ResponsePerson privacyContactMedium(ResponsePrivacyContactMedium privacyContactMedium) {
    this.privacyContactMedium = privacyContactMedium;
    return this;
  }

   /**
   * Get privacyContactMedium
   * @return privacyContactMedium
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponsePrivacyContactMedium getPrivacyContactMedium() {
    return privacyContactMedium;
  }

  public void setPrivacyContactMedium(ResponsePrivacyContactMedium privacyContactMedium) {
    this.privacyContactMedium = privacyContactMedium;
  }

  public ResponsePerson privacyIsolation(ResponsePrivacyIsolation privacyIsolation) {
    this.privacyIsolation = privacyIsolation;
    return this;
  }

   /**
   * Get privacyIsolation
   * @return privacyIsolation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponsePrivacyIsolation getPrivacyIsolation() {
    return privacyIsolation;
  }

  public void setPrivacyIsolation(ResponsePrivacyIsolation privacyIsolation) {
    this.privacyIsolation = privacyIsolation;
  }

  public ResponsePerson uri(ResponseUri uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseUri getUri() {
    return uri;
  }

  public void setUri(ResponseUri uri) {
    this.uri = uri;
  }

  public ResponsePerson socialMedia(ResponseSocialMedia socialMedia) {
    this.socialMedia = socialMedia;
    return this;
  }

   /**
   * Get socialMedia
   * @return socialMedia
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseSocialMedia getSocialMedia() {
    return socialMedia;
  }

  public void setSocialMedia(ResponseSocialMedia socialMedia) {
    this.socialMedia = socialMedia;
  }

  public ResponsePerson demographicAssignment(ResponseDemographicAssignment demographicAssignment) {
    this.demographicAssignment = demographicAssignment;
    return this;
  }

   /**
   * Get demographicAssignment
   * @return demographicAssignment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponseDemographicAssignment getDemographicAssignment() {
    return demographicAssignment;
  }

  public void setDemographicAssignment(ResponseDemographicAssignment demographicAssignment) {
    this.demographicAssignment = demographicAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePerson responsePerson = (ResponsePerson) o;
    return Objects.equals(this.mdmContactID, responsePerson.mdmContactID) &&
        Objects.equals(this.preferredCountryCode, responsePerson.preferredCountryCode) &&
        Objects.equals(this.preferredLanguageCode, responsePerson.preferredLanguageCode) &&
        Objects.equals(this.preferredLanguageCharacterScript, responsePerson.preferredLanguageCharacterScript) &&
        Objects.equals(this.familyName, responsePerson.familyName) &&
        Objects.equals(this.firstGivenName, responsePerson.firstGivenName) &&
        Objects.equals(this.secondGivenName, responsePerson.secondGivenName) &&
        Objects.equals(this.salutationPrefix, responsePerson.salutationPrefix) &&
        Objects.equals(this.generationSuffix, responsePerson.generationSuffix) &&
        Objects.equals(this.gender, responsePerson.gender) &&
        Objects.equals(this.nicknameFamilyName, responsePerson.nicknameFamilyName) &&
        Objects.equals(this.nicknameFirstGivenName, responsePerson.nicknameFirstGivenName) &&
        Objects.equals(this.nicknameSecondGivenName, responsePerson.nicknameSecondGivenName) &&
        Objects.equals(this.phoneticFamilyName, responsePerson.phoneticFamilyName) &&
        Objects.equals(this.phoneticFirstGivenName, responsePerson.phoneticFirstGivenName) &&
        Objects.equals(this.phoneticSecondGivenName, responsePerson.phoneticSecondGivenName) &&
        Objects.equals(this.localFamilyName, responsePerson.localFamilyName) &&
        Objects.equals(this.localFirsGiventName, responsePerson.localFirsGiventName) &&
        Objects.equals(this.localSecondGivenName, responsePerson.localSecondGivenName) &&
        Objects.equals(this.associationDuns, responsePerson.associationDuns) &&
        Objects.equals(this.associationParty, responsePerson.associationParty) &&
        Objects.equals(this.email, responsePerson.email) &&
        Objects.equals(this.telephone, responsePerson.telephone) &&
        Objects.equals(this.address, responsePerson.address) &&
        Objects.equals(this.associationOrganization, responsePerson.associationOrganization) &&
        Objects.equals(this.associationSite, responsePerson.associationSite) &&
        Objects.equals(this.associationOpsi, responsePerson.associationOpsi) &&
        Objects.equals(this.qualificationSuffix, responsePerson.qualificationSuffix) &&
        Objects.equals(this.contactRelationship, responsePerson.contactRelationship) &&
        Objects.equals(this.privacyContactMedium, responsePerson.privacyContactMedium) &&
        Objects.equals(this.privacyIsolation, responsePerson.privacyIsolation) &&
        Objects.equals(this.uri, responsePerson.uri) &&
        Objects.equals(this.socialMedia, responsePerson.socialMedia) &&
        Objects.equals(this.demographicAssignment, responsePerson.demographicAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mdmContactID, preferredCountryCode, preferredLanguageCode, preferredLanguageCharacterScript, familyName, firstGivenName, secondGivenName, salutationPrefix, generationSuffix, gender, nicknameFamilyName, nicknameFirstGivenName, nicknameSecondGivenName, phoneticFamilyName, phoneticFirstGivenName, phoneticSecondGivenName, localFamilyName, localFirsGiventName, localSecondGivenName, associationDuns, associationParty, email, telephone, address, associationOrganization, associationSite, associationOpsi, qualificationSuffix, contactRelationship, privacyContactMedium, privacyIsolation, uri, socialMedia, demographicAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePerson {\n");
    
    sb.append("    mdmContactID: ").append(toIndentedString(mdmContactID)).append("\n");
    sb.append("    preferredCountryCode: ").append(toIndentedString(preferredCountryCode)).append("\n");
    sb.append("    preferredLanguageCode: ").append(toIndentedString(preferredLanguageCode)).append("\n");
    sb.append("    preferredLanguageCharacterScript: ").append(toIndentedString(preferredLanguageCharacterScript)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    firstGivenName: ").append(toIndentedString(firstGivenName)).append("\n");
    sb.append("    secondGivenName: ").append(toIndentedString(secondGivenName)).append("\n");
    sb.append("    salutationPrefix: ").append(toIndentedString(salutationPrefix)).append("\n");
    sb.append("    generationSuffix: ").append(toIndentedString(generationSuffix)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    nicknameFamilyName: ").append(toIndentedString(nicknameFamilyName)).append("\n");
    sb.append("    nicknameFirstGivenName: ").append(toIndentedString(nicknameFirstGivenName)).append("\n");
    sb.append("    nicknameSecondGivenName: ").append(toIndentedString(nicknameSecondGivenName)).append("\n");
    sb.append("    phoneticFamilyName: ").append(toIndentedString(phoneticFamilyName)).append("\n");
    sb.append("    phoneticFirstGivenName: ").append(toIndentedString(phoneticFirstGivenName)).append("\n");
    sb.append("    phoneticSecondGivenName: ").append(toIndentedString(phoneticSecondGivenName)).append("\n");
    sb.append("    localFamilyName: ").append(toIndentedString(localFamilyName)).append("\n");
    sb.append("    localFirsGiventName: ").append(toIndentedString(localFirsGiventName)).append("\n");
    sb.append("    localSecondGivenName: ").append(toIndentedString(localSecondGivenName)).append("\n");
    sb.append("    associationDuns: ").append(toIndentedString(associationDuns)).append("\n");
    sb.append("    associationParty: ").append(toIndentedString(associationParty)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    associationOrganization: ").append(toIndentedString(associationOrganization)).append("\n");
    sb.append("    associationSite: ").append(toIndentedString(associationSite)).append("\n");
    sb.append("    associationOpsi: ").append(toIndentedString(associationOpsi)).append("\n");
    sb.append("    qualificationSuffix: ").append(toIndentedString(qualificationSuffix)).append("\n");
    sb.append("    contactRelationship: ").append(toIndentedString(contactRelationship)).append("\n");
    sb.append("    privacyContactMedium: ").append(toIndentedString(privacyContactMedium)).append("\n");
    sb.append("    privacyIsolation: ").append(toIndentedString(privacyIsolation)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    socialMedia: ").append(toIndentedString(socialMedia)).append("\n");
    sb.append("    demographicAssignment: ").append(toIndentedString(demographicAssignment)).append("\n");
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

