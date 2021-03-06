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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataPerformanceEndOfDay;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataPerformanceIntraday;
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
 * Relative performance for different time ranges.
 */
@ApiModel(description = "Relative performance for different time ranges.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataPerformance.JSON_PROPERTY_INTRADAY,
  StockNotationScreenerSearchDataPerformance.JSON_PROPERTY_END_OF_DAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataPerformance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INTRADAY = "intraday";
  private StockNotationScreenerSearchDataPerformanceIntraday intraday;

  public static final String JSON_PROPERTY_END_OF_DAY = "endOfDay";
  private StockNotationScreenerSearchDataPerformanceEndOfDay endOfDay;

  public StockNotationScreenerSearchDataPerformance() { 
  }

  public StockNotationScreenerSearchDataPerformance intraday(StockNotationScreenerSearchDataPerformanceIntraday intraday) {
    this.intraday = intraday;
    return this;
  }

   /**
   * Get intraday
   * @return intraday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataPerformanceIntraday getIntraday() {
    return intraday;
  }


  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntraday(StockNotationScreenerSearchDataPerformanceIntraday intraday) {
    this.intraday = intraday;
  }


  public StockNotationScreenerSearchDataPerformance endOfDay(StockNotationScreenerSearchDataPerformanceEndOfDay endOfDay) {
    this.endOfDay = endOfDay;
    return this;
  }

   /**
   * Get endOfDay
   * @return endOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataPerformanceEndOfDay getEndOfDay() {
    return endOfDay;
  }


  @JsonProperty(JSON_PROPERTY_END_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndOfDay(StockNotationScreenerSearchDataPerformanceEndOfDay endOfDay) {
    this.endOfDay = endOfDay;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_performance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataPerformance stockNotationScreenerSearchDataPerformance = (StockNotationScreenerSearchDataPerformance) o;
    return Objects.equals(this.intraday, stockNotationScreenerSearchDataPerformance.intraday) &&
        Objects.equals(this.endOfDay, stockNotationScreenerSearchDataPerformance.endOfDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intraday, endOfDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataPerformance {\n");
    sb.append("    intraday: ").append(toIndentedString(intraday)).append("\n");
    sb.append("    endOfDay: ").append(toIndentedString(endOfDay)).append("\n");
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

