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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems;
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
 * Underlying data, barrier conditions, and related cash flows.
 */
@ApiModel(description = "Underlying data, barrier conditions, and related cash flows.")
@JsonPropertyOrder({
  InlineResponse2007Data.JSON_PROPERTY_ID_INSTRUMENT,
  InlineResponse2007Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse2007Data.JSON_PROPERTY_UNDERLYINGS,
  InlineResponse2007Data.JSON_PROPERTY_BARRIER_TYPE_CONDITIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2007Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_INSTRUMENT = "idInstrument";
  private JsonNullable<String> idInstrument = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNDERLYINGS = "underlyings";
  private java.util.List<GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems> underlyings = null;

  public static final String JSON_PROPERTY_BARRIER_TYPE_CONDITIONS = "barrierTypeConditions";
  private java.util.List<GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems> barrierTypeConditions = null;

  public InlineResponse2007Data() { 
  }

  public InlineResponse2007Data idInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
    return this;
  }

   /**
   * MDG identifier of the instrument.
   * @return idInstrument
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "209485", value = "MDG identifier of the instrument.")
  @JsonIgnore

  public String getIdInstrument() {
        return idInstrument.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdInstrument_JsonNullable() {
    return idInstrument;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  public void setIdInstrument_JsonNullable(JsonNullable<String> idInstrument) {
    this.idInstrument = idInstrument;
  }

  public void setIdInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
  }


  public InlineResponse2007Data sourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
    return this;
  }

   /**
   * Identifier used in the request.
   * @return sourceIdentifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FDS-US", value = "Identifier used in the request.")
  @JsonIgnore

  public String getSourceIdentifier() {
        return sourceIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSourceIdentifier_JsonNullable() {
    return sourceIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  public void setSourceIdentifier_JsonNullable(JsonNullable<String> sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
  }


  public InlineResponse2007Data underlyings(java.util.List<GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems> underlyings) {
    this.underlyings = underlyings;
    return this;
  }

  public InlineResponse2007Data addUnderlyingsItem(GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems underlyingsItem) {
    if (this.underlyings == null) {
      this.underlyings = new java.util.ArrayList<>();
    }
    this.underlyings.add(underlyingsItem);
    return this;
  }

   /**
   * Information regarding the underlying(s) of the securitized derivative.
   * @return underlyings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Information regarding the underlying(s) of the securitized derivative.")
  @JsonProperty(JSON_PROPERTY_UNDERLYINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems> getUnderlyings() {
    return underlyings;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlyings(java.util.List<GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems> underlyings) {
    this.underlyings = underlyings;
  }


  public InlineResponse2007Data barrierTypeConditions(java.util.List<GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems> barrierTypeConditions) {
    this.barrierTypeConditions = barrierTypeConditions;
    return this;
  }

  public InlineResponse2007Data addBarrierTypeConditionsItem(GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems barrierTypeConditionsItem) {
    if (this.barrierTypeConditions == null) {
      this.barrierTypeConditions = new java.util.ArrayList<>();
    }
    this.barrierTypeConditions.add(barrierTypeConditionsItem);
    return this;
  }

   /**
   * Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any.
   * @return barrierTypeConditions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any.")
  @JsonProperty(JSON_PROPERTY_BARRIER_TYPE_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems> getBarrierTypeConditions() {
    return barrierTypeConditions;
  }


  @JsonProperty(JSON_PROPERTY_BARRIER_TYPE_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarrierTypeConditions(java.util.List<GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems> barrierTypeConditions) {
    this.barrierTypeConditions = barrierTypeConditions;
  }


  /**
   * Return true if this inline_response_200_7_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Data inlineResponse2007Data = (InlineResponse2007Data) o;
    return equalsNullable(this.idInstrument, inlineResponse2007Data.idInstrument) &&
        equalsNullable(this.sourceIdentifier, inlineResponse2007Data.sourceIdentifier) &&
        Objects.equals(this.underlyings, inlineResponse2007Data.underlyings) &&
        Objects.equals(this.barrierTypeConditions, inlineResponse2007Data.barrierTypeConditions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idInstrument), hashCodeNullable(sourceIdentifier), underlyings, barrierTypeConditions);
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
    sb.append("class InlineResponse2007Data {\n");
    sb.append("    idInstrument: ").append(toIndentedString(idInstrument)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    underlyings: ").append(toIndentedString(underlyings)).append("\n");
    sb.append("    barrierTypeConditions: ").append(toIndentedString(barrierTypeConditions)).append("\n");
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

