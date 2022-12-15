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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20013InstrumentIndustryClassificationRbics;
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
 * Industry classification.
 */
@ApiModel(description = "Industry classification.")
@JsonPropertyOrder({
  InlineResponse20013InstrumentIndustryClassification.JSON_PROPERTY_RBICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20013InstrumentIndustryClassification implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RBICS = "rbics";
  private java.util.List<InlineResponse20013InstrumentIndustryClassificationRbics> rbics = null;

  public InlineResponse20013InstrumentIndustryClassification() { 
  }

  public InlineResponse20013InstrumentIndustryClassification rbics(java.util.List<InlineResponse20013InstrumentIndustryClassificationRbics> rbics) {
    this.rbics = rbics;
    return this;
  }

  public InlineResponse20013InstrumentIndustryClassification addRbicsItem(InlineResponse20013InstrumentIndustryClassificationRbics rbicsItem) {
    if (this.rbics == null) {
      this.rbics = new java.util.ArrayList<>();
    }
    this.rbics.add(rbicsItem);
    return this;
  }

   /**
   * Classification based on FactSet Revere Business Industry Classification System (RBICS). The categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity. See endpoint &#x60;/category/listBySystem&#x60; for category system 48 for possible values.
   * @return rbics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Classification based on FactSet Revere Business Industry Classification System (RBICS). The categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity. See endpoint `/category/listBySystem` for category system 48 for possible values.")
  @JsonProperty(JSON_PROPERTY_RBICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20013InstrumentIndustryClassificationRbics> getRbics() {
    return rbics;
  }


  @JsonProperty(JSON_PROPERTY_RBICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRbics(java.util.List<InlineResponse20013InstrumentIndustryClassificationRbics> rbics) {
    this.rbics = rbics;
  }


  /**
   * Return true if this inline_response_200_13_instrument_industryClassification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013InstrumentIndustryClassification inlineResponse20013InstrumentIndustryClassification = (InlineResponse20013InstrumentIndustryClassification) o;
    return Objects.equals(this.rbics, inlineResponse20013InstrumentIndustryClassification.rbics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rbics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013InstrumentIndustryClassification {\n");
    sb.append("    rbics: ").append(toIndentedString(rbics)).append("\n");
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

