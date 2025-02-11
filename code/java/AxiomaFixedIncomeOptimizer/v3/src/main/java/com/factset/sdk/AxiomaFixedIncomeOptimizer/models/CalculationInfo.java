/*
 * AFI Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
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
 * CalculationInfo
 */
@JsonPropertyOrder({
  CalculationInfo.JSON_PROPERTY_CALCULATION_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalculationInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CALCULATION_ID = "calculationId";
  private String calculationId;

  public CalculationInfo() { 
  }

  public CalculationInfo calculationId(String calculationId) {
    this.calculationId = calculationId;
    return this;
  }

   /**
   * Calculation identifier
   * @return calculationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Calculation identifier")
  @JsonProperty(JSON_PROPERTY_CALCULATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCalculationId() {
    return calculationId;
  }


  @JsonProperty(JSON_PROPERTY_CALCULATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalculationId(String calculationId) {
    this.calculationId = calculationId;
  }


  /**
   * Return true if this CalculationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationInfo calculationInfo = (CalculationInfo) o;
    return Objects.equals(this.calculationId, calculationInfo.calculationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationInfo {\n");
    sb.append("    calculationId: ").append(toIndentedString(calculationId)).append("\n");
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

