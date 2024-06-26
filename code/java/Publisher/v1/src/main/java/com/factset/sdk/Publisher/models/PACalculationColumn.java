/*
 * Publisher API
 * Allow clients to fetch Publisher Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Publisher.models;

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
import com.factset.sdk.Publisher.JSON;


/**
 * PACalculationColumn
 */
@JsonPropertyOrder({
  PACalculationColumn.JSON_PROPERTY_ID,
  PACalculationColumn.JSON_PROPERTY_STATISTICS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PACalculationColumn implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  private java.util.List<String> statistics = null;

  public PACalculationColumn() { 
  }

  public PACalculationColumn id(String id) {
    this.id = id;
    return this;
  }

   /**
   * FactSet-defined or User-defined Column identifier.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet-defined or User-defined Column identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PACalculationColumn statistics(java.util.List<String> statistics) {
    this.statistics = statistics;
    return this;
  }

  public PACalculationColumn addStatisticsItem(String statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new java.util.ArrayList<>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Column Statistic identifier
   * @return statistics
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Column Statistic identifier")
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getStatistics() {
    return statistics;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistics(java.util.List<String> statistics) {
    this.statistics = statistics;
  }


  /**
   * Return true if this PACalculationColumn object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PACalculationColumn paCalculationColumn = (PACalculationColumn) o;
    return Objects.equals(this.id, paCalculationColumn.id) &&
        Objects.equals(this.statistics, paCalculationColumn.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PACalculationColumn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

