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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover;
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
 * Simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.
 */
@ApiModel(description = "Simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.")
@JsonPropertyOrder({
  InlineResponse20014SimpleMovingAverage.JSON_PROPERTY_DAYS20,
  InlineResponse20014SimpleMovingAverage.JSON_PROPERTY_DAYS50,
  InlineResponse20014SimpleMovingAverage.JSON_PROPERTY_DAYS200,
  InlineResponse20014SimpleMovingAverage.JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20014SimpleMovingAverage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAYS20 = "days20";
  private JsonNullable<BigDecimal> days20 = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_DAYS50 = "days50";
  private JsonNullable<BigDecimal> days50 = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_DAYS200 = "days200";
  private JsonNullable<BigDecimal> days200 = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER = "tradingDaysSinceCrossover";
  private InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover;

  public InlineResponse20014SimpleMovingAverage() { 
  }

  public InlineResponse20014SimpleMovingAverage days20(BigDecimal days20) {
    this.days20 = JsonNullable.<BigDecimal>of(days20);
    return this;
  }

   /**
   * 20 trading days.
   * @return days20
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "20 trading days.")
  @JsonIgnore

  public BigDecimal getDays20() {
        return days20.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS20)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDays20_JsonNullable() {
    return days20;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS20)
  public void setDays20_JsonNullable(JsonNullable<BigDecimal> days20) {
    this.days20 = days20;
  }

  public void setDays20(BigDecimal days20) {
    this.days20 = JsonNullable.<BigDecimal>of(days20);
  }


  public InlineResponse20014SimpleMovingAverage days50(BigDecimal days50) {
    this.days50 = JsonNullable.<BigDecimal>of(days50);
    return this;
  }

   /**
   * 50 trading days.
   * @return days50
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "50 trading days.")
  @JsonIgnore

  public BigDecimal getDays50() {
        return days50.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDays50_JsonNullable() {
    return days50;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS50)
  public void setDays50_JsonNullable(JsonNullable<BigDecimal> days50) {
    this.days50 = days50;
  }

  public void setDays50(BigDecimal days50) {
    this.days50 = JsonNullable.<BigDecimal>of(days50);
  }


  public InlineResponse20014SimpleMovingAverage days200(BigDecimal days200) {
    this.days200 = JsonNullable.<BigDecimal>of(days200);
    return this;
  }

   /**
   * 200 trading days.
   * @return days200
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "200 trading days.")
  @JsonIgnore

  public BigDecimal getDays200() {
        return days200.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDays200_JsonNullable() {
    return days200;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS200)
  public void setDays200_JsonNullable(JsonNullable<BigDecimal> days200) {
    this.days200 = days200;
  }

  public void setDays200(BigDecimal days200) {
    this.days200 = JsonNullable.<BigDecimal>of(days200);
  }


  public InlineResponse20014SimpleMovingAverage tradingDaysSinceCrossover(InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover) {
    this.tradingDaysSinceCrossover = tradingDaysSinceCrossover;
    return this;
  }

   /**
   * Get tradingDaysSinceCrossover
   * @return tradingDaysSinceCrossover
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover getTradingDaysSinceCrossover() {
    return tradingDaysSinceCrossover;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingDaysSinceCrossover(InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover) {
    this.tradingDaysSinceCrossover = tradingDaysSinceCrossover;
  }


  /**
   * Return true if this inline_response_200_14_simpleMovingAverage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014SimpleMovingAverage inlineResponse20014SimpleMovingAverage = (InlineResponse20014SimpleMovingAverage) o;
    return equalsNullable(this.days20, inlineResponse20014SimpleMovingAverage.days20) &&
        equalsNullable(this.days50, inlineResponse20014SimpleMovingAverage.days50) &&
        equalsNullable(this.days200, inlineResponse20014SimpleMovingAverage.days200) &&
        Objects.equals(this.tradingDaysSinceCrossover, inlineResponse20014SimpleMovingAverage.tradingDaysSinceCrossover);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(days20), hashCodeNullable(days50), hashCodeNullable(days200), tradingDaysSinceCrossover);
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
    sb.append("class InlineResponse20014SimpleMovingAverage {\n");
    sb.append("    days20: ").append(toIndentedString(days20)).append("\n");
    sb.append("    days50: ").append(toIndentedString(days50)).append("\n");
    sb.append("    days200: ").append(toIndentedString(days200)).append("\n");
    sb.append("    tradingDaysSinceCrossover: ").append(toIndentedString(tradingDaysSinceCrossover)).append("\n");
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

