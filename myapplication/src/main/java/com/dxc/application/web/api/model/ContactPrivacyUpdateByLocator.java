package com.dxc.application.web.api.model;

import java.util.Objects;
import com.dxc.application.web.api.model.GDPRFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactPrivacyUpdateByLocator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ContactPrivacyUpdateByLocator   {
  @JsonProperty("systemName")
  private String systemName = null;

  @JsonProperty("telephoneCountryCode")
  private String telephoneCountryCode = null;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber = null;

  @JsonProperty("telephonePrivacyCollectionTimestamp")
  private OffsetDateTime telephonePrivacyCollectionTimestamp = null;

  @JsonProperty("setAllTelephonePrivacy")
  private String setAllTelephonePrivacy = "N";

  @JsonProperty("setTelephonePrivacy")
  private String setTelephonePrivacy = "N";

  @JsonProperty("setMobilePrivacy")
  private String setMobilePrivacy = "N";

  @JsonProperty("setFaxPrivacy")
  private String setFaxPrivacy = "N";

  @JsonProperty("GDPRField")
  private GDPRFields gdPRField = null;

  public ContactPrivacyUpdateByLocator systemName(String systemName) {
    this.systemName = systemName;
    return this;
  }

   /**
   * Get systemName
   * @return systemName
  **/
  @ApiModelProperty(value = "")

 @Size(max=60)
  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public ContactPrivacyUpdateByLocator telephoneCountryCode(String telephoneCountryCode) {
    this.telephoneCountryCode = telephoneCountryCode;
    return this;
  }

   /**
   * Get telephoneCountryCode
   * @return telephoneCountryCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=2)
  public String getTelephoneCountryCode() {
    return telephoneCountryCode;
  }

  public void setTelephoneCountryCode(String telephoneCountryCode) {
    this.telephoneCountryCode = telephoneCountryCode;
  }

  public ContactPrivacyUpdateByLocator telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * Get telephoneNumber
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public ContactPrivacyUpdateByLocator telephonePrivacyCollectionTimestamp(OffsetDateTime telephonePrivacyCollectionTimestamp) {
    this.telephonePrivacyCollectionTimestamp = telephonePrivacyCollectionTimestamp;
    return this;
  }

   /**
   * Get telephonePrivacyCollectionTimestamp
   * @return telephonePrivacyCollectionTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTelephonePrivacyCollectionTimestamp() {
    return telephonePrivacyCollectionTimestamp;
  }

  public void setTelephonePrivacyCollectionTimestamp(OffsetDateTime telephonePrivacyCollectionTimestamp) {
    this.telephonePrivacyCollectionTimestamp = telephonePrivacyCollectionTimestamp;
  }

  public ContactPrivacyUpdateByLocator setAllTelephonePrivacy(String setAllTelephonePrivacy) {
    this.setAllTelephonePrivacy = setAllTelephonePrivacy;
    return this;
  }

   /**
   * Get setAllTelephonePrivacy
   * @return setAllTelephonePrivacy
  **/
  @ApiModelProperty(value = "")

 @Size(max=1)
  public String getSetAllTelephonePrivacy() {
    return setAllTelephonePrivacy;
  }

  public void setSetAllTelephonePrivacy(String setAllTelephonePrivacy) {
    this.setAllTelephonePrivacy = setAllTelephonePrivacy;
  }

  public ContactPrivacyUpdateByLocator setTelephonePrivacy(String setTelephonePrivacy) {
    this.setTelephonePrivacy = setTelephonePrivacy;
    return this;
  }

   /**
   * Get setTelephonePrivacy
   * @return setTelephonePrivacy
  **/
  @ApiModelProperty(value = "")

 @Size(max=1)
  public String getSetTelephonePrivacy() {
    return setTelephonePrivacy;
  }

  public void setSetTelephonePrivacy(String setTelephonePrivacy) {
    this.setTelephonePrivacy = setTelephonePrivacy;
  }

  public ContactPrivacyUpdateByLocator setMobilePrivacy(String setMobilePrivacy) {
    this.setMobilePrivacy = setMobilePrivacy;
    return this;
  }

   /**
   * Get setMobilePrivacy
   * @return setMobilePrivacy
  **/
  @ApiModelProperty(value = "")

 @Size(max=1)
  public String getSetMobilePrivacy() {
    return setMobilePrivacy;
  }

  public void setSetMobilePrivacy(String setMobilePrivacy) {
    this.setMobilePrivacy = setMobilePrivacy;
  }

  public ContactPrivacyUpdateByLocator setFaxPrivacy(String setFaxPrivacy) {
    this.setFaxPrivacy = setFaxPrivacy;
    return this;
  }

   /**
   * Get setFaxPrivacy
   * @return setFaxPrivacy
  **/
  @ApiModelProperty(value = "")

 @Size(max=1)
  public String getSetFaxPrivacy() {
    return setFaxPrivacy;
  }

  public void setSetFaxPrivacy(String setFaxPrivacy) {
    this.setFaxPrivacy = setFaxPrivacy;
  }

  public ContactPrivacyUpdateByLocator gdPRField(GDPRFields gdPRField) {
    this.gdPRField = gdPRField;
    return this;
  }

   /**
   * Get gdPRField
   * @return gdPRField
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GDPRFields getGdPRField() {
    return gdPRField;
  }

  public void setGdPRField(GDPRFields gdPRField) {
    this.gdPRField = gdPRField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPrivacyUpdateByLocator contactPrivacyUpdateByLocator = (ContactPrivacyUpdateByLocator) o;
    return Objects.equals(this.systemName, contactPrivacyUpdateByLocator.systemName) &&
        Objects.equals(this.telephoneCountryCode, contactPrivacyUpdateByLocator.telephoneCountryCode) &&
        Objects.equals(this.telephoneNumber, contactPrivacyUpdateByLocator.telephoneNumber) &&
        Objects.equals(this.telephonePrivacyCollectionTimestamp, contactPrivacyUpdateByLocator.telephonePrivacyCollectionTimestamp) &&
        Objects.equals(this.setAllTelephonePrivacy, contactPrivacyUpdateByLocator.setAllTelephonePrivacy) &&
        Objects.equals(this.setTelephonePrivacy, contactPrivacyUpdateByLocator.setTelephonePrivacy) &&
        Objects.equals(this.setMobilePrivacy, contactPrivacyUpdateByLocator.setMobilePrivacy) &&
        Objects.equals(this.setFaxPrivacy, contactPrivacyUpdateByLocator.setFaxPrivacy) &&
        Objects.equals(this.gdPRField, contactPrivacyUpdateByLocator.gdPRField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemName, telephoneCountryCode, telephoneNumber, telephonePrivacyCollectionTimestamp, setAllTelephonePrivacy, setTelephonePrivacy, setMobilePrivacy, setFaxPrivacy, gdPRField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPrivacyUpdateByLocator {\n");
    
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    telephoneCountryCode: ").append(toIndentedString(telephoneCountryCode)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    telephonePrivacyCollectionTimestamp: ").append(toIndentedString(telephonePrivacyCollectionTimestamp)).append("\n");
    sb.append("    setAllTelephonePrivacy: ").append(toIndentedString(setAllTelephonePrivacy)).append("\n");
    sb.append("    setTelephonePrivacy: ").append(toIndentedString(setTelephonePrivacy)).append("\n");
    sb.append("    setMobilePrivacy: ").append(toIndentedString(setMobilePrivacy)).append("\n");
    sb.append("    setFaxPrivacy: ").append(toIndentedString(setFaxPrivacy)).append("\n");
    sb.append("    gdPRField: ").append(toIndentedString(gdPRField)).append("\n");
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

