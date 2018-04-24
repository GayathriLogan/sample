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
 * ResponseAssociationPartyInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseAssociationPartyInner   {
  @JsonProperty("partyID")
  private String partyID = null;

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

  public ResponseAssociationPartyInner partyID(String partyID) {
    this.partyID = partyID;
    return this;
  }

   /**
   * Get partyID
   * @return partyID
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getPartyID() {
    return partyID;
  }

  public void setPartyID(String partyID) {
    this.partyID = partyID;
  }

  public ResponseAssociationPartyInner verificationStatus(String verificationStatus) {
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

  public ResponseAssociationPartyInner contactAssociationRoleCode(String contactAssociationRoleCode) {
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

  public ResponseAssociationPartyInner effectiveTimestamp(OffsetDateTime effectiveTimestamp) {
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

  public ResponseAssociationPartyInner expiryTimestamp(OffsetDateTime expiryTimestamp) {
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

  public ResponseAssociationPartyInner companyOrganizationID(String companyOrganizationID) {
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
    ResponseAssociationPartyInner responseAssociationPartyInner = (ResponseAssociationPartyInner) o;
    return Objects.equals(this.partyID, responseAssociationPartyInner.partyID) &&
        Objects.equals(this.verificationStatus, responseAssociationPartyInner.verificationStatus) &&
        Objects.equals(this.contactAssociationRoleCode, responseAssociationPartyInner.contactAssociationRoleCode) &&
        Objects.equals(this.effectiveTimestamp, responseAssociationPartyInner.effectiveTimestamp) &&
        Objects.equals(this.expiryTimestamp, responseAssociationPartyInner.expiryTimestamp) &&
        Objects.equals(this.companyOrganizationID, responseAssociationPartyInner.companyOrganizationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyID, verificationStatus, contactAssociationRoleCode, effectiveTimestamp, expiryTimestamp, companyOrganizationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAssociationPartyInner {\n");
    
    sb.append("    partyID: ").append(toIndentedString(partyID)).append("\n");
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

