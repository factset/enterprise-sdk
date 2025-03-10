/*
 * Chart Generation Service
 * This is a service for generating charts in a node environment that were created using web charting and get back images in form of `PNGs` and `JPEGs` as response.
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ChartGenerationService.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ChartGenerationService.models.ChartList;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ChartGenerationService.JSON;


/**
 * CategoryChartListErrorObject
 */
@JsonPropertyOrder({
  CategoryChartListErrorObject.JSON_PROPERTY_CATEGORY,
  CategoryChartListErrorObject.JSON_PROPERTY_CHART_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CategoryChartListErrorObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CHART_LIST = "chartList";
  private java.util.List<ChartList> chartList = null;

  public CategoryChartListErrorObject() { 
  }

  public CategoryChartListErrorObject category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Name of the category. This is required when building the request for the chart image.
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "equity", value = "Name of the category. This is required when building the request for the chart image.")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(String category) {
    this.category = category;
  }


  public CategoryChartListErrorObject chartList(java.util.List<ChartList> chartList) {
    this.chartList = chartList;
    return this;
  }

  public CategoryChartListErrorObject addChartListItem(ChartList chartListItem) {
    if (this.chartList == null) {
      this.chartList = new java.util.ArrayList<>();
    }
    this.chartList.add(chartListItem);
    return this;
  }

   /**
   * Get chartList
   * @return chartList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHART_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ChartList> getChartList() {
    return chartList;
  }


  @JsonProperty(JSON_PROPERTY_CHART_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChartList(java.util.List<ChartList> chartList) {
    this.chartList = chartList;
  }


  /**
   * Return true if this CategoryChartListErrorObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryChartListErrorObject categoryChartListErrorObject = (CategoryChartListErrorObject) o;
    return Objects.equals(this.category, categoryChartListErrorObject.category) &&
        Objects.equals(this.chartList, categoryChartListErrorObject.chartList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, chartList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryChartListErrorObject {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    chartList: ").append(toIndentedString(chartList)).append("\n");
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

