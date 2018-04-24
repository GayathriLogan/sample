package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestContactRelationshipInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestContactRelationshipInner   {
  @JsonProperty("processCode")
  private String processCode = null;

  @JsonProperty("roleCode")
  private String roleCode = null;

  @JsonProperty("limitedUseInd")
  private String limitedUseInd = "N";

  public RequestContactRelationshipInner processCode(String processCode) {
    this.processCode = processCode;
    return this;
  }

   /**
   * Get processCode
   * @return processCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=20)
  public String getProcessCode() {
    return processCode;
  }

  public void setProcessCode(String processCode) {
    this.processCode = processCode;
  }

  public RequestContactRelationshipInner roleCode(String roleCode) {
    this.roleCode = roleCode;
    return this;
  }

   /**
   * Get roleCode
   * @return roleCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=20)
  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }

  public RequestContactRelationshipInner limitedUseInd(String limitedUseInd) {
    this.limitedUseInd = limitedUseInd;
    return this;
  }

   /**
   * Get limitedUseInd
   * @return limitedUseInd
  **/
  @ApiModelProperty(value = "")

 @Size(max=1)
  public String getLimitedUseInd() {
    return limitedUseInd;
  }

  public void setLimitedUseInd(String limitedUseInd) {
    this.limitedUseInd = limitedUseInd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestContactRelationshipInner requestContactRelationshipInner = (RequestContactRelationshipInner) o;
    return Objects.equals(this.processCode, requestContactRelationshipInner.processCode) &&
        Objects.equals(this.roleCode, requestContactRelationshipInner.roleCode) &&
        Objects.equals(this.limitedUseInd, requestContactRelationshipInner.limitedUseInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processCode, roleCode, limitedUseInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactRelationshipInner {\n");
    
    sb.append("    processCode: ").append(toIndentedString(processCode)).append("\n");
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("    limitedUseInd: ").append(toIndentedString(limitedUseInd)).append("\n");
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

