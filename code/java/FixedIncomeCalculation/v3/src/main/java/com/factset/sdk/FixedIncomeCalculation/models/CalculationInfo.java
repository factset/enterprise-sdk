/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeCalculation.JSON;


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
  private JsonNullable<String> calculationId = JsonNullable.<String>undefined();

  public CalculationInfo() { 
  }

  public CalculationInfo calculationId(String calculationId) {
    this.calculationId = JsonNullable.<String>of(calculationId);
    return this;
  }

   /**
   * Calculation identifier
   * @return calculationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Calculation identifier")
  @JsonIgnore

  public String getCalculationId() {
        return calculationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALCULATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCalculationId_JsonNullable() {
    return calculationId;
  }
  
  @JsonProperty(JSON_PROPERTY_CALCULATION_ID)
  public void setCalculationId_JsonNullable(JsonNullable<String> calculationId) {
    this.calculationId = calculationId;
  }

  public void setCalculationId(String calculationId) {
    this.calculationId = JsonNullable.<String>of(calculationId);
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
    return equalsNullable(this.calculationId, calculationInfo.calculationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(calculationId));
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

