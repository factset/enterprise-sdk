/*
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.GIPS.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.GIPS.models.FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.GIPS.JSON;


/**
 * FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue
 */
@JsonPropertyOrder({
  FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue.JSON_PROPERTY_FUNCTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  private JsonNullable<java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction>> functions = JsonNullable.<java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction>>undefined();

  public FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue() { 
  }

  @JsonCreator
  public FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue(
    @JsonProperty(JSON_PROPERTY_FUNCTIONS) java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction> functions
  ) {
    this();
    this.functions = JsonNullable.<java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction>>of(functions);
  }

   /**
   * Get functions
   * @return functions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction> getFunctions() {
    
    if (functions == null) {
      functions = JsonNullable.<java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction>>of(new java.util.ArrayList<>());
    }
    return functions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction>> getFunctions_JsonNullable() {
    return functions;
  }
  
  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  private void setFunctions_JsonNullable(JsonNullable<java.util.List<FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValueTypesFunction>> functions) {
    this.functions = functions;
  }



  /**
   * Return true if this FactSet.Protobuf.Stach.V3.Table.Types.GroupResult.Types.AggregateValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue factSetProtobufStachV3TableTypesGroupResultTypesAggregateValue = (FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue) o;
    return equalsNullable(this.functions, factSetProtobufStachV3TableTypesGroupResultTypesAggregateValue.functions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(functions));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSetProtobufStachV3TableTypesGroupResultTypesAggregateValue {\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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

