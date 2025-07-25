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
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassValueRangesGetRequestDataFilterValidationPrice;
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
 * Validation parameters.
 */
@ApiModel(description = "Validation parameters.")
@JsonPropertyOrder({
  PostOptionByClassValueRangesGetRequestDataFilterValidation.JSON_PROPERTY_ONLY_ACTIVE,
  PostOptionByClassValueRangesGetRequestDataFilterValidation.JSON_PROPERTY_PRICE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostOptionByClassValueRangesGetRequestDataFilterValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ONLY_ACTIVE = "onlyActive";
  private Boolean onlyActive;

  public static final String JSON_PROPERTY_PRICE = "price";
  private PostOptionByClassValueRangesGetRequestDataFilterValidationPrice price;

  public PostOptionByClassValueRangesGetRequestDataFilterValidation() { 
  }

  public PostOptionByClassValueRangesGetRequestDataFilterValidation onlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
    return this;
  }

   /**
   * If &#x60;true&#x60;, only active notations will be returned.
   * @return onlyActive
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If `true`, only active notations will be returned.")
  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyActive() {
    return onlyActive;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
  }


  public PostOptionByClassValueRangesGetRequestDataFilterValidation price(PostOptionByClassValueRangesGetRequestDataFilterValidationPrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionByClassValueRangesGetRequestDataFilterValidationPrice getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(PostOptionByClassValueRangesGetRequestDataFilterValidationPrice price) {
    this.price = price;
  }


  /**
   * Return true if this PostOptionByClassValueRangesGetRequest_data_filter_validation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOptionByClassValueRangesGetRequestDataFilterValidation postOptionByClassValueRangesGetRequestDataFilterValidation = (PostOptionByClassValueRangesGetRequestDataFilterValidation) o;
    return Objects.equals(this.onlyActive, postOptionByClassValueRangesGetRequestDataFilterValidation.onlyActive) &&
        Objects.equals(this.price, postOptionByClassValueRangesGetRequestDataFilterValidation.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyActive, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOptionByClassValueRangesGetRequestDataFilterValidation {\n");
    sb.append("    onlyActive: ").append(toIndentedString(onlyActive)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

