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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Main currency of the trading value. For securitized derivatives quoted in percent, it is also the currency of the nominal trading volume, for the latter see attribute &#x60;accumulated.tradingVolume&#x60;. For securitized derivatives quoted in units, this attribute contains the same unit as the attribute &#x60;valueUnit&#x60;. See endpoint &#x60;/basic/value-unit/main/currency/list&#x60; for possible values.
 */
@ApiModel(description = "Main currency of the trading value. For securitized derivatives quoted in percent, it is also the currency of the nominal trading volume, for the latter see attribute `accumulated.tradingVolume`. For securitized derivatives quoted in units, this attribute contains the same unit as the attribute `valueUnit`. See endpoint `/basic/value-unit/main/currency/list` for possible values.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency.JSON_PROPERTY_ID,
  PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency.JSON_PROPERTY_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency() { 
  }

  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of the currency.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Identifier of the currency.")
  @JsonIgnore

  public BigDecimal getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<BigDecimal> id) {
    this.id = id;
  }

  public void setId(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
  }


  public PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

   /**
   * Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.")
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationRankingIntradayListDataItems_accumulated_currency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency postSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency = (PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency) o;
    return equalsNullable(this.id, postSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency.id) &&
        equalsNullable(this.code, postSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency.code);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(code));
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
    sb.append("class PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

