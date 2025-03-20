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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationDdvLevel1;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel2;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel3;
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
 * Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (id&#x3D;18) covers all securitized derivatives.
 */
@ApiModel(description = "Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (id=18) covers all securitized derivatives.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa.JSON_PROPERTY_LEVEL1,
  PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa.JSON_PROPERTY_LEVEL2,
  PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa.JSON_PROPERTY_LEVEL3
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LEVEL1 = "level1";
  private PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationDdvLevel1 level1;

  public static final String JSON_PROPERTY_LEVEL2 = "level2";
  private PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel2 level2;

  public static final String JSON_PROPERTY_LEVEL3 = "level3";
  private PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel3 level3;

  public PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa() { 
  }

  public PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa level1(PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationDdvLevel1 level1) {
    this.level1 = level1;
    return this;
  }

   /**
   * Get level1
   * @return level1
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationDdvLevel1 getLevel1() {
    return level1;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel1(PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationDdvLevel1 level1) {
    this.level1 = level1;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa level2(PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel2 level2) {
    this.level2 = level2;
    return this;
  }

   /**
   * Get level2
   * @return level2
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel2 getLevel2() {
    return level2;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel2(PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel2 level2) {
    this.level2 = level2;
  }


  public PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa level3(PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel3 level3) {
    this.level3 = level3;
    return this;
  }

   /**
   * Get level3
   * @return level3
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel3 getLevel3() {
    return level3;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel3(PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipaLevel3 level3) {
    this.level3 = level3;
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationScreenerSearchDataItems_instrument_categorization_eusipa object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa postSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa = (PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa) o;
    return Objects.equals(this.level1, postSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa.level1) &&
        Objects.equals(this.level2, postSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa.level2) &&
        Objects.equals(this.level3, postSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa.level3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level1, level2, level3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorizationEusipa {\n");
    sb.append("    level1: ").append(toIndentedString(level1)).append("\n");
    sb.append("    level2: ").append(toIndentedString(level2)).append("\n");
    sb.append("    level3: ").append(toIndentedString(level3)).append("\n");
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

