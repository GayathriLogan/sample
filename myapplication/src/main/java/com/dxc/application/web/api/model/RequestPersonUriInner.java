package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPersonUriInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestPersonUriInner   {
  @JsonProperty("uriRoleCode")
  private String uriRoleCode = null;

  @JsonProperty("uriSchemaCode")
  private String uriSchemaCode = null;

  @JsonProperty("uriSpecificPart")
  private String uriSpecificPart = null;

  public RequestPersonUriInner uriRoleCode(String uriRoleCode) {
    this.uriRoleCode = uriRoleCode;
    return this;
  }

   /**
   * Get uriRoleCode
   * @return uriRoleCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getUriRoleCode() {
    return uriRoleCode;
  }

  public void setUriRoleCode(String uriRoleCode) {
    this.uriRoleCode = uriRoleCode;
  }

  public RequestPersonUriInner uriSchemaCode(String uriSchemaCode) {
    this.uriSchemaCode = uriSchemaCode;
    return this;
  }

   /**
   * Get uriSchemaCode
   * @return uriSchemaCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getUriSchemaCode() {
    return uriSchemaCode;
  }

  public void setUriSchemaCode(String uriSchemaCode) {
    this.uriSchemaCode = uriSchemaCode;
  }

  public RequestPersonUriInner uriSpecificPart(String uriSpecificPart) {
    this.uriSpecificPart = uriSpecificPart;
    return this;
  }

   /**
   * Get uriSpecificPart
   * @return uriSpecificPart
  **/
  @ApiModelProperty(value = "")

 @Size(max=2048)
  public String getUriSpecificPart() {
    return uriSpecificPart;
  }

  public void setUriSpecificPart(String uriSpecificPart) {
    this.uriSpecificPart = uriSpecificPart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPersonUriInner requestPersonUriInner = (RequestPersonUriInner) o;
    return Objects.equals(this.uriRoleCode, requestPersonUriInner.uriRoleCode) &&
        Objects.equals(this.uriSchemaCode, requestPersonUriInner.uriSchemaCode) &&
        Objects.equals(this.uriSpecificPart, requestPersonUriInner.uriSpecificPart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uriRoleCode, uriSchemaCode, uriSpecificPart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPersonUriInner {\n");
    
    sb.append("    uriRoleCode: ").append(toIndentedString(uriRoleCode)).append("\n");
    sb.append("    uriSchemaCode: ").append(toIndentedString(uriSchemaCode)).append("\n");
    sb.append("    uriSpecificPart: ").append(toIndentedString(uriSpecificPart)).append("\n");
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

