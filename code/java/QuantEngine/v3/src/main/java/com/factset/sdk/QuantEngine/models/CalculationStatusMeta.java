/*
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuantEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuantEngine.models.CalculationUnitStatusMeta;
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
import com.factset.sdk.QuantEngine.JSON;


/**
 * CalculationStatusMeta
 */
@JsonPropertyOrder({
  CalculationStatusMeta.JSON_PROPERTY_UNITS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalculationStatusMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNITS = "units";
  private JsonNullable<java.util.Map<String, CalculationUnitStatusMeta>> units = JsonNullable.<java.util.Map<String, CalculationUnitStatusMeta>>undefined();

  public CalculationStatusMeta() { 
  }

  public CalculationStatusMeta units(java.util.Map<String, CalculationUnitStatusMeta> units) {
    this.units = JsonNullable.<java.util.Map<String, CalculationUnitStatusMeta>>of(units);
    return this;
  }

  public CalculationStatusMeta putUnitsItem(String key, CalculationUnitStatusMeta unitsItem) {
    if (this.units == null || !this.units.isPresent()) {
      this.units = JsonNullable.<java.util.Map<String, CalculationUnitStatusMeta>>of(new java.util.HashMap<>());
    }
    try {
      this.units.get().put(key, unitsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Meta of calculation units in batch.
   * @return units
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Meta of calculation units in batch.")
  @JsonIgnore

  public java.util.Map<String, CalculationUnitStatusMeta> getUnits() {
        return units.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.Map<String, CalculationUnitStatusMeta>> getUnits_JsonNullable() {
    return units;
  }
  
  @JsonProperty(JSON_PROPERTY_UNITS)
  public void setUnits_JsonNullable(JsonNullable<java.util.Map<String, CalculationUnitStatusMeta>> units) {
    this.units = units;
  }

  public void setUnits(java.util.Map<String, CalculationUnitStatusMeta> units) {
    this.units = JsonNullable.<java.util.Map<String, CalculationUnitStatusMeta>>of(units);
  }


  /**
   * Return true if this CalculationStatusMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationStatusMeta calculationStatusMeta = (CalculationStatusMeta) o;
    return equalsNullable(this.units, calculationStatusMeta.units);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(units));
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
    sb.append("class CalculationStatusMeta {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

