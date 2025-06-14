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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Vermilion.JSON;


/**
 * Defines the details of the Report definition.
 */
@ApiModel(description = "Defines the details of the Report definition.")
@JsonPropertyOrder({
  ReportDefinitionDTO.JSON_PROPERTY_NAME,
  ReportDefinitionDTO.JSON_PROPERTY_CODE,
  ReportDefinitionDTO.JSON_PROPERTY_RELEASE_TAG,
  ReportDefinitionDTO.JSON_PROPERTY_ENTITIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReportDefinitionDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_RELEASE_TAG = "releaseTag";
  private String releaseTag;

  public static final String JSON_PROPERTY_ENTITIES = "entities";
  private java.util.List<EntityDTO> entities = null;

  public ReportDefinitionDTO() { 
  }

  public ReportDefinitionDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Report definition.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the Report definition.")
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


  public ReportDefinitionDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of the Report definition.
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Code of the Report definition.")
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


  public ReportDefinitionDTO releaseTag(String releaseTag) {
    this.releaseTag = releaseTag;
    return this;
  }

   /**
   * Release tag associated with the Report definition.
   * @return releaseTag
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Release tag associated with the Report definition.")
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


  public ReportDefinitionDTO entities(java.util.List<EntityDTO> entities) {
    this.entities = entities;
    return this;
  }

  public ReportDefinitionDTO addEntitiesItem(EntityDTO entitiesItem) {
    if (this.entities == null) {
      this.entities = new java.util.ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * A list of entities associated with the Report definition.
   * @return entities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A list of entities associated with the Report definition.")
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


  /**
   * Return true if this ReportDefinitionDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionDTO reportDefinitionDTO = (ReportDefinitionDTO) o;
    return Objects.equals(this.name, reportDefinitionDTO.name) &&
        Objects.equals(this.code, reportDefinitionDTO.code) &&
        Objects.equals(this.releaseTag, reportDefinitionDTO.releaseTag) &&
        Objects.equals(this.entities, reportDefinitionDTO.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, releaseTag, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    releaseTag: ").append(toIndentedString(releaseTag)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

