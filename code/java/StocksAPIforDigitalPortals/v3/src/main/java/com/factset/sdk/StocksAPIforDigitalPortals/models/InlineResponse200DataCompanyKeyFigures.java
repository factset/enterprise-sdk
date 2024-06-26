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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200DataCompanyKeyFiguresCurrencyDependentKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200DataCompanyKeyFiguresFreeFloat;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200DataCompanyKeyFiguresSharesOutstanding;
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
 * Company key figures.
 */
@ApiModel(description = "Company key figures.")
@JsonPropertyOrder({
  InlineResponse200DataCompanyKeyFigures.JSON_PROPERTY_SHARES_OUTSTANDING,
  InlineResponse200DataCompanyKeyFigures.JSON_PROPERTY_FREE_FLOAT,
  InlineResponse200DataCompanyKeyFigures.JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse200DataCompanyKeyFigures implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SHARES_OUTSTANDING = "sharesOutstanding";
  private InlineResponse200DataCompanyKeyFiguresSharesOutstanding sharesOutstanding;

  public static final String JSON_PROPERTY_FREE_FLOAT = "freeFloat";
  private InlineResponse200DataCompanyKeyFiguresFreeFloat freeFloat;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES = "currencyDependentKeyFigures";
  private InlineResponse200DataCompanyKeyFiguresCurrencyDependentKeyFigures currencyDependentKeyFigures;

  public InlineResponse200DataCompanyKeyFigures() { 
  }

  public InlineResponse200DataCompanyKeyFigures sharesOutstanding(InlineResponse200DataCompanyKeyFiguresSharesOutstanding sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

   /**
   * Get sharesOutstanding
   * @return sharesOutstanding
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARES_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataCompanyKeyFiguresSharesOutstanding getSharesOutstanding() {
    return sharesOutstanding;
  }


  @JsonProperty(JSON_PROPERTY_SHARES_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharesOutstanding(InlineResponse200DataCompanyKeyFiguresSharesOutstanding sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }


  public InlineResponse200DataCompanyKeyFigures freeFloat(InlineResponse200DataCompanyKeyFiguresFreeFloat freeFloat) {
    this.freeFloat = freeFloat;
    return this;
  }

   /**
   * Get freeFloat
   * @return freeFloat
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREE_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataCompanyKeyFiguresFreeFloat getFreeFloat() {
    return freeFloat;
  }


  @JsonProperty(JSON_PROPERTY_FREE_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeFloat(InlineResponse200DataCompanyKeyFiguresFreeFloat freeFloat) {
    this.freeFloat = freeFloat;
  }


  public InlineResponse200DataCompanyKeyFigures currencyDependentKeyFigures(InlineResponse200DataCompanyKeyFiguresCurrencyDependentKeyFigures currencyDependentKeyFigures) {
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

  public InlineResponse200DataCompanyKeyFiguresCurrencyDependentKeyFigures getCurrencyDependentKeyFigures() {
    return currencyDependentKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentKeyFigures(InlineResponse200DataCompanyKeyFiguresCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
  }


  /**
   * Return true if this inline_response_200_data_companyKeyFigures object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataCompanyKeyFigures inlineResponse200DataCompanyKeyFigures = (InlineResponse200DataCompanyKeyFigures) o;
    return Objects.equals(this.sharesOutstanding, inlineResponse200DataCompanyKeyFigures.sharesOutstanding) &&
        Objects.equals(this.freeFloat, inlineResponse200DataCompanyKeyFigures.freeFloat) &&
        Objects.equals(this.currencyDependentKeyFigures, inlineResponse200DataCompanyKeyFigures.currencyDependentKeyFigures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharesOutstanding, freeFloat, currencyDependentKeyFigures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataCompanyKeyFigures {\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    freeFloat: ").append(toIndentedString(freeFloat)).append("\n");
    sb.append("    currencyDependentKeyFigures: ").append(toIndentedString(currencyDependentKeyFigures)).append("\n");
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

