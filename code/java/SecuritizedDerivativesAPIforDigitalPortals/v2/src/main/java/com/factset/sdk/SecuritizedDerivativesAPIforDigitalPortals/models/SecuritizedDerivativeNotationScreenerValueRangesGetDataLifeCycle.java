/*
 * Securitized Derivatives API For Digital Portals
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity and fixed income instruments: See the Stocks API and the Bonds API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleIssue;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleRepayment;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Parameters related to important dates.
 */
@ApiModel(description = "Parameters related to important dates.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.JSON_PROPERTY_ISSUE,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.JSON_PROPERTY_MATURITY,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.JSON_PROPERTY_CALLABLE,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.JSON_PROPERTY_VALUATION,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.JSON_PROPERTY_REPAYMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ISSUE = "issue";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleIssue issue;

  public static final String JSON_PROPERTY_MATURITY = "maturity";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity maturity;

  public static final String JSON_PROPERTY_CALLABLE = "callable";
  private Boolean callable;

  public static final String JSON_PROPERTY_VALUATION = "valuation";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation valuation;

  public static final String JSON_PROPERTY_REPAYMENT = "repayment";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleRepayment repayment;

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle issue(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleIssue issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleIssue getIssue() {
    return issue;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssue(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleIssue issue) {
    this.issue = issue;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle maturity(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity maturity) {
    this.maturity = maturity;
    return this;
  }

   /**
   * Get maturity
   * @return maturity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity getMaturity() {
    return maturity;
  }


  @JsonProperty(JSON_PROPERTY_MATURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaturity(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity maturity) {
    this.maturity = maturity;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle callable(Boolean callable) {
    this.callable = callable;
    return this;
  }

   /**
   * Restricts the result to securitized derivatives that are callable (&#x60;true&#x60;) or are not callable (&#x60;false&#x60;). A callable instrument is one that may be redeemed by the issuer prior to maturity.
   * @return callable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restricts the result to securitized derivatives that are callable (`true`) or are not callable (`false`). A callable instrument is one that may be redeemed by the issuer prior to maturity.")
  @JsonProperty(JSON_PROPERTY_CALLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCallable() {
    return callable;
  }


  @JsonProperty(JSON_PROPERTY_CALLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallable(Boolean callable) {
    this.callable = callable;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle valuation(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation valuation) {
    this.valuation = valuation;
    return this;
  }

   /**
   * Get valuation
   * @return valuation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation getValuation() {
    return valuation;
  }


  @JsonProperty(JSON_PROPERTY_VALUATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValuation(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation valuation) {
    this.valuation = valuation;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle repayment(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleRepayment repayment) {
    this.repayment = repayment;
    return this;
  }

   /**
   * Get repayment
   * @return repayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleRepayment getRepayment() {
    return repayment;
  }


  @JsonProperty(JSON_PROPERTY_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepayment(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleRepayment repayment) {
    this.repayment = repayment;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_lifeCycle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycle = (SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle) o;
    return Objects.equals(this.issue, securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.issue) &&
        Objects.equals(this.maturity, securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.maturity) &&
        Objects.equals(this.callable, securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.callable) &&
        Objects.equals(this.valuation, securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.valuation) &&
        Objects.equals(this.repayment, securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.repayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, maturity, callable, valuation, repayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle {\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    maturity: ").append(toIndentedString(maturity)).append("\n");
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
    sb.append("    valuation: ").append(toIndentedString(valuation)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
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

