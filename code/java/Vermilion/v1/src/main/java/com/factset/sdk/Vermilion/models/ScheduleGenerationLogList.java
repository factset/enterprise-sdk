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
import com.factset.sdk.Vermilion.models.DataSourceListMeta;
import com.factset.sdk.Vermilion.models.ScheduleGenerationLog;
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
 * ScheduleGenerationLogList
 */
@JsonPropertyOrder({
  ScheduleGenerationLogList.JSON_PROPERTY_META,
  ScheduleGenerationLogList.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScheduleGenerationLogList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_META = "meta";
  private DataSourceListMeta meta;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<ScheduleGenerationLog> data = null;

  public ScheduleGenerationLogList() { 
  }

  public ScheduleGenerationLogList meta(DataSourceListMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataSourceListMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(DataSourceListMeta meta) {
    this.meta = meta;
  }


  public ScheduleGenerationLogList data(java.util.List<ScheduleGenerationLog> data) {
    this.data = data;
    return this;
  }

  public ScheduleGenerationLogList addDataItem(ScheduleGenerationLog dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ScheduleGenerationLog> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<ScheduleGenerationLog> data) {
    this.data = data;
  }


  /**
   * Return true if this ScheduleGenerationLogList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleGenerationLogList scheduleGenerationLogList = (ScheduleGenerationLogList) o;
    return Objects.equals(this.meta, scheduleGenerationLogList.meta) &&
        Objects.equals(this.data, scheduleGenerationLogList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGenerationLogList {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

