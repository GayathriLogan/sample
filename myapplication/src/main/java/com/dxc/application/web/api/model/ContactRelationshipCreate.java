package com.dxc.application.web.api.model;

import java.util.Objects;
import com.dxc.application.web.api.model.RequestContactRelationshipService;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactRelationshipCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ContactRelationshipCreate   {
  @JsonProperty("sourceSystemName")
  private String sourceSystemName = null;

  @JsonProperty("sourceSystemUniqueID")
  private String sourceSystemUniqueID = null;

  @JsonProperty("mdmPersonID")
  private String mdmPersonID = null;

  @JsonProperty("ContactRelationship")
  private RequestContactRelationshipService contactRelationship = null;

  public ContactRelationshipCreate sourceSystemName(String sourceSystemName) {
    this.sourceSystemName = sourceSystemName;
    return this;
  }

   /**
   * Get sourceSystemName
   * @return sourceSystemName
  **/
  @ApiModelProperty(value = "")

 @Size(max=60)
  public String getSourceSystemName() {
    return sourceSystemName;
  }

  public void setSourceSystemName(String sourceSystemName) {
    this.sourceSystemName = sourceSystemName;
  }

  public ContactRelationshipCreate sourceSystemUniqueID(String sourceSystemUniqueID) {
    this.sourceSystemUniqueID = sourceSystemUniqueID;
    return this;
  }

   /**
   * Get sourceSystemUniqueID
   * @return sourceSystemUniqueID
  **/
  @ApiModelProperty(value = "")

 @Size(max=100)
  public String getSourceSystemUniqueID() {
    return sourceSystemUniqueID;
  }

  public void setSourceSystemUniqueID(String sourceSystemUniqueID) {
    this.sourceSystemUniqueID = sourceSystemUniqueID;
  }

  public ContactRelationshipCreate mdmPersonID(String mdmPersonID) {
    this.mdmPersonID = mdmPersonID;
    return this;
  }

   /**
   * Get mdmPersonID
   * @return mdmPersonID
  **/
  @ApiModelProperty(value = "")

 @Size(max=14)
  public String getMdmPersonID() {
    return mdmPersonID;
  }

  public void setMdmPersonID(String mdmPersonID) {
    this.mdmPersonID = mdmPersonID;
  }

  public ContactRelationshipCreate contactRelationship(RequestContactRelationshipService contactRelationship) {
    this.contactRelationship = contactRelationship;
    return this;
  }

   /**
   * Get contactRelationship
   * @return contactRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestContactRelationshipService getContactRelationship() {
    return contactRelationship;
  }

  public void setContactRelationship(RequestContactRelationshipService contactRelationship) {
    this.contactRelationship = contactRelationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRelationshipCreate contactRelationshipCreate = (ContactRelationshipCreate) o;
    return Objects.equals(this.sourceSystemName, contactRelationshipCreate.sourceSystemName) &&
        Objects.equals(this.sourceSystemUniqueID, contactRelationshipCreate.sourceSystemUniqueID) &&
        Objects.equals(this.mdmPersonID, contactRelationshipCreate.mdmPersonID) &&
        Objects.equals(this.contactRelationship, contactRelationshipCreate.contactRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceSystemName, sourceSystemUniqueID, mdmPersonID, contactRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRelationshipCreate {\n");
    
    sb.append("    sourceSystemName: ").append(toIndentedString(sourceSystemName)).append("\n");
    sb.append("    sourceSystemUniqueID: ").append(toIndentedString(sourceSystemUniqueID)).append("\n");
    sb.append("    mdmPersonID: ").append(toIndentedString(mdmPersonID)).append("\n");
    sb.append("    contactRelationship: ").append(toIndentedString(contactRelationship)).append("\n");
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

