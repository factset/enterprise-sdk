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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationInstrumentRestrictionList;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarket;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationNotationRestrictionList;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnit;
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
 * Validation parameters.
 */
@ApiModel(description = "Validation parameters.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.JSON_PROPERTY_ONLY_ACTIVE,
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.JSON_PROPERTY_PRICES,
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.JSON_PROPERTY_VALUE_UNIT,
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.JSON_PROPERTY_MARKET,
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST,
  PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.JSON_PROPERTY_NOTATION_RESTRICTION_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ONLY_ACTIVE = "onlyActive";
  private Boolean onlyActive = true;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices prices;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarket market;

  public static final String JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST = "instrumentRestrictionList";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationInstrumentRestrictionList instrumentRestrictionList;

  public static final String JSON_PROPERTY_NOTATION_RESTRICTION_LIST = "notationRestrictionList";
  private PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationNotationRestrictionList notationRestrictionList;

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation() { 
  }

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation onlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
    return this;
  }

   /**
   * If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.
   * @return onlyActive
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If `true`, only active notations will be returned. The term \"active\" reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.")
  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyActive() {
    return onlyActive;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation prices(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices prices) {
    this.prices = prices;
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices prices) {
    this.prices = prices;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation valueUnit(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnit valueUnit) {
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

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation market(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarket market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarket market) {
    this.market = market;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation instrumentRestrictionList(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationInstrumentRestrictionList instrumentRestrictionList) {
    this.instrumentRestrictionList = instrumentRestrictionList;
    return this;
  }

   /**
   * Get instrumentRestrictionList
   * @return instrumentRestrictionList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationInstrumentRestrictionList getInstrumentRestrictionList() {
    return instrumentRestrictionList;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrumentRestrictionList(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationInstrumentRestrictionList instrumentRestrictionList) {
    this.instrumentRestrictionList = instrumentRestrictionList;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation notationRestrictionList(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationNotationRestrictionList notationRestrictionList) {
    this.notationRestrictionList = notationRestrictionList;
    return this;
  }

   /**
   * Get notationRestrictionList
   * @return notationRestrictionList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationNotationRestrictionList getNotationRestrictionList() {
    return notationRestrictionList;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotationRestrictionList(PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationNotationRestrictionList notationRestrictionList) {
    this.notationRestrictionList = notationRestrictionList;
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationScreenerSearchRequest_data_validation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation postSecuritizedDerivativeNotationScreenerSearchRequestDataValidation = (PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation) o;
    return Objects.equals(this.onlyActive, postSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.onlyActive) &&
        Objects.equals(this.prices, postSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.prices) &&
        Objects.equals(this.valueUnit, postSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.valueUnit) &&
        Objects.equals(this.market, postSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.market) &&
        Objects.equals(this.instrumentRestrictionList, postSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.instrumentRestrictionList) &&
        Objects.equals(this.notationRestrictionList, postSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.notationRestrictionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyActive, prices, valueUnit, market, instrumentRestrictionList, notationRestrictionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation {\n");
    sb.append("    onlyActive: ").append(toIndentedString(onlyActive)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    instrumentRestrictionList: ").append(toIndentedString(instrumentRestrictionList)).append("\n");
    sb.append("    notationRestrictionList: ").append(toIndentedString(notationRestrictionList)).append("\n");
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

