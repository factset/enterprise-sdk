/*
 * FactSet Fundamentals Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentalsReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.MetricFundamentalsMetricFundamentals;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFundamentalsReportBuilder.JSON;


/**
 * MetricFundamentals
 */
@JsonPropertyOrder({
  MetricFundamentals.JSON_PROPERTY_METRIC_FUNDAMENTALS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetricFundamentals implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_METRIC_FUNDAMENTALS = "metricFundamentals";
  private MetricFundamentalsMetricFundamentals metricFundamentals;

  public MetricFundamentals() { 
  }

  public MetricFundamentals metricFundamentals(MetricFundamentalsMetricFundamentals metricFundamentals) {
    this.metricFundamentals = metricFundamentals;
    return this;
  }

   /**
   * Get metricFundamentals
   * @return metricFundamentals
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRIC_FUNDAMENTALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricFundamentalsMetricFundamentals getMetricFundamentals() {
    return metricFundamentals;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_FUNDAMENTALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricFundamentals(MetricFundamentalsMetricFundamentals metricFundamentals) {
    this.metricFundamentals = metricFundamentals;
  }


  /**
   * Return true if this metricFundamentals object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricFundamentals metricFundamentals = (MetricFundamentals) o;
    return Objects.equals(this.metricFundamentals, metricFundamentals.metricFundamentals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricFundamentals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricFundamentals {\n");
    sb.append("    metricFundamentals: ").append(toIndentedString(metricFundamentals)).append("\n");
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

