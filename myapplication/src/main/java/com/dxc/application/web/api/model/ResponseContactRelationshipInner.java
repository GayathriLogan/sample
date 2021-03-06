package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseContactRelationshipInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseContactRelationshipInner   {
  @JsonProperty("contactRelationshipProcessCode")
  private String contactRelationshipProcessCode = null;

  @JsonProperty("contactRelationshipRoleCode")
  private String contactRelationshipRoleCode = null;

  public ResponseContactRelationshipInner contactRelationshipProcessCode(String contactRelationshipProcessCode) {
    this.contactRelationshipProcessCode = contactRelationshipProcessCode;
    return this;
  }

   /**
   * Get contactRelationshipProcessCode
   * @return contactRelationshipProcessCode
  **/
  @ApiModelProperty(value = "")


  public String getContactRelationshipProcessCode() {
    return contactRelationshipProcessCode;
  }

  public void setContactRelationshipProcessCode(String contactRelationshipProcessCode) {
    this.contactRelationshipProcessCode = contactRelationshipProcessCode;
  }

  public ResponseContactRelationshipInner contactRelationshipRoleCode(String contactRelationshipRoleCode) {
    this.contactRelationshipRoleCode = contactRelationshipRoleCode;
    return this;
  }

   /**
   * Get contactRelationshipRoleCode
   * @return contactRelationshipRoleCode
  **/
  @ApiModelProperty(value = "")


  public String getContactRelationshipRoleCode() {
    return contactRelationshipRoleCode;
  }

  public void setContactRelationshipRoleCode(String contactRelationshipRoleCode) {
    this.contactRelationshipRoleCode = contactRelationshipRoleCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseContactRelationshipInner responseContactRelationshipInner = (ResponseContactRelationshipInner) o;
    return Objects.equals(this.contactRelationshipProcessCode, responseContactRelationshipInner.contactRelationshipProcessCode) &&
        Objects.equals(this.contactRelationshipRoleCode, responseContactRelationshipInner.contactRelationshipRoleCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactRelationshipProcessCode, contactRelationshipRoleCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseContactRelationshipInner {\n");
    
    sb.append("    contactRelationshipProcessCode: ").append(toIndentedString(contactRelationshipProcessCode)).append("\n");
    sb.append("    contactRelationshipRoleCode: ").append(toIndentedString(contactRelationshipRoleCode)).append("\n");
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

