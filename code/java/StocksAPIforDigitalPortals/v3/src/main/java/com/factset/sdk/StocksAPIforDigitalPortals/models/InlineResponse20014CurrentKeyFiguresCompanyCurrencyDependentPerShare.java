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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Per-share key figures.
 */
@ApiModel(description = "Per-share key figures.")
@JsonPropertyOrder({
  InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.JSON_PROPERTY_EARNINGS,
  InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.JSON_PROPERTY_BOOK_VALUE,
  InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.JSON_PROPERTY_CASH_FLOW,
  InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.JSON_PROPERTY_SALES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EARNINGS = "earnings";
  private JsonNullable<BigDecimal> earnings = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_BOOK_VALUE = "bookValue";
  private JsonNullable<BigDecimal> bookValue = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private JsonNullable<BigDecimal> cashFlow = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_SALES = "sales";
  private JsonNullable<BigDecimal> sales = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare() { 
  }

  public InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare earnings(BigDecimal earnings) {
    this.earnings = JsonNullable.<BigDecimal>of(earnings);
    return this;
  }

   /**
   * Earnings per share.
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Earnings per share.")
  @JsonIgnore

  public BigDecimal getEarnings() {
        return earnings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getEarnings_JsonNullable() {
    return earnings;
  }
  
  @JsonProperty(JSON_PROPERTY_EARNINGS)
  public void setEarnings_JsonNullable(JsonNullable<BigDecimal> earnings) {
    this.earnings = earnings;
  }

  public void setEarnings(BigDecimal earnings) {
    this.earnings = JsonNullable.<BigDecimal>of(earnings);
  }


  public InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare bookValue(BigDecimal bookValue) {
    this.bookValue = JsonNullable.<BigDecimal>of(bookValue);
    return this;
  }

   /**
   * Book value per share.
   * @return bookValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Book value per share.")
  @JsonIgnore

  public BigDecimal getBookValue() {
        return bookValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getBookValue_JsonNullable() {
    return bookValue;
  }
  
  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  public void setBookValue_JsonNullable(JsonNullable<BigDecimal> bookValue) {
    this.bookValue = bookValue;
  }

  public void setBookValue(BigDecimal bookValue) {
    this.bookValue = JsonNullable.<BigDecimal>of(bookValue);
  }


  public InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare cashFlow(BigDecimal cashFlow) {
    this.cashFlow = JsonNullable.<BigDecimal>of(cashFlow);
    return this;
  }

   /**
   * Cash flow per share.
   * @return cashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cash flow per share.")
  @JsonIgnore

  public BigDecimal getCashFlow() {
        return cashFlow.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getCashFlow_JsonNullable() {
    return cashFlow;
  }
  
  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  public void setCashFlow_JsonNullable(JsonNullable<BigDecimal> cashFlow) {
    this.cashFlow = cashFlow;
  }

  public void setCashFlow(BigDecimal cashFlow) {
    this.cashFlow = JsonNullable.<BigDecimal>of(cashFlow);
  }


  public InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare sales(BigDecimal sales) {
    this.sales = JsonNullable.<BigDecimal>of(sales);
    return this;
  }

   /**
   * Sales per share.
   * @return sales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sales per share.")
  @JsonIgnore

  public BigDecimal getSales() {
        return sales.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getSales_JsonNullable() {
    return sales;
  }
  
  @JsonProperty(JSON_PROPERTY_SALES)
  public void setSales_JsonNullable(JsonNullable<BigDecimal> sales) {
    this.sales = sales;
  }

  public void setSales(BigDecimal sales) {
    this.sales = JsonNullable.<BigDecimal>of(sales);
  }


  /**
   * Return true if this inline_response_200_14_currentKeyFigures_company_currencyDependent_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare inlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare = (InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare) o;
    return equalsNullable(this.earnings, inlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.earnings) &&
        equalsNullable(this.bookValue, inlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.bookValue) &&
        equalsNullable(this.cashFlow, inlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.cashFlow) &&
        equalsNullable(this.sales, inlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare.sales);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(earnings), hashCodeNullable(bookValue), hashCodeNullable(cashFlow), hashCodeNullable(sales));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014CurrentKeyFiguresCompanyCurrencyDependentPerShare {\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    bookValue: ").append(toIndentedString(bookValue)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
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

