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
 * ContactPrivacyUpdateByEmail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ContactPrivacyUpdateByEmail   {
  @JsonProperty("systemName")
  private String systemName = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("emailPrivacyCollectionTimestamp")
  private OffsetDateTime emailPrivacyCollectionTimestamp = null;

  @JsonProperty("GDPRField")
  private GDPRFields gdPRField = null;

  public ContactPrivacyUpdateByEmail systemName(String systemName) {
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

  public ContactPrivacyUpdateByEmail emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")

 @Size(max=200)
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ContactPrivacyUpdateByEmail emailPrivacyCollectionTimestamp(OffsetDateTime emailPrivacyCollectionTimestamp) {
    this.emailPrivacyCollectionTimestamp = emailPrivacyCollectionTimestamp;
    return this;
  }

   /**
   * Get emailPrivacyCollectionTimestamp
   * @return emailPrivacyCollectionTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEmailPrivacyCollectionTimestamp() {
    return emailPrivacyCollectionTimestamp;
  }

  public void setEmailPrivacyCollectionTimestamp(OffsetDateTime emailPrivacyCollectionTimestamp) {
    this.emailPrivacyCollectionTimestamp = emailPrivacyCollectionTimestamp;
  }

  public ContactPrivacyUpdateByEmail gdPRField(GDPRFields gdPRField) {
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
    ContactPrivacyUpdateByEmail contactPrivacyUpdateByEmail = (ContactPrivacyUpdateByEmail) o;
    return Objects.equals(this.systemName, contactPrivacyUpdateByEmail.systemName) &&
        Objects.equals(this.emailAddress, contactPrivacyUpdateByEmail.emailAddress) &&
        Objects.equals(this.emailPrivacyCollectionTimestamp, contactPrivacyUpdateByEmail.emailPrivacyCollectionTimestamp) &&
        Objects.equals(this.gdPRField, contactPrivacyUpdateByEmail.gdPRField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemName, emailAddress, emailPrivacyCollectionTimestamp, gdPRField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPrivacyUpdateByEmail {\n");
    
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailPrivacyCollectionTimestamp: ").append(toIndentedString(emailPrivacyCollectionTimestamp)).append("\n");
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

