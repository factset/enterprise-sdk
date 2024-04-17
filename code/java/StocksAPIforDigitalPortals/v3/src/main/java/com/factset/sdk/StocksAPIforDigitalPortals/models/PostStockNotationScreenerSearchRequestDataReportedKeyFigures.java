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
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataEbitMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataEbitdaMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataFiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataGrossIncomeMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataNetIncomeMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataOperatingMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataRatios;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataReturnOnAssets;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataReturnOnEquity;
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
 * PostStockNotationScreenerSearchRequestDataReportedKeyFigures
 */
@JsonPropertyOrder({
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_FISCAL_YEAR,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_EBIT_MARGIN,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_EBITDA_MARGIN,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_NET_INCOME_MARGIN,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_GROSS_INCOME_MARGIN,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_OPERATING_MARGIN,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_RETURN_ON_ASSETS,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_RETURN_ON_EQUITY,
  PostStockNotationScreenerSearchRequestDataReportedKeyFigures.JSON_PROPERTY_RATIOS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostStockNotationScreenerSearchRequestDataReportedKeyFigures implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private PostStockNotationScreenerSearchRequestDataFiscalYear fiscalYear;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES = "currencyDependentKeyFigures";
  private PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFigures currencyDependentKeyFigures;

  public static final String JSON_PROPERTY_EBIT_MARGIN = "ebitMargin";
  private PostStockNotationScreenerSearchRequestDataEbitMargin ebitMargin;

  public static final String JSON_PROPERTY_EBITDA_MARGIN = "ebitdaMargin";
  private PostStockNotationScreenerSearchRequestDataEbitdaMargin ebitdaMargin;

  public static final String JSON_PROPERTY_NET_INCOME_MARGIN = "netIncomeMargin";
  private PostStockNotationScreenerSearchRequestDataNetIncomeMargin netIncomeMargin;

  public static final String JSON_PROPERTY_GROSS_INCOME_MARGIN = "grossIncomeMargin";
  private PostStockNotationScreenerSearchRequestDataGrossIncomeMargin grossIncomeMargin;

  public static final String JSON_PROPERTY_OPERATING_MARGIN = "operatingMargin";
  private PostStockNotationScreenerSearchRequestDataOperatingMargin operatingMargin;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private PostStockNotationScreenerSearchRequestDataReturnOnAssets returnOnAssets;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private PostStockNotationScreenerSearchRequestDataReturnOnEquity returnOnEquity;

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private PostStockNotationScreenerSearchRequestDataRatios ratios;

  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures() { 
  }

  @JsonCreator
  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures(
    @JsonProperty(value=JSON_PROPERTY_FISCAL_YEAR, required=true) PostStockNotationScreenerSearchRequestDataFiscalYear fiscalYear
  ) {
    this();
    this.fiscalYear = fiscalYear;
  }

  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures fiscalYear(PostStockNotationScreenerSearchRequestDataFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostStockNotationScreenerSearchRequestDataFiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiscalYear(PostStockNotationScreenerSearchRequestDataFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures currencyDependentKeyFigures(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
    return this;
  }

   /**
   * Get currencyDependentKeyFigures
   * @return currencyDependentKeyFigures
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFigures getCurrencyDependentKeyFigures() {
    return currencyDependentKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentKeyFigures(PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures ebitMargin(PostStockNotationScreenerSearchRequestDataEbitMargin ebitMargin) {
    this.ebitMargin = ebitMargin;
    return this;
  }

   /**
   * Get ebitMargin
   * @return ebitMargin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataEbitMargin getEbitMargin() {
    return ebitMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitMargin(PostStockNotationScreenerSearchRequestDataEbitMargin ebitMargin) {
    this.ebitMargin = ebitMargin;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures ebitdaMargin(PostStockNotationScreenerSearchRequestDataEbitdaMargin ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
    return this;
  }

   /**
   * Get ebitdaMargin
   * @return ebitdaMargin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataEbitdaMargin getEbitdaMargin() {
    return ebitdaMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitdaMargin(PostStockNotationScreenerSearchRequestDataEbitdaMargin ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures netIncomeMargin(PostStockNotationScreenerSearchRequestDataNetIncomeMargin netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
    return this;
  }

   /**
   * Get netIncomeMargin
   * @return netIncomeMargin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataNetIncomeMargin getNetIncomeMargin() {
    return netIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeMargin(PostStockNotationScreenerSearchRequestDataNetIncomeMargin netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures grossIncomeMargin(PostStockNotationScreenerSearchRequestDataGrossIncomeMargin grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
    return this;
  }

   /**
   * Get grossIncomeMargin
   * @return grossIncomeMargin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataGrossIncomeMargin getGrossIncomeMargin() {
    return grossIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossIncomeMargin(PostStockNotationScreenerSearchRequestDataGrossIncomeMargin grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures operatingMargin(PostStockNotationScreenerSearchRequestDataOperatingMargin operatingMargin) {
    this.operatingMargin = operatingMargin;
    return this;
  }

   /**
   * Get operatingMargin
   * @return operatingMargin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataOperatingMargin getOperatingMargin() {
    return operatingMargin;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingMargin(PostStockNotationScreenerSearchRequestDataOperatingMargin operatingMargin) {
    this.operatingMargin = operatingMargin;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures returnOnAssets(PostStockNotationScreenerSearchRequestDataReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
    return this;
  }

   /**
   * Get returnOnAssets
   * @return returnOnAssets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataReturnOnAssets getReturnOnAssets() {
    return returnOnAssets;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssets(PostStockNotationScreenerSearchRequestDataReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures returnOnEquity(PostStockNotationScreenerSearchRequestDataReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
    return this;
  }

   /**
   * Get returnOnEquity
   * @return returnOnEquity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataReturnOnEquity getReturnOnEquity() {
    return returnOnEquity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquity(PostStockNotationScreenerSearchRequestDataReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }


  public PostStockNotationScreenerSearchRequestDataReportedKeyFigures ratios(PostStockNotationScreenerSearchRequestDataRatios ratios) {
    this.ratios = ratios;
    return this;
  }

   /**
   * Get ratios
   * @return ratios
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(PostStockNotationScreenerSearchRequestDataRatios ratios) {
    this.ratios = ratios;
  }


  /**
   * Return true if this PostStockNotationScreenerSearchRequest_data_reportedKeyFigures object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockNotationScreenerSearchRequestDataReportedKeyFigures postStockNotationScreenerSearchRequestDataReportedKeyFigures = (PostStockNotationScreenerSearchRequestDataReportedKeyFigures) o;
    return Objects.equals(this.fiscalYear, postStockNotationScreenerSearchRequestDataReportedKeyFigures.fiscalYear) &&
        Objects.equals(this.currencyDependentKeyFigures, postStockNotationScreenerSearchRequestDataReportedKeyFigures.currencyDependentKeyFigures) &&
        Objects.equals(this.ebitMargin, postStockNotationScreenerSearchRequestDataReportedKeyFigures.ebitMargin) &&
        Objects.equals(this.ebitdaMargin, postStockNotationScreenerSearchRequestDataReportedKeyFigures.ebitdaMargin) &&
        Objects.equals(this.netIncomeMargin, postStockNotationScreenerSearchRequestDataReportedKeyFigures.netIncomeMargin) &&
        Objects.equals(this.grossIncomeMargin, postStockNotationScreenerSearchRequestDataReportedKeyFigures.grossIncomeMargin) &&
        Objects.equals(this.operatingMargin, postStockNotationScreenerSearchRequestDataReportedKeyFigures.operatingMargin) &&
        Objects.equals(this.returnOnAssets, postStockNotationScreenerSearchRequestDataReportedKeyFigures.returnOnAssets) &&
        Objects.equals(this.returnOnEquity, postStockNotationScreenerSearchRequestDataReportedKeyFigures.returnOnEquity) &&
        Objects.equals(this.ratios, postStockNotationScreenerSearchRequestDataReportedKeyFigures.ratios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currencyDependentKeyFigures, ebitMargin, ebitdaMargin, netIncomeMargin, grossIncomeMargin, operatingMargin, returnOnAssets, returnOnEquity, ratios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockNotationScreenerSearchRequestDataReportedKeyFigures {\n");
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

