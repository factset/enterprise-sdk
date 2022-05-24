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
 * 12
 */
@ApiModel(description = "12")
@JsonPropertyOrder({
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_NAME,
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_ASSET_LEVEL,
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_CUSTOM_ASSET,
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_GROUPS,
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_LEVEL,
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_ASSET_TYPE,
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_GENERAL_VALUE,
  OptimizerInputsRoundlotsConstraint.JSON_PROPERTY_HIERARCHY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsRoundlotsConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ASSET_LEVEL = "asset_level";
  private OptimizerInputsValue assetLevel;

  public static final String JSON_PROPERTY_CUSTOM_ASSET = "custom_asset";
  private OptimizerInputsValue customAsset;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private java.util.List<OptimizerInputsConstraintGroup> groups = null;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private OptimizerInputsEConstraintLevelEnum level;

  public static final String JSON_PROPERTY_ASSET_TYPE = "asset_type";
  private OptimizerInputsEFPOConstraintAssetTypeEnum assetType;

  public static final String JSON_PROPERTY_GENERAL_VALUE = "general_value";
  private Double generalValue;

  public static final String JSON_PROPERTY_HIERARCHY = "hierarchy";
  private Integer hierarchy;

  public OptimizerInputsRoundlotsConstraint() { 
  }

  public OptimizerInputsRoundlotsConstraint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
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


  public OptimizerInputsRoundlotsConstraint assetLevel(OptimizerInputsValue assetLevel) {
    this.assetLevel = assetLevel;
    return this;
  }

   /**
   * Get assetLevel
   * @return assetLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getAssetLevel() {
    return assetLevel;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetLevel(OptimizerInputsValue assetLevel) {
    this.assetLevel = assetLevel;
  }


  public OptimizerInputsRoundlotsConstraint customAsset(OptimizerInputsValue customAsset) {
    this.customAsset = customAsset;
    return this;
  }

   /**
   * Get customAsset
   * @return customAsset
  **/
  @javax.annotation.Nullable
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


  public OptimizerInputsRoundlotsConstraint groups(java.util.List<OptimizerInputsConstraintGroup> groups) {
    this.groups = groups;
    return this;
  }

  public OptimizerInputsRoundlotsConstraint addGroupsItem(OptimizerInputsConstraintGroup groupsItem) {
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
  @javax.annotation.Nullable
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


  public OptimizerInputsRoundlotsConstraint level(OptimizerInputsEConstraintLevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
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


  public OptimizerInputsRoundlotsConstraint assetType(OptimizerInputsEFPOConstraintAssetTypeEnum assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
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


  public OptimizerInputsRoundlotsConstraint generalValue(Double generalValue) {
    this.generalValue = generalValue;
    return this;
  }

   /**
   * Get generalValue
   * @return generalValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENERAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getGeneralValue() {
    return generalValue;
  }


  @JsonProperty(JSON_PROPERTY_GENERAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeneralValue(Double generalValue) {
    this.generalValue = generalValue;
  }


  public OptimizerInputsRoundlotsConstraint hierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @javax.annotation.Nullable
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
   * Return true if this optimizer.inputs.RoundlotsConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsRoundlotsConstraint optimizerInputsRoundlotsConstraint = (OptimizerInputsRoundlotsConstraint) o;
    return Objects.equals(this.name, optimizerInputsRoundlotsConstraint.name) &&
        Objects.equals(this.assetLevel, optimizerInputsRoundlotsConstraint.assetLevel) &&
        Objects.equals(this.customAsset, optimizerInputsRoundlotsConstraint.customAsset) &&
        Objects.equals(this.groups, optimizerInputsRoundlotsConstraint.groups) &&
        Objects.equals(this.level, optimizerInputsRoundlotsConstraint.level) &&
        Objects.equals(this.assetType, optimizerInputsRoundlotsConstraint.assetType) &&
        Objects.equals(this.generalValue, optimizerInputsRoundlotsConstraint.generalValue) &&
        Objects.equals(this.hierarchy, optimizerInputsRoundlotsConstraint.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, assetLevel, customAsset, groups, level, assetType, generalValue, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsRoundlotsConstraint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assetLevel: ").append(toIndentedString(assetLevel)).append("\n");
    sb.append("    customAsset: ").append(toIndentedString(customAsset)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    generalValue: ").append(toIndentedString(generalValue)).append("\n");
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
