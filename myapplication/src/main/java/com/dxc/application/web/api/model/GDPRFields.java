package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GDPRFields
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class GDPRFields   {
  @JsonProperty("OptInSource")
  private String optInSource = null;

  @JsonProperty("OptInMethod")
  private String optInMethod = null;

  @JsonProperty("OptInAnnotation")
  private String optInAnnotation = null;

  @JsonProperty("OptInSupporting URL")
  private String optInSupportingURL = null;

  @JsonProperty("OptInForm URL")
  private String optInFormURL = null;

  @JsonProperty("OptInForm Name")
  private String optInFormName = null;

  @JsonProperty("OptInIP Address")
  private String optInIPAddress = null;

  public GDPRFields optInSource(String optInSource) {
    this.optInSource = optInSource;
    return this;
  }

   /**
   * Get optInSource
   * @return optInSource
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getOptInSource() {
    return optInSource;
  }

  public void setOptInSource(String optInSource) {
    this.optInSource = optInSource;
  }

  public GDPRFields optInMethod(String optInMethod) {
    this.optInMethod = optInMethod;
    return this;
  }

   /**
   * Get optInMethod
   * @return optInMethod
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getOptInMethod() {
    return optInMethod;
  }

  public void setOptInMethod(String optInMethod) {
    this.optInMethod = optInMethod;
  }

  public GDPRFields optInAnnotation(String optInAnnotation) {
    this.optInAnnotation = optInAnnotation;
    return this;
  }

   /**
   * Get optInAnnotation
   * @return optInAnnotation
  **/
  @ApiModelProperty(value = "")

 @Size(max=2048)
  public String getOptInAnnotation() {
    return optInAnnotation;
  }

  public void setOptInAnnotation(String optInAnnotation) {
    this.optInAnnotation = optInAnnotation;
  }

  public GDPRFields optInSupportingURL(String optInSupportingURL) {
    this.optInSupportingURL = optInSupportingURL;
    return this;
  }

   /**
   * Get optInSupportingURL
   * @return optInSupportingURL
  **/
  @ApiModelProperty(value = "")

 @Size(max=2048)
  public String getOptInSupportingURL() {
    return optInSupportingURL;
  }

  public void setOptInSupportingURL(String optInSupportingURL) {
    this.optInSupportingURL = optInSupportingURL;
  }

  public GDPRFields optInFormURL(String optInFormURL) {
    this.optInFormURL = optInFormURL;
    return this;
  }

   /**
   * Get optInFormURL
   * @return optInFormURL
  **/
  @ApiModelProperty(value = "")

 @Size(max=2048)
  public String getOptInFormURL() {
    return optInFormURL;
  }

  public void setOptInFormURL(String optInFormURL) {
    this.optInFormURL = optInFormURL;
  }

  public GDPRFields optInFormName(String optInFormName) {
    this.optInFormName = optInFormName;
    return this;
  }

   /**
   * Get optInFormName
   * @return optInFormName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getOptInFormName() {
    return optInFormName;
  }

  public void setOptInFormName(String optInFormName) {
    this.optInFormName = optInFormName;
  }

  public GDPRFields optInIPAddress(String optInIPAddress) {
    this.optInIPAddress = optInIPAddress;
    return this;
  }

   /**
   * Get optInIPAddress
   * @return optInIPAddress
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getOptInIPAddress() {
    return optInIPAddress;
  }

  public void setOptInIPAddress(String optInIPAddress) {
    this.optInIPAddress = optInIPAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GDPRFields gdPRFields = (GDPRFields) o;
    return Objects.equals(this.optInSource, gdPRFields.optInSource) &&
        Objects.equals(this.optInMethod, gdPRFields.optInMethod) &&
        Objects.equals(this.optInAnnotation, gdPRFields.optInAnnotation) &&
        Objects.equals(this.optInSupportingURL, gdPRFields.optInSupportingURL) &&
        Objects.equals(this.optInFormURL, gdPRFields.optInFormURL) &&
        Objects.equals(this.optInFormName, gdPRFields.optInFormName) &&
        Objects.equals(this.optInIPAddress, gdPRFields.optInIPAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optInSource, optInMethod, optInAnnotation, optInSupportingURL, optInFormURL, optInFormName, optInIPAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRFields {\n");
    
    sb.append("    optInSource: ").append(toIndentedString(optInSource)).append("\n");
    sb.append("    optInMethod: ").append(toIndentedString(optInMethod)).append("\n");
    sb.append("    optInAnnotation: ").append(toIndentedString(optInAnnotation)).append("\n");
    sb.append("    optInSupportingURL: ").append(toIndentedString(optInSupportingURL)).append("\n");
    sb.append("    optInFormURL: ").append(toIndentedString(optInFormURL)).append("\n");
    sb.append("    optInFormName: ").append(toIndentedString(optInFormName)).append("\n");
    sb.append("    optInIPAddress: ").append(toIndentedString(optInIPAddress)).append("\n");
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

