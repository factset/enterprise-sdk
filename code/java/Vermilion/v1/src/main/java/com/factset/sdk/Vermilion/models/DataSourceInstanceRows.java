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
import com.factset.sdk.Vermilion.models.RecordSetFieldValues;
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
 * DataSourceInstanceRows
 */
@JsonPropertyOrder({
  DataSourceInstanceRows.JSON_PROPERTY_ROW_ID,
  DataSourceInstanceRows.JSON_PROPERTY_ORDER,
  DataSourceInstanceRows.JSON_PROPERTY_FIELDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DataSourceInstanceRows implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ROW_ID = "rowId";
  private Integer rowId;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private java.util.List<RecordSetFieldValues> fields = null;

  public DataSourceInstanceRows() { 
  }

  public DataSourceInstanceRows rowId(Integer rowId) {
    this.rowId = rowId;
    return this;
  }

   /**
   * Get rowId
   * @return rowId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRowId() {
    return rowId;
  }


  @JsonProperty(JSON_PROPERTY_ROW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRowId(Integer rowId) {
    this.rowId = rowId;
  }


  public DataSourceInstanceRows order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public DataSourceInstanceRows fields(java.util.List<RecordSetFieldValues> fields) {
    this.fields = fields;
    return this;
  }

  public DataSourceInstanceRows addFieldsItem(RecordSetFieldValues fieldsItem) {
    if (this.fields == null) {
      this.fields = new java.util.ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<RecordSetFieldValues> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(java.util.List<RecordSetFieldValues> fields) {
    this.fields = fields;
  }


  /**
   * Return true if this DataSourceInstanceRows object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceInstanceRows dataSourceInstanceRows = (DataSourceInstanceRows) o;
    return Objects.equals(this.rowId, dataSourceInstanceRows.rowId) &&
        Objects.equals(this.order, dataSourceInstanceRows.order) &&
        Objects.equals(this.fields, dataSourceInstanceRows.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowId, order, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceInstanceRows {\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

