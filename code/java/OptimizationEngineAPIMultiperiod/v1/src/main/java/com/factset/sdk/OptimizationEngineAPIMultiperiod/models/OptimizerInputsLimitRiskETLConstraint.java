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
 * 16
 */
@ApiModel(description = "16")
@JsonPropertyOrder({
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_NAME,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_MAX_ETL,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_CONFIDENCE_LEVEL,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_PENALTY,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_GROUPS,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_LEVEL,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_ACTIVE_ETL,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_BENCHMARK_INDEX,
  OptimizerInputsLimitRiskETLConstraint.JSON_PROPERTY_HIERARCHY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsLimitRiskETLConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MAX_ETL = "max_etl";
  private OptimizerInputsValue maxEtl;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private OptimizerInputsValue confidenceLevel;

  public static final String JSON_PROPERTY_PENALTY = "penalty";
  private OptimizerInputsPenalty penalty;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private java.util.List<OptimizerInputsConstraintGroup> groups = null;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private OptimizerInputsEConstraintLevelEnum level;

  public static final String JSON_PROPERTY_ACTIVE_ETL = "active_etl";
  private Boolean activeEtl;

  public static final String JSON_PROPERTY_BENCHMARK_INDEX = "benchmark_index";
  private Integer benchmarkIndex;

  public static final String JSON_PROPERTY_HIERARCHY = "hierarchy";
  private Integer hierarchy;

  public OptimizerInputsLimitRiskETLConstraint() { 
  }

  public OptimizerInputsLimitRiskETLConstraint name(String name) {
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


  public OptimizerInputsLimitRiskETLConstraint maxEtl(OptimizerInputsValue maxEtl) {
    this.maxEtl = maxEtl;
    return this;
  }

   /**
   * Get maxEtl
   * @return maxEtl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_ETL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getMaxEtl() {
    return maxEtl;
  }


  @JsonProperty(JSON_PROPERTY_MAX_ETL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxEtl(OptimizerInputsValue maxEtl) {
    this.maxEtl = maxEtl;
  }


  public OptimizerInputsLimitRiskETLConstraint confidenceLevel(OptimizerInputsValue confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

   /**
   * Get confidenceLevel
   * @return confidenceLevel
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getConfidenceLevel() {
    return confidenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfidenceLevel(OptimizerInputsValue confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }


  public OptimizerInputsLimitRiskETLConstraint penalty(OptimizerInputsPenalty penalty) {
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


  public OptimizerInputsLimitRiskETLConstraint groups(java.util.List<OptimizerInputsConstraintGroup> groups) {
    this.groups = groups;
    return this;
  }

  public OptimizerInputsLimitRiskETLConstraint addGroupsItem(OptimizerInputsConstraintGroup groupsItem) {
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


  public OptimizerInputsLimitRiskETLConstraint level(OptimizerInputsEConstraintLevelEnum level) {
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


  public OptimizerInputsLimitRiskETLConstraint activeEtl(Boolean activeEtl) {
    this.activeEtl = activeEtl;
    return this;
  }

   /**
   * Get activeEtl
   * @return activeEtl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE_ETL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveEtl() {
    return activeEtl;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_ETL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveEtl(Boolean activeEtl) {
    this.activeEtl = activeEtl;
  }


  public OptimizerInputsLimitRiskETLConstraint benchmarkIndex(Integer benchmarkIndex) {
    this.benchmarkIndex = benchmarkIndex;
    return this;
  }

   /**
   * Get benchmarkIndex
   * @return benchmarkIndex
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BENCHMARK_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBenchmarkIndex() {
    return benchmarkIndex;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARK_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmarkIndex(Integer benchmarkIndex) {
    this.benchmarkIndex = benchmarkIndex;
  }


  public OptimizerInputsLimitRiskETLConstraint hierarchy(Integer hierarchy) {
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
   * Return true if this optimizer.inputs.LimitRiskETLConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsLimitRiskETLConstraint optimizerInputsLimitRiskETLConstraint = (OptimizerInputsLimitRiskETLConstraint) o;
    return Objects.equals(this.name, optimizerInputsLimitRiskETLConstraint.name) &&
        Objects.equals(this.maxEtl, optimizerInputsLimitRiskETLConstraint.maxEtl) &&
        Objects.equals(this.confidenceLevel, optimizerInputsLimitRiskETLConstraint.confidenceLevel) &&
        Objects.equals(this.penalty, optimizerInputsLimitRiskETLConstraint.penalty) &&
        Objects.equals(this.groups, optimizerInputsLimitRiskETLConstraint.groups) &&
        Objects.equals(this.level, optimizerInputsLimitRiskETLConstraint.level) &&
        Objects.equals(this.activeEtl, optimizerInputsLimitRiskETLConstraint.activeEtl) &&
        Objects.equals(this.benchmarkIndex, optimizerInputsLimitRiskETLConstraint.benchmarkIndex) &&
        Objects.equals(this.hierarchy, optimizerInputsLimitRiskETLConstraint.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, maxEtl, confidenceLevel, penalty, groups, level, activeEtl, benchmarkIndex, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsLimitRiskETLConstraint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxEtl: ").append(toIndentedString(maxEtl)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    activeEtl: ").append(toIndentedString(activeEtl)).append("\n");
    sb.append("    benchmarkIndex: ").append(toIndentedString(benchmarkIndex)).append("\n");
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

