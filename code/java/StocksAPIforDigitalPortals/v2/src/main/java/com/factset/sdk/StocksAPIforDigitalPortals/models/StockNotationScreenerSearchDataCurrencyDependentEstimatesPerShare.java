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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareDividends;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareSales;
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
 * Per-share parameters.
 */
@ApiModel(description = "Per-share parameters.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.JSON_PROPERTY_SALES,
  StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.JSON_PROPERTY_EARNINGS,
  StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.JSON_PROPERTY_DIVIDENDS,
  StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.JSON_PROPERTY_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SALES = "sales";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareSales sales;

  public static final String JSON_PROPERTY_EARNINGS = "earnings";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings earnings;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareDividends dividends;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow cashFlow;

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare() { 
  }

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare sales(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareSales sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareSales getSales() {
    return sales;
  }


  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareSales sales) {
    this.sales = sales;
  }


  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare earnings(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings earnings) {
    this.earnings = earnings;
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings getEarnings() {
    return earnings;
  }


  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarnings(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings earnings) {
    this.earnings = earnings;
  }


  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare dividends(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareDividends dividends) {
    this.dividends = dividends;
    return this;
  }

   /**
   * Get dividends
   * @return dividends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareDividends getDividends() {
    return dividends;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividends(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareDividends dividends) {
    this.dividends = dividends;
  }


  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare cashFlow(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * Get cashFlow
   * @return cashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_currencyDependentEstimates_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare stockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare = (StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare) o;
    return Objects.equals(this.sales, stockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.sales) &&
        Objects.equals(this.earnings, stockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.earnings) &&
        Objects.equals(this.dividends, stockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.dividends) &&
        Objects.equals(this.cashFlow, stockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sales, earnings, dividends, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare {\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
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

