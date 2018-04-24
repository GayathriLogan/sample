package com.dxc.application.web.api.model;

import java.util.Objects;
import com.dxc.application.web.api.model.ResponseDemographicAssignmentInnerDemographicAssignmentListItems;
import com.dxc.application.web.api.model.ResponseDemographicAssignmentInnerDemographicAssignmentRankItems;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDemographicAssignmentInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseDemographicAssignmentInner   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("sourceCode")
  private String sourceCode = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("expiryDate")
  private OffsetDateTime expiryDate = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("DemographicAssignmentRankItems")
  private List<ResponseDemographicAssignmentInnerDemographicAssignmentRankItems> demographicAssignmentRankItems = null;

  @JsonProperty("DemographicAssignmentListItems")
  private List<ResponseDemographicAssignmentInnerDemographicAssignmentListItems> demographicAssignmentListItems = null;

  public ResponseDemographicAssignmentInner code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ResponseDemographicAssignmentInner statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public ResponseDemographicAssignmentInner sourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

   /**
   * Get sourceCode
   * @return sourceCode
  **/
  @ApiModelProperty(value = "")


  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }

  public ResponseDemographicAssignmentInner typeCode(String typeCode) {
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

  public ResponseDemographicAssignmentInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseDemographicAssignmentInner effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ResponseDemographicAssignmentInner expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public ResponseDemographicAssignmentInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ResponseDemographicAssignmentInner demographicAssignmentRankItems(List<ResponseDemographicAssignmentInnerDemographicAssignmentRankItems> demographicAssignmentRankItems) {
    this.demographicAssignmentRankItems = demographicAssignmentRankItems;
    return this;
  }

  public ResponseDemographicAssignmentInner addDemographicAssignmentRankItemsItem(ResponseDemographicAssignmentInnerDemographicAssignmentRankItems demographicAssignmentRankItemsItem) {
    if (this.demographicAssignmentRankItems == null) {
      this.demographicAssignmentRankItems = new ArrayList<ResponseDemographicAssignmentInnerDemographicAssignmentRankItems>();
    }
    this.demographicAssignmentRankItems.add(demographicAssignmentRankItemsItem);
    return this;
  }

   /**
   * Get demographicAssignmentRankItems
   * @return demographicAssignmentRankItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ResponseDemographicAssignmentInnerDemographicAssignmentRankItems> getDemographicAssignmentRankItems() {
    return demographicAssignmentRankItems;
  }

  public void setDemographicAssignmentRankItems(List<ResponseDemographicAssignmentInnerDemographicAssignmentRankItems> demographicAssignmentRankItems) {
    this.demographicAssignmentRankItems = demographicAssignmentRankItems;
  }

  public ResponseDemographicAssignmentInner demographicAssignmentListItems(List<ResponseDemographicAssignmentInnerDemographicAssignmentListItems> demographicAssignmentListItems) {
    this.demographicAssignmentListItems = demographicAssignmentListItems;
    return this;
  }

  public ResponseDemographicAssignmentInner addDemographicAssignmentListItemsItem(ResponseDemographicAssignmentInnerDemographicAssignmentListItems demographicAssignmentListItemsItem) {
    if (this.demographicAssignmentListItems == null) {
      this.demographicAssignmentListItems = new ArrayList<ResponseDemographicAssignmentInnerDemographicAssignmentListItems>();
    }
    this.demographicAssignmentListItems.add(demographicAssignmentListItemsItem);
    return this;
  }

   /**
   * Get demographicAssignmentListItems
   * @return demographicAssignmentListItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ResponseDemographicAssignmentInnerDemographicAssignmentListItems> getDemographicAssignmentListItems() {
    return demographicAssignmentListItems;
  }

  public void setDemographicAssignmentListItems(List<ResponseDemographicAssignmentInnerDemographicAssignmentListItems> demographicAssignmentListItems) {
    this.demographicAssignmentListItems = demographicAssignmentListItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDemographicAssignmentInner responseDemographicAssignmentInner = (ResponseDemographicAssignmentInner) o;
    return Objects.equals(this.code, responseDemographicAssignmentInner.code) &&
        Objects.equals(this.statusCode, responseDemographicAssignmentInner.statusCode) &&
        Objects.equals(this.sourceCode, responseDemographicAssignmentInner.sourceCode) &&
        Objects.equals(this.typeCode, responseDemographicAssignmentInner.typeCode) &&
        Objects.equals(this.name, responseDemographicAssignmentInner.name) &&
        Objects.equals(this.effectiveDate, responseDemographicAssignmentInner.effectiveDate) &&
        Objects.equals(this.expiryDate, responseDemographicAssignmentInner.expiryDate) &&
        Objects.equals(this.value, responseDemographicAssignmentInner.value) &&
        Objects.equals(this.demographicAssignmentRankItems, responseDemographicAssignmentInner.demographicAssignmentRankItems) &&
        Objects.equals(this.demographicAssignmentListItems, responseDemographicAssignmentInner.demographicAssignmentListItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, statusCode, sourceCode, typeCode, name, effectiveDate, expiryDate, value, demographicAssignmentRankItems, demographicAssignmentListItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDemographicAssignmentInner {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    demographicAssignmentRankItems: ").append(toIndentedString(demographicAssignmentRankItems)).append("\n");
    sb.append("    demographicAssignmentListItems: ").append(toIndentedString(demographicAssignmentListItems)).append("\n");
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

