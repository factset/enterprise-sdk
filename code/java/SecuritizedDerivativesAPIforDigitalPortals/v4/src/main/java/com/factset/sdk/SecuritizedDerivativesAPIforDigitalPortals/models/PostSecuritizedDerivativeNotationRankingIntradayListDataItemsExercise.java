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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Exercise data of the securitized derivative.
 */
@ApiModel(description = "Exercise data of the securitized derivative.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise.JSON_PROPERTY_RIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Exercise right. | Value | Description | | --- | --- | | put | A put option gives buyer the right, but not the obligation, to sell an asset at a specified price within a specific time period. Put is synonymous to short or bear and is used in a broader sense for products that make profits from falling underlying levels. | | call | A call option gives buyer the right, but not the obligation, to buy an asset at a specified price within a specific time period. Call is synonymous to long or bull and is used in a broader sense for products that make profits from rising underlying levels. |  
   */
  public enum RightEnum {
    PUT("put"),
    
    CALL("call");

    private String value;

    RightEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RightEnum fromValue(String value) {
      for (RightEnum b : RightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_RIGHT = "right";
  private JsonNullable<RightEnum> right = JsonNullable.<RightEnum>undefined();

  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise() { 
  }

  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise right(RightEnum right) {
    this.right = JsonNullable.<RightEnum>of(right);
    return this;
  }

   /**
   * Exercise right. | Value | Description | | --- | --- | | put | A put option gives buyer the right, but not the obligation, to sell an asset at a specified price within a specific time period. Put is synonymous to short or bear and is used in a broader sense for products that make profits from falling underlying levels. | | call | A call option gives buyer the right, but not the obligation, to buy an asset at a specified price within a specific time period. Call is synonymous to long or bull and is used in a broader sense for products that make profits from rising underlying levels. |  
   * @return right
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "call", value = "Exercise right. | Value | Description | | --- | --- | | put | A put option gives buyer the right, but not the obligation, to sell an asset at a specified price within a specific time period. Put is synonymous to short or bear and is used in a broader sense for products that make profits from falling underlying levels. | | call | A call option gives buyer the right, but not the obligation, to buy an asset at a specified price within a specific time period. Call is synonymous to long or bull and is used in a broader sense for products that make profits from rising underlying levels. |  ")
  @JsonIgnore

  public RightEnum getRight() {
        return right.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RightEnum> getRight_JsonNullable() {
    return right;
  }
  
  @JsonProperty(JSON_PROPERTY_RIGHT)
  public void setRight_JsonNullable(JsonNullable<RightEnum> right) {
    this.right = right;
  }

  public void setRight(RightEnum right) {
    this.right = JsonNullable.<RightEnum>of(right);
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationRankingIntradayListDataItems_exercise object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise postSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise = (PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise) o;
    return equalsNullable(this.right, postSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise.right);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(right));
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
    sb.append("class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsExercise {\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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

