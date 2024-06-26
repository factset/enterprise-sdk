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
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosDebtEquity;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosDividendYield;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatiosPriceSales;
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
 * Ratio parameters.
 */
@ApiModel(description = "Ratio parameters.")
@JsonPropertyOrder({
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_PRICE_SALES,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_PRICE_EARNINGS,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_PRICE_BOOK_VALUE,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_PRICE_CASH_FLOW,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_PRICE_FREE_CASH_FLOW,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_DIVIDEND_YIELD,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBIT,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_ENTERPRISE_VALUE_SALES,
  PostStockNotationScreenerSearchRequestDataRatios.JSON_PROPERTY_DEBT_EQUITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostStockNotationScreenerSearchRequestDataRatios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_SALES = "priceSales";
  private PostStockNotationScreenerSearchRequestDataRatiosPriceSales priceSales;

  public static final String JSON_PROPERTY_PRICE_EARNINGS = "priceEarnings";
  private PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings priceEarnings;

  public static final String JSON_PROPERTY_PRICE_BOOK_VALUE = "priceBookValue";
  private PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue priceBookValue;

  public static final String JSON_PROPERTY_PRICE_CASH_FLOW = "priceCashFlow";
  private PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow priceCashFlow;

  public static final String JSON_PROPERTY_PRICE_FREE_CASH_FLOW = "priceFreeCashFlow";
  private PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow priceFreeCashFlow;

  public static final String JSON_PROPERTY_DIVIDEND_YIELD = "dividendYield";
  private PostStockNotationScreenerSearchRequestDataRatiosDividendYield dividendYield;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBIT = "enterpriseValueEbit";
  private PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit enterpriseValueEbit;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA = "enterpriseValueEbitda";
  private PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda enterpriseValueEbitda;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_SALES = "enterpriseValueSales";
  private PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales enterpriseValueSales;

  public static final String JSON_PROPERTY_DEBT_EQUITY = "debtEquity";
  private PostStockNotationScreenerSearchRequestDataRatiosDebtEquity debtEquity;

  public PostStockNotationScreenerSearchRequestDataRatios() { 
  }

  public PostStockNotationScreenerSearchRequestDataRatios priceSales(PostStockNotationScreenerSearchRequestDataRatiosPriceSales priceSales) {
    this.priceSales = priceSales;
    return this;
  }

   /**
   * Get priceSales
   * @return priceSales
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosPriceSales getPriceSales() {
    return priceSales;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceSales(PostStockNotationScreenerSearchRequestDataRatiosPriceSales priceSales) {
    this.priceSales = priceSales;
  }


  public PostStockNotationScreenerSearchRequestDataRatios priceEarnings(PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
    return this;
  }

   /**
   * Get priceEarnings
   * @return priceEarnings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings getPriceEarnings() {
    return priceEarnings;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarnings(PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
  }


  public PostStockNotationScreenerSearchRequestDataRatios priceBookValue(PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
    return this;
  }

   /**
   * Get priceBookValue
   * @return priceBookValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue getPriceBookValue() {
    return priceBookValue;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceBookValue(PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
  }


  public PostStockNotationScreenerSearchRequestDataRatios priceCashFlow(PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
    return this;
  }

   /**
   * Get priceCashFlow
   * @return priceCashFlow
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow getPriceCashFlow() {
    return priceCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceCashFlow(PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
  }


  public PostStockNotationScreenerSearchRequestDataRatios priceFreeCashFlow(PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
    return this;
  }

   /**
   * Get priceFreeCashFlow
   * @return priceFreeCashFlow
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow getPriceFreeCashFlow() {
    return priceFreeCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFreeCashFlow(PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
  }


  public PostStockNotationScreenerSearchRequestDataRatios dividendYield(PostStockNotationScreenerSearchRequestDataRatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
    return this;
  }

   /**
   * Get dividendYield
   * @return dividendYield
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosDividendYield getDividendYield() {
    return dividendYield;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendYield(PostStockNotationScreenerSearchRequestDataRatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
  }


  public PostStockNotationScreenerSearchRequestDataRatios enterpriseValueEbit(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
    return this;
  }

   /**
   * Get enterpriseValueEbit
   * @return enterpriseValueEbit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit getEnterpriseValueEbit() {
    return enterpriseValueEbit;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbit(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
  }


  public PostStockNotationScreenerSearchRequestDataRatios enterpriseValueEbitda(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
    return this;
  }

   /**
   * Get enterpriseValueEbitda
   * @return enterpriseValueEbitda
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda getEnterpriseValueEbitda() {
    return enterpriseValueEbitda;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbitda(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
  }


  public PostStockNotationScreenerSearchRequestDataRatios enterpriseValueSales(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
    return this;
  }

   /**
   * Get enterpriseValueSales
   * @return enterpriseValueSales
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales getEnterpriseValueSales() {
    return enterpriseValueSales;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueSales(PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
  }


  public PostStockNotationScreenerSearchRequestDataRatios debtEquity(PostStockNotationScreenerSearchRequestDataRatiosDebtEquity debtEquity) {
    this.debtEquity = debtEquity;
    return this;
  }

   /**
   * Get debtEquity
   * @return debtEquity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEBT_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatiosDebtEquity getDebtEquity() {
    return debtEquity;
  }


  @JsonProperty(JSON_PROPERTY_DEBT_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebtEquity(PostStockNotationScreenerSearchRequestDataRatiosDebtEquity debtEquity) {
    this.debtEquity = debtEquity;
  }


  /**
   * Return true if this PostStockNotationScreenerSearchRequest_data_ratios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockNotationScreenerSearchRequestDataRatios postStockNotationScreenerSearchRequestDataRatios = (PostStockNotationScreenerSearchRequestDataRatios) o;
    return Objects.equals(this.priceSales, postStockNotationScreenerSearchRequestDataRatios.priceSales) &&
        Objects.equals(this.priceEarnings, postStockNotationScreenerSearchRequestDataRatios.priceEarnings) &&
        Objects.equals(this.priceBookValue, postStockNotationScreenerSearchRequestDataRatios.priceBookValue) &&
        Objects.equals(this.priceCashFlow, postStockNotationScreenerSearchRequestDataRatios.priceCashFlow) &&
        Objects.equals(this.priceFreeCashFlow, postStockNotationScreenerSearchRequestDataRatios.priceFreeCashFlow) &&
        Objects.equals(this.dividendYield, postStockNotationScreenerSearchRequestDataRatios.dividendYield) &&
        Objects.equals(this.enterpriseValueEbit, postStockNotationScreenerSearchRequestDataRatios.enterpriseValueEbit) &&
        Objects.equals(this.enterpriseValueEbitda, postStockNotationScreenerSearchRequestDataRatios.enterpriseValueEbitda) &&
        Objects.equals(this.enterpriseValueSales, postStockNotationScreenerSearchRequestDataRatios.enterpriseValueSales) &&
        Objects.equals(this.debtEquity, postStockNotationScreenerSearchRequestDataRatios.debtEquity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceSales, priceEarnings, priceBookValue, priceCashFlow, priceFreeCashFlow, dividendYield, enterpriseValueEbit, enterpriseValueEbitda, enterpriseValueSales, debtEquity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockNotationScreenerSearchRequestDataRatios {\n");
    sb.append("    priceSales: ").append(toIndentedString(priceSales)).append("\n");
    sb.append("    priceEarnings: ").append(toIndentedString(priceEarnings)).append("\n");
    sb.append("    priceBookValue: ").append(toIndentedString(priceBookValue)).append("\n");
    sb.append("    priceCashFlow: ").append(toIndentedString(priceCashFlow)).append("\n");
    sb.append("    priceFreeCashFlow: ").append(toIndentedString(priceFreeCashFlow)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
    sb.append("    enterpriseValueEbit: ").append(toIndentedString(enterpriseValueEbit)).append("\n");
    sb.append("    enterpriseValueEbitda: ").append(toIndentedString(enterpriseValueEbitda)).append("\n");
    sb.append("    enterpriseValueSales: ").append(toIndentedString(enterpriseValueSales)).append("\n");
    sb.append("    debtEquity: ").append(toIndentedString(debtEquity)).append("\n");
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

