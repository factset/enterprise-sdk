/*
 * Securitized Derivatives API For Digital Portals
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.  
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAbsolute;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAnnualized;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioRelative;
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
 * Agio. For plain vanilla warrants, it represents the difference between the ask price of the derivative and its parity (see attribute &#x60;parity&#x60;). Thus, for those with exercise right &#x60;call&#x60;, the agio indicates how much more expensive would it be to obtain the underlying through purchasing and exercising the warrant compared to directly purchasing the underlying. For those with exercise right &#x60;put&#x60;, the above consideration is applied inversely. For other types of securitized derivatives, the calculation and interpretation of the agio depends on their category. Negative values are possible.
 */
@ApiModel(description = "Agio. For plain vanilla warrants, it represents the difference between the ask price of the derivative and its parity (see attribute `parity`). Thus, for those with exercise right `call`, the agio indicates how much more expensive would it be to obtain the underlying through purchasing and exercising the warrant compared to directly purchasing the underlying. For those with exercise right `put`, the above consideration is applied inversely. For other types of securitized derivatives, the calculation and interpretation of the agio depends on their category. Negative values are possible.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio.JSON_PROPERTY_ABSOLUTE,
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio.JSON_PROPERTY_RELATIVE,
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio.JSON_PROPERTY_ANNUALIZED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAbsolute absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioRelative relative;

  public static final String JSON_PROPERTY_ANNUALIZED = "annualized";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAnnualized annualized;

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio() { 
  }

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio absolute(PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAbsolute absolute) {
    this.absolute = absolute;
    return this;
  }

   /**
   * Get absolute
   * @return absolute
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAbsolute getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAbsolute absolute) {
    this.absolute = absolute;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio relative(PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioRelative relative) {
    this.relative = relative;
    return this;
  }

   /**
   * Get relative
   * @return relative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioRelative getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioRelative relative) {
    this.relative = relative;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio annualized(PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAnnualized annualized) {
    this.annualized = annualized;
    return this;
  }

   /**
   * Get annualized
   * @return annualized
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAnnualized getAnnualized() {
    return annualized;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualized(PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAnnualized annualized) {
    this.annualized = annualized;
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationScreenerSearchRequest_data_keyFigures_agio object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio postSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio = (PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio) o;
    return Objects.equals(this.absolute, postSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio.absolute) &&
        Objects.equals(this.relative, postSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio.relative) &&
        Objects.equals(this.annualized, postSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio.annualized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative, annualized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio {\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
    sb.append("    annualized: ").append(toIndentedString(annualized)).append("\n");
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

