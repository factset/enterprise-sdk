/*
 * Bonds API For Digital Portals
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationMarketPriority;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationMarketSelection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Market-related notation selection. See endpoint &#x60;/basic/market/list&#x60; for valid values.
 */
@ApiModel(description = "Market-related notation selection. See endpoint `/basic/market/list` for valid values.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchDataValidationMarket.JSON_PROPERTY_SELECTION,
  DebtInstrumentNotationScreenerSearchDataValidationMarket.JSON_PROPERTY_PRIORITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchDataValidationMarket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELECTION = "selection";
  private DebtInstrumentNotationScreenerSearchDataValidationMarketSelection selection;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private DebtInstrumentNotationScreenerSearchDataValidationMarketPriority priority;

  public DebtInstrumentNotationScreenerSearchDataValidationMarket() { 
  }

  public DebtInstrumentNotationScreenerSearchDataValidationMarket selection(DebtInstrumentNotationScreenerSearchDataValidationMarketSelection selection) {
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataValidationMarketSelection getSelection() {
    return selection;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelection(DebtInstrumentNotationScreenerSearchDataValidationMarketSelection selection) {
    this.selection = selection;
  }


  public DebtInstrumentNotationScreenerSearchDataValidationMarket priority(DebtInstrumentNotationScreenerSearchDataValidationMarketPriority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataValidationMarketPriority getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(DebtInstrumentNotationScreenerSearchDataValidationMarketPriority priority) {
    this.priority = priority;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_data_validation_market object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchDataValidationMarket debtInstrumentNotationScreenerSearchDataValidationMarket = (DebtInstrumentNotationScreenerSearchDataValidationMarket) o;
    return Objects.equals(this.selection, debtInstrumentNotationScreenerSearchDataValidationMarket.selection) &&
        Objects.equals(this.priority, debtInstrumentNotationScreenerSearchDataValidationMarket.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selection, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchDataValidationMarket {\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

