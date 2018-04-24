package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseTelephoneInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseTelephoneInner   {
  @JsonProperty("roleCode")
  private String roleCode = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("extensionNumber")
  private String extensionNumber = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("cityCode")
  private String cityCode = null;

  @JsonProperty("countryAccessCode")
  private String countryAccessCode = null;

  @JsonProperty("smartIndicator")
  private String smartIndicator = null;

  public ResponseTelephoneInner roleCode(String roleCode) {
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

  public ResponseTelephoneInner number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ResponseTelephoneInner extensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
    return this;
  }

   /**
   * Get extensionNumber
   * @return extensionNumber
  **/
  @ApiModelProperty(value = "")


  public String getExtensionNumber() {
    return extensionNumber;
  }

  public void setExtensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
  }

  public ResponseTelephoneInner countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public ResponseTelephoneInner cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

   /**
   * Get cityCode
   * @return cityCode
  **/
  @ApiModelProperty(value = "")


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public ResponseTelephoneInner countryAccessCode(String countryAccessCode) {
    this.countryAccessCode = countryAccessCode;
    return this;
  }

   /**
   * Get countryAccessCode
   * @return countryAccessCode
  **/
  @ApiModelProperty(value = "")


  public String getCountryAccessCode() {
    return countryAccessCode;
  }

  public void setCountryAccessCode(String countryAccessCode) {
    this.countryAccessCode = countryAccessCode;
  }

  public ResponseTelephoneInner smartIndicator(String smartIndicator) {
    this.smartIndicator = smartIndicator;
    return this;
  }

   /**
   * Get smartIndicator
   * @return smartIndicator
  **/
  @ApiModelProperty(value = "")


  public String getSmartIndicator() {
    return smartIndicator;
  }

  public void setSmartIndicator(String smartIndicator) {
    this.smartIndicator = smartIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTelephoneInner responseTelephoneInner = (ResponseTelephoneInner) o;
    return Objects.equals(this.roleCode, responseTelephoneInner.roleCode) &&
        Objects.equals(this.number, responseTelephoneInner.number) &&
        Objects.equals(this.extensionNumber, responseTelephoneInner.extensionNumber) &&
        Objects.equals(this.countryCode, responseTelephoneInner.countryCode) &&
        Objects.equals(this.cityCode, responseTelephoneInner.cityCode) &&
        Objects.equals(this.countryAccessCode, responseTelephoneInner.countryAccessCode) &&
        Objects.equals(this.smartIndicator, responseTelephoneInner.smartIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleCode, number, extensionNumber, countryCode, cityCode, countryAccessCode, smartIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTelephoneInner {\n");
    
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    countryAccessCode: ").append(toIndentedString(countryAccessCode)).append("\n");
    sb.append("    smartIndicator: ").append(toIndentedString(smartIndicator)).append("\n");
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

