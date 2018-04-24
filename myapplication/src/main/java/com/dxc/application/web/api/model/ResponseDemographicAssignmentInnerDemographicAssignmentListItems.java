package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDemographicAssignmentInnerDemographicAssignmentListItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponseDemographicAssignmentInnerDemographicAssignmentListItems   {
  @JsonProperty("demographicListItem")
  private String demographicListItem = null;

  public ResponseDemographicAssignmentInnerDemographicAssignmentListItems demographicListItem(String demographicListItem) {
    this.demographicListItem = demographicListItem;
    return this;
  }

   /**
   * Get demographicListItem
   * @return demographicListItem
  **/
  @ApiModelProperty(value = "")


  public String getDemographicListItem() {
    return demographicListItem;
  }

  public void setDemographicListItem(String demographicListItem) {
    this.demographicListItem = demographicListItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDemographicAssignmentInnerDemographicAssignmentListItems responseDemographicAssignmentInnerDemographicAssignmentListItems = (ResponseDemographicAssignmentInnerDemographicAssignmentListItems) o;
    return Objects.equals(this.demographicListItem, responseDemographicAssignmentInnerDemographicAssignmentListItems.demographicListItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demographicListItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDemographicAssignmentInnerDemographicAssignmentListItems {\n");
    
    sb.append("    demographicListItem: ").append(toIndentedString(demographicListItem)).append("\n");
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

