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
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareBookValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareDividends;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareSales;
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
  PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_SALES,
  PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_RECURRING_DILUTED_EARNINGS,
  PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_DIVIDENDS,
  PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_BOOK_VALUE,
  PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_CASH_FLOW
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SALES = "sales";
  private PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareSales sales;

  public static final String JSON_PROPERTY_RECURRING_DILUTED_EARNINGS = "recurringDilutedEarnings";
  private PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings recurringDilutedEarnings;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  private PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareDividends dividends;

  public static final String JSON_PROPERTY_BOOK_VALUE = "bookValue";
  private PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareBookValue bookValue;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareCashFlow cashFlow;

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare() { 
  }

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare sales(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareSales sales) {
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

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareSales getSales() {
    return sales;
  }


  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareSales sales) {
    this.sales = sales;
  }


  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare recurringDilutedEarnings(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings recurringDilutedEarnings) {
    this.recurringDilutedEarnings = recurringDilutedEarnings;
    return this;
  }

   /**
   * Get recurringDilutedEarnings
   * @return recurringDilutedEarnings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_DILUTED_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings getRecurringDilutedEarnings() {
    return recurringDilutedEarnings;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_DILUTED_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDilutedEarnings(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings recurringDilutedEarnings) {
    this.recurringDilutedEarnings = recurringDilutedEarnings;
  }


  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare dividends(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareDividends dividends) {
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

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareDividends getDividends() {
    return dividends;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividends(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareDividends dividends) {
    this.dividends = dividends;
  }


  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare bookValue(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareBookValue bookValue) {
    this.bookValue = bookValue;
    return this;
  }

   /**
   * Get bookValue
   * @return bookValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareBookValue getBookValue() {
    return bookValue;
  }


  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBookValue(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareBookValue bookValue) {
    this.bookValue = bookValue;
  }


  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare cashFlow(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareCashFlow cashFlow) {
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

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this PostStockNotationScreenerSearchRequest_data_currencyDependentKeyFigures_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare postStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare = (PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare) o;
    return Objects.equals(this.sales, postStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.sales) &&
        Objects.equals(this.recurringDilutedEarnings, postStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.recurringDilutedEarnings) &&
        Objects.equals(this.dividends, postStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.dividends) &&
        Objects.equals(this.bookValue, postStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.bookValue) &&
        Objects.equals(this.cashFlow, postStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sales, recurringDilutedEarnings, dividends, bookValue, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare {\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    recurringDilutedEarnings: ").append(toIndentedString(recurringDilutedEarnings)).append("\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
    sb.append("    bookValue: ").append(toIndentedString(bookValue)).append("\n");
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

