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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataRecommendation;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2001DataTargetPrice;
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
 * Target price and aggregated recommendations for a stock.
 */
@ApiModel(description = "Target price and aggregated recommendations for a stock.")
@JsonPropertyOrder({
  InlineResponse2001Data.JSON_PROPERTY_TARGET_PRICE,
  InlineResponse2001Data.JSON_PROPERTY_RECOMMENDATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TARGET_PRICE = "targetPrice";
  private InlineResponse2001DataTargetPrice targetPrice;

  public static final String JSON_PROPERTY_RECOMMENDATION = "recommendation";
  private InlineResponse2001DataRecommendation recommendation;

  public InlineResponse2001Data() { 
  }

  public InlineResponse2001Data targetPrice(InlineResponse2001DataTargetPrice targetPrice) {
    this.targetPrice = targetPrice;
    return this;
  }

   /**
   * Get targetPrice
   * @return targetPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataTargetPrice getTargetPrice() {
    return targetPrice;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPrice(InlineResponse2001DataTargetPrice targetPrice) {
    this.targetPrice = targetPrice;
  }


  public InlineResponse2001Data recommendation(InlineResponse2001DataRecommendation recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataRecommendation getRecommendation() {
    return recommendation;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendation(InlineResponse2001DataRecommendation recommendation) {
    this.recommendation = recommendation;
  }


  /**
   * Return true if this inline_response_200_1_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Data inlineResponse2001Data = (InlineResponse2001Data) o;
    return Objects.equals(this.targetPrice, inlineResponse2001Data.targetPrice) &&
        Objects.equals(this.recommendation, inlineResponse2001Data.recommendation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPrice, recommendation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Data {\n");
    sb.append("    targetPrice: ").append(toIndentedString(targetPrice)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
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

