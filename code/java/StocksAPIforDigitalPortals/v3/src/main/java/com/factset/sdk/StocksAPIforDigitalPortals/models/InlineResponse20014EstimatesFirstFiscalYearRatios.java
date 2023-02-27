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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosDividendYield;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueSales;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosPriceBookValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosPriceCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarningsGrowth;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosPriceFreeCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014EstimatesFirstFiscalYearRatiosPriceSales;
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
 * Ratios.
 */
@ApiModel(description = "Ratios.")
@JsonPropertyOrder({
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_SALES,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_EARNINGS,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_EARNINGS_GROWTH,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_BOOK_VALUE,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_CASH_FLOW,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_FREE_CASH_FLOW,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_DIVIDEND_YIELD,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBIT,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA,
  InlineResponse20014EstimatesFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_SALES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20014EstimatesFirstFiscalYearRatios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_SALES = "priceSales";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosPriceSales priceSales;

  public static final String JSON_PROPERTY_PRICE_EARNINGS = "priceEarnings";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarnings priceEarnings;

  public static final String JSON_PROPERTY_PRICE_EARNINGS_GROWTH = "priceEarningsGrowth";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarningsGrowth priceEarningsGrowth;

  public static final String JSON_PROPERTY_PRICE_BOOK_VALUE = "priceBookValue";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosPriceBookValue priceBookValue;

  public static final String JSON_PROPERTY_PRICE_CASH_FLOW = "priceCashFlow";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosPriceCashFlow priceCashFlow;

  public static final String JSON_PROPERTY_PRICE_FREE_CASH_FLOW = "priceFreeCashFlow";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow;

  public static final String JSON_PROPERTY_DIVIDEND_YIELD = "dividendYield";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosDividendYield dividendYield;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBIT = "enterpriseValueEbit";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA = "enterpriseValueEbitda";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_SALES = "enterpriseValueSales";
  private InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales;

  public InlineResponse20014EstimatesFirstFiscalYearRatios() { 
  }

  public InlineResponse20014EstimatesFirstFiscalYearRatios priceSales(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceSales priceSales) {
    this.priceSales = priceSales;
    return this;
  }

   /**
   * Get priceSales
   * @return priceSales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosPriceSales getPriceSales() {
    return priceSales;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceSales(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceSales priceSales) {
    this.priceSales = priceSales;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios priceEarnings(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
    return this;
  }

   /**
   * Get priceEarnings
   * @return priceEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarnings getPriceEarnings() {
    return priceEarnings;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarnings(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios priceEarningsGrowth(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarningsGrowth priceEarningsGrowth) {
    this.priceEarningsGrowth = priceEarningsGrowth;
    return this;
  }

   /**
   * Get priceEarningsGrowth
   * @return priceEarningsGrowth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS_GROWTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarningsGrowth getPriceEarningsGrowth() {
    return priceEarningsGrowth;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS_GROWTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarningsGrowth(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceEarningsGrowth priceEarningsGrowth) {
    this.priceEarningsGrowth = priceEarningsGrowth;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios priceBookValue(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
    return this;
  }

   /**
   * Get priceBookValue
   * @return priceBookValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosPriceBookValue getPriceBookValue() {
    return priceBookValue;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceBookValue(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios priceCashFlow(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
    return this;
  }

   /**
   * Get priceCashFlow
   * @return priceCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosPriceCashFlow getPriceCashFlow() {
    return priceCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceCashFlow(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios priceFreeCashFlow(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
    return this;
  }

   /**
   * Get priceFreeCashFlow
   * @return priceFreeCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosPriceFreeCashFlow getPriceFreeCashFlow() {
    return priceFreeCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFreeCashFlow(InlineResponse20014EstimatesFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios dividendYield(InlineResponse20014EstimatesFirstFiscalYearRatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
    return this;
  }

   /**
   * Get dividendYield
   * @return dividendYield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosDividendYield getDividendYield() {
    return dividendYield;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendYield(InlineResponse20014EstimatesFirstFiscalYearRatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios enterpriseValueEbit(InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
    return this;
  }

   /**
   * Get enterpriseValueEbit
   * @return enterpriseValueEbit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbit getEnterpriseValueEbit() {
    return enterpriseValueEbit;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbit(InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios enterpriseValueEbitda(InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
    return this;
  }

   /**
   * Get enterpriseValueEbitda
   * @return enterpriseValueEbitda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda getEnterpriseValueEbitda() {
    return enterpriseValueEbitda;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbitda(InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
  }


  public InlineResponse20014EstimatesFirstFiscalYearRatios enterpriseValueSales(InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
    return this;
  }

   /**
   * Get enterpriseValueSales
   * @return enterpriseValueSales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueSales getEnterpriseValueSales() {
    return enterpriseValueSales;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueSales(InlineResponse20014EstimatesFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
  }


  /**
   * Return true if this inline_response_200_14_estimates_firstFiscalYear_ratios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014EstimatesFirstFiscalYearRatios inlineResponse20014EstimatesFirstFiscalYearRatios = (InlineResponse20014EstimatesFirstFiscalYearRatios) o;
    return Objects.equals(this.priceSales, inlineResponse20014EstimatesFirstFiscalYearRatios.priceSales) &&
        Objects.equals(this.priceEarnings, inlineResponse20014EstimatesFirstFiscalYearRatios.priceEarnings) &&
        Objects.equals(this.priceEarningsGrowth, inlineResponse20014EstimatesFirstFiscalYearRatios.priceEarningsGrowth) &&
        Objects.equals(this.priceBookValue, inlineResponse20014EstimatesFirstFiscalYearRatios.priceBookValue) &&
        Objects.equals(this.priceCashFlow, inlineResponse20014EstimatesFirstFiscalYearRatios.priceCashFlow) &&
        Objects.equals(this.priceFreeCashFlow, inlineResponse20014EstimatesFirstFiscalYearRatios.priceFreeCashFlow) &&
        Objects.equals(this.dividendYield, inlineResponse20014EstimatesFirstFiscalYearRatios.dividendYield) &&
        Objects.equals(this.enterpriseValueEbit, inlineResponse20014EstimatesFirstFiscalYearRatios.enterpriseValueEbit) &&
        Objects.equals(this.enterpriseValueEbitda, inlineResponse20014EstimatesFirstFiscalYearRatios.enterpriseValueEbitda) &&
        Objects.equals(this.enterpriseValueSales, inlineResponse20014EstimatesFirstFiscalYearRatios.enterpriseValueSales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceSales, priceEarnings, priceEarningsGrowth, priceBookValue, priceCashFlow, priceFreeCashFlow, dividendYield, enterpriseValueEbit, enterpriseValueEbitda, enterpriseValueSales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014EstimatesFirstFiscalYearRatios {\n");
    sb.append("    priceSales: ").append(toIndentedString(priceSales)).append("\n");
    sb.append("    priceEarnings: ").append(toIndentedString(priceEarnings)).append("\n");
    sb.append("    priceEarningsGrowth: ").append(toIndentedString(priceEarningsGrowth)).append("\n");
    sb.append("    priceBookValue: ").append(toIndentedString(priceBookValue)).append("\n");
    sb.append("    priceCashFlow: ").append(toIndentedString(priceCashFlow)).append("\n");
    sb.append("    priceFreeCashFlow: ").append(toIndentedString(priceFreeCashFlow)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
    sb.append("    enterpriseValueEbit: ").append(toIndentedString(enterpriseValueEbit)).append("\n");
    sb.append("    enterpriseValueEbitda: ").append(toIndentedString(enterpriseValueEbitda)).append("\n");
    sb.append("    enterpriseValueSales: ").append(toIndentedString(enterpriseValueSales)).append("\n");
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
