/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ETFProfileandPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20020Data;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200Meta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * InlineResponse20020
 */
@JsonPropertyOrder({
  InlineResponse20020.JSON_PROPERTY_DATA,
  InlineResponse20020.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20020 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.Set<InlineResponse20020Data> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private InlineResponse200Meta meta;

  public InlineResponse20020() { 
  }

  public InlineResponse20020 data(java.util.Set<InlineResponse20020Data> data) {
    this.data = data;
    return this;
  }

  public InlineResponse20020 addDataItem(InlineResponse20020Data dataItem) {
    if (this.data == null) {
      this.data = new java.util.LinkedHashSet<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Competitor&#39;s data.
   * @return data
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Competitor's data.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<InlineResponse20020Data> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.Set<InlineResponse20020Data> data) {
    this.data = data;
  }


  public InlineResponse20020 meta(InlineResponse200Meta meta) {
    this.meta = meta;
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

  public InlineResponse200Meta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(InlineResponse200Meta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this inline_response_200_20 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020 inlineResponse20020 = (InlineResponse20020) o;
    return Objects.equals(this.data, inlineResponse20020.data) &&
        Objects.equals(this.meta, inlineResponse20020.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020 {\n");
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

