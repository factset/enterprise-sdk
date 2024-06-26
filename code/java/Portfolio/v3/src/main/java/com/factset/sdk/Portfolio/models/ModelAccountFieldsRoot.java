/*
 * ModelAccounts API
 * Allow clients to fetch ModelAccounts Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Portfolio.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Portfolio.models.ModelAccountFields;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Portfolio.JSON;


/**
 * ModelAccountFieldsRoot
 */
@JsonPropertyOrder({
  ModelAccountFieldsRoot.JSON_PROPERTY_DATA,
  ModelAccountFieldsRoot.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ModelAccountFieldsRoot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private ModelAccountFields data;

  public static final String JSON_PROPERTY_META = "meta";
  private java.util.Map<String, String> meta = null;

  public ModelAccountFieldsRoot() { 
  }

  @JsonCreator
  public ModelAccountFieldsRoot(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) ModelAccountFields data
  ) {
    this();
    this.data = data;
  }

  public ModelAccountFieldsRoot data(ModelAccountFields data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ModelAccountFields getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(ModelAccountFields data) {
    this.data = data;
  }


  public ModelAccountFieldsRoot meta(java.util.Map<String, String> meta) {
    this.meta = meta;
    return this;
  }

  public ModelAccountFieldsRoot putMetaItem(String key, String metaItem) {
    if (this.meta == null) {
      this.meta = new java.util.HashMap<>();
    }
    this.meta.put(key, metaItem);
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

  public java.util.Map<String, String> getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(java.util.Map<String, String> meta) {
    this.meta = meta;
  }


  /**
   * Return true if this ModelAccountFieldsRoot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAccountFieldsRoot modelAccountFieldsRoot = (ModelAccountFieldsRoot) o;
    return Objects.equals(this.data, modelAccountFieldsRoot.data) &&
        Objects.equals(this.meta, modelAccountFieldsRoot.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAccountFieldsRoot {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

