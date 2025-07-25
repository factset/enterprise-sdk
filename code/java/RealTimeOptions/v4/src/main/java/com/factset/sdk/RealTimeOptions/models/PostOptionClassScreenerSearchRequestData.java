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
import com.factset.sdk.RealTimeOptions.models.PostOptionClassScreenerSearchRequestDataCategory;
import com.factset.sdk.RealTimeOptions.models.PostOptionClassScreenerSearchRequestDataCurrency;
import com.factset.sdk.RealTimeOptions.models.PostOptionClassScreenerSearchRequestDataMarket;
import com.factset.sdk.RealTimeOptions.models.PostOptionClassScreenerSearchRequestDataText;
import com.factset.sdk.RealTimeOptions.models.PostOptionClassScreenerSearchRequestDataUnderlying;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostOptionClassScreenerSearchRequestData.JSON_PROPERTY_TEXT,
  PostOptionClassScreenerSearchRequestData.JSON_PROPERTY_MARKET,
  PostOptionClassScreenerSearchRequestData.JSON_PROPERTY_UNDERLYING,
  PostOptionClassScreenerSearchRequestData.JSON_PROPERTY_CURRENCY,
  PostOptionClassScreenerSearchRequestData.JSON_PROPERTY_CATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostOptionClassScreenerSearchRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TEXT = "text";
  private PostOptionClassScreenerSearchRequestDataText text;

  public static final String JSON_PROPERTY_MARKET = "market";
  private PostOptionClassScreenerSearchRequestDataMarket market;

  public static final String JSON_PROPERTY_UNDERLYING = "underlying";
  private PostOptionClassScreenerSearchRequestDataUnderlying underlying;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private PostOptionClassScreenerSearchRequestDataCurrency currency;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private PostOptionClassScreenerSearchRequestDataCategory category;

  public PostOptionClassScreenerSearchRequestData() { 
  }

  public PostOptionClassScreenerSearchRequestData text(PostOptionClassScreenerSearchRequestDataText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionClassScreenerSearchRequestDataText getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(PostOptionClassScreenerSearchRequestDataText text) {
    this.text = text;
  }


  public PostOptionClassScreenerSearchRequestData market(PostOptionClassScreenerSearchRequestDataMarket market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionClassScreenerSearchRequestDataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(PostOptionClassScreenerSearchRequestDataMarket market) {
    this.market = market;
  }


  public PostOptionClassScreenerSearchRequestData underlying(PostOptionClassScreenerSearchRequestDataUnderlying underlying) {
    this.underlying = underlying;
    return this;
  }

   /**
   * Get underlying
   * @return underlying
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionClassScreenerSearchRequestDataUnderlying getUnderlying() {
    return underlying;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlying(PostOptionClassScreenerSearchRequestDataUnderlying underlying) {
    this.underlying = underlying;
  }


  public PostOptionClassScreenerSearchRequestData currency(PostOptionClassScreenerSearchRequestDataCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionClassScreenerSearchRequestDataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(PostOptionClassScreenerSearchRequestDataCurrency currency) {
    this.currency = currency;
  }


  public PostOptionClassScreenerSearchRequestData category(PostOptionClassScreenerSearchRequestDataCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionClassScreenerSearchRequestDataCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(PostOptionClassScreenerSearchRequestDataCategory category) {
    this.category = category;
  }


  /**
   * Return true if this PostOptionClassScreenerSearchRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOptionClassScreenerSearchRequestData postOptionClassScreenerSearchRequestData = (PostOptionClassScreenerSearchRequestData) o;
    return Objects.equals(this.text, postOptionClassScreenerSearchRequestData.text) &&
        Objects.equals(this.market, postOptionClassScreenerSearchRequestData.market) &&
        Objects.equals(this.underlying, postOptionClassScreenerSearchRequestData.underlying) &&
        Objects.equals(this.currency, postOptionClassScreenerSearchRequestData.currency) &&
        Objects.equals(this.category, postOptionClassScreenerSearchRequestData.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, market, underlying, currency, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOptionClassScreenerSearchRequestData {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    underlying: ").append(toIndentedString(underlying)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

