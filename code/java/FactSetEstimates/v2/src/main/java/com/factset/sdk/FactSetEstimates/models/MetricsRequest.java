/*
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEstimates.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetEstimates.models.Category;
import com.factset.sdk.FactSetEstimates.models.Subcategory;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * Metrics Request Body
 */
@ApiModel(description = "Metrics Request Body")
@JsonPropertyOrder({
  MetricsRequest.JSON_PROPERTY_CATEGORY,
  MetricsRequest.JSON_PROPERTY_SUBCATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MetricsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private Category category;

  public static final String JSON_PROPERTY_SUBCATEGORY = "subcategory";
  private Subcategory subcategory;

  public MetricsRequest() { 
  }

  public MetricsRequest category(Category category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Category getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(Category category) {
    this.category = category;
  }


  public MetricsRequest subcategory(Subcategory subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Get subcategory
   * @return subcategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBCATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Subcategory getSubcategory() {
    return subcategory;
  }


  @JsonProperty(JSON_PROPERTY_SUBCATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubcategory(Subcategory subcategory) {
    this.subcategory = subcategory;
  }


  /**
   * Return true if this metricsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsRequest metricsRequest = (MetricsRequest) o;
    return Objects.equals(this.category, metricsRequest.category) &&
        Objects.equals(this.subcategory, metricsRequest.subcategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, subcategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsRequest {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
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

