/*
 * AFI Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.AxiomaFixedIncomeOptimizer.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.AxiomaFixedIncomeOptimizer.JSON;


/**
 * AFIOptimizerStrategyOverrides
 */
@JsonPropertyOrder({
  AFIOptimizerStrategyOverrides.JSON_PROPERTY_OBJECTIVE,
  AFIOptimizerStrategyOverrides.JSON_PROPERTY_TAX,
  AFIOptimizerStrategyOverrides.JSON_PROPERTY_CONSTRAINTS,
  AFIOptimizerStrategyOverrides.JSON_PROPERTY_ALPHA,
  AFIOptimizerStrategyOverrides.JSON_PROPERTY_TRANSACTION_COST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AFIOptimizerStrategyOverrides implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OBJECTIVE = "objective";
  private String objective;

  public static final String JSON_PROPERTY_TAX = "tax";
  private String tax;

  /**
   * Gets or Sets inner
   */
  public enum InnerEnum {
    DISABLE("Disable"),
    
    ENABLE("Enable");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InnerEnum fromValue(String value) {
      for (InnerEnum b : InnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private java.util.Map<String, InnerEnum> constraints = null;

  public static final String JSON_PROPERTY_ALPHA = "alpha";
  private String alpha;

  public static final String JSON_PROPERTY_TRANSACTION_COST = "transactionCost";
  private String transactionCost;

  public AFIOptimizerStrategyOverrides() { 
  }

  public AFIOptimizerStrategyOverrides objective(String objective) {
    this.objective = objective;
    return this;
  }

   /**
   * Objective
   * @return objective
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Objective")
  @JsonProperty(JSON_PROPERTY_OBJECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjective() {
    return objective;
  }


  @JsonProperty(JSON_PROPERTY_OBJECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjective(String objective) {
    this.objective = objective;
  }


  public AFIOptimizerStrategyOverrides tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax
   * @return tax
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Tax")
  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTax() {
    return tax;
  }


  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTax(String tax) {
    this.tax = tax;
  }


  public AFIOptimizerStrategyOverrides constraints(java.util.Map<String, InnerEnum> constraints) {
    this.constraints = constraints;
    return this;
  }

  public AFIOptimizerStrategyOverrides putConstraintsItem(String key, InnerEnum constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new java.util.HashMap<>();
    }
    this.constraints.put(key, constraintsItem);
    return this;
  }

   /**
   * List of constraints
   * @return constraints
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of constraints")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, InnerEnum> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(java.util.Map<String, InnerEnum> constraints) {
    this.constraints = constraints;
  }


  public AFIOptimizerStrategyOverrides alpha(String alpha) {
    this.alpha = alpha;
    return this;
  }

   /**
   * Alpha
   * @return alpha
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Alpha")
  @JsonProperty(JSON_PROPERTY_ALPHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlpha() {
    return alpha;
  }


  @JsonProperty(JSON_PROPERTY_ALPHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlpha(String alpha) {
    this.alpha = alpha;
  }


  public AFIOptimizerStrategyOverrides transactionCost(String transactionCost) {
    this.transactionCost = transactionCost;
    return this;
  }

   /**
   * Transaction cost
   * @return transactionCost
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Transaction cost")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionCost() {
    return transactionCost;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionCost(String transactionCost) {
    this.transactionCost = transactionCost;
  }


  /**
   * Return true if this AFIOptimizerStrategyOverrides object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AFIOptimizerStrategyOverrides afIOptimizerStrategyOverrides = (AFIOptimizerStrategyOverrides) o;
    return Objects.equals(this.objective, afIOptimizerStrategyOverrides.objective) &&
        Objects.equals(this.tax, afIOptimizerStrategyOverrides.tax) &&
        Objects.equals(this.constraints, afIOptimizerStrategyOverrides.constraints) &&
        Objects.equals(this.alpha, afIOptimizerStrategyOverrides.alpha) &&
        Objects.equals(this.transactionCost, afIOptimizerStrategyOverrides.transactionCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objective, tax, constraints, alpha, transactionCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AFIOptimizerStrategyOverrides {\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
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

