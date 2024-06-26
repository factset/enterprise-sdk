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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsRiskModelForPeriods;
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
 * OptimizerInputsMultiPeriodRiskModels
 */
@JsonPropertyOrder({
  OptimizerInputsMultiPeriodRiskModels.JSON_PROPERTY_RISK_MODELS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsMultiPeriodRiskModels implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RISK_MODELS = "risk_models";
  private java.util.List<OptimizerInputsRiskModelForPeriods> riskModels = null;

  public OptimizerInputsMultiPeriodRiskModels() { 
  }

  public OptimizerInputsMultiPeriodRiskModels riskModels(java.util.List<OptimizerInputsRiskModelForPeriods> riskModels) {
    this.riskModels = riskModels;
    return this;
  }

  public OptimizerInputsMultiPeriodRiskModels addRiskModelsItem(OptimizerInputsRiskModelForPeriods riskModelsItem) {
    if (this.riskModels == null) {
      this.riskModels = new java.util.ArrayList<>();
    }
    this.riskModels.add(riskModelsItem);
    return this;
  }

   /**
   * Get riskModels
   * @return riskModels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_MODELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsRiskModelForPeriods> getRiskModels() {
    return riskModels;
  }


  @JsonProperty(JSON_PROPERTY_RISK_MODELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskModels(java.util.List<OptimizerInputsRiskModelForPeriods> riskModels) {
    this.riskModels = riskModels;
  }


  /**
   * Return true if this optimizer.inputs.MultiPeriodRiskModels object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMultiPeriodRiskModels optimizerInputsMultiPeriodRiskModels = (OptimizerInputsMultiPeriodRiskModels) o;
    return Objects.equals(this.riskModels, optimizerInputsMultiPeriodRiskModels.riskModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMultiPeriodRiskModels {\n");
    sb.append("    riskModels: ").append(toIndentedString(riskModels)).append("\n");
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

