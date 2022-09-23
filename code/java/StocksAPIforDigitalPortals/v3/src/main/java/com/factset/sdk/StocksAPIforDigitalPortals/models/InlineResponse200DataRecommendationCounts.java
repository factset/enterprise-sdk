/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Number of recommendations.
 */
@ApiModel(description = "Number of recommendations.")
@JsonPropertyOrder({
  InlineResponse200DataRecommendationCounts.JSON_PROPERTY_TOTAL,
  InlineResponse200DataRecommendationCounts.JSON_PROPERTY_BUY,
  InlineResponse200DataRecommendationCounts.JSON_PROPERTY_OVERWEIGHT,
  InlineResponse200DataRecommendationCounts.JSON_PROPERTY_HOLD,
  InlineResponse200DataRecommendationCounts.JSON_PROPERTY_UNDERWEIGHT,
  InlineResponse200DataRecommendationCounts.JSON_PROPERTY_SELL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataRecommendationCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private BigDecimal total;

  public static final String JSON_PROPERTY_BUY = "buy";
  private BigDecimal buy;

  public static final String JSON_PROPERTY_OVERWEIGHT = "overweight";
  private BigDecimal overweight;

  public static final String JSON_PROPERTY_HOLD = "hold";
  private BigDecimal hold;

  public static final String JSON_PROPERTY_UNDERWEIGHT = "underweight";
  private BigDecimal underweight;

  public static final String JSON_PROPERTY_SELL = "sell";
  private BigDecimal sell;

  public InlineResponse200DataRecommendationCounts() { 
  }

  public InlineResponse200DataRecommendationCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Total number.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public InlineResponse200DataRecommendationCounts buy(BigDecimal buy) {
    this.buy = buy;
    return this;
  }

   /**
   * Number of buy recommendations. A buy recommendation contributes with the numeric value 1 when calculating the consensus.
   * @return buy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of buy recommendations. A buy recommendation contributes with the numeric value 1 when calculating the consensus.")
  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBuy() {
    return buy;
  }


  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuy(BigDecimal buy) {
    this.buy = buy;
  }


  public InlineResponse200DataRecommendationCounts overweight(BigDecimal overweight) {
    this.overweight = overweight;
    return this;
  }

   /**
   * Number of overweight recommendations. A overweight recommendation contributes with the numeric value 2 when calculating the consensus.
   * @return overweight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of overweight recommendations. A overweight recommendation contributes with the numeric value 2 when calculating the consensus.")
  @JsonProperty(JSON_PROPERTY_OVERWEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOverweight() {
    return overweight;
  }


  @JsonProperty(JSON_PROPERTY_OVERWEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverweight(BigDecimal overweight) {
    this.overweight = overweight;
  }


  public InlineResponse200DataRecommendationCounts hold(BigDecimal hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Number of hold recommendations. A hold recommendation contributes with the numeric value 3 when calculating the consensus.
   * @return hold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of hold recommendations. A hold recommendation contributes with the numeric value 3 when calculating the consensus.")
  @JsonProperty(JSON_PROPERTY_HOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHold() {
    return hold;
  }


  @JsonProperty(JSON_PROPERTY_HOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHold(BigDecimal hold) {
    this.hold = hold;
  }


  public InlineResponse200DataRecommendationCounts underweight(BigDecimal underweight) {
    this.underweight = underweight;
    return this;
  }

   /**
   * Number of underweight recommendations. A underweight recommendation contributes with the numeric value 4 when calculating the consensus.
   * @return underweight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of underweight recommendations. A underweight recommendation contributes with the numeric value 4 when calculating the consensus.")
  @JsonProperty(JSON_PROPERTY_UNDERWEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnderweight() {
    return underweight;
  }


  @JsonProperty(JSON_PROPERTY_UNDERWEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderweight(BigDecimal underweight) {
    this.underweight = underweight;
  }


  public InlineResponse200DataRecommendationCounts sell(BigDecimal sell) {
    this.sell = sell;
    return this;
  }

   /**
   * Number of sell recommendations. A sell recommendation contributes with the numeric value 5 when calculating the consensus.
   * @return sell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of sell recommendations. A sell recommendation contributes with the numeric value 5 when calculating the consensus.")
  @JsonProperty(JSON_PROPERTY_SELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSell() {
    return sell;
  }


  @JsonProperty(JSON_PROPERTY_SELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSell(BigDecimal sell) {
    this.sell = sell;
  }


  /**
   * Return true if this inline_response_200_data_recommendation_counts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataRecommendationCounts inlineResponse200DataRecommendationCounts = (InlineResponse200DataRecommendationCounts) o;
    return Objects.equals(this.total, inlineResponse200DataRecommendationCounts.total) &&
        Objects.equals(this.buy, inlineResponse200DataRecommendationCounts.buy) &&
        Objects.equals(this.overweight, inlineResponse200DataRecommendationCounts.overweight) &&
        Objects.equals(this.hold, inlineResponse200DataRecommendationCounts.hold) &&
        Objects.equals(this.underweight, inlineResponse200DataRecommendationCounts.underweight) &&
        Objects.equals(this.sell, inlineResponse200DataRecommendationCounts.sell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, buy, overweight, hold, underweight, sell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataRecommendationCounts {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    overweight: ").append(toIndentedString(overweight)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    underweight: ").append(toIndentedString(underweight)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
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
