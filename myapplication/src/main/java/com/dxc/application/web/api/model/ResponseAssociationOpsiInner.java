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
 * ResponseAssociationOpsiInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseAssociationOpsiInner   {
  @JsonProperty("companyOpsiID")
  private String companyOpsiID = null;

  @JsonProperty("verificationStatus")
  private String verificationStatus = null;

  @JsonProperty("contactAssociationRoleCode")
  private String contactAssociationRoleCode = null;

  @JsonProperty("effectiveTimestamp")
  private OffsetDateTime effectiveTimestamp = null;

  @JsonProperty("expiryTimestamp")
  private OffsetDateTime expiryTimestamp = null;

  public ResponseAssociationOpsiInner companyOpsiID(String companyOpsiID) {
    this.companyOpsiID = companyOpsiID;
    return this;
  }

   /**
   * Get companyOpsiID
   * @return companyOpsiID
  **/
  @ApiModelProperty(value = "")


  public String getCompanyOpsiID() {
    return companyOpsiID;
  }

  public void setCompanyOpsiID(String companyOpsiID) {
    this.companyOpsiID = companyOpsiID;
  }

  public ResponseAssociationOpsiInner verificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "")


  public String getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public ResponseAssociationOpsiInner contactAssociationRoleCode(String contactAssociationRoleCode) {
    this.contactAssociationRoleCode = contactAssociationRoleCode;
    return this;
  }

   /**
   * Get contactAssociationRoleCode
   * @return contactAssociationRoleCode
  **/
  @ApiModelProperty(value = "")


  public String getContactAssociationRoleCode() {
    return contactAssociationRoleCode;
  }

  public void setContactAssociationRoleCode(String contactAssociationRoleCode) {
    this.contactAssociationRoleCode = contactAssociationRoleCode;
  }

  public ResponseAssociationOpsiInner effectiveTimestamp(OffsetDateTime effectiveTimestamp) {
    this.effectiveTimestamp = effectiveTimestamp;
    return this;
  }

   /**
   * Get effectiveTimestamp
   * @return effectiveTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEffectiveTimestamp() {
    return effectiveTimestamp;
  }

  public void setEffectiveTimestamp(OffsetDateTime effectiveTimestamp) {
    this.effectiveTimestamp = effectiveTimestamp;
  }

  public ResponseAssociationOpsiInner expiryTimestamp(OffsetDateTime expiryTimestamp) {
    this.expiryTimestamp = expiryTimestamp;
    return this;
  }

   /**
   * Get expiryTimestamp
   * @return expiryTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpiryTimestamp() {
    return expiryTimestamp;
  }

  public void setExpiryTimestamp(OffsetDateTime expiryTimestamp) {
    this.expiryTimestamp = expiryTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAssociationOpsiInner responseAssociationOpsiInner = (ResponseAssociationOpsiInner) o;
    return Objects.equals(this.companyOpsiID, responseAssociationOpsiInner.companyOpsiID) &&
        Objects.equals(this.verificationStatus, responseAssociationOpsiInner.verificationStatus) &&
        Objects.equals(this.contactAssociationRoleCode, responseAssociationOpsiInner.contactAssociationRoleCode) &&
        Objects.equals(this.effectiveTimestamp, responseAssociationOpsiInner.effectiveTimestamp) &&
        Objects.equals(this.expiryTimestamp, responseAssociationOpsiInner.expiryTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyOpsiID, verificationStatus, contactAssociationRoleCode, effectiveTimestamp, expiryTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAssociationOpsiInner {\n");
    
    sb.append("    companyOpsiID: ").append(toIndentedString(companyOpsiID)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    contactAssociationRoleCode: ").append(toIndentedString(contactAssociationRoleCode)).append("\n");
    sb.append("    effectiveTimestamp: ").append(toIndentedString(effectiveTimestamp)).append("\n");
    sb.append("    expiryTimestamp: ").append(toIndentedString(expiryTimestamp)).append("\n");
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

