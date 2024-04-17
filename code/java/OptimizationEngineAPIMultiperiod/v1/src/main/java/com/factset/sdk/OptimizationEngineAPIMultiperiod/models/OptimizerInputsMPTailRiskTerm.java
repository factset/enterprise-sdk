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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsTailRiskTerm;
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
 * OptimizerInputsMPTailRiskTerm
 */
@JsonPropertyOrder({
  OptimizerInputsMPTailRiskTerm.JSON_PROPERTY_TERM,
  OptimizerInputsMPTailRiskTerm.JSON_PROPERTY_TERM_ON,
  OptimizerInputsMPTailRiskTerm.JSON_PROPERTY_ON_PERIODS,
  OptimizerInputsMPTailRiskTerm.JSON_PROPERTY_ACROSS_PERIODS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsMPTailRiskTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TERM = "term";
  private OptimizerInputsTailRiskTerm term;

  public static final String JSON_PROPERTY_TERM_ON = "term_on";
  private OptimizerInputsBoundSourceEnum termOn;

  public static final String JSON_PROPERTY_ON_PERIODS = "on_periods";
  private OptimizerInputsOnPeriods onPeriods;

  public static final String JSON_PROPERTY_ACROSS_PERIODS = "across_periods";
  private OptimizerInputsAcrossPeriods acrossPeriods;

  public OptimizerInputsMPTailRiskTerm() { 
  }

  public OptimizerInputsMPTailRiskTerm term(OptimizerInputsTailRiskTerm term) {
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

  public OptimizerInputsTailRiskTerm getTerm() {
    return term;
  }


  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerm(OptimizerInputsTailRiskTerm term) {
    this.term = term;
  }


  public OptimizerInputsMPTailRiskTerm termOn(OptimizerInputsBoundSourceEnum termOn) {
    this.termOn = termOn;
    return this;
  }

   /**
   * Get termOn
   * @return termOn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TERM_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsBoundSourceEnum getTermOn() {
    return termOn;
  }


  @JsonProperty(JSON_PROPERTY_TERM_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermOn(OptimizerInputsBoundSourceEnum termOn) {
    this.termOn = termOn;
  }


  public OptimizerInputsMPTailRiskTerm onPeriods(OptimizerInputsOnPeriods onPeriods) {
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


  public OptimizerInputsMPTailRiskTerm acrossPeriods(OptimizerInputsAcrossPeriods acrossPeriods) {
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
   * Return true if this optimizer.inputs.MPTailRiskTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMPTailRiskTerm optimizerInputsMPTailRiskTerm = (OptimizerInputsMPTailRiskTerm) o;
    return Objects.equals(this.term, optimizerInputsMPTailRiskTerm.term) &&
        Objects.equals(this.termOn, optimizerInputsMPTailRiskTerm.termOn) &&
        Objects.equals(this.onPeriods, optimizerInputsMPTailRiskTerm.onPeriods) &&
        Objects.equals(this.acrossPeriods, optimizerInputsMPTailRiskTerm.acrossPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, termOn, onPeriods, acrossPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMPTailRiskTerm {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    termOn: ").append(toIndentedString(termOn)).append("\n");
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

