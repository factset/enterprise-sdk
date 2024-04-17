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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsExpectedReturnConstraint;
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
 * OptimizerInputsMPExpectedReturnConstraint
 */
@JsonPropertyOrder({
  OptimizerInputsMPExpectedReturnConstraint.JSON_PROPERTY_CONSTRAINT,
  OptimizerInputsMPExpectedReturnConstraint.JSON_PROPERTY_CONSTRAINT_ON,
  OptimizerInputsMPExpectedReturnConstraint.JSON_PROPERTY_ANNUALIZATION_FACTOR,
  OptimizerInputsMPExpectedReturnConstraint.JSON_PROPERTY_ON_PERIODS,
  OptimizerInputsMPExpectedReturnConstraint.JSON_PROPERTY_ACROSS_PERIODS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsMPExpectedReturnConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONSTRAINT = "constraint";
  private OptimizerInputsExpectedReturnConstraint constraint;

  public static final String JSON_PROPERTY_CONSTRAINT_ON = "constraint_on";
  private OptimizerInputsBoundSourceEnum constraintOn;

  public static final String JSON_PROPERTY_ANNUALIZATION_FACTOR = "annualization_factor";
  private Double annualizationFactor;

  public static final String JSON_PROPERTY_ON_PERIODS = "on_periods";
  private OptimizerInputsOnPeriods onPeriods;

  public static final String JSON_PROPERTY_ACROSS_PERIODS = "across_periods";
  private OptimizerInputsAcrossPeriods acrossPeriods;

  public OptimizerInputsMPExpectedReturnConstraint() { 
  }

  public OptimizerInputsMPExpectedReturnConstraint constraint(OptimizerInputsExpectedReturnConstraint constraint) {
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

  public OptimizerInputsExpectedReturnConstraint getConstraint() {
    return constraint;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraint(OptimizerInputsExpectedReturnConstraint constraint) {
    this.constraint = constraint;
  }


  public OptimizerInputsMPExpectedReturnConstraint constraintOn(OptimizerInputsBoundSourceEnum constraintOn) {
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


  public OptimizerInputsMPExpectedReturnConstraint annualizationFactor(Double annualizationFactor) {
    this.annualizationFactor = annualizationFactor;
    return this;
  }

   /**
   * Get annualizationFactor
   * @return annualizationFactor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNUALIZATION_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAnnualizationFactor() {
    return annualizationFactor;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZATION_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualizationFactor(Double annualizationFactor) {
    this.annualizationFactor = annualizationFactor;
  }


  public OptimizerInputsMPExpectedReturnConstraint onPeriods(OptimizerInputsOnPeriods onPeriods) {
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


  public OptimizerInputsMPExpectedReturnConstraint acrossPeriods(OptimizerInputsAcrossPeriods acrossPeriods) {
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
   * Return true if this optimizer.inputs.MPExpectedReturnConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMPExpectedReturnConstraint optimizerInputsMPExpectedReturnConstraint = (OptimizerInputsMPExpectedReturnConstraint) o;
    return Objects.equals(this.constraint, optimizerInputsMPExpectedReturnConstraint.constraint) &&
        Objects.equals(this.constraintOn, optimizerInputsMPExpectedReturnConstraint.constraintOn) &&
        Objects.equals(this.annualizationFactor, optimizerInputsMPExpectedReturnConstraint.annualizationFactor) &&
        Objects.equals(this.onPeriods, optimizerInputsMPExpectedReturnConstraint.onPeriods) &&
        Objects.equals(this.acrossPeriods, optimizerInputsMPExpectedReturnConstraint.acrossPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraint, constraintOn, annualizationFactor, onPeriods, acrossPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMPExpectedReturnConstraint {\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    constraintOn: ").append(toIndentedString(constraintOn)).append("\n");
    sb.append("    annualizationFactor: ").append(toIndentedString(annualizationFactor)).append("\n");
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

