package com.dxc.application.web.api.model;

import java.util.Objects;
import com.dxc.application.web.api.model.ResponsePrivacyContactMedium;
import com.dxc.application.web.api.model.ResponsePrivacyIsolation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LookupResponsePrivacyOnly
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class LookupResponsePrivacyOnly   {
  @JsonProperty("mdmContactId")
  private String mdmContactId = null;

  @JsonProperty("PrivacyContactMedium")
  private ResponsePrivacyContactMedium privacyContactMedium = null;

  @JsonProperty("PrivacyIsolation")
  private ResponsePrivacyIsolation privacyIsolation = null;

  public LookupResponsePrivacyOnly mdmContactId(String mdmContactId) {
    this.mdmContactId = mdmContactId;
    return this;
  }

   /**
   * Get mdmContactId
   * @return mdmContactId
  **/
  @ApiModelProperty(value = "")

 @Size(max=14)
  public String getMdmContactId() {
    return mdmContactId;
  }

  public void setMdmContactId(String mdmContactId) {
    this.mdmContactId = mdmContactId;
  }

  public LookupResponsePrivacyOnly privacyContactMedium(ResponsePrivacyContactMedium privacyContactMedium) {
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

  public LookupResponsePrivacyOnly privacyIsolation(ResponsePrivacyIsolation privacyIsolation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupResponsePrivacyOnly lookupResponsePrivacyOnly = (LookupResponsePrivacyOnly) o;
    return Objects.equals(this.mdmContactId, lookupResponsePrivacyOnly.mdmContactId) &&
        Objects.equals(this.privacyContactMedium, lookupResponsePrivacyOnly.privacyContactMedium) &&
        Objects.equals(this.privacyIsolation, lookupResponsePrivacyOnly.privacyIsolation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mdmContactId, privacyContactMedium, privacyIsolation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupResponsePrivacyOnly {\n");
    
    sb.append("    mdmContactId: ").append(toIndentedString(mdmContactId)).append("\n");
    sb.append("    privacyContactMedium: ").append(toIndentedString(privacyContactMedium)).append("\n");
    sb.append("    privacyIsolation: ").append(toIndentedString(privacyIsolation)).append("\n");
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

