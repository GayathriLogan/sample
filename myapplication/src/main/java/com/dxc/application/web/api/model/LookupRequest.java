package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LookupRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class LookupRequest   {
  @JsonProperty("systemName")
  private String systemName = null;

  @JsonProperty("systemUniqueId")
  private String systemUniqueId = null;

  public LookupRequest systemName(String systemName) {
    this.systemName = systemName;
    return this;
  }

   /**
   * Get systemName
   * @return systemName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=60)
  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public LookupRequest systemUniqueId(String systemUniqueId) {
    this.systemUniqueId = systemUniqueId;
    return this;
  }

   /**
   * Get systemUniqueId
   * @return systemUniqueId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

 @Size(max=100)
  public String getSystemUniqueId() {
    return systemUniqueId;
  }

  public void setSystemUniqueId(String systemUniqueId) {
    this.systemUniqueId = systemUniqueId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupRequest lookupRequest = (LookupRequest) o;
    return Objects.equals(this.systemName, lookupRequest.systemName) &&
        Objects.equals(this.systemUniqueId, lookupRequest.systemUniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemName, systemUniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupRequest {\n");
    
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    systemUniqueId: ").append(toIndentedString(systemUniqueId)).append("\n");
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

