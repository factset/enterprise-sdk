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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002PerShareCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002PerShareDividends;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002PerShareEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002PerShareNetAssetValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002PerShareSales;
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
 * Estimates for selected per-share figures.
 */
@ApiModel(description = "Estimates for selected per-share figures.")
@JsonPropertyOrder({
  InlineResponse2002PerShare.JSON_PROPERTY_DIVIDENDS,
  InlineResponse2002PerShare.JSON_PROPERTY_EARNINGS,
  InlineResponse2002PerShare.JSON_PROPERTY_CASH_FLOW,
  InlineResponse2002PerShare.JSON_PROPERTY_SALES,
  InlineResponse2002PerShare.JSON_PROPERTY_NET_ASSET_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2002PerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  private InlineResponse2002PerShareDividends dividends;

  public static final String JSON_PROPERTY_EARNINGS = "earnings";
  private InlineResponse2002PerShareEarnings earnings;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private InlineResponse2002PerShareCashFlow cashFlow;

  public static final String JSON_PROPERTY_SALES = "sales";
  private InlineResponse2002PerShareSales sales;

  public static final String JSON_PROPERTY_NET_ASSET_VALUE = "netAssetValue";
  private InlineResponse2002PerShareNetAssetValue netAssetValue;

  public InlineResponse2002PerShare() { 
  }

  public InlineResponse2002PerShare dividends(InlineResponse2002PerShareDividends dividends) {
    this.dividends = dividends;
    return this;
  }

   /**
   * Get dividends
   * @return dividends
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002PerShareDividends getDividends() {
    return dividends;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividends(InlineResponse2002PerShareDividends dividends) {
    this.dividends = dividends;
  }


  public InlineResponse2002PerShare earnings(InlineResponse2002PerShareEarnings earnings) {
    this.earnings = earnings;
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002PerShareEarnings getEarnings() {
    return earnings;
  }


  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarnings(InlineResponse2002PerShareEarnings earnings) {
    this.earnings = earnings;
  }


  public InlineResponse2002PerShare cashFlow(InlineResponse2002PerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * Get cashFlow
   * @return cashFlow
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002PerShareCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(InlineResponse2002PerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  public InlineResponse2002PerShare sales(InlineResponse2002PerShareSales sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002PerShareSales getSales() {
    return sales;
  }


  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(InlineResponse2002PerShareSales sales) {
    this.sales = sales;
  }


  public InlineResponse2002PerShare netAssetValue(InlineResponse2002PerShareNetAssetValue netAssetValue) {
    this.netAssetValue = netAssetValue;
    return this;
  }

   /**
   * Get netAssetValue
   * @return netAssetValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_ASSET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002PerShareNetAssetValue getNetAssetValue() {
    return netAssetValue;
  }


  @JsonProperty(JSON_PROPERTY_NET_ASSET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetAssetValue(InlineResponse2002PerShareNetAssetValue netAssetValue) {
    this.netAssetValue = netAssetValue;
  }


  /**
   * Return true if this inline_response_200_2_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002PerShare inlineResponse2002PerShare = (InlineResponse2002PerShare) o;
    return Objects.equals(this.dividends, inlineResponse2002PerShare.dividends) &&
        Objects.equals(this.earnings, inlineResponse2002PerShare.earnings) &&
        Objects.equals(this.cashFlow, inlineResponse2002PerShare.cashFlow) &&
        Objects.equals(this.sales, inlineResponse2002PerShare.sales) &&
        Objects.equals(this.netAssetValue, inlineResponse2002PerShare.netAssetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dividends, earnings, cashFlow, sales, netAssetValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002PerShare {\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    netAssetValue: ").append(toIndentedString(netAssetValue)).append("\n");
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

