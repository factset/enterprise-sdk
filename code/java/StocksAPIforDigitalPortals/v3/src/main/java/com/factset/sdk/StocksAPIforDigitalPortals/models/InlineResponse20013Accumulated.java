/*
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Summary data accumulated over all trades of the current trading day.
 */
@ApiModel(description = "Summary data accumulated over all trades of the current trading day.")
@JsonPropertyOrder({
  InlineResponse20013Accumulated.JSON_PROPERTY_NUMBER_TRADES,
  InlineResponse20013Accumulated.JSON_PROPERTY_TRADING_VOLUME,
  InlineResponse20013Accumulated.JSON_PROPERTY_TRADING_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20013Accumulated implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NUMBER_TRADES = "numberTrades";
  private JsonNullable<BigDecimal> numberTrades = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private JsonNullable<BigDecimal> tradingVolume = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private JsonNullable<BigDecimal> tradingValue = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20013Accumulated() { 
  }

  public InlineResponse20013Accumulated numberTrades(BigDecimal numberTrades) {
    this.numberTrades = JsonNullable.<BigDecimal>of(numberTrades);
    return this;
  }

   /**
   * Number of trades.
   * @return numberTrades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of trades.")
  @JsonIgnore

  public BigDecimal getNumberTrades() {
        return numberTrades.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getNumberTrades_JsonNullable() {
    return numberTrades;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_TRADES)
  public void setNumberTrades_JsonNullable(JsonNullable<BigDecimal> numberTrades) {
    this.numberTrades = numberTrades;
  }

  public void setNumberTrades(BigDecimal numberTrades) {
    this.numberTrades = JsonNullable.<BigDecimal>of(numberTrades);
  }


  public InlineResponse20013Accumulated tradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = JsonNullable.<BigDecimal>of(tradingVolume);
    return this;
  }

   /**
   * Number of shares traded.
   * @return tradingVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of shares traded.")
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


  public InlineResponse20013Accumulated tradingValue(BigDecimal tradingValue) {
    this.tradingValue = JsonNullable.<BigDecimal>of(tradingValue);
    return this;
  }

   /**
   * Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its currency.
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Monetary equivalent (cash value) of the trades. See attribute `currency` for its currency.")
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
   * Return true if this inline_response_200_13_accumulated object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013Accumulated inlineResponse20013Accumulated = (InlineResponse20013Accumulated) o;
    return equalsNullable(this.numberTrades, inlineResponse20013Accumulated.numberTrades) &&
        equalsNullable(this.tradingVolume, inlineResponse20013Accumulated.tradingVolume) &&
        equalsNullable(this.tradingValue, inlineResponse20013Accumulated.tradingValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(numberTrades), hashCodeNullable(tradingVolume), hashCodeNullable(tradingValue));
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
    sb.append("class InlineResponse20013Accumulated {\n");
    sb.append("    numberTrades: ").append(toIndentedString(numberTrades)).append("\n");
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

