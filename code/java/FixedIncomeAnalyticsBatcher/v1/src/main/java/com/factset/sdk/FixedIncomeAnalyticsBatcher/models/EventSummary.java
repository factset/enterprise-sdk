/*
 * FIAB API
 * Allow clients to fetch FIAB Analytics through APIs.
 *
 * The version of the OpenAPI document: 1.3.7
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeAnalyticsBatcher.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeAnalyticsBatcher.JSON;


/**
 * EventSummary
 */
@JsonPropertyOrder({
  EventSummary.JSON_PROPERTY_MESSAGE,
  EventSummary.JSON_PROPERTY_SUBMISSIONDATETIME,
  EventSummary.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SUBMISSIONDATETIME = "submissiondatetime";
  private OffsetDateTime submissiondatetime;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public EventSummary() { 
  }

  public EventSummary message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public EventSummary submissiondatetime(OffsetDateTime submissiondatetime) {
    this.submissiondatetime = submissiondatetime;
    return this;
  }

   /**
   * Get submissiondatetime
   * @return submissiondatetime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBMISSIONDATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubmissiondatetime() {
    return submissiondatetime;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSIONDATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissiondatetime(OffsetDateTime submissiondatetime) {
    this.submissiondatetime = submissiondatetime;
  }


  public EventSummary type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this EventSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSummary eventSummary = (EventSummary) o;
    return Objects.equals(this.message, eventSummary.message) &&
        Objects.equals(this.submissiondatetime, eventSummary.submissiondatetime) &&
        Objects.equals(this.type, eventSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, submissiondatetime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSummary {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    submissiondatetime: ").append(toIndentedString(submissiondatetime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

