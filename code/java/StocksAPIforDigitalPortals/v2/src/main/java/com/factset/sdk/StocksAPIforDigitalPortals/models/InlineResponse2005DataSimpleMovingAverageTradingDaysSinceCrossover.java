/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200;
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
 * Value ranges of the number of trading days since a simple moving average crossed another one. All SMAs are calculated with EOD prices, thus the value 0 for the number of days means the crossover occurred on the most recent trading day for which such prices are available.
 */
@ApiModel(description = "Value ranges of the number of trading days since a simple moving average crossed another one. All SMAs are calculated with EOD prices, thus the value 0 for the number of days means the crossover occurred on the most recent trading day for which such prices are available.")
@JsonPropertyOrder({
  InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover.JSON_PROPERTY_SMA20VS50,
  InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover.JSON_PROPERTY_SMA50VS200
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SMA20VS50 = "sma20vs50";
  private InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 sma20vs50;

  public static final String JSON_PROPERTY_SMA50VS200 = "sma50vs200";
  private InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 sma50vs200;

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover() { 
  }

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover sma20vs50(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 sma20vs50) {
    this.sma20vs50 = sma20vs50;
    return this;
  }

   /**
   * Get sma20vs50
   * @return sma20vs50
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMA20VS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 getSma20vs50() {
    return sma20vs50;
  }


  @JsonProperty(JSON_PROPERTY_SMA20VS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSma20vs50(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 sma20vs50) {
    this.sma20vs50 = sma20vs50;
  }


  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover sma50vs200(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 sma50vs200) {
    this.sma50vs200 = sma50vs200;
    return this;
  }

   /**
   * Get sma50vs200
   * @return sma50vs200
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMA50VS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 getSma50vs200() {
    return sma50vs200;
  }


  @JsonProperty(JSON_PROPERTY_SMA50VS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSma50vs200(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 sma50vs200) {
    this.sma50vs200 = sma50vs200;
  }


  /**
   * Return true if this inline_response_200_5_data_simpleMovingAverage_tradingDaysSinceCrossover object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover = (InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover) o;
    return Objects.equals(this.sma20vs50, inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover.sma20vs50) &&
        Objects.equals(this.sma50vs200, inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover.sma50vs200);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sma20vs50, sma50vs200);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover {\n");
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

