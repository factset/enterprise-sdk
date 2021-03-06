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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareBookValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareDividends;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareRecurringEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareSales;
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
 * Value ranges of the per-share attributes.
 */
@ApiModel(description = "Value ranges of the per-share attributes.")
@JsonPropertyOrder({
  InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_SALES,
  InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_RECURRING_EARNINGS,
  InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_DIVIDENDS,
  InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_BOOK_VALUE,
  InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SALES = "sales";
  private InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareSales sales;

  public static final String JSON_PROPERTY_RECURRING_EARNINGS = "recurringEarnings";
  private InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareRecurringEarnings recurringEarnings;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  private InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareDividends dividends;

  public static final String JSON_PROPERTY_BOOK_VALUE = "bookValue";
  private InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareBookValue bookValue;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareCashFlow cashFlow;

  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare() { 
  }

  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare sales(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareSales sales) {
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

  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareSales getSales() {
    return sales;
  }


  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareSales sales) {
    this.sales = sales;
  }


  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare recurringEarnings(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareRecurringEarnings recurringEarnings) {
    this.recurringEarnings = recurringEarnings;
    return this;
  }

   /**
   * Get recurringEarnings
   * @return recurringEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareRecurringEarnings getRecurringEarnings() {
    return recurringEarnings;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringEarnings(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareRecurringEarnings recurringEarnings) {
    this.recurringEarnings = recurringEarnings;
  }


  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare dividends(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareDividends dividends) {
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

  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareDividends getDividends() {
    return dividends;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividends(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareDividends dividends) {
    this.dividends = dividends;
  }


  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare bookValue(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareBookValue bookValue) {
    this.bookValue = bookValue;
    return this;
  }

   /**
   * Get bookValue
   * @return bookValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareBookValue getBookValue() {
    return bookValue;
  }


  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBookValue(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareBookValue bookValue) {
    this.bookValue = bookValue;
  }


  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare cashFlow(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareCashFlow cashFlow) {
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

  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this inline_response_200_5_data_reportedKeyFigures_firstFiscalYear_currencyDependentKeyFigures_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare = (InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare) o;
    return Objects.equals(this.sales, inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.sales) &&
        Objects.equals(this.recurringEarnings, inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.recurringEarnings) &&
        Objects.equals(this.dividends, inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.dividends) &&
        Objects.equals(this.bookValue, inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.bookValue) &&
        Objects.equals(this.cashFlow, inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sales, recurringEarnings, dividends, bookValue, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare {\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    recurringEarnings: ").append(toIndentedString(recurringEarnings)).append("\n");
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

