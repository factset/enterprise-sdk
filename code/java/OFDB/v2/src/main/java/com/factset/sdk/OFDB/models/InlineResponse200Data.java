/*
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OFDB.models;

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
import com.factset.sdk.OFDB.JSON;


/**
 * InlineResponse200Data
 */
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_MODIFICATION_TIMES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MODIFICATION_TIMES = "modificationTimes";
  private java.util.List<String> modificationTimes = null;

  public InlineResponse200Data() { 
  }

  public InlineResponse200Data modificationTimes(java.util.List<String> modificationTimes) {
    this.modificationTimes = modificationTimes;
    return this;
  }

  public InlineResponse200Data addModificationTimesItem(String modificationTimesItem) {
    if (this.modificationTimes == null) {
      this.modificationTimes = new java.util.ArrayList<>();
    }
    this.modificationTimes.add(modificationTimesItem);
    return this;
  }

   /**
   * Get modificationTimes
   * @return modificationTimes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getModificationTimes() {
    return modificationTimes;
  }


  @JsonProperty(JSON_PROPERTY_MODIFICATION_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationTimes(java.util.List<String> modificationTimes) {
    this.modificationTimes = modificationTimes;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.modificationTimes, inlineResponse200Data.modificationTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modificationTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    modificationTimes: ").append(toIndentedString(modificationTimes)).append("\n");
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

