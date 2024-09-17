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
import com.factset.sdk.Cabot.models.StopLossModelAnalytics;
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
 * StopLossResponseOptions
 */
@JsonPropertyOrder({
  StopLossResponseOptions.JSON_PROPERTY_ATTRIBUTE,
  StopLossResponseOptions.JSON_PROPERTY_HIGH_STOP_LOSS_VALUES,
  StopLossResponseOptions.JSON_PROPERTY_LOW_STOP_LOSS_VALUES,
  StopLossResponseOptions.JSON_PROPERTY_STOP_LOSS_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StopLossResponseOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private JsonNullable<String> attribute = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HIGH_STOP_LOSS_VALUES = "highStopLossValues";
  private java.util.List<StopLossModelAnalytics> highStopLossValues = null;

  public static final String JSON_PROPERTY_LOW_STOP_LOSS_VALUES = "lowStopLossValues";
  private java.util.List<StopLossModelAnalytics> lowStopLossValues = null;

  public static final String JSON_PROPERTY_STOP_LOSS_VALUES = "stopLossValues";
  private java.util.List<StopLossModelAnalytics> stopLossValues = null;

  public StopLossResponseOptions() { 
  }

  public StopLossResponseOptions attribute(String attribute) {
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


  public StopLossResponseOptions highStopLossValues(java.util.List<StopLossModelAnalytics> highStopLossValues) {
    this.highStopLossValues = highStopLossValues;
    return this;
  }

  public StopLossResponseOptions addHighStopLossValuesItem(StopLossModelAnalytics highStopLossValuesItem) {
    if (this.highStopLossValues == null) {
      this.highStopLossValues = new java.util.ArrayList<>();
    }
    this.highStopLossValues.add(highStopLossValuesItem);
    return this;
  }

   /**
   * Get highStopLossValues
   * @return highStopLossValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGH_STOP_LOSS_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StopLossModelAnalytics> getHighStopLossValues() {
    return highStopLossValues;
  }


  @JsonProperty(JSON_PROPERTY_HIGH_STOP_LOSS_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighStopLossValues(java.util.List<StopLossModelAnalytics> highStopLossValues) {
    this.highStopLossValues = highStopLossValues;
  }


  public StopLossResponseOptions lowStopLossValues(java.util.List<StopLossModelAnalytics> lowStopLossValues) {
    this.lowStopLossValues = lowStopLossValues;
    return this;
  }

  public StopLossResponseOptions addLowStopLossValuesItem(StopLossModelAnalytics lowStopLossValuesItem) {
    if (this.lowStopLossValues == null) {
      this.lowStopLossValues = new java.util.ArrayList<>();
    }
    this.lowStopLossValues.add(lowStopLossValuesItem);
    return this;
  }

   /**
   * Get lowStopLossValues
   * @return lowStopLossValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOW_STOP_LOSS_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StopLossModelAnalytics> getLowStopLossValues() {
    return lowStopLossValues;
  }


  @JsonProperty(JSON_PROPERTY_LOW_STOP_LOSS_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowStopLossValues(java.util.List<StopLossModelAnalytics> lowStopLossValues) {
    this.lowStopLossValues = lowStopLossValues;
  }


  public StopLossResponseOptions stopLossValues(java.util.List<StopLossModelAnalytics> stopLossValues) {
    this.stopLossValues = stopLossValues;
    return this;
  }

  public StopLossResponseOptions addStopLossValuesItem(StopLossModelAnalytics stopLossValuesItem) {
    if (this.stopLossValues == null) {
      this.stopLossValues = new java.util.ArrayList<>();
    }
    this.stopLossValues.add(stopLossValuesItem);
    return this;
  }

   /**
   * Get stopLossValues
   * @return stopLossValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STOP_LOSS_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StopLossModelAnalytics> getStopLossValues() {
    return stopLossValues;
  }


  @JsonProperty(JSON_PROPERTY_STOP_LOSS_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStopLossValues(java.util.List<StopLossModelAnalytics> stopLossValues) {
    this.stopLossValues = stopLossValues;
  }


  /**
   * Return true if this StopLossResponseOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopLossResponseOptions stopLossResponseOptions = (StopLossResponseOptions) o;
    return equalsNullable(this.attribute, stopLossResponseOptions.attribute) &&
        Objects.equals(this.highStopLossValues, stopLossResponseOptions.highStopLossValues) &&
        Objects.equals(this.lowStopLossValues, stopLossResponseOptions.lowStopLossValues) &&
        Objects.equals(this.stopLossValues, stopLossResponseOptions.stopLossValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(attribute), highStopLossValues, lowStopLossValues, stopLossValues);
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
    sb.append("class StopLossResponseOptions {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    highStopLossValues: ").append(toIndentedString(highStopLossValues)).append("\n");
    sb.append("    lowStopLossValues: ").append(toIndentedString(lowStopLossValues)).append("\n");
    sb.append("    stopLossValues: ").append(toIndentedString(stopLossValues)).append("\n");
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

