/*
 * Real-Time Options API
 * The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api). 
 *
 * The version of the OpenAPI document: 4.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeOptions.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassValueRangesGetDataLifeCycleExpirationMonthItems;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassValueRangesGetDataLifeCycleExpirationYearItems;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeOptions.JSON;


/**
 * Values related to the expiration month and year.
 */
@ApiModel(description = "Values related to the expiration month and year.")
@JsonPropertyOrder({
  PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration.JSON_PROPERTY_MONTH,
  PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration.JSON_PROPERTY_YEAR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MONTH = "month";
  private java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationMonthItems> month = null;

  public static final String JSON_PROPERTY_YEAR = "year";
  private java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationYearItems> year = null;

  public PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration() { 
  }

  public PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration month(java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationMonthItems> month) {
    this.month = month;
    return this;
  }

  public PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration addMonthItem(PostOptionByClassValueRangesGetDataLifeCycleExpirationMonthItems monthItem) {
    if (this.month == null) {
      this.month = new java.util.ArrayList<>();
    }
    this.month.add(monthItem);
    return this;
  }

   /**
   * Expiration month.
   * @return month
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Expiration month.")
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationMonthItems> getMonth() {
    return month;
  }


  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonth(java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationMonthItems> month) {
    this.month = month;
  }


  public PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration year(java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationYearItems> year) {
    this.year = year;
    return this;
  }

  public PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration addYearItem(PostOptionByClassValueRangesGetDataLifeCycleExpirationYearItems yearItem) {
    if (this.year == null) {
      this.year = new java.util.ArrayList<>();
    }
    this.year.add(yearItem);
    return this;
  }

   /**
   * Expiration year.
   * @return year
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Expiration year.")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationYearItems> getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(java.util.List<PostOptionByClassValueRangesGetDataLifeCycleExpirationYearItems> year) {
    this.year = year;
  }


  /**
   * Return true if this PostOptionByClassValueRangesGetDataItems_lifeCycle_expiration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration postOptionByClassValueRangesGetDataItemsLifeCycleExpiration = (PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration) o;
    return Objects.equals(this.month, postOptionByClassValueRangesGetDataItemsLifeCycleExpiration.month) &&
        Objects.equals(this.year, postOptionByClassValueRangesGetDataItemsLifeCycleExpiration.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOptionByClassValueRangesGetDataItemsLifeCycleExpiration {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

