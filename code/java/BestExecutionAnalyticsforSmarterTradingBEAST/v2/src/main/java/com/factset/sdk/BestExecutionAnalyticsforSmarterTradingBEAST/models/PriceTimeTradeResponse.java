/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.PriceTimeTrade;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.JSON;


/**
 * The PriceTimeTrade Response object
 */
@ApiModel(description = "The PriceTimeTrade Response object")
@JsonPropertyOrder({
  PriceTimeTradeResponse.JSON_PROPERTY_PRICE_TIME_TRADES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PriceTimeTradeResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_TIME_TRADES = "priceTimeTrades";
  private java.util.List<PriceTimeTrade> priceTimeTrades = null;

  public PriceTimeTradeResponse() { 
  }

  public PriceTimeTradeResponse priceTimeTrades(java.util.List<PriceTimeTrade> priceTimeTrades) {
    this.priceTimeTrades = priceTimeTrades;
    return this;
  }

  public PriceTimeTradeResponse addPriceTimeTradesItem(PriceTimeTrade priceTimeTradesItem) {
    if (this.priceTimeTrades == null) {
      this.priceTimeTrades = new java.util.ArrayList<>();
    }
    this.priceTimeTrades.add(priceTimeTradesItem);
    return this;
  }

   /**
   * List of PriceTimeTrade data
   * @return priceTimeTrades
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of PriceTimeTrade data")
  @JsonProperty(JSON_PROPERTY_PRICE_TIME_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<PriceTimeTrade> getPriceTimeTrades() {
    return priceTimeTrades;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_TIME_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceTimeTrades(java.util.List<PriceTimeTrade> priceTimeTrades) {
    this.priceTimeTrades = priceTimeTrades;
  }


  /**
   * Return true if this PriceTimeTradeResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceTimeTradeResponse priceTimeTradeResponse = (PriceTimeTradeResponse) o;
    return Objects.equals(this.priceTimeTrades, priceTimeTradeResponse.priceTimeTrades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceTimeTrades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceTimeTradeResponse {\n");
    sb.append("    priceTimeTrades: ").append(toIndentedString(priceTimeTrades)).append("\n");
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

