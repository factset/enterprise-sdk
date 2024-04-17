/*
 * AFI Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
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
import com.factset.sdk.AxiomaFixedIncomeOptimizer.models.CalculationInfo;
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
 * CalculationInfoRoot
 */
@JsonPropertyOrder({
  CalculationInfoRoot.JSON_PROPERTY_DATA,
  CalculationInfoRoot.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalculationInfoRoot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private CalculationInfo data;

  public static final String JSON_PROPERTY_META = "meta";
  private Object meta;

  public CalculationInfoRoot() { 
  }

  @JsonCreator
  public CalculationInfoRoot(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) CalculationInfo data
  ) {
    this();
    this.data = data;
  }

  public CalculationInfoRoot data(CalculationInfo data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CalculationInfo getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(CalculationInfo data) {
    this.data = data;
  }


  public CalculationInfoRoot meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(Object meta) {
    this.meta = meta;
  }


  /**
   * Return true if this CalculationInfoRoot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationInfoRoot calculationInfoRoot = (CalculationInfoRoot) o;
    return Objects.equals(this.data, calculationInfoRoot.data) &&
        Objects.equals(this.meta, calculationInfoRoot.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationInfoRoot {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

