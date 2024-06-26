/*
 * Axioma Equity API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.AxiomaEquityOptimizer.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.AxiomaEquityOptimizer.models.Optimization;
import com.factset.sdk.AxiomaEquityOptimizer.models.OptimizerAccount;
import com.factset.sdk.AxiomaEquityOptimizer.models.OptimizerOutputTypes;
import com.factset.sdk.AxiomaEquityOptimizer.models.OptimizerStrategy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.AxiomaEquityOptimizer.JSON;


/**
 * AxiomaEquityOptimizationParameters
 */
@JsonPropertyOrder({
  AxiomaEquityOptimizationParameters.JSON_PROPERTY_STRATEGY,
  AxiomaEquityOptimizationParameters.JSON_PROPERTY_ACCOUNT,
  AxiomaEquityOptimizationParameters.JSON_PROPERTY_OPTIMIZATION,
  AxiomaEquityOptimizationParameters.JSON_PROPERTY_OUTPUT_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AxiomaEquityOptimizationParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private OptimizerStrategy strategy;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private OptimizerAccount account;

  public static final String JSON_PROPERTY_OPTIMIZATION = "optimization";
  private Optimization optimization;

  public static final String JSON_PROPERTY_OUTPUT_TYPES = "outputTypes";
  private OptimizerOutputTypes outputTypes;

  public AxiomaEquityOptimizationParameters() { 
  }

  @JsonCreator
  public AxiomaEquityOptimizationParameters(
    @JsonProperty(value=JSON_PROPERTY_STRATEGY, required=true) OptimizerStrategy strategy, 
    @JsonProperty(value=JSON_PROPERTY_OUTPUT_TYPES, required=true) OptimizerOutputTypes outputTypes
  ) {
    this();
    this.strategy = strategy;
    this.outputTypes = outputTypes;
  }

  public AxiomaEquityOptimizationParameters strategy(OptimizerStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OptimizerStrategy getStrategy() {
    return strategy;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStrategy(OptimizerStrategy strategy) {
    this.strategy = strategy;
  }


  public AxiomaEquityOptimizationParameters account(OptimizerAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(OptimizerAccount account) {
    this.account = account;
  }


  public AxiomaEquityOptimizationParameters optimization(Optimization optimization) {
    this.optimization = optimization;
    return this;
  }

   /**
   * Get optimization
   * @return optimization
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Optimization getOptimization() {
    return optimization;
  }


  @JsonProperty(JSON_PROPERTY_OPTIMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptimization(Optimization optimization) {
    this.optimization = optimization;
  }


  public AxiomaEquityOptimizationParameters outputTypes(OptimizerOutputTypes outputTypes) {
    this.outputTypes = outputTypes;
    return this;
  }

   /**
   * Get outputTypes
   * @return outputTypes
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OUTPUT_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OptimizerOutputTypes getOutputTypes() {
    return outputTypes;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutputTypes(OptimizerOutputTypes outputTypes) {
    this.outputTypes = outputTypes;
  }


  /**
   * Return true if this AxiomaEquityOptimizationParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AxiomaEquityOptimizationParameters axiomaEquityOptimizationParameters = (AxiomaEquityOptimizationParameters) o;
    return Objects.equals(this.strategy, axiomaEquityOptimizationParameters.strategy) &&
        Objects.equals(this.account, axiomaEquityOptimizationParameters.account) &&
        Objects.equals(this.optimization, axiomaEquityOptimizationParameters.optimization) &&
        Objects.equals(this.outputTypes, axiomaEquityOptimizationParameters.outputTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, account, optimization, outputTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AxiomaEquityOptimizationParameters {\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    optimization: ").append(toIndentedString(optimization)).append("\n");
    sb.append("    outputTypes: ").append(toIndentedString(outputTypes)).append("\n");
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

