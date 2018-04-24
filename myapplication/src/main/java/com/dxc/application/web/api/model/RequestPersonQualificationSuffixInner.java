package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestPersonQualificationSuffixInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class RequestPersonQualificationSuffixInner   {
  @JsonProperty("qualificationSuffixName")
  private String qualificationSuffixName = null;

  @JsonProperty("qualificationSuffixOrdinalNumber")
  private String qualificationSuffixOrdinalNumber = null;

  public RequestPersonQualificationSuffixInner qualificationSuffixName(String qualificationSuffixName) {
    this.qualificationSuffixName = qualificationSuffixName;
    return this;
  }

   /**
   * Get qualificationSuffixName
   * @return qualificationSuffixName
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getQualificationSuffixName() {
    return qualificationSuffixName;
  }

  public void setQualificationSuffixName(String qualificationSuffixName) {
    this.qualificationSuffixName = qualificationSuffixName;
  }

  public RequestPersonQualificationSuffixInner qualificationSuffixOrdinalNumber(String qualificationSuffixOrdinalNumber) {
    this.qualificationSuffixOrdinalNumber = qualificationSuffixOrdinalNumber;
    return this;
  }

   /**
   * Get qualificationSuffixOrdinalNumber
   * @return qualificationSuffixOrdinalNumber
  **/
  @ApiModelProperty(value = "")

 @Size(max=20)
  public String getQualificationSuffixOrdinalNumber() {
    return qualificationSuffixOrdinalNumber;
  }

  public void setQualificationSuffixOrdinalNumber(String qualificationSuffixOrdinalNumber) {
    this.qualificationSuffixOrdinalNumber = qualificationSuffixOrdinalNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPersonQualificationSuffixInner requestPersonQualificationSuffixInner = (RequestPersonQualificationSuffixInner) o;
    return Objects.equals(this.qualificationSuffixName, requestPersonQualificationSuffixInner.qualificationSuffixName) &&
        Objects.equals(this.qualificationSuffixOrdinalNumber, requestPersonQualificationSuffixInner.qualificationSuffixOrdinalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualificationSuffixName, qualificationSuffixOrdinalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPersonQualificationSuffixInner {\n");
    
    sb.append("    qualificationSuffixName: ").append(toIndentedString(qualificationSuffixName)).append("\n");
    sb.append("    qualificationSuffixOrdinalNumber: ").append(toIndentedString(qualificationSuffixOrdinalNumber)).append("\n");
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

