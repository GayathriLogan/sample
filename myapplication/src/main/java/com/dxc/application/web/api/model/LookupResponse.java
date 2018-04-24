package com.dxc.application.web.api.model;

import java.util.Objects;
import com.dxc.application.web.api.model.ResponsePerson;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LookupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class LookupResponse   {
  @JsonProperty("ResponsePerson")
  private ResponsePerson responsePerson = null;

  public LookupResponse responsePerson(ResponsePerson responsePerson) {
    this.responsePerson = responsePerson;
    return this;
  }

   /**
   * Get responsePerson
   * @return responsePerson
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResponsePerson getResponsePerson() {
    return responsePerson;
  }

  public void setResponsePerson(ResponsePerson responsePerson) {
    this.responsePerson = responsePerson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupResponse lookupResponse = (LookupResponse) o;
    return Objects.equals(this.responsePerson, lookupResponse.responsePerson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsePerson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupResponse {\n");
    
    sb.append("    responsePerson: ").append(toIndentedString(responsePerson)).append("\n");
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

