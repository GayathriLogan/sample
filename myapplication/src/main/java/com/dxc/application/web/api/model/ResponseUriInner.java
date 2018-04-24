package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseUriInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseUriInner   {
  @JsonProperty("roleCode")
  private String roleCode = null;

  @JsonProperty("schemaCode")
  private String schemaCode = null;

  @JsonProperty("specificPart")
  private String specificPart = null;

  public ResponseUriInner roleCode(String roleCode) {
    this.roleCode = roleCode;
    return this;
  }

   /**
   * Get roleCode
   * @return roleCode
  **/
  @ApiModelProperty(value = "")


  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }

  public ResponseUriInner schemaCode(String schemaCode) {
    this.schemaCode = schemaCode;
    return this;
  }

   /**
   * Get schemaCode
   * @return schemaCode
  **/
  @ApiModelProperty(value = "")


  public String getSchemaCode() {
    return schemaCode;
  }

  public void setSchemaCode(String schemaCode) {
    this.schemaCode = schemaCode;
  }

  public ResponseUriInner specificPart(String specificPart) {
    this.specificPart = specificPart;
    return this;
  }

   /**
   * Get specificPart
   * @return specificPart
  **/
  @ApiModelProperty(value = "")


  public String getSpecificPart() {
    return specificPart;
  }

  public void setSpecificPart(String specificPart) {
    this.specificPart = specificPart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseUriInner responseUriInner = (ResponseUriInner) o;
    return Objects.equals(this.roleCode, responseUriInner.roleCode) &&
        Objects.equals(this.schemaCode, responseUriInner.schemaCode) &&
        Objects.equals(this.specificPart, responseUriInner.specificPart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleCode, schemaCode, specificPart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseUriInner {\n");
    
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("    schemaCode: ").append(toIndentedString(schemaCode)).append("\n");
    sb.append("    specificPart: ").append(toIndentedString(specificPart)).append("\n");
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

