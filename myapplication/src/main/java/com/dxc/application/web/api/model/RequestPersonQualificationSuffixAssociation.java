package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPersonQualificationSuffixAssociation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestPersonQualificationSuffixAssociation   {
  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("personQualificationSuffixCode")
  private String personQualificationSuffixCode = null;

  @JsonProperty("preferredCountryLanguageID")
  private String preferredCountryLanguageID = null;

  @JsonProperty("preferredCountryCode")
  private String preferredCountryCode = null;

  @JsonProperty("preferredLanguageCode")
  private String preferredLanguageCode = null;

  @JsonProperty("preferredCharacterScriptCode")
  private String preferredCharacterScriptCode = null;

  @JsonProperty("qualificationSuffixOrdinalNumber")
  private String qualificationSuffixOrdinalNumber = null;

  @JsonProperty("primary")
  private String primary = null;

  public RequestPersonQualificationSuffixAssociation lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public RequestPersonQualificationSuffixAssociation personQualificationSuffixCode(String personQualificationSuffixCode) {
    this.personQualificationSuffixCode = personQualificationSuffixCode;
    return this;
  }

   /**
   * Get personQualificationSuffixCode
   * @return personQualificationSuffixCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPersonQualificationSuffixCode() {
    return personQualificationSuffixCode;
  }

  public void setPersonQualificationSuffixCode(String personQualificationSuffixCode) {
    this.personQualificationSuffixCode = personQualificationSuffixCode;
  }

  public RequestPersonQualificationSuffixAssociation preferredCountryLanguageID(String preferredCountryLanguageID) {
    this.preferredCountryLanguageID = preferredCountryLanguageID;
    return this;
  }

   /**
   * Get preferredCountryLanguageID
   * @return preferredCountryLanguageID
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPreferredCountryLanguageID() {
    return preferredCountryLanguageID;
  }

  public void setPreferredCountryLanguageID(String preferredCountryLanguageID) {
    this.preferredCountryLanguageID = preferredCountryLanguageID;
  }

  public RequestPersonQualificationSuffixAssociation preferredCountryCode(String preferredCountryCode) {
    this.preferredCountryCode = preferredCountryCode;
    return this;
  }

   /**
   * Get preferredCountryCode
   * @return preferredCountryCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPreferredCountryCode() {
    return preferredCountryCode;
  }

  public void setPreferredCountryCode(String preferredCountryCode) {
    this.preferredCountryCode = preferredCountryCode;
  }

  public RequestPersonQualificationSuffixAssociation preferredLanguageCode(String preferredLanguageCode) {
    this.preferredLanguageCode = preferredLanguageCode;
    return this;
  }

   /**
   * Get preferredLanguageCode
   * @return preferredLanguageCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPreferredLanguageCode() {
    return preferredLanguageCode;
  }

  public void setPreferredLanguageCode(String preferredLanguageCode) {
    this.preferredLanguageCode = preferredLanguageCode;
  }

  public RequestPersonQualificationSuffixAssociation preferredCharacterScriptCode(String preferredCharacterScriptCode) {
    this.preferredCharacterScriptCode = preferredCharacterScriptCode;
    return this;
  }

   /**
   * Get preferredCharacterScriptCode
   * @return preferredCharacterScriptCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPreferredCharacterScriptCode() {
    return preferredCharacterScriptCode;
  }

  public void setPreferredCharacterScriptCode(String preferredCharacterScriptCode) {
    this.preferredCharacterScriptCode = preferredCharacterScriptCode;
  }

  public RequestPersonQualificationSuffixAssociation qualificationSuffixOrdinalNumber(String qualificationSuffixOrdinalNumber) {
    this.qualificationSuffixOrdinalNumber = qualificationSuffixOrdinalNumber;
    return this;
  }

   /**
   * Get qualificationSuffixOrdinalNumber
   * @return qualificationSuffixOrdinalNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getQualificationSuffixOrdinalNumber() {
    return qualificationSuffixOrdinalNumber;
  }

  public void setQualificationSuffixOrdinalNumber(String qualificationSuffixOrdinalNumber) {
    this.qualificationSuffixOrdinalNumber = qualificationSuffixOrdinalNumber;
  }

  public RequestPersonQualificationSuffixAssociation primary(String primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPersonQualificationSuffixAssociation requestPersonQualificationSuffixAssociation = (RequestPersonQualificationSuffixAssociation) o;
    return Objects.equals(this.lastUpdate, requestPersonQualificationSuffixAssociation.lastUpdate) &&
        Objects.equals(this.personQualificationSuffixCode, requestPersonQualificationSuffixAssociation.personQualificationSuffixCode) &&
        Objects.equals(this.preferredCountryLanguageID, requestPersonQualificationSuffixAssociation.preferredCountryLanguageID) &&
        Objects.equals(this.preferredCountryCode, requestPersonQualificationSuffixAssociation.preferredCountryCode) &&
        Objects.equals(this.preferredLanguageCode, requestPersonQualificationSuffixAssociation.preferredLanguageCode) &&
        Objects.equals(this.preferredCharacterScriptCode, requestPersonQualificationSuffixAssociation.preferredCharacterScriptCode) &&
        Objects.equals(this.qualificationSuffixOrdinalNumber, requestPersonQualificationSuffixAssociation.qualificationSuffixOrdinalNumber) &&
        Objects.equals(this.primary, requestPersonQualificationSuffixAssociation.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdate, personQualificationSuffixCode, preferredCountryLanguageID, preferredCountryCode, preferredLanguageCode, preferredCharacterScriptCode, qualificationSuffixOrdinalNumber, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPersonQualificationSuffixAssociation {\n");
    
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    personQualificationSuffixCode: ").append(toIndentedString(personQualificationSuffixCode)).append("\n");
    sb.append("    preferredCountryLanguageID: ").append(toIndentedString(preferredCountryLanguageID)).append("\n");
    sb.append("    preferredCountryCode: ").append(toIndentedString(preferredCountryCode)).append("\n");
    sb.append("    preferredLanguageCode: ").append(toIndentedString(preferredLanguageCode)).append("\n");
    sb.append("    preferredCharacterScriptCode: ").append(toIndentedString(preferredCharacterScriptCode)).append("\n");
    sb.append("    qualificationSuffixOrdinalNumber: ").append(toIndentedString(qualificationSuffixOrdinalNumber)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

