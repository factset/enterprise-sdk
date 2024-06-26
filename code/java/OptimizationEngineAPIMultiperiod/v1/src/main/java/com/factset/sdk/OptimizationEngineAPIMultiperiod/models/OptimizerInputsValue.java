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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsEValueTypeEnum;
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
 * OptimizerInputsValue
 */
@JsonPropertyOrder({
  OptimizerInputsValue.JSON_PROPERTY_VALUE_TYPE,
  OptimizerInputsValue.JSON_PROPERTY_RAW_VALUE,
  OptimizerInputsValue.JSON_PROPERTY_REF_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OptimizerInputsValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE_TYPE = "value_type";
  private OptimizerInputsEValueTypeEnum valueType;

  public static final String JSON_PROPERTY_RAW_VALUE = "raw_value";
  private Double rawValue;

  public static final String JSON_PROPERTY_REF_INDEX = "ref_index";
  private Integer refIndex;

  public OptimizerInputsValue() { 
  }

  public OptimizerInputsValue valueType(OptimizerInputsEValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsEValueTypeEnum getValueType() {
    return valueType;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueType(OptimizerInputsEValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  public OptimizerInputsValue rawValue(Double rawValue) {
    this.rawValue = rawValue;
    return this;
  }

   /**
   * Get rawValue
   * @return rawValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RAW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRawValue() {
    return rawValue;
  }


  @JsonProperty(JSON_PROPERTY_RAW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawValue(Double rawValue) {
    this.rawValue = rawValue;
  }


  public OptimizerInputsValue refIndex(Integer refIndex) {
    this.refIndex = refIndex;
    return this;
  }

   /**
   * Get refIndex
   * @return refIndex
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REF_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefIndex() {
    return refIndex;
  }


  @JsonProperty(JSON_PROPERTY_REF_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefIndex(Integer refIndex) {
    this.refIndex = refIndex;
  }


  /**
   * Return true if this optimizer.inputs.Value object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsValue optimizerInputsValue = (OptimizerInputsValue) o;
    return Objects.equals(this.valueType, optimizerInputsValue.valueType) &&
        Objects.equals(this.rawValue, optimizerInputsValue.rawValue) &&
        Objects.equals(this.refIndex, optimizerInputsValue.refIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueType, rawValue, refIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsValue {\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    rawValue: ").append(toIndentedString(rawValue)).append("\n");
    sb.append("    refIndex: ").append(toIndentedString(refIndex)).append("\n");
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

