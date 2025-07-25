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
import com.factset.sdk.Vermilion.models.EntityDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Vermilion.JSON;


/**
 * A DataSource object aggregates data from multiple providers, such as APIs, databases, or file systems, to simplify access and processing.
 */
@ApiModel(description = "A DataSource object aggregates data from multiple providers, such as APIs, databases, or file systems, to simplify access and processing.")
@JsonPropertyOrder({
  DataSourceDTO.JSON_PROPERTY_DATA_SOURCE_ID,
  DataSourceDTO.JSON_PROPERTY_NAME,
  DataSourceDTO.JSON_PROPERTY_CODE,
  DataSourceDTO.JSON_PROPERTY_DS_TYPE,
  DataSourceDTO.JSON_PROPERTY_ENTITIES,
  DataSourceDTO.JSON_PROPERTY_OUTPUT_RECORD_SET,
  DataSourceDTO.JSON_PROPERTY_RELEASE_TAG,
  DataSourceDTO.JSON_PROPERTY_DEFAULT_DATA_SOURCE_NAME,
  DataSourceDTO.JSON_PROPERTY_DATA_PREVIEW,
  DataSourceDTO.JSON_PROPERTY_LAST_UPDATED_BY,
  DataSourceDTO.JSON_PROPERTY_LAST_UPDATED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DataSourceDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA_SOURCE_ID = "dataSourceId";
  private Integer dataSourceId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  /**
   * Type of the Data Source.
   */
  public enum DsTypeEnum {
    AUTOMATIC("AUTOMATIC"),
    
    MANUAL("MANUAL"),
    
    FILTER("FILTER");

    private String value;

    DsTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DsTypeEnum fromValue(String value) {
      for (DsTypeEnum b : DsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DS_TYPE = "dsType";
  private DsTypeEnum dsType;

  public static final String JSON_PROPERTY_ENTITIES = "entities";
  private java.util.List<EntityDTO> entities = null;

  public static final String JSON_PROPERTY_OUTPUT_RECORD_SET = "outputRecordSet";
  private String outputRecordSet;

  public static final String JSON_PROPERTY_RELEASE_TAG = "releaseTag";
  private String releaseTag;

  public static final String JSON_PROPERTY_DEFAULT_DATA_SOURCE_NAME = "defaultDataSourceName";
  private String defaultDataSourceName;

  public static final String JSON_PROPERTY_DATA_PREVIEW = "dataPreview";
  private String dataPreview;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";
  private BigDecimal lastUpdated;

  public DataSourceDTO() { 
  }

  public DataSourceDTO dataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * Unique Identifier for the Data Source.
   * @return dataSourceId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique Identifier for the Data Source.")
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDataSourceId() {
    return dataSourceId;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public DataSourceDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Data Source.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the Data Source.")
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


  public DataSourceDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of the Data Source.
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Code of the Data Source.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public DataSourceDTO dsType(DsTypeEnum dsType) {
    this.dsType = dsType;
    return this;
  }

   /**
   * Type of the Data Source.
   * @return dsType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type of the Data Source.")
  @JsonProperty(JSON_PROPERTY_DS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DsTypeEnum getDsType() {
    return dsType;
  }


  @JsonProperty(JSON_PROPERTY_DS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDsType(DsTypeEnum dsType) {
    this.dsType = dsType;
  }


  public DataSourceDTO entities(java.util.List<EntityDTO> entities) {
    this.entities = entities;
    return this;
  }

  public DataSourceDTO addEntitiesItem(EntityDTO entitiesItem) {
    if (this.entities == null) {
      this.entities = new java.util.ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * An array of entities that are used in the Data Source.
   * @return entities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An array of entities that are used in the Data Source.")
  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<EntityDTO> getEntities() {
    return entities;
  }


  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntities(java.util.List<EntityDTO> entities) {
    this.entities = entities;
  }


  public DataSourceDTO outputRecordSet(String outputRecordSet) {
    this.outputRecordSet = outputRecordSet;
    return this;
  }

   /**
   * Recordset name that is used for output in the Data Source.
   * @return outputRecordSet
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Recordset name that is used for output in the Data Source.")
  @JsonProperty(JSON_PROPERTY_OUTPUT_RECORD_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutputRecordSet() {
    return outputRecordSet;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_RECORD_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputRecordSet(String outputRecordSet) {
    this.outputRecordSet = outputRecordSet;
  }


  public DataSourceDTO releaseTag(String releaseTag) {
    this.releaseTag = releaseTag;
    return this;
  }

   /**
   * Release tag associated with the Data Source.
   * @return releaseTag
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Release tag associated with the Data Source.")
  @JsonProperty(JSON_PROPERTY_RELEASE_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReleaseTag() {
    return releaseTag;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseTag(String releaseTag) {
    this.releaseTag = releaseTag;
  }


  public DataSourceDTO defaultDataSourceName(String defaultDataSourceName) {
    this.defaultDataSourceName = defaultDataSourceName;
    return this;
  }

   /**
   * Name of the default Data Source.
   * @return defaultDataSourceName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the default Data Source.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_DATA_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultDataSourceName() {
    return defaultDataSourceName;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_DATA_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultDataSourceName(String defaultDataSourceName) {
    this.defaultDataSourceName = defaultDataSourceName;
  }


  public DataSourceDTO dataPreview(String dataPreview) {
    this.dataPreview = dataPreview;
    return this;
  }

   /**
   * Name of the component/report used for Data Source preview.
   * @return dataPreview
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the component/report used for Data Source preview.")
  @JsonProperty(JSON_PROPERTY_DATA_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataPreview() {
    return dataPreview;
  }


  @JsonProperty(JSON_PROPERTY_DATA_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataPreview(String dataPreview) {
    this.dataPreview = dataPreview;
  }


  public DataSourceDTO lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Indicates the username of the person who last updated the Data Source.
   * @return lastUpdatedBy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates the username of the person who last updated the Data Source.")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  public DataSourceDTO lastUpdated(BigDecimal lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp of the most recent update in epoch format of the Data Source
   * @return lastUpdated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the most recent update in epoch format of the Data Source")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdated(BigDecimal lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  /**
   * Return true if this DataSourceDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceDTO dataSourceDTO = (DataSourceDTO) o;
    return Objects.equals(this.dataSourceId, dataSourceDTO.dataSourceId) &&
        Objects.equals(this.name, dataSourceDTO.name) &&
        Objects.equals(this.code, dataSourceDTO.code) &&
        Objects.equals(this.dsType, dataSourceDTO.dsType) &&
        Objects.equals(this.entities, dataSourceDTO.entities) &&
        Objects.equals(this.outputRecordSet, dataSourceDTO.outputRecordSet) &&
        Objects.equals(this.releaseTag, dataSourceDTO.releaseTag) &&
        Objects.equals(this.defaultDataSourceName, dataSourceDTO.defaultDataSourceName) &&
        Objects.equals(this.dataPreview, dataSourceDTO.dataPreview) &&
        Objects.equals(this.lastUpdatedBy, dataSourceDTO.lastUpdatedBy) &&
        Objects.equals(this.lastUpdated, dataSourceDTO.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, name, code, dsType, entities, outputRecordSet, releaseTag, defaultDataSourceName, dataPreview, lastUpdatedBy, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceDTO {\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dsType: ").append(toIndentedString(dsType)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    outputRecordSet: ").append(toIndentedString(outputRecordSet)).append("\n");
    sb.append("    releaseTag: ").append(toIndentedString(releaseTag)).append("\n");
    sb.append("    defaultDataSourceName: ").append(toIndentedString(defaultDataSourceName)).append("\n");
    sb.append("    dataPreview: ").append(toIndentedString(dataPreview)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

