/*
 * Natural Language Processing API
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.NaturalLanguageProcessing.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.NaturalLanguageProcessing.models.ThemeSentiment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.NaturalLanguageProcessing.JSON;


/**
 * Schema that envelopes the &#x60;ThemeSentiment&#x60; and include additional &#x60;meta&#x60; (if available).
 */
@ApiModel(description = "Schema that envelopes the `ThemeSentiment` and include additional `meta` (if available).")
@JsonPropertyOrder({
  ThemeSentimentsRoot.JSON_PROPERTY_DATA,
  ThemeSentimentsRoot.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ThemeSentimentsRoot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<ThemeSentiment> data = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private Object meta;

  public ThemeSentimentsRoot() { 
  }

  @JsonCreator
  public ThemeSentimentsRoot(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.List<ThemeSentiment> data
  ) {
    this();
    this.data = data;
  }

  public ThemeSentimentsRoot data(java.util.List<ThemeSentiment> data) {
    this.data = data;
    return this;
  }

  public ThemeSentimentsRoot addDataItem(ThemeSentiment dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of themes and their respective sentiments
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of themes and their respective sentiments")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<ThemeSentiment> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.List<ThemeSentiment> data) {
    this.data = data;
  }


  public ThemeSentimentsRoot meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Any associated metadata
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Any associated metadata")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(Object meta) {
    this.meta = meta;
  }


  /**
   * Return true if this ThemeSentimentsRoot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThemeSentimentsRoot themeSentimentsRoot = (ThemeSentimentsRoot) o;
    return Objects.equals(this.data, themeSentimentsRoot.data) &&
        Objects.equals(this.meta, themeSentimentsRoot.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThemeSentimentsRoot {\n");
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

