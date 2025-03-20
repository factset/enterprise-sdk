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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsLevel;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsNotation;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsValueUnit;
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
 * A list of objects. For semantical context see the description of the parent array.
 */
@ApiModel(description = "A list of objects. For semantical context see the description of the parent array.")
@JsonPropertyOrder({
  GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.JSON_PROPERTY_NAME,
  GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.JSON_PROPERTY_NOTATION,
  GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.JSON_PROPERTY_LEVEL,
  GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.JSON_PROPERTY_VALUE_UNIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsNotation notation;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsLevel level;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsValueUnit valueUnit;

  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems() { 
  }

  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the underlying, provided also if there is no notation for the underlying.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Name of the underlying, provided also if there is no notation for the underlying.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems notation(GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsNotation notation) {
    this.notation = notation;
    return this;
  }

   /**
   * Get notation
   * @return notation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsNotation getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsNotation notation) {
    this.notation = notation;
  }


  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems level(GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsLevel getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsLevel level) {
    this.level = level;
  }


  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems valueUnit(GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsValueUnit valueUnit) {
    this.valueUnit = valueUnit;
    return this;
  }

   /**
   * Get valueUnit
   * @return valueUnit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItemsValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  /**
   * Return true if this GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems getSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems = (GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems) o;
    return equalsNullable(this.name, getSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.name) &&
        Objects.equals(this.notation, getSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.notation) &&
        Objects.equals(this.level, getSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.level) &&
        Objects.equals(this.valueUnit, getSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.valueUnit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), notation, level, valueUnit);
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
    sb.append("class GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
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

