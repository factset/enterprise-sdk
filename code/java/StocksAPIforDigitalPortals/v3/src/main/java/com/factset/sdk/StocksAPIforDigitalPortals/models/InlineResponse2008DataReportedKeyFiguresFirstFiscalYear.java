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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2007ReportedKeyFiguresFirstFiscalYearFiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitdaMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearOperatingMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearRatios;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnAssets;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnEquity;
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
 * Value ranges of the most recent fiscal year that has been requested. If the parameters used in the request refer to data from only one fiscal year, the respective data is found here.
 */
@ApiModel(description = "Value ranges of the most recent fiscal year that has been requested. If the parameters used in the request refer to data from only one fiscal year, the respective data is found here.")
@JsonPropertyOrder({
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_FISCAL_YEAR,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_EBIT_MARGIN,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_EBITDA_MARGIN,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_NET_INCOME_MARGIN,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_GROSS_INCOME_MARGIN,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_OPERATING_MARGIN,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_RETURN_ON_ASSETS,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_RETURN_ON_EQUITY,
  InlineResponse2008DataReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_RATIOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2008DataReportedKeyFiguresFirstFiscalYear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private InlineResponse2007ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES = "currencyDependentKeyFigures";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures;

  public static final String JSON_PROPERTY_EBIT_MARGIN = "ebitMargin";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitMargin ebitMargin;

  public static final String JSON_PROPERTY_EBITDA_MARGIN = "ebitdaMargin";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitdaMargin ebitdaMargin;

  public static final String JSON_PROPERTY_NET_INCOME_MARGIN = "netIncomeMargin";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin netIncomeMargin;

  public static final String JSON_PROPERTY_GROSS_INCOME_MARGIN = "grossIncomeMargin";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin grossIncomeMargin;

  public static final String JSON_PROPERTY_OPERATING_MARGIN = "operatingMargin";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearOperatingMargin operatingMargin;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnAssets returnOnAssets;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnEquity returnOnEquity;

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private InlineResponse2008DataReportedKeyFiguresFirstFiscalYearRatios ratios;

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear() { 
  }

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear fiscalYear(InlineResponse2007ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear) {
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

  public InlineResponse2007ReportedKeyFiguresFirstFiscalYearFiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(InlineResponse2007ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear currencyDependentKeyFigures(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures) {
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

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures getCurrencyDependentKeyFigures() {
    return currencyDependentKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentKeyFigures(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear ebitMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitMargin ebitMargin) {
    this.ebitMargin = ebitMargin;
    return this;
  }

   /**
   * Get ebitMargin
   * @return ebitMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitMargin getEbitMargin() {
    return ebitMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitMargin ebitMargin) {
    this.ebitMargin = ebitMargin;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear ebitdaMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitdaMargin ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
    return this;
  }

   /**
   * Get ebitdaMargin
   * @return ebitdaMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitdaMargin getEbitdaMargin() {
    return ebitdaMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitdaMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearEbitdaMargin ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear netIncomeMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
    return this;
  }

   /**
   * Get netIncomeMargin
   * @return netIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin getNetIncomeMargin() {
    return netIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear grossIncomeMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
    return this;
  }

   /**
   * Get grossIncomeMargin
   * @return grossIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin getGrossIncomeMargin() {
    return grossIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossIncomeMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear operatingMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearOperatingMargin operatingMargin) {
    this.operatingMargin = operatingMargin;
    return this;
  }

   /**
   * Get operatingMargin
   * @return operatingMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearOperatingMargin getOperatingMargin() {
    return operatingMargin;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingMargin(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearOperatingMargin operatingMargin) {
    this.operatingMargin = operatingMargin;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear returnOnAssets(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
    return this;
  }

   /**
   * Get returnOnAssets
   * @return returnOnAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnAssets getReturnOnAssets() {
    return returnOnAssets;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssets(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear returnOnEquity(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
    return this;
  }

   /**
   * Get returnOnEquity
   * @return returnOnEquity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnEquity getReturnOnEquity() {
    return returnOnEquity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquity(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }


  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYear ratios(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearRatios ratios) {
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

  public InlineResponse2008DataReportedKeyFiguresFirstFiscalYearRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(InlineResponse2008DataReportedKeyFiguresFirstFiscalYearRatios ratios) {
    this.ratios = ratios;
  }


  /**
   * Return true if this inline_response_200_8_data_reportedKeyFigures_firstFiscalYear object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008DataReportedKeyFiguresFirstFiscalYear inlineResponse2008DataReportedKeyFiguresFirstFiscalYear = (InlineResponse2008DataReportedKeyFiguresFirstFiscalYear) o;
    return Objects.equals(this.fiscalYear, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.fiscalYear) &&
        Objects.equals(this.currencyDependentKeyFigures, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.currencyDependentKeyFigures) &&
        Objects.equals(this.ebitMargin, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.ebitMargin) &&
        Objects.equals(this.ebitdaMargin, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.ebitdaMargin) &&
        Objects.equals(this.netIncomeMargin, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.netIncomeMargin) &&
        Objects.equals(this.grossIncomeMargin, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.grossIncomeMargin) &&
        Objects.equals(this.operatingMargin, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.operatingMargin) &&
        Objects.equals(this.returnOnAssets, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.returnOnAssets) &&
        Objects.equals(this.returnOnEquity, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.returnOnEquity) &&
        Objects.equals(this.ratios, inlineResponse2008DataReportedKeyFiguresFirstFiscalYear.ratios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currencyDependentKeyFigures, ebitMargin, ebitdaMargin, netIncomeMargin, grossIncomeMargin, operatingMargin, returnOnAssets, returnOnEquity, ratios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008DataReportedKeyFiguresFirstFiscalYear {\n");
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
