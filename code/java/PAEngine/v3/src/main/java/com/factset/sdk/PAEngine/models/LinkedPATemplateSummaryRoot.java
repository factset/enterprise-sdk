/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.PAEngine.models.LinkedPATemplateSummary;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PAEngine.JSON;


/**
 * LinkedPATemplateSummaryRoot
 */
@JsonPropertyOrder({
  LinkedPATemplateSummaryRoot.JSON_PROPERTY_DATA,
  LinkedPATemplateSummaryRoot.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LinkedPATemplateSummaryRoot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.Map<String, LinkedPATemplateSummary> data = new java.util.HashMap<>();

  public static final String JSON_PROPERTY_META = "meta";
  private JsonNullable<Object> meta = JsonNullable.<Object>of(null);

  public LinkedPATemplateSummaryRoot() { 
  }

  @JsonCreator
  public LinkedPATemplateSummaryRoot(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.Map<String, LinkedPATemplateSummary> data
  ) {
    this();
    this.data = data;
  }

  public LinkedPATemplateSummaryRoot data(java.util.Map<String, LinkedPATemplateSummary> data) {
    this.data = data;
    return this;
  }

  public LinkedPATemplateSummaryRoot putDataItem(String key, LinkedPATemplateSummary dataItem) {
    this.data.put(key, dataItem);
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

  public java.util.Map<String, LinkedPATemplateSummary> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.Map<String, LinkedPATemplateSummary> data) {
    this.data = data;
  }


  public LinkedPATemplateSummaryRoot meta(Object meta) {
    this.meta = JsonNullable.<Object>of(meta);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Object getMeta() {
        return meta.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMeta_JsonNullable() {
    return meta;
  }
  
  @JsonProperty(JSON_PROPERTY_META)
  public void setMeta_JsonNullable(JsonNullable<Object> meta) {
    this.meta = meta;
  }

  public void setMeta(Object meta) {
    this.meta = JsonNullable.<Object>of(meta);
  }


  /**
   * Return true if this LinkedPATemplateSummaryRoot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedPATemplateSummaryRoot linkedPATemplateSummaryRoot = (LinkedPATemplateSummaryRoot) o;
    return Objects.equals(this.data, linkedPATemplateSummaryRoot.data) &&
        equalsNullable(this.meta, linkedPATemplateSummaryRoot.meta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, hashCodeNullable(meta));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedPATemplateSummaryRoot {\n");
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

