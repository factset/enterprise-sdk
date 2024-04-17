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
import com.factset.sdk.Vermilion.models.ScimGroupPatchOperation;
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
 * ScimGroupPatchRequestBody
 */
@JsonPropertyOrder({
  ScimGroupPatchRequestBody.JSON_PROPERTY_SCHEMAS,
  ScimGroupPatchRequestBody.JSON_PROPERTY_OPERATIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScimGroupPatchRequestBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private java.util.List<String> schemas = null;

  public static final String JSON_PROPERTY_OPERATIONS = "Operations";
  private java.util.List<ScimGroupPatchOperation> operations = null;

  public ScimGroupPatchRequestBody() { 
  }

  public ScimGroupPatchRequestBody schemas(java.util.List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public ScimGroupPatchRequestBody addSchemasItem(String schemasItem) {
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
  @ApiModelProperty(value = "")
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


  public ScimGroupPatchRequestBody operations(java.util.List<ScimGroupPatchOperation> operations) {
    this.operations = operations;
    return this;
  }

  public ScimGroupPatchRequestBody addOperationsItem(ScimGroupPatchOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new java.util.ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ScimGroupPatchOperation> getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperations(java.util.List<ScimGroupPatchOperation> operations) {
    this.operations = operations;
  }


  /**
   * Return true if this ScimGroupPatchRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroupPatchRequestBody scimGroupPatchRequestBody = (ScimGroupPatchRequestBody) o;
    return Objects.equals(this.schemas, scimGroupPatchRequestBody.schemas) &&
        Objects.equals(this.operations, scimGroupPatchRequestBody.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroupPatchRequestBody {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

