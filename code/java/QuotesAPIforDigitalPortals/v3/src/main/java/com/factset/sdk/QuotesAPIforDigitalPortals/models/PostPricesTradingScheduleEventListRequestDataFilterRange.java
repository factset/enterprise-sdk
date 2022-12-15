/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Date and time range for the time series. A valid time range is between 1900-01-01 and 24 hours and 5 minutes into the future.
 */
@ApiModel(description = "Date and time range for the time series. A valid time range is between 1900-01-01 and 24 hours and 5 minutes into the future.")
@JsonPropertyOrder({
  PostPricesTradingScheduleEventListRequestDataFilterRange.JSON_PROPERTY_START,
  PostPricesTradingScheduleEventListRequestDataFilterRange.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostPricesTradingScheduleEventListRequestDataFilterRange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public PostPricesTradingScheduleEventListRequestDataFilterRange() { 
  }

  @JsonCreator
  public PostPricesTradingScheduleEventListRequestDataFilterRange(
    @JsonProperty(value=JSON_PROPERTY_START, required=true) String start, 
    @JsonProperty(value=JSON_PROPERTY_END, required=true) String end
  ) {
    this();
    this.start = start;
    this.end = end;
  }

  public PostPricesTradingScheduleEventListRequestDataFilterRange start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The starting point of the time range (inclusive).
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The starting point of the time range (inclusive).")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(String start) {
    this.start = start;
  }


  public PostPricesTradingScheduleEventListRequestDataFilterRange end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The ending point of the time range (exclusive).
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ending point of the time range (exclusive).")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * Return true if this PostPricesTradingScheduleEventListRequest_data_filter_range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPricesTradingScheduleEventListRequestDataFilterRange postPricesTradingScheduleEventListRequestDataFilterRange = (PostPricesTradingScheduleEventListRequestDataFilterRange) o;
    return Objects.equals(this.start, postPricesTradingScheduleEventListRequestDataFilterRange.start) &&
        Objects.equals(this.end, postPricesTradingScheduleEventListRequestDataFilterRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPricesTradingScheduleEventListRequestDataFilterRange {\n");
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

