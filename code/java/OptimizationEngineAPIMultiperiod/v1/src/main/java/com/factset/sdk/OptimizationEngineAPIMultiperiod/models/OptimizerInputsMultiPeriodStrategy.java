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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsExpectedReturn;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMultiPeriodConstraints;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMultiPeriodObjective;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMultiPeriodOptions;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsTransactionCost;
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
 * OptimizerInputsMultiPeriodStrategy
 */
@JsonPropertyOrder({
  OptimizerInputsMultiPeriodStrategy.JSON_PROPERTY_OBJECTIVE,
  OptimizerInputsMultiPeriodStrategy.JSON_PROPERTY_CONSTRAINTS,
  OptimizerInputsMultiPeriodStrategy.JSON_PROPERTY_TRANSACTION_COST,
  OptimizerInputsMultiPeriodStrategy.JSON_PROPERTY_OPTIONS,
  OptimizerInputsMultiPeriodStrategy.JSON_PROPERTY_EXPECTED_RETURN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsMultiPeriodStrategy implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OBJECTIVE = "objective";
  private OptimizerInputsMultiPeriodObjective objective;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private OptimizerInputsMultiPeriodConstraints constraints;

  public static final String JSON_PROPERTY_TRANSACTION_COST = "transaction_cost";
  private OptimizerInputsTransactionCost transactionCost;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private OptimizerInputsMultiPeriodOptions options;

  public static final String JSON_PROPERTY_EXPECTED_RETURN = "expected_return";
  private OptimizerInputsExpectedReturn expectedReturn;

  public OptimizerInputsMultiPeriodStrategy() { 
  }

  public OptimizerInputsMultiPeriodStrategy objective(OptimizerInputsMultiPeriodObjective objective) {
    this.objective = objective;
    return this;
  }

   /**
   * Get objective
   * @return objective
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBJECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsMultiPeriodObjective getObjective() {
    return objective;
  }


  @JsonProperty(JSON_PROPERTY_OBJECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjective(OptimizerInputsMultiPeriodObjective objective) {
    this.objective = objective;
  }


  public OptimizerInputsMultiPeriodStrategy constraints(OptimizerInputsMultiPeriodConstraints constraints) {
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsMultiPeriodConstraints getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(OptimizerInputsMultiPeriodConstraints constraints) {
    this.constraints = constraints;
  }


  public OptimizerInputsMultiPeriodStrategy transactionCost(OptimizerInputsTransactionCost transactionCost) {
    this.transactionCost = transactionCost;
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

  public OptimizerInputsTransactionCost getTransactionCost() {
    return transactionCost;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionCost(OptimizerInputsTransactionCost transactionCost) {
    this.transactionCost = transactionCost;
  }


  public OptimizerInputsMultiPeriodStrategy options(OptimizerInputsMultiPeriodOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsMultiPeriodOptions getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(OptimizerInputsMultiPeriodOptions options) {
    this.options = options;
  }


  public OptimizerInputsMultiPeriodStrategy expectedReturn(OptimizerInputsExpectedReturn expectedReturn) {
    this.expectedReturn = expectedReturn;
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

  public OptimizerInputsExpectedReturn getExpectedReturn() {
    return expectedReturn;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedReturn(OptimizerInputsExpectedReturn expectedReturn) {
    this.expectedReturn = expectedReturn;
  }


  /**
   * Return true if this optimizer.inputs.MultiPeriodStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMultiPeriodStrategy optimizerInputsMultiPeriodStrategy = (OptimizerInputsMultiPeriodStrategy) o;
    return Objects.equals(this.objective, optimizerInputsMultiPeriodStrategy.objective) &&
        Objects.equals(this.constraints, optimizerInputsMultiPeriodStrategy.constraints) &&
        Objects.equals(this.transactionCost, optimizerInputsMultiPeriodStrategy.transactionCost) &&
        Objects.equals(this.options, optimizerInputsMultiPeriodStrategy.options) &&
        Objects.equals(this.expectedReturn, optimizerInputsMultiPeriodStrategy.expectedReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objective, constraints, transactionCost, options, expectedReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMultiPeriodStrategy {\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    transactionCost: ").append(toIndentedString(transactionCost)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    expectedReturn: ").append(toIndentedString(expectedReturn)).append("\n");
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

