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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsAsset;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsCompositeAsset;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsDerivative;
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
 * OptimizerInputsTotalUniverse
 */
@JsonPropertyOrder({
  OptimizerInputsTotalUniverse.JSON_PROPERTY_ASSETS,
  OptimizerInputsTotalUniverse.JSON_PROPERTY_COMPOSITE_ASSETS,
  OptimizerInputsTotalUniverse.JSON_PROPERTY_DERIVATIVES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsTotalUniverse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ASSETS = "assets";
  private java.util.List<OptimizerInputsAsset> assets = null;

  public static final String JSON_PROPERTY_COMPOSITE_ASSETS = "composite_assets";
  private OptimizerInputsCompositeAsset compositeAssets;

  public static final String JSON_PROPERTY_DERIVATIVES = "derivatives";
  private OptimizerInputsDerivative derivatives;

  public OptimizerInputsTotalUniverse() { 
  }

  public OptimizerInputsTotalUniverse assets(java.util.List<OptimizerInputsAsset> assets) {
    this.assets = assets;
    return this;
  }

  public OptimizerInputsTotalUniverse addAssetsItem(OptimizerInputsAsset assetsItem) {
    if (this.assets == null) {
      this.assets = new java.util.ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsAsset> getAssets() {
    return assets;
  }


  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssets(java.util.List<OptimizerInputsAsset> assets) {
    this.assets = assets;
  }


  public OptimizerInputsTotalUniverse compositeAssets(OptimizerInputsCompositeAsset compositeAssets) {
    this.compositeAssets = compositeAssets;
    return this;
  }

   /**
   * Get compositeAssets
   * @return compositeAssets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPOSITE_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsCompositeAsset getCompositeAssets() {
    return compositeAssets;
  }


  @JsonProperty(JSON_PROPERTY_COMPOSITE_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompositeAssets(OptimizerInputsCompositeAsset compositeAssets) {
    this.compositeAssets = compositeAssets;
  }


  public OptimizerInputsTotalUniverse derivatives(OptimizerInputsDerivative derivatives) {
    this.derivatives = derivatives;
    return this;
  }

   /**
   * Get derivatives
   * @return derivatives
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DERIVATIVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsDerivative getDerivatives() {
    return derivatives;
  }


  @JsonProperty(JSON_PROPERTY_DERIVATIVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDerivatives(OptimizerInputsDerivative derivatives) {
    this.derivatives = derivatives;
  }


  /**
   * Return true if this optimizer.inputs.TotalUniverse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsTotalUniverse optimizerInputsTotalUniverse = (OptimizerInputsTotalUniverse) o;
    return Objects.equals(this.assets, optimizerInputsTotalUniverse.assets) &&
        Objects.equals(this.compositeAssets, optimizerInputsTotalUniverse.compositeAssets) &&
        Objects.equals(this.derivatives, optimizerInputsTotalUniverse.derivatives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, compositeAssets, derivatives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsTotalUniverse {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    compositeAssets: ").append(toIndentedString(compositeAssets)).append("\n");
    sb.append("    derivatives: ").append(toIndentedString(derivatives)).append("\n");
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

