/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.ErrorItem;
import com.factset.sdk.OpenRisk.models.StatCalculationLevel;
import com.factset.sdk.OpenRisk.models.StatCalculationSettings;
import com.factset.sdk.OpenRisk.models.StatResultValue;
import com.factset.sdk.OpenRisk.models.SuccessResponseMeta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * InlineResponse2003
 */
@JsonPropertyOrder({
  InlineResponse2003.JSON_PROPERTY_META,
  InlineResponse2003.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2003 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_META = "meta";
  private SuccessResponseMeta meta;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<Object> data = new java.util.ArrayList<>();

  public InlineResponse2003() { 
  }

  @JsonCreator
  public InlineResponse2003(
    @JsonProperty(value=JSON_PROPERTY_META, required=true) SuccessResponseMeta meta, 
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.List<Object> data
  ) {
    this();
    this.meta = meta;
    this.data = data;
  }

  public InlineResponse2003 meta(SuccessResponseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SuccessResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(SuccessResponseMeta meta) {
    this.meta = meta;
  }


  public InlineResponse2003 data(java.util.List<Object> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2003 addDataItem(Object dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Calculation results aligned to the input list of requested risk statistics
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculation results aligned to the input list of requested risk statistics")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<Object> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.List<Object> data) {
    this.data = data;
  }


  /**
   * Return true if this inline_response_200_3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.meta, inlineResponse2003.meta) &&
        Objects.equals(this.data, inlineResponse2003.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

