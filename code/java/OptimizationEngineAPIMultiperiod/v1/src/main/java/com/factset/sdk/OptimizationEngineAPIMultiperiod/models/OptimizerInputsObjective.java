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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsDiversificationRatioTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsDrawdownTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsExpectedReturnTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsExpectedTailLossTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsFactorExposureTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsGeneralLinearTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsRiskParityTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsSTARRTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsSensitivityTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsSharpeRatioTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsTransactionCostTerm;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsVolatilityTerm;
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
 * ToDo :Note to circle back to this when we have more info on factors
 */
@ApiModel(description = "ToDo :Note to circle back to this when we have more info on factors")
@JsonPropertyOrder({
  OptimizerInputsObjective.JSON_PROPERTY_FACTOR_EXPOSURE,
  OptimizerInputsObjective.JSON_PROPERTY_EXPECTED_TAIL_LOSS,
  OptimizerInputsObjective.JSON_PROPERTY_VOLATILITY,
  OptimizerInputsObjective.JSON_PROPERTY_DRAWDOWN,
  OptimizerInputsObjective.JSON_PROPERTY_GENERAL_LINEAR,
  OptimizerInputsObjective.JSON_PROPERTY_EXPECTED_RETURN,
  OptimizerInputsObjective.JSON_PROPERTY_SENSITIVITY,
  OptimizerInputsObjective.JSON_PROPERTY_SHARPE_RATIO,
  OptimizerInputsObjective.JSON_PROPERTY_STARR,
  OptimizerInputsObjective.JSON_PROPERTY_DIVERSIFICATION_RATIO,
  OptimizerInputsObjective.JSON_PROPERTY_NULL_RISK_PARITY,
  OptimizerInputsObjective.JSON_PROPERTY_RISK_PARITY,
  OptimizerInputsObjective.JSON_PROPERTY_TRANSACTION_COST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsObjective implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FACTOR_EXPOSURE = "factor_exposure";
  private java.util.List<OptimizerInputsFactorExposureTerm> factorExposure = null;

  public static final String JSON_PROPERTY_EXPECTED_TAIL_LOSS = "expected_tail_loss";
  private java.util.List<OptimizerInputsExpectedTailLossTerm> expectedTailLoss = null;

  public static final String JSON_PROPERTY_VOLATILITY = "volatility";
  private java.util.List<OptimizerInputsVolatilityTerm> volatility = null;

  public static final String JSON_PROPERTY_DRAWDOWN = "drawdown";
  private java.util.List<OptimizerInputsDrawdownTerm> drawdown = null;

  public static final String JSON_PROPERTY_GENERAL_LINEAR = "general_linear";
  private java.util.List<OptimizerInputsGeneralLinearTerm> generalLinear = null;

  public static final String JSON_PROPERTY_EXPECTED_RETURN = "expected_return";
  private java.util.List<OptimizerInputsExpectedReturnTerm> expectedReturn = null;

  public static final String JSON_PROPERTY_SENSITIVITY = "sensitivity";
  private java.util.List<OptimizerInputsSensitivityTerm> sensitivity = null;

  public static final String JSON_PROPERTY_SHARPE_RATIO = "sharpe_ratio";
  private OptimizerInputsSharpeRatioTerm sharpeRatio;

  public static final String JSON_PROPERTY_STARR = "starr";
  private OptimizerInputsSTARRTerm starr;

  public static final String JSON_PROPERTY_DIVERSIFICATION_RATIO = "diversification_ratio";
  private OptimizerInputsDiversificationRatioTerm diversificationRatio;

  public static final String JSON_PROPERTY_NULL_RISK_PARITY = "null_risk_parity";
  private Boolean nullRiskParity;

  public static final String JSON_PROPERTY_RISK_PARITY = "risk_parity";
  private OptimizerInputsRiskParityTerm riskParity;

  public static final String JSON_PROPERTY_TRANSACTION_COST = "transaction_cost";
  private java.util.List<OptimizerInputsTransactionCostTerm> transactionCost = null;

  public OptimizerInputsObjective() { 
  }

  public OptimizerInputsObjective factorExposure(java.util.List<OptimizerInputsFactorExposureTerm> factorExposure) {
    this.factorExposure = factorExposure;
    return this;
  }

  public OptimizerInputsObjective addFactorExposureItem(OptimizerInputsFactorExposureTerm factorExposureItem) {
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

  public java.util.List<OptimizerInputsFactorExposureTerm> getFactorExposure() {
    return factorExposure;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorExposure(java.util.List<OptimizerInputsFactorExposureTerm> factorExposure) {
    this.factorExposure = factorExposure;
  }


  public OptimizerInputsObjective expectedTailLoss(java.util.List<OptimizerInputsExpectedTailLossTerm> expectedTailLoss) {
    this.expectedTailLoss = expectedTailLoss;
    return this;
  }

  public OptimizerInputsObjective addExpectedTailLossItem(OptimizerInputsExpectedTailLossTerm expectedTailLossItem) {
    if (this.expectedTailLoss == null) {
      this.expectedTailLoss = new java.util.ArrayList<>();
    }
    this.expectedTailLoss.add(expectedTailLossItem);
    return this;
  }

   /**
   * Get expectedTailLoss
   * @return expectedTailLoss
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPECTED_TAIL_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsExpectedTailLossTerm> getExpectedTailLoss() {
    return expectedTailLoss;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_TAIL_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedTailLoss(java.util.List<OptimizerInputsExpectedTailLossTerm> expectedTailLoss) {
    this.expectedTailLoss = expectedTailLoss;
  }


  public OptimizerInputsObjective volatility(java.util.List<OptimizerInputsVolatilityTerm> volatility) {
    this.volatility = volatility;
    return this;
  }

  public OptimizerInputsObjective addVolatilityItem(OptimizerInputsVolatilityTerm volatilityItem) {
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

  public java.util.List<OptimizerInputsVolatilityTerm> getVolatility() {
    return volatility;
  }


  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolatility(java.util.List<OptimizerInputsVolatilityTerm> volatility) {
    this.volatility = volatility;
  }


  public OptimizerInputsObjective drawdown(java.util.List<OptimizerInputsDrawdownTerm> drawdown) {
    this.drawdown = drawdown;
    return this;
  }

  public OptimizerInputsObjective addDrawdownItem(OptimizerInputsDrawdownTerm drawdownItem) {
    if (this.drawdown == null) {
      this.drawdown = new java.util.ArrayList<>();
    }
    this.drawdown.add(drawdownItem);
    return this;
  }

   /**
   * Get drawdown
   * @return drawdown
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DRAWDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsDrawdownTerm> getDrawdown() {
    return drawdown;
  }


  @JsonProperty(JSON_PROPERTY_DRAWDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrawdown(java.util.List<OptimizerInputsDrawdownTerm> drawdown) {
    this.drawdown = drawdown;
  }


  public OptimizerInputsObjective generalLinear(java.util.List<OptimizerInputsGeneralLinearTerm> generalLinear) {
    this.generalLinear = generalLinear;
    return this;
  }

  public OptimizerInputsObjective addGeneralLinearItem(OptimizerInputsGeneralLinearTerm generalLinearItem) {
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

  public java.util.List<OptimizerInputsGeneralLinearTerm> getGeneralLinear() {
    return generalLinear;
  }


  @JsonProperty(JSON_PROPERTY_GENERAL_LINEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeneralLinear(java.util.List<OptimizerInputsGeneralLinearTerm> generalLinear) {
    this.generalLinear = generalLinear;
  }


  public OptimizerInputsObjective expectedReturn(java.util.List<OptimizerInputsExpectedReturnTerm> expectedReturn) {
    this.expectedReturn = expectedReturn;
    return this;
  }

  public OptimizerInputsObjective addExpectedReturnItem(OptimizerInputsExpectedReturnTerm expectedReturnItem) {
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

  public java.util.List<OptimizerInputsExpectedReturnTerm> getExpectedReturn() {
    return expectedReturn;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedReturn(java.util.List<OptimizerInputsExpectedReturnTerm> expectedReturn) {
    this.expectedReturn = expectedReturn;
  }


  public OptimizerInputsObjective sensitivity(java.util.List<OptimizerInputsSensitivityTerm> sensitivity) {
    this.sensitivity = sensitivity;
    return this;
  }

  public OptimizerInputsObjective addSensitivityItem(OptimizerInputsSensitivityTerm sensitivityItem) {
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

  public java.util.List<OptimizerInputsSensitivityTerm> getSensitivity() {
    return sensitivity;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitivity(java.util.List<OptimizerInputsSensitivityTerm> sensitivity) {
    this.sensitivity = sensitivity;
  }


  public OptimizerInputsObjective sharpeRatio(OptimizerInputsSharpeRatioTerm sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
    return this;
  }

   /**
   * Get sharpeRatio
   * @return sharpeRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARPE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsSharpeRatioTerm getSharpeRatio() {
    return sharpeRatio;
  }


  @JsonProperty(JSON_PROPERTY_SHARPE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharpeRatio(OptimizerInputsSharpeRatioTerm sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
  }


  public OptimizerInputsObjective starr(OptimizerInputsSTARRTerm starr) {
    this.starr = starr;
    return this;
  }

   /**
   * Get starr
   * @return starr
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STARR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsSTARRTerm getStarr() {
    return starr;
  }


  @JsonProperty(JSON_PROPERTY_STARR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStarr(OptimizerInputsSTARRTerm starr) {
    this.starr = starr;
  }


  public OptimizerInputsObjective diversificationRatio(OptimizerInputsDiversificationRatioTerm diversificationRatio) {
    this.diversificationRatio = diversificationRatio;
    return this;
  }

   /**
   * Get diversificationRatio
   * @return diversificationRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVERSIFICATION_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsDiversificationRatioTerm getDiversificationRatio() {
    return diversificationRatio;
  }


  @JsonProperty(JSON_PROPERTY_DIVERSIFICATION_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiversificationRatio(OptimizerInputsDiversificationRatioTerm diversificationRatio) {
    this.diversificationRatio = diversificationRatio;
  }


  public OptimizerInputsObjective nullRiskParity(Boolean nullRiskParity) {
    this.nullRiskParity = nullRiskParity;
    return this;
  }

   /**
   * This is true when there is no risk_parity
   * @return nullRiskParity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This is true when there is no risk_parity")
  @JsonProperty(JSON_PROPERTY_NULL_RISK_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNullRiskParity() {
    return nullRiskParity;
  }


  @JsonProperty(JSON_PROPERTY_NULL_RISK_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNullRiskParity(Boolean nullRiskParity) {
    this.nullRiskParity = nullRiskParity;
  }


  public OptimizerInputsObjective riskParity(OptimizerInputsRiskParityTerm riskParity) {
    this.riskParity = riskParity;
    return this;
  }

   /**
   * Get riskParity
   * @return riskParity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsRiskParityTerm getRiskParity() {
    return riskParity;
  }


  @JsonProperty(JSON_PROPERTY_RISK_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskParity(OptimizerInputsRiskParityTerm riskParity) {
    this.riskParity = riskParity;
  }


  public OptimizerInputsObjective transactionCost(java.util.List<OptimizerInputsTransactionCostTerm> transactionCost) {
    this.transactionCost = transactionCost;
    return this;
  }

  public OptimizerInputsObjective addTransactionCostItem(OptimizerInputsTransactionCostTerm transactionCostItem) {
    if (this.transactionCost == null) {
      this.transactionCost = new java.util.ArrayList<>();
    }
    this.transactionCost.add(transactionCostItem);
    return this;
  }

   /**
   * Get transactionCost
   * @return transactionCost
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsTransactionCostTerm> getTransactionCost() {
    return transactionCost;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionCost(java.util.List<OptimizerInputsTransactionCostTerm> transactionCost) {
    this.transactionCost = transactionCost;
  }


  /**
   * Return true if this optimizer.inputs.Objective object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsObjective optimizerInputsObjective = (OptimizerInputsObjective) o;
    return Objects.equals(this.factorExposure, optimizerInputsObjective.factorExposure) &&
        Objects.equals(this.expectedTailLoss, optimizerInputsObjective.expectedTailLoss) &&
        Objects.equals(this.volatility, optimizerInputsObjective.volatility) &&
        Objects.equals(this.drawdown, optimizerInputsObjective.drawdown) &&
        Objects.equals(this.generalLinear, optimizerInputsObjective.generalLinear) &&
        Objects.equals(this.expectedReturn, optimizerInputsObjective.expectedReturn) &&
        Objects.equals(this.sensitivity, optimizerInputsObjective.sensitivity) &&
        Objects.equals(this.sharpeRatio, optimizerInputsObjective.sharpeRatio) &&
        Objects.equals(this.starr, optimizerInputsObjective.starr) &&
        Objects.equals(this.diversificationRatio, optimizerInputsObjective.diversificationRatio) &&
        Objects.equals(this.nullRiskParity, optimizerInputsObjective.nullRiskParity) &&
        Objects.equals(this.riskParity, optimizerInputsObjective.riskParity) &&
        Objects.equals(this.transactionCost, optimizerInputsObjective.transactionCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factorExposure, expectedTailLoss, volatility, drawdown, generalLinear, expectedReturn, sensitivity, sharpeRatio, starr, diversificationRatio, nullRiskParity, riskParity, transactionCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsObjective {\n");
    sb.append("    factorExposure: ").append(toIndentedString(factorExposure)).append("\n");
    sb.append("    expectedTailLoss: ").append(toIndentedString(expectedTailLoss)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
    sb.append("    drawdown: ").append(toIndentedString(drawdown)).append("\n");
    sb.append("    generalLinear: ").append(toIndentedString(generalLinear)).append("\n");
    sb.append("    expectedReturn: ").append(toIndentedString(expectedReturn)).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(sensitivity)).append("\n");
    sb.append("    sharpeRatio: ").append(toIndentedString(sharpeRatio)).append("\n");
    sb.append("    starr: ").append(toIndentedString(starr)).append("\n");
    sb.append("    diversificationRatio: ").append(toIndentedString(diversificationRatio)).append("\n");
    sb.append("    nullRiskParity: ").append(toIndentedString(nullRiskParity)).append("\n");
    sb.append("    riskParity: ").append(toIndentedString(riskParity)).append("\n");
    sb.append("    transactionCost: ").append(toIndentedString(transactionCost)).append("\n");
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

