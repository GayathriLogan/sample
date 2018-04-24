package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseSocialMediaInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseSocialMediaInner   {
  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("handleName")
  private String handleName = null;

  @JsonProperty("urlText")
  private String urlText = null;

  @JsonProperty("uriSchemaCode")
  private String uriSchemaCode = null;

  public ResponseSocialMediaInner typeCode(String typeCode) {
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

  public ResponseSocialMediaInner handleName(String handleName) {
    this.handleName = handleName;
    return this;
  }

   /**
   * Get handleName
   * @return handleName
  **/
  @ApiModelProperty(value = "")


  public String getHandleName() {
    return handleName;
  }

  public void setHandleName(String handleName) {
    this.handleName = handleName;
  }

  public ResponseSocialMediaInner urlText(String urlText) {
    this.urlText = urlText;
    return this;
  }

   /**
   * Get urlText
   * @return urlText
  **/
  @ApiModelProperty(value = "")


  public String getUrlText() {
    return urlText;
  }

  public void setUrlText(String urlText) {
    this.urlText = urlText;
  }

  public ResponseSocialMediaInner uriSchemaCode(String uriSchemaCode) {
    this.uriSchemaCode = uriSchemaCode;
    return this;
  }

   /**
   * Get uriSchemaCode
   * @return uriSchemaCode
  **/
  @ApiModelProperty(value = "")


  public String getUriSchemaCode() {
    return uriSchemaCode;
  }

  public void setUriSchemaCode(String uriSchemaCode) {
    this.uriSchemaCode = uriSchemaCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSocialMediaInner responseSocialMediaInner = (ResponseSocialMediaInner) o;
    return Objects.equals(this.typeCode, responseSocialMediaInner.typeCode) &&
        Objects.equals(this.handleName, responseSocialMediaInner.handleName) &&
        Objects.equals(this.urlText, responseSocialMediaInner.urlText) &&
        Objects.equals(this.uriSchemaCode, responseSocialMediaInner.uriSchemaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeCode, handleName, urlText, uriSchemaCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSocialMediaInner {\n");
    
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    handleName: ").append(toIndentedString(handleName)).append("\n");
    sb.append("    urlText: ").append(toIndentedString(urlText)).append("\n");
    sb.append("    uriSchemaCode: ").append(toIndentedString(uriSchemaCode)).append("\n");
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

