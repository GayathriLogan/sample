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
 * ResponsePrivacyContactMediumInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponsePrivacyContactMediumInner   {
  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("preferenceCode")
  private String preferenceCode = null;

  @JsonProperty("collectionTimestamp")
  private OffsetDateTime collectionTimestamp = null;

  @JsonProperty("sourceCode")
  private String sourceCode = null;

  public ResponsePrivacyContactMediumInner typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @ApiModelProperty(value = "")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public ResponsePrivacyContactMediumInner preferenceCode(String preferenceCode) {
    this.preferenceCode = preferenceCode;
    return this;
  }

   /**
   * Get preferenceCode
   * @return preferenceCode
  **/
  @ApiModelProperty(value = "")


  public String getPreferenceCode() {
    return preferenceCode;
  }

  public void setPreferenceCode(String preferenceCode) {
    this.preferenceCode = preferenceCode;
  }

  public ResponsePrivacyContactMediumInner collectionTimestamp(OffsetDateTime collectionTimestamp) {
    this.collectionTimestamp = collectionTimestamp;
    return this;
  }

   /**
   * Get collectionTimestamp
   * @return collectionTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCollectionTimestamp() {
    return collectionTimestamp;
  }

  public void setCollectionTimestamp(OffsetDateTime collectionTimestamp) {
    this.collectionTimestamp = collectionTimestamp;
  }

  public ResponsePrivacyContactMediumInner sourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

   /**
   * Get sourceCode
   * @return sourceCode
  **/
  @ApiModelProperty(value = "")


  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePrivacyContactMediumInner responsePrivacyContactMediumInner = (ResponsePrivacyContactMediumInner) o;
    return Objects.equals(this.typeCode, responsePrivacyContactMediumInner.typeCode) &&
        Objects.equals(this.preferenceCode, responsePrivacyContactMediumInner.preferenceCode) &&
        Objects.equals(this.collectionTimestamp, responsePrivacyContactMediumInner.collectionTimestamp) &&
        Objects.equals(this.sourceCode, responsePrivacyContactMediumInner.sourceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeCode, preferenceCode, collectionTimestamp, sourceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePrivacyContactMediumInner {\n");
    
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    preferenceCode: ").append(toIndentedString(preferenceCode)).append("\n");
    sb.append("    collectionTimestamp: ").append(toIndentedString(collectionTimestamp)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
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

