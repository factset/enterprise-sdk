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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma20vs50;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Number of trading days since a simple moving average crossed another one. All SMAs are calculated with EOD prices, thus the value 0 for the number of days means the crossover occurred on the most recent trading day for which such prices are available.
 */
@ApiModel(description = "Number of trading days since a simple moving average crossed another one. All SMAs are calculated with EOD prices, thus the value 0 for the number of days means the crossover occurred on the most recent trading day for which such prices are available.")
@JsonPropertyOrder({
  InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover.JSON_PROPERTY_SMA20VS50,
  InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover.JSON_PROPERTY_SMA50VS200
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SMA20VS50 = "sma20vs50";
  private InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 sma20vs50;

  public static final String JSON_PROPERTY_SMA50VS200 = "sma50vs200";
  private InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 sma50vs200;

  public InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover() { 
  }

  public InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover sma20vs50(InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 sma20vs50) {
    this.sma20vs50 = sma20vs50;
    return this;
  }

   /**
   * Get sma20vs50
   * @return sma20vs50
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMA20VS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 getSma20vs50() {
    return sma20vs50;
  }


  @JsonProperty(JSON_PROPERTY_SMA20VS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSma20vs50(InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 sma20vs50) {
    this.sma20vs50 = sma20vs50;
  }


  public InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover sma50vs200(InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 sma50vs200) {
    this.sma50vs200 = sma50vs200;
    return this;
  }

   /**
   * Get sma50vs200
   * @return sma50vs200
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMA50VS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 getSma50vs200() {
    return sma50vs200;
  }


  @JsonProperty(JSON_PROPERTY_SMA50VS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSma50vs200(InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 sma50vs200) {
    this.sma50vs200 = sma50vs200;
  }


  /**
   * Return true if this inline_response_200_14_simpleMovingAverage_tradingDaysSinceCrossover object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover inlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover = (InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover) o;
    return Objects.equals(this.sma20vs50, inlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover.sma20vs50) &&
        Objects.equals(this.sma50vs200, inlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover.sma50vs200);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sma20vs50, sma50vs200);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014SimpleMovingAverageTradingDaysSinceCrossover {\n");
    sb.append("    sma20vs50: ").append(toIndentedString(sma20vs50)).append("\n");
    sb.append("    sma50vs200: ").append(toIndentedString(sma50vs200)).append("\n");
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

