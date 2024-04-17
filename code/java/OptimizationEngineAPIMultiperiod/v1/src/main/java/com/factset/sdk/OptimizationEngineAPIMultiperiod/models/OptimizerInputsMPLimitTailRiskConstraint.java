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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsAcrossPeriods;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsBoundSourceEnum;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsLimitTailRiskConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsOnPeriods;
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
 * OptimizerInputsMPLimitTailRiskConstraint
 */
@JsonPropertyOrder({
  OptimizerInputsMPLimitTailRiskConstraint.JSON_PROPERTY_CONSTRAINT,
  OptimizerInputsMPLimitTailRiskConstraint.JSON_PROPERTY_CONSTRAINT_ON,
  OptimizerInputsMPLimitTailRiskConstraint.JSON_PROPERTY_ON_PERIODS,
  OptimizerInputsMPLimitTailRiskConstraint.JSON_PROPERTY_ACROSS_PERIODS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsMPLimitTailRiskConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONSTRAINT = "constraint";
  private OptimizerInputsLimitTailRiskConstraint constraint;

  public static final String JSON_PROPERTY_CONSTRAINT_ON = "constraint_on";
  private OptimizerInputsBoundSourceEnum constraintOn;

  public static final String JSON_PROPERTY_ON_PERIODS = "on_periods";
  private OptimizerInputsOnPeriods onPeriods;

  public static final String JSON_PROPERTY_ACROSS_PERIODS = "across_periods";
  private OptimizerInputsAcrossPeriods acrossPeriods;

  public OptimizerInputsMPLimitTailRiskConstraint() { 
  }

  public OptimizerInputsMPLimitTailRiskConstraint constraint(OptimizerInputsLimitTailRiskConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

   /**
   * Get constraint
   * @return constraint
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsLimitTailRiskConstraint getConstraint() {
    return constraint;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraint(OptimizerInputsLimitTailRiskConstraint constraint) {
    this.constraint = constraint;
  }


  public OptimizerInputsMPLimitTailRiskConstraint constraintOn(OptimizerInputsBoundSourceEnum constraintOn) {
    this.constraintOn = constraintOn;
    return this;
  }

   /**
   * Get constraintOn
   * @return constraintOn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRAINT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsBoundSourceEnum getConstraintOn() {
    return constraintOn;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraintOn(OptimizerInputsBoundSourceEnum constraintOn) {
    this.constraintOn = constraintOn;
  }


  public OptimizerInputsMPLimitTailRiskConstraint onPeriods(OptimizerInputsOnPeriods onPeriods) {
    this.onPeriods = onPeriods;
    return this;
  }

   /**
   * Get onPeriods
   * @return onPeriods
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ON_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsOnPeriods getOnPeriods() {
    return onPeriods;
  }


  @JsonProperty(JSON_PROPERTY_ON_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnPeriods(OptimizerInputsOnPeriods onPeriods) {
    this.onPeriods = onPeriods;
  }


  public OptimizerInputsMPLimitTailRiskConstraint acrossPeriods(OptimizerInputsAcrossPeriods acrossPeriods) {
    this.acrossPeriods = acrossPeriods;
    return this;
  }

   /**
   * Get acrossPeriods
   * @return acrossPeriods
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACROSS_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsAcrossPeriods getAcrossPeriods() {
    return acrossPeriods;
  }


  @JsonProperty(JSON_PROPERTY_ACROSS_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcrossPeriods(OptimizerInputsAcrossPeriods acrossPeriods) {
    this.acrossPeriods = acrossPeriods;
  }


  /**
   * Return true if this optimizer.inputs.MPLimitTailRiskConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMPLimitTailRiskConstraint optimizerInputsMPLimitTailRiskConstraint = (OptimizerInputsMPLimitTailRiskConstraint) o;
    return Objects.equals(this.constraint, optimizerInputsMPLimitTailRiskConstraint.constraint) &&
        Objects.equals(this.constraintOn, optimizerInputsMPLimitTailRiskConstraint.constraintOn) &&
        Objects.equals(this.onPeriods, optimizerInputsMPLimitTailRiskConstraint.onPeriods) &&
        Objects.equals(this.acrossPeriods, optimizerInputsMPLimitTailRiskConstraint.acrossPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraint, constraintOn, onPeriods, acrossPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMPLimitTailRiskConstraint {\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    constraintOn: ").append(toIndentedString(constraintOn)).append("\n");
    sb.append("    onPeriods: ").append(toIndentedString(onPeriods)).append("\n");
    sb.append("    acrossPeriods: ").append(toIndentedString(acrossPeriods)).append("\n");
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

