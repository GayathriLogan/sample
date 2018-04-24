package com.dxc.application.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponsePrivacyIsolationInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-23T10:17:27.113+05:30")

public class ResponsePrivacyIsolationInner   {
  @JsonProperty("sourceCode")
  private String sourceCode = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public ResponsePrivacyIsolationInner sourceCode(String sourceCode) {
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

  public ResponsePrivacyIsolationInner reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ResponsePrivacyIsolationInner statusCode(String statusCode) {
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

  public ResponsePrivacyIsolationInner comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ResponsePrivacyIsolationInner timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePrivacyIsolationInner responsePrivacyIsolationInner = (ResponsePrivacyIsolationInner) o;
    return Objects.equals(this.sourceCode, responsePrivacyIsolationInner.sourceCode) &&
        Objects.equals(this.reason, responsePrivacyIsolationInner.reason) &&
        Objects.equals(this.statusCode, responsePrivacyIsolationInner.statusCode) &&
        Objects.equals(this.comment, responsePrivacyIsolationInner.comment) &&
        Objects.equals(this.timestamp, responsePrivacyIsolationInner.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCode, reason, statusCode, comment, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePrivacyIsolationInner {\n");
    
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

