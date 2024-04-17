/*
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 3.0.0
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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * Single summary record. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).
 */
@ApiModel(description = "Single summary record. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).")
@JsonPropertyOrder({
  InlineResponse2009DataSubsample.JSON_PROPERTY_TIME,
  InlineResponse2009DataSubsample.JSON_PROPERTY_FIRST,
  InlineResponse2009DataSubsample.JSON_PROPERTY_LAST,
  InlineResponse2009DataSubsample.JSON_PROPERTY_LOW,
  InlineResponse2009DataSubsample.JSON_PROPERTY_HIGH,
  InlineResponse2009DataSubsample.JSON_PROPERTY_TRADING_VOLUME,
  InlineResponse2009DataSubsample.JSON_PROPERTY_TRADING_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2009DataSubsample implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<String> time = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST = "first";
  private JsonNullable<BigDecimal> first = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_LAST = "last";
  private JsonNullable<BigDecimal> last = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_LOW = "low";
  private JsonNullable<BigDecimal> low = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_HIGH = "high";
  private JsonNullable<BigDecimal> high = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private JsonNullable<BigDecimal> tradingVolume = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private JsonNullable<BigDecimal> tradingValue = JsonNullable.<BigDecimal>undefined();

  public InlineResponse2009DataSubsample() { 
  }

  public InlineResponse2009DataSubsample time(String time) {
    this.time = JsonNullable.<String>of(time);
    return this;
  }

   /**
   * Date and time of the start of the subsample.
   * @return time
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the start of the subsample.")
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


  public InlineResponse2009DataSubsample first(BigDecimal first) {
    this.first = JsonNullable.<BigDecimal>of(first);
    return this;
  }

   /**
   * First price of the subsample.
   * @return first
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "First price of the subsample.")
  @JsonIgnore

  public BigDecimal getFirst() {
        return first.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getFirst_JsonNullable() {
    return first;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST)
  public void setFirst_JsonNullable(JsonNullable<BigDecimal> first) {
    this.first = first;
  }

  public void setFirst(BigDecimal first) {
    this.first = JsonNullable.<BigDecimal>of(first);
  }


  public InlineResponse2009DataSubsample last(BigDecimal last) {
    this.last = JsonNullable.<BigDecimal>of(last);
    return this;
  }

   /**
   * Last price of the subsample.
   * @return last
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Last price of the subsample.")
  @JsonIgnore

  public BigDecimal getLast() {
        return last.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getLast_JsonNullable() {
    return last;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST)
  public void setLast_JsonNullable(JsonNullable<BigDecimal> last) {
    this.last = last;
  }

  public void setLast(BigDecimal last) {
    this.last = JsonNullable.<BigDecimal>of(last);
  }


  public InlineResponse2009DataSubsample low(BigDecimal low) {
    this.low = JsonNullable.<BigDecimal>of(low);
    return this;
  }

   /**
   * Lowest price of the subsample.
   * @return low
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Lowest price of the subsample.")
  @JsonIgnore

  public BigDecimal getLow() {
        return low.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getLow_JsonNullable() {
    return low;
  }
  
  @JsonProperty(JSON_PROPERTY_LOW)
  public void setLow_JsonNullable(JsonNullable<BigDecimal> low) {
    this.low = low;
  }

  public void setLow(BigDecimal low) {
    this.low = JsonNullable.<BigDecimal>of(low);
  }


  public InlineResponse2009DataSubsample high(BigDecimal high) {
    this.high = JsonNullable.<BigDecimal>of(high);
    return this;
  }

   /**
   * Highest price of the subsample.
   * @return high
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Highest price of the subsample.")
  @JsonIgnore

  public BigDecimal getHigh() {
        return high.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getHigh_JsonNullable() {
    return high;
  }
  
  @JsonProperty(JSON_PROPERTY_HIGH)
  public void setHigh_JsonNullable(JsonNullable<BigDecimal> high) {
    this.high = high;
  }

  public void setHigh(BigDecimal high) {
    this.high = JsonNullable.<BigDecimal>of(high);
  }


  public InlineResponse2009DataSubsample tradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = JsonNullable.<BigDecimal>of(tradingVolume);
    return this;
  }

   /**
   * Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.
   * @return tradingVolume
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.")
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


  public InlineResponse2009DataSubsample tradingValue(BigDecimal tradingValue) {
    this.tradingValue = JsonNullable.<BigDecimal>of(tradingValue);
    return this;
  }

   /**
   * Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit.
   * @return tradingValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute `currency` in endpoint `/prices/get` for its unit.")
  @JsonIgnore

  public BigDecimal getTradingValue() {
        return tradingValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getTradingValue_JsonNullable() {
    return tradingValue;
  }
  
  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  public void setTradingValue_JsonNullable(JsonNullable<BigDecimal> tradingValue) {
    this.tradingValue = tradingValue;
  }

  public void setTradingValue(BigDecimal tradingValue) {
    this.tradingValue = JsonNullable.<BigDecimal>of(tradingValue);
  }


  /**
   * Return true if this inline_response_200_9_data_subsample object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009DataSubsample inlineResponse2009DataSubsample = (InlineResponse2009DataSubsample) o;
    return equalsNullable(this.time, inlineResponse2009DataSubsample.time) &&
        equalsNullable(this.first, inlineResponse2009DataSubsample.first) &&
        equalsNullable(this.last, inlineResponse2009DataSubsample.last) &&
        equalsNullable(this.low, inlineResponse2009DataSubsample.low) &&
        equalsNullable(this.high, inlineResponse2009DataSubsample.high) &&
        equalsNullable(this.tradingVolume, inlineResponse2009DataSubsample.tradingVolume) &&
        equalsNullable(this.tradingValue, inlineResponse2009DataSubsample.tradingValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(time), hashCodeNullable(first), hashCodeNullable(last), hashCodeNullable(low), hashCodeNullable(high), hashCodeNullable(tradingVolume), hashCodeNullable(tradingValue));
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
    sb.append("class InlineResponse2009DataSubsample {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
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

