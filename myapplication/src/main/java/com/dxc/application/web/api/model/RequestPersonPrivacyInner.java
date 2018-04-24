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
 * RequestPersonPrivacyInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestPersonPrivacyInner   {
  @JsonProperty("privacyTypeCode")
  private String privacyTypeCode = null;

  @JsonProperty("privacyPreferenceCode")
  private String privacyPreferenceCode = null;

  @JsonProperty("privacyCollectionTimestamp")
  private OffsetDateTime privacyCollectionTimestamp = null;

  public RequestPersonPrivacyInner privacyTypeCode(String privacyTypeCode) {
    this.privacyTypeCode = privacyTypeCode;
    return this;
  }

   /**
   * Get privacyTypeCode
   * @return privacyTypeCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPrivacyTypeCode() {
    return privacyTypeCode;
  }

  public void setPrivacyTypeCode(String privacyTypeCode) {
    this.privacyTypeCode = privacyTypeCode;
  }

  public RequestPersonPrivacyInner privacyPreferenceCode(String privacyPreferenceCode) {
    this.privacyPreferenceCode = privacyPreferenceCode;
    return this;
  }

   /**
   * Get privacyPreferenceCode
   * @return privacyPreferenceCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getPrivacyPreferenceCode() {
    return privacyPreferenceCode;
  }

  public void setPrivacyPreferenceCode(String privacyPreferenceCode) {
    this.privacyPreferenceCode = privacyPreferenceCode;
  }

  public RequestPersonPrivacyInner privacyCollectionTimestamp(OffsetDateTime privacyCollectionTimestamp) {
    this.privacyCollectionTimestamp = privacyCollectionTimestamp;
    return this;
  }

   /**
   * Get privacyCollectionTimestamp
   * @return privacyCollectionTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPrivacyCollectionTimestamp() {
    return privacyCollectionTimestamp;
  }

  public void setPrivacyCollectionTimestamp(OffsetDateTime privacyCollectionTimestamp) {
    this.privacyCollectionTimestamp = privacyCollectionTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPersonPrivacyInner requestPersonPrivacyInner = (RequestPersonPrivacyInner) o;
    return Objects.equals(this.privacyTypeCode, requestPersonPrivacyInner.privacyTypeCode) &&
        Objects.equals(this.privacyPreferenceCode, requestPersonPrivacyInner.privacyPreferenceCode) &&
        Objects.equals(this.privacyCollectionTimestamp, requestPersonPrivacyInner.privacyCollectionTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privacyTypeCode, privacyPreferenceCode, privacyCollectionTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPersonPrivacyInner {\n");
    
    sb.append("    privacyTypeCode: ").append(toIndentedString(privacyTypeCode)).append("\n");
    sb.append("    privacyPreferenceCode: ").append(toIndentedString(privacyPreferenceCode)).append("\n");
    sb.append("    privacyCollectionTimestamp: ").append(toIndentedString(privacyCollectionTimestamp)).append("\n");
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

