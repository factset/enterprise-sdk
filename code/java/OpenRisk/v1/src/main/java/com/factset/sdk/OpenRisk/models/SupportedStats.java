/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.21.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
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
import com.factset.sdk.OpenRisk.models.SupportedStatsData;
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
 * SupportedStats
 */
@JsonPropertyOrder({
  SupportedStats.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SupportedStats implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.Map<String, SupportedStatsData> data = new java.util.HashMap<>();

  public SupportedStats() { 
  }

  @JsonCreator
  public SupportedStats(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.Map<String, SupportedStatsData> data
  ) {
    this();
    this.data = data;
  }

  public SupportedStats data(java.util.Map<String, SupportedStatsData> data) {
    this.data = data;
    return this;
  }

  public SupportedStats putDataItem(String key, SupportedStatsData dataItem) {
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Contains all available risk statistics. In the event &#39;data&#39; property is empty, no stats are available at all.
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Contains all available risk statistics. In the event 'data' property is empty, no stats are available at all.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.Map<String, SupportedStatsData> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.Map<String, SupportedStatsData> data) {
    this.data = data;
  }


  /**
   * Return true if this SupportedStats object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedStats supportedStats = (SupportedStats) o;
    return Objects.equals(this.data, supportedStats.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedStats {\n");
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
