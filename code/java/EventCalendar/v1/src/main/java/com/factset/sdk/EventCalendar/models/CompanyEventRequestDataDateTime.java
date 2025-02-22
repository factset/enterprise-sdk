/*
 * Event Calendar API
 * Retrieves events for companies
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.EventCalendar.models;

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
import com.factset.sdk.EventCalendar.JSON;


/**
 * CompanyEventRequestDataDateTime
 */
@JsonPropertyOrder({
  CompanyEventRequestDataDateTime.JSON_PROPERTY_START,
  CompanyEventRequestDataDateTime.JSON_PROPERTY_END
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyEventRequestDataDateTime implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public CompanyEventRequestDataDateTime() { 
  }

  public CompanyEventRequestDataDateTime start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Event start time as date/time string according to ISO 8601.
   * @return start
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-12-01T00:00Z", value = "Event start time as date/time string according to ISO 8601.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public CompanyEventRequestDataDateTime end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Event end time as date/time string according to ISO 8601.
   * @return end
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-12-31T22:59:02Z", value = "Event end time as date/time string according to ISO 8601.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  /**
   * Return true if this companyEventRequest_data_dateTime object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyEventRequestDataDateTime companyEventRequestDataDateTime = (CompanyEventRequestDataDateTime) o;
    return Objects.equals(this.start, companyEventRequestDataDateTime.start) &&
        Objects.equals(this.end, companyEventRequestDataDateTime.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyEventRequestDataDateTime {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

