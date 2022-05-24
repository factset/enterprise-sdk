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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataMarketPriority;
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
 * Market-related parameters. See endpoint &#x60;/basic/market/list&#x60; for valid values.
 */
@ApiModel(description = "Market-related parameters. See endpoint `/basic/market/list` for valid values.")
@JsonPropertyOrder({
  StockNotationRankingIntradayListDataMarket.JSON_PROPERTY_IDS,
  StockNotationRankingIntradayListDataMarket.JSON_PROPERTY_PRIORITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationRankingIntradayListDataMarket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.Set<BigDecimal> ids = null;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private StockNotationRankingIntradayListDataMarketPriority priority;

  public StockNotationRankingIntradayListDataMarket() { 
  }

  public StockNotationRankingIntradayListDataMarket ids(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
    return this;
  }

  public StockNotationRankingIntradayListDataMarket addIdsItem(BigDecimal idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.LinkedHashSet<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of market identifiers where a stock may be traded. The list restricts the request to only those markets.
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of market identifiers where a stock may be traded. The list restricts the request to only those markets.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<BigDecimal> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
  }


  public StockNotationRankingIntradayListDataMarket priority(StockNotationRankingIntradayListDataMarketPriority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataMarketPriority getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(StockNotationRankingIntradayListDataMarketPriority priority) {
    this.priority = priority;
  }


  /**
   * Return true if this _stock_notation_ranking_intraday_list_data_market object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationRankingIntradayListDataMarket stockNotationRankingIntradayListDataMarket = (StockNotationRankingIntradayListDataMarket) o;
    return Objects.equals(this.ids, stockNotationRankingIntradayListDataMarket.ids) &&
        Objects.equals(this.priority, stockNotationRankingIntradayListDataMarket.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationRankingIntradayListDataMarket {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
