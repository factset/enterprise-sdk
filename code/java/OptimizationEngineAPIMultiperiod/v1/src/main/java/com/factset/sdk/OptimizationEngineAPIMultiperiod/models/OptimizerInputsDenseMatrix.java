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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.GoogleProtobufListValue;
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
 * Represents a dense matrix
 */
@ApiModel(description = "Represents a dense matrix")
@JsonPropertyOrder({
  OptimizerInputsDenseMatrix.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsDenseMatrix implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private java.util.List<GoogleProtobufListValue> value = null;

  public OptimizerInputsDenseMatrix() { 
  }

  public OptimizerInputsDenseMatrix value(java.util.List<GoogleProtobufListValue> value) {
    this.value = value;
    return this;
  }

  public OptimizerInputsDenseMatrix addValueItem(GoogleProtobufListValue valueItem) {
    if (this.value == null) {
      this.value = new java.util.ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * 2D array of doubles
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "2D array of doubles")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<GoogleProtobufListValue> getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(java.util.List<GoogleProtobufListValue> value) {
    this.value = value;
  }


  /**
   * Return true if this optimizer.inputs.DenseMatrix object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsDenseMatrix optimizerInputsDenseMatrix = (OptimizerInputsDenseMatrix) o;
    return Objects.equals(this.value, optimizerInputsDenseMatrix.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsDenseMatrix {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
