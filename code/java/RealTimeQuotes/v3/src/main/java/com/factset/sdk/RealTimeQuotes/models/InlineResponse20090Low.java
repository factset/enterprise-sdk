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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Trade with the lowest price of the trading day.
 */
@ApiModel(description = "Trade with the lowest price of the trading day.")
@JsonPropertyOrder({
  InlineResponse20090Low.JSON_PROPERTY_TIME,
  InlineResponse20090Low.JSON_PROPERTY_PRICE,
  InlineResponse20090Low.JSON_PROPERTY_TRADING_VOLUME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20090Low implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<String> time = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE = "price";
  private JsonNullable<BigDecimal> price = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private JsonNullable<BigDecimal> tradingVolume = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20090Low() { 
  }

  public InlineResponse20090Low time(String time) {
    this.time = JsonNullable.<String>of(time);
    return this;
  }

   /**
   * Date and time.
   * @return time
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Date and time.")
  @JsonIgnore

  public String getTime() {
        return time.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTime_JsonNullable() {
    return time;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME)
  public void setTime_JsonNullable(JsonNullable<String> time) {
    this.time = time;
  }

  public void setTime(String time) {
    this.time = JsonNullable.<String>of(time);
  }


  public InlineResponse20090Low price(BigDecimal price) {
    this.price = JsonNullable.<BigDecimal>of(price);
    return this;
  }

   /**
   * Price value. See attribute &#x60;valueUnit&#x60; for its unit.
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Price value. See attribute `valueUnit` for its unit.")
  @JsonIgnore

  public BigDecimal getPrice() {
        return price.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getPrice_JsonNullable() {
    return price;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE)
  public void setPrice_JsonNullable(JsonNullable<BigDecimal> price) {
    this.price = price;
  }

  public void setPrice(BigDecimal price) {
    this.price = JsonNullable.<BigDecimal>of(price);
  }


  public InlineResponse20090Low tradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = JsonNullable.<BigDecimal>of(tradingVolume);
    return this;
  }

   /**
   * Number of units (e.g. shares) traded.
   * @return tradingVolume
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of units (e.g. shares) traded.")
  @JsonIgnore

  public BigDecimal getTradingVolume() {
        return tradingVolume.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRADING_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getTradingVolume_JsonNullable() {
    return tradingVolume;
  }
  
  @JsonProperty(JSON_PROPERTY_TRADING_VOLUME)
  public void setTradingVolume_JsonNullable(JsonNullable<BigDecimal> tradingVolume) {
    this.tradingVolume = tradingVolume;
  }

  public void setTradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = JsonNullable.<BigDecimal>of(tradingVolume);
  }


  /**
   * Return true if this inline_response_200_90_low object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20090Low inlineResponse20090Low = (InlineResponse20090Low) o;
    return equalsNullable(this.time, inlineResponse20090Low.time) &&
        equalsNullable(this.price, inlineResponse20090Low.price) &&
        equalsNullable(this.tradingVolume, inlineResponse20090Low.tradingVolume);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(time), hashCodeNullable(price), hashCodeNullable(tradingVolume));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20090Low {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
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

