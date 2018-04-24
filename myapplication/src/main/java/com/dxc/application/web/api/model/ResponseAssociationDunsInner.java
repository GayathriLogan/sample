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
 * ResponseAssociationDunsInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseAssociationDunsInner   {
  @JsonProperty("companyDunsID")
  private String companyDunsID = null;

  @JsonProperty("verificationStatus")
  private String verificationStatus = null;

  @JsonProperty("contactAssociationRoleCode")
  private String contactAssociationRoleCode = null;

  @JsonProperty("effectiveTimestamp")
  private OffsetDateTime effectiveTimestamp = null;

  @JsonProperty("expiryTimestamp")
  private OffsetDateTime expiryTimestamp = null;

  @JsonProperty("companyOrganizationID")
  private String companyOrganizationID = null;

  public ResponseAssociationDunsInner companyDunsID(String companyDunsID) {
    this.companyDunsID = companyDunsID;
    return this;
  }

   /**
   * Get companyDunsID
   * @return companyDunsID
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getCompanyDunsID() {
    return companyDunsID;
  }

  public void setCompanyDunsID(String companyDunsID) {
    this.companyDunsID = companyDunsID;
  }

  public ResponseAssociationDunsInner verificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public ResponseAssociationDunsInner contactAssociationRoleCode(String contactAssociationRoleCode) {
    this.contactAssociationRoleCode = contactAssociationRoleCode;
    return this;
  }

   /**
   * Get contactAssociationRoleCode
   * @return contactAssociationRoleCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getContactAssociationRoleCode() {
    return contactAssociationRoleCode;
  }

  public void setContactAssociationRoleCode(String contactAssociationRoleCode) {
    this.contactAssociationRoleCode = contactAssociationRoleCode;
  }

  public ResponseAssociationDunsInner effectiveTimestamp(OffsetDateTime effectiveTimestamp) {
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

  public ResponseAssociationDunsInner expiryTimestamp(OffsetDateTime expiryTimestamp) {
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

  public ResponseAssociationDunsInner companyOrganizationID(String companyOrganizationID) {
    this.companyOrganizationID = companyOrganizationID;
    return this;
  }

   /**
   * Get companyOrganizationID
   * @return companyOrganizationID
  **/
  @ApiModelProperty(value = "")

 @Size(max=14)
  public String getCompanyOrganizationID() {
    return companyOrganizationID;
  }

  public void setCompanyOrganizationID(String companyOrganizationID) {
    this.companyOrganizationID = companyOrganizationID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAssociationDunsInner responseAssociationDunsInner = (ResponseAssociationDunsInner) o;
    return Objects.equals(this.companyDunsID, responseAssociationDunsInner.companyDunsID) &&
        Objects.equals(this.verificationStatus, responseAssociationDunsInner.verificationStatus) &&
        Objects.equals(this.contactAssociationRoleCode, responseAssociationDunsInner.contactAssociationRoleCode) &&
        Objects.equals(this.effectiveTimestamp, responseAssociationDunsInner.effectiveTimestamp) &&
        Objects.equals(this.expiryTimestamp, responseAssociationDunsInner.expiryTimestamp) &&
        Objects.equals(this.companyOrganizationID, responseAssociationDunsInner.companyOrganizationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyDunsID, verificationStatus, contactAssociationRoleCode, effectiveTimestamp, expiryTimestamp, companyOrganizationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAssociationDunsInner {\n");
    
    sb.append("    companyDunsID: ").append(toIndentedString(companyDunsID)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    contactAssociationRoleCode: ").append(toIndentedString(contactAssociationRoleCode)).append("\n");
    sb.append("    effectiveTimestamp: ").append(toIndentedString(effectiveTimestamp)).append("\n");
    sb.append("    expiryTimestamp: ").append(toIndentedString(expiryTimestamp)).append("\n");
    sb.append("    companyOrganizationID: ").append(toIndentedString(companyOrganizationID)).append("\n");
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

