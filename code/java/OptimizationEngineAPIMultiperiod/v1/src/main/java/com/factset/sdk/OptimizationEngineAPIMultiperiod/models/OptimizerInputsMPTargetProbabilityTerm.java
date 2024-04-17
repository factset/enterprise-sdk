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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsOnPeriods;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsTargetProbabilityTerm;
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
 * OptimizerInputsMPTargetProbabilityTerm
 */
@JsonPropertyOrder({
  OptimizerInputsMPTargetProbabilityTerm.JSON_PROPERTY_TERM,
  OptimizerInputsMPTargetProbabilityTerm.JSON_PROPERTY_CONSTRAIN_ON,
  OptimizerInputsMPTargetProbabilityTerm.JSON_PROPERTY_ON_PERIODS,
  OptimizerInputsMPTargetProbabilityTerm.JSON_PROPERTY_ACROSS_PERIODS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsMPTargetProbabilityTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TERM = "term";
  private OptimizerInputsTargetProbabilityTerm term;

  public static final String JSON_PROPERTY_CONSTRAIN_ON = "constrain_on";
  private OptimizerInputsBoundSourceEnum constrainOn;

  public static final String JSON_PROPERTY_ON_PERIODS = "on_periods";
  private OptimizerInputsOnPeriods onPeriods;

  public static final String JSON_PROPERTY_ACROSS_PERIODS = "across_periods";
  private OptimizerInputsAcrossPeriods acrossPeriods;

  public OptimizerInputsMPTargetProbabilityTerm() { 
  }

  public OptimizerInputsMPTargetProbabilityTerm term(OptimizerInputsTargetProbabilityTerm term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsTargetProbabilityTerm getTerm() {
    return term;
  }


  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerm(OptimizerInputsTargetProbabilityTerm term) {
    this.term = term;
  }


  public OptimizerInputsMPTargetProbabilityTerm constrainOn(OptimizerInputsBoundSourceEnum constrainOn) {
    this.constrainOn = constrainOn;
    return this;
  }

   /**
   * Get constrainOn
   * @return constrainOn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRAIN_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsBoundSourceEnum getConstrainOn() {
    return constrainOn;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAIN_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstrainOn(OptimizerInputsBoundSourceEnum constrainOn) {
    this.constrainOn = constrainOn;
  }


  public OptimizerInputsMPTargetProbabilityTerm onPeriods(OptimizerInputsOnPeriods onPeriods) {
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


  public OptimizerInputsMPTargetProbabilityTerm acrossPeriods(OptimizerInputsAcrossPeriods acrossPeriods) {
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
   * Return true if this optimizer.inputs.MPTargetProbabilityTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMPTargetProbabilityTerm optimizerInputsMPTargetProbabilityTerm = (OptimizerInputsMPTargetProbabilityTerm) o;
    return Objects.equals(this.term, optimizerInputsMPTargetProbabilityTerm.term) &&
        Objects.equals(this.constrainOn, optimizerInputsMPTargetProbabilityTerm.constrainOn) &&
        Objects.equals(this.onPeriods, optimizerInputsMPTargetProbabilityTerm.onPeriods) &&
        Objects.equals(this.acrossPeriods, optimizerInputsMPTargetProbabilityTerm.acrossPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, constrainOn, onPeriods, acrossPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMPTargetProbabilityTerm {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    constrainOn: ").append(toIndentedString(constrainOn)).append("\n");
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

