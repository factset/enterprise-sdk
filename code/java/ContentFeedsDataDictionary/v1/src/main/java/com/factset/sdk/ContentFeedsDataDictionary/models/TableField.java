/*
 * CTS Data Dictionary API
 * An API for interacting with CTS Data Dictionary.
 *
 * The version of the OpenAPI document: 0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ContentFeedsDataDictionary.models;

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
import com.factset.sdk.ContentFeedsDataDictionary.JSON;


/**
 * TableField
 */
@JsonPropertyOrder({
  TableField.JSON_PROPERTY_ID,
  TableField.JSON_PROPERTY_DATA_ITEM_ID,
  TableField.JSON_PROPERTY_NAME,
  TableField.JSON_PROPERTY_DATA_TYPE,
  TableField.JSON_PROPERTY_POSITION,
  TableField.JSON_PROPERTY_IS_PRIMARY_KEY,
  TableField.JSON_PROPERTY_NULLABLE,
  TableField.JSON_PROPERTY_HAS_CODE_DEPENDENCY,
  TableField.JSON_PROPERTY_MONETARY,
  TableField.JSON_PROPERTY_SPLIT_AFFECTED,
  TableField.JSON_PROPERTY_UNIT_FACTOR,
  TableField.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TableField implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DATA_ITEM_ID = "dataItemId";
  private String dataItemId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  private String dataType;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Integer position;

  public static final String JSON_PROPERTY_IS_PRIMARY_KEY = "isPrimaryKey";
  private Boolean isPrimaryKey;

  public static final String JSON_PROPERTY_NULLABLE = "nullable";
  private Boolean nullable;

  public static final String JSON_PROPERTY_HAS_CODE_DEPENDENCY = "hasCodeDependency";
  private Boolean hasCodeDependency;

  public static final String JSON_PROPERTY_MONETARY = "monetary";
  private Boolean monetary;

  public static final String JSON_PROPERTY_SPLIT_AFFECTED = "splitAffected";
  private Boolean splitAffected;

  public static final String JSON_PROPERTY_UNIT_FACTOR = "unitFactor";
  private String unitFactor;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public TableField() { 
  }

  public TableField id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for a combination of table and data field
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1335", value = "Unique identifier for a combination of table and data field")
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


  public TableField dataItemId(String dataItemId) {
    this.dataItemId = dataItemId;
    return this;
  }

   /**
   * Unique identifier for the data item
   * @return dataItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1778", value = "Unique identifier for the data item")
  @JsonProperty(JSON_PROPERTY_DATA_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataItemId() {
    return dataItemId;
  }


  @JsonProperty(JSON_PROPERTY_DATA_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataItemId(String dataItemId) {
    this.dataItemId = dataItemId;
  }


  public TableField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the data field
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fsym_id", value = "Name of the data field")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TableField dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Data type of the data field
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHAR(8)", value = "Data type of the data field")
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public TableField position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Column position of the data field within the table
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Column position of the data field within the table")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(Integer position) {
    this.position = position;
  }


  public TableField isPrimaryKey(Boolean isPrimaryKey) {
    this.isPrimaryKey = isPrimaryKey;
    return this;
  }

   /**
   * Flag indicating if the data field is a primary key.
   * @return isPrimaryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Flag indicating if the data field is a primary key.")
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrimaryKey() {
    return isPrimaryKey;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIMARY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrimaryKey(Boolean isPrimaryKey) {
    this.isPrimaryKey = isPrimaryKey;
  }


  public TableField nullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

   /**
   * Flag indicating if a data field is nullable
   * @return nullable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Flag indicating if a data field is nullable")
  @JsonProperty(JSON_PROPERTY_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNullable() {
    return nullable;
  }


  @JsonProperty(JSON_PROPERTY_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }


  public TableField hasCodeDependency(Boolean hasCodeDependency) {
    this.hasCodeDependency = hasCodeDependency;
    return this;
  }

   /**
   * Flag indicating if the field&#39;s value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code.
   * @return hasCodeDependency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Flag indicating if the field's value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code.")
  @JsonProperty(JSON_PROPERTY_HAS_CODE_DEPENDENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasCodeDependency() {
    return hasCodeDependency;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CODE_DEPENDENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasCodeDependency(Boolean hasCodeDependency) {
    this.hasCodeDependency = hasCodeDependency;
  }


  public TableField monetary(Boolean monetary) {
    this.monetary = monetary;
    return this;
  }

   /**
   * Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies
   * @return monetary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies")
  @JsonProperty(JSON_PROPERTY_MONETARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMonetary() {
    return monetary;
  }


  @JsonProperty(JSON_PROPERTY_MONETARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonetary(Boolean monetary) {
    this.monetary = monetary;
  }


  public TableField splitAffected(Boolean splitAffected) {
    this.splitAffected = splitAffected;
    return this;
  }

   /**
   * Flag indicating if the data field contained in this TableField can be affected by splits
   * @return splitAffected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Flag indicating if the data field contained in this TableField can be affected by splits")
  @JsonProperty(JSON_PROPERTY_SPLIT_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSplitAffected() {
    return splitAffected;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitAffected(Boolean splitAffected) {
    this.splitAffected = splitAffected;
  }


  public TableField unitFactor(String unitFactor) {
    this.unitFactor = unitFactor;
    return this;
  }

   /**
   * Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value
   * @return unitFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "None", value = "Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value")
  @JsonProperty(JSON_PROPERTY_UNIT_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnitFactor() {
    return unitFactor;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitFactor(String unitFactor) {
    this.unitFactor = unitFactor;
  }


  public TableField description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the data field within the context of its table
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FactSet Security-Level Permanent Identifier", value = "A description of the data field within the context of its table")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this TableField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableField tableField = (TableField) o;
    return Objects.equals(this.id, tableField.id) &&
        Objects.equals(this.dataItemId, tableField.dataItemId) &&
        Objects.equals(this.name, tableField.name) &&
        Objects.equals(this.dataType, tableField.dataType) &&
        Objects.equals(this.position, tableField.position) &&
        Objects.equals(this.isPrimaryKey, tableField.isPrimaryKey) &&
        Objects.equals(this.nullable, tableField.nullable) &&
        Objects.equals(this.hasCodeDependency, tableField.hasCodeDependency) &&
        Objects.equals(this.monetary, tableField.monetary) &&
        Objects.equals(this.splitAffected, tableField.splitAffected) &&
        Objects.equals(this.unitFactor, tableField.unitFactor) &&
        Objects.equals(this.description, tableField.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataItemId, name, dataType, position, isPrimaryKey, nullable, hasCodeDependency, monetary, splitAffected, unitFactor, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataItemId: ").append(toIndentedString(dataItemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    hasCodeDependency: ").append(toIndentedString(hasCodeDependency)).append("\n");
    sb.append("    monetary: ").append(toIndentedString(monetary)).append("\n");
    sb.append("    splitAffected: ").append(toIndentedString(splitAffected)).append("\n");
    sb.append("    unitFactor: ").append(toIndentedString(unitFactor)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
