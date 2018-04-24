package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestContactRelationshipServiceInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestContactRelationshipServiceInner   {
  @JsonProperty("contactRelationshipProcessCode")
  private String contactRelationshipProcessCode = null;

  @JsonProperty("contactRelationshipRoleCode")
  private String contactRelationshipRoleCode = null;

  /**
   * Gets or Sets contactRelationshipStatus
   */
  public enum ContactRelationshipStatusEnum {
    ACTIVE("Active"),
    
    INACTIVE("Inactive");

    private String value;

    ContactRelationshipStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContactRelationshipStatusEnum fromValue(String text) {
      for (ContactRelationshipStatusEnum b : ContactRelationshipStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("contactRelationshipStatus")
  private ContactRelationshipStatusEnum contactRelationshipStatus = ContactRelationshipStatusEnum.ACTIVE;

  public RequestContactRelationshipServiceInner contactRelationshipProcessCode(String contactRelationshipProcessCode) {
    this.contactRelationshipProcessCode = contactRelationshipProcessCode;
    return this;
  }

   /**
   * Get contactRelationshipProcessCode
   * @return contactRelationshipProcessCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getContactRelationshipProcessCode() {
    return contactRelationshipProcessCode;
  }

  public void setContactRelationshipProcessCode(String contactRelationshipProcessCode) {
    this.contactRelationshipProcessCode = contactRelationshipProcessCode;
  }

  public RequestContactRelationshipServiceInner contactRelationshipRoleCode(String contactRelationshipRoleCode) {
    this.contactRelationshipRoleCode = contactRelationshipRoleCode;
    return this;
  }

   /**
   * Get contactRelationshipRoleCode
   * @return contactRelationshipRoleCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getContactRelationshipRoleCode() {
    return contactRelationshipRoleCode;
  }

  public void setContactRelationshipRoleCode(String contactRelationshipRoleCode) {
    this.contactRelationshipRoleCode = contactRelationshipRoleCode;
  }

  public RequestContactRelationshipServiceInner contactRelationshipStatus(ContactRelationshipStatusEnum contactRelationshipStatus) {
    this.contactRelationshipStatus = contactRelationshipStatus;
    return this;
  }

   /**
   * Get contactRelationshipStatus
   * @return contactRelationshipStatus
  **/
  @ApiModelProperty(value = "")

 @Size(max=8)
  public ContactRelationshipStatusEnum getContactRelationshipStatus() {
    return contactRelationshipStatus;
  }

  public void setContactRelationshipStatus(ContactRelationshipStatusEnum contactRelationshipStatus) {
    this.contactRelationshipStatus = contactRelationshipStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestContactRelationshipServiceInner requestContactRelationshipServiceInner = (RequestContactRelationshipServiceInner) o;
    return Objects.equals(this.contactRelationshipProcessCode, requestContactRelationshipServiceInner.contactRelationshipProcessCode) &&
        Objects.equals(this.contactRelationshipRoleCode, requestContactRelationshipServiceInner.contactRelationshipRoleCode) &&
        Objects.equals(this.contactRelationshipStatus, requestContactRelationshipServiceInner.contactRelationshipStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactRelationshipProcessCode, contactRelationshipRoleCode, contactRelationshipStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactRelationshipServiceInner {\n");
    
    sb.append("    contactRelationshipProcessCode: ").append(toIndentedString(contactRelationshipProcessCode)).append("\n");
    sb.append("    contactRelationshipRoleCode: ").append(toIndentedString(contactRelationshipRoleCode)).append("\n");
    sb.append("    contactRelationshipStatus: ").append(toIndentedString(contactRelationshipStatus)).append("\n");
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

