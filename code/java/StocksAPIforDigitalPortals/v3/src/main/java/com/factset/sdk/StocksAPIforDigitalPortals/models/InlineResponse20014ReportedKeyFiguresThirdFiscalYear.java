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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014ReportedKeyFiguresFirstFiscalYearFiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios;
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
 * Data of the most distant fiscal year that has been requested. Available only if the parameters used in the request refer to data from three fiscals year.
 */
@ApiModel(description = "Data of the most distant fiscal year that has been requested. Available only if the parameters used in the request refer to data from three fiscals year.")
@JsonPropertyOrder({
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_FISCAL_YEAR,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_EBIT_MARGIN,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_EBITDA_MARGIN,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_NET_INCOME_MARGIN,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_GROSS_INCOME_MARGIN,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_OPERATING_MARGIN,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_RETURN_ON_ASSETS,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_RETURN_ON_EQUITY,
  InlineResponse20014ReportedKeyFiguresThirdFiscalYear.JSON_PROPERTY_RATIOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20014ReportedKeyFiguresThirdFiscalYear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private InlineResponse20014ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES = "currencyDependentKeyFigures";
  private InlineResponse20014ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures;

  public static final String JSON_PROPERTY_EBIT_MARGIN = "ebitMargin";
  private JsonNullable<BigDecimal> ebitMargin = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_EBITDA_MARGIN = "ebitdaMargin";
  private JsonNullable<BigDecimal> ebitdaMargin = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_NET_INCOME_MARGIN = "netIncomeMargin";
  private JsonNullable<BigDecimal> netIncomeMargin = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_GROSS_INCOME_MARGIN = "grossIncomeMargin";
  private JsonNullable<BigDecimal> grossIncomeMargin = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_OPERATING_MARGIN = "operatingMargin";
  private JsonNullable<BigDecimal> operatingMargin = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private JsonNullable<BigDecimal> returnOnAssets = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private JsonNullable<BigDecimal> returnOnEquity = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios ratios;

  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear() { 
  }

  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear fiscalYear(InlineResponse20014ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014ReportedKeyFiguresFirstFiscalYearFiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(InlineResponse20014ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear currencyDependentKeyFigures(InlineResponse20014ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
    return this;
  }

   /**
   * Get currencyDependentKeyFigures
   * @return currencyDependentKeyFigures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures getCurrencyDependentKeyFigures() {
    return currencyDependentKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentKeyFigures(InlineResponse20014ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear ebitMargin(BigDecimal ebitMargin) {
    this.ebitMargin = JsonNullable.<BigDecimal>of(ebitMargin);
    return this;
  }

   /**
   * EBIT margin, which is the ratio of the EBIT, divided by the total sales revenue.
   * @return ebitMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EBIT margin, which is the ratio of the EBIT, divided by the total sales revenue.")
  @JsonIgnore

  public BigDecimal getEbitMargin() {
        return ebitMargin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getEbitMargin_JsonNullable() {
    return ebitMargin;
  }
  
  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  public void setEbitMargin_JsonNullable(JsonNullable<BigDecimal> ebitMargin) {
    this.ebitMargin = ebitMargin;
  }

  public void setEbitMargin(BigDecimal ebitMargin) {
    this.ebitMargin = JsonNullable.<BigDecimal>of(ebitMargin);
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear ebitdaMargin(BigDecimal ebitdaMargin) {
    this.ebitdaMargin = JsonNullable.<BigDecimal>of(ebitdaMargin);
    return this;
  }

   /**
   * EBITDA margin, which is the ratio of the EBITDA, divided by the total sales revenue.
   * @return ebitdaMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EBITDA margin, which is the ratio of the EBITDA, divided by the total sales revenue.")
  @JsonIgnore

  public BigDecimal getEbitdaMargin() {
        return ebitdaMargin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getEbitdaMargin_JsonNullable() {
    return ebitdaMargin;
  }
  
  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  public void setEbitdaMargin_JsonNullable(JsonNullable<BigDecimal> ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
  }

  public void setEbitdaMargin(BigDecimal ebitdaMargin) {
    this.ebitdaMargin = JsonNullable.<BigDecimal>of(ebitdaMargin);
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear netIncomeMargin(BigDecimal netIncomeMargin) {
    this.netIncomeMargin = JsonNullable.<BigDecimal>of(netIncomeMargin);
    return this;
  }

   /**
   * Net income margin, which is the ratio of the net income, divided by the total sales revenue.
   * @return netIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Net income margin, which is the ratio of the net income, divided by the total sales revenue.")
  @JsonIgnore

  public BigDecimal getNetIncomeMargin() {
        return netIncomeMargin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getNetIncomeMargin_JsonNullable() {
    return netIncomeMargin;
  }
  
  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  public void setNetIncomeMargin_JsonNullable(JsonNullable<BigDecimal> netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
  }

  public void setNetIncomeMargin(BigDecimal netIncomeMargin) {
    this.netIncomeMargin = JsonNullable.<BigDecimal>of(netIncomeMargin);
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear grossIncomeMargin(BigDecimal grossIncomeMargin) {
    this.grossIncomeMargin = JsonNullable.<BigDecimal>of(grossIncomeMargin);
    return this;
  }

   /**
   * Gross income margin, which is the ratio of the gross income, divided by the total sales revenue.
   * @return grossIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gross income margin, which is the ratio of the gross income, divided by the total sales revenue.")
  @JsonIgnore

  public BigDecimal getGrossIncomeMargin() {
        return grossIncomeMargin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getGrossIncomeMargin_JsonNullable() {
    return grossIncomeMargin;
  }
  
  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  public void setGrossIncomeMargin_JsonNullable(JsonNullable<BigDecimal> grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
  }

  public void setGrossIncomeMargin(BigDecimal grossIncomeMargin) {
    this.grossIncomeMargin = JsonNullable.<BigDecimal>of(grossIncomeMargin);
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear operatingMargin(BigDecimal operatingMargin) {
    this.operatingMargin = JsonNullable.<BigDecimal>of(operatingMargin);
    return this;
  }

   /**
   * Operating margin, which is the ratio of the operating income, divided by the sales revenue.
   * @return operatingMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operating margin, which is the ratio of the operating income, divided by the sales revenue.")
  @JsonIgnore

  public BigDecimal getOperatingMargin() {
        return operatingMargin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getOperatingMargin_JsonNullable() {
    return operatingMargin;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  public void setOperatingMargin_JsonNullable(JsonNullable<BigDecimal> operatingMargin) {
    this.operatingMargin = operatingMargin;
  }

  public void setOperatingMargin(BigDecimal operatingMargin) {
    this.operatingMargin = JsonNullable.<BigDecimal>of(operatingMargin);
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear returnOnAssets(BigDecimal returnOnAssets) {
    this.returnOnAssets = JsonNullable.<BigDecimal>of(returnOnAssets);
    return this;
  }

   /**
   * Return on assets (ROA), which is the ratio of the net income, divided by the two-fiscal-year average of the total assets.
   * @return returnOnAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return on assets (ROA), which is the ratio of the net income, divided by the two-fiscal-year average of the total assets.")
  @JsonIgnore

  public BigDecimal getReturnOnAssets() {
        return returnOnAssets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getReturnOnAssets_JsonNullable() {
    return returnOnAssets;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  public void setReturnOnAssets_JsonNullable(JsonNullable<BigDecimal> returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }

  public void setReturnOnAssets(BigDecimal returnOnAssets) {
    this.returnOnAssets = JsonNullable.<BigDecimal>of(returnOnAssets);
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear returnOnEquity(BigDecimal returnOnEquity) {
    this.returnOnEquity = JsonNullable.<BigDecimal>of(returnOnEquity);
    return this;
  }

   /**
   * Return on equity (ROE), which is the ratio of the net income, divided by the two-fiscal-year average of the total shareholders&#39; equity.
   * @return returnOnEquity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return on equity (ROE), which is the ratio of the net income, divided by the two-fiscal-year average of the total shareholders' equity.")
  @JsonIgnore

  public BigDecimal getReturnOnEquity() {
        return returnOnEquity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getReturnOnEquity_JsonNullable() {
    return returnOnEquity;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  public void setReturnOnEquity_JsonNullable(JsonNullable<BigDecimal> returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }

  public void setReturnOnEquity(BigDecimal returnOnEquity) {
    this.returnOnEquity = JsonNullable.<BigDecimal>of(returnOnEquity);
  }


  public InlineResponse20014ReportedKeyFiguresThirdFiscalYear ratios(InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios ratios) {
    this.ratios = ratios;
    return this;
  }

   /**
   * Get ratios
   * @return ratios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios ratios) {
    this.ratios = ratios;
  }


  /**
   * Return true if this inline_response_200_14_reportedKeyFigures_thirdFiscalYear object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014ReportedKeyFiguresThirdFiscalYear inlineResponse20014ReportedKeyFiguresThirdFiscalYear = (InlineResponse20014ReportedKeyFiguresThirdFiscalYear) o;
    return Objects.equals(this.fiscalYear, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.fiscalYear) &&
        Objects.equals(this.currencyDependentKeyFigures, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.currencyDependentKeyFigures) &&
        equalsNullable(this.ebitMargin, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.ebitMargin) &&
        equalsNullable(this.ebitdaMargin, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.ebitdaMargin) &&
        equalsNullable(this.netIncomeMargin, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.netIncomeMargin) &&
        equalsNullable(this.grossIncomeMargin, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.grossIncomeMargin) &&
        equalsNullable(this.operatingMargin, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.operatingMargin) &&
        equalsNullable(this.returnOnAssets, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.returnOnAssets) &&
        equalsNullable(this.returnOnEquity, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.returnOnEquity) &&
        Objects.equals(this.ratios, inlineResponse20014ReportedKeyFiguresThirdFiscalYear.ratios);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currencyDependentKeyFigures, hashCodeNullable(ebitMargin), hashCodeNullable(ebitdaMargin), hashCodeNullable(netIncomeMargin), hashCodeNullable(grossIncomeMargin), hashCodeNullable(operatingMargin), hashCodeNullable(returnOnAssets), hashCodeNullable(returnOnEquity), ratios);
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
    sb.append("class InlineResponse20014ReportedKeyFiguresThirdFiscalYear {\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    currencyDependentKeyFigures: ").append(toIndentedString(currencyDependentKeyFigures)).append("\n");
    sb.append("    ebitMargin: ").append(toIndentedString(ebitMargin)).append("\n");
    sb.append("    ebitdaMargin: ").append(toIndentedString(ebitdaMargin)).append("\n");
    sb.append("    netIncomeMargin: ").append(toIndentedString(netIncomeMargin)).append("\n");
    sb.append("    grossIncomeMargin: ").append(toIndentedString(grossIncomeMargin)).append("\n");
    sb.append("    operatingMargin: ").append(toIndentedString(operatingMargin)).append("\n");
    sb.append("    returnOnAssets: ").append(toIndentedString(returnOnAssets)).append("\n");
    sb.append("    returnOnEquity: ").append(toIndentedString(returnOnEquity)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
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

