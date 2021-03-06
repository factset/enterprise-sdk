/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Specific indicators for Italy.
 */
@ApiModel(description = "Specific indicators for Italy.")
@JsonPropertyOrder({
  InlineResponse20062DataCostsAndChargesExAnteItaly.JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_ENTRY_COST,
  InlineResponse20062DataCostsAndChargesExAnteItaly.JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_EXIT_COST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataCostsAndChargesExAnteItaly implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_ENTRY_COST = "oneOffMaximumFixedEntryCost";
  private InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost oneOffMaximumFixedEntryCost;

  public static final String JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_EXIT_COST = "oneOffMaximumFixedExitCost";
  private InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost oneOffMaximumFixedExitCost;

  public InlineResponse20062DataCostsAndChargesExAnteItaly() { 
  }

  public InlineResponse20062DataCostsAndChargesExAnteItaly oneOffMaximumFixedEntryCost(InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost oneOffMaximumFixedEntryCost) {
    this.oneOffMaximumFixedEntryCost = oneOffMaximumFixedEntryCost;
    return this;
  }

   /**
   * Get oneOffMaximumFixedEntryCost
   * @return oneOffMaximumFixedEntryCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_ENTRY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost getOneOffMaximumFixedEntryCost() {
    return oneOffMaximumFixedEntryCost;
  }


  @JsonProperty(JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_ENTRY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneOffMaximumFixedEntryCost(InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost oneOffMaximumFixedEntryCost) {
    this.oneOffMaximumFixedEntryCost = oneOffMaximumFixedEntryCost;
  }


  public InlineResponse20062DataCostsAndChargesExAnteItaly oneOffMaximumFixedExitCost(InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost oneOffMaximumFixedExitCost) {
    this.oneOffMaximumFixedExitCost = oneOffMaximumFixedExitCost;
    return this;
  }

   /**
   * Get oneOffMaximumFixedExitCost
   * @return oneOffMaximumFixedExitCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_EXIT_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost getOneOffMaximumFixedExitCost() {
    return oneOffMaximumFixedExitCost;
  }


  @JsonProperty(JSON_PROPERTY_ONE_OFF_MAXIMUM_FIXED_EXIT_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneOffMaximumFixedExitCost(InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost oneOffMaximumFixedExitCost) {
    this.oneOffMaximumFixedExitCost = oneOffMaximumFixedExitCost;
  }


  /**
   * Return true if this inline_response_200_62_data_costsAndCharges_exAnte_italy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataCostsAndChargesExAnteItaly inlineResponse20062DataCostsAndChargesExAnteItaly = (InlineResponse20062DataCostsAndChargesExAnteItaly) o;
    return Objects.equals(this.oneOffMaximumFixedEntryCost, inlineResponse20062DataCostsAndChargesExAnteItaly.oneOffMaximumFixedEntryCost) &&
        Objects.equals(this.oneOffMaximumFixedExitCost, inlineResponse20062DataCostsAndChargesExAnteItaly.oneOffMaximumFixedExitCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneOffMaximumFixedEntryCost, oneOffMaximumFixedExitCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataCostsAndChargesExAnteItaly {\n");
    sb.append("    oneOffMaximumFixedEntryCost: ").append(toIndentedString(oneOffMaximumFixedEntryCost)).append("\n");
    sb.append("    oneOffMaximumFixedExitCost: ").append(toIndentedString(oneOffMaximumFixedExitCost)).append("\n");
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

