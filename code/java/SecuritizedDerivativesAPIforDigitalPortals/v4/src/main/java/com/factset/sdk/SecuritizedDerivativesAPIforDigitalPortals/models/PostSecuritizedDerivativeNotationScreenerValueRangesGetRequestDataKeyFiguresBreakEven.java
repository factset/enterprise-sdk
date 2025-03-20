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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPoint;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistance;
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
 * Break even point. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the securitized derivative.
 */
@ApiModel(description = "Break even point. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the securitized derivative.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven.JSON_PROPERTY_BREAK_EVEN_POINT,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven.JSON_PROPERTY_DISTANCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BREAK_EVEN_POINT = "breakEvenPoint";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPoint breakEvenPoint;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistance distance;

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven() { 
  }

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven breakEvenPoint(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPoint breakEvenPoint) {
    this.breakEvenPoint = breakEvenPoint;
    return this;
  }

   /**
   * Get breakEvenPoint
   * @return breakEvenPoint
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREAK_EVEN_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPoint getBreakEvenPoint() {
    return breakEvenPoint;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_EVEN_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakEvenPoint(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPoint breakEvenPoint) {
    this.breakEvenPoint = breakEvenPoint;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven distance(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistance distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistance getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistance(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistance distance) {
    this.distance = distance;
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest_data_keyFigures_breakEven object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven = (PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven) o;
    return Objects.equals(this.breakEvenPoint, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven.breakEvenPoint) &&
        Objects.equals(this.distance, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakEvenPoint, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven {\n");
    sb.append("    breakEvenPoint: ").append(toIndentedString(breakEvenPoint)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

