package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDemographicAssignmentInnerDemographicAssignmentRankItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseDemographicAssignmentInnerDemographicAssignmentRankItems   {
  @JsonProperty("demographicRankItem")
  private String demographicRankItem = null;

  @JsonProperty("demographicRankOrdinalNumber")
  private String demographicRankOrdinalNumber = null;

  public ResponseDemographicAssignmentInnerDemographicAssignmentRankItems demographicRankItem(String demographicRankItem) {
    this.demographicRankItem = demographicRankItem;
    return this;
  }

   /**
   * Get demographicRankItem
   * @return demographicRankItem
  **/
  @ApiModelProperty(value = "")


  public String getDemographicRankItem() {
    return demographicRankItem;
  }

  public void setDemographicRankItem(String demographicRankItem) {
    this.demographicRankItem = demographicRankItem;
  }

  public ResponseDemographicAssignmentInnerDemographicAssignmentRankItems demographicRankOrdinalNumber(String demographicRankOrdinalNumber) {
    this.demographicRankOrdinalNumber = demographicRankOrdinalNumber;
    return this;
  }

   /**
   * Get demographicRankOrdinalNumber
   * @return demographicRankOrdinalNumber
  **/
  @ApiModelProperty(value = "")


  public String getDemographicRankOrdinalNumber() {
    return demographicRankOrdinalNumber;
  }

  public void setDemographicRankOrdinalNumber(String demographicRankOrdinalNumber) {
    this.demographicRankOrdinalNumber = demographicRankOrdinalNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDemographicAssignmentInnerDemographicAssignmentRankItems responseDemographicAssignmentInnerDemographicAssignmentRankItems = (ResponseDemographicAssignmentInnerDemographicAssignmentRankItems) o;
    return Objects.equals(this.demographicRankItem, responseDemographicAssignmentInnerDemographicAssignmentRankItems.demographicRankItem) &&
        Objects.equals(this.demographicRankOrdinalNumber, responseDemographicAssignmentInnerDemographicAssignmentRankItems.demographicRankOrdinalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demographicRankItem, demographicRankOrdinalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDemographicAssignmentInnerDemographicAssignmentRankItems {\n");
    
    sb.append("    demographicRankItem: ").append(toIndentedString(demographicRankItem)).append("\n");
    sb.append("    demographicRankOrdinalNumber: ").append(toIndentedString(demographicRankOrdinalNumber)).append("\n");
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

