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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20015DataSimpleMovingAverageDays20;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20015DataSimpleMovingAverageDays200;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20015DataSimpleMovingAverageDays50;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossover;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Value ranges of the simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.
 */
@ApiModel(description = "Value ranges of the simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.")
@JsonPropertyOrder({
  InlineResponse20015DataSimpleMovingAverage.JSON_PROPERTY_DAYS20,
  InlineResponse20015DataSimpleMovingAverage.JSON_PROPERTY_DAYS50,
  InlineResponse20015DataSimpleMovingAverage.JSON_PROPERTY_DAYS200,
  InlineResponse20015DataSimpleMovingAverage.JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20015DataSimpleMovingAverage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAYS20 = "days20";
  private JsonNullable<InlineResponse20015DataSimpleMovingAverageDays20> days20 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays20>undefined();

  public static final String JSON_PROPERTY_DAYS50 = "days50";
  private JsonNullable<InlineResponse20015DataSimpleMovingAverageDays50> days50 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays50>undefined();

  public static final String JSON_PROPERTY_DAYS200 = "days200";
  private JsonNullable<InlineResponse20015DataSimpleMovingAverageDays200> days200 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays200>undefined();

  public static final String JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER = "tradingDaysSinceCrossover";
  private InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover;

  public InlineResponse20015DataSimpleMovingAverage() { 
  }

  public InlineResponse20015DataSimpleMovingAverage days20(InlineResponse20015DataSimpleMovingAverageDays20 days20) {
    this.days20 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays20>of(days20);
    return this;
  }

   /**
   * Get days20
   * @return days20
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20015DataSimpleMovingAverageDays20 getDays20() {
        return days20.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS20)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20015DataSimpleMovingAverageDays20> getDays20_JsonNullable() {
    return days20;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS20)
  public void setDays20_JsonNullable(JsonNullable<InlineResponse20015DataSimpleMovingAverageDays20> days20) {
    this.days20 = days20;
  }

  public void setDays20(InlineResponse20015DataSimpleMovingAverageDays20 days20) {
    this.days20 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays20>of(days20);
  }


  public InlineResponse20015DataSimpleMovingAverage days50(InlineResponse20015DataSimpleMovingAverageDays50 days50) {
    this.days50 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays50>of(days50);
    return this;
  }

   /**
   * Get days50
   * @return days50
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20015DataSimpleMovingAverageDays50 getDays50() {
        return days50.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20015DataSimpleMovingAverageDays50> getDays50_JsonNullable() {
    return days50;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS50)
  public void setDays50_JsonNullable(JsonNullable<InlineResponse20015DataSimpleMovingAverageDays50> days50) {
    this.days50 = days50;
  }

  public void setDays50(InlineResponse20015DataSimpleMovingAverageDays50 days50) {
    this.days50 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays50>of(days50);
  }


  public InlineResponse20015DataSimpleMovingAverage days200(InlineResponse20015DataSimpleMovingAverageDays200 days200) {
    this.days200 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays200>of(days200);
    return this;
  }

   /**
   * Get days200
   * @return days200
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20015DataSimpleMovingAverageDays200 getDays200() {
        return days200.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20015DataSimpleMovingAverageDays200> getDays200_JsonNullable() {
    return days200;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS200)
  public void setDays200_JsonNullable(JsonNullable<InlineResponse20015DataSimpleMovingAverageDays200> days200) {
    this.days200 = days200;
  }

  public void setDays200(InlineResponse20015DataSimpleMovingAverageDays200 days200) {
    this.days200 = JsonNullable.<InlineResponse20015DataSimpleMovingAverageDays200>of(days200);
  }


  public InlineResponse20015DataSimpleMovingAverage tradingDaysSinceCrossover(InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover) {
    this.tradingDaysSinceCrossover = tradingDaysSinceCrossover;
    return this;
  }

   /**
   * Get tradingDaysSinceCrossover
   * @return tradingDaysSinceCrossover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossover getTradingDaysSinceCrossover() {
    return tradingDaysSinceCrossover;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingDaysSinceCrossover(InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover) {
    this.tradingDaysSinceCrossover = tradingDaysSinceCrossover;
  }


  /**
   * Return true if this inline_response_200_15_data_simpleMovingAverage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015DataSimpleMovingAverage inlineResponse20015DataSimpleMovingAverage = (InlineResponse20015DataSimpleMovingAverage) o;
    return equalsNullable(this.days20, inlineResponse20015DataSimpleMovingAverage.days20) &&
        equalsNullable(this.days50, inlineResponse20015DataSimpleMovingAverage.days50) &&
        equalsNullable(this.days200, inlineResponse20015DataSimpleMovingAverage.days200) &&
        Objects.equals(this.tradingDaysSinceCrossover, inlineResponse20015DataSimpleMovingAverage.tradingDaysSinceCrossover);
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
    sb.append("class InlineResponse20015DataSimpleMovingAverage {\n");
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

