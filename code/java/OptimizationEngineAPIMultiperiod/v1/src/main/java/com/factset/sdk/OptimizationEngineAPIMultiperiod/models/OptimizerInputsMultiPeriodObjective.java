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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPExpectedReturnTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPFactorExposureTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPGeneralLinearTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPObjectiveRatioTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPSensitivityTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPTailRiskTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPTargetProbabilityTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPVolatilityTerm;
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
 * OptimizerInputsMultiPeriodObjective
 */
@JsonPropertyOrder({
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_FACTOR_EXPOSURE,
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_VOLATILITY,
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_GENERAL_LINEAR,
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_EXPECTED_RETURN,
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_SENSITIVITY,
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_OBJECTIVE_RATIO,
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_TAIL_RISK,
  OptimizerInputsMultiPeriodObjective.JSON_PROPERTY_TARGET_PROBABILITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsMultiPeriodObjective implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FACTOR_EXPOSURE = "factor_exposure";
  private java.util.List<OptimizerInputsMPFactorExposureTerm> factorExposure = null;

  public static final String JSON_PROPERTY_VOLATILITY = "volatility";
  private java.util.List<OptimizerInputsMPVolatilityTerm> volatility = null;

  public static final String JSON_PROPERTY_GENERAL_LINEAR = "general_linear";
  private java.util.List<OptimizerInputsMPGeneralLinearTerm> generalLinear = null;

  public static final String JSON_PROPERTY_EXPECTED_RETURN = "expected_return";
  private java.util.List<OptimizerInputsMPExpectedReturnTerm> expectedReturn = null;

  public static final String JSON_PROPERTY_SENSITIVITY = "sensitivity";
  private java.util.List<OptimizerInputsMPSensitivityTerm> sensitivity = null;

  public static final String JSON_PROPERTY_OBJECTIVE_RATIO = "objective_ratio";
  private OptimizerInputsMPObjectiveRatioTerm objectiveRatio;

  public static final String JSON_PROPERTY_TAIL_RISK = "tail_risk";
  private java.util.List<OptimizerInputsMPTailRiskTerm> tailRisk = null;

  public static final String JSON_PROPERTY_TARGET_PROBABILITY = "target_probability";
  private java.util.List<OptimizerInputsMPTargetProbabilityTerm> targetProbability = null;

  public OptimizerInputsMultiPeriodObjective() { 
  }

  public OptimizerInputsMultiPeriodObjective factorExposure(java.util.List<OptimizerInputsMPFactorExposureTerm> factorExposure) {
    this.factorExposure = factorExposure;
    return this;
  }

  public OptimizerInputsMultiPeriodObjective addFactorExposureItem(OptimizerInputsMPFactorExposureTerm factorExposureItem) {
    if (this.factorExposure == null) {
      this.factorExposure = new java.util.ArrayList<>();
    }
    this.factorExposure.add(factorExposureItem);
    return this;
  }

   /**
   * Get factorExposure
   * @return factorExposure
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACTOR_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPFactorExposureTerm> getFactorExposure() {
    return factorExposure;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorExposure(java.util.List<OptimizerInputsMPFactorExposureTerm> factorExposure) {
    this.factorExposure = factorExposure;
  }


  public OptimizerInputsMultiPeriodObjective volatility(java.util.List<OptimizerInputsMPVolatilityTerm> volatility) {
    this.volatility = volatility;
    return this;
  }

  public OptimizerInputsMultiPeriodObjective addVolatilityItem(OptimizerInputsMPVolatilityTerm volatilityItem) {
    if (this.volatility == null) {
      this.volatility = new java.util.ArrayList<>();
    }
    this.volatility.add(volatilityItem);
    return this;
  }

   /**
   * Get volatility
   * @return volatility
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPVolatilityTerm> getVolatility() {
    return volatility;
  }


  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolatility(java.util.List<OptimizerInputsMPVolatilityTerm> volatility) {
    this.volatility = volatility;
  }


  public OptimizerInputsMultiPeriodObjective generalLinear(java.util.List<OptimizerInputsMPGeneralLinearTerm> generalLinear) {
    this.generalLinear = generalLinear;
    return this;
  }

  public OptimizerInputsMultiPeriodObjective addGeneralLinearItem(OptimizerInputsMPGeneralLinearTerm generalLinearItem) {
    if (this.generalLinear == null) {
      this.generalLinear = new java.util.ArrayList<>();
    }
    this.generalLinear.add(generalLinearItem);
    return this;
  }

   /**
   * Get generalLinear
   * @return generalLinear
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENERAL_LINEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPGeneralLinearTerm> getGeneralLinear() {
    return generalLinear;
  }


  @JsonProperty(JSON_PROPERTY_GENERAL_LINEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeneralLinear(java.util.List<OptimizerInputsMPGeneralLinearTerm> generalLinear) {
    this.generalLinear = generalLinear;
  }


  public OptimizerInputsMultiPeriodObjective expectedReturn(java.util.List<OptimizerInputsMPExpectedReturnTerm> expectedReturn) {
    this.expectedReturn = expectedReturn;
    return this;
  }

  public OptimizerInputsMultiPeriodObjective addExpectedReturnItem(OptimizerInputsMPExpectedReturnTerm expectedReturnItem) {
    if (this.expectedReturn == null) {
      this.expectedReturn = new java.util.ArrayList<>();
    }
    this.expectedReturn.add(expectedReturnItem);
    return this;
  }

   /**
   * Get expectedReturn
   * @return expectedReturn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPECTED_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPExpectedReturnTerm> getExpectedReturn() {
    return expectedReturn;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedReturn(java.util.List<OptimizerInputsMPExpectedReturnTerm> expectedReturn) {
    this.expectedReturn = expectedReturn;
  }


  public OptimizerInputsMultiPeriodObjective sensitivity(java.util.List<OptimizerInputsMPSensitivityTerm> sensitivity) {
    this.sensitivity = sensitivity;
    return this;
  }

  public OptimizerInputsMultiPeriodObjective addSensitivityItem(OptimizerInputsMPSensitivityTerm sensitivityItem) {
    if (this.sensitivity == null) {
      this.sensitivity = new java.util.ArrayList<>();
    }
    this.sensitivity.add(sensitivityItem);
    return this;
  }

   /**
   * Get sensitivity
   * @return sensitivity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPSensitivityTerm> getSensitivity() {
    return sensitivity;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitivity(java.util.List<OptimizerInputsMPSensitivityTerm> sensitivity) {
    this.sensitivity = sensitivity;
  }


  public OptimizerInputsMultiPeriodObjective objectiveRatio(OptimizerInputsMPObjectiveRatioTerm objectiveRatio) {
    this.objectiveRatio = objectiveRatio;
    return this;
  }

   /**
   * Get objectiveRatio
   * @return objectiveRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBJECTIVE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsMPObjectiveRatioTerm getObjectiveRatio() {
    return objectiveRatio;
  }


  @JsonProperty(JSON_PROPERTY_OBJECTIVE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectiveRatio(OptimizerInputsMPObjectiveRatioTerm objectiveRatio) {
    this.objectiveRatio = objectiveRatio;
  }


  public OptimizerInputsMultiPeriodObjective tailRisk(java.util.List<OptimizerInputsMPTailRiskTerm> tailRisk) {
    this.tailRisk = tailRisk;
    return this;
  }

  public OptimizerInputsMultiPeriodObjective addTailRiskItem(OptimizerInputsMPTailRiskTerm tailRiskItem) {
    if (this.tailRisk == null) {
      this.tailRisk = new java.util.ArrayList<>();
    }
    this.tailRisk.add(tailRiskItem);
    return this;
  }

   /**
   * MultiPeriod-Specific
   * @return tailRisk
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MultiPeriod-Specific")
  @JsonProperty(JSON_PROPERTY_TAIL_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPTailRiskTerm> getTailRisk() {
    return tailRisk;
  }


  @JsonProperty(JSON_PROPERTY_TAIL_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailRisk(java.util.List<OptimizerInputsMPTailRiskTerm> tailRisk) {
    this.tailRisk = tailRisk;
  }


  public OptimizerInputsMultiPeriodObjective targetProbability(java.util.List<OptimizerInputsMPTargetProbabilityTerm> targetProbability) {
    this.targetProbability = targetProbability;
    return this;
  }

  public OptimizerInputsMultiPeriodObjective addTargetProbabilityItem(OptimizerInputsMPTargetProbabilityTerm targetProbabilityItem) {
    if (this.targetProbability == null) {
      this.targetProbability = new java.util.ArrayList<>();
    }
    this.targetProbability.add(targetProbabilityItem);
    return this;
  }

   /**
   * Get targetProbability
   * @return targetProbability
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPTargetProbabilityTerm> getTargetProbability() {
    return targetProbability;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetProbability(java.util.List<OptimizerInputsMPTargetProbabilityTerm> targetProbability) {
    this.targetProbability = targetProbability;
  }


  /**
   * Return true if this optimizer.inputs.MultiPeriodObjective object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMultiPeriodObjective optimizerInputsMultiPeriodObjective = (OptimizerInputsMultiPeriodObjective) o;
    return Objects.equals(this.factorExposure, optimizerInputsMultiPeriodObjective.factorExposure) &&
        Objects.equals(this.volatility, optimizerInputsMultiPeriodObjective.volatility) &&
        Objects.equals(this.generalLinear, optimizerInputsMultiPeriodObjective.generalLinear) &&
        Objects.equals(this.expectedReturn, optimizerInputsMultiPeriodObjective.expectedReturn) &&
        Objects.equals(this.sensitivity, optimizerInputsMultiPeriodObjective.sensitivity) &&
        Objects.equals(this.objectiveRatio, optimizerInputsMultiPeriodObjective.objectiveRatio) &&
        Objects.equals(this.tailRisk, optimizerInputsMultiPeriodObjective.tailRisk) &&
        Objects.equals(this.targetProbability, optimizerInputsMultiPeriodObjective.targetProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factorExposure, volatility, generalLinear, expectedReturn, sensitivity, objectiveRatio, tailRisk, targetProbability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMultiPeriodObjective {\n");
    sb.append("    factorExposure: ").append(toIndentedString(factorExposure)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
    sb.append("    generalLinear: ").append(toIndentedString(generalLinear)).append("\n");
    sb.append("    expectedReturn: ").append(toIndentedString(expectedReturn)).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(sensitivity)).append("\n");
    sb.append("    objectiveRatio: ").append(toIndentedString(objectiveRatio)).append("\n");
    sb.append("    tailRisk: ").append(toIndentedString(tailRisk)).append("\n");
    sb.append("    targetProbability: ").append(toIndentedString(targetProbability)).append("\n");
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

