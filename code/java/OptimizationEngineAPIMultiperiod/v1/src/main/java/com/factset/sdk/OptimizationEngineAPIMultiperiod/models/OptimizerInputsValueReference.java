/*
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OptimizationEngineAPIMultiperiod.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.JSON;


/**
 * Contains the results of an asset-level formula from FPO, mapping the TotalUniverse asset index to resulting value. The list of ValueReferences in the LookupTables should provide results for ALL formulae referenced throughout the FPO strategy. When the optimizer encounters a \&quot;reference\&quot; value in the strategy, it will come here to resolve the value for each asset within the scope of that reference.
 */
@ApiModel(description = "Contains the results of an asset-level formula from FPO, mapping the TotalUniverse asset index to resulting value. The list of ValueReferences in the LookupTables should provide results for ALL formulae referenced throughout the FPO strategy. When the optimizer encounters a \"reference\" value in the strategy, it will come here to resolve the value for each asset within the scope of that reference.")
@JsonPropertyOrder({
  OptimizerInputsValueReference.JSON_PROPERTY_ASSET_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsValueReference implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ASSET_VALUES = "asset_values";
  private Double assetValues;

  public OptimizerInputsValueReference() { 
  }

  public OptimizerInputsValueReference assetValues(Double assetValues) {
    this.assetValues = assetValues;
    return this;
  }

   /**
   * Get assetValues
   * @return assetValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAssetValues() {
    return assetValues;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetValues(Double assetValues) {
    this.assetValues = assetValues;
  }


  /**
   * Return true if this optimizer.inputs.ValueReference object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsValueReference optimizerInputsValueReference = (OptimizerInputsValueReference) o;
    return Objects.equals(this.assetValues, optimizerInputsValueReference.assetValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsValueReference {\n");
    sb.append("    assetValues: ").append(toIndentedString(assetValues)).append("\n");
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

