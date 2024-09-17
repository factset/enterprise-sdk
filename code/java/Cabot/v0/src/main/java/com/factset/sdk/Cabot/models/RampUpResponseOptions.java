/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Cabot.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Cabot.models.RampUpModelAnalytics;
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
import com.factset.sdk.Cabot.JSON;


/**
 * RampUpResponseOptions
 */
@JsonPropertyOrder({
  RampUpResponseOptions.JSON_PROPERTY_ATTRIBUTE,
  RampUpResponseOptions.JSON_PROPERTY_HIGH_RAMP_UP_VALUES,
  RampUpResponseOptions.JSON_PROPERTY_LOW_RAMP_UP_VALUES,
  RampUpResponseOptions.JSON_PROPERTY_RAMP_UP_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RampUpResponseOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private JsonNullable<String> attribute = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HIGH_RAMP_UP_VALUES = "highRampUpValues";
  private java.util.List<RampUpModelAnalytics> highRampUpValues = null;

  public static final String JSON_PROPERTY_LOW_RAMP_UP_VALUES = "lowRampUpValues";
  private java.util.List<RampUpModelAnalytics> lowRampUpValues = null;

  public static final String JSON_PROPERTY_RAMP_UP_VALUES = "rampUpValues";
  private java.util.List<RampUpModelAnalytics> rampUpValues = null;

  public RampUpResponseOptions() { 
  }

  public RampUpResponseOptions attribute(String attribute) {
    this.attribute = JsonNullable.<String>of(attribute);
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getAttribute() {
        return attribute.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAttribute_JsonNullable() {
    return attribute;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  public void setAttribute_JsonNullable(JsonNullable<String> attribute) {
    this.attribute = attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = JsonNullable.<String>of(attribute);
  }


  public RampUpResponseOptions highRampUpValues(java.util.List<RampUpModelAnalytics> highRampUpValues) {
    this.highRampUpValues = highRampUpValues;
    return this;
  }

  public RampUpResponseOptions addHighRampUpValuesItem(RampUpModelAnalytics highRampUpValuesItem) {
    if (this.highRampUpValues == null) {
      this.highRampUpValues = new java.util.ArrayList<>();
    }
    this.highRampUpValues.add(highRampUpValuesItem);
    return this;
  }

   /**
   * Get highRampUpValues
   * @return highRampUpValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGH_RAMP_UP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<RampUpModelAnalytics> getHighRampUpValues() {
    return highRampUpValues;
  }


  @JsonProperty(JSON_PROPERTY_HIGH_RAMP_UP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighRampUpValues(java.util.List<RampUpModelAnalytics> highRampUpValues) {
    this.highRampUpValues = highRampUpValues;
  }


  public RampUpResponseOptions lowRampUpValues(java.util.List<RampUpModelAnalytics> lowRampUpValues) {
    this.lowRampUpValues = lowRampUpValues;
    return this;
  }

  public RampUpResponseOptions addLowRampUpValuesItem(RampUpModelAnalytics lowRampUpValuesItem) {
    if (this.lowRampUpValues == null) {
      this.lowRampUpValues = new java.util.ArrayList<>();
    }
    this.lowRampUpValues.add(lowRampUpValuesItem);
    return this;
  }

   /**
   * Get lowRampUpValues
   * @return lowRampUpValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOW_RAMP_UP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<RampUpModelAnalytics> getLowRampUpValues() {
    return lowRampUpValues;
  }


  @JsonProperty(JSON_PROPERTY_LOW_RAMP_UP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowRampUpValues(java.util.List<RampUpModelAnalytics> lowRampUpValues) {
    this.lowRampUpValues = lowRampUpValues;
  }


  public RampUpResponseOptions rampUpValues(java.util.List<RampUpModelAnalytics> rampUpValues) {
    this.rampUpValues = rampUpValues;
    return this;
  }

  public RampUpResponseOptions addRampUpValuesItem(RampUpModelAnalytics rampUpValuesItem) {
    if (this.rampUpValues == null) {
      this.rampUpValues = new java.util.ArrayList<>();
    }
    this.rampUpValues.add(rampUpValuesItem);
    return this;
  }

   /**
   * Get rampUpValues
   * @return rampUpValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RAMP_UP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<RampUpModelAnalytics> getRampUpValues() {
    return rampUpValues;
  }


  @JsonProperty(JSON_PROPERTY_RAMP_UP_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRampUpValues(java.util.List<RampUpModelAnalytics> rampUpValues) {
    this.rampUpValues = rampUpValues;
  }


  /**
   * Return true if this RampUpResponseOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RampUpResponseOptions rampUpResponseOptions = (RampUpResponseOptions) o;
    return equalsNullable(this.attribute, rampUpResponseOptions.attribute) &&
        Objects.equals(this.highRampUpValues, rampUpResponseOptions.highRampUpValues) &&
        Objects.equals(this.lowRampUpValues, rampUpResponseOptions.lowRampUpValues) &&
        Objects.equals(this.rampUpValues, rampUpResponseOptions.rampUpValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(attribute), highRampUpValues, lowRampUpValues, rampUpValues);
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
    sb.append("class RampUpResponseOptions {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    highRampUpValues: ").append(toIndentedString(highRampUpValues)).append("\n");
    sb.append("    lowRampUpValues: ").append(toIndentedString(lowRampUpValues)).append("\n");
    sb.append("    rampUpValues: ").append(toIndentedString(rampUpValues)).append("\n");
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

