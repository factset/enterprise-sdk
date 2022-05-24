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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsDerivativeFuture;
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
 * OptimizerInputsDerivative
 */
@JsonPropertyOrder({
  OptimizerInputsDerivative.JSON_PROPERTY_OFFSET_INDEX,
  OptimizerInputsDerivative.JSON_PROPERTY_FUTURE,
  OptimizerInputsDerivative.JSON_PROPERTY_FORWARD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsDerivative implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OFFSET_INDEX = "offset_index";
  private Integer offsetIndex;

  public static final String JSON_PROPERTY_FUTURE = "future";
  private OptimizerInputsDerivativeFuture future;

  public static final String JSON_PROPERTY_FORWARD = "forward";
  private Boolean forward;

  public OptimizerInputsDerivative() { 
  }

  public OptimizerInputsDerivative offsetIndex(Integer offsetIndex) {
    this.offsetIndex = offsetIndex;
    return this;
  }

   /**
   * Index of the offset. E.g. CASH_USD_FUT for Futures or 2nd leg for Forwards. -1 if no offset generated
   * @return offsetIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of the offset. E.g. CASH_USD_FUT for Futures or 2nd leg for Forwards. -1 if no offset generated")
  @JsonProperty(JSON_PROPERTY_OFFSET_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffsetIndex() {
    return offsetIndex;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffsetIndex(Integer offsetIndex) {
    this.offsetIndex = offsetIndex;
  }


  public OptimizerInputsDerivative future(OptimizerInputsDerivativeFuture future) {
    this.future = future;
    return this;
  }

   /**
   * Get future
   * @return future
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsDerivativeFuture getFuture() {
    return future;
  }


  @JsonProperty(JSON_PROPERTY_FUTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFuture(OptimizerInputsDerivativeFuture future) {
    this.future = future;
  }


  public OptimizerInputsDerivative forward(Boolean forward) {
    this.forward = forward;
    return this;
  }

   /**
   * Nothing else is needed for forwards.
   * @return forward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nothing else is needed for forwards.")
  @JsonProperty(JSON_PROPERTY_FORWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForward() {
    return forward;
  }


  @JsonProperty(JSON_PROPERTY_FORWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForward(Boolean forward) {
    this.forward = forward;
  }


  /**
   * Return true if this optimizer.inputs.Derivative object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsDerivative optimizerInputsDerivative = (OptimizerInputsDerivative) o;
    return Objects.equals(this.offsetIndex, optimizerInputsDerivative.offsetIndex) &&
        Objects.equals(this.future, optimizerInputsDerivative.future) &&
        Objects.equals(this.forward, optimizerInputsDerivative.forward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetIndex, future, forward);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsDerivative {\n");
    sb.append("    offsetIndex: ").append(toIndentedString(offsetIndex)).append("\n");
    sb.append("    future: ").append(toIndentedString(future)).append("\n");
    sb.append("    forward: ").append(toIndentedString(forward)).append("\n");
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
