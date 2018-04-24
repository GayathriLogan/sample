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
 * ResponseAssociationOrganizationInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseAssociationOrganizationInner   {
  @JsonProperty("companyOrganizationID")
  private String companyOrganizationID = null;

  @JsonProperty("verificationStatus")
  private String verificationStatus = null;

  @JsonProperty("contactAssociationRoleCode")
  private String contactAssociationRoleCode = null;

  @JsonProperty("effectiveTimestamp")
  private OffsetDateTime effectiveTimestamp = null;

  @JsonProperty("expiryTimestamp")
  private OffsetDateTime expiryTimestamp = null;

  public ResponseAssociationOrganizationInner companyOrganizationID(String companyOrganizationID) {
    this.companyOrganizationID = companyOrganizationID;
    return this;
  }

   /**
   * Get companyOrganizationID
   * @return companyOrganizationID
  **/
  @ApiModelProperty(value = "")


  public String getCompanyOrganizationID() {
    return companyOrganizationID;
  }

  public void setCompanyOrganizationID(String companyOrganizationID) {
    this.companyOrganizationID = companyOrganizationID;
  }

  public ResponseAssociationOrganizationInner verificationStatus(String verificationStatus) {
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

  public ResponseAssociationOrganizationInner contactAssociationRoleCode(String contactAssociationRoleCode) {
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

  public ResponseAssociationOrganizationInner effectiveTimestamp(OffsetDateTime effectiveTimestamp) {
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

  public ResponseAssociationOrganizationInner expiryTimestamp(OffsetDateTime expiryTimestamp) {
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
    ResponseAssociationOrganizationInner responseAssociationOrganizationInner = (ResponseAssociationOrganizationInner) o;
    return Objects.equals(this.companyOrganizationID, responseAssociationOrganizationInner.companyOrganizationID) &&
        Objects.equals(this.verificationStatus, responseAssociationOrganizationInner.verificationStatus) &&
        Objects.equals(this.contactAssociationRoleCode, responseAssociationOrganizationInner.contactAssociationRoleCode) &&
        Objects.equals(this.effectiveTimestamp, responseAssociationOrganizationInner.effectiveTimestamp) &&
        Objects.equals(this.expiryTimestamp, responseAssociationOrganizationInner.expiryTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyOrganizationID, verificationStatus, contactAssociationRoleCode, effectiveTimestamp, expiryTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAssociationOrganizationInner {\n");
    
    sb.append("    companyOrganizationID: ").append(toIndentedString(companyOrganizationID)).append("\n");
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

