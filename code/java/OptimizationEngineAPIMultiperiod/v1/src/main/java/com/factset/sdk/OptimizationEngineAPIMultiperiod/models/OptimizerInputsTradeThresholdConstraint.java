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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsConstraintGroup;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsEConstraintLevelEnum;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsEConstraintUnitTypeEnum;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsEFPOConstraintAssetTypeEnum;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsValue;
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
 * 13
 */
@ApiModel(description = "13")
@JsonPropertyOrder({
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_NAME,
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_MIN,
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_CUSTOM_ASSET,
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_GROUPS,
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_LEVEL,
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_UNIT,
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_ASSET_TYPE,
  OptimizerInputsTradeThresholdConstraint.JSON_PROPERTY_HIERARCHY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsTradeThresholdConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MIN = "min";
  private OptimizerInputsValue min;

  public static final String JSON_PROPERTY_CUSTOM_ASSET = "custom_asset";
  private OptimizerInputsValue customAsset;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private java.util.List<OptimizerInputsConstraintGroup> groups = null;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private OptimizerInputsEConstraintLevelEnum level;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private OptimizerInputsEConstraintUnitTypeEnum unit;

  public static final String JSON_PROPERTY_ASSET_TYPE = "asset_type";
  private OptimizerInputsEFPOConstraintAssetTypeEnum assetType;

  public static final String JSON_PROPERTY_HIERARCHY = "hierarchy";
  private Integer hierarchy;

  public OptimizerInputsTradeThresholdConstraint() { 
  }

  public OptimizerInputsTradeThresholdConstraint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public OptimizerInputsTradeThresholdConstraint min(OptimizerInputsValue min) {
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(OptimizerInputsValue min) {
    this.min = min;
  }


  public OptimizerInputsTradeThresholdConstraint customAsset(OptimizerInputsValue customAsset) {
    this.customAsset = customAsset;
    return this;
  }

   /**
   * Get customAsset
   * @return customAsset
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getCustomAsset() {
    return customAsset;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomAsset(OptimizerInputsValue customAsset) {
    this.customAsset = customAsset;
  }


  public OptimizerInputsTradeThresholdConstraint groups(java.util.List<OptimizerInputsConstraintGroup> groups) {
    this.groups = groups;
    return this;
  }

  public OptimizerInputsTradeThresholdConstraint addGroupsItem(OptimizerInputsConstraintGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsConstraintGroup> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(java.util.List<OptimizerInputsConstraintGroup> groups) {
    this.groups = groups;
  }


  public OptimizerInputsTradeThresholdConstraint level(OptimizerInputsEConstraintLevelEnum level) {
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

  public OptimizerInputsEConstraintLevelEnum getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(OptimizerInputsEConstraintLevelEnum level) {
    this.level = level;
  }


  public OptimizerInputsTradeThresholdConstraint unit(OptimizerInputsEConstraintUnitTypeEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsEConstraintUnitTypeEnum getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(OptimizerInputsEConstraintUnitTypeEnum unit) {
    this.unit = unit;
  }


  public OptimizerInputsTradeThresholdConstraint assetType(OptimizerInputsEFPOConstraintAssetTypeEnum assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsEFPOConstraintAssetTypeEnum getAssetType() {
    return assetType;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetType(OptimizerInputsEFPOConstraintAssetTypeEnum assetType) {
    this.assetType = assetType;
  }


  public OptimizerInputsTradeThresholdConstraint hierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIERARCHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHierarchy() {
    return hierarchy;
  }


  @JsonProperty(JSON_PROPERTY_HIERARCHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
  }


  /**
   * Return true if this optimizer.inputs.TradeThresholdConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsTradeThresholdConstraint optimizerInputsTradeThresholdConstraint = (OptimizerInputsTradeThresholdConstraint) o;
    return Objects.equals(this.name, optimizerInputsTradeThresholdConstraint.name) &&
        Objects.equals(this.min, optimizerInputsTradeThresholdConstraint.min) &&
        Objects.equals(this.customAsset, optimizerInputsTradeThresholdConstraint.customAsset) &&
        Objects.equals(this.groups, optimizerInputsTradeThresholdConstraint.groups) &&
        Objects.equals(this.level, optimizerInputsTradeThresholdConstraint.level) &&
        Objects.equals(this.unit, optimizerInputsTradeThresholdConstraint.unit) &&
        Objects.equals(this.assetType, optimizerInputsTradeThresholdConstraint.assetType) &&
        Objects.equals(this.hierarchy, optimizerInputsTradeThresholdConstraint.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, min, customAsset, groups, level, unit, assetType, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsTradeThresholdConstraint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    customAsset: ").append(toIndentedString(customAsset)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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

