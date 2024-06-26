/*
 * Engines API
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPortfolioOptimizer.models;

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
import com.factset.sdk.FactSetPortfolioOptimizer.JSON;


/**
 * Optimization
 */
@JsonPropertyOrder({
  Optimization.JSON_PROPERTY_RISKMODELDATE,
  Optimization.JSON_PROPERTY_BACKTESTDATE,
  Optimization.JSON_PROPERTY_CASHFLOW
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Optimization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RISKMODELDATE = "riskmodeldate";
  private String riskmodeldate;

  public static final String JSON_PROPERTY_BACKTESTDATE = "backtestdate";
  private String backtestdate;

  public static final String JSON_PROPERTY_CASHFLOW = "cashflow";
  private String cashflow;

  public Optimization() { 
  }

  public Optimization riskmodeldate(String riskmodeldate) {
    this.riskmodeldate = riskmodeldate;
    return this;
  }

   /**
   * Risk model date
   * @return riskmodeldate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Risk model date")
  @JsonProperty(JSON_PROPERTY_RISKMODELDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskmodeldate() {
    return riskmodeldate;
  }


  @JsonProperty(JSON_PROPERTY_RISKMODELDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskmodeldate(String riskmodeldate) {
    this.riskmodeldate = riskmodeldate;
  }


  public Optimization backtestdate(String backtestdate) {
    this.backtestdate = backtestdate;
    return this;
  }

   /**
   * Backtest date
   * @return backtestdate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Backtest date")
  @JsonProperty(JSON_PROPERTY_BACKTESTDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBacktestdate() {
    return backtestdate;
  }


  @JsonProperty(JSON_PROPERTY_BACKTESTDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBacktestdate(String backtestdate) {
    this.backtestdate = backtestdate;
  }


  public Optimization cashflow(String cashflow) {
    this.cashflow = cashflow;
    return this;
  }

   /**
   * Cash flow
   * @return cashflow
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Cash flow")
  @JsonProperty(JSON_PROPERTY_CASHFLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCashflow() {
    return cashflow;
  }


  @JsonProperty(JSON_PROPERTY_CASHFLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashflow(String cashflow) {
    this.cashflow = cashflow;
  }


  /**
   * Return true if this Optimization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Optimization optimization = (Optimization) o;
    return Objects.equals(this.riskmodeldate, optimization.riskmodeldate) &&
        Objects.equals(this.backtestdate, optimization.backtestdate) &&
        Objects.equals(this.cashflow, optimization.cashflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskmodeldate, backtestdate, cashflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Optimization {\n");
    sb.append("    riskmodeldate: ").append(toIndentedString(riskmodeldate)).append("\n");
    sb.append("    backtestdate: ").append(toIndentedString(backtestdate)).append("\n");
    sb.append("    cashflow: ").append(toIndentedString(cashflow)).append("\n");
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

