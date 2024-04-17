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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsPenalty;
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
 * 2
 */
@ApiModel(description = "2")
@JsonPropertyOrder({
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_NAME,
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_ASSET_VALUE,
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_MAX_PERCENT,
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_PENALTY,
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_GROUPS,
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_UNIT,
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_LEVEL,
  OptimizerInputsDiversificationConstraint.JSON_PROPERTY_HIERARCHY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsDiversificationConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ASSET_VALUE = "asset_value";
  private OptimizerInputsValue assetValue;

  public static final String JSON_PROPERTY_MAX_PERCENT = "max_percent";
  private OptimizerInputsValue maxPercent;

  public static final String JSON_PROPERTY_PENALTY = "penalty";
  private OptimizerInputsPenalty penalty;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private java.util.List<OptimizerInputsConstraintGroup> groups = null;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private OptimizerInputsEConstraintUnitTypeEnum unit;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private OptimizerInputsEConstraintLevelEnum level;

  public static final String JSON_PROPERTY_HIERARCHY = "hierarchy";
  private Integer hierarchy;

  public OptimizerInputsDiversificationConstraint() { 
  }

  public OptimizerInputsDiversificationConstraint name(String name) {
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


  public OptimizerInputsDiversificationConstraint assetValue(OptimizerInputsValue assetValue) {
    this.assetValue = assetValue;
    return this;
  }

   /**
   * Get assetValue
   * @return assetValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getAssetValue() {
    return assetValue;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetValue(OptimizerInputsValue assetValue) {
    this.assetValue = assetValue;
  }


  public OptimizerInputsDiversificationConstraint maxPercent(OptimizerInputsValue maxPercent) {
    this.maxPercent = maxPercent;
    return this;
  }

   /**
   * Get maxPercent
   * @return maxPercent
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getMaxPercent() {
    return maxPercent;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPercent(OptimizerInputsValue maxPercent) {
    this.maxPercent = maxPercent;
  }


  public OptimizerInputsDiversificationConstraint penalty(OptimizerInputsPenalty penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsPenalty getPenalty() {
    return penalty;
  }


  @JsonProperty(JSON_PROPERTY_PENALTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPenalty(OptimizerInputsPenalty penalty) {
    this.penalty = penalty;
  }


  public OptimizerInputsDiversificationConstraint groups(java.util.List<OptimizerInputsConstraintGroup> groups) {
    this.groups = groups;
    return this;
  }

  public OptimizerInputsDiversificationConstraint addGroupsItem(OptimizerInputsConstraintGroup groupsItem) {
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


  public OptimizerInputsDiversificationConstraint unit(OptimizerInputsEConstraintUnitTypeEnum unit) {
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


  public OptimizerInputsDiversificationConstraint level(OptimizerInputsEConstraintLevelEnum level) {
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


  public OptimizerInputsDiversificationConstraint hierarchy(Integer hierarchy) {
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
   * Return true if this optimizer.inputs.DiversificationConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsDiversificationConstraint optimizerInputsDiversificationConstraint = (OptimizerInputsDiversificationConstraint) o;
    return Objects.equals(this.name, optimizerInputsDiversificationConstraint.name) &&
        Objects.equals(this.assetValue, optimizerInputsDiversificationConstraint.assetValue) &&
        Objects.equals(this.maxPercent, optimizerInputsDiversificationConstraint.maxPercent) &&
        Objects.equals(this.penalty, optimizerInputsDiversificationConstraint.penalty) &&
        Objects.equals(this.groups, optimizerInputsDiversificationConstraint.groups) &&
        Objects.equals(this.unit, optimizerInputsDiversificationConstraint.unit) &&
        Objects.equals(this.level, optimizerInputsDiversificationConstraint.level) &&
        Objects.equals(this.hierarchy, optimizerInputsDiversificationConstraint.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, assetValue, maxPercent, penalty, groups, unit, level, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsDiversificationConstraint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
    sb.append("    maxPercent: ").append(toIndentedString(maxPercent)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

