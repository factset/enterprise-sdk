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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsRollingMethodEnum;
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
 * OptimizerInputsAcrossPeriodsRollingPeriods
 */
@JsonPropertyOrder({
  OptimizerInputsAcrossPeriodsRollingPeriods.JSON_PROPERTY_FREQUENCY,
  OptimizerInputsAcrossPeriodsRollingPeriods.JSON_PROPERTY_METHOD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsAcrossPeriodsRollingPeriods implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Integer frequency;

  public static final String JSON_PROPERTY_METHOD = "method";
  private OptimizerInputsRollingMethodEnum method;

  public OptimizerInputsAcrossPeriodsRollingPeriods() { 
  }

  public OptimizerInputsAcrossPeriodsRollingPeriods frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }


  public OptimizerInputsAcrossPeriodsRollingPeriods method(OptimizerInputsRollingMethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsRollingMethodEnum getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(OptimizerInputsRollingMethodEnum method) {
    this.method = method;
  }


  /**
   * Return true if this optimizer.inputs.AcrossPeriods.RollingPeriods object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsAcrossPeriodsRollingPeriods optimizerInputsAcrossPeriodsRollingPeriods = (OptimizerInputsAcrossPeriodsRollingPeriods) o;
    return Objects.equals(this.frequency, optimizerInputsAcrossPeriodsRollingPeriods.frequency) &&
        Objects.equals(this.method, optimizerInputsAcrossPeriodsRollingPeriods.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsAcrossPeriodsRollingPeriods {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

