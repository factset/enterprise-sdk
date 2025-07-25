/*
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Vermilion.models;

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
import com.factset.sdk.Vermilion.JSON;


/**
 * Pagination information for the list of Schedule Definition.
 */
@ApiModel(description = "Pagination information for the list of Schedule Definition.")
@JsonPropertyOrder({
  ScheduleDefinitionsListMetaPagination.JSON_PROPERTY_TOTAL,
  ScheduleDefinitionsListMetaPagination.JSON_PROPERTY_IS_ESTIMATED_TOTAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScheduleDefinitionsListMetaPagination implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_IS_ESTIMATED_TOTAL = "isEstimatedTotal";
  private Boolean isEstimatedTotal;

  public ScheduleDefinitionsListMetaPagination() { 
  }

  public ScheduleDefinitionsListMetaPagination total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of Schedule Definitions available in the response.
   * @return total
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The total number of Schedule Definitions available in the response.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public ScheduleDefinitionsListMetaPagination isEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
    return this;
  }

   /**
   * A flag that specifies if the total number of records returned is an estimate (true) or an exact count (false).
   * @return isEstimatedTotal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A flag that specifies if the total number of records returned is an estimate (true) or an exact count (false).")
  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEstimatedTotal() {
    return isEstimatedTotal;
  }


  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
  }


  /**
   * Return true if this ScheduleDefinitionsList_meta_pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleDefinitionsListMetaPagination scheduleDefinitionsListMetaPagination = (ScheduleDefinitionsListMetaPagination) o;
    return Objects.equals(this.total, scheduleDefinitionsListMetaPagination.total) &&
        Objects.equals(this.isEstimatedTotal, scheduleDefinitionsListMetaPagination.isEstimatedTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, isEstimatedTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDefinitionsListMetaPagination {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isEstimatedTotal: ").append(toIndentedString(isEstimatedTotal)).append("\n");
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

