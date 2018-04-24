package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseAddressInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseAddressInner   {
  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("line1")
  private String line1 = null;

  @JsonProperty("line2")
  private String line2 = null;

  @JsonProperty("line3")
  private String line3 = null;

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("cityDistrict")
  private String cityDistrict = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("stateProvinceName")
  private String stateProvinceName = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("postalCodeExtension")
  private String postalCodeExtension = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("languageCountryCode")
  private String languageCountryCode = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("languageCharacterScript")
  private String languageCharacterScript = null;

  @JsonProperty("roleCode")
  private String roleCode = null;

  public ResponseAddressInner companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ResponseAddressInner line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @ApiModelProperty(value = "")


  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public ResponseAddressInner line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Get line2
   * @return line2
  **/
  @ApiModelProperty(value = "")


  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public ResponseAddressInner line3(String line3) {
    this.line3 = line3;
    return this;
  }

   /**
   * Get line3
   * @return line3
  **/
  @ApiModelProperty(value = "")


  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public ResponseAddressInner cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * Get cityName
   * @return cityName
  **/
  @ApiModelProperty(value = "")


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public ResponseAddressInner cityDistrict(String cityDistrict) {
    this.cityDistrict = cityDistrict;
    return this;
  }

   /**
   * Get cityDistrict
   * @return cityDistrict
  **/
  @ApiModelProperty(value = "")


  public String getCityDistrict() {
    return cityDistrict;
  }

  public void setCityDistrict(String cityDistrict) {
    this.cityDistrict = cityDistrict;
  }

  public ResponseAddressInner typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @ApiModelProperty(value = "")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public ResponseAddressInner stateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
    return this;
  }

   /**
   * Get stateProvinceName
   * @return stateProvinceName
  **/
  @ApiModelProperty(value = "")


  public String getStateProvinceName() {
    return stateProvinceName;
  }

  public void setStateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
  }

  public ResponseAddressInner postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ResponseAddressInner postalCodeExtension(String postalCodeExtension) {
    this.postalCodeExtension = postalCodeExtension;
    return this;
  }

   /**
   * Get postalCodeExtension
   * @return postalCodeExtension
  **/
  @ApiModelProperty(value = "")


  public String getPostalCodeExtension() {
    return postalCodeExtension;
  }

  public void setPostalCodeExtension(String postalCodeExtension) {
    this.postalCodeExtension = postalCodeExtension;
  }

  public ResponseAddressInner countryCode(String countryCode) {
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

  public ResponseAddressInner languageCountryCode(String languageCountryCode) {
    this.languageCountryCode = languageCountryCode;
    return this;
  }

   /**
   * Get languageCountryCode
   * @return languageCountryCode
  **/
  @ApiModelProperty(value = "")


  public String getLanguageCountryCode() {
    return languageCountryCode;
  }

  public void setLanguageCountryCode(String languageCountryCode) {
    this.languageCountryCode = languageCountryCode;
  }

  public ResponseAddressInner languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @ApiModelProperty(value = "")


  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public ResponseAddressInner languageCharacterScript(String languageCharacterScript) {
    this.languageCharacterScript = languageCharacterScript;
    return this;
  }

   /**
   * Get languageCharacterScript
   * @return languageCharacterScript
  **/
  @ApiModelProperty(value = "")


  public String getLanguageCharacterScript() {
    return languageCharacterScript;
  }

  public void setLanguageCharacterScript(String languageCharacterScript) {
    this.languageCharacterScript = languageCharacterScript;
  }

  public ResponseAddressInner roleCode(String roleCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAddressInner responseAddressInner = (ResponseAddressInner) o;
    return Objects.equals(this.companyName, responseAddressInner.companyName) &&
        Objects.equals(this.line1, responseAddressInner.line1) &&
        Objects.equals(this.line2, responseAddressInner.line2) &&
        Objects.equals(this.line3, responseAddressInner.line3) &&
        Objects.equals(this.cityName, responseAddressInner.cityName) &&
        Objects.equals(this.cityDistrict, responseAddressInner.cityDistrict) &&
        Objects.equals(this.typeCode, responseAddressInner.typeCode) &&
        Objects.equals(this.stateProvinceName, responseAddressInner.stateProvinceName) &&
        Objects.equals(this.postalCode, responseAddressInner.postalCode) &&
        Objects.equals(this.postalCodeExtension, responseAddressInner.postalCodeExtension) &&
        Objects.equals(this.countryCode, responseAddressInner.countryCode) &&
        Objects.equals(this.languageCountryCode, responseAddressInner.languageCountryCode) &&
        Objects.equals(this.languageCode, responseAddressInner.languageCode) &&
        Objects.equals(this.languageCharacterScript, responseAddressInner.languageCharacterScript) &&
        Objects.equals(this.roleCode, responseAddressInner.roleCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, line1, line2, line3, cityName, cityDistrict, typeCode, stateProvinceName, postalCode, postalCodeExtension, countryCode, languageCountryCode, languageCode, languageCharacterScript, roleCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAddressInner {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    cityDistrict: ").append(toIndentedString(cityDistrict)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    stateProvinceName: ").append(toIndentedString(stateProvinceName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postalCodeExtension: ").append(toIndentedString(postalCodeExtension)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    languageCountryCode: ").append(toIndentedString(languageCountryCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    languageCharacterScript: ").append(toIndentedString(languageCharacterScript)).append("\n");
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
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

