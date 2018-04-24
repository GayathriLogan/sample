package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPersonSocialMediaInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestPersonSocialMediaInner   {
  @JsonProperty("socialMediaTypeCode")
  private String socialMediaTypeCode = null;

  @JsonProperty("socialMediaHandleName")
  private String socialMediaHandleName = null;

  @JsonProperty("urlText")
  private String urlText = null;

  public RequestPersonSocialMediaInner socialMediaTypeCode(String socialMediaTypeCode) {
    this.socialMediaTypeCode = socialMediaTypeCode;
    return this;
  }

   /**
   * Get socialMediaTypeCode
   * @return socialMediaTypeCode
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getSocialMediaTypeCode() {
    return socialMediaTypeCode;
  }

  public void setSocialMediaTypeCode(String socialMediaTypeCode) {
    this.socialMediaTypeCode = socialMediaTypeCode;
  }

  public RequestPersonSocialMediaInner socialMediaHandleName(String socialMediaHandleName) {
    this.socialMediaHandleName = socialMediaHandleName;
    return this;
  }

   /**
   * Get socialMediaHandleName
   * @return socialMediaHandleName
  **/
  @ApiModelProperty(value = "")

 @Size(max=50)
  public String getSocialMediaHandleName() {
    return socialMediaHandleName;
  }

  public void setSocialMediaHandleName(String socialMediaHandleName) {
    this.socialMediaHandleName = socialMediaHandleName;
  }

  public RequestPersonSocialMediaInner urlText(String urlText) {
    this.urlText = urlText;
    return this;
  }

   /**
   * Get urlText
   * @return urlText
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getUrlText() {
    return urlText;
  }

  public void setUrlText(String urlText) {
    this.urlText = urlText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPersonSocialMediaInner requestPersonSocialMediaInner = (RequestPersonSocialMediaInner) o;
    return Objects.equals(this.socialMediaTypeCode, requestPersonSocialMediaInner.socialMediaTypeCode) &&
        Objects.equals(this.socialMediaHandleName, requestPersonSocialMediaInner.socialMediaHandleName) &&
        Objects.equals(this.urlText, requestPersonSocialMediaInner.urlText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialMediaTypeCode, socialMediaHandleName, urlText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPersonSocialMediaInner {\n");
    
    sb.append("    socialMediaTypeCode: ").append(toIndentedString(socialMediaTypeCode)).append("\n");
    sb.append("    socialMediaHandleName: ").append(toIndentedString(socialMediaHandleName)).append("\n");
    sb.append("    urlText: ").append(toIndentedString(urlText)).append("\n");
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

