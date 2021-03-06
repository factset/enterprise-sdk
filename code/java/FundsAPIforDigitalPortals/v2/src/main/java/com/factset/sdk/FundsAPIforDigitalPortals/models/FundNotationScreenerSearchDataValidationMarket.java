/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataValidationMarketPriority;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataValidationMarketSelection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Market-related notation selection.
 */
@ApiModel(description = "Market-related notation selection.")
@JsonPropertyOrder({
  FundNotationScreenerSearchDataValidationMarket.JSON_PROPERTY_SELECTION,
  FundNotationScreenerSearchDataValidationMarket.JSON_PROPERTY_PRIORITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundNotationScreenerSearchDataValidationMarket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELECTION = "selection";
  private FundNotationScreenerSearchDataValidationMarketSelection selection;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private FundNotationScreenerSearchDataValidationMarketPriority priority;

  public FundNotationScreenerSearchDataValidationMarket() { 
  }

  public FundNotationScreenerSearchDataValidationMarket selection(FundNotationScreenerSearchDataValidationMarketSelection selection) {
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

  public FundNotationScreenerSearchDataValidationMarketSelection getSelection() {
    return selection;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelection(FundNotationScreenerSearchDataValidationMarketSelection selection) {
    this.selection = selection;
  }


  public FundNotationScreenerSearchDataValidationMarket priority(FundNotationScreenerSearchDataValidationMarketPriority priority) {
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

  public FundNotationScreenerSearchDataValidationMarketPriority getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(FundNotationScreenerSearchDataValidationMarketPriority priority) {
    this.priority = priority;
  }


  /**
   * Return true if this _fund_notation_screener_search_data_validation_market object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundNotationScreenerSearchDataValidationMarket fundNotationScreenerSearchDataValidationMarket = (FundNotationScreenerSearchDataValidationMarket) o;
    return Objects.equals(this.selection, fundNotationScreenerSearchDataValidationMarket.selection) &&
        Objects.equals(this.priority, fundNotationScreenerSearchDataValidationMarket.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selection, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundNotationScreenerSearchDataValidationMarket {\n");
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

