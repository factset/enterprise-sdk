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
import com.factset.sdk.Vermilion.models.ScheduleDefinitionsListMetaPagination;
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
 * Meta data of list of Schedule Definition.
 */
@ApiModel(description = "Meta data of list of Schedule Definition.")
@JsonPropertyOrder({
  ScheduleDefinitionsListMeta.JSON_PROPERTY_PAGINATION,
  ScheduleDefinitionsListMeta.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScheduleDefinitionsListMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private ScheduleDefinitionsListMetaPagination pagination;

  public static final String JSON_PROPERTY_SORT = "sort";
  private java.util.List<String> sort = null;

  public ScheduleDefinitionsListMeta() { 
  }

  public ScheduleDefinitionsListMeta pagination(ScheduleDefinitionsListMetaPagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleDefinitionsListMetaPagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(ScheduleDefinitionsListMetaPagination pagination) {
    this.pagination = pagination;
  }


  public ScheduleDefinitionsListMeta sort(java.util.List<String> sort) {
    this.sort = sort;
    return this;
  }

  public ScheduleDefinitionsListMeta addSortItem(String sortItem) {
    if (this.sort == null) {
      this.sort = new java.util.ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * A set of fields used in sorting the Schedule Definition list.
   * @return sort
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A set of fields used in sorting the Schedule Definition list.")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(java.util.List<String> sort) {
    this.sort = sort;
  }


  /**
   * Return true if this ScheduleDefinitionsList_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleDefinitionsListMeta scheduleDefinitionsListMeta = (ScheduleDefinitionsListMeta) o;
    return Objects.equals(this.pagination, scheduleDefinitionsListMeta.pagination) &&
        Objects.equals(this.sort, scheduleDefinitionsListMeta.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDefinitionsListMeta {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

