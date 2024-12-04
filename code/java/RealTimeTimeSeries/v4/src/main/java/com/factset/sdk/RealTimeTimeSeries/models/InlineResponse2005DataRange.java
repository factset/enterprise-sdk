/*
 * Real-Time Time Series API
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeTimeSeries.models;

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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * Date range for the returned time series.
 */
@ApiModel(description = "Date range for the returned time series.")
@JsonPropertyOrder({
  InlineResponse2005DataRange.JSON_PROPERTY_START,
  InlineResponse2005DataRange.JSON_PROPERTY_END
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2005DataRange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private LocalDate start;

  public static final String JSON_PROPERTY_END = "end";
  private LocalDate end;

  public InlineResponse2005DataRange() { 
  }

  @JsonCreator
  public InlineResponse2005DataRange(
    @JsonProperty(value=JSON_PROPERTY_START, required=true) LocalDate start, 
    @JsonProperty(value=JSON_PROPERTY_END, required=true) LocalDate end
  ) {
    this();
    this.start = start;
    this.end = end;
  }

  public InlineResponse2005DataRange start(LocalDate start) {
    this.start = start;
    return this;
  }

   /**
   * The starting point of the date range (inclusive).
   * @return start
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Tue Dec 24 00:00:00 UTC 2024", required = true, value = "The starting point of the date range (inclusive).")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(LocalDate start) {
    this.start = start;
  }


  public InlineResponse2005DataRange end(LocalDate end) {
    this.end = end;
    return this;
  }

   /**
   * The ending point of the date range (exclusive).
   * @return end
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Tue Dec 24 00:00:00 UTC 2024", required = true, value = "The ending point of the date range (exclusive).")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(LocalDate end) {
    this.end = end;
  }


  /**
   * Return true if this inline_response_200_5_data_range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataRange inlineResponse2005DataRange = (InlineResponse2005DataRange) o;
    return Objects.equals(this.start, inlineResponse2005DataRange.start) &&
        Objects.equals(this.end, inlineResponse2005DataRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataRange {\n");
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

