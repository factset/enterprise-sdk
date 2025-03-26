/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ProcuretoPayAPISCIM.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ProcuretoPayAPISCIM.models.Schema;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;


/**
 * SchemaList
 */
@JsonPropertyOrder({
  SchemaList.JSON_PROPERTY_SCHEMAS,
  SchemaList.JSON_PROPERTY_TOTAL_RESULTS,
  SchemaList.JSON_PROPERTY_RESOURCES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SchemaList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private java.util.List<String> schemas = null;

  public static final String JSON_PROPERTY_TOTAL_RESULTS = "totalResults";
  private Integer totalResults;

  public static final String JSON_PROPERTY_RESOURCES = "Resources";
  private java.util.List<Schema> resources = null;

  public SchemaList() { 
  }

  public SchemaList schemas(java.util.List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public SchemaList addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new java.util.ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"urn:ietf:params:scim:api:messages:2.0:ListResponse\"]", value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSchemas() {
    return schemas;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemas(java.util.List<String> schemas) {
    this.schemas = schemas;
  }


  public SchemaList totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalResults() {
    return totalResults;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  public SchemaList resources(java.util.List<Schema> resources) {
    this.resources = resources;
    return this;
  }

  public SchemaList addResourcesItem(Schema resourcesItem) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Schema> getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(java.util.List<Schema> resources) {
    this.resources = resources;
  }


  /**
   * Return true if this SchemaList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaList schemaList = (SchemaList) o;
    return Objects.equals(this.schemas, schemaList.schemas) &&
        Objects.equals(this.totalResults, schemaList.totalResults) &&
        Objects.equals(this.resources, schemaList.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, totalResults, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaList {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

