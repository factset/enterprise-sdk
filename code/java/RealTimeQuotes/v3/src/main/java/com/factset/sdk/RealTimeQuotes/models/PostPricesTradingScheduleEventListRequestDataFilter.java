/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.PostPricesTradingScheduleEventListRequestDataFilterRange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
 */
@ApiModel(description = "Criteria that filter the items in the response list; only items that match all of the criteria are returned.")
@JsonPropertyOrder({
  PostPricesTradingScheduleEventListRequestDataFilter.JSON_PROPERTY_TYPES,
  PostPricesTradingScheduleEventListRequestDataFilter.JSON_PROPERTY_RANGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostPricesTradingScheduleEventListRequestDataFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPES = "types";
  private java.util.List<BigDecimal> types = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_RANGE = "range";
  private PostPricesTradingScheduleEventListRequestDataFilterRange range;

  public PostPricesTradingScheduleEventListRequestDataFilter() { 
  }

  @JsonCreator
  public PostPricesTradingScheduleEventListRequestDataFilter(
    @JsonProperty(value=JSON_PROPERTY_TYPES, required=true) java.util.List<BigDecimal> types, 
    @JsonProperty(value=JSON_PROPERTY_RANGE, required=true) PostPricesTradingScheduleEventListRequestDataFilterRange range
  ) {
    this();
    this.types = types;
    this.range = range;
  }

  public PostPricesTradingScheduleEventListRequestDataFilter types(java.util.List<BigDecimal> types) {
    this.types = types;
    return this;
  }

  public PostPricesTradingScheduleEventListRequestDataFilter addTypesItem(BigDecimal typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * List of trading schedule event types to return. See endpoint &#x60;/prices/tradingSchedule/event/type/list&#x60; for valid values.
   * @return types
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of trading schedule event types to return. See endpoint `/prices/tradingSchedule/event/type/list` for valid values.")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<BigDecimal> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTypes(java.util.List<BigDecimal> types) {
    this.types = types;
  }


  public PostPricesTradingScheduleEventListRequestDataFilter range(PostPricesTradingScheduleEventListRequestDataFilterRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostPricesTradingScheduleEventListRequestDataFilterRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRange(PostPricesTradingScheduleEventListRequestDataFilterRange range) {
    this.range = range;
  }


  /**
   * Return true if this PostPricesTradingScheduleEventListRequest_data_filter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPricesTradingScheduleEventListRequestDataFilter postPricesTradingScheduleEventListRequestDataFilter = (PostPricesTradingScheduleEventListRequestDataFilter) o;
    return Objects.equals(this.types, postPricesTradingScheduleEventListRequestDataFilter.types) &&
        Objects.equals(this.range, postPricesTradingScheduleEventListRequestDataFilter.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPricesTradingScheduleEventListRequestDataFilter {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

