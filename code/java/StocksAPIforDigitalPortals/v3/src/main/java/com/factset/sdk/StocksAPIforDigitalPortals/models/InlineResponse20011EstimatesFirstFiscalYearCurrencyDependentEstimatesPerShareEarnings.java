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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Earnings per share (EPS), which is ratio of the net income, divided by the shares outstanding. For European equities, EPS is adjusted for exceptional and any non-recurring items. For Asian equities, EPS is as reported (as per local accounting standards). For US, Canada &amp; South Africa, EPS reflects the analysts’ and company’s standards.
 */
@ApiModel(description = "Earnings per share (EPS), which is ratio of the net income, divided by the shares outstanding. For European equities, EPS is adjusted for exceptional and any non-recurring items. For Asian equities, EPS is as reported (as per local accounting standards). For US, Canada & South Africa, EPS reflects the analysts’ and company’s standards.")
@JsonPropertyOrder({
  InlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings.JSON_PROPERTY_MEAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MEAN = "mean";
  private BigDecimal mean;

  public InlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings() { 
  }

  public InlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Mean value.
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mean value.")
  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMean() {
    return mean;
  }


  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }


  /**
   * Return true if this inline_response_200_11_estimates_firstFiscalYear_currencyDependentEstimates_perShare_earnings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings inlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings = (InlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings) o;
    return Objects.equals(this.mean, inlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings.mean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings {\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
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
