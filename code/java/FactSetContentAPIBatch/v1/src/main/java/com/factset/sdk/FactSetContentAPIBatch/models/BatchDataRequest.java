/*
 * FactSet Batch API Service
 * FactSet Content APIs - Batching Endpoint
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetContentAPIBatch.models;

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
import com.factset.sdk.FactSetContentAPIBatch.JSON;


/**
 * BatchDataRequest
 */
@JsonPropertyOrder({
  BatchDataRequest.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BatchDataRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public BatchDataRequest() { 
  }

  @JsonCreator
  public BatchDataRequest(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) java.util.UUID id
  ) {
    this();
    this.id = id;
  }

  public BatchDataRequest id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Batch Request identifier.
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c", required = true, value = "Batch Request identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  /**
   * Return true if this BatchDataRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDataRequest batchDataRequest = (BatchDataRequest) o;
    return Objects.equals(this.id, batchDataRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDataRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

