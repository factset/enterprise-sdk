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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosDividendYield;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosEnterpriseValueEbit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosEnterpriseValueEbita;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosEnterpriseValueEbitda;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosEnterpriseValueFreeCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosEnterpriseValueSales;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosPriceBookValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosPriceCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosPriceEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosPriceEarningsGrowth;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosPriceFreeCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2002RatiosPriceSales;
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
 * Estimates for selected ratios.
 */
@ApiModel(description = "Estimates for selected ratios.")
@JsonPropertyOrder({
  InlineResponse2002Ratios.JSON_PROPERTY_PRICE_SALES,
  InlineResponse2002Ratios.JSON_PROPERTY_PRICE_EARNINGS,
  InlineResponse2002Ratios.JSON_PROPERTY_PRICE_EARNINGS_GROWTH,
  InlineResponse2002Ratios.JSON_PROPERTY_PRICE_BOOK_VALUE,
  InlineResponse2002Ratios.JSON_PROPERTY_PRICE_CASH_FLOW,
  InlineResponse2002Ratios.JSON_PROPERTY_PRICE_FREE_CASH_FLOW,
  InlineResponse2002Ratios.JSON_PROPERTY_DIVIDEND_YIELD,
  InlineResponse2002Ratios.JSON_PROPERTY_ENTERPRISE_VALUE_EBIT,
  InlineResponse2002Ratios.JSON_PROPERTY_ENTERPRISE_VALUE_EBITA,
  InlineResponse2002Ratios.JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA,
  InlineResponse2002Ratios.JSON_PROPERTY_ENTERPRISE_VALUE_SALES,
  InlineResponse2002Ratios.JSON_PROPERTY_ENTERPRISE_VALUE_FREE_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2002Ratios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_SALES = "priceSales";
  private InlineResponse2002RatiosPriceSales priceSales;

  public static final String JSON_PROPERTY_PRICE_EARNINGS = "priceEarnings";
  private InlineResponse2002RatiosPriceEarnings priceEarnings;

  public static final String JSON_PROPERTY_PRICE_EARNINGS_GROWTH = "priceEarningsGrowth";
  private InlineResponse2002RatiosPriceEarningsGrowth priceEarningsGrowth;

  public static final String JSON_PROPERTY_PRICE_BOOK_VALUE = "priceBookValue";
  private InlineResponse2002RatiosPriceBookValue priceBookValue;

  public static final String JSON_PROPERTY_PRICE_CASH_FLOW = "priceCashFlow";
  private InlineResponse2002RatiosPriceCashFlow priceCashFlow;

  public static final String JSON_PROPERTY_PRICE_FREE_CASH_FLOW = "priceFreeCashFlow";
  private InlineResponse2002RatiosPriceFreeCashFlow priceFreeCashFlow;

  public static final String JSON_PROPERTY_DIVIDEND_YIELD = "dividendYield";
  private InlineResponse2002RatiosDividendYield dividendYield;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBIT = "enterpriseValueEbit";
  private InlineResponse2002RatiosEnterpriseValueEbit enterpriseValueEbit;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBITA = "enterpriseValueEbita";
  private InlineResponse2002RatiosEnterpriseValueEbita enterpriseValueEbita;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA = "enterpriseValueEbitda";
  private InlineResponse2002RatiosEnterpriseValueEbitda enterpriseValueEbitda;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_SALES = "enterpriseValueSales";
  private InlineResponse2002RatiosEnterpriseValueSales enterpriseValueSales;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_FREE_CASH_FLOW = "enterpriseValueFreeCashFlow";
  private InlineResponse2002RatiosEnterpriseValueFreeCashFlow enterpriseValueFreeCashFlow;

  public InlineResponse2002Ratios() { 
  }

  public InlineResponse2002Ratios priceSales(InlineResponse2002RatiosPriceSales priceSales) {
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

  public InlineResponse2002RatiosPriceSales getPriceSales() {
    return priceSales;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceSales(InlineResponse2002RatiosPriceSales priceSales) {
    this.priceSales = priceSales;
  }


  public InlineResponse2002Ratios priceEarnings(InlineResponse2002RatiosPriceEarnings priceEarnings) {
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

  public InlineResponse2002RatiosPriceEarnings getPriceEarnings() {
    return priceEarnings;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarnings(InlineResponse2002RatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
  }


  public InlineResponse2002Ratios priceEarningsGrowth(InlineResponse2002RatiosPriceEarningsGrowth priceEarningsGrowth) {
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

  public InlineResponse2002RatiosPriceEarningsGrowth getPriceEarningsGrowth() {
    return priceEarningsGrowth;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS_GROWTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarningsGrowth(InlineResponse2002RatiosPriceEarningsGrowth priceEarningsGrowth) {
    this.priceEarningsGrowth = priceEarningsGrowth;
  }


  public InlineResponse2002Ratios priceBookValue(InlineResponse2002RatiosPriceBookValue priceBookValue) {
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

  public InlineResponse2002RatiosPriceBookValue getPriceBookValue() {
    return priceBookValue;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceBookValue(InlineResponse2002RatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
  }


  public InlineResponse2002Ratios priceCashFlow(InlineResponse2002RatiosPriceCashFlow priceCashFlow) {
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

  public InlineResponse2002RatiosPriceCashFlow getPriceCashFlow() {
    return priceCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceCashFlow(InlineResponse2002RatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
  }


  public InlineResponse2002Ratios priceFreeCashFlow(InlineResponse2002RatiosPriceFreeCashFlow priceFreeCashFlow) {
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

  public InlineResponse2002RatiosPriceFreeCashFlow getPriceFreeCashFlow() {
    return priceFreeCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFreeCashFlow(InlineResponse2002RatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
  }


  public InlineResponse2002Ratios dividendYield(InlineResponse2002RatiosDividendYield dividendYield) {
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

  public InlineResponse2002RatiosDividendYield getDividendYield() {
    return dividendYield;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendYield(InlineResponse2002RatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
  }


  public InlineResponse2002Ratios enterpriseValueEbit(InlineResponse2002RatiosEnterpriseValueEbit enterpriseValueEbit) {
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

  public InlineResponse2002RatiosEnterpriseValueEbit getEnterpriseValueEbit() {
    return enterpriseValueEbit;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbit(InlineResponse2002RatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
  }


  public InlineResponse2002Ratios enterpriseValueEbita(InlineResponse2002RatiosEnterpriseValueEbita enterpriseValueEbita) {
    this.enterpriseValueEbita = enterpriseValueEbita;
    return this;
  }

   /**
   * Get enterpriseValueEbita
   * @return enterpriseValueEbita
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002RatiosEnterpriseValueEbita getEnterpriseValueEbita() {
    return enterpriseValueEbita;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbita(InlineResponse2002RatiosEnterpriseValueEbita enterpriseValueEbita) {
    this.enterpriseValueEbita = enterpriseValueEbita;
  }


  public InlineResponse2002Ratios enterpriseValueEbitda(InlineResponse2002RatiosEnterpriseValueEbitda enterpriseValueEbitda) {
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

  public InlineResponse2002RatiosEnterpriseValueEbitda getEnterpriseValueEbitda() {
    return enterpriseValueEbitda;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbitda(InlineResponse2002RatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
  }


  public InlineResponse2002Ratios enterpriseValueSales(InlineResponse2002RatiosEnterpriseValueSales enterpriseValueSales) {
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

  public InlineResponse2002RatiosEnterpriseValueSales getEnterpriseValueSales() {
    return enterpriseValueSales;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueSales(InlineResponse2002RatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
  }


  public InlineResponse2002Ratios enterpriseValueFreeCashFlow(InlineResponse2002RatiosEnterpriseValueFreeCashFlow enterpriseValueFreeCashFlow) {
    this.enterpriseValueFreeCashFlow = enterpriseValueFreeCashFlow;
    return this;
  }

   /**
   * Get enterpriseValueFreeCashFlow
   * @return enterpriseValueFreeCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002RatiosEnterpriseValueFreeCashFlow getEnterpriseValueFreeCashFlow() {
    return enterpriseValueFreeCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueFreeCashFlow(InlineResponse2002RatiosEnterpriseValueFreeCashFlow enterpriseValueFreeCashFlow) {
    this.enterpriseValueFreeCashFlow = enterpriseValueFreeCashFlow;
  }


  /**
   * Return true if this inline_response_200_2_ratios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Ratios inlineResponse2002Ratios = (InlineResponse2002Ratios) o;
    return Objects.equals(this.priceSales, inlineResponse2002Ratios.priceSales) &&
        Objects.equals(this.priceEarnings, inlineResponse2002Ratios.priceEarnings) &&
        Objects.equals(this.priceEarningsGrowth, inlineResponse2002Ratios.priceEarningsGrowth) &&
        Objects.equals(this.priceBookValue, inlineResponse2002Ratios.priceBookValue) &&
        Objects.equals(this.priceCashFlow, inlineResponse2002Ratios.priceCashFlow) &&
        Objects.equals(this.priceFreeCashFlow, inlineResponse2002Ratios.priceFreeCashFlow) &&
        Objects.equals(this.dividendYield, inlineResponse2002Ratios.dividendYield) &&
        Objects.equals(this.enterpriseValueEbit, inlineResponse2002Ratios.enterpriseValueEbit) &&
        Objects.equals(this.enterpriseValueEbita, inlineResponse2002Ratios.enterpriseValueEbita) &&
        Objects.equals(this.enterpriseValueEbitda, inlineResponse2002Ratios.enterpriseValueEbitda) &&
        Objects.equals(this.enterpriseValueSales, inlineResponse2002Ratios.enterpriseValueSales) &&
        Objects.equals(this.enterpriseValueFreeCashFlow, inlineResponse2002Ratios.enterpriseValueFreeCashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceSales, priceEarnings, priceEarningsGrowth, priceBookValue, priceCashFlow, priceFreeCashFlow, dividendYield, enterpriseValueEbit, enterpriseValueEbita, enterpriseValueEbitda, enterpriseValueSales, enterpriseValueFreeCashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Ratios {\n");
    sb.append("    priceSales: ").append(toIndentedString(priceSales)).append("\n");
    sb.append("    priceEarnings: ").append(toIndentedString(priceEarnings)).append("\n");
    sb.append("    priceEarningsGrowth: ").append(toIndentedString(priceEarningsGrowth)).append("\n");
    sb.append("    priceBookValue: ").append(toIndentedString(priceBookValue)).append("\n");
    sb.append("    priceCashFlow: ").append(toIndentedString(priceCashFlow)).append("\n");
    sb.append("    priceFreeCashFlow: ").append(toIndentedString(priceFreeCashFlow)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
    sb.append("    enterpriseValueEbit: ").append(toIndentedString(enterpriseValueEbit)).append("\n");
    sb.append("    enterpriseValueEbita: ").append(toIndentedString(enterpriseValueEbita)).append("\n");
    sb.append("    enterpriseValueEbitda: ").append(toIndentedString(enterpriseValueEbitda)).append("\n");
    sb.append("    enterpriseValueSales: ").append(toIndentedString(enterpriseValueSales)).append("\n");
    sb.append("    enterpriseValueFreeCashFlow: ").append(toIndentedString(enterpriseValueFreeCashFlow)).append("\n");
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

