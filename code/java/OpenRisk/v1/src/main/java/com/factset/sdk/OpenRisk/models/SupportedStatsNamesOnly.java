/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * SupportedStatsNamesOnly
 */
@JsonPropertyOrder({
  SupportedStatsNamesOnly.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SupportedStatsNamesOnly implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<String> data = new java.util.ArrayList<>();

  public SupportedStatsNamesOnly() { 
  }

  @JsonCreator
  public SupportedStatsNamesOnly(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.List<String> data
  ) {
    this();
    this.data = data;
  }

  public SupportedStatsNamesOnly data(java.util.List<String> data) {
    this.data = data;
    return this;
  }

  public SupportedStatsNamesOnly addDataItem(String dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Contains the names of all available risk statistics. In the event &#39;data&#39; field is empty, no stats are available at all.
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Contains the names of all available risk statistics. In the event 'data' field is empty, no stats are available at all.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.List<String> data) {
    this.data = data;
  }


  /**
   * Return true if this SupportedStatsNamesOnly object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedStatsNamesOnly supportedStatsNamesOnly = (SupportedStatsNamesOnly) o;
    return Objects.equals(this.data, supportedStatsNamesOnly.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedStatsNamesOnly {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

