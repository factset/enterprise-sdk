/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataRecommendationCountsTotal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Number of recommendations.
 */
@ApiModel(description = "Number of recommendations.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataRecommendationCounts.JSON_PROPERTY_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataRecommendationCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private StockNotationScreenerSearchDataRecommendationCountsTotal total;

  public StockNotationScreenerSearchDataRecommendationCounts() { 
  }

  public StockNotationScreenerSearchDataRecommendationCounts total(StockNotationScreenerSearchDataRecommendationCountsTotal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataRecommendationCountsTotal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(StockNotationScreenerSearchDataRecommendationCountsTotal total) {
    this.total = total;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_recommendation_counts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataRecommendationCounts stockNotationScreenerSearchDataRecommendationCounts = (StockNotationScreenerSearchDataRecommendationCounts) o;
    return Objects.equals(this.total, stockNotationScreenerSearchDataRecommendationCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataRecommendationCounts {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

