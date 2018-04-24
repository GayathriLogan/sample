package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseEmailInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseEmailInner   {
  @JsonProperty("emailRoleCode")
  private String emailRoleCode = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("emailDomain")
  private String emailDomain = null;

  @JsonProperty("emailDescription")
  private String emailDescription = null;

  public ResponseEmailInner emailRoleCode(String emailRoleCode) {
    this.emailRoleCode = emailRoleCode;
    return this;
  }

   /**
   * Get emailRoleCode
   * @return emailRoleCode
  **/
  @ApiModelProperty(value = "")


  public String getEmailRoleCode() {
    return emailRoleCode;
  }

  public void setEmailRoleCode(String emailRoleCode) {
    this.emailRoleCode = emailRoleCode;
  }

  public ResponseEmailInner emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ResponseEmailInner emailDomain(String emailDomain) {
    this.emailDomain = emailDomain;
    return this;
  }

   /**
   * Get emailDomain
   * @return emailDomain
  **/
  @ApiModelProperty(value = "")


  public String getEmailDomain() {
    return emailDomain;
  }

  public void setEmailDomain(String emailDomain) {
    this.emailDomain = emailDomain;
  }

  public ResponseEmailInner emailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
    return this;
  }

   /**
   * Get emailDescription
   * @return emailDescription
  **/
  @ApiModelProperty(value = "")


  public String getEmailDescription() {
    return emailDescription;
  }

  public void setEmailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseEmailInner responseEmailInner = (ResponseEmailInner) o;
    return Objects.equals(this.emailRoleCode, responseEmailInner.emailRoleCode) &&
        Objects.equals(this.emailAddress, responseEmailInner.emailAddress) &&
        Objects.equals(this.emailDomain, responseEmailInner.emailDomain) &&
        Objects.equals(this.emailDescription, responseEmailInner.emailDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailRoleCode, emailAddress, emailDomain, emailDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseEmailInner {\n");
    
    sb.append("    emailRoleCode: ").append(toIndentedString(emailRoleCode)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailDomain: ").append(toIndentedString(emailDomain)).append("\n");
    sb.append("    emailDescription: ").append(toIndentedString(emailDescription)).append("\n");
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

