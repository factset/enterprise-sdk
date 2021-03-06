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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimates;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataEstimatesFirstFiscalYearFiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataEstimatesFirstFiscalYearRatios;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataEstimatesFirstFiscalYearReturnOnAssets;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataEstimatesFirstFiscalYearReturnOnEquity;
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
 * Value ranges of the estimates for the second most distant fiscal year that has been requested. If the parameters used in the request refer to data from two fiscals year, the respective data of the more distant one is found here.
 */
@ApiModel(description = "Value ranges of the estimates for the second most distant fiscal year that has been requested. If the parameters used in the request refer to data from two fiscals year, the respective data of the more distant one is found here.")
@JsonPropertyOrder({
  InlineResponse20012DataEstimatesSecondFiscalYear.JSON_PROPERTY_FISCAL_YEAR,
  InlineResponse20012DataEstimatesSecondFiscalYear.JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES,
  InlineResponse20012DataEstimatesSecondFiscalYear.JSON_PROPERTY_RETURN_ON_ASSETS,
  InlineResponse20012DataEstimatesSecondFiscalYear.JSON_PROPERTY_RETURN_ON_EQUITY,
  InlineResponse20012DataEstimatesSecondFiscalYear.JSON_PROPERTY_RATIOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20012DataEstimatesSecondFiscalYear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private InlineResponse20012DataEstimatesFirstFiscalYearFiscalYear fiscalYear;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES = "currencyDependentEstimates";
  private InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimates currencyDependentEstimates;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private InlineResponse20012DataEstimatesFirstFiscalYearReturnOnAssets returnOnAssets;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private InlineResponse20012DataEstimatesFirstFiscalYearReturnOnEquity returnOnEquity;

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private InlineResponse20012DataEstimatesFirstFiscalYearRatios ratios;

  public InlineResponse20012DataEstimatesSecondFiscalYear() { 
  }

  public InlineResponse20012DataEstimatesSecondFiscalYear fiscalYear(InlineResponse20012DataEstimatesFirstFiscalYearFiscalYear fiscalYear) {
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

  public InlineResponse20012DataEstimatesFirstFiscalYearFiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(InlineResponse20012DataEstimatesFirstFiscalYearFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public InlineResponse20012DataEstimatesSecondFiscalYear currencyDependentEstimates(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimates currencyDependentEstimates) {
    this.currencyDependentEstimates = currencyDependentEstimates;
    return this;
  }

   /**
   * Get currencyDependentEstimates
   * @return currencyDependentEstimates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimates getCurrencyDependentEstimates() {
    return currencyDependentEstimates;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentEstimates(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimates currencyDependentEstimates) {
    this.currencyDependentEstimates = currencyDependentEstimates;
  }


  public InlineResponse20012DataEstimatesSecondFiscalYear returnOnAssets(InlineResponse20012DataEstimatesFirstFiscalYearReturnOnAssets returnOnAssets) {
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

  public InlineResponse20012DataEstimatesFirstFiscalYearReturnOnAssets getReturnOnAssets() {
    return returnOnAssets;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssets(InlineResponse20012DataEstimatesFirstFiscalYearReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public InlineResponse20012DataEstimatesSecondFiscalYear returnOnEquity(InlineResponse20012DataEstimatesFirstFiscalYearReturnOnEquity returnOnEquity) {
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

  public InlineResponse20012DataEstimatesFirstFiscalYearReturnOnEquity getReturnOnEquity() {
    return returnOnEquity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquity(InlineResponse20012DataEstimatesFirstFiscalYearReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }


  public InlineResponse20012DataEstimatesSecondFiscalYear ratios(InlineResponse20012DataEstimatesFirstFiscalYearRatios ratios) {
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

  public InlineResponse20012DataEstimatesFirstFiscalYearRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(InlineResponse20012DataEstimatesFirstFiscalYearRatios ratios) {
    this.ratios = ratios;
  }


  /**
   * Return true if this inline_response_200_12_data_estimates_secondFiscalYear object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012DataEstimatesSecondFiscalYear inlineResponse20012DataEstimatesSecondFiscalYear = (InlineResponse20012DataEstimatesSecondFiscalYear) o;
    return Objects.equals(this.fiscalYear, inlineResponse20012DataEstimatesSecondFiscalYear.fiscalYear) &&
        Objects.equals(this.currencyDependentEstimates, inlineResponse20012DataEstimatesSecondFiscalYear.currencyDependentEstimates) &&
        Objects.equals(this.returnOnAssets, inlineResponse20012DataEstimatesSecondFiscalYear.returnOnAssets) &&
        Objects.equals(this.returnOnEquity, inlineResponse20012DataEstimatesSecondFiscalYear.returnOnEquity) &&
        Objects.equals(this.ratios, inlineResponse20012DataEstimatesSecondFiscalYear.ratios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currencyDependentEstimates, returnOnAssets, returnOnEquity, ratios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012DataEstimatesSecondFiscalYear {\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    currencyDependentEstimates: ").append(toIndentedString(currencyDependentEstimates)).append("\n");
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

