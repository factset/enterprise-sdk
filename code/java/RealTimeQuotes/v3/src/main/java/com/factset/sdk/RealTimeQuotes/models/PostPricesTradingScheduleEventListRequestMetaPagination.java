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
 * Pagination attributes for the cursor-based pagination strategy.
 */
@ApiModel(description = "Pagination attributes for the cursor-based pagination strategy.")
@JsonPropertyOrder({
  PostPricesTradingScheduleEventListRequestMetaPagination.JSON_PROPERTY_CURSOR,
  PostPricesTradingScheduleEventListRequestMetaPagination.JSON_PROPERTY_LIMIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostPricesTradingScheduleEventListRequestMetaPagination implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private BigDecimal limit = new BigDecimal("20");

  public PostPricesTradingScheduleEventListRequestMetaPagination() { 
  }

  public PostPricesTradingScheduleEventListRequestMetaPagination cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default).
   * @return cursor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default).")
  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCursor() {
    return cursor;
  }


  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  public PostPricesTradingScheduleEventListRequestMetaPagination limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Non-negative maximum number of entries to return.
   * minimum: 0
   * maximum: 500
   * @return limit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Non-negative maximum number of entries to return.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  /**
   * Return true if this PostPricesTradingScheduleEventListRequest_meta_pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPricesTradingScheduleEventListRequestMetaPagination postPricesTradingScheduleEventListRequestMetaPagination = (PostPricesTradingScheduleEventListRequestMetaPagination) o;
    return Objects.equals(this.cursor, postPricesTradingScheduleEventListRequestMetaPagination.cursor) &&
        Objects.equals(this.limit, postPricesTradingScheduleEventListRequestMetaPagination.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPricesTradingScheduleEventListRequestMetaPagination {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

