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
 * Regional-level identifiers.
 */
@ApiModel(description = "Regional-level identifiers.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional.JSON_PROPERTY_PERMANENT_IDENTIFIER,
  PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional.JSON_PROPERTY_TICKER_REGION,
  PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional.JSON_PROPERTY_IS_PRIMARY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private JsonNullable<String> permanentIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TICKER_REGION = "tickerRegion";
  private JsonNullable<String> tickerRegion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_PRIMARY = "isPrimary";
  private JsonNullable<Boolean> isPrimary = JsonNullable.<Boolean>undefined();

  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional() { 
  }

  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = JsonNullable.<String>of(permanentIdentifier);
    return this;
  }

   /**
   * FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).
   * @return permanentIdentifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "DJC0PL-S", value = "FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).")
  @JsonIgnore

  public String getPermanentIdentifier() {
        return permanentIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPermanentIdentifier_JsonNullable() {
    return permanentIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  public void setPermanentIdentifier_JsonNullable(JsonNullable<String> permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
  }

  public void setPermanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = JsonNullable.<String>of(permanentIdentifier);
  }


  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional tickerRegion(String tickerRegion) {
    this.tickerRegion = JsonNullable.<String>of(tickerRegion);
    return this;
  }

   /**
   * FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE).
   * @return tickerRegion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FDS-US", value = "FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE).")
  @JsonIgnore

  public String getTickerRegion() {
        return tickerRegion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTickerRegion_JsonNullable() {
    return tickerRegion;
  }
  
  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  public void setTickerRegion_JsonNullable(JsonNullable<String> tickerRegion) {
    this.tickerRegion = tickerRegion;
  }

  public void setTickerRegion(String tickerRegion) {
    this.tickerRegion = JsonNullable.<String>of(tickerRegion);
  }


  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional isPrimary(Boolean isPrimary) {
    this.isPrimary = JsonNullable.<Boolean>of(isPrimary);
    return this;
  }

   /**
   * Indicates whether the notation is in the primary region of the security (&#x60;true&#x60;) or not (&#x60;false&#x60;).
   * @return isPrimary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates whether the notation is in the primary region of the security (`true`) or not (`false`).")
  @JsonIgnore

  public Boolean getIsPrimary() {
        return isPrimary.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsPrimary_JsonNullable() {
    return isPrimary;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  public void setIsPrimary_JsonNullable(JsonNullable<Boolean> isPrimary) {
    this.isPrimary = isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = JsonNullable.<Boolean>of(isPrimary);
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationRankingIntradayListDataItems_fsym_regional object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional postSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional = (PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional) o;
    return equalsNullable(this.permanentIdentifier, postSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional.permanentIdentifier) &&
        equalsNullable(this.tickerRegion, postSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional.tickerRegion) &&
        equalsNullable(this.isPrimary, postSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional.isPrimary);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(permanentIdentifier), hashCodeNullable(tickerRegion), hashCodeNullable(isPrimary));
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
    sb.append("class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsFsymRegional {\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
    sb.append("    tickerRegion: ").append(toIndentedString(tickerRegion)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

